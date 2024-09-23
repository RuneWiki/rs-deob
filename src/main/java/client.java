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
public class client extends class23 {

    @OriginalMember(owner = "client", name = "K", descriptor = "[J")
    private long[] field69 = new long[100];

    @OriginalMember(owner = "client", name = "L", descriptor = "LILVDIPQT;")
    private class31 field70 = new class31(-33684);

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field71 = -1;

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    private int[] field72 = new int[5];

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field73 = 128;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field77 = -31276;

    @OriginalMember(owner = "client", name = "U", descriptor = "B")
    private byte field79 = 1;

    @OriginalMember(owner = "client", name = "X", descriptor = "[I")
    private int[] field82 = new int[class56.field1520];

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field85 = -1;

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field88 = new int[5];

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private final int field89 = 100;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field90 = new int[100];

    @OriginalMember(owner = "client", name = "gb", descriptor = "Z")
    private boolean field91 = false;

    @OriginalMember(owner = "client", name = "hb", descriptor = "[LVDSDFSIV;")
    private class57[] field92 = new class57[1000];

    @OriginalMember(owner = "client", name = "ib", descriptor = "Ljava/lang/String;")
    private String field93 = "";

    @OriginalMember(owner = "client", name = "jb", descriptor = "Ljava/lang/String;")
    private String field94 = "";

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field95 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "nb", descriptor = "B")
    private byte field98 = 8;

    @OriginalMember(owner = "client", name = "wb", descriptor = "[LDNACUOZQ;")
    private class10[] field107 = new class10[2];

    @OriginalMember(owner = "client", name = "yb", descriptor = "Z")
    private boolean field109 = false;

    @OriginalMember(owner = "client", name = "zb", descriptor = "[LVDSDFSIV;")
    private class57[] field110 = new class57[20];

    @OriginalMember(owner = "client", name = "Bb", descriptor = "Z")
    private boolean field112 = false;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "[I")
    private int[] field116 = new int[200];

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field119 = -31729;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Ljava/lang/String;")
    private String field121 = "";

    @OriginalMember(owner = "client", name = "Lb", descriptor = "Z")
    private volatile boolean field122 = false;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field125 = 653;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Z")
    private boolean field127 = false;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Z")
    private boolean field133 = false;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Z")
    private boolean field135 = false;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[I")
    private int[] field136 = new int[4000];

    @OriginalMember(owner = "client", name = "ac", descriptor = "[I")
    private int[] field137 = new int[4000];

    @OriginalMember(owner = "client", name = "cc", descriptor = "[LDNACUOZQ;")
    private class10[] field139 = new class10[13];

    @OriginalMember(owner = "client", name = "kc", descriptor = "B")
    private byte field147 = -93;

    @OriginalMember(owner = "client", name = "lc", descriptor = "LXOUQUKZW;")
    private class62 field148 = class62.method509(92, 1);

    @OriginalMember(owner = "client", name = "mc", descriptor = "[Ljava/lang/String;")
    private String[] field149 = new String[500];

    @OriginalMember(owner = "client", name = "pc", descriptor = "Z")
    private volatile boolean field152 = false;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field153 = -535;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Ljava/lang/String;")
    private String field154 = "";

    @OriginalMember(owner = "client", name = "tc", descriptor = "B")
    private byte field156 = 71;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field158 = -1;

    @OriginalMember(owner = "client", name = "wc", descriptor = "LXOUQUKZW;")
    private class62 field159 = class62.method509(92, 1);

    @OriginalMember(owner = "client", name = "xc", descriptor = "Z")
    private boolean field160 = false;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "Z")
    private boolean field167 = true;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Z")
    private boolean field168 = false;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    private int[] field170 = new int[1000];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[I")
    private int[] field171 = new int[1000];

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Z")
    private boolean field172 = false;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Z")
    public boolean field178 = true;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Z")
    public boolean field179 = false;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[I")
    private int[] field181 = new int[7];

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Z")
    private boolean field183 = false;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[I")
    private int[] field184 = new int[50];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Z")
    private boolean field185 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Z")
    private boolean field186 = true;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Z")
    private boolean field202 = true;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field204 = 1;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field205 = 4;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[[I")
    private int[][] field215 = new int[104][104];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "[I")
    private int[] field221 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[I")
    private int[] field222 = new int[50];

    @OriginalMember(owner = "client", name = "Jd", descriptor = "LXOUQUKZW;")
    private class62 field224 = new class62(-417, new byte[5000]);

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[LAVKLDTFF;")
    private class3[] field225 = new class3[16384];

    @OriginalMember(owner = "client", name = "Md", descriptor = "[I")
    public int[] field227 = new int[16384];

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Z")
    private boolean field228 = false;

    @OriginalMember(owner = "client", name = "Od", descriptor = "B")
    private byte field229 = 85;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[LYAQQZUCW;")
    public class66[] field230 = new class66[5];

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field237 = 1;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Z")
    private boolean field247 = false;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field248 = 2048;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field249 = 2047;

    @OriginalMember(owner = "client", name = "je", descriptor = "[LLAKHMHBY;")
    private class38[] field250 = new class38[this.field248];

    @OriginalMember(owner = "client", name = "le", descriptor = "[I")
    public int[] field252 = new int[this.field248];

    @OriginalMember(owner = "client", name = "ne", descriptor = "[I")
    private int[] field254 = new int[this.field248];

    @OriginalMember(owner = "client", name = "oe", descriptor = "[LXOUQUKZW;")
    private class62[] field255 = new class62[this.field248];

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    public int[] field257 = new int[1000];

    @OriginalMember(owner = "client", name = "te", descriptor = "[Ljava/lang/String;")
    private String[] field260 = new String[200];

    @OriginalMember(owner = "client", name = "ue", descriptor = "Z")
    private boolean field261 = true;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Z")
    private boolean field262 = false;

    @OriginalMember(owner = "client", name = "xe", descriptor = "Z")
    private boolean field264 = false;

    @OriginalMember(owner = "client", name = "ye", descriptor = "[[I")
    private int[][] field265 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Z")
    private volatile boolean field269 = false;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[[[LILVDIPQT;")
    private class31[][][] field272 = new class31[4][104][104];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[I")
    private int[] field275 = new int[50];

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field276 = -1;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[I")
    private int[] field277 = new int[256];

    @OriginalMember(owner = "client", name = "Le", descriptor = "[I")
    private int[] field278 = new int[class56.field1520];

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field279 = 20747;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field284 = -31276;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "LILVDIPQT;")
    private class31 field288 = new class31(-33684);

    @OriginalMember(owner = "client", name = "ef", descriptor = "[I")
    private int[] field297 = new int[33];

    @OriginalMember(owner = "client", name = "ff", descriptor = "B")
    private byte field298 = 1;

    @OriginalMember(owner = "client", name = "gf", descriptor = "[I")
    private int[] field299 = new int[5];

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field300 = 78;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Ljava/lang/String;")
    private String field301 = "";

    @OriginalMember(owner = "client", name = "qf", descriptor = "[[[I")
    private int[][][] field308 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field313 = 1;

    @OriginalMember(owner = "client", name = "wf", descriptor = "[[I")
    private int[][] field314 = new int[104][104];

    @OriginalMember(owner = "client", name = "xf", descriptor = "B")
    private byte field315 = 8;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field317 = 3353893;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field319 = new int[9];

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    private int[] field327 = new int[33];

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Z")
    private boolean field330 = false;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field332 = 50;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "[I")
    private int[] field333 = new int[this.field332];

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[I")
    private int[] field334 = new int[this.field332];

    @OriginalMember(owner = "client", name = "Rf", descriptor = "[I")
    private int[] field335 = new int[this.field332];

    @OriginalMember(owner = "client", name = "Sf", descriptor = "[I")
    private int[] field336 = new int[this.field332];

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[I")
    private int[] field337 = new int[this.field332];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[I")
    private int[] field338 = new int[this.field332];

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[I")
    private int[] field339 = new int[this.field332];

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[Ljava/lang/String;")
    private String[] field340 = new String[this.field332];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field341 = -1;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field342 = 790;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private final int[] field343 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "ag", descriptor = "LILVDIPQT;")
    private class31 field344 = new class31(-33684);

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    private int[] field346 = new int[151];

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field350 = -8300;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field351 = 7759444;

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    private int[] field354 = new int[class56.field1520];

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private int[] field355 = new int[5];

    @OriginalMember(owner = "client", name = "mg", descriptor = "Z")
    private boolean field356 = false;

    @OriginalMember(owner = "client", name = "ng", descriptor = "[LVDSDFSIV;")
    private class57[] field357 = new class57[100];

    @OriginalMember(owner = "client", name = "pg", descriptor = "Z")
    private boolean field359 = true;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field360 = -40275;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field370 = 2301979;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Z")
    private boolean field371 = false;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[LYMCKWFGH;")
    private class68[] field372 = new class68[4];

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field373 = -1;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "LXOUQUKZW;")
    private class62 field374 = class62.method509(92, 1);

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field376 = 558;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field377 = -1;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[J")
    private long[] field378 = new long[200];

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field380 = 3;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "[Ljava/lang/String;")
    private String[] field387 = new String[5];

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[Z")
    private boolean[] field388 = new boolean[5];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[I")
    public int[] field389 = new int[2000];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field394 = -1;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Z")
    private boolean field395 = false;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field396 = 717;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field398 = 8;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field399 = 5063219;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Ljava/lang/String;")
    private String field400 = "";

    @OriginalMember(owner = "client", name = "fh", descriptor = "Ljava/lang/String;")
    private String field401 = "";

    @OriginalMember(owner = "client", name = "gh", descriptor = "B")
    private byte field402 = 9;

    @OriginalMember(owner = "client", name = "ih", descriptor = "[I")
    private int[] field404 = new int[5];

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field411 = 50;

    @OriginalMember(owner = "client", name = "rh", descriptor = "[I")
    private int[] field413 = new int[100];

    @OriginalMember(owner = "client", name = "sh", descriptor = "[Ljava/lang/String;")
    private String[] field414 = new String[100];

    @OriginalMember(owner = "client", name = "th", descriptor = "[Ljava/lang/String;")
    private String[] field415 = new String[100];

    @OriginalMember(owner = "client", name = "uh", descriptor = "B")
    private byte field416 = 2;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field417 = 228;

    @OriginalMember(owner = "client", name = "wh", descriptor = "[LDNACUOZQ;")
    private class10[] field418 = new class10[100];

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field419 = 20236;

    @OriginalMember(owner = "client", name = "yh", descriptor = "Z")
    private boolean field420 = false;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "Z")
    private boolean field423 = false;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[B")
    private byte[] field425 = new byte[16384];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field429 = 2;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field430 = -1;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field431 = -1;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[Z")
    private boolean[] field432 = new boolean[5];

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field437 = -1;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field443 = 1;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Z")
    private boolean field444 = false;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field446 = -1;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Z")
    private boolean field448 = true;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field450 = -1;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field451 = 416;

    @OriginalMember(owner = "client", name = "hi", descriptor = "Z")
    private boolean field455 = false;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Z")
    private boolean field457 = true;

    @OriginalMember(owner = "client", name = "li", descriptor = "Ljava/lang/String;")
    private String field459 = "";

    @OriginalMember(owner = "client", name = "si", descriptor = "LPFVGIFDY;")
    private class48 field466 = new class48();

    @OriginalMember(owner = "client", name = "wi", descriptor = "[LVDSDFSIV;")
    private class57[] field470 = new class57[8];

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Ljava/lang/String;")
    private String field486 = "";

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Z")
    private boolean field493 = false;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field494 = 46524;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field496 = 2;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "Z")
    private boolean field497 = true;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[LVDSDFSIV;")
    private class57[] field499 = new class57[20];

    @OriginalMember(owner = "client", name = "aj", descriptor = "B")
    private byte field500 = -111;

    @OriginalMember(owner = "client", name = "hj", descriptor = "[I")
    private int[] field507 = new int[500];

    @OriginalMember(owner = "client", name = "ij", descriptor = "[I")
    private int[] field508 = new int[500];

    @OriginalMember(owner = "client", name = "jj", descriptor = "[I")
    private int[] field509 = new int[500];

    @OriginalMember(owner = "client", name = "kj", descriptor = "[I")
    private int[] field510 = new int[500];

    @OriginalMember(owner = "client", name = "oj", descriptor = "[I")
    private int[] field514 = new int[2000];

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field515 = -1;

    @OriginalMember(owner = "client", name = "rj", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field517 = new CRC32();

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    private int[] field519 = new int[151];

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field524 = 2;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field541 = 2;

    @OriginalMember(owner = "client", name = "Y", descriptor = "[[I")
    public static final int[][] field83 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "bb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field86 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private static int field97 = 7;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[I")
    private static int[] field134 = new int[99];

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private static int field151;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private static int field188;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Z")
    private static boolean field190;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field238;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    public static final int[] field240;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[I")
    public static int[] field433;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Ljava/lang/String;")
    private static String field495;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "B")
    private static byte field498;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private static int field120;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private static int field124;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private static int field138;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private static int field155;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private static int field157;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private static int field177;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private static int field258;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private static int field324;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private static int field328;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private static int field421;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private static int field449;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private static int field465;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private static int field472;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private static int field502;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private static int field516;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private static int field84;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "J")
    private long field386;

    @OriginalMember(owner = "client", name = "xi", descriptor = "J")
    private long field471;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "J")
    public long field529;

    @OriginalMember(owner = "client", name = "T", descriptor = "J")
    private long field78;

    @OriginalMember(owner = "client", name = "V", descriptor = "J")
    private long field80;

    @OriginalMember(owner = "client", name = "Db", descriptor = "LDNACUOZQ;")
    private class10 field114;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "LDNACUOZQ;")
    private class10 field115;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LDNACUOZQ;")
    private class10 field161;

    @OriginalMember(owner = "client", name = "zc", descriptor = "LDNACUOZQ;")
    private class10 field162;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "LDNACUOZQ;")
    private class10 field163;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "LDNACUOZQ;")
    private class10 field164;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LDNACUOZQ;")
    private class10 field165;

    @OriginalMember(owner = "client", name = "Se", descriptor = "LDNACUOZQ;")
    private class10 field285;

    @OriginalMember(owner = "client", name = "Te", descriptor = "LDNACUOZQ;")
    private class10 field286;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "LDNACUOZQ;")
    private class10 field287;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "LDNACUOZQ;")
    private class10 field434;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "LDNACUOZQ;")
    private class10 field435;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "LDNACUOZQ;")
    private class10 field438;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "LDNACUOZQ;")
    private class10 field439;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "LDNACUOZQ;")
    private class10 field440;

    @OriginalMember(owner = "client", name = "Th", descriptor = "LDNACUOZQ;")
    private class10 field441;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "LDNACUOZQ;")
    private class10 field442;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "LDNACUOZQ;")
    private class10 field482;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "LDNACUOZQ;")
    private class10 field483;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "LDNACUOZQ;")
    private class10 field484;

    @OriginalMember(owner = "client", name = "rf", descriptor = "LABEJMBLI;")
    private class1 field309;

    @OriginalMember(owner = "client", name = "bh", descriptor = "LGLVCMXFQ;")
    private class22 field397;

    @OriginalMember(owner = "client", name = "ub", descriptor = "LLAFREBFM;")
    private class37 field105;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "LLAKHMHBY;")
    public static class38 field113;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "LNIZPXICY;")
    public class40 field325;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "LBFOGRMWS;")
    private class4 field292;

    @OriginalMember(owner = "client", name = "af", descriptor = "LBFOGRMWS;")
    private class4 field293;

    @OriginalMember(owner = "client", name = "bf", descriptor = "LBFOGRMWS;")
    private class4 field294;

    @OriginalMember(owner = "client", name = "cf", descriptor = "LBFOGRMWS;")
    private class4 field295;

    @OriginalMember(owner = "client", name = "se", descriptor = "LTXSWXFHQ;")
    private class55 field259;

    @OriginalMember(owner = "client", name = "fc", descriptor = "LVDSDFSIV;")
    private class57 field142;

    @OriginalMember(owner = "client", name = "gc", descriptor = "LVDSDFSIV;")
    private class57 field143;

    @OriginalMember(owner = "client", name = "bg", descriptor = "LVDSDFSIV;")
    private class57 field345;

    @OriginalMember(owner = "client", name = "dg", descriptor = "LVDSDFSIV;")
    private class57 field347;

    @OriginalMember(owner = "client", name = "eg", descriptor = "LVDSDFSIV;")
    private class57 field348;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "LVDSDFSIV;")
    private class57 field381;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "LVDSDFSIV;")
    private class57 field382;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "LVDSDFSIV;")
    private class57 field383;

    @OriginalMember(owner = "client", name = "Og", descriptor = "LVDSDFSIV;")
    private class57 field384;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "LVDSDFSIV;")
    private class57 field385;

    @OriginalMember(owner = "client", name = "vi", descriptor = "LVDSDFSIV;")
    private class57 field469;

    @OriginalMember(owner = "client", name = "zi", descriptor = "LVDSDFSIV;")
    private class57 field473;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "LVDSDFSIV;")
    private class57 field474;

    @OriginalMember(owner = "client", name = "cb", descriptor = "LVDSDFSIV;")
    private class57 field87;

    @OriginalMember(owner = "client", name = "rd", descriptor = "LCMDDPBTD;")
    private class6 field206;

    @OriginalMember(owner = "client", name = "sd", descriptor = "LCMDDPBTD;")
    private class6 field207;

    @OriginalMember(owner = "client", name = "td", descriptor = "LCMDDPBTD;")
    private class6 field208;

    @OriginalMember(owner = "client", name = "ud", descriptor = "LCMDDPBTD;")
    private class6 field209;

    @OriginalMember(owner = "client", name = "vd", descriptor = "LCMDDPBTD;")
    private class6 field210;

    @OriginalMember(owner = "client", name = "wd", descriptor = "LCMDDPBTD;")
    private class6 field211;

    @OriginalMember(owner = "client", name = "xd", descriptor = "LCMDDPBTD;")
    private class6 field212;

    @OriginalMember(owner = "client", name = "yd", descriptor = "LCMDDPBTD;")
    private class6 field213;

    @OriginalMember(owner = "client", name = "zd", descriptor = "LCMDDPBTD;")
    private class6 field214;

    @OriginalMember(owner = "client", name = "ce", descriptor = "LCMDDPBTD;")
    private class6 field243;

    @OriginalMember(owner = "client", name = "de", descriptor = "LCMDDPBTD;")
    private class6 field244;

    @OriginalMember(owner = "client", name = "ee", descriptor = "LCMDDPBTD;")
    private class6 field245;

    @OriginalMember(owner = "client", name = "fe", descriptor = "LCMDDPBTD;")
    private class6 field246;

    @OriginalMember(owner = "client", name = "rg", descriptor = "LCMDDPBTD;")
    private class6 field361;

    @OriginalMember(owner = "client", name = "sg", descriptor = "LCMDDPBTD;")
    private class6 field362;

    @OriginalMember(owner = "client", name = "tg", descriptor = "LCMDDPBTD;")
    private class6 field363;

    @OriginalMember(owner = "client", name = "ug", descriptor = "LCMDDPBTD;")
    private class6 field364;

    @OriginalMember(owner = "client", name = "vg", descriptor = "LCMDDPBTD;")
    private class6 field365;

    @OriginalMember(owner = "client", name = "wg", descriptor = "LCMDDPBTD;")
    private class6 field366;

    @OriginalMember(owner = "client", name = "xg", descriptor = "LCMDDPBTD;")
    private class6 field367;

    @OriginalMember(owner = "client", name = "yg", descriptor = "LCMDDPBTD;")
    private class6 field368;

    @OriginalMember(owner = "client", name = "zg", descriptor = "LCMDDPBTD;")
    private class6 field369;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "LCMDDPBTD;")
    private class6 field479;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "LCMDDPBTD;")
    private class6 field480;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "LCMDDPBTD;")
    private class6 field481;

    @OriginalMember(owner = "client", name = "kf", descriptor = "LCVNWKEAW;")
    private class7 field302;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Ljava/lang/String;")
    private String field166;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Ljava/lang/String;")
    public String field307;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Ljava/lang/String;")
    public String field393;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "Ljava/lang/String;")
    private String field476;

    @OriginalMember(owner = "client", name = "ig", descriptor = "Ljava/net/Socket;")
    private Socket field352;

    @OriginalMember(owner = "client", name = "xb", descriptor = "Z")
    private static boolean field108;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Z")
    public static boolean field174;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Z")
    private static boolean field182;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    private static boolean field191;

    @OriginalMember(owner = "client", name = "be", descriptor = "Z")
    public static boolean field242;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[I")
    private int[] field130;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[I")
    private int[] field131;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field132;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[I")
    private int[] field267;

    @OriginalMember(owner = "client", name = "Be", descriptor = "[I")
    private int[] field268;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "[I")
    private int[] field280;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "[I")
    private int[] field281;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[I")
    private int[] field282;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    private int[] field283;

    @OriginalMember(owner = "client", name = "lj", descriptor = "[I")
    private int[] field511;

    @OriginalMember(owner = "client", name = "mj", descriptor = "[I")
    private int[] field512;

    @OriginalMember(owner = "client", name = "nj", descriptor = "[I")
    private int[] field513;

    @OriginalMember(owner = "client", name = "uj", descriptor = "[I")
    private int[] field520;

    @OriginalMember(owner = "client", name = "vj", descriptor = "[I")
    private int[] field521;

    @OriginalMember(owner = "client", name = "W", descriptor = "[LDNACUOZQ;")
    private class10[] field81;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[[B")
    private byte[][] field424;

    @OriginalMember(owner = "client", name = "zj", descriptor = "[[B")
    private byte[][] field525;

    @OriginalMember(owner = "client", name = "gj", descriptor = "[[[B")
    private byte[][][] field506;

    @OriginalMember(owner = "client", name = "og", descriptor = "[[[I")
    private int[][][] field358;

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method34(boolean arg0) {
        this.field434 = new class10(this.field302, "titlebox", 0);
        this.field179 &= arg0;
        this.field435 = new class10(this.field302, "titlebutton", 0);
        this.field81 = new class10[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field81[var3] = new class10(this.field302, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field81[var4] = new class10(this.field302, "runes", (var4 & 3) + 12);
            }
        }
        this.field473 = new class57(128, 265);
        this.field474 = new class57(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field473.field1528[var5] = this.field209.field546[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field474.field1528[var6] = this.field210.field546[var6];
        }
        this.field281 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field281[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field281[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field281[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field281[var10 + 192] = 16777215;
        }
        this.field282 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field282[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field282[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field282[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field282[var14 + 192] = 16777215;
        }
        this.field283 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field283[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field283[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field283[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field283[var18 + 192] = 16777215;
        }
        this.field280 = new int[256];
        this.field267 = new int[32768];
        this.field268 = new int[32768];
        this.method113((class10) null, true);
        this.field520 = new int[32768];
        this.field521 = new int[32768];
        this.method110("Connecting to fileserver", 10, (byte) -27);
        if (!this.field152) {
            this.field269 = true;
            this.field152 = true;
            this.method93(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method35(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field520[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field520[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field521[var14] = (this.field520[var14 - 1] + this.field520[var14 + 1] + this.field520[var14 - 128] + this.field520[var14 + 128]) / 4;
            }
        }
        this.field503 += 128;
        if (arg0 >= 0) {
            this.field272 = null;
        }
        if (this.field503 > this.field267.length) {
            this.field503 -= this.field267.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method113(this.field81[var6], true);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field521[var11 + 128] - this.field267[this.field503 + var11 & this.field267.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field520[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field277[var8] = this.field277[var8 + 1];
        }
        this.field277[var2 - 1] = (int) (Math.sin((double) field487 / 14.0D) * 16.0D + Math.sin((double) field487 / 15.0D) * 14.0D + Math.sin((double) field487 / 16.0D) * 12.0D);
        if (this.field504 > 0) {
            this.field504 -= 4;
        }
        if (this.field505 > 0) {
            this.field505 -= 4;
        }
        if (this.field504 == 0 && this.field505 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field504 = 1024;
            }
            if (var9 == 1) {
                this.field505 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method36(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field309 != null) {
                this.field309.method1();
            }
        } catch (Exception var2) {
        }
        this.field309 = null;
        this.method64((byte) 7);
        if (this.field325 != null) {
            this.field325.field1133 = false;
        }
        this.field325 = null;
        this.field259.method482();
        this.field259 = null;
        this.field224 = null;
        this.field159 = null;
        this.field148 = null;
        this.field374 = null;
        this.field130 = null;
        this.field525 = null;
        this.field424 = null;
        this.field131 = null;
        this.field132 = null;
        this.field358 = null;
        this.field506 = null;
        this.field530 += arg0;
        this.field397 = null;
        this.field372 = null;
        this.field265 = null;
        this.field215 = null;
        this.field136 = null;
        this.field137 = null;
        this.field425 = null;
        this.field243 = null;
        this.field244 = null;
        this.field245 = null;
        this.field246 = null;
        this.field479 = null;
        this.field480 = null;
        this.field481 = null;
        this.field361 = null;
        this.field362 = null;
        this.field363 = null;
        this.field364 = null;
        this.field365 = null;
        this.field366 = null;
        this.field367 = null;
        this.field368 = null;
        this.field369 = null;
        this.field285 = null;
        this.field286 = null;
        this.field287 = null;
        this.field482 = null;
        this.field483 = null;
        this.field484 = null;
        this.field139 = null;
        this.field161 = null;
        this.field162 = null;
        this.field163 = null;
        this.field164 = null;
        this.field165 = null;
        this.field438 = null;
        this.field439 = null;
        this.field440 = null;
        this.field441 = null;
        this.field442 = null;
        this.field345 = null;
        this.field110 = null;
        this.field499 = null;
        this.field470 = null;
        this.field381 = null;
        this.field382 = null;
        this.field383 = null;
        this.field384 = null;
        this.field385 = null;
        this.field418 = null;
        this.field357 = null;
        this.field314 = null;
        this.field250 = null;
        this.field252 = null;
        this.field254 = null;
        this.field255 = null;
        this.field257 = null;
        this.field225 = null;
        this.field227 = null;
        this.field272 = null;
        this.field344 = null;
        this.field70 = null;
        this.field288 = null;
        this.field507 = null;
        this.field508 = null;
        this.field509 = null;
        this.field510 = null;
        this.field149 = null;
        this.field389 = null;
        this.field170 = null;
        this.field171 = null;
        this.field92 = null;
        this.field469 = null;
        this.field260 = null;
        this.field378 = null;
        this.field116 = null;
        this.field209 = null;
        this.field210 = null;
        this.field206 = null;
        this.field207 = null;
        this.field208 = null;
        this.field211 = null;
        this.field212 = null;
        this.field213 = null;
        this.field214 = null;
        this.method69(5);
        class53.method468(this.field204);
        class26.method310(this.field204);
        class24.method296(this.field204);
        class13.field641 = null;
        class43.field1177 = null;
        class48.field1246 = null;
        class17.field666 = null;
        class42.field1158 = null;
        class21.field703 = null;
        class21.field715 = null;
        class41.field1141 = null;
        super.field805 = null;
        class38.field1096 = null;
        class47.method431(this.field204);
        class22.method232(this.field204);
        class35.method375(this.field204);
        class71.method583(this.field204);
        System.gc();
        if (class54.field1472) {
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)Z")
    public final boolean method37(int arg0) {
        if (arg0 >= 0) {
            this.field272 = null;
        }
        if (this.field309 == null) {
            return false;
        } else {
            try {
                int var2 = this.field309.method3();
                if (var2 == 0) {
                    return false;
                }
                if (this.field531 == -1) {
                    this.field309.method4(this.field374.field1578, 0, 1);
                    this.field531 = this.field374.field1578[0] & 255;
                    if (this.field105 != null) {
                        this.field531 = this.field531 - this.field105.method405() & 255;
                    }
                    this.field530 = class69.field1646[this.field531];
                    --var2;
                }
                if (this.field530 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field309.method4(this.field374.field1578, 0, 1);
                    this.field530 = this.field374.field1578[0] & 255;
                    --var2;
                }
                if (this.field530 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field309.method4(this.field374.field1578, 0, 2);
                    this.field374.field1579 = 0;
                    this.field530 = this.field374.method523();
                    var2 -= 2;
                }
                if (var2 < this.field530) {
                    return false;
                }
                this.field374.field1579 = 0;
                this.field309.method4(this.field374.field1578, 0, this.field530);
                this.field532 = 0;
                this.field528 = this.field527;
                this.field527 = this.field526;
                this.field526 = this.field531;
                if (this.field531 == 47) {
                    int var3 = this.field374.method551((byte) 7);
                    int var4 = this.field374.method524();
                    int var5 = this.field374.method523();
                    class48 var6 = class48.field1246[var5];
                    var6.field1265 = var4;
                    var6.field1244 = var3;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 177) {
                    this.field444 = true;
                    this.field405 = this.field374.method521();
                    this.field406 = this.field374.method521();
                    this.field407 = this.field374.method523();
                    this.field408 = this.field374.method521();
                    this.field409 = this.field374.method521();
                    if (this.field409 >= 100) {
                        this.field488 = this.field405 * 128 + 64;
                        this.field490 = this.field406 * 128 + 64;
                        this.field489 = this.method119(this.field123, this.field490, this.field488, 4) - this.field407;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 53) {
                    int var7 = this.field374.method523();
                    this.method87(var7, (byte) 53);
                    if (this.field437 != -1) {
                        this.field437 = -1;
                        this.field493 = true;
                        this.field168 = true;
                    }
                    if (this.field341 != -1) {
                        this.field341 = -1;
                        this.field228 = true;
                    }
                    if (this.field144 != 0) {
                        this.field144 = 0;
                        this.field228 = true;
                    }
                    this.field450 = var7;
                    this.field91 = false;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 134) {
                    this.field493 = true;
                    int var8 = this.field374.method523();
                    class48 var9 = class48.field1246[var8];
                    while (this.field374.field1579 < this.field530) {
                        int var10 = this.field374.method535();
                        int var11 = this.field374.method523();
                        int var12 = this.field374.method521();
                        if (var12 == 255) {
                            var12 = this.field374.method526();
                        }
                        if (var10 >= 0 && var10 < var9.field1272.length) {
                            var9.field1272[var10] = var11;
                            var9.field1268[var10] = var12;
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 15) {
                    int var13 = this.field374.method524();
                    int var14 = this.field374.method548(false);
                    class48 var15 = class48.field1246[var14];
                    var15.field1297 = var13;
                    if (var13 == -1) {
                        var15.field1294 = 0;
                        var15.field1240 = 0;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 239) {
                    int var16 = this.field374.method548(false);
                    int var17 = this.field374.method549(0);
                    class48.field1246[var16].field1252 = 2;
                    class48.field1246[var16].field1253 = var17;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 82) {
                    int var18 = this.field374.method552((byte) 54);
                    this.field373 = var18;
                    this.field228 = true;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 132) {
                    if (this.field380 == 12) {
                        this.field493 = true;
                    }
                    this.field326 = this.field374.method524();
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 244) {
                    this.field203 = this.field374.method521();
                    this.field475 = this.field374.method521();
                    this.field187 = this.field374.method521();
                    this.field420 = true;
                    this.field228 = true;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 136) {
                    this.field493 = true;
                    int var19 = this.field374.method521();
                    int var20 = this.field374.method521();
                    int var21 = this.field374.method526();
                    this.field354[var19] = var21;
                    this.field82[var19] = var20;
                    this.field278[var19] = 1;
                    for (int var22 = 0; var22 < 98; ++var22) {
                        if (var21 >= field134[var22]) {
                            this.field278[var19] = var22 + 2;
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 17) {
                    int var23 = this.field374.method550(-397);
                    byte var24 = this.field374.method542(0);
                    this.field514[var23] = var24;
                    if (this.field389[var23] != var24) {
                        this.field389[var23] = var24;
                        this.method165(-8300, var23);
                        this.field493 = true;
                        if (this.field373 != -1) {
                            this.field228 = true;
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 76) {
                    this.field241 = this.field530 / 8;
                    for (int var25 = 0; var25 < this.field241; ++var25) {
                        this.field69[var25] = this.field374.method527(-651);
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 233) {
                    this.field172 = false;
                    this.field144 = 2;
                    this.field121 = "";
                    this.field228 = true;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 237) {
                    this.field535 = this.field374.method548(false) * 30;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 25) {
                    this.field85 = this.field374.method549(0);
                    this.field426 = this.field374.method541((byte) 13);
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 77) {
                    int var26 = this.field374.method523();
                    this.method87(var26, (byte) 53);
                    if (this.field341 != -1) {
                        this.field341 = -1;
                        this.field228 = true;
                    }
                    if (this.field144 != 0) {
                        this.field144 = 0;
                        this.field228 = true;
                    }
                    this.field437 = var26;
                    this.field493 = true;
                    this.field168 = true;
                    this.field450 = -1;
                    this.field91 = false;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 94) {
                    int var27 = this.field374.method548(false);
                    if (var27 == 65535) {
                        var27 = -1;
                    }
                    if (this.field276 != var27 && this.field186 && !field191 && this.field223 == 0) {
                        this.field456 = var27;
                        this.field457 = true;
                        this.field259.method478(2, this.field456);
                    }
                    this.field276 = var27;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 159) {
                    int var28 = this.field374.method523();
                    int var29 = this.field374.method548(false);
                    if (this.field186 && !field191) {
                        this.field456 = var28;
                        this.field457 = false;
                        this.field259.method478(2, this.field456);
                        this.field223 = var29;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 56) {
                    this.field493 = true;
                    int var30 = this.field374.method523();
                    class48 var31 = class48.field1246[var30];
                    int var32 = this.field374.method523();
                    for (int var33 = 0; var33 < var32; ++var33) {
                        int var34 = this.field374.method540(695);
                        if (var34 == 255) {
                            var34 = this.field374.method554(this.field411);
                        }
                        var31.field1272[var33] = this.field374.method523();
                        var31.field1268[var33] = var34;
                    }
                    for (int var35 = var32; var35 < var31.field1272.length; ++var35) {
                        var31.field1272[var35] = 0;
                        var31.field1268[var35] = 0;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 37) {
                    String var36 = this.field374.method528();
                    int var37 = this.field374.method550(-397);
                    class48.field1246[var37].field1274 = var36;
                    if (this.field95[this.field380] == class48.field1246[var37].field1241) {
                        this.field493 = true;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 167) {
                    this.field172 = false;
                    this.field144 = 1;
                    this.field121 = "";
                    this.field228 = true;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 139) {
                    int var38 = this.field374.method549(0);
                    int var39 = this.field374.method539(319);
                    if (var38 == 65535) {
                        var38 = -1;
                    }
                    this.field95[var39] = var38;
                    this.field493 = true;
                    this.field168 = true;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 157) {
                    this.field290 = this.field374.method541((byte) 13);
                    this.field289 = this.field374.method540(695);
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 58) {
                    int var40 = this.field374.method549(0);
                    int var41 = this.field374.method548(false);
                    int var42 = this.field374.method550(-397);
                    int var43 = this.field374.method550(-397);
                    class48.field1246[var42].field1289 = var41;
                    class48.field1246[var42].field1290 = var40;
                    class48.field1246[var42].field1288 = var43;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 101) {
                    int var44 = this.field374.method521();
                    int var45 = this.field374.method521();
                    int var46 = this.field374.method521();
                    int var47 = this.field374.method521();
                    this.field432[var44] = true;
                    this.field72[var44] = var45;
                    this.field355[var44] = var46;
                    this.field299[var44] = var47;
                    this.field404[var44] = 0;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 50) {
                    this.field444 = true;
                    this.field100 = this.field374.method521();
                    this.field101 = this.field374.method521();
                    this.field102 = this.field374.method523();
                    this.field103 = this.field374.method521();
                    this.field104 = this.field374.method521();
                    if (this.field104 >= 100) {
                        int var48 = this.field100 * 128 + 64;
                        int var49 = this.field101 * 128 + 64;
                        int var50 = this.method119(this.field123, var49, var48, 4) - this.field102;
                        int var51 = var48 - this.field488;
                        int var52 = var50 - this.field489;
                        int var53 = var49 - this.field490;
                        int var54 = (int) Math.sqrt((double) (var51 * var51 + var53 * var53));
                        this.field491 = (int) (Math.atan2((double) var52, (double) var54) * 325.949D) & 2047;
                        this.field492 = (int) (Math.atan2((double) var51, (double) var53) * -325.949D) & 2047;
                        if (this.field491 < 128) {
                            this.field491 = 128;
                        }
                        if (this.field491 > 383) {
                            this.field491 = 383;
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 192) {
                    this.field289 = this.field374.method539(319);
                    this.field290 = this.field374.method539(319);
                    while (this.field374.field1579 < this.field530) {
                        int var55 = this.field374.method521();
                        this.method54(this.field77, var55, this.field374);
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 89) {
                    this.field380 = this.field374.method540(695);
                    this.field493 = true;
                    this.field168 = true;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 121) {
                    for (int var56 = 0; var56 < this.field389.length; ++var56) {
                        if (this.field514[var56] != this.field389[var56]) {
                            this.field389[var56] = this.field514[var56];
                            this.method165(-8300, var56);
                            this.field493 = true;
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 92) {
                    this.field445 = this.field374.method548(false);
                    this.field310 = this.field374.method556(6);
                    this.field96 = this.field374.method539(319);
                    this.field379 = this.field374.method540(695);
                    this.field192 = this.field374.method548(false);
                    if (this.field310 != 0 && this.field450 == -1) {
                        signlink.dnslookup(class67.method566(true, this.field310));
                        this.method94((byte) 59);
                        short var57 = 650;
                        if (this.field96 != 201 || this.field379 == 1) {
                            var57 = 655;
                        }
                        this.field154 = "";
                        this.field112 = false;
                        for (int var58 = 0; var58 < class48.field1246.length; ++var58) {
                            if (class48.field1246[var58] != null && class48.field1246[var58].field1262 == var57) {
                                this.field450 = class48.field1246[var58].field1241;
                                break;
                            }
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 145) {
                    this.field201 = this.field374.method521();
                    this.field493 = true;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 100) {
                    long var59 = this.field374.method527(-651);
                    int var61 = this.field374.method526();
                    int var62 = this.field374.method521();
                    boolean var63 = false;
                    for (int var64 = 0; var64 < 100; ++var64) {
                        if (this.field90[var64] == var61) {
                            var63 = true;
                            break;
                        }
                    }
                    if (var62 <= 1) {
                        for (int var65 = 0; var65 < this.field241; ++var65) {
                            if (this.field69[var65] == var59) {
                                var63 = true;
                                break;
                            }
                        }
                    }
                    if (!var63 && this.field478 == 0) {
                        try {
                            this.field90[this.field106] = var61;
                            this.field106 = (this.field106 + 1) % 100;
                            String var66 = class15.method216(this.field374, this.field530 - 13, (byte) 106);
                            if (var62 != 3) {
                                var66 = class33.method347(true, var66);
                            }
                            if (var62 != 2 && var62 != 3) {
                                if (var62 == 1) {
                                    this.method100("@cr1@" + class67.method567(-550, class67.method564(var59, true)), 7, 14378, var66);
                                } else {
                                    this.method100(class67.method567(-550, class67.method564(var59, true)), 3, 14378, var66);
                                }
                            } else {
                                this.method100("@cr2@" + class67.method567(-550, class67.method564(var59, true)), 7, 14378, var66);
                            }
                        } catch (Exception var187) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 3) {
                    int var68 = this.field374.method523();
                    int var69 = this.field374.method521();
                    int var70 = this.field374.method523();
                    if (this.field497 && !field191 && this.field118 < 50) {
                        this.field184[this.field118] = var68;
                        this.field222[this.field118] = var69;
                        this.field275[this.field118] = class72.field1708[var68] + var70;
                        ++this.field118;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 108) {
                    String var71 = this.field374.method528();
                    int var72 = this.field374.method539(319);
                    int var73 = this.field374.method539(319);
                    if (var73 >= 1 && var73 <= 5) {
                        if (var71.equalsIgnoreCase("null")) {
                            var71 = null;
                        }
                        this.field387[var73 - 1] = var71;
                        this.field388[var73 - 1] = var72 == 0;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 104) {
                    int var74 = this.field374.method523();
                    int var75 = this.field374.method550(-397);
                    class48.field1246[var74].field1252 = 1;
                    class48.field1246[var74].field1253 = var75;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 169) {
                    int var76 = this.field374.method554(this.field411);
                    int var77 = this.field374.method549(0);
                    this.field514[var77] = var76;
                    if (this.field389[var77] != var76) {
                        this.field389[var77] = var76;
                        this.method165(-8300, var77);
                        this.field493 = true;
                        if (this.field373 != -1) {
                            this.field228 = true;
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 243) {
                    if (this.field437 != -1) {
                        this.field437 = -1;
                        this.field493 = true;
                        this.field168 = true;
                    }
                    if (this.field341 != -1) {
                        this.field341 = -1;
                        this.field228 = true;
                    }
                    if (this.field144 != 0) {
                        this.field144 = 0;
                        this.field228 = true;
                    }
                    this.field450 = -1;
                    this.field91 = false;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 65) {
                    if (this.field380 == 12) {
                        this.field493 = true;
                    }
                    this.field146 = this.field374.method521();
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 28) {
                    int var78 = this.field374.method550(-397);
                    class48 var79 = class48.field1246[var78];
                    for (int var80 = 0; var80 < var79.field1272.length; ++var80) {
                        var79.field1272[var80] = -1;
                        var79.field1272[var80] = 0;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 188) {
                    this.field290 = this.field374.method541((byte) 13);
                    this.field289 = this.field374.method540(695);
                    for (int var81 = this.field289; var81 < this.field289 + 8; ++var81) {
                        for (int var82 = this.field290; var82 < this.field290 + 8; ++var82) {
                            if (this.field272[this.field123][var81][var82] != null) {
                                this.field272[this.field123][var81][var82] = null;
                                this.method136(var81, var82);
                            }
                        }
                    }
                    for (class32 var83 = (class32) this.field344.method332(); var83 != null; var83 = (class32) this.field344.method334(-96)) {
                        if (var83.field967 >= this.field289 && var83.field967 < this.field289 + 8 && var83.field968 >= this.field290 && var83.field968 < this.field290 + 8 && this.field123 == var83.field965) {
                            var83.field969 = 0;
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 175) {
                    this.method96(20701);
                    this.field531 = -1;
                    return false;
                }
                if (this.field531 == 42 || this.field531 == 210 || this.field531 == 57 || this.field531 == 156 || this.field531 == 143 || this.field531 == 75 || this.field531 == 149 || this.field531 == 6 || this.field531 == 247 || this.field531 == 112 || this.field531 == 88) {
                    this.method54(this.field77, this.field531, this.field374);
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 126) {
                    this.method121(this.field374, this.field79, this.field530);
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 30) {
                    int var84 = this.field374.method549(0);
                    int var85 = this.field374.method523();
                    class48 var86 = class48.field1246[var84];
                    if (var86 != null && var86.field1260 == 0) {
                        if (var85 < 0) {
                            var85 = 0;
                        }
                        if (var85 > var86.field1281 - var86.field1245) {
                            var85 = var86.field1281 - var86.field1245;
                        }
                        var86.field1286 = var85;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 170 || this.field531 == 245) {
                    int var87 = this.field270;
                    int var88 = this.field271;
                    if (this.field531 == 170) {
                        var88 = this.field374.method550(-397);
                        var87 = this.field374.method548(false);
                        this.field375 = false;
                    }
                    if (this.field531 == 245) {
                        var87 = this.field374.method523();
                        var88 = this.field374.method550(-397);
                        this.field374.method531(0);
                        int var89 = 0;
                        while (true) {
                            if (var89 >= 4) {
                                this.field374.method533(this.field229);
                                this.field375 = true;
                                break;
                            }
                            for (int var90 = 0; var90 < 13; ++var90) {
                                for (int var91 = 0; var91 < 13; ++var91) {
                                    int var92 = this.field374.method532(7, 1);
                                    if (var92 == 1) {
                                        this.field308[var89][var90][var91] = this.field374.method532(7, 26);
                                    } else {
                                        this.field308[var89][var90][var91] = -1;
                                    }
                                }
                            }
                            ++var89;
                        }
                    }
                    if (this.field270 == var87 && this.field271 == var88 && this.field291 == 2) {
                        this.field531 = -1;
                        return true;
                    }
                    this.field270 = var87;
                    this.field271 = var88;
                    this.field217 = (this.field270 - 6) * 8;
                    this.field218 = (this.field271 - 6) * 8;
                    this.field109 = false;
                    if ((this.field270 / 8 == 48 || this.field270 / 8 == 49) && this.field271 / 8 == 48) {
                        this.field109 = true;
                    }
                    if (this.field270 / 8 == 48 && this.field271 / 8 == 148) {
                        this.field109 = true;
                    }
                    this.field291 = 1;
                    this.field80 = System.currentTimeMillis();
                    this.field245.method176(-179);
                    this.field293.method15(151, true, 257, 0, "Loading - please wait.");
                    this.field293.method15(150, true, 256, 16777215, "Loading - please wait.");
                    this.field245.method177(4, true, super.field804, 4);
                    if (this.field531 == 170) {
                        int var93 = 0;
                        int var94 = (this.field270 - 6) / 8;
                        label1113: while (true) {
                            if (var94 > (this.field270 + 6) / 8) {
                                this.field525 = new byte[var93][];
                                this.field424 = new byte[var93][];
                                this.field130 = new int[var93];
                                this.field131 = new int[var93];
                                this.field132 = new int[var93];
                                int var96 = 0;
                                int var97 = (this.field270 - 6) / 8;
                                while (true) {
                                    if (var97 > (this.field270 + 6) / 8) {
                                        break label1113;
                                    }
                                    for (int var98 = (this.field271 - 6) / 8; var98 <= (this.field271 + 6) / 8; ++var98) {
                                        this.field130[var96] = (var97 << 8) + var98;
                                        if (this.field109 && (var98 == 49 || var98 == 149 || var98 == 147 || var97 == 50 || var97 == 49 && var98 == 47)) {
                                            this.field131[var96] = -1;
                                            this.field132[var96] = -1;
                                            ++var96;
                                        } else {
                                            int var99 = this.field131[var96] = this.field259.method475((byte) 76, var98, var97, 0);
                                            if (var99 != -1) {
                                                this.field259.method478(3, var99);
                                            }
                                            int var100 = this.field132[var96] = this.field259.method475((byte) 76, var98, var97, 1);
                                            if (var100 != -1) {
                                                this.field259.method478(3, var100);
                                            }
                                            ++var96;
                                        }
                                    }
                                    ++var97;
                                }
                            }
                            for (int var95 = (this.field271 - 6) / 8; var95 <= (this.field271 + 6) / 8; ++var95) {
                                ++var93;
                            }
                            ++var94;
                        }
                    }
                    if (this.field531 == 245) {
                        int var101 = 0;
                        int[] var102 = new int[676];
                        int var103 = 0;
                        label1074: while (true) {
                            if (var103 >= 4) {
                                this.field525 = new byte[var101][];
                                this.field424 = new byte[var101][];
                                this.field130 = new int[var101];
                                this.field131 = new int[var101];
                                this.field132 = new int[var101];
                                int var111 = 0;
                                while (true) {
                                    if (var111 >= var101) {
                                        break label1074;
                                    }
                                    int var112 = this.field130[var111] = var102[var111];
                                    int var113 = var112 >> 8 & 255;
                                    int var114 = var112 & 255;
                                    int var115 = this.field131[var111] = this.field259.method475((byte) 76, var114, var113, 0);
                                    if (var115 != -1) {
                                        this.field259.method478(3, var115);
                                    }
                                    int var116 = this.field132[var111] = this.field259.method475((byte) 76, var114, var113, 1);
                                    if (var116 != -1) {
                                        this.field259.method478(3, var116);
                                    }
                                    ++var111;
                                }
                            }
                            for (int var104 = 0; var104 < 13; ++var104) {
                                for (int var105 = 0; var105 < 13; ++var105) {
                                    int var106 = this.field308[var103][var104][var105];
                                    if (var106 != -1) {
                                        int var107 = var106 >> 14 & 1023;
                                        int var108 = var106 >> 3 & 2047;
                                        int var109 = (var107 / 8 << 8) + var108 / 8;
                                        for (int var110 = 0; var110 < var101; ++var110) {
                                            if (var102[var110] == var109) {
                                                var109 = -1;
                                                break;
                                            }
                                        }
                                        if (var109 != -1) {
                                            var102[var101++] = var109;
                                        }
                                    }
                                }
                            }
                            ++var103;
                        }
                    }
                    int var117 = this.field217 - this.field219;
                    int var118 = this.field218 - this.field220;
                    this.field219 = this.field217;
                    this.field220 = this.field218;
                    for (int var119 = 0; var119 < 16384; ++var119) {
                        class3 var120 = this.field225[var119];
                        if (var120 != null) {
                            for (int var121 = 0; var121 < 10; ++var121) {
                                var120.field1362[var121] -= var117;
                                var120.field1363[var121] -= var118;
                            }
                            var120.field1326 -= var117 * 128;
                            var120.field1327 -= var118 * 128;
                        }
                    }
                    for (int var122 = 0; var122 < this.field248; ++var122) {
                        class38 var123 = this.field250[var122];
                        if (var123 != null) {
                            for (int var124 = 0; var124 < 10; ++var124) {
                                var123.field1362[var124] -= var117;
                                var123.field1363[var124] -= var118;
                            }
                            var123.field1326 -= var117 * 128;
                            var123.field1327 -= var118 * 128;
                        }
                    }
                    this.field247 = true;
                    byte var125 = 0;
                    byte var126 = 104;
                    byte var127 = 1;
                    if (var117 < 0) {
                        var125 = 103;
                        var126 = -1;
                        var127 = -1;
                    }
                    byte var128 = 0;
                    byte var129 = 104;
                    byte var130 = 1;
                    if (var118 < 0) {
                        var128 = 103;
                        var129 = -1;
                        var130 = -1;
                    }
                    for (int var131 = var125; var126 != var131; var131 += var127) {
                        for (int var132 = var128; var129 != var132; var132 += var130) {
                            int var133 = var117 + var131;
                            int var134 = var118 + var132;
                            for (int var135 = 0; var135 < 4; ++var135) {
                                if (var133 >= 0 && var134 >= 0 && var133 < 104 && var134 < 104) {
                                    this.field272[var135][var131][var132] = this.field272[var135][var133][var134];
                                } else {
                                    this.field272[var135][var131][var132] = null;
                                }
                            }
                        }
                    }
                    for (class32 var136 = (class32) this.field344.method332(); var136 != null; var136 = (class32) this.field344.method334(-96)) {
                        var136.field967 -= var117;
                        var136.field968 -= var118;
                        if (var136.field967 < 0 || var136.field968 < 0 || var136.field967 >= 104 || var136.field968 >= 104) {
                            var136.method471();
                        }
                    }
                    if (this.field467 != 0) {
                        this.field467 -= var117;
                        this.field468 -= var118;
                    }
                    this.field444 = false;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 253) {
                    int var137 = this.field374.method549(0);
                    int var138 = this.field374.method523();
                    if (this.field341 != -1) {
                        this.field341 = -1;
                        this.field228 = true;
                    }
                    if (this.field144 != 0) {
                        this.field144 = 0;
                        this.field228 = true;
                    }
                    this.field450 = var138;
                    this.field437 = var137;
                    this.field493 = true;
                    this.field168 = true;
                    this.field91 = false;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 217) {
                    this.method65(this.field374, this.field530, (byte) 2);
                    this.field247 = false;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 179) {
                    this.field180 = this.field374.method521();
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 255) {
                    this.field467 = 0;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 102) {
                    this.field126 = this.field374.method521();
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 41) {
                    int var139 = this.field374.method548(false);
                    boolean var140 = this.field374.method541((byte) 13) == 1;
                    class48.field1246[var139].field1254 = var140;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 158) {
                    String var141 = this.field374.method528();
                    if (var141.endsWith(":tradereq:")) {
                        String var142 = var141.substring(0, var141.indexOf(":"));
                        long var143 = class67.method563(var142);
                        boolean var145 = false;
                        for (int var146 = 0; var146 < this.field241; ++var146) {
                            if (this.field69[var146] == var143) {
                                var145 = true;
                                break;
                            }
                        }
                        if (!var145 && this.field478 == 0) {
                            this.method100(var142, 4, 14378, "wishes to trade with you.");
                        }
                    } else if (var141.endsWith(":duelreq:")) {
                        String var147 = var141.substring(0, var141.indexOf(":"));
                        long var148 = class67.method563(var147);
                        boolean var150 = false;
                        for (int var151 = 0; var151 < this.field241; ++var151) {
                            if (this.field69[var151] == var148) {
                                var150 = true;
                                break;
                            }
                        }
                        if (!var150 && this.field478 == 0) {
                            this.method100(var147, 8, 14378, "wishes to duel with you.");
                        }
                    } else if (!var141.endsWith(":chalreq:")) {
                        this.method100("", 0, 14378, var141);
                    } else {
                        String var152 = var141.substring(0, var141.indexOf(":"));
                        long var153 = class67.method563(var152);
                        boolean var155 = false;
                        for (int var156 = 0; var156 < this.field241; ++var156) {
                            if (this.field69[var156] == var153) {
                                var155 = true;
                                break;
                            }
                        }
                        if (!var155 && this.field478 == 0) {
                            String var157 = var141.substring(var141.indexOf(":") + 1, var141.length() - 9);
                            this.method100(var152, 8, 14378, var157);
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 224) {
                    long var158 = this.field374.method527(-651);
                    int var160 = this.field374.method521();
                    String var161 = class67.method567(-550, class67.method564(var158, true));
                    for (int var162 = 0; var162 < this.field200; ++var162) {
                        if (this.field378[var162] == var158) {
                            if (this.field116[var162] != var160) {
                                this.field116[var162] = var160;
                                this.field493 = true;
                                if (var160 > 0) {
                                    this.method100("", 5, 14378, var161 + " has logged in.");
                                }
                                if (var160 == 0) {
                                    this.method100("", 5, 14378, var161 + " has logged out.");
                                }
                            }
                            var161 = null;
                            break;
                        }
                    }
                    if (var161 != null && this.field200 < 200) {
                        this.field378[this.field200] = var158;
                        this.field260[this.field200] = var161;
                        this.field116[this.field200] = var160;
                        ++this.field200;
                        this.field493 = true;
                    }
                    boolean var163 = false;
                    while (!var163) {
                        var163 = true;
                        for (int var164 = 0; var164 < this.field200 - 1; ++var164) {
                            if (this.field116[var164] != field188 && this.field116[var164 + 1] == field188 || this.field116[var164] == 0 && this.field116[var164 + 1] != 0) {
                                int var165 = this.field116[var164];
                                this.field116[var164] = this.field116[var164 + 1];
                                this.field116[var164 + 1] = var165;
                                String var166 = this.field260[var164];
                                this.field260[var164] = this.field260[var164 + 1];
                                this.field260[var164 + 1] = var166;
                                long var167 = this.field378[var164];
                                this.field378[var164] = this.field378[var164 + 1];
                                this.field378[var164 + 1] = var167;
                                this.field493 = true;
                                var163 = false;
                            }
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 171) {
                    int var169 = this.field374.method550(-397);
                    class48.field1246[var169].field1252 = 3;
                    if (field113.field1097 == null) {
                        class48.field1246[var169].field1253 = (field113.field1095[11] << 5) + (field113.field1095[8] << 10) + (field113.field1095[0] << 15) + (field113.field1113[0] << 25) + (field113.field1113[4] << 20) + field113.field1095[1];
                    } else {
                        class48.field1246[var169].field1253 = (int) (field113.field1097.field906 + 305419896L);
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 97) {
                    this.field444 = false;
                    for (int var170 = 0; var170 < 5; ++var170) {
                        this.field432[var170] = false;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 182) {
                    int var171 = this.field374.method548(false);
                    this.method87(var171, (byte) 53);
                    if (this.field437 != -1) {
                        this.field437 = -1;
                        this.field493 = true;
                        this.field168 = true;
                    }
                    this.field341 = var171;
                    this.field228 = true;
                    this.field450 = -1;
                    this.field91 = false;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 79) {
                    this.field377 = this.field374.method539(319);
                    if (this.field380 == this.field377) {
                        if (this.field377 == 3) {
                            this.field380 = 1;
                        } else {
                            this.field380 = 3;
                        }
                        this.field493 = true;
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 125) {
                    int var172 = this.field374.method549(0);
                    int var173 = this.field374.method550(-397);
                    int var174 = var173 >> 10 & 31;
                    int var175 = var173 >> 5 & 31;
                    int var176 = var173 & 31;
                    class48.field1246[var172].field1263 = (var176 << 3) + (var174 << 19) + (var175 << 11);
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 208) {
                    this.field296 = this.field374.method521();
                    if (this.field296 == 1) {
                        this.field410 = this.field374.method523();
                    }
                    if (this.field296 >= 2 && this.field296 <= 6) {
                        if (this.field296 == 2) {
                            this.field196 = 64;
                            this.field197 = 64;
                        }
                        if (this.field296 == 3) {
                            this.field196 = 0;
                            this.field197 = 64;
                        }
                        if (this.field296 == 4) {
                            this.field196 = 128;
                            this.field197 = 64;
                        }
                        if (this.field296 == 5) {
                            this.field196 = 64;
                            this.field197 = 0;
                        }
                        if (this.field296 == 6) {
                            this.field196 = 64;
                            this.field197 = 128;
                        }
                        this.field296 = 2;
                        this.field193 = this.field374.method523();
                        this.field194 = this.field374.method523();
                        this.field195 = this.field374.method521();
                    }
                    if (this.field296 == 10) {
                        this.field458 = this.field374.method523();
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 55) {
                    int var177 = this.field374.method523();
                    int var178 = this.field374.method550(-397);
                    int var179 = this.field374.method523();
                    if (var179 == 65535) {
                        class48.field1246[var177].field1252 = 0;
                        this.field531 = -1;
                        return true;
                    }
                    class24 var180 = class24.method293(var179);
                    class48.field1246[var177].field1252 = 4;
                    class48.field1246[var177].field1253 = var179;
                    class48.field1246[var177].field1289 = var180.field841;
                    class48.field1246[var177].field1290 = var180.field830;
                    class48.field1246[var177].field1288 = var180.field839 * 100 / var178;
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 87) {
                    for (int var181 = 0; var181 < this.field250.length; ++var181) {
                        if (this.field250[var181] != null) {
                            this.field250[var181].field1319 = -1;
                        }
                    }
                    for (int var182 = 0; var182 < this.field225.length; ++var182) {
                        if (this.field225[var182] != null) {
                            this.field225[var182].field1319 = -1;
                        }
                    }
                    this.field531 = -1;
                    return true;
                }
                if (this.field531 == 184) {
                    int var183 = this.field374.method524();
                    if (var183 >= 0) {
                        this.method87(var183, (byte) 53);
                    }
                    this.field446 = var183;
                    this.field531 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field531 + "," + this.field530 + " - " + this.field527 + "," + this.field528);
                this.method96(20701);
            } catch (IOException var188) {
                this.method118((byte) 21);
            } catch (Exception var189) {
                String var185 = "T2 - " + this.field531 + "," + this.field527 + "," + this.field528 + " - " + this.field530 + "," + (field113.field1362[0] + this.field217) + "," + (field113.field1363[0] + this.field218) + " - ";
                for (int var186 = 0; var186 < this.field530 && var186 < 50; ++var186) {
                    var185 = var185 + this.field374.field1578[var186] + ",";
                }
                signlink.reporterror(var185);
                this.method96(20701);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method38(int arg0) {
        ++this.field403;
        this.method91(true, (byte) 4);
        this.method58(true, -876);
        this.method91(false, (byte) 4);
        this.method58(false, -876);
        this.method131(-606);
        this.method155(this.field153);
        if (!this.field444) {
            int var2 = this.field73;
            if (this.field129 / 256 > var2) {
                var2 = this.field129 / 256;
            }
            if (this.field432[4] && this.field355[4] + 128 > var2) {
                var2 = this.field355[4] + 128;
            }
            int var3 = this.field74 + this.field312 & 2047;
            this.method52(this.method119(this.field123, field113.field1327, field113.field1326, 4) - 50, var3, this.field453, var2 * 3 + 600, -13210, var2, this.field452);
        }
        int var4;
        if (!this.field444) {
            var4 = this.method56(0);
        } else {
            var4 = this.method57((byte) 3);
        }
        int var5 = this.field488;
        int var6 = this.field489;
        int var7 = this.field490;
        int var8 = this.field491;
        int var9 = this.field492;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field432[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field72[var10] * 2 + 1) - (double) this.field72[var10] + Math.sin((double) this.field299[var10] / 100.0D * (double) this.field404[var10]) * (double) this.field355[var10]);
                if (var10 == 0) {
                    this.field488 += var12;
                }
                if (var10 == 1) {
                    this.field489 += var12;
                }
                if (var10 == 2) {
                    this.field490 += var12;
                }
                if (var10 == 3) {
                    this.field492 = this.field492 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field491 += var12;
                    if (this.field491 < 128) {
                        this.field491 = 128;
                    }
                    if (this.field491 > 383) {
                        this.field491 = 383;
                    }
                }
            }
        }
        int var11 = class47.field1237;
        class35.field1068 = true;
        class35.field1071 = 0;
        class35.field1069 = super.field812 - 4;
        class35.field1070 = super.field813 - 4;
        class29.method320(7);
        this.field397.method272(this.field492, this.field488, this.field490, var4, this.field489, 4, this.field491);
        this.field397.method247(-218);
        this.method157(9);
        this.method72(false);
        this.method60(var11, (byte) 26);
        this.method132(this.field398);
        this.field245.method177(4, true, super.field804, 4);
        this.field488 = var5;
        this.field489 = var6;
        this.field490 = var7;
        this.field491 = var8;
        this.field492 = var9;
        if (arg0 != 43942) {
            this.field167 = !this.field167;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method39(byte arg0) {
        if (this.field150 != 0) {
            int var2 = 0;
            if (this.field535 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field415[var3] != null) {
                    int var4 = this.field413[var3];
                    String var5 = this.field414[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field475 == 0 || this.field475 == 1 && this.method161(var5, (byte) -125))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field812 > 4 && super.field813 - 4 > var9 - 10 && super.field813 - 4 <= var9 + 3) {
                            int var10 = this.field293.method17("From:  " + var5 + this.field415[var3], false) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field812 < var10 + 4) {
                                if (this.field316 >= 1) {
                                    this.field149[this.field477] = "Report abuse @whi@" + var5;
                                    this.field509[this.field477] = 2423;
                                    ++this.field477;
                                }
                                this.field149[this.field477] = "Add ignore @whi@" + var5;
                                this.field509[this.field477] = 2400;
                                ++this.field477;
                                this.field149[this.field477] = "Add friend @whi@" + var5;
                                this.field509[this.field477] = 2290;
                                ++this.field477;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field475 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != -58) {
                this.field531 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method40(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg0;
        int var6 = 49 / arg3;
        return ((arg1 & 16711935) * arg0 + (arg2 & 16711935) * var5 & -16711936) + ((arg1 & 65280) * arg0 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLAKHMHBY;IBII)V")
    public final void method41(class38 arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (field113 != arg0) {
            if (this.field477 < 400) {
                String var6;
                if (arg0.field1110 == 0) {
                    var6 = arg0.field1114 + method129(field113.field1108, arg0.field1108, false) + " (level-" + arg0.field1108 + ")";
                } else {
                    var6 = arg0.field1114 + " (skill-" + arg0.field1110 + ")";
                }
                if (this.field303 == 1) {
                    this.field149[this.field477] = "Use " + this.field307 + " with @whi@" + var6;
                    this.field509[this.field477] = 978;
                    this.field510[this.field477] = arg4;
                    this.field507[this.field477] = arg3;
                    this.field508[this.field477] = arg1;
                    ++this.field477;
                } else if (this.field390 == 1) {
                    if ((this.field392 & 8) == 8) {
                        this.field149[this.field477] = this.field393 + " @whi@" + var6;
                        this.field509[this.field477] = 877;
                        this.field510[this.field477] = arg4;
                        this.field507[this.field477] = arg3;
                        this.field508[this.field477] = arg1;
                        ++this.field477;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field387[var7] != null) {
                            this.field149[this.field477] = this.field387[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field387[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field1108 > field113.field1108) {
                                    var9 = 2000;
                                }
                                if (field113.field1091 != 0 && arg0.field1091 != 0) {
                                    if (field113.field1091 == arg0.field1091) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field388[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field509[this.field477] = var9 + 725;
                            }
                            if (var7 == 1) {
                                this.field509[this.field477] = var9 + 397;
                            }
                            if (var7 == 2) {
                                this.field509[this.field477] = var9 + 4;
                            }
                            if (var7 == 3) {
                                this.field509[this.field477] = var9 + 19;
                            }
                            if (var7 == 4) {
                                this.field509[this.field477] = var9 + 716;
                            }
                            this.field510[this.field477] = arg4;
                            this.field507[this.field477] = arg3;
                            this.field508[this.field477] = arg1;
                            ++this.field477;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field477; ++var8) {
                    if (this.field509[var8] == 472) {
                        this.field149[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (this.field315 != arg2) {
                    this.field342 = 269;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method42(int arg0) {
        int var2 = this.field294.method17("Choose Option", false);
        if (arg0 == 7) {
            for (int var3 = 0; var3 < this.field477; ++var3) {
                int var11 = this.field294.method17(this.field149[var3], false);
                if (var11 > var2) {
                    var2 = var11;
                }
            }
            var2 += 8;
            int var4 = this.field477 * 15 + 21;
            if (super.field819 > 4 && super.field820 > 4 && super.field819 < 516 && super.field820 < 338) {
                int var5 = super.field819 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field820 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field395 = true;
                this.field460 = 0;
                this.field461 = var5;
                this.field462 = var6;
                this.field463 = var2;
                this.field464 = this.field477 * 15 + 22;
            }
            if (super.field819 > 553 && super.field820 > 205 && super.field819 < 743 && super.field820 < 466) {
                int var7 = super.field819 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field820 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field395 = true;
                this.field460 = 1;
                this.field461 = var7;
                this.field462 = var8;
                this.field463 = var2;
                this.field464 = this.field477 * 15 + 22;
            }
            if (super.field819 > 17 && super.field820 > 357 && super.field819 < 496 && super.field820 < 453) {
                int var9 = super.field819 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field820 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field395 = true;
                this.field460 = 2;
                this.field461 = var9;
                this.field462 = var10;
                this.field463 = var2;
                this.field464 = this.field477 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method43(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field93 = "";
                this.field94 = "Connecting to server...";
                this.method49(false, true);
            }
            this.field309 = new class1(this.method135(field189 + 43594), this, this.field262);
            long var4 = class67.method563(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field159.field1579 = 0;
            this.field159.method511(14);
            this.field159.method511(var6);
            this.field309.method5(-33359, this.field159.field1578, 0, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field309.method2();
            }
            int var8 = this.field309.method2();
            int var9 = var8;
            if (var8 == 0) {
                this.field309.method4(this.field374.field1578, 0, 8);
                this.field374.field1579 = 0;
                this.field386 = this.field374.method527(-651);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field386 >> 32), (int) this.field386 };
                this.field159.field1579 = 0;
                this.field159.method511(10);
                this.field159.method515(var10[0]);
                this.field159.method515(var10[1]);
                this.field159.method515(var10[2]);
                this.field159.method515(var10[3]);
                this.field159.method515(signlink.uid);
                this.field159.method518(arg0);
                this.field159.method518(arg1);
                this.field159.method536((byte) -29, field238, field86);
                this.field148.field1579 = 0;
                if (arg2) {
                    this.field148.method511(18);
                } else {
                    this.field148.method511(16);
                }
                this.field148.method511(this.field159.field1579 + 36 + 1 + 1 + 2);
                this.field148.method511(255);
                this.field148.method512(316);
                this.field148.method511(field191 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field148.method515(this.field319[var11]);
                }
                this.field148.method519(this.field159.field1579, this.field159.field1578, true, 0);
                this.field159.field1583 = new class37(var10, 2);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field105 = new class37(var10, 2);
                this.field309.method5(-33359, this.field148.field1578, 0, this.field148.field1579);
                var8 = this.field309.method2();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method43(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field316 = this.field309.method2();
                field242 = this.field309.method2() == 1;
                this.field529 = 0L;
                this.field99 = 0;
                this.field325.field1137 = 0;
                super.field809 = true;
                this.field178 = true;
                this.field179 = true;
                this.field159.field1579 = 0;
                this.field374.field1579 = 0;
                this.field531 = -1;
                this.field526 = -1;
                this.field527 = -1;
                this.field528 = -1;
                this.field530 = 0;
                this.field532 = 0;
                this.field535 = 0;
                this.field534 = 0;
                this.field296 = 0;
                this.field477 = 0;
                this.field395 = false;
                super.field810 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field415[var13] = null;
                }
                this.field303 = 0;
                this.field390 = 0;
                this.field291 = 0;
                this.field118 = 0;
                this.field540 = (int) (Math.random() * 100.0D) - 50;
                this.field428 = (int) (Math.random() * 110.0D) - 55;
                this.field312 = (int) (Math.random() * 80.0D) - 40;
                this.field523 = (int) (Math.random() * 120.0D) - 60;
                this.field236 = (int) (Math.random() * 30.0D) - 20;
                this.field74 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field126 = 0;
                this.field515 = -1;
                this.field467 = 0;
                this.field468 = 0;
                this.field251 = 0;
                this.field226 = 0;
                for (int var14 = 0; var14 < this.field248; ++var14) {
                    this.field250[var14] = null;
                    this.field255[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field225[var15] = null;
                }
                field113 = this.field250[this.field249] = new class38();
                this.field70.method336();
                this.field288.method336();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field272[var16][var17][var18] = null;
                        }
                    }
                }
                this.field344 = new class31(-33684);
                this.field201 = 0;
                this.field200 = 0;
                this.field373 = -1;
                this.field341 = -1;
                this.field450 = -1;
                this.field437 = -1;
                this.field446 = -1;
                this.field91 = false;
                this.field380 = 3;
                this.field144 = 0;
                this.field395 = false;
                this.field172 = false;
                this.field476 = null;
                this.field180 = 0;
                this.field377 = -1;
                this.field202 = true;
                this.method137(-339);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field88[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field387[var20] = null;
                    this.field388[var20] = false;
                }
                field124 = 0;
                field155 = 0;
                field84 = 0;
                field324 = 0;
                field516 = 0;
                field465 = 0;
                field472 = 0;
                field120 = 0;
                field449 = 0;
                field138 = 0;
                this.method51((byte) 31);
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
                this.field94 = "Login server rejected session.";
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
                this.field179 = true;
                this.field159.field1579 = 0;
                this.field374.field1579 = 0;
                this.field531 = -1;
                this.field526 = -1;
                this.field527 = -1;
                this.field528 = -1;
                this.field530 = 0;
                this.field532 = 0;
                this.field535 = 0;
                this.field477 = 0;
                this.field395 = false;
                this.field80 = System.currentTimeMillis();
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
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field447 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field447;
                            this.method43(arg0, arg1, arg2);
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
                for (int var21 = this.field309.method2(); var21 >= 0; --var21) {
                    this.field93 = "You have only just left another world";
                    this.field94 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method49(false, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method43(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field93 = "";
            this.field94 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 <= 0) {
            this.field272 = null;
        }
        if (super.field818 == 1) {
            if (super.field819 >= 6 && super.field819 <= 106 && super.field820 >= 467 && super.field820 <= 499) {
                this.field203 = (this.field203 + 1) % 4;
                this.field420 = true;
                this.field228 = true;
                this.field159.method510(26, -266);
                this.field159.method511(this.field203);
                this.field159.method511(this.field475);
                this.field159.method511(this.field187);
            }
            if (super.field819 >= 135 && super.field819 <= 235 && super.field820 >= 467 && super.field820 <= 499) {
                this.field475 = (this.field475 + 1) % 3;
                this.field420 = true;
                this.field228 = true;
                this.field159.method510(26, -266);
                this.field159.method511(this.field203);
                this.field159.method511(this.field475);
                this.field159.method511(this.field187);
            }
            if (super.field819 >= 273 && super.field819 <= 373 && super.field820 >= 467 && super.field820 <= 499) {
                this.field187 = (this.field187 + 1) % 3;
                this.field420 = true;
                this.field228 = true;
                this.field159.method510(26, -266);
                this.field159.method511(this.field203);
                this.field159.method511(this.field475);
                this.field159.method511(this.field187);
            }
            if (super.field819 >= 412 && super.field819 <= 512 && super.field820 >= 467 && super.field820 <= 499) {
                if (this.field450 == -1) {
                    this.method94((byte) 59);
                    this.field154 = "";
                    this.field112 = false;
                    for (int var2 = 0; var2 < class48.field1246.length; ++var2) {
                        if (class48.field1246[var2] != null && class48.field1246[var2].field1262 == 600) {
                            this.field158 = this.field450 = class48.field1246[var2].field1241;
                            return;
                        }
                    }
                    return;
                }
                this.method100("", 0, 14378, "Please close the interface you have open before using 'report abuse'");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZI)V")
    public final void method45(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            this.field398 = -344;
        }
        int var7 = this.field397.method259(arg2, arg0, arg3);
        if (var7 != 0) {
            int var8 = this.field397.method263(arg2, arg0, arg3, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field469.field1528;
            int var13 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class53 var15 = class53.method464(var14);
            if (var15.field1463 != -1) {
                class10 var16 = this.field418[var15.field1463];
                if (var16 != null) {
                    int var17 = (var15.field1421 * 4 - var16.field597) / 2;
                    int var18 = (var15.field1457 * 4 - var16.field598) / 2;
                    var16.method186((104 - arg3 - var15.field1457) * 4 + 48 + var18, arg0 * 4 + 48 + var17, 412);
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
        int var19 = this.field397.method261(arg2, arg0, arg3);
        if (var19 != 0) {
            int var20 = this.field397.method263(arg2, arg0, arg3, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class53 var24 = class53.method464(var23);
            if (var24.field1463 != -1) {
                class10 var25 = this.field418[var24.field1463];
                if (var25 != null) {
                    int var26 = (var24.field1421 * 4 - var25.field597) / 2;
                    int var27 = (var24.field1457 * 4 - var25.field598) / 2;
                    var25.method186((104 - arg3 - var24.field1457) * 4 + 48 + var27, arg0 * 4 + 48 + var26, 412);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field469.field1528;
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
        int var31 = this.field397.method262(arg2, arg0, arg3);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class53 var33 = class53.method464(var32);
            if (var33.field1463 != -1) {
                class10 var34 = this.field418[var33.field1463];
                if (var34 != null) {
                    int var35 = (var33.field1421 * 4 - var34.field597) / 2;
                    int var36 = (var33.field1457 * 4 - var34.field598) / 2;
                    var34.method186((104 - arg3 - var33.field1457) * 4 + 48 + var36, arg0 * 4 + 48 + var35, 412);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method46(int arg0) {
        int var2 = 5;
        this.field319[8] = 0;
        if (arg0 >= 0) {
            this.field531 = -1;
        }
        int var3 = 0;
        while (this.field319[8] == 0) {
            String var4 = "Unknown problem";
            this.method110("Connecting to web server", 20, (byte) -27);
            try {
                DataInputStream var5 = this.method162("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 316);
                class62 var6 = new class62(-417, new byte[40]);
                var5.readFully(var6.field1578, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field319[var7] = var6.method526();
                }
                int var8 = var6.method526();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field319[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field319[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field319[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field319[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field319[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field319[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method110("Game updated - please reload page", 10, (byte) -27);
                        var11 = 10;
                    } else {
                        this.method110(var4 + " - Will retry in " + var11 + " secs.", 10, (byte) -27);
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
                this.field371 = !this.field371;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZI)V")
    public final void method47(int arg0, boolean arg1, int arg2) {
        this.field530 += arg2;
        signlink.midivol = arg0;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method48(int arg0) {
        if (arg0 != -40379) {
            this.field531 = -1;
        }
        try {
            int var2 = field113.field1326 + this.field540;
            int var3 = field113.field1327 + this.field428;
            if (this.field452 - var2 < -500 || this.field452 - var2 > 500 || this.field453 - var3 < -500 || this.field453 - var3 > 500) {
                this.field452 = var2;
                this.field453 = var3;
            }
            if (this.field452 != var2) {
                this.field452 += (var2 - this.field452) / 16;
            }
            if (this.field453 != var3) {
                this.field453 += (var3 - this.field453) / 16;
            }
            if (super.field822[1] == 1) {
                this.field75 += (-24 - this.field75) / 2;
            } else if (super.field822[2] == 1) {
                this.field75 += (24 - this.field75) / 2;
            } else {
                this.field75 /= 2;
            }
            if (super.field822[3] == 1) {
                this.field76 += (12 - this.field76) / 2;
            } else if (super.field822[4] == 1) {
                this.field76 += (-12 - this.field76) / 2;
            } else {
                this.field76 /= 2;
            }
            this.field74 = this.field75 / 2 + this.field74 & 2047;
            this.field73 += this.field76 / 2;
            if (this.field73 < 128) {
                this.field73 = 128;
            }
            if (this.field73 > 383) {
                this.field73 = 383;
            }
            int var4 = this.field452 >> 7;
            int var5 = this.field453 >> 7;
            int var6 = this.method119(this.field123, this.field453, this.field452, 4);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field123;
                        if (var10 < 3 && (this.field506[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field358[var10][var8][var9];
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
            if (var12 > this.field129) {
                this.field129 += (var12 - this.field129) / 24;
            } else if (var12 < this.field129) {
                this.field129 += (var12 - this.field129) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field113.field1326 + "," + field113.field1327 + "," + this.field452 + "," + this.field453 + "," + this.field270 + "," + this.field271 + "," + this.field217 + "," + this.field218);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method49(boolean arg0, boolean arg1) {
        this.method53((byte) 2);
        this.field208.method176(-179);
        this.field434.method186(0, 0, 412);
        short var3 = 360;
        short var4 = 200;
        if (this.field353 == 0) {
            int var5 = var4 / 2 + 80;
            this.field292.method16(true, this.field259.field1509, var3 / 2, -22293, var5, 7711145);
            int var6 = var4 / 2 - 20;
            this.field294.method16(true, "Welcome to RuneScape", var3 / 2, -22293, var6, 16776960);
            int var18 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field435.method186(var8 - 20, var7 - 73, 412);
            this.field294.method16(true, "New User", var7, -22293, var8 + 5, 16777215);
            int var9 = var3 / 2 + 80;
            this.field435.method186(var8 - 20, var9 - 73, 412);
            this.field294.method16(true, "Existing User", var9, -22293, var8 + 5, 16777215);
        }
        if (this.field353 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field93.length() > 0) {
                this.field294.method16(true, this.field93, var3 / 2, -22293, var10 - 15, 16776960);
                this.field294.method16(true, this.field94, var3 / 2, -22293, var10, 16776960);
                var10 += 30;
            } else {
                this.field294.method16(true, this.field94, var3 / 2, -22293, var10 - 7, 16776960);
                var10 += 30;
            }
            this.field294.method23(var3 / 2 - 90, var10, "Username: " + this.field400 + (this.field263 == 0 & field487 % 40 < 20 ? "@yel@|" : ""), true, 16777215, true);
            var10 += 15;
            this.field294.method23(var3 / 2 - 88, var10, "Password: " + class67.method568(this.field401, 1) + (this.field263 == 1 & field487 % 40 < 20 ? "@yel@|" : ""), true, 16777215, true);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field435.method186(var12 - 20, var11 - 73, 412);
                this.field294.method16(true, "Login", var11, -22293, var12 + 5, 16777215);
                int var13 = var3 / 2 + 80;
                this.field435.method186(var12 - 20, var13 - 73, 412);
                this.field294.method16(true, "Cancel", var13, -22293, var12 + 5, 16777215);
            }
        }
        if (this.field353 == 3) {
            this.field294.method16(true, "Create a free account", var3 / 2, -22293, var4 / 2 - 60, 16776960);
            int var14 = var4 / 2 - 35;
            this.field294.method16(true, "To create a new account you need to", var3 / 2, -22293, var14, 16777215);
            int var19 = var14 + 15;
            this.field294.method16(true, "go back to the main RuneScape webpage", var3 / 2, -22293, var19, 16777215);
            int var20 = var19 + 15;
            this.field294.method16(true, "and choose the red 'create account'", var3 / 2, -22293, var20, 16777215);
            int var21 = var20 + 15;
            this.field294.method16(true, "button at the top right of that page.", var3 / 2, -22293, var21, 16777215);
            int var22 = var21 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field435.method186(var16 - 20, var15 - 73, 412);
            this.field294.method16(true, "Cancel", var15, -22293, var16 + 5, 16777215);
        }
        this.field208.method177(171, true, super.field804, 202);
        if (arg0) {
            for (int var17 = 1; var17 > 0; ++var17) {
            }
        }
        if (this.field423) {
            this.field423 = false;
            this.field206.method177(0, true, super.field804, 128);
            this.field207.method177(371, true, super.field804, 202);
            this.field211.method177(265, true, super.field804, 0);
            this.field212.method177(265, true, super.field804, 562);
            this.field213.method177(171, true, super.field804, 128);
            this.field214.method177(171, true, super.field804, 562);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXOUQUKZW;II)V")
    private final void method50(class62 arg0, int arg1, int arg2) {
        int var4 = arg0.method532(7, 8);
        if (arg2 == -33092) {
            if (var4 < this.field251) {
                for (int var5 = var4; var5 < this.field251; ++var5) {
                    this.field257[this.field256++] = this.field252[var5];
                }
            }
            if (var4 > this.field251) {
                signlink.reporterror(this.field400 + " Too many players");
                throw new RuntimeException("eek");
            } else {
                this.field251 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field252[var6];
                    class38 var8 = this.field250[var7];
                    int var9 = arg0.method532(7, 1);
                    if (var9 == 0) {
                        this.field252[this.field251++] = var7;
                        var8.field1329 = field487;
                    } else {
                        int var10 = arg0.method532(7, 2);
                        if (var10 == 0) {
                            this.field252[this.field251++] = var7;
                            var8.field1329 = field487;
                            this.field254[this.field253++] = var7;
                        } else if (var10 == 1) {
                            this.field252[this.field251++] = var7;
                            var8.field1329 = field487;
                            int var11 = arg0.method532(7, 3);
                            var8.method457(false, var11, (byte) -91);
                            int var12 = arg0.method532(7, 1);
                            if (var12 == 1) {
                                this.field254[this.field253++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field252[this.field251++] = var7;
                            var8.field1329 = field487;
                            int var13 = arg0.method532(7, 3);
                            var8.method457(true, var13, (byte) -91);
                            int var14 = arg0.method532(7, 3);
                            var8.method457(true, var14, (byte) -91);
                            int var15 = arg0.method532(7, 1);
                            if (var15 == 1) {
                                this.field254[this.field253++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field257[this.field256++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method51(byte arg0) {
        if (this.field246 == null) {
            this.method69(5);
            super.field805 = null;
            this.field206 = null;
            this.field207 = null;
            this.field208 = null;
            this.field209 = null;
            this.field210 = null;
            this.field211 = null;
            this.field212 = null;
            this.field213 = null;
            this.field214 = null;
            if (arg0 != 31) {
                this.field159.method511(100);
            }
            this.field246 = new class6(96, this.method140(9), (byte) 47, 479);
            this.field244 = new class6(156, this.method140(9), (byte) 47, 172);
            class29.method320(7);
            this.field286.method186(0, 0, 412);
            this.field243 = new class6(261, this.method140(9), (byte) 47, 190);
            this.field245 = new class6(334, this.method140(9), (byte) 47, 512);
            class29.method320(7);
            this.field479 = new class6(50, this.method140(9), (byte) 47, 496);
            this.field480 = new class6(37, this.method140(9), (byte) 47, 269);
            this.field481 = new class6(45, this.method140(9), (byte) 47, 249);
            this.field423 = true;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field807 != null) {
                    return new URL("http://127.0.0.1:" + (field189 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg1 & 2047;
        if (arg4 != -13210) {
            this.field272 = null;
        }
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (var8 != 0) {
            int var13 = class35.field1073[var8];
            int var14 = class35.field1074[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class35.field1073[var9];
            int var17 = class35.field1074[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field488 = arg6 - var10;
        this.field489 = arg0 - var11;
        this.field490 = arg2 - var12;
        this.field491 = arg5;
        this.field492 = arg1;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method53(byte arg0) {
        if (this.field206 == null) {
            super.field805 = null;
            this.field246 = null;
            this.field244 = null;
            this.field243 = null;
            this.field245 = null;
            this.field479 = null;
            this.field480 = null;
            this.field481 = null;
            this.field209 = new class6(265, this.method140(9), (byte) 47, 128);
            class29.method320(7);
            if (arg0 == 2) {
                boolean var2 = false;
            } else {
                this.method114();
            }
            this.field210 = new class6(265, this.method140(9), (byte) 47, 128);
            class29.method320(7);
            this.field206 = new class6(171, this.method140(9), (byte) 47, 509);
            class29.method320(7);
            this.field207 = new class6(132, this.method140(9), (byte) 47, 360);
            class29.method320(7);
            this.field208 = new class6(200, this.method140(9), (byte) 47, 360);
            class29.method320(7);
            this.field211 = new class6(238, this.method140(9), (byte) 47, 202);
            class29.method320(7);
            this.field212 = new class6(238, this.method140(9), (byte) 47, 203);
            class29.method320(7);
            this.field213 = new class6(94, this.method140(9), (byte) 47, 74);
            class29.method320(7);
            this.field214 = new class6(94, this.method140(9), (byte) 47, 75);
            class29.method320(7);
            if (this.field302 != null) {
                this.method103(717);
                this.method34(true);
            }
            this.field423 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILXOUQUKZW;)V")
    public final void method54(int arg0, int arg1, class62 arg2) {
        if (this.field284 == arg0) {
            if (arg1 == 112) {
                int var4 = arg2.method539(319);
                int var5 = (var4 >> 4 & 7) + this.field289;
                int var6 = (var4 & 7) + this.field290;
                int var7 = arg2.method521();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field343[var8];
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    this.method106(var6, 0, var9, 0, var5, var10, var8, -1, -1, this.field123);
                }
            } else if (arg1 == 247) {
                int var11 = arg2.method548(false);
                int var12 = arg2.method540(695);
                int var13 = (var12 >> 4 & 7) + this.field289;
                int var14 = (var12 & 7) + this.field290;
                int var15 = arg2.method540(695);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = this.field343[var16];
                if (var13 >= 0 && var14 >= 0 && var13 < 103 && var14 < 103) {
                    int var19 = this.field358[this.field123][var13][var14];
                    int var20 = this.field358[this.field123][var13 + 1][var14];
                    int var21 = this.field358[this.field123][var13 + 1][var14 + 1];
                    int var22 = this.field358[this.field123][var13][var14 + 1];
                    if (var18 == 0) {
                        class19 var23 = this.field397.method255(var14, (byte) 9, var13, this.field123);
                        if (var23 != null) {
                            int var24 = var23.field688 >> 14 & 32767;
                            if (var16 == 2) {
                                var23.field686 = new class39(var17 + 4, var24, 2, var11, var20, var19, false, 923, var22, var21);
                                var23.field687 = new class39(var17 + 1 & 3, var24, 2, var11, var20, var19, false, 923, var22, var21);
                            } else {
                                var23.field686 = new class39(var17, var24, var16, var11, var20, var19, false, 923, var22, var21);
                            }
                        }
                    }
                    if (var18 == 1) {
                        class58 var25 = this.field397.method256(var14, var13, this.field123, 108);
                        if (var25 != null) {
                            var25.field1540 = new class39(0, var25.field1541 >> 14 & 32767, 4, var11, var20, var19, false, 923, var22, var21);
                        }
                    }
                    if (var18 == 2) {
                        class49 var26 = this.field397.method257(this.field123, var13, this.field448, var14);
                        if (var16 == 11) {
                            var16 = 10;
                        }
                        if (var26 != null) {
                            var26.field1308 = new class39(var17, var26.field1316 >> 14 & 32767, var16, var11, var20, var19, false, 923, var22, var21);
                        }
                    }
                    if (var18 == 3) {
                        class34 var27 = this.field397.method258(var14, this.field123, -42705, var13);
                        if (var27 != null) {
                            var27.field995 = new class39(var17, var27.field996 >> 14 & 32767, 22, var11, var20, var19, false, 923, var22, var21);
                        }
                    }
                }
            } else if (arg1 == 149) {
                int var28 = arg2.method540(695);
                int var29 = (var28 >> 4 & 7) + this.field289;
                int var30 = (var28 & 7) + this.field290;
                int var31 = arg2.method550(-397);
                if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                    class31 var32 = this.field272[this.field123][var29][var30];
                    if (var32 != null) {
                        for (class65 var33 = (class65) var32.method332(); var33 != null; var33 = (class65) var32.method334(-96)) {
                            if ((var31 & 32767) == var33.field1618) {
                                var33.method471();
                                break;
                            }
                        }
                        if (var32.method332() == null) {
                            this.field272[this.field123][var29][var30] = null;
                        }
                        this.method136(var29, var30);
                    }
                }
            } else {
                if (arg1 == 57) {
                    int var34 = arg2.method549(0);
                    int var35 = arg2.method550(-397);
                    int var36 = arg2.method539(319);
                    int var37 = var36 >> 2;
                    int var38 = var36 & 3;
                    int var39 = this.field343[var37];
                    int var40 = arg2.method523();
                    byte var41 = arg2.method543((byte) 87);
                    byte var42 = arg2.method522();
                    int var43 = arg2.method539(319);
                    int var44 = (var43 >> 4 & 7) + this.field289;
                    int var45 = (var43 & 7) + this.field290;
                    byte var46 = arg2.method522();
                    int var47 = arg2.method523();
                    byte var48 = arg2.method544(true);
                    class38 var49;
                    if (this.field85 == var40) {
                        var49 = field113;
                    } else {
                        var49 = this.field250[var40];
                    }
                    if (var49 != null) {
                        class53 var50 = class53.method464(var35);
                        int var51 = this.field358[this.field123][var44][var45];
                        int var52 = this.field358[this.field123][var44 + 1][var45];
                        int var53 = this.field358[this.field123][var44 + 1][var45 + 1];
                        int var54 = this.field358[this.field123][var44][var45 + 1];
                        class35 var55 = var50.method470(var37, var38, var51, var52, var53, var54, -1);
                        if (var55 != null) {
                            this.method106(var45, var47 + 1, 0, 0, var44, var39, 0, -1, var34 + 1, this.field123);
                            var49.field1093 = field487 + var47;
                            var49.field1094 = field487 + var34;
                            var49.field1107 = var55;
                            int var56 = var50.field1421;
                            int var57 = var50.field1457;
                            if (var38 == 1 || var38 == 3) {
                                var56 = var50.field1457;
                                var57 = var50.field1421;
                            }
                            var49.field1104 = var44 * 128 + var56 * 64;
                            var49.field1106 = var45 * 128 + var57 * 64;
                            var49.field1105 = this.method119(this.field123, var49.field1106, var49.field1104, 4);
                            if (var48 > var46) {
                                byte var58 = var48;
                                var48 = var46;
                                var46 = var58;
                            }
                            if (var41 > var42) {
                                byte var59 = var41;
                                var41 = var42;
                                var42 = var59;
                            }
                            var49.field1099 = var44 + var48;
                            var49.field1101 = var44 + var46;
                            var49.field1100 = var41 + var45;
                            var49.field1102 = var42 + var45;
                        }
                    }
                }
                if (arg1 == 88) {
                    int var60 = arg2.method540(695);
                    int var61 = (var60 >> 4 & 7) + this.field289;
                    int var62 = (var60 & 7) + this.field290;
                    int var63 = arg2.method548(false);
                    int var64 = arg2.method521();
                    int var65 = var64 >> 2;
                    int var66 = var64 & 3;
                    int var67 = this.field343[var65];
                    if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                        this.method106(var62, 0, var66, 0, var61, var67, var65, var63, -1, this.field123);
                    }
                } else {
                    if (arg1 == 42) {
                        int var68 = arg2.method521();
                        int var69 = (var68 >> 4 & 7) + this.field289;
                        int var70 = (var68 & 7) + this.field290;
                        int var71 = arg2.method523();
                        int var72 = arg2.method521();
                        int var73 = var72 >> 4 & 15;
                        int var74 = var72 & 7;
                        if (field113.field1362[0] >= var69 - var73 && field113.field1362[0] <= var69 + var73 && field113.field1363[0] >= var70 - var73 && field113.field1363[0] <= var70 + var73 && this.field497 && !field191 && this.field118 < 50) {
                            this.field184[this.field118] = var71;
                            this.field222[this.field118] = var74;
                            this.field275[this.field118] = class72.field1708[var71];
                            ++this.field118;
                        }
                    }
                    if (arg1 == 6) {
                        int var75 = arg2.method549(0);
                        int var76 = arg2.method523();
                        int var77 = arg2.method521();
                        int var78 = (var77 >> 4 & 7) + this.field289;
                        int var79 = (var77 & 7) + this.field290;
                        if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                            class65 var80 = new class65();
                            var80.field1618 = var75;
                            var80.field1619 = var76;
                            if (this.field272[this.field123][var78][var79] == null) {
                                this.field272[this.field123][var78][var79] = new class31(-33684);
                            }
                            this.field272[this.field123][var78][var79].method329(var80);
                            this.method136(var78, var79);
                        }
                    } else if (arg1 != 210) {
                        if (arg1 == 143) {
                            int var89 = arg2.method521();
                            int var90 = (var89 >> 4 & 7) + this.field289;
                            int var91 = (var89 & 7) + this.field290;
                            int var92 = arg2.method523();
                            int var93 = arg2.method521();
                            int var94 = arg2.method523();
                            if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                                int var95 = var90 * 128 + 64;
                                int var96 = var91 * 128 + 64;
                                class28 var97 = new class28(var95, var92, var96, this.method119(this.field123, var96, var95, 4) - var93, field487, var94, this.field123, this.field417);
                                this.field288.method329(var97);
                            }
                        } else if (arg1 == 156) {
                            int var98 = arg2.method541((byte) 13);
                            int var99 = (var98 >> 4 & 7) + this.field289;
                            int var100 = (var98 & 7) + this.field290;
                            int var101 = arg2.method523();
                            int var102 = arg2.method523();
                            int var103 = arg2.method549(0);
                            if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104 && this.field85 != var103) {
                                class65 var104 = new class65();
                                var104.field1618 = var102;
                                var104.field1619 = var101;
                                if (this.field272[this.field123][var99][var100] == null) {
                                    this.field272[this.field123][var99][var100] = new class31(-33684);
                                }
                                this.field272[this.field123][var99][var100].method329(var104);
                                this.method136(var99, var100);
                            }
                        } else if (arg1 == 75) {
                            int var105 = arg2.method521();
                            int var106 = (var105 >> 4 & 7) + this.field289;
                            int var107 = (var105 & 7) + this.field290;
                            int var108 = var106 + arg2.method522();
                            int var109 = var107 + arg2.method522();
                            int var110 = arg2.method524();
                            int var111 = arg2.method523();
                            int var112 = arg2.method521() * 4;
                            int var113 = arg2.method521() * 4;
                            int var114 = arg2.method523();
                            int var115 = arg2.method523();
                            int var116 = arg2.method521();
                            int var117 = arg2.method521();
                            if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104 && var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var111 != 65535) {
                                int var118 = var106 * 128 + 64;
                                int var119 = var107 * 128 + 64;
                                int var120 = var108 * 128 + 64;
                                int var121 = var109 * 128 + 64;
                                class52 var122 = new class52(field487 + var114, this.field123, var118, this.method119(this.field123, var119, var118, 4) - var112, -676, var111, var113, var116, field487 + var115, var110, var117, var119);
                                var122.method458(var120, var121, this.method119(this.field123, var121, var120, 4) - var113, field487 + var114, -17407);
                                this.field70.method329(var122);
                            }
                        }
                    } else {
                        int var81 = arg2.method521();
                        int var82 = (var81 >> 4 & 7) + this.field289;
                        int var83 = (var81 & 7) + this.field290;
                        int var84 = arg2.method523();
                        int var85 = arg2.method523();
                        int var86 = arg2.method523();
                        if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                            class31 var87 = this.field272[this.field123][var82][var83];
                            if (var87 != null) {
                                for (class65 var88 = (class65) var87.method332(); var88 != null; var88 = (class65) var87.method334(-96)) {
                                    if ((var84 & 32767) == var88.field1618 && var88.field1619 == var85) {
                                        var88.field1619 = var86;
                                        break;
                                    }
                                }
                                this.method136(var82, var83);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 316);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field188 = Integer.parseInt(arg0[0]);
                field189 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method71(true);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method120(0);
                }
                if (arg0[3].equals("free")) {
                    field190 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field190 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method284(503, false, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLPFVGIFDY;)I")
    public final int method55(int arg0, boolean arg1, class48 arg2) {
        if (arg1) {
            this.field451 = this.field105.method405();
        }
        if (arg2.field1300 != null && arg0 < arg2.field1300.length) {
            try {
                int[] var4 = arg2.field1300[arg0];
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
                        var9 = this.field82[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field278[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field354[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class48 var11 = class48.field1246[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class24.field849 && (!class24.method293(var12).field874 || field190)) {
                            for (int var13 = 0; var13 < var11.field1272.length; ++var13) {
                                if (var12 + 1 == var11.field1272[var13]) {
                                    var9 += var11.field1268[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field389[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field134[this.field278[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field389[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field113.field1108;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class56.field1520; ++var14) {
                            if (class56.field1522[var14]) {
                                var9 += this.field278[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class48 var15 = class48.field1246[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class24.field849 && (!class24.method293(var16).field874 || field190)) {
                            for (int var17 = 0; var17 < var15.field1272.length; ++var17) {
                                if (var15.field1272[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field146;
                    }
                    if (var8 == 12) {
                        var9 = this.field326;
                    }
                    if (var8 == 13) {
                        int var18 = this.field389[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class59 var21 = class59.field1545[var20];
                        int var22 = var21.field1547;
                        int var23 = var21.field1548;
                        int var24 = var21.field1549;
                        int var25 = field433[var24 - var23];
                        var9 = this.field389[var22] >> var23 & var25;
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
                        var9 = (field113.field1326 >> 7) + this.field217;
                    }
                    if (var8 == 19) {
                        var9 = (field113.field1327 >> 7) + this.field218;
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

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)I")
    public final int method56(int arg0) {
        this.field530 += arg0;
        int var2 = 3;
        if (this.field491 < 310) {
            ++field502;
            if (field502 > 55) {
                field502 = 0;
                this.field159.method510(76, -266);
            }
            int var3 = this.field488 >> 7;
            int var4 = this.field490 >> 7;
            int var5 = field113.field1326 >> 7;
            int var6 = field113.field1327 >> 7;
            if ((this.field506[this.field123][var3][var4] & 4) != 0) {
                var2 = this.field123;
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
                    if ((this.field506[this.field123][var3][var4] & 4) != 0) {
                        var2 = this.field123;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field506[this.field123][var3][var4] & 4) != 0) {
                            var2 = this.field123;
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
                    if ((this.field506[this.field123][var3][var4] & 4) != 0) {
                        var2 = this.field123;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field506[this.field123][var3][var4] & 4) != 0) {
                            var2 = this.field123;
                        }
                    }
                }
            }
        }
        if ((this.field506[this.field123][field113.field1326 >> 7][field113.field1327 >> 7] & 4) != 0) {
            var2 = this.field123;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)I")
    public final int method57(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field204 = this.field105.method405();
        }
        int var3 = this.method119(this.field123, this.field490, this.field488, 4);
        return var3 - this.field489 < 800 && (this.field506[this.field123][this.field488 >> 7][this.field490 >> 7] & 4) != 0 ? this.field123 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method58(boolean arg0, int arg1) {
        while (arg1 >= 0) {
            this.method114();
        }
        for (int var3 = 0; var3 < this.field226; ++var3) {
            class3 var4 = this.field225[this.field227[var3]];
            int var5 = (this.field227[var3] << 14) + 536870912;
            if (var4 != null && var4.method12(this.field145) && var4.field41.field925 == arg0) {
                int var6 = var4.field1326 >> 7;
                int var7 = var4.field1327 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1368 == 1 && (var4.field1326 & 127) == 64 && (var4.field1327 & 127) == 64) {
                        if (this.field314[var6][var7] == this.field403) {
                            continue;
                        }
                        this.field314[var6][var7] = this.field403;
                    }
                    if (!var4.field41.field905) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field397.method244(var4.field1328, var4, var5, var4.field1326, 0, var4.field1327, var4.field1341, this.method119(this.field123, var4.field1327, var4.field1326, 4), (var4.field1368 - 1) * 64 + 60, this.field123);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method59(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field415[var5] != null) {
                int var6 = this.field413[var5];
                int var7 = 70 - var4 * 14 + this.field522 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field414[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field203 == 0 || this.field203 == 1 && this.method161(var8, (byte) -125))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field113.field1114)) {
                        if (this.field316 >= 1) {
                            this.field149[this.field477] = "Report abuse @whi@" + var8;
                            this.field509[this.field477] = 423;
                            ++this.field477;
                        }
                        this.field149[this.field477] = "Add ignore @whi@" + var8;
                        this.field509[this.field477] = 400;
                        ++this.field477;
                        this.field149[this.field477] = "Add friend @whi@" + var8;
                        this.field509[this.field477] = 290;
                        ++this.field477;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field150 == 0 && (var6 == 7 || this.field475 == 0 || this.field475 == 1 && this.method161(var8, (byte) -125))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field316 >= 1) {
                            this.field149[this.field477] = "Report abuse @whi@" + var8;
                            this.field509[this.field477] = 423;
                            ++this.field477;
                        }
                        this.field149[this.field477] = "Add ignore @whi@" + var8;
                        this.field509[this.field477] = 400;
                        ++this.field477;
                        this.field149[this.field477] = "Add friend @whi@" + var8;
                        this.field509[this.field477] = 290;
                        ++this.field477;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field187 == 0 || this.field187 == 1 && this.method161(var8, (byte) -125))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field149[this.field477] = "Accept trade @whi@" + var8;
                        this.field509[this.field477] = 18;
                        ++this.field477;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field150 == 0 && this.field475 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field187 == 0 || this.field187 == 1 && this.method161(var8, (byte) -125))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field149[this.field477] = "Accept challenge @whi@" + var8;
                        this.field509[this.field477] = 188;
                        ++this.field477;
                    }
                    ++var4;
                }
            }
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method60(int arg0, byte arg1) {
        if (arg1 != 26) {
            this.field159.method511(137);
        }
        if (!field191) {
            if (class47.field1236[17] >= arg0) {
                class10 var3 = class47.field1230[17];
                int var4 = var3.field598 * var3.field597 - 1;
                int var5 = this.field542 * var3.field597 * 2;
                byte[] var6 = var3.field595;
                byte[] var7 = this.field425;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field595 = var7;
                this.field425 = var6;
                class47.method438(this.field279, 17);
            }
            if (class47.field1236[24] >= arg0) {
                class10 var9 = class47.field1230[24];
                int var10 = var9.field598 * var9.field597 - 1;
                int var11 = this.field542 * var9.field597 * 2;
                byte[] var12 = var9.field595;
                byte[] var13 = this.field425;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field595 = var13;
                this.field425 = var12;
                class47.method438(this.field279, 24);
                ++field258;
                if (field258 > 1462) {
                    field258 = 0;
                    this.field159.method510(120, -266);
                    this.field159.method511(0);
                    int var15 = this.field159.field1579;
                    this.field159.method511((int) (Math.random() * 256.0D));
                    this.field159.method511((int) (Math.random() * 256.0D));
                    this.field159.method512(17174);
                    this.field159.method511(95);
                    this.field159.method511(72);
                    this.field159.method511(178);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field159.method512(29524);
                    }
                    this.field159.method512(49542);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field159.method512(64751);
                    }
                    this.field159.method511(189);
                    this.field159.method520(this.field159.field1579 - var15, -31558);
                }
            }
            if (class47.field1236[34] >= arg0) {
                class10 var16 = class47.field1230[34];
                int var17 = var16.field598 * var16.field597 - 1;
                int var18 = this.field542 * var16.field597 * 2;
                byte[] var19 = var16.field595;
                byte[] var20 = this.field425;
                for (int var21 = 0; var21 <= var17; ++var21) {
                    var20[var21] = var19[var21 - var18 & var17];
                }
                var16.field595 = var20;
                this.field425 = var19;
                class47.method438(this.field279, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        if (this.field233 == 0) {
            this.field149[0] = "Cancel";
            this.field509[0] = 1352;
            this.field477 = 1;
            if (!arg0) {
                this.field159.method511(212);
            }
            this.method39((byte) -58);
            this.field318 = 0;
            if (super.field812 > 4 && super.field813 > 4 && super.field812 < 516 && super.field813 < 338) {
                if (this.field450 != -1) {
                    this.method149(4, class48.field1246[this.field450], super.field813, 0, 4, super.field812, this.field359);
                } else {
                    this.method169(175);
                }
            }
            if (this.field318 != this.field111) {
                this.field111 = this.field318;
            }
            this.field318 = 0;
            if (super.field812 > 553 && super.field813 > 205 && super.field812 < 743 && super.field813 < 466) {
                if (this.field437 != -1) {
                    this.method149(553, class48.field1246[this.field437], super.field813, 0, 205, super.field812, this.field359);
                } else if (this.field95[this.field380] != -1) {
                    this.method149(553, class48.field1246[this.field95[this.field380]], super.field813, 0, 205, super.field812, this.field359);
                }
            }
            if (this.field318 != this.field274) {
                this.field493 = true;
                this.field274 = this.field318;
            }
            this.field318 = 0;
            if (super.field812 > 17 && super.field813 > 357 && super.field812 < 496 && super.field813 < 453) {
                if (this.field341 != -1) {
                    this.method149(17, class48.field1246[this.field341], super.field813, 0, 357, super.field812, this.field359);
                } else if (super.field813 < 434 && super.field812 < 426) {
                    this.method59(this.field427, super.field812 - 17, super.field813 - 357);
                }
            }
            if (this.field341 != -1 && this.field318 != this.field173) {
                this.field228 = true;
                this.field173 = this.field318;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field477 - 1; ++var3) {
                    if (this.field509[var3] < 1000 && this.field509[var3 + 1] > 1000) {
                        String var4 = this.field149[var3];
                        this.field149[var3] = this.field149[var3 + 1];
                        this.field149[var3 + 1] = var4;
                        int var5 = this.field509[var3];
                        this.field509[var3] = this.field509[var3 + 1];
                        this.field509[var3 + 1] = var5;
                        int var6 = this.field507[var3];
                        this.field507[var3] = this.field507[var3 + 1];
                        this.field507[var3 + 1] = var6;
                        int var7 = this.field508[var3];
                        this.field508[var3] = this.field508[var3 + 1];
                        this.field508[var3 + 1] = var7;
                        int var8 = this.field510[var3];
                        this.field510[var3] = this.field510[var3 + 1];
                        this.field510[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method62(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field241 >= 100) {
                this.method100("", 0, 14378, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class67.method567(-550, class67.method564(arg1, true));
                for (int var5 = 0; var5 < this.field241; ++var5) {
                    if (this.field69[var5] == arg1) {
                        this.method100("", 0, 14378, var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field200; ++var6) {
                    if (this.field378[var6] == arg1) {
                        this.method100("", 0, 14378, "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field69[this.field241++] = arg1;
                this.field493 = true;
                this.field159.method510(118, -266);
                if (arg0 != -13) {
                    this.field531 = -1;
                }
                this.field159.method517(arg1, this.field141);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method63(int arg0) {
        this.field243.method176(-179);
        if (arg0 <= 0) {
            this.field531 = this.field374.method521();
        }
        class47.field1228 = this.field512;
        this.field285.method186(0, 0, 412);
        if (this.field437 != -1) {
            this.method128(0, this.field500, 0, class48.field1246[this.field437], 0);
        } else if (this.field95[this.field380] != -1) {
            this.method128(0, this.field500, 0, class48.field1246[this.field95[this.field380]], 0);
        }
        if (this.field395 && this.field460 == 1) {
            this.method70(false);
        }
        this.field243.method177(205, true, super.field804, 553);
        this.field245.method176(-179);
        class47.field1228 = this.field513;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method64(byte arg0) {
        if (arg0 != 7) {
            this.field183 = !this.field183;
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXOUQUKZW;IB)V")
    private final void method65(class62 arg0, int arg1, byte arg2) {
        this.field256 = 0;
        this.field253 = 0;
        this.method88(arg0, arg1, -322);
        this.method50(arg0, arg1, -33092);
        this.method166(arg1, (byte) 8, arg0);
        this.method148(46524, arg0, arg1);
        for (int var4 = 0; var4 < this.field256; ++var4) {
            int var7 = this.field257[var4];
            if (field487 != this.field250[var7].field1329) {
                this.field250[var7] = null;
            }
        }
        if (arg2 != 2) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (arg0.field1579 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1579 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field251; ++var6) {
                if (this.field250[this.field252[var6]] == null) {
                    signlink.reporterror(this.field400 + " null entry in pl list - pos:" + var6 + " size:" + this.field251);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method66(byte arg0) {
        for (int var2 = -1; var2 < this.field251; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field249;
            } else {
                var3 = this.field252[var2];
            }
            class38 var4 = this.field250[var3];
            if (var4 != null) {
                this.method77(var4, 39142, 1);
            }
        }
        if (arg0 != -104) {
            this.field531 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)LCVNWKEAW;")
    public final class7 method67(String arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field230[0] != null) {
                var7 = this.field230[0].method559((byte) 5, arg2);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field517.reset();
            this.field517.update(var7);
            int var9 = (int) this.field517.getValue();
            if (arg3 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class7(0, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method110("Requesting " + arg0, arg5, (byte) -27);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method162(arg4 + arg3);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class62 var17 = new class62(-417, var16);
                    var17.field1579 = 3;
                    int var18 = var17.method525() + 6;
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
                            this.method110("Loading " + arg0 + " - " + var23 + "%", arg5, (byte) -27);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field230[0] != null) {
                            this.field230[0].method560(var7.length, var7, arg2, -356);
                        }
                    } catch (Exception var29) {
                        this.field230[0] = null;
                    }
                    if (var7 != null) {
                        this.field517.reset();
                        this.field517.update(var7);
                        int var24 = (int) this.field517.getValue();
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
                            this.method110("Game updated - please reload page", arg5, (byte) -27);
                            var26 = 10;
                        } else {
                            this.method110(var12 + " - Retrying in " + var26, arg5, (byte) -27);
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
                    this.field371 = !this.field371;
                }
            }
            class7 var27 = new class7(0, var7);
            if (arg1 < 6 || arg1 > 6) {
                this.field531 = -1;
            }
            return var27;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method68(byte arg0) {
        if (arg0 != 2) {
            this.method114();
        }
        this.field423 = true;
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method69(int arg0) {
        this.field152 = false;
        while (this.field122) {
            this.field152 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field434 = null;
        this.field435 = null;
        this.field81 = null;
        if (arg0 < 5 || arg0 > 5) {
            this.method114();
        }
        this.field280 = null;
        this.field281 = null;
        this.field282 = null;
        this.field283 = null;
        this.field267 = null;
        this.field268 = null;
        this.field520 = null;
        this.field521 = null;
        this.field473 = null;
        this.field474 = null;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method70(boolean arg0) {
        int var2 = this.field461;
        int var3 = this.field462;
        int var4 = this.field463;
        int var5 = this.field464;
        int var6 = 6116423;
        class29.method322((byte) -37, var3, var2, var6, var4, var5);
        class29.method322((byte) -37, var3 + 1, var2 + 1, 0, var4 - 2, 16);
        class29.method323(var4 - 2, 0, var3 + 18, var2 + 1, (byte) 87, var5 - 19);
        this.field294.method19("Choose Option", var6, var3 + 14, var2 + 3, 6972);
        int var7 = super.field812;
        int var8 = super.field813;
        if (arg0) {
            this.field159.method511(114);
        }
        if (this.field460 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field460 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field460 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field477; ++var9) {
            int var10 = (this.field477 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field294.method23(var2 + 3, var10, this.field149[var9], true, var11, true);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public static final void method71(boolean arg0) {
        class22.field728 = true;
        class47.field1217 = true;
        field191 = true;
        class11.field633 = true;
        if (!arg0) {
            field151 = -267;
        }
        class53.field1443 = true;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method72(boolean arg0) {
        if (arg0) {
            this.field125 = -447;
        }
        if (this.field296 == 2) {
            this.method173(8, (this.field194 - this.field218 << 7) + this.field197, (this.field193 - this.field217 << 7) + this.field196, this.field195 * 2);
            if (this.field430 > -1 && field487 % 20 < 10) {
                this.field499[2].method499(this.field431 - 28, this.field430 - 12, 412);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method73(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field200; ++var4) {
                if (this.field378[var4] == arg0) {
                    --this.field200;
                    this.field493 = true;
                    for (int var5 = var4; var5 < this.field200; ++var5) {
                        this.field260[var5] = this.field260[var5 + 1];
                        this.field116[var5] = this.field116[var5 + 1];
                        this.field378[var5] = this.field378[var5 + 1];
                    }
                    this.field159.method510(38, -266);
                    this.field159.method517(arg0, this.field141);
                    break;
                }
            }
            this.field530 += arg1;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    private final void method74(boolean arg0) {
        this.field179 &= arg0;
        if (this.field291 == 2) {
            for (class32 var2 = (class32) this.field344.method332(); var2 != null; var2 = (class32) this.field344.method334(-96)) {
                if (var2.field969 > 0) {
                    --var2.field969;
                }
                if (var2.field969 == 0) {
                    if (var2.field961 < 0 || class11.method202(-26485, var2.field963, var2.field961)) {
                        this.method95(var2.field967, var2.field962, var2.field963, var2.field966, var2.field968, var2.field965, -256, var2.field961);
                        var2.method471();
                    }
                } else {
                    if (var2.field964 > 0) {
                        --var2.field964;
                    }
                    if (var2.field964 == 0 && var2.field967 >= 1 && var2.field968 >= 1 && var2.field967 <= 102 && var2.field968 <= 102 && (var2.field970 < 0 || class11.method202(-26485, var2.field972, var2.field970))) {
                        this.method95(var2.field967, var2.field971, var2.field972, var2.field966, var2.field968, var2.field965, -256, var2.field970);
                        var2.field964 = -1;
                        if (var2.field970 == var2.field961 && var2.field961 == -1) {
                            var2.method471();
                        } else if (var2.field970 == var2.field961 && var2.field971 == var2.field962 && var2.field972 == var2.field963) {
                            var2.method471();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method75(int arg0) {
        if (this.field535 > 1) {
            --this.field535;
        }
        if (this.field534 > 0) {
            --this.field534;
        }
        for (int var2 = 0; var2 < 5 && this.method37(-141); ++var2) {
        }
        if (this.field179) {
            Object var3 = this.field325.field1136;
            synchronized (this.field325.field1136) {
                if (!field242) {
                    this.field325.field1137 = 0;
                } else if (super.field818 != 0 || this.field325.field1137 >= 40) {
                    this.field159.method510(30, -266);
                    this.field159.method511(0);
                    int var4 = this.field159.field1579;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field325.field1137 && var4 - this.field159.field1579 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field325.field1134[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field325.field1138[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field325.field1134[var6] == -1 && this.field325.field1138[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field175 == var8 && this.field176 == var7) {
                            if (this.field99 < 2047) {
                                ++this.field99;
                            }
                        } else {
                            int var10 = var8 - this.field175;
                            this.field175 = var8;
                            int var11 = var7 - this.field176;
                            this.field176 = var7;
                            if (this.field99 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field159.method512((this.field99 << 12) + (var10 << 6) + var11);
                                this.field99 = 0;
                            } else if (this.field99 < 8) {
                                this.field159.method514((this.field99 << 19) + 8388608 + var9);
                                this.field99 = 0;
                            } else {
                                this.field159.method515((this.field99 << 19) + -1073741824 + var9);
                                this.field99 = 0;
                            }
                        }
                    }
                    this.field159.method520(this.field159.field1579 - var4, -31558);
                    if (var5 >= this.field325.field1137) {
                        this.field325.field1137 = 0;
                    } else {
                        this.field325.field1137 -= var5;
                        for (int var12 = 0; var12 < this.field325.field1137; ++var12) {
                            this.field325.field1138[var12] = this.field325.field1138[var5 + var12];
                            this.field325.field1134[var12] = this.field325.field1134[var5 + var12];
                        }
                    }
                }
            }
            if (super.field818 != 0) {
                long var13 = (super.field821 - this.field529) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field529 = super.field821;
                int var15 = super.field820;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field819;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field818 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field159.method510(168, -266);
                this.field159.method553((var18 << 19) + (var19 << 20) + var17, true);
            }
            if (this.field454 > 0) {
                --this.field454;
            }
            if (super.field822[1] == 1 || super.field822[2] == 1 || super.field822[3] == 1 || super.field822[4] == 1) {
                this.field455 = true;
            }
            if (this.field455 && this.field454 <= 0) {
                this.field454 = 20;
                this.field455 = false;
                this.field159.method510(65, -266);
                this.field159.method546(0, this.field73);
                this.field159.method545(this.field74, false);
            }
            if (super.field809 && !this.field178) {
                this.field178 = true;
                this.field159.method510(108, -266);
                this.field159.method511(1);
            }
            if (!super.field809 && this.field178) {
                this.field178 = false;
                this.field159.method510(108, -266);
                this.field159.method511(0);
            }
            this.method104(-26);
            this.method74(true);
            this.method98(0);
            ++this.field532;
            if (this.field532 > 750) {
                this.method118((byte) 21);
            }
            this.method66((byte) -104);
            this.method76(5);
            this.method152(-452);
            ++this.field542;
            if (this.field539 != 0) {
                this.field538 += 20;
                if (this.field538 >= 400) {
                    this.field539 = 0;
                }
            }
            if (this.field323 != 0) {
                ++this.field320;
                if (this.field320 >= 15) {
                    if (this.field323 == 2) {
                        this.field493 = true;
                    }
                    if (this.field323 == 3) {
                        this.field228 = true;
                    }
                    this.field323 = 0;
                }
            }
            if (this.field233 != 0) {
                ++this.field329;
                if (super.field812 > this.field234 + 5 || super.field812 < this.field234 - 5 || super.field813 > this.field235 + 5 || super.field813 < this.field235 - 5) {
                    this.field127 = true;
                }
                if (super.field811 == 0) {
                    if (this.field233 == 2) {
                        this.field493 = true;
                    }
                    if (this.field233 == 3) {
                        this.field228 = true;
                    }
                    this.field233 = 0;
                    if (this.field127 && this.field329 >= 5) {
                        this.field199 = -1;
                        this.method61(true);
                        if (this.field231 == this.field199 && this.field232 != this.field198) {
                            class48 var20 = class48.field1246[this.field231];
                            byte var21 = 0;
                            if (this.field117 == 1 && var20.field1262 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1272[this.field198] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1278) {
                                int var22 = this.field232;
                                int var23 = this.field198;
                                var20.field1272[var23] = var20.field1272[var22];
                                var20.field1268[var23] = var20.field1268[var22];
                                var20.field1272[var22] = -1;
                                var20.field1268[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field232;
                                int var25 = this.field198;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method448(var24 - 1, -30, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method448(var24 + 1, -30, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method448(this.field198, -30, this.field232);
                            }
                            this.field159.method510(85, -266);
                            this.field159.method545(this.field198, false);
                            this.field159.method512(this.field231);
                            this.field159.method511(var21);
                            this.field159.method546(0, this.field232);
                        }
                    } else if ((this.field501 == 1 || this.method122(this.field477 - 1, 46867)) && this.field477 > 2) {
                        this.method42(7);
                    } else if (this.field477 > 0) {
                        this.method164(this.field477 - 1, (byte) -39);
                    }
                    this.field320 = 10;
                    super.field818 = 0;
                }
            }
            if (class22.field762 != -1) {
                int var26 = class22.field762;
                int var27 = class22.field763;
                boolean var28 = this.method126(0, var27, 0, 0, field113.field1362[0], 0, var26, false, true, field113.field1363[0], 0, 0);
                class22.field762 = -1;
                if (var28) {
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 1;
                    this.field538 = 0;
                }
            }
            if (super.field818 == 1 && this.field476 != null) {
                this.field476 = null;
                this.field228 = true;
                super.field818 = 0;
            }
            this.method150(-328);
            this.method127((byte) 0);
            this.method163(653);
            this.method44(this.field376);
            if (super.field811 == 1 || super.field818 == 1) {
                ++this.field128;
            }
            if (this.field291 == 2) {
                this.method48(-40379);
            }
            if (this.field291 == 2 && this.field444) {
                this.method89(false);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field404[var29]++;
            }
            this.method159(0);
            ++super.field810;
            if (super.field810 > 4500) {
                this.field534 = 250;
                super.field810 -= 500;
                this.field159.method510(173, -266);
            }
            ++this.field518;
            if (arg0 != 0) {
                this.field272 = null;
            }
            if (this.field518 > 500) {
                this.field518 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field540 += this.field541;
                }
                if ((var30 & 2) == 2) {
                    this.field428 += this.field429;
                }
                if ((var30 & 4) == 4) {
                    this.field312 += this.field313;
                }
            }
            if (this.field540 < -50) {
                this.field541 = 2;
            }
            if (this.field540 > 50) {
                this.field541 = -2;
            }
            if (this.field428 < -55) {
                this.field429 = 2;
            }
            if (this.field428 > 55) {
                this.field429 = -2;
            }
            if (this.field312 < -40) {
                this.field313 = 1;
            }
            if (this.field312 > 40) {
                this.field313 = -1;
            }
            ++this.field422;
            if (this.field422 > 500) {
                this.field422 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field523 += this.field524;
                }
                if ((var31 & 2) == 2) {
                    this.field236 += this.field237;
                }
            }
            if (this.field523 < -60) {
                this.field524 = 2;
            }
            if (this.field523 > 60) {
                this.field524 = -2;
            }
            if (this.field236 < -20) {
                this.field237 = 1;
            }
            if (this.field236 > 10) {
                this.field237 = -1;
            }
            ++this.field533;
            if (this.field533 > 50) {
                this.field159.method510(134, -266);
            }
            try {
                if (this.field309 != null && this.field159.field1579 > 0) {
                    this.field309.method5(-33359, this.field159.field1578, 0, this.field159.field1579);
                    this.field159.field1579 = 0;
                    this.field533 = 0;
                }
            } catch (IOException var33) {
                this.method118((byte) 21);
            } catch (Exception var34) {
                this.method96(20701);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method76(int arg0) {
        for (int var2 = 0; var2 < this.field226; ++var2) {
            int var3 = this.field227[var2];
            class3 var4 = this.field225[var3];
            if (var4 != null) {
                this.method77(var4, 39142, var4.field41.field916);
            }
        }
        if (arg0 < 5 || arg0 > 5) {
            this.field159.method511(220);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LQMQRUGDN;II)V")
    public final void method77(class50 arg0, int arg1, int arg2) {
        if (arg1 != 39142) {
            this.field531 = -1;
        }
        if (arg0.field1326 < 128 || arg0.field1327 < 128 || arg0.field1326 >= 13184 || arg0.field1327 >= 13184) {
            arg0.field1319 = -1;
            arg0.field1336 = -1;
            arg0.field1359 = 0;
            arg0.field1360 = 0;
            arg0.field1326 = arg0.field1362[0] * 128 + arg0.field1368 * 64;
            arg0.field1327 = arg0.field1363[0] * 128 + arg0.field1368 * 64;
            arg0.method456((byte) 109);
        }
        if (field113 == arg0 && (arg0.field1326 < 1536 || arg0.field1327 < 1536 || arg0.field1326 >= 11776 || arg0.field1327 >= 11776)) {
            arg0.field1319 = -1;
            arg0.field1336 = -1;
            arg0.field1359 = 0;
            arg0.field1360 = 0;
            arg0.field1326 = arg0.field1362[0] * 128 + arg0.field1368 * 64;
            arg0.field1327 = arg0.field1363[0] * 128 + arg0.field1368 * 64;
            arg0.method456((byte) 109);
        }
        if (arg0.field1359 > field487) {
            this.method78(arg0, 2);
        } else if (arg0.field1360 >= field487) {
            this.method79(717, arg0);
        } else {
            this.method80(114, arg0);
        }
        this.method81(928, arg0);
        this.method82(false, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LQMQRUGDN;I)V")
    public final void method78(class50 arg0, int arg1) {
        int var3 = arg0.field1359 - field487;
        int var4 = arg0.field1368 * 64 + arg0.field1355 * 128;
        int var5 = arg0.field1368 * 64 + arg0.field1357 * 128;
        arg0.field1326 += (var4 - arg0.field1326) / var3;
        if (arg1 < 2 || arg1 > 2) {
            field97 = 437;
        }
        arg0.field1327 += (var5 - arg0.field1327) / var3;
        arg0.field1351 = 0;
        if (arg0.field1361 == 0) {
            arg0.field1370 = 1024;
        }
        if (arg0.field1361 == 1) {
            arg0.field1370 = 1536;
        }
        if (arg0.field1361 == 2) {
            arg0.field1370 = 0;
        }
        if (arg0.field1361 == 3) {
            arg0.field1370 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILQMQRUGDN;)V")
    public final void method79(int arg0, class50 arg1) {
        if (field487 == arg1.field1360 || arg1.field1319 == -1 || arg1.field1322 != 0 || arg1.field1321 + 1 > class42.field1158[arg1.field1319].method415(arg1.field1320, (byte) 6)) {
            int var3 = arg1.field1360 - arg1.field1359;
            int var4 = field487 - arg1.field1359;
            int var5 = arg1.field1368 * 64 + arg1.field1355 * 128;
            int var6 = arg1.field1368 * 64 + arg1.field1357 * 128;
            int var7 = arg1.field1368 * 64 + arg1.field1356 * 128;
            int var8 = arg1.field1368 * 64 + arg1.field1358 * 128;
            arg1.field1326 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1327 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1351 = 0;
        if (arg1.field1361 == 0) {
            arg1.field1370 = 1024;
        }
        if (arg1.field1361 == 1) {
            arg1.field1370 = 1536;
        }
        if (arg1.field1361 == 2) {
            arg1.field1370 = 0;
        }
        if (arg1.field1361 == 3) {
            arg1.field1370 = 512;
        }
        arg1.field1328 = arg1.field1370;
        int var9 = 90 / arg0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILQMQRUGDN;)V")
    public final void method80(int arg0, class50 arg1) {
        arg1.field1332 = arg1.field1353;
        if (arg1.field1369 == 0) {
            arg1.field1351 = 0;
        } else {
            if (arg1.field1319 != -1 && arg1.field1322 == 0) {
                class42 var3 = class42.field1158[arg1.field1319];
                if (arg1.field1318 > 0 && var3.field1170 == 0) {
                    ++arg1.field1351;
                    return;
                }
                if (arg1.field1318 <= 0 && var3.field1171 == 0) {
                    ++arg1.field1351;
                    return;
                }
            }
            int var4 = arg1.field1326;
            int var5 = arg1.field1327;
            int var6 = arg1.field1362[arg1.field1369 - 1] * 128 + arg1.field1368 * 64;
            int var7 = arg1.field1363[arg1.field1369 - 1] * 128 + arg1.field1368 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1370 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1370 = 1792;
                    } else {
                        arg1.field1370 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1370 = 768;
                    } else if (var5 > var7) {
                        arg1.field1370 = 256;
                    } else {
                        arg1.field1370 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1370 = 1024;
                } else {
                    arg1.field1370 = 0;
                }
                int var8 = arg1.field1370 - arg1.field1328 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1365;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1364;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1367;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1366;
                }
                if (var9 == -1) {
                    var9 = arg1.field1364;
                }
                arg1.field1332 = var9;
                int var10 = 75 / arg0;
                int var11 = 4;
                if (arg1.field1370 != arg1.field1328 && arg1.field1335 == -1 && arg1.field1371 != 0) {
                    var11 = 2;
                }
                if (arg1.field1369 > 2) {
                    var11 = 6;
                }
                if (arg1.field1369 > 3) {
                    var11 = 8;
                }
                if (arg1.field1351 > 0 && arg1.field1369 > 1) {
                    var11 = 8;
                    --arg1.field1351;
                }
                if (arg1.field1330[arg1.field1369 - 1]) {
                    var11 <<= 1;
                }
                if (var11 >= 8 && arg1.field1364 == arg1.field1332 && arg1.field1343 != -1) {
                    arg1.field1332 = arg1.field1343;
                }
                if (var4 < var6) {
                    arg1.field1326 += var11;
                    if (arg1.field1326 > var6) {
                        arg1.field1326 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1326 -= var11;
                    if (arg1.field1326 < var6) {
                        arg1.field1326 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1327 += var11;
                    if (arg1.field1327 > var7) {
                        arg1.field1327 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1327 -= var11;
                    if (arg1.field1327 < var7) {
                        arg1.field1327 = var7;
                    }
                }
                if (arg1.field1326 == var6 && arg1.field1327 == var7) {
                    --arg1.field1369;
                    if (arg1.field1318 > 0) {
                        --arg1.field1318;
                        return;
                    }
                }
            } else {
                arg1.field1326 = var6;
                arg1.field1327 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILQMQRUGDN;)V")
    public final void method81(int arg0, class50 arg1) {
        int var3 = 40 / arg0;
        if (arg1.field1371 != 0) {
            if (arg1.field1335 != -1 && arg1.field1335 < 32768) {
                class3 var4 = this.field225[arg1.field1335];
                if (var4 != null) {
                    int var5 = arg1.field1326 - var4.field1326;
                    int var6 = arg1.field1327 - var4.field1327;
                    if (var5 != 0 || var6 != 0) {
                        arg1.field1370 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1335 >= 32768) {
                int var7 = arg1.field1335 - 32768;
                if (this.field85 == var7) {
                    var7 = this.field249;
                }
                class38 var8 = this.field250[var7];
                if (var8 != null) {
                    int var9 = arg1.field1326 - var8.field1326;
                    int var10 = arg1.field1327 - var8.field1327;
                    if (var9 != 0 || var10 != 0) {
                        arg1.field1370 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1347 != 0 || arg1.field1348 != 0) && (arg1.field1369 == 0 || arg1.field1351 > 0)) {
                int var11 = arg1.field1326 - (arg1.field1347 - this.field217 - this.field217) * 64;
                int var12 = arg1.field1327 - (arg1.field1348 - this.field218 - this.field218) * 64;
                if (var11 != 0 || var12 != 0) {
                    arg1.field1370 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
                }
                arg1.field1347 = 0;
                arg1.field1348 = 0;
            }
            int var13 = arg1.field1370 - arg1.field1328 & 2047;
            if (var13 != 0) {
                if (var13 >= arg1.field1371 && var13 <= 2048 - arg1.field1371) {
                    if (var13 > 1024) {
                        arg1.field1328 -= arg1.field1371;
                    } else {
                        arg1.field1328 += arg1.field1371;
                    }
                } else {
                    arg1.field1328 = arg1.field1370;
                }
                arg1.field1328 &= 2047;
                if (arg1.field1353 == arg1.field1332 && arg1.field1370 != arg1.field1328) {
                    if (arg1.field1354 != -1) {
                        arg1.field1332 = arg1.field1354;
                        return;
                    }
                    arg1.field1332 = arg1.field1364;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLQMQRUGDN;)V")
    public final void method82(boolean arg0, class50 arg1) {
        if (arg0) {
            field151 = this.field105.method405();
        }
        arg1.field1341 = false;
        if (arg1.field1332 != -1) {
            class42 var3 = class42.field1158[arg1.field1332];
            ++arg1.field1334;
            if (arg1.field1333 < var3.field1159 && arg1.field1334 > var3.method415(arg1.field1333, (byte) 6)) {
                arg1.field1334 = 0;
                ++arg1.field1333;
            }
            if (arg1.field1333 >= var3.field1159) {
                arg1.field1334 = 0;
                arg1.field1333 = 0;
            }
        }
        if (arg1.field1336 != -1 && field487 >= arg1.field1339) {
            if (arg1.field1337 < 0) {
                arg1.field1337 = 0;
            }
            class42 var4 = class21.field703[arg1.field1336].field707;
            ++arg1.field1338;
            while (arg1.field1337 < var4.field1159 && arg1.field1338 > var4.method415(arg1.field1337, (byte) 6)) {
                arg1.field1338 -= var4.method415(arg1.field1337, (byte) 6);
                ++arg1.field1337;
            }
            if (arg1.field1337 >= var4.field1159 && (arg1.field1337 < 0 || arg1.field1337 >= var4.field1159)) {
                arg1.field1336 = -1;
            }
        }
        if (arg1.field1319 != -1 && arg1.field1322 <= 1) {
            class42 var5 = class42.field1158[arg1.field1319];
            if (var5.field1170 == 1 && arg1.field1318 > 0 && arg1.field1359 <= field487 && arg1.field1360 < field487) {
                arg1.field1322 = 1;
                return;
            }
        }
        if (arg1.field1319 != -1 && arg1.field1322 == 0) {
            class42 var6 = class42.field1158[arg1.field1319];
            ++arg1.field1321;
            while (arg1.field1320 < var6.field1159 && arg1.field1321 > var6.method415(arg1.field1320, (byte) 6)) {
                arg1.field1321 -= var6.method415(arg1.field1320, (byte) 6);
                ++arg1.field1320;
            }
            if (arg1.field1320 >= var6.field1159) {
                arg1.field1320 -= var6.field1163;
                ++arg1.field1323;
                if (arg1.field1323 >= var6.field1169) {
                    arg1.field1319 = -1;
                }
                if (arg1.field1320 < 0 || arg1.field1320 >= var6.field1159) {
                    arg1.field1319 = -1;
                }
            }
            arg1.field1341 = var6.field1165;
        }
        if (arg1.field1322 > 0) {
            --arg1.field1322;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method83(int arg0) {
        if (arg0 != 38683) {
            this.field531 = this.field374.method521();
        }
        if (this.field423) {
            this.field423 = false;
            this.field361.method177(4, true, super.field804, 0);
            this.field362.method177(357, true, super.field804, 0);
            this.field363.method177(4, true, super.field804, 722);
            this.field364.method177(205, true, super.field804, 743);
            this.field365.method177(0, true, super.field804, 0);
            this.field366.method177(4, true, super.field804, 516);
            this.field367.method177(205, true, super.field804, 516);
            this.field368.method177(357, true, super.field804, 496);
            this.field369.method177(338, true, super.field804, 0);
            this.field493 = true;
            this.field228 = true;
            this.field168 = true;
            this.field420 = true;
            if (this.field291 != 2) {
                this.field245.method177(4, true, super.field804, 4);
                this.field244.method177(4, true, super.field804, 550);
            }
            ++field328;
            if (field328 > 90) {
                field328 = 0;
                this.field159.method510(68, -266);
            }
        }
        if (this.field291 == 2) {
            this.method38(43942);
        }
        if (this.field395 && this.field460 == 1) {
            this.field493 = true;
        }
        if (this.field437 != -1) {
            boolean var2 = this.method86(this.field437, 292, this.field542);
            if (var2) {
                this.field493 = true;
            }
        }
        if (this.field323 == 2) {
            this.field493 = true;
        }
        if (this.field233 == 2) {
            this.field493 = true;
        }
        if (this.field493) {
            this.method63(this.field451);
            this.field493 = false;
        }
        if (this.field341 == -1) {
            this.field466.field1286 = this.field300 - this.field522 - 77;
            if (super.field812 > 448 && super.field812 < 560 && super.field813 > 332) {
                this.method102(this.field300, super.field812 - 17, this.field466, false, 15578, 0, 463, 77, super.field813 - 357);
            }
            int var3 = this.field300 - 77 - this.field466.field1286;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field300 - 77) {
                var3 = this.field300 - 77;
            }
            if (this.field522 != var3) {
                this.field522 = var3;
                this.field228 = true;
            }
        }
        if (this.field341 != -1) {
            boolean var4 = this.method86(this.field341, 292, this.field542);
            if (var4) {
                this.field228 = true;
            }
        }
        if (this.field323 == 3) {
            this.field228 = true;
        }
        if (this.field233 == 3) {
            this.field228 = true;
        }
        if (this.field476 != null) {
            this.field228 = true;
        }
        if (this.field395 && this.field460 == 2) {
            this.field228 = true;
        }
        if (this.field228) {
            this.method107(584);
            this.field228 = false;
        }
        if (this.field291 == 2) {
            this.method116(449);
            this.field244.method177(4, true, super.field804, 550);
        }
        if (this.field377 != -1) {
            this.field168 = true;
        }
        if (this.field168) {
            if (this.field377 != -1 && this.field380 == this.field377) {
                this.field377 = -1;
                this.field159.method510(128, -266);
                this.field159.method511(this.field380);
            }
            this.field168 = false;
            this.field481.method176(-179);
            this.field484.method186(0, 0, 412);
            if (this.field437 == -1) {
                if (this.field95[this.field380] != -1) {
                    if (this.field380 == 0) {
                        this.field161.method186(10, 22, 412);
                    }
                    if (this.field380 == 1) {
                        this.field162.method186(8, 54, 412);
                    }
                    if (this.field380 == 2) {
                        this.field162.method186(8, 82, 412);
                    }
                    if (this.field380 == 3) {
                        this.field163.method186(8, 110, 412);
                    }
                    if (this.field380 == 4) {
                        this.field165.method186(8, 153, 412);
                    }
                    if (this.field380 == 5) {
                        this.field165.method186(8, 181, 412);
                    }
                    if (this.field380 == 6) {
                        this.field164.method186(9, 209, 412);
                    }
                }
                if (this.field95[0] != -1 && (this.field377 != 0 || field487 % 20 < 10)) {
                    this.field139[0].method186(13, 29, 412);
                }
                if (this.field95[1] != -1 && (this.field377 != 1 || field487 % 20 < 10)) {
                    this.field139[1].method186(11, 53, 412);
                }
                if (this.field95[2] != -1 && (this.field377 != 2 || field487 % 20 < 10)) {
                    this.field139[2].method186(11, 82, 412);
                }
                if (this.field95[3] != -1 && (this.field377 != 3 || field487 % 20 < 10)) {
                    this.field139[3].method186(12, 115, 412);
                }
                if (this.field95[4] != -1 && (this.field377 != 4 || field487 % 20 < 10)) {
                    this.field139[4].method186(13, 153, 412);
                }
                if (this.field95[5] != -1 && (this.field377 != 5 || field487 % 20 < 10)) {
                    this.field139[5].method186(11, 180, 412);
                }
                if (this.field95[6] != -1 && (this.field377 != 6 || field487 % 20 < 10)) {
                    this.field139[6].method186(13, 208, 412);
                }
            }
            this.field481.method177(160, true, super.field804, 516);
            this.field480.method176(-179);
            this.field483.method186(0, 0, 412);
            if (this.field437 == -1) {
                if (this.field95[this.field380] != -1) {
                    if (this.field380 == 7) {
                        this.field438.method186(0, 42, 412);
                    }
                    if (this.field380 == 8) {
                        this.field439.method186(0, 74, 412);
                    }
                    if (this.field380 == 9) {
                        this.field439.method186(0, 102, 412);
                    }
                    if (this.field380 == 10) {
                        this.field440.method186(1, 130, 412);
                    }
                    if (this.field380 == 11) {
                        this.field442.method186(0, 173, 412);
                    }
                    if (this.field380 == 12) {
                        this.field442.method186(0, 201, 412);
                    }
                    if (this.field380 == 13) {
                        this.field441.method186(0, 229, 412);
                    }
                }
                if (this.field95[8] != -1 && (this.field377 != 8 || field487 % 20 < 10)) {
                    this.field139[7].method186(2, 74, 412);
                }
                if (this.field95[9] != -1 && (this.field377 != 9 || field487 % 20 < 10)) {
                    this.field139[8].method186(3, 102, 412);
                }
                if (this.field95[10] != -1 && (this.field377 != 10 || field487 % 20 < 10)) {
                    this.field139[9].method186(4, 137, 412);
                }
                if (this.field95[11] != -1 && (this.field377 != 11 || field487 % 20 < 10)) {
                    this.field139[10].method186(2, 174, 412);
                }
                if (this.field95[12] != -1 && (this.field377 != 12 || field487 % 20 < 10)) {
                    this.field139[11].method186(2, 201, 412);
                }
                if (this.field95[13] != -1 && (this.field377 != 13 || field487 % 20 < 10)) {
                    this.field139[12].method186(2, 226, 412);
                }
            }
            this.field480.method177(466, true, super.field804, 496);
            this.field245.method176(-179);
        }
        if (this.field420) {
            this.field420 = false;
            this.field479.method176(-179);
            this.field482.method186(0, 0, 412);
            this.field293.method16(true, "Public chat", 55, -22293, 28, 16777215);
            if (this.field203 == 0) {
                this.field293.method16(true, "On", 55, -22293, 41, 65280);
            }
            if (this.field203 == 1) {
                this.field293.method16(true, "Friends", 55, -22293, 41, 16776960);
            }
            if (this.field203 == 2) {
                this.field293.method16(true, "Off", 55, -22293, 41, 16711680);
            }
            if (this.field203 == 3) {
                this.field293.method16(true, "Hide", 55, -22293, 41, 65535);
            }
            this.field293.method16(true, "Private chat", 184, -22293, 28, 16777215);
            if (this.field475 == 0) {
                this.field293.method16(true, "On", 184, -22293, 41, 65280);
            }
            if (this.field475 == 1) {
                this.field293.method16(true, "Friends", 184, -22293, 41, 16776960);
            }
            if (this.field475 == 2) {
                this.field293.method16(true, "Off", 184, -22293, 41, 16711680);
            }
            this.field293.method16(true, "Trade/compete", 324, -22293, 28, 16777215);
            if (this.field187 == 0) {
                this.field293.method16(true, "On", 324, -22293, 41, 65280);
            }
            if (this.field187 == 1) {
                this.field293.method16(true, "Friends", 324, -22293, 41, 16776960);
            }
            if (this.field187 == 2) {
                this.field293.method16(true, "Off", 324, -22293, 41, 16711680);
            }
            this.field293.method16(true, "Report abuse", 458, -22293, 33, 16777215);
            this.field479.method177(453, true, super.field804, 0);
            this.field245.method176(-179);
        }
        this.field542 = 0;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        short var2 = 256;
        if (this.field504 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field504 > 768) {
                    this.field280[var3] = this.method40(1024 - this.field504, this.field282[var3], this.field281[var3], 720);
                } else if (this.field504 > 256) {
                    this.field280[var3] = this.field282[var3];
                } else {
                    this.field280[var3] = this.method40(256 - this.field504, this.field281[var3], this.field282[var3], 720);
                }
            }
        } else if (this.field505 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field505 > 768) {
                    this.field280[var4] = this.method40(1024 - this.field505, this.field283[var4], this.field281[var4], 720);
                } else if (this.field505 > 256) {
                    this.field280[var4] = this.field283[var4];
                } else {
                    this.field280[var4] = this.method40(256 - this.field505, this.field281[var4], this.field283[var4], 720);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field280[var5] = this.field281[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field209.field546[var6] = this.field473.field1528[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field277[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field520[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field280[var26];
                    int var30 = this.field209.field546[var8];
                    this.field209.field546[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field209.method177(0, true, super.field804, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field210.field546[var10] = this.field474.field1528[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field277[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field520[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field280[var18];
                    int var22 = this.field210.field546[var16];
                    this.field210.field546[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field210.method177(0, true, super.field804, 637);
        if (arg0) {
            this.method114();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    private final void method85(boolean arg0) {
        if (!arg0) {
            this.field531 = this.field374.method521();
        }
        for (class32 var2 = (class32) this.field344.method332(); var2 != null; var2 = (class32) this.field344.method334(-96)) {
            if (var2.field969 == -1) {
                var2.field964 = 0;
                this.method109((byte) 37, var2);
            } else {
                var2.method471();
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method86(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class48 var5 = class48.field1246[arg0];
        for (int var6 = 0; var6 < var5.field1256.length && var5.field1256[var6] != -1; ++var6) {
            class48 var7 = class48.field1246[var5.field1256[var6]];
            if (var7.field1260 == 1) {
                var4 |= this.method86(var7.field1285, 292, arg2);
            }
            if (var7.field1260 == 6 && (var7.field1297 != -1 || var7.field1298 != -1)) {
                boolean var8 = this.method112(this.field183, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1298;
                } else {
                    var9 = var7.field1297;
                }
                if (var9 != -1) {
                    class42 var10 = class42.field1158[var9];
                    var7.field1240 += arg2;
                    while (var7.field1240 > var10.method415(var7.field1294, (byte) 6)) {
                        var7.field1240 -= var10.method415(var7.field1294, (byte) 6) + 1;
                        ++var7.field1294;
                        if (var7.field1294 >= var10.field1159) {
                            var7.field1294 -= var10.field1163;
                            if (var7.field1294 < 0 || var7.field1294 >= var10.field1159) {
                                var7.field1294 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        int var11 = 61 / arg1;
        return var4;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)V")
    public final void method87(int arg0, byte arg1) {
        class48 var3 = class48.field1246[arg0];
        for (int var4 = 0; var4 < var3.field1256.length && var3.field1256[var4] != -1; ++var4) {
            class48 var5 = class48.field1246[var3.field1256[var4]];
            if (var5.field1260 == 1) {
                this.method87(var5.field1285, (byte) 53);
            }
            var5.field1294 = 0;
            var5.field1240 = 0;
        }
        if (arg1 != 53) {
            this.field145 = 13;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LXOUQUKZW;II)V")
    private final void method88(class62 arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            arg0.method531(0);
            int var4 = arg0.method532(7, 1);
            if (var4 != 0) {
                int var5 = arg0.method532(7, 2);
                if (var5 == 0) {
                    this.field254[this.field253++] = this.field249;
                } else if (var5 == 1) {
                    int var6 = arg0.method532(7, 3);
                    field113.method457(false, var6, (byte) -91);
                    int var7 = arg0.method532(7, 1);
                    if (var7 == 1) {
                        this.field254[this.field253++] = this.field249;
                    }
                } else if (var5 == 2) {
                    int var8 = arg0.method532(7, 3);
                    field113.method457(true, var8, (byte) -91);
                    int var9 = arg0.method532(7, 3);
                    field113.method457(true, var9, (byte) -91);
                    int var10 = arg0.method532(7, 1);
                    if (var10 == 1) {
                        this.field254[this.field253++] = this.field249;
                    }
                } else if (var5 == 3) {
                    int var11 = arg0.method532(7, 1);
                    int var12 = arg0.method532(7, 7);
                    int var13 = arg0.method532(7, 7);
                    this.field123 = arg0.method532(7, 2);
                    int var14 = arg0.method532(7, 1);
                    if (var14 == 1) {
                        this.field254[this.field253++] = this.field249;
                    }
                    field113.method454(var12, 5, var13, var11 == 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method89(boolean arg0) {
        int var2 = this.field405 * 128 + 64;
        int var3 = this.field406 * 128 + 64;
        int var4 = this.method119(this.field123, var3, var2, 4) - this.field407;
        if (this.field488 < var2) {
            this.field488 += (var2 - this.field488) * this.field409 / 1000 + this.field408;
            if (this.field488 > var2) {
                this.field488 = var2;
            }
        }
        if (this.field488 > var2) {
            this.field488 -= (this.field488 - var2) * this.field409 / 1000 + this.field408;
            if (this.field488 < var2) {
                this.field488 = var2;
            }
        }
        if (this.field489 < var4) {
            this.field489 += (var4 - this.field489) * this.field409 / 1000 + this.field408;
            if (this.field489 > var4) {
                this.field489 = var4;
            }
        }
        if (this.field489 > var4) {
            this.field489 -= (this.field489 - var4) * this.field409 / 1000 + this.field408;
            if (this.field489 < var4) {
                this.field489 = var4;
            }
        }
        if (this.field490 < var3) {
            this.field490 += (var3 - this.field490) * this.field409 / 1000 + this.field408;
            if (this.field490 > var3) {
                this.field490 = var3;
            }
        }
        if (this.field490 > var3) {
            this.field490 -= (this.field490 - var3) * this.field409 / 1000 + this.field408;
            if (this.field490 < var3) {
                this.field490 = var3;
            }
        }
        int var5 = this.field100 * 128 + 64;
        int var6 = this.field101 * 128 + 64;
        int var7 = this.method119(this.field123, var6, var5, 4) - this.field102;
        int var8 = var5 - this.field488;
        int var9 = var7 - this.field489;
        int var10 = var6 - this.field490;
        if (arg0) {
            this.field204 = this.field105.method405();
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
        if (this.field491 < var12) {
            this.field491 += (var12 - this.field491) * this.field104 / 1000 + this.field103;
            if (this.field491 > var12) {
                this.field491 = var12;
            }
        }
        if (this.field491 > var12) {
            this.field491 -= (this.field491 - var12) * this.field104 / 1000 + this.field103;
            if (this.field491 < var12) {
                this.field491 = var12;
            }
        }
        int var14 = var13 - this.field492;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field492 += this.field104 * var14 / 1000 + this.field103;
            this.field492 &= 2047;
        }
        if (var14 < 0) {
            this.field492 -= -var14 * this.field104 / 1000 + this.field103;
            this.field492 &= 2047;
        }
        int var15 = var13 - this.field492;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field492 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILVDSDFSIV;)V")
    public final void method90(int arg0, int arg1, int arg2, class57 arg3) {
        if (arg2 < 2 || arg2 > 2) {
            this.field531 = this.field374.method521();
        }
        int var5 = arg0 * arg0 + arg1 * arg1;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field74 + this.field523 & 2047;
            int var7 = class35.field1073[var6];
            int var8 = class35.field1074[var6];
            int var9 = var7 * 256 / (this.field236 + 256);
            int var10 = var8 * 256 / (this.field236 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field87.method504(15, 256, 20, -549, 83 - var16 - 20, 20, 15, var15 + 94 + 4 - 10, var13);
        } else {
            this.method145((byte) 8, arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method91(boolean arg0, byte arg1) {
        if (arg1 == 4) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (field113.field1326 >> 7 == this.field467 && field113.field1327 >> 7 == this.field468) {
            this.field467 = 0;
        }
        int var5 = this.field251;
        if (arg0) {
            var5 = 1;
        }
        for (int var6 = 0; var6 < var5; ++var6) {
            class38 var7;
            int var8;
            if (arg0) {
                var7 = field113;
                var8 = this.field249 << 14;
            } else {
                var7 = this.field250[this.field252[var6]];
                var8 = this.field252[var6] << 14;
            }
            if (var7 != null && var7.method12(this.field145)) {
                var7.field1115 = false;
                if ((field191 && this.field251 > 50 || this.field251 > 200) && !arg0 && var7.field1353 == var7.field1332) {
                    var7.field1115 = true;
                }
                int var9 = var7.field1326 >> 7;
                int var10 = var7.field1327 >> 7;
                if (var9 >= 0 && var9 < 104 && var10 >= 0 && var10 < 104) {
                    if (var7.field1107 != null && field487 >= var7.field1093 && field487 < var7.field1094) {
                        var7.field1115 = false;
                        var7.field1111 = this.method119(this.field123, var7.field1327, var7.field1326, 4);
                        this.field397.method245(var7.field1327, var7.field1100, this.field123, var7.field1099, var7.field1102, false, var8, var7.field1328, var7.field1101, var7.field1111, var7.field1326, 60, var7);
                    } else {
                        if ((var7.field1326 & 127) == 64 && (var7.field1327 & 127) == 64) {
                            if (this.field314[var9][var10] == this.field403) {
                                continue;
                            }
                            this.field314[var9][var10] = this.field403;
                        }
                        var7.field1111 = this.method119(this.field123, var7.field1327, var7.field1326, 4);
                        this.field397.method244(var7.field1328, var7, var8, var7.field1326, 0, var7.field1327, var7.field1341, var7.field1111, 60, this.field123);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method92(int arg0) {
        if (arg0 != -16092) {
            this.field531 = this.field374.method521();
        }
        if (!this.field160 && !this.field356 && !this.field135) {
            ++field436;
            if (!this.field179) {
                this.method49(false, false);
            } else {
                this.method83(38683);
            }
            this.field128 = 0;
        } else {
            this.method153(-2675);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method93(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method93(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method94(byte arg0) {
        this.field159.method510(13, -266);
        if (this.field437 != -1) {
            this.field437 = -1;
            this.field493 = true;
            this.field91 = false;
            this.field168 = true;
        }
        if (this.field341 != -1) {
            this.field341 = -1;
            this.field228 = true;
            this.field91 = false;
        }
        this.field450 = -1;
        if (arg0 != 59) {
            this.field159.method511(82);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= 0) {
            this.field398 = -100;
        }
        if (arg0 >= 1 && arg4 >= 1 && arg0 <= 102 && arg4 <= 102) {
            if (field191 && this.field123 != arg5) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg3 == 0) {
                var9 = this.field397.method259(arg5, arg0, arg4);
            }
            if (arg3 == 1) {
                var9 = this.field397.method260(true, arg4, arg0, arg5);
            }
            if (arg3 == 2) {
                var9 = this.field397.method261(arg5, arg0, arg4);
            }
            if (arg3 == 3) {
                var9 = this.field397.method262(arg5, arg0, arg4);
            }
            if (var9 != 0) {
                int var13 = this.field397.method263(arg5, arg0, arg4, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg3 == 0) {
                    this.field397.method250(arg5, arg0, 537, arg4);
                    class53 var17 = class53.method464(var14);
                    if (var17.field1447) {
                        this.field372[arg5].method574(var17.field1445, arg4, var16, arg0, var15, this.field156);
                    }
                }
                if (arg3 == 1) {
                    this.field397.method251(arg5, arg4, arg0, -668);
                }
                if (arg3 == 2) {
                    this.field397.method252(arg5, arg0, arg4, true);
                    class53 var18 = class53.method464(var14);
                    if (var18.field1421 + arg0 > 103 || var18.field1421 + arg4 > 103 || var18.field1457 + arg0 > 103 || var18.field1457 + arg4 > 103) {
                        return;
                    }
                    if (var18.field1447) {
                        this.field372[arg5].method575(var16, 895, arg4, var18.field1445, var18.field1457, var18.field1421, arg0);
                    }
                }
                if (arg3 == 3) {
                    this.field397.method253(arg5, true, arg4, arg0);
                    class53 var19 = class53.method464(var14);
                    if (var19.field1447 && var19.field1424) {
                        this.field372[arg5].method577(181, arg4, arg0);
                    }
                }
            }
            if (arg7 >= 0) {
                int var20 = arg5;
                if (arg5 < 3 && (this.field506[1][arg0][arg4] & 2) == 2) {
                    var20 = arg5 + 1;
                }
                class11.method197(arg4, this.field397, this.field372[arg5], this.field358, arg1, arg5, arg7, arg0, arg2, var20, -864);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method96(int arg0) {
        try {
            if (this.field309 != null) {
                this.field309.method1();
            }
        } catch (Exception var3) {
        }
        this.field309 = null;
        this.field179 = false;
        this.field353 = 0;
        this.field400 = "";
        this.field401 = "";
        if (arg0 == 20701) {
            this.method147((byte) 9);
            this.field397.method233((byte) 42);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field372[var2].method569();
            }
            System.gc();
            this.method64((byte) 7);
            this.field276 = -1;
            this.field456 = -1;
            this.field223 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LXOUQUKZW;II)V")
    private final void method97(class62 arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field253; ++var4) {
            int var6 = this.field254[var4];
            class3 var7 = this.field225[var6];
            int var8 = arg0.method521();
            if ((var8 & 16) != 0) {
                var7.field1350 = arg0.method528();
                var7.field1342 = 100;
            }
            if ((var8 & 128) != 0) {
                var7.field41 = class26.method309(arg0.method523());
                var7.field1368 = var7.field41.field916;
                var7.field1371 = var7.field41.field908;
                var7.field1364 = var7.field41.field902;
                var7.field1365 = var7.field41.field893;
                var7.field1366 = var7.field41.field919;
                var7.field1367 = var7.field41.field922;
                var7.field1353 = var7.field41.field924;
            }
            if ((var8 & 4) != 0) {
                int var9 = arg0.method550(-397);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method539(319);
                if (var7.field1319 == var9 && var9 != -1) {
                    int var11 = class42.field1158[var9].field1172;
                    if (var11 == 1) {
                        var7.field1320 = 0;
                        var7.field1321 = 0;
                        var7.field1322 = var10;
                        var7.field1323 = 0;
                    }
                    if (var11 == 2) {
                        var7.field1323 = 0;
                    }
                } else if (var9 == -1 || var7.field1319 == -1 || class42.field1158[var9].field1166 >= class42.field1158[var7.field1319].field1166) {
                    var7.field1319 = var9;
                    var7.field1320 = 0;
                    var7.field1321 = 0;
                    var7.field1322 = var10;
                    var7.field1323 = 0;
                    var7.field1318 = var7.field1369;
                }
            }
            if ((var8 & 2) != 0) {
                var7.field1347 = arg0.method550(-397);
                var7.field1348 = arg0.method550(-397);
            }
            if ((var8 & 64) != 0) {
                var7.field1335 = arg0.method523();
                if (var7.field1335 == 65535) {
                    var7.field1335 = -1;
                }
            }
            if ((var8 & 8) != 0) {
                var7.field1336 = arg0.method550(-397);
                int var12 = arg0.method554(this.field411);
                var7.field1340 = var12 >> 16;
                var7.field1339 = (var12 & 65535) + field487;
                var7.field1337 = 0;
                var7.field1338 = 0;
                if (var7.field1339 > field487) {
                    var7.field1337 = -1;
                }
                if (var7.field1336 == 65535) {
                    var7.field1336 = -1;
                }
            }
            if ((var8 & 1) != 0) {
                int var13 = arg0.method540(695);
                int var14 = arg0.method521();
                var7.method455((byte) 3, var14, field487, var13);
                var7.field1344 = field487 + 300;
                var7.field1345 = arg0.method521();
                var7.field1346 = arg0.method521();
            }
            if ((var8 & 32) != 0) {
                int var15 = arg0.method539(319);
                int var16 = arg0.method521();
                var7.method455((byte) 3, var16, field487, var15);
                var7.field1344 = field487 + 300;
                var7.field1345 = arg0.method541((byte) 13);
                var7.field1346 = arg0.method541((byte) 13);
            }
        }
        if (arg1 < 3 || arg1 > 3) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method98(int arg0) {
        this.field530 += arg0;
        for (int var2 = 0; var2 < this.field118; ++var2) {
            if (this.field275[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field184[var2] == this.field71 && this.field222[var2] == this.field394) {
                        if (!this.method133(199)) {
                            var3 = true;
                        }
                    } else {
                        class62 var4 = class72.method587(this.field222[var2], (byte) 112, this.field184[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1579 / 22) > (long) (this.field140 / 22) + this.field78) {
                            this.field140 = var4.field1579;
                            this.field78 = System.currentTimeMillis();
                            if (this.method123(var4.field1578, var4.field1579, -48855)) {
                                this.field71 = this.field184[var2];
                                this.field394 = this.field222[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field275[var2] != -5) {
                    this.field275[var2] = -5;
                } else {
                    --this.field118;
                    for (int var6 = var2; var6 < this.field118; ++var6) {
                        this.field184[var6] = this.field184[var6 + 1];
                        this.field222[var6] = this.field222[var6 + 1];
                        this.field275[var6] = this.field275[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field275[var2]--;
            }
        }
        if (this.field223 > 0) {
            this.field223 -= 20;
            if (this.field223 < 0) {
                this.field223 = 0;
            }
            if (this.field223 == 0 && this.field186 && !field191) {
                this.field456 = this.field276;
                this.field457 = true;
                this.field259.method478(2, this.field456);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)Z")
    public final boolean method99(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 14 & 32767;
        int var6 = this.field397.method263(this.field123, arg0, arg2, arg1);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method126(0, arg2, var7 + 1, 2, field113.field1362[0], 0, arg0, false, false, field113.field1363[0], 0, var8);
            } else {
                class53 var9 = class53.method464(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1457;
                    var11 = var9.field1421;
                } else {
                    var10 = var9.field1421;
                    var11 = var9.field1457;
                }
                int var12 = var9.field1440;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method126(var10, arg2, 0, 2, field113.field1362[0], var12, arg0, false, false, field113.field1363[0], var11, 0);
            }
            this.field536 = super.field819;
            this.field537 = super.field820;
            this.field539 = 2;
            if (arg3 != 5) {
                for (int var13 = 1; var13 > 0; ++var13) {
                }
            }
            this.field538 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public final void method100(String arg0, int arg1, int arg2, String arg3) {
        if (arg1 == 0 && this.field373 != -1) {
            this.field476 = arg3;
            super.field818 = 0;
        }
        if (this.field341 == -1) {
            this.field228 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field413[var5] = this.field413[var5 - 1];
            this.field414[var5] = this.field414[var5 - 1];
            this.field415[var5] = this.field415[var5 - 1];
        }
        if (arg2 != 14378) {
            this.field272 = null;
        }
        this.field413[0] = arg1;
        this.field414[0] = arg0;
        this.field415[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method101(int arg0, int arg1) {
        int[] var3 = this.field469.field1528;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field506[arg1][var24][var6] & 24) == 0) {
                    this.field397.method268(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field506[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field397.method268(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field469.method494(-179);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field506[arg1][var22][var9] & 24) == 0) {
                    this.method45(var22, var7, arg1, var9, false, var8);
                }
                if (arg1 < 3 && (this.field506[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method45(var22, var7, arg1 + 1, var9, false, var8);
                }
            }
        }
        this.field245.method176(-179);
        ++field157;
        if (arg0 <= 0) {
            this.field272 = null;
        }
        if (field157 > 146) {
            field157 = 0;
            this.field159.method510(88, -266);
            this.field159.method512(62406);
        }
        this.field169 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field397.method262(this.field123, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class53.method464(var13).field1428;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field372[this.field123].field1644;
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
                        this.field92[this.field169] = this.field357[var14];
                        this.field170[this.field169] = var15;
                        this.field171[this.field169] = var16;
                        ++this.field169;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILPFVGIFDY;ZIIIII)V")
    public final void method102(int arg0, int arg1, class48 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field216) {
            this.field311 = 32;
        } else {
            this.field311 = 0;
        }
        this.field216 = false;
        if (arg4 != 15578) {
            this.field494 = -479;
        }
        if (arg1 >= arg6 && arg1 < arg6 + 16 && arg8 >= arg5 && arg8 < arg5 + 16) {
            arg2.field1286 -= this.field128 * 4;
            if (arg3) {
                this.field493 = true;
                return;
            }
        } else if (arg1 >= arg6 && arg1 < arg6 + 16 && arg8 >= arg5 + arg7 - 16 && arg8 < arg5 + arg7) {
            arg2.field1286 += this.field128 * 4;
            if (arg3) {
                this.field493 = true;
                return;
            }
        } else {
            if (arg1 < arg6 - this.field311 || arg1 >= arg6 + 16 + this.field311 || arg8 < arg5 + 16 || arg8 >= arg5 + arg7 - 16 || this.field128 <= 0) {
                return;
            }
            int var10 = (arg7 - 32) * arg7 / arg0;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg8 - arg5 - 16 - var10 / 2;
            int var12 = arg7 - 32 - var10;
            arg2.field1286 = (arg0 - arg7) * var11 / var12;
            if (arg3) {
                this.field493 = true;
            }
            this.field216 = true;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method103(int arg0) {
        byte[] var2 = this.field302.method180("title.dat", (byte[]) null);
        class57 var3 = new class57(var2, this);
        this.field209.method176(-179);
        var3.method497(0, 0, (byte) -58);
        this.field210.method176(-179);
        var3.method497(-637, 0, (byte) -58);
        this.field206.method176(-179);
        var3.method497(-128, 0, (byte) -58);
        this.field207.method176(-179);
        var3.method497(-202, -371, (byte) -58);
        this.field208.method176(-179);
        var3.method497(-202, -171, (byte) -58);
        this.field211.method176(-179);
        var3.method497(0, -265, (byte) -58);
        this.field212.method176(-179);
        var3.method497(-562, -265, (byte) -58);
        this.field213.method176(-179);
        var3.method497(-128, -171, (byte) -58);
        this.field214.method176(-179);
        if (arg0 <= 0) {
            this.field167 = !this.field167;
        }
        var3.method497(-562, -171, (byte) -58);
        int[] var4 = new int[var3.field1529];
        for (int var5 = 0; var5 < var3.field1530; ++var5) {
            for (int var10 = 0; var10 < var3.field1529; ++var10) {
                var4[var10] = var3.field1528[var3.field1529 * var5 + (var3.field1529 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1529; ++var11) {
                var3.field1528[var3.field1529 * var5 + var11] = var4[var11];
            }
        }
        this.field209.method176(-179);
        var3.method497(382, 0, (byte) -58);
        this.field210.method176(-179);
        var3.method497(-255, 0, (byte) -58);
        this.field206.method176(-179);
        var3.method497(254, 0, (byte) -58);
        this.field207.method176(-179);
        var3.method497(180, -371, (byte) -58);
        this.field208.method176(-179);
        var3.method497(180, -171, (byte) -58);
        this.field211.method176(-179);
        var3.method497(382, -265, (byte) -58);
        this.field212.method176(-179);
        var3.method497(-180, -265, (byte) -58);
        this.field213.method176(-179);
        var3.method497(254, -171, (byte) -58);
        this.field214.method176(-179);
        var3.method497(-180, -171, (byte) -58);
        class57 var6 = new class57(this.field302, "logo", 0);
        this.field206.method176(-179);
        var6.method499(18, 382 - var6.field1529 / 2 - 128, 412);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method104(int arg0) {
        while (arg0 >= 0) {
            field151 = this.field105.method405();
        }
        if (field191 && this.field291 == 2 && class11.field630 != this.field123) {
            this.field245.method176(-179);
            this.field293.method15(151, true, 257, 0, "Loading - please wait.");
            this.field293.method15(150, true, 256, 16777215, "Loading - please wait.");
            this.field245.method177(4, true, super.field804, 4);
            this.field291 = 1;
            this.field80 = System.currentTimeMillis();
        }
        if (this.field291 == 1) {
            int var2 = this.method105(8);
            if (var2 != 0 && System.currentTimeMillis() - this.field80 > 360000L) {
                signlink.reporterror(this.field400 + " glcfb " + this.field386 + "," + var2 + "," + field191 + "," + this.field230[0] + "," + this.field259.method487() + "," + this.field123 + "," + this.field270 + "," + this.field271);
                this.field80 = System.currentTimeMillis();
            }
        }
        if (this.field291 == 2 && this.field515 != this.field123) {
            this.field515 = this.field123;
            this.method101(730, this.field123);
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)I")
    public final int method105(int arg0) {
        for (int var2 = 0; var2 < this.field525.length; ++var2) {
            if (this.field525[var2] == null && this.field131[var2] != -1) {
                return -1;
            }
            if (this.field424[var2] == null && this.field132[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        if (arg0 < 8 || arg0 > 8) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field525.length; ++var5) {
            byte[] var6 = this.field424[var5];
            if (var6 != null) {
                int var7 = (this.field130[var5] >> 8) * 64 - this.field217;
                int var8 = (this.field130[var5] & 255) * 64 - this.field218;
                if (this.field375) {
                    var7 = 10;
                    var8 = 10;
                }
                var3 &= class11.method191(var6, 0, var8, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field247) {
            return -4;
        } else {
            this.field291 = 2;
            class11.field630 = this.field123;
            this.method125(-645);
            this.field159.method510(246, -266);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class32 var11 = null;
        this.field530 += arg3;
        for (class32 var12 = (class32) this.field344.method332(); var12 != null; var12 = (class32) this.field344.method334(-96)) {
            if (var12.field965 == arg9 && var12.field967 == arg4 && var12.field968 == arg0 && var12.field966 == arg5) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class32();
            var11.field965 = arg9;
            var11.field966 = arg5;
            var11.field967 = arg4;
            var11.field968 = arg0;
            this.method109((byte) 37, var11);
            this.field344.method329(var11);
        }
        var11.field970 = arg7;
        var11.field972 = arg6;
        var11.field971 = arg2;
        var11.field964 = arg1;
        var11.field969 = arg8;
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method107(int arg0) {
        this.field246.method176(-179);
        if (arg0 <= 0) {
            this.field531 = this.field374.method521();
        }
        class47.field1228 = this.field511;
        this.field287.method186(0, 0, 412);
        if (this.field172) {
            this.field294.method15(40, true, 239, 0, this.field301);
            this.field294.method15(60, true, 239, 128, this.field459 + "*");
        } else if (this.field144 == 1) {
            this.field294.method15(40, true, 239, 0, "Enter amount:");
            this.field294.method15(60, true, 239, 128, this.field121 + "*");
        } else if (this.field144 == 2) {
            this.field294.method15(40, true, 239, 0, "Enter name:");
            this.field294.method15(60, true, 239, 128, this.field121 + "*");
        } else if (this.field476 != null) {
            this.field294.method15(40, true, 239, 0, this.field476);
            this.field294.method15(60, true, 239, 128, "Click to continue");
        } else if (this.field341 != -1) {
            this.method128(0, this.field500, 0, class48.field1246[this.field341], 0);
        } else if (this.field373 != -1) {
            this.method128(0, this.field500, 0, class48.field1246[this.field373], 0);
        } else {
            class4 var2 = this.field293;
            int var3 = 0;
            class29.method319(463, 7, 0, 0, 77);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field415[var4] != null) {
                    int var6 = this.field413[var4];
                    int var7 = 70 - var3 * 14 + this.field522;
                    String var8 = this.field414[var4];
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
                            var2.method19(this.field415[var4], 0, var7, 4, 6972);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field203 == 0 || this.field203 == 1 && this.method161(var8, (byte) -125))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field107[0].method186(var7 - 12, var10, 412);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field107[1].method186(var7 - 12, var10, 412);
                                var10 += 14;
                            }
                            var2.method19(var8 + ":", 0, var7, var10, 6972);
                            int var11 = var10 + var2.method17(var8, false) + 8;
                            var2.method19(this.field415[var4], 255, var7, var11, 6972);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field150 == 0 && (var6 == 7 || this.field475 == 0 || this.field475 == 1 && this.method161(var8, (byte) -125))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method19("From", 0, var7, var12, 6972);
                            int var13 = var12 + var2.method17("From ", false);
                            if (var9 == 1) {
                                this.field107[0].method186(var7 - 12, var13, 412);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field107[1].method186(var7 - 12, var13, 412);
                                var13 += 14;
                            }
                            var2.method19(var8 + ":", 0, var7, var13, 6972);
                            int var14 = var13 + var2.method17(var8, false) + 8;
                            var2.method19(this.field415[var4], 8388608, var7, var14, 6972);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field187 == 0 || this.field187 == 1 && this.method161(var8, (byte) -125))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method19(var8 + " " + this.field415[var4], 8388736, var7, 4, 6972);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field150 == 0 && this.field475 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method19(this.field415[var4], 8388608, var7, 4, 6972);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field150 == 0 && this.field475 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method19("To " + var8 + ":", 0, var7, 4, 6972);
                            var2.method19(this.field415[var4], 8388608, var7, 12 + var2.method17("To " + var8, false), 6972);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field187 == 0 || this.field187 == 1 && this.method161(var8, (byte) -125))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method19(var8 + " " + this.field415[var4], 8270336, var7, 4, 6972);
                        }
                        ++var3;
                    }
                }
            }
            class29.method318(0);
            this.field300 = var3 * 14 + 7;
            if (this.field300 < 78) {
                this.field300 = 78;
            }
            this.method124(463, 0, this.field300, 77, true, this.field300 - this.field522 - 77);
            String var5;
            if (field113 != null && field113.field1114 != null) {
                var5 = field113.field1114;
            } else {
                var5 = class67.method567(-550, this.field400);
            }
            var2.method19(var5 + ":", 0, 90, 4, 6972);
            var2.method19(this.field486 + "*", 255, 90, 6 + var2.method17(var5 + ": ", false), 6972);
            class29.method325((byte) 3, 0, 479, 0, 77);
        }
        if (this.field395 && this.field460 == 2) {
            this.method70(false);
        }
        this.field246.method177(357, true, super.field804, 17);
        this.field245.method176(-179);
        class47.field1228 = this.field513;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILPFVGIFDY;)Z")
    public final boolean method108(int arg0, class48 arg1) {
        int var3 = arg1.field1262;
        if (arg0 < 7 || arg0 > 7) {
            this.field531 = this.field374.method521();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field149[this.field477] = "Remove @whi@" + arg1.field1274;
                this.field509[this.field477] = 670;
                ++this.field477;
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
            this.field149[this.field477] = "Remove @whi@" + this.field260[var3];
            this.field509[this.field477] = 324;
            ++this.field477;
            this.field149[this.field477] = "Message @whi@" + this.field260[var3];
            this.field509[this.field477] = 394;
            ++this.field477;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLIRATNZCY;)V")
    private final void method109(byte arg0, class32 arg1) {
        if (arg0 != 37) {
            this.field279 = -491;
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field966 == 0) {
            var3 = this.field397.method259(arg1.field965, arg1.field967, arg1.field968);
        }
        if (arg1.field966 == 1) {
            var3 = this.field397.method260(true, arg1.field968, arg1.field967, arg1.field965);
        }
        if (arg1.field966 == 2) {
            var3 = this.field397.method261(arg1.field965, arg1.field967, arg1.field968);
        }
        if (arg1.field966 == 3) {
            var3 = this.field397.method262(arg1.field965, arg1.field967, arg1.field968);
        }
        if (var3 != 0) {
            int var7 = this.field397.method263(arg1.field965, arg1.field967, arg1.field968, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field961 = var4;
        arg1.field963 = var5;
        arg1.field962 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public final void method110(String arg0, int arg1, byte arg2) {
        if (arg2 == -27) {
            this.field412 = arg1;
            this.field166 = arg0;
            this.method53((byte) 2);
            if (this.field302 == null) {
                super.method110(arg0, arg1, (byte) -27);
            } else {
                this.field208.method176(-179);
                short var4 = 360;
                short var5 = 200;
                byte var6 = 20;
                this.field294.method15(var5 / 2 - 26 - var6, true, var4 / 2, 16777215, "RuneScape is loading - please wait...");
                int var7 = var5 / 2 - 18 - var6;
                class29.method323(304, 9179409, var7, var4 / 2 - 152, (byte) 87, 34);
                class29.method323(302, 0, var7 + 1, var4 / 2 - 151, (byte) 87, 32);
                class29.method322((byte) -37, var7 + 2, var4 / 2 - 150, 9179409, arg1 * 3, 30);
                class29.method322((byte) -37, var7 + 2, arg1 * 3 + (var4 / 2 - 150), 0, 300 - arg1 * 3, 30);
                this.field294.method15(var5 / 2 + 5 - var6, true, var4 / 2, 16777215, arg0);
                this.field208.method177(171, true, super.field804, 202);
                if (this.field423) {
                    this.field423 = false;
                    if (!this.field152) {
                        this.field209.method177(0, true, super.field804, 0);
                        this.field210.method177(0, true, super.field804, 637);
                    }
                    this.field206.method177(0, true, super.field804, 128);
                    this.field207.method177(371, true, super.field804, 202);
                    this.field211.method177(265, true, super.field804, 0);
                    this.field212.method177(265, true, super.field804, 562);
                    this.field213.method177(171, true, super.field804, 128);
                    this.field214.method177(171, true, super.field804, 562);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method111(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLPFVGIFDY;)Z")
    public final boolean method112(boolean arg0, class48 arg1) {
        if (arg1.field1277 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1277.length; ++var3) {
                int var4 = this.method55(var3, false, arg1);
                int var5 = arg1.field1251[var3];
                if (arg1.field1277[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1277[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1277[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg0) {
                this.field531 = this.field374.method521();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDNACUOZQ;Z)V")
    public final void method113(class10 arg0, boolean arg1) {
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
        this.field179 &= arg1;
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field598; ++var8) {
                for (int var9 = 0; var9 < arg0.field597; ++var9) {
                    if (arg0.field595[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field599;
                        int var11 = var8 + 16 + arg0.field600;
                        int var12 = (var11 << 7) + var10;
                        this.field267[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method114() {
        this.method110("Starting up", 20, (byte) -27);
        if (signlink.sunjava) {
            super.field798 = 5;
        }
        if (field108) {
            this.field160 = true;
        } else {
            field108 = true;
            boolean var1 = false;
            String var2 = this.method130(field498);
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
                this.field135 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field230[var3] = new class66(signlink.cache_idx[var3], 500000, var3 + 1, signlink.cache_dat, true);
                    }
                }
                try {
                    this.method46(-749);
                    this.field302 = this.method67("title screen", 6, 1, this.field319[1], "title", 25);
                    this.field292 = new class4(this.field302, false, "p11_full", field182);
                    this.field293 = new class4(this.field302, false, "p12_full", field182);
                    this.field294 = new class4(this.field302, false, "b12_full", field182);
                    this.field295 = new class4(this.field302, true, "q8_full", field182);
                    this.method103(717);
                    this.method34(true);
                    class7 var4 = this.method67("config", 6, 2, this.field319[2], "config", 30);
                    class7 var5 = this.method67("interface", 6, 3, this.field319[3], "interface", 35);
                    class7 var6 = this.method67("2d graphics", 6, 4, this.field319[4], "media", 40);
                    class7 var7 = this.method67("textures", 6, 6, this.field319[6], "textures", 45);
                    class7 var8 = this.method67("chat system", 6, 7, this.field319[7], "wordenc", 50);
                    class7 var9 = this.method67("sound effects", 6, 8, this.field319[8], "sounds", 55);
                    this.field506 = new byte[4][104][104];
                    this.field358 = new int[4][105][105];
                    this.field397 = new class22((byte) 6, this.field358, 104, 104, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field372[var10] = new class68(9, 104, 104);
                    }
                    this.field469 = new class57(512, 512);
                    class7 var11 = this.method67("update list", 6, 5, this.field319[5], "versionlist", 60);
                    this.method110("Connecting to update server", 60, (byte) -27);
                    this.field259 = new class55();
                    this.field259.method480(var11, this);
                    class71.method581(this.field259.method488((byte) 111));
                    class35.method376(this.field259.method486(0, 0), this.field259);
                    if (!field191) {
                        this.field456 = 0;
                        try {
                            this.field456 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field457 = true;
                        this.field259.method478(2, this.field456);
                        while (this.field259.method487() > 0) {
                            this.method154(-24622);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field259.field1501 > 3) {
                                this.method111("ondemand");
                                return;
                            }
                        }
                    }
                    this.method110("Requesting animations", 65, (byte) -27);
                    int var12 = this.field259.method486(0, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field259.method478(1, var13);
                    }
                    while (this.field259.method487() > 0) {
                        int var14 = var12 - this.field259.method487();
                        if (var14 > 0) {
                            this.method110("Loading animations - " + var14 * 100 / var12 + "%", 65, (byte) -27);
                        }
                        this.method154(-24622);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field259.field1501 > 3) {
                            this.method111("ondemand");
                            return;
                        }
                    }
                    this.method110("Requesting models", 70, (byte) -27);
                    int var15 = this.field259.method486(0, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field259.method479(false, var16);
                        if ((var17 & 1) != 0) {
                            this.field259.method478(0, var16);
                        }
                    }
                    int var18 = this.field259.method487();
                    while (this.field259.method487() > 0) {
                        int var19 = var18 - this.field259.method487();
                        if (var19 > 0) {
                            this.method110("Loading models - " + var19 * 100 / var18 + "%", 70, (byte) -27);
                        }
                        this.method154(-24622);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field230[0] != null) {
                        this.method110("Requesting maps", 75, (byte) -27);
                        this.field259.method478(3, this.field259.method475((byte) 76, 48, 47, 0));
                        this.field259.method478(3, this.field259.method475((byte) 76, 48, 47, 1));
                        this.field259.method478(3, this.field259.method475((byte) 76, 48, 48, 0));
                        this.field259.method478(3, this.field259.method475((byte) 76, 48, 48, 1));
                        this.field259.method478(3, this.field259.method475((byte) 76, 48, 49, 0));
                        this.field259.method478(3, this.field259.method475((byte) 76, 48, 49, 1));
                        this.field259.method478(3, this.field259.method475((byte) 76, 47, 47, 0));
                        this.field259.method478(3, this.field259.method475((byte) 76, 47, 47, 1));
                        this.field259.method478(3, this.field259.method475((byte) 76, 47, 48, 0));
                        this.field259.method478(3, this.field259.method475((byte) 76, 47, 48, 1));
                        this.field259.method478(3, this.field259.method475((byte) 76, 148, 48, 0));
                        this.field259.method478(3, this.field259.method475((byte) 76, 148, 48, 1));
                        int var20 = this.field259.method487();
                        while (this.field259.method487() > 0) {
                            int var21 = var20 - this.field259.method487();
                            if (var21 > 0) {
                                this.method110("Loading maps - " + var21 * 100 / var20 + "%", 75, (byte) -27);
                            }
                            this.method154(-24622);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field259.method486(0, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field259.method479(false, var23);
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
                            this.field259.method473((byte) 4, var25, 0, var23);
                        }
                    }
                    this.field259.method483(field190, 402);
                    if (!field191) {
                        int var26 = this.field259.method486(0, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field259.method492(var27, -469)) {
                                this.field259.method473((byte) 4, (byte) 1, 2, var27);
                            }
                        }
                    }
                    this.method110("Unpacking media", 80, (byte) -27);
                    this.field285 = new class10(var6, "invback", 0);
                    this.field287 = new class10(var6, "chatback", 0);
                    this.field286 = new class10(var6, "mapback", 0);
                    this.field482 = new class10(var6, "backbase1", 0);
                    this.field483 = new class10(var6, "backbase2", 0);
                    this.field484 = new class10(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field139[var28] = new class10(var6, "sideicons", var28);
                    }
                    this.field345 = new class57(var6, "compass", 0);
                    this.field87 = new class57(var6, "mapedge", 0);
                    this.field87.method496(-10854);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field418[var29] = new class10(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field357[var30] = new class57(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field110[var31] = new class57(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field499[var32] = new class57(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field347 = new class57(var6, "mapmarker", 0);
                    this.field348 = new class57(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field470[var33] = new class57(var6, "cross", var33);
                    }
                    this.field381 = new class57(var6, "mapdots", 0);
                    this.field382 = new class57(var6, "mapdots", 1);
                    this.field383 = new class57(var6, "mapdots", 2);
                    this.field384 = new class57(var6, "mapdots", 3);
                    this.field385 = new class57(var6, "mapdots", 4);
                    this.field114 = new class10(var6, "scrollbar", 0);
                    this.field115 = new class10(var6, "scrollbar", 1);
                    this.field161 = new class10(var6, "redstone1", 0);
                    this.field162 = new class10(var6, "redstone2", 0);
                    this.field163 = new class10(var6, "redstone3", 0);
                    this.field164 = new class10(var6, "redstone1", 0);
                    this.field164.method183(false);
                    this.field165 = new class10(var6, "redstone2", 0);
                    this.field165.method183(false);
                    this.field438 = new class10(var6, "redstone1", 0);
                    this.field438.method184(false);
                    this.field439 = new class10(var6, "redstone2", 0);
                    this.field439.method184(false);
                    this.field440 = new class10(var6, "redstone3", 0);
                    this.field440.method184(false);
                    this.field441 = new class10(var6, "redstone1", 0);
                    this.field441.method183(false);
                    this.field441.method184(false);
                    this.field442 = new class10(var6, "redstone2", 0);
                    this.field442.method183(false);
                    this.field442.method184(false);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field107[var34] = new class10(var6, "mod_icons", var34);
                    }
                    class57 var35 = new class57(var6, "backleft1", 0);
                    this.field361 = new class6(var35.field1530, this.method140(9), (byte) 47, var35.field1529);
                    var35.method497(0, 0, (byte) -58);
                    class57 var36 = new class57(var6, "backleft2", 0);
                    this.field362 = new class6(var36.field1530, this.method140(9), (byte) 47, var36.field1529);
                    var36.method497(0, 0, (byte) -58);
                    class57 var37 = new class57(var6, "backright1", 0);
                    this.field363 = new class6(var37.field1530, this.method140(9), (byte) 47, var37.field1529);
                    var37.method497(0, 0, (byte) -58);
                    class57 var38 = new class57(var6, "backright2", 0);
                    this.field364 = new class6(var38.field1530, this.method140(9), (byte) 47, var38.field1529);
                    var38.method497(0, 0, (byte) -58);
                    class57 var39 = new class57(var6, "backtop1", 0);
                    this.field365 = new class6(var39.field1530, this.method140(9), (byte) 47, var39.field1529);
                    var39.method497(0, 0, (byte) -58);
                    class57 var40 = new class57(var6, "backvmid1", 0);
                    this.field366 = new class6(var40.field1530, this.method140(9), (byte) 47, var40.field1529);
                    var40.method497(0, 0, (byte) -58);
                    class57 var41 = new class57(var6, "backvmid2", 0);
                    this.field367 = new class6(var41.field1530, this.method140(9), (byte) 47, var41.field1529);
                    var41.method497(0, 0, (byte) -58);
                    class57 var42 = new class57(var6, "backvmid3", 0);
                    this.field368 = new class6(var42.field1530, this.method140(9), (byte) 47, var42.field1529);
                    var42.method497(0, 0, (byte) -58);
                    class57 var43 = new class57(var6, "backhmid2", 0);
                    this.field369 = new class6(var43.field1530, this.method140(9), (byte) 47, var43.field1529);
                    var43.method497(0, 0, (byte) -58);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field357[var48] != null) {
                            this.field357[var48].method495(false, var45 + var47, var44 + var47, var46 + var47);
                        }
                        if (this.field418[var48] != null) {
                            this.field418[var48].method185(false, var45 + var47, var44 + var47, var46 + var47);
                        }
                    }
                    this.method110("Unpacking textures", 83, (byte) -27);
                    class47.method436(var7, (byte) 4);
                    class47.method440((byte) 70, 0.8D);
                    class47.method435(20, true);
                    this.method110("Unpacking config", 86, (byte) -27);
                    class42.method414(0, var4);
                    class53.method466(var4);
                    class13.method211(0, var4);
                    class24.method300(var4);
                    class26.method311(var4);
                    class43.method417(0, var4);
                    class21.method229(0, var4);
                    class41.method412(0, var4);
                    class59.method507(0, var4);
                    class24.field829 = field190;
                    if (!field191) {
                        this.method110("Unpacking sounds", 90, (byte) -27);
                        byte[] var49 = var9.method180("sounds.dat", (byte[]) null);
                        class62 var50 = new class62(-417, var49);
                        class72.method586(0, var50);
                    }
                    this.method110("Unpacking interfaces", 95, (byte) -27);
                    class4[] var51 = new class4[] { this.field292, this.field293, this.field294, this.field295 };
                    class48.method452(true, var51, var6, var5);
                    this.method110("Preparing game engine", 100, (byte) -27);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field286.field595[this.field286.field597 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field327[var52] = var53;
                        this.field297[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field286.field595[this.field286.field597 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field519[var56 - 5] = var57 - 25;
                        this.field346[var56 - 5] = var58 - var57;
                    }
                    class47.method433(96, 479, true);
                    this.field511 = class47.field1228;
                    class47.method433(261, 190, true);
                    this.field512 = class47.field1228;
                    class47.method433(334, 512, true);
                    this.field513 = class47.field1228;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class47.field1226[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class22.method269(500, 512, var60, 334, true, 800);
                    class33.method337(var8);
                    this.field325 = new class40(this, -14552);
                    this.method93(this.field325, 10);
                    class39.field1124 = this;
                    class53.field1422 = this;
                    class26.field895 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field166 + " " + this.field412);
                    this.field356 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLAKHMHBY;IIZLXOUQUKZW;)V")
    private final void method115(class38 arg0, int arg1, int arg2, boolean arg3, class62 arg4) {
        if (arg3) {
            this.field272 = null;
        }
        if ((arg1 & 1) != 0) {
            arg0.field1335 = arg4.method549(0);
            if (arg0.field1335 == 65535) {
                arg0.field1335 = -1;
            }
        }
        if ((arg1 & 4) != 0) {
            arg0.field1350 = arg4.method528();
            if (arg0.field1350.charAt(0) == '~') {
                arg0.field1350 = arg0.field1350.substring(1);
                this.method100(arg0.field1114, 2, 14378, arg0.field1350);
            } else if (field113 == arg0) {
                this.method100(arg0.field1114, 2, 14378, arg0.field1350);
            }
            arg0.field1331 = 0;
            arg0.field1349 = 0;
            arg0.field1342 = 150;
        }
        if ((arg1 & 1024) != 0) {
            arg0.field1336 = arg4.method548(false);
            int var6 = arg4.method555(true);
            arg0.field1340 = var6 >> 16;
            arg0.field1339 = (var6 & 65535) + field487;
            arg0.field1337 = 0;
            arg0.field1338 = 0;
            if (arg0.field1339 > field487) {
                arg0.field1337 = -1;
            }
            if (arg0.field1336 == 65535) {
                arg0.field1336 = -1;
            }
        }
        if ((arg1 & 128) != 0) {
            int var7 = arg4.method548(false);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = arg4.method541((byte) 13);
            if (arg0.field1319 == var7 && var7 != -1) {
                int var9 = class42.field1158[var7].field1172;
                if (var9 == 1) {
                    arg0.field1320 = 0;
                    arg0.field1321 = 0;
                    arg0.field1322 = var8;
                    arg0.field1323 = 0;
                }
                if (var9 == 2) {
                    arg0.field1323 = 0;
                }
            } else if (var7 == -1 || arg0.field1319 == -1 || class42.field1158[var7].field1166 >= class42.field1158[arg0.field1319].field1166) {
                arg0.field1319 = var7;
                arg0.field1320 = 0;
                arg0.field1321 = 0;
                arg0.field1322 = var8;
                arg0.field1323 = 0;
                arg0.field1318 = arg0.field1369;
            }
        }
        if ((arg1 & 256) != 0) {
            arg0.field1355 = arg4.method540(695);
            arg0.field1357 = arg4.method541((byte) 13);
            arg0.field1356 = arg4.method521();
            arg0.field1358 = arg4.method540(695);
            arg0.field1359 = arg4.method550(-397) + field487;
            arg0.field1360 = arg4.method550(-397) + field487;
            arg0.field1361 = arg4.method540(695);
            arg0.method456((byte) 109);
        }
        if ((arg1 & 512) != 0) {
            int var10 = arg4.method540(695);
            int var11 = arg4.method540(695);
            arg0.method455((byte) 3, var11, field487, var10);
            arg0.field1344 = field487 + 300;
            arg0.field1345 = arg4.method541((byte) 13);
            arg0.field1346 = arg4.method541((byte) 13);
        }
        if ((arg1 & 8) != 0) {
            arg0.field1347 = arg4.method548(false);
            arg0.field1348 = arg4.method548(false);
        }
        if ((arg1 & 2) != 0) {
            int var12 = arg4.method550(-397);
            int var13 = arg4.method539(319);
            int var14 = arg4.method539(319);
            int var15 = arg4.field1579;
            if (arg0.field1114 != null && arg0.field1092) {
                long var16 = class67.method563(arg0.field1114);
                boolean var18 = false;
                if (var13 <= 1) {
                    for (int var19 = 0; var19 < this.field241; ++var19) {
                        if (this.field69[var19] == var16) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && this.field478 == 0) {
                    try {
                        this.field224.field1579 = 0;
                        arg4.method558(var14, 0, this.field224.field1578, false);
                        this.field224.field1579 = 0;
                        String var20 = class15.method216(this.field224, var14, (byte) 106);
                        String var21 = class33.method347(true, var20);
                        arg0.field1350 = var21;
                        arg0.field1331 = var12 >> 8;
                        arg0.field1349 = var12 & 255;
                        arg0.field1342 = 150;
                        if (var13 != 2 && var13 != 3) {
                            if (var13 == 1) {
                                this.method100("@cr1@" + arg0.field1114, 1, 14378, var21);
                            } else {
                                this.method100(arg0.field1114, 2, 14378, var21);
                            }
                        } else {
                            this.method100("@cr2@" + arg0.field1114, 1, 14378, var21);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field1579 = var14 + var15;
        }
        if ((arg1 & 32) != 0) {
            int var23 = arg4.method541((byte) 13);
            int var24 = arg4.method521();
            arg0.method455((byte) 3, var24, field487, var23);
            arg0.field1344 = field487 + 300;
            arg0.field1345 = arg4.method541((byte) 13);
            arg0.field1346 = arg4.method539(319);
        }
        if ((arg1 & 16) != 0) {
            int var25 = arg4.method541((byte) 13);
            byte[] var26 = new byte[var25];
            class62 var27 = new class62(-417, var26);
            arg4.method530(0, var25, var26, (byte) 2);
            this.field255[arg2] = var27;
            arg0.method410((byte) 73, var27);
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method116(int arg0) {
        this.field244.method176(-179);
        if (this.field126 == 2) {
            byte[] var2 = this.field286.field595;
            int[] var3 = class29.field942;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field345.method503(31473, 33, 0, this.field74, 33, 25, 25, 256, 0, this.field327, this.field297);
            this.field245.method176(-179);
        } else {
            int var6 = this.field74 + this.field523 & 2047;
            int var7 = field113.field1326 / 32 + 48;
            int var8 = 464 - field113.field1327 / 32;
            this.field469.method503(31473, 146, 5, var6, 151, var7, var8, this.field236 + 256, 25, this.field519, this.field346);
            this.field345.method503(31473, 33, 0, this.field74, 33, 25, 25, 256, 0, this.field327, this.field297);
            for (int var9 = 0; var9 < this.field169; ++var9) {
                int var40 = this.field170[var9] * 4 + 2 - field113.field1326 / 32;
                int var41 = this.field171[var9] * 4 + 2 - field113.field1327 / 32;
                this.method145((byte) 8, var40, this.field92[var9], var41);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var36 = 0; var36 < 104; ++var36) {
                    class31 var37 = this.field272[this.field123][var10][var36];
                    if (var37 != null) {
                        int var38 = var10 * 4 + 2 - field113.field1326 / 32;
                        int var39 = var36 * 4 + 2 - field113.field1327 / 32;
                        this.method145((byte) 8, var38, this.field381, var39);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field226; ++var11) {
                class3 var32 = this.field225[this.field227[var11]];
                if (var32 != null && var32.method12(this.field145)) {
                    class26 var33 = var32.field41;
                    if (var33.field904 != null) {
                        var33 = var33.method308((byte) 3);
                    }
                    if (var33 != null && var33.field918 && var33.field905) {
                        int var34 = var32.field1326 / 32 - field113.field1326 / 32;
                        int var35 = var32.field1327 / 32 - field113.field1327 / 32;
                        this.method145((byte) 8, var34, this.field382, var35);
                    }
                }
            }
            int var12 = 74 / arg0;
            for (int var13 = 0; var13 < this.field251; ++var13) {
                class38 var24 = this.field250[this.field252[var13]];
                if (var24 != null && var24.method12(this.field145)) {
                    int var25 = var24.field1326 / 32 - field113.field1326 / 32;
                    int var26 = var24.field1327 / 32 - field113.field1327 / 32;
                    boolean var27 = false;
                    long var28 = class67.method563(var24.field1114);
                    for (int var30 = 0; var30 < this.field200; ++var30) {
                        if (this.field378[var30] == var28 && this.field116[var30] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var31 = false;
                    if (field113.field1091 != 0 && var24.field1091 != 0 && field113.field1091 == var24.field1091) {
                        var31 = true;
                    }
                    if (var27) {
                        this.method145((byte) 8, var25, this.field384, var26);
                    } else if (var31) {
                        this.method145((byte) 8, var25, this.field385, var26);
                    } else {
                        this.method145((byte) 8, var25, this.field383, var26);
                    }
                }
            }
            if (this.field296 != 0 && field487 % 20 < 10) {
                if (this.field296 == 1 && this.field410 >= 0 && this.field410 < this.field225.length) {
                    class3 var14 = this.field225[this.field410];
                    if (var14 != null) {
                        int var15 = var14.field1326 / 32 - field113.field1326 / 32;
                        int var16 = var14.field1327 / 32 - field113.field1327 / 32;
                        this.method90(var16, var15, this.field496, this.field348);
                    }
                }
                if (this.field296 == 2) {
                    int var17 = (this.field193 - this.field217) * 4 + 2 - field113.field1326 / 32;
                    int var18 = (this.field194 - this.field218) * 4 + 2 - field113.field1327 / 32;
                    this.method90(var18, var17, this.field496, this.field348);
                }
                if (this.field296 == 10 && this.field458 >= 0 && this.field458 < this.field250.length) {
                    class38 var19 = this.field250[this.field458];
                    if (var19 != null) {
                        int var20 = var19.field1326 / 32 - field113.field1326 / 32;
                        int var21 = var19.field1327 / 32 - field113.field1327 / 32;
                        this.method90(var21, var20, this.field496, this.field348);
                    }
                }
            }
            if (this.field467 != 0) {
                int var22 = this.field467 * 4 + 2 - field113.field1326 / 32;
                int var23 = this.field468 * 4 + 2 - field113.field1327 / 32;
                this.method145((byte) 8, var22, this.field347, var23);
            }
            class29.method322((byte) -37, 78, 97, 16777215, 3, 3);
            this.field245.method176(-179);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method117(boolean arg0) {
        this.field179 &= arg0;
        if (this.field353 == 0) {
            int var2 = super.field802 / 2 - 80;
            int var3 = super.field803 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field818 == 1 && super.field819 >= var2 - 75 && super.field819 <= var2 + 75 && super.field820 >= var14 - 20 && super.field820 <= var14 + 20) {
                this.field353 = 3;
                this.field263 = 0;
            }
            int var4 = super.field802 / 2 + 80;
            if (super.field818 == 1 && super.field819 >= var4 - 75 && super.field819 <= var4 + 75 && super.field820 >= var14 - 20 && super.field820 <= var14 + 20) {
                this.field93 = "";
                this.field94 = "Enter your username & password.";
                this.field353 = 2;
                this.field263 = 0;
            }
        } else if (this.field353 == 2) {
            int var5 = super.field803 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field818 == 1 && super.field820 >= var16 - 15 && super.field820 < var16) {
                this.field263 = 0;
            }
            var5 = var16 + 15;
            if (super.field818 == 1 && super.field820 >= var5 - 15 && super.field820 < var5) {
                this.field263 = 1;
            }
            var5 += 15;
            int var6 = super.field802 / 2 - 80;
            int var7 = super.field803 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field818 == 1 && super.field819 >= var6 - 75 && super.field819 <= var6 + 75 && super.field820 >= var17 - 20 && super.field820 <= var17 + 20) {
                this.field447 = 0;
                this.method43(this.field400, this.field401, false);
                if (this.field179) {
                    return;
                }
            }
            int var8 = super.field802 / 2 + 80;
            if (super.field818 == 1 && super.field819 >= var8 - 75 && super.field819 <= var8 + 75 && super.field820 >= var17 - 20 && super.field820 <= var17 + 20) {
                this.field353 = 0;
                this.field400 = "";
                this.field401 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method288(0);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field495.length(); ++var11) {
                        if (var9 == field495.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field263 == 0) {
                        if (var9 == 8 && this.field400.length() > 0) {
                            this.field400 = this.field400.substring(0, this.field400.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field263 = 1;
                        }
                        if (var10) {
                            this.field400 = this.field400 + (char) var9;
                        }
                        if (this.field400.length() > 12) {
                            this.field400 = this.field400.substring(0, 12);
                        }
                    } else if (this.field263 == 1) {
                        if (var9 == 8 && this.field401.length() > 0) {
                            this.field401 = this.field401.substring(0, this.field401.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field263 = 0;
                        }
                        if (var10) {
                            this.field401 = this.field401 + (char) var9;
                        }
                        if (this.field401.length() > 20) {
                            this.field401 = this.field401.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field353 == 3) {
                int var12 = super.field802 / 2;
                int var13 = super.field803 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field818 == 1 && super.field819 >= var12 - 75 && super.field819 <= var12 + 75 && super.field820 >= var18 - 20 && super.field820 <= var18 + 20) {
                    this.field353 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method118(byte arg0) {
        if (this.field534 > 0) {
            this.method96(20701);
        } else {
            this.field245.method176(-179);
            this.field293.method15(144, true, 257, 0, "Connection lost");
            this.field293.method15(143, true, 256, 16777215, "Connection lost");
            this.field293.method15(159, true, 257, 0, "Please wait - attempting to reestablish");
            this.field293.method15(158, true, 256, 16777215, "Please wait - attempting to reestablish");
            this.field245.method177(4, true, super.field804, 4);
            this.field126 = 0;
            this.field467 = 0;
            if (arg0 != 21) {
                field182 = !field182;
            }
            class1 var2 = this.field309;
            this.field179 = false;
            this.field447 = 0;
            this.method43(this.field400, this.field401, true);
            if (!this.field179) {
                this.method96(20701);
            }
            try {
                var2.method1();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method119(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg3 >= this.field205 && arg3 <= this.field205) {
                if (arg0 < 3 && (this.field506[1][var5][var6] & 2) == 2) {
                    var7 = arg0 + 1;
                }
                int var8 = arg2 & 127;
                int var9 = arg1 & 127;
                int var10 = (128 - var8) * this.field358[var7][var5][var6] + this.field358[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field358[var7][var5][var6 + 1] + this.field358[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            } else {
                return this.field205;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public static final void method120(int arg0) {
        if (arg0 == 0) {
            class22.field728 = false;
            class47.field1217 = false;
            field191 = false;
            class11.field633 = false;
            class53.field1443 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXOUQUKZW;BI)V")
    private final void method121(class62 arg0, byte arg1, int arg2) {
        this.field256 = 0;
        this.field253 = 0;
        this.method167(arg0, arg2, field177);
        this.method146(arg2, arg0, -136);
        this.method97(arg0, 3, arg2);
        for (int var4 = 0; var4 < this.field256; ++var4) {
            int var6 = this.field257[var4];
            if (field487 != this.field225[var6].field1329) {
                this.field225[var6].field41 = null;
                this.field225[var6] = null;
            }
        }
        if (arg1 != 1) {
            this.field531 = arg0.method521();
        }
        if (arg0.field1579 != arg2) {
            signlink.reporterror(this.field400 + " size mismatch in getnpcpos - pos:" + arg0.field1579 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field226; ++var5) {
                if (this.field225[this.field227[var5]] == null) {
                    signlink.reporterror(this.field400 + " null entry in npc list - pos:" + var5 + " size:" + this.field226);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Z")
    public final boolean method122(int arg0, int arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field509[arg0];
            if (arg1 != 46867) {
                this.method114();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 290;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method123(byte[] arg0, int arg1, int arg2) {
        if (arg2 != -48855) {
            throw new NullPointerException();
        } else {
            return arg0 == null ? true : signlink.wavesave(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIZI)V")
    public final void method124(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.field114.method186(arg1, arg0, 412);
        this.field115.method186(arg1 + arg3 - 16, arg0, 412);
        class29.method322((byte) -37, arg1 + 16, arg0, this.field370, 16, arg3 - 32);
        int var7 = (arg3 - 32) * arg3 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg5 / (arg2 - arg3);
        class29.method322((byte) -37, arg1 + 16 + var8, arg0, this.field399, 16, var7);
        class29.method327(this.field351, var7, arg0, arg1 + 16 + var8, 1);
        class29.method327(this.field351, var7, arg0 + 1, arg1 + 16 + var8, 1);
        class29.method325((byte) 3, this.field351, 16, arg0, arg1 + 16 + var8);
        if (!arg4) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        class29.method325((byte) 3, this.field351, 16, arg0, arg1 + 17 + var8);
        class29.method327(this.field317, var7, arg0 + 15, arg1 + 16 + var8, 1);
        class29.method327(this.field317, var7 - 1, arg0 + 14, arg1 + 17 + var8, 1);
        class29.method325((byte) 3, this.field317, 16, arg0, arg1 + 15 + var8 + var7);
        class29.method325((byte) 3, this.field317, 15, arg0 + 1, arg1 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method125(int arg0) {
        try {
            this.field515 = -1;
            this.field288.method336();
            this.field70.method336();
            class47.method434(612);
            this.method147((byte) 9);
            this.field397.method233((byte) 42);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field372[var2].method569();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field506[var3][var4][var5] = 0;
                    }
                }
            }
            class11 var6 = new class11(104, true, this.field358, this.field506, 104);
            int var7 = this.field525.length;
            this.field159.method510(134, -266);
            if (!this.field375) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field130[var8] >> 8) * 64 - this.field217;
                    int var10 = (this.field130[var8] & 255) * 64 - this.field218;
                    byte[] var11 = this.field525[var8];
                    if (var11 != null) {
                        var6.method200(var10, var11, (this.field271 - 6) * 8, (this.field270 - 6) * 8, var9, -48, this.field372);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field130[var12] >> 8) * 64 - this.field217;
                    int var14 = (this.field130[var12] & 255) * 64 - this.field218;
                    byte[] var15 = this.field525[var12];
                    if (var15 == null && this.field271 < 800) {
                        var6.method194(var14, 64, (byte) 36, 64, var13);
                    }
                }
                this.field159.method510(134, -266);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field424[var16];
                    if (var17 != null) {
                        int var18 = (this.field130[var16] >> 8) * 64 - this.field217;
                        int var19 = (this.field130[var16] & 255) * 64 - this.field218;
                        var6.method205(var18, this.field397, var19, var17, this.field372, this.field419);
                    }
                }
            }
            if (this.field375) {
                int var20 = 0;
                label253: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field308[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method194(var31 * 8, 8, (byte) 36, 8, var30 * 8);
                                }
                            }
                        }
                        this.field159.method510(134, -266);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label253;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field308[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field130.length; ++var42) {
                                            if (this.field130[var42] == var41 && this.field424[var42] != null) {
                                                var6.method190(var34 * 8, var38, (var40 & 7) * 8, this.field424[var42], var33, true, (var39 & 7) * 8, var37, this.field372, this.field397, var35 * 8);
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
                            int var23 = this.field308[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field130.length; ++var29) {
                                    if (this.field130[var29] == var28 && this.field525[var29] != null) {
                                        var6.method203((var27 & 7) * 8, var21 * 8, this.field372, true, this.field525[var29], var25, var20, var24, var22 * 8, (var26 & 7) * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field159.method510(134, -266);
            var6.method204(this.field372, this.field397, false);
            this.field245.method176(-179);
            this.field159.method510(134, -266);
            int var43 = class11.field608;
            if (var43 > this.field123) {
                var43 = this.field123;
            }
            if (var43 < this.field123 - 1) {
                int var44 = this.field123 - 1;
            }
            if (field191) {
                this.field397.method234(false, class11.field608);
            } else {
                this.field397.method234(false, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method136(var45, var46);
                }
            }
            this.method85(this.field261);
        } catch (Exception var59) {
        }
        class53.field1453.method304();
        while (arg0 >= 0) {
            this.field531 = -1;
        }
        if (super.field807 != null) {
            this.field159.method510(126, -266);
            this.field159.method515(1057001181);
        }
        if (field191 && signlink.cache_dat != null) {
            int var48 = this.field259.method486(0, 0);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field259.method479(false, var49);
                if ((var50 & 121) == 0) {
                    class35.method378(false, var49);
                }
            }
        }
        System.gc();
        class47.method435(20, true);
        this.field259.method484(true);
        int var51 = (this.field270 - 6) / 8 - 1;
        int var52 = (this.field270 + 6) / 8 + 1;
        int var53 = (this.field271 - 6) / 8 - 1;
        int var54 = (this.field271 + 6) / 8 + 1;
        if (this.field109) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field259.method475((byte) 76, var56, var55, 0);
                    if (var57 != -1) {
                        this.field259.method476(-838, 3, var57);
                    }
                    int var58 = this.field259.method475((byte) 76, var56, var55, 1);
                    if (var58 != -1) {
                        this.field259.method476(-838, 3, var58);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIZZIII)Z")
    public final boolean method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field265[var15][var35] = 0;
                this.field215[var15][var35] = 99999999;
            }
        }
        int var16 = arg4;
        int var17 = arg9;
        this.field265[arg4][arg9] = 99;
        this.field215[arg4][arg9] = 0;
        byte var18 = 0;
        int var19 = 0;
        if (arg7) {
            this.field272 = null;
        }
        this.field136[var18] = arg4;
        int var36 = var18 + 1;
        this.field137[var18] = arg9;
        boolean var20 = false;
        int var21 = this.field136.length;
        int[][] var22 = this.field372[this.field123].field1644;
        while (var36 != var19) {
            var16 = this.field136[var19];
            var17 = this.field137[var19];
            var19 = (var19 + 1) % var21;
            if (arg6 == var16 && arg1 == var17) {
                var20 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && this.field372[this.field123].method578(var16, var17, arg2 - 1, arg6, arg11, arg1, 25096)) {
                    var20 = true;
                    break;
                }
                if (arg2 < 10 && this.field372[this.field123].method579(arg2 - 1, arg6, arg1, this.field342, var17, arg11, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg10 != 0 && this.field372[this.field123].method580(arg10, arg1, var17, var16, this.field147, arg0, arg6, arg5)) {
                var20 = true;
                break;
            }
            int var34 = this.field215[var16][var17] + 1;
            if (var16 > 0 && this.field265[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field136[var36] = var16 - 1;
                this.field137[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field265[var16 - 1][var17] = 2;
                this.field215[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field265[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field136[var36] = var16 + 1;
                this.field137[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field265[var16 + 1][var17] = 8;
                this.field215[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field265[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field136[var36] = var16;
                this.field137[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field265[var16][var17 - 1] = 1;
                this.field215[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field265[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field136[var36] = var16;
                this.field137[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field265[var16][var17 + 1] = 4;
                this.field215[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field265[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field136[var36] = var16 - 1;
                this.field137[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field265[var16 - 1][var17 - 1] = 3;
                this.field215[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field265[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field136[var36] = var16 + 1;
                this.field137[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field265[var16 + 1][var17 - 1] = 9;
                this.field215[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field265[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field136[var36] = var16 - 1;
                this.field137[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field265[var16 - 1][var17 + 1] = 6;
                this.field215[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field265[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field136[var36] = var16 + 1;
                this.field137[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field265[var16 + 1][var17 + 1] = 12;
                this.field215[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field349 = 0;
        if (!var20) {
            if (arg8) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg6 - var24; var25 <= arg6 + var24; ++var25) {
                        for (int var26 = arg1 - var24; var26 <= arg1 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field215[var25][var26] < var23) {
                                var23 = this.field215[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field349 = 1;
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
        int var29 = var28 = this.field265[var16][var17];
        while (arg4 != var16 || arg9 != var17) {
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
            var29 = this.field265[var16][var17];
        }
        if (var37 <= 0) {
            if (arg3 == 1) {
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
            if (arg3 == 0) {
                this.field159.method510(24, -266);
                this.field159.method511(var30 + var30 + 3);
            }
            if (arg3 == 1) {
                this.field159.method510(36, -266);
                this.field159.method511(var30 + var30 + 3 + 14);
            }
            if (arg3 == 2) {
                this.field159.method510(19, -266);
                this.field159.method511(var30 + var30 + 3);
            }
            this.field467 = this.field136[0];
            this.field468 = this.field137[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field159.method511(this.field136[var37] - var31);
                this.field159.method538(3, this.field137[var37] - var32);
            }
            this.field159.method511(super.field822[5] == 1 ? 1 : 0);
            this.field159.method512(this.field218 + var32);
            this.field159.method512(this.field217 + var31);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method127(byte arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field126 == 0) {
            if (super.field818 == 1) {
                int var3 = super.field819 - 25 - 550;
                int var4 = super.field820 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field74 + this.field523 & 2047;
                    int var6 = class47.field1226[var5];
                    int var7 = class47.field1227[var5];
                    int var8 = (this.field236 + 256) * var6 >> 8;
                    int var9 = (this.field236 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field113.field1326 + var10 >> 7;
                    int var13 = field113.field1327 - var11 >> 7;
                    boolean var14 = this.method126(0, var13, 0, 1, field113.field1362[0], 0, var12, false, true, field113.field1363[0], 0, 0);
                    if (var14) {
                        this.field159.method511(var3);
                        this.field159.method511(var4);
                        this.field159.method512(this.field74);
                        this.field159.method511(57);
                        this.field159.method511(this.field523);
                        this.field159.method511(this.field236);
                        this.field159.method511(89);
                        this.field159.method512(field113.field1326);
                        this.field159.method512(field113.field1327);
                        this.field159.method511(this.field349);
                        this.field159.method511(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBILPFVGIFDY;I)V")
    public final void method128(int arg0, byte arg1, int arg2, class48 arg3, int arg4) {
        if (arg3.field1260 == 0 && arg3.field1256 != null) {
            if (!arg3.field1254 || this.field111 == arg3.field1285 || this.field274 == arg3.field1285 || this.field173 == arg3.field1285) {
                int var6 = class29.field947;
                int var7 = class29.field945;
                int var8 = class29.field948;
                int var9 = class29.field946;
                class29.method319(arg3.field1280 + arg2, 7, arg0, arg2, arg3.field1245 + arg0);
                if (arg1 != -111) {
                    this.field159.method511(135);
                }
                int var10 = arg3.field1256.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field1247[var11] + arg2;
                    int var13 = arg3.field1293[var11] + arg0 - arg4;
                    class48 var14 = class48.field1246[arg3.field1256[var11]];
                    int var15 = var14.field1265 + var12;
                    int var16 = var14.field1244 + var13;
                    if (var14.field1262 > 0) {
                        this.method168(1, var14);
                    }
                    if (var14.field1260 == 0) {
                        if (var14.field1286 > var14.field1281 - var14.field1245) {
                            var14.field1286 = var14.field1281 - var14.field1245;
                        }
                        if (var14.field1286 < 0) {
                            var14.field1286 = 0;
                        }
                        this.method128(var16, this.field500, var15, var14, var14.field1286);
                        if (var14.field1281 > var14.field1245) {
                            this.method124(var14.field1280 + var15, var16, var14.field1281, var14.field1245, true, var14.field1286);
                        }
                    } else if (var14.field1260 != 1) {
                        if (var14.field1260 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1245; ++var18) {
                                for (int var19 = 0; var19 < var14.field1280; ++var19) {
                                    int var20 = (var14.field1255 + 32) * var19 + var15;
                                    int var21 = (var14.field1279 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1267[var17];
                                        var21 += var14.field1291[var17];
                                    }
                                    if (var14.field1272[var17] <= 0) {
                                        if (var14.field1271 != null && var17 < 20) {
                                            class57 var30 = var14.field1271[var17];
                                            if (var30 != null) {
                                                var30.method499(var21, var20, 412);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1272[var17] - 1;
                                        if (var20 > class29.field947 - 32 && var20 < class29.field948 && var21 > class29.field945 - 32 && var21 < class29.field946 || this.field233 != 0 && this.field232 == var17) {
                                            int var25 = 0;
                                            if (this.field303 == 1 && this.field304 == var17 && this.field305 == var14.field1285) {
                                                var25 = 16777215;
                                            }
                                            class57 var26 = class24.method292(var14.field1268[var17], var25, var24, -25);
                                            if (var26 != null) {
                                                if (this.field233 != 0 && this.field232 == var17 && this.field231 == var14.field1285) {
                                                    var22 = super.field812 - this.field234;
                                                    var23 = super.field813 - this.field235;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field329 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method501(var20 + var22, 128, this.field485, var21 + var23);
                                                    if (var21 + var23 < class29.field945 && arg3.field1286 > 0) {
                                                        int var27 = (class29.field945 - var21 - var23) * this.field542 / 3;
                                                        if (var27 > this.field542 * 10) {
                                                            var27 = this.field542 * 10;
                                                        }
                                                        if (var27 > arg3.field1286) {
                                                            var27 = arg3.field1286;
                                                        }
                                                        arg3.field1286 -= var27;
                                                        this.field235 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class29.field946 && arg3.field1286 < arg3.field1281 - arg3.field1245) {
                                                        int var28 = (var21 + var23 + 32 - class29.field946) * this.field542 / 3;
                                                        if (var28 > this.field542 * 10) {
                                                            var28 = this.field542 * 10;
                                                        }
                                                        if (var28 > arg3.field1281 - arg3.field1245 - arg3.field1286) {
                                                            var28 = arg3.field1281 - arg3.field1245 - arg3.field1286;
                                                        }
                                                        arg3.field1286 += var28;
                                                        this.field235 -= var28;
                                                    }
                                                } else if (this.field323 != 0 && this.field322 == var17 && this.field321 == var14.field1285) {
                                                    var26.method501(var20, 128, this.field485, var21);
                                                } else {
                                                    var26.method499(var21, var20, 412);
                                                }
                                                if (var26.field1533 == 33 || var14.field1268[var17] != 1) {
                                                    int var29 = var14.field1268[var17];
                                                    this.field292.method19(method174((byte) 0, var29), 0, var21 + 10 + var23, var20 + 1 + var22, 6972);
                                                    this.field292.method19(method174((byte) 0, var29), 16776960, var21 + 9 + var23, var20 + var22, 6972);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1260 == 3) {
                            boolean var31 = false;
                            if (this.field173 == var14.field1285 || this.field274 == var14.field1285 || this.field111 == var14.field1285) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method112(this.field183, var14)) {
                                var32 = var14.field1284;
                                if (var31 && var14.field1270 != 0) {
                                    var32 = var14.field1270;
                                }
                            } else {
                                var32 = var14.field1263;
                                if (var31 && var14.field1292 != 0) {
                                    var32 = var14.field1292;
                                }
                            }
                            if (var14.field1259 == 0) {
                                if (var14.field1276) {
                                    class29.method322((byte) -37, var16, var15, var32, var14.field1280, var14.field1245);
                                } else {
                                    class29.method323(var14.field1280, var32, var16, var15, (byte) 87, var14.field1245);
                                }
                            } else if (var14.field1276) {
                                class29.method321(var14.field1245, 1, var16, 256 - (var14.field1259 & 255), var14.field1280, var15, var32);
                            } else {
                                class29.method324(256 - (var14.field1259 & 255), var14.field1280, var32, var14.field1245, var16, var15, 0);
                            }
                        } else if (var14.field1260 == 4) {
                            class4 var33 = var14.field1249;
                            String var34 = var14.field1274;
                            boolean var35 = false;
                            if (this.field173 == var14.field1285 || this.field274 == var14.field1285 || this.field111 == var14.field1285) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method112(this.field183, var14)) {
                                var36 = var14.field1284;
                                if (var35 && var14.field1270 != 0) {
                                    var36 = var14.field1270;
                                }
                                if (var14.field1296.length() > 0) {
                                    var34 = var14.field1296;
                                }
                            } else {
                                var36 = var14.field1263;
                                if (var35 && var14.field1292 != 0) {
                                    var36 = var14.field1292;
                                }
                            }
                            if (var14.field1261 == 6 && this.field91) {
                                var34 = "Please wait...";
                                var36 = var14.field1263;
                            }
                            if (class29.field943 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field54 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method138(this.method55(4, false, var14), -506) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method138(this.method55(3, false, var14), -506) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method138(this.method55(2, false, var14), -506) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method138(this.method55(1, false, var14), -506) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method138(this.method55(0, false, var14), -506) + var34.substring(var38 + 2);
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
                                if (var14.field1266) {
                                    var33.method16(var14.field1302, var44, var14.field1280 / 2 + var15, -22293, var37, var36);
                                } else {
                                    var33.method23(var15, var37, var44, true, var36, var14.field1302);
                                }
                                var37 += var33.field54;
                            }
                        } else if (var14.field1260 == 5) {
                            class57 var45;
                            if (this.method112(this.field183, var14)) {
                                var45 = var14.field1282;
                            } else {
                                var45 = var14.field1275;
                            }
                            if (var45 != null) {
                                var45.method499(var16, var15, 412);
                            }
                        } else if (var14.field1260 == 6) {
                            int var46 = class47.field1222;
                            int var47 = class47.field1223;
                            class47.field1222 = var14.field1280 / 2 + var15;
                            class47.field1223 = var14.field1245 / 2 + var16;
                            int var48 = class47.field1226[var14.field1289] * var14.field1288 >> 16;
                            int var49 = class47.field1227[var14.field1289] * var14.field1288 >> 16;
                            boolean var50 = this.method112(this.field183, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field1298;
                            } else {
                                var51 = var14.field1297;
                            }
                            class35 var52;
                            if (var51 == -1) {
                                var52 = var14.method453(-1, var50, 0, -1);
                            } else {
                                class42 var53 = class42.field1158[var51];
                                var52 = var14.method453(var53.field1161[var14.field1294], var50, 0, var53.field1160[var14.field1294]);
                            }
                            if (var52 != null) {
                                var52.method399(0, var14.field1290, 0, var14.field1289, 0, var48, var49);
                            }
                            class47.field1222 = var46;
                            class47.field1223 = var47;
                        } else if (var14.field1260 == 7) {
                            class4 var54 = var14.field1249;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field1245; ++var56) {
                                for (int var57 = 0; var57 < var14.field1280; ++var57) {
                                    if (var14.field1272[var55] > 0) {
                                        class24 var58 = class24.method293(var14.field1272[var55] - 1);
                                        String var59 = var58.field877;
                                        if (var58.field847 || var14.field1268[var55] != 1) {
                                            var59 = var59 + " x" + method171(36829, var14.field1268[var55]);
                                        }
                                        int var60 = (var14.field1255 + 115) * var57 + var15;
                                        int var61 = (var14.field1279 + 12) * var56 + var16;
                                        if (var14.field1266) {
                                            var54.method16(var14.field1302, var59, var14.field1280 / 2 + var60, -22293, var61, var14.field1263);
                                        } else {
                                            var54.method23(var60, var61, var59, true, var14.field1263, var14.field1302);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                class29.method319(var8, 7, var7, var6, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method129(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field177 = -185;
        }
        int var3 = arg0 - arg1;
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

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)Ljava/lang/String;")
    public final String method130(byte arg0) {
        if (arg0 != 1) {
            this.field145 = 200;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field807 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method131(int arg0) {
        while (arg0 >= 0) {
            field97 = this.field105.method405();
        }
        for (class52 var2 = (class52) this.field70.method332(); var2 != null; var2 = (class52) this.field70.method334(-96)) {
            if (this.field123 == var2.field1404 && field487 <= var2.field1396) {
                if (field487 >= var2.field1395) {
                    if (var2.field1394 > 0) {
                        class3 var3 = this.field225[var2.field1394 - 1];
                        if (var3 != null && var3.field1326 >= 0 && var3.field1326 < 13312 && var3.field1327 >= 0 && var3.field1327 < 13312) {
                            var2.method458(var3.field1326, var3.field1327, this.method119(var2.field1404, var3.field1327, var3.field1326, 4) - var2.field1401, field487, -17407);
                        }
                    }
                    if (var2.field1394 < 0) {
                        int var4 = -var2.field1394 - 1;
                        class38 var5;
                        if (this.field85 == var4) {
                            var5 = field113;
                        } else {
                            var5 = this.field250[var4];
                        }
                        if (var5 != null && var5.field1326 >= 0 && var5.field1326 < 13312 && var5.field1327 >= 0 && var5.field1327 < 13312) {
                            var2.method458(var5.field1326, var5.field1327, this.method119(var2.field1404, var5.field1327, var5.field1326, 4) - var2.field1401, field487, -17407);
                        }
                    }
                    var2.method459(this.field542, 0);
                    this.field397.method244(var2.field1407, var2, -1, (int) var2.field1410, 0, (int) var2.field1411, false, (int) var2.field1412, 60, this.field123);
                }
            } else {
                var2.method471();
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method132(int arg0) {
        this.method141((byte) 1);
        if (this.field539 == 1) {
            this.field470[this.field538 / 100].method499(this.field537 - 8 - 4, this.field536 - 8 - 4, 412);
        }
        if (this.field539 == 2) {
            this.field470[this.field538 / 100 + 4].method499(this.field537 - 8 - 4, this.field536 - 8 - 4, 412);
        }
        if (this.field446 != -1) {
            this.method86(this.field446, 292, this.field542);
            this.method128(0, this.field500, 0, class48.field1246[this.field446], 0);
        }
        if (this.field450 != -1) {
            this.method86(this.field450, 292, this.field542);
            this.method128(0, this.field500, 0, class48.field1246[this.field450], 0);
        }
        this.method144(true);
        if (arg0 < 8 || arg0 > 8) {
            this.field279 = -286;
        }
        if (!this.field395) {
            this.method61(true);
            this.method175(-31729);
        } else if (this.field460 == 0) {
            this.method70(false);
        }
        if (this.field180 == 1) {
            this.field499[1].method499(296, 472, 412);
        }
        if (field174) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field800 < 15) {
                var4 = 16711680;
            }
            this.field293.method14("Fps:" + super.field800, var3, false, var2, var4);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field191) {
                int var8 = 16711680;
            }
            this.field293.method14("Mem:" + var6 + "k", var12, false, var2, 16776960);
            var12 += 15;
        }
        if (this.field535 != 0) {
            int var9 = this.field535 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field293.method19("System update in: " + var10 + ":0" + var11, 16776960, 329, 4, 6972);
            } else {
                this.field293.method19("System update in: " + var10 + ":" + var11, 16776960, 329, 4, 6972);
            }
            ++field421;
            if (field421 > 76) {
                field421 = 0;
                this.field159.method510(231, -266);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)Z")
    public final boolean method133(int arg0) {
        if (arg0 <= 0) {
            this.field531 = -1;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method134(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field200 >= 100 && this.field426 != 1) {
                this.method100("", 0, 14378, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field200 >= 200) {
                this.method100("", 0, 14378, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class67.method567(-550, class67.method564(arg0, true));
                if (arg1 == 8) {
                    boolean var5 = false;
                } else {
                    this.field531 = -1;
                }
                for (int var6 = 0; var6 < this.field200; ++var6) {
                    if (this.field378[var6] == arg0) {
                        this.method100("", 0, 14378, var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var7 = 0; var7 < this.field241; ++var7) {
                    if (this.field69[var7] == arg0) {
                        this.method100("", 0, 14378, "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field113.field1114)) {
                    this.field260[this.field200] = var4;
                    this.field378[this.field200] = arg0;
                    this.field116[this.field200] = 0;
                    ++this.field200;
                    this.field493 = true;
                    this.field159.method510(21, -266);
                    this.field159.method517(arg0, this.field141);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method135(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method136(int arg0, int arg1) {
        class31 var3 = this.field272[this.field123][arg0][arg1];
        if (var3 == null) {
            this.field397.method254(this.field123, arg0, arg1);
        } else {
            int var4 = -99999999;
            class65 var5 = null;
            for (class65 var6 = (class65) var3.method332(); var6 != null; var6 = (class65) var3.method334(-96)) {
                class24 var11 = class24.method293(var6.field1618);
                int var12 = var11.field870;
                if (var11.field847) {
                    var12 = (var6.field1619 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method330(var5, 460);
            class65 var7 = null;
            class65 var8 = null;
            for (class65 var9 = (class65) var3.method332(); var9 != null; var9 = (class65) var3.method334(-96)) {
                if (var5.field1618 != var9.field1618 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1618 != var9.field1618 && var7.field1618 != var9.field1618 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field397.method240(this.field443, this.field123, arg1, var10, this.method119(this.field123, arg1 * 128 + 64, arg0 * 128 + 64, 4), var7, var5, arg0, var8);
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field188 = Integer.parseInt(this.getParameter("nodeid"));
        field189 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method71(true);
        } else {
            method120(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field190 = false;
        } else {
            field190 = true;
        }
        this.method285(503, -8753, 765);
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method137(int arg0) {
        while (arg0 >= 0) {
            this.field531 = this.field374.method521();
        }
        this.field185 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field181[var2] = -1;
            for (int var3 = 0; var3 < class43.field1176; ++var3) {
                if (!class43.field1177[var3].field1183 && class43.field1177[var3].field1178 == var2 + (this.field202 ? 0 : 7)) {
                    this.field181[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method138(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field77 = this.field105.method405();
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public void method139(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field273);
        if (this.field259 != null) {
            System.out.println("Od-cycle:" + this.field259.field1508);
        }
        System.out.println("loop-cycle:" + field487);
        System.out.println("draw-cycle:" + field436);
        System.out.println("ptype:" + this.field531);
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field167 = !this.field167;
        }
        System.out.println("psize:" + this.field530);
        if (this.field309 != null) {
            this.field309.method6((byte) 1);
        }
        super.field801 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final Component method140(int arg0) {
        if (arg0 != 9) {
            this.field204 = 389;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field807 != null ? super.field807 : this;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method141(byte arg0) {
        if (this.field298 == arg0) {
            if (this.field150 != 0) {
                class4 var2 = this.field293;
                int var3 = 0;
                if (this.field535 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field415[var4] != null) {
                        int var5 = this.field413[var4];
                        String var6 = this.field414[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field475 == 0 || this.field475 == 1 && this.method161(var6, (byte) -125))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method19("From", 0, var8, var9, 6972);
                            var2.method19("From", 65535, var8 - 1, var9, 6972);
                            int var10 = var9 + var2.method17("From ", false);
                            if (var7 == 1) {
                                this.field107[0].method186(var8 - 12, var10, 412);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field107[1].method186(var8 - 12, var10, 412);
                                var10 += 14;
                            }
                            var2.method19(var6 + ": " + this.field415[var4], 0, var8, var10, 6972);
                            var2.method19(var6 + ": " + this.field415[var4], 65535, var8 - 1, var10, 6972);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field475 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method19(this.field415[var4], 0, var11, 4, 6972);
                            var2.method19(this.field415[var4], 65535, var11 - 1, 4, 6972);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field475 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method19("To " + var6 + ": " + this.field415[var4], 0, var12, 4, 6972);
                            var2.method19("To " + var6 + ": " + this.field415[var4], 65535, var12 - 1, 4, 6972);
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

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLPFVGIFDY;)Z")
    public final boolean method142(boolean arg0, class48 arg1) {
        int var3 = arg1.field1262;
        if (arg0) {
            this.field159.method511(12);
        }
        if (this.field201 == 2) {
            if (var3 == 201) {
                this.field228 = true;
                this.field144 = 0;
                this.field172 = true;
                this.field459 = "";
                this.field266 = 1;
                this.field301 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field228 = true;
                this.field144 = 0;
                this.field172 = true;
                this.field459 = "";
                this.field266 = 2;
                this.field301 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field534 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field228 = true;
                this.field144 = 0;
                this.field172 = true;
                this.field459 = "";
                this.field266 = 4;
                this.field301 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field228 = true;
                this.field144 = 0;
                this.field172 = true;
                this.field459 = "";
                this.field266 = 5;
                this.field301 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field181[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class43.field1176 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class43.field1176) {
                                var6 = 0;
                            }
                        }
                        if (!class43.field1177[var6].field1183 && class43.field1177[var6].field1178 == var4 + (this.field202 ? 0 : 7)) {
                            this.field181[var4] = var6;
                            this.field185 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field88[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field83[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field83[var7].length) {
                        var9 = 0;
                    }
                }
                this.field88[var7] = var9;
                this.field185 = true;
            }
            if (var3 == 324 && !this.field202) {
                this.field202 = true;
                this.method137(-339);
            }
            if (var3 == 325 && this.field202) {
                this.field202 = false;
                this.method137(-339);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field112 = !this.field112;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method94((byte) 59);
                    if (this.field154.length() > 0) {
                        this.field159.method510(175, -266);
                        this.field159.method517(class67.method563(this.field154), this.field141);
                        this.field159.method511(var3 - 601);
                        this.field159.method511(this.field112 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field159.method510(180, -266);
                this.field159.method511(this.field202 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field159.method511(this.field181[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field159.method511(this.field88[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method143(boolean arg0, int arg1) {
        signlink.wavevol = arg1;
        this.field179 &= arg0;
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field269) {
            this.method151(field97);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method144(boolean arg0) {
        if (arg0) {
            this.field478 = 0;
            int var2 = (field113.field1326 >> 7) + this.field217;
            int var3 = (field113.field1327 >> 7) + this.field218;
            if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
                this.field478 = 1;
            }
            if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
                this.field478 = 1;
            }
            if (this.field478 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
                this.field478 = 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILVDSDFSIV;I)V")
    public final void method145(byte arg0, int arg1, class57 arg2, int arg3) {
        int var5 = this.field74 + this.field523 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (arg0 == 8) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        if (var6 <= 6400) {
            int var9 = class35.field1073[var5];
            int var10 = class35.field1074[var5];
            int var11 = var9 * 256 / (this.field236 + 256);
            int var12 = var10 * 256 / (this.field236 + 256);
            int var13 = arg1 * var12 + arg3 * var11 >> 16;
            int var14 = arg3 * var12 - arg1 * var11 >> 16;
            if (var6 > 2500) {
                arg2.method505(var13 + 94 - arg2.field1533 / 2 + 4, this.field286, 83 - var14 - arg2.field1534 / 2 - 4, 0);
            } else {
                arg2.method499(83 - var14 - arg2.field1534 / 2 - 4, var13 + 94 - arg2.field1533 / 2 + 4, 412);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILXOUQUKZW;I)V")
    private final void method146(int arg0, class62 arg1, int arg2) {
        while (true) {
            if (arg1.field1580 + 21 < arg0 * 8) {
                int var4 = arg1.method532(7, 14);
                if (var4 != 16383) {
                    if (this.field225[var4] == null) {
                        this.field225[var4] = new class3();
                    }
                    class3 var5 = this.field225[var4];
                    this.field227[this.field226++] = var4;
                    var5.field1329 = field487;
                    var5.field41 = class26.method309(arg1.method532(7, 12));
                    int var6 = arg1.method532(7, 1);
                    int var7 = arg1.method532(7, 1);
                    if (var7 == 1) {
                        this.field254[this.field253++] = var4;
                    }
                    int var8 = arg1.method532(7, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg1.method532(7, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field1368 = var5.field41.field916;
                    var5.field1371 = var5.field41.field908;
                    var5.field1364 = var5.field41.field902;
                    var5.field1365 = var5.field41.field893;
                    var5.field1366 = var5.field41.field919;
                    var5.field1367 = var5.field41.field922;
                    var5.field1353 = var5.field41.field924;
                    var5.method454(field113.field1363[0] + var8, 5, field113.field1362[0] + var9, var6 == 1);
                    continue;
                }
            }
            arg1.method533(this.field229);
            if (arg2 < 0) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method147(byte arg0) {
        class53.field1453.method304();
        class53.field1431.method304();
        class26.field903.method304();
        class24.field867.method304();
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field272 = null;
        }
        class24.field843.method304();
        class38.field1096.method304();
        class21.field715.method304();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILXOUQUKZW;I)V")
    private final void method148(int arg0, class62 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field253; ++var4) {
            int var5 = this.field254[var4];
            class38 var6 = this.field250[var5];
            int var7 = arg1.method521();
            if ((var7 & 64) != 0) {
                var7 += arg1.method521() << 8;
            }
            this.method115(var6, var7, var5, this.field264, arg1);
        }
        if (this.field494 != arg0) {
            this.field264 = !this.field264;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILPFVGIFDY;IIIIZ)V")
    public final void method149(int arg0, class48 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field179 &= arg6;
        if (arg1.field1260 == 0 && arg1.field1256 != null && !arg1.field1254) {
            if (arg5 >= arg0 && arg2 >= arg4 && arg5 <= arg1.field1280 + arg0 && arg2 <= arg1.field1245 + arg4) {
                int var8 = arg1.field1256.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg1.field1247[var9] + arg0;
                    int var11 = arg1.field1293[var9] + arg4 - arg3;
                    class48 var12 = class48.field1246[arg1.field1256[var9]];
                    int var13 = var12.field1265 + var10;
                    int var14 = var12.field1244 + var11;
                    if ((var12.field1248 >= 0 || var12.field1292 != 0) && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field1280 + var13 && arg2 < var12.field1245 + var14) {
                        if (var12.field1248 >= 0) {
                            this.field318 = var12.field1248;
                        } else {
                            this.field318 = var12.field1285;
                        }
                    }
                    if (var12.field1260 == 0) {
                        this.method149(var13, var12, arg2, var12.field1286, var14, arg5, this.field359);
                        if (var12.field1281 > var12.field1245) {
                            this.method102(var12.field1281, arg5, var12, true, 15578, var14, var12.field1280 + var13, var12.field1245, arg2);
                        }
                    } else {
                        if (var12.field1261 == 1 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field1280 + var13 && arg2 < var12.field1245 + var14) {
                            boolean var15 = false;
                            if (var12.field1262 != 0) {
                                var15 = this.method108(7, var12);
                            }
                            if (!var15) {
                                this.field149[this.field477] = var12.field1303;
                                this.field509[this.field477] = 903;
                                this.field508[this.field477] = var12.field1285;
                                ++this.field477;
                            }
                        }
                        if (var12.field1261 == 2 && this.field390 == 0 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field1280 + var13 && arg2 < var12.field1245 + var14) {
                            String var16 = var12.field1295;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field149[this.field477] = var16 + " @gre@" + var12.field1258;
                            this.field509[this.field477] = 604;
                            this.field508[this.field477] = var12.field1285;
                            ++this.field477;
                        }
                        if (var12.field1261 == 3 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field1280 + var13 && arg2 < var12.field1245 + var14) {
                            this.field149[this.field477] = "Close";
                            this.field509[this.field477] = 863;
                            this.field508[this.field477] = var12.field1285;
                            ++this.field477;
                        }
                        if (var12.field1261 == 4 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field1280 + var13 && arg2 < var12.field1245 + var14) {
                            this.field149[this.field477] = var12.field1303;
                            this.field509[this.field477] = 627;
                            this.field508[this.field477] = var12.field1285;
                            ++this.field477;
                        }
                        if (var12.field1261 == 5 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field1280 + var13 && arg2 < var12.field1245 + var14) {
                            this.field149[this.field477] = var12.field1303;
                            this.field509[this.field477] = 975;
                            this.field508[this.field477] = var12.field1285;
                            ++this.field477;
                        }
                        if (var12.field1261 == 6 && !this.field91 && arg5 >= var13 && arg2 >= var14 && arg5 < var12.field1280 + var13 && arg2 < var12.field1245 + var14) {
                            this.field149[this.field477] = var12.field1303;
                            this.field509[this.field477] = 542;
                            this.field508[this.field477] = var12.field1285;
                            ++this.field477;
                        }
                        if (var12.field1260 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field1245; ++var18) {
                                for (int var19 = 0; var19 < var12.field1280; ++var19) {
                                    int var20 = (var12.field1255 + 32) * var19 + var13;
                                    int var21 = (var12.field1279 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field1267[var17];
                                        var21 += var12.field1291[var17];
                                    }
                                    if (arg5 >= var20 && arg2 >= var21 && arg5 < var20 + 32 && arg2 < var21 + 32) {
                                        this.field198 = var17;
                                        this.field199 = var12.field1285;
                                        if (var12.field1272[var17] > 0) {
                                            class24 var22 = class24.method293(var12.field1272[var17] - 1);
                                            if (this.field303 == 1 && var12.field1273) {
                                                if (this.field305 != var12.field1285 || this.field304 != var17) {
                                                    this.field149[this.field477] = "Use " + this.field307 + " with @lre@" + var22.field877;
                                                    this.field509[this.field477] = 616;
                                                    this.field510[this.field477] = var22.field876;
                                                    this.field507[this.field477] = var17;
                                                    this.field508[this.field477] = var12.field1285;
                                                    ++this.field477;
                                                }
                                            } else if (this.field390 == 1 && var12.field1273) {
                                                if ((this.field392 & 16) == 16) {
                                                    this.field149[this.field477] = this.field393 + " @lre@" + var22.field877;
                                                    this.field509[this.field477] = 992;
                                                    this.field510[this.field477] = var22.field876;
                                                    this.field507[this.field477] = var17;
                                                    this.field508[this.field477] = var12.field1285;
                                                    ++this.field477;
                                                }
                                            } else {
                                                if (var12.field1273) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field875 != null && var22.field875[var23] != null) {
                                                            this.field149[this.field477] = var22.field875[var23] + " @lre@" + var22.field877;
                                                            if (var23 == 3) {
                                                                this.field509[this.field477] = 752;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field509[this.field477] = 804;
                                                            }
                                                            this.field510[this.field477] = var22.field876;
                                                            this.field507[this.field477] = var17;
                                                            this.field508[this.field477] = var12.field1285;
                                                            ++this.field477;
                                                        } else if (var23 == 4) {
                                                            this.field149[this.field477] = "Drop @lre@" + var22.field877;
                                                            this.field509[this.field477] = 804;
                                                            this.field510[this.field477] = var22.field876;
                                                            this.field507[this.field477] = var17;
                                                            this.field508[this.field477] = var12.field1285;
                                                            ++this.field477;
                                                        }
                                                    }
                                                }
                                                if (var12.field1269) {
                                                    this.field149[this.field477] = "Use @lre@" + var22.field877;
                                                    this.field509[this.field477] = 762;
                                                    this.field510[this.field477] = var22.field876;
                                                    this.field507[this.field477] = var17;
                                                    this.field508[this.field477] = var12.field1285;
                                                    ++this.field477;
                                                }
                                                if (var12.field1273 && var22.field875 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field875[var24] != null) {
                                                            this.field149[this.field477] = var22.field875[var24] + " @lre@" + var22.field877;
                                                            if (var24 == 0) {
                                                                this.field509[this.field477] = 255;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field509[this.field477] = 704;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field509[this.field477] = 617;
                                                            }
                                                            this.field510[this.field477] = var22.field876;
                                                            this.field507[this.field477] = var17;
                                                            this.field508[this.field477] = var12.field1285;
                                                            ++this.field477;
                                                        }
                                                    }
                                                }
                                                if (var12.field1264 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field1264[var25] != null) {
                                                            this.field149[this.field477] = var12.field1264[var25] + " @lre@" + var22.field877;
                                                            if (var25 == 0) {
                                                                this.field509[this.field477] = 801;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field509[this.field477] = 630;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field509[this.field477] = 769;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field509[this.field477] = 416;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field509[this.field477] = 142;
                                                            }
                                                            this.field510[this.field477] = var22.field876;
                                                            this.field507[this.field477] = var17;
                                                            this.field508[this.field477] = var12.field1285;
                                                            ++this.field477;
                                                        }
                                                    }
                                                }
                                                this.field149[this.field477] = "Examine @lre@" + var22.field877;
                                                this.field509[this.field477] = 1410;
                                                this.field510[this.field477] = var22.field876;
                                                this.field507[this.field477] = var17;
                                                this.field508[this.field477] = var12.field1285;
                                                ++this.field477;
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

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method150(int arg0) {
        while (arg0 >= 0) {
            this.field531 = this.field374.method521();
        }
        if (this.field233 == 0) {
            int var2 = super.field818;
            if (this.field390 == 1 && super.field819 >= 516 && super.field820 >= 160 && super.field819 <= 765 && super.field820 <= 205) {
                var2 = 0;
            }
            if (this.field395) {
                if (var2 != 1) {
                    int var3 = super.field812;
                    int var4 = super.field813;
                    if (this.field460 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field460 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field460 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field461 - 10 || var3 > this.field463 + this.field461 + 10 || var4 < this.field462 - 10 || var4 > this.field464 + this.field462 + 10) {
                        this.field395 = false;
                        if (this.field460 == 1) {
                            this.field493 = true;
                        }
                        if (this.field460 == 2) {
                            this.field228 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field461;
                    int var6 = this.field462;
                    int var7 = this.field463;
                    int var8 = super.field819;
                    int var9 = super.field820;
                    if (this.field460 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field460 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field460 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field477; ++var11) {
                        int var12 = (this.field477 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method164(var10, (byte) -39);
                    }
                    this.field395 = false;
                    if (this.field460 == 1) {
                        this.field493 = true;
                    }
                    if (this.field460 == 2) {
                        this.field228 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field477 > 0) {
                    int var13 = this.field509[this.field477 - 1];
                    if (var13 == 801 || var13 == 630 || var13 == 769 || var13 == 416 || var13 == 142 || var13 == 255 || var13 == 704 || var13 == 617 || var13 == 752 || var13 == 804 || var13 == 762 || var13 == 1410) {
                        int var14 = this.field507[this.field477 - 1];
                        int var15 = this.field508[this.field477 - 1];
                        class48 var16 = class48.field1246[var15];
                        if (var16.field1299 || var16.field1278) {
                            this.field127 = false;
                            this.field329 = 0;
                            this.field231 = var15;
                            this.field232 = var14;
                            this.field233 = 2;
                            this.field234 = super.field819;
                            this.field235 = super.field820;
                            if (class48.field1246[var15].field1241 == this.field450) {
                                this.field233 = 1;
                            }
                            if (class48.field1246[var15].field1241 == this.field341) {
                                this.field233 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field501 == 1 || this.method122(this.field477 - 1, 46867)) && this.field477 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field477 > 0) {
                    this.method164(this.field477 - 1, (byte) -39);
                }
                if (var2 != 2 || this.field477 <= 0) {
                    return;
                }
                this.method42(7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method151(int arg0) {
        this.field122 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field152) {
                ++this.field273;
                this.method35(-742);
                this.method35(-742);
                this.method84(false);
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
        this.field122 = false;
        if (arg0 < 7 || arg0 > 7) {
            this.field159.method511(183);
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method152(int arg0) {
        if (arg0 < 0) {
            for (int var2 = -1; var2 < this.field251; ++var2) {
                int var6;
                if (var2 == -1) {
                    var6 = this.field249;
                } else {
                    var6 = this.field252[var2];
                }
                class38 var7 = this.field250[var6];
                if (var7 != null && var7.field1342 > 0) {
                    --var7.field1342;
                    if (var7.field1342 == 0) {
                        var7.field1350 = null;
                    }
                }
            }
            for (int var3 = 0; var3 < this.field226; ++var3) {
                int var4 = this.field227[var3];
                class3 var5 = this.field225[var4];
                if (var5 != null && var5.field1342 > 0) {
                    --var5.field1342;
                    if (var5.field1342 == 0) {
                        var5.field1350 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method153(int arg0) {
        Graphics var2 = this.method140(9).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method287(738, 1);
        if (arg0 != -2675) {
            this.field531 = this.field374.method521();
        }
        if (this.field356) {
            this.field152 = false;
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
        if (this.field135) {
            this.field152 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field160) {
            this.field152 = false;
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

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method154(int arg0) {
        if (arg0 != -24622) {
            this.method114();
        }
        while (true) {
            class18 var2 = this.field259.method485();
            if (var2 == null) {
                return;
            }
            if (var2.field678 == 0) {
                class35.method377(var2.field677, 7, var2.field679);
                if ((this.field259.method479(false, var2.field679) & 98) != 0) {
                    this.field493 = true;
                    if (this.field341 != -1) {
                        this.field228 = true;
                    }
                }
            }
            if (var2.field678 == 1 && var2.field677 != null) {
                class71.method582(var2.field677, 0);
            }
            if (var2.field678 == 2 && this.field456 == var2.field679 && var2.field677 != null) {
                this.method170(var2.field677, -40275, this.field457);
            }
            if (var2.field678 == 3 && this.field291 == 1) {
                for (int var3 = 0; var3 < this.field525.length; ++var3) {
                    if (this.field131[var3] == var2.field679) {
                        this.field525[var3] = var2.field677;
                        if (var2.field677 == null) {
                            this.field131[var3] = -1;
                        }
                        break;
                    }
                    if (this.field132[var3] == var2.field679) {
                        this.field424[var3] = var2.field677;
                        if (var2.field677 == null) {
                            this.field132[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field678 == 93 && this.field259.method481(var2.field679, -47759)) {
                class11.method195(this.field259, 0, new class62(-417, var2.field677));
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method155(int arg0) {
        class28 var2 = (class28) this.field288.method332();
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (this.field123 == var2.field935 && !var2.field933) {
                if (field487 >= var2.field930) {
                    var2.method316((byte) 101, this.field542);
                    if (var2.field933) {
                        var2.method471();
                    } else {
                        this.field397.method244(0, var2, -1, var2.field936, 0, var2.field937, false, var2.field938, 60, var2.field935);
                    }
                }
            } else {
                var2.method471();
            }
            var2 = (class28) this.field288.method334(-96);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method156(int arg0) {
        if (!this.field160 && !this.field356 && !this.field135) {
            ++field487;
            if (!this.field179) {
                this.method117(true);
            } else {
                this.method75(0);
            }
            this.method154(-24622);
            if (arg0 != 0) {
                field182 = !field182;
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method157(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field331 = 0;
        for (int var3 = -1; var3 < this.field251 + this.field226; ++var3) {
            class50 var20;
            if (var3 == -1) {
                var20 = field113;
            } else if (var3 < this.field251) {
                var20 = this.field250[this.field252[var3]];
            } else {
                var20 = this.field225[this.field227[var3 - this.field251]];
            }
            if (var20 != null && var20.method12(this.field145)) {
                if (var20 instanceof class3) {
                    class26 var21 = ((class3) var20).field41;
                    if (var21.field904 != null) {
                        var21 = var21.method308((byte) 3);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var3 >= this.field251) {
                    class26 var25 = ((class3) var20).field41;
                    if (var25.field894 >= 0 && var25.field894 < this.field499.length) {
                        this.method172(var20.field1325 + 15, 0, var20);
                        if (this.field430 > -1) {
                            this.field499[var25.field894].method499(this.field431 - 30, this.field430 - 12, 412);
                        }
                    }
                    if (this.field296 == 1 && this.field227[var3 - this.field251] == this.field410 && field487 % 20 < 10) {
                        this.method172(var20.field1325 + 15, 0, var20);
                        if (this.field430 > -1) {
                            this.field499[2].method499(this.field431 - 28, this.field430 - 12, 412);
                        }
                    }
                } else {
                    int var22 = 30;
                    class38 var23 = (class38) var20;
                    if (var23.field1090 != 0) {
                        this.method172(var20.field1325 + 15, 0, var20);
                        if (this.field430 > -1) {
                            for (int var24 = 0; var24 < 8; ++var24) {
                                if ((var23.field1090 & 1 << var24) != 0) {
                                    this.field499[var24].method499(this.field431 - var22, this.field430 - 12, 412);
                                    var22 -= 25;
                                }
                            }
                        }
                    }
                    if (var3 >= 0 && this.field296 == 10 && this.field252[var3] == this.field458) {
                        this.method172(var20.field1325 + 15, 0, var20);
                        if (this.field430 > -1) {
                            this.field499[7].method499(this.field431 - var22, this.field430 - 12, 412);
                        }
                    }
                }
                if (var20.field1350 != null && (var3 >= this.field251 || this.field203 == 0 || this.field203 == 3 || this.field203 == 1 && this.method161(((class38) var20).field1114, (byte) -125))) {
                    this.method172(var20.field1325, 0, var20);
                    if (this.field430 > -1 && this.field331 < this.field332) {
                        this.field336[this.field331] = this.field294.method18(var20.field1350, 0) / 2;
                        this.field335[this.field331] = this.field294.field54;
                        this.field333[this.field331] = this.field430;
                        this.field334[this.field331] = this.field431;
                        this.field337[this.field331] = var20.field1331;
                        this.field338[this.field331] = var20.field1349;
                        this.field339[this.field331] = var20.field1342;
                        this.field340[this.field331++] = var20.field1350;
                        if (this.field239 == 0 && var20.field1349 >= 1 && var20.field1349 <= 3) {
                            this.field335[this.field331] += 10;
                            this.field334[this.field331] += 5;
                        }
                        if (this.field239 == 0 && var20.field1349 == 4) {
                            this.field336[this.field331] = 60;
                        }
                        if (this.field239 == 0 && var20.field1349 == 5) {
                            this.field335[this.field331] += 5;
                        }
                    }
                }
                if (var20.field1344 > field487) {
                    this.method172(var20.field1325 + 15, 0, var20);
                    if (this.field430 > -1) {
                        int var26 = var20.field1345 * 30 / var20.field1346;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class29.method322((byte) -37, this.field431 - 3, this.field430 - 15, 65280, var26, 5);
                        class29.method322((byte) -37, this.field431 - 3, this.field430 - 15 + var26, 16711680, 30 - var26, 5);
                    }
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    if (var20.field1374[var27] > field487) {
                        this.method172(var20.field1325 / 2, 0, var20);
                        if (this.field430 > -1) {
                            if (var27 == 1) {
                                this.field431 -= 20;
                            }
                            if (var27 == 2) {
                                this.field430 -= 15;
                                this.field431 -= 10;
                            }
                            if (var27 == 3) {
                                this.field430 += 15;
                                this.field431 -= 10;
                            }
                            this.field110[var20.field1373[var27]].method499(this.field431 - 12, this.field430 - 12, 412);
                            this.field292.method15(this.field431 + 4, true, this.field430, 0, String.valueOf(var20.field1372[var27]));
                            this.field292.method15(this.field431 + 3, true, this.field430 - 1, 16777215, String.valueOf(var20.field1372[var27]));
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field331; ++var4) {
            int var5 = this.field333[var4];
            int var6 = this.field334[var4];
            int var7 = this.field336[var4];
            int var8 = this.field335[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field334[var19] - this.field335[var19] && var6 - var8 < this.field334[var19] + 2 && var5 - var7 < this.field336[var19] + this.field333[var19] && var5 + var7 > this.field333[var19] - this.field336[var19] && this.field334[var19] - this.field335[var19] < var6) {
                        var6 = this.field334[var19] - this.field335[var19];
                        var9 = true;
                    }
                }
            }
            this.field430 = this.field333[var4];
            this.field431 = this.field334[var4] = var6;
            String var10 = this.field340[var4];
            if (this.field239 == 0) {
                int var11 = 16776960;
                if (this.field337[var4] < 6) {
                    var11 = this.field221[this.field337[var4]];
                }
                if (this.field337[var4] == 6) {
                    var11 = this.field403 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field337[var4] == 7) {
                    var11 = this.field403 % 20 < 10 ? 255 : 65535;
                }
                if (this.field337[var4] == 8) {
                    var11 = this.field403 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field337[var4] == 9) {
                    int var12 = 150 - this.field339[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field337[var4] == 10) {
                    int var13 = 150 - this.field339[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field337[var4] == 11) {
                    int var14 = 150 - this.field339[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field338[var4] == 0) {
                    this.field294.method15(this.field431 + 1, true, this.field430, 0, var10);
                    this.field294.method15(this.field431, true, this.field430, var11, var10);
                }
                if (this.field338[var4] == 1) {
                    this.field294.method20(var10, this.field430, this.field403, this.field431 + 1, this.field402, 0);
                    this.field294.method20(var10, this.field430, this.field403, this.field431, this.field402, var11);
                }
                if (this.field338[var4] == 2) {
                    this.field294.method21(false, var10, this.field431 + 1, 0, this.field403, this.field430);
                    this.field294.method21(false, var10, this.field431, var11, this.field403, this.field430);
                }
                if (this.field338[var4] == 3) {
                    this.field294.method22(0, var10, this.field403, 150 - this.field339[var4], this.field431 + 1, this.field430, 3);
                    this.field294.method22(var11, var10, this.field403, 150 - this.field339[var4], this.field431, this.field430, 3);
                }
                if (this.field338[var4] == 4) {
                    int var15 = this.field294.method18(var10, 0);
                    int var16 = (150 - this.field339[var4]) * (var15 + 100) / 150;
                    class29.method319(this.field430 + 50, 7, 0, this.field430 - 50, 334);
                    this.field294.method19(var10, 0, this.field431 + 1, this.field430 + 50 - var16, 6972);
                    this.field294.method19(var10, var11, this.field431, this.field430 + 50 - var16, 6972);
                    class29.method318(0);
                }
                if (this.field338[var4] == 5) {
                    int var17 = 150 - this.field339[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class29.method319(512, 7, this.field431 - this.field294.field54 - 1, 0, this.field431 + 5);
                    this.field294.method15(this.field431 + 1 + var18, true, this.field430, 0, var10);
                    this.field294.method15(this.field431 + var18, true, this.field430, var11, var10);
                    class29.method318(0);
                }
            } else {
                this.field294.method15(this.field431 + 1, true, this.field430, 0, var10);
                this.field294.method15(this.field431, true, this.field430, 16776960, var10);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method158(long arg0, int arg1) {
        if (arg1 == 0) {
            if (arg0 != 0L) {
                for (int var4 = 0; var4 < this.field241; ++var4) {
                    if (this.field69[var4] == arg0) {
                        --this.field241;
                        this.field493 = true;
                        for (int var5 = var4; var5 < this.field241; ++var5) {
                            this.field69[var5] = this.field69[var5 + 1];
                        }
                        this.field159.method510(27, -266);
                        this.field159.method517(arg0, this.field141);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method159(int arg0) {
        if (arg0 != 0) {
            field151 = this.field105.method405();
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method288(0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field450 != -1 && this.field450 == this.field158) {
                        if (var2 == 8 && this.field154.length() > 0) {
                            this.field154 = this.field154.substring(0, this.field154.length() - 1);
                        }
                        break;
                    }
                    if (this.field172) {
                        if (var2 >= 32 && var2 <= 122 && this.field459.length() < 80) {
                            this.field459 = this.field459 + (char) var2;
                            this.field228 = true;
                        }
                        if (var2 == 8 && this.field459.length() > 0) {
                            this.field459 = this.field459.substring(0, this.field459.length() - 1);
                            this.field228 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field172 = false;
                            this.field228 = true;
                            if (this.field266 == 1) {
                                long var3 = class67.method563(this.field459);
                                this.method134(var3, (byte) 8);
                            }
                            if (this.field266 == 2 && this.field200 > 0) {
                                long var5 = class67.method563(this.field459);
                                this.method73(var5, 0);
                            }
                            if (this.field266 == 3 && this.field459.length() > 0) {
                                this.field159.method510(59, -266);
                                this.field159.method511(0);
                                int var7 = this.field159.field1579;
                                this.field159.method517(this.field471, this.field141);
                                class15.method217(false, this.field459, this.field159);
                                this.field159.method520(this.field159.field1579 - var7, -31558);
                                this.field459 = class15.method218(true, this.field459);
                                this.field459 = class33.method347(true, this.field459);
                                this.method100(class67.method567(-550, class67.method564(this.field471, true)), 6, 14378, this.field459);
                                if (this.field475 == 2) {
                                    this.field475 = 1;
                                    this.field420 = true;
                                    this.field159.method510(26, -266);
                                    this.field159.method511(this.field203);
                                    this.field159.method511(this.field475);
                                    this.field159.method511(this.field187);
                                }
                            }
                            if (this.field266 == 4 && this.field241 < 100) {
                                long var8 = class67.method563(this.field459);
                                this.method62((byte) -13, var8);
                            }
                            if (this.field266 == 5 && this.field241 > 0) {
                                long var10 = class67.method563(this.field459);
                                this.method158(var10, 0);
                            }
                        }
                    } else if (this.field144 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field121.length() < 10) {
                            this.field121 = this.field121 + (char) var2;
                            this.field228 = true;
                        }
                        if (var2 == 8 && this.field121.length() > 0) {
                            this.field121 = this.field121.substring(0, this.field121.length() - 1);
                            this.field228 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field121.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field121);
                                } catch (Exception var22) {
                                }
                                this.field159.method510(214, -266);
                                this.field159.method515(var12);
                            }
                            this.field144 = 0;
                            this.field228 = true;
                        }
                    } else if (this.field144 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field121.length() < 12) {
                            this.field121 = this.field121 + (char) var2;
                            this.field228 = true;
                        }
                        if (var2 == 8 && this.field121.length() > 0) {
                            this.field121 = this.field121.substring(0, this.field121.length() - 1);
                            this.field228 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field121.length() > 0) {
                                this.field159.method510(203, -266);
                                this.field159.method517(class67.method563(this.field121), this.field141);
                            }
                            this.field144 = 0;
                            this.field228 = true;
                        }
                    } else if (this.field341 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field486.length() < 80) {
                            this.field486 = this.field486 + (char) var2;
                            this.field228 = true;
                        }
                        if (var2 == 8 && this.field486.length() > 0) {
                            this.field486 = this.field486.substring(0, this.field486.length() - 1);
                            this.field228 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field486.length() > 0) {
                            if (this.field316 == 2) {
                                if (this.field486.equals("::clientdrop")) {
                                    this.method118((byte) 21);
                                }
                                if (this.field486.equals("::lag")) {
                                    this.method139((byte) 1);
                                }
                                if (this.field486.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field259.method486(0, 2); ++var13) {
                                        this.field259.method473((byte) 4, (byte) 1, 2, var13);
                                    }
                                }
                                if (this.field486.equals("::fpson")) {
                                    field174 = true;
                                }
                                if (this.field486.equals("::fpsoff")) {
                                    field174 = false;
                                }
                                if (this.field486.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field372[var14].field1644[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field486.startsWith("::")) {
                                this.field159.method510(109, -266);
                                this.field159.method511(this.field486.length() - 1);
                                this.field159.method518(this.field486.substring(2));
                            } else {
                                String var17 = this.field486.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field486 = this.field486.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field486 = this.field486.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field486 = this.field486.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field486 = this.field486.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field486 = this.field486.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field486 = this.field486.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field486 = this.field486.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field486 = this.field486.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field486 = this.field486.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field486 = this.field486.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field486 = this.field486.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field486 = this.field486.substring(6);
                                }
                                String var19 = this.field486.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field486 = this.field486.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field486 = this.field486.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field486 = this.field486.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field486 = this.field486.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field486 = this.field486.substring(6);
                                }
                                this.field159.method510(226, -266);
                                this.field159.method511(0);
                                int var21 = this.field159.field1579;
                                this.field159.method537(false, var18);
                                this.field159.method538(3, var20);
                                this.field224.field1579 = 0;
                                class15.method217(false, this.field486, this.field224);
                                this.field159.method557(0, this.field224.field1579, false, this.field224.field1578);
                                this.field159.method520(this.field159.field1579 - var21, -31558);
                                this.field486 = class15.method218(true, this.field486);
                                this.field486 = class33.method347(true, this.field486);
                                field113.field1350 = this.field486;
                                field113.field1331 = var18;
                                field113.field1349 = var20;
                                field113.field1342 = 150;
                                if (this.field316 == 2) {
                                    this.method100("@cr2@" + field113.field1114, 2, 14378, field113.field1350);
                                } else if (this.field316 == 1) {
                                    this.method100("@cr1@" + field113.field1114, 2, 14378, field113.field1350);
                                } else {
                                    this.method100(field113.field1114, 2, 14378, field113.field1350);
                                }
                                if (this.field203 == 2) {
                                    this.field203 = 3;
                                    this.field420 = true;
                                    this.field159.method510(26, -266);
                                    this.field159.method511(this.field203);
                                    this.field159.method511(this.field475);
                                    this.field159.method511(this.field187);
                                }
                            }
                            this.field486 = "";
                            this.field228 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field154.length() < 12) {
                this.field154 = this.field154 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILHQFMWUSH;)V")
    public final void method160(int arg0, int arg1, int arg2, int arg3, class26 arg4) {
        label129: while (true) {
            if (arg0 >= 0) {
                int var10 = 1;
                while (true) {
                    if (var10 <= 0) {
                        continue label129;
                    }
                    ++var10;
                }
            }
            if (this.field477 >= 400) {
                return;
            }
            if (arg4.field904 != null) {
                arg4 = arg4.method308((byte) 3);
            }
            if (arg4 == null) {
                return;
            }
            if (!arg4.field905) {
                return;
            }
            String var6 = arg4.field914;
            if (arg4.field897 != 0) {
                var6 = var6 + method129(field113.field1108, arg4.field897, false) + " (level-" + arg4.field897 + ")";
            }
            if (this.field303 == 1) {
                this.field149[this.field477] = "Use " + this.field307 + " with @yel@" + var6;
                this.field509[this.field477] = 728;
                this.field510[this.field477] = arg3;
                this.field507[this.field477] = arg1;
                this.field508[this.field477] = arg2;
                ++this.field477;
                return;
            }
            if (this.field390 == 1) {
                if ((this.field392 & 2) == 2) {
                    this.field149[this.field477] = this.field393 + " @yel@" + var6;
                    this.field509[this.field477] = 771;
                    this.field510[this.field477] = arg3;
                    this.field507[this.field477] = arg1;
                    this.field508[this.field477] = arg2;
                    ++this.field477;
                    return;
                }
            } else {
                if (arg4.field921 != null) {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (arg4.field921[var7] != null && !arg4.field921[var7].equalsIgnoreCase("attack")) {
                            this.field149[this.field477] = arg4.field921[var7] + " @yel@" + var6;
                            if (var7 == 0) {
                                this.field509[this.field477] = 638;
                            }
                            if (var7 == 1) {
                                this.field509[this.field477] = 523;
                            }
                            if (var7 == 2) {
                                this.field509[this.field477] = 993;
                            }
                            if (var7 == 3) {
                                this.field509[this.field477] = 773;
                            }
                            if (var7 == 4) {
                                this.field509[this.field477] = 473;
                            }
                            this.field510[this.field477] = arg3;
                            this.field507[this.field477] = arg1;
                            this.field508[this.field477] = arg2;
                            ++this.field477;
                        }
                    }
                }
                if (arg4.field921 != null) {
                    for (int var8 = 4; var8 >= 0; --var8) {
                        if (arg4.field921[var8] != null && arg4.field921[var8].equalsIgnoreCase("attack")) {
                            short var9 = 0;
                            if (arg4.field897 > field113.field1108) {
                                var9 = 2000;
                            }
                            this.field149[this.field477] = arg4.field921[var8] + " @yel@" + var6;
                            if (var8 == 0) {
                                this.field509[this.field477] = var9 + 638;
                            }
                            if (var8 == 1) {
                                this.field509[this.field477] = var9 + 523;
                            }
                            if (var8 == 2) {
                                this.field509[this.field477] = var9 + 993;
                            }
                            if (var8 == 3) {
                                this.field509[this.field477] = var9 + 773;
                            }
                            if (var8 == 4) {
                                this.field509[this.field477] = var9 + 473;
                            }
                            this.field510[this.field477] = arg3;
                            this.field507[this.field477] = arg1;
                            this.field508[this.field477] = arg2;
                            ++this.field477;
                        }
                    }
                }
                this.field149[this.field477] = "Examine @yel@" + var6;
                this.field509[this.field477] = 1659;
                this.field510[this.field477] = arg3;
                this.field507[this.field477] = arg1;
                this.field508[this.field477] = arg2;
                ++this.field477;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method161(String arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field200; ++var3) {
                if (arg0.equalsIgnoreCase(this.field260[var3])) {
                    return true;
                }
            }
            if (arg1 != -125) {
                this.field159.method511(152);
            }
            return arg0.equalsIgnoreCase(field113.field1114);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method162(String arg0) throws IOException {
        if (!this.field371) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field352 != null) {
                try {
                    this.field352.close();
                } catch (Exception var4) {
                }
                this.field352 = null;
            }
            this.field352 = this.method135(43595);
            this.field352.setSoTimeout(10000);
            InputStream var2 = this.field352.getInputStream();
            OutputStream var3 = this.field352.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method163(int arg0) {
        int var2 = 90 / arg0;
        if (super.field818 == 1) {
            if (super.field819 >= 539 && super.field819 <= 573 && super.field820 >= 169 && super.field820 < 205 && this.field95[0] != -1) {
                this.field493 = true;
                this.field380 = 0;
                this.field168 = true;
            }
            if (super.field819 >= 569 && super.field819 <= 599 && super.field820 >= 168 && super.field820 < 205 && this.field95[1] != -1) {
                this.field493 = true;
                this.field380 = 1;
                this.field168 = true;
            }
            if (super.field819 >= 597 && super.field819 <= 627 && super.field820 >= 168 && super.field820 < 205 && this.field95[2] != -1) {
                this.field493 = true;
                this.field380 = 2;
                this.field168 = true;
            }
            if (super.field819 >= 625 && super.field819 <= 669 && super.field820 >= 168 && super.field820 < 203 && this.field95[3] != -1) {
                this.field493 = true;
                this.field380 = 3;
                this.field168 = true;
            }
            if (super.field819 >= 666 && super.field819 <= 696 && super.field820 >= 168 && super.field820 < 205 && this.field95[4] != -1) {
                this.field493 = true;
                this.field380 = 4;
                this.field168 = true;
            }
            if (super.field819 >= 694 && super.field819 <= 724 && super.field820 >= 168 && super.field820 < 205 && this.field95[5] != -1) {
                this.field493 = true;
                this.field380 = 5;
                this.field168 = true;
            }
            if (super.field819 >= 722 && super.field819 <= 756 && super.field820 >= 169 && super.field820 < 205 && this.field95[6] != -1) {
                this.field493 = true;
                this.field380 = 6;
                this.field168 = true;
            }
            if (super.field819 >= 540 && super.field819 <= 574 && super.field820 >= 466 && super.field820 < 502 && this.field95[7] != -1) {
                this.field493 = true;
                this.field380 = 7;
                this.field168 = true;
            }
            if (super.field819 >= 572 && super.field819 <= 602 && super.field820 >= 466 && super.field820 < 503 && this.field95[8] != -1) {
                this.field493 = true;
                this.field380 = 8;
                this.field168 = true;
            }
            if (super.field819 >= 599 && super.field819 <= 629 && super.field820 >= 466 && super.field820 < 503 && this.field95[9] != -1) {
                this.field493 = true;
                this.field380 = 9;
                this.field168 = true;
            }
            if (super.field819 >= 627 && super.field819 <= 671 && super.field820 >= 467 && super.field820 < 502 && this.field95[10] != -1) {
                this.field493 = true;
                this.field380 = 10;
                this.field168 = true;
            }
            if (super.field819 >= 669 && super.field819 <= 699 && super.field820 >= 466 && super.field820 < 503 && this.field95[11] != -1) {
                this.field493 = true;
                this.field380 = 11;
                this.field168 = true;
            }
            if (super.field819 >= 696 && super.field819 <= 726 && super.field820 >= 466 && super.field820 < 503 && this.field95[12] != -1) {
                this.field493 = true;
                this.field380 = 12;
                this.field168 = true;
            }
            if (super.field819 >= 724 && super.field819 <= 758 && super.field820 >= 466 && super.field820 < 502 && this.field95[13] != -1) {
                this.field493 = true;
                this.field380 = 13;
                this.field168 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IB)V")
    public final void method164(int arg0, byte arg1) {
        if (arg0 >= 0) {
            if (this.field144 != 0) {
                this.field144 = 0;
                this.field228 = true;
            }
            int var3 = this.field507[arg0];
            int var4 = this.field508[arg0];
            int var5 = this.field509[arg0];
            int var6 = this.field510[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 627) {
                this.field159.method510(156, -266);
                this.field159.method512(var4);
                class48 var7 = class48.field1246[var4];
                if (var7.field1300 != null && var7.field1300[0][0] == 5) {
                    int var8 = var7.field1300[0][1];
                    this.field389[var8] = 1 - this.field389[var8];
                    this.method165(-8300, var8);
                    this.field493 = true;
                }
            }
            if (var5 == 394) {
                String var9 = this.field149[arg0];
                int var10 = var9.indexOf("@whi@");
                if (var10 != -1) {
                    long var11 = class67.method563(var9.substring(var10 + 5).trim());
                    int var13 = -1;
                    for (int var14 = 0; var14 < this.field200; ++var14) {
                        if (this.field378[var14] == var11) {
                            var13 = var14;
                            break;
                        }
                    }
                    if (var13 != -1 && this.field116[var13] > 0) {
                        this.field228 = true;
                        this.field144 = 0;
                        this.field172 = true;
                        this.field459 = "";
                        this.field266 = 3;
                        this.field471 = this.field378[var13];
                        this.field301 = "Enter message to send to " + this.field260[var13];
                    }
                }
            }
            if (var5 == 975) {
                this.field159.method510(156, -266);
                this.field159.method512(var4);
                class48 var15 = class48.field1246[var4];
                if (var15.field1300 != null && var15.field1300[0][0] == 5) {
                    int var16 = var15.field1300[0][1];
                    if (this.field389[var16] != var15.field1251[0]) {
                        this.field389[var16] = var15.field1251[0];
                        this.method165(-8300, var16);
                        this.field493 = true;
                    }
                }
            }
            if (var5 == 1689) {
                int var17 = var6 >> 14 & 32767;
                class53 var18 = class53.method464(var17);
                String var19;
                if (var18.field1423 != null) {
                    var19 = new String(var18.field1423);
                } else {
                    var19 = "It's a " + var18.field1451 + ".";
                }
                this.method100("", 0, 14378, var19);
            }
            if (var5 == 542 && !this.field91) {
                this.field159.method510(56, -266);
                this.field159.method512(var4);
                this.field91 = true;
            }
            if (var5 == 374) {
                boolean var20 = this.method126(0, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 0, 0);
                if (!var20) {
                    this.method126(1, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 1, 0);
                }
                this.field536 = super.field819;
                this.field537 = super.field820;
                this.field539 = 2;
                this.field538 = 0;
                this.field159.method510(124, -266);
                this.field159.method545(this.field217 + var3, false);
                this.field159.method512(var6);
                this.field159.method546(0, this.field391);
                this.field159.method546(0, this.field218 + var4);
            }
            if (var5 == 473) {
                class3 var22 = this.field225[var6];
                if (var22 != null) {
                    this.method126(1, var22.field1363[0], 0, 2, field113.field1362[0], 0, var22.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(42, -266);
                    this.field159.method545(var6, false);
                }
            }
            if (var5 == 583) {
                this.method99(var3, var6, var4, 5);
                this.field159.method510(215, -266);
                this.field159.method545(var6 >> 14 & 32767, false);
                this.field159.method546(0, this.field218 + var4);
                this.field159.method512(this.field217 + var3);
            }
            if (var5 == 771) {
                class3 var23 = this.field225[var6];
                if (var23 != null) {
                    this.method126(1, var23.field1363[0], 0, 2, field113.field1362[0], 0, var23.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(169, -266);
                    this.field159.method512(var6);
                    this.field159.method547(this.field391, false);
                }
            }
            if (var5 == 416) {
                this.field159.method510(129, -266);
                this.field159.method546(0, var4);
                this.field159.method512(var6);
                this.field159.method512(var3);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 18 || var5 == 188) {
                String var24 = this.field149[arg0];
                int var25 = var24.indexOf("@whi@");
                if (var25 != -1) {
                    String var26 = var24.substring(var25 + 5).trim();
                    String var27 = class67.method567(-550, class67.method564(class67.method563(var26), true));
                    boolean var28 = false;
                    for (int var29 = 0; var29 < this.field251; ++var29) {
                        class38 var30 = this.field250[this.field252[var29]];
                        if (var30 != null && var30.field1114 != null && var30.field1114.equalsIgnoreCase(var27)) {
                            this.method126(1, var30.field1363[0], 0, 2, field113.field1362[0], 0, var30.field1362[0], false, false, field113.field1363[0], 1, 0);
                            if (var5 == 18) {
                                this.field159.method510(31, -266);
                                this.field159.method547(this.field252[var29], false);
                            }
                            if (var5 == 188) {
                                ++field324;
                                if (field324 >= 104) {
                                    this.field159.method510(62, -266);
                                    this.field159.method515(0);
                                    field324 = 0;
                                }
                                this.field159.method510(164, -266);
                                this.field159.method546(0, this.field252[var29]);
                            }
                            var28 = true;
                            break;
                        }
                    }
                    if (!var28) {
                        this.method100("", 0, 14378, "Unable to find " + var27);
                    }
                }
            }
            if (var5 == 616) {
                this.field159.method510(57, -266);
                this.field159.method547(var4, false);
                this.field159.method512(var3);
                this.field159.method545(this.field304, false);
                this.field159.method547(var6, false);
                this.field159.method545(this.field306, false);
                this.field159.method547(this.field305, false);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 863) {
                this.method94((byte) 59);
            }
            if (var5 == 523) {
                class3 var31 = this.field225[var6];
                if (var31 != null) {
                    this.method126(1, var31.field1363[0], 0, 2, field113.field1362[0], 0, var31.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(201, -266);
                    this.field159.method546(0, var6);
                }
            }
            if (var5 == 4) {
                class38 var32 = this.field250[var6];
                if (var32 != null) {
                    this.method126(1, var32.field1363[0], 0, 2, field113.field1362[0], 0, var32.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    if ((var6 & 3) == 0) {
                        ++field516;
                    }
                    if (field516 >= 85) {
                        this.field159.method510(206, -266);
                        this.field159.method512(42716);
                        field516 = 0;
                    }
                    this.field159.method510(171, -266);
                    this.field159.method512(var6);
                }
            }
            if (var5 == 804) {
                ++field84;
                if (field84 >= 59) {
                    this.field159.method510(100, -266);
                    this.field159.method515(0);
                    field84 = 0;
                }
                this.field159.method510(81, -266);
                this.field159.method545(var6, false);
                this.field159.method547(var4, false);
                this.field159.method512(var3);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 1686) {
                this.method99(var3, var6, var4, 5);
                this.field159.method510(16, -266);
                this.field159.method512(this.field218 + var4);
                this.field159.method545(this.field217 + var3, false);
                this.field159.method512(var6 >> 14 & 32767);
            }
            if (var5 == 397) {
                class38 var33 = this.field250[var6];
                if (var33 != null) {
                    this.method126(1, var33.field1363[0], 0, 2, field113.field1362[0], 0, var33.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(110, -266);
                    this.field159.method547(var6, false);
                }
            }
            if (var5 == 630) {
                this.field159.method510(78, -266);
                this.field159.method512(var4);
                this.field159.method546(0, var3);
                this.field159.method547(var6, false);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 752) {
                this.field159.method510(54, -266);
                this.field159.method545(var3, false);
                this.field159.method546(0, var6);
                this.field159.method546(0, var4);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 412) {
                boolean var34 = this.method126(0, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 0, 0);
                if (!var34) {
                    this.method126(1, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 1, 0);
                }
                this.field536 = super.field819;
                this.field537 = super.field820;
                this.field539 = 2;
                this.field538 = 0;
                this.field159.method510(227, -266);
                this.field159.method512(this.field217 + var3);
                this.field159.method512(var6);
                this.field159.method512(this.field218 + var4);
            }
            if (var5 == 653) {
                this.method99(var3, var6, var4, 5);
                this.field159.method510(192, -266);
                this.field159.method547(this.field217 + var3, false);
                this.field159.method547(this.field218 + var4, false);
                this.field159.method546(0, var6 >> 14 & 32767);
            }
            if (var5 == 813) {
                boolean var36 = this.method126(0, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 0, 0);
                if (!var36) {
                    this.method126(1, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 1, 0);
                }
                this.field536 = super.field819;
                this.field537 = super.field820;
                this.field539 = 2;
                this.field538 = 0;
                this.field159.method510(84, -266);
                this.field159.method546(0, this.field217 + var3);
                this.field159.method547(this.field218 + var4, false);
                this.field159.method546(0, var6);
            }
            if (var5 == 933) {
                boolean var38 = this.method126(0, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 0, 0);
                if (!var38) {
                    this.method126(1, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 1, 0);
                }
                this.field536 = super.field819;
                this.field537 = super.field820;
                this.field539 = 2;
                this.field538 = 0;
                this.field159.method510(28, -266);
                this.field159.method545(var6, false);
                this.field159.method546(0, this.field218 + var4);
                this.field159.method547(this.field217 + var3, false);
            }
            if (var5 == 638) {
                class3 var40 = this.field225[var6];
                if (var40 != null) {
                    this.method126(1, var40.field1363[0], 0, 2, field113.field1362[0], 0, var40.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(216, -266);
                    this.field159.method545(var6, false);
                }
            }
            if (var5 == 617) {
                field124 += var4;
                if (field124 >= 147) {
                    this.field159.method510(195, -266);
                    this.field159.method511(220);
                    field124 = 0;
                }
                this.field159.method510(247, -266);
                this.field159.method545(var3, false);
                this.field159.method545(var4, false);
                this.field159.method547(var6, false);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 728) {
                class3 var41 = this.field225[var6];
                if (var41 != null) {
                    this.method126(1, var41.field1363[0], 0, 2, field113.field1362[0], 0, var41.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(10, -266);
                    this.field159.method545(var6, false);
                    this.field159.method512(this.field305);
                    this.field159.method512(this.field304);
                    this.field159.method512(this.field306);
                }
            }
            if (var5 == 91) {
                this.method99(var3, var6, var4, 5);
                this.field159.method510(77, -266);
                this.field159.method545(this.field217 + var3, false);
                this.field159.method512(var6 >> 14 & 32767);
                this.field159.method545(this.field218 + var4, false);
            }
            if (var5 == 566) {
                boolean var42 = this.method126(0, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 0, 0);
                if (!var42) {
                    this.method126(1, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 1, 0);
                }
                this.field536 = super.field819;
                this.field537 = super.field820;
                this.field539 = 2;
                this.field538 = 0;
                this.field159.method510(188, -266);
                this.field159.method547(var6, false);
                this.field159.method545(this.field217 + var3, false);
                this.field159.method545(this.field218 + var4, false);
            }
            if (var5 == 343) {
                boolean var44 = this.method126(0, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 0, 0);
                if (!var44) {
                    this.method126(1, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 1, 0);
                }
                this.field536 = super.field819;
                this.field537 = super.field820;
                this.field539 = 2;
                this.field538 = 0;
                this.field159.method510(61, -266);
                this.field159.method546(0, var6);
                this.field159.method547(this.field217 + var3, false);
                this.field159.method545(this.field218 + var4, false);
            }
            if (var5 == 1410) {
                class24 var46 = class24.method293(var6);
                class48 var47 = class48.field1246[var4];
                String var48;
                if (var47 != null && var47.field1268[var3] >= 100000) {
                    var48 = var47.field1268[var3] + " x " + var46.field877;
                } else if (var46.field838 != null) {
                    var48 = new String(var46.field838);
                } else {
                    var48 = "It's a " + var46.field877 + ".";
                }
                this.method100("", 0, 14378, var48);
            }
            if (var5 == 877) {
                class38 var49 = this.field250[var6];
                if (var49 != null) {
                    this.method126(1, var49.field1363[0], 0, 2, field113.field1362[0], 0, var49.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(73, -266);
                    this.field159.method547(this.field391, false);
                    this.field159.method512(var6);
                }
            }
            if (var5 == 769) {
                this.field159.method510(212, -266);
                this.field159.method547(var6, false);
                this.field159.method545(var3, false);
                this.field159.method545(var4, false);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 704) {
                ++field155;
                if (field155 >= 124) {
                    this.field159.method510(99, -266);
                    field155 = 0;
                }
                this.field159.method510(242, -266);
                this.field159.method512(var4);
                this.field159.method545(var6, false);
                this.field159.method512(var3);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 472) {
                if (!this.field395) {
                    this.field397.method271(super.field820 - 4, super.field819 - 4, 7);
                } else {
                    this.field397.method271(var4 - 4, var3 - 4, 7);
                }
            }
            if (var5 == 423) {
                String var50 = this.field149[arg0];
                int var51 = var50.indexOf("@whi@");
                if (var51 != -1) {
                    if (this.field450 == -1) {
                        this.method94((byte) 59);
                        this.field154 = var50.substring(var51 + 5).trim();
                        this.field112 = false;
                        for (int var52 = 0; var52 < class48.field1246.length; ++var52) {
                            if (class48.field1246[var52] != null && class48.field1246[var52].field1262 == 600) {
                                this.field158 = this.field450 = class48.field1246[var52].field1241;
                                break;
                            }
                        }
                    } else {
                        this.method100("", 0, 14378, "Please close the interface you have open before using 'report abuse'");
                    }
                }
            }
            if (var5 == 993) {
                class3 var53 = this.field225[var6];
                if (var53 != null) {
                    this.method126(1, var53.field1363[0], 0, 2, field113.field1362[0], 0, var53.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(80, -266);
                    this.field159.method545(var6, false);
                }
            }
            if (var5 == 978) {
                class38 var54 = this.field250[var6];
                if (var54 != null) {
                    this.method126(1, var54.field1363[0], 0, 2, field113.field1362[0], 0, var54.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(191, -266);
                    this.field159.method546(0, var6);
                    this.field159.method512(this.field306);
                    this.field159.method512(this.field305);
                    this.field159.method512(this.field304);
                }
            }
            if (var5 == 19) {
                class38 var55 = this.field250[var6];
                if (var55 != null) {
                    this.method126(1, var55.field1363[0], 0, 2, field113.field1362[0], 0, var55.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(31, -266);
                    this.field159.method547(var6, false);
                }
            }
            if (var5 == 1659) {
                class3 var56 = this.field225[var6];
                if (var56 != null) {
                    class26 var57 = var56.field41;
                    if (var57.field904 != null) {
                        var57 = var57.method308((byte) 3);
                    }
                    if (var57 != null) {
                        String var58;
                        if (var57.field888 != null) {
                            var58 = new String(var57.field888);
                        } else {
                            var58 = "It's a " + var57.field914 + ".";
                        }
                        this.method100("", 0, 14378, var58);
                    }
                }
            }
            if (var5 == 716) {
                class38 var59 = this.field250[var6];
                if (var59 != null) {
                    this.method126(1, var59.field1363[0], 0, 2, field113.field1362[0], 0, var59.field1362[0], false, false, field113.field1363[0], 1, 0);
                    this.field536 = super.field819;
                    this.field537 = super.field820;
                    this.field539 = 2;
                    this.field538 = 0;
                    this.field159.method510(114, -266);
                    this.field159.method546(0, var6);
                }
            }
            if (var5 == 801) {
                this.field159.method510(105, -266);
                this.field159.method545(var4, false);
                this.field159.method512(var3);
                this.field159.method545(var6, false);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 992) {
                this.field159.method510(233, -266);
                this.field159.method547(this.field391, false);
                this.field159.method545(var6, false);
                this.field159.method545(var3, false);
                this.field159.method547(var4, false);
                this.field320 = 0;
                this.field321 = var4;
                this.field322 = var3;
                this.field323 = 2;
                if (class48.field1246[var4].field1241 == this.field450) {
                    this.field323 = 1;
                }
                if (class48.field1246[var4].field1241 == this.field341) {
                    this.field323 = 3;
                }
            }
            if (var5 == 762) {
                this.field303 = 1;
                this.field304 = var3;
                this.field305 = var4;
                this.field306 = var6;
                this.field307 = class24.method293(var6).field877;
                this.field390 = 0;
                this.field493 = true;
            } else {
                if (var5 == 591 && this.method99(var3, var6, var4, 5)) {
                    this.field159.method510(221, -266);
                    this.field159.method547(var6 >> 14 & 32767, false);
                    this.field159.method545(this.field217 + var3, false);
                    this.field159.method512(this.field218 + var4);
                    this.field159.method547(this.field391, false);
                }
                if (var5 == 1770) {
                    class24 var60 = class24.method293(var6);
                    String var61;
                    if (var60.field838 != null) {
                        var61 = new String(var60.field838);
                    } else {
                        var61 = "It's a " + var60.field877 + ".";
                    }
                    this.method100("", 0, 14378, var61);
                }
                if (var5 == 604) {
                    class48 var62 = class48.field1246[var4];
                    this.field390 = 1;
                    this.field391 = var4;
                    this.field392 = var62.field1287;
                    this.field303 = 0;
                    this.field493 = true;
                    String var63 = var62.field1295;
                    if (var63.indexOf(" ") != -1) {
                        var63 = var63.substring(0, var63.indexOf(" "));
                    }
                    String var64 = var62.field1295;
                    if (var64.indexOf(" ") != -1) {
                        var64 = var64.substring(var64.indexOf(" ") + 1);
                    }
                    this.field393 = var63 + " " + var62.field1258 + " " + var64;
                    if (this.field392 == 16) {
                        this.field493 = true;
                        this.field380 = 3;
                        this.field168 = true;
                    }
                } else {
                    if (var5 == 142) {
                        this.field159.method510(250, -266);
                        this.field159.method546(0, var4);
                        this.field159.method547(var6, false);
                        this.field159.method545(var3, false);
                        this.field320 = 0;
                        this.field321 = var4;
                        this.field322 = var3;
                        this.field323 = 2;
                        if (class48.field1246[var4].field1241 == this.field450) {
                            this.field323 = 1;
                        }
                        if (class48.field1246[var4].field1241 == this.field341) {
                            this.field323 = 3;
                        }
                    }
                    if (var5 == 918) {
                        boolean var65 = this.method126(0, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 0, 0);
                        if (!var65) {
                            this.method126(1, var4, 0, 2, field113.field1362[0], 0, var3, false, false, field113.field1363[0], 1, 0);
                        }
                        this.field536 = super.field819;
                        this.field537 = super.field820;
                        this.field539 = 2;
                        this.field538 = 0;
                        this.field159.method510(39, -266);
                        this.field159.method546(0, var6);
                        this.field159.method546(0, this.field306);
                        this.field159.method545(this.field217 + var3, false);
                        this.field159.method546(0, this.field304);
                        this.field159.method546(0, this.field305);
                        this.field159.method547(this.field218 + var4, false);
                    }
                    if (var5 == 255) {
                        this.field159.method510(125, -266);
                        this.field159.method512(var4);
                        this.field159.method546(0, var3);
                        this.field159.method545(var6, false);
                        this.field320 = 0;
                        this.field321 = var4;
                        this.field322 = var3;
                        this.field323 = 2;
                        if (class48.field1246[var4].field1241 == this.field450) {
                            this.field323 = 1;
                        }
                        if (class48.field1246[var4].field1241 == this.field341) {
                            this.field323 = 3;
                        }
                    }
                    if (var5 == 290 || var5 == 400 || var5 == 324 || var5 == 670) {
                        String var67 = this.field149[arg0];
                        int var68 = var67.indexOf("@whi@");
                        if (var68 != -1) {
                            long var69 = class67.method563(var67.substring(var68 + 5).trim());
                            if (var5 == 290) {
                                this.method134(var69, (byte) 8);
                            }
                            if (var5 == 400) {
                                this.method62((byte) -13, var69);
                            }
                            if (var5 == 324) {
                                this.method73(var69, 0);
                            }
                            if (var5 == 670) {
                                this.method158(var69, 0);
                            }
                        }
                    }
                    if (var5 == 639) {
                        this.method99(var3, var6, var4, 5);
                        this.field159.method510(222, -266);
                        this.field159.method545(this.field218 + var4, false);
                        this.field159.method547(var6 >> 14 & 32767, false);
                        this.field159.method546(0, this.field217 + var3);
                    }
                    if (var5 == 903) {
                        class48 var71 = class48.field1246[var4];
                        boolean var72 = true;
                        if (var71.field1262 > 0) {
                            var72 = this.method142(false, var71);
                        }
                        if (var72) {
                            this.field159.method510(156, -266);
                            this.field159.method512(var4);
                        }
                    }
                    if (var5 == 725) {
                        class38 var73 = this.field250[var6];
                        if (var73 != null) {
                            this.method126(1, var73.field1363[0], 0, 2, field113.field1362[0], 0, var73.field1362[0], false, false, field113.field1363[0], 1, 0);
                            this.field536 = super.field819;
                            this.field537 = super.field820;
                            this.field539 = 2;
                            this.field538 = 0;
                            ++field324;
                            if (field324 >= 104) {
                                this.field159.method510(62, -266);
                                this.field159.method515(0);
                                field324 = 0;
                            }
                            this.field159.method510(164, -266);
                            this.field159.method546(0, var6);
                        }
                    }
                    if (var5 == 773) {
                        class3 var74 = this.field225[var6];
                        if (var74 != null) {
                            this.method126(1, var74.field1363[0], 0, 2, field113.field1362[0], 0, var74.field1362[0], false, false, field113.field1363[0], 1, 0);
                            this.field536 = super.field819;
                            this.field537 = super.field820;
                            this.field539 = 2;
                            this.field538 = 0;
                            this.field159.method510(223, -266);
                            this.field159.method546(0, var6);
                        }
                    }
                    if (var5 == 553 && this.method99(var3, var6, var4, 5)) {
                        this.field159.method510(251, -266);
                        this.field159.method512(this.field218 + var4);
                        this.field159.method547(this.field305, false);
                        this.field159.method546(0, this.field217 + var3);
                        this.field159.method547(var6 >> 14 & 32767, false);
                        this.field159.method545(this.field306, false);
                        this.field159.method547(this.field304, false);
                    }
                    this.field303 = 0;
                    this.field390 = 0;
                    this.field493 = true;
                    if (arg1 == -39) {
                        ;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method165(int arg0, int arg1) {
        if (this.field350 != arg0) {
            this.field531 = this.field374.method521();
        }
        int var3 = class41.field1141[arg1].field1149;
        if (var3 != 0) {
            int var4 = this.field389[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class47.method440((byte) 70, 0.9D);
                }
                if (var4 == 2) {
                    class47.method440((byte) 70, 0.8D);
                }
                if (var4 == 3) {
                    class47.method440((byte) 70, 0.7D);
                }
                if (var4 == 4) {
                    class47.method440((byte) 70, 0.6D);
                }
                class24.field843.method304();
                this.field423 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field186;
                if (var4 == 0) {
                    this.method47(0, this.field186, 0);
                    this.field186 = true;
                }
                if (var4 == 1) {
                    this.method47(-400, this.field186, 0);
                    this.field186 = true;
                }
                if (var4 == 2) {
                    this.method47(-800, this.field186, 0);
                    this.field186 = true;
                }
                if (var4 == 3) {
                    this.method47(-1200, this.field186, 0);
                    this.field186 = true;
                }
                if (var4 == 4) {
                    this.field186 = false;
                }
                if (this.field186 != var5 && !field191) {
                    if (this.field186) {
                        this.field456 = this.field276;
                        this.field457 = true;
                        this.field259.method478(2, this.field456);
                    } else {
                        this.method64((byte) 7);
                    }
                    this.field223 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field497 = true;
                    this.method143(true, 0);
                }
                if (var4 == 1) {
                    this.field497 = true;
                    this.method143(true, -400);
                }
                if (var4 == 2) {
                    this.field497 = true;
                    this.method143(true, -800);
                }
                if (var4 == 3) {
                    this.field497 = true;
                    this.method143(true, -1200);
                }
                if (var4 == 4) {
                    this.field497 = false;
                }
            }
            if (var3 == 5) {
                this.field501 = var4;
            }
            if (var3 == 6) {
                this.field239 = var4;
            }
            if (var3 == 8) {
                this.field150 = var4;
                this.field228 = true;
            }
            if (var3 == 9) {
                this.field117 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLXOUQUKZW;)V")
    private final void method166(int arg0, byte arg1, class62 arg2) {
        if (this.field98 == arg1) {
            boolean var4 = false;
        } else {
            this.field411 = this.field105.method405();
        }
        while (arg2.field1580 + 10 < arg0 * 8) {
            int var5 = arg2.method532(7, 11);
            if (var5 == 2047) {
                break;
            }
            if (this.field250[var5] == null) {
                this.field250[var5] = new class38();
                if (this.field255[var5] != null) {
                    this.field250[var5].method410((byte) 73, this.field255[var5]);
                }
            }
            this.field252[this.field251++] = var5;
            class38 var6 = this.field250[var5];
            var6.field1329 = field487;
            int var7 = arg2.method532(7, 1);
            if (var7 == 1) {
                this.field254[this.field253++] = var5;
            }
            int var8 = arg2.method532(7, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg2.method532(7, 1);
            int var10 = arg2.method532(7, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            var6.method454(field113.field1363[0] + var8, 5, field113.field1362[0] + var10, var9 == 1);
        }
        arg2.method533(this.field229);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(LXOUQUKZW;II)V")
    private final void method167(class62 arg0, int arg1, int arg2) {
        arg0.method531(0);
        int var4 = arg0.method532(7, 8);
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 < this.field226) {
            for (int var6 = var4; var6 < this.field226; ++var6) {
                this.field257[this.field256++] = this.field227[var6];
            }
        }
        if (var4 > this.field226) {
            signlink.reporterror(this.field400 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field226 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field227[var7];
                class3 var9 = this.field225[var8];
                int var10 = arg0.method532(7, 1);
                if (var10 == 0) {
                    this.field227[this.field226++] = var8;
                    var9.field1329 = field487;
                } else {
                    int var11 = arg0.method532(7, 2);
                    if (var11 == 0) {
                        this.field227[this.field226++] = var8;
                        var9.field1329 = field487;
                        this.field254[this.field253++] = var8;
                    } else if (var11 == 1) {
                        this.field227[this.field226++] = var8;
                        var9.field1329 = field487;
                        int var12 = arg0.method532(7, 3);
                        var9.method457(false, var12, (byte) -91);
                        int var13 = arg0.method532(7, 1);
                        if (var13 == 1) {
                            this.field254[this.field253++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field227[this.field226++] = var8;
                        var9.field1329 = field487;
                        int var14 = arg0.method532(7, 3);
                        var9.method457(true, var14, (byte) -91);
                        int var15 = arg0.method532(7, 3);
                        var9.method457(true, var15, (byte) -91);
                        int var16 = arg0.method532(7, 1);
                        if (var16 == 1) {
                            this.field254[this.field253++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field257[this.field256++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILPFVGIFDY;)V")
    public final void method168(int arg0, class48 arg1) {
        int var3 = arg1.field1262;
        if (arg0 != 1) {
            this.field359 = !this.field359;
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field201 == 0) {
                arg1.field1274 = "Loading friend list";
                arg1.field1261 = 0;
            } else if (var3 == 1 && this.field201 == 1) {
                arg1.field1274 = "Connecting to friendserver";
                arg1.field1261 = 0;
            } else if (var3 == 2 && this.field201 != 2) {
                arg1.field1274 = "Please wait...";
                arg1.field1261 = 0;
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
                    arg1.field1274 = "";
                    arg1.field1261 = 0;
                } else {
                    arg1.field1274 = this.field260[var3];
                    arg1.field1261 = 1;
                }
            }
        } else if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
            if (var3 == 203) {
                int var6 = this.field200;
                if (this.field201 != 2) {
                    var6 = 0;
                }
                arg1.field1281 = var6 * 15 + 20;
                if (arg1.field1281 <= arg1.field1245) {
                    arg1.field1281 = arg1.field1245 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field201 == 0) {
                    arg1.field1274 = "Loading ignore list";
                    arg1.field1261 = 0;
                } else if (var3 == 1 && this.field201 == 0) {
                    arg1.field1274 = "Please wait...";
                    arg1.field1261 = 0;
                } else {
                    int var7 = this.field241;
                    if (this.field201 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field1274 = "";
                        arg1.field1261 = 0;
                    } else {
                        arg1.field1274 = class67.method567(-550, class67.method564(this.field69[var3], true));
                        arg1.field1261 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field1281 = this.field241 * 15 + 20;
                if (arg1.field1281 <= arg1.field1245) {
                    arg1.field1281 = arg1.field1245 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1289 = 150;
                arg1.field1290 = (int) (Math.sin((double) field487 / 40.0D) * 256.0D) & 2047;
                if (this.field185) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field181[var8];
                        if (var15 >= 0 && !class43.field1177[var15].method419(0)) {
                            return;
                        }
                    }
                    this.field185 = false;
                    class35[] var9 = new class35[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field181[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class43.field1177[var14].method420(3246);
                        }
                    }
                    class35 var12 = new class35(false, var10, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field88[var13] != 0) {
                            var12.method393(field83[var13][0], field83[var13][this.field88[var13]]);
                            if (var13 == 1) {
                                var12.method393(field240[0], field240[this.field88[var13]]);
                            }
                        }
                    }
                    var12.method386(9);
                    var12.method387(class42.field1158[field113.field1353].field1160[0], -599);
                    var12.method396(64, 850, -30, -50, -30, true);
                    arg1.field1252 = 5;
                    arg1.field1253 = 0;
                    class48.method449(0, this.field416, 5, var12);
                }
            } else if (var3 == 324) {
                if (this.field142 == null) {
                    this.field142 = arg1.field1275;
                    this.field143 = arg1.field1282;
                }
                if (this.field202) {
                    arg1.field1275 = this.field143;
                } else {
                    arg1.field1275 = this.field142;
                }
            } else if (var3 == 325) {
                if (this.field142 == null) {
                    this.field142 = arg1.field1275;
                    this.field143 = arg1.field1282;
                }
                if (this.field202) {
                    arg1.field1275 = this.field142;
                } else {
                    arg1.field1275 = this.field143;
                }
            } else if (var3 == 600) {
                arg1.field1274 = this.field154;
                if (field487 % 20 < 10) {
                    arg1.field1274 = arg1.field1274 + "|";
                } else {
                    arg1.field1274 = arg1.field1274 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field316 >= 1) {
                        if (this.field112) {
                            arg1.field1263 = 16711680;
                            arg1.field1274 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1263 = 16777215;
                            arg1.field1274 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1274 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field310 != 0) {
                        String var16;
                        if (this.field192 == 0) {
                            var16 = "earlier today";
                        } else if (this.field192 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field192 + " days ago";
                        }
                        arg1.field1274 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg1.field1274 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field445 == 0) {
                        arg1.field1274 = "0 unread messages";
                        arg1.field1263 = 16776960;
                    }
                    if (this.field445 == 1) {
                        arg1.field1274 = "1 unread message";
                        arg1.field1263 = 65280;
                    }
                    if (this.field445 > 1) {
                        arg1.field1274 = this.field445 + " unread messages";
                        arg1.field1263 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field96 == 201) {
                        if (this.field379 == 1) {
                            arg1.field1274 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field1274 = "";
                        }
                    } else if (this.field96 == 200) {
                        arg1.field1274 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field96 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field96 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field96 + " days ago";
                        }
                        arg1.field1274 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field96 == 201) {
                        if (this.field379 == 1) {
                            arg1.field1274 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field1274 = "";
                        }
                    } else if (this.field96 == 200) {
                        arg1.field1274 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field1274 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field96 == 201) {
                        if (this.field379 == 1) {
                            arg1.field1274 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field1274 = "";
                        }
                    } else if (this.field96 == 200) {
                        arg1.field1274 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field1274 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else {
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
                arg1.field1274 = "";
                arg1.field1261 = 0;
            } else {
                if (this.field116[var3] == 0) {
                    arg1.field1274 = "@red@Offline";
                } else if (this.field116[var3] == field188) {
                    arg1.field1274 = "@gre@World-" + (this.field116[var3] - 9);
                } else {
                    arg1.field1274 = "@yel@World-" + (this.field116[var3] - 9);
                }
                arg1.field1261 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public final void method169(int arg0) {
        if (this.field303 == 0 && this.field390 == 0) {
            this.field149[this.field477] = "Walk here";
            this.field509[this.field477] = 472;
            this.field507[this.field477] = super.field812;
            this.field508[this.field477] = super.field813;
            ++this.field477;
        }
        int var2 = -1;
        int var3 = 67 / arg0;
        for (int var4 = 0; var4 < class35.field1071; ++var4) {
            int var5 = class35.field1072[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field397.method263(this.field123, var6, var7, var5) >= 0) {
                    class53 var10 = class53.method464(var9);
                    if (var10.field1439 != null) {
                        var10 = var10.method463(6);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field303 == 1) {
                        this.field149[this.field477] = "Use " + this.field307 + " with @cya@" + var10.field1451;
                        this.field509[this.field477] = 553;
                        this.field510[this.field477] = var5;
                        this.field507[this.field477] = var6;
                        this.field508[this.field477] = var7;
                        ++this.field477;
                    } else if (this.field390 == 1) {
                        if ((this.field392 & 4) == 4) {
                            this.field149[this.field477] = this.field393 + " @cya@" + var10.field1451;
                            this.field509[this.field477] = 591;
                            this.field510[this.field477] = var5;
                            this.field507[this.field477] = var6;
                            this.field508[this.field477] = var7;
                            ++this.field477;
                        }
                    } else {
                        if (var10.field1438 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1438[var11] != null) {
                                    this.field149[this.field477] = var10.field1438[var11] + " @cya@" + var10.field1451;
                                    if (var11 == 0) {
                                        this.field509[this.field477] = 91;
                                    }
                                    if (var11 == 1) {
                                        this.field509[this.field477] = 653;
                                    }
                                    if (var11 == 2) {
                                        this.field509[this.field477] = 583;
                                    }
                                    if (var11 == 3) {
                                        this.field509[this.field477] = 639;
                                    }
                                    if (var11 == 4) {
                                        this.field509[this.field477] = 1686;
                                    }
                                    this.field510[this.field477] = var5;
                                    this.field507[this.field477] = var6;
                                    this.field508[this.field477] = var7;
                                    ++this.field477;
                                }
                            }
                        }
                        this.field149[this.field477] = "Examine @cya@" + var10.field1451;
                        this.field509[this.field477] = 1689;
                        this.field510[this.field477] = var10.field1452 << 14;
                        this.field507[this.field477] = var6;
                        this.field508[this.field477] = var7;
                        ++this.field477;
                    }
                }
                if (var8 == 1) {
                    class3 var12 = this.field225[var9];
                    if (var12.field41.field916 == 1 && (var12.field1326 & 127) == 64 && (var12.field1327 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field226; ++var13) {
                            class3 var16 = this.field225[this.field227[var13]];
                            if (var16 != null && var12 != var16 && var16.field41.field916 == 1 && var12.field1326 == var16.field1326 && var12.field1327 == var16.field1327) {
                                this.method160(-753, var6, var7, this.field227[var13], var16.field41);
                            }
                        }
                        for (int var14 = 0; var14 < this.field251; ++var14) {
                            class38 var15 = this.field250[this.field252[var14]];
                            if (var15 != null && var12.field1326 == var15.field1326 && var12.field1327 == var15.field1327) {
                                this.method41(var15, var7, (byte) 8, var6, this.field252[var14]);
                            }
                        }
                    }
                    this.method160(-753, var6, var7, var9, var12.field41);
                }
                if (var8 == 0) {
                    class38 var17 = this.field250[var9];
                    if ((var17.field1326 & 127) == 64 && (var17.field1327 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field226; ++var18) {
                            class3 var21 = this.field225[this.field227[var18]];
                            if (var21 != null && var21.field41.field916 == 1 && var17.field1326 == var21.field1326 && var17.field1327 == var21.field1327) {
                                this.method160(-753, var6, var7, this.field227[var18], var21.field41);
                            }
                        }
                        for (int var19 = 0; var19 < this.field251; ++var19) {
                            class38 var20 = this.field250[this.field252[var19]];
                            if (var20 != null && var17 != var20 && var17.field1326 == var20.field1326 && var17.field1327 == var20.field1327) {
                                this.method41(var20, var7, (byte) 8, var6, this.field252[var19]);
                            }
                        }
                    }
                    this.method41(var17, var7, (byte) 8, var6, var9);
                }
                if (var8 == 3) {
                    class31 var22 = this.field272[this.field123][var6][var7];
                    if (var22 != null) {
                        for (class65 var23 = (class65) var22.method333(false); var23 != null; var23 = (class65) var22.method335(0)) {
                            class24 var24 = class24.method293(var23.field1618);
                            if (this.field303 == 1) {
                                this.field149[this.field477] = "Use " + this.field307 + " with @lre@" + var24.field877;
                                this.field509[this.field477] = 918;
                                this.field510[this.field477] = var23.field1618;
                                this.field507[this.field477] = var6;
                                this.field508[this.field477] = var7;
                                ++this.field477;
                            } else if (this.field390 == 1) {
                                if ((this.field392 & 1) == 1) {
                                    this.field149[this.field477] = this.field393 + " @lre@" + var24.field877;
                                    this.field509[this.field477] = 374;
                                    this.field510[this.field477] = var23.field1618;
                                    this.field507[this.field477] = var6;
                                    this.field508[this.field477] = var7;
                                    ++this.field477;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field840 != null && var24.field840[var25] != null) {
                                        this.field149[this.field477] = var24.field840[var25] + " @lre@" + var24.field877;
                                        if (var25 == 0) {
                                            this.field509[this.field477] = 343;
                                        }
                                        if (var25 == 1) {
                                            this.field509[this.field477] = 813;
                                        }
                                        if (var25 == 2) {
                                            this.field509[this.field477] = 933;
                                        }
                                        if (var25 == 3) {
                                            this.field509[this.field477] = 566;
                                        }
                                        if (var25 == 4) {
                                            this.field509[this.field477] = 412;
                                        }
                                        this.field510[this.field477] = var23.field1618;
                                        this.field507[this.field477] = var6;
                                        this.field508[this.field477] = var7;
                                        ++this.field477;
                                    } else if (var25 == 2) {
                                        this.field149[this.field477] = "Take @lre@" + var24.field877;
                                        this.field509[this.field477] = 933;
                                        this.field510[this.field477] = var23.field1618;
                                        this.field507[this.field477] = var6;
                                        this.field508[this.field477] = var7;
                                        ++this.field477;
                                    }
                                }
                                this.field149[this.field477] = "Examine @lre@" + var24.field877;
                                this.field509[this.field477] = 1770;
                                this.field510[this.field477] = var23.field1618;
                                this.field507[this.field477] = var6;
                                this.field508[this.field477] = var7;
                                ++this.field477;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)V")
    public final void method170(byte[] arg0, int arg1, boolean arg2) {
        if (this.field360 != arg1) {
            this.field531 = this.field374.method521();
        }
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg0, arg0.length);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)Ljava/lang/String;")
    private static final String method171(int arg0, int arg1) {
        if (arg0 != 36829) {
            field182 = !field182;
        }
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILQMQRUGDN;)V")
    public final void method172(int arg0, int arg1, class50 arg2) {
        if (arg1 == 0) {
            this.method173(8, arg2.field1327, arg2.field1326, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IIII)V")
    public final void method173(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
            int var5 = this.method119(this.field123, arg1, arg2, 4) - arg3;
            int var6 = arg2 - this.field488;
            int var7 = var5 - this.field489;
            int var8 = arg1 - this.field490;
            int var9 = class35.field1073[this.field491];
            int var10 = class35.field1074[this.field491];
            int var11 = class35.field1073[this.field492];
            int var12 = class35.field1074[this.field492];
            if (arg0 >= 8 && arg0 <= 8) {
                int var13 = var6 * var12 + var8 * var11 >> 16;
                int var14 = var8 * var12 - var6 * var11 >> 16;
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field430 = (var13 << 9) / var17 + class47.field1222;
                    this.field431 = (var16 << 9) / var17 + class47.field1223;
                } else {
                    this.field430 = -1;
                    this.field431 = -1;
                }
            }
        } else {
            this.field430 = -1;
            this.field431 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    private static final String method174(byte arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (this.field119 == arg0) {
            if (this.field477 >= 2 || this.field303 != 0 || this.field390 != 0) {
                String var2;
                if (this.field303 == 1 && this.field477 < 2) {
                    var2 = "Use " + this.field307 + " with...";
                } else if (this.field390 == 1 && this.field477 < 2) {
                    var2 = this.field393 + "...";
                } else {
                    var2 = this.field149[this.field477 - 1];
                }
                if (this.field477 > 2) {
                    var2 = var2 + "@whi@ / " + (this.field477 - 2) + " more options";
                }
                this.field294.method24(var2, 3, field487 / 1000, 15, 16777215, 4, true);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field134[var1] = var0 / 4;
        }
        field151 = -208;
        field188 = 10;
        field190 = true;
        field238 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field240 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field433 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field433[var3] = var2 - 1;
            var2 += var2;
        }
        field495 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field498 = 1;
    }
}
