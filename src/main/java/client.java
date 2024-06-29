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
public class client extends class38 {

    @OriginalMember(owner = "client!client", name = "M", descriptor = "LRGCGKKUR;")
    private class53 field83 = class53.method443(7, 1);

    @OriginalMember(owner = "client!client", name = "N", descriptor = "[B")
    private byte[] field84 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    private int field90 = -1;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
    private int[] field91 = new int[50];

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Z")
    private boolean field92 = false;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Z")
    private boolean field93 = false;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    private int field94 = -1;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "B")
    private byte field95 = 5;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
    private int[] field96 = new int[5];

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
    private boolean field97 = false;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
    private int[] field98 = new int[151];

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    private int field102 = 50;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
    private int[] field103 = new int[this.field102];

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
    private int[] field104 = new int[this.field102];

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    private int[] field105 = new int[this.field102];

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
    private int[] field106 = new int[this.field102];

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
    private int[] field107 = new int[this.field102];

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
    private int[] field108 = new int[this.field102];

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    private int[] field109 = new int[this.field102];

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[Ljava/lang/String;")
    private String[] field110 = new String[this.field102];

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    private boolean field111 = true;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[LWGRALUSQ;")
    private class66[] field113 = new class66[13];

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
    private int[] field114 = new int[2000];

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    private int field115 = 2048;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field116 = 2047;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[LIGCQCHAY;")
    private class20[] field117 = new class20[this.field115];

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
    public int[] field119 = new int[this.field115];

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
    private int[] field121 = new int[this.field115];

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "[LRGCGKKUR;")
    private class53[] field122 = new class53[this.field115];

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "[J")
    private long[] field123 = new long[100];

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field126 = 1;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    private int field129 = 19817;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
    private int field130 = -124;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "Z")
    private boolean field131 = false;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    private int field133 = 672;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "Z")
    private boolean field134 = false;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int field135 = 793;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
    private boolean field136 = true;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
    private int[] field137 = new int[33];

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "[I")
    private int[] field139 = new int[200];

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "Z")
    private boolean field140 = false;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "LRGCGKKUR;")
    private class53 field142 = new class53(new byte[5000], (byte) -17);

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "[LNVHCJIOR;")
    private class42[] field143 = new class42[16384];

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
    public int[] field145 = new int[16384];

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field146 = 229;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "[LZSWNSCUQ;")
    private class72[] field156 = new class72[8];

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
    private int field159 = 639;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
    private boolean field160 = true;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "[I")
    public int[] field162 = new int[1000];

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "B")
    private byte field168 = -111;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
    private boolean field170 = true;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    private int field171 = 128;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
    private boolean field176 = false;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private int field178 = -1;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private int field179 = -1;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "Z")
    private boolean field184 = true;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
    private int[] field185 = new int[5];

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "[[I")
    private int[][] field186 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
    public int[] field187 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "[LZSWNSCUQ;")
    private class72[] field190 = new class72[32];

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
    private int[] field191 = new int[5];

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "[[[LCEEJCAVA;")
    private class5[][][] field194 = new class5[4][104][104];

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field195 = -1;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "Z")
    public boolean field196 = false;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "B")
    private byte field201 = 7;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "Ljava/lang/String;")
    private String field202 = "";

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
    private boolean field203 = false;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "[LASFXKKJM;")
    private class3[] field208 = new class3[4];

    @OriginalMember(owner = "client!client", name = "id", descriptor = "[Ljava/lang/String;")
    private String[] field209 = new String[500];

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "Z")
    private boolean field210 = false;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
    private int field211 = 612;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int field218 = 7759444;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field221 = 951;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "[Ljava/lang/String;")
    private String[] field224 = new String[5];

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "[Z")
    private boolean[] field225 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "B")
    private byte field227 = 4;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "[[I")
    private int[][] field232 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
    private boolean field237 = false;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "LCEEJCAVA;")
    private class5 field238 = new class5(-7255);

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "Ljava/lang/String;")
    private String field240 = "";

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "[Ljava/lang/String;")
    private String[] field242 = new String[100];

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
    private int[] field243 = new int[100];

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "Z")
    private boolean field245 = false;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field248 = -26728;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int field254 = -1;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "Ljava/lang/String;")
    private String field256 = "";

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
    private volatile boolean field259 = false;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "I")
    private int field260 = -712;

    @OriginalMember(owner = "client!client", name = "je", descriptor = "[Z")
    private boolean[] field262 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private int field263 = -1;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "[I")
    private int[] field265 = new int[33];

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
    private boolean field266 = false;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "Ljava/lang/String;")
    private String field267 = "";

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
    private int[] field268 = new int[class58.field1578];

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
    private boolean field279 = false;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private int field287 = -1;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field293 = 2;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "[J")
    private long[] field294 = new long[200];

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
    private int[] field296 = new int[151];

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field298 = 3353893;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field302 = 987;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "B")
    private byte field303 = 2;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "[[[I")
    private int[][][] field305 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "[LHOAULYFF;")
    public class18[] field306 = new class18[5];

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
    private boolean field307 = false;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
    private int[] field309 = new int[1000];

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "[I")
    private int[] field310 = new int[1000];

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
    private int[] field324 = new int[50];

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
    private int field327 = 23894;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
    private boolean field328 = false;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field329 = 408;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "[LZSWNSCUQ;")
    private class72[] field330 = new class72[32];

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
    private int[] field331 = new int[5];

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/lang/String;")
    private String field334 = "";

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "Ljava/lang/String;")
    private String field335 = "";

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field338 = 2;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
    private int field339 = 17532;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "[I")
    private int[] field340 = new int[class58.field1578];

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "[[I")
    private int[][] field345 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "Z")
    private boolean field346 = false;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
    private boolean field349 = false;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field350 = -1;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
    private int[] field354 = new int[class58.field1578];

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field357 = -1;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
    private final int[] field358 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
    private int[] field361 = new int[7];

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private int field362 = 78;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "[LZSWNSCUQ;")
    private class72[] field363 = new class72[100];

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
    private int[] field364 = new int[500];

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "[I")
    private int[] field365 = new int[500];

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
    private int[] field366 = new int[500];

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
    private int[] field367 = new int[500];

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "Ljava/lang/String;")
    private String field369 = "";

    @OriginalMember(owner = "client!client", name = "og", descriptor = "[LWGRALUSQ;")
    private class66[] field370 = new class66[2];

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
    private int field371 = 2301979;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
    private int field373 = -1;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "[LZSWNSCUQ;")
    private class72[] field374 = new class72[32];

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
    private boolean field376 = false;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
    private boolean field392 = false;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "Ljava/lang/String;")
    private String field396 = "";

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field397 = -135;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "Z")
    private boolean field400 = false;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "LRGCGKKUR;")
    private class53 field402 = class53.method443(7, 1);

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
    private int field404 = -1;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field405 = -1;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
    private volatile boolean field406 = false;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
    private boolean field407 = false;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "B")
    private byte field409 = 2;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "Ljava/lang/String;")
    private String field421 = "";

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "Ljava/lang/String;")
    private String field422 = "";

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "LQUBPQDMQ;")
    private class51 field425 = new class51();

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "B")
    private byte field426 = 9;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
    private int[] field427 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private int field431 = 18;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "Z")
    private boolean field432 = false;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
    private int field433 = 8;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
    private int[] field436 = new int[100];

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "[Ljava/lang/String;")
    private String[] field437 = new String[100];

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "[Ljava/lang/String;")
    private String[] field438 = new String[100];

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "B")
    private byte field441 = 28;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "Z")
    private boolean field442 = false;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
    private int[] field443 = new int[50];

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
    private boolean field446 = false;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "[LZSWNSCUQ;")
    private class72[] field448 = new class72[20];

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
    private int[] field450 = new int[256];

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int field452 = -1;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field458 = new CRC32();

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "[Ljava/lang/String;")
    private String[] field460 = new String[200];

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
    private int[] field466 = new int[4000];

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "[I")
    private int[] field467 = new int[4000];

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "Z")
    private boolean field472 = false;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field473 = 58;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "B")
    private byte field475 = 7;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field477 = 22761;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field479 = 2;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
    private int field482 = 5063219;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "B")
    private byte field487 = 87;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
    public int[] field506 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field510 = -43;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
    private int field512 = -1109;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
    private int field514 = 1;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field518 = 374;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field526 = -1;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private final int field528 = 100;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
    private int[] field529 = new int[100];

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
    private boolean field530 = true;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "Z")
    public boolean field531 = true;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "LRGCGKKUR;")
    private class53 field532 = class53.method443(7, 1);

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
    private int field533 = 3;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "B")
    private byte field535 = 4;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "Z")
    private boolean field537 = false;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "B")
    private byte field538 = 0;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
    private boolean field539 = false;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "[LWGRALUSQ;")
    private class66[] field545 = new class66[100];

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "Z")
    private volatile boolean field547 = false;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "LCEEJCAVA;")
    private class5 field549 = new class5(-7255);

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field550 = -1;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
    private int[] field552 = new int[5];

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "[I")
    private int[] field553 = new int[9];

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "LCEEJCAVA;")
    private class5 field555 = new class5(-7255);

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "[LZSWNSCUQ;")
    private class72[] field556 = new class72[1000];

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
    private boolean field563 = false;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "Z")
    private boolean field565 = true;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "B")
    private byte field566 = 60;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
    private int[] field571 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
    public static int[] field124 = new int[32];

    @OriginalMember(owner = "client!client", name = "le", descriptor = "[[I")
    public static final int[][] field264;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private static int field288;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "Z")
    private static boolean field290;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
    private static int field325;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field356;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "[I")
    private static int[] field449;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private static int field461;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "Ljava/lang/String;")
    private static String field468;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field511;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private static int field519;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "[I")
    public static final int[] field564;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    private static int field128;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private static int field138;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private static int field175;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private static int field246;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
    private static int field408;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
    private static int field415;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    private static int field430;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
    private static int field451;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private static int field465;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
    private static int field480;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
    private static int field520;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
    private static int field534;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
    private static int field572;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!client", name = "ok", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!client", name = "pk", descriptor = "I")
    private static int field579;

    @OriginalMember(owner = "client!client", name = "qk", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client!client", name = "rk", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    private static int field82;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    private static int field99;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "J")
    private long field220;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "J")
    private long field295;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "J")
    private long field353;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "J")
    public long field429;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "J")
    private long field85;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "LESUFCMYV;")
    private class11 field321;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "LHVBGFDBD;")
    private class19 field311;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "LHVBGFDBD;")
    private class19 field312;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "LHVBGFDBD;")
    private class19 field313;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "LHVBGFDBD;")
    private class19 field314;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "LHVBGFDBD;")
    private class19 field315;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "LHVBGFDBD;")
    private class19 field316;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "LHVBGFDBD;")
    private class19 field317;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "LHVBGFDBD;")
    private class19 field318;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "LHVBGFDBD;")
    private class19 field319;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "LHVBGFDBD;")
    private class19 field484;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "LHVBGFDBD;")
    private class19 field485;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "LHVBGFDBD;")
    private class19 field486;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "LHVBGFDBD;")
    private class19 field488;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "LHVBGFDBD;")
    private class19 field489;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "LHVBGFDBD;")
    private class19 field490;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "LHVBGFDBD;")
    private class19 field491;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "LHVBGFDBD;")
    private class19 field492;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "LHVBGFDBD;")
    private class19 field493;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "LHVBGFDBD;")
    private class19 field494;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "LHVBGFDBD;")
    private class19 field495;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "LHVBGFDBD;")
    private class19 field496;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "LHVBGFDBD;")
    private class19 field86;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "LHVBGFDBD;")
    private class19 field87;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "LHVBGFDBD;")
    private class19 field88;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "LHVBGFDBD;")
    private class19 field89;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "LIGCQCHAY;")
    public static class20 field219;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "LJLGPBSNA;")
    private class24 field551;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "LMGTPXZHY;")
    private class33 field341;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "LMGTPXZHY;")
    private class33 field342;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "LMGTPXZHY;")
    private class33 field343;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "LMGTPXZHY;")
    private class33 field344;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "LNTGEPOMK;")
    private class41 field517;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "LOUUKQIMK;")
    private class45 field112;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "LTHBLNINF;")
    private class59 field348;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "LWGRALUSQ;")
    private class66 field197;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "LWGRALUSQ;")
    private class66 field198;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "LWGRALUSQ;")
    private class66 field199;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "LWGRALUSQ;")
    private class66 field216;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "LWGRALUSQ;")
    private class66 field217;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "LWGRALUSQ;")
    private class66 field228;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "LWGRALUSQ;")
    private class66 field229;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "LWGRALUSQ;")
    private class66 field230;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "LWGRALUSQ;")
    private class66 field382;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "LWGRALUSQ;")
    private class66 field383;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "LWGRALUSQ;")
    private class66 field384;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "LWGRALUSQ;")
    private class66 field385;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "LWGRALUSQ;")
    private class66 field386;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "LWGRALUSQ;")
    private class66 field389;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "LWGRALUSQ;")
    private class66 field390;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "LWGRALUSQ;")
    private class66 field521;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "LWGRALUSQ;")
    private class66 field522;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "LWGRALUSQ;")
    private class66 field523;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "LWGRALUSQ;")
    private class66 field524;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "LWGRALUSQ;")
    private class66 field525;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "LZSWNSCUQ;")
    private class72 field157;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "LZSWNSCUQ;")
    private class72 field158;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "LZSWNSCUQ;")
    private class72 field169;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "LZSWNSCUQ;")
    private class72 field269;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "LZSWNSCUQ;")
    private class72 field280;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "LZSWNSCUQ;")
    private class72 field281;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "LZSWNSCUQ;")
    private class72 field282;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "LZSWNSCUQ;")
    private class72 field283;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "LZSWNSCUQ;")
    private class72 field284;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "LZSWNSCUQ;")
    private class72 field401;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "LZSWNSCUQ;")
    private class72 field464;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "LZSWNSCUQ;")
    private class72 field508;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "LZSWNSCUQ;")
    private class72 field509;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "LZSWNSCUQ;")
    private class72 field515;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "LZSWNSCUQ;")
    private class72 field516;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "LEKUSXTUB;")
    public class9 field395;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "Ljava/lang/String;")
    public String field153;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "Ljava/lang/String;")
    private String field375;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "Ljava/lang/String;")
    private String field445;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "Ljava/lang/String;")
    public String field570;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "Ljava/net/Socket;")
    private Socket field359;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "Z")
    public static boolean field132;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
    private static boolean field189;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "Z")
    private static boolean field291;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
    public static boolean field474;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
    private int[] field154;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
    private int[] field155;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
    private int[] field180;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
    private int[] field181;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
    private int[] field182;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
    private int[] field250;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
    private int[] field251;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
    private int[] field252;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
    private int[] field253;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
    private int[] field271;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
    private int[] field272;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
    private int[] field559;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
    private int[] field560;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "[I")
    private int[] field561;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
    private int[] field562;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "[LWGRALUSQ;")
    private class66[] field504;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "[[B")
    private byte[][] field411;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "[[B")
    private byte[][] field483;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "[[[B")
    private byte[][][] field320;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "[[[I")
    private int[][][] field423;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method38(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1079 != null) {
                    return new URL("http://127.0.0.1:" + (field289 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void method39(byte arg0, int arg1) {
        if (arg0 == 6) {
            class51.method436((byte) 6, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILRGCGKKUR;I)V")
    private final void method40(int arg0, class53 arg1, int arg2) {
        while (true) {
            if (arg1.field1540 + 10 < arg2 * 8) {
                int var4 = arg1.method466(11, true);
                if (var4 != 2047) {
                    if (this.field117[var4] == null) {
                        this.field117[var4] = new class20();
                        if (this.field122[var4] != null) {
                            this.field117[var4].method226(false, this.field122[var4]);
                        }
                    }
                    this.field119[this.field118++] = var4;
                    class20 var5 = this.field117[var4];
                    var5.field1410 = field247;
                    int var6 = arg1.method466(5, true);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method466(1, true);
                    if (var7 == 1) {
                        this.field121[this.field120++] = var4;
                    }
                    int var8 = arg1.method466(1, true);
                    int var9 = arg1.method466(5, true);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method419(field219.field1391[0] + var6, -9787, field219.field1392[0] + var9, var8 == 1);
                    continue;
                }
            }
            arg1.method467(1);
            if (arg0 <= 0) {
                this.field532.method445(200);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILRGCGKKUR;Z)V")
    private final void method41(int arg0, class53 arg1, boolean arg2) {
        arg1.method465(this.field221);
        int var4 = arg1.method466(8, true);
        if (arg2) {
            this.field417 = arg1.method455();
        }
        if (var4 < this.field144) {
            for (int var5 = var4; var5 < this.field144; ++var5) {
                this.field162[this.field161++] = this.field145[var5];
            }
        }
        if (var4 > this.field144) {
            signlink.reporterror(this.field421 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field144 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field145[var6];
                class42 var8 = this.field143[var7];
                int var9 = arg1.method466(1, true);
                if (var9 == 0) {
                    this.field145[this.field144++] = var7;
                    var8.field1410 = field247;
                } else {
                    int var10 = arg1.method466(2, true);
                    if (var10 == 0) {
                        this.field145[this.field144++] = var7;
                        var8.field1410 = field247;
                        this.field121[this.field120++] = var7;
                    } else if (var10 == 1) {
                        this.field145[this.field144++] = var7;
                        var8.field1410 = field247;
                        int var11 = arg1.method466(3, true);
                        var8.method420(var11, false, this.field339);
                        int var12 = arg1.method466(1, true);
                        if (var12 == 1) {
                            this.field121[this.field120++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field145[this.field144++] = var7;
                        var8.field1410 = field247;
                        int var13 = arg1.method466(3, true);
                        var8.method420(var13, true, this.field339);
                        int var14 = arg1.method466(3, true);
                        var8.method420(var14, true, this.field339);
                        int var15 = arg1.method466(1, true);
                        if (var15 == 1) {
                            this.field121[this.field120++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field162[this.field161++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method42(int arg0) {
        int var2 = this.field343.method273(1, "Choose Option");
        for (int var3 = 0; var3 < this.field147; ++var3) {
            int var11 = this.field343.method273(1, this.field209[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        while (arg0 >= 0) {
            this.field417 = -1;
        }
        int var4 = this.field147 * 15 + 21;
        if (super.field1091 > 4 && super.field1092 > 4 && super.field1091 < 516 && super.field1092 < 338) {
            int var5 = super.field1091 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1092 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field537 = true;
            this.field497 = 0;
            this.field498 = var5;
            this.field499 = var6;
            this.field500 = var2;
            this.field501 = this.field147 * 15 + 22;
        }
        if (super.field1091 > 553 && super.field1092 > 205 && super.field1091 < 743 && super.field1092 < 466) {
            int var7 = super.field1091 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1092 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field537 = true;
            this.field497 = 1;
            this.field498 = var7;
            this.field499 = var8;
            this.field500 = var2;
            this.field501 = this.field147 * 15 + 22;
        }
        if (super.field1091 > 17 && super.field1092 > 357 && super.field1091 < 496 && super.field1092 < 453) {
            int var9 = super.field1091 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1092 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field537 = true;
            this.field497 = 2;
            this.field498 = var9;
            this.field499 = var10;
            this.field500 = var2;
            this.field501 = this.field147 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method43(byte arg0) {
        if (arg0 != 6) {
            this.field417 = this.field402.method455();
        }
        if (super.field1090 == 1) {
            if (super.field1091 >= 539 && super.field1091 <= 573 && super.field1092 >= 169 && super.field1092 < 205 && this.field571[0] != -1) {
                this.field307 = true;
                this.field533 = 0;
                this.field432 = true;
            }
            if (super.field1091 >= 569 && super.field1091 <= 599 && super.field1092 >= 168 && super.field1092 < 205 && this.field571[1] != -1) {
                this.field307 = true;
                this.field533 = 1;
                this.field432 = true;
            }
            if (super.field1091 >= 597 && super.field1091 <= 627 && super.field1092 >= 168 && super.field1092 < 205 && this.field571[2] != -1) {
                this.field307 = true;
                this.field533 = 2;
                this.field432 = true;
            }
            if (super.field1091 >= 625 && super.field1091 <= 669 && super.field1092 >= 168 && super.field1092 < 203 && this.field571[3] != -1) {
                this.field307 = true;
                this.field533 = 3;
                this.field432 = true;
            }
            if (super.field1091 >= 666 && super.field1091 <= 696 && super.field1092 >= 168 && super.field1092 < 205 && this.field571[4] != -1) {
                this.field307 = true;
                this.field533 = 4;
                this.field432 = true;
            }
            if (super.field1091 >= 694 && super.field1091 <= 724 && super.field1092 >= 168 && super.field1092 < 205 && this.field571[5] != -1) {
                this.field307 = true;
                this.field533 = 5;
                this.field432 = true;
            }
            if (super.field1091 >= 722 && super.field1091 <= 756 && super.field1092 >= 169 && super.field1092 < 205 && this.field571[6] != -1) {
                this.field307 = true;
                this.field533 = 6;
                this.field432 = true;
            }
            if (super.field1091 >= 540 && super.field1091 <= 574 && super.field1092 >= 466 && super.field1092 < 502 && this.field571[7] != -1) {
                this.field307 = true;
                this.field533 = 7;
                this.field432 = true;
            }
            if (super.field1091 >= 572 && super.field1091 <= 602 && super.field1092 >= 466 && super.field1092 < 503 && this.field571[8] != -1) {
                this.field307 = true;
                this.field533 = 8;
                this.field432 = true;
            }
            if (super.field1091 >= 599 && super.field1091 <= 629 && super.field1092 >= 466 && super.field1092 < 503 && this.field571[9] != -1) {
                this.field307 = true;
                this.field533 = 9;
                this.field432 = true;
            }
            if (super.field1091 >= 627 && super.field1091 <= 671 && super.field1092 >= 467 && super.field1092 < 502 && this.field571[10] != -1) {
                this.field307 = true;
                this.field533 = 10;
                this.field432 = true;
            }
            if (super.field1091 >= 669 && super.field1091 <= 699 && super.field1092 >= 466 && super.field1092 < 503 && this.field571[11] != -1) {
                this.field307 = true;
                this.field533 = 11;
                this.field432 = true;
            }
            if (super.field1091 >= 696 && super.field1091 <= 726 && super.field1092 >= 466 && super.field1092 < 503 && this.field571[12] != -1) {
                this.field307 = true;
                this.field533 = 12;
                this.field432 = true;
            }
            if (super.field1091 >= 724 && super.field1091 <= 758 && super.field1092 >= 466 && super.field1092 < 502 && this.field571[13] != -1) {
                this.field307 = true;
                this.field533 = 13;
                this.field432 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method44(int arg0) {
        this.field389 = new class66(this.field321, "titlebox", 0);
        this.field390 = new class66(this.field321, "titlebutton", 0);
        int var2 = 65 / arg0;
        this.field504 = new class66[12];
        for (int var3 = 0; var3 < 12; ++var3) {
            this.field504[var3] = new class66(this.field321, "runes", var3);
        }
        this.field508 = new class72(128, 265);
        this.field509 = new class72(128, 265);
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field508.field1766[var4] = this.field314.field763[var4];
        }
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field509.field1766[var5] = this.field315.field763[var5];
        }
        this.field251 = new int[256];
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field251[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field251[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field251[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field251[var9 + 192] = 16777215;
        }
        this.field252 = new int[256];
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field252[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field252[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field252[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field252[var13 + 192] = 16777215;
        }
        this.field253 = new int[256];
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field253[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field253[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field253[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field253[var17 + 192] = 16777215;
        }
        this.field250 = new int[256];
        this.field154 = new int[32768];
        this.field155 = new int[32768];
        this.method60(6718, (class66) null);
        this.field271 = new int[32768];
        this.field272 = new int[32768];
        this.method174("Connecting to fileserver", 27936, 10);
        if (!this.field259) {
            this.field547 = true;
            this.field259 = true;
            this.method123(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method45(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 43591) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        int var6 = arg0 >> 7;
        int var7 = arg1 >> 7;
        if (var6 >= 0 && var7 >= 0 && var6 <= 103 && var7 <= 103) {
            int var8 = arg2;
            if (arg2 < 3 && (this.field320[1][var6][var7] & 2) == 2) {
                var8 = arg2 + 1;
            }
            int var9 = arg0 & 127;
            int var10 = arg1 & 127;
            int var11 = (128 - var9) * this.field423[var8][var6][var7] + this.field423[var8][var6 + 1][var7] * var9 >> 7;
            int var12 = (128 - var9) * this.field423[var8][var6][var7 + 1] + this.field423[var8][var6 + 1][var7 + 1] * var9 >> 7;
            return (128 - var10) * var11 + var10 * var12 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (arg0 <= 0) {
            this.field518 = 398;
        }
        this.field141 = 0;
        int var2 = (field219.field1383 >> 7) + this.field233;
        int var3 = (field219.field1384 >> 7) + this.field234;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field141 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field141 = 1;
        }
        if (this.field141 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field141 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLRGCGKKUR;I)V")
    private final void method47(boolean arg0, class53 arg1, int arg2) {
        while (true) {
            if (arg1.field1540 + 21 < arg2 * 8) {
                int var4 = arg1.method466(14, true);
                if (var4 != 16383) {
                    if (this.field143[var4] == null) {
                        this.field143[var4] = new class42();
                    }
                    class42 var5 = this.field143[var4];
                    this.field145[this.field144++] = var4;
                    var5.field1410 = field247;
                    int var6 = arg1.method466(5, true);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method466(1, true);
                    if (var7 == 1) {
                        this.field121[this.field120++] = var4;
                    }
                    int var8 = arg1.method466(5, true);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg1.method466(1, true);
                    var5.field1206 = class68.method585(arg1.method466(13, true));
                    var5.field1370 = var5.field1206.field1740;
                    var5.field1371 = var5.field1206.field1723;
                    var5.field1406 = var5.field1206.field1733;
                    var5.field1407 = var5.field1206.field1707;
                    var5.field1408 = var5.field1206.field1731;
                    var5.field1409 = var5.field1206.field1727;
                    var5.field1402 = var5.field1206.field1737;
                    var5.method419(field219.field1391[0] + var6, -9787, field219.field1392[0] + var8, var9 == 1);
                    continue;
                }
            }
            arg1.method467(1);
            if (arg0) {
                this.field417 = -1;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method48(byte arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            if (arg0 == 9) {
                boolean var4 = false;
                String[] var5 = new String[100];
                int var6 = 0;
                while (true) {
                    int var7 = var3.indexOf(" ");
                    if (var7 == -1) {
                        String var9 = var3.trim();
                        if (var9.length() > 0) {
                            var5[var6++] = var9.toLowerCase();
                        }
                        this.field241 = 0;
                        label51: for (int var10 = 0; var10 < class4.field54; ++var10) {
                            class4 var11 = class4.method22(var10);
                            if (var11.field39 == -1 && var11.field67 != null) {
                                String var12 = var11.field67.toLowerCase();
                                for (int var13 = 0; var13 < var6; ++var13) {
                                    if (var12.indexOf(var5[var13]) == -1) {
                                        continue label51;
                                    }
                                }
                                this.field242[this.field241] = var12;
                                this.field243[this.field241] = var10;
                                ++this.field241;
                                if (this.field241 >= this.field242.length) {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    String var8 = var3.substring(0, var7).trim();
                    if (var8.length() > 0) {
                        var5[var6++] = var8.toLowerCase();
                    }
                    var3 = var3.substring(var7 + 1);
                }
            }
        } else {
            this.field241 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Ljava/lang/String;")
    public final String method49(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1079 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILQUBPQDMQ;III)V")
    public final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, class51 arg5, int arg6, int arg7, int arg8) {
        while (arg0 >= 0) {
            this.method113();
        }
        if (this.field442) {
            this.field459 = 32;
        } else {
            this.field459 = 0;
        }
        this.field442 = false;
        if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg7 && arg6 < arg7 + 16) {
            arg5.field1474 -= this.field177 * 4;
            if (arg8 == 1) {
                this.field307 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                this.field237 = true;
            }
        } else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg1 + arg7 - 16 && arg6 < arg1 + arg7) {
            arg5.field1474 += this.field177 * 4;
            if (arg8 == 1) {
                this.field307 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                this.field237 = true;
            }
        } else if (arg2 >= arg4 - this.field459 && arg2 < arg4 + 16 + this.field459 && arg6 >= arg7 + 16 && arg6 < arg1 + arg7 - 16 && this.field177 > 0) {
            int var10 = (arg1 - 32) * arg1 / arg3;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - arg7 - 16 - var10 / 2;
            int var12 = arg1 - 32 - var10;
            arg5.field1474 = (arg3 - arg1) * var11 / var12;
            if (arg8 == 1) {
                this.field307 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                this.field237 = true;
            }
            this.field442 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
    public final void method51(int arg0, int arg1, boolean arg2) {
        if (arg1 < 7 || arg1 > 7) {
            this.field134 = !this.field134;
        }
        signlink.midivol = arg0;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method52(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field417 = -1;
        }
        while (true) {
            class16 var3 = this.field517.method347();
            if (var3 == null) {
                return;
            }
            if (var3.field736 == 0) {
                class37.method289(4, var3.field740, var3.field737);
                if ((this.field517.method353(true, var3.field737) & 98) != 0) {
                    this.field307 = true;
                    if (this.field452 != -1 || this.field350 != -1) {
                        this.field237 = true;
                    }
                }
            }
            if (var3.field736 == 1 && var3.field740 != null) {
                class49.method425((byte) -111, var3.field740);
            }
            if (var3.field736 == 2 && this.field183 == var3.field737 && var3.field740 != null) {
                this.method120(var3.field740, this.field184, 4);
            }
            if (var3.field736 == 3 && this.field447 == 1) {
                for (int var4 = 0; var4 < this.field483.length; ++var4) {
                    if (this.field181[var4] == var3.field737) {
                        this.field483[var4] = var3.field740;
                        if (var3.field740 == null) {
                            this.field181[var4] = -1;
                        }
                        break;
                    }
                    if (this.field182[var4] == var3.field737) {
                        this.field411[var4] = var3.field740;
                        if (var3.field740 == null) {
                            this.field182[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field736 == 93 && this.field517.method349(var3.field737, (byte) 6)) {
                class30.method250(true, new class53(var3.field740, (byte) -17), this.field517);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method53(boolean arg0) {
        if (!arg0) {
            this.field510 = 476;
        }
        if (super.field1090 == 1) {
            if (super.field1091 >= 6 && super.field1091 <= 106 && super.field1092 >= 467 && super.field1092 <= 499) {
                this.field239 = (this.field239 + 1) % 4;
                this.field131 = true;
                this.field237 = true;
                this.field532.method444(this.field134, 50);
                this.field532.method445(this.field239);
                this.field532.method445(this.field347);
                this.field532.method445(this.field439);
            }
            if (super.field1091 >= 135 && super.field1091 <= 235 && super.field1092 >= 467 && super.field1092 <= 499) {
                this.field347 = (this.field347 + 1) % 3;
                this.field131 = true;
                this.field237 = true;
                this.field532.method444(this.field134, 50);
                this.field532.method445(this.field239);
                this.field532.method445(this.field347);
                this.field532.method445(this.field439);
            }
            if (super.field1091 >= 273 && super.field1091 <= 373 && super.field1092 >= 467 && super.field1092 <= 499) {
                this.field439 = (this.field439 + 1) % 3;
                this.field131 = true;
                this.field237 = true;
                this.field532.method444(this.field134, 50);
                this.field532.method445(this.field239);
                this.field532.method445(this.field347);
                this.field532.method445(this.field439);
            }
            if (super.field1091 >= 412 && super.field1091 <= 512 && super.field1092 >= 467 && super.field1092 <= 499) {
                if (this.field357 == -1) {
                    this.method58(0);
                    this.field256 = "";
                    this.field563 = false;
                    this.field94 = this.field357 = class51.field1481;
                    return;
                }
                this.method163((byte) -83, "Please close the interface you have open before using 'report abuse'", 0, "");
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method54(int arg0) {
        int var2 = this.field273 * 128 + 64;
        int var3 = this.field274 * 128 + 64;
        int var4 = this.method45(var2, var3, this.field372, 43591) - this.field275;
        if (this.field453 < var2) {
            this.field453 += (var2 - this.field453) * this.field277 / 1000 + this.field276;
            if (this.field453 > var2) {
                this.field453 = var2;
            }
        }
        if (this.field453 > var2) {
            this.field453 -= (this.field453 - var2) * this.field277 / 1000 + this.field276;
            if (this.field453 < var2) {
                this.field453 = var2;
            }
        }
        if (this.field454 < var4) {
            this.field454 += (var4 - this.field454) * this.field277 / 1000 + this.field276;
            if (this.field454 > var4) {
                this.field454 = var4;
            }
        }
        if (this.field454 > var4) {
            this.field454 -= (this.field454 - var4) * this.field277 / 1000 + this.field276;
            if (this.field454 < var4) {
                this.field454 = var4;
            }
        }
        if (this.field455 < var3) {
            this.field455 += (var3 - this.field455) * this.field277 / 1000 + this.field276;
            if (this.field455 > var3) {
                this.field455 = var3;
            }
        }
        if (this.field455 > var3) {
            this.field455 -= (this.field455 - var3) * this.field277 / 1000 + this.field276;
            if (this.field455 < var3) {
                this.field455 = var3;
            }
        }
        ++field175;
        if (field175 > 173) {
            field175 = 0;
            this.field532.method444(this.field134, 132);
            this.field532.method448(1123312);
        }
        int var5 = this.field540 * 128 + 64;
        if (arg0 >= 0) {
            this.field417 = this.field402.method455();
        }
        int var6 = this.field541 * 128 + 64;
        int var7 = this.method45(var5, var6, this.field372, 43591) - this.field542;
        int var8 = var5 - this.field453;
        int var9 = var7 - this.field454;
        int var10 = var6 - this.field455;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field456 < var12) {
            this.field456 += (var12 - this.field456) * this.field544 / 1000 + this.field543;
            if (this.field456 > var12) {
                this.field456 = var12;
            }
        }
        if (this.field456 > var12) {
            this.field456 -= (this.field456 - var12) * this.field544 / 1000 + this.field543;
            if (this.field456 < var12) {
                this.field456 = var12;
            }
        }
        int var14 = var13 - this.field457;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field457 += this.field544 * var14 / 1000 + this.field543;
            this.field457 &= 2047;
        }
        if (var14 < 0) {
            this.field457 -= -var14 * this.field544 / 1000 + this.field543;
            this.field457 &= 2047;
        }
        int var15 = var13 - this.field457;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field457 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 == 0) {
            try {
                int var2 = field219.field1383 + this.field292;
                int var3 = field219.field1384 + this.field337;
                if (this.field469 - var2 < -500 || this.field469 - var2 > 500 || this.field470 - var3 < -500 || this.field470 - var3 > 500) {
                    this.field469 = var2;
                    this.field470 = var3;
                }
                if (this.field469 != var2) {
                    this.field469 += (var2 - this.field469) / 16;
                }
                if (this.field470 != var3) {
                    this.field470 += (var3 - this.field470) / 16;
                }
                if (super.field1094[1] == 1) {
                    this.field173 += (-24 - this.field173) / 2;
                } else if (super.field1094[2] == 1) {
                    this.field173 += (24 - this.field173) / 2;
                } else {
                    this.field173 /= 2;
                }
                if (super.field1094[3] == 1) {
                    this.field174 += (12 - this.field174) / 2;
                } else if (super.field1094[4] == 1) {
                    this.field174 += (-12 - this.field174) / 2;
                } else {
                    this.field174 /= 2;
                }
                this.field172 = this.field173 / 2 + this.field172 & 2047;
                this.field171 += this.field174 / 2;
                if (this.field171 < 128) {
                    this.field171 = 128;
                }
                if (this.field171 > 383) {
                    this.field171 = 383;
                }
                int var4 = this.field469 >> 7;
                int var5 = this.field470 >> 7;
                int var6 = this.method45(this.field469, this.field470, this.field372, 43591);
                int var7 = 0;
                if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                            int var10 = this.field372;
                            if (var10 < 3 && (this.field320[1][var8][var9] & 2) == 2) {
                                ++var10;
                            }
                            int var11 = var6 - this.field423[var10][var8][var9];
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
                if (var12 > this.field249) {
                    this.field249 += (var12 - this.field249) / 24;
                } else if (var12 < this.field249) {
                    this.field249 += (var12 - this.field249) / 80;
                }
            } catch (Exception var13) {
                signlink.reporterror("glfc_ex " + field219.field1383 + "," + field219.field1384 + "," + this.field469 + "," + this.field470 + "," + this.field332 + "," + this.field333 + "," + this.field233 + "," + this.field234);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method56(int arg0) {
        this.field89.method223(-5281);
        class6.field596 = this.field559;
        this.field199.method566(0, 22912, 0);
        if (arg0 == 0) {
            if (this.field245) {
                this.field343.method271(239, 41480, 0, this.field396, 40);
                this.field343.method271(239, 41480, 128, this.field267 + "*", 60);
            } else if (this.field413 == 1) {
                this.field343.method271(239, 41480, 0, "Enter amount:", 40);
                this.field343.method271(239, 41480, 128, this.field202 + "*", 60);
            } else if (this.field413 == 2) {
                this.field343.method271(239, 41480, 0, "Enter name:", 40);
                this.field343.method271(239, 41480, 128, this.field202 + "*", 60);
            } else if (this.field413 == 3) {
                if (this.field240 != this.field202) {
                    this.method48((byte) 9, this.field202);
                    this.field240 = this.field202;
                }
                class33 var2 = this.field342;
                class67.method570(0, (byte) -98, 77, 463, 0);
                for (int var3 = 0; var3 < this.field241; ++var3) {
                    int var4 = var3 * 14 + 18 - this.field244;
                    if (var4 > 0 && var4 < 110) {
                        var2.method271(239, 41480, 0, this.field242[var3], var4);
                    }
                }
                class67.method569((byte) 0);
                if (this.field241 > 5) {
                    this.method87(this.field241 * 14 + 7, (byte) 89, 77, 463, 0, this.field244);
                }
                if (this.field202.length() == 0) {
                    this.field343.method271(239, 41480, 255, "Enter object name", 40);
                } else if (this.field241 == 0) {
                    this.field343.method271(239, 41480, 0, "No matching objects found, please shorten search", 40);
                }
                var2.method271(239, 41480, 0, this.field202 + "*", 90);
                class67.method576(0, 479, 893, 77, 0);
            } else if (this.field375 != null) {
                this.field343.method271(239, 41480, 0, this.field375, 40);
                this.field343.method271(239, 41480, 128, "Click to continue", 60);
            } else if (this.field452 != -1) {
                this.method129(-7410, 0, 0, class51.method435(this.field452), 0);
            } else if (this.field350 != -1) {
                this.method129(-7410, 0, 0, class51.method435(this.field350), 0);
            } else {
                class33 var5 = this.field342;
                int var6 = 0;
                class67.method570(0, (byte) -98, 77, 463, 0);
                for (int var7 = 0; var7 < 100; ++var7) {
                    if (this.field438[var7] != null) {
                        int var9 = this.field436[var7];
                        int var10 = 70 - var6 * 14 + this.field192;
                        String var11 = this.field437[var7];
                        byte var12 = 0;
                        if (var11 != null && var11.startsWith("@cr1@")) {
                            var11 = var11.substring(5);
                            var12 = 1;
                        }
                        if (var11 != null && var11.startsWith("@cr2@")) {
                            var11 = var11.substring(5);
                            var12 = 2;
                        }
                        if (var9 == 0) {
                            if (var10 > 0 && var10 < 110) {
                                var5.method275(0, (byte) 118, this.field438[var7], var10, 4);
                            }
                            ++var6;
                        }
                        if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field239 == 0 || this.field239 == 1 && this.method90(true, var11))) {
                            if (var10 > 0 && var10 < 110) {
                                int var13 = 4;
                                if (var12 == 1) {
                                    this.field370[0].method566(var13, 22912, var10 - 12);
                                    var13 += 14;
                                }
                                if (var12 == 2) {
                                    this.field370[1].method566(var13, 22912, var10 - 12);
                                    var13 += 14;
                                }
                                var5.method275(0, (byte) 118, var11 + ":", var10, var13);
                                int var14 = var13 + var5.method273(1, var11) + 8;
                                var5.method275(255, (byte) 118, this.field438[var7], var10, var14);
                            }
                            ++var6;
                        }
                        if ((var9 == 3 || var9 == 7) && this.field300 == 0 && (var9 == 7 || this.field347 == 0 || this.field347 == 1 && this.method90(true, var11))) {
                            if (var10 > 0 && var10 < 110) {
                                byte var15 = 4;
                                var5.method275(0, (byte) 118, "From", var10, var15);
                                int var16 = var15 + var5.method273(1, "From ");
                                if (var12 == 1) {
                                    this.field370[0].method566(var16, 22912, var10 - 12);
                                    var16 += 14;
                                }
                                if (var12 == 2) {
                                    this.field370[1].method566(var16, 22912, var10 - 12);
                                    var16 += 14;
                                }
                                var5.method275(0, (byte) 118, var11 + ":", var10, var16);
                                int var17 = var16 + var5.method273(1, var11) + 8;
                                var5.method275(8388608, (byte) 118, this.field438[var7], var10, var17);
                            }
                            ++var6;
                        }
                        if (var9 == 4 && (this.field439 == 0 || this.field439 == 1 && this.method90(true, var11))) {
                            if (var10 > 0 && var10 < 110) {
                                var5.method275(8388736, (byte) 118, var11 + " " + this.field438[var7], var10, 4);
                            }
                            ++var6;
                        }
                        if (var9 == 5 && this.field300 == 0 && this.field347 < 2) {
                            if (var10 > 0 && var10 < 110) {
                                var5.method275(8388608, (byte) 118, this.field438[var7], var10, 4);
                            }
                            ++var6;
                        }
                        if (var9 == 6 && this.field300 == 0 && this.field347 < 2) {
                            if (var10 > 0 && var10 < 110) {
                                var5.method275(0, (byte) 118, "To " + var11 + ":", var10, 4);
                                var5.method275(8388608, (byte) 118, this.field438[var7], var10, 12 + var5.method273(1, "To " + var11));
                            }
                            ++var6;
                        }
                        if (var9 == 8 && (this.field439 == 0 || this.field439 == 1 && this.method90(true, var11))) {
                            if (var10 > 0 && var10 < 110) {
                                var5.method275(8270336, (byte) 118, var11 + " " + this.field438[var7], var10, 4);
                            }
                            ++var6;
                        }
                    }
                }
                class67.method569((byte) 0);
                this.field362 = var6 * 14 + 7;
                if (this.field362 < 78) {
                    this.field362 = 78;
                }
                this.method87(this.field362, (byte) 89, 77, 463, 0, this.field362 - this.field192 - 77);
                String var8;
                if (field219 != null && field219.field785 != null) {
                    var8 = field219.field785;
                } else {
                    var8 = class55.method501(this.field421, false);
                }
                var5.method275(0, (byte) 118, var8 + ":", 90, 4);
                var5.method275(255, (byte) 118, this.field369 + "*", 90, 6 + var5.method273(1, var8 + ": "));
                class67.method576(0, 479, 893, 77, 0);
            }
            if (this.field537 && this.field497 == 2) {
                this.method155(true);
            }
            this.field89.method224(super.field1076, 966, 357, 17);
            this.field88.method223(-5281);
            class6.field596 = this.field561;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (this.field420 > 0) {
            this.method94((byte) 9);
        } else {
            this.method95("Please wait - attempting to reestablish", "Connection lost", 22761);
            this.field167 = 0;
            if (arg0 != 31790) {
                field461 = 318;
            }
            this.field462 = 0;
            class59 var2 = this.field348;
            this.field196 = false;
            this.field505 = 0;
            this.method147(this.field421, this.field422, true);
            if (!this.field196) {
                this.method94((byte) 9);
            }
            try {
                var2.method506();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method58(int arg0) {
        if (arg0 != 0) {
            this.field417 = this.field402.method455();
        }
        this.field532.method444(this.field134, 245);
        if (this.field195 != -1) {
            this.method39((byte) 6, this.field195);
            this.field195 = -1;
            this.field307 = true;
            this.field140 = false;
            this.field432 = true;
        }
        if (this.field452 != -1) {
            this.method39((byte) 6, this.field452);
            this.field452 = -1;
            this.field237 = true;
            this.field140 = false;
        }
        if (this.field405 != -1) {
            this.method39((byte) 6, this.field405);
            this.field405 = -1;
            this.field392 = true;
        }
        if (this.field90 != -1) {
            this.method39((byte) 6, this.field90);
            this.field90 = -1;
        }
        if (this.field357 != -1) {
            this.method39((byte) 6, this.field357);
            this.field357 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Z")
    public final boolean method59(int arg0) {
        this.field416 += arg0;
        if (this.field348 == null) {
            return false;
        } else {
            try {
                int var2 = this.field348.method508();
                if (var2 == 0) {
                    return false;
                }
                if (this.field417 == -1) {
                    this.field348.method509(this.field402.field1538, 0, 1);
                    this.field417 = this.field402.field1538[0] & 255;
                    if (this.field551 != null) {
                        this.field417 = this.field417 - this.field551.method236() & 255;
                    }
                    this.field416 = class26.field845[this.field417];
                    --var2;
                }
                if (this.field416 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field348.method509(this.field402.field1538, 0, 1);
                    this.field416 = this.field402.field1538[0] & 255;
                    --var2;
                }
                if (this.field416 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field348.method509(this.field402.field1538, 0, 2);
                    this.field402.field1539 = 0;
                    this.field416 = this.field402.method457();
                    var2 -= 2;
                }
                if (var2 < this.field416) {
                    return false;
                }
                this.field402.field1539 = 0;
                this.field348.method509(this.field402.field1538, 0, this.field416);
                this.field418 = 0;
                this.field215 = this.field214;
                this.field214 = this.field213;
                this.field213 = this.field417;
                if (this.field417 == 228) {
                    this.field245 = false;
                    this.field413 = 2;
                    this.field202 = "";
                    this.field237 = true;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 25) {
                    this.field245 = false;
                    this.field413 = 1;
                    this.field202 = "";
                    this.field237 = true;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 141) {
                    this.field307 = true;
                    int var3 = this.field402.method457();
                    class51 var4 = class51.method435(var3);
                    int var5 = this.field402.method457();
                    for (int var6 = 0; var6 < var5; ++var6) {
                        int var7 = this.field402.method455();
                        if (var7 == 255) {
                            var7 = this.field402.method490((byte) 0);
                        }
                        var4.field1477[var6] = this.field402.method457();
                        var4.field1468[var6] = var7;
                    }
                    for (int var8 = var5; var8 < var4.field1477.length; ++var8) {
                        var4.field1477[var8] = 0;
                        var4.field1468[var8] = 0;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 169) {
                    this.field557 = this.field402.method473(false);
                    this.field558 = this.field402.method455();
                    for (int var9 = this.field557; var9 < this.field557 + 8; ++var9) {
                        for (int var10 = this.field558; var10 < this.field558 + 8; ++var10) {
                            if (this.field194[this.field372][var9][var10] != null) {
                                this.field194[this.field372][var9][var10] = null;
                                this.method126(var9, var10);
                            }
                        }
                    }
                    for (class17 var11 = (class17) this.field238.method33(); var11 != null; var11 = (class17) this.field238.method35((byte) 8)) {
                        if (var11.field746 >= this.field557 && var11.field746 < this.field557 + 8 && var11.field747 >= this.field558 && var11.field747 < this.field558 + 8 && this.field372 == var11.field744) {
                            var11.field748 = 0;
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 156) {
                    this.field97 = true;
                    this.field273 = this.field402.method455();
                    this.field274 = this.field402.method455();
                    this.field275 = this.field402.method457();
                    this.field276 = this.field402.method455();
                    this.field277 = this.field402.method455();
                    if (this.field277 >= 100) {
                        this.field453 = this.field273 * 128 + 64;
                        this.field455 = this.field274 * 128 + 64;
                        this.field454 = this.method45(this.field453, this.field455, this.field372, 43591) - this.field275;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 121 || this.field417 == 30) {
                    int var12 = this.field332;
                    int var13 = this.field333;
                    if (this.field417 == 121) {
                        var13 = this.field402.method481(false);
                        var12 = this.field402.method482(26085);
                        this.field346 = false;
                    }
                    if (this.field417 == 30) {
                        this.field402.method465(this.field221);
                        int var14 = 0;
                        while (true) {
                            if (var14 >= 4) {
                                this.field402.method467(1);
                                var13 = this.field402.method457();
                                var12 = this.field402.method481(false);
                                this.field346 = true;
                                break;
                            }
                            for (int var15 = 0; var15 < 13; ++var15) {
                                for (int var16 = 0; var16 < 13; ++var16) {
                                    int var17 = this.field402.method466(1, true);
                                    if (var17 == 1) {
                                        this.field305[var14][var15][var16] = this.field402.method466(26, true);
                                    } else {
                                        this.field305[var14][var15][var16] = -1;
                                    }
                                }
                            }
                            ++var14;
                        }
                    }
                    if (this.field332 == var12 && this.field333 == var13 && this.field447 == 2) {
                        this.field417 = -1;
                        return true;
                    }
                    this.field332 = var12;
                    this.field333 = var13;
                    this.field233 = (this.field332 - 6) * 8;
                    this.field234 = (this.field333 - 6) * 8;
                    this.field400 = false;
                    if ((this.field332 / 8 == 48 || this.field332 / 8 == 49) && this.field333 / 8 == 48) {
                        this.field400 = true;
                    }
                    if (this.field332 / 8 == 48 && this.field333 / 8 == 148) {
                        this.field400 = true;
                    }
                    this.field447 = 1;
                    this.field295 = System.currentTimeMillis();
                    this.method95((String) null, "Loading - please wait.", 22761);
                    if (this.field417 == 121) {
                        int var18 = 0;
                        int var19 = (this.field332 - 6) / 8;
                        label1228: while (true) {
                            if (var19 > (this.field332 + 6) / 8) {
                                this.field483 = new byte[var18][];
                                this.field411 = new byte[var18][];
                                this.field180 = new int[var18];
                                this.field181 = new int[var18];
                                this.field182 = new int[var18];
                                int var21 = 0;
                                int var22 = (this.field332 - 6) / 8;
                                while (true) {
                                    if (var22 > (this.field332 + 6) / 8) {
                                        break label1228;
                                    }
                                    for (int var23 = (this.field333 - 6) / 8; var23 <= (this.field333 + 6) / 8; ++var23) {
                                        this.field180[var21] = (var22 << 8) + var23;
                                        if (!this.field400 || var23 != 49 && var23 != 149 && var23 != 147 && var22 != 50 && (var22 != 49 || var23 != 47)) {
                                            int var24 = this.field181[var21] = this.field517.method352(var23, 208, var22, 0);
                                            if (var24 != -1) {
                                                this.field517.method337(3, var24);
                                            }
                                            int var25 = this.field182[var21] = this.field517.method352(var23, 208, var22, 1);
                                            if (var25 != -1) {
                                                this.field517.method337(3, var25);
                                            }
                                            ++var21;
                                        } else {
                                            this.field181[var21] = -1;
                                            this.field182[var21] = -1;
                                            ++var21;
                                        }
                                    }
                                    ++var22;
                                }
                            }
                            for (int var20 = (this.field333 - 6) / 8; var20 <= (this.field333 + 6) / 8; ++var20) {
                                ++var18;
                            }
                            ++var19;
                        }
                    }
                    if (this.field417 == 30) {
                        int var26 = 0;
                        int[] var27 = new int[676];
                        int var28 = 0;
                        label1187: while (true) {
                            if (var28 >= 4) {
                                this.field483 = new byte[var26][];
                                this.field411 = new byte[var26][];
                                this.field180 = new int[var26];
                                this.field181 = new int[var26];
                                this.field182 = new int[var26];
                                int var36 = 0;
                                while (true) {
                                    if (var36 >= var26) {
                                        break label1187;
                                    }
                                    int var37 = this.field180[var36] = var27[var36];
                                    int var38 = var37 >> 8 & 255;
                                    int var39 = var37 & 255;
                                    int var40 = this.field181[var36] = this.field517.method352(var39, 208, var38, 0);
                                    if (var40 != -1) {
                                        this.field517.method337(3, var40);
                                    }
                                    int var41 = this.field182[var36] = this.field517.method352(var39, 208, var38, 1);
                                    if (var41 != -1) {
                                        this.field517.method337(3, var41);
                                    }
                                    ++var36;
                                }
                            }
                            for (int var29 = 0; var29 < 13; ++var29) {
                                for (int var30 = 0; var30 < 13; ++var30) {
                                    int var31 = this.field305[var28][var29][var30];
                                    if (var31 != -1) {
                                        int var32 = var31 >> 14 & 1023;
                                        int var33 = var31 >> 3 & 2047;
                                        int var34 = (var32 / 8 << 8) + var33 / 8;
                                        for (int var35 = 0; var35 < var26; ++var35) {
                                            if (var27[var35] == var34) {
                                                var34 = -1;
                                                break;
                                            }
                                        }
                                        if (var34 != -1) {
                                            var27[var26++] = var34;
                                        }
                                    }
                                }
                            }
                            ++var28;
                        }
                    }
                    int var42 = this.field233 - this.field235;
                    int var43 = this.field234 - this.field236;
                    this.field235 = this.field233;
                    this.field236 = this.field234;
                    for (int var44 = 0; var44 < 16384; ++var44) {
                        class42 var45 = this.field143[var44];
                        if (var45 != null) {
                            for (int var46 = 0; var46 < 10; ++var46) {
                                var45.field1391[var46] -= var42;
                                var45.field1392[var46] -= var43;
                            }
                            var45.field1383 -= var42 * 128;
                            var45.field1384 -= var43 * 128;
                        }
                    }
                    for (int var47 = 0; var47 < this.field115; ++var47) {
                        class20 var48 = this.field117[var47];
                        if (var48 != null) {
                            for (int var49 = 0; var49 < 10; ++var49) {
                                var48.field1391[var49] -= var42;
                                var48.field1392[var49] -= var43;
                            }
                            var48.field1383 -= var42 * 128;
                            var48.field1384 -= var43 * 128;
                        }
                    }
                    this.field407 = true;
                    byte var50 = 0;
                    byte var51 = 104;
                    byte var52 = 1;
                    if (var42 < 0) {
                        var50 = 103;
                        var51 = -1;
                        var52 = -1;
                    }
                    byte var53 = 0;
                    byte var54 = 104;
                    byte var55 = 1;
                    if (var43 < 0) {
                        var53 = 103;
                        var54 = -1;
                        var55 = -1;
                    }
                    for (int var56 = var50; var51 != var56; var56 += var52) {
                        for (int var57 = var53; var54 != var57; var57 += var55) {
                            int var58 = var42 + var56;
                            int var59 = var43 + var57;
                            for (int var60 = 0; var60 < 4; ++var60) {
                                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                                    this.field194[var60][var56][var57] = this.field194[var60][var58][var59];
                                } else {
                                    this.field194[var60][var56][var57] = null;
                                }
                            }
                        }
                    }
                    for (class17 var61 = (class17) this.field238.method33(); var61 != null; var61 = (class17) this.field238.method35((byte) 8)) {
                        var61.field746 -= var42;
                        var61.field747 -= var43;
                        if (var61.field746 < 0 || var61.field747 < 0 || var61.field746 >= 104 || var61.field747 >= 104) {
                            var61.method505();
                        }
                    }
                    if (this.field462 != 0) {
                        this.field462 -= var42;
                        this.field463 -= var43;
                    }
                    this.field97 = false;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 163) {
                    int var62 = this.field402.method457();
                    int var63 = this.field402.method475(true);
                    if (var62 == 65535) {
                        var62 = -1;
                    }
                    if (this.field571[var63] != var62) {
                        this.method39((byte) 6, this.field571[var63]);
                        this.field571[var63] = var62;
                    }
                    this.field307 = true;
                    this.field432 = true;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 166) {
                    this.method133(this.field416, this.field402, -523);
                    this.field407 = false;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 193) {
                    int var64 = this.field402.method485(324);
                    int var65 = this.field402.method482(26085);
                    class51 var66 = class51.method435(var65);
                    if (var66.field1454 != var64 || var64 == -1) {
                        var66.field1454 = var64;
                        var66.field1514 = 0;
                        var66.field1452 = 0;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 36) {
                    this.field393 = this.field402.method455();
                    if (this.field393 == 1) {
                        this.field127 = this.field402.method457();
                    }
                    if (this.field393 >= 2 && this.field393 <= 6) {
                        if (this.field393 == 2) {
                            this.field380 = 64;
                            this.field381 = 64;
                        }
                        if (this.field393 == 3) {
                            this.field380 = 0;
                            this.field381 = 64;
                        }
                        if (this.field393 == 4) {
                            this.field380 = 128;
                            this.field381 = 64;
                        }
                        if (this.field393 == 5) {
                            this.field380 = 64;
                            this.field381 = 0;
                        }
                        if (this.field393 == 6) {
                            this.field380 = 64;
                            this.field381 = 128;
                        }
                        this.field393 = 2;
                        this.field377 = this.field402.method457();
                        this.field378 = this.field402.method457();
                        this.field379 = this.field402.method455();
                    }
                    if (this.field393 == 10) {
                        this.field261 = this.field402.method457();
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 107) {
                    int var67 = this.field402.method481(false);
                    class51 var68 = class51.method435(var67);
                    for (int var69 = 0; var69 < var68.field1477.length; ++var69) {
                        var68.field1477[var69] = -1;
                        var68.field1477[var69] = 0;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 232) {
                    this.field580 = this.field402.method455();
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 235) {
                    int var70 = this.field402.method482(26085);
                    int var71 = this.field402.method457();
                    if (this.field452 != -1) {
                        this.method39((byte) 6, this.field452);
                        this.field452 = -1;
                        this.field237 = true;
                    }
                    if (this.field405 != -1) {
                        this.method39((byte) 6, this.field405);
                        this.field405 = -1;
                        this.field392 = true;
                    }
                    if (this.field90 != -1) {
                        this.method39((byte) 6, this.field90);
                        this.field90 = -1;
                    }
                    if (this.field357 != var71) {
                        this.method39((byte) 6, this.field357);
                        this.field357 = var71;
                    }
                    if (this.field195 != var70) {
                        this.method39((byte) 6, this.field195);
                        this.field195 = var70;
                    }
                    if (this.field413 != 0) {
                        this.field413 = 0;
                        this.field237 = true;
                    }
                    this.field307 = true;
                    this.field432 = true;
                    this.field140 = false;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 251) {
                    byte var72 = this.field402.method456();
                    int var73 = this.field402.method483(this.field159);
                    this.field114[var73] = var72;
                    if (this.field187[var73] != var72) {
                        this.field187[var73] = var72;
                        this.method124(var73, this.field487);
                        this.field307 = true;
                        if (this.field350 != -1) {
                            this.field237 = true;
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 34) {
                    int var74 = this.field402.method481(false);
                    class51.method435(var74).field1501 = 3;
                    if (field219.field787 == null) {
                        class51.method435(var74).field1502 = (field219.field791[11] << 5) + (field219.field791[8] << 10) + (field219.field791[0] << 15) + (field219.field777[0] << 25) + (field219.field777[4] << 20) + field219.field791[1];
                    } else {
                        class51.method435(var74).field1502 = (int) (field219.field787.field1700 + 305419896L);
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 154) {
                    if (this.field533 == 12) {
                        this.field307 = true;
                    }
                    this.field394 = this.field402.method458();
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 26) {
                    String var75 = this.field402.method462();
                    int var76 = this.field402.method475(true);
                    int var77 = this.field402.method474(0);
                    if (var77 >= 1 && var77 <= 5) {
                        if (var75.equalsIgnoreCase("null")) {
                            var75 = null;
                        }
                        this.field224[var77 - 1] = var75;
                        this.field225[var77 - 1] = var76 == 0;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 52) {
                    this.field412 = this.field416 / 8;
                    for (int var78 = 0; var78 < this.field412; ++var78) {
                        this.field123[var78] = this.field402.method461(false);
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 151) {
                    int var79 = this.field402.method457();
                    int var80 = this.field402.method457();
                    int var81 = var79 >> 10 & 31;
                    int var82 = var79 >> 5 & 31;
                    int var83 = var79 & 31;
                    class51.method435(var80).field1459 = (var83 << 3) + (var81 << 19) + (var82 << 11);
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 18) {
                    int var84 = this.field402.method482(26085);
                    int var85 = this.field402.method483(this.field159);
                    class51.method435(var84).field1501 = 2;
                    class51.method435(var84).field1502 = var85;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 146) {
                    this.field476 = this.field402.method455();
                    this.field526 = this.field402.method483(this.field159);
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 152) {
                    this.field533 = this.field402.method455();
                    this.field307 = true;
                    this.field432 = true;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 31) {
                    String var86 = this.field402.method462();
                    if (var86.endsWith(":tradereq:")) {
                        String var87 = var86.substring(0, var86.indexOf(":"));
                        long var88 = class55.method497(var87);
                        boolean var90 = false;
                        for (int var91 = 0; var91 < this.field412; ++var91) {
                            if (this.field123[var91] == var88) {
                                var90 = true;
                                break;
                            }
                        }
                        if (!var90 && this.field141 == 0) {
                            this.method163((byte) -83, "wishes to trade with you.", 4, var87);
                        }
                    } else if (var86.endsWith(":duelreq:")) {
                        String var92 = var86.substring(0, var86.indexOf(":"));
                        long var93 = class55.method497(var92);
                        boolean var95 = false;
                        for (int var96 = 0; var96 < this.field412; ++var96) {
                            if (this.field123[var96] == var93) {
                                var95 = true;
                                break;
                            }
                        }
                        if (!var95 && this.field141 == 0) {
                            this.method163((byte) -83, "wishes to duel with you.", 8, var92);
                        }
                    } else if (!var86.endsWith(":chalreq:")) {
                        this.method163((byte) -83, var86, 0, "");
                    } else {
                        String var97 = var86.substring(0, var86.indexOf(":"));
                        long var98 = class55.method497(var97);
                        boolean var100 = false;
                        for (int var101 = 0; var101 < this.field412; ++var101) {
                            if (this.field123[var101] == var98) {
                                var100 = true;
                                break;
                            }
                        }
                        if (!var100 && this.field141 == 0) {
                            String var102 = var86.substring(var86.indexOf(":") + 1, var86.length() - 9);
                            this.method163((byte) -83, var102, 8, var97);
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 161) {
                    this.method94((byte) 9);
                    this.field417 = -1;
                    return false;
                }
                if (this.field417 == 110) {
                    int var103 = this.field402.method483(this.field159);
                    int var104 = this.field402.method457();
                    class51 var105 = class51.method435(var104);
                    if (var105 != null && var105.field1503 == 0) {
                        if (var103 < 0) {
                            var103 = 0;
                        }
                        if (var103 > var105.field1472 - var105.field1475) {
                            var103 = var105.field1472 - var105.field1475;
                        }
                        var105.field1474 = var103;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 85) {
                    int var106 = this.field402.method457();
                    int var107 = this.field402.method482(26085);
                    int var108 = this.field402.method482(26085);
                    int var109 = this.field402.method457();
                    class51.method435(var106).field1483 = var107;
                    class51.method435(var106).field1484 = var108;
                    class51.method435(var106).field1482 = var109;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 4) {
                    int var110 = this.field402.method457();
                    if (var110 == 65535) {
                        var110 = -1;
                    }
                    if (this.field254 != var110 && this.field170 && !field291 && this.field403 == 0) {
                        this.field183 = var110;
                        this.field184 = true;
                        this.field517.method337(2, this.field183);
                    }
                    this.field254 = var110;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 233) {
                    int var111 = this.field402.method486(28209);
                    int var112 = this.field402.method457();
                    if (this.field170 && !field291) {
                        this.field183 = var112;
                        this.field184 = false;
                        this.field517.method337(2, this.field183);
                        this.field403 = var111;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 102) {
                    this.field557 = this.field402.method474(0);
                    this.field558 = this.field402.method475(true);
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 97) {
                    long var113 = this.field402.method461(false);
                    int var115 = this.field402.method460();
                    int var116 = this.field402.method455();
                    boolean var117 = false;
                    for (int var118 = 0; var118 < 100; ++var118) {
                        if (this.field529[var118] == var115) {
                            var117 = true;
                            break;
                        }
                    }
                    if (var116 <= 1) {
                        for (int var119 = 0; var119 < this.field412; ++var119) {
                            if (this.field123[var119] == var113) {
                                var117 = true;
                                break;
                            }
                        }
                    }
                    if (!var117 && this.field141 == 0) {
                        try {
                            this.field529[this.field527] = var115;
                            this.field527 = (this.field527 + 1) % 100;
                            String var120 = class71.method588(this.field402, this.field416 - 13, 0);
                            if (var116 != 3) {
                                var120 = class62.method524(var120, true);
                            }
                            if (var116 != 2 && var116 != 3) {
                                if (var116 == 1) {
                                    this.method163((byte) -83, var120, 7, "@cr1@" + class55.method501(class55.method498(-39, var113), false));
                                } else {
                                    this.method163((byte) -83, var120, 3, class55.method501(class55.method498(-39, var113), false));
                                }
                            } else {
                                this.method163((byte) -83, var120, 7, "@cr2@" + class55.method501(class55.method498(-39, var113), false));
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 119) {
                    int var122 = this.field402.method455();
                    int var123 = this.field402.method455();
                    int var124 = this.field402.method455();
                    int var125 = this.field402.method455();
                    this.field262[var122] = true;
                    this.field552[var122] = var123;
                    this.field191[var122] = var124;
                    this.field185[var122] = var125;
                    this.field331[var122] = 0;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 69 || this.field417 == 194 || this.field417 == 1 || this.field417 == 173 || this.field417 == 137 || this.field417 == 100 || this.field417 == 220 || this.field417 == 51 || this.field417 == 128 || this.field417 == 57 || this.field417 == 241) {
                    this.method131(this.field402, false, this.field417);
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 124) {
                    int var126 = this.field402.method483(this.field159);
                    this.method173(var126, 1);
                    if (this.field195 != -1) {
                        this.method39((byte) 6, this.field195);
                        this.field195 = -1;
                        this.field307 = true;
                        this.field432 = true;
                    }
                    if (this.field405 != -1) {
                        this.method39((byte) 6, this.field405);
                        this.field405 = -1;
                        this.field392 = true;
                    }
                    if (this.field90 != -1) {
                        this.method39((byte) 6, this.field90);
                        this.field90 = -1;
                    }
                    if (this.field357 != -1) {
                        this.method39((byte) 6, this.field357);
                        this.field357 = -1;
                    }
                    if (this.field452 != var126) {
                        this.method39((byte) 6, this.field452);
                        this.field452 = var126;
                    }
                    this.field140 = false;
                    this.field237 = true;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 200) {
                    this.field307 = true;
                    int var127 = this.field402.method474(0);
                    int var128 = this.field402.method475(true);
                    int var129 = this.field402.method488(true);
                    this.field340[var127] = var129;
                    this.field354[var127] = var128;
                    this.field268[var127] = 1;
                    for (int var130 = 0; var130 < 98; ++var130) {
                        if (var129 >= field449[var130]) {
                            this.field268[var127] = var130 + 2;
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 217) {
                    int var131 = this.field402.method485(324);
                    if (var131 >= 0) {
                        this.method173(var131, 1);
                    }
                    if (this.field373 != var131) {
                        this.method39((byte) 6, this.field373);
                        this.field373 = var131;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 174) {
                    for (int var132 = 0; var132 < this.field187.length; ++var132) {
                        if (this.field187[var132] != this.field114[var132]) {
                            this.field187[var132] = this.field114[var132];
                            this.method124(var132, this.field487);
                            this.field307 = true;
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 236) {
                    this.field263 = this.field402.method473(false);
                    if (this.field533 == this.field263) {
                        if (this.field263 == 3) {
                            this.field533 = 1;
                        } else {
                            this.field533 = 3;
                        }
                        this.field307 = true;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 208) {
                    this.method93(5, this.field416, this.field402);
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 136) {
                    this.field557 = this.field402.method455();
                    this.field558 = this.field402.method475(true);
                    while (this.field402.field1539 < this.field416) {
                        int var133 = this.field402.method455();
                        this.method131(this.field402, false, var133);
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 120) {
                    int var134 = this.field402.method457();
                    boolean var135 = this.field402.method475(true) == 1;
                    class51.method435(var134).field1478 = var135;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 167) {
                    int var136 = this.field402.method457();
                    int var137 = this.field402.method455();
                    int var138 = this.field402.method457();
                    if (var138 == 65535) {
                        if (this.field223 < 50) {
                            this.field443[this.field223] = (short) var136;
                            this.field324[this.field223] = var137;
                            this.field91[this.field223] = 0;
                            ++this.field223;
                        }
                    } else if (this.field565 && !field291 && this.field223 < 50) {
                        this.field443[this.field223] = var136;
                        this.field324[this.field223] = var137;
                        this.field91[this.field223] = class14.field703[var136] + var138;
                        ++this.field223;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 58) {
                    this.field97 = true;
                    this.field540 = this.field402.method455();
                    this.field541 = this.field402.method455();
                    this.field542 = this.field402.method457();
                    this.field543 = this.field402.method455();
                    this.field544 = this.field402.method455();
                    if (this.field544 >= 100) {
                        int var139 = this.field540 * 128 + 64;
                        int var140 = this.field541 * 128 + 64;
                        int var141 = this.method45(var139, var140, this.field372, 43591) - this.field542;
                        int var142 = var139 - this.field453;
                        int var143 = var141 - this.field454;
                        int var144 = var140 - this.field455;
                        int var145 = (int) Math.sqrt((double) (var142 * var142 + var144 * var144));
                        this.field456 = (int) (Math.atan2((double) var143, (double) var145) * 325.949D) & 2047;
                        this.field457 = (int) (Math.atan2((double) var142, (double) var144) * -325.949D) & 2047;
                        if (this.field456 < 128) {
                            this.field456 = 128;
                        }
                        if (this.field456 > 383) {
                            this.field456 = 383;
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 132) {
                    int var146 = this.field402.method457();
                    this.method173(var146, 1);
                    if (this.field452 != -1) {
                        this.method39((byte) 6, this.field452);
                        this.field452 = -1;
                        this.field237 = true;
                    }
                    if (this.field405 != -1) {
                        this.method39((byte) 6, this.field405);
                        this.field405 = -1;
                        this.field392 = true;
                    }
                    if (this.field90 != -1) {
                        this.method39((byte) 6, this.field90);
                        this.field90 = -1;
                    }
                    if (this.field357 != -1) {
                        this.method39((byte) 6, this.field357);
                        this.field357 = -1;
                    }
                    if (this.field195 != var146) {
                        this.method39((byte) 6, this.field195);
                        this.field195 = var146;
                    }
                    if (this.field413 != 0) {
                        this.field413 = 0;
                        this.field237 = true;
                    }
                    this.field307 = true;
                    this.field432 = true;
                    this.field140 = false;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 10) {
                    this.field481 = this.field402.method483(this.field159) * 30;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 175) {
                    int var147 = this.field402.method457();
                    int var148 = this.field402.method482(26085);
                    class51.method435(var147).field1501 = 1;
                    class51.method435(var147).field1502 = var148;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 245) {
                    if (this.field533 == 12) {
                        this.field307 = true;
                    }
                    this.field548 = this.field402.method455();
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 239) {
                    int var149 = this.field402.method457();
                    String var150 = this.field402.method462();
                    class51.method435(var149).field1467 = var150;
                    int var10001 = this.field571[this.field533];
                    if (class51.method435(var149).field1471 == var10001) {
                        this.field307 = true;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 39) {
                    this.field297 = this.field402.method482(26085);
                    this.field322 = this.field402.method482(26085);
                    this.field502 = this.field402.method481(false);
                    this.field414 = this.field402.method457();
                    this.field573 = this.field402.method482(26085);
                    this.field402.method483(this.field159);
                    this.field255 = this.field402.method488(true);
                    this.field222 = this.field402.method457();
                    this.field546 = this.field402.method483(this.field159);
                    this.field278 = this.field402.method481(false);
                    this.field402.method474(0);
                    signlink.dnslookup(class55.method500(this.field255, this.field535));
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 9) {
                    int var151 = this.field402.method457();
                    int var152 = this.field402.method483(this.field159);
                    this.method173(var151, 1);
                    if (var152 != -1) {
                        this.method173(var152, 1);
                    }
                    if (this.field357 != -1) {
                        this.method39((byte) 6, this.field357);
                        this.field357 = -1;
                    }
                    if (this.field195 != -1) {
                        this.method39((byte) 6, this.field195);
                        this.field195 = -1;
                    }
                    if (this.field452 != -1) {
                        this.method39((byte) 6, this.field452);
                        this.field452 = -1;
                    }
                    if (this.field405 != var151) {
                        this.method39((byte) 6, this.field405);
                        this.field405 = var151;
                    }
                    if (this.field90 != var151) {
                        this.method39((byte) 6, this.field90);
                        this.field90 = var152;
                    }
                    this.field413 = 0;
                    this.field140 = false;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 98) {
                    this.field239 = this.field402.method455();
                    this.field347 = this.field402.method455();
                    this.field439 = this.field402.method455();
                    this.field131 = true;
                    this.field237 = true;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 255) {
                    int var153 = this.field402.method481(false);
                    this.method173(var153, 1);
                    if (this.field195 != -1) {
                        this.method39((byte) 6, this.field195);
                        this.field195 = -1;
                        this.field307 = true;
                        this.field432 = true;
                    }
                    if (this.field452 != -1) {
                        this.method39((byte) 6, this.field452);
                        this.field452 = -1;
                        this.field237 = true;
                    }
                    if (this.field405 != -1) {
                        this.method39((byte) 6, this.field405);
                        this.field405 = -1;
                        this.field392 = true;
                    }
                    if (this.field90 != -1) {
                        this.method39((byte) 6, this.field90);
                        this.field90 = -1;
                    }
                    if (this.field357 != var153) {
                        this.method39((byte) 6, this.field357);
                        this.field357 = var153;
                    }
                    if (this.field413 != 0) {
                        this.field413 = 0;
                        this.field237 = true;
                    }
                    this.field140 = false;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 29) {
                    this.field462 = 0;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 179) {
                    for (int var154 = 0; var154 < this.field117.length; ++var154) {
                        if (this.field117[var154] != null) {
                            this.field117[var154].field1377 = -1;
                        }
                    }
                    for (int var155 = 0; var155 < this.field143.length; ++var155) {
                        if (this.field143[var155] != null) {
                            this.field143[var155].field1377 = -1;
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 109) {
                    int var156 = this.field402.method481(false);
                    int var157 = this.field402.method488(true);
                    this.field114[var156] = var157;
                    if (this.field187[var156] != var157) {
                        this.field187[var156] = var157;
                        this.method124(var156, this.field487);
                        this.field307 = true;
                        if (this.field350 != -1) {
                            this.field237 = true;
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 24) {
                    long var158 = this.field402.method461(false);
                    int var160 = this.field402.method455();
                    String var161 = class55.method501(class55.method498(-39, var158), false);
                    for (int var162 = 0; var162 < this.field434; ++var162) {
                        if (this.field294[var162] == var158) {
                            if (this.field139[var162] != var160) {
                                this.field139[var162] = var160;
                                this.field307 = true;
                                if (var160 > 0) {
                                    this.method163((byte) -83, var161 + " has logged in.", 5, "");
                                }
                                if (var160 == 0) {
                                    this.method163((byte) -83, var161 + " has logged out.", 5, "");
                                }
                            }
                            var161 = null;
                            break;
                        }
                    }
                    if (var161 != null && this.field434 < 200) {
                        this.field294[this.field434] = var158;
                        this.field460[this.field434] = var161;
                        this.field139[this.field434] = var160;
                        ++this.field434;
                        this.field307 = true;
                    }
                    boolean var163 = false;
                    while (!var163) {
                        var163 = true;
                        for (int var164 = 0; var164 < this.field434 - 1; ++var164) {
                            if (this.field139[var164] != field288 && this.field139[var164 + 1] == field288 || this.field139[var164] == 0 && this.field139[var164 + 1] != 0) {
                                int var165 = this.field139[var164];
                                this.field139[var164] = this.field139[var164 + 1];
                                this.field139[var164 + 1] = var165;
                                String var166 = this.field460[var164];
                                this.field460[var164] = this.field460[var164 + 1];
                                this.field460[var164 + 1] = var166;
                                long var167 = this.field294[var164];
                                this.field294[var164] = this.field294[var164 + 1];
                                this.field294[var164 + 1] = var167;
                                this.field307 = true;
                                var163 = false;
                            }
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 6) {
                    int var169 = this.field402.method458();
                    if (this.field350 != var169) {
                        this.method39((byte) 6, this.field350);
                        this.field350 = var169;
                    }
                    this.field237 = true;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 96) {
                    this.field307 = true;
                    int var170 = this.field402.method457();
                    class51 var171 = class51.method435(var170);
                    while (this.field402.field1539 < this.field416) {
                        int var172 = this.field402.method469();
                        int var173 = this.field402.method457();
                        int var174 = this.field402.method455();
                        if (var174 == 255) {
                            var174 = this.field402.method460();
                        }
                        if (var172 >= 0 && var172 < var171.field1477.length) {
                            var171.field1477[var172] = var173;
                            var171.field1468[var172] = var174;
                        }
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 247) {
                    int var175 = this.field402.method481(false);
                    int var176 = this.field402.method457();
                    int var177 = this.field402.method481(false);
                    if (var175 == 65535) {
                        class51.method435(var176).field1501 = 0;
                        this.field417 = -1;
                        return true;
                    }
                    class4 var178 = class4.method22(var175);
                    class51.method435(var176).field1501 = 4;
                    class51.method435(var176).field1502 = var175;
                    class51.method435(var176).field1483 = var178.field59;
                    class51.method435(var176).field1484 = var178.field74;
                    class51.method435(var176).field1482 = var178.field43 * 100 / var177;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 76) {
                    if (this.field195 != -1) {
                        this.method39((byte) 6, this.field195);
                        this.field195 = -1;
                        this.field307 = true;
                        this.field432 = true;
                    }
                    if (this.field452 != -1) {
                        this.method39((byte) 6, this.field452);
                        this.field452 = -1;
                        this.field237 = true;
                    }
                    if (this.field405 != -1) {
                        this.method39((byte) 6, this.field405);
                        this.field405 = -1;
                        this.field392 = true;
                    }
                    if (this.field90 != -1) {
                        this.method39((byte) 6, this.field90);
                        this.field90 = -1;
                    }
                    if (this.field357 != -1) {
                        this.method39((byte) 6, this.field357);
                        this.field357 = -1;
                    }
                    if (this.field413 != 0) {
                        this.field413 = 0;
                        this.field237 = true;
                    }
                    this.field140 = false;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 243) {
                    int var179 = this.field402.method457();
                    int var180 = this.field402.method482(26085);
                    int var181 = this.field402.method481(false);
                    class51.method435(var180).field1500 = (var179 << 16) + var181;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 41) {
                    this.field97 = false;
                    for (int var182 = 0; var182 < 5; ++var182) {
                        this.field262[var182] = false;
                    }
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 64) {
                    this.field435 = this.field402.method455();
                    this.field307 = true;
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 113) {
                    this.field167 = this.field402.method455();
                    this.field417 = -1;
                    return true;
                }
                if (this.field417 == 246) {
                    int var183 = this.field402.method484(false);
                    int var184 = this.field402.method483(this.field159);
                    int var185 = this.field402.method485(324);
                    class51 var186 = class51.method435(var184);
                    var186.field1496 = var185;
                    var186.field1451 = var183;
                    this.field417 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field417 + "," + this.field416 + " - " + this.field214 + "," + this.field215);
                this.method94((byte) 9);
            } catch (IOException var191) {
                this.method57(31790);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field417 + "," + this.field214 + "," + this.field215 + " - " + this.field416 + "," + (field219.field1391[0] + this.field233) + "," + (field219.field1392[0] + this.field234) + " - ";
                for (int var189 = 0; var189 < this.field416 && var189 < 50; ++var189) {
                    var188 = var188 + this.field402.field1538[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method94((byte) 9);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILWGRALUSQ;)V")
    public final void method60(int arg0, class66 arg1) {
        if (arg0 != 6718) {
            this.field539 = !this.field539;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < this.field154.length; ++var4) {
            this.field154[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field154[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field155[var16] = (this.field154[var16 - 1] + this.field154[var16 + 1] + this.field154[var16 - 128] + this.field154[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field154;
            this.field154 = this.field155;
            this.field155 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field1678; ++var8) {
                for (int var9 = 0; var9 < arg1.field1677; ++var9) {
                    if (arg1.field1675[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field1679;
                        int var11 = var8 + 16 + arg1.field1680;
                        int var12 = (var11 << 7) + var10;
                        this.field154[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLQUBPQDMQ;)I")
    public final int method61(int arg0, byte arg1, class51 arg2) {
        if (this.field566 != arg1) {
            return this.field260;
        } else if (arg2.field1519 != null && arg0 < arg2.field1519.length) {
            try {
                int[] var4 = arg2.field1519[arg0];
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
                        var9 = this.field354[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field268[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field340[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class51 var11 = class51.method435(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class4.field54 && (!class4.method22(var12).field25 || field290)) {
                            for (int var13 = 0; var13 < var11.field1477.length; ++var13) {
                                if (var12 + 1 == var11.field1477[var13]) {
                                    var9 += var11.field1468[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field187[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field449[this.field268[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field187[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field219.field799;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class58.field1578; ++var14) {
                            if (class58.field1580[var14]) {
                                var9 += this.field268[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class51 var15 = class51.method435(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class4.field54 && (!class4.method22(var16).field25 || field290)) {
                            for (int var17 = 0; var17 < var15.field1477.length; ++var17) {
                                if (var15.field1477[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field548;
                    }
                    if (var8 == 12) {
                        var9 = this.field394;
                    }
                    if (var8 == 13) {
                        int var18 = this.field187[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class7 var21 = class7.field610[var20];
                        int var22 = var21.field612;
                        int var23 = var21.field613;
                        int var24 = var21.field614;
                        int var25 = field124[var24 - var23];
                        var9 = this.field187[var22] >> var23 & var25;
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
                        var9 = (field219.field1383 >> 7) + this.field233;
                    }
                    if (var8 == 19) {
                        var9 = (field219.field1384 >> 7) + this.field234;
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

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method62(int arg0) {
        byte[] var2 = this.field321.method205("title.dat", (byte[]) null);
        class72 var3 = new class72(var2, this);
        this.field314.method223(-5281);
        var3.method594(0, 0, 1);
        this.field315.method223(-5281);
        var3.method594(-637, 0, 1);
        this.field311.method223(-5281);
        var3.method594(-128, 0, 1);
        this.field312.method223(-5281);
        var3.method594(-202, -371, 1);
        this.field313.method223(-5281);
        var3.method594(-202, -171, 1);
        this.field316.method223(-5281);
        if (arg0 != -21339) {
            this.field417 = this.field402.method455();
        }
        var3.method594(0, -265, 1);
        this.field317.method223(-5281);
        var3.method594(-562, -265, 1);
        this.field318.method223(-5281);
        var3.method594(-128, -171, 1);
        this.field319.method223(-5281);
        var3.method594(-562, -171, 1);
        int[] var4 = new int[var3.field1767];
        for (int var5 = 0; var5 < var3.field1768; ++var5) {
            for (int var10 = 0; var10 < var3.field1767; ++var10) {
                var4[var10] = var3.field1766[var3.field1767 * var5 + (var3.field1767 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1767; ++var11) {
                var3.field1766[var3.field1767 * var5 + var11] = var4[var11];
            }
        }
        this.field314.method223(-5281);
        var3.method594(382, 0, 1);
        this.field315.method223(-5281);
        var3.method594(-255, 0, 1);
        this.field311.method223(-5281);
        var3.method594(254, 0, 1);
        this.field312.method223(-5281);
        var3.method594(180, -371, 1);
        this.field313.method223(-5281);
        var3.method594(180, -171, 1);
        this.field316.method223(-5281);
        var3.method594(382, -265, 1);
        this.field317.method223(-5281);
        var3.method594(-180, -265, 1);
        this.field318.method223(-5281);
        var3.method594(254, -171, 1);
        this.field319.method223(-5281);
        var3.method594(-180, -171, 1);
        class72 var6 = new class72(this.field321, "logo", 0);
        this.field311.method223(-5281);
        var6.method596(382 - var6.field1767 / 2 - 128, 22912, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method63(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        int var4 = 55 / arg0;
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LRGCGKKUR;IB)V")
    private final void method64(class53 arg0, int arg1, byte arg2) {
        if (arg2 == 5) {
            for (int var4 = 0; var4 < this.field120; ++var4) {
                int var5 = this.field121[var4];
                class42 var6 = this.field143[var5];
                int var7 = arg0.method455();
                if ((var7 & 64) != 0) {
                    var6.field1411 = arg0.method483(this.field159);
                    var6.field1412 = arg0.method481(false);
                }
                if ((var7 & 16) != 0) {
                    int var8 = arg0.method455();
                    int var9 = arg0.method475(true);
                    var6.method421((byte) 16, field247, var8, var9);
                    var6.field1355 = field247 + 300;
                    var6.field1356 = arg0.method455();
                    var6.field1357 = arg0.method475(true);
                }
                if ((var7 & 4) != 0) {
                    var6.field1206 = class68.method585(arg0.method481(false));
                    var6.field1370 = var6.field1206.field1740;
                    var6.field1371 = var6.field1206.field1723;
                    var6.field1406 = var6.field1206.field1733;
                    var6.field1407 = var6.field1206.field1707;
                    var6.field1408 = var6.field1206.field1731;
                    var6.field1409 = var6.field1206.field1727;
                    var6.field1402 = var6.field1206.field1737;
                }
                if ((var7 & 128) != 0) {
                    var6.field1382 = arg0.method457();
                    if (var6.field1382 == 65535) {
                        var6.field1382 = -1;
                    }
                }
                if ((var7 & 8) != 0) {
                    int var10 = arg0.method481(false);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    int var11 = arg0.method474(0);
                    if (var6.field1377 == var10 && var10 != -1) {
                        int var12 = class27.field849[var10].field863;
                        if (var12 == 1) {
                            var6.field1378 = 0;
                            var6.field1379 = 0;
                            var6.field1380 = var11;
                            var6.field1381 = 0;
                        }
                        if (var12 == 2) {
                            var6.field1381 = 0;
                        }
                    } else if (var10 == -1 || var6.field1377 == -1 || class27.field849[var10].field857 >= class27.field849[var6.field1377].field857) {
                        var6.field1377 = var10;
                        var6.field1378 = 0;
                        var6.field1379 = 0;
                        var6.field1380 = var11;
                        var6.field1381 = 0;
                        var6.field1376 = var6.field1366;
                    }
                }
                if ((var7 & 1) != 0) {
                    var6.field1367 = arg0.method462();
                    var6.field1390 = 100;
                }
                if ((var7 & 2) != 0) {
                    int var13 = arg0.method475(true);
                    int var14 = arg0.method455();
                    var6.method421((byte) 16, field247, var13, var14);
                    var6.field1355 = field247 + 300;
                    var6.field1356 = arg0.method474(0);
                    var6.field1357 = arg0.method475(true);
                }
                if ((var7 & 32) != 0) {
                    var6.field1359 = arg0.method481(false);
                    int var15 = arg0.method489((byte) -78);
                    var6.field1363 = var15 >> 16;
                    var6.field1362 = (var15 & 65535) + field247;
                    var6.field1360 = 0;
                    var6.field1361 = 0;
                    if (var6.field1362 > field247) {
                        var6.field1360 = -1;
                    }
                    if (var6.field1359 == 65535) {
                        var6.field1359 = -1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method65(boolean arg0) {
        if (this.field576 == 0) {
            this.field209[0] = "Cancel";
            this.field366[0] = 1033;
            if (arg0) {
                this.method113();
            }
            this.field147 = 1;
            if (this.field405 != -1) {
                this.field428 = 0;
                this.field231 = 0;
                this.method169(super.field1085, 0, 0, 0, 0, 0, super.field1084, class51.method435(this.field405));
                if (this.field428 != this.field148) {
                    this.field148 = this.field428;
                }
                if (this.field387 != this.field231) {
                    this.field387 = this.field231;
                }
            } else {
                this.method66((byte) 5);
                this.field428 = 0;
                this.field231 = 0;
                if (super.field1084 > 4 && super.field1085 > 4 && super.field1084 < 516 && super.field1085 < 338) {
                    if (this.field357 != -1) {
                        this.method169(super.field1085, 0, 4, 0, 4, 0, super.field1084, class51.method435(this.field357));
                    } else {
                        this.method167(this.field130);
                    }
                }
                if (this.field428 != this.field148) {
                    this.field148 = this.field428;
                }
                if (this.field387 != this.field231) {
                    this.field387 = this.field231;
                }
                this.field428 = 0;
                this.field231 = 0;
                if (super.field1084 > 553 && super.field1085 > 205 && super.field1084 < 743 && super.field1085 < 466) {
                    if (this.field195 != -1) {
                        this.method169(super.field1085, 0, 553, 0, 205, 1, super.field1084, class51.method435(this.field195));
                    } else if (this.field571[this.field533] != -1) {
                        this.method169(super.field1085, 0, 553, 0, 205, 1, super.field1084, class51.method435(this.field571[this.field533]));
                    }
                }
                if (this.field428 != this.field388) {
                    this.field307 = true;
                    this.field388 = this.field428;
                }
                if (this.field503 != this.field231) {
                    this.field307 = true;
                    this.field503 = this.field231;
                }
                this.field428 = 0;
                this.field231 = 0;
                if (super.field1084 > 17 && super.field1085 > 357 && super.field1084 < 496 && super.field1085 < 453) {
                    if (this.field452 != -1) {
                        this.method169(super.field1085, 0, 17, 0, 357, 2, super.field1084, class51.method435(this.field452));
                    } else if (this.field350 != -1) {
                        this.method169(super.field1085, 0, 17, 0, 357, 3, super.field1084, class51.method435(this.field350));
                    } else if (super.field1085 < 434 && super.field1084 < 426 && this.field413 == 0) {
                        this.method104(super.field1085 - 357, (byte) 2, super.field1084 - 17);
                    }
                }
                if ((this.field452 != -1 || this.field350 != -1) && this.field428 != this.field398) {
                    this.field237 = true;
                    this.field398 = this.field428;
                }
                if ((this.field452 != -1 || this.field350 != -1) && this.field507 != this.field231) {
                    this.field237 = true;
                    this.field507 = this.field231;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field147 - 1; ++var3) {
                        if (this.field366[var3] < 1000 && this.field366[var3 + 1] > 1000) {
                            String var4 = this.field209[var3];
                            this.field209[var3] = this.field209[var3 + 1];
                            this.field209[var3 + 1] = var4;
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
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method66(byte arg0) {
        if (this.field95 == arg0) {
            boolean var2 = false;
        } else {
            this.field211 = this.field551.method236();
        }
        if (this.field300 != 0) {
            int var3 = 0;
            if (this.field481 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field438[var4] != null) {
                    int var5 = this.field436[var4];
                    String var6 = this.field437[var4];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field347 == 0 || this.field347 == 1 && this.method90(true, var6))) {
                        int var10 = 329 - var3 * 13;
                        if (super.field1084 > 4 && super.field1085 - 4 > var10 - 10 && super.field1085 - 4 <= var10 + 3) {
                            int var11 = this.field342.method273(1, "From:  " + var6 + this.field438[var4]) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field1084 < var11 + 4) {
                                if (this.field399 >= 1) {
                                    this.field209[this.field147] = "Report abuse @whi@" + var6;
                                    this.field366[this.field147] = 2541;
                                    ++this.field147;
                                }
                                this.field209[this.field147] = "Add ignore @whi@" + var6;
                                this.field366[this.field147] = 2997;
                                ++this.field147;
                                this.field209[this.field147] = "Add friend @whi@" + var6;
                                this.field366[this.field147] = 2138;
                                ++this.field147;
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

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method67(byte arg0) {
        if (arg0 != 2) {
            this.field327 = this.field551.method236();
        }
        for (int var2 = 0; var2 < this.field144; ++var2) {
            int var3 = this.field145[var2];
            class42 var4 = this.field143[var3];
            if (var4 != null) {
                this.method68(var4.field1206.field1740, var4, 9);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILOZYWPVDM;I)V")
    public final void method68(int arg0, class47 arg1, int arg2) {
        if (arg2 < 9 || arg2 > 9) {
            this.field336 = this.field551.method236();
        }
        if (arg1.field1383 < 128 || arg1.field1384 < 128 || arg1.field1383 >= 13184 || arg1.field1384 >= 13184) {
            arg1.field1377 = -1;
            arg1.field1359 = -1;
            arg1.field1397 = 0;
            arg1.field1398 = 0;
            arg1.field1383 = arg1.field1391[0] * 128 + arg1.field1370 * 64;
            arg1.field1384 = arg1.field1392[0] * 128 + arg1.field1370 * 64;
            arg1.method422(926);
        }
        if (field219 == arg1 && (arg1.field1383 < 1536 || arg1.field1384 < 1536 || arg1.field1383 >= 11776 || arg1.field1384 >= 11776)) {
            arg1.field1377 = -1;
            arg1.field1359 = -1;
            arg1.field1397 = 0;
            arg1.field1398 = 0;
            arg1.field1383 = arg1.field1391[0] * 128 + arg1.field1370 * 64;
            arg1.field1384 = arg1.field1392[0] * 128 + arg1.field1370 * 64;
            arg1.method422(926);
        }
        if (arg1.field1397 > field247) {
            this.method69(true, arg1);
        } else if (arg1.field1398 >= field247) {
            this.method70((byte) -36, arg1);
        } else {
            this.method71(false, arg1);
        }
        this.method72((byte) 28, arg1);
        this.method73(0, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLOZYWPVDM;)V")
    public final void method69(boolean arg0, class47 arg1) {
        int var3 = arg1.field1397 - field247;
        this.field196 &= arg0;
        int var4 = arg1.field1393 * 128 + arg1.field1370 * 64;
        int var5 = arg1.field1395 * 128 + arg1.field1370 * 64;
        arg1.field1383 += (var4 - arg1.field1383) / var3;
        arg1.field1384 += (var5 - arg1.field1384) / var3;
        arg1.field1364 = 0;
        if (arg1.field1399 == 0) {
            arg1.field1389 = 1024;
        }
        if (arg1.field1399 == 1) {
            arg1.field1389 = 1536;
        }
        if (arg1.field1399 == 2) {
            arg1.field1389 = 0;
        }
        if (arg1.field1399 == 3) {
            arg1.field1389 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLOZYWPVDM;)V")
    public final void method70(byte arg0, class47 arg1) {
        if (field247 == arg1.field1398 || arg1.field1377 == -1 || arg1.field1380 != 0 || arg1.field1379 + 1 > class27.field849[arg1.field1377].method240((byte) 0, arg1.field1378)) {
            int var3 = arg1.field1398 - arg1.field1397;
            int var4 = field247 - arg1.field1397;
            int var5 = arg1.field1393 * 128 + arg1.field1370 * 64;
            int var6 = arg1.field1395 * 128 + arg1.field1370 * 64;
            int var7 = arg1.field1394 * 128 + arg1.field1370 * 64;
            int var8 = arg1.field1396 * 128 + arg1.field1370 * 64;
            arg1.field1383 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1384 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1364 = 0;
        if (arg0 != -36) {
            this.field194 = null;
        }
        if (arg1.field1399 == 0) {
            arg1.field1389 = 1024;
        }
        if (arg1.field1399 == 1) {
            arg1.field1389 = 1536;
        }
        if (arg1.field1399 == 2) {
            arg1.field1389 = 0;
        }
        if (arg1.field1399 == 3) {
            arg1.field1389 = 512;
        }
        arg1.field1385 = arg1.field1389;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLOZYWPVDM;)V")
    public final void method71(boolean arg0, class47 arg1) {
        arg1.field1386 = arg1.field1402;
        if (arg1.field1366 == 0) {
            arg1.field1364 = 0;
        } else {
            if (arg1.field1377 != -1 && arg1.field1380 == 0) {
                class27 var3 = class27.field849[arg1.field1377];
                if (arg1.field1376 > 0 && var3.field861 == 0) {
                    ++arg1.field1364;
                    return;
                }
                if (arg1.field1376 <= 0 && var3.field862 == 0) {
                    ++arg1.field1364;
                    return;
                }
            }
            int var4 = arg1.field1383;
            int var5 = arg1.field1384;
            int var6 = arg1.field1391[arg1.field1366 - 1] * 128 + arg1.field1370 * 64;
            int var7 = arg1.field1392[arg1.field1366 - 1] * 128 + arg1.field1370 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1389 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1389 = 1792;
                    } else {
                        arg1.field1389 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1389 = 768;
                    } else if (var5 > var7) {
                        arg1.field1389 = 256;
                    } else {
                        arg1.field1389 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1389 = 1024;
                } else {
                    arg1.field1389 = 0;
                }
                int var8 = arg1.field1389 - arg1.field1385 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1407;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1406;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1409;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1408;
                }
                if (var9 == -1) {
                    var9 = arg1.field1406;
                }
                arg1.field1386 = var9;
                if (arg0) {
                    this.field133 = -176;
                }
                int var10 = 4;
                if (arg1.field1389 != arg1.field1385 && arg1.field1382 == -1 && arg1.field1371 != 0) {
                    var10 = 2;
                }
                if (arg1.field1366 > 2) {
                    var10 = 6;
                }
                if (arg1.field1366 > 3) {
                    var10 = 8;
                }
                if (arg1.field1364 > 0 && arg1.field1366 > 1) {
                    var10 = 8;
                    --arg1.field1364;
                }
                if (arg1.field1375[arg1.field1366 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field1406 == arg1.field1386 && arg1.field1365 != -1) {
                    arg1.field1386 = arg1.field1365;
                }
                if (var4 < var6) {
                    arg1.field1383 += var10;
                    if (arg1.field1383 > var6) {
                        arg1.field1383 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1383 -= var10;
                    if (arg1.field1383 < var6) {
                        arg1.field1383 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1384 += var10;
                    if (arg1.field1384 > var7) {
                        arg1.field1384 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1384 -= var10;
                    if (arg1.field1384 < var7) {
                        arg1.field1384 = var7;
                    }
                }
                if (arg1.field1383 == var6 && arg1.field1384 == var7) {
                    --arg1.field1366;
                    if (arg1.field1376 > 0) {
                        --arg1.field1376;
                        return;
                    }
                }
            } else {
                arg1.field1383 = var6;
                arg1.field1384 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BLOZYWPVDM;)V")
    public final void method72(byte arg0, class47 arg1) {
        if (this.field441 == arg0) {
            if (arg1.field1371 != 0) {
                if (arg1.field1382 != -1 && arg1.field1382 < 32768) {
                    class42 var3 = this.field143[arg1.field1382];
                    if (var3 != null) {
                        int var4 = arg1.field1383 - var3.field1383;
                        int var5 = arg1.field1384 - var3.field1384;
                        if (var4 != 0 || var5 != 0) {
                            arg1.field1389 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                        }
                    }
                }
                if (arg1.field1382 >= 32768) {
                    int var6 = arg1.field1382 - 32768;
                    if (this.field526 == var6) {
                        var6 = this.field116;
                    }
                    class20 var7 = this.field117[var6];
                    if (var7 != null) {
                        int var8 = arg1.field1383 - var7.field1383;
                        int var9 = arg1.field1384 - var7.field1384;
                        if (var8 != 0 || var9 != 0) {
                            arg1.field1389 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg1.field1411 != 0 || arg1.field1412 != 0) && (arg1.field1366 == 0 || arg1.field1364 > 0)) {
                    int var10 = arg1.field1383 - (arg1.field1411 - this.field233 - this.field233) * 64;
                    int var11 = arg1.field1384 - (arg1.field1412 - this.field234 - this.field234) * 64;
                    if (var10 != 0 || var11 != 0) {
                        arg1.field1389 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                    }
                    arg1.field1411 = 0;
                    arg1.field1412 = 0;
                }
                int var12 = arg1.field1389 - arg1.field1385 & 2047;
                if (var12 != 0) {
                    if (var12 >= arg1.field1371 && var12 <= 2048 - arg1.field1371) {
                        if (var12 > 1024) {
                            arg1.field1385 -= arg1.field1371;
                        } else {
                            arg1.field1385 += arg1.field1371;
                        }
                    } else {
                        arg1.field1385 = arg1.field1389;
                    }
                    arg1.field1385 &= 2047;
                    if (arg1.field1402 == arg1.field1386 && arg1.field1389 != arg1.field1385) {
                        if (arg1.field1403 != -1) {
                            arg1.field1386 = arg1.field1403;
                            return;
                        }
                        arg1.field1386 = arg1.field1406;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILOZYWPVDM;)V")
    public final void method73(int arg0, class47 arg1) {
        this.field416 += arg0;
        arg1.field1354 = false;
        if (arg1.field1386 != -1) {
            class27 var3 = class27.field849[arg1.field1386];
            ++arg1.field1388;
            if (arg1.field1387 < var3.field850 && arg1.field1388 > var3.method240((byte) 0, arg1.field1387)) {
                arg1.field1388 = 0;
                ++arg1.field1387;
            }
            if (arg1.field1387 >= var3.field850) {
                arg1.field1388 = 0;
                arg1.field1387 = 0;
            }
        }
        if (arg1.field1359 != -1 && field247 >= arg1.field1362) {
            if (arg1.field1360 < 0) {
                arg1.field1360 = 0;
            }
            class27 var4 = class13.field688[arg1.field1359].field692;
            ++arg1.field1361;
            while (arg1.field1360 < var4.field850 && arg1.field1361 > var4.method240((byte) 0, arg1.field1360)) {
                arg1.field1361 -= var4.method240((byte) 0, arg1.field1360);
                ++arg1.field1360;
            }
            if (arg1.field1360 >= var4.field850 && (arg1.field1360 < 0 || arg1.field1360 >= var4.field850)) {
                arg1.field1359 = -1;
            }
        }
        if (arg1.field1377 != -1 && arg1.field1380 <= 1) {
            class27 var5 = class27.field849[arg1.field1377];
            if (var5.field861 == 1 && arg1.field1376 > 0 && arg1.field1397 <= field247 && arg1.field1398 < field247) {
                arg1.field1380 = 1;
                return;
            }
        }
        if (arg1.field1377 != -1 && arg1.field1380 == 0) {
            class27 var6 = class27.field849[arg1.field1377];
            ++arg1.field1379;
            while (arg1.field1378 < var6.field850 && arg1.field1379 > var6.method240((byte) 0, arg1.field1378)) {
                arg1.field1379 -= var6.method240((byte) 0, arg1.field1378);
                ++arg1.field1378;
            }
            if (arg1.field1378 >= var6.field850) {
                arg1.field1378 -= var6.field854;
                ++arg1.field1381;
                if (arg1.field1381 >= var6.field860) {
                    arg1.field1377 = -1;
                }
                if (arg1.field1378 < 0 || arg1.field1378 >= var6.field850) {
                    arg1.field1377 = -1;
                }
            }
            arg1.field1354 = var6.field856;
        }
        if (arg1.field1380 > 0) {
            --arg1.field1380;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method74(byte arg0) {
        if (this.field405 == -1 || this.field447 != 2 && super.field1077 == null) {
            if (this.field392) {
                this.method115(358);
                this.field392 = false;
                this.field488.method224(super.field1076, 966, 4, 0);
                this.field489.method224(super.field1076, 966, 357, 0);
                this.field490.method224(super.field1076, 966, 4, 722);
                this.field491.method224(super.field1076, 966, 205, 743);
                this.field492.method224(super.field1076, 966, 0, 0);
                this.field493.method224(super.field1076, 966, 4, 516);
                this.field494.method224(super.field1076, 966, 205, 516);
                this.field495.method224(super.field1076, 966, 357, 496);
                this.field496.method224(super.field1076, 966, 338, 0);
                this.field307 = true;
                this.field237 = true;
                this.field432 = true;
                this.field131 = true;
                if (this.field447 != 2) {
                    this.field88.method224(super.field1076, 966, 4, 4);
                    this.field87.method224(super.field1076, 966, 4, 550);
                }
            }
            if (this.field447 == 2) {
                this.method122(-15737);
            }
            if (this.field537 && this.field497 == 1) {
                this.field307 = true;
            }
            if (this.field195 != -1) {
                boolean var4 = this.method75(this.field355, this.field195, this.field512);
                if (var4) {
                    this.field307 = true;
                }
            }
            if (this.field207 == 2) {
                this.field307 = true;
            }
            if (this.field576 == 2) {
                this.field307 = true;
            }
            if (this.field307) {
                this.method181(42590);
                this.field307 = false;
            }
            if (this.field452 == -1 && this.field413 == 0) {
                this.field425.field1474 = this.field362 - this.field192 - 77;
                if (super.field1084 > 448 && super.field1084 < 560 && super.field1085 > 332) {
                    this.method50(-333, 77, super.field1084 - 17, this.field362, 463, this.field425, super.field1085 - 357, 0, -1);
                }
                int var5 = this.field362 - 77 - this.field425.field1474;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field362 - 77) {
                    var5 = this.field362 - 77;
                }
                if (this.field192 != var5) {
                    this.field192 = var5;
                    this.field237 = true;
                }
            }
            if (this.field452 == -1 && this.field413 == 3) {
                int var6 = this.field241 * 14 + 7;
                this.field425.field1474 = this.field244;
                if (super.field1084 > 448 && super.field1084 < 560 && super.field1085 > 332) {
                    this.method50(-333, 77, super.field1084 - 17, var6, 463, this.field425, super.field1085 - 357, 0, -1);
                }
                int var7 = this.field425.field1474;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field244 != var7) {
                    this.field244 = var7;
                    this.field237 = true;
                }
            }
            if (this.field452 != -1) {
                boolean var8 = this.method75(this.field355, this.field452, this.field512);
                if (var8) {
                    this.field237 = true;
                }
            }
            if (this.field207 == 3) {
                this.field237 = true;
            }
            if (this.field576 == 3) {
                this.field237 = true;
            }
            if (this.field375 != null) {
                this.field237 = true;
            }
            if (this.field537 && this.field497 == 2) {
                this.field237 = true;
            }
            if (this.field237) {
                this.method56(0);
                this.field237 = false;
            }
            if (this.field447 == 2) {
                this.method121((byte) 9);
                this.field87.method224(super.field1076, 966, 4, 550);
            }
            if (this.field263 != -1) {
                this.field432 = true;
            }
            if (this.field432) {
                if (this.field263 != -1 && this.field533 == this.field263) {
                    this.field263 = -1;
                    this.field532.method444(this.field134, 218);
                    this.field532.method445(this.field533);
                }
                this.field432 = false;
                this.field486.method223(-5281);
                this.field230.method566(0, 22912, 0);
                if (this.field195 == -1) {
                    if (this.field571[this.field533] != -1) {
                        if (this.field533 == 0) {
                            this.field382.method566(22, 22912, 10);
                        }
                        if (this.field533 == 1) {
                            this.field383.method566(54, 22912, 8);
                        }
                        if (this.field533 == 2) {
                            this.field383.method566(82, 22912, 8);
                        }
                        if (this.field533 == 3) {
                            this.field384.method566(110, 22912, 8);
                        }
                        if (this.field533 == 4) {
                            this.field386.method566(153, 22912, 8);
                        }
                        if (this.field533 == 5) {
                            this.field386.method566(181, 22912, 8);
                        }
                        if (this.field533 == 6) {
                            this.field385.method566(209, 22912, 9);
                        }
                    }
                    if (this.field571[0] != -1 && (this.field263 != 0 || field247 % 20 < 10)) {
                        this.field113[0].method566(29, 22912, 13);
                    }
                    if (this.field571[1] != -1 && (this.field263 != 1 || field247 % 20 < 10)) {
                        this.field113[1].method566(53, 22912, 11);
                    }
                    if (this.field571[2] != -1 && (this.field263 != 2 || field247 % 20 < 10)) {
                        this.field113[2].method566(82, 22912, 11);
                    }
                    if (this.field571[3] != -1 && (this.field263 != 3 || field247 % 20 < 10)) {
                        this.field113[3].method566(115, 22912, 12);
                    }
                    if (this.field571[4] != -1 && (this.field263 != 4 || field247 % 20 < 10)) {
                        this.field113[4].method566(153, 22912, 13);
                    }
                    if (this.field571[5] != -1 && (this.field263 != 5 || field247 % 20 < 10)) {
                        this.field113[5].method566(180, 22912, 11);
                    }
                    if (this.field571[6] != -1 && (this.field263 != 6 || field247 % 20 < 10)) {
                        this.field113[6].method566(208, 22912, 13);
                    }
                }
                this.field486.method224(super.field1076, 966, 160, 516);
                this.field485.method223(-5281);
                this.field229.method566(0, 22912, 0);
                if (this.field195 == -1) {
                    if (this.field571[this.field533] != -1) {
                        if (this.field533 == 7) {
                            this.field521.method566(42, 22912, 0);
                        }
                        if (this.field533 == 8) {
                            this.field522.method566(74, 22912, 0);
                        }
                        if (this.field533 == 9) {
                            this.field522.method566(102, 22912, 0);
                        }
                        if (this.field533 == 10) {
                            this.field523.method566(130, 22912, 1);
                        }
                        if (this.field533 == 11) {
                            this.field525.method566(173, 22912, 0);
                        }
                        if (this.field533 == 12) {
                            this.field525.method566(201, 22912, 0);
                        }
                        if (this.field533 == 13) {
                            this.field524.method566(229, 22912, 0);
                        }
                    }
                    if (this.field571[8] != -1 && (this.field263 != 8 || field247 % 20 < 10)) {
                        this.field113[7].method566(74, 22912, 2);
                    }
                    if (this.field571[9] != -1 && (this.field263 != 9 || field247 % 20 < 10)) {
                        this.field113[8].method566(102, 22912, 3);
                    }
                    if (this.field571[10] != -1 && (this.field263 != 10 || field247 % 20 < 10)) {
                        this.field113[9].method566(137, 22912, 4);
                    }
                    if (this.field571[11] != -1 && (this.field263 != 11 || field247 % 20 < 10)) {
                        this.field113[10].method566(174, 22912, 2);
                    }
                    if (this.field571[12] != -1 && (this.field263 != 12 || field247 % 20 < 10)) {
                        this.field113[11].method566(201, 22912, 2);
                    }
                    if (this.field571[13] != -1 && (this.field263 != 13 || field247 % 20 < 10)) {
                        this.field113[12].method566(226, 22912, 2);
                    }
                }
                this.field485.method224(super.field1076, 966, 466, 496);
                this.field88.method223(-5281);
                class6.field596 = this.field561;
            }
            if (this.field131) {
                this.field131 = false;
                this.field484.method223(-5281);
                this.field228.method566(0, 22912, 0);
                this.field342.method272(28, 16777215, 0, true, 55, "Public chat");
                if (this.field239 == 0) {
                    this.field342.method272(41, 65280, 0, true, 55, "On");
                }
                if (this.field239 == 1) {
                    this.field342.method272(41, 16776960, 0, true, 55, "Friends");
                }
                if (this.field239 == 2) {
                    this.field342.method272(41, 16711680, 0, true, 55, "Off");
                }
                if (this.field239 == 3) {
                    this.field342.method272(41, 65535, 0, true, 55, "Hide");
                }
                this.field342.method272(28, 16777215, 0, true, 184, "Private chat");
                if (this.field347 == 0) {
                    this.field342.method272(41, 65280, 0, true, 184, "On");
                }
                if (this.field347 == 1) {
                    this.field342.method272(41, 16776960, 0, true, 184, "Friends");
                }
                if (this.field347 == 2) {
                    this.field342.method272(41, 16711680, 0, true, 184, "Off");
                }
                this.field342.method272(28, 16777215, 0, true, 324, "Trade/compete");
                if (this.field439 == 0) {
                    this.field342.method272(41, 65280, 0, true, 324, "On");
                }
                if (this.field439 == 1) {
                    this.field342.method272(41, 16776960, 0, true, 324, "Friends");
                }
                if (this.field439 == 2) {
                    this.field342.method272(41, 16711680, 0, true, 324, "Off");
                }
                this.field342.method272(33, 16777215, 0, true, 458, "Report abuse");
                this.field484.method224(super.field1076, 966, 453, 0);
                this.field88.method223(-5281);
                class6.field596 = this.field561;
            }
            this.field355 = 0;
            if (arg0 == 4) {
                boolean var9 = false;
            } else {
                this.field417 = this.field402.method455();
            }
        } else {
            if (this.field447 == 2) {
                this.method75(this.field355, this.field405, this.field512);
                if (this.field90 != -1) {
                    this.method75(this.field355, this.field90, this.field512);
                }
                this.field355 = 0;
                this.method112(226);
                super.field1077.method223(-5281);
                class6.field596 = this.field562;
                class67.method571(false);
                this.field392 = true;
                class51 var2 = class51.method435(this.field405);
                if (var2.field1460 == 512 && var2.field1475 == 334 && var2.field1503 == 0) {
                    var2.field1460 = 765;
                    var2.field1475 = 503;
                }
                this.method129(-7410, 0, 0, var2, 0);
                if (this.field90 != -1) {
                    class51 var3 = class51.method435(this.field90);
                    if (var3.field1460 == 512 && var3.field1475 == 334 && var3.field1503 == 0) {
                        var3.field1460 = 765;
                        var3.field1475 = 503;
                    }
                    this.method129(-7410, 0, 0, var3, 0);
                }
                if (!this.field537) {
                    this.method65(false);
                    this.method102(this.field475);
                } else {
                    this.method155(true);
                }
            }
            super.field1077.method224(super.field1076, 966, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Z")
    public final boolean method75(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class51 var5 = class51.method435(arg1);
        for (int var6 = 0; var6 < var5.field1515.length && var5.field1515[var6] != -1; ++var6) {
            class51 var7 = class51.method435(var5.field1515[var6]);
            if (var7.field1503 == 0) {
                var4 |= this.method75(arg0, var7.field1485, this.field512);
            }
            if (var7.field1503 == 6 && (var7.field1454 != -1 || var7.field1455 != -1)) {
                boolean var8 = this.method165(285, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1455;
                } else {
                    var9 = var7.field1454;
                }
                if (var9 != -1) {
                    class27 var10 = class27.field849[var9];
                    var7.field1452 += arg0;
                    while (var7.field1452 > var10.method240((byte) 0, var7.field1514)) {
                        var7.field1452 -= var10.method240((byte) 0, var7.field1514) + 1;
                        ++var7.field1514;
                        if (var7.field1514 >= var10.field850) {
                            var7.field1514 -= var10.field854;
                            if (var7.field1514 < 0 || var7.field1514 >= var10.field850) {
                                var7.field1514 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1503 == 6 && var7.field1500 != 0) {
                int var11 = var7.field1500 >> 16;
                int var12 = var7.field1500 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field1483 = var7.field1483 + var13 & 2047;
                var7.field1484 = var7.field1484 + var14 & 2047;
                var4 = true;
            }
        }
        if (arg2 != -1109) {
            this.field417 = -1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    private final void method76(int arg0) {
        class17 var2 = (class17) this.field238.method33();
        if (arg0 != 29760) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (var2.field748 == -1) {
                var2.field749 = 0;
                this.method144(var2, 0);
            } else {
                var2.method505();
            }
            var2 = (class17) this.field238.method35((byte) 8);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method77(byte arg0) {
        try {
            this.field550 = -1;
            this.field549.method37();
            this.field555.method37();
            ++field451;
            if (field451 > 118) {
                field451 = 0;
                this.field532.method444(this.field134, 110);
                this.field532.method445(183);
            }
            class6.method188(0);
            this.method108(-751);
            this.field112.method364(true);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field208[var2].method5();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field320[var3][var4][var5] = 0;
                    }
                }
            }
            class30 var6 = new class30((byte) 102, 104, 104, this.field320, this.field423);
            int var7 = this.field483.length;
            this.field532.method444(this.field134, 30);
            if (!this.field346) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field180[var8] >> 8) * 64 - this.field233;
                    int var10 = (this.field180[var8] & 255) * 64 - this.field234;
                    byte[] var11 = this.field483[var8];
                    if (var11 != null) {
                        var6.method261(var9, 6, (this.field333 - 6) * 8, var10, this.field208, var11, (this.field332 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field180[var12] >> 8) * 64 - this.field233;
                    int var14 = (this.field180[var12] & 255) * 64 - this.field234;
                    byte[] var15 = this.field483[var12];
                    if (var15 == null && this.field333 < 800) {
                        var6.method256(64, var14, 64, (byte) 1, var13);
                    }
                }
                ++field138;
                if (field138 > 155) {
                    field138 = 0;
                    this.field532.method444(this.field134, 160);
                    this.field532.method448(1254944);
                }
                this.field532.method444(this.field134, 30);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field411[var16];
                    if (var17 != null) {
                        int var18 = (this.field180[var16] >> 8) * 64 - this.field233;
                        int var19 = (this.field180[var16] & 255) * 64 - this.field234;
                        var6.method251(var17, var19, true, var18, this.field112, this.field208);
                    }
                }
            }
            if (this.field346) {
                int var20 = 0;
                label265: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field305[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method256(8, var32 * 8, 8, (byte) 1, var31 * 8);
                                }
                            }
                        }
                        this.field532.method444(this.field134, 30);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label265;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field305[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field180.length; ++var43) {
                                            if (this.field180[var43] == var42 && this.field411[var43] != null) {
                                                var6.method245(this.field208, this.field411[var43], (var40 & 7) * 8, (var41 & 7) * 8, var38, var35 * 8, 0, var34, var36 * 8, var39, this.field112);
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
                            int var24 = this.field305[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field180.length; ++var30) {
                                    if (this.field180[var30] == var29 && this.field483[var30] != null) {
                                        var6.method244(var21 * 8, var26, (var27 & 7) * 8, (var28 & 7) * 8, var22 * 8, this.field168, var20, this.field483[var30], this.field208, var25);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method255(var21 * 8, var22 * 8, var20, (byte) 7);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field532.method444(this.field134, 30);
            var6.method259(this.field208, this.field112, -2206);
            if (this.field88 != null) {
                this.field88.method223(-5281);
                class6.field596 = this.field561;
            }
            this.field532.method444(this.field134, 30);
            int var44 = class30.field905;
            if (var44 > this.field372) {
                var44 = this.field372;
            }
            if (var44 < this.field372 - 1) {
                int var45 = this.field372 - 1;
            }
            if (field291) {
                this.field112.method365(class30.field905, (byte) -43);
            } else {
                this.field112.method365(0, (byte) -43);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method126(var46, var47);
                }
            }
            this.method76(29760);
        } catch (Exception var61) {
        }
        class39.field1144.method442();
        if (super.field1079 != null) {
            this.field532.method444(this.field134, 239);
            this.field532.method449(1057001181);
        }
        if (field291 && signlink.cache_dat != null) {
            int var49 = this.field517.method348(0, false);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field517.method353(true, var50);
                if ((var51 & 121) == 0) {
                    class37.method290(var50, -40577);
                }
            }
        }
        System.gc();
        class6.method189(0, 20);
        this.field517.method343((byte) -72);
        if (arg0 == 7) {
            boolean var52 = false;
        } else {
            this.field188 = this.field551.method236();
        }
        int var53 = (this.field332 - 6) / 8 - 1;
        int var54 = (this.field332 + 6) / 8 + 1;
        int var55 = (this.field333 - 6) / 8 - 1;
        int var56 = (this.field333 + 6) / 8 + 1;
        if (this.field400) {
            var53 = 49;
            var54 = 50;
            var55 = 49;
            var56 = 50;
        }
        for (int var57 = var53; var57 <= var54; ++var57) {
            for (int var58 = var55; var58 <= var56; ++var58) {
                if (var53 == var57 || var54 == var57 || var55 == var58 || var56 == var58) {
                    int var59 = this.field517.method352(var58, 208, var57, 0);
                    if (var59 != -1) {
                        this.field517.method338(false, var59, 3);
                    }
                    int var60 = this.field517.method352(var58, 208, var57, 1);
                    if (var60 != -1) {
                        this.field517.method338(false, var60, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
    public final int method78(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.method113();
        }
        int var5 = 256 - arg1;
        return ((arg2 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg2 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method79(byte arg0) {
        if (this.field393 == 2) {
            this.method137((this.field378 - this.field234 << 7) + this.field381, this.field379 * 2, false, (this.field377 - this.field233 << 7) + this.field380);
            if (arg0 == 4) {
                if (this.field178 > -1 && field247 % 20 < 10) {
                    this.field190[0].method596(this.field178 - 12, 22912, this.field179 - 28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < this.field223; ++var2) {
                if (this.field91[var2] <= 0) {
                    boolean var3 = false;
                    try {
                        if (this.field443[var2] == this.field287 && this.field324[var2] == this.field404) {
                            if (!this.method111(0)) {
                                var3 = true;
                            }
                        } else {
                            class53 var4 = class14.method212(this.field443[var2], this.field324[var2], 0);
                            if (System.currentTimeMillis() + (long) (var4.field1539 / 22) > (long) (this.field554 / 22) + this.field220) {
                                this.field554 = var4.field1539;
                                this.field220 = System.currentTimeMillis();
                                if (this.method105(var4.field1539, true, var4.field1538)) {
                                    this.field287 = this.field443[var2];
                                    this.field404 = this.field324[var2];
                                } else {
                                    var3 = true;
                                }
                            }
                        }
                    } catch (Exception var7) {
                        if (signlink.reporterror) {
                            this.field532.method444(this.field134, 142);
                            this.field532.method446(this.field443[var2] & 32767);
                        } else {
                            this.field532.method444(this.field134, 142);
                            this.field532.method446(-1);
                        }
                    }
                    if (var3 && this.field91[var2] != -5) {
                        this.field91[var2] = -5;
                    } else {
                        --this.field223;
                        for (int var6 = var2; var6 < this.field223; ++var6) {
                            this.field443[var6] = this.field443[var6 + 1];
                            this.field324[var6] = this.field324[var6 + 1];
                            this.field91[var6] = this.field91[var6 + 1];
                        }
                        --var2;
                    }
                } else {
                    int var10002 = this.field91[var2]--;
                }
            }
            if (this.field403 > 0) {
                this.field403 -= 20;
                if (this.field403 < 0) {
                    this.field403 = 0;
                }
                if (this.field403 == 0 && this.field170 && !field291) {
                    this.field183 = this.field254;
                    this.field184 = true;
                    this.field517.method337(2, this.field183);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method81(String arg0) throws IOException {
        if (!this.field349) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field359 != null) {
                try {
                    this.field359.close();
                } catch (Exception var4) {
                }
                this.field359 = null;
            }
            this.field359 = this.method38(43595);
            this.field359.setSoTimeout(10000);
            InputStream var2 = this.field359.getInputStream();
            OutputStream var3 = this.field359.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method82(int arg0) {
        this.field416 += arg0;
        for (int var2 = -1; var2 < this.field118; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field116;
            } else {
                var3 = this.field119[var2];
            }
            class20 var4 = this.field117[var3];
            if (var4 != null) {
                this.method68(1, var4, 9);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIGCQCHAY;LRGCGKKUR;III)V")
    private final void method83(class20 arg0, class53 arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            this.field417 = arg1.method455();
        }
        if ((arg4 & 64) != 0) {
            int var6 = arg1.method482(26085);
            int var7 = arg1.method474(0);
            int var8 = arg1.method473(false);
            int var9 = arg1.field1539;
            if (arg0.field785 != null && arg0.field786) {
                long var10 = class55.method497(arg0.field785);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < this.field412; ++var13) {
                        if (this.field123[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && this.field141 == 0) {
                    try {
                        this.field142.field1539 = 0;
                        arg1.method492(true, this.field142.field1538, var8, 0);
                        this.field142.field1539 = 0;
                        String var14 = class71.method588(this.field142, var8, 0);
                        String var15 = class62.method524(var14, true);
                        arg0.field1367 = var15;
                        arg0.field1369 = var6 >> 8;
                        arg0.field1405 = var6 & 255;
                        arg0.field1390 = 150;
                        if (var7 != 2 && var7 != 3) {
                            if (var7 == 1) {
                                this.method163((byte) -83, var15, 1, "@cr1@" + arg0.field785);
                            } else {
                                this.method163((byte) -83, var15, 2, arg0.field785);
                            }
                        } else {
                            this.method163((byte) -83, var15, 1, "@cr2@" + arg0.field785);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field1539 = var8 + var9;
        }
        if ((arg4 & 128) != 0) {
            int var17 = arg1.method474(0);
            byte[] var18 = new byte[var17];
            class53 var19 = new class53(var18, (byte) -17);
            arg1.method492(true, var18, var17, 0);
            this.field122[arg2] = var19;
            arg0.method226(false, var19);
        }
        if ((arg4 & 1024) != 0) {
            arg0.field1359 = arg1.method483(this.field159);
            int var20 = arg1.method490((byte) 0);
            arg0.field1363 = var20 >> 16;
            arg0.field1362 = (var20 & 65535) + field247;
            arg0.field1360 = 0;
            arg0.field1361 = 0;
            if (arg0.field1362 > field247) {
                arg0.field1360 = -1;
            }
            if (arg0.field1359 == 65535) {
                arg0.field1359 = -1;
            }
        }
        if ((arg4 & 1) != 0) {
            int var21 = arg1.method481(false);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = arg1.method473(false);
            if (arg0.field1377 == var21 && var21 != -1) {
                int var23 = class27.field849[var21].field863;
                if (var23 == 1) {
                    arg0.field1378 = 0;
                    arg0.field1379 = 0;
                    arg0.field1380 = var22;
                    arg0.field1381 = 0;
                }
                if (var23 == 2) {
                    arg0.field1381 = 0;
                }
            } else if (var21 == -1 || arg0.field1377 == -1 || class27.field849[var21].field857 >= class27.field849[arg0.field1377].field857) {
                arg0.field1377 = var21;
                arg0.field1378 = 0;
                arg0.field1379 = 0;
                arg0.field1380 = var22;
                arg0.field1381 = 0;
                arg0.field1376 = arg0.field1366;
            }
        }
        if ((arg4 & 256) != 0) {
            int var24 = arg1.method455();
            int var25 = arg1.method455();
            arg0.method421((byte) 16, field247, var24, var25);
            arg0.field1355 = field247 + 300;
            arg0.field1356 = arg1.method475(true);
            arg0.field1357 = arg1.method473(false);
        }
        if ((arg4 & 512) != 0) {
            arg0.field1393 = arg1.method475(true);
            arg0.field1395 = arg1.method474(0);
            arg0.field1394 = arg1.method455();
            arg0.field1396 = arg1.method474(0);
            arg0.field1397 = arg1.method483(this.field159) + field247;
            arg0.field1398 = arg1.method482(26085) + field247;
            arg0.field1399 = arg1.method475(true);
            arg0.method422(926);
        }
        if ((arg4 & 4) != 0) {
            arg0.field1382 = arg1.method482(26085);
            if (arg0.field1382 == 65535) {
                arg0.field1382 = -1;
            }
        }
        if ((arg4 & 2) != 0) {
            arg0.field1411 = arg1.method483(this.field159);
            arg0.field1412 = arg1.method481(false);
        }
        if ((arg4 & 16) != 0) {
            int var26 = arg1.method473(false);
            int var27 = arg1.method474(0);
            arg0.method421((byte) 16, field247, var26, var27);
            arg0.field1355 = field247 + 300;
            arg0.field1356 = arg1.method474(0);
            arg0.field1357 = arg1.method474(0);
        }
        if ((arg4 & 8) != 0) {
            arg0.field1367 = arg1.method462();
            if (arg0.field1367.charAt(0) == '~') {
                arg0.field1367 = arg0.field1367.substring(1);
                this.method163((byte) -83, arg0.field1367, 2, arg0.field785);
            } else if (field219 == arg0) {
                this.method163((byte) -83, arg0.field1367, 2, arg0.field785);
            }
            arg0.field1369 = 0;
            arg0.field1405 = 0;
            arg0.field1390 = 150;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQUBPQDMQ;I)V")
    public final void method84(class51 arg0, int arg1) {
        if (arg1 != 0) {
            this.method113();
        }
        int var3 = arg0.field1497;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field434;
                if (this.field435 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg0.field1467 = "";
                    arg0.field1486 = 0;
                } else {
                    if (this.field139[var3] == 0) {
                        arg0.field1467 = "@red@Offline";
                    } else if (this.field139[var3] < 200) {
                        if (this.field139[var3] == field288) {
                            arg0.field1467 = "@gre@World" + (this.field139[var3] - 9);
                        } else {
                            arg0.field1467 = "@yel@World" + (this.field139[var3] - 9);
                        }
                    } else if (this.field139[var3] == field288) {
                        arg0.field1467 = "@gre@Classic" + (this.field139[var3] - 219);
                    } else {
                        arg0.field1467 = "@yel@Classic" + (this.field139[var3] - 219);
                    }
                    arg0.field1486 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field434;
                if (this.field435 != 2) {
                    var6 = 0;
                }
                arg0.field1472 = var6 * 15 + 20;
                if (arg0.field1472 <= arg0.field1475) {
                    arg0.field1472 = arg0.field1475 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field435 == 0) {
                    arg0.field1467 = "Loading ignore list";
                    arg0.field1486 = 0;
                } else if (var3 == 1 && this.field435 == 0) {
                    arg0.field1467 = "Please wait...";
                    arg0.field1486 = 0;
                } else {
                    int var7 = this.field412;
                    if (this.field435 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field1467 = "";
                        arg0.field1486 = 0;
                    } else {
                        arg0.field1467 = class55.method501(class55.method498(-39, this.field123[var3]), false);
                        arg0.field1486 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field1472 = this.field412 * 15 + 20;
                if (arg0.field1472 <= arg0.field1475) {
                    arg0.field1472 = arg0.field1475 + 1;
                }
            } else if (var3 == 327) {
                arg0.field1483 = 150;
                arg0.field1484 = (int) (Math.sin((double) field247 / 40.0D) * 256.0D) & 2047;
                if (this.field446) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field361[var8];
                        if (var15 >= 0 && !class21.field805[var15].method232(827)) {
                            return;
                        }
                    }
                    this.field446 = false;
                    class37[] var9 = new class37[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field361[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class21.field805[var14].method233(-15);
                        }
                    }
                    class37 var12 = new class37(183, var9, var10);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field96[var13] != 0) {
                            var12.method305(field264[var13][0], field264[var13][this.field96[var13]]);
                            if (var13 == 1) {
                                var12.method305(field564[0], field564[this.field96[var13]]);
                            }
                        }
                    }
                    var12.method298(false);
                    var12.method299(class27.field849[field219.field1402].field851[0], 0);
                    var12.method308(64, 850, -30, -50, -30, true);
                    arg0.field1501 = 5;
                    arg0.field1502 = 0;
                    class51.method430(var12, 0, 5, false);
                }
            } else if (var3 == 324) {
                if (this.field515 == null) {
                    this.field515 = arg0.field1491;
                    this.field516 = arg0.field1450;
                }
                if (this.field530) {
                    arg0.field1491 = this.field516;
                } else {
                    arg0.field1491 = this.field515;
                }
            } else if (var3 == 325) {
                if (this.field515 == null) {
                    this.field515 = arg0.field1491;
                    this.field516 = arg0.field1450;
                }
                if (this.field530) {
                    arg0.field1491 = this.field515;
                } else {
                    arg0.field1491 = this.field516;
                }
            } else if (var3 == 600) {
                arg0.field1467 = this.field256;
                if (field247 % 20 < 10) {
                    arg0.field1467 = arg0.field1467 + "|";
                } else {
                    arg0.field1467 = arg0.field1467 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field399 >= 1) {
                        if (this.field563) {
                            arg0.field1459 = 16711680;
                            arg0.field1467 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field1459 = 16777215;
                            arg0.field1467 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1467 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field297 - this.field414;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg0.field1467 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field322 == 0) {
                        arg0.field1467 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field322 <= this.field297) {
                        arg0.field1467 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method85(5, this.field322);
                    } else {
                        int var18 = this.field297 + 14 - this.field322;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg0.field1467 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method85(5, this.field322) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field502 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field502 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field502 + " unread messages";
                    }
                    arg0.field1467 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field546 > 0 && this.field546 <= this.field297 + 10) {
                        arg0.field1467 = "Last password change:\\n@gre@" + this.method85(5, this.field546);
                    } else {
                        arg0.field1467 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field573 > 2 && !field290) {
                        arg0.field1467 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field573 > 2) {
                        arg0.field1467 = "\\n\\nYou have @gre@" + this.field573 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field573 > 0) {
                        arg0.field1467 = "You have @gre@" + this.field573 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field1467 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field573 > 2 && !field290) {
                        arg0.field1467 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field573 > 0) {
                        arg0.field1467 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field1467 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field322 > this.field297) {
                        arg0.field1467 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field1467 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field435 == 0) {
            arg0.field1467 = "Loading friend list";
            arg0.field1486 = 0;
        } else if (var3 == 1 && this.field435 == 1) {
            arg0.field1467 = "Connecting to friendserver";
            arg0.field1486 = 0;
        } else if (var3 == 2 && this.field435 != 2) {
            arg0.field1467 = "Please wait...";
            arg0.field1486 = 0;
        } else {
            int var4 = this.field434;
            if (this.field435 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg0.field1467 = "";
                arg0.field1486 = 0;
            } else {
                arg0.field1467 = this.field460[var3];
                arg0.field1486 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method85(int arg0, int arg1) {
        if (arg1 > this.field297 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            if (arg0 < 5 || arg0 > 5) {
                this.field417 = -1;
            }
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        if (arg0) {
            this.field512 = this.field551.method236();
        }
        for (class12 var2 = (class12) this.field549.method33(); var2 != null; var2 = (class12) this.field549.method35((byte) 8)) {
            if (this.field372 == var2.field680 && !var2.field678) {
                if (field247 >= var2.field677) {
                    var2.method207(this.field355, (byte) 0);
                    if (var2.field678) {
                        var2.method505();
                    } else {
                        this.field112.method375(var2.field682, var2.field683, -1, 0, var2.field680, false, var2.field681, false, var2, 60);
                    }
                }
            } else {
                var2.method505();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIII)V")
    public final void method87(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field216.method566(arg3, 22912, arg4);
        this.field217.method566(arg3, 22912, arg2 + arg4 - 16);
        class67.method573((byte) 4, arg4 + 16, arg3, this.field371, arg2 - 32, 16);
        int var7 = (arg2 - 32) * arg2 / arg0;
        if (arg1 != 89) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        if (var7 < 8) {
            var7 = 8;
        }
        int var9 = (arg2 - 32 - var7) * arg5 / (arg0 - arg2);
        class67.method573((byte) 4, arg4 + 16 + var9, arg3, this.field482, var7, 16);
        class67.method578(this.field226, this.field218, var7, arg4 + 16 + var9, arg3);
        class67.method578(this.field226, this.field218, var7, arg4 + 16 + var9, arg3 + 1);
        class67.method576(arg3, 16, 893, arg4 + 16 + var9, this.field218);
        class67.method576(arg3, 16, 893, arg4 + 17 + var9, this.field218);
        class67.method578(this.field226, this.field298, var7, arg4 + 16 + var9, arg3 + 15);
        class67.method578(this.field226, this.field298, var7 - 1, arg4 + 17 + var9, arg3 + 14);
        class67.method576(arg3, 16, 893, arg4 + 15 + var9 + var7, this.field298);
        class67.method576(arg3 + 1, 15, 893, arg4 + 14 + var9 + var7, this.field298);
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method88(int arg0) {
        short var2 = 256;
        if (this.field351 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field351 > 768) {
                    this.field250[var3] = this.method78(true, 1024 - this.field351, this.field252[var3], this.field251[var3]);
                } else if (this.field351 > 256) {
                    this.field250[var3] = this.field252[var3];
                } else {
                    this.field250[var3] = this.method78(true, 256 - this.field351, this.field251[var3], this.field252[var3]);
                }
            }
        } else if (this.field352 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field352 > 768) {
                    this.field250[var4] = this.method78(true, 1024 - this.field352, this.field253[var4], this.field251[var4]);
                } else if (this.field352 > 256) {
                    this.field250[var4] = this.field253[var4];
                } else {
                    this.field250[var4] = this.method78(true, 256 - this.field352, this.field251[var4], this.field253[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field250[var5] = this.field251[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field314.field763[var6] = this.field508.field1766[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field450[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field271[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field250[var26];
                    int var30 = this.field314.field763[var8];
                    this.field314.field763[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field314.method224(super.field1076, 966, 0, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field315.field763[var10] = this.field509.field1766[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field450[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field271[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field250[var18];
                    int var22 = this.field315.field763[var16];
                    this.field315.field763[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field315.method224(super.field1076, 966, 0, 637);
        if (arg0 < 3 || arg0 > 3) {
            this.field194 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method89(int arg0, int arg1) {
        if (arg1 != 27004) {
            throw new NullPointerException();
        } else if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method90(boolean arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field434; ++var3) {
                if (arg1.equalsIgnoreCase(this.field460[var3])) {
                    return true;
                }
            }
            if (!arg0) {
                field325 = this.field551.method236();
            }
            return arg1.equalsIgnoreCase(field219.field785);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public final void method91(byte arg0, boolean arg1) {
        this.method109(-453);
        if (arg0 != 6) {
            this.field417 = -1;
        }
        this.field313.method223(-5281);
        this.field389.method566(0, 22912, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field360 == 0) {
            int var5 = var4 / 2 + 80;
            this.field341.method272(var5, 7711145, 0, true, var3 / 2, this.field517.field1171);
            int var6 = var4 / 2 - 20;
            this.field343.method272(var6, 16776960, 0, true, var3 / 2, "Welcome to RuneScape");
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field390.method566(var7 - 73, 22912, var8 - 20);
            this.field343.method272(var8 + 5, 16777215, 0, true, var7, "New User");
            int var9 = var3 / 2 + 80;
            this.field390.method566(var9 - 73, 22912, var8 - 20);
            this.field343.method272(var8 + 5, 16777215, 0, true, var9, "Existing User");
        }
        if (this.field360 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field334.length() > 0) {
                this.field343.method272(var10 - 15, 16776960, 0, true, var3 / 2, this.field334);
                this.field343.method272(var10, 16776960, 0, true, var3 / 2, this.field335);
                var10 += 30;
            } else {
                this.field343.method272(var10 - 7, 16776960, 0, true, var3 / 2, this.field335);
                var10 += 30;
            }
            this.field343.method279("Username: " + this.field421 + (this.field536 == 0 & field247 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 90, var10, true, 0, 16777215);
            var10 += 15;
            this.field343.method279("Password: " + class55.method502(this.field422, -799) + (this.field536 == 1 & field247 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 88, var10, true, 0, 16777215);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field390.method566(var11 - 73, 22912, var12 - 20);
                this.field343.method272(var12 + 5, 16777215, 0, true, var11, "Login");
                int var13 = var3 / 2 + 80;
                this.field390.method566(var13 - 73, 22912, var12 - 20);
                this.field343.method272(var12 + 5, 16777215, 0, true, var13, "Cancel");
            }
        }
        if (this.field360 == 3) {
            this.field343.method272(var4 / 2 - 60, 16776960, 0, true, var3 / 2, "Create a free account");
            int var14 = var4 / 2 - 35;
            this.field343.method272(var14, 16777215, 0, true, var3 / 2, "To create a new account you need to");
            int var18 = var14 + 15;
            this.field343.method272(var18, 16777215, 0, true, var3 / 2, "go back to the main RuneScape webpage");
            int var19 = var18 + 15;
            this.field343.method272(var19, 16777215, 0, true, var3 / 2, "and choose the 'create account'");
            int var20 = var19 + 15;
            this.field343.method272(var20, 16777215, 0, true, var3 / 2, "button near the top of that page.");
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field390.method566(var15 - 73, 22912, var16 - 20);
            this.field343.method272(var16 + 5, 16777215, 0, true, var15, "Cancel");
        }
        this.field313.method224(super.field1076, 966, 171, 202);
        if (this.field392) {
            this.field392 = false;
            this.field311.method224(super.field1076, 966, 0, 128);
            this.field312.method224(super.field1076, 966, 371, 202);
            this.field316.method224(super.field1076, 966, 265, 0);
            this.field317.method224(super.field1076, 966, 265, 562);
            this.field318.method224(super.field1076, 966, 171, 128);
            this.field319.method224(super.field1076, 966, 171, 562);
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method92(int arg0) {
        this.field406 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field259) {
                ++this.field410;
                this.method145((byte) 2);
                this.method145((byte) 2);
                this.method88(3);
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
        this.field406 = false;
        this.field416 += arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILRGCGKKUR;)V")
    private final void method93(int arg0, int arg1, class53 arg2) {
        this.field161 = 0;
        this.field120 = 0;
        if (arg0 < 5 || arg0 > 5) {
            this.field160 = !this.field160;
        }
        this.method41(arg1, arg2, false);
        this.method47(false, arg2, arg1);
        this.method64(arg2, arg1, (byte) 5);
        for (int var4 = 0; var4 < this.field161; ++var4) {
            int var6 = this.field162[var4];
            if (field247 != this.field143[var6].field1410) {
                this.field143[var6].field1206 = null;
                this.field143[var6] = null;
            }
        }
        if (arg2.field1539 != arg1) {
            signlink.reporterror(this.field421 + " size mismatch in getnpcpos - pos:" + arg2.field1539 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field144; ++var5) {
                if (this.field143[this.field145[var5]] == null) {
                    signlink.reporterror(this.field421 + " null entry in npc list - pos:" + var5 + " size:" + this.field144);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method94(byte arg0) {
        try {
            if (this.field348 != null) {
                this.field348.method506();
            }
        } catch (Exception var4) {
        }
        this.field348 = null;
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field176 = !this.field176;
        }
        this.field196 = false;
        this.field360 = 0;
        this.field421 = "";
        this.field422 = "";
        this.method108(-751);
        this.field112.method364(true);
        for (int var3 = 0; var3 < 4; ++var3) {
            this.field208[var3].method5();
        }
        System.gc();
        this.method166(2);
        this.field254 = -1;
        this.field183 = -1;
        this.field403 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public final void method95(String arg0, String arg1, int arg2) {
        if (this.field477 != arg2) {
            this.field417 = -1;
        }
        if (this.field88 != null) {
            this.field88.method223(-5281);
            class6.field596 = this.field561;
            int var4 = 151;
            if (arg0 != null) {
                var4 -= 7;
            }
            this.field342.method271(257, 41480, 0, arg1, var4);
            this.field342.method271(256, 41480, 16777215, arg1, var4 - 1);
            var4 += 15;
            if (arg0 != null) {
                this.field342.method271(257, 41480, 0, arg0, var4);
                this.field342.method271(256, 41480, 16777215, arg0, var4 - 1);
            }
            this.field88.method224(super.field1076, 966, 4, 4);
        } else if (super.field1077 != null) {
            super.field1077.method223(-5281);
            class6.field596 = this.field562;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class67.method573((byte) 4, var5 - 5 - var7 / 2, 383 - var6 / 2, 0, var7, var6);
            class67.method574(var7, var5 - 5 - var7 / 2, 606, 383 - var6 / 2, 16777215, var6);
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field342.method271(383, 41480, 0, arg1, var5);
            this.field342.method271(382, 41480, 16777215, arg1, var5 - 1);
            var5 += 15;
            if (arg0 != null) {
                this.field342.method271(383, 41480, 0, arg0, var5);
                this.field342.method271(382, 41480, 16777215, arg0, var5 - 1);
            }
            super.field1077.method224(super.field1076, 966, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LRGCGKKUR;II)V")
    private final void method96(class53 arg0, int arg1, int arg2) {
        arg0.method465(this.field221);
        int var4 = 88 / arg2;
        int var5 = arg0.method466(1, true);
        if (var5 != 0) {
            int var6 = arg0.method466(2, true);
            if (var6 == 0) {
                this.field121[this.field120++] = this.field116;
            } else if (var6 == 1) {
                int var7 = arg0.method466(3, true);
                field219.method420(var7, false, this.field339);
                int var8 = arg0.method466(1, true);
                if (var8 == 1) {
                    this.field121[this.field120++] = this.field116;
                }
            } else if (var6 == 2) {
                int var9 = arg0.method466(3, true);
                field219.method420(var9, true, this.field339);
                int var10 = arg0.method466(3, true);
                field219.method420(var10, true, this.field339);
                int var11 = arg0.method466(1, true);
                if (var11 == 1) {
                    this.field121[this.field120++] = this.field116;
                }
            } else if (var6 == 3) {
                this.field372 = arg0.method466(2, true);
                int var12 = arg0.method466(7, true);
                int var13 = arg0.method466(1, true);
                if (var13 == 1) {
                    this.field121[this.field120++] = this.field116;
                }
                int var14 = arg0.method466(7, true);
                int var15 = arg0.method466(1, true);
                field219.method419(var12, -9787, var14, var15 == 1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method97(int arg0) {
        if (this.field300 != 0) {
            class33 var2 = this.field342;
            int var3 = 0;
            if (this.field481 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field438[var4] != null) {
                    int var6 = this.field436[var4];
                    String var7 = this.field437[var4];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field347 == 0 || this.field347 == 1 && this.method90(true, var7))) {
                        int var9 = 329 - var3 * 13;
                        byte var10 = 4;
                        var2.method275(0, (byte) 118, "From", var9, var10);
                        var2.method275(65535, (byte) 118, "From", var9 - 1, var10);
                        int var11 = var10 + var2.method273(1, "From ");
                        if (var8 == 1) {
                            this.field370[0].method566(var11, 22912, var9 - 12);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field370[1].method566(var11, 22912, var9 - 12);
                            var11 += 14;
                        }
                        var2.method275(0, (byte) 118, var7 + ": " + this.field438[var4], var9, var11);
                        var2.method275(65535, (byte) 118, var7 + ": " + this.field438[var4], var9 - 1, var11);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field347 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method275(0, (byte) 118, this.field438[var4], var12, 4);
                        var2.method275(65535, (byte) 118, this.field438[var4], var12 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field347 < 2) {
                        int var13 = 329 - var3 * 13;
                        var2.method275(0, (byte) 118, "To " + var7 + ": " + this.field438[var4], var13, 4);
                        var2.method275(65535, (byte) 118, "To " + var7 + ": " + this.field438[var4], var13 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            int var5 = 68 / arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIII)V")
    private final void method98(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class17 var11 = null;
        for (class17 var12 = (class17) this.field238.method33(); var12 != null; var12 = (class17) this.field238.method35((byte) 8)) {
            if (var12.field744 == arg8 && var12.field746 == arg3 && var12.field747 == arg4 && var12.field745 == arg7) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class17();
            var11.field744 = arg8;
            var11.field745 = arg7;
            var11.field746 = arg3;
            var11.field747 = arg4;
            this.method144(var11, 0);
            this.field238.method30(var11);
        }
        var11.field750 = arg2;
        var11.field752 = arg6;
        var11.field751 = arg5;
        var11.field749 = arg1;
        if (arg0) {
            for (int var13 = 1; var13 > 0; ++var13) {
            }
        }
        var11.field748 = arg9;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method99(boolean arg0, int arg1) {
        if (arg0) {
            this.field431 = 86;
        }
        if (!field291) {
            for (int var3 = 0; var3 < this.field506.length; ++var3) {
                int var4 = this.field506[var3];
                if (class6.field604[var4] >= arg1) {
                    class66 var5 = class6.field598[var4];
                    int var6 = var5.field1678 * var5.field1677 - 1;
                    int var7 = this.field355 * var5.field1677 * 2;
                    byte[] var8 = var5.field1675;
                    byte[] var9 = this.field84;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1675 = var9;
                    this.field84 = var8;
                    class6.method192(var4, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method100(int arg0) {
        int var2 = 56 / arg0;
        this.field446 = true;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field361[var3] = -1;
            for (int var4 = 0; var4 < class21.field804; ++var4) {
                if (!class21.field805[var4].field811 && class21.field805[var4].field806 == var3 + (this.field530 ? 0 : 7)) {
                    this.field361[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method101(boolean arg0) {
        if (arg0) {
            this.method113();
        }
        this.field392 = true;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method102(byte arg0) {
        if (this.field147 >= 2 || this.field149 != 0 || this.field567 != 0) {
            String var2;
            if (this.field149 == 1 && this.field147 < 2) {
                var2 = "Use " + this.field153 + " with...";
            } else if (this.field567 == 1 && this.field147 < 2) {
                var2 = this.field570 + "...";
            } else {
                var2 = this.field209[this.field147 - 1];
            }
            if (this.field147 > 2) {
                var2 = var2 + "@whi@ / " + (this.field147 - 2) + " more options";
            }
            this.field343.method280(15, var2, 856, 4, true, 16777215, field247 / 1000);
            if (arg0 == 7) {
                boolean var3 = false;
            } else {
                this.field477 = this.field551.method236();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method103(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            this.field532.method445(65);
        }
        for (int var2 = -1; var2 < this.field118; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field116;
            } else {
                var6 = this.field119[var2];
            }
            class20 var7 = this.field117[var6];
            if (var7 != null && var7.field1390 > 0) {
                --var7.field1390;
                if (var7.field1390 == 0) {
                    var7.field1367 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field144; ++var3) {
            int var4 = this.field145[var3];
            class42 var5 = this.field143[var4];
            if (var5 != null && var5.field1390 > 0) {
                --var5.field1390;
                if (var5.field1390 == 0) {
                    var5.field1367 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)V")
    public final void method104(int arg0, byte arg1, int arg2) {
        if (arg1 == 2) {
            boolean var4 = false;
        } else {
            this.method113();
        }
        int var5 = 0;
        for (int var6 = 0; var6 < 100; ++var6) {
            if (this.field438[var6] != null) {
                int var7 = this.field436[var6];
                int var8 = 70 - var5 * 14 + this.field192 + 4;
                if (var8 < -20) {
                    break;
                }
                String var9 = this.field437[var6];
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
                    ++var5;
                }
                if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field239 == 0 || this.field239 == 1 && this.method90(true, var9))) {
                    if (arg0 > var8 - 14 && arg0 <= var8 && !var9.equals(field219.field785)) {
                        if (this.field399 >= 1) {
                            this.field209[this.field147] = "Report abuse @whi@" + var9;
                            this.field366[this.field147] = 541;
                            ++this.field147;
                        }
                        this.field209[this.field147] = "Add ignore @whi@" + var9;
                        this.field366[this.field147] = 997;
                        ++this.field147;
                        this.field209[this.field147] = "Add friend @whi@" + var9;
                        this.field366[this.field147] = 138;
                        ++this.field147;
                    }
                    ++var5;
                }
                if ((var7 == 3 || var7 == 7) && this.field300 == 0 && (var7 == 7 || this.field347 == 0 || this.field347 == 1 && this.method90(true, var9))) {
                    if (arg0 > var8 - 14 && arg0 <= var8) {
                        if (this.field399 >= 1) {
                            this.field209[this.field147] = "Report abuse @whi@" + var9;
                            this.field366[this.field147] = 541;
                            ++this.field147;
                        }
                        this.field209[this.field147] = "Add ignore @whi@" + var9;
                        this.field366[this.field147] = 997;
                        ++this.field147;
                        this.field209[this.field147] = "Add friend @whi@" + var9;
                        this.field366[this.field147] = 138;
                        ++this.field147;
                    }
                    ++var5;
                }
                if (var7 == 4 && (this.field439 == 0 || this.field439 == 1 && this.method90(true, var9))) {
                    if (arg0 > var8 - 14 && arg0 <= var8) {
                        this.field209[this.field147] = "Accept trade @whi@" + var9;
                        this.field366[this.field147] = 119;
                        ++this.field147;
                    }
                    ++var5;
                }
                if ((var7 == 5 || var7 == 6) && this.field300 == 0 && this.field347 < 2) {
                    ++var5;
                }
                if (var7 == 8 && (this.field439 == 0 || this.field439 == 1 && this.method90(true, var9))) {
                    if (arg0 > var8 - 14 && arg0 <= var8) {
                        this.field209[this.field147] = "Accept challenge @whi@" + var9;
                        this.field366[this.field147] = 875;
                        ++this.field147;
                    }
                    ++var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)Z")
    public final boolean method105(int arg0, boolean arg1, byte[] arg2) {
        if (!arg1) {
            this.field512 = 97;
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg0);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method106(byte arg0) {
        Graphics var2 = this.method128(-489).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method320(1, 0);
        if (arg0 != 1) {
            this.field133 = this.field551.method236();
        }
        if (this.field376) {
            this.field259 = false;
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
        if (this.field328) {
            this.field259 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field92) {
            this.field259 = false;
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILRGCGKKUR;)V")
    private final void method107(int arg0, int arg1, class53 arg2) {
        if (arg0 != -26716) {
            this.field368 = !this.field368;
        }
        for (int var4 = 0; var4 < this.field120; ++var4) {
            int var5 = this.field121[var4];
            class20 var6 = this.field117[var5];
            int var7 = arg2.method455();
            if ((var7 & 32) != 0) {
                var7 += arg2.method455() << 8;
            }
            this.method83(var6, arg2, var5, 0, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method108(int arg0) {
        class39.field1144.method442();
        class39.field1131.method442();
        while (arg0 >= 0) {
            this.method113();
        }
        class68.field1736.method442();
        class4.field23.method442();
        class4.field32.method442();
        class20.field792.method442();
        class13.field700.method442();
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method109(int arg0) {
        if (this.field311 == null) {
            super.field1077 = null;
            this.field89 = null;
            this.field87 = null;
            this.field86 = null;
            this.field88 = null;
            this.field484 = null;
            this.field485 = null;
            this.field486 = null;
            this.field314 = new class19(this.method128(-489), 265, 45981, 128);
            class67.method571(false);
            this.field315 = new class19(this.method128(-489), 265, 45981, 128);
            class67.method571(false);
            this.field311 = new class19(this.method128(-489), 171, 45981, 509);
            class67.method571(false);
            if (arg0 >= 0) {
                this.field539 = !this.field539;
            }
            this.field312 = new class19(this.method128(-489), 132, 45981, 360);
            class67.method571(false);
            this.field313 = new class19(this.method128(-489), 200, 45981, 360);
            class67.method571(false);
            this.field316 = new class19(this.method128(-489), 238, 45981, 202);
            class67.method571(false);
            this.field317 = new class19(this.method128(-489), 238, 45981, 203);
            class67.method571(false);
            this.field318 = new class19(this.method128(-489), 94, 45981, 74);
            class67.method571(false);
            this.field319 = new class19(this.method128(-489), 94, 45981, 75);
            class67.method571(false);
            if (this.field321 != null) {
                this.method62(-21339);
                this.method44(180);
            }
            this.field392 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method110(boolean arg0, int arg1) {
        if (arg1 > 0) {
            for (int var3 = 0; var3 < this.field144; ++var3) {
                class42 var4 = this.field143[this.field145[var3]];
                int var5 = (this.field145[var3] << 14) + 536870912;
                if (var4 != null && var4.method229(true) && var4.field1206.field1711 == arg0 && var4.field1206.method586((byte) 4)) {
                    int var6 = var4.field1383 >> 7;
                    int var7 = var4.field1384 >> 7;
                    if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                        if (var4.field1370 == 1 && (var4.field1383 & 127) == 64 && (var4.field1384 & 127) == 64) {
                            if (this.field186[var6][var7] == this.field444) {
                                continue;
                            }
                            this.field186[var6][var7] = this.field444;
                        }
                        if (!var4.field1206.field1706) {
                            var5 += Integer.MIN_VALUE;
                        }
                        this.field112.method375(var4.field1384, this.method45(var4.field1383, var4.field1384, this.field372, 43591), var5, var4.field1385, this.field372, var4.field1354, var4.field1383, false, var4, (var4.field1370 - 1) * 64 + 60);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)Z")
    public final boolean method111(int arg0) {
        if (arg0 != 0) {
            this.field417 = -1;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method112(int arg0) {
        if (super.field1077 == null) {
            this.method159(false);
            this.field311 = null;
            this.field312 = null;
            this.field313 = null;
            this.field314 = null;
            this.field315 = null;
            this.field316 = null;
            this.field317 = null;
            this.field318 = null;
            this.field319 = null;
            this.field89 = null;
            if (arg0 > 0) {
                this.field87 = null;
                this.field86 = null;
                this.field88 = null;
                this.field484 = null;
                this.field485 = null;
                this.field486 = null;
                super.field1077 = new class19(this.method128(-489), 503, 45981, 765);
                this.field392 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method113() {
        this.method174("Starting up", 27936, 20);
        if (signlink.sunjava) {
            super.field1070 = 5;
        }
        if (field189) {
            this.field92 = true;
        } else {
            field189 = true;
            boolean var1 = false;
            String var2 = this.method49(243);
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
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field328 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field306[var3] = new class18(500000, var3 + 1, (byte) 7, signlink.cache_dat, signlink.cache_idx[var3]);
                    }
                }
                try {
                    this.method178(-31374);
                    this.field321 = this.method183(1, "title screen", 25, "title", (byte) -83, this.field553[1]);
                    this.field341 = new class33("p11_full", (byte) -40, false, this.field321);
                    this.field342 = new class33("p12_full", (byte) -40, false, this.field321);
                    this.field343 = new class33("b12_full", (byte) -40, false, this.field321);
                    this.field344 = new class33("q8_full", (byte) -40, true, this.field321);
                    this.method62(-21339);
                    this.method44(180);
                    class11 var4 = this.method183(2, "config", 30, "config", (byte) -83, this.field553[2]);
                    class11 var5 = this.method183(3, "interface", 35, "interface", (byte) -83, this.field553[3]);
                    class11 var6 = this.method183(4, "2d graphics", 40, "media", (byte) -83, this.field553[4]);
                    class11 var7 = this.method183(6, "textures", 45, "textures", (byte) -83, this.field553[6]);
                    class11 var8 = this.method183(7, "chat system", 50, "wordenc", (byte) -83, this.field553[7]);
                    class11 var9 = this.method183(8, "sound effects", 55, "sounds", (byte) -83, this.field553[8]);
                    this.field320 = new byte[4][104][104];
                    this.field423 = new int[4][105][105];
                    this.field112 = new class45(this.field423, 104, 4, (byte) 72, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field208[var10] = new class3(0, 104, 104);
                    }
                    this.field464 = new class72(512, 512);
                    class11 var11 = this.method183(5, "update list", 60, "versionlist", (byte) -83, this.field553[5]);
                    this.method174("Connecting to update server", 27936, 60);
                    this.field517 = new class41();
                    this.field517.method342(var11, this);
                    class49.method424(this.field517.method341((byte) 3));
                    class37.method288(this.field517.method348(0, false), this.field517);
                    if (!field291) {
                        this.field183 = 0;
                        this.field184 = true;
                        this.field517.method337(2, this.field183);
                        while (this.field517.method339() > 0) {
                            this.method52((byte) 3);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field517.field1163 > 3) {
                                this.method157("ondemand");
                                return;
                            }
                        }
                    }
                    this.method174("Requesting animations", 27936, 65);
                    int var12 = this.field517.method348(1, false);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field517.method337(1, var13);
                    }
                    while (this.field517.method339() > 0) {
                        int var14 = var12 - this.field517.method339();
                        if (var14 > 0) {
                            this.method174("Loading animations - " + var14 * 100 / var12 + "%", 27936, 65);
                        }
                        this.method52((byte) 3);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field517.field1163 > 3) {
                            this.method157("ondemand");
                            return;
                        }
                    }
                    this.method174("Requesting models", 27936, 70);
                    int var15 = this.field517.method348(0, false);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field517.method353(true, var16);
                        if ((var17 & 1) != 0) {
                            this.field517.method337(0, var16);
                        }
                    }
                    int var18 = this.field517.method339();
                    while (this.field517.method339() > 0) {
                        int var19 = var18 - this.field517.method339();
                        if (var19 > 0) {
                            this.method174("Loading models - " + var19 * 100 / var18 + "%", 27936, 70);
                        }
                        this.method52((byte) 3);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field306[0] != null) {
                        this.method174("Requesting maps", 27936, 75);
                        this.field517.method337(3, this.field517.method352(48, 208, 47, 0));
                        this.field517.method337(3, this.field517.method352(48, 208, 47, 1));
                        this.field517.method337(3, this.field517.method352(48, 208, 48, 0));
                        this.field517.method337(3, this.field517.method352(48, 208, 48, 1));
                        this.field517.method337(3, this.field517.method352(48, 208, 49, 0));
                        this.field517.method337(3, this.field517.method352(48, 208, 49, 1));
                        this.field517.method337(3, this.field517.method352(47, 208, 47, 0));
                        this.field517.method337(3, this.field517.method352(47, 208, 47, 1));
                        this.field517.method337(3, this.field517.method352(47, 208, 48, 0));
                        this.field517.method337(3, this.field517.method352(47, 208, 48, 1));
                        this.field517.method337(3, this.field517.method352(148, 208, 48, 0));
                        this.field517.method337(3, this.field517.method352(148, 208, 48, 1));
                        int var20 = this.field517.method339();
                        while (this.field517.method339() > 0) {
                            int var21 = var20 - this.field517.method339();
                            if (var21 > 0) {
                                this.method174("Loading maps - " + var21 * 100 / var20 + "%", 27936, 75);
                            }
                            this.method52((byte) 3);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field517.method348(0, false);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field517.method353(true, var23);
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
                            this.field517.method345(0, var25, var23, 462);
                        }
                    }
                    this.field517.method336(field290, field519);
                    if (!field291) {
                        int var26 = this.field517.method348(2, false);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field517.method340(var27, false)) {
                                this.field517.method345(2, (byte) 1, var27, 462);
                            }
                        }
                    }
                    this.method174("Unpacking media", 27936, 80);
                    this.field197 = new class66(var6, "invback", 0);
                    this.field199 = new class66(var6, "chatback", 0);
                    this.field198 = new class66(var6, "mapback", 0);
                    this.field228 = new class66(var6, "backbase1", 0);
                    this.field229 = new class66(var6, "backbase2", 0);
                    this.field230 = new class66(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field113[var28] = new class66(var6, "sideicons", var28);
                    }
                    this.field401 = new class72(var6, "compass", 0);
                    this.field269 = new class72(var6, "mapedge", 0);
                    this.field269.method593(0);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field545[var29] = new class66(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field363[var30] = new class72(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field448[var31] = new class72(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field330[var32] = new class72(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field374[var33] = new class72(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field190[var34] = new class72(var6, "headicons_hint", var34);
                    }
                    this.field169 = new class72(var6, "overlay_multiway", 0);
                    this.field157 = new class72(var6, "mapmarker", 0);
                    this.field158 = new class72(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field156[var35] = new class72(var6, "cross", var35);
                    }
                    this.field280 = new class72(var6, "mapdots", 0);
                    this.field281 = new class72(var6, "mapdots", 1);
                    this.field282 = new class72(var6, "mapdots", 2);
                    this.field283 = new class72(var6, "mapdots", 3);
                    this.field284 = new class72(var6, "mapdots", 4);
                    this.field216 = new class66(var6, "scrollbar", 0);
                    this.field217 = new class66(var6, "scrollbar", 1);
                    this.field382 = new class66(var6, "redstone1", 0);
                    this.field383 = new class66(var6, "redstone2", 0);
                    this.field384 = new class66(var6, "redstone3", 0);
                    this.field385 = new class66(var6, "redstone1", 0);
                    this.field385.method563(field325);
                    this.field386 = new class66(var6, "redstone2", 0);
                    this.field386.method563(field325);
                    this.field521 = new class66(var6, "redstone1", 0);
                    this.field521.method564(0);
                    this.field522 = new class66(var6, "redstone2", 0);
                    this.field522.method564(0);
                    this.field523 = new class66(var6, "redstone3", 0);
                    this.field523.method564(0);
                    this.field524 = new class66(var6, "redstone1", 0);
                    this.field524.method563(field325);
                    this.field524.method564(0);
                    this.field525 = new class66(var6, "redstone2", 0);
                    this.field525.method563(field325);
                    this.field525.method564(0);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field370[var36] = new class66(var6, "mod_icons", var36);
                    }
                    class72 var37 = new class72(var6, "backleft1", 0);
                    this.field488 = new class19(this.method128(-489), var37.field1768, 45981, var37.field1767);
                    var37.method594(0, 0, 1);
                    class72 var38 = new class72(var6, "backleft2", 0);
                    this.field489 = new class19(this.method128(-489), var38.field1768, 45981, var38.field1767);
                    var38.method594(0, 0, 1);
                    class72 var39 = new class72(var6, "backright1", 0);
                    this.field490 = new class19(this.method128(-489), var39.field1768, 45981, var39.field1767);
                    var39.method594(0, 0, 1);
                    class72 var40 = new class72(var6, "backright2", 0);
                    this.field491 = new class19(this.method128(-489), var40.field1768, 45981, var40.field1767);
                    var40.method594(0, 0, 1);
                    class72 var41 = new class72(var6, "backtop1", 0);
                    this.field492 = new class19(this.method128(-489), var41.field1768, 45981, var41.field1767);
                    var41.method594(0, 0, 1);
                    class72 var42 = new class72(var6, "backvmid1", 0);
                    this.field493 = new class19(this.method128(-489), var42.field1768, 45981, var42.field1767);
                    var42.method594(0, 0, 1);
                    class72 var43 = new class72(var6, "backvmid2", 0);
                    this.field494 = new class19(this.method128(-489), var43.field1768, 45981, var43.field1767);
                    var43.method594(0, 0, 1);
                    class72 var44 = new class72(var6, "backvmid3", 0);
                    this.field495 = new class19(this.method128(-489), var44.field1768, 45981, var44.field1767);
                    var44.method594(0, 0, 1);
                    class72 var45 = new class72(var6, "backhmid2", 0);
                    this.field496 = new class19(this.method128(-489), var45.field1768, 45981, var45.field1767);
                    var45.method594(0, 0, 1);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field363[var50] != null) {
                            this.field363[var50].method592(var47 + var49, var48 + var49, field461, var46 + var49);
                        }
                        if (this.field545[var50] != null) {
                            this.field545[var50].method565(var47 + var49, var48 + var49, field461, var46 + var49);
                        }
                    }
                    this.method174("Unpacking textures", 27936, 83);
                    class6.method190(var7, true);
                    class6.method194(true, 0.8D);
                    class6.method189(0, 20);
                    this.method174("Unpacking config", 27936, 86);
                    class27.method239((byte) 6, var4);
                    class39.method322(var4);
                    class63.method552((byte) 6, var4);
                    class4.method25(var4);
                    class68.method583(var4);
                    class21.method230((byte) 6, var4);
                    class13.method208((byte) 6, var4);
                    class60.method512((byte) 6, var4);
                    class7.method202((byte) 6, var4);
                    class4.field27 = field290;
                    if (!field291) {
                        this.method174("Unpacking sounds", 27936, 90);
                        byte[] var51 = var9.method205("sounds.dat", (byte[]) null);
                        class53 var52 = new class53(var51, (byte) -17);
                        class14.method211((byte) 6, var52);
                    }
                    this.method174("Unpacking interfaces", 27936, 95);
                    class33[] var53 = new class33[] { this.field341, this.field342, this.field343, this.field344 };
                    class51.method438((byte) 0, var6, var53, var5);
                    this.method174("Preparing game engine", 27936, 100);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field198.field1675[this.field198.field1677 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field137[var54] = var55;
                        this.field265[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field198.field1675[this.field198.field1677 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field98[var58 - 5] = var59 - 25;
                        this.field296[var58 - 5] = var60 - var59;
                    }
                    class6.method187(503, 765, 4);
                    this.field562 = class6.field596;
                    class6.method187(96, 479, 4);
                    this.field559 = class6.field596;
                    class6.method187(261, 190, 4);
                    this.field560 = class6.field596;
                    class6.method187(334, 512, 4);
                    this.field561 = class6.field596;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class6.field594[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class45.method400(512, 334, var62, 500, (byte) 4, 800);
                    class62.method514(var8);
                    this.field395 = new class9(this, true);
                    this.method123(this.field395, 10);
                    class50.field1433 = this;
                    class39.field1111 = this;
                    class68.field1735 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field445 + " " + this.field270);
                    this.field376 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method114(boolean arg0) {
        if (!arg0) {
            if (this.field360 == 0) {
                int var2 = super.field1074 / 2 - 80;
                int var3 = super.field1075 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field1090 == 1 && super.field1091 >= var2 - 75 && super.field1091 <= var2 + 75 && super.field1092 >= var14 - 20 && super.field1092 <= var14 + 20) {
                    this.field360 = 3;
                    this.field536 = 0;
                }
                int var4 = super.field1074 / 2 + 80;
                if (super.field1090 == 1 && super.field1091 >= var4 - 75 && super.field1091 <= var4 + 75 && super.field1092 >= var14 - 20 && super.field1092 <= var14 + 20) {
                    this.field334 = "";
                    this.field335 = "Enter your username & password.";
                    this.field360 = 2;
                    this.field536 = 0;
                }
            } else if (this.field360 == 2) {
                int var5 = super.field1075 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field1090 == 1 && super.field1092 >= var16 - 15 && super.field1092 < var16) {
                    this.field536 = 0;
                }
                var5 = var16 + 15;
                if (super.field1090 == 1 && super.field1092 >= var5 - 15 && super.field1092 < var5) {
                    this.field536 = 1;
                }
                var5 += 15;
                int var6 = super.field1074 / 2 - 80;
                int var7 = super.field1075 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field1090 == 1 && super.field1091 >= var6 - 75 && super.field1091 <= var6 + 75 && super.field1092 >= var17 - 20 && super.field1092 <= var17 + 20) {
                    this.field505 = 0;
                    this.method147(this.field421, this.field422, false);
                    if (this.field196) {
                        return;
                    }
                }
                int var8 = super.field1074 / 2 + 80;
                if (super.field1090 == 1 && super.field1091 >= var8 - 75 && super.field1091 <= var8 + 75 && super.field1092 >= var17 - 20 && super.field1092 <= var17 + 20) {
                    this.field360 = 0;
                    this.field421 = "";
                    this.field422 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method321(this.field426);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field468.length(); ++var11) {
                            if (var9 == field468.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field536 == 0) {
                            if (var9 == 8 && this.field421.length() > 0) {
                                this.field421 = this.field421.substring(0, this.field421.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field536 = 1;
                            }
                            if (var10) {
                                this.field421 = this.field421 + (char) var9;
                            }
                            if (this.field421.length() > 12) {
                                this.field421 = this.field421.substring(0, 12);
                            }
                        } else if (this.field536 == 1) {
                            if (var9 == 8 && this.field422.length() > 0) {
                                this.field422 = this.field422.substring(0, this.field422.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field536 = 0;
                            }
                            if (var10) {
                                this.field422 = this.field422 + (char) var9;
                            }
                            if (this.field422.length() > 20) {
                                this.field422 = this.field422.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field360 == 3) {
                    int var12 = super.field1074 / 2;
                    int var13 = super.field1075 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field1090 == 1 && super.field1091 >= var12 - 75 && super.field1091 <= var12 + 75 && super.field1092 >= var18 - 20 && super.field1092 <= var18 + 20) {
                        this.field360 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method115(int arg0) {
        if (this.field89 == null) {
            this.method159(false);
            super.field1077 = null;
            this.field311 = null;
            this.field312 = null;
            this.field313 = null;
            this.field314 = null;
            if (arg0 <= 0) {
                this.field417 = -1;
            }
            this.field315 = null;
            this.field316 = null;
            this.field317 = null;
            this.field318 = null;
            this.field319 = null;
            this.field89 = new class19(this.method128(-489), 96, 45981, 479);
            this.field87 = new class19(this.method128(-489), 156, 45981, 172);
            class67.method571(false);
            this.field198.method566(0, 22912, 0);
            this.field86 = new class19(this.method128(-489), 261, 45981, 190);
            this.field88 = new class19(this.method128(-489), 334, 45981, 512);
            class67.method571(false);
            this.field484 = new class19(this.method128(-489), 50, 45981, 496);
            this.field485 = new class19(this.method128(-489), 37, 45981, 269);
            this.field486 = new class19(this.method128(-489), 45, 45981, 249);
            this.field392 = true;
            this.field88.method223(-5281);
            class6.field596 = this.field561;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    private final void method116(byte arg0) {
        if (arg0 != 0) {
            this.field210 = !this.field210;
        }
        if (this.field447 == 2) {
            for (class17 var2 = (class17) this.field238.method33(); var2 != null; var2 = (class17) this.field238.method35((byte) 8)) {
                if (var2.field748 > 0) {
                    --var2.field748;
                }
                if (var2.field748 == 0) {
                    if (var2.field741 < 0 || class30.method247(var2.field741, 0, var2.field743)) {
                        this.method125(var2.field745, var2.field747, var2.field742, var2.field743, true, var2.field746, var2.field741, var2.field744);
                        var2.method505();
                    }
                } else {
                    if (var2.field749 > 0) {
                        --var2.field749;
                    }
                    if (var2.field749 == 0 && var2.field746 >= 1 && var2.field747 >= 1 && var2.field746 <= 102 && var2.field747 <= 102 && (var2.field750 < 0 || class30.method247(var2.field750, 0, var2.field752))) {
                        this.method125(var2.field745, var2.field747, var2.field751, var2.field752, true, var2.field746, var2.field750, var2.field744);
                        var2.field749 = -1;
                        if (var2.field750 == var2.field741 && var2.field741 == -1) {
                            var2.method505();
                        } else if (var2.field750 == var2.field741 && var2.field751 == var2.field742 && var2.field752 == var2.field743) {
                            var2.method505();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method117(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field412; ++var4) {
                if (this.field123[var4] == arg0) {
                    --this.field412;
                    this.field307 = true;
                    for (int var5 = var4; var5 < this.field412; ++var5) {
                        this.field123[var5] = this.field123[var5 + 1];
                    }
                    this.field532.method444(this.field134, 202);
                    this.field532.method451(arg0, 0);
                    break;
                }
            }
            if (arg1 >= 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method118(int arg0) {
        if (arg0 < 0) {
            if (field291 && this.field447 == 2 && class30.field911 != this.field372) {
                this.method95((String) null, "Loading - please wait.", 22761);
                this.field447 = 1;
                this.field295 = System.currentTimeMillis();
            }
            if (this.field447 == 1) {
                int var2 = this.method119((byte) 8);
                if (var2 != 0 && System.currentTimeMillis() - this.field295 > 360000L) {
                    signlink.reporterror(this.field421 + " glcfb " + this.field353 + "," + var2 + "," + field291 + "," + this.field306[0] + "," + this.field517.method339() + "," + this.field372 + "," + this.field332 + "," + this.field333);
                    this.field295 = System.currentTimeMillis();
                }
            }
            if (this.field447 == 2 && this.field550 != this.field372) {
                this.field550 = this.field372;
                this.method156(this.field372, (byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)I")
    public final int method119(byte arg0) {
        for (int var2 = 0; var2 < this.field483.length; ++var2) {
            if (this.field483[var2] == null && this.field181[var2] != -1) {
                return -1;
            }
            if (this.field411[var2] == null && this.field182[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field483.length; ++var4) {
            byte[] var6 = this.field411[var4];
            if (var6 != null) {
                int var7 = (this.field180[var4] >> 8) * 64 - this.field233;
                int var8 = (this.field180[var4] & 255) * 64 - this.field234;
                if (this.field346) {
                    var7 = 10;
                    var8 = 10;
                }
                var3 &= class30.method263(49844, var6, var8, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field407) {
            return -4;
        } else {
            this.field447 = 2;
            class30.field911 = this.field372;
            this.method77(this.field201);
            this.field532.method444(this.field134, 92);
            if (arg0 == 8) {
                boolean var5 = false;
            } else {
                this.method113();
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field288 = Integer.parseInt(this.getParameter("nodeid"));
        field289 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method160(0);
        } else {
            method139(19662);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field290 = false;
        } else {
            field290 = true;
        }
        this.method318(503, 765, 4);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BZI)V")
    public final void method120(byte[] arg0, boolean arg1, int arg2) {
        if (arg2 != 4) {
            this.field194 = null;
        }
        if (this.field170) {
            signlink.midifade = arg1 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void method121(byte arg0) {
        this.field87.method223(-5281);
        if (this.field167 == 2) {
            byte[] var2 = this.field198.field1675;
            int[] var3 = class67.field1687;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field401.method600(0, this.field265, 25, 0, 25, 256, 33, 35958, 33, this.field172, this.field137);
            this.field88.method223(-5281);
            class6.field596 = this.field561;
        } else {
            int var6 = this.field478 + this.field172 & 2047;
            int var7 = field219.field1383 / 32 + 48;
            if (arg0 == 9) {
                boolean var8 = false;
            } else {
                this.field397 = this.field551.method236();
            }
            int var9 = 464 - field219.field1384 / 32;
            this.field464.method600(5, this.field296, var7, 25, var9, this.field125 + 256, 146, 35958, 151, var6, this.field98);
            this.field401.method600(0, this.field265, 25, 0, 25, 256, 33, 35958, 33, this.field172, this.field137);
            for (int var10 = 0; var10 < this.field308; ++var10) {
                int var40 = this.field309[var10] * 4 + 2 - field219.field1383 / 32;
                int var41 = this.field310[var10] * 4 + 2 - field219.field1384 / 32;
                this.method170(46599, var41, var40, this.field556[var10]);
            }
            for (int var11 = 0; var11 < 104; ++var11) {
                for (int var36 = 0; var36 < 104; ++var36) {
                    class5 var37 = this.field194[this.field372][var11][var36];
                    if (var37 != null) {
                        int var38 = var11 * 4 + 2 - field219.field1383 / 32;
                        int var39 = var36 * 4 + 2 - field219.field1384 / 32;
                        this.method170(46599, var39, var38, this.field280);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field144; ++var12) {
                class42 var32 = this.field143[this.field145[var12]];
                if (var32 != null && var32.method229(true)) {
                    class68 var33 = var32.field1206;
                    if (var33.field1705 != null) {
                        var33 = var33.method580(0);
                    }
                    if (var33 != null && var33.field1738 && var33.field1706) {
                        int var34 = var32.field1383 / 32 - field219.field1383 / 32;
                        int var35 = var32.field1384 / 32 - field219.field1384 / 32;
                        this.method170(46599, var35, var34, this.field281);
                    }
                }
            }
            for (int var13 = 0; var13 < this.field118; ++var13) {
                class20 var24 = this.field117[this.field119[var13]];
                if (var24 != null && var24.method229(true)) {
                    int var25 = var24.field1383 / 32 - field219.field1383 / 32;
                    int var26 = var24.field1384 / 32 - field219.field1384 / 32;
                    boolean var27 = false;
                    long var28 = class55.method497(var24.field785);
                    for (int var30 = 0; var30 < this.field434; ++var30) {
                        if (this.field294[var30] == var28 && this.field139[var30] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var31 = false;
                    if (field219.field784 != 0 && var24.field784 != 0 && field219.field784 == var24.field784) {
                        var31 = true;
                    }
                    if (var27) {
                        this.method170(46599, var26, var25, this.field283);
                    } else if (var31) {
                        this.method170(46599, var26, var25, this.field284);
                    } else {
                        this.method170(46599, var26, var25, this.field282);
                    }
                }
            }
            if (this.field393 != 0 && field247 % 20 < 10) {
                if (this.field393 == 1 && this.field127 >= 0 && this.field127 < this.field143.length) {
                    class42 var14 = this.field143[this.field127];
                    if (var14 != null) {
                        int var15 = var14.field1383 / 32 - field219.field1383 / 32;
                        int var16 = var14.field1384 / 32 - field219.field1384 / 32;
                        this.method138(this.field158, this.field136, var15, var16);
                    }
                }
                if (this.field393 == 2) {
                    int var17 = (this.field377 - this.field233) * 4 + 2 - field219.field1383 / 32;
                    int var18 = (this.field378 - this.field234) * 4 + 2 - field219.field1384 / 32;
                    this.method138(this.field158, this.field136, var17, var18);
                }
                if (this.field393 == 10 && this.field261 >= 0 && this.field261 < this.field117.length) {
                    class20 var19 = this.field117[this.field261];
                    if (var19 != null) {
                        int var20 = var19.field1383 / 32 - field219.field1383 / 32;
                        int var21 = var19.field1384 / 32 - field219.field1384 / 32;
                        this.method138(this.field158, this.field136, var20, var21);
                    }
                }
            }
            if (this.field462 != 0) {
                int var22 = this.field462 * 4 + 2 - field219.field1383 / 32;
                int var23 = this.field463 * 4 + 2 - field219.field1384 / 32;
                this.method170(46599, var23, var22, this.field157);
            }
            class67.method573((byte) 4, 78, 97, 16777215, 3, 3);
            this.field88.method223(-5281);
            class6.field596 = this.field561;
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method122(int arg0) {
        ++this.field444;
        this.method177(true, 0);
        this.method110(true, 229);
        this.method177(false, 0);
        this.method110(false, 229);
        this.method132(0);
        this.method86(false);
        if (!this.field97) {
            int var2 = this.field171;
            if (this.field249 / 256 > var2) {
                var2 = this.field249 / 256;
            }
            if (this.field262[4] && this.field191[4] + 128 > var2) {
                var2 = this.field191[4] + 128;
            }
            int var3 = this.field513 + this.field172 & 2047;
            this.method172(this.method45(field219.field1383, field219.field1384, this.field372, 43591) - 50, -727, var3, this.field469, var2, this.field470, var2 * 3 + 600);
        }
        int var4;
        if (!this.field97) {
            var4 = this.method142(false);
        } else {
            var4 = this.method143(true);
        }
        int var5 = this.field453;
        int var6 = this.field454;
        int var7 = this.field455;
        int var8 = this.field456;
        int var9 = this.field457;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field262[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field552[var10] * 2 + 1) - (double) this.field552[var10] + Math.sin((double) this.field185[var10] / 100.0D * (double) this.field331[var10]) * (double) this.field191[var10]);
                if (var10 == 0) {
                    this.field453 += var12;
                }
                if (var10 == 1) {
                    this.field454 += var12;
                }
                if (var10 == 2) {
                    this.field455 += var12;
                }
                if (var10 == 3) {
                    this.field457 = this.field457 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field456 += var12;
                    if (this.field456 < 128) {
                        this.field456 = 128;
                    }
                    if (this.field456 > 383) {
                        this.field456 = 383;
                    }
                }
            }
        }
        int var11 = class6.field605;
        class37.field1053 = true;
        class37.field1056 = 0;
        class37.field1054 = super.field1084 - 4;
        class37.field1055 = super.field1085 - 4;
        class67.method571(false);
        if (arg0 == -15737) {
            this.field112.method403(this.field455, this.field454, this.field453, this.field457, 48199, this.field456, var4);
            this.field112.method378(9);
            this.method162(-376);
            this.method79(this.field227);
            this.method99(false, var11);
            this.method149(false);
            this.field88.method224(super.field1076, 966, 4, 4);
            this.field453 = var5;
            this.field454 = var6;
            this.field455 = var7;
            this.field456 = var8;
            this.field457 = var9;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method123(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method123(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    public final void method124(int arg0, byte arg1) {
        int var3 = class60.field1597[arg0].field1605;
        if (arg1 != 87) {
            this.field518 = this.field551.method236();
        }
        if (var3 != 0) {
            int var4 = this.field187[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class6.method194(true, 0.9D);
                }
                if (var4 == 2) {
                    class6.method194(true, 0.8D);
                }
                if (var4 == 3) {
                    class6.method194(true, 0.7D);
                }
                if (var4 == 4) {
                    class6.method194(true, 0.6D);
                }
                class4.field32.method442();
                this.field392 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field170;
                if (var4 == 0) {
                    this.method51(0, 7, this.field170);
                    this.field170 = true;
                }
                if (var4 == 1) {
                    this.method51(-400, 7, this.field170);
                    this.field170 = true;
                }
                if (var4 == 2) {
                    this.method51(-800, 7, this.field170);
                    this.field170 = true;
                }
                if (var4 == 3) {
                    this.method51(-1200, 7, this.field170);
                    this.field170 = true;
                }
                if (var4 == 4) {
                    this.field170 = false;
                }
                if (this.field170 != var5 && !field291) {
                    if (this.field170) {
                        this.field183 = this.field254;
                        this.field184 = true;
                        this.field517.method337(2, this.field183);
                    } else {
                        this.method166(2);
                    }
                    this.field403 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field565 = true;
                    this.method179(-676, 0);
                }
                if (var4 == 1) {
                    this.field565 = true;
                    this.method179(-676, -400);
                }
                if (var4 == 2) {
                    this.field565 = true;
                    this.method179(-676, -800);
                }
                if (var4 == 3) {
                    this.field565 = true;
                    this.method179(-676, -1200);
                }
                if (var4 == 4) {
                    this.field565 = false;
                }
            }
            if (var3 == 5) {
                this.field323 = var4;
            }
            if (var3 == 6) {
                this.field440 = var4;
            }
            if (var3 == 8) {
                this.field300 = var4;
                this.field237 = true;
            }
            if (var3 == 9) {
                this.field299 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIII)V")
    private final void method125(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            if (arg5 >= 1 && arg1 >= 1 && arg5 <= 102 && arg1 <= 102) {
                if (field291 && this.field372 != arg7) {
                    return;
                }
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = false;
                boolean var12 = false;
                if (arg0 == 0) {
                    var9 = this.field112.method390(arg7, arg5, arg1);
                }
                if (arg0 == 1) {
                    var9 = this.field112.method391((byte) -87, arg7, arg5, arg1);
                }
                if (arg0 == 2) {
                    var9 = this.field112.method392(arg7, arg5, arg1);
                }
                if (arg0 == 3) {
                    var9 = this.field112.method393(arg7, arg5, arg1);
                }
                if (var9 != 0) {
                    int var13 = this.field112.method394(arg7, arg5, arg1, var9);
                    int var14 = var9 >> 14 & 32767;
                    int var15 = var13 & 31;
                    int var16 = var13 >> 6;
                    if (arg0 == 0) {
                        this.field112.method381(arg1, arg7, arg5, (byte) 17);
                        class39 var17 = class39.method323(var14);
                        if (var17.field1130) {
                            this.field208[arg7].method10(arg1, var15, var17.field1102, arg5, true, var16);
                        }
                    }
                    if (arg0 == 1) {
                        this.field112.method382(arg5, arg7, arg1, 1);
                    }
                    if (arg0 == 2) {
                        this.field112.method383(true, arg5, arg7, arg1);
                        class39 var18 = class39.method323(var14);
                        if (var18.field1145 + arg5 > 103 || var18.field1145 + arg1 > 103 || var18.field1135 + arg5 > 103 || var18.field1135 + arg1 > 103) {
                            return;
                        }
                        if (var18.field1130) {
                            this.field208[arg7].method11(var18.field1145, arg5, var16, arg1, (byte) 3, var18.field1102, var18.field1135);
                        }
                    }
                    if (arg0 == 3) {
                        this.field112.method384(arg5, arg1, -643, arg7);
                        class39 var19 = class39.method323(var14);
                        if (var19.field1130 && var19.field1117) {
                            this.field208[arg7].method13(arg1, arg5, -44679);
                        }
                    }
                }
                if (arg6 >= 0) {
                    int var20 = arg7;
                    if (arg7 < 3 && (this.field320[1][arg5][arg1] & 2) == 2) {
                        var20 = arg7 + 1;
                    }
                    class30.method253(this.field112, var20, arg7, arg3, this.field208[arg7], arg2, this.field211, this.field423, arg6, arg1, arg5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method126(int arg0, int arg1) {
        class5 var3 = this.field194[this.field372][arg0][arg1];
        if (var3 == null) {
            this.field112.method385(this.field372, arg0, arg1);
        } else {
            int var4 = -99999999;
            class22 var5 = null;
            for (class22 var6 = (class22) var3.method33(); var6 != null; var6 = (class22) var3.method35((byte) 8)) {
                class4 var11 = class4.method22(var6.field814);
                int var12 = var11.field69;
                if (var11.field53) {
                    var12 = (var6.field813 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method31(var5, (byte) 1);
            class22 var7 = null;
            class22 var8 = null;
            for (class22 var9 = (class22) var3.method33(); var9 != null; var9 = (class22) var3.method35((byte) 8)) {
                if (var5.field814 != var9.field814 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field814 != var9.field814 && var7.field814 != var9.field814 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field112.method371(49058, var10, var5, var7, var8, arg0, this.field372, this.method45(arg0 * 128 + 64, arg1 * 128 + 64, this.field372, 43591), arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public void method127(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field410);
        if (this.field517 != null) {
            System.out.println("Od-cycle:" + this.field517.field1192);
        }
        System.out.println("loop-cycle:" + field247);
        System.out.println("draw-cycle:" + field200);
        System.out.println("ptype:" + this.field417);
        System.out.println("psize:" + this.field416);
        if (this.field248 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field348 != null) {
            this.field348.method511(-26728);
        }
        super.field1073 = true;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final Component method128(int arg0) {
        while (arg0 >= 0) {
            this.field260 = this.field551.method236();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else if (super.field1079 != null) {
            return super.field1079;
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILQUBPQDMQ;I)V")
    public final void method129(int arg0, int arg1, int arg2, class51 arg3, int arg4) {
        if (arg3.field1503 == 0 && arg3.field1515 != null) {
            if (!arg3.field1478 || this.field148 == arg3.field1485 || this.field388 == arg3.field1485 || this.field398 == arg3.field1485) {
                int var6 = class67.field1692;
                int var7 = class67.field1690;
                int var8 = class67.field1693;
                int var9 = class67.field1691;
                class67.method570(arg1, (byte) -98, arg3.field1475 + arg4, arg3.field1460 + arg1, arg4);
                int var10 = arg3.field1515.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field1447[var11] + arg1;
                    int var13 = arg3.field1512[var11] + arg4 - arg2;
                    class51 var14 = class51.method435(arg3.field1515[var11]);
                    int var15 = var14.field1496 + var12;
                    int var16 = var14.field1451 + var13;
                    if (var14.field1497 > 0) {
                        this.method84(var14, 0);
                    }
                    if (var14.field1503 == 0) {
                        if (var14.field1474 > var14.field1472 - var14.field1475) {
                            var14.field1474 = var14.field1472 - var14.field1475;
                        }
                        if (var14.field1474 < 0) {
                            var14.field1474 = 0;
                        }
                        this.method129(-7410, var15, var14.field1474, var14, var16);
                        if (var14.field1472 > var14.field1475) {
                            this.method87(var14.field1472, (byte) 89, var14.field1475, var14.field1460 + var15, var16, var14.field1474);
                        }
                    } else if (var14.field1503 != 1) {
                        if (var14.field1503 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1475; ++var18) {
                                for (int var19 = 0; var19 < var14.field1460; ++var19) {
                                    int var20 = (var14.field1480 + 32) * var19 + var15;
                                    int var21 = (var14.field1492 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1448[var17];
                                        var21 += var14.field1442[var17];
                                    }
                                    if (var14.field1477[var17] <= 0) {
                                        if (var14.field1457 != null && var17 < 20) {
                                            class72 var30 = var14.field1457[var17];
                                            if (var30 != null) {
                                                var30.method596(var20, 22912, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1477[var17] - 1;
                                        if (var20 > class67.field1692 - 32 && var20 < class67.field1693 && var21 > class67.field1690 - 32 && var21 < class67.field1691 || this.field576 != 0 && this.field575 == var17) {
                                            int var25 = 0;
                                            if (this.field149 == 1 && this.field150 == var17 && this.field151 == var14.field1485) {
                                                var25 = 16777215;
                                            }
                                            class72 var26 = class4.method26(var14.field1468[var17], false, var25, var24);
                                            if (var26 != null) {
                                                if (this.field576 != 0 && this.field575 == var17 && this.field574 == var14.field1485) {
                                                    var22 = super.field1084 - this.field577;
                                                    var23 = super.field1085 - this.field578;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field212 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method598(var21 + var23, false, 128, var20 + var22);
                                                    if (var21 + var23 < class67.field1690 && arg3.field1474 > 0) {
                                                        int var27 = (class67.field1690 - var21 - var23) * this.field355 / 3;
                                                        if (var27 > this.field355 * 10) {
                                                            var27 = this.field355 * 10;
                                                        }
                                                        if (var27 > arg3.field1474) {
                                                            var27 = arg3.field1474;
                                                        }
                                                        arg3.field1474 -= var27;
                                                        this.field578 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class67.field1691 && arg3.field1474 < arg3.field1472 - arg3.field1475) {
                                                        int var28 = (var21 + var23 + 32 - class67.field1691) * this.field355 / 3;
                                                        if (var28 > this.field355 * 10) {
                                                            var28 = this.field355 * 10;
                                                        }
                                                        if (var28 > arg3.field1472 - arg3.field1475 - arg3.field1474) {
                                                            var28 = arg3.field1472 - arg3.field1475 - arg3.field1474;
                                                        }
                                                        arg3.field1474 += var28;
                                                        this.field578 -= var28;
                                                    }
                                                } else if (this.field207 != 0 && this.field206 == var17 && this.field205 == var14.field1485) {
                                                    var26.method598(var21, false, 128, var20);
                                                } else {
                                                    var26.method596(var20, 22912, var21);
                                                }
                                                if (var26.field1771 == 33 || var14.field1468[var17] != 1) {
                                                    int var29 = var14.field1468[var17];
                                                    this.field341.method275(0, (byte) 118, method89(var29, 27004), var21 + 10 + var23, var20 + 1 + var22);
                                                    this.field341.method275(16776960, (byte) 118, method89(var29, 27004), var21 + 9 + var23, var20 + var22);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1503 == 3) {
                            boolean var31 = false;
                            if (this.field398 == var14.field1485 || this.field388 == var14.field1485 || this.field148 == var14.field1485) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method165(285, var14)) {
                                var32 = var14.field1444;
                                if (var31 && var14.field1487 != 0) {
                                    var32 = var14.field1487;
                                }
                            } else {
                                var32 = var14.field1459;
                                if (var31 && var14.field1470 != 0) {
                                    var32 = var14.field1470;
                                }
                            }
                            if (var14.field1511 == 0) {
                                if (var14.field1507) {
                                    class67.method573((byte) 4, var16, var15, var32, var14.field1475, var14.field1460);
                                } else {
                                    class67.method574(var14.field1475, var16, 606, var15, var32, var14.field1460);
                                }
                            } else if (var14.field1507) {
                                class67.method572(var14.field1475, 256 - (var14.field1511 & 255), var16, var14.field1460, var15, (byte) 6, var32);
                            } else {
                                class67.method575(var14.field1460, var14.field1475, 217, var15, 256 - (var14.field1511 & 255), var16, var32);
                            }
                        } else if (var14.field1503 == 4) {
                            class33 var33 = var14.field1505;
                            String var34 = var14.field1467;
                            boolean var35 = false;
                            if (this.field398 == var14.field1485 || this.field388 == var14.field1485 || this.field148 == var14.field1485) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method165(285, var14)) {
                                var36 = var14.field1444;
                                if (var35 && var14.field1487 != 0) {
                                    var36 = var14.field1487;
                                }
                                if (var14.field1466.length() > 0) {
                                    var34 = var14.field1466;
                                }
                            } else {
                                var36 = var14.field1459;
                                if (var35 && var14.field1470 != 0) {
                                    var36 = var14.field1470;
                                }
                            }
                            if (var14.field1486 == 6 && this.field140) {
                                var34 = "Please wait...";
                                var36 = var14.field1459;
                            }
                            if (class67.field1688 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field950 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label393: while (true) {
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
                                                                            break label393;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method175(this.method61(4, (byte) 60, var14), 7) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method175(this.method61(3, (byte) 60, var14), 7) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method175(this.method61(2, (byte) 60, var14), 7) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method175(this.method61(1, (byte) 60, var14), 7) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method175(this.method61(0, (byte) 60, var14), 7) + var34.substring(var38 + 2);
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
                                if (var14.field1518) {
                                    var33.method272(var37, var36, 0, var14.field1493, var14.field1460 / 2 + var15, var44);
                                } else {
                                    var33.method279(var44, var15, var37, var14.field1493, 0, var36);
                                }
                                var37 += var33.field950;
                            }
                        } else if (var14.field1503 == 5) {
                            class72 var45;
                            if (this.method165(285, var14)) {
                                var45 = var14.field1450;
                            } else {
                                var45 = var14.field1491;
                            }
                            if (var45 != null) {
                                var45.method596(var15, 22912, var16);
                            }
                        } else if (var14.field1503 == 6) {
                            int var46 = class6.field590;
                            int var47 = class6.field591;
                            class6.field590 = var14.field1460 / 2 + var15;
                            class6.field591 = var14.field1475 / 2 + var16;
                            int var48 = class6.field594[var14.field1483] * var14.field1482 >> 16;
                            int var49 = class6.field595[var14.field1483] * var14.field1482 >> 16;
                            boolean var50 = this.method165(285, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field1455;
                            } else {
                                var51 = var14.field1454;
                            }
                            class37 var52;
                            if (var51 == -1) {
                                var52 = var14.method439(-1, -1, this.field433, var50);
                            } else {
                                class27 var53 = class27.field849[var51];
                                var52 = var14.method439(var53.field852[var14.field1514], var53.field851[var14.field1514], this.field433, var50);
                            }
                            if (var52 != null) {
                                var52.method312(0, var14.field1484, 0, var14.field1483, 0, var48, var49);
                            }
                            class6.field590 = var46;
                            class6.field591 = var47;
                        } else {
                            if (var14.field1503 == 7) {
                                class33 var54 = var14.field1505;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1475; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1460; ++var57) {
                                        if (var14.field1477[var55] > 0) {
                                            class4 var58 = class4.method22(var14.field1477[var55] - 1);
                                            String var59 = String.valueOf(var58.field67);
                                            if (var58.field53 || var14.field1468[var55] != 1) {
                                                var59 = var59 + " x" + method63(866, var14.field1468[var55]);
                                            }
                                            int var60 = (var14.field1480 + 115) * var57 + var15;
                                            int var61 = (var14.field1492 + 12) * var56 + var16;
                                            if (var14.field1518) {
                                                var54.method272(var61, var14.field1459, 0, var14.field1493, var14.field1460 / 2 + var60, var59);
                                            } else {
                                                var54.method279(var59, var60, var61, var14.field1493, 0, var14.field1459);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1503 == 8 && (this.field507 == var14.field1485 || this.field503 == var14.field1485 || this.field387 == var14.field1485) && this.field301 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class33 var64 = this.field342;
                                String var65 = var14.field1467;
                                while (var65.length() > 0) {
                                    int var72 = var65.indexOf("\\n");
                                    String var73;
                                    if (var72 != -1) {
                                        var73 = var65.substring(0, var72);
                                        var65 = var65.substring(var72 + 2);
                                    } else {
                                        var73 = var65;
                                        var65 = "";
                                    }
                                    int var74 = var64.method273(1, var73);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field950 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1460 + var15 - 5 - var62;
                                int var67 = var14.field1475 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg3.field1460 + arg1) {
                                    var66 = arg3.field1460 + arg1 - var62;
                                }
                                if (var63 + var67 > arg3.field1475 + arg4) {
                                    var67 = arg3.field1475 + arg4 - var63;
                                }
                                class67.method573((byte) 4, var67, var66, 16777120, var63, var62);
                                class67.method574(var63, var67, 606, var66, 0, var62);
                                String var68 = var14.field1467;
                                int var69 = var64.field950 + var67 + 2;
                                while (var68.length() > 0) {
                                    int var70 = var68.indexOf("\\n");
                                    String var71;
                                    if (var70 != -1) {
                                        var71 = var68.substring(0, var70);
                                        var68 = var68.substring(var70 + 2);
                                    } else {
                                        var71 = var68;
                                        var68 = "";
                                    }
                                    var64.method279(var71, var66 + 3, var69, false, 0, 0);
                                    var69 += var64.field950 + 1;
                                }
                            }
                        }
                    }
                }
                if (arg0 != -7410) {
                    this.field417 = -1;
                }
                class67.method570(var6, (byte) -98, var9, var8, var7);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method130(int arg0) {
        while (arg0 >= 0) {
            this.method113();
        }
        if (this.field167 == 0) {
            if (super.field1090 == 1) {
                int var2 = super.field1091 - 25 - 550;
                int var3 = super.field1092 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field478 + this.field172 & 2047;
                    int var5 = class6.field594[var4];
                    int var6 = class6.field595[var4];
                    int var7 = (this.field125 + 256) * var5 >> 8;
                    int var8 = (this.field125 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field219.field1383 + var9 >> 7;
                    int var12 = field219.field1384 - var10 >> 7;
                    boolean var13 = this.method164(584, 0, field219.field1392[0], 0, field219.field1391[0], 0, 0, 0, true, 1, var11, var12);
                    if (var13) {
                        this.field532.method445(var2);
                        this.field532.method445(var3);
                        this.field532.method446(this.field172);
                        this.field532.method445(57);
                        this.field532.method445(this.field478);
                        this.field532.method445(this.field125);
                        this.field532.method445(89);
                        this.field532.method446(field219.field1383);
                        this.field532.method446(field219.field1384);
                        this.field532.method445(this.field326);
                        this.field532.method445(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LRGCGKKUR;ZI)V")
    public final void method131(class53 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method113();
        }
        if (arg2 == 100) {
            int var4 = arg0.method455();
            int var5 = (var4 >> 4 & 7) + this.field557;
            int var6 = (var4 & 7) + this.field558;
            int var7 = var5 + arg0.method456();
            int var8 = var6 + arg0.method456();
            int var9 = arg0.method458();
            int var10 = arg0.method457();
            int var11 = arg0.method455() * 4;
            int var12 = arg0.method455() * 4;
            int var13 = arg0.method457();
            int var14 = arg0.method457();
            int var15 = arg0.method455();
            int var16 = arg0.method455();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var10 != 65535) {
                int var17 = var5 * 128 + 64;
                int var18 = var6 * 128 + 64;
                int var19 = var7 * 128 + 64;
                int var20 = var8 * 128 + 64;
                class15 var21 = new class15(var17, var12, var18, var15, -40800, var16, var9, this.method45(var17, var18, this.field372, 43591) - var11, var10, field247 + var14, field247 + var13, this.field372);
                var21.method217((byte) 7, var19, this.method45(var19, var20, this.field372, 43591) - var12, var20, field247 + var13);
                this.field555.method30(var21);
            }
        } else if (arg2 == 173) {
            int var22 = arg0.method483(this.field159);
            int var23 = arg0.method482(26085);
            int var24 = arg0.method474(0);
            int var25 = (var24 >> 4 & 7) + this.field557;
            int var26 = (var24 & 7) + this.field558;
            int var27 = arg0.method482(26085);
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field526 != var27) {
                class22 var28 = new class22();
                var28.field814 = var23;
                var28.field813 = var22;
                if (this.field194[this.field372][var25][var26] == null) {
                    this.field194[this.field372][var25][var26] = new class5(-7255);
                }
                this.field194[this.field372][var25][var26].method30(var28);
                this.method126(var25, var26);
            }
        } else if (arg2 == 241) {
            int var29 = arg0.method483(this.field159);
            int var30 = arg0.method455();
            int var31 = (var30 >> 4 & 7) + this.field557;
            int var32 = (var30 & 7) + this.field558;
            int var33 = arg0.method455();
            int var34 = var33 >> 2;
            int var35 = var33 & 3;
            int var36 = this.field358[var34];
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                this.method98(false, 0, var29, var31, var32, var35, var34, var36, this.field372, -1);
            }
        } else {
            if (arg2 == 1) {
                int var37 = arg0.method482(26085);
                int var38 = arg0.method481(false);
                byte var39 = arg0.method476(7);
                int var40 = arg0.method475(true);
                int var41 = var40 >> 2;
                int var42 = var40 & 3;
                int var43 = this.field358[var41];
                byte var44 = arg0.method477(-771);
                int var45 = arg0.method482(26085);
                int var46 = arg0.method482(26085);
                byte var47 = arg0.method476(7);
                byte var48 = arg0.method476(7);
                int var49 = arg0.method474(0);
                int var50 = (var49 >> 4 & 7) + this.field557;
                int var51 = (var49 & 7) + this.field558;
                class20 var52;
                if (this.field526 == var46) {
                    var52 = field219;
                } else {
                    var52 = this.field117[var46];
                }
                if (var52 != null) {
                    class39 var53 = class39.method323(var45);
                    int var54 = this.field423[this.field372][var50][var51];
                    int var55 = this.field423[this.field372][var50 + 1][var51];
                    int var56 = this.field423[this.field372][var50 + 1][var51 + 1];
                    int var57 = this.field423[this.field372][var50][var51 + 1];
                    class37 var58 = var53.method328(var41, var42, var54, var55, var56, var57, -1);
                    if (var58 != null) {
                        this.method98(false, var37 + 1, -1, var50, var51, 0, 0, var43, this.field372, var38 + 1);
                        var52.field769 = field247 + var37;
                        var52.field770 = field247 + var38;
                        var52.field774 = var58;
                        int var59 = var53.field1145;
                        int var60 = var53.field1135;
                        if (var42 == 1 || var42 == 3) {
                            var59 = var53.field1135;
                            var60 = var53.field1145;
                        }
                        var52.field771 = var50 * 128 + var59 * 64;
                        var52.field773 = var51 * 128 + var60 * 64;
                        var52.field772 = this.method45(var52.field771, var52.field773, this.field372, 43591);
                        if (var39 > var44) {
                            byte var61 = var39;
                            var39 = var44;
                            var44 = var61;
                        }
                        if (var47 > var48) {
                            byte var62 = var47;
                            var47 = var48;
                            var48 = var62;
                        }
                        var52.field780 = var39 + var50;
                        var52.field782 = var44 + var50;
                        var52.field781 = var47 + var51;
                        var52.field783 = var48 + var51;
                    }
                }
            }
            if (arg2 == 69) {
                int var63 = arg0.method455();
                int var64 = (var63 >> 4 & 7) + this.field557;
                int var65 = (var63 & 7) + this.field558;
                int var66 = arg0.method457();
                int var67 = arg0.method455();
                int var68 = var67 >> 4 & 15;
                int var69 = var67 & 7;
                if (field219.field1391[0] >= var64 - var68 && field219.field1391[0] <= var64 + var68 && field219.field1392[0] >= var65 - var68 && field219.field1392[0] <= var65 + var68 && this.field565 && !field291 && this.field223 < 50) {
                    this.field443[this.field223] = var66;
                    this.field324[this.field223] = var69;
                    this.field91[this.field223] = class14.field703[var66];
                    ++this.field223;
                }
            }
            if (arg2 == 57) {
                int var70 = arg0.method455();
                int var71 = var70 >> 2;
                int var72 = var70 & 3;
                int var73 = this.field358[var71];
                int var74 = arg0.method475(true);
                int var75 = (var74 >> 4 & 7) + this.field557;
                int var76 = (var74 & 7) + this.field558;
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    this.method98(false, 0, -1, var75, var76, var72, var71, var73, this.field372, -1);
                }
            } else if (arg2 == 220) {
                int var77 = arg0.method475(true);
                int var78 = (var77 >> 4 & 7) + this.field557;
                int var79 = (var77 & 7) + this.field558;
                int var80 = arg0.method481(false);
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    class5 var81 = this.field194[this.field372][var78][var79];
                    if (var81 != null) {
                        for (class22 var82 = (class22) var81.method33(); var82 != null; var82 = (class22) var81.method35((byte) 8)) {
                            if ((var80 & 32767) == var82.field814) {
                                var82.method505();
                                break;
                            }
                        }
                        if (var81.method33() == null) {
                            this.field194[this.field372][var78][var79] = null;
                        }
                        this.method126(var78, var79);
                    }
                }
            } else if (arg2 != 194) {
                if (arg2 == 137) {
                    int var91 = arg0.method455();
                    int var92 = (var91 >> 4 & 7) + this.field557;
                    int var93 = (var91 & 7) + this.field558;
                    int var94 = arg0.method457();
                    int var95 = arg0.method455();
                    int var96 = arg0.method457();
                    if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                        int var97 = var92 * 128 + 64;
                        int var98 = var93 * 128 + 64;
                        class12 var99 = new class12(field247, var94, this.method45(var97, var98, this.field372, 43591) - var95, var98, var96, this.field372, var97, (byte) -126);
                        this.field549.method30(var99);
                    }
                } else if (arg2 == 128) {
                    int var100 = arg0.method457();
                    int var101 = arg0.method455();
                    int var102 = (var101 >> 4 & 7) + this.field557;
                    int var103 = (var101 & 7) + this.field558;
                    int var104 = arg0.method455();
                    int var105 = var104 >> 2;
                    int var106 = var104 & 3;
                    int var107 = this.field358[var105];
                    if (var102 >= 0 && var103 >= 0 && var102 < 103 && var103 < 103) {
                        int var108 = this.field423[this.field372][var102][var103];
                        int var109 = this.field423[this.field372][var102 + 1][var103];
                        int var110 = this.field423[this.field372][var102 + 1][var103 + 1];
                        int var111 = this.field423[this.field372][var102][var103 + 1];
                        if (var107 == 0) {
                            class40 var112 = this.field112.method386(this.field372, var103, var102, -17367);
                            if (var112 != null) {
                                int var113 = var112.field1158 >> 14 & 32767;
                                if (var105 == 2) {
                                    var112.field1156 = new class50(var109, var106 + 4, var110, var111, 2, var108, var100, true, false, var113);
                                    var112.field1157 = new class50(var109, var106 + 1 & 3, var110, var111, 2, var108, var100, true, false, var113);
                                } else {
                                    var112.field1156 = new class50(var109, var106, var110, var111, var105, var108, var100, true, false, var113);
                                }
                            }
                        }
                        if (var107 == 1) {
                            class36 var114 = this.field112.method387(var102, (byte) 6, var103, this.field372);
                            if (var114 != null) {
                                var114.field979 = new class50(var109, 0, var110, var111, 4, var108, var100, true, false, var114.field980 >> 14 & 32767);
                            }
                        }
                        if (var107 == 2) {
                            class10 var115 = this.field112.method388(false, var102, var103, this.field372);
                            if (var105 == 11) {
                                var105 = 10;
                            }
                            if (var115 != null) {
                                var115.field656 = new class50(var109, var106, var110, var111, var105, var108, var100, true, false, var115.field664 >> 14 & 32767);
                            }
                        }
                        if (var107 == 3) {
                            class69 var116 = this.field112.method389(this.field372, var103, (byte) 3, var102);
                            if (var116 != null) {
                                var116.field1745 = new class50(var109, var106, var110, var111, 22, var108, var100, true, false, var116.field1746 >> 14 & 32767);
                            }
                        }
                    }
                } else if (arg2 == 51) {
                    int var117 = arg0.method483(this.field159);
                    int var118 = arg0.method474(0);
                    int var119 = (var118 >> 4 & 7) + this.field557;
                    int var120 = (var118 & 7) + this.field558;
                    int var121 = arg0.method457();
                    if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                        class22 var122 = new class22();
                        var122.field814 = var117;
                        var122.field813 = var121;
                        if (this.field194[this.field372][var119][var120] == null) {
                            this.field194[this.field372][var119][var120] = new class5(-7255);
                        }
                        this.field194[this.field372][var119][var120].method30(var122);
                        this.method126(var119, var120);
                    }
                }
            } else {
                int var83 = arg0.method455();
                int var84 = (var83 >> 4 & 7) + this.field557;
                int var85 = (var83 & 7) + this.field558;
                int var86 = arg0.method457();
                int var87 = arg0.method457();
                int var88 = arg0.method457();
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    class5 var89 = this.field194[this.field372][var84][var85];
                    if (var89 != null) {
                        for (class22 var90 = (class22) var89.method33(); var90 != null; var90 = (class22) var89.method35((byte) 8)) {
                            if ((var86 & 32767) == var90.field814 && var90.field813 == var87) {
                                var90.field813 = var88;
                                break;
                            }
                        }
                        this.method126(var84, var85);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method132(int arg0) {
        class15 var2 = (class15) this.field555.method33();
        this.field416 += arg0;
        while (var2 != null) {
            if (this.field372 == var2.field732 && field247 <= var2.field717) {
                if (field247 >= var2.field716) {
                    if (var2.field731 > 0) {
                        class42 var3 = this.field143[var2.field731 - 1];
                        if (var3 != null && var3.field1383 >= 0 && var3.field1383 < 13312 && var3.field1384 >= 0 && var3.field1384 < 13312) {
                            var2.method217((byte) 7, var3.field1383, this.method45(var3.field1383, var3.field1384, var2.field732, 43591) - var2.field727, var3.field1384, field247);
                        }
                    }
                    if (var2.field731 < 0) {
                        int var4 = -var2.field731 - 1;
                        class20 var5;
                        if (this.field526 == var4) {
                            var5 = field219;
                        } else {
                            var5 = this.field117[var4];
                        }
                        if (var5 != null && var5.field1383 >= 0 && var5.field1383 < 13312 && var5.field1384 >= 0 && var5.field1384 < 13312) {
                            var2.method217((byte) 7, var5.field1383, this.method45(var5.field1383, var5.field1384, var2.field732, 43591) - var2.field727, var5.field1384, field247);
                        }
                    }
                    var2.method218(false, this.field355);
                    this.field112.method375((int) var2.field722, (int) var2.field723, -1, var2.field734, this.field372, false, (int) var2.field721, false, var2, 60);
                }
            } else {
                var2.method505();
            }
            var2 = (class15) this.field555.method35((byte) 8);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILRGCGKKUR;I)V")
    private final void method133(int arg0, class53 arg1, int arg2) {
        this.field161 = 0;
        this.field120 = 0;
        this.method96(arg1, arg0, 566);
        this.method152(arg1, false, arg0);
        if (arg2 < 0) {
            this.method40(this.field302, arg1, arg0);
            this.method107(-26716, arg0, arg1);
            for (int var4 = 0; var4 < this.field161; ++var4) {
                int var6 = this.field162[var4];
                if (field247 != this.field117[var6].field1410) {
                    this.field117[var6] = null;
                }
            }
            if (arg1.field1539 != arg0) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1539 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field118; ++var5) {
                    if (this.field117[this.field119[var5]] == null) {
                        signlink.reporterror(this.field421 + " null entry in pl list - pos:" + var5 + " size:" + this.field118);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method134(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field434 >= 100 && this.field476 != 1) {
                this.method163((byte) -83, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
            } else if (this.field434 >= 200) {
                this.method163((byte) -83, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
            } else {
                String var4 = class55.method501(class55.method498(-39, arg1), false);
                for (int var5 = 0; var5 < this.field434; ++var5) {
                    if (this.field294[var5] == arg1) {
                        this.method163((byte) -83, var4 + " is already on your friend list", 0, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field412; ++var6) {
                    if (this.field123[var6] == arg1) {
                        this.method163((byte) -83, "Please remove " + var4 + " from your ignore list first", 0, "");
                        return;
                    }
                }
                if (arg0 <= 0) {
                    this.field194 = null;
                }
                if (!var4.equals(field219.field785)) {
                    this.field460[this.field434] = var4;
                    this.field294[this.field434] = arg1;
                    this.field139[this.field434] = 0;
                    ++this.field434;
                    this.field307 = true;
                    this.field532.method444(this.field134, 73);
                    this.field532.method451(arg1, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LQUBPQDMQ;I)Z")
    public final boolean method135(class51 arg0, int arg1) {
        if (arg1 != 1203) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg0.field1497;
        if (this.field435 == 2) {
            if (var4 == 201) {
                this.field237 = true;
                this.field413 = 0;
                this.field245 = true;
                this.field267 = "";
                this.field424 = 1;
                this.field396 = "Enter name of friend to add to list";
            }
            if (var4 == 202) {
                this.field237 = true;
                this.field413 = 0;
                this.field245 = true;
                this.field267 = "";
                this.field424 = 2;
                this.field396 = "Enter name of friend to delete from list";
            }
        }
        if (var4 == 205) {
            this.field420 = 250;
            return true;
        } else {
            if (var4 == 501) {
                this.field237 = true;
                this.field413 = 0;
                this.field245 = true;
                this.field267 = "";
                this.field424 = 4;
                this.field396 = "Enter name of player to add to list";
            }
            if (var4 == 502) {
                this.field237 = true;
                this.field413 = 0;
                this.field245 = true;
                this.field267 = "";
                this.field424 = 5;
                this.field396 = "Enter name of player to delete from list";
            }
            if (var4 >= 300 && var4 <= 313) {
                int var5 = (var4 - 300) / 2;
                int var6 = var4 & 1;
                int var7 = this.field361[var5];
                if (var7 != -1) {
                    while (true) {
                        if (var6 == 0) {
                            --var7;
                            if (var7 < 0) {
                                var7 = class21.field804 - 1;
                            }
                        }
                        if (var6 == 1) {
                            ++var7;
                            if (var7 >= class21.field804) {
                                var7 = 0;
                            }
                        }
                        if (!class21.field805[var7].field811 && class21.field805[var7].field806 == var5 + (this.field530 ? 0 : 7)) {
                            this.field361[var5] = var7;
                            this.field446 = true;
                            break;
                        }
                    }
                }
            }
            if (var4 >= 314 && var4 <= 323) {
                int var8 = (var4 - 314) / 2;
                int var9 = var4 & 1;
                int var10 = this.field96[var8];
                if (var9 == 0) {
                    --var10;
                    if (var10 < 0) {
                        var10 = field264[var8].length - 1;
                    }
                }
                if (var9 == 1) {
                    ++var10;
                    if (var10 >= field264[var8].length) {
                        var10 = 0;
                    }
                }
                this.field96[var8] = var10;
                this.field446 = true;
            }
            if (var4 == 324 && !this.field530) {
                this.field530 = true;
                this.method100(268);
            }
            if (var4 == 325 && this.field530) {
                this.field530 = false;
                this.method100(268);
            }
            if (var4 != 326) {
                if (var4 == 620) {
                    this.field563 = !this.field563;
                }
                if (var4 >= 601 && var4 <= 613) {
                    this.method58(0);
                    if (this.field256.length() > 0) {
                        this.field532.method444(this.field134, 187);
                        this.field532.method451(class55.method497(this.field256), 0);
                        this.field532.method445(var4 - 601);
                        this.field532.method445(this.field563 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field532.method444(this.field134, 140);
                this.field532.method445(this.field530 ? 0 : 1);
                for (int var11 = 0; var11 < 7; ++var11) {
                    this.field532.method445(this.field361[var11]);
                }
                for (int var12 = 0; var12 < 5; ++var12) {
                    this.field532.method445(this.field96[var12]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILOZYWPVDM;I)V")
    public final void method136(int arg0, class47 arg1, int arg2) {
        if (arg0 == 0) {
            this.method137(arg1.field1384, arg2, false, arg1.field1383);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)V")
    public final void method137(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 >= 128 && arg0 >= 128 && arg3 <= 13056 && arg0 <= 13056) {
            int var5 = this.method45(arg3, arg0, this.field372, 43591) - arg1;
            int var6 = arg3 - this.field453;
            int var7 = var5 - this.field454;
            int var8 = arg0 - this.field455;
            int var9 = class37.field1058[this.field456];
            int var10 = class37.field1059[this.field456];
            int var11 = class37.field1058[this.field457];
            int var12 = class37.field1059[this.field457];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (arg2) {
                this.field134 = !this.field134;
            }
            if (var17 >= 50) {
                this.field178 = (var13 << 9) / var17 + class6.field590;
                this.field179 = (var16 << 9) / var17 + class6.field591;
            } else {
                this.field178 = -1;
                this.field179 = -1;
            }
        } else {
            this.field178 = -1;
            this.field179 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LZSWNSCUQ;ZII)V")
    public final void method138(class72 arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.method113();
        }
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field478 + this.field172 & 2047;
            int var7 = class37.field1058[var6];
            int var8 = class37.field1059[var6];
            int var9 = var7 * 256 / (this.field125 + 256);
            int var10 = var8 * 256 / (this.field125 + 256);
            int var11 = arg2 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg2 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field269.method601(var13, 83 - var16 - 20, false, var15 + 94 + 4 - 10, 20, 15, 256, 20, 15);
        } else {
            this.method170(46599, arg3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field547) {
            this.method92(0);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public static final void method139(int arg0) {
        class45.field1264 = false;
        if (arg0 == 19662) {
            class6.field585 = false;
            field291 = false;
            class30.field923 = false;
            class39.field1115 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method140(int arg0, int arg1) {
        if (arg0 >= 0) {
            int var3 = this.field364[arg0];
            int var4 = this.field365[arg0];
            int var5 = this.field366[arg0];
            int var6 = this.field367[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field413 != 0 && var5 != 1033) {
                this.field413 = 0;
                this.field237 = true;
            }
            if (var5 == 695 && this.method153(var4, var6, var3, -41819)) {
                this.field532.method444(this.field134, 106);
                this.field532.method480(this.field327, this.field152);
                this.field532.method446(this.field234 + var4);
                this.field532.method478(this.field233 + var3, -48);
                this.field532.method479(this.field151, 912);
                this.field532.method478(this.field150, -48);
                this.field532.method479(var6 >> 14 & 32767, 912);
            }
            if (var5 == 822) {
                class20 var7 = this.field117[var6];
                if (var7 != null) {
                    this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var7.field1391[0], var7.field1392[0]);
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 2;
                    this.field165 = 0;
                    this.field532.method444(this.field134, 190);
                    this.field532.method479(this.field568, 912);
                    this.field532.method480(this.field327, var6);
                }
            }
            if (var5 == 716) {
                class20 var8 = this.field117[var6];
                if (var8 != null) {
                    this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var8.field1391[0], var8.field1392[0]);
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 2;
                    this.field165 = 0;
                    this.field532.method444(this.field134, 169);
                    this.field532.method478(var6, -48);
                }
            }
            if (var5 == 549) {
                if (!this.field537) {
                    this.field112.method402(super.field1092 - 4, -923, super.field1091 - 4);
                } else {
                    this.field112.method402(var4 - 4, -923, var3 - 4);
                }
            }
            if (var5 == 598) {
                class51 var9 = class51.method435(var4);
                this.field567 = 1;
                this.field568 = var4;
                this.field569 = var9.field1494;
                this.field149 = 0;
                this.field307 = true;
                String var10 = var9.field1476;
                if (var10.indexOf(" ") != -1) {
                    var10 = var10.substring(0, var10.indexOf(" "));
                }
                String var11 = var9.field1476;
                if (var11.indexOf(" ") != -1) {
                    var11 = var11.substring(var11.indexOf(" ") + 1);
                }
                this.field570 = var10 + " " + var9.field1456 + " " + var11;
                if (this.field569 == 16) {
                    this.field307 = true;
                    this.field533 = 3;
                    this.field432 = true;
                }
            } else if (var5 == 960) {
                this.field149 = 1;
                this.field150 = var3;
                this.field151 = var4;
                this.field152 = var6;
                this.field153 = String.valueOf(class4.method22(var6).field67);
                this.field567 = 0;
                this.field307 = true;
            } else {
                if (var5 == 144) {
                    class42 var12 = this.field143[var6];
                    if (var12 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var12.field1391[0], var12.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        if ((var6 & 3) == 0) {
                            ++field415;
                        }
                        if (field415 >= 106) {
                            this.field532.method444(this.field134, 32);
                            this.field532.method446(55586);
                            field415 = 0;
                        }
                        this.field532.method444(this.field134, 18);
                        this.field532.method479(var6, 912);
                    }
                }
                if (var5 == 480) {
                    class20 var13 = this.field117[var6];
                    if (var13 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var13.field1391[0], var13.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        field579 += var6;
                        if (field579 >= 89) {
                            this.field532.method444(this.field134, 85);
                            this.field532.method449(0);
                            field579 = 0;
                        }
                        this.field532.method444(this.field134, 113);
                        this.field532.method446(var6);
                    }
                }
                if (var5 == 744) {
                    class42 var14 = this.field143[var6];
                    if (var14 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var14.field1391[0], var14.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        this.field532.method444(this.field134, 105);
                        this.field532.method446(var6);
                    }
                }
                if (var5 == 651) {
                    class20 var15 = this.field117[var6];
                    if (var15 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var15.field1391[0], var15.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        this.field532.method444(this.field134, 138);
                        this.field532.method478(var6, -48);
                    }
                }
                if (var5 == 541) {
                    String var16 = this.field209[arg0];
                    int var17 = var16.indexOf("@whi@");
                    if (var17 != -1) {
                        if (this.field357 == -1) {
                            this.method58(0);
                            this.field256 = var16.substring(var17 + 5).trim();
                            this.field563 = false;
                            this.field94 = this.field357 = class51.field1481;
                        } else {
                            this.method163((byte) -83, "Please close the interface you have open before using 'report abuse'", 0, "");
                        }
                    }
                }
                if (var5 == 881) {
                    class42 var18 = this.field143[var6];
                    if (var18 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var18.field1391[0], var18.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        field534 += var6;
                        if (field534 >= 132) {
                            this.field532.method444(this.field134, 20);
                            this.field532.method449(0);
                            field534 = 0;
                        }
                        this.field532.method444(this.field134, 148);
                        this.field532.method480(this.field327, var6);
                    }
                }
                if (var5 == 125) {
                    this.field532.method444(this.field134, 90);
                    this.field532.method480(this.field327, var6);
                    this.field532.method478(var3, -48);
                    this.field532.method478(var4, -48);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 579) {
                    this.method58(0);
                }
                if (var5 == 183 && this.method153(var4, var6, var3, -41819)) {
                    this.field532.method444(this.field134, 55);
                    this.field532.method480(this.field327, var6 >> 14 & 32767);
                    this.field532.method446(this.field233 + var3);
                    this.field532.method478(this.field234 + var4, -48);
                    this.field532.method479(this.field568, 912);
                }
                if (var5 == 138 || var5 == 997 || var5 == 154 || var5 == 837) {
                    String var19 = this.field209[arg0];
                    int var20 = var19.indexOf("@whi@");
                    if (var20 != -1) {
                        long var21 = class55.method497(var19.substring(var20 + 5).trim());
                        if (var5 == 138) {
                            this.method134(842, var21);
                        }
                        if (var5 == 997) {
                            this.method176(0, var21);
                        }
                        if (var5 == 154) {
                            this.method151(var21, false);
                        }
                        if (var5 == 837) {
                            this.method117(var21, this.field397);
                        }
                    }
                }
                if (var5 == 322 && !this.field140) {
                    this.field532.method444(this.field134, 185);
                    this.field532.method446(var4);
                    this.field140 = true;
                }
                if (var5 == 669) {
                    boolean var23 = this.method164(584, 0, field219.field1392[0], 0, field219.field1391[0], 0, 0, 0, false, 2, var3, var4);
                    if (!var23) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var3, var4);
                    }
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 2;
                    this.field165 = 0;
                    this.field532.method444(this.field134, 172);
                    this.field532.method480(this.field327, var6);
                    this.field532.method480(this.field327, this.field233 + var3);
                    this.field532.method446(this.field234 + var4);
                }
                if (var5 == 551) {
                    this.field532.method444(this.field134, 8);
                    this.field532.method479(var6, 912);
                    this.field532.method478(var3, -48);
                    this.field532.method446(var4);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 559) {
                    this.method39((byte) 6, this.field350);
                    this.field350 = -1;
                    this.field237 = true;
                }
                if (var5 == 264) {
                    class20 var25 = this.field117[var6];
                    if (var25 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var25.field1391[0], var25.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        this.field532.method444(this.field134, 75);
                        this.field532.method478(var6, -48);
                    }
                }
                if (var5 == 78) {
                    boolean var26 = this.method164(584, 0, field219.field1392[0], 0, field219.field1391[0], 0, 0, 0, false, 2, var3, var4);
                    if (!var26) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var3, var4);
                    }
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 2;
                    this.field165 = 0;
                    this.field532.method444(this.field134, 119);
                    this.field532.method479(this.field233 + var3, 912);
                    this.field532.method480(this.field327, var6);
                    this.field532.method480(this.field327, this.field234 + var4);
                }
                if (var5 == 59) {
                    class42 var28 = this.field143[var6];
                    if (var28 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var28.field1391[0], var28.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        this.field532.method444(this.field134, 57);
                        this.field532.method480(this.field327, var6);
                    }
                }
                if (var5 == 1103) {
                    this.method153(var4, var6, var3, -41819);
                    this.field532.method444(this.field134, 109);
                    this.field532.method478(this.field234 + var4, -48);
                    this.field532.method478(this.field233 + var3, -48);
                    this.field532.method479(var6 >> 14 & 32767, 912);
                }
                if (var5 == 354) {
                    class42 var29 = this.field143[var6];
                    if (var29 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var29.field1391[0], var29.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        this.field532.method444(this.field134, 49);
                        this.field532.method479(var6, 912);
                    }
                }
                if (var5 == 1977) {
                    class4 var30 = class4.method22(var6);
                    String var31;
                    if (var30.field47 != null) {
                        var31 = new String(var30.field47);
                    } else {
                        var31 = "It's a " + var30.field67 + ".";
                    }
                    this.method163((byte) -83, var31, 0, "");
                }
                if (var5 == 891) {
                    class51 var32 = class51.method435(var4);
                    boolean var33 = true;
                    if (var32.field1497 > 0) {
                        var33 = this.method135(var32, 1203);
                    }
                    if (var33) {
                        this.field532.method444(this.field134, 211);
                        this.field532.method446(var4);
                    }
                }
                if (var5 == 163) {
                    boolean var34 = this.method164(584, 0, field219.field1392[0], 0, field219.field1391[0], 0, 0, 0, false, 2, var3, var4);
                    if (!var34) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var3, var4);
                    }
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 2;
                    this.field165 = 0;
                    this.field532.method444(this.field134, 86);
                    this.field532.method446(this.field150);
                    this.field532.method480(this.field327, var6);
                    this.field532.method478(this.field152, -48);
                    this.field532.method446(this.field151);
                    this.field532.method478(this.field233 + var3, -48);
                    this.field532.method478(this.field234 + var4, -48);
                }
                if (var5 == 288) {
                    if ((this.field233 & 3) == 0) {
                        ++field520;
                    }
                    if (field520 >= 107) {
                        this.field532.method444(this.field134, 156);
                        this.field532.method449(0);
                        field520 = 0;
                    }
                    this.method153(var4, var6, var3, -41819);
                    this.field532.method444(this.field134, 7);
                    this.field532.method478(this.field234 + var4, -48);
                    this.field532.method478(var6 >> 14 & 32767, -48);
                    this.field532.method446(this.field233 + var3);
                }
                if (var5 == 405) {
                    class20 var36 = this.field117[var6];
                    if (var36 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var36.field1391[0], var36.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        this.field532.method444(this.field134, 130);
                        this.field532.method446(this.field151);
                        this.field532.method480(this.field327, var6);
                        this.field532.method480(this.field327, this.field152);
                        this.field532.method478(this.field150, -48);
                    }
                }
                if (var5 == 740) {
                    boolean var37 = this.method164(584, 0, field219.field1392[0], 0, field219.field1391[0], 0, 0, 0, false, 2, var3, var4);
                    if (!var37) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var3, var4);
                    }
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 2;
                    this.field165 = 0;
                    this.field532.method444(this.field134, 192);
                    this.field532.method480(this.field327, this.field234 + var4);
                    this.field532.method480(this.field327, this.field233 + var3);
                    this.field532.method480(this.field327, var6);
                }
                if (var5 == 708) {
                    class42 var39 = this.field143[var6];
                    if (var39 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var39.field1391[0], var39.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        this.field532.method444(this.field134, 235);
                        this.field532.method480(this.field327, this.field151);
                        this.field532.method480(this.field327, this.field150);
                        this.field532.method480(this.field327, var6);
                        this.field532.method446(this.field152);
                    }
                }
                if (var5 == 840) {
                    this.field532.method444(this.field134, 131);
                    this.field532.method480(this.field327, var3);
                    this.field532.method446(var4);
                    this.field532.method479(var6, 912);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 1219) {
                    class42 var40 = this.field143[var6];
                    if (var40 != null) {
                        class68 var41 = var40.field1206;
                        if (var41.field1705 != null) {
                            var41 = var41.method580(0);
                        }
                        if (var41 != null) {
                            String var42;
                            if (var41.field1709 != null) {
                                var42 = new String(var41.field1709);
                            } else {
                                var42 = "It's a " + var41.field1741 + ".";
                            }
                            this.method163((byte) -83, var42, 0, "");
                        }
                    }
                }
                if (var5 == 769) {
                    field408 += var4;
                    if (field408 >= 97) {
                        this.field532.method444(this.field134, 16);
                        this.field532.method446(43274);
                        field408 = 0;
                    }
                    this.method153(var4, var6, var3, -41819);
                    this.field532.method444(this.field134, 145);
                    this.field532.method480(this.field327, this.field233 + var3);
                    this.field532.method478(this.field234 + var4, -48);
                    this.field532.method478(var6 >> 14 & 32767, -48);
                }
                if (var5 == 682) {
                    this.field532.method444(this.field134, 211);
                    this.field532.method446(var4);
                    class51 var43 = class51.method435(var4);
                    if (var43.field1519 != null && var43.field1519[0][0] == 5) {
                        int var44 = var43.field1519[0][1];
                        this.field187[var44] = 1 - this.field187[var44];
                        this.method124(var44, this.field487);
                        this.field307 = true;
                    }
                }
                if (var5 == 330) {
                    this.field532.method444(this.field134, 78);
                    this.field532.method446(var6);
                    this.field532.method478(var4, -48);
                    this.field532.method446(var3);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 283) {
                    class20 var45 = this.field117[var6];
                    if (var45 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var45.field1391[0], var45.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        field246 += var6;
                        if (field246 >= 88) {
                            this.field532.method444(this.field134, 163);
                            this.field532.method446(5996);
                            field246 = 0;
                        }
                        this.field532.method444(this.field134, 99);
                        this.field532.method446(var6);
                    }
                }
                if (var5 == 688) {
                    field480 += var6;
                    if (field480 >= 119) {
                        this.field532.method444(this.field134, 205);
                        this.field532.method446(11544);
                        field480 = 0;
                    }
                    this.field532.method444(this.field134, 242);
                    this.field532.method479(var3, 912);
                    this.field532.method478(var6, -48);
                    this.field532.method478(var4, -48);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 261) {
                    this.field532.method444(this.field134, 183);
                    this.field532.method479(var3, 912);
                    this.field532.method479(var4, 912);
                    this.field532.method480(this.field327, var6);
                    this.field532.method478(this.field568, -48);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 946) {
                    String var46 = this.field209[arg0];
                    int var47 = var46.indexOf("@whi@");
                    if (var47 != -1) {
                        long var48 = class55.method497(var46.substring(var47 + 5).trim());
                        int var50 = -1;
                        for (int var51 = 0; var51 < this.field434; ++var51) {
                            if (this.field294[var51] == var48) {
                                var50 = var51;
                                break;
                            }
                        }
                        if (var50 != -1 && this.field139[var50] > 0) {
                            this.field237 = true;
                            this.field413 = 0;
                            this.field245 = true;
                            this.field267 = "";
                            this.field424 = 3;
                            this.field85 = this.field294[var50];
                            this.field396 = "Enter message to send to " + this.field460[var50];
                        }
                    }
                }
                if (var5 == 459) {
                    if ((var4 & 3) == 0) {
                        ++field465;
                    }
                    if (field465 >= 78) {
                        this.field532.method444(this.field134, 72);
                        this.field532.method445(127);
                        field465 = 0;
                    }
                    this.field532.method444(this.field134, 28);
                    this.field532.method480(this.field327, var4);
                    this.field532.method478(var6, -48);
                    this.field532.method480(this.field327, var3);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 550) {
                    boolean var52 = this.method164(584, 0, field219.field1392[0], 0, field219.field1391[0], 0, 0, 0, false, 2, var3, var4);
                    if (!var52) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var3, var4);
                    }
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 2;
                    this.field165 = 0;
                    this.field532.method444(this.field134, 250);
                    this.field532.method480(this.field327, this.field568);
                    this.field532.method478(this.field233 + var3, -48);
                    this.field532.method478(this.field234 + var4, -48);
                    this.field532.method480(this.field327, var6);
                }
                if (var5 == 1415) {
                    int var54 = var6 >> 14 & 32767;
                    class39 var55 = class39.method323(var54);
                    String var56;
                    if (var55.field1146 != null) {
                        var56 = new String(var55.field1146);
                    } else {
                        var56 = "It's a " + var55.field1132 + ".";
                    }
                    this.method163((byte) -83, var56, 0, "");
                }
                if (var5 == 119 || var5 == 875) {
                    String var57 = this.field209[arg0];
                    int var58 = var57.indexOf("@whi@");
                    if (var58 != -1) {
                        String var59 = var57.substring(var58 + 5).trim();
                        String var60 = class55.method501(class55.method498(-39, class55.method497(var59)), false);
                        boolean var61 = false;
                        for (int var62 = 0; var62 < this.field118; ++var62) {
                            class20 var63 = this.field117[this.field119[var62]];
                            if (var63 != null && var63.field785 != null && var63.field785.equalsIgnoreCase(var60)) {
                                this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var63.field1391[0], var63.field1392[0]);
                                if (var5 == 119) {
                                    field246 += var6;
                                    if (field246 >= 88) {
                                        this.field532.method444(this.field134, 163);
                                        this.field532.method446(5996);
                                        field246 = 0;
                                    }
                                    this.field532.method444(this.field134, 99);
                                    this.field532.method446(this.field119[var62]);
                                }
                                if (var5 == 875) {
                                    this.field532.method444(this.field134, 75);
                                    this.field532.method478(this.field119[var62], -48);
                                }
                                var61 = true;
                                break;
                            }
                        }
                        if (!var61) {
                            this.method163((byte) -83, "Unable to find " + var60, 0, "");
                        }
                    }
                }
                if (var5 == 813) {
                    this.field532.method444(this.field134, 243);
                    this.field532.method446(var4);
                    this.field532.method479(var3, 912);
                    this.field532.method479(var6, 912);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 1985) {
                    class4 var64 = class4.method22(var6);
                    class51 var65 = class51.method435(var4);
                    String var66;
                    if (var65 != null && var65.field1468[var3] >= 100000) {
                        var66 = var65.field1468[var3] + " x " + var64.field67;
                    } else if (var64.field47 != null) {
                        var66 = new String(var64.field47);
                    } else {
                        var66 = "It's a " + var64.field67 + ".";
                    }
                    this.method163((byte) -83, var66, 0, "");
                }
                if (var5 == 548) {
                    this.field532.method444(this.field134, 211);
                    this.field532.method446(var4);
                    class51 var67 = class51.method435(var4);
                    if (var67.field1519 != null && var67.field1519[0][0] == 5) {
                        int var68 = var67.field1519[0][1];
                        if (this.field187[var68] != var67.field1510[0]) {
                            this.field187[var68] = var67.field1510[0];
                            this.method124(var68, this.field487);
                            this.field307 = true;
                        }
                    }
                }
                if (var5 == 301) {
                    this.method153(var4, var6, var3, -41819);
                    this.field532.method444(this.field134, 41);
                    this.field532.method479(var6 >> 14 & 32767, 912);
                    this.field532.method478(this.field234 + var4, -48);
                    this.field532.method479(this.field233 + var3, 912);
                }
                if (var5 == 773) {
                    this.field532.method444(this.field134, 35);
                    this.field532.method480(this.field327, var3);
                    this.field532.method478(var4, -48);
                    this.field532.method479(var6, 912);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 6) {
                    if ((var6 & 3) == 0) {
                        ++field572;
                    }
                    if (field572 >= 93) {
                        this.field532.method444(this.field134, 144);
                        this.field532.method449(0);
                        field572 = 0;
                    }
                    this.field532.method444(this.field134, 33);
                    this.field532.method478(var6, -48);
                    this.field532.method480(this.field327, var3);
                    this.field532.method446(var4);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 126) {
                    boolean var69 = this.method164(584, 0, field219.field1392[0], 0, field219.field1391[0], 0, 0, 0, false, 2, var3, var4);
                    if (!var69) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var3, var4);
                    }
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 2;
                    this.field165 = 0;
                    this.field532.method444(this.field134, 27);
                    this.field532.method478(var6, -48);
                    this.field532.method478(this.field233 + var3, -48);
                    this.field532.method478(this.field234 + var4, -48);
                }
                if (var5 == 652) {
                    this.method153(var4, var6, var3, -41819);
                    this.field532.method444(this.field134, 189);
                    this.field532.method478(var6 >> 14 & 32767, -48);
                    this.field532.method446(this.field234 + var4);
                    this.field532.method478(this.field233 + var3, -48);
                }
                if (var5 == 612) {
                    this.field532.method444(this.field134, 69);
                    this.field532.method478(this.field152, -48);
                    this.field532.method478(var4, -48);
                    this.field532.method478(this.field150, -48);
                    this.field532.method479(var6, 912);
                    this.field532.method479(this.field151, 912);
                    this.field532.method479(var3, 912);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                if (var5 == 834) {
                    class42 var71 = this.field143[var6];
                    if (var71 != null) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var71.field1391[0], var71.field1392[0]);
                        this.field163 = super.field1091;
                        this.field164 = super.field1092;
                        this.field166 = 2;
                        this.field165 = 0;
                        this.field532.method444(this.field134, 83);
                        this.field532.method480(this.field327, var6);
                        this.field532.method480(this.field327, this.field568);
                    }
                }
                if (var5 == 922) {
                    boolean var72 = this.method164(584, 0, field219.field1392[0], 0, field219.field1391[0], 0, 0, 0, false, 2, var3, var4);
                    if (!var72) {
                        this.method164(584, 0, field219.field1392[0], 1, field219.field1391[0], 0, 1, 0, false, 2, var3, var4);
                    }
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 2;
                    this.field165 = 0;
                    this.field532.method444(this.field134, 100);
                    this.field532.method446(var6);
                    this.field532.method480(this.field327, this.field233 + var3);
                    this.field532.method478(this.field234 + var4, -48);
                }
                if (var5 == 616) {
                    this.field532.method444(this.field134, 24);
                    this.field532.method480(this.field327, var6);
                    this.field532.method478(var3, -48);
                    this.field532.method478(var4, -48);
                    this.field204 = 0;
                    this.field205 = var4;
                    this.field206 = var3;
                    this.field207 = 2;
                    if (class51.method435(var4).field1471 == this.field357) {
                        this.field207 = 1;
                    }
                    if (class51.method435(var4).field1471 == this.field452) {
                        this.field207 = 3;
                    }
                }
                this.field149 = 0;
                this.field567 = 0;
                this.field307 = true;
                if (arg1 != 19817) {
                    this.field431 = 160;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method141(int arg0) {
        while (arg0 >= 0) {
            this.field368 = !this.field368;
        }
        if (this.field481 > 1) {
            --this.field481;
        }
        if (this.field420 > 0) {
            --this.field420;
        }
        for (int var2 = 0; var2 < 5 && this.method59(0); ++var2) {
        }
        if (this.field196) {
            Object var3 = this.field395.field646;
            synchronized (this.field395.field646) {
                if (!field474) {
                    this.field395.field645 = 0;
                } else if (super.field1090 != 0 || this.field395.field645 >= 40) {
                    this.field532.method444(this.field134, 80);
                    this.field532.method445(0);
                    int var4 = this.field532.field1539;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field395.field645 && var4 - this.field532.field1539 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field395.field651[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field395.field647[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field395.field651[var6] == -1 && this.field395.field647[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field285 == var8 && this.field286 == var7) {
                            if (this.field100 < 2047) {
                                ++this.field100;
                            }
                        } else {
                            int var10 = var8 - this.field285;
                            this.field285 = var8;
                            int var11 = var7 - this.field286;
                            this.field286 = var7;
                            if (this.field100 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field532.method446((this.field100 << 12) + (var10 << 6) + var11);
                                this.field100 = 0;
                            } else if (this.field100 < 8) {
                                this.field532.method448((this.field100 << 19) + 8388608 + var9);
                                this.field100 = 0;
                            } else {
                                this.field532.method449((this.field100 << 19) + -1073741824 + var9);
                                this.field100 = 0;
                            }
                        }
                    }
                    this.field532.method454(0, this.field532.field1539 - var4);
                    if (var5 >= this.field395.field645) {
                        this.field395.field645 = 0;
                    } else {
                        this.field395.field645 -= var5;
                        for (int var12 = 0; var12 < this.field395.field645; ++var12) {
                            this.field395.field647[var12] = this.field395.field647[var5 + var12];
                            this.field395.field651[var12] = this.field395.field651[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1090 != 0) {
                long var13 = (super.field1093 - this.field429) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field429 = super.field1093;
                int var15 = super.field1092;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1091;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1090 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field532.method444(this.field134, 48);
                this.field532.method487(false, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field471 > 0) {
                --this.field471;
            }
            if (super.field1094[1] == 1 || super.field1094[2] == 1 || super.field1094[3] == 1 || super.field1094[4] == 1) {
                this.field472 = true;
            }
            if (this.field472 && this.field471 <= 0) {
                this.field471 = 20;
                this.field472 = false;
                this.field532.method444(this.field134, 23);
                this.field532.method478(this.field172, -48);
                this.field532.method480(this.field327, this.field171);
            }
            if (super.field1081 && !this.field531) {
                this.field531 = true;
                this.field532.method444(this.field134, 240);
                this.field532.method445(1);
            }
            if (!super.field1081 && this.field531) {
                this.field531 = false;
                this.field532.method444(this.field134, 240);
                this.field532.method445(0);
            }
            this.method118(-14);
            this.method116(this.field538);
            this.method80(-607);
            ++this.field418;
            if (this.field418 > 750) {
                this.method57(31790);
            }
            this.method82(0);
            this.method67(this.field303);
            this.method103(6);
            ++field430;
            if (field430 > 1465) {
                field430 = 0;
                this.field532.method444(this.field134, 2);
                this.field532.method445(0);
                int var20 = this.field532.field1539;
                this.field532.method445(49);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field532.method446(39379);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field532.method446(41943);
                }
                this.field532.method446(58974);
                this.field532.method445((int) (Math.random() * 256.0D));
                this.field532.method445((int) (Math.random() * 256.0D));
                this.field532.method446((int) (Math.random() * 65536.0D));
                this.field532.method446(51515);
                this.field532.method445(17);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field532.method445(167);
                }
                this.field532.method454(0, this.field532.field1539 - var20);
            }
            ++this.field355;
            if (this.field166 != 0) {
                this.field165 += 20;
                if (this.field165 >= 400) {
                    this.field166 = 0;
                }
            }
            if (this.field207 != 0) {
                ++this.field204;
                if (this.field204 >= 15) {
                    if (this.field207 == 2) {
                        this.field307 = true;
                    }
                    if (this.field207 == 3) {
                        this.field237 = true;
                    }
                    this.field207 = 0;
                }
            }
            if (this.field576 != 0) {
                ++this.field212;
                if (super.field1084 > this.field577 + 5 || super.field1084 < this.field577 - 5 || super.field1085 > this.field578 + 5 || super.field1085 < this.field578 - 5) {
                    this.field266 = true;
                }
                if (super.field1083 == 0) {
                    if (this.field576 == 2) {
                        this.field307 = true;
                    }
                    if (this.field576 == 3) {
                        this.field237 = true;
                    }
                    this.field576 = 0;
                    if (this.field266 && this.field212 >= 5) {
                        this.field258 = -1;
                        this.method65(false);
                        if (this.field574 == this.field258 && this.field575 != this.field257) {
                            class51 var21 = class51.method435(this.field574);
                            byte var22 = 0;
                            if (this.field299 == 1 && var21.field1497 == 206) {
                                var22 = 1;
                            }
                            if (var21.field1477[this.field257] <= 0) {
                                var22 = 0;
                            }
                            if (var21.field1488) {
                                int var23 = this.field575;
                                int var24 = this.field257;
                                var21.field1477[var24] = var21.field1477[var23];
                                var21.field1468[var24] = var21.field1468[var23];
                                var21.field1477[var23] = -1;
                                var21.field1468[var23] = 0;
                            } else if (var22 == 1) {
                                int var25 = this.field575;
                                int var26 = this.field257;
                                while (var25 != var26) {
                                    if (var25 > var26) {
                                        var21.method434(var25 - 1, var25, false);
                                        --var25;
                                    } else if (var25 < var26) {
                                        var21.method434(var25 + 1, var25, false);
                                        ++var25;
                                    }
                                }
                            } else {
                                var21.method434(this.field257, this.field575, false);
                            }
                            this.field532.method444(this.field134, 207);
                            this.field532.method446(this.field257);
                            this.field532.method479(this.field575, 912);
                            this.field532.method445(var22);
                            this.field532.method478(this.field574, -48);
                        }
                    } else if ((this.field323 == 1 || this.method150(this.field147 - 1, 33356)) && this.field147 > 2) {
                        this.method42(-712);
                    } else if (this.field147 > 0) {
                        this.method140(this.field147 - 1, this.field129);
                    }
                    this.field204 = 10;
                    super.field1090 = 0;
                }
            }
            ++field82;
            if (field82 > 61) {
                field82 = 0;
                this.field532.method444(this.field134, 166);
            }
            if (class45.field1298 != -1) {
                int var27 = class45.field1298;
                int var28 = class45.field1299;
                boolean var29 = this.method164(584, 0, field219.field1392[0], 0, field219.field1391[0], 0, 0, 0, true, 0, var27, var28);
                class45.field1298 = -1;
                if (var29) {
                    this.field163 = super.field1091;
                    this.field164 = super.field1092;
                    this.field166 = 1;
                    this.field165 = 0;
                }
            }
            if (super.field1090 == 1 && this.field375 != null) {
                this.field375 = null;
                this.field237 = true;
                super.field1090 = 0;
            }
            this.method168(3);
            if (this.field405 == -1) {
                this.method130(-872);
                this.method43((byte) 6);
                this.method53(this.field160);
            }
            if (super.field1083 == 1 || super.field1090 == 1) {
                ++this.field177;
            }
            if (this.field507 == 0 && this.field503 == 0 && this.field387 == 0) {
                if (this.field301 > 0) {
                    --this.field301;
                }
            } else if (this.field301 < 100) {
                ++this.field301;
                if (this.field301 == 100) {
                    if (this.field507 != 0) {
                        this.field237 = true;
                    }
                    if (this.field503 != 0) {
                        this.field307 = true;
                    }
                }
            }
            if (this.field447 == 2) {
                this.method55(0);
            }
            if (this.field447 == 2 && this.field97) {
                this.method54(-498);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field331[var30]++;
            }
            this.method171(-536);
            ++super.field1082;
            if (super.field1082 > 4500) {
                this.field420 = 250;
                super.field1082 -= 500;
                this.field532.method444(this.field134, 46);
            }
            ++this.field304;
            if (this.field304 > 500) {
                this.field304 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field292 += this.field293;
                }
                if ((var31 & 2) == 2) {
                    this.field337 += this.field338;
                }
                if ((var31 & 4) == 4) {
                    this.field513 += this.field514;
                }
            }
            if (this.field292 < -50) {
                this.field293 = 2;
            }
            if (this.field292 > 50) {
                this.field293 = -2;
            }
            if (this.field337 < -55) {
                this.field338 = 2;
            }
            if (this.field337 > 55) {
                this.field338 = -2;
            }
            if (this.field513 < -40) {
                this.field514 = 1;
            }
            if (this.field513 > 40) {
                this.field514 = -1;
            }
            ++this.field391;
            if (this.field391 > 500) {
                this.field391 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field478 += this.field479;
                }
                if ((var32 & 2) == 2) {
                    this.field125 += this.field126;
                }
            }
            if (this.field478 < -60) {
                this.field479 = 2;
            }
            if (this.field478 > 60) {
                this.field479 = -2;
            }
            if (this.field125 < -20) {
                this.field126 = 1;
            }
            if (this.field125 > 10) {
                this.field126 = -1;
            }
            ++this.field419;
            if (this.field419 > 50) {
                this.field532.method444(this.field134, 30);
            }
            try {
                if (this.field348 != null && this.field532.field1539 > 0) {
                    this.field348.method510((byte) 68, 0, this.field532.field1539, this.field532.field1538);
                    this.field532.field1539 = 0;
                    this.field419 = 0;
                }
            } catch (IOException var34) {
                this.method57(31790);
            } catch (Exception var35) {
                this.method94((byte) 9);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)I")
    public final int method142(boolean arg0) {
        int var2 = 3;
        if (arg0) {
            return this.field512;
        } else {
            if (this.field456 < 310) {
                int var3 = this.field453 >> 7;
                int var4 = this.field455 >> 7;
                int var5 = field219.field1383 >> 7;
                int var6 = field219.field1384 >> 7;
                if ((this.field320[this.field372][var3][var4] & 4) != 0) {
                    var2 = this.field372;
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
                        if ((this.field320[this.field372][var3][var4] & 4) != 0) {
                            var2 = this.field372;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field320[this.field372][var3][var4] & 4) != 0) {
                                var2 = this.field372;
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
                        if ((this.field320[this.field372][var3][var4] & 4) != 0) {
                            var2 = this.field372;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field320[this.field372][var3][var4] & 4) != 0) {
                                var2 = this.field372;
                            }
                        }
                    }
                }
            }
            if ((this.field320[this.field372][field219.field1383 >> 7][field219.field1384 >> 7] & 4) != 0) {
                var2 = this.field372;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)I")
    public final int method143(boolean arg0) {
        int var2 = this.method45(this.field453, this.field455, this.field372, 43591);
        this.field196 &= arg0;
        return var2 - this.field454 < 800 && (this.field320[this.field372][this.field453 >> 7][this.field455 >> 7] & 4) != 0 ? this.field372 : 3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LHHSKUOEZ;I)V")
    private final void method144(class17 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field745 == 0) {
            var3 = this.field112.method390(arg0.field744, arg0.field746, arg0.field747);
        }
        if (arg0.field745 == 1) {
            var3 = this.field112.method391((byte) -87, arg0.field744, arg0.field746, arg0.field747);
        }
        if (arg0.field745 == 2) {
            var3 = this.field112.method392(arg0.field744, arg0.field746, arg0.field747);
        }
        if (arg0.field745 == 3) {
            var3 = this.field112.method393(arg0.field744, arg0.field746, arg0.field747);
        }
        if (var3 != 0) {
            int var7 = this.field112.method394(arg0.field744, arg0.field746, arg0.field747, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field741 = var4;
        arg0.field743 = var5;
        if (arg1 != 0) {
            this.field417 = -1;
        }
        arg0.field742 = var6;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method145(byte arg0) {
        short var2 = 256;
        if (this.field409 != arg0) {
            this.field417 = -1;
        }
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field271[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field271[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field272[var14] = (this.field271[var14 - 1] + this.field271[var14 + 1] + this.field271[var14 - 128] + this.field271[var14 + 128]) / 4;
            }
        }
        this.field193 += 128;
        if (this.field193 > this.field154.length) {
            this.field193 -= this.field154.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method60(6718, this.field504[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field272[var11 + 128] - this.field154[this.field193 + var11 & this.field154.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field271[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field450[var8] = this.field450[var8 + 1];
        }
        this.field450[var2 - 1] = (int) (Math.sin((double) field247 / 14.0D) * 16.0D + Math.sin((double) field247 / 15.0D) * 14.0D + Math.sin((double) field247 / 16.0D) * 12.0D);
        if (this.field351 > 0) {
            this.field351 -= 4;
        }
        if (this.field352 > 0) {
            this.field352 -= 4;
        }
        if (this.field351 == 0 && this.field352 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field351 = 1024;
            }
            if (var9 == 1) {
                this.field352 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method146(int arg0, int arg1, int arg2) {
        if (arg0 != 32572) {
            throw new NullPointerException();
        } else {
            int var3 = arg1 - arg2;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method147(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field334 = "";
                this.field335 = "Connecting to server...";
                this.method91((byte) 6, true);
            }
            this.field348 = new class59(this, -499, this.method38(field289 + 43594));
            long var4 = class55.method497(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field532.field1539 = 0;
            this.field532.method445(14);
            this.field532.method445(var6);
            this.field348.method510((byte) 68, 0, 2, this.field532.field1538);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field348.method507();
            }
            int var8 = this.field348.method507();
            int var9 = var8;
            if (var8 == 0) {
                this.field348.method509(this.field402.field1538, 0, 8);
                this.field402.field1539 = 0;
                this.field353 = this.field402.method461(false);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field353 >> 32), (int) this.field353 };
                this.field532.field1539 = 0;
                this.field532.method445(10);
                this.field532.method449(var10[0]);
                this.field532.method449(var10[1]);
                this.field532.method449(var10[2]);
                this.field532.method449(var10[3]);
                this.field532.method449(signlink.uid);
                this.field532.method452(arg0);
                this.field532.method452(arg1);
                this.field532.method470(field511, field356, false);
                this.field83.field1539 = 0;
                if (arg2) {
                    this.field83.method445(18);
                } else {
                    this.field83.method445(16);
                }
                this.field83.method445(this.field532.field1539 + 36 + 1 + 1 + 2);
                this.field83.method445(255);
                this.field83.method446(357);
                this.field83.method445(field291 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field83.method449(this.field553[var11]);
                }
                this.field83.method453(this.field532.field1538, 501, this.field532.field1539, 0);
                this.field532.field1543 = new class24(var10, 0);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field551 = new class24(var10, 0);
                this.field348.method510((byte) 68, 0, this.field83.field1539, this.field83.field1538);
                var8 = this.field348.method507();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method147(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field399 = this.field348.method507();
                field474 = this.field348.method507() == 1;
                this.field429 = 0L;
                this.field100 = 0;
                this.field395.field645 = 0;
                super.field1081 = true;
                this.field531 = true;
                this.field196 = true;
                this.field532.field1539 = 0;
                this.field402.field1539 = 0;
                this.field417 = -1;
                this.field213 = -1;
                this.field214 = -1;
                this.field215 = -1;
                this.field416 = 0;
                this.field418 = 0;
                this.field481 = 0;
                this.field420 = 0;
                this.field393 = 0;
                this.field147 = 0;
                this.field537 = false;
                super.field1082 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field438[var13] = null;
                }
                this.field149 = 0;
                this.field567 = 0;
                this.field447 = 0;
                this.field223 = 0;
                this.field292 = (int) (Math.random() * 100.0D) - 50;
                this.field337 = (int) (Math.random() * 110.0D) - 55;
                this.field513 = (int) (Math.random() * 80.0D) - 40;
                this.field478 = (int) (Math.random() * 120.0D) - 60;
                this.field125 = (int) (Math.random() * 30.0D) - 20;
                this.field172 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field167 = 0;
                this.field550 = -1;
                this.field462 = 0;
                this.field463 = 0;
                this.field118 = 0;
                this.field144 = 0;
                for (int var14 = 0; var14 < this.field115; ++var14) {
                    this.field117[var14] = null;
                    this.field122[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field143[var15] = null;
                }
                field219 = this.field117[this.field116] = new class20();
                this.field555.method37();
                this.field549.method37();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field194[var16][var17][var18] = null;
                        }
                    }
                }
                this.field238 = new class5(-7255);
                this.field435 = 0;
                this.field434 = 0;
                this.method39((byte) 6, this.field350);
                this.field350 = -1;
                this.method39((byte) 6, this.field452);
                this.field452 = -1;
                this.method39((byte) 6, this.field357);
                this.field357 = -1;
                this.method39((byte) 6, this.field405);
                this.field405 = -1;
                this.method39((byte) 6, this.field90);
                this.field90 = -1;
                this.method39((byte) 6, this.field195);
                this.field195 = -1;
                this.method39((byte) 6, this.field373);
                this.field373 = -1;
                this.field140 = false;
                this.field533 = 3;
                this.field413 = 0;
                this.field537 = false;
                this.field245 = false;
                this.field375 = null;
                this.field580 = 0;
                this.field263 = -1;
                this.field530 = true;
                this.method100(268);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field96[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field224[var20] = null;
                    this.field225[var20] = false;
                }
                field415 = 0;
                field246 = 0;
                field579 = 0;
                field408 = 0;
                field534 = 0;
                field572 = 0;
                field520 = 0;
                field480 = 0;
                field465 = 0;
                field128 = 0;
                this.method115(358);
            } else if (var8 == 3) {
                this.field334 = "";
                this.field335 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field334 = "Your account has been disabled.";
                this.field335 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field334 = "Your account is already logged in.";
                this.field335 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field334 = "RuneScape has been updated!";
                this.field335 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field334 = "This world is full.";
                this.field335 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field334 = "Unable to connect.";
                this.field335 = "Login server offline.";
            } else if (var8 == 9) {
                this.field334 = "Login limit exceeded.";
                this.field335 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field334 = "Unable to connect.";
                this.field335 = "Bad session id.";
            } else if (var8 == 11) {
                this.field334 = "Login server rejected session.";
                this.field335 = "Please try again.";
            } else if (var8 == 12) {
                this.field334 = "You need a members account to login to this world.";
                this.field335 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field334 = "Could not complete login.";
                this.field335 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field334 = "The server is being updated.";
                this.field335 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field196 = true;
                this.field532.field1539 = 0;
                this.field402.field1539 = 0;
                this.field417 = -1;
                this.field213 = -1;
                this.field214 = -1;
                this.field215 = -1;
                this.field416 = 0;
                this.field418 = 0;
                this.field481 = 0;
                this.field147 = 0;
                this.field537 = false;
                this.field295 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field334 = "Login attempts exceeded.";
                this.field335 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field334 = "You are standing in a members-only area.";
                this.field335 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field334 = "Invalid loginserver requested";
                this.field335 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field334 = "Malformed login packet.";
                    this.field335 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field505 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field505;
                            this.method147(arg0, arg1, arg2);
                        } else {
                            this.field334 = "No response from loginserver";
                            this.field335 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field334 = "No response from server";
                        this.field335 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field334 = "Unexpected server response";
                    this.field335 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field348.method507();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field334 = "You have only just left another world";
                    this.field335 = "Your profile will be transferred in: " + var26;
                    this.method91((byte) 6, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method147(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field334 = "";
            this.field335 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method148(int arg0) {
        this.field194 = null;
        this.field238 = null;
        this.field532 = null;
        this.field83 = null;
        this.field402 = null;
        int var2 = 89 / arg0;
        this.field197 = null;
        this.field198 = null;
        this.field199 = null;
        this.field314 = null;
        this.field315 = null;
        this.field311 = null;
        this.field312 = null;
        this.field313 = null;
        this.field86 = null;
        this.field87 = null;
        this.field88 = null;
        this.field89 = null;
        this.field492 = null;
        this.field493 = null;
        this.field494 = null;
        this.field495 = null;
        this.field496 = null;
        this.field187 = null;
        if (this.field395 != null) {
            this.field395.field650 = false;
        }
        this.field395 = null;
        this.field117 = null;
        this.field119 = null;
        this.field121 = null;
        this.field122 = null;
        this.field162 = null;
        this.field280 = null;
        this.field281 = null;
        this.field282 = null;
        this.field283 = null;
        this.field284 = null;
        try {
            if (this.field348 != null) {
                this.field348.method506();
            }
        } catch (Exception var3) {
        }
        this.field348 = null;
        this.field423 = null;
        this.field320 = null;
        this.field112 = null;
        this.field208 = null;
        this.field142 = null;
        this.field555 = null;
        this.field549 = null;
        this.field228 = null;
        this.field229 = null;
        this.field230 = null;
        this.field186 = null;
        this.field484 = null;
        this.field485 = null;
        this.field486 = null;
        this.field180 = null;
        this.field483 = null;
        this.field411 = null;
        this.field181 = null;
        this.field182 = null;
        this.field460 = null;
        this.field294 = null;
        this.field139 = null;
        this.field382 = null;
        this.field383 = null;
        this.field384 = null;
        this.field385 = null;
        this.field386 = null;
        this.field113 = null;
        this.field488 = null;
        this.field489 = null;
        this.field490 = null;
        this.field491 = null;
        this.field401 = null;
        this.field448 = null;
        this.field330 = null;
        this.field374 = null;
        this.field190 = null;
        this.field156 = null;
        if (this.field517 != null) {
            this.field517.method333();
        }
        this.field517 = null;
        this.field309 = null;
        this.field310 = null;
        this.field556 = null;
        this.field169 = null;
        this.field364 = null;
        this.field365 = null;
        this.field366 = null;
        this.field367 = null;
        this.field209 = null;
        this.field84 = null;
        this.field316 = null;
        this.field317 = null;
        this.field318 = null;
        this.field319 = null;
        this.field345 = null;
        this.field232 = null;
        this.field466 = null;
        this.field467 = null;
        this.method166(2);
        this.field143 = null;
        this.field145 = null;
        this.field464 = null;
        this.field521 = null;
        this.field522 = null;
        this.field523 = null;
        this.field524 = null;
        this.field525 = null;
        this.field545 = null;
        this.field363 = null;
        this.method159(false);
        class39.method331(-29497);
        class68.method582(-29497);
        class4.method29(-29497);
        class51.method437(-29497);
        class63.field1641 = null;
        class21.field805 = null;
        class32.field929 = null;
        class27.field849 = null;
        class13.field688 = null;
        class13.field700 = null;
        class60.field1597 = null;
        super.field1077 = null;
        class20.field792 = null;
        class6.method185(-29497);
        class45.method363(-29497);
        class37.method287(-29497);
        class49.method426(-29497);
        System.gc();
        if (class57.field1577) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method149(boolean arg0) {
        this.method97(this.field473);
        if (this.field166 == 1) {
            this.field156[this.field165 / 100].method596(this.field163 - 8 - 4, 22912, this.field164 - 8 - 4);
        }
        if (this.field166 == 2) {
            this.field156[this.field165 / 100 + 4].method596(this.field163 - 8 - 4, 22912, this.field164 - 8 - 4);
        }
        if (this.field373 != -1) {
            this.method75(this.field355, this.field373, this.field512);
            this.method129(-7410, 0, 0, class51.method435(this.field373), 0);
        }
        if (this.field357 != -1) {
            this.method75(this.field355, this.field357, this.field512);
            this.method129(-7410, 0, 0, class51.method435(this.field357), 0);
        }
        this.method46(413);
        if (arg0) {
            this.field417 = this.field402.method455();
        }
        if (!this.field537) {
            this.method65(false);
            this.method102(this.field475);
        } else if (this.field497 == 0) {
            this.method155(true);
        }
        if (this.field580 == 1) {
            this.field169.method596(472, 22912, 296);
        }
        if (field132) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1072 < 30 && field291) {
                var4 = 16711680;
            }
            if (super.field1072 < 20 && !field291) {
                var4 = 16711680;
            }
            this.field342.method270(var3, var2, "Fps:" + super.field1072, -161, var4);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field291) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field291) {
                int var9 = 16711680;
            }
            this.field342.method270(var13, var2, "Mem:" + var6 + "k", -161, 16776960);
            var13 += 15;
        }
        if (this.field481 != 0) {
            int var10 = this.field481 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field342.method275(16776960, (byte) 118, "System update in: " + var11 + ":0" + var12, 329, 4);
            } else {
                this.field342.method275(16776960, (byte) 118, "System update in: " + var11 + ":" + var12, 329, 4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
    public final boolean method150(int arg0, int arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field366[arg0];
            if (arg1 != 33356) {
                this.field203 = !this.field203;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 138;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
    public final void method151(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field434; ++var4) {
                if (this.field294[var4] == arg0) {
                    --this.field434;
                    this.field307 = true;
                    for (int var5 = var4; var5 < this.field434; ++var5) {
                        this.field460[var5] = this.field460[var5 + 1];
                        this.field139[var5] = this.field139[var5 + 1];
                        this.field294[var5] = this.field294[var5 + 1];
                    }
                    this.field532.method444(this.field134, 176);
                    this.field532.method451(arg0, 0);
                    break;
                }
            }
            if (!arg1) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LRGCGKKUR;ZI)V")
    private final void method152(class53 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            int var4 = arg0.method466(8, true);
            if (var4 < this.field118) {
                for (int var5 = var4; var5 < this.field118; ++var5) {
                    this.field162[this.field161++] = this.field119[var5];
                }
            }
            if (var4 > this.field118) {
                signlink.reporterror(this.field421 + " Too many players");
                throw new RuntimeException("eek");
            } else {
                this.field118 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field119[var6];
                    class20 var8 = this.field117[var7];
                    int var9 = arg0.method466(1, true);
                    if (var9 == 0) {
                        this.field119[this.field118++] = var7;
                        var8.field1410 = field247;
                    } else {
                        int var10 = arg0.method466(2, true);
                        if (var10 == 0) {
                            this.field119[this.field118++] = var7;
                            var8.field1410 = field247;
                            this.field121[this.field120++] = var7;
                        } else if (var10 == 1) {
                            this.field119[this.field118++] = var7;
                            var8.field1410 = field247;
                            int var11 = arg0.method466(3, true);
                            var8.method420(var11, false, this.field339);
                            int var12 = arg0.method466(1, true);
                            if (var12 == 1) {
                                this.field121[this.field120++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field119[this.field118++] = var7;
                            var8.field1410 = field247;
                            int var13 = arg0.method466(3, true);
                            var8.method420(var13, true, this.field339);
                            int var14 = arg0.method466(3, true);
                            var8.method420(var14, true, this.field339);
                            int var15 = arg0.method466(1, true);
                            if (var15 == 1) {
                                this.field121[this.field120++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field162[this.field161++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)Z")
    public final boolean method153(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -41819) {
            throw new NullPointerException();
        } else {
            int var5 = arg1 >> 14 & 32767;
            int var6 = this.field112.method394(this.field372, arg2, arg0, arg1);
            if (var6 == -1) {
                return false;
            } else {
                int var7 = var6 & 31;
                int var8 = var6 >> 6 & 3;
                if (var7 != 10 && var7 != 11 && var7 != 22) {
                    this.method164(584, var8, field219.field1392[0], 0, field219.field1391[0], 0, 0, var7 + 1, false, 2, arg2, arg0);
                } else {
                    class39 var9 = class39.method323(var5);
                    int var10;
                    int var11;
                    if (var8 != 0 && var8 != 2) {
                        var10 = var9.field1135;
                        var11 = var9.field1145;
                    } else {
                        var10 = var9.field1145;
                        var11 = var9.field1135;
                    }
                    int var12 = var9.field1139;
                    if (var8 != 0) {
                        var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                    }
                    this.method164(584, 0, field219.field1392[0], var10, field219.field1391[0], var12, var11, 0, false, 2, arg2, arg0);
                }
                this.field163 = super.field1091;
                this.field164 = super.field1092;
                this.field166 = 2;
                this.field165 = 0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field112.method390(arg1, arg0, arg3);
        if (var7 != 0) {
            int var8 = this.field112.method394(arg1, arg0, arg3, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg2;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field464.field1766;
            int var13 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class39 var15 = class39.method323(var14);
            if (var15.field1134 != -1) {
                class66 var16 = this.field545[var15.field1134];
                if (var16 != null) {
                    int var17 = (var15.field1145 * 4 - var16.field1677) / 2;
                    int var18 = (var15.field1135 * 4 - var16.field1678) / 2;
                    var16.method566(arg0 * 4 + 48 + var17, 22912, (104 - arg3 - var15.field1135) * 4 + 48 + var18);
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
        int var19 = this.field112.method392(arg1, arg0, arg3);
        if (arg4 <= 0) {
            this.method113();
        }
        if (var19 != 0) {
            int var20 = this.field112.method394(arg1, arg0, arg3, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class39 var24 = class39.method323(var23);
            if (var24.field1134 != -1) {
                class66 var25 = this.field545[var24.field1134];
                if (var25 != null) {
                    int var26 = (var24.field1145 * 4 - var25.field1677) / 2;
                    int var27 = (var24.field1135 * 4 - var25.field1678) / 2;
                    var25.method566(arg0 * 4 + 48 + var26, 22912, (104 - arg3 - var24.field1135) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field464.field1766;
                int var30 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
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
        int var31 = this.field112.method393(arg1, arg0, arg3);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class39 var33 = class39.method323(var32);
            if (var33.field1134 != -1) {
                class66 var34 = this.field545[var33.field1134];
                if (var34 != null) {
                    int var35 = (var33.field1145 * 4 - var34.field1677) / 2;
                    int var36 = (var33.field1135 * 4 - var34.field1678) / 2;
                    var34.method566(arg0 * 4 + 48 + var35, 22912, (104 - arg3 - var33.field1135) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method155(boolean arg0) {
        int var2 = this.field498;
        int var3 = this.field499;
        int var4 = this.field500;
        int var5 = this.field501;
        int var6 = 6116423;
        class67.method573((byte) 4, var3, var2, var6, var5, var4);
        class67.method573((byte) 4, var3 + 1, var2 + 1, 0, 16, var4 - 2);
        if (!arg0) {
            this.field133 = -413;
        }
        class67.method574(var5 - 19, var3 + 18, 606, var2 + 1, 0, var4 - 2);
        this.field343.method275(var6, (byte) 118, "Choose Option", var3 + 14, var2 + 3);
        int var7 = super.field1084;
        int var8 = super.field1085;
        if (this.field497 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field497 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field497 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field147; ++var9) {
            int var10 = (this.field147 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field343.method279(this.field209[var9], var2 + 3, var10, true, 0, var11);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    public final void method156(int arg0, byte arg1) {
        int[] var3 = this.field464.field1766;
        if (arg1 == 0) {
            boolean var4 = false;
            int var5 = var3.length;
            for (int var6 = 0; var6 < var5; ++var6) {
                var3[var6] = 0;
            }
            for (int var7 = 1; var7 < 103; ++var7) {
                int var25 = (103 - var7) * 512 * 4 + 24628;
                for (int var26 = 1; var26 < 103; ++var26) {
                    if ((this.field320[arg0][var26][var7] & 24) == 0) {
                        this.field112.method399(var3, var25, 512, arg0, var26, var7);
                    }
                    if (arg0 < 3 && (this.field320[arg0 + 1][var26][var7] & 8) != 0) {
                        this.field112.method399(var3, var25, 512, arg0 + 1, var26, var7);
                    }
                    var25 += 4;
                }
            }
            ++field99;
            if (field99 > 1496) {
                field99 = 0;
                this.field532.method444(this.field134, 26);
                this.field532.method445(0);
                int var8 = this.field532.field1539;
                this.field532.method446((int) (Math.random() * 65536.0D));
                this.field532.method445(189);
                this.field532.method446(45212);
                this.field532.method446((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field532.method445(89);
                }
                this.field532.method445(94);
                this.field532.method445(10);
                this.field532.method446(54243);
                this.field532.method445(88);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field532.method445(32);
                }
                this.field532.method454(0, this.field532.field1539 - var8);
            }
            int var9 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var10 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            this.field464.method591(-5281);
            for (int var11 = 1; var11 < 103; ++var11) {
                for (int var24 = 1; var24 < 103; ++var24) {
                    if ((this.field320[arg0][var24][var11] & 24) == 0) {
                        this.method154(var24, arg0, var9, var11, this.field329, var10);
                    }
                    if (arg0 < 3 && (this.field320[arg0 + 1][var24][var11] & 8) != 0) {
                        this.method154(var24, arg0 + 1, var9, var11, this.field329, var10);
                    }
                }
            }
            if (this.field88 != null) {
                this.field88.method223(-5281);
                class6.field596 = this.field561;
            }
            this.field308 = 0;
            for (int var12 = 0; var12 < 104; ++var12) {
                for (int var13 = 0; var13 < 104; ++var13) {
                    int var14 = this.field112.method393(this.field372, var12, var13);
                    if (var14 != 0) {
                        int var15 = var14 >> 14 & 32767;
                        int var16 = class39.method323(var15).field1138;
                        if (var16 >= 0) {
                            int var17 = var12;
                            int var18 = var13;
                            if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
                                byte var19 = 104;
                                byte var20 = 104;
                                int[][] var21 = this.field208[this.field372].field21;
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
                            this.field556[this.field308] = this.field363[var16];
                            this.field309[this.field308] = var17;
                            this.field310[this.field308] = var18;
                            ++this.field308;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method157(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILXDDMQHDR;II)V")
    public final void method158(int arg0, int arg1, class68 arg2, int arg3, int arg4) {
        this.field416 += arg0;
        if (this.field147 < 400) {
            if (arg2.field1705 != null) {
                arg2 = arg2.method580(0);
            }
            if (arg2 != null) {
                if (arg2.field1706) {
                    String var6 = arg2.field1741;
                    if (arg2.field1725 != 0) {
                        var6 = var6 + method146(32572, field219.field799, arg2.field1725) + " (level-" + arg2.field1725 + ")";
                    }
                    if (this.field149 == 1) {
                        this.field209[this.field147] = "Use " + this.field153 + " with @yel@" + var6;
                        this.field366[this.field147] = 708;
                        this.field367[this.field147] = arg1;
                        this.field364[this.field147] = arg4;
                        this.field365[this.field147] = arg3;
                        ++this.field147;
                    } else {
                        if (this.field567 == 1) {
                            if ((this.field569 & 2) == 2) {
                                this.field209[this.field147] = this.field570 + " @yel@" + var6;
                                this.field366[this.field147] = 834;
                                this.field367[this.field147] = arg1;
                                this.field364[this.field147] = arg4;
                                this.field365[this.field147] = arg3;
                                ++this.field147;
                                return;
                            }
                        } else {
                            if (arg2.field1710 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg2.field1710[var7] != null && !arg2.field1710[var7].equalsIgnoreCase("attack")) {
                                        this.field209[this.field147] = arg2.field1710[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field366[this.field147] = 744;
                                        }
                                        if (var7 == 1) {
                                            this.field366[this.field147] = 354;
                                        }
                                        if (var7 == 2) {
                                            this.field366[this.field147] = 59;
                                        }
                                        if (var7 == 3) {
                                            this.field366[this.field147] = 881;
                                        }
                                        if (var7 == 4) {
                                            this.field366[this.field147] = 144;
                                        }
                                        this.field367[this.field147] = arg1;
                                        this.field364[this.field147] = arg4;
                                        this.field365[this.field147] = arg3;
                                        ++this.field147;
                                    }
                                }
                            }
                            if (arg2.field1710 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field1710[var8] != null && arg2.field1710[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg2.field1725 > field219.field799) {
                                            var9 = 2000;
                                        }
                                        this.field209[this.field147] = arg2.field1710[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field366[this.field147] = var9 + 744;
                                        }
                                        if (var8 == 1) {
                                            this.field366[this.field147] = var9 + 354;
                                        }
                                        if (var8 == 2) {
                                            this.field366[this.field147] = var9 + 59;
                                        }
                                        if (var8 == 3) {
                                            this.field366[this.field147] = var9 + 881;
                                        }
                                        if (var8 == 4) {
                                            this.field366[this.field147] = var9 + 144;
                                        }
                                        this.field367[this.field147] = arg1;
                                        this.field364[this.field147] = arg4;
                                        this.field365[this.field147] = arg3;
                                        ++this.field147;
                                    }
                                }
                            }
                            this.field209[this.field147] = "Examine @yel@" + var6;
                            this.field366[this.field147] = 1219;
                            this.field367[this.field147] = arg1;
                            this.field364[this.field147] = arg4;
                            this.field365[this.field147] = arg3;
                            ++this.field147;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method159(boolean arg0) {
        this.field259 = false;
        while (this.field406) {
            this.field259 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field389 = null;
        this.field390 = null;
        this.field504 = null;
        this.field250 = null;
        this.field251 = null;
        this.field252 = null;
        this.field253 = null;
        this.field154 = null;
        this.field155 = null;
        this.field271 = null;
        this.field272 = null;
        this.field508 = null;
        if (arg0) {
            this.field368 = !this.field368;
        }
        this.field509 = null;
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public static final void method160(int arg0) {
        class45.field1264 = true;
        class6.field585 = true;
        if (arg0 == 0) {
            field291 = true;
            class30.field923 = true;
            class39.field1115 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 357);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field288 = Integer.parseInt(arg0[0]);
                field289 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method160(0);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method139(19662);
                }
                if (arg0[3].equals("free")) {
                    field290 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field290 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method317((byte) 3, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (!this.field92 && !this.field376 && !this.field328) {
            ++field200;
            if (arg0 <= 0) {
                this.field368 = !this.field368;
            }
            if (!this.field196) {
                this.method91((byte) 6, false);
            } else {
                this.method74((byte) 4);
            }
            this.field177 = 0;
        } else {
            this.method106((byte) 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field101 = 0;
        if (arg0 >= 0) {
            this.method113();
        }
        for (int var2 = -1; var2 < this.field144 + this.field118; ++var2) {
            class47 var19;
            if (var2 == -1) {
                var19 = field219;
            } else if (var2 < this.field118) {
                var19 = this.field117[this.field119[var2]];
            } else {
                var19 = this.field143[this.field145[var2 - this.field118]];
            }
            if (var19 != null && var19.method229(true)) {
                if (var19 instanceof class42) {
                    class68 var20 = ((class42) var19).field1206;
                    if (var20.field1705 != null) {
                        var20 = var20.method580(0);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field118) {
                    class68 var23 = ((class42) var19).field1206;
                    if (var23.field1719 >= 0 && var23.field1719 < this.field374.length) {
                        this.method136(0, var19, var19.field1368 + 15);
                        if (this.field178 > -1) {
                            this.field374[var23.field1719].method596(this.field178 - 12, 22912, this.field179 - 30);
                        }
                    }
                    if (this.field393 == 1 && this.field145[var2 - this.field118] == this.field127 && field247 % 20 < 10) {
                        this.method136(0, var19, var19.field1368 + 15);
                        if (this.field178 > -1) {
                            this.field190[0].method596(this.field178 - 12, 22912, this.field179 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class20 var22 = (class20) var19;
                    if (var22.field796 != -1 || var22.field795 != -1) {
                        this.method136(0, var19, var19.field1368 + 15);
                        if (this.field178 > -1) {
                            if (var22.field796 != -1) {
                                this.field330[var22.field796].method596(this.field178 - 12, 22912, this.field179 - var21);
                                var21 += 25;
                            }
                            if (var22.field795 != -1) {
                                this.field374[var22.field795].method596(this.field178 - 12, 22912, this.field179 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field393 == 10 && this.field119[var2] == this.field261) {
                        this.method136(0, var19, var19.field1368 + 15);
                        if (this.field178 > -1) {
                            this.field190[1].method596(this.field178 - 12, 22912, this.field179 - var21);
                        }
                    }
                }
                if (var19.field1367 != null && (var2 >= this.field118 || this.field239 == 0 || this.field239 == 3 || this.field239 == 1 && this.method90(true, ((class20) var19).field785))) {
                    this.method136(0, var19, var19.field1368);
                    if (this.field178 > -1 && this.field101 < this.field102) {
                        this.field106[this.field101] = this.field343.method274(-16, var19.field1367) / 2;
                        this.field105[this.field101] = this.field343.field950;
                        this.field103[this.field101] = this.field178;
                        this.field104[this.field101] = this.field179;
                        this.field107[this.field101] = var19.field1369;
                        this.field108[this.field101] = var19.field1405;
                        this.field109[this.field101] = var19.field1390;
                        this.field110[this.field101++] = var19.field1367;
                        if (this.field440 == 0 && var19.field1405 >= 1 && var19.field1405 <= 3) {
                            this.field105[this.field101] += 10;
                            this.field104[this.field101] += 5;
                        }
                        if (this.field440 == 0 && var19.field1405 == 4) {
                            this.field106[this.field101] = 60;
                        }
                        if (this.field440 == 0 && var19.field1405 == 5) {
                            this.field105[this.field101] += 5;
                        }
                    }
                }
                if (var19.field1355 > field247) {
                    this.method136(0, var19, var19.field1368 + 15);
                    if (this.field178 > -1) {
                        int var24 = var19.field1356 * 30 / var19.field1357;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class67.method573((byte) 4, this.field179 - 3, this.field178 - 15, 65280, 5, var24);
                        class67.method573((byte) 4, this.field179 - 3, this.field178 - 15 + var24, 16711680, 5, 30 - var24);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1374[var25] > field247) {
                        this.method136(0, var19, var19.field1368 / 2);
                        if (this.field178 > -1) {
                            if (var25 == 1) {
                                this.field179 -= 20;
                            }
                            if (var25 == 2) {
                                this.field178 -= 15;
                                this.field179 -= 10;
                            }
                            if (var25 == 3) {
                                this.field178 += 15;
                                this.field179 -= 10;
                            }
                            this.field448[var19.field1373[var25]].method596(this.field178 - 12, 22912, this.field179 - 12);
                            this.field341.method271(this.field178, 41480, 0, String.valueOf(var19.field1372[var25]), this.field179 + 4);
                            this.field341.method271(this.field178 - 1, 41480, 16777215, String.valueOf(var19.field1372[var25]), this.field179 + 3);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field101; ++var3) {
            int var4 = this.field103[var3];
            int var5 = this.field104[var3];
            int var6 = this.field106[var3];
            int var7 = this.field105[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field104[var18] - this.field105[var18] && var5 - var7 < this.field104[var18] + 2 && var4 - var6 < this.field106[var18] + this.field103[var18] && var4 + var6 > this.field103[var18] - this.field106[var18] && this.field104[var18] - this.field105[var18] < var5) {
                        var5 = this.field104[var18] - this.field105[var18];
                        var8 = true;
                    }
                }
            }
            this.field178 = this.field103[var3];
            this.field179 = this.field104[var3] = var5;
            String var9 = this.field110[var3];
            if (this.field440 == 0) {
                int var10 = 16776960;
                if (this.field107[var3] < 6) {
                    var10 = this.field427[this.field107[var3]];
                }
                if (this.field107[var3] == 6) {
                    var10 = this.field444 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field107[var3] == 7) {
                    var10 = this.field444 % 20 < 10 ? 255 : 65535;
                }
                if (this.field107[var3] == 8) {
                    var10 = this.field444 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field107[var3] == 9) {
                    int var11 = 150 - this.field109[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field107[var3] == 10) {
                    int var12 = 150 - this.field109[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field107[var3] == 11) {
                    int var13 = 150 - this.field109[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field108[var3] == 0) {
                    this.field343.method271(this.field178, 41480, 0, var9, this.field179 + 1);
                    this.field343.method271(this.field178, 41480, var10, var9, this.field179);
                }
                if (this.field108[var3] == 1) {
                    this.field343.method276(var9, 0, this.field178, this.field179 + 1, (byte) 1, this.field444);
                    this.field343.method276(var9, var10, this.field178, this.field179, (byte) 1, this.field444);
                }
                if (this.field108[var3] == 2) {
                    this.field343.method277(this.field179 + 1, this.field178, this.field444, this.field431, var9, 0);
                    this.field343.method277(this.field179, this.field178, this.field444, this.field431, var9, var10);
                }
                if (this.field108[var3] == 3) {
                    this.field343.method278((byte) 102, 150 - this.field109[var3], 0, this.field179 + 1, this.field178, this.field444, var9);
                    this.field343.method278((byte) 102, 150 - this.field109[var3], var10, this.field179, this.field178, this.field444, var9);
                }
                if (this.field108[var3] == 4) {
                    int var14 = this.field343.method274(-16, var9);
                    int var15 = (150 - this.field109[var3]) * (var14 + 100) / 150;
                    class67.method570(this.field178 - 50, (byte) -98, 334, this.field178 + 50, 0);
                    this.field343.method275(0, (byte) 118, var9, this.field179 + 1, this.field178 + 50 - var15);
                    this.field343.method275(var10, (byte) 118, var9, this.field179, this.field178 + 50 - var15);
                    class67.method569((byte) 0);
                }
                if (this.field108[var3] == 5) {
                    int var16 = 150 - this.field109[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class67.method570(0, (byte) -98, this.field179 + 5, 512, this.field179 - this.field343.field950 - 1);
                    this.field343.method271(this.field178, 41480, 0, var9, this.field179 + 1 + var17);
                    this.field343.method271(this.field178, 41480, var10, var9, this.field179 + var17);
                    class67.method569((byte) 0);
                }
            } else {
                this.field343.method271(this.field178, 41480, 0, var9, this.field179 + 1);
                this.field343.method271(this.field178, 41480, 16776960, var9, this.field179);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)V")
    public final void method163(byte arg0, String arg1, int arg2, String arg3) {
        if (arg2 == 0 && this.field350 != -1) {
            this.field375 = arg1;
            super.field1090 = 0;
        }
        if (this.field452 == -1) {
            this.field237 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field436[var5] = this.field436[var5 - 1];
            this.field437[var5] = this.field437[var5 - 1];
            this.field438[var5] = this.field438[var5 - 1];
        }
        this.field436[0] = arg2;
        this.field437[0] = arg3;
        if (arg0 == -83) {
            this.field438[0] = arg1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public final boolean method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field345[var15][var36] = 0;
                this.field232[var15][var36] = 99999999;
            }
        }
        int var16 = arg4;
        int var17 = arg2;
        this.field345[arg4][arg2] = 99;
        this.field232[arg4][arg2] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field466[var18] = arg4;
        int var37 = var18 + 1;
        this.field467[var18] = arg2;
        boolean var20 = false;
        int var21 = this.field466.length;
        if (arg0 <= 0) {
            for (int var22 = 1; var22 > 0; ++var22) {
            }
        }
        int[][] var23 = this.field208[this.field372].field21;
        while (var37 != var19) {
            var16 = this.field466[var19];
            var17 = this.field467[var19];
            var19 = (var19 + 1) % var21;
            if (arg10 == var16 && arg11 == var17) {
                var20 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && this.field208[this.field372].method14(arg11, arg1, var17, arg7 - 1, var16, this.field135, arg10)) {
                    var20 = true;
                    break;
                }
                if (arg7 < 10 && this.field208[this.field372].method15(var17, arg11, arg7 - 1, 36084, arg10, var16, arg1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg6 != 0 && this.field208[this.field372].method16(var17, arg6, arg5, arg3, arg11, 119, var16, arg10)) {
                var20 = true;
                break;
            }
            int var35 = this.field232[var16][var17] + 1;
            if (var16 > 0 && this.field345[var16 - 1][var17] == 0 && (var23[var16 - 1][var17] & 19398920) == 0) {
                this.field466[var37] = var16 - 1;
                this.field467[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field345[var16 - 1][var17] = 2;
                this.field232[var16 - 1][var17] = var35;
            }
            if (var16 < var13 - 1 && this.field345[var16 + 1][var17] == 0 && (var23[var16 + 1][var17] & 19399040) == 0) {
                this.field466[var37] = var16 + 1;
                this.field467[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field345[var16 + 1][var17] = 8;
                this.field232[var16 + 1][var17] = var35;
            }
            if (var17 > 0 && this.field345[var16][var17 - 1] == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                this.field466[var37] = var16;
                this.field467[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field345[var16][var17 - 1] = 1;
                this.field232[var16][var17 - 1] = var35;
            }
            if (var17 < var14 - 1 && this.field345[var16][var17 + 1] == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                this.field466[var37] = var16;
                this.field467[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field345[var16][var17 + 1] = 4;
                this.field232[var16][var17 + 1] = var35;
            }
            if (var16 > 0 && var17 > 0 && this.field345[var16 - 1][var17 - 1] == 0 && (var23[var16 - 1][var17 - 1] & 19398926) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                this.field466[var37] = var16 - 1;
                this.field467[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field345[var16 - 1][var17 - 1] = 3;
                this.field232[var16 - 1][var17 - 1] = var35;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field345[var16 + 1][var17 - 1] == 0 && (var23[var16 + 1][var17 - 1] & 19399043) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                this.field466[var37] = var16 + 1;
                this.field467[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field345[var16 + 1][var17 - 1] = 9;
                this.field232[var16 + 1][var17 - 1] = var35;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field345[var16 - 1][var17 + 1] == 0 && (var23[var16 - 1][var17 + 1] & 19398968) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                this.field466[var37] = var16 - 1;
                this.field467[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field345[var16 - 1][var17 + 1] = 6;
                this.field232[var16 - 1][var17 + 1] = var35;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field345[var16 + 1][var17 + 1] == 0 && (var23[var16 + 1][var17 + 1] & 19399136) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                this.field466[var37] = var16 + 1;
                this.field467[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field345[var16 + 1][var17 + 1] = 12;
                this.field232[var16 + 1][var17 + 1] = var35;
            }
        }
        this.field326 = 0;
        if (!var20) {
            if (arg8) {
                int var24 = 100;
                for (int var25 = 1; var25 < 2; ++var25) {
                    for (int var26 = arg10 - var25; var26 <= arg10 + var25; ++var26) {
                        for (int var27 = arg11 - var25; var27 <= arg11 + var25; ++var27) {
                            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field232[var26][var27] < var24) {
                                var24 = this.field232[var26][var27];
                                var16 = var26;
                                var17 = var27;
                                this.field326 = 1;
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
        byte var28 = 0;
        this.field466[var28] = var16;
        int var38 = var28 + 1;
        this.field467[var28] = var17;
        int var29;
        int var30 = var29 = this.field345[var16][var17];
        while (arg4 != var16 || arg2 != var17) {
            if (var29 != var30) {
                var29 = var30;
                this.field466[var38] = var16;
                this.field467[var38++] = var17;
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
            var30 = this.field345[var16][var17];
        }
        if (var38 <= 0) {
            if (arg9 == 1) {
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
            int var32 = this.field466[var38];
            int var33 = this.field467[var38];
            if (arg9 == 0) {
                this.field532.method444(this.field134, 66);
                this.field532.method445(var31 + var31 + 3);
            }
            if (arg9 == 1) {
                this.field532.method444(this.field134, 77);
                this.field532.method445(var31 + var31 + 3 + 14);
            }
            if (arg9 == 2) {
                this.field532.method444(this.field134, 213);
                this.field532.method445(var31 + var31 + 3);
            }
            this.field462 = this.field466[0];
            this.field463 = this.field467[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field532.method445(this.field466[var38] - var32);
                this.field532.method471(this.field467[var38] - var33, -506);
            }
            this.field532.method479(this.field233 + var32, 912);
            this.field532.method478(this.field234 + var33, -48);
            this.field532.method445(super.field1094[5] == 1 ? 1 : 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILQUBPQDMQ;)Z")
    public final boolean method165(int arg0, class51 arg1) {
        if (arg1.field1516 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1516.length; ++var3) {
                int var5 = this.method61(var3, (byte) 60, arg1);
                int var6 = arg1.field1510[var3];
                if (arg1.field1516[var3] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg1.field1516[var3] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg1.field1516[var3] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            int var4 = 46 / arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method166(int arg0) {
        signlink.midiplay = false;
        if (arg0 != 2) {
            this.field510 = this.field551.method236();
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method167(int arg0) {
        if (this.field149 == 0 && this.field567 == 0) {
            this.field209[this.field147] = "Walk here";
            this.field366[this.field147] = 549;
            this.field364[this.field147] = super.field1084;
            this.field365[this.field147] = super.field1085;
            ++this.field147;
        }
        int var2 = -1;
        while (arg0 >= 0) {
            this.method113();
        }
        for (int var3 = 0; var3 < class37.field1056; ++var3) {
            int var4 = class37.field1057[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field112.method394(this.field372, var5, var6, var4) >= 0) {
                    class39 var9 = class39.method323(var8);
                    if (var9.field1107 != null) {
                        var9 = var9.method330(true);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field149 == 1) {
                        this.field209[this.field147] = "Use " + this.field153 + " with @cya@" + var9.field1132;
                        this.field366[this.field147] = 695;
                        this.field367[this.field147] = var4;
                        this.field364[this.field147] = var5;
                        this.field365[this.field147] = var6;
                        ++this.field147;
                    } else if (this.field567 == 1) {
                        if ((this.field569 & 4) == 4) {
                            this.field209[this.field147] = this.field570 + " @cya@" + var9.field1132;
                            this.field366[this.field147] = 183;
                            this.field367[this.field147] = var4;
                            this.field364[this.field147] = var5;
                            this.field365[this.field147] = var6;
                            ++this.field147;
                        }
                    } else {
                        if (var9.field1120 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1120[var10] != null) {
                                    this.field209[this.field147] = var9.field1120[var10] + " @cya@" + var9.field1132;
                                    if (var10 == 0) {
                                        this.field366[this.field147] = 652;
                                    }
                                    if (var10 == 1) {
                                        this.field366[this.field147] = 769;
                                    }
                                    if (var10 == 2) {
                                        this.field366[this.field147] = 288;
                                    }
                                    if (var10 == 3) {
                                        this.field366[this.field147] = 301;
                                    }
                                    if (var10 == 4) {
                                        this.field366[this.field147] = 1103;
                                    }
                                    this.field367[this.field147] = var4;
                                    this.field364[this.field147] = var5;
                                    this.field365[this.field147] = var6;
                                    ++this.field147;
                                }
                            }
                        }
                        this.field209[this.field147] = "Examine @cya@" + var9.field1132;
                        this.field366[this.field147] = 1415;
                        this.field367[this.field147] = var9.field1105 << 14;
                        this.field364[this.field147] = var5;
                        this.field365[this.field147] = var6;
                        ++this.field147;
                    }
                }
                if (var7 == 1) {
                    class42 var11 = this.field143[var8];
                    if (var11.field1206.field1740 == 1 && (var11.field1383 & 127) == 64 && (var11.field1384 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field144; ++var12) {
                            class42 var15 = this.field143[this.field145[var12]];
                            if (var15 != null && var11 != var15 && var15.field1206.field1740 == 1 && var11.field1383 == var15.field1383 && var11.field1384 == var15.field1384) {
                                this.method158(0, this.field145[var12], var15.field1206, var6, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field118; ++var13) {
                            class20 var14 = this.field117[this.field119[var13]];
                            if (var14 != null && var11.field1383 == var14.field1383 && var11.field1384 == var14.field1384) {
                                this.method182(var5, var6, this.field119[var13], -810, var14);
                            }
                        }
                    }
                    this.method158(0, var8, var11.field1206, var6, var5);
                }
                if (var7 == 0) {
                    class20 var16 = this.field117[var8];
                    if ((var16.field1383 & 127) == 64 && (var16.field1384 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field144; ++var17) {
                            class42 var20 = this.field143[this.field145[var17]];
                            if (var20 != null && var20.field1206.field1740 == 1 && var16.field1383 == var20.field1383 && var16.field1384 == var20.field1384) {
                                this.method158(0, this.field145[var17], var20.field1206, var6, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field118; ++var18) {
                            class20 var19 = this.field117[this.field119[var18]];
                            if (var19 != null && var16 != var19 && var16.field1383 == var19.field1383 && var16.field1384 == var19.field1384) {
                                this.method182(var5, var6, this.field119[var18], -810, var19);
                            }
                        }
                    }
                    this.method182(var5, var6, var8, -810, var16);
                }
                if (var7 == 3) {
                    class5 var21 = this.field194[this.field372][var5][var6];
                    if (var21 != null) {
                        for (class22 var22 = (class22) var21.method34(36418); var22 != null; var22 = (class22) var21.method36(0)) {
                            class4 var23 = class4.method22(var22.field814);
                            if (this.field149 == 1) {
                                this.field209[this.field147] = "Use " + this.field153 + " with @lre@" + var23.field67;
                                this.field366[this.field147] = 163;
                                this.field367[this.field147] = var22.field814;
                                this.field364[this.field147] = var5;
                                this.field365[this.field147] = var6;
                                ++this.field147;
                            } else if (this.field567 == 1) {
                                if ((this.field569 & 1) == 1) {
                                    this.field209[this.field147] = this.field570 + " @lre@" + var23.field67;
                                    this.field366[this.field147] = 550;
                                    this.field367[this.field147] = var22.field814;
                                    this.field364[this.field147] = var5;
                                    this.field365[this.field147] = var6;
                                    ++this.field147;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field45 != null && var23.field45[var24] != null) {
                                        this.field209[this.field147] = var23.field45[var24] + " @lre@" + var23.field67;
                                        if (var24 == 0) {
                                            this.field366[this.field147] = 740;
                                        }
                                        if (var24 == 1) {
                                            this.field366[this.field147] = 126;
                                        }
                                        if (var24 == 2) {
                                            this.field366[this.field147] = 669;
                                        }
                                        if (var24 == 3) {
                                            this.field366[this.field147] = 922;
                                        }
                                        if (var24 == 4) {
                                            this.field366[this.field147] = 78;
                                        }
                                        this.field367[this.field147] = var22.field814;
                                        this.field364[this.field147] = var5;
                                        this.field365[this.field147] = var6;
                                        ++this.field147;
                                    } else if (var24 == 2) {
                                        this.field209[this.field147] = "Take @lre@" + var23.field67;
                                        this.field366[this.field147] = 669;
                                        this.field367[this.field147] = var22.field814;
                                        this.field364[this.field147] = var5;
                                        this.field365[this.field147] = var6;
                                        ++this.field147;
                                    }
                                }
                                this.field209[this.field147] = "Examine @lre@" + var23.field67;
                                this.field366[this.field147] = 1977;
                                this.field367[this.field147] = var22.field814;
                                this.field364[this.field147] = var5;
                                this.field365[this.field147] = var6;
                                ++this.field147;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
    public final void method168(int arg0) {
        if (arg0 != 3) {
            this.field194 = null;
        }
        if (this.field576 == 0) {
            int var2 = super.field1090;
            if (this.field567 == 1 && super.field1091 >= 516 && super.field1092 >= 160 && super.field1091 <= 765 && super.field1092 <= 205) {
                var2 = 0;
            }
            if (this.field537) {
                if (var2 != 1) {
                    int var3 = super.field1084;
                    int var4 = super.field1085;
                    if (this.field497 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field497 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field497 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field498 - 10 || var3 > this.field500 + this.field498 + 10 || var4 < this.field499 - 10 || var4 > this.field501 + this.field499 + 10) {
                        this.field537 = false;
                        if (this.field497 == 1) {
                            this.field307 = true;
                        }
                        if (this.field497 == 2) {
                            this.field237 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field498;
                    int var6 = this.field499;
                    int var7 = this.field500;
                    int var8 = super.field1091;
                    int var9 = super.field1092;
                    if (this.field497 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field497 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field497 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field147; ++var11) {
                        int var12 = (this.field147 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method140(var10, this.field129);
                    }
                    this.field537 = false;
                    if (this.field497 == 1) {
                        this.field307 = true;
                    }
                    if (this.field497 == 2) {
                        this.field237 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field147 > 0) {
                    int var13 = this.field366[this.field147 - 1];
                    if (var13 == 551 || var13 == 688 || var13 == 125 || var13 == 459 || var13 == 6 || var13 == 616 || var13 == 330 || var13 == 840 || var13 == 773 || var13 == 813 || var13 == 960 || var13 == 1985) {
                        int var14 = this.field364[this.field147 - 1];
                        int var15 = this.field365[this.field147 - 1];
                        class51 var16 = class51.method435(var15);
                        if (var16.field1445 || var16.field1488) {
                            this.field266 = false;
                            this.field212 = 0;
                            this.field574 = var15;
                            this.field575 = var14;
                            this.field576 = 2;
                            this.field577 = super.field1091;
                            this.field578 = super.field1092;
                            if (class51.method435(var15).field1471 == this.field357) {
                                this.field576 = 1;
                            }
                            if (class51.method435(var15).field1471 == this.field452) {
                                this.field576 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field323 == 1 || this.method150(this.field147 - 1, 33356)) && this.field147 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field147 > 0) {
                    this.method140(this.field147 - 1, this.field129);
                }
                if (var2 != 2 || this.field147 <= 0) {
                    return;
                }
                this.method42(-712);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIILQUBPQDMQ;)V")
    public final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class51 arg7) {
        this.field416 += arg1;
        if (arg7.field1503 == 0 && arg7.field1515 != null && !arg7.field1478) {
            if (arg6 >= arg2 && arg0 >= arg4 && arg6 <= arg7.field1460 + arg2 && arg0 <= arg7.field1475 + arg4) {
                int var9 = arg7.field1515.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg7.field1447[var10] + arg2;
                    int var12 = arg7.field1512[var10] + arg4 - arg3;
                    class51 var13 = class51.method435(arg7.field1515[var10]);
                    int var14 = var13.field1496 + var11;
                    int var15 = var13.field1451 + var12;
                    if ((var13.field1479 >= 0 || var13.field1470 != 0) && arg6 >= var14 && arg0 >= var15 && arg6 < var13.field1460 + var14 && arg0 < var13.field1475 + var15) {
                        if (var13.field1479 >= 0) {
                            this.field428 = var13.field1479;
                        } else {
                            this.field428 = var13.field1485;
                        }
                    }
                    if (var13.field1503 == 8 && arg6 >= var14 && arg0 >= var15 && arg6 < var13.field1460 + var14 && arg0 < var13.field1475 + var15) {
                        this.field231 = var13.field1485;
                    }
                    if (var13.field1503 == 0) {
                        this.method169(arg0, 0, var14, var13.field1474, var15, arg5, arg6, var13);
                        if (var13.field1472 > var13.field1475) {
                            this.method50(-333, var13.field1475, arg6, var13.field1472, var13.field1460 + var14, var13, arg0, var15, arg5);
                        }
                    } else {
                        if (var13.field1486 == 1 && arg6 >= var14 && arg0 >= var15 && arg6 < var13.field1460 + var14 && arg0 < var13.field1475 + var15) {
                            boolean var16 = false;
                            if (var13.field1497 != 0) {
                                var16 = this.method184(var13, true);
                            }
                            if (!var16) {
                                this.field209[this.field147] = var13.field1499;
                                this.field366[this.field147] = 891;
                                this.field365[this.field147] = var13.field1485;
                                ++this.field147;
                            }
                        }
                        if (var13.field1486 == 2 && this.field567 == 0 && arg6 >= var14 && arg0 >= var15 && arg6 < var13.field1460 + var14 && arg0 < var13.field1475 + var15) {
                            String var17 = var13.field1476;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field209[this.field147] = var17 + " @gre@" + var13.field1456;
                            this.field366[this.field147] = 598;
                            this.field365[this.field147] = var13.field1485;
                            ++this.field147;
                        }
                        if (var13.field1486 == 3 && arg6 >= var14 && arg0 >= var15 && arg6 < var13.field1460 + var14 && arg0 < var13.field1475 + var15) {
                            this.field209[this.field147] = "Close";
                            if (arg5 == 3) {
                                this.field366[this.field147] = 559;
                            } else {
                                this.field366[this.field147] = 579;
                            }
                            this.field365[this.field147] = var13.field1485;
                            ++this.field147;
                        }
                        if (var13.field1486 == 4 && arg6 >= var14 && arg0 >= var15 && arg6 < var13.field1460 + var14 && arg0 < var13.field1475 + var15) {
                            this.field209[this.field147] = var13.field1499;
                            this.field366[this.field147] = 682;
                            this.field365[this.field147] = var13.field1485;
                            ++this.field147;
                        }
                        if (var13.field1486 == 5 && arg6 >= var14 && arg0 >= var15 && arg6 < var13.field1460 + var14 && arg0 < var13.field1475 + var15) {
                            this.field209[this.field147] = var13.field1499;
                            this.field366[this.field147] = 548;
                            this.field365[this.field147] = var13.field1485;
                            ++this.field147;
                        }
                        if (var13.field1486 == 6 && !this.field140 && arg6 >= var14 && arg0 >= var15 && arg6 < var13.field1460 + var14 && arg0 < var13.field1475 + var15) {
                            this.field209[this.field147] = var13.field1499;
                            this.field366[this.field147] = 322;
                            this.field365[this.field147] = var13.field1485;
                            ++this.field147;
                        }
                        if (var13.field1503 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1475; ++var19) {
                                for (int var20 = 0; var20 < var13.field1460; ++var20) {
                                    int var21 = (var13.field1480 + 32) * var20 + var14;
                                    int var22 = (var13.field1492 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1448[var18];
                                        var22 += var13.field1442[var18];
                                    }
                                    if (arg6 >= var21 && arg0 >= var22 && arg6 < var21 + 32 && arg0 < var22 + 32) {
                                        this.field257 = var18;
                                        this.field258 = var13.field1485;
                                        if (var13.field1477[var18] > 0) {
                                            class4 var23 = class4.method22(var13.field1477[var18] - 1);
                                            if (this.field149 == 1 && var13.field1504) {
                                                if (this.field151 != var13.field1485 || this.field150 != var18) {
                                                    this.field209[this.field147] = "Use " + this.field153 + " with @lre@" + var23.field67;
                                                    this.field366[this.field147] = 612;
                                                    this.field367[this.field147] = var23.field51;
                                                    this.field364[this.field147] = var18;
                                                    this.field365[this.field147] = var13.field1485;
                                                    ++this.field147;
                                                }
                                            } else if (this.field567 == 1 && var13.field1504) {
                                                if ((this.field569 & 16) == 16) {
                                                    this.field209[this.field147] = this.field570 + " @lre@" + var23.field67;
                                                    this.field366[this.field147] = 261;
                                                    this.field367[this.field147] = var23.field51;
                                                    this.field364[this.field147] = var18;
                                                    this.field365[this.field147] = var13.field1485;
                                                    ++this.field147;
                                                }
                                            } else {
                                                if (var13.field1504) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field46 != null && var23.field46[var24] != null) {
                                                            this.field209[this.field147] = var23.field46[var24] + " @lre@" + var23.field67;
                                                            if (var24 == 3) {
                                                                this.field366[this.field147] = 773;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field366[this.field147] = 813;
                                                            }
                                                            this.field367[this.field147] = var23.field51;
                                                            this.field364[this.field147] = var18;
                                                            this.field365[this.field147] = var13.field1485;
                                                            ++this.field147;
                                                        } else if (var24 == 4) {
                                                            this.field209[this.field147] = "Drop @lre@" + var23.field67;
                                                            this.field366[this.field147] = 813;
                                                            this.field367[this.field147] = var23.field51;
                                                            this.field364[this.field147] = var18;
                                                            this.field365[this.field147] = var13.field1485;
                                                            ++this.field147;
                                                        }
                                                    }
                                                }
                                                if (var13.field1446) {
                                                    this.field209[this.field147] = "Use @lre@" + var23.field67;
                                                    this.field366[this.field147] = 960;
                                                    this.field367[this.field147] = var23.field51;
                                                    this.field364[this.field147] = var18;
                                                    this.field365[this.field147] = var13.field1485;
                                                    ++this.field147;
                                                }
                                                if (var13.field1504 && var23.field46 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field46[var25] != null) {
                                                            this.field209[this.field147] = var23.field46[var25] + " @lre@" + var23.field67;
                                                            if (var25 == 0) {
                                                                this.field366[this.field147] = 616;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field366[this.field147] = 330;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field366[this.field147] = 840;
                                                            }
                                                            this.field367[this.field147] = var23.field51;
                                                            this.field364[this.field147] = var18;
                                                            this.field365[this.field147] = var13.field1485;
                                                            ++this.field147;
                                                        }
                                                    }
                                                }
                                                if (var13.field1495 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1495[var26] != null) {
                                                            this.field209[this.field147] = var13.field1495[var26] + " @lre@" + var23.field67;
                                                            if (var26 == 0) {
                                                                this.field366[this.field147] = 551;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field366[this.field147] = 688;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field366[this.field147] = 125;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field366[this.field147] = 459;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field366[this.field147] = 6;
                                                            }
                                                            this.field367[this.field147] = var23.field51;
                                                            this.field364[this.field147] = var18;
                                                            this.field365[this.field147] = var13.field1485;
                                                            ++this.field147;
                                                        }
                                                    }
                                                }
                                                this.field209[this.field147] = "Examine @lre@" + var23.field67;
                                                this.field366[this.field147] = 1985;
                                                this.field367[this.field147] = var23.field51;
                                                this.field364[this.field147] = var18;
                                                this.field365[this.field147] = var13.field1485;
                                                ++this.field147;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILZSWNSCUQ;)V")
    public final void method170(int arg0, int arg1, int arg2, class72 arg3) {
        int var5 = this.field478 + this.field172 & 2047;
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = class37.field1058[var5];
            int var8 = class37.field1059[var5];
            int var9 = var7 * 256 / (this.field125 + 256);
            int var10 = var8 * 256 / (this.field125 + 256);
            if (arg0 == 46599) {
                int var11 = arg1 * var9 + arg2 * var10 >> 16;
                int var12 = arg1 * var10 - arg2 * var9 >> 16;
                if (var6 > 2500) {
                    arg3.method602(22290, this.field198, var11 + 94 - arg3.field1771 / 2 + 4, 83 - var12 - arg3.field1772 / 2 - 4);
                } else {
                    arg3.method596(var11 + 94 - arg3.field1771 / 2 + 4, 22912, 83 - var12 - arg3.field1772 / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
    public final void method171(int arg0) {
        if (arg0 < 0) {
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method321(this.field426);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field357 != -1 && this.field94 == this.field357) {
                            if (var2 == 8 && this.field256.length() > 0) {
                                this.field256 = this.field256.substring(0, this.field256.length() - 1);
                            }
                            break;
                        }
                        if (this.field245) {
                            if (var2 >= 32 && var2 <= 122 && this.field267.length() < 80) {
                                this.field267 = this.field267 + (char) var2;
                                this.field237 = true;
                            }
                            if (var2 == 8 && this.field267.length() > 0) {
                                this.field267 = this.field267.substring(0, this.field267.length() - 1);
                                this.field237 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field245 = false;
                                this.field237 = true;
                                if (this.field424 == 1) {
                                    long var3 = class55.method497(this.field267);
                                    this.method134(842, var3);
                                }
                                if (this.field424 == 2 && this.field434 > 0) {
                                    long var5 = class55.method497(this.field267);
                                    this.method151(var5, false);
                                }
                                if (this.field424 == 3 && this.field267.length() > 0) {
                                    this.field532.method444(this.field134, 56);
                                    this.field532.method445(0);
                                    int var7 = this.field532.field1539;
                                    this.field532.method451(this.field85, 0);
                                    class71.method589(this.field532, 8378, this.field267);
                                    this.field532.method454(0, this.field532.field1539 - var7);
                                    this.field267 = class71.method590(this.field267, true);
                                    this.field267 = class62.method524(this.field267, true);
                                    this.method163((byte) -83, this.field267, 6, class55.method501(class55.method498(-39, this.field85), false));
                                    if (this.field347 == 2) {
                                        this.field347 = 1;
                                        this.field131 = true;
                                        this.field532.method444(this.field134, 50);
                                        this.field532.method445(this.field239);
                                        this.field532.method445(this.field347);
                                        this.field532.method445(this.field439);
                                    }
                                }
                                if (this.field424 == 4 && this.field412 < 100) {
                                    long var8 = class55.method497(this.field267);
                                    this.method176(0, var8);
                                }
                                if (this.field424 == 5 && this.field412 > 0) {
                                    long var10 = class55.method497(this.field267);
                                    this.method117(var10, this.field397);
                                }
                            }
                        } else if (this.field413 == 1) {
                            if (var2 >= 48 && var2 <= 57 && this.field202.length() < 10) {
                                this.field202 = this.field202 + (char) var2;
                                this.field237 = true;
                            }
                            if (var2 == 8 && this.field202.length() > 0) {
                                this.field202 = this.field202.substring(0, this.field202.length() - 1);
                                this.field237 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field202.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field202);
                                    } catch (Exception var22) {
                                    }
                                    this.field532.method444(this.field134, 175);
                                    this.field532.method449(var12);
                                }
                                this.field413 = 0;
                                this.field237 = true;
                            }
                        } else if (this.field413 == 2) {
                            if (var2 >= 32 && var2 <= 122 && this.field202.length() < 12) {
                                this.field202 = this.field202 + (char) var2;
                                this.field237 = true;
                            }
                            if (var2 == 8 && this.field202.length() > 0) {
                                this.field202 = this.field202.substring(0, this.field202.length() - 1);
                                this.field237 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field202.length() > 0) {
                                    this.field532.method444(this.field134, 147);
                                    this.field532.method451(class55.method497(this.field202), 0);
                                }
                                this.field413 = 0;
                                this.field237 = true;
                            }
                        } else if (this.field413 == 3) {
                            if (var2 >= 32 && var2 <= 122 && this.field202.length() < 40) {
                                this.field202 = this.field202 + (char) var2;
                                this.field237 = true;
                            }
                            if (var2 == 8 && this.field202.length() > 0) {
                                this.field202 = this.field202.substring(0, this.field202.length() - 1);
                                this.field237 = true;
                            }
                        } else if (this.field452 == -1 && this.field405 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field369.length() < 80) {
                                this.field369 = this.field369 + (char) var2;
                                this.field237 = true;
                            }
                            if (var2 == 8 && this.field369.length() > 0) {
                                this.field369 = this.field369.substring(0, this.field369.length() - 1);
                                this.field237 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field369.length() > 0) {
                                if (this.field399 == 2) {
                                    if (this.field369.equals("::clientdrop")) {
                                        this.method57(31790);
                                    }
                                    if (this.field369.equals("::lag")) {
                                        this.method127(-26728);
                                    }
                                    if (this.field369.equals("::prefetchmusic")) {
                                        for (int var13 = 0; var13 < this.field517.method348(2, false); ++var13) {
                                            this.field517.method345(2, (byte) 1, var13, 462);
                                        }
                                    }
                                    if (this.field369.equals("::fpson")) {
                                        field132 = true;
                                    }
                                    if (this.field369.equals("::fpsoff")) {
                                        field132 = false;
                                    }
                                    if (this.field369.equals("::noclip")) {
                                        for (int var14 = 0; var14 < 4; ++var14) {
                                            for (int var15 = 1; var15 < 103; ++var15) {
                                                for (int var16 = 1; var16 < 103; ++var16) {
                                                    this.field208[var14].field21[var15][var16] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (this.field369.startsWith("::")) {
                                    this.field532.method444(this.field134, 225);
                                    this.field532.method445(this.field369.length() - 1);
                                    this.field532.method452(this.field369.substring(2));
                                } else {
                                    String var17 = this.field369.toLowerCase();
                                    byte var18 = 0;
                                    if (var17.startsWith("yellow:")) {
                                        var18 = 0;
                                        this.field369 = this.field369.substring(7);
                                    } else if (var17.startsWith("red:")) {
                                        var18 = 1;
                                        this.field369 = this.field369.substring(4);
                                    } else if (var17.startsWith("green:")) {
                                        var18 = 2;
                                        this.field369 = this.field369.substring(6);
                                    } else if (var17.startsWith("cyan:")) {
                                        var18 = 3;
                                        this.field369 = this.field369.substring(5);
                                    } else if (var17.startsWith("purple:")) {
                                        var18 = 4;
                                        this.field369 = this.field369.substring(7);
                                    } else if (var17.startsWith("white:")) {
                                        var18 = 5;
                                        this.field369 = this.field369.substring(6);
                                    } else if (var17.startsWith("flash1:")) {
                                        var18 = 6;
                                        this.field369 = this.field369.substring(7);
                                    } else if (var17.startsWith("flash2:")) {
                                        var18 = 7;
                                        this.field369 = this.field369.substring(7);
                                    } else if (var17.startsWith("flash3:")) {
                                        var18 = 8;
                                        this.field369 = this.field369.substring(7);
                                    } else if (var17.startsWith("glow1:")) {
                                        var18 = 9;
                                        this.field369 = this.field369.substring(6);
                                    } else if (var17.startsWith("glow2:")) {
                                        var18 = 10;
                                        this.field369 = this.field369.substring(6);
                                    } else if (var17.startsWith("glow3:")) {
                                        var18 = 11;
                                        this.field369 = this.field369.substring(6);
                                    }
                                    String var19 = this.field369.toLowerCase();
                                    byte var20 = 0;
                                    if (var19.startsWith("wave:")) {
                                        var20 = 1;
                                        this.field369 = this.field369.substring(5);
                                    } else if (var19.startsWith("wave2:")) {
                                        var20 = 2;
                                        this.field369 = this.field369.substring(6);
                                    } else if (var19.startsWith("shake:")) {
                                        var20 = 3;
                                        this.field369 = this.field369.substring(6);
                                    } else if (var19.startsWith("scroll:")) {
                                        var20 = 4;
                                        this.field369 = this.field369.substring(7);
                                    } else if (var19.startsWith("slide:")) {
                                        var20 = 5;
                                        this.field369 = this.field369.substring(6);
                                    }
                                    this.field532.method444(this.field134, 91);
                                    this.field532.method445(0);
                                    int var21 = this.field532.field1539;
                                    this.field532.method471(var20, -506);
                                    this.field142.field1539 = 0;
                                    class71.method589(this.field142, 8378, this.field369);
                                    this.field532.method491(false, this.field142.field1538, this.field142.field1539, 0);
                                    this.field532.method472(false, var18);
                                    this.field532.method454(0, this.field532.field1539 - var21);
                                    this.field369 = class71.method590(this.field369, true);
                                    this.field369 = class62.method524(this.field369, true);
                                    field219.field1367 = this.field369;
                                    field219.field1369 = var18;
                                    field219.field1405 = var20;
                                    field219.field1390 = 150;
                                    if (this.field399 == 2) {
                                        this.method163((byte) -83, field219.field1367, 2, "@cr2@" + field219.field785);
                                    } else if (this.field399 == 1) {
                                        this.method163((byte) -83, field219.field1367, 2, "@cr1@" + field219.field785);
                                    } else {
                                        this.method163((byte) -83, field219.field1367, 2, field219.field785);
                                    }
                                    if (this.field239 == 2) {
                                        this.field239 = 3;
                                        this.field131 = true;
                                        this.field532.method444(this.field134, 50);
                                        this.field532.method445(this.field239);
                                        this.field532.method445(this.field347);
                                        this.field532.method445(this.field439);
                                    }
                                }
                                this.field369 = "";
                                this.field237 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field256.length() < 12) {
                    this.field256 = this.field256 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 0) {
            int var8 = 2048 - arg4 & 2047;
            int var9 = 2048 - arg2 & 2047;
            int var10 = 0;
            int var11 = 0;
            int var12 = arg6;
            if (var8 != 0) {
                int var13 = class37.field1058[var8];
                int var14 = class37.field1059[var8];
                int var15 = var11 * var14 - arg6 * var13 >> 16;
                var12 = var11 * var13 + arg6 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = class37.field1058[var9];
                int var17 = class37.field1059[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field453 = arg3 - var10;
            this.field454 = arg0 - var11;
            this.field455 = arg5 - var12;
            this.field456 = arg4;
            this.field457 = arg2;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
    public final void method173(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 1) {
            this.field134 = !this.field134;
        }
        class51 var3 = class51.method435(arg0);
        for (int var4 = 0; var4 < var3.field1515.length && var3.field1515[var4] != -1; ++var4) {
            class51 var5 = class51.method435(var3.field1515[var4]);
            if (var5.field1503 == 1) {
                this.method173(var5.field1485, 1);
            }
            var5.field1514 = 0;
            var5.field1452 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public final void method174(String arg0, int arg1, int arg2) {
        this.field270 = arg2;
        this.field445 = arg0;
        this.method109(-453);
        if (this.field321 == null) {
            super.method174(arg0, 27936, arg2);
        } else {
            this.field313.method223(-5281);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field343.method271(var4 / 2, 41480, 16777215, "RuneScape is loading - please wait...", var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            class67.method574(34, var7, 606, var4 / 2 - 152, 9179409, 304);
            class67.method574(32, var7 + 1, 606, var4 / 2 - 151, 0, 302);
            class67.method573((byte) 4, var7 + 2, var4 / 2 - 150, 9179409, 30, arg2 * 3);
            if (arg1 != 27936) {
                this.field194 = null;
            }
            class67.method573((byte) 4, var7 + 2, arg2 * 3 + (var4 / 2 - 150), 0, 30, 300 - arg2 * 3);
            this.field343.method271(var4 / 2, 41480, 16777215, arg0, var5 / 2 + 5 - var6);
            this.field313.method224(super.field1076, 966, 171, 202);
            if (this.field392) {
                this.field392 = false;
                if (!this.field259) {
                    this.field314.method224(super.field1076, 966, 0, 0);
                    this.field315.method224(super.field1076, 966, 0, 637);
                }
                this.field311.method224(super.field1076, 966, 0, 128);
                this.field312.method224(super.field1076, 966, 371, 202);
                this.field316.method224(super.field1076, 966, 265, 0);
                this.field317.method224(super.field1076, 966, 265, 562);
                this.field318.method224(super.field1076, 966, 171, 128);
                this.field319.method224(super.field1076, 966, 171, 562);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(II)Ljava/lang/String;")
    public final String method175(int arg0, int arg1) {
        if (arg1 < 7 || arg1 > 7) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
    public final void method176(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field412 >= 100) {
                this.method163((byte) -83, "Your ignore list is full. Max of 100 hit", 0, "");
            } else {
                String var4 = class55.method501(class55.method498(-39, arg1), false);
                for (int var5 = 0; var5 < this.field412; ++var5) {
                    if (this.field123[var5] == arg1) {
                        this.method163((byte) -83, var4 + " is already on your ignore list", 0, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field434; ++var6) {
                    if (this.field294[var6] == arg1) {
                        this.method163((byte) -83, "Please remove " + var4 + " from your friend list first", 0, "");
                        return;
                    }
                }
                if (arg0 == 0) {
                    this.field123[this.field412++] = arg1;
                    this.field307 = true;
                    this.field532.method444(this.field134, 195);
                    this.field532.method451(arg1, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
    public final void method177(boolean arg0, int arg1) {
        if (field219.field1383 >> 7 == this.field462 && field219.field1384 >> 7 == this.field463) {
            this.field462 = 0;
        }
        int var3 = this.field118;
        if (arg1 != 0) {
            this.field532.method445(151);
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class20 var5;
            int var6;
            if (arg0) {
                var5 = field219;
                var6 = this.field116 << 14;
            } else {
                var5 = this.field117[this.field119[var4]];
                var6 = this.field119[var4] << 14;
            }
            if (var5 != null && var5.method229(true)) {
                var5.field788 = false;
                if ((field291 && this.field118 > 50 || this.field118 > 200) && !arg0 && var5.field1402 == var5.field1386) {
                    var5.field788 = true;
                }
                int var7 = var5.field1383 >> 7;
                int var8 = var5.field1384 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field774 != null && field247 >= var5.field769 && field247 < var5.field770) {
                        var5.field788 = false;
                        var5.field793 = this.method45(var5.field1383, var5.field1384, this.field372, 43591);
                        this.field112.method376(var5.field783, var5, var5.field780, this.field372, var5.field1384, var5.field1385, 60, var6, var5.field782, var5.field781, var5.field793, var5.field1383, -16624);
                    } else {
                        if ((var5.field1383 & 127) == 64 && (var5.field1384 & 127) == 64) {
                            if (this.field186[var7][var8] == this.field444) {
                                continue;
                            }
                            this.field186[var7][var8] = this.field444;
                        }
                        var5.field793 = this.method45(var5.field1383, var5.field1384, this.field372, 43591);
                        this.field112.method375(var5.field1384, var5.field793, var6, var5.field1385, this.field372, var5.field1354, var5.field1383, false, var5, 60);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
    public final void method178(int arg0) {
        int var2 = 5;
        this.field553[8] = 0;
        int var3 = 0;
        if (arg0 != -31374) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        while (this.field553[8] == 0) {
            String var5 = "Unknown problem";
            this.method174("Connecting to web server", 27936, 20);
            try {
                DataInputStream var6 = this.method81("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 357);
                class53 var7 = new class53(new byte[40], (byte) -17);
                var6.readFully(var7.field1538, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field553[var8] = var7.method460();
                }
                int var9 = var7.method460();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field553[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field553[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field553[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field553[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field553[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field553[8] == 0) {
                ++var3;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var3 >= 10) {
                        this.method174("Game updated - please reload page", 27936, 10);
                        var12 = 10;
                    } else {
                        this.method174(var5 + " - Will retry in " + var12 + " secs.", 27936, 10);
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
                this.field349 = !this.field349;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(II)V")
    public final void method179(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field532.method445(239);
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method180(int arg0) {
        if (!this.field92 && !this.field376 && !this.field328) {
            ++field247;
            while (arg0 >= 0) {
                field519 = -65;
            }
            if (!this.field196) {
                this.method114(false);
            } else {
                this.method141(-43);
            }
            this.method52((byte) 3);
        }
    }

    @OriginalMember(owner = "client!client", name = "S", descriptor = "(I)V")
    public final void method181(int arg0) {
        this.field86.method223(-5281);
        class6.field596 = this.field560;
        if (arg0 != 42590) {
            field519 = -140;
        }
        this.field197.method566(0, 22912, 0);
        if (this.field195 != -1) {
            this.method129(-7410, 0, 0, class51.method435(this.field195), 0);
        } else if (this.field571[this.field533] != -1) {
            this.method129(-7410, 0, 0, class51.method435(this.field571[this.field533]), 0);
        }
        if (this.field537 && this.field497 == 1) {
            this.method155(true);
        }
        this.field86.method224(super.field1076, 966, 205, 553);
        this.field88.method223(-5281);
        class6.field596 = this.field561;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILIGCQCHAY;)V")
    public final void method182(int arg0, int arg1, int arg2, int arg3, class20 arg4) {
        if (field219 != arg4) {
            if (this.field147 < 400) {
                while (arg3 >= 0) {
                    this.field133 = 79;
                }
                String var6;
                if (arg4.field790 == 0) {
                    var6 = arg4.field785 + method146(32572, field219.field799, arg4.field799) + " (level-" + arg4.field799 + ")";
                } else {
                    var6 = arg4.field785 + " (skill-" + arg4.field790 + ")";
                }
                if (this.field149 == 1) {
                    this.field209[this.field147] = "Use " + this.field153 + " with @whi@" + var6;
                    this.field366[this.field147] = 405;
                    this.field367[this.field147] = arg2;
                    this.field364[this.field147] = arg0;
                    this.field365[this.field147] = arg1;
                    ++this.field147;
                } else if (this.field567 == 1) {
                    if ((this.field569 & 8) == 8) {
                        this.field209[this.field147] = this.field570 + " @whi@" + var6;
                        this.field366[this.field147] = 822;
                        this.field367[this.field147] = arg2;
                        this.field364[this.field147] = arg0;
                        this.field365[this.field147] = arg1;
                        ++this.field147;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field224[var7] != null) {
                            this.field209[this.field147] = this.field224[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field224[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field799 > field219.field799) {
                                    var9 = 2000;
                                }
                                if (field219.field784 != 0 && arg4.field784 != 0) {
                                    if (field219.field784 == arg4.field784) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field225[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field366[this.field147] = var9 + 264;
                            }
                            if (var7 == 1) {
                                this.field366[this.field147] = var9 + 480;
                            }
                            if (var7 == 2) {
                                this.field366[this.field147] = var9 + 651;
                            }
                            if (var7 == 3) {
                                this.field366[this.field147] = var9 + 283;
                            }
                            if (var7 == 4) {
                                this.field366[this.field147] = var9 + 716;
                            }
                            this.field367[this.field147] = arg2;
                            this.field364[this.field147] = arg0;
                            this.field365[this.field147] = arg1;
                            ++this.field147;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field147; ++var8) {
                    if (this.field366[var8] == 549) {
                        this.field209[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;BI)LESUFCMYV;")
    public final class11 method183(int arg0, String arg1, int arg2, String arg3, byte arg4, int arg5) {
        if (arg4 != -83) {
            this.field417 = -1;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field306[0] != null) {
                var7 = this.field306[0].method219(5, arg0);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field458.reset();
            this.field458.update(var7);
            int var9 = (int) this.field458.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class11((byte) 6, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method174("Requesting " + arg1, 27936, arg2);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method81(arg3 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class53 var17 = new class53(var16, (byte) -17);
                    var17.field1539 = 3;
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
                            this.method174("Loading " + arg1 + " - " + var23 + "%", 27936, arg2);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field306[0] != null) {
                            this.field306[0].method220(false, var7.length, arg0, var7);
                        }
                    } catch (Exception var29) {
                        this.field306[0] = null;
                    }
                    if (var7 != null) {
                        this.field458.reset();
                        this.field458.update(var7);
                        int var24 = (int) this.field458.getValue();
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
                            this.method174("Game updated - please reload page", 27936, arg2);
                            var26 = 10;
                        } else {
                            this.method174(var12 + " - Retrying in " + var26, 27936, arg2);
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
                    this.field349 = !this.field349;
                }
            }
            return new class11((byte) 6, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQUBPQDMQ;Z)Z")
    public final boolean method184(class51 arg0, boolean arg1) {
        this.field196 &= arg1;
        int var3 = arg0.field1497;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field209[this.field147] = "Remove @whi@" + arg0.field1467;
                this.field366[this.field147] = 837;
                ++this.field147;
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
            this.field209[this.field147] = "Remove @whi@" + this.field460[var3];
            this.field366[this.field147] = 154;
            ++this.field147;
            this.field209[this.field147] = "Message @whi@" + this.field460[var3];
            this.field366[this.field147] = 946;
            ++this.field147;
            return true;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field124[var1] = var0 - 1;
            var0 += var0;
        }
        field264 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field288 = 10;
        field290 = true;
        field325 = 523;
        field356 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field449 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field449[var3] = var2 / 4;
        }
        field461 = 388;
        field468 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field511 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field519 = 9;
        field564 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
