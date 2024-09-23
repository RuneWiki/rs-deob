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
public class client extends class39 {

    @OriginalMember(owner = "client", name = "N", descriptor = "Ljava/lang/String;")
    private String field66 = "";

    @OriginalMember(owner = "client", name = "O", descriptor = "[I")
    private int[] field67 = new int[class40.field1218];

    @OriginalMember(owner = "client", name = "P", descriptor = "Z")
    private boolean field68 = true;

    @OriginalMember(owner = "client", name = "Q", descriptor = "Z")
    private volatile boolean field69 = false;

    @OriginalMember(owner = "client", name = "S", descriptor = "[I")
    private int[] field71 = new int[9];

    @OriginalMember(owner = "client", name = "jb", descriptor = "Z")
    private boolean field88 = false;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field89 = new int[2000];

    @OriginalMember(owner = "client", name = "ob", descriptor = "Z")
    private boolean field93 = false;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Z")
    private boolean field95 = false;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[[I")
    private int[][] field102 = new int[104][104];

    @OriginalMember(owner = "client", name = "zb", descriptor = "B")
    private byte field104 = 9;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[I")
    private int[] field105 = new int[5];

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field106 = 4;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "B")
    private byte field114 = -67;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field117 = 78;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "LPGNBHFUF;")
    private class42 field121 = class42.method408((byte) 47, 1);

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[LKWBPZBYX;")
    private class30[] field122 = new class30[100];

    @OriginalMember(owner = "client", name = "Sb", descriptor = "Z")
    private boolean field123 = false;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Ljava/lang/String;")
    private String field129 = "";

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Ljava/lang/String;")
    private String field130 = "";

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field131 = -566;

    @OriginalMember(owner = "client", name = "cc", descriptor = "[I")
    private int[] field133 = new int[class40.field1218];

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field134 = 128;

    @OriginalMember(owner = "client", name = "jc", descriptor = "LFEPBPONH;")
    private class15 field140 = new class15(145);

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field143 = -1;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field144 = -1;

    @OriginalMember(owner = "client", name = "pc", descriptor = "Z")
    private boolean field146 = false;

    @OriginalMember(owner = "client", name = "rc", descriptor = "[I")
    private int[] field148 = new int[50];

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field149 = -1;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Z")
    private boolean field150 = false;

    @OriginalMember(owner = "client", name = "uc", descriptor = "Z")
    private boolean field151 = true;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Z")
    private boolean field152 = false;

    @OriginalMember(owner = "client", name = "xc", descriptor = "Z")
    private boolean field154 = false;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[J")
    private long[] field163 = new long[100];

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[I")
    private int[] field169 = new int[5];

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Ljava/lang/String;")
    private String field180 = "";

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Ljava/lang/String;")
    private String field181 = "";

    @OriginalMember(owner = "client", name = "ad", descriptor = "[LTTWFVYGB;")
    private class52[] field183 = new class52[32];

    @OriginalMember(owner = "client", name = "gd", descriptor = "[LTTWFVYGB;")
    private class52[] field189 = new class52[32];

    @OriginalMember(owner = "client", name = "id", descriptor = "Z")
    private boolean field191 = false;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field192 = 40410;

    @OriginalMember(owner = "client", name = "kd", descriptor = "[J")
    private long[] field193 = new long[200];

    @OriginalMember(owner = "client", name = "ld", descriptor = "LNPNTBMMX;")
    private class37 field194 = new class37();

    @OriginalMember(owner = "client", name = "rd", descriptor = "LPGNBHFUF;")
    private class42 field200 = class42.method408((byte) 47, 1);

    @OriginalMember(owner = "client", name = "sd", descriptor = "Z")
    private boolean field201 = true;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field202 = -1;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field203 = 2301979;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field204 = -620;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private boolean field209 = true;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field213 = 9;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "LFEPBPONH;")
    private class15 field214 = new class15(145);

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[I")
    public int[] field216 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[[[I")
    private int[][][] field220 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field222 = 7759444;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[LTTWFVYGB;")
    private class52[] field227 = new class52[1000];

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    private boolean field229 = false;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Z")
    private boolean field243 = true;

    @OriginalMember(owner = "client", name = "je", descriptor = "Z")
    private boolean field244 = false;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field248 = 50;

    @OriginalMember(owner = "client", name = "oe", descriptor = "[I")
    private int[] field249 = new int[this.field248];

    @OriginalMember(owner = "client", name = "pe", descriptor = "[I")
    private int[] field250 = new int[this.field248];

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    private int[] field251 = new int[this.field248];

    @OriginalMember(owner = "client", name = "re", descriptor = "[I")
    private int[] field252 = new int[this.field248];

    @OriginalMember(owner = "client", name = "se", descriptor = "[I")
    private int[] field253 = new int[this.field248];

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field254 = new int[this.field248];

    @OriginalMember(owner = "client", name = "ue", descriptor = "[I")
    private int[] field255 = new int[this.field248];

    @OriginalMember(owner = "client", name = "ve", descriptor = "[Ljava/lang/String;")
    private String[] field256 = new String[this.field248];

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    private int[] field277 = new int[1000];

    @OriginalMember(owner = "client", name = "Re", descriptor = "[I")
    private int[] field278 = new int[1000];

    @OriginalMember(owner = "client", name = "Se", descriptor = "[B")
    private byte[] field279 = new byte[16384];

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Ljava/lang/String;")
    private String field281 = "";

    @OriginalMember(owner = "client", name = "We", descriptor = "[Ljava/lang/String;")
    private String[] field283 = new String[100];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[I")
    private int[] field284 = new int[100];

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Z")
    private boolean field286 = false;

    @OriginalMember(owner = "client", name = "af", descriptor = "[I")
    private int[] field287 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "bf", descriptor = "Z")
    private boolean field288 = false;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Z")
    private boolean field293 = true;

    @OriginalMember(owner = "client", name = "hf", descriptor = "Z")
    public boolean field294 = true;

    @OriginalMember(owner = "client", name = "jf", descriptor = "[[[LFEPBPONH;")
    private class15[][][] field295 = new class15[4][104][104];

    @OriginalMember(owner = "client", name = "kf", descriptor = "[I")
    private int[] field296 = new int[200];

    @OriginalMember(owner = "client", name = "lf", descriptor = "[I")
    private int[] field297 = new int[5];

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field299 = 11603;

    @OriginalMember(owner = "client", name = "of", descriptor = "[LBBRQYCNY;")
    private class2[] field300 = new class2[4];

    @OriginalMember(owner = "client", name = "sf", descriptor = "B")
    private byte field304 = 5;

    @OriginalMember(owner = "client", name = "tf", descriptor = "Z")
    private boolean field305 = true;

    @OriginalMember(owner = "client", name = "uf", descriptor = "[I")
    private int[] field306 = new int[151];

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field308 = 2048;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field309 = 2047;

    @OriginalMember(owner = "client", name = "yf", descriptor = "[LZQANNJZE;")
    private class69[] field310 = new class69[this.field308];

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    public int[] field312 = new int[this.field308];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[I")
    private int[] field314 = new int[this.field308];

    @OriginalMember(owner = "client", name = "Df", descriptor = "[LPGNBHFUF;")
    private class42[] field315 = new class42[this.field308];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Z")
    private boolean field317 = false;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field318 = -1;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "[LTTWFVYGB;")
    private class52[] field319 = new class52[8];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field323 = -1;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field325 = new int[4000];

    @OriginalMember(owner = "client", name = "Of", descriptor = "[I")
    private int[] field326 = new int[4000];

    @OriginalMember(owner = "client", name = "Rf", descriptor = "[I")
    private int[] field329 = new int[7];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Z")
    private boolean field332 = false;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Z")
    private boolean field334 = true;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field335 = -1;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field336 = new int[33];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "LPGNBHFUF;")
    private class42 field337 = class42.method408((byte) 47, 1);

    @OriginalMember(owner = "client", name = "bg", descriptor = "Ljava/lang/String;")
    private String field339 = "";

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field343 = -347;

    @OriginalMember(owner = "client", name = "gg", descriptor = "[LTTWFVYGB;")
    private class52[] field344 = new class52[20];

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field347 = -1;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Z")
    private boolean field348 = false;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field349 = 3353893;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field352 = -730;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field358 = 2;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[LKWBPZBYX;")
    private class30[] field359 = new class30[13];

    @OriginalMember(owner = "client", name = "xg", descriptor = "Z")
    private boolean field361 = false;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Ljava/lang/String;")
    private String field362 = "";

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field372 = 974;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "[I")
    public int[] field373 = new int[2000];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field375 = 1;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field377 = -1;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Ljava/lang/String;")
    private String field379 = "";

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Z")
    private boolean field380 = false;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "[Ljava/lang/String;")
    private String[] field381 = new String[5];

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[Z")
    private boolean[] field382 = new boolean[5];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    private boolean field387 = false;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Z")
    private boolean field388 = false;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Z")
    private boolean field389 = false;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Z")
    public boolean field392 = false;

    @OriginalMember(owner = "client", name = "dh", descriptor = "[Ljava/lang/String;")
    private String[] field393 = new String[200];

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field394 = 3;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field395 = -1;

    @OriginalMember(owner = "client", name = "gh", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field396 = new CRC32();

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field398 = 365;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[LTTWFVYGB;")
    private class52[] field400 = new class52[32];

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field403 = -1;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field405 = 1;

    @OriginalMember(owner = "client", name = "qh", descriptor = "[I")
    private int[] field406 = new int[5];

    @OriginalMember(owner = "client", name = "th", descriptor = "Z")
    private boolean field409 = false;

    @OriginalMember(owner = "client", name = "uh", descriptor = "Z")
    private boolean field410 = false;

    @OriginalMember(owner = "client", name = "vh", descriptor = "Z")
    private boolean field411 = true;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field418 = -1;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "[I")
    private int[] field421 = new int[500];

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    private int[] field422 = new int[500];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[I")
    private int[] field423 = new int[500];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[I")
    private int[] field424 = new int[500];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Z")
    private boolean field425 = false;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field426 = -550;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "[I")
    private int[] field430 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Z")
    private boolean field431 = true;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "LPGNBHFUF;")
    private class42 field432 = new class42(5, new byte[5000]);

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[LGBGUDIMT;")
    private class17[] field433 = new class17[16384];

    @OriginalMember(owner = "client", name = "Th", descriptor = "[I")
    public int[] field435 = new int[16384];

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field436 = -1;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Z")
    private boolean field437 = false;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "[[I")
    private int[][] field438 = new int[104][104];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    private final int[] field439 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[[I")
    private int[][] field440 = new int[104][104];

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[LKWBPZBYX;")
    private class30[] field441 = new class30[2];

    @OriginalMember(owner = "client", name = "di", descriptor = "[I")
    private int[] field445 = new int[class40.field1218];

    @OriginalMember(owner = "client", name = "ei", descriptor = "[LRUMGIOMW;")
    public class47[] field446 = new class47[5];

    @OriginalMember(owner = "client", name = "fi", descriptor = "[I")
    private int[] field447 = new int[151];

    @OriginalMember(owner = "client", name = "gi", descriptor = "[LTTWFVYGB;")
    private class52[] field448 = new class52[100];

    @OriginalMember(owner = "client", name = "hi", descriptor = "[I")
    private int[] field449 = new int[33];

    @OriginalMember(owner = "client", name = "ii", descriptor = "LFEPBPONH;")
    private class15 field450 = new class15(145);

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field451 = -1;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private final int field452 = 100;

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    private int[] field453 = new int[100];

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field454 = -58;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Z")
    private boolean field468 = true;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    private int[] field473 = new int[50];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field474 = -252;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "B")
    private byte field475 = 97;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Z")
    private boolean field476 = true;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field478 = 2;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Z")
    private boolean field479 = true;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "Ljava/lang/String;")
    private String field482 = "";

    @OriginalMember(owner = "client", name = "Pi", descriptor = "B")
    private byte field483 = 5;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field484 = 5063219;

    @OriginalMember(owner = "client", name = "Si", descriptor = "[I")
    private int[] field486 = new int[50];

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Z")
    private boolean field489 = false;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "[I")
    private int[] field492 = new int[256];

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field494 = -398;

    @OriginalMember(owner = "client", name = "bj", descriptor = "[Ljava/lang/String;")
    private String[] field495 = new String[500];

    @OriginalMember(owner = "client", name = "hj", descriptor = "[I")
    private int[] field501 = new int[100];

    @OriginalMember(owner = "client", name = "ij", descriptor = "[Ljava/lang/String;")
    private String[] field502 = new String[100];

    @OriginalMember(owner = "client", name = "jj", descriptor = "[Ljava/lang/String;")
    private String[] field503 = new String[100];

    @OriginalMember(owner = "client", name = "mj", descriptor = "Z")
    private volatile boolean field506 = false;

    @OriginalMember(owner = "client", name = "nj", descriptor = "B")
    private byte field507 = 9;

    @OriginalMember(owner = "client", name = "pj", descriptor = "Z")
    private boolean field509 = true;

    @OriginalMember(owner = "client", name = "tj", descriptor = "Z")
    private boolean field513 = false;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field514 = 6;

    @OriginalMember(owner = "client", name = "wj", descriptor = "[I")
    public int[] field516 = new int[1000];

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field522 = 2;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "Z")
    private boolean field526 = false;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "Z")
    private boolean field527 = true;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field530 = -1;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "Z")
    private volatile boolean field531 = false;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "[Z")
    private boolean[] field532 = new boolean[5];

    @OriginalMember(owner = "client", name = "Oj", descriptor = "[I")
    private int[] field534 = new int[5];

    @OriginalMember(owner = "client", name = "Tj", descriptor = "I")
    private int field539 = 6;

    @OriginalMember(owner = "client", name = "nk", descriptor = "I")
    private int field559 = -1;

    @OriginalMember(owner = "client", name = "R", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field70 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private static int field112 = 46093;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "[I")
    private static int[] field113 = new int[99];

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private static int field125;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Z")
    private static boolean field127;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private static int field132;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field164;

    @OriginalMember(owner = "client", name = "hd", descriptor = "Ljava/lang/String;")
    private static String field190;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private static int field205;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private static int field223;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    public static int[] field225;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Z")
    private static boolean field228;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[[I")
    public static final int[][] field378;

    @OriginalMember(owner = "client", name = "ah", descriptor = "B")
    private static byte field390;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "[I")
    public static final int[] field529;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private static int field115;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private static int field116;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private static int field161;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private static int field217;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private static int field226;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private static int field235;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private static int field239;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private static int field246;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private static int field274;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private static int field338;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private static int field342;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private static int field351;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private static int field363;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private static int field365;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private static int field487;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private static int field488;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private static int field490;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client", name = "Vj", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client", name = "ck", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client", name = "dk", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client", name = "ek", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client", name = "fk", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "gk", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client", name = "ik", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client", name = "jk", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client", name = "kk", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client", name = "lk", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client", name = "mk", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client", name = "ok", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private static int field63;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field85;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private static int field91;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "J")
    private long field107;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "J")
    private long field210;

    @OriginalMember(owner = "client", name = "fe", descriptor = "J")
    private long field240;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "J")
    public long field485;

    @OriginalMember(owner = "client", name = "nb", descriptor = "J")
    private long field92;

    @OriginalMember(owner = "client", name = "J", descriptor = "LHHMTQDYM;")
    private class20 field62;

    @OriginalMember(owner = "client", name = "ke", descriptor = "LKFVPSSJH;")
    private class28 field245;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "LKWBPZBYX;")
    private class30 field218;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "LKWBPZBYX;")
    private class30 field219;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "LKWBPZBYX;")
    private class30 field230;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "LKWBPZBYX;")
    private class30 field231;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "LKWBPZBYX;")
    private class30 field232;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "LKWBPZBYX;")
    private class30 field233;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "LKWBPZBYX;")
    private class30 field234;

    @OriginalMember(owner = "client", name = "we", descriptor = "LKWBPZBYX;")
    private class30 field257;

    @OriginalMember(owner = "client", name = "xe", descriptor = "LKWBPZBYX;")
    private class30 field258;

    @OriginalMember(owner = "client", name = "ye", descriptor = "LKWBPZBYX;")
    private class30 field259;

    @OriginalMember(owner = "client", name = "yi", descriptor = "LKWBPZBYX;")
    private class30 field466;

    @OriginalMember(owner = "client", name = "zi", descriptor = "LKWBPZBYX;")
    private class30 field467;

    @OriginalMember(owner = "client", name = "qj", descriptor = "LKWBPZBYX;")
    private class30 field510;

    @OriginalMember(owner = "client", name = "rj", descriptor = "LKWBPZBYX;")
    private class30 field511;

    @OriginalMember(owner = "client", name = "sj", descriptor = "LKWBPZBYX;")
    private class30 field512;

    @OriginalMember(owner = "client", name = "ab", descriptor = "LKWBPZBYX;")
    private class30 field79;

    @OriginalMember(owner = "client", name = "bb", descriptor = "LKWBPZBYX;")
    private class30 field80;

    @OriginalMember(owner = "client", name = "cb", descriptor = "LKWBPZBYX;")
    private class30 field81;

    @OriginalMember(owner = "client", name = "db", descriptor = "LKWBPZBYX;")
    private class30 field82;

    @OriginalMember(owner = "client", name = "eb", descriptor = "LKWBPZBYX;")
    private class30 field83;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "LMVSFNVJP;")
    private class34 field170;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "LMVSFNVJP;")
    private class34 field171;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "LMVSFNVJP;")
    private class34 field172;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "LMVSFNVJP;")
    private class34 field173;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "LMVSFNVJP;")
    private class34 field174;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "LMVSFNVJP;")
    private class34 field175;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "LMVSFNVJP;")
    private class34 field176;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "LMVSFNVJP;")
    private class34 field177;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "LMVSFNVJP;")
    private class34 field178;

    @OriginalMember(owner = "client", name = "ze", descriptor = "LMVSFNVJP;")
    private class34 field260;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "LMVSFNVJP;")
    private class34 field261;

    @OriginalMember(owner = "client", name = "Be", descriptor = "LMVSFNVJP;")
    private class34 field262;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "LMVSFNVJP;")
    private class34 field263;

    @OriginalMember(owner = "client", name = "De", descriptor = "LMVSFNVJP;")
    private class34 field264;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "LMVSFNVJP;")
    private class34 field265;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "LMVSFNVJP;")
    private class34 field266;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "LMVSFNVJP;")
    private class34 field267;

    @OriginalMember(owner = "client", name = "He", descriptor = "LMVSFNVJP;")
    private class34 field268;

    @OriginalMember(owner = "client", name = "pg", descriptor = "LMVSFNVJP;")
    private class34 field353;

    @OriginalMember(owner = "client", name = "qg", descriptor = "LMVSFNVJP;")
    private class34 field354;

    @OriginalMember(owner = "client", name = "rg", descriptor = "LMVSFNVJP;")
    private class34 field355;

    @OriginalMember(owner = "client", name = "sg", descriptor = "LMVSFNVJP;")
    private class34 field356;

    @OriginalMember(owner = "client", name = "ai", descriptor = "LMVSFNVJP;")
    private class34 field442;

    @OriginalMember(owner = "client", name = "bi", descriptor = "LMVSFNVJP;")
    private class34 field443;

    @OriginalMember(owner = "client", name = "ci", descriptor = "LMVSFNVJP;")
    private class34 field444;

    @OriginalMember(owner = "client", name = "ic", descriptor = "LBDQVRRZB;")
    private class3 field139;

    @OriginalMember(owner = "client", name = "yb", descriptor = "LQDHHNYHL;")
    private class44 field103;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "LTTWFVYGB;")
    private class52 field110;

    @OriginalMember(owner = "client", name = "qc", descriptor = "LTTWFVYGB;")
    private class52 field147;

    @OriginalMember(owner = "client", name = "yd", descriptor = "LTTWFVYGB;")
    private class52 field207;

    @OriginalMember(owner = "client", name = "zd", descriptor = "LTTWFVYGB;")
    private class52 field208;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "LTTWFVYGB;")
    private class52 field419;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "LTTWFVYGB;")
    private class52 field420;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "LTTWFVYGB;")
    private class52 field427;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "LTTWFVYGB;")
    private class52 field428;

    @OriginalMember(owner = "client", name = "kj", descriptor = "LTTWFVYGB;")
    private class52 field504;

    @OriginalMember(owner = "client", name = "lj", descriptor = "LTTWFVYGB;")
    private class52 field505;

    @OriginalMember(owner = "client", name = "T", descriptor = "LTTWFVYGB;")
    private class52 field72;

    @OriginalMember(owner = "client", name = "U", descriptor = "LTTWFVYGB;")
    private class52 field73;

    @OriginalMember(owner = "client", name = "V", descriptor = "LTTWFVYGB;")
    private class52 field74;

    @OriginalMember(owner = "client", name = "W", descriptor = "LTTWFVYGB;")
    private class52 field75;

    @OriginalMember(owner = "client", name = "X", descriptor = "LTTWFVYGB;")
    private class52 field76;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "LXUAWPLCH;")
    private class62 field165;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "LXUAWPLCH;")
    private class62 field166;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "LXUAWPLCH;")
    private class62 field167;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "LXUAWPLCH;")
    private class62 field168;

    @OriginalMember(owner = "client", name = "md", descriptor = "LYMDQNWFI;")
    public class65 field195;

    @OriginalMember(owner = "client", name = "xd", descriptor = "LZQANNJZE;")
    public static class69 field206;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "LDGAWSPEW;")
    private class9 field124;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Ljava/lang/String;")
    private String field316;

    @OriginalMember(owner = "client", name = "mh", descriptor = "Ljava/lang/String;")
    private String field402;

    @OriginalMember(owner = "client", name = "ui", descriptor = "Ljava/lang/String;")
    public String field462;

    @OriginalMember(owner = "client", name = "hk", descriptor = "Ljava/lang/String;")
    public String field553;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Ljava/net/Socket;")
    private Socket field480;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "Z")
    private static boolean field111;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Z")
    private static boolean field128;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Z")
    private static boolean field215;

    @OriginalMember(owner = "client", name = "lh", descriptor = "Z")
    public static boolean field401;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "Z")
    public static boolean field528;

    @OriginalMember(owner = "client", name = "kc", descriptor = "[I")
    private int[] field141;

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field142;

    @OriginalMember(owner = "client", name = "pf", descriptor = "[I")
    private int[] field301;

    @OriginalMember(owner = "client", name = "qf", descriptor = "[I")
    private int[] field302;

    @OriginalMember(owner = "client", name = "rf", descriptor = "[I")
    private int[] field303;

    @OriginalMember(owner = "client", name = "hg", descriptor = "[I")
    private int[] field345;

    @OriginalMember(owner = "client", name = "ig", descriptor = "[I")
    private int[] field346;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[I")
    private int[] field469;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    private int[] field470;

    @OriginalMember(owner = "client", name = "Di", descriptor = "[I")
    private int[] field471;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[I")
    private int[] field472;

    @OriginalMember(owner = "client", name = "Yj", descriptor = "[I")
    private int[] field544;

    @OriginalMember(owner = "client", name = "Zj", descriptor = "[I")
    private int[] field545;

    @OriginalMember(owner = "client", name = "ak", descriptor = "[I")
    private int[] field546;

    @OriginalMember(owner = "client", name = "bk", descriptor = "[I")
    private int[] field547;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[LKWBPZBYX;")
    private class30[] field364;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[[B")
    private byte[][] field145;

    @OriginalMember(owner = "client", name = "nd", descriptor = "[[B")
    private byte[][] field196;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "[[[B")
    private byte[][][] field533;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[[[I")
    private int[][][] field491;

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method63(byte arg0) {
        class46 var2 = (class46) this.field450.method269();
        if (arg0 != -48) {
            this.field295 = null;
        }
        while (var2 != null) {
            if (this.field179 == var2.field1386 && field525 <= var2.field1379) {
                if (field525 >= var2.field1378) {
                    if (var2.field1376 > 0) {
                        class17 var3 = this.field433[var2.field1376 - 1];
                        if (var3 != null && var3.field719 >= 0 && var3.field719 < 13312 && var3.field720 >= 0 && var3.field720 < 13312) {
                            var2.method490(field525, var3.field720, (byte) -41, this.method91(var2.field1386, var3.field719, false, var3.field720) - var2.field1371, var3.field719);
                        }
                    }
                    if (var2.field1376 < 0) {
                        int var4 = -var2.field1376 - 1;
                        class69 var5;
                        if (this.field436 == var4) {
                            var5 = field206;
                        } else {
                            var5 = this.field310[var4];
                        }
                        if (var5 != null && var5.field719 >= 0 && var5.field719 < 13312 && var5.field720 >= 0 && var5.field720 < 13312) {
                            var2.method490(field525, var5.field720, (byte) -41, this.method91(var2.field1386, var5.field719, false, var5.field720) - var2.field1371, var5.field719);
                        }
                    }
                    var2.method489(this.field305, this.field508);
                    this.field245.method323(var2, (int) var2.field1361, 1000, 60, this.field179, false, (int) var2.field1360, -1, (int) var2.field1359, var2.field1384);
                }
            } else {
                var2.method221();
            }
            var2 = (class46) this.field450.method271(15175);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method64(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field141[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field141[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field142[var14] = (this.field141[var14 - 1] + this.field141[var14 + 1] + this.field141[var14 - 128] + this.field141[var14 + 128]) / 4;
            }
        }
        if (arg0 != 5) {
            this.field98 = this.field337.method420();
        }
        this.field241 += 128;
        if (this.field241 > this.field345.length) {
            this.field241 -= this.field345.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method77(this.field364[var6], 0);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field142[var11 + 128] - this.field345[this.field241 + var11 & this.field345.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field141[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field492[var8] = this.field492[var8 + 1];
        }
        this.field492[var2 - 1] = (int) (Math.sin((double) field525 / 14.0D) * 16.0D + Math.sin((double) field525 / 15.0D) * 14.0D + Math.sin((double) field525 / 16.0D) * 12.0D);
        if (this.field464 > 0) {
            this.field464 -= 4;
        }
        if (this.field465 > 0) {
            this.field465 -= 4;
        }
        if (this.field464 == 0 && this.field465 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field464 = 1024;
            }
            if (var9 == 1) {
                this.field465 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V")
    public final void method65(byte arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field559 != -1) {
            this.field316 = arg3;
            super.field1209 = 0;
        }
        if (this.field323 == -1) {
            this.field380 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field501[var5] = this.field501[var5 - 1];
            this.field502[var5] = this.field502[var5 - 1];
            this.field503[var5] = this.field503[var5 - 1];
        }
        if (arg0 == 8) {
            boolean var6 = false;
        } else {
            this.method123();
        }
        this.field501[0] = arg1;
        this.field502[0] = arg2;
        this.field503[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILPGNBHFUF;)V")
    private final void method66(int arg0, int arg1, class42 arg2) {
        arg2.method430(true);
        if (arg0 >= 0) {
            this.field68 = !this.field68;
        }
        int var4 = arg2.method431(1, this.field191);
        if (var4 != 0) {
            int var5 = arg2.method431(2, this.field191);
            if (var5 == 0) {
                this.field314[this.field313++] = this.field309;
            } else if (var5 == 1) {
                int var6 = arg2.method431(3, this.field191);
                field206.method264(var6, false, 719);
                int var7 = arg2.method431(1, this.field191);
                if (var7 == 1) {
                    this.field314[this.field313++] = this.field309;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method431(3, this.field191);
                field206.method264(var8, true, 719);
                int var9 = arg2.method431(3, this.field191);
                field206.method264(var9, true, 719);
                int var10 = arg2.method431(1, this.field191);
                if (var10 == 1) {
                    this.field314[this.field313++] = this.field309;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method431(1, this.field191);
                if (var11 == 1) {
                    this.field314[this.field313++] = this.field309;
                }
                int var12 = arg2.method431(7, this.field191);
                int var13 = arg2.method431(7, this.field191);
                int var14 = arg2.method431(1, this.field191);
                this.field179 = arg2.method431(2, this.field191);
                field206.method262(var14 == 1, var13, false, var12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(III)Z")
    public final boolean method67(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg1 < 0 || arg1 > 0) {
            this.method123();
        }
        class37 var5 = class37.method393(arg2);
        for (int var6 = 0; var6 < var5.field1119.length && var5.field1119[var6] != -1; ++var6) {
            class37 var7 = class37.method393(var5.field1119[var6]);
            if (var7.field1153 == 1) {
                var4 |= this.method67(arg0, field115, var7.field1160);
            }
            if (var7.field1153 == 6 && (var7.field1109 != -1 || var7.field1110 != -1)) {
                boolean var8 = this.method119(var7, 4);
                int var9;
                if (var8) {
                    var9 = var7.field1110;
                } else {
                    var9 = var7.field1109;
                }
                if (var9 != -1) {
                    class29 var10 = class29.field1014[var9];
                    var7.field1154 += arg0;
                    while (var7.field1154 > var10.method364(this.field192, var7.field1132)) {
                        var7.field1154 -= var10.method364(this.field192, var7.field1132) + 1;
                        ++var7.field1132;
                        if (var7.field1132 >= var10.field1015) {
                            var7.field1132 -= var10.field1019;
                            if (var7.field1132 < 0 || var7.field1132 >= var10.field1015) {
                                var7.field1132 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1153 == 6 && var7.field1123 != 0) {
                int var11 = var7.field1123 >> 16;
                int var12 = var7.field1123 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field1169 = var7.field1169 + var13 & 2047;
                var7.field1170 = var7.field1170 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method68(byte arg0) {
        byte[] var2 = this.field103.method488("title.dat", (byte[]) null);
        class52 var3 = new class52(var2, this);
        this.field263.method377(this.field201);
        var3.method509(0, 673, 0);
        this.field264.method377(this.field201);
        if (arg0 == 7) {
            boolean var4 = false;
        } else {
            field112 = 61;
        }
        var3.method509(-637, 673, 0);
        this.field260.method377(this.field201);
        var3.method509(-128, 673, 0);
        this.field261.method377(this.field201);
        var3.method509(-202, 673, -371);
        this.field262.method377(this.field201);
        var3.method509(-202, 673, -171);
        this.field265.method377(this.field201);
        var3.method509(0, 673, -265);
        this.field266.method377(this.field201);
        var3.method509(-562, 673, -265);
        this.field267.method377(this.field201);
        var3.method509(-128, 673, -171);
        this.field268.method377(this.field201);
        var3.method509(-562, 673, -171);
        int[] var5 = new int[var3.field1435];
        for (int var6 = 0; var6 < var3.field1436; ++var6) {
            for (int var11 = 0; var11 < var3.field1435; ++var11) {
                var5[var11] = var3.field1434[var3.field1435 * var6 + (var3.field1435 - var11 - 1)];
            }
            for (int var12 = 0; var12 < var3.field1435; ++var12) {
                var3.field1434[var3.field1435 * var6 + var12] = var5[var12];
            }
        }
        this.field263.method377(this.field201);
        var3.method509(382, 673, 0);
        this.field264.method377(this.field201);
        var3.method509(-255, 673, 0);
        this.field260.method377(this.field201);
        var3.method509(254, 673, 0);
        this.field261.method377(this.field201);
        var3.method509(180, 673, -371);
        this.field262.method377(this.field201);
        var3.method509(180, 673, -171);
        this.field265.method377(this.field201);
        var3.method509(382, 673, -265);
        this.field266.method377(this.field201);
        var3.method509(-180, 673, -265);
        this.field267.method377(this.field201);
        var3.method509(254, 673, -171);
        this.field268.method377(this.field201);
        var3.method509(-180, 673, -171);
        class52 var7 = new class52(this.field103, "logo", 0);
        this.field260.method377(this.field201);
        var7.method511(382 - var7.field1435 / 2 - 128, 18, false);
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        System.gc();
        if (class8.field617) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LPGNBHFUF;ZI)V")
    private final void method69(class42 arg0, boolean arg1, int arg2) {
        arg0.method430(true);
        int var4 = arg0.method431(8, this.field191);
        if (var4 < this.field434) {
            for (int var5 = var4; var5 < this.field434; ++var5) {
                this.field516[this.field515++] = this.field435[var5];
            }
        }
        if (var4 > this.field434) {
            signlink.reporterror(this.field180 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field434 = 0;
            if (!arg1) {
                this.field244 = !this.field244;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field435[var6];
                class17 var8 = this.field433[var7];
                int var9 = arg0.method431(1, this.field191);
                if (var9 == 0) {
                    this.field435[this.field434++] = var7;
                    var8.field742 = field525;
                } else {
                    int var10 = arg0.method431(2, this.field191);
                    if (var10 == 0) {
                        this.field435[this.field434++] = var7;
                        var8.field742 = field525;
                        this.field314[this.field313++] = var7;
                    } else if (var10 == 1) {
                        this.field435[this.field434++] = var7;
                        var8.field742 = field525;
                        int var11 = arg0.method431(3, this.field191);
                        var8.method264(var11, false, 719);
                        int var12 = arg0.method431(1, this.field191);
                        if (var12 == 1) {
                            this.field314[this.field313++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field435[this.field434++] = var7;
                        var8.field742 = field525;
                        int var13 = arg0.method431(3, this.field191);
                        var8.method264(var13, true, 719);
                        int var14 = arg0.method431(3, this.field191);
                        var8.method264(var14, true, 719);
                        int var15 = arg0.method431(1, this.field191);
                        if (var15 == 1) {
                            this.field314[this.field313++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field516[this.field515++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method70(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field434; ++var3) {
            class17 var4 = this.field433[this.field435[var3]];
            int var5 = (this.field435[var3] << 14) + 536870912;
            if (var4 != null && var4.method263((byte) 15) && var4.field796.field1502 == arg0 && var4.field796.method530(-39117)) {
                int var6 = var4.field719 >> 7;
                int var7 = var4.field720 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field710 == 1 && (var4.field719 & 127) == 64 && (var4.field720 & 127) == 64) {
                        if (this.field438[var6][var7] == this.field96) {
                            continue;
                        }
                        this.field438[var6][var7] = this.field96;
                    }
                    if (!var4.field796.field1511) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field245.method323(var4, this.method91(this.field179, var4.field719, false, var4.field720), 1000, (var4.field710 - 1) * 64 + 60, this.field179, var4.field718, var4.field720, var5, var4.field719, var4.field721);
                }
            }
        }
        if (arg1 != 0) {
            this.field98 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method71(int arg0, int arg1) {
        class15 var3 = this.field295[this.field179][arg0][arg1];
        if (var3 == null) {
            this.field245.method333(this.field179, arg0, arg1);
        } else {
            int var4 = -99999999;
            class4 var5 = null;
            for (class4 var6 = (class4) var3.method269(); var6 != null; var6 = (class4) var3.method271(15175)) {
                class22 var11 = class22.method290(var6.field35);
                int var12 = var11.field858;
                if (var11.field875) {
                    var12 = (var6.field33 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method267(var5, true);
            class4 var7 = null;
            class4 var8 = null;
            for (class4 var9 = (class4) var3.method269(); var9 != null; var9 = (class4) var3.method271(15175)) {
                if (var5.field35 != var9.field35 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field35 != var9.field35 && var7.field35 != var9.field35 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field245.method319(var7, var5, this.method91(this.field179, arg0 * 128 + 64, false, arg1 * 128 + 64), var10, arg0, (byte) 7, arg1, var8, this.field179);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILNPNTBMMX;IIIIII)V")
    public final void method72(int arg0, int arg1, class37 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field152) {
            this.field153 = 32;
        } else {
            this.field153 = 0;
        }
        this.field152 = false;
        int var10 = 37 / arg5;
        if (arg6 >= arg3 && arg6 < arg3 + 16 && arg0 >= arg1 && arg0 < arg1 + 16) {
            arg2.field1156 -= this.field290 * 4;
            if (arg4 == 1) {
                this.field361 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field380 = true;
            }
        } else if (arg6 >= arg3 && arg6 < arg3 + 16 && arg0 >= arg1 + arg8 - 16 && arg0 < arg1 + arg8) {
            arg2.field1156 += this.field290 * 4;
            if (arg4 == 1) {
                this.field361 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field380 = true;
            }
        } else if (arg6 >= arg3 - this.field153 && arg6 < arg3 + 16 + this.field153 && arg0 >= arg1 + 16 && arg0 < arg1 + arg8 - 16 && this.field290 > 0) {
            int var11 = (arg8 - 32) * arg8 / arg7;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg0 - arg1 - 16 - var11 / 2;
            int var13 = arg8 - 32 - var11;
            arg2.field1156 = (arg7 - arg8) * var12 / var13;
            if (arg4 == 1) {
                this.field361 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field380 = true;
            }
            this.field152 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method73(int arg0, boolean arg1) {
        int[] var3 = this.field110.field1434;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field533[arg0][var24][var6] & 24) == 0) {
                    this.field245.method347(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field533[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field245.method347(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        if (!arg1) {
            field112 = -23;
        }
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field110.method506(this.field201);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field533[arg0][var22][var9] & 24) == 0) {
                    this.method148(var7, arg0, var9, var8, var22, (byte) 9);
                }
                if (arg0 < 3 && (this.field533[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method148(var7, arg0 + 1, var9, var8, var22, (byte) 9);
                }
            }
        }
        if (this.field355 != null) {
            this.field355.method377(this.field201);
            class10.field680 = this.field546;
        }
        this.field276 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field245.method341(this.field179, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class7.method219(var13).field569;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field300[this.field179].field26;
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
                        this.field227[this.field276] = this.field448[var14];
                        this.field277[this.field276] = var15;
                        this.field278[this.field276] = var16;
                        ++this.field276;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method74(int arg0) {
        if (this.field498 == 0) {
            this.field495[0] = "Cancel";
            this.field423[0] = 1961;
            this.field383 = 1;
            if (this.field451 != -1) {
                this.field197 = 0;
                this.field64 = 0;
                this.method198(0, 0, super.field1204, 0, (byte) 3, class37.method393(this.field451), super.field1203, 0);
                if (this.field197 != this.field119) {
                    this.field119 = this.field197;
                }
                if (this.field64 != this.field320) {
                    this.field320 = this.field64;
                }
            } else {
                this.method110(this.field468);
                this.field197 = 0;
                this.field64 = 0;
                if (super.field1203 > 4 && super.field1204 > 4 && super.field1203 < 516 && super.field1204 < 338) {
                    if (this.field318 != -1) {
                        this.method198(4, 0, super.field1204, 4, (byte) 3, class37.method393(this.field318), super.field1203, 0);
                    } else {
                        this.method104((byte) 5);
                    }
                }
                if (this.field197 != this.field119) {
                    this.field119 = this.field197;
                }
                if (this.field64 != this.field320) {
                    this.field320 = this.field64;
                }
                this.field197 = 0;
                this.field64 = 0;
                if (super.field1203 > 553 && super.field1204 > 205 && super.field1203 < 743 && super.field1204 < 466) {
                    if (this.field395 != -1) {
                        this.method198(205, 0, super.field1204, 553, (byte) 3, class37.method393(this.field395), super.field1203, 1);
                    } else if (this.field430[this.field394] != -1) {
                        this.method198(205, 0, super.field1204, 553, (byte) 3, class37.method393(this.field430[this.field394]), super.field1203, 1);
                    }
                }
                if (this.field90 != this.field197) {
                    this.field361 = true;
                    this.field90 = this.field197;
                }
                if (this.field64 != this.field289) {
                    this.field361 = true;
                    this.field289 = this.field64;
                }
                this.field197 = 0;
                this.field64 = 0;
                int var2 = 51 / arg0;
                if (super.field1203 > 17 && super.field1204 > 357 && super.field1203 < 496 && super.field1204 < 453) {
                    if (this.field323 != -1) {
                        this.method198(357, 0, super.field1204, 17, (byte) 3, class37.method393(this.field323), super.field1203, 2);
                    } else if (this.field559 != -1) {
                        this.method198(357, 0, super.field1204, 17, (byte) 3, class37.method393(this.field559), super.field1203, 3);
                    } else if (super.field1204 < 434 && super.field1203 < 426 && this.field397 == 0) {
                        this.method161(super.field1204 - 357, super.field1203 - 17, (byte) 5);
                    }
                }
                if ((this.field323 != -1 || this.field559 != -1) && this.field198 != this.field197) {
                    this.field380 = true;
                    this.field198 = this.field197;
                }
                if ((this.field323 != -1 || this.field559 != -1) && this.field64 != this.field280) {
                    this.field380 = true;
                    this.field280 = this.field64;
                }
                boolean var3 = false;
                while (!var3) {
                    var3 = true;
                    for (int var4 = 0; var4 < this.field383 - 1; ++var4) {
                        if (this.field423[var4] < 1000 && this.field423[var4 + 1] > 1000) {
                            String var5 = this.field495[var4];
                            this.field495[var4] = this.field495[var4 + 1];
                            this.field495[var4 + 1] = var5;
                            int var6 = this.field423[var4];
                            this.field423[var4] = this.field423[var4 + 1];
                            this.field423[var4 + 1] = var6;
                            int var7 = this.field421[var4];
                            this.field421[var4] = this.field421[var4 + 1];
                            this.field421[var4 + 1] = var7;
                            int var8 = this.field422[var4];
                            this.field422[var4] = this.field422[var4 + 1];
                            this.field422[var4 + 1] = var8;
                            int var9 = this.field424[var4];
                            this.field424[var4] = this.field424[var4 + 1];
                            this.field424[var4 + 1] = var9;
                            var3 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method75(byte arg0) {
        if (this.field463 != 0) {
            class62 var2 = this.field166;
            if (arg0 == -29) {
                int var3 = 0;
                if (this.field321 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field503[var4] != null) {
                        int var5 = this.field501[var4];
                        String var6 = this.field502[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field350 == 0 || this.field350 == 1 && this.method79((byte) -124, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method538(0, var8, 862, var9, "From");
                            var2.method538(65535, var8 - 1, 862, var9, "From");
                            int var10 = var9 + var2.method536(false, "From ");
                            if (var7 == 1) {
                                this.field441[0].method371(var10, var8 - 12, false);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field441[1].method371(var10, var8 - 12, false);
                                var10 += 14;
                            }
                            var2.method538(0, var8, 862, var10, var6 + ": " + this.field503[var4]);
                            var2.method538(65535, var8 - 1, 862, var10, var6 + ": " + this.field503[var4]);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field350 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method538(0, var11, 862, 4, this.field503[var4]);
                            var2.method538(65535, var11 - 1, 862, 4, this.field503[var4]);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field350 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method538(0, var12, 862, 4, "To " + var6 + ": " + this.field503[var4]);
                            var2.method538(65535, var12 - 1, 862, 4, "To " + var6 + ": " + this.field503[var4]);
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

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method76(int arg0) {
        if (arg0 >= 0) {
            this.method123();
        }
        if (this.field481 == 0) {
            int var2 = super.field1193 / 2 - 80;
            int var3 = super.field1194 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1209 == 1 && super.field1210 >= var2 - 75 && super.field1210 <= var2 + 75 && super.field1211 >= var14 - 20 && super.field1211 <= var14 + 20) {
                this.field481 = 3;
                this.field493 = 0;
            }
            int var4 = super.field1193 / 2 + 80;
            if (super.field1209 == 1 && super.field1210 >= var4 - 75 && super.field1210 <= var4 + 75 && super.field1211 >= var14 - 20 && super.field1211 <= var14 + 20) {
                this.field129 = "";
                this.field130 = "Enter your username & password.";
                this.field481 = 2;
                this.field493 = 0;
            }
        } else if (this.field481 == 2) {
            int var5 = super.field1194 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1209 == 1 && super.field1211 >= var16 - 15 && super.field1211 < var16) {
                this.field493 = 0;
            }
            var5 = var16 + 15;
            if (super.field1209 == 1 && super.field1211 >= var5 - 15 && super.field1211 < var5) {
                this.field493 = 1;
            }
            var5 += 15;
            int var6 = super.field1193 / 2 - 80;
            int var7 = super.field1194 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1209 == 1 && super.field1210 >= var6 - 75 && super.field1210 <= var6 + 75 && super.field1211 >= var17 - 20 && super.field1211 <= var17 + 20) {
                this.field540 = 0;
                this.method118(this.field180, this.field181, false);
                if (this.field392) {
                    return;
                }
            }
            int var8 = super.field1193 / 2 + 80;
            if (super.field1209 == 1 && super.field1210 >= var8 - 75 && super.field1210 <= var8 + 75 && super.field1211 >= var17 - 20 && super.field1211 <= var17 + 20) {
                this.field481 = 0;
                this.field180 = "";
                this.field181 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method407(false);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field190.length(); ++var11) {
                        if (var9 == field190.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field493 == 0) {
                        if (var9 == 8 && this.field180.length() > 0) {
                            this.field180 = this.field180.substring(0, this.field180.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field493 = 1;
                        }
                        if (var10) {
                            this.field180 = this.field180 + (char) var9;
                        }
                        if (this.field180.length() > 12) {
                            this.field180 = this.field180.substring(0, 12);
                        }
                    } else if (this.field493 == 1) {
                        if (var9 == 8 && this.field181.length() > 0) {
                            this.field181 = this.field181.substring(0, this.field181.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field493 = 0;
                        }
                        if (var10) {
                            this.field181 = this.field181 + (char) var9;
                        }
                        if (this.field181.length() > 20) {
                            this.field181 = this.field181.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field481 == 3) {
                int var12 = super.field1193 / 2;
                int var13 = super.field1194 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1209 == 1 && super.field1210 >= var12 - 75 && super.field1210 <= var12 + 75 && super.field1211 >= var18 - 20 && super.field1211 <= var18 + 20) {
                    this.field481 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKWBPZBYX;I)V")
    public final void method77(class30 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field345.length; ++var4) {
            this.field345[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field345[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field346[var16] = (this.field345[var16 - 1] + this.field345[var16 + 1] + this.field345[var16 - 128] + this.field345[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field345;
            this.field345 = this.field346;
            this.field346 = var14;
        }
        if (arg1 != 0) {
            this.field299 = this.field139.method51();
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1040; ++var8) {
                for (int var9 = 0; var9 < arg0.field1039; ++var9) {
                    if (arg0.field1037[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1041;
                        int var11 = var8 + 16 + arg0.field1042;
                        int var12 = (var11 << 7) + var10;
                        this.field345[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILPGNBHFUF;)V")
    private final void method78(int arg0, int arg1, class42 arg2) {
        for (int var4 = 0; var4 < this.field313; ++var4) {
            int var5 = this.field314[var4];
            class69 var6 = this.field310[var5];
            int var7 = arg2.method420();
            if ((var7 & 16) != 0) {
                var7 += arg2.method420() << 8;
            }
            this.method193(var5, var6, -252, arg2, var7);
        }
        if (arg0 != 0) {
            this.field98 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method79(byte arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field327; ++var3) {
                if (arg1.equalsIgnoreCase(this.field393[var3])) {
                    return true;
                }
            }
            if (arg0 != -124) {
                this.field295 = null;
            }
            return arg1.equalsIgnoreCase(field206.field1708);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method80(boolean arg0, int arg1, int arg2) {
        signlink.midivol = arg2;
        if (arg1 < 7 || arg1 > 7) {
            this.field398 = this.field139.method51();
        }
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method81(int arg0) {
        ++field342;
        if (field342 > 88) {
            field342 = 0;
            this.field200.method409((byte) -81, 139);
        }
        for (int var2 = 0; var2 < this.field434; ++var2) {
            int var3 = this.field435[var2];
            class17 var4 = this.field433[var3];
            if (var4 != null) {
                this.method82(var4, var4.field796.field1503, false);
            }
        }
        if (arg0 == 4) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEGCNSKZO;IZ)V")
    public final void method82(class12 arg0, int arg1, boolean arg2) {
        if (arg0.field719 < 128 || arg0.field720 < 128 || arg0.field719 >= 13184 || arg0.field720 >= 13184) {
            arg0.field737 = -1;
            arg0.field713 = -1;
            arg0.field703 = 0;
            arg0.field704 = 0;
            arg0.field719 = arg0.field750[0] * 128 + arg0.field710 * 64;
            arg0.field720 = arg0.field751[0] * 128 + arg0.field710 * 64;
            arg0.method261(true);
        }
        if (field206 == arg0 && (arg0.field719 < 1536 || arg0.field720 < 1536 || arg0.field719 >= 11776 || arg0.field720 >= 11776)) {
            arg0.field737 = -1;
            arg0.field713 = -1;
            arg0.field703 = 0;
            arg0.field704 = 0;
            arg0.field719 = arg0.field750[0] * 128 + arg0.field710 * 64;
            arg0.field720 = arg0.field751[0] * 128 + arg0.field710 * 64;
            arg0.method261(true);
        }
        if (arg0.field703 > field525) {
            this.method83(false, arg0);
        } else if (arg0.field704 >= field525) {
            this.method84(arg0, 3);
        } else {
            this.method85(true, arg0);
        }
        this.method86(this.field343, arg0);
        if (arg2) {
            this.field372 = 292;
        }
        this.method87(arg0, (byte) 1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLEGCNSKZO;)V")
    public final void method83(boolean arg0, class12 arg1) {
        int var3 = arg1.field703 - field525;
        int var4 = arg1.field710 * 64 + arg1.field699 * 128;
        int var5 = arg1.field710 * 64 + arg1.field701 * 128;
        if (arg0) {
            this.field200.method410(169);
        }
        arg1.field719 += (var4 - arg1.field719) / var3;
        arg1.field720 += (var5 - arg1.field720) / var3;
        arg1.field722 = 0;
        if (arg1.field705 == 0) {
            arg1.field723 = 1024;
        }
        if (arg1.field705 == 1) {
            arg1.field723 = 1536;
        }
        if (arg1.field705 == 2) {
            arg1.field723 = 0;
        }
        if (arg1.field705 == 3) {
            arg1.field723 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEGCNSKZO;I)V")
    public final void method84(class12 arg0, int arg1) {
        if (arg1 != 3) {
            this.field295 = null;
        }
        if (field525 == arg0.field704 || arg0.field737 == -1 || arg0.field740 != 0 || arg0.field739 + 1 > class29.field1014[arg0.field737].method364(this.field192, arg0.field738)) {
            int var3 = arg0.field704 - arg0.field703;
            int var4 = field525 - arg0.field703;
            int var5 = arg0.field710 * 64 + arg0.field699 * 128;
            int var6 = arg0.field710 * 64 + arg0.field701 * 128;
            int var7 = arg0.field710 * 64 + arg0.field700 * 128;
            int var8 = arg0.field710 * 64 + arg0.field702 * 128;
            arg0.field719 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field720 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field722 = 0;
        if (arg0.field705 == 0) {
            arg0.field723 = 1024;
        }
        if (arg0.field705 == 1) {
            arg0.field723 = 1536;
        }
        if (arg0.field705 == 2) {
            arg0.field723 = 0;
        }
        if (arg0.field705 == 3) {
            arg0.field723 = 512;
        }
        arg0.field721 = arg0.field723;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLEGCNSKZO;)V")
    public final void method85(boolean arg0, class12 arg1) {
        arg1.field706 = arg1.field748;
        this.field392 &= arg0;
        if (arg1.field712 == 0) {
            arg1.field722 = 0;
        } else {
            if (arg1.field737 != -1 && arg1.field740 == 0) {
                class29 var3 = class29.field1014[arg1.field737];
                if (arg1.field732 > 0 && var3.field1026 == 0) {
                    ++arg1.field722;
                    return;
                }
                if (arg1.field732 <= 0 && var3.field1027 == 0) {
                    ++arg1.field722;
                    return;
                }
            }
            int var4 = arg1.field719;
            int var5 = arg1.field720;
            int var6 = arg1.field750[arg1.field712 - 1] * 128 + arg1.field710 * 64;
            int var7 = arg1.field751[arg1.field712 - 1] * 128 + arg1.field710 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field723 = 1280;
                    } else if (var5 > var7) {
                        arg1.field723 = 1792;
                    } else {
                        arg1.field723 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field723 = 768;
                    } else if (var5 > var7) {
                        arg1.field723 = 256;
                    } else {
                        arg1.field723 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field723 = 1024;
                } else {
                    arg1.field723 = 0;
                }
                int var8 = arg1.field723 - arg1.field721 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field728;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field727;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field730;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field729;
                }
                if (var9 == -1) {
                    var9 = arg1.field727;
                }
                arg1.field706 = var9;
                int var10 = 4;
                if (arg1.field723 != arg1.field721 && arg1.field725 == -1 && arg1.field711 != 0) {
                    var10 = 2;
                }
                if (arg1.field712 > 2) {
                    var10 = 6;
                }
                if (arg1.field712 > 3) {
                    var10 = 8;
                }
                if (arg1.field722 > 0 && arg1.field712 > 1) {
                    var10 = 8;
                    --arg1.field722;
                }
                if (arg1.field724[arg1.field712 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field727 == arg1.field706 && arg1.field743 != -1) {
                    arg1.field706 = arg1.field743;
                }
                if (var4 < var6) {
                    arg1.field719 += var10;
                    if (arg1.field719 > var6) {
                        arg1.field719 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field719 -= var10;
                    if (arg1.field719 < var6) {
                        arg1.field719 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field720 += var10;
                    if (arg1.field720 > var7) {
                        arg1.field720 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field720 -= var10;
                    if (arg1.field720 < var7) {
                        arg1.field720 = var7;
                    }
                }
                if (arg1.field719 == var6 && arg1.field720 == var7) {
                    --arg1.field712;
                    if (arg1.field732 > 0) {
                        --arg1.field732;
                        return;
                    }
                }
            } else {
                arg1.field719 = var6;
                arg1.field720 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILEGCNSKZO;)V")
    public final void method86(int arg0, class12 arg1) {
        while (arg0 >= 0) {
            this.field200.method410(15);
        }
        if (arg1.field711 != 0) {
            if (arg1.field725 != -1 && arg1.field725 < 32768) {
                class17 var3 = this.field433[arg1.field725];
                if (var3 != null) {
                    int var4 = arg1.field719 - var3.field719;
                    int var5 = arg1.field720 - var3.field720;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field723 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field725 >= 32768) {
                int var6 = arg1.field725 - 32768;
                if (this.field436 == var6) {
                    var6 = this.field309;
                }
                class69 var7 = this.field310[var6];
                if (var7 != null) {
                    int var8 = arg1.field719 - var7.field719;
                    int var9 = arg1.field720 - var7.field720;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field723 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field697 != 0 || arg1.field698 != 0) && (arg1.field712 == 0 || arg1.field722 > 0)) {
                int var10 = arg1.field719 - (arg1.field697 - this.field535 - this.field535) * 64;
                int var11 = arg1.field720 - (arg1.field698 - this.field536 - this.field536) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field723 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field697 = 0;
                arg1.field698 = 0;
            }
            int var12 = arg1.field723 - arg1.field721 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field711 && var12 <= 2048 - arg1.field711) {
                    if (var12 > 1024) {
                        arg1.field721 -= arg1.field711;
                    } else {
                        arg1.field721 += arg1.field711;
                    }
                } else {
                    arg1.field721 = arg1.field723;
                }
                arg1.field721 &= 2047;
                if (arg1.field748 == arg1.field706 && arg1.field723 != arg1.field721) {
                    if (arg1.field749 != -1) {
                        arg1.field706 = arg1.field749;
                        return;
                    }
                    arg1.field706 = arg1.field727;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LEGCNSKZO;B)V")
    public final void method87(class12 arg0, byte arg1) {
        if (arg1 == 1) {
            arg0.field718 = false;
            if (arg0.field706 != -1) {
                class29 var3 = class29.field1014[arg0.field706];
                ++arg0.field708;
                if (arg0.field707 < var3.field1015 && arg0.field708 > var3.method364(this.field192, arg0.field707)) {
                    arg0.field708 = 0;
                    ++arg0.field707;
                }
                if (arg0.field707 >= var3.field1015) {
                    arg0.field708 = 0;
                    arg0.field707 = 0;
                }
            }
            if (arg0.field713 != -1 && field525 >= arg0.field716) {
                if (arg0.field714 < 0) {
                    arg0.field714 = 0;
                }
                class29 var4 = class6.field49[arg0.field713].field53;
                ++arg0.field715;
                while (arg0.field714 < var4.field1015 && arg0.field715 > var4.method364(this.field192, arg0.field714)) {
                    arg0.field715 -= var4.method364(this.field192, arg0.field714);
                    ++arg0.field714;
                }
                if (arg0.field714 >= var4.field1015 && (arg0.field714 < 0 || arg0.field714 >= var4.field1015)) {
                    arg0.field713 = -1;
                }
            }
            if (arg0.field737 != -1 && arg0.field740 <= 1) {
                class29 var5 = class29.field1014[arg0.field737];
                if (var5.field1026 == 1 && arg0.field732 > 0 && arg0.field703 <= field525 && arg0.field704 < field525) {
                    arg0.field740 = 1;
                    return;
                }
            }
            if (arg0.field737 != -1 && arg0.field740 == 0) {
                class29 var6 = class29.field1014[arg0.field737];
                ++arg0.field739;
                while (arg0.field738 < var6.field1015 && arg0.field739 > var6.method364(this.field192, arg0.field738)) {
                    arg0.field739 -= var6.method364(this.field192, arg0.field738);
                    ++arg0.field738;
                }
                if (arg0.field738 >= var6.field1015) {
                    arg0.field738 -= var6.field1019;
                    ++arg0.field741;
                    if (arg0.field741 >= var6.field1025) {
                        arg0.field737 = -1;
                    }
                    if (arg0.field738 < 0 || arg0.field738 >= var6.field1015) {
                        arg0.field737 = -1;
                    }
                }
                arg0.field718 = var6.field1021;
            }
            if (arg0.field740 > 0) {
                --arg0.field740;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method88(byte arg0) {
        if (arg0 == 85) {
            if (this.field451 == -1 || this.field307 != 2 && super.field1196 == null) {
                if (this.field332) {
                    this.method114(-30461);
                    this.field332 = false;
                    this.field170.method378(0, 0, 4, super.field1195);
                    this.field171.method378(0, 0, 357, super.field1195);
                    this.field172.method378(722, 0, 4, super.field1195);
                    this.field173.method378(743, 0, 205, super.field1195);
                    this.field174.method378(0, 0, 0, super.field1195);
                    this.field175.method378(516, 0, 4, super.field1195);
                    this.field176.method378(516, 0, 205, super.field1195);
                    this.field177.method378(496, 0, 357, super.field1195);
                    this.field178.method378(0, 0, 338, super.field1195);
                    this.field361 = true;
                    this.field380 = true;
                    this.field410 = true;
                    this.field389 = true;
                    if (this.field307 != 2) {
                        this.field355.method378(4, 0, 4, super.field1195);
                        this.field354.method378(550, 0, 4, super.field1195);
                    }
                    ++field338;
                    if (field338 > 1212) {
                        field338 = 0;
                        this.field200.method409((byte) -81, 186);
                        this.field200.method410(0);
                        int var4 = this.field200.field1250;
                        this.field200.method410(215);
                        if ((int) (Math.random() * 2.0D) == 0) {
                            this.field200.method410(193);
                        }
                        this.field200.method410((int) (Math.random() * 256.0D));
                        this.field200.method411((int) (Math.random() * 65536.0D));
                        this.field200.method410((int) (Math.random() * 256.0D));
                        this.field200.method411(42728);
                        this.field200.method411(52291);
                        if ((int) (Math.random() * 2.0D) == 0) {
                            this.field200.method410(186);
                        }
                        this.field200.method411(18581);
                        this.field200.method410(44);
                        this.field200.method419((byte) 5, this.field200.field1250 - var4);
                    }
                }
                if (this.field307 == 2) {
                    this.method155((byte) -122);
                }
                if (this.field154 && this.field184 == 1) {
                    this.field361 = true;
                }
                if (this.field395 != -1) {
                    boolean var5 = this.method67(this.field508, field115, this.field395);
                    if (var5) {
                        this.field361 = true;
                    }
                }
                if (this.field520 == 2) {
                    this.field361 = true;
                }
                if (this.field498 == 2) {
                    this.field361 = true;
                }
                if (this.field361) {
                    this.method186(7);
                    this.field361 = false;
                }
                if (this.field323 == -1 && this.field397 == 0) {
                    this.field194.field1156 = this.field117 - this.field558 - 77;
                    if (super.field1203 > 448 && super.field1203 < 560 && super.field1204 > 332) {
                        this.method72(super.field1204 - 357, 0, this.field194, 463, -1, 706, super.field1203 - 17, this.field117, 77);
                    }
                    int var6 = this.field117 - 77 - this.field194.field1156;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var6 > this.field117 - 77) {
                        var6 = this.field117 - 77;
                    }
                    if (this.field558 != var6) {
                        this.field558 = var6;
                        this.field380 = true;
                    }
                    ++field365;
                    if (field365 > 129) {
                        field365 = 0;
                        this.field200.method409((byte) -81, 134);
                        this.field200.method414(0);
                    }
                }
                if (this.field323 == -1 && this.field397 == 3) {
                    int var7 = this.field282 * 14 + 7;
                    this.field194.field1156 = this.field285;
                    if (super.field1203 > 448 && super.field1203 < 560 && super.field1204 > 332) {
                        this.method72(super.field1204 - 357, 0, this.field194, 463, -1, 706, super.field1203 - 17, var7, 77);
                    }
                    int var8 = this.field194.field1156;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    if (var8 > var7 - 77) {
                        var8 = var7 - 77;
                    }
                    if (this.field285 != var8) {
                        this.field285 = var8;
                        this.field380 = true;
                    }
                }
                if (this.field323 != -1) {
                    boolean var9 = this.method67(this.field508, field115, this.field323);
                    if (var9) {
                        this.field380 = true;
                    }
                }
                if (this.field520 == 3) {
                    this.field380 = true;
                }
                if (this.field498 == 3) {
                    this.field380 = true;
                }
                if (this.field316 != null) {
                    this.field380 = true;
                }
                if (this.field154 && this.field184 == 2) {
                    this.field380 = true;
                }
                if (this.field380) {
                    this.method140(-12139);
                    this.field380 = false;
                }
                if (this.field307 == 2) {
                    this.method93(true);
                    this.field354.method378(550, 0, 4, super.field1195);
                }
                if (this.field418 != -1) {
                    this.field410 = true;
                }
                if (this.field410) {
                    if (this.field418 != -1 && this.field418 == this.field394) {
                        this.field418 = -1;
                        this.field200.method409((byte) -81, 237);
                        this.field200.method410(this.field394);
                    }
                    this.field410 = false;
                    this.field444.method377(this.field201);
                    this.field512.method371(0, 0, false);
                    if (this.field395 == -1) {
                        if (this.field430[this.field394] != -1) {
                            if (this.field394 == 0) {
                                this.field79.method371(22, 10, false);
                            }
                            if (this.field394 == 1) {
                                this.field80.method371(54, 8, false);
                            }
                            if (this.field394 == 2) {
                                this.field80.method371(82, 8, false);
                            }
                            if (this.field394 == 3) {
                                this.field81.method371(110, 8, false);
                            }
                            if (this.field394 == 4) {
                                this.field83.method371(153, 8, false);
                            }
                            if (this.field394 == 5) {
                                this.field83.method371(181, 8, false);
                            }
                            if (this.field394 == 6) {
                                this.field82.method371(209, 9, false);
                            }
                        }
                        if (this.field430[0] != -1 && (this.field418 != 0 || field525 % 20 < 10)) {
                            this.field359[0].method371(29, 13, false);
                        }
                        if (this.field430[1] != -1 && (this.field418 != 1 || field525 % 20 < 10)) {
                            this.field359[1].method371(53, 11, false);
                        }
                        if (this.field430[2] != -1 && (this.field418 != 2 || field525 % 20 < 10)) {
                            this.field359[2].method371(82, 11, false);
                        }
                        if (this.field430[3] != -1 && (this.field418 != 3 || field525 % 20 < 10)) {
                            this.field359[3].method371(115, 12, false);
                        }
                        if (this.field430[4] != -1 && (this.field418 != 4 || field525 % 20 < 10)) {
                            this.field359[4].method371(153, 13, false);
                        }
                        if (this.field430[5] != -1 && (this.field418 != 5 || field525 % 20 < 10)) {
                            this.field359[5].method371(180, 11, false);
                        }
                        if (this.field430[6] != -1 && (this.field418 != 6 || field525 % 20 < 10)) {
                            this.field359[6].method371(208, 13, false);
                        }
                    }
                    this.field444.method378(516, 0, 160, super.field1195);
                    this.field443.method377(this.field201);
                    this.field511.method371(0, 0, false);
                    if (this.field395 == -1) {
                        if (this.field430[this.field394] != -1) {
                            if (this.field394 == 7) {
                                this.field230.method371(42, 0, false);
                            }
                            if (this.field394 == 8) {
                                this.field231.method371(74, 0, false);
                            }
                            if (this.field394 == 9) {
                                this.field231.method371(102, 0, false);
                            }
                            if (this.field394 == 10) {
                                this.field232.method371(130, 1, false);
                            }
                            if (this.field394 == 11) {
                                this.field234.method371(173, 0, false);
                            }
                            if (this.field394 == 12) {
                                this.field234.method371(201, 0, false);
                            }
                            if (this.field394 == 13) {
                                this.field233.method371(229, 0, false);
                            }
                        }
                        if (this.field430[8] != -1 && (this.field418 != 8 || field525 % 20 < 10)) {
                            this.field359[7].method371(74, 2, false);
                        }
                        if (this.field430[9] != -1 && (this.field418 != 9 || field525 % 20 < 10)) {
                            this.field359[8].method371(102, 3, false);
                        }
                        if (this.field430[10] != -1 && (this.field418 != 10 || field525 % 20 < 10)) {
                            this.field359[9].method371(137, 4, false);
                        }
                        if (this.field430[11] != -1 && (this.field418 != 11 || field525 % 20 < 10)) {
                            this.field359[10].method371(174, 2, false);
                        }
                        if (this.field430[12] != -1 && (this.field418 != 12 || field525 % 20 < 10)) {
                            this.field359[11].method371(201, 2, false);
                        }
                        if (this.field430[13] != -1 && (this.field418 != 13 || field525 % 20 < 10)) {
                            this.field359[12].method371(226, 2, false);
                        }
                    }
                    this.field443.method378(496, 0, 466, super.field1195);
                    this.field355.method377(this.field201);
                    class10.field680 = this.field546;
                }
                if (this.field389) {
                    this.field389 = false;
                    this.field442.method377(this.field201);
                    this.field510.method371(0, 0, false);
                    this.field166.method535("Public chat", 16777215, true, 28, 33387, 55);
                    if (this.field366 == 0) {
                        this.field166.method535("On", 65280, true, 41, 33387, 55);
                    }
                    if (this.field366 == 1) {
                        this.field166.method535("Friends", 16776960, true, 41, 33387, 55);
                    }
                    if (this.field366 == 2) {
                        this.field166.method535("Off", 16711680, true, 41, 33387, 55);
                    }
                    if (this.field366 == 3) {
                        this.field166.method535("Hide", 65535, true, 41, 33387, 55);
                    }
                    this.field166.method535("Private chat", 16777215, true, 28, 33387, 184);
                    if (this.field350 == 0) {
                        this.field166.method535("On", 65280, true, 41, 33387, 184);
                    }
                    if (this.field350 == 1) {
                        this.field166.method535("Friends", 16776960, true, 41, 33387, 184);
                    }
                    if (this.field350 == 2) {
                        this.field166.method535("Off", 16711680, true, 41, 33387, 184);
                    }
                    this.field166.method535("Trade/compete", 16777215, true, 28, 33387, 324);
                    if (this.field407 == 0) {
                        this.field166.method535("On", 65280, true, 41, 33387, 324);
                    }
                    if (this.field407 == 1) {
                        this.field166.method535("Friends", 16776960, true, 41, 33387, 324);
                    }
                    if (this.field407 == 2) {
                        this.field166.method535("Off", 16711680, true, 41, 33387, 324);
                    }
                    this.field166.method535("Report abuse", 16777215, true, 33, 33387, 458);
                    this.field442.method378(0, 0, 453, super.field1195);
                    this.field355.method377(this.field201);
                    class10.field680 = this.field546;
                }
                this.field508 = 0;
            } else {
                if (this.field307 == 2) {
                    this.method67(this.field508, field115, this.field451);
                    if (this.field377 != -1) {
                        this.method67(this.field508, field115, this.field377);
                    }
                    this.field508 = 0;
                    this.method90((byte) 26);
                    super.field1196.method377(this.field201);
                    class10.field680 = this.field547;
                    class67.method579(false);
                    this.field332 = true;
                    class37 var2 = class37.method393(this.field451);
                    if (var2.field1111 == 512 && var2.field1106 == 334 && var2.field1153 == 0) {
                        var2.field1111 = 765;
                        var2.field1106 = 503;
                    }
                    this.method170(0, var2, 0, 0, false);
                    if (this.field377 != -1) {
                        class37 var3 = class37.method393(this.field377);
                        if (var3.field1111 == 512 && var3.field1106 == 334 && var3.field1153 == 0) {
                            var3.field1111 = 765;
                            var3.field1106 = 503;
                        }
                        this.method170(0, var3, 0, 0, false);
                    }
                    if (!this.field154) {
                        this.method74(566);
                        this.method115(true);
                    } else {
                        this.method160(0);
                    }
                }
                super.field1196.method378(0, 0, 0, super.field1195);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method89(int arg0) {
        if (arg0 != 0) {
            this.method123();
        }
        this.field247 = 0;
        for (int var2 = -1; var2 < this.field434 + this.field311; ++var2) {
            class12 var19;
            if (var2 == -1) {
                var19 = field206;
            } else if (var2 < this.field311) {
                var19 = this.field310[this.field312[var2]];
            } else {
                var19 = this.field433[this.field435[var2 - this.field311]];
            }
            if (var19 != null && var19.method263((byte) 15)) {
                if (var19 instanceof class17) {
                    class58 var20 = ((class17) var19).field796;
                    if (var20.field1522 != null) {
                        var20 = var20.method526((byte) 3);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field311) {
                    class58 var23 = ((class17) var19).field796;
                    if (var23.field1519 >= 0 && var23.field1519 < this.field189.length) {
                        this.method177(-3853, var19, var19.field731 + 15);
                        if (this.field143 > -1) {
                            this.field189[var23.field1519].method511(this.field143 - 12, this.field144 - 30, false);
                        }
                    }
                    if (this.field322 == 1 && this.field435[var2 - this.field311] == this.field455 && field525 % 20 < 10) {
                        this.method177(-3853, var19, var19.field731 + 15);
                        if (this.field143 > -1) {
                            this.field183[0].method511(this.field143 - 12, this.field144 - 28, false);
                        }
                    }
                } else {
                    int var21 = 30;
                    class69 var22 = (class69) var19;
                    if (var22.field1709 != -1 || var22.field1701 != -1) {
                        this.method177(-3853, var19, var19.field731 + 15);
                        if (this.field143 > -1) {
                            if (var22.field1709 != -1) {
                                this.field400[var22.field1709].method511(this.field143 - 12, this.field144 - var21, false);
                                var21 += 25;
                            }
                            if (var22.field1701 != -1) {
                                this.field189[var22.field1701].method511(this.field143 - 12, this.field144 - var21, false);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field322 == 10 && this.field312[var2] == this.field155) {
                        this.method177(-3853, var19, var19.field731 + 15);
                        if (this.field143 > -1) {
                            this.field183[1].method511(this.field143 - 12, this.field144 - var21, false);
                        }
                    }
                }
                if (var19.field744 != null && (var2 >= this.field311 || this.field366 == 0 || this.field366 == 3 || this.field366 == 1 && this.method79((byte) -124, ((class69) var19).field1708))) {
                    this.method177(-3853, var19, var19.field731);
                    if (this.field143 > -1 && this.field247 < this.field248) {
                        this.field252[this.field247] = this.field167.method537(var19.field744, (byte) -107) / 2;
                        this.field251[this.field247] = this.field167.field1595;
                        this.field249[this.field247] = this.field143;
                        this.field250[this.field247] = this.field144;
                        this.field253[this.field247] = var19.field709;
                        this.field254[this.field247] = var19.field752;
                        this.field255[this.field247] = var19.field726;
                        this.field256[this.field247++] = var19.field744;
                        if (this.field324 == 0 && var19.field752 >= 1 && var19.field752 <= 3) {
                            this.field251[this.field247] += 10;
                            this.field250[this.field247] += 5;
                        }
                        if (this.field324 == 0 && var19.field752 == 4) {
                            this.field252[this.field247] = 60;
                        }
                        if (this.field324 == 0 && var19.field752 == 5) {
                            this.field251[this.field247] += 5;
                        }
                    }
                }
                if (var19.field745 > field525) {
                    this.method177(-3853, var19, var19.field731 + 15);
                    if (this.field143 > -1) {
                        int var24 = var19.field746 * 30 / var19.field747;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class67.method581(this.field143 - 15, (byte) 109, 65280, var24, 5, this.field144 - 3);
                        class67.method581(this.field143 - 15 + var24, (byte) 109, 16711680, 30 - var24, 5, this.field144 - 3);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field736[var25] > field525) {
                        this.method177(-3853, var19, var19.field731 / 2);
                        if (this.field143 > -1) {
                            if (var25 == 1) {
                                this.field144 -= 20;
                            }
                            if (var25 == 2) {
                                this.field143 -= 15;
                                this.field144 -= 10;
                            }
                            if (var25 == 3) {
                                this.field143 += 15;
                                this.field144 -= 10;
                            }
                            this.field344[var19.field735[var25]].method511(this.field143 - 12, this.field144 - 12, false);
                            this.field165.method534(this.field143, 648, this.field144 + 4, String.valueOf(var19.field734[var25]), 0);
                            this.field165.method534(this.field143 - 1, 648, this.field144 + 3, String.valueOf(var19.field734[var25]), 16777215);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field247; ++var3) {
            int var4 = this.field249[var3];
            int var5 = this.field250[var3];
            int var6 = this.field252[var3];
            int var7 = this.field251[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field250[var18] - this.field251[var18] && var5 - var7 < this.field250[var18] + 2 && var4 - var6 < this.field252[var18] + this.field249[var18] && var4 + var6 > this.field249[var18] - this.field252[var18] && this.field250[var18] - this.field251[var18] < var5) {
                        var5 = this.field250[var18] - this.field251[var18];
                        var8 = true;
                    }
                }
            }
            this.field143 = this.field249[var3];
            this.field144 = this.field250[var3] = var5;
            String var9 = this.field256[var3];
            if (this.field324 == 0) {
                int var10 = 16776960;
                if (this.field253[var3] < 6) {
                    var10 = this.field287[this.field253[var3]];
                }
                if (this.field253[var3] == 6) {
                    var10 = this.field96 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field253[var3] == 7) {
                    var10 = this.field96 % 20 < 10 ? 255 : 65535;
                }
                if (this.field253[var3] == 8) {
                    var10 = this.field96 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field253[var3] == 9) {
                    int var11 = 150 - this.field255[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field253[var3] == 10) {
                    int var12 = 150 - this.field255[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field253[var3] == 11) {
                    int var13 = 150 - this.field255[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field254[var3] == 0) {
                    this.field167.method534(this.field143, 648, this.field144 + 1, var9, 0);
                    this.field167.method534(this.field143, 648, this.field144, var9, var10);
                }
                if (this.field254[var3] == 1) {
                    this.field167.method539(this.field144 + 1, 0, this.field143, this.field96, true, var9);
                    this.field167.method539(this.field144, var10, this.field143, this.field96, true, var9);
                }
                if (this.field254[var3] == 2) {
                    this.field167.method540(this.field144 + 1, (byte) 8, this.field96, var9, this.field143, 0);
                    this.field167.method540(this.field144, (byte) 8, this.field96, var9, this.field143, var10);
                }
                if (this.field254[var3] == 3) {
                    this.field167.method541(this.field96, 0, this.field143, var9, this.field144 + 1, 150 - this.field255[var3], 68);
                    this.field167.method541(this.field96, var10, this.field143, var9, this.field144, 150 - this.field255[var3], 68);
                }
                if (this.field254[var3] == 4) {
                    int var14 = this.field167.method537(var9, (byte) -107);
                    int var15 = (150 - this.field255[var3]) * (var14 + 100) / 150;
                    class67.method578(this.field143 + 50, 0, this.field143 - 50, 334, 5);
                    this.field167.method538(0, this.field144 + 1, 862, this.field143 + 50 - var15, var9);
                    this.field167.method538(var10, this.field144, 862, this.field143 + 50 - var15, var9);
                    class67.method577(-423);
                }
                if (this.field254[var3] == 5) {
                    int var16 = 150 - this.field255[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class67.method578(512, this.field144 - this.field167.field1595 - 1, 0, this.field144 + 5, 5);
                    this.field167.method534(this.field143, 648, this.field144 + 1 + var17, var9, 0);
                    this.field167.method534(this.field143, 648, this.field144 + var17, var9, var10);
                    class67.method577(-423);
                }
            } else {
                this.field167.method534(this.field143, 648, this.field144 + 1, var9, 0);
                this.field167.method534(this.field143, 648, this.field144, var9, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method90(byte arg0) {
        if (super.field1196 == null) {
            this.method125(true);
            this.field260 = null;
            this.field261 = null;
            this.field262 = null;
            if (arg0 != 26) {
                field111 = !field111;
            }
            this.field263 = null;
            this.field264 = null;
            this.field265 = null;
            this.field266 = null;
            this.field267 = null;
            this.field268 = null;
            this.field356 = null;
            this.field354 = null;
            this.field353 = null;
            this.field355 = null;
            this.field442 = null;
            this.field443 = null;
            this.field444 = null;
            super.field1196 = new class34(this.method174(false), 503, 765, 284);
            this.field332 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)I")
    public final int method91(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.field533[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg1 & 127;
            int var9 = arg3 & 127;
            if (arg2) {
                this.field509 = !this.field509;
            }
            int var10 = (128 - var8) * this.field491[var7][var5][var6] + this.field491[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field491[var7][var5][var6 + 1] + this.field491[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Z")
    public final boolean method92(int arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var3 = false;
        } else {
            this.field213 = -347;
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var4 = this.field423[arg0];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            return var4 == 201;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.field354.method377(this.field201);
        if (!arg0) {
            this.field200.method410(164);
        }
        if (this.field298 == 2) {
            byte[] var2 = this.field258.field1037;
            int[] var3 = class67.field1670;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field419.method515(this.field135, 25, this.field336, 25, 0, 33, 256, -579, this.field449, 33, 0);
            this.field355.method377(this.field201);
            class10.field680 = this.field546;
        } else {
            int var6 = this.field521 + this.field135 & 2047;
            int var7 = field206.field719 / 32 + 48;
            int var8 = 464 - field206.field720 / 32;
            this.field110.method515(var6, var8, this.field306, var7, 25, 151, this.field374 + 256, -579, this.field447, 146, 5);
            this.field419.method515(this.field135, 25, this.field336, 25, 0, 33, 256, -579, this.field449, 33, 0);
            for (int var9 = 0; var9 < this.field276; ++var9) {
                int var39 = this.field277[var9] * 4 + 2 - field206.field719 / 32;
                int var40 = this.field278[var9] * 4 + 2 - field206.field720 / 32;
                this.method203(this.field227[var9], var39, true, var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class15 var36 = this.field295[this.field179][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field206.field719 / 32;
                        int var38 = var35 * 4 + 2 - field206.field720 / 32;
                        this.method203(this.field72, var37, true, var38);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field434; ++var11) {
                class17 var31 = this.field433[this.field435[var11]];
                if (var31 != null && var31.method263((byte) 15)) {
                    class58 var32 = var31.field796;
                    if (var32.field1522 != null) {
                        var32 = var32.method526((byte) 3);
                    }
                    if (var32 != null && var32.field1510 && var32.field1511) {
                        int var33 = var31.field719 / 32 - field206.field719 / 32;
                        int var34 = var31.field720 / 32 - field206.field720 / 32;
                        this.method203(this.field73, var33, true, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field311; ++var12) {
                class69 var23 = this.field310[this.field312[var12]];
                if (var23 != null && var23.method263((byte) 15)) {
                    int var24 = var23.field719 / 32 - field206.field719 / 32;
                    int var25 = var23.field720 / 32 - field206.field720 / 32;
                    boolean var26 = false;
                    long var27 = class68.method588(var23.field1708);
                    for (int var29 = 0; var29 < this.field327; ++var29) {
                        if (this.field193[var29] == var27 && this.field296[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field206.field1710 != 0 && var23.field1710 != 0 && field206.field1710 == var23.field1710) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method203(this.field75, var24, true, var25);
                    } else if (var30) {
                        this.method203(this.field76, var24, true, var25);
                    } else {
                        this.method203(this.field74, var24, true, var25);
                    }
                }
            }
            if (this.field322 != 0 && field525 % 20 < 10) {
                if (this.field322 == 1 && this.field455 >= 0 && this.field455 < this.field433.length) {
                    class17 var13 = this.field433[this.field455];
                    if (var13 != null) {
                        int var14 = var13.field719 / 32 - field206.field719 / 32;
                        int var15 = var13.field720 / 32 - field206.field720 / 32;
                        this.method127(this.field505, var14, -862, var15);
                    }
                }
                if (this.field322 == 2) {
                    int var16 = (this.field367 - this.field535) * 4 + 2 - field206.field719 / 32;
                    int var17 = (this.field368 - this.field536) * 4 + 2 - field206.field720 / 32;
                    this.method127(this.field505, var16, -862, var17);
                }
                if (this.field322 == 10 && this.field155 >= 0 && this.field155 < this.field310.length) {
                    class69 var18 = this.field310[this.field155];
                    if (var18 != null) {
                        int var19 = var18.field719 / 32 - field206.field719 / 32;
                        int var20 = var18.field720 / 32 - field206.field720 / 32;
                        this.method127(this.field505, var19, -862, var20);
                    }
                }
            }
            if (this.field108 != 0) {
                int var21 = this.field108 * 4 + 2 - field206.field719 / 32;
                int var22 = this.field109 * 4 + 2 - field206.field720 / 32;
                this.method203(this.field504, var21, true, var22);
            }
            class67.method581(97, (byte) 109, 16777215, 3, 3, 78);
            this.field355.method377(this.field201);
            class10.field680 = this.field546;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field69) {
            this.method205(0);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)Z")
    public final boolean method94(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 14 & 32767;
        if (arg3 <= 0) {
            throw new NullPointerException();
        } else {
            int var6 = this.field245.method342(this.field179, arg2, arg0, arg1);
            if (var6 == -1) {
                return false;
            } else {
                int var7 = var6 & 31;
                int var8 = var6 >> 6 & 3;
                if (var7 != 10 && var7 != 11 && var7 != 22) {
                    this.method151(false, 0, arg0, field206.field750[0], field206.field751[0], 0, 2, 0, arg2, var8, var7 + 1, 566);
                } else {
                    class7 var9 = class7.method219(var5);
                    int var10;
                    int var11;
                    if (var8 != 0 && var8 != 2) {
                        var10 = var9.field611;
                        var11 = var9.field605;
                    } else {
                        var10 = var9.field605;
                        var11 = var9.field611;
                    }
                    int var12 = var9.field593;
                    if (var8 != 0) {
                        var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                    }
                    this.method151(false, var11, arg0, field206.field750[0], field206.field751[0], var10, 2, var12, arg2, 0, 0, 566);
                }
                this.field554 = super.field1210;
                this.field555 = super.field1211;
                this.field557 = 2;
                this.field556 = 0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method95(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field65; ++var4) {
                if (this.field163[var4] == arg1) {
                    --this.field65;
                    this.field361 = true;
                    for (int var5 = var4; var5 < this.field65; ++var5) {
                        this.field163[var5] = this.field163[var5 + 1];
                    }
                    this.field200.method409((byte) -81, 104);
                    this.field200.method416(30294, arg1);
                    break;
                }
            }
            if (arg0) {
                this.method123();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLNPNTBMMX;)V")
    public final void method96(boolean arg0, class37 arg1) {
        if (!arg0) {
            this.field244 = !this.field244;
        }
        int var3 = arg1.field1172;
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field328 == 0) {
                arg1.field1139 = "Loading friend list";
                arg1.field1173 = 0;
            } else if (var3 == 1 && this.field328 == 1) {
                arg1.field1139 = "Connecting to friendserver";
                arg1.field1173 = 0;
            } else if (var3 == 2 && this.field328 != 2) {
                arg1.field1139 = "Please wait...";
                arg1.field1173 = 0;
            } else {
                int var4 = this.field327;
                if (this.field328 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg1.field1139 = "";
                    arg1.field1173 = 0;
                } else {
                    arg1.field1139 = this.field393[var3];
                    arg1.field1173 = 1;
                }
            }
        } else if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
            if (var3 == 203) {
                int var6 = this.field327;
                if (this.field328 != 2) {
                    var6 = 0;
                }
                arg1.field1129 = var6 * 15 + 20;
                if (arg1.field1129 <= arg1.field1106) {
                    arg1.field1129 = arg1.field1106 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field328 == 0) {
                    arg1.field1139 = "Loading ignore list";
                    arg1.field1173 = 0;
                } else if (var3 == 1 && this.field328 == 0) {
                    arg1.field1139 = "Please wait...";
                    arg1.field1173 = 0;
                } else {
                    int var7 = this.field65;
                    if (this.field328 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field1139 = "";
                        arg1.field1173 = 0;
                    } else {
                        arg1.field1139 = class68.method592((byte) 20, class68.method589(this.field163[var3], -115));
                        arg1.field1173 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field1129 = this.field65 * 15 + 20;
                if (arg1.field1129 <= arg1.field1106) {
                    arg1.field1129 = arg1.field1106 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1169 = 150;
                arg1.field1170 = (int) (Math.sin((double) field525 / 40.0D) * 256.0D) & 2047;
                if (this.field88) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field329[var8];
                        if (var15 >= 0 && !class23.field904[var15].method303(-139)) {
                            return;
                        }
                    }
                    this.field88 = false;
                    class43[] var9 = new class43[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field329[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class23.field904[var14].method304(false);
                        }
                    }
                    class43 var12 = new class43(var10, -347, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field297[var13] != 0) {
                            var12.method474(field378[var13][0], field378[var13][this.field297[var13]]);
                            if (var13 == 1) {
                                var12.method474(field529[0], field529[this.field297[var13]]);
                            }
                        }
                    }
                    var12.method467(0);
                    var12.method468(class29.field1014[field206.field748].field1016[0], 19066);
                    var12.method477(64, 850, -30, -50, -30, true);
                    arg1.field1149 = 5;
                    arg1.field1150 = 0;
                    class37.method395(var12, 0, 8, 5);
                }
            } else if (var3 == 324) {
                if (this.field427 == null) {
                    this.field427 = arg1.field1145;
                    this.field428 = arg1.field1118;
                }
                if (this.field209) {
                    arg1.field1145 = this.field428;
                } else {
                    arg1.field1145 = this.field427;
                }
            } else if (var3 == 325) {
                if (this.field427 == null) {
                    this.field427 = arg1.field1145;
                    this.field428 = arg1.field1118;
                }
                if (this.field209) {
                    arg1.field1145 = this.field427;
                } else {
                    arg1.field1145 = this.field428;
                }
            } else if (var3 == 600) {
                arg1.field1139 = this.field66;
                if (field525 % 20 < 10) {
                    arg1.field1139 = arg1.field1139 + "|";
                } else {
                    arg1.field1139 = arg1.field1139 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field330 >= 1) {
                        if (this.field489) {
                            arg1.field1134 = 16711680;
                            arg1.field1139 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1134 = 16777215;
                            arg1.field1139 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1139 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field548 - this.field417;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg1.field1139 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field87 == 0) {
                        arg1.field1139 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field87 <= this.field548) {
                        arg1.field1139 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method97(392, this.field87);
                    } else {
                        int var18 = this.field548 + 14 - this.field87;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg1.field1139 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method97(392, this.field87) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field199 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field199 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field199 + " unread messages";
                    }
                    arg1.field1139 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field162 > 0 && this.field162 <= this.field548 + 10) {
                        arg1.field1139 = "Last password change:\\n@gre@" + this.method97(392, this.field162);
                    } else {
                        arg1.field1139 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field86 > 2 && !field127) {
                        arg1.field1139 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field86 > 2) {
                        arg1.field1139 = "\\n\\nYou have @gre@" + this.field86 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field86 > 0) {
                        arg1.field1139 = "You have @gre@" + this.field86 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg1.field1139 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field86 > 2 && !field127) {
                        arg1.field1139 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field86 > 0) {
                        arg1.field1139 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg1.field1139 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field87 > this.field548) {
                        arg1.field1139 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg1.field1139 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else {
            int var5 = this.field327;
            if (this.field328 != 2) {
                var5 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var5) {
                arg1.field1139 = "";
                arg1.field1173 = 0;
            } else {
                if (this.field296[var3] == 0) {
                    arg1.field1139 = "@red@Offline";
                } else if (this.field296[var3] < 200) {
                    if (this.field296[var3] == field125) {
                        arg1.field1139 = "@gre@World" + (this.field296[var3] - 9);
                    } else {
                        arg1.field1139 = "@yel@World" + (this.field296[var3] - 9);
                    }
                } else if (this.field296[var3] == field125) {
                    arg1.field1139 = "@gre@Classic" + (this.field296[var3] - 219);
                } else {
                    arg1.field1139 = "@yel@Classic" + (this.field296[var3] - 219);
                }
                arg1.field1173 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method97(int arg0, int arg1) {
        if (arg1 > this.field548 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            if (arg0 <= 0) {
                throw new NullPointerException();
            } else {
                Calendar var5 = Calendar.getInstance();
                var5.setTime(new Date(var3));
                int var6 = var5.get(5);
                int var7 = var5.get(2);
                int var8 = var5.get(1);
                String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
                return var6 + "-" + var9[var7] + "-" + var8;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method98(int arg0) {
        this.field88 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field329[var2] = -1;
            for (int var3 = 0; var3 < class23.field903; ++var3) {
                if (!class23.field904[var3].field910 && class23.field904[var3].field905 == var2 + (this.field209 ? 0 : 7)) {
                    this.field329[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 < 8 || arg0 > 8) {
            this.method123();
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)I")
    public final int method99(int arg0) {
        int var2 = 79 / arg0;
        int var3 = 3;
        if (this.field272 < 310) {
            int var4 = this.field269 >> 7;
            int var5 = this.field271 >> 7;
            int var6 = field206.field719 >> 7;
            int var7 = field206.field720 >> 7;
            if ((this.field533[this.field179][var4][var5] & 4) != 0) {
                var3 = this.field179;
            }
            int var8;
            if (var6 > var4) {
                var8 = var6 - var4;
            } else {
                var8 = var4 - var6;
            }
            int var9;
            if (var7 > var5) {
                var9 = var7 - var5;
            } else {
                var9 = var5 - var7;
            }
            if (var8 > var9) {
                int var10 = var9 * 65536 / var8;
                int var11 = 32768;
                while (var4 != var6) {
                    if (var4 < var6) {
                        ++var4;
                    } else if (var4 > var6) {
                        --var4;
                    }
                    if ((this.field533[this.field179][var4][var5] & 4) != 0) {
                        var3 = this.field179;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field533[this.field179][var4][var5] & 4) != 0) {
                            var3 = this.field179;
                        }
                    }
                }
            } else {
                int var12 = var8 * 65536 / var9;
                int var13 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        ++var5;
                    } else if (var5 > var7) {
                        --var5;
                    }
                    if ((this.field533[this.field179][var4][var5] & 4) != 0) {
                        var3 = this.field179;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field533[this.field179][var4][var5] & 4) != 0) {
                            var3 = this.field179;
                        }
                    }
                }
            }
        }
        if ((this.field533[this.field179][field206.field719 >> 7][field206.field720 >> 7] & 4) != 0) {
            var3 = this.field179;
        }
        return var3;
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)I")
    public final int method100(int arg0) {
        if (arg0 != 4) {
            this.field200.method410(57);
        }
        int var2 = this.method91(this.field179, this.field269, false, this.field271);
        return var2 - this.field270 < 800 && (this.field533[this.field179][this.field269 >> 7][this.field271 >> 7] & 4) != 0 ? this.field179 : 3;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method101(boolean arg0) {
        if (this.field101 > 0) {
            this.method134(0);
        } else {
            this.method135("Please wait - attempting to reestablish", -58, "Connection lost");
            this.field298 = 0;
            this.field108 = 0;
            class20 var2 = this.field62;
            if (!arg0) {
                this.field392 = false;
                this.field540 = 0;
                this.method118(this.field180, this.field181, true);
                if (!this.field392) {
                    this.method134(0);
                }
                try {
                    var2.method277();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method102(boolean arg0) {
        int var2 = 5;
        this.field71[8] = 0;
        this.field392 &= arg0;
        int var3 = 0;
        while (this.field71[8] == 0) {
            String var4 = "Unknown problem";
            this.method188(53, "Connecting to web server", 20);
            try {
                DataInputStream var5 = this.method171("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 355);
                class42 var6 = new class42(5, new byte[40]);
                var5.readFully(var6.field1249, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field71[var7] = var6.method425();
                }
                int var8 = var6.method425();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field71[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field71[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field71[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field71[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field71[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field71[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method188(53, "Game updated - please reload page", 10);
                        var11 = 10;
                    } else {
                        this.method188(53, var4 + " - Will retry in " + var11 + " secs.", 10);
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
                this.field348 = !this.field348;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method103(byte arg0) {
        for (int var2 = 0; var2 < this.field275; ++var2) {
            if (this.field148[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field473[var2] == this.field202 && this.field486[var2] == this.field335) {
                        if (!this.method207(this.field213)) {
                            var3 = true;
                        }
                    } else {
                        class42 var4 = class50.method497(this.field473[var2], this.field486[var2], 12);
                        if (System.currentTimeMillis() + (long) (var4.field1250 / 22) > (long) (this.field523 / 22) + this.field240) {
                            this.field523 = var4.field1250;
                            this.field240 = System.currentTimeMillis();
                            if (this.method142(this.field244, var4.field1250, var4.field1249)) {
                                this.field202 = this.field473[var2];
                                this.field335 = this.field486[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                    if (signlink.reporterror) {
                        this.field200.method409((byte) -81, 116);
                        this.field200.method411(this.field473[var2] & 32767);
                    } else {
                        this.field200.method409((byte) -81, 116);
                        this.field200.method411(-1);
                    }
                }
                if (var3 && this.field148[var2] != -5) {
                    this.field148[var2] = -5;
                } else {
                    --this.field275;
                    for (int var6 = var2; var6 < this.field275; ++var6) {
                        this.field473[var6] = this.field473[var6 + 1];
                        this.field486[var6] = this.field486[var6 + 1];
                        this.field148[var6] = this.field148[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field148[var2]--;
            }
        }
        if (arg0 == 8) {
            boolean var7 = false;
        } else {
            this.field212 = this.field139.method51();
        }
        if (this.field221 > 0) {
            this.field221 -= 20;
            if (this.field221 < 0) {
                this.field221 = 0;
            }
            if (this.field221 == 0 && this.field334 && !field128) {
                this.field242 = this.field530;
                this.field243 = true;
                this.field124.method230(2, this.field242);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method104(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field204 = this.field139.method51();
        }
        if (this.field458 == 0 && this.field550 == 0) {
            this.field495[this.field383] = "Walk here";
            this.field423[this.field383] = 709;
            this.field421[this.field383] = super.field1203;
            this.field422[this.field383] = super.field1204;
            ++this.field383;
        }
        int var3 = -1;
        for (int var4 = 0; var4 < class43.field1339; ++var4) {
            int var5 = class43.field1340[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var3 != var5) {
                var3 = var5;
                if (var8 == 2 && this.field245.method342(this.field179, var6, var7, var5) >= 0) {
                    class7 var10 = class7.method219(var9);
                    if (var10.field609 != null) {
                        var10 = var10.method212(true);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field458 == 1) {
                        this.field495[this.field383] = "Use " + this.field462 + " with @cya@" + var10.field574;
                        this.field423[this.field383] = 642;
                        this.field424[this.field383] = var5;
                        this.field421[this.field383] = var6;
                        this.field422[this.field383] = var7;
                        ++this.field383;
                    } else if (this.field550 == 1) {
                        if ((this.field552 & 4) == 4) {
                            this.field495[this.field383] = this.field553 + " @cya@" + var10.field574;
                            this.field423[this.field383] = 668;
                            this.field424[this.field383] = var5;
                            this.field421[this.field383] = var6;
                            this.field422[this.field383] = var7;
                            ++this.field383;
                        }
                    } else {
                        if (var10.field565 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field565[var11] != null) {
                                    this.field495[this.field383] = var10.field565[var11] + " @cya@" + var10.field574;
                                    if (var11 == 0) {
                                        this.field423[this.field383] = 716;
                                    }
                                    if (var11 == 1) {
                                        this.field423[this.field383] = 993;
                                    }
                                    if (var11 == 2) {
                                        this.field423[this.field383] = 885;
                                    }
                                    if (var11 == 3) {
                                        this.field423[this.field383] = 492;
                                    }
                                    if (var11 == 4) {
                                        this.field423[this.field383] = 1660;
                                    }
                                    this.field424[this.field383] = var5;
                                    this.field421[this.field383] = var6;
                                    this.field422[this.field383] = var7;
                                    ++this.field383;
                                }
                            }
                        }
                        this.field495[this.field383] = "Examine @cya@" + var10.field574;
                        this.field423[this.field383] = 1474;
                        this.field424[this.field383] = var10.field580 << 14;
                        this.field421[this.field383] = var6;
                        this.field422[this.field383] = var7;
                        ++this.field383;
                    }
                }
                if (var8 == 1) {
                    class17 var12 = this.field433[var9];
                    if (var12.field796.field1503 == 1 && (var12.field719 & 127) == 64 && (var12.field720 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field434; ++var13) {
                            class17 var16 = this.field433[this.field435[var13]];
                            if (var16 != null && var12 != var16 && var16.field796.field1503 == 1 && var12.field719 == var16.field719 && var12.field720 == var16.field720) {
                                this.method158(var7, this.field435[var13], 560, var16.field796, var6);
                            }
                        }
                        for (int var14 = 0; var14 < this.field311; ++var14) {
                            class69 var15 = this.field310[this.field312[var14]];
                            if (var15 != null && var12.field719 == var15.field719 && var12.field720 == var15.field720) {
                                this.method136(var7, this.field426, var6, this.field312[var14], var15);
                            }
                        }
                    }
                    this.method158(var7, var9, 560, var12.field796, var6);
                }
                if (var8 == 0) {
                    class69 var17 = this.field310[var9];
                    if ((var17.field719 & 127) == 64 && (var17.field720 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field434; ++var18) {
                            class17 var21 = this.field433[this.field435[var18]];
                            if (var21 != null && var21.field796.field1503 == 1 && var17.field719 == var21.field719 && var17.field720 == var21.field720) {
                                this.method158(var7, this.field435[var18], 560, var21.field796, var6);
                            }
                        }
                        for (int var19 = 0; var19 < this.field311; ++var19) {
                            class69 var20 = this.field310[this.field312[var19]];
                            if (var20 != null && var17 != var20 && var17.field719 == var20.field719 && var17.field720 == var20.field720) {
                                this.method136(var7, this.field426, var6, this.field312[var19], var20);
                            }
                        }
                    }
                    this.method136(var7, this.field426, var6, var9, var17);
                }
                if (var8 == 3) {
                    class15 var22 = this.field295[this.field179][var6][var7];
                    if (var22 != null) {
                        for (class4 var23 = (class4) var22.method270(0); var23 != null; var23 = (class4) var22.method272((byte) -48)) {
                            class22 var24 = class22.method290(var23.field35);
                            if (this.field458 == 1) {
                                this.field495[this.field383] = "Use " + this.field462 + " with @lre@" + var24.field851;
                                this.field423[this.field383] = 567;
                                this.field424[this.field383] = var23.field35;
                                this.field421[this.field383] = var6;
                                this.field422[this.field383] = var7;
                                ++this.field383;
                            } else if (this.field550 == 1) {
                                if ((this.field552 & 1) == 1) {
                                    this.field495[this.field383] = this.field553 + " @lre@" + var24.field851;
                                    this.field423[this.field383] = 994;
                                    this.field424[this.field383] = var23.field35;
                                    this.field421[this.field383] = var6;
                                    this.field422[this.field383] = var7;
                                    ++this.field383;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field853 != null && var24.field853[var25] != null) {
                                        this.field495[this.field383] = var24.field853[var25] + " @lre@" + var24.field851;
                                        if (var25 == 0) {
                                            this.field423[this.field383] = 635;
                                        }
                                        if (var25 == 1) {
                                            this.field423[this.field383] = 641;
                                        }
                                        if (var25 == 2) {
                                            this.field423[this.field383] = 821;
                                        }
                                        if (var25 == 3) {
                                            this.field423[this.field383] = 992;
                                        }
                                        if (var25 == 4) {
                                            this.field423[this.field383] = 330;
                                        }
                                        this.field424[this.field383] = var23.field35;
                                        this.field421[this.field383] = var6;
                                        this.field422[this.field383] = var7;
                                        ++this.field383;
                                    } else if (var25 == 2) {
                                        this.field495[this.field383] = "Take @lre@" + var24.field851;
                                        this.field423[this.field383] = 821;
                                        this.field424[this.field383] = var23.field35;
                                        this.field421[this.field383] = var6;
                                        this.field422[this.field383] = var7;
                                        ++this.field383;
                                    }
                                }
                                this.field495[this.field383] = "Examine @lre@" + var24.field851;
                                this.field423[this.field383] = 1907;
                                this.field424[this.field383] = var23.field35;
                                this.field421[this.field383] = var6;
                                this.field422[this.field383] = var7;
                                ++this.field383;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method105(boolean arg0) {
        try {
            this.field149 = -1;
            this.field140.method273();
            this.field450.method273();
            ++field235;
            if (field235 > 1570) {
                field235 = 0;
                this.field200.method409((byte) -81, 145);
                this.field200.method410(0);
                int var2 = this.field200.field1250;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field200.method410(120);
                }
                this.field200.method411((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field200.method411(54115);
                }
                this.field200.method410((int) (Math.random() * 256.0D));
                this.field200.method410(68);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field200.method411(56997);
                }
                this.field200.method411((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field200.method411(11446);
                }
                this.field200.method410(159);
                this.field200.method411((int) (Math.random() * 65536.0D));
                this.field200.method419((byte) 5, this.field200.field1250 - var2);
            }
            class10.method247(-26452);
            this.method199(-620);
            this.field245.method312((byte) 2);
            System.gc();
            for (int var3 = 0; var3 < 4; ++var3) {
                this.field300[var3].method39();
            }
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; var6 < 104; ++var6) {
                        this.field533[var4][var5][var6] = 0;
                    }
                }
            }
            class63 var7 = new class63(104, this.field491, false, 104, this.field533);
            int var8 = this.field196.length;
            this.field200.method409((byte) -81, 253);
            if (!this.field146) {
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = (this.field301[var9] >> 8) * 64 - this.field535;
                    int var11 = (this.field301[var9] & 255) * 64 - this.field536;
                    byte[] var12 = this.field196[var9];
                    if (var12 != null) {
                        var7.method563((this.field84 - 6) * 8, this.field300, var12, var10, (this.field85 - 6) * 8, var11, 0);
                    }
                }
                for (int var13 = 0; var13 < var8; ++var13) {
                    int var14 = (this.field301[var13] >> 8) * 64 - this.field535;
                    int var15 = (this.field301[var13] & 255) * 64 - this.field536;
                    byte[] var16 = this.field196[var13];
                    if (var16 == null && this.field85 < 800) {
                        var7.method567(var14, var15, 669, 64, 64);
                    }
                }
                this.field200.method409((byte) -81, 253);
                for (int var17 = 0; var17 < var8; ++var17) {
                    byte[] var18 = this.field145[var17];
                    if (var18 != null) {
                        int var19 = (this.field301[var17] >> 8) * 64 - this.field535;
                        int var20 = (this.field301[var17] & 255) * 64 - this.field536;
                        var7.method557(var18, var20, var19, 0, this.field300, this.field245);
                    }
                }
            }
            if (this.field146) {
                int var21 = 0;
                label288: while (true) {
                    if (var21 >= 4) {
                        for (int var32 = 0; var32 < 13; ++var32) {
                            for (int var33 = 0; var33 < 13; ++var33) {
                                int var34 = this.field220[0][var32][var33];
                                if (var34 == -1) {
                                    var7.method567(var32 * 8, var33 * 8, 669, 8, 8);
                                }
                            }
                        }
                        this.field200.method409((byte) -81, 253);
                        int var35 = 0;
                        while (true) {
                            if (var35 >= 4) {
                                break label288;
                            }
                            for (int var36 = 0; var36 < 13; ++var36) {
                                for (int var37 = 0; var37 < 13; ++var37) {
                                    int var38 = this.field220[var35][var36][var37];
                                    if (var38 != -1) {
                                        int var39 = var38 >> 24 & 3;
                                        int var40 = var38 >> 1 & 3;
                                        int var41 = var38 >> 14 & 1023;
                                        int var42 = var38 >> 3 & 2047;
                                        int var43 = (var41 / 8 << 8) + var42 / 8;
                                        for (int var44 = 0; var44 < this.field301.length; ++var44) {
                                            if (this.field301[var44] == var43 && this.field145[var44] != null) {
                                                var7.method558((byte) 3, var35, var40, (var42 & 7) * 8, (var41 & 7) * 8, this.field145[var44], this.field300, var36 * 8, var39, var37 * 8, this.field245);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            ++var35;
                        }
                    }
                    for (int var22 = 0; var22 < 13; ++var22) {
                        for (int var23 = 0; var23 < 13; ++var23) {
                            boolean var24 = false;
                            int var25 = this.field220[var21][var22][var23];
                            if (var25 != -1) {
                                int var26 = var25 >> 24 & 3;
                                int var27 = var25 >> 1 & 3;
                                int var28 = var25 >> 14 & 1023;
                                int var29 = var25 >> 3 & 2047;
                                int var30 = (var28 / 8 << 8) + var29 / 8;
                                for (int var31 = 0; var31 < this.field301.length; ++var31) {
                                    if (this.field301[var31] == var30 && this.field196[var31] != null) {
                                        var7.method566(var27, var22 * 8, (var28 & 7) * 8, this.field300, var21, var26, var23 * 8, this.field196[var31], (var29 & 7) * 8, (byte) 85);
                                        var24 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var24) {
                                var7.method553(var22 * 8, var21, var23 * 8, (byte) -21);
                            }
                        }
                    }
                    ++var21;
                }
            }
            this.field200.method409((byte) -81, 253);
            var7.method560((byte) 95, this.field245, this.field300);
            if (this.field355 != null) {
                this.field355.method377(this.field201);
                class10.field680 = this.field546;
            }
            this.field200.method409((byte) -81, 253);
            int var45 = class63.field1622;
            if (var45 > this.field179) {
                var45 = this.field179;
            }
            if (var45 < this.field179 - 1) {
                int var46 = this.field179 - 1;
            }
            if (field128) {
                this.field245.method313(false, class63.field1622);
            } else {
                this.field245.method313(false, 0);
            }
            for (int var47 = 0; var47 < 104; ++var47) {
                for (int var48 = 0; var48 < 104; ++var48) {
                    this.method71(var47, var48);
                }
            }
            ++field487;
            if (field487 > 1843) {
                field487 = 0;
                this.field200.method409((byte) -81, 91);
                this.field200.method410(0);
                int var49 = this.field200.field1250;
                this.field200.method410((int) (Math.random() * 256.0D));
                this.field200.method410(85);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field200.method411(41546);
                }
                this.field200.method411(4405);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field200.method410(0);
                }
                this.field200.method410(193);
                this.field200.method410(99);
                this.field200.method410(178);
                this.field200.method411(11597);
                this.field200.method411((int) (Math.random() * 65536.0D));
                this.field200.method419((byte) 5, this.field200.field1250 - var49);
            }
            this.method146(this.field475);
        } catch (Exception var62) {
        }
        class7.field576.method601();
        if (super.field1198 != null) {
            this.field200.method409((byte) -81, 74);
            this.field200.method414(1057001181);
        }
        if (field128 && signlink.cache_dat != null) {
            int var51 = this.field124.method241(0, 0);
            for (int var52 = 0; var52 < var51; ++var52) {
                int var53 = this.field124.method236(var52, field228);
                if ((var53 & 121) == 0) {
                    class43.method459(var52, 807);
                }
            }
        }
        System.gc();
        class10.method248(-621, 20);
        this.field124.method233((byte) -98);
        int var54 = (this.field84 - 6) / 8 - 1;
        int var55 = (this.field84 + 6) / 8 + 1;
        int var56 = (this.field85 - 6) / 8 - 1;
        int var57 = (this.field85 + 6) / 8 + 1;
        if (this.field150) {
            var54 = 49;
            var55 = 50;
            var56 = 49;
            var57 = 50;
        }
        for (int var58 = var54; var58 <= var55; ++var58) {
            for (int var59 = var56; var59 <= var57; ++var59) {
                if (var54 == var58 || var55 == var58 || var56 == var59 || var57 == var59) {
                    int var60 = this.field124.method228(var58, (byte) -121, var59, 0);
                    if (var60 != -1) {
                        this.field124.method225(var60, this.field68, 3);
                    }
                    int var61 = this.field124.method228(var58, (byte) -121, var59, 1);
                    if (var61 != -1) {
                        this.field124.method225(var61, this.field68, 3);
                    }
                }
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1198 != null) {
                    return new URL("http://127.0.0.1:" + (field126 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method106(int arg0) {
        int var2 = 60 / arg0;
        try {
            int var3 = field206.field719 + this.field477;
            int var4 = field206.field720 + this.field357;
            if (this.field384 - var3 < -500 || this.field384 - var3 > 500 || this.field385 - var4 < -500 || this.field385 - var4 > 500) {
                this.field384 = var3;
                this.field385 = var4;
            }
            if (this.field384 != var3) {
                this.field384 += (var3 - this.field384) / 16;
            }
            if (this.field385 != var4) {
                this.field385 += (var4 - this.field385) / 16;
            }
            if (super.field1213[1] == 1) {
                this.field136 += (-24 - this.field136) / 2;
            } else if (super.field1213[2] == 1) {
                this.field136 += (24 - this.field136) / 2;
            } else {
                this.field136 /= 2;
            }
            if (super.field1213[3] == 1) {
                this.field137 += (12 - this.field137) / 2;
            } else if (super.field1213[4] == 1) {
                this.field137 += (-12 - this.field137) / 2;
            } else {
                this.field137 /= 2;
            }
            this.field135 = this.field136 / 2 + this.field135 & 2047;
            this.field134 += this.field137 / 2;
            if (this.field134 < 128) {
                this.field134 = 128;
            }
            if (this.field134 > 383) {
                this.field134 = 383;
            }
            int var5 = this.field384 >> 7;
            int var6 = this.field385 >> 7;
            int var7 = this.method91(this.field179, this.field384, false, this.field385);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field179;
                        if (var11 < 3 && (this.field533[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field491[var11][var9][var10];
                        if (var12 > var8) {
                            var8 = var12;
                        }
                    }
                }
            }
            ++field488;
            if (field488 > 1897) {
                field488 = 0;
                this.field200.method409((byte) -81, 125);
                this.field200.method410(0);
                int var13 = this.field200.field1250;
                this.field200.method410(221);
                this.field200.method411((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field200.method410(167);
                }
                this.field200.method410(228);
                this.field200.method411(36419);
                this.field200.method410((int) (Math.random() * 256.0D));
                this.field200.method411(21720);
                this.field200.method411((int) (Math.random() * 65536.0D));
                this.field200.method411((int) (Math.random() * 65536.0D));
                this.field200.method410(101);
                this.field200.method419((byte) 5, this.field200.field1250 - var13);
            }
            int var14 = var8 * 192;
            if (var14 > 98048) {
                var14 = 98048;
            }
            if (var14 < 32768) {
                var14 = 32768;
            }
            if (var14 > this.field333) {
                this.field333 += (var14 - this.field333) / 24;
            } else if (var14 < this.field333) {
                this.field333 += (var14 - this.field333) / 80;
            }
        } catch (Exception var15) {
            signlink.reporterror("glfc_ex " + field206.field719 + "," + field206.field720 + "," + this.field384 + "," + this.field385 + "," + this.field84 + "," + this.field85 + "," + this.field535 + "," + this.field536);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method107(boolean arg0) {
        if (!arg0) {
            Graphics var2 = this.method174(false).getGraphics();
            var2.setColor(Color.black);
            var2.fillRect(0, 0, 765, 503);
            this.method406(1, true);
            if (this.field317) {
                this.field531 = false;
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
            if (this.field388) {
                this.field531 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field513) {
                this.field531 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method108(byte arg0) {
        this.field301 = null;
        this.field196 = null;
        this.field145 = null;
        this.field302 = null;
        this.field303 = null;
        this.field279 = null;
        this.field510 = null;
        this.field511 = null;
        this.field512 = null;
        this.field147 = null;
        this.field353 = null;
        this.field354 = null;
        this.field355 = null;
        this.field356 = null;
        this.field257 = null;
        this.field258 = null;
        this.field259 = null;
        this.field310 = null;
        this.field312 = null;
        this.field314 = null;
        this.field315 = null;
        this.field516 = null;
        this.field421 = null;
        this.field422 = null;
        this.field423 = null;
        this.field424 = null;
        this.field495 = null;
        this.field277 = null;
        this.field278 = null;
        this.field227 = null;
        this.field419 = null;
        this.field344 = null;
        this.field400 = null;
        this.field189 = null;
        this.field183 = null;
        this.field319 = null;
        this.field79 = null;
        this.field80 = null;
        this.field81 = null;
        this.field82 = null;
        this.field83 = null;
        this.field442 = null;
        this.field443 = null;
        this.field444 = null;
        this.field174 = null;
        this.field175 = null;
        this.field176 = null;
        this.field177 = null;
        this.field178 = null;
        this.field295 = null;
        this.field214 = null;
        if (this.field195 != null) {
            this.field195.field1643 = false;
        }
        this.field195 = null;
        this.field170 = null;
        this.field171 = null;
        this.field172 = null;
        this.field173 = null;
        this.field450 = null;
        if (arg0 != 8) {
            this.field295 = null;
        }
        this.field140 = null;
        this.field393 = null;
        this.field193 = null;
        this.field296 = null;
        this.field438 = null;
        this.method132(-958);
        this.field110 = null;
        this.field200 = null;
        this.field121 = null;
        this.field337 = null;
        this.field432 = null;
        this.field230 = null;
        this.field231 = null;
        this.field232 = null;
        this.field233 = null;
        this.field234 = null;
        this.field359 = null;
        this.field373 = null;
        this.field122 = null;
        this.field448 = null;
        try {
            if (this.field62 != null) {
                this.field62.method277();
            }
        } catch (Exception var2) {
        }
        this.field62 = null;
        this.field72 = null;
        this.field73 = null;
        this.field74 = null;
        this.field75 = null;
        this.field76 = null;
        this.field263 = null;
        this.field264 = null;
        this.field260 = null;
        this.field261 = null;
        this.field262 = null;
        this.field433 = null;
        this.field435 = null;
        this.field265 = null;
        this.field266 = null;
        this.field267 = null;
        this.field268 = null;
        this.field102 = null;
        this.field440 = null;
        this.field325 = null;
        this.field326 = null;
        this.field491 = null;
        this.field533 = null;
        this.field245 = null;
        this.field300 = null;
        if (this.field124 != null) {
            this.field124.method242();
        }
        this.field124 = null;
        this.method125(true);
        class7.method216(-48545);
        class58.method532(-48545);
        class22.method288(-48545);
        class37.method400(-48545);
        class53.field1444 = null;
        class23.field904 = null;
        class16.field784 = null;
        class29.field1014 = null;
        class6.field49 = null;
        class6.field61 = null;
        class70.field1719 = null;
        super.field1196 = null;
        class69.field1703 = null;
        class10.method244(-48545);
        class28.method311(-48545);
        class43.method456(-48545);
        class21.method285(-48545);
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method109(String arg0, int arg1) {
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
                    this.field282 = 0;
                    label55: for (int var9 = 0; var9 < class22.field866; ++var9) {
                        class22 var10 = class22.method290(var9);
                        if (var10.field860 == -1 && var10.field851 != null) {
                            String var11 = var10.field851.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label55;
                                }
                            }
                            this.field283[this.field282] = var11;
                            this.field284[this.field282] = var9;
                            ++this.field282;
                            if (this.field282 >= this.field283.length) {
                                break;
                            }
                        }
                    }
                    if (arg1 <= 0) {
                        this.field437 = !this.field437;
                        return;
                    } else {
                        return;
                    }
                }
                String var7 = var3.substring(0, var6).trim();
                if (var7.length() > 0) {
                    var4[var5++] = var7.toLowerCase();
                }
                var3 = var3.substring(var6 + 1);
            }
        } else {
            this.field282 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method110(boolean arg0) {
        this.field392 &= arg0;
        if (this.field463 != 0) {
            int var2 = 0;
            if (this.field321 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field503[var3] != null) {
                    int var4 = this.field501[var3];
                    String var5 = this.field502[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field350 == 0 || this.field350 == 1 && this.method79((byte) -124, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1203 > 4 && super.field1204 - 4 > var9 - 10 && super.field1204 - 4 <= var9 + 3) {
                            int var10 = this.field166.method536(false, "From:  " + var5 + this.field503[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1203 < var10 + 4) {
                                if (this.field330 >= 1) {
                                    this.field495[this.field383] = "Report abuse @whi@" + var5;
                                    this.field423[this.field383] = 2031;
                                    ++this.field383;
                                }
                                this.field495[this.field383] = "Add ignore @whi@" + var5;
                                this.field423[this.field383] = 2370;
                                ++this.field383;
                                this.field495[this.field383] = "Add friend @whi@" + var5;
                                this.field423[this.field383] = 2201;
                                ++this.field383;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field350 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILNPNTBMMX;)Z")
    public final boolean method111(int arg0, class37 arg1) {
        int var3 = arg1.field1172;
        if (arg0 != 9516) {
            this.field494 = this.field139.method51();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field495[this.field383] = "Remove @whi@" + arg1.field1139;
                this.field423[this.field383] = 629;
                ++this.field383;
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
            this.field495[this.field383] = "Remove @whi@" + this.field393[var3];
            this.field423[this.field383] = 761;
            ++this.field383;
            this.field495[this.field383] = "Message @whi@" + this.field393[var3];
            this.field423[this.field383] = 246;
            ++this.field383;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LPGNBHFUF;II)V")
    private final void method112(class42 arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field313; ++var4) {
            int var5 = this.field314[var4];
            class17 var6 = this.field433[var5];
            int var7 = arg0.method420();
            if ((var7 & 128) != 0) {
                var6.field697 = arg0.method446(895);
                var6.field698 = arg0.method447((byte) -35);
            }
            if ((var7 & 1) != 0) {
                int var8 = arg0.method440(8);
                int var9 = arg0.method438(false);
                var6.method265(field525, var9, 8, var8);
                var6.field745 = field525 + 300;
                var6.field746 = arg0.method439(0);
                var6.field747 = arg0.method420();
            }
            if ((var7 & 4) != 0) {
                int var10 = arg0.method439(0);
                int var11 = arg0.method438(false);
                var6.method265(field525, var11, 8, var10);
                var6.field745 = field525 + 300;
                var6.field746 = arg0.method440(8);
                var6.field747 = arg0.method440(8);
            }
            if ((var7 & 8) != 0) {
                var6.field713 = arg0.method446(895);
                int var12 = arg0.method452(true);
                var6.field717 = var12 >> 16;
                var6.field716 = (var12 & 65535) + field525;
                var6.field714 = 0;
                var6.field715 = 0;
                if (var6.field716 > field525) {
                    var6.field714 = -1;
                }
                if (var6.field713 == 65535) {
                    var6.field713 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                var6.field725 = arg0.method422();
                if (var6.field725 == 65535) {
                    var6.field725 = -1;
                }
            }
            if ((var7 & 16) != 0) {
                var6.field796 = class58.method525(arg0.method447((byte) -35));
                var6.field710 = var6.field796.field1503;
                var6.field711 = var6.field796.field1515;
                var6.field727 = var6.field796.field1501;
                var6.field728 = var6.field796.field1495;
                var6.field729 = var6.field796.field1498;
                var6.field730 = var6.field796.field1516;
                var6.field748 = var6.field796.field1527;
            }
            if ((var7 & 64) != 0) {
                int var13 = arg0.method448(true);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = arg0.method420();
                if (var6.field737 == var13 && var13 != -1) {
                    int var15 = class29.field1014[var13].field1028;
                    if (var15 == 1) {
                        var6.field738 = 0;
                        var6.field739 = 0;
                        var6.field740 = var14;
                        var6.field741 = 0;
                    }
                    if (var15 == 2) {
                        var6.field741 = 0;
                    }
                } else if (var13 == -1 || var6.field737 == -1 || class29.field1014[var13].field1022 >= class29.field1014[var6.field737].field1022) {
                    var6.field737 = var13;
                    var6.field738 = 0;
                    var6.field739 = 0;
                    var6.field740 = var14;
                    var6.field741 = 0;
                    var6.field732 = var6.field712;
                }
            }
            if ((var7 & 32) != 0) {
                var6.field744 = arg0.method427();
                var6.field726 = 100;
            }
        }
        if (arg1 <= 0) {
            this.field295 = null;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LPGNBHFUF;II)V")
    private final void method113(class42 arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            this.field299 = 142;
        }
        while (arg0.field1251 + 21 < arg1 * 8) {
            int var4 = arg0.method431(14, this.field191);
            if (var4 == 16383) {
                break;
            }
            if (this.field433[var4] == null) {
                this.field433[var4] = new class17();
            }
            class17 var5 = this.field433[var4];
            this.field435[this.field434++] = var4;
            var5.field742 = field525;
            int var6 = arg0.method431(1, this.field191);
            var5.field796 = class58.method525(arg0.method431(13, this.field191));
            int var7 = arg0.method431(1, this.field191);
            if (var7 == 1) {
                this.field314[this.field313++] = var4;
            }
            int var8 = arg0.method431(5, this.field191);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg0.method431(5, this.field191);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.field710 = var5.field796.field1503;
            var5.field711 = var5.field796.field1515;
            var5.field727 = var5.field796.field1501;
            var5.field728 = var5.field796.field1495;
            var5.field729 = var5.field796.field1498;
            var5.field730 = var5.field796.field1516;
            var5.field748 = var5.field796.field1527;
            var5.method262(var6 == 1, field206.field750[0] + var9, false, field206.field751[0] + var8);
        }
        arg0.method432(true);
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (this.field356 == null) {
            this.method125(true);
            super.field1196 = null;
            this.field260 = null;
            this.field261 = null;
            this.field262 = null;
            this.field263 = null;
            this.field264 = null;
            this.field265 = null;
            this.field266 = null;
            this.field267 = null;
            this.field268 = null;
            this.field356 = new class34(this.method174(false), 96, 479, 284);
            this.field354 = new class34(this.method174(false), 156, 172, 284);
            class67.method579(false);
            this.field258.method371(0, 0, false);
            this.field353 = new class34(this.method174(false), 261, 190, 284);
            this.field355 = new class34(this.method174(false), 334, 512, 284);
            class67.method579(false);
            this.field442 = new class34(this.method174(false), 50, 496, 284);
            this.field443 = new class34(this.method174(false), 37, 269, 284);
            if (arg0 != -30461) {
                field205 = this.field139.method51();
            }
            this.field444 = new class34(this.method174(false), 45, 249, 284);
            this.field332 = true;
            this.field355.method377(this.field201);
            class10.field680 = this.field546;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        if (this.field383 >= 2 || this.field458 != 0 || this.field550 != 0) {
            String var2;
            if (this.field458 == 1 && this.field383 < 2) {
                var2 = "Use " + this.field462 + " with...";
            } else if (this.field550 == 1 && this.field383 < 2) {
                var2 = this.field553 + "...";
            } else {
                var2 = this.field495[this.field383 - 1];
            }
            if (this.field383 > 2) {
                var2 = var2 + "@whi@ / " + (this.field383 - 2) + " more options";
            }
            this.field167.method543(15, var2, 4, field525 / 1000, 16777215, true, (byte) -58);
            this.field392 &= arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class24 var11 = null;
        for (class24 var12 = (class24) this.field214.method269(); var12 != null; var12 = (class24) this.field214.method271(15175)) {
            if (var12.field919 == arg4 && var12.field921 == arg2 && var12.field922 == arg1 && var12.field920 == arg3) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class24();
            var11.field919 = arg4;
            var11.field920 = arg3;
            var11.field921 = arg2;
            var11.field922 = arg1;
            this.method204(-20618, var11);
            this.field214.method266(var11);
        }
        var11.field911 = arg8;
        var11.field913 = arg6;
        var11.field912 = arg0;
        if (arg7 == 0) {
            var11.field915 = arg5;
            var11.field914 = arg9;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLNPNTBMMX;I)I")
    public final int method117(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 7) {
            this.field98 = -1;
        }
        if (arg1.field1104 != null && arg2 < arg1.field1104.length) {
            try {
                int[] var4 = arg1.field1104[arg2];
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
                        var9 = this.field445[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field67[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field133[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class37 var11 = class37.method393(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class22.field866 && (!class22.method290(var12).field850 || field127)) {
                            for (int var13 = 0; var13 < var11.field1155.length; ++var13) {
                                if (var12 + 1 == var11.field1155[var13]) {
                                    var9 += var11.field1163[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field373[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field113[this.field67[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field373[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field206.field1706;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class40.field1218; ++var14) {
                            if (class40.field1220[var14]) {
                                var9 += this.field67[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class37 var15 = class37.method393(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class22.field866 && (!class22.method290(var16).field850 || field127)) {
                            for (int var17 = 0; var17 < var15.field1155.length; ++var17) {
                                if (var15.field1155[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field138;
                    }
                    if (var8 == 12) {
                        var9 = this.field211;
                    }
                    if (var8 == 13) {
                        int var18 = this.field373[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class18 var21 = class18.field798[var20];
                        int var22 = var21.field800;
                        int var23 = var21.field801;
                        int var24 = var21.field802;
                        int var25 = field225[var24 - var23];
                        var9 = this.field373[var22] >> var23 & var25;
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
                        var9 = (field206.field719 >> 7) + this.field535;
                    }
                    if (var8 == 19) {
                        var9 = (field206.field720 >> 7) + this.field536;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method118(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field129 = "";
                this.field130 = "Connecting to server...";
                this.method147(false, true);
            }
            this.field62 = new class20(this, this.method201(field126 + 43594), 5029);
            long var4 = class68.method588(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field200.field1250 = 0;
            this.field200.method410(14);
            this.field200.method410(var6);
            this.field62.method281(0, this.field200.field1249, 2, -230);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field62.method278();
            }
            int var8 = this.field62.method278();
            int var9 = var8;
            if (var8 == 0) {
                this.field62.method280(this.field337.field1249, 0, 8);
                this.field337.field1250 = 0;
                this.field92 = this.field337.method426(true);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field92 >> 32), (int) this.field92 };
                this.field200.field1250 = 0;
                this.field200.method410(10);
                this.field200.method414(var10[0]);
                this.field200.method414(var10[1]);
                this.field200.method414(var10[2]);
                this.field200.method414(var10[3]);
                this.field200.method414(signlink.uid);
                this.field200.method417(arg0);
                this.field200.method417(arg1);
                this.field200.method435(field164, field70, false);
                this.field121.field1250 = 0;
                if (arg2) {
                    this.field121.method410(18);
                } else {
                    this.field121.method410(16);
                }
                this.field121.method410(this.field200.field1250 + 36 + 1 + 1 + 2);
                this.field121.method410(255);
                this.field121.method411(355);
                this.field121.method410(field128 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field121.method414(this.field71[var11]);
                }
                this.field121.method418(this.field200.field1249, this.field200.field1250, 0, (byte) 74);
                this.field200.field1254 = new class3(this.field299, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field139 = new class3(this.field299, var10);
                this.field62.method281(0, this.field121.field1249, this.field121.field1250, -230);
                var8 = this.field62.method278();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method118(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field330 = this.field62.method278();
                field401 = this.field62.method278() == 1;
                this.field485 = 0L;
                this.field360 = 0;
                this.field195.field1645 = 0;
                super.field1200 = true;
                this.field294 = true;
                this.field392 = true;
                this.field200.field1250 = 0;
                this.field337.field1250 = 0;
                this.field98 = -1;
                this.field541 = -1;
                this.field542 = -1;
                this.field543 = -1;
                this.field97 = 0;
                this.field99 = 0;
                this.field321 = 0;
                this.field101 = 0;
                this.field322 = 0;
                this.field383 = 0;
                this.field154 = false;
                super.field1201 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field503[var13] = null;
                }
                this.field458 = 0;
                this.field550 = 0;
                this.field307 = 0;
                this.field275 = 0;
                this.field477 = (int) (Math.random() * 100.0D) - 50;
                this.field357 = (int) (Math.random() * 110.0D) - 55;
                this.field404 = (int) (Math.random() * 80.0D) - 40;
                this.field521 = (int) (Math.random() * 120.0D) - 60;
                this.field374 = (int) (Math.random() * 30.0D) - 20;
                this.field135 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field298 = 0;
                this.field149 = -1;
                this.field108 = 0;
                this.field109 = 0;
                this.field311 = 0;
                this.field434 = 0;
                for (int var14 = 0; var14 < this.field308; ++var14) {
                    this.field310[var14] = null;
                    this.field315[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field433[var15] = null;
                }
                field206 = this.field310[this.field309] = new class69();
                this.field450.method273();
                this.field140.method273();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field295[var16][var17][var18] = null;
                        }
                    }
                }
                this.field214 = new class15(145);
                this.field328 = 0;
                this.field327 = 0;
                this.method200(field390, this.field559);
                this.field559 = -1;
                this.method200(field390, this.field323);
                this.field323 = -1;
                this.method200(field390, this.field318);
                this.field318 = -1;
                this.method200(field390, this.field451);
                this.field451 = -1;
                this.method200(field390, this.field377);
                this.field377 = -1;
                this.method200(field390, this.field395);
                this.field395 = -1;
                this.method200(field390, this.field347);
                this.field347 = -1;
                this.field425 = false;
                this.field394 = 3;
                this.field397 = 0;
                this.field154 = false;
                this.field286 = false;
                this.field316 = null;
                this.field376 = 0;
                this.field418 = -1;
                this.field209 = true;
                this.method98(8);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field297[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field381[var20] = null;
                    this.field382[var20] = false;
                }
                field490 = 0;
                field226 = 0;
                field274 = 0;
                field91 = 0;
                field116 = 0;
                field246 = 0;
                field363 = 0;
                field161 = 0;
                field239 = 0;
                field217 = 0;
                this.method114(-30461);
            } else if (var8 == 3) {
                this.field129 = "";
                this.field130 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field129 = "Your account has been disabled.";
                this.field130 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field129 = "Your account is already logged in.";
                this.field130 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field129 = "RuneScape has been updated!";
                this.field130 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field129 = "This world is full.";
                this.field130 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field129 = "Unable to connect.";
                this.field130 = "Login server offline.";
            } else if (var8 == 9) {
                this.field129 = "Login limit exceeded.";
                this.field130 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field129 = "Unable to connect.";
                this.field130 = "Bad session id.";
            } else if (var8 == 11) {
                this.field129 = "Login server rejected session.";
                this.field130 = "Please try again.";
            } else if (var8 == 12) {
                this.field129 = "You need a members account to login to this world.";
                this.field130 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field129 = "Could not complete login.";
                this.field130 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field129 = "The server is being updated.";
                this.field130 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field392 = true;
                this.field200.field1250 = 0;
                this.field337.field1250 = 0;
                this.field98 = -1;
                this.field541 = -1;
                this.field542 = -1;
                this.field543 = -1;
                this.field97 = 0;
                this.field99 = 0;
                this.field321 = 0;
                this.field383 = 0;
                this.field154 = false;
                this.field107 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field129 = "Login attempts exceeded.";
                this.field130 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field129 = "You are standing in a members-only area.";
                this.field130 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field129 = "Invalid loginserver requested";
                this.field130 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field129 = "Malformed login packet.";
                    this.field130 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field540 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field540;
                            this.method118(arg0, arg1, arg2);
                        } else {
                            this.field129 = "No response from loginserver";
                            this.field130 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field129 = "No response from server";
                        this.field130 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field129 = "Unexpected server response";
                    this.field130 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field62.method278();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field129 = "You have only just left another world";
                    this.field130 = "Your profile will be transferred in: " + var26;
                    this.method147(false, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method118(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field129 = "";
            this.field130 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNPNTBMMX;I)Z")
    public final boolean method119(class37 arg0, int arg1) {
        if (arg1 != 4) {
            this.field98 = this.field337.method420();
        }
        if (arg0.field1146 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1146.length; ++var3) {
                int var4 = this.method117((byte) 7, arg0, var3);
                int var5 = arg0.field1100[var3];
                if (arg0.field1146[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1146[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1146[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILPGNBHFUF;B)V")
    private final void method120(int arg0, class42 arg1, byte arg2) {
        while (true) {
            if (arg1.field1251 + 10 < arg0 * 8) {
                int var4 = arg1.method431(11, this.field191);
                if (var4 != 2047) {
                    if (this.field310[var4] == null) {
                        this.field310[var4] = new class69();
                        if (this.field315[var4] != null) {
                            this.field310[var4].method594(this.field494, this.field315[var4]);
                        }
                    }
                    this.field312[this.field311++] = var4;
                    class69 var5 = this.field310[var4];
                    var5.field742 = field525;
                    int var6 = arg1.method431(1, this.field191);
                    if (var6 == 1) {
                        this.field314[this.field313++] = var4;
                    }
                    int var7 = arg1.method431(5, this.field191);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method431(1, this.field191);
                    int var9 = arg1.method431(5, this.field191);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method262(var8 == 1, field206.field750[0] + var9, false, field206.field751[0] + var7);
                    continue;
                }
            }
            arg1.method432(true);
            if (arg2 != 9) {
                this.field98 = -1;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (arg0 != 6) {
            this.field200.method410(97);
        }
        if (super.field1209 == 1) {
            if (super.field1210 >= 539 && super.field1210 <= 573 && super.field1211 >= 169 && super.field1211 < 205 && this.field430[0] != -1) {
                this.field361 = true;
                this.field394 = 0;
                this.field410 = true;
            }
            if (super.field1210 >= 569 && super.field1210 <= 599 && super.field1211 >= 168 && super.field1211 < 205 && this.field430[1] != -1) {
                this.field361 = true;
                this.field394 = 1;
                this.field410 = true;
            }
            if (super.field1210 >= 597 && super.field1210 <= 627 && super.field1211 >= 168 && super.field1211 < 205 && this.field430[2] != -1) {
                this.field361 = true;
                this.field394 = 2;
                this.field410 = true;
            }
            if (super.field1210 >= 625 && super.field1210 <= 669 && super.field1211 >= 168 && super.field1211 < 203 && this.field430[3] != -1) {
                this.field361 = true;
                this.field394 = 3;
                this.field410 = true;
            }
            if (super.field1210 >= 666 && super.field1210 <= 696 && super.field1211 >= 168 && super.field1211 < 205 && this.field430[4] != -1) {
                this.field361 = true;
                this.field394 = 4;
                this.field410 = true;
            }
            if (super.field1210 >= 694 && super.field1210 <= 724 && super.field1211 >= 168 && super.field1211 < 205 && this.field430[5] != -1) {
                this.field361 = true;
                this.field394 = 5;
                this.field410 = true;
            }
            if (super.field1210 >= 722 && super.field1210 <= 756 && super.field1211 >= 169 && super.field1211 < 205 && this.field430[6] != -1) {
                this.field361 = true;
                this.field394 = 6;
                this.field410 = true;
            }
            if (super.field1210 >= 540 && super.field1210 <= 574 && super.field1211 >= 466 && super.field1211 < 502 && this.field430[7] != -1) {
                this.field361 = true;
                this.field394 = 7;
                this.field410 = true;
            }
            if (super.field1210 >= 572 && super.field1210 <= 602 && super.field1211 >= 466 && super.field1211 < 503 && this.field430[8] != -1) {
                this.field361 = true;
                this.field394 = 8;
                this.field410 = true;
            }
            if (super.field1210 >= 599 && super.field1210 <= 629 && super.field1211 >= 466 && super.field1211 < 503 && this.field430[9] != -1) {
                this.field361 = true;
                this.field394 = 9;
                this.field410 = true;
            }
            if (super.field1210 >= 627 && super.field1210 <= 671 && super.field1211 >= 467 && super.field1211 < 502 && this.field430[10] != -1) {
                this.field361 = true;
                this.field394 = 10;
                this.field410 = true;
            }
            if (super.field1210 >= 669 && super.field1210 <= 699 && super.field1211 >= 466 && super.field1211 < 503 && this.field430[11] != -1) {
                this.field361 = true;
                this.field394 = 11;
                this.field410 = true;
            }
            if (super.field1210 >= 696 && super.field1210 <= 726 && super.field1211 >= 466 && super.field1211 < 503 && this.field430[12] != -1) {
                this.field361 = true;
                this.field394 = 12;
                this.field410 = true;
            }
            if (super.field1210 >= 724 && super.field1210 <= 758 && super.field1211 >= 466 && super.field1211 < 502 && this.field430[13] != -1) {
                this.field361 = true;
                this.field394 = 13;
                this.field410 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIII)V")
    public final void method122(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg0;
        if (arg1) {
            for (int var13 = 1; var13 > 0; ++var13) {
            }
        }
        if (var8 != 0) {
            int var14 = class43.field1341[var8];
            int var15 = class43.field1342[var8];
            int var16 = var11 * var15 - arg0 * var14 >> 16;
            var12 = var11 * var14 + arg0 * var15 >> 16;
            var11 = var16;
        }
        if (var9 != 0) {
            int var17 = class43.field1341[var9];
            int var18 = class43.field1342[var9];
            int var19 = var10 * var18 + var12 * var17 >> 16;
            var12 = var12 * var18 - var10 * var17 >> 16;
            var10 = var19;
        }
        this.field269 = arg3 - var10;
        this.field270 = arg4 - var11;
        this.field271 = arg2 - var12;
        this.field272 = arg6;
        this.field273 = arg5;
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 355);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field125 = Integer.parseInt(arg0[0]);
                field126 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method133((byte) 31);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method150(false);
                }
                if (arg0[3].equals("free")) {
                    field127 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field127 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method403((byte) 80, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method123() {
        this.method188(53, "Starting up", 20);
        if (signlink.sunjava) {
            super.field1189 = 5;
        }
        if (field215) {
            this.field513 = true;
        } else {
            field215 = true;
            boolean var1 = false;
            String var2 = this.method196(0);
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
                this.field388 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field446[var3] = new class47(field112, signlink.cache_dat, signlink.cache_idx[var3], 500000, var3 + 1);
                    }
                }
                try {
                    this.method102(true);
                    this.field103 = this.method180((byte) 0, "title", "title screen", this.field71[1], 1, 25);
                    this.field165 = new class62(false, this.field103, (byte) 4, "p11_full");
                    this.field166 = new class62(false, this.field103, (byte) 4, "p12_full");
                    this.field167 = new class62(false, this.field103, (byte) 4, "b12_full");
                    this.field168 = new class62(true, this.field103, (byte) 4, "q8_full");
                    this.method68((byte) 7);
                    this.method152(field223);
                    class44 var4 = this.method180((byte) 0, "config", "config", this.field71[2], 2, 30);
                    class44 var5 = this.method180((byte) 0, "interface", "interface", this.field71[3], 3, 35);
                    class44 var6 = this.method180((byte) 0, "media", "2d graphics", this.field71[4], 4, 40);
                    class44 var7 = this.method180((byte) 0, "textures", "textures", this.field71[6], 6, 45);
                    class44 var8 = this.method180((byte) 0, "wordenc", "chat system", this.field71[7], 7, 50);
                    class44 var9 = this.method180((byte) 0, "sounds", "sound effects", this.field71[8], 8, 55);
                    this.field533 = new byte[4][104][104];
                    this.field491 = new int[4][105][105];
                    this.field245 = new class28(this.field491, 104, 0, 4, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field300[var10] = new class2(104, false, 104);
                    }
                    this.field110 = new class52(512, 512);
                    class44 var11 = this.method180((byte) 0, "versionlist", "update list", this.field71[5], 5, 60);
                    this.method188(53, "Connecting to update server", 60);
                    this.field124 = new class9();
                    this.field124.method232(var11, this);
                    class21.method283(this.field124.method239(field205));
                    class43.method457(this.field124.method241(0, 0), this.field124);
                    if (!field128) {
                        this.field242 = 0;
                        this.field243 = true;
                        this.field124.method230(2, this.field242);
                        while (this.field124.method240() > 0) {
                            this.method166(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field124.field632 > 3) {
                                this.method145("ondemand");
                                return;
                            }
                        }
                    }
                    this.method188(53, "Requesting animations", 65);
                    int var12 = this.field124.method241(1, 0);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field124.method230(1, var13);
                    }
                    while (this.field124.method240() > 0) {
                        int var14 = var12 - this.field124.method240();
                        if (var14 > 0) {
                            this.method188(53, "Loading animations - " + var14 * 100 / var12 + "%", 65);
                        }
                        this.method166(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field124.field632 > 3) {
                            this.method145("ondemand");
                            return;
                        }
                    }
                    this.method188(53, "Requesting models", 70);
                    int var15 = this.field124.method241(0, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field124.method236(var16, field228);
                        if ((var17 & 1) != 0) {
                            this.field124.method230(0, var16);
                        }
                    }
                    int var18 = this.field124.method240();
                    while (this.field124.method240() > 0) {
                        int var19 = var18 - this.field124.method240();
                        if (var19 > 0) {
                            this.method188(53, "Loading models - " + var19 * 100 / var18 + "%", 70);
                        }
                        this.method166(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field446[0] != null) {
                        this.method188(53, "Requesting maps", 75);
                        this.field124.method230(3, this.field124.method228(47, (byte) -121, 48, 0));
                        this.field124.method230(3, this.field124.method228(47, (byte) -121, 48, 1));
                        this.field124.method230(3, this.field124.method228(48, (byte) -121, 48, 0));
                        this.field124.method230(3, this.field124.method228(48, (byte) -121, 48, 1));
                        this.field124.method230(3, this.field124.method228(49, (byte) -121, 48, 0));
                        this.field124.method230(3, this.field124.method228(49, (byte) -121, 48, 1));
                        this.field124.method230(3, this.field124.method228(47, (byte) -121, 47, 0));
                        this.field124.method230(3, this.field124.method228(47, (byte) -121, 47, 1));
                        this.field124.method230(3, this.field124.method228(48, (byte) -121, 47, 0));
                        this.field124.method230(3, this.field124.method228(48, (byte) -121, 47, 1));
                        this.field124.method230(3, this.field124.method228(48, (byte) -121, 148, 0));
                        this.field124.method230(3, this.field124.method228(48, (byte) -121, 148, 1));
                        int var20 = this.field124.method240();
                        while (this.field124.method240() > 0) {
                            int var21 = var20 - this.field124.method240();
                            if (var21 > 0) {
                                this.method188(53, "Loading maps - " + var21 * 100 / var20 + "%", 75);
                            }
                            this.method166(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field124.method241(0, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field124.method236(var23, field228);
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
                            this.field124.method224(-93, var23, 0, var25);
                        }
                    }
                    this.field124.method223(field127, field132);
                    if (!field128) {
                        int var26 = this.field124.method241(2, 0);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field124.method234(var27, 5)) {
                                this.field124.method224(-93, var27, 2, (byte) 1);
                            }
                        }
                    }
                    this.method188(53, "Unpacking media", 80);
                    this.field257 = new class30(var6, "invback", 0);
                    this.field259 = new class30(var6, "chatback", 0);
                    this.field258 = new class30(var6, "mapback", 0);
                    this.field510 = new class30(var6, "backbase1", 0);
                    this.field511 = new class30(var6, "backbase2", 0);
                    this.field512 = new class30(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field359[var28] = new class30(var6, "sideicons", var28);
                    }
                    this.field419 = new class52(var6, "compass", 0);
                    this.field420 = new class52(var6, "mapedge", 0);
                    this.field420.method508(false);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field122[var29] = new class30(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field448[var30] = new class52(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field344[var31] = new class52(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field400[var32] = new class52(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field189[var33] = new class52(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field183[var34] = new class52(var6, "headicons_hint", var34);
                    }
                    this.field147 = new class52(var6, "overlay_multiway", 0);
                    this.field504 = new class52(var6, "mapmarker", 0);
                    this.field505 = new class52(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field319[var35] = new class52(var6, "cross", var35);
                    }
                    this.field72 = new class52(var6, "mapdots", 0);
                    this.field73 = new class52(var6, "mapdots", 1);
                    this.field74 = new class52(var6, "mapdots", 2);
                    this.field75 = new class52(var6, "mapdots", 3);
                    this.field76 = new class52(var6, "mapdots", 4);
                    this.field466 = new class30(var6, "scrollbar", 0);
                    this.field467 = new class30(var6, "scrollbar", 1);
                    this.field79 = new class30(var6, "redstone1", 0);
                    this.field80 = new class30(var6, "redstone2", 0);
                    this.field81 = new class30(var6, "redstone3", 0);
                    this.field82 = new class30(var6, "redstone1", 0);
                    this.field82.method368(-8226);
                    this.field83 = new class30(var6, "redstone2", 0);
                    this.field83.method368(-8226);
                    this.field230 = new class30(var6, "redstone1", 0);
                    this.field230.method369(775);
                    this.field231 = new class30(var6, "redstone2", 0);
                    this.field231.method369(775);
                    this.field232 = new class30(var6, "redstone3", 0);
                    this.field232.method369(775);
                    this.field233 = new class30(var6, "redstone1", 0);
                    this.field233.method368(-8226);
                    this.field233.method369(775);
                    this.field234 = new class30(var6, "redstone2", 0);
                    this.field234.method368(-8226);
                    this.field234.method369(775);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field441[var36] = new class30(var6, "mod_icons", var36);
                    }
                    class52 var37 = new class52(var6, "backleft1", 0);
                    this.field170 = new class34(this.method174(false), var37.field1436, var37.field1435, 284);
                    var37.method509(0, 673, 0);
                    class52 var38 = new class52(var6, "backleft2", 0);
                    this.field171 = new class34(this.method174(false), var38.field1436, var38.field1435, 284);
                    var38.method509(0, 673, 0);
                    class52 var39 = new class52(var6, "backright1", 0);
                    this.field172 = new class34(this.method174(false), var39.field1436, var39.field1435, 284);
                    var39.method509(0, 673, 0);
                    class52 var40 = new class52(var6, "backright2", 0);
                    this.field173 = new class34(this.method174(false), var40.field1436, var40.field1435, 284);
                    var40.method509(0, 673, 0);
                    class52 var41 = new class52(var6, "backtop1", 0);
                    this.field174 = new class34(this.method174(false), var41.field1436, var41.field1435, 284);
                    var41.method509(0, 673, 0);
                    class52 var42 = new class52(var6, "backvmid1", 0);
                    this.field175 = new class34(this.method174(false), var42.field1436, var42.field1435, 284);
                    var42.method509(0, 673, 0);
                    class52 var43 = new class52(var6, "backvmid2", 0);
                    this.field176 = new class34(this.method174(false), var43.field1436, var43.field1435, 284);
                    var43.method509(0, 673, 0);
                    class52 var44 = new class52(var6, "backvmid3", 0);
                    this.field177 = new class34(this.method174(false), var44.field1436, var44.field1435, 284);
                    var44.method509(0, 673, 0);
                    class52 var45 = new class52(var6, "backhmid2", 0);
                    this.field178 = new class34(this.method174(false), var45.field1436, var45.field1435, 284);
                    var45.method509(0, 673, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field448[var50] != null) {
                            this.field448[var50].method507(var46 + var49, var48 + var49, var47 + var49, (byte) 0);
                        }
                        if (this.field122[var50] != null) {
                            this.field122[var50].method370(var46 + var49, var48 + var49, var47 + var49, (byte) 0);
                        }
                    }
                    this.method188(53, "Unpacking textures", 83);
                    class10.method249(var7, 31078);
                    class10.method253(-39806, 0.8D);
                    class10.method248(-621, 20);
                    this.method188(53, "Unpacking config", 86);
                    class29.method363(0, var4);
                    class7.method220(var4);
                    class53.method519(0, var4);
                    class22.method293(var4);
                    class58.method531(var4);
                    class23.method301(0, var4);
                    class6.method60(0, var4);
                    class70.method597(0, var4);
                    class18.method275(0, var4);
                    class22.field888 = field127;
                    if (!field128) {
                        this.method188(53, "Unpacking sounds", 90);
                        byte[] var51 = var9.method488("sounds.dat", (byte[]) null);
                        class42 var52 = new class42(5, var51);
                        class50.method496(0, var52);
                    }
                    this.method188(53, "Unpacking interfaces", 95);
                    class62[] var53 = new class62[] { this.field165, this.field166, this.field167, this.field168 };
                    class37.method396(true, var6, var5, var53);
                    this.method188(53, "Preparing game engine", 100);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field258.field1037[this.field258.field1039 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field336[var54] = var55;
                        this.field449[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field258.field1037[this.field258.field1039 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field306[var58 - 5] = var59 - 25;
                        this.field447[var58 - 5] = var60 - var59;
                    }
                    class10.method246(765, 503, 0);
                    this.field547 = class10.field680;
                    class10.method246(479, 96, 0);
                    this.field544 = class10.field680;
                    class10.method246(190, 261, 0);
                    this.field545 = class10.field680;
                    class10.method246(512, 334, 0);
                    this.field546 = class10.field680;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class10.field678[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class28.method348(800, true, 500, 334, 512, var62);
                    class1.method1(var8);
                    this.field195 = new class65((byte) 117, this);
                    this.method164(this.field195, 10);
                    class66.field1664 = this;
                    class7.field575 = this;
                    class58.field1489 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field402 + " " + this.field118);
                    this.field317 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)I")
    public final int method124(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field114 != arg3) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        int var6 = 256 - arg2;
        return ((arg0 & 16711935) * arg2 + (arg1 & 16711935) * var6 & -16711936) + ((arg0 & 65280) * arg2 + (arg1 & 65280) * var6 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        this.field531 = false;
        while (this.field506) {
            this.field531 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field218 = null;
        this.field219 = null;
        this.field364 = null;
        this.field469 = null;
        this.field392 &= arg0;
        this.field470 = null;
        this.field471 = null;
        this.field472 = null;
        this.field345 = null;
        this.field346 = null;
        this.field141 = null;
        this.field142 = null;
        this.field207 = null;
        this.field208 = null;
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method126(int arg0) {
        if (this.field260 == null) {
            super.field1196 = null;
            this.field356 = null;
            this.field354 = null;
            this.field353 = null;
            this.field355 = null;
            this.field442 = null;
            this.field443 = null;
            this.field444 = null;
            this.field263 = new class34(this.method174(false), 265, 128, 284);
            class67.method579(false);
            this.field264 = new class34(this.method174(false), 265, 128, 284);
            class67.method579(false);
            this.field260 = new class34(this.method174(false), 171, 509, 284);
            class67.method579(false);
            this.field261 = new class34(this.method174(false), 132, 360, 284);
            class67.method579(false);
            this.field262 = new class34(this.method174(false), 200, 360, 284);
            class67.method579(false);
            this.field265 = new class34(this.method174(false), 238, 202, 284);
            class67.method579(false);
            this.field266 = new class34(this.method174(false), 238, 203, 284);
            class67.method579(false);
            this.field267 = new class34(this.method174(false), 94, 74, 284);
            class67.method579(false);
            this.field268 = new class34(this.method174(false), 94, 75, 284);
            class67.method579(false);
            if (this.field103 != null) {
                this.method68((byte) 7);
                this.method152(field223);
            }
            this.field332 = true;
            if (arg0 != 0) {
                field112 = -380;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTTWFVYGB;III)V")
    public final void method127(class52 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        while (arg2 >= 0) {
            this.field200.method410(251);
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field521 + this.field135 & 2047;
            int var7 = class43.field1341[var6];
            int var8 = class43.field1342[var6];
            int var9 = var7 * 256 / (this.field374 + 256);
            int var10 = var8 * 256 / (this.field374 + 256);
            int var11 = arg1 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg1 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field420.method516(15, 256, 15, 20, var13, var15 + 94 + 4 - 10, this.field151, 20, 83 - var16 - 20);
        } else {
            this.method203(arg0, arg1, true, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method128(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field65 >= 100) {
                this.method65((byte) 8, 0, "", "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class68.method592((byte) 20, class68.method589(arg0, -115));
                for (int var5 = 0; var5 < this.field65; ++var5) {
                    if (this.field163[var5] == arg0) {
                        this.method65((byte) 8, 0, "", var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field327; ++var6) {
                    if (this.field193[var6] == arg0) {
                        this.method65((byte) 8, 0, "", "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                while (arg1 >= 0) {
                    field223 = this.field139.method51();
                }
                this.field163[this.field65++] = arg0;
                this.field361 = true;
                this.field200.method409((byte) -81, 240);
                this.field200.method416(30294, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method129(int arg0) {
        short var2 = 256;
        if (this.field464 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field464 > 768) {
                    this.field469[var3] = this.method124(this.field471[var3], this.field470[var3], 1024 - this.field464, this.field114);
                } else if (this.field464 > 256) {
                    this.field469[var3] = this.field471[var3];
                } else {
                    this.field469[var3] = this.method124(this.field470[var3], this.field471[var3], 256 - this.field464, this.field114);
                }
            }
        } else if (this.field465 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field465 > 768) {
                    this.field469[var4] = this.method124(this.field472[var4], this.field470[var4], 1024 - this.field465, this.field114);
                } else if (this.field465 > 256) {
                    this.field469[var4] = this.field472[var4];
                } else {
                    this.field469[var4] = this.method124(this.field470[var4], this.field472[var4], 256 - this.field465, this.field114);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field469[var5] = this.field470[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field263.field1088[var6] = this.field207.field1434[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field492[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field141[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field469[var26];
                    int var30 = this.field263.field1088[var8];
                    this.field263.field1088[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field263.method378(0, 0, 0, super.field1195);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field264.field1088[var10] = this.field208.field1434[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field492[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field141[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field469[var18];
                    int var22 = this.field264.field1088[var16];
                    this.field264.field1088[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field264.method378(637, 0, 0, super.field1195);
        this.field97 += arg0;
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method130(int arg0) {
        int var2 = this.field156 * 128 + 64;
        int var3 = this.field157 * 128 + 64;
        int var4 = this.method91(this.field179, var2, false, var3) - this.field158;
        if (this.field269 < var2) {
            this.field269 += (var2 - this.field269) * this.field160 / 1000 + this.field159;
            if (this.field269 > var2) {
                this.field269 = var2;
            }
        }
        if (this.field269 > var2) {
            this.field269 -= (this.field269 - var2) * this.field160 / 1000 + this.field159;
            if (this.field269 < var2) {
                this.field269 = var2;
            }
        }
        if (this.field270 < var4) {
            this.field270 += (var4 - this.field270) * this.field160 / 1000 + this.field159;
            if (this.field270 > var4) {
                this.field270 = var4;
            }
        }
        if (this.field270 > var4) {
            this.field270 -= (this.field270 - var4) * this.field160 / 1000 + this.field159;
            if (this.field270 < var4) {
                this.field270 = var4;
            }
        }
        if (this.field271 < var3) {
            this.field271 += (var3 - this.field271) * this.field160 / 1000 + this.field159;
            if (this.field271 > var3) {
                this.field271 = var3;
            }
        }
        if (this.field271 > var3) {
            this.field271 -= (this.field271 - var3) * this.field160 / 1000 + this.field159;
            if (this.field271 < var3) {
                this.field271 = var3;
            }
        }
        int var5 = this.field412 * 128 + 64;
        int var6 = this.field413 * 128 + 64;
        int var7 = this.method91(this.field179, var5, false, var6) - this.field414;
        int var8 = var5 - this.field269;
        int var9 = var7 - this.field270;
        int var10 = var6 - this.field271;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        this.field97 += arg0;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field272 < var12) {
            this.field272 += (var12 - this.field272) * this.field416 / 1000 + this.field415;
            if (this.field272 > var12) {
                this.field272 = var12;
            }
        }
        if (this.field272 > var12) {
            this.field272 -= (this.field272 - var12) * this.field416 / 1000 + this.field415;
            if (this.field272 < var12) {
                this.field272 = var12;
            }
        }
        int var14 = var13 - this.field273;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field273 += this.field416 * var14 / 1000 + this.field415;
            this.field273 &= 2047;
        }
        if (var14 < 0) {
            this.field273 -= -var14 * this.field416 / 1000 + this.field415;
            this.field273 &= 2047;
        }
        int var15 = var13 - this.field273;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field273 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNPNTBMMX;Z)Z")
    public final boolean method131(class37 arg0, boolean arg1) {
        int var3 = arg0.field1172;
        if (arg1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (this.field328 == 2) {
            if (var3 == 201) {
                this.field380 = true;
                this.field397 = 0;
                this.field286 = true;
                this.field379 = "";
                this.field94 = 1;
                this.field362 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field380 = true;
                this.field397 = 0;
                this.field286 = true;
                this.field379 = "";
                this.field94 = 2;
                this.field362 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field101 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field380 = true;
                this.field397 = 0;
                this.field286 = true;
                this.field379 = "";
                this.field94 = 4;
                this.field362 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field380 = true;
                this.field397 = 0;
                this.field286 = true;
                this.field379 = "";
                this.field94 = 5;
                this.field362 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var5 = (var3 - 300) / 2;
                int var6 = var3 & 1;
                int var7 = this.field329[var5];
                if (var7 != -1) {
                    while (true) {
                        if (var6 == 0) {
                            --var7;
                            if (var7 < 0) {
                                var7 = class23.field903 - 1;
                            }
                        }
                        if (var6 == 1) {
                            ++var7;
                            if (var7 >= class23.field903) {
                                var7 = 0;
                            }
                        }
                        if (!class23.field904[var7].field910 && class23.field904[var7].field905 == var5 + (this.field209 ? 0 : 7)) {
                            this.field329[var5] = var7;
                            this.field88 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var8 = (var3 - 314) / 2;
                int var9 = var3 & 1;
                int var10 = this.field297[var8];
                if (var9 == 0) {
                    --var10;
                    if (var10 < 0) {
                        var10 = field378[var8].length - 1;
                    }
                }
                if (var9 == 1) {
                    ++var10;
                    if (var10 >= field378[var8].length) {
                        var10 = 0;
                    }
                }
                this.field297[var8] = var10;
                this.field88 = true;
            }
            if (var3 == 324 && !this.field209) {
                this.field209 = true;
                this.method98(8);
            }
            if (var3 == 325 && this.field209) {
                this.field209 = false;
                this.method98(8);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field489 = !this.field489;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method206((byte) 72);
                    if (this.field66.length() > 0) {
                        this.field200.method409((byte) -81, 251);
                        this.field200.method416(30294, class68.method588(this.field66));
                        this.field200.method410(var3 - 601);
                        this.field200.method410(this.field489 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field200.method409((byte) -81, 22);
                this.field200.method410(this.field209 ? 0 : 1);
                for (int var11 = 0; var11 < 7; ++var11) {
                    this.field200.method410(this.field329[var11]);
                }
                for (int var12 = 0; var12 < 5; ++var12) {
                    this.field200.method410(this.field297[var12]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method132(int arg0) {
        signlink.midiplay = false;
        if (arg0 >= 0) {
            this.field200.method410(167);
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field125 = Integer.parseInt(this.getParameter("nodeid"));
        field126 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method133((byte) 31);
        } else {
            method150(false);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field127 = false;
        } else {
            field127 = true;
        }
        this.method404(765, 503, (byte) 57);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public static final void method133(byte arg0) {
        class28.field949 = true;
        if (arg0 == 31) {
            class10.field669 = true;
            field128 = true;
            class63.field1606 = true;
            class7.field597 = true;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method134(int arg0) {
        try {
            if (this.field62 != null) {
                this.field62.method277();
            }
        } catch (Exception var3) {
        }
        this.field62 = null;
        this.field392 = false;
        if (arg0 != 0) {
            this.field295 = null;
        }
        this.field481 = 0;
        this.field180 = "";
        this.field181 = "";
        this.method199(-620);
        this.field245.method312((byte) 2);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field300[var2].method39();
        }
        System.gc();
        this.method132(-958);
        this.field530 = -1;
        this.field242 = -1;
        this.field221 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method135(String arg0, int arg1, String arg2) {
        if (arg1 >= 0) {
            this.field527 = !this.field527;
        }
        if (this.field355 != null) {
            this.field355.method377(this.field201);
            class10.field680 = this.field546;
            int var4 = 151;
            if (arg0 != null) {
                var4 -= 7;
            }
            this.field166.method534(257, 648, var4, arg2, 0);
            this.field166.method534(256, 648, var4 - 1, arg2, 16777215);
            var4 += 15;
            if (arg0 != null) {
                this.field166.method534(257, 648, var4, arg0, 0);
                this.field166.method534(256, 648, var4 - 1, arg0, 16777215);
            }
            this.field355.method378(4, 0, 4, super.field1195);
        } else if (super.field1196 != null) {
            super.field1196.method377(this.field201);
            class10.field680 = this.field547;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class67.method581(383 - var6 / 2, (byte) 109, 0, var6, var7, var5 - 5 - var7 / 2);
            class67.method582(var6, 16777215, 383 - var6 / 2, var7, (byte) 12, var5 - 5 - var7 / 2);
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field166.method534(383, 648, var5, arg2, 0);
            this.field166.method534(382, 648, var5 - 1, arg2, 16777215);
            var5 += 15;
            if (arg0 != null) {
                this.field166.method534(383, 648, var5, arg0, 0);
                this.field166.method534(382, 648, var5 - 1, arg0, 16777215);
            }
            super.field1196.method378(0, 0, 0, super.field1195);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILZQANNJZE;)V")
    public final void method136(int arg0, int arg1, int arg2, int arg3, class69 arg4) {
        if (field206 != arg4) {
            if (this.field383 < 400) {
                while (arg1 >= 0) {
                    this.field200.method410(254);
                }
                String var6;
                if (arg4.field1704 == 0) {
                    var6 = arg4.field1708 + method185(arg4.field1706, true, field206.field1706) + " (level-" + arg4.field1706 + ")";
                } else {
                    var6 = arg4.field1708 + " (skill-" + arg4.field1704 + ")";
                }
                if (this.field458 == 1) {
                    this.field495[this.field383] = "Use " + this.field462 + " with @whi@" + var6;
                    this.field423[this.field383] = 326;
                    this.field424[this.field383] = arg3;
                    this.field421[this.field383] = arg2;
                    this.field422[this.field383] = arg0;
                    ++this.field383;
                } else if (this.field550 == 1) {
                    if ((this.field552 & 8) == 8) {
                        this.field495[this.field383] = this.field553 + " @whi@" + var6;
                        this.field423[this.field383] = 8;
                        this.field424[this.field383] = arg3;
                        this.field421[this.field383] = arg2;
                        this.field422[this.field383] = arg0;
                        ++this.field383;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field381[var7] != null) {
                            this.field495[this.field383] = this.field381[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field381[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field1706 > field206.field1706) {
                                    var9 = 2000;
                                }
                                if (field206.field1710 != 0 && arg4.field1710 != 0) {
                                    if (field206.field1710 == arg4.field1710) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field382[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field423[this.field383] = var9 + 646;
                            }
                            if (var7 == 1) {
                                this.field423[this.field383] = var9 + 479;
                            }
                            if (var7 == 2) {
                                this.field423[this.field383] = var9 + 749;
                            }
                            if (var7 == 3) {
                                this.field423[this.field383] = var9 + 525;
                            }
                            if (var7 == 4) {
                                this.field423[this.field383] = var9 + 572;
                            }
                            this.field424[this.field383] = arg3;
                            this.field421[this.field383] = arg2;
                            this.field422[this.field383] = arg0;
                            ++this.field383;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field383; ++var8) {
                    if (this.field423[var8] == 709) {
                        this.field495[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method137(int arg0) {
        if (!this.field513 && !this.field317 && !this.field388) {
            ++field182;
            if (!this.field392) {
                this.method147(false, false);
            } else {
                this.method88((byte) 85);
            }
            this.field290 = 0;
            this.field97 += arg0;
        } else {
            this.method107(false);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)V")
    public final void method138(int arg0, byte arg1) {
        if (arg1 == 51) {
            if (!field128) {
                for (int var3 = 0; var3 < this.field216.length; ++var3) {
                    int var4 = this.field216[var3];
                    if (class10.field688[var4] >= arg0) {
                        class30 var5 = class10.field682[var4];
                        int var6 = var5.field1040 * var5.field1039 - 1;
                        int var7 = this.field508 * var5.field1039 * 2;
                        byte[] var8 = var5.field1037;
                        byte[] var9 = this.field279;
                        for (int var10 = 0; var10 <= var6; ++var10) {
                            var9[var10] = var8[var10 - var7 & var6];
                        }
                        var5.field1037 = var9;
                        this.field279 = var8;
                        class10.method251(var4, -205);
                    }
                }
                ++field351;
                if (field351 > 66) {
                    field351 = 0;
                    this.field200.method409((byte) -81, 213);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method139(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field295 = null;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (arg0 == -12139) {
            this.field356.method377(this.field201);
            class10.field680 = this.field544;
            this.field259.method371(0, 0, false);
            if (this.field286) {
                this.field167.method534(239, 648, 40, this.field362, 0);
                this.field167.method534(239, 648, 60, this.field379 + "*", 128);
            } else if (this.field397 == 1) {
                this.field167.method534(239, 648, 40, "Enter amount:", 0);
                this.field167.method534(239, 648, 60, this.field339 + "*", 128);
            } else if (this.field397 == 2) {
                this.field167.method534(239, 648, 40, "Enter name:", 0);
                this.field167.method534(239, 648, 60, this.field339 + "*", 128);
            } else if (this.field397 == 3) {
                if (this.field339 != this.field281) {
                    this.method109(this.field339, 770);
                    this.field281 = this.field339;
                }
                class62 var2 = this.field166;
                class67.method578(463, 0, 0, 77, 5);
                for (int var3 = 0; var3 < this.field282; ++var3) {
                    int var4 = var3 * 14 + 18 - this.field285;
                    if (var4 > 0 && var4 < 110) {
                        var2.method534(239, 648, var4, this.field283[var3], 0);
                    }
                }
                class67.method577(-423);
                if (this.field282 > 5) {
                    this.method209(0, this.field282 * 14 + 7, this.field285, 77, 0, 463);
                }
                if (this.field339.length() == 0) {
                    this.field167.method534(239, 648, 40, "Enter object name", 255);
                } else if (this.field282 == 0) {
                    this.field167.method534(239, 648, 40, "No matching objects found, please shorten search", 0);
                }
                var2.method534(239, 648, 90, this.field339 + "*", 0);
                class67.method584(0, 0, 479, 77, 0);
            } else if (this.field316 != null) {
                this.field167.method534(239, 648, 40, this.field316, 0);
                this.field167.method534(239, 648, 60, "Click to continue", 128);
            } else if (this.field323 != -1) {
                this.method170(0, class37.method393(this.field323), 0, 0, false);
            } else if (this.field559 != -1) {
                this.method170(0, class37.method393(this.field559), 0, 0, false);
            } else {
                class62 var5 = this.field166;
                int var6 = 0;
                class67.method578(463, 0, 0, 77, 5);
                for (int var7 = 0; var7 < 100; ++var7) {
                    if (this.field503[var7] != null) {
                        int var9 = this.field501[var7];
                        int var10 = 70 - var6 * 14 + this.field558;
                        String var11 = this.field502[var7];
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
                                var5.method538(0, var10, 862, 4, this.field503[var7]);
                            }
                            ++var6;
                        }
                        if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field366 == 0 || this.field366 == 1 && this.method79((byte) -124, var11))) {
                            if (var10 > 0 && var10 < 110) {
                                int var13 = 4;
                                if (var12 == 1) {
                                    this.field441[0].method371(var13, var10 - 12, false);
                                    var13 += 14;
                                }
                                if (var12 == 2) {
                                    this.field441[1].method371(var13, var10 - 12, false);
                                    var13 += 14;
                                }
                                var5.method538(0, var10, 862, var13, var11 + ":");
                                int var14 = var13 + var5.method536(false, var11) + 8;
                                var5.method538(255, var10, 862, var14, this.field503[var7]);
                            }
                            ++var6;
                        }
                        if ((var9 == 3 || var9 == 7) && this.field463 == 0 && (var9 == 7 || this.field350 == 0 || this.field350 == 1 && this.method79((byte) -124, var11))) {
                            if (var10 > 0 && var10 < 110) {
                                byte var15 = 4;
                                var5.method538(0, var10, 862, var15, "From");
                                int var16 = var15 + var5.method536(false, "From ");
                                if (var12 == 1) {
                                    this.field441[0].method371(var16, var10 - 12, false);
                                    var16 += 14;
                                }
                                if (var12 == 2) {
                                    this.field441[1].method371(var16, var10 - 12, false);
                                    var16 += 14;
                                }
                                var5.method538(0, var10, 862, var16, var11 + ":");
                                int var17 = var16 + var5.method536(false, var11) + 8;
                                var5.method538(8388608, var10, 862, var17, this.field503[var7]);
                            }
                            ++var6;
                        }
                        if (var9 == 4 && (this.field407 == 0 || this.field407 == 1 && this.method79((byte) -124, var11))) {
                            if (var10 > 0 && var10 < 110) {
                                var5.method538(8388736, var10, 862, 4, var11 + " " + this.field503[var7]);
                            }
                            ++var6;
                        }
                        if (var9 == 5 && this.field463 == 0 && this.field350 < 2) {
                            if (var10 > 0 && var10 < 110) {
                                var5.method538(8388608, var10, 862, 4, this.field503[var7]);
                            }
                            ++var6;
                        }
                        if (var9 == 6 && this.field463 == 0 && this.field350 < 2) {
                            if (var10 > 0 && var10 < 110) {
                                var5.method538(0, var10, 862, 4, "To " + var11 + ":");
                                var5.method538(8388608, var10, 862, 12 + var5.method536(false, "To " + var11), this.field503[var7]);
                            }
                            ++var6;
                        }
                        if (var9 == 8 && (this.field407 == 0 || this.field407 == 1 && this.method79((byte) -124, var11))) {
                            if (var10 > 0 && var10 < 110) {
                                var5.method538(8270336, var10, 862, 4, var11 + " " + this.field503[var7]);
                            }
                            ++var6;
                        }
                    }
                }
                class67.method577(-423);
                this.field117 = var6 * 14 + 7;
                if (this.field117 < 78) {
                    this.field117 = 78;
                }
                this.method209(0, this.field117, this.field117 - this.field558 - 77, 77, 0, 463);
                String var8;
                if (field206 != null && field206.field1708 != null) {
                    var8 = field206.field1708;
                } else {
                    var8 = class68.method592((byte) 20, this.field180);
                }
                var5.method538(0, 90, 862, 4, var8 + ":");
                var5.method538(255, 90, 862, 6 + var5.method536(false, var8 + ": "), this.field482 + "*");
                class67.method584(0, 0, 479, 77, 0);
            }
            if (this.field154 && this.field184 == 2) {
                this.method160(0);
            }
            this.field356.method378(17, 0, 357, super.field1195);
            this.field355.method377(this.field201);
            class10.field680 = this.field546;
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method141(int arg0, int arg1) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI[B)Z")
    public final boolean method142(boolean arg0, int arg1, byte[] arg2) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return arg2 == null ? true : signlink.wavesave(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method143(boolean arg0) {
        int var2 = this.field167.method536(false, "Choose Option");
        for (int var3 = 0; var3 < this.field383; ++var3) {
            int var11 = this.field167.method536(false, this.field495[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        this.field392 &= arg0;
        int var4 = this.field383 * 15 + 21;
        if (super.field1210 > 4 && super.field1211 > 4 && super.field1210 < 516 && super.field1211 < 338) {
            int var5 = super.field1210 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1211 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field154 = true;
            this.field184 = 0;
            this.field185 = var5;
            this.field186 = var6;
            this.field187 = var2;
            this.field188 = this.field383 * 15 + 22;
        }
        if (super.field1210 > 553 && super.field1211 > 205 && super.field1210 < 743 && super.field1211 < 466) {
            int var7 = super.field1210 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1211 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field154 = true;
            this.field184 = 1;
            this.field185 = var7;
            this.field186 = var8;
            this.field187 = var2;
            this.field188 = this.field383 * 15 + 22;
        }
        if (super.field1210 > 17 && super.field1211 > 357 && super.field1210 < 496 && super.field1211 < 453) {
            int var9 = super.field1210 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1211 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field154 = true;
            this.field184 = 2;
            this.field185 = var9;
            this.field186 = var10;
            this.field187 = var2;
            this.field188 = this.field383 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    private final void method144(int arg0) {
        if (arg0 != 0) {
            this.field295 = null;
        }
        if (this.field307 == 2) {
            for (class24 var2 = (class24) this.field214.method269(); var2 != null; var2 = (class24) this.field214.method271(15175)) {
                if (var2.field914 > 0) {
                    --var2.field914;
                }
                if (var2.field914 == 0) {
                    if (var2.field916 < 0 || class63.method568(var2.field918, this.field431, var2.field916)) {
                        this.method181(var2.field921, var2.field918, var2.field916, var2.field919, var2.field917, (byte) 2, var2.field920, var2.field922);
                        var2.method221();
                    }
                } else {
                    if (var2.field915 > 0) {
                        --var2.field915;
                    }
                    if (var2.field915 == 0 && var2.field921 >= 1 && var2.field922 >= 1 && var2.field921 <= 102 && var2.field922 <= 102 && (var2.field911 < 0 || class63.method568(var2.field913, this.field431, var2.field911))) {
                        this.method181(var2.field921, var2.field913, var2.field911, var2.field919, var2.field912, (byte) 2, var2.field920, var2.field922);
                        var2.field915 = -1;
                        if (var2.field916 == var2.field911 && var2.field916 == -1) {
                            var2.method221();
                        } else if (var2.field916 == var2.field911 && var2.field917 == var2.field912 && var2.field918 == var2.field913) {
                            var2.method221();
                        }
                    }
                }
            }
        }
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

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    private final void method146(byte arg0) {
        if (this.field475 != arg0) {
            this.method123();
        }
        for (class24 var2 = (class24) this.field214.method269(); var2 != null; var2 = (class24) this.field214.method271(15175)) {
            if (var2.field914 == -1) {
                var2.field915 = 0;
                this.method204(-20618, var2);
            } else {
                var2.method221();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method147(boolean arg0, boolean arg1) {
        this.method126(0);
        this.field262.method377(this.field201);
        this.field218.method371(0, 0, false);
        if (!arg0) {
            short var3 = 360;
            short var4 = 200;
            if (this.field481 == 0) {
                int var5 = var4 / 2 + 80;
                this.field165.method535(this.field124.field623, 7711145, true, var5, 33387, var3 / 2);
                int var6 = var4 / 2 - 20;
                this.field167.method535("Welcome to RuneScape", 16776960, true, var6, 33387, var3 / 2);
                int var17 = var6 + 30;
                int var7 = var3 / 2 - 80;
                int var8 = var4 / 2 + 20;
                this.field219.method371(var7 - 73, var8 - 20, false);
                this.field167.method535("New User", 16777215, true, var8 + 5, 33387, var7);
                int var9 = var3 / 2 + 80;
                this.field219.method371(var9 - 73, var8 - 20, false);
                this.field167.method535("Existing User", 16777215, true, var8 + 5, 33387, var9);
            }
            if (this.field481 == 2) {
                int var10 = var4 / 2 - 40;
                if (this.field129.length() > 0) {
                    this.field167.method535(this.field129, 16776960, true, var10 - 15, 33387, var3 / 2);
                    this.field167.method535(this.field130, 16776960, true, var10, 33387, var3 / 2);
                    var10 += 30;
                } else {
                    this.field167.method535(this.field130, 16776960, true, var10 - 7, 33387, var3 / 2);
                    var10 += 30;
                }
                this.field167.method542(var10, 16777215, 817, var3 / 2 - 90, true, "Username: " + this.field180 + (this.field493 == 0 & field525 % 40 < 20 ? "@yel@|" : ""));
                var10 += 15;
                this.field167.method542(var10, 16777215, 817, var3 / 2 - 88, true, "Password: " + class68.method593(this.field181, 55) + (this.field493 == 1 & field525 % 40 < 20 ? "@yel@|" : ""));
                var10 += 15;
                if (!arg1) {
                    int var11 = var3 / 2 - 80;
                    int var12 = var4 / 2 + 50;
                    this.field219.method371(var11 - 73, var12 - 20, false);
                    this.field167.method535("Login", 16777215, true, var12 + 5, 33387, var11);
                    int var13 = var3 / 2 + 80;
                    this.field219.method371(var13 - 73, var12 - 20, false);
                    this.field167.method535("Cancel", 16777215, true, var12 + 5, 33387, var13);
                }
            }
            if (this.field481 == 3) {
                this.field167.method535("Create a free account", 16776960, true, var4 / 2 - 60, 33387, var3 / 2);
                int var14 = var4 / 2 - 35;
                this.field167.method535("To create a new account you need to", 16777215, true, var14, 33387, var3 / 2);
                int var18 = var14 + 15;
                this.field167.method535("go back to the main RuneScape webpage", 16777215, true, var18, 33387, var3 / 2);
                int var19 = var18 + 15;
                this.field167.method535("and choose the 'create account'", 16777215, true, var19, 33387, var3 / 2);
                int var20 = var19 + 15;
                this.field167.method535("button near the top of that page.", 16777215, true, var20, 33387, var3 / 2);
                int var21 = var20 + 15;
                int var15 = var3 / 2;
                int var16 = var4 / 2 + 50;
                this.field219.method371(var15 - 73, var16 - 20, false);
                this.field167.method535("Cancel", 16777215, true, var16 + 5, 33387, var15);
            }
            this.field262.method378(202, 0, 171, super.field1195);
            if (this.field332) {
                this.field332 = false;
                this.field260.method378(128, 0, 0, super.field1195);
                this.field261.method378(202, 0, 371, super.field1195);
                this.field265.method378(0, 0, 265, super.field1195);
                this.field266.method378(562, 0, 265, super.field1195);
                this.field267.method378(128, 0, 171, super.field1195);
                this.field268.method378(562, 0, 171, super.field1195);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIB)V")
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = this.field245.method338(arg1, arg4, arg2);
        if (arg5 == 9) {
            boolean var8 = false;
        } else {
            this.field68 = !this.field68;
        }
        if (var7 != 0) {
            int var9 = this.field245.method342(arg1, arg4, arg2, var7);
            int var10 = var9 >> 6 & 3;
            int var11 = var9 & 31;
            int var12 = arg0;
            if (var7 > 0) {
                var12 = arg3;
            }
            int[] var13 = this.field110.field1434;
            int var14 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
            int var15 = var7 >> 14 & 32767;
            class7 var16 = class7.method219(var15);
            if (var16.field607 != -1) {
                class30 var17 = this.field122[var16.field607];
                if (var17 != null) {
                    int var18 = (var16.field605 * 4 - var17.field1039) / 2;
                    int var19 = (var16.field611 * 4 - var17.field1040) / 2;
                    var17.method371(arg4 * 4 + 48 + var18, (104 - arg2 - var16.field611) * 4 + 48 + var19, false);
                }
            } else {
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var10 == 1) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var10 == 2) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 3 + 512] = var12;
                        var13[var14 + 3 + 1024] = var12;
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var10 == 3) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1536 + 1] = var12;
                        var13[var14 + 1536 + 2] = var12;
                        var13[var14 + 1536 + 3] = var12;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var13[var14] = var12;
                    } else if (var10 == 1) {
                        var13[var14 + 3] = var12;
                    } else if (var10 == 2) {
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var10 == 3) {
                        var13[var14 + 1536] = var12;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var10 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var10 == 1) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 3 + 512] = var12;
                        var13[var14 + 3 + 1024] = var12;
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var10 == 2) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1536 + 1] = var12;
                        var13[var14 + 1536 + 2] = var12;
                        var13[var14 + 1536 + 3] = var12;
                    }
                }
            }
        }
        int var20 = this.field245.method340(arg1, arg4, arg2);
        if (var20 != 0) {
            int var21 = this.field245.method342(arg1, arg4, arg2, var20);
            int var22 = var21 >> 6 & 3;
            int var23 = var21 & 31;
            int var24 = var20 >> 14 & 32767;
            class7 var25 = class7.method219(var24);
            if (var25.field607 != -1) {
                class30 var26 = this.field122[var25.field607];
                if (var26 != null) {
                    int var27 = (var25.field605 * 4 - var26.field1039) / 2;
                    int var28 = (var25.field611 * 4 - var26.field1040) / 2;
                    var26.method371(arg4 * 4 + 48 + var27, (104 - arg2 - var25.field611) * 4 + 48 + var28, false);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (var20 > 0) {
                    var29 = 15597568;
                }
                int[] var30 = this.field110.field1434;
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
        int var32 = this.field245.method341(arg1, arg4, arg2);
        if (var32 != 0) {
            int var33 = var32 >> 14 & 32767;
            class7 var34 = class7.method219(var33);
            if (var34.field607 != -1) {
                class30 var35 = this.field122[var34.field607];
                if (var35 != null) {
                    int var36 = (var34.field605 * 4 - var35.field1039) / 2;
                    int var37 = (var34.field611 * 4 - var35.field1040) / 2;
                    var35.method371(arg4 * 4 + 48 + var36, (104 - arg2 - var34.field611) * 4 + 48 + var37, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLPGNBHFUF;)V")
    private final void method149(int arg0, byte arg1, class42 arg2) {
        int var4 = arg2.method431(8, this.field191);
        if (arg1 != 99) {
            this.method123();
        }
        if (var4 < this.field311) {
            for (int var5 = var4; var5 < this.field311; ++var5) {
                this.field516[this.field515++] = this.field312[var5];
            }
        }
        if (var4 > this.field311) {
            signlink.reporterror(this.field180 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field311 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field312[var6];
                class69 var8 = this.field310[var7];
                int var9 = arg2.method431(1, this.field191);
                if (var9 == 0) {
                    this.field312[this.field311++] = var7;
                    var8.field742 = field525;
                } else {
                    int var10 = arg2.method431(2, this.field191);
                    if (var10 == 0) {
                        this.field312[this.field311++] = var7;
                        var8.field742 = field525;
                        this.field314[this.field313++] = var7;
                    } else if (var10 == 1) {
                        this.field312[this.field311++] = var7;
                        var8.field742 = field525;
                        int var11 = arg2.method431(3, this.field191);
                        var8.method264(var11, false, 719);
                        int var12 = arg2.method431(1, this.field191);
                        if (var12 == 1) {
                            this.field314[this.field313++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field312[this.field311++] = var7;
                        var8.field742 = field525;
                        int var13 = arg2.method431(3, this.field191);
                        var8.method264(var13, true, 719);
                        int var14 = arg2.method431(3, this.field191);
                        var8.method264(var14, true, 719);
                        int var15 = arg2.method431(1, this.field191);
                        if (var15 == 1) {
                            this.field314[this.field313++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field516[this.field515++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public static final void method150(boolean arg0) {
        class28.field949 = false;
        class10.field669 = false;
        field128 = false;
        class63.field1606 = false;
        if (arg0) {
            field205 = 219;
        }
        class7.field597 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public final boolean method151(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field102[var15][var36] = 0;
                this.field440[var15][var36] = 99999999;
            }
        }
        int var16 = arg3;
        int var17 = arg4;
        this.field102[arg3][arg4] = 99;
        this.field440[arg3][arg4] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field325[var18] = arg3;
        int var37 = var18 + 1;
        this.field326[var18] = arg4;
        boolean var20 = false;
        int var21 = this.field325.length;
        int[][] var22 = this.field300[this.field179].field26;
        while (var37 != var19) {
            var16 = this.field325[var19];
            var17 = this.field326[var19];
            var19 = (var19 + 1) % var21;
            if (arg8 == var16 && arg2 == var17) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && this.field300[this.field179].method48(var16, arg9, arg8, arg2, var17, 9, arg10 - 1)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && this.field300[this.field179].method49(var16, arg2, arg9, arg8, var17, arg10 - 1, true)) {
                    var20 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg1 != 0 && this.field300[this.field179].method50(arg7, (byte) 90, arg8, arg1, var17, arg2, var16, arg5)) {
                var20 = true;
                break;
            }
            int var35 = this.field440[var16][var17] + 1;
            if (var16 > 0 && this.field102[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field325[var37] = var16 - 1;
                this.field326[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field102[var16 - 1][var17] = 2;
                this.field440[var16 - 1][var17] = var35;
            }
            if (var16 < var13 - 1 && this.field102[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field325[var37] = var16 + 1;
                this.field326[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field102[var16 + 1][var17] = 8;
                this.field440[var16 + 1][var17] = var35;
            }
            if (var17 > 0 && this.field102[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field325[var37] = var16;
                this.field326[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field102[var16][var17 - 1] = 1;
                this.field440[var16][var17 - 1] = var35;
            }
            if (var17 < var14 - 1 && this.field102[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field325[var37] = var16;
                this.field326[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field102[var16][var17 + 1] = 4;
                this.field440[var16][var17 + 1] = var35;
            }
            if (var16 > 0 && var17 > 0 && this.field102[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field325[var37] = var16 - 1;
                this.field326[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field102[var16 - 1][var17 - 1] = 3;
                this.field440[var16 - 1][var17 - 1] = var35;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field102[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field325[var37] = var16 + 1;
                this.field326[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field102[var16 + 1][var17 - 1] = 9;
                this.field440[var16 + 1][var17 - 1] = var35;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field102[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field325[var37] = var16 - 1;
                this.field326[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field102[var16 - 1][var17 + 1] = 6;
                this.field440[var16 - 1][var17 + 1] = var35;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field102[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field325[var37] = var16 + 1;
                this.field326[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field102[var16 + 1][var17 + 1] = 12;
                this.field440[var16 + 1][var17 + 1] = var35;
            }
        }
        this.field238 = 0;
        if (!var20) {
            if (arg0) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg8 - var24; var25 <= arg8 + var24; ++var25) {
                        for (int var26 = arg2 - var24; var26 <= arg2 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field440[var25][var26] < var23) {
                                var23 = this.field440[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field238 = 1;
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
        int var28 = 49 / arg11;
        this.field325[var27] = var16;
        int var38 = var27 + 1;
        this.field326[var27] = var17;
        int var29;
        int var30 = var29 = this.field102[var16][var17];
        while (arg3 != var16 || arg4 != var17) {
            if (var29 != var30) {
                var29 = var30;
                this.field325[var38] = var16;
                this.field326[var38++] = var17;
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
            var30 = this.field102[var16][var17];
        }
        if (var38 <= 0) {
            if (arg6 == 1) {
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
            int var32 = this.field325[var38];
            int var33 = this.field326[var38];
            if (arg6 == 0) {
                this.field200.method409((byte) -81, 69);
                this.field200.method410(var31 + var31 + 3);
            }
            if (arg6 == 1) {
                this.field200.method409((byte) -81, 159);
                this.field200.method410(var31 + var31 + 3 + 14);
            }
            if (arg6 == 2) {
                this.field200.method409((byte) -81, 124);
                this.field200.method410(var31 + var31 + 3);
            }
            this.field108 = this.field325[0];
            this.field109 = this.field326[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field200.method436(-601, this.field325[var38] - var32);
                this.field200.method437(this.field326[var38] - var33, false);
            }
            this.field200.method444(this.field535 + var32, true);
            this.field200.method437(super.field1213[5] == 1 ? 1 : 0, false);
            this.field200.method443(26889, this.field536 + var33);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method152(int arg0) {
        this.field218 = new class30(this.field103, "titlebox", 0);
        if (this.field514 == arg0) {
            this.field219 = new class30(this.field103, "titlebutton", 0);
            this.field364 = new class30[12];
            for (int var2 = 0; var2 < 12; ++var2) {
                this.field364[var2] = new class30(this.field103, "runes", var2);
            }
            this.field207 = new class52(128, 265);
            this.field208 = new class52(128, 265);
            for (int var3 = 0; var3 < 33920; ++var3) {
                this.field207.field1434[var3] = this.field263.field1088[var3];
            }
            for (int var4 = 0; var4 < 33920; ++var4) {
                this.field208.field1434[var4] = this.field264.field1088[var4];
            }
            this.field470 = new int[256];
            for (int var5 = 0; var5 < 64; ++var5) {
                this.field470[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; ++var6) {
                this.field470[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field470[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field470[var8 + 192] = 16777215;
            }
            this.field471 = new int[256];
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field471[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field471[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field471[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field471[var12 + 192] = 16777215;
            }
            this.field472 = new int[256];
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field472[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field472[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field472[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field472[var16 + 192] = 16777215;
            }
            this.field469 = new int[256];
            this.field345 = new int[32768];
            this.field346 = new int[32768];
            this.method77((class30) null, 0);
            this.field141 = new int[32768];
            this.field142 = new int[32768];
            this.method188(53, "Connecting to fileserver", 10);
            if (!this.field531) {
                this.field69 = true;
                this.field531 = true;
                this.method164(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method153(boolean arg0) {
        if (arg0) {
            this.method123();
        }
        if (this.field298 == 0) {
            if (super.field1209 == 1) {
                int var2 = super.field1210 - 25 - 550;
                int var3 = super.field1211 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field521 + this.field135 & 2047;
                    int var5 = class10.field678[var4];
                    int var6 = class10.field679[var4];
                    int var7 = (this.field374 + 256) * var5 >> 8;
                    int var8 = (this.field374 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field206.field719 + var9 >> 7;
                    int var12 = field206.field720 - var10 >> 7;
                    boolean var13 = this.method151(true, 0, var12, field206.field750[0], field206.field751[0], 0, 1, 0, var11, 0, 0, 566);
                    if (var13) {
                        this.field200.method410(var2);
                        this.field200.method410(var3);
                        this.field200.method411(this.field135);
                        this.field200.method410(57);
                        this.field200.method410(this.field521);
                        this.field200.method410(this.field374);
                        this.field200.method410(89);
                        this.field200.method411(field206.field719);
                        this.field200.method411(field206.field720);
                        this.field200.method410(this.field238);
                        this.field200.method410(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method154(int arg0) {
        if (this.field321 > 1) {
            --this.field321;
        }
        if (this.field101 > 0) {
            --this.field101;
        }
        for (int var2 = 0; var2 < 5 && this.method202((byte) 8); ++var2) {
        }
        if (this.field392) {
            Object var3 = this.field195.field1646;
            synchronized (this.field195.field1646) {
                if (!field401) {
                    this.field195.field1645 = 0;
                } else if (super.field1209 != 0 || this.field195.field1645 >= 40) {
                    this.field200.method409((byte) -81, 175);
                    this.field200.method410(0);
                    int var4 = this.field200.field1250;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field195.field1645 && var4 - this.field200.field1250 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field195.field1642[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field195.field1647[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field195.field1642[var6] == -1 && this.field195.field1647[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field340 == var8 && this.field341 == var7) {
                            if (this.field360 < 2047) {
                                ++this.field360;
                            }
                        } else {
                            int var10 = var8 - this.field340;
                            this.field340 = var8;
                            int var11 = var7 - this.field341;
                            this.field341 = var7;
                            if (this.field360 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field200.method411((this.field360 << 12) + (var10 << 6) + var11);
                                this.field360 = 0;
                            } else if (this.field360 < 8) {
                                this.field200.method413((this.field360 << 19) + 8388608 + var9);
                                this.field360 = 0;
                            } else {
                                this.field200.method414((this.field360 << 19) + -1073741824 + var9);
                                this.field360 = 0;
                            }
                        }
                    }
                    this.field200.method419((byte) 5, this.field200.field1250 - var4);
                    if (var5 >= this.field195.field1645) {
                        this.field195.field1645 = 0;
                    } else {
                        this.field195.field1645 -= var5;
                        for (int var12 = 0; var12 < this.field195.field1645; ++var12) {
                            this.field195.field1647[var12] = this.field195.field1647[var5 + var12];
                            this.field195.field1642[var12] = this.field195.field1642[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1209 != 0) {
                long var13 = (super.field1212 - this.field485) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field485 = super.field1212;
                int var15 = super.field1211;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1210;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1209 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field200.method409((byte) -81, 137);
                this.field200.method451((var18 << 19) + (var19 << 20) + var17, (byte) 40);
            }
            if (this.field386 > 0) {
                --this.field386;
            }
            if (super.field1213[1] == 1 || super.field1213[2] == 1 || super.field1213[3] == 1 || super.field1213[4] == 1) {
                this.field387 = true;
            }
            if (this.field387 && this.field386 <= 0) {
                this.field386 = 20;
                this.field387 = false;
                this.field200.method409((byte) -81, 136);
                this.field200.method445(false, this.field134);
                this.field200.method411(this.field135);
            }
            if (super.field1200 && !this.field294) {
                this.field294 = true;
                this.field200.method409((byte) -81, 1);
                this.field200.method410(1);
            }
            if (!super.field1200 && this.field294) {
                this.field294 = false;
                this.field200.method409((byte) -81, 1);
                this.field200.method410(0);
            }
            this.method191((byte) 33);
            this.method144(this.field212);
            this.method103((byte) 8);
            ++this.field99;
            if (this.field99 > 750) {
                this.method101(false);
            }
            this.method159((byte) -57);
            this.method81(4);
            this.method156(0);
            ++this.field508;
            if (this.field557 != 0) {
                this.field556 += 20;
                if (this.field556 >= 400) {
                    this.field557 = 0;
                }
            }
            if (this.field520 != 0) {
                ++this.field517;
                if (this.field517 >= 15) {
                    if (this.field520 == 2) {
                        this.field361 = true;
                    }
                    if (this.field520 == 3) {
                        this.field380 = true;
                    }
                    this.field520 = 0;
                }
            }
            if (this.field498 != 0) {
                ++this.field237;
                if (super.field1203 > this.field499 + 5 || super.field1203 < this.field499 - 5 || super.field1204 > this.field500 + 5 || super.field1204 < this.field500 - 5) {
                    this.field93 = true;
                }
                if (super.field1202 == 0) {
                    if (this.field498 == 2) {
                        this.field361 = true;
                    }
                    if (this.field498 == 3) {
                        this.field380 = true;
                    }
                    this.field498 = 0;
                    if (this.field93 && this.field237 >= 5) {
                        this.field78 = -1;
                        this.method74(566);
                        if (this.field78 == this.field496 && this.field77 != this.field497) {
                            class37 var20 = class37.method393(this.field496);
                            byte var21 = 0;
                            if (this.field399 == 1 && var20.field1172 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1155[this.field77] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1103) {
                                int var22 = this.field497;
                                int var23 = this.field77;
                                var20.field1155[var23] = var20.field1155[var22];
                                var20.field1163[var23] = var20.field1163[var22];
                                var20.field1155[var22] = -1;
                                var20.field1163[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field497;
                                int var25 = this.field77;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method402(var24 - 1, var24, 3);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method402(var24 + 1, var24, 3);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method402(this.field77, this.field497, 3);
                            }
                            this.field200.method409((byte) -81, 207);
                            this.field200.method443(26889, this.field77);
                            this.field200.method437(var21, false);
                            this.field200.method445(false, this.field496);
                            this.field200.method445(false, this.field497);
                        }
                    } else if ((this.field524 == 1 || this.method92(this.field383 - 1, (byte) 8)) && this.field383 > 2) {
                        this.method143(true);
                    } else if (this.field383 > 0) {
                        this.method175(this.field383 - 1, true);
                    }
                    this.field517 = 10;
                    super.field1209 = 0;
                }
            }
            if (class28.field983 != -1) {
                int var26 = class28.field983;
                int var27 = class28.field984;
                boolean var28 = this.method151(true, 0, var27, field206.field750[0], field206.field751[0], 0, 0, 0, var26, 0, 0, 566);
                class28.field983 = -1;
                if (var28) {
                    this.field554 = super.field1210;
                    this.field555 = super.field1211;
                    this.field557 = 1;
                    this.field556 = 0;
                }
            }
            if (super.field1209 == 1 && this.field316 != null) {
                this.field316 = null;
                this.field380 = true;
                super.field1209 = 0;
            }
            this.method183(302);
            if (this.field451 == -1) {
                this.method153(false);
                this.method121((byte) 6);
                this.method195((byte) 1);
            }
            if (super.field1202 == 1 || super.field1209 == 1) {
                ++this.field290;
            }
            if (this.field280 == 0 && this.field289 == 0 && this.field320 == 0) {
                if (this.field391 > 0) {
                    --this.field391;
                }
            } else if (this.field391 < 100) {
                ++this.field391;
                if (this.field391 == 100) {
                    if (this.field280 != 0) {
                        this.field380 = true;
                    }
                    if (this.field289 != 0) {
                        this.field361 = true;
                    }
                }
            }
            if (this.field307 == 2) {
                this.method106(20);
            }
            if (this.field307 == 2 && this.field229) {
                this.method130(0);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field169[var29]++;
            }
            this.method187(0);
            ++super.field1201;
            if (super.field1201 > 4500) {
                this.field101 = 250;
                super.field1201 -= 500;
                this.field200.method409((byte) -81, 192);
            }
            ++this.field456;
            if (this.field456 > 500) {
                this.field456 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field477 += this.field478;
                }
                if ((var30 & 2) == 2) {
                    this.field357 += this.field358;
                }
                if ((var30 & 4) == 4) {
                    this.field404 += this.field405;
                }
            }
            if (this.field477 < -50) {
                this.field478 = 2;
            }
            if (this.field477 > 50) {
                this.field478 = -2;
            }
            if (this.field357 < -55) {
                this.field358 = 2;
            }
            if (this.field357 > 55) {
                this.field358 = -2;
            }
            if (this.field404 < -40) {
                this.field405 = 1;
            }
            if (this.field404 > 40) {
                this.field405 = -1;
            }
            ++this.field331;
            if (arg0 != -34183) {
                this.field295 = null;
            }
            if (this.field331 > 500) {
                this.field331 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field521 += this.field522;
                }
                if ((var31 & 2) == 2) {
                    this.field374 += this.field375;
                }
            }
            if (this.field521 < -60) {
                this.field522 = 2;
            }
            if (this.field521 > 60) {
                this.field522 = -2;
            }
            if (this.field374 < -20) {
                this.field375 = 1;
            }
            if (this.field374 > 10) {
                this.field375 = -1;
            }
            ++this.field100;
            if (this.field100 > 50) {
                this.field200.method409((byte) -81, 253);
            }
            try {
                if (this.field62 != null && this.field200.field1250 > 0) {
                    this.field62.method281(0, this.field200.field1249, this.field200.field1250, -230);
                    this.field200.field1250 = 0;
                    this.field100 = 0;
                }
            } catch (IOException var33) {
                this.method101(false);
            } catch (Exception var34) {
                this.method134(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method155(byte arg0) {
        ++this.field96;
        this.method165((byte) 9, true);
        this.method70(true, 0);
        this.method165((byte) 9, false);
        this.method70(false, 0);
        this.method63((byte) -48);
        this.method179(true);
        if (!this.field229) {
            int var2 = this.field134;
            if (this.field333 / 256 > var2) {
                var2 = this.field333 / 256;
            }
            if (this.field532[4] && this.field406[4] + 128 > var2) {
                var2 = this.field406[4] + 128;
            }
            int var3 = this.field404 + this.field135 & 2047;
            this.method122(var2 * 3 + 600, false, this.field385, this.field384, this.method91(this.field179, field206.field719, false, field206.field720) - 50, var3, var2);
        }
        int var4;
        if (!this.field229) {
            var4 = this.method99(728);
        } else {
            var4 = this.method100(this.field106);
        }
        int var5 = this.field269;
        int var6 = this.field270;
        int var7 = this.field271;
        int var8 = this.field272;
        int var9 = this.field273;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field532[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field105[var10] * 2 + 1) - (double) this.field105[var10] + Math.sin((double) this.field534[var10] / 100.0D * (double) this.field169[var10]) * (double) this.field406[var10]);
                if (var10 == 0) {
                    this.field269 += var12;
                }
                if (var10 == 1) {
                    this.field270 += var12;
                }
                if (var10 == 2) {
                    this.field271 += var12;
                }
                if (var10 == 3) {
                    this.field273 = this.field273 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field272 += var12;
                    if (this.field272 < 128) {
                        this.field272 = 128;
                    }
                    if (this.field272 > 383) {
                        this.field272 = 383;
                    }
                }
            }
        }
        int var11 = class10.field689;
        class43.field1336 = true;
        if (arg0 != -122) {
            this.field213 = 411;
        }
        class43.field1339 = 0;
        class43.field1337 = super.field1203 - 4;
        class43.field1338 = super.field1204 - 4;
        class67.method579(false);
        this.field245.method351(this.field273, false, this.field269, this.field270, this.field271, this.field272, var4);
        this.field245.method326(-41147);
        this.method89(0);
        this.method169(541);
        this.method138(var11, (byte) 51);
        this.method163(0);
        this.field355.method378(4, 0, 4, super.field1195);
        this.field269 = var5;
        this.field270 = var6;
        this.field271 = var7;
        this.field272 = var8;
        this.field273 = var9;
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method156(int arg0) {
        for (int var2 = -1; var2 < this.field311; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field309;
            } else {
                var6 = this.field312[var2];
            }
            class69 var7 = this.field310[var6];
            if (var7 != null && var7.field726 > 0) {
                --var7.field726;
                if (var7.field726 == 0) {
                    var7.field744 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field434; ++var3) {
            int var4 = this.field435[var3];
            class17 var5 = this.field433[var4];
            if (var5 != null && var5.field726 > 0) {
                --var5.field726;
                if (var5.field726 == 0) {
                    var5.field744 = null;
                }
            }
        }
        if (arg0 < 0 || arg0 > 0) {
            field112 = -270;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method157(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field327; ++var4) {
                if (this.field193[var4] == arg1) {
                    --this.field327;
                    this.field361 = true;
                    for (int var5 = var4; var5 < this.field327; ++var5) {
                        this.field393[var5] = this.field393[var5 + 1];
                        this.field296[var5] = this.field296[var5 + 1];
                        this.field193[var5] = this.field193[var5 + 1];
                    }
                    this.field200.method409((byte) -81, 143);
                    this.field200.method416(30294, arg1);
                    break;
                }
            }
            if (arg0 <= 0) {
                this.field295 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILWZSDIPBR;I)V")
    public final void method158(int arg0, int arg1, int arg2, class58 arg3, int arg4) {
        if (this.field383 < 400) {
            if (arg3.field1522 != null) {
                arg3 = arg3.method526((byte) 3);
            }
            if (arg3 != null) {
                if (arg3.field1511) {
                    String var6 = arg3.field1490;
                    if (arg2 <= 0) {
                        this.field192 = this.field139.method51();
                    }
                    if (arg3.field1517 != 0) {
                        var6 = var6 + method185(arg3.field1517, true, field206.field1706) + " (level-" + arg3.field1517 + ")";
                    }
                    if (this.field458 == 1) {
                        this.field495[this.field383] = "Use " + this.field462 + " with @yel@" + var6;
                        this.field423[this.field383] = 22;
                        this.field424[this.field383] = arg1;
                        this.field421[this.field383] = arg4;
                        this.field422[this.field383] = arg0;
                        ++this.field383;
                    } else {
                        if (this.field550 == 1) {
                            if ((this.field552 & 2) == 2) {
                                this.field495[this.field383] = this.field553 + " @yel@" + var6;
                                this.field423[this.field383] = 972;
                                this.field424[this.field383] = arg1;
                                this.field421[this.field383] = arg4;
                                this.field422[this.field383] = arg0;
                                ++this.field383;
                                return;
                            }
                        } else {
                            if (arg3.field1526 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg3.field1526[var7] != null && !arg3.field1526[var7].equalsIgnoreCase("attack")) {
                                        this.field495[this.field383] = arg3.field1526[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field423[this.field383] = 71;
                                        }
                                        if (var7 == 1) {
                                            this.field423[this.field383] = 133;
                                        }
                                        if (var7 == 2) {
                                            this.field423[this.field383] = 946;
                                        }
                                        if (var7 == 3) {
                                            this.field423[this.field383] = 546;
                                        }
                                        if (var7 == 4) {
                                            this.field423[this.field383] = 777;
                                        }
                                        this.field424[this.field383] = arg1;
                                        this.field421[this.field383] = arg4;
                                        this.field422[this.field383] = arg0;
                                        ++this.field383;
                                    }
                                }
                            }
                            if (arg3.field1526 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg3.field1526[var8] != null && arg3.field1526[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg3.field1517 > field206.field1706) {
                                            var9 = 2000;
                                        }
                                        this.field495[this.field383] = arg3.field1526[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field423[this.field383] = var9 + 71;
                                        }
                                        if (var8 == 1) {
                                            this.field423[this.field383] = var9 + 133;
                                        }
                                        if (var8 == 2) {
                                            this.field423[this.field383] = var9 + 946;
                                        }
                                        if (var8 == 3) {
                                            this.field423[this.field383] = var9 + 546;
                                        }
                                        if (var8 == 4) {
                                            this.field423[this.field383] = var9 + 777;
                                        }
                                        this.field424[this.field383] = arg1;
                                        this.field421[this.field383] = arg4;
                                        this.field422[this.field383] = arg0;
                                        ++this.field383;
                                    }
                                }
                            }
                            this.field495[this.field383] = "Examine @yel@" + var6;
                            this.field423[this.field383] = 1317;
                            this.field424[this.field383] = arg1;
                            this.field421[this.field383] = arg4;
                            this.field422[this.field383] = arg0;
                            ++this.field383;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method159(byte arg0) {
        if (arg0 == -57) {
            for (int var2 = -1; var2 < this.field311; ++var2) {
                int var3;
                if (var2 == -1) {
                    var3 = this.field309;
                } else {
                    var3 = this.field312[var2];
                }
                class69 var4 = this.field310[var3];
                if (var4 != null) {
                    this.method82(var4, 1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method160(int arg0) {
        int var2 = this.field185;
        int var3 = this.field186;
        int var4 = this.field187;
        int var5 = this.field188;
        int var6 = 6116423;
        class67.method581(var2, (byte) 109, var6, var4, var5, var3);
        this.field97 += arg0;
        class67.method581(var2 + 1, (byte) 109, 0, var4 - 2, 16, var3 + 1);
        class67.method582(var4 - 2, 0, var2 + 1, var5 - 19, (byte) 12, var3 + 18);
        this.field167.method538(var6, var3 + 14, 862, var2 + 3, "Choose Option");
        int var7 = super.field1203;
        int var8 = super.field1204;
        if (this.field184 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field184 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field184 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field383; ++var9) {
            int var10 = (this.field383 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field167.method542(var10, var11, 817, var2 + 3, true, this.field495[var9]);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIB)V")
    public final void method161(int arg0, int arg1, byte arg2) {
        if (this.field304 == arg2) {
            int var4 = 0;
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field503[var5] != null) {
                    int var6 = this.field501[var5];
                    int var7 = 70 - var4 * 14 + this.field558 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field502[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field366 == 0 || this.field366 == 1 && this.method79((byte) -124, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field206.field1708)) {
                            if (this.field330 >= 1) {
                                this.field495[this.field383] = "Report abuse @whi@" + var8;
                                this.field423[this.field383] = 31;
                                ++this.field383;
                            }
                            this.field495[this.field383] = "Add ignore @whi@" + var8;
                            this.field423[this.field383] = 370;
                            ++this.field383;
                            this.field495[this.field383] = "Add friend @whi@" + var8;
                            this.field423[this.field383] = 201;
                            ++this.field383;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field463 == 0 && (var6 == 7 || this.field350 == 0 || this.field350 == 1 && this.method79((byte) -124, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            if (this.field330 >= 1) {
                                this.field495[this.field383] = "Report abuse @whi@" + var8;
                                this.field423[this.field383] = 31;
                                ++this.field383;
                            }
                            this.field495[this.field383] = "Add ignore @whi@" + var8;
                            this.field423[this.field383] = 370;
                            ++this.field383;
                            this.field495[this.field383] = "Add friend @whi@" + var8;
                            this.field423[this.field383] = 201;
                            ++this.field383;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field407 == 0 || this.field407 == 1 && this.method79((byte) -124, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field495[this.field383] = "Accept trade @whi@" + var8;
                            this.field423[this.field383] = 88;
                            ++this.field383;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field463 == 0 && this.field350 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field407 == 0 || this.field407 == 1 && this.method79((byte) -124, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field495[this.field383] = "Accept challenge @whi@" + var8;
                            this.field423[this.field383] = 892;
                            ++this.field383;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field332 = true;
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method163(int arg0) {
        this.method75((byte) -29);
        if (this.field557 == 1) {
            this.field319[this.field556 / 100].method511(this.field554 - 8 - 4, this.field555 - 8 - 4, false);
        }
        if (this.field557 == 2) {
            this.field319[this.field556 / 100 + 4].method511(this.field554 - 8 - 4, this.field555 - 8 - 4, false);
            ++field63;
            if (field63 > 61) {
                field63 = 0;
                this.field200.method409((byte) -81, 62);
            }
        }
        if (this.field347 != -1) {
            this.method67(this.field508, field115, this.field347);
            this.method170(0, class37.method393(this.field347), 0, 0, false);
        }
        if (this.field318 != -1) {
            this.method67(this.field508, field115, this.field318);
            this.method170(0, class37.method393(this.field318), 0, 0, false);
        }
        this.method176(true);
        this.field97 += arg0;
        if (!this.field154) {
            this.method74(566);
            this.method115(true);
        } else if (this.field184 == 0) {
            this.method160(0);
        }
        if (this.field376 == 1) {
            this.field147.method511(472, 296, false);
        }
        if (field528) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1191 < 30 && field128) {
                var4 = 16711680;
            }
            if (super.field1191 < 20 && !field128) {
                var4 = 16711680;
            }
            this.field166.method533(var2, (byte) 1, var3, "Fps:" + super.field1191, var4);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field128) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field128) {
                int var9 = 16711680;
            }
            this.field166.method533(var2, (byte) 1, var13, "Mem:" + var6 + "k", 16776960);
            var13 += 15;
        }
        if (this.field321 != 0) {
            int var10 = this.field321 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field166.method538(16776960, 329, 862, 4, "System update in: " + var11 + ":0" + var12);
            } else {
                this.field166.method538(16776960, 329, 862, 4, "System update in: " + var11 + ":" + var12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method164(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method164(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method165(byte arg0, boolean arg1) {
        if (field206.field719 >> 7 == this.field108 && field206.field720 >> 7 == this.field109) {
            this.field108 = 0;
        }
        int var3 = this.field311;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class69 var6;
            int var7;
            if (arg1) {
                var6 = field206;
                var7 = this.field309 << 14;
            } else {
                var6 = this.field310[this.field312[var4]];
                var7 = this.field312[var4] << 14;
            }
            if (var6 != null && var6.method263((byte) 15)) {
                var6.field1689 = false;
                if ((field128 && this.field311 > 50 || this.field311 > 200) && !arg1 && var6.field748 == var6.field706) {
                    var6.field1689 = true;
                }
                int var8 = var6.field719 >> 7;
                int var9 = var6.field720 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field1694 != null && field525 >= var6.field1698 && field525 < var6.field1699) {
                        var6.field1689 = false;
                        var6.field1717 = this.method91(this.field179, var6.field719, false, var6.field720);
                        this.field245.method324(var6.field1717, var6.field720, 0, var7, var6.field1713, var6.field721, 60, var6.field1711, this.field179, var6.field719, var6.field1712, var6.field1714, var6);
                    } else {
                        if ((var6.field719 & 127) == 64 && (var6.field720 & 127) == 64) {
                            if (this.field438[var8][var9] == this.field96) {
                                continue;
                            }
                            this.field438[var8][var9] = this.field96;
                        }
                        var6.field1717 = this.method91(this.field179, var6.field719, false, var6.field720);
                        this.field245.method323(var6, var6.field1717, 1000, 60, this.field179, var6.field718, var6.field720, var7, var6.field719, var6.field721);
                    }
                }
            }
        }
        if (arg0 == 9) {
            boolean var5 = false;
        } else {
            this.field98 = this.field337.method420();
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method166(int arg0) {
        if (arg0 != 0) {
            field205 = this.field139.method51();
        }
        while (true) {
            class11 var2 = this.field124.method227();
            if (var2 == null) {
                return;
            }
            if (var2.field692 == 0) {
                class43.method458(-124, var2.field693, var2.field695);
                if ((this.field124.method236(var2.field693, field228) & 98) != 0) {
                    this.field361 = true;
                    if (this.field323 != -1 || this.field559 != -1) {
                        this.field380 = true;
                    }
                }
            }
            if (var2.field692 == 1 && var2.field695 != null) {
                class21.method284(this.field509, var2.field695);
            }
            if (var2.field692 == 2 && this.field242 == var2.field693 && var2.field695 != null) {
                this.method194(var2.field695, this.field243, 848);
            }
            if (var2.field692 == 3 && this.field307 == 1) {
                for (int var3 = 0; var3 < this.field196.length; ++var3) {
                    if (this.field302[var3] == var2.field693) {
                        this.field196[var3] = var2.field695;
                        if (var2.field695 == null) {
                            this.field302[var3] = -1;
                        }
                        break;
                    }
                    if (this.field303[var3] == var2.field693) {
                        this.field145[var3] = var2.field695;
                        if (var2.field695 == null) {
                            this.field303[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field692 == 93 && this.field124.method235(this.field437, var2.field693)) {
                class63.method569((byte) 4, this.field124, new class42(5, var2.field695));
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method167(byte arg0, int arg1) {
        if (arg0 == 1) {
            boolean var3 = false;
        } else {
            this.field98 = -1;
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IBLPGNBHFUF;)V")
    private final void method168(int arg0, byte arg1, class42 arg2) {
        this.field515 = 0;
        this.field313 = 0;
        if (arg1 != -79) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method66(-651, arg0, arg2);
        this.method149(arg0, (byte) 99, arg2);
        this.method120(arg0, arg2, (byte) 9);
        this.method78(0, arg0, arg2);
        for (int var5 = 0; var5 < this.field515; ++var5) {
            int var7 = this.field516[var5];
            if (field525 != this.field310[var7].field742) {
                this.field310[var7] = null;
            }
        }
        if (arg2.field1250 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field1250 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field311; ++var6) {
                if (this.field310[this.field312[var6]] == null) {
                    signlink.reporterror(this.field180 + " null entry in pl list - pos:" + var6 + " size:" + this.field311);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method169(int arg0) {
        if (arg0 <= 0) {
            this.field98 = -1;
        }
        if (this.field322 == 2) {
            this.method178(28544, (this.field367 - this.field535 << 7) + this.field370, this.field369 * 2, (this.field368 - this.field536 << 7) + this.field371);
            if (this.field143 > -1 && field525 % 20 < 10) {
                this.field183[0].method511(this.field143 - 12, this.field144 - 28, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILNPNTBMMX;IIZ)V")
    public final void method170(int arg0, class37 arg1, int arg2, int arg3, boolean arg4) {
        if (arg1.field1153 == 0 && arg1.field1119 != null) {
            if (!arg1.field1157 || this.field119 == arg1.field1160 || this.field90 == arg1.field1160 || this.field198 == arg1.field1160) {
                int var6 = class67.field1675;
                int var7 = class67.field1673;
                int var8 = class67.field1676;
                int var9 = class67.field1674;
                class67.method578(arg1.field1111 + arg2, arg0, arg2, arg1.field1106 + arg0, 5);
                int var10 = arg1.field1119.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field1108[var11] + arg2;
                    int var13 = arg1.field1117[var11] + arg0 - arg3;
                    class37 var14 = class37.method393(arg1.field1119[var11]);
                    int var15 = var14.field1130 + var12;
                    int var16 = var14.field1116 + var13;
                    if (var14.field1172 > 0) {
                        this.method96(true, var14);
                    }
                    if (var14.field1153 == 0) {
                        if (var14.field1156 > var14.field1129 - var14.field1106) {
                            var14.field1156 = var14.field1129 - var14.field1106;
                        }
                        if (var14.field1156 < 0) {
                            var14.field1156 = 0;
                        }
                        this.method170(var16, var14, var15, var14.field1156, false);
                        if (var14.field1129 > var14.field1106) {
                            this.method209(0, var14.field1129, var14.field1156, var14.field1106, var16, var14.field1111 + var15);
                        }
                    } else if (var14.field1153 != 1) {
                        if (var14.field1153 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1106; ++var18) {
                                for (int var19 = 0; var19 < var14.field1111; ++var19) {
                                    int var20 = (var14.field1127 + 32) * var19 + var15;
                                    int var21 = (var14.field1112 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1144[var17];
                                        var21 += var14.field1101[var17];
                                    }
                                    if (var14.field1155[var17] <= 0) {
                                        if (var14.field1121 != null && var17 < 20) {
                                            class52 var30 = var14.field1121[var17];
                                            if (var30 != null) {
                                                var30.method511(var20, var21, false);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1155[var17] - 1;
                                        if (var20 > class67.field1675 - 32 && var20 < class67.field1676 && var21 > class67.field1673 - 32 && var21 < class67.field1674 || this.field498 != 0 && this.field497 == var17) {
                                            int var25 = 0;
                                            if (this.field458 == 1 && this.field459 == var17 && this.field460 == var14.field1160) {
                                                var25 = 16777215;
                                            }
                                            class52 var26 = class22.method298(var24, var14.field1163[var17], var25, -479);
                                            if (var26 != null) {
                                                if (this.field498 != 0 && this.field497 == var17 && this.field496 == var14.field1160) {
                                                    var22 = super.field1203 - this.field499;
                                                    var23 = super.field1204 - this.field500;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field237 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method513(128, var20 + var22, var21 + var23, (byte) 0);
                                                    if (var21 + var23 < class67.field1673 && arg1.field1156 > 0) {
                                                        int var27 = (class67.field1673 - var21 - var23) * this.field508 / 3;
                                                        if (var27 > this.field508 * 10) {
                                                            var27 = this.field508 * 10;
                                                        }
                                                        if (var27 > arg1.field1156) {
                                                            var27 = arg1.field1156;
                                                        }
                                                        arg1.field1156 -= var27;
                                                        this.field500 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class67.field1674 && arg1.field1156 < arg1.field1129 - arg1.field1106) {
                                                        int var28 = (var21 + var23 + 32 - class67.field1674) * this.field508 / 3;
                                                        if (var28 > this.field508 * 10) {
                                                            var28 = this.field508 * 10;
                                                        }
                                                        if (var28 > arg1.field1129 - arg1.field1106 - arg1.field1156) {
                                                            var28 = arg1.field1129 - arg1.field1106 - arg1.field1156;
                                                        }
                                                        arg1.field1156 += var28;
                                                        this.field500 -= var28;
                                                    }
                                                } else if (this.field520 != 0 && this.field519 == var17 && this.field518 == var14.field1160) {
                                                    var26.method513(128, var20, var21, (byte) 0);
                                                } else {
                                                    var26.method511(var20, var21, false);
                                                }
                                                if (var26.field1439 == 33 || var14.field1163[var17] != 1) {
                                                    int var29 = var14.field1163[var17];
                                                    this.field165.method538(0, var21 + 10 + var23, 862, var20 + 1 + var22, method141(8, var29));
                                                    this.field165.method538(16776960, var21 + 9 + var23, 862, var20 + var22, method141(8, var29));
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1153 == 3) {
                            boolean var31 = false;
                            if (this.field198 == var14.field1160 || this.field90 == var14.field1160 || this.field119 == var14.field1160) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method119(var14, 4)) {
                                var32 = var14.field1142;
                                if (var31 && var14.field1115 != 0) {
                                    var32 = var14.field1115;
                                }
                            } else {
                                var32 = var14.field1134;
                                if (var31 && var14.field1126 != 0) {
                                    var32 = var14.field1126;
                                }
                            }
                            if (var14.field1120 == 0) {
                                if (var14.field1162) {
                                    class67.method581(var15, (byte) 109, var32, var14.field1111, var14.field1106, var16);
                                } else {
                                    class67.method582(var14.field1111, var32, var15, var14.field1106, (byte) 12, var16);
                                }
                            } else if (var14.field1162) {
                                class67.method580(var32, 256 - (var14.field1120 & 255), var15, var16, -683, var14.field1106, var14.field1111);
                            } else {
                                class67.method583((byte) 8, var14.field1111, var14.field1106, var16, var32, var15, 256 - (var14.field1120 & 255));
                            }
                        } else if (var14.field1153 == 4) {
                            class62 var33 = var14.field1147;
                            String var34 = var14.field1139;
                            boolean var35 = false;
                            if (this.field198 == var14.field1160 || this.field90 == var14.field1160 || this.field119 == var14.field1160) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method119(var14, 4)) {
                                var36 = var14.field1142;
                                if (var35 && var14.field1115 != 0) {
                                    var36 = var14.field1115;
                                }
                                if (var14.field1140.length() > 0) {
                                    var34 = var14.field1140;
                                }
                            } else {
                                var36 = var14.field1134;
                                if (var35 && var14.field1126 != 0) {
                                    var36 = var14.field1126;
                                }
                            }
                            if (var14.field1173 == 6 && this.field425) {
                                var34 = "Please wait...";
                                var36 = var14.field1134;
                            }
                            if (class67.field1671 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1595 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method139(this.method117((byte) 7, var14, 4), -566) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method139(this.method117((byte) 7, var14, 3), -566) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method139(this.method117((byte) 7, var14, 2), -566) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method139(this.method117((byte) 7, var14, 1), -566) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method139(this.method117((byte) 7, var14, 0), -566) + var34.substring(var38 + 2);
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
                                if (var14.field1151) {
                                    var33.method535(var44, var36, var14.field1102, var37, 33387, var14.field1111 / 2 + var15);
                                } else {
                                    var33.method542(var37, var36, 817, var15, var14.field1102, var44);
                                }
                                var37 += var33.field1595;
                            }
                        } else if (var14.field1153 == 5) {
                            class52 var45;
                            if (this.method119(var14, 4)) {
                                var45 = var14.field1118;
                            } else {
                                var45 = var14.field1145;
                            }
                            if (var45 != null) {
                                var45.method511(var15, var16, false);
                            }
                        } else if (var14.field1153 == 6) {
                            int var46 = class10.field674;
                            int var47 = class10.field675;
                            class10.field674 = var14.field1111 / 2 + var15;
                            class10.field675 = var14.field1106 / 2 + var16;
                            int var48 = class10.field678[var14.field1169] * var14.field1168 >> 16;
                            int var49 = class10.field679[var14.field1169] * var14.field1168 >> 16;
                            boolean var50 = this.method119(var14, 4);
                            int var51;
                            if (var50) {
                                var51 = var14.field1110;
                            } else {
                                var51 = var14.field1109;
                            }
                            class43 var52;
                            if (var51 == -1) {
                                var52 = var14.method399(11195, var50, -1, -1);
                            } else {
                                class29 var53 = class29.field1014[var51];
                                var52 = var14.method399(11195, var50, var53.field1016[var14.field1132], var53.field1017[var14.field1132]);
                            }
                            if (var52 != null) {
                                var52.method481(0, var14.field1170, 0, var14.field1169, 0, var48, var49);
                            }
                            class10.field674 = var46;
                            class10.field675 = var47;
                        } else {
                            if (var14.field1153 == 7) {
                                class62 var54 = var14.field1147;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1106; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1111; ++var57) {
                                        if (var14.field1155[var55] > 0) {
                                            class22 var58 = class22.method290(var14.field1155[var55] - 1);
                                            String var59 = var58.field851;
                                            if (var58.field875 || var14.field1163[var55] != 1) {
                                                var59 = var59 + " x" + method182(var14.field1163[var55], (byte) 31);
                                            }
                                            int var60 = (var14.field1127 + 115) * var57 + var15;
                                            int var61 = (var14.field1112 + 12) * var56 + var16;
                                            if (var14.field1151) {
                                                var54.method535(var59, var14.field1134, var14.field1102, var61, 33387, var14.field1111 / 2 + var60);
                                            } else {
                                                var54.method542(var61, var14.field1134, 817, var60, var14.field1102, var59);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1153 == 8 && (this.field280 == var14.field1160 || this.field289 == var14.field1160 || this.field320 == var14.field1160) && this.field391 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class62 var64 = this.field166;
                                String var65 = var14.field1139;
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
                                    int var74 = var64.method536(false, var73);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1595 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1111 + var15 - 5 - var62;
                                int var67 = var14.field1106 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg1.field1111 + arg2) {
                                    var66 = arg1.field1111 + arg2 - var62;
                                }
                                if (var63 + var67 > arg1.field1106 + arg0) {
                                    var67 = arg1.field1106 + arg0 - var63;
                                }
                                class67.method581(var66, (byte) 109, 16777120, var62, var63, var67);
                                class67.method582(var62, 0, var66, var63, (byte) 12, var67);
                                String var68 = var14.field1139;
                                int var69 = var64.field1595 + var67 + 2;
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
                                    var64.method542(var69, 0, 817, var66 + 3, false, var71);
                                    var69 += var64.field1595 + 1;
                                }
                            }
                        }
                    }
                }
                class67.method578(var8, var7, var6, var9, 5);
                if (arg4) {
                    this.method123();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method171(String arg0) throws IOException {
        if (!this.field348) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field480 != null) {
                try {
                    this.field480.close();
                } catch (Exception var4) {
                }
                this.field480 = null;
            }
            this.field480 = this.method201(43595);
            this.field480.setSoTimeout(10000);
            InputStream var2 = this.field480.getInputStream();
            OutputStream var3 = this.field480.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method172(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field327 >= 100 && this.field236 != 1) {
                this.method65((byte) 8, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field327 >= 200) {
                this.method65((byte) 8, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class68.method592((byte) 20, class68.method589(arg0, -115));
                for (int var5 = 0; var5 < this.field327; ++var5) {
                    if (this.field193[var5] == arg0) {
                        this.method65((byte) 8, 0, "", var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field65; ++var6) {
                    if (this.field163[var6] == arg0) {
                        this.method65((byte) 8, 0, "", "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field206.field1708)) {
                    this.field393[this.field327] = var4;
                    this.field193[this.field327] = arg0;
                    this.field296[this.field327] = 0;
                    ++this.field327;
                    this.field361 = true;
                    this.field200.method409((byte) -81, 221);
                    if (!arg1) {
                        for (int var7 = 1; var7 > 0; ++var7) {
                        }
                    }
                    this.field200.method416(30294, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public void method173(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field429);
        if (this.field124 != null) {
            System.out.println("Od-cycle:" + this.field124.field658);
        }
        System.out.println("loop-cycle:" + field525);
        if (arg0) {
            this.field98 = -1;
        }
        System.out.println("draw-cycle:" + field182);
        System.out.println("ptype:" + this.field98);
        System.out.println("psize:" + this.field97);
        if (this.field62 != null) {
            this.field62.method282(false);
        }
        super.field1192 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method174(boolean arg0) {
        if (arg0) {
            this.field200.method410(3);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1198 != null ? super.field1198 : this;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)V")
    public final void method175(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            int var3 = this.field421[arg0];
            int var4 = this.field422[arg0];
            int var5 = this.field423[arg0];
            int var6 = this.field424[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field397 != 0 && var5 != 1961) {
                this.field397 = 0;
                this.field380 = true;
            }
            if (var5 == 177) {
                this.field200.method409((byte) -81, 181);
                this.field200.method411(var6);
                this.field200.method445(false, var3);
                this.field200.method444(var4, true);
                this.field517 = 0;
                this.field518 = var4;
                this.field519 = var3;
                this.field520 = 2;
                if (class37.method393(var4).field1148 == this.field318) {
                    this.field520 = 1;
                }
                if (class37.method393(var4).field1148 == this.field323) {
                    this.field520 = 3;
                }
            }
            if (var5 == 716) {
                this.method94(var4, var6, var3, 288);
                this.field200.method409((byte) -81, 3);
                this.field200.method445(false, this.field536 + var4);
                this.field200.method445(false, var6 >> 14 & 32767);
                this.field200.method444(this.field535 + var3, true);
            }
            if (var5 == 537) {
                this.field200.method409((byte) -81, 51);
                this.field200.method444(var4, true);
                this.field200.method445(false, var6);
                this.field200.method411(var3);
                this.field517 = 0;
                this.field518 = var4;
                this.field519 = var3;
                this.field520 = 2;
                if (class37.method393(var4).field1148 == this.field318) {
                    this.field520 = 1;
                }
                if (class37.method393(var4).field1148 == this.field323) {
                    this.field520 = 3;
                }
            }
            if (var5 == 996) {
                this.field200.method409((byte) -81, 224);
                this.field200.method443(26889, var6);
                this.field200.method443(26889, var3);
                this.field200.method411(var4);
                this.field517 = 0;
                this.field518 = var4;
                this.field519 = var3;
                this.field520 = 2;
                if (class37.method393(var4).field1148 == this.field318) {
                    this.field520 = 1;
                }
                if (class37.method393(var4).field1148 == this.field323) {
                    this.field520 = 3;
                }
            }
            if (var5 == 444) {
                class37 var7 = class37.method393(var4);
                this.field550 = 1;
                this.field551 = var4;
                this.field552 = var7.field1159;
                this.field458 = 0;
                this.field361 = true;
                String var8 = var7.field1107;
                if (var8.indexOf(" ") != -1) {
                    var8 = var8.substring(0, var8.indexOf(" "));
                }
                String var9 = var7.field1107;
                if (var9.indexOf(" ") != -1) {
                    var9 = var9.substring(var9.indexOf(" ") + 1);
                }
                this.field553 = var8 + " " + var7.field1164 + " " + var9;
                if (this.field552 == 16) {
                    this.field361 = true;
                    this.field394 = 3;
                    this.field410 = true;
                }
            } else {
                if (var5 == 208) {
                    class37 var10 = class37.method393(var4);
                    boolean var11 = true;
                    if (var10.field1172 > 0) {
                        var11 = this.method131(var10, false);
                    }
                    if (var11) {
                        this.field200.method409((byte) -81, 75);
                        this.field200.method411(var4);
                    }
                }
                if (var5 == 201 || var5 == 370 || var5 == 761 || var5 == 629) {
                    String var12 = this.field495[arg0];
                    int var13 = var12.indexOf("@whi@");
                    if (var13 != -1) {
                        long var14 = class68.method588(var12.substring(var13 + 5).trim());
                        if (var5 == 201) {
                            this.method172(var14, true);
                        }
                        if (var5 == 370) {
                            this.method128(var14, -212);
                        }
                        if (var5 == 761) {
                            this.method157(987, var14);
                        }
                        if (var5 == 629) {
                            this.method95(this.field288, var14);
                        }
                    }
                }
                if (var5 == 525) {
                    class69 var16 = this.field310[var6];
                    if (var16 != null) {
                        this.method151(false, 1, var16.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var16.field750[0], 0, 0, 566);
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        field490 += var6;
                        if (field490 >= 77) {
                            this.field200.method409((byte) -81, 42);
                            this.field200.method414(0);
                            field490 = 0;
                        }
                        this.field200.method409((byte) -81, 84);
                        this.field200.method444(var6, true);
                    }
                }
                if (var5 == 73) {
                    this.field200.method409((byte) -81, 95);
                    this.field200.method411(var3);
                    this.field200.method444(var6, true);
                    this.field200.method411(var4);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class37.method393(var4).field1148 == this.field318) {
                        this.field520 = 1;
                    }
                    if (class37.method393(var4).field1148 == this.field323) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 284 && !this.field425) {
                    this.field200.method409((byte) -81, 20);
                    this.field200.method411(var4);
                    this.field425 = true;
                }
                if (var5 == 1660) {
                    ++field274;
                    if (field274 >= 146) {
                        this.field200.method409((byte) -81, 96);
                        this.field200.method413(5011685);
                        field274 = 0;
                    }
                    this.method94(var4, var6, var3, 288);
                    this.field200.method409((byte) -81, 64);
                    this.field200.method445(false, this.field536 + var4);
                    this.field200.method444(this.field535 + var3, true);
                    this.field200.method444(var6 >> 14 & 32767, true);
                }
                if (var5 == 994) {
                    boolean var17 = this.method151(false, 0, var4, field206.field750[0], field206.field751[0], 0, 2, 0, var3, 0, 0, 566);
                    if (!var17) {
                        this.method151(false, 1, var4, field206.field750[0], field206.field751[0], 1, 2, 0, var3, 0, 0, 566);
                    }
                    this.field554 = super.field1210;
                    this.field555 = super.field1211;
                    this.field557 = 2;
                    this.field556 = 0;
                    this.field200.method409((byte) -81, 142);
                    this.field200.method444(this.field551, true);
                    this.field200.method445(false, var6);
                    this.field200.method444(this.field536 + var4, true);
                    this.field200.method411(this.field535 + var3);
                }
                if (var5 == 178) {
                    this.method200(field390, this.field559);
                    this.field559 = -1;
                    this.field380 = true;
                }
                if (var5 == 479) {
                    class69 var19 = this.field310[var6];
                    if (var19 != null) {
                        this.method151(false, 1, var19.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var19.field750[0], 0, 0, 566);
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        ++field161;
                        if (field161 >= 135) {
                            this.field200.method409((byte) -81, 220);
                            this.field200.method411(7858);
                            field161 = 0;
                        }
                        this.field200.method409((byte) -81, 8);
                        this.field200.method443(26889, var6);
                    }
                }
                if (var5 == 1317) {
                    class17 var20 = this.field433[var6];
                    if (var20 != null) {
                        class58 var21 = var20.field796;
                        if (var21.field1522 != null) {
                            var21 = var21.method526((byte) 3);
                        }
                        if (var21 != null) {
                            String var22;
                            if (var21.field1514 != null) {
                                var22 = new String(var21.field1514);
                            } else {
                                var22 = "It's a " + var21.field1490 + ".";
                            }
                            this.method65((byte) 8, 0, "", var22);
                        }
                    }
                }
                if (var5 == 821) {
                    boolean var23 = this.method151(false, 0, var4, field206.field750[0], field206.field751[0], 0, 2, 0, var3, 0, 0, 566);
                    if (!var23) {
                        this.method151(false, 1, var4, field206.field750[0], field206.field751[0], 1, 2, 0, var3, 0, 0, 566);
                    }
                    this.field554 = super.field1210;
                    this.field555 = super.field1211;
                    this.field557 = 2;
                    this.field556 = 0;
                    this.field200.method409((byte) -81, 174);
                    this.field200.method444(this.field535 + var3, true);
                    this.field200.method443(26889, this.field536 + var4);
                    this.field200.method411(var6);
                }
                if (var5 == 664) {
                    this.field200.method409((byte) -81, 107);
                    this.field200.method443(26889, var6);
                    this.field200.method444(var4, true);
                    this.field200.method445(false, var3);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class37.method393(var4).field1148 == this.field318) {
                        this.field520 = 1;
                    }
                    if (class37.method393(var4).field1148 == this.field323) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 668 && this.method94(var4, var6, var3, 288)) {
                    this.field200.method409((byte) -81, 198);
                    this.field200.method444(var6 >> 14 & 32767, true);
                    this.field200.method445(false, this.field535 + var3);
                    this.field200.method411(this.field536 + var4);
                    this.field200.method411(this.field551);
                }
                if (var5 == 206) {
                    this.field200.method409((byte) -81, 141);
                    this.field200.method443(26889, var6);
                    this.field200.method445(false, var4);
                    this.field200.method444(var3, true);
                    this.field200.method411(this.field551);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class37.method393(var4).field1148 == this.field318) {
                        this.field520 = 1;
                    }
                    if (class37.method393(var4).field1148 == this.field323) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 839) {
                    if ((var6 & 3) == 0) {
                        ++field239;
                    }
                    if (field239 >= 71) {
                        this.field200.method409((byte) -81, 57);
                        this.field200.method414(0);
                        field239 = 0;
                    }
                    this.field200.method409((byte) -81, 165);
                    this.field200.method411(var6);
                    this.field200.method444(var3, true);
                    this.field200.method411(var4);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class37.method393(var4).field1148 == this.field318) {
                        this.field520 = 1;
                    }
                    if (class37.method393(var4).field1148 == this.field323) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 31) {
                    String var25 = this.field495[arg0];
                    int var26 = var25.indexOf("@whi@");
                    if (var26 != -1) {
                        if (this.field318 == -1) {
                            this.method206((byte) 72);
                            this.field66 = var25.substring(var26 + 5).trim();
                            this.field489 = false;
                            this.field403 = this.field318 = class37.field1131;
                        } else {
                            this.method65((byte) 8, 0, "", "Please close the interface you have open before using 'report abuse'");
                        }
                    }
                }
                if (var5 == 572) {
                    class69 var27 = this.field310[var6];
                    if (var27 != null) {
                        this.method151(false, 1, var27.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var27.field750[0], 0, 0, 566);
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        this.field200.method409((byte) -81, 130);
                        this.field200.method411(var6);
                    }
                }
                if (var5 == 567) {
                    boolean var28 = this.method151(false, 0, var4, field206.field750[0], field206.field751[0], 0, 2, 0, var3, 0, 0, 566);
                    if (!var28) {
                        this.method151(false, 1, var4, field206.field750[0], field206.field751[0], 1, 2, 0, var3, 0, 0, 566);
                    }
                    this.field554 = super.field1210;
                    this.field555 = super.field1211;
                    this.field557 = 2;
                    this.field556 = 0;
                    this.field200.method409((byte) -81, 34);
                    this.field200.method411(this.field461);
                    this.field200.method443(26889, var6);
                    this.field200.method444(this.field535 + var3, true);
                    this.field200.method445(false, this.field536 + var4);
                    this.field200.method445(false, this.field460);
                    this.field200.method443(26889, this.field459);
                }
                if (var5 == 358) {
                    ++field116;
                    if (field116 >= 73) {
                        this.field200.method409((byte) -81, 27);
                        this.field200.method414(0);
                        field116 = 0;
                    }
                    this.field200.method409((byte) -81, 118);
                    this.field200.method443(26889, var6);
                    this.field200.method445(false, var3);
                    this.field200.method445(false, var4);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class37.method393(var4).field1148 == this.field318) {
                        this.field520 = 1;
                    }
                    if (class37.method393(var4).field1148 == this.field323) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 88 || var5 == 892) {
                    String var30 = this.field495[arg0];
                    int var31 = var30.indexOf("@whi@");
                    if (var31 != -1) {
                        String var32 = var30.substring(var31 + 5).trim();
                        String var33 = class68.method592((byte) 20, class68.method589(class68.method588(var32), -115));
                        boolean var34 = false;
                        for (int var35 = 0; var35 < this.field311; ++var35) {
                            class69 var36 = this.field310[this.field312[var35]];
                            if (var36 != null && var36.field1708 != null && var36.field1708.equalsIgnoreCase(var33)) {
                                this.method151(false, 1, var36.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var36.field750[0], 0, 0, 566);
                                if (var5 == 88) {
                                    field490 += var6;
                                    if (field490 >= 77) {
                                        this.field200.method409((byte) -81, 42);
                                        this.field200.method414(0);
                                        field490 = 0;
                                    }
                                    this.field200.method409((byte) -81, 84);
                                    this.field200.method444(this.field312[var35], true);
                                }
                                if (var5 == 892) {
                                    this.field200.method409((byte) -81, 161);
                                    this.field200.method445(false, this.field312[var35]);
                                }
                                var34 = true;
                                break;
                            }
                        }
                        if (!var34) {
                            this.method65((byte) 8, 0, "", "Unable to find " + var33);
                        }
                    }
                }
                if (var5 == 71) {
                    class17 var37 = this.field433[var6];
                    if (var37 != null) {
                        this.method151(false, 1, var37.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var37.field750[0], 0, 0, 566);
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        this.field200.method409((byte) -81, 48);
                        this.field200.method444(var6, true);
                    }
                }
                if (var5 == 635) {
                    boolean var38 = this.method151(false, 0, var4, field206.field750[0], field206.field751[0], 0, 2, 0, var3, 0, 0, 566);
                    if (!var38) {
                        this.method151(false, 1, var4, field206.field750[0], field206.field751[0], 1, 2, 0, var3, 0, 0, 566);
                    }
                    this.field554 = super.field1210;
                    this.field555 = super.field1211;
                    this.field557 = 2;
                    this.field556 = 0;
                    this.field200.method409((byte) -81, 86);
                    this.field200.method445(false, this.field535 + var3);
                    this.field200.method445(false, var6);
                    this.field200.method443(26889, this.field536 + var4);
                }
                if (var5 == 8) {
                    class69 var40 = this.field310[var6];
                    if (var40 != null) {
                        this.method151(false, 1, var40.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var40.field750[0], 0, 0, 566);
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        this.field200.method409((byte) -81, 219);
                        this.field200.method443(26889, this.field551);
                        this.field200.method443(26889, var6);
                    }
                }
                if (var5 == 709) {
                    if (!this.field154) {
                        this.field245.method350((byte) 5, super.field1211 - 4, super.field1210 - 4);
                    } else {
                        this.field245.method350((byte) 5, var4 - 4, var3 - 4);
                    }
                }
                if (var5 == 330) {
                    boolean var41 = this.method151(false, 0, var4, field206.field750[0], field206.field751[0], 0, 2, 0, var3, 0, 0, 566);
                    if (!var41) {
                        this.method151(false, 1, var4, field206.field750[0], field206.field751[0], 1, 2, 0, var3, 0, 0, 566);
                    }
                    this.field554 = super.field1210;
                    this.field555 = super.field1211;
                    this.field557 = 2;
                    this.field556 = 0;
                    field226 += this.field536;
                    if (field226 >= 52) {
                        this.field200.method409((byte) -81, 179);
                        field226 = 0;
                    }
                    this.field200.method409((byte) -81, 190);
                    this.field200.method445(false, var6);
                    this.field200.method444(this.field535 + var3, true);
                    this.field200.method444(this.field536 + var4, true);
                }
                if (var5 == 642 && this.method94(var4, var6, var3, 288)) {
                    this.field200.method409((byte) -81, 114);
                    this.field200.method443(26889, this.field461);
                    this.field200.method443(26889, this.field536 + var4);
                    this.field200.method444(this.field535 + var3, true);
                    this.field200.method411(this.field460);
                    this.field200.method445(false, this.field459);
                    this.field200.method443(26889, var6 >> 14 & 32767);
                }
                if (var5 == 777) {
                    class17 var43 = this.field433[var6];
                    if (var43 != null) {
                        this.method151(false, 1, var43.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var43.field750[0], 0, 0, 566);
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        ++field246;
                        if (field246 >= 120) {
                            this.field200.method409((byte) -81, 97);
                            this.field200.method413(1835137);
                            field246 = 0;
                        }
                        this.field200.method409((byte) -81, 92);
                        this.field200.method444(var6, true);
                    }
                }
                if (var5 == 885) {
                    if ((var6 & 3) == 0) {
                        ++field363;
                    }
                    if (field363 >= 98) {
                        this.field200.method409((byte) -81, 170);
                        this.field200.method414(0);
                        field363 = 0;
                    }
                    this.method94(var4, var6, var3, 288);
                    this.field200.method409((byte) -81, 37);
                    this.field200.method443(26889, this.field536 + var4);
                    this.field200.method443(26889, this.field535 + var3);
                    this.field200.method411(var6 >> 14 & 32767);
                }
                if (var5 == 133) {
                    class17 var44 = this.field433[var6];
                    if (var44 != null) {
                        this.method151(false, 1, var44.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var44.field750[0], 0, 0, 566);
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        if ((var6 & 3) == 0) {
                            ++field91;
                        }
                        if (field91 >= 146) {
                            this.field200.method409((byte) -81, 164);
                            this.field200.method410(201);
                            field91 = 0;
                        }
                        this.field200.method409((byte) -81, 218);
                        this.field200.method445(false, var6);
                    }
                }
                if (var5 == 1516) {
                    class22 var45 = class22.method290(var6);
                    class37 var46 = class37.method393(var4);
                    String var47;
                    if (var46 != null && var46.field1163[var3] >= 100000) {
                        var47 = var46.field1163[var3] + " x " + var45.field851;
                    } else if (var45.field890 != null) {
                        var47 = new String(var45.field890);
                    } else {
                        var47 = "It's a " + var45.field851 + ".";
                    }
                    this.method65((byte) 8, 0, "", var47);
                }
                if (var5 == 993) {
                    this.method94(var4, var6, var3, 288);
                    this.field200.method409((byte) -81, 126);
                    this.field200.method445(false, this.field535 + var3);
                    this.field200.method443(26889, var6 >> 14 & 32767);
                    this.field200.method411(this.field536 + var4);
                }
                if (var5 == 105) {
                    this.field200.method409((byte) -81, 75);
                    this.field200.method411(var4);
                    class37 var48 = class37.method393(var4);
                    if (var48.field1104 != null && var48.field1104[0][0] == 5) {
                        int var49 = var48.field1104[0][1];
                        if (this.field373[var49] != var48.field1100[0]) {
                            this.field373[var49] = var48.field1100[0];
                            this.method208(6, var49);
                            this.field361 = true;
                        }
                    }
                }
                if (var5 == 906) {
                    this.field200.method409((byte) -81, 40);
                    this.field200.method445(false, var4);
                    this.field200.method444(var3, true);
                    this.field200.method445(false, var6);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class37.method393(var4).field1148 == this.field318) {
                        this.field520 = 1;
                    }
                    if (class37.method393(var4).field1148 == this.field323) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 946) {
                    class17 var50 = this.field433[var6];
                    if (var50 != null) {
                        this.method151(false, 1, var50.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var50.field750[0], 0, 0, 566);
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        this.field200.method409((byte) -81, 243);
                        this.field200.method445(false, var6);
                    }
                }
                if (var5 == 1474) {
                    int var51 = var6 >> 14 & 32767;
                    class7 var52 = class7.method219(var51);
                    String var53;
                    if (var52.field582 != null) {
                        var53 = new String(var52.field582);
                    } else {
                        var53 = "It's a " + var52.field574 + ".";
                    }
                    this.method65((byte) 8, 0, "", var53);
                }
                if (var5 == 127) {
                    this.field200.method409((byte) -81, 204);
                    this.field200.method444(var3, true);
                    this.field200.method444(var6, true);
                    this.field200.method444(var4, true);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class37.method393(var4).field1148 == this.field318) {
                        this.field520 = 1;
                    }
                    if (class37.method393(var4).field1148 == this.field323) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 368) {
                    this.method206((byte) 72);
                }
                if (var5 == 646) {
                    class69 var54 = this.field310[var6];
                    if (var54 != null) {
                        this.method151(false, 1, var54.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var54.field750[0], 0, 0, 566);
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        this.field200.method409((byte) -81, 161);
                        this.field200.method445(false, var6);
                    }
                }
                if (var5 == 407) {
                    this.field200.method409((byte) -81, 75);
                    this.field200.method411(var4);
                    class37 var55 = class37.method393(var4);
                    if (var55.field1104 != null && var55.field1104[0][0] == 5) {
                        int var56 = var55.field1104[0][1];
                        this.field373[var56] = 1 - this.field373[var56];
                        this.method208(6, var56);
                        this.field361 = true;
                    }
                }
                if (var5 == 492) {
                    this.method94(var4, var6, var3, 288);
                    this.field200.method409((byte) -81, 167);
                    this.field200.method411(var6 >> 14 & 32767);
                    this.field200.method445(false, this.field535 + var3);
                    this.field200.method411(this.field536 + var4);
                }
                if (var5 == 277) {
                    this.field200.method409((byte) -81, 133);
                    this.field200.method444(var3, true);
                    this.field200.method443(26889, var6);
                    this.field200.method445(false, var4);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class37.method393(var4).field1148 == this.field318) {
                        this.field520 = 1;
                    }
                    if (class37.method393(var4).field1148 == this.field323) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 728) {
                    this.field458 = 1;
                    this.field459 = var3;
                    this.field460 = var4;
                    this.field461 = var6;
                    this.field462 = class22.method290(var6).field851;
                    this.field550 = 0;
                    this.field361 = true;
                } else {
                    if (var5 == 546) {
                        class17 var57 = this.field433[var6];
                        if (var57 != null) {
                            this.method151(false, 1, var57.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var57.field750[0], 0, 0, 566);
                            this.field554 = super.field1210;
                            this.field555 = super.field1211;
                            this.field557 = 2;
                            this.field556 = 0;
                            this.field200.method409((byte) -81, 248);
                            this.field200.method411(var6);
                        }
                    }
                    if (var5 == 835) {
                        this.field200.method409((byte) -81, 235);
                        this.field200.method445(false, var6);
                        this.field200.method444(var3, true);
                        this.field200.method411(this.field460);
                        this.field200.method411(var4);
                        this.field200.method443(26889, this.field461);
                        this.field200.method444(this.field459, true);
                        this.field517 = 0;
                        this.field518 = var4;
                        this.field519 = var3;
                        this.field520 = 2;
                        if (class37.method393(var4).field1148 == this.field318) {
                            this.field520 = 1;
                        }
                        if (class37.method393(var4).field1148 == this.field323) {
                            this.field520 = 3;
                        }
                    }
                    if (var5 == 641) {
                        boolean var58 = this.method151(false, 0, var4, field206.field750[0], field206.field751[0], 0, 2, 0, var3, 0, 0, 566);
                        if (!var58) {
                            this.method151(false, 1, var4, field206.field750[0], field206.field751[0], 1, 2, 0, var3, 0, 0, 566);
                        }
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        this.field200.method409((byte) -81, 225);
                        this.field200.method411(var6);
                        this.field200.method445(false, this.field535 + var3);
                        this.field200.method443(26889, this.field536 + var4);
                    }
                    if (var5 == 22) {
                        class17 var60 = this.field433[var6];
                        if (var60 != null) {
                            this.method151(false, 1, var60.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var60.field750[0], 0, 0, 566);
                            this.field554 = super.field1210;
                            this.field555 = super.field1211;
                            this.field557 = 2;
                            this.field556 = 0;
                            this.field200.method409((byte) -81, 128);
                            this.field200.method444(this.field461, true);
                            this.field200.method411(this.field460);
                            this.field200.method444(this.field459, true);
                            this.field200.method445(false, var6);
                        }
                    }
                    if (var5 == 1907) {
                        class22 var61 = class22.method290(var6);
                        String var62;
                        if (var61.field890 != null) {
                            var62 = new String(var61.field890);
                        } else {
                            var62 = "It's a " + var61.field851 + ".";
                        }
                        this.method65((byte) 8, 0, "", var62);
                    }
                    if (var5 == 992) {
                        boolean var63 = this.method151(false, 0, var4, field206.field750[0], field206.field751[0], 0, 2, 0, var3, 0, 0, 566);
                        if (!var63) {
                            this.method151(false, 1, var4, field206.field750[0], field206.field751[0], 1, 2, 0, var3, 0, 0, 566);
                        }
                        this.field554 = super.field1210;
                        this.field555 = super.field1211;
                        this.field557 = 2;
                        this.field556 = 0;
                        this.field200.method409((byte) -81, 31);
                        this.field200.method443(26889, this.field535 + var3);
                        this.field200.method411(var6);
                        this.field200.method411(this.field536 + var4);
                    }
                    if (var5 == 749) {
                        class69 var65 = this.field310[var6];
                        if (var65 != null) {
                            this.method151(false, 1, var65.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var65.field750[0], 0, 0, 566);
                            this.field554 = super.field1210;
                            this.field555 = super.field1211;
                            this.field557 = 2;
                            this.field556 = 0;
                            this.field200.method409((byte) -81, 180);
                            this.field200.method443(26889, var6);
                        }
                    }
                    if (var5 == 246) {
                        String var66 = this.field495[arg0];
                        int var67 = var66.indexOf("@whi@");
                        if (var67 != -1) {
                            long var68 = class68.method588(var66.substring(var67 + 5).trim());
                            int var70 = -1;
                            for (int var71 = 0; var71 < this.field327; ++var71) {
                                if (this.field193[var71] == var68) {
                                    var70 = var71;
                                    break;
                                }
                            }
                            if (var70 != -1 && this.field296[var70] > 0) {
                                this.field380 = true;
                                this.field397 = 0;
                                this.field286 = true;
                                this.field379 = "";
                                this.field94 = 3;
                                this.field210 = this.field193[var70];
                                this.field362 = "Enter message to send to " + this.field393[var70];
                            }
                        }
                    }
                    if (var5 == 972) {
                        class17 var72 = this.field433[var6];
                        if (var72 != null) {
                            this.method151(false, 1, var72.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var72.field750[0], 0, 0, 566);
                            this.field554 = super.field1210;
                            this.field555 = super.field1211;
                            this.field557 = 2;
                            this.field556 = 0;
                            this.field200.method409((byte) -81, 193);
                            this.field200.method445(false, var6);
                            this.field200.method445(false, this.field551);
                        }
                    }
                    if (var5 == 326) {
                        class69 var73 = this.field310[var6];
                        if (var73 != null) {
                            this.method151(false, 1, var73.field751[0], field206.field750[0], field206.field751[0], 1, 2, 0, var73.field750[0], 0, 0, 566);
                            this.field554 = super.field1210;
                            this.field555 = super.field1211;
                            this.field557 = 2;
                            this.field556 = 0;
                            this.field200.method409((byte) -81, 99);
                            this.field200.method444(this.field460, true);
                            this.field200.method443(26889, this.field461);
                            this.field200.method444(this.field459, true);
                            this.field200.method445(false, var6);
                        }
                    }
                    this.field458 = 0;
                    this.field392 &= arg1;
                    this.field550 = 0;
                    this.field361 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        this.field392 &= arg0;
        this.field457 = 0;
        int var2 = (field206.field719 >> 7) + this.field535;
        int var3 = (field206.field720 >> 7) + this.field536;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field457 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field457 = 1;
        }
        if (this.field457 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field457 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILEGCNSKZO;I)V")
    public final void method177(int arg0, class12 arg1, int arg2) {
        if (arg0 != -3853) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method178(28544, arg1.field719, arg2, arg1.field720);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method178(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg3 >= 128 && arg1 <= 13056 && arg3 <= 13056) {
            int var5 = this.method91(this.field179, arg1, false, arg3) - arg2;
            int var6 = arg1 - this.field269;
            int var7 = var5 - this.field270;
            int var8 = arg3 - this.field271;
            if (arg0 != 28544) {
                for (int var9 = 1; var9 > 0; ++var9) {
                }
            }
            int var10 = class43.field1341[this.field272];
            int var11 = class43.field1342[this.field272];
            int var12 = class43.field1341[this.field273];
            int var13 = class43.field1342[this.field273];
            int var14 = var6 * var13 + var8 * var12 >> 16;
            int var15 = var8 * var13 - var6 * var12 >> 16;
            int var17 = var7 * var11 - var10 * var15 >> 16;
            int var18 = var7 * var10 + var11 * var15 >> 16;
            if (var18 >= 50) {
                this.field143 = (var14 << 9) / var18 + class10.field674;
                this.field144 = (var17 << 9) / var18 + class10.field675;
            } else {
                this.field143 = -1;
                this.field144 = -1;
            }
        } else {
            this.field143 = -1;
            this.field144 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method179(boolean arg0) {
        if (arg0) {
            for (class26 var2 = (class26) this.field140.method269(); var2 != null; var2 = (class26) this.field140.method271(15175)) {
                if (this.field179 == var2.field926 && !var2.field932) {
                    if (field525 >= var2.field931) {
                        var2.method307(2, this.field508);
                        if (var2.field932) {
                            var2.method221();
                        } else {
                            this.field245.method323(var2, var2.field929, 1000, 60, var2.field926, false, var2.field928, -1, var2.field927, 0);
                        }
                    }
                } else {
                    var2.method221();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;III)LQDHHNYHL;")
    public final class44 method180(byte arg0, String arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            byte[] var7 = null;
            int var8 = 5;
            try {
                if (this.field446[0] != null) {
                    var7 = this.field446[0].method491(arg4, this.field372);
                }
            } catch (Exception var30) {
            }
            if (var7 != null) {
                this.field396.reset();
                this.field396.update(var7);
                int var9 = (int) this.field396.getValue();
                if (arg3 != var9) {
                    var7 = null;
                }
            }
            if (var7 != null) {
                return new class44(var7, 0);
            } else {
                int var11 = 0;
                while (var7 == null) {
                    String var12 = "Unknown error";
                    this.method188(53, "Requesting " + arg2, arg5);
                    Object var13 = null;
                    try {
                        int var14 = 0;
                        DataInputStream var15 = this.method171(arg1 + arg3);
                        byte[] var16 = new byte[6];
                        var15.readFully(var16, 0, 6);
                        class42 var17 = new class42(5, var16);
                        var17.field1250 = 3;
                        int var18 = var17.method424() + 6;
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
                                this.method188(53, "Loading " + arg2 + " - " + var23 + "%", arg5);
                            }
                            var14 = var23;
                        }
                        var15.close();
                        try {
                            if (this.field446[0] != null) {
                                this.field446[0].method492(true, var7.length, var7, arg4);
                            }
                        } catch (Exception var29) {
                            this.field446[0] = null;
                        }
                        if (var7 != null) {
                            this.field396.reset();
                            this.field396.update(var7);
                            int var24 = (int) this.field396.getValue();
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
                                this.method188(53, "Game updated - please reload page", arg5);
                                var26 = 10;
                            } else {
                                this.method188(53, var12 + " - Retrying in " + var26, arg5);
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
                        this.field348 = !this.field348;
                    }
                }
                return new class44(var7, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIBII)V")
    private final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 == 2) {
            boolean var9 = false;
        } else {
            this.field454 = -426;
        }
        if (arg0 >= 1 && arg7 >= 1 && arg0 <= 102 && arg7 <= 102) {
            if (field128 && this.field179 != arg3) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg6 == 0) {
                var10 = this.field245.method338(arg3, arg0, arg7);
            }
            if (arg6 == 1) {
                var10 = this.field245.method339(arg7, arg0, arg3, false);
            }
            if (arg6 == 2) {
                var10 = this.field245.method340(arg3, arg0, arg7);
            }
            if (arg6 == 3) {
                var10 = this.field245.method341(arg3, arg0, arg7);
            }
            if (var10 != 0) {
                int var14 = this.field245.method342(arg3, arg0, arg7, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg6 == 0) {
                    this.field245.method329(arg7, -212, arg3, arg0);
                    class7 var18 = class7.method219(var15);
                    if (var18.field564) {
                        this.field300[arg3].method44(true, var16, arg0, arg7, var17, var18.field572);
                    }
                }
                if (arg6 == 1) {
                    this.field245.method330(arg7, arg3, arg0, false);
                }
                if (arg6 == 2) {
                    this.field245.method331(arg3, arg0, 5, arg7);
                    class7 var19 = class7.method219(var15);
                    if (var19.field605 + arg0 > 103 || var19.field605 + arg7 > 103 || var19.field611 + arg0 > 103 || var19.field611 + arg7 > 103) {
                        return;
                    }
                    if (var19.field564) {
                        this.field300[arg3].method45(var19.field572, arg7, var19.field605, var17, arg0, var19.field611, 563);
                    }
                }
                if (arg6 == 3) {
                    this.field245.method332(arg0, arg3, -225, arg7);
                    class7 var20 = class7.method219(var15);
                    if (var20.field564 && var20.field599) {
                        this.field300[arg3].method47(arg0, 818, arg7);
                    }
                }
            }
            if (arg2 >= 0) {
                int var21 = arg3;
                if (arg3 < 3 && (this.field533[1][arg0][arg7] & 2) == 2) {
                    var21 = arg3 + 1;
                }
                class63.method555(this.field491, var21, arg0, arg1, arg4, arg2, this.field300[arg3], arg3, arg7, this.field245, -441);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IB)Ljava/lang/String;")
    private static final String method182(int arg0, byte arg1) {
        if (arg1 != 31) {
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

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method183(int arg0) {
        int var2 = 55 / arg0;
        if (this.field498 == 0) {
            int var3 = super.field1209;
            if (this.field550 == 1 && super.field1210 >= 516 && super.field1211 >= 160 && super.field1210 <= 765 && super.field1211 <= 205) {
                var3 = 0;
            }
            if (this.field154) {
                if (var3 != 1) {
                    int var4 = super.field1203;
                    int var5 = super.field1204;
                    if (this.field184 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field184 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field184 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field185 - 10 || var4 > this.field187 + this.field185 + 10 || var5 < this.field186 - 10 || var5 > this.field188 + this.field186 + 10) {
                        this.field154 = false;
                        if (this.field184 == 1) {
                            this.field361 = true;
                        }
                        if (this.field184 == 2) {
                            this.field380 = true;
                        }
                    }
                }
                if (var3 == 1) {
                    int var6 = this.field185;
                    int var7 = this.field186;
                    int var8 = this.field187;
                    int var9 = super.field1210;
                    int var10 = super.field1211;
                    if (this.field184 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field184 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field184 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field383; ++var12) {
                        int var13 = (this.field383 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method175(var11, true);
                    }
                    this.field154 = false;
                    if (this.field184 == 1) {
                        this.field361 = true;
                    }
                    if (this.field184 == 2) {
                        this.field380 = true;
                        return;
                    }
                }
            } else {
                if (var3 == 1 && this.field383 > 0) {
                    int var14 = this.field423[this.field383 - 1];
                    if (var14 == 277 || var14 == 73 || var14 == 664 || var14 == 127 || var14 == 906 || var14 == 358 || var14 == 177 || var14 == 839 || var14 == 537 || var14 == 996 || var14 == 728 || var14 == 1516) {
                        int var15 = this.field421[this.field383 - 1];
                        int var16 = this.field422[this.field383 - 1];
                        class37 var17 = class37.method393(var16);
                        if (var17.field1136 || var17.field1103) {
                            this.field93 = false;
                            this.field237 = 0;
                            this.field496 = var16;
                            this.field497 = var15;
                            this.field498 = 2;
                            this.field499 = super.field1210;
                            this.field500 = super.field1211;
                            if (class37.method393(var16).field1148 == this.field318) {
                                this.field498 = 1;
                            }
                            if (class37.method393(var16).field1148 == this.field323) {
                                this.field498 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var3 == 1 && (this.field524 == 1 || this.method92(this.field383 - 1, (byte) 8)) && this.field383 > 2) {
                    var3 = 2;
                }
                if (var3 == 1 && this.field383 > 0) {
                    this.method175(this.field383 - 1, true);
                }
                if (var3 != 2 || this.field383 <= 0) {
                    return;
                }
                this.method143(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method184(int arg0) {
        this.field97 += arg0;
        if (!this.field513 && !this.field317 && !this.field388) {
            ++field525;
            if (!this.field392) {
                this.method76(-772);
            } else {
                this.method154(-34183);
            }
            this.method166(0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method185(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field115 = -18;
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

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method186(int arg0) {
        this.field353.method377(this.field201);
        if (arg0 != 7) {
            this.field295 = null;
        }
        class10.field680 = this.field545;
        this.field257.method371(0, 0, false);
        if (this.field395 != -1) {
            this.method170(0, class37.method393(this.field395), 0, 0, false);
        } else if (this.field430[this.field394] != -1) {
            this.method170(0, class37.method393(this.field430[this.field394]), 0, 0, false);
        }
        if (this.field154 && this.field184 == 1) {
            this.method160(0);
        }
        this.field353.method378(553, 0, 205, super.field1195);
        this.field355.method377(this.field201);
        class10.field680 = this.field546;
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method187(int arg0) {
        if (arg0 != 0) {
            this.field295 = null;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method407(false);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field318 != -1 && this.field403 == this.field318) {
                        if (var2 == 8 && this.field66.length() > 0) {
                            this.field66 = this.field66.substring(0, this.field66.length() - 1);
                        }
                        break;
                    }
                    if (this.field286) {
                        if (var2 >= 32 && var2 <= 122 && this.field379.length() < 80) {
                            this.field379 = this.field379 + (char) var2;
                            this.field380 = true;
                        }
                        if (var2 == 8 && this.field379.length() > 0) {
                            this.field379 = this.field379.substring(0, this.field379.length() - 1);
                            this.field380 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field286 = false;
                            this.field380 = true;
                            if (this.field94 == 1) {
                                long var3 = class68.method588(this.field379);
                                this.method172(var3, true);
                            }
                            if (this.field94 == 2 && this.field327 > 0) {
                                long var5 = class68.method588(this.field379);
                                this.method157(987, var5);
                            }
                            if (this.field94 == 3 && this.field379.length() > 0) {
                                this.field200.method409((byte) -81, 227);
                                this.field200.method410(0);
                                int var7 = this.field200.field1250;
                                this.field200.method416(30294, this.field210);
                                class27.method309(this.field200, this.field379, true);
                                this.field200.method419((byte) 5, this.field200.field1250 - var7);
                                this.field379 = class27.method310(this.field379, 753);
                                this.field379 = class1.method11(this.field379, 753);
                                this.method65((byte) 8, 6, class68.method592((byte) 20, class68.method589(this.field210, -115)), this.field379);
                                if (this.field350 == 2) {
                                    this.field350 = 1;
                                    this.field389 = true;
                                    this.field200.method409((byte) -81, 72);
                                    this.field200.method410(this.field366);
                                    this.field200.method410(this.field350);
                                    this.field200.method410(this.field407);
                                }
                            }
                            if (this.field94 == 4 && this.field65 < 100) {
                                long var8 = class68.method588(this.field379);
                                this.method128(var8, -212);
                            }
                            if (this.field94 == 5 && this.field65 > 0) {
                                long var10 = class68.method588(this.field379);
                                this.method95(this.field288, var10);
                            }
                        }
                    } else if (this.field397 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field339.length() < 10) {
                            this.field339 = this.field339 + (char) var2;
                            this.field380 = true;
                        }
                        if (var2 == 8 && this.field339.length() > 0) {
                            this.field339 = this.field339.substring(0, this.field339.length() - 1);
                            this.field380 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field339.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field339);
                                } catch (Exception var22) {
                                }
                                this.field200.method409((byte) -81, 24);
                                this.field200.method414(var12);
                            }
                            this.field397 = 0;
                            this.field380 = true;
                        }
                    } else if (this.field397 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field339.length() < 12) {
                            this.field339 = this.field339 + (char) var2;
                            this.field380 = true;
                        }
                        if (var2 == 8 && this.field339.length() > 0) {
                            this.field339 = this.field339.substring(0, this.field339.length() - 1);
                            this.field380 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field339.length() > 0) {
                                this.field200.method409((byte) -81, 13);
                                this.field200.method416(30294, class68.method588(this.field339));
                            }
                            this.field397 = 0;
                            this.field380 = true;
                        }
                    } else if (this.field397 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field339.length() < 40) {
                            this.field339 = this.field339 + (char) var2;
                            this.field380 = true;
                        }
                        if (var2 == 8 && this.field339.length() > 0) {
                            this.field339 = this.field339.substring(0, this.field339.length() - 1);
                            this.field380 = true;
                        }
                    } else if (this.field323 == -1 && this.field451 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field482.length() < 80) {
                            this.field482 = this.field482 + (char) var2;
                            this.field380 = true;
                        }
                        if (var2 == 8 && this.field482.length() > 0) {
                            this.field482 = this.field482.substring(0, this.field482.length() - 1);
                            this.field380 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field482.length() > 0) {
                            if (this.field330 == 2) {
                                if (this.field482.equals("::clientdrop")) {
                                    this.method101(false);
                                }
                                if (this.field482.equals("::lag")) {
                                    this.method173(false);
                                }
                                if (this.field482.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field124.method241(2, 0); ++var13) {
                                        this.field124.method224(-93, var13, 2, (byte) 1);
                                    }
                                }
                                if (this.field482.equals("::fpson")) {
                                    field528 = true;
                                }
                                if (this.field482.equals("::fpsoff")) {
                                    field528 = false;
                                }
                                if (this.field482.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field300[var14].field26[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field482.startsWith("::")) {
                                this.field200.method409((byte) -81, 191);
                                this.field200.method410(this.field482.length() - 1);
                                this.field200.method417(this.field482.substring(2));
                            } else {
                                String var17 = this.field482.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field482 = this.field482.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field482 = this.field482.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field482 = this.field482.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field482 = this.field482.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field482 = this.field482.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field482 = this.field482.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field482 = this.field482.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field482 = this.field482.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field482 = this.field482.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field482 = this.field482.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field482 = this.field482.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field482 = this.field482.substring(6);
                                }
                                String var19 = this.field482.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field482 = this.field482.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field482 = this.field482.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field482 = this.field482.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field482 = this.field482.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field482 = this.field482.substring(6);
                                }
                                this.field200.method409((byte) -81, 45);
                                this.field200.method410(0);
                                int var21 = this.field200.field1250;
                                this.field200.method410(var18);
                                this.field200.method437(var20, false);
                                this.field432.field1250 = 0;
                                class27.method309(this.field432, this.field482, true);
                                this.field200.method453(0, this.field432.field1249, -969, this.field432.field1250);
                                this.field200.method419((byte) 5, this.field200.field1250 - var21);
                                this.field482 = class27.method310(this.field482, 753);
                                this.field482 = class1.method11(this.field482, 753);
                                field206.field744 = this.field482;
                                field206.field709 = var18;
                                field206.field752 = var20;
                                field206.field726 = 150;
                                if (this.field330 == 2) {
                                    this.method65((byte) 8, 2, "@cr2@" + field206.field1708, field206.field744);
                                } else if (this.field330 == 1) {
                                    this.method65((byte) 8, 2, "@cr1@" + field206.field1708, field206.field744);
                                } else {
                                    this.method65((byte) 8, 2, field206.field1708, field206.field744);
                                }
                                if (this.field366 == 2) {
                                    this.field366 = 3;
                                    this.field389 = true;
                                    this.field200.method409((byte) -81, 72);
                                    this.field200.method410(this.field366);
                                    this.field200.method410(this.field350);
                                    this.field200.method410(this.field407);
                                }
                            }
                            this.field482 = "";
                            this.field380 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field66.length() < 12) {
                this.field66 = this.field66 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method188(int arg0, String arg1, int arg2) {
        this.field118 = arg2;
        this.field402 = arg1;
        this.method126(0);
        if (this.field103 == null) {
            super.method188(53, arg1, arg2);
        } else {
            this.field262.method377(this.field201);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field167.method534(var4 / 2, 648, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", 16777215);
            int var7 = var5 / 2 - 18 - var6;
            if (arg0 <= 0) {
                this.field98 = this.field337.method420();
            }
            class67.method582(304, 9179409, var4 / 2 - 152, 34, (byte) 12, var7);
            class67.method582(302, 0, var4 / 2 - 151, 32, (byte) 12, var7 + 1);
            class67.method581(var4 / 2 - 150, (byte) 109, 9179409, arg2 * 3, 30, var7 + 2);
            class67.method581(arg2 * 3 + (var4 / 2 - 150), (byte) 109, 0, 300 - arg2 * 3, 30, var7 + 2);
            this.field167.method534(var4 / 2, 648, var5 / 2 + 5 - var6, arg1, 16777215);
            this.field262.method378(202, 0, 171, super.field1195);
            if (this.field332) {
                this.field332 = false;
                if (!this.field531) {
                    this.field263.method378(0, 0, 0, super.field1195);
                    this.field264.method378(637, 0, 0, super.field1195);
                }
                this.field260.method378(128, 0, 0, super.field1195);
                this.field261.method378(202, 0, 371, super.field1195);
                this.field265.method378(0, 0, 265, super.field1195);
                this.field266.method378(562, 0, 265, super.field1195);
                this.field267.method378(128, 0, 171, super.field1195);
                this.field268.method378(562, 0, 171, super.field1195);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLPGNBHFUF;I)V")
    public final void method189(byte arg0, class42 arg1, int arg2) {
        if (this.field507 == arg0) {
            boolean var4 = false;
            if (arg2 == 39) {
                byte var5 = arg1.method441(true);
                int var6 = arg1.method438(false);
                int var7 = var6 >> 2;
                int var8 = var6 & 3;
                int var9 = this.field439[var7];
                byte var10 = arg1.method442(this.field293);
                byte var11 = arg1.method442(this.field293);
                byte var12 = arg1.method441(true);
                int var13 = arg1.method448(true);
                int var14 = arg1.method422();
                int var15 = arg1.method439(0);
                int var16 = (var15 >> 4 & 7) + this.field291;
                int var17 = (var15 & 7) + this.field292;
                int var18 = arg1.method448(true);
                int var19 = arg1.method448(true);
                class69 var20;
                if (this.field436 == var14) {
                    var20 = field206;
                } else {
                    var20 = this.field310[var14];
                }
                if (var20 != null) {
                    class7 var21 = class7.method219(var13);
                    int var22 = this.field491[this.field179][var16][var17];
                    int var23 = this.field491[this.field179][var16 + 1][var17];
                    int var24 = this.field491[this.field179][var16 + 1][var17 + 1];
                    int var25 = this.field491[this.field179][var16][var17 + 1];
                    class43 var26 = var21.method217(var7, var8, var22, var23, var24, var25, -1);
                    if (var26 != null) {
                        this.method116(0, var17, var16, var9, this.field179, var19 + 1, 0, 0, -1, var18 + 1);
                        var20.field1698 = field525 + var19;
                        var20.field1699 = field525 + var18;
                        var20.field1694 = var26;
                        int var27 = var21.field605;
                        int var28 = var21.field611;
                        if (var8 == 1 || var8 == 3) {
                            var27 = var21.field611;
                            var28 = var21.field605;
                        }
                        var20.field1691 = var16 * 128 + var27 * 64;
                        var20.field1693 = var17 * 128 + var28 * 64;
                        var20.field1692 = this.method91(this.field179, var20.field1691, false, var20.field1693);
                        if (var12 > var5) {
                            byte var29 = var12;
                            var12 = var5;
                            var5 = var29;
                        }
                        if (var10 > var11) {
                            byte var30 = var10;
                            var10 = var11;
                            var11 = var30;
                        }
                        var20.field1711 = var12 + var16;
                        var20.field1713 = var5 + var16;
                        var20.field1712 = var10 + var17;
                        var20.field1714 = var11 + var17;
                    }
                }
            }
            if (arg2 == 41) {
                int var31 = arg1.method420();
                int var32 = (var31 >> 4 & 7) + this.field291;
                int var33 = (var31 & 7) + this.field292;
                int var34 = arg1.method422();
                int var35 = arg1.method422();
                int var36 = arg1.method422();
                if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                    class15 var37 = this.field295[this.field179][var32][var33];
                    if (var37 != null) {
                        for (class4 var38 = (class4) var37.method269(); var38 != null; var38 = (class4) var37.method271(15175)) {
                            if ((var34 & 32767) == var38.field35 && var38.field33 == var35) {
                                var38.field33 = var36;
                                break;
                            }
                        }
                        this.method71(var32, var33);
                    }
                }
            } else if (arg2 == 90) {
                int var39 = arg1.method440(8);
                int var40 = (var39 >> 4 & 7) + this.field291;
                int var41 = (var39 & 7) + this.field292;
                int var42 = arg1.method439(0);
                int var43 = var42 >> 2;
                int var44 = var42 & 3;
                int var45 = this.field439[var43];
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                    this.method116(var44, var41, var40, var45, this.field179, 0, var43, 0, -1, -1);
                }
            } else if (arg2 != 20) {
                if (arg2 == 114) {
                    int var52 = arg1.method420();
                    int var53 = (var52 >> 4 & 7) + this.field291;
                    int var54 = (var52 & 7) + this.field292;
                    int var55 = arg1.method422();
                    int var56 = arg1.method420();
                    int var57 = arg1.method422();
                    if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                        int var58 = var53 * 128 + 64;
                        int var59 = var54 * 128 + 64;
                        class26 var60 = new class26(var55, var57, var58, (byte) -9, this.method91(this.field179, var58, false, var59) - var56, this.field179, var59, field525);
                        this.field140.method266(var60);
                    }
                } else {
                    if (arg2 == 216) {
                        int var61 = arg1.method420();
                        int var62 = (var61 >> 4 & 7) + this.field291;
                        int var63 = (var61 & 7) + this.field292;
                        int var64 = arg1.method422();
                        int var65 = arg1.method420();
                        int var66 = var65 >> 4 & 15;
                        int var67 = var65 & 7;
                        if (field206.field750[0] >= var62 - var66 && field206.field750[0] <= var62 + var66 && field206.field751[0] >= var63 - var66 && field206.field751[0] <= var63 + var66 && this.field479 && !field128 && this.field275 < 50) {
                            this.field473[this.field275] = var64;
                            this.field486[this.field275] = var67;
                            this.field148[this.field275] = class50.field1421[var64];
                            ++this.field275;
                        }
                    }
                    if (arg2 == 51) {
                        int var68 = arg1.method447((byte) -35);
                        int var69 = arg1.method448(true);
                        int var70 = arg1.method438(false);
                        int var71 = (var70 >> 4 & 7) + this.field291;
                        int var72 = (var70 & 7) + this.field292;
                        if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                            class4 var73 = new class4();
                            var73.field35 = var68;
                            var73.field33 = var69;
                            if (this.field295[this.field179][var71][var72] == null) {
                                this.field295[this.field179][var71][var72] = new class15(145);
                            }
                            this.field295[this.field179][var71][var72].method266(var73);
                            this.method71(var71, var72);
                        }
                    } else if (arg2 == 125) {
                        int var74 = arg1.method448(true);
                        int var75 = arg1.method438(false);
                        int var76 = (var75 >> 4 & 7) + this.field291;
                        int var77 = (var75 & 7) + this.field292;
                        int var78 = arg1.method447((byte) -35);
                        int var79 = arg1.method422();
                        if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && this.field436 != var79) {
                            class4 var80 = new class4();
                            var80.field35 = var78;
                            var80.field33 = var74;
                            if (this.field295[this.field179][var76][var77] == null) {
                                this.field295[this.field179][var76][var77] = new class15(145);
                            }
                            this.field295[this.field179][var76][var77].method266(var80);
                            this.method71(var76, var77);
                        }
                    } else if (arg2 == 127) {
                        int var81 = arg1.method438(false);
                        int var82 = (var81 >> 4 & 7) + this.field291;
                        int var83 = (var81 & 7) + this.field292;
                        int var84 = arg1.method447((byte) -35);
                        int var85 = arg1.method420();
                        int var86 = var85 >> 2;
                        int var87 = var85 & 3;
                        int var88 = this.field439[var86];
                        if (var82 >= 0 && var83 >= 0 && var82 < 103 && var83 < 103) {
                            int var89 = this.field491[this.field179][var82][var83];
                            int var90 = this.field491[this.field179][var82 + 1][var83];
                            int var91 = this.field491[this.field179][var82 + 1][var83 + 1];
                            int var92 = this.field491[this.field179][var82][var83 + 1];
                            if (var88 == 0) {
                                class13 var93 = this.field245.method334(var82, var83, (byte) 4, this.field179);
                                if (var93 != null) {
                                    int var94 = var93.field760 >> 14 & 32767;
                                    if (var86 == 2) {
                                        var93.field758 = new class66(var84, 2, true, var91, var87 + 4, var89, var94, false, var90, var92);
                                        var93.field759 = new class66(var84, 2, true, var91, var87 + 1 & 3, var89, var94, false, var90, var92);
                                    } else {
                                        var93.field758 = new class66(var84, var86, true, var91, var87, var89, var94, false, var90, var92);
                                    }
                                }
                            }
                            if (var88 == 1) {
                                class32 var95 = this.field245.method335(var82, this.field179, 0, var83);
                                if (var95 != null) {
                                    var95.field1077 = new class66(var84, 4, true, var91, 0, var89, var95.field1078 >> 14 & 32767, false, var90, var92);
                                }
                            }
                            if (var88 == 2) {
                                class19 var96 = this.field245.method336(var82, var83, this.field179, true);
                                if (var86 == 11) {
                                    var86 = 10;
                                }
                                if (var96 != null) {
                                    var96.field811 = new class66(var84, var86, true, var91, var87, var89, var96.field819 >> 14 & 32767, false, var90, var92);
                                }
                            }
                            if (var88 == 3) {
                                class33 var97 = this.field245.method337(this.field179, true, var83, var82);
                                if (var97 != null) {
                                    var97.field1083 = new class66(var84, 22, true, var91, var87, var89, var97.field1084 >> 14 & 32767, false, var90, var92);
                                }
                            }
                        }
                    } else if (arg2 == 74) {
                        int var98 = arg1.method448(true);
                        int var99 = arg1.method438(false);
                        int var100 = (var99 >> 4 & 7) + this.field291;
                        int var101 = (var99 & 7) + this.field292;
                        int var102 = arg1.method439(0);
                        int var103 = var102 >> 2;
                        int var104 = var102 & 3;
                        int var105 = this.field439[var103];
                        if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                            this.method116(var104, var101, var100, var105, this.field179, 0, var103, 0, var98, -1);
                        }
                    } else if (arg2 == 133) {
                        int var106 = arg1.method420();
                        int var107 = (var106 >> 4 & 7) + this.field291;
                        int var108 = (var106 & 7) + this.field292;
                        int var109 = var107 + arg1.method421();
                        int var110 = var108 + arg1.method421();
                        int var111 = arg1.method423();
                        int var112 = arg1.method422();
                        int var113 = arg1.method420() * 4;
                        int var114 = arg1.method420() * 4;
                        int var115 = arg1.method422();
                        int var116 = arg1.method422();
                        int var117 = arg1.method420();
                        int var118 = arg1.method420();
                        if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104 && var112 != 65535) {
                            int var119 = var107 * 128 + 64;
                            int var120 = var108 * 128 + 64;
                            int var121 = var109 * 128 + 64;
                            int var122 = var110 * 128 + 64;
                            class46 var123 = new class46(this.method91(this.field179, var119, false, var120) - var113, field525 + var116, field525 + var115, this.field179, (byte) -115, var112, var119, var117, var118, var120, var114, var111);
                            var123.method490(field525 + var115, var122, (byte) -41, this.method91(this.field179, var121, false, var122) - var114, var121);
                            this.field450.method266(var123);
                        }
                    }
                }
            } else {
                int var46 = arg1.method447((byte) -35);
                int var47 = arg1.method440(8);
                int var48 = (var47 >> 4 & 7) + this.field291;
                int var49 = (var47 & 7) + this.field292;
                if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                    class15 var50 = this.field295[this.field179][var48][var49];
                    if (var50 != null) {
                        for (class4 var51 = (class4) var50.method269(); var51 != null; var51 = (class4) var50.method271(15175)) {
                            if ((var46 & 32767) == var51.field35) {
                                var51.method221();
                                break;
                            }
                        }
                        if (var50.method269() == null) {
                            this.field295[this.field179][var48][var49] = null;
                        }
                        this.method71(var48, var49);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method190(byte arg0, int arg1) {
        if (arg0 != 5) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        class37 var4 = class37.method393(arg1);
        for (int var5 = 0; var5 < var4.field1119.length && var4.field1119[var5] != -1; ++var5) {
            class37 var6 = class37.method393(var4.field1119[var5]);
            if (var6.field1153 == 1) {
                this.method190(this.field483, var6.field1160);
            }
            var6.field1132 = 0;
            var6.field1154 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method191(byte arg0) {
        if (arg0 != 33) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field128 && this.field307 == 2 && class63.field1621 != this.field179) {
            this.method135((String) null, -58, "Loading - please wait.");
            this.field307 = 1;
            this.field107 = System.currentTimeMillis();
        }
        if (this.field307 == 1) {
            int var3 = this.method192(867);
            if (var3 != 0 && System.currentTimeMillis() - this.field107 > 360000L) {
                signlink.reporterror(this.field180 + " glcfb " + this.field92 + "," + var3 + "," + field128 + "," + this.field446[0] + "," + this.field124.method240() + "," + this.field179 + "," + this.field84 + "," + this.field85);
                this.field107 = System.currentTimeMillis();
            }
        }
        if (this.field307 == 2 && this.field179 != this.field149) {
            this.field149 = this.field179;
            this.method73(this.field179, true);
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)I")
    public final int method192(int arg0) {
        for (int var2 = 0; var2 < this.field196.length; ++var2) {
            if (this.field196[var2] == null && this.field302[var2] != -1) {
                return -1;
            }
            if (this.field145[var2] == null && this.field303[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field196.length; ++var4) {
            byte[] var6 = this.field145[var4];
            if (var6 != null) {
                int var7 = (this.field301[var4] >> 8) * 64 - this.field535;
                int var8 = (this.field301[var4] & 255) * 64 - this.field536;
                if (this.field146) {
                    var7 = 10;
                    var8 = 10;
                }
                var3 &= class63.method564(var7, var6, var8, false);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field526) {
            return -4;
        } else {
            this.field307 = 2;
            int var5 = 26 / arg0;
            class63.field1621 = this.field179;
            this.method105(true);
            this.field200.method409((byte) -81, 12);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILZQANNJZE;ILPGNBHFUF;I)V")
    private final void method193(int arg0, class69 arg1, int arg2, class42 arg3, int arg4) {
        if (arg2 >= 0) {
            this.field299 = 93;
        }
        if ((arg4 & 32) != 0) {
            int var6 = arg3.method420();
            int var7 = arg3.method439(0);
            arg1.method265(field525, var7, 8, var6);
            arg1.field745 = field525 + 300;
            arg1.field746 = arg3.method420();
            arg1.field747 = arg3.method440(8);
        }
        if ((arg4 & 512) != 0) {
            arg1.field713 = arg3.method448(true);
            int var8 = arg3.method452(true);
            arg1.field717 = var8 >> 16;
            arg1.field716 = (var8 & 65535) + field525;
            arg1.field714 = 0;
            arg1.field715 = 0;
            if (arg1.field716 > field525) {
                arg1.field714 = -1;
            }
            if (arg1.field713 == 65535) {
                arg1.field713 = -1;
            }
        }
        if ((arg4 & 64) != 0) {
            arg1.field744 = arg3.method427();
            if (arg1.field744.charAt(0) == '~') {
                arg1.field744 = arg1.field744.substring(1);
                this.method65((byte) 8, 2, arg1.field1708, arg1.field744);
            } else if (field206 == arg1) {
                this.method65((byte) 8, 2, arg1.field1708, arg1.field744);
            }
            arg1.field709 = 0;
            arg1.field752 = 0;
            arg1.field726 = 150;
        }
        if ((arg4 & 4) != 0) {
            arg1.field725 = arg3.method448(true);
            if (arg1.field725 == 65535) {
                arg1.field725 = -1;
            }
        }
        if ((arg4 & 1) != 0) {
            int var9 = arg3.method439(0);
            byte[] var10 = new byte[var9];
            class42 var11 = new class42(5, var10);
            arg3.method455(0, (byte) 42, var9, var10);
            this.field315[arg0] = var11;
            arg1.method594(this.field494, var11);
        }
        if ((arg4 & 1024) != 0) {
            int var12 = arg3.method440(8);
            int var13 = arg3.method420();
            arg1.method265(field525, var13, 8, var12);
            arg1.field745 = field525 + 300;
            arg1.field746 = arg3.method440(8);
            arg1.field747 = arg3.method420();
        }
        if ((arg4 & 256) != 0) {
            arg1.field699 = arg3.method439(0);
            arg1.field701 = arg3.method439(0);
            arg1.field700 = arg3.method440(8);
            arg1.field702 = arg3.method420();
            arg1.field703 = arg3.method448(true) + field525;
            arg1.field704 = arg3.method446(895) + field525;
            arg1.field705 = arg3.method440(8);
            arg1.method261(true);
        }
        if ((arg4 & 128) != 0) {
            int var14 = arg3.method448(true);
            int var15 = arg3.method420();
            int var16 = arg3.method439(0);
            int var17 = arg3.field1250;
            if (arg1.field1708 != null && arg1.field1696) {
                long var18 = class68.method588(arg1.field1708);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field65; ++var21) {
                        if (this.field163[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field457 == 0) {
                    try {
                        this.field432.field1250 = 0;
                        arg3.method454(0, this.field432.field1249, var16, (byte) 3);
                        this.field432.field1250 = 0;
                        String var22 = class27.method308((byte) 5, var16, this.field432);
                        String var23 = class1.method11(var22, 753);
                        arg1.field744 = var23;
                        arg1.field709 = var14 >> 8;
                        arg1.field752 = var14 & 255;
                        arg1.field726 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method65((byte) 8, 1, "@cr1@" + arg1.field1708, var23);
                            } else {
                                this.method65((byte) 8, 2, arg1.field1708, var23);
                            }
                        } else {
                            this.method65((byte) 8, 1, "@cr2@" + arg1.field1708, var23);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field1250 = var16 + var17;
        }
        if ((arg4 & 8) != 0) {
            arg1.field697 = arg3.method447((byte) -35);
            arg1.field698 = arg3.method446(895);
        }
        if ((arg4 & 2) != 0) {
            int var25 = arg3.method448(true);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = arg3.method438(false);
            if (arg1.field737 == var25 && var25 != -1) {
                int var27 = class29.field1014[var25].field1028;
                if (var27 == 1) {
                    arg1.field738 = 0;
                    arg1.field739 = 0;
                    arg1.field740 = var26;
                    arg1.field741 = 0;
                }
                if (var27 == 2) {
                    arg1.field741 = 0;
                    return;
                }
            } else if (var25 == -1 || arg1.field737 == -1 || class29.field1014[var25].field1022 >= class29.field1014[arg1.field737].field1022) {
                arg1.field737 = var25;
                arg1.field738 = 0;
                arg1.field739 = 0;
                arg1.field740 = var26;
                arg1.field741 = 0;
                arg1.field732 = arg1.field712;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BZI)V")
    public final void method194(byte[] arg0, boolean arg1, int arg2) {
        int var4 = 70 / arg2;
        if (this.field334) {
            signlink.midifade = arg1 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method195(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field372 = 167;
        }
        if (super.field1209 == 1) {
            if (super.field1210 >= 6 && super.field1210 <= 106 && super.field1211 >= 467 && super.field1211 <= 499) {
                this.field366 = (this.field366 + 1) % 4;
                this.field389 = true;
                this.field380 = true;
                this.field200.method409((byte) -81, 72);
                this.field200.method410(this.field366);
                this.field200.method410(this.field350);
                this.field200.method410(this.field407);
            }
            if (super.field1210 >= 135 && super.field1210 <= 235 && super.field1211 >= 467 && super.field1211 <= 499) {
                this.field350 = (this.field350 + 1) % 3;
                this.field389 = true;
                this.field380 = true;
                this.field200.method409((byte) -81, 72);
                this.field200.method410(this.field366);
                this.field200.method410(this.field350);
                this.field200.method410(this.field407);
            }
            if (super.field1210 >= 273 && super.field1210 <= 373 && super.field1211 >= 467 && super.field1211 <= 499) {
                this.field407 = (this.field407 + 1) % 3;
                this.field389 = true;
                this.field380 = true;
                this.field200.method409((byte) -81, 72);
                this.field200.method410(this.field366);
                this.field200.method410(this.field350);
                this.field200.method410(this.field407);
            }
            if (super.field1210 >= 412 && super.field1210 <= 512 && super.field1211 >= 467 && super.field1211 <= 499) {
                if (this.field318 == -1) {
                    this.method206((byte) 72);
                    this.field66 = "";
                    this.field489 = false;
                    this.field403 = this.field318 = class37.field1131;
                    return;
                }
                this.method65((byte) 8, 0, "", "Please close the interface you have open before using 'report abuse'");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)Ljava/lang/String;")
    public final String method196(int arg0) {
        this.field97 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1198 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLPGNBHFUF;I)V")
    private final void method197(boolean arg0, class42 arg1, int arg2) {
        this.field515 = 0;
        this.field313 = 0;
        this.method69(arg1, true, arg2);
        this.method113(arg1, arg2, -730);
        if (arg0) {
            this.field98 = arg1.method420();
        }
        this.method112(arg1, 365, arg2);
        for (int var4 = 0; var4 < this.field515; ++var4) {
            int var6 = this.field516[var4];
            if (field525 != this.field433[var6].field742) {
                this.field433[var6].field796 = null;
                this.field433[var6] = null;
            }
        }
        if (arg1.field1250 != arg2) {
            signlink.reporterror(this.field180 + " size mismatch in getnpcpos - pos:" + arg1.field1250 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field434; ++var5) {
                if (this.field433[this.field435[var5]] == null) {
                    signlink.reporterror(this.field180 + " null entry in npc list - pos:" + var5 + " size:" + this.field434);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIBLNPNTBMMX;II)V")
    public final void method198(int arg0, int arg1, int arg2, int arg3, byte arg4, class37 arg5, int arg6, int arg7) {
        if (arg4 == 3) {
            boolean var9 = false;
        } else {
            this.field98 = this.field337.method420();
        }
        if (arg5.field1153 == 0 && arg5.field1119 != null && !arg5.field1157) {
            if (arg6 >= arg3 && arg2 >= arg0 && arg6 <= arg5.field1111 + arg3 && arg2 <= arg5.field1106 + arg0) {
                int var10 = arg5.field1119.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg5.field1108[var11] + arg3;
                    int var13 = arg5.field1117[var11] + arg0 - arg1;
                    class37 var14 = class37.method393(arg5.field1119[var11]);
                    int var15 = var14.field1130 + var12;
                    int var16 = var14.field1116 + var13;
                    if ((var14.field1105 >= 0 || var14.field1126 != 0) && arg6 >= var15 && arg2 >= var16 && arg6 < var14.field1111 + var15 && arg2 < var14.field1106 + var16) {
                        if (var14.field1105 >= 0) {
                            this.field197 = var14.field1105;
                        } else {
                            this.field197 = var14.field1160;
                        }
                    }
                    if (var14.field1153 == 8 && arg6 >= var15 && arg2 >= var16 && arg6 < var14.field1111 + var15 && arg2 < var14.field1106 + var16) {
                        this.field64 = var14.field1160;
                    }
                    if (var14.field1153 == 0) {
                        this.method198(var16, var14.field1156, arg2, var15, (byte) 3, var14, arg6, arg7);
                        if (var14.field1129 > var14.field1106) {
                            this.method72(arg2, var16, var14, var14.field1111 + var15, arg7, 706, arg6, var14.field1129, var14.field1106);
                        }
                    } else {
                        if (var14.field1173 == 1 && arg6 >= var15 && arg2 >= var16 && arg6 < var14.field1111 + var15 && arg2 < var14.field1106 + var16) {
                            boolean var17 = false;
                            if (var14.field1172 != 0) {
                                var17 = this.method111(9516, var14);
                            }
                            if (!var17) {
                                this.field495[this.field383] = var14.field1141;
                                this.field423[this.field383] = 208;
                                this.field422[this.field383] = var14.field1160;
                                ++this.field383;
                            }
                        }
                        if (var14.field1173 == 2 && this.field550 == 0 && arg6 >= var15 && arg2 >= var16 && arg6 < var14.field1111 + var15 && arg2 < var14.field1106 + var16) {
                            String var18 = var14.field1107;
                            if (var18.indexOf(" ") != -1) {
                                var18 = var18.substring(0, var18.indexOf(" "));
                            }
                            this.field495[this.field383] = var18 + " @gre@" + var14.field1164;
                            this.field423[this.field383] = 444;
                            this.field422[this.field383] = var14.field1160;
                            ++this.field383;
                        }
                        if (var14.field1173 == 3 && arg6 >= var15 && arg2 >= var16 && arg6 < var14.field1111 + var15 && arg2 < var14.field1106 + var16) {
                            this.field495[this.field383] = "Close";
                            if (arg7 == 3) {
                                this.field423[this.field383] = 178;
                            } else {
                                this.field423[this.field383] = 368;
                            }
                            this.field422[this.field383] = var14.field1160;
                            ++this.field383;
                        }
                        if (var14.field1173 == 4 && arg6 >= var15 && arg2 >= var16 && arg6 < var14.field1111 + var15 && arg2 < var14.field1106 + var16) {
                            this.field495[this.field383] = var14.field1141;
                            this.field423[this.field383] = 407;
                            this.field422[this.field383] = var14.field1160;
                            ++this.field383;
                        }
                        if (var14.field1173 == 5 && arg6 >= var15 && arg2 >= var16 && arg6 < var14.field1111 + var15 && arg2 < var14.field1106 + var16) {
                            this.field495[this.field383] = var14.field1141;
                            this.field423[this.field383] = 105;
                            this.field422[this.field383] = var14.field1160;
                            ++this.field383;
                        }
                        if (var14.field1173 == 6 && !this.field425 && arg6 >= var15 && arg2 >= var16 && arg6 < var14.field1111 + var15 && arg2 < var14.field1106 + var16) {
                            this.field495[this.field383] = var14.field1141;
                            this.field423[this.field383] = 284;
                            this.field422[this.field383] = var14.field1160;
                            ++this.field383;
                        }
                        if (var14.field1153 == 2) {
                            int var19 = 0;
                            for (int var20 = 0; var20 < var14.field1106; ++var20) {
                                for (int var21 = 0; var21 < var14.field1111; ++var21) {
                                    int var22 = (var14.field1127 + 32) * var21 + var15;
                                    int var23 = (var14.field1112 + 32) * var20 + var16;
                                    if (var19 < 20) {
                                        var22 += var14.field1144[var19];
                                        var23 += var14.field1101[var19];
                                    }
                                    if (arg6 >= var22 && arg2 >= var23 && arg6 < var22 + 32 && arg2 < var23 + 32) {
                                        this.field77 = var19;
                                        this.field78 = var14.field1160;
                                        if (var14.field1155[var19] > 0) {
                                            class22 var24 = class22.method290(var14.field1155[var19] - 1);
                                            if (this.field458 == 1 && var14.field1165) {
                                                if (this.field460 != var14.field1160 || this.field459 != var19) {
                                                    this.field495[this.field383] = "Use " + this.field462 + " with @lre@" + var24.field851;
                                                    this.field423[this.field383] = 835;
                                                    this.field424[this.field383] = var24.field878;
                                                    this.field421[this.field383] = var19;
                                                    this.field422[this.field383] = var14.field1160;
                                                    ++this.field383;
                                                }
                                            } else if (this.field550 == 1 && var14.field1165) {
                                                if ((this.field552 & 16) == 16) {
                                                    this.field495[this.field383] = this.field553 + " @lre@" + var24.field851;
                                                    this.field423[this.field383] = 206;
                                                    this.field424[this.field383] = var24.field878;
                                                    this.field421[this.field383] = var19;
                                                    this.field422[this.field383] = var14.field1160;
                                                    ++this.field383;
                                                }
                                            } else {
                                                if (var14.field1165) {
                                                    for (int var25 = 4; var25 >= 3; --var25) {
                                                        if (var24.field877 != null && var24.field877[var25] != null) {
                                                            this.field495[this.field383] = var24.field877[var25] + " @lre@" + var24.field851;
                                                            if (var25 == 3) {
                                                                this.field423[this.field383] = 537;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field423[this.field383] = 996;
                                                            }
                                                            this.field424[this.field383] = var24.field878;
                                                            this.field421[this.field383] = var19;
                                                            this.field422[this.field383] = var14.field1160;
                                                            ++this.field383;
                                                        } else if (var25 == 4) {
                                                            this.field495[this.field383] = "Drop @lre@" + var24.field851;
                                                            this.field423[this.field383] = 996;
                                                            this.field424[this.field383] = var24.field878;
                                                            this.field421[this.field383] = var19;
                                                            this.field422[this.field383] = var14.field1160;
                                                            ++this.field383;
                                                        }
                                                    }
                                                }
                                                if (var14.field1133) {
                                                    this.field495[this.field383] = "Use @lre@" + var24.field851;
                                                    this.field423[this.field383] = 728;
                                                    this.field424[this.field383] = var24.field878;
                                                    this.field421[this.field383] = var19;
                                                    this.field422[this.field383] = var14.field1160;
                                                    ++this.field383;
                                                }
                                                if (var14.field1165 && var24.field877 != null) {
                                                    for (int var26 = 2; var26 >= 0; --var26) {
                                                        if (var24.field877[var26] != null) {
                                                            this.field495[this.field383] = var24.field877[var26] + " @lre@" + var24.field851;
                                                            if (var26 == 0) {
                                                                this.field423[this.field383] = 358;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field423[this.field383] = 177;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field423[this.field383] = 839;
                                                            }
                                                            this.field424[this.field383] = var24.field878;
                                                            this.field421[this.field383] = var19;
                                                            this.field422[this.field383] = var14.field1160;
                                                            ++this.field383;
                                                        }
                                                    }
                                                }
                                                if (var14.field1137 != null) {
                                                    for (int var27 = 4; var27 >= 0; --var27) {
                                                        if (var14.field1137[var27] != null) {
                                                            this.field495[this.field383] = var14.field1137[var27] + " @lre@" + var24.field851;
                                                            if (var27 == 0) {
                                                                this.field423[this.field383] = 277;
                                                            }
                                                            if (var27 == 1) {
                                                                this.field423[this.field383] = 73;
                                                            }
                                                            if (var27 == 2) {
                                                                this.field423[this.field383] = 664;
                                                            }
                                                            if (var27 == 3) {
                                                                this.field423[this.field383] = 127;
                                                            }
                                                            if (var27 == 4) {
                                                                this.field423[this.field383] = 906;
                                                            }
                                                            this.field424[this.field383] = var24.field878;
                                                            this.field421[this.field383] = var19;
                                                            this.field422[this.field383] = var14.field1160;
                                                            ++this.field383;
                                                        }
                                                    }
                                                }
                                                this.field495[this.field383] = "Examine @lre@" + var24.field851;
                                                this.field423[this.field383] = 1516;
                                                this.field424[this.field383] = var24.field878;
                                                this.field421[this.field383] = var19;
                                                this.field422[this.field383] = var14.field1160;
                                                ++this.field383;
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

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method199(int arg0) {
        while (arg0 >= 0) {
            field205 = -105;
        }
        class7.field576.method601();
        class7.field585.method601();
        class58.field1491.method601();
        class22.field874.method601();
        class22.field872.method601();
        class69.field1703.method601();
        class6.field61.method601();
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)V")
    public final void method200(byte arg0, int arg1) {
        if (arg0 != 7) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        class37.method398(field390, arg1);
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method201(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)Z")
    public final boolean method202(byte arg0) {
        if (arg0 != 8) {
            field205 = 416;
        }
        if (this.field62 == null) {
            return false;
        } else {
            try {
                int var2 = this.field62.method279();
                if (var2 == 0) {
                    return false;
                }
                if (this.field98 == -1) {
                    this.field62.method280(this.field337.field1249, 0, 1);
                    this.field98 = this.field337.field1249[0] & 255;
                    if (this.field139 != null) {
                        this.field98 = this.field98 - this.field139.method51() & 255;
                    }
                    this.field97 = class45.field1358[this.field98];
                    --var2;
                }
                if (this.field97 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field62.method280(this.field337.field1249, 0, 1);
                    this.field97 = this.field337.field1249[0] & 255;
                    --var2;
                }
                if (this.field97 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field62.method280(this.field337.field1249, 0, 2);
                    this.field337.field1250 = 0;
                    this.field97 = this.field337.method422();
                    var2 -= 2;
                }
                if (var2 < this.field97) {
                    return false;
                }
                this.field337.field1250 = 0;
                this.field62.method280(this.field337.field1249, 0, this.field97);
                this.field99 = 0;
                this.field543 = this.field542;
                this.field542 = this.field541;
                this.field541 = this.field98;
                if (this.field98 == 173) {
                    this.field321 = this.field337.method447((byte) -35) * 30;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 166) {
                    long var3 = this.field337.method426(true);
                    int var5 = this.field337.method420();
                    String var6 = class68.method592((byte) 20, class68.method589(var3, -115));
                    for (int var7 = 0; var7 < this.field327; ++var7) {
                        if (this.field193[var7] == var3) {
                            if (this.field296[var7] != var5) {
                                this.field296[var7] = var5;
                                this.field361 = true;
                                if (var5 > 0) {
                                    this.method65((byte) 8, 5, "", var6 + " has logged in.");
                                }
                                if (var5 == 0) {
                                    this.method65((byte) 8, 5, "", var6 + " has logged out.");
                                }
                            }
                            var6 = null;
                            break;
                        }
                    }
                    if (var6 != null && this.field327 < 200) {
                        this.field193[this.field327] = var3;
                        this.field393[this.field327] = var6;
                        this.field296[this.field327] = var5;
                        ++this.field327;
                        this.field361 = true;
                    }
                    boolean var8 = false;
                    while (!var8) {
                        var8 = true;
                        for (int var9 = 0; var9 < this.field327 - 1; ++var9) {
                            if (this.field296[var9] != field125 && this.field296[var9 + 1] == field125 || this.field296[var9] == 0 && this.field296[var9 + 1] != 0) {
                                int var10 = this.field296[var9];
                                this.field296[var9] = this.field296[var9 + 1];
                                this.field296[var9 + 1] = var10;
                                String var11 = this.field393[var9];
                                this.field393[var9] = this.field393[var9 + 1];
                                this.field393[var9 + 1] = var11;
                                long var12 = this.field193[var9];
                                this.field193[var9] = this.field193[var9 + 1];
                                this.field193[var9 + 1] = var12;
                                this.field361 = true;
                                var8 = false;
                            }
                        }
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 237) {
                    this.field361 = true;
                    int var14 = this.field337.method422();
                    class37 var15 = class37.method393(var14);
                    int var16 = this.field337.method422();
                    for (int var17 = 0; var17 < var16; ++var17) {
                        var15.field1155[var17] = this.field337.method446(895);
                        int var18 = this.field337.method440(8);
                        if (var18 == 255) {
                            var18 = this.field337.method452(true);
                        }
                        var15.field1163[var17] = var18;
                    }
                    for (int var19 = var16; var19 < var15.field1155.length; ++var19) {
                        var15.field1155[var19] = 0;
                        var15.field1163[var19] = 0;
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 165) {
                    int var20 = this.field337.method422();
                    this.method190(this.field483, var20);
                    if (this.field395 != -1) {
                        this.method200(field390, this.field395);
                        this.field395 = -1;
                        this.field361 = true;
                        this.field410 = true;
                    }
                    if (this.field323 != -1) {
                        this.method200(field390, this.field323);
                        this.field323 = -1;
                        this.field380 = true;
                    }
                    if (this.field451 != -1) {
                        this.method200(field390, this.field451);
                        this.field451 = -1;
                        this.field332 = true;
                    }
                    if (this.field377 != -1) {
                        this.method200(field390, this.field377);
                        this.field377 = -1;
                    }
                    if (this.field318 != var20) {
                        this.method200(field390, this.field318);
                        this.field318 = var20;
                    }
                    if (this.field397 != 0) {
                        this.field397 = 0;
                        this.field380 = true;
                    }
                    this.field425 = false;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 159) {
                    this.method168(this.field97, (byte) -79, this.field337);
                    this.field526 = false;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 67) {
                    this.field65 = this.field97 / 8;
                    for (int var21 = 0; var21 < this.field65; ++var21) {
                        this.field163[var21] = this.field337.method426(true);
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 220) {
                    long var22 = this.field337.method426(true);
                    int var24 = this.field337.method425();
                    int var25 = this.field337.method420();
                    boolean var26 = false;
                    for (int var27 = 0; var27 < 100; ++var27) {
                        if (this.field453[var27] == var24) {
                            var26 = true;
                            break;
                        }
                    }
                    if (var25 <= 1) {
                        for (int var28 = 0; var28 < this.field65; ++var28) {
                            if (this.field163[var28] == var22) {
                                var26 = true;
                                break;
                            }
                        }
                    }
                    if (!var26 && this.field457 == 0) {
                        try {
                            this.field453[this.field549] = var24;
                            this.field549 = (this.field549 + 1) % 100;
                            String var29 = class27.method308((byte) 5, this.field97 - 13, this.field337);
                            if (var25 != 3) {
                                var29 = class1.method11(var29, 753);
                            }
                            if (var25 != 2 && var25 != 3) {
                                if (var25 == 1) {
                                    this.method65((byte) 8, 7, "@cr1@" + class68.method592((byte) 20, class68.method589(var22, -115)), var29);
                                } else {
                                    this.method65((byte) 8, 3, class68.method592((byte) 20, class68.method589(var22, -115)), var29);
                                }
                            } else {
                                this.method65((byte) 8, 7, "@cr2@" + class68.method592((byte) 20, class68.method589(var22, -115)), var29);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 236) {
                    this.field108 = 0;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 253) {
                    int var31 = this.field337.method447((byte) -35);
                    int var32 = this.field337.method422();
                    class37.method393(var32).field1149 = 2;
                    class37.method393(var32).field1150 = var31;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 248) {
                    int var33 = this.field337.method447((byte) -35);
                    int var34 = this.field337.method422();
                    this.method190(this.field483, var33);
                    if (var34 != -1) {
                        this.method190(this.field483, var34);
                    }
                    if (this.field318 != -1) {
                        this.method200(field390, this.field318);
                        this.field318 = -1;
                    }
                    if (this.field395 != -1) {
                        this.method200(field390, this.field395);
                        this.field395 = -1;
                    }
                    if (this.field323 != -1) {
                        this.method200(field390, this.field323);
                        this.field323 = -1;
                    }
                    if (this.field451 != var33) {
                        this.method200(field390, this.field451);
                        this.field451 = var33;
                    }
                    if (this.field377 != var33) {
                        this.method200(field390, this.field377);
                        this.field377 = var34;
                    }
                    this.field397 = 0;
                    this.field425 = false;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 183) {
                    this.field298 = this.field337.method420();
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 104) {
                    this.field361 = true;
                    int var35 = this.field337.method422();
                    class37 var36 = class37.method393(var35);
                    while (this.field337.field1250 < this.field97) {
                        int var37 = this.field337.method434();
                        int var38 = this.field337.method422();
                        int var39 = this.field337.method420();
                        if (var39 == 255) {
                            var39 = this.field337.method425();
                        }
                        if (var37 >= 0 && var37 < var36.field1155.length) {
                            var36.field1155[var37] = var38;
                            var36.field1163[var37] = var39;
                        }
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 233) {
                    int var40 = this.field337.method422();
                    int var41 = this.field337.method446(895);
                    int var42 = var41 >> 10 & 31;
                    int var43 = var41 >> 5 & 31;
                    int var44 = var41 & 31;
                    class37.method393(var40).field1134 = (var44 << 3) + (var42 << 19) + (var43 << 11);
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 59) {
                    this.method197(false, this.field337, this.field97);
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 235) {
                    if (this.field394 == 12) {
                        this.field361 = true;
                    }
                    this.field138 = this.field337.method420();
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 176) {
                    for (int var45 = 0; var45 < this.field373.length; ++var45) {
                        if (this.field89[var45] != this.field373[var45]) {
                            this.field373[var45] = this.field89[var45];
                            this.method208(6, var45);
                            this.field361 = true;
                        }
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 174) {
                    int var46 = this.field337.method446(895);
                    int var47 = this.field337.method452(true);
                    this.field89[var46] = var47;
                    if (this.field373[var46] != var47) {
                        this.field373[var46] = var47;
                        this.method208(6, var46);
                        this.field361 = true;
                        if (this.field559 != -1) {
                            this.field380 = true;
                        }
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 11) {
                    this.field291 = this.field337.method440(8);
                    this.field292 = this.field337.method439(0);
                    while (this.field337.field1250 < this.field97) {
                        int var48 = this.field337.method420();
                        this.method189(this.field104, this.field337, var48);
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 28) {
                    this.field292 = this.field337.method440(8);
                    this.field291 = this.field337.method420();
                    for (int var49 = this.field291; var49 < this.field291 + 8; ++var49) {
                        for (int var50 = this.field292; var50 < this.field292 + 8; ++var50) {
                            if (this.field295[this.field179][var49][var50] != null) {
                                this.field295[this.field179][var49][var50] = null;
                                this.method71(var49, var50);
                            }
                        }
                    }
                    for (class24 var51 = (class24) this.field214.method269(); var51 != null; var51 = (class24) this.field214.method271(15175)) {
                        if (var51.field921 >= this.field291 && var51.field921 < this.field291 + 8 && var51.field922 >= this.field292 && var51.field922 < this.field292 + 8 && this.field179 == var51.field919) {
                            var51.field914 = 0;
                        }
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 192) {
                    this.field418 = this.field337.method420();
                    if (this.field418 == this.field394) {
                        if (this.field418 == 3) {
                            this.field394 = 1;
                        } else {
                            this.field394 = 3;
                        }
                        this.field361 = true;
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 239) {
                    int var52 = this.field337.method448(true);
                    int var53 = this.field337.method423();
                    int var54 = this.field337.method449((byte) 2);
                    class37 var55 = class37.method393(var52);
                    var55.field1130 = var53;
                    var55.field1116 = var54;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 203) {
                    this.field548 = this.field337.method422();
                    this.field120 = this.field337.method425();
                    this.field408 = this.field337.method422();
                    this.field199 = this.field337.method446(895);
                    this.field87 = this.field337.method447((byte) -35);
                    this.field162 = this.field337.method448(true);
                    this.field337.method440(8);
                    this.field224 = this.field337.method447((byte) -35);
                    this.field86 = this.field337.method448(true);
                    this.field337.method446(895);
                    this.field417 = this.field337.method447((byte) -35);
                    signlink.dnslookup(class68.method591((byte) 122, this.field120));
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 55) {
                    if (this.field395 != -1) {
                        this.method200(field390, this.field395);
                        this.field395 = -1;
                        this.field361 = true;
                        this.field410 = true;
                    }
                    if (this.field323 != -1) {
                        this.method200(field390, this.field323);
                        this.field323 = -1;
                        this.field380 = true;
                    }
                    if (this.field451 != -1) {
                        this.method200(field390, this.field451);
                        this.field451 = -1;
                        this.field332 = true;
                    }
                    if (this.field377 != -1) {
                        this.method200(field390, this.field377);
                        this.field377 = -1;
                    }
                    if (this.field318 != -1) {
                        this.method200(field390, this.field318);
                        this.field318 = -1;
                    }
                    if (this.field397 != 0) {
                        this.field397 = 0;
                        this.field380 = true;
                    }
                    this.field425 = false;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 249) {
                    this.field376 = this.field337.method420();
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 10) {
                    int var56 = this.field337.method422();
                    int var57 = this.field337.method420();
                    int var58 = this.field337.method422();
                    if (var58 == 65535) {
                        if (this.field275 < 50) {
                            this.field473[this.field275] = (short) var56;
                            this.field486[this.field275] = var57;
                            this.field148[this.field275] = 0;
                            ++this.field275;
                        }
                    } else if (this.field479 && !field128 && this.field275 < 50) {
                        this.field473[this.field275] = var56;
                        this.field486[this.field275] = var57;
                        this.field148[this.field275] = class50.field1421[var56] + var58;
                        ++this.field275;
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 36) {
                    int var59 = this.field337.method420();
                    int var60 = this.field337.method420();
                    int var61 = this.field337.method420();
                    int var62 = this.field337.method420();
                    this.field532[var59] = true;
                    this.field105[var59] = var60;
                    this.field406[var59] = var61;
                    this.field534[var59] = var62;
                    this.field169[var59] = 0;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 190) {
                    int var63 = this.field337.method422();
                    int var64 = this.field337.method422();
                    class37 var65 = class37.method393(var64);
                    if (var65 != null && var65.field1153 == 0) {
                        if (var63 < 0) {
                            var63 = 0;
                        }
                        if (var63 > var65.field1129 - var65.field1106) {
                            var63 = var65.field1129 - var65.field1106;
                        }
                        var65.field1156 = var63;
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 93) {
                    boolean var66 = this.field337.method439(0) == 1;
                    int var67 = this.field337.method448(true);
                    class37.method393(var67).field1157 = var66;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 66) {
                    this.field286 = false;
                    this.field397 = 1;
                    this.field339 = "";
                    this.field380 = true;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 111) {
                    int var68 = this.field337.method446(895);
                    class37 var69 = class37.method393(var68);
                    for (int var70 = 0; var70 < var69.field1155.length; ++var70) {
                        var69.field1155[var70] = -1;
                        var69.field1155[var70] = 0;
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 88) {
                    int var71 = this.field337.method448(true);
                    int var72 = this.field337.method447((byte) -35);
                    int var73 = this.field337.method448(true);
                    class37.method393(var72).field1123 = (var71 << 16) + var73;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 142) {
                    this.field286 = false;
                    this.field397 = 2;
                    this.field339 = "";
                    this.field380 = true;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 92) {
                    int var74 = this.field337.method446(895);
                    this.method190(this.field483, var74);
                    if (this.field323 != -1) {
                        this.method200(field390, this.field323);
                        this.field323 = -1;
                        this.field380 = true;
                    }
                    if (this.field451 != -1) {
                        this.method200(field390, this.field451);
                        this.field451 = -1;
                        this.field332 = true;
                    }
                    if (this.field377 != -1) {
                        this.method200(field390, this.field377);
                        this.field377 = -1;
                    }
                    if (this.field318 != -1) {
                        this.method200(field390, this.field318);
                        this.field318 = -1;
                    }
                    if (this.field395 != var74) {
                        this.method200(field390, this.field395);
                        this.field395 = var74;
                    }
                    if (this.field397 != 0) {
                        this.field397 = 0;
                        this.field380 = true;
                    }
                    this.field361 = true;
                    this.field410 = true;
                    this.field425 = false;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 194) {
                    int var75 = this.field337.method422();
                    int var76 = this.field337.method446(895);
                    if (this.field323 != -1) {
                        this.method200(field390, this.field323);
                        this.field323 = -1;
                        this.field380 = true;
                    }
                    if (this.field451 != -1) {
                        this.method200(field390, this.field451);
                        this.field451 = -1;
                        this.field332 = true;
                    }
                    if (this.field377 != -1) {
                        this.method200(field390, this.field377);
                        this.field377 = -1;
                    }
                    if (this.field318 != var75) {
                        this.method200(field390, this.field318);
                        this.field318 = var75;
                    }
                    if (this.field395 != var76) {
                        this.method200(field390, this.field395);
                        this.field395 = var76;
                    }
                    if (this.field397 != 0) {
                        this.field397 = 0;
                        this.field380 = true;
                    }
                    this.field361 = true;
                    this.field410 = true;
                    this.field425 = false;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 131) {
                    String var77 = this.field337.method427();
                    if (var77.endsWith(":tradereq:")) {
                        String var78 = var77.substring(0, var77.indexOf(":"));
                        long var79 = class68.method588(var78);
                        boolean var81 = false;
                        for (int var82 = 0; var82 < this.field65; ++var82) {
                            if (this.field163[var82] == var79) {
                                var81 = true;
                                break;
                            }
                        }
                        if (!var81 && this.field457 == 0) {
                            this.method65((byte) 8, 4, var78, "wishes to trade with you.");
                        }
                    } else if (var77.endsWith(":duelreq:")) {
                        String var83 = var77.substring(0, var77.indexOf(":"));
                        long var84 = class68.method588(var83);
                        boolean var86 = false;
                        for (int var87 = 0; var87 < this.field65; ++var87) {
                            if (this.field163[var87] == var84) {
                                var86 = true;
                                break;
                            }
                        }
                        if (!var86 && this.field457 == 0) {
                            this.method65((byte) 8, 8, var83, "wishes to duel with you.");
                        }
                    } else if (!var77.endsWith(":chalreq:")) {
                        this.method65((byte) 8, 0, "", var77);
                    } else {
                        String var88 = var77.substring(0, var77.indexOf(":"));
                        long var89 = class68.method588(var88);
                        boolean var91 = false;
                        for (int var92 = 0; var92 < this.field65; ++var92) {
                            if (this.field163[var92] == var89) {
                                var91 = true;
                                break;
                            }
                        }
                        if (!var91 && this.field457 == 0) {
                            String var93 = var77.substring(var77.indexOf(":") + 1, var77.length() - 9);
                            this.method65((byte) 8, 8, var88, var93);
                        }
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 215) {
                    this.field229 = false;
                    for (int var94 = 0; var94 < 5; ++var94) {
                        this.field532[var94] = false;
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 205) {
                    int var95 = this.field337.method450((byte) -6);
                    if (this.field559 != var95) {
                        this.method200(field390, this.field559);
                        this.field559 = var95;
                    }
                    this.field380 = true;
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 137) {
                    this.field322 = this.field337.method420();
                    if (this.field322 == 1) {
                        this.field455 = this.field337.method422();
                    }
                    if (this.field322 >= 2 && this.field322 <= 6) {
                        if (this.field322 == 2) {
                            this.field370 = 64;
                            this.field371 = 64;
                        }
                        if (this.field322 == 3) {
                            this.field370 = 0;
                            this.field371 = 64;
                        }
                        if (this.field322 == 4) {
                            this.field370 = 128;
                            this.field371 = 64;
                        }
                        if (this.field322 == 5) {
                            this.field370 = 64;
                            this.field371 = 0;
                        }
                        if (this.field322 == 6) {
                            this.field370 = 64;
                            this.field371 = 128;
                        }
                        this.field322 = 2;
                        this.field367 = this.field337.method422();
                        this.field368 = this.field337.method422();
                        this.field369 = this.field337.method420();
                    }
                    if (this.field322 == 10) {
                        this.field155 = this.field337.method422();
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 44) {
                    this.field229 = true;
                    this.field156 = this.field337.method420();
                    this.field157 = this.field337.method420();
                    this.field158 = this.field337.method422();
                    this.field159 = this.field337.method420();
                    this.field160 = this.field337.method420();
                    if (this.field160 >= 100) {
                        this.field269 = this.field156 * 128 + 64;
                        this.field271 = this.field157 * 128 + 64;
                        this.field270 = this.method91(this.field179, this.field269, false, this.field271) - this.field158;
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 204) {
                    String var96 = this.field337.method427();
                    int var97 = this.field337.method446(895);
                    class37.method393(var97).field1139 = var96;
                    int var10001 = this.field430[this.field394];
                    if (class37.method393(var97).field1148 == var10001) {
                        this.field361 = true;
                    }
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 33) {
                    if (this.field394 == 12) {
                        this.field361 = true;
                    }
                    this.field211 = this.field337.method423();
                    this.field98 = -1;
                    return true;
                }
                if (this.field98 == 113) {
                    this.method134(0);
                    this.field98 = -1;
                    return false;
                }
                if (this.field98 != 150 && this.field98 != 118) {
                    if (this.field98 != 216 && this.field98 != 41 && this.field98 != 39 && this.field98 != 125 && this.field98 != 114 && this.field98 != 133 && this.field98 != 20 && this.field98 != 51 && this.field98 != 127 && this.field98 != 90 && this.field98 != 74) {
                        if (this.field98 == 242) {
                            int var148 = this.field337.method446(895);
                            class37.method393(var148).field1149 = 3;
                            if (field206.field1697 == null) {
                                class37.method393(var148).field1150 = (field206.field1707[11] << 5) + (field206.field1707[8] << 10) + (field206.field1707[0] << 15) + (field206.field1700[0] << 25) + (field206.field1700[4] << 20) + field206.field1707[1];
                            } else {
                                class37.method393(var148).field1150 = (int) (field206.field1697.field1525 + 305419896L);
                            }
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 212) {
                            this.field436 = this.field337.method422();
                            this.field236 = this.field337.method439(0);
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 31) {
                            this.field292 = this.field337.method438(false);
                            this.field291 = this.field337.method438(false);
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 54) {
                            int var149 = this.field337.method449((byte) 2);
                            int var150 = this.field337.method448(true);
                            class37 var151 = class37.method393(var150);
                            if (var151.field1109 != var149 || var149 == -1) {
                                var151.field1109 = var149;
                                var151.field1132 = 0;
                                var151.field1154 = 0;
                            }
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 135) {
                            this.field366 = this.field337.method420();
                            this.field350 = this.field337.method420();
                            this.field407 = this.field337.method420();
                            this.field389 = true;
                            this.field380 = true;
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 187) {
                            for (int var152 = 0; var152 < this.field310.length; ++var152) {
                                if (this.field310[var152] != null) {
                                    this.field310[var152].field737 = -1;
                                }
                            }
                            for (int var153 = 0; var153 < this.field433.length; ++var153) {
                                if (this.field433[var153] != null) {
                                    this.field433[var153].field737 = -1;
                                }
                            }
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 167) {
                            int var154 = this.field337.method438(false);
                            int var155 = this.field337.method446(895);
                            if (var155 == 65535) {
                                var155 = -1;
                            }
                            if (this.field430[var154] != var155) {
                                this.method200(field390, this.field430[var154]);
                                this.field430[var154] = var155;
                            }
                            this.field361 = true;
                            this.field410 = true;
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 154) {
                            int var156 = this.field337.method447((byte) -35);
                            int var157 = this.field337.method446(895);
                            class37.method393(var157).field1149 = 1;
                            class37.method393(var157).field1150 = var156;
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 22) {
                            int var158 = this.field337.method422();
                            this.method190(this.field483, var158);
                            if (this.field395 != -1) {
                                this.method200(field390, this.field395);
                                this.field395 = -1;
                                this.field361 = true;
                                this.field410 = true;
                            }
                            if (this.field451 != -1) {
                                this.method200(field390, this.field451);
                                this.field451 = -1;
                                this.field332 = true;
                            }
                            if (this.field377 != -1) {
                                this.method200(field390, this.field377);
                                this.field377 = -1;
                            }
                            if (this.field318 != -1) {
                                this.method200(field390, this.field318);
                                this.field318 = -1;
                            }
                            if (this.field323 != var158) {
                                this.method200(field390, this.field323);
                                this.field323 = var158;
                            }
                            this.field425 = false;
                            this.field380 = true;
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 200) {
                            this.field229 = true;
                            this.field412 = this.field337.method420();
                            this.field413 = this.field337.method420();
                            this.field414 = this.field337.method422();
                            this.field415 = this.field337.method420();
                            this.field416 = this.field337.method420();
                            if (this.field416 >= 100) {
                                int var159 = this.field412 * 128 + 64;
                                int var160 = this.field413 * 128 + 64;
                                int var161 = this.method91(this.field179, var159, false, var160) - this.field414;
                                int var162 = var159 - this.field269;
                                int var163 = var161 - this.field270;
                                int var164 = var160 - this.field271;
                                int var165 = (int) Math.sqrt((double) (var162 * var162 + var164 * var164));
                                this.field272 = (int) (Math.atan2((double) var163, (double) var165) * 325.949D) & 2047;
                                this.field273 = (int) (Math.atan2((double) var162, (double) var164) * -325.949D) & 2047;
                                if (this.field272 < 128) {
                                    this.field272 = 128;
                                }
                                if (this.field272 > 383) {
                                    this.field272 = 383;
                                }
                            }
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 94) {
                            this.field394 = this.field337.method420();
                            this.field361 = true;
                            this.field410 = true;
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 72) {
                            this.field328 = this.field337.method420();
                            this.field361 = true;
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 18) {
                            int var166 = this.field337.method446(895);
                            int var167 = this.field337.method446(895);
                            int var168 = this.field337.method448(true);
                            int var169 = this.field337.method447((byte) -35);
                            class37.method393(var166).field1169 = var168;
                            class37.method393(var166).field1170 = var169;
                            class37.method393(var166).field1168 = var167;
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 102) {
                            int var170 = this.field337.method422();
                            byte var171 = this.field337.method442(this.field293);
                            this.field89[var170] = var171;
                            if (this.field373[var170] != var171) {
                                this.field373[var170] = var171;
                                this.method208(6, var170);
                                this.field361 = true;
                                if (this.field559 != -1) {
                                    this.field380 = true;
                                }
                            }
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 64) {
                            int var172 = this.field337.method448(true);
                            int var173 = this.field337.method446(895);
                            int var174 = this.field337.method447((byte) -35);
                            if (var172 == 65535) {
                                class37.method393(var173).field1149 = 0;
                                this.field98 = -1;
                                return true;
                            }
                            class22 var175 = class22.method290(var172);
                            class37.method393(var173).field1149 = 4;
                            class37.method393(var173).field1150 = var172;
                            class37.method393(var173).field1169 = var175.field892;
                            class37.method393(var173).field1170 = var175.field869;
                            class37.method393(var173).field1168 = var175.field879 * 100 / var174;
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 84) {
                            int var176 = this.field337.method422();
                            if (var176 == 65535) {
                                var176 = -1;
                            }
                            if (this.field530 != var176 && this.field334 && !field128 && this.field221 == 0) {
                                this.field242 = var176;
                                this.field243 = true;
                                this.field124.method230(2, this.field242);
                            }
                            this.field530 = var176;
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 106) {
                            int var177 = this.field337.method424();
                            int var178 = this.field337.method446(895);
                            if (this.field334 && !field128) {
                                this.field242 = var178;
                                this.field243 = false;
                                this.field124.method230(2, this.field242);
                                this.field221 = var177;
                            }
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 95) {
                            this.field361 = true;
                            int var179 = this.field337.method420();
                            int var180 = this.field337.method452(true);
                            int var181 = this.field337.method438(false);
                            this.field133[var181] = var180;
                            this.field445[var181] = var179;
                            this.field67[var181] = 1;
                            for (int var182 = 0; var182 < 98; ++var182) {
                                if (var180 >= field113[var182]) {
                                    this.field67[var181] = var182 + 2;
                                }
                            }
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 164) {
                            int var183 = this.field337.method449((byte) 2);
                            if (var183 >= 0) {
                                this.method190(this.field483, var183);
                            }
                            if (this.field347 != var183) {
                                this.method200(field390, this.field347);
                                this.field347 = var183;
                            }
                            this.field98 = -1;
                            return true;
                        }
                        if (this.field98 == 149) {
                            int var184 = this.field337.method440(8);
                            String var185 = this.field337.method427();
                            int var186 = this.field337.method438(false);
                            if (var186 >= 1 && var186 <= 5) {
                                if (var185.equalsIgnoreCase("null")) {
                                    var185 = null;
                                }
                                this.field381[var186 - 1] = var185;
                                this.field382[var186 - 1] = var184 == 0;
                            }
                            this.field98 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field98 + "," + this.field97 + " - " + this.field542 + "," + this.field543);
                        this.method134(0);
                        return true;
                    }
                    this.method189(this.field104, this.field337, this.field98);
                    this.field98 = -1;
                    return true;
                }
                int var98 = this.field84;
                int var99 = this.field85;
                if (this.field98 == 150) {
                    var98 = this.field337.method446(895);
                    var99 = this.field337.method448(true);
                    this.field146 = false;
                }
                if (this.field98 == 118) {
                    var98 = this.field337.method446(895);
                    this.field337.method430(true);
                    int var100 = 0;
                    while (true) {
                        if (var100 >= 4) {
                            this.field337.method432(true);
                            var99 = this.field337.method422();
                            this.field146 = true;
                            break;
                        }
                        for (int var101 = 0; var101 < 13; ++var101) {
                            for (int var102 = 0; var102 < 13; ++var102) {
                                int var103 = this.field337.method431(1, this.field191);
                                if (var103 == 1) {
                                    this.field220[var100][var101][var102] = this.field337.method431(26, this.field191);
                                } else {
                                    this.field220[var100][var101][var102] = -1;
                                }
                            }
                        }
                        ++var100;
                    }
                }
                if (this.field84 == var98 && this.field85 == var99 && this.field307 == 2) {
                    this.field98 = -1;
                    return true;
                }
                this.field84 = var98;
                this.field85 = var99;
                this.field535 = (this.field84 - 6) * 8;
                this.field536 = (this.field85 - 6) * 8;
                this.field150 = false;
                if ((this.field84 / 8 == 48 || this.field84 / 8 == 49) && this.field85 / 8 == 48) {
                    this.field150 = true;
                }
                if (this.field84 / 8 == 48 && this.field85 / 8 == 148) {
                    this.field150 = true;
                }
                this.field307 = 1;
                this.field107 = System.currentTimeMillis();
                this.method135((String) null, -58, "Loading - please wait.");
                if (this.field98 == 150) {
                    int var104 = 0;
                    int var105 = (this.field84 - 6) / 8;
                    label1208: while (true) {
                        if (var105 > (this.field84 + 6) / 8) {
                            this.field196 = new byte[var104][];
                            this.field145 = new byte[var104][];
                            this.field301 = new int[var104];
                            this.field302 = new int[var104];
                            this.field303 = new int[var104];
                            int var107 = 0;
                            int var108 = (this.field84 - 6) / 8;
                            while (true) {
                                if (var108 > (this.field84 + 6) / 8) {
                                    break label1208;
                                }
                                for (int var109 = (this.field85 - 6) / 8; var109 <= (this.field85 + 6) / 8; ++var109) {
                                    this.field301[var107] = (var108 << 8) + var109;
                                    if (!this.field150 || var109 != 49 && var109 != 149 && var109 != 147 && var108 != 50 && (var108 != 49 || var109 != 47)) {
                                        int var110 = this.field302[var107] = this.field124.method228(var108, (byte) -121, var109, 0);
                                        if (var110 != -1) {
                                            this.field124.method230(3, var110);
                                        }
                                        int var111 = this.field303[var107] = this.field124.method228(var108, (byte) -121, var109, 1);
                                        if (var111 != -1) {
                                            this.field124.method230(3, var111);
                                        }
                                        ++var107;
                                    } else {
                                        this.field302[var107] = -1;
                                        this.field303[var107] = -1;
                                        ++var107;
                                    }
                                }
                                ++var108;
                            }
                        }
                        for (int var106 = (this.field85 - 6) / 8; var106 <= (this.field85 + 6) / 8; ++var106) {
                            ++var104;
                        }
                        ++var105;
                    }
                }
                if (this.field98 == 118) {
                    int var112 = 0;
                    int[] var113 = new int[676];
                    int var114 = 0;
                    label1167: while (true) {
                        if (var114 >= 4) {
                            this.field196 = new byte[var112][];
                            this.field145 = new byte[var112][];
                            this.field301 = new int[var112];
                            this.field302 = new int[var112];
                            this.field303 = new int[var112];
                            int var122 = 0;
                            while (true) {
                                if (var122 >= var112) {
                                    break label1167;
                                }
                                int var123 = this.field301[var122] = var113[var122];
                                int var124 = var123 >> 8 & 255;
                                int var125 = var123 & 255;
                                int var126 = this.field302[var122] = this.field124.method228(var124, (byte) -121, var125, 0);
                                if (var126 != -1) {
                                    this.field124.method230(3, var126);
                                }
                                int var127 = this.field303[var122] = this.field124.method228(var124, (byte) -121, var125, 1);
                                if (var127 != -1) {
                                    this.field124.method230(3, var127);
                                }
                                ++var122;
                            }
                        }
                        for (int var115 = 0; var115 < 13; ++var115) {
                            for (int var116 = 0; var116 < 13; ++var116) {
                                int var117 = this.field220[var114][var115][var116];
                                if (var117 != -1) {
                                    int var118 = var117 >> 14 & 1023;
                                    int var119 = var117 >> 3 & 2047;
                                    int var120 = (var118 / 8 << 8) + var119 / 8;
                                    for (int var121 = 0; var121 < var112; ++var121) {
                                        if (var113[var121] == var120) {
                                            var120 = -1;
                                            break;
                                        }
                                    }
                                    if (var120 != -1) {
                                        var113[var112++] = var120;
                                    }
                                }
                            }
                        }
                        ++var114;
                    }
                }
                int var128 = this.field535 - this.field537;
                int var129 = this.field536 - this.field538;
                this.field537 = this.field535;
                this.field538 = this.field536;
                for (int var130 = 0; var130 < 16384; ++var130) {
                    class17 var131 = this.field433[var130];
                    if (var131 != null) {
                        for (int var132 = 0; var132 < 10; ++var132) {
                            var131.field750[var132] -= var128;
                            var131.field751[var132] -= var129;
                        }
                        var131.field719 -= var128 * 128;
                        var131.field720 -= var129 * 128;
                    }
                }
                for (int var133 = 0; var133 < this.field308; ++var133) {
                    class69 var134 = this.field310[var133];
                    if (var134 != null) {
                        for (int var135 = 0; var135 < 10; ++var135) {
                            var134.field750[var135] -= var128;
                            var134.field751[var135] -= var129;
                        }
                        var134.field719 -= var128 * 128;
                        var134.field720 -= var129 * 128;
                    }
                }
                this.field526 = true;
                byte var136 = 0;
                byte var137 = 104;
                byte var138 = 1;
                if (var128 < 0) {
                    var136 = 103;
                    var137 = -1;
                    var138 = -1;
                }
                byte var139 = 0;
                byte var140 = 104;
                byte var141 = 1;
                if (var129 < 0) {
                    var139 = 103;
                    var140 = -1;
                    var141 = -1;
                }
                for (int var142 = var136; var137 != var142; var142 += var138) {
                    for (int var143 = var139; var140 != var143; var143 += var141) {
                        int var144 = var128 + var142;
                        int var145 = var129 + var143;
                        for (int var146 = 0; var146 < 4; ++var146) {
                            if (var144 >= 0 && var145 >= 0 && var144 < 104 && var145 < 104) {
                                this.field295[var146][var142][var143] = this.field295[var146][var144][var145];
                            } else {
                                this.field295[var146][var142][var143] = null;
                            }
                        }
                    }
                }
                for (class24 var147 = (class24) this.field214.method269(); var147 != null; var147 = (class24) this.field214.method271(15175)) {
                    var147.field921 -= var128;
                    var147.field922 -= var129;
                    if (var147.field921 < 0 || var147.field922 < 0 || var147.field921 >= 104 || var147.field922 >= 104) {
                        var147.method221();
                    }
                }
                if (this.field108 != 0) {
                    this.field108 -= var128;
                    this.field109 -= var129;
                }
                this.field229 = false;
                this.field98 = -1;
                return true;
            } catch (IOException var191) {
                this.method101(false);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field98 + "," + this.field542 + "," + this.field543 + " - " + this.field97 + "," + (field206.field750[0] + this.field535) + "," + (field206.field751[0] + this.field536) + " - ";
                for (int var189 = 0; var189 < this.field97 && var189 < 50; ++var189) {
                    var188 = var188 + this.field337.field1249[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method134(0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTTWFVYGB;IZI)V")
    public final void method203(class52 arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field200.method410(135);
        }
        int var5 = this.field521 + this.field135 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class43.field1341[var5];
            int var8 = class43.field1342[var5];
            int var9 = var7 * 256 / (this.field374 + 256);
            int var10 = var8 * 256 / (this.field374 + 256);
            int var11 = arg1 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg0.method517(83 - var12 - arg0.field1440 / 2 - 4, var11 + 94 - arg0.field1439 / 2 + 4, 864, this.field258);
            } else {
                arg0.method511(var11 + 94 - arg0.field1439 / 2 + 4, 83 - var12 - arg0.field1440 / 2 - 4, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILIYHIHFOL;)V")
    private final void method204(int arg0, class24 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field920 == 0) {
            var3 = this.field245.method338(arg1.field919, arg1.field921, arg1.field922);
        }
        if (arg1.field920 == 1) {
            var3 = this.field245.method339(arg1.field922, arg1.field921, arg1.field919, false);
        }
        if (arg1.field920 == 2) {
            var3 = this.field245.method340(arg1.field919, arg1.field921, arg1.field922);
        }
        if (arg1.field920 == 3) {
            var3 = this.field245.method341(arg1.field919, arg1.field921, arg1.field922);
        }
        if (var3 != 0) {
            int var7 = this.field245.method342(arg1.field919, arg1.field921, arg1.field922, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field916 = var4;
        arg1.field918 = var5;
        arg1.field917 = var6;
        if (arg0 != -20618) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method205(int arg0) {
        this.field506 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field531) {
                ++this.field429;
                this.method64(5);
                this.method64(5);
                this.method129(0);
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
        this.field506 = false;
        if (arg0 != 0) {
            this.field295 = null;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method206(byte arg0) {
        this.field200.method409((byte) -81, 70);
        if (arg0 != 72) {
            this.field213 = -188;
        }
        if (this.field395 != -1) {
            this.method200(field390, this.field395);
            this.field395 = -1;
            this.field361 = true;
            this.field425 = false;
            this.field410 = true;
        }
        if (this.field323 != -1) {
            this.method200(field390, this.field323);
            this.field323 = -1;
            this.field380 = true;
            this.field425 = false;
        }
        if (this.field451 != -1) {
            this.method200(field390, this.field451);
            this.field451 = -1;
            this.field332 = true;
        }
        if (this.field377 != -1) {
            this.method200(field390, this.field377);
            this.field377 = -1;
        }
        if (this.field318 != -1) {
            this.method200(field390, this.field318);
            this.field318 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)Z")
    public final boolean method207(int arg0) {
        if (arg0 != 9) {
            this.field200.method410(60);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method208(int arg0, int arg1) {
        int var3 = class70.field1719[arg1].field1727;
        if (var3 != 0) {
            int var4 = this.field373[arg1];
            if (arg0 < this.field539 || arg0 > this.field539) {
                this.field98 = -1;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class10.method253(-39806, 0.9D);
                }
                if (var4 == 2) {
                    class10.method253(-39806, 0.8D);
                }
                if (var4 == 3) {
                    class10.method253(-39806, 0.7D);
                }
                if (var4 == 4) {
                    class10.method253(-39806, 0.6D);
                }
                class22.field872.method601();
                this.field332 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field334;
                if (var4 == 0) {
                    this.method80(this.field334, 7, 0);
                    this.field334 = true;
                }
                if (var4 == 1) {
                    this.method80(this.field334, 7, -400);
                    this.field334 = true;
                }
                if (var4 == 2) {
                    this.method80(this.field334, 7, -800);
                    this.field334 = true;
                }
                if (var4 == 3) {
                    this.method80(this.field334, 7, -1200);
                    this.field334 = true;
                }
                if (var4 == 4) {
                    this.field334 = false;
                }
                if (this.field334 != var5 && !field128) {
                    if (this.field334) {
                        this.field242 = this.field530;
                        this.field243 = true;
                        this.field124.method230(2, this.field242);
                    } else {
                        this.method132(-958);
                    }
                    this.field221 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field479 = true;
                    this.method167((byte) 1, 0);
                }
                if (var4 == 1) {
                    this.field479 = true;
                    this.method167((byte) 1, -400);
                }
                if (var4 == 2) {
                    this.field479 = true;
                    this.method167((byte) 1, -800);
                }
                if (var4 == 3) {
                    this.field479 = true;
                    this.method167((byte) 1, -1200);
                }
                if (var4 == 4) {
                    this.field479 = false;
                }
            }
            if (var3 == 5) {
                this.field524 = var4;
            }
            if (var3 == 6) {
                this.field324 = var4;
            }
            if (var3 == 8) {
                this.field463 = var4;
                this.field380 = true;
            }
            if (var3 == 9) {
                this.field399 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field466.method371(arg5, arg4, false);
        this.field467.method371(arg5, arg3 + arg4 - 16, false);
        class67.method581(arg5, (byte) 109, this.field203, 16, arg3 - 32, arg4 + 16);
        int var7 = (arg3 - 32) * arg3 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg2 / (arg1 - arg3);
        class67.method581(arg5, (byte) 109, this.field484, 16, var7, arg4 + 16 + var8);
        class67.method586(-709, arg4 + 16 + var8, var7, arg5, this.field222);
        class67.method586(-709, arg4 + 16 + var8, var7, arg5 + 1, this.field222);
        class67.method584(0, this.field222, 16, arg4 + 16 + var8, arg5);
        this.field97 += arg0;
        class67.method584(0, this.field222, 16, arg4 + 17 + var8, arg5);
        class67.method586(-709, arg4 + 16 + var8, var7, arg5 + 15, this.field349);
        class67.method586(-709, arg4 + 17 + var8, var7 - 1, arg5 + 14, this.field349);
        class67.method584(0, this.field349, 16, arg4 + 15 + var8 + var7, arg5);
        class67.method584(0, this.field349, 15, arg4 + 14 + var8 + var7, arg5 + 1);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field113[var1] = var0 / 4;
        }
        field125 = 10;
        field127 = true;
        field132 = 27764;
        field164 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field190 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field205 = -100;
        field223 = 6;
        field225 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field225[var3] = var2 - 1;
            var2 += var2;
        }
        field228 = true;
        field378 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field390 = 7;
        field529 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
