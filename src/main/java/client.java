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

    @OriginalMember(owner = "client!client", name = "N", descriptor = "[Ljava/lang/String;")
    private String[] field122 = new String[500];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private int field123 = -1;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    private int field124 = -1;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[B")
    private byte[] field125 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
    private int[] field126 = new int[9];

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    private int field128 = -794;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Z")
    private boolean field130 = false;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "B")
    private byte field131 = -97;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
    public boolean field132 = false;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[LTPIBHECB;")
    private class56[] field134 = new class56[20];

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "B")
    private byte field136 = 9;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[LTPIBHECB;")
    private class56[] field145 = new class56[32];

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private int field149 = -1;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "LCMGGUSPR;")
    private class10 field152 = new class10(new byte[5000], field386);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "[LIGOBKPZP;")
    private class25[] field153 = new class25[16384];

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
    public int[] field155 = new int[16384];

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
    private boolean field156 = false;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int field158 = -648;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "[I")
    private int[] field160 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field164 = 50;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
    private int[] field165 = new int[this.field164];

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
    private int[] field166 = new int[this.field164];

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
    private int[] field167 = new int[this.field164];

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
    private int[] field168 = new int[this.field164];

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
    private int[] field169 = new int[this.field164];

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "[I")
    private int[] field170 = new int[this.field164];

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "[I")
    private int[] field171 = new int[this.field164];

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "[Ljava/lang/String;")
    private String[] field172 = new String[this.field164];

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "B")
    private byte field173 = 2;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field178 = 1;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "B")
    private byte field179 = 25;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "B")
    private byte field180 = -98;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
    private volatile boolean field183 = false;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "[I")
    public int[] field184 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
    private int[] field185 = new int[151];

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field186 = 3353893;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field187 = 936;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "[LTPIBHECB;")
    private class56[] field193 = new class56[32];

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "[I")
    private int[] field195 = new int[class14.field685];

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
    private int field196 = 5063219;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
    private boolean field199 = true;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "[Ljava/lang/String;")
    private String[] field204 = new String[200];

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "B")
    private byte field206 = -98;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
    private int[] field207 = new int[50];

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
    private boolean field208 = false;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "Z")
    private boolean field215 = false;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "LCMGGUSPR;")
    private class10 field218 = class10.method182(1, 893);

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "[[I")
    private int[][] field225 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
    private int[] field228 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field230 = 95;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "B")
    private byte field231 = -123;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "LWCVCMGLX;")
    private class62 field232 = new class62(-388);

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field233 = 2048;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private int field234 = 2047;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "[LMDBQGDOL;")
    private class36[] field235 = new class36[this.field233];

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
    public int[] field237 = new int[this.field233];

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
    private int[] field239 = new int[this.field233];

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[LCMGGUSPR;")
    private class10[] field240 = new class10[this.field233];

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
    private int field242 = 78;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
    private boolean field252 = false;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "B")
    private byte field253 = 67;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "[LOCPHNIUN;")
    private class40[] field255 = new class40[100];

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
    private int[] field257 = new int[5];

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
    private boolean field260 = true;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "Z")
    private boolean field264 = true;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field266 = -1;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field268 = 2;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
    public int[] field269 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "[[[I")
    private int[][][] field270 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
    private boolean field271 = false;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "[LOCPHNIUN;")
    private class40[] field273 = new class40[13];

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
    private int[] field274 = new int[5];

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
    public int[] field276 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
    private int[] field277 = new int[500];

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
    private int[] field278 = new int[500];

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
    private int[] field279 = new int[500];

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
    private int[] field280 = new int[500];

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "B")
    private byte field281 = 0;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "Z")
    private boolean field282 = false;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "Z")
    private boolean field283 = false;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "[I")
    private int[] field284 = new int[class14.field685];

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "[I")
    private int[] field287 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
    private int[] field288 = new int[1000];

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "LCMGGUSPR;")
    private class10 field297 = class10.method182(1, 893);

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
    private int[] field299 = new int[256];

    @OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
    private int[] field300 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
    private int[] field310 = new int[151];

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
    private int[] field321 = new int[50];

    @OriginalMember(owner = "client!client", name = "He", descriptor = "Z")
    private boolean field324 = false;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    private int field327 = 2;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "[LVLOWRGUJ;")
    private class61[] field328 = new class61[4];

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "[I")
    private final int[] field329 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "Ljava/lang/String;")
    private String field330 = "";

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
    private boolean field331 = true;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "LCMGGUSPR;")
    private class10 field336 = class10.method182(1, 893);

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "Ljava/lang/String;")
    private String field337 = "";

    @OriginalMember(owner = "client!client", name = "We", descriptor = "Z")
    private boolean field339 = false;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
    private int[] field340 = new int[50];

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "B")
    private byte field341 = -57;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
    private int[] field343 = new int[5];

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int field345 = -1;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field346 = 1;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "Ljava/lang/String;")
    private String field353 = "";

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "Z")
    private boolean field364 = false;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "B")
    private byte field368 = 6;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "Z")
    private boolean field369 = false;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private int field370 = -1;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field371 = -1;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private int field374 = -1;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "LWJQTPVDG;")
    private class65 field375 = new class65();

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "Z")
    public boolean field389 = true;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    private int field392 = 2301979;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
    private boolean field393 = false;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
    private int[] field395 = new int[7];

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    private int field396 = -12929;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "Z")
    private boolean field399 = true;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "[[I")
    private int[][] field402 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field403 = 128;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "[LTPIBHECB;")
    private class56[] field409 = new class56[1000];

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
    private int field410 = 7;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "Ljava/lang/String;")
    private String field411 = "";

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "Ljava/lang/String;")
    private String field412 = "";

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
    private boolean field413 = true;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field427 = 5200;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
    private boolean field432 = false;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "Z")
    private boolean field439 = false;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "[J")
    private long[] field440 = new long[200];

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "Ljava/lang/String;")
    private String field441 = "";

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
    private int[] field442 = new int[200];

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "Ljava/lang/String;")
    private String field444 = "";

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "[Ljava/lang/String;")
    private String[] field446 = new String[100];

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
    private int[] field447 = new int[100];

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
    private boolean field449 = false;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "LWCVCMGLX;")
    private class62 field450 = new class62(-388);

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
    private int[] field452 = new int[100];

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "[Ljava/lang/String;")
    private String[] field453 = new String[100];

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "[Ljava/lang/String;")
    private String[] field454 = new String[100];

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "Ljava/lang/String;")
    private String field459 = "";

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "Z")
    private boolean field461 = false;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int field462 = 5;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
    private int field463 = 3;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field466 = -1;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    private int field468 = 1;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
    private boolean field472 = false;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "[J")
    private long[] field473 = new long[100];

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
    private int[] field474 = new int[class14.field685];

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private int field475 = -1;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "Z")
    private boolean field476 = true;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "[Ljava/lang/String;")
    private String[] field478 = new String[5];

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "[Z")
    private boolean[] field479 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "Z")
    private boolean field481 = false;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
    private int field482 = -1;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "[LOCPHNIUN;")
    private class40[] field483 = new class40[2];

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "Z")
    private boolean field487 = false;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
    private int[] field488 = new int[5];

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "Z")
    private boolean field498 = false;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "[LTPIBHECB;")
    private class56[] field500 = new class56[100];

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private int field501 = 859;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
    private boolean field505 = false;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field507 = -571;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
    private volatile boolean field511 = false;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
    private volatile boolean field512 = false;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "B")
    private byte field513 = 73;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field514 = 7759444;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int field516 = 31203;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
    private int field518 = 2;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private int field522 = -1;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
    private int[] field524 = new int[33];

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "[LTPIBHECB;")
    private class56[] field526 = new class56[32];

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
    private int[] field529 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
    private int[] field530 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
    private boolean field532 = false;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
    private boolean field548 = true;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "B")
    private byte field549 = 2;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
    private boolean field550 = false;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
    private final int field551 = 100;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
    private int[] field552 = new int[100];

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "B")
    private byte field553 = 0;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "[Z")
    private boolean[] field555 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "Z")
    private boolean field558 = false;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "[LTPIBHECB;")
    private class56[] field559 = new class56[8];

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "[I")
    private int[] field560 = new int[33];

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "[[I")
    private int[][] field566 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
    private int[] field567 = new int[5];

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "LWCVCMGLX;")
    private class62 field578 = new class62(-388);

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "Z")
    private boolean field580 = false;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field581 = new CRC32();

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
    private int field587 = -685;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field588 = -1;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "Z")
    private boolean field593 = false;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field594 = 47958;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
    private int field601 = 424;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
    private int field602 = -34531;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
    private int field603 = -39880;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
    private int field604 = -1;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field606 = 8496;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "[LJJRYTWDH;")
    public class31[] field607 = new class31[5];

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field608 = -236;

    @OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
    private int field614 = -1;

    @OriginalMember(owner = "client!client", name = "sk", descriptor = "Z")
    private boolean field620 = true;

    @OriginalMember(owner = "client!client", name = "tk", descriptor = "Ljava/lang/String;")
    private String field621 = "";

    @OriginalMember(owner = "client!client", name = "uk", descriptor = "Ljava/lang/String;")
    private String field622 = "";

    @OriginalMember(owner = "client!client", name = "vk", descriptor = "[[[LWCVCMGLX;")
    private class62[][][] field623 = new class62[4][104][104];

    @OriginalMember(owner = "client!client", name = "wk", descriptor = "I")
    private int field624 = -1;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "[[I")
    public static final int[][] field203 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private static int field272 = 18485;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private static int field290 = 10;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "Z")
    private static boolean field292 = true;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field367 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "B")
    private static byte field372 = 2;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "[I")
    private static int[] field373 = new int[99];

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private static int field386;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
    private static int field390;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "Ljava/lang/String;")
    private static String field391;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
    public static int[] field408;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
    private static int field416;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private static int field426;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
    public static final int[] field565;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field572;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    private static int field137;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private static int field157;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
    private static int field197;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private static int field216;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private static int field224;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private static int field285;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private static int field296;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "I")
    private static int field298;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
    private static int field319;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private static int field322;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    private static int field344;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
    private static int field352;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private static int field378;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private static int field401;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private static int field469;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private static int field506;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
    private static int field527;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
    private static int field531;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!client", name = "xk", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "J")
    private long field129;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "J")
    private long field133;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "J")
    private long field443;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "J")
    public long field465;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "J")
    private long field523;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "LCWXRTTYV;")
    private class11 field220;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "LCWXRTTYV;")
    private class11 field221;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "LCWXRTTYV;")
    private class11 field222;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "LCWXRTTYV;")
    private class11 field223;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "LIUZTBIWV;")
    private class28 field249;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "LIUZTBIWV;")
    private class28 field250;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "LIUZTBIWV;")
    private class28 field251;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "LIUZTBIWV;")
    private class28 field301;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "LIUZTBIWV;")
    private class28 field302;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "LIUZTBIWV;")
    private class28 field303;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "LIUZTBIWV;")
    private class28 field304;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "LIUZTBIWV;")
    private class28 field305;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "LIUZTBIWV;")
    private class28 field306;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "LIUZTBIWV;")
    private class28 field307;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "LIUZTBIWV;")
    private class28 field308;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "LIUZTBIWV;")
    private class28 field309;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "LIUZTBIWV;")
    private class28 field417;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "LIUZTBIWV;")
    private class28 field418;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "LIUZTBIWV;")
    private class28 field419;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "LIUZTBIWV;")
    private class28 field420;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "LIUZTBIWV;")
    private class28 field421;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "LIUZTBIWV;")
    private class28 field422;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "LIUZTBIWV;")
    private class28 field423;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "LIUZTBIWV;")
    private class28 field424;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "LIUZTBIWV;")
    private class28 field425;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "LIUZTBIWV;")
    private class28 field533;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "LIUZTBIWV;")
    private class28 field534;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "LIUZTBIWV;")
    private class28 field535;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "LIUZTBIWV;")
    private class28 field536;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "LMDBQGDOL;")
    public static class36 field394;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "LOCPHNIUN;")
    private class40 field138;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "LOCPHNIUN;")
    private class40 field139;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "LOCPHNIUN;")
    private class40 field200;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "LOCPHNIUN;")
    private class40 field201;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "LOCPHNIUN;")
    private class40 field202;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "LOCPHNIUN;")
    private class40 field210;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "LOCPHNIUN;")
    private class40 field211;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "LOCPHNIUN;")
    private class40 field212;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "LOCPHNIUN;")
    private class40 field213;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "LOCPHNIUN;")
    private class40 field214;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "LOCPHNIUN;")
    private class40 field258;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "LOCPHNIUN;")
    private class40 field259;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "LOCPHNIUN;")
    private class40 field361;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "LOCPHNIUN;")
    private class40 field362;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "LOCPHNIUN;")
    private class40 field363;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "LOCPHNIUN;")
    private class40 field434;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "LOCPHNIUN;")
    private class40 field435;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "LOCPHNIUN;")
    private class40 field436;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "LOCPHNIUN;")
    private class40 field437;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "LOCPHNIUN;")
    private class40 field438;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "LRYDUASDW;")
    private class49 field470;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "LTCDQXHKB;")
    private class53 field591;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "LTPIBHECB;")
    private class56 field161;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "LTPIBHECB;")
    private class56 field174;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "LTPIBHECB;")
    private class56 field294;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "LTPIBHECB;")
    private class56 field295;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "LTPIBHECB;")
    private class56 field318;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "LTPIBHECB;")
    private class56 field334;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "LTPIBHECB;")
    private class56 field335;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "LTPIBHECB;")
    private class56 field508;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "LTPIBHECB;")
    private class56 field609;

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "LTPIBHECB;")
    private class56 field610;

    @OriginalMember(owner = "client!client", name = "nk", descriptor = "LTPIBHECB;")
    private class56 field615;

    @OriginalMember(owner = "client!client", name = "ok", descriptor = "LTPIBHECB;")
    private class56 field616;

    @OriginalMember(owner = "client!client", name = "pk", descriptor = "LTPIBHECB;")
    private class56 field617;

    @OriginalMember(owner = "client!client", name = "qk", descriptor = "LTPIBHECB;")
    private class56 field618;

    @OriginalMember(owner = "client!client", name = "rk", descriptor = "LTPIBHECB;")
    private class56 field619;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "LUCDUMMGN;")
    private class58 field612;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "LUUIGNTAD;")
    private class59 field229;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "LUUQNASSN;")
    private class60 field351;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "LYIKMTKBL;")
    public class69 field451;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
    private String field140;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "Ljava/lang/String;")
    public String field315;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "Ljava/lang/String;")
    public String field350;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "Ljava/lang/String;")
    private String field613;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Ljava/net/Socket;")
    private Socket field141;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
    public static boolean field159;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
    private static boolean field205;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "Z")
    private static boolean field293;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "Z")
    public static boolean field415;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "Z")
    private static boolean field545;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
    private int[] field261;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
    private int[] field262;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "[I")
    private int[] field356;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "[I")
    private int[] field357;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
    private int[] field489;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
    private int[] field490;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
    private int[] field491;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "[I")
    private int[] field492;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "[I")
    private int[] field494;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
    private int[] field495;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
    private int[] field496;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
    private int[] field497;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
    private int[] field519;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
    private int[] field520;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
    private int[] field521;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "[LOCPHNIUN;")
    private class40[] field525;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[[B")
    private byte[][] field151;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "[[B")
    private byte[][] field323;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "[[[B")
    private byte[][][] field198;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "[[[I")
    private int[][][] field499;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public final void method35(int arg0, int arg1) {
        if (arg0 != 47889) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)Z")
    public final boolean method36(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = arg1 >> 14 & 32767;
        int var6 = this.field591.method478(this.field510, arg0, arg3, arg1);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method92(field394.field1293[0], arg0, 2, 0, -20821, 0, arg3, var8, 0, field394.field1292[0], var7 + 1, false);
            } else {
                class70 var9 = class70.method596(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1735;
                    var11 = var9.field1724;
                } else {
                    var10 = var9.field1724;
                    var11 = var9.field1735;
                }
                int var12 = var9.field1704;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method92(field394.field1293[0], arg0, 2, var11, -20821, var10, arg3, 0, var12, field394.field1292[0], 0, false);
            }
            this.field568 = super.field1134;
            this.field132 &= arg2;
            this.field569 = super.field1135;
            this.field571 = 2;
            this.field570 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public final String method37(boolean arg0) {
        if (arg0) {
            field545 = true;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1122 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method38(int arg0) {
        if (this.field144 == 2) {
            this.method131(190, (this.field244 - this.field455 << 7) + this.field247, (this.field245 - this.field456 << 7) + this.field248, this.field246 * 2);
            if (arg0 != 0) {
                this.field596 = -1;
            }
            if (this.field123 > -1 && field471 % 20 < 10) {
                this.field193[0].method507(this.field123 - 12, this.field549, this.field124 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
    public final void method39(byte arg0, int arg1) {
        int var3 = class5.field28[arg1].field36;
        if (var3 != 0) {
            int var4 = this.field269[arg1];
            if (arg0 != -49) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class39.method411(0.9D, -802);
                }
                if (var4 == 2) {
                    class39.method411(0.8D, -802);
                }
                if (var4 == 3) {
                    class39.method411(0.7D, -802);
                }
                if (var4 == 4) {
                    class39.method411(0.6D, -802);
                }
                class34.field1021.method301();
                this.field593 = true;
            }
            if (var3 == 3) {
                boolean var6 = this.field264;
                if (var4 == 0) {
                    this.method162(0, this.field264, (byte) 8);
                    this.field264 = true;
                }
                if (var4 == 1) {
                    this.method162(-400, this.field264, (byte) 8);
                    this.field264 = true;
                }
                if (var4 == 2) {
                    this.method162(-800, this.field264, (byte) 8);
                    this.field264 = true;
                }
                if (var4 == 3) {
                    this.method162(-1200, this.field264, (byte) 8);
                    this.field264 = true;
                }
                if (var4 == 4) {
                    this.field264 = false;
                }
                if (this.field264 != var6 && !field293) {
                    if (this.field264) {
                        this.field547 = this.field370;
                        this.field548 = true;
                        this.field612.method540(2, this.field547);
                    } else {
                        this.method159((byte) -108);
                    }
                    this.field433 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field413 = true;
                    this.method35(47889, 0);
                }
                if (var4 == 1) {
                    this.field413 = true;
                    this.method35(47889, -400);
                }
                if (var4 == 2) {
                    this.field413 = true;
                    this.method35(47889, -800);
                }
                if (var4 == 3) {
                    this.field413 = true;
                    this.method35(47889, -1200);
                }
                if (var4 == 4) {
                    this.field413 = false;
                }
            }
            if (var3 == 5) {
                this.field332 = var4;
            }
            if (var3 == 6) {
                this.field460 = var4;
            }
            if (var3 == 8) {
                this.field355 = var4;
                this.field550 = true;
            }
            if (var3 == 9) {
                this.field546 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method40(int arg0) {
        if (arg0 != 44331) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field293 && this.field333 == 2 && class27.field896 != this.field510) {
            this.method57((String) null, 1912, "Loading - please wait.");
            this.field333 = 1;
            this.field523 = System.currentTimeMillis();
        }
        if (this.field333 == 1) {
            int var3 = this.method41(this.field354);
            if (var3 != 0 && System.currentTimeMillis() - this.field523 > 360000L) {
                signlink.reporterror(this.field411 + " glcfb " + this.field129 + "," + var3 + "," + field293 + "," + this.field607[0] + "," + this.field612.method530() + "," + this.field510 + "," + this.field384 + "," + this.field385);
                this.field523 = System.currentTimeMillis();
            }
        }
        if (this.field333 == 2 && this.field510 != this.field475) {
            this.field475 = this.field510;
            this.method112((byte) -123, this.field510);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)I")
    public final int method41(boolean arg0) {
        for (int var2 = 0; var2 < this.field151.length; ++var2) {
            if (this.field151[var2] == null && this.field520[var2] != -1) {
                return -1;
            }
            if (this.field323[var2] == null && this.field521[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field151.length; ++var4) {
            byte[] var5 = this.field323[var4];
            if (var5 != null) {
                int var6 = (this.field519[var4] >> 8) * 64 - this.field455;
                int var7 = (this.field519[var4] & 255) * 64 - this.field456;
                if (this.field498) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class27.method310(false, var7, var5, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field339) {
            return -4;
        } else {
            this.field333 = 2;
            if (arg0) {
                this.field354 = !this.field354;
            }
            class27.field896 = this.field510;
            this.method58(0);
            this.field336.method183(55, this.field230);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCMGGUSPR;BI)V")
    private final void method42(class10 arg0, byte arg1, int arg2) {
        int var4 = arg0.method205(8, -359);
        if (arg1 != -75) {
            this.field230 = this.field470.method437();
        }
        if (var4 < this.field236) {
            for (int var5 = var4; var5 < this.field236; ++var5) {
                this.field276[this.field275++] = this.field237[var5];
            }
        }
        if (var4 > this.field236) {
            signlink.reporterror(this.field411 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field236 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field237[var6];
                class36 var8 = this.field235[var7];
                int var9 = arg0.method205(1, -359);
                if (var9 == 0) {
                    this.field237[this.field236++] = var7;
                    var8.field1310 = field471;
                } else {
                    int var10 = arg0.method205(2, -359);
                    if (var10 == 0) {
                        this.field237[this.field236++] = var7;
                        var8.field1310 = field471;
                        this.field239[this.field238++] = var7;
                    } else if (var10 == 1) {
                        this.field237[this.field236++] = var7;
                        var8.field1310 = field471;
                        int var11 = arg0.method205(3, -359);
                        var8.method440(var11, false, 796);
                        int var12 = arg0.method205(1, -359);
                        if (var12 == 1) {
                            this.field239[this.field238++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field237[this.field236++] = var7;
                        var8.field1310 = field471;
                        int var13 = arg0.method205(3, -359);
                        var8.method440(var13, true, 796);
                        int var14 = arg0.method205(3, -359);
                        var8.method440(var14, true, 796);
                        int var15 = arg0.method205(1, -359);
                        if (var15 == 1) {
                            this.field239[this.field238++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field276[this.field275++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method43(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        } else if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method44(byte arg0) {
        this.field534.method327((byte) 4);
        if (this.field181 == 2) {
            byte[] var2 = this.field201.field1171;
            int[] var3 = class6.field48;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field508.method511(this.field404, 33, this.field560, 256, this.field524, 25, 33, 0, 0, 25, 0);
            this.field535.method327((byte) 4);
            class39.field1156 = this.field496;
        } else {
            int var6 = this.field404 + this.field326 & 2047;
            int var7 = field394.field1305 / 32 + 48;
            int var8 = 464 - field394.field1306 / 32;
            this.field318.method511(var6, 146, this.field185, this.field467 + 256, this.field310, var8, 151, 5, 25, var7, 0);
            this.field508.method511(this.field404, 33, this.field560, 256, this.field524, 25, 33, 0, 0, 25, 0);
            for (int var9 = 0; var9 < this.field286; ++var9) {
                int var39 = this.field287[var9] * 4 + 2 - field394.field1305 / 32;
                int var40 = this.field288[var9] * 4 + 2 - field394.field1306 / 32;
                this.method157(var39, var40, this.field409[var9], (byte) 3);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class62 var36 = this.field623[this.field510][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field394.field1305 / 32;
                        int var38 = var35 * 4 + 2 - field394.field1306 / 32;
                        this.method157(var37, var38, this.field615, (byte) 3);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field154; ++var11) {
                class25 var31 = this.field153[this.field155[var11]];
                if (var31 != null && var31.method302((byte) 38)) {
                    class57 var32 = var31.field887;
                    if (var32.field1447 != null) {
                        var32 = var32.method515((byte) 73);
                    }
                    if (var32 != null && var32.field1477 && var32.field1459) {
                        int var33 = var31.field1305 / 32 - field394.field1305 / 32;
                        int var34 = var31.field1306 / 32 - field394.field1306 / 32;
                        this.method157(var33, var34, this.field616, (byte) 3);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field236; ++var12) {
                class36 var23 = this.field235[this.field237[var12]];
                if (var23 != null && var23.method302((byte) 38)) {
                    int var24 = var23.field1305 / 32 - field394.field1305 / 32;
                    int var25 = var23.field1306 / 32 - field394.field1306 / 32;
                    boolean var26 = false;
                    long var27 = class71.method597(var23.field1081);
                    for (int var29 = 0; var29 < this.field589; ++var29) {
                        if (this.field440[var29] == var27 && this.field442[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field394.field1065 != 0 && var23.field1065 != 0 && field394.field1065 == var23.field1065) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method157(var24, var25, this.field618, (byte) 3);
                    } else if (var30) {
                        this.method157(var24, var25, this.field619, (byte) 3);
                    } else {
                        this.method157(var24, var25, this.field617, (byte) 3);
                    }
                }
            }
            if (arg0 == -32) {
                if (this.field144 != 0 && field471 % 20 < 10) {
                    if (this.field144 == 1 && this.field265 >= 0 && this.field265 < this.field153.length) {
                        class25 var13 = this.field153[this.field265];
                        if (var13 != null) {
                            int var14 = var13.field1305 / 32 - field394.field1305 / 32;
                            int var15 = var13.field1306 / 32 - field394.field1306 / 32;
                            this.method86(var15, this.field295, -42058, var14);
                        }
                    }
                    if (this.field144 == 2) {
                        int var16 = (this.field244 - this.field455) * 4 + 2 - field394.field1305 / 32;
                        int var17 = (this.field245 - this.field456) * 4 + 2 - field394.field1306 / 32;
                        this.method86(var17, this.field295, -42058, var16);
                    }
                    if (this.field144 == 10 && this.field146 >= 0 && this.field146 < this.field235.length) {
                        class36 var18 = this.field235[this.field146];
                        if (var18 != null) {
                            int var19 = var18.field1305 / 32 - field394.field1305 / 32;
                            int var20 = var18.field1306 / 32 - field394.field1306 / 32;
                            this.method86(var20, this.field295, -42058, var19);
                        }
                    }
                }
                if (this.field316 != 0) {
                    int var21 = this.field316 * 4 + 2 - field394.field1305 / 32;
                    int var22 = this.field317 * 4 + 2 - field394.field1306 / 32;
                    this.method157(var21, var22, this.field294, (byte) 3);
                }
                class6.method22(3, -16614, 97, 3, 16777215, 78);
                this.field535.method327((byte) 4);
                class39.field1156 = this.field496;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method45(boolean arg0) {
        if (arg0) {
            this.field501 = 302;
        }
        this.field593 = true;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field290 = Integer.parseInt(this.getParameter("nodeid"));
        field291 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method164(-14359);
        } else {
            method179((byte) 0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field292 = false;
        } else {
            field292 = true;
        }
        this.method398(-636, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method46(int arg0) {
        class23 var2 = (class23) this.field450.method567();
        if (arg0 > 0) {
            while (var2 != null) {
                if (var2.field869 == -1) {
                    var2.field868 = 0;
                    this.method77(-39880, var2);
                } else {
                    var2.method1();
                }
                var2 = (class23) this.field450.method569(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method47(int arg0) {
        if (arg0 != 39457) {
            this.field331 = !this.field331;
        }
        if (this.field333 == 2) {
            for (class23 var2 = (class23) this.field450.method567(); var2 != null; var2 = (class23) this.field450.method569(false)) {
                if (var2.field869 > 0) {
                    --var2.field869;
                }
                if (var2.field869 == 0) {
                    if (var2.field870 < 0 || class27.method324(true, var2.field872, var2.field870)) {
                        this.method83(var2.field870, 1, var2.field871, var2.field872, var2.field877, var2.field878, var2.field879, var2.field876);
                        var2.method1();
                    }
                } else {
                    if (var2.field868 > 0) {
                        --var2.field868;
                    }
                    if (var2.field868 == 0 && var2.field878 >= 1 && var2.field879 >= 1 && var2.field878 <= 102 && var2.field879 <= 102 && (var2.field873 < 0 || class27.method324(true, var2.field875, var2.field873))) {
                        this.method83(var2.field873, 1, var2.field874, var2.field875, var2.field877, var2.field878, var2.field879, var2.field876);
                        var2.field868 = -1;
                        if (var2.field873 == var2.field870 && var2.field870 == -1) {
                            var2.method1();
                        } else if (var2.field873 == var2.field870 && var2.field874 == var2.field871 && var2.field875 == var2.field872) {
                            var2.method1();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLCMGGUSPR;)V")
    private final void method48(int arg0, byte arg1, class10 arg2) {
        if (arg1 != 0) {
            this.field342 = this.field470.method437();
        }
        arg2.method204((byte) -36);
        int var4 = arg2.method205(1, -359);
        if (var4 != 0) {
            int var5 = arg2.method205(2, -359);
            if (var5 == 0) {
                this.field239[this.field238++] = this.field234;
            } else if (var5 == 1) {
                int var6 = arg2.method205(3, -359);
                field394.method440(var6, false, 796);
                int var7 = arg2.method205(1, -359);
                if (var7 == 1) {
                    this.field239[this.field238++] = this.field234;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method205(3, -359);
                field394.method440(var8, true, 796);
                int var9 = arg2.method205(3, -359);
                field394.method440(var9, true, 796);
                int var10 = arg2.method205(1, -359);
                if (var10 == 1) {
                    this.field239[this.field238++] = this.field234;
                }
            } else if (var5 == 3) {
                this.field510 = arg2.method205(2, -359);
                int var11 = arg2.method205(1, -359);
                if (var11 == 1) {
                    this.field239[this.field238++] = this.field234;
                }
                int var12 = arg2.method205(7, -359);
                int var13 = arg2.method205(1, -359);
                int var14 = arg2.method205(7, -359);
                field394.method442(false, var13 == 1, var12, var14);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILWJQTPVDG;I)I")
    public final int method49(int arg0, class65 arg1, int arg2) {
        if (this.field427 != arg2) {
            return this.field342;
        } else if (arg1.field1639 != null && arg0 < arg1.field1639.length) {
            try {
                int[] var4 = arg1.field1639[arg0];
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
                        var9 = this.field284[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field474[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field195[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class65 var11 = class65.method577(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class34.field1006 && (!class34.method346(var12).field1033 || field292)) {
                            for (int var13 = 0; var13 < var11.field1617.length; ++var13) {
                                if (var12 + 1 == var11.field1617[var13]) {
                                    var9 += var11.field1623[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field269[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field373[this.field474[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field269[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field394.field1071;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class14.field685; ++var14) {
                            if (class14.field687[var14]) {
                                var9 += this.field474[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class65 var15 = class65.method577(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class34.field1006 && (!class34.method346(var16).field1033 || field292)) {
                            for (int var17 = 0; var17 < var15.field1617.length; ++var17) {
                                if (var15.field1617[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field135;
                    }
                    if (var8 == 12) {
                        var9 = this.field387;
                    }
                    if (var8 == 13) {
                        int var18 = this.field269[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class47 var21 = class47.field1241[var20];
                        int var22 = var21.field1243;
                        int var23 = var21.field1244;
                        int var24 = var21.field1245;
                        int var25 = field408[var24 - var23];
                        var9 = this.field269[var22] >> var23 & var25;
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
                        var9 = (field394.field1305 >> 7) + this.field455;
                    }
                    if (var8 == 19) {
                        var9 = (field394.field1306 >> 7) + this.field456;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LWJQTPVDG;Z)Z")
    public final boolean method50(class65 arg0, boolean arg1) {
        if (arg1) {
            this.field342 = -377;
        }
        if (arg0.field1582 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1582.length; ++var3) {
                int var4 = this.method49(var3, arg0, 5200);
                int var5 = arg0.field1593[var3];
                if (arg0.field1582[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1582[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1582[var3] == 4) {
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

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method51(int arg0) {
        ++this.field148;
        this.method156(true, (byte) 6);
        this.method100(true, -1170);
        this.method156(false, (byte) 6);
        this.method100(false, -1170);
        this.method121((byte) 67);
        this.method54(false);
        if (!this.field283) {
            int var2 = this.field403;
            if (this.field127 / 256 > var2) {
                var2 = this.field127 / 256;
            }
            if (this.field555[4] && this.field343[4] + 128 > var2) {
                var2 = this.field343[4] + 128;
            }
            int var3 = this.field404 + this.field177 & 2047;
            this.method62(this.field502, var2 * 3 + 600, var2, this.method60(field394.field1306, 0, this.field510, field394.field1305) - 50, this.field503, (byte) 101, var3);
        }
        int var4;
        if (!this.field283) {
            var4 = this.method166((byte) 2);
        } else {
            var4 = this.method167(0);
        }
        int var5 = this.field188;
        int var6 = this.field189;
        int var7 = this.field190;
        int var8 = this.field191;
        int var9 = this.field192;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field555[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field257[var10] * 2 + 1) - (double) this.field257[var10] + Math.sin((double) this.field274[var10] / 100.0D * (double) this.field488[var10]) * (double) this.field343[var10]);
                if (var10 == 0) {
                    this.field188 += var12;
                }
                if (var10 == 1) {
                    this.field189 += var12;
                }
                if (var10 == 2) {
                    this.field190 += var12;
                }
                if (var10 == 3) {
                    this.field192 = this.field192 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field191 += var12;
                    if (this.field191 < 128) {
                        this.field191 = 128;
                    }
                    if (this.field191 > 383) {
                        this.field191 = 383;
                    }
                }
            }
        }
        int var11 = class39.field1165;
        class16.field772 = true;
        class16.field775 = 0;
        class16.field773 = super.field1127 - 4;
        class16.field774 = super.field1128 - 4;
        class6.method20(12847);
        this.field591.method487(true, this.field191, this.field188, this.field190, var4, this.field189, this.field192);
        if (arg0 == 20489) {
            this.field591.method462(993);
            this.method175(false);
            this.method38(0);
            this.method95((byte) -105, var11);
            this.method120((byte) 4);
            this.field535.method328(4, 4, super.field1119, 0);
            this.field188 = var5;
            this.field189 = var6;
            this.field190 = var7;
            this.field191 = var8;
            this.field192 = var9;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)V")
    public final void method52(byte arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field454[var5] != null) {
                int var6 = this.field452[var5];
                int var7 = 70 - var4 * 14 + this.field175 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field453[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field289 == 0 || this.field289 == 1 && this.method118(var8, 0))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field394.field1081)) {
                        if (this.field600 >= 1) {
                            this.field122[this.field407] = "Report abuse @whi@" + var8;
                            this.field279[this.field407] = 641;
                            ++this.field407;
                        }
                        this.field122[this.field407] = "Add ignore @whi@" + var8;
                        this.field279[this.field407] = 895;
                        ++this.field407;
                        this.field122[this.field407] = "Add friend @whi@" + var8;
                        this.field279[this.field407] = 166;
                        ++this.field407;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field355 == 0 && (var6 == 7 || this.field557 == 0 || this.field557 == 1 && this.method118(var8, 0))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field600 >= 1) {
                            this.field122[this.field407] = "Report abuse @whi@" + var8;
                            this.field279[this.field407] = 641;
                            ++this.field407;
                        }
                        this.field122[this.field407] = "Add ignore @whi@" + var8;
                        this.field279[this.field407] = 895;
                        ++this.field407;
                        this.field122[this.field407] = "Add friend @whi@" + var8;
                        this.field279[this.field407] = 166;
                        ++this.field407;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field209 == 0 || this.field209 == 1 && this.method118(var8, 0))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field122[this.field407] = "Accept trade @whi@" + var8;
                        this.field279[this.field407] = 57;
                        ++this.field407;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field355 == 0 && this.field557 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field209 == 0 || this.field209 == 1 && this.method118(var8, 0))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field122[this.field407] = "Accept challenge @whi@" + var8;
                        this.field279[this.field407] = 894;
                        ++this.field407;
                    }
                    ++var4;
                }
            }
        }
        if (arg0 != 111) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMDBQGDOL;IBI)V")
    public final void method53(int arg0, class36 arg1, int arg2, byte arg3, int arg4) {
        if (field394 != arg1) {
            if (this.field407 < 400) {
                String var6;
                if (arg1.field1068 == 0) {
                    var6 = arg1.field1081 + method172((byte) 2, arg1.field1071, field394.field1071) + " (level-" + arg1.field1071 + ")";
                } else {
                    var6 = arg1.field1081 + " (skill-" + arg1.field1068 + ")";
                }
                if (this.field311 == 1) {
                    this.field122[this.field407] = "Use " + this.field315 + " with @whi@" + var6;
                    this.field279[this.field407] = 508;
                    this.field280[this.field407] = arg2;
                    this.field277[this.field407] = arg4;
                    this.field278[this.field407] = arg0;
                    ++this.field407;
                } else if (this.field347 == 1) {
                    if ((this.field349 & 8) == 8) {
                        this.field122[this.field407] = this.field350 + " @whi@" + var6;
                        this.field279[this.field407] = 306;
                        this.field280[this.field407] = arg2;
                        this.field277[this.field407] = arg4;
                        this.field278[this.field407] = arg0;
                        ++this.field407;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field478[var7] != null) {
                            this.field122[this.field407] = this.field478[var7] + " @whi@" + var6;
                            short var10 = 0;
                            if (this.field478[var7].equalsIgnoreCase("attack")) {
                                if (arg1.field1071 > field394.field1071) {
                                    var10 = 2000;
                                }
                                if (field394.field1065 != 0 && arg1.field1065 != 0) {
                                    if (field394.field1065 == arg1.field1065) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field479[var7]) {
                                var10 = 2000;
                            }
                            if (var7 == 0) {
                                this.field279[this.field407] = var10 + 870;
                            }
                            if (var7 == 1) {
                                this.field279[this.field407] = var10 + 992;
                            }
                            if (var7 == 2) {
                                this.field279[this.field407] = var10 + 913;
                            }
                            if (var7 == 3) {
                                this.field279[this.field407] = var10 + 155;
                            }
                            if (var7 == 4) {
                                this.field279[this.field407] = var10 + 946;
                            }
                            this.field280[this.field407] = arg2;
                            this.field277[this.field407] = arg4;
                            this.field278[this.field407] = arg0;
                            ++this.field407;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field407; ++var8) {
                    if (this.field279[var8] == 158) {
                        this.field122[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg3 == 1) {
                    boolean var9 = false;
                } else {
                    this.field396 = this.field470.method437();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method54(boolean arg0) {
        class68 var2 = (class68) this.field232.method567();
        if (arg0) {
            this.field596 = -1;
        }
        while (var2 != null) {
            if (this.field510 == var2.field1684 && !var2.field1689) {
                if (field471 >= var2.field1683) {
                    var2.method585(this.field263, 0);
                    if (var2.field1689) {
                        var2.method1();
                    } else {
                        this.field591.method459(9, var2, var2.field1684, var2.field1686, false, var2.field1685, 0, -1, 60, var2.field1687);
                    }
                }
            } else {
                var2.method1();
            }
            var2 = (class68) this.field232.method569(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method55(int arg0) {
        class70.field1712.method301();
        class70.field1718.method301();
        class57.field1466.method301();
        while (arg0 >= 0) {
        }
        class34.field987.method301();
        class34.field1021.method301();
        class36.field1070.method301();
        class29.field944.method301();
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method56(int arg0) {
        try {
            if (this.field351 != null) {
                this.field351.method546();
            }
        } catch (Exception var3) {
        }
        this.field351 = null;
        this.field132 = false;
        this.field142 = 0;
        this.field411 = "";
        this.field412 = "";
        this.method55(-417);
        this.field591.method448(8);
        if (arg0 == 24238) {
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field328[var2].method552();
            }
            System.gc();
            this.method159((byte) -108);
            this.field370 = -1;
            this.field547 = -1;
            this.field433 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method57(String arg0, int arg1, String arg2) {
        if (arg1 != 1912) {
            this.field623 = null;
        }
        if (this.field535 != null) {
            this.field535.method327((byte) 4);
            class39.field1156 = this.field496;
            int var4 = 151;
            if (arg0 != null) {
                var4 -= 7;
            }
            this.field221.method232(0, 257, false, var4, arg2);
            this.field221.method232(16777215, 256, false, var4 - 1, arg2);
            var4 += 15;
            if (arg0 != null) {
                this.field221.method232(0, 257, false, var4, arg0);
                this.field221.method232(16777215, 256, false, var4 - 1, arg0);
            }
            this.field535.method328(4, 4, super.field1119, 0);
        } else if (super.field1120 != null) {
            super.field1120.method327((byte) 4);
            class39.field1156 = this.field497;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class6.method22(var6, -16614, 383 - var6 / 2, var7, 0, var5 - 5 - var7 / 2);
            class6.method23(var7, var6, 16777215, 383 - var6 / 2, this.field501, var5 - 5 - var7 / 2);
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field221.method232(0, 383, false, var5, arg2);
            this.field221.method232(16777215, 382, false, var5 - 1, arg2);
            var5 += 15;
            if (arg0 != null) {
                this.field221.method232(0, 383, false, var5, arg0);
                this.field221.method232(16777215, 382, false, var5 - 1, arg0);
            }
            super.field1120.method328(0, 0, super.field1119, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method58(int arg0) {
        if (arg0 != 0) {
            this.field158 = 107;
        }
        try {
            this.field475 = -1;
            this.field232.method571();
            this.field578.method571();
            class39.method405(true);
            this.method55(-417);
            this.field591.method448(8);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field328[var2].method552();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field198[var3][var4][var5] = 0;
                    }
                }
            }
            class27 var6 = new class27(104, this.field198, this.field499, 948, 104);
            int var7 = this.field151.length;
            this.field336.method183(21, this.field230);
            if (!this.field498) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field519[var8] >> 8) * 64 - this.field455;
                    int var10 = (this.field519[var8] & 255) * 64 - this.field456;
                    byte[] var11 = this.field151[var8];
                    if (var11 != null) {
                        var6.method320(this.field328, var9, var10, (this.field384 - 6) * 8, var11, 0, (this.field385 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field519[var12] >> 8) * 64 - this.field455;
                    int var14 = (this.field519[var12] & 255) * 64 - this.field456;
                    byte[] var15 = this.field151[var12];
                    if (var15 == null && this.field385 < 800) {
                        var6.method321(64, 64, var13, var14, false);
                    }
                }
                this.field336.method183(21, this.field230);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field323[var16];
                    if (var17 != null) {
                        int var18 = (this.field519[var16] >> 8) * 64 - this.field455;
                        int var19 = (this.field519[var16] & 255) * 64 - this.field456;
                        var6.method316(var18, var19, (byte) 3, this.field591, this.field328, var17);
                    }
                }
            }
            if (this.field498) {
                int var20 = 0;
                label254: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field270[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method321(8, 8, var31 * 8, var32 * 8, false);
                                }
                            }
                        }
                        this.field336.method183(21, this.field230);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label254;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field270[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field519.length; ++var43) {
                                            if (this.field519[var43] == var42 && this.field323[var43] != null) {
                                                var6.method314(var38, var34, (var40 & 7) * 8, var36 * 8, this.field591, (var41 & 7) * 8, -316, this.field328, var35 * 8, this.field323[var43], var39);
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
                            int var24 = this.field270[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field519.length; ++var30) {
                                    if (this.field519[var30] == var29 && this.field151[var30] != null) {
                                        var6.method319(var21 * 8, this.field328, (var28 & 7) * 8, var26, this.field151[var30], (var27 & 7) * 8, 32496, var20, var25, var22 * 8);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method322(var22 * 8, 9, var20, var21 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field336.method183(21, this.field230);
            var6.method309(this.field328, this.field591, 9);
            if (this.field535 != null) {
                this.field535.method327((byte) 4);
                class39.field1156 = this.field496;
            }
            this.field336.method183(21, this.field230);
            int var44 = class27.field911;
            if (var44 > this.field510) {
                var44 = this.field510;
            }
            if (var44 < this.field510 - 1) {
                int var45 = this.field510 - 1;
            }
            if (field293) {
                this.field591.method449(-13561, class27.field911);
            } else {
                this.field591.method449(-13561, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method148(var46, var47);
                }
            }
            this.method46(936);
        } catch (Exception var60) {
        }
        class70.field1712.method301();
        if (super.field1122 != null) {
            this.field336.method183(0, this.field230);
            this.field336.method188(1057001181);
        }
        if (field293 && signlink.cache_dat != null) {
            int var49 = this.field612.method542(0, -20698);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field612.method535(3, var50);
                if ((var51 & 121) == 0) {
                    class16.method259(var50, -703);
                }
            }
        }
        System.gc();
        class39.method406(20, -854);
        this.field612.method523(this.field342);
        int var52 = (this.field384 - 6) / 8 - 1;
        int var53 = (this.field384 + 6) / 8 + 1;
        int var54 = (this.field385 - 6) / 8 - 1;
        int var55 = (this.field385 + 6) / 8 + 1;
        if (this.field432) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field612.method538(-679, var56, 0, var57);
                    if (var58 != -1) {
                        this.field612.method541(var58, 0, 3);
                    }
                    int var59 = this.field612.method538(-679, var56, 1, var57);
                    if (var59 != -1) {
                        this.field612.method541(var59, 0, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method59(long arg0, int arg1) {
        if (arg1 < 0) {
            if (arg0 != 0L) {
                if (this.field611 >= 100) {
                    this.method114("", "Your ignore list is full. Max of 100 hit", 0, 0);
                } else {
                    String var4 = class71.method601(class71.method598(arg0, -491), 8384);
                    for (int var5 = 0; var5 < this.field611; ++var5) {
                        if (this.field473[var5] == arg0) {
                            this.method114("", var4 + " is already on your ignore list", 0, 0);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field589; ++var6) {
                        if (this.field440[var6] == arg0) {
                            this.method114("", "Please remove " + var4 + " from your friend list first", 0, 0);
                            return;
                        }
                    }
                    this.field473[this.field611++] = arg0;
                    this.field472 = true;
                    this.field336.method183(43, this.field230);
                    this.field336.method190(5, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 359);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field290 = Integer.parseInt(arg0[0]);
                field291 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method164(-14359);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method179((byte) 0);
                }
                if (arg0[3].equals("free")) {
                    field292 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field292 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method397(0, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method60(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg0 >> 7;
        if (arg1 != 0) {
            this.method176();
        }
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg2 < 3 && (this.field198[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field499[var7][var5][var6] + this.field499[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field499[var7][var5][var6 + 1] + this.field499[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        short var2 = 256;
        if (this.field365 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field365 > 768) {
                    this.field489[var3] = this.method106(1024 - this.field365, false, this.field491[var3], this.field490[var3]);
                } else if (this.field365 > 256) {
                    this.field489[var3] = this.field491[var3];
                } else {
                    this.field489[var3] = this.method106(256 - this.field365, false, this.field490[var3], this.field491[var3]);
                }
            }
        } else if (this.field366 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field366 > 768) {
                    this.field489[var4] = this.method106(1024 - this.field366, false, this.field492[var4], this.field490[var4]);
                } else if (this.field366 > 256) {
                    this.field489[var4] = this.field492[var4];
                } else {
                    this.field489[var4] = this.method106(256 - this.field366, false, this.field490[var4], this.field492[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field489[var5] = this.field490[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field420.field923[var6] = this.field609.field1435[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field299[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field356[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field489[var26];
                    int var30 = this.field420.field923[var8];
                    this.field420.field923[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0) {
            this.field596 = this.field297.method194();
        }
        this.field420.method328(0, 0, super.field1119, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field421.field923[var10] = this.field610.field1435[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field299[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field356[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field489[var18];
                    int var22 = this.field421.field923[var16];
                    this.field421.field923[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field421.method328(637, 0, super.field1119, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBI)V")
    public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = 2048 - arg2 & 2047;
        int var9 = 2048 - arg6 & 2047;
        if (arg5 == 101) {
            int var10 = 0;
            int var11 = 0;
            int var12 = arg1;
            if (var8 != 0) {
                int var13 = class16.field777[var8];
                int var14 = class16.field778[var8];
                int var15 = var11 * var14 - arg1 * var13 >> 16;
                var12 = var11 * var13 + arg1 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = class16.field777[var9];
                int var17 = class16.field778[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field188 = arg0 - var10;
            this.field189 = arg3 - var11;
            this.field190 = arg4 - var12;
            this.field191 = arg2;
            this.field192 = arg6;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method63(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field621 = "";
                this.field622 = "Connecting to server...";
                this.method125(true, 0);
            }
            this.field351 = new class60(-634, this, this.method66(field291 + 43594));
            long var4 = class71.method597(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field336.field646 = 0;
            this.field336.method184(14);
            this.field336.method184(var6);
            this.field351.method550(0, false, this.field336.field645, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field351.method547();
            }
            int var8 = this.field351.method547();
            int var9 = var8;
            if (var8 == 0) {
                this.field351.method549(this.field297.field645, 0, 8);
                this.field297.field646 = 0;
                this.field129 = this.field297.method200(3838);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field129 >> 32), (int) this.field129 };
                this.field336.field646 = 0;
                this.field336.method184(10);
                this.field336.method188(var10[0]);
                this.field336.method188(var10[1]);
                this.field336.method188(var10[2]);
                this.field336.method188(var10[3]);
                this.field336.method188(signlink.uid);
                this.field336.method191(arg0);
                this.field336.method191(arg1);
                this.field336.method209(0, field572, field367);
                this.field218.field646 = 0;
                if (arg2) {
                    this.field218.method184(18);
                } else {
                    this.field218.method184(16);
                }
                this.field218.method184(this.field336.field646 + 36 + 1 + 1 + 2);
                this.field218.method184(255);
                this.field218.method185(359);
                this.field218.method184(field293 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field218.method188(this.field126[var11]);
                }
                this.field218.method192((byte) -20, this.field336.field645, this.field336.field646, 0);
                this.field336.field650 = new class49(false, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field470 = new class49(false, var10);
                this.field351.method550(0, false, this.field218.field645, this.field218.field646);
                var8 = this.field351.method547();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method63(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field600 = this.field351.method547();
                field415 = this.field351.method547() == 1;
                this.field465 = 0L;
                this.field579 = 0;
                this.field451.field1700 = 0;
                super.field1124 = true;
                this.field389 = true;
                this.field132 = true;
                this.field336.field646 = 0;
                this.field297.field646 = 0;
                this.field596 = -1;
                this.field358 = -1;
                this.field359 = -1;
                this.field360 = -1;
                this.field595 = 0;
                this.field597 = 0;
                this.field493 = 0;
                this.field599 = 0;
                this.field144 = 0;
                this.field407 = 0;
                this.field439 = false;
                super.field1125 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field454[var13] = null;
                }
                this.field311 = 0;
                this.field347 = 0;
                this.field333 = 0;
                this.field414 = 0;
                this.field267 = (int) (Math.random() * 100.0D) - 50;
                this.field517 = (int) (Math.random() * 110.0D) - 55;
                this.field177 = (int) (Math.random() * 80.0D) - 40;
                this.field326 = (int) (Math.random() * 120.0D) - 60;
                this.field467 = (int) (Math.random() * 30.0D) - 20;
                this.field404 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field181 = 0;
                this.field475 = -1;
                this.field316 = 0;
                this.field317 = 0;
                this.field236 = 0;
                this.field154 = 0;
                for (int var14 = 0; var14 < this.field233; ++var14) {
                    this.field235[var14] = null;
                    this.field240[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field153[var15] = null;
                }
                field394 = this.field235[this.field234] = new class36();
                this.field578.method571();
                this.field232.method571();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field623[var16][var17][var18] = null;
                        }
                    }
                }
                this.field450 = new class62(-388);
                this.field590 = 0;
                this.field589 = 0;
                this.method161(this.field374, (byte) 45);
                this.field374 = -1;
                this.method161(this.field624, (byte) 45);
                this.field624 = -1;
                this.method161(this.field466, (byte) 45);
                this.field466 = -1;
                this.method161(this.field614, (byte) 45);
                this.field614 = -1;
                this.method161(this.field604, (byte) 45);
                this.field604 = -1;
                this.method161(this.field588, (byte) 45);
                this.field588 = -1;
                this.method161(this.field345, (byte) 45);
                this.field345 = -1;
                this.field481 = false;
                this.field463 = 3;
                this.field320 = 0;
                this.field439 = false;
                this.field449 = false;
                this.field140 = null;
                this.field515 = 0;
                this.field482 = -1;
                this.field620 = true;
                this.method134((byte) 8);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field567[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field478[var20] = null;
                    this.field479[var20] = false;
                }
                field298 = 0;
                field469 = 0;
                field296 = 0;
                field137 = 0;
                field378 = 0;
                field527 = 0;
                field531 = 0;
                field224 = 0;
                field319 = 0;
                field352 = 0;
                this.method105(-618);
            } else if (var8 == 3) {
                this.field621 = "";
                this.field622 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field621 = "Your account has been disabled.";
                this.field622 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field621 = "Your account is already logged in.";
                this.field622 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field621 = "RuneScape has been updated!";
                this.field622 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field621 = "This world is full.";
                this.field622 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field621 = "Unable to connect.";
                this.field622 = "Login server offline.";
            } else if (var8 == 9) {
                this.field621 = "Login limit exceeded.";
                this.field622 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field621 = "Unable to connect.";
                this.field622 = "Bad session id.";
            } else if (var8 == 11) {
                this.field621 = "Login server rejected session.";
                this.field622 = "Please try again.";
            } else if (var8 == 12) {
                this.field621 = "You need a members account to login to this world.";
                this.field622 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field621 = "Could not complete login.";
                this.field622 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field621 = "The server is being updated.";
                this.field622 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field132 = true;
                this.field336.field646 = 0;
                this.field297.field646 = 0;
                this.field596 = -1;
                this.field358 = -1;
                this.field359 = -1;
                this.field360 = -1;
                this.field595 = 0;
                this.field597 = 0;
                this.field493 = 0;
                this.field407 = 0;
                this.field439 = false;
                this.field523 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field621 = "Login attempts exceeded.";
                this.field622 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field621 = "You are standing in a members-only area.";
                this.field622 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field621 = "Invalid loginserver requested";
                this.field622 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field621 = "Malformed login packet.";
                    this.field622 = "Please try again.";
                } else if (var8 == 23) {
                    this.field621 = "This computers address has been blocked";
                    this.field622 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field485 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field485;
                            this.method63(arg0, arg1, arg2);
                        } else {
                            this.field621 = "No response from loginserver";
                            this.field622 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field621 = "No response from server";
                        this.field622 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field621 = "Unexpected server response";
                    this.field622 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field351.method547();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field621 = "You have only just left another world";
                    this.field622 = "Your profile will be transferred in: " + var26;
                    this.method125(true, 0);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method63(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field621 = "";
            this.field622 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (super.field1120 == null) {
            this.method152(this.field180);
            this.field417 = null;
            this.field418 = null;
            if (!arg0) {
                this.field501 = this.field470.method437();
            }
            this.field419 = null;
            this.field420 = null;
            this.field421 = null;
            this.field422 = null;
            this.field423 = null;
            this.field424 = null;
            this.field425 = null;
            this.field536 = null;
            this.field534 = null;
            this.field533 = null;
            this.field535 = null;
            this.field249 = null;
            this.field250 = null;
            this.field251 = null;
            super.field1120 = new class28(this.method117((byte) 0), 765, (byte) 0, 503);
            this.field593 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method65(int arg0) {
        this.field533.method327((byte) 4);
        class39.field1156 = this.field495;
        if (arg0 != 7) {
            this.field596 = this.field297.method194();
        }
        this.field200.method424(0, this.field549, 0);
        if (this.field588 != -1) {
            this.method115(0, class65.method577(this.field588), 0, (byte) -88, 0);
        } else if (this.field300[this.field463] != -1) {
            this.method115(0, class65.method577(this.field300[this.field463]), 0, (byte) -88, 0);
        }
        if (this.field439 && this.field379 == 1) {
            this.method141(false);
        }
        this.field533.method328(553, 205, super.field1119, 0);
        this.field535.method327((byte) 4);
        class39.field1156 = this.field496;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method66(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method67(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field356[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field356[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field357[var14] = (this.field356[var14 - 1] + this.field356[var14 + 1] + this.field356[var14 - 128] + this.field356[var14 + 128]) / 4;
            }
        }
        this.field556 += 128;
        if (arg0 != 44) {
            field545 = true;
        }
        if (this.field556 > this.field261.length) {
            this.field556 -= this.field261.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method96(this.field525[var6], -37776);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field357[var11 + 128] - this.field261[this.field556 + var11 & this.field261.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field356[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field299[var8] = this.field299[var8 + 1];
        }
        this.field299[var2 - 1] = (int) (Math.sin((double) field471 / 14.0D) * 16.0D + Math.sin((double) field471 / 15.0D) * 14.0D + Math.sin((double) field471 / 16.0D) * 12.0D);
        if (this.field365 > 0) {
            this.field365 -= 4;
        }
        if (this.field366 > 0) {
            this.field366 -= 4;
        }
        if (this.field365 == 0 && this.field366 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field365 = 1024;
            }
            if (var9 == 1) {
                this.field366 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method68(byte arg0) {
        for (int var2 = 0; var2 < this.field154; ++var2) {
            int var3 = this.field155[var2];
            class25 var4 = this.field153[var3];
            if (var4 != null) {
                this.method69(true, var4.field887.field1472, var4);
            }
        }
        if (this.field131 != arg0) {
            this.field596 = this.field297.method194();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILSDXDPBJK;)V")
    public final void method69(boolean arg0, int arg1, class50 arg2) {
        if (arg2.field1305 < 128 || arg2.field1306 < 128 || arg2.field1305 >= 13184 || arg2.field1306 >= 13184) {
            arg2.field1300 = -1;
            arg2.field1273 = -1;
            arg2.field1283 = 0;
            arg2.field1284 = 0;
            arg2.field1305 = arg2.field1292[0] * 128 + arg2.field1308 * 64;
            arg2.field1306 = arg2.field1293[0] * 128 + arg2.field1308 * 64;
            arg2.method443(695);
        }
        if (field394 == arg2 && (arg2.field1305 < 1536 || arg2.field1306 < 1536 || arg2.field1305 >= 11776 || arg2.field1306 >= 11776)) {
            arg2.field1300 = -1;
            arg2.field1273 = -1;
            arg2.field1283 = 0;
            arg2.field1284 = 0;
            arg2.field1305 = arg2.field1292[0] * 128 + arg2.field1308 * 64;
            arg2.field1306 = arg2.field1293[0] * 128 + arg2.field1308 * 64;
            arg2.method443(695);
        }
        if (arg2.field1283 > field471) {
            this.method70(0, arg2);
        } else if (arg2.field1284 >= field471) {
            this.method71(728, arg2);
        } else {
            this.method72(this.field476, arg2);
        }
        this.method73(-599, arg2);
        this.field132 &= arg0;
        this.method74(arg2, (byte) -30);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILSDXDPBJK;)V")
    public final void method70(int arg0, class50 arg1) {
        this.field595 += arg0;
        int var3 = arg1.field1283 - field471;
        int var4 = arg1.field1308 * 64 + arg1.field1279 * 128;
        int var5 = arg1.field1308 * 64 + arg1.field1281 * 128;
        arg1.field1305 += (var4 - arg1.field1305) / var3;
        arg1.field1306 += (var5 - arg1.field1306) / var3;
        arg1.field1294 = 0;
        if (arg1.field1285 == 0) {
            arg1.field1278 = 1024;
        }
        if (arg1.field1285 == 1) {
            arg1.field1278 = 1536;
        }
        if (arg1.field1285 == 2) {
            arg1.field1278 = 0;
        }
        if (arg1.field1285 == 3) {
            arg1.field1278 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILSDXDPBJK;)V")
    public final void method71(int arg0, class50 arg1) {
        if (field471 == arg1.field1284 || arg1.field1300 == -1 || arg1.field1303 != 0 || arg1.field1302 + 1 > class67.field1666[arg1.field1300].method583(arg1.field1301, (byte) 9)) {
            int var3 = arg1.field1284 - arg1.field1283;
            int var4 = field471 - arg1.field1283;
            int var5 = arg1.field1308 * 64 + arg1.field1279 * 128;
            int var6 = arg1.field1308 * 64 + arg1.field1281 * 128;
            int var7 = arg1.field1308 * 64 + arg1.field1280 * 128;
            int var8 = arg1.field1308 * 64 + arg1.field1282 * 128;
            arg1.field1305 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1306 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1294 = 0;
        if (arg1.field1285 == 0) {
            arg1.field1278 = 1024;
        }
        if (arg1.field1285 == 1) {
            arg1.field1278 = 1536;
        }
        if (arg1.field1285 == 2) {
            arg1.field1278 = 0;
        }
        if (arg1.field1285 == 3) {
            arg1.field1278 = 512;
        }
        arg1.field1307 = arg1.field1278;
        int var9 = 45 / arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLSDXDPBJK;)V")
    public final void method72(boolean arg0, class50 arg1) {
        if (!arg0) {
            this.field336.method184(80);
        }
        arg1.field1297 = arg1.field1286;
        if (arg1.field1309 == 0) {
            arg1.field1294 = 0;
        } else {
            if (arg1.field1300 != -1 && arg1.field1303 == 0) {
                class67 var3 = class67.field1666[arg1.field1300];
                if (arg1.field1321 > 0 && var3.field1678 == 0) {
                    ++arg1.field1294;
                    return;
                }
                if (arg1.field1321 <= 0 && var3.field1679 == 0) {
                    ++arg1.field1294;
                    return;
                }
            }
            int var4 = arg1.field1305;
            int var5 = arg1.field1306;
            int var6 = arg1.field1292[arg1.field1309 - 1] * 128 + arg1.field1308 * 64;
            int var7 = arg1.field1293[arg1.field1309 - 1] * 128 + arg1.field1308 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1278 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1278 = 1792;
                    } else {
                        arg1.field1278 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1278 = 768;
                    } else if (var5 > var7) {
                        arg1.field1278 = 256;
                    } else {
                        arg1.field1278 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1278 = 1024;
                } else {
                    arg1.field1278 = 0;
                }
                int var8 = arg1.field1278 - arg1.field1307 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1269;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1268;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1271;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1270;
                }
                if (var9 == -1) {
                    var9 = arg1.field1268;
                }
                arg1.field1297 = var9;
                int var10 = 4;
                if (arg1.field1307 != arg1.field1278 && arg1.field1295 == -1 && arg1.field1316 != 0) {
                    var10 = 2;
                }
                if (arg1.field1309 > 2) {
                    var10 = 6;
                }
                if (arg1.field1309 > 3) {
                    var10 = 8;
                }
                if (arg1.field1294 > 0 && arg1.field1309 > 1) {
                    var10 = 8;
                    --arg1.field1294;
                }
                if (arg1.field1291[arg1.field1309 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field1297 == arg1.field1268 && arg1.field1320 != -1) {
                    arg1.field1297 = arg1.field1320;
                }
                if (var4 < var6) {
                    arg1.field1305 += var10;
                    if (arg1.field1305 > var6) {
                        arg1.field1305 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1305 -= var10;
                    if (arg1.field1305 < var6) {
                        arg1.field1305 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1306 += var10;
                    if (arg1.field1306 > var7) {
                        arg1.field1306 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1306 -= var10;
                    if (arg1.field1306 < var7) {
                        arg1.field1306 = var7;
                    }
                }
                if (arg1.field1305 == var6 && arg1.field1306 == var7) {
                    --arg1.field1309;
                    if (arg1.field1321 > 0) {
                        --arg1.field1321;
                        return;
                    }
                }
            } else {
                arg1.field1305 = var6;
                arg1.field1306 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ILSDXDPBJK;)V")
    public final void method73(int arg0, class50 arg1) {
        if (arg0 < 0) {
            if (arg1.field1316 != 0) {
                if (arg1.field1295 != -1 && arg1.field1295 < 32768) {
                    class25 var3 = this.field153[arg1.field1295];
                    if (var3 != null) {
                        int var4 = arg1.field1305 - var3.field1305;
                        int var5 = arg1.field1306 - var3.field1306;
                        if (var4 != 0 || var5 != 0) {
                            arg1.field1278 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                        }
                    }
                }
                if (arg1.field1295 >= 32768) {
                    int var6 = arg1.field1295 - 32768;
                    if (this.field149 == var6) {
                        var6 = this.field234;
                    }
                    class36 var7 = this.field235[var6];
                    if (var7 != null) {
                        int var8 = arg1.field1305 - var7.field1305;
                        int var9 = arg1.field1306 - var7.field1306;
                        if (var8 != 0 || var9 != 0) {
                            arg1.field1278 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg1.field1317 != 0 || arg1.field1318 != 0) && (arg1.field1309 == 0 || arg1.field1294 > 0)) {
                    int var10 = arg1.field1305 - (arg1.field1317 - this.field455 - this.field455) * 64;
                    int var11 = arg1.field1306 - (arg1.field1318 - this.field456 - this.field456) * 64;
                    if (var10 != 0 || var11 != 0) {
                        arg1.field1278 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                    }
                    arg1.field1317 = 0;
                    arg1.field1318 = 0;
                }
                int var12 = arg1.field1278 - arg1.field1307 & 2047;
                if (var12 != 0) {
                    if (var12 >= arg1.field1316 && var12 <= 2048 - arg1.field1316) {
                        if (var12 > 1024) {
                            arg1.field1307 -= arg1.field1316;
                        } else {
                            arg1.field1307 += arg1.field1316;
                        }
                    } else {
                        arg1.field1307 = arg1.field1278;
                    }
                    arg1.field1307 &= 2047;
                    if (arg1.field1297 == arg1.field1286 && arg1.field1307 != arg1.field1278) {
                        if (arg1.field1287 != -1) {
                            arg1.field1297 = arg1.field1287;
                            return;
                        }
                        arg1.field1297 = arg1.field1268;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSDXDPBJK;B)V")
    public final void method74(class50 arg0, byte arg1) {
        if (arg1 != -30) {
            this.field596 = -1;
        }
        arg0.field1319 = false;
        if (arg0.field1297 != -1) {
            class67 var3 = class67.field1666[arg0.field1297];
            ++arg0.field1299;
            if (arg0.field1298 < var3.field1667 && arg0.field1299 > var3.method583(arg0.field1298, (byte) 9)) {
                arg0.field1299 = 0;
                ++arg0.field1298;
            }
            if (arg0.field1298 >= var3.field1667) {
                arg0.field1299 = 0;
                arg0.field1298 = 0;
            }
        }
        if (arg0.field1273 != -1 && field471 >= arg0.field1276) {
            if (arg0.field1274 < 0) {
                arg0.field1274 = 0;
            }
            class67 var4 = class29.field932[arg0.field1273].field936;
            ++arg0.field1275;
            while (arg0.field1274 < var4.field1667 && arg0.field1275 > var4.method583(arg0.field1274, (byte) 9)) {
                arg0.field1275 -= var4.method583(arg0.field1274, (byte) 9);
                ++arg0.field1274;
            }
            if (arg0.field1274 >= var4.field1667 && (arg0.field1274 < 0 || arg0.field1274 >= var4.field1667)) {
                arg0.field1273 = -1;
            }
        }
        if (arg0.field1300 != -1 && arg0.field1303 <= 1) {
            class67 var5 = class67.field1666[arg0.field1300];
            if (var5.field1678 == 1 && arg0.field1321 > 0 && arg0.field1283 <= field471 && arg0.field1284 < field471) {
                arg0.field1303 = 1;
                return;
            }
        }
        if (arg0.field1300 != -1 && arg0.field1303 == 0) {
            class67 var6 = class67.field1666[arg0.field1300];
            ++arg0.field1302;
            while (arg0.field1301 < var6.field1667 && arg0.field1302 > var6.method583(arg0.field1301, (byte) 9)) {
                arg0.field1302 -= var6.method583(arg0.field1301, (byte) 9);
                ++arg0.field1301;
            }
            if (arg0.field1301 >= var6.field1667) {
                arg0.field1301 -= var6.field1671;
                ++arg0.field1304;
                if (arg0.field1304 >= var6.field1677) {
                    arg0.field1300 = -1;
                }
                if (arg0.field1301 < 0 || arg0.field1301 >= var6.field1667) {
                    arg0.field1300 = -1;
                }
            }
            arg0.field1319 = var6.field1673;
        }
        if (arg0.field1303 > 0) {
            --arg0.field1303;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method75(boolean arg0) {
        if (this.field614 == -1 || this.field333 != 2 && super.field1120 == null) {
            if (this.field593) {
                this.method105(-618);
                this.field593 = false;
                this.field301.method328(0, 4, super.field1119, 0);
                this.field302.method328(0, 357, super.field1119, 0);
                this.field303.method328(722, 4, super.field1119, 0);
                this.field304.method328(743, 205, super.field1119, 0);
                this.field305.method328(0, 0, super.field1119, 0);
                this.field306.method328(516, 4, super.field1119, 0);
                this.field307.method328(516, 205, super.field1119, 0);
                this.field308.method328(496, 357, super.field1119, 0);
                this.field309.method328(0, 338, super.field1119, 0);
                this.field472 = true;
                this.field550 = true;
                this.field208 = true;
                this.field324 = true;
                if (this.field333 != 2) {
                    this.field535.method328(4, 4, super.field1119, 0);
                    this.field534.method328(550, 4, super.field1119, 0);
                }
            }
            if (this.field333 == 2) {
                this.method51(20489);
            }
            if (this.field439 && this.field379 == 1) {
                this.field472 = true;
            }
            if (this.field588 != -1) {
                boolean var4 = this.method81(this.field263, this.field588, (byte) 0);
                if (var4) {
                    this.field472 = true;
                }
            }
            if (this.field564 == 2) {
                this.field472 = true;
            }
            if (this.field575 == 2) {
                this.field472 = true;
            }
            if (this.field472) {
                this.method65(this.field410);
                this.field472 = false;
            }
            if (this.field624 == -1 && this.field320 == 0) {
                this.field375.field1598 = this.field242 - this.field175 - 77;
                if (super.field1127 > 448 && super.field1127 < 560 && super.field1128 > 332) {
                    this.method174(0, 77, super.field1128 - 357, super.field1127 - 17, 463, this.field375, this.field242, -1, false);
                }
                int var5 = this.field242 - 77 - this.field375.field1598;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field242 - 77) {
                    var5 = this.field242 - 77;
                }
                if (this.field175 != var5) {
                    this.field175 = var5;
                    this.field550 = true;
                }
                ++field322;
                if (field322 > 73) {
                    field322 = 0;
                    this.field336.method183(252, this.field230);
                }
            }
            if (this.field624 == -1 && this.field320 == 3) {
                int var6 = this.field445 * 14 + 7;
                this.field375.field1598 = this.field448;
                if (super.field1127 > 448 && super.field1127 < 560 && super.field1128 > 332) {
                    this.method174(0, 77, super.field1128 - 357, super.field1127 - 17, 463, this.field375, var6, -1, false);
                }
                int var7 = this.field375.field1598;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field448 != var7) {
                    this.field448 = var7;
                    this.field550 = true;
                }
            }
            if (this.field624 != -1) {
                boolean var8 = this.method81(this.field263, this.field624, (byte) 0);
                if (var8) {
                    this.field550 = true;
                }
            }
            if (this.field564 == 3) {
                this.field550 = true;
            }
            if (this.field575 == 3) {
                this.field550 = true;
            }
            if (this.field140 != null) {
                this.field550 = true;
            }
            if (this.field439 && this.field379 == 2) {
                this.field550 = true;
            }
            if (this.field550) {
                this.method143(0);
                this.field550 = false;
            }
            if (this.field333 == 2) {
                this.method44((byte) -32);
                this.field534.method328(550, 4, super.field1119, 0);
                ++field285;
                if (field285 > 95) {
                    field285 = 0;
                    this.field336.method183(233, this.field230);
                }
            }
            if (this.field482 != -1) {
                this.field208 = true;
            }
            if (this.field208) {
                if (this.field482 != -1 && this.field482 == this.field463) {
                    this.field482 = -1;
                    this.field336.method183(156, this.field230);
                    this.field336.method184(this.field463);
                }
                this.field208 = false;
                this.field251.method327((byte) 4);
                this.field363.method424(0, this.field549, 0);
                if (this.field588 == -1) {
                    if (this.field300[this.field463] != -1) {
                        if (this.field463 == 0) {
                            this.field210.method424(22, this.field549, 10);
                        }
                        if (this.field463 == 1) {
                            this.field211.method424(54, this.field549, 8);
                        }
                        if (this.field463 == 2) {
                            this.field211.method424(82, this.field549, 8);
                        }
                        if (this.field463 == 3) {
                            this.field212.method424(110, this.field549, 8);
                        }
                        if (this.field463 == 4) {
                            this.field214.method424(153, this.field549, 8);
                        }
                        if (this.field463 == 5) {
                            this.field214.method424(181, this.field549, 8);
                        }
                        if (this.field463 == 6) {
                            this.field213.method424(209, this.field549, 9);
                        }
                    }
                    if (this.field300[0] != -1 && (this.field482 != 0 || field471 % 20 < 10)) {
                        this.field273[0].method424(29, this.field549, 13);
                    }
                    if (this.field300[1] != -1 && (this.field482 != 1 || field471 % 20 < 10)) {
                        this.field273[1].method424(53, this.field549, 11);
                    }
                    if (this.field300[2] != -1 && (this.field482 != 2 || field471 % 20 < 10)) {
                        this.field273[2].method424(82, this.field549, 11);
                    }
                    if (this.field300[3] != -1 && (this.field482 != 3 || field471 % 20 < 10)) {
                        this.field273[3].method424(115, this.field549, 12);
                    }
                    if (this.field300[4] != -1 && (this.field482 != 4 || field471 % 20 < 10)) {
                        this.field273[4].method424(153, this.field549, 13);
                    }
                    if (this.field300[5] != -1 && (this.field482 != 5 || field471 % 20 < 10)) {
                        this.field273[5].method424(180, this.field549, 11);
                    }
                    if (this.field300[6] != -1 && (this.field482 != 6 || field471 % 20 < 10)) {
                        this.field273[6].method424(208, this.field549, 13);
                    }
                }
                this.field251.method328(516, 160, super.field1119, 0);
                this.field250.method327((byte) 4);
                this.field362.method424(0, this.field549, 0);
                if (this.field588 == -1) {
                    if (this.field300[this.field463] != -1) {
                        if (this.field463 == 7) {
                            this.field434.method424(42, this.field549, 0);
                        }
                        if (this.field463 == 8) {
                            this.field435.method424(74, this.field549, 0);
                        }
                        if (this.field463 == 9) {
                            this.field435.method424(102, this.field549, 0);
                        }
                        if (this.field463 == 10) {
                            this.field436.method424(130, this.field549, 1);
                        }
                        if (this.field463 == 11) {
                            this.field438.method424(173, this.field549, 0);
                        }
                        if (this.field463 == 12) {
                            this.field438.method424(201, this.field549, 0);
                        }
                        if (this.field463 == 13) {
                            this.field437.method424(229, this.field549, 0);
                        }
                    }
                    if (this.field300[8] != -1 && (this.field482 != 8 || field471 % 20 < 10)) {
                        this.field273[7].method424(74, this.field549, 2);
                    }
                    if (this.field300[9] != -1 && (this.field482 != 9 || field471 % 20 < 10)) {
                        this.field273[8].method424(102, this.field549, 3);
                    }
                    if (this.field300[10] != -1 && (this.field482 != 10 || field471 % 20 < 10)) {
                        this.field273[9].method424(137, this.field549, 4);
                    }
                    if (this.field300[11] != -1 && (this.field482 != 11 || field471 % 20 < 10)) {
                        this.field273[10].method424(174, this.field549, 2);
                    }
                    if (this.field300[12] != -1 && (this.field482 != 12 || field471 % 20 < 10)) {
                        this.field273[11].method424(201, this.field549, 2);
                    }
                    if (this.field300[13] != -1 && (this.field482 != 13 || field471 % 20 < 10)) {
                        this.field273[12].method424(226, this.field549, 2);
                    }
                }
                this.field250.method328(496, 466, super.field1119, 0);
                this.field535.method327((byte) 4);
                class39.field1156 = this.field496;
            }
            if (this.field324) {
                this.field324 = false;
                this.field249.method327((byte) 4);
                this.field361.method424(0, this.field549, 0);
                this.field221.method233(28, 16777215, true, 55, "Public chat", false);
                if (this.field289 == 0) {
                    this.field221.method233(41, 65280, true, 55, "On", false);
                }
                if (this.field289 == 1) {
                    this.field221.method233(41, 16776960, true, 55, "Friends", false);
                }
                if (this.field289 == 2) {
                    this.field221.method233(41, 16711680, true, 55, "Off", false);
                }
                if (this.field289 == 3) {
                    this.field221.method233(41, 65535, true, 55, "Hide", false);
                }
                this.field221.method233(28, 16777215, true, 184, "Private chat", false);
                if (this.field557 == 0) {
                    this.field221.method233(41, 65280, true, 184, "On", false);
                }
                if (this.field557 == 1) {
                    this.field221.method233(41, 16776960, true, 184, "Friends", false);
                }
                if (this.field557 == 2) {
                    this.field221.method233(41, 16711680, true, 184, "Off", false);
                }
                this.field221.method233(28, 16777215, true, 324, "Trade/compete", false);
                if (this.field209 == 0) {
                    this.field221.method233(41, 65280, true, 324, "On", false);
                }
                if (this.field209 == 1) {
                    this.field221.method233(41, 16776960, true, 324, "Friends", false);
                }
                if (this.field209 == 2) {
                    this.field221.method233(41, 16711680, true, 324, "Off", false);
                }
                this.field221.method233(33, 16777215, true, 458, "Report abuse", false);
                this.field249.method328(0, 453, super.field1119, 0);
                this.field535.method327((byte) 4);
                class39.field1156 = this.field496;
            }
            this.field263 = 0;
            this.field132 &= arg0;
        } else {
            if (this.field333 == 2) {
                this.method81(this.field263, this.field614, (byte) 0);
                if (this.field604 != -1) {
                    this.method81(this.field263, this.field604, (byte) 0);
                }
                this.field263 = 0;
                this.method64(true);
                super.field1120.method327((byte) 4);
                class39.field1156 = this.field497;
                class6.method20(12847);
                this.field593 = true;
                class65 var2 = class65.method577(this.field614);
                if (var2.field1610 == 512 && var2.field1618 == 334 && var2.field1594 == 0) {
                    var2.field1610 = 765;
                    var2.field1618 = 503;
                }
                this.method115(0, var2, 0, (byte) -88, 0);
                if (this.field604 != -1) {
                    class65 var3 = class65.method577(this.field604);
                    if (var3.field1610 == 512 && var3.field1618 == 334 && var3.field1594 == 0) {
                        var3.field1610 = 765;
                        var3.field1618 = 503;
                    }
                    this.method115(0, var3, 0, (byte) -88, 0);
                }
                if (!this.field439) {
                    this.method165((byte) 8);
                    this.method151(6374);
                } else {
                    this.method141(false);
                }
            }
            super.field1120.method328(0, 0, super.field1119, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method76(boolean arg0) {
        if (arg0) {
            field386 = 177;
        }
        if (this.field142 == 0) {
            int var2 = super.field1117 / 2 - 80;
            int var3 = super.field1118 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1133 == 1 && super.field1134 >= var2 - 75 && super.field1134 <= var2 + 75 && super.field1135 >= var14 - 20 && super.field1135 <= var14 + 20) {
                this.field142 = 3;
                this.field219 = 0;
            }
            int var4 = super.field1117 / 2 + 80;
            if (super.field1133 == 1 && super.field1134 >= var4 - 75 && super.field1134 <= var4 + 75 && super.field1135 >= var14 - 20 && super.field1135 <= var14 + 20) {
                this.field621 = "";
                this.field622 = "Enter your username & password.";
                this.field142 = 2;
                this.field219 = 0;
            }
        } else if (this.field142 == 2) {
            int var5 = super.field1118 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1133 == 1 && super.field1135 >= var16 - 15 && super.field1135 < var16) {
                this.field219 = 0;
            }
            var5 = var16 + 15;
            if (super.field1133 == 1 && super.field1135 >= var5 - 15 && super.field1135 < var5) {
                this.field219 = 1;
            }
            var5 += 15;
            int var6 = super.field1117 / 2 - 80;
            int var7 = super.field1118 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1133 == 1 && super.field1134 >= var6 - 75 && super.field1134 <= var6 + 75 && super.field1135 >= var17 - 20 && super.field1135 <= var17 + 20) {
                this.field485 = 0;
                this.method63(this.field411, this.field412, false);
                if (this.field132) {
                    return;
                }
            }
            int var8 = super.field1117 / 2 + 80;
            if (super.field1133 == 1 && super.field1134 >= var8 - 75 && super.field1134 <= var8 + 75 && super.field1135 >= var17 - 20 && super.field1135 <= var17 + 20) {
                this.field142 = 0;
                this.field411 = "";
                this.field412 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method401((byte) 0);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field391.length(); ++var11) {
                        if (var9 == field391.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field219 == 0) {
                        if (var9 == 8 && this.field411.length() > 0) {
                            this.field411 = this.field411.substring(0, this.field411.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field219 = 1;
                        }
                        if (var10) {
                            this.field411 = this.field411 + (char) var9;
                        }
                        if (this.field411.length() > 12) {
                            this.field411 = this.field411.substring(0, 12);
                        }
                    } else if (this.field219 == 1) {
                        if (var9 == 8 && this.field412.length() > 0) {
                            this.field412 = this.field412.substring(0, this.field412.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field219 = 0;
                        }
                        if (var10) {
                            this.field412 = this.field412 + (char) var9;
                        }
                        if (this.field412.length() > 20) {
                            this.field412 = this.field412.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field142 == 3) {
                int var12 = super.field1117 / 2;
                int var13 = super.field1118 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1133 == 1 && super.field1134 >= var12 - 75 && super.field1134 <= var12 + 75 && super.field1135 >= var18 - 20 && super.field1135 <= var18 + 20) {
                    this.field142 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILHAWWMNZR;)V")
    private final void method77(int arg0, class23 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field877 == 0) {
            var3 = this.field591.method474(arg1.field876, arg1.field878, arg1.field879);
        }
        if (arg1.field877 == 1) {
            var3 = this.field591.method475(0, arg1.field878, arg1.field876, arg1.field879);
        }
        if (arg1.field877 == 2) {
            var3 = this.field591.method476(arg1.field876, arg1.field878, arg1.field879);
        }
        if (arg1.field877 == 3) {
            var3 = this.field591.method477(arg1.field876, arg1.field878, arg1.field879);
        }
        if (var3 != 0) {
            int var7 = this.field591.method478(arg1.field876, arg1.field878, arg1.field879, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field870 = var4;
        arg1.field872 = var5;
        arg1.field871 = var6;
        if (this.field603 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Z")
    public final boolean method78(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field351 == null) {
            return false;
        } else {
            try {
                int var2 = this.field351.method548();
                if (var2 == 0) {
                    return false;
                }
                if (this.field596 == -1) {
                    this.field351.method549(this.field297.field645, 0, 1);
                    this.field596 = this.field297.field645[0] & 255;
                    if (this.field470 != null) {
                        this.field596 = this.field596 - this.field470.method437() & 255;
                    }
                    this.field595 = class52.field1330[this.field596];
                    --var2;
                }
                if (this.field595 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field351.method549(this.field297.field645, 0, 1);
                    this.field595 = this.field297.field645[0] & 255;
                    --var2;
                }
                if (this.field595 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field351.method549(this.field297.field645, 0, 2);
                    this.field297.field646 = 0;
                    this.field595 = this.field297.method196();
                    var2 -= 2;
                }
                if (var2 < this.field595) {
                    return false;
                }
                this.field297.field646 = 0;
                this.field351.method549(this.field297.field645, 0, this.field595);
                this.field597 = 0;
                this.field360 = this.field359;
                this.field359 = this.field358;
                this.field358 = this.field596;
                if (this.field596 == 169) {
                    int var3 = this.field297.method221(-474);
                    byte var4 = this.field297.method215((byte) 4);
                    this.field160[var3] = var4;
                    if (this.field269[var3] != var4) {
                        this.field269[var3] = var4;
                        this.method39((byte) -49, var3);
                        this.field472 = true;
                        if (this.field374 != -1) {
                            this.field550 = true;
                        }
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 86) {
                    int var5 = this.field297.method197();
                    int var6 = this.field297.method222(0);
                    class65 var7 = class65.method577(var6);
                    if (var7.field1650 != var5 || var5 == -1) {
                        var7.field1650 = var5;
                        var7.field1597 = 0;
                        var7.field1648 = 0;
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 79) {
                    if (this.field463 == 12) {
                        this.field472 = true;
                    }
                    this.field135 = this.field297.method194();
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 248) {
                    this.field283 = true;
                    this.field582 = this.field297.method194();
                    this.field583 = this.field297.method194();
                    this.field584 = this.field297.method196();
                    this.field585 = this.field297.method194();
                    this.field586 = this.field297.method194();
                    if (this.field586 >= 100) {
                        this.field188 = this.field582 * 128 + 64;
                        this.field190 = this.field583 * 128 + 64;
                        this.field189 = this.method60(this.field190, 0, this.field510, this.field188) - this.field584;
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 117) {
                    this.field472 = true;
                    int var8 = this.field297.method196();
                    class65 var9 = class65.method577(var8);
                    while (this.field297.field646 < this.field595) {
                        int var10 = this.field297.method208();
                        int var11 = this.field297.method196();
                        int var12 = this.field297.method194();
                        if (var12 == 255) {
                            var12 = this.field297.method199();
                        }
                        if (var10 >= 0 && var10 < var9.field1617.length) {
                            var9.field1617[var10] = var11;
                            var9.field1623[var10] = var12;
                        }
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 252) {
                    int var13 = this.field297.method223(2);
                    int var14 = this.field297.method223(2);
                    int var15 = var14 >> 10 & 31;
                    int var16 = var14 >> 5 & 31;
                    int var17 = var14 & 31;
                    class65.method577(var13).field1584 = (var17 << 3) + (var15 << 19) + (var16 << 11);
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 89) {
                    boolean var18 = this.field297.method212(false) == 1;
                    int var19 = this.field297.method222(0);
                    class65.method577(var19).field1601 = var18;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 94) {
                    this.field590 = this.field297.method194();
                    this.field472 = true;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 200) {
                    int var20 = this.field297.method221(-474);
                    int var21 = this.field297.method222(0);
                    this.method119((byte) -11, var20);
                    if (var21 != -1) {
                        this.method119((byte) -11, var21);
                    }
                    if (this.field466 != -1) {
                        this.method161(this.field466, (byte) 45);
                        this.field466 = -1;
                    }
                    if (this.field588 != -1) {
                        this.method161(this.field588, (byte) 45);
                        this.field588 = -1;
                    }
                    if (this.field624 != -1) {
                        this.method161(this.field624, (byte) 45);
                        this.field624 = -1;
                    }
                    if (this.field614 != var20) {
                        this.method161(this.field614, (byte) 45);
                        this.field614 = var20;
                    }
                    if (this.field604 != var20) {
                        this.method161(this.field604, (byte) 45);
                        this.field604 = var21;
                    }
                    this.field320 = 0;
                    this.field481 = false;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 173) {
                    int var22 = this.field297.method196();
                    if (var22 == 65535) {
                        var22 = -1;
                    }
                    if (this.field370 != var22 && this.field264 && !field293 && this.field433 == 0) {
                        this.field547 = var22;
                        this.field548 = true;
                        this.field612.method540(2, this.field547);
                    }
                    this.field370 = var22;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 43) {
                    int var23 = this.field297.method221(-474);
                    int var24 = this.field297.method225(17447);
                    if (this.field264 && !field293) {
                        this.field547 = var23;
                        this.field548 = false;
                        this.field612.method540(2, this.field547);
                        this.field433 = var24;
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 112) {
                    this.field537 = this.field297.method214(false);
                    this.field538 = this.field297.method214(false);
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 119) {
                    int var25 = this.field297.method223(2);
                    this.method119((byte) -11, var25);
                    if (this.field624 != -1) {
                        this.method161(this.field624, (byte) 45);
                        this.field624 = -1;
                        this.field550 = true;
                    }
                    if (this.field614 != -1) {
                        this.method161(this.field614, (byte) 45);
                        this.field614 = -1;
                        this.field593 = true;
                    }
                    if (this.field604 != -1) {
                        this.method161(this.field604, (byte) 45);
                        this.field604 = -1;
                    }
                    if (this.field466 != -1) {
                        this.method161(this.field466, (byte) 45);
                        this.field466 = -1;
                    }
                    if (this.field588 != var25) {
                        this.method161(this.field588, (byte) 45);
                        this.field588 = var25;
                    }
                    if (this.field320 != 0) {
                        this.field320 = 0;
                        this.field550 = true;
                    }
                    this.field472 = true;
                    this.field208 = true;
                    this.field481 = false;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 109) {
                    this.field472 = true;
                    int var26 = this.field297.method227(false);
                    int var27 = this.field297.method212(false);
                    int var28 = this.field297.method214(false);
                    this.field195[var28] = var26;
                    this.field284[var28] = var27;
                    this.field474[var28] = 1;
                    for (int var29 = 0; var29 < 98; ++var29) {
                        if (var26 >= field373[var29]) {
                            this.field474[var28] = var29 + 2;
                        }
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 121) {
                    for (int var30 = 0; var30 < this.field269.length; ++var30) {
                        if (this.field269[var30] != this.field160[var30]) {
                            this.field269[var30] = this.field160[var30];
                            this.method39((byte) -49, var30);
                            this.field472 = true;
                        }
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 251) {
                    this.field493 = this.field297.method196() * 30;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 188) {
                    this.method145(this.field297, (byte) 0, this.field595);
                    this.field339 = false;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 253) {
                    this.field463 = this.field297.method194();
                    this.field472 = true;
                    this.field208 = true;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 29) {
                    int var31 = this.field297.method228(field390);
                    int var32 = this.field297.method222(0);
                    this.field160[var32] = var31;
                    if (this.field269[var32] != var31) {
                        this.field269[var32] = var31;
                        this.method39((byte) -49, var32);
                        this.field472 = true;
                        if (this.field374 != -1) {
                            this.field550 = true;
                        }
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 48) {
                    this.field181 = this.field297.method194();
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 33) {
                    if (this.field588 != -1) {
                        this.method161(this.field588, (byte) 45);
                        this.field588 = -1;
                        this.field472 = true;
                        this.field208 = true;
                    }
                    if (this.field624 != -1) {
                        this.method161(this.field624, (byte) 45);
                        this.field624 = -1;
                        this.field550 = true;
                    }
                    if (this.field614 != -1) {
                        this.method161(this.field614, (byte) 45);
                        this.field614 = -1;
                        this.field593 = true;
                    }
                    if (this.field604 != -1) {
                        this.method161(this.field604, (byte) 45);
                        this.field604 = -1;
                    }
                    if (this.field466 != -1) {
                        this.method161(this.field466, (byte) 45);
                        this.field466 = -1;
                    }
                    if (this.field320 != 0) {
                        this.field320 = 0;
                        this.field550 = true;
                    }
                    this.field481 = false;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 62) {
                    String var33 = this.field297.method201();
                    if (var33.endsWith(":tradereq:")) {
                        String var34 = var33.substring(0, var33.indexOf(":"));
                        long var35 = class71.method597(var34);
                        boolean var37 = false;
                        for (int var38 = 0; var38 < this.field611; ++var38) {
                            if (this.field473[var38] == var35) {
                                var37 = true;
                                break;
                            }
                        }
                        if (!var37 && this.field528 == 0) {
                            this.method114(var34, "wishes to trade with you.", 4, 0);
                        }
                    } else if (var33.endsWith(":duelreq:")) {
                        String var39 = var33.substring(0, var33.indexOf(":"));
                        long var40 = class71.method597(var39);
                        boolean var42 = false;
                        for (int var43 = 0; var43 < this.field611; ++var43) {
                            if (this.field473[var43] == var40) {
                                var42 = true;
                                break;
                            }
                        }
                        if (!var42 && this.field528 == 0) {
                            this.method114(var39, "wishes to duel with you.", 8, 0);
                        }
                    } else if (!var33.endsWith(":chalreq:")) {
                        this.method114("", var33, 0, 0);
                    } else {
                        String var44 = var33.substring(0, var33.indexOf(":"));
                        long var45 = class71.method597(var44);
                        boolean var47 = false;
                        for (int var48 = 0; var48 < this.field611; ++var48) {
                            if (this.field473[var48] == var45) {
                                var47 = true;
                                break;
                            }
                        }
                        if (!var47 && this.field528 == 0) {
                            String var49 = var33.substring(var33.indexOf(":") + 1, var33.length() - 9);
                            this.method114(var44, var49, 8, 0);
                        }
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 234) {
                    long var50 = this.field297.method200(3838);
                    int var52 = this.field297.method194();
                    String var53 = class71.method601(class71.method598(var50, -491), 8384);
                    for (int var54 = 0; var54 < this.field589; ++var54) {
                        if (this.field440[var54] == var50) {
                            if (this.field442[var54] != var52) {
                                this.field442[var54] = var52;
                                this.field472 = true;
                                if (var52 > 0) {
                                    this.method114("", var53 + " has logged in.", 5, 0);
                                }
                                if (var52 == 0) {
                                    this.method114("", var53 + " has logged out.", 5, 0);
                                }
                            }
                            var53 = null;
                            break;
                        }
                    }
                    if (var53 != null && this.field589 < 200) {
                        this.field440[this.field589] = var50;
                        this.field204[this.field589] = var53;
                        this.field442[this.field589] = var52;
                        ++this.field589;
                        this.field472 = true;
                    }
                    boolean var55 = false;
                    while (!var55) {
                        var55 = true;
                        for (int var56 = 0; var56 < this.field589 - 1; ++var56) {
                            if (this.field442[var56] != field290 && this.field442[var56 + 1] == field290 || this.field442[var56] == 0 && this.field442[var56 + 1] != 0) {
                                int var57 = this.field442[var56];
                                this.field442[var56] = this.field442[var56 + 1];
                                this.field442[var56 + 1] = var57;
                                String var58 = this.field204[var56];
                                this.field204[var56] = this.field204[var56 + 1];
                                this.field204[var56 + 1] = var58;
                                long var59 = this.field440[var56];
                                this.field440[var56] = this.field440[var56 + 1];
                                this.field440[var56 + 1] = var59;
                                this.field472 = true;
                                var55 = false;
                            }
                        }
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 162) {
                    this.field283 = false;
                    for (int var61 = 0; var61 < 5; ++var61) {
                        this.field555[var61] = false;
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 153) {
                    int var62 = this.field297.method224(this.field368);
                    if (this.field374 != var62) {
                        this.method161(this.field374, (byte) 45);
                        this.field374 = var62;
                    }
                    this.field550 = true;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 84) {
                    this.field611 = this.field595 / 8;
                    for (int var63 = 0; var63 < this.field611; ++var63) {
                        this.field473[var63] = this.field297.method200(3838);
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 134) {
                    this.field482 = this.field297.method212(false);
                    if (this.field482 == this.field463) {
                        if (this.field482 == 3) {
                            this.field463 = 1;
                        } else {
                            this.field463 = 3;
                        }
                        this.field472 = true;
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 220) {
                    int var64 = this.field297.method222(0);
                    int var65 = this.field297.method221(-474);
                    class65.method577(var64).field1619 = 1;
                    class65.method577(var64).field1620 = var65;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 238) {
                    this.method56(24238);
                    this.field596 = -1;
                    return false;
                }
                if (this.field596 == 244) {
                    int var66 = this.field297.method224(this.field368);
                    int var67 = this.field297.method221(-474);
                    int var68 = this.field297.method224(this.field368);
                    class65 var69 = class65.method577(var67);
                    var69.field1625 = var68;
                    var69.field1580 = var66;
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 41) {
                    this.field537 = this.field297.method213((byte) 7);
                    this.field538 = this.field297.method214(false);
                    for (int var70 = this.field537; var70 < this.field537 + 8; ++var70) {
                        for (int var71 = this.field538; var71 < this.field538 + 8; ++var71) {
                            if (this.field623[this.field510][var70][var71] != null) {
                                this.field623[this.field510][var70][var71] = null;
                                this.method148(var70, var71);
                            }
                        }
                    }
                    for (class23 var72 = (class23) this.field450.method567(); var72 != null; var72 = (class23) this.field450.method569(false)) {
                        if (var72.field878 >= this.field537 && var72.field878 < this.field537 + 8 && var72.field879 >= this.field538 && var72.field879 < this.field538 + 8 && this.field510 == var72.field876) {
                            var72.field869 = 0;
                        }
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 57) {
                    long var73 = this.field297.method200(3838);
                    int var75 = this.field297.method199();
                    int var76 = this.field297.method194();
                    boolean var77 = false;
                    for (int var78 = 0; var78 < 100; ++var78) {
                        if (this.field552[var78] == var75) {
                            var77 = true;
                            break;
                        }
                    }
                    if (var76 <= 1) {
                        for (int var79 = 0; var79 < this.field611; ++var79) {
                            if (this.field473[var79] == var73) {
                                var77 = true;
                                break;
                            }
                        }
                    }
                    if (!var77 && this.field528 == 0) {
                        try {
                            this.field552[this.field227] = var75;
                            this.field227 = (this.field227 + 1) % 100;
                            String var80 = class51.method444(this.field595 - 13, this.field297, this.field331);
                            if (var76 != 3) {
                                var80 = class37.method369(var80, -443);
                            }
                            if (var76 != 2 && var76 != 3) {
                                if (var76 == 1) {
                                    this.method114("@cr1@" + class71.method601(class71.method598(var73, -491), 8384), var80, 7, 0);
                                } else {
                                    this.method114(class71.method601(class71.method598(var73, -491), 8384), var80, 3, 0);
                                }
                            } else {
                                this.method114("@cr2@" + class71.method601(class71.method598(var73, -491), 8384), var80, 7, 0);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 167) {
                    this.field480 = this.field297.method221(-474);
                    this.field431 = this.field297.method223(2);
                    this.field297.method222(0);
                    this.field400 = this.field297.method222(0);
                    this.field121 = this.field297.method221(-474);
                    this.field297.method214(false);
                    this.field605 = this.field297.method196();
                    this.field325 = this.field297.method196();
                    this.field162 = this.field297.method228(field390);
                    this.field539 = this.field297.method222(0);
                    this.field150 = this.field297.method221(-474);
                    signlink.dnslookup(class71.method600(-38344, this.field162));
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 == 32) {
                    String var82 = this.field297.method201();
                    int var83 = this.field297.method213((byte) 7);
                    int var84 = this.field297.method212(false);
                    if (var84 >= 1 && var84 <= 5) {
                        if (var82.equalsIgnoreCase("null")) {
                            var82 = null;
                        }
                        this.field478[var84 - 1] = var82;
                        this.field479[var84 - 1] = var83 == 0;
                    }
                    this.field596 = -1;
                    return true;
                }
                if (this.field596 != 221 && this.field596 != 141) {
                    if (this.field596 == 160) {
                        this.field144 = this.field297.method194();
                        if (this.field144 == 1) {
                            this.field265 = this.field297.method196();
                        }
                        if (this.field144 >= 2 && this.field144 <= 6) {
                            if (this.field144 == 2) {
                                this.field247 = 64;
                                this.field248 = 64;
                            }
                            if (this.field144 == 3) {
                                this.field247 = 0;
                                this.field248 = 64;
                            }
                            if (this.field144 == 4) {
                                this.field247 = 128;
                                this.field248 = 64;
                            }
                            if (this.field144 == 5) {
                                this.field247 = 64;
                                this.field248 = 0;
                            }
                            if (this.field144 == 6) {
                                this.field247 = 64;
                                this.field248 = 128;
                            }
                            this.field144 = 2;
                            this.field244 = this.field297.method196();
                            this.field245 = this.field297.method196();
                            this.field246 = this.field297.method194();
                        }
                        if (this.field144 == 10) {
                            this.field146 = this.field297.method196();
                        }
                        this.field596 = -1;
                        return true;
                    }
                    if (this.field596 == 177) {
                        this.field289 = this.field297.method194();
                        this.field557 = this.field297.method194();
                        this.field209 = this.field297.method194();
                        this.field324 = true;
                        this.field550 = true;
                        this.field596 = -1;
                        return true;
                    }
                    if (this.field596 == 209) {
                        int var135 = this.field297.method213((byte) 7);
                        int var136 = this.field297.method222(0);
                        if (var136 == 65535) {
                            var136 = -1;
                        }
                        if (this.field300[var135] != var136) {
                            this.method161(this.field300[var135], (byte) 45);
                            this.field300[var135] = var136;
                        }
                        this.field472 = true;
                        this.field208 = true;
                        this.field596 = -1;
                        return true;
                    }
                    if (this.field596 == 23) {
                        this.field149 = this.field297.method196();
                        this.field147 = this.field297.method194();
                        this.field596 = -1;
                        return true;
                    }
                    if (this.field596 != 151) {
                        if (this.field596 == 54) {
                            int var138 = this.field297.method221(-474);
                            class65 var139 = class65.method577(var138);
                            for (int var140 = 0; var140 < var139.field1617.length; ++var140) {
                                var139.field1617[var140] = -1;
                                var139.field1617[var140] = 0;
                            }
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 126 || this.field596 == 110 || this.field596 == 193 || this.field596 == 132 || this.field596 == 102 || this.field596 == 85 || this.field596 == 118 || this.field596 == 142 || this.field596 == 80 || this.field596 == 203 || this.field596 == 38) {
                            this.method111(this.field596, this.field297, 751);
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 186) {
                            this.field449 = false;
                            this.field320 = 2;
                            this.field353 = "";
                            this.field550 = true;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 88) {
                            int var141 = this.field297.method223(2);
                            this.method119((byte) -11, var141);
                            if (this.field588 != -1) {
                                this.method161(this.field588, (byte) 45);
                                this.field588 = -1;
                                this.field472 = true;
                                this.field208 = true;
                            }
                            if (this.field624 != -1) {
                                this.method161(this.field624, (byte) 45);
                                this.field624 = -1;
                                this.field550 = true;
                            }
                            if (this.field614 != -1) {
                                this.method161(this.field614, (byte) 45);
                                this.field614 = -1;
                                this.field593 = true;
                            }
                            if (this.field604 != -1) {
                                this.method161(this.field604, (byte) 45);
                                this.field604 = -1;
                            }
                            if (this.field466 != var141) {
                                this.method161(this.field466, (byte) 45);
                                this.field466 = var141;
                            }
                            if (this.field320 != 0) {
                                this.field320 = 0;
                                this.field550 = true;
                            }
                            this.field481 = false;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 93) {
                            int var142 = this.field297.method224(this.field368);
                            if (var142 >= 0) {
                                this.method119((byte) -11, var142);
                            }
                            if (this.field345 != var142) {
                                this.method161(this.field345, (byte) 45);
                                this.field345 = var142;
                            }
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 166) {
                            int var143 = this.field297.method196();
                            int var144 = this.field297.method222(0);
                            int var145 = this.field297.method223(2);
                            if (var143 == 65535) {
                                class65.method577(var144).field1619 = 0;
                                this.field596 = -1;
                                return true;
                            }
                            class34 var146 = class34.method346(var143);
                            class65.method577(var144).field1619 = 4;
                            class65.method577(var144).field1620 = var143;
                            class65.method577(var144).field1577 = var146.field1005;
                            class65.method577(var144).field1578 = var146.field1039;
                            class65.method577(var144).field1576 = var146.field1012 * 100 / var145;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 14) {
                            this.field472 = true;
                            int var147 = this.field297.method196();
                            class65 var148 = class65.method577(var147);
                            int var149 = this.field297.method196();
                            for (int var150 = 0; var150 < var149; ++var150) {
                                var148.field1617[var150] = this.field297.method223(2);
                                int var151 = this.field297.method213((byte) 7);
                                if (var151 == 255) {
                                    var151 = this.field297.method199();
                                }
                                var148.field1623[var150] = var151;
                            }
                            for (int var152 = var149; var152 < var148.field1617.length; ++var152) {
                                var148.field1617[var152] = 0;
                                var148.field1623[var152] = 0;
                            }
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 24) {
                            this.field449 = false;
                            this.field320 = 1;
                            this.field353 = "";
                            this.field550 = true;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 133) {
                            String var153 = this.field297.method201();
                            int var154 = this.field297.method223(2);
                            class65.method577(var154).field1613 = var153;
                            int var10001 = this.field300[this.field463];
                            if (class65.method577(var154).field1622 == var10001) {
                                this.field472 = true;
                            }
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 156) {
                            int var155 = this.field297.method196();
                            int var156 = this.field297.method223(2);
                            class65 var157 = class65.method577(var156);
                            if (var157 != null && var157.field1594 == 0) {
                                if (var155 < 0) {
                                    var155 = 0;
                                }
                                if (var155 > var157.field1604 - var157.field1618) {
                                    var155 = var157.field1604 - var157.field1618;
                                }
                                var157.field1598 = var155;
                            }
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 2) {
                            this.field316 = 0;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 68) {
                            this.method155(591, this.field297, this.field595);
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 96) {
                            int var158 = this.field297.method196();
                            int var159 = this.field297.method194();
                            int var160 = this.field297.method196();
                            if (var160 == 65535) {
                                if (this.field414 < 50) {
                                    this.field207[this.field414] = (short) var158;
                                    this.field321[this.field414] = var159;
                                    this.field340[this.field414] = 0;
                                    ++this.field414;
                                }
                            } else if (this.field413 && !field293 && this.field414 < 50) {
                                this.field207[this.field414] = var158;
                                this.field321[this.field414] = var159;
                                this.field340[this.field414] = class4.field19[var158] + var160;
                                ++this.field414;
                            }
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 185) {
                            int var161 = this.field297.method223(2);
                            int var162 = this.field297.method223(2);
                            class65.method577(var161).field1619 = 2;
                            class65.method577(var161).field1620 = var162;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 95) {
                            int var163 = this.field297.method221(-474);
                            class65.method577(var163).field1619 = 3;
                            if (field394.field1055 == null) {
                                class65.method577(var163).field1620 = (field394.field1082[11] << 5) + (field394.field1082[8] << 10) + (field394.field1082[0] << 15) + (field394.field1080[0] << 25) + (field394.field1080[4] << 20) + field394.field1082[1];
                            } else {
                                class65.method577(var163).field1620 = (int) (field394.field1055.field1467 + 305419896L);
                            }
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 165) {
                            int var164 = this.field297.method223(2);
                            int var165 = this.field297.method223(2);
                            int var166 = this.field297.method222(0);
                            class65.method577(var165).field1589 = (var164 << 16) + var166;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 25) {
                            int var167 = this.field297.method194();
                            int var168 = this.field297.method194();
                            int var169 = this.field297.method194();
                            int var170 = this.field297.method194();
                            this.field555[var167] = true;
                            this.field257[var167] = var168;
                            this.field343[var167] = var169;
                            this.field274[var167] = var170;
                            this.field488[var167] = 0;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 240) {
                            int var171 = this.field297.method223(2);
                            int var172 = this.field297.method196();
                            if (this.field624 != -1) {
                                this.method161(this.field624, (byte) 45);
                                this.field624 = -1;
                                this.field550 = true;
                            }
                            if (this.field614 != -1) {
                                this.method161(this.field614, (byte) 45);
                                this.field614 = -1;
                                this.field593 = true;
                            }
                            if (this.field604 != -1) {
                                this.method161(this.field604, (byte) 45);
                                this.field604 = -1;
                            }
                            if (this.field466 != var171) {
                                this.method161(this.field466, (byte) 45);
                                this.field466 = var171;
                            }
                            if (this.field588 != var172) {
                                this.method161(this.field588, (byte) 45);
                                this.field588 = var172;
                            }
                            if (this.field320 != 0) {
                                this.field320 = 0;
                                this.field550 = true;
                            }
                            this.field472 = true;
                            this.field208 = true;
                            this.field481 = false;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 226) {
                            int var173 = this.field297.method221(-474);
                            this.method119((byte) -11, var173);
                            if (this.field588 != -1) {
                                this.method161(this.field588, (byte) 45);
                                this.field588 = -1;
                                this.field472 = true;
                                this.field208 = true;
                            }
                            if (this.field614 != -1) {
                                this.method161(this.field614, (byte) 45);
                                this.field614 = -1;
                                this.field593 = true;
                            }
                            if (this.field604 != -1) {
                                this.method161(this.field604, (byte) 45);
                                this.field604 = -1;
                            }
                            if (this.field466 != -1) {
                                this.method161(this.field466, (byte) 45);
                                this.field466 = -1;
                            }
                            if (this.field624 != var173) {
                                this.method161(this.field624, (byte) 45);
                                this.field624 = var173;
                            }
                            this.field481 = false;
                            this.field550 = true;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 18) {
                            this.field515 = this.field297.method194();
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 219) {
                            for (int var174 = 0; var174 < this.field235.length; ++var174) {
                                if (this.field235[var174] != null) {
                                    this.field235[var174].field1300 = -1;
                                }
                            }
                            for (int var175 = 0; var175 < this.field153.length; ++var175) {
                                if (this.field153[var175] != null) {
                                    this.field153[var175].field1300 = -1;
                                }
                            }
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 13) {
                            int var176 = this.field297.method196();
                            int var177 = this.field297.method222(0);
                            int var178 = this.field297.method223(2);
                            int var179 = this.field297.method222(0);
                            class65.method577(var177).field1577 = var178;
                            class65.method577(var177).field1578 = var179;
                            class65.method577(var177).field1576 = var176;
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 241) {
                            if (this.field463 == 12) {
                                this.field472 = true;
                            }
                            this.field387 = this.field297.method197();
                            this.field596 = -1;
                            return true;
                        }
                        if (this.field596 == 137) {
                            this.field283 = true;
                            this.field540 = this.field297.method194();
                            this.field541 = this.field297.method194();
                            this.field542 = this.field297.method196();
                            this.field543 = this.field297.method194();
                            this.field544 = this.field297.method194();
                            if (this.field544 >= 100) {
                                int var180 = this.field540 * 128 + 64;
                                int var181 = this.field541 * 128 + 64;
                                int var182 = this.method60(var181, 0, this.field510, var180) - this.field542;
                                int var183 = var180 - this.field188;
                                int var184 = var182 - this.field189;
                                int var185 = var181 - this.field190;
                                int var186 = (int) Math.sqrt((double) (var183 * var183 + var185 * var185));
                                this.field191 = (int) (Math.atan2((double) var184, (double) var186) * 325.949D) & 2047;
                                this.field192 = (int) (Math.atan2((double) var183, (double) var185) * -325.949D) & 2047;
                                if (this.field191 < 128) {
                                    this.field191 = 128;
                                }
                                if (this.field191 > 383) {
                                    this.field191 = 383;
                                }
                            }
                            this.field596 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field596 + "," + this.field595 + " - " + this.field359 + "," + this.field360);
                        this.method56(24238);
                        return true;
                    }
                    this.field538 = this.field297.method212(false);
                    this.field537 = this.field297.method214(false);
                    while (this.field297.field646 < this.field595) {
                        int var137 = this.field297.method194();
                        this.method111(var137, this.field297, 751);
                    }
                    this.field596 = -1;
                    return true;
                }
                int var85 = this.field384;
                int var86 = this.field385;
                if (this.field596 == 221) {
                    var85 = this.field297.method222(0);
                    var86 = this.field297.method222(0);
                    this.field498 = false;
                }
                if (this.field596 == 141) {
                    this.field297.method204((byte) -36);
                    int var87 = 0;
                    while (true) {
                        if (var87 >= 4) {
                            this.field297.method206(502);
                            var85 = this.field297.method223(2);
                            var86 = this.field297.method223(2);
                            this.field498 = true;
                            break;
                        }
                        for (int var88 = 0; var88 < 13; ++var88) {
                            for (int var89 = 0; var89 < 13; ++var89) {
                                int var90 = this.field297.method205(1, -359);
                                if (var90 == 1) {
                                    this.field270[var87][var88][var89] = this.field297.method205(26, -359);
                                } else {
                                    this.field270[var87][var88][var89] = -1;
                                }
                            }
                        }
                        ++var87;
                    }
                }
                if (this.field384 == var85 && this.field385 == var86 && this.field333 == 2) {
                    this.field596 = -1;
                    return true;
                }
                this.field384 = var85;
                this.field385 = var86;
                this.field455 = (this.field384 - 6) * 8;
                this.field456 = (this.field385 - 6) * 8;
                this.field432 = false;
                if ((this.field384 / 8 == 48 || this.field384 / 8 == 49) && this.field385 / 8 == 48) {
                    this.field432 = true;
                }
                if (this.field384 / 8 == 48 && this.field385 / 8 == 148) {
                    this.field432 = true;
                }
                this.field333 = 1;
                this.field523 = System.currentTimeMillis();
                this.method57((String) null, 1912, "Loading - please wait.");
                if (this.field596 == 221) {
                    int var91 = 0;
                    int var92 = (this.field384 - 6) / 8;
                    label1212: while (true) {
                        if (var92 > (this.field384 + 6) / 8) {
                            this.field151 = new byte[var91][];
                            this.field323 = new byte[var91][];
                            this.field519 = new int[var91];
                            this.field520 = new int[var91];
                            this.field521 = new int[var91];
                            int var94 = 0;
                            int var95 = (this.field384 - 6) / 8;
                            while (true) {
                                if (var95 > (this.field384 + 6) / 8) {
                                    break label1212;
                                }
                                for (int var96 = (this.field385 - 6) / 8; var96 <= (this.field385 + 6) / 8; ++var96) {
                                    this.field519[var94] = (var95 << 8) + var96;
                                    if (this.field432 && (var96 == 49 || var96 == 149 || var96 == 147 || var95 == 50 || var95 == 49 && var96 == 47)) {
                                        this.field520[var94] = -1;
                                        this.field521[var94] = -1;
                                        ++var94;
                                    } else {
                                        int var97 = this.field520[var94] = this.field612.method538(-679, var95, 0, var96);
                                        if (var97 != -1) {
                                            this.field612.method540(3, var97);
                                        }
                                        int var98 = this.field521[var94] = this.field612.method538(-679, var95, 1, var96);
                                        if (var98 != -1) {
                                            this.field612.method540(3, var98);
                                        }
                                        ++var94;
                                    }
                                }
                                ++var95;
                            }
                        }
                        for (int var93 = (this.field385 - 6) / 8; var93 <= (this.field385 + 6) / 8; ++var93) {
                            ++var91;
                        }
                        ++var92;
                    }
                }
                if (this.field596 == 141) {
                    int var99 = 0;
                    int[] var100 = new int[676];
                    int var101 = 0;
                    label1173: while (true) {
                        if (var101 >= 4) {
                            this.field151 = new byte[var99][];
                            this.field323 = new byte[var99][];
                            this.field519 = new int[var99];
                            this.field520 = new int[var99];
                            this.field521 = new int[var99];
                            int var109 = 0;
                            while (true) {
                                if (var109 >= var99) {
                                    break label1173;
                                }
                                int var110 = this.field519[var109] = var100[var109];
                                int var111 = var110 >> 8 & 255;
                                int var112 = var110 & 255;
                                int var113 = this.field520[var109] = this.field612.method538(-679, var111, 0, var112);
                                if (var113 != -1) {
                                    this.field612.method540(3, var113);
                                }
                                int var114 = this.field521[var109] = this.field612.method538(-679, var111, 1, var112);
                                if (var114 != -1) {
                                    this.field612.method540(3, var114);
                                }
                                ++var109;
                            }
                        }
                        for (int var102 = 0; var102 < 13; ++var102) {
                            for (int var103 = 0; var103 < 13; ++var103) {
                                int var104 = this.field270[var101][var102][var103];
                                if (var104 != -1) {
                                    int var105 = var104 >> 14 & 1023;
                                    int var106 = var104 >> 3 & 2047;
                                    int var107 = (var105 / 8 << 8) + var106 / 8;
                                    for (int var108 = 0; var108 < var99; ++var108) {
                                        if (var100[var108] == var107) {
                                            var107 = -1;
                                            break;
                                        }
                                    }
                                    if (var107 != -1) {
                                        var100[var99++] = var107;
                                    }
                                }
                            }
                        }
                        ++var101;
                    }
                }
                int var115 = this.field455 - this.field457;
                int var116 = this.field456 - this.field458;
                this.field457 = this.field455;
                this.field458 = this.field456;
                for (int var117 = 0; var117 < 16384; ++var117) {
                    class25 var118 = this.field153[var117];
                    if (var118 != null) {
                        for (int var119 = 0; var119 < 10; ++var119) {
                            var118.field1292[var119] -= var115;
                            var118.field1293[var119] -= var116;
                        }
                        var118.field1305 -= var115 * 128;
                        var118.field1306 -= var116 * 128;
                    }
                }
                for (int var120 = 0; var120 < this.field233; ++var120) {
                    class36 var121 = this.field235[var120];
                    if (var121 != null) {
                        for (int var122 = 0; var122 < 10; ++var122) {
                            var121.field1292[var122] -= var115;
                            var121.field1293[var122] -= var116;
                        }
                        var121.field1305 -= var115 * 128;
                        var121.field1306 -= var116 * 128;
                    }
                }
                this.field339 = true;
                byte var123 = 0;
                byte var124 = 104;
                byte var125 = 1;
                if (var115 < 0) {
                    var123 = 103;
                    var124 = -1;
                    var125 = -1;
                }
                byte var126 = 0;
                byte var127 = 104;
                byte var128 = 1;
                if (var116 < 0) {
                    var126 = 103;
                    var127 = -1;
                    var128 = -1;
                }
                for (int var129 = var123; var124 != var129; var129 += var125) {
                    for (int var130 = var126; var127 != var130; var130 += var128) {
                        int var131 = var115 + var129;
                        int var132 = var116 + var130;
                        for (int var133 = 0; var133 < 4; ++var133) {
                            if (var131 >= 0 && var132 >= 0 && var131 < 104 && var132 < 104) {
                                this.field623[var133][var129][var130] = this.field623[var133][var131][var132];
                            } else {
                                this.field623[var133][var129][var130] = null;
                            }
                        }
                    }
                }
                for (class23 var134 = (class23) this.field450.method567(); var134 != null; var134 = (class23) this.field450.method569(false)) {
                    var134.field878 -= var115;
                    var134.field879 -= var116;
                    if (var134.field878 < 0 || var134.field879 < 0 || var134.field878 >= 104 || var134.field879 >= 104) {
                        var134.method1();
                    }
                }
                if (this.field316 != 0) {
                    this.field316 -= var115;
                    this.field317 -= var116;
                }
                this.field283 = false;
                this.field596 = -1;
                return true;
            } catch (IOException var191) {
                this.method142(545);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field596 + "," + this.field359 + "," + this.field360 + " - " + this.field595 + "," + (field394.field1292[0] + this.field455) + "," + (field394.field1293[0] + this.field456) + " - ";
                for (int var189 = 0; var189 < this.field595 && var189 < 50; ++var189) {
                    var188 = var188 + this.field297.field645[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method56(24238);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMDBQGDOL;LCMGGUSPR;ZI)V")
    private final void method79(int arg0, class36 arg1, class10 arg2, boolean arg3, int arg4) {
        if (arg3) {
            if ((arg0 & 4) != 0) {
                int var6 = arg2.method214(false);
                int var7 = arg2.method214(false);
                arg1.method441(field471, (byte) 5, var7, var6);
                arg1.field1313 = field471 + 300;
                arg1.field1314 = arg2.method213((byte) 7);
                arg1.field1315 = arg2.method213((byte) 7);
            }
            if ((arg0 & 8) != 0) {
                arg1.field1295 = arg2.method196();
                if (arg1.field1295 == 65535) {
                    arg1.field1295 = -1;
                }
            }
            if ((arg0 & 64) != 0) {
                int var8 = arg2.method214(false);
                byte[] var9 = new byte[var8];
                class10 var10 = new class10(var9, field386);
                arg2.method230(0, var8, var9, 137);
                this.field240[arg4] = var10;
                arg1.method358(29328, var10);
            }
            if ((arg0 & 512) != 0) {
                arg1.field1273 = arg2.method221(-474);
                int var11 = arg2.method228(field390);
                arg1.field1277 = var11 >> 16;
                arg1.field1276 = (var11 & 65535) + field471;
                arg1.field1274 = 0;
                arg1.field1275 = 0;
                if (arg1.field1276 > field471) {
                    arg1.field1274 = -1;
                }
                if (arg1.field1273 == 65535) {
                    arg1.field1273 = -1;
                }
            }
            if ((arg0 & 2) != 0) {
                arg1.field1317 = arg2.method223(2);
                arg1.field1318 = arg2.method196();
            }
            if ((arg0 & 1024) != 0) {
                arg1.field1279 = arg2.method194();
                arg1.field1281 = arg2.method194();
                arg1.field1280 = arg2.method213((byte) 7);
                arg1.field1282 = arg2.method213((byte) 7);
                arg1.field1283 = arg2.method222(0) + field471;
                arg1.field1284 = arg2.method222(0) + field471;
                arg1.field1285 = arg2.method213((byte) 7);
                arg1.method443(695);
            }
            if ((arg0 & 128) != 0) {
                int var12 = arg2.method223(2);
                int var13 = arg2.method212(false);
                int var14 = arg2.method212(false);
                int var15 = arg2.field646;
                if (arg1.field1081 != null && arg1.field1059) {
                    long var16 = class71.method597(arg1.field1081);
                    boolean var18 = false;
                    if (var13 <= 1) {
                        for (int var19 = 0; var19 < this.field611; ++var19) {
                            if (this.field473[var19] == var16) {
                                var18 = true;
                                break;
                            }
                        }
                    }
                    if (!var18 && this.field528 == 0) {
                        try {
                            this.field152.field646 = 0;
                            arg2.method203(956, 0, this.field152.field645, var14);
                            this.field152.field646 = 0;
                            String var20 = class51.method444(var14, this.field152, this.field331);
                            String var21 = class37.method369(var20, -443);
                            arg1.field1311 = var21;
                            arg1.field1267 = var12 >> 8;
                            arg1.field1296 = var12 & 255;
                            arg1.field1272 = 150;
                            if (var13 != 2 && var13 != 3) {
                                if (var13 == 1) {
                                    this.method114("@cr1@" + arg1.field1081, var21, 1, 0);
                                } else {
                                    this.method114(arg1.field1081, var21, 2, 0);
                                }
                            } else {
                                this.method114("@cr2@" + arg1.field1081, var21, 1, 0);
                            }
                        } catch (Exception var28) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg2.field646 = var14 + var15;
            }
            if ((arg0 & 16) != 0) {
                arg1.field1311 = arg2.method201();
                if (arg1.field1311.charAt(0) == '~') {
                    arg1.field1311 = arg1.field1311.substring(1);
                    this.method114(arg1.field1081, arg1.field1311, 2, 0);
                } else if (field394 == arg1) {
                    this.method114(arg1.field1081, arg1.field1311, 2, 0);
                }
                arg1.field1267 = 0;
                arg1.field1296 = 0;
                arg1.field1272 = 150;
            }
            if ((arg0 & 32) != 0) {
                int var23 = arg2.method221(-474);
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = arg2.method213((byte) 7);
                if (arg1.field1300 == var23 && var23 != -1) {
                    int var25 = class67.field1666[var23].field1680;
                    if (var25 == 1) {
                        arg1.field1301 = 0;
                        arg1.field1302 = 0;
                        arg1.field1303 = var24;
                        arg1.field1304 = 0;
                    }
                    if (var25 == 2) {
                        arg1.field1304 = 0;
                    }
                } else if (var23 == -1 || arg1.field1300 == -1 || class67.field1666[var23].field1674 >= class67.field1666[arg1.field1300].field1674) {
                    arg1.field1300 = var23;
                    arg1.field1301 = 0;
                    arg1.field1302 = 0;
                    arg1.field1303 = var24;
                    arg1.field1304 = 0;
                    arg1.field1321 = arg1.field1309;
                }
            }
            if ((arg0 & 256) != 0) {
                int var26 = arg2.method212(false);
                int var27 = arg2.method212(false);
                arg1.method441(field471, (byte) 5, var27, var26);
                arg1.field1313 = field471 + 300;
                arg1.field1314 = arg2.method214(false);
                arg1.field1315 = arg2.method194();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method80(int arg0) {
        this.field138 = new class40(this.field229, "titlebox", 0);
        this.field139 = new class40(this.field229, "titlebutton", 0);
        this.field525 = new class40[12];
        if (arg0 != -19609) {
            this.field596 = this.field297.method194();
        }
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field525[var2] = new class40(this.field229, "runes", var2);
        }
        this.field609 = new class56(128, 265);
        this.field610 = new class56(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field609.field1435[var3] = this.field420.field923[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field610.field1435[var4] = this.field421.field923[var4];
        }
        this.field490 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field490[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field490[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field490[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field490[var8 + 192] = 16777215;
        }
        this.field491 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field491[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field491[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field491[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field491[var12 + 192] = 16777215;
        }
        this.field492 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field492[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field492[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field492[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field492[var16 + 192] = 16777215;
        }
        this.field489 = new int[256];
        this.field261 = new int[32768];
        this.field262 = new int[32768];
        this.method96((class40) null, -37776);
        this.field356 = new int[32768];
        this.field357 = new int[32768];
        this.method149("Connecting to fileserver", 10, false);
        if (!this.field511) {
            this.field512 = true;
            this.field511 = true;
            this.method97(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
    public final boolean method81(int arg0, int arg1, byte arg2) {
        if (arg2 != 0) {
            this.field601 = this.field470.method437();
        }
        boolean var4 = false;
        class65 var5 = class65.method577(arg1);
        for (int var6 = 0; var6 < var5.field1629.length && var5.field1629[var6] != -1; ++var6) {
            class65 var7 = class65.method577(var5.field1629[var6]);
            if (var7.field1594 == 0) {
                var4 |= this.method81(arg0, var7.field1640, (byte) 0);
            }
            if (var7.field1594 == 6 && (var7.field1650 != -1 || var7.field1651 != -1)) {
                boolean var8 = this.method50(var7, false);
                int var9;
                if (var8) {
                    var9 = var7.field1651;
                } else {
                    var9 = var7.field1650;
                }
                if (var9 != -1) {
                    class67 var10 = class67.field1666[var9];
                    var7.field1648 += arg0;
                    while (var7.field1648 > var10.method583(var7.field1597, (byte) 9)) {
                        var7.field1648 -= var10.method583(var7.field1597, (byte) 9) + 1;
                        ++var7.field1597;
                        if (var7.field1597 >= var10.field1667) {
                            var7.field1597 -= var10.field1671;
                            if (var7.field1597 < 0 || var7.field1597 >= var10.field1667) {
                                var7.field1597 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1594 == 6 && var7.field1589 != 0) {
                int var11 = var7.field1589 >> 16;
                int var12 = var7.field1589 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field1577 = var7.field1577 + var13 & 2047;
                var7.field1578 = var7.field1578 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LWJQTPVDG;I)Z")
    public final boolean method82(class65 arg0, int arg1) {
        if (arg1 < 3 || arg1 > 3) {
            this.method176();
        }
        int var3 = arg0.field1585;
        if (this.field590 == 2) {
            if (var3 == 201) {
                this.field550 = true;
                this.field320 = 0;
                this.field449 = true;
                this.field337 = "";
                this.field338 = 1;
                this.field330 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field550 = true;
                this.field320 = 0;
                this.field449 = true;
                this.field337 = "";
                this.field338 = 2;
                this.field330 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field599 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field550 = true;
                this.field320 = 0;
                this.field449 = true;
                this.field337 = "";
                this.field338 = 4;
                this.field330 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field550 = true;
                this.field320 = 0;
                this.field449 = true;
                this.field337 = "";
                this.field338 = 5;
                this.field330 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field395[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class9.field113 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class9.field113) {
                                var6 = 0;
                            }
                        }
                        if (!class9.field114[var6].field120 && class9.field114[var6].field115 == var4 + (this.field620 ? 0 : 7)) {
                            this.field395[var4] = var6;
                            this.field369 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field567[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field203[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field203[var7].length) {
                        var9 = 0;
                    }
                }
                this.field567[var7] = var9;
                this.field369 = true;
            }
            if (var3 == 324 && !this.field620) {
                this.field620 = true;
                this.method134((byte) 8);
            }
            if (var3 == 325 && this.field620) {
                this.field620 = false;
                this.method134((byte) 8);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field130 = !this.field130;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method93(this.field136);
                    if (this.field441.length() > 0) {
                        this.field336.method183(207, this.field230);
                        this.field336.method190(5, class71.method597(this.field441));
                        this.field336.method184(var3 - 601);
                        this.field336.method184(this.field130 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field336.method183(124, this.field230);
                this.field336.method184(this.field620 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field336.method184(this.field395[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field336.method184(this.field567[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 == 1) {
            if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
                if (field293 && this.field510 != arg7) {
                    return;
                }
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = false;
                boolean var12 = false;
                if (arg4 == 0) {
                    var9 = this.field591.method474(arg7, arg5, arg6);
                }
                if (arg4 == 1) {
                    var9 = this.field591.method475(0, arg5, arg7, arg6);
                }
                if (arg4 == 2) {
                    var9 = this.field591.method476(arg7, arg5, arg6);
                }
                if (arg4 == 3) {
                    var9 = this.field591.method477(arg7, arg5, arg6);
                }
                if (var9 != 0) {
                    int var13 = this.field591.method478(arg7, arg5, arg6, var9);
                    int var14 = var9 >> 14 & 32767;
                    int var15 = var13 & 31;
                    int var16 = var13 >> 6;
                    if (arg4 == 0) {
                        this.field591.method465(true, arg5, arg7, arg6);
                        class70 var17 = class70.method596(var14);
                        if (var17.field1713) {
                            this.field328[arg7].method557(var15, var17.field1703, arg6, var16, true, arg5);
                        }
                    }
                    if (arg4 == 1) {
                        this.field591.method466(arg5, arg6, arg7, (byte) -117);
                    }
                    if (arg4 == 2) {
                        this.field591.method467(757, arg7, arg6, arg5);
                        class70 var18 = class70.method596(var14);
                        if (var18.field1724 + arg5 > 103 || var18.field1724 + arg6 > 103 || var18.field1735 + arg5 > 103 || var18.field1735 + arg6 > 103) {
                            return;
                        }
                        if (var18.field1713) {
                            this.field328[arg7].method558(4, arg5, arg6, var16, var18.field1703, var18.field1735, var18.field1724);
                        }
                    }
                    if (arg4 == 3) {
                        this.field591.method468(arg5, arg7, 6, arg6);
                        class70 var19 = class70.method596(var14);
                        if (var19.field1713 && var19.field1730) {
                            this.field328[arg7].method560(arg6, arg5, false);
                        }
                    }
                }
                if (arg0 >= 0) {
                    int var20 = arg7;
                    if (arg7 < 3 && (this.field198[1][arg5][arg6] & 2) == 2) {
                        var20 = arg7 + 1;
                    }
                    class27.method306((byte) 2, arg6, this.field499, var20, this.field591, arg5, arg3, this.field328[arg7], arg7, arg0, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method84(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field501 = -132;
        }
        try {
            int var3 = field394.field1305 + this.field267;
            int var4 = field394.field1306 + this.field517;
            if (this.field502 - var3 < -500 || this.field502 - var3 > 500 || this.field503 - var4 < -500 || this.field503 - var4 > 500) {
                this.field502 = var3;
                this.field503 = var4;
            }
            if (this.field502 != var3) {
                this.field502 += (var3 - this.field502) / 16;
            }
            if (this.field503 != var4) {
                this.field503 += (var4 - this.field503) / 16;
            }
            if (super.field1137[1] == 1) {
                this.field405 += (-24 - this.field405) / 2;
            } else if (super.field1137[2] == 1) {
                this.field405 += (24 - this.field405) / 2;
            } else {
                this.field405 /= 2;
            }
            if (super.field1137[3] == 1) {
                this.field406 += (12 - this.field406) / 2;
            } else if (super.field1137[4] == 1) {
                this.field406 += (-12 - this.field406) / 2;
            } else {
                this.field406 /= 2;
            }
            this.field404 = this.field405 / 2 + this.field404 & 2047;
            this.field403 += this.field406 / 2;
            if (this.field403 < 128) {
                this.field403 = 128;
            }
            if (this.field403 > 383) {
                this.field403 = 383;
            }
            int var5 = this.field502 >> 7;
            int var6 = this.field503 >> 7;
            int var7 = this.method60(this.field503, 0, this.field510, this.field502);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field510;
                        if (var11 < 3 && (this.field198[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field499[var11][var9][var10];
                        if (var12 > var8) {
                            var8 = var12;
                        }
                    }
                }
            }
            int var13 = var8 * 192;
            if (var13 > 98048) {
                var13 = 98048;
            }
            if (var13 < 32768) {
                var13 = 32768;
            }
            if (var13 > this.field127) {
                this.field127 += (var13 - this.field127) / 24;
            } else if (var13 < this.field127) {
                this.field127 += (var13 - this.field127) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field394.field1305 + "," + field394.field1306 + "," + this.field502 + "," + this.field503 + "," + this.field384 + "," + this.field385 + "," + this.field455 + "," + this.field456);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method85(byte arg0) {
        int var2 = this.field222.method234("Choose Option", (byte) -86);
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            this.field596 = this.field297.method194();
        }
        for (int var4 = 0; var4 < this.field407; ++var4) {
            int var12 = this.field222.method234(this.field122[var4], (byte) -86);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        var2 += 8;
        int var5 = this.field407 * 15 + 21;
        if (super.field1134 > 4 && super.field1135 > 4 && super.field1134 < 516 && super.field1135 < 338) {
            int var6 = super.field1134 - 4 - var2 / 2;
            if (var2 + var6 > 512) {
                var6 = 512 - var2;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field1135 - 4;
            if (var5 + var7 > 334) {
                var7 = 334 - var5;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            this.field439 = true;
            this.field379 = 0;
            this.field380 = var6;
            this.field381 = var7;
            this.field382 = var2;
            this.field383 = this.field407 * 15 + 22;
        }
        if (super.field1134 > 553 && super.field1135 > 205 && super.field1134 < 743 && super.field1135 < 466) {
            int var8 = super.field1134 - 553 - var2 / 2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var2 + var8 > 190) {
                var8 = 190 - var2;
            }
            int var9 = super.field1135 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var5 + var9 > 261) {
                var9 = 261 - var5;
            }
            this.field439 = true;
            this.field379 = 1;
            this.field380 = var8;
            this.field381 = var9;
            this.field382 = var2;
            this.field383 = this.field407 * 15 + 22;
        }
        if (super.field1134 > 17 && super.field1135 > 357 && super.field1134 < 496 && super.field1135 < 453) {
            int var10 = super.field1134 - 17 - var2 / 2;
            if (var10 < 0) {
                var10 = 0;
            } else if (var2 + var10 > 479) {
                var10 = 479 - var2;
            }
            int var11 = super.field1135 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var5 + var11 > 96) {
                var11 = 96 - var5;
            }
            this.field439 = true;
            this.field379 = 2;
            this.field380 = var10;
            this.field381 = var11;
            this.field382 = var2;
            this.field383 = this.field407 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILTPIBHECB;II)V")
    public final void method86(int arg0, class56 arg1, int arg2, int arg3) {
        int var5 = arg0 * arg0 + arg3 * arg3;
        if (arg2 != -42058) {
            this.field187 = this.field470.method437();
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field404 + this.field326 & 2047;
            int var7 = class16.field777[var6];
            int var8 = class16.field778[var6];
            int var9 = var7 * 256 / (this.field467 + 256);
            int var10 = var8 * 256 / (this.field467 + 256);
            int var11 = arg0 * var9 + arg3 * var10 >> 16;
            int var12 = arg0 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field174.method512(this.field606, var13, 20, 256, 15, 83 - var16 - 20, 20, var15 + 94 + 4 - 10, 15);
        } else {
            this.method157(arg3, arg0, arg1, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method87(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field611; ++var4) {
                if (this.field473[var4] == arg1) {
                    --this.field611;
                    this.field472 = true;
                    for (int var5 = var4; var5 < this.field611; ++var5) {
                        this.field473[var5] = this.field473[var5 + 1];
                    }
                    this.field336.method183(151, this.field230);
                    this.field336.method190(5, arg1);
                    break;
                }
            }
            int var6 = 16 / arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BZ)V")
    public final void method88(int arg0, byte[] arg1, boolean arg2) {
        int var4 = 82 / arg0;
        if (this.field264) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field591.method474(arg5, arg2, arg0);
        if (var7 != 0) {
            int var8 = this.field591.method478(arg5, arg2, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg1;
            }
            int[] var12 = this.field318.field1435;
            int var13 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class70 var15 = class70.method596(var14);
            if (var15.field1739 != -1) {
                class40 var16 = this.field255[var15.field1739];
                if (var16 != null) {
                    int var17 = (var15.field1724 * 4 - var16.field1173) / 2;
                    int var18 = (var15.field1735 * 4 - var16.field1174) / 2;
                    var16.method424(arg2 * 4 + 48 + var17, this.field549, (104 - arg0 - var15.field1735) * 4 + 48 + var18);
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
        int var19 = this.field591.method476(arg5, arg2, arg0);
        if (var19 != 0) {
            int var20 = this.field591.method478(arg5, arg2, arg0, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class70 var24 = class70.method596(var23);
            if (var24.field1739 != -1) {
                class40 var25 = this.field255[var24.field1739];
                if (var25 != null) {
                    int var26 = (var24.field1724 * 4 - var25.field1173) / 2;
                    int var27 = (var24.field1735 * 4 - var25.field1174) / 2;
                    var25.method424(arg2 * 4 + 48 + var26, this.field549, (104 - arg0 - var24.field1735) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field318.field1435;
                int var30 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
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
        int var31 = this.field591.method477(arg5, arg2, arg0);
        if (arg3 != 6) {
            this.field282 = !this.field282;
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class70 var33 = class70.method596(var32);
            if (var33.field1739 != -1) {
                class40 var34 = this.field255[var33.field1739];
                if (var34 != null) {
                    int var35 = (var33.field1724 * 4 - var34.field1173) / 2;
                    int var36 = (var33.field1735 * 4 - var34.field1174) / 2;
                    var34.method424(arg2 * 4 + 48 + var35, this.field549, (104 - arg0 - var33.field1735) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method90(boolean arg0) {
        if (this.field355 != 0) {
            class11 var2 = this.field221;
            int var3 = 0;
            if (arg0) {
                this.field623 = null;
            }
            if (this.field493 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field454[var4] != null) {
                    int var5 = this.field452[var4];
                    String var6 = this.field453[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field557 == 0 || this.field557 == 1 && this.method118(var6, 0))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method236(var9, false, 0, "From", var8);
                        var2.method236(var9, false, 65535, "From", var8 - 1);
                        int var10 = var9 + var2.method234("From ", (byte) -86);
                        if (var7 == 1) {
                            this.field483[0].method424(var10, this.field549, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field483[1].method424(var10, this.field549, var8 - 12);
                            var10 += 14;
                        }
                        var2.method236(var10, false, 0, var6 + ": " + this.field454[var4], var8);
                        var2.method236(var10, false, 65535, var6 + ": " + this.field454[var4], var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field557 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method236(4, false, 0, this.field454[var4], var11);
                        var2.method236(4, false, 65535, this.field454[var4], var11 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field557 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method236(4, false, 0, "To " + var6 + ": " + this.field454[var4], var12);
                        var2.method236(4, false, 65535, "To " + var6 + ": " + this.field454[var4], var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)Ljava/lang/String;")
    private static final String method91(byte arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 != 6) {
            field545 = true;
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

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1122 != null) {
                    return new URL("http://127.0.0.1:" + (field291 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public final boolean method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field402[var15][var35] = 0;
                this.field566[var15][var35] = 99999999;
            }
        }
        if (arg4 != -20821) {
            this.field608 = 366;
        }
        int var16 = arg9;
        int var17 = arg0;
        this.field402[arg9][arg0] = 99;
        this.field566[arg9][arg0] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field529[var18] = arg9;
        int var36 = var18 + 1;
        this.field530[var18] = arg0;
        boolean var20 = false;
        int var21 = this.field529.length;
        int[][] var22 = this.field328[this.field510].field1558;
        while (var36 != var19) {
            var16 = this.field529[var19];
            var17 = this.field530[var19];
            var19 = (var19 + 1) % var21;
            if (arg1 == var16 && arg6 == var17) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && this.field328[this.field510].method561(var17, var16, arg6, arg10 - 1, arg7, 5, arg1)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && this.field328[this.field510].method562(true, arg10 - 1, arg7, arg6, var16, var17, arg1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg3 != 0 && this.field328[this.field510].method563(arg1, arg3, var16, arg6, arg5, 1, var17, arg8)) {
                var20 = true;
                break;
            }
            int var34 = this.field566[var16][var17] + 1;
            if (var16 > 0 && this.field402[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field529[var36] = var16 - 1;
                this.field530[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field402[var16 - 1][var17] = 2;
                this.field566[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field402[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field529[var36] = var16 + 1;
                this.field530[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field402[var16 + 1][var17] = 8;
                this.field566[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field402[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field529[var36] = var16;
                this.field530[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field402[var16][var17 - 1] = 1;
                this.field566[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field402[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field529[var36] = var16;
                this.field530[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field402[var16][var17 + 1] = 4;
                this.field566[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field402[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field529[var36] = var16 - 1;
                this.field530[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field402[var16 - 1][var17 - 1] = 3;
                this.field566[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field402[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field529[var36] = var16 + 1;
                this.field530[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field402[var16 + 1][var17 - 1] = 9;
                this.field566[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field402[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field529[var36] = var16 - 1;
                this.field530[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field402[var16 - 1][var17 + 1] = 6;
                this.field566[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field402[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field529[var36] = var16 + 1;
                this.field530[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field402[var16 + 1][var17 + 1] = 12;
                this.field566[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field477 = 0;
        if (!var20) {
            if (arg11) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg1 - var24; var25 <= arg1 + var24; ++var25) {
                        for (int var26 = arg6 - var24; var26 <= arg6 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field566[var25][var26] < var23) {
                                var23 = this.field566[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field477 = 1;
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
        int var29 = var28 = this.field402[var16][var17];
        while (arg9 != var16 || arg0 != var17) {
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
            var29 = this.field402[var16][var17];
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
            int var31 = this.field529[var37];
            int var32 = this.field530[var37];
            if (arg2 == 0) {
                this.field336.method183(184, this.field230);
                this.field336.method184(var30 + var30 + 3);
            }
            if (arg2 == 1) {
                this.field336.method183(62, this.field230);
                this.field336.method184(var30 + var30 + 3 + 14);
            }
            if (arg2 == 2) {
                this.field336.method183(146, this.field230);
                this.field336.method184(var30 + var30 + 3);
            }
            this.field336.method210(super.field1137[5] == 1 ? 1 : 0, this.field513);
            this.field336.method185(this.field456 + var32);
            this.field336.method218(this.field455 + var31, 0);
            this.field316 = this.field529[0];
            this.field317 = this.field530[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field336.method184(this.field529[var37] - var31);
                this.field336.method211(this.field530[var37] - var32, (byte) 51);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method93(byte arg0) {
        this.field336.method183(25, this.field230);
        if (arg0 != 9) {
            this.field608 = this.field470.method437();
        }
        if (this.field588 != -1) {
            this.method161(this.field588, (byte) 45);
            this.field588 = -1;
            this.field472 = true;
            this.field481 = false;
            this.field208 = true;
        }
        if (this.field624 != -1) {
            this.method161(this.field624, (byte) 45);
            this.field624 = -1;
            this.field550 = true;
            this.field481 = false;
        }
        if (this.field614 != -1) {
            this.method161(this.field614, (byte) 45);
            this.field614 = -1;
            this.field593 = true;
        }
        if (this.field604 != -1) {
            this.method161(this.field604, (byte) 45);
            this.field604 = -1;
        }
        if (this.field466 != -1) {
            this.method161(this.field466, (byte) 45);
            this.field466 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method94(int arg0) {
        if (arg0 < 0) {
            if (this.field181 == 0) {
                if (super.field1133 == 1) {
                    int var2 = super.field1134 - 25 - 550;
                    int var3 = super.field1135 - 5 - 4;
                    if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                        var2 -= 73;
                        var3 -= 75;
                        int var4 = this.field404 + this.field326 & 2047;
                        int var5 = class39.field1154[var4];
                        int var6 = class39.field1155[var4];
                        int var7 = (this.field467 + 256) * var5 >> 8;
                        int var8 = (this.field467 + 256) * var6 >> 8;
                        int var9 = var2 * var8 + var3 * var7 >> 11;
                        int var10 = var3 * var8 - var2 * var7 >> 11;
                        int var11 = field394.field1305 + var9 >> 7;
                        int var12 = field394.field1306 - var10 >> 7;
                        boolean var13 = this.method92(field394.field1293[0], var11, 1, 0, -20821, 0, var12, 0, 0, field394.field1292[0], 0, true);
                        if (var13) {
                            this.field336.method184(var2);
                            this.field336.method184(var3);
                            this.field336.method185(this.field404);
                            this.field336.method184(57);
                            this.field336.method184(this.field326);
                            this.field336.method184(this.field467);
                            this.field336.method184(89);
                            this.field336.method185(field394.field1305);
                            this.field336.method185(field394.field1306);
                            this.field336.method184(this.field477);
                            this.field336.method184(63);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(BI)V")
    public final void method95(byte arg0, int arg1) {
        if (arg0 == -105) {
            if (!field293) {
                for (int var3 = 0; var3 < this.field184.length; ++var3) {
                    int var4 = this.field184[var3];
                    if (class39.field1164[var4] >= arg1) {
                        class40 var5 = class39.field1158[var4];
                        int var6 = var5.field1174 * var5.field1173 - 1;
                        int var7 = this.field263 * var5.field1173 * 2;
                        byte[] var8 = var5.field1171;
                        byte[] var9 = this.field125;
                        for (int var10 = 0; var10 <= var6; ++var10) {
                            var9[var10] = var8[var10 - var7 & var6];
                        }
                        var5.field1171 = var9;
                        this.field125 = var8;
                        class39.method409(var4, this.field260);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LOCPHNIUN;I)V")
    public final void method96(class40 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field261.length; ++var4) {
            this.field261[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field261[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field262[var16] = (this.field261[var16 - 1] + this.field261[var16 + 1] + this.field261[var16 - 128] + this.field261[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field261;
            this.field261 = this.field262;
            this.field262 = var14;
        }
        if (arg1 != -37776) {
            this.field623 = null;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1174; ++var8) {
                for (int var9 = 0; var9 < arg0.field1173; ++var9) {
                    if (arg0.field1171[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1175;
                        int var11 = var8 + 16 + arg0.field1176;
                        int var12 = (var11 << 7) + var10;
                        this.field261[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method97(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method97(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILCMGGUSPR;)V")
    private final void method98(int arg0, int arg1, class10 arg2) {
        int var4 = 19 / arg0;
        for (int var5 = 0; var5 < this.field238; ++var5) {
            int var6 = this.field239[var5];
            class36 var7 = this.field235[var6];
            int var8 = arg2.method194();
            if ((var8 & 1) != 0) {
                var8 += arg2.method194() << 8;
            }
            this.method79(var8, var7, arg2, this.field399, var6);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method99(byte arg0) {
        if (arg0 != -113) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field528 = 0;
        int var3 = (field394.field1305 >> 7) + this.field455;
        int var4 = (field394.field1306 >> 7) + this.field456;
        if (var3 >= 3053 && var3 <= 3156 && var4 >= 3056 && var4 <= 3136) {
            this.field528 = 1;
        }
        if (var3 >= 3072 && var3 <= 3118 && var4 >= 9492 && var4 <= 9535) {
            this.field528 = 1;
        }
        if (this.field528 == 1 && var3 >= 3139 && var3 <= 3199 && var4 >= 3008 && var4 <= 3062) {
            this.field528 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method100(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field154; ++var3) {
            class25 var4 = this.field153[this.field155[var3]];
            int var5 = (this.field155[var3] << 14) + 536870912;
            if (var4 != null && var4.method302((byte) 38) && var4.field887.field1468 == arg0 && var4.field887.method519(true)) {
                int var6 = var4.field1305 >> 7;
                int var7 = var4.field1306 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1308 == 1 && (var4.field1305 & 127) == 64 && (var4.field1306 & 127) == 64) {
                        if (this.field225[var6][var7] == this.field148) {
                            continue;
                        }
                        this.field225[var6][var7] = this.field148;
                    }
                    if (!var4.field887.field1459) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field591.method459(9, var4, this.field510, var4.field1306, var4.field1319, var4.field1305, var4.field1307, var5, (var4.field1308 - 1) * 64 + 60, this.method60(var4.field1306, 0, this.field510, var4.field1305));
                }
            }
        }
        if (arg1 != -1170) {
            this.field596 = this.field297.method194();
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method101(int arg0) {
        byte[] var2 = this.field229.method545("title.dat", (byte[]) null);
        class56 var3 = new class56(var2, this);
        this.field420.method327((byte) 4);
        var3.method505(2, 0, 0);
        this.field421.method327((byte) 4);
        var3.method505(2, 0, -637);
        this.field417.method327((byte) 4);
        var3.method505(2, 0, -128);
        this.field418.method327((byte) 4);
        var3.method505(2, -371, -202);
        this.field419.method327((byte) 4);
        var3.method505(2, -171, -202);
        this.field422.method327((byte) 4);
        var3.method505(2, -265, 0);
        this.field423.method327((byte) 4);
        var3.method505(2, -265, -562);
        this.field424.method327((byte) 4);
        var3.method505(2, -171, -128);
        this.field425.method327((byte) 4);
        var3.method505(2, -171, -562);
        int[] var4 = new int[var3.field1436];
        for (int var5 = 0; var5 < var3.field1437; ++var5) {
            for (int var10 = 0; var10 < var3.field1436; ++var10) {
                var4[var10] = var3.field1435[var3.field1436 * var5 + (var3.field1436 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1436; ++var11) {
                var3.field1435[var3.field1436 * var5 + var11] = var4[var11];
            }
        }
        this.field420.method327((byte) 4);
        var3.method505(2, 0, 382);
        this.field421.method327((byte) 4);
        var3.method505(2, 0, -255);
        this.field417.method327((byte) 4);
        var3.method505(2, 0, 254);
        this.field418.method327((byte) 4);
        var3.method505(2, -371, 180);
        this.field419.method327((byte) 4);
        var3.method505(2, -171, 180);
        this.field422.method327((byte) 4);
        var3.method505(2, -265, 382);
        this.field423.method327((byte) 4);
        var3.method505(2, -265, -180);
        this.field424.method327((byte) 4);
        var3.method505(2, -171, 254);
        this.field425.method327((byte) 4);
        var3.method505(2, -171, -180);
        class56 var6 = new class56(this.field229, "logo", 0);
        this.field417.method327((byte) 4);
        var6.method507(382 - var6.field1436 / 2 - 128, this.field549, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        if (arg0 == 0) {
            System.gc();
            if (class1.field4) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method102(int arg0, int arg1) {
        if (arg0 >= 0) {
            int var3 = this.field277[arg0];
            int var4 = this.field278[arg0];
            int var5 = this.field279[arg0];
            int var6 = this.field280[arg0];
            int var7 = 66 / arg1;
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field320 != 0 && var5 != 1117) {
                this.field320 = 0;
                this.field550 = true;
            }
            if (var5 == 343) {
                this.field336.method183(196, this.field230);
                this.field336.method185(var6);
                this.field336.method219(var4, 0);
                this.field336.method219(var3, 0);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 787) {
                this.method36(var3, var6, true, var4);
                this.field336.method183(186, this.field230);
                this.field336.method219(var6 >> 14 & 32767, 0);
                this.field336.method219(this.field455 + var3, 0);
                this.field336.method219(this.field456 + var4, 0);
            }
            if (var5 == 913) {
                class36 var8 = this.field235[var6];
                if (var8 != null) {
                    this.method92(field394.field1293[0], var8.field1292[0], 2, 1, -20821, 1, var8.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(224, this.field230);
                    this.field336.method219(var6, 0);
                }
            }
            if (var5 == 642) {
                class25 var9 = this.field153[var6];
                if (var9 != null) {
                    this.method92(field394.field1293[0], var9.field1292[0], 2, 1, -20821, 1, var9.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    field378 += var6;
                    if (field378 >= 58) {
                        this.field336.method183(220, this.field230);
                        this.field336.method185(38397);
                        field378 = 0;
                    }
                    this.field336.method183(190, this.field230);
                    this.field336.method220(var6, -7774);
                }
            }
            if (var5 == 233) {
                boolean var10 = this.method92(field394.field1293[0], var3, 2, 0, -20821, 0, var4, 0, 0, field394.field1292[0], 0, false);
                if (!var10) {
                    this.method92(field394.field1293[0], var3, 2, 1, -20821, 1, var4, 0, 0, field394.field1292[0], 0, false);
                }
                this.field568 = super.field1134;
                this.field569 = super.field1135;
                this.field571 = 2;
                this.field570 = 0;
                this.field336.method183(242, this.field230);
                this.field336.method220(var6, -7774);
                this.field336.method218(this.field456 + var4, 0);
                this.field336.method218(this.field455 + var3, 0);
            }
            if (var5 == 48) {
                this.method93(this.field136);
            }
            if (var5 == 166 || var5 == 895 || var5 == 804 || var5 == 510) {
                String var12 = this.field122[arg0];
                int var13 = var12.indexOf("@whi@");
                if (var13 != -1) {
                    long var14 = class71.method597(var12.substring(var13 + 5).trim());
                    if (var5 == 166) {
                        this.method126(var14, 0);
                    }
                    if (var5 == 895) {
                        this.method59(var14, this.field608);
                    }
                    if (var5 == 804) {
                        this.method140(var14, 814);
                    }
                    if (var5 == 510) {
                        this.method87(975, var14);
                    }
                }
            }
            if (var5 == 1237) {
                this.method36(var3, var6, true, var4);
                this.field336.method183(154, this.field230);
                this.field336.method218(var6 >> 14 & 32767, 0);
                this.field336.method185(this.field455 + var3);
                this.field336.method185(this.field456 + var4);
            }
            if (var5 == 1986) {
                class25 var16 = this.field153[var6];
                if (var16 != null) {
                    class57 var17 = var16.field887;
                    if (var17.field1447 != null) {
                        var17 = var17.method515((byte) 73);
                    }
                    if (var17 != null) {
                        String var18;
                        if (var17.field1463 != null) {
                            var18 = new String(var17.field1463);
                        } else {
                            var18 = "It's a " + var17.field1456 + ".";
                        }
                        this.method114("", var18, 0, 0);
                    }
                }
            }
            if (var5 == 555) {
                boolean var19 = this.method92(field394.field1293[0], var3, 2, 0, -20821, 0, var4, 0, 0, field394.field1292[0], 0, false);
                if (!var19) {
                    this.method92(field394.field1293[0], var3, 2, 1, -20821, 1, var4, 0, 0, field394.field1292[0], 0, false);
                }
                this.field568 = super.field1134;
                this.field569 = super.field1135;
                this.field571 = 2;
                this.field570 = 0;
                this.field336.method183(59, this.field230);
                this.field336.method220(this.field456 + var4, -7774);
                this.field336.method220(var6, -7774);
                this.field336.method219(this.field348, 0);
                this.field336.method185(this.field455 + var3);
            }
            if (var5 == 794) {
                this.field336.method183(225, this.field230);
                this.field336.method219(var3, 0);
                this.field336.method185(var4);
                this.field336.method219(var6, 0);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 295) {
                class25 var21 = this.field153[var6];
                if (var21 != null) {
                    this.method92(field394.field1293[0], var21.field1292[0], 2, 1, -20821, 1, var21.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(117, this.field230);
                    this.field336.method218(var6, 0);
                }
            }
            if (var5 == 992) {
                class36 var22 = this.field235[var6];
                if (var22 != null) {
                    this.method92(field394.field1293[0], var22.field1292[0], 2, 1, -20821, 1, var22.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(81, this.field230);
                    this.field336.method218(var6, 0);
                }
            }
            if (var5 == 22) {
                class25 var23 = this.field153[var6];
                if (var23 != null) {
                    this.method92(field394.field1293[0], var23.field1292[0], 2, 1, -20821, 1, var23.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(99, this.field230);
                    this.field336.method218(var6, 0);
                }
            }
            if (var5 == 825) {
                boolean var24 = this.method92(field394.field1293[0], var3, 2, 0, -20821, 0, var4, 0, 0, field394.field1292[0], 0, false);
                if (!var24) {
                    this.method92(field394.field1293[0], var3, 2, 1, -20821, 1, var4, 0, 0, field394.field1292[0], 0, false);
                }
                this.field568 = super.field1134;
                this.field569 = super.field1135;
                this.field571 = 2;
                this.field570 = 0;
                this.field336.method183(80, this.field230);
                this.field336.method220(this.field314, -7774);
                this.field336.method185(this.field456 + var4);
                this.field336.method218(var6, 0);
                this.field336.method219(this.field313, 0);
                this.field336.method185(this.field455 + var3);
                this.field336.method219(this.field312, 0);
            }
            if (var5 == 830) {
                class25 var26 = this.field153[var6];
                if (var26 != null) {
                    this.method92(field394.field1293[0], var26.field1292[0], 2, 1, -20821, 1, var26.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(243, this.field230);
                    this.field336.method185(var6);
                }
            }
            if (var5 == 529) {
                this.field336.method183(39, this.field230);
                this.field336.method220(var3, -7774);
                this.field336.method219(var4, 0);
                this.field336.method220(var6, -7774);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 898) {
                class25 var27 = this.field153[var6];
                if (var27 != null) {
                    this.method92(field394.field1293[0], var27.field1292[0], 2, 1, -20821, 1, var27.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(67, this.field230);
                    this.field336.method220(var6, -7774);
                    this.field336.method218(this.field348, 0);
                }
            }
            if (var5 == 551) {
                this.field336.method183(90, this.field230);
                this.field336.method185(var4);
                class65 var28 = class65.method577(var4);
                if (var28.field1639 != null && var28.field1639[0][0] == 5) {
                    int var29 = var28.field1639[0][1];
                    if (this.field269[var29] != var28.field1593[0]) {
                        this.field269[var29] = var28.field1593[0];
                        this.method39((byte) -49, var29);
                        this.field472 = true;
                    }
                }
            }
            if (var5 == 158) {
                if (!this.field439) {
                    this.field591.method486(super.field1135 - 4, this.field341, super.field1134 - 4);
                } else {
                    this.field591.method486(var4 - 4, this.field341, var3 - 4);
                }
            }
            if (var5 == 62) {
                this.field336.method183(141, this.field230);
                this.field336.method185(var3);
                this.field336.method218(var4, 0);
                this.field336.method220(var6, -7774);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 585) {
                class65 var30 = class65.method577(var4);
                boolean var31 = true;
                if (var30.field1585 > 0) {
                    var31 = this.method82(var30, 3);
                }
                if (var31) {
                    this.field336.method183(90, this.field230);
                    this.field336.method185(var4);
                }
            }
            if (var5 == 679) {
                boolean var32 = this.method92(field394.field1293[0], var3, 2, 0, -20821, 0, var4, 0, 0, field394.field1292[0], 0, false);
                if (!var32) {
                    this.method92(field394.field1293[0], var3, 2, 1, -20821, 1, var4, 0, 0, field394.field1292[0], 0, false);
                }
                this.field568 = super.field1134;
                this.field569 = super.field1135;
                this.field571 = 2;
                this.field570 = 0;
                this.field336.method183(78, this.field230);
                this.field336.method220(var6, -7774);
                this.field336.method218(this.field455 + var3, 0);
                this.field336.method219(this.field456 + var4, 0);
            }
            if (var5 == 594 && !this.field481) {
                this.field336.method183(237, this.field230);
                this.field336.method185(var4);
                this.field481 = true;
            }
            if (var5 == 652) {
                this.field336.method183(83, this.field230);
                this.field336.method219(var3, 0);
                this.field336.method218(this.field314, 0);
                this.field336.method219(var4, 0);
                this.field336.method220(this.field313, -7774);
                this.field336.method219(var6, 0);
                this.field336.method218(this.field312, 0);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 791 && this.method36(var3, var6, true, var4)) {
                this.field336.method183(38, this.field230);
                this.field336.method185(this.field456 + var4);
                this.field336.method220(this.field455 + var3, -7774);
                this.field336.method218(this.field314, 0);
                this.field336.method218(this.field312, 0);
                this.field336.method219(this.field313, 0);
                this.field336.method220(var6 >> 14 & 32767, -7774);
            }
            if (var5 == 352) {
                this.field336.method183(65, this.field230);
                this.field336.method185(var6);
                this.field336.method218(var4, 0);
                this.field336.method219(var3, 0);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 683) {
                class25 var34 = this.field153[var6];
                if (var34 != null) {
                    this.method92(field394.field1293[0], var34.field1292[0], 2, 1, -20821, 1, var34.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(231, this.field230);
                    this.field336.method219(this.field312, 0);
                    this.field336.method219(this.field314, 0);
                    this.field336.method218(this.field313, 0);
                    this.field336.method219(var6, 0);
                }
            }
            if (var5 == 508) {
                class36 var35 = this.field235[var6];
                if (var35 != null) {
                    this.method92(field394.field1293[0], var35.field1292[0], 2, 1, -20821, 1, var35.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(111, this.field230);
                    this.field336.method219(var6, 0);
                    this.field336.method185(this.field314);
                    this.field336.method218(this.field313, 0);
                    this.field336.method185(this.field312);
                }
            }
            if (var5 == 399) {
                this.field336.method183(20, this.field230);
                this.field336.method219(var3, 0);
                this.field336.method219(var4, 0);
                this.field336.method220(this.field348, -7774);
                this.field336.method218(var6, 0);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 1934) {
                class34 var36 = class34.method346(var6);
                class65 var37 = class65.method577(var4);
                String var38;
                if (var37 != null && var37.field1623[var3] >= 100000) {
                    var38 = var37.field1623[var3] + " x " + var36.field1008;
                } else if (var36.field1030 != null) {
                    var38 = new String(var36.field1030);
                } else {
                    var38 = "It's a " + var36.field1008 + ".";
                }
                this.method114("", var38, 0, 0);
            }
            if (var5 == 350) {
                this.method36(var3, var6, true, var4);
                this.field336.method183(60, this.field230);
                this.field336.method185(var6 >> 14 & 32767);
                this.field336.method185(this.field456 + var4);
                this.field336.method218(this.field455 + var3, 0);
            }
            if (var5 == 387 && this.method36(var3, var6, true, var4)) {
                this.field336.method183(71, this.field230);
                this.field336.method218(var6 >> 14 & 32767, 0);
                this.field336.method185(this.field348);
                this.field336.method185(this.field456 + var4);
                this.field336.method219(this.field455 + var3, 0);
            }
            if (var5 == 946) {
                class36 var39 = this.field235[var6];
                if (var39 != null) {
                    this.method92(field394.field1293[0], var39.field1292[0], 2, 1, -20821, 1, var39.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(42, this.field230);
                    this.field336.method220(var6, -7774);
                }
            }
            if (var5 == 899) {
                this.field336.method183(90, this.field230);
                this.field336.method185(var4);
                class65 var40 = class65.method577(var4);
                if (var40.field1639 != null && var40.field1639[0][0] == 5) {
                    int var41 = var40.field1639[0][1];
                    this.field269[var41] = 1 - this.field269[var41];
                    this.method39((byte) -49, var41);
                    this.field472 = true;
                }
            }
            if (var5 == 887) {
                if ((var3 & 3) == 0) {
                    ++field137;
                }
                if (field137 >= 135) {
                    this.field336.method183(213, this.field230);
                    this.field336.method184(76);
                    field137 = 0;
                }
                this.field336.method183(45, this.field230);
                this.field336.method220(var3, -7774);
                this.field336.method219(var4, 0);
                this.field336.method219(var6, 0);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 1642) {
                int var42 = var6 >> 14 & 32767;
                class70 var43 = class70.method596(var42);
                String var44;
                if (var43.field1708 != null) {
                    var44 = new String(var43.field1708);
                } else {
                    var44 = "It's a " + var43.field1732 + ".";
                }
                this.method114("", var44, 0, 0);
            }
            if (var5 == 57 || var5 == 894) {
                String var45 = this.field122[arg0];
                int var46 = var45.indexOf("@whi@");
                if (var46 != -1) {
                    String var47 = var45.substring(var46 + 5).trim();
                    String var48 = class71.method601(class71.method598(class71.method597(var47), -491), 8384);
                    boolean var49 = false;
                    for (int var50 = 0; var50 < this.field236; ++var50) {
                        class36 var51 = this.field235[this.field237[var50]];
                        if (var51 != null && var51.field1081 != null && var51.field1081.equalsIgnoreCase(var48)) {
                            this.method92(field394.field1293[0], var51.field1292[0], 2, 1, -20821, 1, var51.field1293[0], 0, 0, field394.field1292[0], 0, false);
                            if (var5 == 57) {
                                this.field336.method183(9, this.field230);
                                this.field336.method219(this.field237[var50], 0);
                            }
                            if (var5 == 894) {
                                field469 += var6;
                                if (field469 >= 53) {
                                    this.field336.method183(148, this.field230);
                                    field469 = 0;
                                }
                                this.field336.method183(185, this.field230);
                                this.field336.method218(this.field237[var50], 0);
                            }
                            var49 = true;
                            break;
                        }
                    }
                    if (!var49) {
                        this.method114("", "Unable to find " + var48, 0, 0);
                    }
                }
            }
            if (var5 == 1186) {
                class34 var52 = class34.method346(var6);
                String var53;
                if (var52.field1030 != null) {
                    var53 = new String(var52.field1030);
                } else {
                    var53 = "It's a " + var52.field1008 + ".";
                }
                this.method114("", var53, 0, 0);
            }
            if (var5 == 875) {
                this.field336.method183(44, this.field230);
                this.field336.method218(var6, 0);
                this.field336.method218(var3, 0);
                this.field336.method185(var4);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 814) {
                this.method36(var3, var6, true, var4);
                this.field336.method183(129, this.field230);
                this.field336.method219(this.field455 + var3, 0);
                this.field336.method220(var6 >> 14 & 32767, -7774);
                this.field336.method218(this.field456 + var4, 0);
            }
            if (var5 == 56) {
                this.field336.method183(12, this.field230);
                this.field336.method220(var3, -7774);
                this.field336.method218(var4, 0);
                this.field336.method220(var6, -7774);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 66) {
                this.field336.method183(17, this.field230);
                this.field336.method218(var3, 0);
                this.field336.method219(var6, 0);
                this.field336.method185(var4);
                this.field561 = 0;
                this.field562 = var4;
                this.field563 = var3;
                this.field564 = 2;
                if (class65.method577(var4).field1622 == this.field466) {
                    this.field564 = 1;
                }
                if (class65.method577(var4).field1622 == this.field624) {
                    this.field564 = 3;
                }
            }
            if (var5 == 870) {
                class36 var54 = this.field235[var6];
                if (var54 != null) {
                    this.method92(field394.field1293[0], var54.field1292[0], 2, 1, -20821, 1, var54.field1293[0], 0, 0, field394.field1292[0], 0, false);
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    field469 += var6;
                    if (field469 >= 53) {
                        this.field336.method183(148, this.field230);
                        field469 = 0;
                    }
                    this.field336.method183(185, this.field230);
                    this.field336.method218(var6, 0);
                }
            }
            if (var5 == 407) {
                class65 var55 = class65.method577(var4);
                this.field347 = 1;
                this.field348 = var4;
                this.field349 = var55.field1595;
                this.field311 = 0;
                this.field472 = true;
                String var56 = var55.field1630;
                if (var56.indexOf(" ") != -1) {
                    var56 = var56.substring(0, var56.indexOf(" "));
                }
                String var57 = var55.field1630;
                if (var57.indexOf(" ") != -1) {
                    var57 = var57.substring(var57.indexOf(" ") + 1);
                }
                this.field350 = var56 + " " + var55.field1602 + " " + var57;
                if (this.field349 == 16) {
                    this.field472 = true;
                    this.field463 = 3;
                    this.field208 = true;
                }
            } else {
                if (var5 == 306) {
                    class36 var58 = this.field235[var6];
                    if (var58 != null) {
                        this.method92(field394.field1293[0], var58.field1292[0], 2, 1, -20821, 1, var58.field1293[0], 0, 0, field394.field1292[0], 0, false);
                        this.field568 = super.field1134;
                        this.field569 = super.field1135;
                        this.field571 = 2;
                        this.field570 = 0;
                        this.field336.method183(19, this.field230);
                        this.field336.method219(this.field348, 0);
                        this.field336.method219(var6, 0);
                    }
                }
                if (var5 == 174) {
                    boolean var59 = this.method92(field394.field1293[0], var3, 2, 0, -20821, 0, var4, 0, 0, field394.field1292[0], 0, false);
                    if (!var59) {
                        this.method92(field394.field1293[0], var3, 2, 1, -20821, 1, var4, 0, 0, field394.field1292[0], 0, false);
                    }
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    ++field296;
                    if (field296 >= 129) {
                        this.field336.method183(217, this.field230);
                        this.field336.method184(71);
                        field296 = 0;
                    }
                    this.field336.method183(168, this.field230);
                    this.field336.method219(this.field455 + var3, 0);
                    this.field336.method220(var6, -7774);
                    this.field336.method220(this.field456 + var4, -7774);
                }
                if (var5 == 16) {
                    this.field336.method183(94, this.field230);
                    this.field336.method219(var6, 0);
                    this.field336.method185(var4);
                    this.field336.method218(var3, 0);
                    this.field561 = 0;
                    this.field562 = var4;
                    this.field563 = var3;
                    this.field564 = 2;
                    if (class65.method577(var4).field1622 == this.field466) {
                        this.field564 = 1;
                    }
                    if (class65.method577(var4).field1622 == this.field624) {
                        this.field564 = 3;
                    }
                }
                if (var5 == 641) {
                    String var61 = this.field122[arg0];
                    int var62 = var61.indexOf("@whi@");
                    if (var62 != -1) {
                        if (this.field466 == -1) {
                            this.method93(this.field136);
                            this.field441 = var61.substring(var62 + 5).trim();
                            this.field130 = false;
                            this.field371 = this.field466 = class65.field1591;
                        } else {
                            this.method114("", "Please close the interface you have open before using 'report abuse'", 0, 0);
                        }
                    }
                }
                if (var5 == 138) {
                    boolean var63 = this.method92(field394.field1293[0], var3, 2, 0, -20821, 0, var4, 0, 0, field394.field1292[0], 0, false);
                    if (!var63) {
                        this.method92(field394.field1293[0], var3, 2, 1, -20821, 1, var4, 0, 0, field394.field1292[0], 0, false);
                    }
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    this.field336.method183(14, this.field230);
                    this.field336.method185(this.field456 + var4);
                    this.field336.method219(var6, 0);
                    this.field336.method218(this.field455 + var3, 0);
                }
                if (var5 == 375) {
                    boolean var65 = this.method92(field394.field1293[0], var3, 2, 0, -20821, 0, var4, 0, 0, field394.field1292[0], 0, false);
                    if (!var65) {
                        this.method92(field394.field1293[0], var3, 2, 1, -20821, 1, var4, 0, 0, field394.field1292[0], 0, false);
                    }
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 2;
                    this.field570 = 0;
                    ++field298;
                    if (field298 >= 68) {
                        this.field336.method183(76, this.field230);
                        this.field336.method187(13221022);
                        field298 = 0;
                    }
                    this.field336.method183(64, this.field230);
                    this.field336.method218(this.field455 + var3, 0);
                    this.field336.method219(var6, 0);
                    this.field336.method185(this.field456 + var4);
                }
                if (var5 == 847) {
                    String var67 = this.field122[arg0];
                    int var68 = var67.indexOf("@whi@");
                    if (var68 != -1) {
                        long var69 = class71.method597(var67.substring(var68 + 5).trim());
                        int var71 = -1;
                        for (int var72 = 0; var72 < this.field589; ++var72) {
                            if (this.field440[var72] == var69) {
                                var71 = var72;
                                break;
                            }
                        }
                        if (var71 != -1 && this.field442[var71] > 0) {
                            this.field550 = true;
                            this.field320 = 0;
                            this.field449 = true;
                            this.field337 = "";
                            this.field338 = 3;
                            this.field443 = this.field440[var71];
                            this.field330 = "Enter message to send to " + this.field204[var71];
                        }
                    }
                }
                if (var5 == 179) {
                    this.field311 = 1;
                    this.field312 = var3;
                    this.field313 = var4;
                    this.field314 = var6;
                    this.field315 = String.valueOf(class34.method346(var6).field1008);
                    this.field347 = 0;
                    this.field472 = true;
                } else {
                    if (var5 == 850) {
                        this.method161(this.field374, (byte) 45);
                        this.field374 = -1;
                        this.field550 = true;
                    }
                    if (var5 == 758) {
                        this.method36(var3, var6, true, var4);
                        this.field336.method183(77, this.field230);
                        this.field336.method220(this.field455 + var3, -7774);
                        this.field336.method220(this.field456 + var4, -7774);
                        this.field336.method219(var6 >> 14 & 32767, 0);
                    }
                    if (var5 == 488) {
                        class25 var73 = this.field153[var6];
                        if (var73 != null) {
                            this.method92(field394.field1293[0], var73.field1292[0], 2, 1, -20821, 1, var73.field1293[0], 0, 0, field394.field1292[0], 0, false);
                            this.field568 = super.field1134;
                            this.field569 = super.field1135;
                            this.field571 = 2;
                            this.field570 = 0;
                            this.field336.method183(181, this.field230);
                            this.field336.method220(var6, -7774);
                        }
                    }
                    if (var5 == 155) {
                        class36 var74 = this.field235[var6];
                        if (var74 != null) {
                            this.method92(field394.field1293[0], var74.field1292[0], 2, 1, -20821, 1, var74.field1293[0], 0, 0, field394.field1292[0], 0, false);
                            this.field568 = super.field1134;
                            this.field569 = super.field1135;
                            this.field571 = 2;
                            this.field570 = 0;
                            this.field336.method183(9, this.field230);
                            this.field336.method219(var6, 0);
                        }
                    }
                    this.field311 = 0;
                    this.field347 = 0;
                    this.field472 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LWJQTPVDG;I)V")
    public final void method103(class65 arg0, int arg1) {
        int var3 = arg0.field1585;
        if (arg1 < 0) {
            if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
                if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                    int var5 = this.field589;
                    if (this.field590 != 2) {
                        var5 = 0;
                    }
                    if (var3 > 800) {
                        var3 -= 701;
                    } else {
                        var3 -= 101;
                    }
                    if (var3 >= var5) {
                        arg0.field1613 = "";
                        arg0.field1607 = 0;
                    } else {
                        if (this.field442[var3] == 0) {
                            arg0.field1613 = "@red@Offline";
                        } else if (this.field442[var3] < 200) {
                            if (this.field442[var3] == field290) {
                                arg0.field1613 = "@gre@World" + (this.field442[var3] - 9);
                            } else {
                                arg0.field1613 = "@yel@World" + (this.field442[var3] - 9);
                            }
                        } else if (this.field442[var3] == field290) {
                            arg0.field1613 = "@gre@Classic" + (this.field442[var3] - 219);
                        } else {
                            arg0.field1613 = "@yel@Classic" + (this.field442[var3] - 219);
                        }
                        arg0.field1607 = 1;
                    }
                } else if (var3 == 203) {
                    int var6 = this.field589;
                    if (this.field590 != 2) {
                        var6 = 0;
                    }
                    arg0.field1604 = var6 * 15 + 20;
                    if (arg0.field1604 <= arg0.field1618) {
                        arg0.field1604 = arg0.field1618 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 == 0 && this.field590 == 0) {
                        arg0.field1613 = "Loading ignore list";
                        arg0.field1607 = 0;
                    } else if (var3 == 1 && this.field590 == 0) {
                        arg0.field1613 = "Please wait...";
                        arg0.field1607 = 0;
                    } else {
                        int var7 = this.field611;
                        if (this.field590 == 0) {
                            var7 = 0;
                        }
                        if (var3 >= var7) {
                            arg0.field1613 = "";
                            arg0.field1607 = 0;
                        } else {
                            arg0.field1613 = class71.method601(class71.method598(this.field473[var3], -491), 8384);
                            arg0.field1607 = 1;
                        }
                    }
                } else if (var3 == 503) {
                    arg0.field1604 = this.field611 * 15 + 20;
                    if (arg0.field1604 <= arg0.field1618) {
                        arg0.field1604 = arg0.field1618 + 1;
                    }
                } else if (var3 == 327) {
                    arg0.field1577 = 150;
                    arg0.field1578 = (int) (Math.sin((double) field471 / 40.0D) * 256.0D) & 2047;
                    if (this.field369) {
                        for (int var8 = 0; var8 < 7; ++var8) {
                            int var15 = this.field395[var8];
                            if (var15 >= 0 && !class9.field114[var15].method31(true)) {
                                return;
                            }
                        }
                        this.field369 = false;
                        class16[] var9 = new class16[7];
                        int var10 = 0;
                        for (int var11 = 0; var11 < 7; ++var11) {
                            int var14 = this.field395[var11];
                            if (var14 >= 0) {
                                var9[var10++] = class9.field114[var14].method32(true);
                            }
                        }
                        class16 var12 = new class16(var9, var10, this.field199);
                        for (int var13 = 0; var13 < 5; ++var13) {
                            if (this.field567[var13] != 0) {
                                var12.method274(field203[var13][0], field203[var13][this.field567[var13]]);
                                if (var13 == 1) {
                                    var12.method274(field565[0], field565[this.field567[var13]]);
                                }
                            }
                        }
                        var12.method267(-12404);
                        var12.method268((byte) 81, class67.field1666[field394.field1286].field1668[0]);
                        var12.method277(64, 850, -30, -50, -30, true);
                        arg0.field1619 = 5;
                        arg0.field1620 = 0;
                        class65.method578(0, var12, 5, false);
                    }
                } else if (var3 == 324) {
                    if (this.field334 == null) {
                        this.field334 = arg0.field1628;
                        this.field335 = arg0.field1636;
                    }
                    if (this.field620) {
                        arg0.field1628 = this.field335;
                    } else {
                        arg0.field1628 = this.field334;
                    }
                } else if (var3 == 325) {
                    if (this.field334 == null) {
                        this.field334 = arg0.field1628;
                        this.field335 = arg0.field1636;
                    }
                    if (this.field620) {
                        arg0.field1628 = this.field334;
                    } else {
                        arg0.field1628 = this.field335;
                    }
                } else if (var3 == 600) {
                    arg0.field1613 = this.field441;
                    if (field471 % 20 < 10) {
                        arg0.field1613 = arg0.field1613 + "|";
                    } else {
                        arg0.field1613 = arg0.field1613 + " ";
                    }
                } else {
                    if (var3 == 620) {
                        if (this.field600 >= 1) {
                            if (this.field130) {
                                arg0.field1584 = 16711680;
                                arg0.field1613 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg0.field1584 = 16777215;
                                arg0.field1613 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg0.field1613 = "";
                        }
                    }
                    if (var3 == 660) {
                        int var16 = this.field431 - this.field121;
                        String var17;
                        if (var16 <= 0) {
                            var17 = "earlier today";
                        } else if (var16 == 1) {
                            var17 = "yesterday";
                        } else {
                            var17 = var16 + " days ago";
                        }
                        arg0.field1613 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                    }
                    if (var3 == 661) {
                        if (this.field325 == 0) {
                            arg0.field1613 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                        } else if (this.field325 <= this.field431) {
                            arg0.field1613 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method104(this.field325, (byte) 122);
                        } else {
                            int var18 = this.field431 + 14 - this.field325;
                            String var19;
                            if (var18 <= 0) {
                                var19 = "Earlier today";
                            } else if (var18 == 1) {
                                var19 = "Yesterday";
                            } else {
                                var19 = var18 + " days ago";
                            }
                            arg0.field1613 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method104(this.field325, (byte) 122) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                        }
                    }
                    if (var3 == 662) {
                        String var20;
                        if (this.field150 == 0) {
                            var20 = "@yel@0 unread messages";
                        } else if (this.field150 == 1) {
                            var20 = "@gre@1 unread message";
                        } else {
                            var20 = "@gre@" + this.field150 + " unread messages";
                        }
                        arg0.field1613 = "You have " + var20 + "\\nin your message centre.";
                    }
                    if (var3 == 663) {
                        if (this.field480 > 0 && this.field480 <= this.field431 + 10) {
                            arg0.field1613 = "Last password change:\\n@gre@" + this.method104(this.field480, (byte) 122);
                        } else {
                            arg0.field1613 = "Last password change:\\n@gre@Never changed";
                        }
                    }
                    if (var3 == 665) {
                        if (this.field605 > 2 && !field292) {
                            arg0.field1613 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                        } else if (this.field605 > 2) {
                            arg0.field1613 = "\\n\\nYou have @gre@" + this.field605 + "@yel@ days of\\nmember credit remaining.";
                        } else if (this.field605 > 0) {
                            arg0.field1613 = "You have @gre@" + this.field605 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                        } else {
                            arg0.field1613 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                        }
                    }
                    if (var3 == 667) {
                        if (this.field605 > 2 && !field292) {
                            arg0.field1613 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                        } else if (this.field605 > 0) {
                            arg0.field1613 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                        } else {
                            arg0.field1613 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                        }
                    }
                    if (var3 == 668) {
                        if (this.field325 > this.field431) {
                            arg0.field1613 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                        } else {
                            arg0.field1613 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                        }
                    }
                }
            } else if (var3 == 1 && this.field590 == 0) {
                arg0.field1613 = "Loading friend list";
                arg0.field1607 = 0;
            } else if (var3 == 1 && this.field590 == 1) {
                arg0.field1613 = "Connecting to friendserver";
                arg0.field1607 = 0;
            } else if (var3 == 2 && this.field590 != 2) {
                arg0.field1613 = "Please wait...";
                arg0.field1607 = 0;
            } else {
                int var4 = this.field589;
                if (this.field590 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg0.field1613 = "";
                    arg0.field1607 = 0;
                } else {
                    arg0.field1613 = this.field204[var3];
                    arg0.field1607 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method104(int arg0, byte arg1) {
        if (arg0 > this.field431 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            if (arg1 != 122) {
                this.field596 = this.field297.method194();
            }
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method105(int arg0) {
        if (this.field536 == null) {
            this.method152(this.field180);
            super.field1120 = null;
            this.field417 = null;
            this.field418 = null;
            this.field419 = null;
            this.field420 = null;
            this.field421 = null;
            this.field422 = null;
            this.field423 = null;
            this.field424 = null;
            this.field425 = null;
            if (arg0 >= 0) {
                field416 = 433;
            }
            this.field536 = new class28(this.method117((byte) 0), 479, (byte) 0, 96);
            this.field534 = new class28(this.method117((byte) 0), 172, (byte) 0, 156);
            class6.method20(12847);
            this.field201.method424(0, this.field549, 0);
            this.field533 = new class28(this.method117((byte) 0), 190, (byte) 0, 261);
            this.field535 = new class28(this.method117((byte) 0), 512, (byte) 0, 334);
            class6.method20(12847);
            this.field249 = new class28(this.method117((byte) 0), 496, (byte) 0, 50);
            this.field250 = new class28(this.method117((byte) 0), 269, (byte) 0, 37);
            this.field251 = new class28(this.method117((byte) 0), 249, (byte) 0, 45);
            this.field593 = true;
            this.field535.method327((byte) 4);
            class39.field1156 = this.field496;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
    public final int method106(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field545 = true;
        }
        int var5 = 256 - arg0;
        return ((arg2 & 16711935) * arg0 + (arg3 & 16711935) * var5 & -16711936) + ((arg2 & 65280) * arg0 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method107(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.field596 = this.field297.method194();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCMGGUSPR;ZI)V")
    private final void method108(class10 arg0, boolean arg1, int arg2) {
        arg0.method204((byte) -36);
        int var4 = arg0.method205(8, -359);
        if (var4 < this.field154) {
            for (int var5 = var4; var5 < this.field154; ++var5) {
                this.field276[this.field275++] = this.field155[var5];
            }
        }
        if (var4 > this.field154) {
            signlink.reporterror(this.field411 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field154 = 0;
            this.field132 &= arg1;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field155[var6];
                class25 var8 = this.field153[var7];
                int var9 = arg0.method205(1, -359);
                if (var9 == 0) {
                    this.field155[this.field154++] = var7;
                    var8.field1310 = field471;
                } else {
                    int var10 = arg0.method205(2, -359);
                    if (var10 == 0) {
                        this.field155[this.field154++] = var7;
                        var8.field1310 = field471;
                        this.field239[this.field238++] = var7;
                    } else if (var10 == 1) {
                        this.field155[this.field154++] = var7;
                        var8.field1310 = field471;
                        int var11 = arg0.method205(3, -359);
                        var8.method440(var11, false, 796);
                        int var12 = arg0.method205(1, -359);
                        if (var12 == 1) {
                            this.field239[this.field238++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field155[this.field154++] = var7;
                        var8.field1310 = field471;
                        int var13 = arg0.method205(3, -359);
                        var8.method440(var13, true, 796);
                        int var14 = arg0.method205(3, -359);
                        var8.method440(var14, true, 796);
                        int var15 = arg0.method205(1, -359);
                        if (var15 == 1) {
                            this.field239[this.field238++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field276[this.field275++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method109(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method110(int arg0) {
        int var2 = this.field582 * 128 + 64;
        int var3 = this.field583 * 128 + 64;
        int var4 = this.method60(var3, 0, this.field510, var2) - this.field584;
        if (this.field188 < var2) {
            this.field188 += (var2 - this.field188) * this.field586 / 1000 + this.field585;
            if (this.field188 > var2) {
                this.field188 = var2;
            }
        }
        if (this.field188 > var2) {
            this.field188 -= (this.field188 - var2) * this.field586 / 1000 + this.field585;
            if (this.field188 < var2) {
                this.field188 = var2;
            }
        }
        if (this.field189 < var4) {
            this.field189 += (var4 - this.field189) * this.field586 / 1000 + this.field585;
            if (this.field189 > var4) {
                this.field189 = var4;
            }
        }
        if (this.field189 > var4) {
            this.field189 -= (this.field189 - var4) * this.field586 / 1000 + this.field585;
            if (this.field189 < var4) {
                this.field189 = var4;
            }
        }
        if (this.field190 < var3) {
            this.field190 += (var3 - this.field190) * this.field586 / 1000 + this.field585;
            if (this.field190 > var3) {
                this.field190 = var3;
            }
        }
        if (this.field190 > var3) {
            this.field190 -= (this.field190 - var3) * this.field586 / 1000 + this.field585;
            if (this.field190 < var3) {
                this.field190 = var3;
            }
        }
        int var5 = this.field540 * 128 + 64;
        int var6 = this.field541 * 128 + 64;
        int var7 = this.method60(var6, 0, this.field510, var5) - this.field542;
        int var8 = var5 - this.field188;
        int var9 = var7 - this.field189;
        int var10 = var6 - this.field190;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (arg0 >= 0) {
            field216 = this.field470.method437();
        }
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field191 < var12) {
            this.field191 += (var12 - this.field191) * this.field544 / 1000 + this.field543;
            if (this.field191 > var12) {
                this.field191 = var12;
            }
        }
        if (this.field191 > var12) {
            this.field191 -= (this.field191 - var12) * this.field544 / 1000 + this.field543;
            if (this.field191 < var12) {
                this.field191 = var12;
            }
        }
        int var14 = var13 - this.field192;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field192 += this.field544 * var14 / 1000 + this.field543;
            this.field192 &= 2047;
        }
        if (var14 < 0) {
            this.field192 -= -var14 * this.field544 / 1000 + this.field543;
            this.field192 &= 2047;
        }
        int var15 = var13 - this.field192;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field192 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILCMGGUSPR;I)V")
    public final void method111(int arg0, class10 arg1, int arg2) {
        int var4 = 87 / arg2;
        if (arg0 == 132) {
            int var5 = arg1.method223(2);
            int var6 = arg1.method221(-474);
            int var7 = arg1.method194();
            int var8 = (var7 >> 4 & 7) + this.field537;
            int var9 = (var7 & 7) + this.field538;
            int var10 = arg1.method222(0);
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && this.field149 != var5) {
                class45 var11 = new class45();
                var11.field1229 = var6;
                var11.field1230 = var10;
                if (this.field623[this.field510][var8][var9] == null) {
                    this.field623[this.field510][var8][var9] = new class62(-388);
                }
                this.field623[this.field510][var8][var9].method564(var11);
                this.method148(var8, var9);
            }
        } else if (arg0 == 85) {
            int var12 = arg1.method194();
            int var13 = (var12 >> 4 & 7) + this.field537;
            int var14 = (var12 & 7) + this.field538;
            int var15 = var13 + arg1.method195();
            int var16 = var14 + arg1.method195();
            int var17 = arg1.method197();
            int var18 = arg1.method196();
            int var19 = arg1.method194() * 4;
            int var20 = arg1.method194() * 4;
            int var21 = arg1.method196();
            int var22 = arg1.method196();
            int var23 = arg1.method194();
            int var24 = arg1.method194();
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var18 != 65535) {
                int var25 = var13 * 128 + 64;
                int var26 = var14 * 128 + 64;
                int var27 = var15 * 128 + 64;
                int var28 = var16 * 128 + 64;
                class54 var29 = new class54(this.method60(var26, 0, this.field510, var25) - var19, this.field510, field471 + var22, var18, var26, var24, var25, this.field176, var23, var20, var17, field471 + var21);
                var29.method499(var27, var28, 0, this.method60(var28, 0, this.field510, var27) - var20, field471 + var21);
                this.field578.method564(var29);
            }
        } else if (arg0 == 80) {
            int var30 = arg1.method222(0);
            int var31 = arg1.method213((byte) 7);
            int var32 = (var31 >> 4 & 7) + this.field537;
            int var33 = (var31 & 7) + this.field538;
            int var34 = arg1.method213((byte) 7);
            int var35 = var34 >> 2;
            int var36 = var34 & 3;
            int var37 = this.field329[var35];
            if (var32 >= 0 && var33 >= 0 && var32 < 103 && var33 < 103) {
                int var38 = this.field499[this.field510][var32][var33];
                int var39 = this.field499[this.field510][var32 + 1][var33];
                int var40 = this.field499[this.field510][var32 + 1][var33 + 1];
                int var41 = this.field499[this.field510][var32][var33 + 1];
                if (var37 == 0) {
                    class66 var42 = this.field591.method470(0, var33, this.field510, var32);
                    if (var42 != null) {
                        int var43 = var42.field1660 >> 14 & 32767;
                        if (var35 == 2) {
                            var42.field1658 = new class15(var38, var36 + 4, var40, var39, false, 2, var43, var41, var30, false);
                            var42.field1659 = new class15(var38, var36 + 1 & 3, var40, var39, false, 2, var43, var41, var30, false);
                        } else {
                            var42.field1658 = new class15(var38, var36, var40, var39, false, var35, var43, var41, var30, false);
                        }
                    }
                }
                if (var37 == 1) {
                    class42 var44 = this.field591.method471(-29627, var33, this.field510, var32);
                    if (var44 != null) {
                        var44.field1201 = new class15(var38, 0, var40, var39, false, 4, var44.field1202 >> 14 & 32767, var41, var30, false);
                    }
                }
                if (var37 == 2) {
                    class30 var45 = this.field591.method472((byte) 18, this.field510, var33, var32);
                    if (var35 == 11) {
                        var35 = 10;
                    }
                    if (var45 != null) {
                        var45.field949 = new class15(var38, var36, var40, var39, false, var35, var45.field957 >> 14 & 32767, var41, var30, false);
                    }
                }
                if (var37 == 3) {
                    class64 var46 = this.field591.method473(true, var33, this.field510, var32);
                    if (var46 != null) {
                        var46.field1572 = new class15(var38, var36, var40, var39, false, 22, var46.field1573 >> 14 & 32767, var41, var30, false);
                    }
                }
            }
        } else if (arg0 == 38) {
            int var47 = arg1.method194();
            int var48 = (var47 >> 4 & 7) + this.field537;
            int var49 = (var47 & 7) + this.field538;
            int var50 = arg1.method223(2);
            int var51 = arg1.method212(false);
            int var52 = var51 >> 2;
            int var53 = var51 & 3;
            int var54 = this.field329[var52];
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                this.method181(var50, var49, var54, var53, var48, this.field510, 0, -1, var52, 0);
            }
        } else {
            if (arg0 == 126) {
                int var55 = arg1.method194();
                int var56 = (var55 >> 4 & 7) + this.field537;
                int var57 = (var55 & 7) + this.field538;
                int var58 = arg1.method196();
                int var59 = arg1.method194();
                int var60 = var59 >> 4 & 15;
                int var61 = var59 & 7;
                if (field394.field1292[0] >= var56 - var60 && field394.field1292[0] <= var56 + var60 && field394.field1293[0] >= var57 - var60 && field394.field1293[0] <= var57 + var60 && this.field413 && !field293 && this.field414 < 50) {
                    this.field207[this.field414] = var58;
                    this.field321[this.field414] = var61;
                    this.field340[this.field414] = class4.field19[var58];
                    ++this.field414;
                }
            }
            if (arg0 == 142) {
                int var62 = arg1.method222(0);
                int var63 = arg1.method196();
                int var64 = arg1.method194();
                int var65 = (var64 >> 4 & 7) + this.field537;
                int var66 = (var64 & 7) + this.field538;
                if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                    class45 var67 = new class45();
                    var67.field1229 = var63;
                    var67.field1230 = var62;
                    if (this.field623[this.field510][var65][var66] == null) {
                        this.field623[this.field510][var65][var66] = new class62(-388);
                    }
                    this.field623[this.field510][var65][var66].method564(var67);
                    this.method148(var65, var66);
                }
            } else if (arg0 == 102) {
                int var68 = arg1.method194();
                int var69 = (var68 >> 4 & 7) + this.field537;
                int var70 = (var68 & 7) + this.field538;
                int var71 = arg1.method196();
                int var72 = arg1.method194();
                int var73 = arg1.method196();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    int var74 = var69 * 128 + 64;
                    int var75 = var70 * 128 + 64;
                    class68 var76 = new class68((byte) -24, this.method60(var75, 0, this.field510, var74) - var72, var71, field471, this.field510, var73, var75, var74);
                    this.field232.method564(var76);
                }
            } else if (arg0 == 110) {
                int var77 = arg1.method194();
                int var78 = (var77 >> 4 & 7) + this.field537;
                int var79 = (var77 & 7) + this.field538;
                int var80 = arg1.method196();
                int var81 = arg1.method196();
                int var82 = arg1.method196();
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    class62 var83 = this.field623[this.field510][var78][var79];
                    if (var83 != null) {
                        for (class45 var84 = (class45) var83.method567(); var84 != null; var84 = (class45) var83.method569(false)) {
                            if ((var80 & 32767) == var84.field1229 && var84.field1230 == var81) {
                                var84.field1230 = var82;
                                break;
                            }
                        }
                        this.method148(var78, var79);
                    }
                }
            } else {
                if (arg0 == 193) {
                    int var85 = arg1.method213((byte) 7);
                    int var86 = (var85 >> 4 & 7) + this.field537;
                    int var87 = (var85 & 7) + this.field538;
                    int var88 = arg1.method223(2);
                    byte var89 = arg1.method217(this.field173);
                    byte var90 = arg1.method195();
                    byte var91 = arg1.method216((byte) 7);
                    int var92 = arg1.method196();
                    int var93 = arg1.method221(-474);
                    int var94 = arg1.method221(-474);
                    byte var95 = arg1.method216((byte) 7);
                    int var96 = arg1.method194();
                    int var97 = var96 >> 2;
                    int var98 = var96 & 3;
                    int var99 = this.field329[var97];
                    class36 var100;
                    if (this.field149 == var93) {
                        var100 = field394;
                    } else {
                        var100 = this.field235[var93];
                    }
                    if (var100 != null) {
                        class70 var101 = class70.method596(var88);
                        int var102 = this.field499[this.field510][var86][var87];
                        int var103 = this.field499[this.field510][var86 + 1][var87];
                        int var104 = this.field499[this.field510][var86 + 1][var87 + 1];
                        int var105 = this.field499[this.field510][var86][var87 + 1];
                        class16 var106 = var101.method587(var97, var98, var102, var103, var104, var105, -1);
                        if (var106 != null) {
                            this.method181(-1, var87, var99, 0, var86, this.field510, 0, var94 + 1, 0, var92 + 1);
                            var100.field1052 = field471 + var92;
                            var100.field1053 = field471 + var94;
                            var100.field1075 = var106;
                            int var107 = var101.field1724;
                            int var108 = var101.field1735;
                            if (var98 == 1 || var98 == 3) {
                                var107 = var101.field1735;
                                var108 = var101.field1724;
                            }
                            var100.field1072 = var86 * 128 + var107 * 64;
                            var100.field1074 = var87 * 128 + var108 * 64;
                            var100.field1073 = this.method60(var100.field1074, 0, this.field510, var100.field1072);
                            if (var95 > var91) {
                                byte var109 = var95;
                                var95 = var91;
                                var91 = var109;
                            }
                            if (var89 > var90) {
                                byte var110 = var89;
                                var89 = var90;
                                var90 = var110;
                            }
                            var100.field1061 = var86 + var95;
                            var100.field1063 = var86 + var91;
                            var100.field1062 = var87 + var89;
                            var100.field1064 = var87 + var90;
                        }
                    }
                }
                if (arg0 != 118) {
                    if (arg0 == 203) {
                        int var117 = arg1.method213((byte) 7);
                        int var118 = (var117 >> 4 & 7) + this.field537;
                        int var119 = (var117 & 7) + this.field538;
                        int var120 = arg1.method194();
                        int var121 = var120 >> 2;
                        int var122 = var120 & 3;
                        int var123 = this.field329[var121];
                        if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                            this.method181(-1, var119, var123, var122, var118, this.field510, 0, -1, var121, 0);
                        }
                    }
                } else {
                    int var111 = arg1.method222(0);
                    int var112 = arg1.method194();
                    int var113 = (var112 >> 4 & 7) + this.field537;
                    int var114 = (var112 & 7) + this.field538;
                    if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                        class62 var115 = this.field623[this.field510][var113][var114];
                        if (var115 != null) {
                            for (class45 var116 = (class45) var115.method567(); var116 != null; var116 = (class45) var115.method569(false)) {
                                if ((var111 & 32767) == var116.field1229) {
                                    var116.method1();
                                    break;
                                }
                            }
                            if (var115.method567() == null) {
                                this.field623[this.field510][var113][var114] = null;
                            }
                            this.method148(var113, var114);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(BI)V")
    public final void method112(byte arg0, int arg1) {
        int[] var3 = this.field318.field1435;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field198[arg1][var25][var6] & 24) == 0) {
                    this.field591.method483(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (this.field198[arg1 + 1][var25][var6] & 8) != 0) {
                    this.field591.method483(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        ++field197;
        if (field197 > 117) {
            field197 = 0;
            this.field336.method183(241, this.field230);
            this.field336.method187(7589952);
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field318.method502((byte) 4);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field198[arg1][var23][var9] & 24) == 0) {
                    this.method89(var9, var8, var23, 6, var7, arg1);
                }
                if (arg1 < 3 && (this.field198[arg1 + 1][var23][var9] & 8) != 0) {
                    this.method89(var9, var8, var23, 6, var7, arg1 + 1);
                }
            }
        }
        if (this.field535 != null) {
            this.field535.method327((byte) 4);
            class39.field1156 = this.field496;
        }
        this.field286 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field591.method477(this.field510, var10, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class70.method596(var14).field1749;
                    if (var15 >= 0) {
                        int var16 = var10;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field328[this.field510].field1558;
                            for (int var21 = 0; var21 < 10; ++var21) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var16 > 0 && var16 > var10 - 3 && (var20[var16 - 1][var17] & 19398920) == 0) {
                                    --var16;
                                }
                                if (var22 == 1 && var16 < var18 - 1 && var16 < var10 + 3 && (var20[var16 + 1][var17] & 19399040) == 0) {
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
                        this.field409[this.field286] = this.field500[var15];
                        this.field287[this.field286] = var16;
                        this.field288[this.field286] = var17;
                        ++this.field286;
                    }
                }
            }
        }
        if (this.field231 != arg0) {
            field216 = 46;
        }
        ++field344;
        if (field344 > 1985) {
            field344 = 0;
            this.field336.method183(222, this.field230);
            this.field336.method184(0);
            int var11 = this.field336.field646;
            this.field336.method185(23056);
            this.field336.method185(58648);
            this.field336.method185((int) (Math.random() * 65536.0D));
            this.field336.method184(237);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field336.method184(161);
            }
            this.field336.method185(8273);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field336.method185(62228);
            }
            this.field336.method185(35150);
            this.field336.method185((int) (Math.random() * 65536.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field336.method185(4025);
            }
            this.field336.method193(this.field336.field646 - var11, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method113(int arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            if (arg0 != 25258) {
                field390 = -41;
            }
            String[] var4 = new String[100];
            int var5 = 0;
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field445 = 0;
                    label51: for (int var9 = 0; var9 < class34.field1006; ++var9) {
                        class34 var10 = class34.method346(var9);
                        if (var10.field985 == -1 && var10.field1008 != null) {
                            String var11 = var10.field1008.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label51;
                                }
                            }
                            this.field446[this.field445] = var11;
                            this.field447[this.field445] = var9;
                            ++this.field445;
                            if (this.field445 >= this.field446.length) {
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
            this.field445 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public final void method114(String arg0, String arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field601 = this.field470.method437();
        }
        if (arg2 == 0 && this.field374 != -1) {
            this.field140 = arg1;
            super.field1133 = 0;
        }
        if (this.field624 == -1) {
            this.field550 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field452[var5] = this.field452[var5 - 1];
            this.field453[var5] = this.field453[var5 - 1];
            this.field454[var5] = this.field454[var5 - 1];
        }
        this.field452[0] = arg2;
        this.field453[0] = arg0;
        this.field454[0] = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILWJQTPVDG;IBI)V")
    public final void method115(int arg0, class65 arg1, int arg2, byte arg3, int arg4) {
        if (arg1.field1594 == 0 && arg1.field1629 != null) {
            if (!arg1.field1601 || this.field554 == arg1.field1640 || this.field430 == arg1.field1640 || this.field254 == arg1.field1640) {
                int var6 = class6.field53;
                int var7 = class6.field51;
                int var8 = class6.field54;
                int var9 = class6.field52;
                class6.method19(-180, arg0, arg1.field1618 + arg0, arg1.field1610 + arg2, arg2);
                int var10 = arg1.field1629.length;
                if (arg3 != -88) {
                    this.field596 = this.field297.method194();
                }
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field1627[var11] + arg2;
                    int var13 = arg1.field1644[var11] + arg0 - arg4;
                    class65 var14 = class65.method577(arg1.field1629[var11]);
                    int var15 = var14.field1625 + var12;
                    int var16 = var14.field1580 + var13;
                    if (var14.field1585 > 0) {
                        this.method103(var14, -859);
                    }
                    if (var14.field1594 == 0) {
                        if (var14.field1598 > var14.field1604 - var14.field1618) {
                            var14.field1598 = var14.field1604 - var14.field1618;
                        }
                        if (var14.field1598 < 0) {
                            var14.field1598 = 0;
                        }
                        this.method115(var16, var14, var15, (byte) -88, var14.field1598);
                        if (var14.field1604 > var14.field1618) {
                            this.method147((byte) 17, var16, var14.field1610 + var15, var14.field1598, var14.field1618, var14.field1604);
                        }
                    } else if (var14.field1594 != 1) {
                        if (var14.field1594 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1618; ++var18) {
                                for (int var19 = 0; var19 < var14.field1610; ++var19) {
                                    int var20 = (var14.field1608 + 32) * var19 + var15;
                                    int var21 = (var14.field1614 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1592[var17];
                                        var21 += var14.field1641[var17];
                                    }
                                    if (var14.field1617[var17] <= 0) {
                                        if (var14.field1646 != null && var17 < 20) {
                                            class56 var30 = var14.field1646[var17];
                                            if (var30 != null) {
                                                var30.method507(var20, this.field549, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1617[var17] - 1;
                                        if (var20 > class6.field53 - 32 && var20 < class6.field54 && var21 > class6.field51 - 32 && var21 < class6.field52 || this.field575 != 0 && this.field574 == var17) {
                                            int var25 = 0;
                                            if (this.field311 == 1 && this.field312 == var17 && this.field313 == var14.field1640) {
                                                var25 = 16777215;
                                            }
                                            class56 var26 = class34.method352(var25, var24, var14.field1623[var17], this.field128);
                                            if (var26 != null) {
                                                if (this.field575 != 0 && this.field574 == var17 && this.field573 == var14.field1640) {
                                                    var22 = super.field1127 - this.field576;
                                                    var23 = super.field1128 - this.field577;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field241 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method509(var20 + var22, 128, (byte) 16, var21 + var23);
                                                    if (var21 + var23 < class6.field51 && arg1.field1598 > 0) {
                                                        int var27 = (class6.field51 - var21 - var23) * this.field263 / 3;
                                                        if (var27 > this.field263 * 10) {
                                                            var27 = this.field263 * 10;
                                                        }
                                                        if (var27 > arg1.field1598) {
                                                            var27 = arg1.field1598;
                                                        }
                                                        arg1.field1598 -= var27;
                                                        this.field577 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class6.field52 && arg1.field1598 < arg1.field1604 - arg1.field1618) {
                                                        int var28 = (var21 + var23 + 32 - class6.field52) * this.field263 / 3;
                                                        if (var28 > this.field263 * 10) {
                                                            var28 = this.field263 * 10;
                                                        }
                                                        if (var28 > arg1.field1604 - arg1.field1618 - arg1.field1598) {
                                                            var28 = arg1.field1604 - arg1.field1618 - arg1.field1598;
                                                        }
                                                        arg1.field1598 += var28;
                                                        this.field577 -= var28;
                                                    }
                                                } else if (this.field564 != 0 && this.field563 == var17 && this.field562 == var14.field1640) {
                                                    var26.method509(var20, 128, (byte) 16, var21);
                                                } else {
                                                    var26.method507(var20, this.field549, var21);
                                                }
                                                if (var26.field1440 == 33 || var14.field1623[var17] != 1) {
                                                    int var29 = var14.field1623[var17];
                                                    this.field220.method236(var20 + 1 + var22, false, 0, method43(var29, false), var21 + 10 + var23);
                                                    this.field220.method236(var20 + var22, false, 16776960, method43(var29, false), var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1594 == 3) {
                            boolean var31 = false;
                            if (this.field254 == var14.field1640 || this.field430 == var14.field1640 || this.field554 == var14.field1640) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method50(var14, false)) {
                                var32 = var14.field1633;
                                if (var31 && var14.field1590 != 0) {
                                    var32 = var14.field1590;
                                }
                            } else {
                                var32 = var14.field1584;
                                if (var31 && var14.field1575 != 0) {
                                    var32 = var14.field1575;
                                }
                            }
                            if (var14.field1579 == 0) {
                                if (var14.field1612) {
                                    class6.method22(var14.field1610, -16614, var15, var14.field1618, var32, var16);
                                } else {
                                    class6.method23(var14.field1618, var14.field1610, var32, var15, this.field501, var16);
                                }
                            } else if (var14.field1612) {
                                class6.method21(256 - (var14.field1579 & 255), false, var14.field1610, var16, var14.field1618, var15, var32);
                            } else {
                                class6.method24(var14.field1610, var16, var14.field1618, var32, var15, 256 - (var14.field1579 & 255), false);
                            }
                        } else if (var14.field1594 == 4) {
                            class11 var33 = var14.field1609;
                            String var34 = var14.field1613;
                            boolean var35 = false;
                            if (this.field254 == var14.field1640 || this.field430 == var14.field1640 || this.field554 == var14.field1640) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method50(var14, false)) {
                                var36 = var14.field1633;
                                if (var35 && var14.field1590 != 0) {
                                    var36 = var14.field1590;
                                }
                                if (var14.field1652.length() > 0) {
                                    var34 = var14.field1652;
                                }
                            } else {
                                var36 = var14.field1584;
                                if (var35 && var14.field1575 != 0) {
                                    var36 = var14.field1575;
                                }
                            }
                            if (var14.field1607 == 6 && this.field481) {
                                var34 = "Please wait...";
                                var36 = var14.field1584;
                            }
                            if (class6.field49 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field673 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method107(32, this.method49(4, var14, 5200)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method107(32, this.method49(3, var14, 5200)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method107(32, this.method49(2, var14, 5200)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method107(32, this.method49(1, var14, 5200)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method107(32, this.method49(0, var14, 5200)) + var34.substring(var38 + 2);
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
                                if (var14.field1637) {
                                    var33.method233(var37, var36, var14.field1600, var14.field1610 / 2 + var15, var44, false);
                                } else {
                                    var33.method240(0, var15, var37, var14.field1600, var44, var36);
                                }
                                var37 += var33.field673;
                            }
                        } else if (var14.field1594 == 5) {
                            class56 var45;
                            if (this.method50(var14, false)) {
                                var45 = var14.field1636;
                            } else {
                                var45 = var14.field1628;
                            }
                            if (var45 != null) {
                                var45.method507(var15, this.field549, var16);
                            }
                        } else if (var14.field1594 == 6) {
                            int var46 = class39.field1150;
                            int var47 = class39.field1151;
                            class39.field1150 = var14.field1610 / 2 + var15;
                            class39.field1151 = var14.field1618 / 2 + var16;
                            int var48 = class39.field1154[var14.field1577] * var14.field1576 >> 16;
                            int var49 = class39.field1155[var14.field1577] * var14.field1576 >> 16;
                            boolean var50 = this.method50(var14, false);
                            int var51;
                            if (var50) {
                                var51 = var14.field1651;
                            } else {
                                var51 = var14.field1650;
                            }
                            class16 var52;
                            if (var51 == -1) {
                                var52 = var14.method572(-1, var50, -1, (byte) -112);
                            } else {
                                class67 var53 = class67.field1666[var51];
                                var52 = var14.method572(var53.field1669[var14.field1597], var50, var53.field1668[var14.field1597], (byte) -112);
                            }
                            if (var52 != null) {
                                var52.method281(0, var14.field1578, 0, var14.field1577, 0, var48, var49);
                            }
                            class39.field1150 = var46;
                            class39.field1151 = var47;
                        } else {
                            if (var14.field1594 == 7) {
                                class11 var54 = var14.field1609;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1618; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1610; ++var57) {
                                        if (var14.field1617[var55] > 0) {
                                            class34 var58 = class34.method346(var14.field1617[var55] - 1);
                                            String var59 = String.valueOf(var58.field1008);
                                            if (var58.field988 || var14.field1623[var55] != 1) {
                                                var59 = var59 + " x" + method91((byte) 6, var14.field1623[var55]);
                                            }
                                            int var60 = (var14.field1608 + 115) * var57 + var15;
                                            int var61 = (var14.field1614 + 12) * var56 + var16;
                                            if (var14.field1637) {
                                                var54.method233(var61, var14.field1584, var14.field1600, var14.field1610 / 2 + var60, var59, false);
                                            } else {
                                                var54.method240(0, var60, var61, var14.field1600, var59, var14.field1584);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1594 == 8 && (this.field182 == var14.field1640 || this.field143 == var14.field1640 || this.field226 == var14.field1640) && this.field484 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class11 var64 = this.field221;
                                String var65 = var14.field1613;
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
                                    int var74 = var64.method234(var73, (byte) -86);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field673 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1610 + var15 - 5 - var62;
                                int var67 = var14.field1618 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg1.field1610 + arg2) {
                                    var66 = arg1.field1610 + arg2 - var62;
                                }
                                if (var63 + var67 > arg1.field1618 + arg0) {
                                    var67 = arg1.field1618 + arg0 - var63;
                                }
                                class6.method22(var62, -16614, var66, var63, 16777120, var67);
                                class6.method23(var63, var62, 0, var66, this.field501, var67);
                                String var68 = var14.field1613;
                                int var69 = var64.field673 + var67 + 2;
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
                                    var64.method240(0, var66 + 3, var69, false, var71, 0);
                                    var69 += var64.field673 + 1;
                                }
                            }
                        }
                    }
                }
                class6.method19(-180, var7, var9, var8, var6);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public void method116(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field388);
        if (this.field612 != null) {
            System.out.println("Od-cycle:" + this.field612.field1518);
        }
        System.out.println("loop-cycle:" + field471);
        System.out.println("draw-cycle:" + field194);
        System.out.println("ptype:" + this.field596);
        System.out.println("psize:" + this.field595);
        if (this.field351 != null) {
            this.field351.method551(302);
        }
        super.field1116 = true;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/awt/Component;")
    public final Component method117(byte arg0) {
        if (arg0 != 0) {
            this.method176();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1122 != null ? super.field1122 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method118(String arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field589; ++var3) {
                if (arg0.equalsIgnoreCase(this.field204[var3])) {
                    return true;
                }
            }
            if (arg1 != 0) {
                throw new NullPointerException();
            } else {
                return arg0.equalsIgnoreCase(field394.field1081);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(BI)V")
    public final void method119(byte arg0, int arg1) {
        if (arg0 != -11) {
            this.field596 = this.field297.method194();
        }
        class65 var3 = class65.method577(arg1);
        for (int var4 = 0; var4 < var3.field1629.length && var3.field1629[var4] != -1; ++var4) {
            class65 var5 = class65.method577(var3.field1629[var4]);
            if (var5.field1594 == 1) {
                this.method119((byte) -11, var5.field1640);
            }
            var5.field1597 = 0;
            var5.field1648 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method120(byte arg0) {
        this.method90(false);
        if (this.field571 == 1) {
            this.field559[this.field570 / 100].method507(this.field568 - 8 - 4, this.field549, this.field569 - 8 - 4);
        }
        if (this.field571 == 2) {
            this.field559[this.field570 / 100 + 4].method507(this.field568 - 8 - 4, this.field549, this.field569 - 8 - 4);
        }
        if (this.field345 != -1) {
            this.method81(this.field263, this.field345, (byte) 0);
            this.method115(0, class65.method577(this.field345), 0, (byte) -88, 0);
        }
        if (this.field466 != -1) {
            this.method81(this.field263, this.field466, (byte) 0);
            this.method115(0, class65.method577(this.field466), 0, (byte) -88, 0);
        }
        this.method99((byte) -113);
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field596 = this.field297.method194();
        }
        if (!this.field439) {
            this.method165((byte) 8);
            this.method151(6374);
        } else if (this.field379 == 0) {
            this.method141(false);
        }
        if (this.field515 == 1) {
            this.field161.method507(472, this.field549, 296);
        }
        if (field159) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field1115 < 30 && field293) {
                var5 = 16711680;
            }
            if (super.field1115 < 20 && !field293) {
                var5 = 16711680;
            }
            this.field221.method231(var5, var4, var3, (byte) 25, "Fps:" + super.field1115);
            int var14 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field293) {
                int var9 = 16711680;
            }
            if (var7 > 67108864 && !field293) {
                int var10 = 16711680;
            }
            this.field221.method231(16776960, var14, var3, (byte) 25, "Mem:" + var7 + "k");
            var14 += 15;
        }
        if (this.field493 != 0) {
            int var11 = this.field493 / 50;
            int var12 = var11 / 60;
            int var13 = var11 % 60;
            if (var13 < 10) {
                this.field221.method236(4, false, 16776960, "System update in: " + var12 + ":0" + var13, 329);
            } else {
                this.field221.method236(4, false, 16776960, "System update in: " + var12 + ":" + var13, 329);
            }
            ++field401;
            if (field401 > 188) {
                field401 = 0;
                this.field336.method183(175, this.field230);
                this.field336.method187(10814849);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method121(byte arg0) {
        for (class54 var2 = (class54) this.field578.method567(); var2 != null; var2 = (class54) this.field578.method569(false)) {
            if (this.field510 == var2.field1405 && field471 <= var2.field1427) {
                if (field471 >= var2.field1426) {
                    if (var2.field1404 > 0) {
                        class25 var4 = this.field153[var2.field1404 - 1];
                        if (var4 != null && var4.field1305 >= 0 && var4.field1305 < 13312 && var4.field1306 >= 0 && var4.field1306 < 13312) {
                            var2.method499(var4.field1305, var4.field1306, 0, this.method60(var4.field1306, 0, var2.field1405, var4.field1305) - var2.field1423, field471);
                        }
                    }
                    if (var2.field1404 < 0) {
                        int var5 = -var2.field1404 - 1;
                        class36 var6;
                        if (this.field149 == var5) {
                            var6 = field394;
                        } else {
                            var6 = this.field235[var5];
                        }
                        if (var6 != null && var6.field1305 >= 0 && var6.field1305 < 13312 && var6.field1306 >= 0 && var6.field1306 < 13312) {
                            var2.method499(var6.field1305, var6.field1306, 0, this.method60(var6.field1306, 0, var2.field1405, var6.field1305) - var2.field1423, field471);
                        }
                    }
                    var2.method500(this.field263, (byte) 9);
                    this.field591.method459(9, var2, this.field510, (int) var2.field1414, false, (int) var2.field1413, var2.field1416, -1, 60, (int) var2.field1415);
                }
            } else {
                var2.method1();
            }
        }
        ++field157;
        if (this.field253 != arg0) {
            this.field501 = -77;
        }
        if (field157 > 1712) {
            field157 = 0;
            this.field336.method183(23, this.field230);
            this.field336.method184(0);
            int var3 = this.field336.field646;
            this.field336.method184((int) (Math.random() * 256.0D));
            this.field336.method185(9019);
            this.field336.method185(61258);
            this.field336.method184(42);
            this.field336.method184((int) (Math.random() * 256.0D));
            this.field336.method184((int) (Math.random() * 256.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field336.method184(188);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field336.method184(170);
            }
            this.field336.method184((int) (Math.random() * 256.0D));
            this.field336.method184((int) (Math.random() * 256.0D));
            this.field336.method193(this.field336.field646 - var3, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method122(boolean arg0) {
        if (!arg0) {
            field386 = -79;
        }
        if (!this.field271 && !this.field461 && !this.field487) {
            ++field471;
            if (!this.field132) {
                this.method76(false);
            } else {
                this.method180(false);
            }
            this.method153(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method123(int arg0) {
        int var2 = 5;
        this.field126[8] = 0;
        int var3 = 0;
        while (arg0 >= 0) {
            this.field336.method184(220);
        }
        while (this.field126[8] == 0) {
            String var4 = "Unknown problem";
            this.method149("Connecting to web server", 20, false);
            try {
                DataInputStream var5 = this.method150("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 359);
                class10 var6 = new class10(new byte[40], field386);
                var5.readFully(var6.field645, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field126[var7] = var6.method199();
                }
                int var8 = var6.method199();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field126[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field126[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field126[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field126[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field126[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field126[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method149("Game updated - please reload page", 10, false);
                        var11 = 10;
                    } else {
                        this.method149(var4 + " - Will retry in " + var11 + " secs.", 10, false);
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
                this.field364 = !this.field364;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (this.field417 == null) {
            super.field1120 = null;
            this.field536 = null;
            this.field534 = null;
            this.field533 = null;
            this.field535 = null;
            this.field249 = null;
            this.field250 = null;
            this.field251 = null;
            this.field420 = new class28(this.method117((byte) 0), 128, (byte) 0, 265);
            class6.method20(12847);
            this.field421 = new class28(this.method117((byte) 0), 128, (byte) 0, 265);
            class6.method20(12847);
            this.field417 = new class28(this.method117((byte) 0), 509, (byte) 0, 171);
            class6.method20(12847);
            this.field418 = new class28(this.method117((byte) 0), 360, (byte) 0, 132);
            class6.method20(12847);
            this.field419 = new class28(this.method117((byte) 0), 360, (byte) 0, 200);
            class6.method20(12847);
            this.field422 = new class28(this.method117((byte) 0), 202, (byte) 0, 238);
            class6.method20(12847);
            if (arg0 >= 0) {
                this.method176();
            }
            this.field423 = new class28(this.method117((byte) 0), 203, (byte) 0, 238);
            class6.method20(12847);
            this.field424 = new class28(this.method117((byte) 0), 74, (byte) 0, 94);
            class6.method20(12847);
            this.field425 = new class28(this.method117((byte) 0), 75, (byte) 0, 94);
            class6.method20(12847);
            if (this.field229 != null) {
                this.method101(0);
                this.method80(-19609);
            }
            this.field593 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method125(boolean arg0, int arg1) {
        this.method124(this.field158);
        this.field419.method327((byte) 4);
        this.field138.method424(0, this.field549, 0);
        if (arg1 != 0) {
            field545 = true;
        }
        short var3 = 360;
        short var4 = 200;
        if (this.field142 == 0) {
            int var5 = var4 / 2 + 80;
            this.field220.method233(var5, 7711145, true, var3 / 2, this.field612.field1514, false);
            int var6 = var4 / 2 - 20;
            this.field222.method233(var6, 16776960, true, var3 / 2, "Welcome to RuneScape", false);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field139.method424(var7 - 73, this.field549, var8 - 20);
            this.field222.method233(var8 + 5, 16777215, true, var7, "New User", false);
            int var9 = var3 / 2 + 80;
            this.field139.method424(var9 - 73, this.field549, var8 - 20);
            this.field222.method233(var8 + 5, 16777215, true, var9, "Existing User", false);
        }
        if (this.field142 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field621.length() > 0) {
                this.field222.method233(var10 - 15, 16776960, true, var3 / 2, this.field621, false);
                this.field222.method233(var10, 16776960, true, var3 / 2, this.field622, false);
                var10 += 30;
            } else {
                this.field222.method233(var10 - 7, 16776960, true, var3 / 2, this.field622, false);
                var10 += 30;
            }
            this.field222.method240(0, var3 / 2 - 90, var10, true, "Username: " + this.field411 + (this.field219 == 0 & field471 % 40 < 20 ? "@yel@|" : ""), 16777215);
            var10 += 15;
            this.field222.method240(0, var3 / 2 - 88, var10, true, "Password: " + class71.method602(this.field412, 7) + (this.field219 == 1 & field471 % 40 < 20 ? "@yel@|" : ""), 16777215);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field139.method424(var11 - 73, this.field549, var12 - 20);
                this.field222.method233(var12 + 5, 16777215, true, var11, "Login", false);
                int var13 = var3 / 2 + 80;
                this.field139.method424(var13 - 73, this.field549, var12 - 20);
                this.field222.method233(var12 + 5, 16777215, true, var13, "Cancel", false);
            }
        }
        if (this.field142 == 3) {
            this.field222.method233(var4 / 2 - 60, 16776960, true, var3 / 2, "Create a free account", false);
            int var14 = var4 / 2 - 35;
            this.field222.method233(var14, 16777215, true, var3 / 2, "To create a new account you need to", false);
            int var18 = var14 + 15;
            this.field222.method233(var18, 16777215, true, var3 / 2, "go back to the main RuneScape webpage", false);
            int var19 = var18 + 15;
            this.field222.method233(var19, 16777215, true, var3 / 2, "and choose the 'create account'", false);
            int var20 = var19 + 15;
            this.field222.method233(var20, 16777215, true, var3 / 2, "button near the top of that page.", false);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field139.method424(var15 - 73, this.field549, var16 - 20);
            this.field222.method233(var16 + 5, 16777215, true, var15, "Cancel", false);
        }
        this.field419.method328(202, 171, super.field1119, 0);
        if (this.field593) {
            this.field593 = false;
            this.field417.method328(128, 0, super.field1119, 0);
            this.field418.method328(202, 371, super.field1119, 0);
            this.field422.method328(0, 265, super.field1119, 0);
            this.field423.method328(562, 265, super.field1119, 0);
            this.field424.method328(128, 171, super.field1119, 0);
            this.field425.method328(562, 171, super.field1119, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
    public final void method126(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field589 >= 100 && this.field147 != 1) {
                this.method114("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, 0);
            } else if (this.field589 >= 200) {
                this.method114("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, 0);
            } else {
                String var4 = class71.method601(class71.method598(arg0, -491), 8384);
                for (int var5 = 0; var5 < this.field589; ++var5) {
                    if (this.field440[var5] == arg0) {
                        this.method114("", var4 + " is already on your friend list", 0, 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field611; ++var6) {
                    if (this.field473[var6] == arg0) {
                        this.method114("", "Please remove " + var4 + " from your ignore list first", 0, 0);
                        return;
                    }
                }
                this.field595 += arg1;
                if (!var4.equals(field394.field1081)) {
                    this.field204[this.field589] = var4;
                    this.field440[this.field589] = arg0;
                    this.field442[this.field589] = 0;
                    ++this.field589;
                    this.field472 = true;
                    this.field336.method183(221, this.field230);
                    this.field336.method190(5, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILWJQTPVDG;III)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3, class65 arg4, int arg5, int arg6, int arg7) {
        if (this.field346 == arg7) {
            if (arg4.field1594 == 0 && arg4.field1629 != null && !arg4.field1601) {
                if (arg0 >= arg1 && arg5 >= arg2 && arg0 <= arg4.field1610 + arg1 && arg5 <= arg4.field1618 + arg2) {
                    int var9 = arg4.field1629.length;
                    for (int var10 = 0; var10 < var9; ++var10) {
                        int var11 = arg4.field1627[var10] + arg1;
                        int var12 = arg4.field1644[var10] + arg2 - arg3;
                        class65 var13 = class65.method577(arg4.field1629[var10]);
                        int var14 = var13.field1625 + var11;
                        int var15 = var13.field1580 + var12;
                        if ((var13.field1635 >= 0 || var13.field1575 != 0) && arg0 >= var14 && arg5 >= var15 && arg0 < var13.field1610 + var14 && arg5 < var13.field1618 + var15) {
                            if (var13.field1635 >= 0) {
                                this.field376 = var13.field1635;
                            } else {
                                this.field376 = var13.field1640;
                            }
                        }
                        if (var13.field1594 == 8 && arg0 >= var14 && arg5 >= var15 && arg0 < var13.field1610 + var14 && arg5 < var13.field1618 + var15) {
                            this.field464 = var13.field1640;
                        }
                        if (var13.field1594 == 0) {
                            this.method127(arg0, var14, var15, var13.field1598, var13, arg5, arg6, 1);
                            if (var13.field1604 > var13.field1618) {
                                this.method174(var15, var13.field1618, arg5, arg0, var13.field1610 + var14, var13, var13.field1604, arg6, false);
                            }
                        } else {
                            if (var13.field1607 == 1 && arg0 >= var14 && arg5 >= var15 && arg0 < var13.field1610 + var14 && arg5 < var13.field1618 + var15) {
                                boolean var16 = false;
                                if (var13.field1585 != 0) {
                                    var16 = this.method177(this.field156, var13);
                                }
                                if (!var16) {
                                    this.field122[this.field407] = var13.field1643;
                                    this.field279[this.field407] = 585;
                                    this.field278[this.field407] = var13.field1640;
                                    ++this.field407;
                                }
                            }
                            if (var13.field1607 == 2 && this.field347 == 0 && arg0 >= var14 && arg5 >= var15 && arg0 < var13.field1610 + var14 && arg5 < var13.field1618 + var15) {
                                String var17 = var13.field1630;
                                if (var17.indexOf(" ") != -1) {
                                    var17 = var17.substring(0, var17.indexOf(" "));
                                }
                                this.field122[this.field407] = var17 + " @gre@" + var13.field1602;
                                this.field279[this.field407] = 407;
                                this.field278[this.field407] = var13.field1640;
                                ++this.field407;
                            }
                            if (var13.field1607 == 3 && arg0 >= var14 && arg5 >= var15 && arg0 < var13.field1610 + var14 && arg5 < var13.field1618 + var15) {
                                this.field122[this.field407] = "Close";
                                if (arg6 == 3) {
                                    this.field279[this.field407] = 850;
                                } else {
                                    this.field279[this.field407] = 48;
                                }
                                this.field278[this.field407] = var13.field1640;
                                ++this.field407;
                            }
                            if (var13.field1607 == 4 && arg0 >= var14 && arg5 >= var15 && arg0 < var13.field1610 + var14 && arg5 < var13.field1618 + var15) {
                                this.field122[this.field407] = var13.field1643;
                                this.field279[this.field407] = 899;
                                this.field278[this.field407] = var13.field1640;
                                ++this.field407;
                            }
                            if (var13.field1607 == 5 && arg0 >= var14 && arg5 >= var15 && arg0 < var13.field1610 + var14 && arg5 < var13.field1618 + var15) {
                                this.field122[this.field407] = var13.field1643;
                                this.field279[this.field407] = 551;
                                this.field278[this.field407] = var13.field1640;
                                ++this.field407;
                            }
                            if (var13.field1607 == 6 && !this.field481 && arg0 >= var14 && arg5 >= var15 && arg0 < var13.field1610 + var14 && arg5 < var13.field1618 + var15) {
                                this.field122[this.field407] = var13.field1643;
                                this.field279[this.field407] = 594;
                                this.field278[this.field407] = var13.field1640;
                                ++this.field407;
                            }
                            if (var13.field1594 == 2) {
                                int var18 = 0;
                                for (int var19 = 0; var19 < var13.field1618; ++var19) {
                                    for (int var20 = 0; var20 < var13.field1610; ++var20) {
                                        int var21 = (var13.field1608 + 32) * var20 + var14;
                                        int var22 = (var13.field1614 + 32) * var19 + var15;
                                        if (var18 < 20) {
                                            var21 += var13.field1592[var18];
                                            var22 += var13.field1641[var18];
                                        }
                                        if (arg0 >= var21 && arg5 >= var22 && arg0 < var21 + 32 && arg5 < var22 + 32) {
                                            this.field397 = var18;
                                            this.field398 = var13.field1640;
                                            if (var13.field1617[var18] > 0) {
                                                class34 var23 = class34.method346(var13.field1617[var18] - 1);
                                                if (this.field311 == 1 && var13.field1621) {
                                                    if (this.field313 != var13.field1640 || this.field312 != var18) {
                                                        this.field122[this.field407] = "Use " + this.field315 + " with @lre@" + var23.field1008;
                                                        this.field279[this.field407] = 652;
                                                        this.field280[this.field407] = var23.field986;
                                                        this.field277[this.field407] = var18;
                                                        this.field278[this.field407] = var13.field1640;
                                                        ++this.field407;
                                                    }
                                                } else if (this.field347 == 1 && var13.field1621) {
                                                    if ((this.field349 & 16) == 16) {
                                                        this.field122[this.field407] = this.field350 + " @lre@" + var23.field1008;
                                                        this.field279[this.field407] = 399;
                                                        this.field280[this.field407] = var23.field986;
                                                        this.field277[this.field407] = var18;
                                                        this.field278[this.field407] = var13.field1640;
                                                        ++this.field407;
                                                    }
                                                } else {
                                                    if (var13.field1621) {
                                                        for (int var24 = 4; var24 >= 3; --var24) {
                                                            if (var23.field1037 != null && var23.field1037[var24] != null) {
                                                                this.field122[this.field407] = var23.field1037[var24] + " @lre@" + var23.field1008;
                                                                if (var24 == 3) {
                                                                    this.field279[this.field407] = 66;
                                                                }
                                                                if (var24 == 4) {
                                                                    this.field279[this.field407] = 529;
                                                                }
                                                                this.field280[this.field407] = var23.field986;
                                                                this.field277[this.field407] = var18;
                                                                this.field278[this.field407] = var13.field1640;
                                                                ++this.field407;
                                                            } else if (var24 == 4) {
                                                                this.field122[this.field407] = "Drop @lre@" + var23.field1008;
                                                                this.field279[this.field407] = 529;
                                                                this.field280[this.field407] = var23.field986;
                                                                this.field277[this.field407] = var18;
                                                                this.field278[this.field407] = var13.field1640;
                                                                ++this.field407;
                                                            }
                                                        }
                                                    }
                                                    if (var13.field1647) {
                                                        this.field122[this.field407] = "Use @lre@" + var23.field1008;
                                                        this.field279[this.field407] = 179;
                                                        this.field280[this.field407] = var23.field986;
                                                        this.field277[this.field407] = var18;
                                                        this.field278[this.field407] = var13.field1640;
                                                        ++this.field407;
                                                    }
                                                    if (var13.field1621 && var23.field1037 != null) {
                                                        for (int var25 = 2; var25 >= 0; --var25) {
                                                            if (var23.field1037[var25] != null) {
                                                                this.field122[this.field407] = var23.field1037[var25] + " @lre@" + var23.field1008;
                                                                if (var25 == 0) {
                                                                    this.field279[this.field407] = 343;
                                                                }
                                                                if (var25 == 1) {
                                                                    this.field279[this.field407] = 875;
                                                                }
                                                                if (var25 == 2) {
                                                                    this.field279[this.field407] = 794;
                                                                }
                                                                this.field280[this.field407] = var23.field986;
                                                                this.field277[this.field407] = var18;
                                                                this.field278[this.field407] = var13.field1640;
                                                                ++this.field407;
                                                            }
                                                        }
                                                    }
                                                    if (var13.field1583 != null) {
                                                        for (int var26 = 4; var26 >= 0; --var26) {
                                                            if (var13.field1583[var26] != null) {
                                                                this.field122[this.field407] = var13.field1583[var26] + " @lre@" + var23.field1008;
                                                                if (var26 == 0) {
                                                                    this.field279[this.field407] = 62;
                                                                }
                                                                if (var26 == 1) {
                                                                    this.field279[this.field407] = 352;
                                                                }
                                                                if (var26 == 2) {
                                                                    this.field279[this.field407] = 16;
                                                                }
                                                                if (var26 == 3) {
                                                                    this.field279[this.field407] = 887;
                                                                }
                                                                if (var26 == 4) {
                                                                    this.field279[this.field407] = 56;
                                                                }
                                                                this.field280[this.field407] = var23.field986;
                                                                this.field277[this.field407] = var18;
                                                                this.field278[this.field407] = var13.field1640;
                                                                ++this.field407;
                                                            }
                                                        }
                                                    }
                                                    this.field122[this.field407] = "Examine @lre@" + var23.field1008;
                                                    this.field279[this.field407] = 1934;
                                                    this.field280[this.field407] = var23.field986;
                                                    this.field277[this.field407] = var18;
                                                    this.field278[this.field407] = var13.field1640;
                                                    ++this.field407;
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
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LCMGGUSPR;BI)V")
    private final void method128(class10 arg0, byte arg1, int arg2) {
        if (arg1 == 0) {
            while (arg0.field647 + 10 < arg2 * 8) {
                int var4 = arg0.method205(11, -359);
                if (var4 == 2047) {
                    break;
                }
                if (this.field235[var4] == null) {
                    this.field235[var4] = new class36();
                    if (this.field240[var4] != null) {
                        this.field235[var4].method358(29328, this.field240[var4]);
                    }
                }
                this.field237[this.field236++] = var4;
                class36 var5 = this.field235[var4];
                var5.field1310 = field471;
                int var6 = arg0.method205(1, -359);
                if (var6 == 1) {
                    this.field239[this.field238++] = var4;
                }
                int var7 = arg0.method205(5, -359);
                if (var7 > 15) {
                    var7 -= 32;
                }
                int var8 = arg0.method205(1, -359);
                int var9 = arg0.method205(5, -359);
                if (var9 > 15) {
                    var9 -= 32;
                }
                var5.method442(false, var8 == 1, field394.field1292[0] + var9, field394.field1293[0] + var7);
            }
            arg0.method206(502);
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method129(int arg0) {
        if (arg0 < 0) {
            if (super.field1133 == 1) {
                if (super.field1134 >= 539 && super.field1134 <= 573 && super.field1135 >= 169 && super.field1135 < 205 && this.field300[0] != -1) {
                    this.field472 = true;
                    this.field463 = 0;
                    this.field208 = true;
                }
                if (super.field1134 >= 569 && super.field1134 <= 599 && super.field1135 >= 168 && super.field1135 < 205 && this.field300[1] != -1) {
                    this.field472 = true;
                    this.field463 = 1;
                    this.field208 = true;
                }
                if (super.field1134 >= 597 && super.field1134 <= 627 && super.field1135 >= 168 && super.field1135 < 205 && this.field300[2] != -1) {
                    this.field472 = true;
                    this.field463 = 2;
                    this.field208 = true;
                }
                if (super.field1134 >= 625 && super.field1134 <= 669 && super.field1135 >= 168 && super.field1135 < 203 && this.field300[3] != -1) {
                    this.field472 = true;
                    this.field463 = 3;
                    this.field208 = true;
                }
                if (super.field1134 >= 666 && super.field1134 <= 696 && super.field1135 >= 168 && super.field1135 < 205 && this.field300[4] != -1) {
                    this.field472 = true;
                    this.field463 = 4;
                    this.field208 = true;
                }
                if (super.field1134 >= 694 && super.field1134 <= 724 && super.field1135 >= 168 && super.field1135 < 205 && this.field300[5] != -1) {
                    this.field472 = true;
                    this.field463 = 5;
                    this.field208 = true;
                }
                if (super.field1134 >= 722 && super.field1134 <= 756 && super.field1135 >= 169 && super.field1135 < 205 && this.field300[6] != -1) {
                    this.field472 = true;
                    this.field463 = 6;
                    this.field208 = true;
                }
                if (super.field1134 >= 540 && super.field1134 <= 574 && super.field1135 >= 466 && super.field1135 < 502 && this.field300[7] != -1) {
                    this.field472 = true;
                    this.field463 = 7;
                    this.field208 = true;
                }
                if (super.field1134 >= 572 && super.field1134 <= 602 && super.field1135 >= 466 && super.field1135 < 503 && this.field300[8] != -1) {
                    this.field472 = true;
                    this.field463 = 8;
                    this.field208 = true;
                }
                if (super.field1134 >= 599 && super.field1134 <= 629 && super.field1135 >= 466 && super.field1135 < 503 && this.field300[9] != -1) {
                    this.field472 = true;
                    this.field463 = 9;
                    this.field208 = true;
                }
                if (super.field1134 >= 627 && super.field1134 <= 671 && super.field1135 >= 467 && super.field1135 < 502 && this.field300[10] != -1) {
                    this.field472 = true;
                    this.field463 = 10;
                    this.field208 = true;
                }
                if (super.field1134 >= 669 && super.field1134 <= 699 && super.field1135 >= 466 && super.field1135 < 503 && this.field300[11] != -1) {
                    this.field472 = true;
                    this.field463 = 11;
                    this.field208 = true;
                }
                if (super.field1134 >= 696 && super.field1134 <= 726 && super.field1135 >= 466 && super.field1135 < 503 && this.field300[12] != -1) {
                    this.field472 = true;
                    this.field463 = 12;
                    this.field208 = true;
                }
                if (super.field1134 >= 724 && super.field1134 <= 758 && super.field1135 >= 466 && super.field1135 < 502 && this.field300[13] != -1) {
                    this.field472 = true;
                    this.field463 = 13;
                    this.field208 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSDXDPBJK;II)V")
    public final void method130(class50 arg0, int arg1, int arg2) {
        if (arg2 != 19311) {
            this.field336.method184(50);
        }
        this.method131(190, arg0.field1305, arg0.field1306, arg1);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
    public final void method131(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
            int var5 = this.method60(arg2, 0, this.field510, arg1) - arg3;
            int var6 = 27 / arg0;
            int var7 = arg1 - this.field188;
            int var8 = var5 - this.field189;
            int var9 = arg2 - this.field190;
            int var10 = class16.field777[this.field191];
            int var11 = class16.field778[this.field191];
            int var12 = class16.field777[this.field192];
            int var13 = class16.field778[this.field192];
            int var14 = var7 * var13 + var9 * var12 >> 16;
            int var15 = var9 * var13 - var7 * var12 >> 16;
            int var17 = var8 * var11 - var10 * var15 >> 16;
            int var18 = var8 * var10 + var11 * var15 >> 16;
            if (var18 >= 50) {
                this.field123 = (var14 << 9) / var18 + class39.field1150;
                this.field124 = (var17 << 9) / var18 + class39.field1151;
            } else {
                this.field123 = -1;
                this.field124 = -1;
            }
        } else {
            this.field123 = -1;
            this.field124 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIILjava/lang/String;Ljava/lang/String;)LUUIGNTAD;")
    public final class59 method132(int arg0, byte arg1, int arg2, int arg3, String arg4, String arg5) {
        if (arg1 != 8) {
            field416 = 102;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field607[0] != null) {
                var7 = this.field607[0].method333(arg0, -593);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field581.reset();
            this.field581.update(var7);
            int var9 = (int) this.field581.getValue();
            if (arg3 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class59(0, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method149("Requesting " + arg4, arg2, false);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method150(arg5 + arg3);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class10 var17 = new class10(var16, field386);
                    var17.field646 = 3;
                    int var18 = var17.method198() + 6;
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
                            this.method149("Loading " + arg4 + " - " + var23 + "%", arg2, false);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field607[0] != null) {
                            this.field607[0].method334(arg0, 0, var7, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field607[0] = null;
                    }
                    if (var7 != null) {
                        this.field581.reset();
                        this.field581.update(var7);
                        int var24 = (int) this.field581.getValue();
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
                            this.method149("Game updated - please reload page", arg2, false);
                            var26 = 10;
                        } else {
                            this.method149(var12 + " - Retrying in " + var26, arg2, false);
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
                    this.field364 = !this.field364;
                }
            }
            return new class59(0, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)Z")
    public final boolean method133(byte arg0) {
        if (arg0 != 9) {
            this.field354 = !this.field354;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void method134(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            this.field507 = 109;
        }
        this.field369 = true;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field395[var3] = -1;
            for (int var4 = 0; var4 < class9.field113; ++var4) {
                if (!class9.field114[var4].field120 && class9.field114[var4].field115 == var3 + (this.field620 ? 0 : 7)) {
                    this.field395[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method135(byte arg0) {
        this.field183 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field511) {
                ++this.field388;
                this.method67((byte) 44);
                this.method67((byte) 44);
                this.method61(false);
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
        this.field183 = false;
        if (arg0 != 0) {
            this.field501 = 205;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
    public final boolean method136(int arg0, int arg1) {
        if (this.field516 != arg1) {
            this.field596 = -1;
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field279[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 166;
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method137(int arg0) {
        while (arg0 >= 0) {
            this.field230 = 196;
        }
        if (super.field1133 == 1) {
            if (super.field1134 >= 6 && super.field1134 <= 106 && super.field1135 >= 467 && super.field1135 <= 499) {
                this.field289 = (this.field289 + 1) % 4;
                this.field324 = true;
                this.field550 = true;
                this.field336.method183(205, this.field230);
                this.field336.method184(this.field289);
                this.field336.method184(this.field557);
                this.field336.method184(this.field209);
            }
            if (super.field1134 >= 135 && super.field1134 <= 235 && super.field1135 >= 467 && super.field1135 <= 499) {
                this.field557 = (this.field557 + 1) % 3;
                this.field324 = true;
                this.field550 = true;
                this.field336.method183(205, this.field230);
                this.field336.method184(this.field289);
                this.field336.method184(this.field557);
                this.field336.method184(this.field209);
            }
            if (super.field1134 >= 273 && super.field1134 <= 373 && super.field1135 >= 467 && super.field1135 <= 499) {
                this.field209 = (this.field209 + 1) % 3;
                this.field324 = true;
                this.field550 = true;
                this.field336.method183(205, this.field230);
                this.field336.method184(this.field289);
                this.field336.method184(this.field557);
                this.field336.method184(this.field209);
            }
            if (super.field1134 >= 412 && super.field1134 <= 512 && super.field1135 >= 467 && super.field1135 <= 499) {
                if (this.field466 == -1) {
                    this.method93(this.field136);
                    this.field441 = "";
                    this.field130 = false;
                    this.field371 = this.field466 = class65.field1591;
                    return;
                }
                this.method114("", "Please close the interface you have open before using 'report abuse'", 0, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
    public final void method138(byte arg0) {
        for (int var2 = -1; var2 < this.field236; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field234;
            } else {
                var3 = this.field237[var2];
            }
            class36 var4 = this.field235[var3];
            if (var4 != null) {
                this.method69(true, 1, var4);
            }
        }
        if (arg0 == 122) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method139(int arg0) {
        if (this.field575 == 0) {
            int var2 = super.field1133;
            if (this.field594 != arg0) {
                this.field596 = -1;
            }
            if (this.field347 == 1 && super.field1134 >= 516 && super.field1135 >= 160 && super.field1134 <= 765 && super.field1135 <= 205) {
                var2 = 0;
            }
            if (this.field439) {
                if (var2 != 1) {
                    int var3 = super.field1127;
                    int var4 = super.field1128;
                    if (this.field379 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field379 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field379 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field380 - 10 || var3 > this.field382 + this.field380 + 10 || var4 < this.field381 - 10 || var4 > this.field383 + this.field381 + 10) {
                        this.field439 = false;
                        if (this.field379 == 1) {
                            this.field472 = true;
                        }
                        if (this.field379 == 2) {
                            this.field550 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field380;
                    int var6 = this.field381;
                    int var7 = this.field382;
                    int var8 = super.field1134;
                    int var9 = super.field1135;
                    if (this.field379 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field379 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field379 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field407; ++var11) {
                        int var12 = (this.field407 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method102(var10, 254);
                    }
                    this.field439 = false;
                    if (this.field379 == 1) {
                        this.field472 = true;
                    }
                    if (this.field379 == 2) {
                        this.field550 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field407 > 0) {
                    int var13 = this.field279[this.field407 - 1];
                    if (var13 == 62 || var13 == 352 || var13 == 16 || var13 == 887 || var13 == 56 || var13 == 343 || var13 == 875 || var13 == 794 || var13 == 66 || var13 == 529 || var13 == 179 || var13 == 1934) {
                        int var14 = this.field277[this.field407 - 1];
                        int var15 = this.field278[this.field407 - 1];
                        class65 var16 = class65.method577(var15);
                        if (var16.field1642 || var16.field1587) {
                            this.field532 = false;
                            this.field241 = 0;
                            this.field573 = var15;
                            this.field574 = var14;
                            this.field575 = 2;
                            this.field576 = super.field1134;
                            this.field577 = super.field1135;
                            if (class65.method577(var15).field1622 == this.field466) {
                                this.field575 = 1;
                            }
                            if (class65.method577(var15).field1622 == this.field624) {
                                this.field575 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field332 == 1 || this.method136(this.field407 - 1, 31203)) && this.field407 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field407 > 0) {
                    this.method102(this.field407 - 1, 254);
                }
                if (var2 != 2 || this.field407 <= 0) {
                    return;
                }
                this.method85((byte) 3);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(JI)V")
    public final void method140(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field589; ++var4) {
                if (this.field440[var4] == arg0) {
                    --this.field589;
                    this.field472 = true;
                    for (int var5 = var4; var5 < this.field589; ++var5) {
                        this.field204[var5] = this.field204[var5 + 1];
                        this.field442[var5] = this.field442[var5 + 1];
                        this.field440[var5] = this.field440[var5 + 1];
                    }
                    this.field336.method183(167, this.field230);
                    this.field336.method190(5, arg0);
                    break;
                }
            }
            int var6 = 28 / arg1;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method141(boolean arg0) {
        int var2 = this.field380;
        int var3 = this.field381;
        int var4 = this.field382;
        int var5 = this.field383;
        int var6 = 6116423;
        class6.method22(var4, -16614, var2, var5, var6, var3);
        class6.method22(var4 - 2, -16614, var2 + 1, 16, 0, var3 + 1);
        if (arg0) {
            this.field596 = -1;
        }
        class6.method23(var5 - 19, var4 - 2, 0, var2 + 1, this.field501, var3 + 18);
        this.field222.method236(var2 + 3, false, var6, "Choose Option", var3 + 14);
        int var7 = super.field1127;
        int var8 = super.field1128;
        if (this.field379 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field379 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field379 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field407; ++var9) {
            int var10 = (this.field407 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field222.method240(0, var2 + 3, var10, true, this.field122[var9], var11);
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method142(int arg0) {
        if (this.field599 > 0) {
            this.method56(24238);
        } else {
            this.method57("Please wait - attempting to reestablish", 1912, "Connection lost");
            this.field181 = 0;
            this.field316 = 0;
            class60 var2 = this.field351;
            if (arg0 <= 0) {
                this.field623 = null;
            }
            this.field132 = false;
            this.field485 = 0;
            this.method63(this.field411, this.field412, true);
            if (!this.field132) {
                this.method56(24238);
            }
            try {
                var2.method546();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method143(int arg0) {
        this.field536.method327((byte) 4);
        class39.field1156 = this.field494;
        this.field595 += arg0;
        this.field202.method424(0, this.field549, 0);
        if (this.field449) {
            this.field222.method232(0, 239, false, 40, this.field330);
            this.field222.method232(128, 239, false, 60, this.field337 + "*");
        } else if (this.field320 == 1) {
            this.field222.method232(0, 239, false, 40, "Enter amount:");
            this.field222.method232(128, 239, false, 60, this.field353 + "*");
        } else if (this.field320 == 2) {
            this.field222.method232(0, 239, false, 40, "Enter name:");
            this.field222.method232(128, 239, false, 60, this.field353 + "*");
        } else if (this.field320 == 3) {
            if (this.field444 != this.field353) {
                this.method113(25258, this.field353);
                this.field444 = this.field353;
            }
            class11 var2 = this.field221;
            class6.method19(-180, 0, 77, 463, 0);
            for (int var3 = 0; var3 < this.field445; ++var3) {
                int var4 = var3 * 14 + 18 - this.field448;
                if (var4 > 0 && var4 < 110) {
                    var2.method232(0, 239, false, var4, this.field446[var3]);
                }
            }
            class6.method18(-798);
            if (this.field445 > 5) {
                this.method147((byte) 17, 0, 463, this.field448, 77, this.field445 * 14 + 7);
            }
            if (this.field353.length() == 0) {
                this.field222.method232(255, 239, false, 40, "Enter object name");
            } else if (this.field445 == 0) {
                this.field222.method232(0, 239, false, 40, "No matching objects found, please shorten search");
            }
            var2.method232(0, 239, false, 90, this.field353 + "*");
            class6.method25(479, 0, 0, 31754, 77);
        } else if (this.field140 != null) {
            this.field222.method232(0, 239, false, 40, this.field140);
            this.field222.method232(128, 239, false, 60, "Click to continue");
        } else if (this.field624 != -1) {
            this.method115(0, class65.method577(this.field624), 0, (byte) -88, 0);
        } else if (this.field374 != -1) {
            this.method115(0, class65.method577(this.field374), 0, (byte) -88, 0);
        } else {
            class11 var5 = this.field221;
            int var6 = 0;
            class6.method19(-180, 0, 77, 463, 0);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field454[var7] != null) {
                    int var9 = this.field452[var7];
                    int var10 = 70 - var6 * 14 + this.field175;
                    String var11 = this.field453[var7];
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
                            var5.method236(4, false, 0, this.field454[var7], var10);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field289 == 0 || this.field289 == 1 && this.method118(var11, 0))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field483[0].method424(var13, this.field549, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field483[1].method424(var13, this.field549, var10 - 12);
                                var13 += 14;
                            }
                            var5.method236(var13, false, 0, var11 + ":", var10);
                            int var14 = var13 + var5.method234(var11, (byte) -86) + 8;
                            var5.method236(var14, false, 255, this.field454[var7], var10);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field355 == 0 && (var9 == 7 || this.field557 == 0 || this.field557 == 1 && this.method118(var11, 0))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method236(var15, false, 0, "From", var10);
                            int var16 = var15 + var5.method234("From ", (byte) -86);
                            if (var12 == 1) {
                                this.field483[0].method424(var16, this.field549, var10 - 12);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field483[1].method424(var16, this.field549, var10 - 12);
                                var16 += 14;
                            }
                            var5.method236(var16, false, 0, var11 + ":", var10);
                            int var17 = var16 + var5.method234(var11, (byte) -86) + 8;
                            var5.method236(var17, false, 8388608, this.field454[var7], var10);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field209 == 0 || this.field209 == 1 && this.method118(var11, 0))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method236(4, false, 8388736, var11 + " " + this.field454[var7], var10);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field355 == 0 && this.field557 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method236(4, false, 8388608, this.field454[var7], var10);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field355 == 0 && this.field557 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method236(4, false, 0, "To " + var11 + ":", var10);
                            var5.method236(12 + var5.method234("To " + var11, (byte) -86), false, 8388608, this.field454[var7], var10);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field209 == 0 || this.field209 == 1 && this.method118(var11, 0))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method236(4, false, 8270336, var11 + " " + this.field454[var7], var10);
                        }
                        ++var6;
                    }
                }
            }
            class6.method18(-798);
            this.field242 = var6 * 14 + 7;
            if (this.field242 < 78) {
                this.field242 = 78;
            }
            this.method147((byte) 17, 0, 463, this.field242 - this.field175 - 77, 77, this.field242);
            String var8;
            if (field394 != null && field394.field1081 != null) {
                var8 = field394.field1081;
            } else {
                var8 = class71.method601(this.field411, 8384);
            }
            var5.method236(4, false, 0, var8 + ":", 90);
            var5.method236(6 + var5.method234(var8 + ": ", (byte) -86), false, 255, this.field459 + "*", 90);
            class6.method25(479, 0, 0, 31754, 77);
        }
        if (this.field439 && this.field379 == 2) {
            this.method141(false);
        }
        this.field536.method328(17, 357, super.field1119, 0);
        this.field535.method327((byte) 4);
        class39.field1156 = this.field496;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILTQRZOVPP;II)V")
    public final void method144(int arg0, int arg1, class57 arg2, int arg3, int arg4) {
        if (this.field407 < 400) {
            if (arg2.field1447 != null) {
                arg2 = arg2.method515((byte) 73);
            }
            if (arg2 != null) {
                if (arg2.field1459) {
                    String var6 = arg2.field1456;
                    if (arg4 <= 0) {
                        this.field594 = this.field470.method437();
                    }
                    if (arg2.field1476 != 0) {
                        var6 = var6 + method172((byte) 2, arg2.field1476, field394.field1071) + " (level-" + arg2.field1476 + ")";
                    }
                    if (this.field311 == 1) {
                        this.field122[this.field407] = "Use " + this.field315 + " with @yel@" + var6;
                        this.field279[this.field407] = 683;
                        this.field280[this.field407] = arg3;
                        this.field277[this.field407] = arg1;
                        this.field278[this.field407] = arg0;
                        ++this.field407;
                    } else {
                        if (this.field347 == 1) {
                            if ((this.field349 & 2) == 2) {
                                this.field122[this.field407] = this.field350 + " @yel@" + var6;
                                this.field279[this.field407] = 898;
                                this.field280[this.field407] = arg3;
                                this.field277[this.field407] = arg1;
                                this.field278[this.field407] = arg0;
                                ++this.field407;
                                return;
                            }
                        } else {
                            if (arg2.field1458 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg2.field1458[var7] != null && !arg2.field1458[var7].equalsIgnoreCase("attack")) {
                                        this.field122[this.field407] = arg2.field1458[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field279[this.field407] = 488;
                                        }
                                        if (var7 == 1) {
                                            this.field279[this.field407] = 642;
                                        }
                                        if (var7 == 2) {
                                            this.field279[this.field407] = 830;
                                        }
                                        if (var7 == 3) {
                                            this.field279[this.field407] = 22;
                                        }
                                        if (var7 == 4) {
                                            this.field279[this.field407] = 295;
                                        }
                                        this.field280[this.field407] = arg3;
                                        this.field277[this.field407] = arg1;
                                        this.field278[this.field407] = arg0;
                                        ++this.field407;
                                    }
                                }
                            }
                            if (arg2.field1458 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field1458[var8] != null && arg2.field1458[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg2.field1476 > field394.field1071) {
                                            var9 = 2000;
                                        }
                                        this.field122[this.field407] = arg2.field1458[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field279[this.field407] = var9 + 488;
                                        }
                                        if (var8 == 1) {
                                            this.field279[this.field407] = var9 + 642;
                                        }
                                        if (var8 == 2) {
                                            this.field279[this.field407] = var9 + 830;
                                        }
                                        if (var8 == 3) {
                                            this.field279[this.field407] = var9 + 22;
                                        }
                                        if (var8 == 4) {
                                            this.field279[this.field407] = var9 + 295;
                                        }
                                        this.field280[this.field407] = arg3;
                                        this.field277[this.field407] = arg1;
                                        this.field278[this.field407] = arg0;
                                        ++this.field407;
                                    }
                                }
                            }
                            this.field122[this.field407] = "Examine @yel@" + var6;
                            this.field279[this.field407] = 1986;
                            this.field280[this.field407] = arg3;
                            this.field277[this.field407] = arg1;
                            this.field278[this.field407] = arg0;
                            ++this.field407;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(LCMGGUSPR;BI)V")
    private final void method145(class10 arg0, byte arg1, int arg2) {
        this.field275 = 0;
        this.field238 = 0;
        if (this.field281 == arg1) {
            boolean var4 = false;
            this.method48(arg2, (byte) 0, arg0);
            this.method42(arg0, (byte) -75, arg2);
            this.method128(arg0, this.field553, arg2);
            this.method98(424, arg2, arg0);
            for (int var5 = 0; var5 < this.field275; ++var5) {
                int var7 = this.field276[var5];
                if (field471 != this.field235[var7].field1310) {
                    this.field235[var7] = null;
                }
            }
            if (arg0.field646 != arg2) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field646 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var6 = 0; var6 < this.field236; ++var6) {
                    if (this.field235[this.field237[var6]] == null) {
                        signlink.reporterror(this.field411 + " null entry in pl list - pos:" + var6 + " size:" + this.field236);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method146(int arg0) {
        if (!this.field271 && !this.field461 && !this.field487) {
            ++field194;
            if (!this.field132) {
                this.method125(false, 0);
            } else {
                this.method75(true);
            }
            this.field243 = 0;
            if (arg0 != 8607) {
                this.method176();
            }
        } else {
            this.method173(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
    public final void method147(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field258.method424(arg2, this.field549, arg1);
        this.field259.method424(arg2, this.field549, arg1 + arg4 - 16);
        class6.method22(16, -16614, arg2, arg4 - 32, this.field392, arg1 + 16);
        if (arg0 != 17) {
            this.field596 = -1;
        }
        int var7 = (arg4 - 32) * arg4 / arg5;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg4 - 32 - var7) * arg3 / (arg5 - arg4);
        class6.method22(16, -16614, arg2, var7, this.field196, arg1 + 16 + var8);
        class6.method27(var7, this.field602, arg2, arg1 + 16 + var8, this.field514);
        class6.method27(var7, this.field602, arg2 + 1, arg1 + 16 + var8, this.field514);
        class6.method25(16, arg2, this.field514, 31754, arg1 + 16 + var8);
        class6.method25(16, arg2, this.field514, 31754, arg1 + 17 + var8);
        class6.method27(var7, this.field602, arg2 + 15, arg1 + 16 + var8, this.field186);
        class6.method27(var7 - 1, this.field602, arg2 + 14, arg1 + 17 + var8, this.field186);
        class6.method25(16, arg2, this.field186, 31754, arg1 + 15 + var8 + var7);
        class6.method25(15, arg2 + 1, this.field186, 31754, arg1 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method148(int arg0, int arg1) {
        class62 var3 = this.field623[this.field510][arg0][arg1];
        if (var3 == null) {
            this.field591.method469(this.field510, arg0, arg1);
        } else {
            int var4 = -99999999;
            class45 var5 = null;
            for (class45 var6 = (class45) var3.method567(); var6 != null; var6 = (class45) var3.method569(false)) {
                class34 var11 = class34.method346(var6.field1229);
                int var12 = var11.field1026;
                if (var11.field988) {
                    var12 = (var6.field1230 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method565(var5, 616);
            class45 var7 = null;
            class45 var8 = null;
            for (class45 var9 = (class45) var3.method567(); var9 != null; var9 = (class45) var3.method569(false)) {
                if (var5.field1229 != var9.field1229 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1229 != var9.field1229 && var7.field1229 != var9.field1229 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field591.method455(var7, arg0, this.method60(arg1 * 128 + 64, 0, this.field510, arg0 * 128 + 64), this.field510, var5, var10, var8, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public final void method149(String arg0, int arg1, boolean arg2) {
        this.field509 = arg1;
        this.field613 = arg0;
        this.method124(this.field158);
        if (this.field229 == null) {
            super.method149(arg0, arg1, false);
        } else {
            this.field419.method327((byte) 4);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field222.method232(16777215, var4 / 2, false, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            class6.method23(34, 304, 9179409, var4 / 2 - 152, this.field501, var7);
            class6.method23(32, 302, 0, var4 / 2 - 151, this.field501, var7 + 1);
            class6.method22(arg1 * 3, -16614, var4 / 2 - 150, 30, 9179409, var7 + 2);
            class6.method22(300 - arg1 * 3, -16614, arg1 * 3 + (var4 / 2 - 150), 30, 0, var7 + 2);
            this.field222.method232(16777215, var4 / 2, false, var5 / 2 + 5 - var6, arg0);
            this.field419.method328(202, 171, super.field1119, 0);
            if (arg2) {
                this.field199 = !this.field199;
            }
            if (this.field593) {
                this.field593 = false;
                if (!this.field511) {
                    this.field420.method328(0, 0, super.field1119, 0);
                    this.field421.method328(637, 0, super.field1119, 0);
                }
                this.field417.method328(128, 0, super.field1119, 0);
                this.field418.method328(202, 371, super.field1119, 0);
                this.field422.method328(0, 265, super.field1119, 0);
                this.field423.method328(562, 265, super.field1119, 0);
                this.field424.method328(128, 171, super.field1119, 0);
                this.field425.method328(562, 171, super.field1119, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method150(String arg0) throws IOException {
        if (!this.field364) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field141 != null) {
                try {
                    this.field141.close();
                } catch (Exception var4) {
                }
                this.field141 = null;
            }
            this.field141 = this.method66(43595);
            this.field141.setSoTimeout(10000);
            InputStream var2 = this.field141.getInputStream();
            OutputStream var3 = this.field141.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (this.field407 >= 2 || this.field311 != 0 || this.field347 != 0) {
            if (arg0 != 6374) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            String var3;
            if (this.field311 == 1 && this.field407 < 2) {
                var3 = "Use " + this.field315 + " with...";
            } else if (this.field347 == 1 && this.field407 < 2) {
                var3 = this.field350 + "...";
            } else {
                var3 = this.field122[this.field407 - 1];
            }
            if (this.field407 > 2) {
                var3 = var3 + "@whi@ / " + (this.field407 - 2) + " more options";
            }
            this.field222.method241(15, var3, field471 / 1000, 4, 16777215, 2, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
    public final void method152(byte arg0) {
        this.field511 = false;
        while (this.field183) {
            this.field511 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field138 = null;
        this.field139 = null;
        this.field525 = null;
        this.field489 = null;
        this.field490 = null;
        this.field491 = null;
        this.field492 = null;
        this.field261 = null;
        this.field262 = null;
        this.field356 = null;
        this.field357 = null;
        this.field609 = null;
        this.field610 = null;
        if (this.field206 != arg0) {
            this.field623 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method153(int arg0) {
        if (arg0 != 0) {
            this.field596 = -1;
        }
        while (true) {
            class24 var2 = this.field612.method536();
            if (var2 == null) {
                return;
            }
            if (var2.field884 == 0) {
                class16.method258(var2.field882, 953, var2.field880);
                if ((this.field612.method535(3, var2.field880) & 98) != 0) {
                    this.field472 = true;
                    if (this.field624 != -1 || this.field374 != -1) {
                        this.field550 = true;
                    }
                }
            }
            if (var2.field884 == 1 && var2.field882 != null) {
                class48.method433(333, var2.field882);
            }
            if (var2.field884 == 2 && this.field547 == var2.field880 && var2.field882 != null) {
                this.method88(574, var2.field882, this.field548);
            }
            if (var2.field884 == 3 && this.field333 == 1) {
                for (int var3 = 0; var3 < this.field151.length; ++var3) {
                    if (this.field520[var3] == var2.field880) {
                        this.field151[var3] = var2.field882;
                        if (var2.field882 == null) {
                            this.field520[var3] = -1;
                        }
                        break;
                    }
                    if (this.field521[var3] == var2.field880) {
                        this.field323[var3] = var2.field882;
                        if (var2.field882 == null) {
                            this.field521[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field884 == 93 && this.field612.method543(var2.field880, (byte) 0)) {
                class27.method325(new class10(var2.field882, field386), this.field612, -781);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
    public final void method154(byte arg0) {
        if (this.field355 != 0) {
            int var2 = 0;
            if (arg0 != -81) {
                this.field596 = -1;
            }
            if (this.field493 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field454[var3] != null) {
                    int var4 = this.field452[var3];
                    String var5 = this.field453[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field557 == 0 || this.field557 == 1 && this.method118(var5, 0))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1127 > 4 && super.field1128 - 4 > var9 - 10 && super.field1128 - 4 <= var9 + 3) {
                            int var10 = this.field221.method234("From:  " + var5 + this.field454[var3], (byte) -86) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1127 < var10 + 4) {
                                if (this.field600 >= 1) {
                                    this.field122[this.field407] = "Report abuse @whi@" + var5;
                                    this.field279[this.field407] = 2641;
                                    ++this.field407;
                                }
                                this.field122[this.field407] = "Add ignore @whi@" + var5;
                                this.field279[this.field407] = 2895;
                                ++this.field407;
                                this.field122[this.field407] = "Add friend @whi@" + var5;
                                this.field279[this.field407] = 2166;
                                ++this.field407;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field557 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILCMGGUSPR;I)V")
    private final void method155(int arg0, class10 arg1, int arg2) {
        this.field275 = 0;
        this.field238 = 0;
        this.method108(arg1, true, arg2);
        int var4 = 87 / arg0;
        this.method171(this.field462, arg2, arg1);
        this.method178(arg2, arg1, this.field179);
        for (int var5 = 0; var5 < this.field275; ++var5) {
            int var7 = this.field276[var5];
            if (field471 != this.field153[var7].field1310) {
                this.field153[var7].field887 = null;
                this.field153[var7] = null;
            }
        }
        if (arg1.field646 != arg2) {
            signlink.reporterror(this.field411 + " size mismatch in getnpcpos - pos:" + arg1.field646 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field154; ++var6) {
                if (this.field153[this.field155[var6]] == null) {
                    signlink.reporterror(this.field411 + " null entry in npc list - pos:" + var6 + " size:" + this.field154);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public final void method156(boolean arg0, byte arg1) {
        if (field394.field1305 >> 7 == this.field316 && field394.field1306 >> 7 == this.field317) {
            this.field316 = 0;
        }
        int var3 = this.field236;
        if (arg1 != 6) {
            field386 = this.field470.method437();
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class36 var5;
            int var6;
            if (arg0) {
                var5 = field394;
                var6 = this.field234 << 14;
            } else {
                var5 = this.field235[this.field237[var4]];
                var6 = this.field237[var4] << 14;
            }
            if (var5 != null && var5.method302((byte) 38)) {
                var5.field1057 = false;
                if ((field293 && this.field236 > 50 || this.field236 > 200) && !arg0 && var5.field1297 == var5.field1286) {
                    var5.field1057 = true;
                }
                int var7 = var5.field1305 >> 7;
                int var8 = var5.field1306 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1075 != null && field471 >= var5.field1052 && field471 < var5.field1053) {
                        var5.field1057 = false;
                        var5.field1069 = this.method60(var5.field1306, 0, this.field510, var5.field1305);
                        this.field591.method460(var5.field1305, var5.field1306, var5.field1064, var5.field1069, this.field510, var6, var5.field1063, 60, var5.field1062, (byte) -79, var5.field1061, var5.field1307, var5);
                    } else {
                        if ((var5.field1305 & 127) == 64 && (var5.field1306 & 127) == 64) {
                            if (this.field225[var7][var8] == this.field148) {
                                continue;
                            }
                            this.field225[var7][var8] = this.field148;
                        }
                        var5.field1069 = this.method60(var5.field1306, 0, this.field510, var5.field1305);
                        this.field591.method459(9, var5, this.field510, var5.field1306, var5.field1319, var5.field1305, var5.field1307, var6, 60, var5.field1069);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILTPIBHECB;B)V")
    public final void method157(int arg0, int arg1, class56 arg2, byte arg3) {
        int var5 = this.field404 + this.field326 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = class16.field777[var5];
            int var8 = class16.field778[var5];
            int var9 = var7 * 256 / (this.field467 + 256);
            if (arg3 != 3) {
                field545 = true;
            }
            int var10 = var8 * 256 / (this.field467 + 256);
            int var11 = arg0 * var10 + arg1 * var9 >> 16;
            int var12 = arg1 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method513(var11 + 94 - arg2.field1440 / 2 + 4, -564, 83 - var12 - arg2.field1441 / 2 - 4, this.field201);
            } else {
                arg2.method507(var11 + 94 - arg2.field1440 / 2 + 4, this.field549, 83 - var12 - arg2.field1441 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(B)V")
    public final void method158(byte arg0) {
        for (int var2 = -1; var2 < this.field236; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field234;
            } else {
                var7 = this.field237[var2];
            }
            class36 var8 = this.field235[var7];
            if (var8 != null && var8.field1272 > 0) {
                --var8.field1272;
                if (var8.field1272 == 0) {
                    var8.field1311 = null;
                }
            }
        }
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            this.field587 = this.field470.method437();
        }
        for (int var4 = 0; var4 < this.field154; ++var4) {
            int var5 = this.field155[var4];
            class25 var6 = this.field153[var5];
            if (var6 != null && var6.field1272 > 0) {
                --var6.field1272;
                if (var6.field1272 == 0) {
                    var6.field1311 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(B)V")
    public final void method159(byte arg0) {
        if (arg0 == -108) {
            signlink.midiplay = false;
            signlink.midifade = 0;
            signlink.midi = "stop";
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method160(int arg0) {
        for (int var2 = 0; var2 < this.field414; ++var2) {
            if (this.field340[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field207[var2] == this.field522 && this.field321[var2] == this.field266) {
                        if (!this.method133((byte) 9)) {
                            var3 = true;
                        }
                    } else {
                        class10 var4 = class4.method10(5, this.field207[var2], this.field321[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field646 / 22) > (long) (this.field256 / 22) + this.field133) {
                            this.field256 = var4.field646;
                            this.field133 = System.currentTimeMillis();
                            if (this.method170(var4.field646, var4.field645, true)) {
                                this.field522 = this.field207[var2];
                                this.field266 = this.field321[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field336.method183(49, this.field230);
                        this.field336.method185(this.field207[var2] & 32767);
                    } else {
                        this.field336.method183(49, this.field230);
                        this.field336.method185(-1);
                    }
                }
                if (var3 && this.field340[var2] != -5) {
                    this.field340[var2] = -5;
                } else {
                    --this.field414;
                    for (int var6 = var2; var6 < this.field414; ++var6) {
                        this.field207[var6] = this.field207[var6 + 1];
                        this.field321[var6] = this.field321[var6 + 1];
                        this.field340[var6] = this.field340[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field340[var2]--;
            }
        }
        if (arg0 < 0) {
            if (this.field433 > 0) {
                this.field433 -= 20;
                if (this.field433 < 0) {
                    this.field433 = 0;
                }
                if (this.field433 == 0 && this.field264 && !field293) {
                    this.field547 = this.field370;
                    this.field548 = true;
                    this.field612.method540(2, this.field547);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    public final void method161(int arg0, byte arg1) {
        if (arg1 == 45) {
            class65.method581(arg0, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZB)V")
    public final void method162(int arg0, boolean arg1, byte arg2) {
        if (arg2 != 8) {
            field272 = this.field470.method437();
        }
        signlink.midivol = arg0;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method163(int arg0) {
        if (this.field311 == 0 && this.field347 == 0) {
            this.field122[this.field407] = "Walk here";
            this.field279[this.field407] = 158;
            this.field277[this.field407] = super.field1127;
            this.field278[this.field407] = super.field1128;
            ++this.field407;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class16.field775; ++var3) {
            int var4 = class16.field776[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field591.method478(this.field510, var5, var6, var4) >= 0) {
                    class70 var9 = class70.method596(var8);
                    if (var9.field1734 != null) {
                        var9 = var9.method594(825);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field311 == 1) {
                        this.field122[this.field407] = "Use " + this.field315 + " with @cya@" + var9.field1732;
                        this.field279[this.field407] = 791;
                        this.field280[this.field407] = var4;
                        this.field277[this.field407] = var5;
                        this.field278[this.field407] = var6;
                        ++this.field407;
                    } else if (this.field347 == 1) {
                        if ((this.field349 & 4) == 4) {
                            this.field122[this.field407] = this.field350 + " @cya@" + var9.field1732;
                            this.field279[this.field407] = 387;
                            this.field280[this.field407] = var4;
                            this.field277[this.field407] = var5;
                            this.field278[this.field407] = var6;
                            ++this.field407;
                        }
                    } else {
                        if (var9.field1736 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1736[var10] != null) {
                                    this.field122[this.field407] = var9.field1736[var10] + " @cya@" + var9.field1732;
                                    if (var10 == 0) {
                                        this.field279[this.field407] = 787;
                                    }
                                    if (var10 == 1) {
                                        this.field279[this.field407] = 350;
                                    }
                                    if (var10 == 2) {
                                        this.field279[this.field407] = 814;
                                    }
                                    if (var10 == 3) {
                                        this.field279[this.field407] = 758;
                                    }
                                    if (var10 == 4) {
                                        this.field279[this.field407] = 1237;
                                    }
                                    this.field280[this.field407] = var4;
                                    this.field277[this.field407] = var5;
                                    this.field278[this.field407] = var6;
                                    ++this.field407;
                                }
                            }
                        }
                        this.field122[this.field407] = "Examine @cya@" + var9.field1732;
                        this.field279[this.field407] = 1642;
                        this.field280[this.field407] = var9.field1747 << 14;
                        this.field277[this.field407] = var5;
                        this.field278[this.field407] = var6;
                        ++this.field407;
                    }
                }
                if (var7 == 1) {
                    class25 var11 = this.field153[var8];
                    if (var11.field887.field1472 == 1 && (var11.field1305 & 127) == 64 && (var11.field1306 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field154; ++var12) {
                            class25 var15 = this.field153[this.field155[var12]];
                            if (var15 != null && var11 != var15 && var15.field887.field1472 == 1 && var11.field1305 == var15.field1305 && var11.field1306 == var15.field1306) {
                                this.method144(var6, var5, var15.field887, this.field155[var12], 440);
                            }
                        }
                        for (int var13 = 0; var13 < this.field236; ++var13) {
                            class36 var14 = this.field235[this.field237[var13]];
                            if (var14 != null && var11.field1305 == var14.field1305 && var11.field1306 == var14.field1306) {
                                this.method53(var6, var14, this.field237[var13], (byte) 1, var5);
                            }
                        }
                    }
                    this.method144(var6, var5, var11.field887, var8, 440);
                }
                if (var7 == 0) {
                    class36 var16 = this.field235[var8];
                    if ((var16.field1305 & 127) == 64 && (var16.field1306 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field154; ++var17) {
                            class25 var20 = this.field153[this.field155[var17]];
                            if (var20 != null && var20.field887.field1472 == 1 && var16.field1305 == var20.field1305 && var16.field1306 == var20.field1306) {
                                this.method144(var6, var5, var20.field887, this.field155[var17], 440);
                            }
                        }
                        for (int var18 = 0; var18 < this.field236; ++var18) {
                            class36 var19 = this.field235[this.field237[var18]];
                            if (var19 != null && var16 != var19 && var16.field1305 == var19.field1305 && var16.field1306 == var19.field1306) {
                                this.method53(var6, var19, this.field237[var18], (byte) 1, var5);
                            }
                        }
                    }
                    this.method53(var6, var16, var8, (byte) 1, var5);
                }
                if (var7 == 3) {
                    class62 var21 = this.field623[this.field510][var5][var6];
                    if (var21 != null) {
                        for (class45 var22 = (class45) var21.method568((byte) 6); var22 != null; var22 = (class45) var21.method570(36701)) {
                            class34 var23 = class34.method346(var22.field1229);
                            if (this.field311 == 1) {
                                this.field122[this.field407] = "Use " + this.field315 + " with @lre@" + var23.field1008;
                                this.field279[this.field407] = 825;
                                this.field280[this.field407] = var22.field1229;
                                this.field277[this.field407] = var5;
                                this.field278[this.field407] = var6;
                                ++this.field407;
                            } else if (this.field347 == 1) {
                                if ((this.field349 & 1) == 1) {
                                    this.field122[this.field407] = this.field350 + " @lre@" + var23.field1008;
                                    this.field279[this.field407] = 555;
                                    this.field280[this.field407] = var22.field1229;
                                    this.field277[this.field407] = var5;
                                    this.field278[this.field407] = var6;
                                    ++this.field407;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1010 != null && var23.field1010[var24] != null) {
                                        this.field122[this.field407] = var23.field1010[var24] + " @lre@" + var23.field1008;
                                        if (var24 == 0) {
                                            this.field279[this.field407] = 233;
                                        }
                                        if (var24 == 1) {
                                            this.field279[this.field407] = 174;
                                        }
                                        if (var24 == 2) {
                                            this.field279[this.field407] = 375;
                                        }
                                        if (var24 == 3) {
                                            this.field279[this.field407] = 679;
                                        }
                                        if (var24 == 4) {
                                            this.field279[this.field407] = 138;
                                        }
                                        this.field280[this.field407] = var22.field1229;
                                        this.field277[this.field407] = var5;
                                        this.field278[this.field407] = var6;
                                        ++this.field407;
                                    } else if (var24 == 2) {
                                        this.field122[this.field407] = "Take @lre@" + var23.field1008;
                                        this.field279[this.field407] = 375;
                                        this.field280[this.field407] = var22.field1229;
                                        this.field277[this.field407] = var5;
                                        this.field278[this.field407] = var6;
                                        ++this.field407;
                                    }
                                }
                                this.field122[this.field407] = "Examine @lre@" + var23.field1008;
                                this.field279[this.field407] = 1186;
                                this.field280[this.field407] = var22.field1229;
                                this.field277[this.field407] = var5;
                                this.field278[this.field407] = var6;
                                ++this.field407;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 17893) {
            this.field596 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public static final void method164(int arg0) {
        if (arg0 != -14359) {
            field216 = 220;
        }
        class53.field1339 = true;
        class39.field1145 = true;
        field293 = true;
        class27.field903 = true;
        class70.field1709 = true;
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(B)V")
    public final void method165(byte arg0) {
        if (this.field575 == 0) {
            this.field122[0] = "Cancel";
            this.field279[0] = 1117;
            this.field407 = 1;
            if (this.field614 != -1) {
                this.field376 = 0;
                this.field464 = 0;
                this.method127(super.field1127, 0, 0, 0, class65.method577(this.field614), super.field1128, 0, 1);
                if (this.field554 != this.field376) {
                    this.field554 = this.field376;
                }
                if (this.field464 != this.field226) {
                    this.field226 = this.field464;
                }
            } else {
                this.method154((byte) -81);
                this.field376 = 0;
                this.field464 = 0;
                if (arg0 == 8) {
                    boolean var2 = false;
                } else {
                    this.field336.method184(235);
                }
                if (super.field1127 > 4 && super.field1128 > 4 && super.field1127 < 516 && super.field1128 < 338) {
                    if (this.field466 != -1) {
                        this.method127(super.field1127, 4, 4, 0, class65.method577(this.field466), super.field1128, 0, 1);
                    } else {
                        this.method163(17893);
                    }
                }
                if (this.field554 != this.field376) {
                    this.field554 = this.field376;
                }
                if (this.field464 != this.field226) {
                    this.field226 = this.field464;
                }
                this.field376 = 0;
                this.field464 = 0;
                if (super.field1127 > 553 && super.field1128 > 205 && super.field1127 < 743 && super.field1128 < 466) {
                    if (this.field588 != -1) {
                        this.method127(super.field1127, 553, 205, 0, class65.method577(this.field588), super.field1128, 1, 1);
                    } else if (this.field300[this.field463] != -1) {
                        this.method127(super.field1127, 553, 205, 0, class65.method577(this.field300[this.field463]), super.field1128, 1, 1);
                    }
                }
                if (this.field430 != this.field376) {
                    this.field472 = true;
                    this.field430 = this.field376;
                }
                if (this.field464 != this.field143) {
                    this.field472 = true;
                    this.field143 = this.field464;
                }
                this.field376 = 0;
                this.field464 = 0;
                if (super.field1127 > 17 && super.field1128 > 357 && super.field1127 < 496 && super.field1128 < 453) {
                    if (this.field624 != -1) {
                        this.method127(super.field1127, 17, 357, 0, class65.method577(this.field624), super.field1128, 2, 1);
                    } else if (this.field374 != -1) {
                        this.method127(super.field1127, 17, 357, 0, class65.method577(this.field374), super.field1128, 3, 1);
                    } else if (super.field1128 < 434 && super.field1127 < 426 && this.field320 == 0) {
                        this.method52((byte) 111, super.field1127 - 17, super.field1128 - 357);
                    }
                }
                if ((this.field624 != -1 || this.field374 != -1) && this.field376 != this.field254) {
                    this.field550 = true;
                    this.field254 = this.field376;
                }
                if ((this.field624 != -1 || this.field374 != -1) && this.field464 != this.field182) {
                    this.field550 = true;
                    this.field182 = this.field464;
                }
                boolean var3 = false;
                while (!var3) {
                    var3 = true;
                    for (int var4 = 0; var4 < this.field407 - 1; ++var4) {
                        if (this.field279[var4] < 1000 && this.field279[var4 + 1] > 1000) {
                            String var5 = this.field122[var4];
                            this.field122[var4] = this.field122[var4 + 1];
                            this.field122[var4 + 1] = var5;
                            int var6 = this.field279[var4];
                            this.field279[var4] = this.field279[var4 + 1];
                            this.field279[var4 + 1] = var6;
                            int var7 = this.field277[var4];
                            this.field277[var4] = this.field277[var4 + 1];
                            this.field277[var4 + 1] = var7;
                            int var8 = this.field278[var4];
                            this.field278[var4] = this.field278[var4 + 1];
                            this.field278[var4 + 1] = var8;
                            int var9 = this.field280[var4];
                            this.field280[var4] = this.field280[var4 + 1];
                            this.field280[var4 + 1] = var9;
                            var3 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(B)I")
    public final int method166(byte arg0) {
        int var2 = 3;
        if (arg0 != 2) {
            return 0;
        } else {
            if (this.field191 < 310) {
                ++field506;
                if (field506 > 154) {
                    field506 = 0;
                    this.field336.method183(48, this.field230);
                    this.field336.method185(14668);
                }
                int var3 = this.field188 >> 7;
                int var4 = this.field190 >> 7;
                int var5 = field394.field1305 >> 7;
                int var6 = field394.field1306 >> 7;
                if ((this.field198[this.field510][var3][var4] & 4) != 0) {
                    var2 = this.field510;
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
                        if ((this.field198[this.field510][var3][var4] & 4) != 0) {
                            var2 = this.field510;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field198[this.field510][var3][var4] & 4) != 0) {
                                var2 = this.field510;
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
                        if ((this.field198[this.field510][var3][var4] & 4) != 0) {
                            var2 = this.field510;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field198[this.field510][var3][var4] & 4) != 0) {
                                var2 = this.field510;
                            }
                        }
                    }
                }
            }
            if ((this.field198[this.field510][field394.field1305 >> 7][field394.field1306 >> 7] & 4) != 0) {
                var2 = this.field510;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)I")
    public final int method167(int arg0) {
        int var2 = this.method60(this.field190, 0, this.field510, this.field188);
        if (arg0 != 0) {
            this.field501 = 13;
        }
        return var2 - this.field189 < 800 && (this.field198[this.field510][this.field188 >> 7][this.field190 >> 7] & 4) != 0 ? this.field510 : 3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method168(int arg0) {
        this.field434 = null;
        this.field435 = null;
        this.field436 = null;
        this.field437 = null;
        this.field438 = null;
        this.field422 = null;
        this.field423 = null;
        this.field424 = null;
        this.field425 = null;
        this.field533 = null;
        this.field534 = null;
        this.field535 = null;
        this.field536 = null;
        this.field301 = null;
        this.field302 = null;
        this.field303 = null;
        this.field304 = null;
        this.field499 = null;
        this.field198 = null;
        this.field591 = null;
        this.field328 = null;
        this.field249 = null;
        this.field250 = null;
        this.field251 = null;
        this.field318 = null;
        this.field623 = null;
        this.field450 = null;
        this.field615 = null;
        this.field616 = null;
        this.field617 = null;
        this.field618 = null;
        this.field619 = null;
        this.field578 = null;
        this.field232 = null;
        this.field125 = null;
        this.field402 = null;
        this.field566 = null;
        this.field529 = null;
        this.field530 = null;
        this.field420 = null;
        this.field421 = null;
        this.field417 = null;
        this.field418 = null;
        this.field419 = null;
        if (this.field612 != null) {
            this.field612.method531();
        }
        this.field612 = null;
        this.field305 = null;
        this.field306 = null;
        this.field307 = null;
        this.field308 = null;
        this.field309 = null;
        if (this.field451 != null) {
            this.field451.field1697 = false;
        }
        this.field451 = null;
        this.field273 = null;
        this.field336 = null;
        this.field218 = null;
        this.field297 = null;
        this.method159((byte) -108);
        this.field152 = null;
        this.field277 = null;
        this.field278 = null;
        this.field279 = null;
        this.field280 = null;
        this.field122 = null;
        this.field235 = null;
        this.field237 = null;
        this.field239 = null;
        this.field240 = null;
        this.field276 = null;
        this.field508 = null;
        this.field134 = null;
        this.field145 = null;
        this.field526 = null;
        this.field193 = null;
        this.field559 = null;
        this.field153 = null;
        this.field155 = null;
        this.field200 = null;
        this.field201 = null;
        this.field202 = null;
        this.field204 = null;
        this.field440 = null;
        this.field442 = null;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field287 = null;
        this.field288 = null;
        this.field409 = null;
        this.field255 = null;
        this.field500 = null;
        try {
            if (this.field351 != null) {
                this.field351.method546();
            }
        } catch (Exception var3) {
        }
        this.field351 = null;
        this.field225 = null;
        this.field269 = null;
        this.field519 = null;
        this.field151 = null;
        this.field323 = null;
        this.field520 = null;
        this.field521 = null;
        this.field161 = null;
        this.field361 = null;
        this.field362 = null;
        this.field363 = null;
        this.field210 = null;
        this.field211 = null;
        this.field212 = null;
        this.field213 = null;
        this.field214 = null;
        this.method152(this.field180);
        class70.method591(-876);
        class57.method516(-876);
        class34.method354(-876);
        class65.method574(-876);
        class21.field848 = null;
        class9.field114 = null;
        class35.field1042 = null;
        class67.field1666 = null;
        class29.field932 = null;
        class29.field944 = null;
        class5.field28 = null;
        super.field1120 = null;
        class36.field1070 = null;
        class39.method402(-876);
        class53.method447(-876);
        class16.method256(-876);
        class48.method434(-876);
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method169(int arg0) {
        if (arg0 >= 0) {
            field386 = 341;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method401((byte) 0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field466 != -1 && this.field466 == this.field371) {
                        if (var2 == 8 && this.field441.length() > 0) {
                            this.field441 = this.field441.substring(0, this.field441.length() - 1);
                        }
                        break;
                    }
                    if (this.field449) {
                        if (var2 >= 32 && var2 <= 122 && this.field337.length() < 80) {
                            this.field337 = this.field337 + (char) var2;
                            this.field550 = true;
                        }
                        if (var2 == 8 && this.field337.length() > 0) {
                            this.field337 = this.field337.substring(0, this.field337.length() - 1);
                            this.field550 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field449 = false;
                            this.field550 = true;
                            if (this.field338 == 1) {
                                long var3 = class71.method597(this.field337);
                                this.method126(var3, 0);
                            }
                            if (this.field338 == 2 && this.field589 > 0) {
                                long var5 = class71.method597(this.field337);
                                this.method140(var5, 814);
                            }
                            if (this.field338 == 3 && this.field337.length() > 0) {
                                this.field336.method183(7, this.field230);
                                this.field336.method184(0);
                                int var7 = this.field336.field646;
                                this.field336.method190(5, this.field443);
                                class51.method445(this.field336, this.field337, 0);
                                this.field336.method193(this.field336.field646 - var7, false);
                                this.field337 = class51.method446(this.field337, -443);
                                this.field337 = class37.method369(this.field337, -443);
                                this.method114(class71.method601(class71.method598(this.field443, -491), 8384), this.field337, 6, 0);
                                if (this.field557 == 2) {
                                    this.field557 = 1;
                                    this.field324 = true;
                                    this.field336.method183(205, this.field230);
                                    this.field336.method184(this.field289);
                                    this.field336.method184(this.field557);
                                    this.field336.method184(this.field209);
                                }
                            }
                            if (this.field338 == 4 && this.field611 < 100) {
                                long var8 = class71.method597(this.field337);
                                this.method59(var8, this.field608);
                            }
                            if (this.field338 == 5 && this.field611 > 0) {
                                long var10 = class71.method597(this.field337);
                                this.method87(975, var10);
                            }
                        }
                    } else if (this.field320 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field353.length() < 10) {
                            this.field353 = this.field353 + (char) var2;
                            this.field550 = true;
                        }
                        if (var2 == 8 && this.field353.length() > 0) {
                            this.field353 = this.field353.substring(0, this.field353.length() - 1);
                            this.field550 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field353.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field353);
                                } catch (Exception var22) {
                                }
                                this.field336.method183(114, this.field230);
                                this.field336.method188(var12);
                            }
                            this.field320 = 0;
                            this.field550 = true;
                        }
                    } else if (this.field320 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field353.length() < 12) {
                            this.field353 = this.field353 + (char) var2;
                            this.field550 = true;
                        }
                        if (var2 == 8 && this.field353.length() > 0) {
                            this.field353 = this.field353.substring(0, this.field353.length() - 1);
                            this.field550 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field353.length() > 0) {
                                this.field336.method183(97, this.field230);
                                this.field336.method190(5, class71.method597(this.field353));
                            }
                            this.field320 = 0;
                            this.field550 = true;
                        }
                    } else if (this.field320 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field353.length() < 40) {
                            this.field353 = this.field353 + (char) var2;
                            this.field550 = true;
                        }
                        if (var2 == 8 && this.field353.length() > 0) {
                            this.field353 = this.field353.substring(0, this.field353.length() - 1);
                            this.field550 = true;
                        }
                    } else if (this.field624 == -1 && this.field614 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field459.length() < 80) {
                            this.field459 = this.field459 + (char) var2;
                            this.field550 = true;
                        }
                        if (var2 == 8 && this.field459.length() > 0) {
                            this.field459 = this.field459.substring(0, this.field459.length() - 1);
                            this.field550 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field459.length() > 0) {
                            if (this.field600 == 2) {
                                if (this.field459.equals("::clientdrop")) {
                                    this.method142(545);
                                }
                                if (this.field459.equals("::lag")) {
                                    this.method116(302);
                                }
                                if (this.field459.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field612.method542(2, -20698); ++var13) {
                                        this.field612.method527((byte) 1, var13, 2, -447);
                                    }
                                }
                                if (this.field459.equals("::fpson")) {
                                    field159 = true;
                                }
                                if (this.field459.equals("::fpsoff")) {
                                    field159 = false;
                                }
                                if (this.field459.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field328[var14].field1558[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field459.startsWith("::")) {
                                this.field336.method183(28, this.field230);
                                this.field336.method184(this.field459.length() - 1);
                                this.field336.method191(this.field459.substring(2));
                            } else {
                                String var17 = this.field459.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field459 = this.field459.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field459 = this.field459.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field459 = this.field459.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field459 = this.field459.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field459 = this.field459.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field459 = this.field459.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field459 = this.field459.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field459 = this.field459.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field459 = this.field459.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field459 = this.field459.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field459 = this.field459.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field459 = this.field459.substring(6);
                                }
                                String var19 = this.field459.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field459 = this.field459.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field459 = this.field459.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field459 = this.field459.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field459 = this.field459.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field459 = this.field459.substring(6);
                                }
                                this.field336.method183(219, this.field230);
                                this.field336.method184(0);
                                int var21 = this.field336.field646;
                                this.field336.method184(var18);
                                this.field152.field646 = 0;
                                class51.method445(this.field152, this.field459, 0);
                                this.field336.method229((byte) 6, this.field152.field646, this.field152.field645, 0);
                                this.field336.method184(var20);
                                this.field336.method193(this.field336.field646 - var21, false);
                                this.field459 = class51.method446(this.field459, -443);
                                this.field459 = class37.method369(this.field459, -443);
                                field394.field1311 = this.field459;
                                field394.field1267 = var18;
                                field394.field1296 = var20;
                                field394.field1272 = 150;
                                if (this.field600 == 2) {
                                    this.method114("@cr2@" + field394.field1081, field394.field1311, 2, 0);
                                } else if (this.field600 == 1) {
                                    this.method114("@cr1@" + field394.field1081, field394.field1311, 2, 0);
                                } else {
                                    this.method114(field394.field1081, field394.field1311, 2, 0);
                                }
                                if (this.field289 == 2) {
                                    this.field289 = 3;
                                    this.field324 = true;
                                    this.field336.method183(205, this.field230);
                                    this.field336.method184(this.field289);
                                    this.field336.method184(this.field557);
                                    this.field336.method184(this.field209);
                                }
                            }
                            this.field459 = "";
                            this.field550 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field441.length() < 12) {
                this.field441 = this.field441 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I[BZ)Z")
    public final boolean method170(int arg0, byte[] arg1, boolean arg2) {
        if (!arg2) {
            this.field176 = this.field470.method437();
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILCMGGUSPR;)V")
    private final void method171(int arg0, int arg1, class10 arg2) {
        while (true) {
            if (arg2.field647 + 21 < arg1 * 8) {
                int var4 = arg2.method205(14, -359);
                if (var4 != 16383) {
                    if (this.field153[var4] == null) {
                        this.field153[var4] = new class25();
                    }
                    class25 var5 = this.field153[var4];
                    this.field155[this.field154++] = var4;
                    var5.field1310 = field471;
                    int var6 = arg2.method205(5, -359);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    var5.field887 = class57.method517(arg2.method205(13, -359));
                    int var7 = arg2.method205(5, -359);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method205(1, -359);
                    if (var8 == 1) {
                        this.field239[this.field238++] = var4;
                    }
                    int var9 = arg2.method205(1, -359);
                    var5.field1308 = var5.field887.field1472;
                    var5.field1316 = var5.field887.field1445;
                    var5.field1268 = var5.field887.field1450;
                    var5.field1269 = var5.field887.field1469;
                    var5.field1270 = var5.field887.field1451;
                    var5.field1271 = var5.field887.field1470;
                    var5.field1286 = var5.field887.field1482;
                    var5.method442(false, var9 == 1, field394.field1292[0] + var6, field394.field1293[0] + var7);
                    continue;
                }
            }
            arg2.method206(502);
            if (arg0 != 5) {
                this.field596 = -1;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BII)Ljava/lang/String;")
    public static final String method172(byte arg0, int arg1, int arg2) {
        if (field372 == arg0) {
            boolean var3 = false;
        } else {
            field390 = 398;
        }
        int var4 = arg2 - arg1;
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

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method173(int arg0) {
        Graphics var2 = this.method117((byte) 0).getGraphics();
        this.field595 += arg0;
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method400((byte) 5, 1);
        if (this.field461) {
            this.field511 = false;
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
        if (this.field487) {
            this.field511 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field271) {
            this.field511 = false;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILWJQTPVDG;IIZ)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6, int arg7, boolean arg8) {
        if (!arg8) {
            if (this.field580) {
                this.field217 = 32;
            } else {
                this.field217 = 0;
            }
            this.field580 = false;
            if (arg3 >= arg4 && arg3 < arg4 + 16 && arg2 >= arg0 && arg2 < arg0 + 16) {
                arg5.field1598 -= this.field243 * 4;
                if (arg7 == 1) {
                    this.field472 = true;
                }
                if (arg7 == 2 || arg7 == 3) {
                    this.field550 = true;
                }
            } else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg2 >= arg0 + arg1 - 16 && arg2 < arg0 + arg1) {
                arg5.field1598 += this.field243 * 4;
                if (arg7 == 1) {
                    this.field472 = true;
                }
                if (arg7 == 2 || arg7 == 3) {
                    this.field550 = true;
                }
            } else if (arg3 >= arg4 - this.field217 && arg3 < arg4 + 16 + this.field217 && arg2 >= arg0 + 16 && arg2 < arg0 + arg1 - 16 && this.field243 > 0) {
                int var10 = (arg1 - 32) * arg1 / arg6;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg2 - arg0 - 16 - var10 / 2;
                int var12 = arg1 - 32 - var10;
                arg5.field1598 = (arg6 - arg1) * var11 / var12;
                if (arg7 == 1) {
                    this.field472 = true;
                }
                if (arg7 == 2 || arg7 == 3) {
                    this.field550 = true;
                }
                this.field580 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method175(boolean arg0) {
        if (arg0) {
            field416 = this.field470.method437();
        }
        this.field163 = 0;
        for (int var2 = -1; var2 < this.field236 + this.field154; ++var2) {
            class50 var19;
            if (var2 == -1) {
                var19 = field394;
            } else if (var2 < this.field236) {
                var19 = this.field235[this.field237[var2]];
            } else {
                var19 = this.field153[this.field155[var2 - this.field236]];
            }
            if (var19 != null && var19.method302((byte) 38)) {
                if (var19 instanceof class25) {
                    class57 var20 = ((class25) var19).field887;
                    if (var20.field1447 != null) {
                        var20 = var20.method515((byte) 73);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field236) {
                    class57 var23 = ((class25) var19).field887;
                    if (var23.field1453 >= 0 && var23.field1453 < this.field526.length) {
                        this.method130(var19, var19.field1312 + 15, 19311);
                        if (this.field123 > -1) {
                            this.field526[var23.field1453].method507(this.field123 - 12, this.field549, this.field124 - 30);
                        }
                    }
                    if (this.field144 == 1 && this.field155[var2 - this.field236] == this.field265 && field471 % 20 < 10) {
                        this.method130(var19, var19.field1312 + 15, 19311);
                        if (this.field123 > -1) {
                            this.field193[0].method507(this.field123 - 12, this.field549, this.field124 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class36 var22 = (class36) var19;
                    if (var22.field1077 != -1 || var22.field1078 != -1) {
                        this.method130(var19, var19.field1312 + 15, 19311);
                        if (this.field123 > -1) {
                            if (var22.field1077 != -1) {
                                this.field145[var22.field1077].method507(this.field123 - 12, this.field549, this.field124 - var21);
                                var21 += 25;
                            }
                            if (var22.field1078 != -1) {
                                this.field526[var22.field1078].method507(this.field123 - 12, this.field549, this.field124 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field144 == 10 && this.field237[var2] == this.field146) {
                        this.method130(var19, var19.field1312 + 15, 19311);
                        if (this.field123 > -1) {
                            this.field193[1].method507(this.field123 - 12, this.field549, this.field124 - var21);
                        }
                    }
                }
                if (var19.field1311 != null && (var2 >= this.field236 || this.field289 == 0 || this.field289 == 3 || this.field289 == 1 && this.method118(((class36) var19).field1081, 0))) {
                    this.method130(var19, var19.field1312, 19311);
                    if (this.field123 > -1 && this.field163 < this.field164) {
                        this.field168[this.field163] = this.field222.method235((byte) -120, var19.field1311) / 2;
                        this.field167[this.field163] = this.field222.field673;
                        this.field165[this.field163] = this.field123;
                        this.field166[this.field163] = this.field124;
                        this.field169[this.field163] = var19.field1267;
                        this.field170[this.field163] = var19.field1296;
                        this.field171[this.field163] = var19.field1272;
                        this.field172[this.field163++] = var19.field1311;
                        if (this.field460 == 0 && var19.field1296 >= 1 && var19.field1296 <= 3) {
                            this.field167[this.field163] += 10;
                            this.field166[this.field163] += 5;
                        }
                        if (this.field460 == 0 && var19.field1296 == 4) {
                            this.field168[this.field163] = 60;
                        }
                        if (this.field460 == 0 && var19.field1296 == 5) {
                            this.field167[this.field163] += 5;
                        }
                    }
                }
                if (var19.field1313 > field471) {
                    this.method130(var19, var19.field1312 + 15, 19311);
                    if (this.field123 > -1) {
                        int var24 = var19.field1314 * 30 / var19.field1315;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class6.method22(var24, -16614, this.field123 - 15, 5, 65280, this.field124 - 3);
                        class6.method22(30 - var24, -16614, this.field123 - 15 + var24, 5, 16711680, this.field124 - 3);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1290[var25] > field471) {
                        this.method130(var19, var19.field1312 / 2, 19311);
                        if (this.field123 > -1) {
                            if (var25 == 1) {
                                this.field124 -= 20;
                            }
                            if (var25 == 2) {
                                this.field123 -= 15;
                                this.field124 -= 10;
                            }
                            if (var25 == 3) {
                                this.field123 += 15;
                                this.field124 -= 10;
                            }
                            this.field134[var19.field1289[var25]].method507(this.field123 - 12, this.field549, this.field124 - 12);
                            this.field220.method232(0, this.field123, false, this.field124 + 4, String.valueOf(var19.field1288[var25]));
                            this.field220.method232(16777215, this.field123 - 1, false, this.field124 + 3, String.valueOf(var19.field1288[var25]));
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field163; ++var3) {
            int var4 = this.field165[var3];
            int var5 = this.field166[var3];
            int var6 = this.field168[var3];
            int var7 = this.field167[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field166[var18] - this.field167[var18] && var5 - var7 < this.field166[var18] + 2 && var4 - var6 < this.field168[var18] + this.field165[var18] && var4 + var6 > this.field165[var18] - this.field168[var18] && this.field166[var18] - this.field167[var18] < var5) {
                        var5 = this.field166[var18] - this.field167[var18];
                        var8 = true;
                    }
                }
            }
            this.field123 = this.field165[var3];
            this.field124 = this.field166[var3] = var5;
            String var9 = this.field172[var3];
            if (this.field460 == 0) {
                int var10 = 16776960;
                if (this.field169[var3] < 6) {
                    var10 = this.field228[this.field169[var3]];
                }
                if (this.field169[var3] == 6) {
                    var10 = this.field148 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field169[var3] == 7) {
                    var10 = this.field148 % 20 < 10 ? 255 : 65535;
                }
                if (this.field169[var3] == 8) {
                    var10 = this.field148 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field169[var3] == 9) {
                    int var11 = 150 - this.field171[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field169[var3] == 10) {
                    int var12 = 150 - this.field171[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field169[var3] == 11) {
                    int var13 = 150 - this.field171[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field170[var3] == 0) {
                    this.field222.method232(0, this.field123, false, this.field124 + 1, var9);
                    this.field222.method232(var10, this.field123, false, this.field124, var9);
                }
                if (this.field170[var3] == 1) {
                    this.field222.method237(this.field123, this.field148, 0, -47669, var9, this.field124 + 1);
                    this.field222.method237(this.field123, this.field148, var10, -47669, var9, this.field124);
                }
                if (this.field170[var3] == 2) {
                    this.field222.method238(this.field148, this.field123, -38706, 0, this.field124 + 1, var9);
                    this.field222.method238(this.field148, this.field123, -38706, var10, this.field124, var9);
                }
                if (this.field170[var3] == 3) {
                    this.field222.method239(0, this.field123, this.field124 + 1, this.field148, 150 - this.field171[var3], this.field396, var9);
                    this.field222.method239(var10, this.field123, this.field124, this.field148, 150 - this.field171[var3], this.field396, var9);
                }
                if (this.field170[var3] == 4) {
                    int var14 = this.field222.method235((byte) -120, var9);
                    int var15 = (150 - this.field171[var3]) * (var14 + 100) / 150;
                    class6.method19(-180, 0, 334, this.field123 + 50, this.field123 - 50);
                    this.field222.method236(this.field123 + 50 - var15, false, 0, var9, this.field124 + 1);
                    this.field222.method236(this.field123 + 50 - var15, false, var10, var9, this.field124);
                    class6.method18(-798);
                }
                if (this.field170[var3] == 5) {
                    int var16 = 150 - this.field171[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class6.method19(-180, this.field124 - this.field222.field673 - 1, this.field124 + 5, 512, 0);
                    this.field222.method232(0, this.field123, false, this.field124 + 1 + var17, var9);
                    this.field222.method232(var10, this.field123, false, this.field124 + var17, var9);
                    class6.method18(-798);
                }
            } else {
                this.field222.method232(0, this.field123, false, this.field124 + 1, var9);
                this.field222.method232(16776960, this.field123, false, this.field124, var9);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method176() {
        this.method149("Starting up", 20, false);
        if (signlink.sunjava) {
            super.field1113 = 5;
        }
        if (field205) {
            this.field271 = true;
        } else {
            field205 = true;
            boolean var1 = false;
            String var2 = this.method37(false);
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
                this.field487 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field607[var3] = new class31(signlink.cache_idx[var3], 500000, signlink.cache_dat, true, var3 + 1);
                    }
                }
                try {
                    this.method123(-454);
                    this.field229 = this.method132(1, (byte) 8, 25, this.field126[1], "title screen", "title");
                    this.field220 = new class11(false, "p11_full", false, this.field229);
                    this.field221 = new class11(false, "p12_full", false, this.field229);
                    this.field222 = new class11(false, "b12_full", false, this.field229);
                    this.field223 = new class11(true, "q8_full", false, this.field229);
                    this.method101(0);
                    this.method80(-19609);
                    class59 var4 = this.method132(2, (byte) 8, 30, this.field126[2], "config", "config");
                    class59 var5 = this.method132(3, (byte) 8, 35, this.field126[3], "interface", "interface");
                    class59 var6 = this.method132(4, (byte) 8, 40, this.field126[4], "2d graphics", "media");
                    class59 var7 = this.method132(6, (byte) 8, 45, this.field126[6], "textures", "textures");
                    class59 var8 = this.method132(7, (byte) 8, 50, this.field126[7], "chat system", "wordenc");
                    class59 var9 = this.method132(8, (byte) 8, 55, this.field126[8], "sound effects", "sounds");
                    this.field198 = new byte[4][104][104];
                    this.field499 = new int[4][105][105];
                    this.field591 = new class53(field272, 104, this.field499, 104, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field328[var10] = new class61(104, -266, 104);
                    }
                    this.field318 = new class56(512, 512);
                    class59 var11 = this.method132(5, (byte) 8, 60, this.field126[5], "update list", "versionlist");
                    this.method149("Connecting to update server", 60, false);
                    this.field612 = new class58();
                    this.field612.method532(var11, this);
                    class48.method432(this.field612.method537((byte) 4));
                    class16.method257(this.field612.method542(0, -20698), this.field612);
                    if (!field293) {
                        this.field547 = 0;
                        this.field548 = true;
                        this.field612.method540(2, this.field547);
                        while (this.field612.method530() > 0) {
                            this.method153(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field612.field1507 > 3) {
                                this.method109("ondemand");
                                return;
                            }
                        }
                    }
                    this.method149("Requesting animations", 65, false);
                    int var12 = this.field612.method542(1, -20698);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field612.method540(1, var13);
                    }
                    while (this.field612.method530() > 0) {
                        int var14 = var12 - this.field612.method530();
                        if (var14 > 0) {
                            this.method149("Loading animations - " + var14 * 100 / var12 + "%", 65, false);
                        }
                        this.method153(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field612.field1507 > 3) {
                            this.method109("ondemand");
                            return;
                        }
                    }
                    this.method149("Requesting models", 70, false);
                    int var15 = this.field612.method542(0, -20698);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field612.method535(3, var16);
                        if ((var17 & 1) != 0) {
                            this.field612.method540(0, var16);
                        }
                    }
                    int var18 = this.field612.method530();
                    while (this.field612.method530() > 0) {
                        int var19 = var18 - this.field612.method530();
                        if (var19 > 0) {
                            this.method149("Loading models - " + var19 * 100 / var18 + "%", 70, false);
                        }
                        this.method153(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field607[0] != null) {
                        this.method149("Requesting maps", 75, false);
                        this.field612.method540(3, this.field612.method538(-679, 47, 0, 48));
                        this.field612.method540(3, this.field612.method538(-679, 47, 1, 48));
                        this.field612.method540(3, this.field612.method538(-679, 48, 0, 48));
                        this.field612.method540(3, this.field612.method538(-679, 48, 1, 48));
                        this.field612.method540(3, this.field612.method538(-679, 49, 0, 48));
                        this.field612.method540(3, this.field612.method538(-679, 49, 1, 48));
                        this.field612.method540(3, this.field612.method538(-679, 47, 0, 47));
                        this.field612.method540(3, this.field612.method538(-679, 47, 1, 47));
                        this.field612.method540(3, this.field612.method538(-679, 48, 0, 47));
                        this.field612.method540(3, this.field612.method538(-679, 48, 1, 47));
                        this.field612.method540(3, this.field612.method538(-679, 48, 0, 148));
                        this.field612.method540(3, this.field612.method538(-679, 48, 1, 148));
                        int var20 = this.field612.method530();
                        while (this.field612.method530() > 0) {
                            int var21 = var20 - this.field612.method530();
                            if (var21 > 0) {
                                this.method149("Loading maps - " + var21 * 100 / var20 + "%", 75, false);
                            }
                            this.method153(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field612.method542(0, -20698);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field612.method535(3, var23);
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
                            this.field612.method527(var25, var23, 0, -447);
                        }
                    }
                    this.field612.method533(-250, field292);
                    if (!field293) {
                        int var26 = this.field612.method542(2, -20698);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field612.method526(var27, false)) {
                                this.field612.method527((byte) 1, var27, 2, -447);
                            }
                        }
                    }
                    this.method149("Unpacking media", 80, false);
                    this.field200 = new class40(var6, "invback", 0);
                    this.field202 = new class40(var6, "chatback", 0);
                    this.field201 = new class40(var6, "mapback", 0);
                    this.field361 = new class40(var6, "backbase1", 0);
                    this.field362 = new class40(var6, "backbase2", 0);
                    this.field363 = new class40(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field273[var28] = new class40(var6, "sideicons", var28);
                    }
                    this.field508 = new class56(var6, "compass", 0);
                    this.field174 = new class56(var6, "mapedge", 0);
                    this.field174.method504(false);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field255[var29] = new class40(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field500[var30] = new class56(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field134[var31] = new class56(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field145[var32] = new class56(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field526[var33] = new class56(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field193[var34] = new class56(var6, "headicons_hint", var34);
                    }
                    this.field161 = new class56(var6, "overlay_multiway", 0);
                    this.field294 = new class56(var6, "mapmarker", 0);
                    this.field295 = new class56(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field559[var35] = new class56(var6, "cross", var35);
                    }
                    this.field615 = new class56(var6, "mapdots", 0);
                    this.field616 = new class56(var6, "mapdots", 1);
                    this.field617 = new class56(var6, "mapdots", 2);
                    this.field618 = new class56(var6, "mapdots", 3);
                    this.field619 = new class56(var6, "mapdots", 4);
                    this.field258 = new class40(var6, "scrollbar", 0);
                    this.field259 = new class40(var6, "scrollbar", 1);
                    this.field210 = new class40(var6, "redstone1", 0);
                    this.field211 = new class40(var6, "redstone2", 0);
                    this.field212 = new class40(var6, "redstone3", 0);
                    this.field213 = new class40(var6, "redstone1", 0);
                    this.field213.method421(-623);
                    this.field214 = new class40(var6, "redstone2", 0);
                    this.field214.method421(-623);
                    this.field434 = new class40(var6, "redstone1", 0);
                    this.field434.method422((byte) 6);
                    this.field435 = new class40(var6, "redstone2", 0);
                    this.field435.method422((byte) 6);
                    this.field436 = new class40(var6, "redstone3", 0);
                    this.field436.method422((byte) 6);
                    this.field437 = new class40(var6, "redstone1", 0);
                    this.field437.method421(-623);
                    this.field437.method422((byte) 6);
                    this.field438 = new class40(var6, "redstone2", 0);
                    this.field438.method421(-623);
                    this.field438.method422((byte) 6);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field483[var36] = new class40(var6, "mod_icons", var36);
                    }
                    class56 var37 = new class56(var6, "backleft1", 0);
                    this.field301 = new class28(this.method117((byte) 0), var37.field1436, (byte) 0, var37.field1437);
                    var37.method505(2, 0, 0);
                    class56 var38 = new class56(var6, "backleft2", 0);
                    this.field302 = new class28(this.method117((byte) 0), var38.field1436, (byte) 0, var38.field1437);
                    var38.method505(2, 0, 0);
                    class56 var39 = new class56(var6, "backright1", 0);
                    this.field303 = new class28(this.method117((byte) 0), var39.field1436, (byte) 0, var39.field1437);
                    var39.method505(2, 0, 0);
                    class56 var40 = new class56(var6, "backright2", 0);
                    this.field304 = new class28(this.method117((byte) 0), var40.field1436, (byte) 0, var40.field1437);
                    var40.method505(2, 0, 0);
                    class56 var41 = new class56(var6, "backtop1", 0);
                    this.field305 = new class28(this.method117((byte) 0), var41.field1436, (byte) 0, var41.field1437);
                    var41.method505(2, 0, 0);
                    class56 var42 = new class56(var6, "backvmid1", 0);
                    this.field306 = new class28(this.method117((byte) 0), var42.field1436, (byte) 0, var42.field1437);
                    var42.method505(2, 0, 0);
                    class56 var43 = new class56(var6, "backvmid2", 0);
                    this.field307 = new class28(this.method117((byte) 0), var43.field1436, (byte) 0, var43.field1437);
                    var43.method505(2, 0, 0);
                    class56 var44 = new class56(var6, "backvmid3", 0);
                    this.field308 = new class28(this.method117((byte) 0), var44.field1436, (byte) 0, var44.field1437);
                    var44.method505(2, 0, 0);
                    class56 var45 = new class56(var6, "backhmid2", 0);
                    this.field309 = new class28(this.method117((byte) 0), var45.field1436, (byte) 0, var45.field1437);
                    var45.method505(2, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field500[var50] != null) {
                            this.field500[var50].method503(var47 + var49, false, var46 + var49, var48 + var49);
                        }
                        if (this.field255[var50] != null) {
                            this.field255[var50].method423(var47 + var49, false, var46 + var49, var48 + var49);
                        }
                    }
                    this.method149("Unpacking textures", 83, false);
                    class39.method407(549, var7);
                    class39.method411(0.8D, -802);
                    class39.method406(20, -854);
                    this.method149("Unpacking config", 86, false);
                    class67.method582(3, var4);
                    class70.method593(var4);
                    class21.method295(3, var4);
                    class34.method348(var4);
                    class57.method521(var4);
                    class9.method29(3, var4);
                    class29.method330(3, var4);
                    class5.method15(3, var4);
                    class47.method430(3, var4);
                    class34.field990 = field292;
                    if (!field293) {
                        this.method149("Unpacking sounds", 90, false);
                        byte[] var51 = var9.method545("sounds.dat", (byte[]) null);
                        class10 var52 = new class10(var51, field386);
                        class4.method9(3, var52);
                    }
                    this.method149("Unpacking interfaces", 95, false);
                    class11[] var53 = new class11[] { this.field220, this.field221, this.field222, this.field223 };
                    class65.method576(var6, (byte) 0, var5, var53);
                    this.method149("Preparing game engine", 100, false);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field201.field1171[this.field201.field1173 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field560[var54] = var55;
                        this.field524[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field201.field1171[this.field201.field1173 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field185[var58 - 5] = var59 - 25;
                        this.field310[var58 - 5] = var60 - var59;
                    }
                    class39.method404(765, 0, 503);
                    this.field497 = class39.field1156;
                    class39.method404(479, 0, 96);
                    this.field494 = class39.field1156;
                    class39.method404(190, 0, 261);
                    this.field495 = class39.field1156;
                    class39.method404(512, 0, 334);
                    this.field496 = class39.field1156;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class39.field1154[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class53.method484(800, 512, field416, 500, var62, 334);
                    class37.method359(var8);
                    this.field451 = new class69(field426, this);
                    this.method97(this.field451, 10);
                    class15.field688 = this;
                    class70.field1719 = this;
                    class57.field1443 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field613 + " " + this.field509);
                    this.field461 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLWJQTPVDG;)Z")
    public final boolean method177(boolean arg0, class65 arg1) {
        if (arg0) {
            this.method176();
        }
        int var3 = arg1.field1585;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field122[this.field407] = "Remove @whi@" + arg1.field1613;
                this.field279[this.field407] = 510;
                ++this.field407;
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
            this.field122[this.field407] = "Remove @whi@" + this.field204[var3];
            this.field279[this.field407] = 804;
            ++this.field407;
            this.field122[this.field407] = "Message @whi@" + this.field204[var3];
            this.field279[this.field407] = 847;
            ++this.field407;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILCMGGUSPR;B)V")
    private final void method178(int arg0, class10 arg1, byte arg2) {
        for (int var4 = 0; var4 < this.field238; ++var4) {
            int var5 = this.field239[var4];
            class25 var6 = this.field153[var5];
            int var7 = arg1.method194();
            if ((var7 & 32) != 0) {
                int var8 = arg1.method222(0);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = arg1.method214(false);
                if (var6.field1300 == var8 && var8 != -1) {
                    int var10 = class67.field1666[var8].field1680;
                    if (var10 == 1) {
                        var6.field1301 = 0;
                        var6.field1302 = 0;
                        var6.field1303 = var9;
                        var6.field1304 = 0;
                    }
                    if (var10 == 2) {
                        var6.field1304 = 0;
                    }
                } else if (var8 == -1 || var6.field1300 == -1 || class67.field1666[var8].field1674 >= class67.field1666[var6.field1300].field1674) {
                    var6.field1300 = var8;
                    var6.field1301 = 0;
                    var6.field1302 = 0;
                    var6.field1303 = var9;
                    var6.field1304 = 0;
                    var6.field1321 = var6.field1309;
                }
            }
            if ((var7 & 1) != 0) {
                int var11 = arg1.method194();
                int var12 = arg1.method212(false);
                var6.method441(field471, (byte) 5, var12, var11);
                var6.field1313 = field471 + 300;
                var6.field1314 = arg1.method194();
                var6.field1315 = arg1.method213((byte) 7);
            }
            if ((var7 & 8) != 0) {
                var6.field887 = class57.method517(arg1.method196());
                var6.field1308 = var6.field887.field1472;
                var6.field1316 = var6.field887.field1445;
                var6.field1268 = var6.field887.field1450;
                var6.field1269 = var6.field887.field1469;
                var6.field1270 = var6.field887.field1451;
                var6.field1271 = var6.field887.field1470;
                var6.field1286 = var6.field887.field1482;
            }
            if ((var7 & 4) != 0) {
                int var13 = arg1.method213((byte) 7);
                int var14 = arg1.method213((byte) 7);
                var6.method441(field471, (byte) 5, var14, var13);
                var6.field1313 = field471 + 300;
                var6.field1314 = arg1.method214(false);
                var6.field1315 = arg1.method212(false);
            }
            if ((var7 & 2) != 0) {
                var6.field1273 = arg1.method196();
                int var15 = arg1.method228(field390);
                var6.field1277 = var15 >> 16;
                var6.field1276 = (var15 & 65535) + field471;
                var6.field1274 = 0;
                var6.field1275 = 0;
                if (var6.field1276 > field471) {
                    var6.field1274 = -1;
                }
                if (var6.field1273 == 65535) {
                    var6.field1273 = -1;
                }
            }
            if ((var7 & 128) != 0) {
                var6.field1311 = arg1.method201();
                var6.field1272 = 100;
            }
            if ((var7 & 64) != 0) {
                var6.field1317 = arg1.method222(0);
                var6.field1318 = arg1.method221(-474);
            }
            if ((var7 & 16) != 0) {
                var6.field1295 = arg1.method223(2);
                if (var6.field1295 == 65535) {
                    var6.field1295 = -1;
                }
            }
        }
        if (arg2 != 25) {
            this.field331 = !this.field331;
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(B)V")
    public static final void method179(byte arg0) {
        class53.field1339 = false;
        class39.field1145 = false;
        field293 = false;
        class27.field903 = false;
        if (arg0 == 0) {
            boolean var1 = false;
            class70.field1709 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method180(boolean arg0) {
        if (this.field493 > 1) {
            --this.field493;
        }
        if (this.field599 > 0) {
            --this.field599;
        }
        for (int var2 = 0; var2 < 5 && this.method78(false); ++var2) {
        }
        if (this.field132) {
            Object var3 = this.field451.field1695;
            synchronized (this.field451.field1695) {
                if (!field415) {
                    this.field451.field1700 = 0;
                } else if (super.field1133 != 0 || this.field451.field1700 >= 40) {
                    this.field336.method183(164, this.field230);
                    this.field336.method184(0);
                    int var4 = this.field336.field646;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field451.field1700 && var4 - this.field336.field646 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field451.field1696[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field451.field1699[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field451.field1696[var6] == -1 && this.field451.field1699[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field428 == var8 && this.field429 == var7) {
                            if (this.field579 < 2047) {
                                ++this.field579;
                            }
                        } else {
                            int var10 = var8 - this.field428;
                            this.field428 = var8;
                            int var11 = var7 - this.field429;
                            this.field429 = var7;
                            if (this.field579 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field336.method185((this.field579 << 12) + (var10 << 6) + var11);
                                this.field579 = 0;
                            } else if (this.field579 < 8) {
                                this.field336.method187((this.field579 << 19) + 8388608 + var9);
                                this.field579 = 0;
                            } else {
                                this.field336.method188((this.field579 << 19) + -1073741824 + var9);
                                this.field579 = 0;
                            }
                        }
                    }
                    this.field336.method193(this.field336.field646 - var4, false);
                    if (var5 >= this.field451.field1700) {
                        this.field451.field1700 = 0;
                    } else {
                        this.field451.field1700 -= var5;
                        for (int var12 = 0; var12 < this.field451.field1700; ++var12) {
                            this.field451.field1699[var12] = this.field451.field1699[var5 + var12];
                            this.field451.field1696[var12] = this.field451.field1696[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1133 != 0) {
                long var13 = (super.field1136 - this.field465) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field465 = super.field1136;
                int var15 = super.field1135;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1134;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1133 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field336.method183(183, this.field230);
                this.field336.method226((var18 << 19) + (var19 << 20) + var17, (byte) -74);
            }
            if (this.field504 > 0) {
                --this.field504;
            }
            if (super.field1137[1] == 1 || super.field1137[2] == 1 || super.field1137[3] == 1 || super.field1137[4] == 1) {
                this.field505 = true;
            }
            if (this.field505 && this.field504 <= 0) {
                this.field504 = 20;
                this.field505 = false;
                this.field336.method183(193, this.field230);
                this.field336.method219(this.field403, 0);
                this.field336.method218(this.field404, 0);
            }
            if (super.field1124 && !this.field389) {
                this.field389 = true;
                this.field336.method183(133, this.field230);
                this.field336.method184(1);
            }
            if (!super.field1124 && this.field389) {
                this.field389 = false;
                this.field336.method183(133, this.field230);
                this.field336.method184(0);
            }
            this.method40(44331);
            this.method47(39457);
            this.method160(-177);
            ++this.field597;
            if (this.field597 > 750) {
                this.method142(545);
            }
            this.method138((byte) 122);
            this.method68((byte) -97);
            this.method158((byte) 7);
            ++this.field263;
            if (this.field571 != 0) {
                this.field570 += 20;
                if (this.field570 >= 400) {
                    this.field571 = 0;
                }
            }
            if (this.field564 != 0) {
                ++this.field561;
                if (this.field561 >= 15) {
                    if (this.field564 == 2) {
                        this.field472 = true;
                    }
                    if (this.field564 == 3) {
                        this.field550 = true;
                    }
                    this.field564 = 0;
                }
            }
            if (this.field575 != 0) {
                ++this.field241;
                if (super.field1127 > this.field576 + 5 || super.field1127 < this.field576 - 5 || super.field1128 > this.field577 + 5 || super.field1128 < this.field577 - 5) {
                    this.field532 = true;
                }
                if (super.field1126 == 0) {
                    if (this.field575 == 2) {
                        this.field472 = true;
                    }
                    if (this.field575 == 3) {
                        this.field550 = true;
                    }
                    this.field575 = 0;
                    if (this.field532 && this.field241 >= 5) {
                        this.field398 = -1;
                        this.method165((byte) 8);
                        if (this.field573 == this.field398 && this.field574 != this.field397) {
                            class65 var20 = class65.method577(this.field573);
                            byte var21 = 0;
                            if (this.field546 == 1 && var20.field1585 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1617[this.field397] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1587) {
                                int var22 = this.field574;
                                int var23 = this.field397;
                                var20.field1617[var23] = var20.field1617[var22];
                                var20.field1623[var23] = var20.field1623[var22];
                                var20.field1617[var22] = -1;
                                var20.field1623[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field574;
                                int var25 = this.field397;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method573(var24 - 1, var24, this.field587);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method573(var24 + 1, var24, this.field587);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method573(this.field397, this.field574, this.field587);
                            }
                            this.field336.method183(135, this.field230);
                            this.field336.method219(this.field574, 0);
                            this.field336.method220(this.field397, -7774);
                            this.field336.method185(this.field573);
                            this.field336.method210(var21, this.field513);
                        }
                    } else if ((this.field332 == 1 || this.method136(this.field407 - 1, 31203)) && this.field407 > 2) {
                        this.method85((byte) 3);
                    } else if (this.field407 > 0) {
                        this.method102(this.field407 - 1, 254);
                    }
                    this.field561 = 10;
                    super.field1133 = 0;
                }
            }
            if (class53.field1373 != -1) {
                int var26 = class53.field1373;
                int var27 = class53.field1374;
                boolean var28 = this.method92(field394.field1293[0], var26, 0, 0, -20821, 0, var27, 0, 0, field394.field1292[0], 0, true);
                class53.field1373 = -1;
                if (var28) {
                    this.field568 = super.field1134;
                    this.field569 = super.field1135;
                    this.field571 = 1;
                    this.field570 = 0;
                }
            }
            if (super.field1133 == 1 && this.field140 != null) {
                this.field140 = null;
                this.field550 = true;
                super.field1133 = 0;
            }
            this.method139(47958);
            if (arg0) {
                this.field596 = -1;
            }
            if (this.field614 == -1) {
                this.method94(-51);
                this.method129(-342);
                this.method137(-551);
            }
            if (super.field1126 == 1 || super.field1133 == 1) {
                ++this.field243;
            }
            if (this.field182 == 0 && this.field143 == 0 && this.field226 == 0) {
                if (this.field484 > 0) {
                    --this.field484;
                }
            } else if (this.field484 < 100) {
                ++this.field484;
                if (this.field484 == 100) {
                    if (this.field182 != 0) {
                        this.field550 = true;
                    }
                    if (this.field143 != 0) {
                        this.field472 = true;
                    }
                }
            }
            if (this.field333 == 2) {
                this.method84((byte) 6);
            }
            if (this.field333 == 2 && this.field283) {
                this.method110(-963);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field488[var29]++;
            }
            this.method169(-571);
            ++super.field1125;
            if (super.field1125 > 4500) {
                this.field599 = 250;
                super.field1125 -= 500;
                this.field336.method183(47, this.field230);
            }
            ++this.field486;
            if (this.field486 > 500) {
                this.field486 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field267 += this.field268;
                }
                if ((var30 & 2) == 2) {
                    this.field517 += this.field518;
                }
                if ((var30 & 4) == 4) {
                    this.field177 += this.field178;
                }
            }
            if (this.field267 < -50) {
                this.field268 = 2;
            }
            if (this.field267 > 50) {
                this.field268 = -2;
            }
            if (this.field517 < -55) {
                this.field518 = 2;
            }
            if (this.field517 > 55) {
                this.field518 = -2;
            }
            if (this.field177 < -40) {
                this.field178 = 1;
            }
            if (this.field177 > 40) {
                this.field178 = -1;
            }
            ++this.field592;
            if (this.field592 > 500) {
                this.field592 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field326 += this.field327;
                }
                if ((var31 & 2) == 2) {
                    this.field467 += this.field468;
                }
            }
            if (this.field326 < -60) {
                this.field327 = 2;
            }
            if (this.field326 > 60) {
                this.field327 = -2;
            }
            if (this.field467 < -20) {
                this.field468 = 1;
            }
            if (this.field467 > 10) {
                this.field468 = -1;
            }
            ++this.field598;
            if (this.field598 > 50) {
                this.field336.method183(21, this.field230);
            }
            try {
                if (this.field351 != null && this.field336.field646 > 0) {
                    this.field351.method550(0, false, this.field336.field645, this.field336.field646);
                    this.field336.field646 = 0;
                    this.field598 = 0;
                }
            } catch (IOException var33) {
                this.method142(545);
            } catch (Exception var34) {
                this.method56(24238);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class23 var11 = null;
        class23 var12 = (class23) this.field450.method567();
        this.field595 += arg6;
        while (var12 != null) {
            if (var12.field876 == arg5 && var12.field878 == arg4 && var12.field879 == arg1 && var12.field877 == arg2) {
                var11 = var12;
                break;
            }
            var12 = (class23) this.field450.method569(false);
        }
        if (var11 == null) {
            var11 = new class23();
            var11.field876 = arg5;
            var11.field877 = arg2;
            var11.field878 = arg4;
            var11.field879 = arg1;
            this.method77(-39880, var11);
            this.field450.method564(var11);
        }
        var11.field873 = arg0;
        var11.field875 = arg8;
        var11.field874 = arg3;
        var11.field868 = arg9;
        var11.field869 = arg7;
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field512) {
            this.method135((byte) 0);
        } else {
            super.run();
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field373[var1] = var0 / 4;
        }
        field386 = 536;
        field390 = -39668;
        field391 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field408 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field408[var3] = var2 - 1;
            var2 += var2;
        }
        field416 = 123;
        field426 = -370;
        field565 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field572 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    }
}
