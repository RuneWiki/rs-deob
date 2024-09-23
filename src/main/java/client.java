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
public class client extends class56 {

    @OriginalMember(owner = "client", name = "K", descriptor = "Z")
    private boolean field44 = false;

    @OriginalMember(owner = "client", name = "L", descriptor = "Z")
    private boolean field45 = false;

    @OriginalMember(owner = "client", name = "M", descriptor = "[LHUQCCBIO;")
    private class21[] field46 = new class21[4];

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field48 = -90;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field49 = -1;

    @OriginalMember(owner = "client", name = "R", descriptor = "[LMMZHRHUG;")
    public class36[] field51 = new class36[5];

    @OriginalMember(owner = "client", name = "S", descriptor = "Z")
    private boolean field52 = false;

    @OriginalMember(owner = "client", name = "T", descriptor = "Z")
    private boolean field53 = true;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field54 = -1;

    @OriginalMember(owner = "client", name = "Z", descriptor = "[I")
    public int[] field59 = new int[2000];

    @OriginalMember(owner = "client", name = "ab", descriptor = "Z")
    private boolean field60 = true;

    @OriginalMember(owner = "client", name = "bb", descriptor = "LBJPWOXRJ;")
    private class3 field61 = class3.method3(1, (byte) 5);

    @OriginalMember(owner = "client", name = "cb", descriptor = "Z")
    private boolean field62 = true;

    @OriginalMember(owner = "client", name = "db", descriptor = "Z")
    private boolean field63 = false;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field65 = new int[151];

    @OriginalMember(owner = "client", name = "gb", descriptor = "[LTKCVVLIT;")
    private class57[] field66 = new class57[100];

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field68 = -1;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field70 = new int[50];

    @OriginalMember(owner = "client", name = "lb", descriptor = "Z")
    public boolean field71 = true;

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    private int[] field74 = new int[33];

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field75 = -41990;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Z")
    private boolean field76 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "[I")
    private final int[] field80 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field82 = 2;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[LYZDAHXEQ;")
    private class70[] field83 = new class70[1000];

    @OriginalMember(owner = "client", name = "yb", descriptor = "[I")
    private int[] field84 = new int[class46.field1391];

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field86 = 2;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field90 = 11341;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "B")
    private byte field97 = 9;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Ljava/lang/String;")
    private String field98 = "";

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Z")
    private boolean field99 = true;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field100 = 128;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "LBJPWOXRJ;")
    private class3 field106 = class3.method3(1, (byte) 5);

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private boolean field117 = false;

    @OriginalMember(owner = "client", name = "hc", descriptor = "LRGZIHLRP;")
    private class50 field119 = new class50(field137);

    @OriginalMember(owner = "client", name = "ic", descriptor = "Z")
    private boolean field120 = false;

    @OriginalMember(owner = "client", name = "jc", descriptor = "[LYZDAHXEQ;")
    private class70[] field121 = new class70[8];

    @OriginalMember(owner = "client", name = "kc", descriptor = "B")
    private byte field122 = 99;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field125 = 893;

    @OriginalMember(owner = "client", name = "oc", descriptor = "Z")
    private boolean field126 = false;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Z")
    private boolean field133 = false;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field134 = -37066;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "LBJPWOXRJ;")
    private class3 field148 = new class3(false, new byte[5000]);

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[LHGVATLQF;")
    private class18[] field149 = new class18[16384];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    public int[] field151 = new int[16384];

    @OriginalMember(owner = "client", name = "Oc", descriptor = "[I")
    private int[] field152 = new int[5];

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[Ljava/lang/String;")
    private String[] field154 = new String[200];

    @OriginalMember(owner = "client", name = "Vc", descriptor = "Z")
    private boolean field159 = false;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field160 = -31473;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[I")
    private int[] field162 = new int[2000];

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Z")
    private boolean field163 = false;

    @OriginalMember(owner = "client", name = "bd", descriptor = "[I")
    private int[] field165 = new int[33];

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    private boolean field166 = false;

    @OriginalMember(owner = "client", name = "hd", descriptor = "[[[LRGZIHLRP;")
    private class50[][][] field171 = new class50[4][104][104];

    @OriginalMember(owner = "client", name = "id", descriptor = "Ljava/lang/String;")
    private String field172 = "";

    @OriginalMember(owner = "client", name = "jd", descriptor = "Z")
    private boolean field173 = false;

    @OriginalMember(owner = "client", name = "pd", descriptor = "Z")
    private boolean field179 = false;

    @OriginalMember(owner = "client", name = "qd", descriptor = "[I")
    private int[] field180 = new int[256];

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field184 = 1;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private final int field185 = 100;

    @OriginalMember(owner = "client", name = "wd", descriptor = "[I")
    private int[] field186 = new int[100];

    @OriginalMember(owner = "client", name = "xd", descriptor = "B")
    private byte field187 = 99;

    @OriginalMember(owner = "client", name = "yd", descriptor = "B")
    private byte field188 = -5;

    @OriginalMember(owner = "client", name = "zd", descriptor = "Z")
    private boolean field189 = false;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Z")
    private boolean field193 = true;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Ljava/lang/String;")
    private String field205 = "";

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Ljava/lang/String;")
    private String field206 = "";

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[J")
    private long[] field207 = new long[100];

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    private int[] field208 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field209 = -153;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field211 = 50;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[I")
    private int[] field212 = new int[this.field211];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private int[] field213 = new int[this.field211];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[I")
    private int[] field214 = new int[this.field211];

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field215 = new int[this.field211];

    @OriginalMember(owner = "client", name = "ae", descriptor = "[I")
    private int[] field216 = new int[this.field211];

    @OriginalMember(owner = "client", name = "be", descriptor = "[I")
    private int[] field217 = new int[this.field211];

    @OriginalMember(owner = "client", name = "ce", descriptor = "[I")
    private int[] field218 = new int[this.field211];

    @OriginalMember(owner = "client", name = "de", descriptor = "[Ljava/lang/String;")
    private String[] field219 = new String[this.field211];

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field220 = -1;

    @OriginalMember(owner = "client", name = "fe", descriptor = "[I")
    private int[] field221 = new int[9];

    @OriginalMember(owner = "client", name = "le", descriptor = "B")
    private byte field227 = 9;

    @OriginalMember(owner = "client", name = "me", descriptor = "[[I")
    private int[][] field228 = new int[104][104];

    @OriginalMember(owner = "client", name = "se", descriptor = "[[I")
    private int[][] field234 = new int[104][104];

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field238 = false;

    @OriginalMember(owner = "client", name = "xe", descriptor = "[I")
    private int[] field239 = new int[5];

    @OriginalMember(owner = "client", name = "De", descriptor = "Z")
    private boolean field245 = false;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "B")
    private byte field246 = -128;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "B")
    private byte field247 = 39;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "[Z")
    private boolean[] field255 = new boolean[5];

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Z")
    private boolean field256 = false;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "[Ljava/lang/String;")
    private String[] field262 = new String[500];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Z")
    private boolean field265 = false;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field268 = 3353893;

    @OriginalMember(owner = "client", name = "bf", descriptor = "[LYZDAHXEQ;")
    private class70[] field269 = new class70[20];

    @OriginalMember(owner = "client", name = "cf", descriptor = "Z")
    private boolean field270 = true;

    @OriginalMember(owner = "client", name = "gf", descriptor = "[J")
    private long[] field274 = new long[200];

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field276 = 2301979;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Z")
    private boolean field277 = false;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Z")
    private boolean field278 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    private boolean field279 = true;

    @OriginalMember(owner = "client", name = "nf", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "client", name = "of", descriptor = "B")
    private byte field281 = 7;

    @OriginalMember(owner = "client", name = "pf", descriptor = "LBJPWOXRJ;")
    private class3 field282 = class3.method3(1, (byte) 5);

    @OriginalMember(owner = "client", name = "rf", descriptor = "[I")
    public int[] field284 = new int[1000];

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field288 = 620;

    @OriginalMember(owner = "client", name = "xf", descriptor = "B")
    private byte field290 = 0;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field292 = -1;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field299 = -1;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "[I")
    private int[] field300 = new int[5];

    @OriginalMember(owner = "client", name = "If", descriptor = "Z")
    private boolean field301 = false;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    private int[] field302 = new int[5];

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[I")
    private int[] field309 = new int[200];

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field314 = -1;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[I")
    private int[] field315 = new int[151];

    @OriginalMember(owner = "client", name = "cg", descriptor = "Z")
    private boolean field321 = false;

    @OriginalMember(owner = "client", name = "dg", descriptor = "LRGZIHLRP;")
    private class50 field322 = new class50(field137);

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field328 = 529;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field334 = 5063219;

    @OriginalMember(owner = "client", name = "qg", descriptor = "LETSIPTYG;")
    private class8 field335 = new class8();

    @OriginalMember(owner = "client", name = "rg", descriptor = "Z")
    private boolean field336 = true;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field337 = -863;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "[LTKCVVLIT;")
    private class57[] field354 = new class57[13];

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field355 = 1;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Z")
    private boolean field356 = false;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[I")
    private int[] field357 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Z")
    private boolean field361 = false;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field369 = -156;

    @OriginalMember(owner = "client", name = "dh", descriptor = "[I")
    private int[] field374 = new int[50];

    @OriginalMember(owner = "client", name = "jh", descriptor = "[I")
    private int[] field380 = new int[7];

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field381 = 2048;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field382 = 2047;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[LQVUHZTUC;")
    private class48[] field383 = new class48[this.field381];

    @OriginalMember(owner = "client", name = "oh", descriptor = "[I")
    public int[] field385 = new int[this.field381];

    @OriginalMember(owner = "client", name = "qh", descriptor = "[I")
    private int[] field387 = new int[this.field381];

    @OriginalMember(owner = "client", name = "rh", descriptor = "[LBJPWOXRJ;")
    private class3[] field388 = new class3[this.field381];

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field390 = 1;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[B")
    private byte[] field397 = new byte[16384];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[I")
    private int[] field398 = new int[100];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[Ljava/lang/String;")
    private String[] field399 = new String[100];

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[Ljava/lang/String;")
    private String[] field400 = new String[100];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field401 = 8;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "[[[I")
    private int[][][] field402 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    private int[] field403 = new int[class46.field1391];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field404 = -1;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[LTKCVVLIT;")
    private class57[] field406 = new class57[2];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Z")
    private boolean field408 = false;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[I")
    private int[] field414 = new int[4000];

    @OriginalMember(owner = "client", name = "Sh", descriptor = "[I")
    private int[] field415 = new int[4000];

    @OriginalMember(owner = "client", name = "Th", descriptor = "B")
    private byte field416 = -116;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "B")
    private byte field418 = 0;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field419 = 78;

    @OriginalMember(owner = "client", name = "fi", descriptor = "Z")
    private boolean field428 = true;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Ljava/lang/String;")
    private String field436 = "";

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field443 = -1;

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    private int[] field446 = new int[1000];

    @OriginalMember(owner = "client", name = "yi", descriptor = "[I")
    private int[] field447 = new int[1000];

    @OriginalMember(owner = "client", name = "zi", descriptor = "[[I")
    private int[][] field448 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field449 = 9;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field450 = 3;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    private int[] field451 = new int[5];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Ljava/lang/String;")
    private String field459 = "";

    @OriginalMember(owner = "client", name = "Li", descriptor = "[LYZDAHXEQ;")
    private class70[] field460 = new class70[100];

    @OriginalMember(owner = "client", name = "Mi", descriptor = "B")
    private byte field461 = 1;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "B")
    private byte field462 = 3;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Ljava/lang/String;")
    private String field467 = "";

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Ljava/lang/String;")
    private String field468 = "";

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field469 = -1;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Z")
    public boolean field473 = false;

    @OriginalMember(owner = "client", name = "aj", descriptor = "B")
    private byte field475 = 48;

    @OriginalMember(owner = "client", name = "bj", descriptor = "[I")
    private int[] field476 = new int[class46.field1391];

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field477 = -1;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field478 = new CRC32();

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field481 = 2;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Z")
    private boolean field482 = true;

    @OriginalMember(owner = "client", name = "ij", descriptor = "B")
    private byte field483 = -5;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field484 = 7759444;

    @OriginalMember(owner = "client", name = "nj", descriptor = "[I")
    private int[] field488 = new int[50];

    @OriginalMember(owner = "client", name = "oj", descriptor = "Ljava/lang/String;")
    private String field489 = "";

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field491 = -1;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field492 = -1;

    @OriginalMember(owner = "client", name = "tj", descriptor = "[Ljava/lang/String;")
    private String[] field494 = new String[5];

    @OriginalMember(owner = "client", name = "uj", descriptor = "[Z")
    private boolean[] field495 = new boolean[5];

    @OriginalMember(owner = "client", name = "zj", descriptor = "[I")
    private int[] field500 = new int[500];

    @OriginalMember(owner = "client", name = "Aj", descriptor = "[I")
    private int[] field501 = new int[500];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "[I")
    private int[] field502 = new int[500];

    @OriginalMember(owner = "client", name = "Cj", descriptor = "[I")
    private int[] field503 = new int[500];

    @OriginalMember(owner = "client", name = "Dj", descriptor = "LRGZIHLRP;")
    private class50 field504 = new class50(field137);

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field505 = -1;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "Z")
    private boolean field506 = true;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "Z")
    private boolean field507 = false;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[LYZDAHXEQ;")
    private class70[] field509 = new class70[20];

    @OriginalMember(owner = "client", name = "Nj", descriptor = "Z")
    private boolean field514 = false;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "Z")
    private boolean field515 = false;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "Z")
    private boolean field521 = false;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private static int field111 = 5;

    @OriginalMember(owner = "client", name = "pc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field127 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "sc", descriptor = "Ljava/lang/String;")
    private static String field130 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "uc", descriptor = "[[I")
    public static final int[][] field132 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private static int field137 = 3;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[I")
    public static int[] field156 = new int[32];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[I")
    private static int[] field252;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private static int field289;

    @OriginalMember(owner = "client", name = "hh", descriptor = "Z")
    private static boolean field378;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private static int field393;

    @OriginalMember(owner = "client", name = "yh", descriptor = "Z")
    private static boolean field395;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[I")
    public static final int[] field458;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field508;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "B")
    private static byte field510;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private static int field105;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private static int field118;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private static int field129;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private static int field158;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private static int field168;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private static int field251;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private static int field254;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private static int field266;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private static int field327;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private static int field373;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private static int field405;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private static int field420;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private static int field474;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private static int field490;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private static int field511;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "Vj", descriptor = "I")
    private static int field522;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field57;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field58;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private static int field69;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private static int field79;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field81;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field85;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private static int field88;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field93;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client", name = "hf", descriptor = "J")
    private long field275;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "J")
    private long field366;

    @OriginalMember(owner = "client", name = "yj", descriptor = "J")
    public long field499;

    @OriginalMember(owner = "client", name = "V", descriptor = "J")
    private long field55;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "J")
    private long field91;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "LFMTLAPCJ;")
    private class11 field87;

    @OriginalMember(owner = "client", name = "Le", descriptor = "LHFOJZUJK;")
    private class17 field253;

    @OriginalMember(owner = "client", name = "Md", descriptor = "LJHRYTWFZ;")
    private class25 field202;

    @OriginalMember(owner = "client", name = "mj", descriptor = "LMNPBQFWE;")
    private class37 field487;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "LNEJZODYM;")
    private class39 field409;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "LNEJZODYM;")
    private class39 field410;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "LNEJZODYM;")
    private class39 field411;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "LNEJZODYM;")
    private class39 field412;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "LPTSFQSMJ;")
    public class45 field472;

    @OriginalMember(owner = "client", name = "vi", descriptor = "LQVUHZTUC;")
    public static class48 field444;

    @OriginalMember(owner = "client", name = "ac", descriptor = "LTKCVVLIT;")
    private class57 field112;

    @OriginalMember(owner = "client", name = "bc", descriptor = "LTKCVVLIT;")
    private class57 field113;

    @OriginalMember(owner = "client", name = "cc", descriptor = "LTKCVVLIT;")
    private class57 field114;

    @OriginalMember(owner = "client", name = "xc", descriptor = "LTKCVVLIT;")
    private class57 field135;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LTKCVVLIT;")
    private class57 field136;

    @OriginalMember(owner = "client", name = "ge", descriptor = "LTKCVVLIT;")
    private class57 field222;

    @OriginalMember(owner = "client", name = "he", descriptor = "LTKCVVLIT;")
    private class57 field223;

    @OriginalMember(owner = "client", name = "ie", descriptor = "LTKCVVLIT;")
    private class57 field224;

    @OriginalMember(owner = "client", name = "je", descriptor = "LTKCVVLIT;")
    private class57 field225;

    @OriginalMember(owner = "client", name = "ke", descriptor = "LTKCVVLIT;")
    private class57 field226;

    @OriginalMember(owner = "client", name = "He", descriptor = "LTKCVVLIT;")
    private class57 field249;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "LTKCVVLIT;")
    private class57 field250;

    @OriginalMember(owner = "client", name = "kg", descriptor = "LTKCVVLIT;")
    private class57 field329;

    @OriginalMember(owner = "client", name = "lg", descriptor = "LTKCVVLIT;")
    private class57 field330;

    @OriginalMember(owner = "client", name = "mg", descriptor = "LTKCVVLIT;")
    private class57 field331;

    @OriginalMember(owner = "client", name = "ng", descriptor = "LTKCVVLIT;")
    private class57 field332;

    @OriginalMember(owner = "client", name = "og", descriptor = "LTKCVVLIT;")
    private class57 field333;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "LTKCVVLIT;")
    private class57 field362;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "LTKCVVLIT;")
    private class57 field363;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "LTKCVVLIT;")
    private class57 field364;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "LYOIXICCU;")
    private class68 field139;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LYOIXICCU;")
    private class68 field140;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "LYOIXICCU;")
    private class68 field141;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "LYOIXICCU;")
    private class68 field142;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "LYOIXICCU;")
    private class68 field143;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "LYOIXICCU;")
    private class68 field144;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "LYOIXICCU;")
    private class68 field145;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "LYOIXICCU;")
    private class68 field146;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "LYOIXICCU;")
    private class68 field147;

    @OriginalMember(owner = "client", name = "ze", descriptor = "LYOIXICCU;")
    private class68 field241;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "LYOIXICCU;")
    private class68 field242;

    @OriginalMember(owner = "client", name = "Be", descriptor = "LYOIXICCU;")
    private class68 field243;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "LYOIXICCU;")
    private class68 field244;

    @OriginalMember(owner = "client", name = "tg", descriptor = "LYOIXICCU;")
    private class68 field338;

    @OriginalMember(owner = "client", name = "ug", descriptor = "LYOIXICCU;")
    private class68 field339;

    @OriginalMember(owner = "client", name = "vg", descriptor = "LYOIXICCU;")
    private class68 field340;

    @OriginalMember(owner = "client", name = "wg", descriptor = "LYOIXICCU;")
    private class68 field341;

    @OriginalMember(owner = "client", name = "xg", descriptor = "LYOIXICCU;")
    private class68 field342;

    @OriginalMember(owner = "client", name = "yg", descriptor = "LYOIXICCU;")
    private class68 field343;

    @OriginalMember(owner = "client", name = "zg", descriptor = "LYOIXICCU;")
    private class68 field344;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "LYOIXICCU;")
    private class68 field345;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "LYOIXICCU;")
    private class68 field346;

    @OriginalMember(owner = "client", name = "eh", descriptor = "LYOIXICCU;")
    private class68 field375;

    @OriginalMember(owner = "client", name = "fh", descriptor = "LYOIXICCU;")
    private class68 field376;

    @OriginalMember(owner = "client", name = "gh", descriptor = "LYOIXICCU;")
    private class68 field377;

    @OriginalMember(owner = "client", name = "rd", descriptor = "LYZDAHXEQ;")
    private class70 field181;

    @OriginalMember(owner = "client", name = "sd", descriptor = "LYZDAHXEQ;")
    private class70 field182;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "LYZDAHXEQ;")
    private class70 field203;

    @OriginalMember(owner = "client", name = "Od", descriptor = "LYZDAHXEQ;")
    private class70 field204;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "LYZDAHXEQ;")
    private class70 field304;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "LYZDAHXEQ;")
    private class70 field305;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "LYZDAHXEQ;")
    private class70 field306;

    @OriginalMember(owner = "client", name = "Of", descriptor = "LYZDAHXEQ;")
    private class70 field307;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "LYZDAHXEQ;")
    private class70 field308;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "LYZDAHXEQ;")
    private class70 field370;

    @OriginalMember(owner = "client", name = "ah", descriptor = "LYZDAHXEQ;")
    private class70 field371;

    @OriginalMember(owner = "client", name = "ih", descriptor = "LYZDAHXEQ;")
    private class70 field379;

    @OriginalMember(owner = "client", name = "ki", descriptor = "LYZDAHXEQ;")
    private class70 field433;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "LYZDAHXEQ;")
    private class70 field470;

    @OriginalMember(owner = "client", name = "dd", descriptor = "LFHVZVKRA;")
    private class9 field167;

    @OriginalMember(owner = "client", name = "od", descriptor = "Ljava/lang/String;")
    public String field178;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "Ljava/lang/String;")
    private String field365;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Ljava/lang/String;")
    private String field417;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "Ljava/lang/String;")
    public String field520;

    @OriginalMember(owner = "client", name = "rb", descriptor = "Ljava/net/Socket;")
    private Socket field77;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Z")
    public static boolean field123;

    @OriginalMember(owner = "client", name = "df", descriptor = "Z")
    private static boolean field271;

    @OriginalMember(owner = "client", name = "zh", descriptor = "Z")
    private static boolean field396;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Z")
    public static boolean field421;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "Z")
    public static boolean field523;

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field169;

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field170;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[I")
    private int[] field285;

    @OriginalMember(owner = "client", name = "tf", descriptor = "[I")
    private int[] field286;

    @OriginalMember(owner = "client", name = "uf", descriptor = "[I")
    private int[] field287;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[I")
    private int[] field316;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field317;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field318;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field319;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[I")
    private int[] field358;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    private int[] field359;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "[I")
    private int[] field360;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "[I")
    private int[] field512;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "[I")
    private int[] field513;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "[LTKCVVLIT;")
    private class57[] field155;

    @OriginalMember(owner = "client", name = "N", descriptor = "[[B")
    private byte[][] field47;

    @OriginalMember(owner = "client", name = "eb", descriptor = "[[B")
    private byte[][] field64;

    @OriginalMember(owner = "client", name = "vh", descriptor = "[[[B")
    private byte[][][] field392;

    @OriginalMember(owner = "client", name = "nb", descriptor = "[[[I")
    private int[][][] field73;

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method33(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field367 >= 100) {
                this.method89("Your ignore list is full. Max of 100 hit", "", (byte) 1, 0);
            } else {
                String var4 = class44.method463((byte) -2, class44.method460(arg1, -437));
                if (arg0 == 61) {
                    for (int var5 = 0; var5 < this.field367; ++var5) {
                        if (this.field207[var5] == arg1) {
                            this.method89(var4 + " is already on your ignore list", "", (byte) 1, 0);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field200; ++var6) {
                        if (this.field274[var6] == arg1) {
                            this.method89("Please remove " + var4 + " from your friend list first", "", (byte) 1, 0);
                            return;
                        }
                    }
                    this.field207[this.field367++] = arg1;
                    this.field126 = true;
                    this.field106.method4(38, 0);
                    this.field106.method11(arg1, 5);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method34(int arg0, byte arg1) {
        if (arg1 != 5) {
            this.method146();
        }
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method35(int arg0) {
        if (arg0 != 0) {
            this.field171 = null;
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method36(boolean arg0, int arg1) {
        if (field444.field1268 >> 7 == this.field431 && field444.field1269 >> 7 == this.field432) {
            this.field431 = 0;
            ++field490;
            if (field490 > 66) {
                field490 = 0;
                this.field106.method4(248, 0);
            }
        }
        int var3 = this.field384;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class48 var5;
            int var6;
            if (arg0) {
                var5 = field444;
                var6 = this.field382 << 14;
            } else {
                var5 = this.field383[this.field385[var4]];
                var6 = this.field385[var4] << 14;
            }
            if (var5 != null && var5.method297(false)) {
                var5.field1419 = false;
                if ((field396 && this.field384 > 50 || this.field384 > 200) && !arg0 && var5.field1299 == var5.field1283) {
                    var5.field1419 = true;
                }
                int var7 = var5.field1268 >> 7;
                int var8 = var5.field1269 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1411 != null && field291 >= var5.field1425 && field291 < var5.field1426) {
                        var5.field1419 = false;
                        var5.field1428 = this.method94(var5.field1268, 938, var5.field1269, this.field128);
                        this.field253.method257(var5.field1268, -95, var5.field1412, this.field128, var5.field1415, var5.field1270, var5.field1413, 60, var5.field1428, var6, var5, var5.field1269, var5.field1414);
                    } else {
                        if ((var5.field1268 & 127) == 64 && (var5.field1269 & 127) == 64) {
                            if (this.field234[var7][var8] == this.field486) {
                                continue;
                            }
                            this.field234[var7][var8] = this.field486;
                        }
                        var5.field1428 = this.method94(var5.field1268, 938, var5.field1269, this.field128);
                        this.field253.method256(60, var5, this.field128, var6, var5.field1428, var5.field1270, var5.field1268, var5.field1269, (byte) -51, var5.field1282);
                    }
                }
            }
        }
        this.field257 += arg1;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method37(byte arg0) {
        if (arg0 != 120) {
            this.field337 = 87;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1557 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method38(int arg0) {
        int var2 = this.field349 * 128 + 64;
        int var3 = this.field350 * 128 + 64;
        int var4 = this.method94(var2, 938, var3, this.field128) - this.field351;
        if (this.field422 < var2) {
            this.field422 += (var2 - this.field422) * this.field353 / 1000 + this.field352;
            if (this.field422 > var2) {
                this.field422 = var2;
            }
        }
        if (this.field422 > var2) {
            this.field422 -= (this.field422 - var2) * this.field353 / 1000 + this.field352;
            if (this.field422 < var2) {
                this.field422 = var2;
            }
        }
        if (this.field423 < var4) {
            this.field423 += (var4 - this.field423) * this.field353 / 1000 + this.field352;
            if (this.field423 > var4) {
                this.field423 = var4;
            }
        }
        if (this.field423 > var4) {
            this.field423 -= (this.field423 - var4) * this.field353 / 1000 + this.field352;
            if (this.field423 < var4) {
                this.field423 = var4;
            }
        }
        if (this.field424 < var3) {
            this.field424 += (var3 - this.field424) * this.field353 / 1000 + this.field352;
            if (this.field424 > var3) {
                this.field424 = var3;
            }
        }
        if (this.field424 > var3) {
            this.field424 -= (this.field424 - var3) * this.field353 / 1000 + this.field352;
            if (this.field424 < var3) {
                this.field424 = var3;
            }
        }
        int var5 = this.field293 * 128 + 64;
        int var6 = this.field294 * 128 + 64;
        int var7 = this.method94(var5, 938, var6, this.field128) - this.field295;
        int var8 = var5 - this.field422;
        int var9 = var7 - this.field423;
        int var10 = var6 - this.field424;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        if (arg0 != 6) {
            this.field75 = this.field87.method203();
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field425 < var12) {
            this.field425 += (var12 - this.field425) * this.field297 / 1000 + this.field296;
            if (this.field425 > var12) {
                this.field425 = var12;
            }
        }
        if (this.field425 > var12) {
            this.field425 -= (this.field425 - var12) * this.field297 / 1000 + this.field296;
            if (this.field425 < var12) {
                this.field425 = var12;
            }
        }
        int var14 = var13 - this.field426;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field426 += this.field297 * var14 / 1000 + this.field296;
            this.field426 &= 2047;
        }
        if (var14 < 0) {
            this.field426 -= -var14 * this.field297 / 1000 + this.field296;
            this.field426 &= 2047;
        }
        int var15 = var13 - this.field426;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field426 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method39(int arg0) {
        try {
            this.field505 = -1;
            this.field322.method475();
            this.field119.method475();
            class12.method209(this.field227);
            this.method147(0);
            this.field253.method245((byte) -22);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field46[var2].method299((byte) 71);
            }
            System.gc();
            class54 var3 = new class54(this.field392, 7, 104, this.field73, 104);
            int var4 = this.field47.length;
            class54.field1525 = class17.field775;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field358[var5] >> 8;
                int var7 = this.field358[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    class54.field1525 = false;
                }
            }
            if (class54.field1525) {
                this.field253.method246(this.field128, (byte) -109);
            } else {
                this.field253.method246(0, (byte) -109);
            }
            this.field106.method4(21, 0);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field358[var8] >> 8) * 64 - this.field310;
                int var10 = (this.field358[var8] & 255) * 64 - this.field311;
                byte[] var11 = this.field47[var8];
                if (var11 != null) {
                    var3.method503((this.field263 - 6) * 8, var11, (this.field264 - 6) * 8, true, var9, var10);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field358[var12] >> 8) * 64 - this.field310;
                int var14 = (this.field358[var12] & 255) * 64 - this.field311;
                byte[] var15 = this.field47[var12];
                if (var15 == null && this.field264 < 800) {
                    var3.method507(var14, 64, 64, var13, true);
                }
            }
            this.field106.method4(21, 0);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field64[var16];
                if (var17 != null) {
                    int var18 = (this.field358[var16] >> 8) * 64 - this.field310;
                    int var19 = (this.field358[var16] & 255) * 64 - this.field311;
                    var3.method496(var19, var17, var18, -753, this.field46, this.field253);
                }
            }
            this.field106.method4(21, 0);
            var3.method506(this.field253, 3, this.field46);
            this.field243.method545(16595);
            this.field106.method4(21, 0);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method42(var20, var21);
                }
            }
            this.method130(false);
        } catch (Exception var35) {
        }
        class32.field1122.method317();
        if (field396 && signlink.cache_dat != null) {
            int var23 = this.field167.method186(0, field510);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field167.method185(6, var24);
                if ((var25 & 121) == 0) {
                    class26.method327(556, var24);
                }
            }
        }
        System.gc();
        class12.method210(20, false);
        this.field167.method195(-31725);
        int var26 = (this.field263 - 6) / 8 - 1;
        int var27 = (this.field263 + 6) / 8 + 1;
        int var28 = (this.field264 - 6) / 8 - 1;
        int var29 = (this.field264 + 6) / 8 + 1;
        int var30 = 68 / arg0;
        if (this.field277) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var31 = var26; var31 <= var27; ++var31) {
            for (int var32 = var28; var32 <= var29; ++var32) {
                if (var26 == var31 || var27 == var31 || var28 == var32 || var29 == var32) {
                    int var33 = this.field167.method202(var31, -900, var32, 0);
                    if (var33 != -1) {
                        this.field167.method183(var33, true, 3);
                    }
                    int var34 = this.field167.method202(var31, -900, var32, 1);
                    if (var34 != -1) {
                        this.field167.method183(var34, true, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BB)Z")
    public final boolean method40(int arg0, byte[] arg1, byte arg2) {
        if (this.field418 == arg2) {
            boolean var4 = false;
        } else {
            field137 = 123;
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method41(String arg0, int arg1) {
        if (arg1 != -17594) {
            this.field265 = !this.field265;
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field200; ++var3) {
                if (arg0.equalsIgnoreCase(this.field154[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field444.field1406);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method42(int arg0, int arg1) {
        class50 var3 = this.field171[this.field128][arg0][arg1];
        if (var3 == null) {
            this.field253.method266(this.field128, arg0, arg1);
        } else {
            int var4 = -99999999;
            class69 var5 = null;
            for (class69 var6 = (class69) var3.method471(); var6 != null; var6 = (class69) var3.method473((byte) 2)) {
                class33 var11 = class33.method409(var6.field1683);
                int var12 = var11.field1139;
                if (var11.field1182) {
                    var12 = (var6.field1684 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method469(-459, var5);
            class69 var7 = null;
            class69 var8 = null;
            for (class69 var9 = (class69) var3.method471(); var9 != null; var9 = (class69) var3.method473((byte) 2)) {
                if (var5.field1683 != var9.field1683 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1683 != var9.field1683 && var7.field1683 != var9.field1683 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field253.method252(arg1, var10, arg0, var7, var8, var5, this.method94(arg0 * 128 + 64, 938, arg1 * 128 + 64, this.field128), this.field128, 39251);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILRRZTMHXJ;BI)V")
    public final void method43(int arg0, int arg1, class52 arg2, byte arg3, int arg4) {
        if (this.field483 != arg3) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (this.field273 < 400) {
            if (arg2.field1464 != null) {
                arg2 = arg2.method487(this.field160);
            }
            if (arg2 != null) {
                String var7 = arg2.field1467;
                if (arg2.field1473 != 0) {
                    var7 = var7 + method161(this.field416, arg2.field1473, field444.field1424) + " (level-" + arg2.field1473 + ")";
                }
                if (this.field516 == 1) {
                    this.field262[this.field273] = "Use " + this.field520 + " with @yel@" + var7;
                    this.field502[this.field273] = 231;
                    this.field503[this.field273] = arg0;
                    this.field500[this.field273] = arg4;
                    this.field501[this.field273] = arg1;
                    ++this.field273;
                } else {
                    if (this.field175 == 1) {
                        if ((this.field177 & 2) == 2) {
                            this.field262[this.field273] = this.field178 + " @yel@" + var7;
                            this.field502[this.field273] = 480;
                            this.field503[this.field273] = arg0;
                            this.field500[this.field273] = arg4;
                            this.field501[this.field273] = arg1;
                            ++this.field273;
                            return;
                        }
                    } else {
                        if (arg2.field1465 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg2.field1465[var8] != null && !arg2.field1465[var8].equalsIgnoreCase("attack")) {
                                    this.field262[this.field273] = arg2.field1465[var8] + " @yel@" + var7;
                                    if (var8 == 0) {
                                        this.field502[this.field273] = 101;
                                    }
                                    if (var8 == 1) {
                                        this.field502[this.field273] = 458;
                                    }
                                    if (var8 == 2) {
                                        this.field502[this.field273] = 766;
                                    }
                                    if (var8 == 3) {
                                        this.field502[this.field273] = 595;
                                    }
                                    if (var8 == 4) {
                                        this.field502[this.field273] = 687;
                                    }
                                    this.field503[this.field273] = arg0;
                                    this.field500[this.field273] = arg4;
                                    this.field501[this.field273] = arg1;
                                    ++this.field273;
                                }
                            }
                        }
                        if (arg2.field1465 != null) {
                            for (int var9 = 4; var9 >= 0; --var9) {
                                if (arg2.field1465[var9] != null && arg2.field1465[var9].equalsIgnoreCase("attack")) {
                                    short var10 = 0;
                                    if (arg2.field1473 > field444.field1424) {
                                        var10 = 2000;
                                    }
                                    this.field262[this.field273] = arg2.field1465[var9] + " @yel@" + var7;
                                    if (var9 == 0) {
                                        this.field502[this.field273] = var10 + 101;
                                    }
                                    if (var9 == 1) {
                                        this.field502[this.field273] = var10 + 458;
                                    }
                                    if (var9 == 2) {
                                        this.field502[this.field273] = var10 + 766;
                                    }
                                    if (var9 == 3) {
                                        this.field502[this.field273] = var10 + 595;
                                    }
                                    if (var9 == 4) {
                                        this.field502[this.field273] = var10 + 687;
                                    }
                                    this.field503[this.field273] = arg0;
                                    this.field500[this.field273] = arg4;
                                    this.field501[this.field273] = arg1;
                                    ++this.field273;
                                }
                            }
                        }
                        this.field262[this.field273] = "Examine @yel@" + var7;
                        this.field502[this.field273] = 1195;
                        this.field503[this.field273] = arg0;
                        this.field500[this.field273] = arg4;
                        this.field501[this.field273] = arg1;
                        ++this.field273;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method44(String arg0) throws IOException {
        if (!this.field278) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field77 != null) {
                try {
                    this.field77.close();
                } catch (Exception var4) {
                }
                this.field77 = null;
            }
            this.field77 = this.method129(43595);
            this.field77.setSoTimeout(10000);
            InputStream var2 = this.field77.getInputStream();
            OutputStream var3 = this.field77.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method45(byte arg0) {
        if (this.field273 >= 2 || this.field516 != 0 || this.field175 != 0) {
            String var2;
            if (this.field516 == 1 && this.field273 < 2) {
                var2 = "Use " + this.field520 + " with...";
            } else if (this.field175 == 1 && this.field273 < 2) {
                var2 = this.field178 + "...";
            } else {
                var2 = this.field262[this.field273 - 1];
            }
            if (this.field273 > 2) {
                var2 = var2 + "@whi@ / " + (this.field273 - 2) + " more options";
            }
            this.field411.method441(true, field291 / 1000, var2, 0, 15, 4, 16777215);
            if (arg0 != 50) {
                this.field125 = -273;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        this.field135 = new class57(this.field487, "titlebox", 0);
        this.field136 = new class57(this.field487, "titlebutton", 0);
        this.field155 = new class57[12];
        if (!arg0) {
            this.field258 = -1;
        }
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field155[var3] = new class57(this.field487, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field155[var4] = new class57(this.field487, "runes", (var4 & 3) + 12);
            }
        }
        this.field181 = new class70(128, 265);
        this.field182 = new class70(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field181.field1693[var5] = this.field142.field1676[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field182.field1693[var6] = this.field143.field1676[var6];
        }
        this.field317 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field317[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field317[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field317[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field317[var10 + 192] = 16777215;
        }
        this.field318 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field318[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field318[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field318[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field318[var14 + 192] = 16777215;
        }
        this.field319 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field319[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field319[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field319[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field319[var18 + 192] = 16777215;
        }
        this.field316 = new int[256];
        this.field169 = new int[32768];
        this.field170 = new int[32768];
        this.method92((byte) 9, (class57) null);
        this.field512 = new int[32768];
        this.field513 = new int[32768];
        this.method166("Connecting to fileserver", 10, -799);
        if (!this.field120) {
            this.field356 = true;
            this.field120 = true;
            this.method115(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method47(int arg0) {
        for (int var2 = -1; var2 < this.field384; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field382;
            } else {
                var7 = this.field385[var2];
            }
            class48 var8 = this.field383[var7];
            if (var8 != null && var8.field1297 > 0) {
                --var8.field1297;
                if (var8.field1297 == 0) {
                    var8.field1255 = null;
                }
            }
        }
        while (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        for (int var3 = 0; var3 < this.field150; ++var3) {
            int var4 = this.field151[var3];
            class18 var5 = this.field149[var4];
            if (var5 != null && var5.field1297 > 0) {
                --var5.field1297;
                if (var5.field1297 == 0) {
                    var5.field1255 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method48(int arg0) {
        if (arg0 != 3) {
            this.field106.method5(22);
        }
        this.field408 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method49(byte arg0, int arg1) {
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            this.field106.method5(70);
        }
        if (arg1 >= 0) {
            if (this.field256) {
                this.field256 = false;
                this.field159 = true;
            }
            int var4 = this.field500[arg1];
            int var5 = this.field501[arg1];
            int var6 = this.field502[arg1];
            int var7 = this.field503[arg1];
            if (var6 >= 2000) {
                var6 -= 2000;
            }
            if (var6 == 927 || var6 == 266 || var6 == 361 || var6 == 801) {
                String var8 = this.field262[arg1];
                int var9 = var8.indexOf("@whi@");
                if (var9 != -1) {
                    long var10 = class44.method459(var8.substring(var9 + 5).trim());
                    if (var6 == 927) {
                        this.method51(var10, this.field482);
                    }
                    if (var6 == 266) {
                        this.method33((byte) 61, var10);
                    }
                    if (var6 == 361) {
                        this.method133(var10, this.field369);
                    }
                    if (var6 == 801) {
                        this.method72(var10, -46474);
                    }
                }
            }
            if (var6 == 149) {
                class48 var12 = this.field383[var7];
                if (var12 != null) {
                    this.method138(field444.field1277[0], field444.field1276[0], 0, var12.field1276[0], 1, 303, 0, false, 1, var12.field1277[0], 0, 2);
                    this.field196 = super.field1569;
                    this.field197 = super.field1570;
                    this.field199 = 2;
                    this.field198 = 0;
                    this.field106.method4(101, 0);
                    this.field106.method6(var7);
                }
            }
            if (var6 == 109) {
                boolean var13 = this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 0, 303, 0, false, 0, var5, 0, 2);
                if (!var13) {
                    this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 1, 303, 0, false, 1, var5, 0, 2);
                }
                this.field196 = super.field1569;
                this.field197 = super.field1570;
                this.field199 = 2;
                this.field198 = 0;
                this.field106.method4(105, 0);
                this.field106.method6(this.field310 + var4);
                this.field106.method6(this.field311 + var5);
                this.field106.method6(var7);
                this.field106.method6(this.field519);
                this.field106.method6(this.field517);
                this.field106.method6(this.field518);
            }
            if (var6 == 595) {
                class18 var15 = this.field149[var7];
                if (var15 != null) {
                    this.method138(field444.field1277[0], field444.field1276[0], 0, var15.field1276[0], 1, 303, 0, false, 1, var15.field1277[0], 0, 2);
                    this.field196 = super.field1569;
                    this.field197 = super.field1570;
                    this.field199 = 2;
                    this.field198 = 0;
                    field420 += var7;
                    if (field420 >= 64) {
                        this.field106.method4(125, 0);
                        field420 = 0;
                    }
                    this.field106.method4(237, 0);
                    this.field106.method6(var7);
                }
            }
            if (var6 == 907) {
                this.field106.method4(114, 0);
                this.field106.method6(var5);
                class8 var16 = class8.field574[var5];
                if (var16.field548 != null && var16.field548[0][0] == 5) {
                    int var17 = var16.field548[0][1];
                    this.field59[var17] = 1 - this.field59[var17];
                    this.method62(this.field48, var17);
                    this.field126 = true;
                }
            }
            if (var6 == 848) {
                boolean var18 = this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 0, 303, 0, false, 0, var5, 0, 2);
                if (!var18) {
                    this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 1, 303, 0, false, 1, var5, 0, 2);
                }
                this.field196 = super.field1569;
                this.field197 = super.field1570;
                this.field199 = 2;
                this.field198 = 0;
                this.field106.method4(62, 0);
                this.field106.method6(this.field310 + var4);
                this.field106.method6(this.field311 + var5);
                this.field106.method6(var7);
            }
            if (var6 == 934) {
                if ((var4 & 3) == 0) {
                    ++field511;
                }
                if (field511 >= 139) {
                    this.field106.method4(22, 0);
                    this.field106.method6(41053);
                    field511 = 0;
                }
                this.field106.method4(52, 0);
                this.field106.method6(var7);
                this.field106.method6(var4);
                this.field106.method6(var5);
                this.field323 = 0;
                this.field324 = var5;
                this.field325 = var4;
                this.field326 = 2;
                if (class8.field574[var5].field584 == this.field68) {
                    this.field326 = 1;
                }
                if (class8.field574[var5].field584 == this.field443) {
                    this.field326 = 3;
                }
            }
            if (var6 == 472) {
                this.field106.method4(209, 0);
                this.field106.method6(var7);
                this.field106.method6(var4);
                this.field106.method6(var5);
                this.field323 = 0;
                this.field324 = var5;
                this.field325 = var4;
                this.field326 = 2;
                if (class8.field574[var5].field584 == this.field68) {
                    this.field326 = 1;
                }
                if (class8.field574[var5].field584 == this.field443) {
                    this.field326 = 3;
                }
            }
            if (var6 == 502) {
                this.field106.method4(173, 0);
                this.field106.method6(var7);
                this.field106.method6(var4);
                this.field106.method6(var5);
                this.field323 = 0;
                this.field324 = var5;
                this.field325 = var4;
                this.field326 = 2;
                if (class8.field574[var5].field584 == this.field68) {
                    this.field326 = 1;
                }
                if (class8.field574[var5].field584 == this.field443) {
                    this.field326 = 3;
                }
            }
            if (var6 == 762) {
                if (!this.field117) {
                    this.field253.method283(super.field1569 - 4, super.field1570 - 4, 0);
                } else {
                    this.field253.method283(var4 - 4, var5 - 4, 0);
                }
            }
            if (var6 == 505 && this.method106(var5, var4, -6818, var7)) {
                this.field106.method4(220, 0);
                this.field106.method6(this.field310 + var4);
                this.field106.method6(this.field311 + var5);
                this.field106.method6(var7 >> 14 & 32767);
                this.field106.method6(this.field176);
            }
            if (var6 == 114) {
                class48 var20 = this.field383[var7];
                if (var20 != null) {
                    this.method138(field444.field1277[0], field444.field1276[0], 0, var20.field1276[0], 1, 303, 0, false, 1, var20.field1277[0], 0, 2);
                    this.field196 = super.field1569;
                    this.field197 = super.field1570;
                    this.field199 = 2;
                    this.field198 = 0;
                    this.field106.method4(111, 0);
                    this.field106.method6(var7);
                }
            }
            if (var6 == 233) {
                class8 var21 = class8.field574[var5];
                this.field175 = 1;
                this.field176 = var5;
                this.field177 = var21.field598;
                this.field516 = 0;
                this.field126 = true;
                String var22 = var21.field552;
                if (var22.indexOf(" ") != -1) {
                    var22 = var22.substring(0, var22.indexOf(" "));
                }
                String var23 = var21.field552;
                if (var23.indexOf(" ") != -1) {
                    var23 = var23.substring(var23.indexOf(" ") + 1);
                }
                this.field178 = var22 + " " + var21.field602 + " " + var23;
                if (this.field177 == 16) {
                    this.field126 = true;
                    this.field450 = 3;
                    this.field163 = true;
                }
            } else {
                if (var6 == 83 && !this.field76) {
                    this.field106.method4(100, 0);
                    this.field106.method6(var5);
                    this.field76 = true;
                }
                if (var6 == 680 && this.method106(var5, var4, -6818, var7)) {
                    this.field106.method4(67, 0);
                    this.field106.method6(this.field310 + var4);
                    this.field106.method6(this.field311 + var5);
                    this.field106.method6(var7 >> 14 & 32767);
                    this.field106.method6(this.field519);
                    this.field106.method6(this.field517);
                    this.field106.method6(this.field518);
                }
                if (var6 == 458) {
                    class18 var24 = this.field149[var7];
                    if (var24 != null) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var24.field1276[0], 1, 303, 0, false, 1, var24.field1277[0], 0, 2);
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        this.field106.method4(9, 0);
                        this.field106.method6(var7);
                    }
                }
                if (var6 == 662) {
                    this.field106.method4(81, 0);
                    this.field106.method6(var7);
                    this.field106.method6(var4);
                    this.field106.method6(var5);
                    this.field106.method6(this.field176);
                    this.field323 = 0;
                    this.field324 = var5;
                    this.field325 = var4;
                    this.field326 = 2;
                    if (class8.field574[var5].field584 == this.field68) {
                        this.field326 = 1;
                    }
                    if (class8.field574[var5].field584 == this.field443) {
                        this.field326 = 3;
                    }
                }
                if (var6 == 1195) {
                    class18 var25 = this.field149[var7];
                    if (var25 != null) {
                        class52 var26 = var25.field841;
                        if (var26.field1464 != null) {
                            var26 = var26.method487(this.field160);
                        }
                        if (var26 != null) {
                            String var27;
                            if (var26.field1490 != null) {
                                var27 = new String(var26.field1490);
                            } else {
                                var27 = "It's a " + var26.field1467 + ".";
                            }
                            this.method89(var27, "", (byte) 1, 0);
                        }
                    }
                }
                if (var6 == 780) {
                    this.field106.method4(102, 0);
                    this.field106.method6(var7);
                    this.field106.method6(var4);
                    this.field106.method6(var5);
                    this.field106.method6(this.field519);
                    this.field106.method6(this.field517);
                    this.field106.method6(this.field518);
                    this.field323 = 0;
                    this.field324 = var5;
                    this.field325 = var4;
                    this.field326 = 2;
                    if (class8.field574[var5].field584 == this.field68) {
                        this.field326 = 1;
                    }
                    if (class8.field574[var5].field584 == this.field443) {
                        this.field326 = 3;
                    }
                }
                if (var6 == 281) {
                    String var28 = this.field262[arg1];
                    int var29 = var28.indexOf("@whi@");
                    if (var29 != -1) {
                        long var30 = class44.method459(var28.substring(var29 + 5).trim());
                        int var32 = -1;
                        for (int var33 = 0; var33 < this.field200; ++var33) {
                            if (this.field274[var33] == var30) {
                                var32 = var33;
                                break;
                            }
                        }
                        if (var32 != -1 && this.field309[var32] > 0) {
                            this.field159 = true;
                            this.field256 = false;
                            this.field52 = true;
                            this.field172 = "";
                            this.field320 = 3;
                            this.field275 = this.field274[var32];
                            this.field489 = "Enter message to send to " + this.field154[var32];
                        }
                    }
                }
                if (var6 == 902) {
                    class48 var34 = this.field383[var7];
                    if (var34 != null) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var34.field1276[0], 1, 303, 0, false, 1, var34.field1277[0], 0, 2);
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        this.field106.method4(230, 0);
                        this.field106.method6(var7);
                    }
                }
                if (var6 == 766) {
                    class18 var35 = this.field149[var7];
                    if (var35 != null) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var35.field1276[0], 1, 303, 0, false, 1, var35.field1277[0], 0, 2);
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        if ((var7 & 3) == 0) {
                            ++field327;
                        }
                        if (field327 >= 99) {
                            this.field106.method4(253, 0);
                            this.field106.method8(1855977);
                            field327 = 0;
                        }
                        this.field106.method4(185, 0);
                        this.field106.method6(var7);
                    }
                }
                if (var6 == 86) {
                    this.field106.method4(68, 0);
                    this.field106.method6(var7);
                    this.field106.method6(var4);
                    this.field106.method6(var5);
                    this.field323 = 0;
                    this.field324 = var5;
                    this.field325 = var4;
                    this.field326 = 2;
                    if (class8.field574[var5].field584 == this.field68) {
                        this.field326 = 1;
                    }
                    if (class8.field574[var5].field584 == this.field443) {
                        this.field326 = 3;
                    }
                }
                if (var6 == 1515) {
                    class33 var36 = class33.method409(var7);
                    String var37;
                    if (var36.field1137 != null) {
                        var37 = new String(var36.field1137);
                    } else {
                        var37 = "It's a " + var36.field1156 + ".";
                    }
                    this.method89(var37, "", (byte) 1, 0);
                }
                if (var6 == 454) {
                    boolean var38 = this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 0, 303, 0, false, 0, var5, 0, 2);
                    if (!var38) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 1, 303, 0, false, 1, var5, 0, 2);
                    }
                    this.field196 = super.field1569;
                    this.field197 = super.field1570;
                    this.field199 = 2;
                    this.field198 = 0;
                    this.field106.method4(159, 0);
                    this.field106.method6(this.field310 + var4);
                    this.field106.method6(this.field311 + var5);
                    this.field106.method6(var7);
                }
                if (var6 == 628) {
                    this.field106.method4(199, 0);
                    this.field106.method6(var7);
                    this.field106.method6(var4);
                    this.field106.method6(var5);
                    this.field323 = 0;
                    this.field324 = var5;
                    this.field325 = var4;
                    this.field326 = 2;
                    if (class8.field574[var5].field584 == this.field68) {
                        this.field326 = 1;
                    }
                    if (class8.field574[var5].field584 == this.field443) {
                        this.field326 = 3;
                    }
                }
                if (var6 == 512) {
                    boolean var40 = this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 0, 303, 0, false, 0, var5, 0, 2);
                    if (!var40) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 1, 303, 0, false, 1, var5, 0, 2);
                    }
                    this.field196 = super.field1569;
                    this.field197 = super.field1570;
                    this.field199 = 2;
                    this.field198 = 0;
                    ++field129;
                    if (field129 >= 119) {
                        this.field106.method4(48, 0);
                        this.field106.method9(0);
                        field129 = 0;
                    }
                    this.field106.method4(214, 0);
                    this.field106.method6(this.field310 + var4);
                    this.field106.method6(this.field311 + var5);
                    this.field106.method6(var7);
                }
                if (var6 == 1918) {
                    class33 var42 = class33.method409(var7);
                    class8 var43 = class8.field574[var5];
                    String var44;
                    if (var43 != null && var43.field585[var4] >= 100000) {
                        var44 = var43.field585[var4] + " x " + var42.field1156;
                    } else if (var42.field1137 != null) {
                        var44 = new String(var42.field1137);
                    } else {
                        var44 = "It's a " + var42.field1156 + ".";
                    }
                    this.method89(var44, "", (byte) 1, 0);
                }
                if (var6 == 803) {
                    String var45 = this.field262[arg1];
                    int var46 = var45.indexOf("@whi@");
                    if (var46 != -1) {
                        if (this.field68 == -1) {
                            this.method98(4);
                            this.field459 = var45.substring(var46 + 5).trim();
                            this.field368 = false;
                            for (int var47 = 0; var47 < class8.field574.length; ++var47) {
                                if (class8.field574[var47] != null && class8.field574[var47].field609 == 600) {
                                    this.field49 = this.field68 = class8.field574[var47].field584;
                                    break;
                                }
                            }
                        } else {
                            this.method89("Please close the interface you have open before using 'report abuse'", "", (byte) 1, 0);
                        }
                    }
                }
                if (var6 == 480) {
                    class18 var48 = this.field149[var7];
                    if (var48 != null) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var48.field1276[0], 1, 303, 0, false, 1, var48.field1277[0], 0, 2);
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        this.field106.method4(174, 0);
                        this.field106.method6(var7);
                        this.field106.method6(this.field176);
                    }
                }
                if (var6 == 760) {
                    class8 var49 = class8.field574[var5];
                    boolean var50 = true;
                    if (var49.field609 > 0) {
                        var50 = this.method168(0, var49);
                    }
                    if (var50) {
                        this.field106.method4(114, 0);
                        this.field106.method6(var5);
                    }
                }
                if (var6 == 1132) {
                    int var51 = var7 >> 14 & 32767;
                    class32 var52 = class32.method401(var51);
                    String var53;
                    if (var52.field1113 != null) {
                        var53 = new String(var52.field1113);
                    } else {
                        var53 = "It's a " + var52.field1114 + ".";
                    }
                    this.method89(var53, "", (byte) 1, 0);
                }
                if (var6 == 511) {
                    boolean var54 = this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 0, 303, 0, false, 0, var5, 0, 2);
                    if (!var54) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 1, 303, 0, false, 1, var5, 0, 2);
                    }
                    this.field196 = super.field1569;
                    this.field197 = super.field1570;
                    this.field199 = 2;
                    this.field198 = 0;
                    this.field106.method4(53, 0);
                    this.field106.method6(this.field310 + var4);
                    this.field106.method6(this.field311 + var5);
                    this.field106.method6(var7);
                }
                if (var6 == 101) {
                    class18 var56 = this.field149[var7];
                    if (var56 != null) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var56.field1276[0], 1, 303, 0, false, 1, var56.field1277[0], 0, 2);
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        this.field106.method4(132, 0);
                        this.field106.method6(var7);
                    }
                }
                if (var6 == 615) {
                    ++field69;
                    if (field69 >= 87) {
                        this.field106.method4(219, 0);
                        field69 = 0;
                    }
                    this.field106.method4(85, 0);
                    this.field106.method6(var7);
                    this.field106.method6(var4);
                    this.field106.method6(var5);
                    this.field323 = 0;
                    this.field324 = var5;
                    this.field325 = var4;
                    this.field326 = 2;
                    if (class8.field574[var5].field584 == this.field68) {
                        this.field326 = 1;
                    }
                    if (class8.field574[var5].field584 == this.field443) {
                        this.field326 = 3;
                    }
                }
                if (var6 == 231) {
                    class18 var57 = this.field149[var7];
                    if (var57 != null) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var57.field1276[0], 1, 303, 0, false, 1, var57.field1277[0], 0, 2);
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        this.field106.method4(149, 0);
                        this.field106.method6(var7);
                        this.field106.method6(this.field519);
                        this.field106.method6(this.field517);
                        this.field106.method6(this.field518);
                    }
                }
                if (var6 == 275) {
                    this.field106.method4(191, 0);
                    this.field106.method6(var7);
                    this.field106.method6(var4);
                    this.field106.method6(var5);
                    this.field323 = 0;
                    this.field324 = var5;
                    this.field325 = var4;
                    this.field326 = 2;
                    if (class8.field574[var5].field584 == this.field68) {
                        this.field326 = 1;
                    }
                    if (class8.field574[var5].field584 == this.field443) {
                        this.field326 = 3;
                    }
                }
                if (var6 == 214) {
                    this.method98(4);
                }
                if (var6 == 381) {
                    this.field106.method4(98, 0);
                    this.field106.method6(var7);
                    this.field106.method6(var4);
                    this.field106.method6(var5);
                    this.field323 = 0;
                    this.field324 = var5;
                    this.field325 = var4;
                    this.field326 = 2;
                    if (class8.field574[var5].field584 == this.field68) {
                        this.field326 = 1;
                    }
                    if (class8.field574[var5].field584 == this.field443) {
                        this.field326 = 3;
                    }
                }
                if (var6 == 945) {
                    this.method106(var5, var4, -6818, var7);
                    this.field106.method4(108, 0);
                    this.field106.method6(this.field310 + var4);
                    this.field106.method6(this.field311 + var5);
                    this.field106.method6(var7 >> 14 & 32767);
                }
                if (var6 == 158) {
                    class48 var58 = this.field383[var7];
                    if (var58 != null) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var58.field1276[0], 1, 303, 0, false, 1, var58.field1277[0], 0, 2);
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        if ((var7 & 3) == 0) {
                            ++field118;
                        }
                        if (field118 >= 96) {
                            this.field106.method4(212, 0);
                            field118 = 0;
                        }
                        this.field106.method4(169, 0);
                        this.field106.method6(var7);
                    }
                }
                if (var6 == 222) {
                    this.field106.method4(140, 0);
                    this.field106.method6(var7);
                    this.field106.method6(var4);
                    this.field106.method6(var5);
                    this.field323 = 0;
                    this.field324 = var5;
                    this.field325 = var4;
                    this.field326 = 2;
                    if (class8.field574[var5].field584 == this.field68) {
                        this.field326 = 1;
                    }
                    if (class8.field574[var5].field584 == this.field443) {
                        this.field326 = 3;
                    }
                }
                if (var6 == 28) {
                    class48 var59 = this.field383[var7];
                    if (var59 != null) {
                        this.method138(field444.field1277[0], field444.field1276[0], 0, var59.field1276[0], 1, 303, 0, false, 1, var59.field1277[0], 0, 2);
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        this.field106.method4(106, 0);
                        this.field106.method6(var7);
                        this.field106.method6(this.field176);
                    }
                }
                if (var6 == 606) {
                    this.field516 = 1;
                    this.field517 = var4;
                    this.field518 = var5;
                    this.field519 = var7;
                    this.field520 = class33.method409(var7).field1156;
                    this.field175 = 0;
                    this.field126 = true;
                } else {
                    if (var6 == 473) {
                        this.method106(var5, var4, -6818, var7);
                        this.field106.method4(198, 0);
                        this.field106.method6(this.field310 + var4);
                        this.field106.method6(this.field311 + var5);
                        this.field106.method6(var7 >> 14 & 32767);
                    }
                    if (var6 == 147) {
                        this.method106(var5, var4, -6818, var7);
                        this.field106.method4(61, 0);
                        this.field106.method6(this.field310 + var4);
                        this.field106.method6(this.field311 + var5);
                        this.field106.method6(var7 >> 14 & 32767);
                    }
                    if (var6 == 51) {
                        boolean var60 = this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 0, 303, 0, false, 0, var5, 0, 2);
                        if (!var60) {
                            this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 1, 303, 0, false, 1, var5, 0, 2);
                        }
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        this.field106.method4(180, 0);
                        this.field106.method6(this.field310 + var4);
                        this.field106.method6(this.field311 + var5);
                        this.field106.method6(var7);
                        this.field106.method6(this.field176);
                    }
                    if (var6 == 447) {
                        this.method106(var5, var4, -6818, var7);
                        this.field106.method4(104, 0);
                        this.field106.method6(this.field310 + var4);
                        this.field106.method6(this.field311 + var5);
                        this.field106.method6(var7 >> 14 & 32767);
                    }
                    if (var6 == 687) {
                        class18 var62 = this.field149[var7];
                        if (var62 != null) {
                            this.method138(field444.field1277[0], field444.field1276[0], 0, var62.field1276[0], 1, 303, 0, false, 1, var62.field1277[0], 0, 2);
                            this.field196 = super.field1569;
                            this.field197 = super.field1570;
                            this.field199 = 2;
                            this.field198 = 0;
                            this.field106.method4(113, 0);
                            this.field106.method6(var7);
                        }
                    }
                    if (var6 == 707) {
                        this.field106.method4(114, 0);
                        this.field106.method6(var5);
                        class8 var63 = class8.field574[var5];
                        if (var63.field548 != null && var63.field548[0][0] == 5) {
                            int var64 = var63.field548[0][1];
                            if (this.field59[var64] != var63.field564[0]) {
                                this.field59[var64] = var63.field564[0];
                                this.method62(this.field48, var64);
                                this.field126 = true;
                            }
                        }
                    }
                    if (var6 == 614 || var6 == 125) {
                        String var65 = this.field262[arg1];
                        int var66 = var65.indexOf("@whi@");
                        if (var66 != -1) {
                            String var67 = var65.substring(var66 + 5).trim();
                            String var68 = class44.method463((byte) -2, class44.method460(class44.method459(var67), -437));
                            boolean var69 = false;
                            for (int var70 = 0; var70 < this.field384; ++var70) {
                                class48 var71 = this.field383[this.field385[var70]];
                                if (var71 != null && var71.field1406 != null && var71.field1406.equalsIgnoreCase(var68)) {
                                    this.method138(field444.field1277[0], field444.field1276[0], 0, var71.field1276[0], 1, 303, 0, false, 1, var71.field1277[0], 0, 2);
                                    if (var6 == 614) {
                                        this.field106.method4(230, 0);
                                        this.field106.method6(this.field385[var70]);
                                    }
                                    if (var6 == 125) {
                                        this.field106.method4(101, 0);
                                        this.field106.method6(this.field385[var70]);
                                    }
                                    var69 = true;
                                    break;
                                }
                            }
                            if (!var69) {
                                this.method89("Unable to find " + var68, "", (byte) 1, 0);
                            }
                        }
                    }
                    if (var6 == 206) {
                        class48 var72 = this.field383[var7];
                        if (var72 != null) {
                            this.method138(field444.field1277[0], field444.field1276[0], 0, var72.field1276[0], 1, 303, 0, false, 1, var72.field1277[0], 0, 2);
                            this.field196 = super.field1569;
                            this.field197 = super.field1570;
                            this.field199 = 2;
                            this.field198 = 0;
                            this.field106.method4(6, 0);
                            this.field106.method6(var7);
                            this.field106.method6(this.field519);
                            this.field106.method6(this.field517);
                            this.field106.method6(this.field518);
                        }
                    }
                    if (var6 == 741) {
                        boolean var73 = this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 0, 303, 0, false, 0, var5, 0, 2);
                        if (!var73) {
                            this.method138(field444.field1277[0], field444.field1276[0], 0, var4, 1, 303, 0, false, 1, var5, 0, 2);
                        }
                        this.field196 = super.field1569;
                        this.field197 = super.field1570;
                        this.field199 = 2;
                        this.field198 = 0;
                        this.field106.method4(96, 0);
                        this.field106.method6(this.field310 + var4);
                        this.field106.method6(this.field311 + var5);
                        this.field106.method6(var7);
                    }
                    if (var6 == 765) {
                        class48 var75 = this.field383[var7];
                        if (var75 != null) {
                            this.method138(field444.field1277[0], field444.field1276[0], 0, var75.field1276[0], 1, 303, 0, false, 1, var75.field1277[0], 0, 2);
                            this.field196 = super.field1569;
                            this.field197 = super.field1570;
                            this.field199 = 2;
                            this.field198 = 0;
                            this.field106.method4(16, 0);
                            this.field106.method6(var7);
                        }
                    }
                    if (var6 == 1521) {
                        this.method106(var5, var4, -6818, var7);
                        this.field106.method4(134, 0);
                        this.field106.method6(this.field310 + var4);
                        this.field106.method6(this.field311 + var5);
                        this.field106.method6(var7 >> 14 & 32767);
                    }
                    if (var6 == 998) {
                        this.field106.method4(2, 0);
                        this.field106.method6(var7);
                        this.field106.method6(var4);
                        this.field106.method6(var5);
                        this.field323 = 0;
                        this.field324 = var5;
                        this.field325 = var4;
                        this.field326 = 2;
                        if (class8.field574[var5].field584 == this.field68) {
                            this.field326 = 1;
                        }
                        if (class8.field574[var5].field584 == this.field443) {
                            this.field326 = 3;
                        }
                    }
                    this.field516 = 0;
                    this.field175 = 0;
                    this.field126 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIB)V")
    public final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 == 2) {
            boolean var8 = false;
        } else {
            this.field258 = this.field282.method15();
        }
        int var9 = 2048 - arg3 & 2047;
        int var10 = 2048 - arg4 & 2047;
        int var11 = 0;
        int var12 = 0;
        int var13 = arg5;
        if (var9 != 0) {
            int var14 = class26.field1011[var9];
            int var15 = class26.field1012[var9];
            int var16 = var12 * var15 - arg5 * var14 >> 16;
            var13 = var12 * var14 + arg5 * var15 >> 16;
            var12 = var16;
        }
        if (var10 != 0) {
            int var17 = class26.field1011[var10];
            int var18 = class26.field1012[var10];
            int var19 = var11 * var18 + var13 * var17 >> 16;
            var13 = var13 * var18 - var11 * var17 >> 16;
            var11 = var19;
        }
        this.field422 = arg2 - var11;
        this.field423 = arg0 - var12;
        this.field424 = arg1 - var13;
        this.field425 = arg3;
        this.field426 = arg4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method51(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field200 >= 100 && this.field434 != 1) {
                this.method89("Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 1, 0);
            } else if (this.field200 >= 200) {
                this.method89("Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 1, 0);
            } else {
                String var4 = class44.method463((byte) -2, class44.method460(arg0, -437));
                for (int var5 = 0; var5 < this.field200; ++var5) {
                    if (this.field274[var5] == arg0) {
                        this.method89(var4 + " is already on your friend list", "", (byte) 1, 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field367; ++var6) {
                    if (this.field207[var6] == arg0) {
                        this.method89("Please remove " + var4 + " from your ignore list first", "", (byte) 1, 0);
                        return;
                    }
                }
                if (!var4.equals(field444.field1406)) {
                    this.field154[this.field200] = var4;
                    this.field274[this.field200] = arg0;
                    if (!arg1) {
                        this.field171 = null;
                    }
                    this.field309[this.field200] = 0;
                    ++this.field200;
                    this.field126 = true;
                    this.field106.method4(54, 0);
                    this.field106.method11(arg0, 5);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method52(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field400[var5] != null) {
                int var6 = this.field398[var5];
                int var7 = 70 - var4 * 14 + this.field248 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field399[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field89 == 0 || this.field89 == 1 && this.method41(var8, -17594))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field444.field1406)) {
                        if (this.field465 >= 1) {
                            this.field262[this.field273] = "Report abuse @whi@" + var8;
                            this.field502[this.field273] = 803;
                            ++this.field273;
                        }
                        this.field262[this.field273] = "Add ignore @whi@" + var8;
                        this.field502[this.field273] = 266;
                        ++this.field273;
                        this.field262[this.field273] = "Add friend @whi@" + var8;
                        this.field502[this.field273] = 927;
                        ++this.field273;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field161 == 0 && (var6 == 7 || this.field303 == 0 || this.field303 == 1 && this.method41(var8, -17594))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field465 >= 1) {
                            this.field262[this.field273] = "Report abuse @whi@" + var8;
                            this.field502[this.field273] = 803;
                            ++this.field273;
                        }
                        this.field262[this.field273] = "Add ignore @whi@" + var8;
                        this.field502[this.field273] = 266;
                        ++this.field273;
                        this.field262[this.field273] = "Add friend @whi@" + var8;
                        this.field502[this.field273] = 927;
                        ++this.field273;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field107 == 0 || this.field107 == 1 && this.method41(var8, -17594))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field262[this.field273] = "Accept trade @whi@" + var8;
                        this.field502[this.field273] = 614;
                        ++this.field273;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field161 == 0 && this.field303 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field107 == 0 || this.field107 == 1 && this.method41(var8, -17594))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field262[this.field273] = "Accept challenge @whi@" + var8;
                        this.field502[this.field273] = 125;
                        ++this.field273;
                    }
                    ++var4;
                }
            }
        }
        if (arg0 >= 0) {
            this.field265 = !this.field265;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method53(byte arg0, boolean arg1) {
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            this.field67 = this.field87.method203();
        }
        for (int var4 = 0; var4 < this.field150; ++var4) {
            class18 var5 = this.field149[this.field151[var4]];
            int var6 = (this.field151[var4] << 14) + 536870912;
            if (var5 != null && var5.method297(false) && var5.field841.field1457 == arg1) {
                int var7 = var5.field1268 >> 7;
                int var8 = var5.field1269 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1262 == 1 && (var5.field1268 & 127) == 64 && (var5.field1269 & 127) == 64) {
                        if (this.field234[var7][var8] == this.field486) {
                            continue;
                        }
                        this.field234[var7][var8] = this.field486;
                    }
                    this.field253.method256((var5.field1262 - 1) * 64 + 60, var5, this.field128, var6, this.method94(var5.field1268, 938, var5.field1269, this.field128), var5.field1270, var5.field1268, var5.field1269, (byte) -51, var5.field1282);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method54(byte arg0) {
        if (arg0 == 5) {
            if (this.field78 == 0) {
                int var2 = super.field1552 / 2 - 80;
                int var3 = super.field1553 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field1568 == 1 && super.field1569 >= var2 - 75 && super.field1569 <= var2 + 75 && super.field1570 >= var14 - 20 && super.field1570 <= var14 + 20) {
                    this.field78 = 3;
                    this.field131 = 0;
                }
                int var4 = super.field1552 / 2 + 80;
                if (super.field1568 == 1 && super.field1569 >= var4 - 75 && super.field1569 <= var4 + 75 && super.field1570 >= var14 - 20 && super.field1570 <= var14 + 20) {
                    this.field467 = "";
                    this.field468 = "Enter your username & password.";
                    this.field78 = 2;
                    this.field131 = 0;
                }
            } else if (this.field78 == 2) {
                int var5 = super.field1553 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field1568 == 1 && super.field1570 >= var16 - 15 && super.field1570 < var16) {
                    this.field131 = 0;
                }
                var5 = var16 + 15;
                if (super.field1568 == 1 && super.field1570 >= var5 - 15 && super.field1570 < var5) {
                    this.field131 = 1;
                }
                var5 += 15;
                int var6 = super.field1552 / 2 - 80;
                int var7 = super.field1553 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field1568 == 1 && super.field1569 >= var6 - 75 && super.field1569 <= var6 + 75 && super.field1570 >= var17 - 20 && super.field1570 <= var17 + 20) {
                    this.field347 = 0;
                    this.method97(this.field205, this.field206, false);
                    if (this.field473) {
                        return;
                    }
                }
                int var8 = super.field1552 / 2 + 80;
                if (super.field1568 == 1 && super.field1569 >= var8 - 75 && super.field1569 <= var8 + 75 && super.field1570 >= var17 - 20 && super.field1570 <= var17 + 20) {
                    this.field78 = 0;
                    this.field205 = "";
                    this.field206 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method512((byte) 38);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field130.length(); ++var11) {
                            if (var9 == field130.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field131 == 0) {
                            if (var9 == 8 && this.field205.length() > 0) {
                                this.field205 = this.field205.substring(0, this.field205.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field131 = 1;
                            }
                            if (var10) {
                                this.field205 = this.field205 + (char) var9;
                            }
                            if (this.field205.length() > 12) {
                                this.field205 = this.field205.substring(0, 12);
                            }
                        } else if (this.field131 == 1) {
                            if (var9 == 8 && this.field206.length() > 0) {
                                this.field206 = this.field206.substring(0, this.field206.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field131 = 0;
                            }
                            if (var10) {
                                this.field206 = this.field206 + (char) var9;
                            }
                            if (this.field206.length() > 20) {
                                this.field206 = this.field206.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field78 == 3) {
                    int var12 = super.field1552 / 2;
                    int var13 = super.field1553 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field1568 == 1 && super.field1569 >= var12 - 75 && super.field1569 <= var12 + 75 && super.field1570 >= var18 - 20 && super.field1570 <= var18 + 20) {
                        this.field78 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LBJPWOXRJ;IILQVUHZTUC;I)V")
    private final void method55(class3 arg0, int arg1, int arg2, class48 arg3, int arg4) {
        this.field257 += arg2;
        if ((arg4 & 1) != 0) {
            int var6 = arg0.method15();
            byte[] var7 = new byte[var6];
            class3 var8 = new class3(false, var7);
            arg0.method24(0, var7, 3, var6);
            this.field388[arg1] = var8;
            arg3.method467((byte) 3, var8);
        }
        if ((arg4 & 2) != 0) {
            int var9 = arg0.method17();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg3.field1291 == var9) {
                arg3.field1295 = 0;
            }
            int var10 = arg0.method15();
            if (arg3.field1291 == var9 && var9 != -1) {
                int var11 = class42.field1314[var9].field1328;
                if (var11 == 1) {
                    arg3.field1292 = 0;
                    arg3.field1293 = 0;
                    arg3.field1294 = var10;
                    arg3.field1295 = 0;
                }
                if (var11 == 2) {
                    arg3.field1295 = 0;
                }
            } else if (var9 == -1 || arg3.field1291 == -1 || class42.field1314[var9].field1322 >= class42.field1314[arg3.field1291].field1322) {
                arg3.field1291 = var9;
                arg3.field1292 = 0;
                arg3.field1293 = 0;
                arg3.field1294 = var10;
                arg3.field1295 = 0;
                arg3.field1301 = arg3.field1298;
            }
        }
        if ((arg4 & 4) != 0) {
            arg3.field1280 = arg0.method17();
            if (arg3.field1280 == 65535) {
                arg3.field1280 = -1;
            }
        }
        if ((arg4 & 8) != 0) {
            arg3.field1255 = arg0.method22();
            if (arg3.field1255.charAt(0) == '~') {
                arg3.field1255 = arg3.field1255.substring(1);
                this.method89(arg3.field1255, arg3.field1406, (byte) 1, 2);
            } else if (field444 == arg3) {
                this.method89(arg3.field1255, arg3.field1406, (byte) 1, 2);
            }
            arg3.field1254 = 0;
            arg3.field1244 = 0;
            arg3.field1297 = 150;
        }
        if ((arg4 & 16) != 0) {
            int var12 = arg0.method15();
            int var13 = arg0.method15();
            arg3.method447(var13, 0, field291, var12);
            arg3.field1271 = field291 + 300;
            arg3.field1272 = arg0.method15();
            arg3.field1273 = arg0.method15();
        }
        if ((arg4 & 32) != 0) {
            arg3.field1278 = arg0.method17();
            arg3.field1279 = arg0.method17();
        }
        if ((arg4 & 64) != 0) {
            int var14 = arg0.method17();
            int var15 = arg0.method15();
            int var16 = arg0.method15();
            int var17 = arg0.field20;
            if (arg3.field1406 != null && arg3.field1416) {
                long var18 = class44.method459(arg3.field1406);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field367; ++var21) {
                        if (this.field207[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field496 == 0) {
                    try {
                        this.field148.field20 = 0;
                        arg0.method24(0, this.field148.field19, 3, this.field257 - 4);
                        String var22 = class66.method542(this.field148, 7, var16);
                        String var23 = class30.method369(-42231, var22);
                        arg3.field1255 = var23;
                        arg3.field1254 = var14 >> 8;
                        arg3.field1244 = var14 & 255;
                        arg3.field1297 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method89(var23, "@cr1@" + arg3.field1406, (byte) 1, 1);
                            } else {
                                this.method89(var23, arg3.field1406, (byte) 1, 2);
                            }
                        } else {
                            this.method89(var23, "@cr2@" + arg3.field1406, (byte) 1, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field20 = var16 + var17;
        }
        if ((arg4 & 256) != 0) {
            arg3.field1256 = arg0.method17();
            int var25 = arg0.method20();
            arg3.field1260 = var25 >> 16;
            arg3.field1259 = (var25 & 65535) + field291;
            arg3.field1257 = 0;
            arg3.field1258 = 0;
            if (arg3.field1259 > field291) {
                arg3.field1257 = -1;
            }
            if (arg3.field1256 == 65535) {
                arg3.field1256 = -1;
            }
        }
        if ((arg4 & 512) != 0) {
            arg3.field1246 = arg0.method15();
            arg3.field1248 = arg0.method15();
            arg3.field1247 = arg0.method15();
            arg3.field1249 = arg0.method15();
            arg3.field1250 = arg0.method17() + field291;
            arg3.field1251 = arg0.method17() + field291;
            arg3.field1252 = arg0.method15();
            arg3.method448(false);
        }
        if ((arg4 & 1024) != 0) {
            int var26 = arg0.method15();
            int var27 = arg0.method15();
            arg3.method447(var27, 0, field291, var26);
            arg3.field1271 = field291 + 300;
            arg3.field1272 = arg0.method15();
            arg3.field1273 = arg0.method15();
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)Z")
    public final boolean method56(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field202 == null) {
            return false;
        } else {
            try {
                int var2 = this.field202.method320();
                if (var2 == 0) {
                    return false;
                }
                if (this.field258 == -1) {
                    this.field202.method321(this.field282.field19, 0, 1);
                    this.field258 = this.field282.field19[0] & 255;
                    if (this.field87 != null) {
                        this.field258 = this.field258 - this.field87.method203() & 255;
                    }
                    this.field257 = class4.field34[this.field258];
                    --var2;
                }
                if (this.field257 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field202.method321(this.field282.field19, 0, 1);
                    this.field257 = this.field282.field19[0] & 255;
                    --var2;
                }
                if (this.field257 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field202.method321(this.field282.field19, 0, 2);
                    this.field282.field20 = 0;
                    this.field257 = this.field282.method17();
                    var2 -= 2;
                }
                if (var2 < this.field257) {
                    return false;
                }
                this.field282.field20 = 0;
                this.field202.method321(this.field282.field19, 0, this.field257);
                this.field259 = 0;
                this.field440 = this.field439;
                this.field439 = this.field438;
                this.field438 = this.field258;
                if (this.field258 == 105) {
                    int var3 = this.field282.method15();
                    int var4 = this.field282.method15();
                    String var5 = this.field282.method22();
                    if (var3 >= 1 && var3 <= 5) {
                        if (var5.equalsIgnoreCase("null")) {
                            var5 = null;
                        }
                        this.field494[var3 - 1] = var5;
                        this.field495[var3 - 1] = var4 == 0;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 211) {
                    this.field201 = this.field282.method15();
                    this.field126 = true;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 157) {
                    this.field497 = this.field282.method15();
                    this.field498 = this.field282.method15();
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 83) {
                    long var6 = this.field282.method21((byte) 7);
                    int var8 = this.field282.method20();
                    int var9 = this.field282.method15();
                    boolean var10 = false;
                    for (int var11 = 0; var11 < 100; ++var11) {
                        if (this.field186[var11] == var8) {
                            var10 = true;
                            break;
                        }
                    }
                    if (var9 <= 1) {
                        for (int var12 = 0; var12 < this.field367; ++var12) {
                            if (this.field207[var12] == var6) {
                                var10 = true;
                                break;
                            }
                        }
                    }
                    if (!var10 && this.field496 == 0) {
                        try {
                            this.field186[this.field50] = var8;
                            this.field50 = (this.field50 + 1) % 100;
                            String var13 = class66.method542(this.field282, 7, this.field257 - 13);
                            if (var9 != 3) {
                                var13 = class30.method369(-42231, var13);
                            }
                            if (var9 != 2 && var9 != 3) {
                                if (var9 == 1) {
                                    this.method89(var13, "@cr1@" + class44.method463((byte) -2, class44.method460(var6, -437)), (byte) 1, 7);
                                } else {
                                    this.method89(var13, class44.method463((byte) -2, class44.method460(var6, -437)), (byte) 1, 3);
                                }
                            } else {
                                this.method89(var13, "@cr2@" + class44.method463((byte) -2, class44.method460(var6, -437)), (byte) 1, 7);
                            }
                        } catch (Exception var171) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 253) {
                    if (this.field450 == 12) {
                        this.field126 = true;
                    }
                    this.field190 = this.field282.method18();
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 227) {
                    for (int var15 = 0; var15 < this.field383.length; ++var15) {
                        if (this.field383[var15] != null) {
                            this.field383[var15].field1291 = -1;
                        }
                    }
                    for (int var16 = 0; var16 < this.field149.length; ++var16) {
                        if (this.field149[var16] != null) {
                            this.field149[var16].field1291 = -1;
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 28) {
                    this.field493 = this.field282.method17() * 30;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 39) {
                    this.field44 = false;
                    for (int var17 = 0; var17 < 5; ++var17) {
                        this.field255[var17] = false;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 139) {
                    int var18 = this.field282.method17();
                    int var19 = this.field282.method17();
                    class8.field574[var18].field550 = 2;
                    class8.field574[var18].field551 = var19;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 9) {
                    this.field126 = true;
                    int var20 = this.field282.method17();
                    class8 var21 = class8.field574[var20];
                    while (this.field282.field20 < this.field257) {
                        int var22 = this.field282.method29();
                        int var23 = this.field282.method17();
                        int var24 = this.field282.method15();
                        if (var24 == 255) {
                            var24 = this.field282.method20();
                        }
                        if (var22 >= 0 && var22 < var21.field582.length) {
                            var21.field582[var22] = var23;
                            var21.field585[var22] = var24;
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 44) {
                    this.field220 = this.field282.method15();
                    if (this.field450 == this.field220) {
                        if (this.field220 == 3) {
                            this.field450 = 1;
                        } else {
                            this.field450 = 3;
                        }
                        this.field126 = true;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 223) {
                    this.field126 = true;
                    int var25 = this.field282.method17();
                    class8 var26 = class8.field574[var25];
                    int var27 = this.field282.method17();
                    for (int var28 = 0; var28 < var27; ++var28) {
                        var26.field582[var28] = this.field282.method17();
                        int var29 = this.field282.method15();
                        if (var29 == 255) {
                            var29 = this.field282.method20();
                        }
                        var26.field585[var28] = var29;
                    }
                    for (int var30 = var27; var30 < var26.field582.length; ++var30) {
                        var26.field582[var30] = 0;
                        var26.field585[var30] = 0;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 23) {
                    this.method159(0, this.field282, this.field257);
                    this.field515 = false;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 254) {
                    this.field54 = this.field282.method17();
                    this.field434 = this.field282.method15();
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 193) {
                    this.field89 = this.field282.method15();
                    this.field303 = this.field282.method15();
                    this.field107 = this.field282.method15();
                    this.field361 = true;
                    this.field159 = true;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 216) {
                    int var31 = this.field282.method17();
                    int var32 = this.field282.method20();
                    this.field162[var31] = var32;
                    if (this.field59[var31] != var32) {
                        this.field59[var31] = var32;
                        this.method62(this.field48, var31);
                        this.field126 = true;
                        if (this.field469 != -1) {
                            this.field159 = true;
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 202) {
                    this.field126 = true;
                    int var33 = this.field282.method15();
                    int var34 = this.field282.method20();
                    int var35 = this.field282.method15();
                    this.field476[var33] = var34;
                    this.field403[var33] = var35;
                    this.field84[var33] = 1;
                    for (int var36 = 0; var36 < 98; ++var36) {
                        if (var34 >= field252[var36]) {
                            this.field84[var33] = var36 + 2;
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 79) {
                    int var37 = this.field282.method17();
                    if (var37 == 65535) {
                        var37 = -1;
                    }
                    if (this.field404 != var37 && this.field53 && !field396 && this.field116 == 0) {
                        this.field427 = var37;
                        this.field428 = true;
                        this.field167.method190(2, this.field427);
                    }
                    this.field404 = var37;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 210) {
                    int var38 = this.field282.method17();
                    int var39 = this.field282.method17();
                    if (this.field53 && !field396) {
                        this.field427 = var38;
                        this.field428 = false;
                        this.field167.method190(2, this.field427);
                        this.field116 = var39;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 35) {
                    this.field44 = true;
                    this.field349 = this.field282.method15();
                    this.field350 = this.field282.method15();
                    this.field351 = this.field282.method17();
                    this.field352 = this.field282.method15();
                    this.field353 = this.field282.method15();
                    if (this.field353 >= 100) {
                        this.field422 = this.field349 * 128 + 64;
                        this.field424 = this.field350 * 128 + 64;
                        this.field423 = this.method94(this.field422, 938, this.field424, this.field128) - this.field351;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 92 || this.field258 == 192) {
                    int var40 = this.field263;
                    int var41 = this.field264;
                    if (this.field258 == 92) {
                        var40 = this.field282.method17();
                        var41 = this.field282.method17();
                        this.field514 = false;
                    }
                    if (this.field258 == 192) {
                        var40 = this.field282.method17();
                        var41 = this.field282.method17();
                        this.field282.method25((byte) -82);
                        int var42 = 0;
                        while (true) {
                            if (var42 >= 4) {
                                this.field282.method27(0);
                                this.field514 = true;
                                break;
                            }
                            for (int var43 = 0; var43 < 13; ++var43) {
                                for (int var44 = 0; var44 < 13; ++var44) {
                                    int var45 = this.field282.method26(false, 1);
                                    if (var45 == 1) {
                                        this.field402[var42][var43][var44] = this.field282.method26(false, 26);
                                    } else {
                                        this.field402[var42][var43][var44] = -1;
                                    }
                                }
                            }
                            ++var42;
                        }
                    }
                    if (this.field263 == var40 && this.field264 == var41 && this.field466 == 2) {
                        this.field258 = -1;
                        return true;
                    }
                    this.field263 = var40;
                    this.field264 = var41;
                    this.field310 = (this.field263 - 6) * 8;
                    this.field311 = (this.field264 - 6) * 8;
                    this.field277 = false;
                    if ((this.field263 / 8 == 48 || this.field263 / 8 == 49) && this.field264 / 8 == 48) {
                        this.field277 = true;
                    }
                    if (this.field263 / 8 == 48 && this.field264 / 8 == 148) {
                        this.field277 = true;
                    }
                    this.field466 = 1;
                    this.field366 = System.currentTimeMillis();
                    this.field243.method545(16595);
                    this.field410.method432(257, 151, 190, "Loading - please wait.", 0);
                    this.field410.method432(256, 150, 190, "Loading - please wait.", 16777215);
                    this.field243.method546(super.field1554, 4, -52, 4);
                    if (this.field258 == 92) {
                        int var46 = 0;
                        int var47 = (this.field263 - 6) / 8;
                        label1042: while (true) {
                            if (var47 > (this.field263 + 6) / 8) {
                                this.field47 = new byte[var46][];
                                this.field64 = new byte[var46][];
                                this.field358 = new int[var46];
                                this.field359 = new int[var46];
                                this.field360 = new int[var46];
                                int var49 = 0;
                                int var50 = (this.field263 - 6) / 8;
                                while (true) {
                                    if (var50 > (this.field263 + 6) / 8) {
                                        break label1042;
                                    }
                                    for (int var51 = (this.field264 - 6) / 8; var51 <= (this.field264 + 6) / 8; ++var51) {
                                        this.field358[var49] = (var50 << 8) + var51;
                                        if (!this.field277 || var51 != 49 && var51 != 149 && var51 != 147 && var50 != 50 && (var50 != 49 || var51 != 47)) {
                                            int var52 = this.field359[var49] = this.field167.method202(var50, -900, var51, 0);
                                            if (var52 != -1) {
                                                this.field167.method190(3, var52);
                                            }
                                            int var53 = this.field360[var49] = this.field167.method202(var50, -900, var51, 1);
                                            if (var53 != -1) {
                                                this.field167.method190(3, var53);
                                            }
                                            ++var49;
                                        } else {
                                            this.field359[var49] = -1;
                                            this.field360[var49] = -1;
                                            ++var49;
                                        }
                                    }
                                    ++var50;
                                }
                            }
                            for (int var48 = (this.field264 - 6) / 8; var48 <= (this.field264 + 6) / 8; ++var48) {
                                ++var46;
                            }
                            ++var47;
                        }
                    }
                    int var54 = this.field310 - this.field312;
                    int var55 = this.field311 - this.field313;
                    this.field312 = this.field310;
                    this.field313 = this.field311;
                    for (int var56 = 0; var56 < 16384; ++var56) {
                        class18 var57 = this.field149[var56];
                        if (var57 != null) {
                            for (int var58 = 0; var58 < 10; ++var58) {
                                var57.field1276[var58] -= var54;
                                var57.field1277[var58] -= var55;
                            }
                            var57.field1268 -= var54 * 128;
                            var57.field1269 -= var55 * 128;
                        }
                    }
                    for (int var59 = 0; var59 < this.field381; ++var59) {
                        class48 var60 = this.field383[var59];
                        if (var60 != null) {
                            for (int var61 = 0; var61 < 10; ++var61) {
                                var60.field1276[var61] -= var54;
                                var60.field1277[var61] -= var55;
                            }
                            var60.field1268 -= var54 * 128;
                            var60.field1269 -= var55 * 128;
                        }
                    }
                    this.field515 = true;
                    byte var62 = 0;
                    byte var63 = 104;
                    byte var64 = 1;
                    if (var54 < 0) {
                        var62 = 103;
                        var63 = -1;
                        var64 = -1;
                    }
                    byte var65 = 0;
                    byte var66 = 104;
                    byte var67 = 1;
                    if (var55 < 0) {
                        var65 = 103;
                        var66 = -1;
                        var67 = -1;
                    }
                    for (int var68 = var62; var63 != var68; var68 += var64) {
                        for (int var69 = var65; var66 != var69; var69 += var67) {
                            int var70 = var54 + var68;
                            int var71 = var55 + var69;
                            for (int var72 = 0; var72 < 4; ++var72) {
                                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                                    this.field171[var72][var68][var69] = this.field171[var72][var70][var71];
                                } else {
                                    this.field171[var72][var68][var69] = null;
                                }
                            }
                        }
                    }
                    for (class62 var73 = (class62) this.field504.method471(); var73 != null; var73 = (class62) this.field504.method473((byte) 2)) {
                        var73.field1617 -= var54;
                        var73.field1618 -= var55;
                        if (var73.field1617 < 0 || var73.field1618 < 0 || var73.field1617 >= 104 || var73.field1618 >= 104) {
                            var73.method430();
                        }
                    }
                    if (this.field431 != 0) {
                        this.field431 -= var54;
                        this.field432 -= var55;
                    }
                    this.field44 = false;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 154) {
                    this.field367 = this.field257 / 8;
                    for (int var74 = 0; var74 < this.field367; ++var74) {
                        this.field207[var74] = this.field282.method21((byte) 7);
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 230) {
                    int var75 = this.field282.method17();
                    boolean var76 = this.field282.method15() == 1;
                    class8.field574[var75].field565 = var76;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 81) {
                    String var77 = this.field282.method22();
                    if (var77.endsWith(":tradereq:")) {
                        String var78 = var77.substring(0, var77.indexOf(":"));
                        long var79 = class44.method459(var78);
                        boolean var81 = false;
                        for (int var82 = 0; var82 < this.field367; ++var82) {
                            if (this.field207[var82] == var79) {
                                var81 = true;
                                break;
                            }
                        }
                        if (!var81 && this.field496 == 0) {
                            this.method89("wishes to trade with you.", var78, (byte) 1, 4);
                        }
                    } else if (var77.endsWith(":duelreq:")) {
                        String var83 = var77.substring(0, var77.indexOf(":"));
                        long var84 = class44.method459(var83);
                        boolean var86 = false;
                        for (int var87 = 0; var87 < this.field367; ++var87) {
                            if (this.field207[var87] == var84) {
                                var86 = true;
                                break;
                            }
                        }
                        if (!var86 && this.field496 == 0) {
                            this.method89("wishes to duel with you.", var83, (byte) 1, 8);
                        }
                    } else if (!var77.endsWith(":chalreq:")) {
                        this.method89(var77, "", (byte) 1, 0);
                    } else {
                        String var88 = var77.substring(0, var77.indexOf(":"));
                        long var89 = class44.method459(var88);
                        boolean var91 = false;
                        for (int var92 = 0; var92 < this.field367; ++var92) {
                            if (this.field207[var92] == var89) {
                                var91 = true;
                                break;
                            }
                        }
                        if (!var91 && this.field496 == 0) {
                            String var93 = var77.substring(var77.indexOf(":") + 1, var77.length() - 9);
                            this.method89(var93, var88, (byte) 1, 8);
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 244) {
                    int var94 = this.field282.method17();
                    int var95 = this.field282.method17();
                    int var96 = this.field282.method17();
                    if (var95 == 65535) {
                        class8.field574[var94].field550 = 0;
                        this.field258 = -1;
                        return true;
                    }
                    class33 var97 = class33.method409(var95);
                    class8.field574[var94].field550 = 4;
                    class8.field574[var94].field551 = var95;
                    class8.field574[var94].field577 = var97.field1183;
                    class8.field574[var94].field578 = var97.field1155;
                    class8.field574[var94].field576 = var97.field1148 * 100 / var96;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 17) {
                    int var98 = this.field282.method17();
                    class8 var99 = class8.field574[var98];
                    for (int var100 = 0; var100 < var99.field582.length; ++var100) {
                        var99.field582[var100] = -1;
                        var99.field582[var100] = 0;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 21) {
                    int var101 = this.field282.method17();
                    this.method173(var101, 0);
                    if (this.field314 != -1) {
                        this.field314 = -1;
                        this.field126 = true;
                        this.field163 = true;
                    }
                    this.field443 = var101;
                    this.field159 = true;
                    this.field68 = -1;
                    this.field76 = false;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 97) {
                    int var102 = this.field282.method17();
                    class8.field574[var102].field550 = 3;
                    if (field444.field1421 == null) {
                        class8.field574[var102].field551 = (field444.field1405[11] << 5) + (field444.field1405[8] << 10) + (field444.field1405[0] << 15) + (field444.field1417[0] << 25) + (field444.field1417[4] << 20) + field444.field1405[1];
                    } else {
                        class8.field574[var102].field551 = (int) (field444.field1421.field1476 + 305419896L);
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 101) {
                    if (this.field314 != -1) {
                        this.field314 = -1;
                        this.field126 = true;
                        this.field163 = true;
                    }
                    if (this.field443 != -1) {
                        this.field443 = -1;
                        this.field159 = true;
                    }
                    if (this.field256) {
                        this.field256 = false;
                        this.field159 = true;
                    }
                    this.field68 = -1;
                    this.field76 = false;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 46) {
                    int var103 = this.field282.method17();
                    int var104 = this.field282.method17();
                    class8.field574[var103].field550 = 1;
                    class8.field574[var103].field551 = var104;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 174) {
                    int var105 = this.field282.method18();
                    this.field469 = var105;
                    this.field159 = true;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 103) {
                    int var106 = this.field282.method17();
                    String var107 = this.field282.method22();
                    class8.field574[var106].field572 = var107;
                    if (this.field208[this.field450] == class8.field574[var106].field584) {
                        this.field126 = true;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 189) {
                    int var108 = this.field282.method17();
                    int var109 = this.field282.method17();
                    if (this.field443 != -1) {
                        this.field443 = -1;
                        this.field159 = true;
                    }
                    if (this.field256) {
                        this.field256 = false;
                        this.field159 = true;
                    }
                    this.field68 = var108;
                    this.field314 = var109;
                    this.field126 = true;
                    this.field163 = true;
                    this.field76 = false;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 82) {
                    int var110 = this.field282.method17();
                    int var111 = this.field282.method17();
                    int var112 = this.field282.method17();
                    int var113 = this.field282.method17();
                    class8.field574[var110].field577 = var111;
                    class8.field574[var110].field578 = var112;
                    class8.field574[var110].field576 = var113;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 155) {
                    this.field44 = true;
                    this.field293 = this.field282.method15();
                    this.field294 = this.field282.method15();
                    this.field295 = this.field282.method17();
                    this.field296 = this.field282.method15();
                    this.field297 = this.field282.method15();
                    if (this.field297 >= 100) {
                        int var114 = this.field293 * 128 + 64;
                        int var115 = this.field294 * 128 + 64;
                        int var116 = this.method94(var114, 938, var115, this.field128) - this.field295;
                        int var117 = var114 - this.field422;
                        int var118 = var116 - this.field423;
                        int var119 = var115 - this.field424;
                        int var120 = (int) Math.sqrt((double) (var117 * var117 + var119 * var119));
                        this.field425 = (int) (Math.atan2((double) var118, (double) var120) * 325.949D) & 2047;
                        this.field426 = (int) (Math.atan2((double) var117, (double) var119) * -325.949D) & 2047;
                        if (this.field425 < 128) {
                            this.field425 = 128;
                        }
                        if (this.field425 > 383) {
                            this.field425 = 383;
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 176) {
                    this.field497 = this.field282.method15();
                    this.field498 = this.field282.method15();
                    for (int var121 = this.field497; var121 < this.field497 + 8; ++var121) {
                        for (int var122 = this.field498; var122 < this.field498 + 8; ++var122) {
                            if (this.field171[this.field128][var121][var122] != null) {
                                this.field171[this.field128][var121][var122] = null;
                                this.method42(var121, var122);
                            }
                        }
                    }
                    for (class62 var123 = (class62) this.field504.method471(); var123 != null; var123 = (class62) this.field504.method473((byte) 2)) {
                        if (var123.field1617 >= this.field497 && var123.field1617 < this.field497 + 8 && var123.field1618 >= this.field498 && var123.field1618 < this.field498 + 8 && this.field128 == var123.field1615) {
                            var123.field1622 = 0;
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 246) {
                    this.field52 = false;
                    this.field256 = true;
                    this.field98 = "";
                    this.field159 = true;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 187) {
                    this.field110 = this.field282.method15();
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 151) {
                    this.field431 = 0;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 85) {
                    int var124 = this.field282.method17();
                    int var125 = this.field282.method18();
                    int var126 = this.field282.method18();
                    class8 var127 = class8.field574[var124];
                    var127.field575 = var125;
                    var127.field579 = var126;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 247) {
                    this.field450 = this.field282.method15();
                    this.field126 = true;
                    this.field163 = true;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 16) {
                    int var128 = this.field282.method17();
                    this.method173(var128, 0);
                    if (this.field443 != -1) {
                        this.field443 = -1;
                        this.field159 = true;
                    }
                    if (this.field256) {
                        this.field256 = false;
                        this.field159 = true;
                    }
                    this.field314 = var128;
                    this.field126 = true;
                    this.field163 = true;
                    this.field68 = -1;
                    this.field76 = false;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 235) {
                    this.method169(this.field62);
                    this.field258 = -1;
                    return false;
                }
                if (this.field258 == 169 || this.field258 == 242 || this.field258 == 222 || this.field258 == 107 || this.field258 == 104 || this.field258 == 90 || this.field258 == 110 || this.field258 == 147 || this.field258 == 1 || this.field258 == 141 || this.field258 == 133) {
                    this.method140(this.field258, this.field282, -578);
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 215) {
                    int var129 = this.field282.method17();
                    int var130 = this.field282.method17();
                    int var131 = var130 >> 10 & 31;
                    int var132 = var130 >> 5 & 31;
                    int var133 = var130 & 31;
                    class8.field574[var129].field614 = (var133 << 3) + (var131 << 19) + (var132 << 11);
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 168) {
                    int var134 = this.field282.method17();
                    int var135 = this.field282.method15();
                    int var136 = this.field282.method17();
                    if (this.field279 && !field396 && this.field174 < 50) {
                        this.field488[this.field174] = var134;
                        this.field374[this.field174] = var135;
                        this.field70[this.field174] = class14.field723[var134] + var136;
                        ++this.field174;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 69) {
                    this.field497 = this.field282.method15();
                    this.field498 = this.field282.method15();
                    while (this.field282.field20 < this.field257) {
                        int var137 = this.field282.method15();
                        this.method140(var137, this.field282, -578);
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 231) {
                    this.field452 = this.field282.method20();
                    this.field267 = this.field282.method17();
                    this.field191 = this.field282.method15();
                    this.field58 = this.field282.method17();
                    this.field164 = this.field282.method15();
                    if (this.field452 != 0 && this.field68 == -1) {
                        signlink.dnslookup(class44.method462(this.field452, false));
                        this.method98(4);
                        short var138 = 650;
                        if (this.field191 != 201 || this.field164 == 1) {
                            var138 = 655;
                        }
                        this.field459 = "";
                        this.field368 = false;
                        for (int var139 = 0; var139 < class8.field574.length; ++var139) {
                            if (class8.field574[var139] != null && class8.field574[var139].field609 == var138) {
                                this.field68 = class8.field574[var139].field584;
                                break;
                            }
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 99) {
                    int var140 = this.field282.method17();
                    this.method173(var140, 0);
                    if (this.field314 != -1) {
                        this.field314 = -1;
                        this.field126 = true;
                        this.field163 = true;
                    }
                    if (this.field443 != -1) {
                        this.field443 = -1;
                        this.field159 = true;
                    }
                    if (this.field256) {
                        this.field256 = false;
                        this.field159 = true;
                    }
                    this.field68 = var140;
                    this.field76 = false;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 11) {
                    long var141 = this.field282.method21((byte) 7);
                    int var143 = this.field282.method15();
                    String var144 = class44.method463((byte) -2, class44.method460(var141, -437));
                    for (int var145 = 0; var145 < this.field200; ++var145) {
                        if (this.field274[var145] == var141) {
                            if (this.field309[var145] != var143) {
                                this.field309[var145] = var143;
                                this.field126 = true;
                                if (var143 > 0) {
                                    this.method89(var144 + " has logged in.", "", (byte) 1, 5);
                                }
                                if (var143 == 0) {
                                    this.method89(var144 + " has logged out.", "", (byte) 1, 5);
                                }
                            }
                            var144 = null;
                            break;
                        }
                    }
                    if (var144 != null && this.field200 < 200) {
                        this.field274[this.field200] = var141;
                        this.field154[this.field200] = var144;
                        this.field309[this.field200] = var143;
                        ++this.field200;
                        this.field126 = true;
                    }
                    boolean var146 = false;
                    while (!var146) {
                        var146 = true;
                        for (int var147 = 0; var147 < this.field200 - 1; ++var147) {
                            if (this.field309[var147] != field393 && this.field309[var147 + 1] == field393 || this.field309[var147] == 0 && this.field309[var147 + 1] != 0) {
                                int var148 = this.field309[var147];
                                this.field309[var147] = this.field309[var147 + 1];
                                this.field309[var147 + 1] = var148;
                                String var149 = this.field154[var147];
                                this.field154[var147] = this.field154[var147 + 1];
                                this.field154[var147 + 1] = var149;
                                long var150 = this.field274[var147];
                                this.field274[var147] = this.field274[var147 + 1];
                                this.field274[var147 + 1] = var150;
                                this.field126 = true;
                                var146 = false;
                            }
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 173) {
                    int var152 = this.field282.method17();
                    int var153 = this.field282.method18();
                    class8 var154 = class8.field574[var152];
                    var154.field605 = var153;
                    if (var153 == -1) {
                        var154.field567 = 0;
                        var154.field561 = 0;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 33) {
                    for (int var155 = 0; var155 < this.field59.length; ++var155) {
                        if (this.field59[var155] != this.field162[var155]) {
                            this.field59[var155] = this.field162[var155];
                            this.method62(this.field48, var155);
                            this.field126 = true;
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 219) {
                    this.field115 = this.field282.method15();
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 41) {
                    int var156 = this.field282.method17();
                    int var157 = this.field282.method15();
                    if (var156 == 65535) {
                        var156 = -1;
                    }
                    this.field208[var157] = var156;
                    this.field126 = true;
                    this.field163 = true;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 150) {
                    this.field298 = this.field282.method15();
                    if (this.field298 == 1) {
                        this.field157 = this.field282.method17();
                    }
                    if (this.field298 >= 2 && this.field298 <= 6) {
                        if (this.field298 == 2) {
                            this.field456 = 64;
                            this.field457 = 64;
                        }
                        if (this.field298 == 3) {
                            this.field456 = 0;
                            this.field457 = 64;
                        }
                        if (this.field298 == 4) {
                            this.field456 = 128;
                            this.field457 = 64;
                        }
                        if (this.field298 == 5) {
                            this.field456 = 64;
                            this.field457 = 0;
                        }
                        if (this.field298 == 6) {
                            this.field456 = 64;
                            this.field457 = 128;
                        }
                        this.field298 = 2;
                        this.field453 = this.field282.method17();
                        this.field454 = this.field282.method17();
                        this.field455 = this.field282.method15();
                    }
                    if (this.field298 == 10) {
                        this.field391 = this.field282.method17();
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 102) {
                    int var158 = this.field282.method17();
                    int var159 = this.field282.method17();
                    class8 var160 = class8.field574[var158];
                    if (var160 != null && var160.field568 == 0) {
                        if (var159 < 0) {
                            var159 = 0;
                        }
                        if (var159 > var160.field547 - var160.field557) {
                            var159 = var160.field547 - var160.field557;
                        }
                        var160.field599 = var159;
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 205) {
                    int var161 = this.field282.method15();
                    int var162 = this.field282.method15();
                    int var163 = this.field282.method15();
                    int var164 = this.field282.method15();
                    this.field255[var161] = true;
                    this.field239[var161] = var162;
                    this.field302[var161] = var163;
                    this.field152[var161] = var164;
                    this.field300[var161] = 0;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 167) {
                    this.method171(this.field257, this.field282, false);
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 114) {
                    int var165 = this.field282.method18();
                    if (var165 >= 0) {
                        this.method173(var165, 0);
                    }
                    this.field299 = var165;
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 70) {
                    int var166 = this.field282.method17();
                    byte var167 = this.field282.method16();
                    this.field162[var166] = var167;
                    if (this.field59[var166] != var167) {
                        this.field59[var166] = var167;
                        this.method62(this.field48, var166);
                        this.field126 = true;
                        if (this.field469 != -1) {
                            this.field159 = true;
                        }
                    }
                    this.field258 = -1;
                    return true;
                }
                if (this.field258 == 135) {
                    if (this.field450 == 12) {
                        this.field126 = true;
                    }
                    this.field104 = this.field282.method15();
                    this.field258 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field258 + "," + this.field257 + " - " + this.field439 + "," + this.field440);
                this.method169(this.field62);
            } catch (IOException var172) {
                this.method127(3);
            } catch (Exception var173) {
                String var169 = "T2 - " + this.field258 + "," + this.field439 + "," + this.field440 + " - " + this.field257 + "," + (field444.field1276[0] + this.field310) + "," + (field444.field1277[0] + this.field311) + " - ";
                for (int var170 = 0; var170 < this.field257 && var170 < 50; ++var170) {
                    var169 = var169 + this.field282.field19[var170] + ",";
                }
                signlink.reporterror(var169);
                this.method169(this.field62);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method57(boolean arg0, int arg1) {
        if (!arg0) {
            field111 = -6;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method58(int arg0) {
        if (arg0 != -36118) {
            this.field258 = -1;
        }
        if (this.field231 == 0) {
            int var2 = super.field1568;
            if (this.field175 == 1 && super.field1569 >= 516 && super.field1570 >= 160 && super.field1569 <= 765 && super.field1570 <= 205) {
                var2 = 0;
            }
            if (this.field117) {
                if (var2 != 1) {
                    int var3 = super.field1562;
                    int var4 = super.field1563;
                    if (this.field92 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field92 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field92 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field93 - 10 || var3 > this.field95 + this.field93 + 10 || var4 < this.field94 - 10 || var4 > this.field96 + this.field94 + 10) {
                        this.field117 = false;
                        if (this.field92 == 1) {
                            this.field126 = true;
                        }
                        if (this.field92 == 2) {
                            this.field159 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field93;
                    int var6 = this.field94;
                    int var7 = this.field95;
                    int var8 = super.field1569;
                    int var9 = super.field1570;
                    if (this.field92 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field92 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field92 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field273; ++var11) {
                        int var12 = (this.field273 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method49(this.field462, var10);
                    }
                    this.field117 = false;
                    if (this.field92 == 1) {
                        this.field126 = true;
                    }
                    if (this.field92 == 2) {
                        this.field159 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field273 > 0) {
                    int var13 = this.field502[this.field273 - 1];
                    if (var13 == 222 || var13 == 472 || var13 == 381 || var13 == 628 || var13 == 502 || var13 == 615 || var13 == 998 || var13 == 934 || var13 == 86 || var13 == 275 || var13 == 606 || var13 == 1918) {
                        int var14 = this.field500[this.field273 - 1];
                        int var15 = this.field501[this.field273 - 1];
                        class8 var16 = class8.field574[var15];
                        if (var16.field603 || var16.field558) {
                            this.field280 = false;
                            this.field72 = 0;
                            this.field229 = var15;
                            this.field230 = var14;
                            this.field231 = 2;
                            this.field232 = super.field1569;
                            this.field233 = super.field1570;
                            if (class8.field574[var15].field584 == this.field68) {
                                this.field231 = 1;
                            }
                            if (class8.field574[var15].field584 == this.field443) {
                                this.field231 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field108 == 1 || this.method113(this.field273 - 1, true)) && this.field273 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field273 > 0) {
                    this.method49(this.field462, this.field273 - 1);
                }
                if (var2 != 2 || this.field273 <= 0) {
                    return;
                }
                this.method157(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public static final void method59(int arg0) {
        class17.field775 = true;
        class12.field683 = true;
        field396 = true;
        class54.field1525 = true;
        class32.field1115 = true;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method60(boolean arg0) {
        if (!arg0) {
            field378 = !field378;
        }
        while (true) {
            class61 var2 = this.field167.method197();
            if (var2 == null) {
                return;
            }
            if (var2.field1610 == 0) {
                class26.method326(var2.field1613, var2.field1612, true);
                if ((this.field167.method185(6, var2.field1612) & 98) != 0) {
                    this.field126 = true;
                    if (this.field443 != -1) {
                        this.field159 = true;
                    }
                }
            }
            if (var2.field1610 == 1 && var2.field1613 != null) {
                class59.method521(0, var2.field1613);
            }
            if (var2.field1610 == 2 && this.field427 == var2.field1612 && var2.field1613 != null) {
                this.method120(this.field428, this.field125, var2.field1613);
            }
            if (var2.field1610 == 3 && this.field466 == 1) {
                for (int var3 = 0; var3 < this.field47.length; ++var3) {
                    if (this.field359[var3] == var2.field1612) {
                        this.field47[var3] = var2.field1613;
                        if (var2.field1613 == null) {
                            this.field359[var3] = -1;
                        }
                        break;
                    }
                    if (this.field360[var3] == var2.field1612) {
                        this.field64[var3] = var2.field1613;
                        if (var2.field1613 == null) {
                            this.field360[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1610 == 93 && this.field167.method198(857, var2.field1612)) {
                class54.method493(this.field167, true, new class3(false, var2.field1613));
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method61(int arg0) {
        if (this.field67 != arg0) {
            field111 = 427;
        }
        if (this.field115 == 0) {
            if (super.field1568 == 1) {
                int var2 = super.field1569 - 25 - 550;
                int var3 = super.field1570 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field81 + this.field101 & 2047;
                    int var5 = class12.field692[var4];
                    int var6 = class12.field693[var4];
                    int var7 = (this.field183 + 256) * var5 >> 8;
                    int var8 = (this.field183 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field444.field1268 + var9 >> 7;
                    int var12 = field444.field1269 - var10 >> 7;
                    boolean var13 = this.method138(field444.field1277[0], field444.field1276[0], 0, var11, 0, 303, 0, true, 0, var12, 0, 1);
                    if (var13) {
                        this.field106.method5(var2);
                        this.field106.method5(var3);
                        this.field106.method6(this.field101);
                        this.field106.method5(57);
                        this.field106.method5(this.field81);
                        this.field106.method5(this.field183);
                        this.field106.method5(89);
                        this.field106.method6(field444.field1268);
                        this.field106.method6(field444.field1269);
                        this.field106.method5(this.field437);
                        this.field106.method5(63);
                    }
                }
                ++field373;
                if (field373 > 1734) {
                    field373 = 0;
                    this.field106.method4(87, 0);
                    this.field106.method5(0);
                    int var14 = this.field106.field20;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field106.method6(60300);
                    }
                    this.field106.method5(36);
                    this.field106.method5(21);
                    this.field106.method5((int) (Math.random() * 256.0D));
                    this.field106.method6((int) (Math.random() * 65536.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field106.method6(2668);
                    }
                    this.field106.method5((int) (Math.random() * 256.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field106.method6(3744);
                    }
                    this.field106.method5(150);
                    this.field106.method6((int) (Math.random() * 65536.0D));
                    this.field106.method14(false, this.field106.field20 - var14);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method62(int arg0, int arg1) {
        int var3 = class27.field1016[arg1].field1024;
        if (arg0 >= 0) {
            this.method146();
        }
        if (var3 != 0) {
            int var4 = this.field59[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class12.method215(0.9D, true);
                }
                if (var4 == 2) {
                    class12.method215(0.8D, true);
                }
                if (var4 == 3) {
                    class12.method215(0.7D, true);
                }
                if (var4 == 4) {
                    class12.method215(0.6D, true);
                }
                class33.field1176.method317();
                this.field408 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field53;
                if (var4 == 0) {
                    this.method145(0, false, this.field53);
                    this.field53 = true;
                }
                if (var4 == 1) {
                    this.method145(-400, false, this.field53);
                    this.field53 = true;
                }
                if (var4 == 2) {
                    this.method145(-800, false, this.field53);
                    this.field53 = true;
                }
                if (var4 == 3) {
                    this.method145(-1200, false, this.field53);
                    this.field53 = true;
                }
                if (var4 == 4) {
                    this.field53 = false;
                }
                if (this.field53 != var5 && !field396) {
                    if (this.field53) {
                        this.field427 = this.field404;
                        this.field428 = true;
                        this.field167.method190(2, this.field427);
                    } else {
                        this.method35(0);
                    }
                    this.field116 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field279 = true;
                    this.method34(0, (byte) 5);
                }
                if (var4 == 1) {
                    this.field279 = true;
                    this.method34(-400, (byte) 5);
                }
                if (var4 == 2) {
                    this.field279 = true;
                    this.method34(-800, (byte) 5);
                }
                if (var4 == 3) {
                    this.field279 = true;
                    this.method34(-1200, (byte) 5);
                }
                if (var4 == 4) {
                    this.field279 = false;
                }
            }
            if (var3 == 5) {
                this.field108 = var4;
            }
            if (var3 == 6) {
                this.field109 = var4;
            }
            if (var3 == 8) {
                this.field161 = var4;
                this.field159 = true;
            }
            if (var3 == 9) {
                this.field138 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
    public final String method63(boolean arg0, int arg1) {
        if (arg0) {
            this.field258 = this.field282.method15();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)Z")
    public final boolean method64(boolean arg0) {
        if (arg0) {
            this.field166 = !this.field166;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILYZDAHXEQ;)V")
    public final void method65(int arg0, int arg1, int arg2, class70 arg3) {
        int var5 = this.field81 + this.field101 & 2047;
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = class26.field1011[var5];
            int var8 = class26.field1012[var5];
            int var9 = var7 * 256 / (this.field183 + 256);
            if (arg0 != -7004) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            int var11 = var8 * 256 / (this.field183 + 256);
            int var12 = arg1 * var11 + arg2 * var9 >> 16;
            int var13 = arg2 * var11 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg3.method559(5, var12 + 94 - arg3.field1698 / 2 + 4, this.field363, 83 - var13 - arg3.field1699 / 2 - 4);
            } else {
                arg3.method553(var12 + 94 - arg3.field1698 / 2 + 4, 83 - var13 - arg3.field1699 / 2 - 4, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILBJPWOXRJ;Z)V")
    private final void method66(int arg0, class3 arg1, boolean arg2) {
        for (int var4 = 0; var4 < this.field386; ++var4) {
            int var5 = this.field387[var4];
            class48 var6 = this.field383[var5];
            int var7 = arg1.method15();
            if ((var7 & 128) != 0) {
                var7 += arg1.method15() << 8;
            }
            this.method55(arg1, var5, 0, var6, var7);
        }
        if (!arg2) {
            this.field171 = null;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method67(int arg0) {
        this.field242.method545(16595);
        if (this.field115 == 2) {
            byte[] var2 = this.field363.field1584;
            int[] var3 = class13.field709;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field470.method557(this.field74, 33, 33, 25, 256, this.field101, (byte) 21, 0, 25, 0, this.field165);
            this.field243.method545(16595);
        } else {
            int var6 = this.field81 + this.field101 & 2047;
            int var7 = field444.field1268 / 32 + 48;
            int var8 = 464 - field444.field1269 / 32;
            this.field433.method557(this.field315, 146, 151, var7, this.field183 + 256, var6, (byte) 21, 5, var8, 25, this.field65);
            this.field470.method557(this.field74, 33, 33, 25, 256, this.field101, (byte) 21, 0, 25, 0, this.field165);
            for (int var9 = 0; var9 < this.field445; ++var9) {
                int var39 = this.field446[var9] * 4 + 2 - field444.field1268 / 32;
                int var40 = this.field447[var9] * 4 + 2 - field444.field1269 / 32;
                this.method65(-7004, var39, var40, this.field83[var9]);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class50 var36 = this.field171[this.field128][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field444.field1268 / 32;
                        int var38 = var35 * 4 + 2 - field444.field1269 / 32;
                        this.method65(-7004, var37, var38, this.field304);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field150; ++var11) {
                class18 var31 = this.field149[this.field151[var11]];
                if (var31 != null && var31.method297(false)) {
                    class52 var32 = var31.field841;
                    if (var32.field1464 != null) {
                        var32 = var32.method487(this.field160);
                    }
                    if (var32 != null && var32.field1484) {
                        int var33 = var31.field1268 / 32 - field444.field1268 / 32;
                        int var34 = var31.field1269 / 32 - field444.field1269 / 32;
                        this.method65(-7004, var33, var34, this.field305);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field384; ++var12) {
                class48 var23 = this.field383[this.field385[var12]];
                if (var23 != null && var23.method297(false)) {
                    int var24 = var23.field1268 / 32 - field444.field1268 / 32;
                    int var25 = var23.field1269 / 32 - field444.field1269 / 32;
                    boolean var26 = false;
                    long var27 = class44.method459(var23.field1406);
                    for (int var29 = 0; var29 < this.field200; ++var29) {
                        if (this.field274[var29] == var27 && this.field309[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field444.field1422 != 0 && var23.field1422 != 0 && field444.field1422 == var23.field1422) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method65(-7004, var24, var25, this.field307);
                    } else if (var30) {
                        this.method65(-7004, var24, var25, this.field308);
                    } else {
                        this.method65(-7004, var24, var25, this.field306);
                    }
                }
            }
            if (this.field298 != 0 && field291 % 20 < 10) {
                if (this.field298 == 1 && this.field157 >= 0 && this.field157 < this.field149.length) {
                    class18 var13 = this.field149[this.field157];
                    if (var13 != null) {
                        int var14 = var13.field1268 / 32 - field444.field1268 / 32;
                        int var15 = var13.field1269 / 32 - field444.field1269 / 32;
                        this.method163(16606, var14, this.field204, var15);
                    }
                }
                if (this.field298 == 2) {
                    int var16 = (this.field453 - this.field310) * 4 + 2 - field444.field1268 / 32;
                    int var17 = (this.field454 - this.field311) * 4 + 2 - field444.field1269 / 32;
                    this.method163(16606, var16, this.field204, var17);
                }
                if (this.field298 == 10 && this.field391 >= 0 && this.field391 < this.field383.length) {
                    class48 var18 = this.field383[this.field391];
                    if (var18 != null) {
                        int var19 = var18.field1268 / 32 - field444.field1268 / 32;
                        int var20 = var18.field1269 / 32 - field444.field1269 / 32;
                        this.method163(16606, var19, this.field204, var20);
                    }
                }
            }
            if (this.field431 != 0) {
                int var21 = this.field431 * 4 + 2 - field444.field1268 / 32;
                int var22 = this.field432 * 4 + 2 - field444.field1269 / 32;
                this.method65(-7004, var21, var22, this.field203);
            }
            class13.method228(78, 3, 3, 97, 16777215, true);
            this.field243.method545(16595);
            if (arg0 <= 0) {
                field405 = -455;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method68(int arg0) {
        if (arg0 != 0) {
            this.field62 = !this.field62;
        }
        this.method73((byte) 0);
        if (this.field199 == 1) {
            this.field121[this.field198 / 100].method553(this.field196 - 8 - 4, this.field197 - 8 - 4, true);
        }
        if (this.field199 == 2) {
            this.field121[this.field198 / 100 + 4].method553(this.field196 - 8 - 4, this.field197 - 8 - 4, true);
        }
        if (this.field299 != -1) {
            this.method128(false, this.field56, this.field299);
            this.method112(0, 0, 0, 24182, class8.field574[this.field299]);
        }
        if (this.field68 != -1) {
            this.method128(false, this.field56, this.field68);
            this.method112(0, 0, 0, 24182, class8.field574[this.field68]);
        }
        this.method105(0);
        if (!this.field117) {
            this.method132(this.field173);
            this.method45((byte) 50);
        } else if (this.field92 == 0) {
            this.method122((byte) 4);
        }
        if (this.field110 == 1) {
            this.field269[1].method553(472, 296, true);
        }
        if (field123) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1550 < 15) {
                var4 = 16711680;
            }
            this.field410.method431((byte) -13, var3, var2, "Fps:" + super.field1550, var4);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field396) {
                int var8 = 16711680;
            }
            this.field410.method431((byte) -13, var12, var2, "Mem:" + var6 + "k", 16776960);
            var12 += 15;
        }
        if (this.field493 != 0) {
            int var9 = this.field493 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field410.method436((byte) 0, 16776960, 329, "System update in: " + var10 + ":0" + var11, 4);
            } else {
                this.field410.method436((byte) 0, 16776960, 329, "System update in: " + var10 + ":" + var11, 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method69(int arg0) {
        this.field301 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field380[var2] = -1;
            for (int var3 = 0; var3 < class51.field1446; ++var3) {
                if (!class51.field1447[var3].field1453 && class51.field1447[var3].field1448 == var2 + (this.field506 ? 0 : 7)) {
                    this.field380[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 < 1 || arg0 > 1) {
            this.field258 = this.field282.method15();
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method70(int arg0) {
        if (arg0 != 3) {
            field137 = this.field87.method203();
        }
        if (super.field1568 == 1) {
            if (super.field1569 >= 6 && super.field1569 <= 106 && super.field1570 >= 467 && super.field1570 <= 499) {
                this.field89 = (this.field89 + 1) % 4;
                this.field361 = true;
                this.field159 = true;
                this.field106.method4(23, 0);
                this.field106.method5(this.field89);
                this.field106.method5(this.field303);
                this.field106.method5(this.field107);
            }
            if (super.field1569 >= 135 && super.field1569 <= 235 && super.field1570 >= 467 && super.field1570 <= 499) {
                this.field303 = (this.field303 + 1) % 3;
                this.field361 = true;
                this.field159 = true;
                this.field106.method4(23, 0);
                this.field106.method5(this.field89);
                this.field106.method5(this.field303);
                this.field106.method5(this.field107);
            }
            if (super.field1569 >= 273 && super.field1569 <= 373 && super.field1570 >= 467 && super.field1570 <= 499) {
                this.field107 = (this.field107 + 1) % 3;
                this.field361 = true;
                this.field159 = true;
                this.field106.method4(23, 0);
                this.field106.method5(this.field89);
                this.field106.method5(this.field303);
                this.field106.method5(this.field107);
            }
            if (super.field1569 >= 412 && super.field1569 <= 512 && super.field1570 >= 467 && super.field1570 <= 499) {
                if (this.field68 == -1) {
                    this.method98(4);
                    this.field459 = "";
                    this.field368 = false;
                    for (int var2 = 0; var2 < class8.field574.length; ++var2) {
                        if (class8.field574[var2] != null && class8.field574[var2].field609 == 600) {
                            this.field49 = this.field68 = class8.field574[var2].field584;
                            return;
                        }
                    }
                    return;
                }
                this.method89("Please close the interface you have open before using 'report abuse'", "", (byte) 1, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method71(int arg0) {
        if (arg0 != -37066) {
            this.field106.method5(211);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method512((byte) 38);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field68 != -1 && this.field68 == this.field49) {
                        if (var2 == 8 && this.field459.length() > 0) {
                            this.field459 = this.field459.substring(0, this.field459.length() - 1);
                        }
                        break;
                    }
                    if (this.field52) {
                        if (var2 >= 32 && var2 <= 122 && this.field172.length() < 80) {
                            this.field172 = this.field172 + (char) var2;
                            this.field159 = true;
                        }
                        if (var2 == 8 && this.field172.length() > 0) {
                            this.field172 = this.field172.substring(0, this.field172.length() - 1);
                            this.field159 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field52 = false;
                            this.field159 = true;
                            if (this.field320 == 1) {
                                long var3 = class44.method459(this.field172);
                                this.method51(var3, this.field482);
                            }
                            if (this.field320 == 2 && this.field200 > 0) {
                                long var5 = class44.method459(this.field172);
                                this.method133(var5, this.field369);
                            }
                            if (this.field320 == 3 && this.field172.length() > 0) {
                                this.field106.method4(75, 0);
                                this.field106.method5(0);
                                int var7 = this.field106.field20;
                                this.field106.method11(this.field275, 5);
                                class66.method543((byte) 1, this.field106, this.field172);
                                this.field106.method14(false, this.field106.field20 - var7);
                                this.field172 = class66.method544(-42231, this.field172);
                                this.field172 = class30.method369(-42231, this.field172);
                                this.method89(this.field172, class44.method463((byte) -2, class44.method460(this.field275, -437)), (byte) 1, 6);
                                if (this.field303 == 2) {
                                    this.field303 = 1;
                                    this.field361 = true;
                                    this.field106.method4(23, 0);
                                    this.field106.method5(this.field89);
                                    this.field106.method5(this.field303);
                                    this.field106.method5(this.field107);
                                }
                            }
                            if (this.field320 == 4 && this.field367 < 100) {
                                long var8 = class44.method459(this.field172);
                                this.method33((byte) 61, var8);
                            }
                            if (this.field320 == 5 && this.field367 > 0) {
                                long var10 = class44.method459(this.field172);
                                this.method72(var10, -46474);
                            }
                        }
                    } else if (this.field256) {
                        if (var2 >= 48 && var2 <= 57 && this.field98.length() < 10) {
                            this.field98 = this.field98 + (char) var2;
                            this.field159 = true;
                        }
                        if (var2 == 8 && this.field98.length() > 0) {
                            this.field98 = this.field98.substring(0, this.field98.length() - 1);
                            this.field159 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field98.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field98);
                                } catch (Exception var19) {
                                }
                                this.field106.method4(135, 0);
                                this.field106.method9(var12);
                            }
                            this.field256 = false;
                            this.field159 = true;
                        }
                    } else if (this.field443 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field436.length() < 80) {
                            this.field436 = this.field436 + (char) var2;
                            this.field159 = true;
                        }
                        if (var2 == 8 && this.field436.length() > 0) {
                            this.field436 = this.field436.substring(0, this.field436.length() - 1);
                            this.field159 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field436.length() > 0) {
                            if (this.field465 == 2) {
                                if (this.field436.equals("::clientdrop")) {
                                    this.method127(3);
                                }
                                if (this.field436.equals("::lag")) {
                                    this.method142(this.field193);
                                }
                                if (this.field436.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field167.method186(2, field510); ++var13) {
                                        this.field167.method200(2, false, (byte) 1, var13);
                                    }
                                }
                                if (this.field436.equals("::fpson")) {
                                    field123 = true;
                                }
                                if (this.field436.equals("::fpsoff")) {
                                    field123 = false;
                                }
                            }
                            if (this.field436.startsWith("::")) {
                                this.field106.method4(128, 0);
                                this.field106.method5(this.field436.length() - 1);
                                this.field106.method12(this.field436.substring(2));
                            } else {
                                String var14 = this.field436.toLowerCase();
                                byte var15 = 0;
                                if (var14.startsWith("yellow:")) {
                                    var15 = 0;
                                    this.field436 = this.field436.substring(7);
                                } else if (var14.startsWith("red:")) {
                                    var15 = 1;
                                    this.field436 = this.field436.substring(4);
                                } else if (var14.startsWith("green:")) {
                                    var15 = 2;
                                    this.field436 = this.field436.substring(6);
                                } else if (var14.startsWith("cyan:")) {
                                    var15 = 3;
                                    this.field436 = this.field436.substring(5);
                                } else if (var14.startsWith("purple:")) {
                                    var15 = 4;
                                    this.field436 = this.field436.substring(7);
                                } else if (var14.startsWith("white:")) {
                                    var15 = 5;
                                    this.field436 = this.field436.substring(6);
                                } else if (var14.startsWith("flash1:")) {
                                    var15 = 6;
                                    this.field436 = this.field436.substring(7);
                                } else if (var14.startsWith("flash2:")) {
                                    var15 = 7;
                                    this.field436 = this.field436.substring(7);
                                } else if (var14.startsWith("flash3:")) {
                                    var15 = 8;
                                    this.field436 = this.field436.substring(7);
                                } else if (var14.startsWith("glow1:")) {
                                    var15 = 9;
                                    this.field436 = this.field436.substring(6);
                                } else if (var14.startsWith("glow2:")) {
                                    var15 = 10;
                                    this.field436 = this.field436.substring(6);
                                } else if (var14.startsWith("glow3:")) {
                                    var15 = 11;
                                    this.field436 = this.field436.substring(6);
                                }
                                String var16 = this.field436.toLowerCase();
                                byte var17 = 0;
                                if (var16.startsWith("wave:")) {
                                    var17 = 1;
                                    this.field436 = this.field436.substring(5);
                                } else if (var16.startsWith("wave2:")) {
                                    var17 = 2;
                                    this.field436 = this.field436.substring(6);
                                } else if (var16.startsWith("shake:")) {
                                    var17 = 3;
                                    this.field436 = this.field436.substring(6);
                                } else if (var16.startsWith("scroll:")) {
                                    var17 = 4;
                                    this.field436 = this.field436.substring(7);
                                } else if (var16.startsWith("slide:")) {
                                    var17 = 5;
                                    this.field436 = this.field436.substring(6);
                                }
                                this.field106.method4(202, 0);
                                this.field106.method5(0);
                                int var18 = this.field106.field20;
                                this.field106.method5(var15);
                                this.field106.method5(var17);
                                this.field148.field20 = 0;
                                class66.method543((byte) 1, this.field148, this.field436);
                                this.field106.method13(this.field148.field20, this.field148.field19, -44665, 0);
                                this.field106.method14(false, this.field106.field20 - var18);
                                this.field436 = class66.method544(-42231, this.field436);
                                this.field436 = class30.method369(-42231, this.field436);
                                field444.field1255 = this.field436;
                                field444.field1254 = var15;
                                field444.field1244 = var17;
                                field444.field1297 = 150;
                                if (this.field465 == 2) {
                                    this.method89(field444.field1255, "@cr2@" + field444.field1406, (byte) 1, 2);
                                } else if (this.field465 == 1) {
                                    this.method89(field444.field1255, "@cr1@" + field444.field1406, (byte) 1, 2);
                                } else {
                                    this.method89(field444.field1255, field444.field1406, (byte) 1, 2);
                                }
                                if (this.field89 == 2) {
                                    this.field89 = 3;
                                    this.field361 = true;
                                    this.field106.method4(23, 0);
                                    this.field106.method5(this.field89);
                                    this.field106.method5(this.field303);
                                    this.field106.method5(this.field107);
                                }
                            }
                            this.field436 = "";
                            this.field159 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field459.length() < 12) {
                this.field459 = this.field459 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field393 = Integer.parseInt(this.getParameter("nodeid"));
        field394 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method59(0);
        } else {
            method160(5);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field395 = false;
        } else {
            field395 = true;
        }
        this.method509(false, 765, 503);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method72(long arg0, int arg1) {
        if (arg1 != -46474) {
            this.field166 = !this.field166;
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field367; ++var4) {
                if (this.field207[var4] == arg0) {
                    --this.field367;
                    this.field126 = true;
                    for (int var5 = var4; var5 < this.field367; ++var5) {
                        this.field207[var5] = this.field207[var5 + 1];
                    }
                    this.field106.method4(115, 0);
                    this.field106.method11(arg0, 5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (this.field161 != 0) {
            class39 var2 = this.field410;
            int var3 = 0;
            if (this.field290 == arg0) {
                boolean var4 = false;
            } else {
                this.method146();
            }
            if (this.field493 != 0) {
                var3 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field400[var5] != null) {
                    int var6 = this.field398[var5];
                    String var7 = this.field399[var5];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field303 == 0 || this.field303 == 1 && this.method41(var7, -17594))) {
                        int var9 = 329 - var3 * 13;
                        byte var10 = 4;
                        var2.method436((byte) 0, 0, var9, "From", var10);
                        var2.method436((byte) 0, 65535, var9 - 1, "From", var10);
                        int var11 = var10 + var2.method434(this.field99, "From ");
                        if (var8 == 1) {
                            this.field406[0].method518(var11, var9 - 12, true);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field406[1].method518(var11, var9 - 12, true);
                            var11 += 14;
                        }
                        var2.method436((byte) 0, 0, var9, var7 + ": " + this.field400[var5], var11);
                        var2.method436((byte) 0, 65535, var9 - 1, var7 + ": " + this.field400[var5], var11);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field303 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method436((byte) 0, 0, var12, this.field400[var5], 4);
                        var2.method436((byte) 0, 65535, var12 - 1, this.field400[var5], 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field303 < 2) {
                        int var13 = 329 - var3 * 13;
                        var2.method436((byte) 0, 0, var13, "To " + var7 + ": " + this.field400[var5], 4);
                        var2.method436((byte) 0, 65535, var13 - 1, "To " + var7 + ": " + this.field400[var5], 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LBJPWOXRJ;ZI)V")
    private final void method74(class3 arg0, boolean arg1, int arg2) {
        arg0.method25((byte) -82);
        int var4 = arg0.method26(false, 8);
        this.field473 &= arg1;
        if (var4 < this.field150) {
            for (int var5 = var4; var5 < this.field150; ++var5) {
                this.field284[this.field283++] = this.field151[var5];
            }
        }
        if (var4 > this.field150) {
            signlink.reporterror(this.field205 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field150 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field151[var6];
                class18 var8 = this.field149[var7];
                int var9 = arg0.method26(false, 1);
                if (var9 == 0) {
                    this.field151[this.field150++] = var7;
                    var8.field1263 = field291;
                } else {
                    int var10 = arg0.method26(false, 2);
                    if (var10 == 0) {
                        this.field151[this.field150++] = var7;
                        var8.field1263 = field291;
                        this.field387[this.field386++] = var7;
                    } else if (var10 == 1) {
                        this.field151[this.field150++] = var7;
                        var8.field1263 = field291;
                        int var11 = arg0.method26(false, 3);
                        var8.method449(false, 6, var11);
                        int var12 = arg0.method26(false, 1);
                        if (var12 == 1) {
                            this.field387[this.field386++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field151[this.field150++] = var7;
                        var8.field1263 = field291;
                        int var13 = arg0.method26(false, 3);
                        var8.method449(true, 6, var13);
                        int var14 = arg0.method26(false, 3);
                        var8.method449(true, 6, var14);
                        int var15 = arg0.method26(false, 1);
                        if (var15 == 1) {
                            this.field387[this.field386++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field284[this.field283++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method75(int arg0) {
        ++this.field486;
        this.method36(true, 0);
        this.method53((byte) 7, true);
        this.method36(false, 0);
        this.method53((byte) 7, false);
        this.method172(0);
        this.method124(70);
        if (!this.field44) {
            int var2 = this.field100;
            if (this.field442 / 256 > var2) {
                var2 = this.field442 / 256;
            }
            if (this.field255[4] && this.field302[4] + 128 > var2) {
                var2 = this.field302[4] + 128;
            }
            int var3 = this.field389 + this.field101 & 2047;
            this.method50(this.method94(field444.field1268, 938, field444.field1269, this.field128) - 50, this.field236, this.field235, var2, var3, var2 * 3 + 600, (byte) 2);
        }
        int var4;
        if (!this.field44) {
            var4 = this.method109(11341);
        } else {
            var4 = this.method110(false);
        }
        int var5 = this.field422;
        int var6 = this.field423;
        int var7 = this.field424;
        int var8 = this.field425;
        int var9 = this.field426;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field255[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field239[var10] * 2 + 1) - (double) this.field239[var10] + Math.sin((double) this.field152[var10] / 100.0D * (double) this.field300[var10]) * (double) this.field302[var10]);
                if (var10 == 0) {
                    this.field422 += var12;
                }
                if (var10 == 1) {
                    this.field423 += var12;
                }
                if (var10 == 2) {
                    this.field424 += var12;
                }
                if (var10 == 3) {
                    this.field426 = this.field426 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field425 += var12;
                    if (this.field425 < 128) {
                        this.field425 = 128;
                    }
                    if (this.field425 > 383) {
                        this.field425 = 383;
                    }
                }
            }
        }
        int var11 = class12.field703;
        if (arg0 < 6 || arg0 > 6) {
            this.field63 = !this.field63;
        }
        class26.field1006 = true;
        class26.field1009 = 0;
        class26.field1007 = super.field1562 - 4;
        class26.field1008 = super.field1563 - 4;
        class13.method226(false);
        this.field253.method284(-46607, var4, this.field422, this.field423, this.field425, this.field426, this.field424);
        this.field253.method259((byte) 1);
        this.method100((byte) 9);
        this.method102(16122);
        this.method148(-19775, var11);
        this.method68(0);
        this.field243.method546(super.field1554, 4, -52, 4);
        this.field422 = var5;
        this.field423 = var6;
        this.field424 = var7;
        this.field425 = var8;
        this.field426 = var9;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method76(boolean arg0) {
        if (arg0) {
            this.field258 = -1;
        }
        if (super.field1568 == 1) {
            if (super.field1569 >= 539 && super.field1569 <= 573 && super.field1570 >= 169 && super.field1570 < 205 && this.field208[0] != -1) {
                this.field126 = true;
                this.field450 = 0;
                this.field163 = true;
            }
            if (super.field1569 >= 569 && super.field1569 <= 599 && super.field1570 >= 168 && super.field1570 < 205 && this.field208[1] != -1) {
                this.field126 = true;
                this.field450 = 1;
                this.field163 = true;
            }
            if (super.field1569 >= 597 && super.field1569 <= 627 && super.field1570 >= 168 && super.field1570 < 205 && this.field208[2] != -1) {
                this.field126 = true;
                this.field450 = 2;
                this.field163 = true;
            }
            if (super.field1569 >= 625 && super.field1569 <= 669 && super.field1570 >= 168 && super.field1570 < 203 && this.field208[3] != -1) {
                this.field126 = true;
                this.field450 = 3;
                this.field163 = true;
            }
            if (super.field1569 >= 666 && super.field1569 <= 696 && super.field1570 >= 168 && super.field1570 < 205 && this.field208[4] != -1) {
                this.field126 = true;
                this.field450 = 4;
                this.field163 = true;
            }
            if (super.field1569 >= 694 && super.field1569 <= 724 && super.field1570 >= 168 && super.field1570 < 205 && this.field208[5] != -1) {
                this.field126 = true;
                this.field450 = 5;
                this.field163 = true;
            }
            if (super.field1569 >= 722 && super.field1569 <= 756 && super.field1570 >= 169 && super.field1570 < 205 && this.field208[6] != -1) {
                this.field126 = true;
                this.field450 = 6;
                this.field163 = true;
            }
            if (super.field1569 >= 540 && super.field1569 <= 574 && super.field1570 >= 466 && super.field1570 < 502 && this.field208[7] != -1) {
                this.field126 = true;
                this.field450 = 7;
                this.field163 = true;
            }
            if (super.field1569 >= 572 && super.field1569 <= 602 && super.field1570 >= 466 && super.field1570 < 503 && this.field208[8] != -1) {
                this.field126 = true;
                this.field450 = 8;
                this.field163 = true;
            }
            if (super.field1569 >= 599 && super.field1569 <= 629 && super.field1570 >= 466 && super.field1570 < 503 && this.field208[9] != -1) {
                this.field126 = true;
                this.field450 = 9;
                this.field163 = true;
            }
            if (super.field1569 >= 627 && super.field1569 <= 671 && super.field1570 >= 467 && super.field1570 < 502 && this.field208[10] != -1) {
                this.field126 = true;
                this.field450 = 10;
                this.field163 = true;
            }
            if (super.field1569 >= 669 && super.field1569 <= 699 && super.field1570 >= 466 && super.field1570 < 503 && this.field208[11] != -1) {
                this.field126 = true;
                this.field450 = 11;
                this.field163 = true;
            }
            if (super.field1569 >= 696 && super.field1569 <= 726 && super.field1570 >= 466 && super.field1570 < 503 && this.field208[12] != -1) {
                this.field126 = true;
                this.field450 = 12;
                this.field163 = true;
            }
            if (super.field1569 >= 724 && super.field1569 <= 758 && super.field1570 >= 466 && super.field1570 < 502 && this.field208[13] != -1) {
                this.field126 = true;
                this.field450 = 13;
                this.field163 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field356) {
            this.method103((byte) 5);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method77(int arg0) {
        int var2 = 79 / arg0;
        int var3 = 5;
        this.field221[8] = 0;
        int var4 = 0;
        while (this.field221[8] == 0) {
            String var5 = "Unknown problem";
            this.method166("Connecting to web server", 20, -799);
            try {
                DataInputStream var6 = this.method44("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 306);
                class3 var7 = new class3(false, new byte[40]);
                var6.readFully(var7.field19, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field221[var8] = var7.method20();
                }
                int var9 = var7.method20();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field221[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field221[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field221[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field221[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field221[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field221[8] == 0) {
                ++var4;
                for (int var12 = var3; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method166("Game updated - please reload page", 10, -799);
                        var12 = 10;
                    } else {
                        this.method166(var5 + " - Will retry in " + var12 + " secs.", 10, -799);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var13) {
                    }
                }
                var3 *= 2;
                if (var3 > 60) {
                    var3 = 60;
                }
                this.field278 = !this.field278;
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method78(int arg0) {
        if (arg0 != -9317) {
            this.field258 = this.field282.method15();
        }
        for (int var2 = 0; var2 < this.field150; ++var2) {
            int var3 = this.field151[var2];
            class18 var4 = this.field149[var3];
            if (var4 != null) {
                this.method79(var4, (byte) 44, var4.field841.field1471);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNUUJCJXB;BI)V")
    public final void method79(class40 arg0, byte arg1, int arg2) {
        if (arg0.field1268 < 128 || arg0.field1269 < 128 || arg0.field1268 >= 13184 || arg0.field1269 >= 13184) {
            arg0.field1291 = -1;
            arg0.field1256 = -1;
            arg0.field1250 = 0;
            arg0.field1251 = 0;
            arg0.field1268 = arg0.field1276[0] * 128 + arg0.field1262 * 64;
            arg0.field1269 = arg0.field1277[0] * 128 + arg0.field1262 * 64;
            arg0.method448(false);
        }
        if (field444 == arg0 && (arg0.field1268 < 1536 || arg0.field1269 < 1536 || arg0.field1268 >= 11776 || arg0.field1269 >= 11776)) {
            arg0.field1291 = -1;
            arg0.field1256 = -1;
            arg0.field1250 = 0;
            arg0.field1251 = 0;
            arg0.field1268 = arg0.field1276[0] * 128 + arg0.field1262 * 64;
            arg0.field1269 = arg0.field1277[0] * 128 + arg0.field1262 * 64;
            arg0.method448(false);
        }
        if (arg0.field1250 > field291) {
            this.method80(arg0, true);
        } else if (arg0.field1251 >= field291) {
            this.method81(0, arg0);
        } else {
            this.method82(arg0, this.field270);
        }
        this.method83(arg0, this.field337);
        if (arg1 != 44) {
            this.method146();
        }
        this.method84(arg0, -29665);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNUUJCJXB;Z)V")
    public final void method80(class40 arg0, boolean arg1) {
        int var3 = arg0.field1250 - field291;
        int var4 = arg0.field1262 * 64 + arg0.field1246 * 128;
        int var5 = arg0.field1262 * 64 + arg0.field1248 * 128;
        arg0.field1268 += (var4 - arg0.field1268) / var3;
        this.field473 &= arg1;
        arg0.field1269 += (var5 - arg0.field1269) / var3;
        arg0.field1296 = 0;
        if (arg0.field1252 == 0) {
            arg0.field1253 = 1024;
        }
        if (arg0.field1252 == 1) {
            arg0.field1253 = 1536;
        }
        if (arg0.field1252 == 2) {
            arg0.field1253 = 0;
        }
        if (arg0.field1252 == 3) {
            arg0.field1253 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILNUUJCJXB;)V")
    public final void method81(int arg0, class40 arg1) {
        if (field291 == arg1.field1251 || arg1.field1291 == -1 || arg1.field1294 != 0 || arg1.field1293 + 1 > class42.field1314[arg1.field1291].method457(arg1.field1292, this.field321)) {
            int var3 = arg1.field1251 - arg1.field1250;
            int var4 = field291 - arg1.field1250;
            int var5 = arg1.field1262 * 64 + arg1.field1246 * 128;
            int var6 = arg1.field1262 * 64 + arg1.field1248 * 128;
            int var7 = arg1.field1262 * 64 + arg1.field1247 * 128;
            int var8 = arg1.field1262 * 64 + arg1.field1249 * 128;
            arg1.field1268 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1269 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1296 = 0;
        if (arg1.field1252 == 0) {
            arg1.field1253 = 1024;
        }
        if (arg1.field1252 == 1) {
            arg1.field1253 = 1536;
        }
        if (arg1.field1252 == 2) {
            arg1.field1253 = 0;
        }
        if (arg1.field1252 == 3) {
            arg1.field1253 = 512;
        }
        arg1.field1270 = arg1.field1253;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LNUUJCJXB;Z)V")
    public final void method82(class40 arg0, boolean arg1) {
        arg0.field1283 = arg0.field1299;
        if (arg1) {
            if (arg0.field1298 == 0) {
                arg0.field1296 = 0;
            } else {
                if (arg0.field1291 != -1 && arg0.field1294 == 0) {
                    class42 var3 = class42.field1314[arg0.field1291];
                    if (arg0.field1301 > 0 && var3.field1326 == 0) {
                        ++arg0.field1296;
                        return;
                    }
                    if (arg0.field1301 <= 0 && var3.field1327 == 0) {
                        ++arg0.field1296;
                        return;
                    }
                }
                int var4 = arg0.field1268;
                int var5 = arg0.field1269;
                int var6 = arg0.field1276[arg0.field1298 - 1] * 128 + arg0.field1262 * 64;
                int var7 = arg0.field1277[arg0.field1298 - 1] * 128 + arg0.field1262 * 64;
                if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                    if (var4 < var6) {
                        if (var5 < var7) {
                            arg0.field1253 = 1280;
                        } else if (var5 > var7) {
                            arg0.field1253 = 1792;
                        } else {
                            arg0.field1253 = 1536;
                        }
                    } else if (var4 > var6) {
                        if (var5 < var7) {
                            arg0.field1253 = 768;
                        } else if (var5 > var7) {
                            arg0.field1253 = 256;
                        } else {
                            arg0.field1253 = 512;
                        }
                    } else if (var5 < var7) {
                        arg0.field1253 = 1024;
                    } else {
                        arg0.field1253 = 0;
                    }
                    int var8 = arg0.field1253 - arg0.field1270 & 2047;
                    if (var8 > 1024) {
                        var8 -= 2048;
                    }
                    int var9 = arg0.field1288;
                    if (var8 >= -256 && var8 <= 256) {
                        var9 = arg0.field1287;
                    } else if (var8 >= 256 && var8 < 768) {
                        var9 = arg0.field1290;
                    } else if (var8 >= -768 && var8 <= -256) {
                        var9 = arg0.field1289;
                    }
                    if (var9 == -1) {
                        var9 = arg0.field1287;
                    }
                    arg0.field1283 = var9;
                    int var10 = 4;
                    if (arg0.field1270 != arg0.field1253 && arg0.field1280 == -1 && arg0.field1275 != 0) {
                        var10 = 2;
                    }
                    if (arg0.field1298 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field1298 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field1296 > 0 && arg0.field1298 > 1) {
                        var10 = 8;
                        --arg0.field1296;
                    }
                    if (arg0.field1286[arg0.field1298 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field1287 == arg0.field1283 && arg0.field1261 != -1) {
                        arg0.field1283 = arg0.field1261;
                    }
                    if (var4 < var6) {
                        arg0.field1268 += var10;
                        if (arg0.field1268 > var6) {
                            arg0.field1268 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field1268 -= var10;
                        if (arg0.field1268 < var6) {
                            arg0.field1268 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field1269 += var10;
                        if (arg0.field1269 > var7) {
                            arg0.field1269 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field1269 -= var10;
                        if (arg0.field1269 < var7) {
                            arg0.field1269 = var7;
                        }
                    }
                    if (arg0.field1268 == var6 && arg0.field1269 == var7) {
                        --arg0.field1298;
                        if (arg0.field1301 > 0) {
                            --arg0.field1301;
                            return;
                        }
                    }
                } else {
                    arg0.field1268 = var6;
                    arg0.field1269 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNUUJCJXB;I)V")
    public final void method83(class40 arg0, int arg1) {
        if (arg1 >= 0) {
            this.field449 = 441;
        }
        if (arg0.field1275 != 0) {
            if (arg0.field1280 != -1 && arg0.field1280 < 32768) {
                class18 var3 = this.field149[arg0.field1280];
                if (var3 != null) {
                    int var4 = arg0.field1268 - var3.field1268;
                    int var5 = arg0.field1269 - var3.field1269;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field1253 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1280 >= 32768) {
                int var6 = arg0.field1280 - 32768;
                if (this.field54 == var6) {
                    var6 = this.field382;
                }
                class48 var7 = this.field383[var6];
                if (var7 != null) {
                    int var8 = arg0.field1268 - var7.field1268;
                    int var9 = arg0.field1269 - var7.field1269;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field1253 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1278 != 0 || arg0.field1279 != 0) && (arg0.field1298 == 0 || arg0.field1296 > 0)) {
                int var10 = arg0.field1268 - (arg0.field1278 - this.field310 - this.field310) * 64;
                int var11 = arg0.field1269 - (arg0.field1279 - this.field311 - this.field311) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field1253 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field1278 = 0;
                arg0.field1279 = 0;
            }
            int var12 = arg0.field1253 - arg0.field1270 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field1275 && var12 <= 2048 - arg0.field1275) {
                    if (var12 > 1024) {
                        arg0.field1270 -= arg0.field1275;
                    } else {
                        arg0.field1270 += arg0.field1275;
                    }
                } else {
                    arg0.field1270 = arg0.field1253;
                }
                arg0.field1270 &= 2047;
                if (arg0.field1299 == arg0.field1283 && arg0.field1270 != arg0.field1253) {
                    if (arg0.field1300 != -1) {
                        arg0.field1283 = arg0.field1300;
                        return;
                    }
                    arg0.field1283 = arg0.field1287;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LNUUJCJXB;I)V")
    public final void method84(class40 arg0, int arg1) {
        if (arg1 != -29665) {
            this.field106.method5(250);
        }
        arg0.field1282 = false;
        if (arg0.field1283 != -1) {
            class42 var3 = class42.field1314[arg0.field1283];
            ++arg0.field1285;
            if (arg0.field1284 < var3.field1315 && arg0.field1285 > var3.method457(arg0.field1284, this.field321)) {
                arg0.field1285 = 0;
                ++arg0.field1284;
            }
            if (arg0.field1284 >= var3.field1315) {
                arg0.field1285 = 0;
                arg0.field1284 = 0;
            }
        }
        if (arg0.field1256 != -1 && field291 >= arg0.field1259) {
            if (arg0.field1257 < 0) {
                arg0.field1257 = 0;
            }
            class42 var4 = class35.field1198[arg0.field1256].field1202;
            ++arg0.field1258;
            while (arg0.field1257 < var4.field1315 && arg0.field1258 > var4.method457(arg0.field1257, this.field321)) {
                arg0.field1258 -= var4.method457(arg0.field1257, this.field321);
                ++arg0.field1257;
            }
            if (arg0.field1257 >= var4.field1315 && (arg0.field1257 < 0 || arg0.field1257 >= var4.field1315)) {
                arg0.field1256 = -1;
            }
        }
        if (arg0.field1291 != -1 && arg0.field1294 <= 1) {
            class42 var5 = class42.field1314[arg0.field1291];
            if (var5.field1326 == 1 && arg0.field1301 > 0 && arg0.field1250 <= field291 && arg0.field1251 < field291) {
                arg0.field1294 = 1;
                return;
            }
        }
        if (arg0.field1291 != -1 && arg0.field1294 == 0) {
            class42 var6 = class42.field1314[arg0.field1291];
            ++arg0.field1293;
            while (arg0.field1292 < var6.field1315 && arg0.field1293 > var6.method457(arg0.field1292, this.field321)) {
                arg0.field1293 -= var6.method457(arg0.field1292, this.field321);
                ++arg0.field1292;
            }
            if (arg0.field1292 >= var6.field1315) {
                arg0.field1292 -= var6.field1319;
                ++arg0.field1295;
                if (arg0.field1295 >= var6.field1325) {
                    arg0.field1291 = -1;
                }
                if (arg0.field1292 < 0 || arg0.field1292 >= var6.field1315) {
                    arg0.field1291 = -1;
                }
            }
            arg0.field1282 = var6.field1321;
        }
        if (arg0.field1294 > 0) {
            --arg0.field1294;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (this.field408) {
            this.field408 = false;
            this.field338.method546(super.field1554, 4, -52, 0);
            this.field339.method546(super.field1554, 357, -52, 0);
            this.field340.method546(super.field1554, 4, -52, 722);
            this.field341.method546(super.field1554, 205, -52, 743);
            this.field342.method546(super.field1554, 0, -52, 0);
            this.field343.method546(super.field1554, 4, -52, 516);
            this.field344.method546(super.field1554, 205, -52, 516);
            this.field345.method546(super.field1554, 357, -52, 496);
            this.field346.method546(super.field1554, 338, -52, 0);
            this.field126 = true;
            this.field159 = true;
            this.field163 = true;
            this.field361 = true;
            if (this.field466 != 2) {
                this.field243.method546(super.field1554, 4, -52, 4);
                this.field242.method546(super.field1554, 4, -52, 550);
            }
        }
        if (this.field466 == 2) {
            this.method75(6);
        }
        if (this.field117 && this.field92 == 1) {
            this.field126 = true;
        }
        if (this.field314 != -1) {
            boolean var2 = this.method128(false, this.field56, this.field314);
            if (var2) {
                this.field126 = true;
            }
        }
        if (this.field326 == 2) {
            this.field126 = true;
        }
        if (this.field231 == 2) {
            this.field126 = true;
        }
        if (this.field126) {
            this.method111(2);
            this.field126 = false;
        }
        if (this.field443 == -1) {
            this.field335.field599 = this.field419 - this.field248 - 77;
            if (super.field1562 > 448 && super.field1562 < 560 && super.field1563 > 332) {
                this.method90(super.field1562 - 17, 891, super.field1563 - 357, false, 77, 463, 0, this.field419, this.field335);
            }
            int var3 = this.field419 - 77 - this.field335.field599;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field419 - 77) {
                var3 = this.field419 - 77;
            }
            if (this.field248 != var3) {
                this.field248 = var3;
                this.field159 = true;
            }
        }
        if (this.field443 != -1) {
            boolean var4 = this.method128(false, this.field56, this.field443);
            if (var4) {
                this.field159 = true;
            }
        }
        if (this.field326 == 3) {
            this.field159 = true;
        }
        if (this.field231 == 3) {
            this.field159 = true;
        }
        if (this.field365 != null) {
            this.field159 = true;
        }
        if (this.field117 && this.field92 == 2) {
            this.field159 = true;
        }
        if (this.field159) {
            this.method126(7);
            this.field159 = false;
        }
        if (this.field466 == 2) {
            this.method67(163);
            this.field242.method546(super.field1554, 4, -52, 550);
            ++field254;
            if (field254 > 75) {
                field254 = 0;
                this.field106.method4(172, 0);
            }
        }
        if (this.field220 != -1) {
            this.field163 = true;
        }
        if (this.field163) {
            if (this.field220 != -1 && this.field450 == this.field220) {
                this.field220 = -1;
                this.field106.method4(74, 0);
                this.field106.method5(this.field450);
            }
            this.field163 = false;
            this.field377.method545(16595);
            this.field114.method518(0, 0, true);
            if (this.field314 == -1) {
                if (this.field208[this.field450] != -1) {
                    if (this.field450 == 0) {
                        this.field329.method518(22, 10, true);
                    }
                    if (this.field450 == 1) {
                        this.field330.method518(54, 8, true);
                    }
                    if (this.field450 == 2) {
                        this.field330.method518(82, 8, true);
                    }
                    if (this.field450 == 3) {
                        this.field331.method518(110, 8, true);
                    }
                    if (this.field450 == 4) {
                        this.field333.method518(153, 8, true);
                    }
                    if (this.field450 == 5) {
                        this.field333.method518(181, 8, true);
                    }
                    if (this.field450 == 6) {
                        this.field332.method518(209, 9, true);
                    }
                }
                if (this.field208[0] != -1 && (this.field220 != 0 || field291 % 20 < 10)) {
                    this.field354[0].method518(29, 13, true);
                }
                if (this.field208[1] != -1 && (this.field220 != 1 || field291 % 20 < 10)) {
                    this.field354[1].method518(53, 11, true);
                }
                if (this.field208[2] != -1 && (this.field220 != 2 || field291 % 20 < 10)) {
                    this.field354[2].method518(82, 11, true);
                }
                if (this.field208[3] != -1 && (this.field220 != 3 || field291 % 20 < 10)) {
                    this.field354[3].method518(115, 12, true);
                }
                if (this.field208[4] != -1 && (this.field220 != 4 || field291 % 20 < 10)) {
                    this.field354[4].method518(153, 13, true);
                }
                if (this.field208[5] != -1 && (this.field220 != 5 || field291 % 20 < 10)) {
                    this.field354[5].method518(180, 11, true);
                }
                if (this.field208[6] != -1 && (this.field220 != 6 || field291 % 20 < 10)) {
                    this.field354[6].method518(208, 13, true);
                }
            }
            this.field377.method546(super.field1554, 160, -52, 516);
            this.field376.method545(16595);
            this.field113.method518(0, 0, true);
            if (this.field314 == -1) {
                if (this.field208[this.field450] != -1) {
                    if (this.field450 == 7) {
                        this.field222.method518(42, 0, true);
                    }
                    if (this.field450 == 8) {
                        this.field223.method518(74, 0, true);
                    }
                    if (this.field450 == 9) {
                        this.field223.method518(102, 0, true);
                    }
                    if (this.field450 == 10) {
                        this.field224.method518(130, 1, true);
                    }
                    if (this.field450 == 11) {
                        this.field226.method518(173, 0, true);
                    }
                    if (this.field450 == 12) {
                        this.field226.method518(201, 0, true);
                    }
                    if (this.field450 == 13) {
                        this.field225.method518(229, 0, true);
                    }
                }
                if (this.field208[8] != -1 && (this.field220 != 8 || field291 % 20 < 10)) {
                    this.field354[7].method518(74, 2, true);
                }
                if (this.field208[9] != -1 && (this.field220 != 9 || field291 % 20 < 10)) {
                    this.field354[8].method518(102, 3, true);
                }
                if (this.field208[10] != -1 && (this.field220 != 10 || field291 % 20 < 10)) {
                    this.field354[9].method518(137, 4, true);
                }
                if (this.field208[11] != -1 && (this.field220 != 11 || field291 % 20 < 10)) {
                    this.field354[10].method518(174, 2, true);
                }
                if (this.field208[12] != -1 && (this.field220 != 12 || field291 % 20 < 10)) {
                    this.field354[11].method518(201, 2, true);
                }
                if (this.field208[13] != -1 && (this.field220 != 13 || field291 % 20 < 10)) {
                    this.field354[12].method518(226, 2, true);
                }
            }
            this.field376.method546(super.field1554, 466, -52, 496);
            this.field243.method545(16595);
        }
        if (this.field361) {
            this.field361 = false;
            this.field375.method545(16595);
            this.field112.method518(0, 0, true);
            this.field410.method433(16777215, "Public chat", true, 55, 28, true);
            if (this.field89 == 0) {
                this.field410.method433(65280, "On", true, 55, 41, true);
            }
            if (this.field89 == 1) {
                this.field410.method433(16776960, "Friends", true, 55, 41, true);
            }
            if (this.field89 == 2) {
                this.field410.method433(16711680, "Off", true, 55, 41, true);
            }
            if (this.field89 == 3) {
                this.field410.method433(65535, "Hide", true, 55, 41, true);
            }
            this.field410.method433(16777215, "Private chat", true, 184, 28, true);
            if (this.field303 == 0) {
                this.field410.method433(65280, "On", true, 184, 41, true);
            }
            if (this.field303 == 1) {
                this.field410.method433(16776960, "Friends", true, 184, 41, true);
            }
            if (this.field303 == 2) {
                this.field410.method433(16711680, "Off", true, 184, 41, true);
            }
            this.field410.method433(16777215, "Trade/compete", true, 324, 28, true);
            if (this.field107 == 0) {
                this.field410.method433(65280, "On", true, 324, 41, true);
            }
            if (this.field107 == 1) {
                this.field410.method433(16776960, "Friends", true, 324, 41, true);
            }
            if (this.field107 == 2) {
                this.field410.method433(16711680, "Off", true, 324, 41, true);
            }
            this.field410.method433(16777215, "Report abuse", true, 458, 33, true);
            this.field375.method546(super.field1554, 453, -52, 0);
            this.field243.method545(16595);
        }
        this.field56 = 0;
        if (arg0 != -33393) {
            this.method146();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field253.method271(arg0, arg1, arg3);
        this.field257 += arg4;
        if (var7 != 0) {
            int var8 = this.field253.method275(arg0, arg1, arg3, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg2;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field433.field1693;
            int var13 = (103 - arg3) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class32 var15 = class32.method401(var14);
            if (var15.field1125 != -1) {
                class57 var16 = this.field66[var15.field1125];
                if (var16 != null) {
                    int var17 = (var15.field1086 * 4 - var16.field1586) / 2;
                    int var18 = (var15.field1116 * 4 - var16.field1587) / 2;
                    var16.method518(arg1 * 4 + 48 + var17, (104 - arg3 - var15.field1116) * 4 + 48 + var18, true);
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
        int var19 = this.field253.method273(arg0, arg1, arg3);
        if (var19 != 0) {
            int var20 = this.field253.method275(arg0, arg1, arg3, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class32 var24 = class32.method401(var23);
            if (var24.field1125 != -1) {
                class57 var25 = this.field66[var24.field1125];
                if (var25 != null) {
                    int var26 = (var24.field1086 * 4 - var25.field1586) / 2;
                    int var27 = (var24.field1116 * 4 - var25.field1587) / 2;
                    var25.method518(arg1 * 4 + 48 + var26, (104 - arg3 - var24.field1116) * 4 + 48 + var27, true);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field433.field1693;
                int var30 = (103 - arg3) * 512 * 4 + arg1 * 4 + 24624;
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
        int var31 = this.field253.method274(arg0, arg1, arg3);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class32 var33 = class32.method401(var32);
            if (var33.field1125 != -1) {
                class57 var34 = this.field66[var33.field1125];
                if (var34 != null) {
                    int var35 = (var33.field1086 * 4 - var34.field1586) / 2;
                    int var36 = (var33.field1116 * 4 - var34.field1587) / 2;
                    var34.method518(arg1 * 4 + 48 + var35, (104 - arg3 - var33.field1116) * 4 + 48 + var36, true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILNUUJCJXB;)V")
    public final void method87(byte arg0, int arg1, class40 arg2) {
        this.method88(arg1, arg2.field1269, arg2.field1268, 3);
        if (arg0 != 6) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
            int var5 = this.method94(arg2, 938, arg1, this.field128) - arg0;
            int var6 = arg2 - this.field422;
            int var7 = var5 - this.field423;
            int var8 = arg1 - this.field424;
            if (arg3 != 3) {
                this.method146();
            }
            int var9 = class26.field1011[this.field425];
            int var10 = class26.field1012[this.field425];
            int var11 = class26.field1011[this.field426];
            int var12 = class26.field1012[this.field426];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field491 = (var13 << 9) / var17 + class12.field688;
                this.field492 = (var16 << 9) / var17 + class12.field689;
            } else {
                this.field491 = -1;
                this.field492 = -1;
            }
        } else {
            this.field491 = -1;
            this.field492 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
    public final void method89(String arg0, String arg1, byte arg2, int arg3) {
        if (arg3 == 0 && this.field469 != -1) {
            this.field365 = arg0;
            super.field1568 = 0;
        }
        if (this.field443 == -1) {
            this.field159 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field398[var5] = this.field398[var5 - 1];
            this.field399[var5] = this.field399[var5 - 1];
            this.field400[var5] = this.field400[var5 - 1];
        }
        this.field398[0] = arg3;
        this.field399[0] = arg1;
        if (arg2 == 1) {
            boolean var6 = false;
        } else {
            this.field449 = this.field87.method203();
        }
        this.field400[0] = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZIIIILETSIPTYG;)V")
    public final void method90(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class8 arg8) {
        if (this.field245) {
            this.field57 = 32;
        } else {
            this.field57 = 0;
        }
        this.field245 = false;
        if (arg1 <= 0) {
            this.field193 = !this.field193;
        }
        if (arg0 >= arg5 && arg0 < arg5 + 16 && arg2 >= arg6 && arg2 < arg6 + 16) {
            arg8.field599 -= this.field272 * 4;
            if (arg3) {
                this.field126 = true;
                return;
            }
        } else if (arg0 >= arg5 && arg0 < arg5 + 16 && arg2 >= arg4 + arg6 - 16 && arg2 < arg4 + arg6) {
            arg8.field599 += this.field272 * 4;
            if (arg3) {
                this.field126 = true;
                return;
            }
        } else {
            if (arg0 < arg5 - this.field57 || arg0 >= arg5 + 16 + this.field57 || arg2 < arg6 + 16 || arg2 >= arg4 + arg6 - 16 || this.field272 <= 0) {
                return;
            }
            int var10 = (arg4 - 32) * arg4 / arg7;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg2 - arg6 - 16 - var10 / 2;
            int var12 = arg4 - 32 - var10;
            arg8.field599 = (arg7 - arg4) * var11 / var12;
            if (arg3) {
                this.field126 = true;
            }
            this.field245 = true;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method91(boolean arg0) {
        short var2 = 256;
        if (this.field194 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field194 > 768) {
                    this.field316[var3] = this.method118(218, this.field317[var3], 1024 - this.field194, this.field318[var3]);
                } else if (this.field194 > 256) {
                    this.field316[var3] = this.field318[var3];
                } else {
                    this.field316[var3] = this.method118(218, this.field318[var3], 256 - this.field194, this.field317[var3]);
                }
            }
        } else if (this.field195 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field195 > 768) {
                    this.field316[var4] = this.method118(218, this.field317[var4], 1024 - this.field195, this.field319[var4]);
                } else if (this.field195 > 256) {
                    this.field316[var4] = this.field319[var4];
                } else {
                    this.field316[var4] = this.method118(218, this.field319[var4], 256 - this.field195, this.field317[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field316[var5] = this.field317[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field142.field1676[var6] = this.field181.field1693[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field180[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field512[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field316[var26];
                    int var30 = this.field142.field1676[var8];
                    this.field142.field1676[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field473 &= arg0;
        this.field142.method546(super.field1554, 0, -52, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field143.field1676[var10] = this.field182.field1693[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field180[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field512[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field316[var18];
                    int var22 = this.field143.field1676[var16];
                    this.field143.field1676[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field143.method546(super.field1554, 0, -52, 637);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLTKCVVLIT;)V")
    public final void method92(byte arg0, class57 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field169.length; ++var4) {
            this.field169[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field169[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field170[var16] = (this.field169[var16 - 1] + this.field169[var16 + 1] + this.field169[var16 - 128] + this.field169[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field169;
            this.field169 = this.field170;
            this.field170 = var14;
        }
        if (arg0 == 9) {
            if (arg1 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg1.field1587; ++var8) {
                    for (int var9 = 0; var9 < arg1.field1586; ++var9) {
                        if (arg1.field1584[var7++] != 0) {
                            int var10 = var9 + 16 + arg1.field1588;
                            int var11 = var8 + 16 + arg1.field1589;
                            int var12 = (var11 << 7) + var10;
                            this.field169[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILBJPWOXRJ;I)V")
    private final void method93(int arg0, class3 arg1, int arg2) {
        while (true) {
            if (arg1.field21 + 10 < arg2 * 8) {
                int var4 = arg1.method26(false, 11);
                if (var4 != 2047) {
                    if (this.field383[var4] == null) {
                        this.field383[var4] = new class48();
                        if (this.field388[var4] != null) {
                            this.field383[var4].method467((byte) 3, this.field388[var4]);
                        }
                    }
                    this.field385[this.field384++] = var4;
                    class48 var5 = this.field383[var4];
                    var5.field1263 = field291;
                    int var6 = arg1.method26(false, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method26(false, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method26(false, 1);
                    int var9 = arg1.method26(false, 1);
                    if (var9 == 1) {
                        this.field387[this.field386++] = var4;
                    }
                    var5.method450(field444.field1277[0] + var7, var8 == 1, false, field444.field1276[0] + var6);
                    continue;
                }
            }
            arg1.method27(0);
            int var10 = 30 / arg0;
            return;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method94(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg2 >> 7;
        int var7 = 37 / arg1;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var8 = arg3;
            if (arg3 < 3 && (this.field392[1][var5][var6] & 2) == 2) {
                var8 = arg3 + 1;
            }
            int var9 = arg0 & 127;
            int var10 = arg2 & 127;
            int var11 = (128 - var9) * this.field73[var8][var5][var6] + this.field73[var8][var5 + 1][var6] * var9 >> 7;
            int var12 = (128 - var9) * this.field73[var8][var5][var6 + 1] + this.field73[var8][var5 + 1][var6 + 1] * var9 >> 7;
            return (128 - var10) * var11 + var10 * var12 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method95(int arg0) {
        for (int var2 = 0; var2 < this.field174; ++var2) {
            if (this.field70[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field488[var2] == this.field477 && this.field374[var2] == this.field292) {
                        if (!this.method64(this.field265)) {
                            var3 = true;
                        }
                    } else {
                        class3 var4 = class14.method236(-178, this.field374[var2], this.field488[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field20 / 22) > (long) (this.field240 / 22) + this.field91) {
                            this.field240 = var4.field20;
                            this.field91 = System.currentTimeMillis();
                            if (this.method40(var4.field20, var4.field19, (byte) 0)) {
                                this.field477 = this.field488[var2];
                                this.field292 = this.field374[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                }
                if (var3 && this.field70[var2] != -5) {
                    this.field70[var2] = -5;
                } else {
                    --this.field174;
                    for (int var6 = var2; var6 < this.field174; ++var6) {
                        this.field488[var6] = this.field488[var6 + 1];
                        this.field374[var6] = this.field374[var6 + 1];
                        this.field70[var6] = this.field70[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field70[var2]--;
            }
        }
        int var7 = 10 / arg0;
        if (this.field116 > 0) {
            this.field116 -= 20;
            if (this.field116 < 0) {
                this.field116 = 0;
            }
            if (this.field116 == 0 && this.field53 && !field396) {
                this.field427 = this.field404;
                this.field428 = true;
                this.field167.method190(2, this.field427);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method96(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method97(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field467 = "";
                this.field468 = "Connecting to server...";
                this.method116(this.field75, true);
            }
            this.field202 = new class25(this.method129(field394 + 43594), -24798, this);
            long var4 = class44.method459(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field106.field20 = 0;
            this.field106.method5(14);
            this.field106.method5(var6);
            this.field202.method322(this.field106.field19, 2, 0, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field202.method319();
            }
            int var8 = this.field202.method319();
            int var9 = var8;
            if (var8 == 0) {
                this.field202.method321(this.field282.field19, 0, 8);
                this.field282.field20 = 0;
                this.field55 = this.field282.method21((byte) 7);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field55 >> 32), (int) this.field55 };
                this.field106.field20 = 0;
                this.field106.method5(10);
                this.field106.method9(var10[0]);
                this.field106.method9(var10[1]);
                this.field106.method9(var10[2]);
                this.field106.method9(var10[3]);
                this.field106.method9(signlink.uid);
                this.field106.method12(arg0);
                this.field106.method12(arg1);
                this.field106.method30(7, field508, field127);
                this.field61.field20 = 0;
                if (arg2) {
                    this.field61.method5(18);
                } else {
                    this.field61.method5(16);
                }
                this.field61.method5(this.field106.field20 + 36 + 1 + 1 + 2);
                this.field61.method5(255);
                this.field61.method6(306);
                this.field61.method5(field396 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field61.method9(this.field221[var11]);
                }
                this.field61.method13(this.field106.field20, this.field106.field19, -44665, 0);
                this.field106.field24 = new class11(var10, false);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field87 = new class11(var10, false);
                this.field202.method322(this.field61.field19, this.field61.field20, 0, 0);
                var8 = this.field202.method319();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method97(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field465 = this.field202.method319();
                field421 = this.field202.method319() == 1;
                this.field499 = 0L;
                this.field435 = 0;
                this.field472.field1386 = 0;
                super.field1559 = true;
                this.field71 = true;
                this.field473 = true;
                this.field106.field20 = 0;
                this.field282.field20 = 0;
                this.field258 = -1;
                this.field438 = -1;
                this.field439 = -1;
                this.field440 = -1;
                this.field257 = 0;
                this.field259 = 0;
                this.field493 = 0;
                this.field261 = 0;
                this.field298 = 0;
                this.field273 = 0;
                this.field117 = false;
                super.field1560 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field400[var13] = null;
                }
                this.field516 = 0;
                this.field175 = 0;
                this.field466 = 0;
                this.field174 = 0;
                this.field480 = (int) (Math.random() * 100.0D) - 50;
                this.field85 = (int) (Math.random() * 110.0D) - 55;
                this.field389 = (int) (Math.random() * 80.0D) - 40;
                this.field81 = (int) (Math.random() * 120.0D) - 60;
                this.field183 = (int) (Math.random() * 30.0D) - 20;
                this.field101 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field115 = 0;
                this.field505 = -1;
                this.field431 = 0;
                this.field432 = 0;
                this.field384 = 0;
                this.field150 = 0;
                for (int var14 = 0; var14 < this.field381; ++var14) {
                    this.field383[var14] = null;
                    this.field388[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field149[var15] = null;
                }
                field444 = this.field383[this.field382] = new class48();
                this.field119.method475();
                this.field322.method475();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field171[var16][var17][var18] = null;
                        }
                    }
                }
                this.field504 = new class50(field137);
                this.field201 = 0;
                this.field200 = 0;
                this.field469 = -1;
                this.field443 = -1;
                this.field68 = -1;
                this.field314 = -1;
                this.field299 = -1;
                this.field76 = false;
                this.field450 = 3;
                this.field256 = false;
                this.field117 = false;
                this.field52 = false;
                this.field365 = null;
                this.field110 = 0;
                this.field220 = -1;
                this.field506 = true;
                this.method69(1);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field451[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field494[var20] = null;
                    this.field495[var20] = false;
                }
                field420 = 0;
                field69 = 0;
                field327 = 0;
                field129 = 0;
                field118 = 0;
                field511 = 0;
                field251 = 0;
                field474 = 0;
                field522 = 0;
                field88 = 0;
                this.method170(field111);
            } else if (var8 == 3) {
                this.field467 = "";
                this.field468 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field467 = "Your account has been disabled.";
                this.field468 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field467 = "Your account is already logged in.";
                this.field468 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field467 = "RuneScape has been updated!";
                this.field468 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field467 = "This world is full.";
                this.field468 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field467 = "Unable to connect.";
                this.field468 = "Login server offline.";
            } else if (var8 == 9) {
                this.field467 = "Login limit exceeded.";
                this.field468 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field467 = "Unable to connect.";
                this.field468 = "Bad session id.";
            } else if (var8 == 11) {
                this.field468 = "Login server rejected session.";
                this.field468 = "Please try again.";
            } else if (var8 == 12) {
                this.field467 = "You need a members account to login to this world.";
                this.field468 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field467 = "Could not complete login.";
                this.field468 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field467 = "The server is being updated.";
                this.field468 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field473 = true;
                this.field106.field20 = 0;
                this.field282.field20 = 0;
                this.field258 = -1;
                this.field438 = -1;
                this.field439 = -1;
                this.field440 = -1;
                this.field257 = 0;
                this.field259 = 0;
                this.field493 = 0;
                this.field273 = 0;
                this.field117 = false;
                this.field366 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field467 = "Login attempts exceeded.";
                this.field468 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field467 = "You are standing in a members-only area.";
                this.field468 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field467 = "Invalid loginserver requested";
                this.field468 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field347 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field347;
                            this.method97(arg0, arg1, arg2);
                        } else {
                            this.field467 = "No response from loginserver";
                            this.field468 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field467 = "No response from server";
                        this.field468 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field467 = "Unexpected server response";
                    this.field468 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field202.method319(); var21 >= 0; --var21) {
                    this.field467 = "You have only just left another world";
                    this.field468 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method116(this.field75, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method97(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field467 = "";
            this.field468 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method98(int arg0) {
        this.field106.method4(148, 0);
        if (this.field314 != -1) {
            this.field314 = -1;
            this.field126 = true;
            this.field76 = false;
            this.field163 = true;
        }
        if (this.field443 != -1) {
            this.field443 = -1;
            this.field159 = true;
            this.field76 = false;
        }
        this.field68 = -1;
        if (arg0 < 4 || arg0 > 4) {
            this.field321 = !this.field321;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method99(int arg0) {
        Graphics var2 = this.method143(true).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method511(1, 8);
        if (arg0 < 8 || arg0 > 8) {
            field158 = 286;
        }
        if (this.field179) {
            this.field120 = false;
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
        if (this.field189) {
            this.field120 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field521) {
            this.field120 = false;
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

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method100(byte arg0) {
        this.field210 = 0;
        for (int var2 = -1; var2 < this.field384 + this.field150; ++var2) {
            class40 var21;
            if (var2 == -1) {
                var21 = field444;
            } else if (var2 < this.field384) {
                var21 = this.field383[this.field385[var2]];
            } else {
                var21 = this.field149[this.field151[var2 - this.field384]];
            }
            if (var21 != null && var21.method297(false)) {
                if (var21 instanceof class18) {
                    class52 var22 = ((class18) var21).field841;
                    if (var22.field1464 != null) {
                        var22 = var22.method487(this.field160);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field384) {
                    class52 var26 = ((class18) var21).field841;
                    if (var26.field1459 >= 0 && var26.field1459 < this.field269.length) {
                        this.method87((byte) 6, var21.field1267 + 15, var21);
                        if (this.field491 > -1) {
                            this.field269[var26.field1459].method553(this.field491 - 12, this.field492 - 30, true);
                        }
                    }
                    if (this.field298 == 1 && this.field151[var2 - this.field384] == this.field157 && field291 % 20 < 10) {
                        this.method87((byte) 6, var21.field1267 + 15, var21);
                        if (this.field491 > -1) {
                            this.field269[2].method553(this.field491 - 12, this.field492 - 28, true);
                        }
                    }
                } else {
                    int var23 = 30;
                    class48 var24 = (class48) var21;
                    if (var24.field1432 != 0) {
                        this.method87((byte) 6, var21.field1267 + 15, var21);
                        if (this.field491 > -1) {
                            for (int var25 = 0; var25 < 8; ++var25) {
                                if ((var24.field1432 & 1 << var25) != 0) {
                                    this.field269[var25].method553(this.field491 - 12, this.field492 - var23, true);
                                    var23 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field298 == 10 && this.field385[var2] == this.field391) {
                        this.method87((byte) 6, var21.field1267 + 15, var21);
                        if (this.field491 > -1) {
                            this.field269[7].method553(this.field491 - 12, this.field492 - var23, true);
                        }
                    }
                }
                if (var21.field1255 != null && (var2 >= this.field384 || this.field89 == 0 || this.field89 == 3 || this.field89 == 1 && this.method41(((class48) var21).field1406, -17594))) {
                    this.method87((byte) 6, var21.field1267, var21);
                    if (this.field491 > -1 && this.field210 < this.field211) {
                        this.field215[this.field210] = this.field411.method435(var21.field1255, 0) / 2;
                        this.field214[this.field210] = this.field411.field1241;
                        this.field212[this.field210] = this.field491;
                        this.field213[this.field210] = this.field492;
                        this.field216[this.field210] = var21.field1254;
                        this.field217[this.field210] = var21.field1244;
                        this.field218[this.field210] = var21.field1297;
                        this.field219[this.field210++] = var21.field1255;
                        if (this.field109 == 0 && var21.field1244 >= 1 && var21.field1244 <= 3) {
                            this.field214[this.field210] += 10;
                            this.field213[this.field210] += 5;
                        }
                        if (this.field109 == 0 && var21.field1244 == 4) {
                            this.field215[this.field210] = 60;
                        }
                        if (this.field109 == 0 && var21.field1244 == 5) {
                            this.field214[this.field210] += 5;
                        }
                    }
                }
                if (var21.field1271 > field291) {
                    this.method87((byte) 6, var21.field1267 + 15, var21);
                    if (this.field491 > -1) {
                        int var27 = var21.field1272 * 30 / var21.field1273;
                        if (var27 > 30) {
                            var27 = 30;
                        }
                        class13.method228(this.field492 - 3, 5, var27, this.field491 - 15, 65280, true);
                        class13.method228(this.field492 - 3, 5, 30 - var27, this.field491 - 15 + var27, 16711680, true);
                    }
                }
                for (int var28 = 0; var28 < 4; ++var28) {
                    if (var21.field1266[var28] > field291) {
                        this.method87((byte) 6, var21.field1267 / 2, var21);
                        if (this.field491 > -1) {
                            if (var28 == 1) {
                                this.field492 -= 20;
                            }
                            if (var28 == 2) {
                                this.field491 -= 15;
                                this.field492 -= 10;
                            }
                            if (var28 == 3) {
                                this.field491 += 15;
                                this.field492 -= 10;
                            }
                            this.field509[var21.field1265[var28]].method553(this.field491 - 12, this.field492 - 12, true);
                            this.field409.method432(this.field491, this.field492 + 4, 190, String.valueOf(var21.field1264[var28]), 0);
                            this.field409.method432(this.field491 - 1, this.field492 + 3, 190, String.valueOf(var21.field1264[var28]), 16777215);
                        }
                    }
                }
            }
        }
        ++field168;
        if (arg0 == 9) {
            boolean var3 = false;
        } else {
            this.field125 = -434;
        }
        if (field168 > 1007) {
            field168 = 0;
            this.field106.method4(47, 0);
            this.field106.method5(0);
            int var4 = this.field106.field20;
            this.field106.method6((int) (Math.random() * 65536.0D));
            this.field106.method6((int) (Math.random() * 65536.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field106.method5(88);
            }
            this.field106.method6(42477);
            this.field106.method5(117);
            this.field106.method5(85);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field106.method6(14901);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field106.method5(77);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field106.method6(9441);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field106.method6(57204);
            }
            this.field106.method14(false, this.field106.field20 - var4);
        }
        for (int var5 = 0; var5 < this.field210; ++var5) {
            int var6 = this.field212[var5];
            int var7 = this.field213[var5];
            int var8 = this.field215[var5];
            int var9 = this.field214[var5];
            boolean var10 = true;
            while (var10) {
                var10 = false;
                for (int var20 = 0; var20 < var5; ++var20) {
                    if (var7 + 2 > this.field213[var20] - this.field214[var20] && var7 - var9 < this.field213[var20] + 2 && var6 - var8 < this.field215[var20] + this.field212[var20] && var6 + var8 > this.field212[var20] - this.field215[var20] && this.field213[var20] - this.field214[var20] < var7) {
                        var7 = this.field213[var20] - this.field214[var20];
                        var10 = true;
                    }
                }
            }
            this.field491 = this.field212[var5];
            this.field492 = this.field213[var5] = var7;
            String var11 = this.field219[var5];
            if (this.field109 == 0) {
                int var12 = 16776960;
                if (this.field216[var5] < 6) {
                    var12 = this.field357[this.field216[var5]];
                }
                if (this.field216[var5] == 6) {
                    var12 = this.field486 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field216[var5] == 7) {
                    var12 = this.field486 % 20 < 10 ? 255 : 65535;
                }
                if (this.field216[var5] == 8) {
                    var12 = this.field486 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field216[var5] == 9) {
                    int var13 = 150 - this.field218[var5];
                    if (var13 < 50) {
                        var12 = var13 * 1280 + 16711680;
                    } else if (var13 < 100) {
                        var12 = 16776960 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var12 = (var13 - 100) * 5 + 65280;
                    }
                }
                if (this.field216[var5] == 10) {
                    int var14 = 150 - this.field218[var5];
                    if (var14 < 50) {
                        var12 = var14 * 5 + 16711680;
                    } else if (var14 < 100) {
                        var12 = 16711935 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var12 = (var14 - 100) * 327680 + 255 - (var14 - 100) * 5;
                    }
                }
                if (this.field216[var5] == 11) {
                    int var15 = 150 - this.field218[var5];
                    if (var15 < 50) {
                        var12 = 16777215 - var15 * 327685;
                    } else if (var15 < 100) {
                        var12 = (var15 - 50) * 327685 + 65280;
                    } else if (var15 < 150) {
                        var12 = 16777215 - (var15 - 100) * 327680;
                    }
                }
                if (this.field217[var5] == 0) {
                    this.field411.method432(this.field491, this.field492 + 1, 190, var11, 0);
                    this.field411.method432(this.field491, this.field492, 190, var11, var12);
                }
                if (this.field217[var5] == 1) {
                    this.field411.method437(this.field492 + 1, var11, this.field491, this.field486, 0, 0);
                    this.field411.method437(this.field492, var11, this.field491, this.field486, 0, var12);
                }
                if (this.field217[var5] == 2) {
                    this.field411.method438(this.field491, this.field486, 28025, var11, this.field492 + 1, 0);
                    this.field411.method438(this.field491, this.field486, 28025, var11, this.field492, var12);
                }
                if (this.field217[var5] == 3) {
                    this.field411.method439(this.field491, 0, this.field486, this.field492 + 1, -858, 150 - this.field218[var5], var11);
                    this.field411.method439(this.field491, var12, this.field486, this.field492, -858, 150 - this.field218[var5], var11);
                }
                if (this.field217[var5] == 4) {
                    int var16 = this.field411.method435(var11, 0);
                    int var17 = (150 - this.field218[var5]) * (var16 + 100) / 150;
                    class13.method225(334, this.field491 - 50, -841, this.field491 + 50, 0);
                    this.field411.method436((byte) 0, 0, this.field492 + 1, var11, this.field491 + 50 - var17);
                    this.field411.method436((byte) 0, var12, this.field492, var11, this.field491 + 50 - var17);
                    class13.method224(false);
                }
                if (this.field217[var5] == 5) {
                    int var18 = 150 - this.field218[var5];
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class13.method225(this.field492 + 5, 0, -841, 512, this.field492 - this.field411.field1241 - 1);
                    this.field411.method432(this.field491, this.field492 + 1 + var19, 190, var11, 0);
                    this.field411.method432(this.field491, this.field492 + var19, 190, var11, var12);
                    class13.method224(false);
                }
            } else {
                this.field411.method432(this.field491, this.field492 + 1, 190, var11, 0);
                this.field411.method432(this.field491, this.field492, 190, var11, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method101(boolean arg0) {
        if (this.field139 == null) {
            super.field1555 = null;
            this.field244 = null;
            this.field242 = null;
            this.field241 = null;
            this.field243 = null;
            this.field375 = null;
            this.field376 = null;
            this.field473 &= arg0;
            this.field377 = null;
            this.field142 = new class68(128, (byte) -48, this.method143(true), 265);
            class13.method226(false);
            this.field143 = new class68(128, (byte) -48, this.method143(true), 265);
            class13.method226(false);
            this.field139 = new class68(509, (byte) -48, this.method143(true), 171);
            class13.method226(false);
            this.field140 = new class68(360, (byte) -48, this.method143(true), 132);
            class13.method226(false);
            this.field141 = new class68(360, (byte) -48, this.method143(true), 200);
            class13.method226(false);
            this.field144 = new class68(202, (byte) -48, this.method143(true), 238);
            class13.method226(false);
            this.field145 = new class68(203, (byte) -48, this.method143(true), 238);
            class13.method226(false);
            this.field146 = new class68(74, (byte) -48, this.method143(true), 94);
            class13.method226(false);
            this.field147 = new class68(75, (byte) -48, this.method143(true), 94);
            class13.method226(false);
            if (this.field487 != null) {
                this.method155(0);
                this.method46(true);
            }
            this.field408 = true;
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method102(int arg0) {
        if (arg0 != 16122) {
            this.field337 = this.field87.method203();
        }
        if (this.field298 == 2) {
            this.method88(this.field455 * 2, (this.field454 - this.field311 << 7) + this.field457, (this.field453 - this.field310 << 7) + this.field456, 3);
            if (this.field491 > -1 && field291 % 20 < 10) {
                this.field269[2].method553(this.field491 - 12, this.field492 - 28, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method103(byte arg0) {
        this.field507 = true;
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field449 = -452;
        }
        try {
            long var3 = System.currentTimeMillis();
            int var5 = 0;
            int var6 = 20;
            while (this.field120) {
                ++this.field348;
                this.method141(-463);
                this.method141(-463);
                this.method91(true);
                ++var5;
                if (var5 > 10) {
                    long var7 = System.currentTimeMillis();
                    int var9 = (int) (var7 - var3) / 10 - var6;
                    var6 = 40 - var9;
                    if (var6 < 5) {
                        var6 = 5;
                    }
                    var5 = 0;
                    var3 = var7;
                }
                try {
                    Thread.sleep((long) var6);
                } catch (Exception var10) {
                }
            }
        } catch (Exception var11) {
        }
        this.field507 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILETSIPTYG;)I")
    public final int method104(int arg0, int arg1, class8 arg2) {
        if (arg1 <= 0) {
            this.field258 = this.field282.method15();
        }
        if (arg2.field548 != null && arg0 < arg2.field548.length) {
            try {
                int[] var4 = arg2.field548[arg0];
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
                        var9 = this.field403[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field84[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field476[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class8 var11 = class8.field574[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class33.field1147 && (!class33.method409(var12).field1175 || field395)) {
                            for (int var13 = 0; var13 < var11.field582.length; ++var13) {
                                if (var12 + 1 == var11.field582[var13]) {
                                    var9 += var11.field585[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field59[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field252[this.field84[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field59[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field444.field1424;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class46.field1391; ++var14) {
                            if (class46.field1393[var14]) {
                                var9 += this.field84[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class8 var15 = class8.field574[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class33.field1147 && (!class33.method409(var16).field1175 || field395)) {
                            for (int var17 = 0; var17 < var15.field582.length; ++var17) {
                                if (var15.field582[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field104;
                    }
                    if (var8 == 12) {
                        var9 = this.field190;
                    }
                    if (var8 == 13) {
                        int var18 = this.field59[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class5 var21 = class5.field36[var20];
                        int var22 = var21.field38;
                        int var23 = var21.field39;
                        int var24 = var21.field40;
                        int var25 = field156[var24 - var23];
                        var9 = this.field59[var22] >> var23 & var25;
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
                        var9 = (field444.field1268 >> 7) + this.field310;
                    }
                    if (var8 == 19) {
                        var9 = (field444.field1269 >> 7) + this.field311;
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

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method105(int arg0) {
        this.field496 = 0;
        if (arg0 != 0) {
            this.field125 = -128;
        }
        int var2 = (field444.field1268 >> 7) + this.field310;
        int var3 = (field444.field1269 >> 7) + this.field311;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field496 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field496 = 1;
        }
        if (this.field496 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field496 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)Z")
    public final boolean method106(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field253.method275(this.field128, arg1, arg0, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method138(field444.field1277[0], field444.field1276[0], var7 + 1, arg1, 0, 303, var8, false, 0, arg0, 0, 2);
            } else {
                class32 var9 = class32.method401(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1116;
                    var11 = var9.field1086;
                } else {
                    var10 = var9.field1086;
                    var11 = var9.field1116;
                }
                int var12 = var9.field1106;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method138(field444.field1277[0], field444.field1276[0], 0, arg1, var11, 303, 0, false, var10, arg0, var12, 2);
            }
            this.field196 = super.field1569;
            this.field197 = super.field1570;
            this.field199 = 2;
            this.field198 = 0;
            if (arg2 != -6818) {
                field289 = 476;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;I)LMNPBQFWE;")
    public final class37 method107(int arg0, int arg1, String arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field51[0] != null) {
                var7 = this.field51[0].method424(674, arg3);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field478.reset();
            this.field478.update(var7);
            int var9 = (int) this.field478.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class37(17074, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method166("Requesting " + arg4, arg0, -799);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method44(arg2 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class3 var17 = new class3(false, var16);
                    var17.field20 = 3;
                    int var18 = var17.method19() + 6;
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
                            this.method166("Loading " + arg4 + " - " + var23 + "%", arg0, -799);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field51[0] != null) {
                            this.field51[0].method425(arg3, (byte) -41, var7.length, var7);
                        }
                    } catch (Exception var29) {
                        this.field51[0] = null;
                    }
                    if (var7 != null) {
                        this.field478.reset();
                        this.field478.update(var7);
                        int var24 = (int) this.field478.getValue();
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
                            this.method166("Game updated - please reload page", arg0, -799);
                            var26 = 10;
                        } else {
                            this.method166(var12 + " - Retrying in " + var26, arg0, -799);
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
                    this.field278 = !this.field278;
                }
            }
            class37 var27 = new class37(17074, var7);
            while (arg1 >= 0) {
                this.field106.method5(127);
            }
            return var27;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        if (this.field449 != arg0) {
            this.field258 = -1;
        }
        if (!this.field521 && !this.field179 && !this.field189) {
            ++field291;
            if (!this.field473) {
                this.method54((byte) 5);
            } else {
                this.method154(false);
            }
            this.method60(true);
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)I")
    public final int method109(int arg0) {
        int var2 = 3;
        if (this.field90 != arg0) {
            this.field171 = null;
        }
        if (this.field425 < 310) {
            int var3 = this.field422 >> 7;
            int var4 = this.field424 >> 7;
            int var5 = field444.field1268 >> 7;
            int var6 = field444.field1269 >> 7;
            if ((this.field392[this.field128][var3][var4] & 4) != 0) {
                var2 = this.field128;
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
                    if ((this.field392[this.field128][var3][var4] & 4) != 0) {
                        var2 = this.field128;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field392[this.field128][var3][var4] & 4) != 0) {
                            var2 = this.field128;
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
                    if ((this.field392[this.field128][var3][var4] & 4) != 0) {
                        var2 = this.field128;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field392[this.field128][var3][var4] & 4) != 0) {
                            var2 = this.field128;
                        }
                    }
                }
            }
        }
        if ((this.field392[this.field128][field444.field1268 >> 7][field444.field1269 >> 7] & 4) != 0) {
            var2 = this.field128;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)I")
    public final int method110(boolean arg0) {
        if (arg0) {
            this.field258 = this.field282.method15();
        }
        int var2 = this.method94(this.field422, 938, this.field424, this.field128);
        return var2 - this.field423 < 800 && (this.field392[this.field128][this.field422 >> 7][this.field424 >> 7] & 4) != 0 ? this.field128 : 3;
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method111(int arg0) {
        this.field241.method545(16595);
        if (arg0 != 2) {
            this.field270 = !this.field270;
        }
        class12.field694 = this.field286;
        this.field362.method518(0, 0, true);
        if (this.field314 != -1) {
            this.method112(0, 0, 0, 24182, class8.field574[this.field314]);
        } else if (this.field208[this.field450] != -1) {
            this.method112(0, 0, 0, 24182, class8.field574[this.field208[this.field450]]);
        }
        if (this.field117 && this.field92 == 1) {
            this.method122((byte) 4);
        }
        this.field241.method546(super.field1554, 205, -52, 553);
        this.field243.method545(16595);
        class12.field694 = this.field287;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILETSIPTYG;)V")
    public final void method112(int arg0, int arg1, int arg2, int arg3, class8 arg4) {
        if (arg4.field568 == 0 && arg4.field600 != null) {
            if (!arg4.field565 || this.field124 == arg4.field581 || this.field372 == arg4.field581 || this.field413 == arg4.field581) {
                int var6 = class13.field714;
                int var7 = class13.field712;
                int var8 = class13.field715;
                int var9 = class13.field713;
                class13.method225(arg4.field557 + arg1, arg0, -841, arg4.field601 + arg0, arg1);
                if (arg3 != 24182) {
                    this.field67 = this.field87.method203();
                }
                int var10 = arg4.field600.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field570[var11] + arg0;
                    int var13 = arg4.field562[var11] + arg1 - arg2;
                    class8 var14 = class8.field574[arg4.field600[var11]];
                    int var15 = var14.field575 + var12;
                    int var16 = var14.field579 + var13;
                    if (var14.field609 > 0) {
                        this.method144((byte) 2, var14);
                    }
                    if (var14.field568 == 0) {
                        if (var14.field599 > var14.field547 - var14.field557) {
                            var14.field599 = var14.field547 - var14.field557;
                        }
                        if (var14.field599 < 0) {
                            var14.field599 = 0;
                        }
                        this.method112(var15, var16, var14.field599, 24182, var14);
                        if (var14.field547 > var14.field557) {
                            this.method151(0, var14.field557, var14.field547, var16, var14.field601 + var15, var14.field599);
                        }
                    } else if (var14.field568 != 1) {
                        if (var14.field568 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field557; ++var18) {
                                for (int var19 = 0; var19 < var14.field601; ++var19) {
                                    int var20 = (var14.field593 + 32) * var19 + var15;
                                    int var21 = (var14.field613 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field573[var17];
                                        var21 += var14.field563[var17];
                                    }
                                    if (var14.field582[var17] <= 0) {
                                        if (var14.field560 != null && var17 < 20) {
                                            class70 var30 = var14.field560[var17];
                                            if (var30 != null) {
                                                var30.method553(var20, var21, true);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field582[var17] - 1;
                                        if (var20 > class13.field714 - 32 && var20 < class13.field715 && var21 > class13.field712 - 32 && var21 < class13.field713 || this.field231 != 0 && this.field230 == var17) {
                                            int var25 = 0;
                                            if (this.field516 == 1 && this.field517 == var17 && this.field518 == var14.field581) {
                                                var25 = 16777215;
                                            }
                                            class70 var26 = class33.method419(var25, var14.field585[var17], var24, (byte) 9);
                                            if (var26 != null) {
                                                if (this.field231 != 0 && this.field230 == var17 && this.field229 == var14.field581) {
                                                    var22 = super.field1562 - this.field232;
                                                    var23 = super.field1563 - this.field233;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field72 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method555(this.field246, var20 + var22, var21 + var23, 128);
                                                    if (var21 + var23 < class13.field712 && arg4.field599 > 0) {
                                                        int var27 = (class13.field712 - var21 - var23) * this.field56 / 3;
                                                        if (var27 > this.field56 * 10) {
                                                            var27 = this.field56 * 10;
                                                        }
                                                        if (var27 > arg4.field599) {
                                                            var27 = arg4.field599;
                                                        }
                                                        arg4.field599 -= var27;
                                                        this.field233 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class13.field713 && arg4.field599 < arg4.field547 - arg4.field557) {
                                                        int var28 = (var21 + var23 + 32 - class13.field713) * this.field56 / 3;
                                                        if (var28 > this.field56 * 10) {
                                                            var28 = this.field56 * 10;
                                                        }
                                                        if (var28 > arg4.field547 - arg4.field557 - arg4.field599) {
                                                            var28 = arg4.field547 - arg4.field557 - arg4.field599;
                                                        }
                                                        arg4.field599 += var28;
                                                        this.field233 -= var28;
                                                    }
                                                } else if (this.field326 != 0 && this.field325 == var17 && this.field324 == var14.field581) {
                                                    var26.method555(this.field246, var20, var21, 128);
                                                } else {
                                                    var26.method553(var20, var21, true);
                                                }
                                                if (var26.field1698 == 33 || var14.field585[var17] != 1) {
                                                    int var29 = var14.field585[var17];
                                                    this.field409.method436((byte) 0, 0, var21 + 10 + var23, method57(true, var29), var20 + 1 + var22);
                                                    this.field409.method436((byte) 0, 16776960, var21 + 9 + var23, method57(true, var29), var20 + var22);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field568 == 3) {
                            boolean var31 = false;
                            if (this.field413 == var14.field581 || this.field372 == var14.field581 || this.field124 == var14.field581) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method165(var14, 261)) {
                                var32 = var14.field569;
                                if (var31 && var14.field566 != 0) {
                                    var32 = var14.field566;
                                }
                            } else {
                                var32 = var14.field614;
                                if (var31 && var14.field586 != 0) {
                                    var32 = var14.field586;
                                }
                            }
                            if (var14.field571 == 0) {
                                if (var14.field587) {
                                    class13.method228(var16, var14.field557, var14.field601, var15, var32, true);
                                } else {
                                    class13.method229(var15, var14.field557, var14.field601, var16, (byte) 118, var32);
                                }
                            } else if (var14.field587) {
                                class13.method227(var14.field557, var32, var16, var15, 256 - (var14.field571 & 255), (byte) 3, var14.field601);
                            } else {
                                class13.method230(var14.field601, var15, var16, var14.field557, 256 - (var14.field571 & 255), var32, (byte) 6);
                            }
                        } else if (var14.field568 == 4) {
                            class39 var33 = var14.field590;
                            String var34 = var14.field572;
                            boolean var35 = false;
                            if (this.field413 == var14.field581 || this.field372 == var14.field581 || this.field124 == var14.field581) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method165(var14, 261)) {
                                var36 = var14.field569;
                                if (var35 && var14.field566 != 0) {
                                    var36 = var14.field566;
                                }
                                if (var14.field556.length() > 0) {
                                    var34 = var14.field556;
                                }
                            } else {
                                var36 = var14.field614;
                                if (var35 && var14.field586 != 0) {
                                    var36 = var14.field586;
                                }
                            }
                            if (var14.field608 == 6 && this.field76) {
                                var34 = "Please wait...";
                                var36 = var14.field614;
                            }
                            if (class13.field710 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1241 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method63(false, this.method104(4, 142, var14)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method63(false, this.method104(3, 142, var14)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method63(false, this.method104(2, 142, var14)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method63(false, this.method104(1, 142, var14)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method63(false, this.method104(0, 142, var14)) + var34.substring(var38 + 2);
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
                                if (var14.field592) {
                                    var33.method433(var36, var44, true, var14.field601 / 2 + var15, var37, var14.field559);
                                } else {
                                    var33.method440(var44, var37, var36, var15, 696, var14.field559);
                                }
                                var37 += var33.field1241;
                            }
                        } else if (var14.field568 == 5) {
                            class70 var45;
                            if (this.method165(var14, 261)) {
                                var45 = var14.field583;
                            } else {
                                var45 = var14.field610;
                            }
                            if (var45 != null) {
                                var45.method553(var15, var16, true);
                            }
                        } else if (var14.field568 == 6) {
                            int var46 = class12.field688;
                            int var47 = class12.field689;
                            class12.field688 = var14.field601 / 2 + var15;
                            class12.field689 = var14.field557 / 2 + var16;
                            int var48 = class12.field692[var14.field577] * var14.field576 >> 16;
                            int var49 = class12.field693[var14.field577] * var14.field576 >> 16;
                            boolean var50 = this.method165(var14, 261);
                            int var51;
                            if (var50) {
                                var51 = var14.field606;
                            } else {
                                var51 = var14.field605;
                            }
                            class26 var52;
                            if (var51 == -1) {
                                var52 = var14.method180(var50, -1, -1, 0);
                            } else {
                                class42 var53 = class42.field1314[var51];
                                var52 = var14.method180(var50, var53.field1316[var14.field567], var53.field1317[var14.field567], 0);
                            }
                            if (var52 != null) {
                                var52.method348(0, var14.field578, 0, var14.field577, 0, var48, var49);
                            }
                            class12.field688 = var46;
                            class12.field689 = var47;
                        } else if (var14.field568 == 7) {
                            class39 var54 = var14.field590;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field557; ++var56) {
                                for (int var57 = 0; var57 < var14.field601; ++var57) {
                                    if (var14.field582[var55] > 0) {
                                        class33 var58 = class33.method409(var14.field582[var55] - 1);
                                        String var59 = var58.field1156;
                                        if (var58.field1182 || var14.field585[var55] != 1) {
                                            var59 = var59 + " x" + method123(-45360, var14.field585[var55]);
                                        }
                                        int var60 = (var14.field593 + 115) * var57 + var15;
                                        int var61 = (var14.field613 + 12) * var56 + var16;
                                        if (var14.field592) {
                                            var54.method433(var14.field614, var59, true, var14.field601 / 2 + var60, var61, var14.field559);
                                        } else {
                                            var54.method440(var59, var61, var14.field614, var60, 696, var14.field559);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                class13.method225(var9, var6, -841, var8, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Z")
    public final boolean method113(int arg0, boolean arg1) {
        this.field473 &= arg1;
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field502[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 927;
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field516 == 0 && this.field175 == 0) {
            this.field262[this.field273] = "Walk here";
            this.field502[this.field273] = 762;
            this.field500[this.field273] = super.field1562;
            this.field501[this.field273] = super.field1563;
            ++this.field273;
        }
        int var3 = -1;
        for (int var4 = 0; var4 < class26.field1009; ++var4) {
            int var5 = class26.field1010[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var3 != var5) {
                var3 = var5;
                if (var8 == 2 && this.field253.method275(this.field128, var6, var7, var5) >= 0) {
                    class32 var10 = class32.method401(var9);
                    if (var10.field1085 != null) {
                        var10 = var10.method397(965);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field516 == 1) {
                        this.field262[this.field273] = "Use " + this.field520 + " with @cya@" + var10.field1114;
                        this.field502[this.field273] = 680;
                        this.field503[this.field273] = var5;
                        this.field500[this.field273] = var6;
                        this.field501[this.field273] = var7;
                        ++this.field273;
                    } else if (this.field175 == 1) {
                        if ((this.field177 & 4) == 4) {
                            this.field262[this.field273] = this.field178 + " @cya@" + var10.field1114;
                            this.field502[this.field273] = 505;
                            this.field503[this.field273] = var5;
                            this.field500[this.field273] = var6;
                            this.field501[this.field273] = var7;
                            ++this.field273;
                        }
                    } else {
                        if (var10.field1091 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1091[var11] != null) {
                                    this.field262[this.field273] = var10.field1091[var11] + " @cya@" + var10.field1114;
                                    if (var11 == 0) {
                                        this.field502[this.field273] = 447;
                                    }
                                    if (var11 == 1) {
                                        this.field502[this.field273] = 147;
                                    }
                                    if (var11 == 2) {
                                        this.field502[this.field273] = 473;
                                    }
                                    if (var11 == 3) {
                                        this.field502[this.field273] = 945;
                                    }
                                    if (var11 == 4) {
                                        this.field502[this.field273] = 1521;
                                    }
                                    this.field503[this.field273] = var5;
                                    this.field500[this.field273] = var6;
                                    this.field501[this.field273] = var7;
                                    ++this.field273;
                                }
                            }
                        }
                        this.field262[this.field273] = "Examine @cya@" + var10.field1114;
                        this.field502[this.field273] = 1132;
                        this.field503[this.field273] = var10.field1103 << 14;
                        this.field500[this.field273] = var6;
                        this.field501[this.field273] = var7;
                        ++this.field273;
                    }
                }
                if (var8 == 1) {
                    class18 var12 = this.field149[var9];
                    if (var12.field841.field1471 == 1 && (var12.field1268 & 127) == 64 && (var12.field1269 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field150; ++var13) {
                            class18 var16 = this.field149[this.field151[var13]];
                            if (var16 != null && var12 != var16 && var16.field841.field1471 == 1 && var12.field1268 == var16.field1268 && var12.field1269 == var16.field1269) {
                                this.method43(this.field151[var13], var7, var16.field841, this.field188, var6);
                            }
                        }
                        for (int var14 = 0; var14 < this.field384; ++var14) {
                            class48 var15 = this.field383[this.field385[var14]];
                            if (var15 != null && var12.field1268 == var15.field1268 && var12.field1269 == var15.field1269) {
                                this.method139(false, var6, this.field385[var14], var15, var7);
                            }
                        }
                    }
                    this.method43(var9, var7, var12.field841, this.field188, var6);
                }
                if (var8 == 0) {
                    class48 var17 = this.field383[var9];
                    if ((var17.field1268 & 127) == 64 && (var17.field1269 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field150; ++var18) {
                            class18 var21 = this.field149[this.field151[var18]];
                            if (var21 != null && var21.field841.field1471 == 1 && var17.field1268 == var21.field1268 && var17.field1269 == var21.field1269) {
                                this.method43(this.field151[var18], var7, var21.field841, this.field188, var6);
                            }
                        }
                        for (int var19 = 0; var19 < this.field384; ++var19) {
                            class48 var20 = this.field383[this.field385[var19]];
                            if (var20 != null && var17 != var20 && var17.field1268 == var20.field1268 && var17.field1269 == var20.field1269) {
                                this.method139(false, var6, this.field385[var19], var20, var7);
                            }
                        }
                    }
                    this.method139(false, var6, var9, var17, var7);
                }
                if (var8 == 3) {
                    class50 var22 = this.field171[this.field128][var6][var7];
                    if (var22 != null) {
                        for (class69 var23 = (class69) var22.method472(-147); var23 != null; var23 = (class69) var22.method474((byte) 7)) {
                            class33 var24 = class33.method409(var23.field1683);
                            if (this.field516 == 1) {
                                this.field262[this.field273] = "Use " + this.field520 + " with @lre@" + var24.field1156;
                                this.field502[this.field273] = 109;
                                this.field503[this.field273] = var23.field1683;
                                this.field500[this.field273] = var6;
                                this.field501[this.field273] = var7;
                                ++this.field273;
                            } else if (this.field175 == 1) {
                                if ((this.field177 & 1) == 1) {
                                    this.field262[this.field273] = this.field178 + " @lre@" + var24.field1156;
                                    this.field502[this.field273] = 51;
                                    this.field503[this.field273] = var23.field1683;
                                    this.field500[this.field273] = var6;
                                    this.field501[this.field273] = var7;
                                    ++this.field273;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1167 != null && var24.field1167[var25] != null) {
                                        this.field262[this.field273] = var24.field1167[var25] + " @lre@" + var24.field1156;
                                        if (var25 == 0) {
                                            this.field502[this.field273] = 454;
                                        }
                                        if (var25 == 1) {
                                            this.field502[this.field273] = 511;
                                        }
                                        if (var25 == 2) {
                                            this.field502[this.field273] = 848;
                                        }
                                        if (var25 == 3) {
                                            this.field502[this.field273] = 512;
                                        }
                                        if (var25 == 4) {
                                            this.field502[this.field273] = 741;
                                        }
                                        this.field503[this.field273] = var23.field1683;
                                        this.field500[this.field273] = var6;
                                        this.field501[this.field273] = var7;
                                        ++this.field273;
                                    } else if (var25 == 2) {
                                        this.field262[this.field273] = "Take @lre@" + var24.field1156;
                                        this.field502[this.field273] = 848;
                                        this.field503[this.field273] = var23.field1683;
                                        this.field500[this.field273] = var6;
                                        this.field501[this.field273] = var7;
                                        ++this.field273;
                                    }
                                }
                                this.field262[this.field273] = "Examine @lre@" + var24.field1156;
                                this.field502[this.field273] = 1515;
                                this.field503[this.field273] = var23.field1683;
                                this.field500[this.field273] = var6;
                                this.field501[this.field273] = var7;
                                ++this.field273;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method115(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method115(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method116(int arg0, boolean arg1) {
        this.method101(this.field336);
        this.field141.method545(16595);
        if (arg0 == -41990) {
            this.field135.method518(0, 0, true);
            short var3 = 360;
            short var4 = 200;
            if (this.field78 == 0) {
                int var5 = var4 / 2 + 80;
                this.field409.method433(7711145, this.field167.field629, true, var3 / 2, var5, true);
                int var6 = var4 / 2 - 20;
                this.field411.method433(16776960, "Welcome to RuneScape", true, var3 / 2, var6, true);
                int var17 = var6 + 30;
                int var7 = var3 / 2 - 80;
                int var8 = var4 / 2 + 20;
                this.field136.method518(var7 - 73, var8 - 20, true);
                this.field411.method433(16777215, "New User", true, var7, var8 + 5, true);
                int var9 = var3 / 2 + 80;
                this.field136.method518(var9 - 73, var8 - 20, true);
                this.field411.method433(16777215, "Existing User", true, var9, var8 + 5, true);
            }
            if (this.field78 == 2) {
                int var10 = var4 / 2 - 40;
                if (this.field467.length() > 0) {
                    this.field411.method433(16776960, this.field467, true, var3 / 2, var10 - 15, true);
                    this.field411.method433(16776960, this.field468, true, var3 / 2, var10, true);
                    var10 += 30;
                } else {
                    this.field411.method433(16776960, this.field468, true, var3 / 2, var10 - 7, true);
                    var10 += 30;
                }
                this.field411.method440("Username: " + this.field205 + (this.field131 == 0 & field291 % 40 < 20 ? "@yel@|" : ""), var10, 16777215, var3 / 2 - 90, 696, true);
                var10 += 15;
                this.field411.method440("Password: " + class44.method464(-796, this.field206) + (this.field131 == 1 & field291 % 40 < 20 ? "@yel@|" : ""), var10, 16777215, var3 / 2 - 88, 696, true);
                var10 += 15;
                if (!arg1) {
                    int var11 = var3 / 2 - 80;
                    int var12 = var4 / 2 + 50;
                    this.field136.method518(var11 - 73, var12 - 20, true);
                    this.field411.method433(16777215, "Login", true, var11, var12 + 5, true);
                    int var13 = var3 / 2 + 80;
                    this.field136.method518(var13 - 73, var12 - 20, true);
                    this.field411.method433(16777215, "Cancel", true, var13, var12 + 5, true);
                }
            }
            if (this.field78 == 3) {
                this.field411.method433(16776960, "Create a free account", true, var3 / 2, var4 / 2 - 60, true);
                int var14 = var4 / 2 - 35;
                this.field411.method433(16777215, "To create a new account you need to", true, var3 / 2, var14, true);
                int var18 = var14 + 15;
                this.field411.method433(16777215, "go back to the main RuneScape webpage", true, var3 / 2, var18, true);
                int var19 = var18 + 15;
                this.field411.method433(16777215, "and choose the red 'create account'", true, var3 / 2, var19, true);
                int var20 = var19 + 15;
                this.field411.method433(16777215, "button at the top right of that page.", true, var3 / 2, var20, true);
                int var21 = var20 + 15;
                int var15 = var3 / 2;
                int var16 = var4 / 2 + 50;
                this.field136.method518(var15 - 73, var16 - 20, true);
                this.field411.method433(16777215, "Cancel", true, var15, var16 + 5, true);
            }
            this.field141.method546(super.field1554, 171, -52, 202);
            if (this.field408) {
                this.field408 = false;
                this.field139.method546(super.field1554, 0, -52, 128);
                this.field140.method546(super.field1554, 371, -52, 202);
                this.field144.method546(super.field1554, 265, -52, 0);
                this.field145.method546(super.field1554, 265, -52, 562);
                this.field146.method546(super.field1554, 171, -52, 128);
                this.field147.method546(super.field1554, 171, -52, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILBJPWOXRJ;I)V")
    private final void method117(int arg0, class3 arg1, int arg2) {
        arg1.method25((byte) -82);
        if (arg2 != 26447) {
            this.field265 = !this.field265;
        }
        int var4 = arg1.method26(false, 1);
        if (var4 != 0) {
            int var5 = arg1.method26(false, 2);
            if (var5 == 0) {
                this.field387[this.field386++] = this.field382;
            } else if (var5 == 1) {
                int var6 = arg1.method26(false, 3);
                field444.method449(false, 6, var6);
                int var7 = arg1.method26(false, 1);
                if (var7 == 1) {
                    this.field387[this.field386++] = this.field382;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method26(false, 3);
                field444.method449(true, 6, var8);
                int var9 = arg1.method26(false, 3);
                field444.method449(true, 6, var9);
                int var10 = arg1.method26(false, 1);
                if (var10 == 1) {
                    this.field387[this.field386++] = this.field382;
                }
            } else if (var5 == 3) {
                this.field128 = arg1.method26(false, 2);
                int var11 = arg1.method26(false, 7);
                int var12 = arg1.method26(false, 7);
                int var13 = arg1.method26(false, 1);
                int var14 = arg1.method26(false, 1);
                if (var14 == 1) {
                    this.field387[this.field386++] = this.field382;
                }
                field444.method450(var12, var13 == 1, false, var11);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IIII)I")
    public final int method118(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 83 / arg0;
        int var6 = 256 - arg2;
        return ((arg1 & 16711935) * var6 + (arg3 & 16711935) * arg2 & -16711936) + ((arg1 & 65280) * var6 + (arg3 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method119(boolean arg0) {
        if (arg0) {
            this.field258 = -1;
        }
        if (!this.field521 && !this.field179 && !this.field189) {
            ++field471;
            if (!this.field473) {
                this.method116(this.field75, false);
            } else {
                this.method85(-33393);
            }
            this.field272 = 0;
        } else {
            this.method99(8);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI[B)V")
    public final void method120(boolean arg0, int arg1, byte[] arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
        int var4 = 44 / arg1;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method121(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field202 != null) {
                this.field202.method318();
            }
        } catch (Exception var2) {
        }
        this.field202 = null;
        this.method35(0);
        if (this.field472 != null) {
            this.field472.field1388 = false;
        }
        this.field472 = null;
        this.field167.method196();
        this.field167 = null;
        this.field148 = null;
        this.field106 = null;
        this.field61 = null;
        this.field282 = null;
        this.field358 = null;
        this.field47 = null;
        this.field64 = null;
        this.field359 = null;
        this.field360 = null;
        this.field73 = null;
        this.field392 = null;
        this.field253 = null;
        this.field46 = null;
        this.field448 = null;
        this.field228 = null;
        this.field414 = null;
        this.field415 = null;
        this.field397 = null;
        this.field241 = null;
        this.field242 = null;
        this.field243 = null;
        this.field244 = null;
        this.field375 = null;
        this.field376 = null;
        this.field377 = null;
        this.field338 = null;
        this.field339 = null;
        this.field340 = null;
        this.field341 = null;
        this.field342 = null;
        this.field343 = null;
        this.field344 = null;
        this.field345 = null;
        this.field346 = null;
        this.field362 = null;
        this.field363 = null;
        if (arg0 <= 0) {
            field137 = this.field87.method203();
        }
        this.field364 = null;
        this.field112 = null;
        this.field113 = null;
        this.field114 = null;
        this.field354 = null;
        this.field329 = null;
        this.field330 = null;
        this.field331 = null;
        this.field332 = null;
        this.field333 = null;
        this.field222 = null;
        this.field223 = null;
        this.field224 = null;
        this.field225 = null;
        this.field226 = null;
        this.field470 = null;
        this.field509 = null;
        this.field269 = null;
        this.field121 = null;
        this.field304 = null;
        this.field305 = null;
        this.field306 = null;
        this.field307 = null;
        this.field308 = null;
        this.field66 = null;
        this.field460 = null;
        this.field234 = null;
        this.field383 = null;
        this.field385 = null;
        this.field387 = null;
        this.field388 = null;
        this.field284 = null;
        this.field149 = null;
        this.field151 = null;
        this.field171 = null;
        this.field504 = null;
        this.field119 = null;
        this.field322 = null;
        this.field500 = null;
        this.field501 = null;
        this.field502 = null;
        this.field503 = null;
        this.field262 = null;
        this.field59 = null;
        this.field446 = null;
        this.field447 = null;
        this.field83 = null;
        this.field433 = null;
        this.field154 = null;
        this.field274 = null;
        this.field309 = null;
        this.field142 = null;
        this.field143 = null;
        this.field139 = null;
        this.field140 = null;
        this.field141 = null;
        this.field144 = null;
        this.field145 = null;
        this.field146 = null;
        this.field147 = null;
        this.method136(0);
        class32.method399((byte) 113);
        class52.method484((byte) 113);
        class33.method415((byte) 113);
        class28.field1032 = null;
        class51.field1447 = null;
        class8.field574 = null;
        class34.field1187 = null;
        class42.field1314 = null;
        class35.field1198 = null;
        class35.field1210 = null;
        class27.field1016 = null;
        super.field1555 = null;
        class48.field1407 = null;
        class12.method206((byte) 113);
        class17.method244((byte) 113);
        class26.method324((byte) 113);
        class59.method522((byte) 113);
        System.gc();
        if (class38.field1228) {
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method122(byte arg0) {
        int var2 = this.field93;
        int var3 = this.field94;
        int var4 = this.field95;
        int var5 = this.field96;
        int var6 = 6116423;
        class13.method228(var3, var5, var4, var2, var6, true);
        class13.method228(var3 + 1, 16, var4 - 2, var2 + 1, 0, true);
        class13.method229(var2 + 1, var5 - 19, var4 - 2, var3 + 18, (byte) 118, 0);
        this.field411.method436((byte) 0, var6, var3 + 14, "Choose Option", var2 + 3);
        if (arg0 == 4) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        int var9 = super.field1562;
        int var10 = super.field1563;
        if (this.field92 == 0) {
            var9 -= 4;
            var10 -= 4;
        }
        if (this.field92 == 1) {
            var9 -= 553;
            var10 -= 205;
        }
        if (this.field92 == 2) {
            var9 -= 17;
            var10 -= 357;
        }
        for (int var11 = 0; var11 < this.field273; ++var11) {
            int var12 = (this.field273 - 1 - var11) * 15 + var3 + 31;
            int var13 = 16777215;
            if (var9 > var2 && var9 < var2 + var4 && var10 > var12 - 13 && var10 < var12 + 3) {
                var13 = 16776960;
            }
            this.field411.method440(this.field262[var11], var12, var13, var2 + 3, 696, true);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method123(int arg0, int arg1) {
        if (arg0 != -45360) {
            throw new NullPointerException();
        } else {
            String var2 = String.valueOf(arg1);
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

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 <= 0) {
            this.field173 = !this.field173;
        }
        for (class15 var2 = (class15) this.field322.method471(); var2 != null; var2 = (class15) this.field322.method473((byte) 2)) {
            if (this.field128 == var2.field732 && !var2.field731) {
                if (field291 >= var2.field729) {
                    var2.method241(this.field97, this.field56);
                    if (var2.field731) {
                        var2.method430();
                    } else {
                        this.field253.method256(60, var2, var2.field732, -1, var2.field735, 0, var2.field733, var2.field734, (byte) -51, false);
                    }
                }
            } else {
                var2.method430();
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method125(int arg0) {
        int var2 = 3 / arg0;
        if (this.field161 != 0) {
            int var3 = 0;
            if (this.field493 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field400[var4] != null) {
                    int var5 = this.field398[var4];
                    String var6 = this.field399[var4];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field303 == 0 || this.field303 == 1 && this.method41(var6, -17594))) {
                        int var10 = 329 - var3 * 13;
                        if (super.field1562 > 4 && super.field1563 - 4 > var10 - 10 && super.field1563 - 4 <= var10 + 3) {
                            int var11 = this.field410.method434(this.field99, "From:  " + var6 + this.field400[var4]) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field1562 < var11 + 4) {
                                if (this.field465 >= 1) {
                                    this.field262[this.field273] = "Report abuse @whi@" + var6;
                                    this.field502[this.field273] = 2803;
                                    ++this.field273;
                                }
                                this.field262[this.field273] = "Add ignore @whi@" + var6;
                                this.field502[this.field273] = 2266;
                                ++this.field273;
                                this.field262[this.field273] = "Add friend @whi@" + var6;
                                this.field502[this.field273] = 2927;
                                ++this.field273;
                            }
                        }
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field303 < 2) {
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method126(int arg0) {
        this.field244.method545(16595);
        class12.field694 = this.field285;
        this.field364.method518(0, 0, true);
        if (this.field52) {
            this.field411.method432(239, 40, 190, this.field489, 0);
            this.field411.method432(239, 60, 190, this.field172 + "*", 128);
        } else if (this.field256) {
            this.field411.method432(239, 40, 190, "Enter amount:", 0);
            this.field411.method432(239, 60, 190, this.field98 + "*", 128);
        } else if (this.field365 != null) {
            this.field411.method432(239, 40, 190, this.field365, 0);
            this.field411.method432(239, 60, 190, "Click to continue", 128);
        } else if (this.field443 != -1) {
            this.method112(0, 0, 0, 24182, class8.field574[this.field443]);
        } else if (this.field469 != -1) {
            this.method112(0, 0, 0, 24182, class8.field574[this.field469]);
        } else {
            class39 var2 = this.field410;
            int var3 = 0;
            class13.method225(77, 0, -841, 463, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field400[var4] != null) {
                    int var6 = this.field398[var4];
                    int var7 = 70 - var3 * 14 + this.field248;
                    String var8 = this.field399[var4];
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
                            var2.method436((byte) 0, 0, var7, this.field400[var4], 4);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field89 == 0 || this.field89 == 1 && this.method41(var8, -17594))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field406[0].method518(var10, var7 - 12, true);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field406[1].method518(var10, var7 - 12, true);
                                var10 += 14;
                            }
                            var2.method436((byte) 0, 0, var7, var8 + ":", var10);
                            int var11 = var10 + var2.method434(this.field99, var8) + 8;
                            var2.method436((byte) 0, 255, var7, this.field400[var4], var11);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field161 == 0 && (var6 == 7 || this.field303 == 0 || this.field303 == 1 && this.method41(var8, -17594))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method436((byte) 0, 0, var7, "From", var12);
                            int var13 = var12 + var2.method434(this.field99, "From ");
                            if (var9 == 1) {
                                this.field406[0].method518(var13, var7 - 12, true);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field406[1].method518(var13, var7 - 12, true);
                                var13 += 14;
                            }
                            var2.method436((byte) 0, 0, var7, var8 + ":", var13);
                            int var14 = var13 + var2.method434(this.field99, var8) + 8;
                            var2.method436((byte) 0, 8388608, var7, this.field400[var4], var14);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field107 == 0 || this.field107 == 1 && this.method41(var8, -17594))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method436((byte) 0, 8388736, var7, var8 + " " + this.field400[var4], 4);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field161 == 0 && this.field303 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method436((byte) 0, 8388608, var7, this.field400[var4], 4);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field161 == 0 && this.field303 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method436((byte) 0, 0, var7, "To " + var8 + ":", 4);
                            var2.method436((byte) 0, 8388608, var7, this.field400[var4], 12 + var2.method434(this.field99, "To " + var8));
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field107 == 0 || this.field107 == 1 && this.method41(var8, -17594))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method436((byte) 0, 8270336, var7, var8 + " " + this.field400[var4], 4);
                        }
                        ++var3;
                    }
                }
            }
            class13.method224(false);
            this.field419 = var3 * 14 + 7;
            if (this.field419 < 78) {
                this.field419 = 78;
            }
            this.method151(0, 77, this.field419, 0, 463, this.field419 - this.field248 - 77);
            String var5;
            if (field444 != null && field444.field1406 != null) {
                var5 = field444.field1406;
            } else {
                var5 = class44.method463((byte) -2, this.field205);
            }
            var2.method436((byte) 0, 0, 90, var5 + ":", 4);
            var2.method436((byte) 0, 255, 90, this.field436 + "*", 6 + var2.method434(this.field99, var5 + ": "));
            class13.method231(0, 479, (byte) 31, 77, 0);
        }
        if (this.field117 && this.field92 == 2) {
            this.method122((byte) 4);
        }
        this.field244.method546(super.field1554, 357, -52, 17);
        this.field243.method545(16595);
        if (arg0 < 7 || arg0 > 7) {
            this.field258 = -1;
        }
        class12.field694 = this.field287;
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (this.field261 > 0) {
            this.method169(this.field62);
        } else {
            this.field243.method545(16595);
            this.field410.method432(257, 144, 190, "Connection lost", 0);
            this.field410.method432(256, 143, 190, "Connection lost", 16777215);
            this.field410.method432(257, 159, 190, "Please wait - attempting to reestablish", 0);
            this.field410.method432(256, 158, 190, "Please wait - attempting to reestablish", 16777215);
            this.field243.method546(super.field1554, 4, -52, 4);
            this.field115 = 0;
            if (arg0 < 3 || arg0 > 3) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field431 = 0;
            class25 var3 = this.field202;
            this.field473 = false;
            this.field347 = 0;
            this.method97(this.field205, this.field206, true);
            if (!this.field473) {
                this.method169(this.field62);
            }
            try {
                var3.method318();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZII)Z")
    public final boolean method128(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field378 = !field378;
        }
        boolean var4 = false;
        class8 var5 = class8.field574[arg2];
        for (int var6 = 0; var6 < var5.field600.length && var5.field600[var6] != -1; ++var6) {
            class8 var7 = class8.field574[var5.field600[var6]];
            if (var7.field568 == 1) {
                var4 |= this.method128(false, arg1, var7.field581);
            }
            if (var7.field568 == 6 && (var7.field605 != -1 || var7.field606 != -1)) {
                boolean var8 = this.method165(var7, 261);
                int var9;
                if (var8) {
                    var9 = var7.field606;
                } else {
                    var9 = var7.field605;
                }
                if (var9 != -1) {
                    class42 var10 = class42.field1314[var9];
                    var7.field561 += arg1;
                    while (var7.field561 > var10.method457(var7.field567, this.field321)) {
                        var7.field561 -= var10.method457(var7.field567, this.field321) + 1;
                        ++var7.field567;
                        if (var7.field567 >= var10.field1315) {
                            var7.field567 -= var10.field1319;
                            if (var7.field567 < 0 || var7.field567 >= var10.field1315) {
                                var7.field567 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method129(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    private final void method130(boolean arg0) {
        if (arg0) {
            this.field60 = !this.field60;
        }
        for (class62 var2 = (class62) this.field504.method471(); var2 != null; var2 = (class62) this.field504.method473((byte) 2)) {
            if (var2.field1622 == -1) {
                var2.field1623 = 0;
                this.method167(var2, 7);
            } else {
                var2.method430();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class62 var11 = null;
        for (class62 var12 = (class62) this.field504.method471(); var12 != null; var12 = (class62) this.field504.method473((byte) 2)) {
            if (var12.field1615 == arg0 && var12.field1617 == arg1 && var12.field1618 == arg6 && var12.field1616 == arg7) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class62();
            var11.field1615 = arg0;
            var11.field1616 = arg7;
            var11.field1617 = arg1;
            var11.field1618 = arg6;
            this.method167(var11, 7);
            this.field504.method468(var11);
        }
        var11.field1619 = arg2;
        var11.field1621 = arg4;
        int var13 = 22 / arg5;
        var11.field1620 = arg8;
        var11.field1623 = arg3;
        var11.field1622 = arg9;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method132(boolean arg0) {
        if (this.field231 == 0) {
            this.field262[0] = "Cancel";
            this.field502[0] = 1103;
            if (!arg0) {
                this.field273 = 1;
                this.method125(877);
                this.field479 = 0;
                if (super.field1562 > 4 && super.field1563 > 4 && super.field1562 < 516 && super.field1563 < 338) {
                    if (this.field68 != -1) {
                        this.method164(super.field1562, class8.field574[this.field68], true, super.field1563, 0, 4, 4);
                    } else {
                        this.method114(this.field401);
                    }
                }
                if (this.field479 != this.field124) {
                    this.field124 = this.field479;
                }
                this.field479 = 0;
                if (super.field1562 > 553 && super.field1563 > 205 && super.field1562 < 743 && super.field1563 < 466) {
                    if (this.field314 != -1) {
                        this.method164(super.field1562, class8.field574[this.field314], true, super.field1563, 0, 553, 205);
                    } else if (this.field208[this.field450] != -1) {
                        this.method164(super.field1562, class8.field574[this.field208[this.field450]], true, super.field1563, 0, 553, 205);
                    }
                }
                if (this.field479 != this.field372) {
                    this.field126 = true;
                    this.field372 = this.field479;
                }
                this.field479 = 0;
                if (super.field1562 > 17 && super.field1563 > 357 && super.field1562 < 496 && super.field1563 < 453) {
                    if (this.field443 != -1) {
                        this.method164(super.field1562, class8.field574[this.field443], true, super.field1563, 0, 17, 357);
                    } else if (super.field1563 < 434 && super.field1562 < 426) {
                        this.method52(-825, super.field1562 - 17, super.field1563 - 357);
                    }
                }
                if (this.field443 != -1 && this.field479 != this.field413) {
                    this.field159 = true;
                    this.field413 = this.field479;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field273 - 1; ++var3) {
                        if (this.field502[var3] < 1000 && this.field502[var3 + 1] > 1000) {
                            String var4 = this.field262[var3];
                            this.field262[var3] = this.field262[var3 + 1];
                            this.field262[var3 + 1] = var4;
                            int var5 = this.field502[var3];
                            this.field502[var3] = this.field502[var3 + 1];
                            this.field502[var3 + 1] = var5;
                            int var6 = this.field500[var3];
                            this.field500[var3] = this.field500[var3 + 1];
                            this.field500[var3 + 1] = var6;
                            int var7 = this.field501[var3];
                            this.field501[var3] = this.field501[var3 + 1];
                            this.field501[var3 + 1] = var7;
                            int var8 = this.field503[var3];
                            this.field503[var3] = this.field503[var3 + 1];
                            this.field503[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method133(long arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg0 != 0L) {
            for (int var5 = 0; var5 < this.field200; ++var5) {
                if (this.field274[var5] == arg0) {
                    --this.field200;
                    this.field126 = true;
                    for (int var6 = var5; var6 < this.field200; ++var6) {
                        this.field154[var6] = this.field154[var6 + 1];
                        this.field309[var6] = this.field309[var6 + 1];
                        this.field274[var6] = this.field274[var6 + 1];
                    }
                    this.field106.method4(205, 0);
                    this.field106.method11(arg0, 5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LBJPWOXRJ;BI)V")
    private final void method134(class3 arg0, byte arg1, int arg2) {
        for (int var4 = 0; var4 < this.field386; ++var4) {
            int var5 = this.field387[var4];
            class18 var6 = this.field149[var5];
            int var7 = arg0.method15();
            if ((var7 & 1) != 0) {
                int var8 = arg0.method15();
                int var9 = arg0.method15();
                var6.method447(var9, 0, field291, var8);
                var6.field1271 = field291 + 300;
                var6.field1272 = arg0.method15();
                var6.field1273 = arg0.method15();
            }
            if ((var7 & 2) != 0) {
                int var10 = arg0.method17();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field1291 == var10) {
                    var6.field1295 = 0;
                }
                int var11 = arg0.method15();
                if (var6.field1291 == var10 && var10 != -1) {
                    int var12 = class42.field1314[var10].field1328;
                    if (var12 == 1) {
                        var6.field1292 = 0;
                        var6.field1293 = 0;
                        var6.field1294 = var11;
                        var6.field1295 = 0;
                    }
                    if (var12 == 2) {
                        var6.field1295 = 0;
                    }
                } else if (var10 == -1 || var6.field1291 == -1 || class42.field1314[var10].field1322 >= class42.field1314[var6.field1291].field1322) {
                    var6.field1291 = var10;
                    var6.field1292 = 0;
                    var6.field1293 = 0;
                    var6.field1294 = var11;
                    var6.field1295 = 0;
                    var6.field1301 = var6.field1298;
                }
            }
            if ((var7 & 4) != 0) {
                var6.field1280 = arg0.method17();
                if (var6.field1280 == 65535) {
                    var6.field1280 = -1;
                }
            }
            if ((var7 & 8) != 0) {
                var6.field1255 = arg0.method22();
                var6.field1297 = 100;
            }
            if ((var7 & 16) != 0) {
                int var13 = arg0.method15();
                int var14 = arg0.method15();
                var6.method447(var14, 0, field291, var13);
                var6.field1271 = field291 + 300;
                var6.field1272 = arg0.method15();
                var6.field1273 = arg0.method15();
            }
            if ((var7 & 32) != 0) {
                var6.field841 = class52.method488(arg0.method17());
                var6.field1262 = var6.field841.field1471;
                var6.field1275 = var6.field841.field1463;
                var6.field1287 = var6.field841.field1480;
                var6.field1288 = var6.field841.field1486;
                var6.field1289 = var6.field841.field1492;
                var6.field1290 = var6.field841.field1469;
                var6.field1299 = var6.field841.field1468;
            }
            if ((var7 & 64) != 0) {
                var6.field1256 = arg0.method17();
                int var15 = arg0.method20();
                var6.field1260 = var15 >> 16;
                var6.field1259 = (var15 & 65535) + field291;
                var6.field1257 = 0;
                var6.field1258 = 0;
                if (var6.field1259 > field291) {
                    var6.field1257 = -1;
                }
                if (var6.field1256 == 65535) {
                    var6.field1256 = -1;
                }
            }
            if ((var7 & 128) != 0) {
                var6.field1278 = arg0.method17();
                var6.field1279 = arg0.method17();
            }
        }
        if (this.field122 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 306);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field393 = Integer.parseInt(arg0[0]);
                field394 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method59(0);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method160(5);
                }
                if (arg0[3].equals("free")) {
                    field395 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field395 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method508(503, 45399, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    private final void method135(byte arg0) {
        if (this.field247 == arg0) {
            if (this.field466 == 2) {
                for (class62 var2 = (class62) this.field504.method471(); var2 != null; var2 = (class62) this.field504.method473((byte) 2)) {
                    if (var2.field1622 > 0) {
                        --var2.field1622;
                    }
                    if (var2.field1622 == 0) {
                        if (var2.field1624 < 0 || class54.method495(-48173, var2.field1624, var2.field1626)) {
                            this.method174((byte) 48, var2.field1625, var2.field1617, var2.field1626, var2.field1615, var2.field1616, var2.field1618, var2.field1624);
                            var2.method430();
                        }
                    } else {
                        if (var2.field1623 > 0) {
                            --var2.field1623;
                        }
                        if (var2.field1623 == 0 && var2.field1617 >= 1 && var2.field1618 >= 1 && var2.field1617 <= 102 && var2.field1618 <= 102 && (var2.field1619 < 0 || class54.method495(-48173, var2.field1619, var2.field1621))) {
                            this.method174((byte) 48, var2.field1620, var2.field1617, var2.field1621, var2.field1615, var2.field1616, var2.field1618, var2.field1619);
                            var2.field1623 = -1;
                            if (var2.field1624 == var2.field1619 && var2.field1624 == -1) {
                                var2.method430();
                            } else if (var2.field1624 == var2.field1619 && var2.field1625 == var2.field1620 && var2.field1626 == var2.field1621) {
                                var2.method430();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method136(int arg0) {
        this.field120 = false;
        while (this.field507) {
            this.field120 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field135 = null;
        this.field136 = null;
        this.field155 = null;
        this.field257 += arg0;
        this.field316 = null;
        this.field317 = null;
        this.field318 = null;
        this.field319 = null;
        this.field169 = null;
        this.field170 = null;
        this.field512 = null;
        this.field513 = null;
        this.field181 = null;
        this.field182 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLBJPWOXRJ;)V")
    private final void method137(int arg0, byte arg1, class3 arg2) {
        if (arg1 == -81) {
            while (arg2.field21 + 21 < arg0 * 8) {
                int var4 = arg2.method26(false, 14);
                if (var4 == 16383) {
                    break;
                }
                if (this.field149[var4] == null) {
                    this.field149[var4] = new class18();
                }
                class18 var5 = this.field149[var4];
                this.field151[this.field150++] = var4;
                var5.field1263 = field291;
                var5.field841 = class52.method488(arg2.method26(false, 12));
                int var6 = arg2.method26(false, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
                int var7 = arg2.method26(false, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
                int var8 = arg2.method26(false, 1);
                int var9 = arg2.method26(false, 1);
                if (var9 == 1) {
                    this.field387[this.field386++] = var4;
                }
                var5.field1262 = var5.field841.field1471;
                var5.field1275 = var5.field841.field1463;
                var5.field1287 = var5.field841.field1480;
                var5.field1288 = var5.field841.field1486;
                var5.field1289 = var5.field841.field1492;
                var5.field1290 = var5.field841.field1469;
                var5.field1299 = var5.field841.field1468;
                var5.method450(field444.field1277[0] + var7, var8 == 1, false, field444.field1276[0] + var6);
            }
            arg2.method27(0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIZIIII)Z")
    public final boolean method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field448[var15][var36] = 0;
                this.field228[var15][var36] = 99999999;
            }
        }
        int var16 = arg1;
        int var17 = arg0;
        this.field448[arg1][arg0] = 99;
        this.field228[arg1][arg0] = 0;
        byte var18 = 0;
        int var19 = 0;
        int var20 = 29 / arg5;
        this.field414[var18] = arg1;
        int var37 = var18 + 1;
        this.field415[var18] = arg0;
        boolean var21 = false;
        int var22 = this.field414.length;
        int[][] var23 = this.field46[this.field128].field863;
        while (var37 != var19) {
            var16 = this.field414[var19];
            var17 = this.field415[var19];
            var19 = (var19 + 1) % var22;
            if (arg3 == var16 && arg9 == var17) {
                var21 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && this.field46[this.field128].method308(arg2 - 1, arg6, var16, arg3, var17, arg9, this.field281)) {
                    var21 = true;
                    break;
                }
                if (arg2 < 10 && this.field46[this.field128].method309(arg6, arg2 - 1, var17, this.field45, arg3, arg9, var16)) {
                    var21 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg4 != 0 && this.field46[this.field128].method310(arg8, var16, arg10, var17, arg9, arg3, this.field355, arg4)) {
                var21 = true;
                break;
            }
            int var35 = this.field228[var16][var17] + 1;
            if (var16 > 0 && this.field448[var16 - 1][var17] == 0 && (var23[var16 - 1][var17] & 2621704) == 0) {
                this.field414[var37] = var16 - 1;
                this.field415[var37] = var17;
                var37 = (var37 + 1) % var22;
                this.field448[var16 - 1][var17] = 2;
                this.field228[var16 - 1][var17] = var35;
            }
            if (var16 < var13 - 1 && this.field448[var16 + 1][var17] == 0 && (var23[var16 + 1][var17] & 2621824) == 0) {
                this.field414[var37] = var16 + 1;
                this.field415[var37] = var17;
                var37 = (var37 + 1) % var22;
                this.field448[var16 + 1][var17] = 8;
                this.field228[var16 + 1][var17] = var35;
            }
            if (var17 > 0 && this.field448[var16][var17 - 1] == 0 && (var23[var16][var17 - 1] & 2621698) == 0) {
                this.field414[var37] = var16;
                this.field415[var37] = var17 - 1;
                var37 = (var37 + 1) % var22;
                this.field448[var16][var17 - 1] = 1;
                this.field228[var16][var17 - 1] = var35;
            }
            if (var17 < var14 - 1 && this.field448[var16][var17 + 1] == 0 && (var23[var16][var17 + 1] & 2621728) == 0) {
                this.field414[var37] = var16;
                this.field415[var37] = var17 + 1;
                var37 = (var37 + 1) % var22;
                this.field448[var16][var17 + 1] = 4;
                this.field228[var16][var17 + 1] = var35;
            }
            if (var16 > 0 && var17 > 0 && this.field448[var16 - 1][var17 - 1] == 0 && (var23[var16 - 1][var17 - 1] & 2621710) == 0 && (var23[var16 - 1][var17] & 2621704) == 0 && (var23[var16][var17 - 1] & 2621698) == 0) {
                this.field414[var37] = var16 - 1;
                this.field415[var37] = var17 - 1;
                var37 = (var37 + 1) % var22;
                this.field448[var16 - 1][var17 - 1] = 3;
                this.field228[var16 - 1][var17 - 1] = var35;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field448[var16 + 1][var17 - 1] == 0 && (var23[var16 + 1][var17 - 1] & 2621827) == 0 && (var23[var16 + 1][var17] & 2621824) == 0 && (var23[var16][var17 - 1] & 2621698) == 0) {
                this.field414[var37] = var16 + 1;
                this.field415[var37] = var17 - 1;
                var37 = (var37 + 1) % var22;
                this.field448[var16 + 1][var17 - 1] = 9;
                this.field228[var16 + 1][var17 - 1] = var35;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field448[var16 - 1][var17 + 1] == 0 && (var23[var16 - 1][var17 + 1] & 2621752) == 0 && (var23[var16 - 1][var17] & 2621704) == 0 && (var23[var16][var17 + 1] & 2621728) == 0) {
                this.field414[var37] = var16 - 1;
                this.field415[var37] = var17 + 1;
                var37 = (var37 + 1) % var22;
                this.field448[var16 - 1][var17 + 1] = 6;
                this.field228[var16 - 1][var17 + 1] = var35;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field448[var16 + 1][var17 + 1] == 0 && (var23[var16 + 1][var17 + 1] & 2621920) == 0 && (var23[var16 + 1][var17] & 2621824) == 0 && (var23[var16][var17 + 1] & 2621728) == 0) {
                this.field414[var37] = var16 + 1;
                this.field415[var37] = var17 + 1;
                var37 = (var37 + 1) % var22;
                this.field448[var16 + 1][var17 + 1] = 12;
                this.field228[var16 + 1][var17 + 1] = var35;
            }
        }
        this.field437 = 0;
        if (!var21) {
            if (arg7) {
                int var24 = 100;
                for (int var25 = 1; var25 < 2; ++var25) {
                    for (int var26 = arg3 - var25; var26 <= arg3 + var25; ++var26) {
                        for (int var27 = arg9 - var25; var27 <= arg9 + var25; ++var27) {
                            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field228[var26][var27] < var24) {
                                var24 = this.field228[var26][var27];
                                var16 = var26;
                                var17 = var27;
                                this.field437 = 1;
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
        this.field414[var28] = var16;
        int var38 = var28 + 1;
        this.field415[var28] = var17;
        int var29;
        int var30 = var29 = this.field448[var16][var17];
        while (arg1 != var16 || arg0 != var17) {
            if (var29 != var30) {
                var29 = var30;
                this.field414[var38] = var16;
                this.field415[var38++] = var17;
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
            var30 = this.field448[var16][var17];
        }
        if (var38 <= 0) {
            if (arg11 == 1) {
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
            int var32 = this.field414[var38];
            int var33 = this.field415[var38];
            if (arg11 == 0) {
                this.field106.method4(25, 0);
                this.field106.method5(var31 + var31 + 3);
            }
            if (arg11 == 1) {
                this.field106.method4(200, 0);
                this.field106.method5(var31 + var31 + 3 + 14);
            }
            if (arg11 == 2) {
                this.field106.method4(49, 0);
                this.field106.method5(var31 + var31 + 3);
            }
            this.field106.method5(super.field1572[5] == 1 ? 1 : 0);
            this.field106.method6(this.field310 + var32);
            this.field106.method6(this.field311 + var33);
            this.field431 = this.field414[0];
            this.field432 = this.field415[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field106.method5(this.field414[var38] - var32);
                this.field106.method5(this.field415[var38] - var33);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIILQVUHZTUC;I)V")
    public final void method139(boolean arg0, int arg1, int arg2, class48 arg3, int arg4) {
        if (arg0) {
            this.field106.method5(53);
        }
        if (field444 != arg3) {
            if (this.field273 < 400) {
                String var6;
                if (arg3.field1431 == 0) {
                    var6 = arg3.field1406 + method161(this.field416, arg3.field1424, field444.field1424) + " (level-" + arg3.field1424 + ")";
                } else {
                    var6 = arg3.field1406 + " (skill-" + arg3.field1431 + ")";
                }
                if (this.field516 == 1) {
                    this.field262[this.field273] = "Use " + this.field520 + " with @whi@" + var6;
                    this.field502[this.field273] = 206;
                    this.field503[this.field273] = arg2;
                    this.field500[this.field273] = arg1;
                    this.field501[this.field273] = arg4;
                    ++this.field273;
                } else if (this.field175 == 1) {
                    if ((this.field177 & 8) == 8) {
                        this.field262[this.field273] = this.field178 + " @whi@" + var6;
                        this.field502[this.field273] = 28;
                        this.field503[this.field273] = arg2;
                        this.field500[this.field273] = arg1;
                        this.field501[this.field273] = arg4;
                        ++this.field273;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field494[var7] != null) {
                            this.field262[this.field273] = this.field494[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field494[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field1424 > field444.field1424) {
                                    var9 = 2000;
                                }
                                if (field444.field1422 != 0 && arg3.field1422 != 0) {
                                    if (field444.field1422 == arg3.field1422) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field495[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field502[this.field273] = var9 + 149;
                            }
                            if (var7 == 1) {
                                this.field502[this.field273] = var9 + 158;
                            }
                            if (var7 == 2) {
                                this.field502[this.field273] = var9 + 765;
                            }
                            if (var7 == 3) {
                                this.field502[this.field273] = var9 + 902;
                            }
                            if (var7 == 4) {
                                this.field502[this.field273] = var9 + 114;
                            }
                            this.field503[this.field273] = arg2;
                            this.field500[this.field273] = arg1;
                            this.field501[this.field273] = arg4;
                            ++this.field273;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field273; ++var8) {
                    if (this.field502[var8] == 762) {
                        this.field262[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILBJPWOXRJ;I)V")
    public final void method140(int arg0, class3 arg1, int arg2) {
        if (arg2 >= 0) {
            this.field193 = !this.field193;
        }
        if (arg0 == 169) {
            int var4 = arg1.method15();
            int var5 = (var4 >> 4 & 7) + this.field497;
            int var6 = (var4 & 7) + this.field498;
            int var7 = arg1.method17();
            int var8 = arg1.method15();
            int var9 = var8 >> 4 & 15;
            int var10 = var8 & 7;
            if (field444.field1276[0] >= var5 - var9 && field444.field1276[0] <= var5 + var9 && field444.field1277[0] >= var6 - var9 && field444.field1277[0] <= var6 + var9 && this.field279 && !field396 && this.field174 < 50) {
                this.field488[this.field174] = var7;
                this.field374[this.field174] = var10;
                this.field70[this.field174] = class14.field723[var7];
                ++this.field174;
            }
        }
        if (arg0 == 1) {
            int var11 = arg1.method15();
            int var12 = (var11 >> 4 & 7) + this.field497;
            int var13 = (var11 & 7) + this.field498;
            int var14 = arg1.method15();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = this.field80[var15];
            int var18 = arg1.method17();
            if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
                int var19 = this.field73[this.field128][var12][var13];
                int var20 = this.field73[this.field128][var12 + 1][var13];
                int var21 = this.field73[this.field128][var12 + 1][var13 + 1];
                int var22 = this.field73[this.field128][var12][var13 + 1];
                if (var17 == 0) {
                    class7 var23 = this.field253.method267(this.field128, var13, var12, false);
                    if (var23 != null) {
                        int var24 = var23.field545 >> 14 & 32767;
                        if (var15 == 2) {
                            var23.field543 = new class53(var19, var22, var18, 2, var16 + 4, false, var24, var20, var21, false);
                            var23.field544 = new class53(var19, var22, var18, 2, var16 + 1 & 3, false, var24, var20, var21, false);
                        } else {
                            var23.field543 = new class53(var19, var22, var18, var15, var16, false, var24, var20, var21, false);
                        }
                    }
                }
                if (var17 == 1) {
                    class47 var25 = this.field253.method268(var12, this.field461, this.field128, var13);
                    if (var25 != null) {
                        var25.field1399 = new class53(var19, var22, var18, 4, 0, false, var25.field1400 >> 14 & 32767, var20, var21, false);
                    }
                }
                if (var17 == 2) {
                    class6 var26 = this.field253.method269(var12, var13, this.field128, false);
                    if (var15 == 11) {
                        var15 = 10;
                    }
                    if (var26 != null) {
                        var26.field528 = new class53(var19, var22, var18, var15, var16, false, var26.field536 >> 14 & 32767, var20, var21, false);
                    }
                }
                if (var17 == 3) {
                    class49 var27 = this.field253.method270(var12, var13, this.field128, 560);
                    if (var27 != null) {
                        var27.field1436 = new class53(var19, var22, var18, 22, var16, false, var27.field1437 >> 14 & 32767, var20, var21, false);
                    }
                }
            }
        } else if (arg0 == 147) {
            int var28 = arg1.method15();
            int var29 = (var28 >> 4 & 7) + this.field497;
            int var30 = (var28 & 7) + this.field498;
            int var31 = arg1.method17();
            int var32 = arg1.method17();
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                class69 var33 = new class69();
                var33.field1683 = var31;
                var33.field1684 = var32;
                if (this.field171[this.field128][var29][var30] == null) {
                    this.field171[this.field128][var29][var30] = new class50(field137);
                }
                this.field171[this.field128][var29][var30].method468(var33);
                this.method42(var29, var30);
            }
        } else if (arg0 == 242) {
            int var34 = arg1.method15();
            int var35 = (var34 >> 4 & 7) + this.field497;
            int var36 = (var34 & 7) + this.field498;
            int var37 = arg1.method17();
            int var38 = arg1.method17();
            int var39 = arg1.method17();
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class50 var40 = this.field171[this.field128][var35][var36];
                if (var40 != null) {
                    for (class69 var41 = (class69) var40.method471(); var41 != null; var41 = (class69) var40.method473((byte) 2)) {
                        if ((var37 & 32767) == var41.field1683 && var41.field1684 == var38) {
                            var41.field1684 = var39;
                            break;
                        }
                    }
                    this.method42(var35, var36);
                }
            }
        } else if (arg0 == 110) {
            int var42 = arg1.method15();
            int var43 = (var42 >> 4 & 7) + this.field497;
            int var44 = (var42 & 7) + this.field498;
            int var45 = arg1.method17();
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                class50 var46 = this.field171[this.field128][var43][var44];
                if (var46 != null) {
                    for (class69 var47 = (class69) var46.method471(); var47 != null; var47 = (class69) var46.method473((byte) 2)) {
                        if ((var45 & 32767) == var47.field1683) {
                            var47.method430();
                            break;
                        }
                    }
                    if (var46.method471() == null) {
                        this.field171[this.field128][var43][var44] = null;
                    }
                    this.method42(var43, var44);
                }
            }
        } else {
            if (arg0 == 222) {
                int var48 = arg1.method15();
                int var49 = (var48 >> 4 & 7) + this.field497;
                int var50 = (var48 & 7) + this.field498;
                int var51 = arg1.method15();
                int var52 = var51 >> 2;
                int var53 = var51 & 3;
                int var54 = this.field80[var52];
                int var55 = arg1.method17();
                int var56 = arg1.method17();
                int var57 = arg1.method17();
                int var58 = arg1.method17();
                byte var59 = arg1.method16();
                byte var60 = arg1.method16();
                byte var61 = arg1.method16();
                byte var62 = arg1.method16();
                class48 var63;
                if (this.field54 == var58) {
                    var63 = field444;
                } else {
                    var63 = this.field383[var58];
                }
                if (var63 != null) {
                    class32 var64 = class32.method401(var55);
                    int var65 = this.field73[this.field128][var49][var50];
                    int var66 = this.field73[this.field128][var49 + 1][var50];
                    int var67 = this.field73[this.field128][var49 + 1][var50 + 1];
                    int var68 = this.field73[this.field128][var49][var50 + 1];
                    class26 var69 = var64.method406(var52, var53, var65, var66, var67, var68, -1);
                    if (var69 != null) {
                        this.method131(this.field128, var49, -1, var56 + 1, 0, 529, var50, var54, 0, var57 + 1);
                        var63.field1425 = field291 + var56;
                        var63.field1426 = field291 + var57;
                        var63.field1411 = var69;
                        int var70 = var64.field1086;
                        int var71 = var64.field1116;
                        if (var53 == 1 || var53 == 3) {
                            var70 = var64.field1116;
                            var71 = var64.field1086;
                        }
                        var63.field1408 = var49 * 128 + var70 * 64;
                        var63.field1410 = var50 * 128 + var71 * 64;
                        var63.field1409 = this.method94(var63.field1408, 938, var63.field1410, this.field128);
                        if (var59 > var61) {
                            byte var72 = var59;
                            var59 = var61;
                            var61 = var72;
                        }
                        if (var60 > var62) {
                            byte var73 = var60;
                            var60 = var62;
                            var62 = var73;
                        }
                        var63.field1412 = var49 + var59;
                        var63.field1414 = var49 + var61;
                        var63.field1413 = var50 + var60;
                        var63.field1415 = var50 + var62;
                    }
                }
            }
            if (arg0 == 104) {
                int var74 = arg1.method15();
                int var75 = (var74 >> 4 & 7) + this.field497;
                int var76 = (var74 & 7) + this.field498;
                int var77 = arg1.method17();
                int var78 = arg1.method15();
                int var79 = arg1.method17();
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    int var80 = var75 * 128 + 64;
                    int var81 = var76 * 128 + 64;
                    class15 var82 = new class15(var77, var81, this.field128, (byte) 2, var80, this.method94(var80, 938, var81, this.field128) - var78, field291, var79);
                    this.field322.method468(var82);
                }
            } else if (arg0 == 141) {
                int var83 = arg1.method15();
                int var84 = (var83 >> 4 & 7) + this.field497;
                int var85 = (var83 & 7) + this.field498;
                int var86 = arg1.method15();
                int var87 = var86 >> 2;
                int var88 = var86 & 3;
                int var89 = this.field80[var87];
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    this.method131(this.field128, var84, -1, 0, var87, 529, var85, var89, var88, -1);
                }
            } else if (arg0 == 90) {
                int var90 = arg1.method15();
                int var91 = (var90 >> 4 & 7) + this.field497;
                int var92 = (var90 & 7) + this.field498;
                int var93 = var91 + arg1.method16();
                int var94 = var92 + arg1.method16();
                int var95 = arg1.method18();
                int var96 = arg1.method17();
                int var97 = arg1.method15() * 4;
                int var98 = arg1.method15() * 4;
                int var99 = arg1.method17();
                int var100 = arg1.method17();
                int var101 = arg1.method15();
                int var102 = arg1.method15();
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104 && var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104 && var96 != 65535) {
                    int var103 = var91 * 128 + 64;
                    int var104 = var92 * 128 + 64;
                    int var105 = var93 * 128 + 64;
                    int var106 = var94 * 128 + 64;
                    class16 var107 = new class16(var104, var98, var102, field291 + var100, var96, this.field128, field291 + var99, 30330, var95, var101, this.method94(var103, 938, var104, this.field128) - var97, var103);
                    var107.method242(var105, this.method94(var105, 938, var106, this.field128) - var98, 464, field291 + var99, var106);
                    this.field119.method468(var107);
                }
            } else if (arg0 == 133) {
                int var108 = arg1.method15();
                int var109 = (var108 >> 4 & 7) + this.field497;
                int var110 = (var108 & 7) + this.field498;
                int var111 = arg1.method15();
                int var112 = var111 >> 2;
                int var113 = var111 & 3;
                int var114 = this.field80[var112];
                int var115 = arg1.method17();
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                    this.method131(this.field128, var109, var115, 0, var112, 529, var110, var114, var113, -1);
                }
            } else if (arg0 == 107) {
                int var116 = arg1.method15();
                int var117 = (var116 >> 4 & 7) + this.field497;
                int var118 = (var116 & 7) + this.field498;
                int var119 = arg1.method17();
                int var120 = arg1.method17();
                int var121 = arg1.method17();
                if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104 && this.field54 != var121) {
                    class69 var122 = new class69();
                    var122.field1683 = var119;
                    var122.field1684 = var120;
                    if (this.field171[this.field128][var117][var118] == null) {
                        this.field171[this.field128][var117][var118] = new class50(field137);
                    }
                    this.field171[this.field128][var117][var118].method468(var122);
                    this.method42(var117, var118);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method141(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field512[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field512[var17] = 192;
        }
        while (arg0 >= 0) {
            this.field171 = null;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field513[var14] = (this.field512[var14 - 1] + this.field512[var14 + 1] + this.field512[var14 - 128] + this.field512[var14 + 128]) / 4;
            }
        }
        this.field441 += 128;
        if (this.field441 > this.field169.length) {
            this.field441 -= this.field169.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method92((byte) 9, this.field155[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field513[var11 + 128] - this.field169[this.field441 + var11 & this.field169.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field512[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field180[var8] = this.field180[var8 + 1];
        }
        this.field180[var2 - 1] = (int) (Math.sin((double) field291 / 14.0D) * 16.0D + Math.sin((double) field291 / 15.0D) * 14.0D + Math.sin((double) field291 / 16.0D) * 12.0D);
        if (this.field194 > 0) {
            this.field194 -= 4;
        }
        if (this.field195 > 0) {
            this.field195 -= 4;
        }
        if (this.field194 == 0 && this.field195 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field194 = 1024;
            }
            if (var9 == 1) {
                this.field195 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public void method142(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field348);
        if (this.field167 != null) {
            System.out.println("Od-cycle:" + this.field167.field656);
        }
        System.out.println("loop-cycle:" + field291);
        System.out.println("draw-cycle:" + field471);
        System.out.println("ptype:" + this.field258);
        this.field473 &= arg0;
        System.out.println("psize:" + this.field257);
        if (this.field202 != null) {
            this.field202.method323(this.field193);
        }
        super.field1551 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method143(boolean arg0) {
        if (!arg0) {
            this.field258 = -1;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1557 != null ? super.field1557 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLETSIPTYG;)V")
    public final void method144(byte arg0, class8 arg1) {
        int var3 = arg1.field609;
        if (arg0 == 2) {
            if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
                if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                    int var5 = this.field200;
                    if (this.field201 != 2) {
                        var5 = 0;
                    }
                    if (var3 > 800) {
                        var3 -= 701;
                    } else {
                        var3 -= 101;
                    }
                    if (var3 >= var5) {
                        arg1.field572 = "";
                        arg1.field608 = 0;
                    } else {
                        if (this.field309[var3] == 0) {
                            arg1.field572 = "@red@Offline";
                        } else if (this.field309[var3] == field393) {
                            arg1.field572 = "@gre@World-" + (this.field309[var3] - 9);
                        } else {
                            arg1.field572 = "@yel@World-" + (this.field309[var3] - 9);
                        }
                        arg1.field608 = 1;
                    }
                } else if (var3 == 203) {
                    int var6 = this.field200;
                    if (this.field201 != 2) {
                        var6 = 0;
                    }
                    arg1.field547 = var6 * 15 + 20;
                    if (arg1.field547 <= arg1.field557) {
                        arg1.field547 = arg1.field557 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 == 0 && this.field201 == 0) {
                        arg1.field572 = "Loading ignore list";
                        arg1.field608 = 0;
                    } else if (var3 == 1 && this.field201 == 0) {
                        arg1.field572 = "Please wait...";
                        arg1.field608 = 0;
                    } else {
                        int var7 = this.field367;
                        if (this.field201 == 0) {
                            var7 = 0;
                        }
                        if (var3 >= var7) {
                            arg1.field572 = "";
                            arg1.field608 = 0;
                        } else {
                            arg1.field572 = class44.method463((byte) -2, class44.method460(this.field207[var3], -437));
                            arg1.field608 = 1;
                        }
                    }
                } else if (var3 == 503) {
                    arg1.field547 = this.field367 * 15 + 20;
                    if (arg1.field547 <= arg1.field557) {
                        arg1.field547 = arg1.field557 + 1;
                    }
                } else if (var3 == 327) {
                    arg1.field577 = 150;
                    arg1.field578 = (int) (Math.sin((double) field291 / 40.0D) * 256.0D) & 2047;
                    if (this.field301) {
                        for (int var8 = 0; var8 < 7; ++var8) {
                            int var15 = this.field380[var8];
                            if (var15 >= 0 && !class51.field1447[var15].method478(6)) {
                                return;
                            }
                        }
                        this.field301 = false;
                        class26[] var9 = new class26[7];
                        int var10 = 0;
                        for (int var11 = 0; var11 < 7; ++var11) {
                            int var14 = this.field380[var11];
                            if (var14 >= 0) {
                                var9[var10++] = class51.field1447[var14].method479(-233);
                            }
                        }
                        class26 var12 = new class26(9, var10, var9);
                        for (int var13 = 0; var13 < 5; ++var13) {
                            if (this.field451[var13] != 0) {
                                var12.method342(field132[var13][0], field132[var13][this.field451[var13]]);
                                if (var13 == 1) {
                                    var12.method342(field458[0], field458[this.field451[var13]]);
                                }
                            }
                        }
                        var12.method335(19035);
                        var12.method336((byte) 46, class42.field1314[field444.field1299].field1316[0]);
                        var12.method345(64, 850, -30, -50, -30, true);
                        arg1.field550 = 5;
                        arg1.field551 = 0;
                        class8.method179(var12, 0, 0, 5);
                    }
                } else if (var3 == 324) {
                    if (this.field370 == null) {
                        this.field370 = arg1.field610;
                        this.field371 = arg1.field583;
                    }
                    if (this.field506) {
                        arg1.field610 = this.field371;
                    } else {
                        arg1.field610 = this.field370;
                    }
                } else if (var3 == 325) {
                    if (this.field370 == null) {
                        this.field370 = arg1.field610;
                        this.field371 = arg1.field583;
                    }
                    if (this.field506) {
                        arg1.field610 = this.field370;
                    } else {
                        arg1.field610 = this.field371;
                    }
                } else if (var3 == 600) {
                    arg1.field572 = this.field459;
                    if (field291 % 20 < 10) {
                        arg1.field572 = arg1.field572 + "|";
                    } else {
                        arg1.field572 = arg1.field572 + " ";
                    }
                } else {
                    if (var3 == 613) {
                        if (this.field465 >= 1) {
                            if (this.field368) {
                                arg1.field614 = 16711680;
                                arg1.field572 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg1.field614 = 16777215;
                                arg1.field572 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg1.field572 = "";
                        }
                    }
                    if (var3 == 650 || var3 == 655) {
                        if (this.field452 != 0) {
                            String var16;
                            if (this.field267 == 0) {
                                var16 = "earlier today";
                            } else if (this.field267 == 1) {
                                var16 = "yesterday";
                            } else {
                                var16 = this.field267 + " days ago";
                            }
                            arg1.field572 = "You last logged in " + var16 + " from: " + signlink.dns;
                        } else {
                            arg1.field572 = "";
                        }
                    }
                    if (var3 == 651) {
                        if (this.field58 == 0) {
                            arg1.field572 = "0 unread messages";
                            arg1.field614 = 16776960;
                        }
                        if (this.field58 == 1) {
                            arg1.field572 = "1 unread message";
                            arg1.field614 = 65280;
                        }
                        if (this.field58 > 1) {
                            arg1.field572 = this.field58 + " unread messages";
                            arg1.field614 = 65280;
                        }
                    }
                    if (var3 == 652) {
                        if (this.field191 == 201) {
                            if (this.field164 == 1) {
                                arg1.field572 = "@yel@This is a non-members world: @whi@Since you are a member we";
                            } else {
                                arg1.field572 = "";
                            }
                        } else if (this.field191 == 200) {
                            arg1.field572 = "You have not yet set any password recovery questions.";
                        } else {
                            String var17;
                            if (this.field191 == 0) {
                                var17 = "Earlier today";
                            } else if (this.field191 == 1) {
                                var17 = "Yesterday";
                            } else {
                                var17 = this.field191 + " days ago";
                            }
                            arg1.field572 = var17 + " you changed your recovery questions";
                        }
                    }
                    if (var3 == 653) {
                        if (this.field191 == 201) {
                            if (this.field164 == 1) {
                                arg1.field572 = "@whi@recommend you use a members world instead. You may use";
                            } else {
                                arg1.field572 = "";
                            }
                        } else if (this.field191 == 200) {
                            arg1.field572 = "We strongly recommend you do so now to secure your account.";
                        } else {
                            arg1.field572 = "If you do not remember making this change then cancel it immediately";
                        }
                    }
                    if (var3 == 654) {
                        if (this.field191 == 201) {
                            if (this.field164 == 1) {
                                arg1.field572 = "@whi@this world but member benefits are unavailable whilst here.";
                            } else {
                                arg1.field572 = "";
                            }
                        } else if (this.field191 == 200) {
                            arg1.field572 = "Do this from the 'account management' area on our front webpage";
                        } else {
                            arg1.field572 = "Do this from the 'account management' area on our front webpage";
                        }
                    }
                }
            } else if (var3 == 1 && this.field201 == 0) {
                arg1.field572 = "Loading friend list";
                arg1.field608 = 0;
            } else if (var3 == 1 && this.field201 == 1) {
                arg1.field572 = "Connecting to friendserver";
                arg1.field608 = 0;
            } else if (var3 == 2 && this.field201 != 2) {
                arg1.field572 = "Please wait...";
                arg1.field608 = 0;
            } else {
                int var4 = this.field200;
                if (this.field201 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg1.field572 = "";
                    arg1.field608 = 0;
                } else {
                    arg1.field572 = this.field154[var3];
                    arg1.field608 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZZ)V")
    public final void method145(int arg0, boolean arg1, boolean arg2) {
        signlink.midivol = arg0;
        if (arg1) {
            this.method146();
        }
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method146() {
        this.method166("Starting up", 20, -799);
        if (signlink.sunjava) {
            super.field1548 = 5;
        }
        if (field271) {
            this.field521 = true;
        } else {
            field271 = true;
            boolean var1 = false;
            String var2 = this.method37((byte) 120);
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
                this.field189 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field51[var3] = new class36(var3 + 1, signlink.cache_idx[var3], 500000, 8, signlink.cache_dat);
                    }
                }
                try {
                    this.method77(88);
                    this.field487 = this.method107(25, field289, "title", 1, "title screen", this.field221[1]);
                    this.field409 = new class39(this.field487, false, 0, "p11_full");
                    this.field410 = new class39(this.field487, false, 0, "p12_full");
                    this.field411 = new class39(this.field487, false, 0, "b12_full");
                    this.field412 = new class39(this.field487, true, 0, "q8_full");
                    this.method155(0);
                    this.method46(true);
                    class37 var4 = this.method107(30, field289, "config", 2, "config", this.field221[2]);
                    class37 var5 = this.method107(35, field289, "interface", 3, "interface", this.field221[3]);
                    class37 var6 = this.method107(40, field289, "media", 4, "2d graphics", this.field221[4]);
                    class37 var7 = this.method107(45, field289, "textures", 6, "textures", this.field221[6]);
                    class37 var8 = this.method107(50, field289, "wordenc", 7, "chat system", this.field221[7]);
                    class37 var9 = this.method107(55, field289, "sounds", 8, "sound effects", this.field221[8]);
                    this.field392 = new byte[4][104][104];
                    this.field73 = new int[4][105][105];
                    this.field253 = new class17(field405, this.field73, 104, 104, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field46[var10] = new class21(104, field378, 104);
                    }
                    this.field433 = new class70(512, 512);
                    class37 var11 = this.method107(60, field289, "versionlist", 5, "update list", this.field221[5]);
                    this.method166("Connecting to update server", 60, -799);
                    this.field167 = new class9();
                    this.field167.method191(var11, this);
                    class59.method520(this.field167.method182(514));
                    class26.method325(this.field167.method186(0, field510), this.field167);
                    if (!field396) {
                        this.field427 = 0;
                        try {
                            this.field427 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field428 = true;
                        this.field167.method190(2, this.field427);
                        while (this.field167.method194() > 0) {
                            this.method60(true);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field167.field623 > 3) {
                                this.method96("ondemand");
                                return;
                            }
                        }
                    }
                    this.method166("Requesting animations", 65, -799);
                    int var12 = this.field167.method186(1, field510);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field167.method190(1, var13);
                    }
                    while (this.field167.method194() > 0) {
                        int var14 = var12 - this.field167.method194();
                        if (var14 > 0) {
                            this.method166("Loading animations - " + var14 * 100 / var12 + "%", 65, -799);
                        }
                        this.method60(true);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field167.field623 > 3) {
                            this.method96("ondemand");
                            return;
                        }
                    }
                    this.method166("Requesting models", 70, -799);
                    int var15 = this.field167.method186(0, field510);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field167.method185(6, var16);
                        if ((var17 & 1) != 0) {
                            this.field167.method190(0, var16);
                        }
                    }
                    int var18 = this.field167.method194();
                    while (this.field167.method194() > 0) {
                        int var19 = var18 - this.field167.method194();
                        if (var19 > 0) {
                            this.method166("Loading models - " + var19 * 100 / var18 + "%", 70, -799);
                        }
                        this.method60(true);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field51[0] != null) {
                        this.method166("Requesting maps", 75, -799);
                        this.field167.method190(3, this.field167.method202(47, -900, 48, 0));
                        this.field167.method190(3, this.field167.method202(47, -900, 48, 1));
                        this.field167.method190(3, this.field167.method202(48, -900, 48, 0));
                        this.field167.method190(3, this.field167.method202(48, -900, 48, 1));
                        this.field167.method190(3, this.field167.method202(49, -900, 48, 0));
                        this.field167.method190(3, this.field167.method202(49, -900, 48, 1));
                        this.field167.method190(3, this.field167.method202(47, -900, 47, 0));
                        this.field167.method190(3, this.field167.method202(47, -900, 47, 1));
                        this.field167.method190(3, this.field167.method202(48, -900, 47, 0));
                        this.field167.method190(3, this.field167.method202(48, -900, 47, 1));
                        this.field167.method190(3, this.field167.method202(48, -900, 148, 0));
                        this.field167.method190(3, this.field167.method202(48, -900, 148, 1));
                        int var20 = this.field167.method194();
                        while (this.field167.method194() > 0) {
                            int var21 = var20 - this.field167.method194();
                            if (var21 > 0) {
                                this.method166("Loading maps - " + var21 * 100 / var20 + "%", 75, -799);
                            }
                            this.method60(true);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field167.method186(0, field510);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field167.method185(6, var23);
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
                            this.field167.method200(0, false, var25, var23);
                        }
                    }
                    this.field167.method188(-844, field395);
                    if (!field396) {
                        int var26 = this.field167.method186(2, field510);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field167.method187(0, var27)) {
                                this.field167.method200(2, false, (byte) 1, var27);
                            }
                        }
                    }
                    this.method166("Unpacking media", 80, -799);
                    this.field362 = new class57(var6, "invback", 0);
                    this.field364 = new class57(var6, "chatback", 0);
                    this.field363 = new class57(var6, "mapback", 0);
                    this.field112 = new class57(var6, "backbase1", 0);
                    this.field113 = new class57(var6, "backbase2", 0);
                    this.field114 = new class57(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field354[var28] = new class57(var6, "sideicons", var28);
                    }
                    this.field470 = new class70(var6, "compass", 0);
                    this.field379 = new class70(var6, "mapedge", 0);
                    this.field379.method550(false);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field66[var29] = new class57(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field460[var30] = new class70(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field509[var31] = new class70(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field269[var32] = new class70(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field203 = new class70(var6, "mapmarker", 0);
                    this.field204 = new class70(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field121[var33] = new class70(var6, "cross", var33);
                    }
                    this.field304 = new class70(var6, "mapdots", 0);
                    this.field305 = new class70(var6, "mapdots", 1);
                    this.field306 = new class70(var6, "mapdots", 2);
                    this.field307 = new class70(var6, "mapdots", 3);
                    this.field308 = new class70(var6, "mapdots", 4);
                    this.field249 = new class57(var6, "scrollbar", 0);
                    this.field250 = new class57(var6, "scrollbar", 1);
                    this.field329 = new class57(var6, "redstone1", 0);
                    this.field330 = new class57(var6, "redstone2", 0);
                    this.field331 = new class57(var6, "redstone3", 0);
                    this.field332 = new class57(var6, "redstone1", 0);
                    this.field332.method515(418);
                    this.field333 = new class57(var6, "redstone2", 0);
                    this.field333.method515(418);
                    this.field222 = new class57(var6, "redstone1", 0);
                    this.field222.method516(0);
                    this.field223 = new class57(var6, "redstone2", 0);
                    this.field223.method516(0);
                    this.field224 = new class57(var6, "redstone3", 0);
                    this.field224.method516(0);
                    this.field225 = new class57(var6, "redstone1", 0);
                    this.field225.method515(418);
                    this.field225.method516(0);
                    this.field226 = new class57(var6, "redstone2", 0);
                    this.field226.method515(418);
                    this.field226.method516(0);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field406[var34] = new class57(var6, "mod_icons", var34);
                    }
                    class70 var35 = new class70(var6, "backleft1", 0);
                    this.field338 = new class68(var35.field1694, (byte) -48, this.method143(true), var35.field1695);
                    var35.method551(true, 0, 0);
                    class70 var36 = new class70(var6, "backleft2", 0);
                    this.field339 = new class68(var36.field1694, (byte) -48, this.method143(true), var36.field1695);
                    var36.method551(true, 0, 0);
                    class70 var37 = new class70(var6, "backright1", 0);
                    this.field340 = new class68(var37.field1694, (byte) -48, this.method143(true), var37.field1695);
                    var37.method551(true, 0, 0);
                    class70 var38 = new class70(var6, "backright2", 0);
                    this.field341 = new class68(var38.field1694, (byte) -48, this.method143(true), var38.field1695);
                    var38.method551(true, 0, 0);
                    class70 var39 = new class70(var6, "backtop1", 0);
                    this.field342 = new class68(var39.field1694, (byte) -48, this.method143(true), var39.field1695);
                    var39.method551(true, 0, 0);
                    class70 var40 = new class70(var6, "backvmid1", 0);
                    this.field343 = new class68(var40.field1694, (byte) -48, this.method143(true), var40.field1695);
                    var40.method551(true, 0, 0);
                    class70 var41 = new class70(var6, "backvmid2", 0);
                    this.field344 = new class68(var41.field1694, (byte) -48, this.method143(true), var41.field1695);
                    var41.method551(true, 0, 0);
                    class70 var42 = new class70(var6, "backvmid3", 0);
                    this.field345 = new class68(var42.field1694, (byte) -48, this.method143(true), var42.field1695);
                    var42.method551(true, 0, 0);
                    class70 var43 = new class70(var6, "backhmid2", 0);
                    this.field346 = new class68(var43.field1694, (byte) -48, this.method143(true), var43.field1695);
                    var43.method551(true, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field460[var48] != null) {
                            this.field460[var48].method549(var44 + var47, var46 + var47, 0, var45 + var47);
                        }
                        if (this.field66[var48] != null) {
                            this.field66[var48].method517(var44 + var47, var46 + var47, 0, var45 + var47);
                        }
                    }
                    this.method166("Unpacking textures", 83, -799);
                    class12.method211((byte) 6, var7);
                    class12.method215(0.8D, true);
                    class12.method210(20, false);
                    this.method166("Unpacking config", 86, -799);
                    class42.method456(var4, (byte) 0);
                    class32.method404(var4);
                    class28.method355(var4, (byte) 0);
                    class33.method416(var4);
                    class52.method483(var4);
                    class51.method476(var4, (byte) 0);
                    class35.method421(var4, (byte) 0);
                    class27.method353(var4, (byte) 0);
                    class5.method31(var4, (byte) 0);
                    class33.field1172 = field395;
                    if (!field396) {
                        this.method166("Unpacking sounds", 90, -799);
                        byte[] var49 = var9.method429("sounds.dat", (byte[]) null);
                        class3 var50 = new class3(false, var49);
                        class14.method235(var50, (byte) 0);
                    }
                    this.method166("Unpacking interfaces", 95, -799);
                    class39[] var51 = new class39[] { this.field409, this.field410, this.field411, this.field412 };
                    class8.method178(var5, var51, var6, 8);
                    this.method166("Preparing game engine", 100, -799);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field363.field1584[this.field363.field1586 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field74[var52] = var53;
                        this.field165[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field363.field1584[this.field363.field1586 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field315[var56 - 5] = var57 - 25;
                        this.field65[var56 - 5] = var58 - var57;
                    }
                    class12.method208(479, 96, -849);
                    this.field285 = class12.field694;
                    class12.method208(190, 261, -849);
                    this.field286 = class12.field694;
                    class12.method208(512, 334, -849);
                    this.field287 = class12.field694;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class12.field692[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class17.method281(512, var60, 334, 500, 800, (byte) 7);
                    class30.method359(var8);
                    this.field472 = new class45(this, (byte) 0);
                    this.method115(this.field472, 10);
                    class53.field1505 = this;
                    class32.field1121 = this;
                    class52.field1470 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field417 + " " + this.field153);
                    this.field179 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method147(int arg0) {
        class32.field1122.method317();
        class32.field1098.method317();
        class52.field1455.method317();
        class33.field1159.method317();
        class33.field1176.method317();
        class48.field1407.method317();
        this.field257 += arg0;
        class35.field1210.method317();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method148(int arg0, int arg1) {
        if (arg0 != -19775) {
            this.field173 = !this.field173;
        }
        if (!field396) {
            if (class12.field702[17] >= arg1) {
                class57 var3 = class12.field696[17];
                int var4 = var3.field1587 * var3.field1586 - 1;
                int var5 = this.field56 * var3.field1586 * 2;
                byte[] var6 = var3.field1584;
                byte[] var7 = this.field397;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field1584 = var7;
                this.field397 = var6;
                class12.method213(true, 17);
                ++field79;
                if (field79 > 1723) {
                    field79 = 0;
                    this.field106.method4(144, 0);
                    this.field106.method5(0);
                    int var9 = this.field106.field20;
                    this.field106.method5(61);
                    this.field106.method6(30830);
                    this.field106.method6(40631);
                    this.field106.method5(17);
                    this.field106.method6((int) (Math.random() * 65536.0D));
                    this.field106.method5((int) (Math.random() * 256.0D));
                    this.field106.method5(172);
                    this.field106.method6(27205);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field106.method5(157);
                    }
                    this.field106.method5(189);
                    this.field106.method14(false, this.field106.field20 - var9);
                }
            }
            if (class12.field702[24] >= arg1) {
                class57 var10 = class12.field696[24];
                int var11 = var10.field1587 * var10.field1586 - 1;
                int var12 = this.field56 * var10.field1586 * 2;
                byte[] var13 = var10.field1584;
                byte[] var14 = this.field397;
                for (int var15 = 0; var15 <= var11; ++var15) {
                    var14[var15] = var13[var15 - var12 & var11];
                }
                var10.field1584 = var14;
                this.field397 = var13;
                class12.method213(true, 24);
            }
            if (class12.field702[34] >= arg1) {
                class57 var16 = class12.field696[34];
                int var17 = var16.field1587 * var16.field1586 - 1;
                int var18 = this.field56 * var16.field1586 * 2;
                byte[] var19 = var16.field1584;
                byte[] var20 = this.field397;
                for (int var21 = 0; var21 <= var17; ++var21) {
                    var20[var21] = var19[var21 - var18 & var17];
                }
                var16.field1584 = var20;
                this.field397 = var19;
                class12.method213(true, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (arg0 == 43923) {
            if (field396 && this.field466 == 2 && class54.field1529 != this.field128) {
                this.field243.method545(16595);
                this.field410.method432(257, 151, 190, "Loading - please wait.", 0);
                this.field410.method432(256, 150, 190, "Loading - please wait.", 16777215);
                this.field243.method546(super.field1554, 4, -52, 4);
                this.field466 = 1;
                this.field366 = System.currentTimeMillis();
            }
            if (this.field466 == 1) {
                int var2 = this.method150(this.field288);
                if (var2 != 0 && System.currentTimeMillis() - this.field366 > 360000L) {
                    signlink.reporterror(this.field205 + " glcfb " + this.field55 + "," + var2 + "," + field396 + "," + this.field51[0] + "," + this.field167.method194() + "," + this.field128 + "," + this.field263 + "," + this.field264);
                    this.field366 = System.currentTimeMillis();
                }
            }
            if (this.field466 == 2 && this.field505 != this.field128) {
                this.field505 = this.field128;
                this.method158(this.field128, (byte) 3);
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)I")
    public final int method150(int arg0) {
        for (int var2 = 0; var2 < this.field47.length; ++var2) {
            if (this.field47[var2] == null && this.field359[var2] != -1) {
                return -1;
            }
            if (this.field64[var2] == null && this.field360[var2] != -1) {
                return -2;
            }
        }
        int var3 = 38 / arg0;
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field47.length; ++var5) {
            byte[] var6 = this.field64[var5];
            if (var6 != null) {
                int var7 = (this.field358[var5] >> 8) * 64 - this.field310;
                int var8 = (this.field358[var5] & 255) * 64 - this.field311;
                var4 &= class54.method491(var7, var8, var6, false);
            }
        }
        if (!var4) {
            return -3;
        } else if (this.field515) {
            return -4;
        } else {
            this.field466 = 2;
            class54.field1529 = this.field128;
            this.method39(684);
            this.field106.method4(15, 0);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field249.method518(arg4, arg3, true);
        this.field250.method518(arg4, arg1 + arg3 - 16, true);
        class13.method228(arg3 + 16, arg1 - 32, 16, arg4, this.field276, true);
        int var7 = (arg1 - 32) * arg1 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg5 / (arg2 - arg1);
        class13.method228(arg3 + 16 + var8, var7, 16, arg4, this.field334, true);
        class13.method233(var7, arg4, -267, arg3 + 16 + var8, this.field484);
        class13.method233(var7, arg4 + 1, -267, arg3 + 16 + var8, this.field484);
        class13.method231(arg4, 16, (byte) 31, arg3 + 16 + var8, this.field484);
        class13.method231(arg4, 16, (byte) 31, arg3 + 17 + var8, this.field484);
        class13.method233(var7, arg4 + 15, -267, arg3 + 16 + var8, this.field268);
        class13.method233(var7 - 1, arg4 + 14, -267, arg3 + 17 + var8, this.field268);
        this.field257 += arg0;
        class13.method231(arg4, 16, (byte) 31, arg3 + 15 + var8 + var7, this.field268);
        class13.method231(arg4 + 1, 15, (byte) 31, arg3 + 14 + var8 + var7, this.field268);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method152(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
            try {
                int var3 = field444.field1268 + this.field480;
                int var4 = field444.field1269 + this.field85;
                if (this.field235 - var3 < -500 || this.field235 - var3 > 500 || this.field236 - var4 < -500 || this.field236 - var4 > 500) {
                    this.field235 = var3;
                    this.field236 = var4;
                }
                if (this.field235 != var3) {
                    this.field235 += (var3 - this.field235) / 16;
                }
                if (this.field236 != var4) {
                    this.field236 += (var4 - this.field236) / 16;
                }
                if (super.field1572[1] == 1) {
                    this.field102 += (-24 - this.field102) / 2;
                } else if (super.field1572[2] == 1) {
                    this.field102 += (24 - this.field102) / 2;
                } else {
                    this.field102 /= 2;
                }
                if (super.field1572[3] == 1) {
                    this.field103 += (12 - this.field103) / 2;
                } else if (super.field1572[4] == 1) {
                    this.field103 += (-12 - this.field103) / 2;
                } else {
                    this.field103 /= 2;
                }
                this.field101 = this.field102 / 2 + this.field101 & 2047;
                this.field100 += this.field103 / 2;
                if (this.field100 < 128) {
                    this.field100 = 128;
                }
                if (this.field100 > 383) {
                    this.field100 = 383;
                }
                int var5 = this.field235 >> 7;
                int var6 = this.field236 >> 7;
                int var7 = this.method94(this.field235, 938, this.field236, this.field128);
                int var8 = 0;
                if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                            int var11 = this.field128;
                            if (var11 < 3 && (this.field392[1][var9][var10] & 2) == 2) {
                                ++var11;
                            }
                            int var12 = var7 - this.field73[var11][var9][var10];
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
                if (var13 > this.field442) {
                    this.field442 += (var13 - this.field442) / 24;
                } else if (var13 < this.field442) {
                    this.field442 += (var13 - this.field442) / 80;
                }
            } catch (Exception var14) {
                signlink.reporterror("glfc_ex " + field444.field1268 + "," + field444.field1269 + "," + this.field235 + "," + this.field236 + "," + this.field263 + "," + this.field264 + "," + this.field310 + "," + this.field311);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LETSIPTYG;I)Z")
    public final boolean method153(class8 arg0, int arg1) {
        if (arg1 != 1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg0.field609;
        if ((var4 < 1 || var4 > 200) && (var4 < 701 || var4 > 900)) {
            if (var4 >= 401 && var4 <= 500) {
                this.field262[this.field273] = "Remove @whi@" + arg0.field572;
                this.field502[this.field273] = 801;
                ++this.field273;
                return true;
            } else {
                return false;
            }
        } else {
            if (var4 >= 801) {
                var4 -= 701;
            } else if (var4 >= 701) {
                var4 -= 601;
            } else if (var4 >= 101) {
                var4 -= 101;
            } else {
                --var4;
            }
            this.field262[this.field273] = "Remove @whi@" + this.field154[var4];
            this.field502[this.field273] = 361;
            ++this.field273;
            this.field262[this.field273] = "Message @whi@" + this.field154[var4];
            this.field502[this.field273] = 281;
            ++this.field273;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1557 != null) {
                    return new URL("http://127.0.0.1:" + (field394 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method154(boolean arg0) {
        if (this.field493 > 1) {
            --this.field493;
        }
        if (this.field261 > 0) {
            --this.field261;
        }
        for (int var2 = 0; var2 < 5 && this.method56(false); ++var2) {
        }
        if (this.field473) {
            Object var3 = this.field472.field1385;
            synchronized (this.field472.field1385) {
                if (!field421) {
                    this.field472.field1386 = 0;
                } else if (super.field1568 != 0 || this.field472.field1386 >= 40) {
                    this.field106.method4(116, 0);
                    this.field106.method5(0);
                    int var4 = this.field106.field20;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field472.field1386 && var4 - this.field106.field20 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field472.field1387[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field472.field1390[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field472.field1387[var6] == -1 && this.field472.field1390[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field429 == var8 && this.field430 == var7) {
                            if (this.field435 < 2047) {
                                ++this.field435;
                            }
                        } else {
                            int var10 = var8 - this.field429;
                            this.field429 = var8;
                            int var11 = var7 - this.field430;
                            this.field430 = var7;
                            if (this.field435 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field106.method6((this.field435 << 12) + (var10 << 6) + var11);
                                this.field435 = 0;
                            } else if (this.field435 < 8) {
                                this.field106.method8((this.field435 << 19) + 8388608 + var9);
                                this.field435 = 0;
                            } else {
                                this.field106.method9((this.field435 << 19) + -1073741824 + var9);
                                this.field435 = 0;
                            }
                        }
                    }
                    this.field106.method14(false, this.field106.field20 - var4);
                    if (var5 >= this.field472.field1386) {
                        this.field472.field1386 = 0;
                    } else {
                        this.field472.field1386 -= var5;
                        for (int var12 = 0; var12 < this.field472.field1386; ++var12) {
                            this.field472.field1390[var12] = this.field472.field1390[var5 + var12];
                            this.field472.field1387[var12] = this.field472.field1387[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1568 != 0) {
                long var13 = (super.field1571 - this.field499) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field499 = super.field1571;
                int var15 = super.field1570;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1569;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1568 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field106.method4(251, 0);
                this.field106.method9((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field237 > 0) {
                --this.field237;
            }
            if (super.field1572[1] == 1 || super.field1572[2] == 1 || super.field1572[3] == 1 || super.field1572[4] == 1) {
                this.field238 = true;
            }
            if (this.field238 && this.field237 <= 0) {
                this.field237 = 20;
                this.field238 = false;
                this.field106.method4(20, 0);
                this.field106.method6(this.field100);
                this.field106.method6(this.field101);
            }
            if (super.field1559 && !this.field71) {
                this.field71 = true;
                this.field106.method4(206, 0);
                this.field106.method5(1);
            }
            if (!super.field1559 && this.field71) {
                this.field71 = false;
                this.field106.method4(206, 0);
                this.field106.method5(0);
            }
            this.method149(43923);
            this.method135((byte) 39);
            this.method95(27);
            ++this.field259;
            if (this.field259 > 750) {
                this.method127(3);
            }
            this.method162(this.field63);
            this.method78(-9317);
            this.method47(-615);
            ++this.field56;
            if (this.field199 != 0) {
                this.field198 += 20;
                if (this.field198 >= 400) {
                    this.field199 = 0;
                }
            }
            if (this.field326 != 0) {
                ++this.field323;
                if (this.field323 >= 15) {
                    if (this.field326 == 2) {
                        this.field126 = true;
                    }
                    if (this.field326 == 3) {
                        this.field159 = true;
                    }
                    this.field326 = 0;
                }
            }
            if (this.field231 != 0) {
                ++this.field72;
                if (super.field1562 > this.field232 + 5 || super.field1562 < this.field232 - 5 || super.field1563 > this.field233 + 5 || super.field1563 < this.field233 - 5) {
                    this.field280 = true;
                }
                if (super.field1561 == 0) {
                    if (this.field231 == 2) {
                        this.field126 = true;
                    }
                    if (this.field231 == 3) {
                        this.field159 = true;
                    }
                    this.field231 = 0;
                    if (this.field280 && this.field72 >= 5) {
                        this.field464 = -1;
                        this.method132(this.field173);
                        if (this.field464 == this.field229 && this.field463 != this.field230) {
                            class8 var20 = class8.field574[this.field229];
                            byte var21 = 0;
                            if (this.field138 == 1 && var20.field609 == 206) {
                                var21 = 1;
                            }
                            if (var20.field582[this.field463] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field558) {
                                int var22 = this.field230;
                                int var23 = this.field463;
                                var20.field582[var23] = var20.field582[var22];
                                var20.field585[var23] = var20.field585[var22];
                                var20.field582[var22] = -1;
                                var20.field585[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field230;
                                int var25 = this.field463;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method176((byte) -76, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method176((byte) -76, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method176((byte) -76, this.field463, this.field230);
                            }
                            this.field106.method4(19, 0);
                            this.field106.method6(this.field229);
                            this.field106.method6(this.field230);
                            this.field106.method6(this.field463);
                            this.field106.method5(var21);
                        }
                    } else if ((this.field108 == 1 || this.method113(this.field273 - 1, true)) && this.field273 > 2) {
                        this.method157(true);
                    } else if (this.field273 > 0) {
                        this.method49(this.field462, this.field273 - 1);
                    }
                    this.field323 = 10;
                    super.field1568 = 0;
                }
            }
            ++field266;
            if (field266 > 1046) {
                field266 = 0;
                this.field106.method4(129, 0);
                this.field106.method5(0);
                int var26 = this.field106.field20;
                this.field106.method5(12);
                this.field106.method6(39329);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field106.method6(27202);
                }
                this.field106.method5((int) (Math.random() * 256.0D));
                this.field106.method6(11442);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field106.method5(72);
                }
                this.field106.method6(32187);
                this.field106.method5(71);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field106.method6(59223);
                }
                this.field106.method6(26405);
                this.field106.method14(false, this.field106.field20 - var26);
            }
            if (class17.field809 != -1) {
                int var27 = class17.field809;
                int var28 = class17.field810;
                boolean var29 = this.method138(field444.field1277[0], field444.field1276[0], 0, var27, 0, 303, 0, true, 0, var28, 0, 0);
                class17.field809 = -1;
                if (var29) {
                    this.field196 = super.field1569;
                    this.field197 = super.field1570;
                    this.field199 = 1;
                    this.field198 = 0;
                }
            }
            if (super.field1568 == 1 && this.field365 != null) {
                this.field365 = null;
                this.field159 = true;
                super.field1568 = 0;
            }
            this.method58(-36118);
            this.method61(this.field67);
            this.method76(false);
            this.method70(3);
            if (super.field1561 == 1 || super.field1568 == 1) {
                ++this.field272;
            }
            if (this.field466 == 2) {
                this.method152((byte) 4);
            }
            if (this.field466 == 2 && this.field44) {
                this.method38(6);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field300[var30]++;
            }
            this.method71(this.field134);
            ++super.field1560;
            if (super.field1560 > 4500) {
                this.field261 = 250;
                super.field1560 -= 500;
                this.field106.method4(119, 0);
            }
            ++this.field485;
            if (arg0) {
                this.field258 = this.field282.method15();
            }
            if (this.field485 > 500) {
                this.field485 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field480 += this.field481;
                }
                if ((var31 & 2) == 2) {
                    this.field85 += this.field86;
                }
                if ((var31 & 4) == 4) {
                    this.field389 += this.field390;
                }
            }
            if (this.field480 < -50) {
                this.field481 = 2;
            }
            if (this.field480 > 50) {
                this.field481 = -2;
            }
            if (this.field85 < -55) {
                this.field86 = 2;
            }
            if (this.field85 > 55) {
                this.field86 = -2;
            }
            if (this.field389 < -40) {
                this.field390 = 1;
            }
            if (this.field389 > 40) {
                this.field390 = -1;
            }
            ++this.field407;
            if (this.field407 > 500) {
                this.field407 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field81 += this.field82;
                }
                if ((var32 & 2) == 2) {
                    this.field183 += this.field184;
                }
            }
            if (this.field81 < -60) {
                this.field82 = 2;
            }
            if (this.field81 > 60) {
                this.field82 = -2;
            }
            if (this.field183 < -20) {
                this.field184 = 1;
            }
            if (this.field183 > 10) {
                this.field184 = -1;
            }
            ++this.field260;
            if (this.field260 > 50) {
                this.field106.method4(21, 0);
            }
            try {
                if (this.field202 != null && this.field106.field20 > 0) {
                    this.field202.method322(this.field106.field19, this.field106.field20, 0, 0);
                    this.field106.field20 = 0;
                    this.field260 = 0;
                }
            } catch (IOException var34) {
                this.method127(3);
            } catch (Exception var35) {
                this.method169(this.field62);
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method155(int arg0) {
        byte[] var2 = this.field487.method429("title.dat", (byte[]) null);
        class70 var3 = new class70(var2, this);
        this.field142.method545(16595);
        var3.method551(true, 0, 0);
        this.field143.method545(16595);
        var3.method551(true, 0, -637);
        this.field139.method545(16595);
        var3.method551(true, 0, -128);
        this.field140.method545(16595);
        var3.method551(true, -371, -202);
        this.field141.method545(16595);
        var3.method551(true, -171, -202);
        this.field144.method545(16595);
        var3.method551(true, -265, 0);
        this.field145.method545(16595);
        var3.method551(true, -265, -562);
        this.field146.method545(16595);
        if (arg0 != 0) {
            this.field106.method5(177);
        }
        var3.method551(true, -171, -128);
        this.field147.method545(16595);
        var3.method551(true, -171, -562);
        int[] var4 = new int[var3.field1694];
        for (int var5 = 0; var5 < var3.field1695; ++var5) {
            for (int var10 = 0; var10 < var3.field1694; ++var10) {
                var4[var10] = var3.field1693[var3.field1694 * var5 + (var3.field1694 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1694; ++var11) {
                var3.field1693[var3.field1694 * var5 + var11] = var4[var11];
            }
        }
        this.field142.method545(16595);
        var3.method551(true, 0, 382);
        this.field143.method545(16595);
        var3.method551(true, 0, -255);
        this.field139.method545(16595);
        var3.method551(true, 0, 254);
        this.field140.method545(16595);
        var3.method551(true, -371, 180);
        this.field141.method545(16595);
        var3.method551(true, -171, 180);
        this.field144.method545(16595);
        var3.method551(true, -265, 382);
        this.field145.method545(16595);
        var3.method551(true, -265, -180);
        this.field146.method545(16595);
        var3.method551(true, -171, 254);
        this.field147.method545(16595);
        var3.method551(true, -171, -180);
        class70 var6 = new class70(this.field487, "logo", 0);
        this.field139.method545(16595);
        var6.method553(382 - var6.field1694 / 2 - 128, 18, true);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ILBJPWOXRJ;I)V")
    private final void method156(int arg0, class3 arg1, int arg2) {
        int var4 = arg1.method26(false, 8);
        if (arg2 >= 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 < this.field384) {
            for (int var6 = var4; var6 < this.field384; ++var6) {
                this.field284[this.field283++] = this.field385[var6];
            }
        }
        if (var4 > this.field384) {
            signlink.reporterror(this.field205 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field384 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field385[var7];
                class48 var9 = this.field383[var8];
                int var10 = arg1.method26(false, 1);
                if (var10 == 0) {
                    this.field385[this.field384++] = var8;
                    var9.field1263 = field291;
                } else {
                    int var11 = arg1.method26(false, 2);
                    if (var11 == 0) {
                        this.field385[this.field384++] = var8;
                        var9.field1263 = field291;
                        this.field387[this.field386++] = var8;
                    } else if (var11 == 1) {
                        this.field385[this.field384++] = var8;
                        var9.field1263 = field291;
                        int var12 = arg1.method26(false, 3);
                        var9.method449(false, 6, var12);
                        int var13 = arg1.method26(false, 1);
                        if (var13 == 1) {
                            this.field387[this.field386++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field385[this.field384++] = var8;
                        var9.field1263 = field291;
                        int var14 = arg1.method26(false, 3);
                        var9.method449(true, 6, var14);
                        int var15 = arg1.method26(false, 3);
                        var9.method449(true, 6, var15);
                        int var16 = arg1.method26(false, 1);
                        if (var16 == 1) {
                            this.field387[this.field386++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field284[this.field283++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method157(boolean arg0) {
        int var2 = this.field411.method434(this.field99, "Choose Option");
        this.field473 &= arg0;
        for (int var3 = 0; var3 < this.field273; ++var3) {
            int var11 = this.field411.method434(this.field99, this.field262[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field273 * 15 + 21;
        if (super.field1569 > 4 && super.field1570 > 4 && super.field1569 < 516 && super.field1570 < 338) {
            int var5 = super.field1569 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1570 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field117 = true;
            this.field92 = 0;
            this.field93 = var5;
            this.field94 = var6;
            this.field95 = var2;
            this.field96 = this.field273 * 15 + 22;
        }
        if (super.field1569 > 553 && super.field1570 > 205 && super.field1569 < 743 && super.field1570 < 466) {
            int var7 = super.field1569 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1570 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field117 = true;
            this.field92 = 1;
            this.field93 = var7;
            this.field94 = var8;
            this.field95 = var2;
            this.field96 = this.field273 * 15 + 22;
        }
        if (super.field1569 > 17 && super.field1570 > 357 && super.field1569 < 496 && super.field1570 < 453) {
            int var9 = super.field1569 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1570 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field117 = true;
            this.field92 = 2;
            this.field93 = var9;
            this.field94 = var10;
            this.field95 = var2;
            this.field96 = this.field273 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)V")
    public final void method158(int arg0, byte arg1) {
        int[] var3 = this.field433.field1693;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field392[arg0][var25][var6] & 24) == 0) {
                    this.field253.method280(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (this.field392[arg0 + 1][var25][var6] & 8) != 0) {
                    this.field253.method280(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        ++field105;
        if (field105 > 1190) {
            field105 = 0;
            this.field106.method4(11, 0);
            this.field106.method5(0);
            int var7 = this.field106.field20;
            this.field106.method5((int) (Math.random() * 256.0D));
            this.field106.method6(31648);
            this.field106.method5(22);
            this.field106.method5((int) (Math.random() * 256.0D));
            this.field106.method6(23169);
            this.field106.method6(19661);
            this.field106.method6((int) (Math.random() * 65536.0D));
            this.field106.method6((int) (Math.random() * 65536.0D));
            this.field106.method5(16);
            this.field106.method5((int) (Math.random() * 256.0D));
            this.field106.method14(false, this.field106.field20 - var7);
        }
        int var8 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var9 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        if (arg1 != 3) {
            this.field171 = null;
        }
        this.field433.method548(16595);
        for (int var10 = 1; var10 < 103; ++var10) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field392[arg0][var23][var10] & 24) == 0) {
                    this.method86(arg0, var23, var8, var10, 0, var9);
                }
                if (arg0 < 3 && (this.field392[arg0 + 1][var23][var10] & 8) != 0) {
                    this.method86(arg0 + 1, var23, var8, var10, 0, var9);
                }
            }
        }
        this.field243.method545(16595);
        this.field445 = 0;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field253.method274(this.field128, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class32.method401(var14).field1110;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field46[this.field128].field863;
                            for (int var21 = 0; var21 < 10; ++var21) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var16 > 0 && var16 > var11 - 3 && (var20[var16 - 1][var17] & 2621704) == 0) {
                                    --var16;
                                }
                                if (var22 == 1 && var16 < var18 - 1 && var16 < var11 + 3 && (var20[var16 + 1][var17] & 2621824) == 0) {
                                    ++var16;
                                }
                                if (var22 == 2 && var17 > 0 && var17 > var12 - 3 && (var20[var16][var17 - 1] & 2621698) == 0) {
                                    --var17;
                                }
                                if (var22 == 3 && var17 < var19 - 1 && var17 < var12 + 3 && (var20[var16][var17 + 1] & 2621728) == 0) {
                                    ++var17;
                                }
                            }
                        }
                        this.field83[this.field445] = this.field460[var15];
                        this.field446[this.field445] = var16;
                        this.field447[this.field445] = var17;
                        ++this.field445;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(ILBJPWOXRJ;I)V")
    private final void method159(int arg0, class3 arg1, int arg2) {
        this.field283 = 0;
        this.field386 = 0;
        this.method117(arg2, arg1, 26447);
        this.method156(arg2, arg1, -153);
        this.method93(797, arg1, arg2);
        if (arg0 != 0) {
            this.field134 = 132;
        }
        this.method66(arg2, arg1, true);
        for (int var4 = 0; var4 < this.field283; ++var4) {
            int var6 = this.field284[var4];
            if (field291 != this.field383[var6].field1263) {
                this.field383[var6] = null;
            }
        }
        if (arg1.field20 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field20 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field384; ++var5) {
                if (this.field383[this.field385[var5]] == null) {
                    signlink.reporterror(this.field205 + " null entry in pl list - pos:" + var5 + " size:" + this.field384);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public static final void method160(int arg0) {
        if (arg0 != 5) {
            field158 = 421;
        }
        class17.field775 = false;
        class12.field683 = false;
        field396 = false;
        class54.field1525 = false;
        class32.field1115 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method161(byte arg0, int arg1, int arg2) {
        if (arg0 != -116) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
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

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method162(boolean arg0) {
        if (arg0) {
            this.field106.method5(79);
        }
        for (int var2 = -1; var2 < this.field384; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field382;
            } else {
                var3 = this.field385[var2];
            }
            class48 var4 = this.field383[var3];
            if (var4 != null) {
                this.method79(var4, (byte) 44, 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILYZDAHXEQ;I)V")
    public final void method163(int arg0, int arg1, class70 arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (arg0 == 16606) {
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field81 + this.field101 & 2047;
                int var7 = class26.field1011[var6];
                int var8 = class26.field1012[var6];
                int var9 = var7 * 256 / (this.field183 + 256);
                int var10 = var8 * 256 / (this.field183 + 256);
                int var11 = arg1 * var10 + arg3 * var9 >> 16;
                int var12 = arg3 * var10 - arg1 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field379.method558(15, var15 + 94 + 4 - 10, 15, 20, 256, 655, var13, 20, 83 - var16 - 20);
            } else {
                this.method65(-7004, arg1, arg3, arg2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILETSIPTYG;ZIIII)V")
    public final void method164(int arg0, class8 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            field405 = -165;
        }
        if (arg1.field568 == 0 && arg1.field600 != null && !arg1.field565) {
            if (arg0 >= arg5 && arg3 >= arg6 && arg0 <= arg1.field601 + arg5 && arg3 <= arg1.field557 + arg6) {
                int var8 = arg1.field600.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg1.field570[var9] + arg5;
                    int var11 = arg1.field562[var9] + arg6 - arg4;
                    class8 var12 = class8.field574[arg1.field600[var9]];
                    int var13 = var12.field575 + var10;
                    int var14 = var12.field579 + var11;
                    if ((var12.field596 >= 0 || var12.field586 != 0) && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field601 + var13 && arg3 < var12.field557 + var14) {
                        if (var12.field596 >= 0) {
                            this.field479 = var12.field596;
                        } else {
                            this.field479 = var12.field581;
                        }
                    }
                    if (var12.field568 == 0) {
                        this.method164(arg0, var12, true, arg3, var12.field599, var13, var14);
                        if (var12.field547 > var12.field557) {
                            this.method90(arg0, 891, arg3, true, var12.field557, var12.field601 + var13, var14, var12.field547, var12);
                        }
                    } else {
                        if (var12.field608 == 1 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field601 + var13 && arg3 < var12.field557 + var14) {
                            boolean var15 = false;
                            if (var12.field609 != 0) {
                                var15 = this.method153(var12, 1);
                            }
                            if (!var15) {
                                this.field262[this.field273] = var12.field604;
                                this.field502[this.field273] = 760;
                                this.field501[this.field273] = var12.field581;
                                ++this.field273;
                            }
                        }
                        if (var12.field608 == 2 && this.field175 == 0 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field601 + var13 && arg3 < var12.field557 + var14) {
                            String var16 = var12.field552;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field262[this.field273] = var16 + " @gre@" + var12.field602;
                            this.field502[this.field273] = 233;
                            this.field501[this.field273] = var12.field581;
                            ++this.field273;
                        }
                        if (var12.field608 == 3 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field601 + var13 && arg3 < var12.field557 + var14) {
                            this.field262[this.field273] = "Close";
                            this.field502[this.field273] = 214;
                            this.field501[this.field273] = var12.field581;
                            ++this.field273;
                        }
                        if (var12.field608 == 4 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field601 + var13 && arg3 < var12.field557 + var14) {
                            this.field262[this.field273] = var12.field604;
                            this.field502[this.field273] = 907;
                            this.field501[this.field273] = var12.field581;
                            ++this.field273;
                        }
                        if (var12.field608 == 5 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field601 + var13 && arg3 < var12.field557 + var14) {
                            this.field262[this.field273] = var12.field604;
                            this.field502[this.field273] = 707;
                            this.field501[this.field273] = var12.field581;
                            ++this.field273;
                        }
                        if (var12.field608 == 6 && !this.field76 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field601 + var13 && arg3 < var12.field557 + var14) {
                            this.field262[this.field273] = var12.field604;
                            this.field502[this.field273] = 83;
                            this.field501[this.field273] = var12.field581;
                            ++this.field273;
                        }
                        if (var12.field568 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field557; ++var18) {
                                for (int var19 = 0; var19 < var12.field601; ++var19) {
                                    int var20 = (var12.field593 + 32) * var19 + var13;
                                    int var21 = (var12.field613 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field573[var17];
                                        var21 += var12.field563[var17];
                                    }
                                    if (arg0 >= var20 && arg3 >= var21 && arg0 < var20 + 32 && arg3 < var21 + 32) {
                                        this.field463 = var17;
                                        this.field464 = var12.field581;
                                        if (var12.field582[var17] > 0) {
                                            class33 var22 = class33.method409(var12.field582[var17] - 1);
                                            if (this.field516 == 1 && var12.field588) {
                                                if (this.field518 != var12.field581 || this.field517 != var17) {
                                                    this.field262[this.field273] = "Use " + this.field520 + " with @lre@" + var22.field1156;
                                                    this.field502[this.field273] = 780;
                                                    this.field503[this.field273] = var22.field1149;
                                                    this.field500[this.field273] = var17;
                                                    this.field501[this.field273] = var12.field581;
                                                    ++this.field273;
                                                }
                                            } else if (this.field175 == 1 && var12.field588) {
                                                if ((this.field177 & 16) == 16) {
                                                    this.field262[this.field273] = this.field178 + " @lre@" + var22.field1156;
                                                    this.field502[this.field273] = 662;
                                                    this.field503[this.field273] = var22.field1149;
                                                    this.field500[this.field273] = var17;
                                                    this.field501[this.field273] = var12.field581;
                                                    ++this.field273;
                                                }
                                            } else {
                                                if (var12.field588) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1135 != null && var22.field1135[var23] != null) {
                                                            this.field262[this.field273] = var22.field1135[var23] + " @lre@" + var22.field1156;
                                                            if (var23 == 3) {
                                                                this.field502[this.field273] = 86;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field502[this.field273] = 275;
                                                            }
                                                            this.field503[this.field273] = var22.field1149;
                                                            this.field500[this.field273] = var17;
                                                            this.field501[this.field273] = var12.field581;
                                                            ++this.field273;
                                                        } else if (var23 == 4) {
                                                            this.field262[this.field273] = "Drop @lre@" + var22.field1156;
                                                            this.field502[this.field273] = 275;
                                                            this.field503[this.field273] = var22.field1149;
                                                            this.field500[this.field273] = var17;
                                                            this.field501[this.field273] = var12.field581;
                                                            ++this.field273;
                                                        }
                                                    }
                                                }
                                                if (var12.field553) {
                                                    this.field262[this.field273] = "Use @lre@" + var22.field1156;
                                                    this.field502[this.field273] = 606;
                                                    this.field503[this.field273] = var22.field1149;
                                                    this.field500[this.field273] = var17;
                                                    this.field501[this.field273] = var12.field581;
                                                    ++this.field273;
                                                }
                                                if (var12.field588 && var22.field1135 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1135[var24] != null) {
                                                            this.field262[this.field273] = var22.field1135[var24] + " @lre@" + var22.field1156;
                                                            if (var24 == 0) {
                                                                this.field502[this.field273] = 615;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field502[this.field273] = 998;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field502[this.field273] = 934;
                                                            }
                                                            this.field503[this.field273] = var22.field1149;
                                                            this.field500[this.field273] = var17;
                                                            this.field501[this.field273] = var12.field581;
                                                            ++this.field273;
                                                        }
                                                    }
                                                }
                                                if (var12.field555 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field555[var25] != null) {
                                                            this.field262[this.field273] = var12.field555[var25] + " @lre@" + var22.field1156;
                                                            if (var25 == 0) {
                                                                this.field502[this.field273] = 222;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field502[this.field273] = 472;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field502[this.field273] = 381;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field502[this.field273] = 628;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field502[this.field273] = 502;
                                                            }
                                                            this.field503[this.field273] = var22.field1149;
                                                            this.field500[this.field273] = var17;
                                                            this.field501[this.field273] = var12.field581;
                                                            ++this.field273;
                                                        }
                                                    }
                                                }
                                                this.field262[this.field273] = "Examine @lre@" + var22.field1156;
                                                this.field502[this.field273] = 1918;
                                                this.field503[this.field273] = var22.field1149;
                                                this.field500[this.field273] = var17;
                                                this.field501[this.field273] = var12.field581;
                                                ++this.field273;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(LETSIPTYG;I)Z")
    public final boolean method165(class8 arg0, int arg1) {
        if (arg0.field580 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field580.length; ++var3) {
                int var5 = this.method104(var3, 142, arg0);
                int var6 = arg0.field564[var3];
                if (arg0.field580[var3] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg0.field580[var3] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg0.field580[var3] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            int var4 = 20 / arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public final void method166(String arg0, int arg1, int arg2) {
        this.field153 = arg1;
        this.field417 = arg0;
        this.method101(this.field336);
        if (this.field487 == null) {
            super.method166(arg0, arg1, -799);
        } else {
            this.field141.method545(16595);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field411.method432(var4 / 2, var5 / 2 - 26 - var6, 190, "RuneScape is loading - please wait...", 16777215);
            int var7 = var5 / 2 - 18 - var6;
            class13.method229(var4 / 2 - 152, 34, 304, var7, (byte) 118, 9179409);
            class13.method229(var4 / 2 - 151, 32, 302, var7 + 1, (byte) 118, 0);
            class13.method228(var7 + 2, 30, arg1 * 3, var4 / 2 - 150, 9179409, true);
            class13.method228(var7 + 2, 30, 300 - arg1 * 3, arg1 * 3 + (var4 / 2 - 150), 0, true);
            this.field411.method432(var4 / 2, var5 / 2 + 5 - var6, 190, arg0, 16777215);
            this.field141.method546(super.field1554, 171, -52, 202);
            while (arg2 >= 0) {
                this.field60 = !this.field60;
            }
            if (this.field408) {
                this.field408 = false;
                if (!this.field120) {
                    this.field142.method546(super.field1554, 0, -52, 0);
                    this.field143.method546(super.field1554, 0, -52, 637);
                }
                this.field139.method546(super.field1554, 0, -52, 128);
                this.field140.method546(super.field1554, 371, -52, 202);
                this.field144.method546(super.field1554, 265, -52, 0);
                this.field145.method546(super.field1554, 265, -52, 562);
                this.field146.method546(super.field1554, 171, -52, 128);
                this.field147.method546(super.field1554, 171, -52, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LWHUVIHKW;I)V")
    private final void method167(class62 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field1616 == 0) {
            var3 = this.field253.method271(arg0.field1615, arg0.field1617, arg0.field1618);
        }
        if (arg0.field1616 == 1) {
            var3 = this.field253.method272(arg0.field1618, arg0.field1617, arg0.field1615, 0);
        }
        if (arg0.field1616 == 2) {
            var3 = this.field253.method273(arg0.field1615, arg0.field1617, arg0.field1618);
        }
        if (arg0.field1616 == 3) {
            var3 = this.field253.method274(arg0.field1615, arg0.field1617, arg0.field1618);
        }
        if (var3 != 0) {
            int var7 = this.field253.method275(arg0.field1615, arg0.field1617, arg0.field1618, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1624 = var4;
        if (arg1 < 7 || arg1 > 7) {
            this.field265 = !this.field265;
        }
        arg0.field1626 = var5;
        arg0.field1625 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILETSIPTYG;)Z")
    public final boolean method168(int arg0, class8 arg1) {
        this.field257 += arg0;
        int var3 = arg1.field609;
        if (this.field201 == 2) {
            if (var3 == 201) {
                this.field159 = true;
                this.field256 = false;
                this.field52 = true;
                this.field172 = "";
                this.field320 = 1;
                this.field489 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field159 = true;
                this.field256 = false;
                this.field52 = true;
                this.field172 = "";
                this.field320 = 2;
                this.field489 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field261 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field159 = true;
                this.field256 = false;
                this.field52 = true;
                this.field172 = "";
                this.field320 = 4;
                this.field489 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field159 = true;
                this.field256 = false;
                this.field52 = true;
                this.field172 = "";
                this.field320 = 5;
                this.field489 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field380[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class51.field1446 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class51.field1446) {
                                var6 = 0;
                            }
                        }
                        if (!class51.field1447[var6].field1453 && class51.field1447[var6].field1448 == var4 + (this.field506 ? 0 : 7)) {
                            this.field380[var4] = var6;
                            this.field301 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field451[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field132[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field132[var7].length) {
                        var9 = 0;
                    }
                }
                this.field451[var7] = var9;
                this.field301 = true;
            }
            if (var3 == 324 && !this.field506) {
                this.field506 = true;
                this.method69(1);
            }
            if (var3 == 325 && this.field506) {
                this.field506 = false;
                this.method69(1);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field368 = !this.field368;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method98(4);
                    if (this.field459.length() > 0) {
                        this.field106.method4(118, 0);
                        this.field106.method11(class44.method459(this.field459), 5);
                        this.field106.method5(var3 - 601);
                        this.field106.method5(this.field368 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field106.method4(90, 0);
                this.field106.method5(this.field506 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field106.method5(this.field380[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field106.method5(this.field451[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        try {
            if (this.field202 != null) {
                this.field202.method318();
            }
        } catch (Exception var3) {
        }
        this.field202 = null;
        this.field473 = false;
        this.field78 = 0;
        this.field205 = "";
        if (!arg0) {
            this.field192 = -225;
        }
        this.field206 = "";
        this.method147(0);
        this.field253.method245((byte) -22);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field46[var2].method299((byte) 71);
        }
        System.gc();
        this.method35(0);
        this.field404 = -1;
        this.field427 = -1;
        this.field116 = 0;
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (this.field244 == null) {
            this.method136(0);
            super.field1555 = null;
            this.field139 = null;
            this.field140 = null;
            this.field141 = null;
            this.field142 = null;
            this.field143 = null;
            this.field144 = null;
            this.field145 = null;
            this.field146 = null;
            this.field147 = null;
            this.field244 = new class68(479, (byte) -48, this.method143(true), 96);
            this.field242 = new class68(172, (byte) -48, this.method143(true), 156);
            class13.method226(false);
            this.field363.method518(0, 0, true);
            if (field111 != arg0) {
                field378 = !field378;
            }
            this.field241 = new class68(190, (byte) -48, this.method143(true), 261);
            this.field243 = new class68(512, (byte) -48, this.method143(true), 334);
            class13.method226(false);
            this.field375 = new class68(496, (byte) -48, this.method143(true), 50);
            this.field376 = new class68(269, (byte) -48, this.method143(true), 37);
            this.field377 = new class68(249, (byte) -48, this.method143(true), 45);
            this.field408 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILBJPWOXRJ;Z)V")
    private final void method171(int arg0, class3 arg1, boolean arg2) {
        if (arg2) {
            field289 = this.field87.method203();
        }
        this.field283 = 0;
        this.field386 = 0;
        this.method74(arg1, true, arg0);
        this.method137(arg0, (byte) -81, arg1);
        this.method134(arg1, this.field187, arg0);
        for (int var4 = 0; var4 < this.field283; ++var4) {
            int var6 = this.field284[var4];
            if (field291 != this.field149[var6].field1263) {
                this.field149[var6].field841 = null;
                this.field149[var6] = null;
            }
        }
        if (arg1.field20 != arg0) {
            signlink.reporterror(this.field205 + " size mismatch in getnpcpos - pos:" + arg1.field20 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field150; ++var5) {
                if (this.field149[this.field151[var5]] == null) {
                    signlink.reporterror(this.field205 + " null entry in npc list - pos:" + var5 + " size:" + this.field150);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method172(int arg0) {
        this.field257 += arg0;
        for (class16 var2 = (class16) this.field119.method471(); var2 != null; var2 = (class16) this.field119.method473((byte) 2)) {
            if (this.field128 == var2.field766 && field291 <= var2.field753) {
                if (field291 >= var2.field752) {
                    if (var2.field742 > 0) {
                        class18 var3 = this.field149[var2.field742 - 1];
                        if (var3 != null && var3.field1268 >= 0 && var3.field1268 < 13312 && var3.field1269 >= 0 && var3.field1269 < 13312) {
                            var2.method242(var3.field1268, this.method94(var3.field1268, 938, var3.field1269, var2.field766) - var2.field757, 464, field291, var3.field1269);
                        }
                    }
                    if (var2.field742 < 0) {
                        int var4 = -var2.field742 - 1;
                        class48 var5;
                        if (this.field54 == var4) {
                            var5 = field444;
                        } else {
                            var5 = this.field383[var4];
                        }
                        if (var5 != null && var5.field1268 >= 0 && var5.field1268 < 13312 && var5.field1269 >= 0 && var5.field1269 < 13312) {
                            var2.method242(var5.field1268, this.method94(var5.field1268, 938, var5.field1269, var2.field766) - var2.field757, 464, field291, var5.field1269);
                        }
                    }
                    var2.method243(28508, this.field56);
                    this.field253.method256(60, var2, this.field128, -1, (int) var2.field751, var2.field759, (int) var2.field749, (int) var2.field750, (byte) -51, false);
                }
            } else {
                var2.method430();
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method173(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field258 = this.field282.method15();
        }
        class8 var3 = class8.field574[arg0];
        for (int var4 = 0; var4 < var3.field600.length && var3.field600[var4] != -1; ++var4) {
            class8 var5 = class8.field574[var3.field600[var4]];
            if (var5.field568 == 1) {
                this.method173(var5.field581, 0);
            }
            var5.field567 = 0;
            var5.field561 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIIIIII)V")
    private final void method174(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field475 != arg0) {
            this.field337 = -80;
        }
        if (arg2 >= 1 && arg6 >= 1 && arg2 <= 102 && arg6 <= 102) {
            if (field396 && this.field128 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg5 == 0) {
                var9 = this.field253.method271(arg4, arg2, arg6);
            }
            if (arg5 == 1) {
                var9 = this.field253.method272(arg6, arg2, arg4, 0);
            }
            if (arg5 == 2) {
                var9 = this.field253.method273(arg4, arg2, arg6);
            }
            if (arg5 == 3) {
                var9 = this.field253.method274(arg4, arg2, arg6);
            }
            if (var9 != 0) {
                int var13 = this.field253.method275(arg4, arg2, arg6, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg5 == 0) {
                    this.field253.method262(-102, arg6, arg4, arg2);
                    class32 var17 = class32.method401(var14);
                    if (var17.field1107) {
                        this.field46[arg4].method304(arg2, var17.field1108, arg6, var16, var15, -30817);
                    }
                }
                if (arg5 == 1) {
                    this.field253.method263(arg4, arg6, (byte) 2, arg2);
                }
                if (arg5 == 2) {
                    this.field253.method264(arg6, arg4, arg2, 0);
                    class32 var18 = class32.method401(var14);
                    if (var18.field1086 + arg2 > 103 || var18.field1086 + arg6 > 103 || var18.field1116 + arg2 > 103 || var18.field1116 + arg6 > 103) {
                        return;
                    }
                    if (var18.field1107) {
                        this.field46[arg4].method305(arg2, 5, var18.field1116, var18.field1086, arg6, var16, var18.field1108);
                    }
                }
                if (arg5 == 3) {
                    this.field253.method265(arg4, arg2, 842, arg6);
                    class32 var19 = class32.method401(var14);
                    if (var19.field1107 && var19.field1096) {
                        this.field46[arg4].method307(arg2, true, arg6);
                    }
                }
            }
            if (arg7 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field392[1][arg2][arg6] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                class54.method505(arg1, arg2, arg3, this.field46[arg4], arg7, arg4, arg6, false, this.field73, this.field253, var20);
                return;
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field156[var1] = var0 - 1;
            var0 += var0;
        }
        field252 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field252[var3] = var2 / 4;
        }
        field289 = -832;
        field378 = true;
        field393 = 10;
        field395 = true;
        field458 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field508 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field510 = 6;
    }
}
