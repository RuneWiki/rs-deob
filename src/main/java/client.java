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
public class client extends class9 {

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    private int field83 = 1;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
    private int[] field84 = new int[100];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "[Ljava/lang/String;")
    private String[] field85 = new String[100];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "[Ljava/lang/String;")
    private String[] field86 = new String[100];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "B")
    private byte field88 = 3;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    private int field91 = 478;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Ljava/lang/String;")
    private String field93 = "";

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[Ljava/lang/String;")
    private String[] field95 = new String[100];

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
    private int[] field96 = new int[100];

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Z")
    private boolean field98 = false;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    private int[] field99 = new int[151];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[LFKNRMZJV;")
    private class13[] field100 = new class13[20];

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
    private int[] field101 = new int[33];

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    private boolean field105 = false;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    private boolean field109 = false;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field110 = new CRC32();

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "LFYVRCFGT;")
    private class16 field111 = new class16(true);

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "[I")
    private int[] field112 = new int[33];

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "LNQUAUMDT;")
    private class36 field113 = class36.method327(1, 0);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    private boolean field115 = true;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private int field117 = -17;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field119 = 3;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
    private int[] field120 = new int[9];

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    private int field122 = 3353893;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    private final int field123 = 100;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
    private int[] field124 = new int[100];

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "Z")
    private boolean field126 = false;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
    private int[] field127 = new int[151];

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "[LFKNRMZJV;")
    private class13[] field128 = new class13[32];

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
    private boolean field145 = true;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field146 = -1;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "Z")
    private boolean field153 = false;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
    private int[] field154 = new int[7];

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
    private int field158 = -1;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
    private final int[] field159 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "LVGGOSQRK;")
    private class60 field162 = new class60();

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "LNQUAUMDT;")
    private class36 field163 = new class36(-587, new byte[5000]);

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "[LDWBMCYCE;")
    private class8[] field164 = new class8[16384];

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
    public int[] field166 = new int[16384];

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field168 = -1;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "Ljava/lang/String;")
    private String field170 = "";

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "[LAOYWVYEX;")
    public class1[] field172 = new class1[5];

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
    private int field173 = -951;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "Z")
    private boolean field179 = true;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
    private int[] field193 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "Z")
    private boolean field194 = false;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field195 = 2301979;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
    private int[] field197 = new int[50];

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
    private int field199 = -1;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    private int field200 = -1;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private int field203 = 906;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
    private int[] field204 = new int[200];

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
    private boolean field206 = false;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "Z")
    private boolean field208 = false;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private int field212 = 2;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "Z")
    private boolean field213 = false;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "Ljava/lang/String;")
    private String field219 = "";

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "[[[I")
    private int[][][] field223 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
    private int field225 = 2;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "B")
    private byte field233 = 48;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
    public boolean field237 = true;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
    private int[] field239 = new int[5];

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "[[I")
    private int[][] field242 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
    private int field243 = -490;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "LFYVRCFGT;")
    private class16 field245 = new class16(true);

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private int field246 = -1;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "[[I")
    private int[][] field247 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int field255 = 2;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "[J")
    private long[] field256 = new long[100];

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private int field258 = 7759444;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
    private boolean field263 = false;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "Z")
    private boolean field269 = false;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
    private int[] field270 = new int[4000];

    @OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
    private int[] field271 = new int[4000];

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "Z")
    private boolean field273 = false;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "[Ljava/lang/String;")
    private String[] field275 = new String[5];

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "[Z")
    private boolean[] field276 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int field278 = -1;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "[LUZETOFZZ;")
    private class59[] field295 = new class59[13];

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field296 = 5063219;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int field307 = 128;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field311 = 4;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "[I")
    private int[] field318 = new int[class29.field963];

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
    private int field325 = 1;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
    private int field326 = -1;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
    private boolean field328 = false;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
    private int[] field329 = new int[class29.field963];

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field333 = -1;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "Z")
    private volatile boolean field340 = false;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "Z")
    public boolean field342 = false;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int field346 = 3;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field347 = 718;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
    private int[] field349 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
    private int[] field350 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field351 = -1;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "[LUZETOFZZ;")
    private class59[] field352 = new class59[2];

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    private int field354 = 50;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
    private int[] field355 = new int[this.field354];

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
    private int[] field356 = new int[this.field354];

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
    private int[] field357 = new int[this.field354];

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
    private int[] field358 = new int[this.field354];

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "[I")
    private int[] field359 = new int[this.field354];

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "[I")
    private int[] field360 = new int[this.field354];

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
    private int[] field361 = new int[this.field354];

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "[Ljava/lang/String;")
    private String[] field362 = new String[this.field354];

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "[J")
    private long[] field364 = new long[200];

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field365 = -16070;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "LNQUAUMDT;")
    private class36 field366 = class36.method327(1, 0);

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "[LFKNRMZJV;")
    private class13[] field368 = new class13[1000];

    @OriginalMember(owner = "client!client", name = "og", descriptor = "I")
    private int field370 = -1;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
    private int[] field373 = new int[50];

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
    private int[] field374 = new int[5];

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
    private boolean field380 = false;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "[[[LFYVRCFGT;")
    private class16[][][] field382 = new class16[4][104][104];

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
    private int[] field383 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "Ljava/lang/String;")
    private String field384 = "";

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Ljava/lang/String;")
    private String[] field385 = new String[500];

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field387 = -1;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "Ljava/lang/String;")
    private String field388 = "";

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "Ljava/lang/String;")
    private String field389 = "";

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field390 = 98;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
    public int[] field391 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
    private int[] field406 = new int[5];

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
    private boolean field417 = false;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "[I")
    private int[] field421 = new int[class29.field963];

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
    public int[] field426 = new int[1000];

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
    private int[] field428 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private int field429 = -1;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
    private int field441 = 2048;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int field442 = 2047;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "[LXVMRCEYW;")
    private class65[] field443 = new class65[this.field441];

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "[I")
    public int[] field445 = new int[this.field441];

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
    private int[] field447 = new int[this.field441];

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "[LNQUAUMDT;")
    private class36[] field448 = new class36[this.field441];

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "[LFKNRMZJV;")
    private class13[] field452 = new class13[8];

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
    private int field455 = 6;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
    private int field460 = 8;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "[Ljava/lang/String;")
    private String[] field462 = new String[200];

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "B")
    private byte field470 = 5;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "[LUZETOFZZ;")
    private class59[] field471 = new class59[100];

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "[B")
    private byte[] field473 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
    private boolean field474 = false;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "Ljava/lang/String;")
    private String field476 = "";

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "Ljava/lang/String;")
    private String field477 = "";

    @OriginalMember(owner = "client!client", name = "si", descriptor = "[[I")
    private int[][] field478 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field479 = 353;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
    private int field480 = -1;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
    private int field482 = 793;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
    private boolean field483 = false;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field487 = 4;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "[LFKNRMZJV;")
    private class13[] field488 = new class13[100];

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
    public int[] field489 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
    private int field490 = 78;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
    private int[] field491 = new int[50];

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "Ljava/lang/String;")
    private String field494 = "";

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field501 = -1;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
    private boolean field502 = false;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "[Z")
    private boolean[] field504 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
    private boolean field513 = false;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
    private volatile boolean field516 = false;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
    private volatile boolean field517 = false;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "Z")
    private boolean field519 = true;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field526 = -39100;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "Ljava/lang/String;")
    private String field527 = "";

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
    private int field529 = -1;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "LNQUAUMDT;")
    private class36 field530 = class36.method327(1, 0);

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "B")
    private byte field535 = -123;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
    private int[] field537 = new int[5];

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "[LFKNRMZJV;")
    private class13[] field538 = new class13[32];

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
    private boolean field539 = false;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
    private int[] field540 = new int[5];

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "[LFKNRMZJV;")
    private class13[] field542 = new class13[32];

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "Z")
    private boolean field543 = false;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "B")
    private byte field546 = -83;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "[LYCMSDYIA;")
    private class67[] field547 = new class67[4];

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "LFYVRCFGT;")
    private class16 field548 = new class16(true);

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
    private int[] field559 = new int[500];

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
    private int[] field560 = new int[500];

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "[I")
    private int[] field561 = new int[500];

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
    private int[] field562 = new int[500];

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
    private boolean field563 = false;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
    private int[] field565 = new int[256];

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "Z")
    private boolean field566 = false;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field568 = -680;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "Z")
    private boolean field570 = false;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "Z")
    private boolean field571 = false;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "[[I")
    public static final int[][] field160 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
    private static int field180 = 10;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "Z")
    private static boolean field182 = true;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "Z")
    private static boolean field205 = true;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "Ljava/lang/String;")
    private static String field207 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
    private static int field274 = 14733;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field302 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
    private static int field339 = 43335;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
    public static final int[] field458 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field468 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
    private static int[] field500 = new int[99];

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
    public static int[] field544;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field114;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private static int field147;

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

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
    private static int field169;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    private static int field198;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private static int field226;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
    private static int field279;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
    private static int field281;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    private static int field285;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    private static int field306;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
    private static int field316;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
    private static int field317;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private static int field338;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private static int field381;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private static int field392;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
    private static int field434;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private static int field435;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
    private static int field449;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private static int field481;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private static int field484;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
    private static int field549;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    private int field82;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "J")
    private long field249;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "J")
    public long field284;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "J")
    private long field291;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "J")
    private long field427;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "J")
    private long field492;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "LERQSZFRT;")
    private class10 field142;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "LERQSZFRT;")
    private class10 field143;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "LERQSZFRT;")
    private class10 field144;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "LERQSZFRT;")
    private class10 field264;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "LERQSZFRT;")
    private class10 field265;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "LERQSZFRT;")
    private class10 field266;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "LERQSZFRT;")
    private class10 field267;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "LERQSZFRT;")
    private class10 field393;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "LERQSZFRT;")
    private class10 field394;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "LERQSZFRT;")
    private class10 field395;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "LERQSZFRT;")
    private class10 field396;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "LERQSZFRT;")
    private class10 field397;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "LERQSZFRT;")
    private class10 field398;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "LERQSZFRT;")
    private class10 field399;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "LERQSZFRT;")
    private class10 field400;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "LERQSZFRT;")
    private class10 field401;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "LERQSZFRT;")
    private class10 field407;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "LERQSZFRT;")
    private class10 field408;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "LERQSZFRT;")
    private class10 field409;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "LERQSZFRT;")
    private class10 field410;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "LERQSZFRT;")
    private class10 field411;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "LERQSZFRT;")
    private class10 field412;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "LERQSZFRT;")
    private class10 field413;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "LERQSZFRT;")
    private class10 field414;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "LERQSZFRT;")
    private class10 field415;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "LFKNRMZJV;")
    private class13 field134;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "LFKNRMZJV;")
    private class13 field135;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "LFKNRMZJV;")
    private class13 field161;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "LFKNRMZJV;")
    private class13 field209;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "LFKNRMZJV;")
    private class13 field210;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "LFKNRMZJV;")
    private class13 field371;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "LFKNRMZJV;")
    private class13 field418;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "LFKNRMZJV;")
    private class13 field424;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "LFKNRMZJV;")
    private class13 field521;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "LFKNRMZJV;")
    private class13 field522;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "LFKNRMZJV;")
    private class13 field523;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "LFKNRMZJV;")
    private class13 field524;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "LFKNRMZJV;")
    private class13 field525;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "LFKNRMZJV;")
    private class13 field554;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "LFKNRMZJV;")
    private class13 field555;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "LKAZZDHJI;")
    private class24 field486;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "LNJYVZTLI;")
    private class34 field440;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "LQIACHOJO;")
    private class45 field469;

    @OriginalMember(owner = "client!client", name = "je", descriptor = "LRQLSQIAP;")
    public class48 field262;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "LRSPRYUFS;")
    private class49 field282;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "LTJCUOFPI;")
    private class53 field402;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "LTJCUOFPI;")
    private class53 field403;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "LTJCUOFPI;")
    private class53 field404;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "LTJCUOFPI;")
    private class53 field405;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "LUJWODGQS;")
    private class56 field196;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "LUZETOFZZ;")
    private class59 field174;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "LUZETOFZZ;")
    private class59 field175;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "LUZETOFZZ;")
    private class59 field176;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "LUZETOFZZ;")
    private class59 field177;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "LUZETOFZZ;")
    private class59 field178;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "LUZETOFZZ;")
    private class59 field214;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "LUZETOFZZ;")
    private class59 field215;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "LUZETOFZZ;")
    private class59 field216;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "LUZETOFZZ;")
    private class59 field217;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "LUZETOFZZ;")
    private class59 field218;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "LUZETOFZZ;")
    private class59 field330;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "LUZETOFZZ;")
    private class59 field331;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "LUZETOFZZ;")
    private class59 field431;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "LUZETOFZZ;")
    private class59 field432;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "LUZETOFZZ;")
    private class59 field436;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "LUZETOFZZ;")
    private class59 field437;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "LUZETOFZZ;")
    private class59 field438;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "LUZETOFZZ;")
    private class59 field496;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "LUZETOFZZ;")
    private class59 field497;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "LUZETOFZZ;")
    private class59 field498;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "LXVMRCEYW;")
    public static class65 field419;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "Ljava/lang/String;")
    public String field188;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "Ljava/lang/String;")
    private String field248;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "Ljava/lang/String;")
    public String field467;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Ljava/lang/String;")
    private String field90;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "Ljava/net/Socket;")
    private Socket field156;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
    public static boolean field116;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
    private static boolean field155;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "Z")
    private static boolean field183;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "Z")
    private static boolean field283;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "Z")
    public static boolean field493;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "Z")
    private static boolean field536;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
    private int[] field189;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
    private int[] field190;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
    private int[] field191;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "[I")
    private int[] field192;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
    private int[] field201;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
    private int[] field202;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "[I")
    private int[] field335;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "[I")
    private int[] field336;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
    private int[] field337;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
    private int[] field514;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "[I")
    private int[] field515;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
    private int[] field531;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "[I")
    private int[] field532;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "[I")
    private int[] field533;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
    private int[] field534;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "[LUZETOFZZ;")
    private class59[] field234;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "[[B")
    private byte[][] field372;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "[[B")
    private byte[][] field564;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "[[[B")
    private byte[][][] field512;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "[[[I")
    private int[][][] field439;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        while (arg0 >= 0) {
            this.field149 = -1;
        }
        if (this.field277 == 0) {
            if (super.field623 == 1) {
                int var2 = super.field624 - 25 - 550;
                int var3 = super.field625 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field308 + this.field211 & 2047;
                    int var5 = class72.field1745[var4];
                    int var6 = class72.field1746[var4];
                    int var7 = (this.field82 + 256) * var5 >> 8;
                    int var8 = (this.field82 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field419.field1559 + var9 >> 7;
                    int var12 = field419.field1560 - var10 >> 7;
                    boolean var13 = this.method156(0, 0, var12, 0, field419.field1570[0], 0, var11, 0, true, 0, 1, field419.field1569[0]);
                    if (var13) {
                        this.field366.method329(var2);
                        this.field366.method329(var3);
                        this.field366.method330(this.field308);
                        this.field366.method329(57);
                        this.field366.method329(this.field211);
                        this.field366.method329(this.field82);
                        this.field366.method329(89);
                        this.field366.method330(field419.field1559);
                        this.field366.method330(field419.field1560);
                        this.field366.method329(this.field315);
                        this.field366.method329(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method19(byte arg0) {
        if (this.field152 > 0) {
            this.method23((byte) 64);
        } else {
            this.method24("Please wait - attempting to reestablish", "Connection lost", -252);
            this.field277 = 0;
            this.field422 = 0;
            if (arg0 == 110) {
                class45 var2 = this.field469;
                this.field342 = false;
                this.field268 = 0;
                this.method38(this.field476, this.field477, true);
                if (!this.field342) {
                    this.method23((byte) 64);
                }
                try {
                    var2.method420();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class6 var11 = null;
        class6 var12 = (class6) this.field111.method200();
        if (arg2 != 16885) {
            this.field460 = -341;
        }
        while (var12 != null) {
            if (var12.field573 == arg7 && var12.field575 == arg8 && var12.field576 == arg4 && var12.field574 == arg9) {
                var11 = var12;
                break;
            }
            var12 = (class6) this.field111.method202(8);
        }
        if (var11 == null) {
            var11 = new class6();
            var11.field573 = arg7;
            var11.field574 = arg9;
            var11.field575 = arg8;
            var11.field576 = arg4;
            this.method139(var11, -404);
            this.field111.method197(var11);
        }
        var11.field578 = arg3;
        var11.field580 = arg1;
        var11.field579 = arg0;
        var11.field577 = arg5;
        var11.field581 = arg6;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILVGGOSQRK;B)I")
    public final int method21(int arg0, class60 arg1, byte arg2) {
        if (arg2 != -15) {
            return 3;
        } else if (arg1.field1444 != null && arg0 < arg1.field1444.length) {
            try {
                int[] var4 = arg1.field1444[arg0];
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
                        var9 = this.field329[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field318[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class60 var11 = class60.method538(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class58.field1354 && (!class58.method520(var12).field1386 || field182)) {
                            for (int var13 = 0; var13 < var11.field1415.length; ++var13) {
                                if (var12 + 1 == var11.field1415[var13]) {
                                    var9 += var11.field1439[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field489[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field500[this.field329[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field489[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field419.field1613;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class29.field963; ++var14) {
                            if (class29.field965[var14]) {
                                var9 += this.field329[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class60 var15 = class60.method538(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class58.field1354 && (!class58.method520(var16).field1386 || field182)) {
                            for (int var17 = 0; var17 < var15.field1415.length; ++var17) {
                                if (var15.field1415[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field114;
                    }
                    if (var8 == 12) {
                        var9 = this.field457;
                    }
                    if (var8 == 13) {
                        int var18 = this.field489[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class23 var21 = class23.field837[var20];
                        int var22 = var21.field839;
                        int var23 = var21.field840;
                        int var24 = var21.field841;
                        int var25 = field544[var24 - var23];
                        var9 = this.field489[var22] >> var23 & var25;
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
                        var9 = (field419.field1559 >> 7) + this.field287;
                    }
                    if (var8 == 19) {
                        var9 = (field419.field1560 >> 7) + this.field288;
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

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method22(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method23(byte arg0) {
        try {
            if (this.field469 != null) {
                this.field469.method420();
            }
        } catch (Exception var4) {
        }
        this.field469 = null;
        this.field342 = false;
        if (arg0 != 64) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field157 = 0;
        this.field476 = "";
        this.field477 = "";
        this.method143(-920);
        this.field196.method458(false);
        for (int var3 = 0; var3 < 4; ++var3) {
            this.field547[var3].method561();
        }
        System.gc();
        this.method65(6);
        this.field146 = -1;
        this.field518 = -1;
        this.field87 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public final void method24(String arg0, String arg1, int arg2) {
        while (arg2 >= 0) {
            this.method132();
        }
        if (this.field266 != null) {
            this.field266.method173(true);
            class72.field1747 = this.field533;
            int var4 = 151;
            if (arg0 != null) {
                var4 -= 7;
            }
            this.field403.method435(0, var4, 0, arg1, 257);
            this.field403.method435(16777215, var4 - 1, 0, arg1, 256);
            var4 += 15;
            if (arg0 != null) {
                this.field403.method435(0, var4, 0, arg0, 257);
                this.field403.method435(16777215, var4 - 1, 0, arg0, 256);
            }
            this.field266.method174(super.field609, true, 4, 4);
        } else if (super.field610 != null) {
            super.field610.method173(true);
            class72.field1747 = this.field534;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class61.method547(var6, 383 - var6 / 2, var7, var5 - 5 - var7 / 2, 0, 3);
            class61.method548(383 - var6 / 2, var6, 16777215, var7, var5 - 5 - var7 / 2, 0);
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field403.method435(0, var5, 0, arg1, 383);
            this.field403.method435(16777215, var5 - 1, 0, arg1, 382);
            var5 += 15;
            if (arg0 != null) {
                this.field403.method435(0, var5, 0, arg0, 383);
                this.field403.method435(16777215, var5 - 1, 0, arg0, 382);
            }
            super.field610.method174(super.field609, true, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public final void method25(int arg0, int arg1) {
        if (arg0 != 26284) {
            field339 = this.field486.method241();
        }
        if (!field183) {
            for (int var3 = 0; var3 < this.field391.length; ++var3) {
                int var4 = this.field391[var3];
                if (class72.field1755[var4] >= arg1) {
                    class59 var5 = class72.field1749[var4];
                    int var6 = var5.field1410 * var5.field1409 - 1;
                    int var7 = this.field118 * var5.field1409 * 2;
                    byte[] var8 = var5.field1407;
                    byte[] var9 = this.field473;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1407 = var9;
                    this.field473 = var8;
                    class72.method595((byte) 11, var4);
                }
            }
            ++field147;
            if (field147 > 136) {
                field147 = 0;
                this.field366.method328(-818, 68);
                this.field366.method330(8854);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method26(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg0;
        this.field148 += arg1;
        return ((arg2 & 16711935) * var5 + (arg3 & 16711935) * arg0 & -16711936) + ((arg2 & 65280) * var5 + (arg3 & 65280) * arg0 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Z")
    public final boolean method27(int arg0) {
        if (arg0 != 0) {
            this.field149 = this.field530.method339();
        }
        if (this.field469 == null) {
            return false;
        } else {
            try {
                int var2 = this.field469.method422();
                if (var2 == 0) {
                    return false;
                }
                if (this.field149 == -1) {
                    this.field469.method423(this.field530.field1071, 0, 1);
                    this.field149 = this.field530.field1071[0] & 255;
                    if (this.field486 != null) {
                        this.field149 = this.field149 - this.field486.method241() & 255;
                    }
                    this.field148 = class18.field729[this.field149];
                    --var2;
                }
                if (this.field148 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field469.method423(this.field530.field1071, 0, 1);
                    this.field148 = this.field530.field1071[0] & 255;
                    --var2;
                }
                if (this.field148 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field469.method423(this.field530.field1071, 0, 2);
                    this.field530.field1072 = 0;
                    this.field148 = this.field530.method341();
                    var2 -= 2;
                }
                if (var2 < this.field148) {
                    return false;
                }
                this.field530.field1072 = 0;
                this.field469.method423(this.field530.field1071, 0, this.field148);
                this.field150 = 0;
                this.field222 = this.field221;
                this.field221 = this.field220;
                this.field220 = this.field149;
                if (this.field149 == 139) {
                    int var3 = this.field530.method341();
                    if (var3 == 65535) {
                        var3 = -1;
                    }
                    if (this.field146 != var3 && this.field179 && !field183 && this.field87 == 0) {
                        this.field518 = var3;
                        this.field519 = true;
                        this.field440.method306(2, this.field518);
                    }
                    this.field146 = var3;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 93) {
                    int var4 = this.field530.method371(true);
                    int var5 = this.field530.method368(this.field535);
                    if (this.field179 && !field183) {
                        this.field518 = var5;
                        this.field519 = false;
                        this.field440.method306(2, this.field518);
                        this.field87 = var4;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 23) {
                    this.field232 = this.field530.method359(this.field479);
                    this.field231 = this.field530.method358(0);
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 229) {
                    this.field543 = true;
                    int var6 = this.field530.method341();
                    class60 var7 = class60.method538(var6);
                    while (this.field530.field1072 < this.field148) {
                        int var8 = this.field530.method353();
                        int var9 = this.field530.method341();
                        int var10 = this.field530.method339();
                        if (var10 == 255) {
                            var10 = this.field530.method344();
                        }
                        if (var8 >= 0 && var8 < var7.field1415.length) {
                            var7.field1415[var8] = var9;
                            var7.field1439[var8] = var10;
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 185) {
                    if (this.field158 != -1) {
                        this.method32(false, this.field158);
                        this.field158 = -1;
                        this.field543 = true;
                        this.field206 = true;
                    }
                    if (this.field333 != -1) {
                        this.method32(false, this.field333);
                        this.field333 = -1;
                        this.field570 = true;
                    }
                    if (this.field246 != -1) {
                        this.method32(false, this.field246);
                        this.field246 = -1;
                        this.field109 = true;
                    }
                    if (this.field387 != -1) {
                        this.method32(false, this.field387);
                        this.field387 = -1;
                    }
                    if (this.field351 != -1) {
                        this.method32(false, this.field351);
                        this.field351 = -1;
                    }
                    if (this.field244 != 0) {
                        this.field244 = 0;
                        this.field570 = true;
                    }
                    this.field380 = false;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 125) {
                    this.field125 = this.field530.method339();
                    if (this.field125 == 1) {
                        this.field327 = this.field530.method341();
                    }
                    if (this.field125 >= 2 && this.field125 <= 6) {
                        if (this.field125 == 2) {
                            this.field300 = 64;
                            this.field301 = 64;
                        }
                        if (this.field125 == 3) {
                            this.field300 = 0;
                            this.field301 = 64;
                        }
                        if (this.field125 == 4) {
                            this.field300 = 128;
                            this.field301 = 64;
                        }
                        if (this.field125 == 5) {
                            this.field300 = 64;
                            this.field301 = 0;
                        }
                        if (this.field125 == 6) {
                            this.field300 = 64;
                            this.field301 = 128;
                        }
                        this.field125 = 2;
                        this.field297 = this.field530.method341();
                        this.field298 = this.field530.method341();
                        this.field299 = this.field530.method339();
                    }
                    if (this.field125 == 10) {
                        this.field343 = this.field530.method341();
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 241) {
                    this.field451 = this.field530.method339();
                    this.field167 = this.field530.method339();
                    this.field294 = this.field530.method339();
                    this.field571 = true;
                    this.field570 = true;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 194) {
                    int var11 = this.field530.method368(this.field535);
                    int var12 = this.field530.method368(this.field535);
                    int var13 = this.field530.method367(-40);
                    int var14 = this.field530.method368(this.field535);
                    class60.method538(var12).field1435 = var14;
                    class60.method538(var12).field1436 = var11;
                    class60.method538(var12).field1434 = var13;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 158) {
                    this.field456 = this.field530.method339();
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 223) {
                    this.field429 = this.field530.method339();
                    if (this.field429 == this.field119) {
                        if (this.field429 == 3) {
                            this.field119 = 1;
                        } else {
                            this.field119 = 3;
                        }
                        this.field543 = true;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 103) {
                    this.field529 = this.field530.method368(this.field535);
                    this.field511 = this.field530.method359(this.field479);
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 28) {
                    String var15 = this.field530.method346();
                    if (var15.endsWith(":tradereq:")) {
                        String var16 = var15.substring(0, var15.indexOf(":"));
                        long var17 = class52.method428(var16);
                        boolean var19 = false;
                        for (int var20 = 0; var20 < this.field499; ++var20) {
                            if (this.field256[var20] == var17) {
                                var19 = true;
                                break;
                            }
                        }
                        if (!var19 && this.field545 == 0) {
                            this.method67(var16, false, 4, "wishes to trade with you.");
                        }
                    } else if (var15.endsWith(":duelreq:")) {
                        String var21 = var15.substring(0, var15.indexOf(":"));
                        long var22 = class52.method428(var21);
                        boolean var24 = false;
                        for (int var25 = 0; var25 < this.field499; ++var25) {
                            if (this.field256[var25] == var22) {
                                var24 = true;
                                break;
                            }
                        }
                        if (!var24 && this.field545 == 0) {
                            this.method67(var21, false, 8, "wishes to duel with you.");
                        }
                    } else if (!var15.endsWith(":chalreq:")) {
                        this.method67("", false, 0, var15);
                    } else {
                        String var26 = var15.substring(0, var15.indexOf(":"));
                        long var27 = class52.method428(var26);
                        boolean var29 = false;
                        for (int var30 = 0; var30 < this.field499; ++var30) {
                            if (this.field256[var30] == var27) {
                                var29 = true;
                                break;
                            }
                        }
                        if (!var29 && this.field545 == 0) {
                            String var31 = var15.substring(var15.indexOf(":") + 1, var15.length() - 9);
                            this.method67(var26, false, 8, var31);
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 190) {
                    int var32 = this.field530.method367(-40);
                    this.method60(var32, false);
                    if (this.field333 != -1) {
                        this.method32(false, this.field333);
                        this.field333 = -1;
                        this.field570 = true;
                    }
                    if (this.field246 != -1) {
                        this.method32(false, this.field246);
                        this.field246 = -1;
                        this.field109 = true;
                    }
                    if (this.field387 != -1) {
                        this.method32(false, this.field387);
                        this.field387 = -1;
                    }
                    if (this.field351 != -1) {
                        this.method32(false, this.field351);
                        this.field351 = -1;
                    }
                    if (this.field158 != var32) {
                        this.method32(false, this.field158);
                        this.field158 = var32;
                    }
                    if (this.field244 != 0) {
                        this.field244 = 0;
                        this.field570 = true;
                    }
                    this.field543 = true;
                    this.field206 = true;
                    this.field380 = false;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 236) {
                    this.field513 = true;
                    this.field505 = this.field530.method339();
                    this.field506 = this.field530.method339();
                    this.field507 = this.field530.method341();
                    this.field508 = this.field530.method339();
                    this.field509 = this.field530.method339();
                    if (this.field509 >= 100) {
                        this.field137 = this.field505 * 128 + 64;
                        this.field139 = this.field506 * 128 + 64;
                        this.field138 = this.method69(this.field137, this.field556, this.field139, (byte) 117) - this.field507;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 127) {
                    this.field119 = this.field530.method357((byte) 99);
                    this.field543 = true;
                    this.field206 = true;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 72) {
                    this.field232 = this.field530.method359(this.field479);
                    this.field231 = this.field530.method359(this.field479);
                    while (this.field530.field1072 < this.field148) {
                        int var33 = this.field530.method339();
                        this.method35(0, this.field530, var33);
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 249) {
                    if (this.field119 == 12) {
                        this.field543 = true;
                    }
                    this.field114 = this.field530.method339();
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 21) {
                    this.field499 = this.field148 / 8;
                    for (int var34 = 0; var34 < this.field499; ++var34) {
                        this.field256[var34] = this.field530.method345(false);
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 7) {
                    this.field530.method367(-40);
                    this.field530.method339();
                    this.field305 = this.field530.method366((byte) 1);
                    this.field463 = this.field530.method367(-40);
                    this.field260 = this.field530.method368(this.field535);
                    this.field286 = this.field530.method367(-40);
                    this.field253 = this.field530.method368(this.field535);
                    this.field363 = this.field530.method368(this.field535);
                    this.field541 = this.field530.method366((byte) 1);
                    this.field369 = this.field530.method368(this.field535);
                    this.field485 = this.field530.method373((byte) 6);
                    signlink.dnslookup(class52.method431(this.field485, (byte) 73));
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 57) {
                    int var35 = this.field530.method342();
                    if (this.field501 != var35) {
                        this.method32(false, this.field501);
                        this.field501 = var35;
                    }
                    this.field570 = true;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 118) {
                    int var36 = this.field530.method370(43327);
                    int var37 = this.field530.method369((byte) 115);
                    int var38 = this.field530.method341();
                    class60 var39 = class60.method538(var38);
                    var39.field1478 = var36;
                    var39.field1433 = var37;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 73) {
                    long var40 = this.field530.method345(false);
                    int var42 = this.field530.method344();
                    int var43 = this.field530.method339();
                    boolean var44 = false;
                    for (int var45 = 0; var45 < 100; ++var45) {
                        if (this.field124[var45] == var42) {
                            var44 = true;
                            break;
                        }
                    }
                    if (var43 <= 1) {
                        for (int var46 = 0; var46 < this.field499; ++var46) {
                            if (this.field256[var46] == var40) {
                                var44 = true;
                                break;
                            }
                        }
                    }
                    if (!var44 && this.field545 == 0) {
                        try {
                            this.field124[this.field475] = var42;
                            this.field475 = (this.field475 + 1) % 100;
                            String var47 = class70.method580(this.field148 - 13, false, this.field530);
                            if (var43 != 3) {
                                var47 = class33.method277((byte) 21, var47);
                            }
                            if (var43 != 2 && var43 != 3) {
                                if (var43 == 1) {
                                    this.method67("@cr1@" + class52.method432(4, class52.method429((byte) -53, var40)), false, 7, var47);
                                } else {
                                    this.method67(class52.method432(4, class52.method429((byte) -53, var40)), false, 3, var47);
                                }
                            } else {
                                this.method67("@cr2@" + class52.method432(4, class52.method429((byte) -53, var40)), false, 7, var47);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 40) {
                    this.field513 = true;
                    this.field319 = this.field530.method339();
                    this.field320 = this.field530.method339();
                    this.field321 = this.field530.method341();
                    this.field322 = this.field530.method339();
                    this.field323 = this.field530.method339();
                    if (this.field323 >= 100) {
                        int var49 = this.field319 * 128 + 64;
                        int var50 = this.field320 * 128 + 64;
                        int var51 = this.method69(var49, this.field556, var50, (byte) 117) - this.field321;
                        int var52 = var49 - this.field137;
                        int var53 = var51 - this.field138;
                        int var54 = var50 - this.field139;
                        int var55 = (int) Math.sqrt((double) (var52 * var52 + var54 * var54));
                        this.field140 = (int) (Math.atan2((double) var53, (double) var55) * 325.949D) & 2047;
                        this.field141 = (int) (Math.atan2((double) var52, (double) var54) * -325.949D) & 2047;
                        if (this.field140 < 128) {
                            this.field140 = 128;
                        }
                        if (this.field140 > 383) {
                            this.field140 = 383;
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 49) {
                    int var56 = this.field530.method366((byte) 1);
                    int var57 = this.field530.method341();
                    this.method60(var57, false);
                    if (var56 != -1) {
                        this.method60(var56, false);
                    }
                    if (this.field351 != -1) {
                        this.method32(false, this.field351);
                        this.field351 = -1;
                    }
                    if (this.field158 != -1) {
                        this.method32(false, this.field158);
                        this.field158 = -1;
                    }
                    if (this.field333 != -1) {
                        this.method32(false, this.field333);
                        this.field333 = -1;
                    }
                    if (this.field246 != var57) {
                        this.method32(false, this.field246);
                        this.field246 = var57;
                    }
                    if (this.field387 != var57) {
                        this.method32(false, this.field387);
                        this.field387 = var56;
                    }
                    this.field244 = 0;
                    this.field380 = false;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 121) {
                    long var58 = this.field530.method345(false);
                    int var60 = this.field530.method339();
                    String var61 = class52.method432(4, class52.method429((byte) -53, var58));
                    for (int var62 = 0; var62 < this.field251; ++var62) {
                        if (this.field364[var62] == var58) {
                            if (this.field204[var62] != var60) {
                                this.field204[var62] = var60;
                                this.field543 = true;
                                if (var60 > 0) {
                                    this.method67("", false, 5, var61 + " has logged in.");
                                }
                                if (var60 == 0) {
                                    this.method67("", false, 5, var61 + " has logged out.");
                                }
                            }
                            var61 = null;
                            break;
                        }
                    }
                    if (var61 != null && this.field251 < 200) {
                        this.field364[this.field251] = var58;
                        this.field462[this.field251] = var61;
                        this.field204[this.field251] = var60;
                        ++this.field251;
                        this.field543 = true;
                    }
                    boolean var63 = false;
                    while (!var63) {
                        var63 = true;
                        for (int var64 = 0; var64 < this.field251 - 1; ++var64) {
                            if (this.field204[var64] != field180 && this.field204[var64 + 1] == field180 || this.field204[var64] == 0 && this.field204[var64 + 1] != 0) {
                                int var65 = this.field204[var64];
                                this.field204[var64] = this.field204[var64 + 1];
                                this.field204[var64 + 1] = var65;
                                String var66 = this.field462[var64];
                                this.field462[var64] = this.field462[var64 + 1];
                                this.field462[var64 + 1] = var66;
                                long var67 = this.field364[var64];
                                this.field364[var64] = this.field364[var64 + 1];
                                this.field364[var64 + 1] = var67;
                                this.field543 = true;
                                var63 = false;
                            }
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 123) {
                    this.field513 = false;
                    for (int var69 = 0; var69 < 5; ++var69) {
                        this.field504[var69] = false;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 51) {
                    this.field98 = false;
                    this.field244 = 2;
                    this.field527 = "";
                    this.field570 = true;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 26) {
                    int var70 = this.field530.method342();
                    if (var70 >= 0) {
                        this.method60(var70, false);
                    }
                    if (this.field370 != var70) {
                        this.method32(false, this.field370);
                        this.field370 = var70;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 82) {
                    if (this.field119 == 12) {
                        this.field543 = true;
                    }
                    this.field457 = this.field530.method342();
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 237) {
                    for (int var71 = 0; var71 < this.field443.length; ++var71) {
                        if (this.field443[var71] != null) {
                            this.field443[var71].field1563 = -1;
                        }
                    }
                    for (int var72 = 0; var72 < this.field164.length; ++var72) {
                        if (this.field164[var72] != null) {
                            this.field164[var72].field1563 = -1;
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 181) {
                    this.method113(this.field148, this.field530, 4918);
                    this.field273 = false;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 128) {
                    this.field252 = this.field530.method339();
                    this.field543 = true;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 69) {
                    this.field231 = this.field530.method359(this.field479);
                    this.field232 = this.field530.method359(this.field479);
                    for (int var73 = this.field231; var73 < this.field231 + 8; ++var73) {
                        for (int var74 = this.field232; var74 < this.field232 + 8; ++var74) {
                            if (this.field382[this.field556][var73][var74] != null) {
                                this.field382[this.field556][var73][var74] = null;
                                this.method98(var73, var74);
                            }
                        }
                    }
                    for (class6 var75 = (class6) this.field111.method200(); var75 != null; var75 = (class6) this.field111.method202(8)) {
                        if (var75.field575 >= this.field231 && var75.field575 < this.field231 + 8 && var75.field576 >= this.field232 && var75.field576 < this.field232 + 8 && this.field556 == var75.field573) {
                            var75.field581 = 0;
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 91) {
                    int var76 = this.field530.method368(this.field535);
                    class60 var77 = class60.method538(var76);
                    for (int var78 = 0; var78 < var77.field1415.length; ++var78) {
                        var77.field1415[var78] = -1;
                        var77.field1415[var78] = 0;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 126) {
                    int var79 = this.field530.method341();
                    int var80 = this.field530.method339();
                    int var81 = this.field530.method341();
                    if (var81 == 65535) {
                        if (this.field453 < 50) {
                            this.field197[this.field453] = (short) var79;
                            this.field491[this.field453] = var80;
                            this.field373[this.field453] = 0;
                            ++this.field453;
                        }
                    } else if (this.field145 && !field183 && this.field453 < 50) {
                        this.field197[this.field453] = var79;
                        this.field491[this.field453] = var80;
                        this.field373[this.field453] = class30.field971[var79] + var81;
                        ++this.field453;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 81) {
                    this.field98 = false;
                    this.field244 = 1;
                    this.field527 = "";
                    this.field570 = true;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 120) {
                    this.field543 = true;
                    int var82 = this.field530.method341();
                    class60 var83 = class60.method538(var82);
                    int var84 = this.field530.method341();
                    for (int var85 = 0; var85 < var84; ++var85) {
                        int var86 = this.field530.method358(0);
                        if (var86 == 255) {
                            var86 = this.field530.method375(4);
                        }
                        var83.field1415[var85] = this.field530.method366((byte) 1);
                        var83.field1439[var85] = var86;
                    }
                    for (int var87 = var84; var87 < var83.field1415.length; ++var87) {
                        var83.field1415[var87] = 0;
                        var83.field1439[var87] = 0;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 198) {
                    int var88 = this.field530.method367(-40);
                    int var89 = this.field530.method374(15285);
                    this.field383[var88] = var89;
                    if (this.field489[var88] != var89) {
                        this.field489[var88] = var89;
                        this.method157(var88, 469);
                        this.field543 = true;
                        if (this.field501 != -1) {
                            this.field570 = true;
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 212) {
                    int var90 = this.field530.method341();
                    String var91 = this.field530.method346();
                    class60.method538(var90).field1490 = var91;
                    int var10001 = this.field428[this.field119];
                    if (class60.method538(var90).field1479 == var10001) {
                        this.field543 = true;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 238) {
                    int var92 = this.field530.method339();
                    int var93 = this.field530.method339();
                    int var94 = this.field530.method339();
                    int var95 = this.field530.method339();
                    this.field504[var92] = true;
                    this.field540[var92] = var93;
                    this.field239[var92] = var94;
                    this.field406[var92] = var95;
                    this.field537[var92] = 0;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 131) {
                    this.method115(212, this.field530, this.field148);
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 75) {
                    this.field89 = this.field530.method367(-40) * 30;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 61 || this.field149 == 37) {
                    int var96 = this.field292;
                    int var97 = this.field293;
                    if (this.field149 == 61) {
                        var96 = this.field530.method341();
                        var97 = this.field530.method341();
                        this.field126 = false;
                    }
                    if (this.field149 == 37) {
                        var97 = this.field530.method366((byte) 1);
                        var96 = this.field530.method367(-40);
                        this.field530.method349(-31487);
                        int var98 = 0;
                        while (true) {
                            if (var98 >= 4) {
                                this.field530.method351(this.field203);
                                this.field126 = true;
                                break;
                            }
                            for (int var99 = 0; var99 < 13; ++var99) {
                                for (int var100 = 0; var100 < 13; ++var100) {
                                    int var101 = this.field530.method350(739, 1);
                                    if (var101 == 1) {
                                        this.field223[var98][var99][var100] = this.field530.method350(739, 26);
                                    } else {
                                        this.field223[var98][var99][var100] = -1;
                                    }
                                }
                            }
                            ++var98;
                        }
                    }
                    if (this.field292 == var96 && this.field293 == var97 && this.field430 == 2) {
                        this.field149 = -1;
                        return true;
                    }
                    this.field292 = var96;
                    this.field293 = var97;
                    this.field287 = (this.field292 - 6) * 8;
                    this.field288 = (this.field293 - 6) * 8;
                    this.field263 = false;
                    if ((this.field292 / 8 == 48 || this.field292 / 8 == 49) && this.field293 / 8 == 48) {
                        this.field263 = true;
                    }
                    if (this.field292 / 8 == 48 && this.field293 / 8 == 148) {
                        this.field263 = true;
                    }
                    this.field430 = 1;
                    this.field492 = System.currentTimeMillis();
                    this.method24((String) null, "Loading - please wait.", -252);
                    if (this.field149 == 61) {
                        int var102 = 0;
                        int var103 = (this.field292 - 6) / 8;
                        label1207: while (true) {
                            if (var103 > (this.field292 + 6) / 8) {
                                this.field372 = new byte[var102][];
                                this.field564 = new byte[var102][];
                                this.field335 = new int[var102];
                                this.field336 = new int[var102];
                                this.field337 = new int[var102];
                                int var105 = 0;
                                int var106 = (this.field292 - 6) / 8;
                                while (true) {
                                    if (var106 > (this.field292 + 6) / 8) {
                                        break label1207;
                                    }
                                    for (int var107 = (this.field293 - 6) / 8; var107 <= (this.field293 + 6) / 8; ++var107) {
                                        this.field335[var105] = (var106 << 8) + var107;
                                        if (!this.field263 || var107 != 49 && var107 != 149 && var107 != 147 && var106 != 50 && (var106 != 49 || var107 != 47)) {
                                            int var108 = this.field336[var105] = this.field440.method310(0, var107, var106, 1);
                                            if (var108 != -1) {
                                                this.field440.method306(3, var108);
                                            }
                                            int var109 = this.field337[var105] = this.field440.method310(1, var107, var106, 1);
                                            if (var109 != -1) {
                                                this.field440.method306(3, var109);
                                            }
                                            ++var105;
                                        } else {
                                            this.field336[var105] = -1;
                                            this.field337[var105] = -1;
                                            ++var105;
                                        }
                                    }
                                    ++var106;
                                }
                            }
                            for (int var104 = (this.field293 - 6) / 8; var104 <= (this.field293 + 6) / 8; ++var104) {
                                ++var102;
                            }
                            ++var103;
                        }
                    }
                    if (this.field149 == 37) {
                        int var110 = 0;
                        int[] var111 = new int[676];
                        int var112 = 0;
                        label1166: while (true) {
                            if (var112 >= 4) {
                                this.field372 = new byte[var110][];
                                this.field564 = new byte[var110][];
                                this.field335 = new int[var110];
                                this.field336 = new int[var110];
                                this.field337 = new int[var110];
                                int var120 = 0;
                                while (true) {
                                    if (var120 >= var110) {
                                        break label1166;
                                    }
                                    int var121 = this.field335[var120] = var111[var120];
                                    int var122 = var121 >> 8 & 255;
                                    int var123 = var121 & 255;
                                    int var124 = this.field336[var120] = this.field440.method310(0, var123, var122, 1);
                                    if (var124 != -1) {
                                        this.field440.method306(3, var124);
                                    }
                                    int var125 = this.field337[var120] = this.field440.method310(1, var123, var122, 1);
                                    if (var125 != -1) {
                                        this.field440.method306(3, var125);
                                    }
                                    ++var120;
                                }
                            }
                            for (int var113 = 0; var113 < 13; ++var113) {
                                for (int var114 = 0; var114 < 13; ++var114) {
                                    int var115 = this.field223[var112][var113][var114];
                                    if (var115 != -1) {
                                        int var116 = var115 >> 14 & 1023;
                                        int var117 = var115 >> 3 & 2047;
                                        int var118 = (var116 / 8 << 8) + var117 / 8;
                                        for (int var119 = 0; var119 < var110; ++var119) {
                                            if (var111[var119] == var118) {
                                                var118 = -1;
                                                break;
                                            }
                                        }
                                        if (var118 != -1) {
                                            var111[var110++] = var118;
                                        }
                                    }
                                }
                            }
                            ++var112;
                        }
                    }
                    int var126 = this.field287 - this.field289;
                    int var127 = this.field288 - this.field290;
                    this.field289 = this.field287;
                    this.field290 = this.field288;
                    for (int var128 = 0; var128 < 16384; ++var128) {
                        class8 var129 = this.field164[var128];
                        if (var129 != null) {
                            for (int var130 = 0; var130 < 10; ++var130) {
                                var129.field1569[var130] -= var126;
                                var129.field1570[var130] -= var127;
                            }
                            var129.field1559 -= var126 * 128;
                            var129.field1560 -= var127 * 128;
                        }
                    }
                    for (int var131 = 0; var131 < this.field441; ++var131) {
                        class65 var132 = this.field443[var131];
                        if (var132 != null) {
                            for (int var133 = 0; var133 < 10; ++var133) {
                                var132.field1569[var133] -= var126;
                                var132.field1570[var133] -= var127;
                            }
                            var132.field1559 -= var126 * 128;
                            var132.field1560 -= var127 * 128;
                        }
                    }
                    this.field273 = true;
                    byte var134 = 0;
                    byte var135 = 104;
                    byte var136 = 1;
                    if (var126 < 0) {
                        var134 = 103;
                        var135 = -1;
                        var136 = -1;
                    }
                    byte var137 = 0;
                    byte var138 = 104;
                    byte var139 = 1;
                    if (var127 < 0) {
                        var137 = 103;
                        var138 = -1;
                        var139 = -1;
                    }
                    for (int var140 = var134; var135 != var140; var140 += var136) {
                        for (int var141 = var137; var138 != var141; var141 += var139) {
                            int var142 = var126 + var140;
                            int var143 = var127 + var141;
                            for (int var144 = 0; var144 < 4; ++var144) {
                                if (var142 >= 0 && var143 >= 0 && var142 < 104 && var143 < 104) {
                                    this.field382[var144][var140][var141] = this.field382[var144][var142][var143];
                                } else {
                                    this.field382[var144][var140][var141] = null;
                                }
                            }
                        }
                    }
                    for (class6 var145 = (class6) this.field111.method200(); var145 != null; var145 = (class6) this.field111.method202(8)) {
                        var145.field575 -= var126;
                        var145.field576 -= var127;
                        if (var145.field575 < 0 || var145.field576 < 0 || var145.field575 >= 104 || var145.field576 >= 104) {
                            var145.method326();
                        }
                    }
                    if (this.field422 != 0) {
                        this.field422 -= var126;
                        this.field423 -= var127;
                    }
                    this.field513 = false;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 76) {
                    int var146 = this.field530.method366((byte) 1);
                    int var147 = this.field530.method366((byte) 1);
                    int var148 = this.field530.method366((byte) 1);
                    if (var148 == 65535) {
                        class60.method538(var146).field1421 = 0;
                        this.field149 = -1;
                        return true;
                    }
                    class58 var149 = class58.method520(var148);
                    class60.method538(var146).field1421 = 4;
                    class60.method538(var146).field1422 = var148;
                    class60.method538(var146).field1435 = var149.field1353;
                    class60.method538(var146).field1436 = var149.field1357;
                    class60.method538(var146).field1434 = var149.field1400 * 100 / var147;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 58) {
                    int var150 = this.field530.method341();
                    int var151 = this.field530.method341();
                    if (this.field333 != -1) {
                        this.method32(false, this.field333);
                        this.field333 = -1;
                        this.field570 = true;
                    }
                    if (this.field246 != -1) {
                        this.method32(false, this.field246);
                        this.field246 = -1;
                        this.field109 = true;
                    }
                    if (this.field387 != -1) {
                        this.method32(false, this.field387);
                        this.field387 = -1;
                    }
                    if (this.field351 != var150) {
                        this.method32(false, this.field351);
                        this.field351 = var150;
                    }
                    if (this.field158 != var151) {
                        this.method32(false, this.field158);
                        this.field158 = var151;
                    }
                    if (this.field244 != 0) {
                        this.field244 = 0;
                        this.field570 = true;
                    }
                    this.field543 = true;
                    this.field206 = true;
                    this.field380 = false;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 4) {
                    int var152 = this.field530.method366((byte) 1);
                    int var153 = this.field530.method367(-40);
                    class60.method538(var152).field1421 = 1;
                    class60.method538(var152).field1422 = var153;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 204) {
                    int var154 = this.field530.method366((byte) 1);
                    int var155 = this.field530.method370(43327);
                    class60 var156 = class60.method538(var154);
                    if (var156.field1441 != var155 || var155 == -1) {
                        var156.field1441 = var155;
                        var156.field1449 = 0;
                        var156.field1416 = 0;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 112 || this.field149 == 41 || this.field149 == 172 || this.field149 == 220 || this.field149 == 87 || this.field149 == 219 || this.field149 == 13 || this.field149 == 226 || this.field149 == 221 || this.field149 == 134 || this.field149 == 105) {
                    this.method35(0, this.field530, this.field149);
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 29) {
                    int var157 = this.field530.method366((byte) 1);
                    class60.method538(var157).field1421 = 3;
                    if (field419.field1598 == null) {
                        class60.method538(var157).field1422 = (field419.field1603[11] << 5) + (field419.field1603[8] << 10) + (field419.field1603[0] << 15) + (field419.field1614[0] << 25) + (field419.field1614[4] << 20) + field419.field1603[1];
                    } else {
                        class60.method538(var157).field1422 = (int) (field419.field1598.field39 + 305419896L);
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 166) {
                    for (int var158 = 0; var158 < this.field489.length; ++var158) {
                        if (this.field489[var158] != this.field383[var158]) {
                            this.field489[var158] = this.field383[var158];
                            this.method157(var158, 469);
                            this.field543 = true;
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 3) {
                    int var159 = this.field530.method359(this.field479);
                    int var160 = this.field530.method341();
                    if (var160 == 65535) {
                        var160 = -1;
                    }
                    if (this.field428[var159] != var160) {
                        this.method32(false, this.field428[var159]);
                        this.field428[var159] = var160;
                    }
                    this.field543 = true;
                    this.field206 = true;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 33) {
                    int var161 = this.field530.method368(this.field535);
                    int var162 = this.field530.method366((byte) 1);
                    int var163 = this.field530.method366((byte) 1);
                    class60.method538(var161).field1483 = (var162 << 16) + var163;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 89) {
                    this.field277 = this.field530.method339();
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 122) {
                    this.field422 = 0;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 255) {
                    int var164 = this.field530.method367(-40);
                    this.method60(var164, false);
                    if (this.field158 != -1) {
                        this.method32(false, this.field158);
                        this.field158 = -1;
                        this.field543 = true;
                        this.field206 = true;
                    }
                    if (this.field333 != -1) {
                        this.method32(false, this.field333);
                        this.field333 = -1;
                        this.field570 = true;
                    }
                    if (this.field246 != -1) {
                        this.method32(false, this.field246);
                        this.field246 = -1;
                        this.field109 = true;
                    }
                    if (this.field387 != -1) {
                        this.method32(false, this.field387);
                        this.field387 = -1;
                    }
                    if (this.field351 != var164) {
                        this.method32(false, this.field351);
                        this.field351 = var164;
                    }
                    if (this.field244 != 0) {
                        this.field244 = 0;
                        this.field570 = true;
                    }
                    this.field380 = false;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 153) {
                    this.method23((byte) 64);
                    this.field149 = -1;
                    return false;
                }
                if (this.field149 == 10) {
                    int var165 = this.field530.method366((byte) 1);
                    this.method60(var165, false);
                    if (this.field158 != -1) {
                        this.method32(false, this.field158);
                        this.field158 = -1;
                        this.field543 = true;
                        this.field206 = true;
                    }
                    if (this.field246 != -1) {
                        this.method32(false, this.field246);
                        this.field246 = -1;
                        this.field109 = true;
                    }
                    if (this.field387 != -1) {
                        this.method32(false, this.field387);
                        this.field387 = -1;
                    }
                    if (this.field351 != -1) {
                        this.method32(false, this.field351);
                        this.field351 = -1;
                    }
                    if (this.field333 != var165) {
                        this.method32(false, this.field333);
                        this.field333 = var165;
                    }
                    this.field380 = false;
                    this.field570 = true;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 32) {
                    int var166 = this.field530.method341();
                    boolean var167 = this.field530.method339() == 1;
                    class60.method538(var166).field1451 = var167;
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 234) {
                    int var168 = this.field530.method366((byte) 1);
                    int var169 = this.field530.method368(this.field535);
                    class60 var170 = class60.method538(var168);
                    if (var170 != null && var170.field1487 == 0) {
                        if (var169 < 0) {
                            var169 = 0;
                        }
                        if (var169 > var170.field1482 - var170.field1481) {
                            var169 = var170.field1482 - var170.field1481;
                        }
                        var170.field1440 = var169;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 213) {
                    int var171 = this.field530.method366((byte) 1);
                    int var172 = this.field530.method341();
                    int var173 = var171 >> 10 & 31;
                    int var174 = var171 >> 5 & 31;
                    int var175 = var171 & 31;
                    class60.method538(var172).field1470 = (var175 << 3) + (var173 << 19) + (var174 << 11);
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 66) {
                    byte var176 = this.field530.method361((byte) -94);
                    int var177 = this.field530.method367(-40);
                    this.field383[var177] = var176;
                    if (this.field489[var177] != var176) {
                        this.field489[var177] = var176;
                        this.method157(var177, 469);
                        this.field543 = true;
                        if (this.field501 != -1) {
                            this.field570 = true;
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 244) {
                    String var178 = this.field530.method346();
                    int var179 = this.field530.method359(this.field479);
                    int var180 = this.field530.method358(0);
                    if (var179 >= 1 && var179 <= 5) {
                        if (var178.equalsIgnoreCase("null")) {
                            var178 = null;
                        }
                        this.field275[var179 - 1] = var178;
                        this.field276[var179 - 1] = var180 == 0;
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 141) {
                    this.field543 = true;
                    int var181 = this.field530.method357((byte) 99);
                    int var182 = this.field530.method373((byte) 6);
                    int var183 = this.field530.method357((byte) 99);
                    this.field318[var181] = var182;
                    this.field421[var181] = var183;
                    this.field329[var181] = 1;
                    for (int var184 = 0; var184 < 98; ++var184) {
                        if (var182 >= field500[var184]) {
                            this.field329[var181] = var184 + 2;
                        }
                    }
                    this.field149 = -1;
                    return true;
                }
                if (this.field149 == 63) {
                    int var185 = this.field530.method341();
                    int var186 = this.field530.method367(-40);
                    class60.method538(var185).field1421 = 2;
                    class60.method538(var185).field1422 = var186;
                    this.field149 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field149 + "," + this.field148 + " - " + this.field221 + "," + this.field222);
                this.method23((byte) 64);
            } catch (IOException var191) {
                this.method19((byte) 110);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field149 + "," + this.field221 + "," + this.field222 + " - " + this.field148 + "," + (field419.field1569[0] + this.field287) + "," + (field419.field1570[0] + this.field288) + " - ";
                for (int var189 = 0; var189 < this.field148 && var189 < 50; ++var189) {
                    var188 = var188 + this.field530.field1071[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method23((byte) 64);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method28(boolean arg0) {
        this.field342 &= arg0;
        if (this.field259 >= 2 || this.field184 != 0 || this.field464 != 0) {
            String var2;
            if (this.field184 == 1 && this.field259 < 2) {
                var2 = "Use " + this.field188 + " with...";
            } else if (this.field464 == 1 && this.field259 < 2) {
                var2 = this.field467 + "...";
            } else {
                var2 = this.field385[this.field259 - 1];
            }
            if (this.field259 > 2) {
                var2 = var2 + "@whi@ / " + (this.field259 - 2) + " more options";
            }
            this.field404.method444(true, 15, 16777215, var2, field567 / 1000, 4, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
    public final void method29(int arg0, boolean arg1, int arg2) {
        signlink.midivol = arg2;
        if (arg0 != 19751) {
            this.field347 = 436;
        }
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method30(int arg0) {
        if (this.field526 != arg0) {
            this.field474 = !this.field474;
        }
        for (class6 var2 = (class6) this.field111.method200(); var2 != null; var2 = (class6) this.field111.method202(8)) {
            if (var2.field581 == -1) {
                var2.field577 = 0;
                this.method139(var2, -404);
            } else {
                var2.method326();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LXVMRCEYW;IIZI)V")
    public final void method31(class65 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (field419 != arg0) {
            if (this.field259 < 400) {
                if (!arg3) {
                    this.method132();
                }
                String var6;
                if (arg0.field1610 == 0) {
                    var6 = arg0.field1612 + method36(arg0.field1613, false, field419.field1613) + " (level-" + arg0.field1613 + ")";
                } else {
                    var6 = arg0.field1612 + " (skill-" + arg0.field1610 + ")";
                }
                if (this.field184 == 1) {
                    this.field385[this.field259] = "Use " + this.field188 + " with @whi@" + var6;
                    this.field561[this.field259] = 600;
                    this.field562[this.field259] = arg1;
                    this.field559[this.field259] = arg4;
                    this.field560[this.field259] = arg2;
                    ++this.field259;
                } else if (this.field464 == 1) {
                    if ((this.field466 & 8) == 8) {
                        this.field385[this.field259] = this.field467 + " @whi@" + var6;
                        this.field561[this.field259] = 347;
                        this.field562[this.field259] = arg1;
                        this.field559[this.field259] = arg4;
                        this.field560[this.field259] = arg2;
                        ++this.field259;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field275[var7] != null) {
                            this.field385[this.field259] = this.field275[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field275[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field1613 > field419.field1613) {
                                    var9 = 2000;
                                }
                                if (field419.field1618 != 0 && arg0.field1618 != 0) {
                                    if (field419.field1618 == arg0.field1618) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field276[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field561[this.field259] = var9 + 665;
                            }
                            if (var7 == 1) {
                                this.field561[this.field259] = var9 + 741;
                            }
                            if (var7 == 2) {
                                this.field561[this.field259] = var9 + 870;
                            }
                            if (var7 == 3) {
                                this.field561[this.field259] = var9 + 711;
                            }
                            if (var7 == 4) {
                                this.field561[this.field259] = var9 + 9;
                            }
                            this.field562[this.field259] = arg1;
                            this.field559[this.field259] = arg4;
                            this.field560[this.field259] = arg2;
                            ++this.field259;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field259; ++var8) {
                    if (this.field561[var8] == 1) {
                        this.field385[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method32(boolean arg0, int arg1) {
        if (arg0) {
            field205 = !field205;
        }
        class60.method540(false, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method33(int arg0, long arg1) {
        if (arg0 < 3 || arg0 > 3) {
            this.method132();
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field251; ++var4) {
                if (this.field364[var4] == arg1) {
                    --this.field251;
                    this.field543 = true;
                    for (int var5 = var4; var5 < this.field251; ++var5) {
                        this.field462[var5] = this.field462[var5 + 1];
                        this.field204[var5] = this.field204[var5 + 1];
                        this.field364[var5] = this.field364[var5 + 1];
                    }
                    this.field366.method328(-818, 112);
                    this.field366.method335(arg1, true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method34(byte arg0) {
        if (this.field267 == null) {
            this.method78(1);
            super.field610 = null;
            this.field393 = null;
            this.field394 = null;
            this.field395 = null;
            this.field396 = null;
            this.field397 = null;
            this.field398 = null;
            this.field399 = null;
            this.field400 = null;
            this.field401 = null;
            this.field267 = new class10(96, 479, this.method73(0), (byte) 0);
            this.field265 = new class10(156, 172, this.method73(0), (byte) 0);
            class61.method545(2);
            this.field437.method530(3, 0, 0);
            this.field264 = new class10(261, 190, this.method73(0), (byte) 0);
            this.field266 = new class10(334, 512, this.method73(0), (byte) 0);
            class61.method545(2);
            this.field142 = new class10(50, 496, this.method73(0), (byte) 0);
            this.field143 = new class10(37, 269, this.method73(0), (byte) 0);
            this.field144 = new class10(45, 249, this.method73(0), (byte) 0);
            if (arg0 == 8) {
                boolean var2 = false;
                this.field109 = true;
                this.field266.method173(true);
                class72.field1747 = this.field533;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILNQUAUMDT;I)V")
    public final void method35(int arg0, class36 arg1, int arg2) {
        this.field148 += arg0;
        if (arg2 == 221) {
            int var4 = arg1.method357((byte) 99);
            int var5 = (var4 >> 4 & 7) + this.field231;
            int var6 = (var4 & 7) + this.field232;
            int var7 = arg1.method368(this.field535);
            int var8 = arg1.method357((byte) 99);
            int var9 = var8 >> 2;
            int var10 = var8 & 3;
            int var11 = this.field159[var9];
            if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                int var12 = this.field439[this.field556][var5][var6];
                int var13 = this.field439[this.field556][var5 + 1][var6];
                int var14 = this.field439[this.field556][var5 + 1][var6 + 1];
                int var15 = this.field439[this.field556][var5][var6 + 1];
                if (var11 == 0) {
                    class46 var16 = this.field196.method480(var6, var5, 0, this.field556);
                    if (var16 != null) {
                        int var17 = var16.field1192 >> 14 & 32767;
                        if (var9 == 2) {
                            var16.field1190 = new class21(var17, var12, 2, var15, var13, var14, var10 + 4, false, -126, var7);
                            var16.field1191 = new class21(var17, var12, 2, var15, var13, var14, var10 + 1 & 3, false, -126, var7);
                        } else {
                            var16.field1190 = new class21(var17, var12, var9, var15, var13, var14, var10, false, -126, var7);
                        }
                    }
                }
                if (var11 == 1) {
                    class19 var18 = this.field196.method481(var6, (byte) 38, var5, this.field556);
                    if (var18 != null) {
                        var18.field735 = new class21(var18.field736 >> 14 & 32767, var12, 4, var15, var13, var14, 0, false, -126, var7);
                    }
                }
                if (var11 == 2) {
                    class51 var19 = this.field196.method482(420, var6, this.field556, var5);
                    if (var9 == 11) {
                        var9 = 10;
                    }
                    if (var19 != null) {
                        var19.field1218 = new class21(var19.field1226 >> 14 & 32767, var12, var9, var15, var13, var14, var10, false, -126, var7);
                    }
                }
                if (var11 == 3) {
                    class11 var20 = this.field196.method483(var5, true, this.field556, var6);
                    if (var20 != null) {
                        var20.field642 = new class21(var20.field643 >> 14 & 32767, var12, 22, var15, var13, var14, var10, false, -126, var7);
                    }
                }
            }
        } else if (arg2 == 220) {
            int var21 = arg1.method368(this.field535);
            int var22 = arg1.method358(0);
            int var23 = (var22 >> 4 & 7) + this.field231;
            int var24 = (var22 & 7) + this.field232;
            int var25 = arg1.method341();
            int var26 = arg1.method368(this.field535);
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && this.field529 != var25) {
                class47 var27 = new class47();
                var27.field1195 = var21;
                var27.field1194 = var26;
                if (this.field382[this.field556][var23][var24] == null) {
                    this.field382[this.field556][var23][var24] = new class16(true);
                }
                this.field382[this.field556][var23][var24].method197(var27);
                this.method98(var23, var24);
            }
        } else if (arg2 == 105) {
            int var28 = arg1.method367(-40);
            int var29 = arg1.method358(0);
            int var30 = var29 >> 2;
            int var31 = var29 & 3;
            int var32 = this.field159[var30];
            int var33 = arg1.method357((byte) 99);
            int var34 = (var33 >> 4 & 7) + this.field231;
            int var35 = (var33 & 7) + this.field232;
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                this.method20(var31, var30, 16885, var28, var35, 0, -1, this.field556, var34, var32);
            }
        } else {
            if (arg2 == 172) {
                int var36 = arg1.method357((byte) 99);
                int var37 = (var36 >> 4 & 7) + this.field231;
                int var38 = (var36 & 7) + this.field232;
                byte var39 = arg1.method361((byte) -94);
                int var40 = arg1.method359(this.field479);
                int var41 = var40 >> 2;
                int var42 = var40 & 3;
                int var43 = this.field159[var41];
                int var44 = arg1.method341();
                byte var45 = arg1.method340();
                byte var46 = arg1.method360(-990);
                int var47 = arg1.method366((byte) 1);
                byte var48 = arg1.method362(true);
                int var49 = arg1.method366((byte) 1);
                int var50 = arg1.method366((byte) 1);
                class65 var51;
                if (this.field529 == var50) {
                    var51 = field419;
                } else {
                    var51 = this.field443[var50];
                }
                if (var51 != null) {
                    class25 var52 = class25.method249(var44);
                    int var53 = this.field439[this.field556][var37][var38];
                    int var54 = this.field439[this.field556][var37 + 1][var38];
                    int var55 = this.field439[this.field556][var37 + 1][var38 + 1];
                    int var56 = this.field439[this.field556][var37][var38 + 1];
                    class22 var57 = var52.method247(var41, var42, var53, var54, var55, var56, -1);
                    if (var57 != null) {
                        this.method20(0, 0, 16885, -1, var38, var47 + 1, var49 + 1, this.field556, var37, var43);
                        var51.field1601 = field567 + var47;
                        var51.field1602 = field567 + var49;
                        var51.field1597 = var57;
                        int var58 = var52.field896;
                        int var59 = var52.field853;
                        if (var42 == 1 || var42 == 3) {
                            var58 = var52.field853;
                            var59 = var52.field896;
                        }
                        var51.field1594 = var37 * 128 + var58 * 64;
                        var51.field1596 = var38 * 128 + var59 * 64;
                        var51.field1595 = this.method69(var51.field1594, this.field556, var51.field1596, (byte) 117);
                        if (var45 > var48) {
                            byte var60 = var45;
                            var45 = var48;
                            var48 = var60;
                        }
                        if (var46 > var39) {
                            byte var61 = var46;
                            var46 = var39;
                            var39 = var61;
                        }
                        var51.field1605 = var37 + var45;
                        var51.field1607 = var37 + var48;
                        var51.field1606 = var38 + var46;
                        var51.field1608 = var38 + var39;
                    }
                }
            }
            if (arg2 == 13) {
                int var62 = arg1.method358(0);
                int var63 = (var62 >> 4 & 7) + this.field231;
                int var64 = (var62 & 7) + this.field232;
                int var65 = arg1.method341();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    class16 var66 = this.field382[this.field556][var63][var64];
                    if (var66 != null) {
                        for (class47 var67 = (class47) var66.method200(); var67 != null; var67 = (class47) var66.method202(8)) {
                            if ((var65 & 32767) == var67.field1195) {
                                var67.method326();
                                break;
                            }
                        }
                        if (var66.method200() == null) {
                            this.field382[this.field556][var63][var64] = null;
                        }
                        this.method98(var63, var64);
                    }
                }
            } else if (arg2 == 134) {
                int var68 = arg1.method357((byte) 99);
                int var69 = (var68 >> 4 & 7) + this.field231;
                int var70 = (var68 & 7) + this.field232;
                int var71 = arg1.method359(this.field479);
                int var72 = var71 >> 2;
                int var73 = var71 & 3;
                int var74 = this.field159[var72];
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    this.method20(var73, var72, 16885, -1, var70, 0, -1, this.field556, var69, var74);
                }
            } else if (arg2 == 219) {
                int var75 = arg1.method339();
                int var76 = (var75 >> 4 & 7) + this.field231;
                int var77 = (var75 & 7) + this.field232;
                int var78 = var76 + arg1.method340();
                int var79 = var77 + arg1.method340();
                int var80 = arg1.method342();
                int var81 = arg1.method341();
                int var82 = arg1.method339() * 4;
                int var83 = arg1.method339() * 4;
                int var84 = arg1.method341();
                int var85 = arg1.method341();
                int var86 = arg1.method339();
                int var87 = arg1.method339();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && var81 != 65535) {
                    int var88 = var76 * 128 + 64;
                    int var89 = var77 * 128 + 64;
                    int var90 = var78 * 128 + 64;
                    int var91 = var79 * 128 + 64;
                    class68 var92 = new class68(var87, var89, this.method69(var88, this.field556, var89, (byte) 117) - var82, var83, var86, var80, var88, (byte) 66, field567 + var85, var81, this.field556, field567 + var84);
                    var92.method574((byte) -53, this.method69(var90, this.field556, var91, (byte) 117) - var83, field567 + var84, var90, var91);
                    this.field245.method197(var92);
                }
            } else {
                if (arg2 == 112) {
                    int var93 = arg1.method339();
                    int var94 = (var93 >> 4 & 7) + this.field231;
                    int var95 = (var93 & 7) + this.field232;
                    int var96 = arg1.method341();
                    int var97 = arg1.method339();
                    int var98 = var97 >> 4 & 15;
                    int var99 = var97 & 7;
                    if (field419.field1569[0] >= var94 - var98 && field419.field1569[0] <= var94 + var98 && field419.field1570[0] >= var95 - var98 && field419.field1570[0] <= var95 + var98 && this.field145 && !field183 && this.field453 < 50) {
                        this.field197[this.field453] = var96;
                        this.field491[this.field453] = var99;
                        this.field373[this.field453] = class30.field971[var96];
                        ++this.field453;
                    }
                }
                if (arg2 != 41) {
                    if (arg2 == 226) {
                        int var108 = arg1.method341();
                        int var109 = arg1.method359(this.field479);
                        int var110 = (var109 >> 4 & 7) + this.field231;
                        int var111 = (var109 & 7) + this.field232;
                        int var112 = arg1.method367(-40);
                        if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                            class47 var113 = new class47();
                            var113.field1195 = var112;
                            var113.field1194 = var108;
                            if (this.field382[this.field556][var110][var111] == null) {
                                this.field382[this.field556][var110][var111] = new class16(true);
                            }
                            this.field382[this.field556][var110][var111].method197(var113);
                            this.method98(var110, var111);
                        }
                    } else if (arg2 == 87) {
                        int var114 = arg1.method339();
                        int var115 = (var114 >> 4 & 7) + this.field231;
                        int var116 = (var114 & 7) + this.field232;
                        int var117 = arg1.method341();
                        int var118 = arg1.method339();
                        int var119 = arg1.method341();
                        if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                            int var120 = var115 * 128 + 64;
                            int var121 = var116 * 128 + 64;
                            class42 var122 = new class42(this.field556, var121, var117, (byte) 8, field567, var119, var120, this.method69(var120, this.field556, var121, (byte) 117) - var118);
                            this.field548.method197(var122);
                        }
                    }
                } else {
                    int var100 = arg1.method339();
                    int var101 = (var100 >> 4 & 7) + this.field231;
                    int var102 = (var100 & 7) + this.field232;
                    int var103 = arg1.method341();
                    int var104 = arg1.method341();
                    int var105 = arg1.method341();
                    if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                        class16 var106 = this.field382[this.field556][var101][var102];
                        if (var106 != null) {
                            for (class47 var107 = (class47) var106.method200(); var107 != null; var107 = (class47) var106.method202(8)) {
                                if ((var103 & 32767) == var107.field1195 && var107.field1194 == var104) {
                                    var107.field1194 = var105;
                                    break;
                                }
                            }
                            this.method98(var101, var102);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method36(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field155 = !field155;
        }
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

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method37(int arg0) {
        class56.field1274 = true;
        class72.field1736 = true;
        field183 = true;
        if (arg0 != 2) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class37.field1112 = true;
        class25.field889 = true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method38(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field388 = "";
                this.field389 = "Connecting to server...";
                this.method40(2, true);
            }
            this.field469 = new class45(this.method22(field181 + 43594), (byte) 5, this);
            long var4 = class52.method428(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field366.field1072 = 0;
            this.field366.method329(14);
            this.field366.method329(var6);
            this.field469.method424(5, 0, this.field366.field1071, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field469.method421();
            }
            int var8 = this.field469.method421();
            int var9 = var8;
            if (var8 == 0) {
                this.field469.method423(this.field530.field1071, 0, 8);
                this.field530.field1072 = 0;
                this.field291 = this.field530.method345(false);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field291 >> 32), (int) this.field291 };
                this.field366.field1072 = 0;
                this.field366.method329(10);
                this.field366.method333(var10[0]);
                this.field366.method333(var10[1]);
                this.field366.method333(var10[2]);
                this.field366.method333(var10[3]);
                this.field366.method333(signlink.uid);
                this.field366.method336(arg0);
                this.field366.method336(arg1);
                this.field366.method354(field468, -656, field302);
                this.field113.field1072 = 0;
                if (arg2) {
                    this.field113.method329(18);
                } else {
                    this.field113.method329(16);
                }
                this.field113.method329(this.field366.field1072 + 36 + 1 + 1 + 2);
                this.field113.method329(255);
                this.field113.method330(358);
                this.field113.method329(field183 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field113.method333(this.field120[var11]);
                }
                this.field113.method337(this.field366.field1071, this.field366.field1072, 0, -10495);
                this.field366.field1076 = new class24(var10, field205);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field486 = new class24(var10, field205);
                this.field469.method424(5, 0, this.field113.field1071, this.field113.field1072);
                var8 = this.field469.method421();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method38(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field235 = this.field469.method421();
                field116 = this.field469.method421() == 1;
                this.field284 = 0L;
                this.field106 = 0;
                this.field262.field1201 = 0;
                super.field614 = true;
                this.field237 = true;
                this.field342 = true;
                this.field366.field1072 = 0;
                this.field530.field1072 = 0;
                this.field149 = -1;
                this.field220 = -1;
                this.field221 = -1;
                this.field222 = -1;
                this.field148 = 0;
                this.field150 = 0;
                this.field89 = 0;
                this.field152 = 0;
                this.field125 = 0;
                this.field259 = 0;
                this.field328 = false;
                super.field615 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field86[var13] = null;
                }
                this.field184 = 0;
                this.field464 = 0;
                this.field430 = 0;
                this.field453 = 0;
                this.field224 = (int) (Math.random() * 100.0D) - 50;
                this.field254 = (int) (Math.random() * 110.0D) - 55;
                this.field324 = (int) (Math.random() * 80.0D) - 40;
                this.field211 = (int) (Math.random() * 120.0D) - 60;
                this.field82 = (int) (Math.random() * 30.0D) - 20;
                this.field308 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field277 = 0;
                this.field168 = -1;
                this.field422 = 0;
                this.field423 = 0;
                this.field444 = 0;
                this.field165 = 0;
                for (int var14 = 0; var14 < this.field441; ++var14) {
                    this.field443[var14] = null;
                    this.field448[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field164[var15] = null;
                }
                field419 = this.field443[this.field442] = new class65();
                this.field245.method204();
                this.field548.method204();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field382[var16][var17][var18] = null;
                        }
                    }
                }
                this.field111 = new class16(true);
                this.field252 = 0;
                this.field251 = 0;
                this.method32(false, this.field501);
                this.field501 = -1;
                this.method32(false, this.field333);
                this.field333 = -1;
                this.method32(false, this.field351);
                this.field351 = -1;
                this.method32(false, this.field246);
                this.field246 = -1;
                this.method32(false, this.field387);
                this.field387 = -1;
                this.method32(false, this.field158);
                this.field158 = -1;
                this.method32(false, this.field370);
                this.field370 = -1;
                this.field380 = false;
                this.field119 = 3;
                this.field244 = 0;
                this.field328 = false;
                this.field98 = false;
                this.field248 = null;
                this.field456 = 0;
                this.field429 = -1;
                this.field115 = true;
                this.method92((byte) 0);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field374[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field275[var20] = null;
                    this.field276[var20] = false;
                }
                field198 = 0;
                field549 = 0;
                field279 = 0;
                field484 = 0;
                field481 = 0;
                field226 = 0;
                field285 = 0;
                field306 = 0;
                field435 = 0;
                field281 = 0;
                this.method34((byte) 8);
            } else if (var8 == 3) {
                this.field388 = "";
                this.field389 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field388 = "Your account has been disabled.";
                this.field389 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field388 = "Your account is already logged in.";
                this.field389 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field388 = "RuneScape has been updated!";
                this.field389 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field388 = "This world is full.";
                this.field389 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field388 = "Unable to connect.";
                this.field389 = "Login server offline.";
            } else if (var8 == 9) {
                this.field388 = "Login limit exceeded.";
                this.field389 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field388 = "Unable to connect.";
                this.field389 = "Bad session id.";
            } else if (var8 == 11) {
                this.field388 = "Login server rejected session.";
                this.field389 = "Please try again.";
            } else if (var8 == 12) {
                this.field388 = "You need a members account to login to this world.";
                this.field389 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field388 = "Could not complete login.";
                this.field389 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field388 = "The server is being updated.";
                this.field389 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field342 = true;
                this.field366.field1072 = 0;
                this.field530.field1072 = 0;
                this.field149 = -1;
                this.field220 = -1;
                this.field221 = -1;
                this.field222 = -1;
                this.field148 = 0;
                this.field150 = 0;
                this.field89 = 0;
                this.field259 = 0;
                this.field328 = false;
                this.field492 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field388 = "Login attempts exceeded.";
                this.field389 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field388 = "You are standing in a members-only area.";
                this.field389 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field388 = "Invalid loginserver requested";
                this.field389 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field388 = "Malformed login packet.";
                    this.field389 = "Please try again.";
                } else if (var8 == 23) {
                    this.field388 = "This IP address has been blocked for 24";
                    this.field389 = "hours, as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field268 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field268;
                            this.method38(arg0, arg1, arg2);
                        } else {
                            this.field388 = "No response from loginserver";
                            this.field389 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field388 = "No response from server";
                        this.field389 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field388 = "Unexpected server response";
                    this.field389 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field469.method421();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field388 = "You have only just left another world";
                    this.field389 = "Your profile will be transferred in: " + var26;
                    this.method40(2, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method38(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field388 = "";
            this.field389 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method39(int arg0) {
        if (this.field393 == null) {
            super.field610 = null;
            this.field267 = null;
            this.field265 = null;
            this.field264 = null;
            this.field266 = null;
            this.field142 = null;
            this.field143 = null;
            this.field144 = null;
            this.field396 = new class10(265, 128, this.method73(0), (byte) 0);
            class61.method545(2);
            this.field397 = new class10(265, 128, this.method73(0), (byte) 0);
            class61.method545(2);
            this.field393 = new class10(171, 509, this.method73(0), (byte) 0);
            if (arg0 != 1) {
                this.field454 = this.field486.method241();
            }
            class61.method545(2);
            this.field394 = new class10(132, 360, this.method73(0), (byte) 0);
            class61.method545(2);
            this.field395 = new class10(200, 360, this.method73(0), (byte) 0);
            class61.method545(2);
            this.field398 = new class10(238, 202, this.method73(0), (byte) 0);
            class61.method545(2);
            this.field399 = new class10(238, 203, this.method73(0), (byte) 0);
            class61.method545(2);
            this.field400 = new class10(94, 74, this.method73(0), (byte) 0);
            class61.method545(2);
            this.field401 = new class10(94, 75, this.method73(0), (byte) 0);
            class61.method545(2);
            if (this.field282 != null) {
                this.method97(false);
                this.method51(false);
            }
            this.field109 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        this.method39(1);
        this.field395.method173(true);
        if (arg0 < 2 || arg0 > 2) {
            this.field366.method329(167);
        }
        this.field330.method530(3, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field157 == 0) {
            int var5 = var4 / 2 + 80;
            this.field402.method436(var5, 7711145, this.field345, this.field440.field1004, true, var3 / 2);
            int var6 = var4 / 2 - 20;
            this.field404.method436(var6, 16776960, this.field345, "Welcome to RuneScape", true, var3 / 2);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field331.method530(3, var8 - 20, var7 - 73);
            this.field404.method436(var8 + 5, 16777215, this.field345, "New User", true, var7);
            int var9 = var3 / 2 + 80;
            this.field331.method530(3, var8 - 20, var9 - 73);
            this.field404.method436(var8 + 5, 16777215, this.field345, "Existing User", true, var9);
        }
        if (this.field157 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field388.length() > 0) {
                this.field404.method436(var10 - 15, 16776960, this.field345, this.field388, true, var3 / 2);
                this.field404.method436(var10, 16776960, this.field345, this.field389, true, var3 / 2);
                var10 += 30;
            } else {
                this.field404.method436(var10 - 7, 16776960, this.field345, this.field389, true, var3 / 2);
                var10 += 30;
            }
            this.field404.method443(16777215, true, (byte) -11, var10, var3 / 2 - 90, "Username: " + this.field476 + (this.field520 == 0 & field567 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            this.field404.method443(16777215, true, (byte) -11, var10, var3 / 2 - 88, "Password: " + class52.method433(0, this.field477) + (this.field520 == 1 & field567 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field331.method530(3, var12 - 20, var11 - 73);
                this.field404.method436(var12 + 5, 16777215, this.field345, "Login", true, var11);
                int var13 = var3 / 2 + 80;
                this.field331.method530(3, var12 - 20, var13 - 73);
                this.field404.method436(var12 + 5, 16777215, this.field345, "Cancel", true, var13);
            }
        }
        if (this.field157 == 3) {
            this.field404.method436(var4 / 2 - 60, 16776960, this.field345, "Create a free account", true, var3 / 2);
            int var14 = var4 / 2 - 35;
            this.field404.method436(var14, 16777215, this.field345, "To create a new account you need to", true, var3 / 2);
            int var18 = var14 + 15;
            this.field404.method436(var18, 16777215, this.field345, "go back to the main RuneScape webpage", true, var3 / 2);
            int var19 = var18 + 15;
            this.field404.method436(var19, 16777215, this.field345, "and choose the 'create account'", true, var3 / 2);
            int var20 = var19 + 15;
            this.field404.method436(var20, 16777215, this.field345, "button near the top of that page.", true, var3 / 2);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field331.method530(3, var16 - 20, var15 - 73);
            this.field404.method436(var16 + 5, 16777215, this.field345, "Cancel", true, var15);
        }
        this.field395.method174(super.field609, true, 171, 202);
        if (this.field109) {
            this.field109 = false;
            this.field393.method174(super.field609, true, 0, 128);
            this.field394.method174(super.field609, true, 371, 202);
            this.field398.method174(super.field609, true, 265, 0);
            this.field399.method174(super.field609, true, 265, 562);
            this.field400.method174(super.field609, true, 171, 128);
            this.field401.method174(super.field609, true, 171, 562);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method41(int arg0, int arg1) {
        if (arg0 != 3255) {
            this.field149 = this.field530.method339();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Z")
    public final boolean method42(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field561[arg1];
            if (arg0 < 4 || arg0 > 4) {
                this.method132();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 159;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method43(boolean arg0) {
        this.field342 &= arg0;
        for (int var2 = 0; var2 < this.field165; ++var2) {
            int var3 = this.field166[var2];
            class8 var4 = this.field164[var3];
            if (var4 != null) {
                this.method44(var4.field594.field11, this.field568, var4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILXEGGEBDS;)V")
    public final void method44(int arg0, int arg1, class64 arg2) {
        while (arg1 >= 0) {
            this.field149 = -1;
        }
        if (arg2.field1559 < 128 || arg2.field1560 < 128 || arg2.field1559 >= 13184 || arg2.field1560 >= 13184) {
            arg2.field1563 = -1;
            arg2.field1545 = -1;
            arg2.field1587 = 0;
            arg2.field1588 = 0;
            arg2.field1559 = arg2.field1569[0] * 128 + arg2.field1544 * 64;
            arg2.field1560 = arg2.field1570[0] * 128 + arg2.field1544 * 64;
            arg2.method557((byte) 86);
        }
        if (field419 == arg2 && (arg2.field1559 < 1536 || arg2.field1560 < 1536 || arg2.field1559 >= 11776 || arg2.field1560 >= 11776)) {
            arg2.field1563 = -1;
            arg2.field1545 = -1;
            arg2.field1587 = 0;
            arg2.field1588 = 0;
            arg2.field1559 = arg2.field1569[0] * 128 + arg2.field1544 * 64;
            arg2.field1560 = arg2.field1570[0] * 128 + arg2.field1544 * 64;
            arg2.method557((byte) 86);
        }
        if (arg2.field1587 > field567) {
            this.method45(arg2, true);
        } else if (arg2.field1588 >= field567) {
            this.method46(98, arg2);
        } else {
            this.method47(arg2, 0);
        }
        this.method48(arg2, 346);
        this.method49((byte) 3, arg2);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LXEGGEBDS;Z)V")
    public final void method45(class64 arg0, boolean arg1) {
        int var3 = arg0.field1587 - field567;
        int var4 = arg0.field1583 * 128 + arg0.field1544 * 64;
        int var5 = arg0.field1585 * 128 + arg0.field1544 * 64;
        arg0.field1559 += (var4 - arg0.field1559) / var3;
        arg0.field1560 += (var5 - arg0.field1560) / var3;
        this.field342 &= arg1;
        arg0.field1576 = 0;
        if (arg0.field1589 == 0) {
            arg0.field1557 = 1024;
        }
        if (arg0.field1589 == 1) {
            arg0.field1557 = 1536;
        }
        if (arg0.field1589 == 2) {
            arg0.field1557 = 0;
        }
        if (arg0.field1589 == 3) {
            arg0.field1557 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILXEGGEBDS;)V")
    public final void method46(int arg0, class64 arg1) {
        if (field567 == arg1.field1588 || arg1.field1563 == -1 || arg1.field1566 != 0 || arg1.field1565 + 1 > class27.field923[arg1.field1563].method256(arg1.field1564, 642)) {
            int var3 = arg1.field1588 - arg1.field1587;
            int var4 = field567 - arg1.field1587;
            int var5 = arg1.field1583 * 128 + arg1.field1544 * 64;
            int var6 = arg1.field1585 * 128 + arg1.field1544 * 64;
            int var7 = arg1.field1584 * 128 + arg1.field1544 * 64;
            int var8 = arg1.field1586 * 128 + arg1.field1544 * 64;
            arg1.field1559 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1560 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1576 = 0;
        if (arg1.field1589 == 0) {
            arg1.field1557 = 1024;
        }
        if (arg1.field1589 == 1) {
            arg1.field1557 = 1536;
        }
        if (arg1.field1589 == 2) {
            arg1.field1557 = 0;
        }
        if (arg1.field1589 == 3) {
            arg1.field1557 = 512;
        }
        arg1.field1561 = arg1.field1557;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LXEGGEBDS;I)V")
    public final void method47(class64 arg0, int arg1) {
        this.field148 += arg1;
        arg0.field1540 = arg0.field1579;
        if (arg0.field1535 == 0) {
            arg0.field1576 = 0;
        } else {
            if (arg0.field1563 != -1 && arg0.field1566 == 0) {
                class27 var3 = class27.field923[arg0.field1563];
                if (arg0.field1571 > 0 && var3.field935 == 0) {
                    ++arg0.field1576;
                    return;
                }
                if (arg0.field1571 <= 0 && var3.field936 == 0) {
                    ++arg0.field1576;
                    return;
                }
            }
            int var4 = arg0.field1559;
            int var5 = arg0.field1560;
            int var6 = arg0.field1569[arg0.field1535 - 1] * 128 + arg0.field1544 * 64;
            int var7 = arg0.field1570[arg0.field1535 - 1] * 128 + arg0.field1544 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1557 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1557 = 1792;
                    } else {
                        arg0.field1557 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1557 = 768;
                    } else if (var5 > var7) {
                        arg0.field1557 = 256;
                    } else {
                        arg0.field1557 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1557 = 1024;
                } else {
                    arg0.field1557 = 0;
                }
                int var8 = arg0.field1557 - arg0.field1561 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1551;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1550;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1553;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1552;
                }
                if (var9 == -1) {
                    var9 = arg0.field1550;
                }
                arg0.field1540 = var9;
                int var10 = 4;
                if (arg0.field1561 != arg0.field1557 && arg0.field1577 == -1 && arg0.field1543 != 0) {
                    var10 = 2;
                }
                if (arg0.field1535 > 2) {
                    var10 = 6;
                }
                if (arg0.field1535 > 3) {
                    var10 = 8;
                }
                if (arg0.field1576 > 0 && arg0.field1535 > 1) {
                    var10 = 8;
                    --arg0.field1576;
                }
                if (arg0.field1558[arg0.field1535 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1550 == arg0.field1540 && arg0.field1572 != -1) {
                    arg0.field1540 = arg0.field1572;
                }
                if (var4 < var6) {
                    arg0.field1559 += var10;
                    if (arg0.field1559 > var6) {
                        arg0.field1559 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1559 -= var10;
                    if (arg0.field1559 < var6) {
                        arg0.field1559 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1560 += var10;
                    if (arg0.field1560 > var7) {
                        arg0.field1560 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1560 -= var10;
                    if (arg0.field1560 < var7) {
                        arg0.field1560 = var7;
                    }
                }
                if (arg0.field1559 == var6 && arg0.field1560 == var7) {
                    --arg0.field1535;
                    if (arg0.field1571 > 0) {
                        --arg0.field1571;
                        return;
                    }
                }
            } else {
                arg0.field1559 = var6;
                arg0.field1560 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LXEGGEBDS;I)V")
    public final void method48(class64 arg0, int arg1) {
        int var3 = 60 / arg1;
        if (arg0.field1543 != 0) {
            if (arg0.field1577 != -1 && arg0.field1577 < 32768) {
                class8 var4 = this.field164[arg0.field1577];
                if (var4 != null) {
                    int var5 = arg0.field1559 - var4.field1559;
                    int var6 = arg0.field1560 - var4.field1560;
                    if (var5 != 0 || var6 != 0) {
                        arg0.field1557 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1577 >= 32768) {
                int var7 = arg0.field1577 - 32768;
                if (this.field529 == var7) {
                    var7 = this.field442;
                }
                class65 var8 = this.field443[var7];
                if (var8 != null) {
                    int var9 = arg0.field1559 - var8.field1559;
                    int var10 = arg0.field1560 - var8.field1560;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field1557 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1533 != 0 || arg0.field1534 != 0) && (arg0.field1535 == 0 || arg0.field1576 > 0)) {
                int var11 = arg0.field1559 - (arg0.field1533 - this.field287 - this.field287) * 64;
                int var12 = arg0.field1560 - (arg0.field1534 - this.field288 - this.field288) * 64;
                if (var11 != 0 || var12 != 0) {
                    arg0.field1557 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
                }
                arg0.field1533 = 0;
                arg0.field1534 = 0;
            }
            int var13 = arg0.field1557 - arg0.field1561 & 2047;
            if (var13 != 0) {
                if (var13 >= arg0.field1543 && var13 <= 2048 - arg0.field1543) {
                    if (var13 > 1024) {
                        arg0.field1561 -= arg0.field1543;
                    } else {
                        arg0.field1561 += arg0.field1543;
                    }
                } else {
                    arg0.field1561 = arg0.field1557;
                }
                arg0.field1561 &= 2047;
                if (arg0.field1579 == arg0.field1540 && arg0.field1561 != arg0.field1557) {
                    if (arg0.field1580 != -1) {
                        arg0.field1540 = arg0.field1580;
                        return;
                    }
                    arg0.field1540 = arg0.field1550;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLXEGGEBDS;)V")
    public final void method49(byte arg0, class64 arg1) {
        if (this.field88 == arg0) {
            boolean var3 = false;
        } else {
            this.method132();
        }
        arg1.field1590 = false;
        if (arg1.field1540 != -1) {
            class27 var4 = class27.field923[arg1.field1540];
            ++arg1.field1542;
            if (arg1.field1541 < var4.field924 && arg1.field1542 > var4.method256(arg1.field1541, 642)) {
                arg1.field1542 = 0;
                ++arg1.field1541;
            }
            if (arg1.field1541 >= var4.field924) {
                arg1.field1542 = 0;
                arg1.field1541 = 0;
            }
        }
        if (arg1.field1545 != -1 && field567 >= arg1.field1548) {
            if (arg1.field1546 < 0) {
                arg1.field1546 = 0;
            }
            class27 var5 = class41.field1131[arg1.field1545].field1135;
            ++arg1.field1547;
            while (arg1.field1546 < var5.field924 && arg1.field1547 > var5.method256(arg1.field1546, 642)) {
                arg1.field1547 -= var5.method256(arg1.field1546, 642);
                ++arg1.field1546;
            }
            if (arg1.field1546 >= var5.field924 && (arg1.field1546 < 0 || arg1.field1546 >= var5.field924)) {
                arg1.field1545 = -1;
            }
        }
        if (arg1.field1563 != -1 && arg1.field1566 <= 1) {
            class27 var6 = class27.field923[arg1.field1563];
            if (var6.field935 == 1 && arg1.field1571 > 0 && arg1.field1587 <= field567 && arg1.field1588 < field567) {
                arg1.field1566 = 1;
                return;
            }
        }
        if (arg1.field1563 != -1 && arg1.field1566 == 0) {
            class27 var7 = class27.field923[arg1.field1563];
            ++arg1.field1565;
            while (arg1.field1564 < var7.field924 && arg1.field1565 > var7.method256(arg1.field1564, 642)) {
                arg1.field1565 -= var7.method256(arg1.field1564, 642);
                ++arg1.field1564;
            }
            if (arg1.field1564 >= var7.field924) {
                arg1.field1564 -= var7.field928;
                ++arg1.field1567;
                if (arg1.field1567 >= var7.field934) {
                    arg1.field1563 = -1;
                }
                if (arg1.field1564 < 0 || arg1.field1564 >= var7.field924) {
                    arg1.field1563 = -1;
                }
            }
            arg1.field1590 = var7.field930;
        }
        if (arg1.field1566 > 0) {
            --arg1.field1566;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method50(byte arg0) {
        if (this.field246 != -1 && (this.field430 == 2 || super.field610 != null)) {
            if (this.field430 == 2) {
                this.method88(this.field246, this.field118, -95);
                if (this.field387 != -1) {
                    this.method88(this.field387, this.field118, -95);
                }
                this.field118 = 0;
                this.method80(-64);
                super.field610.method173(true);
                class72.field1747 = this.field534;
                class61.method545(2);
                this.field109 = true;
                class60 var2 = class60.method538(this.field246);
                if (var2.field1477 == 512 && var2.field1481 == 334 && var2.field1487 == 0) {
                    var2.field1477 = 765;
                    var2.field1481 = 503;
                }
                this.method121(0, -665, 0, var2, 0);
                if (this.field387 != -1) {
                    class60 var3 = class60.method538(this.field387);
                    if (var3.field1477 == 512 && var3.field1481 == 334 && var3.field1487 == 0) {
                        var3.field1477 = 765;
                        var3.field1481 = 503;
                    }
                    this.method121(0, -665, 0, var3, 0);
                }
                if (!this.field328) {
                    this.method55(-888);
                    this.method28(true);
                } else {
                    this.method158((byte) -93);
                }
            }
            super.field610.method174(super.field609, true, 0, 0);
        } else {
            if (this.field109) {
                this.method34((byte) 8);
                this.field109 = false;
                this.field407.method174(super.field609, true, 4, 0);
                this.field408.method174(super.field609, true, 357, 0);
                this.field409.method174(super.field609, true, 4, 722);
                this.field410.method174(super.field609, true, 205, 743);
                this.field411.method174(super.field609, true, 0, 0);
                this.field412.method174(super.field609, true, 4, 516);
                this.field413.method174(super.field609, true, 205, 516);
                this.field414.method174(super.field609, true, 357, 496);
                this.field415.method174(super.field609, true, 338, 0);
                this.field543 = true;
                this.field570 = true;
                this.field206 = true;
                this.field571 = true;
                if (this.field430 != 2) {
                    this.field266.method174(super.field609, true, 4, 4);
                    this.field265.method174(super.field609, true, 4, 550);
                }
            }
            if (this.field430 == 2) {
                this.method147(this.field474);
            }
            if (this.field328 && this.field129 == 1) {
                this.field543 = true;
            }
            if (this.field158 != -1) {
                boolean var4 = this.method88(this.field158, this.field118, -95);
                if (var4) {
                    this.field543 = true;
                }
            }
            if (this.field230 == 2) {
                this.field543 = true;
            }
            if (this.field377 == 2) {
                this.field543 = true;
            }
            if (this.field543) {
                this.method71(6);
                this.field543 = false;
            }
            ++field381;
            if (arg0 != -35) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            if (field381 > 100) {
                field381 = 0;
                this.field366.method328(-818, 102);
                this.field366.method329(192);
            }
            if (this.field333 == -1 && this.field244 == 0) {
                this.field162.field1440 = this.field490 - this.field341 - 77;
                if (super.field617 > 448 && super.field617 < 560 && super.field618 > 332) {
                    this.method144(-184, this.field162, 0, super.field618 - 357, this.field490, 463, 77, super.field617 - 17, -1);
                }
                int var6 = this.field490 - 77 - this.field162.field1440;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > this.field490 - 77) {
                    var6 = this.field490 - 77;
                }
                if (this.field341 != var6) {
                    this.field341 = var6;
                    this.field570 = true;
                }
            }
            if (this.field333 == -1 && this.field244 == 3) {
                int var7 = this.field94 * 14 + 7;
                this.field162.field1440 = this.field97;
                if (super.field617 > 448 && super.field617 < 560 && super.field618 > 332) {
                    this.method144(-184, this.field162, 0, super.field618 - 357, var7, 463, 77, super.field617 - 17, -1);
                }
                int var8 = this.field162.field1440;
                if (var8 < 0) {
                    var8 = 0;
                }
                if (var8 > var7 - 77) {
                    var8 = var7 - 77;
                }
                if (this.field97 != var8) {
                    this.field97 = var8;
                    this.field570 = true;
                }
            }
            if (this.field333 != -1) {
                boolean var9 = this.method88(this.field333, this.field118, -95);
                if (var9) {
                    this.field570 = true;
                }
            }
            if (this.field230 == 3) {
                this.field570 = true;
            }
            if (this.field377 == 3) {
                this.field570 = true;
            }
            if (this.field248 != null) {
                this.field570 = true;
            }
            if (this.field328 && this.field129 == 2) {
                this.field570 = true;
            }
            if (this.field570) {
                this.method91(7);
                this.field570 = false;
            }
            if (this.field430 == 2) {
                this.method100(this.field208);
                this.field265.method174(super.field609, true, 4, 550);
                ++field338;
                if (field338 > 1394) {
                    field338 = 0;
                    this.field366.method328(-818, 167);
                    this.field366.method329(0);
                    int var10 = this.field366.field1072;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field366.method329(109);
                    }
                    this.field366.method330((int) (Math.random() * 65536.0D));
                    this.field366.method330(65484);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field366.method330(37273);
                    }
                    this.field366.method329((int) (Math.random() * 256.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field366.method329(212);
                    }
                    this.field366.method330(42668);
                    this.field366.method329((int) (Math.random() * 256.0D));
                    this.field366.method330(43683);
                    this.field366.method329(65);
                    this.field366.method338(-13105, this.field366.field1072 - var10);
                }
            }
            if (this.field429 != -1) {
                this.field206 = true;
            }
            if (this.field206) {
                if (this.field429 != -1 && this.field429 == this.field119) {
                    this.field429 = -1;
                    this.field366.method328(-818, 252);
                    this.field366.method329(this.field119);
                }
                this.field206 = false;
                this.field144.method173(true);
                this.field498.method530(3, 0, 0);
                if (this.field158 == -1) {
                    if (this.field428[this.field119] != -1) {
                        if (this.field119 == 0) {
                            this.field214.method530(3, 10, 22);
                        }
                        if (this.field119 == 1) {
                            this.field215.method530(3, 8, 54);
                        }
                        if (this.field119 == 2) {
                            this.field215.method530(3, 8, 82);
                        }
                        if (this.field119 == 3) {
                            this.field216.method530(3, 8, 110);
                        }
                        if (this.field119 == 4) {
                            this.field218.method530(3, 8, 153);
                        }
                        if (this.field119 == 5) {
                            this.field218.method530(3, 8, 181);
                        }
                        if (this.field119 == 6) {
                            this.field217.method530(3, 9, 209);
                        }
                    }
                    if (this.field428[0] != -1 && (this.field429 != 0 || field567 % 20 < 10)) {
                        this.field295[0].method530(3, 13, 29);
                    }
                    if (this.field428[1] != -1 && (this.field429 != 1 || field567 % 20 < 10)) {
                        this.field295[1].method530(3, 11, 53);
                    }
                    if (this.field428[2] != -1 && (this.field429 != 2 || field567 % 20 < 10)) {
                        this.field295[2].method530(3, 11, 82);
                    }
                    if (this.field428[3] != -1 && (this.field429 != 3 || field567 % 20 < 10)) {
                        this.field295[3].method530(3, 12, 115);
                    }
                    if (this.field428[4] != -1 && (this.field429 != 4 || field567 % 20 < 10)) {
                        this.field295[4].method530(3, 13, 153);
                    }
                    if (this.field428[5] != -1 && (this.field429 != 5 || field567 % 20 < 10)) {
                        this.field295[5].method530(3, 11, 180);
                    }
                    if (this.field428[6] != -1 && (this.field429 != 6 || field567 % 20 < 10)) {
                        this.field295[6].method530(3, 13, 208);
                    }
                }
                this.field144.method174(super.field609, true, 160, 516);
                this.field143.method173(true);
                this.field497.method530(3, 0, 0);
                if (this.field158 == -1) {
                    if (this.field428[this.field119] != -1) {
                        if (this.field119 == 7) {
                            this.field174.method530(3, 0, 42);
                        }
                        if (this.field119 == 8) {
                            this.field175.method530(3, 0, 74);
                        }
                        if (this.field119 == 9) {
                            this.field175.method530(3, 0, 102);
                        }
                        if (this.field119 == 10) {
                            this.field176.method530(3, 1, 130);
                        }
                        if (this.field119 == 11) {
                            this.field178.method530(3, 0, 173);
                        }
                        if (this.field119 == 12) {
                            this.field178.method530(3, 0, 201);
                        }
                        if (this.field119 == 13) {
                            this.field177.method530(3, 0, 229);
                        }
                    }
                    if (this.field428[8] != -1 && (this.field429 != 8 || field567 % 20 < 10)) {
                        this.field295[7].method530(3, 2, 74);
                    }
                    if (this.field428[9] != -1 && (this.field429 != 9 || field567 % 20 < 10)) {
                        this.field295[8].method530(3, 3, 102);
                    }
                    if (this.field428[10] != -1 && (this.field429 != 10 || field567 % 20 < 10)) {
                        this.field295[9].method530(3, 4, 137);
                    }
                    if (this.field428[11] != -1 && (this.field429 != 11 || field567 % 20 < 10)) {
                        this.field295[10].method530(3, 2, 174);
                    }
                    if (this.field428[12] != -1 && (this.field429 != 12 || field567 % 20 < 10)) {
                        this.field295[11].method530(3, 2, 201);
                    }
                    if (this.field428[13] != -1 && (this.field429 != 13 || field567 % 20 < 10)) {
                        this.field295[12].method530(3, 2, 226);
                    }
                }
                this.field143.method174(super.field609, true, 466, 496);
                this.field266.method173(true);
                class72.field1747 = this.field533;
            }
            if (this.field571) {
                this.field571 = false;
                this.field142.method173(true);
                this.field496.method530(3, 0, 0);
                this.field403.method436(28, 16777215, this.field345, "Public chat", true, 55);
                if (this.field451 == 0) {
                    this.field403.method436(41, 65280, this.field345, "On", true, 55);
                }
                if (this.field451 == 1) {
                    this.field403.method436(41, 16776960, this.field345, "Friends", true, 55);
                }
                if (this.field451 == 2) {
                    this.field403.method436(41, 16711680, this.field345, "Off", true, 55);
                }
                if (this.field451 == 3) {
                    this.field403.method436(41, 65535, this.field345, "Hide", true, 55);
                }
                this.field403.method436(28, 16777215, this.field345, "Private chat", true, 184);
                if (this.field167 == 0) {
                    this.field403.method436(41, 65280, this.field345, "On", true, 184);
                }
                if (this.field167 == 1) {
                    this.field403.method436(41, 16776960, this.field345, "Friends", true, 184);
                }
                if (this.field167 == 2) {
                    this.field403.method436(41, 16711680, this.field345, "Off", true, 184);
                }
                this.field403.method436(28, 16777215, this.field345, "Trade/compete", true, 324);
                if (this.field294 == 0) {
                    this.field403.method436(41, 65280, this.field345, "On", true, 324);
                }
                if (this.field294 == 1) {
                    this.field403.method436(41, 16776960, this.field345, "Friends", true, 324);
                }
                if (this.field294 == 2) {
                    this.field403.method436(41, 16711680, this.field345, "Off", true, 324);
                }
                this.field403.method436(33, 16777215, this.field345, "Report abuse", true, 458);
                this.field142.method174(super.field609, true, 453, 0);
                this.field266.method173(true);
                class72.field1747 = this.field533;
            }
            this.field118 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method51(boolean arg0) {
        this.field330 = new class59(this.field282, "titlebox", 0);
        this.field331 = new class59(this.field282, "titlebutton", 0);
        if (arg0) {
            this.field474 = !this.field474;
        }
        this.field234 = new class59[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field234[var2] = new class59(this.field282, "runes", var2);
        }
        this.field554 = new class13(128, 265);
        this.field555 = new class13(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field554.field664[var3] = this.field396.field633[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field555.field664[var4] = this.field397.field633[var4];
        }
        this.field190 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field190[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field190[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field190[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field190[var8 + 192] = 16777215;
        }
        this.field191 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field191[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field191[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field191[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field191[var12 + 192] = 16777215;
        }
        this.field192 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field192[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field192[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field192[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field192[var16 + 192] = 16777215;
        }
        this.field189 = new int[256];
        this.field201 = new int[32768];
        this.field202 = new int[32768];
        this.method94((class59) null, (byte) 8);
        this.field514 = new int[32768];
        this.field515 = new int[32768];
        this.method101(field392, 10, "Connecting to fileserver");
        if (!this.field517) {
            this.field340 = true;
            this.field517 = true;
            this.method142(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Z")
    public final boolean method52(int arg0) {
        if (arg0 != 2) {
            this.field479 = 205;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field180 = Integer.parseInt(this.getParameter("nodeid"));
        field181 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method37(2);
        } else {
            method56(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field182 = false;
        } else {
            field182 = true;
        }
        this.method169(503, 34288, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILFKNRMZJV;)V")
    public final void method53(byte arg0, int arg1, int arg2, class13 arg3) {
        if (arg0 == -120) {
            int var5 = arg1 * arg1 + arg2 * arg2;
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field308 + this.field211 & 2047;
                int var7 = class22.field831[var6];
                int var8 = class22.field832[var6];
                int var9 = var7 * 256 / (this.field82 + 256);
                int var10 = var8 * 256 / (this.field82 + 256);
                int var11 = arg1 * var10 + arg2 * var9 >> 16;
                int var12 = arg2 * var10 - arg1 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field418.method190(-44232, 83 - var16 - 20, 256, 20, 20, 15, 15, var15 + 94 + 4 - 10, var13);
            } else {
                this.method120(arg1, 0, arg3, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILAPPQAEOL;I)V")
    public final void method54(int arg0, int arg1, int arg2, class2 arg3, int arg4) {
        if (this.field259 < 400) {
            if (arg3.field18 != null) {
                arg3 = arg3.method5(this.field365);
            }
            if (arg3 != null) {
                if (arg3.field12) {
                    String var6 = arg3.field40;
                    if (arg0 != -11478) {
                        for (int var7 = 1; var7 > 0; ++var7) {
                        }
                    }
                    if (arg3.field16 != 0) {
                        var6 = var6 + method36(arg3.field16, false, field419.field1613) + " (level-" + arg3.field16 + ")";
                    }
                    if (this.field184 == 1) {
                        this.field385[this.field259] = "Use " + this.field188 + " with @yel@" + var6;
                        this.field561[this.field259] = 219;
                        this.field562[this.field259] = arg4;
                        this.field559[this.field259] = arg1;
                        this.field560[this.field259] = arg2;
                        ++this.field259;
                    } else {
                        if (this.field464 == 1) {
                            if ((this.field466 & 2) == 2) {
                                this.field385[this.field259] = this.field467 + " @yel@" + var6;
                                this.field561[this.field259] = 843;
                                this.field562[this.field259] = arg4;
                                this.field559[this.field259] = arg1;
                                this.field560[this.field259] = arg2;
                                ++this.field259;
                                return;
                            }
                        } else {
                            if (arg3.field28 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg3.field28[var8] != null && !arg3.field28[var8].equalsIgnoreCase("attack")) {
                                        this.field385[this.field259] = arg3.field28[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field561[this.field259] = 90;
                                        }
                                        if (var8 == 1) {
                                            this.field561[this.field259] = 468;
                                        }
                                        if (var8 == 2) {
                                            this.field561[this.field259] = 432;
                                        }
                                        if (var8 == 3) {
                                            this.field561[this.field259] = 550;
                                        }
                                        if (var8 == 4) {
                                            this.field561[this.field259] = 866;
                                        }
                                        this.field562[this.field259] = arg4;
                                        this.field559[this.field259] = arg1;
                                        this.field560[this.field259] = arg2;
                                        ++this.field259;
                                    }
                                }
                            }
                            if (arg3.field28 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (arg3.field28[var9] != null && arg3.field28[var9].equalsIgnoreCase("attack")) {
                                        short var10 = 0;
                                        if (arg3.field16 > field419.field1613) {
                                            var10 = 2000;
                                        }
                                        this.field385[this.field259] = arg3.field28[var9] + " @yel@" + var6;
                                        if (var9 == 0) {
                                            this.field561[this.field259] = var10 + 90;
                                        }
                                        if (var9 == 1) {
                                            this.field561[this.field259] = var10 + 468;
                                        }
                                        if (var9 == 2) {
                                            this.field561[this.field259] = var10 + 432;
                                        }
                                        if (var9 == 3) {
                                            this.field561[this.field259] = var10 + 550;
                                        }
                                        if (var9 == 4) {
                                            this.field561[this.field259] = var10 + 866;
                                        }
                                        this.field562[this.field259] = arg4;
                                        this.field559[this.field259] = arg1;
                                        this.field560[this.field259] = arg2;
                                        ++this.field259;
                                    }
                                }
                            }
                            this.field385[this.field259] = "Examine @yel@" + var6;
                            this.field561[this.field259] = 1532;
                            this.field562[this.field259] = arg4;
                            this.field559[this.field259] = arg1;
                            this.field560[this.field259] = arg2;
                            ++this.field259;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (this.field377 == 0) {
            this.field385[0] = "Cancel";
            this.field561[0] = 1855;
            this.field259 = 1;
            if (this.field246 != -1) {
                this.field433 = 0;
                this.field450 = 0;
                this.method126(super.field617, 0, 0, class60.method538(this.field246), 0, 0, super.field618, 9);
                if (this.field433 != this.field416) {
                    this.field416 = this.field433;
                }
                if (this.field495 != this.field450) {
                    this.field495 = this.field450;
                }
            } else {
                this.method108(false);
                this.field433 = 0;
                this.field450 = 0;
                if (super.field617 > 4 && super.field618 > 4 && super.field617 < 516 && super.field618 < 338) {
                    if (this.field351 != -1) {
                        this.method126(super.field617, 4, 0, class60.method538(this.field351), 4, 0, super.field618, 9);
                    } else {
                        this.method62(true);
                    }
                }
                if (this.field433 != this.field416) {
                    this.field416 = this.field433;
                }
                if (this.field495 != this.field450) {
                    this.field495 = this.field450;
                }
                this.field433 = 0;
                this.field450 = 0;
                if (super.field617 > 553 && super.field618 > 205 && super.field617 < 743 && super.field618 < 466) {
                    if (this.field158 != -1) {
                        this.method126(super.field617, 553, 1, class60.method538(this.field158), 205, 0, super.field618, 9);
                    } else if (this.field428[this.field119] != -1) {
                        this.method126(super.field617, 553, 1, class60.method538(this.field428[this.field119]), 205, 0, super.field618, 9);
                    }
                }
                if (this.field433 != this.field136) {
                    this.field543 = true;
                    this.field136 = this.field433;
                }
                if (this.field450 != this.field240) {
                    this.field543 = true;
                    this.field240 = this.field450;
                }
                this.field433 = 0;
                this.field450 = 0;
                if (super.field617 > 17 && super.field618 > 357 && super.field617 < 496 && super.field618 < 453) {
                    if (this.field333 != -1) {
                        this.method126(super.field617, 17, 2, class60.method538(this.field333), 357, 0, super.field618, 9);
                    } else if (this.field501 != -1) {
                        this.method126(super.field617, 17, 3, class60.method538(this.field501), 357, 0, super.field618, 9);
                    } else if (super.field618 < 434 && super.field617 < 426 && this.field244 == 0) {
                        this.method82(2, super.field618 - 357, super.field617 - 17);
                    }
                }
                if ((this.field333 != -1 || this.field501 != -1) && this.field433 != this.field238) {
                    this.field570 = true;
                    this.field238 = this.field433;
                }
                if ((this.field333 != -1 || this.field501 != -1) && this.field450 != this.field334) {
                    this.field570 = true;
                    this.field334 = this.field450;
                }
                boolean var2 = false;
                if (arg0 < 0) {
                    while (!var2) {
                        var2 = true;
                        for (int var3 = 0; var3 < this.field259 - 1; ++var3) {
                            if (this.field561[var3] < 1000 && this.field561[var3 + 1] > 1000) {
                                String var4 = this.field385[var3];
                                this.field385[var3] = this.field385[var3 + 1];
                                this.field385[var3 + 1] = var4;
                                int var5 = this.field561[var3];
                                this.field561[var3] = this.field561[var3 + 1];
                                this.field561[var3 + 1] = var5;
                                int var6 = this.field559[var3];
                                this.field559[var3] = this.field559[var3 + 1];
                                this.field559[var3 + 1] = var6;
                                int var7 = this.field560[var3];
                                this.field560[var3] = this.field560[var3 + 1];
                                this.field560[var3 + 1] = var7;
                                int var8 = this.field562[var3];
                                this.field562[var3] = this.field562[var3 + 1];
                                this.field562[var3 + 1] = var8;
                                var2 = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public static final void method56(boolean arg0) {
        class56.field1274 = false;
        class72.field1736 = false;
        field183 = false;
        class37.field1112 = false;
        if (arg0) {
            class25.field889 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILNQUAUMDT;)V")
    private final void method57(byte arg0, int arg1, class36 arg2) {
        for (int var4 = 0; var4 < this.field446; ++var4) {
            int var5 = this.field447[var4];
            class65 var6 = this.field443[var5];
            int var7 = arg2.method339();
            if ((var7 & 16) != 0) {
                var7 += arg2.method339() << 8;
            }
            this.method151(var5, arg2, var6, 2, var7);
        }
        if (arg0 == -50) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZII)LRSPRYUFS;")
    public final class49 method58(String arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
        byte[] var7 = null;
        this.field342 &= arg3;
        int var8 = 5;
        try {
            if (this.field172[0] != null) {
                var7 = this.field172[0].method1((byte) 6, arg2);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field110.reset();
            this.field110.update(var7);
            int var9 = (int) this.field110.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class49(var7, (byte) -70);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method101(field392, arg4, "Requesting " + arg0);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method148(arg1 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class36 var17 = new class36(-587, var16);
                    var17.field1072 = 3;
                    int var18 = var17.method343() + 6;
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
                            this.method101(field392, arg4, "Loading " + arg0 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field172[0] != null) {
                            this.field172[0].method2(var7, true, arg2, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field172[0] = null;
                    }
                    if (var7 != null) {
                        this.field110.reset();
                        this.field110.update(var7);
                        int var24 = (int) this.field110.getValue();
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
                            this.method101(field392, arg4, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method101(field392, arg4, var12 + " - Retrying in " + var26);
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
                    this.field417 = !this.field417;
                }
            }
            return new class49(var7, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void method59(byte arg0, int arg1) {
        int[] var3 = this.field424.field664;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field512[arg1][var24][var6] & 24) == 0) {
                    this.field196.method493(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field512[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field196.method493(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field424.method180(true);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field512[arg1][var22][var9] & 24) == 0) {
                    this.method153(var9, 0, var22, arg1, var7, var8);
                }
                if (arg1 < 3 && (this.field512[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method153(var9, 0, var22, arg1 + 1, var7, var8);
                }
            }
        }
        if (arg0 != 1) {
            this.field173 = this.field486.method241();
        }
        if (this.field266 != null) {
            this.field266.method173(true);
            class72.field1747 = this.field533;
        }
        this.field348 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field196.method487(this.field556, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class25.method249(var13).field876;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field547[this.field556].field1676;
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
                        this.field368[this.field348] = this.field488[var14];
                        this.field349[this.field348] = var15;
                        this.field350[this.field348] = var16;
                        ++this.field348;
                    }
                }
            }
        }
        ++field317;
        if (field317 > 62) {
            field317 = 0;
            this.field366.method328(-818, 187);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method60(int arg0, boolean arg1) {
        class60 var3 = class60.method538(arg0);
        for (int var4 = 0; var4 < var3.field1430.length && var3.field1430[var4] != -1; ++var4) {
            class60 var5 = class60.method538(var3.field1430[var4]);
            if (var5.field1487 == 1) {
                this.method60(var5.field1452, false);
            }
            var5.field1449 = 0;
            var5.field1416 = 0;
        }
        if (arg1) {
            this.field149 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method61(byte arg0) {
        this.field516 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field517) {
                ++this.field386;
                this.method160((byte) 8);
                this.method160((byte) 8);
                this.method105(this.field173);
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
                } catch (Exception var10) {
                }
            }
        } catch (Exception var11) {
        }
        this.field516 = false;
        if (arg0 == 3) {
            boolean var9 = false;
        } else {
            this.field366.method329(242);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        if (this.field184 == 0 && this.field464 == 0) {
            this.field385[this.field259] = "Walk here";
            this.field561[this.field259] = 1;
            this.field559[this.field259] = super.field617;
            this.field560[this.field259] = super.field618;
            ++this.field259;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class22.field829; ++var3) {
            int var4 = class22.field830[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field196.method488(this.field556, var5, var6, var4) >= 0) {
                    class25 var9 = class25.method249(var8);
                    if (var9.field872 != null) {
                        var9 = var9.method250(-19182);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field184 == 1) {
                        this.field385[this.field259] = "Use " + this.field188 + " with @cya@" + var9.field867;
                        this.field561[this.field259] = 980;
                        this.field562[this.field259] = var4;
                        this.field559[this.field259] = var5;
                        this.field560[this.field259] = var6;
                        ++this.field259;
                    } else if (this.field464 == 1) {
                        if ((this.field466 & 4) == 4) {
                            this.field385[this.field259] = this.field467 + " @cya@" + var9.field867;
                            this.field561[this.field259] = 214;
                            this.field562[this.field259] = var4;
                            this.field559[this.field259] = var5;
                            this.field560[this.field259] = var6;
                            ++this.field259;
                        }
                    } else {
                        if (var9.field890 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field890[var10] != null) {
                                    this.field385[this.field259] = var9.field890[var10] + " @cya@" + var9.field867;
                                    if (var10 == 0) {
                                        this.field561[this.field259] = 694;
                                    }
                                    if (var10 == 1) {
                                        this.field561[this.field259] = 232;
                                    }
                                    if (var10 == 2) {
                                        this.field561[this.field259] = 308;
                                    }
                                    if (var10 == 3) {
                                        this.field561[this.field259] = 293;
                                    }
                                    if (var10 == 4) {
                                        this.field561[this.field259] = 1952;
                                    }
                                    this.field562[this.field259] = var4;
                                    this.field559[this.field259] = var5;
                                    this.field560[this.field259] = var6;
                                    ++this.field259;
                                }
                            }
                        }
                        this.field385[this.field259] = "Examine @cya@" + var9.field867;
                        this.field561[this.field259] = 1439;
                        this.field562[this.field259] = var9.field859 << 14;
                        this.field559[this.field259] = var5;
                        this.field560[this.field259] = var6;
                        ++this.field259;
                    }
                }
                if (var7 == 1) {
                    class8 var11 = this.field164[var8];
                    if (var11.field594.field11 == 1 && (var11.field1559 & 127) == 64 && (var11.field1560 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field165; ++var12) {
                            class8 var15 = this.field164[this.field166[var12]];
                            if (var15 != null && var11 != var15 && var15.field594.field11 == 1 && var11.field1559 == var15.field1559 && var11.field1560 == var15.field1560) {
                                this.method54(-11478, var5, var6, var15.field594, this.field166[var12]);
                            }
                        }
                        for (int var13 = 0; var13 < this.field444; ++var13) {
                            class65 var14 = this.field443[this.field445[var13]];
                            if (var14 != null && var11.field1559 == var14.field1559 && var11.field1560 == var14.field1560) {
                                this.method31(var14, this.field445[var13], var6, true, var5);
                            }
                        }
                    }
                    this.method54(-11478, var5, var6, var11.field594, var8);
                }
                if (var7 == 0) {
                    class65 var16 = this.field443[var8];
                    if ((var16.field1559 & 127) == 64 && (var16.field1560 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field165; ++var17) {
                            class8 var20 = this.field164[this.field166[var17]];
                            if (var20 != null && var20.field594.field11 == 1 && var16.field1559 == var20.field1559 && var16.field1560 == var20.field1560) {
                                this.method54(-11478, var5, var6, var20.field594, this.field166[var17]);
                            }
                        }
                        for (int var18 = 0; var18 < this.field444; ++var18) {
                            class65 var19 = this.field443[this.field445[var18]];
                            if (var19 != null && var16 != var19 && var16.field1559 == var19.field1559 && var16.field1560 == var19.field1560) {
                                this.method31(var19, this.field445[var18], var6, true, var5);
                            }
                        }
                    }
                    this.method31(var16, var8, var6, true, var5);
                }
                if (var7 == 3) {
                    class16 var21 = this.field382[this.field556][var5][var6];
                    if (var21 != null) {
                        for (class47 var22 = (class47) var21.method201((byte) 3); var22 != null; var22 = (class47) var21.method203((byte) 6)) {
                            class58 var23 = class58.method520(var22.field1195);
                            if (this.field184 == 1) {
                                this.field385[this.field259] = "Use " + this.field188 + " with @lre@" + var23.field1378;
                                this.field561[this.field259] = 762;
                                this.field562[this.field259] = var22.field1195;
                                this.field559[this.field259] = var5;
                                this.field560[this.field259] = var6;
                                ++this.field259;
                            } else if (this.field464 == 1) {
                                if ((this.field466 & 1) == 1) {
                                    this.field385[this.field259] = this.field467 + " @lre@" + var23.field1378;
                                    this.field561[this.field259] = 985;
                                    this.field562[this.field259] = var22.field1195;
                                    this.field559[this.field259] = var5;
                                    this.field560[this.field259] = var6;
                                    ++this.field259;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1381 != null && var23.field1381[var24] != null) {
                                        this.field385[this.field259] = var23.field1381[var24] + " @lre@" + var23.field1378;
                                        if (var24 == 0) {
                                            this.field561[this.field259] = 873;
                                        }
                                        if (var24 == 1) {
                                            this.field561[this.field259] = 852;
                                        }
                                        if (var24 == 2) {
                                            this.field561[this.field259] = 752;
                                        }
                                        if (var24 == 3) {
                                            this.field561[this.field259] = 24;
                                        }
                                        if (var24 == 4) {
                                            this.field561[this.field259] = 64;
                                        }
                                        this.field562[this.field259] = var22.field1195;
                                        this.field559[this.field259] = var5;
                                        this.field560[this.field259] = var6;
                                        ++this.field259;
                                    } else if (var24 == 2) {
                                        this.field385[this.field259] = "Take @lre@" + var23.field1378;
                                        this.field561[this.field259] = 752;
                                        this.field562[this.field259] = var22.field1195;
                                        this.field559[this.field259] = var5;
                                        this.field560[this.field259] = var6;
                                        ++this.field259;
                                    }
                                }
                                this.field385[this.field259] = "Examine @lre@" + var23.field1378;
                                this.field561[this.field259] = 1288;
                                this.field562[this.field259] = var22.field1195;
                                this.field559[this.field259] = var5;
                                this.field560[this.field259] = var6;
                                ++this.field259;
                            }
                        }
                    }
                }
            }
        }
        this.field342 &= arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNQUAUMDT;II)V")
    private final void method63(class36 arg0, int arg1, int arg2) {
        int var4 = arg0.method350(739, 8);
        int var10000 = arg1 + arg2;
        if (var4 < this.field444) {
            for (int var6 = var4; var6 < this.field444; ++var6) {
                this.field426[this.field425++] = this.field445[var6];
            }
        }
        if (var4 > this.field444) {
            signlink.reporterror(this.field476 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field444 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field445[var7];
                class65 var9 = this.field443[var8];
                int var10 = arg0.method350(739, 1);
                if (var10 == 0) {
                    this.field445[this.field444++] = var8;
                    var9.field1581 = field567;
                } else {
                    int var11 = arg0.method350(739, 2);
                    if (var11 == 0) {
                        this.field445[this.field444++] = var8;
                        var9.field1581 = field567;
                        this.field447[this.field446++] = var8;
                    } else if (var11 == 1) {
                        this.field445[this.field444++] = var8;
                        var9.field1581 = field567;
                        int var12 = arg0.method350(739, 3);
                        var9.method554(false, (byte) -118, var12);
                        int var13 = arg0.method350(739, 1);
                        if (var13 == 1) {
                            this.field447[this.field446++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field445[this.field444++] = var8;
                        var9.field1581 = field567;
                        int var14 = arg0.method350(739, 3);
                        var9.method554(true, (byte) -118, var14);
                        int var15 = arg0.method350(739, 3);
                        var9.method554(true, (byte) -118, var15);
                        int var16 = arg0.method350(739, 1);
                        if (var16 == 1) {
                            this.field447[this.field446++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field426[this.field425++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.field148 += arg0;
        if (this.field377 == 0) {
            int var2 = super.field623;
            if (this.field464 == 1 && super.field624 >= 516 && super.field625 >= 160 && super.field624 <= 765 && super.field625 <= 205) {
                var2 = 0;
            }
            if (this.field328) {
                if (var2 != 1) {
                    int var3 = super.field617;
                    int var4 = super.field618;
                    if (this.field129 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field129 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field129 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field130 - 10 || var3 > this.field132 + this.field130 + 10 || var4 < this.field131 - 10 || var4 > this.field133 + this.field131 + 10) {
                        this.field328 = false;
                        if (this.field129 == 1) {
                            this.field543 = true;
                        }
                        if (this.field129 == 2) {
                            this.field570 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field130;
                    int var6 = this.field131;
                    int var7 = this.field132;
                    int var8 = super.field624;
                    int var9 = super.field625;
                    if (this.field129 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field129 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field129 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field259; ++var11) {
                        int var12 = (this.field259 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method159(var10, 5);
                    }
                    this.field328 = false;
                    if (this.field129 == 1) {
                        this.field543 = true;
                    }
                    if (this.field129 == 2) {
                        this.field570 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field259 > 0) {
                    int var13 = this.field561[this.field259 - 1];
                    if (var13 == 236 || var13 == 29 || var13 == 651 || var13 == 605 || var13 == 490 || var13 == 504 || var13 == 486 || var13 == 18 || var13 == 675 || var13 == 393 || var13 == 871 || var13 == 1910) {
                        int var14 = this.field559[this.field259 - 1];
                        int var15 = this.field560[this.field259 - 1];
                        class60 var16 = class60.method538(var15);
                        if (var16.field1462 || var16.field1431) {
                            this.field269 = false;
                            this.field92 = 0;
                            this.field375 = var15;
                            this.field376 = var14;
                            this.field377 = 2;
                            this.field378 = super.field624;
                            this.field379 = super.field625;
                            if (class60.method538(var15).field1479 == this.field351) {
                                this.field377 = 1;
                            }
                            if (class60.method538(var15).field1479 == this.field333) {
                                this.field377 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field241 == 1 || this.method42(this.field311, this.field259 - 1)) && this.field259 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field259 > 0) {
                    this.method159(this.field259 - 1, 5);
                }
                if (var2 != 2 || this.field259 <= 0) {
                    return;
                }
                this.method111((byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (arg0 != 6) {
            this.field366.method329(8);
        }
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method66(int arg0) {
        if (arg0 == 0) {
            if (this.field157 == 0) {
                int var2 = super.field607 / 2 - 80;
                int var3 = super.field608 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field623 == 1 && super.field624 >= var2 - 75 && super.field624 <= var2 + 75 && super.field625 >= var14 - 20 && super.field625 <= var14 + 20) {
                    this.field157 = 3;
                    this.field520 = 0;
                }
                int var4 = super.field607 / 2 + 80;
                if (super.field623 == 1 && super.field624 >= var4 - 75 && super.field624 <= var4 + 75 && super.field625 >= var14 - 20 && super.field625 <= var14 + 20) {
                    this.field388 = "";
                    this.field389 = "Enter your username & password.";
                    this.field157 = 2;
                    this.field520 = 0;
                }
            } else if (this.field157 == 2) {
                int var5 = super.field608 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field623 == 1 && super.field625 >= var16 - 15 && super.field625 < var16) {
                    this.field520 = 0;
                }
                var5 = var16 + 15;
                if (super.field623 == 1 && super.field625 >= var5 - 15 && super.field625 < var5) {
                    this.field520 = 1;
                }
                var5 += 15;
                int var6 = super.field607 / 2 - 80;
                int var7 = super.field608 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field623 == 1 && super.field624 >= var6 - 75 && super.field624 <= var6 + 75 && super.field625 >= var17 - 20 && super.field625 <= var17 + 20) {
                    this.field268 = 0;
                    this.method38(this.field476, this.field477, false);
                    if (this.field342) {
                        return;
                    }
                }
                int var8 = super.field607 / 2 + 80;
                if (super.field623 == 1 && super.field624 >= var8 - 75 && super.field624 <= var8 + 75 && super.field625 >= var17 - 20 && super.field625 <= var17 + 20) {
                    this.field157 = 0;
                    this.field476 = "";
                    this.field477 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method172(0);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field207.length(); ++var11) {
                            if (var9 == field207.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field520 == 0) {
                            if (var9 == 8 && this.field476.length() > 0) {
                                this.field476 = this.field476.substring(0, this.field476.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field520 = 1;
                            }
                            if (var10) {
                                this.field476 = this.field476 + (char) var9;
                            }
                            if (this.field476.length() > 12) {
                                this.field476 = this.field476.substring(0, 12);
                            }
                        } else if (this.field520 == 1) {
                            if (var9 == 8 && this.field477.length() > 0) {
                                this.field477 = this.field477.substring(0, this.field477.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field520 = 0;
                            }
                            if (var10) {
                                this.field477 = this.field477 + (char) var9;
                            }
                            if (this.field477.length() > 20) {
                                this.field477 = this.field477.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field157 == 3) {
                    int var12 = super.field607 / 2;
                    int var13 = super.field608 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field623 == 1 && super.field624 >= var12 - 75 && super.field624 <= var12 + 75 && super.field625 >= var18 - 20 && super.field625 <= var18 + 20) {
                        this.field157 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
    public final void method67(String arg0, boolean arg1, int arg2, String arg3) {
        if (arg2 == 0 && this.field501 != -1) {
            this.field248 = arg3;
            super.field623 = 0;
        }
        if (this.field333 == -1) {
            this.field570 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field84[var5] = this.field84[var5 - 1];
            this.field85[var5] = this.field85[var5 - 1];
            this.field86[var5] = this.field86[var5 - 1];
        }
        this.field84[0] = arg2;
        if (arg1) {
            this.field91 = this.field486.method241();
        }
        this.field85[0] = arg0;
        this.field86[0] = arg3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method68(int arg0, byte[] arg1, int arg2) {
        this.field148 += arg2;
        return arg1 == null ? true : signlink.wavesave(arg1, arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
    public final int method69(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field512[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg2 & 127;
            int var10 = (128 - var8) * this.field439[var7][var5][var6] + this.field439[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field439[var7][var5][var6 + 1] + this.field439[var7][var5 + 1][var6 + 1] * var8 >> 7;
            if (arg3 != 117) {
                this.field345 = -145;
            }
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method70(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method71(int arg0) {
        if (arg0 != 6) {
            this.field382 = null;
        }
        this.field264.method173(true);
        class72.field1747 = this.field532;
        this.field436.method530(3, 0, 0);
        if (this.field158 != -1) {
            this.method121(0, -665, 0, class60.method538(this.field158), 0);
        } else if (this.field428[this.field119] != -1) {
            this.method121(0, -665, 0, class60.method538(this.field428[this.field119]), 0);
        }
        if (this.field328 && this.field129 == 1) {
            this.method158((byte) -93);
        }
        this.field264.method174(super.field609, true, 205, 553);
        this.field266.method173(true);
        class72.field1747 = this.field533;
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public void method72(int arg0) {
        if (arg0 >= 2 && arg0 <= 2) {
            System.out.println("============");
            System.out.println("flame-cycle:" + this.field386);
            if (this.field440 != null) {
                System.out.println("Od-cycle:" + this.field440.field1027);
            }
            System.out.println("loop-cycle:" + field567);
            System.out.println("draw-cycle:" + field171);
            System.out.println("ptype:" + this.field149);
            System.out.println("psize:" + this.field148);
            if (this.field469 != null) {
                this.field469.method425(2);
            }
            super.field606 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public final Component method73(int arg0) {
        if (this.field459 != arg0) {
            this.field91 = this.field486.method241();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field612 != null ? super.field612 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLVGGOSQRK;)Z")
    public final boolean method74(boolean arg0, class60 arg1) {
        int var3 = arg1.field1423;
        if (arg0) {
            this.field474 = !this.field474;
        }
        if (this.field252 == 2) {
            if (var3 == 201) {
                this.field570 = true;
                this.field244 = 0;
                this.field98 = true;
                this.field219 = "";
                this.field472 = 1;
                this.field384 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field570 = true;
                this.field244 = 0;
                this.field98 = true;
                this.field219 = "";
                this.field472 = 2;
                this.field384 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field152 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field570 = true;
                this.field244 = 0;
                this.field98 = true;
                this.field219 = "";
                this.field472 = 4;
                this.field384 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field570 = true;
                this.field244 = 0;
                this.field98 = true;
                this.field219 = "";
                this.field472 = 5;
                this.field384 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field154[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class54.field1251 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class54.field1251) {
                                var6 = 0;
                            }
                        }
                        if (!class54.field1252[var6].field1258 && class54.field1252[var6].field1253 == var4 + (this.field115 ? 0 : 7)) {
                            this.field154[var4] = var6;
                            this.field153 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field374[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field160[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field160[var7].length) {
                        var9 = 0;
                    }
                }
                this.field374[var7] = var9;
                this.field153 = true;
            }
            if (var3 == 324 && !this.field115) {
                this.field115 = true;
                this.method92((byte) 0);
            }
            if (var3 == 325 && this.field115) {
                this.field115 = false;
                this.method92((byte) 0);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field194 = !this.field194;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method162(false);
                    if (this.field170.length() > 0) {
                        this.field366.method328(-818, 251);
                        this.field366.method335(class52.method428(this.field170), true);
                        this.field366.method329(var3 - 601);
                        this.field366.method329(this.field194 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field366.method328(-818, 254);
                this.field366.method329(this.field115 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field366.method329(this.field154[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field366.method329(this.field374[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method75(int arg0) {
        if (arg0 == 43335) {
            while (true) {
                class63 var2 = this.field440.method321();
                if (var2 == null) {
                    return;
                }
                if (var2.field1529 == 0) {
                    class22.method210(-17833, var2.field1527, var2.field1528);
                    if ((this.field440.method307(973, var2.field1528) & 98) != 0) {
                        this.field543 = true;
                        if (this.field333 != -1 || this.field501 != -1) {
                            this.field570 = true;
                        }
                    }
                }
                if (var2.field1529 == 1 && var2.field1527 != null) {
                    class69.method576(var2.field1527, 0);
                }
                if (var2.field1529 == 2 && this.field518 == var2.field1528 && var2.field1527 != null) {
                    this.method85(-38407, this.field519, var2.field1527);
                }
                if (var2.field1529 == 3 && this.field430 == 1) {
                    for (int var3 = 0; var3 < this.field372.length; ++var3) {
                        if (this.field336[var3] == var2.field1528) {
                            this.field372[var3] = var2.field1527;
                            if (var2.field1527 == null) {
                                this.field336[var3] = -1;
                            }
                            break;
                        }
                        if (this.field337[var3] == var2.field1528) {
                            this.field564[var3] = var2.field1527;
                            if (var2.field1527 == null) {
                                this.field337[var3] = -1;
                            }
                            break;
                        }
                    }
                }
                if (var2.field1529 == 93 && this.field440.method312(var2.field1528, -526)) {
                    class37.method378(new class36(-587, var2.field1527), (byte) 49, this.field440);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method76(int arg0) {
        if (this.field89 > 1) {
            --this.field89;
        }
        if (this.field152 > 0) {
            --this.field152;
        }
        for (int var2 = 0; var2 < 5 && this.method27(0); ++var2) {
        }
        if (this.field342) {
            Object var3 = this.field262.field1199;
            synchronized (this.field262.field1199) {
                if (!field116) {
                    this.field262.field1201 = 0;
                } else if (super.field623 != 0 || this.field262.field1201 >= 40) {
                    this.field366.method328(-818, 155);
                    this.field366.method329(0);
                    int var4 = this.field366.field1072;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field262.field1201 && var4 - this.field366.field1072 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field262.field1198[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field262.field1197[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field262.field1198[var6] == -1 && this.field262.field1197[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field557 == var8 && this.field558 == var7) {
                            if (this.field106 < 2047) {
                                ++this.field106;
                            }
                        } else {
                            int var10 = var8 - this.field557;
                            this.field557 = var8;
                            int var11 = var7 - this.field558;
                            this.field558 = var7;
                            if (this.field106 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field366.method330((this.field106 << 12) + (var10 << 6) + var11);
                                this.field106 = 0;
                            } else if (this.field106 < 8) {
                                this.field366.method332((this.field106 << 19) + 8388608 + var9);
                                this.field106 = 0;
                            } else {
                                this.field366.method333((this.field106 << 19) + -1073741824 + var9);
                                this.field106 = 0;
                            }
                        }
                    }
                    this.field366.method338(-13105, this.field366.field1072 - var4);
                    if (var5 >= this.field262.field1201) {
                        this.field262.field1201 = 0;
                    } else {
                        this.field262.field1201 -= var5;
                        for (int var12 = 0; var12 < this.field262.field1201; ++var12) {
                            this.field262.field1197[var12] = this.field262.field1197[var5 + var12];
                            this.field262.field1198[var12] = this.field262.field1198[var5 + var12];
                        }
                    }
                }
            }
            if (super.field623 != 0) {
                long var13 = (super.field626 - this.field284) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field284 = super.field626;
                int var15 = super.field625;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field624;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field623 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field366.method328(-818, 30);
                this.field366.method372((var18 << 19) + (var19 << 20) + var17, 49978);
            }
            if (this.field104 > 0) {
                --this.field104;
            }
            if (super.field627[1] == 1 || super.field627[2] == 1 || super.field627[3] == 1 || super.field627[4] == 1) {
                this.field105 = true;
            }
            if (this.field105 && this.field104 <= 0) {
                this.field104 = 20;
                this.field105 = false;
                this.field366.method328(-818, 10);
                this.field366.method364(this.field307, true);
                this.field366.method365(this.field308, 0);
            }
            if (super.field614 && !this.field237) {
                this.field237 = true;
                this.field366.method328(-818, 153);
                this.field366.method329(1);
            }
            if (!super.field614 && this.field237) {
                this.field237 = false;
                this.field366.method328(-818, 153);
                this.field366.method329(0);
            }
            this.method102(3);
            this.method164(8);
            this.method128(false);
            ++this.field150;
            if (this.field150 > 750) {
                this.method19((byte) 110);
            }
            this.method104(3);
            this.method43(true);
            this.method119(268);
            ++this.field118;
            if (this.field553 != 0) {
                this.field552 += 20;
                if (this.field552 >= 400) {
                    this.field553 = 0;
                }
            }
            if (this.field230 != 0) {
                ++this.field227;
                if (this.field227 >= 15) {
                    if (this.field230 == 2) {
                        this.field543 = true;
                    }
                    if (this.field230 == 3) {
                        this.field570 = true;
                    }
                    this.field230 = 0;
                }
            }
            if (this.field377 != 0) {
                ++this.field92;
                if (super.field617 > this.field378 + 5 || super.field617 < this.field378 - 5 || super.field618 > this.field379 + 5 || super.field618 < this.field379 - 5) {
                    this.field269 = true;
                }
                if (super.field616 == 0) {
                    if (this.field377 == 2) {
                        this.field543 = true;
                    }
                    if (this.field377 == 3) {
                        this.field570 = true;
                    }
                    this.field377 = 0;
                    if (this.field269 && this.field92 >= 5) {
                        this.field304 = -1;
                        this.method55(-888);
                        if (this.field375 == this.field304 && this.field376 != this.field303) {
                            class60 var20 = class60.method538(this.field375);
                            byte var21 = 0;
                            if (this.field261 == 1 && var20.field1423 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1415[this.field303] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1431) {
                                int var22 = this.field376;
                                int var23 = this.field303;
                                var20.field1415[var23] = var20.field1415[var22];
                                var20.field1439[var23] = var20.field1439[var22];
                                var20.field1415[var22] = -1;
                                var20.field1439[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field376;
                                int var25 = this.field303;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method532(this.field243, var24, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method532(this.field243, var24, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method532(this.field243, this.field376, this.field303);
                            }
                            this.field366.method328(-818, 140);
                            this.field366.method330(this.field376);
                            this.field366.method356(var21, 38949);
                            this.field366.method364(this.field375, true);
                            this.field366.method330(this.field303);
                        }
                    } else if ((this.field241 == 1 || this.method42(this.field311, this.field259 - 1)) && this.field259 > 2) {
                        this.method111((byte) 0);
                    } else if (this.field259 > 0) {
                        this.method159(this.field259 - 1, 5);
                    }
                    this.field227 = 10;
                    super.field623 = 0;
                }
            }
            if (class56.field1308 != -1) {
                int var26 = class56.field1308;
                int var27 = class56.field1309;
                boolean var28 = this.method156(0, 0, var27, 0, field419.field1570[0], 0, var26, 0, true, 0, 0, field419.field1569[0]);
                class56.field1308 = -1;
                if (var28) {
                    this.field550 = super.field624;
                    this.field551 = super.field625;
                    this.field553 = 1;
                    this.field552 = 0;
                }
            }
            if (super.field623 == 1 && this.field248 != null) {
                this.field248 = null;
                this.field570 = true;
                super.field623 = 0;
            }
            this.method64(0);
            if (this.field246 == -1) {
                this.method18(-17);
                this.method106(-186);
                this.method124(-42795);
            }
            if (super.field616 == 1 || super.field623 == 1) {
                ++this.field344;
            }
            if (this.field334 == 0 && this.field240 == 0 && this.field495 == 0) {
                if (this.field510 > 0) {
                    --this.field510;
                }
            } else if (this.field510 < 100) {
                ++this.field510;
                if (this.field510 == 100) {
                    if (this.field334 != 0) {
                        this.field570 = true;
                    }
                    if (this.field240 != 0) {
                        this.field543 = true;
                    }
                }
            }
            if (this.field430 == 2) {
                this.method125(-760);
            }
            if (this.field430 == 2 && this.field513) {
                this.method123(235);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field537[var29]++;
            }
            this.method150(false);
            ++super.field615;
            if (super.field615 > 4500) {
                this.field152 = 250;
                super.field615 -= 500;
                this.field366.method328(-818, 200);
            }
            ++this.field420;
            if (this.field420 > 500) {
                this.field420 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field224 += this.field225;
                }
                if ((var30 & 2) == 2) {
                    this.field254 += this.field255;
                }
                if ((var30 & 4) == 4) {
                    this.field324 += this.field325;
                }
            }
            if (this.field224 < -50) {
                this.field225 = 2;
            }
            if (this.field224 > 50) {
                this.field225 = -2;
            }
            if (this.field254 < -55) {
                this.field255 = 2;
            }
            if (this.field254 > 55) {
                this.field255 = -2;
            }
            if (this.field324 < -40) {
                this.field325 = 1;
            }
            if (this.field324 > 40) {
                this.field325 = -1;
            }
            ++this.field108;
            int var31 = 20 / arg0;
            if (this.field108 > 500) {
                this.field108 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field211 += this.field212;
                }
                if ((var32 & 2) == 2) {
                    this.field82 += this.field83;
                }
            }
            if (this.field211 < -60) {
                this.field212 = 2;
            }
            if (this.field211 > 60) {
                this.field212 = -2;
            }
            if (this.field82 < -20) {
                this.field83 = 1;
            }
            if (this.field82 > 10) {
                this.field83 = -1;
            }
            ++this.field151;
            if (this.field151 > 50) {
                this.field366.method328(-818, 28);
            }
            try {
                if (this.field469 != null && this.field366.field1072 > 0) {
                    this.field469.method424(5, 0, this.field366.field1071, this.field366.field1072);
                    this.field366.field1072 = 0;
                    this.field151 = 0;
                }
            } catch (IOException var34) {
                this.method19((byte) 110);
            } catch (Exception var35) {
                this.method23((byte) 64);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method77(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        } else {
            String var2 = String.valueOf(arg0);
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

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method78(int arg0) {
        this.field517 = false;
        while (this.field516) {
            this.field517 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field330 = null;
        this.field331 = null;
        if (arg0 == 1) {
            this.field234 = null;
            this.field189 = null;
            this.field190 = null;
            this.field191 = null;
            this.field192 = null;
            this.field201 = null;
            this.field202 = null;
            this.field514 = null;
            this.field515 = null;
            this.field554 = null;
            this.field555 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method79(byte arg0) {
        try {
            this.field168 = -1;
            this.field548.method204();
            this.field245.method204();
            class72.method591(1338);
            this.method143(-920);
            this.field196.method458(false);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field547[var2].method561();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field512[var3][var4][var5] = 0;
                    }
                }
            }
            class37 var6 = new class37(104, (byte) 8, this.field439, 104, this.field512);
            int var7 = this.field372.length;
            this.field366.method328(-818, 28);
            if (!this.field126) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field335[var8] >> 8) * 64 - this.field287;
                    int var10 = (this.field335[var8] & 255) * 64 - this.field288;
                    byte[] var11 = this.field372[var8];
                    if (var11 != null) {
                        var6.method383(var10, var9, this.field547, var11, 0, (this.field293 - 6) * 8, (this.field292 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field335[var12] >> 8) * 64 - this.field287;
                    int var14 = (this.field335[var12] & 255) * 64 - this.field288;
                    byte[] var15 = this.field372[var12];
                    if (var15 == null && this.field293 < 800) {
                        var6.method386(var14, 64, (byte) 3, 64, var13);
                    }
                }
                this.field366.method328(-818, 28);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field564[var16];
                    if (var17 != null) {
                        int var18 = (this.field335[var16] >> 8) * 64 - this.field287;
                        int var19 = (this.field335[var16] & 255) * 64 - this.field288;
                        var6.method381(var19, -43202, var17, this.field547, this.field196, var18);
                    }
                }
            }
            if (this.field126) {
                int var20 = 0;
                label256: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field223[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method386(var32 * 8, 8, (byte) 3, 8, var31 * 8);
                                }
                            }
                        }
                        this.field366.method328(-818, 28);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label256;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field223[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field335.length; ++var43) {
                                            if (this.field335[var43] == var42 && this.field564[var43] != null) {
                                                var6.method395(var39, this.field196, this.field547, false, this.field564[var43], (var40 & 7) * 8, var35 * 8, var38, (var41 & 7) * 8, var36 * 8, var34);
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
                            int var24 = this.field223[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field335.length; ++var30) {
                                    if (this.field335[var30] == var29 && this.field372[var30] != null) {
                                        var6.method393((var27 & 7) * 8, var21 * 8, this.field372[var30], (var28 & 7) * 8, var25, this.field547, var22 * 8, var26, var20, 4);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method385(var21 * 8, var20, true, var22 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field366.method328(-818, 28);
            var6.method394(this.field547, this.field196, -593);
            if (this.field266 != null) {
                this.field266.method173(true);
                class72.field1747 = this.field533;
            }
            this.field366.method328(-818, 28);
            int var44 = class37.field1100;
            if (var44 > this.field556) {
                var44 = this.field556;
            }
            if (var44 < this.field556 - 1) {
                int var45 = this.field556 - 1;
            }
            if (field183) {
                this.field196.method459(false, class37.field1100);
            } else {
                this.field196.method459(false, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method98(var46, var47);
                }
            }
            this.method30(-39100);
        } catch (Exception var60) {
        }
        class25.field893.method511();
        if (super.field612 != null) {
            this.field366.method328(-818, 205);
            this.field366.method333(1057001181);
        }
        if (field183 && signlink.cache_dat != null) {
            int var49 = this.field440.method325(0, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field440.method307(973, var50);
                if ((var51 & 121) == 0) {
                    class22.method211(var50, 36045);
                }
            }
        }
        System.gc();
        class72.method592(-16628, 20);
        this.field440.method319(0);
        int var52 = (this.field292 - 6) / 8 - 1;
        int var53 = (this.field292 + 6) / 8 + 1;
        if (arg0 == -24) {
            int var54 = (this.field293 - 6) / 8 - 1;
            int var55 = (this.field293 + 6) / 8 + 1;
            if (this.field263) {
                var52 = 49;
                var53 = 50;
                var54 = 49;
                var55 = 50;
            }
            for (int var56 = var52; var56 <= var53; ++var56) {
                for (int var57 = var54; var57 <= var55; ++var57) {
                    if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                        int var58 = this.field440.method310(0, var57, var56, 1);
                        if (var58 != -1) {
                            this.field440.method324(var58, 691, 3);
                        }
                        int var59 = this.field440.method310(1, var57, var56, 1);
                        if (var59 != -1) {
                            this.field440.method324(var59, 691, 3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (super.field610 == null) {
            this.method78(1);
            this.field393 = null;
            while (arg0 >= 0) {
                this.field149 = this.field530.method339();
            }
            this.field394 = null;
            this.field395 = null;
            this.field396 = null;
            this.field397 = null;
            this.field398 = null;
            this.field399 = null;
            this.field400 = null;
            this.field401 = null;
            this.field267 = null;
            this.field265 = null;
            this.field264 = null;
            this.field266 = null;
            this.field142 = null;
            this.field143 = null;
            this.field144 = null;
            super.field610 = new class10(503, 765, this.method73(0), (byte) 0);
            this.field109 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        this.field342 &= arg0;
        if (!this.field280 && !this.field213 && !this.field502) {
            ++field567;
            if (!this.field342) {
                this.method66(this.field454);
            } else {
                this.method76(44);
            }
            this.method75(field339);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
    public final void method82(int arg0, int arg1, int arg2) {
        int var4 = 0;
        if (arg0 != 2) {
            this.field366.method329(155);
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field86[var5] != null) {
                int var6 = this.field84[var5];
                int var7 = 70 - var4 * 14 + this.field341 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field85[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field451 == 0 || this.field451 == 1 && this.method152(true, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field419.field1612)) {
                        if (this.field235 >= 1) {
                            this.field385[this.field259] = "Report abuse @whi@" + var8;
                            this.field561[this.field259] = 722;
                            ++this.field259;
                        }
                        this.field385[this.field259] = "Add ignore @whi@" + var8;
                        this.field561[this.field259] = 444;
                        ++this.field259;
                        this.field385[this.field259] = "Add friend @whi@" + var8;
                        this.field561[this.field259] = 159;
                        ++this.field259;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field569 == 0 && (var6 == 7 || this.field167 == 0 || this.field167 == 1 && this.method152(true, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field235 >= 1) {
                            this.field385[this.field259] = "Report abuse @whi@" + var8;
                            this.field561[this.field259] = 722;
                            ++this.field259;
                        }
                        this.field385[this.field259] = "Add ignore @whi@" + var8;
                        this.field561[this.field259] = 444;
                        ++this.field259;
                        this.field385[this.field259] = "Add friend @whi@" + var8;
                        this.field561[this.field259] = 159;
                        ++this.field259;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field294 == 0 || this.field294 == 1 && this.method152(true, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field385[this.field259] = "Accept trade @whi@" + var8;
                        this.field561[this.field259] = 749;
                        ++this.field259;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field569 == 0 && this.field167 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field294 == 0 || this.field294 == 1 && this.method152(true, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field385[this.field259] = "Accept challenge @whi@" + var8;
                        this.field561[this.field259] = 921;
                        ++this.field259;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method83(int arg0) {
        int var2 = 5;
        this.field120[8] = 0;
        int var3 = 0;
        int var4 = 26 / arg0;
        while (this.field120[8] == 0) {
            String var5 = "Unknown problem";
            this.method101(field392, 20, "Connecting to web server");
            try {
                DataInputStream var6 = this.method148("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 358);
                class36 var7 = new class36(-587, new byte[40]);
                var6.readFully(var7.field1071, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field120[var8] = var7.method344();
                }
                int var9 = var7.method344();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field120[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field120[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field120[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field120[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field120[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field120[8] == 0) {
                ++var3;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var3 >= 10) {
                        this.method101(field392, 10, "Game updated - please reload page");
                        var12 = 10;
                    } else {
                        this.method101(field392, 10, var5 + " - Will retry in " + var12 + " secs.");
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
                this.field417 = !this.field417;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field612 != null) {
                    return new URL("http://127.0.0.1:" + (field181 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (class42 var3 = (class42) this.field548.method200(); var3 != null; var3 = (class42) this.field548.method202(8)) {
            if (this.field556 == var3.field1151 && !var3.field1149) {
                if (field567 >= var3.field1145) {
                    var3.method415(this.field461, this.field118);
                    if (var3.field1149) {
                        var3.method326();
                    } else {
                        this.field196.method469(var3, var3.field1152, -1, var3.field1154, 0, 60, false, var3.field1151, var3.field1153, (byte) 4);
                    }
                }
            } else {
                var3.method326();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)V")
    public final void method85(int arg0, boolean arg1, byte[] arg2) {
        if (arg0 != -38407) {
            field339 = this.field486.method241();
        }
        if (this.field179) {
            signlink.midifade = arg1 ? 1 : 0;
            signlink.midisave(arg2, arg2.length);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LVGGOSQRK;I)Z")
    public final boolean method86(class60 arg0, int arg1) {
        if (arg0.field1432 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1432.length; ++var3) {
                int var4 = this.method21(var3, arg0, (byte) -15);
                int var5 = arg0.field1427[var3];
                if (arg0.field1432[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1432[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1432[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            while (arg1 >= 0) {
                this.field347 = -202;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILNQUAUMDT;)V")
    private final void method87(boolean arg0, int arg1, class36 arg2) {
        if (arg0) {
            this.field455 = 111;
        }
        for (int var4 = 0; var4 < this.field446; ++var4) {
            int var5 = this.field447[var4];
            class8 var6 = this.field164[var5];
            int var7 = arg2.method339();
            if ((var7 & 4) != 0) {
                int var8 = arg2.method367(-40);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = arg2.method358(0);
                if (var6.field1563 == var8 && var8 != -1) {
                    int var10 = class27.field923[var8].field937;
                    if (var10 == 1) {
                        var6.field1564 = 0;
                        var6.field1565 = 0;
                        var6.field1566 = var9;
                        var6.field1567 = 0;
                    }
                    if (var10 == 2) {
                        var6.field1567 = 0;
                    }
                } else if (var8 == -1 || var6.field1563 == -1 || class27.field923[var8].field931 >= class27.field923[var6.field1563].field931) {
                    var6.field1563 = var8;
                    var6.field1564 = 0;
                    var6.field1565 = 0;
                    var6.field1566 = var9;
                    var6.field1567 = 0;
                    var6.field1571 = var6.field1535;
                }
            }
            if ((var7 & 32) != 0) {
                var6.field1536 = arg2.method346();
                var6.field1568 = 100;
            }
            if ((var7 & 64) != 0) {
                int var11 = arg2.method359(this.field479);
                int var12 = arg2.method358(0);
                var6.method555(field567, true, var12, var11);
                var6.field1537 = field567 + 300;
                var6.field1538 = arg2.method359(this.field479);
                var6.field1539 = arg2.method359(this.field479);
            }
            if ((var7 & 1) != 0) {
                var6.field594 = class2.method10(arg2.method367(-40));
                var6.field1544 = var6.field594.field11;
                var6.field1543 = var6.field594.field9;
                var6.field1550 = var6.field594.field38;
                var6.field1551 = var6.field594.field48;
                var6.field1552 = var6.field594.field41;
                var6.field1553 = var6.field594.field27;
                var6.field1579 = var6.field594.field31;
            }
            if ((var7 & 16) != 0) {
                var6.field1577 = arg2.method367(-40);
                if (var6.field1577 == 65535) {
                    var6.field1577 = -1;
                }
            }
            if ((var7 & 128) != 0) {
                int var13 = arg2.method357((byte) 99);
                int var14 = arg2.method357((byte) 99);
                var6.method555(field567, true, var14, var13);
                var6.field1537 = field567 + 300;
                var6.field1538 = arg2.method339();
                var6.field1539 = arg2.method357((byte) 99);
            }
            if ((var7 & 2) != 0) {
                var6.field1533 = arg2.method367(-40);
                var6.field1534 = arg2.method341();
            }
            if ((var7 & 8) != 0) {
                var6.field1545 = arg2.method368(this.field535);
                int var15 = arg2.method344();
                var6.field1549 = var15 >> 16;
                var6.field1548 = (var15 & 65535) + field567;
                var6.field1546 = 0;
                var6.field1547 = 0;
                if (var6.field1548 > field567) {
                    var6.field1546 = -1;
                }
                if (var6.field1545 == 65535) {
                    var6.field1545 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
    public final boolean method88(int arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            this.field382 = null;
        }
        boolean var4 = false;
        class60 var5 = class60.method538(arg0);
        for (int var6 = 0; var6 < var5.field1430.length && var5.field1430[var6] != -1; ++var6) {
            class60 var7 = class60.method538(var5.field1430[var6]);
            if (var7.field1487 == 0) {
                var4 |= this.method88(var7.field1452, arg1, -95);
            }
            if (var7.field1487 == 6 && (var7.field1441 != -1 || var7.field1442 != -1)) {
                boolean var8 = this.method86(var7, -901);
                int var9;
                if (var8) {
                    var9 = var7.field1442;
                } else {
                    var9 = var7.field1441;
                }
                if (var9 != -1) {
                    class27 var10 = class27.field923[var9];
                    var7.field1416 += arg1;
                    while (var7.field1416 > var10.method256(var7.field1449, 642)) {
                        var7.field1416 -= var10.method256(var7.field1449, 642) + 1;
                        ++var7.field1449;
                        if (var7.field1449 >= var10.field924) {
                            var7.field1449 -= var10.field928;
                            if (var7.field1449 < 0 || var7.field1449 >= var10.field924) {
                                var7.field1449 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1487 == 6 && var7.field1483 != 0) {
                int var11 = var7.field1483 >> 16;
                int var12 = var7.field1483 << 16 >> 16;
                int var13 = arg1 * var11;
                int var14 = arg1 * var12;
                var7.field1435 = var7.field1435 + var13 & 2047;
                var7.field1436 = var7.field1436 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
    public final int method89(byte arg0) {
        int var2 = 3;
        if (arg0 != 1) {
            this.field455 = -398;
        }
        if (this.field140 < 310) {
            int var3 = this.field137 >> 7;
            int var4 = this.field139 >> 7;
            int var5 = field419.field1559 >> 7;
            int var6 = field419.field1560 >> 7;
            if ((this.field512[this.field556][var3][var4] & 4) != 0) {
                var2 = this.field556;
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
                    if ((this.field512[this.field556][var3][var4] & 4) != 0) {
                        var2 = this.field556;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field512[this.field556][var3][var4] & 4) != 0) {
                            var2 = this.field556;
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
                    if ((this.field512[this.field556][var3][var4] & 4) != 0) {
                        var2 = this.field556;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field512[this.field556][var3][var4] & 4) != 0) {
                            var2 = this.field556;
                        }
                    }
                }
            }
        }
        if ((this.field512[this.field556][field419.field1559 >> 7][field419.field1560 >> 7] & 4) != 0) {
            var2 = this.field556;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)I")
    public final int method90(int arg0) {
        if (arg0 != 6) {
            this.field382 = null;
        }
        int var2 = this.method69(this.field137, this.field556, this.field139, (byte) 117);
        return var2 - this.field138 < 800 && (this.field512[this.field556][this.field137 >> 7][this.field139 >> 7] & 4) != 0 ? this.field556 : 3;
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method91(int arg0) {
        this.field267.method173(true);
        class72.field1747 = this.field531;
        this.field438.method530(3, 0, 0);
        if (arg0 != 7) {
            this.field149 = -1;
        }
        if (this.field98) {
            this.field404.method435(0, 40, 0, this.field384, 239);
            this.field404.method435(128, 60, 0, this.field219 + "*", 239);
        } else if (this.field244 == 1) {
            this.field404.method435(0, 40, 0, "Enter amount:", 239);
            this.field404.method435(128, 60, 0, this.field527 + "*", 239);
        } else if (this.field244 == 2) {
            this.field404.method435(0, 40, 0, "Enter name:", 239);
            this.field404.method435(128, 60, 0, this.field527 + "*", 239);
        } else if (this.field244 == 3) {
            if (this.field93 != this.field527) {
                this.method118(this.field527, this.field250);
                this.field93 = this.field527;
            }
            class53 var2 = this.field403;
            class61.method544(0, 0, 463, 0, 77);
            for (int var3 = 0; var3 < this.field94; ++var3) {
                int var4 = var3 * 14 + 18 - this.field97;
                if (var4 > 0 && var4 < 110) {
                    var2.method435(0, var4, 0, this.field95[var3], 239);
                }
            }
            class61.method543((byte) -87);
            if (this.field94 > 5) {
                this.method133(3, this.field94 * 14 + 7, 463, this.field97, 77, 0);
            }
            if (this.field527.length() == 0) {
                this.field404.method435(255, 40, 0, "Enter object name", 239);
            } else if (this.field94 == 0) {
                this.field404.method435(0, 40, 0, "No matching objects found, please shorten search", 239);
            }
            var2.method435(0, 90, 0, this.field527 + "*", 239);
            class61.method550(0, 0, 77, 0, 479);
        } else if (this.field248 != null) {
            this.field404.method435(0, 40, 0, this.field248, 239);
            this.field404.method435(128, 60, 0, "Click to continue", 239);
        } else if (this.field333 != -1) {
            this.method121(0, -665, 0, class60.method538(this.field333), 0);
        } else if (this.field501 != -1) {
            this.method121(0, -665, 0, class60.method538(this.field501), 0);
        } else {
            class53 var5 = this.field403;
            int var6 = 0;
            class61.method544(0, 0, 463, 0, 77);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field86[var7] != null) {
                    int var9 = this.field84[var7];
                    int var10 = 70 - var6 * 14 + this.field341;
                    String var11 = this.field85[var7];
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
                            var5.method439(0, this.field86[var7], 4, var10, this.field233);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field451 == 0 || this.field451 == 1 && this.method152(true, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field352[0].method530(3, var10 - 12, var13);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field352[1].method530(3, var10 - 12, var13);
                                var13 += 14;
                            }
                            var5.method439(0, var11 + ":", var13, var10, this.field233);
                            int var14 = var13 + var5.method437(8, var11) + 8;
                            var5.method439(255, this.field86[var7], var14, var10, this.field233);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field569 == 0 && (var9 == 7 || this.field167 == 0 || this.field167 == 1 && this.method152(true, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method439(0, "From", var15, var10, this.field233);
                            int var16 = var15 + var5.method437(8, "From ");
                            if (var12 == 1) {
                                this.field352[0].method530(3, var10 - 12, var16);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field352[1].method530(3, var10 - 12, var16);
                                var16 += 14;
                            }
                            var5.method439(0, var11 + ":", var16, var10, this.field233);
                            int var17 = var16 + var5.method437(8, var11) + 8;
                            var5.method439(8388608, this.field86[var7], var17, var10, this.field233);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field294 == 0 || this.field294 == 1 && this.method152(true, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method439(8388736, var11 + " " + this.field86[var7], 4, var10, this.field233);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field569 == 0 && this.field167 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method439(8388608, this.field86[var7], 4, var10, this.field233);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field569 == 0 && this.field167 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method439(0, "To " + var11 + ":", 4, var10, this.field233);
                            var5.method439(8388608, this.field86[var7], 12 + var5.method437(8, "To " + var11), var10, this.field233);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field294 == 0 || this.field294 == 1 && this.method152(true, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method439(8270336, var11 + " " + this.field86[var7], 4, var10, this.field233);
                        }
                        ++var6;
                    }
                }
            }
            class61.method543((byte) -87);
            this.field490 = var6 * 14 + 7;
            if (this.field490 < 78) {
                this.field490 = 78;
            }
            this.method133(3, this.field490, 463, this.field490 - this.field341 - 77, 77, 0);
            String var8;
            if (field419 != null && field419.field1612 != null) {
                var8 = field419.field1612;
            } else {
                var8 = class52.method432(4, this.field476);
            }
            var5.method439(0, var8 + ":", 4, 90, this.field233);
            var5.method439(255, this.field494 + "*", 6 + var5.method437(8, var8 + ": "), 90, this.field233);
            class61.method550(0, 0, 77, 0, 479);
        }
        if (this.field328 && this.field129 == 2) {
            this.method158((byte) -93);
        }
        this.field267.method174(super.field609, true, 357, 17);
        this.field266.method173(true);
        class72.field1747 = this.field533;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method92(byte arg0) {
        this.field153 = true;
        if (arg0 != 0) {
            this.method132();
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field154[var2] = -1;
            for (int var3 = 0; var3 < class54.field1251; ++var3) {
                if (!class54.field1252[var3].field1258 && class54.field1252[var3].field1253 == var2 + (this.field115 ? 0 : 7)) {
                    this.field154[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.field353 = 0;
        this.field342 &= arg0;
        for (int var2 = -1; var2 < this.field444 + this.field165; ++var2) {
            class64 var19;
            if (var2 == -1) {
                var19 = field419;
            } else if (var2 < this.field444) {
                var19 = this.field443[this.field445[var2]];
            } else {
                var19 = this.field164[this.field166[var2 - this.field444]];
            }
            if (var19 != null && var19.method166(9382)) {
                if (var19 instanceof class8) {
                    class2 var20 = ((class8) var19).field594;
                    if (var20.field18 != null) {
                        var20 = var20.method5(this.field365);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field444) {
                    class2 var23 = ((class8) var19).field594;
                    if (var23.field46 >= 0 && var23.field46 < this.field128.length) {
                        this.method109(var19.field1555 + 15, var19, 8);
                        if (this.field199 > -1) {
                            this.field128[var23.field46].method185(3, this.field200 - 30, this.field199 - 12);
                        }
                    }
                    if (this.field125 == 1 && this.field166[var2 - this.field444] == this.field327 && field567 % 20 < 10) {
                        this.method109(var19.field1555 + 15, var19, 8);
                        if (this.field199 > -1) {
                            this.field542[0].method185(3, this.field200 - 28, this.field199 - 12);
                        }
                    }
                } else {
                    int var21 = 30;
                    class65 var22 = (class65) var19;
                    if (var22.field1615 != -1 || var22.field1611 != -1) {
                        this.method109(var19.field1555 + 15, var19, 8);
                        if (this.field199 > -1) {
                            if (var22.field1615 != -1) {
                                this.field538[var22.field1615].method185(3, this.field200 - var21, this.field199 - 12);
                                var21 += 25;
                            }
                            if (var22.field1611 != -1) {
                                this.field128[var22.field1611].method185(3, this.field200 - var21, this.field199 - 12);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field125 == 10 && this.field445[var2] == this.field343) {
                        this.method109(var19.field1555 + 15, var19, 8);
                        if (this.field199 > -1) {
                            this.field542[1].method185(3, this.field200 - var21, this.field199 - 12);
                        }
                    }
                }
                if (var19.field1536 != null && (var2 >= this.field444 || this.field451 == 0 || this.field451 == 3 || this.field451 == 1 && this.method152(true, ((class65) var19).field1612))) {
                    this.method109(var19.field1555, var19, 8);
                    if (this.field199 > -1 && this.field353 < this.field354) {
                        this.field358[this.field353] = this.field404.method438((byte) 5, var19.field1536) / 2;
                        this.field357[this.field353] = this.field404.field1247;
                        this.field355[this.field353] = this.field199;
                        this.field356[this.field353] = this.field200;
                        this.field359[this.field353] = var19.field1554;
                        this.field360[this.field353] = var19.field1556;
                        this.field361[this.field353] = var19.field1568;
                        this.field362[this.field353++] = var19.field1536;
                        if (this.field107 == 0 && var19.field1556 >= 1 && var19.field1556 <= 3) {
                            this.field357[this.field353] += 10;
                            this.field356[this.field353] += 5;
                        }
                        if (this.field107 == 0 && var19.field1556 == 4) {
                            this.field358[this.field353] = 60;
                        }
                        if (this.field107 == 0 && var19.field1556 == 5) {
                            this.field357[this.field353] += 5;
                        }
                    }
                }
                if (var19.field1537 > field567) {
                    this.method109(var19.field1555 + 15, var19, 8);
                    if (this.field199 > -1) {
                        int var24 = var19.field1538 * 30 / var19.field1539;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class61.method547(var24, this.field199 - 15, 5, this.field200 - 3, 65280, 3);
                        class61.method547(30 - var24, this.field199 - 15 + var24, 5, this.field200 - 3, 16711680, 3);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1575[var25] > field567) {
                        this.method109(var19.field1555 / 2, var19, 8);
                        if (this.field199 > -1) {
                            if (var25 == 1) {
                                this.field200 -= 20;
                            }
                            if (var25 == 2) {
                                this.field199 -= 15;
                                this.field200 -= 10;
                            }
                            if (var25 == 3) {
                                this.field199 += 15;
                                this.field200 -= 10;
                            }
                            this.field100[var19.field1574[var25]].method185(3, this.field200 - 12, this.field199 - 12);
                            this.field402.method435(0, this.field200 + 4, 0, String.valueOf(var19.field1573[var25]), this.field199);
                            this.field402.method435(16777215, this.field200 + 3, 0, String.valueOf(var19.field1573[var25]), this.field199 - 1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field353; ++var3) {
            int var4 = this.field355[var3];
            int var5 = this.field356[var3];
            int var6 = this.field358[var3];
            int var7 = this.field357[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field356[var18] - this.field357[var18] && var5 - var7 < this.field356[var18] + 2 && var4 - var6 < this.field358[var18] + this.field355[var18] && var4 + var6 > this.field355[var18] - this.field358[var18] && this.field356[var18] - this.field357[var18] < var5) {
                        var5 = this.field356[var18] - this.field357[var18];
                        var8 = true;
                    }
                }
            }
            this.field199 = this.field355[var3];
            this.field200 = this.field356[var3] = var5;
            String var9 = this.field362[var3];
            if (this.field107 == 0) {
                int var10 = 16776960;
                if (this.field359[var3] < 6) {
                    var10 = this.field193[this.field359[var3]];
                }
                if (this.field359[var3] == 6) {
                    var10 = this.field121 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field359[var3] == 7) {
                    var10 = this.field121 % 20 < 10 ? 255 : 65535;
                }
                if (this.field359[var3] == 8) {
                    var10 = this.field121 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field359[var3] == 9) {
                    int var11 = 150 - this.field361[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field359[var3] == 10) {
                    int var12 = 150 - this.field361[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field359[var3] == 11) {
                    int var13 = 150 - this.field361[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field360[var3] == 0) {
                    this.field404.method435(0, this.field200 + 1, 0, var9, this.field199);
                    this.field404.method435(var10, this.field200, 0, var9, this.field199);
                }
                if (this.field360[var3] == 1) {
                    this.field404.method440(this.field199, this.field200 + 1, var9, this.field121, 9, 0);
                    this.field404.method440(this.field199, this.field200, var9, this.field121, 9, var10);
                }
                if (this.field360[var3] == 2) {
                    this.field404.method441(this.field200 + 1, var9, this.field199, true, this.field121, 0);
                    this.field404.method441(this.field200, var9, this.field199, true, this.field121, var10);
                }
                if (this.field360[var3] == 3) {
                    this.field404.method442((byte) 14, this.field200 + 1, this.field121, 0, var9, this.field199, 150 - this.field361[var3]);
                    this.field404.method442((byte) 14, this.field200, this.field121, var10, var9, this.field199, 150 - this.field361[var3]);
                }
                if (this.field360[var3] == 4) {
                    int var14 = this.field404.method438((byte) 5, var9);
                    int var15 = (150 - this.field361[var3]) * (var14 + 100) / 150;
                    class61.method544(0, 0, this.field199 + 50, this.field199 - 50, 334);
                    this.field404.method439(0, var9, this.field199 + 50 - var15, this.field200 + 1, this.field233);
                    this.field404.method439(var10, var9, this.field199 + 50 - var15, this.field200, this.field233);
                    class61.method543((byte) -87);
                }
                if (this.field360[var3] == 5) {
                    int var16 = 150 - this.field361[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class61.method544(this.field200 - this.field404.field1247 - 1, 0, 512, 0, this.field200 + 5);
                    this.field404.method435(0, this.field200 + 1 + var17, 0, var9, this.field199);
                    this.field404.method435(var10, this.field200 + var17, 0, var9, this.field199);
                    class61.method543((byte) -87);
                }
            } else {
                this.field404.method435(0, this.field200 + 1, 0, var9, this.field199);
                this.field404.method435(16776960, this.field200, 0, var9, this.field199);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LUZETOFZZ;B)V")
    public final void method94(class59 arg0, byte arg1) {
        short var3 = 256;
        if (arg1 == 8) {
            boolean var4 = false;
        } else {
            this.field474 = !this.field474;
        }
        for (int var5 = 0; var5 < this.field201.length; ++var5) {
            this.field201[var5] = 0;
        }
        for (int var6 = 0; var6 < 5000; ++var6) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field201[var18] = (int) (Math.random() * 256.0D);
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var3 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field202[var17] = (this.field201[var17 - 1] + this.field201[var17 + 1] + this.field201[var17 - 128] + this.field201[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field201;
            this.field201 = this.field202;
            this.field202 = var15;
        }
        if (arg0 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg0.field1410; ++var9) {
                for (int var10 = 0; var10 < arg0.field1409; ++var10) {
                    if (arg0.field1407[var8++] != 0) {
                        int var11 = var10 + 16 + arg0.field1411;
                        int var12 = var9 + 16 + arg0.field1412;
                        int var13 = (var12 << 7) + var11;
                        this.field201[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LNQUAUMDT;II)V")
    private final void method95(class36 arg0, int arg1, int arg2) {
        arg0.method349(-31487);
        int var4 = arg0.method350(739, 8);
        if (var4 < this.field165) {
            for (int var5 = var4; var5 < this.field165; ++var5) {
                this.field426[this.field425++] = this.field166[var5];
            }
        }
        if (var4 > this.field165) {
            signlink.reporterror(this.field476 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field165 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field166[var6];
                class8 var8 = this.field164[var7];
                int var9 = arg0.method350(739, 1);
                if (var9 == 0) {
                    this.field166[this.field165++] = var7;
                    var8.field1581 = field567;
                } else {
                    int var10 = arg0.method350(739, 2);
                    if (var10 == 0) {
                        this.field166[this.field165++] = var7;
                        var8.field1581 = field567;
                        this.field447[this.field446++] = var7;
                    } else if (var10 == 1) {
                        this.field166[this.field165++] = var7;
                        var8.field1581 = field567;
                        int var11 = arg0.method350(739, 3);
                        var8.method554(false, (byte) -118, var11);
                        int var12 = arg0.method350(739, 1);
                        if (var12 == 1) {
                            this.field447[this.field446++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field166[this.field165++] = var7;
                        var8.field1581 = field567;
                        int var13 = arg0.method350(739, 3);
                        var8.method554(true, (byte) -118, var13);
                        int var14 = arg0.method350(739, 3);
                        var8.method554(true, (byte) -118, var14);
                        int var15 = arg0.method350(739, 1);
                        if (var15 == 1) {
                            this.field447[this.field446++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field426[this.field425++] = var7;
                    }
                }
            }
            if (arg1 == 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = class22.field831[var8];
            int var14 = class22.field832[var8];
            int var15 = var11 * var14 - arg2 * var13 >> 16;
            var12 = var11 * var13 + arg2 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class22.field831[var9];
            int var17 = class22.field832[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field137 = arg1 - var10;
        this.field138 = arg3 - var11;
        this.field139 = arg4 - var12;
        if (arg6 != 5294) {
            for (int var19 = 1; var19 > 0; ++var19) {
            }
        }
        this.field140 = arg0;
        this.field141 = arg5;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method97(boolean arg0) {
        byte[] var2 = this.field282.method427("title.dat", (byte[]) null);
        class13 var3 = new class13(var2, this);
        this.field396.method173(true);
        var3.method183(0, (byte) 0, 0);
        this.field397.method173(true);
        var3.method183(-637, (byte) 0, 0);
        this.field393.method173(true);
        var3.method183(-128, (byte) 0, 0);
        this.field394.method173(true);
        var3.method183(-202, (byte) 0, -371);
        this.field395.method173(true);
        var3.method183(-202, (byte) 0, -171);
        this.field398.method173(true);
        var3.method183(0, (byte) 0, -265);
        this.field399.method173(true);
        var3.method183(-562, (byte) 0, -265);
        this.field400.method173(true);
        var3.method183(-128, (byte) 0, -171);
        this.field401.method173(true);
        var3.method183(-562, (byte) 0, -171);
        int[] var4 = new int[var3.field665];
        for (int var5 = 0; var5 < var3.field666; ++var5) {
            for (int var10 = 0; var10 < var3.field665; ++var10) {
                var4[var10] = var3.field664[var3.field665 * var5 + (var3.field665 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field665; ++var11) {
                var3.field664[var3.field665 * var5 + var11] = var4[var11];
            }
        }
        if (arg0) {
            this.field149 = this.field530.method339();
        }
        this.field396.method173(true);
        var3.method183(382, (byte) 0, 0);
        this.field397.method173(true);
        var3.method183(-255, (byte) 0, 0);
        this.field393.method173(true);
        var3.method183(254, (byte) 0, 0);
        this.field394.method173(true);
        var3.method183(180, (byte) 0, -371);
        this.field395.method173(true);
        var3.method183(180, (byte) 0, -171);
        this.field398.method173(true);
        var3.method183(382, (byte) 0, -265);
        this.field399.method173(true);
        var3.method183(-180, (byte) 0, -265);
        this.field400.method173(true);
        var3.method183(254, (byte) 0, -171);
        this.field401.method173(true);
        var3.method183(-180, (byte) 0, -171);
        class13 var6 = new class13(this.field282, "logo", 0);
        this.field393.method173(true);
        var6.method185(3, 18, 382 - var6.field665 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class35.field1047) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method98(int arg0, int arg1) {
        class16 var3 = this.field382[this.field556][arg0][arg1];
        if (var3 == null) {
            this.field196.method479(this.field556, arg0, arg1);
        } else {
            int var4 = -99999999;
            class47 var5 = null;
            for (class47 var6 = (class47) var3.method200(); var6 != null; var6 = (class47) var3.method202(8)) {
                class58 var11 = class58.method520(var6.field1195);
                int var12 = var11.field1371;
                if (var11.field1388) {
                    var12 = (var6.field1194 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method198(var5, 8919);
            class47 var7 = null;
            class47 var8 = null;
            for (class47 var9 = (class47) var3.method200(); var9 != null; var9 = (class47) var3.method202(8)) {
                if (var5.field1195 != var9.field1195 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1195 != var9.field1195 && var7.field1195 != var9.field1195 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field196.method465(var7, var5, this.method69(arg0 * 128 + 64, this.field556, arg1 * 128 + 64, (byte) 117), var10, arg1, this.field556, arg0, var8, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method99(boolean arg0, long arg1) {
        this.field342 &= arg0;
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field499; ++var4) {
                if (this.field256[var4] == arg1) {
                    --this.field499;
                    this.field543 = true;
                    for (int var5 = var4; var5 < this.field499; ++var5) {
                        this.field256[var5] = this.field256[var5 + 1];
                    }
                    this.field366.method328(-818, 229);
                    this.field366.method335(arg1, true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        this.field265.method173(true);
        if (arg0) {
            this.field382 = null;
        }
        if (this.field277 == 2) {
            byte[] var2 = this.field437.field1407;
            int[] var3 = class61.field1498;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field161.method189(0, -210, 33, 25, 33, 25, 0, 256, this.field308, this.field101, this.field112);
            this.field266.method173(true);
            class72.field1747 = this.field533;
        } else {
            int var6 = this.field308 + this.field211 & 2047;
            int var7 = field419.field1559 / 32 + 48;
            int var8 = 464 - field419.field1560 / 32;
            this.field424.method189(5, -210, 151, var7, 146, var8, 25, this.field82 + 256, var6, this.field99, this.field127);
            this.field161.method189(0, -210, 33, 25, 33, 25, 0, 256, this.field308, this.field101, this.field112);
            for (int var9 = 0; var9 < this.field348; ++var9) {
                int var39 = this.field349[var9] * 4 + 2 - field419.field1559 / 32;
                int var40 = this.field350[var9] * 4 + 2 - field419.field1560 / 32;
                this.method120(var39, 0, this.field368[var9], var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class16 var36 = this.field382[this.field556][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field419.field1559 / 32;
                        int var38 = var35 * 4 + 2 - field419.field1560 / 32;
                        this.method120(var37, 0, this.field521, var38);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field165; ++var11) {
                class8 var31 = this.field164[this.field166[var11]];
                if (var31 != null && var31.method166(9382)) {
                    class2 var32 = var31.field594;
                    if (var32.field18 != null) {
                        var32 = var32.method5(this.field365);
                    }
                    if (var32 != null && var32.field23 && var32.field12) {
                        int var33 = var31.field1559 / 32 - field419.field1559 / 32;
                        int var34 = var31.field1560 / 32 - field419.field1560 / 32;
                        this.method120(var33, 0, this.field522, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field444; ++var12) {
                class65 var23 = this.field443[this.field445[var12]];
                if (var23 != null && var23.method166(9382)) {
                    int var24 = var23.field1559 / 32 - field419.field1559 / 32;
                    int var25 = var23.field1560 / 32 - field419.field1560 / 32;
                    boolean var26 = false;
                    long var27 = class52.method428(var23.field1612);
                    for (int var29 = 0; var29 < this.field251; ++var29) {
                        if (this.field364[var29] == var27 && this.field204[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field419.field1618 != 0 && var23.field1618 != 0 && field419.field1618 == var23.field1618) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method120(var24, 0, this.field524, var25);
                    } else if (var30) {
                        this.method120(var24, 0, this.field525, var25);
                    } else {
                        this.method120(var24, 0, this.field523, var25);
                    }
                }
            }
            if (this.field125 != 0 && field567 % 20 < 10) {
                if (this.field125 == 1 && this.field327 >= 0 && this.field327 < this.field164.length) {
                    class8 var13 = this.field164[this.field327];
                    if (var13 != null) {
                        int var14 = var13.field1559 / 32 - field419.field1559 / 32;
                        int var15 = var13.field1560 / 32 - field419.field1560 / 32;
                        this.method53((byte) -120, var14, var15, this.field135);
                    }
                }
                if (this.field125 == 2) {
                    int var16 = (this.field297 - this.field287) * 4 + 2 - field419.field1559 / 32;
                    int var17 = (this.field298 - this.field288) * 4 + 2 - field419.field1560 / 32;
                    this.method53((byte) -120, var16, var17, this.field135);
                }
                if (this.field125 == 10 && this.field343 >= 0 && this.field343 < this.field443.length) {
                    class65 var18 = this.field443[this.field343];
                    if (var18 != null) {
                        int var19 = var18.field1559 / 32 - field419.field1559 / 32;
                        int var20 = var18.field1560 / 32 - field419.field1560 / 32;
                        this.method53((byte) -120, var19, var20, this.field135);
                    }
                }
            }
            if (this.field422 != 0) {
                int var21 = this.field422 * 4 + 2 - field419.field1559 / 32;
                int var22 = this.field423 * 4 + 2 - field419.field1560 / 32;
                this.method120(var21, 0, this.field134, var22);
            }
            class61.method547(3, 97, 3, 78, 16777215, 3);
            this.field266.method173(true);
            class72.field1747 = this.field533;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method101(int arg0, int arg1, String arg2) {
        this.field236 = arg1;
        this.field90 = arg2;
        this.method39(1);
        if (this.field282 == null) {
            super.method101(field392, arg1, arg2);
        } else {
            this.field395.method173(true);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field404.method435(16777215, var5 / 2 - 26 - var6, 0, "RuneScape is loading - please wait...", var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            class61.method548(var4 / 2 - 152, 304, 9179409, 34, var7, 0);
            class61.method548(var4 / 2 - 151, 302, 0, 32, var7 + 1, 0);
            class61.method547(arg1 * 3, var4 / 2 - 150, 30, var7 + 2, 9179409, 3);
            if (arg0 == 0) {
                class61.method547(300 - arg1 * 3, arg1 * 3 + (var4 / 2 - 150), 30, var7 + 2, 0, 3);
                this.field404.method435(16777215, var5 / 2 + 5 - var6, 0, arg2, var4 / 2);
                this.field395.method174(super.field609, true, 171, 202);
                if (this.field109) {
                    this.field109 = false;
                    if (!this.field517) {
                        this.field396.method174(super.field609, true, 0, 0);
                        this.field397.method174(super.field609, true, 0, 637);
                    }
                    this.field393.method174(super.field609, true, 0, 128);
                    this.field394.method174(super.field609, true, 371, 202);
                    this.field398.method174(super.field609, true, 265, 0);
                    this.field399.method174(super.field609, true, 265, 562);
                    this.field400.method174(super.field609, true, 171, 128);
                    this.field401.method174(super.field609, true, 171, 562);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method102(int arg0) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field183 && this.field430 == 2 && class37.field1087 != this.field556) {
            this.method24((String) null, "Loading - please wait.", -252);
            this.field430 = 1;
            this.field492 = System.currentTimeMillis();
        }
        if (this.field430 == 1) {
            int var3 = this.method103(31836);
            if (var3 != 0 && System.currentTimeMillis() - this.field492 > 360000L) {
                signlink.reporterror(this.field476 + " glcfb " + this.field291 + "," + var3 + "," + field183 + "," + this.field172[0] + "," + this.field440.method305() + "," + this.field556 + "," + this.field292 + "," + this.field293);
                this.field492 = System.currentTimeMillis();
            }
        }
        if (this.field430 == 2 && this.field556 != this.field168) {
            this.field168 = this.field556;
            this.method59((byte) 1, this.field556);
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)I")
    public final int method103(int arg0) {
        for (int var2 = 0; var2 < this.field372.length; ++var2) {
            if (this.field372[var2] == null && this.field336[var2] != -1) {
                return -1;
            }
            if (this.field564[var2] == null && this.field337[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field372.length; ++var4) {
            byte[] var5 = this.field564[var4];
            if (var5 != null) {
                int var6 = (this.field335[var4] >> 8) * 64 - this.field287;
                int var7 = (this.field335[var4] & 255) * 64 - this.field288;
                if (this.field126) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class37.method391(var7, var5, var6, (byte) -90);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field273) {
            return -4;
        } else {
            this.field430 = 2;
            class37.field1087 = this.field556;
            this.method79((byte) -24);
            this.field366.method328(-818, 98);
            if (arg0 != 31836) {
                return 3;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method104(int arg0) {
        for (int var2 = -1; var2 < this.field444; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field442;
            } else {
                var3 = this.field445[var2];
            }
            class65 var4 = this.field443[var3];
            if (var4 != null) {
                this.method44(1, this.field568, var4);
            }
        }
        if (arg0 != 3) {
            this.field366.method329(233);
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method105(int arg0) {
        short var2 = 256;
        if (this.field312 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field312 > 768) {
                    this.field189[var3] = this.method26(1024 - this.field312, 0, this.field190[var3], this.field191[var3]);
                } else if (this.field312 > 256) {
                    this.field189[var3] = this.field191[var3];
                } else {
                    this.field189[var3] = this.method26(256 - this.field312, 0, this.field191[var3], this.field190[var3]);
                }
            }
        } else if (this.field313 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field313 > 768) {
                    this.field189[var4] = this.method26(1024 - this.field313, 0, this.field190[var4], this.field192[var4]);
                } else if (this.field313 > 256) {
                    this.field189[var4] = this.field192[var4];
                } else {
                    this.field189[var4] = this.method26(256 - this.field313, 0, this.field192[var4], this.field190[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field189[var5] = this.field190[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field396.field633[var6] = this.field554.field664[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field565[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field514[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field189[var26];
                    int var30 = this.field396.field633[var8];
                    this.field396.field633[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field396.method174(super.field609, true, 0, 0);
        if (arg0 < 0) {
            for (int var10 = 0; var10 < 33920; ++var10) {
                this.field397.field633[var10] = this.field555.field664[var10];
            }
            int var11 = 0;
            int var12 = 1176;
            for (int var13 = 1; var13 < var2 - 1; ++var13) {
                int var14 = (var2 - var13) * this.field565[var13] / var2;
                int var15 = 103 - var14;
                int var16 = var12 + var14;
                for (int var17 = 0; var17 < var15; ++var17) {
                    int var18 = this.field514[var11++];
                    if (var18 != 0) {
                        int var20 = 256 - var18;
                        int var21 = this.field189[var18];
                        int var22 = this.field397.field633[var16];
                        this.field397.field633[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                    } else {
                        ++var16;
                    }
                }
                var11 += 128 - var15;
                var12 = 128 - var15 - var14 + var16;
            }
            this.field397.method174(super.field609, true, 0, 637);
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method106(int arg0) {
        if (arg0 < 0) {
            if (super.field623 == 1) {
                if (super.field624 >= 539 && super.field624 <= 573 && super.field625 >= 169 && super.field625 < 205 && this.field428[0] != -1) {
                    this.field543 = true;
                    this.field119 = 0;
                    this.field206 = true;
                }
                if (super.field624 >= 569 && super.field624 <= 599 && super.field625 >= 168 && super.field625 < 205 && this.field428[1] != -1) {
                    this.field543 = true;
                    this.field119 = 1;
                    this.field206 = true;
                }
                if (super.field624 >= 597 && super.field624 <= 627 && super.field625 >= 168 && super.field625 < 205 && this.field428[2] != -1) {
                    this.field543 = true;
                    this.field119 = 2;
                    this.field206 = true;
                }
                if (super.field624 >= 625 && super.field624 <= 669 && super.field625 >= 168 && super.field625 < 203 && this.field428[3] != -1) {
                    this.field543 = true;
                    this.field119 = 3;
                    this.field206 = true;
                }
                if (super.field624 >= 666 && super.field624 <= 696 && super.field625 >= 168 && super.field625 < 205 && this.field428[4] != -1) {
                    this.field543 = true;
                    this.field119 = 4;
                    this.field206 = true;
                }
                if (super.field624 >= 694 && super.field624 <= 724 && super.field625 >= 168 && super.field625 < 205 && this.field428[5] != -1) {
                    this.field543 = true;
                    this.field119 = 5;
                    this.field206 = true;
                }
                if (super.field624 >= 722 && super.field624 <= 756 && super.field625 >= 169 && super.field625 < 205 && this.field428[6] != -1) {
                    this.field543 = true;
                    this.field119 = 6;
                    this.field206 = true;
                }
                if (super.field624 >= 540 && super.field624 <= 574 && super.field625 >= 466 && super.field625 < 502 && this.field428[7] != -1) {
                    this.field543 = true;
                    this.field119 = 7;
                    this.field206 = true;
                }
                if (super.field624 >= 572 && super.field624 <= 602 && super.field625 >= 466 && super.field625 < 503 && this.field428[8] != -1) {
                    this.field543 = true;
                    this.field119 = 8;
                    this.field206 = true;
                }
                if (super.field624 >= 599 && super.field624 <= 629 && super.field625 >= 466 && super.field625 < 503 && this.field428[9] != -1) {
                    this.field543 = true;
                    this.field119 = 9;
                    this.field206 = true;
                }
                if (super.field624 >= 627 && super.field624 <= 671 && super.field625 >= 467 && super.field625 < 502 && this.field428[10] != -1) {
                    this.field543 = true;
                    this.field119 = 10;
                    this.field206 = true;
                }
                if (super.field624 >= 669 && super.field624 <= 699 && super.field625 >= 466 && super.field625 < 503 && this.field428[11] != -1) {
                    this.field543 = true;
                    this.field119 = 11;
                    this.field206 = true;
                }
                if (super.field624 >= 696 && super.field624 <= 726 && super.field625 >= 466 && super.field625 < 503 && this.field428[12] != -1) {
                    this.field543 = true;
                    this.field119 = 12;
                    this.field206 = true;
                }
                if (super.field624 >= 724 && super.field624 <= 758 && super.field625 >= 466 && super.field625 < 502 && this.field428[13] != -1) {
                    this.field543 = true;
                    this.field119 = 13;
                    this.field206 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method107(int arg0) {
        if (this.field460 != arg0) {
            this.field149 = this.field530.method339();
        }
        Graphics var2 = this.method73(0).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method171(1, (byte) 2);
        if (this.field213) {
            this.field517 = false;
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
        if (this.field502) {
            this.field517 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field280) {
            this.field517 = false;
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

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method108(boolean arg0) {
        if (this.field569 != 0) {
            int var2 = 0;
            if (this.field89 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field86[var3] != null) {
                    int var4 = this.field84[var3];
                    String var5 = this.field85[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field167 == 0 || this.field167 == 1 && this.method152(true, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field617 > 4 && super.field618 - 4 > var9 - 10 && super.field618 - 4 <= var9 + 3) {
                            int var10 = this.field403.method437(8, "From:  " + var5 + this.field86[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field617 < var10 + 4) {
                                if (this.field235 >= 1) {
                                    this.field385[this.field259] = "Report abuse @whi@" + var5;
                                    this.field561[this.field259] = 2722;
                                    ++this.field259;
                                }
                                this.field385[this.field259] = "Add ignore @whi@" + var5;
                                this.field561[this.field259] = 2444;
                                ++this.field259;
                                this.field385[this.field259] = "Add friend @whi@" + var5;
                                this.field561[this.field259] = 2159;
                                ++this.field259;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field167 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0) {
                this.field365 = this.field486.method241();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILXEGGEBDS;I)V")
    public final void method109(int arg0, class64 arg1, int arg2) {
        if (arg2 != 8) {
            this.field149 = this.field530.method339();
        }
        this.method110(arg1.field1560, -19921, arg1.field1559, arg0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
    public final void method110(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
            int var5 = this.method69(arg2, this.field556, arg0, (byte) 117) - arg3;
            int var6 = arg2 - this.field137;
            int var7 = var5 - this.field138;
            int var8 = arg0 - this.field139;
            int var9 = class22.field831[this.field140];
            int var10 = class22.field832[this.field140];
            int var11 = class22.field831[this.field141];
            int var12 = class22.field832[this.field141];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (arg1 != -19921) {
                this.field347 = 115;
            }
            if (var17 >= 50) {
                this.field199 = (var13 << 9) / var17 + class72.field1741;
                this.field200 = (var16 << 9) / var17 + class72.field1742;
            } else {
                this.field199 = -1;
                this.field200 = -1;
            }
        } else {
            this.field199 = -1;
            this.field200 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method111(byte arg0) {
        int var2 = this.field404.method437(8, "Choose Option");
        for (int var3 = 0; var3 < this.field259; ++var3) {
            int var12 = this.field404.method437(8, this.field385[var3]);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        var2 += 8;
        int var5 = this.field259 * 15 + 21;
        if (super.field624 > 4 && super.field625 > 4 && super.field624 < 516 && super.field625 < 338) {
            int var6 = super.field624 - 4 - var2 / 2;
            if (var2 + var6 > 512) {
                var6 = 512 - var2;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field625 - 4;
            if (var5 + var7 > 334) {
                var7 = 334 - var5;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            this.field328 = true;
            this.field129 = 0;
            this.field130 = var6;
            this.field131 = var7;
            this.field132 = var2;
            this.field133 = this.field259 * 15 + 22;
        }
        if (super.field624 > 553 && super.field625 > 205 && super.field624 < 743 && super.field625 < 466) {
            int var8 = super.field624 - 553 - var2 / 2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var2 + var8 > 190) {
                var8 = 190 - var2;
            }
            int var9 = super.field625 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var5 + var9 > 261) {
                var9 = 261 - var5;
            }
            this.field328 = true;
            this.field129 = 1;
            this.field130 = var8;
            this.field131 = var9;
            this.field132 = var2;
            this.field133 = this.field259 * 15 + 22;
        }
        if (super.field624 > 17 && super.field625 > 357 && super.field624 < 496 && super.field625 < 453) {
            int var10 = super.field624 - 17 - var2 / 2;
            if (var10 < 0) {
                var10 = 0;
            } else if (var2 + var10 > 479) {
                var10 = 479 - var2;
            }
            int var11 = super.field625 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var5 + var11 > 96) {
                var11 = 96 - var5;
            }
            this.field328 = true;
            this.field129 = 2;
            this.field130 = var10;
            this.field131 = var11;
            this.field132 = var2;
            this.field133 = this.field259 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
    public final void method112(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field499 >= 100) {
                this.method67("", false, 0, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class52.method432(4, class52.method429((byte) -53, arg1));
                for (int var5 = 0; var5 < this.field499; ++var5) {
                    if (this.field256[var5] == arg1) {
                        this.method67("", false, 0, var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field251; ++var6) {
                    if (this.field364[var6] == arg1) {
                        this.method67("", false, 0, "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                if (arg0 != -68) {
                    for (int var7 = 1; var7 > 0; ++var7) {
                    }
                }
                this.field256[this.field499++] = arg1;
                this.field543 = true;
                this.field366.method328(-818, 232);
                this.field366.method335(arg1, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILNQUAUMDT;I)V")
    private final void method113(int arg0, class36 arg1, int arg2) {
        this.field425 = 0;
        this.field446 = 0;
        if (arg2 != 4918) {
            this.field454 = -340;
        }
        this.method131(arg0, false, arg1);
        this.method63(arg1, 0, arg0);
        this.method138(arg0, 6, arg1);
        this.method57((byte) -50, arg0, arg1);
        for (int var4 = 0; var4 < this.field425; ++var4) {
            int var6 = this.field426[var4];
            if (field567 != this.field443[var6].field1581) {
                this.field443[var6] = null;
            }
        }
        if (arg1.field1072 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1072 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field444; ++var5) {
                if (this.field443[this.field445[var5]] == null) {
                    signlink.reporterror(this.field476 + " null entry in pl list - pos:" + var5 + " size:" + this.field444);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (arg0 != 0) {
            this.field474 = !this.field474;
        }
        this.field109 = true;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ILNQUAUMDT;I)V")
    private final void method115(int arg0, class36 arg1, int arg2) {
        this.field425 = 0;
        if (arg0 <= 0) {
            this.field382 = null;
        }
        this.field446 = 0;
        this.method95(arg1, this.field332, arg2);
        this.method129(arg2, 0, arg1);
        this.method87(field155, arg2, arg1);
        for (int var4 = 0; var4 < this.field425; ++var4) {
            int var6 = this.field426[var4];
            if (field567 != this.field164[var6].field1581) {
                this.field164[var6].field594 = null;
                this.field164[var6] = null;
            }
        }
        if (arg1.field1072 != arg2) {
            signlink.reporterror(this.field476 + " size mismatch in getnpcpos - pos:" + arg1.field1072 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field165; ++var5) {
                if (this.field164[this.field166[var5]] == null) {
                    signlink.reporterror(this.field476 + " null entry in npc list - pos:" + var5 + " size:" + this.field165);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
    public final void method116(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field251 >= 100 && this.field511 != 1) {
                this.method67("", false, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field251 >= 200) {
                this.method67("", false, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class52.method432(4, class52.method429((byte) -53, arg1));
                for (int var5 = 0; var5 < this.field251; ++var5) {
                    if (this.field364[var5] == arg1) {
                        this.method67("", false, 0, var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field499; ++var6) {
                    if (this.field256[var6] == arg1) {
                        this.method67("", false, 0, "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field419.field1612)) {
                    this.field462[this.field251] = var4;
                    this.field364[this.field251] = arg1;
                    this.field204[this.field251] = 0;
                    ++this.field251;
                    this.field543 = true;
                    this.field366.method328(-818, 41);
                    if (arg0 != 0) {
                        this.field366.method329(145);
                    }
                    this.field366.method335(arg1, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
    public final void method117(int arg0, boolean arg1) {
        this.field342 &= arg1;
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method118(String arg0, int arg1) {
        if (arg0 != null && arg0.length() != 0) {
            String var3 = arg0;
            this.field148 += arg1;
            String[] var4 = new String[100];
            int var5 = 0;
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field94 = 0;
                    label47: for (int var9 = 0; var9 < class58.field1354; ++var9) {
                        class58 var10 = class58.method520(var9);
                        if (var10.field1360 == -1 && var10.field1378 != null) {
                            String var11 = var10.field1378.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label47;
                                }
                            }
                            this.field95[this.field94] = var11;
                            this.field96[this.field94] = var9;
                            ++this.field94;
                            if (this.field94 >= this.field95.length) {
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
            this.field94 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method119(int arg0) {
        for (int var2 = -1; var2 < this.field444; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field442;
            } else {
                var7 = this.field445[var2];
            }
            class65 var8 = this.field443[var7];
            if (var8 != null && var8.field1568 > 0) {
                --var8.field1568;
                if (var8.field1568 == 0) {
                    var8.field1536 = null;
                }
            }
        }
        ++field316;
        if (arg0 > 0) {
            if (field316 > 1171) {
                field316 = 0;
                this.field366.method328(-818, 53);
                this.field366.method329(0);
                int var3 = this.field366.field1072;
                this.field366.method330(32114);
                this.field366.method330(24032);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field366.method329(188);
                }
                this.field366.method330((int) (Math.random() * 65536.0D));
                this.field366.method330(38856);
                this.field366.method330(16760);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field366.method329(22);
                }
                this.field366.method330(52293);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field366.method330(63391);
                }
                this.field366.method330((int) (Math.random() * 65536.0D));
                this.field366.method338(-13105, this.field366.field1072 - var3);
            }
            for (int var4 = 0; var4 < this.field165; ++var4) {
                int var5 = this.field166[var4];
                class8 var6 = this.field164[var5];
                if (var6 != null && var6.field1568 > 0) {
                    --var6.field1568;
                    if (var6.field1568 == 0) {
                        var6.field1536 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILFKNRMZJV;I)V")
    public final void method120(int arg0, int arg1, class13 arg2, int arg3) {
        int var5 = this.field308 + this.field211 & 2047;
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class22.field831[var5];
            int var8 = class22.field832[var5];
            int var9 = var7 * 256 / (this.field82 + 256);
            int var10 = var8 * 256 / (this.field82 + 256);
            this.field148 += arg1;
            int var11 = arg0 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method191(var11 + 94 - arg2.field669 / 2 + 4, 83 - var12 - arg2.field670 / 2 - 4, (byte) 40, this.field437);
            } else {
                arg2.method185(3, 83 - var12 - arg2.field670 / 2 - 4, var11 + 94 - arg2.field669 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILVGGOSQRK;I)V")
    public final void method121(int arg0, int arg1, int arg2, class60 arg3, int arg4) {
        if (arg3.field1487 == 0 && arg3.field1430 != null) {
            if (!arg3.field1451 || this.field416 == arg3.field1452 || this.field136 == arg3.field1452 || this.field238 == arg3.field1452) {
                int var6 = class61.field1503;
                int var7 = class61.field1501;
                int var8 = class61.field1504;
                int var9 = class61.field1502;
                class61.method544(arg4, 0, arg3.field1477 + arg0, arg0, arg3.field1481 + arg4);
                int var10 = arg3.field1430.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field1454[var11] + arg0;
                    int var13 = arg3.field1438[var11] + arg4 - arg2;
                    class60 var14 = class60.method538(arg3.field1430[var11]);
                    int var15 = var14.field1478 + var12;
                    int var16 = var14.field1433 + var13;
                    if (var14.field1423 > 0) {
                        this.method134(32733, var14);
                    }
                    if (var14.field1487 == 0) {
                        if (var14.field1440 > var14.field1482 - var14.field1481) {
                            var14.field1440 = var14.field1482 - var14.field1481;
                        }
                        if (var14.field1440 < 0) {
                            var14.field1440 = 0;
                        }
                        this.method121(var15, -665, var14.field1440, var14, var16);
                        if (var14.field1482 > var14.field1481) {
                            this.method133(3, var14.field1482, var14.field1477 + var15, var14.field1440, var14.field1481, var16);
                        }
                    } else if (var14.field1487 != 1) {
                        if (var14.field1487 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1481; ++var18) {
                                for (int var19 = 0; var19 < var14.field1477; ++var19) {
                                    int var20 = (var14.field1476 + 32) * var19 + var15;
                                    int var21 = (var14.field1463 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1443[var17];
                                        var21 += var14.field1426[var17];
                                    }
                                    if (var14.field1415[var17] <= 0) {
                                        if (var14.field1474 != null && var17 < 20) {
                                            class13 var30 = var14.field1474[var17];
                                            if (var30 != null) {
                                                var30.method185(3, var21, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1415[var17] - 1;
                                        if (var20 > class61.field1503 - 32 && var20 < class61.field1504 && var21 > class61.field1501 - 32 && var21 < class61.field1502 || this.field377 != 0 && this.field376 == var17) {
                                            int var25 = 0;
                                            if (this.field184 == 1 && this.field185 == var17 && this.field186 == var14.field1452) {
                                                var25 = 16777215;
                                            }
                                            class13 var26 = class58.method524(var25, var14.field1439[var17], this.field546, var24);
                                            if (var26 != null) {
                                                if (this.field377 != 0 && this.field376 == var17 && this.field375 == var14.field1452) {
                                                    var22 = super.field617 - this.field378;
                                                    var23 = super.field618 - this.field379;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field92 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method187(17120, var20 + var22, var21 + var23, 128);
                                                    if (var21 + var23 < class61.field1501 && arg3.field1440 > 0) {
                                                        int var27 = (class61.field1501 - var21 - var23) * this.field118 / 3;
                                                        if (var27 > this.field118 * 10) {
                                                            var27 = this.field118 * 10;
                                                        }
                                                        if (var27 > arg3.field1440) {
                                                            var27 = arg3.field1440;
                                                        }
                                                        arg3.field1440 -= var27;
                                                        this.field379 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class61.field1502 && arg3.field1440 < arg3.field1482 - arg3.field1481) {
                                                        int var28 = (var21 + var23 + 32 - class61.field1502) * this.field118 / 3;
                                                        if (var28 > this.field118 * 10) {
                                                            var28 = this.field118 * 10;
                                                        }
                                                        if (var28 > arg3.field1482 - arg3.field1481 - arg3.field1440) {
                                                            var28 = arg3.field1482 - arg3.field1481 - arg3.field1440;
                                                        }
                                                        arg3.field1440 += var28;
                                                        this.field379 -= var28;
                                                    }
                                                } else if (this.field230 != 0 && this.field229 == var17 && this.field228 == var14.field1452) {
                                                    var26.method187(17120, var20, var21, 128);
                                                } else {
                                                    var26.method185(3, var21, var20);
                                                }
                                                if (var26.field669 == 33 || var14.field1439[var17] != 1) {
                                                    int var29 = var14.field1439[var17];
                                                    this.field402.method439(0, method154(var29, false), var20 + 1 + var22, var21 + 10 + var23, this.field233);
                                                    this.field402.method439(16776960, method154(var29, false), var20 + var22, var21 + 9 + var23, this.field233);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1487 == 3) {
                            boolean var31 = false;
                            if (this.field238 == var14.field1452 || this.field136 == var14.field1452 || this.field416 == var14.field1452) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method86(var14, -901)) {
                                var32 = var14.field1448;
                                if (var31 && var14.field1475 != 0) {
                                    var32 = var14.field1475;
                                }
                            } else {
                                var32 = var14.field1470;
                                if (var31 && var14.field1428 != 0) {
                                    var32 = var14.field1428;
                                }
                            }
                            if (var14.field1437 == 0) {
                                if (var14.field1460) {
                                    class61.method547(var14.field1477, var15, var14.field1481, var16, var32, 3);
                                } else {
                                    class61.method548(var15, var14.field1477, var32, var14.field1481, var16, 0);
                                }
                            } else if (var14.field1460) {
                                class61.method546(var16, 256 - (var14.field1437 & 255), var14.field1481, var15, var32, false, var14.field1477);
                            } else {
                                class61.method549(256 - (var14.field1437 & 255), var14.field1477, var16, this.field487, var15, var32, var14.field1481);
                            }
                        } else if (var14.field1487 == 4) {
                            class53 var33 = var14.field1455;
                            String var34 = var14.field1490;
                            boolean var35 = false;
                            if (this.field238 == var14.field1452 || this.field136 == var14.field1452 || this.field416 == var14.field1452) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method86(var14, -901)) {
                                var36 = var14.field1448;
                                if (var35 && var14.field1475 != 0) {
                                    var36 = var14.field1475;
                                }
                                if (var14.field1453.length() > 0) {
                                    var34 = var14.field1453;
                                }
                            } else {
                                var36 = var14.field1470;
                                if (var35 && var14.field1428 != 0) {
                                    var36 = var14.field1428;
                                }
                            }
                            if (var14.field1469 == 6 && this.field380) {
                                var34 = "Please wait...";
                                var36 = var14.field1470;
                            }
                            if (class61.field1499 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1247 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method41(3255, this.method21(4, var14, (byte) -15)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method41(3255, this.method21(3, var14, (byte) -15)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method41(3255, this.method21(2, var14, (byte) -15)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method41(3255, this.method21(1, var14, (byte) -15)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method41(3255, this.method21(0, var14, (byte) -15)) + var34.substring(var38 + 2);
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
                                if (var14.field1420) {
                                    var33.method436(var37, var36, this.field345, var44, var14.field1488, var14.field1477 / 2 + var15);
                                } else {
                                    var33.method443(var36, var14.field1488, (byte) -11, var37, var15, var44);
                                }
                                var37 += var33.field1247;
                            }
                        } else if (var14.field1487 == 5) {
                            class13 var45;
                            if (this.method86(var14, -901)) {
                                var45 = var14.field1480;
                            } else {
                                var45 = var14.field1461;
                            }
                            if (var45 != null) {
                                var45.method185(3, var16, var15);
                            }
                        } else if (var14.field1487 == 6) {
                            int var46 = class72.field1741;
                            int var47 = class72.field1742;
                            class72.field1741 = var14.field1477 / 2 + var15;
                            class72.field1742 = var14.field1481 / 2 + var16;
                            int var48 = class72.field1745[var14.field1435] * var14.field1434 >> 16;
                            int var49 = class72.field1746[var14.field1435] * var14.field1434 >> 16;
                            boolean var50 = this.method86(var14, -901);
                            int var51;
                            if (var50) {
                                var51 = var14.field1442;
                            } else {
                                var51 = var14.field1441;
                            }
                            class22 var52;
                            if (var51 == -1) {
                                var52 = var14.method536(-1, (byte) -48, var50, -1);
                            } else {
                                class27 var53 = class27.field923[var51];
                                var52 = var14.method536(var53.field926[var14.field1449], (byte) -48, var50, var53.field925[var14.field1449]);
                            }
                            if (var52 != null) {
                                var52.method233(0, var14.field1436, 0, var14.field1435, 0, var48, var49);
                            }
                            class72.field1741 = var46;
                            class72.field1742 = var47;
                        } else {
                            if (var14.field1487 == 7) {
                                class53 var54 = var14.field1455;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1481; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1477; ++var57) {
                                        if (var14.field1415[var55] > 0) {
                                            class58 var58 = class58.method520(var14.field1415[var55] - 1);
                                            String var59 = String.valueOf(var58.field1378);
                                            if (var58.field1388 || var14.field1439[var55] != 1) {
                                                var59 = var59 + " x" + method77(var14.field1439[var55], false);
                                            }
                                            int var60 = (var14.field1476 + 115) * var57 + var15;
                                            int var61 = (var14.field1463 + 12) * var56 + var16;
                                            if (var14.field1420) {
                                                var54.method436(var61, var14.field1470, this.field345, var59, var14.field1488, var14.field1477 / 2 + var60);
                                            } else {
                                                var54.method443(var14.field1470, var14.field1488, (byte) -11, var61, var60, var59);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1487 == 8 && (this.field334 == var14.field1452 || this.field240 == var14.field1452 || this.field495 == var14.field1452) && this.field510 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class53 var64 = this.field403;
                                String var65 = var14.field1490;
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
                                    int var74 = var64.method437(8, var73);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1247 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1477 + var15 - 5 - var62;
                                int var67 = var14.field1481 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg3.field1477 + arg0) {
                                    var66 = arg3.field1477 + arg0 - var62;
                                }
                                if (var63 + var67 > arg3.field1481 + arg4) {
                                    var67 = arg3.field1481 + arg4 - var63;
                                }
                                class61.method547(var62, var66, var63, var67, 16777120, 3);
                                class61.method548(var66, var62, 0, var63, var67, 0);
                                String var68 = var14.field1490;
                                int var69 = var64.field1247 + var67 + 2;
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
                                    var64.method443(0, false, (byte) -11, var69, var66 + 3, var71);
                                    var69 += var64.field1247 + 1;
                                }
                            }
                        }
                    }
                }
                class61.method544(var7, 0, var8, var6, var9);
                if (arg1 >= 0) {
                    this.field149 = this.field530.method339();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method122(boolean arg0, int arg1) {
        if (field419.field1559 >> 7 == this.field422 && field419.field1560 >> 7 == this.field423) {
            this.field422 = 0;
        }
        int var3 = this.field444;
        if (arg1 < 4 || arg1 > 4) {
            this.field382 = null;
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class65 var5;
            int var6;
            if (arg0) {
                var5 = field419;
                var6 = this.field442 << 14;
            } else {
                var5 = this.field443[this.field445[var4]];
                var6 = this.field445[var4] << 14;
            }
            if (var5 != null && var5.method166(9382)) {
                var5.field1617 = false;
                if ((field183 && this.field444 > 50 || this.field444 > 200) && !arg0 && var5.field1579 == var5.field1540) {
                    var5.field1617 = true;
                }
                int var7 = var5.field1559 >> 7;
                int var8 = var5.field1560 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1597 != null && field567 >= var5.field1601 && field567 < var5.field1602) {
                        var5.field1617 = false;
                        var5.field1591 = this.method69(var5.field1559, this.field556, var5.field1560, (byte) 117);
                        this.field196.method470(var5.field1561, this.field556, var5.field1559, var6, var5.field1607, var5, 0, var5.field1606, var5.field1605, 60, var5.field1591, var5.field1608, var5.field1560);
                    } else {
                        if ((var5.field1559 & 127) == 64 && (var5.field1560 & 127) == 64) {
                            if (this.field478[var7][var8] == this.field121) {
                                continue;
                            }
                            this.field478[var7][var8] = this.field121;
                        }
                        var5.field1591 = this.method69(var5.field1559, this.field556, var5.field1560, (byte) 117);
                        this.field196.method469(var5, var5.field1559, var6, var5.field1591, var5.field1561, 60, var5.field1590, this.field556, var5.field1560, (byte) 4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method123(int arg0) {
        int var2 = this.field505 * 128 + 64;
        int var3 = this.field506 * 128 + 64;
        int var4 = this.method69(var2, this.field556, var3, (byte) 117) - this.field507;
        if (this.field137 < var2) {
            this.field137 += (var2 - this.field137) * this.field509 / 1000 + this.field508;
            if (this.field137 > var2) {
                this.field137 = var2;
            }
        }
        if (this.field137 > var2) {
            this.field137 -= (this.field137 - var2) * this.field509 / 1000 + this.field508;
            if (this.field137 < var2) {
                this.field137 = var2;
            }
        }
        if (this.field138 < var4) {
            this.field138 += (var4 - this.field138) * this.field509 / 1000 + this.field508;
            if (this.field138 > var4) {
                this.field138 = var4;
            }
        }
        if (this.field138 > var4) {
            this.field138 -= (this.field138 - var4) * this.field509 / 1000 + this.field508;
            if (this.field138 < var4) {
                this.field138 = var4;
            }
        }
        if (this.field139 < var3) {
            this.field139 += (var3 - this.field139) * this.field509 / 1000 + this.field508;
            if (this.field139 > var3) {
                this.field139 = var3;
            }
        }
        if (this.field139 > var3) {
            this.field139 -= (this.field139 - var3) * this.field509 / 1000 + this.field508;
            if (this.field139 < var3) {
                this.field139 = var3;
            }
        }
        int var5 = this.field319 * 128 + 64;
        int var6 = this.field320 * 128 + 64;
        if (arg0 <= 0) {
            this.method132();
        }
        int var7 = this.method69(var5, this.field556, var6, (byte) 117) - this.field321;
        int var8 = var5 - this.field137;
        int var9 = var7 - this.field138;
        int var10 = var6 - this.field139;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field140 < var12) {
            this.field140 += (var12 - this.field140) * this.field323 / 1000 + this.field322;
            if (this.field140 > var12) {
                this.field140 = var12;
            }
        }
        if (this.field140 > var12) {
            this.field140 -= (this.field140 - var12) * this.field323 / 1000 + this.field322;
            if (this.field140 < var12) {
                this.field140 = var12;
            }
        }
        int var14 = var13 - this.field141;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field141 += this.field323 * var14 / 1000 + this.field322;
            this.field141 &= 2047;
        }
        if (var14 < 0) {
            this.field141 -= -var14 * this.field323 / 1000 + this.field322;
            this.field141 &= 2047;
        }
        int var15 = var13 - this.field141;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field141 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 != -42795) {
            this.field345 = 134;
        }
        if (super.field623 == 1) {
            if (super.field624 >= 6 && super.field624 <= 106 && super.field625 >= 467 && super.field625 <= 499) {
                this.field451 = (this.field451 + 1) % 4;
                this.field571 = true;
                this.field570 = true;
                this.field366.method328(-818, 56);
                this.field366.method329(this.field451);
                this.field366.method329(this.field167);
                this.field366.method329(this.field294);
            }
            if (super.field624 >= 135 && super.field624 <= 235 && super.field625 >= 467 && super.field625 <= 499) {
                this.field167 = (this.field167 + 1) % 3;
                this.field571 = true;
                this.field570 = true;
                this.field366.method328(-818, 56);
                this.field366.method329(this.field451);
                this.field366.method329(this.field167);
                this.field366.method329(this.field294);
            }
            if (super.field624 >= 273 && super.field624 <= 373 && super.field625 >= 467 && super.field625 <= 499) {
                this.field294 = (this.field294 + 1) % 3;
                this.field571 = true;
                this.field570 = true;
                this.field366.method328(-818, 56);
                this.field366.method329(this.field451);
                this.field366.method329(this.field167);
                this.field366.method329(this.field294);
            }
            if (super.field624 >= 412 && super.field624 <= 512 && super.field625 >= 467 && super.field625 <= 499) {
                if (this.field351 == -1) {
                    this.method162(false);
                    this.field170 = "";
                    this.field194 = false;
                    this.field278 = this.field351 = class60.field1457;
                    return;
                }
                this.method67("", false, 0, "Please close the interface you have open before using 'report abuse'");
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method125(int arg0) {
        if (arg0 >= 0) {
            this.field460 = 473;
        }
        try {
            int var2 = field419.field1559 + this.field224;
            int var3 = field419.field1560 + this.field254;
            if (this.field102 - var2 < -500 || this.field102 - var2 > 500 || this.field103 - var3 < -500 || this.field103 - var3 > 500) {
                this.field102 = var2;
                this.field103 = var3;
            }
            if (this.field102 != var2) {
                this.field102 += (var2 - this.field102) / 16;
            }
            if (this.field103 != var3) {
                this.field103 += (var3 - this.field103) / 16;
            }
            if (super.field627[1] == 1) {
                this.field309 += (-24 - this.field309) / 2;
            } else if (super.field627[2] == 1) {
                this.field309 += (24 - this.field309) / 2;
            } else {
                this.field309 /= 2;
            }
            if (super.field627[3] == 1) {
                this.field310 += (12 - this.field310) / 2;
            } else if (super.field627[4] == 1) {
                this.field310 += (-12 - this.field310) / 2;
            } else {
                this.field310 /= 2;
            }
            this.field308 = this.field309 / 2 + this.field308 & 2047;
            this.field307 += this.field310 / 2;
            if (this.field307 < 128) {
                this.field307 = 128;
            }
            if (this.field307 > 383) {
                this.field307 = 383;
            }
            int var4 = this.field102 >> 7;
            int var5 = this.field103 >> 7;
            int var6 = this.method69(this.field102, this.field556, this.field103, (byte) 117);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field556;
                        if (var10 < 3 && (this.field512[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field439[var10][var8][var9];
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
            if (var12 > this.field367) {
                this.field367 += (var12 - this.field367) / 24;
            } else if (var12 < this.field367) {
                this.field367 += (var12 - this.field367) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field419.field1559 + "," + field419.field1560 + "," + this.field102 + "," + this.field103 + "," + this.field292 + "," + this.field293 + "," + this.field287 + "," + this.field288);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILVGGOSQRK;IIII)V")
    public final void method126(int arg0, int arg1, int arg2, class60 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3.field1487 == 0 && arg3.field1430 != null && !arg3.field1451) {
            if (arg0 >= arg1 && arg6 >= arg4 && arg0 <= arg3.field1477 + arg1 && arg6 <= arg3.field1481 + arg4) {
                int var9 = arg3.field1430.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg3.field1454[var10] + arg1;
                    int var12 = arg3.field1438[var10] + arg4 - arg5;
                    class60 var13 = class60.method538(arg3.field1430[var10]);
                    int var14 = var13.field1478 + var11;
                    int var15 = var13.field1433 + var12;
                    if ((var13.field1472 >= 0 || var13.field1428 != 0) && arg0 >= var14 && arg6 >= var15 && arg0 < var13.field1477 + var14 && arg6 < var13.field1481 + var15) {
                        if (var13.field1472 >= 0) {
                            this.field433 = var13.field1472;
                        } else {
                            this.field433 = var13.field1452;
                        }
                    }
                    if (var13.field1487 == 8 && arg0 >= var14 && arg6 >= var15 && arg0 < var13.field1477 + var14 && arg6 < var13.field1481 + var15) {
                        this.field450 = var13.field1452;
                    }
                    if (var13.field1487 == 0) {
                        this.method126(arg0, var14, arg2, var13, var15, var13.field1440, arg6, 9);
                        if (var13.field1482 > var13.field1481) {
                            this.method144(-184, var13, var15, arg6, var13.field1482, var13.field1477 + var14, var13.field1481, arg0, arg2);
                        }
                    } else {
                        if (var13.field1469 == 1 && arg0 >= var14 && arg6 >= var15 && arg0 < var13.field1477 + var14 && arg6 < var13.field1481 + var15) {
                            boolean var16 = false;
                            if (var13.field1423 != 0) {
                                var16 = this.method155(this.field257, var13);
                            }
                            if (!var16) {
                                this.field385[this.field259] = var13.field1424;
                                this.field561[this.field259] = 455;
                                this.field560[this.field259] = var13.field1452;
                                ++this.field259;
                            }
                        }
                        if (var13.field1469 == 2 && this.field464 == 0 && arg0 >= var14 && arg6 >= var15 && arg0 < var13.field1477 + var14 && arg6 < var13.field1481 + var15) {
                            String var17 = var13.field1484;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field385[this.field259] = var17 + " @gre@" + var13.field1466;
                            this.field561[this.field259] = 246;
                            this.field560[this.field259] = var13.field1452;
                            ++this.field259;
                        }
                        if (var13.field1469 == 3 && arg0 >= var14 && arg6 >= var15 && arg0 < var13.field1477 + var14 && arg6 < var13.field1481 + var15) {
                            this.field385[this.field259] = "Close";
                            if (arg2 == 3) {
                                this.field561[this.field259] = 405;
                            } else {
                                this.field561[this.field259] = 990;
                            }
                            this.field560[this.field259] = var13.field1452;
                            ++this.field259;
                        }
                        if (var13.field1469 == 4 && arg0 >= var14 && arg6 >= var15 && arg0 < var13.field1477 + var14 && arg6 < var13.field1481 + var15) {
                            this.field385[this.field259] = var13.field1424;
                            this.field561[this.field259] = 523;
                            this.field560[this.field259] = var13.field1452;
                            ++this.field259;
                        }
                        if (var13.field1469 == 5 && arg0 >= var14 && arg6 >= var15 && arg0 < var13.field1477 + var14 && arg6 < var13.field1481 + var15) {
                            this.field385[this.field259] = var13.field1424;
                            this.field561[this.field259] = 883;
                            this.field560[this.field259] = var13.field1452;
                            ++this.field259;
                        }
                        if (var13.field1469 == 6 && !this.field380 && arg0 >= var14 && arg6 >= var15 && arg0 < var13.field1477 + var14 && arg6 < var13.field1481 + var15) {
                            this.field385[this.field259] = var13.field1424;
                            this.field561[this.field259] = 149;
                            this.field560[this.field259] = var13.field1452;
                            ++this.field259;
                        }
                        if (var13.field1487 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1481; ++var19) {
                                for (int var20 = 0; var20 < var13.field1477; ++var20) {
                                    int var21 = (var13.field1476 + 32) * var20 + var14;
                                    int var22 = (var13.field1463 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1443[var18];
                                        var22 += var13.field1426[var18];
                                    }
                                    if (arg0 >= var21 && arg6 >= var22 && arg0 < var21 + 32 && arg6 < var22 + 32) {
                                        this.field303 = var18;
                                        this.field304 = var13.field1452;
                                        if (var13.field1415[var18] > 0) {
                                            class58 var23 = class58.method520(var13.field1415[var18] - 1);
                                            if (this.field184 == 1 && var13.field1473) {
                                                if (this.field186 != var13.field1452 || this.field185 != var18) {
                                                    this.field385[this.field259] = "Use " + this.field188 + " with @lre@" + var23.field1378;
                                                    this.field561[this.field259] = 835;
                                                    this.field562[this.field259] = var23.field1352;
                                                    this.field559[this.field259] = var18;
                                                    this.field560[this.field259] = var13.field1452;
                                                    ++this.field259;
                                                }
                                            } else if (this.field464 == 1 && var13.field1473) {
                                                if ((this.field466 & 16) == 16) {
                                                    this.field385[this.field259] = this.field467 + " @lre@" + var23.field1378;
                                                    this.field561[this.field259] = 632;
                                                    this.field562[this.field259] = var23.field1352;
                                                    this.field559[this.field259] = var18;
                                                    this.field560[this.field259] = var13.field1452;
                                                    ++this.field259;
                                                }
                                            } else {
                                                if (var13.field1473) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1374 != null && var23.field1374[var24] != null) {
                                                            this.field385[this.field259] = var23.field1374[var24] + " @lre@" + var23.field1378;
                                                            if (var24 == 3) {
                                                                this.field561[this.field259] = 675;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field561[this.field259] = 393;
                                                            }
                                                            this.field562[this.field259] = var23.field1352;
                                                            this.field559[this.field259] = var18;
                                                            this.field560[this.field259] = var13.field1452;
                                                            ++this.field259;
                                                        } else if (var24 == 4) {
                                                            this.field385[this.field259] = "Drop @lre@" + var23.field1378;
                                                            this.field561[this.field259] = 393;
                                                            this.field562[this.field259] = var23.field1352;
                                                            this.field559[this.field259] = var18;
                                                            this.field560[this.field259] = var13.field1452;
                                                            ++this.field259;
                                                        }
                                                    }
                                                }
                                                if (var13.field1458) {
                                                    this.field385[this.field259] = "Use @lre@" + var23.field1378;
                                                    this.field561[this.field259] = 871;
                                                    this.field562[this.field259] = var23.field1352;
                                                    this.field559[this.field259] = var18;
                                                    this.field560[this.field259] = var13.field1452;
                                                    ++this.field259;
                                                }
                                                if (var13.field1473 && var23.field1374 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1374[var25] != null) {
                                                            this.field385[this.field259] = var23.field1374[var25] + " @lre@" + var23.field1378;
                                                            if (var25 == 0) {
                                                                this.field561[this.field259] = 504;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field561[this.field259] = 486;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field561[this.field259] = 18;
                                                            }
                                                            this.field562[this.field259] = var23.field1352;
                                                            this.field559[this.field259] = var18;
                                                            this.field560[this.field259] = var13.field1452;
                                                            ++this.field259;
                                                        }
                                                    }
                                                }
                                                if (var13.field1418 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1418[var26] != null) {
                                                            this.field385[this.field259] = var13.field1418[var26] + " @lre@" + var23.field1378;
                                                            if (var26 == 0) {
                                                                this.field561[this.field259] = 236;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field561[this.field259] = 29;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field561[this.field259] = 651;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field561[this.field259] = 605;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field561[this.field259] = 490;
                                                            }
                                                            this.field562[this.field259] = var23.field1352;
                                                            this.field559[this.field259] = var18;
                                                            this.field560[this.field259] = var13.field1452;
                                                            ++this.field259;
                                                        }
                                                    }
                                                }
                                                this.field385[this.field259] = "Examine @lre@" + var23.field1378;
                                                this.field561[this.field259] = 1910;
                                                this.field562[this.field259] = var23.field1352;
                                                this.field559[this.field259] = var18;
                                                this.field560[this.field259] = var13.field1452;
                                                ++this.field259;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
                if (arg7 < 9 || arg7 > 9) {
                    this.field382 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)Ljava/lang/String;")
    public final String method127(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field612 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method128(boolean arg0) {
        for (int var2 = 0; var2 < this.field453; ++var2) {
            if (this.field373[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field197[var2] == this.field480 && this.field491[var2] == this.field326) {
                        if (!this.method52(2)) {
                            var3 = true;
                        }
                    } else {
                        class36 var4 = class30.method259(this.field197[var2], this.field491[var2], false);
                        if (System.currentTimeMillis() + (long) (var4.field1072 / 22) > (long) (this.field503 / 22) + this.field249) {
                            this.field503 = var4.field1072;
                            this.field249 = System.currentTimeMillis();
                            if (this.method68(var4.field1072, var4.field1071, 0)) {
                                this.field480 = this.field197[var2];
                                this.field326 = this.field491[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field366.method328(-818, 111);
                        this.field366.method330(this.field197[var2] & 32767);
                    } else {
                        this.field366.method328(-818, 111);
                        this.field366.method330(-1);
                    }
                }
                if (var3 && this.field373[var2] != -5) {
                    this.field373[var2] = -5;
                } else {
                    --this.field453;
                    for (int var6 = var2; var6 < this.field453; ++var6) {
                        this.field197[var6] = this.field197[var6 + 1];
                        this.field491[var6] = this.field491[var6 + 1];
                        this.field373[var6] = this.field373[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field373[var2]--;
            }
        }
        if (arg0) {
            this.field345 = this.field486.method241();
        }
        if (this.field87 > 0) {
            this.field87 -= 20;
            if (this.field87 < 0) {
                this.field87 = 0;
            }
            if (this.field87 == 0 && this.field179 && !field183) {
                this.field518 = this.field146;
                this.field519 = true;
                this.field440.method306(2, this.field518);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILNQUAUMDT;)V")
    private final void method129(int arg0, int arg1, class36 arg2) {
        while (true) {
            if (arg2.field1073 + 21 < arg0 * 8) {
                int var4 = arg2.method350(739, 14);
                if (var4 != 16383) {
                    if (this.field164[var4] == null) {
                        this.field164[var4] = new class8();
                    }
                    class8 var5 = this.field164[var4];
                    this.field166[this.field165++] = var4;
                    var5.field1581 = field567;
                    int var6 = arg2.method350(739, 1);
                    if (var6 == 1) {
                        this.field447[this.field446++] = var4;
                    }
                    int var7 = arg2.method350(739, 1);
                    int var8 = arg2.method350(739, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg2.method350(739, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field594 = class2.method10(arg2.method350(739, 13));
                    var5.field1544 = var5.field594.field11;
                    var5.field1543 = var5.field594.field9;
                    var5.field1550 = var5.field594.field38;
                    var5.field1551 = var5.field594.field48;
                    var5.field1552 = var5.field594.field41;
                    var5.field1553 = var5.field594.field27;
                    var5.field1579 = var5.field594.field31;
                    var5.method556(field419.field1570[0] + var9, field419.field1569[0] + var8, this.field91, var7 == 1);
                    continue;
                }
            }
            arg2.method351(this.field203);
            int var10000 = arg0 + arg1;
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
    public final boolean method130(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        if (arg2 != 48241) {
            throw new NullPointerException();
        } else {
            int var6 = this.field196.method488(this.field556, arg1, arg3, arg0);
            if (var6 == -1) {
                return false;
            } else {
                int var7 = var6 & 31;
                int var8 = var6 >> 6 & 3;
                if (var7 != 10 && var7 != 11 && var7 != 22) {
                    this.method156(var8, 0, arg3, 0, field419.field1570[0], 0, arg1, var7 + 1, false, 0, 2, field419.field1569[0]);
                } else {
                    class25 var9 = class25.method249(var5);
                    int var10;
                    int var11;
                    if (var8 != 0 && var8 != 2) {
                        var10 = var9.field853;
                        var11 = var9.field896;
                    } else {
                        var10 = var9.field896;
                        var11 = var9.field853;
                    }
                    int var12 = var9.field856;
                    if (var8 != 0) {
                        var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                    }
                    this.method156(0, var10, arg3, var12, field419.field1570[0], var11, arg1, 0, false, 0, 2, field419.field1569[0]);
                }
                this.field550 = super.field624;
                this.field551 = super.field625;
                this.field553 = 2;
                this.field552 = 0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLNQUAUMDT;)V")
    private final void method131(int arg0, boolean arg1, class36 arg2) {
        arg2.method349(-31487);
        int var4 = arg2.method350(739, 1);
        if (arg1) {
            this.field149 = arg2.method339();
        }
        if (var4 != 0) {
            int var5 = arg2.method350(739, 2);
            if (var5 == 0) {
                this.field447[this.field446++] = this.field442;
            } else if (var5 == 1) {
                int var6 = arg2.method350(739, 3);
                field419.method554(false, (byte) -118, var6);
                int var7 = arg2.method350(739, 1);
                if (var7 == 1) {
                    this.field447[this.field446++] = this.field442;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method350(739, 3);
                field419.method554(true, (byte) -118, var8);
                int var9 = arg2.method350(739, 3);
                field419.method554(true, (byte) -118, var9);
                int var10 = arg2.method350(739, 1);
                if (var10 == 1) {
                    this.field447[this.field446++] = this.field442;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method350(739, 1);
                int var12 = arg2.method350(739, 7);
                int var13 = arg2.method350(739, 7);
                int var14 = arg2.method350(739, 1);
                if (var14 == 1) {
                    this.field447[this.field446++] = this.field442;
                }
                this.field556 = arg2.method350(739, 2);
                field419.method556(var13, var12, this.field91, var11 == 1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method132() {
        this.method101(field392, 20, "Starting up");
        if (signlink.sunjava) {
            super.field603 = 5;
        }
        if (field283) {
            this.field280 = true;
        } else {
            field283 = true;
            boolean var1 = false;
            String var2 = this.method127(false);
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
                this.field502 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field172[var3] = new class1(signlink.cache_dat, var3 + 1, 500000, signlink.cache_idx[var3], field274);
                    }
                }
                try {
                    this.method83(793);
                    this.field282 = this.method58("title screen", "title", 1, true, 25, this.field120[1]);
                    this.field402 = new class53(this.field282, false, (byte) 8, "p11_full");
                    this.field403 = new class53(this.field282, false, (byte) 8, "p12_full");
                    this.field404 = new class53(this.field282, false, (byte) 8, "b12_full");
                    this.field405 = new class53(this.field282, true, (byte) 8, "q8_full");
                    this.method97(false);
                    this.method51(false);
                    class49 var4 = this.method58("config", "config", 2, true, 30, this.field120[2]);
                    class49 var5 = this.method58("interface", "interface", 3, true, 35, this.field120[3]);
                    class49 var6 = this.method58("2d graphics", "media", 4, true, 40, this.field120[4]);
                    class49 var7 = this.method58("textures", "textures", 6, true, 45, this.field120[6]);
                    class49 var8 = this.method58("chat system", "wordenc", 7, true, 50, this.field120[7]);
                    class49 var9 = this.method58("sound effects", "sounds", 8, true, 55, this.field120[8]);
                    this.field512 = new byte[4][104][104];
                    this.field439 = new int[4][105][105];
                    this.field196 = new class56(443, 104, 104, this.field439, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field547[var10] = new class67(104, false, 104);
                    }
                    this.field424 = new class13(512, 512);
                    class49 var11 = this.method58("update list", "versionlist", 5, true, 60, this.field120[5]);
                    this.method101(field392, 60, "Connecting to update server");
                    this.field440 = new class34();
                    this.field440.method316(var11, this);
                    class69.method575(this.field440.method315((byte) 113));
                    class22.method209(this.field440.method325(0, 0), this.field440);
                    if (!field183) {
                        this.field518 = 0;
                        this.field519 = true;
                        this.field440.method306(2, this.field518);
                        while (this.field440.method305() > 0) {
                            this.method75(field339);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field440.field1006 > 3) {
                                this.method70("ondemand");
                                return;
                            }
                        }
                    }
                    this.method101(field392, 65, "Requesting animations");
                    int var12 = this.field440.method325(0, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field440.method306(1, var13);
                    }
                    while (this.field440.method305() > 0) {
                        int var14 = var12 - this.field440.method305();
                        if (var14 > 0) {
                            this.method101(field392, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method75(field339);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field440.field1006 > 3) {
                            this.method70("ondemand");
                            return;
                        }
                    }
                    this.method101(field392, 70, "Requesting models");
                    int var15 = this.field440.method325(0, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field440.method307(973, var16);
                        if ((var17 & 1) != 0) {
                            this.field440.method306(0, var16);
                        }
                    }
                    int var18 = this.field440.method305();
                    while (this.field440.method305() > 0) {
                        int var19 = var18 - this.field440.method305();
                        if (var19 > 0) {
                            this.method101(field392, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method75(field339);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field172[0] != null) {
                        this.method101(field392, 75, "Requesting maps");
                        this.field440.method306(3, this.field440.method310(0, 48, 47, 1));
                        this.field440.method306(3, this.field440.method310(1, 48, 47, 1));
                        this.field440.method306(3, this.field440.method310(0, 48, 48, 1));
                        this.field440.method306(3, this.field440.method310(1, 48, 48, 1));
                        this.field440.method306(3, this.field440.method310(0, 48, 49, 1));
                        this.field440.method306(3, this.field440.method310(1, 48, 49, 1));
                        this.field440.method306(3, this.field440.method310(0, 47, 47, 1));
                        this.field440.method306(3, this.field440.method310(1, 47, 47, 1));
                        this.field440.method306(3, this.field440.method310(0, 47, 48, 1));
                        this.field440.method306(3, this.field440.method310(1, 47, 48, 1));
                        this.field440.method306(3, this.field440.method310(0, 148, 48, 1));
                        this.field440.method306(3, this.field440.method310(1, 148, 48, 1));
                        int var20 = this.field440.method305();
                        while (this.field440.method305() > 0) {
                            int var21 = var20 - this.field440.method305();
                            if (var21 > 0) {
                                this.method101(field392, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method75(field339);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field440.method325(0, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field440.method307(973, var23);
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
                            this.field440.method322(0, var25, (byte) 2, var23);
                        }
                    }
                    this.field440.method320(field182, false);
                    if (!field183) {
                        int var26 = this.field440.method325(0, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field440.method311(var27, 19296)) {
                                this.field440.method322(2, (byte) 1, (byte) 2, var27);
                            }
                        }
                    }
                    this.method101(field392, 80, "Unpacking media");
                    this.field436 = new class59(var6, "invback", 0);
                    this.field438 = new class59(var6, "chatback", 0);
                    this.field437 = new class59(var6, "mapback", 0);
                    this.field496 = new class59(var6, "backbase1", 0);
                    this.field497 = new class59(var6, "backbase2", 0);
                    this.field498 = new class59(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field295[var28] = new class59(var6, "sideicons", var28);
                    }
                    this.field161 = new class13(var6, "compass", 0);
                    this.field418 = new class13(var6, "mapedge", 0);
                    this.field418.method182(578);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field471[var29] = new class59(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field488[var30] = new class13(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field100[var31] = new class13(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field538[var32] = new class13(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field128[var33] = new class13(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field542[var34] = new class13(var6, "headicons_hint", var34);
                    }
                    this.field371 = new class13(var6, "overlay_multiway", 0);
                    this.field134 = new class13(var6, "mapmarker", 0);
                    this.field135 = new class13(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field452[var35] = new class13(var6, "cross", var35);
                    }
                    this.field521 = new class13(var6, "mapdots", 0);
                    this.field522 = new class13(var6, "mapdots", 1);
                    this.field523 = new class13(var6, "mapdots", 2);
                    this.field524 = new class13(var6, "mapdots", 3);
                    this.field525 = new class13(var6, "mapdots", 4);
                    this.field431 = new class59(var6, "scrollbar", 0);
                    this.field432 = new class59(var6, "scrollbar", 1);
                    this.field214 = new class59(var6, "redstone1", 0);
                    this.field215 = new class59(var6, "redstone2", 0);
                    this.field216 = new class59(var6, "redstone3", 0);
                    this.field217 = new class59(var6, "redstone1", 0);
                    this.field217.method527(false);
                    this.field218 = new class59(var6, "redstone2", 0);
                    this.field218.method527(false);
                    this.field174 = new class59(var6, "redstone1", 0);
                    this.field174.method528(true);
                    this.field175 = new class59(var6, "redstone2", 0);
                    this.field175.method528(true);
                    this.field176 = new class59(var6, "redstone3", 0);
                    this.field176.method528(true);
                    this.field177 = new class59(var6, "redstone1", 0);
                    this.field177.method527(false);
                    this.field177.method528(true);
                    this.field178 = new class59(var6, "redstone2", 0);
                    this.field178.method527(false);
                    this.field178.method528(true);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field352[var36] = new class59(var6, "mod_icons", var36);
                    }
                    class13 var37 = new class13(var6, "backleft1", 0);
                    this.field407 = new class10(var37.field666, var37.field665, this.method73(0), (byte) 0);
                    var37.method183(0, (byte) 0, 0);
                    class13 var38 = new class13(var6, "backleft2", 0);
                    this.field408 = new class10(var38.field666, var38.field665, this.method73(0), (byte) 0);
                    var38.method183(0, (byte) 0, 0);
                    class13 var39 = new class13(var6, "backright1", 0);
                    this.field409 = new class10(var39.field666, var39.field665, this.method73(0), (byte) 0);
                    var39.method183(0, (byte) 0, 0);
                    class13 var40 = new class13(var6, "backright2", 0);
                    this.field410 = new class10(var40.field666, var40.field665, this.method73(0), (byte) 0);
                    var40.method183(0, (byte) 0, 0);
                    class13 var41 = new class13(var6, "backtop1", 0);
                    this.field411 = new class10(var41.field666, var41.field665, this.method73(0), (byte) 0);
                    var41.method183(0, (byte) 0, 0);
                    class13 var42 = new class13(var6, "backvmid1", 0);
                    this.field412 = new class10(var42.field666, var42.field665, this.method73(0), (byte) 0);
                    var42.method183(0, (byte) 0, 0);
                    class13 var43 = new class13(var6, "backvmid2", 0);
                    this.field413 = new class10(var43.field666, var43.field665, this.method73(0), (byte) 0);
                    var43.method183(0, (byte) 0, 0);
                    class13 var44 = new class13(var6, "backvmid3", 0);
                    this.field414 = new class10(var44.field666, var44.field665, this.method73(0), (byte) 0);
                    var44.method183(0, (byte) 0, 0);
                    class13 var45 = new class13(var6, "backhmid2", 0);
                    this.field415 = new class10(var45.field666, var45.field665, this.method73(0), (byte) 0);
                    var45.method183(0, (byte) 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field488[var50] != null) {
                            this.field488[var50].method181(var48 + var49, 568, var47 + var49, var46 + var49);
                        }
                        if (this.field471[var50] != null) {
                            this.field471[var50].method529(var48 + var49, 568, var47 + var49, var46 + var49);
                        }
                    }
                    this.method101(field392, 83, "Unpacking textures");
                    class72.method593(var7, 2);
                    class72.method597((byte) 5, 0.8D);
                    class72.method592(-16628, 20);
                    this.method101(field392, 86, "Unpacking config");
                    class27.method255(var4, -332);
                    class25.method251(var4);
                    class43.method416(var4, -332);
                    class58.method518(var4);
                    class2.method9(var4);
                    class54.method450(var4, -332);
                    class41.method412(var4, -332);
                    class17.method205(var4, -332);
                    class23.method239(var4, -332);
                    class58.field1365 = field182;
                    if (!field183) {
                        this.method101(field392, 90, "Unpacking sounds");
                        byte[] var51 = var9.method427("sounds.dat", (byte[]) null);
                        class36 var52 = new class36(-587, var51);
                        class30.method258(var52, -332);
                    }
                    this.method101(field392, 95, "Unpacking interfaces");
                    class53[] var53 = new class53[] { this.field402, this.field403, this.field404, this.field405 };
                    class60.method535(223, var53, var6, var5);
                    this.method101(field392, 100, "Preparing game engine");
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field437.field1407[this.field437.field1409 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field112[var54] = var55;
                        this.field101[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field437.field1407[this.field437.field1409 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field127[var58 - 5] = var59 - 25;
                        this.field99[var58 - 5] = var60 - var59;
                    }
                    class72.method590(503, (byte) -125, 765);
                    this.field534 = class72.field1747;
                    class72.method590(96, (byte) -125, 479);
                    this.field531 = class72.field1747;
                    class72.method590(261, (byte) -125, 190);
                    this.field532 = class72.field1747;
                    class72.method590(334, (byte) -125, 512);
                    this.field533 = class72.field1747;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class72.field1745[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class56.method494(334, false, var62, 500, 512, 800);
                    class33.method267(var8);
                    this.field262 = new class48(this, (byte) -88);
                    this.method142(this.field262, 10);
                    class21.field743 = this;
                    class25.field873 = this;
                    class2.field10 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field90 + " " + this.field236);
                    this.field213 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field431.method530(3, arg5, arg2);
        this.field432.method530(3, arg4 + arg5 - 16, arg2);
        class61.method547(16, arg2, arg4 - 32, arg5 + 16, this.field195, 3);
        int var7 = (arg4 - 32) * arg4 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg4 - 32 - var7) * arg3 / (arg1 - arg4);
        class61.method547(16, arg2, var7, arg5 + 16 + var8, this.field296, 3);
        if (arg0 < this.field346 || arg0 > this.field346) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        class61.method552(arg2, 12021, arg5 + 16 + var8, this.field258, var7);
        class61.method552(arg2 + 1, 12021, arg5 + 16 + var8, this.field258, var7);
        class61.method550(this.field258, 0, arg5 + 16 + var8, arg2, 16);
        class61.method550(this.field258, 0, arg5 + 17 + var8, arg2, 16);
        class61.method552(arg2 + 15, 12021, arg5 + 16 + var8, this.field122, var7);
        class61.method552(arg2 + 14, 12021, arg5 + 17 + var8, this.field122, var7 - 1);
        class61.method550(this.field122, 0, arg5 + 15 + var8 + var7, arg2, 16);
        class61.method550(this.field122, 0, arg5 + 14 + var8 + var7, arg2 + 1, 15);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILVGGOSQRK;)V")
    public final void method134(int arg0, class60 arg1) {
        int var3 = arg1.field1423;
        if (arg0 != 32733) {
            this.field482 = 209;
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field251;
                if (this.field252 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field1490 = "";
                    arg1.field1469 = 0;
                } else {
                    if (this.field204[var3] == 0) {
                        arg1.field1490 = "@red@Offline";
                    } else if (this.field204[var3] < 200) {
                        if (this.field204[var3] == field180) {
                            arg1.field1490 = "@gre@World" + (this.field204[var3] - 9);
                        } else {
                            arg1.field1490 = "@yel@World" + (this.field204[var3] - 9);
                        }
                    } else if (this.field204[var3] == field180) {
                        arg1.field1490 = "@gre@Classic" + (this.field204[var3] - 219);
                    } else {
                        arg1.field1490 = "@yel@Classic" + (this.field204[var3] - 219);
                    }
                    arg1.field1469 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field251;
                if (this.field252 != 2) {
                    var6 = 0;
                }
                arg1.field1482 = var6 * 15 + 20;
                if (arg1.field1482 <= arg1.field1481) {
                    arg1.field1482 = arg1.field1481 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field252 == 0) {
                    arg1.field1490 = "Loading ignore list";
                    arg1.field1469 = 0;
                } else if (var3 == 1 && this.field252 == 0) {
                    arg1.field1490 = "Please wait...";
                    arg1.field1469 = 0;
                } else {
                    int var7 = this.field499;
                    if (this.field252 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field1490 = "";
                        arg1.field1469 = 0;
                    } else {
                        arg1.field1490 = class52.method432(4, class52.method429((byte) -53, this.field256[var3]));
                        arg1.field1469 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field1482 = this.field499 * 15 + 20;
                if (arg1.field1482 <= arg1.field1481) {
                    arg1.field1482 = arg1.field1481 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1435 = 150;
                arg1.field1436 = (int) (Math.sin((double) field567 / 40.0D) * 256.0D) & 2047;
                if (this.field153) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field154[var8];
                        if (var15 >= 0 && !class54.field1252[var15].method452((byte) -64)) {
                            return;
                        }
                    }
                    this.field153 = false;
                    class22[] var9 = new class22[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field154[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class54.field1252[var14].method453(false);
                        }
                    }
                    class22 var12 = new class22(var10, 6, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field374[var13] != 0) {
                            var12.method226(field160[var13][0], field160[var13][this.field374[var13]]);
                            if (var13 == 1) {
                                var12.method226(field458[0], field458[this.field374[var13]]);
                            }
                        }
                    }
                    var12.method219(301);
                    var12.method220(true, class27.field923[field419.field1579].field925[0]);
                    var12.method229(64, 850, -30, -50, -30, true);
                    arg1.field1421 = 5;
                    arg1.field1422 = 0;
                    class60.method533(5, var12, 0, true);
                }
            } else if (var3 == 324) {
                if (this.field209 == null) {
                    this.field209 = arg1.field1461;
                    this.field210 = arg1.field1480;
                }
                if (this.field115) {
                    arg1.field1461 = this.field210;
                } else {
                    arg1.field1461 = this.field209;
                }
            } else if (var3 == 325) {
                if (this.field209 == null) {
                    this.field209 = arg1.field1461;
                    this.field210 = arg1.field1480;
                }
                if (this.field115) {
                    arg1.field1461 = this.field209;
                } else {
                    arg1.field1461 = this.field210;
                }
            } else if (var3 == 600) {
                arg1.field1490 = this.field170;
                if (field567 % 20 < 10) {
                    arg1.field1490 = arg1.field1490 + "|";
                } else {
                    arg1.field1490 = arg1.field1490 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field235 >= 1) {
                        if (this.field194) {
                            arg1.field1470 = 16711680;
                            arg1.field1490 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1470 = 16777215;
                            arg1.field1490 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1490 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field369 - this.field260;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg1.field1490 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field305 == 0) {
                        arg1.field1490 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field305 <= this.field369) {
                        arg1.field1490 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method135(this.field305, 2);
                    } else {
                        int var18 = this.field369 + 14 - this.field305;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg1.field1490 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method135(this.field305, 2) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field463 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field463 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field463 + " unread messages";
                    }
                    arg1.field1490 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field253 > 0 && this.field253 <= this.field369 + 10) {
                        arg1.field1490 = "Last password change:\\n@gre@" + this.method135(this.field253, 2);
                    } else {
                        arg1.field1490 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field541 > 2 && !field182) {
                        arg1.field1490 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field541 > 2) {
                        arg1.field1490 = "\\n\\nYou have @gre@" + this.field541 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field541 > 0) {
                        arg1.field1490 = "You have @gre@" + this.field541 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg1.field1490 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field541 > 2 && !field182) {
                        arg1.field1490 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field541 > 0) {
                        arg1.field1490 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg1.field1490 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field305 > this.field369) {
                        arg1.field1490 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg1.field1490 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field252 == 0) {
            arg1.field1490 = "Loading friend list";
            arg1.field1469 = 0;
        } else if (var3 == 1 && this.field252 == 1) {
            arg1.field1490 = "Connecting to friendserver";
            arg1.field1469 = 0;
        } else if (var3 == 2 && this.field252 != 2) {
            arg1.field1490 = "Please wait...";
            arg1.field1469 = 0;
        } else {
            int var4 = this.field251;
            if (this.field252 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field1490 = "";
                arg1.field1469 = 0;
            } else {
                arg1.field1490 = this.field462[var3];
                arg1.field1469 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method135(int arg0, int arg1) {
        if (arg1 < 2 || arg1 > 2) {
            this.field461 = 6;
        }
        if (arg0 > this.field369 + 10) {
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

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 358);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field180 = Integer.parseInt(arg0[0]);
                field181 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method37(2);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method56(true);
                }
                if (arg0[3].equals("free")) {
                    field182 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field182 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method168(765, 503, true);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method136(int arg0) {
        this.field496 = null;
        this.field497 = null;
        this.field498 = null;
        this.field396 = null;
        this.field397 = null;
        this.field393 = null;
        this.field394 = null;
        this.field395 = null;
        this.field164 = null;
        this.field166 = null;
        try {
            if (this.field469 != null) {
                this.field469.method420();
            }
        } catch (Exception var2) {
        }
        this.field469 = null;
        this.field471 = null;
        this.field488 = null;
        this.method65(6);
        this.field398 = null;
        this.field399 = null;
        this.field400 = null;
        this.field401 = null;
        this.field521 = null;
        this.field522 = null;
        this.field523 = null;
        this.field524 = null;
        this.field525 = null;
        this.field424 = null;
        this.field489 = null;
        this.field214 = null;
        this.field215 = null;
        this.field216 = null;
        this.field217 = null;
        this.field218 = null;
        this.field478 = null;
        this.field295 = null;
        this.field174 = null;
        this.field175 = null;
        this.field176 = null;
        this.field177 = null;
        this.field178 = null;
        this.field439 = null;
        this.field512 = null;
        this.field196 = null;
        this.field547 = null;
        this.field142 = null;
        this.field143 = null;
        this.field144 = null;
        if (this.field262 != null) {
            this.field262.field1196 = false;
        }
        this.field262 = null;
        this.field371 = null;
        this.field366 = null;
        this.field113 = null;
        this.field530 = null;
        this.field443 = null;
        this.field445 = null;
        this.field447 = null;
        this.field448 = null;
        this.field426 = null;
        this.field245 = null;
        this.field548 = null;
        this.field242 = null;
        this.field247 = null;
        this.field270 = null;
        this.field271 = null;
        this.field407 = null;
        this.field408 = null;
        this.field409 = null;
        this.field410 = null;
        if (this.field440 != null) {
            this.field440.method314();
        }
        this.field440 = null;
        this.field349 = null;
        this.field350 = null;
        if (arg0 > 0) {
            this.field368 = null;
            this.field462 = null;
            this.field364 = null;
            this.field204 = null;
            this.field163 = null;
            this.field382 = null;
            this.field111 = null;
            this.field411 = null;
            this.field412 = null;
            this.field413 = null;
            this.field414 = null;
            this.field415 = null;
            this.field264 = null;
            this.field265 = null;
            this.field266 = null;
            this.field267 = null;
            this.field161 = null;
            this.field100 = null;
            this.field538 = null;
            this.field128 = null;
            this.field542 = null;
            this.field452 = null;
            this.field559 = null;
            this.field560 = null;
            this.field561 = null;
            this.field562 = null;
            this.field385 = null;
            this.field335 = null;
            this.field372 = null;
            this.field564 = null;
            this.field336 = null;
            this.field337 = null;
            this.field436 = null;
            this.field437 = null;
            this.field438 = null;
            this.field473 = null;
            this.method78(1);
            class25.method248(9);
            class2.method8(9);
            class58.method523(9);
            class60.method539(9);
            class43.field1157 = null;
            class54.field1252 = null;
            class15.field696 = null;
            class27.field923 = null;
            class41.field1131 = null;
            class41.field1143 = null;
            class17.field713 = null;
            super.field610 = null;
            class65.field1604 = null;
            class72.method588(9);
            class56.method457(9);
            class22.method208(9);
            class69.method577(9);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method137(int arg0) {
        if (!this.field280 && !this.field213 && !this.field502) {
            ++field171;
            if (arg0 <= 0) {
                this.field482 = this.field486.method241();
            }
            if (!this.field342) {
                this.method40(2, false);
            } else {
                this.method50((byte) -35);
            }
            this.field344 = 0;
        } else {
            this.method107(8);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILNQUAUMDT;)V")
    private final void method138(int arg0, int arg1, class36 arg2) {
        while (true) {
            if (arg2.field1073 + 10 < arg0 * 8) {
                int var4 = arg2.method350(739, 11);
                if (var4 != 2047) {
                    if (this.field443[var4] == null) {
                        this.field443[var4] = new class65();
                        if (this.field448[var4] != null) {
                            this.field443[var4].method558(this.field448[var4], true);
                        }
                    }
                    this.field445[this.field444++] = var4;
                    class65 var5 = this.field443[var4];
                    var5.field1581 = field567;
                    int var6 = arg2.method350(739, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method350(739, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method350(739, 1);
                    int var9 = arg2.method350(739, 1);
                    if (var9 == 1) {
                        this.field447[this.field446++] = var4;
                    }
                    var5.method556(field419.field1570[0] + var6, field419.field1569[0] + var7, this.field91, var8 == 1);
                    continue;
                }
            }
            arg2.method351(this.field203);
            if (arg1 != 6) {
                this.field382 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCPAFTRRP;I)V")
    private final void method139(class6 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field574 == 0) {
            var3 = this.field196.method484(arg0.field573, arg0.field575, arg0.field576);
        }
        if (arg0.field574 == 1) {
            var3 = this.field196.method485(arg0.field575, 0, arg0.field573, arg0.field576);
        }
        if (arg0.field574 == 2) {
            var3 = this.field196.method486(arg0.field573, arg0.field575, arg0.field576);
        }
        if (arg0.field574 == 3) {
            var3 = this.field196.method487(arg0.field573, arg0.field575, arg0.field576);
        }
        if (var3 != 0) {
            int var7 = this.field196.method488(arg0.field573, arg0.field575, arg0.field576, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field582 = var4;
        arg0.field584 = var5;
        while (arg1 >= 0) {
            this.field149 = this.field530.method339();
        }
        arg0.field583 = var6;
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (arg0 != 0) {
            this.field366.method329(61);
        }
        if (this.field125 == 2) {
            this.method110((this.field298 - this.field288 << 7) + this.field301, -19921, (this.field297 - this.field287 << 7) + this.field300, this.field299 * 2);
            if (this.field199 > -1 && field567 % 20 < 10) {
                this.field542[0].method185(3, this.field200 - 28, this.field199 - 12);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method141(int arg0) {
        this.method163(8);
        if (arg0 <= 0) {
            this.field149 = this.field530.method339();
        }
        if (this.field553 == 1) {
            this.field452[this.field552 / 100].method185(3, this.field551 - 8 - 4, this.field550 - 8 - 4);
            ++field449;
            if (field449 > 1225) {
                field449 = 0;
                this.field366.method328(-818, 92);
                this.field366.method329(0);
                int var2 = this.field366.field1072;
                this.field366.method329((int) (Math.random() * 256.0D));
                this.field366.method329(186);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field366.method329(216);
                }
                this.field366.method329(210);
                this.field366.method329(2);
                this.field366.method330((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field366.method329(230);
                }
                this.field366.method330((int) (Math.random() * 65536.0D));
                this.field366.method330(52559);
                this.field366.method330(29994);
                this.field366.method338(-13105, this.field366.field1072 - var2);
            }
        }
        if (this.field553 == 2) {
            this.field452[this.field552 / 100 + 4].method185(3, this.field551 - 8 - 4, this.field550 - 8 - 4);
        }
        if (this.field370 != -1) {
            this.method88(this.field370, this.field118, -95);
            this.method121(0, -665, 0, class60.method538(this.field370), 0);
        }
        if (this.field351 != -1) {
            this.method88(this.field351, this.field118, -95);
            this.method121(0, -665, 0, class60.method538(this.field351), 0);
        }
        this.method146(this.field483);
        if (!this.field328) {
            this.method55(-888);
            this.method28(true);
        } else if (this.field129 == 0) {
            this.method158((byte) -93);
        }
        if (this.field456 == 1) {
            this.field371.method185(3, 296, 472);
        }
        if (field493) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field605 < 30 && field183) {
                var5 = 16711680;
            }
            if (super.field605 < 20 && !field183) {
                var5 = 16711680;
            }
            this.field403.method434("Fps:" + super.field605, var4, -972, var3, var5);
            int var14 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field183) {
                int var9 = 16711680;
            }
            if (var7 > 67108864 && !field183) {
                int var10 = 16711680;
            }
            this.field403.method434("Mem:" + var7 + "k", var14, -972, var3, 16776960);
            var14 += 15;
        }
        if (this.field89 != 0) {
            int var11 = this.field89 / 50;
            int var12 = var11 / 60;
            int var13 = var11 % 60;
            if (var13 < 10) {
                this.field403.method439(16776960, "System update in: " + var12 + ":0" + var13, 4, 329, this.field233);
            } else {
                this.field403.method439(16776960, "System update in: " + var12 + ":" + var13, 4, 329, this.field233);
            }
            ++field434;
            if (field434 > 85) {
                field434 = 0;
                this.field366.method328(-818, 246);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method142(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method142(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method143(int arg0) {
        class25.field893.method511();
        class25.field877.method511();
        class2.field14.method511();
        class58.field1383.method511();
        if (arg0 < 0) {
            class58.field1372.method511();
            class65.field1604.method511();
            class41.field1143.method511();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILVGGOSQRK;IIIIIII)V")
    public final void method144(int arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 < 0) {
            if (this.field539) {
                this.field314 = 32;
            } else {
                this.field314 = 0;
            }
            this.field539 = false;
            if (arg7 >= arg5 && arg7 < arg5 + 16 && arg3 >= arg2 && arg3 < arg2 + 16) {
                arg1.field1440 -= this.field344 * 4;
                if (arg8 == 1) {
                    this.field543 = true;
                }
                if (arg8 == 2 || arg8 == 3) {
                    this.field570 = true;
                }
            } else if (arg7 >= arg5 && arg7 < arg5 + 16 && arg3 >= arg2 + arg6 - 16 && arg3 < arg2 + arg6) {
                arg1.field1440 += this.field344 * 4;
                if (arg8 == 1) {
                    this.field543 = true;
                }
                if (arg8 == 2 || arg8 == 3) {
                    this.field570 = true;
                }
            } else if (arg7 >= arg5 - this.field314 && arg7 < arg5 + 16 + this.field314 && arg3 >= arg2 + 16 && arg3 < arg2 + arg6 - 16 && this.field344 > 0) {
                int var10 = (arg6 - 32) * arg6 / arg4;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg3 - arg2 - 16 - var10 / 2;
                int var12 = arg6 - 32 - var10;
                arg1.field1440 = (arg4 - arg6) * var11 / var12;
                if (arg8 == 1) {
                    this.field543 = true;
                }
                if (arg8 == 2 || arg8 == 3) {
                    this.field570 = true;
                }
                this.field539 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method145(int arg0) {
        class68 var2 = (class68) this.field245.method200();
        if (arg0 != 3) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (this.field556 == var2.field1698 && field567 <= var2.field1696) {
                if (field567 >= var2.field1695) {
                    if (var2.field1690 > 0) {
                        class8 var4 = this.field164[var2.field1690 - 1];
                        if (var4 != null && var4.field1559 >= 0 && var4.field1559 < 13312 && var4.field1560 >= 0 && var4.field1560 < 13312) {
                            var2.method574((byte) -53, this.method69(var4.field1559, var2.field1698, var4.field1560, (byte) 117) - var2.field1687, field567, var4.field1559, var4.field1560);
                        }
                    }
                    if (var2.field1690 < 0) {
                        int var5 = -var2.field1690 - 1;
                        class65 var6;
                        if (this.field529 == var5) {
                            var6 = field419;
                        } else {
                            var6 = this.field443[var5];
                        }
                        if (var6 != null && var6.field1559 >= 0 && var6.field1559 < 13312 && var6.field1560 >= 0 && var6.field1560 < 13312) {
                            var2.method574((byte) -53, this.method69(var6.field1559, var2.field1698, var6.field1560, (byte) 117) - var2.field1687, field567, var6.field1559, var6.field1560);
                        }
                    }
                    var2.method573(-66, this.field118);
                    this.field196.method469(var2, (int) var2.field1692, -1, (int) var2.field1694, var2.field1682, 60, false, this.field556, (int) var2.field1693, (byte) 4);
                }
            } else {
                var2.method326();
            }
            var2 = (class68) this.field245.method202(8);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
        this.field545 = 0;
        int var2 = (field419.field1559 >> 7) + this.field287;
        int var3 = (field419.field1560 >> 7) + this.field288;
        if (arg0) {
            this.field149 = -1;
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field545 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field545 = 1;
        }
        if (this.field545 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field545 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    public final void method147(boolean arg0) {
        ++this.field121;
        if (arg0) {
            this.field382 = null;
        }
        this.method122(true, 4);
        this.method161(true, 7);
        this.method122(false, 4);
        this.method161(false, 7);
        this.method145(3);
        this.method84(true);
        if (!this.field513) {
            int var2 = this.field307;
            if (this.field367 / 256 > var2) {
                var2 = this.field367 / 256;
            }
            if (this.field504[4] && this.field239[4] + 128 > var2) {
                var2 = this.field239[4] + 128;
            }
            int var3 = this.field324 + this.field308 & 2047;
            this.method96(var2, this.field102, var2 * 3 + 600, this.method69(field419.field1559, this.field556, field419.field1560, (byte) 117) - 50, this.field103, var3, 5294);
        }
        int var4;
        if (!this.field513) {
            var4 = this.method89((byte) 1);
        } else {
            var4 = this.method90(this.field455);
        }
        int var5 = this.field137;
        int var6 = this.field138;
        int var7 = this.field139;
        int var8 = this.field140;
        int var9 = this.field141;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field504[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field540[var10] * 2 + 1) - (double) this.field540[var10] + Math.sin((double) this.field406[var10] / 100.0D * (double) this.field537[var10]) * (double) this.field239[var10]);
                if (var10 == 0) {
                    this.field137 += var12;
                }
                if (var10 == 1) {
                    this.field138 += var12;
                }
                if (var10 == 2) {
                    this.field139 += var12;
                }
                if (var10 == 3) {
                    this.field141 = this.field141 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field140 += var12;
                    if (this.field140 < 128) {
                        this.field140 = 128;
                    }
                    if (this.field140 > 383) {
                        this.field140 = 383;
                    }
                }
            }
        }
        int var11 = class72.field1756;
        class22.field826 = true;
        class22.field829 = 0;
        class22.field827 = super.field617 - 4;
        class22.field828 = super.field618 - 4;
        class61.method545(2);
        this.field196.method497(this.field139, this.field141, var4, this.field137, this.field140, (byte) 1, this.field138);
        this.field196.method472(-31892);
        this.method93(true);
        this.method140(0);
        this.method25(26284, var11);
        this.method141(103);
        this.field266.method174(super.field609, true, 4, 4);
        this.field137 = var5;
        this.field138 = var6;
        this.field139 = var7;
        this.field140 = var8;
        this.field141 = var9;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method148(String arg0) throws IOException {
        if (!this.field417) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field156 != null) {
                try {
                    this.field156.close();
                } catch (Exception var4) {
                }
                this.field156 = null;
            }
            this.field156 = this.method22(43595);
            this.field156.setSoTimeout(10000);
            InputStream var2 = this.field156.getInputStream();
            OutputStream var3 = this.field156.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZII)V")
    private final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field342 &= arg5;
        if (arg4 >= 1 && arg0 >= 1 && arg4 <= 102 && arg0 <= 102) {
            if (field183 && this.field556 != arg7) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg3 == 0) {
                var9 = this.field196.method484(arg7, arg4, arg0);
            }
            if (arg3 == 1) {
                var9 = this.field196.method485(arg4, 0, arg7, arg0);
            }
            if (arg3 == 2) {
                var9 = this.field196.method486(arg7, arg4, arg0);
            }
            if (arg3 == 3) {
                var9 = this.field196.method487(arg7, arg4, arg0);
            }
            if (var9 != 0) {
                int var13 = this.field196.method488(arg7, arg4, arg0, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg3 == 0) {
                    this.field196.method475(733, arg7, arg4, arg0);
                    class25 var17 = class25.method249(var14);
                    if (var17.field885) {
                        this.field547[arg7].method566(var17.field864, var16, arg0, var15, arg4, 233);
                    }
                }
                if (arg3 == 1) {
                    this.field196.method476(arg7, arg0, 6, arg4);
                }
                if (arg3 == 2) {
                    this.field196.method477(449, arg7, arg4, arg0);
                    class25 var18 = class25.method249(var14);
                    if (var18.field896 + arg4 > 103 || var18.field896 + arg0 > 103 || var18.field853 + arg4 > 103 || var18.field853 + arg0 > 103) {
                        return;
                    }
                    if (var18.field885) {
                        this.field547[arg7].method567(var18.field896, var18.field864, arg4, var16, var18.field853, arg0, false);
                    }
                }
                if (arg3 == 3) {
                    this.field196.method478(arg4, -26086, arg7, arg0);
                    class25 var19 = class25.method249(var14);
                    if (var19.field885 && var19.field861) {
                        this.field547[arg7].method569(arg0, 47403, arg4);
                    }
                }
            }
            if (arg6 >= 0) {
                int var20 = arg7;
                if (arg7 < 3 && (this.field512[1][arg4][arg0] & 2) == 2) {
                    var20 = arg7 + 1;
                }
                class37.method382((byte) -106, arg6, arg0, arg7, this.field196, this.field547[arg7], arg1, this.field439, arg4, var20, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
    public final void method150(boolean arg0) {
        ++field169;
        if (arg0) {
            this.field149 = -1;
        }
        if (field169 > 168) {
            field169 = 0;
            this.field366.method328(-818, 23);
            this.field366.method333(0);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method172(0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field351 != -1 && this.field351 == this.field278) {
                        if (var2 == 8 && this.field170.length() > 0) {
                            this.field170 = this.field170.substring(0, this.field170.length() - 1);
                        }
                        break;
                    }
                    if (this.field98) {
                        if (var2 >= 32 && var2 <= 122 && this.field219.length() < 80) {
                            this.field219 = this.field219 + (char) var2;
                            this.field570 = true;
                        }
                        if (var2 == 8 && this.field219.length() > 0) {
                            this.field219 = this.field219.substring(0, this.field219.length() - 1);
                            this.field570 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field98 = false;
                            this.field570 = true;
                            if (this.field472 == 1) {
                                long var3 = class52.method428(this.field219);
                                this.method116(0, var3);
                            }
                            if (this.field472 == 2 && this.field251 > 0) {
                                long var5 = class52.method428(this.field219);
                                this.method33(3, var5);
                            }
                            if (this.field472 == 3 && this.field219.length() > 0) {
                                this.field366.method328(-818, 58);
                                this.field366.method329(0);
                                int var7 = this.field366.field1072;
                                this.field366.method335(this.field427, true);
                                class70.method581(this.field219, this.field366, -113);
                                this.field366.method338(-13105, this.field366.field1072 - var7);
                                this.field219 = class70.method582((byte) 21, this.field219);
                                this.field219 = class33.method277((byte) 21, this.field219);
                                this.method67(class52.method432(4, class52.method429((byte) -53, this.field427)), false, 6, this.field219);
                                if (this.field167 == 2) {
                                    this.field167 = 1;
                                    this.field571 = true;
                                    this.field366.method328(-818, 56);
                                    this.field366.method329(this.field451);
                                    this.field366.method329(this.field167);
                                    this.field366.method329(this.field294);
                                }
                            }
                            if (this.field472 == 4 && this.field499 < 100) {
                                long var8 = class52.method428(this.field219);
                                this.method112((byte) -68, var8);
                            }
                            if (this.field472 == 5 && this.field499 > 0) {
                                long var10 = class52.method428(this.field219);
                                this.method99(true, var10);
                            }
                        }
                    } else if (this.field244 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field527.length() < 10) {
                            this.field527 = this.field527 + (char) var2;
                            this.field570 = true;
                        }
                        if (var2 == 8 && this.field527.length() > 0) {
                            this.field527 = this.field527.substring(0, this.field527.length() - 1);
                            this.field570 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field527.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field527);
                                } catch (Exception var22) {
                                }
                                this.field366.method328(-818, 5);
                                this.field366.method333(var12);
                            }
                            this.field244 = 0;
                            this.field570 = true;
                        }
                    } else if (this.field244 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field527.length() < 12) {
                            this.field527 = this.field527 + (char) var2;
                            this.field570 = true;
                        }
                        if (var2 == 8 && this.field527.length() > 0) {
                            this.field527 = this.field527.substring(0, this.field527.length() - 1);
                            this.field570 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field527.length() > 0) {
                                this.field366.method328(-818, 192);
                                this.field366.method335(class52.method428(this.field527), true);
                            }
                            this.field244 = 0;
                            this.field570 = true;
                        }
                    } else if (this.field244 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field527.length() < 40) {
                            this.field527 = this.field527 + (char) var2;
                            this.field570 = true;
                        }
                        if (var2 == 8 && this.field527.length() > 0) {
                            this.field527 = this.field527.substring(0, this.field527.length() - 1);
                            this.field570 = true;
                        }
                    } else if (this.field333 == -1 && this.field246 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field494.length() < 80) {
                            this.field494 = this.field494 + (char) var2;
                            this.field570 = true;
                        }
                        if (var2 == 8 && this.field494.length() > 0) {
                            this.field494 = this.field494.substring(0, this.field494.length() - 1);
                            this.field570 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field494.length() > 0) {
                            if (this.field235 == 2) {
                                if (this.field494.equals("::clientdrop")) {
                                    this.method19((byte) 110);
                                }
                                if (this.field494.equals("::lag")) {
                                    this.method72(2);
                                }
                                if (this.field494.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field440.method325(0, 2); ++var13) {
                                        this.field440.method322(2, (byte) 1, (byte) 2, var13);
                                    }
                                }
                                if (this.field494.equals("::fpson")) {
                                    field493 = true;
                                }
                                if (this.field494.equals("::fpsoff")) {
                                    field493 = false;
                                }
                                if (this.field494.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field547[var14].field1676[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field494.startsWith("::")) {
                                this.field366.method328(-818, 15);
                                this.field366.method329(this.field494.length() - 1);
                                this.field366.method336(this.field494.substring(2));
                            } else {
                                String var17 = this.field494.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field494 = this.field494.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field494 = this.field494.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field494 = this.field494.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field494 = this.field494.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field494 = this.field494.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field494 = this.field494.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field494 = this.field494.substring(6);
                                }
                                String var19 = this.field494.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field494 = this.field494.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field494 = this.field494.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field494 = this.field494.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field494 = this.field494.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field494 = this.field494.substring(6);
                                }
                                this.field366.method328(-818, 47);
                                this.field366.method329(0);
                                int var21 = this.field366.field1072;
                                this.field366.method355((byte) 5, var20);
                                this.field366.method356(var18, 38949);
                                this.field163.field1072 = 0;
                                class70.method581(this.field494, this.field163, -113);
                                this.field366.method376(this.field470, this.field163.field1072, this.field163.field1071, 0);
                                this.field366.method338(-13105, this.field366.field1072 - var21);
                                this.field494 = class70.method582((byte) 21, this.field494);
                                this.field494 = class33.method277((byte) 21, this.field494);
                                field419.field1536 = this.field494;
                                field419.field1554 = var18;
                                field419.field1556 = var20;
                                field419.field1568 = 150;
                                if (this.field235 == 2) {
                                    this.method67("@cr2@" + field419.field1612, false, 2, field419.field1536);
                                } else if (this.field235 == 1) {
                                    this.method67("@cr1@" + field419.field1612, false, 2, field419.field1536);
                                } else {
                                    this.method67(field419.field1612, false, 2, field419.field1536);
                                }
                                if (this.field451 == 2) {
                                    this.field451 = 3;
                                    this.field571 = true;
                                    this.field366.method328(-818, 56);
                                    this.field366.method329(this.field451);
                                    this.field366.method329(this.field167);
                                    this.field366.method329(this.field294);
                                }
                            }
                            this.field494 = "";
                            this.field570 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field170.length() < 12) {
                this.field170 = this.field170 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILNQUAUMDT;LXVMRCEYW;II)V")
    private final void method151(int arg0, class36 arg1, class65 arg2, int arg3, int arg4) {
        if (arg3 < 2 || arg3 > 2) {
            this.field382 = null;
        }
        if ((arg4 & 4) != 0) {
            int var6 = arg1.method359(this.field479);
            byte[] var7 = new byte[var6];
            class36 var8 = new class36(-587, var7);
            arg1.method377(var7, var6, this.field528, 0);
            this.field448[arg0] = var8;
            arg2.method558(var8, true);
        }
        if ((arg4 & 32) != 0) {
            arg2.field1533 = arg1.method368(this.field535);
            arg2.field1534 = arg1.method367(-40);
        }
        if ((arg4 & 512) != 0) {
            int var9 = arg1.method359(this.field479);
            int var10 = arg1.method359(this.field479);
            arg2.method555(field567, true, var10, var9);
            arg2.field1537 = field567 + 300;
            arg2.field1538 = arg1.method357((byte) 99);
            arg2.field1539 = arg1.method359(this.field479);
        }
        if ((arg4 & 128) != 0) {
            arg2.field1536 = arg1.method346();
            if (arg2.field1536.charAt(0) == '~') {
                arg2.field1536 = arg2.field1536.substring(1);
                this.method67(arg2.field1612, false, 2, arg2.field1536);
            } else if (field419 == arg2) {
                this.method67(arg2.field1612, false, 2, arg2.field1536);
            }
            arg2.field1554 = 0;
            arg2.field1556 = 0;
            arg2.field1568 = 150;
        }
        if ((arg4 & 2) != 0) {
            int var11 = arg1.method367(-40);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = arg1.method358(0);
            if (arg2.field1563 == var11 && var11 != -1) {
                int var13 = class27.field923[var11].field937;
                if (var13 == 1) {
                    arg2.field1564 = 0;
                    arg2.field1565 = 0;
                    arg2.field1566 = var12;
                    arg2.field1567 = 0;
                }
                if (var13 == 2) {
                    arg2.field1567 = 0;
                }
            } else if (var11 == -1 || arg2.field1563 == -1 || class27.field923[var11].field931 >= class27.field923[arg2.field1563].field931) {
                arg2.field1563 = var11;
                arg2.field1564 = 0;
                arg2.field1565 = 0;
                arg2.field1566 = var12;
                arg2.field1567 = 0;
                arg2.field1571 = arg2.field1535;
            }
        }
        if ((arg4 & 1) != 0) {
            int var14 = arg1.method339();
            int var15 = arg1.method359(this.field479);
            arg2.method555(field567, true, var15, var14);
            arg2.field1537 = field567 + 300;
            arg2.field1538 = arg1.method358(0);
            arg2.field1539 = arg1.method359(this.field479);
        }
        if ((arg4 & 1024) != 0) {
            arg2.field1545 = arg1.method366((byte) 1);
            int var16 = arg1.method374(15285);
            arg2.field1549 = var16 >> 16;
            arg2.field1548 = (var16 & 65535) + field567;
            arg2.field1546 = 0;
            arg2.field1547 = 0;
            if (arg2.field1548 > field567) {
                arg2.field1546 = -1;
            }
            if (arg2.field1545 == 65535) {
                arg2.field1545 = -1;
            }
        }
        if ((arg4 & 64) != 0) {
            arg2.field1577 = arg1.method341();
            if (arg2.field1577 == 65535) {
                arg2.field1577 = -1;
            }
        }
        if ((arg4 & 8) != 0) {
            int var17 = arg1.method366((byte) 1);
            int var18 = arg1.method357((byte) 99);
            int var19 = arg1.method359(this.field479);
            int var20 = arg1.field1072;
            if (arg2.field1612 != null && arg2.field1593) {
                long var21 = class52.method428(arg2.field1612);
                boolean var23 = false;
                if (var18 <= 1) {
                    for (int var24 = 0; var24 < this.field499; ++var24) {
                        if (this.field256[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                }
                if (!var23 && this.field545 == 0) {
                    try {
                        this.field163.field1072 = 0;
                        arg1.method348(0, this.field163.field1071, var19, 520);
                        this.field163.field1072 = 0;
                        String var25 = class70.method580(var19, false, this.field163);
                        String var26 = class33.method277((byte) 21, var25);
                        arg2.field1536 = var26;
                        arg2.field1554 = var17 >> 8;
                        arg2.field1556 = var17 & 255;
                        arg2.field1568 = 150;
                        if (var18 != 2 && var18 != 3) {
                            if (var18 == 1) {
                                this.method67("@cr1@" + arg2.field1612, false, 1, var26);
                            } else {
                                this.method67(arg2.field1612, false, 2, var26);
                            }
                        } else {
                            this.method67("@cr2@" + arg2.field1612, false, 1, var26);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field1072 = var19 + var20;
        }
        if ((arg4 & 256) != 0) {
            arg2.field1583 = arg1.method358(0);
            arg2.field1585 = arg1.method358(0);
            arg2.field1584 = arg1.method339();
            arg2.field1586 = arg1.method359(this.field479);
            arg2.field1587 = arg1.method341() + field567;
            arg2.field1588 = arg1.method367(-40) + field567;
            arg2.field1589 = arg1.method359(this.field479);
            arg2.method557((byte) 86);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method152(boolean arg0, String arg1) {
        if (!arg0) {
            this.field382 = null;
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field251; ++var3) {
                if (arg1.equalsIgnoreCase(this.field462[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field419.field1612);
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field340) {
            this.method61((byte) 3);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field148 += arg1;
        int var7 = this.field196.method484(arg3, arg2, arg0);
        if (var7 != 0) {
            int var8 = this.field196.method488(arg3, arg2, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field424.field664;
            int var13 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class25 var15 = class25.method249(var14);
            if (var15.field886 != -1) {
                class59 var16 = this.field471[var15.field886];
                if (var16 != null) {
                    int var17 = (var15.field896 * 4 - var16.field1409) / 2;
                    int var18 = (var15.field853 * 4 - var16.field1410) / 2;
                    var16.method530(3, (104 - arg0 - var15.field853) * 4 + 48 + var18, arg2 * 4 + 48 + var17);
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
        int var19 = this.field196.method486(arg3, arg2, arg0);
        if (var19 != 0) {
            int var20 = this.field196.method488(arg3, arg2, arg0, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class25 var24 = class25.method249(var23);
            if (var24.field886 != -1) {
                class59 var25 = this.field471[var24.field886];
                if (var25 != null) {
                    int var26 = (var24.field896 * 4 - var25.field1409) / 2;
                    int var27 = (var24.field853 * 4 - var25.field1410) / 2;
                    var25.method530(3, (104 - arg0 - var24.field853) * 4 + 48 + var27, arg2 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field424.field664;
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
        int var31 = this.field196.method487(arg3, arg2, arg0);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class25 var33 = class25.method249(var32);
            if (var33.field886 != -1) {
                class59 var34 = this.field471[var33.field886];
                if (var34 != null) {
                    int var35 = (var33.field896 * 4 - var34.field1409) / 2;
                    int var36 = (var33.field853 * 4 - var34.field1410) / 2;
                    var34.method530(3, (104 - arg0 - var33.field853) * 4 + 48 + var36, arg2 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method154(int arg0, boolean arg1) {
        if (arg1) {
            field536 = !field536;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILVGGOSQRK;)Z")
    public final boolean method155(int arg0, class60 arg1) {
        int var3 = arg1.field1423;
        this.field148 += arg0;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field385[this.field259] = "Remove @whi@" + arg1.field1490;
                this.field561[this.field259] = 387;
                ++this.field259;
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
            this.field385[this.field259] = "Remove @whi@" + this.field462[var3];
            this.field561[this.field259] = 641;
            ++this.field259;
            this.field385[this.field259] = "Message @whi@" + this.field462[var3];
            this.field561[this.field259] = 664;
            ++this.field259;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public final boolean method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field242[var15][var35] = 0;
                this.field247[var15][var35] = 99999999;
            }
        }
        int var16 = arg11;
        int var17 = arg4;
        this.field242[arg11][arg4] = 99;
        this.field247[arg11][arg4] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field270[var18] = arg11;
        int var36 = var18 + 1;
        this.field271[var18] = arg4;
        boolean var20 = false;
        int var21 = this.field270.length;
        int[][] var22 = this.field547[this.field556].field1676;
        while (var36 != var19) {
            var16 = this.field270[var19];
            var17 = this.field271[var19];
            var19 = (var19 + 1) % var21;
            if (arg6 == var16 && arg2 == var17) {
                var20 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && this.field547[this.field556].method570(var17, arg7 - 1, arg2, true, var16, arg6, arg0)) {
                    var20 = true;
                    break;
                }
                if (arg7 < 10 && this.field547[this.field556].method571(0, var16, arg7 - 1, arg6, arg2, arg0, var17)) {
                    var20 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg5 != 0 && this.field547[this.field556].method572(arg1, var17, true, arg6, arg5, var16, arg3, arg2)) {
                var20 = true;
                break;
            }
            int var34 = this.field247[var16][var17] + 1;
            if (var16 > 0 && this.field242[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field270[var36] = var16 - 1;
                this.field271[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field242[var16 - 1][var17] = 2;
                this.field247[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field242[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field270[var36] = var16 + 1;
                this.field271[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field242[var16 + 1][var17] = 8;
                this.field247[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field242[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field270[var36] = var16;
                this.field271[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field242[var16][var17 - 1] = 1;
                this.field247[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field242[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field270[var36] = var16;
                this.field271[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field242[var16][var17 + 1] = 4;
                this.field247[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field242[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field270[var36] = var16 - 1;
                this.field271[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field242[var16 - 1][var17 - 1] = 3;
                this.field247[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field242[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field270[var36] = var16 + 1;
                this.field271[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field242[var16 + 1][var17 - 1] = 9;
                this.field247[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field242[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field270[var36] = var16 - 1;
                this.field271[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field242[var16 - 1][var17 + 1] = 6;
                this.field247[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field242[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field270[var36] = var16 + 1;
                this.field271[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field242[var16 + 1][var17 + 1] = 12;
                this.field247[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field315 = 0;
        if (!var20) {
            if (arg8) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg6 - var24; var25 <= arg6 + var24; ++var25) {
                        for (int var26 = arg2 - var24; var26 <= arg2 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field247[var25][var26] < var23) {
                                var23 = this.field247[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field315 = 1;
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
        if (arg9 != 0) {
            throw new NullPointerException();
        } else {
            this.field270[var27] = var16;
            int var37 = var27 + 1;
            this.field271[var27] = var17;
            int var28;
            int var29 = var28 = this.field242[var16][var17];
            while (arg11 != var16 || arg4 != var17) {
                if (var28 != var29) {
                    var28 = var29;
                    this.field270[var37] = var16;
                    this.field271[var37++] = var17;
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
                var29 = this.field242[var16][var17];
            }
            if (var37 <= 0) {
                if (arg10 == 1) {
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
                int var31 = this.field270[var37];
                int var32 = this.field271[var37];
                if ((var30 & 3) == 0) {
                    ++field279;
                }
                if (field279 >= 59) {
                    this.field366.method328(-818, 13);
                    field279 = 0;
                }
                if (arg10 == 0) {
                    this.field366.method328(-818, 215);
                    this.field366.method329(var30 + var30 + 3);
                }
                if (arg10 == 1) {
                    this.field366.method328(-818, 31);
                    this.field366.method329(var30 + var30 + 3 + 14);
                }
                if (arg10 == 2) {
                    this.field366.method328(-818, 238);
                    this.field366.method329(var30 + var30 + 3);
                }
                this.field366.method355((byte) 5, super.field627[5] == 1 ? 1 : 0);
                this.field366.method365(this.field287 + var31, 0);
                this.field422 = this.field270[0];
                this.field423 = this.field271[0];
                for (int var33 = 1; var33 < var30; ++var33) {
                    --var37;
                    this.field366.method355((byte) 5, this.field270[var37] - var31);
                    this.field366.method356(this.field271[var37] - var32, 38949);
                }
                this.field366.method330(this.field288 + var32);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method157(int arg0, int arg1) {
        int var3 = class17.field713[arg0].field721;
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var3 != 0) {
            int var5 = this.field489[arg0];
            if (var3 == 1) {
                if (var5 == 1) {
                    class72.method597((byte) 5, 0.9D);
                }
                if (var5 == 2) {
                    class72.method597((byte) 5, 0.8D);
                }
                if (var5 == 3) {
                    class72.method597((byte) 5, 0.7D);
                }
                if (var5 == 4) {
                    class72.method597((byte) 5, 0.6D);
                }
                class58.field1372.method511();
                this.field109 = true;
            }
            if (var3 == 3) {
                boolean var6 = this.field179;
                if (var5 == 0) {
                    this.method29(19751, this.field179, 0);
                    this.field179 = true;
                }
                if (var5 == 1) {
                    this.method29(19751, this.field179, -400);
                    this.field179 = true;
                }
                if (var5 == 2) {
                    this.method29(19751, this.field179, -800);
                    this.field179 = true;
                }
                if (var5 == 3) {
                    this.method29(19751, this.field179, -1200);
                    this.field179 = true;
                }
                if (var5 == 4) {
                    this.field179 = false;
                }
                if (this.field179 != var6 && !field183) {
                    if (this.field179) {
                        this.field518 = this.field146;
                        this.field519 = true;
                        this.field440.method306(2, this.field518);
                    } else {
                        this.method65(6);
                    }
                    this.field87 = 0;
                }
            }
            if (var3 == 4) {
                if (var5 == 0) {
                    this.field145 = true;
                    this.method117(0, true);
                }
                if (var5 == 1) {
                    this.field145 = true;
                    this.method117(-400, true);
                }
                if (var5 == 2) {
                    this.field145 = true;
                    this.method117(-800, true);
                }
                if (var5 == 3) {
                    this.field145 = true;
                    this.method117(-1200, true);
                }
                if (var5 == 4) {
                    this.field145 = false;
                }
            }
            if (var3 == 5) {
                this.field241 = var5;
            }
            if (var3 == 6) {
                this.field107 = var5;
            }
            if (var3 == 8) {
                this.field569 = var5;
                this.field570 = true;
            }
            if (var3 == 9) {
                this.field261 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method158(byte arg0) {
        int var2 = this.field130;
        int var3 = this.field131;
        int var4 = this.field132;
        int var5 = this.field133;
        if (arg0 != -93) {
            this.field366.method329(176);
        }
        int var6 = 6116423;
        class61.method547(var4, var2, var5, var3, var6, 3);
        class61.method547(var4 - 2, var2 + 1, 16, var3 + 1, 0, 3);
        class61.method548(var2 + 1, var4 - 2, 0, var5 - 19, var3 + 18, 0);
        this.field404.method439(var6, "Choose Option", var2 + 3, var3 + 14, this.field233);
        int var7 = super.field617;
        int var8 = super.field618;
        if (this.field129 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field129 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field129 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field259; ++var9) {
            int var10 = (this.field259 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field404.method443(var11, true, (byte) -11, var10, var2 + 3, this.field385[var9]);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
    public final void method159(int arg0, int arg1) {
        if (arg1 != 5) {
            this.field483 = !this.field483;
        }
        if (arg0 >= 0) {
            int var3 = this.field559[arg0];
            int var4 = this.field560[arg0];
            int var5 = this.field561[arg0];
            int var6 = this.field562[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field244 != 0 && var5 != 1855) {
                this.field244 = 0;
                this.field570 = true;
            }
            if (var5 == 64) {
                boolean var7 = this.method156(0, 0, var4, 0, field419.field1570[0], 0, var3, 0, false, 0, 2, field419.field1569[0]);
                if (!var7) {
                    this.method156(0, 1, var4, 0, field419.field1570[0], 1, var3, 0, false, 0, 2, field419.field1569[0]);
                }
                this.field550 = super.field624;
                this.field551 = super.field625;
                this.field553 = 2;
                this.field552 = 0;
                this.field366.method328(-818, 46);
                this.field366.method363(this.field287 + var3, true);
                this.field366.method365(this.field288 + var4, 0);
                this.field366.method330(var6);
            }
            if (var5 == 1439) {
                int var9 = var6 >> 14 & 32767;
                class25 var10 = class25.method249(var9);
                String var11;
                if (var10.field865 != null) {
                    var11 = new String(var10.field865);
                } else {
                    var11 = "It's a " + var10.field867 + ".";
                }
                this.method67("", false, 0, var11);
            }
            if (var5 == 871) {
                this.field184 = 1;
                this.field185 = var3;
                this.field186 = var4;
                this.field187 = var6;
                this.field188 = String.valueOf(class58.method520(var6).field1378);
                this.field464 = 0;
                this.field543 = true;
            } else {
                if (var5 == 219) {
                    class8 var12 = this.field164[var6];
                    if (var12 != null) {
                        this.method156(0, 1, var12.field1570[0], 0, field419.field1570[0], 1, var12.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 250);
                        this.field366.method364(this.field185, true);
                        this.field366.method365(this.field186, 0);
                        this.field366.method330(this.field187);
                        this.field366.method330(var6);
                    }
                }
                if (var5 == 523) {
                    this.field366.method328(-818, 154);
                    this.field366.method330(var4);
                    class60 var13 = class60.method538(var4);
                    if (var13.field1444 != null && var13.field1444[0][0] == 5) {
                        int var14 = var13.field1444[0][1];
                        this.field489[var14] = 1 - this.field489[var14];
                        this.method157(var14, 469);
                        this.field543 = true;
                    }
                }
                if (var5 == 18) {
                    this.field366.method328(-818, 162);
                    this.field366.method363(var3, true);
                    this.field366.method330(var4);
                    this.field366.method363(var6, true);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 752) {
                    boolean var15 = this.method156(0, 0, var4, 0, field419.field1570[0], 0, var3, 0, false, 0, 2, field419.field1569[0]);
                    if (!var15) {
                        this.method156(0, 1, var4, 0, field419.field1570[0], 1, var3, 0, false, 0, 2, field419.field1569[0]);
                    }
                    this.field550 = super.field624;
                    this.field551 = super.field625;
                    this.field553 = 2;
                    this.field552 = 0;
                    if ((var4 & 3) == 0) {
                        ++field549;
                    }
                    if (field549 >= 50) {
                        this.field366.method328(-818, 49);
                        this.field366.method330(23270);
                        field549 = 0;
                    }
                    this.field366.method328(-818, 121);
                    this.field366.method330(var6);
                    this.field366.method365(this.field288 + var4, 0);
                    this.field366.method365(this.field287 + var3, 0);
                }
                if (var5 == 694) {
                    this.method130(var6, var3, 48241, var4);
                    this.field366.method328(-818, 158);
                    this.field366.method363(this.field288 + var4, true);
                    this.field366.method365(this.field287 + var3, 0);
                    this.field366.method363(var6 >> 14 & 32767, true);
                }
                if (var5 == 90) {
                    class8 var17 = this.field164[var6];
                    if (var17 != null) {
                        this.method156(0, 1, var17.field1570[0], 0, field419.field1570[0], 1, var17.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 21);
                        this.field366.method330(var6);
                    }
                }
                if (var5 == 468) {
                    class8 var18 = this.field164[var6];
                    if (var18 != null) {
                        this.method156(0, 1, var18.field1570[0], 0, field419.field1570[0], 1, var18.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 152);
                        this.field366.method365(var6, 0);
                    }
                }
                if (var5 == 232) {
                    this.method130(var6, var3, 48241, var4);
                    this.field366.method328(-818, 249);
                    this.field366.method365(var6 >> 14 & 32767, 0);
                    this.field366.method365(this.field287 + var3, 0);
                    this.field366.method364(this.field288 + var4, true);
                }
                if (var5 == 749 || var5 == 921) {
                    String var19 = this.field385[arg0];
                    int var20 = var19.indexOf("@whi@");
                    if (var20 != -1) {
                        String var21 = var19.substring(var20 + 5).trim();
                        String var22 = class52.method432(4, class52.method429((byte) -53, class52.method428(var21)));
                        boolean var23 = false;
                        for (int var24 = 0; var24 < this.field444; ++var24) {
                            class65 var25 = this.field443[this.field445[var24]];
                            if (var25 != null && var25.field1612 != null && var25.field1612.equalsIgnoreCase(var22)) {
                                this.method156(0, 1, var25.field1570[0], 0, field419.field1570[0], 1, var25.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                                if (var5 == 749) {
                                    this.field366.method328(-818, 16);
                                    this.field366.method330(this.field445[var24]);
                                }
                                if (var5 == 921) {
                                    this.field366.method328(-818, 201);
                                    this.field366.method365(this.field445[var24], 0);
                                }
                                var23 = true;
                                break;
                            }
                        }
                        if (!var23) {
                            this.method67("", false, 0, "Unable to find " + var22);
                        }
                    }
                }
                if (var5 == 1952) {
                    this.method130(var6, var3, 48241, var4);
                    this.field366.method328(-818, 0);
                    this.field366.method330(this.field287 + var3);
                    this.field366.method365(var6 >> 14 & 32767, 0);
                    this.field366.method365(this.field288 + var4, 0);
                }
                if (var5 == 883) {
                    this.field366.method328(-818, 154);
                    this.field366.method330(var4);
                    class60 var26 = class60.method538(var4);
                    if (var26.field1444 != null && var26.field1444[0][0] == 5) {
                        int var27 = var26.field1444[0][1];
                        if (this.field489[var27] != var26.field1427[0]) {
                            this.field489[var27] = var26.field1427[0];
                            this.method157(var27, 469);
                            this.field543 = true;
                        }
                    }
                }
                if (var5 == 843) {
                    class8 var28 = this.field164[var6];
                    if (var28 != null) {
                        this.method156(0, 1, var28.field1570[0], 0, field419.field1570[0], 1, var28.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 219);
                        this.field366.method363(var6, true);
                        this.field366.method365(this.field465, 0);
                    }
                }
                if (var5 == 550) {
                    class8 var29 = this.field164[var6];
                    if (var29 != null) {
                        this.method156(0, 1, var29.field1570[0], 0, field419.field1570[0], 1, var29.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 133);
                        this.field366.method365(var6, 0);
                    }
                }
                if (var5 == 980 && this.method130(var6, var3, 48241, var4)) {
                    this.field366.method328(-818, 186);
                    this.field366.method364(var6 >> 14 & 32767, true);
                    this.field366.method330(this.field187);
                    this.field366.method365(this.field186, 0);
                    this.field366.method330(this.field185);
                    this.field366.method330(this.field287 + var3);
                    this.field366.method365(this.field288 + var4, 0);
                }
                if (var5 == 664) {
                    String var30 = this.field385[arg0];
                    int var31 = var30.indexOf("@whi@");
                    if (var31 != -1) {
                        long var32 = class52.method428(var30.substring(var31 + 5).trim());
                        int var34 = -1;
                        for (int var35 = 0; var35 < this.field251; ++var35) {
                            if (this.field364[var35] == var32) {
                                var34 = var35;
                                break;
                            }
                        }
                        if (var34 != -1 && this.field204[var34] > 0) {
                            this.field570 = true;
                            this.field244 = 0;
                            this.field98 = true;
                            this.field219 = "";
                            this.field472 = 3;
                            this.field427 = this.field364[var34];
                            this.field384 = "Enter message to send to " + this.field462[var34];
                        }
                    }
                }
                if (var5 == 665) {
                    class65 var36 = this.field443[var6];
                    if (var36 != null) {
                        this.method156(0, 1, var36.field1570[0], 0, field419.field1570[0], 1, var36.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 201);
                        this.field366.method365(var6, 0);
                    }
                }
                if (var5 == 293) {
                    this.method130(var6, var3, 48241, var4);
                    this.field366.method328(-818, 189);
                    this.field366.method365(var6 >> 14 & 32767, 0);
                    this.field366.method364(this.field287 + var3, true);
                    this.field366.method363(this.field288 + var4, true);
                }
                if (var5 == 870) {
                    class65 var37 = this.field443[var6];
                    if (var37 != null) {
                        this.method156(0, 1, var37.field1570[0], 0, field419.field1570[0], 1, var37.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        ++field481;
                        if (field481 >= 85) {
                            this.field366.method328(-818, 147);
                            this.field366.method330(13671);
                            field481 = 0;
                        }
                        this.field366.method328(-818, 217);
                        this.field366.method363(var6, true);
                    }
                }
                if (var5 == 455) {
                    class60 var38 = class60.method538(var4);
                    boolean var39 = true;
                    if (var38.field1423 > 0) {
                        var39 = this.method74(false, var38);
                    }
                    if (var39) {
                        this.field366.method328(-818, 154);
                        this.field366.method330(var4);
                    }
                }
                if (var5 == 873) {
                    boolean var40 = this.method156(0, 0, var4, 0, field419.field1570[0], 0, var3, 0, false, 0, 2, field419.field1569[0]);
                    if (!var40) {
                        this.method156(0, 1, var4, 0, field419.field1570[0], 1, var3, 0, false, 0, 2, field419.field1569[0]);
                    }
                    this.field550 = super.field624;
                    this.field551 = super.field625;
                    this.field553 = 2;
                    this.field552 = 0;
                    this.field366.method328(-818, 213);
                    this.field366.method364(this.field288 + var4, true);
                    this.field366.method364(var6, true);
                    this.field366.method365(this.field287 + var3, 0);
                }
                if (var5 == 504) {
                    this.field366.method328(-818, 9);
                    this.field366.method365(var3, 0);
                    this.field366.method364(var4, true);
                    this.field366.method364(var6, true);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 1) {
                    if (!this.field328) {
                        this.field196.method496(super.field624 - 4, super.field625 - 4, (byte) 6);
                    } else {
                        this.field196.method496(var3 - 4, var4 - 4, (byte) 6);
                    }
                }
                if (var5 == 722) {
                    String var42 = this.field385[arg0];
                    int var43 = var42.indexOf("@whi@");
                    if (var43 != -1) {
                        if (this.field351 == -1) {
                            this.method162(false);
                            this.field170 = var42.substring(var43 + 5).trim();
                            this.field194 = false;
                            this.field278 = this.field351 = class60.field1457;
                        } else {
                            this.method67("", false, 0, "Please close the interface you have open before using 'report abuse'");
                        }
                    }
                }
                if (var5 == 632) {
                    this.field366.method328(-818, 11);
                    this.field366.method330(var3);
                    this.field366.method363(this.field465, true);
                    this.field366.method364(var4, true);
                    this.field366.method365(var6, 0);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 29) {
                    if ((var6 & 3) == 0) {
                        ++field484;
                    }
                    if (field484 >= 84) {
                        this.field366.method328(-818, 90);
                        this.field366.method330(40661);
                        field484 = 0;
                    }
                    this.field366.method328(-818, 57);
                    this.field366.method363(var3, true);
                    this.field366.method364(var6, true);
                    this.field366.method364(var4, true);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 486) {
                    this.field366.method328(-818, 127);
                    this.field366.method330(var4);
                    this.field366.method365(var6, 0);
                    this.field366.method365(var3, 0);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 990) {
                    this.method162(false);
                }
                if (var5 == 347) {
                    class65 var44 = this.field443[var6];
                    if (var44 != null) {
                        this.method156(0, 1, var44.field1570[0], 0, field419.field1570[0], 1, var44.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 237);
                        this.field366.method363(var6, true);
                        this.field366.method363(this.field465, true);
                    }
                }
                if (var5 == 159 || var5 == 444 || var5 == 641 || var5 == 387) {
                    String var45 = this.field385[arg0];
                    int var46 = var45.indexOf("@whi@");
                    if (var46 != -1) {
                        long var47 = class52.method428(var45.substring(var46 + 5).trim());
                        if (var5 == 159) {
                            this.method116(0, var47);
                        }
                        if (var5 == 444) {
                            this.method112((byte) -68, var47);
                        }
                        if (var5 == 641) {
                            this.method33(3, var47);
                        }
                        if (var5 == 387) {
                            this.method99(true, var47);
                        }
                    }
                }
                if (var5 == 866) {
                    class8 var49 = this.field164[var6];
                    if (var49 != null) {
                        this.method156(0, 1, var49.field1570[0], 0, field419.field1570[0], 1, var49.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 94);
                        this.field366.method330(var6);
                    }
                }
                if (var5 == 651) {
                    this.field366.method328(-818, 55);
                    this.field366.method363(var3, true);
                    this.field366.method330(var4);
                    this.field366.method330(var6);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 675) {
                    this.field366.method328(-818, 118);
                    this.field366.method363(var4, true);
                    this.field366.method364(var6, true);
                    this.field366.method363(var3, true);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 600) {
                    class65 var50 = this.field443[var6];
                    if (var50 != null) {
                        this.method156(0, 1, var50.field1570[0], 0, field419.field1570[0], 1, var50.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 177);
                        this.field366.method364(this.field185, true);
                        this.field366.method364(var6, true);
                        this.field366.method363(this.field186, true);
                        this.field366.method365(this.field187, 0);
                    }
                }
                if (var5 == 393) {
                    this.field366.method328(-818, 85);
                    this.field366.method364(var6, true);
                    this.field366.method365(var3, 0);
                    this.field366.method364(var4, true);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 1288) {
                    class58 var51 = class58.method520(var6);
                    String var52;
                    if (var51.field1395 != null) {
                        var52 = new String(var51.field1395);
                    } else {
                        var52 = "It's a " + var51.field1378 + ".";
                    }
                    this.method67("", false, 0, var52);
                }
                if (var5 == 605) {
                    this.field366.method328(-818, 150);
                    this.field366.method365(var3, 0);
                    this.field366.method330(var6);
                    this.field366.method364(var4, true);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 24) {
                    boolean var53 = this.method156(0, 0, var4, 0, field419.field1570[0], 0, var3, 0, false, 0, 2, field419.field1569[0]);
                    if (!var53) {
                        this.method156(0, 1, var4, 0, field419.field1570[0], 1, var3, 0, false, 0, 2, field419.field1569[0]);
                    }
                    this.field550 = super.field624;
                    this.field551 = super.field625;
                    this.field553 = 2;
                    this.field552 = 0;
                    this.field366.method328(-818, 12);
                    this.field366.method330(this.field287 + var3);
                    this.field366.method365(this.field288 + var4, 0);
                    this.field366.method364(var6, true);
                }
                if (var5 == 835) {
                    this.field366.method328(-818, 51);
                    this.field366.method363(var4, true);
                    this.field366.method330(var3);
                    this.field366.method330(this.field185);
                    this.field366.method364(var6, true);
                    this.field366.method363(this.field186, true);
                    this.field366.method365(this.field187, 0);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 308) {
                    this.method130(var6, var3, 48241, var4);
                    this.field366.method328(-818, 170);
                    this.field366.method330(this.field288 + var4);
                    this.field366.method330(this.field287 + var3);
                    this.field366.method364(var6 >> 14 & 32767, true);
                }
                if (var5 == 9) {
                    class65 var55 = this.field443[var6];
                    if (var55 != null) {
                        this.method156(0, 1, var55.field1570[0], 0, field419.field1570[0], 1, var55.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 59);
                        this.field366.method330(var6);
                    }
                }
                if (var5 == 762) {
                    boolean var56 = this.method156(0, 0, var4, 0, field419.field1570[0], 0, var3, 0, false, 0, 2, field419.field1569[0]);
                    if (!var56) {
                        this.method156(0, 1, var4, 0, field419.field1570[0], 1, var3, 0, false, 0, 2, field419.field1569[0]);
                    }
                    this.field550 = super.field624;
                    this.field551 = super.field625;
                    this.field553 = 2;
                    this.field552 = 0;
                    this.field366.method328(-818, 216);
                    this.field366.method364(this.field187, true);
                    this.field366.method363(this.field186, true);
                    this.field366.method330(this.field185);
                    this.field366.method365(var6, 0);
                    this.field366.method365(this.field287 + var3, 0);
                    this.field366.method365(this.field288 + var4, 0);
                }
                if (var5 == 985) {
                    boolean var58 = this.method156(0, 0, var4, 0, field419.field1570[0], 0, var3, 0, false, 0, 2, field419.field1569[0]);
                    if (!var58) {
                        this.method156(0, 1, var4, 0, field419.field1570[0], 1, var3, 0, false, 0, 2, field419.field1569[0]);
                    }
                    this.field550 = super.field624;
                    this.field551 = super.field625;
                    this.field553 = 2;
                    this.field552 = 0;
                    this.field366.method328(-818, 159);
                    this.field366.method364(this.field287 + var3, true);
                    this.field366.method330(this.field288 + var4);
                    this.field366.method364(var6, true);
                    this.field366.method363(this.field465, true);
                }
                if (var5 == 214 && this.method130(var6, var3, 48241, var4)) {
                    this.field366.method328(-818, 188);
                    this.field366.method365(this.field465, 0);
                    this.field366.method364(this.field287 + var3, true);
                    this.field366.method363(var6 >> 14 & 32767, true);
                    this.field366.method365(this.field288 + var4, 0);
                }
                if (var5 == 852) {
                    boolean var60 = this.method156(0, 0, var4, 0, field419.field1570[0], 0, var3, 0, false, 0, 2, field419.field1569[0]);
                    if (!var60) {
                        this.method156(0, 1, var4, 0, field419.field1570[0], 1, var3, 0, false, 0, 2, field419.field1569[0]);
                    }
                    this.field550 = super.field624;
                    this.field551 = super.field625;
                    this.field553 = 2;
                    this.field552 = 0;
                    this.field366.method328(-818, 4);
                    this.field366.method364(var6, true);
                    this.field366.method364(this.field287 + var3, true);
                    this.field366.method365(this.field288 + var4, 0);
                }
                if (var5 == 741) {
                    class65 var62 = this.field443[var6];
                    if (var62 != null) {
                        this.method156(0, 1, var62.field1570[0], 0, field419.field1570[0], 1, var62.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        if ((var6 & 3) == 0) {
                            ++field198;
                        }
                        if (field198 >= 74) {
                            this.field366.method328(-818, 203);
                            this.field366.method329(232);
                            field198 = 0;
                        }
                        this.field366.method328(-818, 6);
                        this.field366.method330(var6);
                    }
                }
                if (var5 == 432) {
                    class8 var63 = this.field164[var6];
                    if (var63 != null) {
                        this.method156(0, 1, var63.field1570[0], 0, field419.field1570[0], 1, var63.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 87);
                        this.field366.method364(var6, true);
                    }
                }
                if (var5 == 490) {
                    this.field366.method328(-818, 65);
                    this.field366.method364(var3, true);
                    this.field366.method364(var6, true);
                    this.field366.method365(var4, 0);
                    this.field227 = 0;
                    this.field228 = var4;
                    this.field229 = var3;
                    this.field230 = 2;
                    if (class60.method538(var4).field1479 == this.field351) {
                        this.field230 = 1;
                    }
                    if (class60.method538(var4).field1479 == this.field333) {
                        this.field230 = 3;
                    }
                }
                if (var5 == 711) {
                    class65 var64 = this.field443[var6];
                    if (var64 != null) {
                        this.method156(0, 1, var64.field1570[0], 0, field419.field1570[0], 1, var64.field1569[0], 0, false, 0, 2, field419.field1569[0]);
                        this.field550 = super.field624;
                        this.field551 = super.field625;
                        this.field553 = 2;
                        this.field552 = 0;
                        this.field366.method328(-818, 16);
                        this.field366.method330(var6);
                    }
                }
                if (var5 == 1910) {
                    class58 var65 = class58.method520(var6);
                    class60 var66 = class60.method538(var4);
                    String var67;
                    if (var66 != null && var66.field1439[var3] >= 100000) {
                        var67 = var66.field1439[var3] + " x " + var65.field1378;
                    } else if (var65.field1395 != null) {
                        var67 = new String(var65.field1395);
                    } else {
                        var67 = "It's a " + var65.field1378 + ".";
                    }
                    this.method67("", false, 0, var67);
                }
                if (var5 == 149 && !this.field380) {
                    this.field366.method328(-818, 214);
                    this.field366.method330(var4);
                    this.field380 = true;
                }
                if (var5 == 246) {
                    class60 var68 = class60.method538(var4);
                    this.field464 = 1;
                    this.field465 = var4;
                    this.field466 = var68.field1429;
                    this.field184 = 0;
                    this.field543 = true;
                    String var69 = var68.field1484;
                    if (var69.indexOf(" ") != -1) {
                        var69 = var69.substring(0, var69.indexOf(" "));
                    }
                    String var70 = var68.field1484;
                    if (var70.indexOf(" ") != -1) {
                        var70 = var70.substring(var70.indexOf(" ") + 1);
                    }
                    this.field467 = var69 + " " + var68.field1466 + " " + var70;
                    if (this.field466 == 16) {
                        this.field543 = true;
                        this.field119 = 3;
                        this.field206 = true;
                    }
                } else {
                    if (var5 == 405) {
                        this.method32(false, this.field501);
                        this.field501 = -1;
                        this.field570 = true;
                    }
                    if (var5 == 236) {
                        ++field226;
                        if (field226 >= 146) {
                            this.field366.method328(-818, 36);
                            this.field366.method333(0);
                            field226 = 0;
                        }
                        this.field366.method328(-818, 226);
                        this.field366.method363(var6, true);
                        this.field366.method365(var3, 0);
                        this.field366.method363(var4, true);
                        this.field227 = 0;
                        this.field228 = var4;
                        this.field229 = var3;
                        this.field230 = 2;
                        if (class60.method538(var4).field1479 == this.field351) {
                            this.field230 = 1;
                        }
                        if (class60.method538(var4).field1479 == this.field333) {
                            this.field230 = 3;
                        }
                    }
                    if (var5 == 1532) {
                        class8 var71 = this.field164[var6];
                        if (var71 != null) {
                            class2 var72 = var71.field594;
                            if (var72.field18 != null) {
                                var72 = var72.method5(this.field365);
                            }
                            if (var72 != null) {
                                String var73;
                                if (var72.field19 != null) {
                                    var73 = new String(var72.field19);
                                } else {
                                    var73 = "It's a " + var72.field40 + ".";
                                }
                                this.method67("", false, 0, var73);
                            }
                        }
                    }
                    this.field184 = 0;
                    this.field464 = 0;
                    this.field543 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method160(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        short var4 = 256;
        for (int var5 = 10; var5 < 117; ++var5) {
            int var20 = (int) (Math.random() * 100.0D);
            if (var20 < 50) {
                this.field514[(var4 - 2 << 7) + var5] = 255;
            }
        }
        for (int var6 = 0; var6 < 100; ++var6) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            int var19 = (var18 << 7) + var17;
            this.field514[var19] = 192;
        }
        for (int var7 = 1; var7 < var4 - 1; ++var7) {
            for (int var15 = 1; var15 < 127; ++var15) {
                int var16 = (var7 << 7) + var15;
                this.field515[var16] = (this.field514[var16 - 1] + this.field514[var16 + 1] + this.field514[var16 - 128] + this.field514[var16 + 128]) / 4;
            }
        }
        this.field272 += 128;
        if (this.field272 > this.field201.length) {
            this.field272 -= this.field201.length;
            int var8 = (int) (Math.random() * 12.0D);
            this.method94(this.field234[var8], (byte) 8);
        }
        for (int var9 = 1; var9 < var4 - 1; ++var9) {
            for (int var12 = 1; var12 < 127; ++var12) {
                int var13 = (var9 << 7) + var12;
                int var14 = this.field515[var13 + 128] - this.field201[this.field272 + var13 & this.field201.length - 1] / 5;
                if (var14 < 0) {
                    var14 = 0;
                }
                this.field514[var13] = var14;
            }
        }
        for (int var10 = 0; var10 < var4 - 1; ++var10) {
            this.field565[var10] = this.field565[var10 + 1];
        }
        this.field565[var4 - 1] = (int) (Math.sin((double) field567 / 14.0D) * 16.0D + Math.sin((double) field567 / 15.0D) * 14.0D + Math.sin((double) field567 / 16.0D) * 12.0D);
        if (this.field312 > 0) {
            this.field312 -= 4;
        }
        if (this.field313 > 0) {
            this.field313 -= 4;
        }
        if (this.field312 == 0 && this.field313 == 0) {
            int var11 = (int) (Math.random() * 2000.0D);
            if (var11 == 0) {
                this.field312 = 1024;
            }
            if (var11 == 1) {
                this.field313 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
    public final void method161(boolean arg0, int arg1) {
        if (arg1 >= 7 && arg1 <= 7) {
            for (int var3 = 0; var3 < this.field165; ++var3) {
                class8 var4 = this.field164[this.field166[var3]];
                int var5 = (this.field166[var3] << 14) + 536870912;
                if (var4 != null && var4.method166(9382) && var4.field594.field30 == arg0 && var4.field594.method6(0)) {
                    int var6 = var4.field1559 >> 7;
                    int var7 = var4.field1560 >> 7;
                    if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                        if (var4.field1544 == 1 && (var4.field1559 & 127) == 64 && (var4.field1560 & 127) == 64) {
                            if (this.field478[var6][var7] == this.field121) {
                                continue;
                            }
                            this.field478[var6][var7] = this.field121;
                        }
                        if (!var4.field594.field12) {
                            var5 += Integer.MIN_VALUE;
                        }
                        this.field196.method469(var4, var4.field1559, var5, this.method69(var4.field1559, this.field556, var4.field1560, (byte) 117), var4.field1561, (var4.field1544 - 1) * 64 + 60, var4.field1590, this.field556, var4.field1560, (byte) 4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
    public final void method162(boolean arg0) {
        if (arg0) {
            field155 = !field155;
        }
        this.field366.method328(-818, 116);
        if (this.field158 != -1) {
            this.method32(false, this.field158);
            this.field158 = -1;
            this.field543 = true;
            this.field380 = false;
            this.field206 = true;
        }
        if (this.field333 != -1) {
            this.method32(false, this.field333);
            this.field333 = -1;
            this.field570 = true;
            this.field380 = false;
        }
        if (this.field246 != -1) {
            this.method32(false, this.field246);
            this.field246 = -1;
            this.field109 = true;
        }
        if (this.field387 != -1) {
            this.method32(false, this.field387);
            this.field387 = -1;
        }
        if (this.field351 != -1) {
            this.method32(false, this.field351);
            this.field351 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method163(int arg0) {
        if (this.field569 != 0) {
            class53 var2 = this.field403;
            int var3 = 0;
            if (arg0 < 8 || arg0 > 8) {
                this.field149 = this.field530.method339();
            }
            if (this.field89 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field86[var4] != null) {
                    int var5 = this.field84[var4];
                    String var6 = this.field85[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field167 == 0 || this.field167 == 1 && this.method152(true, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method439(0, "From", var9, var8, this.field233);
                        var2.method439(65535, "From", var9, var8 - 1, this.field233);
                        int var10 = var9 + var2.method437(8, "From ");
                        if (var7 == 1) {
                            this.field352[0].method530(3, var8 - 12, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field352[1].method530(3, var8 - 12, var10);
                            var10 += 14;
                        }
                        var2.method439(0, var6 + ": " + this.field86[var4], var10, var8, this.field233);
                        var2.method439(65535, var6 + ": " + this.field86[var4], var10, var8 - 1, this.field233);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field167 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method439(0, this.field86[var4], 4, var11, this.field233);
                        var2.method439(65535, this.field86[var4], 4, var11 - 1, this.field233);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field167 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method439(0, "To " + var6 + ": " + this.field86[var4], 4, var12, this.field233);
                        var2.method439(65535, "To " + var6 + ": " + this.field86[var4], 4, var12 - 1, this.field233);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
    private final void method164(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field208 = !this.field208;
        }
        if (this.field430 == 2) {
            for (class6 var2 = (class6) this.field111.method200(); var2 != null; var2 = (class6) this.field111.method202(8)) {
                if (var2.field581 > 0) {
                    --var2.field581;
                }
                if (var2.field581 == 0) {
                    if (var2.field582 < 0 || class37.method379(var2.field582, var2.field584, -402)) {
                        this.method149(var2.field576, var2.field583, var2.field584, var2.field574, var2.field575, true, var2.field582, var2.field573);
                        var2.method326();
                    }
                } else {
                    if (var2.field577 > 0) {
                        --var2.field577;
                    }
                    if (var2.field577 == 0 && var2.field575 >= 1 && var2.field576 >= 1 && var2.field575 <= 102 && var2.field576 <= 102 && (var2.field578 < 0 || class37.method379(var2.field578, var2.field580, -402))) {
                        this.method149(var2.field576, var2.field579, var2.field580, var2.field574, var2.field575, true, var2.field578, var2.field573);
                        var2.field577 = -1;
                        if (var2.field582 == var2.field578 && var2.field582 == -1) {
                            var2.method326();
                        } else if (var2.field582 == var2.field578 && var2.field583 == var2.field579 && var2.field584 == var2.field580) {
                            var2.method326();
                        }
                    }
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field500[var1] = var0 / 4;
        }
        field544 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field544[var3] = var2 - 1;
            var2 += var2;
        }
    }
}
