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
public class client extends class1 {

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field58 = -1;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field59 = -1;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field67 = -1;

    @OriginalMember(owner = "client", name = "U", descriptor = "[LNUXITFPR;")
    private class31[] field68 = new class31[100];

    @OriginalMember(owner = "client", name = "X", descriptor = "Z")
    private volatile boolean field71 = false;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field77 = 1;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field78 = -1;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field79 = -754;

    @OriginalMember(owner = "client", name = "hb", descriptor = "[[I")
    private int[][] field81 = new int[104][104];

    @OriginalMember(owner = "client", name = "ib", descriptor = "Ljava/lang/String;")
    private String field82 = "";

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private boolean field86 = false;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field90 = -1;

    @OriginalMember(owner = "client", name = "rb", descriptor = "Z")
    private boolean field91 = true;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field93 = new int[33];

    @OriginalMember(owner = "client", name = "vb", descriptor = "Z")
    private boolean field95 = false;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field96 = 2301979;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private int[] field97 = new int[5];

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field98 = -1;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "B")
    private byte field106 = 6;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Ljava/lang/String;")
    private String field107 = "";

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Ljava/lang/String;")
    private String field108 = "";

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field109 = 481;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[LNUXITFPR;")
    private class31[] field110 = new class31[32];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field122 = 50;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[I")
    private int[] field123 = new int[this.field122];

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[I")
    private int[] field124 = new int[this.field122];

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[I")
    private int[] field125 = new int[this.field122];

    @OriginalMember(owner = "client", name = "ac", descriptor = "[I")
    private int[] field126 = new int[this.field122];

    @OriginalMember(owner = "client", name = "bc", descriptor = "[I")
    private int[] field127 = new int[this.field122];

    @OriginalMember(owner = "client", name = "cc", descriptor = "[I")
    private int[] field128 = new int[this.field122];

    @OriginalMember(owner = "client", name = "dc", descriptor = "[I")
    private int[] field129 = new int[this.field122];

    @OriginalMember(owner = "client", name = "ec", descriptor = "[Ljava/lang/String;")
    private String[] field130 = new String[this.field122];

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private boolean field131 = true;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Z")
    private boolean field135 = false;

    @OriginalMember(owner = "client", name = "kc", descriptor = "[I")
    private int[] field136 = new int[4000];

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field137 = new int[4000];

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field138 = -1;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[B")
    private byte[] field140 = new byte[16384];

    @OriginalMember(owner = "client", name = "rc", descriptor = "Z")
    private boolean field143 = false;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Z")
    private boolean field145 = true;

    @OriginalMember(owner = "client", name = "uc", descriptor = "[Ljava/lang/String;")
    private String[] field146 = new String[5];

    @OriginalMember(owner = "client", name = "vc", descriptor = "[Z")
    private boolean[] field147 = new boolean[5];

    @OriginalMember(owner = "client", name = "wc", descriptor = "Z")
    private boolean field148 = false;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field149 = -1;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[[I")
    private int[][] field155 = new int[104][104];

    @OriginalMember(owner = "client", name = "Fc", descriptor = "[LNUXITFPR;")
    private class31[] field157 = new class31[32];

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    private int[] field159 = new int[100];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[Ljava/lang/String;")
    private String[] field160 = new String[100];

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[Ljava/lang/String;")
    private String[] field161 = new String[100];

    @OriginalMember(owner = "client", name = "Kc", descriptor = "[[[LVYBZTNTY;")
    private class57[][][] field162 = new class57[4][104][104];

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field163 = 60;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[I")
    private int[] field164 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field166 = 2;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field169 = 8;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "B")
    private byte field174 = 3;

    @OriginalMember(owner = "client", name = "cd", descriptor = "[LNUXITFPR;")
    private class31[] field180 = new class31[8];

    @OriginalMember(owner = "client", name = "fd", descriptor = "Z")
    private boolean field183 = false;

    @OriginalMember(owner = "client", name = "kd", descriptor = "Z")
    private boolean field188 = true;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Z")
    private boolean field191 = false;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field192 = -1;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field194 = -36645;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field195 = 1;

    @OriginalMember(owner = "client", name = "sd", descriptor = "B")
    private byte field196 = 4;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field199 = 1;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private final int field203 = 100;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[I")
    private int[] field204 = new int[100];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "B")
    private byte field205 = 109;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Z")
    private boolean field208 = false;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "[Ljava/lang/String;")
    private String[] field209 = new String[200];

    @OriginalMember(owner = "client", name = "Gd", descriptor = "[I")
    private int[] field210 = new int[200];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field221 = 690;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    private int[] field222 = new int[5];

    @OriginalMember(owner = "client", name = "Td", descriptor = "Z")
    private boolean field223 = false;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    public boolean field224 = true;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[I")
    private int[] field225 = new int[5];

    @OriginalMember(owner = "client", name = "ee", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field234 = new CRC32();

    @OriginalMember(owner = "client", name = "ge", descriptor = "[Z")
    private boolean[] field236 = new boolean[5];

    @OriginalMember(owner = "client", name = "ie", descriptor = "Z")
    public boolean field238 = false;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field240 = true;

    @OriginalMember(owner = "client", name = "le", descriptor = "Z")
    private boolean field241 = true;

    @OriginalMember(owner = "client", name = "me", descriptor = "[J")
    private long[] field242 = new long[200];

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field244 = 7759444;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field246 = -7597;

    @OriginalMember(owner = "client", name = "ye", descriptor = "Z")
    private boolean field254 = true;

    @OriginalMember(owner = "client", name = "ze", descriptor = "LVYBZTNTY;")
    private class57 field255 = new class57((byte) 55);

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[LNUXITFPR;")
    private class31[] field256 = new class31[1000];

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[I")
    private int[] field258 = new int[5];

    @OriginalMember(owner = "client", name = "De", descriptor = "LGHHPHSRU;")
    private class14 field259 = class14.method190(987, 1);

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[LXBMRDXRN;")
    private class63[] field260 = new class63[4];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "Z")
    private boolean field261 = false;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[Ljava/lang/String;")
    private String[] field262 = new String[500];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Ljava/lang/String;")
    private String field266 = "";

    @OriginalMember(owner = "client", name = "Me", descriptor = "Z")
    private boolean field268 = true;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "[I")
    private int[] field269 = new int[class29.field1133];

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Z")
    private boolean field270 = false;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Z")
    private boolean field271 = false;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "Z")
    private boolean field272 = false;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Z")
    private boolean field281 = false;

    @OriginalMember(owner = "client", name = "af", descriptor = "B")
    private byte field282 = -10;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field289 = -1;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field295 = 2;

    @OriginalMember(owner = "client", name = "uf", descriptor = "Z")
    private boolean field301 = false;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Z")
    private boolean field313 = false;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Z")
    private boolean field314 = true;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "[I")
    private int[] field317 = new int[1000];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    private int[] field318 = new int[1000];

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[LKZTQXFDC;")
    private class23[] field319 = new class23[2];

    @OriginalMember(owner = "client", name = "Of", descriptor = "[I")
    private int[] field321 = new int[class29.field1133];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Ljava/lang/String;")
    private String field330 = "";

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Ljava/lang/String;")
    private String field331 = "";

    @OriginalMember(owner = "client", name = "ag", descriptor = "B")
    private byte field333 = 94;

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    public int[] field335 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client", name = "dg", descriptor = "[I")
    private int[] field336 = new int[5];

    @OriginalMember(owner = "client", name = "eg", descriptor = "B")
    private byte field337 = 67;

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    private int[] field338 = new int[50];

    @OriginalMember(owner = "client", name = "hg", descriptor = "LEKHKDMUP;")
    private class11 field340 = new class11();

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field341 = -1;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field342 = -1;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Z")
    private boolean field343 = false;

    @OriginalMember(owner = "client", name = "og", descriptor = "[LNUXITFPR;")
    private class31[] field347 = new class31[20];

    @OriginalMember(owner = "client", name = "pg", descriptor = "[I")
    private int[] field348 = new int[151];

    @OriginalMember(owner = "client", name = "sg", descriptor = "[I")
    private int[] field351 = new int[class29.field1133];

    @OriginalMember(owner = "client", name = "tg", descriptor = "Z")
    private boolean field352 = true;

    @OriginalMember(owner = "client", name = "vg", descriptor = "B")
    private byte field354 = 4;

    @OriginalMember(owner = "client", name = "yg", descriptor = "[[[I")
    private int[][][] field357 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "zg", descriptor = "[I")
    private int[] field358 = new int[500];

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[I")
    private int[] field359 = new int[500];

    @OriginalMember(owner = "client", name = "Bg", descriptor = "[I")
    private int[] field360 = new int[500];

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[I")
    private int[] field361 = new int[500];

    @OriginalMember(owner = "client", name = "Eg", descriptor = "Z")
    private boolean field363 = true;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Z")
    private boolean field364 = false;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Ljava/lang/String;")
    private String field372 = "";

    @OriginalMember(owner = "client", name = "Og", descriptor = "LVYBZTNTY;")
    private class57 field373 = new class57((byte) 55);

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Z")
    private volatile boolean field375 = false;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Ljava/lang/String;")
    private String field384 = "";

    @OriginalMember(owner = "client", name = "ah", descriptor = "[I")
    private int[] field385 = new int[50];

    @OriginalMember(owner = "client", name = "bh", descriptor = "[I")
    private int[] field386 = new int[7];

    @OriginalMember(owner = "client", name = "ch", descriptor = "LGHHPHSRU;")
    private class14 field387 = class14.method190(987, 1);

    @OriginalMember(owner = "client", name = "dh", descriptor = "Z")
    private volatile boolean field388 = false;

    @OriginalMember(owner = "client", name = "fh", descriptor = "[I")
    private int[] field390 = new int[151];

    @OriginalMember(owner = "client", name = "gh", descriptor = "LVYBZTNTY;")
    private class57 field391 = new class57((byte) 55);

    @OriginalMember(owner = "client", name = "kh", descriptor = "Z")
    private boolean field395 = false;

    @OriginalMember(owner = "client", name = "lh", descriptor = "Ljava/lang/String;")
    private String field396 = "";

    @OriginalMember(owner = "client", name = "oh", descriptor = "Z")
    private boolean field399 = false;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Z")
    private boolean field401 = true;

    @OriginalMember(owner = "client", name = "rh", descriptor = "[I")
    private final int[] field402 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field403 = -1;

    @OriginalMember(owner = "client", name = "th", descriptor = "LGHHPHSRU;")
    private class14 field404 = new class14(-527, new byte[5000]);

    @OriginalMember(owner = "client", name = "uh", descriptor = "[LLJAXEEYT;")
    private class24[] field405 = new class24[16384];

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    public int[] field407 = new int[16384];

    @OriginalMember(owner = "client", name = "yh", descriptor = "Z")
    private boolean field409 = true;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Z")
    private boolean field411 = true;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field413 = false;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field417 = 3353893;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field420 = 5063219;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field428 = -1;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Z")
    private boolean field431 = false;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field433 = 1;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Z")
    private boolean field435 = false;

    @OriginalMember(owner = "client", name = "ei", descriptor = "[I")
    private int[] field441 = new int[50];

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field442 = 5;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field444 = 78;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Z")
    private boolean field446 = true;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field448 = 2048;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field449 = 2047;

    @OriginalMember(owner = "client", name = "ni", descriptor = "[LEJJAKGTE;")
    private class10[] field450 = new class10[this.field448];

    @OriginalMember(owner = "client", name = "pi", descriptor = "[I")
    public int[] field452 = new int[this.field448];

    @OriginalMember(owner = "client", name = "ri", descriptor = "[I")
    private int[] field454 = new int[this.field448];

    @OriginalMember(owner = "client", name = "si", descriptor = "[LGHHPHSRU;")
    private class14[] field455 = new class14[this.field448];

    @OriginalMember(owner = "client", name = "ti", descriptor = "B")
    private byte field456 = 37;

    @OriginalMember(owner = "client", name = "wi", descriptor = "[LKZTQXFDC;")
    private class23[] field459 = new class23[13];

    @OriginalMember(owner = "client", name = "xi", descriptor = "Z")
    private boolean field460 = true;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Z")
    private boolean field471 = false;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field473 = -1;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    public int[] field477 = new int[1000];

    @OriginalMember(owner = "client", name = "Si", descriptor = "[LXEGQQHIM;")
    public class64[] field481 = new class64[5];

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[J")
    private long[] field482 = new long[100];

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field483 = 128;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field487 = -73;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field489 = -401;

    @OriginalMember(owner = "client", name = "jj", descriptor = "[[I")
    private int[][] field498 = new int[104][104];

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field499 = -1;

    @OriginalMember(owner = "client", name = "lj", descriptor = "Z")
    private boolean field500 = false;

    @OriginalMember(owner = "client", name = "sj", descriptor = "LGHHPHSRU;")
    private class14 field507 = class14.method190(987, 1);

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field514 = -184;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field515 = 3;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "Z")
    private boolean field517 = false;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field520 = 2;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[LKZTQXFDC;")
    private class23[] field523 = new class23[100];

    @OriginalMember(owner = "client", name = "Jj", descriptor = "[I")
    private int[] field524 = new int[2000];

    @OriginalMember(owner = "client", name = "Rj", descriptor = "[LNUXITFPR;")
    private class31[] field532 = new class31[32];

    @OriginalMember(owner = "client", name = "Vj", descriptor = "I")
    private int field536 = -300;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "[I")
    private int[] field538 = new int[9];

    @OriginalMember(owner = "client", name = "Yj", descriptor = "[I")
    public int[] field539 = new int[2000];

    @OriginalMember(owner = "client", name = "Zj", descriptor = "[I")
    private int[] field540 = new int[256];

    @OriginalMember(owner = "client", name = "ak", descriptor = "[I")
    private int[] field541 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "lk", descriptor = "[I")
    private int[] field552 = new int[33];

    @OriginalMember(owner = "client", name = "W", descriptor = "Ljava/lang/String;")
    private static String field70 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field158 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "ed", descriptor = "[I")
    public static int[] field182 = new int[32];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field206;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private static int field257;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private static int field273;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Z")
    private static boolean field275;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private static int field344;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[I")
    public static final int[] field427;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private static int field474;

    @OriginalMember(owner = "client", name = "mj", descriptor = "[[I")
    public static final int[][] field501;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "[I")
    private static int[] field518;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private static int field527;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private static int field531;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field114;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private static int field152;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private static int field154;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private static int field177;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private static int field197;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private static int field207;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private static int field216;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private static int field220;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private static int field311;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private static int field322;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private static int field382;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private static int field416;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private static int field429;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private static int field440;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private static int field447;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private static int field458;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private static int field472;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private static int field521;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private static int field526;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client", name = "mk", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field61;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private static int field94;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client", name = "ff", descriptor = "J")
    private long field287;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "J")
    private long field415;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "J")
    private long field418;

    @OriginalMember(owner = "client", name = "ui", descriptor = "J")
    private long field457;

    @OriginalMember(owner = "client", name = "bk", descriptor = "J")
    public long field542;

    @OriginalMember(owner = "client", name = "Z", descriptor = "LEJJAKGTE;")
    public static class10 field73;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "LKZTQXFDC;")
    private class23 field167;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "LKZTQXFDC;")
    private class23 field168;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "LKZTQXFDC;")
    private class23 field228;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "LKZTQXFDC;")
    private class23 field229;

    @OriginalMember(owner = "client", name = "ae", descriptor = "LKZTQXFDC;")
    private class23 field230;

    @OriginalMember(owner = "client", name = "be", descriptor = "LKZTQXFDC;")
    private class23 field231;

    @OriginalMember(owner = "client", name = "ce", descriptor = "LKZTQXFDC;")
    private class23 field232;

    @OriginalMember(owner = "client", name = "qg", descriptor = "LKZTQXFDC;")
    private class23 field349;

    @OriginalMember(owner = "client", name = "rg", descriptor = "LKZTQXFDC;")
    private class23 field350;

    @OriginalMember(owner = "client", name = "bj", descriptor = "LKZTQXFDC;")
    private class23 field490;

    @OriginalMember(owner = "client", name = "cj", descriptor = "LKZTQXFDC;")
    private class23 field491;

    @OriginalMember(owner = "client", name = "dj", descriptor = "LKZTQXFDC;")
    private class23 field492;

    @OriginalMember(owner = "client", name = "ej", descriptor = "LKZTQXFDC;")
    private class23 field493;

    @OriginalMember(owner = "client", name = "fj", descriptor = "LKZTQXFDC;")
    private class23 field494;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "LKZTQXFDC;")
    private class23 field533;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "LKZTQXFDC;")
    private class23 field534;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "LKZTQXFDC;")
    private class23 field535;

    @OriginalMember(owner = "client", name = "nb", descriptor = "LKZTQXFDC;")
    private class23 field87;

    @OriginalMember(owner = "client", name = "ob", descriptor = "LKZTQXFDC;")
    private class23 field88;

    @OriginalMember(owner = "client", name = "pb", descriptor = "LKZTQXFDC;")
    private class23 field89;

    @OriginalMember(owner = "client", name = "je", descriptor = "LLXDDKEZF;")
    private class27 field239;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "LNUXITFPR;")
    private class31 field111;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "LNUXITFPR;")
    private class31 field112;

    @OriginalMember(owner = "client", name = "pc", descriptor = "LNUXITFPR;")
    private class31 field141;

    @OriginalMember(owner = "client", name = "re", descriptor = "LNUXITFPR;")
    private class31 field247;

    @OriginalMember(owner = "client", name = "se", descriptor = "LNUXITFPR;")
    private class31 field248;

    @OriginalMember(owner = "client", name = "wg", descriptor = "LNUXITFPR;")
    private class31 field355;

    @OriginalMember(owner = "client", name = "mh", descriptor = "LNUXITFPR;")
    private class31 field397;

    @OriginalMember(owner = "client", name = "nh", descriptor = "LNUXITFPR;")
    private class31 field398;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "LNUXITFPR;")
    private class31 field480;

    @OriginalMember(owner = "client", name = "tj", descriptor = "LNUXITFPR;")
    private class31 field508;

    @OriginalMember(owner = "client", name = "uj", descriptor = "LNUXITFPR;")
    private class31 field509;

    @OriginalMember(owner = "client", name = "vj", descriptor = "LNUXITFPR;")
    private class31 field510;

    @OriginalMember(owner = "client", name = "wj", descriptor = "LNUXITFPR;")
    private class31 field511;

    @OriginalMember(owner = "client", name = "xj", descriptor = "LNUXITFPR;")
    private class31 field512;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "LNUXITFPR;")
    private class31 field537;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "LTHSQSAVT;")
    private class47 field467;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "LTHSQSAVT;")
    private class47 field468;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "LTHSQSAVT;")
    private class47 field469;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "LTHSQSAVT;")
    private class47 field470;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "LTZRNBMTC;")
    private class50 field170;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "LTZRNBMTC;")
    private class50 field171;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "LTZRNBMTC;")
    private class50 field172;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "LTZRNBMTC;")
    private class50 field173;

    @OriginalMember(owner = "client", name = "vf", descriptor = "LTZRNBMTC;")
    private class50 field302;

    @OriginalMember(owner = "client", name = "wf", descriptor = "LTZRNBMTC;")
    private class50 field303;

    @OriginalMember(owner = "client", name = "xf", descriptor = "LTZRNBMTC;")
    private class50 field304;

    @OriginalMember(owner = "client", name = "yf", descriptor = "LTZRNBMTC;")
    private class50 field305;

    @OriginalMember(owner = "client", name = "zf", descriptor = "LTZRNBMTC;")
    private class50 field306;

    @OriginalMember(owner = "client", name = "Af", descriptor = "LTZRNBMTC;")
    private class50 field307;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "LTZRNBMTC;")
    private class50 field308;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "LTZRNBMTC;")
    private class50 field309;

    @OriginalMember(owner = "client", name = "Df", descriptor = "LTZRNBMTC;")
    private class50 field310;

    @OriginalMember(owner = "client", name = "ck", descriptor = "LTZRNBMTC;")
    private class50 field543;

    @OriginalMember(owner = "client", name = "dk", descriptor = "LTZRNBMTC;")
    private class50 field544;

    @OriginalMember(owner = "client", name = "ek", descriptor = "LTZRNBMTC;")
    private class50 field545;

    @OriginalMember(owner = "client", name = "fk", descriptor = "LTZRNBMTC;")
    private class50 field546;

    @OriginalMember(owner = "client", name = "gk", descriptor = "LTZRNBMTC;")
    private class50 field547;

    @OriginalMember(owner = "client", name = "hk", descriptor = "LTZRNBMTC;")
    private class50 field548;

    @OriginalMember(owner = "client", name = "ik", descriptor = "LTZRNBMTC;")
    private class50 field549;

    @OriginalMember(owner = "client", name = "jk", descriptor = "LTZRNBMTC;")
    private class50 field550;

    @OriginalMember(owner = "client", name = "kk", descriptor = "LTZRNBMTC;")
    private class50 field551;

    @OriginalMember(owner = "client", name = "ab", descriptor = "LTZRNBMTC;")
    private class50 field74;

    @OriginalMember(owner = "client", name = "bb", descriptor = "LTZRNBMTC;")
    private class50 field75;

    @OriginalMember(owner = "client", name = "cb", descriptor = "LTZRNBMTC;")
    private class50 field76;

    @OriginalMember(owner = "client", name = "sb", descriptor = "LWBHAMUQI;")
    private class60 field92;

    @OriginalMember(owner = "client", name = "jb", descriptor = "LXZFDFADG;")
    private class67 field83;

    @OriginalMember(owner = "client", name = "gc", descriptor = "LYQNDWKQR;")
    private class69 field132;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "LZEOHBQWT;")
    public class70 field332;

    @OriginalMember(owner = "client", name = "Di", descriptor = "LDTIATKJO;")
    private class8 field466;

    @OriginalMember(owner = "client", name = "hc", descriptor = "Ljava/lang/String;")
    private String field133;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "Ljava/lang/String;")
    public String field379;

    @OriginalMember(owner = "client", name = "rj", descriptor = "Ljava/lang/String;")
    public String field506;

    @OriginalMember(owner = "client", name = "V", descriptor = "Ljava/lang/String;")
    private String field69;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Ljava/net/Socket;")
    private Socket field175;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Z")
    private static boolean field276;

    @OriginalMember(owner = "client", name = "zh", descriptor = "Z")
    private static boolean field410;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Z")
    public static boolean field475;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Z")
    public static boolean field496;

    @OriginalMember(owner = "client", name = "lb", descriptor = "Z")
    private static boolean field85;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field217;

    @OriginalMember(owner = "client", name = "Od", descriptor = "[I")
    private int[] field218;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[I")
    private int[] field277;

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private int[] field278;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[I")
    private int[] field279;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "[I")
    private int[] field280;

    @OriginalMember(owner = "client", name = "kf", descriptor = "[I")
    private int[] field291;

    @OriginalMember(owner = "client", name = "lf", descriptor = "[I")
    private int[] field292;

    @OriginalMember(owner = "client", name = "mf", descriptor = "[I")
    private int[] field293;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[I")
    private int[] field380;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field381;

    @OriginalMember(owner = "client", name = "P", descriptor = "[I")
    private int[] field63;

    @OriginalMember(owner = "client", name = "Q", descriptor = "[I")
    private int[] field64;

    @OriginalMember(owner = "client", name = "R", descriptor = "[I")
    private int[] field65;

    @OriginalMember(owner = "client", name = "S", descriptor = "[I")
    private int[] field66;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[LKZTQXFDC;")
    private class23[] field522;

    @OriginalMember(owner = "client", name = "Le", descriptor = "[[B")
    private byte[][] field267;

    @OriginalMember(owner = "client", name = "M", descriptor = "[[B")
    private byte[][] field60;

    @OriginalMember(owner = "client", name = "ci", descriptor = "[[[B")
    private byte[][][] field439;

    @OriginalMember(owner = "client", name = "Y", descriptor = "[[[I")
    private int[][][] field72;

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field17 != null) {
                    return new URL("http://127.0.0.1:" + (field274 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method20(byte arg0) {
        if (arg0 != 51) {
            this.method6();
        }
        if (this.field302 == null) {
            super.field15 = null;
            this.field173 = null;
            this.field171 = null;
            this.field170 = null;
            this.field172 = null;
            this.field74 = null;
            this.field75 = null;
            this.field76 = null;
            this.field305 = new class50(128, this.method11((byte) 9), 265, 9);
            class20.method286(0);
            this.field306 = new class50(128, this.method11((byte) 9), 265, 9);
            class20.method286(0);
            this.field302 = new class50(509, this.method11((byte) 9), 171, 9);
            class20.method286(0);
            this.field303 = new class50(360, this.method11((byte) 9), 132, 9);
            class20.method286(0);
            this.field304 = new class50(360, this.method11((byte) 9), 200, 9);
            class20.method286(0);
            this.field307 = new class50(202, this.method11((byte) 9), 238, 9);
            class20.method286(0);
            this.field308 = new class50(203, this.method11((byte) 9), 238, 9);
            class20.method286(0);
            this.field309 = new class50(74, this.method11((byte) 9), 94, 9);
            class20.method286(0);
            this.field310 = new class50(75, this.method11((byte) 9), 94, 9);
            class20.method286(0);
            if (this.field466 != null) {
                this.method82(502);
                this.method25(field257);
            }
            this.field313 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method21(int arg0) {
        if (arg0 >= 0) {
            this.field250 = this.field259.method202();
        }
        if (field276 && this.field142 == 2 && class36.field1300 != this.field105) {
            this.method77("Loading - please wait.", -284, (String) null);
            this.field142 = 1;
            this.field415 = System.currentTimeMillis();
        }
        if (this.field142 == 1) {
            int var2 = this.method22(true);
            if (var2 != 0 && System.currentTimeMillis() - this.field415 > 360000L) {
                signlink.reporterror(this.field107 + " glcfb " + this.field287 + "," + var2 + "," + field276 + "," + this.field481[0] + "," + this.field83.method568() + "," + this.field105 + "," + this.field178 + "," + this.field179);
                this.field415 = System.currentTimeMillis();
            }
        }
        if (this.field142 == 2 && this.field403 != this.field105) {
            this.field403 = this.field105;
            this.method72(this.field105, true);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)I")
    public final int method22(boolean arg0) {
        for (int var2 = 0; var2 < this.field267.length; ++var2) {
            if (this.field267[var2] == null && this.field292[var2] != -1) {
                return -1;
            }
            if (this.field60[var2] == null && this.field293[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        this.field238 &= arg0;
        for (int var4 = 0; var4 < this.field267.length; ++var4) {
            byte[] var5 = this.field60[var4];
            if (var5 != null) {
                int var6 = (this.field291[var4] >> 8) * 64 - this.field115;
                int var7 = (this.field291[var4] & 255) * 64 - this.field116;
                if (this.field191) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class36.method435(var7, var5, true, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field223) {
            return -4;
        } else {
            this.field142 = 2;
            class36.field1300 = this.field105;
            this.method73(4);
            this.field387.method191(this.field240, 211);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEKHKDMUP;ZI)I")
    public final int method23(class11 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field250 = -1;
        }
        if (arg0.field689 != null && arg2 < arg0.field689.length) {
            try {
                int[] var4 = arg0.field689[arg2];
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
                        var9 = this.field351[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field269[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field321[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class11 var11 = class11.method174(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class72.field1719 && (!class72.method590(var12).field1757 || field275)) {
                            for (int var13 = 0; var13 < var11.field652.length; ++var13) {
                                if (var12 + 1 == var11.field652[var13]) {
                                    var9 += var11.field715[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field539[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field518[this.field269[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field539[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field73.field643;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class29.field1133; ++var14) {
                            if (class29.field1135[var14]) {
                                var9 += this.field269[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class11 var15 = class11.method174(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class72.field1719 && (!class72.method590(var16).field1757 || field275)) {
                            for (int var17 = 0; var17 < var15.field652.length; ++var17) {
                                if (var15.field652[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field315;
                    }
                    if (var8 == 12) {
                        var9 = this.field412;
                    }
                    if (var8 == 13) {
                        int var18 = this.field539[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class34 var21 = class34.field1182[var20];
                        int var22 = var21.field1184;
                        int var23 = var21.field1185;
                        int var24 = var21.field1186;
                        int var25 = field182[var24 - var23];
                        var9 = this.field539[var22] >> var23 & var25;
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
                        var9 = (field73.field844 >> 7) + this.field115;
                    }
                    if (var8 == 19) {
                        var9 = (field73.field845 >> 7) + this.field116;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILEKHKDMUP;)Z")
    public final boolean method24(int arg0, class11 arg1) {
        if (arg0 != 3) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1.field708 == null) {
            return false;
        } else {
            for (int var4 = 0; var4 < arg1.field708.length; ++var4) {
                int var5 = this.method23(arg1, false, var4);
                int var6 = arg1.field669[var4];
                if (arg1.field708[var4] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg1.field708[var4] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg1.field708[var4] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public final void method13(int arg0, boolean arg1, String arg2) {
        this.field290 = arg0;
        this.field133 = arg2;
        this.method20((byte) 51);
        if (this.field466 == null) {
            super.method13(arg0, field85, arg2);
        } else {
            this.field304.method492((byte) -56);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            if (!arg1) {
                this.field469.method473(var5 / 2 - 26 - var6, var4 / 2, 16777215, "RuneScape is loading - please wait...", 6600);
                int var7 = var5 / 2 - 18 - var6;
                class20.method289(var4 / 2 - 152, 304, var7, 9179409, 0, 34);
                class20.method289(var4 / 2 - 151, 302, var7 + 1, 0, 0, 32);
                class20.method288(var4 / 2 - 150, 0, var7 + 2, arg0 * 3, 9179409, 30);
                class20.method288(arg0 * 3 + (var4 / 2 - 150), 0, var7 + 2, 300 - arg0 * 3, 0, 30);
                this.field469.method473(var5 / 2 + 5 - var6, var4 / 2, 16777215, arg2, 6600);
                this.field304.method493(584, 171, 202, super.field14);
                if (this.field313) {
                    this.field313 = false;
                    if (!this.field71) {
                        this.field305.method493(584, 0, 0, super.field14);
                        this.field306.method493(584, 0, 637, super.field14);
                    }
                    this.field302.method493(584, 0, 128, super.field14);
                    this.field303.method493(584, 371, 202, super.field14);
                    this.field307.method493(584, 265, 0, super.field14);
                    this.field308.method493(584, 265, 562, super.field14);
                    this.field309.method493(584, 171, 128, super.field14);
                    this.field310.method493(584, 171, 562, super.field14);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method25(int arg0) {
        if (arg0 < 0) {
            this.field167 = new class23(this.field466, "titlebox", 0);
            this.field168 = new class23(this.field466, "titlebutton", 0);
            this.field522 = new class23[12];
            for (int var2 = 0; var2 < 12; ++var2) {
                this.field522[var2] = new class23(this.field466, "runes", var2);
            }
            this.field247 = new class31(128, 265);
            this.field248 = new class31(128, 265);
            for (int var3 = 0; var3 < 33920; ++var3) {
                this.field247.field1155[var3] = this.field305.field1486[var3];
            }
            for (int var4 = 0; var4 < 33920; ++var4) {
                this.field248.field1155[var4] = this.field306.field1486[var4];
            }
            this.field64 = new int[256];
            for (int var5 = 0; var5 < 64; ++var5) {
                this.field64[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; ++var6) {
                this.field64[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field64[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field64[var8 + 192] = 16777215;
            }
            this.field65 = new int[256];
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field65[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field65[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field65[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field65[var12 + 192] = 16777215;
            }
            this.field66 = new int[256];
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field66[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field66[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field66[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field66[var16 + 192] = 16777215;
            }
            this.field63 = new int[256];
            this.field217 = new int[32768];
            this.field218 = new int[32768];
            this.method103((class23) null, 1);
            this.field380 = new int[32768];
            this.field381 = new int[32768];
            this.method13(10, field85, "Connecting to fileserver");
            if (!this.field71) {
                this.field388 = true;
                this.field71 = true;
                this.method12(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field273 = Integer.parseInt(this.getParameter("nodeid"));
        field274 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method71(694);
        } else {
            method146(false);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field275 = false;
        } else {
            field275 = true;
        }
        this.method2(503, 765, 984);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method26(byte arg0) {
        if (this.field213 == 0) {
            int var2 = super.field28;
            if (arg0 != 5) {
                field257 = 400;
            }
            if (this.field376 == 1 && super.field29 >= 516 && super.field30 >= 160 && super.field29 <= 765 && super.field30 <= 205) {
                var2 = 0;
            }
            if (this.field301) {
                if (var2 != 1) {
                    int var3 = super.field22;
                    int var4 = super.field23;
                    if (this.field422 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field422 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field422 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field423 - 10 || var3 > this.field425 + this.field423 + 10 || var4 < this.field424 - 10 || var4 > this.field426 + this.field424 + 10) {
                        this.field301 = false;
                        if (this.field422 == 1) {
                            this.field431 = true;
                        }
                        if (this.field422 == 2) {
                            this.field343 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field423;
                    int var6 = this.field424;
                    int var7 = this.field425;
                    int var8 = super.field29;
                    int var9 = super.field30;
                    if (this.field422 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field422 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field422 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field436; ++var11) {
                        int var12 = (this.field436 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method140(var10, (byte) -121);
                    }
                    this.field301 = false;
                    if (this.field422 == 1) {
                        this.field431 = true;
                    }
                    if (this.field422 == 2) {
                        this.field343 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field436 > 0) {
                    int var13 = this.field360[this.field436 - 1];
                    if (var13 == 592 || var13 == 637 || var13 == 148 || var13 == 708 || var13 == 306 || var13 == 17 || var13 == 994 || var13 == 840 || var13 == 68 || var13 == 910 || var13 == 874 || var13 == 1893) {
                        int var14 = this.field358[this.field436 - 1];
                        int var15 = this.field359[this.field436 - 1];
                        class11 var16 = class11.method174(var15);
                        if (var16.field697 || var16.field722) {
                            this.field368 = false;
                            this.field513 = 0;
                            this.field211 = var15;
                            this.field212 = var14;
                            this.field213 = 2;
                            this.field214 = super.field29;
                            this.field215 = super.field30;
                            if (class11.method174(var15).field675 == this.field78) {
                                this.field213 = 1;
                            }
                            if (class11.method174(var15).field675 == this.field67) {
                                this.field213 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field265 == 1 || this.method66((byte) 2, this.field436 - 1)) && this.field436 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field436 > 0) {
                    this.method140(this.field436 - 1, (byte) -121);
                }
                if (var2 != 2 || this.field436 <= 0) {
                    return;
                }
                this.method120(9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LGHHPHSRU;II)V")
    private final void method27(class14 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field162 = null;
        }
        arg0.method212(false);
        int var4 = arg0.method213(1, this.field489);
        if (var4 != 0) {
            int var5 = arg0.method213(2, this.field489);
            if (var5 == 0) {
                this.field454[this.field453++] = this.field449;
            } else if (var5 == 1) {
                int var6 = arg0.method213(3, this.field489);
                field73.method241(false, var6, false);
                int var7 = arg0.method213(1, this.field489);
                if (var7 == 1) {
                    this.field454[this.field453++] = this.field449;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method213(3, this.field489);
                field73.method241(true, var8, false);
                int var9 = arg0.method213(3, this.field489);
                field73.method241(true, var9, false);
                int var10 = arg0.method213(1, this.field489);
                if (var10 == 1) {
                    this.field454[this.field453++] = this.field449;
                }
            } else if (var5 == 3) {
                int var11 = arg0.method213(1, this.field489);
                if (var11 == 1) {
                    this.field454[this.field453++] = this.field449;
                }
                int var12 = arg0.method213(7, this.field489);
                int var13 = arg0.method213(7, this.field489);
                this.field105 = arg0.method213(2, this.field489);
                int var14 = arg0.method213(1, this.field489);
                field73.method242(var13, var12, (byte) -56, var14 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method28(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field208 = !this.field208;
        }
        if (arg0 < 999999999) {
            return String.valueOf(arg0);
        } else {
            return "*";
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method29(int arg0) {
        if (arg0 != 0) {
            this.field442 = this.field92.method533();
        }
        int var2 = this.field461 * 128 + 64;
        int var3 = this.field462 * 128 + 64;
        int var4 = this.method34(var3, 215, this.field105, var2) - this.field463;
        if (this.field324 < var2) {
            this.field324 += (var2 - this.field324) * this.field465 / 1000 + this.field464;
            if (this.field324 > var2) {
                this.field324 = var2;
            }
        }
        if (this.field324 > var2) {
            this.field324 -= (this.field324 - var2) * this.field465 / 1000 + this.field464;
            if (this.field324 < var2) {
                this.field324 = var2;
            }
        }
        if (this.field325 < var4) {
            this.field325 += (var4 - this.field325) * this.field465 / 1000 + this.field464;
            if (this.field325 > var4) {
                this.field325 = var4;
            }
        }
        if (this.field325 > var4) {
            this.field325 -= (this.field325 - var4) * this.field465 / 1000 + this.field464;
            if (this.field325 < var4) {
                this.field325 = var4;
            }
        }
        if (this.field326 < var3) {
            this.field326 += (var3 - this.field326) * this.field465 / 1000 + this.field464;
            if (this.field326 > var3) {
                this.field326 = var3;
            }
        }
        if (this.field326 > var3) {
            this.field326 -= (this.field326 - var3) * this.field465 / 1000 + this.field464;
            if (this.field326 < var3) {
                this.field326 = var3;
            }
        }
        ++field311;
        if (field311 > 1352) {
            field311 = 0;
            this.field387.method191(this.field240, 91);
            this.field387.method192(0);
            int var5 = this.field387.field769;
            this.field387.method193(49556);
            this.field387.method192((int) (Math.random() * 256.0D));
            this.field387.method192((int) (Math.random() * 256.0D));
            this.field387.method192(217);
            this.field387.method192((int) (Math.random() * 256.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field387.method192(78);
            }
            this.field387.method193(22816);
            this.field387.method193((int) (Math.random() * 65536.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field387.method192(35);
            }
            this.field387.method192((int) (Math.random() * 256.0D));
            this.field387.method201(this.field387.field769 - var5, -48308);
        }
        int var6 = this.field296 * 128 + 64;
        int var7 = this.field297 * 128 + 64;
        int var8 = this.method34(var7, 215, this.field105, var6) - this.field298;
        int var9 = var6 - this.field324;
        int var10 = var8 - this.field325;
        int var11 = var7 - this.field326;
        int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
        int var13 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 2047;
        int var14 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 2047;
        if (var13 < 128) {
            var13 = 128;
        }
        if (var13 > 383) {
            var13 = 383;
        }
        if (this.field327 < var13) {
            this.field327 += (var13 - this.field327) * this.field300 / 1000 + this.field299;
            if (this.field327 > var13) {
                this.field327 = var13;
            }
        }
        if (this.field327 > var13) {
            this.field327 -= (this.field327 - var13) * this.field300 / 1000 + this.field299;
            if (this.field327 < var13) {
                this.field327 = var13;
            }
        }
        int var15 = var14 - this.field328;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 > 0) {
            this.field328 += this.field300 * var15 / 1000 + this.field299;
            this.field328 &= 2047;
        }
        if (var15 < 0) {
            this.field328 -= -var15 * this.field300 / 1000 + this.field299;
            this.field328 &= 2047;
        }
        int var16 = var14 - this.field328;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            this.field328 = var14;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method30(int arg0) {
        class28.field1102.method509();
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        class28.field1090.method509();
        class6.field570.method509();
        class72.field1744.method509();
        class72.field1760.method509();
        class10.field634.method509();
        class3.field53.method509();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V")
    public final void method31(String arg0, boolean arg1, String arg2, int arg3) {
        this.field238 &= arg1;
        if (arg3 == 0 && this.field138 != -1) {
            this.field69 = arg2;
            super.field28 = 0;
        }
        if (this.field67 == -1) {
            this.field343 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field159[var5] = this.field159[var5 - 1];
            this.field160[var5] = this.field160[var5 - 1];
            this.field161[var5] = this.field161[var5 - 1];
        }
        this.field159[0] = arg3;
        this.field160[0] = arg0;
        this.field161[0] = arg2;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method32(int arg0) {
        if (arg0 != -22637) {
            field85 = !field85;
        }
        for (int var2 = -1; var2 < this.field451; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field449;
            } else {
                var6 = this.field452[var2];
            }
            class10 var7 = this.field450[var6];
            if (var7 != null && var7.field831 > 0) {
                --var7.field831;
                if (var7.field831 == 0) {
                    var7.field837 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field406; ++var3) {
            int var4 = this.field407[var3];
            class24 var5 = this.field405[var4];
            if (var5 != null && var5.field831 > 0) {
                --var5.field831;
                if (var5.field831 == 0) {
                    var5.field837 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILGHHPHSRU;B)V")
    private final void method33(int arg0, class14 arg1, byte arg2) {
        if (arg2 != 6) {
            this.field131 = !this.field131;
        }
        for (int var4 = 0; var4 < this.field453; ++var4) {
            int var5 = this.field454[var4];
            class24 var6 = this.field405[var5];
            int var7 = arg1.method202();
            if ((var7 & 32) != 0) {
                int var8 = arg1.method202();
                int var9 = arg1.method202();
                var6.method243(var9, true, var8, field419);
                var6.field877 = field419 + 300;
                var6.field878 = arg1.method223((byte) -82);
                var6.field879 = arg1.method221((byte) 49);
            }
            if ((var7 & 1) != 0) {
                int var10 = arg1.method204();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg1.method222(-6);
                if (var6.field839 == var10 && var10 != -1) {
                    int var12 = class58.field1560[var10].field1574;
                    if (var12 == 1) {
                        var6.field840 = 0;
                        var6.field841 = 0;
                        var6.field842 = var11;
                        var6.field843 = 0;
                    }
                    if (var12 == 2) {
                        var6.field843 = 0;
                    }
                } else if (var10 == -1 || var6.field839 == -1 || class58.field1560[var10].field1568 >= class58.field1560[var6.field839].field1568) {
                    var6.field839 = var10;
                    var6.field840 = 0;
                    var6.field841 = 0;
                    var6.field842 = var11;
                    var6.field843 = 0;
                    var6.field866 = var6.field865;
                }
            }
            if ((var7 & 8) != 0) {
                var6.field987 = class6.method162(arg1.method230(0));
                var6.field856 = var6.field987.field566;
                var6.field867 = var6.field987.field568;
                var6.field881 = var6.field987.field576;
                var6.field882 = var6.field987.field590;
                var6.field883 = var6.field987.field581;
                var6.field884 = var6.field987.field578;
                var6.field868 = var6.field987.field596;
            }
            if ((var7 & 4) != 0) {
                var6.field837 = arg1.method209();
                var6.field831 = 100;
            }
            if ((var7 & 128) != 0) {
                int var13 = arg1.method222(-6);
                int var14 = arg1.method221((byte) 49);
                var6.method243(var14, true, var13, field419);
                var6.field877 = field419 + 300;
                var6.field878 = arg1.method221((byte) 49);
                var6.field879 = arg1.method222(-6);
            }
            if ((var7 & 2) != 0) {
                var6.field875 = arg1.method231(440);
                var6.field876 = arg1.method231(440);
            }
            if ((var7 & 64) != 0) {
                var6.field859 = arg1.method231(440);
                int var15 = arg1.method236(this.field196);
                var6.field863 = var15 >> 16;
                var6.field862 = (var15 & 65535) + field419;
                var6.field860 = 0;
                var6.field861 = 0;
                if (var6.field862 > field419) {
                    var6.field860 = -1;
                }
                if (var6.field859 == 65535) {
                    var6.field859 = -1;
                }
            }
            if ((var7 & 16) != 0) {
                var6.field874 = arg1.method204();
                if (var6.field874 == 65535) {
                    var6.field874 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method34(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg1 <= 0) {
                this.field246 = this.field92.method533();
            }
            if (arg2 < 3 && (this.field439[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field72[var7][var5][var6] + this.field72[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field72[var7][var5][var6 + 1] + this.field72[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method35(int arg0) {
        if (arg0 != 2259) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field237 == 0) {
            if (super.field28 == 1) {
                int var3 = super.field29 - 25 - 550;
                int var4 = super.field30 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field484 + this.field165 & 2047;
                    int var6 = class39.field1339[var5];
                    int var7 = class39.field1340[var5];
                    int var8 = (this.field198 + 256) * var6 >> 8;
                    int var9 = (this.field198 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field73.field844 + var10 >> 7;
                    int var13 = field73.field845 - var11 >> 7;
                    boolean var14 = this.method64(var13, 0, var12, 0, 0, (byte) 37, 0, 1, true, field73.field835[0], 0, field73.field836[0]);
                    if (var14) {
                        this.field387.method192(var3);
                        this.field387.method192(var4);
                        this.field387.method193(this.field484);
                        this.field387.method192(57);
                        this.field387.method192(this.field165);
                        this.field387.method192(this.field198);
                        this.field387.method192(89);
                        this.field387.method193(field73.field844);
                        this.field387.method193(field73.field845);
                        this.field387.method192(this.field189);
                        this.field387.method192(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)V")
    public final void method36(byte[] arg0, int arg1, boolean arg2) {
        if (this.field241) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
            if (arg1 >= 0) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILNUXITFPR;I)V")
    public final void method37(boolean arg0, int arg1, class31 arg2, int arg3) {
        int var5 = this.field484 + this.field165 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class35.field1269[var5];
            int var8 = class35.field1270[var5];
            int var9 = var7 * 256 / (this.field198 + 256);
            int var10 = var8 * 256 / (this.field198 + 256);
            int var11 = arg1 * var9 + arg3 * var10 >> 16;
            int var12 = arg1 * var10 - arg3 * var9 >> 16;
            if (!arg0) {
                for (int var13 = 1; var13 > 0; ++var13) {
                }
            }
            if (var6 > 2500) {
                arg2.method382(var11 + 94 - arg2.field1160 / 2 + 4, this.field88, false, 83 - var12 - arg2.field1161 / 2 - 4);
            } else {
                arg2.method376(83 - var12 - arg2.field1161 / 2 - 4, true, var11 + 94 - arg2.field1160 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method38(boolean arg0) {
        this.field170.method492((byte) -56);
        class39.field1341 = this.field278;
        this.field87.method300(0, true, 0);
        if (this.field192 != -1) {
            this.method122(0, 481, 0, class11.method174(this.field192), 0);
        } else if (this.field541[this.field515] != -1) {
            this.method122(0, 481, 0, class11.method174(this.field541[this.field515]), 0);
        }
        if (this.field301 && this.field422 == 1) {
            this.method90((byte) -10);
        }
        this.field170.method493(584, 205, 553, super.field14);
        if (!arg0) {
            this.field208 = !this.field208;
        }
        this.field172.method492((byte) -56);
        class39.field1341 = this.field279;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method39(int arg0, int arg1) {
        int var2 = 4 / arg1;
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method40(byte arg0) {
        if (arg0 != 86) {
            this.field250 = this.field259.method202();
        }
        this.field375 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field71) {
                ++this.field233;
                this.method115((byte) -21);
                this.method115((byte) -21);
                this.method111(6);
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
        this.field375 = false;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method41(int arg0) {
        signlink.midiplay = false;
        if (arg0 >= 0) {
            this.field250 = this.field259.method202();
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILNUXITFPR;I)V")
    public final void method42(byte arg0, int arg1, class31 arg2, int arg3) {
        if (arg0 == -26) {
            int var5 = arg1 * arg1 + arg3 * arg3;
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field484 + this.field165 & 2047;
                int var7 = class35.field1269[var6];
                int var8 = class35.field1270[var6];
                int var9 = var7 * 256 / (this.field198 + 256);
                int var10 = var8 * 256 / (this.field198 + 256);
                int var11 = arg1 * var10 + arg3 * var9 >> 16;
                int var12 = arg3 * var10 - arg1 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field141.method381(15, 83 - var16 - 20, var13, 20, 256, 20, 15, -20448, var15 + 94 + 4 - 10);
            } else {
                this.method37(true, arg3, arg2, arg1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method43(boolean arg0, int arg1) {
        if (!arg0) {
            this.field250 = -1;
        }
        if (!field276) {
            for (int var3 = 0; var3 < this.field335.length; ++var3) {
                int var4 = this.field335[var3];
                if (class39.field1349[var4] >= arg1) {
                    class23 var5 = class39.field1343[var4];
                    int var6 = var5.field980 * var5.field979 - 1;
                    int var7 = this.field346 * var5.field979 * 2;
                    byte[] var8 = var5.field977;
                    byte[] var9 = this.field140;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field977 = var9;
                    this.field140 = var8;
                    class39.method454(var4, -228);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    private final void method44(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field250 = this.field259.method202();
        }
        if (this.field142 == 2) {
            for (class13 var3 = (class13) this.field255.method519(); var3 != null; var3 = (class13) this.field255.method521(5)) {
                if (var3.field741 > 0) {
                    --var3.field741;
                }
                if (var3.field741 == 0) {
                    if (var3.field738 < 0 || class36.method426(1, var3.field740, var3.field738)) {
                        this.method88(var3.field747, var3.field738, var3.field740, var3.field746, var3.field749, var3.field748, var3.field739, 5);
                        var3.method19();
                    }
                } else {
                    if (var3.field745 > 0) {
                        --var3.field745;
                    }
                    if (var3.field745 == 0 && var3.field748 >= 1 && var3.field749 >= 1 && var3.field748 <= 102 && var3.field749 <= 102 && (var3.field742 < 0 || class36.method426(1, var3.field744, var3.field742))) {
                        this.method88(var3.field747, var3.field742, var3.field744, var3.field746, var3.field749, var3.field748, var3.field743, 5);
                        var3.field745 = -1;
                        if (var3.field742 == var3.field738 && var3.field738 == -1) {
                            var3.method19();
                        } else if (var3.field742 == var3.field738 && var3.field743 == var3.field739 && var3.field744 == var3.field740) {
                            var3.method19();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method45(int arg0) {
        this.field183 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field386[var2] = -1;
            for (int var3 = 0; var3 < class12.field730; ++var3) {
                if (!class12.field731[var3].field737 && class12.field731[var3].field732 == var2 + (this.field401 ? 0 : 7)) {
                    this.field386[var2] = var3;
                    break;
                }
            }
        }
        while (arg0 >= 0) {
            this.field363 = !this.field363;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)I")
    public final int method46(boolean arg0) {
        if (arg0) {
            return this.field169;
        } else {
            int var2 = 3;
            if (this.field327 < 310) {
                int var3 = this.field324 >> 7;
                int var4 = this.field326 >> 7;
                int var5 = field73.field844 >> 7;
                int var6 = field73.field845 >> 7;
                if ((this.field439[this.field105][var3][var4] & 4) != 0) {
                    var2 = this.field105;
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
                        if ((this.field439[this.field105][var3][var4] & 4) != 0) {
                            var2 = this.field105;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field439[this.field105][var3][var4] & 4) != 0) {
                                var2 = this.field105;
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
                        if ((this.field439[this.field105][var3][var4] & 4) != 0) {
                            var2 = this.field105;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field439[this.field105][var3][var4] & 4) != 0) {
                                var2 = this.field105;
                            }
                        }
                    }
                }
            }
            if ((this.field439[this.field105][field73.field844 >> 7][field73.field845 >> 7] & 4) != 0) {
                var2 = this.field105;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)I")
    public final int method47(int arg0) {
        int var2 = this.method34(this.field326, 215, this.field105, this.field324);
        if (arg0 != 35713) {
            this.field387.method192(99);
        }
        return var2 - this.field325 < 800 && (this.field439[this.field105][this.field324 >> 7][this.field326 >> 7] & 4) != 0 ? this.field105 : 3;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)Ljava/lang/String;")
    public final String method48(int arg0) {
        if (arg0 >= 0) {
            field527 = 479;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field17 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILGHHPHSRU;)V")
    private final void method49(int arg0, int arg1, class14 arg2) {
        this.field476 = 0;
        this.field453 = 0;
        this.method97(arg1, false, arg2);
        this.method153(arg1, arg2, true);
        this.method33(arg1, arg2, (byte) 6);
        for (int var4 = 0; var4 < this.field476; ++var4) {
            int var6 = this.field477[var4];
            if (field419 != this.field405[var6].field855) {
                this.field405[var6].field987 = null;
                this.field405[var6] = null;
            }
        }
        if (arg0 < 0 || arg0 > 0) {
            this.field250 = arg2.method202();
        }
        if (arg2.field769 != arg1) {
            signlink.reporterror(this.field107 + " size mismatch in getnpcpos - pos:" + arg2.field769 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field406; ++var5) {
                if (this.field405[this.field407[var5]] == null) {
                    signlink.reporterror(this.field107 + " null entry in npc list - pos:" + var5 + " size:" + this.field406);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIII)V")
    public final void method50(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg0 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class35.field1269[var8];
            int var14 = class35.field1270[var8];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class35.field1269[var9];
            int var17 = class35.field1270[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field324 = arg6 - var10;
        this.field238 &= arg1;
        this.field325 = arg2 - var11;
        this.field326 = arg3 - var12;
        this.field327 = arg5;
        this.field328 = arg0;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method51(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (class43 var3 = (class43) this.field373.method519(); var3 != null; var3 = (class43) this.field373.method521(5)) {
            if (this.field105 == var3.field1385 && !var3.field1390) {
                if (field419 >= var3.field1389) {
                    var3.method469(this.field346, this.field363);
                    if (var3.field1390) {
                        var3.method19();
                    } else {
                        this.field239.method320(var3, var3.field1386, var3.field1387, -1, var3.field1388, false, 60, this.field354, 0, var3.field1385);
                    }
                }
            } else {
                var3.method19();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method52(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field219 >= 100) {
                this.method31("", true, "Your ignore list is full. Max of 100 hit", 0);
            } else {
                String var4 = class55.method514(class55.method511(arg0, 622), -36397);
                for (int var5 = 0; var5 < this.field219; ++var5) {
                    if (this.field482[var5] == arg0) {
                        this.method31("", true, var4 + " is already on your ignore list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field263; ++var6) {
                    if (this.field242[var6] == arg0) {
                        this.method31("", true, "Please remove " + var4 + " from your friend list first", 0);
                        return;
                    }
                }
                this.field482[this.field219++] = arg0;
                this.field431 = true;
                if (arg1 != 6) {
                    this.field387.method192(66);
                }
                this.field387.method191(this.field240, 122);
                this.field387.method198(arg0, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method8(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field132 != null) {
                this.field132.method583();
            }
        } catch (Exception var2) {
        }
        this.field132 = null;
        this.method41(-557);
        if (this.field332 != null) {
            this.field332.field1703 = false;
        }
        this.field332 = null;
        this.field83.method572();
        this.field83 = null;
        this.field404 = null;
        this.field387 = null;
        this.field507 = null;
        this.field259 = null;
        this.field291 = null;
        this.field267 = null;
        this.field60 = null;
        this.field292 = null;
        this.field293 = null;
        this.field72 = null;
        this.field439 = null;
        this.field239 = null;
        this.field260 = null;
        this.field498 = null;
        this.field81 = null;
        this.field136 = null;
        this.field137 = null;
        this.field140 = null;
        this.field170 = null;
        this.field171 = null;
        this.field172 = null;
        this.field173 = null;
        this.field74 = null;
        this.field75 = null;
        this.field76 = null;
        this.field543 = null;
        this.field544 = null;
        this.field545 = null;
        this.field546 = null;
        this.field547 = null;
        this.field548 = null;
        this.field549 = null;
        this.field550 = null;
        this.field551 = null;
        this.field87 = null;
        this.field88 = null;
        this.field89 = null;
        this.field533 = null;
        this.field534 = null;
        this.field535 = null;
        this.field459 = null;
        this.field228 = null;
        this.field229 = null;
        this.field230 = null;
        this.field231 = null;
        this.field232 = null;
        this.field490 = null;
        this.field491 = null;
        this.field492 = null;
        this.field493 = null;
        this.field494 = null;
        this.field355 = null;
        this.field347 = null;
        this.field157 = null;
        this.field532 = null;
        this.field110 = null;
        this.field180 = null;
        this.field537 = null;
        this.field508 = null;
        this.field509 = null;
        this.field510 = null;
        this.field511 = null;
        this.field512 = null;
        this.field523 = null;
        if (arg0 != 9) {
            this.field250 = this.field259.method202();
        }
        this.field68 = null;
        this.field155 = null;
        this.field450 = null;
        this.field452 = null;
        this.field454 = null;
        this.field455 = null;
        this.field477 = null;
        this.field405 = null;
        this.field407 = null;
        this.field162 = null;
        this.field255 = null;
        this.field391 = null;
        this.field373 = null;
        this.field358 = null;
        this.field359 = null;
        this.field360 = null;
        this.field361 = null;
        this.field262 = null;
        this.field539 = null;
        this.field317 = null;
        this.field318 = null;
        this.field256 = null;
        this.field480 = null;
        this.field209 = null;
        this.field242 = null;
        this.field210 = null;
        this.field305 = null;
        this.field306 = null;
        this.field302 = null;
        this.field303 = null;
        this.field304 = null;
        this.field307 = null;
        this.field308 = null;
        this.field309 = null;
        this.field310 = null;
        this.method86(0);
        class28.method368(2);
        class6.method160(2);
        class72.method591(2);
        class11.method177(2);
        class38.field1315 = null;
        class12.field731 = null;
        class30.field1136 = null;
        class58.field1560 = null;
        class3.field41 = null;
        class3.field53 = null;
        class42.field1367 = null;
        super.field15 = null;
        class10.field634 = null;
        class39.method447(2);
        class27.method308(2);
        class35.method387(2);
        class68.method580(2);
        System.gc();
        if (class4.field57) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method12(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method12(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method53(boolean arg0) {
        this.field121 = 0;
        for (int var2 = -1; var2 < this.field451 + this.field406; ++var2) {
            class16 var20;
            if (var2 == -1) {
                var20 = field73;
            } else if (var2 < this.field451) {
                var20 = this.field450[this.field452[var2]];
            } else {
                var20 = this.field405[this.field407[var2 - this.field451]];
            }
            if (var20 != null && var20.method169(-528)) {
                if (var20 instanceof class24) {
                    class6 var21 = ((class24) var20).field987;
                    if (var21.field583 != null) {
                        var21 = var21.method164(46311);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field451) {
                    class6 var24 = ((class24) var20).field987;
                    if (var24.field565 >= 0 && var24.field565 < this.field532.length) {
                        this.method131(var20.field857 + 15, var20, false);
                        if (this.field341 > -1) {
                            this.field532[var24.field565].method376(this.field342 - 30, true, this.field341 - 12);
                        }
                    }
                    if (this.field193 == 1 && this.field407[var2 - this.field451] == this.field438 && field419 % 20 < 10) {
                        this.method131(var20.field857 + 15, var20, false);
                        if (this.field341 > -1) {
                            this.field110[0].method376(this.field342 - 28, true, this.field341 - 12);
                        }
                    }
                } else {
                    int var22 = 30;
                    class10 var23 = (class10) var20;
                    if (var23.field639 != -1 || var23.field624 != -1) {
                        this.method131(var20.field857 + 15, var20, false);
                        if (this.field341 > -1) {
                            if (var23.field639 != -1) {
                                this.field157[var23.field639].method376(this.field342 - var22, true, this.field341 - 12);
                                var22 += 25;
                            }
                            if (var23.field624 != -1) {
                                this.field532[var23.field624].method376(this.field342 - var22, true, this.field341 - 12);
                                var22 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field193 == 10 && this.field452[var2] == this.field516) {
                        this.method131(var20.field857 + 15, var20, false);
                        if (this.field341 > -1) {
                            this.field110[1].method376(this.field342 - var22, true, this.field341 - 12);
                        }
                    }
                }
                if (var20.field837 != null && (var2 >= this.field451 || this.field443 == 0 || this.field443 == 3 || this.field443 == 1 && this.method83((byte) -30, ((class10) var20).field625))) {
                    this.method131(var20.field857, var20, false);
                    if (this.field341 > -1 && this.field121 < this.field122) {
                        this.field126[this.field121] = this.field469.method476(-7791, var20.field837) / 2;
                        this.field125[this.field121] = this.field469.field1462;
                        this.field123[this.field121] = this.field341;
                        this.field124[this.field121] = this.field342;
                        this.field127[this.field121] = var20.field864;
                        this.field128[this.field121] = var20.field885;
                        this.field129[this.field121] = var20.field831;
                        this.field130[this.field121++] = var20.field837;
                        if (this.field181 == 0 && var20.field885 >= 1 && var20.field885 <= 3) {
                            this.field125[this.field121] += 10;
                            this.field124[this.field121] += 5;
                        }
                        if (this.field181 == 0 && var20.field885 == 4) {
                            this.field126[this.field121] = 60;
                        }
                        if (this.field181 == 0 && var20.field885 == 5) {
                            this.field125[this.field121] += 5;
                        }
                    }
                }
                if (var20.field877 > field419) {
                    this.method131(var20.field857 + 15, var20, false);
                    if (this.field341 > -1) {
                        int var25 = var20.field878 * 30 / var20.field879;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class20.method288(this.field341 - 15, 0, this.field342 - 3, var25, 65280, 5);
                        class20.method288(this.field341 - 15 + var25, 0, this.field342 - 3, 30 - var25, 16711680, 5);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var20.field872[var26] > field419) {
                        this.method131(var20.field857 / 2, var20, false);
                        if (this.field341 > -1) {
                            if (var26 == 1) {
                                this.field342 -= 20;
                            }
                            if (var26 == 2) {
                                this.field341 -= 15;
                                this.field342 -= 10;
                            }
                            if (var26 == 3) {
                                this.field341 += 15;
                                this.field342 -= 10;
                            }
                            this.field347[var20.field871[var26]].method376(this.field342 - 12, true, this.field341 - 12);
                            this.field467.method473(this.field342 + 4, this.field341, 0, String.valueOf(var20.field870[var26]), 6600);
                            this.field467.method473(this.field342 + 3, this.field341 - 1, 16777215, String.valueOf(var20.field870[var26]), 6600);
                        }
                    }
                }
            }
        }
        ++field154;
        if (field154 > 1950) {
            field154 = 0;
            this.field387.method191(this.field240, 218);
            this.field387.method192(0);
            int var3 = this.field387.field769;
            this.field387.method193(40201);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field387.method192(138);
            }
            this.field387.method192((int) (Math.random() * 256.0D));
            this.field387.method192(149);
            this.field387.method193(26766);
            this.field387.method192((int) (Math.random() * 256.0D));
            this.field387.method193(33876);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field387.method192(53);
            }
            this.field387.method192((int) (Math.random() * 256.0D));
            this.field387.method193(20471);
            this.field387.method201(this.field387.field769 - var3, -48308);
        }
        for (int var4 = 0; var4 < this.field121; ++var4) {
            int var5 = this.field123[var4];
            int var6 = this.field124[var4];
            int var7 = this.field126[var4];
            int var8 = this.field125[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field124[var19] - this.field125[var19] && var6 - var8 < this.field124[var19] + 2 && var5 - var7 < this.field126[var19] + this.field123[var19] && var5 + var7 > this.field123[var19] - this.field126[var19] && this.field124[var19] - this.field125[var19] < var6) {
                        var6 = this.field124[var19] - this.field125[var19];
                        var9 = true;
                    }
                }
            }
            this.field341 = this.field123[var4];
            this.field342 = this.field124[var4] = var6;
            String var10 = this.field130[var4];
            if (this.field181 == 0) {
                int var11 = 16776960;
                if (this.field127[var4] < 6) {
                    var11 = this.field164[this.field127[var4]];
                }
                if (this.field127[var4] == 6) {
                    var11 = this.field80 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field127[var4] == 7) {
                    var11 = this.field80 % 20 < 10 ? 255 : 65535;
                }
                if (this.field127[var4] == 8) {
                    var11 = this.field80 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field127[var4] == 9) {
                    int var12 = 150 - this.field129[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field127[var4] == 10) {
                    int var13 = 150 - this.field129[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field127[var4] == 11) {
                    int var14 = 150 - this.field129[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field128[var4] == 0) {
                    this.field469.method473(this.field342 + 1, this.field341, 0, var10, 6600);
                    this.field469.method473(this.field342, this.field341, var11, var10, 6600);
                }
                if (this.field128[var4] == 1) {
                    this.field469.method478(this.field80, this.field342 + 1, this.field341, var10, true, 0);
                    this.field469.method478(this.field80, this.field342, this.field341, var10, true, var11);
                }
                if (this.field128[var4] == 2) {
                    this.field469.method479(this.field80, this.field341, this.field342 + 1, var10, (byte) 0, 0);
                    this.field469.method479(this.field80, this.field341, this.field342, var10, (byte) 0, var11);
                }
                if (this.field128[var4] == 3) {
                    this.field469.method480(this.field342 + 1, -459, this.field341, 150 - this.field129[var4], this.field80, var10, 0);
                    this.field469.method480(this.field342, -459, this.field341, 150 - this.field129[var4], this.field80, var10, var11);
                }
                if (this.field128[var4] == 4) {
                    int var15 = this.field469.method476(-7791, var10);
                    int var16 = (150 - this.field129[var4]) * (var15 + 100) / 150;
                    class20.method285(this.field341 - 50, -749, 0, 334, this.field341 + 50);
                    this.field469.method477(0, var10, 3, this.field342 + 1, this.field341 + 50 - var16);
                    this.field469.method477(var11, var10, 3, this.field342, this.field341 + 50 - var16);
                    class20.method284(3);
                }
                if (this.field128[var4] == 5) {
                    int var17 = 150 - this.field129[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class20.method285(0, -749, this.field342 - this.field469.field1462 - 1, this.field342 + 5, 512);
                    this.field469.method473(this.field342 + 1 + var18, this.field341, 0, var10, 6600);
                    this.field469.method473(this.field342 + var18, this.field341, var11, var10, 6600);
                    class20.method284(3);
                }
            } else {
                this.field469.method473(this.field342 + 1, this.field341, 0, var10, 6600);
                this.field469.method473(this.field342, this.field341, 16776960, var10, 6600);
            }
        }
        this.field238 &= arg0;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method54(boolean arg0) {
        this.field238 &= arg0;
        if (this.field176 == 0) {
            int var2 = super.field12 / 2 - 80;
            int var3 = super.field13 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field28 == 1 && super.field29 >= var2 - 75 && super.field29 <= var2 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                this.field176 = 3;
                this.field320 = 0;
            }
            int var4 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var4 - 75 && super.field29 <= var4 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                this.field330 = "";
                this.field331 = "Enter your username & password.";
                this.field176 = 2;
                this.field320 = 0;
            }
        } else if (this.field176 == 2) {
            int var5 = super.field13 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field28 == 1 && super.field30 >= var16 - 15 && super.field30 < var16) {
                this.field320 = 0;
            }
            var5 = var16 + 15;
            if (super.field28 == 1 && super.field30 >= var5 - 15 && super.field30 < var5) {
                this.field320 = 1;
            }
            var5 += 15;
            int var6 = super.field12 / 2 - 80;
            int var7 = super.field13 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field28 == 1 && super.field29 >= var6 - 75 && super.field29 <= var6 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                this.field99 = 0;
                this.method152(this.field107, this.field108, false);
                if (this.field238) {
                    return;
                }
            }
            int var8 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var8 - 75 && super.field29 <= var8 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                this.field176 = 0;
                this.field107 = "";
                this.field108 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(this.field246);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field70.length(); ++var11) {
                        if (var9 == field70.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field320 == 0) {
                        if (var9 == 8 && this.field107.length() > 0) {
                            this.field107 = this.field107.substring(0, this.field107.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field320 = 1;
                        }
                        if (var10) {
                            this.field107 = this.field107 + (char) var9;
                        }
                        if (this.field107.length() > 12) {
                            this.field107 = this.field107.substring(0, 12);
                        }
                    } else if (this.field320 == 1) {
                        if (var9 == 8 && this.field108.length() > 0) {
                            this.field108 = this.field108.substring(0, this.field108.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field320 = 0;
                        }
                        if (var10) {
                            this.field108 = this.field108 + (char) var9;
                        }
                        if (this.field108.length() > 20) {
                            this.field108 = this.field108.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field176 == 3) {
                int var12 = super.field12 / 2;
                int var13 = super.field13 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field28 == 1 && super.field29 >= var12 - 75 && super.field29 <= var12 + 75 && super.field30 >= var18 - 20 && super.field30 <= var18 + 20) {
                    this.field176 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (this.field173 == null) {
            this.method86(0);
            super.field15 = null;
            this.field302 = null;
            this.field303 = null;
            this.field304 = null;
            this.field305 = null;
            this.field306 = null;
            this.field307 = null;
            this.field308 = null;
            this.field309 = null;
            this.field310 = null;
            this.field173 = new class50(479, this.method11((byte) 9), 96, 9);
            this.field171 = new class50(172, this.method11((byte) 9), 156, 9);
            class20.method286(0);
            if (arg0 != 14922) {
                this.field250 = -1;
            }
            this.field88.method300(0, true, 0);
            this.field170 = new class50(190, this.method11((byte) 9), 261, 9);
            this.field172 = new class50(512, this.method11((byte) 9), 334, 9);
            class20.method286(0);
            this.field74 = new class50(496, this.method11((byte) 9), 50, 9);
            this.field75 = new class50(269, this.method11((byte) 9), 37, 9);
            this.field76 = new class50(249, this.method11((byte) 9), 45, 9);
            this.field313 = true;
            this.field172.method492((byte) -56);
            class39.field1341 = this.field279;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(20, field85, "Starting up");
        if (signlink.sunjava) {
            super.field8 = 5;
        }
        if (field410) {
            this.field364 = true;
        } else {
            field410 = true;
            boolean var1 = false;
            String var2 = this.method48(-253);
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
                this.field261 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field481[var3] = new class64(var3 + 1, signlink.cache_idx[var3], 500000, (byte) -128, signlink.cache_dat);
                    }
                }
                try {
                    this.method91(-565);
                    this.field466 = this.method157(this.field538[1], "title", "title screen", -5, 25, 1);
                    this.field467 = new class47(this.field466, "p11_full", false, 279);
                    this.field468 = new class47(this.field466, "p12_full", false, 279);
                    this.field469 = new class47(this.field466, "b12_full", false, 279);
                    this.field470 = new class47(this.field466, "q8_full", true, 279);
                    this.method82(502);
                    this.method25(field257);
                    class8 var4 = this.method157(this.field538[2], "config", "config", -5, 30, 2);
                    class8 var5 = this.method157(this.field538[3], "interface", "interface", -5, 35, 3);
                    class8 var6 = this.method157(this.field538[4], "media", "2d graphics", -5, 40, 4);
                    class8 var7 = this.method157(this.field538[6], "textures", "textures", -5, 45, 6);
                    class8 var8 = this.method157(this.field538[7], "wordenc", "chat system", -5, 50, 7);
                    class8 var9 = this.method157(this.field538[8], "sounds", "sound effects", -5, 55, 8);
                    this.field439 = new byte[4][104][104];
                    this.field72 = new int[4][105][105];
                    this.field239 = new class27(4, (byte) 94, 104, 104, this.field72);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field260[var10] = new class63(104, 104, field531);
                    }
                    this.field480 = new class31(512, 512);
                    class8 var11 = this.method157(this.field538[5], "versionlist", "update list", -5, 60, 5);
                    this.method13(60, field85, "Connecting to update server");
                    this.field83 = new class67();
                    this.field83.method571(var11, this);
                    class68.method578(this.field83.method564(878));
                    class35.method388(this.field83.method563(0, 171), this.field83);
                    if (!field276) {
                        this.field408 = 0;
                        this.field409 = true;
                        this.field83.method576(2, this.field408);
                        while (this.field83.method568() > 0) {
                            this.method78((byte) 9);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field83.field1661 > 3) {
                                this.method105("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13(65, field85, "Requesting animations");
                    int var12 = this.field83.method563(1, 171);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field83.method576(1, var13);
                    }
                    while (this.field83.method568() > 0) {
                        int var14 = var12 - this.field83.method568();
                        if (var14 > 0) {
                            this.method13(65, field85, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method78((byte) 9);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field83.field1661 > 3) {
                            this.method105("ondemand");
                            return;
                        }
                    }
                    this.method13(70, field85, "Requesting models");
                    int var15 = this.field83.method563(0, 171);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field83.method562(var16, 453);
                        if ((var17 & 1) != 0) {
                            this.field83.method576(0, var16);
                        }
                    }
                    int var18 = this.field83.method568();
                    while (this.field83.method568() > 0) {
                        int var19 = var18 - this.field83.method568();
                        if (var19 > 0) {
                            this.method13(70, field85, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method78((byte) 9);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field481[0] != null) {
                        this.method13(75, field85, "Requesting maps");
                        this.field83.method576(3, this.field83.method561(48, field527, 47, 0));
                        this.field83.method576(3, this.field83.method561(48, field527, 47, 1));
                        this.field83.method576(3, this.field83.method561(48, field527, 48, 0));
                        this.field83.method576(3, this.field83.method561(48, field527, 48, 1));
                        this.field83.method576(3, this.field83.method561(48, field527, 49, 0));
                        this.field83.method576(3, this.field83.method561(48, field527, 49, 1));
                        this.field83.method576(3, this.field83.method561(47, field527, 47, 0));
                        this.field83.method576(3, this.field83.method561(47, field527, 47, 1));
                        this.field83.method576(3, this.field83.method561(47, field527, 48, 0));
                        this.field83.method576(3, this.field83.method561(47, field527, 48, 1));
                        this.field83.method576(3, this.field83.method561(148, field527, 48, 0));
                        this.field83.method576(3, this.field83.method561(148, field527, 48, 1));
                        int var20 = this.field83.method568();
                        while (this.field83.method568() > 0) {
                            int var21 = var20 - this.field83.method568();
                            if (var21 > 0) {
                                this.method13(75, field85, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method78((byte) 9);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field83.method563(0, 171);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field83.method562(var23, 453);
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
                            this.field83.method569(0, var25, 0, var23);
                        }
                    }
                    this.field83.method560(field275, false);
                    if (!field276) {
                        int var26 = this.field83.method563(2, 171);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field83.method558(var27, 878)) {
                                this.field83.method569(2, (byte) 1, 0, var27);
                            }
                        }
                    }
                    this.method13(80, field85, "Unpacking media");
                    this.field87 = new class23(var6, "invback", 0);
                    this.field89 = new class23(var6, "chatback", 0);
                    this.field88 = new class23(var6, "mapback", 0);
                    this.field533 = new class23(var6, "backbase1", 0);
                    this.field534 = new class23(var6, "backbase2", 0);
                    this.field535 = new class23(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field459[var28] = new class23(var6, "sideicons", var28);
                    }
                    this.field355 = new class31(var6, "compass", 0);
                    this.field141 = new class31(var6, "mapedge", 0);
                    this.field141.method373(24);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field523[var29] = new class23(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field68[var30] = new class31(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field347[var31] = new class31(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field157[var32] = new class31(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field532[var33] = new class31(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field110[var34] = new class31(var6, "headicons_hint", var34);
                    }
                    this.field537 = new class31(var6, "overlay_multiway", 0);
                    this.field111 = new class31(var6, "mapmarker", 0);
                    this.field112 = new class31(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field180[var35] = new class31(var6, "cross", var35);
                    }
                    this.field508 = new class31(var6, "mapdots", 0);
                    this.field509 = new class31(var6, "mapdots", 1);
                    this.field510 = new class31(var6, "mapdots", 2);
                    this.field511 = new class31(var6, "mapdots", 3);
                    this.field512 = new class31(var6, "mapdots", 4);
                    this.field349 = new class23(var6, "scrollbar", 0);
                    this.field350 = new class23(var6, "scrollbar", 1);
                    this.field228 = new class23(var6, "redstone1", 0);
                    this.field229 = new class23(var6, "redstone2", 0);
                    this.field230 = new class23(var6, "redstone3", 0);
                    this.field231 = new class23(var6, "redstone1", 0);
                    this.field231.method297(5496);
                    this.field232 = new class23(var6, "redstone2", 0);
                    this.field232.method297(5496);
                    this.field490 = new class23(var6, "redstone1", 0);
                    this.field490.method298(true);
                    this.field491 = new class23(var6, "redstone2", 0);
                    this.field491.method298(true);
                    this.field492 = new class23(var6, "redstone3", 0);
                    this.field492.method298(true);
                    this.field493 = new class23(var6, "redstone1", 0);
                    this.field493.method297(5496);
                    this.field493.method298(true);
                    this.field494 = new class23(var6, "redstone2", 0);
                    this.field494.method297(5496);
                    this.field494.method298(true);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field319[var36] = new class23(var6, "mod_icons", var36);
                    }
                    class31 var37 = new class31(var6, "backleft1", 0);
                    this.field543 = new class50(var37.field1156, this.method11((byte) 9), var37.field1157, 9);
                    var37.method374(0, 0, 859);
                    class31 var38 = new class31(var6, "backleft2", 0);
                    this.field544 = new class50(var38.field1156, this.method11((byte) 9), var38.field1157, 9);
                    var38.method374(0, 0, 859);
                    class31 var39 = new class31(var6, "backright1", 0);
                    this.field545 = new class50(var39.field1156, this.method11((byte) 9), var39.field1157, 9);
                    var39.method374(0, 0, 859);
                    class31 var40 = new class31(var6, "backright2", 0);
                    this.field546 = new class50(var40.field1156, this.method11((byte) 9), var40.field1157, 9);
                    var40.method374(0, 0, 859);
                    class31 var41 = new class31(var6, "backtop1", 0);
                    this.field547 = new class50(var41.field1156, this.method11((byte) 9), var41.field1157, 9);
                    var41.method374(0, 0, 859);
                    class31 var42 = new class31(var6, "backvmid1", 0);
                    this.field548 = new class50(var42.field1156, this.method11((byte) 9), var42.field1157, 9);
                    var42.method374(0, 0, 859);
                    class31 var43 = new class31(var6, "backvmid2", 0);
                    this.field549 = new class50(var43.field1156, this.method11((byte) 9), var43.field1157, 9);
                    var43.method374(0, 0, 859);
                    class31 var44 = new class31(var6, "backvmid3", 0);
                    this.field550 = new class50(var44.field1156, this.method11((byte) 9), var44.field1157, 9);
                    var44.method374(0, 0, 859);
                    class31 var45 = new class31(var6, "backhmid2", 0);
                    this.field551 = new class50(var45.field1156, this.method11((byte) 9), var45.field1157, 9);
                    var45.method374(0, 0, 859);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field68[var50] != null) {
                            this.field68[var50].method372(var48 + var49, var46 + var49, 307, var47 + var49);
                        }
                        if (this.field523[var50] != null) {
                            this.field523[var50].method299(var48 + var49, var46 + var49, 307, var47 + var49);
                        }
                    }
                    this.method13(83, field85, "Unpacking textures");
                    class39.method452(-319, var7);
                    class39.method456(-14753, 0.8D);
                    class39.method451(-290, 20);
                    this.method13(86, field85, "Unpacking config");
                    class58.method524(var4, 1);
                    class28.method369(var4);
                    class38.method443(var4, 1);
                    class72.method600(var4);
                    class6.method165(var4);
                    class12.method184(var4, 1);
                    class3.method16(var4, 1);
                    class42.method467(var4, 1);
                    class34.method385(var4, 1);
                    class72.field1718 = field275;
                    if (!field276) {
                        this.method13(90, field85, "Unpacking sounds");
                        byte[] var51 = var9.method168("sounds.dat", (byte[]) null);
                        class14 var52 = new class14(-527, var51);
                        class59.method527(var52, 1);
                    }
                    this.method13(95, field85, "Unpacking interfaces");
                    class47[] var53 = new class47[] { this.field467, this.field468, this.field469, this.field470 };
                    class11.method176(var53, 6, var5, var6);
                    this.method13(100, field85, "Preparing game engine");
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field88.field977[this.field88.field979 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field552[var54] = var55;
                        this.field93[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field88.field977[this.field88.field979 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field348[var58 - 5] = var59 - 25;
                        this.field390[var58 - 5] = var60 - var59;
                    }
                    class39.method449(503, true, 765);
                    this.field280 = class39.field1341;
                    class39.method449(96, true, 479);
                    this.field277 = class39.field1341;
                    class39.method449(261, true, 190);
                    this.field278 = class39.field1341;
                    class39.method449(334, true, 512);
                    this.field279 = class39.field1341;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class39.field1339[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class27.method345(6, 500, 334, 512, var62, 800);
                    class17.method245(var8);
                    this.field332 = new class70(this, false);
                    this.method12(this.field332, 10);
                    class61.field1595 = this;
                    class28.field1129 = this;
                    class6.field595 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field133 + " " + this.field290);
                    this.field270 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    private final void method56(int arg0) {
        class13 var2 = (class13) this.field255.method519();
        if (arg0 >= 0) {
            this.field387.method192(75);
        }
        while (var2 != null) {
            if (var2.field741 == -1) {
                var2.field745 = 0;
                this.method137(this.field135, var2);
            } else {
                var2.method19();
            }
            var2 = (class13) this.field255.method521(5);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (this.field235 != 0) {
            class47 var2 = this.field468;
            int var3 = 0;
            if (this.field245 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field161[var4] != null) {
                    int var5 = this.field159[var4];
                    String var6 = this.field160[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field353 == 0 || this.field353 == 1 && this.method83((byte) -30, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method477(0, "From", 3, var8, var9);
                        var2.method477(65535, "From", 3, var8 - 1, var9);
                        int var10 = var9 + var2.method475("From ", 0);
                        if (var7 == 1) {
                            this.field319[0].method300(var8 - 12, true, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field319[1].method300(var8 - 12, true, var10);
                            var10 += 14;
                        }
                        var2.method477(0, var6 + ": " + this.field161[var4], 3, var8, var10);
                        var2.method477(65535, var6 + ": " + this.field161[var4], 3, var8 - 1, var10);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field353 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method477(0, this.field161[var4], 3, var11, 4);
                        var2.method477(65535, this.field161[var4], 3, var11 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field353 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method477(0, "To " + var6 + ": " + this.field161[var4], 3, var12, 4);
                        var2.method477(65535, "To " + var6 + ": " + this.field161[var4], 3, var12 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field249 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -20742) {
            this.field162 = null;
        }
        int var7 = this.field239.method335(arg5, arg3, arg2);
        if (var7 != 0) {
            int var8 = this.field239.method339(arg5, arg3, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg0;
            }
            int[] var12 = this.field480.field1155;
            int var13 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class28 var15 = class28.method365(var14);
            if (var15.field1087 != -1) {
                class23 var16 = this.field523[var15.field1087];
                if (var16 != null) {
                    int var17 = (var15.field1131 * 4 - var16.field979) / 2;
                    int var18 = (var15.field1125 * 4 - var16.field980) / 2;
                    var16.method300((104 - arg2 - var15.field1125) * 4 + 48 + var18, true, arg3 * 4 + 48 + var17);
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
        int var19 = this.field239.method337(arg5, arg3, arg2);
        if (var19 != 0) {
            int var20 = this.field239.method339(arg5, arg3, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class28 var24 = class28.method365(var23);
            if (var24.field1087 != -1) {
                class23 var25 = this.field523[var24.field1087];
                if (var25 != null) {
                    int var26 = (var24.field1131 * 4 - var25.field979) / 2;
                    int var27 = (var24.field1125 * 4 - var25.field980) / 2;
                    var25.method300((104 - arg2 - var24.field1125) * 4 + 48 + var27, true, arg3 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field480.field1155;
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
        int var31 = this.field239.method338(arg5, arg3, arg2);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class28 var33 = class28.method365(var32);
            if (var33.field1087 != -1) {
                class23 var34 = this.field523[var33.field1087];
                if (var34 != null) {
                    int var35 = (var33.field1131 * 4 - var34.field979) / 2;
                    int var36 = (var33.field1125 * 4 - var34.field980) / 2;
                    var34.method300((104 - arg2 - var33.field1125) * 4 + 48 + var36, true, arg3 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method59(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field219; ++var4) {
                if (this.field482[var4] == arg0) {
                    --this.field219;
                    this.field431 = true;
                    for (int var5 = var4; var5 < this.field219; ++var5) {
                        this.field482[var5] = this.field482[var5 + 1];
                    }
                    this.field387.method191(this.field240, 140);
                    this.field387.method198(arg0, 0);
                    break;
                }
            }
            if (arg1 >= 0) {
                this.method6();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method60(boolean arg0, int arg1) {
        int var3 = class42.field1367[arg1].field1375;
        if (var3 != 0) {
            int var4 = this.field539[arg1];
            if (!arg0) {
                this.field442 = -260;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class39.method456(-14753, 0.9D);
                }
                if (var4 == 2) {
                    class39.method456(-14753, 0.8D);
                }
                if (var4 == 3) {
                    class39.method456(-14753, 0.7D);
                }
                if (var4 == 4) {
                    class39.method456(-14753, 0.6D);
                }
                class72.field1760.method509();
                this.field313 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field241;
                if (var4 == 0) {
                    this.method136(28068, 0, this.field241);
                    this.field241 = true;
                }
                if (var4 == 1) {
                    this.method136(28068, -400, this.field241);
                    this.field241 = true;
                }
                if (var4 == 2) {
                    this.method136(28068, -800, this.field241);
                    this.field241 = true;
                }
                if (var4 == 3) {
                    this.method136(28068, -1200, this.field241);
                    this.field241 = true;
                }
                if (var4 == 4) {
                    this.field241 = false;
                }
                if (this.field241 != var5 && !field276) {
                    if (this.field241) {
                        this.field408 = this.field98;
                        this.field409 = true;
                        this.field83.method576(2, this.field408);
                    } else {
                        this.method41(-557);
                    }
                    this.field400 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field254 = true;
                    this.method61((byte) -110, 0);
                }
                if (var4 == 1) {
                    this.field254 = true;
                    this.method61((byte) -110, -400);
                }
                if (var4 == 2) {
                    this.field254 = true;
                    this.method61((byte) -110, -800);
                }
                if (var4 == 3) {
                    this.field254 = true;
                    this.method61((byte) -110, -1200);
                }
                if (var4 == 4) {
                    this.field254 = false;
                }
            }
            if (var3 == 5) {
                this.field265 = var4;
            }
            if (var3 == 6) {
                this.field181 = var4;
            }
            if (var3 == 8) {
                this.field235 = var4;
                this.field343 = true;
            }
            if (var3 == 9) {
                this.field144 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method61(byte arg0, int arg1) {
        if (arg0 != -110) {
            this.field250 = this.field259.method202();
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method62(byte arg0) {
        if (this.field235 != 0) {
            int var2 = 0;
            if (this.field245 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field161[var3] != null) {
                    int var4 = this.field159[var3];
                    String var5 = this.field160[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field353 == 0 || this.field353 == 1 && this.method83((byte) -30, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field22 > 4 && super.field23 - 4 > var9 - 10 && super.field23 - 4 <= var9 + 3) {
                            int var10 = this.field468.method475("From:  " + var5 + this.field161[var3], 0) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field22 < var10 + 4) {
                                if (this.field528 >= 1) {
                                    this.field262[this.field436] = "Report abuse @whi@" + var5;
                                    this.field360[this.field436] = 2279;
                                    ++this.field436;
                                }
                                this.field262[this.field436] = "Add ignore @whi@" + var5;
                                this.field360[this.field436] = 2275;
                                ++this.field436;
                                this.field262[this.field436] = "Add friend @whi@" + var5;
                                this.field360[this.field436] = 2691;
                                ++this.field436;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field353 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 3) {
                this.field131 = !this.field131;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method63(String arg0) throws IOException {
        if (!this.field86) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field175 != null) {
                try {
                    this.field175.close();
                } catch (Exception var4) {
                }
                this.field175 = null;
            }
            this.field175 = this.method119(43595);
            this.field175.setSoTimeout(10000);
            InputStream var2 = this.field175.getInputStream();
            OutputStream var3 = this.field175.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIBIIZIII)Z")
    public final boolean method64(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field498[var15][var35] = 0;
                this.field81[var15][var35] = 99999999;
            }
        }
        int var16 = arg9;
        int var17 = arg11;
        this.field498[arg9][arg11] = 99;
        this.field81[arg9][arg11] = 0;
        byte var18 = 0;
        int var19 = 0;
        if (arg5 != 37) {
            this.method6();
        }
        this.field136[var18] = arg9;
        int var36 = var18 + 1;
        this.field137[var18] = arg11;
        boolean var20 = false;
        int var21 = this.field136.length;
        int[][] var22 = this.field260[this.field105].field1625;
        while (var36 != var19) {
            var16 = this.field136[var19];
            var17 = this.field137[var19];
            var19 = (var19 + 1) % var21;
            if (arg2 == var16 && arg0 == var17) {
                var20 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && this.field260[this.field105].method546(arg1 - 1, var16, arg6, arg0, true, arg2, var17)) {
                    var20 = true;
                    break;
                }
                if (arg1 < 10 && this.field260[this.field105].method547(0, arg6, arg0, var16, arg1 - 1, var17, arg2)) {
                    var20 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg10 != 0 && this.field260[this.field105].method548(arg3, arg4, arg10, arg0, 3, var17, var16, arg2)) {
                var20 = true;
                break;
            }
            int var34 = this.field81[var16][var17] + 1;
            if (var16 > 0 && this.field498[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field136[var36] = var16 - 1;
                this.field137[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field498[var16 - 1][var17] = 2;
                this.field81[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field498[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field136[var36] = var16 + 1;
                this.field137[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field498[var16 + 1][var17] = 8;
                this.field81[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field498[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field136[var36] = var16;
                this.field137[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field498[var16][var17 - 1] = 1;
                this.field81[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field498[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field136[var36] = var16;
                this.field137[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field498[var16][var17 + 1] = 4;
                this.field81[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field498[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field136[var36] = var16 - 1;
                this.field137[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field498[var16 - 1][var17 - 1] = 3;
                this.field81[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field498[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field136[var36] = var16 + 1;
                this.field137[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field498[var16 + 1][var17 - 1] = 9;
                this.field81[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field498[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field136[var36] = var16 - 1;
                this.field137[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field498[var16 - 1][var17 + 1] = 6;
                this.field81[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field498[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field136[var36] = var16 + 1;
                this.field137[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field498[var16 + 1][var17 + 1] = 12;
                this.field81[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field189 = 0;
        if (!var20) {
            if (arg8) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg2 - var24; var25 <= arg2 + var24; ++var25) {
                        for (int var26 = arg0 - var24; var26 <= arg0 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field81[var25][var26] < var23) {
                                var23 = this.field81[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field189 = 1;
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
        this.field136[var27] = var16;
        int var37 = var27 + 1;
        this.field137[var27] = var17;
        int var28;
        int var29 = var28 = this.field498[var16][var17];
        while (arg9 != var16 || arg11 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field136[var37] = var16;
                this.field137[var37++] = var17;
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
            var29 = this.field498[var16][var17];
        }
        if (var37 <= 0) {
            if (arg7 == 1) {
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
            int var31 = this.field136[var37];
            int var32 = this.field137[var37];
            if (arg7 == 0) {
                this.field387.method191(this.field240, 3);
                this.field387.method192(var30 + var30 + 3);
            }
            if (arg7 == 1) {
                this.field387.method191(this.field240, 234);
                this.field387.method192(var30 + var30 + 3 + 14);
            }
            if (arg7 == 2) {
                this.field387.method191(this.field240, 104);
                this.field387.method192(var30 + var30 + 3);
            }
            this.field387.method193(this.field116 + var32);
            this.field387.method226(9, this.field115 + var31);
            this.field478 = this.field136[0];
            this.field479 = this.field137[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field387.method192(this.field136[var37] - var31);
                this.field387.method220(this.field137[var37] - var32, false);
            }
            this.field387.method219(super.field32[5] == 1 ? 1 : 0, -407);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method65(int arg0) {
        this.field173.method492((byte) -56);
        class39.field1341 = this.field277;
        this.field89.method300(0, true, 0);
        if (this.field435) {
            this.field469.method473(40, 239, 0, this.field396, 6600);
            this.field469.method473(60, 239, 128, this.field266 + "*", 6600);
        } else if (this.field334 == 1) {
            this.field469.method473(40, 239, 0, "Enter amount:", 6600);
            this.field469.method473(60, 239, 128, this.field384 + "*", 6600);
        } else if (this.field334 == 2) {
            this.field469.method473(40, 239, 0, "Enter name:", 6600);
            this.field469.method473(60, 239, 128, this.field384 + "*", 6600);
        } else if (this.field69 != null) {
            this.field469.method473(40, 239, 0, this.field69, 6600);
            this.field469.method473(60, 239, 128, "Click to continue", 6600);
        } else if (this.field67 != -1) {
            this.method122(0, 481, 0, class11.method174(this.field67), 0);
        } else if (this.field138 != -1) {
            this.method122(0, 481, 0, class11.method174(this.field138), 0);
        } else {
            class47 var2 = this.field468;
            int var3 = 0;
            class20.method285(0, -749, 0, 77, 463);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field161[var4] != null) {
                    int var6 = this.field159[var4];
                    int var7 = 70 - var3 * 14 + this.field243;
                    String var8 = this.field160[var4];
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
                            var2.method477(0, this.field161[var4], 3, var7, 4);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field443 == 0 || this.field443 == 1 && this.method83((byte) -30, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field319[0].method300(var7 - 12, true, var10);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field319[1].method300(var7 - 12, true, var10);
                                var10 += 14;
                            }
                            var2.method477(0, var8 + ":", 3, var7, var10);
                            int var11 = var10 + var2.method475(var8, 0) + 8;
                            var2.method477(255, this.field161[var4], 3, var7, var11);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field235 == 0 && (var6 == 7 || this.field353 == 0 || this.field353 == 1 && this.method83((byte) -30, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method477(0, "From", 3, var7, var12);
                            int var13 = var12 + var2.method475("From ", 0);
                            if (var9 == 1) {
                                this.field319[0].method300(var7 - 12, true, var13);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field319[1].method300(var7 - 12, true, var13);
                                var13 += 14;
                            }
                            var2.method477(0, var8 + ":", 3, var7, var13);
                            int var14 = var13 + var2.method475(var8, 0) + 8;
                            var2.method477(8388608, this.field161[var4], 3, var7, var14);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field190 == 0 || this.field190 == 1 && this.method83((byte) -30, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method477(8388736, var8 + " " + this.field161[var4], 3, var7, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field235 == 0 && this.field353 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method477(8388608, this.field161[var4], 3, var7, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field235 == 0 && this.field353 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method477(0, "To " + var8 + ":", 3, var7, 4);
                            var2.method477(8388608, this.field161[var4], 3, var7, 12 + var2.method475("To " + var8, 0));
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field190 == 0 || this.field190 == 1 && this.method83((byte) -30, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method477(8270336, var8 + " " + this.field161[var4], 3, var7, 4);
                        }
                        ++var3;
                    }
                }
            }
            class20.method284(3);
            this.field444 = var3 * 14 + 7;
            if (this.field444 < 78) {
                this.field444 = 78;
            }
            this.method102(77, 463, 0, 0, this.field444 - this.field243 - 77, this.field444);
            String var5;
            if (field73 != null && field73.field625 != null) {
                var5 = field73.field625;
            } else {
                var5 = class55.method514(this.field107, -36397);
            }
            var2.method477(0, var5 + ":", 3, 90, 4);
            var2.method477(255, this.field372 + "*", 3, 90, 6 + var2.method475(var5 + ": ", 0));
            class20.method291(0, -729, 479, 0, 77);
        }
        if (this.field301 && this.field422 == 2) {
            this.method90((byte) -10);
        }
        this.field173.method493(584, 357, 17, super.field14);
        this.field172.method492((byte) -56);
        class39.field1341 = this.field279;
        if (arg0 != 0) {
            this.field162 = null;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)Z")
    public final boolean method66(byte arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field360[arg1];
            if (arg0 == 2) {
                boolean var4 = false;
            } else {
                this.field250 = this.field259.method202();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 691;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILEKHKDMUP;)Z")
    public final boolean method67(int arg0, class11 arg1) {
        int var3 = arg1.field713;
        int var4 = 91 / arg0;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field262[this.field436] = "Remove @whi@" + arg1.field693;
                this.field360[this.field436] = 266;
                ++this.field436;
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
            this.field262[this.field436] = "Remove @whi@" + this.field209[var3];
            this.field360[this.field436] = 739;
            ++this.field436;
            this.field262[this.field436] = "Message @whi@" + this.field209[var3];
            this.field360[this.field436] = 633;
            ++this.field436;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method68(int arg0) {
        while (arg0 >= 0) {
            this.field250 = this.field259.method202();
        }
        if (super.field28 == 1) {
            if (super.field29 >= 6 && super.field29 <= 106 && super.field30 >= 467 && super.field30 <= 499) {
                this.field443 = (this.field443 + 1) % 4;
                this.field281 = true;
                this.field343 = true;
                this.field387.method191(this.field240, 198);
                this.field387.method192(this.field443);
                this.field387.method192(this.field353);
                this.field387.method192(this.field190);
            }
            if (super.field29 >= 135 && super.field29 <= 235 && super.field30 >= 467 && super.field30 <= 499) {
                this.field353 = (this.field353 + 1) % 3;
                this.field281 = true;
                this.field343 = true;
                this.field387.method191(this.field240, 198);
                this.field387.method192(this.field443);
                this.field387.method192(this.field353);
                this.field387.method192(this.field190);
            }
            if (super.field29 >= 273 && super.field29 <= 373 && super.field30 >= 467 && super.field30 <= 499) {
                this.field190 = (this.field190 + 1) % 3;
                this.field281 = true;
                this.field343 = true;
                this.field387.method191(this.field240, 198);
                this.field387.method192(this.field443);
                this.field387.method192(this.field353);
                this.field387.method192(this.field190);
            }
            if (super.field29 >= 412 && super.field29 <= 512 && super.field30 >= 467 && super.field30 <= 499) {
                if (this.field78 == -1) {
                    this.method154(0);
                    this.field82 = "";
                    this.field148 = false;
                    this.field90 = this.field78 = class11.field699;
                } else {
                    this.method31("", true, "Please close the interface you have open before using 'report abuse'", 0);
                }
            }
            ++field220;
            if (field220 > 92) {
                field220 = 0;
                this.field387.method191(this.field240, 43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class13 var11 = null;
        for (class13 var12 = (class13) this.field255.method519(); var12 != null; var12 = (class13) this.field255.method521(5)) {
            if (var12.field746 == arg1 && var12.field748 == arg3 && var12.field749 == arg7 && var12.field747 == arg2) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class13();
            var11.field746 = arg1;
            var11.field747 = arg2;
            var11.field748 = arg3;
            var11.field749 = arg7;
            this.method137(this.field135, var11);
            this.field255.method516(var11);
        }
        var11.field742 = arg6;
        var11.field744 = arg8;
        var11.field743 = arg9;
        var11.field745 = arg4;
        var11.field741 = arg0;
        if (arg5 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method70(boolean arg0, byte arg1) {
        if (arg1 == -59) {
            for (int var3 = 0; var3 < this.field406; ++var3) {
                class24 var4 = this.field405[this.field407[var3]];
                int var5 = (this.field407[var3] << 14) + 536870912;
                if (var4 != null && var4.method169(-528) && var4.field987.field589 == arg0 && var4.field987.method161(21262)) {
                    int var6 = var4.field844 >> 7;
                    int var7 = var4.field845 >> 7;
                    if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                        if (var4.field856 == 1 && (var4.field844 & 127) == 64 && (var4.field845 & 127) == 64) {
                            if (this.field155[var6][var7] == this.field80) {
                                continue;
                            }
                            this.field155[var6][var7] = this.field80;
                        }
                        if (!var4.field987.field560) {
                            var5 += Integer.MIN_VALUE;
                        }
                        this.field239.method320(var4, var4.field844, var4.field845, var5, this.method34(var4.field845, 215, this.field105, var4.field844), var4.field830, (var4.field856 - 1) * 64 + 60, this.field354, var4.field846, this.field105);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 345);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field273 = Integer.parseInt(arg0[0]);
                field274 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method71(694);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method146(false);
                }
                if (arg0[3].equals("free")) {
                    field275 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field275 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(765, 503, field344);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public static final void method71(int arg0) {
        class27.field1015 = true;
        int var1 = 56 / arg0;
        class39.field1330 = true;
        field276 = true;
        class36.field1287 = true;
        class28.field1104 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method72(int arg0, boolean arg1) {
        int[] var3 = this.field480.field1155;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field439[arg0][var24][var6] & 24) == 0) {
                    this.field239.method344(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field439[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field239.method344(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field480.method371((byte) -56);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field439[arg0][var22][var9] & 24) == 0) {
                    this.method58(var8, var7, var9, var22, -20742, arg0);
                }
                if (arg0 < 3 && (this.field439[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method58(var8, var7, var9, var22, -20742, arg0 + 1);
                }
            }
        }
        if (this.field172 != null) {
            this.field172.method492((byte) -56);
            class39.field1341 = this.field279;
        }
        this.field316 = 0;
        if (!arg1) {
            this.field387.method192(152);
        }
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field239.method338(this.field105, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class28.method365(var13).field1120;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field260[this.field105].field1625;
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
                        this.field256[this.field316] = this.field68[var14];
                        this.field317[this.field316] = var15;
                        this.field318[this.field316] = var16;
                        ++this.field316;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method73(int arg0) {
        try {
            this.field403 = -1;
            this.field373.method523();
            this.field391.method523();
            class39.method450((byte) 3);
            this.method30(1);
            this.field239.method309(8);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field260[var2].method537();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field439[var3][var4][var5] = 0;
                    }
                }
            }
            class36 var6 = new class36(this.field439, 0, this.field72, 104, 104);
            int var7 = this.field267.length;
            this.field387.method191(this.field240, 135);
            if (!this.field191) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field291[var8] >> 8) * 64 - this.field115;
                    int var10 = (this.field291[var8] & 255) * 64 - this.field116;
                    byte[] var11 = this.field267[var8];
                    if (var11 != null) {
                        var6.method421((this.field179 - 6) * 8, false, (this.field178 - 6) * 8, this.field260, var9, var10, var11);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field291[var12] >> 8) * 64 - this.field115;
                    int var14 = (this.field291[var12] & 255) * 64 - this.field116;
                    byte[] var15 = this.field267[var12];
                    if (var15 == null && this.field179 < 800) {
                        var6.method423(var13, -5656, 64, 64, var14);
                    }
                }
                this.field387.method191(this.field240, 135);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field60[var16];
                    if (var17 != null) {
                        int var18 = (this.field291[var16] >> 8) * 64 - this.field115;
                        int var19 = (this.field291[var16] & 255) * 64 - this.field116;
                        var6.method419(var19, 6769, this.field260, var17, this.field239, var18);
                    }
                }
            }
            if (this.field191) {
                int var20 = 0;
                label256: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field357[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method423(var30 * 8, -5656, 8, 8, var31 * 8);
                                }
                            }
                        }
                        this.field387.method191(this.field240, 135);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label256;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field357[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field291.length; ++var42) {
                                            if (this.field291[var42] == var41 && this.field60[var42] != null) {
                                                var6.method420(this.field260, var38, 527, (var39 & 7) * 8, (var40 & 7) * 8, var34 * 8, var33, this.field239, var35 * 8, var37, this.field60[var42]);
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
                            int var23 = this.field357[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field291.length; ++var29) {
                                    if (this.field291[var29] == var28 && this.field267[var29] != null) {
                                        var6.method418(var22 * 8, -585, var21 * 8, (var26 & 7) * 8, this.field260, (var27 & 7) * 8, var20, var24, this.field267[var29], var25);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field387.method191(this.field240, 135);
            var6.method417(this.field239, (byte) 107, this.field260);
            if (this.field172 != null) {
                this.field172.method492((byte) -56);
                class39.field1341 = this.field279;
            }
            this.field387.method191(this.field240, 135);
            int var43 = class36.field1288;
            if (var43 > this.field105) {
                var43 = this.field105;
            }
            if (var43 < this.field105 - 1) {
                int var44 = this.field105 - 1;
            }
            if (field276) {
                this.field239.method310(class36.field1288, 120);
            } else {
                this.field239.method310(0, 120);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method134(var45, var46);
                }
            }
            ++field322;
            if (field322 > 55) {
                field322 = 0;
                this.field387.method191(this.field240, 124);
            }
            this.method56(-889);
        } catch (Exception var59) {
        }
        class28.field1102.method509();
        if (super.field17 != null) {
            this.field387.method191(this.field240, 158);
            this.field387.method196(1057001181);
        }
        if (field276 && signlink.cache_dat != null) {
            int var48 = this.field83.method563(0, 171);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field83.method562(var49, 453);
                if ((var50 & 121) == 0) {
                    class35.method390(var49, -620);
                }
            }
        }
        System.gc();
        if (arg0 == 4) {
            class39.method451(-290, 20);
            this.field83.method570(-984);
            int var51 = (this.field178 - 6) / 8 - 1;
            int var52 = (this.field178 + 6) / 8 + 1;
            int var53 = (this.field179 - 6) / 8 - 1;
            int var54 = (this.field179 + 6) / 8 + 1;
            if (this.field517) {
                var51 = 49;
                var52 = 50;
                var53 = 49;
                var54 = 50;
            }
            for (int var55 = var51; var55 <= var52; ++var55) {
                for (int var56 = var53; var56 <= var54; ++var56) {
                    if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                        int var57 = this.field83.method561(var56, field527, var55, 0);
                        if (var57 != -1) {
                            this.field83.method577(var57, 3, this.field77);
                        }
                        int var58 = this.field83.method561(var56, field527, var55, 1);
                        if (var58 != -1) {
                            this.field83.method577(var58, 3, this.field77);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method74(boolean arg0) {
        if (this.field253 > 0) {
            this.method76(false);
        } else {
            this.method77("Connection lost", -284, "Please wait - attempting to reestablish");
            this.field237 = 0;
            this.field478 = 0;
            class69 var2 = this.field132;
            this.field238 = false;
            if (arg0) {
                this.field99 = 0;
                this.method152(this.field107, this.field108, true);
                if (!this.field238) {
                    this.method76(false);
                }
                try {
                    var2.method583();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLDDJHHGTJ;III)V")
    public final void method75(byte arg0, class6 arg1, int arg2, int arg3, int arg4) {
        if (this.field436 < 400) {
            if (arg1.field583 != null) {
                arg1 = arg1.method164(46311);
            }
            if (arg1 != null) {
                if (arg1.field560) {
                    String var6 = arg1.field591;
                    if (arg0 == 1) {
                        if (arg1.field586 != 0) {
                            var6 = var6 + method147(854, field73.field643, arg1.field586) + " (level-" + arg1.field586 + ")";
                        }
                        if (this.field502 == 1) {
                            this.field262[this.field436] = "Use " + this.field506 + " with @yel@" + var6;
                            this.field360[this.field436] = 237;
                            this.field361[this.field436] = arg2;
                            this.field358[this.field436] = arg4;
                            this.field359[this.field436] = arg3;
                            ++this.field436;
                        } else {
                            if (this.field376 == 1) {
                                if ((this.field378 & 2) == 2) {
                                    this.field262[this.field436] = this.field379 + " @yel@" + var6;
                                    this.field360[this.field436] = 893;
                                    this.field361[this.field436] = arg2;
                                    this.field358[this.field436] = arg4;
                                    this.field359[this.field436] = arg3;
                                    ++this.field436;
                                    return;
                                }
                            } else {
                                if (arg1.field559 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (arg1.field559[var7] != null && !arg1.field559[var7].equalsIgnoreCase("attack")) {
                                            this.field262[this.field436] = arg1.field559[var7] + " @yel@" + var6;
                                            if (var7 == 0) {
                                                this.field360[this.field436] = 886;
                                            }
                                            if (var7 == 1) {
                                                this.field360[this.field436] = 645;
                                            }
                                            if (var7 == 2) {
                                                this.field360[this.field436] = 723;
                                            }
                                            if (var7 == 3) {
                                                this.field360[this.field436] = 667;
                                            }
                                            if (var7 == 4) {
                                                this.field360[this.field436] = 423;
                                            }
                                            this.field361[this.field436] = arg2;
                                            this.field358[this.field436] = arg4;
                                            this.field359[this.field436] = arg3;
                                            ++this.field436;
                                        }
                                    }
                                }
                                if (arg1.field559 != null) {
                                    for (int var8 = 4; var8 >= 0; --var8) {
                                        if (arg1.field559[var8] != null && arg1.field559[var8].equalsIgnoreCase("attack")) {
                                            short var9 = 0;
                                            if (arg1.field586 > field73.field643) {
                                                var9 = 2000;
                                            }
                                            this.field262[this.field436] = arg1.field559[var8] + " @yel@" + var6;
                                            if (var8 == 0) {
                                                this.field360[this.field436] = var9 + 886;
                                            }
                                            if (var8 == 1) {
                                                this.field360[this.field436] = var9 + 645;
                                            }
                                            if (var8 == 2) {
                                                this.field360[this.field436] = var9 + 723;
                                            }
                                            if (var8 == 3) {
                                                this.field360[this.field436] = var9 + 667;
                                            }
                                            if (var8 == 4) {
                                                this.field360[this.field436] = var9 + 423;
                                            }
                                            this.field361[this.field436] = arg2;
                                            this.field358[this.field436] = arg4;
                                            this.field359[this.field436] = arg3;
                                            ++this.field436;
                                        }
                                    }
                                }
                                this.field262[this.field436] = "Examine @yel@" + var6;
                                this.field360[this.field436] = 1892;
                                this.field361[this.field436] = arg2;
                                this.field358[this.field436] = arg4;
                                this.field359[this.field436] = arg3;
                                ++this.field436;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method76(boolean arg0) {
        try {
            if (this.field132 != null) {
                this.field132.method583();
            }
        } catch (Exception var3) {
        }
        this.field132 = null;
        this.field238 = false;
        this.field176 = 0;
        if (arg0) {
            this.field162 = null;
        }
        this.field107 = "";
        this.field108 = "";
        this.method30(1);
        this.field239.method309(8);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field260[var2].method537();
        }
        System.gc();
        this.method41(-557);
        this.field98 = -1;
        this.field408 = -1;
        this.field400 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method77(String arg0, int arg1, String arg2) {
        while (arg1 >= 0) {
            this.field250 = this.field259.method202();
        }
        if (this.field172 != null) {
            this.field172.method492((byte) -56);
            class39.field1341 = this.field279;
            int var4 = 151;
            if (arg2 != null) {
                var4 -= 7;
            }
            this.field468.method473(var4, 257, 0, arg0, 6600);
            this.field468.method473(var4 - 1, 256, 16777215, arg0, 6600);
            var4 += 15;
            if (arg2 != null) {
                this.field468.method473(var4, 257, 0, arg2, 6600);
                this.field468.method473(var4 - 1, 256, 16777215, arg2, 6600);
            }
            this.field172.method493(584, 4, 4, super.field14);
        } else if (super.field15 != null) {
            super.field15.method492((byte) -56);
            class39.field1341 = this.field280;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class20.method288(383 - var6 / 2, 0, var5 - 5 - var7 / 2, var6, 0, var7);
            class20.method289(383 - var6 / 2, var6, var5 - 5 - var7 / 2, 16777215, 0, var7);
            if (arg2 != null) {
                var5 -= 7;
            }
            this.field468.method473(var5, 383, 0, arg0, 6600);
            this.field468.method473(var5 - 1, 382, 16777215, arg0, 6600);
            var5 += 15;
            if (arg2 != null) {
                this.field468.method473(var5, 383, 0, arg2, 6600);
                this.field468.method473(var5 - 1, 382, 16777215, arg2, 6600);
            }
            super.field15.method493(584, 0, 0, super.field14);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
            while (true) {
                class45 var3 = this.field83.method557();
                if (var3 == null) {
                    return;
                }
                if (var3.field1421 == 0) {
                    class35.method389(var3.field1419, var3.field1420, false);
                    if ((this.field83.method562(var3.field1419, 453) & 98) != 0) {
                        this.field431 = true;
                        if (this.field67 != -1 || this.field138 != -1) {
                            this.field343 = true;
                        }
                    }
                }
                if (var3.field1421 == 1 && var3.field1420 != null) {
                    class68.method579(var3.field1420, -373);
                }
                if (var3.field1421 == 2 && this.field408 == var3.field1419 && var3.field1420 != null) {
                    this.method36(var3.field1420, -953, this.field409);
                }
                if (var3.field1421 == 3 && this.field142 == 1) {
                    for (int var4 = 0; var4 < this.field267.length; ++var4) {
                        if (this.field292[var4] == var3.field1419) {
                            this.field267[var4] = var3.field1420;
                            if (var3.field1420 == null) {
                                this.field292[var4] = -1;
                            }
                            break;
                        }
                        if (this.field293[var4] == var3.field1419) {
                            this.field60[var4] = var3.field1420;
                            if (var3.field1420 == null) {
                                this.field293[var4] = -1;
                            }
                            break;
                        }
                    }
                }
                if (var3.field1421 == 93 && this.field83.method567(var3.field1419, this.field163)) {
                    class36.method436(true, this.field83, new class14(-527, var3.field1420));
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method79(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg0 != -36645) {
            this.field162 = null;
        }
        class11 var5 = class11.method174(arg2);
        for (int var6 = 0; var6 < var5.field659.length && var5.field659[var6] != -1; ++var6) {
            class11 var7 = class11.method174(var5.field659[var6]);
            if (var7.field707 == 1) {
                var4 |= this.method79(this.field194, arg1, var7.field714);
            }
            if (var7.field707 == 6 && (var7.field657 != -1 || var7.field658 != -1)) {
                boolean var8 = this.method24(3, var7);
                int var9;
                if (var8) {
                    var9 = var7.field658;
                } else {
                    var9 = var7.field657;
                }
                if (var9 != -1) {
                    class58 var10 = class58.field1560[var9];
                    var7.field704 += arg1;
                    while (var7.field704 > var10.method525(0, var7.field726)) {
                        var7.field704 -= var10.method525(0, var7.field726) + 1;
                        ++var7.field726;
                        if (var7.field726 >= var10.field1561) {
                            var7.field726 -= var10.field1565;
                            if (var7.field726 < 0 || var7.field726 >= var10.field1561) {
                                var7.field726 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field707 == 6 && var7.field656 != 0) {
                int var11 = var7.field656 >> 16;
                int var12 = var7.field656 << 16 >> 16;
                int var13 = arg1 * var11;
                int var14 = arg1 * var12;
                var7.field695 = var7.field695 + var13 & 2047;
                var7.field696 = var7.field696 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BZ)Z")
    public final boolean method80(int arg0, byte[] arg1, boolean arg2) {
        this.field238 &= arg2;
        return arg1 == null ? true : signlink.wavesave(arg1, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)V")
    public final void method81(int arg0, int arg1, byte arg2) {
        int var4 = 0;
        if (this.field456 == arg2) {
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field161[var5] != null) {
                    int var6 = this.field159[var5];
                    int var7 = 70 - var4 * 14 + this.field243 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field160[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field443 == 0 || this.field443 == 1 && this.method83((byte) -30, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field73.field625)) {
                            if (this.field528 >= 1) {
                                this.field262[this.field436] = "Report abuse @whi@" + var8;
                                this.field360[this.field436] = 279;
                                ++this.field436;
                            }
                            this.field262[this.field436] = "Add ignore @whi@" + var8;
                            this.field360[this.field436] = 275;
                            ++this.field436;
                            this.field262[this.field436] = "Add friend @whi@" + var8;
                            this.field360[this.field436] = 691;
                            ++this.field436;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field235 == 0 && (var6 == 7 || this.field353 == 0 || this.field353 == 1 && this.method83((byte) -30, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            if (this.field528 >= 1) {
                                this.field262[this.field436] = "Report abuse @whi@" + var8;
                                this.field360[this.field436] = 279;
                                ++this.field436;
                            }
                            this.field262[this.field436] = "Add ignore @whi@" + var8;
                            this.field360[this.field436] = 275;
                            ++this.field436;
                            this.field262[this.field436] = "Add friend @whi@" + var8;
                            this.field360[this.field436] = 691;
                            ++this.field436;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field190 == 0 || this.field190 == 1 && this.method83((byte) -30, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field262[this.field436] = "Accept trade @whi@" + var8;
                            this.field360[this.field436] = 532;
                            ++this.field436;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field235 == 0 && this.field353 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field190 == 0 || this.field190 == 1 && this.method83((byte) -30, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field262[this.field436] = "Accept challenge @whi@" + var8;
                            this.field360[this.field436] = 938;
                            ++this.field436;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method82(int arg0) {
        byte[] var2 = this.field466.method168("title.dat", (byte[]) null);
        class31 var3 = new class31(var2, this);
        this.field305.method492((byte) -56);
        var3.method374(0, 0, 859);
        this.field306.method492((byte) -56);
        var3.method374(0, -637, 859);
        this.field302.method492((byte) -56);
        var3.method374(0, -128, 859);
        this.field303.method492((byte) -56);
        var3.method374(-371, -202, 859);
        this.field304.method492((byte) -56);
        var3.method374(-171, -202, 859);
        this.field307.method492((byte) -56);
        var3.method374(-265, 0, 859);
        this.field308.method492((byte) -56);
        var3.method374(-265, -562, 859);
        this.field309.method492((byte) -56);
        var3.method374(-171, -128, 859);
        this.field310.method492((byte) -56);
        var3.method374(-171, -562, 859);
        int[] var4 = new int[var3.field1156];
        for (int var5 = 0; var5 < var3.field1157; ++var5) {
            for (int var10 = 0; var10 < var3.field1156; ++var10) {
                var4[var10] = var3.field1155[var3.field1156 * var5 + (var3.field1156 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1156; ++var11) {
                var3.field1155[var3.field1156 * var5 + var11] = var4[var11];
            }
        }
        this.field305.method492((byte) -56);
        var3.method374(0, 382, 859);
        this.field306.method492((byte) -56);
        var3.method374(0, -255, 859);
        this.field302.method492((byte) -56);
        var3.method374(0, 254, 859);
        this.field303.method492((byte) -56);
        var3.method374(-371, 180, 859);
        this.field304.method492((byte) -56);
        var3.method374(-171, 180, 859);
        this.field307.method492((byte) -56);
        var3.method374(-265, 382, 859);
        this.field308.method492((byte) -56);
        var3.method374(-265, -180, 859);
        this.field309.method492((byte) -56);
        var3.method374(-171, 254, 859);
        this.field310.method492((byte) -56);
        var3.method374(-171, -180, 859);
        class31 var6 = new class31(this.field466, "logo", 0);
        this.field302.method492((byte) -56);
        var6.method376(18, true, 382 - var6.field1156 / 2 - 128);
        Object var7 = null;
        if (arg0 <= 0) {
            field531 = this.field92.method533();
        }
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method83(byte arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field263; ++var3) {
                if (arg1.equalsIgnoreCase(this.field209[var3])) {
                    return true;
                }
            }
            if (arg0 != -30) {
                field85 = !field85;
            }
            return arg1.equalsIgnoreCase(field73.field625);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEKHKDMUP;B)Z")
    public final boolean method84(class11 arg0, byte arg1) {
        int var3 = arg0.field713;
        if (arg1 != -127) {
            this.field250 = -1;
        }
        if (this.field264 == 2) {
            if (var3 == 201) {
                this.field343 = true;
                this.field334 = 0;
                this.field435 = true;
                this.field266 = "";
                this.field329 = 1;
                this.field396 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field343 = true;
                this.field334 = 0;
                this.field435 = true;
                this.field266 = "";
                this.field329 = 2;
                this.field396 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field253 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field343 = true;
                this.field334 = 0;
                this.field435 = true;
                this.field266 = "";
                this.field329 = 4;
                this.field396 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field343 = true;
                this.field334 = 0;
                this.field435 = true;
                this.field266 = "";
                this.field329 = 5;
                this.field396 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field386[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class12.field730 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class12.field730) {
                                var6 = 0;
                            }
                        }
                        if (!class12.field731[var6].field737 && class12.field731[var6].field732 == var4 + (this.field401 ? 0 : 7)) {
                            this.field386[var4] = var6;
                            this.field183 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field225[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field501[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field501[var7].length) {
                        var9 = 0;
                    }
                }
                this.field225[var7] = var9;
                this.field183 = true;
            }
            if (var3 == 324 && !this.field401) {
                this.field401 = true;
                this.method45(-194);
            }
            if (var3 == 325 && this.field401) {
                this.field401 = false;
                this.method45(-194);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field148 = !this.field148;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method154(0);
                    if (this.field82.length() > 0) {
                        this.field387.method191(this.field240, 195);
                        this.field387.method198(class55.method510(this.field82), 0);
                        this.field387.method192(var3 - 601);
                        this.field387.method192(this.field148 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field387.method191(this.field240, 25);
                this.field387.method192(this.field401 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field387.method192(this.field386[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field387.method192(this.field225[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILGHHPHSRU;)V")
    private final void method85(int arg0, int arg1, class14 arg2) {
        if (arg1 <= 0) {
            this.field314 = !this.field314;
        }
        this.field476 = 0;
        this.field453 = 0;
        this.method27(arg2, 0, arg0);
        this.method118(arg2, arg0, this.field195);
        this.method148(true, arg0, arg2);
        this.method143(arg2, arg0, 515);
        for (int var4 = 0; var4 < this.field476; ++var4) {
            int var6 = this.field477[var4];
            if (field419 != this.field450[var6].field855) {
                this.field450[var6] = null;
            }
        }
        if (arg2.field769 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field769 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field451; ++var5) {
                if (this.field450[this.field452[var5]] == null) {
                    signlink.reporterror(this.field107 + " null entry in pl list - pos:" + var5 + " size:" + this.field451);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method86(int arg0) {
        this.field71 = false;
        while (this.field375) {
            this.field71 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field167 = null;
        this.field168 = null;
        this.field522 = null;
        this.field63 = null;
        this.field64 = null;
        this.field65 = null;
        this.field66 = null;
        this.field217 = null;
        this.field218 = null;
        this.field380 = null;
        this.field249 += arg0;
        this.field381 = null;
        this.field247 = null;
        this.field248 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEJJAKGTE;IIII)V")
    public final void method87(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= 0) {
            this.field246 = 85;
        }
        if (field73 != arg0) {
            if (this.field436 < 400) {
                String var6;
                if (arg0.field617 == 0) {
                    var6 = arg0.field625 + method147(854, field73.field643, arg0.field643) + " (level-" + arg0.field643 + ")";
                } else {
                    var6 = arg0.field625 + " (skill-" + arg0.field617 + ")";
                }
                if (this.field502 == 1) {
                    this.field262[this.field436] = "Use " + this.field506 + " with @whi@" + var6;
                    this.field360[this.field436] = 395;
                    this.field361[this.field436] = arg2;
                    this.field358[this.field436] = arg1;
                    this.field359[this.field436] = arg4;
                    ++this.field436;
                } else if (this.field376 == 1) {
                    if ((this.field378 & 8) == 8) {
                        this.field262[this.field436] = this.field379 + " @whi@" + var6;
                        this.field360[this.field436] = 681;
                        this.field361[this.field436] = arg2;
                        this.field358[this.field436] = arg1;
                        this.field359[this.field436] = arg4;
                        ++this.field436;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field146[var7] != null) {
                            this.field262[this.field436] = this.field146[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field146[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field643 > field73.field643) {
                                    var9 = 2000;
                                }
                                if (field73.field623 != 0 && arg0.field623 != 0) {
                                    if (field73.field623 == arg0.field623) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field147[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field360[this.field436] = var9 + 134;
                            }
                            if (var7 == 1) {
                                this.field360[this.field436] = var9 + 473;
                            }
                            if (var7 == 2) {
                                this.field360[this.field436] = var9 + 261;
                            }
                            if (var7 == 3) {
                                this.field360[this.field436] = var9 + 554;
                            }
                            if (var7 == 4) {
                                this.field360[this.field436] = var9 + 778;
                            }
                            this.field361[this.field436] = arg2;
                            this.field358[this.field436] = arg1;
                            this.field359[this.field436] = arg4;
                            ++this.field436;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field436; ++var8) {
                    if (this.field360[var8] == 506) {
                        this.field262[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 == 5) {
            if (arg5 >= 1 && arg4 >= 1 && arg5 <= 102 && arg4 <= 102) {
                if (field276 && this.field105 != arg3) {
                    return;
                }
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = false;
                boolean var12 = false;
                if (arg0 == 0) {
                    var9 = this.field239.method335(arg3, arg5, arg4);
                }
                if (arg0 == 1) {
                    var9 = this.field239.method336(arg3, (byte) 70, arg4, arg5);
                }
                if (arg0 == 2) {
                    var9 = this.field239.method337(arg3, arg5, arg4);
                }
                if (arg0 == 3) {
                    var9 = this.field239.method338(arg3, arg5, arg4);
                }
                if (var9 != 0) {
                    int var13 = this.field239.method339(arg3, arg5, arg4, var9);
                    int var14 = var9 >> 14 & 32767;
                    int var15 = var13 & 31;
                    int var16 = var13 >> 6;
                    if (arg0 == 0) {
                        this.field239.method326(arg4, arg5, true, arg3);
                        class28 var17 = class28.method365(var14);
                        if (var17.field1083) {
                            this.field260[arg3].method542(arg4, var15, var16, arg5, -913, var17.field1105);
                        }
                    }
                    if (arg0 == 1) {
                        this.field239.method327(arg3, arg5, arg4, (byte) 2);
                    }
                    if (arg0 == 2) {
                        this.field239.method328(arg3, arg4, true, arg5);
                        class28 var18 = class28.method365(var14);
                        if (var18.field1131 + arg5 > 103 || var18.field1131 + arg4 > 103 || var18.field1125 + arg5 > 103 || var18.field1125 + arg4 > 103) {
                            return;
                        }
                        if (var18.field1083) {
                            this.field260[arg3].method543(arg5, arg4, var16, var18.field1105, var18.field1125, this.field413, var18.field1131);
                        }
                    }
                    if (arg0 == 3) {
                        this.field239.method329(arg5, 0, arg4, arg3);
                        class28 var19 = class28.method365(var14);
                        if (var19.field1083 && var19.field1093) {
                            this.field260[arg3].method545(arg4, arg5, 49740);
                        }
                    }
                }
                if (arg1 >= 0) {
                    int var20 = arg3;
                    if (arg3 < 3 && (this.field439[1][arg5][arg4] & 2) == 2) {
                        var20 = arg3 + 1;
                    }
                    class36.method425(arg6, this.field239, this.field72, arg1, this.field221, this.field260[arg3], arg4, arg2, arg5, arg3, var20);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBIILEKHKDMUP;III)V")
    public final void method89(int arg0, int arg1, byte arg2, int arg3, int arg4, class11 arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 43) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
        if (this.field272) {
            this.field430 = 32;
        } else {
            this.field430 = 0;
        }
        this.field272 = false;
        if (arg8 >= arg4 && arg8 < arg4 + 16 && arg6 >= arg7 && arg6 < arg7 + 16) {
            arg5.field674 -= this.field288 * 4;
            if (arg1 == 1) {
                this.field431 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                this.field343 = true;
            }
        } else if (arg8 >= arg4 && arg8 < arg4 + 16 && arg6 >= arg3 + arg7 - 16 && arg6 < arg3 + arg7) {
            arg5.field674 += this.field288 * 4;
            if (arg1 == 1) {
                this.field431 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                this.field343 = true;
            }
        } else if (arg8 >= arg4 - this.field430 && arg8 < arg4 + 16 + this.field430 && arg6 >= arg7 + 16 && arg6 < arg3 + arg7 - 16 && this.field288 > 0) {
            int var11 = (arg3 - 32) * arg3 / arg0;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg6 - arg7 - 16 - var11 / 2;
            int var13 = arg3 - 32 - var11;
            arg5.field674 = (arg0 - arg3) * var12 / var13;
            if (arg1 == 1) {
                this.field431 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                this.field343 = true;
            }
            this.field272 = true;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method90(byte arg0) {
        int var2 = this.field423;
        int var3 = this.field424;
        int var4 = this.field425;
        int var5 = this.field426;
        int var6 = 6116423;
        class20.method288(var2, 0, var3, var4, var6, var5);
        class20.method288(var2 + 1, 0, var3 + 1, var4 - 2, 0, 16);
        class20.method289(var2 + 1, var4 - 2, var3 + 18, 0, 0, var5 - 19);
        if (this.field282 != arg0) {
            this.field250 = -1;
        }
        this.field469.method477(var6, "Choose Option", 3, var3 + 14, var2 + 3);
        int var7 = super.field22;
        int var8 = super.field23;
        if (this.field422 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field422 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field422 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field436; ++var9) {
            int var10 = (this.field436 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field469.method481(var2 + 3, this.field262[var9], var11, var10, true, false);
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method91(int arg0) {
        int var2 = 5;
        this.field538[8] = 0;
        while (arg0 >= 0) {
            field344 = 367;
        }
        int var3 = 0;
        while (this.field538[8] == 0) {
            String var4 = "Unknown problem";
            this.method13(20, field85, "Connecting to web server");
            try {
                DataInputStream var5 = this.method63("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 345);
                class14 var6 = new class14(-527, new byte[40]);
                var5.readFully(var6.field768, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field538[var7] = var6.method207();
                }
                int var8 = var6.method207();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field538[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field538[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field538[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field538[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field538[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field538[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method13(10, field85, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method13(10, field85, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field86 = !this.field86;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method92(int arg0, int arg1) {
        int var3 = 24 / arg1;
        class11.method183(arg0, 15);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method93(byte arg0) {
        if (arg0 == 126) {
            ++this.field80;
            this.method106(true, true);
            this.method70(true, (byte) -59);
            this.method106(false, true);
            this.method70(false, (byte) -59);
            this.method95((byte) 4);
            this.method51(this.field314);
            if (!this.field399) {
                int var2 = this.field483;
                if (this.field339 / 256 > var2) {
                    var2 = this.field339 / 256;
                }
                if (this.field236[4] && this.field97[4] + 128 > var2) {
                    var2 = this.field97[4] + 128;
                }
                int var3 = this.field484 + this.field432 & 2047;
                this.method50(var3, true, this.method34(field73.field845, 215, this.field105, field73.field844) - 50, this.field393, var2 * 3 + 600, var2, this.field392);
            }
            int var4;
            if (!this.field399) {
                var4 = this.method46(false);
            } else {
                var4 = this.method47(35713);
            }
            int var5 = this.field324;
            int var6 = this.field325;
            int var7 = this.field326;
            int var8 = this.field327;
            int var9 = this.field328;
            for (int var10 = 0; var10 < 5; ++var10) {
                if (this.field236[var10]) {
                    int var12 = (int) (Math.random() * (double) (this.field222[var10] * 2 + 1) - (double) this.field222[var10] + Math.sin((double) this.field258[var10] / 100.0D * (double) this.field336[var10]) * (double) this.field97[var10]);
                    if (var10 == 0) {
                        this.field324 += var12;
                    }
                    if (var10 == 1) {
                        this.field325 += var12;
                    }
                    if (var10 == 2) {
                        this.field326 += var12;
                    }
                    if (var10 == 3) {
                        this.field328 = this.field328 + var12 & 2047;
                    }
                    if (var10 == 4) {
                        this.field327 += var12;
                        if (this.field327 < 128) {
                            this.field327 = 128;
                        }
                        if (this.field327 > 383) {
                            this.field327 = 383;
                        }
                    }
                }
            }
            int var11 = class39.field1350;
            class35.field1264 = true;
            class35.field1267 = 0;
            class35.field1265 = super.field22 - 4;
            class35.field1266 = super.field23 - 4;
            class20.method286(0);
            this.field239.method348(-451, this.field325, this.field328, this.field326, var4, this.field327, this.field324);
            this.field239.method323(false);
            this.method53(true);
            this.method145((byte) 72);
            this.method43(this.field268, var11);
            this.method151(true);
            this.field172.method493(584, 4, 4, super.field14);
            this.field324 = var5;
            this.field325 = var6;
            this.field326 = var7;
            this.field327 = var8;
            this.field328 = var9;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method94(boolean arg0, boolean arg1) {
        this.method20((byte) 51);
        this.field304.method492((byte) -56);
        this.field167.method300(0, true, 0);
        short var3 = 360;
        short var4 = 200;
        if (arg0) {
            this.field442 = 441;
        }
        if (this.field176 == 0) {
            int var5 = var4 / 2 + 80;
            this.field467.method474(true, 7711145, 0, var5, this.field83.field1660, var3 / 2);
            int var6 = var4 / 2 - 20;
            this.field469.method474(true, 16776960, 0, var6, "Welcome to RuneScape", var3 / 2);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field168.method300(var8 - 20, true, var7 - 73);
            this.field469.method474(true, 16777215, 0, var8 + 5, "New User", var7);
            int var9 = var3 / 2 + 80;
            this.field168.method300(var8 - 20, true, var9 - 73);
            this.field469.method474(true, 16777215, 0, var8 + 5, "Existing User", var9);
        }
        if (this.field176 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field330.length() > 0) {
                this.field469.method474(true, 16776960, 0, var10 - 15, this.field330, var3 / 2);
                this.field469.method474(true, 16776960, 0, var10, this.field331, var3 / 2);
                var10 += 30;
            } else {
                this.field469.method474(true, 16776960, 0, var10 - 7, this.field331, var3 / 2);
                var10 += 30;
            }
            this.field469.method481(var3 / 2 - 90, "Username: " + this.field107 + (this.field320 == 0 & field419 % 40 < 20 ? "@yel@|" : ""), 16777215, var10, true, false);
            var10 += 15;
            this.field469.method481(var3 / 2 - 88, "Password: " + class55.method515(47641, this.field108) + (this.field320 == 1 & field419 % 40 < 20 ? "@yel@|" : ""), 16777215, var10, true, false);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field168.method300(var12 - 20, true, var11 - 73);
                this.field469.method474(true, 16777215, 0, var12 + 5, "Login", var11);
                int var13 = var3 / 2 + 80;
                this.field168.method300(var12 - 20, true, var13 - 73);
                this.field469.method474(true, 16777215, 0, var12 + 5, "Cancel", var13);
            }
        }
        if (this.field176 == 3) {
            this.field469.method474(true, 16776960, 0, var4 / 2 - 60, "Create a free account", var3 / 2);
            int var14 = var4 / 2 - 35;
            this.field469.method474(true, 16777215, 0, var14, "To create a new account you need to", var3 / 2);
            int var18 = var14 + 15;
            this.field469.method474(true, 16777215, 0, var18, "go back to the main RuneScape webpage", var3 / 2);
            int var19 = var18 + 15;
            this.field469.method474(true, 16777215, 0, var19, "and choose the 'create account'", var3 / 2);
            int var20 = var19 + 15;
            this.field469.method474(true, 16777215, 0, var20, "button near the top of that page.", var3 / 2);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field168.method300(var16 - 20, true, var15 - 73);
            this.field469.method474(true, 16777215, 0, var16 + 5, "Cancel", var15);
        }
        this.field304.method493(584, 171, 202, super.field14);
        if (this.field313) {
            this.field313 = false;
            this.field302.method493(584, 0, 128, super.field14);
            this.field303.method493(584, 371, 202, super.field14);
            this.field307.method493(584, 265, 0, super.field14);
            this.field308.method493(584, 265, 562, super.field14);
            this.field309.method493(584, 171, 128, super.field14);
            this.field310.method493(584, 171, 562, super.field14);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method10(byte arg0) {
        this.field313 = true;
        if (arg0 != 97) {
            this.field162 = null;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method95(byte arg0) {
        if (arg0 == 4) {
            for (class46 var2 = (class46) this.field391.method519(); var2 != null; var2 = (class46) this.field391.method521(5)) {
                if (this.field105 == var2.field1428 && field419 <= var2.field1437) {
                    if (field419 >= var2.field1436) {
                        if (var2.field1450 > 0) {
                            class24 var3 = this.field405[var2.field1450 - 1];
                            if (var3 != null && var3.field844 >= 0 && var3.field844 < 13312 && var3.field845 >= 0 && var3.field845 < 13312) {
                                var2.method471(this.method34(var3.field845, 215, var2.field1428, var3.field844) - var2.field1435, field419, -36281, var3.field845, var3.field844);
                            }
                        }
                        if (var2.field1450 < 0) {
                            int var4 = -var2.field1450 - 1;
                            class10 var5;
                            if (this.field499 == var4) {
                                var5 = field73;
                            } else {
                                var5 = this.field450[var4];
                            }
                            if (var5 != null && var5.field844 >= 0 && var5.field844 < 13312 && var5.field845 >= 0 && var5.field845 < 13312) {
                                var2.method471(this.method34(var5.field845, 215, var2.field1428, var5.field844) - var2.field1435, field419, -36281, var5.field845, var5.field844);
                            }
                        }
                        var2.method470((byte) -41, this.field346);
                        this.field239.method320(var2, (int) var2.field1441, (int) var2.field1442, -1, (int) var2.field1443, false, 60, this.field354, var2.field1439, this.field105);
                    }
                } else {
                    var2.method19();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method96(byte arg0) {
        Graphics var2 = this.method11((byte) 9).getGraphics();
        var2.setColor(Color.black);
        if (arg0 != 67) {
            this.field250 = -1;
        }
        var2.fillRect(0, 0, 765, 503);
        this.method4(-12882, 1);
        if (this.field270) {
            this.field71 = false;
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
        if (this.field261) {
            this.field71 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field364) {
            this.field71 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLGHHPHSRU;)V")
    private final void method97(int arg0, boolean arg1, class14 arg2) {
        if (arg1) {
            this.field250 = -1;
        }
        arg2.method212(false);
        int var4 = arg2.method213(8, this.field489);
        if (var4 < this.field406) {
            for (int var5 = var4; var5 < this.field406; ++var5) {
                this.field477[this.field476++] = this.field407[var5];
            }
        }
        if (var4 > this.field406) {
            signlink.reporterror(this.field107 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field406 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field407[var6];
                class24 var8 = this.field405[var7];
                int var9 = arg2.method213(1, this.field489);
                if (var9 == 0) {
                    this.field407[this.field406++] = var7;
                    var8.field855 = field419;
                } else {
                    int var10 = arg2.method213(2, this.field489);
                    if (var10 == 0) {
                        this.field407[this.field406++] = var7;
                        var8.field855 = field419;
                        this.field454[this.field453++] = var7;
                    } else if (var10 == 1) {
                        this.field407[this.field406++] = var7;
                        var8.field855 = field419;
                        int var11 = arg2.method213(3, this.field489);
                        var8.method241(false, var11, false);
                        int var12 = arg2.method213(1, this.field489);
                        if (var12 == 1) {
                            this.field454[this.field453++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field407[this.field406++] = var7;
                        var8.field855 = field419;
                        int var13 = arg2.method213(3, this.field489);
                        var8.method241(true, var13, false);
                        int var14 = arg2.method213(3, this.field489);
                        var8.method241(true, var14, false);
                        int var15 = arg2.method213(1, this.field489);
                        if (var15 == 1) {
                            this.field454[this.field453++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field477[this.field476++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method98(byte arg0) {
        this.field356 = 0;
        if (arg0 != 8) {
            field527 = this.field92.method533();
        }
        int var2 = (field73.field844 >> 7) + this.field115;
        int var3 = (field73.field845 >> 7) + this.field116;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field356 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field356 = 1;
        }
        if (this.field356 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field356 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method99(byte arg0) {
        if (arg0 != 25) {
            field531 = this.field92.method533();
        }
        for (int var2 = -1; var2 < this.field451; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field449;
            } else {
                var3 = this.field452[var2];
            }
            class10 var4 = this.field450[var3];
            if (var4 != null) {
                this.method124((byte) 2, 1, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method100(int arg0, int arg1) {
        class11 var3 = class11.method174(arg0);
        for (int var4 = 0; var4 < var3.field659.length && var3.field659[var4] != -1; ++var4) {
            class11 var5 = class11.method174(var3.field659[var4]);
            if (var5.field707 == 1) {
                this.method100(var5.field714, this.field487);
            }
            var5.field726 = 0;
            var5.field704 = 0;
        }
        if (arg1 >= 0) {
            this.field246 = this.field92.method533();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method101(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field263; ++var4) {
                if (this.field242[var4] == arg1) {
                    --this.field263;
                    this.field431 = true;
                    for (int var5 = var4; var5 < this.field263; ++var5) {
                        this.field209[var5] = this.field209[var5 + 1];
                        this.field210[var5] = this.field210[var5 + 1];
                        this.field242[var5] = this.field242[var5 + 1];
                    }
                    this.field387.method191(this.field240, 250);
                    this.field387.method198(arg1, 0);
                    break;
                }
            }
            if (arg0 >= 0) {
                this.field250 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field349.method300(arg3, true, arg1);
        this.field249 += arg2;
        this.field350.method300(arg0 + arg3 - 16, true, arg1);
        class20.method288(arg1, 0, arg3 + 16, 16, this.field96, arg0 - 32);
        int var7 = (arg0 - 32) * arg0 / arg5;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg0 - 32 - var7) * arg4 / (arg5 - arg0);
        class20.method288(arg1, 0, arg3 + 16 + var8, 16, this.field420, var7);
        class20.method293(var7, this.field244, -771, arg1, arg3 + 16 + var8);
        class20.method293(var7, this.field244, -771, arg1 + 1, arg3 + 16 + var8);
        class20.method291(arg1, -729, 16, this.field244, arg3 + 16 + var8);
        class20.method291(arg1, -729, 16, this.field244, arg3 + 17 + var8);
        class20.method293(var7, this.field417, -771, arg1 + 15, arg3 + 16 + var8);
        class20.method293(var7 - 1, this.field417, -771, arg1 + 14, arg3 + 17 + var8);
        class20.method291(arg1, -729, 16, this.field417, arg3 + 15 + var8 + var7);
        class20.method291(arg1 + 1, -729, 15, this.field417, arg3 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKZTQXFDC;I)V")
    public final void method103(class23 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field217.length; ++var4) {
            this.field217[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field217[var18] = (int) (Math.random() * 256.0D);
        }
        if (arg1 < 1 || arg1 > 1) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var3 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field218[var17] = (this.field217[var17 - 1] + this.field217[var17 + 1] + this.field217[var17 - 128] + this.field217[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field217;
            this.field217 = this.field218;
            this.field218 = var15;
        }
        if (arg0 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg0.field980; ++var9) {
                for (int var10 = 0; var10 < arg0.field979; ++var10) {
                    if (arg0.field977[var8++] != 0) {
                        int var11 = var10 + 16 + arg0.field981;
                        int var12 = var9 + 16 + arg0.field982;
                        int var13 = (var12 << 7) + var11;
                        this.field217[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)Z")
    public final boolean method104(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg1 >> 14 & 32767;
        int var6 = this.field239.method339(this.field105, arg3, arg0, arg1);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method64(arg0, var7 + 1, arg3, 0, 0, (byte) 37, var8, 2, false, field73.field835[0], 0, field73.field836[0]);
            } else {
                class28 var9 = class28.method365(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1125;
                    var11 = var9.field1131;
                } else {
                    var10 = var9.field1131;
                    var11 = var9.field1125;
                }
                int var12 = var9.field1084;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method64(arg0, 0, arg3, var10, var12, (byte) 37, 0, 2, false, field73.field835[0], var11, field73.field836[0]);
            }
            this.field283 = super.field29;
            this.field284 = super.field30;
            this.field286 = 2;
            this.field285 = 0;
            if (arg2 != 9) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method105(String arg0) {
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZZ)V")
    public final void method106(boolean arg0, boolean arg1) {
        if (field73.field844 >> 7 == this.field478 && field73.field845 >> 7 == this.field479) {
            this.field478 = 0;
        }
        int var3 = this.field451;
        if (!arg1) {
            this.field250 = this.field259.method202();
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class10 var5;
            int var6;
            if (arg0) {
                var5 = field73;
                var6 = this.field449 << 14;
            } else {
                var5 = this.field450[this.field452[var4]];
                var6 = this.field452[var4] << 14;
            }
            if (var5 != null && var5.method169(-528)) {
                var5.field633 = false;
                if ((field276 && this.field451 > 50 || this.field451 > 200) && !arg0 && var5.field868 == var5.field832) {
                    var5.field633 = true;
                }
                int var7 = var5.field844 >> 7;
                int var8 = var5.field845 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field632 != null && field419 >= var5.field640 && field419 < var5.field641) {
                        var5.field633 = false;
                        var5.field646 = this.method34(var5.field845, 215, this.field105, var5.field844);
                        this.field239.method321(var5.field846, var5.field637, var6, var5.field845, var5, this.field105, var5.field646, var5.field636, var5.field638, 60, var5.field635, var5.field844, 2);
                    } else {
                        if ((var5.field844 & 127) == 64 && (var5.field845 & 127) == 64) {
                            if (this.field155[var7][var8] == this.field80) {
                                continue;
                            }
                            this.field155[var7][var8] = this.field80;
                        }
                        var5.field646 = this.method34(var5.field845, 215, this.field105, var5.field844);
                        this.field239.method320(var5, var5.field844, var5.field845, var6, var5.field646, var5.field830, 60, this.field354, var5.field846, this.field105);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    private static final String method107(int arg0, byte arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != -118) {
            field474 = -51;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (!this.field364 && !this.field270 && !this.field261) {
            ++field419;
            if (!arg0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (!this.field238) {
                this.method54(true);
            } else {
                this.method142(-35326);
            }
            this.method78((byte) 9);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method108(byte arg0) {
        this.field171.method492((byte) -56);
        if (this.field237 == 2) {
            byte[] var2 = this.field88.field977;
            int[] var3 = class20.field932;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field355.method380(this.field93, 25, 33, 25, 0, this.field460, 0, 33, this.field484, 256, this.field552);
            this.field172.method492((byte) -56);
            class39.field1341 = this.field279;
        } else {
            int var6 = this.field484 + this.field165 & 2047;
            int var7 = field73.field844 / 32 + 48;
            int var8 = 464 - field73.field845 / 32;
            this.field480.method380(this.field390, var7, 146, var8, 5, this.field460, 25, 151, var6, this.field198 + 256, this.field348);
            if (arg0 != 9) {
                this.field240 = !this.field240;
            }
            this.field355.method380(this.field93, 25, 33, 25, 0, this.field460, 0, 33, this.field484, 256, this.field552);
            for (int var9 = 0; var9 < this.field316; ++var9) {
                int var39 = this.field317[var9] * 4 + 2 - field73.field844 / 32;
                int var40 = this.field318[var9] * 4 + 2 - field73.field845 / 32;
                this.method37(true, var40, this.field256[var9], var39);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class57 var36 = this.field162[this.field105][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field73.field844 / 32;
                        int var38 = var35 * 4 + 2 - field73.field845 / 32;
                        this.method37(true, var38, this.field508, var37);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field406; ++var11) {
                class24 var31 = this.field405[this.field407[var11]];
                if (var31 != null && var31.method169(-528)) {
                    class6 var32 = var31.field987;
                    if (var32.field583 != null) {
                        var32 = var32.method164(46311);
                    }
                    if (var32 != null && var32.field579 && var32.field560) {
                        int var33 = var31.field844 / 32 - field73.field844 / 32;
                        int var34 = var31.field845 / 32 - field73.field845 / 32;
                        this.method37(true, var34, this.field509, var33);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field451; ++var12) {
                class10 var23 = this.field450[this.field452[var12]];
                if (var23 != null && var23.method169(-528)) {
                    int var24 = var23.field844 / 32 - field73.field844 / 32;
                    int var25 = var23.field845 / 32 - field73.field845 / 32;
                    boolean var26 = false;
                    long var27 = class55.method510(var23.field625);
                    for (int var29 = 0; var29 < this.field263; ++var29) {
                        if (this.field242[var29] == var27 && this.field210[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field73.field623 != 0 && var23.field623 != 0 && field73.field623 == var23.field623) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method37(true, var25, this.field511, var24);
                    } else if (var30) {
                        this.method37(true, var25, this.field512, var24);
                    } else {
                        this.method37(true, var25, this.field510, var24);
                    }
                }
            }
            if (this.field193 != 0 && field419 % 20 < 10) {
                if (this.field193 == 1 && this.field438 >= 0 && this.field438 < this.field405.length) {
                    class24 var13 = this.field405[this.field438];
                    if (var13 != null) {
                        int var14 = var13.field844 / 32 - field73.field844 / 32;
                        int var15 = var13.field845 / 32 - field73.field845 / 32;
                        this.method42((byte) -26, var14, this.field112, var15);
                    }
                }
                if (this.field193 == 2) {
                    int var16 = (this.field100 - this.field115) * 4 + 2 - field73.field844 / 32;
                    int var17 = (this.field101 - this.field116) * 4 + 2 - field73.field845 / 32;
                    this.method42((byte) -26, var16, this.field112, var17);
                }
                if (this.field193 == 10 && this.field516 >= 0 && this.field516 < this.field450.length) {
                    class10 var18 = this.field450[this.field516];
                    if (var18 != null) {
                        int var19 = var18.field844 / 32 - field73.field844 / 32;
                        int var20 = var18.field845 / 32 - field73.field845 / 32;
                        this.method42((byte) -26, var19, this.field112, var20);
                    }
                }
            }
            if (this.field478 != 0) {
                int var21 = this.field478 * 4 + 2 - field73.field844 / 32;
                int var22 = this.field479 * 4 + 2 - field73.field845 / 32;
                this.method37(true, var22, this.field111, var21);
            }
            class20.method288(97, 0, 78, 3, 16777215, 3);
            this.field172.method492((byte) -56);
            class39.field1341 = this.field279;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method109(int arg0) {
        if (this.field213 == 0) {
            this.field262[0] = "Cancel";
            this.field360[0] = 1152;
            this.field436 = 1;
            if (this.field289 != -1) {
                this.field434 = 0;
                this.field488 = 0;
                this.method117(0, 0, super.field22, super.field23, 0, 0, 0, class11.method174(this.field289));
                if (this.field437 != this.field434) {
                    this.field437 = this.field434;
                }
                if (this.field488 != this.field226) {
                    this.field226 = this.field488;
                }
            } else {
                this.method62((byte) 3);
                this.field434 = 0;
                this.field488 = 0;
                if (super.field22 > 4 && super.field23 > 4 && super.field22 < 516 && super.field23 < 338) {
                    if (this.field78 != -1) {
                        this.method117(0, 4, super.field22, super.field23, 0, 4, 0, class11.method174(this.field78));
                    } else {
                        this.method156(this.field411);
                    }
                }
                if (this.field437 != this.field434) {
                    this.field437 = this.field434;
                }
                if (this.field488 != this.field226) {
                    this.field226 = this.field488;
                }
                this.field434 = 0;
                this.field488 = 0;
                if (super.field22 > 553 && super.field23 > 205 && super.field22 < 743 && super.field23 < 466) {
                    if (this.field192 != -1) {
                        this.method117(0, 553, super.field22, super.field23, 0, 205, 1, class11.method174(this.field192));
                    } else if (this.field541[this.field515] != -1) {
                        this.method117(0, 553, super.field22, super.field23, 0, 205, 1, class11.method174(this.field541[this.field515]));
                    }
                }
                if (this.field434 != this.field389) {
                    this.field431 = true;
                    this.field389 = this.field434;
                }
                if (this.field488 != this.field156) {
                    this.field431 = true;
                    this.field156 = this.field488;
                }
                this.field434 = 0;
                this.field488 = 0;
                while (arg0 >= 0) {
                    this.field162 = null;
                }
                if (super.field22 > 17 && super.field23 > 357 && super.field22 < 496 && super.field23 < 453) {
                    if (this.field67 != -1) {
                        this.method117(0, 17, super.field22, super.field23, 0, 357, 2, class11.method174(this.field67));
                    } else if (this.field138 != -1) {
                        this.method117(0, 17, super.field22, super.field23, 0, 357, 3, class11.method174(this.field138));
                    } else if (super.field23 < 434 && super.field22 < 426) {
                        this.method81(super.field23 - 357, super.field22 - 17, (byte) 37);
                    }
                }
                if ((this.field67 != -1 || this.field138 != -1) && this.field434 != this.field367) {
                    this.field343 = true;
                    this.field367 = this.field434;
                }
                if ((this.field67 != -1 || this.field138 != -1) && this.field488 != this.field134) {
                    this.field343 = true;
                    this.field134 = this.field488;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field436 - 1; ++var3) {
                        if (this.field360[var3] < 1000 && this.field360[var3 + 1] > 1000) {
                            String var4 = this.field262[var3];
                            this.field262[var3] = this.field262[var3 + 1];
                            this.field262[var3 + 1] = var4;
                            int var5 = this.field360[var3];
                            this.field360[var3] = this.field360[var3 + 1];
                            this.field360[var3 + 1] = var5;
                            int var6 = this.field358[var3];
                            this.field358[var3] = this.field358[var3 + 1];
                            this.field358[var3 + 1] = var6;
                            int var7 = this.field359[var3];
                            this.field359[var3] = this.field359[var3 + 1];
                            this.field359[var3 + 1] = var7;
                            int var8 = this.field361[var3];
                            this.field361[var3] = this.field361[var3 + 1];
                            this.field361[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method110(boolean arg0) {
        if (arg0) {
            this.field162 = null;
        }
        ++field152;
        if (field152 > 90) {
            field152 = 0;
            this.field387.method191(this.field240, 238);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(this.field246);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field78 != -1 && this.field90 == this.field78) {
                        if (var2 == 8 && this.field82.length() > 0) {
                            this.field82 = this.field82.substring(0, this.field82.length() - 1);
                        }
                        break;
                    }
                    if (this.field435) {
                        if (var2 >= 32 && var2 <= 122 && this.field266.length() < 80) {
                            this.field266 = this.field266 + (char) var2;
                            this.field343 = true;
                        }
                        if (var2 == 8 && this.field266.length() > 0) {
                            this.field266 = this.field266.substring(0, this.field266.length() - 1);
                            this.field343 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field435 = false;
                            this.field343 = true;
                            if (this.field329 == 1) {
                                long var3 = class55.method510(this.field266);
                                this.method138(var3, (byte) -66);
                            }
                            if (this.field329 == 2 && this.field263 > 0) {
                                long var5 = class55.method510(this.field266);
                                this.method101(-353, var5);
                            }
                            if (this.field329 == 3 && this.field266.length() > 0) {
                                this.field387.method191(this.field240, 44);
                                this.field387.method192(0);
                                int var7 = this.field387.field769;
                                this.field387.method198(this.field418, 0);
                                class41.method465(this.field266, this.field387, (byte) 9);
                                this.field387.method201(this.field387.field769 - var7, -48308);
                                this.field266 = class41.method466(810, this.field266);
                                this.field266 = class17.method255(810, this.field266);
                                this.method31(class55.method514(class55.method511(this.field418, 622), -36397), true, this.field266, 6);
                                if (this.field353 == 2) {
                                    this.field353 = 1;
                                    this.field281 = true;
                                    this.field387.method191(this.field240, 198);
                                    this.field387.method192(this.field443);
                                    this.field387.method192(this.field353);
                                    this.field387.method192(this.field190);
                                }
                            }
                            if (this.field329 == 4 && this.field219 < 100) {
                                long var8 = class55.method510(this.field266);
                                this.method52(var8, this.field106);
                            }
                            if (this.field329 == 5 && this.field219 > 0) {
                                long var10 = class55.method510(this.field266);
                                this.method59(var10, -256);
                            }
                        }
                    } else if (this.field334 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field384.length() < 10) {
                            this.field384 = this.field384 + (char) var2;
                            this.field343 = true;
                        }
                        if (var2 == 8 && this.field384.length() > 0) {
                            this.field384 = this.field384.substring(0, this.field384.length() - 1);
                            this.field343 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field384.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field384);
                                } catch (Exception var22) {
                                }
                                this.field387.method191(this.field240, 240);
                                this.field387.method196(var12);
                            }
                            this.field334 = 0;
                            this.field343 = true;
                        }
                    } else if (this.field334 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field384.length() < 12) {
                            this.field384 = this.field384 + (char) var2;
                            this.field343 = true;
                        }
                        if (var2 == 8 && this.field384.length() > 0) {
                            this.field384 = this.field384.substring(0, this.field384.length() - 1);
                            this.field343 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field384.length() > 0) {
                                this.field387.method191(this.field240, 89);
                                this.field387.method198(class55.method510(this.field384), 0);
                            }
                            this.field334 = 0;
                            this.field343 = true;
                        }
                    } else if (this.field67 == -1 && this.field289 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field372.length() < 80) {
                            this.field372 = this.field372 + (char) var2;
                            this.field343 = true;
                        }
                        if (var2 == 8 && this.field372.length() > 0) {
                            this.field372 = this.field372.substring(0, this.field372.length() - 1);
                            this.field343 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field372.length() > 0) {
                            if (this.field528 == 2) {
                                if (this.field372.equals("::clientdrop")) {
                                    this.method74(true);
                                }
                                if (this.field372.equals("::lag")) {
                                    this.method116((byte) -38);
                                }
                                if (this.field372.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field83.method563(2, 171); ++var13) {
                                        this.field83.method569(2, (byte) 1, 0, var13);
                                    }
                                }
                                if (this.field372.equals("::fpson")) {
                                    field496 = true;
                                }
                                if (this.field372.equals("::fpsoff")) {
                                    field496 = false;
                                }
                                if (this.field372.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field260[var14].field1625[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field372.startsWith("::")) {
                                this.field387.method191(this.field240, 221);
                                this.field387.method192(this.field372.length() - 1);
                                this.field387.method199(this.field372.substring(2));
                            } else {
                                String var17 = this.field372.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field372 = this.field372.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field372 = this.field372.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field372 = this.field372.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field372 = this.field372.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field372 = this.field372.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field372 = this.field372.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field372 = this.field372.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field372 = this.field372.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field372 = this.field372.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field372 = this.field372.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field372 = this.field372.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field372 = this.field372.substring(6);
                                }
                                String var19 = this.field372.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field372 = this.field372.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field372 = this.field372.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field372 = this.field372.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field372 = this.field372.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field372 = this.field372.substring(6);
                                }
                                this.field387.method191(this.field240, 204);
                                this.field387.method192(0);
                                int var21 = this.field387.field769;
                                this.field387.method218(-472, var18);
                                this.field404.field769 = 0;
                                class41.method465(this.field372, this.field404, (byte) 9);
                                this.field387.method238(this.field404.field768, 0, this.field404.field769, (byte) 7);
                                this.field387.method192(var20);
                                this.field387.method201(this.field387.field769 - var21, -48308);
                                this.field372 = class41.method466(810, this.field372);
                                this.field372 = class17.method255(810, this.field372);
                                field73.field837 = this.field372;
                                field73.field864 = var18;
                                field73.field885 = var20;
                                field73.field831 = 150;
                                if (this.field528 == 2) {
                                    this.method31("@cr2@" + field73.field625, true, field73.field837, 2);
                                } else if (this.field528 == 1) {
                                    this.method31("@cr1@" + field73.field625, true, field73.field837, 2);
                                } else {
                                    this.method31(field73.field625, true, field73.field837, 2);
                                }
                                if (this.field443 == 2) {
                                    this.field443 = 3;
                                    this.field281 = true;
                                    this.field387.method191(this.field240, 198);
                                    this.field387.method192(this.field443);
                                    this.field387.method192(this.field353);
                                    this.field387.method192(this.field190);
                                }
                            }
                            this.field372 = "";
                            this.field343 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field82.length() < 12) {
                this.field82 = this.field82 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method111(int arg0) {
        short var2 = 256;
        if (this.field150 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field150 > 768) {
                    this.field63[var3] = this.method139(-300, this.field65[var3], this.field64[var3], 1024 - this.field150);
                } else if (this.field150 > 256) {
                    this.field63[var3] = this.field65[var3];
                } else {
                    this.field63[var3] = this.method139(-300, this.field64[var3], this.field65[var3], 256 - this.field150);
                }
            }
        } else if (this.field151 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field151 > 768) {
                    this.field63[var4] = this.method139(-300, this.field66[var4], this.field64[var4], 1024 - this.field151);
                } else if (this.field151 > 256) {
                    this.field63[var4] = this.field66[var4];
                } else {
                    this.field63[var4] = this.method139(-300, this.field64[var4], this.field66[var4], 256 - this.field151);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field63[var5] = this.field64[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field305.field1486[var6] = this.field247.field1155[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field540[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field380[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field63[var26];
                    int var30 = this.field305.field1486[var8];
                    this.field305.field1486[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 < 6 || arg0 > 6) {
            field257 = this.field92.method533();
        }
        this.field305.method493(584, 0, 0, super.field14);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field306.field1486[var10] = this.field248.field1155[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field540[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field380[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field63[var18];
                    int var22 = this.field306.field1486[var16];
                    this.field306.field1486[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field306.method493(584, 0, 637, super.field14);
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method112(boolean arg0) {
        if (!arg0) {
            if (this.field436 >= 2 || this.field502 != 0 || this.field376 != 0) {
                String var2;
                if (this.field502 == 1 && this.field436 < 2) {
                    var2 = "Use " + this.field506 + " with...";
                } else if (this.field376 == 1 && this.field436 < 2) {
                    var2 = this.field379 + "...";
                } else {
                    var2 = this.field262[this.field436 - 1];
                }
                if (this.field436 > 2) {
                    var2 = var2 + "@whi@ / " + (this.field436 - 2) + " more options";
                }
                this.field469.method482(field419 / 1000, 16777215, true, 4, var2, true, 15);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LEKHKDMUP;B)V")
    public final void method113(class11 arg0, byte arg1) {
        int var3 = arg0.field713;
        if (arg1 == 2) {
            boolean var4 = false;
        } else {
            this.field208 = !this.field208;
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field264 == 0) {
                arg0.field693 = "Loading friend list";
                arg0.field718 = 0;
            } else if (var3 == 1 && this.field264 == 1) {
                arg0.field693 = "Connecting to friendserver";
                arg0.field718 = 0;
            } else if (var3 == 2 && this.field264 != 2) {
                arg0.field693 = "Please wait...";
                arg0.field718 = 0;
            } else {
                int var5 = this.field263;
                if (this.field264 != 2) {
                    var5 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var5) {
                    arg0.field693 = "";
                    arg0.field718 = 0;
                } else {
                    arg0.field693 = this.field209[var3];
                    arg0.field718 = 1;
                }
            }
        } else if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
            int var6 = this.field263;
            if (this.field264 != 2) {
                var6 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var6) {
                arg0.field693 = "";
                arg0.field718 = 0;
            } else {
                if (this.field210[var3] == 0) {
                    arg0.field693 = "@red@Offline";
                } else if (this.field210[var3] < 200) {
                    if (this.field210[var3] == field273) {
                        arg0.field693 = "@gre@World-" + (this.field210[var3] - 9);
                    } else {
                        arg0.field693 = "@yel@World-" + (this.field210[var3] - 9);
                    }
                } else if (this.field210[var3] == field273) {
                    arg0.field693 = "@gre@Classic" + (this.field210[var3] - 219);
                } else {
                    arg0.field693 = "@yel@Classic" + (this.field210[var3] - 219);
                }
                arg0.field718 = 1;
            }
        } else if (var3 == 203) {
            int var7 = this.field263;
            if (this.field264 != 2) {
                var7 = 0;
            }
            arg0.field654 = var7 * 15 + 20;
            if (arg0.field654 <= arg0.field688) {
                arg0.field654 = arg0.field688 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 == 0 && this.field264 == 0) {
                arg0.field693 = "Loading ignore list";
                arg0.field718 = 0;
            } else if (var3 == 1 && this.field264 == 0) {
                arg0.field693 = "Please wait...";
                arg0.field718 = 0;
            } else {
                int var8 = this.field219;
                if (this.field264 == 0) {
                    var8 = 0;
                }
                if (var3 >= var8) {
                    arg0.field693 = "";
                    arg0.field718 = 0;
                } else {
                    arg0.field693 = class55.method514(class55.method511(this.field482[var3], 622), -36397);
                    arg0.field718 = 1;
                }
            }
        } else if (var3 == 503) {
            arg0.field654 = this.field219 * 15 + 20;
            if (arg0.field654 <= arg0.field688) {
                arg0.field654 = arg0.field688 + 1;
            }
        } else if (var3 == 327) {
            arg0.field695 = 150;
            arg0.field696 = (int) (Math.sin((double) field419 / 40.0D) * 256.0D) & 2047;
            if (this.field183) {
                for (int var9 = 0; var9 < 7; ++var9) {
                    int var16 = this.field386[var9];
                    if (var16 >= 0 && !class12.field731[var16].method186((byte) 6)) {
                        return;
                    }
                }
                this.field183 = false;
                class35[] var10 = new class35[7];
                int var11 = 0;
                for (int var12 = 0; var12 < 7; ++var12) {
                    int var15 = this.field386[var12];
                    if (var15 >= 0) {
                        var10[var11++] = class12.field731[var15].method187((byte) 81);
                    }
                }
                class35 var13 = new class35(var11, -537, var10);
                for (int var14 = 0; var14 < 5; ++var14) {
                    if (this.field225[var14] != 0) {
                        var13.method405(field501[var14][0], field501[var14][this.field225[var14]]);
                        if (var14 == 1) {
                            var13.method405(field427[0], field427[this.field225[var14]]);
                        }
                    }
                }
                var13.method398(0);
                var13.method399(-230, class58.field1560[field73.field868].field1562[0]);
                var13.method408(64, 850, -30, -50, -30, true);
                arg0.field665 = 5;
                arg0.field666 = 0;
                class11.method175((byte) 104, 5, 0, var13);
            }
        } else if (var3 == 324) {
            if (this.field397 == null) {
                this.field397 = arg0.field703;
                this.field398 = arg0.field711;
            }
            if (this.field401) {
                arg0.field703 = this.field398;
            } else {
                arg0.field703 = this.field397;
            }
        } else if (var3 == 325) {
            if (this.field397 == null) {
                this.field397 = arg0.field703;
                this.field398 = arg0.field711;
            }
            if (this.field401) {
                arg0.field703 = this.field397;
            } else {
                arg0.field703 = this.field398;
            }
        } else if (var3 == 600) {
            arg0.field693 = this.field82;
            if (field419 % 20 < 10) {
                arg0.field693 = arg0.field693 + "|";
            } else {
                arg0.field693 = arg0.field693 + " ";
            }
        } else {
            if (var3 == 620) {
                if (this.field528 >= 1) {
                    if (this.field148) {
                        arg0.field706 = 16711680;
                        arg0.field693 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field706 = 16777215;
                        arg0.field693 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field693 = "";
                }
            }
            if (var3 == 660) {
                int var17 = this.field525 - this.field202;
                String var18;
                if (var17 <= 0) {
                    var18 = "earlier today";
                } else if (var17 == 1) {
                    var18 = "yesterday";
                } else {
                    var18 = var17 + " days ago";
                }
                arg0.field693 = "You last logged in @red@" + var18 + "@bla@ from: @red@" + signlink.dns;
            }
            if (var3 == 661) {
                if (this.field227 == 0) {
                    arg0.field693 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                } else if (this.field227 <= this.field525) {
                    arg0.field693 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method114(this.field227, (byte) 19);
                } else {
                    int var19 = this.field525 + 14 - this.field227;
                    String var20;
                    if (var19 <= 0) {
                        var20 = "Earlier today";
                    } else if (var19 == 1) {
                        var20 = "Yesterday";
                    } else {
                        var20 = var19 + " days ago";
                    }
                    arg0.field693 = var20 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method114(this.field227, (byte) 19) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                }
            }
            if (var3 == 662) {
                String var21;
                if (this.field362 == 0) {
                    var21 = "@yel@0 unread messages";
                } else if (this.field362 == 1) {
                    var21 = "@gre@1 unread message";
                } else {
                    var21 = "@gre@" + this.field362 + " unread messages";
                }
                arg0.field693 = "You have " + var21 + "\\nin your message centre.";
            }
            if (var3 == 663) {
                if (this.field497 > 0 && this.field497 <= this.field525 + 10) {
                    arg0.field693 = "Last password change:\\n@gre@" + this.method114(this.field497, (byte) 19);
                } else {
                    arg0.field693 = "Last password change:\\n@gre@Never changed";
                }
            }
            if (var3 == 664) {
                if (this.field421 == 0) {
                    arg0.field693 = "You have not yet set\\nany contact details.";
                }
                if (this.field421 == 1) {
                    arg0.field693 = "Contact Details Last Set:\\n@gre@" + this.method114(this.field414, (byte) 19);
                }
                if (this.field421 == 2) {
                    arg0.field693 = "You need to set\\nnew contact details.";
                }
            }
            if (var3 == 665) {
                if (this.field113 > 2 && !field275) {
                    arg0.field693 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                } else if (this.field113 > 2) {
                    arg0.field693 = "\\n\\nYou have @gre@" + this.field113 + "@yel@ days of\\nmember credit remaining.";
                } else if (this.field113 > 0) {
                    arg0.field693 = "You have @gre@" + this.field113 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                } else {
                    arg0.field693 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                }
            }
            if (var3 == 667) {
                if (this.field113 > 2 && !field275) {
                    arg0.field693 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                } else if (this.field113 > 0) {
                    arg0.field693 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                } else {
                    arg0.field693 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                }
            }
            if (var3 == 668) {
                if (this.field227 > this.field525) {
                    arg0.field693 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                } else {
                    arg0.field693 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)Ljava/lang/String;")
    public final String method114(int arg0, byte arg1) {
        if (arg1 != 19) {
            this.method6();
        }
        if (arg0 > this.field525 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)V")
    public final void method115(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field380[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field380[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field381[var14] = (this.field380[var14 - 1] + this.field380[var14 + 1] + this.field380[var14 - 128] + this.field380[var14 + 128]) / 4;
            }
        }
        this.field119 += 128;
        if (arg0 != -21) {
            this.field250 = this.field259.method202();
        }
        if (this.field119 > this.field217.length) {
            this.field119 -= this.field217.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method103(this.field522[var6], 1);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field381[var11 + 128] - this.field217[this.field119 + var11 & this.field217.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field380[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field540[var8] = this.field540[var8 + 1];
        }
        this.field540[var2 - 1] = (int) (Math.sin((double) field419 / 14.0D) * 16.0D + Math.sin((double) field419 / 15.0D) * 14.0D + Math.sin((double) field419 / 16.0D) * 12.0D);
        if (this.field150 > 0) {
            this.field150 -= 4;
        }
        if (this.field151 > 0) {
            this.field151 -= 4;
        }
        if (this.field150 == 0 && this.field151 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field150 = 1024;
            }
            if (var9 == 1) {
                this.field151 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(B)V")
    public void method116(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field233);
        if (arg0 == -38) {
            if (this.field83 != null) {
                System.out.println("Od-cycle:" + this.field83.field1671);
            }
            System.out.println("loop-cycle:" + field419);
            System.out.println("draw-cycle:" + field323);
            System.out.println("ptype:" + this.field250);
            System.out.println("psize:" + this.field249);
            if (this.field132 != null) {
                this.field132.method588((byte) -38);
            }
            super.field11 = true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)Ljava/awt/Component;")
    public final Component method11(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field162 = null;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field17 != null ? super.field17 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIILEKHKDMUP;)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class11 arg7) {
        if (arg7.field707 == 0 && arg7.field659 != null && !arg7.field698) {
            if (arg2 >= arg1 && arg3 >= arg5 && arg2 <= arg7.field661 + arg1 && arg3 <= arg7.field688 + arg5) {
                int var9 = arg7.field659.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg7.field676[var10] + arg1;
                    int var12 = arg7.field678[var10] + arg5 - arg0;
                    class11 var13 = class11.method174(arg7.field659[var10]);
                    int var14 = var13.field662 + var11;
                    int var15 = var13.field663 + var12;
                    if ((var13.field672 >= 0 || var13.field719 != 0) && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field661 + var14 && arg3 < var13.field688 + var15) {
                        if (var13.field672 >= 0) {
                            this.field434 = var13.field672;
                        } else {
                            this.field434 = var13.field714;
                        }
                    }
                    if (var13.field707 == 8 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field661 + var14 && arg3 < var13.field688 + var15) {
                        this.field488 = var13.field714;
                    }
                    if (var13.field707 == 0) {
                        this.method117(var13.field674, var14, arg2, arg3, 0, var15, arg6, var13);
                        if (var13.field654 > var13.field688) {
                            this.method89(var13.field654, arg6, (byte) 43, var13.field688, var13.field661 + var14, var13, arg3, var15, arg2);
                        }
                    } else {
                        if (var13.field718 == 1 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field661 + var14 && arg3 < var13.field688 + var15) {
                            boolean var16 = false;
                            if (var13.field713 != 0) {
                                var16 = this.method67(381, var13);
                            }
                            if (!var16) {
                                this.field262[this.field436] = var13.field681;
                                this.field360[this.field436] = 663;
                                this.field359[this.field436] = var13.field714;
                                ++this.field436;
                            }
                        }
                        if (var13.field718 == 2 && this.field376 == 0 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field661 + var14 && arg3 < var13.field688 + var15) {
                            String var17 = var13.field673;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field262[this.field436] = var17 + " @gre@" + var13.field653;
                            this.field360[this.field436] = 896;
                            this.field359[this.field436] = var13.field714;
                            ++this.field436;
                        }
                        if (var13.field718 == 3 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field661 + var14 && arg3 < var13.field688 + var15) {
                            this.field262[this.field436] = "Close";
                            if (arg6 == 3) {
                                this.field360[this.field436] = 951;
                            } else {
                                this.field360[this.field436] = 838;
                            }
                            this.field359[this.field436] = var13.field714;
                            ++this.field436;
                        }
                        if (var13.field718 == 4 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field661 + var14 && arg3 < var13.field688 + var15) {
                            this.field262[this.field436] = var13.field681;
                            this.field360[this.field436] = 241;
                            this.field359[this.field436] = var13.field714;
                            ++this.field436;
                        }
                        if (var13.field718 == 5 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field661 + var14 && arg3 < var13.field688 + var15) {
                            this.field262[this.field436] = var13.field681;
                            this.field360[this.field436] = 507;
                            this.field359[this.field436] = var13.field714;
                            ++this.field436;
                        }
                        if (var13.field718 == 6 && !this.field271 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field661 + var14 && arg3 < var13.field688 + var15) {
                            this.field262[this.field436] = var13.field681;
                            this.field360[this.field436] = 338;
                            this.field359[this.field436] = var13.field714;
                            ++this.field436;
                        }
                        if (var13.field707 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field688; ++var19) {
                                for (int var20 = 0; var20 < var13.field661; ++var20) {
                                    int var21 = (var13.field721 + 32) * var20 + var14;
                                    int var22 = (var13.field720 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field727[var18];
                                        var22 += var13.field679[var18];
                                    }
                                    if (arg2 >= var21 && arg3 >= var22 && arg2 < var21 + 32 && arg3 < var22 + 32) {
                                        this.field529 = var18;
                                        this.field530 = var13.field714;
                                        if (var13.field652[var18] > 0) {
                                            class72 var23 = class72.method590(var13.field652[var18] - 1);
                                            if (this.field502 == 1 && var13.field687) {
                                                if (this.field504 != var13.field714 || this.field503 != var18) {
                                                    this.field262[this.field436] = "Use " + this.field506 + " with @lre@" + var23.field1727;
                                                    this.field360[this.field436] = 775;
                                                    this.field361[this.field436] = var23.field1730;
                                                    this.field358[this.field436] = var18;
                                                    this.field359[this.field436] = var13.field714;
                                                    ++this.field436;
                                                }
                                            } else if (this.field376 == 1 && var13.field687) {
                                                if ((this.field378 & 16) == 16) {
                                                    this.field262[this.field436] = this.field379 + " @lre@" + var23.field1727;
                                                    this.field360[this.field436] = 39;
                                                    this.field361[this.field436] = var23.field1730;
                                                    this.field358[this.field436] = var18;
                                                    this.field359[this.field436] = var13.field714;
                                                    ++this.field436;
                                                }
                                            } else {
                                                if (var13.field687) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1739 != null && var23.field1739[var24] != null) {
                                                            this.field262[this.field436] = var23.field1739[var24] + " @lre@" + var23.field1727;
                                                            if (var24 == 3) {
                                                                this.field360[this.field436] = 68;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field360[this.field436] = 910;
                                                            }
                                                            this.field361[this.field436] = var23.field1730;
                                                            this.field358[this.field436] = var18;
                                                            this.field359[this.field436] = var13.field714;
                                                            ++this.field436;
                                                        } else if (var24 == 4) {
                                                            this.field262[this.field436] = "Drop @lre@" + var23.field1727;
                                                            this.field360[this.field436] = 910;
                                                            this.field361[this.field436] = var23.field1730;
                                                            this.field358[this.field436] = var18;
                                                            this.field359[this.field436] = var13.field714;
                                                            ++this.field436;
                                                        }
                                                    }
                                                }
                                                if (var13.field723) {
                                                    this.field262[this.field436] = "Use @lre@" + var23.field1727;
                                                    this.field360[this.field436] = 874;
                                                    this.field361[this.field436] = var23.field1730;
                                                    this.field358[this.field436] = var18;
                                                    this.field359[this.field436] = var13.field714;
                                                    ++this.field436;
                                                }
                                                if (var13.field687 && var23.field1739 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1739[var25] != null) {
                                                            this.field262[this.field436] = var23.field1739[var25] + " @lre@" + var23.field1727;
                                                            if (var25 == 0) {
                                                                this.field360[this.field436] = 17;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field360[this.field436] = 994;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field360[this.field436] = 840;
                                                            }
                                                            this.field361[this.field436] = var23.field1730;
                                                            this.field358[this.field436] = var18;
                                                            this.field359[this.field436] = var13.field714;
                                                            ++this.field436;
                                                        }
                                                    }
                                                }
                                                if (var13.field705 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field705[var26] != null) {
                                                            this.field262[this.field436] = var13.field705[var26] + " @lre@" + var23.field1727;
                                                            if (var26 == 0) {
                                                                this.field360[this.field436] = 592;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field360[this.field436] = 637;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field360[this.field436] = 148;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field360[this.field436] = 708;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field360[this.field436] = 306;
                                                            }
                                                            this.field361[this.field436] = var23.field1730;
                                                            this.field358[this.field436] = var18;
                                                            this.field359[this.field436] = var13.field714;
                                                            ++this.field436;
                                                        }
                                                    }
                                                }
                                                this.field262[this.field436] = "Examine @lre@" + var23.field1727;
                                                this.field360[this.field436] = 1893;
                                                this.field361[this.field436] = var23.field1730;
                                                this.field358[this.field436] = var18;
                                                this.field359[this.field436] = var13.field714;
                                                ++this.field436;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
                if (arg4 == 0) {
                    ;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LGHHPHSRU;II)V")
    private final void method118(class14 arg0, int arg1, int arg2) {
        if (arg2 >= 1 && arg2 <= 1) {
            int var4 = arg0.method213(8, this.field489);
            if (var4 < this.field451) {
                for (int var5 = var4; var5 < this.field451; ++var5) {
                    this.field477[this.field476++] = this.field452[var5];
                }
            }
            if (var4 > this.field451) {
                signlink.reporterror(this.field107 + " Too many players");
                throw new RuntimeException("eek");
            } else {
                this.field451 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field452[var6];
                    class10 var8 = this.field450[var7];
                    int var9 = arg0.method213(1, this.field489);
                    if (var9 == 0) {
                        this.field452[this.field451++] = var7;
                        var8.field855 = field419;
                    } else {
                        int var10 = arg0.method213(2, this.field489);
                        if (var10 == 0) {
                            this.field452[this.field451++] = var7;
                            var8.field855 = field419;
                            this.field454[this.field453++] = var7;
                        } else if (var10 == 1) {
                            this.field452[this.field451++] = var7;
                            var8.field855 = field419;
                            int var11 = arg0.method213(3, this.field489);
                            var8.method241(false, var11, false);
                            int var12 = arg0.method213(1, this.field489);
                            if (var12 == 1) {
                                this.field454[this.field453++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field452[this.field451++] = var7;
                            var8.field855 = field419;
                            int var13 = arg0.method213(3, this.field489);
                            var8.method241(true, var13, false);
                            int var14 = arg0.method213(3, this.field489);
                            var8.method241(true, var14, false);
                            int var15 = arg0.method213(1, this.field489);
                            if (var15 == 1) {
                                this.field454[this.field453++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field477[this.field476++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method119(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field388) {
            this.method40((byte) 86);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method120(int arg0) {
        int var2 = this.field469.method475("Choose Option", 0);
        for (int var3 = 0; var3 < this.field436; ++var3) {
            int var11 = this.field469.method475(this.field262[var3], 0);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field436 * 15 + 21;
        if (arg0 != 9) {
            this.field246 = this.field92.method533();
        }
        if (super.field29 > 4 && super.field30 > 4 && super.field29 < 516 && super.field30 < 338) {
            int var5 = super.field29 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field30 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field301 = true;
            this.field422 = 0;
            this.field423 = var5;
            this.field424 = var6;
            this.field425 = var2;
            this.field426 = this.field436 * 15 + 22;
        }
        if (super.field29 > 553 && super.field30 > 205 && super.field29 < 743 && super.field30 < 466) {
            int var7 = super.field29 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field30 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field301 = true;
            this.field422 = 1;
            this.field423 = var7;
            this.field424 = var8;
            this.field425 = var2;
            this.field426 = this.field436 * 15 + 22;
        }
        if (super.field29 > 17 && super.field30 > 357 && super.field29 < 496 && super.field30 < 453) {
            int var9 = super.field29 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field30 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field301 = true;
            this.field422 = 2;
            this.field423 = var9;
            this.field424 = var10;
            this.field425 = var2;
            this.field426 = this.field436 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method121(int arg0) {
        if (super.field15 == null) {
            this.method86(0);
            this.field302 = null;
            this.field303 = null;
            this.field304 = null;
            this.field305 = null;
            this.field306 = null;
            this.field307 = null;
            this.field308 = null;
            this.field309 = null;
            this.field310 = null;
            this.field173 = null;
            this.field171 = null;
            if (this.field442 != arg0) {
                this.field250 = -1;
            }
            this.field170 = null;
            this.field172 = null;
            this.field74 = null;
            this.field75 = null;
            this.field76 = null;
            super.field15 = new class50(765, this.method11((byte) 9), 503, 9);
            this.field313 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILEKHKDMUP;I)V")
    public final void method122(int arg0, int arg1, int arg2, class11 arg3, int arg4) {
        if (arg1 <= 0) {
            this.field77 = -178;
        }
        if (arg3.field707 == 0 && arg3.field659 != null) {
            if (!arg3.field698 || this.field437 == arg3.field714 || this.field389 == arg3.field714 || this.field367 == arg3.field714) {
                int var6 = class20.field937;
                int var7 = class20.field935;
                int var8 = class20.field938;
                int var9 = class20.field936;
                class20.method285(arg0, -749, arg2, arg3.field688 + arg2, arg3.field661 + arg0);
                int var10 = arg3.field659.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field676[var11] + arg0;
                    int var13 = arg3.field678[var11] + arg2 - arg4;
                    class11 var14 = class11.method174(arg3.field659[var11]);
                    int var15 = var14.field662 + var12;
                    int var16 = var14.field663 + var13;
                    if (var14.field713 > 0) {
                        this.method113(var14, (byte) 2);
                    }
                    if (var14.field707 == 0) {
                        if (var14.field674 > var14.field654 - var14.field688) {
                            var14.field674 = var14.field654 - var14.field688;
                        }
                        if (var14.field674 < 0) {
                            var14.field674 = 0;
                        }
                        this.method122(var15, 481, var16, var14, var14.field674);
                        if (var14.field654 > var14.field688) {
                            this.method102(var14.field688, var14.field661 + var15, 0, var16, var14.field674, var14.field654);
                        }
                    } else if (var14.field707 != 1) {
                        if (var14.field707 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field688; ++var18) {
                                for (int var19 = 0; var19 < var14.field661; ++var19) {
                                    int var20 = (var14.field721 + 32) * var19 + var15;
                                    int var21 = (var14.field720 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field727[var17];
                                        var21 += var14.field679[var17];
                                    }
                                    if (var14.field652[var17] <= 0) {
                                        if (var14.field700 != null && var17 < 20) {
                                            class31 var30 = var14.field700[var17];
                                            if (var30 != null) {
                                                var30.method376(var21, true, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field652[var17] - 1;
                                        if (var20 > class20.field937 - 32 && var20 < class20.field938 && var21 > class20.field935 - 32 && var21 < class20.field936 || this.field213 != 0 && this.field212 == var17) {
                                            int var25 = 0;
                                            if (this.field502 == 1 && this.field503 == var17 && this.field504 == var14.field714) {
                                                var25 = 16777215;
                                            }
                                            class31 var26 = class72.method592(var25, var14.field715[var17], (byte) -55, var24);
                                            if (var26 != null) {
                                                if (this.field213 != 0 && this.field212 == var17 && this.field211 == var14.field714) {
                                                    var22 = super.field22 - this.field214;
                                                    var23 = super.field23 - this.field215;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field513 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method378(var20 + var22, 128, var21 + var23, false);
                                                    if (var21 + var23 < class20.field935 && arg3.field674 > 0) {
                                                        int var27 = (class20.field935 - var21 - var23) * this.field346 / 3;
                                                        if (var27 > this.field346 * 10) {
                                                            var27 = this.field346 * 10;
                                                        }
                                                        if (var27 > arg3.field674) {
                                                            var27 = arg3.field674;
                                                        }
                                                        arg3.field674 -= var27;
                                                        this.field215 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class20.field936 && arg3.field674 < arg3.field654 - arg3.field688) {
                                                        int var28 = (var21 + var23 + 32 - class20.field936) * this.field346 / 3;
                                                        if (var28 > this.field346 * 10) {
                                                            var28 = this.field346 * 10;
                                                        }
                                                        if (var28 > arg3.field654 - arg3.field688 - arg3.field674) {
                                                            var28 = arg3.field654 - arg3.field688 - arg3.field674;
                                                        }
                                                        arg3.field674 += var28;
                                                        this.field215 -= var28;
                                                    }
                                                } else if (this.field187 != 0 && this.field186 == var17 && this.field185 == var14.field714) {
                                                    var26.method378(var20, 128, var21, false);
                                                } else {
                                                    var26.method376(var21, true, var20);
                                                }
                                                if (var26.field1160 == 33 || var14.field715[var17] != 1) {
                                                    int var29 = var14.field715[var17];
                                                    this.field467.method477(0, method39(var29, 790), 3, var21 + 10 + var23, var20 + 1 + var22);
                                                    this.field467.method477(16776960, method39(var29, 790), 3, var21 + 9 + var23, var20 + var22);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field707 == 3) {
                            boolean var31 = false;
                            if (this.field367 == var14.field714 || this.field389 == var14.field714 || this.field437 == var14.field714) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method24(3, var14)) {
                                var32 = var14.field671;
                                if (var31 && var14.field670 != 0) {
                                    var32 = var14.field670;
                                }
                            } else {
                                var32 = var14.field706;
                                if (var31 && var14.field719 != 0) {
                                    var32 = var14.field719;
                                }
                            }
                            if (var14.field685 == 0) {
                                if (var14.field682) {
                                    class20.method288(var15, 0, var16, var14.field661, var32, var14.field688);
                                } else {
                                    class20.method289(var15, var14.field661, var16, var32, 0, var14.field688);
                                }
                            } else if (var14.field682) {
                                class20.method287(256 - (var14.field685 & 255), var14.field661, var32, var15, var16, var14.field688, true);
                            } else {
                                class20.method290(256 - (var14.field685 & 255), var14.field688, var14.field661, 4, var16, var15, var32);
                            }
                        } else if (var14.field707 == 4) {
                            class47 var33 = var14.field667;
                            String var34 = var14.field693;
                            boolean var35 = false;
                            if (this.field367 == var14.field714 || this.field389 == var14.field714 || this.field437 == var14.field714) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method24(3, var14)) {
                                var36 = var14.field671;
                                if (var35 && var14.field670 != 0) {
                                    var36 = var14.field670;
                                }
                                if (var14.field668.length() > 0) {
                                    var34 = var14.field668;
                                }
                            } else {
                                var36 = var14.field706;
                                if (var35 && var14.field719 != 0) {
                                    var36 = var14.field719;
                                }
                            }
                            if (var14.field718 == 6 && this.field271) {
                                var34 = "Please wait...";
                                var36 = var14.field706;
                            }
                            if (class20.field933 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1462 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label388: while (true) {
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
                                                                            break label388;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method28(this.method23(var14, false, 4), field474) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method28(this.method23(var14, false, 3), field474) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method28(this.method23(var14, false, 2), field474) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method28(this.method23(var14, false, 1), field474) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method28(this.method23(var14, false, 0), field474) + var34.substring(var38 + 2);
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
                                if (var14.field664) {
                                    var33.method474(var14.field709, var36, 0, var37, var44, var14.field661 / 2 + var15);
                                } else {
                                    var33.method481(var15, var44, var36, var37, var14.field709, false);
                                }
                                var37 += var33.field1462;
                            }
                        } else if (var14.field707 == 5) {
                            class31 var45;
                            if (this.method24(3, var14)) {
                                var45 = var14.field711;
                            } else {
                                var45 = var14.field703;
                            }
                            if (var45 != null) {
                                var45.method376(var16, true, var15);
                            }
                        } else if (var14.field707 == 6) {
                            int var46 = class39.field1335;
                            int var47 = class39.field1336;
                            class39.field1335 = var14.field661 / 2 + var15;
                            class39.field1336 = var14.field688 / 2 + var16;
                            int var48 = class39.field1339[var14.field695] * var14.field694 >> 16;
                            int var49 = class39.field1340[var14.field695] * var14.field694 >> 16;
                            boolean var50 = this.method24(3, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field658;
                            } else {
                                var51 = var14.field657;
                            }
                            class35 var52;
                            if (var51 == -1) {
                                var52 = var14.method181(var50, 7, -1, -1);
                            } else {
                                class58 var53 = class58.field1560[var51];
                                var52 = var14.method181(var50, 7, var53.field1562[var14.field726], var53.field1563[var14.field726]);
                            }
                            if (var52 != null) {
                                var52.method411(0, var14.field696, 0, var14.field695, 0, var48, var49);
                            }
                            class39.field1335 = var46;
                            class39.field1336 = var47;
                        } else {
                            if (var14.field707 == 7) {
                                class47 var54 = var14.field667;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field688; ++var56) {
                                    for (int var57 = 0; var57 < var14.field661; ++var57) {
                                        if (var14.field652[var55] > 0) {
                                            class72 var58 = class72.method590(var14.field652[var55] - 1);
                                            String var59 = var58.field1727;
                                            if (var58.field1754 || var14.field715[var55] != 1) {
                                                var59 = var59 + " x" + method107(var14.field715[var55], (byte) -118);
                                            }
                                            int var60 = (var14.field721 + 115) * var57 + var15;
                                            int var61 = (var14.field720 + 12) * var56 + var16;
                                            if (var14.field664) {
                                                var54.method474(var14.field709, var14.field706, 0, var61, var59, var14.field661 / 2 + var60);
                                            } else {
                                                var54.method481(var60, var59, var14.field706, var61, var14.field709, false);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field707 == 8 && (this.field134 == var14.field714 || this.field156 == var14.field714 || this.field226 == var14.field714) && this.field383 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class47 var64 = this.field468;
                                String var65 = var14.field693;
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
                                    int var74 = var64.method475(var73, 0);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1462 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field661 + var15 - 5 - var62;
                                int var67 = var14.field688 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg3.field661 + arg0) {
                                    var66 = arg3.field661 + arg0 - var62;
                                }
                                class20.method288(var66, 0, var67, var62, 16777120, var63);
                                class20.method289(var66, var62, var67, 0, 0, var63);
                                String var68 = var14.field693;
                                int var69 = var64.field1462 + var67 + 2;
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
                                    var64.method481(var66 + 3, var71, 0, var69, false, false);
                                    var69 += var64.field1462 + 1;
                                }
                            }
                        }
                    }
                }
                class20.method285(var6, -749, var7, var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        for (int var2 = 0; var2 < this.field406; ++var2) {
            int var3 = this.field407[var2];
            class24 var4 = this.field405[var3];
            if (var4 != null) {
                this.method124((byte) 2, var4.field987.field566, var4);
            }
        }
        if (arg0) {
            this.field162 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILGSULPWKR;)V")
    public final void method124(byte arg0, int arg1, class16 arg2) {
        if (arg2.field844 < 128 || arg2.field845 < 128 || arg2.field844 >= 13184 || arg2.field845 >= 13184) {
            arg2.field839 = -1;
            arg2.field859 = -1;
            arg2.field851 = 0;
            arg2.field852 = 0;
            arg2.field844 = arg2.field835[0] * 128 + arg2.field856 * 64;
            arg2.field845 = arg2.field836[0] * 128 + arg2.field856 * 64;
            arg2.method244(772);
        }
        if (field73 == arg2 && (arg2.field844 < 1536 || arg2.field845 < 1536 || arg2.field844 >= 11776 || arg2.field845 >= 11776)) {
            arg2.field839 = -1;
            arg2.field859 = -1;
            arg2.field851 = 0;
            arg2.field852 = 0;
            arg2.field844 = arg2.field835[0] * 128 + arg2.field856 * 64;
            arg2.field845 = arg2.field836[0] * 128 + arg2.field856 * 64;
            arg2.method244(772);
        }
        if (arg2.field851 > field419) {
            this.method125(arg2, false);
        } else if (arg2.field852 >= field419) {
            this.method126(true, arg2);
        } else {
            this.method127(arg2, 18230);
        }
        this.method128(2, arg2);
        this.method129(this.field500, arg2);
        if (arg0 != 2) {
            this.field162 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LGSULPWKR;Z)V")
    public final void method125(class16 arg0, boolean arg1) {
        int var3 = arg0.field851 - field419;
        if (arg1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = arg0.field856 * 64 + arg0.field847 * 128;
        int var6 = arg0.field856 * 64 + arg0.field849 * 128;
        arg0.field844 += (var5 - arg0.field844) / var3;
        arg0.field845 += (var6 - arg0.field845) / var3;
        arg0.field858 = 0;
        if (arg0.field853 == 0) {
            arg0.field854 = 1024;
        }
        if (arg0.field853 == 1) {
            arg0.field854 = 1536;
        }
        if (arg0.field853 == 2) {
            arg0.field854 = 0;
        }
        if (arg0.field853 == 3) {
            arg0.field854 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLGSULPWKR;)V")
    public final void method126(boolean arg0, class16 arg1) {
        if (field419 == arg1.field852 || arg1.field839 == -1 || arg1.field842 != 0 || arg1.field841 + 1 > class58.field1560[arg1.field839].method525(0, arg1.field840)) {
            int var3 = arg1.field852 - arg1.field851;
            int var4 = field419 - arg1.field851;
            int var5 = arg1.field856 * 64 + arg1.field847 * 128;
            int var6 = arg1.field856 * 64 + arg1.field849 * 128;
            int var7 = arg1.field856 * 64 + arg1.field848 * 128;
            int var8 = arg1.field856 * 64 + arg1.field850 * 128;
            arg1.field844 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field845 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field858 = 0;
        if (!arg0) {
            this.field250 = -1;
        }
        if (arg1.field853 == 0) {
            arg1.field854 = 1024;
        }
        if (arg1.field853 == 1) {
            arg1.field854 = 1536;
        }
        if (arg1.field853 == 2) {
            arg1.field854 = 0;
        }
        if (arg1.field853 == 3) {
            arg1.field854 = 512;
        }
        arg1.field846 = arg1.field854;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LGSULPWKR;I)V")
    public final void method127(class16 arg0, int arg1) {
        arg0.field832 = arg0.field868;
        if (arg0.field865 == 0) {
            arg0.field858 = 0;
        } else {
            if (arg0.field839 != -1 && arg0.field842 == 0) {
                class58 var3 = class58.field1560[arg0.field839];
                if (arg0.field866 > 0 && var3.field1572 == 0) {
                    ++arg0.field858;
                    return;
                }
                if (arg0.field866 <= 0 && var3.field1573 == 0) {
                    ++arg0.field858;
                    return;
                }
            }
            int var4 = arg0.field844;
            int var5 = arg0.field845;
            int var6 = arg0.field835[arg0.field865 - 1] * 128 + arg0.field856 * 64;
            int var7 = arg0.field836[arg0.field865 - 1] * 128 + arg0.field856 * 64;
            if (arg1 != 18230) {
                this.field250 = this.field259.method202();
            }
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field854 = 1280;
                    } else if (var5 > var7) {
                        arg0.field854 = 1792;
                    } else {
                        arg0.field854 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field854 = 768;
                    } else if (var5 > var7) {
                        arg0.field854 = 256;
                    } else {
                        arg0.field854 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field854 = 1024;
                } else {
                    arg0.field854 = 0;
                }
                int var8 = arg0.field854 - arg0.field846 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field882;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field881;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field884;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field883;
                }
                if (var9 == -1) {
                    var9 = arg0.field881;
                }
                arg0.field832 = var9;
                int var10 = 4;
                if (arg0.field854 != arg0.field846 && arg0.field874 == -1 && arg0.field867 != 0) {
                    var10 = 2;
                }
                if (arg0.field865 > 2) {
                    var10 = 6;
                }
                if (arg0.field865 > 3) {
                    var10 = 8;
                }
                if (arg0.field858 > 0 && arg0.field865 > 1) {
                    var10 = 8;
                    --arg0.field858;
                }
                if (arg0.field886[arg0.field865 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field881 == arg0.field832 && arg0.field838 != -1) {
                    arg0.field832 = arg0.field838;
                }
                if (var4 < var6) {
                    arg0.field844 += var10;
                    if (arg0.field844 > var6) {
                        arg0.field844 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field844 -= var10;
                    if (arg0.field844 < var6) {
                        arg0.field844 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field845 += var10;
                    if (arg0.field845 > var7) {
                        arg0.field845 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field845 -= var10;
                    if (arg0.field845 < var7) {
                        arg0.field845 = var7;
                    }
                }
                if (arg0.field844 == var6 && arg0.field845 == var7) {
                    --arg0.field865;
                    if (arg0.field866 > 0) {
                        --arg0.field866;
                        return;
                    }
                }
            } else {
                arg0.field844 = var6;
                arg0.field845 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILGSULPWKR;)V")
    public final void method128(int arg0, class16 arg1) {
        if (arg0 != 2) {
            this.field162 = null;
        }
        if (arg1.field867 != 0) {
            if (arg1.field874 != -1 && arg1.field874 < 32768) {
                class24 var3 = this.field405[arg1.field874];
                if (var3 != null) {
                    int var4 = arg1.field844 - var3.field844;
                    int var5 = arg1.field845 - var3.field845;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field854 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field874 >= 32768) {
                int var6 = arg1.field874 - 32768;
                if (this.field499 == var6) {
                    var6 = this.field449;
                }
                class10 var7 = this.field450[var6];
                if (var7 != null) {
                    int var8 = arg1.field844 - var7.field844;
                    int var9 = arg1.field845 - var7.field845;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field854 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field875 != 0 || arg1.field876 != 0) && (arg1.field865 == 0 || arg1.field858 > 0)) {
                int var10 = arg1.field844 - (arg1.field875 - this.field115 - this.field115) * 64;
                int var11 = arg1.field845 - (arg1.field876 - this.field116 - this.field116) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field854 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field875 = 0;
                arg1.field876 = 0;
            }
            int var12 = arg1.field854 - arg1.field846 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field867 && var12 <= 2048 - arg1.field867) {
                    if (var12 > 1024) {
                        arg1.field846 -= arg1.field867;
                    } else {
                        arg1.field846 += arg1.field867;
                    }
                } else {
                    arg1.field846 = arg1.field854;
                }
                arg1.field846 &= 2047;
                if (arg1.field868 == arg1.field832 && arg1.field854 != arg1.field846) {
                    if (arg1.field869 != -1) {
                        arg1.field832 = arg1.field869;
                        return;
                    }
                    arg1.field832 = arg1.field881;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLGSULPWKR;)V")
    public final void method129(boolean arg0, class16 arg1) {
        if (arg0) {
            this.field250 = -1;
        }
        arg1.field830 = false;
        if (arg1.field832 != -1) {
            class58 var3 = class58.field1560[arg1.field832];
            ++arg1.field834;
            if (arg1.field833 < var3.field1561 && arg1.field834 > var3.method525(0, arg1.field833)) {
                arg1.field834 = 0;
                ++arg1.field833;
            }
            if (arg1.field833 >= var3.field1561) {
                arg1.field834 = 0;
                arg1.field833 = 0;
            }
        }
        if (arg1.field859 != -1 && field419 >= arg1.field862) {
            if (arg1.field860 < 0) {
                arg1.field860 = 0;
            }
            class58 var4 = class3.field41[arg1.field859].field45;
            ++arg1.field861;
            while (arg1.field860 < var4.field1561 && arg1.field861 > var4.method525(0, arg1.field860)) {
                arg1.field861 -= var4.method525(0, arg1.field860);
                ++arg1.field860;
            }
            if (arg1.field860 >= var4.field1561 && (arg1.field860 < 0 || arg1.field860 >= var4.field1561)) {
                arg1.field859 = -1;
            }
        }
        if (arg1.field839 != -1 && arg1.field842 <= 1) {
            class58 var5 = class58.field1560[arg1.field839];
            if (var5.field1572 == 1 && arg1.field866 > 0 && arg1.field851 <= field419 && arg1.field852 < field419) {
                arg1.field842 = 1;
                return;
            }
        }
        if (arg1.field839 != -1 && arg1.field842 == 0) {
            class58 var6 = class58.field1560[arg1.field839];
            ++arg1.field841;
            while (arg1.field840 < var6.field1561 && arg1.field841 > var6.method525(0, arg1.field840)) {
                arg1.field841 -= var6.method525(0, arg1.field840);
                ++arg1.field840;
            }
            if (arg1.field840 >= var6.field1561) {
                arg1.field840 -= var6.field1565;
                ++arg1.field843;
                if (arg1.field843 >= var6.field1571) {
                    arg1.field839 = -1;
                }
                if (arg1.field840 < 0 || arg1.field840 >= var6.field1561) {
                    arg1.field839 = -1;
                }
            }
            arg1.field830 = var6.field1567;
        }
        if (arg1.field842 > 0) {
            --arg1.field842;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(B)V")
    public final void method130(byte arg0) {
        if (this.field289 != -1 && (this.field142 == 2 || super.field15 != null)) {
            if (this.field142 == 2) {
                this.method79(this.field194, this.field346, this.field289);
                if (this.field149 != -1) {
                    this.method79(this.field194, this.field346, this.field149);
                }
                this.field346 = 0;
                this.method121(this.field442);
                super.field15.method492((byte) -56);
                class39.field1341 = this.field280;
                class20.method286(0);
                this.field313 = true;
                class11 var2 = class11.method174(this.field289);
                if (var2.field661 == 512 && var2.field688 == 334 && var2.field707 == 0) {
                    var2.field661 = 765;
                    var2.field688 = 503;
                }
                this.method122(0, 481, 0, var2, 0);
                if (this.field149 != -1) {
                    class11 var3 = class11.method174(this.field149);
                    if (var3.field661 == 512 && var3.field688 == 334 && var3.field707 == 0) {
                        var3.field661 = 765;
                        var3.field688 = 503;
                    }
                    this.method122(0, 481, 0, var3, 0);
                }
                if (!this.field301) {
                    this.method109(-697);
                    this.method112(false);
                } else {
                    this.method90((byte) -10);
                }
            }
            super.field15.method493(584, 0, 0, super.field14);
        } else {
            if (this.field313) {
                this.method55(14922);
                this.field313 = false;
                this.field543.method493(584, 4, 0, super.field14);
                this.field544.method493(584, 357, 0, super.field14);
                this.field545.method493(584, 4, 722, super.field14);
                this.field546.method493(584, 205, 743, super.field14);
                this.field547.method493(584, 0, 0, super.field14);
                this.field548.method493(584, 4, 516, super.field14);
                this.field549.method493(584, 205, 516, super.field14);
                this.field550.method493(584, 357, 496, super.field14);
                this.field551.method493(584, 338, 0, super.field14);
                this.field431 = true;
                this.field343 = true;
                this.field471 = true;
                this.field281 = true;
                if (this.field142 != 2) {
                    this.field172.method493(584, 4, 4, super.field14);
                    this.field171.method493(584, 4, 550, super.field14);
                }
            }
            if (this.field142 == 2) {
                this.method93((byte) 126);
            }
            if (this.field301 && this.field422 == 1) {
                this.field431 = true;
            }
            if (this.field192 != -1) {
                boolean var4 = this.method79(this.field194, this.field346, this.field192);
                if (var4) {
                    this.field431 = true;
                }
            }
            if (this.field187 == 2) {
                this.field431 = true;
            }
            if (this.field213 == 2) {
                this.field431 = true;
            }
            if (this.field431) {
                this.method38(this.field145);
                this.field431 = false;
            }
            if (this.field67 == -1) {
                this.field340.field674 = this.field444 - this.field243 - 77;
                if (super.field22 > 448 && super.field22 < 560 && super.field23 > 332) {
                    this.method89(this.field444, -1, (byte) 43, 77, 463, this.field340, super.field23 - 357, 0, super.field22 - 17);
                }
                int var5 = this.field444 - 77 - this.field340.field674;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field444 - 77) {
                    var5 = this.field444 - 77;
                }
                if (this.field243 != var5) {
                    this.field243 = var5;
                    this.field343 = true;
                }
            }
            if (this.field67 != -1) {
                boolean var6 = this.method79(this.field194, this.field346, this.field67);
                if (var6) {
                    this.field343 = true;
                }
            }
            if (this.field187 == 3) {
                this.field343 = true;
            }
            if (this.field213 == 3) {
                this.field343 = true;
            }
            if (this.field69 != null) {
                this.field343 = true;
            }
            if (this.field301 && this.field422 == 2) {
                this.field343 = true;
            }
            if (this.field343) {
                this.method65(this.field153);
                this.field343 = false;
            }
            if (this.field142 == 2) {
                this.method108((byte) 9);
                this.field171.method493(584, 4, 550, super.field14);
            }
            if (this.field428 != -1) {
                this.field471 = true;
            }
            if (this.field471) {
                if (this.field428 != -1 && this.field515 == this.field428) {
                    this.field428 = -1;
                    this.field387.method191(this.field240, 119);
                    this.field387.method192(this.field515);
                }
                this.field471 = false;
                this.field76.method492((byte) -56);
                this.field535.method300(0, true, 0);
                if (this.field192 == -1) {
                    if (this.field541[this.field515] != -1) {
                        if (this.field515 == 0) {
                            this.field228.method300(10, true, 22);
                        }
                        if (this.field515 == 1) {
                            this.field229.method300(8, true, 54);
                        }
                        if (this.field515 == 2) {
                            this.field229.method300(8, true, 82);
                        }
                        if (this.field515 == 3) {
                            this.field230.method300(8, true, 110);
                        }
                        if (this.field515 == 4) {
                            this.field232.method300(8, true, 153);
                        }
                        if (this.field515 == 5) {
                            this.field232.method300(8, true, 181);
                        }
                        if (this.field515 == 6) {
                            this.field231.method300(9, true, 209);
                        }
                    }
                    if (this.field541[0] != -1 && (this.field428 != 0 || field419 % 20 < 10)) {
                        this.field459[0].method300(13, true, 29);
                    }
                    if (this.field541[1] != -1 && (this.field428 != 1 || field419 % 20 < 10)) {
                        this.field459[1].method300(11, true, 53);
                    }
                    if (this.field541[2] != -1 && (this.field428 != 2 || field419 % 20 < 10)) {
                        this.field459[2].method300(11, true, 82);
                    }
                    if (this.field541[3] != -1 && (this.field428 != 3 || field419 % 20 < 10)) {
                        this.field459[3].method300(12, true, 115);
                    }
                    if (this.field541[4] != -1 && (this.field428 != 4 || field419 % 20 < 10)) {
                        this.field459[4].method300(13, true, 153);
                    }
                    if (this.field541[5] != -1 && (this.field428 != 5 || field419 % 20 < 10)) {
                        this.field459[5].method300(11, true, 180);
                    }
                    if (this.field541[6] != -1 && (this.field428 != 6 || field419 % 20 < 10)) {
                        this.field459[6].method300(13, true, 208);
                    }
                }
                this.field76.method493(584, 160, 516, super.field14);
                ++field197;
                if (field197 > 77) {
                    field197 = 0;
                    this.field387.method191(this.field240, 116);
                }
                this.field75.method492((byte) -56);
                this.field534.method300(0, true, 0);
                if (this.field192 == -1) {
                    if (this.field541[this.field515] != -1) {
                        if (this.field515 == 7) {
                            this.field490.method300(0, true, 42);
                        }
                        if (this.field515 == 8) {
                            this.field491.method300(0, true, 74);
                        }
                        if (this.field515 == 9) {
                            this.field491.method300(0, true, 102);
                        }
                        if (this.field515 == 10) {
                            this.field492.method300(1, true, 130);
                        }
                        if (this.field515 == 11) {
                            this.field494.method300(0, true, 173);
                        }
                        if (this.field515 == 12) {
                            this.field494.method300(0, true, 201);
                        }
                        if (this.field515 == 13) {
                            this.field493.method300(0, true, 229);
                        }
                    }
                    if (this.field541[8] != -1 && (this.field428 != 8 || field419 % 20 < 10)) {
                        this.field459[7].method300(2, true, 74);
                    }
                    if (this.field541[9] != -1 && (this.field428 != 9 || field419 % 20 < 10)) {
                        this.field459[8].method300(3, true, 102);
                    }
                    if (this.field541[10] != -1 && (this.field428 != 10 || field419 % 20 < 10)) {
                        this.field459[9].method300(4, true, 137);
                    }
                    if (this.field541[11] != -1 && (this.field428 != 11 || field419 % 20 < 10)) {
                        this.field459[10].method300(2, true, 174);
                    }
                    if (this.field541[12] != -1 && (this.field428 != 12 || field419 % 20 < 10)) {
                        this.field459[11].method300(2, true, 201);
                    }
                    if (this.field541[13] != -1 && (this.field428 != 13 || field419 % 20 < 10)) {
                        this.field459[12].method300(2, true, 226);
                    }
                }
                this.field75.method493(584, 466, 496, super.field14);
                this.field172.method492((byte) -56);
                class39.field1341 = this.field279;
            }
            if (this.field281) {
                this.field281 = false;
                this.field74.method492((byte) -56);
                this.field533.method300(0, true, 0);
                this.field468.method474(true, 16777215, 0, 28, "Public chat", 55);
                if (this.field443 == 0) {
                    this.field468.method474(true, 65280, 0, 41, "On", 55);
                }
                if (this.field443 == 1) {
                    this.field468.method474(true, 16776960, 0, 41, "Friends", 55);
                }
                if (this.field443 == 2) {
                    this.field468.method474(true, 16711680, 0, 41, "Off", 55);
                }
                if (this.field443 == 3) {
                    this.field468.method474(true, 65535, 0, 41, "Hide", 55);
                }
                this.field468.method474(true, 16777215, 0, 28, "Private chat", 184);
                if (this.field353 == 0) {
                    this.field468.method474(true, 65280, 0, 41, "On", 184);
                }
                if (this.field353 == 1) {
                    this.field468.method474(true, 16776960, 0, 41, "Friends", 184);
                }
                if (this.field353 == 2) {
                    this.field468.method474(true, 16711680, 0, 41, "Off", 184);
                }
                this.field468.method474(true, 16777215, 0, 28, "Trade/compete", 324);
                if (this.field190 == 0) {
                    this.field468.method474(true, 65280, 0, 41, "On", 324);
                }
                if (this.field190 == 1) {
                    this.field468.method474(true, 16776960, 0, 41, "Friends", 324);
                }
                if (this.field190 == 2) {
                    this.field468.method474(true, 16711680, 0, 41, "Off", 324);
                }
                this.field468.method474(true, 16777215, 0, 33, "Report abuse", 458);
                this.field74.method493(584, 453, 0, super.field14);
                this.field172.method492((byte) -56);
                class39.field1341 = this.field279;
            }
            this.field346 = 0;
            if (arg0 != 9) {
                for (int var7 = 1; var7 > 0; ++var7) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILGSULPWKR;Z)V")
    public final void method131(int arg0, class16 arg1, boolean arg2) {
        this.method132(arg1.field844, arg1.field845, arg0, 0);
        if (arg2) {
            this.field387.method192(33);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method132(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
            int var5 = this.method34(arg1, 215, this.field105, arg0) - arg2;
            this.field249 += arg3;
            int var6 = arg0 - this.field324;
            int var7 = var5 - this.field325;
            int var8 = arg1 - this.field326;
            int var9 = class35.field1269[this.field327];
            int var10 = class35.field1270[this.field327];
            int var11 = class35.field1269[this.field328];
            int var12 = class35.field1270[this.field328];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field341 = (var13 << 9) / var17 + class39.field1335;
                this.field342 = (var16 << 9) / var17 + class39.field1336;
            } else {
                this.field341 = -1;
                this.field342 = -1;
            }
        } else {
            this.field341 = -1;
            this.field342 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILGHHPHSRU;LEJJAKGTE;B)V")
    private final void method133(int arg0, int arg1, class14 arg2, class10 arg3, byte arg4) {
        if (arg4 != 91) {
            this.field250 = arg2.method202();
        }
        if ((arg0 & 64) != 0) {
            arg3.field874 = arg2.method230(0);
            if (arg3.field874 == 65535) {
                arg3.field874 = -1;
            }
        }
        if ((arg0 & 8) != 0) {
            arg3.field875 = arg2.method230(0);
            arg3.field876 = arg2.method230(0);
        }
        if ((arg0 & 32) != 0) {
            int var6 = arg2.method229((byte) 4);
            int var7 = arg2.method202();
            int var8 = arg2.method223((byte) -82);
            int var9 = arg2.field769;
            if (arg3.field625 != null && arg3.field645) {
                long var10 = class55.method510(arg3.field625);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < this.field219; ++var13) {
                        if (this.field482[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && this.field356 == 0) {
                    try {
                        this.field404.field769 = 0;
                        arg2.method239(var8, 4, this.field404.field768, 0);
                        this.field404.field769 = 0;
                        String var14 = class41.method464(-375, this.field404, var8);
                        String var15 = class17.method255(810, var14);
                        arg3.field837 = var15;
                        arg3.field864 = var6 >> 8;
                        arg3.field885 = var6 & 255;
                        arg3.field831 = 150;
                        if (var7 != 2 && var7 != 3) {
                            if (var7 == 1) {
                                this.method31("@cr1@" + arg3.field625, true, var15, 1);
                            } else {
                                this.method31(arg3.field625, true, var15, 2);
                            }
                        } else {
                            this.method31("@cr2@" + arg3.field625, true, var15, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field769 = var8 + var9;
        }
        if ((arg0 & 1) != 0) {
            arg3.field837 = arg2.method209();
            if (arg3.field837.charAt(0) == '~') {
                arg3.field837 = arg3.field837.substring(1);
                this.method31(arg3.field625, true, arg3.field837, 2);
            } else if (field73 == arg3) {
                this.method31(arg3.field625, true, arg3.field837, 2);
            }
            arg3.field864 = 0;
            arg3.field885 = 0;
            arg3.field831 = 150;
        }
        if ((arg0 & 4) != 0) {
            int var17 = arg2.method223((byte) -82);
            byte[] var18 = new byte[var17];
            class14 var19 = new class14(-527, var18);
            arg2.method240(var17, 0, true, var18);
            this.field455[arg1] = var19;
            arg3.method173(285, var19);
        }
        if ((arg0 & 512) != 0) {
            arg3.field859 = arg2.method229((byte) 4);
            int var20 = arg2.method237((byte) 102);
            arg3.field863 = var20 >> 16;
            arg3.field862 = (var20 & 65535) + field419;
            arg3.field860 = 0;
            arg3.field861 = 0;
            if (arg3.field862 > field419) {
                arg3.field860 = -1;
            }
            if (arg3.field859 == 65535) {
                arg3.field859 = -1;
            }
        }
        if ((arg0 & 1024) != 0) {
            int var21 = arg2.method202();
            int var22 = arg2.method202();
            arg3.method243(var22, true, var21, field419);
            arg3.field877 = field419 + 300;
            arg3.field878 = arg2.method221((byte) 49);
            arg3.field879 = arg2.method221((byte) 49);
        }
        if ((arg0 & 2) != 0) {
            int var23 = arg2.method204();
            if (var23 == 65535) {
                var23 = -1;
            }
            int var24 = arg2.method202();
            if (arg3.field839 == var23 && var23 != -1) {
                int var25 = class58.field1560[var23].field1574;
                if (var25 == 1) {
                    arg3.field840 = 0;
                    arg3.field841 = 0;
                    arg3.field842 = var24;
                    arg3.field843 = 0;
                }
                if (var25 == 2) {
                    arg3.field843 = 0;
                }
            } else if (var23 == -1 || arg3.field839 == -1 || class58.field1560[var23].field1568 >= class58.field1560[arg3.field839].field1568) {
                arg3.field839 = var23;
                arg3.field840 = 0;
                arg3.field841 = 0;
                arg3.field842 = var24;
                arg3.field843 = 0;
                arg3.field866 = arg3.field865;
            }
        }
        if ((arg0 & 128) != 0) {
            int var26 = arg2.method221((byte) 49);
            int var27 = arg2.method223((byte) -82);
            arg3.method243(var27, true, var26, field419);
            arg3.field877 = field419 + 300;
            arg3.field878 = arg2.method202();
            arg3.field879 = arg2.method202();
        }
        if ((arg0 & 256) != 0) {
            arg3.field847 = arg2.method222(-6);
            arg3.field849 = arg2.method223((byte) -82);
            arg3.field848 = arg2.method222(-6);
            arg3.field850 = arg2.method223((byte) -82);
            arg3.field851 = arg2.method204() + field419;
            arg3.field852 = arg2.method229((byte) 4) + field419;
            arg3.field853 = arg2.method222(-6);
            arg3.method244(772);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method134(int arg0, int arg1) {
        class57 var3 = this.field162[this.field105][arg0][arg1];
        if (var3 == null) {
            this.field239.method330(this.field105, arg0, arg1);
        } else {
            int var4 = -99999999;
            class18 var5 = null;
            for (class18 var6 = (class18) var3.method519(); var6 != null; var6 = (class18) var3.method521(5)) {
                class72 var11 = class72.method590(var6.field908);
                int var12 = var11.field1740;
                if (var11.field1754) {
                    var12 = (var6.field909 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method517(var5, (byte) -3);
            class18 var7 = null;
            class18 var8 = null;
            for (class18 var9 = (class18) var3.method519(); var9 != null; var9 = (class18) var3.method521(5)) {
                if (var5.field908 != var9.field908 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field908 != var9.field908 && var7.field908 != var9.field908 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field239.method316(this.field105, arg1, 0, var10, arg0, var5, this.method34(arg1 * 128 + 64, 215, this.field105, arg0 * 128 + 64), var8, var7);
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method135(int arg0) {
        this.field249 += arg0;
        try {
            int var2 = field73.field844 + this.field519;
            int var3 = field73.field845 + this.field294;
            if (this.field392 - var2 < -500 || this.field392 - var2 > 500 || this.field393 - var3 < -500 || this.field393 - var3 > 500) {
                this.field392 = var2;
                this.field393 = var3;
            }
            if (this.field392 != var2) {
                this.field392 += (var2 - this.field392) / 16;
            }
            if (this.field393 != var3) {
                this.field393 += (var3 - this.field393) / 16;
            }
            if (super.field32[1] == 1) {
                this.field485 += (-24 - this.field485) / 2;
            } else if (super.field32[2] == 1) {
                this.field485 += (24 - this.field485) / 2;
            } else {
                this.field485 /= 2;
            }
            if (super.field32[3] == 1) {
                this.field486 += (12 - this.field486) / 2;
            } else if (super.field32[4] == 1) {
                this.field486 += (-12 - this.field486) / 2;
            } else {
                this.field486 /= 2;
            }
            this.field484 = this.field485 / 2 + this.field484 & 2047;
            this.field483 += this.field486 / 2;
            if (this.field483 < 128) {
                this.field483 = 128;
            }
            if (this.field483 > 383) {
                this.field483 = 383;
            }
            int var4 = this.field392 >> 7;
            int var5 = this.field393 >> 7;
            int var6 = this.method34(this.field393, 215, this.field105, this.field392);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field105;
                        if (var10 < 3 && (this.field439[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field72[var10][var8][var9];
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
            if (var12 > this.field339) {
                this.field339 += (var12 - this.field339) / 24;
            } else if (var12 < this.field339) {
                this.field339 += (var12 - this.field339) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field73.field844 + "," + field73.field845 + "," + this.field392 + "," + this.field393 + "," + this.field178 + "," + this.field179 + "," + this.field115 + "," + this.field116);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method136(int arg0, int arg1, boolean arg2) {
        if (arg0 == 28068) {
            signlink.midivol = arg1;
            if (arg2) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLFNOFBEYP;)V")
    private final void method137(boolean arg0, class13 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field747 == 0) {
            var3 = this.field239.method335(arg1.field746, arg1.field748, arg1.field749);
        }
        if (arg1.field747 == 1) {
            var3 = this.field239.method336(arg1.field746, (byte) 70, arg1.field749, arg1.field748);
        }
        if (arg1.field747 == 2) {
            var3 = this.field239.method337(arg1.field746, arg1.field748, arg1.field749);
        }
        if (arg1.field747 == 3) {
            var3 = this.field239.method338(arg1.field746, arg1.field748, arg1.field749);
        }
        if (var3 != 0) {
            int var7 = this.field239.method339(arg1.field746, arg1.field748, arg1.field749, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field738 = var4;
        arg1.field740 = var5;
        if (arg0) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        arg1.field739 = var6;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JB)V")
    public final void method138(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field263 >= 100 && this.field120 != 1) {
                this.method31("", true, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else if (this.field263 >= 200) {
                this.method31("", true, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else {
                String var4 = class55.method514(class55.method511(arg0, 622), -36397);
                for (int var5 = 0; var5 < this.field263; ++var5) {
                    if (this.field242[var5] == arg0) {
                        this.method31("", true, var4 + " is already on your friend list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field219; ++var6) {
                    if (this.field482[var6] == arg0) {
                        this.method31("", true, "Please remove " + var4 + " from your ignore list first", 0);
                        return;
                    }
                }
                if (arg1 != -66) {
                    this.field314 = !this.field314;
                }
                if (!var4.equals(field73.field625)) {
                    this.field209[this.field263] = var4;
                    this.field242[this.field263] = arg0;
                    this.field210[this.field263] = 0;
                    ++this.field263;
                    this.field431 = true;
                    this.field387.method191(this.field240, 177);
                    this.field387.method198(arg0, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method9(byte arg0) {
        if (!this.field364 && !this.field270 && !this.field261) {
            ++field323;
            if (arg0 == -115) {
                if (!this.field238) {
                    this.method94(false, false);
                } else {
                    this.method130((byte) 9);
                }
                this.field288 = 0;
            }
        } else {
            this.method96(this.field337);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method139(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        return arg0 >= 0 ? 4 : ((arg1 & 16711935) * arg3 + (arg2 & 16711935) * var5 & -16711936) + ((arg1 & 65280) * arg3 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IB)V")
    public final void method140(int arg0, byte arg1) {
        if (arg0 >= 0) {
            if (this.field334 != 0) {
                this.field334 = 0;
                this.field343 = true;
            }
            int var3 = this.field358[arg0];
            int var4 = this.field359[arg0];
            int var5 = this.field360[arg0];
            int var6 = this.field361[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 775) {
                this.field387.method191(this.field240, 182);
                this.field387.method193(var3);
                this.field387.method193(this.field505);
                this.field387.method227(955, var4);
                this.field387.method193(this.field503);
                this.field387.method228(var6, 725);
                this.field387.method228(this.field504, 725);
                this.field184 = 0;
                this.field185 = var4;
                this.field186 = var3;
                this.field187 = 2;
                if (class11.method174(var4).field675 == this.field78) {
                    this.field187 = 1;
                }
                if (class11.method174(var4).field675 == this.field67) {
                    this.field187 = 3;
                }
            }
            if (var5 == 658) {
                boolean var7 = this.method64(var4, 0, var3, 0, 0, (byte) 37, 0, 2, false, field73.field835[0], 0, field73.field836[0]);
                if (!var7) {
                    this.method64(var4, 0, var3, 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                }
                this.field283 = super.field29;
                this.field284 = super.field30;
                this.field286 = 2;
                this.field285 = 0;
                this.field387.method191(this.field240, 189);
                this.field387.method193(this.field116 + var4);
                this.field387.method226(9, var6);
                this.field387.method193(this.field115 + var3);
            }
            if (var5 == 595) {
                boolean var9 = this.method64(var4, 0, var3, 0, 0, (byte) 37, 0, 2, false, field73.field835[0], 0, field73.field836[0]);
                if (!var9) {
                    this.method64(var4, 0, var3, 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                }
                this.field283 = super.field29;
                this.field284 = super.field30;
                this.field286 = 2;
                this.field285 = 0;
                if ((this.field116 & 3) == 0) {
                    ++field472;
                }
                if (field472 >= 84) {
                    this.field387.method191(this.field240, 48);
                    this.field387.method196(0);
                    field472 = 0;
                }
                this.field387.method191(this.field240, 8);
                this.field387.method193(this.field115 + var3);
                this.field387.method227(955, this.field116 + var4);
                this.field387.method227(955, var6);
            }
            if (var5 == 39) {
                this.field387.method191(this.field240, 84);
                this.field387.method193(var6);
                this.field387.method226(9, this.field377);
                this.field387.method193(var4);
                this.field387.method226(9, var3);
                this.field184 = 0;
                this.field185 = var4;
                this.field186 = var3;
                this.field187 = 2;
                if (class11.method174(var4).field675 == this.field78) {
                    this.field187 = 1;
                }
                if (class11.method174(var4).field675 == this.field67) {
                    this.field187 = 3;
                }
            }
            if (var5 == 687) {
                boolean var11 = this.method64(var4, 0, var3, 0, 0, (byte) 37, 0, 2, false, field73.field835[0], 0, field73.field836[0]);
                if (!var11) {
                    this.method64(var4, 0, var3, 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                }
                this.field283 = super.field29;
                this.field284 = super.field30;
                this.field286 = 2;
                this.field285 = 0;
                field458 += this.field115;
                if (field458 >= 132) {
                    this.field387.method191(this.field240, 205);
                    this.field387.method196(0);
                    field458 = 0;
                }
                this.field387.method191(this.field240, 57);
                this.field387.method226(9, this.field115 + var3);
                this.field387.method226(9, var6);
                this.field387.method228(this.field116 + var4, 725);
            }
            if (var5 == 1893) {
                class72 var13 = class72.method590(var6);
                class11 var14 = class11.method174(var4);
                String var15;
                if (var14 != null && var14.field715[var3] >= 100000) {
                    var15 = var14.field715[var3] + " x " + var13.field1727;
                } else if (var13.field1732 != null) {
                    var15 = new String(var13.field1732);
                } else {
                    var15 = "It's a " + var13.field1727 + ".";
                }
                this.method31("", true, var15, 0);
            }
            if (var5 == 261) {
                class10 var16 = this.field450[var6];
                if (var16 != null) {
                    this.method64(var16.field836[0], 0, var16.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                    this.field283 = super.field29;
                    this.field284 = super.field30;
                    this.field286 = 2;
                    this.field285 = 0;
                    this.field387.method191(this.field240, 188);
                    this.field387.method226(9, var6);
                }
            }
            if (var5 == 1408) {
                class72 var17 = class72.method590(var6);
                String var18;
                if (var17.field1732 != null) {
                    var18 = new String(var17.field1732);
                } else {
                    var18 = "It's a " + var17.field1727 + ".";
                }
                this.method31("", true, var18, 0);
            }
            if (var5 == 886) {
                class24 var19 = this.field405[var6];
                if (var19 != null) {
                    this.method64(var19.field836[0], 0, var19.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                    this.field283 = super.field29;
                    this.field284 = super.field30;
                    this.field286 = 2;
                    this.field285 = 0;
                    this.field387.method191(this.field240, 212);
                    this.field387.method228(var6, 725);
                }
            }
            if (var5 == 723) {
                class24 var20 = this.field405[var6];
                if (var20 != null) {
                    this.method64(var20.field836[0], 0, var20.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                    this.field283 = super.field29;
                    this.field284 = super.field30;
                    this.field286 = 2;
                    this.field285 = 0;
                    this.field387.method191(this.field240, 81);
                    this.field387.method227(955, var6);
                }
            }
            if (var5 == 337) {
                this.method104(var4, var6, (byte) 9, var3);
                this.field387.method191(this.field240, 75);
                this.field387.method227(955, this.field115 + var3);
                this.field387.method193(this.field116 + var4);
                this.field387.method227(955, var6 >> 14 & 32767);
            }
            if (var5 == 1892) {
                class24 var21 = this.field405[var6];
                if (var21 != null) {
                    class6 var22 = var21.field987;
                    if (var22.field583 != null) {
                        var22 = var22.method164(46311);
                    }
                    if (var22 != null) {
                        String var23;
                        if (var22.field569 != null) {
                            var23 = new String(var22.field569);
                        } else {
                            var23 = "It's a " + var22.field591 + ".";
                        }
                        this.method31("", true, var23, 0);
                    }
                }
            }
            if (var5 == 506) {
                if (!this.field301) {
                    this.field239.method347((byte) 0, super.field29 - 4, super.field30 - 4);
                } else {
                    this.field239.method347((byte) 0, var3 - 4, var4 - 4);
                }
            }
            if (var5 == 838) {
                this.method154(0);
            }
            if (var5 == 708) {
                if ((var6 & 3) == 0) {
                    ++field521;
                }
                if (field521 >= 102) {
                    this.field387.method191(this.field240, 106);
                    this.field387.method196(0);
                    field521 = 0;
                }
                this.field387.method191(this.field240, 136);
                this.field387.method228(var6, 725);
                this.field387.method227(955, var3);
                this.field387.method227(955, var4);
                this.field184 = 0;
                this.field185 = var4;
                this.field186 = var3;
                this.field187 = 2;
                if (class11.method174(var4).field675 == this.field78) {
                    this.field187 = 1;
                }
                if (class11.method174(var4).field675 == this.field67) {
                    this.field187 = 3;
                }
            }
            if (var5 == 473) {
                class10 var24 = this.field450[var6];
                if (var24 != null) {
                    this.method64(var24.field836[0], 0, var24.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                    this.field283 = super.field29;
                    this.field284 = super.field30;
                    this.field286 = 2;
                    this.field285 = 0;
                    this.field387.method191(this.field240, 12);
                    this.field387.method226(9, var6);
                }
            }
            if (var5 == 148) {
                this.field387.method191(this.field240, 58);
                this.field387.method193(var4);
                this.field387.method228(var3, 725);
                this.field387.method226(9, var6);
                this.field184 = 0;
                this.field185 = var4;
                this.field186 = var3;
                this.field187 = 2;
                if (class11.method174(var4).field675 == this.field78) {
                    this.field187 = 1;
                }
                if (class11.method174(var4).field675 == this.field67) {
                    this.field187 = 3;
                }
            }
            if (var5 == 1586) {
                this.method104(var4, var6, (byte) 9, var3);
                this.field387.method191(this.field240, 109);
                this.field387.method228(var6 >> 14 & 32767, 725);
                this.field387.method226(9, this.field116 + var4);
                this.field387.method193(this.field115 + var3);
            }
            if (var5 == 484 && this.method104(var4, var6, (byte) 9, var3)) {
                this.field387.method191(this.field240, 245);
                this.field387.method226(9, this.field115 + var3);
                this.field387.method227(955, this.field504);
                this.field387.method228(this.field503, 725);
                this.field387.method193(var6 >> 14 & 32767);
                this.field387.method226(9, this.field505);
                this.field387.method228(this.field116 + var4, 725);
            }
            if (var5 == 910) {
                this.field387.method191(this.field240, 206);
                this.field387.method193(var3);
                this.field387.method228(var6, 725);
                this.field387.method226(9, var4);
                this.field184 = 0;
                this.field185 = var4;
                this.field186 = var3;
                this.field187 = 2;
                if (class11.method174(var4).field675 == this.field78) {
                    this.field187 = 1;
                }
                if (class11.method174(var4).field675 == this.field67) {
                    this.field187 = 3;
                }
            }
            if (var5 == 893) {
                class24 var25 = this.field405[var6];
                if (var25 != null) {
                    this.method64(var25.field836[0], 0, var25.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                    this.field283 = super.field29;
                    this.field284 = super.field30;
                    this.field286 = 2;
                    this.field285 = 0;
                    this.field387.method191(this.field240, 232);
                    this.field387.method226(9, this.field377);
                    this.field387.method228(var6, 725);
                }
            }
            if (var5 == 230) {
                boolean var26 = this.method64(var4, 0, var3, 0, 0, (byte) 37, 0, 2, false, field73.field835[0], 0, field73.field836[0]);
                if (!var26) {
                    this.method64(var4, 0, var3, 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                }
                this.field283 = super.field29;
                this.field284 = super.field30;
                this.field286 = 2;
                this.field285 = 0;
                this.field387.method191(this.field240, 46);
                this.field387.method228(var6, 725);
                this.field387.method226(9, this.field115 + var3);
                this.field387.method228(this.field116 + var4, 725);
            }
            if (var5 == 874) {
                this.field502 = 1;
                this.field503 = var3;
                this.field504 = var4;
                this.field505 = var6;
                this.field506 = class72.method590(var6).field1727;
                this.field376 = 0;
                this.field431 = true;
            } else {
                if (var5 == 778) {
                    class10 var28 = this.field450[var6];
                    if (var28 != null) {
                        this.method64(var28.field836[0], 0, var28.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                        this.field283 = super.field29;
                        this.field284 = super.field30;
                        this.field286 = 2;
                        this.field285 = 0;
                        this.field387.method191(this.field240, 41);
                        this.field387.method226(9, var6);
                    }
                }
                if (var5 == 554) {
                    class10 var29 = this.field450[var6];
                    if (var29 != null) {
                        this.method64(var29.field836[0], 0, var29.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                        this.field283 = super.field29;
                        this.field284 = super.field30;
                        this.field286 = 2;
                        this.field285 = 0;
                        ++field207;
                        if (field207 >= 145) {
                            this.field387.method191(this.field240, 64);
                            this.field387.method192(5);
                            field207 = 0;
                        }
                        this.field387.method191(this.field240, 68);
                        this.field387.method193(var6);
                    }
                }
                if (var5 == 896) {
                    class11 var30 = class11.method174(var4);
                    this.field376 = 1;
                    this.field377 = var4;
                    this.field378 = var30.field712;
                    this.field502 = 0;
                    this.field431 = true;
                    String var31 = var30.field673;
                    if (var31.indexOf(" ") != -1) {
                        var31 = var31.substring(0, var31.indexOf(" "));
                    }
                    String var32 = var30.field673;
                    if (var32.indexOf(" ") != -1) {
                        var32 = var32.substring(var32.indexOf(" ") + 1);
                    }
                    this.field379 = var31 + " " + var30.field653 + " " + var32;
                    if (this.field378 == 16) {
                        this.field431 = true;
                        this.field515 = 3;
                        this.field471 = true;
                    }
                } else {
                    if (var5 == 633) {
                        String var33 = this.field262[arg0];
                        int var34 = var33.indexOf("@whi@");
                        if (var34 != -1) {
                            long var35 = class55.method510(var33.substring(var34 + 5).trim());
                            int var37 = -1;
                            for (int var38 = 0; var38 < this.field263; ++var38) {
                                if (this.field242[var38] == var35) {
                                    var37 = var38;
                                    break;
                                }
                            }
                            if (var37 != -1 && this.field210[var37] > 0) {
                                this.field343 = true;
                                this.field334 = 0;
                                this.field435 = true;
                                this.field266 = "";
                                this.field329 = 3;
                                this.field418 = this.field242[var37];
                                this.field396 = "Enter message to send to " + this.field209[var37];
                            }
                        }
                    }
                    if (var5 == 994) {
                        this.field387.method191(this.field240, 87);
                        this.field387.method227(955, var3);
                        this.field387.method227(955, var6);
                        this.field387.method228(var4, 725);
                        this.field184 = 0;
                        this.field185 = var4;
                        this.field186 = var3;
                        this.field187 = 2;
                        if (class11.method174(var4).field675 == this.field78) {
                            this.field187 = 1;
                        }
                        if (class11.method174(var4).field675 == this.field67) {
                            this.field187 = 3;
                        }
                    }
                    if (var5 == 645) {
                        class24 var39 = this.field405[var6];
                        if (var39 != null) {
                            this.method64(var39.field836[0], 0, var39.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                            this.field283 = super.field29;
                            this.field284 = super.field30;
                            this.field286 = 2;
                            this.field285 = 0;
                            this.field387.method191(this.field240, 18);
                            this.field387.method193(var6);
                        }
                    }
                    if (var5 == 1138) {
                        int var40 = var6 >> 14 & 32767;
                        class28 var41 = class28.method365(var40);
                        String var42;
                        if (var41.field1079 != null) {
                            var42 = new String(var41.field1079);
                        } else {
                            var42 = "It's a " + var41.field1113 + ".";
                        }
                        this.method31("", true, var42, 0);
                    }
                    if (var5 == 840) {
                        this.field387.method191(this.field240, 247);
                        this.field387.method226(9, var3);
                        this.field387.method227(955, var4);
                        this.field387.method193(var6);
                        this.field184 = 0;
                        this.field185 = var4;
                        this.field186 = var3;
                        this.field187 = 2;
                        if (class11.method174(var4).field675 == this.field78) {
                            this.field187 = 1;
                        }
                        if (class11.method174(var4).field675 == this.field67) {
                            this.field187 = 3;
                        }
                    }
                    if (var5 == 670) {
                        boolean var43 = this.method64(var4, 0, var3, 0, 0, (byte) 37, 0, 2, false, field73.field835[0], 0, field73.field836[0]);
                        if (!var43) {
                            this.method64(var4, 0, var3, 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                        }
                        this.field283 = super.field29;
                        this.field284 = super.field30;
                        this.field286 = 2;
                        this.field285 = 0;
                        this.field387.method191(this.field240, 185);
                        this.field387.method228(var6, 725);
                        this.field387.method227(955, this.field116 + var4);
                        this.field387.method227(955, this.field115 + var3);
                    }
                    if (var5 == 667) {
                        class24 var45 = this.field405[var6];
                        if (var45 != null) {
                            this.method64(var45.field836[0], 0, var45.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                            this.field283 = super.field29;
                            this.field284 = super.field30;
                            this.field286 = 2;
                            this.field285 = 0;
                            this.field387.method191(this.field240, 170);
                            this.field387.method227(955, var6);
                        }
                    }
                    if (var5 == 395) {
                        class10 var46 = this.field450[var6];
                        if (var46 != null) {
                            this.method64(var46.field836[0], 0, var46.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                            this.field283 = super.field29;
                            this.field284 = super.field30;
                            this.field286 = 2;
                            this.field285 = 0;
                            this.field387.method191(this.field240, 149);
                            this.field387.method227(955, var6);
                            this.field387.method193(this.field503);
                            this.field387.method227(955, this.field504);
                            this.field387.method227(955, this.field505);
                        }
                    }
                    if (var5 == 134) {
                        class10 var47 = this.field450[var6];
                        if (var47 != null) {
                            this.method64(var47.field836[0], 0, var47.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                            this.field283 = super.field29;
                            this.field284 = super.field30;
                            this.field286 = 2;
                            this.field285 = 0;
                            this.field387.method191(this.field240, 171);
                            this.field387.method228(var6, 725);
                        }
                    }
                    if (var5 == 507) {
                        this.field387.method191(this.field240, 27);
                        this.field387.method193(var4);
                        class11 var48 = class11.method174(var4);
                        if (var48.field689 != null && var48.field689[0][0] == 5) {
                            int var49 = var48.field689[0][1];
                            if (this.field539[var49] != var48.field669[0]) {
                                this.field539[var49] = var48.field669[0];
                                this.method60(true, var49);
                                this.field431 = true;
                            }
                        }
                    }
                    if (var5 == 637) {
                        this.field387.method191(this.field240, 54);
                        this.field387.method227(955, var6);
                        this.field387.method226(9, var3);
                        this.field387.method226(9, var4);
                        this.field184 = 0;
                        this.field185 = var4;
                        this.field186 = var3;
                        this.field187 = 2;
                        if (class11.method174(var4).field675 == this.field78) {
                            this.field187 = 1;
                        }
                        if (class11.method174(var4).field675 == this.field67) {
                            this.field187 = 3;
                        }
                    }
                    if (var5 == 951) {
                        this.method92(this.field138, 15);
                        this.field138 = -1;
                        this.field343 = true;
                    }
                    if (var5 == 681) {
                        class10 var50 = this.field450[var6];
                        if (var50 != null) {
                            this.method64(var50.field836[0], 0, var50.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                            this.field283 = super.field29;
                            this.field284 = super.field30;
                            this.field286 = 2;
                            this.field285 = 0;
                            this.field387.method191(this.field240, 45);
                            this.field387.method193(this.field377);
                            this.field387.method227(955, var6);
                        }
                    }
                    if (var5 == 592) {
                        this.field387.method191(this.field240, 121);
                        this.field387.method226(9, var3);
                        this.field387.method226(9, var6);
                        this.field387.method227(955, var4);
                        this.field184 = 0;
                        this.field185 = var4;
                        this.field186 = var3;
                        this.field187 = 2;
                        if (class11.method174(var4).field675 == this.field78) {
                            this.field187 = 1;
                        }
                        if (class11.method174(var4).field675 == this.field67) {
                            this.field187 = 3;
                        }
                    }
                    if (var5 == 807 && this.method104(var4, var6, (byte) 9, var3)) {
                        this.field387.method191(this.field240, 155);
                        this.field387.method227(955, var6 >> 14 & 32767);
                        this.field387.method228(this.field116 + var4, 725);
                        this.field387.method228(this.field115 + var3, 725);
                        this.field387.method193(this.field377);
                    }
                    if (var5 == 532 || var5 == 938) {
                        String var51 = this.field262[arg0];
                        int var52 = var51.indexOf("@whi@");
                        if (var52 != -1) {
                            String var53 = var51.substring(var52 + 5).trim();
                            String var54 = class55.method514(class55.method511(class55.method510(var53), 622), -36397);
                            boolean var55 = false;
                            for (int var56 = 0; var56 < this.field451; ++var56) {
                                class10 var57 = this.field450[this.field452[var56]];
                                if (var57 != null && var57.field625 != null && var57.field625.equalsIgnoreCase(var54)) {
                                    this.method64(var57.field836[0], 0, var57.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                                    if (var5 == 532) {
                                        ++field207;
                                        if (field207 >= 145) {
                                            this.field387.method191(this.field240, 64);
                                            this.field387.method192(5);
                                            field207 = 0;
                                        }
                                        this.field387.method191(this.field240, 68);
                                        this.field387.method193(this.field452[var56]);
                                    }
                                    if (var5 == 938) {
                                        this.field387.method191(this.field240, 171);
                                        this.field387.method228(this.field452[var56], 725);
                                    }
                                    var55 = true;
                                    break;
                                }
                            }
                            if (!var55) {
                                this.method31("", true, "Unable to find " + var54, 0);
                            }
                        }
                    }
                    if (var5 == 663) {
                        class11 var58 = class11.method174(var4);
                        boolean var59 = true;
                        if (var58.field713 > 0) {
                            var59 = this.method84(var58, (byte) -127);
                        }
                        if (var59) {
                            this.field387.method191(this.field240, 27);
                            this.field387.method193(var4);
                        }
                    }
                    if (var5 == 17) {
                        this.field387.method191(this.field240, 161);
                        this.field387.method227(955, var6);
                        this.field387.method193(var3);
                        this.field387.method228(var4, 725);
                        this.field184 = 0;
                        this.field185 = var4;
                        this.field186 = var3;
                        this.field187 = 2;
                        if (class11.method174(var4).field675 == this.field78) {
                            this.field187 = 1;
                        }
                        if (class11.method174(var4).field675 == this.field67) {
                            this.field187 = 3;
                        }
                    }
                    if (var5 == 78) {
                        boolean var60 = this.method64(var4, 0, var3, 0, 0, (byte) 37, 0, 2, false, field73.field835[0], 0, field73.field836[0]);
                        if (!var60) {
                            this.method64(var4, 0, var3, 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                        }
                        this.field283 = super.field29;
                        this.field284 = super.field30;
                        this.field286 = 2;
                        this.field285 = 0;
                        this.field387.method191(this.field240, 96);
                        this.field387.method227(955, this.field377);
                        this.field387.method226(9, var6);
                        this.field387.method193(this.field116 + var4);
                        this.field387.method228(this.field115 + var3, 725);
                    }
                    if (var5 == 237) {
                        class24 var62 = this.field405[var6];
                        if (var62 != null) {
                            this.method64(var62.field836[0], 0, var62.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                            this.field283 = super.field29;
                            this.field284 = super.field30;
                            this.field286 = 2;
                            this.field285 = 0;
                            this.field387.method191(this.field240, 62);
                            this.field387.method226(9, var6);
                            this.field387.method226(9, this.field504);
                            this.field387.method227(955, this.field505);
                            this.field387.method193(this.field503);
                        }
                    }
                    if (var5 == 496) {
                        if ((var4 & 3) == 0) {
                            ++field429;
                        }
                        if (field429 >= 94) {
                            this.field387.method191(this.field240, 209);
                            this.field387.method192(102);
                            field429 = 0;
                        }
                        this.method104(var4, var6, (byte) 9, var3);
                        this.field387.method191(this.field240, 202);
                        this.field387.method193(this.field115 + var3);
                        this.field387.method228(var6 >> 14 & 32767, 725);
                        this.field387.method193(this.field116 + var4);
                    }
                    if (var5 == 338 && !this.field271) {
                        this.field387.method191(this.field240, 24);
                        this.field387.method193(var4);
                        this.field271 = true;
                    }
                    if (var5 == 423) {
                        class24 var63 = this.field405[var6];
                        if (var63 != null) {
                            this.method64(var63.field836[0], 0, var63.field835[0], 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                            this.field283 = super.field29;
                            this.field284 = super.field30;
                            this.field286 = 2;
                            this.field285 = 0;
                            this.field387.method191(this.field240, 32);
                            this.field387.method228(var6, 725);
                        }
                    }
                    if (var5 == 846) {
                        this.method104(var4, var6, (byte) 9, var3);
                        this.field387.method191(this.field240, 83);
                        this.field387.method226(9, this.field116 + var4);
                        this.field387.method228(this.field115 + var3, 725);
                        this.field387.method226(9, var6 >> 14 & 32767);
                    }
                    if (var5 == 68) {
                        this.field387.method191(this.field240, 74);
                        this.field387.method226(9, var6);
                        this.field387.method228(var4, 725);
                        this.field387.method227(955, var3);
                        this.field184 = 0;
                        this.field185 = var4;
                        this.field186 = var3;
                        this.field187 = 2;
                        if (class11.method174(var4).field675 == this.field78) {
                            this.field187 = 1;
                        }
                        if (class11.method174(var4).field675 == this.field67) {
                            this.field187 = 3;
                        }
                    }
                    if (var5 == 538) {
                        field177 += var6;
                        if (field177 >= 136) {
                            this.field387.method191(this.field240, 237);
                            field177 = 0;
                        }
                        this.method104(var4, var6, (byte) 9, var3);
                        this.field387.method191(this.field240, 93);
                        this.field387.method228(var6 >> 14 & 32767, 725);
                        this.field387.method226(9, this.field116 + var4);
                        this.field387.method227(955, this.field115 + var3);
                    }
                    if (var5 == 306) {
                        this.field387.method191(this.field240, 159);
                        this.field387.method193(var4);
                        this.field387.method226(9, var6);
                        this.field387.method193(var3);
                        this.field184 = 0;
                        this.field185 = var4;
                        this.field186 = var3;
                        this.field187 = 2;
                        if (class11.method174(var4).field675 == this.field78) {
                            this.field187 = 1;
                        }
                        if (class11.method174(var4).field675 == this.field67) {
                            this.field187 = 3;
                        }
                    }
                    if (var5 == 241) {
                        this.field387.method191(this.field240, 27);
                        this.field387.method193(var4);
                        class11 var64 = class11.method174(var4);
                        if (var64.field689 != null && var64.field689[0][0] == 5) {
                            int var65 = var64.field689[0][1];
                            this.field539[var65] = 1 - this.field539[var65];
                            this.method60(true, var65);
                            this.field431 = true;
                        }
                    }
                    if (var5 == 279) {
                        String var66 = this.field262[arg0];
                        int var67 = var66.indexOf("@whi@");
                        if (var67 != -1) {
                            if (this.field78 == -1) {
                                this.method154(0);
                                this.field82 = var66.substring(var67 + 5).trim();
                                this.field148 = false;
                                this.field90 = this.field78 = class11.field699;
                            } else {
                                this.method31("", true, "Please close the interface you have open before using 'report abuse'", 0);
                            }
                        }
                    }
                    if (var5 == 691 || var5 == 275 || var5 == 739 || var5 == 266) {
                        String var68 = this.field262[arg0];
                        int var69 = var68.indexOf("@whi@");
                        if (var69 != -1) {
                            long var70 = class55.method510(var68.substring(var69 + 5).trim());
                            if (var5 == 691) {
                                this.method138(var70, (byte) -66);
                            }
                            if (var5 == 275) {
                                this.method52(var70, this.field106);
                            }
                            if (var5 == 739) {
                                this.method101(-353, var70);
                            }
                            if (var5 == 266) {
                                this.method59(var70, -256);
                            }
                        }
                    }
                    if (var5 == 383) {
                        boolean var72 = this.method64(var4, 0, var3, 0, 0, (byte) 37, 0, 2, false, field73.field835[0], 0, field73.field836[0]);
                        if (!var72) {
                            this.method64(var4, 0, var3, 1, 0, (byte) 37, 0, 2, false, field73.field835[0], 1, field73.field836[0]);
                        }
                        this.field283 = super.field29;
                        this.field284 = super.field30;
                        this.field286 = 2;
                        this.field285 = 0;
                        this.field387.method191(this.field240, 199);
                        this.field387.method193(this.field505);
                        this.field387.method193(this.field503);
                        this.field387.method227(955, this.field115 + var3);
                        this.field387.method228(this.field504, 725);
                        this.field387.method228(this.field116 + var4, 725);
                        this.field387.method226(9, var6);
                    }
                    this.field502 = 0;
                    this.field376 = 0;
                    this.field431 = true;
                    if (arg1 != -121) {
                        this.field250 = -1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILGHHPHSRU;)V")
    public final void method141(int arg0, int arg1, class14 arg2) {
        if (arg1 < 6 || arg1 > 6) {
            this.field387.method192(252);
        }
        if (arg0 == 246) {
            int var4 = arg2.method202();
            int var5 = (var4 >> 4 & 7) + this.field365;
            int var6 = (var4 & 7) + this.field366;
            int var7 = arg2.method204();
            int var8 = arg2.method202();
            int var9 = var8 >> 4 & 15;
            int var10 = var8 & 7;
            if (field73.field835[0] >= var5 - var9 && field73.field835[0] <= var5 + var9 && field73.field836[0] >= var6 - var9 && field73.field836[0] <= var6 + var9 && this.field254 && !field276 && this.field345 < 50) {
                this.field338[this.field345] = var7;
                this.field441[this.field345] = var10;
                this.field385[this.field345] = class59.field1581[var7];
                ++this.field345;
            }
        }
        if (arg0 == 225) {
            int var11 = arg2.method202();
            int var12 = (var11 >> 4 & 7) + this.field365;
            int var13 = (var11 & 7) + this.field366;
            int var14 = arg2.method204();
            int var15 = arg2.method204();
            int var16 = arg2.method204();
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class57 var17 = this.field162[this.field105][var12][var13];
                if (var17 != null) {
                    for (class18 var18 = (class18) var17.method519(); var18 != null; var18 = (class18) var17.method521(5)) {
                        if ((var14 & 32767) == var18.field908 && var18.field909 == var15) {
                            var18.field909 = var16;
                            break;
                        }
                    }
                    this.method134(var12, var13);
                }
            }
        } else if (arg0 == 35) {
            int var19 = arg2.method230(0);
            int var20 = arg2.method223((byte) -82);
            int var21 = (var20 >> 4 & 7) + this.field365;
            int var22 = (var20 & 7) + this.field366;
            int var23 = arg2.method221((byte) 49);
            int var24 = var23 >> 2;
            int var25 = var23 & 3;
            int var26 = this.field402[var24];
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                this.method69(-1, this.field105, var26, var21, 0, this.field79, var19, var22, var24, var25);
            }
        } else if (arg0 == 234) {
            int var27 = arg2.method222(-6);
            int var28 = var27 >> 2;
            int var29 = var27 & 3;
            int var30 = this.field402[var28];
            int var31 = arg2.method231(440);
            int var32 = arg2.method222(-6);
            int var33 = (var32 >> 4 & 7) + this.field365;
            int var34 = (var32 & 7) + this.field366;
            if (var33 >= 0 && var34 >= 0 && var33 < 103 && var34 < 103) {
                int var35 = this.field72[this.field105][var33][var34];
                int var36 = this.field72[this.field105][var33 + 1][var34];
                int var37 = this.field72[this.field105][var33 + 1][var34 + 1];
                int var38 = this.field72[this.field105][var33][var34 + 1];
                if (var30 == 0) {
                    class40 var39 = this.field239.method331(false, this.field105, var33, var34);
                    if (var39 != null) {
                        int var40 = var39.field1360 >> 14 & 32767;
                        if (var28 == 2) {
                            var39.field1358 = new class61(var37, var40, false, var36, var29 + 4, 0, var35, 2, var31, var38);
                            var39.field1359 = new class61(var37, var40, false, var36, var29 + 1 & 3, 0, var35, 2, var31, var38);
                        } else {
                            var39.field1358 = new class61(var37, var40, false, var36, var29, 0, var35, var28, var31, var38);
                        }
                    }
                }
                if (var30 == 1) {
                    class62 var41 = this.field239.method332(this.field105, var34, var33, 0);
                    if (var41 != null) {
                        var41.field1613 = new class61(var37, var41.field1614 >> 14 & 32767, false, var36, 0, 0, var35, 4, var31, var38);
                    }
                }
                if (var30 == 2) {
                    class32 var42 = this.field239.method333(this.field105, var33, var34, 26904);
                    if (var28 == 11) {
                        var28 = 10;
                    }
                    if (var42 != null) {
                        var42.field1166 = new class61(var37, var42.field1174 >> 14 & 32767, false, var36, var29, 0, var35, var28, var31, var38);
                    }
                }
                if (var30 == 3) {
                    class21 var43 = this.field239.method334(844, this.field105, var34, var33);
                    if (var43 != null) {
                        var43.field946 = new class61(var37, var43.field947 >> 14 & 32767, false, var36, var29, 0, var35, 22, var31, var38);
                    }
                }
            }
        } else if (arg0 == 59) {
            int var44 = arg2.method222(-6);
            int var45 = (var44 >> 4 & 7) + this.field365;
            int var46 = (var44 & 7) + this.field366;
            int var47 = arg2.method204();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                class57 var48 = this.field162[this.field105][var45][var46];
                if (var48 != null) {
                    for (class18 var49 = (class18) var48.method519(); var49 != null; var49 = (class18) var48.method521(5)) {
                        if ((var47 & 32767) == var49.field908) {
                            var49.method19();
                            break;
                        }
                    }
                    if (var48.method519() == null) {
                        this.field162[this.field105][var45][var46] = null;
                    }
                    this.method134(var45, var46);
                }
            }
        } else if (arg0 == 191) {
            int var50 = arg2.method202();
            int var51 = (var50 >> 4 & 7) + this.field365;
            int var52 = (var50 & 7) + this.field366;
            int var53 = var51 + arg2.method203();
            int var54 = var52 + arg2.method203();
            int var55 = arg2.method205();
            int var56 = arg2.method204();
            int var57 = arg2.method202() * 4;
            int var58 = arg2.method202() * 4;
            int var59 = arg2.method204();
            int var60 = arg2.method204();
            int var61 = arg2.method202();
            int var62 = arg2.method202();
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104 && var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var56 != 65535) {
                int var63 = var51 * 128 + 64;
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                int var66 = var54 * 128 + 64;
                class46 var67 = new class46(this.field105, var55, field419 + var60, var56, var63, var58, (byte) 2, field419 + var59, var62, this.method34(var64, 215, this.field105, var63) - var57, var64, var61);
                var67.method471(this.method34(var66, 215, this.field105, var65) - var58, field419 + var59, -36281, var66, var65);
                this.field391.method516(var67);
            }
        } else if (arg0 == 18) {
            int var68 = arg2.method202();
            int var69 = (var68 >> 4 & 7) + this.field365;
            int var70 = (var68 & 7) + this.field366;
            int var71 = arg2.method204();
            int var72 = arg2.method202();
            int var73 = arg2.method204();
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                int var74 = var69 * 128 + 64;
                int var75 = var70 * 128 + 64;
                class43 var76 = new class43(this.field105, var73, var75, this.method34(var75, 215, this.field105, var74) - var72, field419, var71, var74, -14763);
                this.field373.method516(var76);
            }
        } else if (arg0 == 249) {
            int var77 = arg2.method204();
            int var78 = arg2.method230(0);
            int var79 = arg2.method222(-6);
            int var80 = (var79 >> 4 & 7) + this.field365;
            int var81 = (var79 & 7) + this.field366;
            int var82 = arg2.method231(440);
            if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && this.field499 != var82) {
                class18 var83 = new class18();
                var83.field908 = var77;
                var83.field909 = var78;
                if (this.field162[this.field105][var80][var81] == null) {
                    this.field162[this.field105][var80][var81] = new class57((byte) 55);
                }
                this.field162[this.field105][var80][var81].method516(var83);
                this.method134(var80, var81);
            }
        } else if (arg0 == 80) {
            int var84 = arg2.method229((byte) 4);
            int var85 = arg2.method223((byte) -82);
            int var86 = (var85 >> 4 & 7) + this.field365;
            int var87 = (var85 & 7) + this.field366;
            int var88 = arg2.method231(440);
            if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                class18 var89 = new class18();
                var89.field908 = var84;
                var89.field909 = var88;
                if (this.field162[this.field105][var86][var87] == null) {
                    this.field162[this.field105][var86][var87] = new class57((byte) 55);
                }
                this.field162[this.field105][var86][var87].method516(var89);
                this.method134(var86, var87);
            }
        } else if (arg0 == 213) {
            int var90 = arg2.method223((byte) -82);
            int var91 = var90 >> 2;
            int var92 = var90 & 3;
            int var93 = this.field402[var91];
            int var94 = arg2.method222(-6);
            int var95 = (var94 >> 4 & 7) + this.field365;
            int var96 = (var94 & 7) + this.field366;
            if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                this.method69(-1, this.field105, var93, var95, 0, this.field79, -1, var96, var91, var92);
            }
        } else {
            if (arg0 == 195) {
                byte var97 = arg2.method203();
                int var98 = arg2.method229((byte) 4);
                int var99 = arg2.method230(0);
                byte var100 = arg2.method224(this.field514);
                int var101 = arg2.method231(440);
                byte var102 = arg2.method225((byte) -91);
                byte var103 = arg2.method224(this.field514);
                int var104 = arg2.method230(0);
                int var105 = arg2.method222(-6);
                int var106 = var105 >> 2;
                int var107 = var105 & 3;
                int var108 = this.field402[var106];
                int var109 = arg2.method221((byte) 49);
                int var110 = (var109 >> 4 & 7) + this.field365;
                int var111 = (var109 & 7) + this.field366;
                class10 var112;
                if (this.field499 == var99) {
                    var112 = field73;
                } else {
                    var112 = this.field450[var99];
                }
                if (var112 != null) {
                    class28 var113 = class28.method365(var98);
                    int var114 = this.field72[this.field105][var110][var111];
                    int var115 = this.field72[this.field105][var110 + 1][var111];
                    int var116 = this.field72[this.field105][var110 + 1][var111 + 1];
                    int var117 = this.field72[this.field105][var110][var111 + 1];
                    class35 var118 = var113.method361(var106, var107, var114, var115, var116, var117, -1);
                    if (var118 != null) {
                        this.method69(var101 + 1, this.field105, var108, var110, var104 + 1, this.field79, -1, var111, 0, 0);
                        var112.field640 = field419 + var104;
                        var112.field641 = field419 + var101;
                        var112.field632 = var118;
                        int var119 = var113.field1131;
                        int var120 = var113.field1125;
                        if (var107 == 1 || var107 == 3) {
                            var119 = var113.field1125;
                            var120 = var113.field1131;
                        }
                        var112.field629 = var110 * 128 + var119 * 64;
                        var112.field631 = var111 * 128 + var120 * 64;
                        var112.field630 = this.method34(var112.field631, 215, this.field105, var112.field629);
                        if (var103 > var97) {
                            byte var121 = var103;
                            var103 = var97;
                            var97 = var121;
                        }
                        if (var102 > var100) {
                            byte var122 = var102;
                            var102 = var100;
                            var100 = var122;
                        }
                        var112.field635 = var103 + var110;
                        var112.field637 = var97 + var110;
                        var112.field636 = var102 + var111;
                        var112.field638 = var100 + var111;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method142(int arg0) {
        if (this.field245 > 1) {
            --this.field245;
        }
        if (this.field253 > 0) {
            --this.field253;
        }
        for (int var2 = 0; var2 < 5 && this.method150((byte) 52); ++var2) {
        }
        if (this.field238) {
            Object var3 = this.field332.field1708;
            synchronized (this.field332.field1708) {
                if (!field475) {
                    this.field332.field1707 = 0;
                } else if (super.field28 != 0 || this.field332.field1707 >= 40) {
                    this.field387.method191(this.field240, 210);
                    this.field387.method192(0);
                    int var4 = this.field387.field769;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field332.field1707 && var4 - this.field387.field769 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field332.field1704[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field332.field1702[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field332.field1704[var6] == -1 && this.field332.field1702[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field200 == var8 && this.field201 == var7) {
                            if (this.field139 < 2047) {
                                ++this.field139;
                            }
                        } else {
                            int var10 = var8 - this.field200;
                            this.field200 = var8;
                            int var11 = var7 - this.field201;
                            this.field201 = var7;
                            if (this.field139 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field387.method193((this.field139 << 12) + (var10 << 6) + var11);
                                this.field139 = 0;
                            } else if (this.field139 < 8) {
                                this.field387.method195((this.field139 << 19) + 8388608 + var9);
                                this.field139 = 0;
                            } else {
                                this.field387.method196((this.field139 << 19) + -1073741824 + var9);
                                this.field139 = 0;
                            }
                        }
                    }
                    this.field387.method201(this.field387.field769 - var4, -48308);
                    if (var5 >= this.field332.field1707) {
                        this.field332.field1707 = 0;
                    } else {
                        this.field332.field1707 -= var5;
                        for (int var12 = 0; var12 < this.field332.field1707; ++var12) {
                            this.field332.field1702[var12] = this.field332.field1702[var5 + var12];
                            this.field332.field1704[var12] = this.field332.field1704[var5 + var12];
                        }
                    }
                }
            }
            if (super.field28 != 0) {
                long var13 = (super.field31 - this.field542) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field542 = super.field31;
                int var15 = super.field30;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field29;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field28 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field387.method191(this.field240, 14);
                this.field387.method235((var18 << 19) + (var19 << 20) + var17, false);
            }
            if (this.field394 > 0) {
                --this.field394;
            }
            if (super.field32[1] == 1 || super.field32[2] == 1 || super.field32[3] == 1 || super.field32[4] == 1) {
                this.field395 = true;
            }
            if (this.field395 && this.field394 <= 0) {
                this.field394 = 20;
                this.field395 = false;
                this.field387.method191(this.field240, 55);
                this.field387.method228(this.field483, 725);
                this.field387.method228(this.field484, 725);
            }
            if (super.field19 && !this.field224) {
                this.field224 = true;
                this.field387.method191(this.field240, 235);
                this.field387.method192(1);
            }
            if (!super.field19 && this.field224) {
                this.field224 = false;
                this.field387.method191(this.field240, 235);
                this.field387.method192(0);
            }
            this.method21(-831);
            this.method44((byte) 7);
            this.method155((byte) 109);
            ++this.field251;
            if (this.field251 > 750) {
                this.method74(true);
            }
            this.method99((byte) 25);
            this.method123(this.field208);
            this.method32(-22637);
            ++this.field346;
            if (this.field286 != 0) {
                this.field285 += 20;
                if (this.field285 >= 400) {
                    this.field286 = 0;
                }
            }
            if (this.field187 != 0) {
                ++this.field184;
                if (this.field184 >= 15) {
                    if (this.field187 == 2) {
                        this.field431 = true;
                    }
                    if (this.field187 == 3) {
                        this.field343 = true;
                    }
                    this.field187 = 0;
                }
            }
            if (this.field213 != 0) {
                ++this.field513;
                if (super.field22 > this.field214 + 5 || super.field22 < this.field214 - 5 || super.field23 > this.field215 + 5 || super.field23 < this.field215 - 5) {
                    this.field368 = true;
                }
                if (super.field21 == 0) {
                    if (this.field213 == 2) {
                        this.field431 = true;
                    }
                    if (this.field213 == 3) {
                        this.field343 = true;
                    }
                    this.field213 = 0;
                    if (this.field368 && this.field513 >= 5) {
                        this.field530 = -1;
                        this.method109(-697);
                        if (this.field530 == this.field211 && this.field529 != this.field212) {
                            class11 var20 = class11.method174(this.field211);
                            byte var21 = 0;
                            if (this.field144 == 1 && var20.field713 == 206) {
                                var21 = 1;
                            }
                            if (var20.field652[this.field529] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field722) {
                                int var22 = this.field212;
                                int var23 = this.field529;
                                var20.field652[var23] = var20.field652[var22];
                                var20.field715[var23] = var20.field715[var22];
                                var20.field652[var22] = -1;
                                var20.field715[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field212;
                                int var25 = this.field529;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method182(var24 - 1, 216, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method182(var24 + 1, 216, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method182(this.field529, 216, this.field212);
                            }
                            this.field387.method191(this.field240, 139);
                            this.field387.method227(955, this.field529);
                            this.field387.method193(this.field212);
                            this.field387.method227(955, this.field211);
                            this.field387.method220(var21, false);
                        }
                    } else if ((this.field265 == 1 || this.method66((byte) 2, this.field436 - 1)) && this.field436 > 2) {
                        this.method120(9);
                    } else if (this.field436 > 0) {
                        this.method140(this.field436 - 1, (byte) -121);
                    }
                    this.field184 = 10;
                    super.field28 = 0;
                }
            }
            if (class27.field1049 != -1) {
                int var26 = class27.field1049;
                int var27 = class27.field1050;
                boolean var28 = this.method64(var27, 0, var26, 0, 0, (byte) 37, 0, 0, true, field73.field835[0], 0, field73.field836[0]);
                class27.field1049 = -1;
                if (var28) {
                    this.field283 = super.field29;
                    this.field284 = super.field30;
                    this.field286 = 1;
                    this.field285 = 0;
                }
            }
            if (super.field28 == 1 && this.field69 != null) {
                this.field69 = null;
                this.field343 = true;
                super.field28 = 0;
            }
            this.method26((byte) 5);
            if (this.field289 == -1) {
                this.method35(2259);
                this.method149(this.field333);
                this.method68(-300);
            }
            if (super.field21 == 1 || super.field28 == 1) {
                ++this.field288;
            }
            if (this.field134 == 0 && this.field156 == 0 && this.field226 == 0) {
                if (this.field383 > 0) {
                    --this.field383;
                }
            } else if (this.field383 < 100) {
                ++this.field383;
                if (this.field383 == 100) {
                    if (this.field134 != 0) {
                        this.field343 = true;
                    }
                    if (this.field156 != 0) {
                        this.field431 = true;
                    }
                }
            }
            if (this.field142 == 2) {
                this.method135(0);
            }
            if (this.field142 == 2 && this.field399) {
                this.method29(0);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field336[var29]++;
            }
            this.method110(false);
            ++field382;
            if (field382 > 101) {
                field382 = 0;
                this.field387.method191(this.field240, 39);
                this.field387.method196(0);
            }
            ++super.field20;
            if (arg0 != -35326) {
                field531 = this.field92.method533();
            }
            if (super.field20 > 4500) {
                this.field253 = 250;
                super.field20 -= 500;
                this.field387.method191(this.field240, 50);
            }
            ++this.field114;
            if (this.field114 > 500) {
                this.field114 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field519 += this.field520;
                }
                if ((var30 & 2) == 2) {
                    this.field294 += this.field295;
                }
                if ((var30 & 4) == 4) {
                    this.field432 += this.field433;
                }
            }
            if (this.field519 < -50) {
                this.field520 = 2;
            }
            if (this.field519 > 50) {
                this.field520 = -2;
            }
            if (this.field294 < -55) {
                this.field295 = 2;
            }
            if (this.field294 > 55) {
                this.field295 = -2;
            }
            if (this.field432 < -40) {
                this.field433 = 1;
            }
            if (this.field432 > 40) {
                this.field433 = -1;
            }
            ++this.field312;
            if (this.field312 > 500) {
                this.field312 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field165 += this.field166;
                }
                if ((var31 & 2) == 2) {
                    this.field198 += this.field199;
                }
            }
            if (this.field165 < -60) {
                this.field166 = 2;
            }
            if (this.field165 > 60) {
                this.field166 = -2;
            }
            if (this.field198 < -20) {
                this.field199 = 1;
            }
            if (this.field198 > 10) {
                this.field199 = -1;
            }
            ++this.field252;
            if (this.field252 > 50) {
                this.field387.method191(this.field240, 135);
            }
            try {
                if (this.field132 != null && this.field387.field769 > 0) {
                    this.field132.method587(-39006, this.field387.field768, 0, this.field387.field769);
                    this.field387.field769 = 0;
                    this.field252 = 0;
                }
            } catch (IOException var33) {
                this.method74(true);
            } catch (Exception var34) {
                this.method76(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LGHHPHSRU;II)V")
    private final void method143(class14 arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field453; ++var4) {
            int var5 = this.field454[var4];
            class10 var6 = this.field450[var5];
            int var7 = arg0.method202();
            if ((var7 & 16) != 0) {
                var7 += arg0.method202() << 8;
            }
            this.method133(var7, var5, arg0, var6, (byte) 91);
        }
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(B)Z")
    public final boolean method144(byte arg0) {
        if (arg0 != 4) {
            this.field413 = !this.field413;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(B)V")
    public final void method145(byte arg0) {
        if (arg0 != 72) {
            this.field250 = -1;
        }
        if (this.field193 == 2) {
            this.method132((this.field100 - this.field115 << 7) + this.field103, (this.field101 - this.field116 << 7) + this.field104, this.field102 * 2, 0);
            if (this.field341 > -1 && field419 % 20 < 10) {
                this.field110[0].method376(this.field342 - 28, true, this.field341 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public static final void method146(boolean arg0) {
        class27.field1015 = false;
        class39.field1330 = false;
        field276 = false;
        class36.field1287 = false;
        class28.field1104 = false;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method147(int arg0, int arg1, int arg2) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILGHHPHSRU;)V")
    private final void method148(boolean arg0, int arg1, class14 arg2) {
        this.field238 &= arg0;
        while (arg2.field770 + 10 < arg1 * 8) {
            int var4 = arg2.method213(11, this.field489);
            if (var4 == 2047) {
                break;
            }
            if (this.field450[var4] == null) {
                this.field450[var4] = new class10();
                if (this.field455[var4] != null) {
                    this.field450[var4].method173(285, this.field455[var4]);
                }
            }
            this.field452[this.field451++] = var4;
            class10 var5 = this.field450[var4];
            var5.field855 = field419;
            int var6 = arg2.method213(5, this.field489);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method213(1, this.field489);
            int var8 = arg2.method213(5, this.field489);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg2.method213(1, this.field489);
            if (var9 == 1) {
                this.field454[this.field453++] = var4;
            }
            var5.method242(field73.field835[0] + var6, field73.field836[0] + var8, (byte) -56, var7 == 1);
        }
        arg2.method214(0);
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(B)V")
    public final void method149(byte arg0) {
        if (arg0 == 94) {
            if (super.field28 == 1) {
                if (super.field29 >= 539 && super.field29 <= 573 && super.field30 >= 169 && super.field30 < 205 && this.field541[0] != -1) {
                    this.field431 = true;
                    this.field515 = 0;
                    this.field471 = true;
                }
                if (super.field29 >= 569 && super.field29 <= 599 && super.field30 >= 168 && super.field30 < 205 && this.field541[1] != -1) {
                    this.field431 = true;
                    this.field515 = 1;
                    this.field471 = true;
                }
                if (super.field29 >= 597 && super.field29 <= 627 && super.field30 >= 168 && super.field30 < 205 && this.field541[2] != -1) {
                    this.field431 = true;
                    this.field515 = 2;
                    this.field471 = true;
                }
                if (super.field29 >= 625 && super.field29 <= 669 && super.field30 >= 168 && super.field30 < 203 && this.field541[3] != -1) {
                    this.field431 = true;
                    this.field515 = 3;
                    this.field471 = true;
                }
                if (super.field29 >= 666 && super.field29 <= 696 && super.field30 >= 168 && super.field30 < 205 && this.field541[4] != -1) {
                    this.field431 = true;
                    this.field515 = 4;
                    this.field471 = true;
                }
                if (super.field29 >= 694 && super.field29 <= 724 && super.field30 >= 168 && super.field30 < 205 && this.field541[5] != -1) {
                    this.field431 = true;
                    this.field515 = 5;
                    this.field471 = true;
                }
                if (super.field29 >= 722 && super.field29 <= 756 && super.field30 >= 169 && super.field30 < 205 && this.field541[6] != -1) {
                    this.field431 = true;
                    this.field515 = 6;
                    this.field471 = true;
                }
                if (super.field29 >= 540 && super.field29 <= 574 && super.field30 >= 466 && super.field30 < 502 && this.field541[7] != -1) {
                    this.field431 = true;
                    this.field515 = 7;
                    this.field471 = true;
                }
                if (super.field29 >= 572 && super.field29 <= 602 && super.field30 >= 466 && super.field30 < 503 && this.field541[8] != -1) {
                    this.field431 = true;
                    this.field515 = 8;
                    this.field471 = true;
                }
                if (super.field29 >= 599 && super.field29 <= 629 && super.field30 >= 466 && super.field30 < 503 && this.field541[9] != -1) {
                    this.field431 = true;
                    this.field515 = 9;
                    this.field471 = true;
                }
                if (super.field29 >= 627 && super.field29 <= 671 && super.field30 >= 467 && super.field30 < 502 && this.field541[10] != -1) {
                    this.field431 = true;
                    this.field515 = 10;
                    this.field471 = true;
                }
                if (super.field29 >= 669 && super.field29 <= 699 && super.field30 >= 466 && super.field30 < 503 && this.field541[11] != -1) {
                    this.field431 = true;
                    this.field515 = 11;
                    this.field471 = true;
                }
                if (super.field29 >= 696 && super.field29 <= 726 && super.field30 >= 466 && super.field30 < 503 && this.field541[12] != -1) {
                    this.field431 = true;
                    this.field515 = 12;
                    this.field471 = true;
                }
                if (super.field29 >= 724 && super.field29 <= 758 && super.field30 >= 466 && super.field30 < 502 && this.field541[13] != -1) {
                    this.field431 = true;
                    this.field515 = 13;
                    this.field471 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(B)Z")
    public final boolean method150(byte arg0) {
        if (arg0 != 52) {
            this.method6();
        }
        if (this.field132 == null) {
            return false;
        } else {
            try {
                int var2 = this.field132.method585();
                if (var2 == 0) {
                    return false;
                }
                if (this.field250 == -1) {
                    this.field132.method586(this.field259.field768, 0, 1);
                    this.field250 = this.field259.field768[0] & 255;
                    if (this.field92 != null) {
                        this.field250 = this.field250 - this.field92.method533() & 255;
                    }
                    this.field249 = class65.field1634[this.field250];
                    --var2;
                }
                if (this.field249 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field132.method586(this.field259.field768, 0, 1);
                    this.field249 = this.field259.field768[0] & 255;
                    --var2;
                }
                if (this.field249 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field132.method586(this.field259.field768, 0, 2);
                    this.field259.field769 = 0;
                    this.field249 = this.field259.method204();
                    var2 -= 2;
                }
                if (var2 < this.field249) {
                    return false;
                }
                this.field259.field769 = 0;
                this.field132.method586(this.field259.field768, 0, this.field249);
                this.field251 = 0;
                this.field371 = this.field370;
                this.field370 = this.field369;
                this.field369 = this.field250;
                if (this.field250 == 102) {
                    this.method49(0, this.field249, this.field259);
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 148) {
                    int var3 = this.field259.method204();
                    int var4 = this.field259.method231(440);
                    class11.method174(var4).field665 = 2;
                    class11.method174(var4).field666 = var3;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 193) {
                    int var5 = this.field259.method229((byte) 4);
                    int var6 = this.field259.method204();
                    int var7 = this.field259.method230(0);
                    class11.method174(var7).field656 = (var5 << 16) + var6;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 220) {
                    int var8 = this.field259.method204();
                    int var9 = this.field259.method202();
                    int var10 = this.field259.method204();
                    if (this.field254 && !field276 && this.field345 < 50) {
                        this.field338[this.field345] = var8;
                        this.field441[this.field345] = var9;
                        this.field385[this.field345] = class59.field1581[var8] + var10;
                        ++this.field345;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 109) {
                    this.method76(false);
                    this.field250 = -1;
                    return false;
                }
                if (this.field250 == 212) {
                    this.field193 = this.field259.method202();
                    if (this.field193 == 1) {
                        this.field438 = this.field259.method204();
                    }
                    if (this.field193 >= 2 && this.field193 <= 6) {
                        if (this.field193 == 2) {
                            this.field103 = 64;
                            this.field104 = 64;
                        }
                        if (this.field193 == 3) {
                            this.field103 = 0;
                            this.field104 = 64;
                        }
                        if (this.field193 == 4) {
                            this.field103 = 128;
                            this.field104 = 64;
                        }
                        if (this.field193 == 5) {
                            this.field103 = 64;
                            this.field104 = 0;
                        }
                        if (this.field193 == 6) {
                            this.field103 = 64;
                            this.field104 = 128;
                        }
                        this.field193 = 2;
                        this.field100 = this.field259.method204();
                        this.field101 = this.field259.method204();
                        this.field102 = this.field259.method202();
                    }
                    if (this.field193 == 10) {
                        this.field516 = this.field259.method204();
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 130) {
                    this.field435 = false;
                    this.field334 = 2;
                    this.field384 = "";
                    this.field343 = true;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 124) {
                    if (this.field515 == 12) {
                        this.field431 = true;
                    }
                    this.field412 = this.field259.method205();
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 3) {
                    int var11 = this.field259.method230(0);
                    if (var11 == 65535) {
                        var11 = -1;
                    }
                    if (this.field98 != var11 && this.field241 && !field276 && this.field400 == 0) {
                        this.field408 = var11;
                        this.field409 = true;
                        this.field83.method576(2, this.field408);
                    }
                    this.field98 = var11;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 62) {
                    int var12 = this.field259.method234((byte) 61);
                    int var13 = this.field259.method231(440);
                    if (this.field241 && !field276) {
                        this.field408 = var13;
                        this.field409 = false;
                        this.field83.method576(2, this.field408);
                        this.field400 = var12;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 70) {
                    int var14 = this.field259.method231(440);
                    int var15 = this.field259.method233(true);
                    class11 var16 = class11.method174(var14);
                    if (var16.field657 != var15 || var15 == -1) {
                        var16.field657 = var15;
                        var16.field726 = 0;
                        var16.field704 = 0;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 37) {
                    this.field366 = this.field259.method221((byte) 49);
                    this.field365 = this.field259.method222(-6);
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 163) {
                    this.field264 = this.field259.method202();
                    this.field431 = true;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 117) {
                    this.field443 = this.field259.method202();
                    this.field353 = this.field259.method202();
                    this.field190 = this.field259.method202();
                    this.field281 = true;
                    this.field343 = true;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 228) {
                    int var17 = this.field259.method231(440);
                    int var18 = this.field259.method230(0);
                    if (this.field67 != -1) {
                        this.method92(this.field67, 15);
                        this.field67 = -1;
                        this.field343 = true;
                    }
                    if (this.field289 != -1) {
                        this.method92(this.field289, 15);
                        this.field289 = -1;
                        this.field313 = true;
                    }
                    if (this.field149 != -1) {
                        this.method92(this.field149, 15);
                        this.field149 = -1;
                    }
                    if (this.field78 != var17) {
                        this.method92(this.field78, 15);
                        this.field78 = var17;
                    }
                    if (this.field192 != var18) {
                        this.method92(this.field192, 15);
                        this.field192 = var18;
                    }
                    if (this.field334 != 0) {
                        this.field334 = 0;
                        this.field343 = true;
                    }
                    this.field431 = true;
                    this.field471 = true;
                    this.field271 = false;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 211) {
                    int var19 = this.field259.method204();
                    this.method100(var19, this.field487);
                    if (this.field67 != -1) {
                        this.method92(this.field67, 15);
                        this.field67 = -1;
                        this.field343 = true;
                    }
                    if (this.field289 != -1) {
                        this.method92(this.field289, 15);
                        this.field289 = -1;
                        this.field313 = true;
                    }
                    if (this.field149 != -1) {
                        this.method92(this.field149, 15);
                        this.field149 = -1;
                    }
                    if (this.field78 != -1) {
                        this.method92(this.field78, 15);
                        this.field78 = -1;
                    }
                    if (this.field192 != var19) {
                        this.method92(this.field192, 15);
                        this.field192 = var19;
                    }
                    if (this.field334 != 0) {
                        this.field334 = 0;
                        this.field343 = true;
                    }
                    this.field431 = true;
                    this.field471 = true;
                    this.field271 = false;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 36) {
                    this.field399 = true;
                    this.field461 = this.field259.method202();
                    this.field462 = this.field259.method202();
                    this.field463 = this.field259.method204();
                    this.field464 = this.field259.method202();
                    this.field465 = this.field259.method202();
                    if (this.field465 >= 100) {
                        this.field324 = this.field461 * 128 + 64;
                        this.field326 = this.field462 * 128 + 64;
                        this.field325 = this.method34(this.field326, 215, this.field105, this.field324) - this.field463;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 178) {
                    this.field499 = this.field259.method204();
                    this.field120 = this.field259.method202();
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 251) {
                    if (this.field192 != -1) {
                        this.method92(this.field192, 15);
                        this.field192 = -1;
                        this.field431 = true;
                        this.field471 = true;
                    }
                    if (this.field67 != -1) {
                        this.method92(this.field67, 15);
                        this.field67 = -1;
                        this.field343 = true;
                    }
                    if (this.field289 != -1) {
                        this.method92(this.field289, 15);
                        this.field289 = -1;
                        this.field313 = true;
                    }
                    if (this.field149 != -1) {
                        this.method92(this.field149, 15);
                        this.field149 = -1;
                    }
                    if (this.field78 != -1) {
                        this.method92(this.field78, 15);
                        this.field78 = -1;
                    }
                    if (this.field334 != 0) {
                        this.field334 = 0;
                        this.field343 = true;
                    }
                    this.field271 = false;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 122 || this.field250 == 159) {
                    int var20 = this.field178;
                    int var21 = this.field179;
                    if (this.field250 == 122) {
                        var21 = this.field259.method229((byte) 4);
                        var20 = this.field259.method230(0);
                        this.field191 = false;
                    }
                    if (this.field250 == 159) {
                        this.field259.method212(false);
                        int var22 = 0;
                        while (true) {
                            if (var22 >= 4) {
                                this.field259.method214(0);
                                var20 = this.field259.method230(0);
                                var21 = this.field259.method230(0);
                                this.field191 = true;
                                break;
                            }
                            for (int var23 = 0; var23 < 13; ++var23) {
                                for (int var24 = 0; var24 < 13; ++var24) {
                                    int var25 = this.field259.method213(1, this.field489);
                                    if (var25 == 1) {
                                        this.field357[var22][var23][var24] = this.field259.method213(26, this.field489);
                                    } else {
                                        this.field357[var22][var23][var24] = -1;
                                    }
                                }
                            }
                            ++var22;
                        }
                    }
                    if (this.field178 == var20 && this.field179 == var21 && this.field142 == 2) {
                        this.field250 = -1;
                        return true;
                    }
                    this.field178 = var20;
                    this.field179 = var21;
                    this.field115 = (this.field178 - 6) * 8;
                    this.field116 = (this.field179 - 6) * 8;
                    this.field517 = false;
                    if ((this.field178 / 8 == 48 || this.field178 / 8 == 49) && this.field179 / 8 == 48) {
                        this.field517 = true;
                    }
                    if (this.field178 / 8 == 48 && this.field179 / 8 == 148) {
                        this.field517 = true;
                    }
                    this.field142 = 1;
                    this.field415 = System.currentTimeMillis();
                    this.method77("Loading - please wait.", -284, (String) null);
                    if (this.field250 == 122) {
                        int var26 = 0;
                        int var27 = (this.field178 - 6) / 8;
                        label1201: while (true) {
                            if (var27 > (this.field178 + 6) / 8) {
                                this.field267 = new byte[var26][];
                                this.field60 = new byte[var26][];
                                this.field291 = new int[var26];
                                this.field292 = new int[var26];
                                this.field293 = new int[var26];
                                int var29 = 0;
                                int var30 = (this.field178 - 6) / 8;
                                while (true) {
                                    if (var30 > (this.field178 + 6) / 8) {
                                        break label1201;
                                    }
                                    for (int var31 = (this.field179 - 6) / 8; var31 <= (this.field179 + 6) / 8; ++var31) {
                                        this.field291[var29] = (var30 << 8) + var31;
                                        if (!this.field517 || var31 != 49 && var31 != 149 && var31 != 147 && var30 != 50 && (var30 != 49 || var31 != 47)) {
                                            int var32 = this.field292[var29] = this.field83.method561(var31, field527, var30, 0);
                                            if (var32 != -1) {
                                                this.field83.method576(3, var32);
                                            }
                                            int var33 = this.field293[var29] = this.field83.method561(var31, field527, var30, 1);
                                            if (var33 != -1) {
                                                this.field83.method576(3, var33);
                                            }
                                            ++var29;
                                        } else {
                                            this.field292[var29] = -1;
                                            this.field293[var29] = -1;
                                            ++var29;
                                        }
                                    }
                                    ++var30;
                                }
                            }
                            for (int var28 = (this.field179 - 6) / 8; var28 <= (this.field179 + 6) / 8; ++var28) {
                                ++var26;
                            }
                            ++var27;
                        }
                    }
                    if (this.field250 == 159) {
                        int var34 = 0;
                        int[] var35 = new int[676];
                        int var36 = 0;
                        label1160: while (true) {
                            if (var36 >= 4) {
                                this.field267 = new byte[var34][];
                                this.field60 = new byte[var34][];
                                this.field291 = new int[var34];
                                this.field292 = new int[var34];
                                this.field293 = new int[var34];
                                int var44 = 0;
                                while (true) {
                                    if (var44 >= var34) {
                                        break label1160;
                                    }
                                    int var45 = this.field291[var44] = var35[var44];
                                    int var46 = var45 >> 8 & 255;
                                    int var47 = var45 & 255;
                                    int var48 = this.field292[var44] = this.field83.method561(var47, field527, var46, 0);
                                    if (var48 != -1) {
                                        this.field83.method576(3, var48);
                                    }
                                    int var49 = this.field293[var44] = this.field83.method561(var47, field527, var46, 1);
                                    if (var49 != -1) {
                                        this.field83.method576(3, var49);
                                    }
                                    ++var44;
                                }
                            }
                            for (int var37 = 0; var37 < 13; ++var37) {
                                for (int var38 = 0; var38 < 13; ++var38) {
                                    int var39 = this.field357[var36][var37][var38];
                                    if (var39 != -1) {
                                        int var40 = var39 >> 14 & 1023;
                                        int var41 = var39 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < var34; ++var43) {
                                            if (var35[var43] == var42) {
                                                var42 = -1;
                                                break;
                                            }
                                        }
                                        if (var42 != -1) {
                                            var35[var34++] = var42;
                                        }
                                    }
                                }
                            }
                            ++var36;
                        }
                    }
                    int var50 = this.field115 - this.field117;
                    int var51 = this.field116 - this.field118;
                    this.field117 = this.field115;
                    this.field118 = this.field116;
                    for (int var52 = 0; var52 < 16384; ++var52) {
                        class24 var53 = this.field405[var52];
                        if (var53 != null) {
                            for (int var54 = 0; var54 < 10; ++var54) {
                                var53.field835[var54] -= var50;
                                var53.field836[var54] -= var51;
                            }
                            var53.field844 -= var50 * 128;
                            var53.field845 -= var51 * 128;
                        }
                    }
                    for (int var55 = 0; var55 < this.field448; ++var55) {
                        class10 var56 = this.field450[var55];
                        if (var56 != null) {
                            for (int var57 = 0; var57 < 10; ++var57) {
                                var56.field835[var57] -= var50;
                                var56.field836[var57] -= var51;
                            }
                            var56.field844 -= var50 * 128;
                            var56.field845 -= var51 * 128;
                        }
                    }
                    this.field223 = true;
                    byte var58 = 0;
                    byte var59 = 104;
                    byte var60 = 1;
                    if (var50 < 0) {
                        var58 = 103;
                        var59 = -1;
                        var60 = -1;
                    }
                    byte var61 = 0;
                    byte var62 = 104;
                    byte var63 = 1;
                    if (var51 < 0) {
                        var61 = 103;
                        var62 = -1;
                        var63 = -1;
                    }
                    for (int var64 = var58; var59 != var64; var64 += var60) {
                        for (int var65 = var61; var62 != var65; var65 += var63) {
                            int var66 = var50 + var64;
                            int var67 = var51 + var65;
                            for (int var68 = 0; var68 < 4; ++var68) {
                                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                                    this.field162[var68][var64][var65] = this.field162[var68][var66][var67];
                                } else {
                                    this.field162[var68][var64][var65] = null;
                                }
                            }
                        }
                    }
                    for (class13 var69 = (class13) this.field255.method519(); var69 != null; var69 = (class13) this.field255.method521(5)) {
                        var69.field748 -= var50;
                        var69.field749 -= var51;
                        if (var69.field748 < 0 || var69.field749 < 0 || var69.field748 >= 104 || var69.field749 >= 104) {
                            var69.method19();
                        }
                    }
                    if (this.field478 != 0) {
                        this.field478 -= var50;
                        this.field479 -= var51;
                    }
                    this.field399 = false;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 97) {
                    for (int var70 = 0; var70 < this.field539.length; ++var70) {
                        if (this.field539[var70] != this.field524[var70]) {
                            this.field539[var70] = this.field524[var70];
                            this.method60(true, var70);
                            this.field431 = true;
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 146) {
                    this.field435 = false;
                    this.field334 = 1;
                    this.field384 = "";
                    this.field343 = true;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 57) {
                    this.field428 = this.field259.method222(-6);
                    if (this.field515 == this.field428) {
                        if (this.field428 == 3) {
                            this.field515 = 1;
                        } else {
                            this.field515 = 3;
                        }
                        this.field431 = true;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 21) {
                    String var71 = this.field259.method209();
                    if (var71.endsWith(":tradereq:")) {
                        String var72 = var71.substring(0, var71.indexOf(":"));
                        long var73 = class55.method510(var72);
                        boolean var75 = false;
                        for (int var76 = 0; var76 < this.field219; ++var76) {
                            if (this.field482[var76] == var73) {
                                var75 = true;
                                break;
                            }
                        }
                        if (!var75 && this.field356 == 0) {
                            this.method31(var72, true, "wishes to trade with you.", 4);
                        }
                    } else if (var71.endsWith(":duelreq:")) {
                        String var77 = var71.substring(0, var71.indexOf(":"));
                        long var78 = class55.method510(var77);
                        boolean var80 = false;
                        for (int var81 = 0; var81 < this.field219; ++var81) {
                            if (this.field482[var81] == var78) {
                                var80 = true;
                                break;
                            }
                        }
                        if (!var80 && this.field356 == 0) {
                            this.method31(var77, true, "wishes to duel with you.", 8);
                        }
                    } else if (!var71.endsWith(":chalreq:")) {
                        this.method31("", true, var71, 0);
                    } else {
                        String var82 = var71.substring(0, var71.indexOf(":"));
                        long var83 = class55.method510(var82);
                        boolean var85 = false;
                        for (int var86 = 0; var86 < this.field219; ++var86) {
                            if (this.field482[var86] == var83) {
                                var85 = true;
                                break;
                            }
                        }
                        if (!var85 && this.field356 == 0) {
                            String var87 = var71.substring(var71.indexOf(":") + 1, var71.length() - 9);
                            this.method31(var82, true, var87, 8);
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 42) {
                    this.field245 = this.field259.method231(440) * 30;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 69) {
                    int var88 = this.field259.method229((byte) 4);
                    int var89 = this.field259.method207();
                    this.field524[var88] = var89;
                    if (this.field539[var88] != var89) {
                        this.field539[var88] = var89;
                        this.method60(true, var88);
                        this.field431 = true;
                        if (this.field138 != -1) {
                            this.field343 = true;
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 86) {
                    for (int var90 = 0; var90 < this.field450.length; ++var90) {
                        if (this.field450[var90] != null) {
                            this.field450[var90].field839 = -1;
                        }
                    }
                    for (int var91 = 0; var91 < this.field405.length; ++var91) {
                        if (this.field405[var91] != null) {
                            this.field405[var91].field839 = -1;
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 33) {
                    int var92 = this.field259.method204();
                    int var93 = this.field259.method231(440);
                    int var94 = var92 >> 10 & 31;
                    int var95 = var92 >> 5 & 31;
                    int var96 = var92 & 31;
                    class11.method174(var93).field706 = (var96 << 3) + (var94 << 19) + (var95 << 11);
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 41) {
                    int var97 = this.field259.method230(0);
                    int var98 = this.field259.method231(440);
                    this.method100(var97, this.field487);
                    if (var98 != -1) {
                        this.method100(var98, this.field487);
                    }
                    if (this.field78 != -1) {
                        this.method92(this.field78, 15);
                        this.field78 = -1;
                    }
                    if (this.field192 != -1) {
                        this.method92(this.field192, 15);
                        this.field192 = -1;
                    }
                    if (this.field67 != -1) {
                        this.method92(this.field67, 15);
                        this.field67 = -1;
                    }
                    if (this.field289 != var97) {
                        this.method92(this.field289, 15);
                        this.field289 = var97;
                    }
                    if (this.field149 != var97) {
                        this.method92(this.field149, 15);
                        this.field149 = var98;
                    }
                    this.field334 = 0;
                    this.field271 = false;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 171) {
                    int var99 = this.field259.method232(4);
                    if (var99 >= 0) {
                        this.method100(var99, this.field487);
                    }
                    if (this.field59 != var99) {
                        this.method92(this.field59, 15);
                        this.field59 = var99;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 73) {
                    int var100 = this.field259.method231(440);
                    int var101 = this.field259.method230(0);
                    int var102 = this.field259.method231(440);
                    int var103 = this.field259.method230(0);
                    class11.method174(var102).field695 = var103;
                    class11.method174(var102).field696 = var100;
                    class11.method174(var102).field694 = var101;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 89) {
                    long var104 = this.field259.method208(this.field174);
                    int var106 = this.field259.method207();
                    int var107 = this.field259.method202();
                    boolean var108 = false;
                    for (int var109 = 0; var109 < 100; ++var109) {
                        if (this.field204[var109] == var106) {
                            var108 = true;
                            break;
                        }
                    }
                    if (var107 <= 1) {
                        for (int var110 = 0; var110 < this.field219; ++var110) {
                            if (this.field482[var110] == var104) {
                                var108 = true;
                                break;
                            }
                        }
                    }
                    if (!var108 && this.field356 == 0) {
                        try {
                            this.field204[this.field62] = var106;
                            this.field62 = (this.field62 + 1) % 100;
                            String var111 = class41.method464(-375, this.field259, this.field249 - 13);
                            if (var107 != 3) {
                                var111 = class17.method255(810, var111);
                            }
                            if (var107 != 2 && var107 != 3) {
                                if (var107 == 1) {
                                    this.method31("@cr1@" + class55.method514(class55.method511(var104, 622), -36397), true, var111, 7);
                                } else {
                                    this.method31(class55.method514(class55.method511(var104, 622), -36397), true, var111, 3);
                                }
                            } else {
                                this.method31("@cr2@" + class55.method514(class55.method511(var104, 622), -36397), true, var111, 7);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 138) {
                    int var113 = this.field259.method230(0);
                    class11.method174(var113).field665 = 3;
                    if (field73.field620 == null) {
                        class11.method174(var113).field666 = (field73.field619[11] << 5) + (field73.field619[8] << 10) + (field73.field619[0] << 15) + (field73.field627[0] << 25) + (field73.field627[4] << 20) + field73.field619[1];
                    } else {
                        class11.method174(var113).field666 = (int) (field73.field620.field592 + 305419896L);
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 240) {
                    int var114 = this.field259.method229((byte) 4);
                    int var115 = this.field259.method230(0);
                    class11 var116 = class11.method174(var115);
                    if (var116 != null && var116.field707 == 0) {
                        if (var114 < 0) {
                            var114 = 0;
                        }
                        if (var114 > var116.field654 - var116.field688) {
                            var114 = var116.field654 - var116.field688;
                        }
                        var116.field674 = var114;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 176) {
                    int var117 = this.field259.method230(0);
                    int var118 = this.field259.method230(0);
                    class11.method174(var117).field665 = 1;
                    class11.method174(var117).field666 = var118;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 67) {
                    int var119 = this.field259.method202();
                    int var120 = this.field259.method202();
                    int var121 = this.field259.method202();
                    int var122 = this.field259.method202();
                    this.field236[var119] = true;
                    this.field222[var119] = var120;
                    this.field97[var119] = var121;
                    this.field258[var119] = var122;
                    this.field336[var119] = 0;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 137) {
                    if (this.field515 == 12) {
                        this.field431 = true;
                    }
                    this.field315 = this.field259.method202();
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 129) {
                    this.method85(this.field249, 480, this.field259);
                    this.field223 = false;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 16) {
                    this.field431 = true;
                    int var123 = this.field259.method204();
                    class11 var124 = class11.method174(var123);
                    int var125 = this.field259.method204();
                    for (int var126 = 0; var126 < var125; ++var126) {
                        var124.field652[var126] = this.field259.method231(440);
                        int var127 = this.field259.method221((byte) 49);
                        if (var127 == 255) {
                            var127 = this.field259.method237((byte) 102);
                        }
                        var124.field715[var126] = var127;
                    }
                    for (int var128 = var125; var128 < var124.field652.length; ++var128) {
                        var124.field652[var128] = 0;
                        var124.field715[var128] = 0;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 210) {
                    this.field237 = this.field259.method202();
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 166) {
                    this.field365 = this.field259.method223((byte) -82);
                    this.field366 = this.field259.method221((byte) 49);
                    while (this.field259.field769 < this.field249) {
                        int var129 = this.field259.method202();
                        this.method141(var129, 6, this.field259);
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 105) {
                    int var130 = this.field259.method229((byte) 4);
                    class11 var131 = class11.method174(var130);
                    for (int var132 = 0; var132 < var131.field652.length; ++var132) {
                        var131.field652[var132] = -1;
                        var131.field652[var132] = 0;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 72) {
                    int var133 = this.field259.method205();
                    if (this.field138 != var133) {
                        this.method92(this.field138, 15);
                        this.field138 = var133;
                    }
                    this.field343 = true;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 46) {
                    int var134 = this.field259.method221((byte) 49);
                    int var135 = this.field259.method229((byte) 4);
                    if (var135 == 65535) {
                        var135 = -1;
                    }
                    if (this.field541[var134] != var135) {
                        this.method92(this.field541[var134], 15);
                        this.field541[var134] = var135;
                    }
                    this.field431 = true;
                    this.field471 = true;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 239) {
                    int var136 = this.field259.method230(0);
                    String var137 = this.field259.method209();
                    class11.method174(var136).field693 = var137;
                    int var10001 = this.field541[this.field515];
                    if (class11.method174(var136).field675 == var10001) {
                        this.field431 = true;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 29) {
                    int var138 = this.field259.method231(440);
                    boolean var139 = this.field259.method223((byte) -82) == 1;
                    class11.method174(var138).field698 = var139;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 186) {
                    int var140 = this.field259.method232(4);
                    int var141 = this.field259.method231(440);
                    int var142 = this.field259.method232(4);
                    class11 var143 = class11.method174(var141);
                    var143.field662 = var142;
                    var143.field663 = var140;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 99) {
                    int var144 = this.field259.method230(0);
                    this.method100(var144, this.field487);
                    if (this.field192 != -1) {
                        this.method92(this.field192, 15);
                        this.field192 = -1;
                        this.field431 = true;
                        this.field471 = true;
                    }
                    if (this.field289 != -1) {
                        this.method92(this.field289, 15);
                        this.field289 = -1;
                        this.field313 = true;
                    }
                    if (this.field149 != -1) {
                        this.method92(this.field149, 15);
                        this.field149 = -1;
                    }
                    if (this.field78 != -1) {
                        this.method92(this.field78, 15);
                        this.field78 = -1;
                    }
                    if (this.field67 != var144) {
                        this.method92(this.field67, 15);
                        this.field67 = var144;
                    }
                    this.field271 = false;
                    this.field343 = true;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 156) {
                    this.field478 = 0;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 246 || this.field250 == 225 || this.field250 == 195 || this.field250 == 249 || this.field250 == 18 || this.field250 == 191 || this.field250 == 59 || this.field250 == 80 || this.field250 == 234 || this.field250 == 213 || this.field250 == 35) {
                    this.method141(this.field250, 6, this.field259);
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 207) {
                    String var145 = this.field259.method209();
                    int var146 = this.field259.method202();
                    int var147 = this.field259.method202();
                    if (var146 >= 1 && var146 <= 5) {
                        if (var145.equalsIgnoreCase("null")) {
                            var145 = null;
                        }
                        this.field146[var146 - 1] = var145;
                        this.field147[var146 - 1] = var147 == 0;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 76) {
                    this.field399 = false;
                    for (int var148 = 0; var148 < 5; ++var148) {
                        this.field236[var148] = false;
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 222) {
                    this.field219 = this.field249 / 8;
                    for (int var149 = 0; var149 < this.field219; ++var149) {
                        this.field482[var149] = this.field259.method208(this.field174);
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 61) {
                    this.field445 = this.field259.method202();
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 217) {
                    int var150 = this.field259.method230(0);
                    int var151 = this.field259.method204();
                    int var152 = this.field259.method231(440);
                    if (var151 == 65535) {
                        class11.method174(var150).field665 = 0;
                        this.field250 = -1;
                        return true;
                    }
                    class72 var153 = class72.method590(var151);
                    class11.method174(var150).field665 = 4;
                    class11.method174(var150).field666 = var151;
                    class11.method174(var150).field695 = var153.field1735;
                    class11.method174(var150).field696 = var153.field1722;
                    class11.method174(var150).field694 = var153.field1731 * 100 / var152;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 199) {
                    long var154 = this.field259.method208(this.field174);
                    int var156 = this.field259.method202();
                    String var157 = class55.method514(class55.method511(var154, 622), -36397);
                    for (int var158 = 0; var158 < this.field263; ++var158) {
                        if (this.field242[var158] == var154) {
                            if (this.field210[var158] != var156) {
                                this.field210[var158] = var156;
                                this.field431 = true;
                                if (var156 > 0) {
                                    this.method31("", true, var157 + " has logged in.", 5);
                                }
                                if (var156 == 0) {
                                    this.method31("", true, var157 + " has logged out.", 5);
                                }
                            }
                            var157 = null;
                            break;
                        }
                    }
                    if (var157 != null && this.field263 < 200) {
                        this.field242[this.field263] = var154;
                        this.field209[this.field263] = var157;
                        this.field210[this.field263] = var156;
                        ++this.field263;
                        this.field431 = true;
                    }
                    boolean var159 = false;
                    while (!var159) {
                        var159 = true;
                        for (int var160 = 0; var160 < this.field263 - 1; ++var160) {
                            if (this.field210[var160] != field273 && this.field210[var160 + 1] == field273 || this.field210[var160] == 0 && this.field210[var160 + 1] != 0) {
                                int var161 = this.field210[var160];
                                this.field210[var160] = this.field210[var160 + 1];
                                this.field210[var160 + 1] = var161;
                                String var162 = this.field209[var160];
                                this.field209[var160] = this.field209[var160 + 1];
                                this.field209[var160 + 1] = var162;
                                long var163 = this.field242[var160];
                                this.field242[var160] = this.field242[var160 + 1];
                                this.field242[var160 + 1] = var163;
                                this.field431 = true;
                                var159 = false;
                            }
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 27) {
                    this.field431 = true;
                    int var165 = this.field259.method204();
                    class11 var166 = class11.method174(var165);
                    while (this.field259.field769 < this.field249) {
                        int var167 = this.field259.method216();
                        int var168 = this.field259.method204();
                        int var169 = this.field259.method202();
                        if (var169 == 255) {
                            var169 = this.field259.method207();
                        }
                        if (var167 >= 0 && var167 < var166.field652.length) {
                            var166.field652[var167] = var168;
                            var166.field715[var167] = var169;
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 90) {
                    this.field365 = this.field259.method223((byte) -82);
                    this.field366 = this.field259.method202();
                    for (int var170 = this.field365; var170 < this.field365 + 8; ++var170) {
                        for (int var171 = this.field366; var171 < this.field366 + 8; ++var171) {
                            if (this.field162[this.field105][var170][var171] != null) {
                                this.field162[this.field105][var170][var171] = null;
                                this.method134(var170, var171);
                            }
                        }
                    }
                    for (class13 var172 = (class13) this.field255.method519(); var172 != null; var172 = (class13) this.field255.method521(5)) {
                        if (var172.field748 >= this.field365 && var172.field748 < this.field365 + 8 && var172.field749 >= this.field366 && var172.field749 < this.field366 + 8 && this.field105 == var172.field746) {
                            var172.field741 = 0;
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 135) {
                    int var173 = this.field259.method204();
                    this.method100(var173, this.field487);
                    if (this.field192 != -1) {
                        this.method92(this.field192, 15);
                        this.field192 = -1;
                        this.field431 = true;
                        this.field471 = true;
                    }
                    if (this.field67 != -1) {
                        this.method92(this.field67, 15);
                        this.field67 = -1;
                        this.field343 = true;
                    }
                    if (this.field289 != -1) {
                        this.method92(this.field289, 15);
                        this.field289 = -1;
                        this.field313 = true;
                    }
                    if (this.field149 != -1) {
                        this.method92(this.field149, 15);
                        this.field149 = -1;
                    }
                    if (this.field78 != var173) {
                        this.method92(this.field78, 15);
                        this.field78 = var173;
                    }
                    if (this.field334 != 0) {
                        this.field334 = 0;
                        this.field343 = true;
                    }
                    this.field271 = false;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 181) {
                    this.field431 = true;
                    int var174 = this.field259.method237((byte) 102);
                    int var175 = this.field259.method222(-6);
                    int var176 = this.field259.method221((byte) 49);
                    this.field321[var176] = var174;
                    this.field351[var176] = var175;
                    this.field269[var176] = 1;
                    for (int var177 = 0; var177 < 98; ++var177) {
                        if (var174 >= field518[var177]) {
                            this.field269[var176] = var177 + 2;
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 2) {
                    this.field515 = this.field259.method221((byte) 49);
                    this.field431 = true;
                    this.field471 = true;
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 101) {
                    this.field525 = this.field259.method231(440);
                    this.field61 = this.field259.method236(this.field196);
                    this.field227 = this.field259.method229((byte) 4);
                    this.field362 = this.field259.method204();
                    this.field421 = this.field259.method202();
                    this.field84 = this.field259.method231(440);
                    this.field113 = this.field259.method204();
                    this.field495 = this.field259.method230(0);
                    this.field497 = this.field259.method230(0);
                    this.field414 = this.field259.method231(440);
                    this.field202 = this.field259.method229((byte) 4);
                    signlink.dnslookup(class55.method513(this.field61, true));
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 31) {
                    this.field399 = true;
                    this.field296 = this.field259.method202();
                    this.field297 = this.field259.method202();
                    this.field298 = this.field259.method204();
                    this.field299 = this.field259.method202();
                    this.field300 = this.field259.method202();
                    if (this.field300 >= 100) {
                        int var178 = this.field296 * 128 + 64;
                        int var179 = this.field297 * 128 + 64;
                        int var180 = this.method34(var179, 215, this.field105, var178) - this.field298;
                        int var181 = var178 - this.field324;
                        int var182 = var180 - this.field325;
                        int var183 = var179 - this.field326;
                        int var184 = (int) Math.sqrt((double) (var181 * var181 + var183 * var183));
                        this.field327 = (int) (Math.atan2((double) var182, (double) var184) * 325.949D) & 2047;
                        this.field328 = (int) (Math.atan2((double) var181, (double) var183) * -325.949D) & 2047;
                        if (this.field327 < 128) {
                            this.field327 = 128;
                        }
                        if (this.field327 > 383) {
                            this.field327 = 383;
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                if (this.field250 == 232) {
                    int var185 = this.field259.method231(440);
                    byte var186 = this.field259.method224(this.field514);
                    this.field524[var185] = var186;
                    if (this.field539[var185] != var186) {
                        this.field539[var185] = var186;
                        this.method60(true, var185);
                        this.field431 = true;
                        if (this.field138 != -1) {
                            this.field343 = true;
                        }
                    }
                    this.field250 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field250 + "," + this.field249 + " - " + this.field370 + "," + this.field371);
                this.method76(false);
            } catch (IOException var191) {
                this.method74(true);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field250 + "," + this.field370 + "," + this.field371 + " - " + this.field249 + "," + (field73.field835[0] + this.field115) + "," + (field73.field836[0] + this.field116) + " - ";
                for (int var189 = 0; var189 < this.field249 && var189 < 50; ++var189) {
                    var188 = var188 + this.field259.field768[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method76(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method151(boolean arg0) {
        this.method57(0);
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field286 == 1) {
            this.field180[this.field285 / 100].method376(this.field284 - 8 - 4, true, this.field283 - 8 - 4);
        }
        if (this.field286 == 2) {
            this.field180[this.field285 / 100 + 4].method376(this.field284 - 8 - 4, true, this.field283 - 8 - 4);
            ++field447;
            if (field447 > 52) {
                field447 = 0;
                this.field387.method191(this.field240, 103);
            }
        }
        if (this.field59 != -1) {
            this.method79(this.field194, this.field346, this.field59);
            this.method122(0, 481, 0, class11.method174(this.field59), 0);
        }
        if (this.field78 != -1) {
            this.method79(this.field194, this.field346, this.field78);
            this.method122(0, 481, 0, class11.method174(this.field78), 0);
        }
        this.method98((byte) 8);
        if (!this.field301) {
            this.method109(-697);
            this.method112(false);
        } else if (this.field422 == 0) {
            this.method90((byte) -10);
        }
        if (this.field445 == 1) {
            this.field537.method376(296, true, 472);
        }
        if (field496) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field10 < 30 && field276) {
                var5 = 16711680;
            }
            if (super.field10 < 20 && !field276) {
                var5 = 16711680;
            }
            this.field468.method472(var5, var3, var4, 17401, "Fps:" + super.field10);
            int var14 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field276) {
                int var9 = 16711680;
            }
            if (var7 > 67108864 && !field276) {
                int var10 = 16711680;
            }
            this.field468.method472(16776960, var3, var14, 17401, "Mem:" + var7 + "k");
            var14 += 15;
        }
        if (this.field245 != 0) {
            int var11 = this.field245 / 50;
            int var12 = var11 / 60;
            int var13 = var11 % 60;
            if (var13 < 10) {
                this.field468.method477(16776960, "System update in: " + var12 + ":0" + var13, 3, 329, 4);
            } else {
                this.field468.method477(16776960, "System update in: " + var12 + ":" + var13, 3, 329, 4);
            }
            ++field94;
            if (field94 > 77) {
                field94 = 0;
                this.field387.method191(this.field240, 29);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method152(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field330 = "";
                this.field331 = "Connecting to server...";
                this.method94(false, true);
            }
            this.field132 = new class69(0, this, this.method119(field274 + 43594));
            long var4 = class55.method510(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field387.field769 = 0;
            this.field387.method192(14);
            this.field387.method192(var6);
            this.field132.method587(-39006, this.field387.field768, 0, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field132.method584();
            }
            int var8 = this.field132.method584();
            int var9 = var8;
            if (var8 == 0) {
                this.field132.method586(this.field259.field768, 0, 8);
                this.field259.field769 = 0;
                this.field287 = this.field259.method208(this.field174);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field287 >> 32), (int) this.field287 };
                this.field387.field769 = 0;
                this.field387.method192(10);
                this.field387.method196(var10[0]);
                this.field387.method196(var10[1]);
                this.field387.method196(var10[2]);
                this.field387.method196(var10[3]);
                this.field387.method196(signlink.uid);
                this.field387.method199(arg0);
                this.field387.method199(arg1);
                this.field387.method217(field206, this.field169, field158);
                this.field507.field769 = 0;
                if (arg2) {
                    this.field507.method192(18);
                } else {
                    this.field507.method192(16);
                }
                this.field507.method192(this.field387.field769 + 36 + 1 + 1 + 2);
                this.field507.method192(255);
                this.field507.method193(345);
                this.field507.method192(field276 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field507.method196(this.field538[var11]);
                }
                this.field507.method200(this.field387.field768, 0, this.field387.field769, 717);
                this.field387.field773 = new class60((byte) 4, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field92 = new class60((byte) 4, var10);
                this.field132.method587(-39006, this.field507.field768, 0, this.field507.field769);
                var8 = this.field132.method584();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method152(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field528 = this.field132.method584();
                field475 = this.field132.method584() == 1;
                this.field542 = 0L;
                this.field139 = 0;
                this.field332.field1707 = 0;
                super.field19 = true;
                this.field224 = true;
                this.field238 = true;
                this.field387.field769 = 0;
                this.field259.field769 = 0;
                this.field250 = -1;
                this.field369 = -1;
                this.field370 = -1;
                this.field371 = -1;
                this.field249 = 0;
                this.field251 = 0;
                this.field245 = 0;
                this.field253 = 0;
                this.field193 = 0;
                this.field436 = 0;
                this.field301 = false;
                super.field20 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field161[var13] = null;
                }
                this.field502 = 0;
                this.field376 = 0;
                this.field142 = 0;
                this.field345 = 0;
                this.field519 = (int) (Math.random() * 100.0D) - 50;
                this.field294 = (int) (Math.random() * 110.0D) - 55;
                this.field432 = (int) (Math.random() * 80.0D) - 40;
                this.field165 = (int) (Math.random() * 120.0D) - 60;
                this.field198 = (int) (Math.random() * 30.0D) - 20;
                this.field484 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field237 = 0;
                this.field403 = -1;
                this.field478 = 0;
                this.field479 = 0;
                this.field451 = 0;
                this.field406 = 0;
                for (int var14 = 0; var14 < this.field448; ++var14) {
                    this.field450[var14] = null;
                    this.field455[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field405[var15] = null;
                }
                field73 = this.field450[this.field449] = new class10();
                this.field391.method523();
                this.field373.method523();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field162[var16][var17][var18] = null;
                        }
                    }
                }
                this.field255 = new class57((byte) 55);
                this.field264 = 0;
                this.field263 = 0;
                this.method92(this.field138, 15);
                this.field138 = -1;
                this.method92(this.field67, 15);
                this.field67 = -1;
                this.method92(this.field78, 15);
                this.field78 = -1;
                this.method92(this.field289, 15);
                this.field289 = -1;
                this.method92(this.field149, 15);
                this.field149 = -1;
                this.method92(this.field192, 15);
                this.field192 = -1;
                this.method92(this.field59, 15);
                this.field59 = -1;
                this.field271 = false;
                this.field515 = 3;
                this.field334 = 0;
                this.field301 = false;
                this.field435 = false;
                this.field69 = null;
                this.field445 = 0;
                this.field428 = -1;
                this.field401 = true;
                this.method45(-194);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field225[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field146[var20] = null;
                    this.field147[var20] = false;
                }
                field472 = 0;
                field521 = 0;
                field177 = 0;
                field429 = 0;
                field458 = 0;
                field207 = 0;
                field216 = 0;
                field440 = 0;
                field416 = 0;
                field526 = 0;
                this.method55(14922);
            } else if (var8 == 3) {
                this.field330 = "";
                this.field331 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field330 = "Your account has been disabled.";
                this.field331 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field330 = "Your account is already logged in.";
                this.field331 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field330 = "RuneScape has been updated!";
                this.field331 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field330 = "This world is full.";
                this.field331 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field330 = "Unable to connect.";
                this.field331 = "Login server offline.";
            } else if (var8 == 9) {
                this.field330 = "Login limit exceeded.";
                this.field331 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field330 = "Unable to connect.";
                this.field331 = "Bad session id.";
            } else if (var8 == 11) {
                this.field330 = "Login server rejected session.";
                this.field331 = "Please try again.";
            } else if (var8 == 12) {
                this.field330 = "You need a members account to login to this world.";
                this.field331 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field330 = "Could not complete login.";
                this.field331 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field330 = "The server is being updated.";
                this.field331 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field238 = true;
                this.field387.field769 = 0;
                this.field259.field769 = 0;
                this.field250 = -1;
                this.field369 = -1;
                this.field370 = -1;
                this.field371 = -1;
                this.field249 = 0;
                this.field251 = 0;
                this.field245 = 0;
                this.field436 = 0;
                this.field301 = false;
                this.field415 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field330 = "Login attempts exceeded.";
                this.field331 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field330 = "You are standing in a members-only area.";
                this.field331 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field330 = "Invalid loginserver requested";
                this.field331 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field330 = "Malformed login packet.";
                    this.field331 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field99 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field99;
                            this.method152(arg0, arg1, arg2);
                        } else {
                            this.field330 = "No response from loginserver";
                            this.field331 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field330 = "No response from server";
                        this.field331 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field330 = "Unexpected server response";
                    this.field331 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field132.method584();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field330 = "You have only just left another world";
                    this.field331 = "Your profile will be transferred in: " + var26;
                    this.method94(false, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method152(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field330 = "";
            this.field331 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILGHHPHSRU;Z)V")
    private final void method153(int arg0, class14 arg1, boolean arg2) {
        if (!arg2) {
            this.field194 = 216;
        }
        while (arg1.field770 + 21 < arg0 * 8) {
            int var4 = arg1.method213(14, this.field489);
            if (var4 == 16383) {
                break;
            }
            if (this.field405[var4] == null) {
                this.field405[var4] = new class24();
            }
            class24 var5 = this.field405[var4];
            this.field407[this.field406++] = var4;
            var5.field855 = field419;
            int var6 = arg1.method213(1, this.field489);
            if (var6 == 1) {
                this.field454[this.field453++] = var4;
            }
            int var7 = arg1.method213(5, this.field489);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.field987 = class6.method162(arg1.method213(12, this.field489));
            int var8 = arg1.method213(1, this.field489);
            int var9 = arg1.method213(5, this.field489);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.field856 = var5.field987.field566;
            var5.field867 = var5.field987.field568;
            var5.field881 = var5.field987.field576;
            var5.field882 = var5.field987.field590;
            var5.field883 = var5.field987.field581;
            var5.field884 = var5.field987.field578;
            var5.field868 = var5.field987.field596;
            var5.method242(field73.field835[0] + var9, field73.field836[0] + var7, (byte) -56, var8 == 1);
        }
        arg1.method214(0);
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method154(int arg0) {
        this.field249 += arg0;
        this.field387.method191(this.field240, 47);
        if (this.field192 != -1) {
            this.method92(this.field192, 15);
            this.field192 = -1;
            this.field431 = true;
            this.field271 = false;
            this.field471 = true;
        }
        if (this.field67 != -1) {
            this.method92(this.field67, 15);
            this.field67 = -1;
            this.field343 = true;
            this.field271 = false;
        }
        if (this.field289 != -1) {
            this.method92(this.field289, 15);
            this.field289 = -1;
            this.field313 = true;
        }
        if (this.field149 != -1) {
            this.method92(this.field149, 15);
            this.field149 = -1;
        }
        if (this.field78 != -1) {
            this.method92(this.field78, 15);
            this.field78 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(B)V")
    public final void method155(byte arg0) {
        if (this.field205 != arg0) {
            this.field250 = this.field259.method202();
        }
        for (int var2 = 0; var2 < this.field345; ++var2) {
            if (this.field385[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field338[var2] == this.field58 && this.field441[var2] == this.field473) {
                        if (!this.method144((byte) 4)) {
                            var3 = true;
                        }
                    } else {
                        class14 var4 = class59.method528(this.field441[var2], -960, this.field338[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field769 / 22) > (long) (this.field374 / 22) + this.field457) {
                            this.field374 = var4.field769;
                            this.field457 = System.currentTimeMillis();
                            if (this.method80(var4.field769, var4.field768, true)) {
                                this.field58 = this.field338[var2];
                                this.field473 = this.field441[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field385[var2] != -5) {
                    this.field385[var2] = -5;
                } else {
                    --this.field345;
                    for (int var6 = var2; var6 < this.field345; ++var6) {
                        this.field338[var6] = this.field338[var6 + 1];
                        this.field441[var6] = this.field441[var6 + 1];
                        this.field385[var6] = this.field385[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field385[var2]--;
            }
        }
        if (this.field400 > 0) {
            this.field400 -= 20;
            if (this.field400 < 0) {
                this.field400 = 0;
            }
            if (this.field400 == 0 && this.field241 && !field276) {
                this.field408 = this.field98;
                this.field409 = true;
                this.field83.method576(2, this.field408);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (this.field502 == 0 && this.field376 == 0) {
            this.field262[this.field436] = "Walk here";
            this.field360[this.field436] = 506;
            this.field358[this.field436] = super.field22;
            this.field359[this.field436] = super.field23;
            ++this.field436;
        }
        int var2 = -1;
        this.field238 &= arg0;
        for (int var3 = 0; var3 < class35.field1267; ++var3) {
            int var4 = class35.field1268[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field239.method339(this.field105, var5, var6, var4) >= 0) {
                    class28 var9 = class28.method365(var8);
                    if (var9.field1118 != null) {
                        var9 = var9.method370(this.field95);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field502 == 1) {
                        this.field262[this.field436] = "Use " + this.field506 + " with @cya@" + var9.field1113;
                        this.field360[this.field436] = 484;
                        this.field361[this.field436] = var4;
                        this.field358[this.field436] = var5;
                        this.field359[this.field436] = var6;
                        ++this.field436;
                    } else if (this.field376 == 1) {
                        if ((this.field378 & 4) == 4) {
                            this.field262[this.field436] = this.field379 + " @cya@" + var9.field1113;
                            this.field360[this.field436] = 807;
                            this.field361[this.field436] = var4;
                            this.field358[this.field436] = var5;
                            this.field359[this.field436] = var6;
                            ++this.field436;
                        }
                    } else {
                        if (var9.field1099 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1099[var10] != null) {
                                    this.field262[this.field436] = var9.field1099[var10] + " @cya@" + var9.field1113;
                                    if (var10 == 0) {
                                        this.field360[this.field436] = 538;
                                    }
                                    if (var10 == 1) {
                                        this.field360[this.field436] = 337;
                                    }
                                    if (var10 == 2) {
                                        this.field360[this.field436] = 496;
                                    }
                                    if (var10 == 3) {
                                        this.field360[this.field436] = 846;
                                    }
                                    if (var10 == 4) {
                                        this.field360[this.field436] = 1586;
                                    }
                                    this.field361[this.field436] = var4;
                                    this.field358[this.field436] = var5;
                                    this.field359[this.field436] = var6;
                                    ++this.field436;
                                }
                            }
                        }
                        this.field262[this.field436] = "Examine @cya@" + var9.field1113;
                        this.field360[this.field436] = 1138;
                        this.field361[this.field436] = var9.field1103 << 14;
                        this.field358[this.field436] = var5;
                        this.field359[this.field436] = var6;
                        ++this.field436;
                    }
                }
                if (var7 == 1) {
                    class24 var11 = this.field405[var8];
                    if (var11.field987.field566 == 1 && (var11.field844 & 127) == 64 && (var11.field845 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field406; ++var12) {
                            class24 var15 = this.field405[this.field407[var12]];
                            if (var15 != null && var11 != var15 && var15.field987.field566 == 1 && var11.field844 == var15.field844 && var11.field845 == var15.field845) {
                                this.method75((byte) 1, var15.field987, this.field407[var12], var6, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field451; ++var13) {
                            class10 var14 = this.field450[this.field452[var13]];
                            if (var14 != null && var11.field844 == var14.field844 && var11.field845 == var14.field845) {
                                this.method87(var14, var5, this.field452[var13], -800, var6);
                            }
                        }
                    }
                    this.method75((byte) 1, var11.field987, var8, var6, var5);
                }
                if (var7 == 0) {
                    class10 var16 = this.field450[var8];
                    if ((var16.field844 & 127) == 64 && (var16.field845 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field406; ++var17) {
                            class24 var20 = this.field405[this.field407[var17]];
                            if (var20 != null && var20.field987.field566 == 1 && var16.field844 == var20.field844 && var16.field845 == var20.field845) {
                                this.method75((byte) 1, var20.field987, this.field407[var17], var6, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field451; ++var18) {
                            class10 var19 = this.field450[this.field452[var18]];
                            if (var19 != null && var16 != var19 && var16.field844 == var19.field844 && var16.field845 == var19.field845) {
                                this.method87(var19, var5, this.field452[var18], -800, var6);
                            }
                        }
                    }
                    this.method87(var16, var5, var8, -800, var6);
                }
                if (var7 == 3) {
                    class57 var21 = this.field162[this.field105][var5][var6];
                    if (var21 != null) {
                        for (class18 var22 = (class18) var21.method520(5); var22 != null; var22 = (class18) var21.method522((byte) 109)) {
                            class72 var23 = class72.method590(var22.field908);
                            if (this.field502 == 1) {
                                this.field262[this.field436] = "Use " + this.field506 + " with @lre@" + var23.field1727;
                                this.field360[this.field436] = 383;
                                this.field361[this.field436] = var22.field908;
                                this.field358[this.field436] = var5;
                                this.field359[this.field436] = var6;
                                ++this.field436;
                            } else if (this.field376 == 1) {
                                if ((this.field378 & 1) == 1) {
                                    this.field262[this.field436] = this.field379 + " @lre@" + var23.field1727;
                                    this.field360[this.field436] = 78;
                                    this.field361[this.field436] = var22.field908;
                                    this.field358[this.field436] = var5;
                                    this.field359[this.field436] = var6;
                                    ++this.field436;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1751 != null && var23.field1751[var24] != null) {
                                        this.field262[this.field436] = var23.field1751[var24] + " @lre@" + var23.field1727;
                                        if (var24 == 0) {
                                            this.field360[this.field436] = 230;
                                        }
                                        if (var24 == 1) {
                                            this.field360[this.field436] = 658;
                                        }
                                        if (var24 == 2) {
                                            this.field360[this.field436] = 595;
                                        }
                                        if (var24 == 3) {
                                            this.field360[this.field436] = 670;
                                        }
                                        if (var24 == 4) {
                                            this.field360[this.field436] = 687;
                                        }
                                        this.field361[this.field436] = var22.field908;
                                        this.field358[this.field436] = var5;
                                        this.field359[this.field436] = var6;
                                        ++this.field436;
                                    } else if (var24 == 2) {
                                        this.field262[this.field436] = "Take @lre@" + var23.field1727;
                                        this.field360[this.field436] = 595;
                                        this.field361[this.field436] = var22.field908;
                                        this.field358[this.field436] = var5;
                                        this.field359[this.field436] = var6;
                                        ++this.field436;
                                    }
                                }
                                this.field262[this.field436] = "Examine @lre@" + var23.field1727;
                                this.field360[this.field436] = 1408;
                                this.field361[this.field436] = var22.field908;
                                this.field358[this.field436] = var5;
                                this.field359[this.field436] = var6;
                                ++this.field436;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;III)LDTIATKJO;")
    public final class8 method157(int arg0, String arg1, String arg2, int arg3, int arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field481[0] != null) {
                var7 = this.field481[0].method549(arg5, 0);
            }
        } catch (Exception var31) {
        }
        if (var7 != null) {
            this.field234.reset();
            this.field234.update(var7);
            int var9 = (int) this.field234.getValue();
            if (arg0 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class8((byte) 8, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(arg4, field85, "Requesting " + arg2);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method63(arg1 + arg0);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class14 var17 = new class14(-527, var16);
                    var17.field769 = 3;
                    int var18 = var17.method206() + 6;
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
                            this.method13(arg4, field85, "Loading " + arg2 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field481[0] != null) {
                            this.field481[0].method550(arg5, var7, (byte) 7, var7.length);
                        }
                    } catch (Exception var30) {
                        this.field481[0] = null;
                    }
                    if (var7 != null) {
                        this.field234.reset();
                        this.field234.update(var7);
                        int var24 = (int) this.field234.getValue();
                        if (arg0 != var24) {
                            var7 = null;
                            ++var11;
                            var12 = "Checksum error: " + var24;
                        }
                    }
                } catch (IOException var32) {
                    if (var12.equals("Unknown error")) {
                        var12 = "Connection error";
                    }
                    var7 = null;
                } catch (NullPointerException var33) {
                    var12 = "Null error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (ArrayIndexOutOfBoundsException var34) {
                    var12 = "Bounds error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (Exception var35) {
                    var12 = "Unexpected error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var7 == null) {
                    for (int var26 = var8; var26 > 0; --var26) {
                        if (var11 >= 3) {
                            this.method13(arg4, field85, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method13(arg4, field85, var12 + " - Retrying in " + var26);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var29) {
                        }
                    }
                    var8 *= 2;
                    if (var8 > 60) {
                        var8 = 60;
                    }
                    this.field86 = !this.field86;
                }
            }
            class8 var27 = new class8((byte) 8, var7);
            if (arg3 >= 0) {
                for (int var28 = 1; var28 > 0; ++var28) {
                }
            }
            return var27;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field182[var1] = var0 - 1;
            var0 += var0;
        }
        field206 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field257 = -347;
        field273 = 10;
        field275 = true;
        field344 = 927;
        field427 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field474 = -550;
        field501 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field518 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field518[var3] = var2 / 4;
        }
        field527 = 22558;
        field531 = 32443;
    }
}
