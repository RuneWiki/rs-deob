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
public class client extends class10 {

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Ljava/lang/String;")
    private String field70 = "";

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
    private boolean field72 = false;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "[I")
    private int[] field73 = new int[9];

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Z")
    private boolean field74 = false;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "B")
    private byte field75 = 93;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field87 = 11573;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    private boolean field88 = false;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    private boolean field91 = true;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
    private int[] field93 = new int[256];

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private int field94 = -1;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field95 = 39461;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Z")
    private boolean field100 = false;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "[J")
    private long[] field101 = new long[200];

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
    public int[] field104 = new int[1000];

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Ljava/lang/String;")
    private String field105 = "";

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/String;")
    private String field106 = "";

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
    private int[] field110 = new int[50];

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
    private boolean field122 = true;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
    private int field125 = 2;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "[Ljava/lang/String;")
    private String[] field126 = new String[500];

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
    private boolean field128 = false;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
    private int[] field130 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
    private int[] field131 = new int[1000];

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "LFTMSICIZ;")
    private class13 field132 = class13.method201(21834, 1);

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "Z")
    private boolean field139 = false;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "LQGWIBVPG;")
    private class42 field140 = new class42(9203);

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "B")
    private byte field141 = -90;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
    private int field142 = -1;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "[[[I")
    private int[][][] field144 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private int field145 = 12912;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "Z")
    private volatile boolean field148 = false;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
    private int[] field149 = new int[33];

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
    private int field150 = 2064;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    private int field155 = 884;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "[I")
    private int[] field156 = new int[5];

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "[J")
    private long[] field157 = new long[100];

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "Z")
    private boolean field163 = true;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
    private final int[] field164 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
    private int[] field165 = new int[151];

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "Z")
    private boolean field171 = false;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
    private int[] field183 = new int[500];

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
    private int[] field184 = new int[500];

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
    private int[] field185 = new int[500];

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "[I")
    private int[] field186 = new int[500];

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
    private int field187 = -30605;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "Z")
    private boolean field188 = false;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    private int field193 = -1;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
    private int field194 = 5063219;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field198 = 1;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
    private int field199 = -1;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "B")
    private byte field200 = 5;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
    private int[] field201 = new int[class60.field1506];

    @OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
    private int[] field203 = new int[5];

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field204 = 10;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "B")
    private byte field210 = 2;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "Z")
    private boolean field214 = false;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "[I")
    private int[] field216 = new int[50];

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "[LITVAFKCK;")
    private class22[] field223 = new class22[13];

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "B")
    private byte field225 = -36;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    private int field228 = 380;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private int field229 = -3404;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "LQGWIBVPG;")
    private class42 field230 = new class42(9203);

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field234 = -1;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private int field235 = -1;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "Z")
    private boolean field236 = false;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "I")
    private int field239 = -1;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
    private int[] field243 = new int[200];

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "Ljava/lang/String;")
    private String field244 = "";

    @OriginalMember(owner = "client!client", name = "je", descriptor = "I")
    private int field245 = 9;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "[LKUDWIDHU;")
    private class27[] field248 = new class27[100];

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int field249 = 6187;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field250 = 581;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
    private int field252 = 50;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
    private int[] field253 = new int[this.field252];

    @OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
    private int[] field254 = new int[this.field252];

    @OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
    private int[] field255 = new int[this.field252];

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
    private int[] field256 = new int[this.field252];

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
    private int[] field257 = new int[this.field252];

    @OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
    private int[] field258 = new int[this.field252];

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
    private int[] field259 = new int[this.field252];

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "[Ljava/lang/String;")
    private String[] field260 = new String[this.field252];

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
    private boolean field262 = false;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
    private boolean field264 = false;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
    private int[] field266 = new int[151];

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
    private int[] field268 = new int[4000];

    @OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
    private int[] field269 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "Z")
    private boolean field271 = false;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    private int field272 = -1;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "[LKUDWIDHU;")
    private class27[] field273 = new class27[20];

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "Z")
    private volatile boolean field274 = false;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "[[[LQGWIBVPG;")
    private class42[][][] field278 = new class42[4][104][104];

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
    private int[] field279 = new int[50];

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "[[I")
    private int[][] field280 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "Z")
    public boolean field281 = false;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
    private boolean field290 = true;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "B")
    private byte field291 = 2;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field293 = 25957;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "[LARIAIPRE;")
    public class3[] field294 = new class3[5];

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "LFTMSICIZ;")
    private class13 field295 = class13.method201(21834, 1);

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "[[I")
    private int[][] field296 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "Ljava/lang/String;")
    private String field297 = "";

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
    private boolean field304 = false;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "Ljava/lang/String;")
    private String field308 = "";

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "[LKUDWIDHU;")
    private class27[] field309 = new class27[8];

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
    private int[] field310 = new int[100];

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "[Ljava/lang/String;")
    private String[] field311 = new String[100];

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "[Ljava/lang/String;")
    private String[] field312 = new String[100];

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "B")
    private byte field317 = 1;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "[Ljava/lang/String;")
    private String[] field323 = new String[5];

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "[Z")
    private boolean[] field324 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "Z")
    private boolean field325 = false;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "Ljava/lang/String;")
    private String field326 = "";

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
    private int field327 = 402;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
    private int field328 = 3;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "Z")
    private boolean field329 = false;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
    private boolean field331 = true;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
    private boolean field332 = false;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "[LZSRJFSKK;")
    private class70[] field339 = new class70[4];

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "LPCARWQQC;")
    private class36 field340 = new class36();

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "Ljava/lang/String;")
    private String field341 = "";

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "[Ljava/lang/String;")
    private String[] field343 = new String[100];

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
    private int[] field344 = new int[100];

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "Z")
    private boolean field346 = false;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "Z")
    private boolean field347 = false;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "[Z")
    private boolean[] field349 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field350 = 5948;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
    private boolean field355 = true;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
    public int[] field365 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
    private int field368 = 128;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "[LKUDWIDHU;")
    private class27[] field372 = new class27[1000];

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "Z")
    private boolean field373 = false;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int field375 = 1;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "Z")
    private boolean field379 = true;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "[[I")
    private int[][] field385 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field391 = new CRC32();

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
    private int[] field392 = new int[class60.field1506];

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
    private boolean field394 = false;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "Z")
    private boolean field409 = false;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "I")
    private int field410 = 6;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    private int field413 = -1;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "Z")
    private boolean field416 = false;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
    private final int field417 = 100;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
    private int[] field418 = new int[100];

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "Z")
    private boolean field422 = true;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
    private int field423 = 78;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
    private int[] field424 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int field425 = 3353893;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "LQGWIBVPG;")
    private class42 field427 = new class42(9203);

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
    private int field430 = 2;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
    private int field432 = 7759444;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
    private int[] field433 = new int[class60.field1506];

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "B")
    private byte field434 = 90;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
    private boolean field445 = false;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
    private int[] field449 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
    private boolean field452 = false;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "Ljava/lang/String;")
    private String field453 = "";

    @OriginalMember(owner = "client!client", name = "li", descriptor = "Ljava/lang/String;")
    private String field454 = "";

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field459 = 984;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field462 = 2;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "[LKUDWIDHU;")
    private class27[] field463 = new class27[32];

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "[LKUDWIDHU;")
    private class27[] field464 = new class27[32];

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
    private boolean field466 = false;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "[Ljava/lang/String;")
    private String[] field468 = new String[200];

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "B")
    private byte field469 = 92;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
    private boolean field471 = false;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "LFTMSICIZ;")
    private class13 field472 = new class13(new byte[5000], (byte) 3);

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "[LVMSVDNWD;")
    private class59[] field473 = new class59[16384];

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
    public int[] field475 = new int[16384];

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
    private int[] field479 = new int[5];

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field480 = 440;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "Z")
    private volatile boolean field481 = false;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "[LITVAFKCK;")
    private class22[] field482 = new class22[2];

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
    private int[] field485 = new int[33];

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "Z")
    private boolean field489 = false;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "[B")
    private byte[] field497 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "Z")
    private boolean field498 = false;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
    private int field500 = -1;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "[LKUDWIDHU;")
    private class27[] field501 = new class27[32];

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    private int field506 = -1;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
    private int field507 = -1;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int field508 = -1;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "[I")
    private int[] field509 = new int[7];

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field510 = -1;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
    private int[] field513 = new int[2000];

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private int field520 = -1;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "B")
    private byte field521 = 93;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "LFTMSICIZ;")
    private class13 field527 = class13.method201(21834, 1);

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
    private int[] field529 = new int[5];

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
    private int field531 = 2048;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
    private int field532 = 2047;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "[LYFPQHQAV;")
    private class66[] field533 = new class66[this.field531];

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
    public int[] field535 = new int[this.field531];

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
    private int[] field537 = new int[this.field531];

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "[LFTMSICIZ;")
    private class13[] field538 = new class13[this.field531];

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "[I")
    private int[] field540 = new int[5];

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
    private int field541 = 2301979;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "Z")
    public boolean field542 = true;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "[I")
    public int[] field544 = new int[2000];

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "[LITVAFKCK;")
    private class22[] field549 = new class22[100];

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "I")
    private int field554 = -1;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field71 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
    private static int[] field107 = new int[99];

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private static int field118;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
    private static boolean field120;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field158;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
    public static final int[] field215;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private static int field261;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "Z")
    private static boolean field386;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "Ljava/lang/String;")
    private static String field387;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "[[I")
    public static final int[][] field478;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
    public static int[] field503;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
    private int field114;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private static int field162;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private static int field196;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private static int field267;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private static int field352;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    private static int field389;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
    private static int field390;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
    private static int field419;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
    private static int field421;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
    private static int field442;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private static int field470;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private static int field483;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private static int field539;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
    private static int field547;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
    private static int field557;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private static int field92;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "J")
    private long field123;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "J")
    private long field265;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "J")
    private long field353;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "J")
    public long field358;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "J")
    private long field361;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "LGFMKEKCW;")
    public class16 field543;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "LHZYGKZDT;")
    private class20 field172;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "LHZYGKZDT;")
    private class20 field173;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "LHZYGKZDT;")
    private class20 field174;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "LHZYGKZDT;")
    private class20 field175;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "LHZYGKZDT;")
    private class20 field176;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "LHZYGKZDT;")
    private class20 field177;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "LHZYGKZDT;")
    private class20 field178;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "LHZYGKZDT;")
    private class20 field179;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "LHZYGKZDT;")
    private class20 field180;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "LHZYGKZDT;")
    private class20 field305;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "LHZYGKZDT;")
    private class20 field306;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "LHZYGKZDT;")
    private class20 field307;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "LHZYGKZDT;")
    private class20 field455;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "LHZYGKZDT;")
    private class20 field456;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "LHZYGKZDT;")
    private class20 field457;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "LHZYGKZDT;")
    private class20 field458;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "LHZYGKZDT;")
    private class20 field78;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "LHZYGKZDT;")
    private class20 field79;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "LHZYGKZDT;")
    private class20 field80;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "LHZYGKZDT;")
    private class20 field81;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "LHZYGKZDT;")
    private class20 field82;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "LHZYGKZDT;")
    private class20 field83;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "LHZYGKZDT;")
    private class20 field84;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "LHZYGKZDT;")
    private class20 field85;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "LHZYGKZDT;")
    private class20 field86;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "LITVAFKCK;")
    private class22 field152;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "LITVAFKCK;")
    private class22 field153;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "LITVAFKCK;")
    private class22 field154;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "LITVAFKCK;")
    private class22 field218;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "LITVAFKCK;")
    private class22 field219;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "LITVAFKCK;")
    private class22 field220;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "LITVAFKCK;")
    private class22 field221;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "LITVAFKCK;")
    private class22 field222;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "LITVAFKCK;")
    private class22 field226;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "LITVAFKCK;")
    private class22 field227;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "LITVAFKCK;")
    private class22 field288;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "LITVAFKCK;")
    private class22 field289;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "LITVAFKCK;")
    private class22 field298;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "LITVAFKCK;")
    private class22 field299;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "LITVAFKCK;")
    private class22 field300;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "LITVAFKCK;")
    private class22 field301;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "LITVAFKCK;")
    private class22 field302;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "LITVAFKCK;")
    private class22 field490;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "LITVAFKCK;")
    private class22 field491;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "LITVAFKCK;")
    private class22 field492;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "LKUDWIDHU;")
    private class27 field240;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "LKUDWIDHU;")
    private class27 field318;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "LKUDWIDHU;")
    private class27 field363;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "LKUDWIDHU;")
    private class27 field364;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "LKUDWIDHU;")
    private class27 field440;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "LKUDWIDHU;")
    private class27 field441;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "LKUDWIDHU;")
    private class27 field448;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "LKUDWIDHU;")
    private class27 field504;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "LKUDWIDHU;")
    private class27 field505;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "LKUDWIDHU;")
    private class27 field514;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "LKUDWIDHU;")
    private class27 field515;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "LKUDWIDHU;")
    private class27 field516;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "LKUDWIDHU;")
    private class27 field517;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "LKUDWIDHU;")
    private class27 field518;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "LKUDWIDHU;")
    private class27 field528;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "LAKPFVPPG;")
    private class2 field182;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "LLVBGZMMP;")
    private class30 field393;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "LCAMKASVY;")
    private class4 field405;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "LCAMKASVY;")
    private class4 field406;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "LCAMKASVY;")
    private class4 field407;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "LCAMKASVY;")
    private class4 field408;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "LSRCZZRYO;")
    private class54 field351;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "LXNSGYTEG;")
    private class63 field143;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "LYEQNFKYU;")
    private class65 field512;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "LYFPQHQAV;")
    public static class66 field89;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "Ljava/lang/String;")
    public String field117;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "Ljava/lang/String;")
    public String field192;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "Ljava/lang/String;")
    private String field412;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "Ljava/lang/String;")
    private String field420;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "Ljava/net/Socket;")
    private Socket field366;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "Z")
    private static boolean field121;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
    public static boolean field138;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "Z")
    public static boolean field238;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "Z")
    private static boolean field362;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "[I")
    private int[] field160;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "[I")
    private int[] field161;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
    private int[] field313;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
    private int[] field314;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
    private int[] field315;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
    private int[] field316;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "[I")
    private int[] field319;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
    private int[] field320;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "[I")
    private int[] field321;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
    private int[] field322;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
    private int[] field336;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
    private int[] field337;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
    private int[] field338;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
    private int[] field76;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
    private int[] field77;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "[LITVAFKCK;")
    private class22[] field426;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "[[B")
    private byte[][] field467;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "[[B")
    private byte[][] field66;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "[[[B")
    private byte[][][] field556;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "[[[I")
    private int[][][] field511;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method41(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field453 = "";
                this.field454 = "Connecting to server...";
                this.method100(true, (byte) 8);
            }
            this.field351 = new class54(this.method73(field119 + 43594), 34706, this);
            long var4 = class51.method445(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field132.field643 = 0;
            this.field132.method203(14);
            this.field132.method203(var6);
            this.field351.method460(2, this.field249, this.field132.field642, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field351.method457();
            }
            int var8 = this.field351.method457();
            int var9 = var8;
            if (var8 == 0) {
                this.field351.method459(this.field527.field642, 0, 8);
                this.field527.field643 = 0;
                this.field265 = this.field527.method219(false);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field265 >> 32), (int) this.field265 };
                this.field132.field643 = 0;
                this.field132.method203(10);
                this.field132.method207(var10[0]);
                this.field132.method207(var10[1]);
                this.field132.method207(var10[2]);
                this.field132.method207(var10[3]);
                this.field132.method207(signlink.uid);
                this.field132.method210(arg0);
                this.field132.method210(arg1);
                this.field132.method228(-29356, field71, field158);
                this.field295.field643 = 0;
                if (arg2) {
                    this.field295.method203(18);
                } else {
                    this.field295.method203(16);
                }
                this.field295.method203(this.field132.field643 + 36 + 1 + 1 + 2);
                this.field295.method203(255);
                this.field295.method204(372);
                this.field295.method203(field121 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field295.method207(this.field73[var11]);
                }
                this.field295.method211(0, 531, this.field132.field642, this.field132.field643);
                this.field132.field647 = new class65(var10, 5);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field512 = new class65(var10, 5);
                this.field351.method460(this.field295.field643, this.field249, this.field295.field642, 0);
                var8 = this.field351.method457();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method41(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field181 = this.field351.method457();
                field138 = this.field351.method457() == 1;
                this.field358 = 0L;
                this.field357 = 0;
                this.field543.field680 = 0;
                super.field594 = true;
                this.field542 = true;
                this.field281 = true;
                this.field132.field643 = 0;
                this.field527.field643 = 0;
                this.field436 = -1;
                this.field133 = -1;
                this.field134 = -1;
                this.field135 = -1;
                this.field435 = 0;
                this.field437 = 0;
                this.field530 = 0;
                this.field439 = 0;
                this.field555 = 0;
                this.field428 = 0;
                this.field262 = false;
                super.field595 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field312[var13] = null;
                }
                this.field113 = 0;
                this.field189 = 0;
                this.field388 = 0;
                this.field90 = 0;
                this.field124 = (int) (Math.random() * 100.0D) - 50;
                this.field461 = (int) (Math.random() * 110.0D) - 55;
                this.field374 = (int) (Math.random() * 80.0D) - 40;
                this.field429 = (int) (Math.random() * 120.0D) - 60;
                this.field197 = (int) (Math.random() * 30.0D) - 20;
                this.field369 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field112 = 0;
                this.field235 = -1;
                this.field446 = 0;
                this.field447 = 0;
                this.field534 = 0;
                this.field474 = 0;
                for (int var14 = 0; var14 < this.field531; ++var14) {
                    this.field533[var14] = null;
                    this.field538[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field473[var15] = null;
                }
                field89 = this.field533[this.field532] = new class66();
                this.field140.method426();
                this.field230.method426();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field278[var16][var17][var18] = null;
                        }
                    }
                }
                this.field427 = new class42(9203);
                this.field242 = 0;
                this.field241 = 0;
                this.method50(this.field199, 7063);
                this.field199 = -1;
                this.method50(this.field193, 7063);
                this.field193 = -1;
                this.method50(this.field142, 7063);
                this.field142 = -1;
                this.method50(this.field272, 7063);
                this.field272 = -1;
                this.method50(this.field508, 7063);
                this.field508 = -1;
                this.method50(this.field510, 7063);
                this.field510 = -1;
                this.method50(this.field500, 7063);
                this.field500 = -1;
                this.field236 = false;
                this.field328 = 3;
                this.field111 = 0;
                this.field262 = false;
                this.field346 = false;
                this.field412 = null;
                this.field127 = 0;
                this.field239 = -1;
                this.field91 = true;
                this.method131(0);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field203[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field323[var20] = null;
                    this.field324[var20] = false;
                }
                field421 = 0;
                field442 = 0;
                field539 = 0;
                field547 = 0;
                field352 = 0;
                field390 = 0;
                field419 = 0;
                field162 = 0;
                field92 = 0;
                field483 = 0;
                this.method182(true);
            } else if (var8 == 3) {
                this.field453 = "";
                this.field454 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field453 = "Your account has been disabled.";
                this.field454 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field453 = "Your account is already logged in.";
                this.field454 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field453 = "RuneScape has been updated!";
                this.field454 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field453 = "This world is full.";
                this.field454 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field453 = "Unable to connect.";
                this.field454 = "Login server offline.";
            } else if (var8 == 9) {
                this.field453 = "Login limit exceeded.";
                this.field454 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field453 = "Unable to connect.";
                this.field454 = "Bad session id.";
            } else if (var8 == 12) {
                this.field453 = "You need a members account to login to this world.";
                this.field454 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field453 = "Could not complete login.";
                this.field454 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field453 = "The server is being updated.";
                this.field454 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field281 = true;
                this.field132.field643 = 0;
                this.field527.field643 = 0;
                this.field436 = -1;
                this.field133 = -1;
                this.field134 = -1;
                this.field135 = -1;
                this.field435 = 0;
                this.field437 = 0;
                this.field530 = 0;
                this.field428 = 0;
                this.field262 = false;
                this.field353 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field453 = "Login attempts exceeded.";
                this.field454 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field453 = "You are standing in a members-only area.";
                this.field454 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field453 = "Invalid loginserver requested";
                this.field454 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field453 = "Malformed login packet.";
                    this.field454 = "Please try again.";
                } else if (var8 == 23) {
                    this.field453 = "No reply from loginserver.";
                    this.field454 = "Please try again.";
                } else if (var8 == 24) {
                    this.field453 = "Error loading your profile.";
                    this.field454 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field453 = "Unexpected loginserver response.";
                    this.field454 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field453 = "This computers address has been blocked";
                    this.field454 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field147 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field147;
                            this.method41(arg0, arg1, arg2);
                        } else {
                            this.field453 = "No response from loginserver";
                            this.field454 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field453 = "No response from server";
                        this.field454 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field453 = "Unexpected server response";
                    this.field454 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field351.method457();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field453 = "You have only just left another world";
                    this.field454 = "Your profile will be transferred in: " + var26;
                    this.method100(true, (byte) 8);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method41(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field453 = "";
            this.field454 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 372);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field118 = Integer.parseInt(arg0[0]);
                field119 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method59(5);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method184(270);
                }
                if (arg0[3].equals("free")) {
                    field120 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field120 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method189(765, 0, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)Z")
    public final boolean method42(int arg0, boolean arg1, byte[] arg2) {
        this.field281 &= arg1;
        return arg2 == null ? true : signlink.wavesave(arg2, arg0);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method43(int arg0) {
        int var2 = 99 / arg0;
        if (this.field112 == 0) {
            if (super.field603 == 1) {
                int var3 = super.field604 - 25 - 550;
                int var4 = super.field605 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field429 + this.field369 & 2047;
                    int var6 = class71.field1729[var5];
                    int var7 = class71.field1730[var5];
                    int var8 = (this.field197 + 256) * var6 >> 8;
                    int var9 = (this.field197 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field89.field1255 + var10 >> 7;
                    int var13 = field89.field1256 - var11 >> 7;
                    boolean var14 = this.method164(var13, 1, 0, 0, 0, field89.field1259[0], field89.field1258[0], true, var12, (byte) -85, 0, 0);
                    if (var14) {
                        this.field132.method203(var3);
                        this.field132.method203(var4);
                        this.field132.method204(this.field369);
                        this.field132.method203(57);
                        this.field132.method203(this.field429);
                        this.field132.method203(this.field197);
                        this.field132.method203(89);
                        this.field132.method204(field89.field1255);
                        this.field132.method204(field89.field1256);
                        this.field132.method203(this.field108);
                        this.field132.method203(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method44(byte arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            if (this.field210 == arg0) {
                String[] var4 = new String[100];
                int var5 = 0;
                while (true) {
                    int var6 = var3.indexOf(" ");
                    if (var6 == -1) {
                        String var8 = var3.trim();
                        if (var8.length() > 0) {
                            var4[var5++] = var8.toLowerCase();
                        }
                        this.field342 = 0;
                        label51: for (int var9 = 0; var9 < class34.field992; ++var9) {
                            class34 var10 = class34.method390(var9);
                            if (var10.field998 == -1 && var10.field985 != null) {
                                String var11 = var10.field985.toLowerCase();
                                for (int var12 = 0; var12 < var5; ++var12) {
                                    if (var11.indexOf(var4[var12]) == -1) {
                                        continue label51;
                                    }
                                }
                                this.field343[this.field342] = var11;
                                this.field344[this.field342] = var9;
                                ++this.field342;
                                if (this.field342 >= this.field343.length) {
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
            }
        } else {
            this.field342 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILPCARWQQC;IIIIII)V")
    public final void method45(int arg0, int arg1, class36 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field409) {
            this.field444 = 32;
        } else {
            this.field444 = 0;
        }
        this.field409 = false;
        if (arg4 < 0) {
            if (arg7 >= arg1 && arg7 < arg1 + 16 && arg8 >= arg3 && arg8 < arg3 + 16) {
                arg2.field1063 -= this.field231 * 4;
                if (arg0 == 1) {
                    this.field394 = true;
                }
                if (arg0 == 2 || arg0 == 3) {
                    this.field452 = true;
                }
            } else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg8 >= arg3 + arg5 - 16 && arg8 < arg3 + arg5) {
                arg2.field1063 += this.field231 * 4;
                if (arg0 == 1) {
                    this.field394 = true;
                }
                if (arg0 == 2 || arg0 == 3) {
                    this.field452 = true;
                }
            } else if (arg7 >= arg1 - this.field444 && arg7 < arg1 + 16 + this.field444 && arg8 >= arg3 + 16 && arg8 < arg3 + arg5 - 16 && this.field231 > 0) {
                int var10 = (arg5 - 32) * arg5 / arg6;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg8 - arg3 - 16 - var10 / 2;
                int var12 = arg5 - 32 - var10;
                arg2.field1063 = (arg6 - arg5) * var11 / var12;
                if (arg0 == 1) {
                    this.field394 = true;
                }
                if (arg0 == 2 || arg0 == 3) {
                    this.field452 = true;
                }
                this.field409 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method46(int arg0) {
        ++this.field519;
        this.method185(this.field250, true);
        this.method118(true, 0);
        this.method185(this.field250, false);
        this.method118(false, 0);
        this.method94(true);
        this.method99(691);
        if (!this.field329) {
            int var2 = this.field368;
            if (this.field102 / 256 > var2) {
                var2 = this.field102 / 256;
            }
            if (this.field349[4] && this.field529[4] + 128 > var2) {
                var2 = this.field529[4] + 128;
            }
            int var3 = this.field374 + this.field369 & 2047;
            this.method157(this.field212, this.method106(field89.field1255, (byte) -10, this.field411, field89.field1256) - 50, this.field211, var2 * 3 + 600, var3, var2, 686);
        }
        int var4;
        if (!this.field329) {
            var4 = this.method145(3);
        } else {
            var4 = this.method146(223);
        }
        int var5 = this.field283;
        int var6 = this.field284;
        int var7 = this.field285;
        int var8 = this.field286;
        int var9 = this.field287;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field349[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field479[var10] * 2 + 1) - (double) this.field479[var10] + Math.sin((double) this.field540[var10] / 100.0D * (double) this.field156[var10]) * (double) this.field529[var10]);
                if (var10 == 0) {
                    this.field283 += var12;
                }
                if (var10 == 1) {
                    this.field284 += var12;
                }
                if (var10 == 2) {
                    this.field285 += var12;
                }
                if (var10 == 3) {
                    this.field287 = this.field287 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field286 += var12;
                    if (this.field286 < 128) {
                        this.field286 = 128;
                    }
                    if (this.field286 > 383) {
                        this.field286 = 383;
                    }
                }
            }
        }
        int var11 = class71.field1740;
        class28.field875 = true;
        class28.field878 = 0;
        class28.field876 = super.field597 - 4;
        class28.field877 = super.field598 - 4;
        class5.method31((byte) 4);
        this.field143.method526(this.field286, 5, this.field283, this.field287, this.field284, this.field285, var4);
        this.field143.method501(false);
        this.method152(this.field155);
        this.method67(-638);
        this.method105(var11, true);
        this.method163(true);
        this.field457.method295(4, -895, super.field589, 4);
        this.field283 = var5;
        this.field284 = var6;
        this.field285 = var7;
        this.field286 = var8;
        if (arg0 != 28029) {
            this.field436 = -1;
        }
        this.field287 = var9;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field143.method513(arg5, arg2, arg4);
        if (arg3 != 45824) {
            this.field436 = this.field527.method213();
        }
        if (var7 != 0) {
            int var8 = this.field143.method517(arg5, arg2, arg4, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg0;
            }
            int[] var12 = this.field448.field796;
            int var13 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class39 var15 = class39.method409(var14);
            if (var15.field1178 != -1) {
                class22 var16 = this.field549[var15.field1178];
                if (var16 != null) {
                    int var17 = (var15.field1146 * 4 - var16.field731) / 2;
                    int var18 = (var15.field1141 * 4 - var16.field732) / 2;
                    var16.method304(233, arg2 * 4 + 48 + var17, (104 - arg4 - var15.field1141) * 4 + 48 + var18);
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
        int var19 = this.field143.method515(arg5, arg2, arg4);
        if (var19 != 0) {
            int var20 = this.field143.method517(arg5, arg2, arg4, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class39 var24 = class39.method409(var23);
            if (var24.field1178 != -1) {
                class22 var25 = this.field549[var24.field1178];
                if (var25 != null) {
                    int var26 = (var24.field1146 * 4 - var25.field731) / 2;
                    int var27 = (var24.field1141 * 4 - var25.field732) / 2;
                    var25.method304(233, arg2 * 4 + 48 + var26, (104 - arg4 - var24.field1141) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field448.field796;
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
        int var31 = this.field143.method516(arg5, arg2, arg4);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class39 var33 = class39.method409(var32);
            if (var33.field1178 != -1) {
                class22 var34 = this.field549[var33.field1178];
                if (var34 != null) {
                    int var35 = (var33.field1146 * 4 - var34.field731) / 2;
                    int var36 = (var33.field1141 * 4 - var34.field732) / 2;
                    var34.method304(233, arg2 * 4 + 48 + var35, (104 - arg4 - var33.field1141) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public final void method48(int arg0, int arg1) {
        class42 var3 = this.field278[this.field411][arg0][arg1];
        if (var3 == null) {
            this.field143.method508(this.field411, arg0, arg1);
        } else {
            int var4 = -99999999;
            class6 var5 = null;
            for (class6 var6 = (class6) var3.method422(); var6 != null; var6 = (class6) var3.method424(false)) {
                class34 var11 = class34.method390(var6.field56);
                int var12 = var11.field997;
                if (var11.field1012) {
                    var12 = (var6.field57 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method420(-141, var5);
            class6 var7 = null;
            class6 var8 = null;
            for (class6 var9 = (class6) var3.method422(); var9 != null; var9 = (class6) var3.method424(false)) {
                if (var5.field56 != var9.field56 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field56 != var9.field56 && var7.field56 != var9.field56 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field143.method494(var5, arg0, this.field411, -32576, var7, var10, this.method106(arg0 * 128 + 64, (byte) -10, this.field411, arg1 * 128 + 64), var8, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method49(byte arg0) {
        this.field148 = true;
        if (arg0 != 8) {
            this.field100 = !this.field100;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field274) {
                ++this.field359;
                this.method125(true);
                this.method125(true);
                this.method169(-732);
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
        this.field148 = false;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method50(int arg0, int arg1) {
        if (arg1 != 7063) {
            field261 = 104;
        }
        class36.method396(arg0, 7063);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFTMSICIZ;II)V")
    private final void method51(class13 arg0, int arg1, int arg2) {
        int var4 = arg0.method224(8, 779);
        if (var4 < this.field534) {
            for (int var5 = var4; var5 < this.field534; ++var5) {
                this.field104[this.field103++] = this.field535[var5];
            }
        }
        if (var4 > this.field534) {
            signlink.reporterror(this.field105 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field534 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var8 = this.field535[var6];
                class66 var9 = this.field533[var8];
                int var10 = arg0.method224(1, 779);
                if (var10 == 0) {
                    this.field535[this.field534++] = var8;
                    var9.field1274 = field282;
                } else {
                    int var11 = arg0.method224(2, 779);
                    if (var11 == 0) {
                        this.field535[this.field534++] = var8;
                        var9.field1274 = field282;
                        this.field537[this.field536++] = var8;
                    } else if (var11 == 1) {
                        this.field535[this.field534++] = var8;
                        var9.field1274 = field282;
                        int var12 = arg0.method224(3, 779);
                        var9.method430(36500, var12, false);
                        int var13 = arg0.method224(1, 779);
                        if (var13 == 1) {
                            this.field537[this.field536++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field535[this.field534++] = var8;
                        var9.field1274 = field282;
                        int var14 = arg0.method224(3, 779);
                        var9.method430(36500, var14, true);
                        int var15 = arg0.method224(3, 779);
                        var9.method430(36500, var15, true);
                        int var16 = arg0.method224(1, 779);
                        if (var16 == 1) {
                            this.field537[this.field536++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field104[this.field103++] = var8;
                    }
                }
            }
            int var10000 = arg1 + arg2;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LFTMSICIZ;II)V")
    private final void method52(class13 arg0, int arg1, int arg2) {
        this.field103 = 0;
        this.field536 = 0;
        this.method56(arg2, arg0, 0);
        this.method93(true, arg2, arg0);
        this.method132(arg0, arg2, (byte) -100);
        for (int var4 = 0; var4 < this.field103; ++var4) {
            int var6 = this.field104[var4];
            if (field282 != this.field473[var6].field1274) {
                this.field473[var6].field1505 = null;
                this.field473[var6] = null;
            }
        }
        if (arg1 == 0) {
            if (arg0.field643 != arg2) {
                signlink.reporterror(this.field105 + " size mismatch in getnpcpos - pos:" + arg0.field643 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field474; ++var5) {
                    if (this.field473[this.field475[var5]] == null) {
                        signlink.reporterror(this.field105 + " null entry in npc list - pos:" + var5 + " size:" + this.field474);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method53(boolean arg0) {
        if (this.field439 > 0) {
            this.method138(false);
        } else {
            this.method139("Please wait - attempting to reestablish", 4, "Connection lost");
            this.field112 = 0;
            this.field446 = 0;
            if (!arg0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            class54 var3 = this.field351;
            this.field281 = false;
            this.field147 = 0;
            this.method41(this.field105, this.field106, true);
            if (!this.field281) {
                this.method138(false);
            }
            try {
                var3.method456();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method54(int arg0) {
        int var2 = this.field407.method15(false, "Choose Option");
        for (int var3 = 0; var3 < this.field428; ++var3) {
            int var11 = this.field407.method15(false, this.field126[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        if (arg0 == -34918) {
            int var4 = this.field428 * 15 + 21;
            if (super.field604 > 4 && super.field605 > 4 && super.field604 < 516 && super.field605 < 338) {
                int var5 = super.field604 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field605 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field262 = true;
                this.field205 = 0;
                this.field206 = var5;
                this.field207 = var6;
                this.field208 = var2;
                this.field209 = this.field428 * 15 + 22;
            }
            if (super.field604 > 553 && super.field605 > 205 && super.field604 < 743 && super.field605 < 466) {
                int var7 = super.field604 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field605 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field262 = true;
                this.field205 = 1;
                this.field206 = var7;
                this.field207 = var8;
                this.field208 = var2;
                this.field209 = this.field428 * 15 + 22;
            }
            if (super.field604 > 17 && super.field605 > 357 && super.field604 < 496 && super.field605 < 453) {
                int var9 = super.field604 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field605 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field262 = true;
                this.field205 = 2;
                this.field206 = var9;
                this.field207 = var10;
                this.field208 = var2;
                this.field209 = this.field428 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method55(boolean arg0, long arg1) {
        if (arg0) {
            this.field304 = !this.field304;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field241; ++var4) {
                if (this.field101[var4] == arg1) {
                    --this.field241;
                    this.field394 = true;
                    for (int var5 = var4; var5 < this.field241; ++var5) {
                        this.field468[var5] = this.field468[var5 + 1];
                        this.field243[var5] = this.field243[var5 + 1];
                        this.field101[var5] = this.field101[var5 + 1];
                    }
                    this.field132.method202((byte) 64, 99);
                    this.field132.method209(arg1, (byte) 7);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILFTMSICIZ;I)V")
    private final void method56(int arg0, class13 arg1, int arg2) {
        int var10000 = arg0 + arg2;
        arg1.method223(-25838);
        int var5 = arg1.method224(8, 779);
        if (var5 < this.field474) {
            for (int var6 = var5; var6 < this.field474; ++var6) {
                this.field104[this.field103++] = this.field475[var6];
            }
        }
        if (var5 > this.field474) {
            signlink.reporterror(this.field105 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field474 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field475[var7];
                class59 var9 = this.field473[var8];
                int var10 = arg1.method224(1, 779);
                if (var10 == 0) {
                    this.field475[this.field474++] = var8;
                    var9.field1274 = field282;
                } else {
                    int var11 = arg1.method224(2, 779);
                    if (var11 == 0) {
                        this.field475[this.field474++] = var8;
                        var9.field1274 = field282;
                        this.field537[this.field536++] = var8;
                    } else if (var11 == 1) {
                        this.field475[this.field474++] = var8;
                        var9.field1274 = field282;
                        int var12 = arg1.method224(3, 779);
                        var9.method430(36500, var12, false);
                        int var13 = arg1.method224(1, 779);
                        if (var13 == 1) {
                            this.field537[this.field536++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field475[this.field474++] = var8;
                        var9.field1274 = field282;
                        int var14 = arg1.method224(3, 779);
                        var9.method430(36500, var14, true);
                        int var15 = arg1.method224(3, 779);
                        var9.method430(36500, var15, true);
                        int var16 = arg1.method224(1, 779);
                        if (var16 == 1) {
                            this.field537[this.field536++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field104[this.field103++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (!this.field347 && !this.field325 && !this.field139) {
            ++field282;
            if (!this.field281) {
                this.method70((byte) 28);
            } else {
                this.method72(718);
            }
            this.method165(8);
            if (this.field229 != arg0) {
                this.field436 = this.field527.method213();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method58(int arg0) {
        this.field348 = 0;
        if (arg0 != 5) {
            this.field436 = -1;
        }
        int var2 = (field89.field1255 >> 7) + this.field96;
        int var3 = (field89.field1256 >> 7) + this.field97;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field348 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field348 = 1;
        }
        if (this.field348 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field348 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method59(int arg0) {
        if (arg0 >= 5 && arg0 <= 5) {
            class63.field1534 = true;
            class71.field1720 = true;
            field121 = true;
            class67.field1656 = true;
            class39.field1172 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
    public final boolean method60(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field143.method517(this.field411, arg2, arg3, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method164(arg3, 2, 0, var8, 0, field89.field1259[0], field89.field1258[0], true, arg2, (byte) -85, 0, var7 + 1);
            } else {
                class39 var9 = class39.method409(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1141;
                    var11 = var9.field1146;
                } else {
                    var10 = var9.field1146;
                    var11 = var9.field1141;
                }
                int var12 = var9.field1134;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method164(arg3, 2, var12, 0, var10, field89.field1259[0], field89.field1258[0], true, arg2, (byte) -85, var11, 0);
            }
            this.field395 = super.field604;
            this.field396 = super.field605;
            this.field398 = 2;
            this.field397 = 0;
            while (arg1 >= 0) {
                this.field422 = !this.field422;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method61(int arg0) {
        if (!this.field347 && !this.field325 && !this.field139) {
            ++field496;
            if (arg0 != 46632) {
                this.field436 = -1;
            }
            if (!this.field281) {
                this.method100(false, (byte) 8);
            } else {
                this.method85((byte) 3);
            }
            this.field231 = 0;
        } else {
            this.method149(-944);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
    public final boolean method62(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg1 != 0) {
            this.field436 = this.field527.method213();
        }
        class36 var5 = class36.method394(arg0);
        for (int var6 = 0; var6 < var5.field1048.length && var5.field1048[var6] != -1; ++var6) {
            class36 var7 = class36.method394(var5.field1048[var6]);
            if (var7.field1082 == 0) {
                var4 |= this.method62(var7.field1052, 0, arg2);
            }
            if (var7.field1082 == 6 && (var7.field1039 != -1 || var7.field1040 != -1)) {
                boolean var8 = this.method74((byte) 7, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1040;
                } else {
                    var9 = var7.field1039;
                }
                if (var9 != -1) {
                    class37 var10 = class37.field1113[var9];
                    var7.field1053 += arg2;
                    while (var7.field1053 > var10.method405(-251, var7.field1037)) {
                        var7.field1053 -= var10.method405(-251, var7.field1037);
                        ++var7.field1037;
                        if (var7.field1037 >= var10.field1114) {
                            var7.field1037 -= var10.field1118;
                            if (var7.field1037 < 0 || var7.field1037 >= var10.field1114) {
                                var7.field1037 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1082 == 6 && var7.field1042 != 0) {
                int var11 = var7.field1042 >> 16;
                int var12 = var7.field1042 << 16 >> 16;
                int var13 = arg2 * var11;
                int var14 = arg2 * var12;
                var7.field1085 = var7.field1085 + var13 & 2047;
                var7.field1086 = var7.field1086 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method63(byte arg0) {
        if (arg0 != 1) {
            this.field436 = this.field527.method213();
        }
        this.field456.method294(0);
        if (this.field112 == 2) {
            byte[] var2 = this.field491.field729;
            int[] var3 = class5.field45;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field240.method322(33, this.field369, 256, this.field149, 33, this.field485, 0, this.field95, 25, 25, 0);
            this.field457.method294(0);
            class71.field1731 = this.field321;
        } else {
            int var6 = this.field429 + this.field369 & 2047;
            int var7 = field89.field1255 / 32 + 48;
            int var8 = 464 - field89.field1256 / 32;
            this.field448.method322(151, var6, this.field197 + 256, this.field266, 146, this.field165, 5, this.field95, var7, var8, 25);
            this.field240.method322(33, this.field369, 256, this.field149, 33, this.field485, 0, this.field95, 25, 25, 0);
            for (int var9 = 0; var9 < this.field129; ++var9) {
                int var39 = this.field130[var9] * 4 + 2 - field89.field1255 / 32;
                int var40 = this.field131[var9] * 4 + 2 - field89.field1256 / 32;
                this.method136(var39, this.field372[var9], -20546, var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class42 var36 = this.field278[this.field411][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field89.field1255 / 32;
                        int var38 = var35 * 4 + 2 - field89.field1256 / 32;
                        this.method136(var37, this.field514, -20546, var38);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field474; ++var11) {
                class59 var31 = this.field473[this.field475[var11]];
                if (var31 != null && var31.method433(172)) {
                    class48 var32 = var31.field1505;
                    if (var32.field1373 != null) {
                        var32 = var32.method436((byte) -38);
                    }
                    if (var32 != null && var32.field1344 && var32.field1365) {
                        int var33 = var31.field1255 / 32 - field89.field1255 / 32;
                        int var34 = var31.field1256 / 32 - field89.field1256 / 32;
                        this.method136(var33, this.field515, -20546, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field534; ++var12) {
                class66 var23 = this.field533[this.field535[var12]];
                if (var23 != null && var23.method433(172)) {
                    int var24 = var23.field1255 / 32 - field89.field1255 / 32;
                    int var25 = var23.field1256 / 32 - field89.field1256 / 32;
                    boolean var26 = false;
                    long var27 = class51.method445(var23.field1642);
                    for (int var29 = 0; var29 < this.field241; ++var29) {
                        if (this.field101[var29] == var27 && this.field243[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field89.field1624 != 0 && var23.field1624 != 0 && field89.field1624 == var23.field1624) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method136(var24, this.field517, -20546, var25);
                    } else if (var30) {
                        this.method136(var24, this.field518, -20546, var25);
                    } else {
                        this.method136(var24, this.field516, -20546, var25);
                    }
                }
            }
            if (this.field555 != 0 && field282 % 20 < 10) {
                if (this.field555 == 1 && this.field360 >= 0 && this.field360 < this.field473.length) {
                    class59 var13 = this.field473[this.field360];
                    if (var13 != null) {
                        int var14 = var13.field1255 / 32 - field89.field1255 / 32;
                        int var15 = var13.field1256 / 32 - field89.field1256 / 32;
                        this.method98(var15, var14, true, this.field505);
                    }
                }
                if (this.field555 == 2) {
                    int var16 = (this.field380 - this.field96) * 4 + 2 - field89.field1255 / 32;
                    int var17 = (this.field381 - this.field97) * 4 + 2 - field89.field1256 / 32;
                    this.method98(var17, var16, true, this.field505);
                }
                if (this.field555 == 10 && this.field502 >= 0 && this.field502 < this.field533.length) {
                    class66 var18 = this.field533[this.field502];
                    if (var18 != null) {
                        int var19 = var18.field1255 / 32 - field89.field1255 / 32;
                        int var20 = var18.field1256 / 32 - field89.field1256 / 32;
                        this.method98(var20, var19, true, this.field505);
                    }
                }
            }
            if (this.field446 != 0) {
                int var21 = this.field446 * 4 + 2 - field89.field1255 / 32;
                int var22 = this.field447 * 4 + 2 - field89.field1256 / 32;
                this.method136(var21, this.field504, -20546, var22);
            }
            class5.method33(97, 16777215, 78, 3, this.field350, 3);
            this.field457.method294(0);
            class71.field1731 = this.field321;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field118 = Integer.parseInt(this.getParameter("nodeid"));
        field119 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method59(5);
        } else {
            method184(270);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field120 = false;
        } else {
            field120 = true;
        }
        this.method190(765, 503, -44916);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method64(byte arg0) {
        this.field271 = true;
        if (arg0 != -120) {
            this.field159 = 354;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method65(boolean arg0) {
        int var2 = this.field166 * 128 + 64;
        int var3 = this.field167 * 128 + 64;
        int var4 = this.method106(var2, (byte) -10, this.field411, var3) - this.field168;
        if (this.field283 < var2) {
            this.field283 += (var2 - this.field283) * this.field170 / 1000 + this.field169;
            if (this.field283 > var2) {
                this.field283 = var2;
            }
        }
        if (this.field283 > var2) {
            this.field283 -= (this.field283 - var2) * this.field170 / 1000 + this.field169;
            if (this.field283 < var2) {
                this.field283 = var2;
            }
        }
        if (this.field284 < var4) {
            this.field284 += (var4 - this.field284) * this.field170 / 1000 + this.field169;
            if (this.field284 > var4) {
                this.field284 = var4;
            }
        }
        if (this.field284 > var4) {
            this.field284 -= (this.field284 - var4) * this.field170 / 1000 + this.field169;
            if (this.field284 < var4) {
                this.field284 = var4;
            }
        }
        if (this.field285 < var3) {
            this.field285 += (var3 - this.field285) * this.field170 / 1000 + this.field169;
            if (this.field285 > var3) {
                this.field285 = var3;
            }
        }
        if (this.field285 > var3) {
            this.field285 -= (this.field285 - var3) * this.field170 / 1000 + this.field169;
            if (this.field285 < var3) {
                this.field285 = var3;
            }
        }
        int var5 = this.field522 * 128 + 64;
        int var6 = this.field523 * 128 + 64;
        int var7 = this.method106(var5, (byte) -10, this.field411, var6) - this.field524;
        int var8 = var5 - this.field283;
        int var9 = var7 - this.field284;
        int var10 = var6 - this.field285;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (!arg0) {
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field286 < var12) {
                this.field286 += (var12 - this.field286) * this.field526 / 1000 + this.field525;
                if (this.field286 > var12) {
                    this.field286 = var12;
                }
            }
            if (this.field286 > var12) {
                this.field286 -= (this.field286 - var12) * this.field526 / 1000 + this.field525;
                if (this.field286 < var12) {
                    this.field286 = var12;
                }
            }
            int var14 = var13 - this.field287;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field287 += this.field526 * var14 / 1000 + this.field525;
                this.field287 &= 2047;
            }
            if (var14 < 0) {
                this.field287 -= -var14 * this.field526 / 1000 + this.field525;
                this.field287 &= 2047;
            }
            int var15 = var13 - this.field287;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field287 = var13;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        byte[] var2 = this.field182.method7("title.dat", (byte[]) null);
        class27 var3 = new class27(var2, this);
        this.field175.method294(0);
        var3.method316(0, 0, 0);
        this.field176.method294(0);
        var3.method316(-637, 0, 0);
        this.field172.method294(0);
        var3.method316(-128, 0, 0);
        this.field173.method294(0);
        var3.method316(-202, 0, -371);
        this.field174.method294(0);
        var3.method316(-202, 0, -171);
        this.field177.method294(0);
        var3.method316(0, 0, -265);
        this.field178.method294(0);
        var3.method316(-562, 0, -265);
        this.field179.method294(0);
        var3.method316(-128, 0, -171);
        this.field180.method294(0);
        var3.method316(-562, 0, -171);
        int[] var4 = new int[var3.field797];
        for (int var5 = 0; var5 < var3.field798; ++var5) {
            for (int var10 = 0; var10 < var3.field797; ++var10) {
                var4[var10] = var3.field796[var3.field797 * var5 + (var3.field797 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field797; ++var11) {
                var3.field796[var3.field797 * var5 + var11] = var4[var11];
            }
        }
        this.field175.method294(0);
        var3.method316(382, 0, 0);
        this.field176.method294(0);
        var3.method316(-255, 0, 0);
        this.field172.method294(0);
        var3.method316(254, 0, 0);
        this.field173.method294(0);
        var3.method316(180, 0, -371);
        this.field281 &= arg0;
        this.field174.method294(0);
        var3.method316(180, 0, -171);
        this.field177.method294(0);
        var3.method316(382, 0, -265);
        this.field178.method294(0);
        var3.method316(-180, 0, -265);
        this.field179.method294(0);
        var3.method316(254, 0, -171);
        this.field180.method294(0);
        var3.method316(-180, 0, -171);
        class27 var6 = new class27(this.field182, "logo", 0);
        this.field172.method294(0);
        var6.method318(233, 382 - var6.field797 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class41.field1195) {
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method67(int arg0) {
        if (this.field555 == 2) {
            this.method151(444, this.field382 * 2, (this.field381 - this.field97 << 7) + this.field384, (this.field380 - this.field96 << 7) + this.field383);
            if (arg0 >= 0) {
                this.field100 = !this.field100;
            }
            if (this.field506 > -1 && field282 % 20 < 10) {
                this.field464[0].method318(233, this.field506 - 12, this.field507 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method68(int arg0, int arg1) {
        if (arg1 < 0) {
            signlink.wavevol = arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Z")
    public final boolean method69(int arg0) {
        if (arg0 != -43764) {
            throw new NullPointerException();
        } else if (this.field351 == null) {
            return false;
        } else {
            try {
                int var2 = this.field351.method458();
                if (var2 == 0) {
                    return false;
                }
                if (this.field436 == -1) {
                    this.field351.method459(this.field527.field642, 0, 1);
                    this.field436 = this.field527.field642[0] & 255;
                    if (this.field512 != null) {
                        this.field436 = this.field436 - this.field512.method544() & 255;
                    }
                    this.field435 = class26.field787[this.field436];
                    --var2;
                }
                if (this.field435 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field351.method459(this.field527.field642, 0, 1);
                    this.field435 = this.field527.field642[0] & 255;
                    --var2;
                }
                if (this.field435 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field351.method459(this.field527.field642, 0, 2);
                    this.field527.field643 = 0;
                    this.field435 = this.field527.method215();
                    var2 -= 2;
                }
                if (var2 < this.field435) {
                    return false;
                }
                this.field527.field643 = 0;
                this.field351.method459(this.field527.field642, 0, this.field435);
                this.field437 = 0;
                this.field135 = this.field134;
                this.field134 = this.field133;
                this.field133 = this.field436;
                if (this.field436 == 185) {
                    int var3 = this.field527.method243(this.field317);
                    int var4 = this.field527.method242(4);
                    class36.method394(var4).field1074 = 1;
                    class36.method394(var4).field1075 = var3;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 148) {
                    this.field394 = true;
                    int var5 = this.field527.method215();
                    class36 var6 = class36.method394(var5);
                    while (this.field527.field643 < this.field435) {
                        int var7 = this.field527.method227();
                        int var8 = this.field527.method215();
                        int var9 = this.field527.method213();
                        if (var9 == 255) {
                            var9 = this.field527.method218();
                        }
                        if (var7 >= 0 && var7 < var6.field1041.length) {
                            var6.field1041[var7] = var8;
                            var6.field1093[var7] = var9;
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 159) {
                    this.field329 = true;
                    this.field522 = this.field527.method213();
                    this.field523 = this.field527.method213();
                    this.field524 = this.field527.method215();
                    this.field525 = this.field527.method213();
                    this.field526 = this.field527.method213();
                    if (this.field526 >= 100) {
                        int var10 = this.field522 * 128 + 64;
                        int var11 = this.field523 * 128 + 64;
                        int var12 = this.method106(var10, (byte) -10, this.field411, var11) - this.field524;
                        int var13 = var10 - this.field283;
                        int var14 = var12 - this.field284;
                        int var15 = var11 - this.field285;
                        int var16 = (int) Math.sqrt((double) (var13 * var13 + var15 * var15));
                        this.field286 = (int) (Math.atan2((double) var14, (double) var16) * 325.949D) & 2047;
                        this.field287 = (int) (Math.atan2((double) var13, (double) var15) * -325.949D) & 2047;
                        if (this.field286 < 128) {
                            this.field286 = 128;
                        }
                        if (this.field286 > 383) {
                            this.field286 = 383;
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 138) {
                    this.field346 = false;
                    this.field111 = 1;
                    this.field297 = "";
                    this.field452 = true;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 43) {
                    this.field545 = this.field527.method233(7);
                    this.field546 = this.field527.method232(-48253);
                    while (this.field527.field643 < this.field435) {
                        int var17 = this.field527.method213();
                        this.method183(this.field527, -519, var17);
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 69) {
                    this.field394 = true;
                    int var18 = this.field527.method250(this.field246);
                    int var19 = this.field527.method232(-48253);
                    int var20 = this.field527.method232(-48253);
                    this.field201[var20] = var18;
                    this.field392[var20] = var19;
                    this.field433[var20] = 1;
                    for (int var21 = 0; var21 < 98; ++var21) {
                        if (var18 >= field107[var21]) {
                            this.field433[var20] = var21 + 2;
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 137) {
                    this.field346 = false;
                    this.field111 = 2;
                    this.field297 = "";
                    this.field452 = true;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 183) {
                    String var22 = this.field527.method220();
                    int var23 = this.field527.method241(-12702);
                    class36.method394(var23).field1104 = var22;
                    int var10001 = this.field449[this.field328];
                    if (class36.method394(var23).field1092 == var10001) {
                        this.field394 = true;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 122) {
                    int var24 = this.field527.method215();
                    int var25 = this.field527.method243(this.field317);
                    int var26 = this.field527.method215();
                    class36.method394(var26).field1042 = (var25 << 16) + var24;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 161) {
                    int var27 = this.field527.method243(this.field317);
                    byte var28 = this.field527.method235(false);
                    this.field513[var27] = var28;
                    if (this.field544[var27] != var28) {
                        this.field544[var27] = var28;
                        this.method113((byte) 92, var27);
                        this.field394 = true;
                        if (this.field199 != -1) {
                            this.field452 = true;
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 16) {
                    int var29 = this.field527.method243(this.field317);
                    int var30 = this.field527.method242(4);
                    if (this.field193 != -1) {
                        this.method50(this.field193, 7063);
                        this.field193 = -1;
                        this.field452 = true;
                    }
                    if (this.field272 != -1) {
                        this.method50(this.field272, 7063);
                        this.field272 = -1;
                        this.field271 = true;
                    }
                    if (this.field508 != -1) {
                        this.method50(this.field508, 7063);
                        this.field508 = -1;
                    }
                    if (this.field142 != var30) {
                        this.method50(this.field142, 7063);
                        this.field142 = var30;
                    }
                    if (this.field510 != var29) {
                        this.method50(this.field510, 7063);
                        this.field510 = var29;
                    }
                    if (this.field111 != 0) {
                        this.field111 = 0;
                        this.field452 = true;
                    }
                    this.field394 = true;
                    this.field188 = true;
                    this.field236 = false;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 112) {
                    for (int var31 = 0; var31 < this.field533.length; ++var31) {
                        if (this.field533[var31] != null) {
                            this.field533[var31].field1279 = -1;
                        }
                    }
                    for (int var32 = 0; var32 < this.field473.length; ++var32) {
                        if (this.field473[var32] != null) {
                            this.field473[var32].field1279 = -1;
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 163) {
                    int var33 = this.field527.method242(4);
                    if (var33 == 65535) {
                        var33 = -1;
                    }
                    if (this.field94 != var33 && this.field163 && !field121 && this.field136 == 0) {
                        this.field378 = var33;
                        this.field379 = true;
                        this.field393.method366(2, this.field378);
                    }
                    this.field94 = var33;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 157) {
                    int var34 = this.field527.method241(-12702);
                    int var35 = this.field527.method246(-938);
                    if (this.field163 && !field121) {
                        this.field378 = var34;
                        this.field379 = false;
                        this.field393.method366(2, this.field378);
                        this.field136 = var35;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 109) {
                    int var36 = this.field527.method215();
                    boolean var37 = this.field527.method233(7) == 1;
                    class36.method394(var36).field1033 = var37;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 24) {
                    this.field446 = 0;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 87) {
                    int var38 = this.field527.method242(4);
                    class36.method394(var38).field1074 = 3;
                    if (field89.field1612 == null) {
                        class36.method394(var38).field1075 = (field89.field1627[11] << 5) + (field89.field1627[8] << 10) + (field89.field1627[0] << 15) + (field89.field1615[0] << 25) + (field89.field1615[4] << 20) + field89.field1627[1];
                    } else {
                        class36.method394(var38).field1075 = (int) (field89.field1612.field1375 + 305419896L);
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 191) {
                    int var39 = this.field527.method242(4);
                    int var40 = this.field527.method241(-12702);
                    this.method181(var39, false);
                    if (var40 != -1) {
                        this.method181(var40, false);
                    }
                    if (this.field142 != -1) {
                        this.method50(this.field142, 7063);
                        this.field142 = -1;
                    }
                    if (this.field510 != -1) {
                        this.method50(this.field510, 7063);
                        this.field510 = -1;
                    }
                    if (this.field193 != -1) {
                        this.method50(this.field193, 7063);
                        this.field193 = -1;
                    }
                    if (this.field272 != var39) {
                        this.method50(this.field272, 7063);
                        this.field272 = var39;
                    }
                    if (this.field508 != var39) {
                        this.method50(this.field508, 7063);
                        this.field508 = var40;
                    }
                    this.field111 = 0;
                    this.field236 = false;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 240) {
                    this.method138(false);
                    this.field436 = -1;
                    return false;
                }
                if (this.field436 == 64) {
                    this.field527.method215();
                    this.field527.method233(7);
                    this.field488 = this.field527.method215();
                    this.field335 = this.field527.method249(this.field293);
                    this.field67 = this.field527.method241(-12702);
                    this.field224 = this.field527.method215();
                    this.field431 = this.field527.method241(-12702);
                    this.field277 = this.field527.method241(-12702);
                    this.field137 = this.field527.method215();
                    this.field69 = this.field527.method241(-12702);
                    this.field263 = this.field527.method242(4);
                    signlink.dnslookup(class51.method448(this.field335, (byte) 3));
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 167) {
                    this.field334 = this.field527.method213();
                    this.field460 = this.field527.method213();
                    this.field484 = this.field527.method213();
                    this.field171 = true;
                    this.field452 = true;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 124) {
                    int var41 = this.field527.method216();
                    int var42 = this.field527.method242(4);
                    class36 var43 = class36.method394(var42);
                    if (var43.field1039 != var41 || var41 == -1) {
                        var43.field1039 = var41;
                        var43.field1037 = 0;
                        var43.field1053 = 0;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 118) {
                    if (this.field510 != -1) {
                        this.method50(this.field510, 7063);
                        this.field510 = -1;
                        this.field394 = true;
                        this.field188 = true;
                    }
                    if (this.field193 != -1) {
                        this.method50(this.field193, 7063);
                        this.field193 = -1;
                        this.field452 = true;
                    }
                    if (this.field272 != -1) {
                        this.method50(this.field272, 7063);
                        this.field272 = -1;
                        this.field271 = true;
                    }
                    if (this.field508 != -1) {
                        this.method50(this.field508, 7063);
                        this.field508 = -1;
                    }
                    if (this.field142 != -1) {
                        this.method50(this.field142, 7063);
                        this.field142 = -1;
                    }
                    if (this.field111 != 0) {
                        this.field111 = 0;
                        this.field452 = true;
                    }
                    this.field236 = false;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 133) {
                    int var44 = this.field527.method241(-12702);
                    int var45 = this.field527.method242(4);
                    class36 var46 = class36.method394(var45);
                    if (var46 != null && var46.field1082 == 0) {
                        if (var44 < 0) {
                            var44 = 0;
                        }
                        if (var44 > var46.field1087 - var46.field1095) {
                            var44 = var46.field1087 - var46.field1095;
                        }
                        var46.field1063 = var44;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 145) {
                    this.field292 = this.field435 / 8;
                    for (int var47 = 0; var47 < this.field292; ++var47) {
                        this.field157[var47] = this.field527.method219(false);
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 239) {
                    this.field329 = true;
                    this.field166 = this.field527.method213();
                    this.field167 = this.field527.method213();
                    this.field168 = this.field527.method215();
                    this.field169 = this.field527.method213();
                    this.field170 = this.field527.method213();
                    if (this.field170 >= 100) {
                        this.field283 = this.field166 * 128 + 64;
                        this.field285 = this.field167 * 128 + 64;
                        this.field284 = this.method106(this.field283, (byte) -10, this.field411, this.field285) - this.field168;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 219) {
                    this.field530 = this.field527.method242(4) * 30;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 156) {
                    int var48 = this.field527.method241(-12702);
                    class36 var49 = class36.method394(var48);
                    for (int var50 = 0; var50 < var49.field1041.length; ++var50) {
                        var49.field1041[var50] = -1;
                        var49.field1041[var50] = 0;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 58) {
                    int var51 = this.field527.method245((byte) -80);
                    int var52 = this.field527.method215();
                    int var53 = this.field527.method216();
                    class36 var54 = class36.method394(var52);
                    var54.field1051 = var53;
                    var54.field1103 = var51;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 151) {
                    this.field328 = this.field527.method232(-48253);
                    this.field394 = true;
                    this.field188 = true;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 173) {
                    int var55 = this.field527.method242(4);
                    int var56 = this.field527.method243(this.field317);
                    int var57 = var56 >> 10 & 31;
                    int var58 = var56 >> 5 & 31;
                    int var59 = var56 & 31;
                    class36.method394(var55).field1043 = (var59 << 3) + (var57 << 19) + (var58 << 11);
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 218) {
                    int var60 = this.field527.method241(-12702);
                    int var61 = this.field527.method242(4);
                    int var62 = this.field527.method242(4);
                    if (var60 == 65535) {
                        class36.method394(var61).field1074 = 0;
                        this.field436 = -1;
                        return true;
                    }
                    class34 var63 = class34.method390(var60);
                    class36.method394(var61).field1074 = 4;
                    class36.method394(var61).field1075 = var60;
                    class36.method394(var61).field1085 = var63.field1006;
                    class36.method394(var61).field1086 = var63.field996;
                    class36.method394(var61).field1084 = var63.field1005 * 100 / var62;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 246) {
                    int var64 = this.field527.method245((byte) -80);
                    if (var64 >= 0) {
                        this.method181(var64, false);
                    }
                    if (this.field500 != var64) {
                        this.method50(this.field500, 7063);
                        this.field500 = var64;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 254) {
                    this.method155(5, this.field527, this.field435);
                    this.field373 = false;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 71) {
                    this.method52(this.field527, 0, this.field435);
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 42) {
                    String var65 = this.field527.method220();
                    if (var65.endsWith(":tradereq:")) {
                        String var66 = var65.substring(0, var65.indexOf(":"));
                        long var67 = class51.method445(var66);
                        boolean var69 = false;
                        for (int var70 = 0; var70 < this.field292; ++var70) {
                            if (this.field157[var70] == var67) {
                                var69 = true;
                                break;
                            }
                        }
                        if (!var69 && this.field348 == 0) {
                            this.method177("wishes to trade with you.", var66, 4, 20045);
                        }
                    } else if (var65.endsWith(":duelreq:")) {
                        String var71 = var65.substring(0, var65.indexOf(":"));
                        long var72 = class51.method445(var71);
                        boolean var74 = false;
                        for (int var75 = 0; var75 < this.field292; ++var75) {
                            if (this.field157[var75] == var72) {
                                var74 = true;
                                break;
                            }
                        }
                        if (!var74 && this.field348 == 0) {
                            this.method177("wishes to duel with you.", var71, 8, 20045);
                        }
                    } else if (!var65.endsWith(":chalreq:")) {
                        this.method177(var65, "", 0, 20045);
                    } else {
                        String var76 = var65.substring(0, var65.indexOf(":"));
                        long var77 = class51.method445(var76);
                        boolean var79 = false;
                        for (int var80 = 0; var80 < this.field292; ++var80) {
                            if (this.field157[var80] == var77) {
                                var79 = true;
                                break;
                            }
                        }
                        if (!var79 && this.field348 == 0) {
                            String var81 = var65.substring(var65.indexOf(":") + 1, var65.length() - 9);
                            this.method177(var81, var76, 8, 20045);
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 228) {
                    if (this.field328 == 12) {
                        this.field394 = true;
                    }
                    this.field451 = this.field527.method216();
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 227) {
                    int var82 = this.field527.method215();
                    int var83 = this.field527.method213();
                    int var84 = this.field527.method215();
                    if (var84 == 65535) {
                        if (this.field90 < 50) {
                            this.field110[this.field90] = (short) var82;
                            this.field216[this.field90] = var83;
                            this.field279[this.field90] = 0;
                            ++this.field90;
                        }
                    } else if (this.field290 && !field121 && this.field90 < 50) {
                        this.field110[this.field90] = var82;
                        this.field216[this.field90] = var83;
                        this.field279[this.field90] = class56.field1483[var82] + var84;
                        ++this.field90;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 252) {
                    int var85 = this.field527.method242(4);
                    int var86 = this.field527.method241(-12702);
                    int var87 = this.field527.method241(-12702);
                    int var88 = this.field527.method241(-12702);
                    class36.method394(var86).field1085 = var85;
                    class36.method394(var86).field1086 = var87;
                    class36.method394(var86).field1084 = var88;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 235) {
                    long var89 = this.field527.method219(false);
                    int var91 = this.field527.method213();
                    String var92 = class51.method449(class51.method446(var89, (byte) 5), 78);
                    for (int var93 = 0; var93 < this.field241; ++var93) {
                        if (this.field101[var93] == var89) {
                            if (this.field243[var93] != var91) {
                                this.field243[var93] = var91;
                                this.field394 = true;
                                if (var91 > 0) {
                                    this.method177(var92 + " has logged in.", "", 5, 20045);
                                }
                                if (var91 == 0) {
                                    this.method177(var92 + " has logged out.", "", 5, 20045);
                                }
                            }
                            var92 = null;
                            break;
                        }
                    }
                    if (var92 != null && this.field241 < 200) {
                        this.field101[this.field241] = var89;
                        this.field468[this.field241] = var92;
                        this.field243[this.field241] = var91;
                        ++this.field241;
                        this.field394 = true;
                    }
                    boolean var94 = false;
                    while (!var94) {
                        var94 = true;
                        for (int var95 = 0; var95 < this.field241 - 1; ++var95) {
                            if (this.field243[var95] != field118 && this.field243[var95 + 1] == field118 || this.field243[var95] == 0 && this.field243[var95 + 1] != 0) {
                                int var96 = this.field243[var95];
                                this.field243[var95] = this.field243[var95 + 1];
                                this.field243[var95 + 1] = var96;
                                String var97 = this.field468[var95];
                                this.field468[var95] = this.field468[var95 + 1];
                                this.field468[var95 + 1] = var97;
                                long var98 = this.field101[var95];
                                this.field101[var95] = this.field101[var95 + 1];
                                this.field101[var95 + 1] = var98;
                                this.field394 = true;
                                var94 = false;
                            }
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 189) {
                    this.field112 = this.field527.method213();
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 210) {
                    int var100 = this.field527.method213();
                    int var101 = this.field527.method213();
                    String var102 = this.field527.method220();
                    if (var100 >= 1 && var100 <= 5) {
                        if (var102.equalsIgnoreCase("null")) {
                            var102 = null;
                        }
                        this.field323[var100 - 1] = var102;
                        this.field324[var100 - 1] = var101 == 0;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 217) {
                    this.field239 = this.field527.method232(-48253);
                    if (this.field328 == this.field239) {
                        if (this.field239 == 3) {
                            this.field328 = 1;
                        } else {
                            this.field328 = 3;
                        }
                        this.field394 = true;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 176 || this.field436 == 174 || this.field436 == 32 || this.field436 == 121 || this.field436 == 53 || this.field436 == 54 || this.field436 == 9 || this.field436 == 253 || this.field436 == 162 || this.field436 == 17 || this.field436 == 182) {
                    this.method183(this.field527, -519, this.field436);
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 102) {
                    int var103 = this.field527.method249(this.field293);
                    int var104 = this.field527.method243(this.field317);
                    this.field513[var104] = var103;
                    if (this.field544[var104] != var103) {
                        this.field544[var104] = var103;
                        this.method113((byte) 92, var104);
                        this.field394 = true;
                        if (this.field199 != -1) {
                            this.field452 = true;
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 153) {
                    int var105 = this.field527.method244(699);
                    if (this.field199 != var105) {
                        this.method50(this.field199, 7063);
                        this.field199 = var105;
                    }
                    this.field452 = true;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 78) {
                    this.field546 = this.field527.method232(-48253);
                    this.field545 = this.field527.method234(false);
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 82) {
                    this.field127 = this.field527.method213();
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 44) {
                    int var106 = this.field527.method233(7);
                    int var107 = this.field527.method242(4);
                    if (var107 == 65535) {
                        var107 = -1;
                    }
                    if (this.field449[var106] != var107) {
                        this.method50(this.field449[var106], 7063);
                        this.field449[var106] = var107;
                    }
                    this.field394 = true;
                    this.field188 = true;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 103) {
                    this.field68 = this.field527.method234(false);
                    this.field413 = this.field527.method215();
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 150) {
                    this.field242 = this.field527.method213();
                    this.field394 = true;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 243) {
                    this.field329 = false;
                    for (int var108 = 0; var108 < 5; ++var108) {
                        this.field349[var108] = false;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 86) {
                    int var109 = this.field527.method241(-12702);
                    int var110 = this.field527.method242(4);
                    class36.method394(var109).field1074 = 2;
                    class36.method394(var109).field1075 = var110;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 77) {
                    this.field555 = this.field527.method213();
                    if (this.field555 == 1) {
                        this.field360 = this.field527.method215();
                    }
                    if (this.field555 >= 2 && this.field555 <= 6) {
                        if (this.field555 == 2) {
                            this.field383 = 64;
                            this.field384 = 64;
                        }
                        if (this.field555 == 3) {
                            this.field383 = 0;
                            this.field384 = 64;
                        }
                        if (this.field555 == 4) {
                            this.field383 = 128;
                            this.field384 = 64;
                        }
                        if (this.field555 == 5) {
                            this.field383 = 64;
                            this.field384 = 0;
                        }
                        if (this.field555 == 6) {
                            this.field383 = 64;
                            this.field384 = 128;
                        }
                        this.field555 = 2;
                        this.field380 = this.field527.method215();
                        this.field381 = this.field527.method215();
                        this.field382 = this.field527.method213();
                    }
                    if (this.field555 == 10) {
                        this.field502 = this.field527.method215();
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 184) {
                    long var111 = this.field527.method219(false);
                    int var113 = this.field527.method218();
                    int var114 = this.field527.method213();
                    boolean var115 = false;
                    for (int var116 = 0; var116 < 100; ++var116) {
                        if (this.field418[var116] == var113) {
                            var115 = true;
                            break;
                        }
                    }
                    if (var114 <= 1) {
                        for (int var117 = 0; var117 < this.field292; ++var117) {
                            if (this.field157[var117] == var111) {
                                var115 = true;
                                break;
                            }
                        }
                    }
                    if (!var115 && this.field348 == 0) {
                        try {
                            this.field418[this.field195] = var113;
                            this.field195 = (this.field195 + 1) % 100;
                            String var118 = class50.method442(0, this.field527, this.field435 - 13);
                            if (var114 != 3) {
                                var118 = class17.method264(var118, true);
                            }
                            if (var114 != 2 && var114 != 3) {
                                if (var114 == 1) {
                                    this.method177(var118, "@cr1@" + class51.method449(class51.method446(var111, (byte) 5), 78), 7, 20045);
                                } else {
                                    this.method177(var118, class51.method449(class51.method446(var111, (byte) 5), 78), 3, 20045);
                                }
                            } else {
                                this.method177(var118, "@cr2@" + class51.method449(class51.method446(var111, (byte) 5), 78), 7, 20045);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 48) {
                    for (int var120 = 0; var120 < this.field544.length; ++var120) {
                        if (this.field544[var120] != this.field513[var120]) {
                            this.field544[var120] = this.field513[var120];
                            this.method113((byte) 92, var120);
                            this.field394 = true;
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 52) {
                    this.field546 = this.field527.method232(-48253);
                    this.field545 = this.field527.method232(-48253);
                    for (int var121 = this.field545; var121 < this.field545 + 8; ++var121) {
                        for (int var122 = this.field546; var122 < this.field546 + 8; ++var122) {
                            if (this.field278[this.field411][var121][var122] != null) {
                                this.field278[this.field411][var121][var122] = null;
                                this.method48(var121, var122);
                            }
                        }
                    }
                    for (class8 var123 = (class8) this.field427.method422(); var123 != null; var123 = (class8) this.field427.method424(false)) {
                        if (var123.field569 >= this.field545 && var123.field569 < this.field545 + 8 && var123.field570 >= this.field546 && var123.field570 < this.field546 + 8 && this.field411 == var123.field567) {
                            var123.field562 = 0;
                        }
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 166) {
                    this.field394 = true;
                    int var124 = this.field527.method215();
                    class36 var125 = class36.method394(var124);
                    int var126 = this.field527.method215();
                    for (int var127 = 0; var127 < var126; ++var127) {
                        var125.field1041[var127] = this.field527.method242(4);
                        int var128 = this.field527.method213();
                        if (var128 == 255) {
                            var128 = this.field527.method248(this.field200);
                        }
                        var125.field1093[var127] = var128;
                    }
                    for (int var129 = var126; var129 < var125.field1041.length; ++var129) {
                        var125.field1041[var129] = 0;
                        var125.field1093[var129] = 0;
                    }
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 139) {
                    int var130 = this.field527.method215();
                    this.method181(var130, false);
                    if (this.field193 != -1) {
                        this.method50(this.field193, 7063);
                        this.field193 = -1;
                        this.field452 = true;
                    }
                    if (this.field272 != -1) {
                        this.method50(this.field272, 7063);
                        this.field272 = -1;
                        this.field271 = true;
                    }
                    if (this.field508 != -1) {
                        this.method50(this.field508, 7063);
                        this.field508 = -1;
                    }
                    if (this.field142 != -1) {
                        this.method50(this.field142, 7063);
                        this.field142 = -1;
                    }
                    if (this.field510 != var130) {
                        this.method50(this.field510, 7063);
                        this.field510 = var130;
                    }
                    if (this.field111 != 0) {
                        this.field111 = 0;
                        this.field452 = true;
                    }
                    this.field394 = true;
                    this.field188 = true;
                    this.field236 = false;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 178) {
                    if (this.field328 == 12) {
                        this.field394 = true;
                    }
                    this.field494 = this.field527.method213();
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 50) {
                    int var131 = this.field527.method241(-12702);
                    this.method181(var131, false);
                    if (this.field510 != -1) {
                        this.method50(this.field510, 7063);
                        this.field510 = -1;
                        this.field394 = true;
                        this.field188 = true;
                    }
                    if (this.field193 != -1) {
                        this.method50(this.field193, 7063);
                        this.field193 = -1;
                        this.field452 = true;
                    }
                    if (this.field272 != -1) {
                        this.method50(this.field272, 7063);
                        this.field272 = -1;
                        this.field271 = true;
                    }
                    if (this.field508 != -1) {
                        this.method50(this.field508, 7063);
                        this.field508 = -1;
                    }
                    if (this.field142 != var131) {
                        this.method50(this.field142, 7063);
                        this.field142 = var131;
                    }
                    if (this.field111 != 0) {
                        this.field111 = 0;
                        this.field452 = true;
                    }
                    this.field236 = false;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 2) {
                    int var132 = this.field527.method215();
                    this.method181(var132, false);
                    if (this.field510 != -1) {
                        this.method50(this.field510, 7063);
                        this.field510 = -1;
                        this.field394 = true;
                        this.field188 = true;
                    }
                    if (this.field272 != -1) {
                        this.method50(this.field272, 7063);
                        this.field272 = -1;
                        this.field271 = true;
                    }
                    if (this.field508 != -1) {
                        this.method50(this.field508, 7063);
                        this.field508 = -1;
                    }
                    if (this.field142 != -1) {
                        this.method50(this.field142, 7063);
                        this.field142 = -1;
                    }
                    if (this.field193 != var132) {
                        this.method50(this.field193, 7063);
                        this.field193 = var132;
                    }
                    this.field236 = false;
                    this.field452 = true;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 233 || this.field436 == 179) {
                    int var133 = this.field476;
                    int var134 = this.field477;
                    if (this.field436 == 233) {
                        var133 = this.field527.method242(4);
                        var134 = this.field527.method241(-12702);
                        this.field498 = false;
                    }
                    if (this.field436 == 179) {
                        var133 = this.field527.method242(4);
                        this.field527.method223(-25838);
                        int var135 = 0;
                        while (true) {
                            if (var135 >= 4) {
                                this.field527.method225(462);
                                var134 = this.field527.method215();
                                this.field498 = true;
                                break;
                            }
                            for (int var136 = 0; var136 < 13; ++var136) {
                                for (int var137 = 0; var137 < 13; ++var137) {
                                    int var138 = this.field527.method224(1, 779);
                                    if (var138 == 1) {
                                        this.field144[var135][var136][var137] = this.field527.method224(26, 779);
                                    } else {
                                        this.field144[var135][var136][var137] = -1;
                                    }
                                }
                            }
                            ++var135;
                        }
                    }
                    if (this.field476 == var133 && this.field477 == var134 && this.field388 == 2) {
                        this.field436 = -1;
                        return true;
                    }
                    this.field476 = var133;
                    this.field477 = var134;
                    this.field96 = (this.field476 - 6) * 8;
                    this.field97 = (this.field477 - 6) * 8;
                    this.field332 = false;
                    if ((this.field476 / 8 == 48 || this.field476 / 8 == 49) && this.field477 / 8 == 48) {
                        this.field332 = true;
                    }
                    if (this.field476 / 8 == 48 && this.field477 / 8 == 148) {
                        this.field332 = true;
                    }
                    this.field388 = 1;
                    this.field353 = System.currentTimeMillis();
                    this.method139((String) null, 4, "Loading - please wait.");
                    if (this.field436 == 233) {
                        int var139 = 0;
                        int var140 = (this.field476 - 6) / 8;
                        label1184: while (true) {
                            if (var140 > (this.field476 + 6) / 8) {
                                this.field66 = new byte[var139][];
                                this.field467 = new byte[var139][];
                                this.field336 = new int[var139];
                                this.field337 = new int[var139];
                                this.field338 = new int[var139];
                                int var142 = 0;
                                int var143 = (this.field476 - 6) / 8;
                                while (true) {
                                    if (var143 > (this.field476 + 6) / 8) {
                                        break label1184;
                                    }
                                    for (int var144 = (this.field477 - 6) / 8; var144 <= (this.field477 + 6) / 8; ++var144) {
                                        this.field336[var142] = (var143 << 8) + var144;
                                        if (this.field332 && (var144 == 49 || var144 == 149 || var144 == 147 || var143 == 50 || var143 == 49 && var144 == 47)) {
                                            this.field337[var142] = -1;
                                            this.field338[var142] = -1;
                                            ++var142;
                                        } else {
                                            int var145 = this.field337[var142] = this.field393.method371(0, var144, 0, var143);
                                            if (var145 != -1) {
                                                this.field393.method366(3, var145);
                                            }
                                            int var146 = this.field338[var142] = this.field393.method371(0, var144, 1, var143);
                                            if (var146 != -1) {
                                                this.field393.method366(3, var146);
                                            }
                                            ++var142;
                                        }
                                    }
                                    ++var143;
                                }
                            }
                            for (int var141 = (this.field477 - 6) / 8; var141 <= (this.field477 + 6) / 8; ++var141) {
                                ++var139;
                            }
                            ++var140;
                        }
                    }
                    if (this.field436 == 179) {
                        int var147 = 0;
                        int[] var148 = new int[676];
                        int var149 = 0;
                        label1145: while (true) {
                            if (var149 >= 4) {
                                this.field66 = new byte[var147][];
                                this.field467 = new byte[var147][];
                                this.field336 = new int[var147];
                                this.field337 = new int[var147];
                                this.field338 = new int[var147];
                                int var157 = 0;
                                while (true) {
                                    if (var157 >= var147) {
                                        break label1145;
                                    }
                                    int var158 = this.field336[var157] = var148[var157];
                                    int var159 = var158 >> 8 & 255;
                                    int var160 = var158 & 255;
                                    int var161 = this.field337[var157] = this.field393.method371(0, var160, 0, var159);
                                    if (var161 != -1) {
                                        this.field393.method366(3, var161);
                                    }
                                    int var162 = this.field338[var157] = this.field393.method371(0, var160, 1, var159);
                                    if (var162 != -1) {
                                        this.field393.method366(3, var162);
                                    }
                                    ++var157;
                                }
                            }
                            for (int var150 = 0; var150 < 13; ++var150) {
                                for (int var151 = 0; var151 < 13; ++var151) {
                                    int var152 = this.field144[var149][var150][var151];
                                    if (var152 != -1) {
                                        int var153 = var152 >> 14 & 1023;
                                        int var154 = var152 >> 3 & 2047;
                                        int var155 = (var153 / 8 << 8) + var154 / 8;
                                        for (int var156 = 0; var156 < var147; ++var156) {
                                            if (var148[var156] == var155) {
                                                var155 = -1;
                                                break;
                                            }
                                        }
                                        if (var155 != -1) {
                                            var148[var147++] = var155;
                                        }
                                    }
                                }
                            }
                            ++var149;
                        }
                    }
                    int var163 = this.field96 - this.field98;
                    int var164 = this.field97 - this.field99;
                    this.field98 = this.field96;
                    this.field99 = this.field97;
                    for (int var165 = 0; var165 < 16384; ++var165) {
                        class59 var166 = this.field473[var165];
                        if (var166 != null) {
                            for (int var167 = 0; var167 < 10; ++var167) {
                                var166.field1258[var167] -= var163;
                                var166.field1259[var167] -= var164;
                            }
                            var166.field1255 -= var163 * 128;
                            var166.field1256 -= var164 * 128;
                        }
                    }
                    for (int var168 = 0; var168 < this.field531; ++var168) {
                        class66 var169 = this.field533[var168];
                        if (var169 != null) {
                            for (int var170 = 0; var170 < 10; ++var170) {
                                var169.field1258[var170] -= var163;
                                var169.field1259[var170] -= var164;
                            }
                            var169.field1255 -= var163 * 128;
                            var169.field1256 -= var164 * 128;
                        }
                    }
                    this.field373 = true;
                    byte var171 = 0;
                    byte var172 = 104;
                    byte var173 = 1;
                    if (var163 < 0) {
                        var171 = 103;
                        var172 = -1;
                        var173 = -1;
                    }
                    byte var174 = 0;
                    byte var175 = 104;
                    byte var176 = 1;
                    if (var164 < 0) {
                        var174 = 103;
                        var175 = -1;
                        var176 = -1;
                    }
                    for (int var177 = var171; var172 != var177; var177 += var173) {
                        for (int var178 = var174; var175 != var178; var178 += var176) {
                            int var179 = var163 + var177;
                            int var180 = var164 + var178;
                            for (int var181 = 0; var181 < 4; ++var181) {
                                if (var179 >= 0 && var180 >= 0 && var179 < 104 && var180 < 104) {
                                    this.field278[var181][var177][var178] = this.field278[var181][var179][var180];
                                } else {
                                    this.field278[var181][var177][var178] = null;
                                }
                            }
                        }
                    }
                    for (class8 var182 = (class8) this.field427.method422(); var182 != null; var182 = (class8) this.field427.method424(false)) {
                        var182.field569 -= var163;
                        var182.field570 -= var164;
                        if (var182.field569 < 0 || var182.field570 < 0 || var182.field569 >= 104 || var182.field570 >= 104) {
                            var182.method418();
                        }
                    }
                    if (this.field446 != 0) {
                        this.field446 -= var163;
                        this.field447 -= var164;
                    }
                    this.field329 = false;
                    this.field436 = -1;
                    return true;
                }
                if (this.field436 == 141) {
                    int var183 = this.field527.method213();
                    int var184 = this.field527.method213();
                    int var185 = this.field527.method213();
                    int var186 = this.field527.method213();
                    this.field349[var183] = true;
                    this.field479[var183] = var184;
                    this.field529[var183] = var185;
                    this.field540[var183] = var186;
                    this.field156[var183] = 0;
                    this.field436 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field436 + "," + this.field435 + " - " + this.field134 + "," + this.field135);
                this.method138(false);
            } catch (IOException var191) {
                this.method53(true);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field436 + "," + this.field134 + "," + this.field135 + " - " + this.field435 + "," + (field89.field1258[0] + this.field96) + "," + (field89.field1259[0] + this.field97) + " - ";
                for (int var189 = 0; var189 < this.field435 && var189 < 50; ++var189) {
                    var188 = var188 + this.field527.field642[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method138(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method70(byte arg0) {
        if (arg0 != 28) {
            this.field350 = -109;
        }
        if (this.field367 == 0) {
            int var2 = super.field587 / 2 - 80;
            int var3 = super.field588 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field603 == 1 && super.field604 >= var2 - 75 && super.field604 <= var2 + 75 && super.field605 >= var14 - 20 && super.field605 <= var14 + 20) {
                this.field367 = 3;
                this.field330 = 0;
            }
            int var4 = super.field587 / 2 + 80;
            if (super.field603 == 1 && super.field604 >= var4 - 75 && super.field604 <= var4 + 75 && super.field605 >= var14 - 20 && super.field605 <= var14 + 20) {
                this.field453 = "";
                this.field454 = "Enter your username & password.";
                this.field367 = 2;
                this.field330 = 0;
            }
        } else if (this.field367 == 2) {
            int var5 = super.field588 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field603 == 1 && super.field605 >= var16 - 15 && super.field605 < var16) {
                this.field330 = 0;
            }
            var5 = var16 + 15;
            if (super.field603 == 1 && super.field605 >= var5 - 15 && super.field605 < var5) {
                this.field330 = 1;
            }
            var5 += 15;
            int var6 = super.field587 / 2 - 80;
            int var7 = super.field588 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field603 == 1 && super.field604 >= var6 - 75 && super.field604 <= var6 + 75 && super.field605 >= var17 - 20 && super.field605 <= var17 + 20) {
                this.field147 = 0;
                this.method41(this.field105, this.field106, false);
                if (this.field281) {
                    return;
                }
            }
            int var8 = super.field587 / 2 + 80;
            if (super.field603 == 1 && super.field604 >= var8 - 75 && super.field604 <= var8 + 75 && super.field605 >= var17 - 20 && super.field605 <= var17 + 20) {
                this.field367 = 0;
                this.field105 = "";
                this.field106 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method193(0);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field387.length(); ++var11) {
                        if (var9 == field387.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field330 == 0) {
                        if (var9 == 8 && this.field105.length() > 0) {
                            this.field105 = this.field105.substring(0, this.field105.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field330 = 1;
                        }
                        if (var10) {
                            this.field105 = this.field105 + (char) var9;
                        }
                        if (this.field105.length() > 12) {
                            this.field105 = this.field105.substring(0, 12);
                        }
                    } else if (this.field330 == 1) {
                        if (var9 == 8 && this.field106.length() > 0) {
                            this.field106 = this.field106.substring(0, this.field106.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field330 = 0;
                        }
                        if (var10) {
                            this.field106 = this.field106 + (char) var9;
                        }
                        if (this.field106.length() > 20) {
                            this.field106 = this.field106.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field367 == 3) {
                int var12 = super.field587 / 2;
                int var13 = super.field588 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field603 == 1 && super.field604 >= var12 - 75 && super.field604 <= var12 + 75 && super.field605 >= var18 - 20 && super.field605 <= var18 + 20) {
                    this.field367 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZILPCARWQQC;I)V")
    public final void method71(int arg0, boolean arg1, int arg2, class36 arg3, int arg4) {
        if (arg3.field1082 == 0 && arg3.field1048 != null) {
            if (!arg3.field1033 || this.field450 == arg3.field1052 || this.field247 == arg3.field1052 || this.field202 == arg3.field1052) {
                int var6 = class5.field50;
                int var7 = class5.field48;
                int var8 = class5.field51;
                int var9 = class5.field49;
                class5.method30(arg3.field1095 + arg4, arg4, arg0, arg3.field1105 + arg0, false);
                int var10 = arg3.field1048.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field1067[var11] + arg0;
                    int var13 = arg3.field1069[var11] + arg4 - arg2;
                    class36 var14 = class36.method394(arg3.field1048[var11]);
                    int var15 = var14.field1051 + var12;
                    int var16 = var14.field1103 + var13;
                    if (var14.field1061 > 0) {
                        this.method159((byte) 90, var14);
                    }
                    if (var14.field1082 == 0) {
                        if (var14.field1063 > var14.field1087 - var14.field1095) {
                            var14.field1063 = var14.field1087 - var14.field1095;
                        }
                        if (var14.field1063 < 0) {
                            var14.field1063 = 0;
                        }
                        this.method71(var15, true, var14.field1063, var14, var16);
                        if (var14.field1087 > var14.field1095) {
                            this.method97(var14.field1063, var14.field1105 + var15, var14.field1095, 6, var16, var14.field1087);
                        }
                    } else if (var14.field1082 != 1) {
                        if (var14.field1082 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1095; ++var18) {
                                for (int var19 = 0; var19 < var14.field1105; ++var19) {
                                    int var20 = (var14.field1111 + 32) * var19 + var15;
                                    int var21 = (var14.field1090 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1106[var17];
                                        var21 += var14.field1107[var17];
                                    }
                                    if (var14.field1041[var17] <= 0) {
                                        if (var14.field1056 != null && var17 < 20) {
                                            class27 var30 = var14.field1056[var17];
                                            if (var30 != null) {
                                                var30.method318(233, var20, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1041[var17] - 1;
                                        if (var20 > class5.field50 - 32 && var20 < class5.field51 && var21 > class5.field48 - 32 && var21 < class5.field49 || this.field401 != 0 && this.field400 == var17) {
                                            int var25 = 0;
                                            if (this.field113 == 1 && this.field114 == var17 && this.field115 == var14.field1052) {
                                                var25 = 16777215;
                                            }
                                            class27 var26 = class34.method386(var24, var14.field1093[var17], var25, 33840);
                                            if (var26 != null) {
                                                if (this.field401 != 0 && this.field400 == var17 && this.field399 == var14.field1052) {
                                                    var22 = super.field597 - this.field402;
                                                    var23 = super.field598 - this.field403;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field356 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method320(128, var21 + var23, 245, var20 + var22);
                                                    if (var21 + var23 < class5.field48 && arg3.field1063 > 0) {
                                                        int var27 = (class5.field48 - var21 - var23) * this.field354 / 3;
                                                        if (var27 > this.field354 * 10) {
                                                            var27 = this.field354 * 10;
                                                        }
                                                        if (var27 > arg3.field1063) {
                                                            var27 = arg3.field1063;
                                                        }
                                                        arg3.field1063 -= var27;
                                                        this.field403 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class5.field49 && arg3.field1063 < arg3.field1087 - arg3.field1095) {
                                                        int var28 = (var21 + var23 + 32 - class5.field49) * this.field354 / 3;
                                                        if (var28 > this.field354 * 10) {
                                                            var28 = this.field354 * 10;
                                                        }
                                                        if (var28 > arg3.field1087 - arg3.field1095 - arg3.field1063) {
                                                            var28 = arg3.field1087 - arg3.field1095 - arg3.field1063;
                                                        }
                                                        arg3.field1063 += var28;
                                                        this.field403 -= var28;
                                                    }
                                                } else if (this.field553 != 0 && this.field552 == var17 && this.field551 == var14.field1052) {
                                                    var26.method320(128, var21, 245, var20);
                                                } else {
                                                    var26.method318(233, var20, var21);
                                                }
                                                if (var26.field801 == 33 || var14.field1093[var17] != 1) {
                                                    int var29 = var14.field1093[var17];
                                                    this.field405.method17(779, method87(var29, false), var20 + 1 + var22, var21 + 10 + var23, 0);
                                                    this.field405.method17(779, method87(var29, false), var20 + var22, var21 + 9 + var23, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1082 == 3) {
                            boolean var31 = false;
                            if (this.field202 == var14.field1052 || this.field247 == var14.field1052 || this.field450 == var14.field1052) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method74((byte) 7, var14)) {
                                var32 = var14.field1102;
                                if (var31 && var14.field1070 != 0) {
                                    var32 = var14.field1070;
                                }
                            } else {
                                var32 = var14.field1043;
                                if (var31 && var14.field1072 != 0) {
                                    var32 = var14.field1072;
                                }
                            }
                            if (var14.field1038 == 0) {
                                if (var14.field1065) {
                                    class5.method33(var15, var32, var16, var14.field1095, this.field350, var14.field1105);
                                } else {
                                    class5.method34(var14.field1105, var14.field1095, var32, var15, var16, true);
                                }
                            } else if (var14.field1065) {
                                class5.method32(20, var15, var14.field1105, var14.field1095, var32, 256 - (var14.field1038 & 255), var16);
                            } else {
                                class5.method35(var15, var14.field1105, var14.field1095, 256 - (var14.field1038 & 255), var16, this.field145, var32);
                            }
                        } else if (var14.field1082 == 4) {
                            class4 var33 = var14.field1035;
                            String var34 = var14.field1104;
                            boolean var35 = false;
                            if (this.field202 == var14.field1052 || this.field247 == var14.field1052 || this.field450 == var14.field1052) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method74((byte) 7, var14)) {
                                var36 = var14.field1102;
                                if (var35 && var14.field1070 != 0) {
                                    var36 = var14.field1070;
                                }
                                if (var14.field1059.length() > 0) {
                                    var34 = var14.field1059;
                                }
                            } else {
                                var36 = var14.field1043;
                                if (var35 && var14.field1072 != 0) {
                                    var36 = var14.field1072;
                                }
                            }
                            if (var14.field1064 == 6 && this.field236) {
                                var34 = "Please wait...";
                                var36 = var14.field1043;
                            }
                            if (class5.field46 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field36 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label398: while (true) {
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
                                                                            break label398;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method133(this.method168((byte) -7, var14, 4), 9) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method133(this.method168((byte) -7, var14, 3), 9) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method133(this.method168((byte) -7, var14, 2), 9) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method133(this.method168((byte) -7, var14, 1), 9) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method133(this.method168((byte) -7, var14, 0), 9) + var34.substring(var38 + 2);
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
                                if (var14.field1034) {
                                    var33.method14(var14.field1045, var14.field1105 / 2 + var15, 2, var44, var37, var36);
                                } else {
                                    var33.method21(var15, var37, var14.field1045, (byte) 6, var44, var36);
                                }
                                var37 += var33.field36;
                            }
                        } else if (var14.field1082 == 5) {
                            class27 var45;
                            if (this.method74((byte) 7, var14)) {
                                var45 = var14.field1096;
                            } else {
                                var45 = var14.field1066;
                            }
                            if (var45 != null) {
                                var45.method318(233, var15, var16);
                            }
                        } else if (var14.field1082 == 6) {
                            int var46 = class71.field1725;
                            int var47 = class71.field1726;
                            class71.field1725 = var14.field1105 / 2 + var15;
                            class71.field1726 = var14.field1095 / 2 + var16;
                            int var48 = class71.field1729[var14.field1085] * var14.field1084 >> 16;
                            int var49 = class71.field1730[var14.field1085] * var14.field1084 >> 16;
                            boolean var50 = this.method74((byte) 7, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field1040;
                            } else {
                                var51 = var14.field1039;
                            }
                            class28 var52;
                            if (var51 == -1) {
                                var52 = var14.method398(9, -1, -1, var50);
                            } else {
                                class37 var53 = class37.field1113[var51];
                                var52 = var14.method398(9, var53.field1115[var14.field1037], var53.field1116[var14.field1037], var50);
                            }
                            if (var52 != null) {
                                var52.method351(0, var14.field1086, 0, var14.field1085, 0, var48, var49);
                            }
                            class71.field1725 = var46;
                            class71.field1726 = var47;
                        } else {
                            if (var14.field1082 == 7) {
                                class4 var54 = var14.field1035;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1095; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1105; ++var57) {
                                        if (var14.field1041[var55] > 0) {
                                            class34 var58 = class34.method390(var14.field1041[var55] - 1);
                                            String var59 = String.valueOf(var58.field985);
                                            if (var58.field1012 || var14.field1093[var55] != 1) {
                                                var59 = var59 + " x" + method137(var14.field1093[var55], 0);
                                            }
                                            int var60 = (var14.field1111 + 115) * var57 + var15;
                                            int var61 = (var14.field1090 + 12) * var56 + var16;
                                            if (var14.field1034) {
                                                var54.method14(var14.field1045, var14.field1105 / 2 + var60, 2, var59, var61, var14.field1043);
                                            } else {
                                                var54.method21(var60, var61, var14.field1045, (byte) 6, var59, var14.field1043);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1082 == 8 && (this.field465 == var14.field1052 || this.field275 == var14.field1052 || this.field333 == var14.field1052) && this.field109 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class4 var64 = this.field406;
                                String var65 = var14.field1104;
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
                                    int var74 = var64.method15(false, var73);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field36 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1105 + var15 - 5 - var62;
                                int var67 = var14.field1095 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg3.field1105 + arg0) {
                                    var66 = arg3.field1105 + arg0 - var62;
                                }
                                if (var63 + var67 > arg3.field1095 + arg4) {
                                    var67 = arg3.field1095 + arg4 - var63;
                                }
                                class5.method33(var66, 16777120, var67, var63, this.field350, var62);
                                class5.method34(var62, var63, 0, var66, var67, true);
                                String var68 = var14.field1104;
                                int var69 = var64.field36 + var67 + 2;
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
                                    var64.method21(var66 + 3, var69, false, (byte) 6, var71, 0);
                                    var69 += var64.field36 + 1;
                                }
                            }
                        }
                    }
                }
                if (!arg1) {
                    field386 = !field386;
                }
                class5.method30(var9, var7, var6, var8, false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method72(int arg0) {
        int var2 = 71 / arg0;
        if (this.field530 > 1) {
            --this.field530;
        }
        if (this.field439 > 0) {
            --this.field439;
        }
        for (int var3 = 0; var3 < 5 && this.method69(-43764); ++var3) {
        }
        if (this.field281) {
            Object var4 = this.field543.field677;
            synchronized (this.field543.field677) {
                if (!field138) {
                    this.field543.field680 = 0;
                } else if (super.field603 != 0 || this.field543.field680 >= 40) {
                    this.field132.method202((byte) 64, 124);
                    this.field132.method203(0);
                    int var5 = this.field132.field643;
                    int var6 = 0;
                    for (int var7 = 0; var7 < this.field543.field680 && var5 - this.field132.field643 < 240; ++var7) {
                        ++var6;
                        int var8 = this.field543.field676[var7];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 502) {
                            var8 = 502;
                        }
                        int var9 = this.field543.field678[var7];
                        if (var9 < 0) {
                            var9 = 0;
                        } else if (var9 > 764) {
                            var9 = 764;
                        }
                        int var10 = var8 * 765 + var9;
                        if (this.field543.field676[var7] == -1 && this.field543.field678[var7] == -1) {
                            var9 = -1;
                            var8 = -1;
                            var10 = 524287;
                        }
                        if (this.field232 == var9 && this.field233 == var8) {
                            if (this.field357 < 2047) {
                                ++this.field357;
                            }
                        } else {
                            int var11 = var9 - this.field232;
                            this.field232 = var9;
                            int var12 = var8 - this.field233;
                            this.field233 = var8;
                            if (this.field357 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                var11 += 32;
                                var12 += 32;
                                this.field132.method204((this.field357 << 12) + (var11 << 6) + var12);
                                this.field357 = 0;
                            } else if (this.field357 < 8) {
                                this.field132.method206((this.field357 << 19) + 8388608 + var10);
                                this.field357 = 0;
                            } else {
                                this.field132.method207((this.field357 << 19) + -1073741824 + var10);
                                this.field357 = 0;
                            }
                        }
                    }
                    this.field132.method212(false, this.field132.field643 - var5);
                    if (var6 >= this.field543.field680) {
                        this.field543.field680 = 0;
                    } else {
                        this.field543.field680 -= var6;
                        for (int var13 = 0; var13 < this.field543.field680; ++var13) {
                            this.field543.field678[var13] = this.field543.field678[var6 + var13];
                            this.field543.field676[var13] = this.field543.field676[var6 + var13];
                        }
                    }
                }
            }
            if (super.field603 != 0) {
                long var14 = (super.field606 - this.field358) / 50L;
                if (var14 > 4095L) {
                    var14 = 4095L;
                }
                this.field358 = super.field606;
                int var16 = super.field605;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 502) {
                    var16 = 502;
                }
                int var17 = super.field604;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 764) {
                    var17 = 764;
                }
                int var18 = var16 * 765 + var17;
                byte var19 = 0;
                if (super.field603 == 2) {
                    var19 = 1;
                }
                int var20 = (int) var14;
                this.field132.method202((byte) 64, 144);
                this.field132.method247(902, (var19 << 19) + (var20 << 20) + var18);
            }
            if (this.field213 > 0) {
                --this.field213;
            }
            if (super.field607[1] == 1 || super.field607[2] == 1 || super.field607[3] == 1 || super.field607[4] == 1) {
                this.field214 = true;
            }
            if (this.field214 && this.field213 <= 0) {
                this.field213 = 20;
                this.field214 = false;
                this.field132.method202((byte) 64, 29);
                this.field132.method239(this.field369, -14191);
                this.field132.method204(this.field368);
            }
            if (super.field594 && !this.field542) {
                this.field542 = true;
                this.field132.method202((byte) 64, 40);
                this.field132.method203(1);
            }
            if (!super.field594 && this.field542) {
                this.field542 = false;
                this.field132.method202((byte) 64, 40);
                this.field132.method203(0);
            }
            this.method127(0);
            this.method153(-13170);
            this.method173(-21554);
            ++this.field437;
            if (this.field437 > 750) {
                this.method53(true);
            }
            this.method95(this.field331);
            this.method78((byte) 3);
            this.method91((byte) -7);
            ++this.field354;
            if (this.field398 != 0) {
                this.field397 += 20;
                if (this.field397 >= 400) {
                    this.field398 = 0;
                }
            }
            if (this.field553 != 0) {
                ++this.field550;
                if (this.field550 >= 15) {
                    if (this.field553 == 2) {
                        this.field394 = true;
                    }
                    if (this.field553 == 3) {
                        this.field452 = true;
                    }
                    this.field553 = 0;
                }
            }
            if (this.field401 != 0) {
                ++this.field356;
                if (super.field597 > this.field402 + 5 || super.field597 < this.field402 - 5 || super.field598 > this.field403 + 5 || super.field598 < this.field403 - 5) {
                    this.field74 = true;
                }
                if (super.field596 == 0) {
                    if (this.field401 == 2) {
                        this.field394 = true;
                    }
                    if (this.field401 == 3) {
                        this.field452 = true;
                    }
                    this.field401 = 0;
                    if (this.field74 && this.field356 >= 5) {
                        this.field415 = -1;
                        this.method88(133);
                        if (this.field415 == this.field399 && this.field414 != this.field400) {
                            class36 var21 = class36.method394(this.field399);
                            byte var22 = 0;
                            if (this.field499 == 1 && var21.field1061 == 206) {
                                var22 = 1;
                            }
                            if (var21.field1041[this.field414] <= 0) {
                                var22 = 0;
                            }
                            if (var21.field1058) {
                                int var23 = this.field400;
                                int var24 = this.field414;
                                var21.field1041[var24] = var21.field1041[var23];
                                var21.field1093[var24] = var21.field1093[var23];
                                var21.field1041[var23] = -1;
                                var21.field1093[var23] = 0;
                            } else if (var22 == 1) {
                                int var25 = this.field400;
                                int var26 = this.field414;
                                while (var25 != var26) {
                                    if (var25 > var26) {
                                        var21.method402(var25, var25 - 1, -44561);
                                        --var25;
                                    } else if (var25 < var26) {
                                        var21.method402(var25, var25 + 1, -44561);
                                        ++var25;
                                    }
                                }
                            } else {
                                var21.method402(this.field400, this.field414, -44561);
                            }
                            this.field132.method202((byte) 64, 162);
                            this.field132.method238(this.field414, (byte) 102);
                            this.field132.method238(this.field399, (byte) 102);
                            this.field132.method238(this.field400, (byte) 102);
                            this.field132.method231(0, var22);
                        }
                    } else if ((this.field303 == 1 || this.method178(this.field428 - 1, 984)) && this.field428 > 2) {
                        this.method54(-34918);
                    } else if (this.field428 > 0) {
                        this.method90((byte) 7, this.field428 - 1);
                    }
                    this.field550 = 10;
                    super.field603 = 0;
                }
            }
            ++field389;
            if (field389 > 1660) {
                field389 = 0;
                this.field132.method202((byte) 64, 226);
                this.field132.method203(0);
                int var27 = this.field132.field643;
                this.field132.method204(39982);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field132.method203(167);
                }
                this.field132.method203((int) (Math.random() * 256.0D));
                this.field132.method204((int) (Math.random() * 65536.0D));
                this.field132.method204((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field132.method203(156);
                }
                this.field132.method203(6);
                this.field132.method204((int) (Math.random() * 65536.0D));
                this.field132.method203(101);
                this.field132.method204(17446);
                this.field132.method212(false, this.field132.field643 - var27);
            }
            if (class63.field1568 != -1) {
                int var28 = class63.field1568;
                int var29 = class63.field1569;
                boolean var30 = this.method164(var29, 0, 0, 0, 0, field89.field1259[0], field89.field1258[0], true, var28, (byte) -85, 0, 0);
                class63.field1568 = -1;
                if (var30) {
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 1;
                    this.field397 = 0;
                }
            }
            if (super.field603 == 1 && this.field412 != null) {
                this.field412 = null;
                this.field452 = true;
                super.field603 = 0;
            }
            this.method166(9);
            if (this.field272 == -1) {
                this.method43(370);
                this.method96(this.field422);
                this.method102(869);
            }
            if (super.field596 == 1 || super.field603 == 1) {
                ++this.field231;
            }
            if (this.field465 == 0 && this.field275 == 0 && this.field333 == 0) {
                if (this.field109 > 0) {
                    --this.field109;
                }
            } else if (this.field109 < 100) {
                ++this.field109;
                if (this.field109 == 100) {
                    if (this.field465 != 0) {
                        this.field452 = true;
                    }
                    if (this.field275 != 0) {
                        this.field394 = true;
                    }
                }
            }
            if (this.field388 == 2) {
                this.method167(-3265);
            }
            if (this.field388 == 2 && this.field329) {
                this.method65(false);
            }
            for (int var31 = 0; var31 < 5; ++var31) {
                int var10002 = this.field156[var31]++;
            }
            this.method77(12942);
            ++field557;
            if (field557 > 99) {
                field557 = 0;
                this.field132.method202((byte) 64, 252);
            }
            ++super.field595;
            if (super.field595 > 4500) {
                this.field439 = 250;
                super.field595 -= 500;
                this.field132.method202((byte) 64, 245);
            }
            ++this.field237;
            if (this.field237 > 500) {
                this.field237 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field124 += this.field125;
                }
                if ((var32 & 2) == 2) {
                    this.field461 += this.field462;
                }
                if ((var32 & 4) == 4) {
                    this.field374 += this.field375;
                }
            }
            if (this.field124 < -50) {
                this.field125 = 2;
            }
            if (this.field124 > 50) {
                this.field125 = -2;
            }
            if (this.field461 < -55) {
                this.field462 = 2;
            }
            if (this.field461 > 55) {
                this.field462 = -2;
            }
            if (this.field374 < -40) {
                this.field375 = 1;
            }
            if (this.field374 > 40) {
                this.field375 = -1;
            }
            ++this.field270;
            if (this.field270 > 500) {
                this.field270 = 0;
                int var33 = (int) (Math.random() * 8.0D);
                if ((var33 & 1) == 1) {
                    this.field429 += this.field430;
                }
                if ((var33 & 2) == 2) {
                    this.field197 += this.field198;
                }
            }
            if (this.field429 < -60) {
                this.field430 = 2;
            }
            if (this.field429 > 60) {
                this.field430 = -2;
            }
            if (this.field197 < -20) {
                this.field198 = 1;
            }
            if (this.field197 > 10) {
                this.field198 = -1;
            }
            ++this.field438;
            if (this.field438 > 50) {
                this.field132.method202((byte) 64, 225);
            }
            try {
                if (this.field351 != null && this.field132.field643 > 0) {
                    this.field351.method460(this.field132.field643, this.field249, this.field132.field642, 0);
                    this.field132.field643 = 0;
                    this.field438 = 0;
                }
            } catch (IOException var35) {
                this.method53(true);
            } catch (Exception var36) {
                this.method138(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method73(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLPCARWQQC;)Z")
    public final boolean method74(byte arg0, class36 arg1) {
        if (arg0 != 7) {
            this.field436 = this.field527.method213();
        }
        if (arg1.field1055 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1055.length; ++var3) {
                int var4 = this.method168((byte) -7, arg1, var3);
                int var5 = arg1.field1060[var3];
                if (arg1.field1055[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1055[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1055[var3] == 4) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method75(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field292 >= 100) {
                this.method177("Your ignore list is full. Max of 100 hit", "", 0, 20045);
            } else {
                String var4 = class51.method449(class51.method446(arg0, (byte) 5), 78);
                for (int var5 = 0; var5 < this.field292; ++var5) {
                    if (this.field157[var5] == arg0) {
                        this.method177(var4 + " is already on your ignore list", "", 0, 20045);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field241; ++var6) {
                    if (this.field101[var6] == arg0) {
                        this.method177("Please remove " + var4 + " from your friend list first", "", 0, 20045);
                        return;
                    }
                }
                this.field157[this.field292++] = arg0;
                int var7 = 90 / arg1;
                this.field394 = true;
                this.field132.method202((byte) 64, 82);
                this.field132.method209(arg0, (byte) 7);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method76(String arg0) throws IOException {
        if (!this.field416) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field366 != null) {
                try {
                    this.field366.close();
                } catch (Exception var4) {
                }
                this.field366 = null;
            }
            this.field366 = this.method73(43595);
            this.field366.setSoTimeout(10000);
            InputStream var2 = this.field366.getInputStream();
            OutputStream var3 = this.field366.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method77(int arg0) {
        if (arg0 != 12942) {
            this.field228 = -377;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method193(0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field142 != -1 && this.field554 == this.field142) {
                        if (var2 == 8 && this.field244.length() > 0) {
                            this.field244 = this.field244.substring(0, this.field244.length() - 1);
                        }
                        break;
                    }
                    if (this.field346) {
                        if (var2 >= 32 && var2 <= 122 && this.field308.length() < 80) {
                            this.field308 = this.field308 + (char) var2;
                            this.field452 = true;
                        }
                        if (var2 == 8 && this.field308.length() > 0) {
                            this.field308 = this.field308.substring(0, this.field308.length() - 1);
                            this.field452 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field346 = false;
                            this.field452 = true;
                            if (this.field493 == 1) {
                                long var3 = class51.method445(this.field308);
                                this.method111((byte) 8, var3);
                            }
                            if (this.field493 == 2 && this.field241 > 0) {
                                long var5 = class51.method445(this.field308);
                                this.method55(this.field466, var5);
                            }
                            if (this.field493 == 3 && this.field308.length() > 0) {
                                this.field132.method202((byte) 64, 201);
                                this.field132.method203(0);
                                int var7 = this.field132.field643;
                                this.field132.method209(this.field361, (byte) 7);
                                class50.method443(this.field308, 0, this.field132);
                                this.field132.method212(false, this.field132.field643 - var7);
                                this.field308 = class50.method444(this.field308, true);
                                this.field308 = class17.method264(this.field308, true);
                                this.method177(this.field308, class51.method449(class51.method446(this.field361, (byte) 5), 78), 6, 20045);
                                if (this.field460 == 2) {
                                    this.field460 = 1;
                                    this.field171 = true;
                                    this.field132.method202((byte) 64, 206);
                                    this.field132.method203(this.field334);
                                    this.field132.method203(this.field460);
                                    this.field132.method203(this.field484);
                                }
                            }
                            if (this.field493 == 4 && this.field292 < 100) {
                                long var8 = class51.method445(this.field308);
                                this.method75(var8, 731);
                            }
                            if (this.field493 == 5 && this.field292 > 0) {
                                long var10 = class51.method445(this.field308);
                                this.method141(var10, (byte) -63);
                            }
                        }
                    } else if (this.field111 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field297.length() < 10) {
                            this.field297 = this.field297 + (char) var2;
                            this.field452 = true;
                        }
                        if (var2 == 8 && this.field297.length() > 0) {
                            this.field297 = this.field297.substring(0, this.field297.length() - 1);
                            this.field452 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field297.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field297);
                                } catch (Exception var22) {
                                }
                                this.field132.method202((byte) 64, 172);
                                this.field132.method207(var12);
                            }
                            this.field111 = 0;
                            this.field452 = true;
                        }
                    } else if (this.field111 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field297.length() < 12) {
                            this.field297 = this.field297 + (char) var2;
                            this.field452 = true;
                        }
                        if (var2 == 8 && this.field297.length() > 0) {
                            this.field297 = this.field297.substring(0, this.field297.length() - 1);
                            this.field452 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field297.length() > 0) {
                                this.field132.method202((byte) 64, 3);
                                this.field132.method209(class51.method445(this.field297), (byte) 7);
                            }
                            this.field111 = 0;
                            this.field452 = true;
                        }
                    } else if (this.field111 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field297.length() < 40) {
                            this.field297 = this.field297 + (char) var2;
                            this.field452 = true;
                        }
                        if (var2 == 8 && this.field297.length() > 0) {
                            this.field297 = this.field297.substring(0, this.field297.length() - 1);
                            this.field452 = true;
                        }
                    } else if (this.field193 == -1 && this.field272 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field70.length() < 80) {
                            this.field70 = this.field70 + (char) var2;
                            this.field452 = true;
                        }
                        if (var2 == 8 && this.field70.length() > 0) {
                            this.field70 = this.field70.substring(0, this.field70.length() - 1);
                            this.field452 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field70.length() > 0) {
                            if (this.field181 == 2) {
                                if (this.field70.equals("::clientdrop")) {
                                    this.method53(true);
                                }
                                if (this.field70.equals("::lag")) {
                                    this.method108(this.field225);
                                }
                                if (this.field70.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field393.method359((byte) -58, 2); ++var13) {
                                        this.field393.method365(2, (byte) 1, var13, 55);
                                    }
                                }
                                if (this.field70.equals("::fpson")) {
                                    field238 = true;
                                }
                                if (this.field70.equals("::fpsoff")) {
                                    field238 = false;
                                }
                                if (this.field70.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field339[var14].field1716[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field70.startsWith("::")) {
                                this.field132.method202((byte) 64, 153);
                                this.field132.method203(this.field70.length() - 1);
                                this.field132.method210(this.field70.substring(2));
                            } else {
                                String var17 = this.field70.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field70 = this.field70.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field70 = this.field70.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field70 = this.field70.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field70 = this.field70.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field70 = this.field70.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field70 = this.field70.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field70 = this.field70.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field70 = this.field70.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field70 = this.field70.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field70 = this.field70.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field70 = this.field70.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field70 = this.field70.substring(6);
                                }
                                String var19 = this.field70.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field70 = this.field70.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field70 = this.field70.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field70 = this.field70.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field70 = this.field70.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field70 = this.field70.substring(6);
                                }
                                this.field132.method202((byte) 64, 57);
                                this.field132.method203(0);
                                int var21 = this.field132.field643;
                                this.field132.method230(false, var20);
                                this.field132.method229(var18, 0);
                                this.field472.field643 = 0;
                                class50.method443(this.field70, 0, this.field472);
                                this.field132.method251(0, this.field472.field643, this.field472.field642, (byte) 7);
                                this.field132.method212(false, this.field132.field643 - var21);
                                this.field70 = class50.method444(this.field70, true);
                                this.field70 = class17.method264(this.field70, true);
                                field89.field1275 = this.field70;
                                field89.field1285 = var18;
                                field89.field1295 = var20;
                                field89.field1298 = 150;
                                if (this.field181 == 2) {
                                    this.method177(field89.field1275, "@cr2@" + field89.field1642, 2, 20045);
                                } else if (this.field181 == 1) {
                                    this.method177(field89.field1275, "@cr1@" + field89.field1642, 2, 20045);
                                } else {
                                    this.method177(field89.field1275, field89.field1642, 2, 20045);
                                }
                                if (this.field334 == 2) {
                                    this.field334 = 3;
                                    this.field171 = true;
                                    this.field132.method202((byte) 64, 206);
                                    this.field132.method203(this.field334);
                                    this.field132.method203(this.field460);
                                    this.field132.method203(this.field484);
                                }
                            }
                            this.field70 = "";
                            this.field452 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field244.length() < 12) {
                this.field244 = this.field244 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            field386 = !field386;
        }
        for (int var3 = 0; var3 < this.field474; ++var3) {
            int var4 = this.field475[var3];
            class59 var5 = this.field473[var4];
            if (var5 != null) {
                this.method79(45950, var5.field1505.field1368, var5);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILQQSLPTGQ;)V")
    public final void method79(int arg0, int arg1, class45 arg2) {
        if (arg2.field1255 < 128 || arg2.field1256 < 128 || arg2.field1255 >= 13184 || arg2.field1256 >= 13184) {
            arg2.field1279 = -1;
            arg2.field1250 = -1;
            arg2.field1264 = 0;
            arg2.field1265 = 0;
            arg2.field1255 = arg2.field1258[0] * 128 + arg2.field1269 * 64;
            arg2.field1256 = arg2.field1259[0] * 128 + arg2.field1269 * 64;
            arg2.method429(-833);
        }
        if (field89 == arg2 && (arg2.field1255 < 1536 || arg2.field1256 < 1536 || arg2.field1255 >= 11776 || arg2.field1256 >= 11776)) {
            arg2.field1279 = -1;
            arg2.field1250 = -1;
            arg2.field1264 = 0;
            arg2.field1265 = 0;
            arg2.field1255 = arg2.field1258[0] * 128 + arg2.field1269 * 64;
            arg2.field1256 = arg2.field1259[0] * 128 + arg2.field1269 * 64;
            arg2.method429(-833);
        }
        if (arg2.field1264 > field282) {
            this.method80(arg2, true);
        } else if (arg2.field1265 >= field282) {
            this.method81(arg2, false);
        } else {
            this.method82(arg2, -30605);
        }
        this.method83((byte) 2, arg2);
        if (arg0 != 45950) {
            this.field436 = -1;
        }
        this.method84(arg2, 440);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQQSLPTGQ;Z)V")
    public final void method80(class45 arg0, boolean arg1) {
        int var3 = arg0.field1264 - field282;
        this.field281 &= arg1;
        int var4 = arg0.field1269 * 64 + arg0.field1260 * 128;
        int var5 = arg0.field1269 * 64 + arg0.field1262 * 128;
        arg0.field1255 += (var4 - arg0.field1255) / var3;
        arg0.field1256 += (var5 - arg0.field1256) / var3;
        arg0.field1286 = 0;
        if (arg0.field1266 == 0) {
            arg0.field1302 = 1024;
        }
        if (arg0.field1266 == 1) {
            arg0.field1302 = 1536;
        }
        if (arg0.field1266 == 2) {
            arg0.field1302 = 0;
        }
        if (arg0.field1266 == 3) {
            arg0.field1302 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LQQSLPTGQ;Z)V")
    public final void method81(class45 arg0, boolean arg1) {
        if (field282 == arg0.field1265 || arg0.field1279 == -1 || arg0.field1282 != 0 || arg0.field1281 + 1 > class37.field1113[arg0.field1279].method405(-251, arg0.field1280)) {
            int var3 = arg0.field1265 - arg0.field1264;
            int var4 = field282 - arg0.field1264;
            int var5 = arg0.field1269 * 64 + arg0.field1260 * 128;
            int var6 = arg0.field1269 * 64 + arg0.field1262 * 128;
            int var7 = arg0.field1269 * 64 + arg0.field1261 * 128;
            int var8 = arg0.field1269 * 64 + arg0.field1263 * 128;
            arg0.field1255 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1256 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1286 = 0;
        if (arg1) {
            field261 = this.field512.method544();
        }
        if (arg0.field1266 == 0) {
            arg0.field1302 = 1024;
        }
        if (arg0.field1266 == 1) {
            arg0.field1302 = 1536;
        }
        if (arg0.field1266 == 2) {
            arg0.field1302 = 0;
        }
        if (arg0.field1266 == 3) {
            arg0.field1302 = 512;
        }
        arg0.field1257 = arg0.field1302;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQQSLPTGQ;I)V")
    public final void method82(class45 arg0, int arg1) {
        arg0.field1276 = arg0.field1288;
        if (arg0.field1306 == 0) {
            arg0.field1286 = 0;
        } else {
            if (arg0.field1279 != -1 && arg0.field1282 == 0) {
                class37 var3 = class37.field1113[arg0.field1279];
                if (arg0.field1268 > 0 && var3.field1125 == 0) {
                    ++arg0.field1286;
                    return;
                }
                if (arg0.field1268 <= 0 && var3.field1126 == 0) {
                    ++arg0.field1286;
                    return;
                }
            }
            int var4 = arg0.field1255;
            int var5 = arg0.field1256;
            if (this.field187 != arg1) {
                this.field436 = -1;
            }
            int var6 = arg0.field1258[arg0.field1306 - 1] * 128 + arg0.field1269 * 64;
            int var7 = arg0.field1259[arg0.field1306 - 1] * 128 + arg0.field1269 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1302 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1302 = 1792;
                    } else {
                        arg0.field1302 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1302 = 768;
                    } else if (var5 > var7) {
                        arg0.field1302 = 256;
                    } else {
                        arg0.field1302 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1302 = 1024;
                } else {
                    arg0.field1302 = 0;
                }
                int var8 = arg0.field1302 - arg0.field1257 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1271;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1270;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1273;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1272;
                }
                if (var9 == -1) {
                    var9 = arg0.field1270;
                }
                arg0.field1276 = var9;
                int var10 = 4;
                if (arg0.field1302 != arg0.field1257 && arg0.field1284 == -1 && arg0.field1296 != 0) {
                    var10 = 2;
                }
                if (arg0.field1306 > 2) {
                    var10 = 6;
                }
                if (arg0.field1306 > 3) {
                    var10 = 8;
                }
                if (arg0.field1286 > 0 && arg0.field1306 > 1) {
                    var10 = 8;
                    --arg0.field1286;
                }
                if (arg0.field1292[arg0.field1306 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1276 == arg0.field1270 && arg0.field1291 != -1) {
                    arg0.field1276 = arg0.field1291;
                }
                if (var4 < var6) {
                    arg0.field1255 += var10;
                    if (arg0.field1255 > var6) {
                        arg0.field1255 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1255 -= var10;
                    if (arg0.field1255 < var6) {
                        arg0.field1255 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1256 += var10;
                    if (arg0.field1256 > var7) {
                        arg0.field1256 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1256 -= var10;
                    if (arg0.field1256 < var7) {
                        arg0.field1256 = var7;
                    }
                }
                if (arg0.field1255 == var6 && arg0.field1256 == var7) {
                    --arg0.field1306;
                    if (arg0.field1268 > 0) {
                        --arg0.field1268;
                        return;
                    }
                }
            } else {
                arg0.field1255 = var6;
                arg0.field1256 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLQQSLPTGQ;)V")
    public final void method83(byte arg0, class45 arg1) {
        if (arg0 != 2) {
            this.field132.method203(190);
        }
        if (arg1.field1296 != 0) {
            if (arg1.field1284 != -1 && arg1.field1284 < 32768) {
                class59 var3 = this.field473[arg1.field1284];
                if (var3 != null) {
                    int var4 = arg1.field1255 - var3.field1255;
                    int var5 = arg1.field1256 - var3.field1256;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field1302 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1284 >= 32768) {
                int var6 = arg1.field1284 - 32768;
                if (this.field413 == var6) {
                    var6 = this.field532;
                }
                class66 var7 = this.field533[var6];
                if (var7 != null) {
                    int var8 = arg1.field1255 - var7.field1255;
                    int var9 = arg1.field1256 - var7.field1256;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field1302 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1293 != 0 || arg1.field1294 != 0) && (arg1.field1306 == 0 || arg1.field1286 > 0)) {
                int var10 = arg1.field1255 - (arg1.field1293 - this.field96 - this.field96) * 64;
                int var11 = arg1.field1256 - (arg1.field1294 - this.field97 - this.field97) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field1302 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field1293 = 0;
                arg1.field1294 = 0;
            }
            int var12 = arg1.field1302 - arg1.field1257 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field1296 && var12 <= 2048 - arg1.field1296) {
                    if (var12 > 1024) {
                        arg1.field1257 -= arg1.field1296;
                    } else {
                        arg1.field1257 += arg1.field1296;
                    }
                } else {
                    arg1.field1257 = arg1.field1302;
                }
                arg1.field1257 &= 2047;
                if (arg1.field1288 == arg1.field1276 && arg1.field1302 != arg1.field1257) {
                    if (arg1.field1289 != -1) {
                        arg1.field1276 = arg1.field1289;
                        return;
                    }
                    arg1.field1276 = arg1.field1270;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LQQSLPTGQ;I)V")
    public final void method84(class45 arg0, int arg1) {
        int var3 = 87 / arg1;
        arg0.field1290 = false;
        if (arg0.field1276 != -1) {
            class37 var4 = class37.field1113[arg0.field1276];
            ++arg0.field1278;
            if (arg0.field1277 < var4.field1114 && arg0.field1278 > var4.method405(-251, arg0.field1277)) {
                arg0.field1278 = 1;
                ++arg0.field1277;
            }
            if (arg0.field1277 >= var4.field1114) {
                arg0.field1278 = 1;
                arg0.field1277 = 0;
            }
        }
        if (arg0.field1250 != -1 && field282 >= arg0.field1253) {
            if (arg0.field1251 < 0) {
                arg0.field1251 = 0;
            }
            class37 var5 = class24.field759[arg0.field1250].field763;
            ++arg0.field1252;
            if (arg0.field1251 < var5.field1114 && arg0.field1252 > var5.method405(-251, arg0.field1251)) {
                arg0.field1252 = 1;
                ++arg0.field1251;
            }
            if (arg0.field1251 >= var5.field1114 && (arg0.field1251 < 0 || arg0.field1251 >= var5.field1114)) {
                arg0.field1250 = -1;
            }
        }
        if (arg0.field1279 != -1 && arg0.field1282 <= 1) {
            class37 var6 = class37.field1113[arg0.field1279];
            if (var6.field1125 == 1 && arg0.field1268 > 0 && arg0.field1264 <= field282 && arg0.field1265 < field282) {
                arg0.field1282 = 1;
                return;
            }
        }
        if (arg0.field1279 != -1 && arg0.field1282 == 0) {
            class37 var7 = class37.field1113[arg0.field1279];
            ++arg0.field1281;
            if (arg0.field1280 < var7.field1114 && arg0.field1281 > var7.method405(-251, arg0.field1280)) {
                arg0.field1281 = 1;
                ++arg0.field1280;
            }
            if (arg0.field1280 >= var7.field1114) {
                arg0.field1280 -= var7.field1118;
                ++arg0.field1283;
                if (arg0.field1283 >= var7.field1124) {
                    arg0.field1279 = -1;
                }
                if (arg0.field1280 < 0 || arg0.field1280 >= var7.field1114) {
                    arg0.field1279 = -1;
                }
            }
            arg0.field1290 = var7.field1120;
        }
        if (arg0.field1282 > 0) {
            --arg0.field1282;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method85(byte arg0) {
        if (this.field272 == -1 || this.field388 != 2 && super.field590 == null) {
            if (this.field271) {
                this.method182(true);
                this.field271 = false;
                this.field78.method295(4, -895, super.field589, 0);
                this.field79.method295(357, -895, super.field589, 0);
                this.field80.method295(4, -895, super.field589, 722);
                this.field81.method295(205, -895, super.field589, 743);
                this.field82.method295(0, -895, super.field589, 0);
                this.field83.method295(4, -895, super.field589, 516);
                this.field84.method295(205, -895, super.field589, 516);
                this.field85.method295(357, -895, super.field589, 496);
                this.field86.method295(338, -895, super.field589, 0);
                this.field394 = true;
                this.field452 = true;
                this.field188 = true;
                this.field171 = true;
                if (this.field388 != 2) {
                    this.field457.method295(4, -895, super.field589, 4);
                    this.field456.method295(4, -895, super.field589, 550);
                }
            }
            if (this.field388 == 2) {
                this.method46(28029);
            }
            if (this.field262 && this.field205 == 1) {
                this.field394 = true;
            }
            if (this.field510 != -1) {
                boolean var4 = this.method62(this.field510, 0, this.field354);
                if (var4) {
                    this.field394 = true;
                }
            }
            if (this.field553 == 2) {
                this.field394 = true;
            }
            if (this.field401 == 2) {
                this.field394 = true;
            }
            if (this.field394) {
                this.method130(10);
                this.field394 = false;
            }
            if (this.field193 == -1 && this.field111 == 0) {
                this.field340.field1063 = this.field423 - this.field217 - 77;
                if (super.field597 > 448 && super.field597 < 560 && super.field598 > 332) {
                    this.method45(-1, 463, this.field340, 0, -609, 77, this.field423, super.field597 - 17, super.field598 - 357);
                }
                int var5 = this.field423 - 77 - this.field340.field1063;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field423 - 77) {
                    var5 = this.field423 - 77;
                }
                if (this.field217 != var5) {
                    this.field217 = var5;
                    this.field452 = true;
                }
            }
            if (this.field193 == -1 && this.field111 == 3) {
                int var6 = this.field342 * 14 + 7;
                this.field340.field1063 = this.field345;
                if (super.field597 > 448 && super.field597 < 560 && super.field598 > 332) {
                    this.method45(-1, 463, this.field340, 0, -609, 77, var6, super.field597 - 17, super.field598 - 357);
                }
                int var7 = this.field340.field1063;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field345 != var7) {
                    this.field345 = var7;
                    this.field452 = true;
                }
            }
            if (this.field193 != -1) {
                boolean var8 = this.method62(this.field193, 0, this.field354);
                if (var8) {
                    this.field452 = true;
                }
            }
            if (this.field553 == 3) {
                this.field452 = true;
            }
            if (this.field401 == 3) {
                this.field452 = true;
            }
            if (this.field412 != null) {
                this.field452 = true;
            }
            if (this.field262 && this.field205 == 2) {
                this.field452 = true;
            }
            if (this.field452) {
                this.method148(this.field355);
                this.field452 = false;
            }
            if (this.field388 == 2) {
                this.method63((byte) 1);
                this.field456.method295(4, -895, super.field589, 550);
            }
            if (this.field239 != -1) {
                this.field188 = true;
            }
            if (this.field188) {
                if (this.field239 != -1 && this.field328 == this.field239) {
                    this.field239 = -1;
                    this.field132.method202((byte) 64, 19);
                    this.field132.method203(this.field328);
                }
                this.field188 = false;
                this.field307.method294(0);
                this.field154.method304(233, 0, 0);
                if (this.field510 == -1) {
                    if (this.field449[this.field328] != -1) {
                        if (this.field328 == 0) {
                            this.field298.method304(233, 22, 10);
                        }
                        if (this.field328 == 1) {
                            this.field299.method304(233, 54, 8);
                        }
                        if (this.field328 == 2) {
                            this.field299.method304(233, 82, 8);
                        }
                        if (this.field328 == 3) {
                            this.field300.method304(233, 110, 8);
                        }
                        if (this.field328 == 4) {
                            this.field302.method304(233, 153, 8);
                        }
                        if (this.field328 == 5) {
                            this.field302.method304(233, 181, 8);
                        }
                        if (this.field328 == 6) {
                            this.field301.method304(233, 209, 9);
                        }
                    }
                    if (this.field449[0] != -1 && (this.field239 != 0 || field282 % 20 < 10)) {
                        this.field223[0].method304(233, 29, 13);
                    }
                    if (this.field449[1] != -1 && (this.field239 != 1 || field282 % 20 < 10)) {
                        this.field223[1].method304(233, 53, 11);
                    }
                    if (this.field449[2] != -1 && (this.field239 != 2 || field282 % 20 < 10)) {
                        this.field223[2].method304(233, 82, 11);
                    }
                    if (this.field449[3] != -1 && (this.field239 != 3 || field282 % 20 < 10)) {
                        this.field223[3].method304(233, 115, 12);
                    }
                    if (this.field449[4] != -1 && (this.field239 != 4 || field282 % 20 < 10)) {
                        this.field223[4].method304(233, 153, 13);
                    }
                    if (this.field449[5] != -1 && (this.field239 != 5 || field282 % 20 < 10)) {
                        this.field223[5].method304(233, 180, 11);
                    }
                    if (this.field449[6] != -1 && (this.field239 != 6 || field282 % 20 < 10)) {
                        this.field223[6].method304(233, 208, 13);
                    }
                }
                this.field307.method295(160, -895, super.field589, 516);
                this.field306.method294(0);
                this.field153.method304(233, 0, 0);
                if (this.field510 == -1) {
                    if (this.field449[this.field328] != -1) {
                        if (this.field328 == 7) {
                            this.field218.method304(233, 42, 0);
                        }
                        if (this.field328 == 8) {
                            this.field219.method304(233, 74, 0);
                        }
                        if (this.field328 == 9) {
                            this.field219.method304(233, 102, 0);
                        }
                        if (this.field328 == 10) {
                            this.field220.method304(233, 130, 1);
                        }
                        if (this.field328 == 11) {
                            this.field222.method304(233, 173, 0);
                        }
                        if (this.field328 == 12) {
                            this.field222.method304(233, 201, 0);
                        }
                        if (this.field328 == 13) {
                            this.field221.method304(233, 229, 0);
                        }
                    }
                    if (this.field449[8] != -1 && (this.field239 != 8 || field282 % 20 < 10)) {
                        this.field223[7].method304(233, 74, 2);
                    }
                    if (this.field449[9] != -1 && (this.field239 != 9 || field282 % 20 < 10)) {
                        this.field223[8].method304(233, 102, 3);
                    }
                    if (this.field449[10] != -1 && (this.field239 != 10 || field282 % 20 < 10)) {
                        this.field223[9].method304(233, 137, 4);
                    }
                    if (this.field449[11] != -1 && (this.field239 != 11 || field282 % 20 < 10)) {
                        this.field223[10].method304(233, 174, 2);
                    }
                    if (this.field449[12] != -1 && (this.field239 != 12 || field282 % 20 < 10)) {
                        this.field223[11].method304(233, 201, 2);
                    }
                    if (this.field449[13] != -1 && (this.field239 != 13 || field282 % 20 < 10)) {
                        this.field223[12].method304(233, 226, 2);
                    }
                }
                this.field306.method295(466, -895, super.field589, 496);
                this.field457.method294(0);
                class71.field1731 = this.field321;
            }
            if (this.field171) {
                this.field171 = false;
                this.field305.method294(0);
                this.field152.method304(233, 0, 0);
                this.field406.method14(true, 55, 2, "Public chat", 28, 16777215);
                if (this.field334 == 0) {
                    this.field406.method14(true, 55, 2, "On", 41, 65280);
                }
                if (this.field334 == 1) {
                    this.field406.method14(true, 55, 2, "Friends", 41, 16776960);
                }
                if (this.field334 == 2) {
                    this.field406.method14(true, 55, 2, "Off", 41, 16711680);
                }
                if (this.field334 == 3) {
                    this.field406.method14(true, 55, 2, "Hide", 41, 65535);
                }
                this.field406.method14(true, 184, 2, "Private chat", 28, 16777215);
                if (this.field460 == 0) {
                    this.field406.method14(true, 184, 2, "On", 41, 65280);
                }
                if (this.field460 == 1) {
                    this.field406.method14(true, 184, 2, "Friends", 41, 16776960);
                }
                if (this.field460 == 2) {
                    this.field406.method14(true, 184, 2, "Off", 41, 16711680);
                }
                this.field406.method14(true, 324, 2, "Trade/compete", 28, 16777215);
                if (this.field484 == 0) {
                    this.field406.method14(true, 324, 2, "On", 41, 65280);
                }
                if (this.field484 == 1) {
                    this.field406.method14(true, 324, 2, "Friends", 41, 16776960);
                }
                if (this.field484 == 2) {
                    this.field406.method14(true, 324, 2, "Off", 41, 16711680);
                }
                this.field406.method14(true, 458, 2, "Report abuse", 33, 16777215);
                this.field305.method295(453, -895, super.field589, 0);
                this.field457.method294(0);
                class71.field1731 = this.field321;
            }
            this.field354 = 0;
            if (arg0 == 3) {
                boolean var9 = false;
            } else {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
        } else {
            if (this.field388 == 2) {
                this.method62(this.field272, 0, this.field354);
                if (this.field508 != -1) {
                    this.method62(this.field508, 0, this.field354);
                }
                this.field354 = 0;
                this.method112(427);
                super.field590.method294(0);
                class71.field1731 = this.field322;
                class5.method31((byte) 4);
                this.field271 = true;
                class36 var2 = class36.method394(this.field272);
                if (var2.field1105 == 512 && var2.field1095 == 334 && var2.field1082 == 0) {
                    var2.field1105 = 765;
                    var2.field1095 = 503;
                }
                this.method71(0, true, 0, var2, 0);
                if (this.field508 != -1) {
                    class36 var3 = class36.method394(this.field508);
                    if (var3.field1105 == 512 && var3.field1095 == 334 && var3.field1082 == 0) {
                        var3.field1105 = 765;
                        var3.field1095 = 503;
                    }
                    this.method71(0, true, 0, var3, 0);
                }
                if (!this.field262) {
                    this.method88(133);
                    this.method110((byte) -118);
                } else {
                    this.method114(45528);
                }
            }
            super.field590.method295(0, -895, super.field589, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method86(int arg0, int arg1, int arg2) {
        int var3 = 43 / arg0;
        int var4 = arg1 - arg2;
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

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field592 != null) {
                    return new URL("http://127.0.0.1:" + (field119 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method87(int arg0, boolean arg1) {
        if (arg1) {
            field386 = !field386;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method88(int arg0) {
        if (this.field401 == 0) {
            this.field126[0] = "Cancel";
            this.field185[0] = 1290;
            this.field428 = 1;
            if (this.field272 != -1) {
                this.field495 = 0;
                this.field486 = 0;
                this.method161(0, class36.method394(this.field272), 0, (byte) 1, super.field597, super.field598, 0, 0);
                if (this.field495 != this.field450) {
                    this.field450 = this.field495;
                }
                if (this.field486 != this.field333) {
                    this.field333 = this.field486;
                }
            } else {
                this.method143(68);
                this.field495 = 0;
                this.field486 = 0;
                if (super.field597 > 4 && super.field598 > 4 && super.field597 < 516 && super.field598 < 338) {
                    if (this.field142 != -1) {
                        this.method161(4, class36.method394(this.field142), 0, (byte) 1, super.field597, super.field598, 0, 4);
                    } else {
                        this.method89(0);
                    }
                }
                if (this.field495 != this.field450) {
                    this.field450 = this.field495;
                }
                if (this.field486 != this.field333) {
                    this.field333 = this.field486;
                }
                this.field495 = 0;
                this.field486 = 0;
                if (super.field597 > 553 && super.field598 > 205 && super.field597 < 743 && super.field598 < 466) {
                    if (this.field510 != -1) {
                        this.method161(553, class36.method394(this.field510), 1, (byte) 1, super.field597, super.field598, 0, 205);
                    } else if (this.field449[this.field328] != -1) {
                        this.method161(553, class36.method394(this.field449[this.field328]), 1, (byte) 1, super.field597, super.field598, 0, 205);
                    }
                }
                if (this.field495 != this.field247) {
                    this.field394 = true;
                    this.field247 = this.field495;
                }
                if (this.field486 != this.field275) {
                    this.field394 = true;
                    this.field275 = this.field486;
                }
                this.field495 = 0;
                this.field486 = 0;
                if (super.field597 > 17 && super.field598 > 357 && super.field597 < 496 && super.field598 < 453) {
                    if (this.field193 != -1) {
                        this.method161(17, class36.method394(this.field193), 2, (byte) 1, super.field597, super.field598, 0, 357);
                    } else if (this.field199 != -1) {
                        this.method161(17, class36.method394(this.field199), 3, (byte) 1, super.field597, super.field598, 0, 357);
                    } else if (super.field598 < 434 && super.field597 < 426 && this.field111 == 0) {
                        this.method117((byte) 9, super.field598 - 357, super.field597 - 17);
                    }
                }
                if ((this.field193 != -1 || this.field199 != -1) && this.field495 != this.field202) {
                    this.field452 = true;
                    this.field202 = this.field495;
                }
                if ((this.field193 != -1 || this.field199 != -1) && this.field486 != this.field465) {
                    this.field452 = true;
                    this.field465 = this.field486;
                }
                boolean var2 = false;
                if (arg0 <= 0) {
                    this.field278 = null;
                }
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field428 - 1; ++var3) {
                        if (this.field185[var3] < 1000 && this.field185[var3 + 1] > 1000) {
                            String var4 = this.field126[var3];
                            this.field126[var3] = this.field126[var3 + 1];
                            this.field126[var3 + 1] = var4;
                            int var5 = this.field185[var3];
                            this.field185[var3] = this.field185[var3 + 1];
                            this.field185[var3 + 1] = var5;
                            int var6 = this.field183[var3];
                            this.field183[var3] = this.field183[var3 + 1];
                            this.field183[var3 + 1] = var6;
                            int var7 = this.field184[var3];
                            this.field184[var3] = this.field184[var3 + 1];
                            this.field184[var3 + 1] = var7;
                            int var8 = this.field186[var3];
                            this.field186[var3] = this.field186[var3 + 1];
                            this.field186[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method89(int arg0) {
        this.field435 += arg0;
        if (this.field113 == 0 && this.field189 == 0) {
            this.field126[this.field428] = "Walk here";
            this.field185[this.field428] = 763;
            this.field183[this.field428] = super.field597;
            this.field184[this.field428] = super.field598;
            ++this.field428;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class28.field878; ++var3) {
            int var4 = class28.field879[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field143.method517(this.field411, var5, var6, var4) >= 0) {
                    class39 var9 = class39.method409(var8);
                    if (var9.field1182 != null) {
                        var9 = var9.method410(1);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field113 == 1) {
                        this.field126[this.field428] = "Use " + this.field117 + " with @cya@" + var9.field1159;
                        this.field185[this.field428] = 725;
                        this.field186[this.field428] = var4;
                        this.field183[this.field428] = var5;
                        this.field184[this.field428] = var6;
                        ++this.field428;
                    } else if (this.field189 == 1) {
                        if ((this.field191 & 4) == 4) {
                            this.field126[this.field428] = this.field192 + " @cya@" + var9.field1159;
                            this.field185[this.field428] = 865;
                            this.field186[this.field428] = var4;
                            this.field183[this.field428] = var5;
                            this.field184[this.field428] = var6;
                            ++this.field428;
                        }
                    } else {
                        if (var9.field1158 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1158[var10] != null) {
                                    this.field126[this.field428] = var9.field1158[var10] + " @cya@" + var9.field1159;
                                    if (var10 == 0) {
                                        this.field185[this.field428] = 837;
                                    }
                                    if (var10 == 1) {
                                        this.field185[this.field428] = 337;
                                    }
                                    if (var10 == 2) {
                                        this.field185[this.field428] = 101;
                                    }
                                    if (var10 == 3) {
                                        this.field185[this.field428] = 840;
                                    }
                                    if (var10 == 4) {
                                        this.field185[this.field428] = 1173;
                                    }
                                    this.field186[this.field428] = var4;
                                    this.field183[this.field428] = var5;
                                    this.field184[this.field428] = var6;
                                    ++this.field428;
                                }
                            }
                        }
                        this.field126[this.field428] = "Examine @cya@" + var9.field1159;
                        this.field185[this.field428] = 1030;
                        this.field186[this.field428] = var9.field1180 << 14;
                        this.field183[this.field428] = var5;
                        this.field184[this.field428] = var6;
                        ++this.field428;
                    }
                }
                if (var7 == 1) {
                    class59 var11 = this.field473[var8];
                    if (var11.field1505.field1368 == 1 && (var11.field1255 & 127) == 64 && (var11.field1256 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field474; ++var12) {
                            class59 var15 = this.field473[this.field475[var12]];
                            if (var15 != null && var11 != var15 && var15.field1505.field1368 == 1 && var11.field1255 == var15.field1255 && var11.field1256 == var15.field1256) {
                                this.method180(this.field475[var12], var5, true, var6, var15.field1505);
                            }
                        }
                        for (int var13 = 0; var13 < this.field534; ++var13) {
                            class66 var14 = this.field533[this.field535[var13]];
                            if (var14 != null && var11.field1255 == var14.field1255 && var11.field1256 == var14.field1256) {
                                this.method147((byte) 9, var6, var14, var5, this.field535[var13]);
                            }
                        }
                    }
                    this.method180(var8, var5, true, var6, var11.field1505);
                }
                if (var7 == 0) {
                    class66 var16 = this.field533[var8];
                    if ((var16.field1255 & 127) == 64 && (var16.field1256 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field474; ++var17) {
                            class59 var20 = this.field473[this.field475[var17]];
                            if (var20 != null && var20.field1505.field1368 == 1 && var16.field1255 == var20.field1255 && var16.field1256 == var20.field1256) {
                                this.method180(this.field475[var17], var5, true, var6, var20.field1505);
                            }
                        }
                        for (int var18 = 0; var18 < this.field534; ++var18) {
                            class66 var19 = this.field533[this.field535[var18]];
                            if (var19 != null && var16 != var19 && var16.field1255 == var19.field1255 && var16.field1256 == var19.field1256) {
                                this.method147((byte) 9, var6, var19, var5, this.field535[var18]);
                            }
                        }
                    }
                    this.method147((byte) 9, var6, var16, var5, var8);
                }
                if (var7 == 3) {
                    class42 var21 = this.field278[this.field411][var5][var6];
                    if (var21 != null) {
                        for (class6 var22 = (class6) var21.method423(false); var22 != null; var22 = (class6) var21.method425(false)) {
                            class34 var23 = class34.method390(var22.field56);
                            if (this.field113 == 1) {
                                this.field126[this.field428] = "Use " + this.field117 + " with @lre@" + var23.field985;
                                this.field185[this.field428] = 641;
                                this.field186[this.field428] = var22.field56;
                                this.field183[this.field428] = var5;
                                this.field184[this.field428] = var6;
                                ++this.field428;
                            } else if (this.field189 == 1) {
                                if ((this.field191 & 1) == 1) {
                                    this.field126[this.field428] = this.field192 + " @lre@" + var23.field985;
                                    this.field185[this.field428] = 540;
                                    this.field186[this.field428] = var22.field56;
                                    this.field183[this.field428] = var5;
                                    this.field184[this.field428] = var6;
                                    ++this.field428;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field999 != null && var23.field999[var24] != null) {
                                        this.field126[this.field428] = var23.field999[var24] + " @lre@" + var23.field985;
                                        if (var24 == 0) {
                                            this.field185[this.field428] = 429;
                                        }
                                        if (var24 == 1) {
                                            this.field185[this.field428] = 367;
                                        }
                                        if (var24 == 2) {
                                            this.field185[this.field428] = 595;
                                        }
                                        if (var24 == 3) {
                                            this.field185[this.field428] = 155;
                                        }
                                        if (var24 == 4) {
                                            this.field185[this.field428] = 180;
                                        }
                                        this.field186[this.field428] = var22.field56;
                                        this.field183[this.field428] = var5;
                                        this.field184[this.field428] = var6;
                                        ++this.field428;
                                    } else if (var24 == 2) {
                                        this.field126[this.field428] = "Take @lre@" + var23.field985;
                                        this.field185[this.field428] = 595;
                                        this.field186[this.field428] = var22.field56;
                                        this.field183[this.field428] = var5;
                                        this.field184[this.field428] = var6;
                                        ++this.field428;
                                    }
                                }
                                this.field126[this.field428] = "Examine @lre@" + var23.field985;
                                this.field185[this.field428] = 1635;
                                this.field186[this.field428] = var22.field56;
                                this.field183[this.field428] = var5;
                                this.field184[this.field428] = var6;
                                ++this.field428;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field481) {
            this.method49((byte) 8);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void method90(byte arg0, int arg1) {
        if (arg1 >= 0) {
            int var3 = this.field183[arg1];
            int var4 = this.field184[arg1];
            int var5 = this.field185[arg1];
            int var6 = this.field186[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field111 != 0 && var5 != 1290) {
                this.field111 = 0;
                this.field452 = true;
            }
            if (var5 == 865 && this.method60(var6, -864, var3, var4)) {
                this.field132.method202((byte) 64, 156);
                this.field132.method238(this.field190, (byte) 102);
                this.field132.method238(this.field96 + var3, (byte) 102);
                this.field132.method240(865, var6 >> 14 & 32767);
                this.field132.method238(this.field97 + var4, (byte) 102);
            }
            if (var5 == 1030) {
                int var7 = var6 >> 14 & 32767;
                class39 var8 = class39.method409(var7);
                String var9;
                if (var8.field1148 != null) {
                    var9 = new String(var8.field1148);
                } else {
                    var9 = "It's a " + var8.field1159 + ".";
                }
                this.method177(var9, "", 0, 20045);
            }
            if (var5 == 4) {
                this.field132.method202((byte) 64, 208);
                this.field132.method240(865, var4);
                this.field132.method239(var6, -14191);
                this.field132.method239(var3, -14191);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 595) {
                boolean var10 = this.method164(var4, 2, 0, 0, 0, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 0, 0);
                if (!var10) {
                    this.method164(var4, 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 1, 0);
                }
                this.field395 = super.field604;
                this.field396 = super.field605;
                this.field398 = 2;
                this.field397 = 0;
                this.field132.method202((byte) 64, 170);
                this.field132.method204(this.field97 + var4);
                this.field132.method240(865, var6);
                this.field132.method204(this.field96 + var3);
            }
            if (var5 == 155) {
                boolean var12 = this.method164(var4, 2, 0, 0, 0, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 0, 0);
                if (!var12) {
                    this.method164(var4, 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 1, 0);
                }
                this.field395 = super.field604;
                this.field396 = super.field605;
                this.field398 = 2;
                this.field397 = 0;
                this.field132.method202((byte) 64, 28);
                this.field132.method238(this.field97 + var4, (byte) 102);
                this.field132.method204(var6);
                this.field132.method240(865, this.field96 + var3);
            }
            if (var5 == 476) {
                class59 var14 = this.field473[var6];
                if (var14 != null) {
                    this.method164(var14.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var14.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 86);
                    this.field132.method238(var6, (byte) 102);
                }
            }
            if (var5 == 545) {
                class66 var15 = this.field533[var6];
                if (var15 != null) {
                    this.method164(var15.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var15.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 142);
                    this.field132.method239(var6, -14191);
                }
            }
            if (var5 == 143 || var5 == 950 || var5 == 140 || var5 == 9) {
                String var16 = this.field126[arg1];
                int var17 = var16.indexOf("@whi@");
                if (var17 != -1) {
                    long var18 = class51.method445(var16.substring(var17 + 5).trim());
                    if (var5 == 143) {
                        this.method111((byte) 8, var18);
                    }
                    if (var5 == 950) {
                        this.method75(var18, 731);
                    }
                    if (var5 == 140) {
                        this.method55(this.field466, var18);
                    }
                    if (var5 == 9) {
                        this.method141(var18, (byte) -63);
                    }
                }
            }
            if (var5 == 891) {
                class66 var20 = this.field533[var6];
                if (var20 != null) {
                    this.method164(var20.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var20.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 216);
                    this.field132.method240(865, var6);
                }
            }
            if (var5 == 223) {
                class66 var21 = this.field533[var6];
                if (var21 != null) {
                    this.method164(var21.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var21.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 74);
                    this.field132.method240(865, this.field115);
                    this.field132.method238(this.field116, (byte) 102);
                    this.field132.method240(865, this.field114);
                    this.field132.method204(var6);
                }
            }
            if (var5 == 800) {
                class59 var22 = this.field473[var6];
                if (var22 != null) {
                    this.method164(var22.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var22.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 66);
                    this.field132.method238(this.field116, (byte) 102);
                    this.field132.method240(865, this.field114);
                    this.field132.method204(var6);
                    this.field132.method240(865, this.field115);
                }
            }
            if (var5 == 367) {
                boolean var23 = this.method164(var4, 2, 0, 0, 0, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 0, 0);
                if (!var23) {
                    this.method164(var4, 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 1, 0);
                }
                this.field395 = super.field604;
                this.field396 = super.field605;
                this.field398 = 2;
                this.field397 = 0;
                this.field132.method202((byte) 64, 42);
                this.field132.method239(var6, -14191);
                this.field132.method204(this.field97 + var4);
                this.field132.method238(this.field96 + var3, (byte) 102);
            }
            if (var5 == 422) {
                this.field132.method202((byte) 64, 241);
                this.field132.method238(var6, (byte) 102);
                this.field132.method204(var3);
                this.field132.method204(var4);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 1635) {
                class34 var25 = class34.method390(var6);
                String var26;
                if (var25.field1004 != null) {
                    var26 = new String(var25.field1004);
                } else {
                    var26 = "It's a " + var25.field985 + ".";
                }
                this.method177(var26, "", 0, 20045);
            }
            if (var5 == 490) {
                if ((var6 & 3) == 0) {
                    ++field421;
                }
                if (field421 >= 63) {
                    this.field132.method202((byte) 64, 193);
                    this.field132.method206(7246564);
                    field421 = 0;
                }
                this.field132.method202((byte) 64, 126);
                this.field132.method240(865, var3);
                this.field132.method240(865, var4);
                this.field132.method240(865, var6);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 51) {
                this.field132.method202((byte) 64, 164);
                this.field132.method240(865, this.field116);
                this.field132.method238(var3, (byte) 102);
                this.field132.method204(var6);
                this.field132.method239(this.field115, -14191);
                this.field132.method238(var4, (byte) 102);
                this.field132.method238(this.field114, (byte) 102);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 763) {
                if (!this.field262) {
                    this.field143.method525(super.field605 - 4, 0, super.field604 - 4);
                } else {
                    this.field143.method525(var4 - 4, 0, var3 - 4);
                }
            }
            if (var5 == 486) {
                this.field132.method202((byte) 64, 146);
                this.field132.method240(865, var3);
                this.field132.method240(865, var4);
                this.field132.method239(var6, -14191);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 992) {
                class59 var27 = this.field473[var6];
                if (var27 != null) {
                    this.method164(var27.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var27.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 128);
                    this.field132.method239(var6, -14191);
                }
            }
            if (var5 == 856) {
                this.field132.method202((byte) 64, 47);
                this.field132.method204(var3);
                this.field132.method239(var6, -14191);
                this.field132.method204(var4);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 113) {
                this.field132.method202((byte) 64, 207);
                this.field132.method240(865, var6);
                this.field132.method240(865, var4);
                this.field132.method240(865, var3);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 531) {
                this.method170(-618);
            }
            if (var5 == 337) {
                this.method60(var6, -864, var3, var4);
                this.field132.method202((byte) 64, 224);
                this.field132.method240(865, var6 >> 14 & 32767);
                this.field132.method204(this.field96 + var3);
                this.field132.method239(this.field97 + var4, -14191);
            }
            if (var5 == 365) {
                class66 var28 = this.field533[var6];
                if (var28 != null) {
                    this.method164(var28.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var28.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 236);
                    this.field132.method239(var6, -14191);
                }
            }
            if (var5 == 83) {
                class59 var29 = this.field473[var6];
                if (var29 != null) {
                    this.method164(var29.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var29.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 18);
                    this.field132.method238(this.field190, (byte) 102);
                    this.field132.method238(var6, (byte) 102);
                }
            }
            if (var5 == 286) {
                class59 var30 = this.field473[var6];
                if (var30 != null) {
                    this.method164(var30.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var30.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 182);
                    this.field132.method238(var6, (byte) 102);
                }
            }
            if (var5 == 840) {
                if ((this.field96 & 3) == 0) {
                    ++field352;
                }
                if (field352 >= 52) {
                    this.field132.method202((byte) 64, 168);
                    field352 = 0;
                }
                this.method60(var6, -864, var3, var4);
                this.field132.method202((byte) 64, 195);
                this.field132.method240(865, this.field96 + var3);
                this.field132.method239(this.field97 + var4, -14191);
                this.field132.method240(865, var6 >> 14 & 32767);
            }
            if (var5 == 489) {
                this.field132.method202((byte) 64, 36);
                this.field132.method238(var3, (byte) 102);
                this.field132.method239(var4, -14191);
                this.field132.method239(var6, -14191);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 269) {
                this.method50(this.field199, 7063);
                this.field199 = -1;
                this.field452 = true;
            }
            if (var5 == 363) {
                String var31 = this.field126[arg1];
                int var32 = var31.indexOf("@whi@");
                if (var32 != -1) {
                    long var33 = class51.method445(var31.substring(var32 + 5).trim());
                    int var35 = -1;
                    for (int var36 = 0; var36 < this.field241; ++var36) {
                        if (this.field101[var36] == var33) {
                            var35 = var36;
                            break;
                        }
                    }
                    if (var35 != -1 && this.field243[var35] > 0) {
                        this.field452 = true;
                        this.field111 = 0;
                        this.field346 = true;
                        this.field308 = "";
                        this.field493 = 3;
                        this.field361 = this.field101[var35];
                        this.field326 = "Enter message to send to " + this.field468[var35];
                    }
                }
            }
            if (var5 == 1314) {
                class34 var37 = class34.method390(var6);
                class36 var38 = class36.method394(var4);
                String var39;
                if (var38 != null && var38.field1093[var3] >= 100000) {
                    var39 = var38.field1093[var3] + " x " + var37.field985;
                } else if (var37.field1004 != null) {
                    var39 = new String(var37.field1004);
                } else {
                    var39 = "It's a " + var37.field985 + ".";
                }
                this.method177(var39, "", 0, 20045);
            }
            if (var5 == 555) {
                class66 var40 = this.field533[var6];
                if (var40 != null) {
                    this.method164(var40.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var40.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 25);
                    this.field132.method238(var6, (byte) 102);
                    this.field132.method204(this.field190);
                }
            }
            if (var5 == 94) {
                class66 var41 = this.field533[var6];
                if (var41 != null) {
                    this.method164(var41.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var41.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    if ((var6 & 3) == 0) {
                        ++field539;
                    }
                    if (field539 >= 144) {
                        this.field132.method202((byte) 64, 44);
                        this.field132.method204(4239);
                        field539 = 0;
                    }
                    this.field132.method202((byte) 64, 108);
                    this.field132.method239(var6, -14191);
                }
            }
            if (var5 == 1 && !this.field236) {
                this.field132.method202((byte) 64, 223);
                this.field132.method204(var4);
                this.field236 = true;
            }
            if (var5 == 1738) {
                class59 var42 = this.field473[var6];
                if (var42 != null) {
                    class48 var43 = var42.field1505;
                    if (var43.field1373 != null) {
                        var43 = var43.method436((byte) -38);
                    }
                    if (var43 != null) {
                        String var44;
                        if (var43.field1366 != null) {
                            var44 = new String(var43.field1366);
                        } else {
                            var44 = "It's a " + var43.field1343 + ".";
                        }
                        this.method177(var44, "", 0, 20045);
                    }
                }
            }
            if (var5 == 741) {
                class36 var45 = class36.method394(var4);
                boolean var46 = true;
                if (var45.field1061 > 0) {
                    var46 = this.method121(var45, -818);
                }
                if (var46) {
                    this.field132.method202((byte) 64, 16);
                    this.field132.method204(var4);
                }
            }
            if (var5 == 540) {
                boolean var47 = this.method164(var4, 2, 0, 0, 0, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 0, 0);
                if (!var47) {
                    this.method164(var4, 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 1, 0);
                }
                this.field395 = super.field604;
                this.field396 = super.field605;
                this.field398 = 2;
                this.field397 = 0;
                this.field132.method202((byte) 64, 34);
                this.field132.method240(865, this.field96 + var3);
                this.field132.method240(865, var6);
                this.field132.method238(this.field97 + var4, (byte) 102);
                this.field132.method239(this.field190, -14191);
            }
            if (var5 == 641) {
                boolean var49 = this.method164(var4, 2, 0, 0, 0, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 0, 0);
                if (!var49) {
                    this.method164(var4, 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 1, 0);
                }
                this.field395 = super.field604;
                this.field396 = super.field605;
                this.field398 = 2;
                this.field397 = 0;
                this.field132.method202((byte) 64, 59);
                this.field132.method204(this.field96 + var3);
                this.field132.method238(this.field97 + var4, (byte) 102);
                this.field132.method204(var6);
                this.field132.method240(865, this.field114);
                this.field132.method238(this.field115, (byte) 102);
                this.field132.method239(this.field116, -14191);
            }
            if (var5 == 315) {
                this.field132.method202((byte) 64, 137);
                this.field132.method204(var6);
                this.field132.method204(var3);
                this.field132.method239(var4, -14191);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 101) {
                this.method60(var6, -864, var3, var4);
                this.field132.method202((byte) 64, 177);
                this.field132.method238(this.field96 + var3, (byte) 102);
                this.field132.method238(var6 >> 14 & 32767, (byte) 102);
                this.field132.method204(this.field97 + var4);
            }
            if (var5 == 319) {
                class59 var51 = this.field473[var6];
                if (var51 != null) {
                    this.method164(var51.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var51.field1258[0], (byte) -85, 1, 0);
                    this.field395 = super.field604;
                    this.field396 = super.field605;
                    this.field398 = 2;
                    this.field397 = 0;
                    this.field132.method202((byte) 64, 6);
                    this.field132.method238(var6, (byte) 102);
                }
            }
            if (var5 == 725 && this.method60(var6, -864, var3, var4)) {
                this.field132.method202((byte) 64, 95);
                this.field132.method239(var6 >> 14 & 32767, -14191);
                this.field132.method204(this.field97 + var4);
                this.field132.method238(this.field114, (byte) 102);
                this.field132.method238(this.field116, (byte) 102);
                this.field132.method239(this.field115, -14191);
                this.field132.method238(this.field96 + var3, (byte) 102);
            }
            if (var5 == 837) {
                this.method60(var6, -864, var3, var4);
                this.field132.method202((byte) 64, 110);
                this.field132.method240(865, var6 >> 14 & 32767);
                this.field132.method240(865, this.field97 + var4);
                this.field132.method204(this.field96 + var3);
            }
            if (var5 == 243) {
                String var52 = this.field126[arg1];
                int var53 = var52.indexOf("@whi@");
                if (var53 != -1) {
                    if (this.field142 == -1) {
                        this.method170(-618);
                        this.field244 = var52.substring(var53 + 5).trim();
                        this.field489 = false;
                        this.field554 = this.field142 = class36.field1036;
                    } else {
                        this.method177("Please close the interface you have open before using 'report abuse'", "", 0, 20045);
                    }
                }
            }
            if (var5 == 793 || var5 == 510) {
                String var54 = this.field126[arg1];
                int var55 = var54.indexOf("@whi@");
                if (var55 != -1) {
                    String var56 = var54.substring(var55 + 5).trim();
                    String var57 = class51.method449(class51.method446(class51.method445(var56), (byte) 5), 78);
                    boolean var58 = false;
                    for (int var59 = 0; var59 < this.field534; ++var59) {
                        class66 var60 = this.field533[this.field535[var59]];
                        if (var60 != null && var60.field1642 != null && var60.field1642.equalsIgnoreCase(var57)) {
                            this.method164(var60.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var60.field1258[0], (byte) -85, 1, 0);
                            if (var5 == 793) {
                                if ((var6 & 3) == 0) {
                                    ++field539;
                                }
                                if (field539 >= 144) {
                                    this.field132.method202((byte) 64, 44);
                                    this.field132.method204(4239);
                                    field539 = 0;
                                }
                                this.field132.method202((byte) 64, 108);
                                this.field132.method239(this.field535[var59], -14191);
                            }
                            if (var5 == 510) {
                                if ((var6 & 3) == 0) {
                                    ++field547;
                                }
                                if (field547 >= 138) {
                                    this.field132.method202((byte) 64, 145);
                                    this.field132.method206(4353197);
                                    field547 = 0;
                                }
                                this.field132.method202((byte) 64, 70);
                                this.field132.method239(this.field535[var59], -14191);
                            }
                            var58 = true;
                            break;
                        }
                    }
                    if (!var58) {
                        this.method177("Unable to find " + var57, "", 0, 20045);
                    }
                }
            }
            if (var5 == 906) {
                this.field132.method202((byte) 64, 45);
                this.field132.method240(865, var6);
                this.field132.method238(var3, (byte) 102);
                this.field132.method238(this.field190, (byte) 102);
                this.field132.method239(var4, -14191);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 682) {
                this.field132.method202((byte) 64, 91);
                this.field132.method238(var3, (byte) 102);
                this.field132.method238(var6, (byte) 102);
                this.field132.method238(var4, (byte) 102);
                this.field550 = 0;
                this.field551 = var4;
                this.field552 = var3;
                this.field553 = 2;
                if (class36.method394(var4).field1092 == this.field142) {
                    this.field553 = 1;
                }
                if (class36.method394(var4).field1092 == this.field193) {
                    this.field553 = 3;
                }
            }
            if (var5 == 417) {
                this.field132.method202((byte) 64, 16);
                this.field132.method204(var4);
                class36 var61 = class36.method394(var4);
                if (var61.field1099 != null && var61.field1099[0][0] == 5) {
                    int var62 = var61.field1099[0][1];
                    if (this.field544[var62] != var61.field1060[0]) {
                        this.field544[var62] = var61.field1060[0];
                        this.method113((byte) 92, var62);
                        this.field394 = true;
                    }
                }
            }
            if (var5 == 180) {
                boolean var63 = this.method164(var4, 2, 0, 0, 0, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 0, 0);
                if (!var63) {
                    this.method164(var4, 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 1, 0);
                }
                this.field395 = super.field604;
                this.field396 = super.field605;
                this.field398 = 2;
                this.field397 = 0;
                this.field132.method202((byte) 64, 27);
                this.field132.method238(var6, (byte) 102);
                this.field132.method238(this.field97 + var4, (byte) 102);
                this.field132.method239(this.field96 + var3, -14191);
            }
            if (var5 == 429) {
                boolean var65 = this.method164(var4, 2, 0, 0, 0, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 0, 0);
                if (!var65) {
                    this.method164(var4, 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var3, (byte) -85, 1, 0);
                }
                this.field395 = super.field604;
                this.field396 = super.field605;
                this.field398 = 2;
                this.field397 = 0;
                this.field132.method202((byte) 64, 84);
                this.field132.method239(this.field97 + var4, -14191);
                this.field132.method204(this.field96 + var3);
                this.field132.method239(var6, -14191);
            }
            if (var5 == 529) {
                this.field113 = 1;
                this.field114 = var3;
                this.field115 = var4;
                this.field116 = var6;
                this.field117 = String.valueOf(class34.method390(var6).field985);
                this.field189 = 0;
                this.field394 = true;
            } else if (var5 == 508) {
                class36 var67 = class36.method394(var4);
                this.field189 = 1;
                this.field190 = var4;
                this.field191 = var67.field1101;
                this.field113 = 0;
                this.field394 = true;
                String var68 = var67.field1050;
                if (var68.indexOf(" ") != -1) {
                    var68 = var68.substring(0, var68.indexOf(" "));
                }
                String var69 = var67.field1050;
                if (var69.indexOf(" ") != -1) {
                    var69 = var69.substring(var69.indexOf(" ") + 1);
                }
                this.field192 = var68 + " " + var67.field1094 + " " + var69;
                if (this.field191 == 16) {
                    this.field394 = true;
                    this.field328 = 3;
                    this.field188 = true;
                }
            } else {
                if (var5 == 1173) {
                    if ((var6 & 3) == 0) {
                        ++field442;
                    }
                    if (field442 >= 112) {
                        this.field132.method202((byte) 64, 232);
                        this.field132.method204(63273);
                        field442 = 0;
                    }
                    this.method60(var6, -864, var3, var4);
                    this.field132.method202((byte) 64, 50);
                    this.field132.method239(this.field96 + var3, -14191);
                    this.field132.method240(865, this.field97 + var4);
                    this.field132.method204(var6 >> 14 & 32767);
                }
                if (var5 == 416) {
                    class66 var70 = this.field533[var6];
                    if (var70 != null) {
                        this.method164(var70.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var70.field1258[0], (byte) -85, 1, 0);
                        this.field395 = super.field604;
                        this.field396 = super.field605;
                        this.field398 = 2;
                        this.field397 = 0;
                        if ((var6 & 3) == 0) {
                            ++field547;
                        }
                        if (field547 >= 138) {
                            this.field132.method202((byte) 64, 145);
                            this.field132.method206(4353197);
                            field547 = 0;
                        }
                        this.field132.method202((byte) 64, 70);
                        this.field132.method239(var6, -14191);
                    }
                }
                if (var5 == 593) {
                    this.field132.method202((byte) 64, 190);
                    this.field132.method240(865, var3);
                    this.field132.method204(var6);
                    this.field132.method240(865, var4);
                    this.field550 = 0;
                    this.field551 = var4;
                    this.field552 = var3;
                    this.field553 = 2;
                    if (class36.method394(var4).field1092 == this.field142) {
                        this.field553 = 1;
                    }
                    if (class36.method394(var4).field1092 == this.field193) {
                        this.field553 = 3;
                    }
                }
                if (var5 == 923) {
                    this.field132.method202((byte) 64, 16);
                    this.field132.method204(var4);
                    class36 var71 = class36.method394(var4);
                    if (var71.field1099 != null && var71.field1099[0][0] == 5) {
                        int var72 = var71.field1099[0][1];
                        this.field544[var72] = 1 - this.field544[var72];
                        this.method113((byte) 92, var72);
                        this.field394 = true;
                    }
                }
                if (var5 == 434) {
                    class59 var73 = this.field473[var6];
                    if (var73 != null) {
                        this.method164(var73.field1259[0], 2, 0, 0, 1, field89.field1259[0], field89.field1258[0], false, var73.field1258[0], (byte) -85, 1, 0);
                        this.field395 = super.field604;
                        this.field396 = super.field605;
                        this.field398 = 2;
                        this.field397 = 0;
                        this.field132.method202((byte) 64, 147);
                        this.field132.method204(var6);
                    }
                }
                this.field113 = 0;
                this.field189 = 0;
                this.field394 = true;
                if (arg0 != 7) {
                    for (int var74 = 1; var74 > 0; ++var74) {
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method91(byte arg0) {
        if (arg0 != -7) {
            this.field229 = 266;
        }
        for (int var2 = -1; var2 < this.field534; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field532;
            } else {
                var6 = this.field535[var2];
            }
            class66 var7 = this.field533[var6];
            if (var7 != null && var7.field1298 > 0) {
                --var7.field1298;
                if (var7.field1298 == 0) {
                    var7.field1275 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field474; ++var3) {
            int var4 = this.field475[var3];
            class59 var5 = this.field473[var4];
            if (var5 != null && var5.field1298 > 0) {
                --var5.field1298;
                if (var5.field1298 == 0) {
                    var5.field1275 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)I")
    public final int method92(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field132.method203(230);
        }
        int var5 = 256 - arg0;
        return ((arg1 & 16711935) * arg0 + (arg2 & 16711935) * var5 & -16711936) + ((arg1 & 65280) * arg0 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILFTMSICIZ;)V")
    private final void method93(boolean arg0, int arg1, class13 arg2) {
        if (!arg0) {
            this.field132.method203(144);
        }
        while (arg2.field644 + 21 < arg1 * 8) {
            int var4 = arg2.method224(14, 779);
            if (var4 == 16383) {
                break;
            }
            if (this.field473[var4] == null) {
                this.field473[var4] = new class59();
            }
            class59 var5 = this.field473[var4];
            this.field475[this.field474++] = var4;
            var5.field1274 = field282;
            int var6 = arg2.method224(5, 779);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method224(5, 779);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method224(1, 779);
            if (var8 == 1) {
                this.field537[this.field536++] = var4;
            }
            int var9 = arg2.method224(1, 779);
            var5.field1505 = class48.method439(arg2.method224(13, 779));
            var5.field1269 = var5.field1505.field1368;
            var5.field1296 = var5.field1505.field1374;
            var5.field1270 = var5.field1505.field1355;
            var5.field1271 = var5.field1505.field1351;
            var5.field1272 = var5.field1505.field1358;
            var5.field1273 = var5.field1505.field1349;
            var5.field1288 = var5.field1505.field1376;
            var5.method432(field89.field1258[0] + var6, var9 == 1, field89.field1259[0] + var7, 730);
        }
        arg2.method225(462);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        class43 var2 = (class43) this.field140.method422();
        this.field281 &= arg0;
        while (var2 != null) {
            if (this.field411 == var2.field1218 && field282 <= var2.field1217) {
                if (field282 >= var2.field1216) {
                    if (var2.field1206 > 0) {
                        class59 var3 = this.field473[var2.field1206 - 1];
                        if (var3 != null && var3.field1255 >= 0 && var3.field1255 < 13312 && var3.field1256 >= 0 && var3.field1256 < 13312) {
                            var2.method427(this.method106(var3.field1255, (byte) -10, var2.field1218, var3.field1256) - var2.field1215, field282, var3.field1255, this.field141, var3.field1256);
                        }
                    }
                    if (var2.field1206 < 0) {
                        int var4 = -var2.field1206 - 1;
                        class66 var5;
                        if (this.field413 == var4) {
                            var5 = field89;
                        } else {
                            var5 = this.field533[var4];
                        }
                        if (var5 != null && var5.field1255 >= 0 && var5.field1255 < 13312 && var5.field1256 >= 0 && var5.field1256 < 13312) {
                            var2.method427(this.method106(var5.field1255, (byte) -10, var2.field1218, var5.field1256) - var2.field1215, field282, var5.field1255, this.field141, var5.field1256);
                        }
                    }
                    var2.method428(this.field354, 0);
                    this.field143.method498((int) var2.field1223, -44018, var2, (int) var2.field1221, 60, (int) var2.field1222, var2.field1210, this.field411, false, -1);
                }
            } else {
                var2.method418();
            }
            var2 = (class43) this.field140.method424(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method95(boolean arg0) {
        for (int var2 = -1; var2 < this.field534; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field532;
            } else {
                var3 = this.field535[var2];
            }
            class66 var4 = this.field533[var3];
            if (var4 != null) {
                this.method79(45950, 1, var4);
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method96(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field603 == 1) {
            if (super.field604 >= 539 && super.field604 <= 573 && super.field605 >= 169 && super.field605 < 205 && this.field449[0] != -1) {
                this.field394 = true;
                this.field328 = 0;
                this.field188 = true;
            }
            if (super.field604 >= 569 && super.field604 <= 599 && super.field605 >= 168 && super.field605 < 205 && this.field449[1] != -1) {
                this.field394 = true;
                this.field328 = 1;
                this.field188 = true;
            }
            if (super.field604 >= 597 && super.field604 <= 627 && super.field605 >= 168 && super.field605 < 205 && this.field449[2] != -1) {
                this.field394 = true;
                this.field328 = 2;
                this.field188 = true;
            }
            if (super.field604 >= 625 && super.field604 <= 669 && super.field605 >= 168 && super.field605 < 203 && this.field449[3] != -1) {
                this.field394 = true;
                this.field328 = 3;
                this.field188 = true;
            }
            if (super.field604 >= 666 && super.field604 <= 696 && super.field605 >= 168 && super.field605 < 205 && this.field449[4] != -1) {
                this.field394 = true;
                this.field328 = 4;
                this.field188 = true;
            }
            if (super.field604 >= 694 && super.field604 <= 724 && super.field605 >= 168 && super.field605 < 205 && this.field449[5] != -1) {
                this.field394 = true;
                this.field328 = 5;
                this.field188 = true;
            }
            if (super.field604 >= 722 && super.field604 <= 756 && super.field605 >= 169 && super.field605 < 205 && this.field449[6] != -1) {
                this.field394 = true;
                this.field328 = 6;
                this.field188 = true;
            }
            if (super.field604 >= 540 && super.field604 <= 574 && super.field605 >= 466 && super.field605 < 502 && this.field449[7] != -1) {
                this.field394 = true;
                this.field328 = 7;
                this.field188 = true;
            }
            if (super.field604 >= 572 && super.field604 <= 602 && super.field605 >= 466 && super.field605 < 503 && this.field449[8] != -1) {
                this.field394 = true;
                this.field328 = 8;
                this.field188 = true;
            }
            if (super.field604 >= 599 && super.field604 <= 629 && super.field605 >= 466 && super.field605 < 503 && this.field449[9] != -1) {
                this.field394 = true;
                this.field328 = 9;
                this.field188 = true;
            }
            if (super.field604 >= 627 && super.field604 <= 671 && super.field605 >= 467 && super.field605 < 502 && this.field449[10] != -1) {
                this.field394 = true;
                this.field328 = 10;
                this.field188 = true;
            }
            if (super.field604 >= 669 && super.field604 <= 699 && super.field605 >= 466 && super.field605 < 503 && this.field449[11] != -1) {
                this.field394 = true;
                this.field328 = 11;
                this.field188 = true;
            }
            if (super.field604 >= 696 && super.field604 <= 726 && super.field605 >= 466 && super.field605 < 503 && this.field449[12] != -1) {
                this.field394 = true;
                this.field328 = 12;
                this.field188 = true;
            }
            if (super.field604 >= 724 && super.field604 <= 758 && super.field605 >= 466 && super.field605 < 502 && this.field449[13] != -1) {
                this.field394 = true;
                this.field328 = 13;
                this.field188 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field226.method304(233, arg1, arg4);
        this.field227.method304(233, arg1, arg2 + arg4 - 16);
        class5.method33(arg1, this.field541, arg4 + 16, arg2 - 32, this.field350, 16);
        int var7 = (arg2 - 32) * arg2 / arg5;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg2 - 32 - var7) * arg0 / (arg5 - arg2);
        class5.method33(arg1, this.field194, arg4 + 16 + var8, var7, this.field350, 16);
        class5.method38(var7, this.field128, this.field432, arg4 + 16 + var8, arg1);
        if (arg3 != 6) {
            this.field436 = -1;
        }
        class5.method38(var7, this.field128, this.field432, arg4 + 16 + var8, arg1 + 1);
        class5.method36(0, arg4 + 16 + var8, arg1, this.field432, 16);
        class5.method36(0, arg4 + 17 + var8, arg1, this.field432, 16);
        class5.method38(var7, this.field128, this.field425, arg4 + 16 + var8, arg1 + 15);
        class5.method38(var7 - 1, this.field128, this.field425, arg4 + 17 + var8, arg1 + 14);
        class5.method36(0, arg4 + 15 + var8 + var7, arg1, this.field425, 16);
        class5.method36(0, arg4 + 14 + var8 + var7, arg1 + 1, this.field425, 15);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZLKUDWIDHU;)V")
    public final void method98(int arg0, int arg1, boolean arg2, class27 arg3) {
        int var5 = arg0 * arg0 + arg1 * arg1;
        if (!arg2) {
            this.field436 = this.field527.method213();
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field429 + this.field369 & 2047;
            int var7 = class28.field880[var6];
            int var8 = class28.field881[var6];
            int var9 = var7 * 256 / (this.field197 + 256);
            int var10 = var8 * 256 / (this.field197 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field318.method323(20, 83 - var16 - 20, 256, var15 + 94 + 4 - 10, var13, 0, 15, 20, 15);
        } else {
            this.method136(arg1, arg3, -20546, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 == 691) {
            for (class72 var2 = (class72) this.field230.method422(); var2 != null; var2 = (class72) this.field230.method424(false)) {
                if (this.field411 == var2.field1743 && !var2.field1747) {
                    if (field282 >= var2.field1751) {
                        var2.method605(this.field354, (byte) 9);
                        if (var2.field1747) {
                            var2.method418();
                        } else {
                            this.field143.method498(var2.field1746, -44018, var2, var2.field1744, 60, var2.field1745, 0, var2.field1743, false, -1);
                        }
                    }
                } else {
                    var2.method418();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public final void method100(boolean arg0, byte arg1) {
        this.method140(true);
        this.field174.method294(0);
        this.field288.method304(233, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field367 == 0) {
            int var5 = var4 / 2 + 80;
            this.field405.method14(true, var3 / 2, 2, this.field393.field925, var5, 7711145);
            int var6 = var4 / 2 - 20;
            this.field407.method14(true, var3 / 2, 2, "Welcome to RuneScape", var6, 16776960);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field289.method304(233, var7 - 73, var8 - 20);
            this.field407.method14(true, var7, 2, "New User", var8 + 5, 16777215);
            int var9 = var3 / 2 + 80;
            this.field289.method304(233, var9 - 73, var8 - 20);
            this.field407.method14(true, var9, 2, "Existing User", var8 + 5, 16777215);
        }
        if (this.field367 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field453.length() > 0) {
                this.field407.method14(true, var3 / 2, 2, this.field453, var10 - 15, 16776960);
                this.field407.method14(true, var3 / 2, 2, this.field454, var10, 16776960);
                var10 += 30;
            } else {
                this.field407.method14(true, var3 / 2, 2, this.field454, var10 - 7, 16776960);
                var10 += 30;
            }
            this.field407.method21(var3 / 2 - 90, var10, true, (byte) 6, "Username: " + this.field105 + (this.field330 == 0 & field282 % 40 < 20 ? "@yel@|" : ""), 16777215);
            var10 += 15;
            this.field407.method21(var3 / 2 - 88, var10, true, (byte) 6, "Password: " + class51.method450(this.field106, 0) + (this.field330 == 1 & field282 % 40 < 20 ? "@yel@|" : ""), 16777215);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field289.method304(233, var11 - 73, var12 - 20);
                this.field407.method14(true, var11, 2, "Login", var12 + 5, 16777215);
                int var13 = var3 / 2 + 80;
                this.field289.method304(233, var13 - 73, var12 - 20);
                this.field407.method14(true, var13, 2, "Cancel", var12 + 5, 16777215);
            }
        }
        if (this.field367 == 3) {
            this.field407.method14(true, var3 / 2, 2, "Create a free account", var4 / 2 - 60, 16776960);
            int var14 = var4 / 2 - 35;
            this.field407.method14(true, var3 / 2, 2, "To create a new account you need to", var14, 16777215);
            int var18 = var14 + 15;
            this.field407.method14(true, var3 / 2, 2, "go back to the main RuneScape webpage", var18, 16777215);
            int var19 = var18 + 15;
            this.field407.method14(true, var3 / 2, 2, "and choose the 'create account'", var19, 16777215);
            int var20 = var19 + 15;
            this.field407.method14(true, var3 / 2, 2, "button near the top of that page.", var20, 16777215);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field289.method304(233, var15 - 73, var16 - 20);
            this.field407.method14(true, var15, 2, "Cancel", var16 + 5, 16777215);
        }
        this.field174.method295(171, -895, super.field589, 202);
        if (arg1 != 8) {
            field386 = !field386;
        }
        if (this.field271) {
            this.field271 = false;
            this.field172.method295(0, -895, super.field589, 128);
            this.field173.method295(371, -895, super.field589, 202);
            this.field177.method295(265, -895, super.field589, 0);
            this.field178.method295(265, -895, super.field589, 562);
            this.field179.method295(171, -895, super.field589, 128);
            this.field180.method295(171, -895, super.field589, 562);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LPCARWQQC;I)Z")
    public final boolean method101(class36 arg0, int arg1) {
        int var3 = arg0.field1061;
        if (arg1 != 1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field126[this.field428] = "Remove @whi@" + arg0.field1104;
                this.field185[this.field428] = 9;
                ++this.field428;
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
            this.field126[this.field428] = "Remove @whi@" + this.field468[var3];
            this.field185[this.field428] = 140;
            ++this.field428;
            this.field126[this.field428] = "Message @whi@" + this.field468[var3];
            this.field185[this.field428] = 363;
            ++this.field428;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method102(int arg0) {
        int var2 = 56 / arg0;
        if (super.field603 == 1) {
            if (super.field604 >= 6 && super.field604 <= 106 && super.field605 >= 467 && super.field605 <= 499) {
                this.field334 = (this.field334 + 1) % 4;
                this.field171 = true;
                this.field452 = true;
                this.field132.method202((byte) 64, 206);
                this.field132.method203(this.field334);
                this.field132.method203(this.field460);
                this.field132.method203(this.field484);
            }
            if (super.field604 >= 135 && super.field604 <= 235 && super.field605 >= 467 && super.field605 <= 499) {
                this.field460 = (this.field460 + 1) % 3;
                this.field171 = true;
                this.field452 = true;
                this.field132.method202((byte) 64, 206);
                this.field132.method203(this.field334);
                this.field132.method203(this.field460);
                this.field132.method203(this.field484);
            }
            if (super.field604 >= 273 && super.field604 <= 373 && super.field605 >= 467 && super.field605 <= 499) {
                this.field484 = (this.field484 + 1) % 3;
                this.field171 = true;
                this.field452 = true;
                this.field132.method202((byte) 64, 206);
                this.field132.method203(this.field334);
                this.field132.method203(this.field460);
                this.field132.method203(this.field484);
            }
            if (super.field604 >= 412 && super.field604 <= 512 && super.field605 >= 467 && super.field605 <= 499) {
                if (this.field142 == -1) {
                    this.method170(-618);
                    this.field244 = "";
                    this.field489 = false;
                    this.field554 = this.field142 = class36.field1036;
                    return;
                }
                this.method177("Please close the interface you have open before using 'report abuse'", "", 0, 20045);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method103(int arg0) {
        this.field296 = null;
        this.field336 = null;
        this.field66 = null;
        this.field467 = null;
        this.field337 = null;
        this.field338 = null;
        this.field278 = null;
        this.field427 = null;
        this.field218 = null;
        this.field219 = null;
        this.field220 = null;
        this.field221 = null;
        this.field222 = null;
        this.field130 = null;
        this.field131 = null;
        this.field372 = null;
        this.field490 = null;
        this.field491 = null;
        this.field492 = null;
        this.field132 = null;
        this.field295 = null;
        this.field527 = null;
        this.field473 = null;
        this.field475 = null;
        this.field468 = null;
        this.field101 = null;
        this.field243 = null;
        this.field240 = null;
        this.field273 = null;
        this.field463 = null;
        this.field501 = null;
        this.field464 = null;
        this.field309 = null;
        this.field448 = null;
        this.method129(419);
        this.field305 = null;
        this.field306 = null;
        this.field307 = null;
        this.field177 = null;
        this.field178 = null;
        this.field179 = null;
        this.field180 = null;
        this.field78 = null;
        this.field79 = null;
        this.field80 = null;
        this.field81 = null;
        this.field298 = null;
        this.field299 = null;
        this.field300 = null;
        this.field301 = null;
        this.field302 = null;
        this.field533 = null;
        this.field535 = null;
        this.field537 = null;
        this.field538 = null;
        this.field104 = null;
        this.field497 = null;
        this.field223 = null;
        this.field152 = null;
        this.field153 = null;
        this.field154 = null;
        this.field511 = null;
        int var2 = 87 / arg0;
        this.field556 = null;
        this.field143 = null;
        this.field339 = null;
        this.field175 = null;
        this.field176 = null;
        this.field172 = null;
        this.field173 = null;
        this.field174 = null;
        this.field528 = null;
        this.field82 = null;
        this.field83 = null;
        this.field84 = null;
        this.field85 = null;
        this.field86 = null;
        if (this.field543 != null) {
            this.field543.field675 = false;
        }
        this.field543 = null;
        this.field544 = null;
        this.field514 = null;
        this.field515 = null;
        this.field516 = null;
        this.field517 = null;
        this.field518 = null;
        this.field280 = null;
        this.field385 = null;
        this.field268 = null;
        this.field269 = null;
        if (this.field393 != null) {
            this.field393.method363();
        }
        this.field393 = null;
        this.field472 = null;
        try {
            if (this.field351 != null) {
                this.field351.method456();
            }
        } catch (Exception var3) {
        }
        this.field351 = null;
        this.field455 = null;
        this.field456 = null;
        this.field457 = null;
        this.field458 = null;
        this.field183 = null;
        this.field184 = null;
        this.field185 = null;
        this.field186 = null;
        this.field126 = null;
        this.field140 = null;
        this.field230 = null;
        this.field549 = null;
        this.field248 = null;
        this.method135(-513);
        class39.method415(this.field228);
        class48.method438(this.field228);
        class34.method382(this.field228);
        class36.method400(this.field228);
        class57.field1491 = null;
        class64.field1598 = null;
        class32.field942 = null;
        class37.field1113 = null;
        class24.field759 = null;
        class24.field771 = null;
        class21.field713 = null;
        super.field590 = null;
        class66.field1614 = null;
        class71.method588(this.field228);
        class63.method486(this.field228);
        class28.method326(this.field228);
        class53.method453(this.field228);
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method104(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method105(int arg0, boolean arg1) {
        this.field281 &= arg1;
        if (!field121) {
            for (int var3 = 0; var3 < this.field365.length; ++var3) {
                int var4 = this.field365[var3];
                if (class71.field1739[var4] >= arg0) {
                    class22 var5 = class71.field1733[var4];
                    int var6 = var5.field732 * var5.field731 - 1;
                    int var7 = this.field354 * var5.field731 * 2;
                    byte[] var8 = var5.field729;
                    byte[] var9 = this.field497;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field729 = var9;
                    this.field497 = var8;
                    class71.method595((byte) -75, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)I")
    public final int method106(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg2 < 3 && (this.field556[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg3 & 127;
            if (arg1 != -10) {
                return this.field350;
            } else {
                int var10 = (128 - var8) * this.field511[var7][var5][var6] + this.field511[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field511[var7][var5][var6 + 1] + this.field511[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method107(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method107(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public void method108(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field359);
        if (this.field393 != null) {
            System.out.println("Od-cycle:" + this.field393.field901);
        }
        System.out.println("loop-cycle:" + field282);
        System.out.println("draw-cycle:" + field496);
        if (arg0 != -36) {
            this.field229 = 478;
        }
        System.out.println("ptype:" + this.field436);
        System.out.println("psize:" + this.field435);
        if (this.field351 != null) {
            this.field351.method461(this.field225);
        }
        super.field586 = true;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final Component method109(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field592 != null ? super.field592 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method110(byte arg0) {
        if (this.field428 >= 2 || this.field113 != 0 || this.field189 != 0) {
            String var2;
            if (this.field113 == 1 && this.field428 < 2) {
                var2 = "Use " + this.field117 + " with...";
            } else if (this.field189 == 1 && this.field428 < 2) {
                var2 = this.field192 + "...";
            } else {
                var2 = this.field126[this.field428 - 1];
            }
            if (this.field428 > 2) {
                var2 = var2 + "@whi@ / " + (this.field428 - 2) + " more options";
            }
            this.field407.method22(field282 / 1000, var2, 4, true, 16777215, true, 15);
            if (arg0 != -118) {
                field386 = !field386;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
    public final void method111(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field241 >= 100 && this.field68 != 1) {
                this.method177("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0, 20045);
            } else if (this.field241 >= 200) {
                this.method177("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0, 20045);
            } else {
                String var4 = class51.method449(class51.method446(arg1, (byte) 5), 78);
                for (int var5 = 0; var5 < this.field241; ++var5) {
                    if (this.field101[var5] == arg1) {
                        this.method177(var4 + " is already on your friend list", "", 0, 20045);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field292; ++var6) {
                    if (this.field157[var6] == arg1) {
                        this.method177("Please remove " + var4 + " from your ignore list first", "", 0, 20045);
                        return;
                    }
                }
                if (!var4.equals(field89.field1642)) {
                    this.field468[this.field241] = var4;
                    if (arg0 != 8) {
                        this.field327 = this.field512.method544();
                    }
                    this.field101[this.field241] = arg1;
                    this.field243[this.field241] = 0;
                    ++this.field241;
                    this.field394 = true;
                    this.field132.method202((byte) 64, 253);
                    this.field132.method209(arg1, (byte) 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method112(int arg0) {
        if (super.field590 == null) {
            this.method135(-513);
            this.field172 = null;
            this.field173 = null;
            this.field174 = null;
            this.field175 = null;
            int var2 = 80 / arg0;
            this.field176 = null;
            this.field177 = null;
            this.field178 = null;
            this.field179 = null;
            this.field180 = null;
            this.field458 = null;
            this.field456 = null;
            this.field455 = null;
            this.field457 = null;
            this.field305 = null;
            this.field306 = null;
            this.field307 = null;
            super.field590 = new class20(this.method109(-61), 765, 430, 503);
            this.field271 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
    public final void method113(byte arg0, int arg1) {
        if (this.field469 != arg0) {
            this.field132.method203(71);
        }
        int var3 = class21.field713[arg1].field721;
        if (var3 != 0) {
            int var4 = this.field544[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class71.method597(0.9D, 2);
                }
                if (var4 == 2) {
                    class71.method597(0.8D, 2);
                }
                if (var4 == 3) {
                    class71.method597(0.7D, 2);
                }
                if (var4 == 4) {
                    class71.method597(0.6D, 2);
                }
                class34.field1021.method200();
                this.field271 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field163;
                if (var4 == 0) {
                    this.method162(this.field163, 0, 0);
                    this.field163 = true;
                }
                if (var4 == 1) {
                    this.method162(this.field163, -400, 0);
                    this.field163 = true;
                }
                if (var4 == 2) {
                    this.method162(this.field163, -800, 0);
                    this.field163 = true;
                }
                if (var4 == 3) {
                    this.method162(this.field163, -1200, 0);
                    this.field163 = true;
                }
                if (var4 == 4) {
                    this.field163 = false;
                }
                if (this.field163 != var5 && !field121) {
                    if (this.field163) {
                        this.field378 = this.field94;
                        this.field379 = true;
                        this.field393.method366(2, this.field378);
                    } else {
                        this.method129(419);
                    }
                    this.field136 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field290 = true;
                    this.method68(0, -692);
                }
                if (var4 == 1) {
                    this.field290 = true;
                    this.method68(-400, -692);
                }
                if (var4 == 2) {
                    this.field290 = true;
                    this.method68(-800, -692);
                }
                if (var4 == 3) {
                    this.field290 = true;
                    this.method68(-1200, -692);
                }
                if (var4 == 4) {
                    this.field290 = false;
                }
            }
            if (var3 == 5) {
                this.field303 = var4;
            }
            if (var3 == 6) {
                this.field151 = var4;
            }
            if (var3 == 8) {
                this.field276 = var4;
                this.field452 = true;
            }
            if (var3 == 9) {
                this.field499 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method114(int arg0) {
        int var2 = this.field206;
        int var3 = this.field207;
        int var4 = this.field208;
        int var5 = this.field209;
        if (arg0 != 45528) {
            this.method120();
        }
        int var6 = 6116423;
        class5.method33(var2, var6, var3, var5, this.field350, var4);
        class5.method33(var2 + 1, 0, var3 + 1, 16, this.field350, var4 - 2);
        class5.method34(var4 - 2, var5 - 19, 0, var2 + 1, var3 + 18, true);
        this.field407.method17(779, "Choose Option", var2 + 3, var3 + 14, var6);
        int var7 = super.field597;
        int var8 = super.field598;
        if (this.field205 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field205 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field205 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field428; ++var9) {
            int var10 = (this.field428 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field407.method21(var2 + 3, var10, true, (byte) 6, this.field126[var9], var11);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method115(int arg0, String arg1) {
        this.field435 += arg0;
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field241; ++var3) {
                if (arg1.equalsIgnoreCase(this.field468[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field89.field1642);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFTMSICIZ;ZIILYFPQHQAV;)V")
    private final void method116(class13 arg0, boolean arg1, int arg2, int arg3, class66 arg4) {
        if (!arg1) {
            if ((arg2 & 32) != 0) {
                int var6 = arg0.method242(4);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = arg0.method233(7);
                if (arg4.field1279 == var6 && var6 != -1) {
                    int var8 = class37.field1113[var6].field1127;
                    if (var8 == 1) {
                        arg4.field1280 = 0;
                        arg4.field1281 = 0;
                        arg4.field1282 = var7;
                        arg4.field1283 = 0;
                    }
                    if (var8 == 2) {
                        arg4.field1283 = 0;
                    }
                } else if (var6 == -1 || arg4.field1279 == -1 || class37.field1113[var6].field1121 >= class37.field1113[arg4.field1279].field1121) {
                    arg4.field1279 = var6;
                    arg4.field1280 = 0;
                    arg4.field1281 = 0;
                    arg4.field1282 = var7;
                    arg4.field1283 = 0;
                    arg4.field1268 = arg4.field1306;
                }
            }
            if ((arg2 & 64) != 0) {
                int var9 = arg0.method213();
                byte[] var10 = new byte[var9];
                class13 var11 = new class13(var10, (byte) 3);
                arg0.method222(0, var10, var9, -10);
                this.field538[arg3] = var11;
                arg4.method548(2, var11);
            }
            if ((arg2 & 128) != 0) {
                arg4.field1275 = arg0.method220();
                if (arg4.field1275.charAt(0) == '~') {
                    arg4.field1275 = arg4.field1275.substring(1);
                    this.method177(arg4.field1275, arg4.field1642, 2, 20045);
                } else if (field89 == arg4) {
                    this.method177(arg4.field1275, arg4.field1642, 2, 20045);
                }
                arg4.field1285 = 0;
                arg4.field1295 = 0;
                arg4.field1298 = 150;
            }
            if ((arg2 & 4) != 0) {
                int var12 = arg0.method233(7);
                int var13 = arg0.method213();
                arg4.method431(var13, this.field150, var12, field282);
                arg4.field1303 = field282 + 300;
                arg4.field1304 = arg0.method233(7);
                arg4.field1305 = arg0.method234(false);
            }
            if ((arg2 & 8) != 0) {
                int var14 = arg0.method215();
                int var15 = arg0.method234(false);
                int var16 = arg0.method233(7);
                int var17 = arg0.field643;
                if (arg4.field1642 != null && arg4.field1628) {
                    long var18 = class51.method445(arg4.field1642);
                    boolean var20 = false;
                    if (var15 <= 1) {
                        for (int var21 = 0; var21 < this.field292; ++var21) {
                            if (this.field157[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    }
                    if (!var20 && this.field348 == 0) {
                        try {
                            this.field472.field643 = 0;
                            arg0.method252(-476, 0, this.field472.field642, var16);
                            this.field472.field643 = 0;
                            String var22 = class50.method442(0, this.field472, var16);
                            String var23 = class17.method264(var22, true);
                            arg4.field1275 = var23;
                            arg4.field1285 = var14 >> 8;
                            arg4.field1295 = var14 & 255;
                            arg4.field1298 = 150;
                            if (var15 != 2 && var15 != 3) {
                                if (var15 == 1) {
                                    this.method177(var23, "@cr1@" + arg4.field1642, 1, 20045);
                                } else {
                                    this.method177(var23, arg4.field1642, 2, 20045);
                                }
                            } else {
                                this.method177(var23, "@cr2@" + arg4.field1642, 1, 20045);
                            }
                        } catch (Exception var28) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg0.field643 = var16 + var17;
            }
            if ((arg2 & 256) != 0) {
                arg4.field1250 = arg0.method215();
                int var25 = arg0.method249(this.field293);
                arg4.field1254 = var25 >> 16;
                arg4.field1253 = (var25 & 65535) + field282;
                arg4.field1251 = 0;
                arg4.field1252 = 0;
                if (arg4.field1253 > field282) {
                    arg4.field1251 = -1;
                }
                if (arg4.field1250 == 65535) {
                    arg4.field1250 = -1;
                }
            }
            if ((arg2 & 1024) != 0) {
                int var26 = arg0.method213();
                int var27 = arg0.method232(-48253);
                arg4.method431(var27, this.field150, var26, field282);
                arg4.field1303 = field282 + 300;
                arg4.field1304 = arg0.method233(7);
                arg4.field1305 = arg0.method233(7);
            }
            if ((arg2 & 1) != 0) {
                arg4.field1293 = arg0.method242(4);
                arg4.field1294 = arg0.method242(4);
            }
            if ((arg2 & 512) != 0) {
                arg4.field1260 = arg0.method213();
                arg4.field1262 = arg0.method233(7);
                arg4.field1261 = arg0.method234(false);
                arg4.field1263 = arg0.method213();
                arg4.field1264 = arg0.method215() + field282;
                arg4.field1265 = arg0.method215() + field282;
                arg4.field1266 = arg0.method232(-48253);
                arg4.method429(-833);
            }
            if ((arg2 & 2) != 0) {
                arg4.field1284 = arg0.method215();
                if (arg4.field1284 == 65535) {
                    arg4.field1284 = -1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)V")
    public final void method117(byte arg0, int arg1, int arg2) {
        int var4 = 0;
        if (arg0 == 9) {
            boolean var5 = false;
        } else {
            this.field436 = this.field527.method213();
        }
        for (int var6 = 0; var6 < 100; ++var6) {
            if (this.field312[var6] != null) {
                int var7 = this.field310[var6];
                int var8 = 70 - var4 * 14 + this.field217 + 4;
                if (var8 < -20) {
                    break;
                }
                String var9 = this.field311[var6];
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
                if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field334 == 0 || this.field334 == 1 && this.method115(0, var9))) {
                    if (arg1 > var8 - 14 && arg1 <= var8 && !var9.equals(field89.field1642)) {
                        if (this.field181 >= 1) {
                            this.field126[this.field428] = "Report abuse @whi@" + var9;
                            this.field185[this.field428] = 243;
                            ++this.field428;
                        }
                        this.field126[this.field428] = "Add ignore @whi@" + var9;
                        this.field185[this.field428] = 950;
                        ++this.field428;
                        this.field126[this.field428] = "Add friend @whi@" + var9;
                        this.field185[this.field428] = 143;
                        ++this.field428;
                    }
                    ++var4;
                }
                if ((var7 == 3 || var7 == 7) && this.field276 == 0 && (var7 == 7 || this.field460 == 0 || this.field460 == 1 && this.method115(0, var9))) {
                    if (arg1 > var8 - 14 && arg1 <= var8) {
                        if (this.field181 >= 1) {
                            this.field126[this.field428] = "Report abuse @whi@" + var9;
                            this.field185[this.field428] = 243;
                            ++this.field428;
                        }
                        this.field126[this.field428] = "Add ignore @whi@" + var9;
                        this.field185[this.field428] = 950;
                        ++this.field428;
                        this.field126[this.field428] = "Add friend @whi@" + var9;
                        this.field185[this.field428] = 143;
                        ++this.field428;
                    }
                    ++var4;
                }
                if (var7 == 4 && (this.field484 == 0 || this.field484 == 1 && this.method115(0, var9))) {
                    if (arg1 > var8 - 14 && arg1 <= var8) {
                        this.field126[this.field428] = "Accept trade @whi@" + var9;
                        this.field185[this.field428] = 793;
                        ++this.field428;
                    }
                    ++var4;
                }
                if ((var7 == 5 || var7 == 6) && this.field276 == 0 && this.field460 < 2) {
                    ++var4;
                }
                if (var7 == 8 && (this.field484 == 0 || this.field484 == 1 && this.method115(0, var9))) {
                    if (arg1 > var8 - 14 && arg1 <= var8) {
                        this.field126[this.field428] = "Accept challenge @whi@" + var9;
                        this.field185[this.field428] = 510;
                        ++this.field428;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method118(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.field304 = !this.field304;
        }
        for (int var3 = 0; var3 < this.field474; ++var3) {
            class59 var4 = this.field473[this.field475[var3]];
            int var5 = (this.field475[var3] << 14) + 536870912;
            if (var4 != null && var4.method433(172) && var4.field1505.field1359 == arg0 && var4.field1505.method434(42371)) {
                int var6 = var4.field1255 >> 7;
                int var7 = var4.field1256 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1269 == 1 && (var4.field1255 & 127) == 64 && (var4.field1256 & 127) == 64) {
                        if (this.field296[var6][var7] == this.field519) {
                            continue;
                        }
                        this.field296[var6][var7] = this.field519;
                    }
                    if (!var4.field1505.field1365) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field143.method498(this.method106(var4.field1255, (byte) -10, this.field411, var4.field1256), -44018, var4, var4.field1255, (var4.field1269 - 1) * 64 + 60, var4.field1256, var4.field1257, this.field411, var4.field1290, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCUNUEMWX;I)V")
    private final void method119(class8 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field568 == 0) {
            var3 = this.field143.method513(arg0.field567, arg0.field569, arg0.field570);
        }
        if (arg0.field568 == 1) {
            var3 = this.field143.method514(arg0.field567, arg0.field569, 0, arg0.field570);
        }
        if (arg0.field568 == 2) {
            var3 = this.field143.method515(arg0.field567, arg0.field569, arg0.field570);
        }
        if (arg0.field568 == 3) {
            var3 = this.field143.method516(arg0.field567, arg0.field569, arg0.field570);
        }
        if (var3 != 0) {
            int var7 = this.field143.method517(arg0.field567, arg0.field569, arg0.field570, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field559 = var4;
        if (arg1 <= 0) {
            this.field480 = this.field512.method544();
        }
        arg0.field561 = var5;
        arg0.field560 = var6;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method120() {
        this.method172(-23874, "Starting up", 20);
        if (signlink.sunjava) {
            super.field583 = 5;
        }
        if (field362) {
            this.field347 = true;
        } else {
            field362 = true;
            boolean var1 = false;
            String var2 = this.method187((byte) -124);
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
                this.field139 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field294[var3] = new class3(false, var3 + 1, signlink.cache_dat, signlink.cache_idx[var3], 600000);
                    }
                }
                try {
                    this.method123(-6102);
                    this.field182 = this.method179("title screen", 1, this.field73[1], 25, "title", 1);
                    this.field405 = new class4(this.field182, "p11_full", false, false);
                    this.field406 = new class4(this.field182, "p12_full", false, false);
                    this.field407 = new class4(this.field182, "b12_full", false, false);
                    this.field408 = new class4(this.field182, "q8_full", false, true);
                    this.method66(true);
                    this.method144((byte) 8);
                    class2 var4 = this.method179("config", 2, this.field73[2], 30, "config", 1);
                    class2 var5 = this.method179("interface", 3, this.field73[3], 35, "interface", 1);
                    class2 var6 = this.method179("2d graphics", 4, this.field73[4], 40, "media", 1);
                    class2 var7 = this.method179("textures", 6, this.field73[6], 45, "textures", 1);
                    class2 var8 = this.method179("chat system", 7, this.field73[7], 50, "wordenc", 1);
                    class2 var9 = this.method179("sound effects", 8, this.field73[8], 55, "sounds", 1);
                    this.field556 = new byte[4][104][104];
                    this.field511 = new int[4][105][105];
                    this.field143 = new class63(104, this.field511, 104, 0, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field339[var10] = new class70(-14416, 104, 104);
                    }
                    this.field448 = new class27(512, 512);
                    class2 var11 = this.method179("update list", 5, this.field73[5], 60, "versionlist", 1);
                    this.method172(-23874, "Connecting to update server", 60);
                    this.field393 = new class30();
                    this.field393.method373(var11, this);
                    class53.method451(this.field393.method369((byte) -117));
                    class28.method327(this.field393.method359((byte) -58, 0), this.field393);
                    if (!field121) {
                        this.field378 = 0;
                        this.field379 = true;
                        this.field393.method366(2, this.field378);
                        while (this.field393.method377() > 0) {
                            this.method165(8);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                            if (this.field393.field908 > 3) {
                                this.method104("ondemand");
                                return;
                            }
                        }
                    }
                    this.method172(-23874, "Requesting animations", 65);
                    int var12 = this.field393.method359((byte) -58, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field393.method366(1, var13);
                    }
                    while (this.field393.method377() > 0) {
                        int var14 = var12 - this.field393.method377();
                        if (var14 > 0) {
                            this.method172(-23874, "Loading animations - " + var14 * 100 / var12 + "%", 65);
                        }
                        this.method165(8);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                        if (this.field393.field908 > 3) {
                            this.method104("ondemand");
                            return;
                        }
                    }
                    this.method172(-23874, "Requesting models", 70);
                    int var15 = this.field393.method359((byte) -58, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field393.method374(true, var16);
                        if ((var17 & 1) != 0) {
                            this.field393.method366(0, var16);
                        }
                    }
                    int var18 = this.field393.method377();
                    while (this.field393.method377() > 0) {
                        int var19 = var18 - this.field393.method377();
                        if (var19 > 0) {
                            this.method172(-23874, "Loading models - " + var19 * 100 / var18 + "%", 70);
                        }
                        this.method165(8);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field294[0] != null) {
                        this.method172(-23874, "Requesting maps", 75);
                        this.field393.method366(3, this.field393.method371(0, 48, 0, 47));
                        this.field393.method366(3, this.field393.method371(0, 48, 1, 47));
                        this.field393.method366(3, this.field393.method371(0, 48, 0, 48));
                        this.field393.method366(3, this.field393.method371(0, 48, 1, 48));
                        this.field393.method366(3, this.field393.method371(0, 48, 0, 49));
                        this.field393.method366(3, this.field393.method371(0, 48, 1, 49));
                        this.field393.method366(3, this.field393.method371(0, 47, 0, 47));
                        this.field393.method366(3, this.field393.method371(0, 47, 1, 47));
                        this.field393.method366(3, this.field393.method371(0, 47, 0, 48));
                        this.field393.method366(3, this.field393.method371(0, 47, 1, 48));
                        this.field393.method366(3, this.field393.method371(0, 148, 0, 48));
                        this.field393.method366(3, this.field393.method371(0, 148, 1, 48));
                        int var20 = this.field393.method377();
                        while (this.field393.method377() > 0) {
                            int var21 = var20 - this.field393.method377();
                            if (var21 > 0) {
                                this.method172(-23874, "Loading maps - " + var21 * 100 / var20 + "%", 75);
                            }
                            this.method165(8);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var22 = this.field393.method359((byte) -58, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field393.method374(true, var23);
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
                            this.field393.method365(0, var25, var23, 55);
                        }
                    }
                    this.field393.method360((byte) -122, field120);
                    if (!field121) {
                        int var26 = this.field393.method359((byte) -58, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field393.method367(0, var27)) {
                                this.field393.method365(2, (byte) 1, var27, 55);
                            }
                        }
                    }
                    int var28 = this.field393.method359((byte) -58, 0);
                    for (int var29 = 0; var29 < var28; ++var29) {
                        int var30 = this.field393.method374(true, var29);
                        if (var30 == 0 && this.field393.field905 < 200) {
                            this.field393.method365(0, (byte) 1, var29, 55);
                        }
                    }
                    this.method172(-23874, "Unpacking media", 80);
                    this.field490 = new class22(var6, "invback", 0);
                    this.field492 = new class22(var6, "chatback", 0);
                    this.field491 = new class22(var6, "mapback", 0);
                    this.field152 = new class22(var6, "backbase1", 0);
                    this.field153 = new class22(var6, "backbase2", 0);
                    this.field154 = new class22(var6, "backhmid1", 0);
                    for (int var31 = 0; var31 < 13; ++var31) {
                        this.field223[var31] = new class22(var6, "sideicons", var31);
                    }
                    this.field240 = new class27(var6, "compass", 0);
                    this.field318 = new class27(var6, "mapedge", 0);
                    this.field318.method315(true);
                    for (int var32 = 0; var32 < 72; ++var32) {
                        this.field549[var32] = new class22(var6, "mapscene", var32);
                    }
                    for (int var33 = 0; var33 < 70; ++var33) {
                        this.field248[var33] = new class27(var6, "mapfunction", var33);
                    }
                    for (int var34 = 0; var34 < 5; ++var34) {
                        this.field273[var34] = new class27(var6, "hitmarks", var34);
                    }
                    for (int var35 = 0; var35 < 6; ++var35) {
                        this.field463[var35] = new class27(var6, "headicons_pk", var35);
                    }
                    for (int var36 = 0; var36 < 9; ++var36) {
                        this.field501[var36] = new class27(var6, "headicons_prayer", var36);
                    }
                    for (int var37 = 0; var37 < 6; ++var37) {
                        this.field464[var37] = new class27(var6, "headicons_hint", var37);
                    }
                    this.field528 = new class27(var6, "overlay_multiway", 0);
                    this.field504 = new class27(var6, "mapmarker", 0);
                    this.field505 = new class27(var6, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field309[var38] = new class27(var6, "cross", var38);
                    }
                    this.field514 = new class27(var6, "mapdots", 0);
                    this.field515 = new class27(var6, "mapdots", 1);
                    this.field516 = new class27(var6, "mapdots", 2);
                    this.field517 = new class27(var6, "mapdots", 3);
                    this.field518 = new class27(var6, "mapdots", 4);
                    this.field226 = new class22(var6, "scrollbar", 0);
                    this.field227 = new class22(var6, "scrollbar", 1);
                    this.field298 = new class22(var6, "redstone1", 0);
                    this.field299 = new class22(var6, "redstone2", 0);
                    this.field300 = new class22(var6, "redstone3", 0);
                    this.field301 = new class22(var6, "redstone1", 0);
                    this.field301.method301(33787);
                    this.field302 = new class22(var6, "redstone2", 0);
                    this.field302.method301(33787);
                    this.field218 = new class22(var6, "redstone1", 0);
                    this.field218.method302(-837);
                    this.field219 = new class22(var6, "redstone2", 0);
                    this.field219.method302(-837);
                    this.field220 = new class22(var6, "redstone3", 0);
                    this.field220.method302(-837);
                    this.field221 = new class22(var6, "redstone1", 0);
                    this.field221.method301(33787);
                    this.field221.method302(-837);
                    this.field222 = new class22(var6, "redstone2", 0);
                    this.field222.method301(33787);
                    this.field222.method302(-837);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field482[var39] = new class22(var6, "mod_icons", var39);
                    }
                    class27 var40 = new class27(var6, "backleft1", 0);
                    this.field78 = new class20(this.method109(-61), var40.field797, 430, var40.field798);
                    var40.method316(0, 0, 0);
                    class27 var41 = new class27(var6, "backleft2", 0);
                    this.field79 = new class20(this.method109(-61), var41.field797, 430, var41.field798);
                    var41.method316(0, 0, 0);
                    class27 var42 = new class27(var6, "backright1", 0);
                    this.field80 = new class20(this.method109(-61), var42.field797, 430, var42.field798);
                    var42.method316(0, 0, 0);
                    class27 var43 = new class27(var6, "backright2", 0);
                    this.field81 = new class20(this.method109(-61), var43.field797, 430, var43.field798);
                    var43.method316(0, 0, 0);
                    class27 var44 = new class27(var6, "backtop1", 0);
                    this.field82 = new class20(this.method109(-61), var44.field797, 430, var44.field798);
                    var44.method316(0, 0, 0);
                    class27 var45 = new class27(var6, "backvmid1", 0);
                    this.field83 = new class20(this.method109(-61), var45.field797, 430, var45.field798);
                    var45.method316(0, 0, 0);
                    class27 var46 = new class27(var6, "backvmid2", 0);
                    this.field84 = new class20(this.method109(-61), var46.field797, 430, var46.field798);
                    var46.method316(0, 0, 0);
                    class27 var47 = new class27(var6, "backvmid3", 0);
                    this.field85 = new class20(this.method109(-61), var47.field797, 430, var47.field798);
                    var47.method316(0, 0, 0);
                    class27 var48 = new class27(var6, "backhmid2", 0);
                    this.field86 = new class20(this.method109(-61), var48.field797, 430, var48.field798);
                    var48.method316(0, 0, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 100; ++var53) {
                        if (this.field248[var53] != null) {
                            this.field248[var53].method314(field386, var50 + var52, var51 + var52, var49 + var52);
                        }
                        if (this.field549[var53] != null) {
                            this.field549[var53].method303(field386, var50 + var52, var51 + var52, var49 + var52);
                        }
                    }
                    this.method172(-23874, "Unpacking textures", 83);
                    class71.method593(9, var7);
                    class71.method597(0.8D, 2);
                    class71.method592(-714, 20);
                    this.method172(-23874, "Unpacking config", 86);
                    class37.method404(true, var4);
                    class39.method412(var4);
                    class57.method468(true, var4);
                    class34.method389(var4);
                    class48.method441(var4);
                    class64.method538(true, var4);
                    class24.method306(true, var4);
                    class21.method297(true, var4);
                    class35.method392(true, var4);
                    class34.field971 = field120;
                    if (!field121) {
                        this.method172(-23874, "Unpacking sounds", 90);
                        byte[] var54 = var9.method7("sounds.dat", (byte[]) null);
                        class13 var55 = new class13(var54, (byte) 3);
                        class56.method462(true, var55);
                    }
                    this.method172(-23874, "Unpacking interfaces", 95);
                    class4[] var56 = new class4[] { this.field405, this.field406, this.field407, this.field408 };
                    class36.method401(var56, var6, false, var5);
                    this.method172(-23874, "Preparing game engine", 100);
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field491.field729[this.field491.field731 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field149[var57] = var58;
                        this.field485[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field491.field729[this.field491.field731 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field266[var61 - 5] = var62 - 25;
                        this.field165[var61 - 5] = var63 - var62;
                    }
                    class71.method590(503, (byte) 7, 765);
                    this.field322 = class71.field1731;
                    class71.method590(96, (byte) 7, 479);
                    this.field319 = class71.field1731;
                    class71.method590(261, (byte) 7, 190);
                    this.field320 = class71.field1731;
                    class71.method590(334, (byte) 7, 512);
                    this.field321 = class71.field1731;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = class71.field1729[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    class63.method523(var65, 334, 512, 800, 500, true);
                    class17.method254(var8);
                    this.field543 = new class16(0, this);
                    this.method107(this.field543, 10);
                    class15.field661 = this;
                    class39.field1175 = this;
                    class48.field1372 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field420 + " " + this.field443);
                    this.field325 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LPCARWQQC;I)Z")
    public final boolean method121(class36 arg0, int arg1) {
        int var3 = arg0.field1061;
        if (arg1 >= 0) {
            this.field436 = -1;
        }
        if (this.field242 == 2) {
            if (var3 == 201) {
                this.field452 = true;
                this.field111 = 0;
                this.field346 = true;
                this.field308 = "";
                this.field493 = 1;
                this.field326 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field452 = true;
                this.field111 = 0;
                this.field346 = true;
                this.field308 = "";
                this.field493 = 2;
                this.field326 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field439 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field452 = true;
                this.field111 = 0;
                this.field346 = true;
                this.field308 = "";
                this.field493 = 4;
                this.field326 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field452 = true;
                this.field111 = 0;
                this.field346 = true;
                this.field308 = "";
                this.field493 = 5;
                this.field326 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field509[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class64.field1597 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class64.field1597) {
                                var6 = 0;
                            }
                        }
                        if (!class64.field1598[var6].field1604 && class64.field1598[var6].field1599 == var4 + (this.field91 ? 0 : 7)) {
                            this.field509[var4] = var6;
                            this.field264 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field203[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field478[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field478[var7].length) {
                        var9 = 0;
                    }
                }
                this.field203[var7] = var9;
                this.field264 = true;
            }
            if (var3 == 324 && !this.field91) {
                this.field91 = true;
                this.method131(0);
            }
            if (var3 == 325 && this.field91) {
                this.field91 = false;
                this.method131(0);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field489 = !this.field489;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method170(-618);
                    if (this.field244.length() > 0) {
                        this.field132.method202((byte) 64, 167);
                        this.field132.method209(class51.method445(this.field244), (byte) 7);
                        this.field132.method203(var3 - 601);
                        this.field132.method203(this.field489 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field132.method202((byte) 64, 118);
                this.field132.method203(this.field91 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field132.method203(this.field509[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field132.method203(this.field203[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLITVAFKCK;)V")
    public final void method122(boolean arg0, class22 arg1) {
        if (arg0) {
            this.field159 = this.field512.method544();
        }
        short var3 = 256;
        for (int var4 = 0; var4 < this.field160.length; ++var4) {
            this.field160[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field160[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field161[var16] = (this.field160[var16 - 1] + this.field160[var16 + 1] + this.field160[var16 - 128] + this.field160[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field160;
            this.field160 = this.field161;
            this.field161 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field732; ++var8) {
                for (int var9 = 0; var9 < arg1.field731; ++var9) {
                    if (arg1.field729[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field733;
                        int var11 = var8 + 16 + arg1.field734;
                        int var12 = (var11 << 7) + var10;
                        this.field160[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method123(int arg0) {
        if (field261 != arg0) {
            this.field278 = null;
        }
        int var2 = 5;
        this.field73[8] = 0;
        int var3 = 0;
        while (this.field73[8] == 0) {
            String var4 = "Unknown problem";
            this.method172(-23874, "Connecting to web server", 20);
            try {
                DataInputStream var5 = this.method76("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 372);
                class13 var6 = new class13(new byte[40], (byte) 3);
                var5.readFully(var6.field642, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field73[var7] = var6.method218();
                }
                int var8 = var6.method218();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field73[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field73[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field73[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field73[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field73[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field73[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method172(-23874, "Game updated - please reload page", 10);
                        var11 = 10;
                    } else {
                        this.method172(-23874, var4 + " - Will retry in " + var11 + " secs.", 10);
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
                this.field416 = !this.field416;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (this.field276 != 0) {
            class4 var2 = this.field406;
            int var3 = 0;
            if (arg0 < 6 || arg0 > 6) {
                this.field100 = !this.field100;
            }
            if (this.field530 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field312[var4] != null) {
                    int var5 = this.field310[var4];
                    String var6 = this.field311[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field460 == 0 || this.field460 == 1 && this.method115(0, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method17(779, "From", var9, var8, 0);
                        var2.method17(779, "From", var9, var8 - 1, 65535);
                        int var10 = var9 + var2.method15(false, "From ");
                        if (var7 == 1) {
                            this.field482[0].method304(233, var10, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field482[1].method304(233, var10, var8 - 12);
                            var10 += 14;
                        }
                        var2.method17(779, var6 + ": " + this.field312[var4], var10, var8, 0);
                        var2.method17(779, var6 + ": " + this.field312[var4], var10, var8 - 1, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field460 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method17(779, this.field312[var4], 4, var11, 0);
                        var2.method17(779, this.field312[var4], 4, var11 - 1, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field460 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method17(779, "To " + var6 + ": " + this.field312[var4], 4, var12, 0);
                        var2.method17(779, "To " + var6 + ": " + this.field312[var4], 4, var12 - 1, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        short var2 = 256;
        this.field281 &= arg0;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field76[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field76[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field77[var14] = (this.field76[var14 - 1] + this.field76[var14 + 1] + this.field76[var14 - 128] + this.field76[var14 + 128]) / 4;
            }
        }
        this.field404 += 128;
        if (this.field404 > this.field160.length) {
            this.field404 -= this.field160.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method122(false, this.field426[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field77[var11 + 128] - this.field160[this.field404 + var11 & this.field160.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field76[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field93[var8] = this.field93[var8 + 1];
        }
        this.field93[var2 - 1] = (int) (Math.sin((double) field282 / 14.0D) * 16.0D + Math.sin((double) field282 / 15.0D) * 14.0D + Math.sin((double) field282 / 16.0D) * 12.0D);
        if (this.field376 > 0) {
            this.field376 -= 4;
        }
        if (this.field377 > 0) {
            this.field377 -= 4;
        }
        if (this.field376 == 0 && this.field377 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field376 = 1024;
            }
            if (var9 == 1) {
                this.field377 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method126(int arg0) {
        try {
            this.field235 = -1;
            this.field230.method426();
            this.field140.method426();
            class71.method591((byte) 1);
            this.method186(-429);
            this.field143.method487(47009);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field339[var2].method576();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field556[var3][var4][var5] = 0;
                    }
                }
            }
            class67 var6 = new class67(this.field511, 104, this.field556, (byte) -61, 104);
            int var7 = this.field66.length;
            this.field132.method202((byte) 64, 225);
            if (!this.field498) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field336[var8] >> 8) * 64 - this.field96;
                    int var10 = (this.field336[var8] & 255) * 64 - this.field97;
                    byte[] var11 = this.field66[var8];
                    if (var11 != null) {
                        var6.method566(this.field339, var10, (this.field477 - 6) * 8, var11, var9, -79, (this.field476 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field336[var12] >> 8) * 64 - this.field96;
                    int var14 = (this.field336[var12] & 255) * 64 - this.field97;
                    byte[] var15 = this.field66[var12];
                    if (var15 == null && this.field477 < 800) {
                        var6.method564(var14, var13, 64, 9, 64);
                    }
                }
                this.field132.method202((byte) 64, 225);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field467[var16];
                    if (var17 != null) {
                        int var18 = (this.field336[var16] >> 8) * 64 - this.field96;
                        int var19 = (this.field336[var16] & 255) * 64 - this.field97;
                        var6.method569(var18, var19, this.field339, var17, this.field143, (byte) 5);
                    }
                }
            }
            if (this.field498) {
                int var20 = 0;
                label256: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field144[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method564(var32 * 8, var31 * 8, 8, 9, 8);
                                }
                            }
                        }
                        this.field132.method202((byte) 64, 225);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label256;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field144[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field336.length; ++var43) {
                                            if (this.field336[var43] == var42 && this.field467[var43] != null) {
                                                var6.method556(var39, var38, -37619, var35 * 8, var36 * 8, this.field143, (var40 & 7) * 8, this.field467[var43], var34, this.field339, (var41 & 7) * 8);
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
                            int var24 = this.field144[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field336.length; ++var30) {
                                    if (this.field336[var30] == var29 && this.field66[var30] != null) {
                                        var6.method550(this.field66[var30], var22 * 8, (var28 & 7) * 8, var25, (var27 & 7) * 8, var26, this.field327, var20, this.field339, var21 * 8);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method551(var22 * 8, var20, var21 * 8, (byte) 42);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field132.method202((byte) 64, 225);
            var6.method568(0, this.field143, this.field339);
            if (this.field457 != null) {
                this.field457.method294(0);
                class71.field1731 = this.field321;
            }
            this.field132.method202((byte) 64, 225);
            int var44 = class67.field1652;
            if (var44 > this.field411) {
                var44 = this.field411;
            }
            if (var44 < this.field411 - 1) {
                int var45 = this.field411 - 1;
            }
            if (field121) {
                this.field143.method488(class67.field1652, true);
            } else {
                this.field143.method488(0, true);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method48(var46, var47);
                }
            }
            this.method142(0);
        } catch (Exception var60) {
        }
        class39.field1156.method200();
        if (super.field592 != null) {
            this.field132.method202((byte) 64, 133);
            this.field132.method207(1057001181);
        }
        if (field121 && signlink.cache_dat != null) {
            int var49 = this.field393.method359((byte) -58, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field393.method374(true, var50);
                if ((var51 & 121) == 0) {
                    class28.method329(var50, 20033);
                }
            }
        }
        System.gc();
        class71.method592(-714, 20);
        this.field393.method357(0);
        if (arg0 != 4) {
            this.field548 = 103;
        }
        int var52 = (this.field476 - 6) / 8 - 1;
        int var53 = (this.field476 + 6) / 8 + 1;
        int var54 = (this.field477 - 6) / 8 - 1;
        int var55 = (this.field477 + 6) / 8 + 1;
        if (this.field332) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field393.method371(0, var57, 0, var56);
                    if (var58 != -1) {
                        this.field393.method368(var58, this.field87, 3);
                    }
                    int var59 = this.field393.method371(0, var57, 1, var56);
                    if (var59 != -1) {
                        this.field393.method368(var59, this.field87, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method127(int arg0) {
        this.field435 += arg0;
        if (field121 && this.field388 == 2 && class67.field1657 != this.field411) {
            this.method139((String) null, 4, "Loading - please wait.");
            this.field388 = 1;
            this.field353 = System.currentTimeMillis();
        }
        if (this.field388 == 1) {
            int var2 = this.method128((byte) 76);
            if (var2 != 0 && System.currentTimeMillis() - this.field353 > 360000L) {
                signlink.reporterror(this.field105 + " glcfb " + this.field265 + "," + var2 + "," + field121 + "," + this.field294[0] + "," + this.field393.method377() + "," + this.field411 + "," + this.field476 + "," + this.field477);
                this.field353 = System.currentTimeMillis();
            }
        }
        if (this.field388 == 2 && this.field411 != this.field235) {
            this.field235 = this.field411;
            this.method134(true, this.field411);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)I")
    public final int method128(byte arg0) {
        for (int var2 = 0; var2 < this.field66.length; ++var2) {
            if (this.field66[var2] == null && this.field337[var2] != -1) {
                return -1;
            }
            if (this.field467[var2] == null && this.field338[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field66.length; ++var4) {
            byte[] var5 = this.field467[var4];
            if (var5 != null) {
                int var6 = (this.field336[var4] >> 8) * 64 - this.field96;
                int var7 = (this.field336[var4] & 255) * 64 - this.field97;
                if (this.field498) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class67.method567(var5, var6, 1, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field373) {
            return -4;
        } else {
            this.field388 = 2;
            class67.field1657 = this.field411;
            this.method126(4);
            this.field132.method202((byte) 64, 21);
            if (arg0 != 76) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method129(int arg0) {
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method130(int arg0) {
        this.field455.method294(0);
        int var2 = 22 / arg0;
        class71.field1731 = this.field320;
        this.field490.method304(233, 0, 0);
        if (this.field510 != -1) {
            this.method71(0, true, 0, class36.method394(this.field510), 0);
        } else if (this.field449[this.field328] != -1) {
            this.method71(0, true, 0, class36.method394(this.field449[this.field328]), 0);
        }
        if (this.field262 && this.field205 == 1) {
            this.method114(45528);
        }
        this.field455.method295(205, -895, super.field589, 553);
        this.field457.method294(0);
        class71.field1731 = this.field321;
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method131(int arg0) {
        if (arg0 != 0) {
            this.field278 = null;
        }
        this.field264 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field509[var2] = -1;
            for (int var3 = 0; var3 < class64.field1597; ++var3) {
                if (!class64.field1598[var3].field1604 && class64.field1598[var3].field1599 == var2 + (this.field91 ? 0 : 7)) {
                    this.field509[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFTMSICIZ;IB)V")
    private final void method132(class13 arg0, int arg1, byte arg2) {
        for (int var4 = 0; var4 < this.field536; ++var4) {
            int var5 = this.field537[var4];
            class59 var6 = this.field473[var5];
            int var7 = arg0.method213();
            if ((var7 & 4) != 0) {
                int var8 = arg0.method213();
                int var9 = arg0.method213();
                var6.method431(var9, this.field150, var8, field282);
                var6.field1303 = field282 + 300;
                var6.field1304 = arg0.method233(7);
                var6.field1305 = arg0.method233(7);
            }
            if ((var7 & 8) != 0) {
                int var10 = arg0.method213();
                int var11 = arg0.method213();
                var6.method431(var11, this.field150, var10, field282);
                var6.field1303 = field282 + 300;
                var6.field1304 = arg0.method213();
                var6.field1305 = arg0.method234(false);
            }
            if ((var7 & 16) != 0) {
                var6.field1505 = class48.method439(arg0.method215());
                var6.field1269 = var6.field1505.field1368;
                var6.field1296 = var6.field1505.field1374;
                var6.field1270 = var6.field1505.field1355;
                var6.field1271 = var6.field1505.field1351;
                var6.field1272 = var6.field1505.field1358;
                var6.field1273 = var6.field1505.field1349;
                var6.field1288 = var6.field1505.field1376;
            }
            if ((var7 & 2) != 0) {
                var6.field1293 = arg0.method215();
                var6.field1294 = arg0.method242(4);
            }
            if ((var7 & 128) != 0) {
                int var12 = arg0.method215();
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = arg0.method213();
                if (var6.field1279 == var12 && var12 != -1) {
                    int var14 = class37.field1113[var12].field1127;
                    if (var14 == 1) {
                        var6.field1280 = 0;
                        var6.field1281 = 0;
                        var6.field1282 = var13;
                        var6.field1283 = 0;
                    }
                    if (var14 == 2) {
                        var6.field1283 = 0;
                    }
                } else if (var12 == -1 || var6.field1279 == -1 || class37.field1113[var12].field1121 >= class37.field1113[var6.field1279].field1121) {
                    var6.field1279 = var12;
                    var6.field1280 = 0;
                    var6.field1281 = 0;
                    var6.field1282 = var13;
                    var6.field1283 = 0;
                    var6.field1268 = var6.field1306;
                }
            }
            if ((var7 & 64) != 0) {
                var6.field1284 = arg0.method243(this.field317);
                if (var6.field1284 == 65535) {
                    var6.field1284 = -1;
                }
            }
            if ((var7 & 1) != 0) {
                var6.field1275 = arg0.method220();
                var6.field1298 = 100;
            }
            if ((var7 & 32) != 0) {
                var6.field1250 = arg0.method243(this.field317);
                int var15 = arg0.method250(this.field246);
                var6.field1254 = var15 >> 16;
                var6.field1253 = (var15 & 65535) + field282;
                var6.field1251 = 0;
                var6.field1252 = 0;
                if (var6.field1253 > field282) {
                    var6.field1251 = -1;
                }
                if (var6.field1250 == 65535) {
                    var6.field1250 = -1;
                }
            }
        }
        if (arg2 == -100) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
    public final String method133(int arg0, int arg1) {
        if (arg1 < this.field245 || arg1 > this.field245) {
            this.field132.method203(61);
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
    public final void method134(boolean arg0, int arg1) {
        int[] var3 = this.field448.field796;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field556[arg1][var24][var6] & 24) == 0) {
                    this.field143.method522(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field556[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field143.method522(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field448.method313(0);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field556[arg1][var22][var9] & 24) == 0) {
                    this.method47(var8, var7, var22, 45824, var9, arg1);
                }
                if (arg1 < 3 && (this.field556[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method47(var8, var7, var22, 45824, var9, arg1 + 1);
                }
            }
        }
        this.field281 &= arg0;
        if (this.field457 != null) {
            this.field457.method294(0);
            class71.field1731 = this.field321;
        }
        this.field129 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field143.method516(this.field411, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class39.method409(var13).field1139;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field339[this.field411].field1716;
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
                        this.field372[this.field129] = this.field248[var14];
                        this.field130[this.field129] = var15;
                        this.field131[this.field129] = var16;
                        ++this.field129;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method135(int arg0) {
        this.field274 = false;
        while (this.field148) {
            this.field274 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field288 = null;
        while (arg0 >= 0) {
            this.field132.method203(122);
        }
        this.field289 = null;
        this.field426 = null;
        this.field313 = null;
        this.field314 = null;
        this.field315 = null;
        this.field316 = null;
        this.field160 = null;
        this.field161 = null;
        this.field76 = null;
        this.field77 = null;
        this.field440 = null;
        this.field441 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILKUDWIDHU;II)V")
    public final void method136(int arg0, class27 arg1, int arg2, int arg3) {
        if (arg1 != null) {
            int var5 = this.field429 + this.field369 & 2047;
            int var6 = arg0 * arg0 + arg3 * arg3;
            if (var6 <= 6400) {
                int var7 = class28.field880[var5];
                int var8 = class28.field881[var5];
                int var9 = var7 * 256 / (this.field197 + 256);
                int var10 = var8 * 256 / (this.field197 + 256);
                int var11 = arg0 * var10 + arg3 * var9 >> 16;
                int var12 = arg3 * var10 - arg0 * var9 >> 16;
                if (arg2 != -20546) {
                    this.field466 = !this.field466;
                }
                if (var6 > 2500) {
                    arg1.method324(this.field491, 83 - var12 - arg1.field802 / 2 - 4, -454, var11 + 94 - arg1.field801 / 2 + 4);
                } else {
                    arg1.method318(233, var11 + 94 - arg1.field801 / 2 + 4, 83 - var12 - arg1.field802 / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String method137(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 0) {
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

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method138(boolean arg0) {
        try {
            if (this.field351 != null) {
                this.field351.method456();
            }
        } catch (Exception var3) {
        }
        this.field351 = null;
        this.field281 = false;
        this.field367 = 0;
        this.field105 = "";
        if (arg0) {
            this.field350 = -146;
        }
        this.field106 = "";
        this.method186(-429);
        this.field143.method487(47009);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field339[var2].method576();
        }
        System.gc();
        this.method129(419);
        this.field94 = -1;
        this.field378 = -1;
        this.field136 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method139(String arg0, int arg1, String arg2) {
        if (arg1 != 4) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (this.field457 != null) {
            this.field457.method294(0);
            class71.field1731 = this.field321;
            int var5 = 151;
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field406.method13(257, var5, arg2, 0, false);
            this.field406.method13(256, var5 - 1, arg2, 16777215, false);
            var5 += 15;
            if (arg0 != null) {
                this.field406.method13(257, var5, arg0, 0, false);
                this.field406.method13(256, var5 - 1, arg0, 16777215, false);
            }
            this.field457.method295(4, -895, super.field589, 4);
        } else if (super.field590 != null) {
            super.field590.method294(0);
            class71.field1731 = this.field322;
            int var6 = 251;
            short var7 = 300;
            byte var8 = 50;
            class5.method33(383 - var7 / 2, 0, var6 - 5 - var8 / 2, var8, this.field350, var7);
            class5.method34(var7, var8, 16777215, 383 - var7 / 2, var6 - 5 - var8 / 2, true);
            if (arg0 != null) {
                var6 -= 7;
            }
            this.field406.method13(383, var6, arg2, 0, false);
            this.field406.method13(382, var6 - 1, arg2, 16777215, false);
            var6 += 15;
            if (arg0 != null) {
                this.field406.method13(383, var6, arg0, 0, false);
                this.field406.method13(382, var6 - 1, arg0, 16777215, false);
            }
            super.field590.method295(0, -895, super.field589, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method140(boolean arg0) {
        if (this.field172 == null) {
            super.field590 = null;
            this.field458 = null;
            this.field456 = null;
            this.field455 = null;
            this.field457 = null;
            this.field305 = null;
            this.field306 = null;
            this.field307 = null;
            this.field175 = new class20(this.method109(-61), 128, 430, 265);
            class5.method31((byte) 4);
            this.field176 = new class20(this.method109(-61), 128, 430, 265);
            class5.method31((byte) 4);
            if (!arg0) {
                this.field436 = this.field527.method213();
            }
            this.field172 = new class20(this.method109(-61), 509, 430, 171);
            class5.method31((byte) 4);
            this.field173 = new class20(this.method109(-61), 360, 430, 132);
            class5.method31((byte) 4);
            this.field174 = new class20(this.method109(-61), 360, 430, 200);
            class5.method31((byte) 4);
            this.field177 = new class20(this.method109(-61), 202, 430, 238);
            class5.method31((byte) 4);
            this.field178 = new class20(this.method109(-61), 203, 430, 238);
            class5.method31((byte) 4);
            this.field179 = new class20(this.method109(-61), 74, 430, 94);
            class5.method31((byte) 4);
            this.field180 = new class20(this.method109(-61), 75, 430, 94);
            class5.method31((byte) 4);
            if (this.field182 != null) {
                this.method66(true);
                this.method144((byte) 8);
            }
            this.field271 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
    public final void method141(long arg0, byte arg1) {
        if (arg1 != -63) {
            this.field436 = this.field527.method213();
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field292; ++var4) {
                if (this.field157[var4] == arg0) {
                    --this.field292;
                    this.field394 = true;
                    for (int var5 = var4; var5 < this.field292; ++var5) {
                        this.field157[var5] = this.field157[var5 + 1];
                    }
                    this.field132.method202((byte) 64, 188);
                    this.field132.method209(arg0, (byte) 7);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    private final void method142(int arg0) {
        class8 var2 = (class8) this.field427.method422();
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (var2.field562 == -1) {
                var2.field563 = 0;
                this.method119(var2, 691);
            } else {
                var2.method418();
            }
            var2 = (class8) this.field427.method424(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method143(int arg0) {
        if (this.field276 != 0) {
            int var2 = 0;
            if (arg0 > 0) {
                if (this.field530 != 0) {
                    var2 = 1;
                }
                for (int var3 = 0; var3 < 100; ++var3) {
                    if (this.field312[var3] != null) {
                        int var4 = this.field310[var3];
                        String var5 = this.field311[var3];
                        boolean var6 = false;
                        if (var5 != null && var5.startsWith("@cr1@")) {
                            var5 = var5.substring(5);
                            boolean var7 = true;
                        }
                        if (var5 != null && var5.startsWith("@cr2@")) {
                            var5 = var5.substring(5);
                            boolean var8 = true;
                        }
                        if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field460 == 0 || this.field460 == 1 && this.method115(0, var5))) {
                            int var9 = 329 - var2 * 13;
                            if (super.field597 > 4 && super.field598 - 4 > var9 - 10 && super.field598 - 4 <= var9 + 3) {
                                int var10 = this.field406.method15(false, "From:  " + var5 + this.field312[var3]) + 25;
                                if (var10 > 450) {
                                    var10 = 450;
                                }
                                if (super.field597 < var10 + 4) {
                                    if (this.field181 >= 1) {
                                        this.field126[this.field428] = "Report abuse @whi@" + var5;
                                        this.field185[this.field428] = 2243;
                                        ++this.field428;
                                    }
                                    this.field126[this.field428] = "Add ignore @whi@" + var5;
                                    this.field185[this.field428] = 2950;
                                    ++this.field428;
                                    this.field126[this.field428] = "Add friend @whi@" + var5;
                                    this.field185[this.field428] = 2143;
                                    ++this.field428;
                                }
                            }
                            ++var2;
                            if (var2 >= 5) {
                                return;
                            }
                        }
                        if ((var4 == 5 || var4 == 6) && this.field460 < 2) {
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

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method144(byte arg0) {
        this.field288 = new class22(this.field182, "titlebox", 0);
        this.field289 = new class22(this.field182, "titlebutton", 0);
        if (arg0 != 8) {
            this.field159 = -296;
        }
        this.field426 = new class22[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field426[var2] = new class22(this.field182, "runes", var2);
        }
        this.field440 = new class27(128, 265);
        this.field441 = new class27(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field440.field796[var3] = this.field175.field706[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field441.field796[var4] = this.field176.field706[var4];
        }
        this.field314 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field314[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field314[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field314[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field314[var8 + 192] = 16777215;
        }
        this.field315 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field315[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field315[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field315[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field315[var12 + 192] = 16777215;
        }
        this.field316 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field316[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field316[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field316[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field316[var16 + 192] = 16777215;
        }
        this.field313 = new int[256];
        this.field160 = new int[32768];
        this.field161 = new int[32768];
        this.method122(false, (class22) null);
        this.field76 = new int[32768];
        this.field77 = new int[32768];
        this.method172(-23874, "Connecting to fileserver", 10);
        if (!this.field274) {
            this.field481 = true;
            this.field274 = true;
            this.method107(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)I")
    public final int method145(int arg0) {
        if (arg0 != 3) {
            return this.field350;
        } else {
            int var2 = 3;
            if (this.field286 < 310) {
                int var3 = this.field283 >> 7;
                int var4 = this.field285 >> 7;
                int var5 = field89.field1255 >> 7;
                int var6 = field89.field1256 >> 7;
                if ((this.field556[this.field411][var3][var4] & 4) != 0) {
                    var2 = this.field411;
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
                        if ((this.field556[this.field411][var3][var4] & 4) != 0) {
                            var2 = this.field411;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field556[this.field411][var3][var4] & 4) != 0) {
                                var2 = this.field411;
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
                        if ((this.field556[this.field411][var3][var4] & 4) != 0) {
                            var2 = this.field411;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field556[this.field411][var3][var4] & 4) != 0) {
                                var2 = this.field411;
                            }
                        }
                    }
                }
            }
            if ((this.field556[this.field411][field89.field1255 >> 7][field89.field1256 >> 7] & 4) != 0) {
                var2 = this.field411;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)I")
    public final int method146(int arg0) {
        if (arg0 <= 0) {
            this.field249 = this.field512.method544();
        }
        int var2 = this.method106(this.field283, (byte) -10, this.field411, this.field285);
        return var2 - this.field284 < 800 && (this.field556[this.field411][this.field283 >> 7][this.field285 >> 7] & 4) != 0 ? this.field411 : 3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILYFPQHQAV;II)V")
    public final void method147(byte arg0, int arg1, class66 arg2, int arg3, int arg4) {
        if (field89 != arg2) {
            if (this.field428 < 400) {
                if (arg0 != 9) {
                    for (int var6 = 1; var6 > 0; ++var6) {
                    }
                }
                String var7;
                if (arg2.field1630 == 0) {
                    var7 = arg2.field1642 + method86(614, field89.field1641, arg2.field1641) + " (level-" + arg2.field1641 + ")";
                } else {
                    var7 = arg2.field1642 + " (skill-" + arg2.field1630 + ")";
                }
                if (this.field113 == 1) {
                    this.field126[this.field428] = "Use " + this.field117 + " with @whi@" + var7;
                    this.field185[this.field428] = 223;
                    this.field186[this.field428] = arg4;
                    this.field183[this.field428] = arg3;
                    this.field184[this.field428] = arg1;
                    ++this.field428;
                } else if (this.field189 == 1) {
                    if ((this.field191 & 8) == 8) {
                        this.field126[this.field428] = this.field192 + " @whi@" + var7;
                        this.field185[this.field428] = 555;
                        this.field186[this.field428] = arg4;
                        this.field183[this.field428] = arg3;
                        this.field184[this.field428] = arg1;
                        ++this.field428;
                    }
                } else {
                    for (int var8 = 4; var8 >= 0; --var8) {
                        if (this.field323[var8] != null) {
                            this.field126[this.field428] = this.field323[var8] + " @whi@" + var7;
                            short var10 = 0;
                            if (this.field323[var8].equalsIgnoreCase("attack")) {
                                if (arg2.field1641 > field89.field1641) {
                                    var10 = 2000;
                                }
                                if (field89.field1624 != 0 && arg2.field1624 != 0) {
                                    if (field89.field1624 == arg2.field1624) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field324[var8]) {
                                var10 = 2000;
                            }
                            if (var8 == 0) {
                                this.field185[this.field428] = var10 + 416;
                            }
                            if (var8 == 1) {
                                this.field185[this.field428] = var10 + 365;
                            }
                            if (var8 == 2) {
                                this.field185[this.field428] = var10 + 891;
                            }
                            if (var8 == 3) {
                                this.field185[this.field428] = var10 + 94;
                            }
                            if (var8 == 4) {
                                this.field185[this.field428] = var10 + 545;
                            }
                            this.field186[this.field428] = arg4;
                            this.field183[this.field428] = arg3;
                            this.field184[this.field428] = arg1;
                            ++this.field428;
                        }
                    }
                }
                for (int var9 = 0; var9 < this.field428; ++var9) {
                    if (this.field185[var9] == 763) {
                        this.field126[var9] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method148(boolean arg0) {
        this.field458.method294(0);
        class71.field1731 = this.field319;
        this.field492.method304(233, 0, 0);
        if (this.field346) {
            this.field407.method13(239, 40, this.field326, 0, false);
            this.field407.method13(239, 60, this.field308 + "*", 128, false);
        } else if (this.field111 == 1) {
            this.field407.method13(239, 40, "Enter amount:", 0, false);
            this.field407.method13(239, 60, this.field297 + "*", 128, false);
        } else if (this.field111 == 2) {
            this.field407.method13(239, 40, "Enter name:", 0, false);
            this.field407.method13(239, 60, this.field297 + "*", 128, false);
        } else if (this.field111 == 3) {
            if (this.field341 != this.field297) {
                this.method44(this.field291, this.field297);
                this.field341 = this.field297;
            }
            class4 var2 = this.field406;
            class5.method30(77, 0, 0, 463, false);
            for (int var3 = 0; var3 < this.field342; ++var3) {
                int var4 = var3 * 14 + 18 - this.field345;
                if (var4 > 0 && var4 < 110) {
                    var2.method13(239, var4, this.field343[var3], 0, false);
                }
            }
            class5.method29(this.field445);
            if (this.field342 > 5) {
                this.method97(this.field345, 463, 77, 6, 0, this.field342 * 14 + 7);
            }
            if (this.field297.length() == 0) {
                this.field407.method13(239, 40, "Enter object name", 255, false);
            } else if (this.field342 == 0) {
                this.field407.method13(239, 40, "No matching objects found, please shorten search", 0, false);
            }
            var2.method13(239, 90, this.field297 + "*", 0, false);
            class5.method36(0, 77, 0, 0, 479);
        } else if (this.field412 != null) {
            this.field407.method13(239, 40, this.field412, 0, false);
            this.field407.method13(239, 60, "Click to continue", 128, false);
        } else if (this.field193 != -1) {
            this.method71(0, true, 0, class36.method394(this.field193), 0);
        } else if (this.field199 != -1) {
            this.method71(0, true, 0, class36.method394(this.field199), 0);
        } else {
            class4 var5 = this.field406;
            int var6 = 0;
            class5.method30(77, 0, 0, 463, false);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field312[var7] != null) {
                    int var9 = this.field310[var7];
                    int var10 = 70 - var6 * 14 + this.field217;
                    String var11 = this.field311[var7];
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
                            var5.method17(779, this.field312[var7], 4, var10, 0);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field334 == 0 || this.field334 == 1 && this.method115(0, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field482[0].method304(233, var13, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field482[1].method304(233, var13, var10 - 12);
                                var13 += 14;
                            }
                            var5.method17(779, var11 + ":", var13, var10, 0);
                            int var14 = var13 + var5.method15(false, var11) + 8;
                            var5.method17(779, this.field312[var7], var14, var10, 255);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field276 == 0 && (var9 == 7 || this.field460 == 0 || this.field460 == 1 && this.method115(0, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method17(779, "From", var15, var10, 0);
                            int var16 = var15 + var5.method15(false, "From ");
                            if (var12 == 1) {
                                this.field482[0].method304(233, var16, var10 - 12);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field482[1].method304(233, var16, var10 - 12);
                                var16 += 14;
                            }
                            var5.method17(779, var11 + ":", var16, var10, 0);
                            int var17 = var16 + var5.method15(false, var11) + 8;
                            var5.method17(779, this.field312[var7], var17, var10, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field484 == 0 || this.field484 == 1 && this.method115(0, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method17(779, var11 + " " + this.field312[var7], 4, var10, 8388736);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field276 == 0 && this.field460 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method17(779, this.field312[var7], 4, var10, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field276 == 0 && this.field460 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method17(779, "To " + var11 + ":", 4, var10, 0);
                            var5.method17(779, this.field312[var7], 12 + var5.method15(false, "To " + var11), var10, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field484 == 0 || this.field484 == 1 && this.method115(0, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method17(779, var11 + " " + this.field312[var7], 4, var10, 8270336);
                        }
                        ++var6;
                    }
                }
            }
            class5.method29(this.field445);
            this.field423 = var6 * 14 + 7;
            if (this.field423 < 78) {
                this.field423 = 78;
            }
            this.method97(this.field423 - this.field217 - 77, 463, 77, 6, 0, this.field423);
            String var8;
            if (field89 != null && field89.field1642 != null) {
                var8 = field89.field1642;
            } else {
                var8 = class51.method449(this.field105, 78);
            }
            var5.method17(779, var8 + ":", 4, 90, 0);
            var5.method17(779, this.field70 + "*", 6 + var5.method15(false, var8 + ": "), 90, 255);
            class5.method36(0, 77, 0, 0, 479);
        }
        if (this.field262 && this.field205 == 2) {
            this.method114(45528);
        }
        this.field458.method295(357, -895, super.field589, 17);
        this.field457.method294(0);
        if (!arg0) {
            this.field278 = null;
        }
        class71.field1731 = this.field321;
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method149(int arg0) {
        Graphics var2 = this.method109(-61).getGraphics();
        var2.setColor(Color.black);
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        var2.fillRect(0, 0, 765, 503);
        this.method192(false, 1);
        if (this.field325) {
            this.field274 = false;
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
        if (this.field139) {
            this.field274 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field347) {
            this.field274 = false;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQQSLPTGQ;BI)V")
    public final void method150(class45 arg0, byte arg1, int arg2) {
        if (arg1 != -4) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method151(444, arg2, arg0.field1256, arg0.field1255);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
    public final void method151(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg2 >= 128 && arg3 <= 13056 && arg2 <= 13056) {
            int var5 = this.method106(arg3, (byte) -10, this.field411, arg2) - arg1;
            int var6 = arg3 - this.field283;
            int var7 = var5 - this.field284;
            int var8 = arg2 - this.field285;
            int var9 = class28.field880[this.field286];
            int var10 = class28.field881[this.field286];
            int var11 = class28.field880[this.field287];
            int var12 = class28.field881[this.field287];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            int var19 = 50 / arg0;
            if (var17 >= 50) {
                this.field506 = (var13 << 9) / var17 + class71.field1725;
                this.field507 = (var16 << 9) / var17 + class71.field1726;
            } else {
                this.field506 = -1;
                this.field507 = -1;
            }
        } else {
            this.field506 = -1;
            this.field507 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method152(int arg0) {
        this.field251 = 0;
        for (int var2 = -1; var2 < this.field534 + this.field474; ++var2) {
            class45 var19;
            if (var2 == -1) {
                var19 = field89;
            } else if (var2 < this.field534) {
                var19 = this.field533[this.field535[var2]];
            } else {
                var19 = this.field473[this.field475[var2 - this.field534]];
            }
            if (var19 != null && var19.method433(172)) {
                if (var19 instanceof class59) {
                    class48 var20 = ((class59) var19).field1505;
                    if (var20.field1373 != null) {
                        var20 = var20.method436((byte) -38);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field534) {
                    class48 var23 = ((class59) var19).field1505;
                    if (var23.field1356 >= 0 && var23.field1356 < this.field501.length) {
                        this.method150(var19, (byte) -4, var19.field1297 + 15);
                        if (this.field506 > -1) {
                            this.field501[var23.field1356].method318(233, this.field506 - 12, this.field507 - 30);
                        }
                    }
                    if (this.field555 == 1 && this.field475[var2 - this.field534] == this.field360 && field282 % 20 < 10) {
                        this.method150(var19, (byte) -4, var19.field1297 + 15);
                        if (this.field506 > -1) {
                            this.field464[0].method318(233, this.field506 - 12, this.field507 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class66 var22 = (class66) var19;
                    if (var22.field1625 != -1 || var22.field1617 != -1) {
                        this.method150(var19, (byte) -4, var19.field1297 + 15);
                        if (this.field506 > -1) {
                            if (var22.field1625 != -1) {
                                this.field463[var22.field1625].method318(233, this.field506 - 12, this.field507 - var21);
                                var21 += 25;
                            }
                            if (var22.field1617 != -1) {
                                this.field501[var22.field1617].method318(233, this.field506 - 12, this.field507 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field555 == 10 && this.field535[var2] == this.field502) {
                        this.method150(var19, (byte) -4, var19.field1297 + 15);
                        if (this.field506 > -1) {
                            this.field464[1].method318(233, this.field506 - 12, this.field507 - var21);
                        }
                    }
                }
                if (var19.field1275 != null && (var2 >= this.field534 || this.field334 == 0 || this.field334 == 3 || this.field334 == 1 && this.method115(0, ((class66) var19).field1642))) {
                    this.method150(var19, (byte) -4, var19.field1297);
                    if (this.field506 > -1 && this.field251 < this.field252) {
                        this.field256[this.field251] = this.field407.method16(this.field548, var19.field1275) / 2;
                        this.field255[this.field251] = this.field407.field36;
                        this.field253[this.field251] = this.field506;
                        this.field254[this.field251] = this.field507;
                        this.field257[this.field251] = var19.field1285;
                        this.field258[this.field251] = var19.field1295;
                        this.field259[this.field251] = var19.field1298;
                        this.field260[this.field251++] = var19.field1275;
                        if (this.field151 == 0 && var19.field1295 >= 1 && var19.field1295 <= 3) {
                            this.field255[this.field251] += 10;
                            this.field254[this.field251] += 5;
                        }
                        if (this.field151 == 0 && var19.field1295 == 4) {
                            this.field256[this.field251] = 60;
                        }
                        if (this.field151 == 0 && var19.field1295 == 5) {
                            this.field255[this.field251] += 5;
                        }
                    }
                }
                if (var19.field1303 > field282) {
                    this.method150(var19, (byte) -4, var19.field1297 + 15);
                    if (this.field506 > -1) {
                        int var24 = var19.field1304 * 30 / var19.field1305;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class5.method33(this.field506 - 15, 65280, this.field507 - 3, 5, this.field350, var24);
                        class5.method33(this.field506 - 15 + var24, 16711680, this.field507 - 3, 5, this.field350, 30 - var24);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1301[var25] > field282) {
                        this.method150(var19, (byte) -4, var19.field1297 / 2);
                        if (this.field506 > -1) {
                            if (var25 == 1) {
                                this.field507 -= 20;
                            }
                            if (var25 == 2) {
                                this.field506 -= 15;
                                this.field507 -= 10;
                            }
                            if (var25 == 3) {
                                this.field506 += 15;
                                this.field507 -= 10;
                            }
                            this.field273[var19.field1300[var25]].method318(233, this.field506 - 12, this.field507 - 12);
                            this.field405.method13(this.field506, this.field507 + 4, String.valueOf(var19.field1299[var25]), 0, false);
                            this.field405.method13(this.field506 - 1, this.field507 + 3, String.valueOf(var19.field1299[var25]), 16777215, false);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field251; ++var3) {
            int var4 = this.field253[var3];
            int var5 = this.field254[var3];
            int var6 = this.field256[var3];
            int var7 = this.field255[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field254[var18] - this.field255[var18] && var5 - var7 < this.field254[var18] + 2 && var4 - var6 < this.field256[var18] + this.field253[var18] && var4 + var6 > this.field253[var18] - this.field256[var18] && this.field254[var18] - this.field255[var18] < var5) {
                        var5 = this.field254[var18] - this.field255[var18];
                        var8 = true;
                    }
                }
            }
            this.field506 = this.field253[var3];
            this.field507 = this.field254[var3] = var5;
            String var9 = this.field260[var3];
            if (this.field151 == 0) {
                int var10 = 16776960;
                if (this.field257[var3] < 6) {
                    var10 = this.field424[this.field257[var3]];
                }
                if (this.field257[var3] == 6) {
                    var10 = this.field519 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field257[var3] == 7) {
                    var10 = this.field519 % 20 < 10 ? 255 : 65535;
                }
                if (this.field257[var3] == 8) {
                    var10 = this.field519 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field257[var3] == 9) {
                    int var11 = 150 - this.field259[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field257[var3] == 10) {
                    int var12 = 150 - this.field259[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field257[var3] == 11) {
                    int var13 = 150 - this.field259[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field258[var3] == 0) {
                    this.field407.method13(this.field506, this.field507 + 1, var9, 0, false);
                    this.field407.method13(this.field506, this.field507, var9, var10, false);
                }
                if (this.field258[var3] == 1) {
                    this.field407.method18(0, var9, this.field506, this.field507 + 1, 0, this.field519);
                    this.field407.method18(0, var9, this.field506, this.field507, var10, this.field519);
                }
                if (this.field258[var3] == 2) {
                    this.field407.method19(this.field507 + 1, this.field519, var9, this.field506, 0, false);
                    this.field407.method19(this.field507, this.field519, var9, this.field506, var10, false);
                }
                if (this.field258[var3] == 3) {
                    this.field407.method20(150 - this.field259[var3], false, this.field507 + 1, 0, var9, this.field506, this.field519);
                    this.field407.method20(150 - this.field259[var3], false, this.field507, var10, var9, this.field506, this.field519);
                }
                if (this.field258[var3] == 4) {
                    int var14 = this.field407.method16(this.field548, var9);
                    int var15 = (150 - this.field259[var3]) * (var14 + 100) / 150;
                    class5.method30(334, 0, this.field506 - 50, this.field506 + 50, false);
                    this.field407.method17(779, var9, this.field506 + 50 - var15, this.field507 + 1, 0);
                    this.field407.method17(779, var9, this.field506 + 50 - var15, this.field507, var10);
                    class5.method29(this.field445);
                }
                if (this.field258[var3] == 5) {
                    int var16 = 150 - this.field259[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class5.method30(this.field507 + 5, this.field507 - this.field407.field36 - 1, 0, 512, false);
                    this.field407.method13(this.field506, this.field507 + 1 + var17, var9, 0, false);
                    this.field407.method13(this.field506, this.field507 + var17, var9, var10, false);
                    class5.method29(this.field445);
                }
            } else {
                this.field407.method13(this.field506, this.field507 + 1, var9, 0, false);
                this.field407.method13(this.field506, this.field507, var9, 16776960, false);
            }
        }
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    private final void method153(int arg0) {
        if (arg0 != -13170) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field388 == 2) {
            for (class8 var3 = (class8) this.field427.method422(); var3 != null; var3 = (class8) this.field427.method424(false)) {
                if (var3.field562 > 0) {
                    --var3.field562;
                }
                if (var3.field562 == 0) {
                    if (var3.field559 < 0 || class67.method562(var3.field561, var3.field559, -38079)) {
                        this.method154(true, var3.field569, var3.field561, var3.field560, var3.field559, var3.field567, var3.field570, var3.field568);
                        var3.method418();
                    }
                } else {
                    if (var3.field563 > 0) {
                        --var3.field563;
                    }
                    if (var3.field563 == 0 && var3.field569 >= 1 && var3.field570 >= 1 && var3.field569 <= 102 && var3.field570 <= 102 && (var3.field564 < 0 || class67.method562(var3.field566, var3.field564, -38079))) {
                        this.method154(true, var3.field569, var3.field566, var3.field565, var3.field564, var3.field567, var3.field570, var3.field568);
                        var3.field563 = -1;
                        if (var3.field564 == var3.field559 && var3.field559 == -1) {
                            var3.method418();
                        } else if (var3.field564 == var3.field559 && var3.field565 == var3.field560 && var3.field566 == var3.field561) {
                            var3.method418();
                        }
                    }
                }
            }
            ++field470;
            if (field470 > 1775) {
                field470 = 0;
                this.field132.method202((byte) 64, 161);
                this.field132.method203(0);
                int var4 = this.field132.field643;
                this.field132.method204(13807);
                this.field132.method204(63614);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field132.method203(173);
                }
                this.field132.method203((int) (Math.random() * 256.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field132.method203(76);
                }
                this.field132.method204(61477);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field132.method204(27808);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field132.method204(55754);
                }
                this.field132.method203(211);
                this.field132.method203(248);
                this.field132.method212(false, this.field132.field643 - var4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIII)V")
    private final void method154(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field281 &= arg0;
        if (arg1 >= 1 && arg6 >= 1 && arg1 <= 102 && arg6 <= 102) {
            if (field121 && this.field411 != arg5) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field143.method513(arg5, arg1, arg6);
            }
            if (arg7 == 1) {
                var9 = this.field143.method514(arg5, arg1, 0, arg6);
            }
            if (arg7 == 2) {
                var9 = this.field143.method515(arg5, arg1, arg6);
            }
            if (arg7 == 3) {
                var9 = this.field143.method516(arg5, arg1, arg6);
            }
            if (var9 != 0) {
                int var13 = this.field143.method517(arg5, arg1, arg6, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field143.method504(arg6, -875, arg5, arg1);
                    class39 var17 = class39.method409(var14);
                    if (var17.field1140) {
                        this.field339[arg5].method581(arg6, true, var16, var17.field1179, arg1, var15);
                    }
                }
                if (arg7 == 1) {
                    this.field143.method505(-807, arg6, arg1, arg5);
                }
                if (arg7 == 2) {
                    this.field143.method506(true, arg6, arg1, arg5);
                    class39 var18 = class39.method409(var14);
                    if (var18.field1146 + arg1 > 103 || var18.field1146 + arg6 > 103 || var18.field1141 + arg1 > 103 || var18.field1141 + arg6 > 103) {
                        return;
                    }
                    if (var18.field1140) {
                        this.field339[arg5].method582(arg1, var18.field1179, var18.field1141, 432, arg6, var18.field1146, var16);
                    }
                }
                if (arg7 == 3) {
                    this.field143.method507(true, arg1, arg5, arg6);
                    class39 var19 = class39.method409(var14);
                    if (var19.field1140 && var19.field1144) {
                        this.field339[arg5].method584(arg6, this.field146, arg1);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg5;
                if (arg5 < 3 && (this.field556[1][arg1][arg6] & 2) == 2) {
                    var20 = arg5 + 1;
                }
                class67.method571(arg1, this.field143, arg3, arg2, this.field339[arg5], 0, arg6, var20, this.field511, arg5, arg4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILFTMSICIZ;I)V")
    private final void method155(int arg0, class13 arg1, int arg2) {
        this.field103 = 0;
        this.field536 = 0;
        this.method176(arg1, arg2, false);
        this.method51(arg1, arg2, 0);
        if (arg0 != 5) {
            this.field278 = null;
        }
        this.method175(arg2, arg1, true);
        this.method171(arg1, this.field521, arg2);
        for (int var4 = 0; var4 < this.field103; ++var4) {
            int var6 = this.field104[var4];
            if (field282 != this.field533[var6].field1274) {
                this.field533[var6] = null;
            }
        }
        if (arg1.field643 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field643 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field534; ++var5) {
                if (this.field533[this.field535[var5]] == null) {
                    signlink.reporterror(this.field105 + " null entry in pl list - pos:" + var5 + " size:" + this.field534);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class8 var11 = null;
        for (class8 var12 = (class8) this.field427.method422(); var12 != null; var12 = (class8) this.field427.method424(false)) {
            if (var12.field567 == arg5 && var12.field569 == arg8 && var12.field570 == arg7 && var12.field568 == arg6) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class8();
            var11.field567 = arg5;
            var11.field568 = arg6;
            var11.field569 = arg8;
            var11.field570 = arg7;
            this.method119(var11, 691);
            this.field427.method419(var11);
        }
        var11.field564 = arg0;
        var11.field566 = arg9;
        if (arg4 < 6 || arg4 > 6) {
            this.field278 = null;
        }
        var11.field565 = arg3;
        var11.field563 = arg2;
        var11.field562 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg4 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (var8 != 0) {
            int var13 = class28.field880[var8];
            int var14 = class28.field881[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class28.field880[var9];
            int var17 = class28.field881[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field283 = arg2 - var10;
        int var19 = 77 / arg6;
        this.field284 = arg1 - var11;
        this.field285 = arg0 - var12;
        this.field286 = arg5;
        this.field287 = arg4;
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)Z")
    public final boolean method158(int arg0) {
        if (arg0 != -24738) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BLPCARWQQC;)V")
    public final void method159(byte arg0, class36 arg1) {
        if (this.field434 != arg0) {
            this.field436 = -1;
        }
        int var3 = arg1.field1061;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field241;
                if (this.field242 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field1104 = "";
                    arg1.field1064 = 0;
                } else {
                    if (this.field243[var3] == 0) {
                        arg1.field1104 = "@red@Offline";
                    } else if (this.field243[var3] < 200) {
                        if (this.field243[var3] == field118) {
                            arg1.field1104 = "@gre@World" + (this.field243[var3] - 9);
                        } else {
                            arg1.field1104 = "@yel@World" + (this.field243[var3] - 9);
                        }
                    } else if (this.field243[var3] == field118) {
                        arg1.field1104 = "@gre@Classic" + (this.field243[var3] - 219);
                    } else {
                        arg1.field1104 = "@yel@Classic" + (this.field243[var3] - 219);
                    }
                    arg1.field1064 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field241;
                if (this.field242 != 2) {
                    var6 = 0;
                }
                arg1.field1087 = var6 * 15 + 20;
                if (arg1.field1087 <= arg1.field1095) {
                    arg1.field1087 = arg1.field1095 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field242 == 0) {
                    arg1.field1104 = "Loading ignore list";
                    arg1.field1064 = 0;
                } else if (var3 == 1 && this.field242 == 0) {
                    arg1.field1104 = "Please wait...";
                    arg1.field1064 = 0;
                } else {
                    int var7 = this.field292;
                    if (this.field242 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field1104 = "";
                        arg1.field1064 = 0;
                    } else {
                        arg1.field1104 = class51.method449(class51.method446(this.field157[var3], (byte) 5), 78);
                        arg1.field1064 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field1087 = this.field292 * 15 + 20;
                if (arg1.field1087 <= arg1.field1095) {
                    arg1.field1087 = arg1.field1095 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1085 = 150;
                arg1.field1086 = (int) (Math.sin((double) field282 / 40.0D) * 256.0D) & 2047;
                if (this.field264) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field509[var8];
                        if (var15 >= 0 && !class64.field1598[var15].method540(true)) {
                            return;
                        }
                    }
                    this.field264 = false;
                    class28[] var9 = new class28[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field509[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class64.field1598[var14].method541(0);
                        }
                    }
                    class28 var12 = new class28(var10, var9, 127);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field203[var13] != 0) {
                            var12.method344(field478[var13][0], field478[var13][this.field203[var13]]);
                            if (var13 == 1) {
                                var12.method344(field215[0], field215[this.field203[var13]]);
                            }
                        }
                    }
                    var12.method337(4);
                    var12.method338(false, class37.field1113[field89.field1288].field1115[0]);
                    var12.method347(64, 850, -30, -50, -30, true);
                    arg1.field1074 = 5;
                    arg1.field1075 = 0;
                    class36.method399(5, 3, 0, var12);
                }
            } else if (var3 == 324) {
                if (this.field363 == null) {
                    this.field363 = arg1.field1066;
                    this.field364 = arg1.field1096;
                }
                if (this.field91) {
                    arg1.field1066 = this.field364;
                } else {
                    arg1.field1066 = this.field363;
                }
            } else if (var3 == 325) {
                if (this.field363 == null) {
                    this.field363 = arg1.field1066;
                    this.field364 = arg1.field1096;
                }
                if (this.field91) {
                    arg1.field1066 = this.field363;
                } else {
                    arg1.field1066 = this.field364;
                }
            } else if (var3 == 600) {
                arg1.field1104 = this.field244;
                if (field282 % 20 < 10) {
                    arg1.field1104 = arg1.field1104 + "|";
                } else {
                    arg1.field1104 = arg1.field1104 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field181 >= 1) {
                        if (this.field489) {
                            arg1.field1043 = 16711680;
                            arg1.field1104 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1043 = 16777215;
                            arg1.field1104 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1104 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field263 - this.field277;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg1.field1104 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field137 == 0) {
                        arg1.field1104 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field137 <= this.field263) {
                        arg1.field1104 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method160(392, this.field137);
                    } else {
                        int var18 = this.field263 + 14 - this.field137;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg1.field1104 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method160(392, this.field137) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field224 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field224 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field224 + " unread messages";
                    }
                    arg1.field1104 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field431 > 0 && this.field431 <= this.field263 + 10) {
                        arg1.field1104 = "Last password change:\\n@gre@" + this.method160(392, this.field431);
                    } else {
                        arg1.field1104 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field67 > 2 && !field120) {
                        arg1.field1104 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field67 > 2) {
                        arg1.field1104 = "\\n\\nYou have @gre@" + this.field67 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field67 > 0) {
                        arg1.field1104 = "You have @gre@" + this.field67 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg1.field1104 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field67 > 2 && !field120) {
                        arg1.field1104 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field67 > 0) {
                        arg1.field1104 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg1.field1104 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field137 > this.field263) {
                        arg1.field1104 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg1.field1104 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field242 == 0) {
            arg1.field1104 = "Loading friend list";
            arg1.field1064 = 0;
        } else if (var3 == 1 && this.field242 == 1) {
            arg1.field1104 = "Connecting to friendserver";
            arg1.field1064 = 0;
        } else if (var3 == 2 && this.field242 != 2) {
            arg1.field1104 = "Please wait...";
            arg1.field1064 = 0;
        } else {
            int var4 = this.field241;
            if (this.field242 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field1104 = "";
                arg1.field1064 = 0;
            } else {
                arg1.field1104 = this.field468[var3];
                arg1.field1064 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
    public final String method160(int arg0, int arg1) {
        if (arg1 > this.field263 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            if (arg0 <= 0) {
                this.field436 = -1;
            }
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILPCARWQQC;IBIIII)V")
    public final void method161(int arg0, class36 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 == 1) {
            boolean var9 = false;
        } else {
            this.field278 = null;
        }
        if (arg1.field1082 == 0 && arg1.field1048 != null && !arg1.field1033) {
            if (arg4 >= arg0 && arg5 >= arg7 && arg4 <= arg1.field1105 + arg0 && arg5 <= arg1.field1095 + arg7) {
                int var10 = arg1.field1048.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field1067[var11] + arg0;
                    int var13 = arg1.field1069[var11] + arg7 - arg6;
                    class36 var14 = class36.method394(arg1.field1048[var11]);
                    int var15 = var14.field1051 + var12;
                    int var16 = var14.field1103 + var13;
                    if ((var14.field1046 >= 0 || var14.field1072 != 0) && arg4 >= var15 && arg5 >= var16 && arg4 < var14.field1105 + var15 && arg5 < var14.field1095 + var16) {
                        if (var14.field1046 >= 0) {
                            this.field495 = var14.field1046;
                        } else {
                            this.field495 = var14.field1052;
                        }
                    }
                    if (var14.field1082 == 8 && arg4 >= var15 && arg5 >= var16 && arg4 < var14.field1105 + var15 && arg5 < var14.field1095 + var16) {
                        this.field486 = var14.field1052;
                    }
                    if (var14.field1082 == 0) {
                        this.method161(var15, var14, arg2, (byte) 1, arg4, arg5, var14.field1063, var16);
                        if (var14.field1087 > var14.field1095) {
                            this.method45(arg2, var14.field1105 + var15, var14, var16, -609, var14.field1095, var14.field1087, arg4, arg5);
                        }
                    } else {
                        if (var14.field1064 == 1 && arg4 >= var15 && arg5 >= var16 && arg4 < var14.field1105 + var15 && arg5 < var14.field1095 + var16) {
                            boolean var17 = false;
                            if (var14.field1061 != 0) {
                                var17 = this.method101(var14, 1);
                            }
                            if (!var17) {
                                this.field126[this.field428] = var14.field1081;
                                this.field185[this.field428] = 741;
                                this.field184[this.field428] = var14.field1052;
                                ++this.field428;
                            }
                        }
                        if (var14.field1064 == 2 && this.field189 == 0 && arg4 >= var15 && arg5 >= var16 && arg4 < var14.field1105 + var15 && arg5 < var14.field1095 + var16) {
                            String var18 = var14.field1050;
                            if (var18.indexOf(" ") != -1) {
                                var18 = var18.substring(0, var18.indexOf(" "));
                            }
                            this.field126[this.field428] = var18 + " @gre@" + var14.field1094;
                            this.field185[this.field428] = 508;
                            this.field184[this.field428] = var14.field1052;
                            ++this.field428;
                        }
                        if (var14.field1064 == 3 && arg4 >= var15 && arg5 >= var16 && arg4 < var14.field1105 + var15 && arg5 < var14.field1095 + var16) {
                            this.field126[this.field428] = "Close";
                            if (arg2 == 3) {
                                this.field185[this.field428] = 269;
                            } else {
                                this.field185[this.field428] = 531;
                            }
                            this.field184[this.field428] = var14.field1052;
                            ++this.field428;
                        }
                        if (var14.field1064 == 4 && arg4 >= var15 && arg5 >= var16 && arg4 < var14.field1105 + var15 && arg5 < var14.field1095 + var16) {
                            this.field126[this.field428] = var14.field1081;
                            this.field185[this.field428] = 923;
                            this.field184[this.field428] = var14.field1052;
                            ++this.field428;
                        }
                        if (var14.field1064 == 5 && arg4 >= var15 && arg5 >= var16 && arg4 < var14.field1105 + var15 && arg5 < var14.field1095 + var16) {
                            this.field126[this.field428] = var14.field1081;
                            this.field185[this.field428] = 417;
                            this.field184[this.field428] = var14.field1052;
                            ++this.field428;
                        }
                        if (var14.field1064 == 6 && !this.field236 && arg4 >= var15 && arg5 >= var16 && arg4 < var14.field1105 + var15 && arg5 < var14.field1095 + var16) {
                            this.field126[this.field428] = var14.field1081;
                            this.field185[this.field428] = 1;
                            this.field184[this.field428] = var14.field1052;
                            ++this.field428;
                        }
                        if (var14.field1082 == 2) {
                            int var19 = 0;
                            for (int var20 = 0; var20 < var14.field1095; ++var20) {
                                for (int var21 = 0; var21 < var14.field1105; ++var21) {
                                    int var22 = (var14.field1111 + 32) * var21 + var15;
                                    int var23 = (var14.field1090 + 32) * var20 + var16;
                                    if (var19 < 20) {
                                        var22 += var14.field1106[var19];
                                        var23 += var14.field1107[var19];
                                    }
                                    if (arg4 >= var22 && arg5 >= var23 && arg4 < var22 + 32 && arg5 < var23 + 32) {
                                        this.field414 = var19;
                                        this.field415 = var14.field1052;
                                        if (var14.field1041[var19] > 0) {
                                            class34 var24 = class34.method390(var14.field1041[var19] - 1);
                                            if (this.field113 == 1 && var14.field1057) {
                                                if (this.field115 != var14.field1052 || this.field114 != var19) {
                                                    this.field126[this.field428] = "Use " + this.field117 + " with @lre@" + var24.field985;
                                                    this.field185[this.field428] = 51;
                                                    this.field186[this.field428] = var24.field995;
                                                    this.field183[this.field428] = var19;
                                                    this.field184[this.field428] = var14.field1052;
                                                    ++this.field428;
                                                }
                                            } else if (this.field189 == 1 && var14.field1057) {
                                                if ((this.field191 & 16) == 16) {
                                                    this.field126[this.field428] = this.field192 + " @lre@" + var24.field985;
                                                    this.field185[this.field428] = 906;
                                                    this.field186[this.field428] = var24.field995;
                                                    this.field183[this.field428] = var19;
                                                    this.field184[this.field428] = var14.field1052;
                                                    ++this.field428;
                                                }
                                            } else {
                                                if (var14.field1057) {
                                                    for (int var25 = 4; var25 >= 3; --var25) {
                                                        if (var24.field987 != null && var24.field987[var25] != null) {
                                                            this.field126[this.field428] = var24.field987[var25] + " @lre@" + var24.field985;
                                                            if (var25 == 3) {
                                                                this.field185[this.field428] = 4;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field185[this.field428] = 856;
                                                            }
                                                            this.field186[this.field428] = var24.field995;
                                                            this.field183[this.field428] = var19;
                                                            this.field184[this.field428] = var14.field1052;
                                                            ++this.field428;
                                                        } else if (var25 == 4) {
                                                            this.field126[this.field428] = "Drop @lre@" + var24.field985;
                                                            this.field185[this.field428] = 856;
                                                            this.field186[this.field428] = var24.field995;
                                                            this.field183[this.field428] = var19;
                                                            this.field184[this.field428] = var14.field1052;
                                                            ++this.field428;
                                                        }
                                                    }
                                                }
                                                if (var14.field1078) {
                                                    this.field126[this.field428] = "Use @lre@" + var24.field985;
                                                    this.field185[this.field428] = 529;
                                                    this.field186[this.field428] = var24.field995;
                                                    this.field183[this.field428] = var19;
                                                    this.field184[this.field428] = var14.field1052;
                                                    ++this.field428;
                                                }
                                                if (var14.field1057 && var24.field987 != null) {
                                                    for (int var26 = 2; var26 >= 0; --var26) {
                                                        if (var24.field987[var26] != null) {
                                                            this.field126[this.field428] = var24.field987[var26] + " @lre@" + var24.field985;
                                                            if (var26 == 0) {
                                                                this.field185[this.field428] = 682;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field185[this.field428] = 486;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field185[this.field428] = 593;
                                                            }
                                                            this.field186[this.field428] = var24.field995;
                                                            this.field183[this.field428] = var19;
                                                            this.field184[this.field428] = var14.field1052;
                                                            ++this.field428;
                                                        }
                                                    }
                                                }
                                                if (var14.field1091 != null) {
                                                    for (int var27 = 4; var27 >= 0; --var27) {
                                                        if (var14.field1091[var27] != null) {
                                                            this.field126[this.field428] = var14.field1091[var27] + " @lre@" + var24.field985;
                                                            if (var27 == 0) {
                                                                this.field185[this.field428] = 113;
                                                            }
                                                            if (var27 == 1) {
                                                                this.field185[this.field428] = 490;
                                                            }
                                                            if (var27 == 2) {
                                                                this.field185[this.field428] = 489;
                                                            }
                                                            if (var27 == 3) {
                                                                this.field185[this.field428] = 315;
                                                            }
                                                            if (var27 == 4) {
                                                                this.field185[this.field428] = 422;
                                                            }
                                                            this.field186[this.field428] = var24.field995;
                                                            this.field183[this.field428] = var19;
                                                            this.field184[this.field428] = var14.field1052;
                                                            ++this.field428;
                                                        }
                                                    }
                                                }
                                                this.field126[this.field428] = "Examine @lre@" + var24.field985;
                                                this.field185[this.field428] = 1314;
                                                this.field186[this.field428] = var24.field995;
                                                this.field183[this.field428] = var19;
                                                this.field184[this.field428] = var14.field1052;
                                                ++this.field428;
                                            }
                                        }
                                    }
                                    ++var19;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
    public final void method162(boolean arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            signlink.midivol = arg1;
            if (arg0) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method163(boolean arg0) {
        this.field281 &= arg0;
        this.method124(this.field410);
        if (this.field398 == 1) {
            this.field309[this.field397 / 100].method318(233, this.field395 - 8 - 4, this.field396 - 8 - 4);
        }
        if (this.field398 == 2) {
            this.field309[this.field397 / 100 + 4].method318(233, this.field395 - 8 - 4, this.field396 - 8 - 4);
            ++field196;
            if (field196 > 1088) {
                field196 = 0;
                this.field132.method202((byte) 64, 158);
                this.field132.method203(0);
                int var2 = this.field132.field643;
                this.field132.method203(191);
                this.field132.method204((int) (Math.random() * 65536.0D));
                this.field132.method203(252);
                this.field132.method204((int) (Math.random() * 65536.0D));
                this.field132.method204(57323);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field132.method204(6617);
                }
                this.field132.method204((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field132.method203(218);
                }
                this.field132.method204(45149);
                this.field132.method203((int) (Math.random() * 256.0D));
                this.field132.method212(false, this.field132.field643 - var2);
            }
        }
        if (this.field500 != -1) {
            this.method62(this.field500, 0, this.field354);
            this.method71(0, true, 0, class36.method394(this.field500), 0);
        }
        if (this.field142 != -1) {
            this.method62(this.field142, 0, this.field354);
            this.method71(0, true, 0, class36.method394(this.field142), 0);
        }
        this.method58(5);
        if (!this.field262) {
            this.method88(133);
            this.method110((byte) -118);
        } else if (this.field205 == 0) {
            this.method114(45528);
        }
        if (this.field127 == 1) {
            this.field528.method318(233, 472, 296);
        }
        if (field238) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field585 < 30 && field121) {
                var5 = 16711680;
            }
            if (super.field585 < 20 && !field121) {
                var5 = 16711680;
            }
            this.field406.method12(var3, var4, (byte) 63, "Fps:" + super.field585, var5);
            int var15 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field121) {
                int var9 = 16711680;
            }
            if (var7 > 67108864 && !field121) {
                int var10 = 16711680;
            }
            this.field406.method12(var3, var15, (byte) 63, "Mem:" + var7 + "k", 16776960);
            var15 += 15;
        }
        if (this.field530 != 0) {
            int var11 = this.field530 / 50;
            int var12 = var11 / 60;
            int var13 = var11 % 60;
            if (var13 < 10) {
                this.field406.method17(779, "System update in: " + var12 + ":0" + var13, 4, 329, 16776960);
            } else {
                this.field406.method17(779, "System update in: " + var12 + ":" + var13, 4, 329, 16776960);
            }
            ++field267;
            if (field267 > 1677) {
                field267 = 0;
                this.field132.method202((byte) 64, 211);
                this.field132.method203(0);
                int var14 = this.field132.field643;
                this.field132.method203(151);
                this.field132.method204(56197);
                this.field132.method204((int) (Math.random() * 65536.0D));
                this.field132.method203(200);
                this.field132.method203(125);
                this.field132.method204((int) (Math.random() * 65536.0D));
                this.field132.method203(53);
                this.field132.method204(49325);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field132.method204(62961);
                }
                this.field132.method204(38474);
                this.field132.method212(false, this.field132.field643 - var14);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZIBII)Z")
    public final boolean method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, byte arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var39 = 0; var39 < var14; ++var39) {
                this.field280[var15][var39] = 0;
                this.field385[var15][var39] = 99999999;
            }
        }
        int var16 = arg6;
        int var17 = arg5;
        this.field280[arg6][arg5] = 99;
        this.field385[arg6][arg5] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field268[var18] = arg6;
        if (arg9 != -85) {
            this.field436 = this.field527.method213();
        }
        int var40 = var18 + 1;
        this.field269[var18] = arg5;
        boolean var20 = false;
        int var21 = this.field268.length;
        int[][] var22 = this.field339[this.field411].field1716;
        while (var40 != var19) {
            var16 = this.field268[var19];
            var17 = this.field269[var19];
            var19 = (var19 + 1) % var21;
            if (arg8 == var16 && arg0 == var17) {
                var20 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && this.field339[this.field411].method585(arg0, arg3, arg11 - 1, true, var17, arg8, var16)) {
                    var20 = true;
                    break;
                }
                if (arg11 < 10 && this.field339[this.field411].method586(arg3, arg0, var17, arg11 - 1, -37555, var16, arg8)) {
                    var20 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg10 != 0 && this.field339[this.field411].method587(var17, var16, arg10, -803, arg0, arg8, arg4, arg2)) {
                var20 = true;
                break;
            }
            int var38 = this.field385[var16][var17] + 1;
            if (var16 > 0 && this.field280[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field268[var40] = var16 - 1;
                this.field269[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field280[var16 - 1][var17] = 2;
                this.field385[var16 - 1][var17] = var38;
            }
            if (var16 < var13 - 1 && this.field280[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field268[var40] = var16 + 1;
                this.field269[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field280[var16 + 1][var17] = 8;
                this.field385[var16 + 1][var17] = var38;
            }
            if (var17 > 0 && this.field280[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field268[var40] = var16;
                this.field269[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field280[var16][var17 - 1] = 1;
                this.field385[var16][var17 - 1] = var38;
            }
            if (var17 < var14 - 1 && this.field280[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field268[var40] = var16;
                this.field269[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field280[var16][var17 + 1] = 4;
                this.field385[var16][var17 + 1] = var38;
            }
            if (var16 > 0 && var17 > 0 && this.field280[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field268[var40] = var16 - 1;
                this.field269[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field280[var16 - 1][var17 - 1] = 3;
                this.field385[var16 - 1][var17 - 1] = var38;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field280[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field268[var40] = var16 + 1;
                this.field269[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field280[var16 + 1][var17 - 1] = 9;
                this.field385[var16 + 1][var17 - 1] = var38;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field280[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field268[var40] = var16 - 1;
                this.field269[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field280[var16 - 1][var17 + 1] = 6;
                this.field385[var16 - 1][var17 + 1] = var38;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field280[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field268[var40] = var16 + 1;
                this.field269[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field280[var16 + 1][var17 + 1] = 12;
                this.field385[var16 + 1][var17 + 1] = var38;
            }
        }
        this.field108 = 0;
        if (!var20) {
            if (!arg7) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg8 - var25; var26 <= arg8 + var25; ++var26) {
                for (int var27 = arg0 - var25; var27 <= arg0 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field385[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg8) {
                            var28 = arg8 - var26;
                        } else if (var26 > arg4 + arg8 - 1) {
                            var28 = var26 - (arg4 + arg8 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg0) {
                            var29 = arg0 - var27;
                        } else if (var27 > arg0 + arg10 - 1) {
                            var29 = var27 - (arg0 + arg10 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field385[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field385[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg6 == var16 && arg5 == var17) {
                return false;
            }
            this.field108 = 1;
        }
        byte var31 = 0;
        this.field268[var31] = var16;
        int var41 = var31 + 1;
        this.field269[var31] = var17;
        int var32;
        int var33 = var32 = this.field280[var16][var17];
        while (arg6 != var16 || arg5 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field268[var41] = var16;
                this.field269[var41++] = var17;
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
            var33 = this.field280[var16][var17];
        }
        if (var41 <= 0) {
            if (arg1 == 1) {
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
            int var35 = this.field268[var41];
            int var36 = this.field269[var41];
            if (arg1 == 0) {
                this.field132.method202((byte) 64, 130);
                this.field132.method203(var34 + var34 + 3);
            }
            if (arg1 == 1) {
                this.field132.method202((byte) 64, 97);
                this.field132.method203(var34 + var34 + 3 + 14);
            }
            if (arg1 == 2) {
                this.field132.method202((byte) 64, 32);
                this.field132.method203(var34 + var34 + 3);
            }
            this.field446 = this.field268[0];
            this.field447 = this.field269[0];
            for (int var37 = 1; var37 < var34; ++var37) {
                --var41;
                this.field132.method231(0, this.field268[var41] - var35);
                this.field132.method229(this.field269[var41] - var36, 0);
            }
            this.field132.method204(this.field97 + var36);
            this.field132.method239(this.field96 + var35, -14191);
            this.field132.method231(0, super.field607[5] == 1 ? 1 : 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method165(int arg0) {
        if (arg0 != 8) {
            this.field249 = this.field512.method544();
        }
        while (true) {
            class61 var2 = this.field393.method372();
            if (var2 == null) {
                return;
            }
            if (var2.field1511 == 0) {
                class28.method328(-268, var2.field1509, var2.field1512);
                if ((this.field393.method374(true, var2.field1509) & 98) != 0) {
                    this.field394 = true;
                    if (this.field193 != -1 || this.field199 != -1) {
                        this.field452 = true;
                    }
                }
            }
            if (var2.field1511 == 1 && var2.field1512 != null) {
                class53.method452(var2.field1512, -89);
            }
            if (var2.field1511 == 2 && this.field378 == var2.field1509 && var2.field1512 != null) {
                this.method174(this.field379, var2.field1512, this.field304);
            }
            if (var2.field1511 == 3 && this.field388 == 1) {
                for (int var3 = 0; var3 < this.field66.length; ++var3) {
                    if (this.field337[var3] == var2.field1509) {
                        this.field66[var3] = var2.field1512;
                        if (var2.field1512 == null) {
                            this.field337[var3] = -1;
                        }
                        break;
                    }
                    if (this.field338[var3] == var2.field1509) {
                        this.field467[var3] = var2.field1512;
                        if (var2.field1512 == null) {
                            this.field338[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1511 == 93 && this.field393.method364(var2.field1509, (byte) 6)) {
                class67.method552(true, this.field393, new class13(var2.field1512, (byte) 3));
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method166(int arg0) {
        if (this.field401 == 0) {
            int var2 = super.field603;
            if (arg0 != 9) {
                this.field548 = -430;
            }
            if (this.field189 == 1 && super.field604 >= 516 && super.field605 >= 160 && super.field604 <= 765 && super.field605 <= 205) {
                var2 = 0;
            }
            if (this.field262) {
                if (var2 != 1) {
                    int var3 = super.field597;
                    int var4 = super.field598;
                    if (this.field205 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field205 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field205 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field206 - 10 || var3 > this.field208 + this.field206 + 10 || var4 < this.field207 - 10 || var4 > this.field209 + this.field207 + 10) {
                        this.field262 = false;
                        if (this.field205 == 1) {
                            this.field394 = true;
                        }
                        if (this.field205 == 2) {
                            this.field452 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field206;
                    int var6 = this.field207;
                    int var7 = this.field208;
                    int var8 = super.field604;
                    int var9 = super.field605;
                    if (this.field205 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field205 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field205 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field428; ++var11) {
                        int var12 = (this.field428 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method90((byte) 7, var10);
                    }
                    this.field262 = false;
                    if (this.field205 == 1) {
                        this.field394 = true;
                    }
                    if (this.field205 == 2) {
                        this.field452 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field428 > 0) {
                    int var13 = this.field185[this.field428 - 1];
                    if (var13 == 113 || var13 == 490 || var13 == 489 || var13 == 315 || var13 == 422 || var13 == 682 || var13 == 486 || var13 == 593 || var13 == 4 || var13 == 856 || var13 == 529 || var13 == 1314) {
                        int var14 = this.field183[this.field428 - 1];
                        int var15 = this.field184[this.field428 - 1];
                        class36 var16 = class36.method394(var15);
                        if (var16.field1076 || var16.field1058) {
                            this.field74 = false;
                            this.field356 = 0;
                            this.field399 = var15;
                            this.field400 = var14;
                            this.field401 = 2;
                            this.field402 = super.field604;
                            this.field403 = super.field605;
                            if (class36.method394(var15).field1092 == this.field142) {
                                this.field401 = 1;
                            }
                            if (class36.method394(var15).field1092 == this.field193) {
                                this.field401 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field303 == 1 || this.method178(this.field428 - 1, 984)) && this.field428 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field428 > 0) {
                    this.method90((byte) 7, this.field428 - 1);
                }
                if (var2 != 2 || this.field428 <= 0) {
                    return;
                }
                this.method54(-34918);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method167(int arg0) {
        if (arg0 != -3265) {
            this.field228 = -370;
        }
        try {
            int var2 = field89.field1255 + this.field124;
            int var3 = field89.field1256 + this.field461;
            if (this.field211 - var2 < -500 || this.field211 - var2 > 500 || this.field212 - var3 < -500 || this.field212 - var3 > 500) {
                this.field211 = var2;
                this.field212 = var3;
            }
            if (this.field211 != var2) {
                this.field211 += (var2 - this.field211) / 16;
            }
            if (this.field212 != var3) {
                this.field212 += (var3 - this.field212) / 16;
            }
            if (super.field607[1] == 1) {
                this.field370 += (-24 - this.field370) / 2;
            } else if (super.field607[2] == 1) {
                this.field370 += (24 - this.field370) / 2;
            } else {
                this.field370 /= 2;
            }
            if (super.field607[3] == 1) {
                this.field371 += (12 - this.field371) / 2;
            } else if (super.field607[4] == 1) {
                this.field371 += (-12 - this.field371) / 2;
            } else {
                this.field371 /= 2;
            }
            this.field369 = this.field370 / 2 + this.field369 & 2047;
            this.field368 += this.field371 / 2;
            if (this.field368 < 128) {
                this.field368 = 128;
            }
            if (this.field368 > 383) {
                this.field368 = 383;
            }
            int var4 = this.field211 >> 7;
            int var5 = this.field212 >> 7;
            int var6 = this.method106(this.field211, (byte) -10, this.field411, this.field212);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field411;
                        if (var10 < 3 && (this.field556[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field511[var10][var8][var9];
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
            if (var12 > this.field102) {
                this.field102 += (var12 - this.field102) / 24;
            } else if (var12 < this.field102) {
                this.field102 += (var12 - this.field102) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field89.field1255 + "," + field89.field1256 + "," + this.field211 + "," + this.field212 + "," + this.field476 + "," + this.field477 + "," + this.field96 + "," + this.field97);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLPCARWQQC;I)I")
    public final int method168(byte arg0, class36 arg1, int arg2) {
        if (arg0 != -7) {
            field261 = -43;
        }
        if (arg1.field1099 != null && arg2 < arg1.field1099.length) {
            try {
                int[] var4 = arg1.field1099[arg2];
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
                        var9 = this.field392[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field433[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field201[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class36 var11 = class36.method394(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class34.field992 && (!class34.method390(var12).field1001 || field120)) {
                            for (int var13 = 0; var13 < var11.field1041.length; ++var13) {
                                if (var12 + 1 == var11.field1041[var13]) {
                                    var9 += var11.field1093[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field544[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field107[this.field433[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field544[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field89.field1641;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class60.field1506; ++var14) {
                            if (class60.field1508[var14]) {
                                var9 += this.field433[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class36 var15 = class36.method394(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class34.field992 && (!class34.method390(var16).field1001 || field120)) {
                            for (int var17 = 0; var17 < var15.field1041.length; ++var17) {
                                if (var15.field1041[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field494;
                    }
                    if (var8 == 12) {
                        var9 = this.field451;
                    }
                    if (var8 == 13) {
                        int var18 = this.field544[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class35 var21 = class35.field1024[var20];
                        int var22 = var21.field1026;
                        int var23 = var21.field1027;
                        int var24 = var21.field1028;
                        int var25 = field503[var24 - var23];
                        var9 = this.field544[var22] >> var23 & var25;
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
                        var9 = (field89.field1255 >> 7) + this.field96;
                    }
                    if (var8 == 19) {
                        var9 = (field89.field1256 >> 7) + this.field97;
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

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method169(int arg0) {
        short var2 = 256;
        if (arg0 >= 0) {
            this.field249 = this.field512.method544();
        }
        if (this.field376 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field376 > 768) {
                    this.field313[var3] = this.method92(1024 - this.field376, this.field315[var3], this.field314[var3], false);
                } else if (this.field376 > 256) {
                    this.field313[var3] = this.field315[var3];
                } else {
                    this.field313[var3] = this.method92(256 - this.field376, this.field314[var3], this.field315[var3], false);
                }
            }
        } else if (this.field377 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field377 > 768) {
                    this.field313[var4] = this.method92(1024 - this.field377, this.field316[var4], this.field314[var4], false);
                } else if (this.field377 > 256) {
                    this.field313[var4] = this.field316[var4];
                } else {
                    this.field313[var4] = this.method92(256 - this.field377, this.field314[var4], this.field316[var4], false);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field313[var5] = this.field314[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field175.field706[var6] = this.field440.field796[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field93[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field76[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field313[var26];
                    int var30 = this.field175.field706[var8];
                    this.field175.field706[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field175.method295(0, -895, super.field589, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field176.field706[var10] = this.field441.field796[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field93[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field76[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field313[var18];
                    int var22 = this.field176.field706[var16];
                    this.field176.field706[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field176.method295(0, -895, super.field589, 637);
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
    public final void method170(int arg0) {
        while (arg0 >= 0) {
            this.field278 = null;
        }
        this.field132.method202((byte) 64, 155);
        if (this.field510 != -1) {
            this.method50(this.field510, 7063);
            this.field510 = -1;
            this.field394 = true;
            this.field236 = false;
            this.field188 = true;
        }
        if (this.field193 != -1) {
            this.method50(this.field193, 7063);
            this.field193 = -1;
            this.field452 = true;
            this.field236 = false;
        }
        if (this.field272 != -1) {
            this.method50(this.field272, 7063);
            this.field272 = -1;
            this.field271 = true;
        }
        if (this.field508 != -1) {
            this.method50(this.field508, 7063);
            this.field508 = -1;
        }
        if (this.field142 != -1) {
            this.method50(this.field142, 7063);
            this.field142 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFTMSICIZ;BI)V")
    private final void method171(class13 arg0, byte arg1, int arg2) {
        for (int var4 = 0; var4 < this.field536; ++var4) {
            int var5 = this.field537[var4];
            class66 var6 = this.field533[var5];
            int var7 = arg0.method213();
            if ((var7 & 16) != 0) {
                var7 += arg0.method213() << 8;
            }
            this.method116(arg0, false, var7, var5, var6);
        }
        if (this.field75 != arg1) {
            this.method120();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method172(int arg0, String arg1, int arg2) {
        this.field443 = arg2;
        this.field420 = arg1;
        this.method140(true);
        if (this.field182 == null) {
            super.method172(-23874, arg1, arg2);
        } else {
            this.field174.method294(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field407.method13(var4 / 2, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", 16777215, false);
            int var7 = var5 / 2 - 18 - var6;
            class5.method34(304, 34, 9179409, var4 / 2 - 152, var7, true);
            class5.method34(302, 32, 0, var4 / 2 - 151, var7 + 1, true);
            class5.method33(var4 / 2 - 150, 9179409, var7 + 2, 30, this.field350, arg2 * 3);
            class5.method33(arg2 * 3 + (var4 / 2 - 150), 0, var7 + 2, 30, this.field350, 300 - arg2 * 3);
            this.field407.method13(var4 / 2, var5 / 2 + 5 - var6, arg1, 16777215, false);
            if (arg0 != -23874) {
                for (int var8 = 1; var8 > 0; ++var8) {
                }
            }
            this.field174.method295(171, -895, super.field589, 202);
            if (this.field271) {
                this.field271 = false;
                if (!this.field274) {
                    this.field175.method295(0, -895, super.field589, 0);
                    this.field176.method295(0, -895, super.field589, 637);
                }
                this.field172.method295(0, -895, super.field589, 128);
                this.field173.method295(371, -895, super.field589, 202);
                this.field177.method295(265, -895, super.field589, 0);
                this.field178.method295(265, -895, super.field589, 562);
                this.field179.method295(171, -895, super.field589, 128);
                this.field180.method295(171, -895, super.field589, 562);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
    public final void method173(int arg0) {
        if (arg0 != -21554) {
            this.method120();
        }
        for (int var2 = 0; var2 < this.field90; ++var2) {
            if (this.field279[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field110[var2] == this.field234 && this.field216[var2] == this.field520) {
                        if (!this.method158(-24738)) {
                            var3 = true;
                        }
                    } else {
                        class13 var4 = class56.method463(false, this.field110[var2], this.field216[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field643 / 22) > (long) (this.field487 / 22) + this.field123) {
                            this.field487 = var4.field643;
                            this.field123 = System.currentTimeMillis();
                            if (this.method42(var4.field643, true, var4.field642)) {
                                this.field234 = this.field110[var2];
                                this.field520 = this.field216[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field132.method202((byte) 64, 1);
                        this.field132.method204(this.field110[var2] & 32767);
                    } else {
                        this.field132.method202((byte) 64, 1);
                        this.field132.method204(-1);
                    }
                }
                if (var3 && this.field279[var2] != -5) {
                    this.field279[var2] = -5;
                } else {
                    --this.field90;
                    for (int var6 = var2; var6 < this.field90; ++var6) {
                        this.field110[var6] = this.field110[var6 + 1];
                        this.field216[var6] = this.field216[var6 + 1];
                        this.field279[var6] = this.field279[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field279[var2]--;
            }
        }
        if (this.field136 > 0) {
            this.field136 -= 20;
            if (this.field136 < 0) {
                this.field136 = 0;
            }
            if (this.field136 == 0 && this.field163 && !field121) {
                this.field378 = this.field94;
                this.field379 = true;
                this.field393.method366(2, this.field378);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BZ)V")
    public final void method174(boolean arg0, byte[] arg1, boolean arg2) {
        if (this.field163) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
            if (arg2) {
                this.field350 = this.field512.method544();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILFTMSICIZ;Z)V")
    private final void method175(int arg0, class13 arg1, boolean arg2) {
        this.field281 &= arg2;
        while (arg1.field644 + 10 < arg0 * 8) {
            int var4 = arg1.method224(11, 779);
            if (var4 == 2047) {
                break;
            }
            if (this.field533[var4] == null) {
                this.field533[var4] = new class66();
                if (this.field538[var4] != null) {
                    this.field533[var4].method548(2, this.field538[var4]);
                }
            }
            this.field535[this.field534++] = var4;
            class66 var5 = this.field533[var4];
            var5.field1274 = field282;
            int var6 = arg1.method224(5, 779);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method224(5, 779);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method224(1, 779);
            if (var8 == 1) {
                this.field537[this.field536++] = var4;
            }
            int var9 = arg1.method224(1, 779);
            var5.method432(field89.field1258[0] + var7, var9 == 1, field89.field1259[0] + var6, 730);
        }
        arg1.method225(462);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFTMSICIZ;IZ)V")
    private final void method176(class13 arg0, int arg1, boolean arg2) {
        arg0.method223(-25838);
        int var4 = arg0.method224(1, 779);
        if (arg2) {
            this.field72 = !this.field72;
        }
        if (var4 != 0) {
            int var5 = arg0.method224(2, 779);
            if (var5 == 0) {
                this.field537[this.field536++] = this.field532;
            } else if (var5 == 1) {
                int var6 = arg0.method224(3, 779);
                field89.method430(36500, var6, false);
                int var7 = arg0.method224(1, 779);
                if (var7 == 1) {
                    this.field537[this.field536++] = this.field532;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method224(3, 779);
                field89.method430(36500, var8, true);
                int var9 = arg0.method224(3, 779);
                field89.method430(36500, var9, true);
                int var10 = arg0.method224(1, 779);
                if (var10 == 1) {
                    this.field537[this.field536++] = this.field532;
                }
            } else if (var5 == 3) {
                int var11 = arg0.method224(1, 779);
                if (var11 == 1) {
                    this.field537[this.field536++] = this.field532;
                }
                int var12 = arg0.method224(7, 779);
                int var13 = arg0.method224(7, 779);
                int var14 = arg0.method224(1, 779);
                this.field411 = arg0.method224(2, 779);
                field89.method432(var12, var14 == 1, var13, 730);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public final void method177(String arg0, String arg1, int arg2, int arg3) {
        if (arg2 == 0 && this.field199 != -1) {
            this.field412 = arg0;
            super.field603 = 0;
        }
        if (this.field193 == -1) {
            this.field452 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field310[var5] = this.field310[var5 - 1];
            this.field311[var5] = this.field311[var5 - 1];
            this.field312[var5] = this.field312[var5 - 1];
        }
        this.field310[0] = arg2;
        this.field311[0] = arg1;
        this.field312[0] = arg0;
        if (arg3 != 20045) {
            this.field355 = !this.field355;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
    public final boolean method178(int arg0, int arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field185[arg0];
            if (arg1 <= 0) {
                this.field159 = 489;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 143;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)LAKPFVPPG;")
    public final class2 method179(String arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg5 < 1 || arg5 > 1) {
            this.field278 = null;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field294[0] != null) {
                var7 = this.field294[0].method8(arg1, 799);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field391.reset();
            this.field391.update(var7);
            int var9 = (int) this.field391.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class2(true, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method172(-23874, "Requesting " + arg0, arg3);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method76(arg4 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class13 var17 = new class13(var16, (byte) 3);
                    var17.field643 = 3;
                    int var18 = var17.method217() + 6;
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
                            this.method172(-23874, "Loading " + arg0 + " - " + var23 + "%", arg3);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field294[0] != null) {
                            this.field294[0].method9((byte) -9, var7, var7.length, arg1);
                        }
                    } catch (Exception var29) {
                        this.field294[0] = null;
                    }
                    if (var7 != null) {
                        this.field391.reset();
                        this.field391.update(var7);
                        int var24 = (int) this.field391.getValue();
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
                            this.method172(-23874, "Game updated - please reload page", arg3);
                            var26 = 10;
                        } else {
                            this.method172(-23874, var12 + " - Retrying in " + var26, arg3);
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
                    this.field416 = !this.field416;
                }
            }
            return new class2(true, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZILRDFTXEYV;)V")
    public final void method180(int arg0, int arg1, boolean arg2, int arg3, class48 arg4) {
        this.field281 &= arg2;
        if (this.field428 < 400) {
            if (arg4.field1373 != null) {
                arg4 = arg4.method436((byte) -38);
            }
            if (arg4 != null) {
                if (arg4.field1365) {
                    String var6 = arg4.field1343;
                    if (arg4.field1339 != 0) {
                        var6 = var6 + method86(614, field89.field1641, arg4.field1339) + " (level-" + arg4.field1339 + ")";
                    }
                    if (this.field113 == 1) {
                        this.field126[this.field428] = "Use " + this.field117 + " with @yel@" + var6;
                        this.field185[this.field428] = 800;
                        this.field186[this.field428] = arg0;
                        this.field183[this.field428] = arg1;
                        this.field184[this.field428] = arg3;
                        ++this.field428;
                    } else {
                        if (this.field189 == 1) {
                            if ((this.field191 & 2) == 2) {
                                this.field126[this.field428] = this.field192 + " @yel@" + var6;
                                this.field185[this.field428] = 83;
                                this.field186[this.field428] = arg0;
                                this.field183[this.field428] = arg1;
                                this.field184[this.field428] = arg3;
                                ++this.field428;
                                return;
                            }
                        } else {
                            if (arg4.field1378 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg4.field1378[var7] != null && !arg4.field1378[var7].equalsIgnoreCase("attack")) {
                                        this.field126[this.field428] = arg4.field1378[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field185[this.field428] = 992;
                                        }
                                        if (var7 == 1) {
                                            this.field185[this.field428] = 286;
                                        }
                                        if (var7 == 2) {
                                            this.field185[this.field428] = 434;
                                        }
                                        if (var7 == 3) {
                                            this.field185[this.field428] = 319;
                                        }
                                        if (var7 == 4) {
                                            this.field185[this.field428] = 476;
                                        }
                                        this.field186[this.field428] = arg0;
                                        this.field183[this.field428] = arg1;
                                        this.field184[this.field428] = arg3;
                                        ++this.field428;
                                    }
                                }
                            }
                            if (arg4.field1378 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg4.field1378[var8] != null && arg4.field1378[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg4.field1339 > field89.field1641) {
                                            var9 = 2000;
                                        }
                                        this.field126[this.field428] = arg4.field1378[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field185[this.field428] = var9 + 992;
                                        }
                                        if (var8 == 1) {
                                            this.field185[this.field428] = var9 + 286;
                                        }
                                        if (var8 == 2) {
                                            this.field185[this.field428] = var9 + 434;
                                        }
                                        if (var8 == 3) {
                                            this.field185[this.field428] = var9 + 319;
                                        }
                                        if (var8 == 4) {
                                            this.field185[this.field428] = var9 + 476;
                                        }
                                        this.field186[this.field428] = arg0;
                                        this.field183[this.field428] = arg1;
                                        this.field184[this.field428] = arg3;
                                        ++this.field428;
                                    }
                                }
                            }
                            this.field126[this.field428] = "Examine @yel@" + var6;
                            this.field185[this.field428] = 1738;
                            this.field186[this.field428] = arg0;
                            this.field183[this.field428] = arg1;
                            this.field184[this.field428] = arg3;
                            ++this.field428;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
    public final void method181(int arg0, boolean arg1) {
        class36 var3 = class36.method394(arg0);
        for (int var4 = 0; var4 < var3.field1048.length && var3.field1048[var4] != -1; ++var4) {
            class36 var5 = class36.method394(var3.field1048[var4]);
            if (var5.field1082 == 1) {
                this.method181(var5.field1052, false);
            }
            var5.field1037 = 0;
            var5.field1053 = 0;
        }
        if (arg1) {
            this.method120();
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method182(boolean arg0) {
        if (this.field458 == null) {
            this.method135(-513);
            super.field590 = null;
            this.field172 = null;
            this.field173 = null;
            this.field174 = null;
            this.field175 = null;
            this.field176 = null;
            this.field177 = null;
            this.field178 = null;
            this.field179 = null;
            this.field180 = null;
            this.field458 = new class20(this.method109(-61), 479, 430, 96);
            this.field456 = new class20(this.method109(-61), 172, 430, 156);
            class5.method31((byte) 4);
            this.field491.method304(233, 0, 0);
            this.field455 = new class20(this.method109(-61), 190, 430, 261);
            this.field457 = new class20(this.method109(-61), 512, 430, 334);
            class5.method31((byte) 4);
            this.field305 = new class20(this.method109(-61), 496, 430, 50);
            this.field306 = new class20(this.method109(-61), 269, 430, 37);
            this.field281 &= arg0;
            this.field307 = new class20(this.method109(-61), 249, 430, 45);
            this.field271 = true;
            this.field457.method294(0);
            class71.field1731 = this.field321;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(LFTMSICIZ;II)V")
    public final void method183(class13 arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            this.method120();
        }
        if (arg2 == 17) {
            int var4 = arg0.method234(false);
            int var5 = var4 >> 2;
            int var6 = var4 & 3;
            int var7 = this.field164[var5];
            int var8 = arg0.method213();
            int var9 = (var8 >> 4 & 7) + this.field545;
            int var10 = (var8 & 7) + this.field546;
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                this.method156(-1, -1, 0, var6, 6, this.field411, var7, var10, var9, var5);
            }
        } else if (arg2 == 121) {
            int var11 = arg0.method242(4);
            int var12 = arg0.method234(false);
            int var13 = (var12 >> 4 & 7) + this.field545;
            int var14 = (var12 & 7) + this.field546;
            int var15 = arg0.method242(4);
            int var16 = arg0.method242(4);
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && this.field413 != var11) {
                class6 var17 = new class6();
                var17.field56 = var15;
                var17.field57 = var16;
                if (this.field278[this.field411][var13][var14] == null) {
                    this.field278[this.field411][var13][var14] = new class42(9203);
                }
                this.field278[this.field411][var13][var14].method419(var17);
                this.method48(var13, var14);
            }
        } else if (arg2 == 253) {
            int var18 = arg0.method242(4);
            int var19 = arg0.method215();
            int var20 = arg0.method213();
            int var21 = (var20 >> 4 & 7) + this.field545;
            int var22 = (var20 & 7) + this.field546;
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                class6 var23 = new class6();
                var23.field56 = var18;
                var23.field57 = var19;
                if (this.field278[this.field411][var21][var22] == null) {
                    this.field278[this.field411][var21][var22] = new class42(9203);
                }
                this.field278[this.field411][var21][var22].method419(var23);
                this.method48(var21, var22);
            }
        } else {
            if (arg2 == 32) {
                byte var24 = arg0.method237(true);
                byte var25 = arg0.method237(true);
                int var26 = arg0.method234(false);
                int var27 = (var26 >> 4 & 7) + this.field545;
                int var28 = (var26 & 7) + this.field546;
                byte var29 = arg0.method214();
                int var30 = arg0.method241(-12702);
                int var31 = arg0.method242(4);
                int var32 = arg0.method232(-48253);
                int var33 = var32 >> 2;
                int var34 = var32 & 3;
                int var35 = this.field164[var33];
                byte var36 = arg0.method236(-78);
                int var37 = arg0.method243(this.field317);
                int var38 = arg0.method242(4);
                class66 var39;
                if (this.field413 == var37) {
                    var39 = field89;
                } else {
                    var39 = this.field533[var37];
                }
                if (var39 != null) {
                    class39 var40 = class39.method409(var31);
                    int var41 = this.field511[this.field411][var27][var28];
                    int var42 = this.field511[this.field411][var27 + 1][var28];
                    int var43 = this.field511[this.field411][var27 + 1][var28 + 1];
                    int var44 = this.field511[this.field411][var27][var28 + 1];
                    class28 var45 = var40.method413(var33, var34, var41, var42, var43, var44, -1);
                    if (var45 != null) {
                        this.method156(-1, var30 + 1, var38 + 1, 0, 6, this.field411, var35, var28, var27, 0);
                        var39.field1638 = field282 + var38;
                        var39.field1639 = field282 + var30;
                        var39.field1623 = var45;
                        int var46 = var40.field1146;
                        int var47 = var40.field1141;
                        if (var34 == 1 || var34 == 3) {
                            var46 = var40.field1141;
                            var47 = var40.field1146;
                        }
                        var39.field1620 = var27 * 128 + var46 * 64;
                        var39.field1622 = var28 * 128 + var47 * 64;
                        var39.field1621 = this.method106(var39.field1620, (byte) -10, this.field411, var39.field1622);
                        if (var36 > var24) {
                            byte var48 = var36;
                            var36 = var24;
                            var24 = var48;
                        }
                        if (var25 > var29) {
                            byte var49 = var25;
                            var25 = var29;
                            var29 = var49;
                        }
                        var39.field1634 = var27 + var36;
                        var39.field1636 = var24 + var27;
                        var39.field1635 = var25 + var28;
                        var39.field1637 = var28 + var29;
                    }
                }
            }
            if (arg2 == 162) {
                int var50 = arg0.method213();
                int var51 = var50 >> 2;
                int var52 = var50 & 3;
                int var53 = this.field164[var51];
                int var54 = arg0.method233(7);
                int var55 = (var54 >> 4 & 7) + this.field545;
                int var56 = (var54 & 7) + this.field546;
                int var57 = arg0.method215();
                if (var55 >= 0 && var56 >= 0 && var55 < 103 && var56 < 103) {
                    int var58 = this.field511[this.field411][var55][var56];
                    int var59 = this.field511[this.field411][var55 + 1][var56];
                    int var60 = this.field511[this.field411][var55 + 1][var56 + 1];
                    int var61 = this.field511[this.field411][var55][var56 + 1];
                    if (var53 == 0) {
                        class29 var62 = this.field143.method509(this.field411, var55, true, var56);
                        if (var62 != null) {
                            int var63 = var62.field891 >> 14 & 32767;
                            if (var51 == 2) {
                                var62.field889 = new class15(var63, var59, var58, 2, var57, var61, var60, var52 + 4, 4, false);
                                var62.field890 = new class15(var63, var59, var58, 2, var57, var61, var60, var52 + 1 & 3, 4, false);
                            } else {
                                var62.field889 = new class15(var63, var59, var58, var51, var57, var61, var60, var52, 4, false);
                            }
                        }
                    }
                    if (var53 == 1) {
                        class7 var64 = this.field143.method510(true, this.field411, var56, var55);
                        if (var64 != null) {
                            var64.field63 = new class15(var64.field64 >> 14 & 32767, var59, var58, 4, var57, var61, var60, 0, 4, false);
                        }
                    }
                    if (var53 == 2) {
                        class49 var65 = this.field143.method511(var56, var55, this.field411, 8);
                        if (var51 == 11) {
                            var51 = 10;
                        }
                        if (var65 != null) {
                            var65.field1384 = new class15(var65.field1392 >> 14 & 32767, var59, var58, var51, var57, var61, var60, var52, 4, false);
                        }
                    }
                    if (var53 == 3) {
                        class46 var66 = this.field143.method512(this.field411, 0, var56, var55);
                        if (var66 != null) {
                            var66.field1310 = new class15(var66.field1311 >> 14 & 32767, var59, var58, 22, var57, var61, var60, var52, 4, false);
                        }
                    }
                }
            } else if (arg2 == 174) {
                int var67 = arg0.method213();
                int var68 = (var67 >> 4 & 7) + this.field545;
                int var69 = (var67 & 7) + this.field546;
                int var70 = arg0.method215();
                int var71 = arg0.method215();
                int var72 = arg0.method215();
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    class42 var73 = this.field278[this.field411][var68][var69];
                    if (var73 != null) {
                        for (class6 var74 = (class6) var73.method422(); var74 != null; var74 = (class6) var73.method424(false)) {
                            if ((var70 & 32767) == var74.field56 && var74.field57 == var71) {
                                var74.field57 = var72;
                                break;
                            }
                        }
                        this.method48(var68, var69);
                    }
                }
            } else if (arg2 != 9) {
                if (arg2 == 53) {
                    int var81 = arg0.method213();
                    int var82 = (var81 >> 4 & 7) + this.field545;
                    int var83 = (var81 & 7) + this.field546;
                    int var84 = arg0.method215();
                    int var85 = arg0.method213();
                    int var86 = arg0.method215();
                    if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                        int var87 = var82 * 128 + 64;
                        int var88 = var83 * 128 + 64;
                        class72 var89 = new class72(var87, var86, field282, this.field411, this.method106(var87, (byte) -10, this.field411, var88) - var85, (byte) 31, var84, var88);
                        this.field230.method419(var89);
                    }
                } else {
                    if (arg2 == 176) {
                        int var90 = arg0.method213();
                        int var91 = (var90 >> 4 & 7) + this.field545;
                        int var92 = (var90 & 7) + this.field546;
                        int var93 = arg0.method215();
                        int var94 = arg0.method213();
                        int var95 = var94 >> 4 & 15;
                        int var96 = var94 & 7;
                        if (field89.field1258[0] >= var91 - var95 && field89.field1258[0] <= var91 + var95 && field89.field1259[0] >= var92 - var95 && field89.field1259[0] <= var92 + var95 && this.field290 && !field121 && this.field90 < 50) {
                            this.field110[this.field90] = var93;
                            this.field216[this.field90] = var96;
                            this.field279[this.field90] = class56.field1483[var93];
                            ++this.field90;
                        }
                    }
                    if (arg2 == 54) {
                        int var97 = arg0.method213();
                        int var98 = (var97 >> 4 & 7) + this.field545;
                        int var99 = (var97 & 7) + this.field546;
                        int var100 = var98 + arg0.method214();
                        int var101 = var99 + arg0.method214();
                        int var102 = arg0.method216();
                        int var103 = arg0.method215();
                        int var104 = arg0.method213() * 4;
                        int var105 = arg0.method213() * 4;
                        int var106 = arg0.method215();
                        int var107 = arg0.method215();
                        int var108 = arg0.method213();
                        int var109 = arg0.method213();
                        if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                            int var110 = var98 * 128 + 64;
                            int var111 = var99 * 128 + 64;
                            int var112 = var100 * 128 + 64;
                            int var113 = var101 * 128 + 64;
                            class43 var114 = new class43(this.method106(var110, (byte) -10, this.field411, var111) - var104, field282 + var106, var110, var111, false, var108, var109, var103, var102, field282 + var107, var105, this.field411);
                            var114.method427(this.method106(var112, (byte) -10, this.field411, var113) - var105, field282 + var106, var112, this.field141, var113);
                            this.field140.method419(var114);
                        }
                    } else if (arg2 == 182) {
                        int var115 = arg0.method243(this.field317);
                        int var116 = arg0.method232(-48253);
                        int var117 = var116 >> 2;
                        int var118 = var116 & 3;
                        int var119 = this.field164[var117];
                        int var120 = arg0.method234(false);
                        int var121 = (var120 >> 4 & 7) + this.field545;
                        int var122 = (var120 & 7) + this.field546;
                        if (var121 >= 0 && var122 >= 0 && var121 < 104 && var122 < 104) {
                            this.method156(var115, -1, 0, var118, 6, this.field411, var119, var122, var121, var117);
                        }
                    }
                }
            } else {
                int var75 = arg0.method215();
                int var76 = arg0.method233(7);
                int var77 = (var76 >> 4 & 7) + this.field545;
                int var78 = (var76 & 7) + this.field546;
                if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                    class42 var79 = this.field278[this.field411][var77][var78];
                    if (var79 != null) {
                        for (class6 var80 = (class6) var79.method422(); var80 != null; var80 = (class6) var79.method424(false)) {
                            if ((var75 & 32767) == var80.field56) {
                                var80.method418();
                                break;
                            }
                        }
                        if (var79.method422() == null) {
                            this.field278[this.field411][var77][var78] = null;
                        }
                        this.method48(var77, var78);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
    public static final void method184(int arg0) {
        class63.field1534 = false;
        class71.field1720 = false;
        field121 = false;
        class67.field1656 = false;
        class39.field1172 = false;
        if (arg0 <= 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
    public final void method185(int arg0, boolean arg1) {
        if (field89.field1255 >> 7 == this.field446 && field89.field1256 >> 7 == this.field447) {
            this.field446 = 0;
        }
        int var3 = this.field534;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class66 var6;
            int var7;
            if (arg1) {
                var6 = field89;
                var7 = this.field532 << 14;
            } else {
                var6 = this.field533[this.field535[var4]];
                var7 = this.field535[var4] << 14;
            }
            if (var6 != null && var6.method433(172)) {
                var6.field1613 = false;
                if ((field121 && this.field534 > 50 || this.field534 > 200) && !arg1 && var6.field1288 == var6.field1276) {
                    var6.field1613 = true;
                }
                int var8 = var6.field1255 >> 7;
                int var9 = var6.field1256 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field1623 != null && field282 >= var6.field1638 && field282 < var6.field1639) {
                        var6.field1613 = false;
                        var6.field1616 = this.method106(var6.field1255, (byte) -10, this.field411, var6.field1256);
                        this.field143.method499(var6.field1634, true, var6.field1635, var6.field1257, var6, this.field411, 60, var6.field1255, var6.field1637, var6.field1636, var6.field1616, var7, var6.field1256);
                    } else {
                        if ((var6.field1255 & 127) == 64 && (var6.field1256 & 127) == 64) {
                            if (this.field296[var8][var9] == this.field519) {
                                continue;
                            }
                            this.field296[var8][var9] = this.field519;
                        }
                        var6.field1616 = this.method106(var6.field1255, (byte) -10, this.field411, var6.field1256);
                        this.field143.method498(var6.field1616, -44018, var6, var6.field1255, 60, var6.field1256, var6.field1257, this.field411, var6.field1290, var7);
                    }
                }
            }
        }
        int var5 = 86 / arg0;
    }

    @OriginalMember(owner = "client!client", name = "S", descriptor = "(I)V")
    public final void method186(int arg0) {
        class39.field1156.method200();
        class39.field1155.method200();
        class48.field1362.method200();
        while (arg0 >= 0) {
            this.field278 = null;
        }
        class34.field1010.method200();
        class34.field1021.method200();
        class66.field1614.method200();
        class24.field771.method200();
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)Ljava/lang/String;")
    public final String method187(byte arg0) {
        if (arg0 != -124) {
            this.field410 = this.field512.method544();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field592 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field107[var1] = var0 / 4;
        }
        field118 = 10;
        field120 = true;
        field158 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field215 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field261 = -6102;
        field386 = true;
        field387 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field478 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field503 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field503[var3] = var2 - 1;
            var2 += var2;
        }
    }
}
