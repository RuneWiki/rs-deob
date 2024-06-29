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
public class client extends class13 {

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    private int field56 = 3;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "B")
    private byte field57 = 1;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private int field58 = 128;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/lang/String;")
    private String field63 = "";

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[Ljava/lang/String;")
    private String[] field65 = new String[100];

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
    private int[] field66 = new int[100];

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
    private boolean field68 = false;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    private int field72 = 5063219;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
    private boolean field74 = false;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "LPACANLMY;")
    private class42 field75 = new class42(0);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field78 = 231;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
    private int[] field79 = new int[class56.field1449];

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    private boolean field89 = true;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "[LVZJVQLEE;")
    private class59[] field90 = new class59[32];

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[B")
    private byte[] field91 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "LLBBVYYXO;")
    private class32 field92 = class32.method357(-512, 1);

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Ljava/lang/String;")
    private String field93 = "";

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Ljava/lang/String;")
    private String field94 = "";

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "Z")
    private boolean field100 = true;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    private int field101 = 128;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "LPQPZKUPU;")
    private class44 field102 = new class44();

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
    private int field104 = 50;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
    private int[] field105 = new int[this.field104];

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "[I")
    private int[] field106 = new int[this.field104];

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "[I")
    private int[] field107 = new int[this.field104];

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
    private int[] field108 = new int[this.field104];

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
    private int[] field109 = new int[this.field104];

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
    private int[] field110 = new int[this.field104];

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
    private int[] field111 = new int[this.field104];

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "[Ljava/lang/String;")
    private String[] field112 = new String[this.field104];

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field114 = 2;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "B")
    private byte field115 = 4;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field122 = 7;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "[[I")
    private int[][] field123 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
    private int[] field125 = new int[151];

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
    private int field128 = -1;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
    private boolean field129 = false;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "Z")
    private boolean field137 = false;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
    private int field138 = -1;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field139 = -1;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
    private boolean field140 = false;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
    private boolean field141 = false;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field142 = 38046;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
    private int field147 = 2;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "Z")
    private boolean field148 = false;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "Z")
    public boolean field149 = true;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "[I")
    private int[] field152 = new int[33];

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
    private int[] field154 = new int[200];

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "[LVZJVQLEE;")
    private class59[] field155 = new class59[100];

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field157 = -1;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
    private final int field159 = 100;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
    private int[] field160 = new int[100];

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "Z")
    private boolean field167 = false;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
    private boolean field172 = false;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
    private boolean field173 = false;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private int field177 = 964;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
    private int[] field178 = new int[class56.field1449];

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
    private int field180 = -1;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field181 = -1;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
    private int[] field194 = new int[5];

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "B")
    private byte field195 = 41;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
    private boolean field197 = false;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "[[I")
    private int[][] field198 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int field205 = 2048;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field206 = 2047;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "[LSOKVSBIO;")
    private class51[] field207 = new class51[this.field205];

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
    public int[] field209 = new int[this.field205];

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
    private int[] field211 = new int[this.field205];

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "[LLBBVYYXO;")
    private class32[] field212 = new class32[this.field205];

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    private int field219 = 2301979;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int field229 = -659;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "Ljava/lang/String;")
    private String field231 = "";

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "[[[LPACANLMY;")
    private class42[][][] field235 = new class42[4][104][104];

    @OriginalMember(owner = "client!client", name = "je", descriptor = "B")
    private byte field236 = 7;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "[Ljava/lang/String;")
    private String[] field239 = new String[200];

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "[LVZJVQLEE;")
    private class59[] field240 = new class59[32];

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "Z")
    private volatile boolean field252 = false;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
    private int field253 = 3;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "[I")
    private int[] field254 = new int[500];

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
    private int[] field255 = new int[500];

    @OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
    private int[] field256 = new int[500];

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
    private int[] field257 = new int[500];

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    private int field259 = 1;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "I")
    private int field260 = -1;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field270 = 2;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "B")
    private byte field282 = 1;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
    private int[] field283 = new int[5];

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
    private int field288 = -1;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "Z")
    private boolean field291 = false;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "Z")
    private boolean field297 = false;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int field302 = -1;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field303 = -462;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "Ljava/lang/String;")
    private String field304 = "";

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
    private volatile boolean field306 = false;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
    private boolean field307 = false;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/lang/String;")
    private String field308 = "";

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "[LVZJVQLEE;")
    private class59[] field309 = new class59[8];

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
    private int field311 = -1;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
    private int[] field313 = new int[50];

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field315 = new CRC32();

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
    public boolean field318 = false;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "LPACANLMY;")
    private class42 field319 = new class42(0);

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
    private final int[] field321 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
    private int[] field324 = new int[class56.field1449];

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
    private int[] field325 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
    private int[] field326 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
    private int[] field328 = new int[5];

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
    private boolean field332 = false;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field333 = 493;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field334 = 3353893;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
    private boolean field336 = false;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "[LMACXPWDL;")
    public class35[] field337 = new class35[5];

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "LLBBVYYXO;")
    private class32 field339 = new class32((byte) 114, new byte[5000]);

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "[LSBPCMLRM;")
    private class49[] field340 = new class49[16384];

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "[I")
    public int[] field342 = new int[16384];

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "B")
    private byte field343 = 6;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
    private int[] field344 = new int[100];

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "[Ljava/lang/String;")
    private String[] field345 = new String[100];

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "[Ljava/lang/String;")
    private String[] field346 = new String[100];

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
    private int field347 = -1;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "B")
    private byte field348 = 0;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
    private int[] field349 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
    public int[] field350 = new int[2000];

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "B")
    private byte field352 = 9;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
    private int[] field353 = new int[2000];

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "[LZQSBFHWZ;")
    private class69[] field354 = new class69[2];

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private int field355 = -644;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "[LVZJVQLEE;")
    private class59[] field357 = new class59[32];

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
    private int field359 = -39349;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field360 = 78;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "LPACANLMY;")
    private class42 field363 = new class42(0);

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
    private boolean field366 = false;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field368 = -1;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "B")
    private byte field369 = -119;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "[J")
    private long[] field370 = new long[100];

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "[I")
    private int[] field371 = new int[256];

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "[[I")
    private int[][] field372 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
    private int[] field374 = new int[33];

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "Z")
    private boolean field375 = true;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "B")
    private byte field376 = -119;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "[LZQSBFHWZ;")
    private class69[] field379 = new class69[100];

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "[LZQSBFHWZ;")
    private class69[] field380 = new class69[13];

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "[Ljava/lang/String;")
    private String[] field389 = new String[5];

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "[Z")
    private boolean[] field390 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
    private boolean field391 = false;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "Z")
    private boolean field393 = true;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "Z")
    private boolean field394 = true;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
    private int[] field396 = new int[9];

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
    private int[] field398 = new int[50];

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
    private int field399 = -1;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
    private int[] field404 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
    private int[] field405 = new int[7];

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "Ljava/lang/String;")
    private String field407 = "";

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
    private boolean field410 = false;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "[Z")
    private boolean[] field414 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
    private boolean field420 = false;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "Z")
    private volatile boolean field424 = false;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
    private boolean field425 = false;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "B")
    private byte field426 = 5;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "B")
    private byte field427 = 8;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
    private int[] field437 = new int[50];

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "Ljava/lang/String;")
    private String field438 = "";

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field445 = -1;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "[Ljava/lang/String;")
    private String[] field447 = new String[500];

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
    private boolean field449 = false;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "Ljava/lang/String;")
    private String field450 = "";

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "Ljava/lang/String;")
    private String field451 = "";

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "Z")
    private boolean field453 = true;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
    private int field454 = -1;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "[J")
    private long[] field457 = new long[200];

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
    private int[] field460 = new int[5];

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "LLBBVYYXO;")
    private class32 field461 = class32.method357(-512, 1);

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "B")
    private byte field462 = 7;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "[LVZJVQLEE;")
    private class59[] field467 = new class59[1000];

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field471 = 2;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
    private int field472 = 105;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
    private int[] field477 = new int[5];

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
    private int field478 = 3169;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
    public int[] field479 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "Z")
    private boolean field488 = true;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "Z")
    private boolean field492 = false;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "[[[I")
    private int[][][] field497 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
    private int field498 = 7;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int field499 = 7759444;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "Z")
    private boolean field506 = false;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
    private boolean field507 = false;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "B")
    private byte field513 = 3;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "[LCRVZDSLK;")
    private class5[] field520 = new class5[4];

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "[I")
    private int[] field527 = new int[151];

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "Z")
    private boolean field528 = false;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field530 = 1;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "Z")
    private boolean field532 = true;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
    public int[] field534 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "Z")
    private boolean field536 = false;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "[I")
    private int[] field538 = new int[1000];

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
    private int[] field539 = new int[1000];

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
    private int field541 = -347;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field542 = -1;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "B")
    private byte field543 = 1;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "[LVZJVQLEE;")
    private class59[] field545 = new class59[20];

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "LLBBVYYXO;")
    private class32 field546 = class32.method357(-512, 1);

    @OriginalMember(owner = "client!client", name = "qk", descriptor = "Z")
    private boolean field554 = false;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "B")
    private static byte field130 = 3;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "[[I")
    public static final int[][] field151 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private static int field153 = 38046;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
    private static int field161 = -597;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private static int field215 = 10;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
    private static boolean field217 = true;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "B")
    private static byte field230 = 91;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "B")
    private static byte field289 = 4;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field298 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
    public static final int[] field299 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
    private static int[] field301 = new int[99];

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "B")
    private static byte field351;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
    private static boolean field468;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private static int field502;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field525;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "Ljava/lang/String;")
    private static String field535;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "[I")
    public static int[] field544;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private static int field121;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
    private static int field175;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private static int field192;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private static int field225;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private static int field261;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
    private static int field264;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private static int field281;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
    private static int field294;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private static int field322;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
    private static int field338;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
    private static int field383;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
    private static int field446;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private static int field452;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private static int field458;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    private static int field489;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private static int field510;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
    private static int field526;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!client", name = "ok", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "pk", descriptor = "I")
    private static int field553;

    @OriginalMember(owner = "client!client", name = "rk", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!client", name = "sk", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!client", name = "tk", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!client", name = "uk", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!client", name = "vk", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!client", name = "wk", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    private int field61;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    private static int field69;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    private static int field70;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    private static int field71;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    private int field81;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private int field85;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "J")
    private long field127;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "J")
    private long field150;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "J")
    public long field310;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "J")
    private long field494;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "J")
    private long field509;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "LEBLTOQBO;")
    private class12 field82;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "LFDKYSOCX;")
    public class17 field439;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "LFUZJMGZB;")
    private class19 field500;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "LGBBCHPEB;")
    private class20 field314;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "LHURULSIZ;")
    private class25 field241;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "LHURULSIZ;")
    private class25 field242;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "LHURULSIZ;")
    private class25 field243;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "LHURULSIZ;")
    private class25 field244;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "LHURULSIZ;")
    private class25 field245;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "LHURULSIZ;")
    private class25 field246;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "LHURULSIZ;")
    private class25 field247;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "LHURULSIZ;")
    private class25 field248;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "LHURULSIZ;")
    private class25 field249;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "LHURULSIZ;")
    private class25 field428;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "LHURULSIZ;")
    private class25 field429;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "LHURULSIZ;")
    private class25 field430;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "LHURULSIZ;")
    private class25 field431;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "LHURULSIZ;")
    private class25 field432;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "LHURULSIZ;")
    private class25 field433;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "LHURULSIZ;")
    private class25 field434;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "LHURULSIZ;")
    private class25 field435;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "LHURULSIZ;")
    private class25 field436;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "LHURULSIZ;")
    private class25 field463;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "LHURULSIZ;")
    private class25 field464;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "LHURULSIZ;")
    private class25 field465;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "LHURULSIZ;")
    private class25 field466;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "LHURULSIZ;")
    private class25 field503;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "LHURULSIZ;")
    private class25 field504;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "LHURULSIZ;")
    private class25 field505;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "LNIUUCTKL;")
    private class36 field232;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "LRHXAQRFP;")
    private class48 field176;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "LSOKVSBIO;")
    public static class51 field124;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "LVZJVQLEE;")
    private class59 field196;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "LVZJVQLEE;")
    private class59 field223;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "LVZJVQLEE;")
    private class59 field250;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "LVZJVQLEE;")
    private class59 field251;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "LVZJVQLEE;")
    private class59 field266;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "LVZJVQLEE;")
    private class59 field364;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "LVZJVQLEE;")
    private class59 field365;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "LVZJVQLEE;")
    private class59 field382;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "LVZJVQLEE;")
    private class59 field415;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "LVZJVQLEE;")
    private class59 field416;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "LVZJVQLEE;")
    private class59 field417;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "LVZJVQLEE;")
    private class59 field418;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "LVZJVQLEE;")
    private class59 field419;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "LVZJVQLEE;")
    private class59 field490;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "LVZJVQLEE;")
    private class59 field491;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "LZQSBFHWZ;")
    private class69 field118;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "LZQSBFHWZ;")
    private class69 field119;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "LZQSBFHWZ;")
    private class69 field271;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "LZQSBFHWZ;")
    private class69 field272;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "LZQSBFHWZ;")
    private class69 field273;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "LZQSBFHWZ;")
    private class69 field292;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "LZQSBFHWZ;")
    private class69 field293;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "LZQSBFHWZ;")
    private class69 field411;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "LZQSBFHWZ;")
    private class69 field412;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "LZQSBFHWZ;")
    private class69 field413;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "LZQSBFHWZ;")
    private class69 field480;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "LZQSBFHWZ;")
    private class69 field481;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "LZQSBFHWZ;")
    private class69 field482;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "LZQSBFHWZ;")
    private class69 field483;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "LZQSBFHWZ;")
    private class69 field484;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "LZQSBFHWZ;")
    private class69 field95;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "LZQSBFHWZ;")
    private class69 field96;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "LZQSBFHWZ;")
    private class69 field97;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "LZQSBFHWZ;")
    private class69 field98;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "LZQSBFHWZ;")
    private class69 field99;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "LZTYSAOXK;")
    private class71 field473;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "LZTYSAOXK;")
    private class71 field474;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "LZTYSAOXK;")
    private class71 field475;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "LZTYSAOXK;")
    private class71 field476;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "Ljava/lang/String;")
    private String field131;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "Ljava/lang/String;")
    public String field186;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "Ljava/lang/String;")
    public String field190;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "Ljava/lang/String;")
    private String field300;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "Ljava/net/Socket;")
    private Socket field227;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "Z")
    private static boolean field218;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "Z")
    public static boolean field296;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
    private static boolean field448;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "Z")
    public static boolean field495;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
    private int[] field133;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
    private int[] field134;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
    private int[] field135;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "[I")
    private int[] field136;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "[I")
    private int[] field267;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
    private int[] field268;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "[I")
    private int[] field316;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
    private int[] field317;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
    private int[] field516;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
    private int[] field517;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
    private int[] field518;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
    private int[] field519;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
    private int[] field521;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "[I")
    private int[] field522;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "[I")
    private int[] field523;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "[LZQSBFHWZ;")
    private class69[] field512;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "[[B")
    private byte[][] field381;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "[[B")
    private byte[][] field487;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "[[[B")
    private byte[][][] field156;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[[[I")
    private int[][][] field87;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method10(String arg0) throws IOException {
        if (!this.field506) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field227 != null) {
                try {
                    this.field227.close();
                } catch (Exception var4) {
                }
                this.field227 = null;
            }
            this.field227 = this.method131(43595);
            this.field227.setSoTimeout(10000);
            InputStream var2 = this.field227.getInputStream();
            OutputStream var3 = this.field227.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method11(byte arg0) {
        this.field306 = false;
        while (this.field252) {
            this.field306 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field292 = null;
        this.field293 = null;
        this.field512 = null;
        this.field133 = null;
        this.field134 = null;
        this.field135 = null;
        this.field136 = null;
        this.field267 = null;
        this.field268 = null;
        if (arg0 != 3) {
            this.field100 = !this.field100;
        }
        this.field316 = null;
        this.field317 = null;
        this.field490 = null;
        this.field491 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method12(String arg0, byte arg1) {
        if (arg1 != 9) {
            this.field92.method359(161);
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field400; ++var3) {
                if (arg0.equalsIgnoreCase(this.field239[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field124.field1423);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method13(byte arg0) {
        if (arg0 != 38) {
            this.method113();
        }
        this.field292 = new class69(this.field500, "titlebox", 0);
        this.field293 = new class69(this.field500, "titlebutton", 0);
        this.field512 = new class69[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field512[var2] = new class69(this.field500, "runes", var2);
        }
        this.field490 = new class59(128, 265);
        this.field491 = new class59(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field490.field1492[var3] = this.field244.field965[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field491.field1492[var4] = this.field245.field965[var4];
        }
        this.field134 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field134[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field134[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field134[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field134[var8 + 192] = 16777215;
        }
        this.field135 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field135[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field135[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field135[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field135[var12 + 192] = 16777215;
        }
        this.field136 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field136[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field136[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field136[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field136[var16 + 192] = 16777215;
        }
        this.field133 = new int[256];
        this.field267 = new int[32768];
        this.field268 = new int[32768];
        this.method104((class69) null, 0);
        this.field316 = new int[32768];
        this.field317 = new int[32768];
        this.method51(10, "Connecting to fileserver", -71);
        if (!this.field306) {
            this.field424 = true;
            this.field306 = true;
            this.method58(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method14(int arg0) {
        this.field92.method358(7793, 22);
        if (arg0 != 0) {
            this.field200 = this.field546.method369();
        }
        if (this.field445 != -1) {
            this.method154(3, this.field445);
            this.field445 = -1;
            this.field554 = true;
            this.field291 = false;
            this.field148 = true;
        }
        if (this.field368 != -1) {
            this.method154(3, this.field368);
            this.field368 = -1;
            this.field528 = true;
            this.field291 = false;
        }
        if (this.field139 != -1) {
            this.method154(3, this.field139);
            this.field139 = -1;
            this.field74 = true;
        }
        if (this.field128 != -1) {
            this.method154(3, this.field128);
            this.field128 = -1;
        }
        if (this.field542 != -1) {
            this.method154(3, this.field542);
            this.field542 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method15(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field316[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field316[var17] = 192;
        }
        if (arg0 < 5 || arg0 > 5) {
            this.field92.method359(161);
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field317[var14] = (this.field316[var14 - 1] + this.field316[var14 + 1] + this.field316[var14 - 128] + this.field316[var14 + 128]) / 4;
            }
        }
        this.field547 += 128;
        if (this.field547 > this.field267.length) {
            this.field547 -= this.field267.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method104(this.field512[var6], 0);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field317[var11 + 128] - this.field267[this.field547 + var11 & this.field267.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field316[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field371[var8] = this.field371[var8 + 1];
        }
        this.field371[var2 - 1] = (int) (Math.sin((double) field174 / 14.0D) * 16.0D + Math.sin((double) field174 / 15.0D) * 14.0D + Math.sin((double) field174 / 16.0D) * 12.0D);
        if (this.field514 > 0) {
            this.field514 -= 4;
        }
        if (this.field515 > 0) {
            this.field515 -= 4;
        }
        if (this.field514 == 0 && this.field515 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field514 = 1024;
            }
            if (var9 == 1) {
                this.field515 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method16(int arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg1 - arg0;
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

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        for (int var2 = 0; var2 < this.field341; ++var2) {
            int var3 = this.field342[var2];
            class49 var4 = this.field340[var3];
            if (var4 != null) {
                this.method18(var4.field1402.field1597, true, var4);
            }
        }
        if (!arg0) {
            this.field177 = 429;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLNQXGETKS;)V")
    public final void method18(int arg0, boolean arg1, class37 arg2) {
        if (!arg1) {
            this.method113();
        }
        if (arg2.field1134 < 128 || arg2.field1135 < 128 || arg2.field1134 >= 13184 || arg2.field1135 >= 13184) {
            arg2.field1173 = -1;
            arg2.field1126 = -1;
            arg2.field1170 = 0;
            arg2.field1171 = 0;
            arg2.field1134 = arg2.field1132[0] * 128 + arg2.field1149 * 64;
            arg2.field1135 = arg2.field1133[0] * 128 + arg2.field1149 * 64;
            arg2.method427(this.field236);
        }
        if (field124 == arg2 && (arg2.field1134 < 1536 || arg2.field1135 < 1536 || arg2.field1134 >= 11776 || arg2.field1135 >= 11776)) {
            arg2.field1173 = -1;
            arg2.field1126 = -1;
            arg2.field1170 = 0;
            arg2.field1171 = 0;
            arg2.field1134 = arg2.field1132[0] * 128 + arg2.field1149 * 64;
            arg2.field1135 = arg2.field1133[0] * 128 + arg2.field1149 * 64;
            arg2.method427(this.field236);
        }
        if (arg2.field1170 > field174) {
            this.method19((byte) -23, arg2);
        } else if (arg2.field1171 >= field174) {
            this.method20(arg2, 924);
        } else {
            this.method21(arg2, this.field140);
        }
        this.method22(arg2, 0);
        this.method23(-530, arg2);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLNQXGETKS;)V")
    public final void method19(byte arg0, class37 arg1) {
        int var3 = arg1.field1170 - field174;
        int var4 = arg1.field1166 * 128 + arg1.field1149 * 64;
        int var5 = arg1.field1168 * 128 + arg1.field1149 * 64;
        arg1.field1134 += (var4 - arg1.field1134) / var3;
        arg1.field1135 += (var5 - arg1.field1135) / var3;
        if (arg0 != -23) {
            this.method113();
        }
        arg1.field1158 = 0;
        if (arg1.field1172 == 0) {
            arg1.field1148 = 1024;
        }
        if (arg1.field1172 == 1) {
            arg1.field1148 = 1536;
        }
        if (arg1.field1172 == 2) {
            arg1.field1148 = 0;
        }
        if (arg1.field1172 == 3) {
            arg1.field1148 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNQXGETKS;I)V")
    public final void method20(class37 arg0, int arg1) {
        if (field174 == arg0.field1171 || arg0.field1173 == -1 || arg0.field1176 != 0 || arg0.field1175 + 1 > class15.field837[arg0.field1173].method252(arg0.field1174, -26977)) {
            int var3 = arg0.field1171 - arg0.field1170;
            int var4 = field174 - arg0.field1170;
            int var5 = arg0.field1166 * 128 + arg0.field1149 * 64;
            int var6 = arg0.field1168 * 128 + arg0.field1149 * 64;
            int var7 = arg0.field1167 * 128 + arg0.field1149 * 64;
            int var8 = arg0.field1169 * 128 + arg0.field1149 * 64;
            arg0.field1134 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1135 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1158 = 0;
        if (arg1 <= 0) {
            this.field235 = null;
        }
        if (arg0.field1172 == 0) {
            arg0.field1148 = 1024;
        }
        if (arg0.field1172 == 1) {
            arg0.field1148 = 1536;
        }
        if (arg0.field1172 == 2) {
            arg0.field1148 = 0;
        }
        if (arg0.field1172 == 3) {
            arg0.field1148 = 512;
        }
        arg0.field1136 = arg0.field1148;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNQXGETKS;Z)V")
    public final void method21(class37 arg0, boolean arg1) {
        arg0.field1160 = arg0.field1146;
        if (arg0.field1156 == 0) {
            arg0.field1158 = 0;
        } else {
            if (arg0.field1173 != -1 && arg0.field1176 == 0) {
                class15 var3 = class15.field837[arg0.field1173];
                if (arg0.field1137 > 0 && var3.field849 == 0) {
                    ++arg0.field1158;
                    return;
                }
                if (arg0.field1137 <= 0 && var3.field850 == 0) {
                    ++arg0.field1158;
                    return;
                }
            }
            int var4 = arg0.field1134;
            int var5 = arg0.field1135;
            int var6 = arg0.field1132[arg0.field1156 - 1] * 128 + arg0.field1149 * 64;
            int var7 = arg0.field1133[arg0.field1156 - 1] * 128 + arg0.field1149 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1148 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1148 = 1792;
                    } else {
                        arg0.field1148 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1148 = 768;
                    } else if (var5 > var7) {
                        arg0.field1148 = 256;
                    } else {
                        arg0.field1148 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1148 = 1024;
                } else {
                    arg0.field1148 = 0;
                }
                int var8 = arg0.field1148 - arg0.field1136 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1139;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1138;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1141;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1140;
                }
                if (var9 == -1) {
                    var9 = arg0.field1138;
                }
                arg0.field1160 = var9;
                int var10 = 4;
                if (arg1) {
                    for (int var11 = 1; var11 > 0; ++var11) {
                    }
                }
                if (arg0.field1148 != arg0.field1136 && arg0.field1165 == -1 && arg0.field1159 != 0) {
                    var10 = 2;
                }
                if (arg0.field1156 > 2) {
                    var10 = 6;
                }
                if (arg0.field1156 > 3) {
                    var10 = 8;
                }
                if (arg0.field1158 > 0 && arg0.field1156 > 1) {
                    var10 = 8;
                    --arg0.field1158;
                }
                if (arg0.field1145[arg0.field1156 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1160 == arg0.field1138 && arg0.field1157 != -1) {
                    arg0.field1160 = arg0.field1157;
                }
                if (var4 < var6) {
                    arg0.field1134 += var10;
                    if (arg0.field1134 > var6) {
                        arg0.field1134 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1134 -= var10;
                    if (arg0.field1134 < var6) {
                        arg0.field1134 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1135 += var10;
                    if (arg0.field1135 > var7) {
                        arg0.field1135 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1135 -= var10;
                    if (arg0.field1135 < var7) {
                        arg0.field1135 = var7;
                    }
                }
                if (arg0.field1134 == var6 && arg0.field1135 == var7) {
                    --arg0.field1156;
                    if (arg0.field1137 > 0) {
                        --arg0.field1137;
                        return;
                    }
                }
            } else {
                arg0.field1134 = var6;
                arg0.field1135 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LNQXGETKS;I)V")
    public final void method22(class37 arg0, int arg1) {
        if (arg1 == 0) {
            if (arg0.field1159 != 0) {
                if (arg0.field1165 != -1 && arg0.field1165 < 32768) {
                    class49 var3 = this.field340[arg0.field1165];
                    if (var3 != null) {
                        int var4 = arg0.field1134 - var3.field1134;
                        int var5 = arg0.field1135 - var3.field1135;
                        if (var4 != 0 || var5 != 0) {
                            arg0.field1148 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                        }
                    }
                }
                if (arg0.field1165 >= 32768) {
                    int var6 = arg0.field1165 - 32768;
                    if (this.field454 == var6) {
                        var6 = this.field206;
                    }
                    class51 var7 = this.field207[var6];
                    if (var7 != null) {
                        int var8 = arg0.field1134 - var7.field1134;
                        int var9 = arg0.field1135 - var7.field1135;
                        if (var8 != 0 || var9 != 0) {
                            arg0.field1148 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg0.field1152 != 0 || arg0.field1153 != 0) && (arg0.field1156 == 0 || arg0.field1158 > 0)) {
                    int var10 = arg0.field1134 - (arg0.field1152 - this.field168 - this.field168) * 64;
                    int var11 = arg0.field1135 - (arg0.field1153 - this.field169 - this.field169) * 64;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field1148 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                    }
                    arg0.field1152 = 0;
                    arg0.field1153 = 0;
                }
                int var12 = arg0.field1148 - arg0.field1136 & 2047;
                if (var12 != 0) {
                    if (var12 >= arg0.field1159 && var12 <= 2048 - arg0.field1159) {
                        if (var12 > 1024) {
                            arg0.field1136 -= arg0.field1159;
                        } else {
                            arg0.field1136 += arg0.field1159;
                        }
                    } else {
                        arg0.field1136 = arg0.field1148;
                    }
                    arg0.field1136 &= 2047;
                    if (arg0.field1160 == arg0.field1146 && arg0.field1148 != arg0.field1136) {
                        if (arg0.field1147 != -1) {
                            arg0.field1160 = arg0.field1147;
                            return;
                        }
                        arg0.field1160 = arg0.field1138;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILNQXGETKS;)V")
    public final void method23(int arg0, class37 arg1) {
        while (arg0 >= 0) {
            this.field229 = 287;
        }
        arg1.field1163 = false;
        if (arg1.field1160 != -1) {
            class15 var3 = class15.field837[arg1.field1160];
            ++arg1.field1162;
            if (arg1.field1161 < var3.field838 && arg1.field1162 > var3.method252(arg1.field1161, -26977)) {
                arg1.field1162 = 0;
                ++arg1.field1161;
            }
            if (arg1.field1161 >= var3.field838) {
                arg1.field1162 = 0;
                arg1.field1161 = 0;
            }
        }
        if (arg1.field1126 != -1 && field174 >= arg1.field1129) {
            if (arg1.field1127 < 0) {
                arg1.field1127 = 0;
            }
            class15 var4 = class4.field43[arg1.field1126].field47;
            ++arg1.field1128;
            while (arg1.field1127 < var4.field838 && arg1.field1128 > var4.method252(arg1.field1127, -26977)) {
                arg1.field1128 -= var4.method252(arg1.field1127, -26977);
                ++arg1.field1127;
            }
            if (arg1.field1127 >= var4.field838 && (arg1.field1127 < 0 || arg1.field1127 >= var4.field838)) {
                arg1.field1126 = -1;
            }
        }
        if (arg1.field1173 != -1 && arg1.field1176 <= 1) {
            class15 var5 = class15.field837[arg1.field1173];
            if (var5.field849 == 1 && arg1.field1137 > 0 && arg1.field1170 <= field174 && arg1.field1171 < field174) {
                arg1.field1176 = 1;
                return;
            }
        }
        if (arg1.field1173 != -1 && arg1.field1176 == 0) {
            class15 var6 = class15.field837[arg1.field1173];
            ++arg1.field1175;
            while (arg1.field1174 < var6.field838 && arg1.field1175 > var6.method252(arg1.field1174, -26977)) {
                arg1.field1175 -= var6.method252(arg1.field1174, -26977);
                ++arg1.field1174;
            }
            if (arg1.field1174 >= var6.field838) {
                arg1.field1174 -= var6.field842;
                ++arg1.field1177;
                if (arg1.field1177 >= var6.field848) {
                    arg1.field1173 = -1;
                }
                if (arg1.field1174 < 0 || arg1.field1174 >= var6.field838) {
                    arg1.field1173 = -1;
                }
            }
            arg1.field1163 = var6.field844;
        }
        if (arg1.field1176 > 0) {
            --arg1.field1176;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            this.method113();
        }
        if (this.field139 == -1 || this.field290 != 2 && super.field796 == null) {
            if (this.field74) {
                this.method149(7);
                this.field74 = false;
                this.field428.method299(super.field795, 0, 0, 4);
                this.field429.method299(super.field795, 0, 0, 357);
                this.field430.method299(super.field795, 722, 0, 4);
                this.field431.method299(super.field795, 743, 0, 205);
                this.field432.method299(super.field795, 0, 0, 0);
                this.field433.method299(super.field795, 516, 0, 4);
                this.field434.method299(super.field795, 516, 0, 205);
                this.field435.method299(super.field795, 496, 0, 357);
                this.field436.method299(super.field795, 0, 0, 338);
                this.field554 = true;
                this.field528 = true;
                this.field148 = true;
                this.field141 = true;
                if (this.field290 != 2) {
                    this.field465.method299(super.field795, 4, 0, 4);
                    this.field464.method299(super.field795, 550, 0, 4);
                }
            }
            if (this.field290 == 2) {
                this.method80(this.field376);
            }
            if (this.field507 && this.field162 == 1) {
                this.field554 = true;
            }
            if (this.field445 != -1) {
                boolean var4 = this.method27(this.field445, this.field116, (byte) 5);
                if (var4) {
                    this.field554 = true;
                }
            }
            if (this.field287 == 2) {
                this.field554 = true;
            }
            if (this.field550 == 2) {
                this.field554 = true;
            }
            if (this.field554) {
                this.method136(-409);
                this.field554 = false;
            }
            if (this.field368 == -1 && this.field62 == 0) {
                this.field102.field1304 = this.field360 - this.field358 - 77;
                if (super.field803 > 448 && super.field803 < 560 && super.field804 > 332) {
                    this.method124(super.field804 - 357, super.field803 - 17, this.field102, this.field360, 77, (byte) 110, -1, 463, 0);
                }
                int var5 = this.field360 - 77 - this.field102.field1304;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field360 - 77) {
                    var5 = this.field360 - 77;
                }
                if (this.field358 != var5) {
                    this.field358 = var5;
                    this.field528 = true;
                }
            }
            if (this.field368 == -1 && this.field62 == 3) {
                int var6 = this.field64 * 14 + 7;
                this.field102.field1304 = this.field67;
                if (super.field803 > 448 && super.field803 < 560 && super.field804 > 332) {
                    this.method124(super.field804 - 357, super.field803 - 17, this.field102, var6, 77, (byte) 110, -1, 463, 0);
                }
                int var7 = this.field102.field1304;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field67 != var7) {
                    this.field67 = var7;
                    this.field528 = true;
                }
            }
            if (this.field368 != -1) {
                boolean var8 = this.method27(this.field368, this.field116, (byte) 5);
                if (var8) {
                    this.field528 = true;
                }
            }
            if (this.field287 == 3) {
                this.field528 = true;
            }
            if (this.field550 == 3) {
                this.field528 = true;
            }
            if (this.field131 != null) {
                this.field528 = true;
            }
            if (this.field507 && this.field162 == 2) {
                this.field528 = true;
            }
            if (this.field528) {
                this.method52(this.field449);
                this.field528 = false;
            }
            if (this.field290 == 2) {
                this.method105(-604);
                this.field464.method299(super.field795, 550, 0, 4);
            }
            if (this.field157 != -1) {
                this.field148 = true;
            }
            if (this.field148) {
                if (this.field157 != -1 && this.field253 == this.field157) {
                    this.field157 = -1;
                    this.field92.method358(7793, 170);
                    this.field92.method359(this.field253);
                }
                this.field148 = false;
                this.field505.method298(0);
                this.field273.method586(-4899, 0, 0);
                if (this.field445 == -1) {
                    if (this.field349[this.field253] != -1) {
                        if (this.field253 == 0) {
                            this.field480.method586(-4899, 22, 10);
                        }
                        if (this.field253 == 1) {
                            this.field481.method586(-4899, 54, 8);
                        }
                        if (this.field253 == 2) {
                            this.field481.method586(-4899, 82, 8);
                        }
                        if (this.field253 == 3) {
                            this.field482.method586(-4899, 110, 8);
                        }
                        if (this.field253 == 4) {
                            this.field484.method586(-4899, 153, 8);
                        }
                        if (this.field253 == 5) {
                            this.field484.method586(-4899, 181, 8);
                        }
                        if (this.field253 == 6) {
                            this.field483.method586(-4899, 209, 9);
                        }
                    }
                    if (this.field349[0] != -1 && (this.field157 != 0 || field174 % 20 < 10)) {
                        this.field380[0].method586(-4899, 29, 13);
                    }
                    if (this.field349[1] != -1 && (this.field157 != 1 || field174 % 20 < 10)) {
                        this.field380[1].method586(-4899, 53, 11);
                    }
                    if (this.field349[2] != -1 && (this.field157 != 2 || field174 % 20 < 10)) {
                        this.field380[2].method586(-4899, 82, 11);
                    }
                    if (this.field349[3] != -1 && (this.field157 != 3 || field174 % 20 < 10)) {
                        this.field380[3].method586(-4899, 115, 12);
                    }
                    if (this.field349[4] != -1 && (this.field157 != 4 || field174 % 20 < 10)) {
                        this.field380[4].method586(-4899, 153, 13);
                    }
                    if (this.field349[5] != -1 && (this.field157 != 5 || field174 % 20 < 10)) {
                        this.field380[5].method586(-4899, 180, 11);
                    }
                    if (this.field349[6] != -1 && (this.field157 != 6 || field174 % 20 < 10)) {
                        this.field380[6].method586(-4899, 208, 13);
                    }
                }
                this.field505.method299(super.field795, 516, 0, 160);
                this.field504.method298(0);
                this.field272.method586(-4899, 0, 0);
                if (this.field445 == -1) {
                    if (this.field349[this.field253] != -1) {
                        if (this.field253 == 7) {
                            this.field95.method586(-4899, 42, 0);
                        }
                        if (this.field253 == 8) {
                            this.field96.method586(-4899, 74, 0);
                        }
                        if (this.field253 == 9) {
                            this.field96.method586(-4899, 102, 0);
                        }
                        if (this.field253 == 10) {
                            this.field97.method586(-4899, 130, 1);
                        }
                        if (this.field253 == 11) {
                            this.field99.method586(-4899, 173, 0);
                        }
                        if (this.field253 == 12) {
                            this.field99.method586(-4899, 201, 0);
                        }
                        if (this.field253 == 13) {
                            this.field98.method586(-4899, 229, 0);
                        }
                    }
                    if (this.field349[8] != -1 && (this.field157 != 8 || field174 % 20 < 10)) {
                        this.field380[7].method586(-4899, 74, 2);
                    }
                    if (this.field349[9] != -1 && (this.field157 != 9 || field174 % 20 < 10)) {
                        this.field380[8].method586(-4899, 102, 3);
                    }
                    if (this.field349[10] != -1 && (this.field157 != 10 || field174 % 20 < 10)) {
                        this.field380[9].method586(-4899, 137, 4);
                    }
                    if (this.field349[11] != -1 && (this.field157 != 11 || field174 % 20 < 10)) {
                        this.field380[10].method586(-4899, 174, 2);
                    }
                    if (this.field349[12] != -1 && (this.field157 != 12 || field174 % 20 < 10)) {
                        this.field380[11].method586(-4899, 201, 2);
                    }
                    if (this.field349[13] != -1 && (this.field157 != 13 || field174 % 20 < 10)) {
                        this.field380[12].method586(-4899, 226, 2);
                    }
                }
                this.field504.method299(super.field795, 496, 0, 466);
                this.field465.method298(0);
                class6.field589 = this.field518;
            }
            if (this.field141) {
                this.field141 = false;
                this.field503.method298(0);
                this.field271.method586(-4899, 0, 0);
                this.field474.method590(true, "Public chat", this.field352, 16777215, 28, 55);
                if (this.field234 == 0) {
                    this.field474.method590(true, "On", this.field352, 65280, 41, 55);
                }
                if (this.field234 == 1) {
                    this.field474.method590(true, "Friends", this.field352, 16776960, 41, 55);
                }
                if (this.field234 == 2) {
                    this.field474.method590(true, "Off", this.field352, 16711680, 41, 55);
                }
                if (this.field234 == 3) {
                    this.field474.method590(true, "Hide", this.field352, 65535, 41, 55);
                }
                this.field474.method590(true, "Private chat", this.field352, 16777215, 28, 184);
                if (this.field88 == 0) {
                    this.field474.method590(true, "On", this.field352, 65280, 41, 184);
                }
                if (this.field88 == 1) {
                    this.field474.method590(true, "Friends", this.field352, 16776960, 41, 184);
                }
                if (this.field88 == 2) {
                    this.field474.method590(true, "Off", this.field352, 16711680, 41, 184);
                }
                this.field474.method590(true, "Trade/compete", this.field352, 16777215, 28, 324);
                if (this.field76 == 0) {
                    this.field474.method590(true, "On", this.field352, 65280, 41, 324);
                }
                if (this.field76 == 1) {
                    this.field474.method590(true, "Friends", this.field352, 16776960, 41, 324);
                }
                if (this.field76 == 2) {
                    this.field474.method590(true, "Off", this.field352, 16711680, 41, 324);
                }
                this.field474.method590(true, "Report abuse", this.field352, 16777215, 33, 458);
                this.field503.method299(super.field795, 0, 0, 453);
                this.field465.method298(0);
                class6.field589 = this.field518;
            }
            this.field116 = 0;
        } else {
            if (this.field290 == 2) {
                this.method27(this.field139, this.field116, (byte) 5);
                if (this.field128 != -1) {
                    this.method27(this.field128, this.field116, (byte) 5);
                }
                this.field116 = 0;
                this.method77(false);
                super.field796.method298(0);
                class6.field589 = this.field519;
                class21.method287(true);
                this.field74 = true;
                class44 var2 = class44.method460(this.field139);
                if (var2.field1299 == 512 && var2.field1296 == 334 && var2.field1279 == 0) {
                    var2.field1299 = 765;
                    var2.field1296 = 503;
                }
                this.method35(0, 0, var2, -545, 0);
                if (this.field128 != -1) {
                    class44 var3 = class44.method460(this.field128);
                    if (var3.field1299 == 512 && var3.field1296 == 334 && var3.field1279 == 0) {
                        var3.field1299 = 765;
                        var3.field1296 = 503;
                    }
                    this.method35(0, 0, var3, -545, 0);
                }
                if (!this.field507) {
                    this.method121(-597);
                    this.method138(3);
                } else {
                    this.method143(614);
                }
            }
            super.field796.method299(super.field795, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method25(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field93 = "";
                this.field94 = "Connecting to server...";
                this.method84(true, this.field229);
            }
            this.field314 = new class20((byte) -87, this, this.method131(field216 + 43594));
            long var4 = class40.method440(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field92.field1032 = 0;
            this.field92.method359(14);
            this.field92.method359(var6);
            this.field314.method282(0, false, this.field92.field1031, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field314.method279();
            }
            int var8 = this.field314.method279();
            int var9 = var8;
            if (var8 == 0) {
                this.field314.method281(this.field546.field1031, 0, 8);
                this.field546.field1032 = 0;
                this.field150 = this.field546.method375(true);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field150 >> 32), (int) this.field150 };
                this.field92.field1032 = 0;
                this.field92.method359(10);
                this.field92.method363(var10[0]);
                this.field92.method363(var10[1]);
                this.field92.method363(var10[2]);
                this.field92.method363(var10[3]);
                this.field92.method363(signlink.uid);
                this.field92.method366(arg0);
                this.field92.method366(arg1);
                this.field92.method384(field298, field525, false);
                this.field461.field1032 = 0;
                if (arg2) {
                    this.field461.method359(18);
                } else {
                    this.field461.method359(16);
                }
                this.field461.method359(this.field92.field1032 + 36 + 1 + 1 + 2);
                this.field461.method359(255);
                this.field461.method360(356);
                this.field461.method359(field218 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field461.method363(this.field396[var11]);
                }
                this.field461.method367(0, this.field92.field1031, -21870, this.field92.field1032);
                this.field92.field1036 = new class36(-568, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field232 = new class36(-568, var10);
                this.field314.method282(0, false, this.field461.field1031, this.field461.field1032);
                var8 = this.field314.method279();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method25(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field356 = this.field314.method279();
                field495 = this.field314.method279() == 1;
                this.field310 = 0L;
                this.field501 = 0;
                this.field439.field889 = 0;
                super.field800 = true;
                this.field149 = true;
                this.field318 = true;
                this.field92.field1032 = 0;
                this.field546.field1032 = 0;
                this.field200 = -1;
                this.field143 = -1;
                this.field144 = -1;
                this.field145 = -1;
                this.field199 = 0;
                this.field201 = 0;
                this.field406 = 0;
                this.field203 = 0;
                this.field263 = 0;
                this.field117 = 0;
                this.field507 = false;
                super.field801 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field346[var13] = null;
                }
                this.field182 = 0;
                this.field187 = 0;
                this.field290 = 0;
                this.field421 = 0;
                this.field113 = (int) (Math.random() * 100.0D) - 50;
                this.field269 = (int) (Math.random() * 110.0D) - 55;
                this.field258 = (int) (Math.random() * 80.0D) - 40;
                this.field470 = (int) (Math.random() * 120.0D) - 60;
                this.field529 = (int) (Math.random() * 30.0D) - 20;
                this.field59 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field524 = 0;
                this.field288 = -1;
                this.field221 = 0;
                this.field222 = 0;
                this.field208 = 0;
                this.field341 = 0;
                for (int var14 = 0; var14 < this.field205; ++var14) {
                    this.field207[var14] = null;
                    this.field212[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field340[var15] = null;
                }
                field124 = this.field207[this.field206] = new class51();
                this.field319.method453();
                this.field363.method453();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field235[var16][var17][var18] = null;
                        }
                    }
                }
                this.field75 = new class42(0);
                this.field401 = 0;
                this.field400 = 0;
                this.method154(3, this.field138);
                this.field138 = -1;
                this.method154(3, this.field368);
                this.field368 = -1;
                this.method154(3, this.field542);
                this.field542 = -1;
                this.method154(3, this.field139);
                this.field139 = -1;
                this.method154(3, this.field128);
                this.field128 = -1;
                this.method154(3, this.field445);
                this.field445 = -1;
                this.method154(3, this.field399);
                this.field399 = -1;
                this.field291 = false;
                this.field253 = 3;
                this.field62 = 0;
                this.field507 = false;
                this.field68 = false;
                this.field131 = null;
                this.field179 = 0;
                this.field157 = -1;
                this.field394 = true;
                this.method87(493);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field477[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field389[var20] = null;
                    this.field390[var20] = false;
                }
                field458 = 0;
                field121 = 0;
                field192 = 0;
                field510 = 0;
                field225 = 0;
                field261 = 0;
                field446 = 0;
                field526 = 0;
                field71 = 0;
                field281 = 0;
                this.method149(7);
            } else if (var8 == 3) {
                this.field93 = "";
                this.field94 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field93 = "Your account has been disabled.";
                this.field94 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field93 = "Your account is already logged in.";
                this.field94 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field93 = "RuneScape has been updated!";
                this.field94 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field93 = "This world is full.";
                this.field94 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field93 = "Unable to connect.";
                this.field94 = "Login server offline.";
            } else if (var8 == 9) {
                this.field93 = "Login limit exceeded.";
                this.field94 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field93 = "Unable to connect.";
                this.field94 = "Bad session id.";
            } else if (var8 == 11) {
                this.field93 = "Login server rejected session.";
                this.field94 = "Please try again.";
            } else if (var8 == 12) {
                this.field93 = "You need a members account to login to this world.";
                this.field94 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field93 = "Could not complete login.";
                this.field94 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field93 = "The server is being updated.";
                this.field94 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field318 = true;
                this.field92.field1032 = 0;
                this.field546.field1032 = 0;
                this.field200 = -1;
                this.field143 = -1;
                this.field144 = -1;
                this.field145 = -1;
                this.field199 = 0;
                this.field201 = 0;
                this.field406 = 0;
                this.field117 = 0;
                this.field507 = false;
                this.field494 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field93 = "Login attempts exceeded.";
                this.field94 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field93 = "You are standing in a members-only area.";
                this.field94 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field93 = "Invalid loginserver requested";
                this.field94 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field93 = "Malformed login packet.";
                    this.field94 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field459 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field459;
                            this.method25(arg0, arg1, arg2);
                        } else {
                            this.field93 = "No response from loginserver";
                            this.field94 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field93 = "No response from server";
                        this.field94 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field93 = "Unexpected server response";
                    this.field94 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field314.method279();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field93 = "You have only just left another world";
                    this.field94 = "Your profile will be transferred in: " + var26;
                    this.method84(true, this.field229);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method25(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field93 = "";
            this.field94 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method26(boolean arg0) {
        this.field132 = 0;
        int var2 = (field124.field1134 >> 7) + this.field168;
        int var3 = (field124.field1135 >> 7) + this.field169;
        if (arg0) {
            this.field200 = this.field546.method369();
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field132 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field132 = 1;
        }
        if (this.field132 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field132 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
    public final boolean method27(int arg0, int arg1, byte arg2) {
        if (arg2 != 5) {
            throw new NullPointerException();
        } else {
            boolean var4 = false;
            boolean var5 = false;
            class44 var6 = class44.method460(arg0);
            for (int var7 = 0; var7 < var6.field1249.length && var6.field1249[var7] != -1; ++var7) {
                class44 var8 = class44.method460(var6.field1249[var7]);
                if (var8.field1279 == 0) {
                    var5 |= this.method27(var8.field1303, arg1, (byte) 5);
                }
                if (var8.field1279 == 6 && (var8.field1308 != -1 || var8.field1309 != -1)) {
                    boolean var9 = this.method115(var8, 0);
                    int var10;
                    if (var9) {
                        var10 = var8.field1309;
                    } else {
                        var10 = var8.field1308;
                    }
                    if (var10 != -1) {
                        class15 var11 = class15.field837[var10];
                        var8.field1293 += arg1;
                        while (var8.field1293 > var11.method252(var8.field1286, -26977)) {
                            var8.field1293 -= var11.method252(var8.field1286, -26977) + 1;
                            ++var8.field1286;
                            if (var8.field1286 >= var11.field838) {
                                var8.field1286 -= var11.field842;
                                if (var8.field1286 < 0 || var8.field1286 >= var11.field838) {
                                    var8.field1286 = 0;
                                }
                            }
                            var5 = true;
                        }
                    }
                }
                if (var8.field1279 == 6 && var8.field1302 != 0) {
                    int var12 = var8.field1302 >> 16;
                    int var13 = var8.field1302 << 16 >> 16;
                    int var14 = arg1 * var12;
                    int var15 = arg1 * var13;
                    var8.field1311 = var8.field1311 + var14 & 2047;
                    var8.field1312 = var8.field1312 + var15 & 2047;
                    var5 = true;
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method28(boolean arg0) {
        if (this.field241 == null) {
            super.field796 = null;
            this.field466 = null;
            this.field464 = null;
            this.field463 = null;
            this.field465 = null;
            this.field503 = null;
            this.field504 = null;
            this.field505 = null;
            this.field244 = new class25(265, 128, this.method65(true), field383);
            class21.method287(true);
            this.field245 = new class25(265, 128, this.method65(true), field383);
            class21.method287(true);
            this.field241 = new class25(171, 509, this.method65(true), field383);
            class21.method287(true);
            this.field242 = new class25(132, 360, this.method65(true), field383);
            class21.method287(true);
            this.field243 = new class25(200, 360, this.method65(true), field383);
            this.field318 &= arg0;
            class21.method287(true);
            this.field246 = new class25(238, 202, this.method65(true), field383);
            class21.method287(true);
            this.field247 = new class25(238, 203, this.method65(true), field383);
            class21.method287(true);
            this.field248 = new class25(94, 74, this.method65(true), field383);
            class21.method287(true);
            this.field249 = new class25(94, 75, this.method65(true), field383);
            class21.method287(true);
            if (this.field500 != null) {
                this.method68(-480);
                this.method13((byte) 38);
            }
            this.field74 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILLBBVYYXO;)V")
    private final void method29(int arg0, int arg1, class32 arg2) {
        int var4 = 95 / arg1;
        while (arg2.field1033 + 10 < arg0 * 8) {
            int var5 = arg2.method380(11, (byte) -50);
            if (var5 == 2047) {
                break;
            }
            if (this.field207[var5] == null) {
                this.field207[var5] = new class51();
                if (this.field212[var5] != null) {
                    this.field207[var5].method526(this.field212[var5], this.field472);
                }
            }
            this.field209[this.field208++] = var5;
            class51 var6 = this.field207[var5];
            var6.field1125 = field174;
            int var7 = arg2.method380(5, (byte) -50);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method380(1, (byte) -50);
            if (var8 == 1) {
                this.field211[this.field210++] = var5;
            }
            int var9 = arg2.method380(5, (byte) -50);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg2.method380(1, (byte) -50);
            var6.method430(field124.field1132[0] + var7, field124.field1133[0] + var9, this.field348, var10 == 1);
        }
        arg2.method381(true);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method30(int arg0) {
        if (!this.field197 && !this.field167 && !this.field297) {
            ++field493;
            if (!this.field318) {
                this.method84(false, this.field229);
            } else {
                this.method24(4);
            }
            this.field204 = 0;
            if (arg0 != 0) {
                this.field92.method359(159);
            }
        } else {
            this.method62(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method31(int arg0) {
        int var2 = 30 / arg0;
        if (this.field290 == 2) {
            for (class18 var3 = (class18) this.field75.method449(); var3 != null; var3 = (class18) this.field75.method451(-582)) {
                if (var3.field893 > 0) {
                    --var3.field893;
                }
                if (var3.field893 == 0) {
                    if (var3.field894 < 0 || class16.method264(var3.field896, var3.field894, 0)) {
                        this.method112(var3.field900, var3.field896, var3.field898, var3.field894, var3.field895, var3.field897, -785, var3.field899);
                        var3.method464();
                    }
                } else {
                    if (var3.field904 > 0) {
                        --var3.field904;
                    }
                    if (var3.field904 == 0 && var3.field899 >= 1 && var3.field900 >= 1 && var3.field899 <= 102 && var3.field900 <= 102 && (var3.field901 < 0 || class16.method264(var3.field903, var3.field901, 0))) {
                        this.method112(var3.field900, var3.field903, var3.field898, var3.field901, var3.field902, var3.field897, -785, var3.field899);
                        var3.field904 = -1;
                        if (var3.field901 == var3.field894 && var3.field894 == -1) {
                            var3.method464();
                        } else if (var3.field901 == var3.field894 && var3.field902 == var3.field895 && var3.field903 == var3.field896) {
                            var3.method464();
                        }
                    }
                }
            }
            ++field452;
            if (field452 > 109) {
                field452 = 0;
                this.field92.method358(7793, 229);
                this.field92.method360(8929);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LLBBVYYXO;II)V")
    private final void method32(class32 arg0, int arg1, int arg2) {
        int var4 = arg0.method380(8, (byte) -50);
        if (var4 < this.field208) {
            for (int var5 = var4; var5 < this.field208; ++var5) {
                this.field534[this.field533++] = this.field209[var5];
            }
        }
        if (var4 > this.field208) {
            signlink.reporterror(this.field450 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field208 = 0;
            if (arg2 != 39779) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field209[var7];
                class51 var9 = this.field207[var8];
                int var10 = arg0.method380(1, (byte) -50);
                if (var10 == 0) {
                    this.field209[this.field208++] = var8;
                    var9.field1125 = field174;
                } else {
                    int var11 = arg0.method380(2, (byte) -50);
                    if (var11 == 0) {
                        this.field209[this.field208++] = var8;
                        var9.field1125 = field174;
                        this.field211[this.field210++] = var8;
                    } else if (var11 == 1) {
                        this.field209[this.field208++] = var8;
                        var9.field1125 = field174;
                        int var12 = arg0.method380(3, (byte) -50);
                        var9.method428(var12, false, true);
                        int var13 = arg0.method380(1, (byte) -50);
                        if (var13 == 1) {
                            this.field211[this.field210++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field209[this.field208++] = var8;
                        var9.field1125 = field174;
                        int var14 = arg0.method380(3, (byte) -50);
                        var9.method428(var14, true, true);
                        int var15 = arg0.method380(3, (byte) -50);
                        var9.method428(var15, true, true);
                        int var16 = arg0.method380(1, (byte) -50);
                        if (var16 == 1) {
                            this.field211[this.field210++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field534[this.field533++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method33(int arg0) {
        if (arg0 != 44393) {
            this.field177 = this.field232.method424();
        }
        while (true) {
            class72 var2 = this.field82.method237();
            if (var2 == null) {
                return;
            }
            if (var2.field1734 == 0) {
                class8.method194(0, var2.field1735, var2.field1737);
                if ((this.field82.method229(field130, var2.field1735) & 98) != 0) {
                    this.field554 = true;
                    if (this.field368 != -1 || this.field138 != -1) {
                        this.field528 = true;
                    }
                }
            }
            if (var2.field1734 == 1 && var2.field1737 != null) {
                class46.method466(var2.field1737, (byte) -21);
            }
            if (var2.field1734 == 2 && this.field531 == var2.field1735 && var2.field1737 != null) {
                this.method156(this.field532, var2.field1737, 47025);
            }
            if (var2.field1734 == 3 && this.field290 == 1) {
                for (int var3 = 0; var3 < this.field381.length; ++var3) {
                    if (this.field522[var3] == var2.field1735) {
                        this.field381[var3] = var2.field1737;
                        if (var2.field1737 == null) {
                            this.field522[var3] = -1;
                        }
                        break;
                    }
                    if (this.field523[var3] == var2.field1735) {
                        this.field487[var3] = var2.field1737;
                        if (var2.field1737 == null) {
                            this.field523[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1734 == 93 && this.field82.method241(var2.field1735, (byte) 70)) {
                class16.method260(this.field82, (byte) 3, new class32((byte) 114, var2.field1737));
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method34(int arg0) {
        if (arg0 != -346) {
            field502 = this.field232.method424();
        }
        if (super.field809 == 1) {
            if (super.field810 >= 539 && super.field810 <= 573 && super.field811 >= 169 && super.field811 < 205 && this.field349[0] != -1) {
                this.field554 = true;
                this.field253 = 0;
                this.field148 = true;
            }
            if (super.field810 >= 569 && super.field810 <= 599 && super.field811 >= 168 && super.field811 < 205 && this.field349[1] != -1) {
                this.field554 = true;
                this.field253 = 1;
                this.field148 = true;
            }
            if (super.field810 >= 597 && super.field810 <= 627 && super.field811 >= 168 && super.field811 < 205 && this.field349[2] != -1) {
                this.field554 = true;
                this.field253 = 2;
                this.field148 = true;
            }
            if (super.field810 >= 625 && super.field810 <= 669 && super.field811 >= 168 && super.field811 < 203 && this.field349[3] != -1) {
                this.field554 = true;
                this.field253 = 3;
                this.field148 = true;
            }
            if (super.field810 >= 666 && super.field810 <= 696 && super.field811 >= 168 && super.field811 < 205 && this.field349[4] != -1) {
                this.field554 = true;
                this.field253 = 4;
                this.field148 = true;
            }
            if (super.field810 >= 694 && super.field810 <= 724 && super.field811 >= 168 && super.field811 < 205 && this.field349[5] != -1) {
                this.field554 = true;
                this.field253 = 5;
                this.field148 = true;
            }
            if (super.field810 >= 722 && super.field810 <= 756 && super.field811 >= 169 && super.field811 < 205 && this.field349[6] != -1) {
                this.field554 = true;
                this.field253 = 6;
                this.field148 = true;
            }
            if (super.field810 >= 540 && super.field810 <= 574 && super.field811 >= 466 && super.field811 < 502 && this.field349[7] != -1) {
                this.field554 = true;
                this.field253 = 7;
                this.field148 = true;
            }
            if (super.field810 >= 572 && super.field810 <= 602 && super.field811 >= 466 && super.field811 < 503 && this.field349[8] != -1) {
                this.field554 = true;
                this.field253 = 8;
                this.field148 = true;
            }
            if (super.field810 >= 599 && super.field810 <= 629 && super.field811 >= 466 && super.field811 < 503 && this.field349[9] != -1) {
                this.field554 = true;
                this.field253 = 9;
                this.field148 = true;
            }
            if (super.field810 >= 627 && super.field810 <= 671 && super.field811 >= 467 && super.field811 < 502 && this.field349[10] != -1) {
                this.field554 = true;
                this.field253 = 10;
                this.field148 = true;
            }
            if (super.field810 >= 669 && super.field810 <= 699 && super.field811 >= 466 && super.field811 < 503 && this.field349[11] != -1) {
                this.field554 = true;
                this.field253 = 11;
                this.field148 = true;
            }
            if (super.field810 >= 696 && super.field810 <= 726 && super.field811 >= 466 && super.field811 < 503 && this.field349[12] != -1) {
                this.field554 = true;
                this.field253 = 12;
                this.field148 = true;
            }
            if (super.field810 >= 724 && super.field810 <= 758 && super.field811 >= 466 && super.field811 < 502 && this.field349[13] != -1) {
                this.field554 = true;
                this.field253 = 13;
                this.field148 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILPQPZKUPU;II)V")
    public final void method35(int arg0, int arg1, class44 arg2, int arg3, int arg4) {
        if (arg2.field1279 == 0 && arg2.field1249 != null) {
            if (!arg2.field1306 || this.field395 == arg2.field1303 || this.field540 == arg2.field1303 || this.field469 == arg2.field1303) {
                int var6 = class21.field936;
                int var7 = class21.field934;
                int var8 = class21.field937;
                int var9 = class21.field935;
                if (arg3 < 0) {
                    class21.method286(arg4, arg1, (byte) 21, arg2.field1299 + arg1, arg2.field1296 + arg4);
                    int var10 = arg2.field1249.length;
                    for (int var11 = 0; var11 < var10; ++var11) {
                        int var12 = arg2.field1297[var11] + arg1;
                        int var13 = arg2.field1300[var11] + arg4 - arg0;
                        class44 var14 = class44.method460(arg2.field1249[var11]);
                        int var15 = var14.field1283 + var12;
                        int var16 = var14.field1269 + var13;
                        if (var14.field1243 > 0) {
                            this.method92((byte) -22, var14);
                        }
                        if (var14.field1279 == 0) {
                            if (var14.field1304 > var14.field1278 - var14.field1296) {
                                var14.field1304 = var14.field1278 - var14.field1296;
                            }
                            if (var14.field1304 < 0) {
                                var14.field1304 = 0;
                            }
                            this.method35(var14.field1304, var15, var14, -545, var16);
                            if (var14.field1278 > var14.field1296) {
                                this.method38(var14.field1299 + var15, var16, var14.field1278, var14.field1304, 227, var14.field1296);
                            }
                        } else if (var14.field1279 != 1) {
                            if (var14.field1279 == 2) {
                                int var17 = 0;
                                for (int var18 = 0; var18 < var14.field1296; ++var18) {
                                    for (int var19 = 0; var19 < var14.field1299; ++var19) {
                                        int var20 = (var14.field1305 + 32) * var19 + var15;
                                        int var21 = (var14.field1261 + 32) * var18 + var16;
                                        if (var17 < 20) {
                                            var20 += var14.field1294[var17];
                                            var21 += var14.field1307[var17];
                                        }
                                        if (var14.field1250[var17] <= 0) {
                                            if (var14.field1274 != null && var17 < 20) {
                                                class59 var30 = var14.field1274[var17];
                                                if (var30 != null) {
                                                    var30.method541(-4899, var20, var21);
                                                }
                                            }
                                        } else {
                                            int var22 = 0;
                                            int var23 = 0;
                                            int var24 = var14.field1250[var17] - 1;
                                            if (var20 > class21.field936 - 32 && var20 < class21.field937 && var21 > class21.field934 - 32 && var21 < class21.field935 || this.field550 != 0 && this.field549 == var17) {
                                                int var25 = 0;
                                                if (this.field182 == 1 && this.field183 == var17 && this.field184 == var14.field1303) {
                                                    var25 = 16777215;
                                                }
                                                class59 var26 = class60.method553(var14.field1255[var17], var24, var25, 968);
                                                if (var26 != null) {
                                                    if (this.field550 != 0 && this.field549 == var17 && this.field548 == var14.field1303) {
                                                        var22 = super.field803 - this.field551;
                                                        var23 = super.field804 - this.field552;
                                                        if (var22 < 5 && var22 > -5) {
                                                            var22 = 0;
                                                        }
                                                        if (var23 < 5 && var23 > -5) {
                                                            var23 = 0;
                                                        }
                                                        if (this.field409 < 5) {
                                                            var22 = 0;
                                                            var23 = 0;
                                                        }
                                                        var26.method543(228, 128, var20 + var22, var21 + var23);
                                                        if (var21 + var23 < class21.field934 && arg2.field1304 > 0) {
                                                            int var27 = (class21.field934 - var21 - var23) * this.field116 / 3;
                                                            if (var27 > this.field116 * 10) {
                                                                var27 = this.field116 * 10;
                                                            }
                                                            if (var27 > arg2.field1304) {
                                                                var27 = arg2.field1304;
                                                            }
                                                            arg2.field1304 -= var27;
                                                            this.field552 += var27;
                                                        }
                                                        if (var21 + var23 + 32 > class21.field935 && arg2.field1304 < arg2.field1278 - arg2.field1296) {
                                                            int var28 = (var21 + var23 + 32 - class21.field935) * this.field116 / 3;
                                                            if (var28 > this.field116 * 10) {
                                                                var28 = this.field116 * 10;
                                                            }
                                                            if (var28 > arg2.field1278 - arg2.field1296 - arg2.field1304) {
                                                                var28 = arg2.field1278 - arg2.field1296 - arg2.field1304;
                                                            }
                                                            arg2.field1304 += var28;
                                                            this.field552 -= var28;
                                                        }
                                                    } else if (this.field287 != 0 && this.field286 == var17 && this.field285 == var14.field1303) {
                                                        var26.method543(228, 128, var20, var21);
                                                    } else {
                                                        var26.method541(-4899, var20, var21);
                                                    }
                                                    if (var26.field1497 == 33 || var14.field1255[var17] != 1) {
                                                        int var29 = var14.field1255[var17];
                                                        this.field473.method593(method133(this.field142, var29), var21 + 10 + var23, var20 + 1 + var22, 0, -32001);
                                                        this.field473.method593(method133(this.field142, var29), var21 + 9 + var23, var20 + var22, 16776960, -32001);
                                                    }
                                                }
                                            }
                                        }
                                        ++var17;
                                    }
                                }
                            } else if (var14.field1279 == 3) {
                                boolean var31 = false;
                                if (this.field469 == var14.field1303 || this.field540 == var14.field1303 || this.field395 == var14.field1303) {
                                    var31 = true;
                                }
                                int var32;
                                if (this.method115(var14, 0)) {
                                    var32 = var14.field1266;
                                    if (var31 && var14.field1271 != 0) {
                                        var32 = var14.field1271;
                                    }
                                } else {
                                    var32 = var14.field1254;
                                    if (var31 && var14.field1247 != 0) {
                                        var32 = var14.field1247;
                                    }
                                }
                                if (var14.field1284 == 0) {
                                    if (var14.field1259) {
                                        class21.method289(var14.field1299, 2, var15, var32, var16, var14.field1296);
                                    } else {
                                        class21.method290(var14.field1296, var32, 0, var15, var14.field1299, var16);
                                    }
                                } else if (var14.field1259) {
                                    class21.method288(256 - (var14.field1284 & 255), var15, var14.field1299, var14.field1296, -852, var16, var32);
                                } else {
                                    class21.method291(var32, var16, var15, var14.field1299, var14.field1296, 28, 256 - (var14.field1284 & 255));
                                }
                            } else if (var14.field1279 == 4) {
                                class71 var33 = var14.field1258;
                                String var34 = var14.field1285;
                                boolean var35 = false;
                                if (this.field469 == var14.field1303 || this.field540 == var14.field1303 || this.field395 == var14.field1303) {
                                    var35 = true;
                                }
                                int var36;
                                if (this.method115(var14, 0)) {
                                    var36 = var14.field1266;
                                    if (var35 && var14.field1271 != 0) {
                                        var36 = var14.field1271;
                                    }
                                    if (var14.field1270.length() > 0) {
                                        var34 = var14.field1270;
                                    }
                                } else {
                                    var36 = var14.field1254;
                                    if (var35 && var14.field1247 != 0) {
                                        var36 = var14.field1247;
                                    }
                                }
                                if (var14.field1313 == 6 && this.field291) {
                                    var34 = "Please wait...";
                                    var36 = var14.field1254;
                                }
                                if (class21.field932 == 479) {
                                    if (var36 == 16776960) {
                                        var36 = 255;
                                    }
                                    if (var36 == 49152) {
                                        var36 = 16777215;
                                    }
                                }
                                int var37 = var33.field1731 + var16;
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
                                                                            var34 = var34.substring(0, var42) + this.method155(this.method85(4, (byte) 0, var14), (byte) -1) + var34.substring(var42 + 2);
                                                                        }
                                                                    }
                                                                    var34 = var34.substring(0, var41) + this.method155(this.method85(3, (byte) 0, var14), (byte) -1) + var34.substring(var41 + 2);
                                                                }
                                                            }
                                                            var34 = var34.substring(0, var40) + this.method155(this.method85(2, (byte) 0, var14), (byte) -1) + var34.substring(var40 + 2);
                                                        }
                                                    }
                                                    var34 = var34.substring(0, var39) + this.method155(this.method85(1, (byte) 0, var14), (byte) -1) + var34.substring(var39 + 2);
                                                }
                                            }
                                            var34 = var34.substring(0, var38) + this.method155(this.method85(0, (byte) 0, var14), (byte) -1) + var34.substring(var38 + 2);
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
                                    if (var14.field1246) {
                                        var33.method590(var14.field1287, var44, this.field352, var36, var37, var14.field1299 / 2 + var15);
                                    } else {
                                        var33.method597(var36, var44, var14.field1287, var15, this.field100, var37);
                                    }
                                    var37 += var33.field1731;
                                }
                            } else if (var14.field1279 == 5) {
                                class59 var45;
                                if (this.method115(var14, 0)) {
                                    var45 = var14.field1289;
                                } else {
                                    var45 = var14.field1292;
                                }
                                if (var45 != null) {
                                    var45.method541(-4899, var15, var16);
                                }
                            } else if (var14.field1279 == 6) {
                                int var46 = class6.field583;
                                int var47 = class6.field584;
                                class6.field583 = var14.field1299 / 2 + var15;
                                class6.field584 = var14.field1296 / 2 + var16;
                                int var48 = class6.field587[var14.field1311] * var14.field1310 >> 16;
                                int var49 = class6.field588[var14.field1311] * var14.field1310 >> 16;
                                boolean var50 = this.method115(var14, 0);
                                int var51;
                                if (var50) {
                                    var51 = var14.field1309;
                                } else {
                                    var51 = var14.field1308;
                                }
                                class8 var52;
                                if (var51 == -1) {
                                    var52 = var14.method454(-1, (byte) 0, -1, var50);
                                } else {
                                    class15 var53 = class15.field837[var51];
                                    var52 = var14.method454(var53.field840[var14.field1286], (byte) 0, var53.field839[var14.field1286], var50);
                                }
                                if (var52 != null) {
                                    var52.method217(0, var14.field1312, 0, var14.field1311, 0, var48, var49);
                                }
                                class6.field583 = var46;
                                class6.field584 = var47;
                            } else {
                                if (var14.field1279 == 7) {
                                    class71 var54 = var14.field1258;
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var14.field1296; ++var56) {
                                        for (int var57 = 0; var57 < var14.field1299; ++var57) {
                                            if (var14.field1250[var55] > 0) {
                                                class60 var58 = class60.method554(var14.field1250[var55] - 1);
                                                String var59 = var58.field1541;
                                                if (var58.field1542 || var14.field1255[var55] != 1) {
                                                    var59 = var59 + " x" + method59(var14.field1255[var55], (byte) 119);
                                                }
                                                int var60 = (var14.field1305 + 115) * var57 + var15;
                                                int var61 = (var14.field1261 + 12) * var56 + var16;
                                                if (var14.field1246) {
                                                    var54.method590(var14.field1287, var59, this.field352, var14.field1254, var61, var14.field1299 / 2 + var60);
                                                } else {
                                                    var54.method597(var14.field1254, var59, var14.field1287, var60, this.field100, var61);
                                                }
                                            }
                                            ++var55;
                                        }
                                    }
                                }
                                if (var14.field1279 == 8 && (this.field486 == var14.field1303 || this.field335 == var14.field1303 || this.field327 == var14.field1303) && this.field120 == 100) {
                                    int var62 = 0;
                                    int var63 = 0;
                                    class71 var64 = this.field474;
                                    String var65 = var14.field1285;
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
                                        int var74 = var64.method591(var73, this.field543);
                                        if (var74 > var62) {
                                            var62 = var74;
                                        }
                                        var63 += var64.field1731 + 1;
                                    }
                                    var62 += 6;
                                    var63 += 7;
                                    int var66 = var14.field1299 + var15 - 5 - var62;
                                    int var67 = var14.field1296 + var16 + 5;
                                    if (var66 < var15 + 5) {
                                        var66 = var15 + 5;
                                    }
                                    if (var62 + var66 > arg2.field1299 + arg1) {
                                        var66 = arg2.field1299 + arg1 - var62;
                                    }
                                    if (var63 + var67 > arg2.field1296 + arg4) {
                                        var67 = arg2.field1296 + arg4 - var63;
                                    }
                                    class21.method289(var62, 2, var66, 16777120, var67, var63);
                                    class21.method290(var63, 0, 0, var66, var62, var67);
                                    String var68 = var14.field1285;
                                    int var69 = var64.field1731 + var67 + 2;
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
                                        var64.method597(0, var71, false, var66 + 3, this.field100, var69);
                                        var69 += var64.field1731 + 1;
                                    }
                                }
                            }
                        }
                    }
                    class21.method286(var7, var6, (byte) 21, var8, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field424) {
            this.method148(true);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method36(int arg0, int arg1) {
        int var3 = class33.field1048[arg0].field1056;
        int var4 = 80 / arg1;
        if (var3 != 0) {
            int var5 = this.field350[arg0];
            if (var3 == 1) {
                if (var5 == 1) {
                    class6.method178(-157, 0.9D);
                }
                if (var5 == 2) {
                    class6.method178(-157, 0.8D);
                }
                if (var5 == 3) {
                    class6.method178(-157, 0.7D);
                }
                if (var5 == 4) {
                    class6.method178(-157, 0.6D);
                }
                class60.field1522.method531();
                this.field74 = true;
            }
            if (var3 == 3) {
                boolean var6 = this.field453;
                if (var5 == 0) {
                    this.method153(0, (byte) -75, this.field453);
                    this.field453 = true;
                }
                if (var5 == 1) {
                    this.method153(-400, (byte) -75, this.field453);
                    this.field453 = true;
                }
                if (var5 == 2) {
                    this.method153(-800, (byte) -75, this.field453);
                    this.field453 = true;
                }
                if (var5 == 3) {
                    this.method153(-1200, (byte) -75, this.field453);
                    this.field453 = true;
                }
                if (var5 == 4) {
                    this.field453 = false;
                }
                if (this.field453 != var6 && !field218) {
                    if (this.field453) {
                        this.field531 = this.field311;
                        this.field532 = true;
                        this.field82.method240(2, this.field531);
                    } else {
                        this.method106((byte) -65);
                    }
                    this.field305 = 0;
                }
            }
            if (var3 == 4) {
                if (var5 == 0) {
                    this.field393 = true;
                    this.method88(0, 9);
                }
                if (var5 == 1) {
                    this.field393 = true;
                    this.method88(-400, 9);
                }
                if (var5 == 2) {
                    this.field393 = true;
                    this.method88(-800, 9);
                }
                if (var5 == 3) {
                    this.field393 = true;
                    this.method88(-1200, 9);
                }
                if (var5 == 4) {
                    this.field393 = false;
                }
            }
            if (var3 == 5) {
                this.field367 = var5;
            }
            if (var3 == 6) {
                this.field191 = var5;
            }
            if (var3 == 8) {
                this.field81 = var5;
                this.field528 = true;
            }
            if (var3 == 9) {
                this.field397 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method37(boolean arg0) {
        if (this.field203 > 0) {
            this.method72(-852);
        } else {
            this.method73("Please wait - attempting to reestablish", 0, "Connection lost");
            this.field524 = 0;
            this.field221 = 0;
            if (arg0) {
                this.field92.method359(96);
            }
            class20 var2 = this.field314;
            this.field318 = false;
            this.field459 = 0;
            this.method25(this.field450, this.field451, true);
            if (!this.field318) {
                this.method72(-852);
            }
            try {
                var2.method278();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field118.method586(-4899, arg0, arg1);
        this.field119.method586(-4899, arg0, arg1 + arg5 - 16);
        class21.method289(16, 2, arg0, this.field219, arg1 + 16, arg5 - 32);
        int var7 = 2 / arg4;
        int var8 = (arg5 - 32) * arg5 / arg2;
        if (var8 < 8) {
            var8 = 8;
        }
        int var9 = (arg5 - 32 - var8) * arg3 / (arg2 - arg5);
        class21.method289(16, 2, arg0, this.field72, arg1 + 16 + var9, var8);
        class21.method294(var8, arg1 + 16 + var9, arg0, this.field499, (byte) 105);
        class21.method294(var8, arg1 + 16 + var9, arg0 + 1, this.field499, (byte) 105);
        class21.method292(16, arg0, 0, arg1 + 16 + var9, this.field499);
        class21.method292(16, arg0, 0, arg1 + 17 + var9, this.field499);
        class21.method294(var8, arg1 + 16 + var9, arg0 + 15, this.field334, (byte) 105);
        class21.method294(var8 - 1, arg1 + 17 + var9, arg0 + 14, this.field334, (byte) 105);
        class21.method292(16, arg0, 0, arg1 + 15 + var9 + var8, this.field334);
        class21.method292(15, arg0 + 1, 0, arg1 + 14 + var9 + var8, this.field334);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public final void method39(boolean arg0, byte arg1) {
        if (arg1 != -25) {
            this.field303 = -138;
        }
        if (field124.field1134 >> 7 == this.field221 && field124.field1135 >> 7 == this.field222) {
            this.field221 = 0;
        }
        int var3 = this.field208;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class51 var5;
            int var6;
            if (arg0) {
                var5 = field124;
                var6 = this.field206 << 14;
            } else {
                var5 = this.field207[this.field209[var4]];
                var6 = this.field209[var4] << 14;
            }
            if (var5 != null && var5.method429(21781)) {
                var5.field1409 = false;
                if ((field218 && this.field208 > 50 || this.field208 > 200) && !arg0 && var5.field1160 == var5.field1146) {
                    var5.field1409 = true;
                }
                int var7 = var5.field1134 >> 7;
                int var8 = var5.field1135 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1414 != null && field174 >= var5.field1419 && field174 < var5.field1420) {
                        var5.field1409 = false;
                        var5.field1418 = this.method147(var5.field1134, 0, this.field220, var5.field1135);
                        this.field176.method483(60, var5.field1427, var5.field1134, var6, var5.field1418, this.field220, var5.field1426, var5, var5.field1429, this.field101, var5.field1135, var5.field1136, var5.field1428);
                    } else {
                        if ((var5.field1134 & 127) == 64 && (var5.field1135 & 127) == 64) {
                            if (this.field123[var7][var8] == this.field378) {
                                continue;
                            }
                            this.field123[var7][var8] = this.field378;
                        }
                        var5.field1418 = this.method147(var5.field1134, 0, this.field220, var5.field1135);
                        this.field176.method482(var5, this.field220, -978, var5.field1418, var5.field1136, var6, var5.field1134, 60, var5.field1163, var5.field1135);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg4 & 2047;
        int var9 = 2048 - arg1 & 2047;
        if (arg3 != 0) {
            this.field200 = -1;
        }
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = class8.field682[var8];
            int var14 = class8.field683[var8];
            int var15 = var11 * var14 - arg2 * var13 >> 16;
            var12 = var11 * var13 + arg2 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class8.field682[var9];
            int var17 = class8.field683[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field440 = arg0 - var10;
        this.field441 = arg5 - var11;
        this.field442 = arg6 - var12;
        this.field443 = arg4;
        this.field444 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNQXGETKS;II)V")
    public final void method41(class37 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field92.method359(182);
        }
        this.method42(142, arg0.field1135, arg2, arg0.field1134);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
            int var5 = this.method147(arg3, 0, this.field220, arg1) - arg2;
            int var6 = arg3 - this.field440;
            int var7 = 95 / arg0;
            int var8 = var5 - this.field441;
            int var9 = arg1 - this.field442;
            int var10 = class8.field682[this.field443];
            int var11 = class8.field683[this.field443];
            int var12 = class8.field682[this.field444];
            int var13 = class8.field683[this.field444];
            int var14 = var6 * var13 + var9 * var12 >> 16;
            int var15 = var9 * var13 - var6 * var12 >> 16;
            int var17 = var8 * var11 - var10 * var15 >> 16;
            int var18 = var8 * var10 + var11 * var15 >> 16;
            if (var18 >= 50) {
                this.field180 = (var14 << 9) / var18 + class6.field583;
                this.field181 = (var17 << 9) / var18 + class6.field584;
            } else {
                this.field180 = -1;
                this.field181 = -1;
            }
        } else {
            this.field180 = -1;
            this.field181 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
    public final void method43(byte arg0, long arg1) {
        if (arg0 != 5) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1 != 0L) {
            if (this.field400 >= 100 && this.field423 != 1) {
                this.method67("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0, -39349);
            } else if (this.field400 >= 200) {
                this.method67("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0, -39349);
            } else {
                String var5 = class40.method444(true, class40.method441(359, arg1));
                for (int var6 = 0; var6 < this.field400; ++var6) {
                    if (this.field457[var6] == arg1) {
                        this.method67(var5 + " is already on your friend list", "", 0, -39349);
                        return;
                    }
                }
                for (int var7 = 0; var7 < this.field237; ++var7) {
                    if (this.field370[var7] == arg1) {
                        this.method67("Please remove " + var5 + " from your ignore list first", "", 0, -39349);
                        return;
                    }
                }
                if (!var5.equals(field124.field1423)) {
                    this.field239[this.field400] = var5;
                    this.field457[this.field400] = arg1;
                    this.field154[this.field400] = 0;
                    ++this.field400;
                    this.field554 = true;
                    this.field92.method358(7793, 252);
                    this.field92.method365(arg1, (byte) 56);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        if (!arg0) {
            this.field200 = this.field546.method369();
        }
        if (this.field524 == 0) {
            if (super.field809 == 1) {
                int var2 = super.field810 - 25 - 550;
                int var3 = super.field811 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field59 + this.field470 & 2047;
                    int var5 = class6.field587[var4];
                    int var6 = class6.field588[var4];
                    int var7 = (this.field529 + 256) * var5 >> 8;
                    int var8 = (this.field529 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field124.field1134 + var9 >> 7;
                    int var12 = field124.field1135 - var10 >> 7;
                    boolean var13 = this.method76(field124.field1132[0], this.field57, 0, 0, 0, 0, 1, var12, true, field124.field1133[0], 0, var11);
                    if (var13) {
                        this.field92.method359(var2);
                        this.field92.method359(var3);
                        this.field92.method360(this.field59);
                        this.field92.method359(57);
                        this.field92.method359(this.field470);
                        this.field92.method359(this.field529);
                        this.field92.method359(89);
                        this.field92.method360(field124.field1134);
                        this.field92.method360(field124.field1135);
                        this.field92.method359(this.field80);
                        this.field92.method359(63);
                    }
                }
                ++field70;
                if (field70 > 1719) {
                    field70 = 0;
                    this.field92.method358(7793, 13);
                    this.field92.method359(0);
                    int var14 = this.field92.field1032;
                    this.field92.method360(16649);
                    this.field92.method360(22579);
                    this.field92.method359((int) (Math.random() * 256.0D));
                    this.field92.method360(18261);
                    this.field92.method360(22681);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field92.method359(29);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field92.method359(167);
                    }
                    this.field92.method360(6244);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field92.method360(30915);
                    }
                    this.field92.method359(232);
                    this.field92.method368(this.field92.field1032 - var14, 8);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method45(boolean arg0) {
        class2 var2 = (class2) this.field363.method449();
        if (!arg0) {
            this.field92.method359(89);
        }
        while (var2 != null) {
            if (this.field220 == var2.field19 && !var2.field23) {
                if (field174 >= var2.field27) {
                    var2.method1(this.field116, (byte) 102);
                    if (var2.field23) {
                        var2.method464();
                    } else {
                        this.field176.method482(var2, var2.field19, -978, var2.field22, 0, -1, var2.field20, 60, false, var2.field21);
                    }
                }
            } else {
                var2.method464();
            }
            var2 = (class2) this.field363.method451(-582);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field809 == 1) {
            if (super.field810 >= 6 && super.field810 <= 106 && super.field811 >= 467 && super.field811 <= 499) {
                this.field234 = (this.field234 + 1) % 4;
                this.field141 = true;
                this.field528 = true;
                this.field92.method358(7793, 145);
                this.field92.method359(this.field234);
                this.field92.method359(this.field88);
                this.field92.method359(this.field76);
            }
            if (super.field810 >= 135 && super.field810 <= 235 && super.field811 >= 467 && super.field811 <= 499) {
                this.field88 = (this.field88 + 1) % 3;
                this.field141 = true;
                this.field528 = true;
                this.field92.method358(7793, 145);
                this.field92.method359(this.field234);
                this.field92.method359(this.field88);
                this.field92.method359(this.field76);
            }
            if (super.field810 >= 273 && super.field810 <= 373 && super.field811 >= 467 && super.field811 <= 499) {
                this.field76 = (this.field76 + 1) % 3;
                this.field141 = true;
                this.field528 = true;
                this.field92.method358(7793, 145);
                this.field92.method359(this.field234);
                this.field92.method359(this.field88);
                this.field92.method359(this.field76);
            }
            if (super.field810 >= 412 && super.field810 <= 512 && super.field811 >= 467 && super.field811 <= 499) {
                if (this.field542 == -1) {
                    this.method14(0);
                    this.field231 = "";
                    this.field410 = false;
                    this.field347 = this.field542 = class44.field1245;
                    return;
                }
                this.method67("Please close the interface you have open before using 'report abuse'", "", 0, -39349);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)I")
    public final int method47(boolean arg0) {
        if (!arg0) {
            this.field449 = !this.field449;
        }
        int var2 = 3;
        if (this.field443 < 310) {
            int var3 = this.field440 >> 7;
            int var4 = this.field442 >> 7;
            int var5 = field124.field1134 >> 7;
            int var6 = field124.field1135 >> 7;
            if ((this.field156[this.field220][var3][var4] & 4) != 0) {
                var2 = this.field220;
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
                    if ((this.field156[this.field220][var3][var4] & 4) != 0) {
                        var2 = this.field220;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field156[this.field220][var3][var4] & 4) != 0) {
                            var2 = this.field220;
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
                    if ((this.field156[this.field220][var3][var4] & 4) != 0) {
                        var2 = this.field220;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field156[this.field220][var3][var4] & 4) != 0) {
                            var2 = this.field220;
                        }
                    }
                }
            }
        }
        if ((this.field156[this.field220][field124.field1134 >> 7][field124.field1135 >> 7] & 4) != 0) {
            var2 = this.field220;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)I")
    public final int method48(int arg0) {
        if (arg0 >= this.field56 && arg0 <= this.field56) {
            int var2 = this.method147(this.field440, 0, this.field220, this.field442);
            return var2 - this.field441 < 800 && (this.field156[this.field220][this.field440 >> 7][this.field442 >> 7] & 4) != 0 ? this.field220 : 3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public static final void method49(byte arg0) {
        class48.field1338 = true;
        class6.field578 = true;
        if (field230 != arg0) {
            field468 = !field468;
        }
        field218 = true;
        class16.field865 = true;
        class34.field1071 = true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILPQPZKUPU;III)V")
    public final void method50(int arg0, int arg1, int arg2, int arg3, class44 arg4, int arg5, int arg6, int arg7) {
        if (arg4.field1279 == 0 && arg4.field1249 != null && !arg4.field1306) {
            if (arg2 >= arg5 && arg7 >= arg6 && arg2 <= arg4.field1299 + arg5 && arg7 <= arg4.field1296 + arg6) {
                int var9 = arg4.field1249.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg4.field1297[var10] + arg5;
                    int var12 = arg4.field1300[var10] + arg6 - arg0;
                    class44 var13 = class44.method460(arg4.field1249[var10]);
                    int var14 = var13.field1283 + var11;
                    int var15 = var13.field1269 + var12;
                    if ((var13.field1290 >= 0 || var13.field1247 != 0) && arg2 >= var14 && arg7 >= var15 && arg2 < var13.field1299 + var14 && arg7 < var13.field1296 + var15) {
                        if (var13.field1290 >= 0) {
                            this.field511 = var13.field1290;
                        } else {
                            this.field511 = var13.field1303;
                        }
                    }
                    if (var13.field1279 == 8 && arg2 >= var14 && arg7 >= var15 && arg2 < var13.field1299 + var14 && arg7 < var13.field1296 + var15) {
                        this.field158 = var13.field1303;
                    }
                    if (var13.field1279 == 0) {
                        this.method50(var13.field1304, arg1, arg2, 0, var13, var14, var15, arg7);
                        if (var13.field1278 > var13.field1296) {
                            this.method124(arg7, arg2, var13, var13.field1278, var13.field1296, (byte) 110, arg1, var13.field1299 + var14, var15);
                        }
                    } else {
                        if (var13.field1313 == 1 && arg2 >= var14 && arg7 >= var15 && arg2 < var13.field1299 + var14 && arg7 < var13.field1296 + var15) {
                            boolean var16 = false;
                            if (var13.field1243 != 0) {
                                var16 = this.method100(46001, var13);
                            }
                            if (!var16) {
                                this.field447[this.field117] = var13.field1264;
                                this.field256[this.field117] = 496;
                                this.field255[this.field117] = var13.field1303;
                                ++this.field117;
                            }
                        }
                        if (var13.field1313 == 2 && this.field187 == 0 && arg2 >= var14 && arg7 >= var15 && arg2 < var13.field1299 + var14 && arg7 < var13.field1296 + var15) {
                            String var17 = var13.field1257;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field447[this.field117] = var17 + " @gre@" + var13.field1239;
                            this.field256[this.field117] = 619;
                            this.field255[this.field117] = var13.field1303;
                            ++this.field117;
                        }
                        if (var13.field1313 == 3 && arg2 >= var14 && arg7 >= var15 && arg2 < var13.field1299 + var14 && arg7 < var13.field1296 + var15) {
                            this.field447[this.field117] = "Close";
                            if (arg1 == 3) {
                                this.field256[this.field117] = 895;
                            } else {
                                this.field256[this.field117] = 1;
                            }
                            this.field255[this.field117] = var13.field1303;
                            ++this.field117;
                        }
                        if (var13.field1313 == 4 && arg2 >= var14 && arg7 >= var15 && arg2 < var13.field1299 + var14 && arg7 < var13.field1296 + var15) {
                            this.field447[this.field117] = var13.field1264;
                            this.field256[this.field117] = 652;
                            this.field255[this.field117] = var13.field1303;
                            ++this.field117;
                        }
                        if (var13.field1313 == 5 && arg2 >= var14 && arg7 >= var15 && arg2 < var13.field1299 + var14 && arg7 < var13.field1296 + var15) {
                            this.field447[this.field117] = var13.field1264;
                            this.field256[this.field117] = 915;
                            this.field255[this.field117] = var13.field1303;
                            ++this.field117;
                        }
                        if (var13.field1313 == 6 && !this.field291 && arg2 >= var14 && arg7 >= var15 && arg2 < var13.field1299 + var14 && arg7 < var13.field1296 + var15) {
                            this.field447[this.field117] = var13.field1264;
                            this.field256[this.field117] = 43;
                            this.field255[this.field117] = var13.field1303;
                            ++this.field117;
                        }
                        if (var13.field1279 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1296; ++var19) {
                                for (int var20 = 0; var20 < var13.field1299; ++var20) {
                                    int var21 = (var13.field1305 + 32) * var20 + var14;
                                    int var22 = (var13.field1261 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1294[var18];
                                        var22 += var13.field1307[var18];
                                    }
                                    if (arg2 >= var21 && arg7 >= var22 && arg2 < var21 + 32 && arg7 < var22 + 32) {
                                        this.field274 = var18;
                                        this.field275 = var13.field1303;
                                        if (var13.field1250[var18] > 0) {
                                            class60 var23 = class60.method554(var13.field1250[var18] - 1);
                                            if (this.field182 == 1 && var13.field1282) {
                                                if (this.field184 != var13.field1303 || this.field183 != var18) {
                                                    this.field447[this.field117] = "Use " + this.field186 + " with @lre@" + var23.field1541;
                                                    this.field256[this.field117] = 402;
                                                    this.field257[this.field117] = var23.field1506;
                                                    this.field254[this.field117] = var18;
                                                    this.field255[this.field117] = var13.field1303;
                                                    ++this.field117;
                                                }
                                            } else if (this.field187 == 1 && var13.field1282) {
                                                if ((this.field189 & 16) == 16) {
                                                    this.field447[this.field117] = this.field190 + " @lre@" + var23.field1541;
                                                    this.field256[this.field117] = 987;
                                                    this.field257[this.field117] = var23.field1506;
                                                    this.field254[this.field117] = var18;
                                                    this.field255[this.field117] = var13.field1303;
                                                    ++this.field117;
                                                }
                                            } else {
                                                if (var13.field1282) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1509 != null && var23.field1509[var24] != null) {
                                                            this.field447[this.field117] = var23.field1509[var24] + " @lre@" + var23.field1541;
                                                            if (var24 == 3) {
                                                                this.field256[this.field117] = 273;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field256[this.field117] = 377;
                                                            }
                                                            this.field257[this.field117] = var23.field1506;
                                                            this.field254[this.field117] = var18;
                                                            this.field255[this.field117] = var13.field1303;
                                                            ++this.field117;
                                                        } else if (var24 == 4) {
                                                            this.field447[this.field117] = "Drop @lre@" + var23.field1541;
                                                            this.field256[this.field117] = 377;
                                                            this.field257[this.field117] = var23.field1506;
                                                            this.field254[this.field117] = var18;
                                                            this.field255[this.field117] = var13.field1303;
                                                            ++this.field117;
                                                        }
                                                    }
                                                }
                                                if (var13.field1275) {
                                                    this.field447[this.field117] = "Use @lre@" + var23.field1541;
                                                    this.field256[this.field117] = 138;
                                                    this.field257[this.field117] = var23.field1506;
                                                    this.field254[this.field117] = var18;
                                                    this.field255[this.field117] = var13.field1303;
                                                    ++this.field117;
                                                }
                                                if (var13.field1282 && var23.field1509 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1509[var25] != null) {
                                                            this.field447[this.field117] = var23.field1509[var25] + " @lre@" + var23.field1541;
                                                            if (var25 == 0) {
                                                                this.field256[this.field117] = 495;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field256[this.field117] = 220;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field256[this.field117] = 34;
                                                            }
                                                            this.field257[this.field117] = var23.field1506;
                                                            this.field254[this.field117] = var18;
                                                            this.field255[this.field117] = var13.field1303;
                                                            ++this.field117;
                                                        }
                                                    }
                                                }
                                                if (var13.field1244 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1244[var26] != null) {
                                                            this.field447[this.field117] = var13.field1244[var26] + " @lre@" + var23.field1541;
                                                            if (var26 == 0) {
                                                                this.field256[this.field117] = 971;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field256[this.field117] = 364;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field256[this.field117] = 855;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field256[this.field117] = 817;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field256[this.field117] = 168;
                                                            }
                                                            this.field257[this.field117] = var23.field1506;
                                                            this.field254[this.field117] = var18;
                                                            this.field255[this.field117] = var13.field1303;
                                                            ++this.field117;
                                                        }
                                                    }
                                                }
                                                this.field447[this.field117] = "Examine @lre@" + var23.field1541;
                                                this.field256[this.field117] = 1759;
                                                this.field257[this.field117] = var23.field1506;
                                                this.field254[this.field117] = var18;
                                                this.field255[this.field117] = var13.field1303;
                                                ++this.field117;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
                if (arg3 != 0) {
                    this.field200 = this.field546.method369();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field215 = Integer.parseInt(this.getParameter("nodeid"));
        field216 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method49(field351);
        } else {
            method94(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field217 = false;
        } else {
            field217 = true;
        }
        this.method247(503, (byte) 5, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method51(int arg0, String arg1, int arg2) {
        this.field77 = arg0;
        this.field300 = arg1;
        if (arg2 >= 0) {
            this.method113();
        }
        this.method28(true);
        if (this.field500 == null) {
            super.method51(arg0, arg1, -71);
        } else {
            this.field243.method298(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field475.method589(16777215, var4 / 2, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", (byte) 119);
            int var7 = var5 / 2 - 18 - var6;
            class21.method290(34, 9179409, 0, var4 / 2 - 152, 304, var7);
            class21.method290(32, 0, 0, var4 / 2 - 151, 302, var7 + 1);
            class21.method289(arg0 * 3, 2, var4 / 2 - 150, 9179409, var7 + 2, 30);
            class21.method289(300 - arg0 * 3, 2, arg0 * 3 + (var4 / 2 - 150), 0, var7 + 2, 30);
            this.field475.method589(16777215, var4 / 2, var5 / 2 + 5 - var6, arg1, (byte) 119);
            this.field243.method299(super.field795, 202, 0, 171);
            if (this.field74) {
                this.field74 = false;
                if (!this.field306) {
                    this.field244.method299(super.field795, 0, 0, 0);
                    this.field245.method299(super.field795, 637, 0, 0);
                }
                this.field241.method299(super.field795, 128, 0, 0);
                this.field242.method299(super.field795, 202, 0, 371);
                this.field246.method299(super.field795, 0, 0, 265);
                this.field247.method299(super.field795, 562, 0, 265);
                this.field248.method299(super.field795, 128, 0, 171);
                this.field249.method299(super.field795, 562, 0, 171);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
        this.field466.method298(0);
        class6.field589 = this.field516;
        this.field413.method586(-4899, 0, 0);
        if (this.field68) {
            this.field475.method589(0, 239, 40, this.field304, (byte) 119);
            this.field475.method589(128, 239, 60, this.field308 + "*", (byte) 119);
        } else if (this.field62 == 1) {
            this.field475.method589(0, 239, 40, "Enter amount:", (byte) 119);
            this.field475.method589(128, 239, 60, this.field438 + "*", (byte) 119);
        } else if (this.field62 == 2) {
            this.field475.method589(0, 239, 40, "Enter name:", (byte) 119);
            this.field475.method589(128, 239, 60, this.field438 + "*", (byte) 119);
        } else if (this.field62 == 3) {
            if (this.field63 != this.field438) {
                this.method141(this.field438, true);
                this.field63 = this.field438;
            }
            class71 var2 = this.field474;
            class21.method286(0, 0, (byte) 21, 463, 77);
            for (int var3 = 0; var3 < this.field64; ++var3) {
                int var4 = var3 * 14 + 18 - this.field67;
                if (var4 > 0 && var4 < 110) {
                    var2.method589(0, 239, var4, this.field65[var3], (byte) 119);
                }
            }
            class21.method285(632);
            if (this.field64 > 5) {
                this.method38(463, 0, this.field64 * 14 + 7, this.field67, 227, 77);
            }
            if (this.field438.length() == 0) {
                this.field475.method589(255, 239, 40, "Enter object name", (byte) 119);
            } else if (this.field64 == 0) {
                this.field475.method589(0, 239, 40, "No matching objects found, please shorten search", (byte) 119);
            }
            var2.method589(0, 239, 90, this.field438 + "*", (byte) 119);
            class21.method292(479, 0, 0, 77, 0);
        } else if (this.field131 != null) {
            this.field475.method589(0, 239, 40, this.field131, (byte) 119);
            this.field475.method589(128, 239, 60, "Click to continue", (byte) 119);
        } else if (this.field368 != -1) {
            this.method35(0, 0, class44.method460(this.field368), -545, 0);
        } else if (this.field138 != -1) {
            this.method35(0, 0, class44.method460(this.field138), -545, 0);
        } else {
            class71 var5 = this.field474;
            int var6 = 0;
            class21.method286(0, 0, (byte) 21, 463, 77);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field346[var7] != null) {
                    int var9 = this.field344[var7];
                    int var10 = 70 - var6 * 14 + this.field358;
                    String var11 = this.field345[var7];
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
                            var5.method593(this.field346[var7], var10, 4, 0, -32001);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field234 == 0 || this.field234 == 1 && this.method12(var11, (byte) 9))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field354[0].method586(-4899, var13, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field354[1].method586(-4899, var13, var10 - 12);
                                var13 += 14;
                            }
                            var5.method593(var11 + ":", var10, var13, 0, -32001);
                            int var14 = var13 + var5.method591(var11, this.field543) + 8;
                            var5.method593(this.field346[var7], var10, var14, 255, -32001);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field81 == 0 && (var9 == 7 || this.field88 == 0 || this.field88 == 1 && this.method12(var11, (byte) 9))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method593("From", var10, var15, 0, -32001);
                            int var16 = var15 + var5.method591("From ", this.field543);
                            if (var12 == 1) {
                                this.field354[0].method586(-4899, var16, var10 - 12);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field354[1].method586(-4899, var16, var10 - 12);
                                var16 += 14;
                            }
                            var5.method593(var11 + ":", var10, var16, 0, -32001);
                            int var17 = var16 + var5.method591(var11, this.field543) + 8;
                            var5.method593(this.field346[var7], var10, var17, 8388608, -32001);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field76 == 0 || this.field76 == 1 && this.method12(var11, (byte) 9))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method593(var11 + " " + this.field346[var7], var10, 4, 8388736, -32001);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field81 == 0 && this.field88 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method593(this.field346[var7], var10, 4, 8388608, -32001);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field81 == 0 && this.field88 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method593("To " + var11 + ":", var10, 4, 0, -32001);
                            var5.method593(this.field346[var7], var10, 12 + var5.method591("To " + var11, this.field543), 8388608, -32001);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field76 == 0 || this.field76 == 1 && this.method12(var11, (byte) 9))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method593(var11 + " " + this.field346[var7], var10, 4, 8270336, -32001);
                        }
                        ++var6;
                    }
                }
            }
            class21.method285(632);
            this.field360 = var6 * 14 + 7;
            if (this.field360 < 78) {
                this.field360 = 78;
            }
            this.method38(463, 0, this.field360, this.field360 - this.field358 - 77, 227, 77);
            String var8;
            if (field124 != null && field124.field1423 != null) {
                var8 = field124.field1423;
            } else {
                var8 = class40.method444(true, this.field450);
            }
            var5.method593(var8 + ":", 90, 4, 0, -32001);
            var5.method593(this.field407 + "*", 90, 6 + var5.method591(var8 + ": ", this.field543), 255, -32001);
            class21.method292(479, 0, 0, 77, 0);
        }
        if (this.field507 && this.field162 == 2) {
            this.method143(614);
        }
        this.field466.method299(super.field795, 17, 0, 357);
        if (arg0) {
            this.field235 = null;
        }
        this.field465.method298(0);
        class6.field589 = this.field518;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method53(boolean arg0) {
        for (int var2 = -1; var2 < this.field208; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field206;
            } else {
                var6 = this.field209[var2];
            }
            class51 var7 = this.field207[var6];
            if (var7 != null && var7.field1150 > 0) {
                --var7.field1150;
                if (var7.field1150 == 0) {
                    var7.field1164 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field341; ++var3) {
            int var4 = this.field342[var3];
            class49 var5 = this.field340[var4];
            if (var5 != null && var5.field1150 > 0) {
                --var5.field1150;
                if (var5.field1150 == 0) {
                    var5.field1164 = null;
                }
            }
        }
        if (arg0) {
            field383 = this.field232.method424();
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method54(int arg0) {
        if (this.field406 > 1) {
            --this.field406;
        }
        if (this.field203 > 0) {
            --this.field203;
        }
        for (int var2 = 0; var2 < 5 && this.method83(-37766); ++var2) {
        }
        if (arg0 < 0) {
            if (this.field318) {
                Object var3 = this.field439.field892;
                synchronized (this.field439.field892) {
                    if (!field495) {
                        this.field439.field889 = 0;
                    } else if (super.field809 != 0 || this.field439.field889 >= 40) {
                        this.field92.method358(7793, 212);
                        this.field92.method359(0);
                        int var4 = this.field92.field1032;
                        int var5 = 0;
                        for (int var6 = 0; var6 < this.field439.field889 && var4 - this.field92.field1032 < 240; ++var6) {
                            ++var5;
                            int var7 = this.field439.field887[var6];
                            if (var7 < 0) {
                                var7 = 0;
                            } else if (var7 > 502) {
                                var7 = 502;
                            }
                            int var8 = this.field439.field891[var6];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 764) {
                                var8 = 764;
                            }
                            int var9 = var7 * 765 + var8;
                            if (this.field439.field887[var6] == -1 && this.field439.field891[var6] == -1) {
                                var8 = -1;
                                var7 = -1;
                                var9 = 524287;
                            }
                            if (this.field213 == var8 && this.field214 == var7) {
                                if (this.field501 < 2047) {
                                    ++this.field501;
                                }
                            } else {
                                int var10 = var8 - this.field213;
                                this.field213 = var8;
                                int var11 = var7 - this.field214;
                                this.field214 = var7;
                                if (this.field501 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                    var10 += 32;
                                    var11 += 32;
                                    this.field92.method360((this.field501 << 12) + (var10 << 6) + var11);
                                    this.field501 = 0;
                                } else if (this.field501 < 8) {
                                    this.field92.method362((this.field501 << 19) + 8388608 + var9);
                                    this.field501 = 0;
                                } else {
                                    this.field92.method363((this.field501 << 19) + -1073741824 + var9);
                                    this.field501 = 0;
                                }
                            }
                        }
                        this.field92.method368(this.field92.field1032 - var4, 8);
                        if (var5 >= this.field439.field889) {
                            this.field439.field889 = 0;
                        } else {
                            this.field439.field889 -= var5;
                            for (int var12 = 0; var12 < this.field439.field889; ++var12) {
                                this.field439.field891[var12] = this.field439.field891[var5 + var12];
                                this.field439.field887[var12] = this.field439.field887[var5 + var12];
                            }
                        }
                    }
                }
                if (super.field809 != 0) {
                    long var13 = (super.field812 - this.field310) / 50L;
                    if (var13 > 4095L) {
                        var13 = 4095L;
                    }
                    this.field310 = super.field812;
                    int var15 = super.field811;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 502) {
                        var15 = 502;
                    }
                    int var16 = super.field810;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > 764) {
                        var16 = 764;
                    }
                    int var17 = var15 * 765 + var16;
                    byte var18 = 0;
                    if (super.field809 == 2) {
                        var18 = 1;
                    }
                    int var19 = (int) var13;
                    this.field92.method358(7793, 41);
                    this.field92.method401((var18 << 19) + (var19 << 20) + var17, (byte) 2);
                }
                if (this.field331 > 0) {
                    --this.field331;
                }
                if (super.field813[1] == 1 || super.field813[2] == 1 || super.field813[3] == 1 || super.field813[4] == 1) {
                    this.field332 = true;
                }
                if (this.field332 && this.field331 <= 0) {
                    this.field331 = 20;
                    this.field332 = false;
                    this.field92.method358(7793, 81);
                    this.field92.method392(this.field59, false);
                    this.field92.method393(this.field58, (byte) 1);
                }
                if (super.field800 && !this.field149) {
                    this.field149 = true;
                    this.field92.method358(7793, 46);
                    this.field92.method359(1);
                }
                if (!super.field800 && this.field149) {
                    this.field149 = false;
                    this.field92.method358(7793, 46);
                    this.field92.method359(0);
                }
                this.method89(0);
                this.method31(493);
                this.method79((byte) 58);
                ++this.field201;
                if (this.field201 > 750) {
                    this.method37(false);
                }
                this.method132(2);
                this.method17(true);
                this.method53(this.field173);
                ++this.field116;
                if (this.field86 != 0) {
                    this.field85 += 20;
                    if (this.field85 >= 400) {
                        this.field86 = 0;
                    }
                }
                if (this.field287 != 0) {
                    ++this.field284;
                    if (this.field284 >= 15) {
                        if (this.field287 == 2) {
                            this.field554 = true;
                        }
                        if (this.field287 == 3) {
                            this.field528 = true;
                        }
                        this.field287 = 0;
                    }
                }
                if (this.field550 != 0) {
                    ++this.field409;
                    if (super.field803 > this.field551 + 5 || super.field803 < this.field551 - 5 || super.field804 > this.field552 + 5 || super.field804 < this.field552 - 5) {
                        this.field172 = true;
                    }
                    if (super.field802 == 0) {
                        if (this.field550 == 2) {
                            this.field554 = true;
                        }
                        if (this.field550 == 3) {
                            this.field528 = true;
                        }
                        this.field550 = 0;
                        if (this.field172 && this.field409 >= 5) {
                            this.field275 = -1;
                            this.method121(-597);
                            if (this.field548 == this.field275 && this.field549 != this.field274) {
                                class44 var20 = class44.method460(this.field548);
                                byte var21 = 0;
                                if (this.field397 == 1 && var20.field1243 == 206) {
                                    var21 = 1;
                                }
                                if (var20.field1250[this.field274] <= 0) {
                                    var21 = 0;
                                }
                                if (var20.field1291) {
                                    int var22 = this.field549;
                                    int var23 = this.field274;
                                    var20.field1250[var23] = var20.field1250[var22];
                                    var20.field1255[var23] = var20.field1255[var22];
                                    var20.field1250[var22] = -1;
                                    var20.field1255[var22] = 0;
                                } else if (var21 == 1) {
                                    int var24 = this.field549;
                                    int var25 = this.field274;
                                    while (var24 != var25) {
                                        if (var24 > var25) {
                                            var20.method459(true, var24 - 1, var24);
                                            --var24;
                                        } else if (var24 < var25) {
                                            var20.method459(true, var24 + 1, var24);
                                            ++var24;
                                        }
                                    }
                                } else {
                                    var20.method459(true, this.field274, this.field549);
                                }
                                this.field92.method358(7793, 198);
                                this.field92.method393(this.field548, (byte) 1);
                                this.field92.method385(0, var21);
                                this.field92.method360(this.field274);
                                this.field92.method360(this.field549);
                            }
                        } else if ((this.field367 == 1 || this.method114(false, this.field117 - 1)) && this.field117 > 2) {
                            this.method56(3);
                        } else if (this.field117 > 0) {
                            this.method86(this.field117 - 1, 413);
                        }
                        this.field284 = 10;
                        super.field809 = 0;
                    }
                }
                if (class48.field1372 != -1) {
                    int var26 = class48.field1372;
                    int var27 = class48.field1373;
                    boolean var28 = this.method76(field124.field1132[0], this.field57, 0, 0, 0, 0, 0, var27, true, field124.field1133[0], 0, var26);
                    class48.field1372 = -1;
                    if (var28) {
                        this.field83 = super.field810;
                        this.field84 = super.field811;
                        this.field86 = 1;
                        this.field85 = 0;
                    }
                }
                if (super.field809 == 1 && this.field131 != null) {
                    this.field131 = null;
                    this.field528 = true;
                    super.field809 = 0;
                }
                this.method134(11405);
                if (this.field139 == -1) {
                    this.method44(true);
                    this.method34(-346);
                    this.method46(this.field303);
                }
                if (super.field802 == 1 || super.field809 == 1) {
                    ++this.field204;
                }
                if (this.field486 == 0 && this.field335 == 0 && this.field327 == 0) {
                    if (this.field120 > 0) {
                        --this.field120;
                    }
                } else if (this.field120 < 100) {
                    ++this.field120;
                    if (this.field120 == 100) {
                        if (this.field486 != 0) {
                            this.field528 = true;
                        }
                        if (this.field335 != 0) {
                            this.field554 = true;
                        }
                    }
                }
                if (this.field290 == 2) {
                    this.method150(438);
                }
                if (this.field290 == 2 && this.field366) {
                    this.method139(true);
                }
                for (int var29 = 0; var29 < 5; ++var29) {
                    int var10002 = this.field328[var29]++;
                }
                this.method135(-979);
                ++super.field801;
                if (super.field801 > 4500) {
                    this.field203 = 250;
                    super.field801 -= 500;
                    this.field92.method358(7793, 51);
                }
                ++this.field485;
                if (this.field485 > 500) {
                    this.field485 = 0;
                    int var30 = (int) (Math.random() * 8.0D);
                    if ((var30 & 1) == 1) {
                        this.field113 += this.field114;
                    }
                    if ((var30 & 2) == 2) {
                        this.field269 += this.field270;
                    }
                    if ((var30 & 4) == 4) {
                        this.field258 += this.field259;
                    }
                }
                if (this.field113 < -50) {
                    this.field114 = 2;
                }
                if (this.field113 > 50) {
                    this.field114 = -2;
                }
                if (this.field269 < -55) {
                    this.field270 = 2;
                }
                if (this.field269 > 55) {
                    this.field270 = -2;
                }
                if (this.field258 < -40) {
                    this.field259 = 1;
                }
                if (this.field258 > 40) {
                    this.field259 = -1;
                }
                ++this.field73;
                if (this.field73 > 500) {
                    this.field73 = 0;
                    int var31 = (int) (Math.random() * 8.0D);
                    if ((var31 & 1) == 1) {
                        this.field470 += this.field471;
                    }
                    if ((var31 & 2) == 2) {
                        this.field529 += this.field530;
                    }
                }
                if (this.field470 < -60) {
                    this.field471 = 2;
                }
                if (this.field470 > 60) {
                    this.field471 = -2;
                }
                if (this.field529 < -20) {
                    this.field530 = 1;
                }
                if (this.field529 > 10) {
                    this.field530 = -1;
                }
                ++this.field202;
                if (this.field202 > 50) {
                    this.field92.method358(7793, 100);
                }
                try {
                    if (this.field314 != null && this.field92.field1032 > 0) {
                        this.field314.method282(0, false, this.field92.field1031, this.field92.field1032);
                        this.field92.field1032 = 0;
                        this.field202 = 0;
                    }
                } catch (IOException var33) {
                    this.method37(false);
                } catch (Exception var34) {
                    this.method72(-852);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method55(int arg0) {
        try {
            this.field288 = -1;
            this.field363.method453();
            this.field319.method453();
            ++field294;
            if (field294 > 62) {
                field294 = 0;
                this.field92.method358(7793, 69);
            }
            class6.method172((byte) 2);
            this.method69(this.field115);
            this.field176.method471((byte) -70);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field520[var2].method157();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field156[var3][var4][var5] = 0;
                    }
                }
            }
            class16 var6 = new class16(this.field156, 104, this.field87, 104, this.field355);
            int var7 = this.field381.length;
            this.field92.method358(7793, 100);
            if (!this.field307) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field521[var8] >> 8) * 64 - this.field168;
                    int var10 = (this.field521[var8] & 255) * 64 - this.field169;
                    byte[] var11 = this.field381[var8];
                    if (var11 != null) {
                        var6.method272((this.field362 - 6) * 8, var10, this.field520, (this.field361 - 6) * 8, var9, 28908, var11);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field521[var12] >> 8) * 64 - this.field168;
                    int var14 = (this.field521[var12] & 255) * 64 - this.field169;
                    byte[] var15 = this.field381[var12];
                    if (var15 == null && this.field362 < 800) {
                        var6.method271(this.field541, 64, var13, 64, var14);
                    }
                }
                this.field92.method358(7793, 100);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field487[var16];
                    if (var17 != null) {
                        int var18 = (this.field521[var16] >> 8) * 64 - this.field168;
                        int var19 = (this.field521[var16] & 255) * 64 - this.field169;
                        var6.method268(var18, this.field425, var19, this.field176, var17, this.field520);
                    }
                }
            }
            if (this.field307) {
                int var20 = 0;
                label260: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field497[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method271(this.field541, 8, var31 * 8, 8, var32 * 8);
                                }
                            }
                        }
                        this.field92.method358(7793, 100);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label260;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field497[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field521.length; ++var43) {
                                            if (this.field521[var43] == var42 && this.field487[var43] != null) {
                                                var6.method255(this.field520, var35 * 8, (var40 & 7) * 8, var36 * 8, var38, var34, (byte) 7, var39, this.field487[var43], this.field176, (var41 & 7) * 8);
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
                            int var24 = this.field497[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field521.length; ++var30) {
                                    if (this.field521[var30] == var29 && this.field381[var30] != null) {
                                        var6.method259((var28 & 7) * 8, this.field520, this.field381[var30], (var27 & 7) * 8, var25, var22 * 8, -828, var26, var20, var21 * 8);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method261(false, var20, var22 * 8, var21 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field92.method358(7793, 100);
            var6.method273(this.field176, this.field520, false);
            if (this.field465 != null) {
                this.field465.method298(0);
                class6.field589 = this.field518;
            }
            this.field92.method358(7793, 100);
            int var44 = class16.field883;
            if (var44 > this.field220) {
                var44 = this.field220;
            }
            if (var44 < this.field220 - 1) {
                int var45 = this.field220 - 1;
            }
            if (field218) {
                this.field176.method472(class16.field883, -40620);
            } else {
                this.field176.method472(0, -40620);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method118(var46, var47);
                }
            }
            this.method108(4);
        } catch (Exception var60) {
        }
        class34.field1109.method531();
        if (arg0 > 0) {
            if (super.field798 != null) {
                this.field92.method358(7793, 164);
                this.field92.method363(1057001181);
            }
            if (field218 && signlink.cache_dat != null) {
                int var49 = this.field82.method235(0, false);
                for (int var50 = 0; var50 < var49; ++var50) {
                    int var51 = this.field82.method229(field130, var50);
                    if ((var51 & 121) == 0) {
                        class8.method195(0, var50);
                    }
                }
            }
            System.gc();
            class6.method173((byte) 2, 20);
            this.field82.method234(this.field498);
            int var52 = (this.field361 - 6) / 8 - 1;
            int var53 = (this.field361 + 6) / 8 + 1;
            int var54 = (this.field362 - 6) / 8 - 1;
            int var55 = (this.field362 + 6) / 8 + 1;
            if (this.field492) {
                var52 = 49;
                var53 = 50;
                var54 = 49;
                var55 = 50;
            }
            for (int var56 = var52; var56 <= var53; ++var56) {
                for (int var57 = var54; var57 <= var55; ++var57) {
                    if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                        int var58 = this.field82.method236(var57, 0, 0, var56);
                        if (var58 != -1) {
                            this.field82.method228(0, var58, 3);
                        }
                        int var59 = this.field82.method236(var57, 1, 0, var56);
                        if (var59 != -1) {
                            this.field82.method228(0, var59, 3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method56(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field89 = !this.field89;
        }
        int var2 = this.field475.method591("Choose Option", this.field543);
        for (int var3 = 0; var3 < this.field117; ++var3) {
            int var11 = this.field475.method591(this.field447[var3], this.field543);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field117 * 15 + 21;
        if (super.field810 > 4 && super.field811 > 4 && super.field810 < 516 && super.field811 < 338) {
            int var5 = super.field810 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field811 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field507 = true;
            this.field162 = 0;
            this.field163 = var5;
            this.field164 = var6;
            this.field165 = var2;
            this.field166 = this.field117 * 15 + 22;
        }
        if (super.field810 > 553 && super.field811 > 205 && super.field810 < 743 && super.field811 < 466) {
            int var7 = super.field810 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field811 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field507 = true;
            this.field162 = 1;
            this.field163 = var7;
            this.field164 = var8;
            this.field165 = var2;
            this.field166 = this.field117 * 15 + 22;
        }
        if (super.field810 > 17 && super.field811 > 357 && super.field810 < 496 && super.field811 < 453) {
            int var9 = super.field810 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field811 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field507 = true;
            this.field162 = 2;
            this.field163 = var9;
            this.field164 = var10;
            this.field165 = var2;
            this.field166 = this.field117 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method57(byte arg0) {
        if (arg0 != -22) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field798 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method58(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method58(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    private static final String method59(int arg0, byte arg1) {
        String var2 = String.valueOf(arg0);
        if (arg1 != 119) {
            field322 = -305;
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

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method60(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field74 = true;
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method61(int arg0) {
        if (this.field81 != 0) {
            class71 var2 = this.field474;
            int var3 = 0;
            if (this.field406 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field346[var4] != null) {
                    int var5 = this.field344[var4];
                    String var6 = this.field345[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field88 == 0 || this.field88 == 1 && this.method12(var6, (byte) 9))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method593("From", var8, var9, 0, -32001);
                        var2.method593("From", var8 - 1, var9, 65535, -32001);
                        int var10 = var9 + var2.method591("From ", this.field543);
                        if (var7 == 1) {
                            this.field354[0].method586(-4899, var10, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field354[1].method586(-4899, var10, var8 - 12);
                            var10 += 14;
                        }
                        var2.method593(var6 + ": " + this.field346[var4], var8, var10, 0, -32001);
                        var2.method593(var6 + ": " + this.field346[var4], var8 - 1, var10, 65535, -32001);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field88 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method593(this.field346[var4], var11, 4, 0, -32001);
                        var2.method593(this.field346[var4], var11 - 1, 4, 65535, -32001);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field88 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method593("To " + var6 + ": " + this.field346[var4], var12, 4, 0, -32001);
                        var2.method593("To " + var6 + ": " + this.field346[var4], var12 - 1, 4, 65535, -32001);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field199 += arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method62(int arg0) {
        this.field199 += arg0;
        Graphics var2 = this.method65(true).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method249(1, -92);
        if (this.field167) {
            this.field306 = false;
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
        if (this.field297) {
            this.field306 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field197) {
            this.field306 = false;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method63(int arg0, boolean arg1) {
        int[] var3 = this.field223.field1492;
        int var4 = var3.length;
        if (!arg1) {
            this.method113();
        }
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field156[arg0][var25][var6] & 24) == 0) {
                    this.field176.method506(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (this.field156[arg0 + 1][var25][var6] & 8) != 0) {
                    this.field176.method506(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field223.method536(0);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field156[arg0][var23][var9] & 24) == 0) {
                    this.method144((byte) -21, arg0, var7, var23, var8, var9);
                }
                if (arg0 < 3 && (this.field156[arg0 + 1][var23][var9] & 8) != 0) {
                    this.method144((byte) -21, arg0 + 1, var7, var23, var8, var9);
                }
            }
        }
        if (this.field465 != null) {
            this.field465.method298(0);
            class6.field589 = this.field518;
        }
        this.field537 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field176.method500(this.field220, var10, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class34.method409(var14).field1074;
                    if (var15 >= 0) {
                        int var16 = var10;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field520[this.field220].field575;
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
                        this.field467[this.field537] = this.field155[var15];
                        this.field538[this.field537] = var16;
                        this.field539[this.field537] = var17;
                        ++this.field537;
                    }
                }
            }
        }
        ++field338;
        if (field338 > 1809) {
            field338 = 0;
            this.field92.method358(7793, 84);
            this.field92.method359(0);
            int var11 = this.field92.field1032;
            this.field92.method360(62257);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field92.method359(110);
            }
            this.field92.method360(43331);
            this.field92.method360((int) (Math.random() * 65536.0D));
            this.field92.method360(25179);
            this.field92.method360((int) (Math.random() * 65536.0D));
            this.field92.method359((int) (Math.random() * 256.0D));
            this.field92.method360((int) (Math.random() * 65536.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field92.method360(9644);
            }
            this.field92.method360((int) (Math.random() * 65536.0D));
            this.field92.method368(this.field92.field1032 - var11, 8);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public void method64(boolean arg0) {
        System.out.println("============");
        if (arg0) {
            this.field101 = this.field232.method424();
        }
        System.out.println("flame-cycle:" + this.field312);
        if (this.field82 != null) {
            System.out.println("Od-cycle:" + this.field82.field749);
        }
        System.out.println("loop-cycle:" + field174);
        System.out.println("draw-cycle:" + field493);
        System.out.println("ptype:" + this.field200);
        System.out.println("psize:" + this.field199);
        if (this.field314 != null) {
            this.field314.method283(false);
        }
        super.field792 = true;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method65(boolean arg0) {
        this.field318 &= arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field798 != null ? super.field798 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        if (this.field182 == 0 && this.field187 == 0) {
            this.field447[this.field117] = "Walk here";
            this.field256[this.field117] = 158;
            this.field254[this.field117] = super.field803;
            this.field255[this.field117] = super.field804;
            ++this.field117;
        }
        int var2 = -1;
        if (arg0) {
            this.method113();
        }
        for (int var3 = 0; var3 < class8.field680; ++var3) {
            int var4 = class8.field681[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field176.method501(this.field220, var5, var6, var4) >= 0) {
                    class34 var9 = class34.method409(var8);
                    if (var9.field1082 != null) {
                        var9 = var9.method412(453);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field182 == 1) {
                        this.field447[this.field117] = "Use " + this.field186 + " with @cya@" + var9.field1093;
                        this.field256[this.field117] = 37;
                        this.field257[this.field117] = var4;
                        this.field254[this.field117] = var5;
                        this.field255[this.field117] = var6;
                        ++this.field117;
                    } else if (this.field187 == 1) {
                        if ((this.field189 & 4) == 4) {
                            this.field447[this.field117] = this.field190 + " @cya@" + var9.field1093;
                            this.field256[this.field117] = 894;
                            this.field257[this.field117] = var4;
                            this.field254[this.field117] = var5;
                            this.field255[this.field117] = var6;
                            ++this.field117;
                        }
                    } else {
                        if (var9.field1101 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1101[var10] != null) {
                                    this.field447[this.field117] = var9.field1101[var10] + " @cya@" + var9.field1093;
                                    if (var10 == 0) {
                                        this.field256[this.field117] = 649;
                                    }
                                    if (var10 == 1) {
                                        this.field256[this.field117] = 912;
                                    }
                                    if (var10 == 2) {
                                        this.field256[this.field117] = 224;
                                    }
                                    if (var10 == 3) {
                                        this.field256[this.field117] = 213;
                                    }
                                    if (var10 == 4) {
                                        this.field256[this.field117] = 1161;
                                    }
                                    this.field257[this.field117] = var4;
                                    this.field254[this.field117] = var5;
                                    this.field255[this.field117] = var6;
                                    ++this.field117;
                                }
                            }
                        }
                        this.field447[this.field117] = "Examine @cya@" + var9.field1093;
                        this.field256[this.field117] = 1509;
                        this.field257[this.field117] = var9.field1067 << 14;
                        this.field254[this.field117] = var5;
                        this.field255[this.field117] = var6;
                        ++this.field117;
                    }
                }
                if (var7 == 1) {
                    class49 var11 = this.field340[var8];
                    if (var11.field1402.field1597 == 1 && (var11.field1134 & 127) == 64 && (var11.field1135 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field341; ++var12) {
                            class49 var15 = this.field340[this.field342[var12]];
                            if (var15 != null && var11 != var15 && var15.field1402.field1597 == 1 && var11.field1134 == var15.field1134 && var11.field1135 == var15.field1135) {
                                this.method142(this.field342[var12], var15.field1402, (byte) 5, var5, var6);
                            }
                        }
                        for (int var13 = 0; var13 < this.field208; ++var13) {
                            class51 var14 = this.field207[this.field209[var13]];
                            if (var14 != null && var11.field1134 == var14.field1134 && var11.field1135 == var14.field1135) {
                                this.method95(var14, var5, (byte) -49, var6, this.field209[var13]);
                            }
                        }
                    }
                    this.method142(var8, var11.field1402, (byte) 5, var5, var6);
                }
                if (var7 == 0) {
                    class51 var16 = this.field207[var8];
                    if ((var16.field1134 & 127) == 64 && (var16.field1135 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field341; ++var17) {
                            class49 var20 = this.field340[this.field342[var17]];
                            if (var20 != null && var20.field1402.field1597 == 1 && var16.field1134 == var20.field1134 && var16.field1135 == var20.field1135) {
                                this.method142(this.field342[var17], var20.field1402, (byte) 5, var5, var6);
                            }
                        }
                        for (int var18 = 0; var18 < this.field208; ++var18) {
                            class51 var19 = this.field207[this.field209[var18]];
                            if (var19 != null && var16 != var19 && var16.field1134 == var19.field1134 && var16.field1135 == var19.field1135) {
                                this.method95(var19, var5, (byte) -49, var6, this.field209[var18]);
                            }
                        }
                    }
                    this.method95(var16, var5, (byte) -49, var6, var8);
                }
                if (var7 == 3) {
                    class42 var21 = this.field235[this.field220][var5][var6];
                    if (var21 != null) {
                        for (class52 var22 = (class52) var21.method450((byte) -110); var22 != null; var22 = (class52) var21.method452(-706)) {
                            class60 var23 = class60.method554(var22.field1433);
                            if (this.field182 == 1) {
                                this.field447[this.field117] = "Use " + this.field186 + " with @lre@" + var23.field1541;
                                this.field256[this.field117] = 989;
                                this.field257[this.field117] = var22.field1433;
                                this.field254[this.field117] = var5;
                                this.field255[this.field117] = var6;
                                ++this.field117;
                            } else if (this.field187 == 1) {
                                if ((this.field189 & 1) == 1) {
                                    this.field447[this.field117] = this.field190 + " @lre@" + var23.field1541;
                                    this.field256[this.field117] = 924;
                                    this.field257[this.field117] = var22.field1433;
                                    this.field254[this.field117] = var5;
                                    this.field255[this.field117] = var6;
                                    ++this.field117;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1527 != null && var23.field1527[var24] != null) {
                                        this.field447[this.field117] = var23.field1527[var24] + " @lre@" + var23.field1541;
                                        if (var24 == 0) {
                                            this.field256[this.field117] = 48;
                                        }
                                        if (var24 == 1) {
                                            this.field256[this.field117] = 357;
                                        }
                                        if (var24 == 2) {
                                            this.field256[this.field117] = 368;
                                        }
                                        if (var24 == 3) {
                                            this.field256[this.field117] = 670;
                                        }
                                        if (var24 == 4) {
                                            this.field256[this.field117] = 972;
                                        }
                                        this.field257[this.field117] = var22.field1433;
                                        this.field254[this.field117] = var5;
                                        this.field255[this.field117] = var6;
                                        ++this.field117;
                                    } else if (var24 == 2) {
                                        this.field447[this.field117] = "Take @lre@" + var23.field1541;
                                        this.field256[this.field117] = 368;
                                        this.field257[this.field117] = var22.field1433;
                                        this.field254[this.field117] = var5;
                                        this.field255[this.field117] = var6;
                                        ++this.field117;
                                    }
                                }
                                this.field447[this.field117] = "Examine @lre@" + var23.field1541;
                                this.field256[this.field117] = 1876;
                                this.field257[this.field117] = var22.field1433;
                                this.field254[this.field117] = var5;
                                this.field255[this.field117] = var6;
                                ++this.field117;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public final void method67(String arg0, String arg1, int arg2, int arg3) {
        if (this.field359 != arg3) {
            this.field355 = 117;
        }
        if (arg2 == 0 && this.field138 != -1) {
            this.field131 = arg0;
            super.field809 = 0;
        }
        if (this.field368 == -1) {
            this.field528 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field344[var5] = this.field344[var5 - 1];
            this.field345[var5] = this.field345[var5 - 1];
            this.field346[var5] = this.field346[var5 - 1];
        }
        this.field344[0] = arg2;
        this.field345[0] = arg1;
        this.field346[0] = arg0;
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method68(int arg0) {
        byte[] var2 = this.field500.method277("title.dat", (byte[]) null);
        class59 var3 = new class59(var2, this);
        this.field244.method298(0);
        var3.method539(143, 0, 0);
        this.field245.method298(0);
        var3.method539(143, -637, 0);
        while (arg0 >= 0) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
        this.field241.method298(0);
        var3.method539(143, -128, 0);
        this.field242.method298(0);
        var3.method539(143, -202, -371);
        this.field243.method298(0);
        var3.method539(143, -202, -171);
        this.field246.method298(0);
        var3.method539(143, 0, -265);
        this.field247.method298(0);
        var3.method539(143, -562, -265);
        this.field248.method298(0);
        var3.method539(143, -128, -171);
        this.field249.method298(0);
        var3.method539(143, -562, -171);
        int[] var4 = new int[var3.field1493];
        for (int var5 = 0; var5 < var3.field1494; ++var5) {
            for (int var10 = 0; var10 < var3.field1493; ++var10) {
                var4[var10] = var3.field1492[var3.field1493 * var5 + (var3.field1493 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1493; ++var11) {
                var3.field1492[var3.field1493 * var5 + var11] = var4[var11];
            }
        }
        this.field244.method298(0);
        var3.method539(143, 382, 0);
        this.field245.method298(0);
        var3.method539(143, -255, 0);
        this.field241.method298(0);
        var3.method539(143, 254, 0);
        this.field242.method298(0);
        var3.method539(143, 180, -371);
        this.field243.method298(0);
        var3.method539(143, 180, -171);
        this.field246.method298(0);
        var3.method539(143, 382, -265);
        this.field247.method298(0);
        var3.method539(143, -180, -265);
        this.field248.method298(0);
        var3.method539(143, 254, -171);
        this.field249.method298(0);
        var3.method539(143, -180, -171);
        class59 var6 = new class59(this.field500, "logo", 0);
        this.field241.method298(0);
        var6.method541(-4899, 382 - var6.field1493 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class45.field1317) {
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method69(byte arg0) {
        class34.field1109.method531();
        class34.field1104.method531();
        class64.field1581.method531();
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        class60.field1513.method531();
        class60.field1522.method531();
        class51.field1415.method531();
        class4.field55.method531();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LPQPZKUPU;I)Z")
    public final boolean method70(class44 arg0, int arg1) {
        if (arg1 != 12768) {
            throw new NullPointerException();
        } else {
            int var3 = arg0.field1243;
            if (this.field401 == 2) {
                if (var3 == 201) {
                    this.field528 = true;
                    this.field62 = 0;
                    this.field68 = true;
                    this.field308 = "";
                    this.field408 = 1;
                    this.field304 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field528 = true;
                    this.field62 = 0;
                    this.field68 = true;
                    this.field308 = "";
                    this.field408 = 2;
                    this.field304 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field203 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field528 = true;
                    this.field62 = 0;
                    this.field68 = true;
                    this.field308 = "";
                    this.field408 = 4;
                    this.field304 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field528 = true;
                    this.field62 = 0;
                    this.field68 = true;
                    this.field308 = "";
                    this.field408 = 5;
                    this.field304 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field405[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class7.field603 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class7.field603) {
                                    var6 = 0;
                                }
                            }
                            if (!class7.field604[var6].field610 && class7.field604[var6].field605 == var4 + (this.field394 ? 0 : 7)) {
                                this.field405[var4] = var6;
                                this.field336 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field477[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field151[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field151[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field477[var7] = var9;
                    this.field336 = true;
                }
                if (var3 == 324 && !this.field394) {
                    this.field394 = true;
                    this.method87(493);
                }
                if (var3 == 325 && this.field394) {
                    this.field394 = false;
                    this.method87(493);
                }
                if (var3 != 326) {
                    if (var3 == 620) {
                        this.field410 = !this.field410;
                    }
                    if (var3 >= 601 && var3 <= 613) {
                        this.method14(0);
                        if (this.field231.length() > 0) {
                            this.field92.method358(7793, 111);
                            this.field92.method365(class40.method440(this.field231), (byte) 56);
                            this.field92.method359(var3 - 601);
                            this.field92.method359(this.field410 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field92.method358(7793, 6);
                    this.field92.method359(this.field394 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field92.method359(this.field405[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field92.method359(this.field477[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (arg0 == 0) {
            this.method61(0);
            if (this.field86 == 1) {
                this.field309[this.field85 / 100].method541(-4899, this.field83 - 8 - 4, this.field84 - 8 - 4);
                ++field264;
                if (field264 > 1080) {
                    field264 = 0;
                    this.field92.method358(7793, 87);
                    this.field92.method359(0);
                    int var2 = this.field92.field1032;
                    this.field92.method360((int) (Math.random() * 65536.0D));
                    this.field92.method360(32682);
                    this.field92.method359((int) (Math.random() * 256.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field92.method360(12504);
                    }
                    this.field92.method360(3838);
                    this.field92.method360(9810);
                    this.field92.method360(62194);
                    this.field92.method359((int) (Math.random() * 256.0D));
                    this.field92.method359(58);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field92.method360(63841);
                    }
                    this.field92.method368(this.field92.field1032 - var2, 8);
                }
            }
            if (this.field86 == 2) {
                this.field309[this.field85 / 100 + 4].method541(-4899, this.field83 - 8 - 4, this.field84 - 8 - 4);
            }
            if (this.field399 != -1) {
                this.method27(this.field399, this.field116, (byte) 5);
                this.method35(0, 0, class44.method460(this.field399), -545, 0);
            }
            if (this.field542 != -1) {
                this.method27(this.field542, this.field116, (byte) 5);
                this.method35(0, 0, class44.method460(this.field542), -545, 0);
            }
            this.method26(this.field420);
            if (!this.field507) {
                this.method121(-597);
                this.method138(3);
            } else if (this.field162 == 0) {
                this.method143(614);
            }
            if (this.field179 == 1) {
                this.field266.method541(-4899, 472, 296);
            }
            if (field296) {
                short var3 = 507;
                byte var4 = 20;
                int var5 = 16776960;
                if (super.field791 < 30 && field218) {
                    var5 = 16711680;
                }
                if (super.field791 < 20 && !field218) {
                    var5 = 16711680;
                }
                this.field474.method588(var4, 0, var3, var5, "Fps:" + super.field791);
                int var14 = var4 + 15;
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                int var8 = 16776960;
                if (var7 > 33554432 && field218) {
                    int var9 = 16711680;
                }
                if (var7 > 67108864 && !field218) {
                    int var10 = 16711680;
                }
                this.field474.method588(var14, 0, var3, 16776960, "Mem:" + var7 + "k");
                var14 += 15;
            }
            if (this.field406 != 0) {
                int var11 = this.field406 / 50;
                int var12 = var11 / 60;
                int var13 = var11 % 60;
                if (var13 < 10) {
                    this.field474.method593("System update in: " + var12 + ":0" + var13, 329, 4, 16776960, -32001);
                } else {
                    this.field474.method593("System update in: " + var12 + ":" + var13, 329, 4, 16776960, -32001);
                }
                ++field553;
                if (field553 > 154) {
                    field553 = 0;
                    this.field92.method358(7793, 215);
                    this.field92.method360(2407);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method72(int arg0) {
        try {
            if (this.field314 != null) {
                this.field314.method278();
            }
        } catch (Exception var3) {
        }
        this.field314 = null;
        this.field318 = false;
        this.field228 = 0;
        this.field450 = "";
        this.field451 = "";
        while (arg0 >= 0) {
            this.method113();
        }
        this.method69(this.field115);
        this.field176.method471((byte) -70);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field520[var2].method157();
        }
        System.gc();
        this.method106((byte) -65);
        this.field311 = -1;
        this.field531 = -1;
        this.field305 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method73(String arg0, int arg1, String arg2) {
        this.field199 += arg1;
        if (this.field465 != null) {
            this.field465.method298(0);
            class6.field589 = this.field518;
            int var4 = 151;
            if (arg0 != null) {
                var4 -= 7;
            }
            this.field474.method589(0, 257, var4, arg2, (byte) 119);
            this.field474.method589(16777215, 256, var4 - 1, arg2, (byte) 119);
            var4 += 15;
            if (arg0 != null) {
                this.field474.method589(0, 257, var4, arg0, (byte) 119);
                this.field474.method589(16777215, 256, var4 - 1, arg0, (byte) 119);
            }
            this.field465.method299(super.field795, 4, 0, 4);
        } else if (super.field796 != null) {
            super.field796.method298(0);
            class6.field589 = this.field519;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class21.method289(var6, 2, 383 - var6 / 2, 0, var5 - 5 - var7 / 2, var7);
            class21.method290(var7, 16777215, 0, 383 - var6 / 2, var6, var5 - 5 - var7 / 2);
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field474.method589(0, 383, var5, arg2, (byte) 119);
            this.field474.method589(16777215, 382, var5 - 1, arg2, (byte) 119);
            var5 += 15;
            if (arg0 != null) {
                this.field474.method589(0, 383, var5, arg0, (byte) 119);
                this.field474.method589(16777215, 382, var5 - 1, arg0, (byte) 119);
            }
            super.field796.method299(super.field795, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    public final void method74(boolean arg0) {
        class39 var2 = (class39) this.field319.method449();
        if (!arg0) {
            this.field100 = !this.field100;
        }
        while (var2 != null) {
            if (this.field220 == var2.field1212 && field174 <= var2.field1214) {
                if (field174 >= var2.field1213) {
                    if (var2.field1217 > 0) {
                        class49 var3 = this.field340[var2.field1217 - 1];
                        if (var3 != null && var3.field1134 >= 0 && var3.field1134 < 13312 && var3.field1135 >= 0 && var3.field1135 < 13312) {
                            var2.method438(var3.field1135, var3.field1134, this.method147(var3.field1134, 0, var2.field1212, var3.field1135) - var2.field1206, false, field174);
                        }
                    }
                    if (var2.field1217 < 0) {
                        int var4 = -var2.field1217 - 1;
                        class51 var5;
                        if (this.field454 == var4) {
                            var5 = field124;
                        } else {
                            var5 = this.field207[var4];
                        }
                        if (var5 != null && var5.field1134 >= 0 && var5.field1134 < 13312 && var5.field1135 >= 0 && var5.field1135 < 13312) {
                            var2.method438(var5.field1135, var5.field1134, this.method147(var5.field1134, 0, var2.field1212, var5.field1135) - var2.field1206, false, field174);
                        }
                    }
                    var2.method439(this.field116, 0);
                    this.field176.method482(var2, this.field220, -978, (int) var2.field1197, var2.field1208, -1, (int) var2.field1195, 60, false, (int) var2.field1196);
                }
            } else {
                var2.method464();
            }
            var2 = (class39) this.field319.method451(-582);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class18 var11 = null;
        class18 var12 = (class18) this.field75.method449();
        if (arg6 < 2 || arg6 > 2) {
            this.field200 = -1;
        }
        while (var12 != null) {
            if (var12.field897 == arg5 && var12.field899 == arg1 && var12.field900 == arg0 && var12.field898 == arg9) {
                var11 = var12;
                break;
            }
            var12 = (class18) this.field75.method451(-582);
        }
        if (var11 == null) {
            var11 = new class18();
            var11.field897 = arg5;
            var11.field898 = arg9;
            var11.field899 = arg1;
            var11.field900 = arg0;
            this.method137(var11, this.field462);
            this.field75.method446(var11);
        }
        var11.field901 = arg3;
        var11.field903 = arg2;
        var11.field902 = arg7;
        var11.field904 = arg8;
        var11.field893 = arg4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIIIIIZIII)Z")
    public final boolean method76(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field372[var15][var36] = 0;
                this.field198[var15][var36] = 99999999;
            }
        }
        int var16 = arg0;
        int var17 = arg9;
        if (arg1 != 1) {
            throw new NullPointerException();
        } else {
            boolean var18 = false;
            this.field372[arg0][arg9] = 99;
            this.field198[arg0][arg9] = 0;
            byte var19 = 0;
            int var20 = 0;
            this.field325[var19] = arg0;
            int var37 = var19 + 1;
            this.field326[var19] = arg9;
            boolean var21 = false;
            int var22 = this.field325.length;
            int[][] var23 = this.field520[this.field220].field575;
            while (var37 != var20) {
                var16 = this.field325[var20];
                var17 = this.field326[var20];
                var20 = (var20 + 1) % var22;
                if (arg11 == var16 && arg7 == var17) {
                    var21 = true;
                    break;
                }
                if (arg4 != 0) {
                    if ((arg4 < 5 || arg4 == 10) && this.field520[this.field220].method166(arg7, arg2, var16, -610, var17, arg11, arg4 - 1)) {
                        var21 = true;
                        break;
                    }
                    if (arg4 < 10 && this.field520[this.field220].method167(var16, arg2, arg7, arg4 - 1, arg11, var17, 0)) {
                        var21 = true;
                        break;
                    }
                }
                if (arg10 != 0 && arg3 != 0 && this.field520[this.field220].method168(var17, var16, arg7, arg11, (byte) 1, arg5, arg10, arg3)) {
                    var21 = true;
                    break;
                }
                int var35 = this.field198[var16][var17] + 1;
                if (var16 > 0 && this.field372[var16 - 1][var17] == 0 && (var23[var16 - 1][var17] & 19398920) == 0) {
                    this.field325[var37] = var16 - 1;
                    this.field326[var37] = var17;
                    var37 = (var37 + 1) % var22;
                    this.field372[var16 - 1][var17] = 2;
                    this.field198[var16 - 1][var17] = var35;
                }
                if (var16 < var13 - 1 && this.field372[var16 + 1][var17] == 0 && (var23[var16 + 1][var17] & 19399040) == 0) {
                    this.field325[var37] = var16 + 1;
                    this.field326[var37] = var17;
                    var37 = (var37 + 1) % var22;
                    this.field372[var16 + 1][var17] = 8;
                    this.field198[var16 + 1][var17] = var35;
                }
                if (var17 > 0 && this.field372[var16][var17 - 1] == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                    this.field325[var37] = var16;
                    this.field326[var37] = var17 - 1;
                    var37 = (var37 + 1) % var22;
                    this.field372[var16][var17 - 1] = 1;
                    this.field198[var16][var17 - 1] = var35;
                }
                if (var17 < var14 - 1 && this.field372[var16][var17 + 1] == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                    this.field325[var37] = var16;
                    this.field326[var37] = var17 + 1;
                    var37 = (var37 + 1) % var22;
                    this.field372[var16][var17 + 1] = 4;
                    this.field198[var16][var17 + 1] = var35;
                }
                if (var16 > 0 && var17 > 0 && this.field372[var16 - 1][var17 - 1] == 0 && (var23[var16 - 1][var17 - 1] & 19398926) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                    this.field325[var37] = var16 - 1;
                    this.field326[var37] = var17 - 1;
                    var37 = (var37 + 1) % var22;
                    this.field372[var16 - 1][var17 - 1] = 3;
                    this.field198[var16 - 1][var17 - 1] = var35;
                }
                if (var16 < var13 - 1 && var17 > 0 && this.field372[var16 + 1][var17 - 1] == 0 && (var23[var16 + 1][var17 - 1] & 19399043) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                    this.field325[var37] = var16 + 1;
                    this.field326[var37] = var17 - 1;
                    var37 = (var37 + 1) % var22;
                    this.field372[var16 + 1][var17 - 1] = 9;
                    this.field198[var16 + 1][var17 - 1] = var35;
                }
                if (var16 > 0 && var17 < var14 - 1 && this.field372[var16 - 1][var17 + 1] == 0 && (var23[var16 - 1][var17 + 1] & 19398968) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                    this.field325[var37] = var16 - 1;
                    this.field326[var37] = var17 + 1;
                    var37 = (var37 + 1) % var22;
                    this.field372[var16 - 1][var17 + 1] = 6;
                    this.field198[var16 - 1][var17 + 1] = var35;
                }
                if (var16 < var13 - 1 && var17 < var14 - 1 && this.field372[var16 + 1][var17 + 1] == 0 && (var23[var16 + 1][var17 + 1] & 19399136) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                    this.field325[var37] = var16 + 1;
                    this.field326[var37] = var17 + 1;
                    var37 = (var37 + 1) % var22;
                    this.field372[var16 + 1][var17 + 1] = 12;
                    this.field198[var16 + 1][var17 + 1] = var35;
                }
            }
            this.field80 = 0;
            if (!var21) {
                if (arg8) {
                    int var24 = 100;
                    for (int var25 = 1; var25 < 2; ++var25) {
                        for (int var26 = arg11 - var25; var26 <= arg11 + var25; ++var26) {
                            for (int var27 = arg7 - var25; var27 <= arg7 + var25; ++var27) {
                                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field198[var26][var27] < var24) {
                                    var24 = this.field198[var26][var27];
                                    var16 = var26;
                                    var17 = var27;
                                    this.field80 = 1;
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
            this.field325[var28] = var16;
            int var38 = var28 + 1;
            this.field326[var28] = var17;
            int var29;
            int var30 = var29 = this.field372[var16][var17];
            while (arg0 != var16 || arg9 != var17) {
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
                var30 = this.field372[var16][var17];
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
                    this.field92.method358(7793, 108);
                    this.field92.method359(var31 + var31 + 3);
                }
                if (arg6 == 1) {
                    this.field92.method358(7793, 131);
                    this.field92.method359(var31 + var31 + 3 + 14);
                }
                if (arg6 == 2) {
                    this.field92.method358(7793, 61);
                    this.field92.method359(var31 + var31 + 3);
                }
                this.field92.method359(super.field813[5] == 1 ? 1 : 0);
                this.field221 = this.field325[0];
                this.field222 = this.field326[0];
                for (int var34 = 1; var34 < var31; ++var34) {
                    --var38;
                    this.field92.method359(this.field325[var38] - var32);
                    this.field92.method385(0, this.field326[var38] - var33);
                }
                this.field92.method393(this.field169 + var33, (byte) 1);
                this.field92.method393(this.field168 + var32, (byte) 1);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
    public final void method77(boolean arg0) {
        if (super.field796 == null) {
            this.method11(this.field513);
            this.field241 = null;
            this.field242 = null;
            this.field243 = null;
            this.field244 = null;
            this.field245 = null;
            this.field246 = null;
            this.field247 = null;
            this.field248 = null;
            this.field249 = null;
            this.field466 = null;
            this.field464 = null;
            this.field463 = null;
            this.field465 = null;
            this.field503 = null;
            this.field504 = null;
            this.field505 = null;
            super.field796 = new class25(503, 765, this.method65(true), field383);
            if (arg0) {
                this.field200 = -1;
            }
            this.field74 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method78(int arg0) {
        this.field103 = 0;
        for (int var2 = -1; var2 < this.field341 + this.field208; ++var2) {
            class37 var19;
            if (var2 == -1) {
                var19 = field124;
            } else if (var2 < this.field208) {
                var19 = this.field207[this.field209[var2]];
            } else {
                var19 = this.field340[this.field342[var2 - this.field208]];
            }
            if (var19 != null && var19.method429(21781)) {
                if (var19 instanceof class49) {
                    class64 var20 = ((class49) var19).field1402;
                    if (var20.field1587 != null) {
                        var20 = var20.method572(7);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field208) {
                    class64 var23 = ((class49) var19).field1402;
                    if (var23.field1570 >= 0 && var23.field1570 < this.field240.length) {
                        this.method41(var19, 0, var19.field1151 + 15);
                        if (this.field180 > -1) {
                            this.field240[var23.field1570].method541(-4899, this.field180 - 12, this.field181 - 30);
                        }
                    }
                    if (this.field263 == 1 && this.field342[var2 - this.field208] == this.field226 && field174 % 20 < 10) {
                        this.method41(var19, 0, var19.field1151 + 15);
                        if (this.field180 > -1) {
                            this.field357[0].method541(-4899, this.field180 - 12, this.field181 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class51 var22 = (class51) var19;
                    if (var22.field1431 != -1 || var22.field1416 != -1) {
                        this.method41(var19, 0, var19.field1151 + 15);
                        if (this.field180 > -1) {
                            if (var22.field1431 != -1) {
                                this.field90[var22.field1431].method541(-4899, this.field180 - 12, this.field181 - var21);
                                var21 += 25;
                            }
                            if (var22.field1416 != -1) {
                                this.field240[var22.field1416].method541(-4899, this.field180 - 12, this.field181 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field263 == 10 && this.field209[var2] == this.field126) {
                        this.method41(var19, 0, var19.field1151 + 15);
                        if (this.field180 > -1) {
                            this.field357[1].method541(-4899, this.field180 - 12, this.field181 - var21);
                        }
                    }
                }
                if (var19.field1164 != null && (var2 >= this.field208 || this.field234 == 0 || this.field234 == 3 || this.field234 == 1 && this.method12(((class51) var19).field1423, (byte) 9))) {
                    this.method41(var19, 0, var19.field1151);
                    if (this.field180 > -1 && this.field103 < this.field104) {
                        this.field108[this.field103] = this.field475.method592((byte) 107, var19.field1164) / 2;
                        this.field107[this.field103] = this.field475.field1731;
                        this.field105[this.field103] = this.field180;
                        this.field106[this.field103] = this.field181;
                        this.field109[this.field103] = var19.field1155;
                        this.field110[this.field103] = var19.field1131;
                        this.field111[this.field103] = var19.field1150;
                        this.field112[this.field103++] = var19.field1164;
                        if (this.field191 == 0 && var19.field1131 >= 1 && var19.field1131 <= 3) {
                            this.field107[this.field103] += 10;
                            this.field106[this.field103] += 5;
                        }
                        if (this.field191 == 0 && var19.field1131 == 4) {
                            this.field108[this.field103] = 60;
                        }
                        if (this.field191 == 0 && var19.field1131 == 5) {
                            this.field107[this.field103] += 5;
                        }
                    }
                }
                if (var19.field1178 > field174) {
                    this.method41(var19, 0, var19.field1151 + 15);
                    if (this.field180 > -1) {
                        int var24 = var19.field1179 * 30 / var19.field1180;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class21.method289(var24, 2, this.field180 - 15, 65280, this.field181 - 3, 5);
                        class21.method289(30 - var24, 2, this.field180 - 15 + var24, 16711680, this.field181 - 3, 5);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1144[var25] > field174) {
                        this.method41(var19, 0, var19.field1151 / 2);
                        if (this.field180 > -1) {
                            if (var25 == 1) {
                                this.field181 -= 20;
                            }
                            if (var25 == 2) {
                                this.field180 -= 15;
                                this.field181 -= 10;
                            }
                            if (var25 == 3) {
                                this.field180 += 15;
                                this.field181 -= 10;
                            }
                            this.field545[var19.field1143[var25]].method541(-4899, this.field180 - 12, this.field181 - 12);
                            this.field473.method589(0, this.field180, this.field181 + 4, String.valueOf(var19.field1142[var25]), (byte) 119);
                            this.field473.method589(16777215, this.field180 - 1, this.field181 + 3, String.valueOf(var19.field1142[var25]), (byte) 119);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field103; ++var3) {
            int var4 = this.field105[var3];
            int var5 = this.field106[var3];
            int var6 = this.field108[var3];
            int var7 = this.field107[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field106[var18] - this.field107[var18] && var5 - var7 < this.field106[var18] + 2 && var4 - var6 < this.field108[var18] + this.field105[var18] && var4 + var6 > this.field105[var18] - this.field108[var18] && this.field106[var18] - this.field107[var18] < var5) {
                        var5 = this.field106[var18] - this.field107[var18];
                        var8 = true;
                    }
                }
            }
            this.field180 = this.field105[var3];
            this.field181 = this.field106[var3] = var5;
            String var9 = this.field112[var3];
            if (this.field191 == 0) {
                int var10 = 16776960;
                if (this.field109[var3] < 6) {
                    var10 = this.field404[this.field109[var3]];
                }
                if (this.field109[var3] == 6) {
                    var10 = this.field378 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field109[var3] == 7) {
                    var10 = this.field378 % 20 < 10 ? 255 : 65535;
                }
                if (this.field109[var3] == 8) {
                    var10 = this.field378 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field109[var3] == 9) {
                    int var11 = 150 - this.field111[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field109[var3] == 10) {
                    int var12 = 150 - this.field111[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field109[var3] == 11) {
                    int var13 = 150 - this.field111[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field110[var3] == 0) {
                    this.field475.method589(0, this.field180, this.field181 + 1, var9, (byte) 119);
                    this.field475.method589(var10, this.field180, this.field181, var9, (byte) 119);
                }
                if (this.field110[var3] == 1) {
                    this.field475.method594(var9, this.field180, this.field378, this.field181 + 1, 0, 0);
                    this.field475.method594(var9, this.field180, this.field378, this.field181, var10, 0);
                }
                if (this.field110[var3] == 2) {
                    this.field475.method595(var9, this.field378, 0, this.field180, (byte) 2, this.field181 + 1);
                    this.field475.method595(var9, this.field378, var10, this.field180, (byte) 2, this.field181);
                }
                if (this.field110[var3] == 3) {
                    this.field475.method596(var9, this.field181 + 1, (byte) 4, 150 - this.field111[var3], this.field180, 0, this.field378);
                    this.field475.method596(var9, this.field181, (byte) 4, 150 - this.field111[var3], this.field180, var10, this.field378);
                }
                if (this.field110[var3] == 4) {
                    int var14 = this.field475.method592((byte) 107, var9);
                    int var15 = (150 - this.field111[var3]) * (var14 + 100) / 150;
                    class21.method286(0, this.field180 - 50, (byte) 21, this.field180 + 50, 334);
                    this.field475.method593(var9, this.field181 + 1, this.field180 + 50 - var15, 0, -32001);
                    this.field475.method593(var9, this.field181, this.field180 + 50 - var15, var10, -32001);
                    class21.method285(632);
                }
                if (this.field110[var3] == 5) {
                    int var16 = 150 - this.field111[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class21.method286(this.field181 - this.field475.field1731 - 1, 0, (byte) 21, 512, this.field181 + 5);
                    this.field475.method589(0, this.field180, this.field181 + 1 + var17, var9, (byte) 119);
                    this.field475.method589(var10, this.field180, this.field181 + var17, var9, (byte) 119);
                    class21.method285(632);
                }
            } else {
                this.field475.method589(0, this.field180, this.field181 + 1, var9, (byte) 119);
                this.field475.method589(16776960, this.field180, this.field181, var9, (byte) 119);
            }
        }
        this.field199 += arg0;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method79(byte arg0) {
        if (arg0 != 58) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (int var3 = 0; var3 < this.field421; ++var3) {
            if (this.field437[var3] <= 0) {
                boolean var4 = false;
                try {
                    if (this.field313[var3] == this.field260 && this.field398[var3] == this.field302) {
                        if (!this.method125((byte) 1)) {
                            var4 = true;
                        }
                    } else {
                        class32 var5 = class38.method433(this.field398[var3], 7, this.field313[var3]);
                        if (System.currentTimeMillis() + (long) (var5.field1032 / 22) > (long) (this.field238 / 22) + this.field127) {
                            this.field238 = var5.field1032;
                            this.field127 = System.currentTimeMillis();
                            if (this.method126(var5.field1032, var5.field1031, -42)) {
                                this.field260 = this.field313[var3];
                                this.field302 = this.field398[var3];
                            } else {
                                var4 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                    if (signlink.reporterror) {
                        this.field92.method358(7793, 76);
                        this.field92.method360(this.field313[var3] & 32767);
                    } else {
                        this.field92.method358(7793, 76);
                        this.field92.method360(-1);
                    }
                }
                if (var4 && this.field437[var3] != -5) {
                    this.field437[var3] = -5;
                } else {
                    --this.field421;
                    for (int var7 = var3; var7 < this.field421; ++var7) {
                        this.field313[var7] = this.field313[var7 + 1];
                        this.field398[var7] = this.field398[var7 + 1];
                        this.field437[var7] = this.field437[var7 + 1];
                    }
                    --var3;
                }
            } else {
                int var10002 = this.field437[var3]--;
            }
        }
        if (this.field305 > 0) {
            this.field305 -= 20;
            if (this.field305 < 0) {
                this.field305 = 0;
            }
            if (this.field305 == 0 && this.field453 && !field218) {
                this.field531 = this.field311;
                this.field532 = true;
                this.field82.method240(2, this.field531);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method80(byte arg0) {
        if (this.field369 == arg0) {
            ++this.field378;
            this.method39(true, (byte) -25);
            this.method81(this.field78, true);
            this.method39(false, (byte) -25);
            this.method81(this.field78, false);
            this.method74(true);
            this.method45(true);
            if (!this.field366) {
                int var2 = this.field58;
                if (this.field233 / 256 > var2) {
                    var2 = this.field233 / 256;
                }
                if (this.field414[4] && this.field194[4] + 128 > var2) {
                    var2 = this.field194[4] + 128;
                }
                int var3 = this.field59 + this.field258 & 2047;
                this.method40(this.field329, var3, var2 * 3 + 600, 0, var2, this.method147(field124.field1134, 0, this.field220, field124.field1135) - 50, this.field330);
            }
            int var4;
            if (!this.field366) {
                var4 = this.method47(true);
            } else {
                var4 = this.method48(3);
            }
            int var5 = this.field440;
            int var6 = this.field441;
            int var7 = this.field442;
            int var8 = this.field443;
            int var9 = this.field444;
            for (int var10 = 0; var10 < 5; ++var10) {
                if (this.field414[var10]) {
                    int var12 = (int) (Math.random() * (double) (this.field460[var10] * 2 + 1) - (double) this.field460[var10] + Math.sin((double) this.field283[var10] / 100.0D * (double) this.field328[var10]) * (double) this.field194[var10]);
                    if (var10 == 0) {
                        this.field440 += var12;
                    }
                    if (var10 == 1) {
                        this.field441 += var12;
                    }
                    if (var10 == 2) {
                        this.field442 += var12;
                    }
                    if (var10 == 3) {
                        this.field444 = this.field444 + var12 & 2047;
                    }
                    if (var10 == 4) {
                        this.field443 += var12;
                        if (this.field443 < 128) {
                            this.field443 = 128;
                        }
                        if (this.field443 > 383) {
                            this.field443 = 383;
                        }
                    }
                }
            }
            int var11 = class6.field598;
            class8.field677 = true;
            class8.field680 = 0;
            class8.field678 = super.field803 - 4;
            class8.field679 = super.field804 - 4;
            class21.method287(true);
            this.field176.method510(this.field441, this.field440, this.field444, false, this.field442, this.field443, var4);
            this.field176.method485(127);
            this.method78(0);
            this.method97(831);
            this.method91(var11, 0);
            this.method71((byte) 0);
            this.field465.method299(super.field795, 4, 0, 4);
            this.field440 = var5;
            this.field441 = var6;
            this.field442 = var7;
            this.field443 = var8;
            this.field444 = var9;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method81(int arg0, boolean arg1) {
        int var3 = 72 / arg0;
        for (int var4 = 0; var4 < this.field341; ++var4) {
            class49 var5 = this.field340[this.field342[var4]];
            int var6 = (this.field342[var4] << 14) + 536870912;
            if (var5 != null && var5.method429(21781) && var5.field1402.field1567 == arg1 && var5.field1402.method574((byte) -92)) {
                int var7 = var5.field1134 >> 7;
                int var8 = var5.field1135 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1149 == 1 && (var5.field1134 & 127) == 64 && (var5.field1135 & 127) == 64) {
                        if (this.field123[var7][var8] == this.field378) {
                            continue;
                        }
                        this.field123[var7][var8] = this.field378;
                    }
                    if (!var5.field1402.field1579) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field176.method482(var5, this.field220, -978, this.method147(var5.field1134, 0, this.field220, var5.field1135), var5.field1136, var6, var5.field1134, (var5.field1149 - 1) * 64 + 60, var5.field1163, var5.field1135);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method82(long arg0, int arg1) {
        if (arg1 <= 0) {
            this.field200 = this.field546.method369();
        }
        if (arg0 != 0L) {
            if (this.field237 >= 100) {
                this.method67("Your ignore list is full. Max of 100 hit", "", 0, -39349);
            } else {
                String var4 = class40.method444(true, class40.method441(359, arg0));
                for (int var5 = 0; var5 < this.field237; ++var5) {
                    if (this.field370[var5] == arg0) {
                        this.method67(var4 + " is already on your ignore list", "", 0, -39349);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field400; ++var6) {
                    if (this.field457[var6] == arg0) {
                        this.method67("Please remove " + var4 + " from your friend list first", "", 0, -39349);
                        return;
                    }
                }
                this.field370[this.field237++] = arg0;
                this.field554 = true;
                this.field92.method358(7793, 180);
                this.field92.method365(arg0, (byte) 56);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)Z")
    public final boolean method83(int arg0) {
        if (arg0 != -37766) {
            this.method113();
        }
        if (this.field314 == null) {
            return false;
        } else {
            try {
                int var2 = this.field314.method280();
                if (var2 == 0) {
                    return false;
                }
                if (this.field200 == -1) {
                    this.field314.method281(this.field546.field1031, 0, 1);
                    this.field200 = this.field546.field1031[0] & 255;
                    if (this.field232 != null) {
                        this.field200 = this.field200 - this.field232.method424() & 255;
                    }
                    this.field199 = class55.field1448[this.field200];
                    --var2;
                }
                if (this.field199 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field314.method281(this.field546.field1031, 0, 1);
                    this.field199 = this.field546.field1031[0] & 255;
                    --var2;
                }
                if (this.field199 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field314.method281(this.field546.field1031, 0, 2);
                    this.field546.field1032 = 0;
                    this.field199 = this.field546.method371();
                    var2 -= 2;
                }
                if (var2 < this.field199) {
                    return false;
                }
                this.field546.field1032 = 0;
                this.field314.method281(this.field546.field1031, 0, this.field199);
                this.field201 = 0;
                this.field145 = this.field144;
                this.field144 = this.field143;
                this.field143 = this.field200;
                if (this.field200 == 94) {
                    this.field456 = this.field546.method388(false);
                    this.field455 = this.field546.method389(-13491);
                    for (int var3 = this.field455; var3 < this.field455 + 8; ++var3) {
                        for (int var4 = this.field456; var4 < this.field456 + 8; ++var4) {
                            if (this.field235[this.field220][var3][var4] != null) {
                                this.field235[this.field220][var3][var4] = null;
                                this.method118(var3, var4);
                            }
                        }
                    }
                    for (class18 var5 = (class18) this.field75.method449(); var5 != null; var5 = (class18) this.field75.method451(-582)) {
                        if (var5.field899 >= this.field455 && var5.field899 < this.field455 + 8 && var5.field900 >= this.field456 && var5.field900 < this.field456 + 8 && this.field220 == var5.field897) {
                            var5.field893 = 0;
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 38) {
                    int var6 = this.field546.method369();
                    int var7 = this.field546.method369();
                    int var8 = this.field546.method369();
                    int var9 = this.field546.method369();
                    this.field414[var6] = true;
                    this.field460[var6] = var7;
                    this.field194[var6] = var8;
                    this.field283[var6] = var9;
                    this.field328[var6] = 0;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 54) {
                    this.field366 = true;
                    this.field384 = this.field546.method369();
                    this.field385 = this.field546.method369();
                    this.field386 = this.field546.method371();
                    this.field387 = this.field546.method369();
                    this.field388 = this.field546.method369();
                    if (this.field388 >= 100) {
                        this.field440 = this.field384 * 128 + 64;
                        this.field442 = this.field385 * 128 + 64;
                        this.field441 = this.method147(this.field440, 0, this.field220, this.field442) - this.field386;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 128) {
                    this.field263 = this.field546.method369();
                    if (this.field263 == 1) {
                        this.field226 = this.field546.method371();
                    }
                    if (this.field263 >= 2 && this.field263 <= 6) {
                        if (this.field263 == 2) {
                            this.field279 = 64;
                            this.field280 = 64;
                        }
                        if (this.field263 == 3) {
                            this.field279 = 0;
                            this.field280 = 64;
                        }
                        if (this.field263 == 4) {
                            this.field279 = 128;
                            this.field280 = 64;
                        }
                        if (this.field263 == 5) {
                            this.field279 = 64;
                            this.field280 = 0;
                        }
                        if (this.field263 == 6) {
                            this.field279 = 64;
                            this.field280 = 128;
                        }
                        this.field263 = 2;
                        this.field276 = this.field546.method371();
                        this.field277 = this.field546.method371();
                        this.field278 = this.field546.method369();
                    }
                    if (this.field263 == 10) {
                        this.field126 = this.field546.method371();
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 143) {
                    this.field524 = this.field546.method369();
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 236) {
                    int var10 = this.field546.method371();
                    int var11 = this.field546.method395((byte) 56);
                    class44.method460(var11).field1280 = 1;
                    class44.method460(var11).field1281 = var10;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 114) {
                    int var12 = this.field546.method403(1);
                    int var13 = this.field546.method396(-30785);
                    this.field353[var13] = var12;
                    if (this.field350[var13] != var12) {
                        this.field350[var13] = var12;
                        this.method36(var13, 667);
                        this.field554 = true;
                        if (this.field138 != -1) {
                            this.field528 = true;
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 78) {
                    this.field554 = true;
                    int var14 = this.field546.method371();
                    class44 var15 = class44.method460(var14);
                    int var16 = this.field546.method371();
                    for (int var17 = 0; var17 < var16; ++var17) {
                        var15.field1250[var17] = this.field546.method371();
                        int var18 = this.field546.method387((byte) 104);
                        if (var18 == 255) {
                            var18 = this.field546.method404(273);
                        }
                        var15.field1255[var17] = var18;
                    }
                    for (int var19 = var16; var19 < var15.field1250.length; ++var19) {
                        var15.field1250[var19] = 0;
                        var15.field1255[var19] = 0;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 238) {
                    if (this.field253 == 12) {
                        this.field554 = true;
                    }
                    this.field262 = this.field546.method372();
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 108) {
                    int var20 = this.field546.method395((byte) 56);
                    int var21 = this.field546.method371();
                    int var22 = this.field546.method397(this.field375);
                    int var23 = this.field546.method397(this.field375);
                    class44.method460(var20).field1311 = var21;
                    class44.method460(var20).field1312 = var23;
                    class44.method460(var20).field1310 = var22;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 3) {
                    long var24 = this.field546.method375(true);
                    int var26 = this.field546.method374();
                    int var27 = this.field546.method369();
                    boolean var28 = false;
                    for (int var29 = 0; var29 < 100; ++var29) {
                        if (this.field160[var29] == var26) {
                            var28 = true;
                            break;
                        }
                    }
                    if (var27 <= 1) {
                        for (int var30 = 0; var30 < this.field237; ++var30) {
                            if (this.field370[var30] == var24) {
                                var28 = true;
                                break;
                            }
                        }
                    }
                    if (!var28 && this.field132 == 0) {
                        try {
                            this.field160[this.field496] = var26;
                            this.field496 = (this.field496 + 1) % 100;
                            String var31 = class50.method523(this.field546, 555, this.field199 - 13);
                            if (var27 != 3) {
                                var31 = class26.method311(var31, 0);
                            }
                            if (var27 != 2 && var27 != 3) {
                                if (var27 == 1) {
                                    this.method67(var31, "@cr1@" + class40.method444(true, class40.method441(359, var24)), 7, -39349);
                                } else {
                                    this.method67(var31, class40.method444(true, class40.method441(359, var24)), 3, -39349);
                                }
                            } else {
                                this.method67(var31, "@cr2@" + class40.method444(true, class40.method441(359, var24)), 7, -39349);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 111) {
                    this.field456 = this.field546.method369();
                    this.field455 = this.field546.method369();
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 10) {
                    this.field221 = 0;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 79) {
                    this.field423 = this.field546.method387((byte) 104);
                    this.field454 = this.field546.method371();
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 146) {
                    int var33 = this.field546.method395((byte) 56);
                    byte var34 = this.field546.method390(false);
                    this.field353[var33] = var34;
                    if (this.field350[var33] != var34) {
                        this.field350[var33] = var34;
                        this.method36(var33, 667);
                        this.field554 = true;
                        if (this.field138 != -1) {
                            this.field528 = true;
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 130) {
                    int var35 = this.field546.method396(-30785);
                    int var36 = this.field546.method396(-30785);
                    class44.method460(var35).field1280 = 2;
                    class44.method460(var35).field1281 = var36;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 118) {
                    String var37 = this.field546.method376();
                    if (var37.endsWith(":tradereq:")) {
                        String var38 = var37.substring(0, var37.indexOf(":"));
                        long var39 = class40.method440(var38);
                        boolean var41 = false;
                        for (int var42 = 0; var42 < this.field237; ++var42) {
                            if (this.field370[var42] == var39) {
                                var41 = true;
                                break;
                            }
                        }
                        if (!var41 && this.field132 == 0) {
                            this.method67("wishes to trade with you.", var38, 4, -39349);
                        }
                    } else if (var37.endsWith(":duelreq:")) {
                        String var43 = var37.substring(0, var37.indexOf(":"));
                        long var44 = class40.method440(var43);
                        boolean var46 = false;
                        for (int var47 = 0; var47 < this.field237; ++var47) {
                            if (this.field370[var47] == var44) {
                                var46 = true;
                                break;
                            }
                        }
                        if (!var46 && this.field132 == 0) {
                            this.method67("wishes to duel with you.", var43, 8, -39349);
                        }
                    } else if (!var37.endsWith(":chalreq:")) {
                        this.method67(var37, "", 0, -39349);
                    } else {
                        String var48 = var37.substring(0, var37.indexOf(":"));
                        long var49 = class40.method440(var48);
                        boolean var51 = false;
                        for (int var52 = 0; var52 < this.field237; ++var52) {
                            if (this.field370[var52] == var49) {
                                var51 = true;
                                break;
                            }
                        }
                        if (!var51 && this.field132 == 0) {
                            String var53 = var37.substring(var37.indexOf(":") + 1, var37.length() - 9);
                            this.method67(var53, var48, 8, -39349);
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 199) {
                    if (this.field445 != -1) {
                        this.method154(3, this.field445);
                        this.field445 = -1;
                        this.field554 = true;
                        this.field148 = true;
                    }
                    if (this.field368 != -1) {
                        this.method154(3, this.field368);
                        this.field368 = -1;
                        this.field528 = true;
                    }
                    if (this.field139 != -1) {
                        this.method154(3, this.field139);
                        this.field139 = -1;
                        this.field74 = true;
                    }
                    if (this.field128 != -1) {
                        this.method154(3, this.field128);
                        this.field128 = -1;
                    }
                    if (this.field542 != -1) {
                        this.method154(3, this.field542);
                        this.field542 = -1;
                    }
                    if (this.field62 != 0) {
                        this.field62 = 0;
                        this.field528 = true;
                    }
                    this.field291 = false;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 82) {
                    this.method128(6, this.field199, this.field546);
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 251) {
                    int var54 = this.field546.method395((byte) 56);
                    this.method130(47243, var54);
                    if (this.field445 != -1) {
                        this.method154(3, this.field445);
                        this.field445 = -1;
                        this.field554 = true;
                        this.field148 = true;
                    }
                    if (this.field368 != -1) {
                        this.method154(3, this.field368);
                        this.field368 = -1;
                        this.field528 = true;
                    }
                    if (this.field139 != -1) {
                        this.method154(3, this.field139);
                        this.field139 = -1;
                        this.field74 = true;
                    }
                    if (this.field128 != -1) {
                        this.method154(3, this.field128);
                        this.field128 = -1;
                    }
                    if (this.field542 != var54) {
                        this.method154(3, this.field542);
                        this.field542 = var54;
                    }
                    if (this.field62 != 0) {
                        this.field62 = 0;
                        this.field528 = true;
                    }
                    this.field291 = false;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 61) {
                    this.field366 = false;
                    for (int var55 = 0; var55 < 5; ++var55) {
                        this.field414[var55] = false;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 24) {
                    this.field546.method371();
                    this.field392 = this.field546.method397(this.field375);
                    this.field373 = this.field546.method371();
                    this.field546.method387((byte) 104);
                    this.field402 = this.field546.method396(-30785);
                    this.field320 = this.field546.method395((byte) 56);
                    this.field377 = this.field546.method396(-30785);
                    this.field323 = this.field546.method371();
                    this.field224 = this.field546.method371();
                    this.field193 = this.field546.method396(-30785);
                    this.field403 = this.field546.method404(273);
                    signlink.dnslookup(class40.method443(2, this.field403));
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 150) {
                    this.field234 = this.field546.method369();
                    this.field88 = this.field546.method369();
                    this.field76 = this.field546.method369();
                    this.field141 = true;
                    this.field528 = true;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 207) {
                    int var56 = this.field546.method371();
                    int var57 = this.field546.method398(0);
                    int var58 = this.field546.method400(this.field295);
                    class44 var59 = class44.method460(var56);
                    var59.field1283 = var58;
                    var59.field1269 = var57;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 144) {
                    this.field554 = true;
                    int var60 = this.field546.method371();
                    class44 var61 = class44.method460(var60);
                    while (this.field546.field1032 < this.field199) {
                        int var62 = this.field546.method383();
                        int var63 = this.field546.method371();
                        int var64 = this.field546.method369();
                        if (var64 == 255) {
                            var64 = this.field546.method374();
                        }
                        if (var62 >= 0 && var62 < var61.field1250.length) {
                            var61.field1250[var62] = var63;
                            var61.field1255[var62] = var64;
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 100) {
                    long var65 = this.field546.method375(true);
                    int var67 = this.field546.method369();
                    String var68 = class40.method444(true, class40.method441(359, var65));
                    for (int var69 = 0; var69 < this.field400; ++var69) {
                        if (this.field457[var69] == var65) {
                            if (this.field154[var69] != var67) {
                                this.field154[var69] = var67;
                                this.field554 = true;
                                if (var67 > 0) {
                                    this.method67(var68 + " has logged in.", "", 5, -39349);
                                }
                                if (var67 == 0) {
                                    this.method67(var68 + " has logged out.", "", 5, -39349);
                                }
                            }
                            var68 = null;
                            break;
                        }
                    }
                    if (var68 != null && this.field400 < 200) {
                        this.field457[this.field400] = var65;
                        this.field239[this.field400] = var68;
                        this.field154[this.field400] = var67;
                        ++this.field400;
                        this.field554 = true;
                    }
                    boolean var70 = false;
                    while (!var70) {
                        var70 = true;
                        for (int var71 = 0; var71 < this.field400 - 1; ++var71) {
                            if (this.field154[var71] != field215 && this.field154[var71 + 1] == field215 || this.field154[var71] == 0 && this.field154[var71 + 1] != 0) {
                                int var72 = this.field154[var71];
                                this.field154[var71] = this.field154[var71 + 1];
                                this.field154[var71 + 1] = var72;
                                String var73 = this.field239[var71];
                                this.field239[var71] = this.field239[var71 + 1];
                                this.field239[var71 + 1] = var73;
                                long var74 = this.field457[var71];
                                this.field457[var71] = this.field457[var71 + 1];
                                this.field457[var71 + 1] = var74;
                                this.field554 = true;
                                var70 = false;
                            }
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 96) {
                    if (this.field253 == 12) {
                        this.field554 = true;
                    }
                    this.field508 = this.field546.method369();
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 180) {
                    int var76 = this.field546.method395((byte) 56);
                    if (var76 == 65535) {
                        var76 = -1;
                    }
                    if (this.field311 != var76 && this.field453 && !field218 && this.field305 == 0) {
                        this.field531 = var76;
                        this.field532 = true;
                        this.field82.method240(2, this.field531);
                    }
                    this.field311 = var76;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 192) {
                    int var77 = this.field546.method396(-30785);
                    int var78 = this.field546.method373();
                    if (this.field453 && !field218) {
                        this.field531 = var77;
                        this.field532 = false;
                        this.field82.method240(2, this.field531);
                        this.field305 = var78;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 200) {
                    int var79 = this.field546.method396(-30785);
                    this.method130(47243, var79);
                    if (this.field368 != -1) {
                        this.method154(3, this.field368);
                        this.field368 = -1;
                        this.field528 = true;
                    }
                    if (this.field139 != -1) {
                        this.method154(3, this.field139);
                        this.field139 = -1;
                        this.field74 = true;
                    }
                    if (this.field128 != -1) {
                        this.method154(3, this.field128);
                        this.field128 = -1;
                    }
                    if (this.field542 != -1) {
                        this.method154(3, this.field542);
                        this.field542 = -1;
                    }
                    if (this.field445 != var79) {
                        this.method154(3, this.field445);
                        this.field445 = var79;
                    }
                    if (this.field62 != 0) {
                        this.field62 = 0;
                        this.field528 = true;
                    }
                    this.field554 = true;
                    this.field148 = true;
                    this.field291 = false;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 86) {
                    int var80 = this.field546.method400(this.field295);
                    if (this.field138 != var80) {
                        this.method154(3, this.field138);
                        this.field138 = var80;
                    }
                    this.field528 = true;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 120) {
                    int var81 = this.field546.method395((byte) 56);
                    int var82 = this.field546.method371();
                    int var83 = this.field546.method397(this.field375);
                    if (var81 == 65535) {
                        class44.method460(var82).field1280 = 0;
                        this.field200 = -1;
                        return true;
                    }
                    class60 var84 = class60.method554(var81);
                    class44.method460(var82).field1280 = 4;
                    class44.method460(var82).field1281 = var81;
                    class44.method460(var82).field1311 = var84.field1537;
                    class44.method460(var82).field1312 = var84.field1524;
                    class44.method460(var82).field1310 = var84.field1502 * 100 / var83;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 40) {
                    this.field554 = true;
                    int var85 = this.field546.method389(-13491);
                    int var86 = this.field546.method404(273);
                    int var87 = this.field546.method369();
                    this.field324[var87] = var86;
                    this.field178[var87] = var85;
                    this.field79[var87] = 1;
                    for (int var88 = 0; var88 < 98; ++var88) {
                        if (var86 >= field301[var88]) {
                            this.field79[var87] = var88 + 2;
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 181) {
                    for (int var89 = 0; var89 < this.field207.length; ++var89) {
                        if (this.field207[var89] != null) {
                            this.field207[var89].field1173 = -1;
                        }
                    }
                    for (int var90 = 0; var90 < this.field340.length; ++var90) {
                        if (this.field340[var90] != null) {
                            this.field340[var90].field1173 = -1;
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 2) {
                    int var91 = this.field546.method371();
                    int var92 = this.field546.method389(-13491);
                    if (var91 == 65535) {
                        var91 = -1;
                    }
                    if (this.field349[var92] != var91) {
                        this.method154(3, this.field349[var92]);
                        this.field349[var92] = var91;
                    }
                    this.field554 = true;
                    this.field148 = true;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 46 || this.field200 == 193 || this.field200 == 206 || this.field200 == 93 || this.field200 == 187 || this.field200 == 98 || this.field200 == 209 || this.field200 == 252 || this.field200 == 31 || this.field200 == 253 || this.field200 == 122) {
                    this.method98(this.field546, (byte) -121, this.field200);
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 214) {
                    int var93 = this.field546.method389(-13491);
                    int var94 = this.field546.method389(-13491);
                    String var95 = this.field546.method376();
                    if (var93 >= 1 && var93 <= 5) {
                        if (var95.equalsIgnoreCase("null")) {
                            var95 = null;
                        }
                        this.field389[var93 - 1] = var95;
                        this.field390[var93 - 1] = var94 == 0;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 26) {
                    int var96 = this.field546.method371();
                    int var97 = this.field546.method397(this.field375);
                    class44 var98 = class44.method460(var97);
                    if (var98 != null && var98.field1279 == 0) {
                        if (var96 < 0) {
                            var96 = 0;
                        }
                        if (var96 > var98.field1278 - var98.field1296) {
                            var96 = var98.field1278 - var98.field1296;
                        }
                        var98.field1304 = var96;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 127) {
                    this.field253 = this.field546.method369();
                    this.field554 = true;
                    this.field148 = true;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 28) {
                    int var99 = this.field546.method396(-30785);
                    boolean var100 = this.field546.method388(false) == 1;
                    class44.method460(var99).field1306 = var100;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 177) {
                    int var101 = this.field546.method372();
                    int var102 = this.field546.method395((byte) 56);
                    class44 var103 = class44.method460(var102);
                    if (var103.field1308 != var101 || var101 == -1) {
                        var103.field1308 = var101;
                        var103.field1286 = 0;
                        var103.field1293 = 0;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 33) {
                    int var104 = this.field546.method399((byte) 1);
                    if (var104 >= 0) {
                        this.method130(47243, var104);
                    }
                    if (this.field399 != var104) {
                        this.method154(3, this.field399);
                        this.field399 = var104;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 17) {
                    int var105 = this.field546.method371();
                    int var106 = this.field546.method395((byte) 56);
                    int var107 = var106 >> 10 & 31;
                    int var108 = var106 >> 5 & 31;
                    int var109 = var106 & 31;
                    class44.method460(var105).field1254 = (var109 << 3) + (var107 << 19) + (var108 << 11);
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 172) {
                    int var110 = this.field546.method371();
                    class44.method460(var110).field1280 = 3;
                    if (field124.field1425 == null) {
                        class44.method460(var110).field1281 = (field124.field1410[11] << 5) + (field124.field1410[8] << 10) + (field124.field1410[0] << 15) + (field124.field1421[0] << 25) + (field124.field1421[4] << 20) + field124.field1410[1];
                    } else {
                        class44.method460(var110).field1281 = (int) (field124.field1425.field1572 + 305419896L);
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 182) {
                    this.field237 = this.field199 / 8;
                    for (int var111 = 0; var111 < this.field237; ++var111) {
                        this.field370[var111] = this.field546.method375(true);
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 234) {
                    this.field68 = false;
                    this.field62 = 2;
                    this.field438 = "";
                    this.field528 = true;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 190) {
                    this.method72(-852);
                    this.field200 = -1;
                    return false;
                }
                if (this.field200 == 167) {
                    int var112 = this.field546.method371();
                    int var113 = this.field546.method371();
                    int var114 = this.field546.method396(-30785);
                    class44.method460(var114).field1302 = (var113 << 16) + var112;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 99) {
                    int var115 = this.field546.method396(-30785);
                    this.method130(47243, var115);
                    if (this.field445 != -1) {
                        this.method154(3, this.field445);
                        this.field445 = -1;
                        this.field554 = true;
                        this.field148 = true;
                    }
                    if (this.field139 != -1) {
                        this.method154(3, this.field139);
                        this.field139 = -1;
                        this.field74 = true;
                    }
                    if (this.field128 != -1) {
                        this.method154(3, this.field128);
                        this.field128 = -1;
                    }
                    if (this.field542 != -1) {
                        this.method154(3, this.field542);
                        this.field542 = -1;
                    }
                    if (this.field368 != var115) {
                        this.method154(3, this.field368);
                        this.field368 = var115;
                    }
                    this.field291 = false;
                    this.field528 = true;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 213) {
                    int var116 = this.field546.method371();
                    int var117 = this.field546.method369();
                    int var118 = this.field546.method371();
                    if (var118 == 65535) {
                        if (this.field421 < 50) {
                            this.field313[this.field421] = (short) var116;
                            this.field398[this.field421] = var117;
                            this.field437[this.field421] = 0;
                            ++this.field421;
                        }
                    } else if (this.field393 && !field218 && this.field421 < 50) {
                        this.field313[this.field421] = var116;
                        this.field398[this.field421] = var117;
                        this.field437[this.field421] = class38.field1189[var116] + var118;
                        ++this.field421;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 9) {
                    int var119 = this.field546.method397(this.field375);
                    class44 var120 = class44.method460(var119);
                    for (int var121 = 0; var121 < var120.field1250.length; ++var121) {
                        var120.field1250[var121] = -1;
                        var120.field1250[var121] = 0;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 133) {
                    this.field179 = this.field546.method369();
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 35) {
                    this.field68 = false;
                    this.field62 = 1;
                    this.field438 = "";
                    this.field528 = true;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 196) {
                    int var122 = this.field546.method395((byte) 56);
                    int var123 = this.field546.method371();
                    this.method130(47243, var123);
                    if (var122 != -1) {
                        this.method130(47243, var122);
                    }
                    if (this.field542 != -1) {
                        this.method154(3, this.field542);
                        this.field542 = -1;
                    }
                    if (this.field445 != -1) {
                        this.method154(3, this.field445);
                        this.field445 = -1;
                    }
                    if (this.field368 != -1) {
                        this.method154(3, this.field368);
                        this.field368 = -1;
                    }
                    if (this.field139 != var123) {
                        this.method154(3, this.field139);
                        this.field139 = var123;
                    }
                    if (this.field128 != var123) {
                        this.method154(3, this.field128);
                        this.field128 = var122;
                    }
                    this.field62 = 0;
                    this.field291 = false;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 124) {
                    this.method122((byte) 8, this.field546, this.field199);
                    this.field137 = false;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 142) {
                    String var124 = this.field546.method376();
                    int var125 = this.field546.method371();
                    class44.method460(var125).field1285 = var124;
                    int var10001 = this.field349[this.field253];
                    if (class44.method460(var125).field1276 == var10001) {
                        this.field554 = true;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 57) {
                    this.field456 = this.field546.method387((byte) 104);
                    this.field455 = this.field546.method387((byte) 104);
                    while (this.field546.field1032 < this.field199) {
                        int var126 = this.field546.method369();
                        this.method98(this.field546, (byte) -121, var126);
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 227) {
                    this.field157 = this.field546.method369();
                    if (this.field253 == this.field157) {
                        if (this.field157 == 3) {
                            this.field253 = 1;
                        } else {
                            this.field253 = 3;
                        }
                        this.field554 = true;
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 103) {
                    this.field366 = true;
                    this.field555 = this.field546.method369();
                    this.field556 = this.field546.method369();
                    this.field557 = this.field546.method371();
                    this.field558 = this.field546.method369();
                    this.field559 = this.field546.method369();
                    if (this.field559 >= 100) {
                        int var127 = this.field555 * 128 + 64;
                        int var128 = this.field556 * 128 + 64;
                        int var129 = this.method147(var127, 0, this.field220, var128) - this.field557;
                        int var130 = var127 - this.field440;
                        int var131 = var129 - this.field441;
                        int var132 = var128 - this.field442;
                        int var133 = (int) Math.sqrt((double) (var130 * var130 + var132 * var132));
                        this.field443 = (int) (Math.atan2((double) var131, (double) var133) * 325.949D) & 2047;
                        this.field444 = (int) (Math.atan2((double) var130, (double) var132) * -325.949D) & 2047;
                        if (this.field443 < 128) {
                            this.field443 = 128;
                        }
                        if (this.field443 > 383) {
                            this.field443 = 383;
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 102) {
                    this.field401 = this.field546.method369();
                    this.field554 = true;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 6) {
                    this.field406 = this.field546.method395((byte) 56) * 30;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 67) {
                    for (int var134 = 0; var134 < this.field350.length; ++var134) {
                        if (this.field353[var134] != this.field350[var134]) {
                            this.field350[var134] = this.field353[var134];
                            this.method36(var134, 667);
                            this.field554 = true;
                        }
                    }
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 169 || this.field200 == 89) {
                    int var135 = this.field361;
                    int var136 = this.field362;
                    if (this.field200 == 169) {
                        var136 = this.field546.method395((byte) 56);
                        var135 = this.field546.method397(this.field375);
                        this.field307 = false;
                    }
                    if (this.field200 == 89) {
                        var136 = this.field546.method395((byte) 56);
                        this.field546.method379(-604);
                        int var137 = 0;
                        while (true) {
                            if (var137 >= 4) {
                                this.field546.method381(true);
                                var135 = this.field546.method371();
                                this.field307 = true;
                                break;
                            }
                            for (int var138 = 0; var138 < 13; ++var138) {
                                for (int var139 = 0; var139 < 13; ++var139) {
                                    int var140 = this.field546.method380(1, (byte) -50);
                                    if (var140 == 1) {
                                        this.field497[var137][var138][var139] = this.field546.method380(26, (byte) -50);
                                    } else {
                                        this.field497[var137][var138][var139] = -1;
                                    }
                                }
                            }
                            ++var137;
                        }
                    }
                    if (this.field361 == var135 && this.field362 == var136 && this.field290 == 2) {
                        this.field200 = -1;
                        return true;
                    }
                    this.field361 = var135;
                    this.field362 = var136;
                    this.field168 = (this.field361 - 6) * 8;
                    this.field169 = (this.field362 - 6) * 8;
                    this.field492 = false;
                    if ((this.field361 / 8 == 48 || this.field361 / 8 == 49) && this.field362 / 8 == 48) {
                        this.field492 = true;
                    }
                    if (this.field361 / 8 == 48 && this.field362 / 8 == 148) {
                        this.field492 = true;
                    }
                    this.field290 = 1;
                    this.field494 = System.currentTimeMillis();
                    this.method73((String) null, 0, "Loading - please wait.");
                    if (this.field200 == 169) {
                        int var141 = 0;
                        int var142 = (this.field361 - 6) / 8;
                        label1184: while (true) {
                            if (var142 > (this.field361 + 6) / 8) {
                                this.field381 = new byte[var141][];
                                this.field487 = new byte[var141][];
                                this.field521 = new int[var141];
                                this.field522 = new int[var141];
                                this.field523 = new int[var141];
                                int var144 = 0;
                                int var145 = (this.field361 - 6) / 8;
                                while (true) {
                                    if (var145 > (this.field361 + 6) / 8) {
                                        break label1184;
                                    }
                                    for (int var146 = (this.field362 - 6) / 8; var146 <= (this.field362 + 6) / 8; ++var146) {
                                        this.field521[var144] = (var145 << 8) + var146;
                                        if (this.field492 && (var146 == 49 || var146 == 149 || var146 == 147 || var145 == 50 || var145 == 49 && var146 == 47)) {
                                            this.field522[var144] = -1;
                                            this.field523[var144] = -1;
                                            ++var144;
                                        } else {
                                            int var147 = this.field522[var144] = this.field82.method236(var146, 0, 0, var145);
                                            if (var147 != -1) {
                                                this.field82.method240(3, var147);
                                            }
                                            int var148 = this.field523[var144] = this.field82.method236(var146, 1, 0, var145);
                                            if (var148 != -1) {
                                                this.field82.method240(3, var148);
                                            }
                                            ++var144;
                                        }
                                    }
                                    ++var145;
                                }
                            }
                            for (int var143 = (this.field362 - 6) / 8; var143 <= (this.field362 + 6) / 8; ++var143) {
                                ++var141;
                            }
                            ++var142;
                        }
                    }
                    if (this.field200 == 89) {
                        int var149 = 0;
                        int[] var150 = new int[676];
                        int var151 = 0;
                        label1145: while (true) {
                            if (var151 >= 4) {
                                this.field381 = new byte[var149][];
                                this.field487 = new byte[var149][];
                                this.field521 = new int[var149];
                                this.field522 = new int[var149];
                                this.field523 = new int[var149];
                                int var159 = 0;
                                while (true) {
                                    if (var159 >= var149) {
                                        break label1145;
                                    }
                                    int var160 = this.field521[var159] = var150[var159];
                                    int var161 = var160 >> 8 & 255;
                                    int var162 = var160 & 255;
                                    int var163 = this.field522[var159] = this.field82.method236(var162, 0, 0, var161);
                                    if (var163 != -1) {
                                        this.field82.method240(3, var163);
                                    }
                                    int var164 = this.field523[var159] = this.field82.method236(var162, 1, 0, var161);
                                    if (var164 != -1) {
                                        this.field82.method240(3, var164);
                                    }
                                    ++var159;
                                }
                            }
                            for (int var152 = 0; var152 < 13; ++var152) {
                                for (int var153 = 0; var153 < 13; ++var153) {
                                    int var154 = this.field497[var151][var152][var153];
                                    if (var154 != -1) {
                                        int var155 = var154 >> 14 & 1023;
                                        int var156 = var154 >> 3 & 2047;
                                        int var157 = (var155 / 8 << 8) + var156 / 8;
                                        for (int var158 = 0; var158 < var149; ++var158) {
                                            if (var150[var158] == var157) {
                                                var157 = -1;
                                                break;
                                            }
                                        }
                                        if (var157 != -1) {
                                            var150[var149++] = var157;
                                        }
                                    }
                                }
                            }
                            ++var151;
                        }
                    }
                    int var165 = this.field168 - this.field170;
                    int var166 = this.field169 - this.field171;
                    this.field170 = this.field168;
                    this.field171 = this.field169;
                    for (int var167 = 0; var167 < 16384; ++var167) {
                        class49 var168 = this.field340[var167];
                        if (var168 != null) {
                            for (int var169 = 0; var169 < 10; ++var169) {
                                var168.field1132[var169] -= var165;
                                var168.field1133[var169] -= var166;
                            }
                            var168.field1134 -= var165 * 128;
                            var168.field1135 -= var166 * 128;
                        }
                    }
                    for (int var170 = 0; var170 < this.field205; ++var170) {
                        class51 var171 = this.field207[var170];
                        if (var171 != null) {
                            for (int var172 = 0; var172 < 10; ++var172) {
                                var171.field1132[var172] -= var165;
                                var171.field1133[var172] -= var166;
                            }
                            var171.field1134 -= var165 * 128;
                            var171.field1135 -= var166 * 128;
                        }
                    }
                    this.field137 = true;
                    byte var173 = 0;
                    byte var174 = 104;
                    byte var175 = 1;
                    if (var165 < 0) {
                        var173 = 103;
                        var174 = -1;
                        var175 = -1;
                    }
                    byte var176 = 0;
                    byte var177 = 104;
                    byte var178 = 1;
                    if (var166 < 0) {
                        var176 = 103;
                        var177 = -1;
                        var178 = -1;
                    }
                    for (int var179 = var173; var174 != var179; var179 += var175) {
                        for (int var180 = var176; var177 != var180; var180 += var178) {
                            int var181 = var165 + var179;
                            int var182 = var166 + var180;
                            for (int var183 = 0; var183 < 4; ++var183) {
                                if (var181 >= 0 && var182 >= 0 && var181 < 104 && var182 < 104) {
                                    this.field235[var183][var179][var180] = this.field235[var183][var181][var182];
                                } else {
                                    this.field235[var183][var179][var180] = null;
                                }
                            }
                        }
                    }
                    for (class18 var184 = (class18) this.field75.method449(); var184 != null; var184 = (class18) this.field75.method451(-582)) {
                        var184.field899 -= var165;
                        var184.field900 -= var166;
                        if (var184.field899 < 0 || var184.field900 < 0 || var184.field899 >= 104 || var184.field900 >= 104) {
                            var184.method464();
                        }
                    }
                    if (this.field221 != 0) {
                        this.field221 -= var165;
                        this.field222 -= var166;
                    }
                    this.field366 = false;
                    this.field200 = -1;
                    return true;
                }
                if (this.field200 == 161) {
                    int var185 = this.field546.method371();
                    int var186 = this.field546.method371();
                    if (this.field368 != -1) {
                        this.method154(3, this.field368);
                        this.field368 = -1;
                        this.field528 = true;
                    }
                    if (this.field139 != -1) {
                        this.method154(3, this.field139);
                        this.field139 = -1;
                        this.field74 = true;
                    }
                    if (this.field128 != -1) {
                        this.method154(3, this.field128);
                        this.field128 = -1;
                    }
                    if (this.field542 != var186) {
                        this.method154(3, this.field542);
                        this.field542 = var186;
                    }
                    if (this.field445 != var185) {
                        this.method154(3, this.field445);
                        this.field445 = var185;
                    }
                    if (this.field62 != 0) {
                        this.field62 = 0;
                        this.field528 = true;
                    }
                    this.field554 = true;
                    this.field148 = true;
                    this.field291 = false;
                    this.field200 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field200 + "," + this.field199 + " - " + this.field144 + "," + this.field145);
                this.method72(-852);
            } catch (IOException var191) {
                this.method37(false);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field200 + "," + this.field144 + "," + this.field145 + " - " + this.field199 + "," + (field124.field1132[0] + this.field168) + "," + (field124.field1133[0] + this.field169) + " - ";
                for (int var189 = 0; var189 < this.field199 && var189 < 50; ++var189) {
                    var188 = var188 + this.field546.field1031[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method72(-852);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method84(boolean arg0, int arg1) {
        this.method28(true);
        while (arg1 >= 0) {
            this.method113();
        }
        this.field243.method298(0);
        this.field292.method586(-4899, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field228 == 0) {
            int var5 = var4 / 2 + 80;
            this.field473.method590(true, this.field82.field778, this.field352, 7711145, var5, var3 / 2);
            int var6 = var4 / 2 - 20;
            this.field475.method590(true, "Welcome to RuneScape", this.field352, 16776960, var6, var3 / 2);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field293.method586(-4899, var7 - 73, var8 - 20);
            this.field475.method590(true, "New User", this.field352, 16777215, var8 + 5, var7);
            int var9 = var3 / 2 + 80;
            this.field293.method586(-4899, var9 - 73, var8 - 20);
            this.field475.method590(true, "Existing User", this.field352, 16777215, var8 + 5, var9);
        }
        if (this.field228 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field93.length() > 0) {
                this.field475.method590(true, this.field93, this.field352, 16776960, var10 - 15, var3 / 2);
                this.field475.method590(true, this.field94, this.field352, 16776960, var10, var3 / 2);
                var10 += 30;
            } else {
                this.field475.method590(true, this.field94, this.field352, 16776960, var10 - 7, var3 / 2);
                var10 += 30;
            }
            this.field475.method597(16777215, "Username: " + this.field450 + (this.field265 == 0 & field174 % 40 < 20 ? "@yel@|" : ""), true, var3 / 2 - 90, this.field100, var10);
            var10 += 15;
            this.field475.method597(16777215, "Password: " + class40.method445(this.field451, 3) + (this.field265 == 1 & field174 % 40 < 20 ? "@yel@|" : ""), true, var3 / 2 - 88, this.field100, var10);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field293.method586(-4899, var11 - 73, var12 - 20);
                this.field475.method590(true, "Login", this.field352, 16777215, var12 + 5, var11);
                int var13 = var3 / 2 + 80;
                this.field293.method586(-4899, var13 - 73, var12 - 20);
                this.field475.method590(true, "Cancel", this.field352, 16777215, var12 + 5, var13);
            }
        }
        if (this.field228 == 3) {
            this.field475.method590(true, "Create a free account", this.field352, 16776960, var4 / 2 - 60, var3 / 2);
            int var14 = var4 / 2 - 35;
            this.field475.method590(true, "To create a new account you need to", this.field352, 16777215, var14, var3 / 2);
            int var18 = var14 + 15;
            this.field475.method590(true, "go back to the main RuneScape webpage", this.field352, 16777215, var18, var3 / 2);
            int var19 = var18 + 15;
            this.field475.method590(true, "and choose the 'create account'", this.field352, 16777215, var19, var3 / 2);
            int var20 = var19 + 15;
            this.field475.method590(true, "button near the top of that page.", this.field352, 16777215, var20, var3 / 2);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field293.method586(-4899, var15 - 73, var16 - 20);
            this.field475.method590(true, "Cancel", this.field352, 16777215, var16 + 5, var15);
        }
        this.field243.method299(super.field795, 202, 0, 171);
        if (this.field74) {
            this.field74 = false;
            this.field241.method299(super.field795, 128, 0, 0);
            this.field242.method299(super.field795, 202, 0, 371);
            this.field246.method299(super.field795, 0, 0, 265);
            this.field247.method299(super.field795, 562, 0, 265);
            this.field248.method299(super.field795, 128, 0, 171);
            this.field249.method299(super.field795, 562, 0, 171);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLPQPZKUPU;)I")
    public final int method85(int arg0, byte arg1, class44 arg2) {
        if (arg1 != 0) {
            this.field200 = -1;
        }
        if (arg2.field1295 != null && arg0 < arg2.field1295.length) {
            try {
                int[] var4 = arg2.field1295[arg0];
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
                        var9 = this.field178[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field79[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field324[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class44 var11 = class44.method460(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class60.field1507 && (!class60.method554(var12).field1530 || field217)) {
                            for (int var13 = 0; var13 < var11.field1250.length; ++var13) {
                                if (var12 + 1 == var11.field1250[var13]) {
                                    var9 += var11.field1255[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field350[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field301[this.field79[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field350[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field124.field1408;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class56.field1449; ++var14) {
                            if (class56.field1451[var14]) {
                                var9 += this.field79[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class44 var15 = class44.method460(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class60.field1507 && (!class60.method554(var16).field1530 || field217)) {
                            for (int var17 = 0; var17 < var15.field1250.length; ++var17) {
                                if (var15.field1250[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field508;
                    }
                    if (var8 == 12) {
                        var9 = this.field262;
                    }
                    if (var8 == 13) {
                        int var18 = this.field350[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class23 var21 = class23.field946[var20];
                        int var22 = var21.field948;
                        int var23 = var21.field949;
                        int var24 = var21.field950;
                        int var25 = field544[var24 - var23];
                        var9 = this.field350[var22] >> var23 & var25;
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
                        var9 = (field124.field1134 >> 7) + this.field168;
                    }
                    if (var8 == 19) {
                        var9 = (field124.field1135 >> 7) + this.field169;
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

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method86(int arg0, int arg1) {
        if (arg0 >= 0) {
            int var3 = this.field254[arg0];
            int var4 = this.field255[arg0];
            int var5 = this.field256[arg0];
            int var6 = this.field257[arg0];
            int var7 = 40 / arg1;
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field62 != 0 && var5 != 1321) {
                this.field62 = 0;
                this.field528 = true;
            }
            if (var5 == 972) {
                boolean var8 = this.method76(field124.field1132[0], this.field57, 0, 0, 0, 0, 2, var4, false, field124.field1133[0], 0, var3);
                if (!var8) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var4, false, field124.field1133[0], 1, var3);
                }
                this.field83 = super.field810;
                this.field84 = super.field811;
                this.field86 = 2;
                this.field85 = 0;
                this.field92.method358(7793, 77);
                this.field92.method392(this.field168 + var3, false);
                this.field92.method360(var6);
                this.field92.method394(6, this.field169 + var4);
            }
            if (var5 == 915) {
                this.field92.method358(7793, 52);
                this.field92.method360(var4);
                class44 var10 = class44.method460(var4);
                if (var10.field1295 != null && var10.field1295[0][0] == 5) {
                    int var11 = var10.field1295[0][1];
                    if (this.field350[var11] != var10.field1248[0]) {
                        this.field350[var11] = var10.field1248[0];
                        this.method36(var11, 667);
                        this.field554 = true;
                    }
                }
            }
            if (var5 == 564) {
                String var12 = this.field447[arg0];
                int var13 = var12.indexOf("@whi@");
                if (var13 != -1) {
                    if (this.field542 == -1) {
                        this.method14(0);
                        this.field231 = var12.substring(var13 + 5).trim();
                        this.field410 = false;
                        this.field347 = this.field542 = class44.field1245;
                    } else {
                        this.method67("Please close the interface you have open before using 'report abuse'", "", 0, -39349);
                    }
                }
            }
            if (var5 == 1161) {
                this.method101(true, var3, var6, var4);
                this.field92.method358(7793, 86);
                this.field92.method360(this.field168 + var3);
                this.field92.method360(this.field169 + var4);
                this.field92.method393(var6 >> 14 & 32767, (byte) 1);
            }
            if (var5 == 455 || var5 == 899) {
                String var14 = this.field447[arg0];
                int var15 = var14.indexOf("@whi@");
                if (var15 != -1) {
                    String var16 = var14.substring(var15 + 5).trim();
                    String var17 = class40.method444(true, class40.method441(359, class40.method440(var16)));
                    boolean var18 = false;
                    for (int var19 = 0; var19 < this.field208; ++var19) {
                        class51 var20 = this.field207[this.field209[var19]];
                        if (var20 != null && var20.field1423 != null && var20.field1423.equalsIgnoreCase(var17)) {
                            this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var20.field1133[0], false, field124.field1133[0], 1, var20.field1132[0]);
                            if (var5 == 455) {
                                this.field92.method358(7793, 26);
                                this.field92.method392(this.field209[var19], false);
                            }
                            if (var5 == 899) {
                                this.field92.method358(7793, 48);
                                this.field92.method392(this.field209[var19], false);
                            }
                            var18 = true;
                            break;
                        }
                    }
                    if (!var18) {
                        this.method67("Unable to find " + var17, "", 0, -39349);
                    }
                }
            }
            if (var5 == 971) {
                this.field92.method358(7793, 221);
                this.field92.method394(6, var4);
                this.field92.method394(6, var3);
                this.field92.method394(6, var6);
                this.field284 = 0;
                this.field285 = var4;
                this.field286 = var3;
                this.field287 = 2;
                if (class44.method460(var4).field1276 == this.field542) {
                    this.field287 = 1;
                }
                if (class44.method460(var4).field1276 == this.field368) {
                    this.field287 = 3;
                }
            }
            if (var5 == 273) {
                field192 += var3;
                if (field192 >= 67) {
                    this.field92.method358(7793, 57);
                    this.field92.method362(3721323);
                    field192 = 0;
                }
                this.field92.method358(7793, 91);
                this.field92.method394(6, var3);
                this.field92.method394(6, var4);
                this.field92.method392(var6, false);
                this.field284 = 0;
                this.field285 = var4;
                this.field286 = var3;
                this.field287 = 2;
                if (class44.method460(var4).field1276 == this.field542) {
                    this.field287 = 1;
                }
                if (class44.method460(var4).field1276 == this.field368) {
                    this.field287 = 3;
                }
            }
            if (var5 == 402) {
                this.field92.method358(7793, 59);
                this.field92.method360(var6);
                this.field92.method360(this.field183);
                this.field92.method392(this.field185, false);
                this.field92.method393(var3, (byte) 1);
                this.field92.method392(this.field184, false);
                this.field92.method393(var4, (byte) 1);
                this.field284 = 0;
                this.field285 = var4;
                this.field286 = var3;
                this.field287 = 2;
                if (class44.method460(var4).field1276 == this.field542) {
                    this.field287 = 1;
                }
                if (class44.method460(var4).field1276 == this.field368) {
                    this.field287 = 3;
                }
            }
            if (var5 == 213) {
                this.method101(true, var3, var6, var4);
                this.field92.method358(7793, 126);
                this.field92.method393(this.field168 + var3, (byte) 1);
                this.field92.method360(var6 >> 14 & 32767);
                this.field92.method360(this.field169 + var4);
            }
            if (var5 == 151) {
                class49 var21 = this.field340[var6];
                if (var21 != null) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var21.field1133[0], false, field124.field1133[0], 1, var21.field1132[0]);
                    this.field83 = super.field810;
                    this.field84 = super.field811;
                    this.field86 = 2;
                    this.field85 = 0;
                    this.field92.method358(7793, 140);
                    this.field92.method360(this.field185);
                    this.field92.method394(6, var6);
                    this.field92.method394(6, this.field183);
                    this.field92.method394(6, this.field184);
                }
            }
            if (var5 == 308 || var5 == 502 || var5 == 760 || var5 == 831) {
                String var22 = this.field447[arg0];
                int var23 = var22.indexOf("@whi@");
                if (var23 != -1) {
                    long var24 = class40.method440(var22.substring(var23 + 5).trim());
                    if (var5 == 308) {
                        this.method43((byte) 5, var24);
                    }
                    if (var5 == 502) {
                        this.method82(var24, 954);
                    }
                    if (var5 == 760) {
                        this.method102((byte) 117, var24);
                    }
                    if (var5 == 831) {
                        this.method109(5, var24);
                    }
                }
            }
            if (var5 == 776) {
                class49 var26 = this.field340[var6];
                if (var26 != null) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var26.field1133[0], false, field124.field1133[0], 1, var26.field1132[0]);
                    this.field83 = super.field810;
                    this.field84 = super.field811;
                    this.field86 = 2;
                    this.field85 = 0;
                    field225 += var6;
                    if (field225 >= 141) {
                        this.field92.method358(7793, 109);
                        this.field92.method363(0);
                        field225 = 0;
                    }
                    this.field92.method358(7793, 135);
                    this.field92.method360(var6);
                }
            }
            if (var5 == 72) {
                class51 var27 = this.field207[var6];
                if (var27 != null) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var27.field1133[0], false, field124.field1133[0], 1, var27.field1132[0]);
                    this.field83 = super.field810;
                    this.field84 = super.field811;
                    this.field86 = 2;
                    this.field85 = 0;
                    this.field92.method358(7793, 222);
                    this.field92.method360(var6);
                }
            }
            if (var5 == 368) {
                boolean var28 = this.method76(field124.field1132[0], this.field57, 0, 0, 0, 0, 2, var4, false, field124.field1133[0], 0, var3);
                if (!var28) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var4, false, field124.field1133[0], 1, var3);
                }
                this.field83 = super.field810;
                this.field84 = super.field811;
                this.field86 = 2;
                this.field85 = 0;
                this.field92.method358(7793, 181);
                this.field92.method393(this.field169 + var4, (byte) 1);
                this.field92.method393(this.field168 + var3, (byte) 1);
                this.field92.method394(6, var6);
            }
            if (var5 == 652) {
                this.field92.method358(7793, 52);
                this.field92.method360(var4);
                class44 var30 = class44.method460(var4);
                if (var30.field1295 != null && var30.field1295[0][0] == 5) {
                    int var31 = var30.field1295[0][1];
                    this.field350[var31] = 1 - this.field350[var31];
                    this.method36(var31, 667);
                    this.field554 = true;
                }
            }
            if (var5 == 114) {
                class51 var32 = this.field207[var6];
                if (var32 != null) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var32.field1133[0], false, field124.field1133[0], 1, var32.field1132[0]);
                    this.field83 = super.field810;
                    this.field84 = super.field811;
                    this.field86 = 2;
                    this.field85 = 0;
                    this.field92.method358(7793, 193);
                    this.field92.method393(var6, (byte) 1);
                    this.field92.method394(6, this.field188);
                }
            }
            if (var5 == 37 && this.method101(true, var3, var6, var4)) {
                this.field92.method358(7793, 18);
                this.field92.method393(this.field184, (byte) 1);
                this.field92.method394(6, this.field169 + var4);
                this.field92.method394(6, var6 >> 14 & 32767);
                this.field92.method393(this.field185, (byte) 1);
                this.field92.method392(this.field168 + var3, false);
                this.field92.method392(this.field183, false);
            }
            if (var5 == 220) {
                this.field92.method358(7793, 206);
                this.field92.method394(6, var3);
                this.field92.method392(var4, false);
                this.field92.method393(var6, (byte) 1);
                this.field284 = 0;
                this.field285 = var4;
                this.field286 = var3;
                this.field287 = 2;
                if (class44.method460(var4).field1276 == this.field542) {
                    this.field287 = 1;
                }
                if (class44.method460(var4).field1276 == this.field368) {
                    this.field287 = 3;
                }
            }
            if (var5 == 43 && !this.field291) {
                this.field92.method358(7793, 177);
                this.field92.method360(var4);
                this.field291 = true;
            }
            if (var5 == 132) {
                class49 var33 = this.field340[var6];
                if (var33 != null) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var33.field1133[0], false, field124.field1133[0], 1, var33.field1132[0]);
                    this.field83 = super.field810;
                    this.field84 = super.field811;
                    this.field86 = 2;
                    this.field85 = 0;
                    ++field458;
                    if (field458 >= 129) {
                        this.field92.method358(7793, 130);
                        this.field92.method363(0);
                        field458 = 0;
                    }
                    this.field92.method358(7793, 60);
                    this.field92.method394(6, var6);
                }
            }
            if (var5 == 581) {
                class49 var34 = this.field340[var6];
                if (var34 != null) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var34.field1133[0], false, field124.field1133[0], 1, var34.field1132[0]);
                    this.field83 = super.field810;
                    this.field84 = super.field811;
                    this.field86 = 2;
                    this.field85 = 0;
                    this.field92.method358(7793, 95);
                    this.field92.method360(this.field188);
                    this.field92.method392(var6, false);
                }
            }
            if (var5 == 85) {
                class51 var35 = this.field207[var6];
                if (var35 != null) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var35.field1133[0], false, field124.field1133[0], 1, var35.field1132[0]);
                    this.field83 = super.field810;
                    this.field84 = super.field811;
                    this.field86 = 2;
                    this.field85 = 0;
                    this.field92.method358(7793, 48);
                    this.field92.method392(var6, false);
                }
            }
            if (var5 == 924) {
                boolean var36 = this.method76(field124.field1132[0], this.field57, 0, 0, 0, 0, 2, var4, false, field124.field1133[0], 0, var3);
                if (!var36) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var4, false, field124.field1133[0], 1, var3);
                }
                this.field83 = super.field810;
                this.field84 = super.field811;
                this.field86 = 2;
                this.field85 = 0;
                this.field92.method358(7793, 210);
                this.field92.method393(this.field168 + var3, (byte) 1);
                this.field92.method360(this.field188);
                this.field92.method394(6, this.field169 + var4);
                this.field92.method360(var6);
            }
            if (var5 == 565) {
                class49 var38 = this.field340[var6];
                if (var38 != null) {
                    this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var38.field1133[0], false, field124.field1133[0], 1, var38.field1132[0]);
                    this.field83 = super.field810;
                    this.field84 = super.field811;
                    this.field86 = 2;
                    this.field85 = 0;
                    this.field92.method358(7793, 186);
                    this.field92.method393(var6, (byte) 1);
                }
            }
            if (var5 == 1094) {
                class49 var39 = this.field340[var6];
                if (var39 != null) {
                    class64 var40 = var39.field1402;
                    if (var40.field1587 != null) {
                        var40 = var40.method572(7);
                    }
                    if (var40 != null) {
                        String var41;
                        if (var40.field1592 != null) {
                            var41 = new String(var40.field1592);
                        } else {
                            var41 = "It's a " + var40.field1582 + ".";
                        }
                        this.method67(var41, "", 0, -39349);
                    }
                }
            }
            if (var5 == 138) {
                this.field182 = 1;
                this.field183 = var3;
                this.field184 = var4;
                this.field185 = var6;
                this.field186 = class60.method554(var6).field1541;
                this.field187 = 0;
                this.field554 = true;
            } else {
                if (var5 == 496) {
                    class44 var42 = class44.method460(var4);
                    boolean var43 = true;
                    if (var42.field1243 > 0) {
                        var43 = this.method70(var42, 12768);
                    }
                    if (var43) {
                        this.field92.method358(7793, 52);
                        this.field92.method360(var4);
                    }
                }
                if (var5 == 364) {
                    this.field92.method358(7793, 156);
                    this.field92.method394(6, var4);
                    this.field92.method392(var3, false);
                    this.field92.method394(6, var6);
                    this.field284 = 0;
                    this.field285 = var4;
                    this.field286 = var3;
                    this.field287 = 2;
                    if (class44.method460(var4).field1276 == this.field542) {
                        this.field287 = 1;
                    }
                    if (class44.method460(var4).field1276 == this.field368) {
                        this.field287 = 3;
                    }
                }
                if (var5 == 168) {
                    this.field92.method358(7793, 23);
                    this.field92.method360(var6);
                    this.field92.method392(var4, false);
                    this.field92.method393(var3, (byte) 1);
                    this.field284 = 0;
                    this.field285 = var4;
                    this.field286 = var3;
                    this.field287 = 2;
                    if (class44.method460(var4).field1276 == this.field542) {
                        this.field287 = 1;
                    }
                    if (class44.method460(var4).field1276 == this.field368) {
                        this.field287 = 3;
                    }
                }
                if (var5 == 1759) {
                    class60 var44 = class60.method554(var6);
                    class44 var45 = class44.method460(var4);
                    String var46;
                    if (var45 != null && var45.field1255[var3] >= 100000) {
                        var46 = var45.field1255[var3] + " x " + var44.field1541;
                    } else if (var44.field1521 != null) {
                        var46 = new String(var44.field1521);
                    } else {
                        var46 = "It's a " + var44.field1541 + ".";
                    }
                    this.method67(var46, "", 0, -39349);
                }
                if (var5 == 894 && this.method101(true, var3, var6, var4)) {
                    this.field92.method358(7793, 237);
                    this.field92.method393(this.field168 + var3, (byte) 1);
                    this.field92.method394(6, this.field169 + var4);
                    this.field92.method393(this.field188, (byte) 1);
                    this.field92.method393(var6 >> 14 & 32767, (byte) 1);
                }
                if (var5 == 224) {
                    if ((var3 & 3) == 0) {
                        ++field121;
                    }
                    if (field121 >= 128) {
                        this.field92.method358(7793, 58);
                        this.field92.method363(0);
                        field121 = 0;
                    }
                    this.method101(true, var3, var6, var4);
                    this.field92.method358(7793, 99);
                    this.field92.method392(var6 >> 14 & 32767, false);
                    this.field92.method360(this.field169 + var4);
                    this.field92.method394(6, this.field168 + var3);
                }
                if (var5 == 377) {
                    field446 += var6;
                    if (field446 >= 130) {
                        this.field92.method358(7793, 90);
                        this.field92.method363(0);
                        field446 = 0;
                    }
                    this.field92.method358(7793, 31);
                    this.field92.method393(var3, (byte) 1);
                    this.field92.method392(var6, false);
                    this.field92.method360(var4);
                    this.field284 = 0;
                    this.field285 = var4;
                    this.field286 = var3;
                    this.field287 = 2;
                    if (class44.method460(var4).field1276 == this.field542) {
                        this.field287 = 1;
                    }
                    if (class44.method460(var4).field1276 == this.field368) {
                        this.field287 = 3;
                    }
                }
                if (var5 == 989) {
                    boolean var47 = this.method76(field124.field1132[0], this.field57, 0, 0, 0, 0, 2, var4, false, field124.field1133[0], 0, var3);
                    if (!var47) {
                        this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var4, false, field124.field1133[0], 1, var3);
                    }
                    this.field83 = super.field810;
                    this.field84 = super.field811;
                    this.field86 = 2;
                    this.field85 = 0;
                    this.field92.method358(7793, 236);
                    this.field92.method393(this.field169 + var4, (byte) 1);
                    this.field92.method393(this.field185, (byte) 1);
                    this.field92.method394(6, var6);
                    this.field92.method393(this.field168 + var3, (byte) 1);
                    this.field92.method393(this.field184, (byte) 1);
                    this.field92.method393(this.field183, (byte) 1);
                }
                if (var5 == 262) {
                    class51 var49 = this.field207[var6];
                    if (var49 != null) {
                        this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var49.field1133[0], false, field124.field1133[0], 1, var49.field1132[0]);
                        this.field83 = super.field810;
                        this.field84 = super.field811;
                        this.field86 = 2;
                        this.field85 = 0;
                        this.field92.method358(7793, 235);
                        this.field92.method392(var6, false);
                    }
                }
                if (var5 == 716) {
                    class51 var50 = this.field207[var6];
                    if (var50 != null) {
                        this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var50.field1133[0], false, field124.field1133[0], 1, var50.field1132[0]);
                        this.field83 = super.field810;
                        this.field84 = super.field811;
                        this.field86 = 2;
                        this.field85 = 0;
                        this.field92.method358(7793, 114);
                        this.field92.method394(6, var6);
                    }
                }
                if (var5 == 158) {
                    if (!this.field507) {
                        this.field176.method509(super.field811 - 4, super.field810 - 4, 4);
                    } else {
                        this.field176.method509(var4 - 4, var3 - 4, 4);
                    }
                }
                if (var5 == 619) {
                    class44 var51 = class44.method460(var4);
                    this.field187 = 1;
                    this.field188 = var4;
                    this.field189 = var51.field1301;
                    this.field182 = 0;
                    this.field554 = true;
                    String var52 = var51.field1257;
                    if (var52.indexOf(" ") != -1) {
                        var52 = var52.substring(0, var52.indexOf(" "));
                    }
                    String var53 = var51.field1257;
                    if (var53.indexOf(" ") != -1) {
                        var53 = var53.substring(var53.indexOf(" ") + 1);
                    }
                    this.field190 = var52 + " " + var51.field1239 + " " + var53;
                    if (this.field189 == 16) {
                        this.field554 = true;
                        this.field253 = 3;
                        this.field148 = true;
                    }
                } else {
                    if (var5 == 34) {
                        this.field92.method358(7793, 211);
                        this.field92.method393(var6, (byte) 1);
                        this.field92.method393(var3, (byte) 1);
                        this.field92.method394(6, var4);
                        this.field284 = 0;
                        this.field285 = var4;
                        this.field286 = var3;
                        this.field287 = 2;
                        if (class44.method460(var4).field1276 == this.field542) {
                            this.field287 = 1;
                        }
                        if (class44.method460(var4).field1276 == this.field368) {
                            this.field287 = 3;
                        }
                    }
                    if (var5 == 987) {
                        this.field92.method358(7793, 226);
                        this.field92.method393(this.field188, (byte) 1);
                        this.field92.method392(var3, false);
                        this.field92.method392(var6, false);
                        this.field92.method392(var4, false);
                        this.field284 = 0;
                        this.field285 = var4;
                        this.field286 = var3;
                        this.field287 = 2;
                        if (class44.method460(var4).field1276 == this.field542) {
                            this.field287 = 1;
                        }
                        if (class44.method460(var4).field1276 == this.field368) {
                            this.field287 = 3;
                        }
                    }
                    if (var5 == 964) {
                        class51 var54 = this.field207[var6];
                        if (var54 != null) {
                            this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var54.field1133[0], false, field124.field1133[0], 1, var54.field1132[0]);
                            this.field83 = super.field810;
                            this.field84 = super.field811;
                            this.field86 = 2;
                            this.field85 = 0;
                            this.field92.method358(7793, 219);
                            this.field92.method360(this.field184);
                            this.field92.method360(this.field183);
                            this.field92.method392(this.field185, false);
                            this.field92.method392(var6, false);
                        }
                    }
                    if (var5 == 855) {
                        this.field92.method358(7793, 82);
                        this.field92.method394(6, var4);
                        this.field92.method393(var6, (byte) 1);
                        this.field92.method394(6, var3);
                        this.field284 = 0;
                        this.field285 = var4;
                        this.field286 = var3;
                        this.field287 = 2;
                        if (class44.method460(var4).field1276 == this.field542) {
                            this.field287 = 1;
                        }
                        if (class44.method460(var4).field1276 == this.field368) {
                            this.field287 = 3;
                        }
                    }
                    if (var5 == 1876) {
                        class60 var55 = class60.method554(var6);
                        String var56;
                        if (var55.field1521 != null) {
                            var56 = new String(var55.field1521);
                        } else {
                            var56 = "It's a " + var55.field1541 + ".";
                        }
                        this.method67(var56, "", 0, -39349);
                    }
                    if (var5 == 705) {
                        class49 var57 = this.field340[var6];
                        if (var57 != null) {
                            this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var57.field1133[0], false, field124.field1133[0], 1, var57.field1132[0]);
                            this.field83 = super.field810;
                            this.field84 = super.field811;
                            this.field86 = 2;
                            this.field85 = 0;
                            this.field92.method358(7793, 255);
                            this.field92.method393(var6, (byte) 1);
                        }
                    }
                    if (var5 == 181) {
                        class49 var58 = this.field340[var6];
                        if (var58 != null) {
                            this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var58.field1133[0], false, field124.field1133[0], 1, var58.field1132[0]);
                            this.field83 = super.field810;
                            this.field84 = super.field811;
                            this.field86 = 2;
                            this.field85 = 0;
                            this.field92.method358(7793, 168);
                            this.field92.method393(var6, (byte) 1);
                        }
                    }
                    if (var5 == 678) {
                        String var59 = this.field447[arg0];
                        int var60 = var59.indexOf("@whi@");
                        if (var60 != -1) {
                            long var61 = class40.method440(var59.substring(var60 + 5).trim());
                            int var63 = -1;
                            for (int var64 = 0; var64 < this.field400; ++var64) {
                                if (this.field457[var64] == var61) {
                                    var63 = var64;
                                    break;
                                }
                            }
                            if (var63 != -1 && this.field154[var63] > 0) {
                                this.field528 = true;
                                this.field62 = 0;
                                this.field68 = true;
                                this.field308 = "";
                                this.field408 = 3;
                                this.field509 = this.field457[var63];
                                this.field304 = "Enter message to send to " + this.field239[var63];
                            }
                        }
                    }
                    if (var5 == 1) {
                        this.method14(0);
                    }
                    if (var5 == 912) {
                        if ((this.field169 & 3) == 0) {
                            ++field510;
                        }
                        if (field510 >= 57) {
                            this.field92.method358(7793, 174);
                            this.field92.method359(24);
                            field510 = 0;
                        }
                        this.method101(true, var3, var6, var4);
                        this.field92.method358(7793, 248);
                        this.field92.method392(var6 >> 14 & 32767, false);
                        this.field92.method394(6, this.field168 + var3);
                        this.field92.method394(6, this.field169 + var4);
                    }
                    if (var5 == 48) {
                        boolean var65 = this.method76(field124.field1132[0], this.field57, 0, 0, 0, 0, 2, var4, false, field124.field1133[0], 0, var3);
                        if (!var65) {
                            this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var4, false, field124.field1133[0], 1, var3);
                        }
                        this.field83 = super.field810;
                        this.field84 = super.field811;
                        this.field86 = 2;
                        this.field85 = 0;
                        ++field526;
                        if (field526 >= 136) {
                            this.field92.method358(7793, 36);
                            this.field92.method359(225);
                            field526 = 0;
                        }
                        this.field92.method358(7793, 12);
                        this.field92.method360(this.field169 + var4);
                        this.field92.method394(6, this.field168 + var3);
                        this.field92.method360(var6);
                    }
                    if (var5 == 495) {
                        field261 += var4;
                        if (field261 >= 112) {
                            this.field92.method358(7793, 42);
                            field261 = 0;
                        }
                        this.field92.method358(7793, 128);
                        this.field92.method393(var3, (byte) 1);
                        this.field92.method360(var6);
                        this.field92.method392(var4, false);
                        this.field284 = 0;
                        this.field285 = var4;
                        this.field286 = var3;
                        this.field287 = 2;
                        if (class44.method460(var4).field1276 == this.field542) {
                            this.field287 = 1;
                        }
                        if (class44.method460(var4).field1276 == this.field368) {
                            this.field287 = 3;
                        }
                    }
                    if (var5 == 649) {
                        this.method101(true, var3, var6, var4);
                        this.field92.method358(7793, 32);
                        this.field92.method392(this.field168 + var3, false);
                        this.field92.method393(var6 >> 14 & 32767, (byte) 1);
                        this.field92.method394(6, this.field169 + var4);
                    }
                    if (var5 == 357) {
                        boolean var67 = this.method76(field124.field1132[0], this.field57, 0, 0, 0, 0, 2, var4, false, field124.field1133[0], 0, var3);
                        if (!var67) {
                            this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var4, false, field124.field1133[0], 1, var3);
                        }
                        this.field83 = super.field810;
                        this.field84 = super.field811;
                        this.field86 = 2;
                        this.field85 = 0;
                        this.field92.method358(7793, 24);
                        this.field92.method360(this.field168 + var3);
                        this.field92.method360(var6);
                        this.field92.method392(this.field169 + var4, false);
                    }
                    if (var5 == 1509) {
                        int var69 = var6 >> 14 & 32767;
                        class34 var70 = class34.method409(var69);
                        String var71;
                        if (var70.field1092 != null) {
                            var71 = new String(var70.field1092);
                        } else {
                            var71 = "It's a " + var70.field1093 + ".";
                        }
                        this.method67(var71, "", 0, -39349);
                    }
                    if (var5 == 670) {
                        boolean var72 = this.method76(field124.field1132[0], this.field57, 0, 0, 0, 0, 2, var4, false, field124.field1133[0], 0, var3);
                        if (!var72) {
                            this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var4, false, field124.field1133[0], 1, var3);
                        }
                        this.field83 = super.field810;
                        this.field84 = super.field811;
                        this.field86 = 2;
                        this.field85 = 0;
                        this.field92.method358(7793, 151);
                        this.field92.method360(var6);
                        this.field92.method393(this.field169 + var4, (byte) 1);
                        this.field92.method393(this.field168 + var3, (byte) 1);
                    }
                    if (var5 == 817) {
                        if ((var3 & 3) == 0) {
                            ++field71;
                        }
                        if (field71 >= 94) {
                            this.field92.method358(7793, 125);
                            this.field92.method359(25);
                            field71 = 0;
                        }
                        this.field92.method358(7793, 203);
                        this.field92.method393(var3, (byte) 1);
                        this.field92.method394(6, var4);
                        this.field92.method394(6, var6);
                        this.field284 = 0;
                        this.field285 = var4;
                        this.field286 = var3;
                        this.field287 = 2;
                        if (class44.method460(var4).field1276 == this.field542) {
                            this.field287 = 1;
                        }
                        if (class44.method460(var4).field1276 == this.field368) {
                            this.field287 = 3;
                        }
                    }
                    if (var5 == 636) {
                        class51 var74 = this.field207[var6];
                        if (var74 != null) {
                            this.method76(field124.field1132[0], this.field57, 0, 1, 0, 0, 2, var74.field1133[0], false, field124.field1133[0], 1, var74.field1132[0]);
                            this.field83 = super.field810;
                            this.field84 = super.field811;
                            this.field86 = 2;
                            this.field85 = 0;
                            this.field92.method358(7793, 26);
                            this.field92.method392(var6, false);
                        }
                    }
                    if (var5 == 895) {
                        this.method154(3, this.field138);
                        this.field138 = -1;
                        this.field528 = true;
                    }
                    this.field182 = 0;
                    this.field187 = 0;
                    this.field554 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method87(int arg0) {
        this.field336 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field405[var2] = -1;
            for (int var4 = 0; var4 < class7.field603; ++var4) {
                if (!class7.field604[var4].field610 && class7.field604[var4].field605 == var2 + (this.field394 ? 0 : 7)) {
                    this.field405[var2] = var4;
                    break;
                }
            }
        }
        int var3 = 92 / arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method88(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 < 9 || arg1 > 9) {
            this.field147 = this.field232.method424();
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method89(int arg0) {
        if (arg0 != 0) {
            this.field92.method359(184);
        }
        if (field218 && this.field290 == 2 && class16.field867 != this.field220) {
            this.method73((String) null, 0, "Loading - please wait.");
            this.field290 = 1;
            this.field494 = System.currentTimeMillis();
        }
        if (this.field290 == 1) {
            int var2 = this.method90(0);
            if (var2 != 0 && System.currentTimeMillis() - this.field494 > 360000L) {
                signlink.reporterror(this.field450 + " glcfb " + this.field150 + "," + var2 + "," + field218 + "," + this.field337[0] + "," + this.field82.method239() + "," + this.field220 + "," + this.field361 + "," + this.field362);
                this.field494 = System.currentTimeMillis();
            }
        }
        if (this.field290 == 2 && this.field288 != this.field220) {
            this.field288 = this.field220;
            this.method63(this.field220, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)I")
    public final int method90(int arg0) {
        for (int var2 = 0; var2 < this.field381.length; ++var2) {
            if (this.field381[var2] == null && this.field522[var2] != -1) {
                return -1;
            }
            if (this.field487[var2] == null && this.field523[var2] != -1) {
                return -2;
            }
        }
        this.field199 += arg0;
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field381.length; ++var4) {
            byte[] var5 = this.field487[var4];
            if (var5 != null) {
                int var6 = (this.field521[var4] >> 8) * 64 - this.field168;
                int var7 = (this.field521[var4] & 255) * 64 - this.field169;
                if (this.field307) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class16.method266(var6, -482, var5, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field137) {
            return -4;
        } else {
            this.field290 = 2;
            class16.field867 = this.field220;
            this.method55(389);
            this.field92.method358(7793, 120);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method91(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field200 = this.field546.method369();
        }
        if (!field218) {
            for (int var3 = 0; var3 < this.field479.length; ++var3) {
                int var4 = this.field479[var3];
                if (class6.field597[var4] >= arg0) {
                    class69 var5 = class6.field591[var4];
                    int var6 = var5.field1688 * var5.field1687 - 1;
                    int var7 = this.field116 * var5.field1687 * 2;
                    byte[] var8 = var5.field1685;
                    byte[] var9 = this.field91;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1685 = var9;
                    this.field91 = var8;
                    class6.method176(var4, 1);
                    ++field69;
                    if (field69 > 1462) {
                        field69 = 0;
                        this.field92.method358(7793, 231);
                        this.field92.method359(0);
                        int var11 = this.field92.field1032;
                        if ((int) (Math.random() * 2.0D) == 0) {
                            this.field92.method360(63214);
                        }
                        if ((int) (Math.random() * 2.0D) == 0) {
                            this.field92.method360(14114);
                        }
                        this.field92.method360(16897);
                        this.field92.method359(71);
                        this.field92.method359(77);
                        this.field92.method360((int) (Math.random() * 65536.0D));
                        this.field92.method359(220);
                        this.field92.method359(49);
                        this.field92.method359(45);
                        if ((int) (Math.random() * 2.0D) == 0) {
                            this.field92.method360(59782);
                        }
                        this.field92.method368(this.field92.field1032 - var11, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLPQPZKUPU;)V")
    public final void method92(byte arg0, class44 arg1) {
        if (arg0 != -22) {
            this.field295 = -358;
        }
        int var3 = arg1.field1243;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field400;
                if (this.field401 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field1285 = "";
                    arg1.field1313 = 0;
                } else {
                    if (this.field154[var3] == 0) {
                        arg1.field1285 = "@red@Offline";
                    } else if (this.field154[var3] < 200) {
                        if (this.field154[var3] == field215) {
                            arg1.field1285 = "@gre@World" + (this.field154[var3] - 9);
                        } else {
                            arg1.field1285 = "@yel@World" + (this.field154[var3] - 9);
                        }
                    } else if (this.field154[var3] == field215) {
                        arg1.field1285 = "@gre@Classic" + (this.field154[var3] - 219);
                    } else {
                        arg1.field1285 = "@yel@Classic" + (this.field154[var3] - 219);
                    }
                    arg1.field1313 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field400;
                if (this.field401 != 2) {
                    var6 = 0;
                }
                arg1.field1278 = var6 * 15 + 20;
                if (arg1.field1278 <= arg1.field1296) {
                    arg1.field1278 = arg1.field1296 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field401 == 0) {
                    arg1.field1285 = "Loading ignore list";
                    arg1.field1313 = 0;
                } else if (var3 == 1 && this.field401 == 0) {
                    arg1.field1285 = "Please wait...";
                    arg1.field1313 = 0;
                } else {
                    int var7 = this.field237;
                    if (this.field401 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field1285 = "";
                        arg1.field1313 = 0;
                    } else {
                        arg1.field1285 = class40.method444(true, class40.method441(359, this.field370[var3]));
                        arg1.field1313 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field1278 = this.field237 * 15 + 20;
                if (arg1.field1278 <= arg1.field1296) {
                    arg1.field1278 = arg1.field1296 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1311 = 150;
                arg1.field1312 = (int) (Math.sin((double) field174 / 40.0D) * 256.0D) & 2047;
                if (this.field336) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field405[var8];
                        if (var15 >= 0 && !class7.field604[var15].method188(0)) {
                            return;
                        }
                    }
                    this.field336 = false;
                    class8[] var9 = new class8[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field405[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class7.field604[var14].method189(18390);
                        }
                    }
                    class8 var12 = new class8(var9, 3, var10);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field477[var13] != 0) {
                            var12.method210(field151[var13][0], field151[var13][this.field477[var13]]);
                            if (var13 == 1) {
                                var12.method210(field299[0], field299[this.field477[var13]]);
                            }
                        }
                    }
                    var12.method203(166);
                    var12.method204(257, class15.field837[field124.field1146].field839[0]);
                    var12.method213(64, 850, -30, -50, -30, true);
                    arg1.field1280 = 5;
                    arg1.field1281 = 0;
                    class44.method462(var12, 787, 5, 0);
                }
            } else if (var3 == 324) {
                if (this.field250 == null) {
                    this.field250 = arg1.field1292;
                    this.field251 = arg1.field1289;
                }
                if (this.field394) {
                    arg1.field1292 = this.field251;
                } else {
                    arg1.field1292 = this.field250;
                }
            } else if (var3 == 325) {
                if (this.field250 == null) {
                    this.field250 = arg1.field1292;
                    this.field251 = arg1.field1289;
                }
                if (this.field394) {
                    arg1.field1292 = this.field250;
                } else {
                    arg1.field1292 = this.field251;
                }
            } else if (var3 == 600) {
                arg1.field1285 = this.field231;
                if (field174 % 20 < 10) {
                    arg1.field1285 = arg1.field1285 + "|";
                } else {
                    arg1.field1285 = arg1.field1285 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field356 >= 1) {
                        if (this.field410) {
                            arg1.field1254 = 16711680;
                            arg1.field1285 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1254 = 16777215;
                            arg1.field1285 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1285 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field224 - this.field193;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg1.field1285 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field377 == 0) {
                        arg1.field1285 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field377 <= this.field224) {
                        arg1.field1285 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method93(this.field377, (byte) 6);
                    } else {
                        int var18 = this.field224 + 14 - this.field377;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg1.field1285 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method93(this.field377, (byte) 6) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field392 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field392 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field392 + " unread messages";
                    }
                    arg1.field1285 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field320 > 0 && this.field320 <= this.field224 + 10) {
                        arg1.field1285 = "Last password change:\\n@gre@" + this.method93(this.field320, (byte) 6);
                    } else {
                        arg1.field1285 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field373 > 2 && !field217) {
                        arg1.field1285 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field373 > 2) {
                        arg1.field1285 = "\\n\\nYou have @gre@" + this.field373 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field373 > 0) {
                        arg1.field1285 = "You have @gre@" + this.field373 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg1.field1285 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field373 > 2 && !field217) {
                        arg1.field1285 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field373 > 0) {
                        arg1.field1285 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg1.field1285 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field377 > this.field224) {
                        arg1.field1285 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg1.field1285 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field401 == 0) {
            arg1.field1285 = "Loading friend list";
            arg1.field1313 = 0;
        } else if (var3 == 1 && this.field401 == 1) {
            arg1.field1285 = "Connecting to friendserver";
            arg1.field1313 = 0;
        } else if (var3 == 2 && this.field401 != 2) {
            arg1.field1285 = "Please wait...";
            arg1.field1313 = 0;
        } else {
            int var4 = this.field400;
            if (this.field401 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field1285 = "";
                arg1.field1313 = 0;
            } else {
                arg1.field1285 = this.field239[var3];
                arg1.field1313 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
    public final String method93(int arg0, byte arg1) {
        if (arg0 > this.field224 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            if (arg1 != 6) {
                this.field375 = !this.field375;
            }
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public static final void method94(int arg0) {
        class48.field1338 = false;
        class6.field578 = false;
        if (arg0 == 0) {
            field218 = false;
            class16.field865 = false;
            class34.field1071 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSOKVSBIO;IBII)V")
    public final void method95(class51 arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (field124 != arg0) {
            if (this.field117 < 400) {
                String var6;
                if (arg0.field1430 == 0) {
                    var6 = arg0.field1423 + method16(arg0.field1408, field124.field1408, 869) + " (level-" + arg0.field1408 + ")";
                } else {
                    var6 = arg0.field1423 + " (skill-" + arg0.field1430 + ")";
                }
                if (this.field182 == 1) {
                    this.field447[this.field117] = "Use " + this.field186 + " with @whi@" + var6;
                    this.field256[this.field117] = 964;
                    this.field257[this.field117] = arg4;
                    this.field254[this.field117] = arg1;
                    this.field255[this.field117] = arg3;
                    ++this.field117;
                } else if (this.field187 == 1) {
                    if ((this.field189 & 8) == 8) {
                        this.field447[this.field117] = this.field190 + " @whi@" + var6;
                        this.field256[this.field117] = 114;
                        this.field257[this.field117] = arg4;
                        this.field254[this.field117] = arg1;
                        this.field255[this.field117] = arg3;
                        ++this.field117;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field389[var7] != null) {
                            this.field447[this.field117] = this.field389[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field389[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field1408 > field124.field1408) {
                                    var9 = 2000;
                                }
                                if (field124.field1424 != 0 && arg0.field1424 != 0) {
                                    if (field124.field1424 == arg0.field1424) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field390[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field256[this.field117] = var9 + 85;
                            }
                            if (var7 == 1) {
                                this.field256[this.field117] = var9 + 72;
                            }
                            if (var7 == 2) {
                                this.field256[this.field117] = var9 + 262;
                            }
                            if (var7 == 3) {
                                this.field256[this.field117] = var9 + 636;
                            }
                            if (var7 == 4) {
                                this.field256[this.field117] = var9 + 716;
                            }
                            this.field257[this.field117] = arg4;
                            this.field254[this.field117] = arg1;
                            this.field255[this.field117] = arg3;
                            ++this.field117;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field117; ++var8) {
                    if (this.field256[var8] == 158) {
                        this.field447[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg2 != -49) {
                    this.field200 = this.field546.method369();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
    public final int method96(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 256 - arg2;
        if (this.field195 != arg3) {
            this.field200 = -1;
        }
        return ((arg0 & 16711935) * var5 + (arg1 & 16711935) * arg2 & -16711936) + ((arg0 & 65280) * var5 + (arg1 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method97(int arg0) {
        if (this.field263 == 2) {
            this.method42(142, (this.field277 - this.field169 << 7) + this.field280, this.field278 * 2, (this.field276 - this.field168 << 7) + this.field279);
            if (arg0 <= 0) {
                this.field92.method359(108);
            }
            if (this.field180 > -1 && field174 % 20 < 10) {
                this.field357[0].method541(-4899, this.field180 - 12, this.field181 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LLBBVYYXO;BI)V")
    public final void method98(class32 arg0, byte arg1, int arg2) {
        if (arg1 != -121) {
            this.field92.method359(67);
        }
        if (arg2 == 193) {
            int var4 = arg0.method369();
            int var5 = (var4 >> 4 & 7) + this.field455;
            int var6 = (var4 & 7) + this.field456;
            int var7 = arg0.method371();
            int var8 = arg0.method371();
            int var9 = arg0.method371();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                class42 var10 = this.field235[this.field220][var5][var6];
                if (var10 != null) {
                    for (class52 var11 = (class52) var10.method449(); var11 != null; var11 = (class52) var10.method451(-582)) {
                        if ((var7 & 32767) == var11.field1433 && var11.field1434 == var8) {
                            var11.field1434 = var9;
                            break;
                        }
                    }
                    this.method118(var5, var6);
                }
            }
        } else if (arg2 == 209) {
            int var12 = arg0.method389(-13491);
            int var13 = (var12 >> 4 & 7) + this.field455;
            int var14 = (var12 & 7) + this.field456;
            int var15 = arg0.method397(this.field375);
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                class42 var16 = this.field235[this.field220][var13][var14];
                if (var16 != null) {
                    for (class52 var17 = (class52) var16.method449(); var17 != null; var17 = (class52) var16.method451(-582)) {
                        if ((var15 & 32767) == var17.field1433) {
                            var17.method464();
                            break;
                        }
                    }
                    if (var16.method449() == null) {
                        this.field235[this.field220][var13][var14] = null;
                    }
                    this.method118(var13, var14);
                }
            }
        } else if (arg2 == 98) {
            int var18 = arg0.method369();
            int var19 = (var18 >> 4 & 7) + this.field455;
            int var20 = (var18 & 7) + this.field456;
            int var21 = var19 + arg0.method370();
            int var22 = var20 + arg0.method370();
            int var23 = arg0.method372();
            int var24 = arg0.method371();
            int var25 = arg0.method369() * 4;
            int var26 = arg0.method369() * 4;
            int var27 = arg0.method371();
            int var28 = arg0.method371();
            int var29 = arg0.method369();
            int var30 = arg0.method369();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104 && var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && var24 != 65535) {
                int var31 = var19 * 128 + 64;
                int var32 = var20 * 128 + 64;
                int var33 = var21 * 128 + 64;
                int var34 = var22 * 128 + 64;
                class39 var35 = new class39(this.field220, var31, var26, var24, field174 + var27, (byte) 5, this.method147(var31, 0, this.field220, var32) - var25, var32, field174 + var28, var29, var23, var30);
                var35.method438(var34, var33, this.method147(var33, 0, this.field220, var34) - var26, false, field174 + var27);
                this.field319.method446(var35);
            }
        } else if (arg2 == 252) {
            int var36 = arg0.method387((byte) 104);
            int var37 = (var36 >> 4 & 7) + this.field455;
            int var38 = (var36 & 7) + this.field456;
            int var39 = arg0.method395((byte) 56);
            int var40 = arg0.method396(-30785);
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                class52 var41 = new class52();
                var41.field1433 = var39;
                var41.field1434 = var40;
                if (this.field235[this.field220][var37][var38] == null) {
                    this.field235[this.field220][var37][var38] = new class42(0);
                }
                this.field235[this.field220][var37][var38].method446(var41);
                this.method118(var37, var38);
            }
        } else if (arg2 == 253) {
            int var42 = arg0.method388(false);
            int var43 = var42 >> 2;
            int var44 = var42 & 3;
            int var45 = this.field321[var43];
            int var46 = arg0.method387((byte) 104);
            int var47 = (var46 >> 4 & 7) + this.field455;
            int var48 = (var46 & 7) + this.field456;
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                this.method75(var48, var47, var43, -1, -1, this.field220, 2, var44, 0, var45);
            }
        } else if (arg2 == 93) {
            int var49 = arg0.method395((byte) 56);
            int var50 = arg0.method388(false);
            int var51 = (var50 >> 4 & 7) + this.field455;
            int var52 = (var50 & 7) + this.field456;
            int var53 = arg0.method371();
            int var54 = arg0.method395((byte) 56);
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104 && this.field454 != var54) {
                class52 var55 = new class52();
                var55.field1433 = var49;
                var55.field1434 = var53;
                if (this.field235[this.field220][var51][var52] == null) {
                    this.field235[this.field220][var51][var52] = new class42(0);
                }
                this.field235[this.field220][var51][var52].method446(var55);
                this.method118(var51, var52);
            }
        } else if (arg2 == 31) {
            int var56 = arg0.method369();
            int var57 = (var56 >> 4 & 7) + this.field455;
            int var58 = (var56 & 7) + this.field456;
            int var59 = arg0.method397(this.field375);
            int var60 = arg0.method388(false);
            int var61 = var60 >> 2;
            int var62 = var60 & 3;
            int var63 = this.field321[var61];
            if (var57 >= 0 && var58 >= 0 && var57 < 103 && var58 < 103) {
                int var64 = this.field87[this.field220][var57][var58];
                int var65 = this.field87[this.field220][var57 + 1][var58];
                int var66 = this.field87[this.field220][var57 + 1][var58 + 1];
                int var67 = this.field87[this.field220][var57][var58 + 1];
                if (var63 == 0) {
                    class24 var68 = this.field176.method493(var58, (byte) 4, this.field220, var57);
                    if (var68 != null) {
                        int var69 = var68.field962 >> 14 & 32767;
                        if (var61 == 2) {
                            var68.field960 = new class11(var65, var59, var67, var62 + 4, var64, 2, false, var69, var66, false);
                            var68.field961 = new class11(var65, var59, var67, var62 + 1 & 3, var64, 2, false, var69, var66, false);
                        } else {
                            var68.field960 = new class11(var65, var59, var67, var62, var64, var61, false, var69, var66, false);
                        }
                    }
                }
                if (var63 == 1) {
                    class58 var70 = this.field176.method494(true, this.field220, var57, var58);
                    if (var70 != null) {
                        var70.field1483 = new class11(var65, var59, var67, 0, var64, 4, false, var70.field1484 >> 14 & 32767, var66, false);
                    }
                }
                if (var63 == 2) {
                    class66 var71 = this.field176.method495(-24183, var58, this.field220, var57);
                    if (var61 == 11) {
                        var61 = 10;
                    }
                    if (var71 != null) {
                        var71.field1610 = new class11(var65, var59, var67, var62, var64, var61, false, var71.field1618 >> 14 & 32767, var66, false);
                    }
                }
                if (var63 == 3) {
                    class43 var72 = this.field176.method496(this.field427, var57, var58, this.field220);
                    if (var72 != null) {
                        var72.field1236 = new class11(var65, var59, var67, var62, var64, 22, false, var72.field1237 >> 14 & 32767, var66, false);
                    }
                }
            }
        } else {
            if (arg2 == 206) {
                byte var73 = arg0.method390(false);
                int var74 = arg0.method388(false);
                int var75 = var74 >> 2;
                int var76 = var74 & 3;
                int var77 = this.field321[var75];
                int var78 = arg0.method371();
                byte var79 = arg0.method391((byte) 87);
                byte var80 = arg0.method391((byte) 87);
                int var81 = arg0.method395((byte) 56);
                int var82 = arg0.method371();
                byte var83 = arg0.method390(false);
                int var84 = arg0.method388(false);
                int var85 = (var84 >> 4 & 7) + this.field455;
                int var86 = (var84 & 7) + this.field456;
                int var87 = arg0.method371();
                class51 var88;
                if (this.field454 == var81) {
                    var88 = field124;
                } else {
                    var88 = this.field207[var81];
                }
                if (var88 != null) {
                    class34 var89 = class34.method409(var82);
                    int var90 = this.field87[this.field220][var85][var86];
                    int var91 = this.field87[this.field220][var85 + 1][var86];
                    int var92 = this.field87[this.field220][var85 + 1][var86 + 1];
                    int var93 = this.field87[this.field220][var85][var86 + 1];
                    class8 var94 = var89.method419(var75, var76, var90, var91, var92, var93, -1);
                    if (var94 != null) {
                        this.method75(var86, var85, 0, -1, var78 + 1, this.field220, 2, 0, var87 + 1, var77);
                        var88.field1419 = field174 + var87;
                        var88.field1420 = field174 + var78;
                        var88.field1414 = var94;
                        int var95 = var89.field1085;
                        int var96 = var89.field1106;
                        if (var76 == 1 || var76 == 3) {
                            var95 = var89.field1106;
                            var96 = var89.field1085;
                        }
                        var88.field1411 = var85 * 128 + var95 * 64;
                        var88.field1413 = var86 * 128 + var96 * 64;
                        var88.field1412 = this.method147(var88.field1411, 0, this.field220, var88.field1413);
                        if (var73 > var79) {
                            byte var97 = var73;
                            var73 = var79;
                            var79 = var97;
                        }
                        if (var80 > var83) {
                            byte var98 = var80;
                            var80 = var83;
                            var83 = var98;
                        }
                        var88.field1426 = var73 + var85;
                        var88.field1428 = var79 + var85;
                        var88.field1427 = var80 + var86;
                        var88.field1429 = var83 + var86;
                    }
                }
            }
            if (arg2 == 122) {
                int var99 = arg0.method389(-13491);
                int var100 = (var99 >> 4 & 7) + this.field455;
                int var101 = (var99 & 7) + this.field456;
                int var102 = arg0.method369();
                int var103 = var102 >> 2;
                int var104 = var102 & 3;
                int var105 = this.field321[var103];
                int var106 = arg0.method397(this.field375);
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    this.method75(var101, var100, var103, var106, -1, this.field220, 2, var104, 0, var105);
                }
            } else {
                if (arg2 == 46) {
                    int var107 = arg0.method369();
                    int var108 = (var107 >> 4 & 7) + this.field455;
                    int var109 = (var107 & 7) + this.field456;
                    int var110 = arg0.method371();
                    int var111 = arg0.method369();
                    int var112 = var111 >> 4 & 15;
                    int var113 = var111 & 7;
                    if (field124.field1132[0] >= var108 - var112 && field124.field1132[0] <= var108 + var112 && field124.field1133[0] >= var109 - var112 && field124.field1133[0] <= var109 + var112 && this.field393 && !field218 && this.field421 < 50) {
                        this.field313[this.field421] = var110;
                        this.field398[this.field421] = var113;
                        this.field437[this.field421] = class38.field1189[var110];
                        ++this.field421;
                    }
                }
                if (arg2 == 187) {
                    int var114 = arg0.method369();
                    int var115 = (var114 >> 4 & 7) + this.field455;
                    int var116 = (var114 & 7) + this.field456;
                    int var117 = arg0.method371();
                    int var118 = arg0.method369();
                    int var119 = arg0.method371();
                    if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                        int var120 = var115 * 128 + 64;
                        int var121 = var116 * 128 + 64;
                        class2 var122 = new class2(7, var120, var119, var121, this.field220, this.method147(var120, 0, this.field220, var121) - var118, var117, field174);
                        this.field363.method446(var122);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ZIILjava/lang/String;)LFUZJMGZB;")
    public final class19 method99(int arg0, String arg1, boolean arg2, int arg3, int arg4, String arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field337[0] != null) {
                var7 = this.field337[0].method420(arg4, (byte) 59);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field315.reset();
            this.field315.update(var7);
            int var9 = (int) this.field315.getValue();
            if (arg3 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class19(0, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method51(arg0, "Requesting " + arg1, -71);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method10(arg5 + arg3);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class32 var17 = new class32((byte) 114, var16);
                    var17.field1032 = 3;
                    int var18 = var17.method373() + 6;
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
                            this.method51(arg0, "Loading " + arg1 + " - " + var23 + "%", -71);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field337[0] != null) {
                            this.field337[0].method421(var7, arg4, true, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field337[0] = null;
                    }
                    if (var7 != null) {
                        this.field315.reset();
                        this.field315.update(var7);
                        int var24 = (int) this.field315.getValue();
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
                            this.method51(arg0, "Game updated - please reload page", -71);
                            var26 = 10;
                        } else {
                            this.method51(arg0, var12 + " - Retrying in " + var26, -71);
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
                    this.field506 = !this.field506;
                }
            }
            class19 var27 = new class19(0, var7);
            this.field318 &= arg2;
            return var27;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILPQPZKUPU;)Z")
    public final boolean method100(int arg0, class44 arg1) {
        if (arg0 != 46001) {
            this.field235 = null;
        }
        int var3 = arg1.field1243;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field447[this.field117] = "Remove @whi@" + arg1.field1285;
                this.field256[this.field117] = 831;
                ++this.field117;
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
            this.field447[this.field117] = "Remove @whi@" + this.field239[var3];
            this.field256[this.field117] = 760;
            ++this.field117;
            this.field447[this.field117] = "Message @whi@" + this.field239[var3];
            this.field256[this.field117] = 678;
            ++this.field117;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)Z")
    public final boolean method101(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 14 & 32767;
        this.field318 &= arg0;
        int var6 = this.field176.method501(this.field220, arg1, arg3, arg2);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            ++field489;
            if (field489 > 76) {
                field489 = 0;
                this.field92.method358(7793, 97);
            }
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method76(field124.field1132[0], this.field57, var8, 0, var7 + 1, 0, 2, arg3, false, field124.field1133[0], 0, arg1);
            } else {
                class34 var9 = class34.method409(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1106;
                    var11 = var9.field1085;
                } else {
                    var10 = var9.field1085;
                    var11 = var9.field1106;
                }
                int var12 = var9.field1107;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method76(field124.field1132[0], this.field57, 0, var11, 0, var12, 2, arg3, false, field124.field1133[0], var10, arg1);
            }
            this.field83 = super.field810;
            this.field84 = super.field811;
            this.field86 = 2;
            this.field85 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BJ)V")
    public final void method102(byte arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field400; ++var4) {
                if (this.field457[var4] == arg1) {
                    --this.field400;
                    this.field554 = true;
                    for (int var5 = var4; var5 < this.field400; ++var5) {
                        this.field239[var5] = this.field239[var5 + 1];
                        this.field154[var5] = this.field154[var5 + 1];
                        this.field457[var5] = this.field457[var5 + 1];
                    }
                    this.field92.method358(7793, 25);
                    this.field92.method365(arg1, (byte) 56);
                    break;
                }
            }
            if (arg0 != 117) {
                this.field92.method359(202);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method103(byte arg0) {
        if (arg0 != -41) {
            this.method113();
        }
        int var2 = 5;
        this.field396[8] = 0;
        int var3 = 0;
        while (this.field396[8] == 0) {
            String var4 = "Unknown problem";
            this.method51(20, "Connecting to web server", -71);
            try {
                DataInputStream var5 = this.method10("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 356);
                class32 var6 = new class32((byte) 114, new byte[40]);
                var5.readFully(var6.field1031, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field396[var7] = var6.method374();
                }
                int var8 = var6.method374();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field396[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field396[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field396[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field396[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field396[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field396[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method51(10, "Game updated - please reload page", -71);
                        var11 = 10;
                    } else {
                        this.method51(10, var4 + " - Will retry in " + var11 + " secs.", -71);
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
                this.field506 = !this.field506;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field798 != null) {
                    return new URL("http://127.0.0.1:" + (field216 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LZQSBFHWZ;I)V")
    public final void method104(class69 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field267.length; ++var4) {
            this.field267[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field267[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field268[var16] = (this.field267[var16 - 1] + this.field267[var16 + 1] + this.field267[var16 - 128] + this.field267[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field267;
            this.field267 = this.field268;
            this.field268 = var14;
        }
        if (arg1 < 0 || arg1 > 0) {
            this.field200 = -1;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1688; ++var8) {
                for (int var9 = 0; var9 < arg0.field1687; ++var9) {
                    if (arg0.field1685[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1689;
                        int var11 = var8 + 16 + arg0.field1690;
                        int var12 = (var11 << 7) + var10;
                        this.field267[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method105(int arg0) {
        if (arg0 >= 0) {
            this.field235 = null;
        }
        this.field464.method298(0);
        if (this.field524 == 2) {
            byte[] var2 = this.field412.field1685;
            int[] var3 = class21.field931;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field196.method545(this.field59, false, 25, 33, 256, this.field374, 0, this.field152, 33, 25, 0);
            this.field465.method298(0);
            class6.field589 = this.field518;
        } else {
            int var6 = this.field59 + this.field470 & 2047;
            int var7 = field124.field1134 / 32 + 48;
            int var8 = 464 - field124.field1135 / 32;
            this.field223.method545(var6, false, var8, 151, this.field529 + 256, this.field527, 5, this.field125, 146, var7, 25);
            this.field196.method545(this.field59, false, 25, 33, 256, this.field374, 0, this.field152, 33, 25, 0);
            for (int var9 = 0; var9 < this.field537; ++var9) {
                int var39 = this.field538[var9] * 4 + 2 - field124.field1134 / 32;
                int var40 = this.field539[var9] * 4 + 2 - field124.field1135 / 32;
                this.method129(var39, this.field129, var40, this.field467[var9]);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class42 var36 = this.field235[this.field220][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field124.field1134 / 32;
                        int var38 = var35 * 4 + 2 - field124.field1135 / 32;
                        this.method129(var37, this.field129, var38, this.field415);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field341; ++var11) {
                class49 var31 = this.field340[this.field342[var11]];
                if (var31 != null && var31.method429(21781)) {
                    class64 var32 = var31.field1402;
                    if (var32.field1587 != null) {
                        var32 = var32.method572(7);
                    }
                    if (var32 != null && var32.field1589 && var32.field1579) {
                        int var33 = var31.field1134 / 32 - field124.field1134 / 32;
                        int var34 = var31.field1135 / 32 - field124.field1135 / 32;
                        this.method129(var33, this.field129, var34, this.field416);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field208; ++var12) {
                class51 var23 = this.field207[this.field209[var12]];
                if (var23 != null && var23.method429(21781)) {
                    int var24 = var23.field1134 / 32 - field124.field1134 / 32;
                    int var25 = var23.field1135 / 32 - field124.field1135 / 32;
                    boolean var26 = false;
                    long var27 = class40.method440(var23.field1423);
                    for (int var29 = 0; var29 < this.field400; ++var29) {
                        if (this.field457[var29] == var27 && this.field154[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field124.field1424 != 0 && var23.field1424 != 0 && field124.field1424 == var23.field1424) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method129(var24, this.field129, var25, this.field418);
                    } else if (var30) {
                        this.method129(var24, this.field129, var25, this.field419);
                    } else {
                        this.method129(var24, this.field129, var25, this.field417);
                    }
                }
            }
            if (this.field263 != 0 && field174 % 20 < 10) {
                if (this.field263 == 1 && this.field226 >= 0 && this.field226 < this.field340.length) {
                    class49 var13 = this.field340[this.field226];
                    if (var13 != null) {
                        int var14 = var13.field1134 / 32 - field124.field1134 / 32;
                        int var15 = var13.field1135 / 32 - field124.field1135 / 32;
                        this.method117(var14, -60, var15, this.field365);
                    }
                }
                if (this.field263 == 2) {
                    int var16 = (this.field276 - this.field168) * 4 + 2 - field124.field1134 / 32;
                    int var17 = (this.field277 - this.field169) * 4 + 2 - field124.field1135 / 32;
                    this.method117(var16, -60, var17, this.field365);
                }
                if (this.field263 == 10 && this.field126 >= 0 && this.field126 < this.field207.length) {
                    class51 var18 = this.field207[this.field126];
                    if (var18 != null) {
                        int var19 = var18.field1134 / 32 - field124.field1134 / 32;
                        int var20 = var18.field1135 / 32 - field124.field1135 / 32;
                        this.method117(var19, -60, var20, this.field365);
                    }
                }
            }
            if (this.field221 != 0) {
                int var21 = this.field221 * 4 + 2 - field124.field1134 / 32;
                int var22 = this.field222 * 4 + 2 - field124.field1135 / 32;
                this.method129(var21, this.field129, var22, this.field364);
            }
            class21.method289(3, 2, 97, 16777215, 78, 3);
            this.field465.method298(0);
            class6.field589 = this.field518;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method106(byte arg0) {
        signlink.midiplay = false;
        if (arg0 != -65) {
            this.field92.method359(118);
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LLBBVYYXO;II)V")
    private final void method107(class32 arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field210; ++var4) {
            int var5 = this.field211[var4];
            class51 var6 = this.field207[var5];
            int var7 = arg0.method369();
            if ((var7 & 2) != 0) {
                var7 += arg0.method369() << 8;
            }
            this.method116(-37382, var5, var6, var7, arg0);
        }
        if (this.field147 == arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    private final void method108(int arg0) {
        class18 var2 = (class18) this.field75.method449();
        if (arg0 < 4 || arg0 > 4) {
            this.field89 = !this.field89;
        }
        while (var2 != null) {
            if (var2.field893 == -1) {
                var2.field904 = 0;
                this.method137(var2, this.field462);
            } else {
                var2.method464();
            }
            var2 = (class18) this.field75.method451(-582);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method109(int arg0, long arg1) {
        if (arg0 < 5 || arg0 > 5) {
            this.field92.method359(205);
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field237; ++var4) {
                if (this.field370[var4] == arg1) {
                    --this.field237;
                    this.field554 = true;
                    for (int var5 = var4; var5 < this.field237; ++var5) {
                        this.field370[var5] = this.field370[var5 + 1];
                    }
                    this.field92.method358(7793, 246);
                    this.field92.method365(arg1, (byte) 56);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method110(int arg0) {
        short var2 = 256;
        if (arg0 >= 0) {
            this.field200 = this.field546.method369();
        }
        if (this.field514 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field514 > 768) {
                    this.field133[var3] = this.method96(this.field134[var3], this.field135[var3], 1024 - this.field514, this.field195);
                } else if (this.field514 > 256) {
                    this.field133[var3] = this.field135[var3];
                } else {
                    this.field133[var3] = this.method96(this.field135[var3], this.field134[var3], 256 - this.field514, this.field195);
                }
            }
        } else if (this.field515 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field515 > 768) {
                    this.field133[var4] = this.method96(this.field134[var4], this.field136[var4], 1024 - this.field515, this.field195);
                } else if (this.field515 > 256) {
                    this.field133[var4] = this.field136[var4];
                } else {
                    this.field133[var4] = this.method96(this.field136[var4], this.field134[var4], 256 - this.field515, this.field195);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field133[var5] = this.field134[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field244.field965[var6] = this.field490.field1492[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field371[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field316[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field133[var26];
                    int var30 = this.field244.field965[var8];
                    this.field244.field965[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field244.method299(super.field795, 0, 0, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field245.field965[var10] = this.field491.field1492[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field371[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field316[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field133[var18];
                    int var22 = this.field245.field965[var16];
                    this.field245.field965[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field245.method299(super.field795, 637, 0, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
    public final void method111(int arg0, int arg1, boolean arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field346[var5] != null) {
                int var6 = this.field344[var5];
                int var7 = 70 - var4 * 14 + this.field358 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field345[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field234 == 0 || this.field234 == 1 && this.method12(var8, (byte) 9))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field124.field1423)) {
                        if (this.field356 >= 1) {
                            this.field447[this.field117] = "Report abuse @whi@" + var8;
                            this.field256[this.field117] = 564;
                            ++this.field117;
                        }
                        this.field447[this.field117] = "Add ignore @whi@" + var8;
                        this.field256[this.field117] = 502;
                        ++this.field117;
                        this.field447[this.field117] = "Add friend @whi@" + var8;
                        this.field256[this.field117] = 308;
                        ++this.field117;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field81 == 0 && (var6 == 7 || this.field88 == 0 || this.field88 == 1 && this.method12(var8, (byte) 9))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field356 >= 1) {
                            this.field447[this.field117] = "Report abuse @whi@" + var8;
                            this.field256[this.field117] = 564;
                            ++this.field117;
                        }
                        this.field447[this.field117] = "Add ignore @whi@" + var8;
                        this.field256[this.field117] = 502;
                        ++this.field117;
                        this.field447[this.field117] = "Add friend @whi@" + var8;
                        this.field256[this.field117] = 308;
                        ++this.field117;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field76 == 0 || this.field76 == 1 && this.method12(var8, (byte) 9))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field447[this.field117] = "Accept trade @whi@" + var8;
                        this.field256[this.field117] = 455;
                        ++this.field117;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field81 == 0 && this.field88 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field76 == 0 || this.field76 == 1 && this.method12(var8, (byte) 9))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field447[this.field117] = "Accept challenge @whi@" + var8;
                        this.field256[this.field117] = 899;
                        ++this.field117;
                    }
                    ++var4;
                }
            }
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= 0) {
            this.field173 = !this.field173;
        }
        if (arg7 >= 1 && arg0 >= 1 && arg7 <= 102 && arg0 <= 102) {
            if (field218 && this.field220 != arg5) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg2 == 0) {
                var9 = this.field176.method497(arg5, arg7, arg0);
            }
            if (arg2 == 1) {
                var9 = this.field176.method498(arg5, arg7, -38326, arg0);
            }
            if (arg2 == 2) {
                var9 = this.field176.method499(arg5, arg7, arg0);
            }
            if (arg2 == 3) {
                var9 = this.field176.method500(arg5, arg7, arg0);
            }
            if (var9 != 0) {
                int var13 = this.field176.method501(arg5, arg7, arg0, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg2 == 0) {
                    this.field176.method488(arg5, arg7, arg0, true);
                    class34 var17 = class34.method409(var14);
                    if (var17.field1064) {
                        this.field520[arg5].method162(var17.field1077, arg0, false, var16, arg7, var15);
                    }
                }
                if (arg2 == 1) {
                    this.field176.method489(arg5, arg0, (byte) 83, arg7);
                }
                if (arg2 == 2) {
                    this.field176.method490(arg5, true, arg0, arg7);
                    class34 var18 = class34.method409(var14);
                    if (var18.field1085 + arg7 > 103 || var18.field1085 + arg0 > 103 || var18.field1106 + arg7 > 103 || var18.field1106 + arg0 > 103) {
                        return;
                    }
                    if (var18.field1064) {
                        this.field520[arg5].method163(arg0, var18.field1077, var16, arg7, field322, var18.field1085, var18.field1106);
                    }
                }
                if (arg2 == 3) {
                    this.field176.method491(arg7, true, arg5, arg0);
                    class34 var19 = class34.method409(var14);
                    if (var19.field1064 && var19.field1078) {
                        this.field520[arg5].method165(arg0, -217, arg7);
                    }
                }
            }
            if (arg3 >= 0) {
                int var20 = arg5;
                if (arg5 < 3 && (this.field156[1][arg7][arg0] & 2) == 2) {
                    var20 = arg5 + 1;
                }
                class16.method257(arg4, this.field87, true, arg5, var20, arg1, this.field520[arg5], arg0, arg3, this.field176, arg7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method113() {
        this.method51(20, "Starting up", -71);
        if (signlink.sunjava) {
            super.field789 = 5;
        }
        if (field448) {
            this.field197 = true;
        } else {
            field448 = true;
            boolean var1 = false;
            String var2 = this.method57((byte) -22);
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
                this.field297 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field337[var3] = new class35(signlink.cache_dat, 500000, signlink.cache_idx[var3], (byte) -101, var3 + 1);
                    }
                }
                try {
                    this.method103((byte) -41);
                    this.field500 = this.method99(25, "title screen", true, this.field396[1], 1, "title");
                    this.field473 = new class71(false, "p11_full", this.field500, -916);
                    this.field474 = new class71(false, "p12_full", this.field500, -916);
                    this.field475 = new class71(false, "b12_full", this.field500, -916);
                    this.field476 = new class71(true, "q8_full", this.field500, -916);
                    this.method68(-480);
                    this.method13((byte) 38);
                    class19 var4 = this.method99(30, "config", true, this.field396[2], 2, "config");
                    class19 var5 = this.method99(35, "interface", true, this.field396[3], 3, "interface");
                    class19 var6 = this.method99(40, "2d graphics", true, this.field396[4], 4, "media");
                    class19 var7 = this.method99(45, "textures", true, this.field396[6], 6, "textures");
                    class19 var8 = this.method99(50, "chat system", true, this.field396[7], 7, "wordenc");
                    class19 var9 = this.method99(55, "sound effects", true, this.field396[8], 8, "sounds");
                    this.field156 = new byte[4][104][104];
                    this.field87 = new int[4][105][105];
                    this.field176 = new class48(104, this.field87, 104, field502, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field520[var10] = new class5(false, 104, 104);
                    }
                    this.field223 = new class59(512, 512);
                    class19 var11 = this.method99(60, "update list", true, this.field396[5], 5, "versionlist");
                    this.method51(60, "Connecting to update server", -71);
                    this.field82 = new class12();
                    this.field82.method224(var11, this);
                    class46.method465(this.field82.method245((byte) 7));
                    class8.method193(this.field82.method235(0, false), this.field82);
                    if (!field218) {
                        this.field531 = 0;
                        this.field532 = true;
                        this.field82.method240(2, this.field531);
                        while (this.field82.method239() > 0) {
                            this.method33(44393);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field82.field751 > 3) {
                                this.method146("ondemand");
                                return;
                            }
                        }
                    }
                    this.method51(65, "Requesting animations", -71);
                    int var12 = this.field82.method235(1, false);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field82.method240(1, var13);
                    }
                    while (this.field82.method239() > 0) {
                        int var14 = var12 - this.field82.method239();
                        if (var14 > 0) {
                            this.method51(65, "Loading animations - " + var14 * 100 / var12 + "%", -71);
                        }
                        this.method33(44393);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field82.field751 > 3) {
                            this.method146("ondemand");
                            return;
                        }
                    }
                    this.method51(70, "Requesting models", -71);
                    int var15 = this.field82.method235(0, false);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field82.method229(field130, var16);
                        if ((var17 & 1) != 0) {
                            this.field82.method240(0, var16);
                        }
                    }
                    int var18 = this.field82.method239();
                    while (this.field82.method239() > 0) {
                        int var19 = var18 - this.field82.method239();
                        if (var19 > 0) {
                            this.method51(70, "Loading models - " + var19 * 100 / var18 + "%", -71);
                        }
                        this.method33(44393);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field337[0] != null) {
                        this.method51(75, "Requesting maps", -71);
                        this.field82.method240(3, this.field82.method236(48, 0, 0, 47));
                        this.field82.method240(3, this.field82.method236(48, 1, 0, 47));
                        this.field82.method240(3, this.field82.method236(48, 0, 0, 48));
                        this.field82.method240(3, this.field82.method236(48, 1, 0, 48));
                        this.field82.method240(3, this.field82.method236(48, 0, 0, 49));
                        this.field82.method240(3, this.field82.method236(48, 1, 0, 49));
                        this.field82.method240(3, this.field82.method236(47, 0, 0, 47));
                        this.field82.method240(3, this.field82.method236(47, 1, 0, 47));
                        this.field82.method240(3, this.field82.method236(47, 0, 0, 48));
                        this.field82.method240(3, this.field82.method236(47, 1, 0, 48));
                        this.field82.method240(3, this.field82.method236(148, 0, 0, 48));
                        this.field82.method240(3, this.field82.method236(148, 1, 0, 48));
                        int var20 = this.field82.method239();
                        while (this.field82.method239() > 0) {
                            int var21 = var20 - this.field82.method239();
                            if (var21 > 0) {
                                this.method51(75, "Loading maps - " + var21 * 100 / var20 + "%", -71);
                            }
                            this.method33(44393);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field82.method235(0, false);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field82.method229(field130, var23);
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
                            this.field82.method238(var25, var23, 0, false);
                        }
                    }
                    this.field82.method225((byte) 3, field217);
                    if (!field218) {
                        int var26 = this.field82.method235(2, false);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field82.method233(var27, (byte) 113)) {
                                this.field82.method238((byte) 1, var27, 2, false);
                            }
                        }
                    }
                    this.method51(80, "Unpacking media", -71);
                    this.field411 = new class69(var6, "invback", 0);
                    this.field413 = new class69(var6, "chatback", 0);
                    this.field412 = new class69(var6, "mapback", 0);
                    this.field271 = new class69(var6, "backbase1", 0);
                    this.field272 = new class69(var6, "backbase2", 0);
                    this.field273 = new class69(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field380[var28] = new class69(var6, "sideicons", var28);
                    }
                    this.field196 = new class59(var6, "compass", 0);
                    this.field382 = new class59(var6, "mapedge", 0);
                    this.field382.method538(-668);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field379[var29] = new class69(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field155[var30] = new class59(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field545[var31] = new class59(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field90[var32] = new class59(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field240[var33] = new class59(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field357[var34] = new class59(var6, "headicons_hint", var34);
                    }
                    this.field266 = new class59(var6, "overlay_multiway", 0);
                    this.field364 = new class59(var6, "mapmarker", 0);
                    this.field365 = new class59(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field309[var35] = new class59(var6, "cross", var35);
                    }
                    this.field415 = new class59(var6, "mapdots", 0);
                    this.field416 = new class59(var6, "mapdots", 1);
                    this.field417 = new class59(var6, "mapdots", 2);
                    this.field418 = new class59(var6, "mapdots", 3);
                    this.field419 = new class59(var6, "mapdots", 4);
                    this.field118 = new class69(var6, "scrollbar", 0);
                    this.field119 = new class69(var6, "scrollbar", 1);
                    this.field480 = new class69(var6, "redstone1", 0);
                    this.field481 = new class69(var6, "redstone2", 0);
                    this.field482 = new class69(var6, "redstone3", 0);
                    this.field483 = new class69(var6, "redstone1", 0);
                    this.field483.method583((byte) 8);
                    this.field484 = new class69(var6, "redstone2", 0);
                    this.field484.method583((byte) 8);
                    this.field95 = new class69(var6, "redstone1", 0);
                    this.field95.method584(33964);
                    this.field96 = new class69(var6, "redstone2", 0);
                    this.field96.method584(33964);
                    this.field97 = new class69(var6, "redstone3", 0);
                    this.field97.method584(33964);
                    this.field98 = new class69(var6, "redstone1", 0);
                    this.field98.method583((byte) 8);
                    this.field98.method584(33964);
                    this.field99 = new class69(var6, "redstone2", 0);
                    this.field99.method583((byte) 8);
                    this.field99.method584(33964);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field354[var36] = new class69(var6, "mod_icons", var36);
                    }
                    class59 var37 = new class59(var6, "backleft1", 0);
                    this.field428 = new class25(var37.field1494, var37.field1493, this.method65(true), field383);
                    var37.method539(143, 0, 0);
                    class59 var38 = new class59(var6, "backleft2", 0);
                    this.field429 = new class25(var38.field1494, var38.field1493, this.method65(true), field383);
                    var38.method539(143, 0, 0);
                    class59 var39 = new class59(var6, "backright1", 0);
                    this.field430 = new class25(var39.field1494, var39.field1493, this.method65(true), field383);
                    var39.method539(143, 0, 0);
                    class59 var40 = new class59(var6, "backright2", 0);
                    this.field431 = new class25(var40.field1494, var40.field1493, this.method65(true), field383);
                    var40.method539(143, 0, 0);
                    class59 var41 = new class59(var6, "backtop1", 0);
                    this.field432 = new class25(var41.field1494, var41.field1493, this.method65(true), field383);
                    var41.method539(143, 0, 0);
                    class59 var42 = new class59(var6, "backvmid1", 0);
                    this.field433 = new class25(var42.field1494, var42.field1493, this.method65(true), field383);
                    var42.method539(143, 0, 0);
                    class59 var43 = new class59(var6, "backvmid2", 0);
                    this.field434 = new class25(var43.field1494, var43.field1493, this.method65(true), field383);
                    var43.method539(143, 0, 0);
                    class59 var44 = new class59(var6, "backvmid3", 0);
                    this.field435 = new class25(var44.field1494, var44.field1493, this.method65(true), field383);
                    var44.method539(143, 0, 0);
                    class59 var45 = new class59(var6, "backhmid2", 0);
                    this.field436 = new class25(var45.field1494, var45.field1493, this.method65(true), field383);
                    var45.method539(143, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field155[var50] != null) {
                            this.field155[var50].method537(var47 + var49, (byte) 1, var46 + var49, var48 + var49);
                        }
                        if (this.field379[var50] != null) {
                            this.field379[var50].method585(var47 + var49, (byte) 1, var46 + var49, var48 + var49);
                        }
                    }
                    this.method51(83, "Unpacking textures", -71);
                    class6.method174(var7, (byte) -105);
                    class6.method178(-157, 0.8D);
                    class6.method173((byte) 2, 20);
                    this.method51(86, "Unpacking config", -71);
                    class15.method251(var4, 5);
                    class34.method411(var4);
                    class3.method3(var4, 5);
                    class60.method555(var4);
                    class64.method576(var4);
                    class7.method186(var4, 5);
                    class4.method7(var4, 5);
                    class33.method407(var4, 5);
                    class23.method296(var4, 5);
                    class60.field1500 = field217;
                    if (!field218) {
                        this.method51(90, "Unpacking sounds", -71);
                        byte[] var51 = var9.method277("sounds.dat", (byte[]) null);
                        class32 var52 = new class32((byte) 114, var51);
                        class38.method432(var52, 5);
                    }
                    this.method51(95, "Unpacking interfaces", -71);
                    class71[] var53 = new class71[] { this.field473, this.field474, this.field475, this.field476 };
                    class44.method455(true, var5, var6, var53);
                    this.method51(100, "Preparing game engine", -71);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field412.field1685[this.field412.field1687 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field374[var54] = var55;
                        this.field152[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field412.field1685[this.field412.field1687 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field527[var58 - 5] = var59 - 25;
                        this.field125[var58 - 5] = var60 - var59;
                    }
                    class6.method171((byte) 27, 503, 765);
                    this.field519 = class6.field589;
                    class6.method171((byte) 27, 96, 479);
                    this.field516 = class6.field589;
                    class6.method171((byte) 27, 261, 190);
                    this.field517 = class6.field589;
                    class6.method171((byte) 27, 334, 512);
                    this.field518 = class6.field589;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class6.field587[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class48.method507(var62, 800, 512, 334, 500, -234);
                    class26.method301(var8);
                    this.field439 = new class17((byte) -60, this);
                    this.method58(this.field439, 10);
                    class11.field720 = this;
                    class34.field1103 = this;
                    class64.field1588 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field300 + " " + this.field77);
                    this.field167 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z")
    public final boolean method114(boolean arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field256[arg1];
            if (arg0) {
                this.field92.method359(172);
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 308;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LPQPZKUPU;I)Z")
    public final boolean method115(class44 arg0, int arg1) {
        if (arg0.field1268 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1268.length; ++var3) {
                int var4 = this.method85(var3, (byte) 0, arg0);
                int var5 = arg0.field1248[var3];
                if (arg0.field1268[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1268[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1268[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 != 0) {
                this.field425 = !this.field425;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILSOKVSBIO;ILLBBVYYXO;)V")
    private final void method116(int arg0, int arg1, class51 arg2, int arg3, class32 arg4) {
        if (arg0 != -37382) {
            this.field355 = this.field232.method424();
        }
        if ((arg3 & 64) != 0) {
            arg2.field1165 = arg4.method395((byte) 56);
            if (arg2.field1165 == 65535) {
                arg2.field1165 = -1;
            }
        }
        if ((arg3 & 128) != 0) {
            int var6 = arg4.method388(false);
            byte[] var7 = new byte[var6];
            class32 var8 = new class32((byte) 114, var7);
            arg4.method406(var6, 0, var7, false);
            this.field212[arg1] = var8;
            arg2.method526(var8, this.field472);
        }
        if ((arg3 & 256) != 0) {
            arg2.field1126 = arg4.method371();
            int var9 = arg4.method374();
            arg2.field1130 = var9 >> 16;
            arg2.field1129 = (var9 & 65535) + field174;
            arg2.field1127 = 0;
            arg2.field1128 = 0;
            if (arg2.field1129 > field174) {
                arg2.field1127 = -1;
            }
            if (arg2.field1126 == 65535) {
                arg2.field1126 = -1;
            }
        }
        if ((arg3 & 1024) != 0) {
            arg2.field1166 = arg4.method389(-13491);
            arg2.field1168 = arg4.method369();
            arg2.field1167 = arg4.method369();
            arg2.field1169 = arg4.method369();
            arg2.field1170 = arg4.method371() + field174;
            arg2.field1171 = arg4.method396(-30785) + field174;
            arg2.field1172 = arg4.method388(false);
            arg2.method427(this.field236);
        }
        if ((arg3 & 32) != 0) {
            int var10 = arg4.method369();
            int var11 = arg4.method369();
            arg2.method431(var10, field174, true, var11);
            arg2.field1178 = field174 + 300;
            arg2.field1179 = arg4.method389(-13491);
            arg2.field1180 = arg4.method389(-13491);
        }
        if ((arg3 & 8) != 0) {
            int var12 = arg4.method395((byte) 56);
            int var13 = arg4.method388(false);
            int var14 = arg4.method389(-13491);
            int var15 = arg4.field1032;
            if (arg2.field1423 != null && arg2.field1406) {
                long var16 = class40.method440(arg2.field1423);
                boolean var18 = false;
                if (var13 <= 1) {
                    for (int var19 = 0; var19 < this.field237; ++var19) {
                        if (this.field370[var19] == var16) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && this.field132 == 0) {
                    try {
                        this.field339.field1032 = 0;
                        arg4.method406(var14, 0, this.field339.field1031, false);
                        this.field339.field1032 = 0;
                        String var20 = class50.method523(this.field339, 555, var14);
                        String var21 = class26.method311(var20, 0);
                        arg2.field1164 = var21;
                        arg2.field1155 = var12 >> 8;
                        arg2.field1131 = var12 & 255;
                        arg2.field1150 = 150;
                        if (var13 != 2 && var13 != 3) {
                            if (var13 == 1) {
                                this.method67(var21, "@cr1@" + arg2.field1423, 1, -39349);
                            } else {
                                this.method67(var21, arg2.field1423, 2, -39349);
                            }
                        } else {
                            this.method67(var21, "@cr2@" + arg2.field1423, 1, -39349);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field1032 = var14 + var15;
        }
        if ((arg3 & 4) != 0) {
            arg2.field1164 = arg4.method376();
            if (arg2.field1164.charAt(0) == '~') {
                arg2.field1164 = arg2.field1164.substring(1);
                this.method67(arg2.field1164, arg2.field1423, 2, -39349);
            } else if (field124 == arg2) {
                this.method67(arg2.field1164, arg2.field1423, 2, -39349);
            }
            arg2.field1155 = 0;
            arg2.field1131 = 0;
            arg2.field1150 = 150;
        }
        if ((arg3 & 512) != 0) {
            int var23 = arg4.method369();
            int var24 = arg4.method369();
            arg2.method431(var23, field174, true, var24);
            arg2.field1178 = field174 + 300;
            arg2.field1179 = arg4.method369();
            arg2.field1180 = arg4.method388(false);
        }
        if ((arg3 & 1) != 0) {
            int var25 = arg4.method395((byte) 56);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = arg4.method388(false);
            if (arg2.field1173 == var25 && var25 != -1) {
                int var27 = class15.field837[var25].field851;
                if (var27 == 1) {
                    arg2.field1174 = 0;
                    arg2.field1175 = 0;
                    arg2.field1176 = var26;
                    arg2.field1177 = 0;
                }
                if (var27 == 2) {
                    arg2.field1177 = 0;
                }
            } else if (var25 == -1 || arg2.field1173 == -1 || class15.field837[var25].field845 >= class15.field837[arg2.field1173].field845) {
                arg2.field1173 = var25;
                arg2.field1174 = 0;
                arg2.field1175 = 0;
                arg2.field1176 = var26;
                arg2.field1177 = 0;
                arg2.field1137 = arg2.field1156;
            }
        }
        if ((arg3 & 16) != 0) {
            arg2.field1152 = arg4.method397(this.field375);
            arg2.field1153 = arg4.method395((byte) 56);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILVZJVQLEE;)V")
    public final void method117(int arg0, int arg1, int arg2, class59 arg3) {
        if (arg1 < 0) {
            int var5 = arg0 * arg0 + arg2 * arg2;
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field59 + this.field470 & 2047;
                int var7 = class8.field682[var6];
                int var8 = class8.field683[var6];
                int var9 = var7 * 256 / (this.field529 + 256);
                int var10 = var8 * 256 / (this.field529 + 256);
                int var11 = arg0 * var10 + arg2 * var9 >> 16;
                int var12 = arg2 * var10 - arg0 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field382.method546(15, 20, 15, 20, var13, 460, 256, 83 - var16 - 20, var15 + 94 + 4 - 10);
            } else {
                this.method129(arg0, this.field129, arg2, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method118(int arg0, int arg1) {
        class42 var3 = this.field235[this.field220][arg0][arg1];
        if (var3 == null) {
            this.field176.method492(this.field220, arg0, arg1);
        } else {
            int var4 = -99999999;
            class52 var5 = null;
            for (class52 var6 = (class52) var3.method449(); var6 != null; var6 = (class52) var3.method451(-582)) {
                class60 var11 = class60.method554(var6.field1433);
                int var12 = var11.field1511;
                if (var11.field1542) {
                    var12 = (var6.field1434 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method447(13081, var5);
            class52 var7 = null;
            class52 var8 = null;
            for (class52 var9 = (class52) var3.method449(); var9 != null; var9 = (class52) var3.method451(-582)) {
                if (var5.field1433 != var9.field1433 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1433 != var9.field1433 && var7.field1433 != var9.field1433 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field176.method478(this.field220, var5, 932, arg1, var8, var7, this.method147(arg0 * 128 + 64, 0, this.field220, arg1 * 128 + 64), var10, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLLBBVYYXO;)V")
    private final void method119(int arg0, byte arg1, class32 arg2) {
        arg2.method379(-604);
        if (this.field343 != arg1) {
            this.field235 = null;
        }
        int var4 = arg2.method380(1, (byte) -50);
        if (var4 != 0) {
            int var5 = arg2.method380(2, (byte) -50);
            if (var5 == 0) {
                this.field211[this.field210++] = this.field206;
            } else if (var5 == 1) {
                int var6 = arg2.method380(3, (byte) -50);
                field124.method428(var6, false, true);
                int var7 = arg2.method380(1, (byte) -50);
                if (var7 == 1) {
                    this.field211[this.field210++] = this.field206;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method380(3, (byte) -50);
                field124.method428(var8, true, true);
                int var9 = arg2.method380(3, (byte) -50);
                field124.method428(var9, true, true);
                int var10 = arg2.method380(1, (byte) -50);
                if (var10 == 1) {
                    this.field211[this.field210++] = this.field206;
                }
            } else if (var5 == 3) {
                this.field220 = arg2.method380(2, (byte) -50);
                int var11 = arg2.method380(7, (byte) -50);
                int var12 = arg2.method380(1, (byte) -50);
                int var13 = arg2.method380(1, (byte) -50);
                if (var13 == 1) {
                    this.field211[this.field210++] = this.field206;
                }
                int var14 = arg2.method380(7, (byte) -50);
                field124.method430(var14, var11, this.field348, var12 == 1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(LLBBVYYXO;II)V")
    private final void method120(class32 arg0, int arg1, int arg2) {
        if (arg2 < 3 || arg2 > 3) {
            this.field488 = !this.field488;
        }
        for (int var4 = 0; var4 < this.field210; ++var4) {
            int var5 = this.field211[var4];
            class49 var6 = this.field340[var5];
            int var7 = arg0.method369();
            if ((var7 & 16) != 0) {
                var6.field1152 = arg0.method395((byte) 56);
                var6.field1153 = arg0.method396(-30785);
            }
            if ((var7 & 128) != 0) {
                int var8 = arg0.method387((byte) 104);
                int var9 = arg0.method388(false);
                var6.method431(var8, field174, true, var9);
                var6.field1178 = field174 + 300;
                var6.field1179 = arg0.method388(false);
                var6.field1180 = arg0.method369();
            }
            if ((var7 & 32) != 0) {
                var6.field1402 = class64.method575(arg0.method371());
                var6.field1149 = var6.field1402.field1597;
                var6.field1159 = var6.field1402.field1600;
                var6.field1138 = var6.field1402.field1599;
                var6.field1139 = var6.field1402.field1565;
                var6.field1140 = var6.field1402.field1578;
                var6.field1141 = var6.field1402.field1596;
                var6.field1146 = var6.field1402.field1590;
            }
            if ((var7 & 4) != 0) {
                var6.field1126 = arg0.method395((byte) 56);
                int var10 = arg0.method402(true);
                var6.field1130 = var10 >> 16;
                var6.field1129 = (var10 & 65535) + field174;
                var6.field1127 = 0;
                var6.field1128 = 0;
                if (var6.field1129 > field174) {
                    var6.field1127 = -1;
                }
                if (var6.field1126 == 65535) {
                    var6.field1126 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                var6.field1164 = arg0.method376();
                var6.field1150 = 100;
            }
            if ((var7 & 1) != 0) {
                int var11 = arg0.method396(-30785);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method388(false);
                if (var6.field1173 == var11 && var11 != -1) {
                    int var13 = class15.field837[var11].field851;
                    if (var13 == 1) {
                        var6.field1174 = 0;
                        var6.field1175 = 0;
                        var6.field1176 = var12;
                        var6.field1177 = 0;
                    }
                    if (var13 == 2) {
                        var6.field1177 = 0;
                    }
                } else if (var11 == -1 || var6.field1173 == -1 || class15.field837[var11].field845 >= class15.field837[var6.field1173].field845) {
                    var6.field1173 = var11;
                    var6.field1174 = 0;
                    var6.field1175 = 0;
                    var6.field1176 = var12;
                    var6.field1177 = 0;
                    var6.field1137 = var6.field1156;
                }
            }
            if ((var7 & 8) != 0) {
                var6.field1165 = arg0.method371();
                if (var6.field1165 == 65535) {
                    var6.field1165 = -1;
                }
            }
            if ((var7 & 64) != 0) {
                int var14 = arg0.method388(false);
                int var15 = arg0.method389(-13491);
                var6.method431(var14, field174, true, var15);
                var6.field1178 = field174 + 300;
                var6.field1179 = arg0.method387((byte) 104);
                var6.field1180 = arg0.method389(-13491);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method121(int arg0) {
        if (this.field550 == 0) {
            this.field447[0] = "Cancel";
            this.field256[0] = 1321;
            this.field117 = 1;
            if (this.field139 != -1) {
                this.field511 = 0;
                this.field158 = 0;
                this.method50(0, 0, super.field803, 0, class44.method460(this.field139), 0, 0, super.field804);
                if (this.field511 != this.field395) {
                    this.field395 = this.field511;
                }
                if (this.field327 != this.field158) {
                    this.field327 = this.field158;
                }
            } else {
                this.method127((byte) 9);
                this.field511 = 0;
                this.field158 = 0;
                if (super.field803 > 4 && super.field804 > 4 && super.field803 < 516 && super.field804 < 338) {
                    if (this.field542 != -1) {
                        this.method50(0, 0, super.field803, 0, class44.method460(this.field542), 4, 4, super.field804);
                    } else {
                        this.method66(false);
                    }
                }
                if (this.field511 != this.field395) {
                    this.field395 = this.field511;
                }
                if (this.field327 != this.field158) {
                    this.field327 = this.field158;
                }
                this.field511 = 0;
                this.field158 = 0;
                if (super.field803 > 553 && super.field804 > 205 && super.field803 < 743 && super.field804 < 466) {
                    if (this.field445 != -1) {
                        this.method50(0, 1, super.field803, 0, class44.method460(this.field445), 553, 205, super.field804);
                    } else if (this.field349[this.field253] != -1) {
                        this.method50(0, 1, super.field803, 0, class44.method460(this.field349[this.field253]), 553, 205, super.field804);
                    }
                }
                if (this.field540 != this.field511) {
                    this.field554 = true;
                    this.field540 = this.field511;
                }
                if (this.field335 != this.field158) {
                    this.field554 = true;
                    this.field335 = this.field158;
                }
                this.field511 = 0;
                this.field158 = 0;
                if (arg0 >= 0) {
                    this.field146 = this.field232.method424();
                }
                if (super.field803 > 17 && super.field804 > 357 && super.field803 < 496 && super.field804 < 453) {
                    if (this.field368 != -1) {
                        this.method50(0, 2, super.field803, 0, class44.method460(this.field368), 17, 357, super.field804);
                    } else if (this.field138 != -1) {
                        this.method50(0, 3, super.field803, 0, class44.method460(this.field138), 17, 357, super.field804);
                    } else if (super.field804 < 434 && super.field803 < 426 && this.field62 == 0) {
                        this.method111(super.field803 - 17, super.field804 - 357, true);
                    }
                }
                if ((this.field368 != -1 || this.field138 != -1) && this.field511 != this.field469) {
                    this.field528 = true;
                    this.field469 = this.field511;
                }
                if ((this.field368 != -1 || this.field138 != -1) && this.field486 != this.field158) {
                    this.field528 = true;
                    this.field486 = this.field158;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field117 - 1; ++var3) {
                        if (this.field256[var3] < 1000 && this.field256[var3 + 1] > 1000) {
                            String var4 = this.field447[var3];
                            this.field447[var3] = this.field447[var3 + 1];
                            this.field447[var3 + 1] = var4;
                            int var5 = this.field256[var3];
                            this.field256[var3] = this.field256[var3 + 1];
                            this.field256[var3 + 1] = var5;
                            int var6 = this.field254[var3];
                            this.field254[var3] = this.field254[var3 + 1];
                            this.field254[var3 + 1] = var6;
                            int var7 = this.field255[var3];
                            this.field255[var3] = this.field255[var3 + 1];
                            this.field255[var3 + 1] = var7;
                            int var8 = this.field257[var3];
                            this.field257[var3] = this.field257[var3 + 1];
                            this.field257[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLLBBVYYXO;I)V")
    private final void method122(byte arg0, class32 arg1, int arg2) {
        this.field533 = 0;
        this.field210 = 0;
        this.method119(arg2, (byte) 6, arg1);
        this.method32(arg1, arg2, 39779);
        this.method29(arg2, 241, arg1);
        this.method107(arg1, arg2, 2);
        if (arg0 != 8) {
            this.field420 = !this.field420;
        }
        for (int var4 = 0; var4 < this.field533; ++var4) {
            int var6 = this.field534[var4];
            if (field174 != this.field207[var6].field1125) {
                this.field207[var6] = null;
            }
        }
        if (arg1.field1032 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1032 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field208; ++var5) {
                if (this.field207[this.field209[var5]] == null) {
                    signlink.reporterror(this.field450 + " null entry in pl list - pos:" + var5 + " size:" + this.field208);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method123(int arg0) {
        this.field339 = null;
        this.field503 = null;
        this.field504 = null;
        this.field505 = null;
        this.field480 = null;
        this.field481 = null;
        this.field482 = null;
        this.field483 = null;
        this.field484 = null;
        this.field196 = null;
        this.field545 = null;
        this.field90 = null;
        this.field240 = null;
        this.field357 = null;
        this.field309 = null;
        this.field95 = null;
        this.field96 = null;
        this.field97 = null;
        this.field98 = null;
        this.field99 = null;
        this.field91 = null;
        this.field432 = null;
        this.field433 = null;
        this.field434 = null;
        this.field435 = null;
        this.field436 = null;
        this.field319 = null;
        this.field363 = null;
        this.field380 = null;
        this.field340 = null;
        if (arg0 >= 1 && arg0 <= 1) {
            this.field342 = null;
            this.field207 = null;
            this.field209 = null;
            this.field211 = null;
            this.field212 = null;
            this.field534 = null;
            this.field415 = null;
            this.field416 = null;
            this.field417 = null;
            this.field418 = null;
            this.field419 = null;
            this.field123 = null;
            this.field411 = null;
            this.field412 = null;
            this.field413 = null;
            this.field372 = null;
            this.field198 = null;
            this.field325 = null;
            this.field326 = null;
            this.field266 = null;
            if (this.field439 != null) {
                this.field439.field890 = false;
            }
            this.field439 = null;
            if (this.field82 != null) {
                this.field82.method227();
            }
            this.field82 = null;
            this.field379 = null;
            this.field155 = null;
            this.field223 = null;
            try {
                if (this.field314 != null) {
                    this.field314.method278();
                }
            } catch (Exception var2) {
            }
            this.field314 = null;
            this.field428 = null;
            this.field429 = null;
            this.field430 = null;
            this.field431 = null;
            this.field538 = null;
            this.field539 = null;
            this.field467 = null;
            this.field235 = null;
            this.field75 = null;
            this.field244 = null;
            this.field245 = null;
            this.field241 = null;
            this.field242 = null;
            this.field243 = null;
            this.field271 = null;
            this.field272 = null;
            this.field273 = null;
            this.field239 = null;
            this.field457 = null;
            this.field154 = null;
            this.field463 = null;
            this.field464 = null;
            this.field465 = null;
            this.field466 = null;
            this.field350 = null;
            this.field246 = null;
            this.field247 = null;
            this.field248 = null;
            this.field249 = null;
            this.method106((byte) -65);
            this.field521 = null;
            this.field381 = null;
            this.field487 = null;
            this.field522 = null;
            this.field523 = null;
            this.field92 = null;
            this.field461 = null;
            this.field546 = null;
            this.field87 = null;
            this.field156 = null;
            this.field176 = null;
            this.field520 = null;
            this.field254 = null;
            this.field255 = null;
            this.field256 = null;
            this.field257 = null;
            this.field447 = null;
            this.method11(this.field513);
            class34.method413(false);
            class64.method573(false);
            class60.method556(false);
            class44.method457(false);
            class3.field30 = null;
            class7.field604 = null;
            class10.field710 = null;
            class15.field837 = null;
            class4.field43 = null;
            class4.field55 = null;
            class33.field1048 = null;
            super.field796 = null;
            class51.field1415 = null;
            class6.method169(false);
            class48.method470(false);
            class8.method192(false);
            class46.method467(false);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILPQPZKUPU;IIBIII)V")
    public final void method124(int arg0, int arg1, class44 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 != 110) {
            field161 = this.field232.method424();
        }
        if (this.field536) {
            this.field422 = 32;
        } else {
            this.field422 = 0;
        }
        this.field536 = false;
        if (arg1 >= arg7 && arg1 < arg7 + 16 && arg0 >= arg8 && arg0 < arg8 + 16) {
            arg2.field1304 -= this.field204 * 4;
            if (arg6 == 1) {
                this.field554 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                this.field528 = true;
            }
        } else if (arg1 >= arg7 && arg1 < arg7 + 16 && arg0 >= arg4 + arg8 - 16 && arg0 < arg4 + arg8) {
            arg2.field1304 += this.field204 * 4;
            if (arg6 == 1) {
                this.field554 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                this.field528 = true;
            }
        } else if (arg1 >= arg7 - this.field422 && arg1 < arg7 + 16 + this.field422 && arg0 >= arg8 + 16 && arg0 < arg4 + arg8 - 16 && this.field204 > 0) {
            int var10 = (arg4 - 32) * arg4 / arg3;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg0 - arg8 - 16 - var10 / 2;
            int var12 = arg4 - 32 - var10;
            arg2.field1304 = (arg3 - arg4) * var11 / var12;
            if (arg6 == 1) {
                this.field554 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                this.field528 = true;
            }
            this.field536 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)Z")
    public final boolean method125(byte arg0) {
        if (this.field282 == arg0) {
            boolean var2 = false;
            return signlink.wavereplay();
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method126(int arg0, byte[] arg1, int arg2) {
        while (arg2 >= 0) {
            this.field235 = null;
        }
        if (arg1 == null) {
            return true;
        } else {
            return signlink.wavesave(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method127(byte arg0) {
        if (this.field81 != 0) {
            int var2 = 0;
            if (this.field406 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field346[var3] != null) {
                    int var5 = this.field344[var3];
                    String var6 = this.field345[var3];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field88 == 0 || this.field88 == 1 && this.method12(var6, (byte) 9))) {
                        int var10 = 329 - var2 * 13;
                        if (super.field803 > 4 && super.field804 - 4 > var10 - 10 && super.field804 - 4 <= var10 + 3) {
                            int var11 = this.field474.method591("From:  " + var6 + this.field346[var3], this.field543) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field803 < var11 + 4) {
                                if (this.field356 >= 1) {
                                    this.field447[this.field117] = "Report abuse @whi@" + var6;
                                    this.field256[this.field117] = 2564;
                                    ++this.field117;
                                }
                                this.field447[this.field117] = "Add ignore @whi@" + var6;
                                this.field256[this.field117] = 2502;
                                ++this.field117;
                                this.field447[this.field117] = "Add friend @whi@" + var6;
                                this.field256[this.field117] = 2308;
                                ++this.field117;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field88 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 == 9) {
                boolean var4 = false;
            } else {
                this.field142 = this.field232.method424();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILLBBVYYXO;)V")
    private final void method128(int arg0, int arg1, class32 arg2) {
        this.field533 = 0;
        this.field210 = 0;
        this.method151((byte) -90, arg1, arg2);
        if (arg0 < 6 || arg0 > 6) {
            this.field200 = -1;
        }
        this.method152((byte) 7, arg1, arg2);
        this.method120(arg2, arg1, 3);
        for (int var4 = 0; var4 < this.field533; ++var4) {
            int var6 = this.field534[var4];
            if (field174 != this.field340[var6].field1125) {
                this.field340[var6].field1402 = null;
                this.field340[var6] = null;
            }
        }
        if (arg2.field1032 != arg1) {
            signlink.reporterror(this.field450 + " size mismatch in getnpcpos - pos:" + arg2.field1032 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field341; ++var5) {
                if (this.field340[this.field342[var5]] == null) {
                    signlink.reporterror(this.field450 + " null entry in npc list - pos:" + var5 + " size:" + this.field341);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZILVZJVQLEE;)V")
    public final void method129(int arg0, boolean arg1, int arg2, class59 arg3) {
        if (!arg1) {
            int var5 = this.field59 + this.field470 & 2047;
            int var6 = arg0 * arg0 + arg2 * arg2;
            if (var6 <= 6400) {
                int var7 = class8.field682[var5];
                int var8 = class8.field683[var5];
                int var9 = var7 * 256 / (this.field529 + 256);
                int var10 = var8 * 256 / (this.field529 + 256);
                int var11 = arg0 * var10 + arg2 * var9 >> 16;
                int var12 = arg2 * var10 - arg0 * var9 >> 16;
                if (var6 > 2500) {
                    arg3.method547(83 - var12 - arg3.field1498 / 2 - 4, var11 + 94 - arg3.field1497 / 2 + 4, (byte) -9, this.field412);
                } else {
                    arg3.method541(-4899, var11 + 94 - arg3.field1497 / 2 + 4, 83 - var12 - arg3.field1498 / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
    public final void method130(int arg0, int arg1) {
        if (arg0 != 47243) {
            this.field92.method359(95);
        }
        class44 var3 = class44.method460(arg1);
        for (int var4 = 0; var4 < var3.field1249.length && var3.field1249[var4] != -1; ++var4) {
            class44 var5 = class44.method460(var3.field1249[var4]);
            if (var5.field1279 == 1) {
                this.method130(47243, var5.field1303);
            }
            var5.field1286 = 0;
            var5.field1293 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method131(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method132(int arg0) {
        if (arg0 >= 2 && arg0 <= 2) {
            for (int var2 = -1; var2 < this.field208; ++var2) {
                int var3;
                if (var2 == -1) {
                    var3 = this.field206;
                } else {
                    var3 = this.field209[var2];
                }
                class51 var4 = this.field207[var3];
                if (var4 != null) {
                    this.method18(1, true, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method133(int arg0, int arg1) {
        if (field153 != arg0) {
            field161 = 180;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (this.field550 == 0) {
            int var2 = super.field809;
            if (arg0 != 11405) {
                this.field541 = this.field232.method424();
            }
            if (this.field187 == 1 && super.field810 >= 516 && super.field811 >= 160 && super.field810 <= 765 && super.field811 <= 205) {
                var2 = 0;
            }
            if (this.field507) {
                if (var2 != 1) {
                    int var3 = super.field803;
                    int var4 = super.field804;
                    if (this.field162 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field162 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field162 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field163 - 10 || var3 > this.field165 + this.field163 + 10 || var4 < this.field164 - 10 || var4 > this.field166 + this.field164 + 10) {
                        this.field507 = false;
                        if (this.field162 == 1) {
                            this.field554 = true;
                        }
                        if (this.field162 == 2) {
                            this.field528 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field163;
                    int var6 = this.field164;
                    int var7 = this.field165;
                    int var8 = super.field810;
                    int var9 = super.field811;
                    if (this.field162 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field162 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field162 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field117; ++var11) {
                        int var12 = (this.field117 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method86(var10, 413);
                    }
                    this.field507 = false;
                    if (this.field162 == 1) {
                        this.field554 = true;
                    }
                    if (this.field162 == 2) {
                        this.field528 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field117 > 0) {
                    int var13 = this.field256[this.field117 - 1];
                    if (var13 == 971 || var13 == 364 || var13 == 855 || var13 == 817 || var13 == 168 || var13 == 495 || var13 == 220 || var13 == 34 || var13 == 273 || var13 == 377 || var13 == 138 || var13 == 1759) {
                        int var14 = this.field254[this.field117 - 1];
                        int var15 = this.field255[this.field117 - 1];
                        class44 var16 = class44.method460(var15);
                        if (var16.field1251 || var16.field1291) {
                            this.field172 = false;
                            this.field409 = 0;
                            this.field548 = var15;
                            this.field549 = var14;
                            this.field550 = 2;
                            this.field551 = super.field810;
                            this.field552 = super.field811;
                            if (class44.method460(var15).field1276 == this.field542) {
                                this.field550 = 1;
                            }
                            if (class44.method460(var15).field1276 == this.field368) {
                                this.field550 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field367 == 1 || this.method114(false, this.field117 - 1)) && this.field117 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field117 > 0) {
                    this.method86(this.field117 - 1, 413);
                }
                if (var2 != 2 || this.field117 <= 0) {
                    return;
                }
                this.method56(3);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method135(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method250(true);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field542 != -1 && this.field542 == this.field347) {
                        if (var3 == 8 && this.field231.length() > 0) {
                            this.field231 = this.field231.substring(0, this.field231.length() - 1);
                        }
                        break;
                    }
                    if (this.field68) {
                        if (var3 >= 32 && var3 <= 122 && this.field308.length() < 80) {
                            this.field308 = this.field308 + (char) var3;
                            this.field528 = true;
                        }
                        if (var3 == 8 && this.field308.length() > 0) {
                            this.field308 = this.field308.substring(0, this.field308.length() - 1);
                            this.field528 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field68 = false;
                            this.field528 = true;
                            if (this.field408 == 1) {
                                long var4 = class40.method440(this.field308);
                                this.method43((byte) 5, var4);
                            }
                            if (this.field408 == 2 && this.field400 > 0) {
                                long var6 = class40.method440(this.field308);
                                this.method102((byte) 117, var6);
                            }
                            if (this.field408 == 3 && this.field308.length() > 0) {
                                this.field92.method358(7793, 179);
                                this.field92.method359(0);
                                int var8 = this.field92.field1032;
                                this.field92.method365(this.field509, (byte) 56);
                                class50.method524(this.field308, this.field92, false);
                                this.field92.method368(this.field92.field1032 - var8, 8);
                                this.field308 = class50.method525(this.field308, 0);
                                this.field308 = class26.method311(this.field308, 0);
                                this.method67(this.field308, class40.method444(true, class40.method441(359, this.field509)), 6, -39349);
                                if (this.field88 == 2) {
                                    this.field88 = 1;
                                    this.field141 = true;
                                    this.field92.method358(7793, 145);
                                    this.field92.method359(this.field234);
                                    this.field92.method359(this.field88);
                                    this.field92.method359(this.field76);
                                }
                            }
                            if (this.field408 == 4 && this.field237 < 100) {
                                long var9 = class40.method440(this.field308);
                                this.method82(var9, 954);
                            }
                            if (this.field408 == 5 && this.field237 > 0) {
                                long var11 = class40.method440(this.field308);
                                this.method109(5, var11);
                            }
                        }
                    } else if (this.field62 == 1) {
                        if (var3 >= 48 && var3 <= 57 && this.field438.length() < 10) {
                            this.field438 = this.field438 + (char) var3;
                            this.field528 = true;
                        }
                        if (var3 == 8 && this.field438.length() > 0) {
                            this.field438 = this.field438.substring(0, this.field438.length() - 1);
                            this.field528 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field438.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field438);
                                } catch (Exception var23) {
                                }
                                this.field92.method358(7793, 157);
                                this.field92.method363(var13);
                            }
                            this.field62 = 0;
                            this.field528 = true;
                        }
                    } else if (this.field62 == 2) {
                        if (var3 >= 32 && var3 <= 122 && this.field438.length() < 12) {
                            this.field438 = this.field438 + (char) var3;
                            this.field528 = true;
                        }
                        if (var3 == 8 && this.field438.length() > 0) {
                            this.field438 = this.field438.substring(0, this.field438.length() - 1);
                            this.field528 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field438.length() > 0) {
                                this.field92.method358(7793, 190);
                                this.field92.method365(class40.method440(this.field438), (byte) 56);
                            }
                            this.field62 = 0;
                            this.field528 = true;
                        }
                    } else if (this.field62 == 3) {
                        if (var3 >= 32 && var3 <= 122 && this.field438.length() < 40) {
                            this.field438 = this.field438 + (char) var3;
                            this.field528 = true;
                        }
                        if (var3 == 8 && this.field438.length() > 0) {
                            this.field438 = this.field438.substring(0, this.field438.length() - 1);
                            this.field528 = true;
                        }
                    } else if (this.field368 == -1 && this.field139 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field407.length() < 80) {
                            this.field407 = this.field407 + (char) var3;
                            this.field528 = true;
                        }
                        if (var3 == 8 && this.field407.length() > 0) {
                            this.field407 = this.field407.substring(0, this.field407.length() - 1);
                            this.field528 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field407.length() > 0) {
                            if (this.field356 == 2) {
                                if (this.field407.equals("::clientdrop")) {
                                    this.method37(false);
                                }
                                if (this.field407.equals("::lag")) {
                                    this.method64(false);
                                }
                                if (this.field407.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field82.method235(2, false); ++var14) {
                                        this.field82.method238((byte) 1, var14, 2, false);
                                    }
                                }
                                if (this.field407.equals("::fpson")) {
                                    field296 = true;
                                }
                                if (this.field407.equals("::fpsoff")) {
                                    field296 = false;
                                }
                                if (this.field407.equals("::noclip")) {
                                    for (int var15 = 0; var15 < 4; ++var15) {
                                        for (int var16 = 1; var16 < 103; ++var16) {
                                            for (int var17 = 1; var17 < 103; ++var17) {
                                                this.field520[var15].field575[var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field407.startsWith("::")) {
                                this.field92.method358(7793, 138);
                                this.field92.method359(this.field407.length() - 1);
                                this.field92.method366(this.field407.substring(2));
                            } else {
                                String var18 = this.field407.toLowerCase();
                                byte var19 = 0;
                                if (var18.startsWith("yellow:")) {
                                    var19 = 0;
                                    this.field407 = this.field407.substring(7);
                                } else if (var18.startsWith("red:")) {
                                    var19 = 1;
                                    this.field407 = this.field407.substring(4);
                                } else if (var18.startsWith("green:")) {
                                    var19 = 2;
                                    this.field407 = this.field407.substring(6);
                                } else if (var18.startsWith("cyan:")) {
                                    var19 = 3;
                                    this.field407 = this.field407.substring(5);
                                } else if (var18.startsWith("purple:")) {
                                    var19 = 4;
                                    this.field407 = this.field407.substring(7);
                                } else if (var18.startsWith("white:")) {
                                    var19 = 5;
                                    this.field407 = this.field407.substring(6);
                                } else if (var18.startsWith("flash1:")) {
                                    var19 = 6;
                                    this.field407 = this.field407.substring(7);
                                } else if (var18.startsWith("flash2:")) {
                                    var19 = 7;
                                    this.field407 = this.field407.substring(7);
                                } else if (var18.startsWith("flash3:")) {
                                    var19 = 8;
                                    this.field407 = this.field407.substring(7);
                                } else if (var18.startsWith("glow1:")) {
                                    var19 = 9;
                                    this.field407 = this.field407.substring(6);
                                } else if (var18.startsWith("glow2:")) {
                                    var19 = 10;
                                    this.field407 = this.field407.substring(6);
                                } else if (var18.startsWith("glow3:")) {
                                    var19 = 11;
                                    this.field407 = this.field407.substring(6);
                                }
                                String var20 = this.field407.toLowerCase();
                                byte var21 = 0;
                                if (var20.startsWith("wave:")) {
                                    var21 = 1;
                                    this.field407 = this.field407.substring(5);
                                } else if (var20.startsWith("wave2:")) {
                                    var21 = 2;
                                    this.field407 = this.field407.substring(6);
                                } else if (var20.startsWith("shake:")) {
                                    var21 = 3;
                                    this.field407 = this.field407.substring(6);
                                } else if (var20.startsWith("scroll:")) {
                                    var21 = 4;
                                    this.field407 = this.field407.substring(7);
                                } else if (var20.startsWith("slide:")) {
                                    var21 = 5;
                                    this.field407 = this.field407.substring(6);
                                }
                                this.field92.method358(7793, 197);
                                this.field92.method359(0);
                                int var22 = this.field92.field1032;
                                this.field339.field1032 = 0;
                                class50.method524(this.field407, this.field339, false);
                                this.field92.method405(false, 0, this.field339.field1031, this.field339.field1032);
                                this.field92.method385(0, var21);
                                this.field92.method386(var19, 4);
                                this.field92.method368(this.field92.field1032 - var22, 8);
                                this.field407 = class50.method525(this.field407, 0);
                                this.field407 = class26.method311(this.field407, 0);
                                field124.field1164 = this.field407;
                                field124.field1155 = var19;
                                field124.field1131 = var21;
                                field124.field1150 = 150;
                                if (this.field356 == 2) {
                                    this.method67(field124.field1164, "@cr2@" + field124.field1423, 2, -39349);
                                } else if (this.field356 == 1) {
                                    this.method67(field124.field1164, "@cr1@" + field124.field1423, 2, -39349);
                                } else {
                                    this.method67(field124.field1164, field124.field1423, 2, -39349);
                                }
                                if (this.field234 == 2) {
                                    this.field234 = 3;
                                    this.field141 = true;
                                    this.field92.method358(7793, 145);
                                    this.field92.method359(this.field234);
                                    this.field92.method359(this.field88);
                                    this.field92.method359(this.field76);
                                }
                            }
                            this.field407 = "";
                            this.field528 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field231.length() < 12) {
                this.field231 = this.field231 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method136(int arg0) {
        this.field463.method298(0);
        class6.field589 = this.field517;
        this.field411.method586(-4899, 0, 0);
        while (arg0 >= 0) {
            this.field449 = !this.field449;
        }
        if (this.field445 != -1) {
            this.method35(0, 0, class44.method460(this.field445), -545, 0);
        } else if (this.field349[this.field253] != -1) {
            this.method35(0, 0, class44.method460(this.field349[this.field253]), -545, 0);
        }
        if (this.field507 && this.field162 == 1) {
            this.method143(614);
        }
        this.field463.method299(super.field795, 553, 0, 205);
        this.field465.method298(0);
        class6.field589 = this.field518;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFIMQRVPL;B)V")
    private final void method137(class18 arg0, byte arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field898 == 0) {
            var3 = this.field176.method497(arg0.field897, arg0.field899, arg0.field900);
        }
        if (arg0.field898 == 1) {
            var3 = this.field176.method498(arg0.field897, arg0.field899, -38326, arg0.field900);
        }
        if (arg0.field898 == 2) {
            var3 = this.field176.method499(arg0.field897, arg0.field899, arg0.field900);
        }
        if (arg0.field898 == 3) {
            var3 = this.field176.method500(arg0.field897, arg0.field899, arg0.field900);
        }
        if (var3 != 0) {
            int var7 = this.field176.method501(arg0.field897, arg0.field899, arg0.field900, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field894 = var4;
        arg0.field896 = var5;
        arg0.field895 = var6;
        if (arg1 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method138(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field229 = 122;
        }
        if (this.field117 >= 2 || this.field182 != 0 || this.field187 != 0) {
            String var2;
            if (this.field182 == 1 && this.field117 < 2) {
                var2 = "Use " + this.field186 + " with...";
            } else if (this.field187 == 1 && this.field117 < 2) {
                var2 = this.field190 + "...";
            } else {
                var2 = this.field447[this.field117 - 1];
            }
            if (this.field117 > 2) {
                var2 = var2 + "@whi@ / " + (this.field117 - 2) + " more options";
            }
            this.field475.method598(true, var2, this.field478, 15, 4, field174 / 1000, 16777215);
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
    public final void method139(boolean arg0) {
        int var2 = this.field384 * 128 + 64;
        int var3 = this.field385 * 128 + 64;
        int var4 = this.method147(var2, 0, this.field220, var3) - this.field386;
        if (this.field440 < var2) {
            this.field440 += (var2 - this.field440) * this.field388 / 1000 + this.field387;
            if (this.field440 > var2) {
                this.field440 = var2;
            }
        }
        if (this.field440 > var2) {
            this.field440 -= (this.field440 - var2) * this.field388 / 1000 + this.field387;
            if (this.field440 < var2) {
                this.field440 = var2;
            }
        }
        if (this.field441 < var4) {
            this.field441 += (var4 - this.field441) * this.field388 / 1000 + this.field387;
            if (this.field441 > var4) {
                this.field441 = var4;
            }
        }
        if (this.field441 > var4) {
            this.field441 -= (this.field441 - var4) * this.field388 / 1000 + this.field387;
            if (this.field441 < var4) {
                this.field441 = var4;
            }
        }
        if (this.field442 < var3) {
            this.field442 += (var3 - this.field442) * this.field388 / 1000 + this.field387;
            if (this.field442 > var3) {
                this.field442 = var3;
            }
        }
        if (this.field442 > var3) {
            this.field442 -= (this.field442 - var3) * this.field388 / 1000 + this.field387;
            if (this.field442 < var3) {
                this.field442 = var3;
            }
        }
        int var5 = this.field555 * 128 + 64;
        int var6 = this.field556 * 128 + 64;
        int var7 = this.method147(var5, 0, this.field220, var6) - this.field557;
        int var8 = var5 - this.field440;
        int var9 = var7 - this.field441;
        int var10 = var6 - this.field442;
        if (!arg0) {
            this.field229 = this.field232.method424();
        }
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field443 < var12) {
            this.field443 += (var12 - this.field443) * this.field559 / 1000 + this.field558;
            if (this.field443 > var12) {
                this.field443 = var12;
            }
        }
        if (this.field443 > var12) {
            this.field443 -= (this.field443 - var12) * this.field559 / 1000 + this.field558;
            if (this.field443 < var12) {
                this.field443 = var12;
            }
        }
        int var14 = var13 - this.field444;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field444 += this.field559 * var14 / 1000 + this.field558;
            this.field444 &= 2047;
        }
        if (var14 < 0) {
            this.field444 -= -var14 * this.field559 / 1000 + this.field558;
            this.field444 &= 2047;
        }
        int var15 = var13 - this.field444;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field444 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (!this.field197 && !this.field167 && !this.field297) {
            ++field174;
            int var2 = 72 / arg0;
            if (!this.field318) {
                this.method145(this.field177);
            } else {
                this.method54(-436);
            }
            this.method33(44393);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method141(String arg0, boolean arg1) {
        if (arg0 != null && arg0.length() != 0) {
            String var3 = arg0;
            String[] var4 = new String[100];
            if (!arg1) {
                this.field200 = -1;
            }
            int var5 = 0;
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field64 = 0;
                    label51: for (int var9 = 0; var9 < class60.field1507; ++var9) {
                        class60 var10 = class60.method554(var9);
                        if (var10.field1536 == -1 && var10.field1541 != null) {
                            String var11 = var10.field1541.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label51;
                                }
                            }
                            this.field65[this.field64] = var11;
                            this.field66[this.field64] = var9;
                            ++this.field64;
                            if (this.field64 >= this.field65.length) {
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
            this.field64 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILYGGALXYD;BII)V")
    public final void method142(int arg0, class64 arg1, byte arg2, int arg3, int arg4) {
        if (this.field426 == arg2) {
            boolean var6 = false;
        } else {
            this.field200 = -1;
        }
        if (this.field117 < 400) {
            if (arg1.field1587 != null) {
                arg1 = arg1.method572(7);
            }
            if (arg1 != null) {
                if (arg1.field1579) {
                    String var7 = arg1.field1582;
                    if (arg1.field1576 != 0) {
                        var7 = var7 + method16(arg1.field1576, field124.field1408, 869) + " (level-" + arg1.field1576 + ")";
                    }
                    if (this.field182 == 1) {
                        this.field447[this.field117] = "Use " + this.field186 + " with @yel@" + var7;
                        this.field256[this.field117] = 151;
                        this.field257[this.field117] = arg0;
                        this.field254[this.field117] = arg3;
                        this.field255[this.field117] = arg4;
                        ++this.field117;
                    } else {
                        if (this.field187 == 1) {
                            if ((this.field189 & 2) == 2) {
                                this.field447[this.field117] = this.field190 + " @yel@" + var7;
                                this.field256[this.field117] = 581;
                                this.field257[this.field117] = arg0;
                                this.field254[this.field117] = arg3;
                                this.field255[this.field117] = arg4;
                                ++this.field117;
                                return;
                            }
                        } else {
                            if (arg1.field1577 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg1.field1577[var8] != null && !arg1.field1577[var8].equalsIgnoreCase("attack")) {
                                        this.field447[this.field117] = arg1.field1577[var8] + " @yel@" + var7;
                                        if (var8 == 0) {
                                            this.field256[this.field117] = 132;
                                        }
                                        if (var8 == 1) {
                                            this.field256[this.field117] = 776;
                                        }
                                        if (var8 == 2) {
                                            this.field256[this.field117] = 565;
                                        }
                                        if (var8 == 3) {
                                            this.field256[this.field117] = 705;
                                        }
                                        if (var8 == 4) {
                                            this.field256[this.field117] = 181;
                                        }
                                        this.field257[this.field117] = arg0;
                                        this.field254[this.field117] = arg3;
                                        this.field255[this.field117] = arg4;
                                        ++this.field117;
                                    }
                                }
                            }
                            if (arg1.field1577 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (arg1.field1577[var9] != null && arg1.field1577[var9].equalsIgnoreCase("attack")) {
                                        short var10 = 0;
                                        if (arg1.field1576 > field124.field1408) {
                                            var10 = 2000;
                                        }
                                        this.field447[this.field117] = arg1.field1577[var9] + " @yel@" + var7;
                                        if (var9 == 0) {
                                            this.field256[this.field117] = var10 + 132;
                                        }
                                        if (var9 == 1) {
                                            this.field256[this.field117] = var10 + 776;
                                        }
                                        if (var9 == 2) {
                                            this.field256[this.field117] = var10 + 565;
                                        }
                                        if (var9 == 3) {
                                            this.field256[this.field117] = var10 + 705;
                                        }
                                        if (var9 == 4) {
                                            this.field256[this.field117] = var10 + 181;
                                        }
                                        this.field257[this.field117] = arg0;
                                        this.field254[this.field117] = arg3;
                                        this.field255[this.field117] = arg4;
                                        ++this.field117;
                                    }
                                }
                            }
                            this.field447[this.field117] = "Examine @yel@" + var7;
                            this.field256[this.field117] = 1094;
                            this.field257[this.field117] = arg0;
                            this.field254[this.field117] = arg3;
                            this.field255[this.field117] = arg4;
                            ++this.field117;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method143(int arg0) {
        int var2 = this.field163;
        int var3 = this.field164;
        int var4 = this.field165;
        int var5 = this.field166;
        int var6 = 6116423;
        class21.method289(var4, 2, var2, var6, var3, var5);
        class21.method289(var4 - 2, 2, var2 + 1, 0, var3 + 1, 16);
        class21.method290(var5 - 19, 0, 0, var2 + 1, var4 - 2, var3 + 18);
        this.field475.method593("Choose Option", var3 + 14, var2 + 3, var6, -32001);
        int var7 = super.field803;
        int var8 = super.field804;
        if (this.field162 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field162 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field162 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field117; ++var9) {
            int var10 = (this.field117 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field475.method597(var11, this.field447[var9], true, var2 + 3, this.field100, var10);
        }
        if (arg0 <= 0) {
            this.field478 = this.field232.method424();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
    public final void method144(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field176.method497(arg1, arg3, arg5);
        if (arg0 == -21) {
            if (var7 != 0) {
                int var8 = this.field176.method501(arg1, arg3, arg5, var7);
                int var9 = var8 >> 6 & 3;
                int var10 = var8 & 31;
                int var11 = arg2;
                if (var7 > 0) {
                    var11 = arg4;
                }
                int[] var12 = this.field223.field1492;
                int var13 = (103 - arg5) * 512 * 4 + arg3 * 4 + 24624;
                int var14 = var7 >> 14 & 32767;
                class34 var15 = class34.method409(var14);
                if (var15.field1089 != -1) {
                    class69 var16 = this.field379[var15.field1089];
                    if (var16 != null) {
                        int var17 = (var15.field1085 * 4 - var16.field1687) / 2;
                        int var18 = (var15.field1106 * 4 - var16.field1688) / 2;
                        var16.method586(-4899, arg3 * 4 + 48 + var17, (104 - arg5 - var15.field1106) * 4 + 48 + var18);
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
            int var19 = this.field176.method499(arg1, arg3, arg5);
            if (var19 != 0) {
                int var20 = this.field176.method501(arg1, arg3, arg5, var19);
                int var21 = var20 >> 6 & 3;
                int var22 = var20 & 31;
                int var23 = var19 >> 14 & 32767;
                class34 var24 = class34.method409(var23);
                if (var24.field1089 != -1) {
                    class69 var25 = this.field379[var24.field1089];
                    if (var25 != null) {
                        int var26 = (var24.field1085 * 4 - var25.field1687) / 2;
                        int var27 = (var24.field1106 * 4 - var25.field1688) / 2;
                        var25.method586(-4899, arg3 * 4 + 48 + var26, (104 - arg5 - var24.field1106) * 4 + 48 + var27);
                    }
                } else if (var22 == 9) {
                    int var28 = 15658734;
                    if (var19 > 0) {
                        var28 = 15597568;
                    }
                    int[] var29 = this.field223.field1492;
                    int var30 = (103 - arg5) * 512 * 4 + arg3 * 4 + 24624;
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
            int var31 = this.field176.method500(arg1, arg3, arg5);
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                class34 var33 = class34.method409(var32);
                if (var33.field1089 != -1) {
                    class69 var34 = this.field379[var33.field1089];
                    if (var34 != null) {
                        int var35 = (var33.field1085 * 4 - var34.field1687) / 2;
                        int var36 = (var33.field1106 * 4 - var34.field1688) / 2;
                        var34.method586(-4899, arg3 * 4 + 48 + var35, (104 - arg5 - var33.field1106) * 4 + 48 + var36);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method145(int arg0) {
        int var2 = 94 / arg0;
        if (this.field228 == 0) {
            int var3 = super.field793 / 2 - 80;
            int var4 = super.field794 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field809 == 1 && super.field810 >= var3 - 75 && super.field810 <= var3 + 75 && super.field811 >= var15 - 20 && super.field811 <= var15 + 20) {
                this.field228 = 3;
                this.field265 = 0;
            }
            int var5 = super.field793 / 2 + 80;
            if (super.field809 == 1 && super.field810 >= var5 - 75 && super.field810 <= var5 + 75 && super.field811 >= var15 - 20 && super.field811 <= var15 + 20) {
                this.field93 = "";
                this.field94 = "Enter your username & password.";
                this.field228 = 2;
                this.field265 = 0;
            }
        } else if (this.field228 == 2) {
            int var6 = super.field794 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field809 == 1 && super.field811 >= var17 - 15 && super.field811 < var17) {
                this.field265 = 0;
            }
            var6 = var17 + 15;
            if (super.field809 == 1 && super.field811 >= var6 - 15 && super.field811 < var6) {
                this.field265 = 1;
            }
            var6 += 15;
            int var7 = super.field793 / 2 - 80;
            int var8 = super.field794 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field809 == 1 && super.field810 >= var7 - 75 && super.field810 <= var7 + 75 && super.field811 >= var18 - 20 && super.field811 <= var18 + 20) {
                this.field459 = 0;
                this.method25(this.field450, this.field451, false);
                if (this.field318) {
                    return;
                }
            }
            int var9 = super.field793 / 2 + 80;
            if (super.field809 == 1 && super.field810 >= var9 - 75 && super.field810 <= var9 + 75 && super.field811 >= var18 - 20 && super.field811 <= var18 + 20) {
                this.field228 = 0;
                this.field450 = "";
                this.field451 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method250(true);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field535.length(); ++var12) {
                        if (var10 == field535.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field265 == 0) {
                        if (var10 == 8 && this.field450.length() > 0) {
                            this.field450 = this.field450.substring(0, this.field450.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field265 = 1;
                        }
                        if (var11) {
                            this.field450 = this.field450 + (char) var10;
                        }
                        if (this.field450.length() > 12) {
                            this.field450 = this.field450.substring(0, 12);
                        }
                    } else if (this.field265 == 1) {
                        if (var10 == 8 && this.field451.length() > 0) {
                            this.field451 = this.field451.substring(0, this.field451.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field265 = 0;
                        }
                        if (var11) {
                            this.field451 = this.field451 + (char) var10;
                        }
                        if (this.field451.length() > 20) {
                            this.field451 = this.field451.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field228 == 3) {
                int var13 = super.field793 / 2;
                int var14 = super.field794 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field809 == 1 && super.field810 >= var13 - 75 && super.field810 <= var13 + 75 && super.field811 >= var19 - 20 && super.field811 <= var19 + 20) {
                    this.field228 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
    public final int method147(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            this.field199 += arg1;
            if (arg2 < 3 && (this.field156[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg3 & 127;
            int var10 = (128 - var8) * this.field87[var7][var5][var6] + this.field87[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field87[var7][var5][var6 + 1] + this.field87[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
    public final void method148(boolean arg0) {
        this.field252 = true;
        if (!arg0) {
            this.field92.method359(223);
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field306) {
                ++this.field312;
                this.method15(5);
                this.method15(5);
                this.method110(-544);
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
        this.field252 = false;
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (this.field466 == null) {
            this.method11(this.field513);
            super.field796 = null;
            this.field241 = null;
            if (this.field122 != arg0) {
                this.field92.method359(120);
            }
            this.field242 = null;
            this.field243 = null;
            this.field244 = null;
            this.field245 = null;
            this.field246 = null;
            this.field247 = null;
            this.field248 = null;
            this.field249 = null;
            this.field466 = new class25(96, 479, this.method65(true), field383);
            this.field464 = new class25(156, 172, this.method65(true), field383);
            class21.method287(true);
            this.field412.method586(-4899, 0, 0);
            this.field463 = new class25(261, 190, this.method65(true), field383);
            this.field465 = new class25(334, 512, this.method65(true), field383);
            class21.method287(true);
            this.field503 = new class25(50, 496, this.method65(true), field383);
            this.field504 = new class25(37, 269, this.method65(true), field383);
            this.field505 = new class25(45, 249, this.method65(true), field383);
            this.field74 = true;
            this.field465.method298(0);
            class6.field589 = this.field518;
        }
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method150(int arg0) {
        if (arg0 > 0) {
            try {
                int var2 = field124.field1134 + this.field113;
                int var3 = field124.field1135 + this.field269;
                if (this.field329 - var2 < -500 || this.field329 - var2 > 500 || this.field330 - var3 < -500 || this.field330 - var3 > 500) {
                    this.field329 = var2;
                    this.field330 = var3;
                }
                if (this.field329 != var2) {
                    this.field329 += (var2 - this.field329) / 16;
                }
                if (this.field330 != var3) {
                    this.field330 += (var3 - this.field330) / 16;
                }
                if (super.field813[1] == 1) {
                    this.field60 += (-24 - this.field60) / 2;
                } else if (super.field813[2] == 1) {
                    this.field60 += (24 - this.field60) / 2;
                } else {
                    this.field60 /= 2;
                }
                if (super.field813[3] == 1) {
                    this.field61 += (12 - this.field61) / 2;
                } else if (super.field813[4] == 1) {
                    this.field61 += (-12 - this.field61) / 2;
                } else {
                    this.field61 /= 2;
                }
                this.field59 = this.field60 / 2 + this.field59 & 2047;
                this.field58 += this.field61 / 2;
                if (this.field58 < 128) {
                    this.field58 = 128;
                }
                if (this.field58 > 383) {
                    this.field58 = 383;
                }
                int var4 = this.field329 >> 7;
                int var5 = this.field330 >> 7;
                int var6 = this.method147(this.field329, 0, this.field220, this.field330);
                int var7 = 0;
                if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                            int var10 = this.field220;
                            if (var10 < 3 && (this.field156[1][var8][var9] & 2) == 2) {
                                ++var10;
                            }
                            int var11 = var6 - this.field87[var10][var8][var9];
                            if (var11 > var7) {
                                var7 = var11;
                            }
                        }
                    }
                }
                ++field175;
                if (field175 > 101) {
                    field175 = 0;
                    this.field92.method358(7793, 110);
                    this.field92.method360(3789);
                }
                int var12 = var7 * 192;
                if (var12 > 98048) {
                    var12 = 98048;
                }
                if (var12 < 32768) {
                    var12 = 32768;
                }
                if (var12 > this.field233) {
                    this.field233 += (var12 - this.field233) / 24;
                } else if (var12 < this.field233) {
                    this.field233 += (var12 - this.field233) / 80;
                }
            } catch (Exception var13) {
                signlink.reporterror("glfc_ex " + field124.field1134 + "," + field124.field1135 + "," + this.field329 + "," + this.field330 + "," + this.field361 + "," + this.field362 + "," + this.field168 + "," + this.field169);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILLBBVYYXO;)V")
    private final void method151(byte arg0, int arg1, class32 arg2) {
        arg2.method379(-604);
        int var4 = arg2.method380(8, (byte) -50);
        if (var4 < this.field341) {
            for (int var5 = var4; var5 < this.field341; ++var5) {
                this.field534[this.field533++] = this.field342[var5];
            }
        }
        if (var4 > this.field341) {
            signlink.reporterror(this.field450 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field341 = 0;
            if (arg0 == -90) {
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field342[var6];
                    class49 var8 = this.field340[var7];
                    int var9 = arg2.method380(1, (byte) -50);
                    if (var9 == 0) {
                        this.field342[this.field341++] = var7;
                        var8.field1125 = field174;
                    } else {
                        int var10 = arg2.method380(2, (byte) -50);
                        if (var10 == 0) {
                            this.field342[this.field341++] = var7;
                            var8.field1125 = field174;
                            this.field211[this.field210++] = var7;
                        } else if (var10 == 1) {
                            this.field342[this.field341++] = var7;
                            var8.field1125 = field174;
                            int var11 = arg2.method380(3, (byte) -50);
                            var8.method428(var11, false, true);
                            int var12 = arg2.method380(1, (byte) -50);
                            if (var12 == 1) {
                                this.field211[this.field210++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field342[this.field341++] = var7;
                            var8.field1125 = field174;
                            int var13 = arg2.method380(3, (byte) -50);
                            var8.method428(var13, true, true);
                            int var14 = arg2.method380(3, (byte) -50);
                            var8.method428(var14, true, true);
                            int var15 = arg2.method380(1, (byte) -50);
                            if (var15 == 1) {
                                this.field211[this.field210++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field534[this.field533++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 356);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field215 = Integer.parseInt(arg0[0]);
                field216 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method49(field351);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method94(0);
                }
                if (arg0[3].equals("free")) {
                    field217 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field217 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method246(503, field289, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BILLBBVYYXO;)V")
    private final void method152(byte arg0, int arg1, class32 arg2) {
        if (arg0 == 7) {
            boolean var4 = false;
        } else {
            this.field488 = !this.field488;
        }
        while (arg2.field1033 + 21 < arg1 * 8) {
            int var5 = arg2.method380(14, (byte) -50);
            if (var5 == 16383) {
                break;
            }
            if (this.field340[var5] == null) {
                this.field340[var5] = new class49();
            }
            class49 var6 = this.field340[var5];
            this.field342[this.field341++] = var5;
            var6.field1125 = field174;
            var6.field1402 = class64.method575(arg2.method380(13, (byte) -50));
            int var7 = arg2.method380(1, (byte) -50);
            if (var7 == 1) {
                this.field211[this.field210++] = var5;
            }
            int var8 = arg2.method380(1, (byte) -50);
            int var9 = arg2.method380(5, (byte) -50);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg2.method380(5, (byte) -50);
            if (var10 > 15) {
                var10 -= 32;
            }
            var6.field1149 = var6.field1402.field1597;
            var6.field1159 = var6.field1402.field1600;
            var6.field1138 = var6.field1402.field1599;
            var6.field1139 = var6.field1402.field1565;
            var6.field1140 = var6.field1402.field1578;
            var6.field1141 = var6.field1402.field1596;
            var6.field1146 = var6.field1402.field1590;
            var6.method430(field124.field1132[0] + var10, field124.field1133[0] + var9, this.field348, var8 == 1);
        }
        arg2.method381(true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBZ)V")
    public final void method153(int arg0, byte arg1, boolean arg2) {
        if (arg1 != -75) {
            this.field142 = this.field232.method424();
        }
        signlink.midivol = arg0;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
    public final void method154(int arg0, int arg1) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        class44.method458(3, arg1);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)Ljava/lang/String;")
    public final String method155(int arg0, byte arg1) {
        if (arg1 != -1) {
            this.field92.method359(245);
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
    public final void method156(boolean arg0, byte[] arg1, int arg2) {
        if (this.field453) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
            if (arg2 != 47025) {
                for (int var4 = 1; var4 > 0; ++var4) {
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
            field301[var1] = var0 / 4;
        }
        field351 = 91;
        field468 = true;
        field502 = 5;
        field525 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field535 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field544 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field544[var3] = var2 - 1;
            var2 += var2;
        }
    }
}
