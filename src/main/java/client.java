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
public class client extends class47 {

    @OriginalMember(owner = "client", name = "L", descriptor = "[I")
    private int[] field137 = new int[33];

    @OriginalMember(owner = "client", name = "M", descriptor = "[I")
    private int[] field138 = new int[class59.field1505];

    @OriginalMember(owner = "client", name = "O", descriptor = "Z")
    private boolean field140 = false;

    @OriginalMember(owner = "client", name = "P", descriptor = "Ljava/lang/String;")
    private String field141 = "";

    @OriginalMember(owner = "client", name = "Q", descriptor = "Ljava/lang/String;")
    private String field142 = "";

    @OriginalMember(owner = "client", name = "Y", descriptor = "Z")
    private boolean field150 = false;

    @OriginalMember(owner = "client", name = "Z", descriptor = "[LTTFRDWZK;")
    private class58[] field151 = new class58[32];

    @OriginalMember(owner = "client", name = "ab", descriptor = "Z")
    private boolean field152 = false;

    @OriginalMember(owner = "client", name = "bb", descriptor = "LPKHWFJLM;")
    private class43 field153 = class43.method318(676, 1);

    @OriginalMember(owner = "client", name = "cb", descriptor = "[Z")
    private boolean[] field154 = new boolean[5];

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field160 = -1;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field161 = -1;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    public int[] field162 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private boolean field164 = false;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field169 = -33719;

    @OriginalMember(owner = "client", name = "wb", descriptor = "Z")
    public boolean field174 = true;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field175 = -918;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field176 = 181;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Z")
    private boolean field180 = false;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "[I")
    private int[] field183 = new int[151];

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    public boolean field185 = false;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Ljava/lang/String;")
    private String field186 = "";

    @OriginalMember(owner = "client", name = "Jb", descriptor = "[[[I")
    private int[][][] field187 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[I")
    public int[] field188 = new int[2000];

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[I")
    private int[] field189 = new int[256];

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private final int[] field190 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Nb", descriptor = "B")
    private byte field191 = -123;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "[I")
    private int[] field193 = new int[class59.field1505];

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field194 = 2301979;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private final int field196 = 100;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[I")
    private int[] field197 = new int[100];

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Z")
    private boolean field198 = true;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field199 = -951;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[I")
    private int[] field200 = new int[50];

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field205 = 5;

    @OriginalMember(owner = "client", name = "dc", descriptor = "[J")
    private long[] field207 = new long[100];

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field208 = -165;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field210 = 2;

    @OriginalMember(owner = "client", name = "hc", descriptor = "[I")
    private int[] field211 = new int[5];

    @OriginalMember(owner = "client", name = "ic", descriptor = "Z")
    private boolean field212 = false;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Z")
    private boolean field213 = false;

    @OriginalMember(owner = "client", name = "kc", descriptor = "[I")
    private int[] field214 = new int[5];

    @OriginalMember(owner = "client", name = "lc", descriptor = "LUEUHLQTT;")
    private class61 field215 = new class61(0);

    @OriginalMember(owner = "client", name = "oc", descriptor = "[I")
    private int[] field218 = new int[100];

    @OriginalMember(owner = "client", name = "pc", descriptor = "[Ljava/lang/String;")
    private String[] field219 = new String[100];

    @OriginalMember(owner = "client", name = "qc", descriptor = "[Ljava/lang/String;")
    private String[] field220 = new String[100];

    @OriginalMember(owner = "client", name = "rc", descriptor = "Z")
    private volatile boolean field221 = false;

    @OriginalMember(owner = "client", name = "sc", descriptor = "Z")
    private boolean field222 = false;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field225 = 7;

    @OriginalMember(owner = "client", name = "wc", descriptor = "LUEUHLQTT;")
    private class61 field226 = new class61(0);

    @OriginalMember(owner = "client", name = "xc", descriptor = "[I")
    private int[] field227 = new int[class59.field1505];

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field234 = 2;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Z")
    private boolean field237 = false;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Z")
    private boolean field238 = true;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field240 = 1;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[LTJMGSZMW;")
    private class56[] field248 = new class56[4];

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field255 = -1;

    @OriginalMember(owner = "client", name = "bd", descriptor = "[I")
    private int[] field257 = new int[1000];

    @OriginalMember(owner = "client", name = "cd", descriptor = "[I")
    private int[] field258 = new int[1000];

    @OriginalMember(owner = "client", name = "dd", descriptor = "Z")
    private boolean field259 = false;

    @OriginalMember(owner = "client", name = "hd", descriptor = "[LTTFRDWZK;")
    private class58[] field263 = new class58[20];

    @OriginalMember(owner = "client", name = "id", descriptor = "[I")
    private int[] field264 = new int[9];

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field266 = 2;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field268 = 519;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Z")
    private boolean field269 = true;

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    private int[] field272 = new int[5];

    @OriginalMember(owner = "client", name = "sd", descriptor = "[LSFAIBATY;")
    private class53[] field273 = new class53[100];

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field274 = -658;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Ljava/lang/String;")
    private String field287 = "";

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Ljava/lang/String;")
    private String field288 = "";

    @OriginalMember(owner = "client", name = "Id", descriptor = "LUEUHLQTT;")
    private class61 field289 = new class61(0);

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Z")
    private boolean field291 = true;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field293 = 3;

    @OriginalMember(owner = "client", name = "Od", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Ljava/lang/String;")
    private String field297 = "";

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[J")
    private long[] field298 = new long[200];

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field299 = -35541;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[I")
    private int[] field302 = new int[33];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private int[] field304 = new int[151];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field305 = 78;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field307 = -16153;

    @OriginalMember(owner = "client", name = "de", descriptor = "Z")
    private boolean field310 = false;

    @OriginalMember(owner = "client", name = "ee", descriptor = "LPKHWFJLM;")
    private class43 field311 = class43.method318(676, 1);

    @OriginalMember(owner = "client", name = "je", descriptor = "Z")
    private boolean field316 = false;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field317 = false;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field319 = 1;

    @OriginalMember(owner = "client", name = "ne", descriptor = "Ljava/lang/String;")
    private String field320 = "";

    @OriginalMember(owner = "client", name = "pe", descriptor = "[I")
    private int[] field322 = new int[200];

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field324 = -653;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field325 = 44758;

    @OriginalMember(owner = "client", name = "te", descriptor = "[LSFAIBATY;")
    private class53[] field326 = new class53[13];

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field329 = -1;

    @OriginalMember(owner = "client", name = "xe", descriptor = "[[[LUEUHLQTT;")
    private class61[][][] field330 = new class61[4][104][104];

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Z")
    private boolean field337 = false;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field339 = -1;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field340 = 2;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field343 = -29012;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field350 = -1;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field353 = -1;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Z")
    private boolean field356 = false;

    @OriginalMember(owner = "client", name = "df", descriptor = "LPKHWFJLM;")
    private class43 field362 = new class43(new byte[5000], 0);

    @OriginalMember(owner = "client", name = "ef", descriptor = "[LPDAYFSBN;")
    private class42[] field363 = new class42[16384];

    @OriginalMember(owner = "client", name = "gf", descriptor = "[I")
    public int[] field365 = new int[16384];

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field366 = 128;

    @OriginalMember(owner = "client", name = "mf", descriptor = "[LTTFRDWZK;")
    private class58[] field370 = new class58[1000];

    @OriginalMember(owner = "client", name = "pf", descriptor = "[LTTFRDWZK;")
    private class58[] field373 = new class58[32];

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field375 = -1;

    @OriginalMember(owner = "client", name = "vf", descriptor = "[Ljava/lang/String;")
    private String[] field379 = new String[500];

    @OriginalMember(owner = "client", name = "yf", descriptor = "Z")
    private boolean field382 = true;

    @OriginalMember(owner = "client", name = "zf", descriptor = "[I")
    private int[] field383 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Df", descriptor = "[LSFAIBATY;")
    private class53[] field387 = new class53[2];

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Ljava/lang/String;")
    private String field390 = "";

    @OriginalMember(owner = "client", name = "Hf", descriptor = "[I")
    private int[] field391 = new int[2000];

    @OriginalMember(owner = "client", name = "Jf", descriptor = "Z")
    private volatile boolean field393 = false;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[LTTFRDWZK;")
    private class58[] field400 = new class58[100];

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field415 = 7759444;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field420 = -29826;

    @OriginalMember(owner = "client", name = "lg", descriptor = "[LTTFRDWZK;")
    private class58[] field421 = new class58[32];

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field422 = 428;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Z")
    private boolean field423 = false;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Ljava/lang/String;")
    private String field429 = "";

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field430 = -977;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field431 = -1;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field434 = new CRC32();

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field436 = 50;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "[I")
    private int[] field437 = new int[this.field436];

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[I")
    private int[] field438 = new int[this.field436];

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field439 = new int[this.field436];

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[I")
    private int[] field440 = new int[this.field436];

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field441 = new int[this.field436];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[I")
    private int[] field442 = new int[this.field436];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[I")
    private int[] field443 = new int[this.field436];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[Ljava/lang/String;")
    private String[] field444 = new String[this.field436];

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Z")
    private boolean field445 = false;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "[Ljava/lang/String;")
    private String[] field446 = new String[200];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field447 = 2;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field450 = 2048;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field451 = 2047;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[LQGDSNXKJ;")
    private class48[] field452 = new class48[this.field450];

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[I")
    public int[] field454 = new int[this.field450];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field456 = new int[this.field450];

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[LPKHWFJLM;")
    private class43[] field457 = new class43[this.field450];

    @OriginalMember(owner = "client", name = "dh", descriptor = "Z")
    private boolean field465 = true;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field468 = 5063219;

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    public int[] field485 = new int[1000];

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Z")
    private boolean field488 = true;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[[I")
    private int[][] field489 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field490 = false;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field491 = -1;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Z")
    private volatile boolean field492 = false;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[B")
    private byte[] field494 = new byte[16384];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "B")
    private byte field495 = -118;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[[I")
    private int[][] field496 = new int[104][104];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[[I")
    private int[][] field497 = new int[104][104];

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Z")
    private boolean field501 = false;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field502 = -1;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field515 = -1;

    @OriginalMember(owner = "client", name = "ci", descriptor = "[I")
    private int[] field516 = new int[5];

    @OriginalMember(owner = "client", name = "di", descriptor = "[LTTFRDWZK;")
    private class58[] field517 = new class58[8];

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field518 = -1;

    @OriginalMember(owner = "client", name = "si", descriptor = "[I")
    private int[] field532 = new int[50];

    @OriginalMember(owner = "client", name = "ui", descriptor = "Z")
    private boolean field534 = true;

    @OriginalMember(owner = "client", name = "vi", descriptor = "[LUZKSGXIW;")
    public class63[] field535 = new class63[5];

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field537 = -1;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Z")
    private boolean field540 = false;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field545 = -47097;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Z")
    private boolean field551 = false;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Z")
    private boolean field552 = false;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "LPKHWFJLM;")
    private class43 field553 = class43.method318(676, 1);

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[I")
    private int[] field555 = new int[5];

    @OriginalMember(owner = "client", name = "Vi", descriptor = "LRRTTGXYM;")
    private class52 field561 = new class52();

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[I")
    private int[] field565 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field566 = -1;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field567 = -1;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Z")
    private boolean field569 = false;

    @OriginalMember(owner = "client", name = "ej", descriptor = "Z")
    private boolean field570 = true;

    @OriginalMember(owner = "client", name = "ij", descriptor = "[Ljava/lang/String;")
    private String[] field574 = new String[5];

    @OriginalMember(owner = "client", name = "jj", descriptor = "[Z")
    private boolean[] field575 = new boolean[5];

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field576 = -551;

    @OriginalMember(owner = "client", name = "qj", descriptor = "[I")
    private int[] field582 = new int[7];

    @OriginalMember(owner = "client", name = "rj", descriptor = "Z")
    private boolean field583 = false;

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    private int[] field585 = new int[50];

    @OriginalMember(owner = "client", name = "wj", descriptor = "[I")
    private int[] field588 = new int[500];

    @OriginalMember(owner = "client", name = "xj", descriptor = "[I")
    private int[] field589 = new int[500];

    @OriginalMember(owner = "client", name = "yj", descriptor = "[I")
    private int[] field590 = new int[500];

    @OriginalMember(owner = "client", name = "zj", descriptor = "[I")
    private int[] field591 = new int[500];

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field596 = 3353893;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "[I")
    private int[] field608 = new int[4000];

    @OriginalMember(owner = "client", name = "Rj", descriptor = "[I")
    private int[] field609 = new int[4000];

    @OriginalMember(owner = "client", name = "Vj", descriptor = "Z")
    private boolean field613 = false;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Z")
    private static boolean field173 = true;

    @OriginalMember(owner = "client", name = "ac", descriptor = "[I")
    public static int[] field204 = new int[32];

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Z")
    private static boolean field232;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "[I")
    private static int[] field249;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field300;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Z")
    private static boolean field306;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private static int field389;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private static int field483;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field509;

    @OriginalMember(owner = "client", name = "ti", descriptor = "[I")
    public static final int[] field533;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Ljava/lang/String;")
    private static String field562;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[[I")
    public static final int[][] field563;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "I")
    private static int field614;

    @OriginalMember(owner = "client", name = "Yj", descriptor = "Z")
    private static boolean field616;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private static int field139;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private static int field181;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private static int field246;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private static int field247;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private static int field253;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private static int field296;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private static int field301;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private static int field315;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private static int field354;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private static int field377;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private static int field380;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private static int field388;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private static int field467;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private static int field557;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    private static int field610;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "I")
    private static int field611;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client", name = "ak", descriptor = "I")
    private static int field618;

    @OriginalMember(owner = "client", name = "bk", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client", name = "ud", descriptor = "J")
    private long field275;

    @OriginalMember(owner = "client", name = "ce", descriptor = "J")
    public long field309;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "J")
    private long field458;

    @OriginalMember(owner = "client", name = "eh", descriptor = "J")
    private long field466;

    @OriginalMember(owner = "client", name = "sj", descriptor = "J")
    private long field584;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "LFKSZIRZG;")
    private class20 field292;

    @OriginalMember(owner = "client", name = "pd", descriptor = "LJHGVYYQH;")
    private class28 field270;

    @OriginalMember(owner = "client", name = "ue", descriptor = "LLAXXBEFB;")
    private class29 field327;

    @OriginalMember(owner = "client", name = "ye", descriptor = "LQGDSNXKJ;")
    public static class48 field331;

    @OriginalMember(owner = "client", name = "fe", descriptor = "LSFAIBATY;")
    private class53 field312;

    @OriginalMember(owner = "client", name = "ge", descriptor = "LSFAIBATY;")
    private class53 field313;

    @OriginalMember(owner = "client", name = "he", descriptor = "LSFAIBATY;")
    private class53 field314;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "LSFAIBATY;")
    private class53 field341;

    @OriginalMember(owner = "client", name = "Je", descriptor = "LSFAIBATY;")
    private class53 field342;

    @OriginalMember(owner = "client", name = "Af", descriptor = "LSFAIBATY;")
    private class53 field384;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "LSFAIBATY;")
    private class53 field385;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "LSFAIBATY;")
    private class53 field386;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "LSFAIBATY;")
    private class53 field546;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "LSFAIBATY;")
    private class53 field547;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "LSFAIBATY;")
    private class53 field548;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "LSFAIBATY;")
    private class53 field549;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "LSFAIBATY;")
    private class53 field550;

    @OriginalMember(owner = "client", name = "Si", descriptor = "LSFAIBATY;")
    private class53 field558;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "LSFAIBATY;")
    private class53 field559;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "LSFAIBATY;")
    private class53 field602;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "LSFAIBATY;")
    private class53 field603;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "LSFAIBATY;")
    private class53 field604;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "LSFAIBATY;")
    private class53 field605;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "LSFAIBATY;")
    private class53 field606;

    @OriginalMember(owner = "client", name = "oe", descriptor = "LTLCMWCVC;")
    public class57 field321;

    @OriginalMember(owner = "client", name = "gb", descriptor = "LTTFRDWZK;")
    private class58 field158;

    @OriginalMember(owner = "client", name = "hb", descriptor = "LTTFRDWZK;")
    private class58 field159;

    @OriginalMember(owner = "client", name = "qd", descriptor = "LTTFRDWZK;")
    private class58 field271;

    @OriginalMember(owner = "client", name = "Me", descriptor = "LTTFRDWZK;")
    private class58 field345;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "LTTFRDWZK;")
    private class58 field346;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "LTTFRDWZK;")
    private class58 field347;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "LTTFRDWZK;")
    private class58 field348;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "LTTFRDWZK;")
    private class58 field349;

    @OriginalMember(owner = "client", name = "nf", descriptor = "LTTFRDWZK;")
    private class58 field371;

    @OriginalMember(owner = "client", name = "of", descriptor = "LTTFRDWZK;")
    private class58 field372;

    @OriginalMember(owner = "client", name = "zh", descriptor = "LTTFRDWZK;")
    private class58 field487;

    @OriginalMember(owner = "client", name = "Di", descriptor = "LTTFRDWZK;")
    private class58 field543;

    @OriginalMember(owner = "client", name = "fj", descriptor = "LTTFRDWZK;")
    private class58 field571;

    @OriginalMember(owner = "client", name = "gj", descriptor = "LTTFRDWZK;")
    private class58 field572;

    @OriginalMember(owner = "client", name = "pj", descriptor = "LTTFRDWZK;")
    private class58 field581;

    @OriginalMember(owner = "client", name = "gi", descriptor = "LBDJKVJZU;")
    private class5 field520;

    @OriginalMember(owner = "client", name = "hi", descriptor = "LBDJKVJZU;")
    private class5 field521;

    @OriginalMember(owner = "client", name = "ii", descriptor = "LBDJKVJZU;")
    private class5 field522;

    @OriginalMember(owner = "client", name = "ji", descriptor = "LBDJKVJZU;")
    private class5 field523;

    @OriginalMember(owner = "client", name = "gd", descriptor = "LTXPLZUUI;")
    private class60 field262;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "LWJVLISUF;")
    private class67 field394;

    @OriginalMember(owner = "client", name = "zb", descriptor = "LBEVLZSVU;")
    private class6 field177;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "LBEVLZSVU;")
    private class6 field178;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "LBEVLZSVU;")
    private class6 field179;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "LBEVLZSVU;")
    private class6 field401;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "LBEVLZSVU;")
    private class6 field402;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "LBEVLZSVU;")
    private class6 field403;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "LBEVLZSVU;")
    private class6 field404;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "LBEVLZSVU;")
    private class6 field405;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "LBEVLZSVU;")
    private class6 field406;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "LBEVLZSVU;")
    private class6 field407;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "LBEVLZSVU;")
    private class6 field408;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "LBEVLZSVU;")
    private class6 field409;

    @OriginalMember(owner = "client", name = "gg", descriptor = "LBEVLZSVU;")
    private class6 field416;

    @OriginalMember(owner = "client", name = "hg", descriptor = "LBEVLZSVU;")
    private class6 field417;

    @OriginalMember(owner = "client", name = "ig", descriptor = "LBEVLZSVU;")
    private class6 field418;

    @OriginalMember(owner = "client", name = "jg", descriptor = "LBEVLZSVU;")
    private class6 field419;

    @OriginalMember(owner = "client", name = "hh", descriptor = "LBEVLZSVU;")
    private class6 field469;

    @OriginalMember(owner = "client", name = "ih", descriptor = "LBEVLZSVU;")
    private class6 field470;

    @OriginalMember(owner = "client", name = "jh", descriptor = "LBEVLZSVU;")
    private class6 field471;

    @OriginalMember(owner = "client", name = "kh", descriptor = "LBEVLZSVU;")
    private class6 field472;

    @OriginalMember(owner = "client", name = "lh", descriptor = "LBEVLZSVU;")
    private class6 field473;

    @OriginalMember(owner = "client", name = "mh", descriptor = "LBEVLZSVU;")
    private class6 field474;

    @OriginalMember(owner = "client", name = "nh", descriptor = "LBEVLZSVU;")
    private class6 field475;

    @OriginalMember(owner = "client", name = "oh", descriptor = "LBEVLZSVU;")
    private class6 field476;

    @OriginalMember(owner = "client", name = "ph", descriptor = "LBEVLZSVU;")
    private class6 field477;

    @OriginalMember(owner = "client", name = "We", descriptor = "Ljava/lang/String;")
    private String field355;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Ljava/lang/String;")
    public String field399;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Ljava/lang/String;")
    private String field478;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "Ljava/lang/String;")
    public String field595;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Ljava/net/Socket;")
    private Socket field284;

    @OriginalMember(owner = "client", name = "cc", descriptor = "Z")
    public static boolean field206;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Z")
    private static boolean field286;

    @OriginalMember(owner = "client", name = "yi", descriptor = "Z")
    public static boolean field538;

    @OriginalMember(owner = "client", name = "Zj", descriptor = "Z")
    private static boolean field617;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "[I")
    private int[] field235;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[I")
    private int[] field236;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[I")
    private int[] field242;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    private int[] field243;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "[I")
    private int[] field244;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "[I")
    private int[] field245;

    @OriginalMember(owner = "client", name = "Se", descriptor = "[I")
    private int[] field351;

    @OriginalMember(owner = "client", name = "Te", descriptor = "[I")
    private int[] field352;

    @OriginalMember(owner = "client", name = "rh", descriptor = "[I")
    private int[] field479;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    private int[] field480;

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private int[] field481;

    @OriginalMember(owner = "client", name = "uh", descriptor = "[I")
    private int[] field482;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[I")
    private int[] field598;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[I")
    private int[] field599;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[I")
    private int[] field600;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[LSFAIBATY;")
    private class53[] field376;

    @OriginalMember(owner = "client", name = "uc", descriptor = "[[B")
    private byte[][] field224;

    @OriginalMember(owner = "client", name = "lj", descriptor = "[[B")
    private byte[][] field577;

    @OriginalMember(owner = "client", name = "mc", descriptor = "[[[B")
    private byte[][][] field216;

    @OriginalMember(owner = "client", name = "xg", descriptor = "[[[I")
    private int[][][] field433;

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZIIIIIII)Z")
    public final boolean method49(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field497[var15][var35] = 0;
                this.field489[var15][var35] = 99999999;
            }
        }
        int var16 = arg1;
        int var17 = arg0;
        this.field497[arg1][arg0] = 99;
        this.field489[arg1][arg0] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field608[var18] = arg1;
        int var36 = var18 + 1;
        this.field609[var18] = arg0;
        boolean var20 = false;
        int var21 = this.field608.length;
        int[][] var22 = this.field248[this.field601].field1483;
        while (var36 != var19) {
            var16 = this.field608[var19];
            var17 = this.field609[var19];
            var19 = (var19 + 1) % var21;
            if (arg9 == var16 && arg11 == var17) {
                var20 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && this.field248[this.field601].method489(arg2 - 1, var16, 5, arg9, arg11, var17, arg8)) {
                    var20 = true;
                    break;
                }
                if (arg2 < 10 && this.field248[this.field601].method490(arg8, arg2 - 1, var17, var16, arg9, arg11, 4)) {
                    var20 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg6 != 0 && this.field248[this.field601].method491(var17, arg11, arg6, arg7, (byte) 8, arg9, arg5, var16)) {
                var20 = true;
                break;
            }
            int var34 = this.field489[var16][var17] + 1;
            if (var16 > 0 && this.field497[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field608[var36] = var16 - 1;
                this.field609[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field497[var16 - 1][var17] = 2;
                this.field489[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field497[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field608[var36] = var16 + 1;
                this.field609[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field497[var16 + 1][var17] = 8;
                this.field489[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field497[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field608[var36] = var16;
                this.field609[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field497[var16][var17 - 1] = 1;
                this.field489[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field497[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field608[var36] = var16;
                this.field609[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field497[var16][var17 + 1] = 4;
                this.field489[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field497[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field608[var36] = var16 - 1;
                this.field609[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field497[var16 - 1][var17 - 1] = 3;
                this.field489[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field497[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field608[var36] = var16 + 1;
                this.field609[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field497[var16 + 1][var17 - 1] = 9;
                this.field489[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field497[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field608[var36] = var16 - 1;
                this.field609[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field497[var16 - 1][var17 + 1] = 6;
                this.field489[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field497[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field608[var36] = var16 + 1;
                this.field609[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field497[var16 + 1][var17 + 1] = 12;
                this.field489[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field251 = 0;
        if (!var20) {
            if (arg4) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg9 - var24; var25 <= arg9 + var24; ++var25) {
                        for (int var26 = arg11 - var24; var26 <= arg11 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field489[var25][var26] < var23) {
                                var23 = this.field489[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field251 = 1;
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
        if (arg10 != 3) {
            this.field576 = 111;
        }
        this.field608[var27] = var16;
        int var37 = var27 + 1;
        this.field609[var27] = var17;
        int var28;
        int var29 = var28 = this.field497[var16][var17];
        while (arg1 != var16 || arg0 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field608[var37] = var16;
                this.field609[var37++] = var17;
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
            var29 = this.field497[var16][var17];
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
            int var31 = this.field608[var37];
            int var32 = this.field609[var37];
            if (arg3 == 0) {
                this.field553.method319(185, false);
                this.field553.method320(var30 + var30 + 3);
            }
            if (arg3 == 1) {
                this.field553.method319(74, false);
                this.field553.method320(var30 + var30 + 3 + 14);
            }
            if (arg3 == 2) {
                this.field553.method319(232, false);
                this.field553.method320(var30 + var30 + 3);
            }
            this.field553.method321(this.field229 + var32);
            this.field553.method347(0, super.field1260[5] == 1 ? 1 : 0);
            this.field553.method321(this.field228 + var31);
            this.field541 = this.field608[0];
            this.field542 = this.field609[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field553.method347(0, this.field608[var37] - var31);
                this.field553.method348(8, this.field609[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 != 0) {
            this.method61();
        }
        if (super.field1256 == 1) {
            if (super.field1257 >= 6 && super.field1257 <= 106 && super.field1258 >= 467 && super.field1258 <= 499) {
                this.field536 = (this.field536 + 1) % 4;
                this.field583 = true;
                this.field310 = true;
                this.field553.method319(112, false);
                this.field553.method320(this.field536);
                this.field553.method320(this.field579);
                this.field553.method320(this.field412);
            }
            if (super.field1257 >= 135 && super.field1257 <= 235 && super.field1258 >= 467 && super.field1258 <= 499) {
                this.field579 = (this.field579 + 1) % 3;
                this.field583 = true;
                this.field310 = true;
                this.field553.method319(112, false);
                this.field553.method320(this.field536);
                this.field553.method320(this.field579);
                this.field553.method320(this.field412);
            }
            if (super.field1257 >= 273 && super.field1257 <= 373 && super.field1258 >= 467 && super.field1258 <= 499) {
                this.field412 = (this.field412 + 1) % 3;
                this.field583 = true;
                this.field310 = true;
                this.field553.method319(112, false);
                this.field553.method320(this.field536);
                this.field553.method320(this.field579);
                this.field553.method320(this.field412);
            }
            if (super.field1257 >= 412 && super.field1257 <= 512 && super.field1258 >= 467 && super.field1258 <= 499) {
                if (this.field375 == -1) {
                    this.method103(false);
                    this.field186 = "";
                    this.field152 = false;
                    this.field329 = this.field375 = class52.field1362;
                    return;
                }
                this.method191(0, "", "Please close the interface you have open before using 'report abuse'", (byte) -92);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (this.field294 != 0) {
            class5 var2 = this.field521;
            int var3 = 0;
            this.field357 += arg0;
            if (this.field414 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field220[var4] != null) {
                    int var5 = this.field218[var4];
                    String var6 = this.field219[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field579 == 0 || this.field579 == 1 && this.method64(var6, (byte) -47))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method13(var9, (byte) 1, "From", 0, var8);
                        var2.method13(var9, (byte) 1, "From", 65535, var8 - 1);
                        int var10 = var9 + var2.method11("From ", false);
                        if (var7 == 1) {
                            this.field387[0].method473(var10, var8 - 12, 30573);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field387[1].method473(var10, var8 - 12, 30573);
                            var10 += 14;
                        }
                        var2.method13(var10, (byte) 1, var6 + ": " + this.field220[var4], 0, var8);
                        var2.method13(var10, (byte) 1, var6 + ": " + this.field220[var4], 65535, var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field579 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method13(4, (byte) 1, this.field220[var4], 0, var11);
                        var2.method13(4, (byte) 1, this.field220[var4], 65535, var11 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field579 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method13(4, (byte) 1, "To " + var6 + ": " + this.field220[var4], 0, var12);
                        var2.method13(4, (byte) 1, "To " + var6 + ": " + this.field220[var4], 65535, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public static final void method52(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class67.field1568 = true;
        class71.field1695 = true;
        field617 = true;
        class9.field133 = true;
        class33.field996 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method53(boolean arg0) {
        this.field185 &= arg0;
        try {
            int var2 = field331.field1453 + this.field233;
            int var3 = field331.field1454 + this.field209;
            if (this.field498 - var2 < -500 || this.field498 - var2 > 500 || this.field499 - var3 < -500 || this.field499 - var3 > 500) {
                this.field498 = var2;
                this.field499 = var3;
            }
            if (this.field498 != var2) {
                this.field498 += (var2 - this.field498) / 16;
            }
            if (this.field499 != var3) {
                this.field499 += (var3 - this.field499) / 16;
            }
            if (super.field1260[1] == 1) {
                this.field368 += (-24 - this.field368) / 2;
            } else if (super.field1260[2] == 1) {
                this.field368 += (24 - this.field368) / 2;
            } else {
                this.field368 /= 2;
            }
            if (super.field1260[3] == 1) {
                this.field369 += (12 - this.field369) / 2;
            } else if (super.field1260[4] == 1) {
                this.field369 += (-12 - this.field369) / 2;
            } else {
                this.field369 /= 2;
            }
            this.field367 = this.field368 / 2 + this.field367 & 2047;
            this.field366 += this.field369 / 2;
            if (this.field366 < 128) {
                this.field366 = 128;
            }
            if (this.field366 > 383) {
                this.field366 = 383;
            }
            int var4 = this.field498 >> 7;
            int var5 = this.field499 >> 7;
            int var6 = this.method57(this.field601, this.field498, this.field208, this.field499);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field601;
                        if (var10 < 3 && (this.field216[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field433[var10][var8][var9];
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
            if (var12 > this.field539) {
                this.field539 += (var12 - this.field539) / 24;
            } else if (var12 < this.field539) {
                this.field539 += (var12 - this.field539) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field331.field1453 + "," + field331.field1454 + "," + this.field498 + "," + this.field499 + "," + this.field171 + "," + this.field172 + "," + this.field228 + "," + this.field229);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method54(int arg0) {
        if (arg0 <= 0) {
            this.field553.method320(25);
        }
        if (super.field1256 == 1) {
            if (super.field1257 >= 539 && super.field1257 <= 573 && super.field1258 >= 169 && super.field1258 < 205 && this.field383[0] != -1) {
                this.field316 = true;
                this.field293 = 0;
                this.field423 = true;
            }
            if (super.field1257 >= 569 && super.field1257 <= 599 && super.field1258 >= 168 && super.field1258 < 205 && this.field383[1] != -1) {
                this.field316 = true;
                this.field293 = 1;
                this.field423 = true;
            }
            if (super.field1257 >= 597 && super.field1257 <= 627 && super.field1258 >= 168 && super.field1258 < 205 && this.field383[2] != -1) {
                this.field316 = true;
                this.field293 = 2;
                this.field423 = true;
            }
            if (super.field1257 >= 625 && super.field1257 <= 669 && super.field1258 >= 168 && super.field1258 < 203 && this.field383[3] != -1) {
                this.field316 = true;
                this.field293 = 3;
                this.field423 = true;
            }
            if (super.field1257 >= 666 && super.field1257 <= 696 && super.field1258 >= 168 && super.field1258 < 205 && this.field383[4] != -1) {
                this.field316 = true;
                this.field293 = 4;
                this.field423 = true;
            }
            if (super.field1257 >= 694 && super.field1257 <= 724 && super.field1258 >= 168 && super.field1258 < 205 && this.field383[5] != -1) {
                this.field316 = true;
                this.field293 = 5;
                this.field423 = true;
            }
            if (super.field1257 >= 722 && super.field1257 <= 756 && super.field1258 >= 169 && super.field1258 < 205 && this.field383[6] != -1) {
                this.field316 = true;
                this.field293 = 6;
                this.field423 = true;
            }
            if (super.field1257 >= 540 && super.field1257 <= 574 && super.field1258 >= 466 && super.field1258 < 502 && this.field383[7] != -1) {
                this.field316 = true;
                this.field293 = 7;
                this.field423 = true;
            }
            if (super.field1257 >= 572 && super.field1257 <= 602 && super.field1258 >= 466 && super.field1258 < 503 && this.field383[8] != -1) {
                this.field316 = true;
                this.field293 = 8;
                this.field423 = true;
            }
            if (super.field1257 >= 599 && super.field1257 <= 629 && super.field1258 >= 466 && super.field1258 < 503 && this.field383[9] != -1) {
                this.field316 = true;
                this.field293 = 9;
                this.field423 = true;
            }
            if (super.field1257 >= 627 && super.field1257 <= 671 && super.field1258 >= 467 && super.field1258 < 502 && this.field383[10] != -1) {
                this.field316 = true;
                this.field293 = 10;
                this.field423 = true;
            }
            if (super.field1257 >= 669 && super.field1257 <= 699 && super.field1258 >= 466 && super.field1258 < 503 && this.field383[11] != -1) {
                this.field316 = true;
                this.field293 = 11;
                this.field423 = true;
            }
            if (super.field1257 >= 696 && super.field1257 <= 726 && super.field1258 >= 466 && super.field1258 < 503 && this.field383[12] != -1) {
                this.field316 = true;
                this.field293 = 12;
                this.field423 = true;
            }
            if (super.field1257 >= 724 && super.field1257 <= 758 && super.field1258 >= 466 && super.field1258 < 502 && this.field383[13] != -1) {
                this.field316 = true;
                this.field293 = 13;
                this.field423 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 != -16153) {
            this.method61();
        }
        if (field617 && this.field149 == 2 && class9.field132 != this.field601) {
            this.method124("Loading - please wait.", -182, (String) null);
            this.field149 = 1;
            this.field275 = System.currentTimeMillis();
        }
        if (this.field149 == 1) {
            int var2 = this.method56(-726);
            if (var2 != 0 && System.currentTimeMillis() - this.field275 > 360000L) {
                signlink.reporterror(this.field141 + " glcfb " + this.field466 + "," + var2 + "," + field617 + "," + this.field535[0] + "," + this.field270.method268() + "," + this.field601 + "," + this.field171 + "," + this.field172);
                this.field275 = System.currentTimeMillis();
            }
        }
        if (this.field149 == 2 && this.field601 != this.field502) {
            this.field502 = this.field601;
            this.method136(27567, this.field601);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)I")
    public final int method56(int arg0) {
        for (int var2 = 0; var2 < this.field224.length; ++var2) {
            if (this.field224[var2] == null && this.field599[var2] != -1) {
                return -1;
            }
            if (this.field577[var2] == null && this.field600[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field224.length; ++var4) {
            byte[] var5 = this.field577[var4];
            if (var5 != null) {
                int var6 = (this.field598[var4] >> 8) * 64 - this.field228;
                int var7 = (this.field598[var4] & 255) * 64 - this.field229;
                if (this.field212) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class9.method33(-22551, var5, var6, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field237) {
            return -4;
        } else {
            this.field149 = 2;
            class9.field132 = this.field601;
            this.method132((byte) -122);
            if (arg0 >= 0) {
                this.field324 = this.field327.method276();
            }
            this.field553.method319(154, false);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method57(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.field216[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg1 & 127;
            int var9 = arg3 & 127;
            int var10 = (128 - var8) * this.field433[var7][var5][var6] + this.field433[var7][var5 + 1][var6] * var8 >> 7;
            while (arg2 >= 0) {
                this.field176 = this.field327.method276();
            }
            int var11 = (128 - var8) * this.field433[var7][var5][var6 + 1] + this.field433[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method58(byte arg0) {
        this.field393 = true;
        if (arg0 != 1) {
            field389 = -132;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field492) {
                ++this.field217;
                this.method69(5);
                this.method69(5);
                this.method115(this.field540);
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
        this.field393 = false;
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field614 = Integer.parseInt(this.getParameter("nodeid"));
        field615 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method52(8);
        } else {
            method101(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field616 = false;
        } else {
            field616 = true;
        }
        this.method443(765, (byte) 6, 503);
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method59(int arg0) {
        this.field419.method24(-214);
        if (arg0 < 0) {
            class71.field1706 = this.field242;
            this.field386.method473(0, 0, 30573);
            if (this.field164) {
                this.field522.method9(40, 239, this.field390, 0, false);
                this.field522.method9(60, 239, this.field429 + "*", 128, false);
            } else if (this.field250 == 1) {
                this.field522.method9(40, 239, "Enter amount:", 0, false);
                this.field522.method9(60, 239, this.field320 + "*", 128, false);
            } else if (this.field250 == 2) {
                this.field522.method9(40, 239, "Enter name:", 0, false);
                this.field522.method9(60, 239, this.field320 + "*", 128, false);
            } else if (this.field478 != null) {
                this.field522.method9(40, 239, this.field478, 0, false);
                this.field522.method9(60, 239, "Click to continue", 128, false);
            } else if (this.field339 != -1) {
                this.method172(0, 0, 0, class52.method458(this.field339), 0);
            } else if (this.field518 != -1) {
                this.method172(0, 0, 0, class52.method458(this.field518), 0);
            } else {
                class5 var2 = this.field521;
                int var3 = 0;
                class12.method199(77, 0, 0, (byte) 6, 463);
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field220[var4] != null) {
                        int var6 = this.field218[var4];
                        int var7 = 70 - var3 * 14 + this.field556;
                        String var8 = this.field219[var4];
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
                                var2.method13(4, (byte) 1, this.field220[var4], 0, var7);
                            }
                            ++var3;
                        }
                        if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field536 == 0 || this.field536 == 1 && this.method64(var8, (byte) -47))) {
                            if (var7 > 0 && var7 < 110) {
                                int var10 = 4;
                                if (var9 == 1) {
                                    this.field387[0].method473(var10, var7 - 12, 30573);
                                    var10 += 14;
                                }
                                if (var9 == 2) {
                                    this.field387[1].method473(var10, var7 - 12, 30573);
                                    var10 += 14;
                                }
                                var2.method13(var10, (byte) 1, var8 + ":", 0, var7);
                                int var11 = var10 + var2.method11(var8, false) + 8;
                                var2.method13(var11, (byte) 1, this.field220[var4], 255, var7);
                            }
                            ++var3;
                        }
                        if ((var6 == 3 || var6 == 7) && this.field294 == 0 && (var6 == 7 || this.field579 == 0 || this.field579 == 1 && this.method64(var8, (byte) -47))) {
                            if (var7 > 0 && var7 < 110) {
                                byte var12 = 4;
                                var2.method13(var12, (byte) 1, "From", 0, var7);
                                int var13 = var12 + var2.method11("From ", false);
                                if (var9 == 1) {
                                    this.field387[0].method473(var13, var7 - 12, 30573);
                                    var13 += 14;
                                }
                                if (var9 == 2) {
                                    this.field387[1].method473(var13, var7 - 12, 30573);
                                    var13 += 14;
                                }
                                var2.method13(var13, (byte) 1, var8 + ":", 0, var7);
                                int var14 = var13 + var2.method11(var8, false) + 8;
                                var2.method13(var14, (byte) 1, this.field220[var4], 8388608, var7);
                            }
                            ++var3;
                        }
                        if (var6 == 4 && (this.field412 == 0 || this.field412 == 1 && this.method64(var8, (byte) -47))) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method13(4, (byte) 1, var8 + " " + this.field220[var4], 8388736, var7);
                            }
                            ++var3;
                        }
                        if (var6 == 5 && this.field294 == 0 && this.field579 < 2) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method13(4, (byte) 1, this.field220[var4], 8388608, var7);
                            }
                            ++var3;
                        }
                        if (var6 == 6 && this.field294 == 0 && this.field579 < 2) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method13(4, (byte) 1, "To " + var8 + ":", 0, var7);
                                var2.method13(12 + var2.method11("To " + var8, false), (byte) 1, this.field220[var4], 8388608, var7);
                            }
                            ++var3;
                        }
                        if (var6 == 8 && (this.field412 == 0 || this.field412 == 1 && this.method64(var8, (byte) -47))) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method13(4, (byte) 1, var8 + " " + this.field220[var4], 8270336, var7);
                            }
                            ++var3;
                        }
                    }
                }
                class12.method198(546);
                this.field305 = var3 * 14 + 7;
                if (this.field305 < 78) {
                    this.field305 = 78;
                }
                this.method188(this.field305, 77, 0, 463, this.field305 - this.field556 - 77, true);
                String var5;
                if (field331 != null && field331.field1269 != null) {
                    var5 = field331.field1269;
                } else {
                    var5 = class36.method304(-616, this.field141);
                }
                var2.method13(4, (byte) 1, var5 + ":", 0, 90);
                var2.method13(6 + var2.method11(var5 + ": ", false), (byte) 1, this.field297 + "*", 255, 90);
                class12.method205(479, 0, (byte) -92, 0, 77);
            }
            if (this.field337 && this.field424 == 2) {
                this.method84(false);
            }
            this.field419.method25(-71, 357, super.field1242, 17);
            this.field418.method24(-214);
            class71.field1706 = this.field244;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method60(int arg0) {
        Graphics var2 = this.method161(9).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        int var3 = 54 / arg0;
        this.method445((byte) 2, 1);
        if (this.field552) {
            this.field492 = false;
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
        if (this.field180) {
            this.field492 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field317) {
            this.field492 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method61() {
        this.method138("Starting up", -460, 20);
        if (signlink.sunjava) {
            super.field1236 = 5;
        }
        if (field286) {
            this.field317 = true;
        } else {
            field286 = true;
            boolean var1 = false;
            String var2 = this.method76(true);
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
            if (var2.endsWith("192.168.1.224")) {
                var1 = true;
            }
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field180 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field535[var3] = new class63(500000, signlink.cache_dat, false, var3 + 1, signlink.cache_idx[var3]);
                    }
                }
                try {
                    this.method166(-28667);
                    this.field262 = this.method184(25, this.field264[1], "title screen", 1, 0, "title");
                    this.field520 = new class5(26521, false, this.field262, "p11_full");
                    this.field521 = new class5(26521, false, this.field262, "p12_full");
                    this.field522 = new class5(26521, false, this.field262, "b12_full");
                    this.field523 = new class5(26521, true, this.field262, "q8_full");
                    this.method143(0);
                    this.method91(field232);
                    class60 var4 = this.method184(30, this.field264[2], "config", 2, 0, "config");
                    class60 var5 = this.method184(35, this.field264[3], "interface", 3, 0, "interface");
                    class60 var6 = this.method184(40, this.field264[4], "2d graphics", 4, 0, "media");
                    class60 var7 = this.method184(45, this.field264[6], "textures", 6, 0, "textures");
                    class60 var8 = this.method184(50, this.field264[7], "chat system", 7, 0, "wordenc");
                    class60 var9 = this.method184(55, this.field264[8], "sound effects", 8, 0, "sounds");
                    this.field216 = new byte[4][104][104];
                    this.field433 = new int[4][105][105];
                    this.field394 = new class67(this.field433, false, 4, 104, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field248[var10] = new class56(104, 104, 9);
                    }
                    this.field543 = new class58(512, 512);
                    class60 var11 = this.method184(60, this.field264[5], "update list", 5, 0, "versionlist");
                    this.method138("Connecting to update server", -460, 60);
                    this.field270 = new class28();
                    this.field270.method272(var11, this);
                    class3.method1(this.field270.method255(-871));
                    class45.method407(this.field270.method262(0, 163), this.field270);
                    if (!field617) {
                        this.field290 = 0;
                        try {
                            this.field290 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var72) {
                        }
                        this.field291 = true;
                        this.field270.method265(2, this.field290);
                        while (this.field270.method268() > 0) {
                            this.method168(-36407);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field270.field946 > 3) {
                                this.method158("ondemand");
                                return;
                            }
                        }
                    }
                    this.method138("Requesting animations", -460, 65);
                    int var12 = this.field270.method262(1, 163);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field270.method265(1, var13);
                    }
                    while (this.field270.method268() > 0) {
                        int var14 = var12 - this.field270.method268();
                        if (var14 > 0) {
                            this.method138("Loading animations - " + var14 * 100 / var12 + "%", -460, 65);
                        }
                        this.method168(-36407);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field270.field946 > 3) {
                            this.method158("ondemand");
                            return;
                        }
                    }
                    this.method138("Requesting models", -460, 70);
                    int var15 = this.field270.method262(0, 163);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field270.method273(var16, (byte) -88);
                        if ((var17 & 1) != 0) {
                            this.field270.method265(0, var16);
                        }
                    }
                    int var18 = this.field270.method268();
                    while (this.field270.method268() > 0) {
                        int var19 = var18 - this.field270.method268();
                        if (var19 > 0) {
                            this.method138("Loading models - " + var19 * 100 / var18 + "%", -460, 70);
                        }
                        this.method168(-36407);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field535[0] != null) {
                        this.method138("Requesting maps", -460, 75);
                        this.field270.method265(3, this.field270.method257(867, 47, 0, 48));
                        this.field270.method265(3, this.field270.method257(867, 47, 1, 48));
                        this.field270.method265(3, this.field270.method257(867, 48, 0, 48));
                        this.field270.method265(3, this.field270.method257(867, 48, 1, 48));
                        this.field270.method265(3, this.field270.method257(867, 49, 0, 48));
                        this.field270.method265(3, this.field270.method257(867, 49, 1, 48));
                        this.field270.method265(3, this.field270.method257(867, 47, 0, 47));
                        this.field270.method265(3, this.field270.method257(867, 47, 1, 47));
                        this.field270.method265(3, this.field270.method257(867, 48, 0, 47));
                        this.field270.method265(3, this.field270.method257(867, 48, 1, 47));
                        this.field270.method265(3, this.field270.method257(867, 48, 0, 148));
                        this.field270.method265(3, this.field270.method257(867, 48, 1, 148));
                        int var20 = this.field270.method268();
                        while (this.field270.method268() > 0) {
                            int var21 = var20 - this.field270.method268();
                            if (var21 > 0) {
                                this.method138("Loading maps - " + var21 * 100 / var20 + "%", -460, 75);
                            }
                            this.method168(-36407);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field270.method262(0, 163);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field270.method273(var23, (byte) -88);
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
                            this.field270.method275(-13858, var25, var23, 0);
                        }
                    }
                    this.field270.method270(field616, (byte) 0);
                    if (!field617) {
                        int var26 = this.field270.method262(2, 163);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field270.method271(false, var27)) {
                                this.field270.method275(-13858, (byte) 1, var27, 2);
                            }
                        }
                    }
                    this.method138("Unpacking media", -460, 80);
                    this.field384 = new class53(var6, "invback", 0);
                    this.field386 = new class53(var6, "chatback", 0);
                    this.field385 = new class53(var6, "mapback", 0);
                    this.field312 = new class53(var6, "backbase1", 0);
                    this.field313 = new class53(var6, "backbase2", 0);
                    this.field314 = new class53(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field326[var28] = new class53(var6, "sideicons", var28);
                    }
                    this.field581 = new class58(var6, "compass", 0);
                    this.field271 = new class58(var6, "mapedge", 0);
                    this.field271.method494(0);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field273[var29] = new class53(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field400[var30] = new class58(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field263[var31] = new class58(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field421[var32] = new class58(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field373[var33] = new class58(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field151[var34] = new class58(var6, "headicons_hint", var34);
                    }
                    this.field487 = new class58(var6, "overlay_multiway", 0);
                    this.field158 = new class58(var6, "mapmarker", 0);
                    this.field159 = new class58(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field517[var35] = new class58(var6, "cross", var35);
                    }
                    this.field345 = new class58(var6, "mapdots", 0);
                    this.field346 = new class58(var6, "mapdots", 1);
                    this.field347 = new class58(var6, "mapdots", 2);
                    this.field348 = new class58(var6, "mapdots", 3);
                    this.field349 = new class58(var6, "mapdots", 4);
                    this.field558 = new class53(var6, "scrollbar", 0);
                    this.field559 = new class53(var6, "scrollbar", 1);
                    this.field602 = new class53(var6, "redstone1", 0);
                    this.field603 = new class53(var6, "redstone2", 0);
                    this.field604 = new class53(var6, "redstone3", 0);
                    this.field605 = new class53(var6, "redstone1", 0);
                    this.field605.method470(-3665);
                    this.field606 = new class53(var6, "redstone2", 0);
                    this.field606.method470(-3665);
                    this.field546 = new class53(var6, "redstone1", 0);
                    this.field546.method471(false);
                    this.field547 = new class53(var6, "redstone2", 0);
                    this.field547.method471(false);
                    this.field548 = new class53(var6, "redstone3", 0);
                    this.field548.method471(false);
                    this.field549 = new class53(var6, "redstone1", 0);
                    this.field549.method470(-3665);
                    this.field549.method471(false);
                    this.field550 = new class53(var6, "redstone2", 0);
                    this.field550.method470(-3665);
                    this.field550.method471(false);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field387[var36] = new class53(var6, "mod_icons", var36);
                    }
                    class58 var37 = new class58(var6, "backleft1", 0);
                    this.field469 = new class6(var37.field1500, var37.field1499, this.method161(9), false);
                    var37.method495(0, -640, 0);
                    class58 var38 = new class58(var6, "backleft2", 0);
                    this.field470 = new class6(var38.field1500, var38.field1499, this.method161(9), false);
                    var38.method495(0, -640, 0);
                    class58 var39 = new class58(var6, "backright1", 0);
                    this.field471 = new class6(var39.field1500, var39.field1499, this.method161(9), false);
                    var39.method495(0, -640, 0);
                    class58 var40 = new class58(var6, "backright2", 0);
                    this.field472 = new class6(var40.field1500, var40.field1499, this.method161(9), false);
                    var40.method495(0, -640, 0);
                    class58 var41 = new class58(var6, "backtop1", 0);
                    this.field473 = new class6(var41.field1500, var41.field1499, this.method161(9), false);
                    var41.method495(0, -640, 0);
                    class58 var42 = new class58(var6, "backvmid1", 0);
                    this.field474 = new class6(var42.field1500, var42.field1499, this.method161(9), false);
                    var42.method495(0, -640, 0);
                    class58 var43 = new class58(var6, "backvmid2", 0);
                    this.field475 = new class6(var43.field1500, var43.field1499, this.method161(9), false);
                    var43.method495(0, -640, 0);
                    class58 var44 = new class58(var6, "backvmid3", 0);
                    this.field476 = new class6(var44.field1500, var44.field1499, this.method161(9), false);
                    var44.method495(0, -640, 0);
                    class58 var45 = new class58(var6, "backhmid2", 0);
                    this.field477 = new class6(var45.field1500, var45.field1499, this.method161(9), false);
                    var45.method495(0, -640, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field400[var50] != null) {
                            this.field400[var50].method493(false, var46 + var49, var47 + var49, var48 + var49);
                        }
                        if (this.field273[var50] != null) {
                            this.field273[var50].method472(false, var46 + var49, var47 + var49, var48 + var49);
                        }
                    }
                    this.method138("Unpacking textures", -460, 83);
                    class71.method589(var7, false);
                    class71.method593(-620, 0.8D);
                    class71.method588(field306, 20);
                    this.method138("Unpacking config", -460, 86);
                    class14.method214(field389, var4);
                    class33.method297(var4);
                    class49.method450(field389, var4);
                    class21.method237(var4);
                    class70.method580(var4);
                    class46.method436(field389, var4);
                    class23.method249(field389, var4);
                    class69.method574(field389, var4);
                    class4.method6(field389, var4);
                    class21.field844 = field616;
                    if (!field617) {
                        this.method138("Unpacking sounds", -460, 90);
                        byte[] var51 = var9.method506("sounds.dat", (byte[]) null);
                        class43 var52 = new class43(var51, 0);
                        class38.method306(field389, var52);
                    }
                    this.method138("Unpacking interfaces", -460, 95);
                    class5[] var53 = new class5[] { this.field520, this.field521, this.field522, this.field523 };
                    class52.method460(419, var53, var5, var6);
                    this.method138("Preparing game engine", -460, 100);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field385.field1393[this.field385.field1395 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field137[var54] = var55;
                        this.field302[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field385.field1393[this.field385.field1395 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field304[var58 - 5] = var59 - 25;
                        this.field183[var58 - 5] = var60 - var59;
                    }
                    class71.method586(-604, 503, 765);
                    this.field245 = class71.field1706;
                    class71.method586(-604, 96, 479);
                    this.field242 = class71.field1706;
                    class71.method586(-604, 261, 190);
                    this.field243 = class71.field1706;
                    class71.method586(-604, 334, 512);
                    this.field244 = class71.field1706;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class71.field1704[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class67.method559(800, var62, (byte) -41, 334, 512, 500);
                    class44.method368(var8);
                    this.field321 = new class57(-562, this);
                    this.method135(this.field321, 10);
                    class54.field1414 = this;
                    class33.field995 = this;
                    class70.field1656 = this;
                } catch (Exception var73) {
                    signlink.reporterror("loaderror " + this.field355 + " " + this.field184);
                    this.field552 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)Z")
    public final boolean method62(int arg0) {
        if (arg0 != -1384) {
            this.field330 = null;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1245 != null) {
                    return new URL("http://127.0.0.1:" + (field615 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method63(int arg0, boolean arg1) {
        this.field185 &= arg1;
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method64(String arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field156; ++var3) {
                if (arg0.equalsIgnoreCase(this.field446[var3])) {
                    return true;
                }
            }
            if (arg1 != -47) {
                this.field330 = null;
            }
            return arg0.equalsIgnoreCase(field331.field1269);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method65(boolean arg0) {
        this.field185 &= arg0;
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method66(int arg0) {
        if (arg0 == 0) {
            if (this.field395 == 0 && this.field592 == 0) {
                this.field379[this.field392] = "Walk here";
                this.field590[this.field392] = 124;
                this.field588[this.field392] = super.field1250;
                this.field589[this.field392] = super.field1251;
                ++this.field392;
            }
            int var2 = -1;
            for (int var3 = 0; var3 < class45.field1211; ++var3) {
                int var4 = class45.field1212[var3];
                int var5 = var4 & 127;
                int var6 = var4 >> 7 & 127;
                int var7 = var4 >> 29 & 3;
                int var8 = var4 >> 14 & 32767;
                if (var2 != var4) {
                    var2 = var4;
                    if (var7 == 2 && this.field394.method553(this.field601, var5, var6, var4) >= 0) {
                        class33 var9 = class33.method290(var8);
                        if (var9.field1000 != null) {
                            var9 = var9.method291(748);
                        }
                        if (var9 == null) {
                            continue;
                        }
                        if (this.field395 == 1) {
                            this.field379[this.field392] = "Use " + this.field399 + " with @cya@" + var9.field1016;
                            this.field590[this.field392] = 611;
                            this.field591[this.field392] = var4;
                            this.field588[this.field392] = var5;
                            this.field589[this.field392] = var6;
                            ++this.field392;
                        } else if (this.field592 == 1) {
                            if ((this.field594 & 4) == 4) {
                                this.field379[this.field392] = this.field595 + " @cya@" + var9.field1016;
                                this.field590[this.field392] = 234;
                                this.field591[this.field392] = var4;
                                this.field588[this.field392] = var5;
                                this.field589[this.field392] = var6;
                                ++this.field392;
                            }
                        } else {
                            if (var9.field1003 != null) {
                                for (int var10 = 4; var10 >= 0; --var10) {
                                    if (var9.field1003[var10] != null) {
                                        this.field379[this.field392] = var9.field1003[var10] + " @cya@" + var9.field1016;
                                        if (var10 == 0) {
                                            this.field590[this.field392] = 74;
                                        }
                                        if (var10 == 1) {
                                            this.field590[this.field392] = 743;
                                        }
                                        if (var10 == 2) {
                                            this.field590[this.field392] = 125;
                                        }
                                        if (var10 == 3) {
                                            this.field590[this.field392] = 982;
                                        }
                                        if (var10 == 4) {
                                            this.field590[this.field392] = 1545;
                                        }
                                        this.field591[this.field392] = var4;
                                        this.field588[this.field392] = var5;
                                        this.field589[this.field392] = var6;
                                        ++this.field392;
                                    }
                                }
                            }
                            this.field379[this.field392] = "Examine @cya@" + var9.field1016;
                            this.field590[this.field392] = 1634;
                            this.field591[this.field392] = var9.field994 << 14;
                            this.field588[this.field392] = var5;
                            this.field589[this.field392] = var6;
                            ++this.field392;
                        }
                    }
                    if (var7 == 1) {
                        class42 var11 = this.field363[var8];
                        if (var11.field1082.field1690 == 1 && (var11.field1453 & 127) == 64 && (var11.field1454 & 127) == 64) {
                            for (int var12 = 0; var12 < this.field364; ++var12) {
                                class42 var15 = this.field363[this.field365[var12]];
                                if (var15 != null && var11 != var15 && var15.field1082.field1690 == 1 && var11.field1453 == var15.field1453 && var11.field1454 == var15.field1454) {
                                    this.method173(7, var5, var6, var15.field1082, this.field365[var12]);
                                }
                            }
                            for (int var13 = 0; var13 < this.field453; ++var13) {
                                class48 var14 = this.field452[this.field454[var13]];
                                if (var14 != null && var11.field1453 == var14.field1453 && var11.field1454 == var14.field1454) {
                                    this.method183(var5, (byte) 120, var14, this.field454[var13], var6);
                                }
                            }
                        }
                        this.method173(7, var5, var6, var11.field1082, var8);
                    }
                    if (var7 == 0) {
                        class48 var16 = this.field452[var8];
                        if ((var16.field1453 & 127) == 64 && (var16.field1454 & 127) == 64) {
                            for (int var17 = 0; var17 < this.field364; ++var17) {
                                class42 var20 = this.field363[this.field365[var17]];
                                if (var20 != null && var20.field1082.field1690 == 1 && var16.field1453 == var20.field1453 && var16.field1454 == var20.field1454) {
                                    this.method173(7, var5, var6, var20.field1082, this.field365[var17]);
                                }
                            }
                            for (int var18 = 0; var18 < this.field453; ++var18) {
                                class48 var19 = this.field452[this.field454[var18]];
                                if (var19 != null && var16 != var19 && var16.field1453 == var19.field1453 && var16.field1454 == var19.field1454) {
                                    this.method183(var5, (byte) 120, var19, this.field454[var18], var6);
                                }
                            }
                        }
                        this.method183(var5, (byte) 120, var16, var8, var6);
                    }
                    if (var7 == 3) {
                        class61 var21 = this.field330[this.field601][var5][var6];
                        if (var21 != null) {
                            for (class30 var22 = (class30) var21.method511(314); var22 != null; var22 = (class30) var21.method513(247)) {
                                class21 var23 = class21.method236(var22.field974);
                                if (this.field395 == 1) {
                                    this.field379[this.field392] = "Use " + this.field399 + " with @lre@" + var23.field809;
                                    this.field590[this.field392] = 341;
                                    this.field591[this.field392] = var22.field974;
                                    this.field588[this.field392] = var5;
                                    this.field589[this.field392] = var6;
                                    ++this.field392;
                                } else if (this.field592 == 1) {
                                    if ((this.field594 & 1) == 1) {
                                        this.field379[this.field392] = this.field595 + " @lre@" + var23.field809;
                                        this.field590[this.field392] = 855;
                                        this.field591[this.field392] = var22.field974;
                                        this.field588[this.field392] = var5;
                                        this.field589[this.field392] = var6;
                                        ++this.field392;
                                    }
                                } else {
                                    for (int var24 = 4; var24 >= 0; --var24) {
                                        if (var23.field823 != null && var23.field823[var24] != null) {
                                            this.field379[this.field392] = var23.field823[var24] + " @lre@" + var23.field809;
                                            if (var24 == 0) {
                                                this.field590[this.field392] = 838;
                                            }
                                            if (var24 == 1) {
                                                this.field590[this.field392] = 775;
                                            }
                                            if (var24 == 2) {
                                                this.field590[this.field392] = 167;
                                            }
                                            if (var24 == 3) {
                                                this.field590[this.field392] = 396;
                                            }
                                            if (var24 == 4) {
                                                this.field590[this.field392] = 893;
                                            }
                                            this.field591[this.field392] = var22.field974;
                                            this.field588[this.field392] = var5;
                                            this.field589[this.field392] = var6;
                                            ++this.field392;
                                        } else if (var24 == 2) {
                                            this.field379[this.field392] = "Take @lre@" + var23.field809;
                                            this.field590[this.field392] = 167;
                                            this.field591[this.field392] = var22.field974;
                                            this.field588[this.field392] = var5;
                                            this.field589[this.field392] = var6;
                                            ++this.field392;
                                        }
                                    }
                                    this.field379[this.field392] = "Examine @lre@" + var23.field809;
                                    this.field590[this.field392] = 1642;
                                    this.field591[this.field392] = var22.field974;
                                    this.field588[this.field392] = var5;
                                    this.field589[this.field392] = var6;
                                    ++this.field392;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLRRTTGXYM;)V")
    public final void method67(byte arg0, class52 arg1) {
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = arg1.field1347;
        if (var5 >= 1 && var5 <= 100 || var5 >= 701 && var5 <= 800) {
            if (var5 == 1 && this.field157 == 0) {
                arg1.field1376 = "Loading friend list";
                arg1.field1310 = 0;
            } else if (var5 == 1 && this.field157 == 1) {
                arg1.field1376 = "Connecting to friendserver";
                arg1.field1310 = 0;
            } else if (var5 == 2 && this.field157 != 2) {
                arg1.field1376 = "Please wait...";
                arg1.field1310 = 0;
            } else {
                int var6 = this.field156;
                if (this.field157 != 2) {
                    var6 = 0;
                }
                if (var5 > 700) {
                    var5 -= 601;
                } else {
                    --var5;
                }
                if (var5 >= var6) {
                    arg1.field1376 = "";
                    arg1.field1310 = 0;
                } else {
                    arg1.field1376 = this.field446[var5];
                    arg1.field1310 = 1;
                }
            }
        } else if (var5 >= 101 && var5 <= 200 || var5 >= 801 && var5 <= 900) {
            int var7 = this.field156;
            if (this.field157 != 2) {
                var7 = 0;
            }
            if (var5 > 800) {
                var5 -= 701;
            } else {
                var5 -= 101;
            }
            if (var5 >= var7) {
                arg1.field1376 = "";
                arg1.field1310 = 0;
            } else {
                if (this.field322[var5] == 0) {
                    arg1.field1376 = "@red@Offline";
                } else if (this.field322[var5] < 200) {
                    if (this.field322[var5] == field614) {
                        arg1.field1376 = "@gre@World-" + (this.field322[var5] - 9);
                    } else {
                        arg1.field1376 = "@yel@World-" + (this.field322[var5] - 9);
                    }
                } else if (this.field322[var5] == field614) {
                    arg1.field1376 = "@gre@Classic" + (this.field322[var5] - 219);
                } else {
                    arg1.field1376 = "@yel@Classic" + (this.field322[var5] - 219);
                }
                arg1.field1310 = 1;
            }
        } else if (var5 == 203) {
            int var8 = this.field156;
            if (this.field157 != 2) {
                var8 = 0;
            }
            arg1.field1359 = var8 * 15 + 20;
            if (arg1.field1359 <= arg1.field1330) {
                arg1.field1359 = arg1.field1330 + 1;
            }
        } else if (var5 >= 401 && var5 <= 500) {
            var5 -= 401;
            if (var5 == 0 && this.field157 == 0) {
                arg1.field1376 = "Loading ignore list";
                arg1.field1310 = 0;
            } else if (var5 == 1 && this.field157 == 0) {
                arg1.field1376 = "Please wait...";
                arg1.field1310 = 0;
            } else {
                int var9 = this.field163;
                if (this.field157 == 0) {
                    var9 = 0;
                }
                if (var5 >= var9) {
                    arg1.field1376 = "";
                    arg1.field1310 = 0;
                } else {
                    arg1.field1376 = class36.method304(-616, class36.method301((byte) 7, this.field207[var5]));
                    arg1.field1310 = 1;
                }
            }
        } else if (var5 == 503) {
            arg1.field1359 = this.field163 * 15 + 20;
            if (arg1.field1359 <= arg1.field1330) {
                arg1.field1359 = arg1.field1330 + 1;
            }
        } else if (var5 == 327) {
            arg1.field1343 = 150;
            arg1.field1344 = (int) (Math.sin((double) field525 / 40.0D) * 256.0D) & 2047;
            if (this.field613) {
                for (int var10 = 0; var10 < 7; ++var10) {
                    int var17 = this.field582[var10];
                    if (var17 >= 0 && !class46.field1223[var17].method438((byte) -91)) {
                        return;
                    }
                }
                this.field613 = false;
                class45[] var11 = new class45[7];
                int var12 = 0;
                for (int var13 = 0; var13 < 7; ++var13) {
                    int var16 = this.field582[var13];
                    if (var16 >= 0) {
                        var11[var12++] = class46.field1223[var16].method439(8);
                    }
                }
                class45 var14 = new class45(8111, var12, var11);
                for (int var15 = 0; var15 < 5; ++var15) {
                    if (this.field555[var15] != 0) {
                        var14.method424(field563[var15][0], field563[var15][this.field555[var15]]);
                        if (var15 == 1) {
                            var14.method424(field533[0], field533[this.field555[var15]]);
                        }
                    }
                }
                var14.method417(true);
                var14.method418(0, class14.field656[field331.field1419].field658[0]);
                var14.method427(64, 850, -30, -50, -30, true);
                arg1.field1349 = 5;
                arg1.field1350 = 0;
                class52.method465(0, var14, 5, 0);
            }
        } else if (var5 == 324) {
            if (this.field371 == null) {
                this.field371 = arg1.field1331;
                this.field372 = arg1.field1373;
            }
            if (this.field570) {
                arg1.field1331 = this.field372;
            } else {
                arg1.field1331 = this.field371;
            }
        } else if (var5 == 325) {
            if (this.field371 == null) {
                this.field371 = arg1.field1331;
                this.field372 = arg1.field1373;
            }
            if (this.field570) {
                arg1.field1331 = this.field371;
            } else {
                arg1.field1331 = this.field372;
            }
        } else if (var5 == 600) {
            arg1.field1376 = this.field186;
            if (field525 % 20 < 10) {
                arg1.field1376 = arg1.field1376 + "|";
            } else {
                arg1.field1376 = arg1.field1376 + " ";
            }
        } else {
            if (var5 == 620) {
                if (this.field493 >= 1) {
                    if (this.field152) {
                        arg1.field1334 = 16711680;
                        arg1.field1376 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg1.field1334 = 16777215;
                        arg1.field1376 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg1.field1376 = "";
                }
            }
            if (var5 == 660) {
                int var18 = this.field170 - this.field560;
                String var19;
                if (var18 <= 0) {
                    var19 = "earlier today";
                } else if (var18 == 1) {
                    var19 = "yesterday";
                } else {
                    var19 = var18 + " days ago";
                }
                arg1.field1376 = "You last logged in @red@" + var19 + "@bla@ from: @red@" + signlink.dns;
            }
            if (var5 == 661) {
                if (this.field283 == 0) {
                    arg1.field1376 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                } else if (this.field283 <= this.field170) {
                    arg1.field1376 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method68(-26581, this.field283);
                } else {
                    int var20 = this.field170 + 14 - this.field283;
                    String var21;
                    if (var20 <= 0) {
                        var21 = "Earlier today";
                    } else if (var20 == 1) {
                        var21 = "Yesterday";
                    } else {
                        var21 = var20 + " days ago";
                    }
                    arg1.field1376 = var21 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method68(-26581, this.field283) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                }
            }
            if (var5 == 662) {
                String var22;
                if (this.field413 == 0) {
                    var22 = "@yel@0 unread messages";
                } else if (this.field413 == 1) {
                    var22 = "@gre@1 unread message";
                } else {
                    var22 = "@gre@" + this.field413 + " unread messages";
                }
                arg1.field1376 = "You have " + var22 + "\\nin your message centre.";
            }
            if (var5 == 663) {
                if (this.field554 > 0 && this.field554 <= this.field170 + 10) {
                    arg1.field1376 = "Last password change:\\n@gre@" + this.method68(-26581, this.field554);
                } else {
                    arg1.field1376 = "Last password change:\\n@gre@Never changed";
                }
            }
            if (var5 == 664) {
                if (this.field464 == 0) {
                    arg1.field1376 = "You have not yet set\\nany contact details.";
                }
                if (this.field464 == 1) {
                    arg1.field1376 = "Contact Details Last Set:\\n@gre@" + this.method68(-26581, this.field323);
                }
                if (this.field464 == 2) {
                    arg1.field1376 = "You need to set\\nnew contact details.";
                }
            }
            if (var5 == 665) {
                if (this.field514 > 2 && !field616) {
                    arg1.field1376 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                } else if (this.field514 > 2) {
                    arg1.field1376 = "\\n\\nYou have @gre@" + this.field514 + "@yel@ days of\\nmember credit remaining.";
                } else if (this.field514 > 0) {
                    arg1.field1376 = "You have @gre@" + this.field514 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                } else {
                    arg1.field1376 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                }
            }
            if (var5 == 667) {
                if (this.field514 > 2 && !field616) {
                    arg1.field1376 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                } else if (this.field514 > 0) {
                    arg1.field1376 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                } else {
                    arg1.field1376 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                }
            }
            if (var5 == 668) {
                if (this.field283 > this.field170) {
                    arg1.field1376 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                } else {
                    arg1.field1376 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method68(int arg0, int arg1) {
        if (arg1 > this.field170 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            if (arg0 != -26581) {
                this.field330 = null;
            }
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method69(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field351[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field351[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field352[var14] = (this.field351[var14 - 1] + this.field351[var14 + 1] + this.field351[var14 - 128] + this.field351[var14 + 128]) / 4;
            }
        }
        if (arg0 == 5) {
            this.field308 += 128;
            if (this.field308 > this.field235.length) {
                this.field308 -= this.field235.length;
                int var6 = (int) (Math.random() * 12.0D);
                this.method96(this.field376[var6], -15612);
            }
            for (int var7 = 1; var7 < var2 - 1; ++var7) {
                for (int var10 = 1; var10 < 127; ++var10) {
                    int var11 = (var7 << 7) + var10;
                    int var12 = this.field352[var11 + 128] - this.field235[this.field308 + var11 & this.field235.length - 1] / 5;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    this.field351[var11] = var12;
                }
            }
            for (int var8 = 0; var8 < var2 - 1; ++var8) {
                this.field189[var8] = this.field189[var8 + 1];
            }
            this.field189[var2 - 1] = (int) (Math.sin((double) field525 / 14.0D) * 16.0D + Math.sin((double) field525 / 15.0D) * 14.0D + Math.sin((double) field525 / 16.0D) * 12.0D);
            if (this.field276 > 0) {
                this.field276 -= 4;
            }
            if (this.field277 > 0) {
                this.field277 -= 4;
            }
            if (this.field276 == 0 && this.field277 == 0) {
                int var9 = (int) (Math.random() * 2000.0D);
                if (var9 == 0) {
                    this.field276 = 1024;
                }
                if (var9 == 1) {
                    this.field277 = 1024;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Z")
    public final boolean method70(boolean arg0, int arg1) {
        if (arg0) {
            this.field343 = this.field327.method276();
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field590[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 695;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)Z")
    public final boolean method71(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            this.field269 = !this.field269;
        }
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field394.method553(this.field601, arg2, arg1, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method49(field331.field1417[0], field331.field1416[0], var7 + 1, 2, false, 0, 0, 0, var8, arg2, 3, arg1);
            } else {
                class33 var9 = class33.method290(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field993;
                    var11 = var9.field1001;
                } else {
                    var10 = var9.field1001;
                    var11 = var9.field993;
                }
                int var12 = var9.field998;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, var10, var11, var12, 0, arg2, 3, arg1);
            }
            this.field503 = super.field1257;
            this.field504 = super.field1258;
            this.field506 = 2;
            this.field505 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method72(boolean arg0) {
        if (this.field182 == 2) {
            this.method94((this.field279 - this.field229 << 7) + this.field282, this.field280 * 2, (byte) 36, (this.field278 - this.field228 << 7) + this.field281);
            if (arg0) {
                this.field465 = !this.field465;
            }
            if (this.field566 > -1 && field525 % 20 < 10) {
                this.field151[0].method497(this.field566 - 12, this.field567 - 28, 30573);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (arg0 != -39) {
            this.field358 = this.field153.method330();
        }
        this.field435 = 0;
        for (int var2 = -1; var2 < this.field453 + this.field364; ++var2) {
            class55 var19;
            if (var2 == -1) {
                var19 = field331;
            } else if (var2 < this.field453) {
                var19 = this.field452[this.field454[var2]];
            } else {
                var19 = this.field363[this.field365[var2 - this.field453]];
            }
            if (var19 != null && var19.method316((byte) 127)) {
                if (var19 instanceof class42) {
                    class70 var20 = ((class42) var19).field1082;
                    if (var20.field1659 != null) {
                        var20 = var20.method576(29839);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field453) {
                    class70 var23 = ((class42) var19).field1082;
                    if (var23.field1673 >= 0 && var23.field1673 < this.field373.length) {
                        this.method93(false, var19, var19.field1448 + 15);
                        if (this.field566 > -1) {
                            this.field373[var23.field1673].method497(this.field566 - 12, this.field567 - 30, 30573);
                        }
                    }
                    if (this.field182 == 1 && this.field365[var2 - this.field453] == this.field252 && field525 % 20 < 10) {
                        this.method93(false, var19, var19.field1448 + 15);
                        if (this.field566 > -1) {
                            this.field151[0].method497(this.field566 - 12, this.field567 - 28, 30573);
                        }
                    }
                } else {
                    int var21 = 30;
                    class48 var22 = (class48) var19;
                    if (var22.field1289 != -1 || var22.field1282 != -1) {
                        this.method93(false, var19, var19.field1448 + 15);
                        if (this.field566 > -1) {
                            if (var22.field1289 != -1) {
                                this.field421[var22.field1289].method497(this.field566 - 12, this.field567 - var21, 30573);
                                var21 += 25;
                            }
                            if (var22.field1282 != -1) {
                                this.field373[var22.field1282].method497(this.field566 - 12, this.field567 - var21, 30573);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field182 == 10 && this.field454[var2] == this.field410) {
                        this.method93(false, var19, var19.field1448 + 15);
                        if (this.field566 > -1) {
                            this.field151[1].method497(this.field566 - 12, this.field567 - var21, 30573);
                        }
                    }
                }
                if (var19.field1459 != null && (var2 >= this.field453 || this.field536 == 0 || this.field536 == 3 || this.field536 == 1 && this.method64(((class48) var19).field1269, (byte) -47))) {
                    this.method93(false, var19, var19.field1448);
                    if (this.field566 > -1 && this.field435 < this.field436) {
                        this.field440[this.field435] = this.field522.method12(12043, var19.field1459) / 2;
                        this.field439[this.field435] = this.field522.field49;
                        this.field437[this.field435] = this.field566;
                        this.field438[this.field435] = this.field567;
                        this.field441[this.field435] = var19.field1435;
                        this.field442[this.field435] = var19.field1418;
                        this.field443[this.field435] = var19.field1433;
                        this.field444[this.field435++] = var19.field1459;
                        if (this.field241 == 0 && var19.field1418 >= 1 && var19.field1418 <= 3) {
                            this.field439[this.field435] += 10;
                            this.field438[this.field435] += 5;
                        }
                        if (this.field241 == 0 && var19.field1418 == 4) {
                            this.field440[this.field435] = 60;
                        }
                        if (this.field241 == 0 && var19.field1418 == 5) {
                            this.field439[this.field435] += 5;
                        }
                    }
                }
                if (var19.field1444 > field525) {
                    this.method93(false, var19, var19.field1448 + 15);
                    if (this.field566 > -1) {
                        int var24 = var19.field1445 * 30 / var19.field1446;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class12.method202(65280, this.field566 - 15, var24, 8, this.field567 - 3, 5);
                        class12.method202(16711680, this.field566 - 15 + var24, 30 - var24, 8, this.field567 - 3, 5);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1451[var25] > field525) {
                        this.method93(false, var19, var19.field1448 / 2);
                        if (this.field566 > -1) {
                            if (var25 == 1) {
                                this.field567 -= 20;
                            }
                            if (var25 == 2) {
                                this.field566 -= 15;
                                this.field567 -= 10;
                            }
                            if (var25 == 3) {
                                this.field566 += 15;
                                this.field567 -= 10;
                            }
                            this.field263[var19.field1450[var25]].method497(this.field566 - 12, this.field567 - 12, 30573);
                            this.field520.method9(this.field567 + 4, this.field566, String.valueOf(var19.field1449[var25]), 0, false);
                            this.field520.method9(this.field567 + 3, this.field566 - 1, String.valueOf(var19.field1449[var25]), 16777215, false);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field435; ++var3) {
            int var4 = this.field437[var3];
            int var5 = this.field438[var3];
            int var6 = this.field440[var3];
            int var7 = this.field439[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field438[var18] - this.field439[var18] && var5 - var7 < this.field438[var18] + 2 && var4 - var6 < this.field440[var18] + this.field437[var18] && var4 + var6 > this.field437[var18] - this.field440[var18] && this.field438[var18] - this.field439[var18] < var5) {
                        var5 = this.field438[var18] - this.field439[var18];
                        var8 = true;
                    }
                }
            }
            this.field566 = this.field437[var3];
            this.field567 = this.field438[var3] = var5;
            String var9 = this.field444[var3];
            if (this.field241 == 0) {
                int var10 = 16776960;
                if (this.field441[var3] < 6) {
                    var10 = this.field565[this.field441[var3]];
                }
                if (this.field441[var3] == 6) {
                    var10 = this.field586 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field441[var3] == 7) {
                    var10 = this.field586 % 20 < 10 ? 255 : 65535;
                }
                if (this.field441[var3] == 8) {
                    var10 = this.field586 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field441[var3] == 9) {
                    int var11 = 150 - this.field443[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field441[var3] == 10) {
                    int var12 = 150 - this.field443[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field441[var3] == 11) {
                    int var13 = 150 - this.field443[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field442[var3] == 0) {
                    this.field522.method9(this.field567 + 1, this.field566, var9, 0, false);
                    this.field522.method9(this.field567, this.field566, var9, var10, false);
                }
                if (this.field442[var3] == 1) {
                    this.field522.method14(22561, 0, var9, this.field586, this.field567 + 1, this.field566);
                    this.field522.method14(22561, var10, var9, this.field586, this.field567, this.field566);
                }
                if (this.field442[var3] == 2) {
                    this.field522.method15(this.field566, true, this.field567 + 1, this.field586, var9, 0);
                    this.field522.method15(this.field566, true, this.field567, this.field586, var9, var10);
                }
                if (this.field442[var3] == 3) {
                    this.field522.method16(0, this.field586, this.field567 + 1, var9, this.field566, 150 - this.field443[var3], 0);
                    this.field522.method16(var10, this.field586, this.field567, var9, this.field566, 150 - this.field443[var3], 0);
                }
                if (this.field442[var3] == 4) {
                    int var14 = this.field522.method12(12043, var9);
                    int var15 = (150 - this.field443[var3]) * (var14 + 100) / 150;
                    class12.method199(334, 0, this.field566 - 50, (byte) 6, this.field566 + 50);
                    this.field522.method13(this.field566 + 50 - var15, (byte) 1, var9, 0, this.field567 + 1);
                    this.field522.method13(this.field566 + 50 - var15, (byte) 1, var9, var10, this.field567);
                    class12.method198(546);
                }
                if (this.field442[var3] == 5) {
                    int var16 = 150 - this.field443[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class12.method199(this.field567 + 5, this.field567 - this.field522.field49 - 1, 0, (byte) 6, 512);
                    this.field522.method9(this.field567 + 1 + var17, this.field566, var9, 0, false);
                    this.field522.method9(this.field567 + var17, this.field566, var9, var10, false);
                    class12.method198(546);
                }
            } else {
                this.field522.method9(this.field567 + 1, this.field566, var9, 0, false);
                this.field522.method9(this.field567, this.field566, var9, 16776960, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LRRTTGXYM;I)Z")
    public final boolean method74(class52 arg0, int arg1) {
        int var3 = 93 / arg1;
        int var4 = arg0.field1347;
        if ((var4 < 1 || var4 > 200) && (var4 < 701 || var4 > 900)) {
            if (var4 >= 401 && var4 <= 500) {
                this.field379[this.field392] = "Remove @whi@" + arg0.field1376;
                this.field590[this.field392] = 736;
                ++this.field392;
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
            this.field379[this.field392] = "Remove @whi@" + this.field446[var4];
            this.field590[this.field392] = 864;
            ++this.field392;
            this.field379[this.field392] = "Message @whi@" + this.field446[var4];
            this.field590[this.field392] = 713;
            ++this.field392;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILPKHWFJLM;)V")
    private final void method75(int arg0, int arg1, class43 arg2) {
        for (int var4 = 0; var4 < this.field455; ++var4) {
            int var5 = this.field456[var4];
            class42 var6 = this.field363[var5];
            int var7 = arg2.method330();
            if ((var7 & 32) != 0) {
                var6.field1464 = arg2.method357(31063);
                int var8 = arg2.method366(this.field325);
                var6.field1468 = var8 >> 16;
                var6.field1467 = (var8 & 65535) + field525;
                var6.field1465 = 0;
                var6.field1466 = 0;
                if (var6.field1467 > field525) {
                    var6.field1465 = -1;
                }
                if (var6.field1464 == 65535) {
                    var6.field1464 = -1;
                }
            }
            if ((var7 & 1) != 0) {
                var6.field1461 = arg2.method359(2);
                var6.field1462 = arg2.method332();
            }
            if ((var7 & 8) != 0) {
                var6.field1082 = class70.method579(arg2.method332());
                var6.field1425 = var6.field1082.field1690;
                var6.field1452 = var6.field1082.field1667;
                var6.field1470 = var6.field1082.field1686;
                var6.field1471 = var6.field1082.field1670;
                var6.field1472 = var6.field1082.field1682;
                var6.field1473 = var6.field1082.field1653;
                var6.field1419 = var6.field1082.field1678;
            }
            if ((var7 & 2) != 0) {
                var6.field1423 = arg2.method357(31063);
                if (var6.field1423 == 65535) {
                    var6.field1423 = -1;
                }
            }
            if ((var7 & 4) != 0) {
                int var9 = arg2.method351(0);
                int var10 = arg2.method350((byte) 40);
                var6.method477(var10, field525, var9, 47);
                var6.field1444 = field525 + 300;
                var6.field1445 = arg2.method349((byte) 7);
                var6.field1446 = arg2.method349((byte) 7);
            }
            if ((var7 & 128) != 0) {
                int var11 = arg2.method332();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg2.method330();
                if (var6.field1427 == var11 && var11 != -1) {
                    int var13 = class14.field656[var11].field670;
                    if (var13 == 1) {
                        var6.field1428 = 0;
                        var6.field1429 = 0;
                        var6.field1430 = var12;
                        var6.field1431 = 0;
                    }
                    if (var13 == 2) {
                        var6.field1431 = 0;
                    }
                } else if (var11 == -1 || var6.field1427 == -1 || class14.field656[var11].field664 >= class14.field656[var6.field1427].field664) {
                    var6.field1427 = var11;
                    var6.field1428 = 0;
                    var6.field1429 = 0;
                    var6.field1430 = var12;
                    var6.field1431 = 0;
                    var6.field1432 = var6.field1436;
                }
            }
            if ((var7 & 16) != 0) {
                var6.field1459 = arg2.method337();
                var6.field1433 = 100;
            }
            if ((var7 & 64) != 0) {
                int var14 = arg2.method351(0);
                int var15 = arg2.method349((byte) 7);
                var6.method477(var15, field525, var14, 47);
                var6.field1444 = field525 + 300;
                var6.field1445 = arg2.method351(0);
                var6.field1446 = arg2.method350((byte) 40);
            }
        }
        if (arg1 < 8 || arg1 > 8) {
            this.field238 = !this.field238;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)Ljava/lang/String;")
    public final String method76(boolean arg0) {
        if (!arg0) {
            field483 = 368;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1245 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNTHYVEDA;I)V")
    private final void method77(class39 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field1068 == 0) {
            var3 = this.field394.method549(arg0.field1067, arg0.field1069, arg0.field1070);
        }
        if (arg0.field1068 == 1) {
            var3 = this.field394.method550(arg0.field1067, arg0.field1070, arg0.field1069, 6);
        }
        if (arg0.field1068 == 2) {
            var3 = this.field394.method551(arg0.field1067, arg0.field1069, arg0.field1070);
        }
        if (arg0.field1068 == 3) {
            var3 = this.field394.method552(arg0.field1067, arg0.field1069, arg0.field1070);
        }
        if (var3 != 0) {
            int var7 = this.field394.method553(arg0.field1067, arg0.field1069, arg0.field1070, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1064 = var4;
        arg0.field1066 = var5;
        arg0.field1065 = var6;
        if (arg1 != 39431) {
            this.method61();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILPKHWFJLM;)V")
    private final void method78(int arg0, int arg1, class43 arg2) {
        for (int var4 = 0; var4 < this.field455; ++var4) {
            int var5 = this.field456[var4];
            class48 var6 = this.field452[var5];
            int var7 = arg2.method330();
            if ((var7 & 64) != 0) {
                var7 += arg2.method330() << 8;
            }
            this.method88(var6, arg2, var5, true, var7);
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZB)V")
    public final void method79(int arg0, boolean arg1, byte arg2) {
        if (arg2 != -3) {
            this.field330 = null;
        }
        signlink.midivol = arg0;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIII)V")
    public final void method80(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field394.method549(arg4, arg3, arg5);
        if (var7 != 0) {
            int var8 = this.field394.method553(arg4, arg3, arg5, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg0;
            if (var7 > 0) {
                var11 = arg2;
            }
            int[] var12 = this.field543.field1498;
            int var13 = (103 - arg5) * 512 * 4 + arg3 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class33 var15 = class33.method290(var14);
            if (var15.field1011 != -1) {
                class53 var16 = this.field273[var15.field1011];
                if (var16 != null) {
                    int var17 = (var15.field1001 * 4 - var16.field1395) / 2;
                    int var18 = (var15.field993 * 4 - var16.field1396) / 2;
                    var16.method473(arg3 * 4 + 48 + var17, (104 - arg5 - var15.field993) * 4 + 48 + var18, 30573);
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
        int var19 = this.field394.method551(arg4, arg3, arg5);
        if (arg1) {
            this.field553.method320(227);
        }
        if (var19 != 0) {
            int var20 = this.field394.method553(arg4, arg3, arg5, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class33 var24 = class33.method290(var23);
            if (var24.field1011 != -1) {
                class53 var25 = this.field273[var24.field1011];
                if (var25 != null) {
                    int var26 = (var24.field1001 * 4 - var25.field1395) / 2;
                    int var27 = (var24.field993 * 4 - var25.field1396) / 2;
                    var25.method473(arg3 * 4 + 48 + var26, (104 - arg5 - var24.field993) * 4 + 48 + var27, 30573);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field543.field1498;
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
        int var31 = this.field394.method552(arg4, arg3, arg5);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class33 var33 = class33.method290(var32);
            if (var33.field1011 != -1) {
                class53 var34 = this.field273[var33.field1011];
                if (var34 != null) {
                    int var35 = (var33.field1001 * 4 - var34.field1395) / 2;
                    int var36 = (var33.field993 * 4 - var34.field1396) / 2;
                    var34.method473(arg3 * 4 + 48 + var35, (104 - arg5 - var33.field993) * 4 + 48 + var36, 30573);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method81(int arg0) {
        if (this.field401 == null) {
            super.field1243 = null;
            this.field419 = null;
            this.field417 = null;
            if (arg0 != -42111) {
                this.field358 = this.field153.method330();
            }
            this.field416 = null;
            this.field418 = null;
            this.field177 = null;
            this.field178 = null;
            this.field179 = null;
            this.field404 = new class6(265, 128, this.method161(9), false);
            class12.method200(3);
            this.field405 = new class6(265, 128, this.method161(9), false);
            class12.method200(3);
            this.field401 = new class6(171, 509, this.method161(9), false);
            class12.method200(3);
            this.field402 = new class6(132, 360, this.method161(9), false);
            class12.method200(3);
            this.field403 = new class6(200, 360, this.method161(9), false);
            class12.method200(3);
            this.field406 = new class6(238, 202, this.method161(9), false);
            class12.method200(3);
            this.field407 = new class6(238, 203, this.method161(9), false);
            class12.method200(3);
            this.field408 = new class6(94, 74, this.method161(9), false);
            class12.method200(3);
            this.field409 = new class6(94, 75, this.method161(9), false);
            class12.method200(3);
            if (this.field262 != null) {
                this.method143(0);
                this.method91(field232);
            }
            this.field569 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LPKHWFJLM;IZ)V")
    private final void method82(class43 arg0, int arg1, boolean arg2) {
        this.field484 = 0;
        this.field455 = 0;
        this.method134((byte) 100, arg0, arg1);
        this.method164(arg0, arg1, this.field447);
        this.method75(arg1, 8, arg0);
        this.field185 &= arg2;
        for (int var4 = 0; var4 < this.field484; ++var4) {
            int var6 = this.field485[var4];
            if (field525 != this.field363[var6].field1447) {
                this.field363[var6].field1082 = null;
                this.field363[var6] = null;
            }
        }
        if (arg0.field1105 != arg1) {
            signlink.reporterror(this.field141 + " size mismatch in getnpcpos - pos:" + arg0.field1105 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field364; ++var5) {
                if (this.field363[this.field365[var5]] == null) {
                    signlink.reporterror(this.field141 + " null entry in npc list - pos:" + var5 + " size:" + this.field364);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LRRTTGXYM;Z)Z")
    public final boolean method83(class52 arg0, boolean arg1) {
        if (arg0.field1351 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1351.length; ++var3) {
                int var4 = this.method100(arg0, -951, var3);
                int var5 = arg0.field1364[var3];
                if (arg0.field1351[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1351[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1351[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1) {
                this.field176 = 288;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        int var2 = this.field425;
        int var3 = this.field426;
        int var4 = this.field427;
        int var5 = this.field428;
        int var6 = 6116423;
        class12.method202(var6, var2, var4, 8, var3, var5);
        if (arg0) {
            this.field358 = -1;
        }
        class12.method202(0, var2 + 1, var4 - 2, 8, var3 + 1, 16);
        class12.method203(var3 + 18, var5 - 19, 0, var2 + 1, true, var4 - 2);
        this.field522.method13(var2 + 3, (byte) 1, "Choose Option", var6, var3 + 14);
        int var7 = super.field1250;
        int var8 = super.field1251;
        if (this.field424 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field424 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field424 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field392; ++var9) {
            int var10 = (this.field392 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field522.method17(var10, true, var2 + 3, var11, this.field379[var9], true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 2 || arg2 > 2) {
            this.field553.method320(194);
        }
        if (arg5 >= 1 && arg3 >= 1 && arg5 <= 102 && arg3 <= 102) {
            if (field617 && this.field601 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field394.method549(arg4, arg5, arg3);
            }
            if (arg7 == 1) {
                var9 = this.field394.method550(arg4, arg3, arg5, 6);
            }
            if (arg7 == 2) {
                var9 = this.field394.method551(arg4, arg5, arg3);
            }
            if (arg7 == 3) {
                var9 = this.field394.method552(arg4, arg5, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field394.method553(arg4, arg5, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field394.method540(arg3, arg5, 42909, arg4);
                    class33 var17 = class33.method290(var14);
                    if (var17.field1013) {
                        this.field248[arg4].method485(this.field343, var15, var17.field1026, arg5, arg3, var16);
                    }
                }
                if (arg7 == 1) {
                    this.field394.method541(arg5, arg4, 11781, arg3);
                }
                if (arg7 == 2) {
                    this.field394.method542(arg5, 0, arg4, arg3);
                    class33 var18 = class33.method290(var14);
                    if (var18.field1001 + arg5 > 103 || var18.field1001 + arg3 > 103 || var18.field993 + arg5 > 103 || var18.field993 + arg3 > 103) {
                        return;
                    }
                    if (var18.field1013) {
                        this.field248[arg4].method486(arg5, var18.field1026, (byte) 4, arg3, var18.field1001, var18.field993, var16);
                    }
                }
                if (arg7 == 3) {
                    this.field394.method543(arg5, arg4, true, arg3);
                    class33 var19 = class33.method290(var14);
                    if (var19.field1013 && var19.field980) {
                        this.field248[arg4].method488((byte) 1, arg5, arg3);
                    }
                }
            }
            if (arg1 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field216[1][arg5][arg3] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                class9.method32(arg0, this.field394, arg1, var20, arg5, this.field248[arg4], this.field433, arg3, true, arg6, arg4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method86(int arg0, int arg1) {
        this.field357 += arg1;
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method87(boolean arg0) {
        if (this.field419 == null) {
            this.method102(true);
            super.field1243 = null;
            this.field401 = null;
            this.field402 = null;
            this.field403 = null;
            this.field404 = null;
            this.field405 = null;
            this.field406 = null;
            this.field407 = null;
            this.field408 = null;
            this.field409 = null;
            this.field419 = new class6(96, 479, this.method161(9), false);
            this.field417 = new class6(156, 172, this.method161(9), false);
            class12.method200(3);
            this.field385.method473(0, 0, 30573);
            this.field416 = new class6(261, 190, this.method161(9), false);
            this.field418 = new class6(334, 512, this.method161(9), false);
            if (arg0) {
                this.field324 = this.field327.method276();
            }
            class12.method200(3);
            this.field177 = new class6(50, 496, this.method161(9), false);
            this.field178 = new class6(37, 269, this.method161(9), false);
            this.field179 = new class6(45, 249, this.method161(9), false);
            this.field569 = true;
            this.field418.method24(-214);
            class71.field1706 = this.field244;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LQGDSNXKJ;LPKHWFJLM;IZI)V")
    private final void method88(class48 arg0, class43 arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.field299 = 339;
        }
        if ((arg4 & 1) != 0) {
            arg0.field1459 = arg1.method337();
            if (arg0.field1459.charAt(0) == '~') {
                arg0.field1459 = arg0.field1459.substring(1);
                this.method191(2, arg0.field1269, arg0.field1459, (byte) -92);
            } else if (field331 == arg0) {
                this.method191(2, arg0.field1269, arg0.field1459, (byte) -92);
            }
            arg0.field1435 = 0;
            arg0.field1418 = 0;
            arg0.field1433 = 150;
        }
        if ((arg4 & 128) != 0) {
            int var6 = arg1.method359(2);
            int var7 = arg1.method351(0);
            int var8 = arg1.method330();
            int var9 = arg1.field1105;
            if (arg0.field1269 != null && arg0.field1268) {
                long var10 = class36.method300(arg0.field1269);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < this.field163; ++var13) {
                        if (this.field207[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && this.field519 == 0) {
                    try {
                        this.field362.field1105 = 0;
                        arg1.method339(990, 0, this.field362.field1104, var8);
                        this.field362.field1105 = 0;
                        String var14 = class41.method313(var8, (byte) -7, this.field362);
                        String var15 = class44.method378(24865, var14);
                        arg0.field1459 = var15;
                        arg0.field1435 = var6 >> 8;
                        arg0.field1418 = var6 & 255;
                        arg0.field1433 = 150;
                        if (var7 != 2 && var7 != 3) {
                            if (var7 == 1) {
                                this.method191(1, "@cr1@" + arg0.field1269, var15, (byte) -92);
                            } else {
                                this.method191(2, arg0.field1269, var15, (byte) -92);
                            }
                        } else {
                            this.method191(1, "@cr2@" + arg0.field1269, var15, (byte) -92);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field1105 = var8 + var9;
        }
        if ((arg4 & 4) != 0) {
            int var17 = arg1.method350((byte) 40);
            int var18 = arg1.method350((byte) 40);
            arg0.method477(var18, field525, var17, 47);
            arg0.field1444 = field525 + 300;
            arg0.field1445 = arg1.method349((byte) 7);
            arg0.field1446 = arg1.method330();
        }
        if ((arg4 & 512) != 0) {
            arg0.field1437 = arg1.method350((byte) 40);
            arg0.field1439 = arg1.method350((byte) 40);
            arg0.field1438 = arg1.method330();
            arg0.field1440 = arg1.method349((byte) 7);
            arg0.field1441 = arg1.method332() + field525;
            arg0.field1442 = arg1.method332() + field525;
            arg0.field1443 = arg1.method349((byte) 7);
            arg0.method479((byte) -96);
        }
        if ((arg4 & 8) != 0) {
            arg0.field1423 = arg1.method358((byte) 5);
            if (arg0.field1423 == 65535) {
                arg0.field1423 = -1;
            }
        }
        if ((arg4 & 2) != 0) {
            arg0.field1461 = arg1.method359(2);
            arg0.field1462 = arg1.method358((byte) 5);
        }
        if ((arg4 & 32) != 0) {
            int var19 = arg1.method358((byte) 5);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = arg1.method349((byte) 7);
            if (arg0.field1427 == var19 && var19 != -1) {
                int var21 = class14.field656[var19].field670;
                if (var21 == 1) {
                    arg0.field1428 = 0;
                    arg0.field1429 = 0;
                    arg0.field1430 = var20;
                    arg0.field1431 = 0;
                }
                if (var21 == 2) {
                    arg0.field1431 = 0;
                }
            } else if (var19 == -1 || arg0.field1427 == -1 || class14.field656[var19].field664 >= class14.field656[arg0.field1427].field664) {
                arg0.field1427 = var19;
                arg0.field1428 = 0;
                arg0.field1429 = 0;
                arg0.field1430 = var20;
                arg0.field1431 = 0;
                arg0.field1432 = arg0.field1436;
            }
        }
        if ((arg4 & 1024) != 0) {
            arg0.field1464 = arg1.method357(31063);
            int var22 = arg1.method335();
            arg0.field1468 = var22 >> 16;
            arg0.field1467 = (var22 & 65535) + field525;
            arg0.field1465 = 0;
            arg0.field1466 = 0;
            if (arg0.field1467 > field525) {
                arg0.field1465 = -1;
            }
            if (arg0.field1464 == 65535) {
                arg0.field1464 = -1;
            }
        }
        if ((arg4 & 16) != 0) {
            int var23 = arg1.method330();
            byte[] var24 = new byte[var23];
            class43 var25 = new class43(var24, 0);
            arg1.method339(990, 0, var24, var23);
            this.field457[arg2] = var25;
            arg0.method447((byte) 5, var25);
        }
        if ((arg4 & 256) != 0) {
            int var26 = arg1.method330();
            int var27 = arg1.method350((byte) 40);
            arg0.method477(var27, field525, var26, 47);
            arg0.field1444 = field525 + 300;
            arg0.field1445 = arg1.method350((byte) 40);
            arg0.field1446 = arg1.method349((byte) 7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method89(boolean arg0, byte arg1) {
        this.method81(-42111);
        this.field403.method24(-214);
        this.field341.method473(0, 0, 30573);
        short var3 = 360;
        short var4 = 200;
        if (arg1 == 4) {
            if (this.field285 == 0) {
                int var5 = var4 / 2 + 80;
                this.field520.method10(var3 / 2, this.field270.field953, true, var5, -72, 7711145);
                int var6 = var4 / 2 - 20;
                this.field522.method10(var3 / 2, "Welcome to RuneScape", true, var6, -72, 16776960);
                int var17 = var6 + 30;
                int var7 = var3 / 2 - 80;
                int var8 = var4 / 2 + 20;
                this.field342.method473(var7 - 73, var8 - 20, 30573);
                this.field522.method10(var7, "New User", true, var8 + 5, -72, 16777215);
                int var9 = var3 / 2 + 80;
                this.field342.method473(var9 - 73, var8 - 20, 30573);
                this.field522.method10(var9, "Existing User", true, var8 + 5, -72, 16777215);
            }
            if (this.field285 == 2) {
                int var10 = var4 / 2 - 40;
                if (this.field287.length() > 0) {
                    this.field522.method10(var3 / 2, this.field287, true, var10 - 15, -72, 16776960);
                    this.field522.method10(var3 / 2, this.field288, true, var10, -72, 16776960);
                    var10 += 30;
                } else {
                    this.field522.method10(var3 / 2, this.field288, true, var10 - 7, -72, 16776960);
                    var10 += 30;
                }
                this.field522.method17(var10, true, var3 / 2 - 90, 16777215, "Username: " + this.field141 + (this.field165 == 0 & field525 % 40 < 20 ? "@yel@|" : ""), true);
                var10 += 15;
                this.field522.method17(var10, true, var3 / 2 - 88, 16777215, "Password: " + class36.method305((byte) 7, this.field142) + (this.field165 == 1 & field525 % 40 < 20 ? "@yel@|" : ""), true);
                var10 += 15;
                if (!arg0) {
                    int var11 = var3 / 2 - 80;
                    int var12 = var4 / 2 + 50;
                    this.field342.method473(var11 - 73, var12 - 20, 30573);
                    this.field522.method10(var11, "Login", true, var12 + 5, -72, 16777215);
                    int var13 = var3 / 2 + 80;
                    this.field342.method473(var13 - 73, var12 - 20, 30573);
                    this.field522.method10(var13, "Cancel", true, var12 + 5, -72, 16777215);
                }
            }
            if (this.field285 == 3) {
                this.field522.method10(var3 / 2, "Create a free account", true, var4 / 2 - 60, -72, 16776960);
                int var14 = var4 / 2 - 35;
                this.field522.method10(var3 / 2, "To create a new account you need to", true, var14, -72, 16777215);
                int var18 = var14 + 15;
                this.field522.method10(var3 / 2, "go back to the main RuneScape webpage", true, var18, -72, 16777215);
                int var19 = var18 + 15;
                this.field522.method10(var3 / 2, "and choose the red 'create account'", true, var19, -72, 16777215);
                int var20 = var19 + 15;
                this.field522.method10(var3 / 2, "button at the top right of that page.", true, var20, -72, 16777215);
                int var21 = var20 + 15;
                int var15 = var3 / 2;
                int var16 = var4 / 2 + 50;
                this.field342.method473(var15 - 73, var16 - 20, 30573);
                this.field522.method10(var15, "Cancel", true, var16 + 5, -72, 16777215);
            }
            this.field403.method25(-71, 171, super.field1242, 202);
            if (this.field569) {
                this.field569 = false;
                this.field401.method25(-71, 0, super.field1242, 128);
                this.field402.method25(-71, 371, super.field1242, 202);
                this.field406.method25(-71, 265, super.field1242, 0);
                this.field407.method25(-71, 265, super.field1242, 562);
                this.field408.method25(-71, 171, super.field1242, 128);
                this.field409.method25(-71, 171, super.field1242, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method90(byte arg0) {
        this.field613 = true;
        if (arg0 != 75) {
            this.field358 = this.field153.method330();
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field582[var2] = -1;
            for (int var3 = 0; var3 < class46.field1222; ++var3) {
                if (!class46.field1223[var3].field1229 && class46.field1223[var3].field1224 == var2 + (this.field570 ? 0 : 7)) {
                    this.field582[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method91(boolean arg0) {
        if (!arg0) {
            this.method61();
        }
        this.field341 = new class53(this.field262, "titlebox", 0);
        this.field342 = new class53(this.field262, "titlebutton", 0);
        this.field376 = new class53[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field376[var3] = new class53(this.field262, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field376[var4] = new class53(this.field262, "runes", (var4 & 3) + 12);
            }
        }
        this.field571 = new class58(128, 265);
        this.field572 = new class58(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field571.field1498[var5] = this.field404.field54[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field572.field1498[var6] = this.field405.field54[var6];
        }
        this.field480 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field480[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field480[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field480[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field480[var10 + 192] = 16777215;
        }
        this.field481 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field481[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field481[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field481[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field481[var14 + 192] = 16777215;
        }
        this.field482 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field482[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field482[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field482[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field482[var18 + 192] = 16777215;
        }
        this.field479 = new int[256];
        this.field235 = new int[32768];
        this.field236 = new int[32768];
        this.method96((class53) null, -15612);
        this.field351 = new int[32768];
        this.field352 = new int[32768];
        this.method138("Connecting to fileserver", -460, 10);
        if (!this.field492) {
            this.field221 = true;
            this.field492 = true;
            this.method135(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    private final void method92(boolean arg0) {
        class39 var2 = (class39) this.field215.method510();
        this.field185 &= arg0;
        while (var2 != null) {
            if (var2.field1071 == -1) {
                var2.field1060 = 0;
                this.method77(var2, 39431);
            } else {
                var2.method254();
            }
            var2 = (class39) this.field215.method512(false);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLSRUOAWPS;I)V")
    public final void method93(boolean arg0, class55 arg1, int arg2) {
        if (arg0) {
            this.field553.method320(34);
        }
        this.method94(arg1.field1454, arg2, (byte) 36, arg1.field1453);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)V")
    public final void method94(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 >= 128 && arg0 >= 128 && arg3 <= 13056 && arg0 <= 13056) {
            int var5 = this.method57(this.field601, arg3, this.field208, arg0) - arg1;
            int var6 = arg3 - this.field332;
            int var7 = var5 - this.field333;
            int var8 = arg0 - this.field334;
            int var9 = class45.field1213[this.field335];
            int var10 = class45.field1214[this.field335];
            int var11 = class45.field1213[this.field336];
            int var12 = class45.field1214[this.field336];
            if (arg2 != 36) {
                this.field358 = -1;
            }
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field566 = (var13 << 9) / var17 + class71.field1700;
                this.field567 = (var16 << 9) / var17 + class71.field1701;
            } else {
                this.field566 = -1;
                this.field567 = -1;
            }
        } else {
            this.field566 = -1;
            this.field567 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method95(byte arg0) {
        if (this.field414 > 1) {
            --this.field414;
        }
        if (this.field361 > 0) {
            --this.field361;
        }
        for (int var2 = 0; var2 < 5 && this.method106(2); ++var2) {
        }
        if (this.field185) {
            Object var3 = this.field321.field1489;
            synchronized (this.field321.field1489) {
                if (!field538) {
                    this.field321.field1485 = 0;
                } else if (super.field1256 != 0 || this.field321.field1485 >= 40) {
                    this.field553.method319(70, false);
                    this.field553.method320(0);
                    int var4 = this.field553.field1105;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field321.field1485 && var4 - this.field553.field1105 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field321.field1488[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field321.field1484[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field321.field1488[var6] == -1 && this.field321.field1484[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field135 == var8 && this.field136 == var7) {
                            if (this.field578 < 2047) {
                                ++this.field578;
                            }
                        } else {
                            int var10 = var8 - this.field135;
                            this.field135 = var8;
                            int var11 = var7 - this.field136;
                            this.field136 = var7;
                            if (this.field578 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field553.method321((this.field578 << 12) + (var10 << 6) + var11);
                                this.field578 = 0;
                            } else if (this.field578 < 8) {
                                this.field553.method323((this.field578 << 19) + 8388608 + var9);
                                this.field578 = 0;
                            } else {
                                this.field553.method324((this.field578 << 19) + -1073741824 + var9);
                                this.field578 = 0;
                            }
                        }
                    }
                    this.field553.method329((byte) 7, this.field553.field1105 - var4);
                    if (var5 >= this.field321.field1485) {
                        this.field321.field1485 = 0;
                    } else {
                        this.field321.field1485 -= var5;
                        for (int var12 = 0; var12 < this.field321.field1485; ++var12) {
                            this.field321.field1484[var12] = this.field321.field1484[var5 + var12];
                            this.field321.field1488[var12] = this.field321.field1488[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1256 != 0) {
                long var13 = (super.field1259 - this.field309) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field309 = super.field1259;
                int var15 = super.field1258;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1257;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1256 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field553.method319(114, false);
                this.field553.method363((var18 << 19) + (var19 << 20) + var17, 1);
            }
            if (this.field500 > 0) {
                --this.field500;
            }
            if (super.field1260[1] == 1 || super.field1260[2] == 1 || super.field1260[3] == 1 || super.field1260[4] == 1) {
                this.field501 = true;
            }
            if (this.field501 && this.field500 <= 0) {
                this.field500 = 20;
                this.field501 = false;
                this.field553.method319(19, false);
                this.field553.method321(this.field366);
                this.field553.method321(this.field367);
            }
            if (super.field1247 && !this.field174) {
                this.field174 = true;
                this.field553.method319(217, false);
                this.field553.method320(1);
            }
            if (!super.field1247 && this.field174) {
                this.field174 = false;
                this.field553.method319(217, false);
                this.field553.method320(0);
            }
            this.method55(this.field307);
            this.method165(1);
            this.method121(false);
            ++this.field359;
            if (this.field359 > 750) {
                this.method146(70);
            }
            this.method128(true);
            this.method107(0);
            this.method142(false);
            ++this.field267;
            if (this.field506 != 0) {
                this.field505 += 20;
                if (this.field505 >= 400) {
                    this.field506 = 0;
                }
            }
            if (this.field513 != 0) {
                ++this.field510;
                if (this.field510 >= 15) {
                    if (this.field513 == 2) {
                        this.field316 = true;
                    }
                    if (this.field513 == 3) {
                        this.field310 = true;
                    }
                    this.field513 = 0;
                }
            }
            if (this.field461 != 0) {
                ++this.field344;
                if (super.field1250 > this.field462 + 5 || super.field1250 < this.field462 - 5 || super.field1251 > this.field463 + 5 || super.field1251 < this.field463 - 5) {
                    this.field213 = true;
                }
                if (super.field1249 == 0) {
                    if (this.field461 == 2) {
                        this.field316 = true;
                    }
                    if (this.field461 == 3) {
                        this.field310 = true;
                    }
                    this.field461 = 0;
                    if (this.field213 && this.field344 >= 5) {
                        this.field449 = -1;
                        this.method185((byte) -10);
                        if (this.field459 == this.field449 && this.field460 != this.field448) {
                            class52 var20 = class52.method458(this.field459);
                            byte var21 = 0;
                            if (this.field544 == 1 && var20.field1347 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1356[this.field448] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1313) {
                                int var22 = this.field460;
                                int var23 = this.field448;
                                var20.field1356[var23] = var20.field1356[var22];
                                var20.field1383[var23] = var20.field1383[var22];
                                var20.field1356[var22] = -1;
                                var20.field1383[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field460;
                                int var25 = this.field448;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method461(var24, 6, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method461(var24, 6, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method461(this.field460, 6, this.field448);
                            }
                            this.field553.method319(182, false);
                            this.field553.method321(this.field459);
                            this.field553.method355((byte) 0, this.field460);
                            this.field553.method356(this.field448, 35793);
                            this.field553.method346(7, var21);
                        }
                    } else if ((this.field587 == 1 || this.method70(false, this.field392 - 1)) && this.field392 > 2) {
                        this.method176((byte) -109);
                    } else if (this.field392 > 0) {
                        this.method125(this.field268, this.field392 - 1);
                    }
                    this.field510 = 10;
                    super.field1256 = 0;
                }
            }
            if (class67.field1602 != -1) {
                int var26 = class67.field1602;
                int var27 = class67.field1603;
                boolean var28 = this.method49(field331.field1417[0], field331.field1416[0], 0, 0, true, 0, 0, 0, 0, var26, 3, var27);
                class67.field1602 = -1;
                if (var28) {
                    this.field503 = super.field1257;
                    this.field504 = super.field1258;
                    this.field506 = 1;
                    this.field505 = 0;
                }
            }
            if (super.field1256 == 1 && this.field478 != null) {
                this.field478 = null;
                this.field310 = true;
                super.field1256 = 0;
            }
            this.method181((byte) 3);
            if (this.field255 == -1) {
                this.method189(354);
                this.method54(this.field422);
                this.method50(0);
            }
            if (super.field1249 == 1 || super.field1256 == 1) {
                ++this.field254;
            }
            if (this.field261 == 0 && this.field195 == 0 && this.field580 == 0) {
                if (this.field381 > 0) {
                    --this.field381;
                }
            } else if (this.field381 < 100) {
                ++this.field381;
                if (this.field381 == 100) {
                    if (this.field261 != 0) {
                        this.field310 = true;
                    }
                    if (this.field195 != 0) {
                        this.field316 = true;
                    }
                }
            }
            if (this.field149 == 2) {
                this.method53(true);
            }
            if (this.field149 == 2 && this.field140) {
                this.method192(-39049);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field214[var29]++;
            }
            this.method186(357);
            ++super.field1248;
            if (super.field1248 > 4500) {
                this.field361 = 250;
                super.field1248 -= 500;
                this.field553.method319(186, false);
            }
            ++this.field564;
            if (arg0 != -75) {
                this.field358 = -1;
            }
            if (this.field564 > 500) {
                this.field564 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field233 += this.field234;
                }
                if ((var30 & 2) == 2) {
                    this.field209 += this.field210;
                }
                if ((var30 & 4) == 4) {
                    this.field239 += this.field240;
                }
            }
            if (this.field233 < -50) {
                this.field234 = 2;
            }
            if (this.field233 > 50) {
                this.field234 = -2;
            }
            if (this.field209 < -55) {
                this.field210 = 2;
            }
            if (this.field209 > 55) {
                this.field210 = -2;
            }
            if (this.field239 < -40) {
                this.field240 = 1;
            }
            if (this.field239 > 40) {
                this.field240 = -1;
            }
            ++this.field568;
            if (this.field568 > 500) {
                this.field568 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field265 += this.field266;
                }
                if ((var31 & 2) == 2) {
                    this.field318 += this.field319;
                }
            }
            if (this.field265 < -60) {
                this.field266 = 2;
            }
            if (this.field265 > 60) {
                this.field266 = -2;
            }
            if (this.field318 < -20) {
                this.field319 = 1;
            }
            if (this.field318 > 10) {
                this.field319 = -1;
            }
            ++this.field360;
            if (this.field360 > 50) {
                this.field553.method319(30, false);
            }
            try {
                if (this.field292 != null && this.field553.field1105 > 0) {
                    this.field292.method229(0, this.field553.field1104, this.field553.field1105, 866);
                    this.field553.field1105 = 0;
                    this.field360 = 0;
                }
            } catch (IOException var33) {
                this.method146(70);
            } catch (Exception var34) {
                this.method123(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LSFAIBATY;I)V")
    public final void method96(class53 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field235.length; ++var4) {
            this.field235[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field235[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg1 != -15612) {
            this.method61();
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field236[var16] = (this.field235[var16 - 1] + this.field235[var16 + 1] + this.field235[var16 - 128] + this.field235[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field235;
            this.field235 = this.field236;
            this.field236 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1396; ++var8) {
                for (int var9 = 0; var9 < arg0.field1395; ++var9) {
                    if (arg0.field1393[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1397;
                        int var11 = var8 + 16 + arg0.field1398;
                        int var12 = (var11 << 7) + var10;
                        this.field235[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BI)Z")
    public final boolean method97(byte arg0, byte[] arg1, int arg2) {
        if (arg0 == 7) {
            boolean var4 = false;
        } else {
            this.field358 = -1;
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method98(int arg0, int arg1, int arg2) {
        int var4 = 0;
        if (arg0 == 0) {
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field220[var5] != null) {
                    int var6 = this.field218[var5];
                    int var7 = 70 - var4 * 14 + this.field556 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field219[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field536 == 0 || this.field536 == 1 && this.method64(var8, (byte) -47))) {
                        if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field331.field1269)) {
                            if (this.field493 >= 1) {
                                this.field379[this.field392] = "Report abuse @whi@" + var8;
                                this.field590[this.field392] = 556;
                                ++this.field392;
                            }
                            this.field379[this.field392] = "Add ignore @whi@" + var8;
                            this.field590[this.field392] = 913;
                            ++this.field392;
                            this.field379[this.field392] = "Add friend @whi@" + var8;
                            this.field590[this.field392] = 695;
                            ++this.field392;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field294 == 0 && (var6 == 7 || this.field579 == 0 || this.field579 == 1 && this.method64(var8, (byte) -47))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            if (this.field493 >= 1) {
                                this.field379[this.field392] = "Report abuse @whi@" + var8;
                                this.field590[this.field392] = 556;
                                ++this.field392;
                            }
                            this.field379[this.field392] = "Add ignore @whi@" + var8;
                            this.field590[this.field392] = 913;
                            ++this.field392;
                            this.field379[this.field392] = "Add friend @whi@" + var8;
                            this.field590[this.field392] = 695;
                            ++this.field392;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field412 == 0 || this.field412 == 1 && this.method64(var8, (byte) -47))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            this.field379[this.field392] = "Accept trade @whi@" + var8;
                            this.field590[this.field392] = 117;
                            ++this.field392;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field294 == 0 && this.field579 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field412 == 0 || this.field412 == 1 && this.method64(var8, (byte) -47))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            this.field379[this.field392] = "Accept challenge @whi@" + var8;
                            this.field590[this.field392] = 264;
                            ++this.field392;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method99(boolean arg0) {
        if (!arg0) {
            if (this.field285 == 0) {
                int var2 = super.field1240 / 2 - 80;
                int var3 = super.field1241 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field1256 == 1 && super.field1257 >= var2 - 75 && super.field1257 <= var2 + 75 && super.field1258 >= var14 - 20 && super.field1258 <= var14 + 20) {
                    this.field285 = 3;
                    this.field165 = 0;
                }
                int var4 = super.field1240 / 2 + 80;
                if (super.field1256 == 1 && super.field1257 >= var4 - 75 && super.field1257 <= var4 + 75 && super.field1258 >= var14 - 20 && super.field1258 <= var14 + 20) {
                    this.field287 = "";
                    this.field288 = "Enter your username & password.";
                    this.field285 = 2;
                    this.field165 = 0;
                }
            } else if (this.field285 == 2) {
                int var5 = super.field1241 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field1256 == 1 && super.field1258 >= var16 - 15 && super.field1258 < var16) {
                    this.field165 = 0;
                }
                var5 = var16 + 15;
                if (super.field1256 == 1 && super.field1258 >= var5 - 15 && super.field1258 < var5) {
                    this.field165 = 1;
                }
                var5 += 15;
                int var6 = super.field1240 / 2 - 80;
                int var7 = super.field1241 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field1256 == 1 && super.field1257 >= var6 - 75 && super.field1257 <= var6 + 75 && super.field1258 >= var17 - 20 && super.field1258 <= var17 + 20) {
                    this.field223 = 0;
                    this.method120(this.field141, this.field142, false);
                    if (this.field185) {
                        return;
                    }
                }
                int var8 = super.field1240 / 2 + 80;
                if (super.field1256 == 1 && super.field1257 >= var8 - 75 && super.field1257 <= var8 + 75 && super.field1258 >= var17 - 20 && super.field1258 <= var17 + 20) {
                    this.field285 = 0;
                    this.field141 = "";
                    this.field142 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method446(true);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field562.length(); ++var11) {
                            if (var9 == field562.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field165 == 0) {
                            if (var9 == 8 && this.field141.length() > 0) {
                                this.field141 = this.field141.substring(0, this.field141.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field165 = 1;
                            }
                            if (var10) {
                                this.field141 = this.field141 + (char) var9;
                            }
                            if (this.field141.length() > 12) {
                                this.field141 = this.field141.substring(0, 12);
                            }
                        } else if (this.field165 == 1) {
                            if (var9 == 8 && this.field142.length() > 0) {
                                this.field142 = this.field142.substring(0, this.field142.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field165 = 0;
                            }
                            if (var10) {
                                this.field142 = this.field142 + (char) var9;
                            }
                            if (this.field142.length() > 20) {
                                this.field142 = this.field142.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field285 == 3) {
                    int var12 = super.field1240 / 2;
                    int var13 = super.field1241 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field1256 == 1 && super.field1257 >= var12 - 75 && super.field1257 <= var12 + 75 && super.field1258 >= var18 - 20 && super.field1258 <= var18 + 20) {
                        this.field285 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LRRTTGXYM;II)I")
    public final int method100(class52 arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            return 4;
        } else if (arg0.field1341 != null && arg2 < arg0.field1341.length) {
            try {
                int[] var4 = arg0.field1341[arg2];
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
                        var9 = this.field138[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field227[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field193[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class52 var11 = class52.method458(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class21.field834 && (!class21.method236(var12).field845 || field616)) {
                            for (int var13 = 0; var13 < var11.field1356.length; ++var13) {
                                if (var12 + 1 == var11.field1356[var13]) {
                                    var9 += var11.field1383[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field188[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field249[this.field227[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field188[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field331.field1270;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class59.field1505; ++var14) {
                            if (class59.field1507[var14]) {
                                var9 += this.field227[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class52 var15 = class52.method458(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class21.field834 && (!class21.method236(var16).field845 || field616)) {
                            for (int var17 = 0; var17 < var15.field1356.length; ++var17) {
                                if (var15.field1356[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field432;
                    }
                    if (var8 == 12) {
                        var9 = this.field597;
                    }
                    if (var8 == 13) {
                        int var18 = this.field188[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class4 var21 = class4.field27[var20];
                        int var22 = var21.field29;
                        int var23 = var21.field30;
                        int var24 = var21.field31;
                        int var25 = field204[var24 - var23];
                        var9 = this.field188[var22] >> var23 & var25;
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
                        var9 = (field331.field1453 >> 7) + this.field228;
                    }
                    if (var8 == 19) {
                        var9 = (field331.field1454 >> 7) + this.field229;
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

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public static final void method101(int arg0) {
        class67.field1568 = false;
        if (arg0 != 0) {
            field173 = !field173;
        }
        class71.field1695 = false;
        field617 = false;
        class9.field133 = false;
        class33.field996 = false;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method102(boolean arg0) {
        this.field492 = false;
        while (this.field393) {
            this.field492 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field341 = null;
        this.field342 = null;
        this.field376 = null;
        this.field479 = null;
        this.field480 = null;
        this.field481 = null;
        this.field482 = null;
        if (!arg0) {
            this.method61();
        }
        this.field235 = null;
        this.field236 = null;
        this.field351 = null;
        this.field352 = null;
        this.field571 = null;
        this.field572 = null;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method103(boolean arg0) {
        if (arg0) {
            this.field490 = !this.field490;
        }
        this.field553.method319(63, false);
        if (this.field515 != -1) {
            this.method194(-12, this.field515);
            this.field515 = -1;
            this.field316 = true;
            this.field222 = false;
            this.field423 = true;
        }
        if (this.field339 != -1) {
            this.method194(-12, this.field339);
            this.field339 = -1;
            this.field310 = true;
            this.field222 = false;
        }
        if (this.field255 != -1) {
            this.method194(-12, this.field255);
            this.field255 = -1;
            this.field569 = true;
        }
        if (this.field537 != -1) {
            this.method194(-12, this.field537);
            this.field537 = -1;
        }
        if (this.field375 != -1) {
            this.method194(-12, this.field375);
            this.field375 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method104(boolean arg0, int arg1) {
        if (field331.field1453 >> 7 == this.field541 && field331.field1454 >> 7 == this.field542) {
            this.field541 = 0;
        }
        int var3 = this.field453;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class48 var5;
            int var6;
            if (arg0) {
                var5 = field331;
                var6 = this.field451 << 14;
            } else {
                var5 = this.field452[this.field454[var4]];
                var6 = this.field454[var4] << 14;
            }
            if (var5 != null && var5.method316((byte) 127)) {
                var5.field1274 = false;
                if ((field617 && this.field453 > 50 || this.field453 > 200) && !arg0 && var5.field1456 == var5.field1419) {
                    var5.field1274 = true;
                }
                int var7 = var5.field1453 >> 7;
                int var8 = var5.field1454 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1287 != null && field525 >= var5.field1265 && field525 < var5.field1266) {
                        var5.field1274 = false;
                        var5.field1288 = this.method57(this.field601, var5.field1453, this.field208, var5.field1454);
                        this.field394.method535(var5.field1454, var6, var5, 9, var5.field1288, var5.field1453, var5.field1277, var5.field1279, var5.field1278, 60, this.field601, var5.field1280, var5.field1455);
                    } else {
                        if ((var5.field1453 & 127) == 64 && (var5.field1454 & 127) == 64) {
                            if (this.field496[var7][var8] == this.field586) {
                                continue;
                            }
                            this.field496[var7][var8] = this.field586;
                        }
                        var5.field1288 = this.method57(this.field601, var5.field1453, this.field208, var5.field1454);
                        this.field394.method534(var5.field1454, this.field601, var5.field1453, var5.field1460, var5, var5.field1288, 60, var5.field1455, var6, this.field260);
                    }
                }
            }
        }
        if (arg1 == 40284) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method105(int arg0, int arg1) {
        int var3 = class69.field1636[arg0].field1644;
        if (var3 != 0) {
            int var4 = this.field188[arg0];
            if (arg1 != 49157) {
                this.field358 = -1;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class71.method593(-620, 0.9D);
                }
                if (var4 == 2) {
                    class71.method593(-620, 0.8D);
                }
                if (var4 == 3) {
                    class71.method593(-620, 0.7D);
                }
                if (var4 == 4) {
                    class71.method593(-620, 0.6D);
                }
                class21.field854.method521();
                this.field569 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field382;
                if (var4 == 0) {
                    this.method79(0, this.field382, (byte) -3);
                    this.field382 = true;
                }
                if (var4 == 1) {
                    this.method79(-400, this.field382, (byte) -3);
                    this.field382 = true;
                }
                if (var4 == 2) {
                    this.method79(-800, this.field382, (byte) -3);
                    this.field382 = true;
                }
                if (var4 == 3) {
                    this.method79(-1200, this.field382, (byte) -3);
                    this.field382 = true;
                }
                if (var4 == 4) {
                    this.field382 = false;
                }
                if (this.field382 != var5 && !field617) {
                    if (this.field382) {
                        this.field290 = this.field353;
                        this.field291 = true;
                        this.field270.method265(2, this.field290);
                    } else {
                        this.method65(true);
                    }
                    this.field573 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field534 = true;
                    this.method63(0, true);
                }
                if (var4 == 1) {
                    this.field534 = true;
                    this.method63(-400, true);
                }
                if (var4 == 2) {
                    this.field534 = true;
                    this.method63(-800, true);
                }
                if (var4 == 3) {
                    this.field534 = true;
                    this.method63(-1200, true);
                }
                if (var4 == 4) {
                    this.field534 = false;
                }
            }
            if (var3 == 5) {
                this.field587 = var4;
            }
            if (var3 == 6) {
                this.field241 = var4;
            }
            if (var3 == 8) {
                this.field294 = var4;
                this.field310 = true;
            }
            if (var3 == 9) {
                this.field544 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)Z")
    public final boolean method106(int arg0) {
        if (arg0 < this.field340 || arg0 > this.field340) {
            this.field553.method320(74);
        }
        if (this.field292 == null) {
            return false;
        } else {
            try {
                int var2 = this.field292.method227();
                if (var2 == 0) {
                    return false;
                }
                if (this.field358 == -1) {
                    this.field292.method228(this.field153.field1104, 0, 1);
                    this.field358 = this.field153.field1104[0] & 255;
                    if (this.field327 != null) {
                        this.field358 = this.field358 - this.field327.method276() & 255;
                    }
                    this.field357 = class37.field1049[this.field358];
                    --var2;
                }
                if (this.field357 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field292.method228(this.field153.field1104, 0, 1);
                    this.field357 = this.field153.field1104[0] & 255;
                    --var2;
                }
                if (this.field357 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field292.method228(this.field153.field1104, 0, 2);
                    this.field153.field1105 = 0;
                    this.field357 = this.field153.method332();
                    var2 -= 2;
                }
                if (var2 < this.field357) {
                    return false;
                }
                this.field153.field1105 = 0;
                this.field292.method228(this.field153.field1104, 0, this.field357);
                this.field359 = 0;
                this.field203 = this.field202;
                this.field202 = this.field201;
                this.field201 = this.field358;
                if (this.field358 == 116 || this.field358 == 154 || this.field358 == 88 || this.field358 == 33 || this.field358 == 243 || this.field358 == 224 || this.field358 == 7 || this.field358 == 145 || this.field358 == 205 || this.field358 == 140 || this.field358 == 20) {
                    this.method129(this.field153, this.field358, 23254);
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 22) {
                    long var3 = this.field153.method336(7);
                    int var5 = this.field153.method330();
                    String var6 = class36.method304(-616, class36.method301((byte) 7, var3));
                    for (int var7 = 0; var7 < this.field156; ++var7) {
                        if (this.field298[var7] == var3) {
                            if (this.field322[var7] != var5) {
                                this.field322[var7] = var5;
                                this.field316 = true;
                                if (var5 > 0) {
                                    this.method191(5, "", var6 + " has logged in.", (byte) -92);
                                }
                                if (var5 == 0) {
                                    this.method191(5, "", var6 + " has logged out.", (byte) -92);
                                }
                            }
                            var6 = null;
                            break;
                        }
                    }
                    if (var6 != null && this.field156 < 200) {
                        this.field298[this.field156] = var3;
                        this.field446[this.field156] = var6;
                        this.field322[this.field156] = var5;
                        ++this.field156;
                        this.field316 = true;
                    }
                    boolean var8 = false;
                    while (!var8) {
                        var8 = true;
                        for (int var9 = 0; var9 < this.field156 - 1; ++var9) {
                            if (this.field322[var9] != field614 && this.field322[var9 + 1] == field614 || this.field322[var9] == 0 && this.field322[var9 + 1] != 0) {
                                int var10 = this.field322[var9];
                                this.field322[var9] = this.field322[var9 + 1];
                                this.field322[var9 + 1] = var10;
                                String var11 = this.field446[var9];
                                this.field446[var9] = this.field446[var9 + 1];
                                this.field446[var9 + 1] = var11;
                                long var12 = this.field298[var9];
                                this.field298[var9] = this.field298[var9 + 1];
                                this.field298[var9 + 1] = var12;
                                this.field316 = true;
                                var8 = false;
                            }
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 104) {
                    this.field414 = this.field153.method359(2) * 30;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 99) {
                    this.field536 = this.field153.method330();
                    this.field579 = this.field153.method330();
                    this.field412 = this.field153.method330();
                    this.field583 = true;
                    this.field310 = true;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 79) {
                    this.field316 = true;
                    int var14 = this.field153.method335();
                    int var15 = this.field153.method330();
                    int var16 = this.field153.method351(0);
                    this.field193[var15] = var14;
                    this.field138[var15] = var16;
                    this.field227[var15] = 1;
                    for (int var17 = 0; var17 < 98; ++var17) {
                        if (var14 >= field249[var17]) {
                            this.field227[var15] = var17 + 2;
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 21) {
                    this.field316 = true;
                    int var18 = this.field153.method332();
                    class52 var19 = class52.method458(var18);
                    int var20 = this.field153.method332();
                    for (int var21 = 0; var21 < var20; ++var21) {
                        var19.field1356[var21] = this.field153.method357(31063);
                        int var22 = this.field153.method349((byte) 7);
                        if (var22 == 255) {
                            var22 = this.field153.method364(field483);
                        }
                        var19.field1383[var21] = var22;
                    }
                    for (int var23 = var20; var23 < var19.field1356.length; ++var23) {
                        var19.field1356[var23] = 0;
                        var19.field1383[var23] = 0;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 36) {
                    if (this.field293 == 12) {
                        this.field316 = true;
                    }
                    this.field597 = this.field153.method333();
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 151) {
                    int var24 = this.field153.method332();
                    int var25 = this.field153.method358((byte) 5);
                    int var26 = this.field153.method359(2);
                    class52.method458(var26).field1378 = (var25 << 16) + var24;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 110) {
                    this.field163 = this.field357 / 8;
                    for (int var27 = 0; var27 < this.field163; ++var27) {
                        this.field207[var27] = this.field153.method336(7);
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 250) {
                    this.field182 = this.field153.method330();
                    if (this.field182 == 1) {
                        this.field252 = this.field153.method332();
                    }
                    if (this.field182 >= 2 && this.field182 <= 6) {
                        if (this.field182 == 2) {
                            this.field281 = 64;
                            this.field282 = 64;
                        }
                        if (this.field182 == 3) {
                            this.field281 = 0;
                            this.field282 = 64;
                        }
                        if (this.field182 == 4) {
                            this.field281 = 128;
                            this.field282 = 64;
                        }
                        if (this.field182 == 5) {
                            this.field281 = 64;
                            this.field282 = 0;
                        }
                        if (this.field182 == 6) {
                            this.field281 = 64;
                            this.field282 = 128;
                        }
                        this.field182 = 2;
                        this.field278 = this.field153.method332();
                        this.field279 = this.field153.method332();
                        this.field280 = this.field153.method330();
                    }
                    if (this.field182 == 10) {
                        this.field410 = this.field153.method332();
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 248) {
                    this.field431 = this.field153.method332();
                    this.field338 = this.field153.method349((byte) 7);
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 173) {
                    this.field164 = false;
                    this.field250 = 2;
                    this.field320 = "";
                    this.field310 = true;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 72) {
                    int var28 = this.field153.method358((byte) 5);
                    byte var29 = this.field153.method352(-418);
                    this.field391[var28] = var29;
                    if (this.field188[var28] != var29) {
                        this.field188[var28] = var29;
                        this.method105(var28, 49157);
                        this.field316 = true;
                        if (this.field518 != -1) {
                            this.field310 = true;
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 50) {
                    int var30 = this.field153.method332();
                    this.method169(this.field205, var30);
                    if (this.field515 != -1) {
                        this.method194(-12, this.field515);
                        this.field515 = -1;
                        this.field316 = true;
                        this.field423 = true;
                    }
                    if (this.field255 != -1) {
                        this.method194(-12, this.field255);
                        this.field255 = -1;
                        this.field569 = true;
                    }
                    if (this.field537 != -1) {
                        this.method194(-12, this.field537);
                        this.field537 = -1;
                    }
                    if (this.field375 != -1) {
                        this.method194(-12, this.field375);
                        this.field375 = -1;
                    }
                    if (this.field339 != var30) {
                        this.method194(-12, this.field339);
                        this.field339 = var30;
                    }
                    this.field222 = false;
                    this.field310 = true;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 42) {
                    this.field164 = false;
                    this.field250 = 1;
                    this.field320 = "";
                    this.field310 = true;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 9) {
                    int var31 = this.field153.method358((byte) 5);
                    if (var31 == 65535) {
                        var31 = -1;
                    }
                    if (this.field353 != var31 && this.field382 && !field617 && this.field573 == 0) {
                        this.field290 = var31;
                        this.field291 = true;
                        this.field270.method265(2, this.field290);
                    }
                    this.field353 = var31;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 190) {
                    int var32 = this.field153.method362(-22499);
                    int var33 = this.field153.method332();
                    if (this.field382 && !field617) {
                        this.field290 = var33;
                        this.field291 = false;
                        this.field270.method265(2, this.field290);
                        this.field573 = var32;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 240) {
                    for (int var34 = 0; var34 < this.field452.length; ++var34) {
                        if (this.field452[var34] != null) {
                            this.field452[var34].field1427 = -1;
                        }
                    }
                    for (int var35 = 0; var35 < this.field363.length; ++var35) {
                        if (this.field363[var35] != null) {
                            this.field363[var35].field1427 = -1;
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 160) {
                    int var36 = this.field153.method357(31063);
                    int var37 = this.field153.method332();
                    int var38 = var37 >> 10 & 31;
                    int var39 = var37 >> 5 & 31;
                    int var40 = var37 & 31;
                    class52.method458(var36).field1334 = (var40 << 3) + (var38 << 19) + (var39 << 11);
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 24) {
                    int var41 = this.field153.method360((byte) 10);
                    if (var41 >= 0) {
                        this.method169(this.field205, var41);
                    }
                    if (this.field161 != var41) {
                        this.method194(-12, this.field161);
                        this.field161 = var41;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 115) {
                    int var42 = this.field153.method332();
                    this.method169(this.field205, var42);
                    if (this.field339 != -1) {
                        this.method194(-12, this.field339);
                        this.field339 = -1;
                        this.field310 = true;
                    }
                    if (this.field255 != -1) {
                        this.method194(-12, this.field255);
                        this.field255 = -1;
                        this.field569 = true;
                    }
                    if (this.field537 != -1) {
                        this.method194(-12, this.field537);
                        this.field537 = -1;
                    }
                    if (this.field375 != -1) {
                        this.method194(-12, this.field375);
                        this.field375 = -1;
                    }
                    if (this.field515 != var42) {
                        this.method194(-12, this.field515);
                        this.field515 = var42;
                    }
                    if (this.field250 != 0) {
                        this.field250 = 0;
                        this.field310 = true;
                    }
                    this.field316 = true;
                    this.field423 = true;
                    this.field222 = false;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 27) {
                    String var43 = this.field153.method337();
                    int var44 = this.field153.method359(2);
                    class52.method458(var44).field1376 = var43;
                    int var10001 = this.field383[this.field293];
                    if (class52.method458(var44).field1321 == var10001) {
                        this.field316 = true;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 15) {
                    int var45 = this.field153.method332();
                    class52 var46 = class52.method458(var45);
                    for (int var47 = 0; var47 < var46.field1356.length; ++var47) {
                        var46.field1356[var47] = -1;
                        var46.field1356[var47] = 0;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 17) {
                    int var48 = this.field153.method349((byte) 7);
                    int var49 = this.field153.method330();
                    String var50 = this.field153.method337();
                    if (var49 >= 1 && var49 <= 5) {
                        if (var50.equalsIgnoreCase("null")) {
                            var50 = null;
                        }
                        this.field574[var49 - 1] = var50;
                        this.field575[var49 - 1] = var48 == 0;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 232) {
                    if (this.field515 != -1) {
                        this.method194(-12, this.field515);
                        this.field515 = -1;
                        this.field316 = true;
                        this.field423 = true;
                    }
                    if (this.field339 != -1) {
                        this.method194(-12, this.field339);
                        this.field339 = -1;
                        this.field310 = true;
                    }
                    if (this.field255 != -1) {
                        this.method194(-12, this.field255);
                        this.field255 = -1;
                        this.field569 = true;
                    }
                    if (this.field537 != -1) {
                        this.method194(-12, this.field537);
                        this.field537 = -1;
                    }
                    if (this.field375 != -1) {
                        this.method194(-12, this.field375);
                        this.field375 = -1;
                    }
                    if (this.field250 != 0) {
                        this.field250 = 0;
                        this.field310 = true;
                    }
                    this.field222 = false;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 87) {
                    this.field140 = true;
                    this.field144 = this.field153.method330();
                    this.field145 = this.field153.method330();
                    this.field146 = this.field153.method332();
                    this.field147 = this.field153.method330();
                    this.field148 = this.field153.method330();
                    if (this.field148 >= 100) {
                        this.field332 = this.field144 * 128 + 64;
                        this.field334 = this.field145 * 128 + 64;
                        this.field333 = this.method57(this.field601, this.field332, this.field208, this.field334) - this.field146;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 125) {
                    this.method123(true);
                    this.field358 = -1;
                    return false;
                }
                if (this.field358 == 233) {
                    int var51 = this.field153.method332();
                    int var52 = this.field153.method332();
                    class52.method458(var52).field1349 = 2;
                    class52.method458(var52).field1350 = var51;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 19) {
                    this.field166 = this.field153.method330();
                    this.field167 = this.field153.method350((byte) 40);
                    while (this.field153.field1105 < this.field357) {
                        int var53 = this.field153.method330();
                        this.method129(this.field153, var53, 23254);
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 225) {
                    this.field166 = this.field153.method351(0);
                    this.field167 = this.field153.method349((byte) 7);
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 251) {
                    this.field293 = this.field153.method349((byte) 7);
                    this.field316 = true;
                    this.field423 = true;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 0) {
                    this.field554 = this.field153.method357(31063);
                    this.field524 = this.field153.method332();
                    this.field413 = this.field153.method358((byte) 5);
                    this.field328 = this.field153.method359(2);
                    this.field170 = this.field153.method357(31063);
                    this.field560 = this.field153.method358((byte) 5);
                    this.field514 = this.field153.method332();
                    this.field283 = this.field153.method359(2);
                    this.field323 = this.field153.method332();
                    this.field374 = this.field153.method365(32520);
                    this.field464 = this.field153.method351(0);
                    signlink.dnslookup(class36.method303(this.field374, 0));
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 71) {
                    long var54 = this.field153.method336(7);
                    int var56 = this.field153.method335();
                    int var57 = this.field153.method330();
                    boolean var58 = false;
                    for (int var59 = 0; var59 < 100; ++var59) {
                        if (this.field197[var59] == var56) {
                            var58 = true;
                            break;
                        }
                    }
                    if (var57 <= 1) {
                        for (int var60 = 0; var60 < this.field163; ++var60) {
                            if (this.field207[var60] == var54) {
                                var58 = true;
                                break;
                            }
                        }
                    }
                    if (!var58 && this.field519 == 0) {
                        try {
                            this.field197[this.field607] = var56;
                            this.field607 = (this.field607 + 1) % 100;
                            String var61 = class41.method313(this.field357 - 13, (byte) -7, this.field153);
                            if (var57 != 3) {
                                var61 = class44.method378(24865, var61);
                            }
                            if (var57 != 2 && var57 != 3) {
                                if (var57 == 1) {
                                    this.method191(7, "@cr1@" + class36.method304(-616, class36.method301((byte) 7, var54)), var61, (byte) -92);
                                } else {
                                    this.method191(3, class36.method304(-616, class36.method301((byte) 7, var54)), var61, (byte) -92);
                                }
                            } else {
                                this.method191(7, "@cr2@" + class36.method304(-616, class36.method301((byte) 7, var54)), var61, (byte) -92);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 97) {
                    String var63 = this.field153.method337();
                    if (var63.endsWith(":tradereq:")) {
                        String var64 = var63.substring(0, var63.indexOf(":"));
                        long var65 = class36.method300(var64);
                        boolean var67 = false;
                        for (int var68 = 0; var68 < this.field163; ++var68) {
                            if (this.field207[var68] == var65) {
                                var67 = true;
                                break;
                            }
                        }
                        if (!var67 && this.field519 == 0) {
                            this.method191(4, var64, "wishes to trade with you.", (byte) -92);
                        }
                    } else if (var63.endsWith(":duelreq:")) {
                        String var69 = var63.substring(0, var63.indexOf(":"));
                        long var70 = class36.method300(var69);
                        boolean var72 = false;
                        for (int var73 = 0; var73 < this.field163; ++var73) {
                            if (this.field207[var73] == var70) {
                                var72 = true;
                                break;
                            }
                        }
                        if (!var72 && this.field519 == 0) {
                            this.method191(8, var69, "wishes to duel with you.", (byte) -92);
                        }
                    } else if (!var63.endsWith(":chalreq:")) {
                        this.method191(0, "", var63, (byte) -92);
                    } else {
                        String var74 = var63.substring(0, var63.indexOf(":"));
                        long var75 = class36.method300(var74);
                        boolean var77 = false;
                        for (int var78 = 0; var78 < this.field163; ++var78) {
                            if (this.field207[var78] == var75) {
                                var77 = true;
                                break;
                            }
                        }
                        if (!var77 && this.field519 == 0) {
                            String var79 = var63.substring(var63.indexOf(":") + 1, var63.length() - 9);
                            this.method191(8, var74, var79, (byte) -92);
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 186) {
                    this.field140 = true;
                    this.field527 = this.field153.method330();
                    this.field528 = this.field153.method330();
                    this.field529 = this.field153.method332();
                    this.field530 = this.field153.method330();
                    this.field531 = this.field153.method330();
                    if (this.field531 >= 100) {
                        int var80 = this.field527 * 128 + 64;
                        int var81 = this.field528 * 128 + 64;
                        int var82 = this.method57(this.field601, var80, this.field208, var81) - this.field529;
                        int var83 = var80 - this.field332;
                        int var84 = var82 - this.field333;
                        int var85 = var81 - this.field334;
                        int var86 = (int) Math.sqrt((double) (var83 * var83 + var85 * var85));
                        this.field335 = (int) (Math.atan2((double) var84, (double) var86) * 325.949D) & 2047;
                        this.field336 = (int) (Math.atan2((double) var83, (double) var85) * -325.949D) & 2047;
                        if (this.field335 < 128) {
                            this.field335 = 128;
                        }
                        if (this.field335 > 383) {
                            this.field335 = 383;
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 8) {
                    int var87 = this.field153.method358((byte) 5);
                    int var88 = this.field153.method333();
                    int var89 = this.field153.method361(0);
                    class52 var90 = class52.method458(var87);
                    var90.field1337 = var88;
                    var90.field1357 = var89;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 223) {
                    for (int var91 = 0; var91 < this.field188.length; ++var91) {
                        if (this.field391[var91] != this.field188[var91]) {
                            this.field188[var91] = this.field391[var91];
                            this.method105(var91, 49157);
                            this.field316 = true;
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 180) {
                    this.method140(this.field153, false, this.field357);
                    this.field237 = false;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 105) {
                    this.field316 = true;
                    int var92 = this.field153.method332();
                    class52 var93 = class52.method458(var92);
                    while (this.field153.field1105 < this.field357) {
                        int var94 = this.field153.method344();
                        int var95 = this.field153.method332();
                        int var96 = this.field153.method330();
                        if (var96 == 255) {
                            var96 = this.field153.method335();
                        }
                        if (var94 >= 0 && var94 < var93.field1356.length) {
                            var93.field1356[var94] = var95;
                            var93.field1383[var94] = var96;
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 182) {
                    int var97 = this.field153.method357(31063);
                    int var98 = this.field153.method366(this.field325);
                    this.field391[var97] = var98;
                    if (this.field188[var97] != var98) {
                        this.field188[var97] = var98;
                        this.method105(var97, 49157);
                        this.field316 = true;
                        if (this.field518 != -1) {
                            this.field310 = true;
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 162) {
                    int var99 = this.field153.method332();
                    int var100 = this.field153.method330();
                    int var101 = this.field153.method332();
                    if (this.field534 && !field617 && this.field168 < 50) {
                        this.field200[this.field168] = var99;
                        this.field532[this.field168] = var100;
                        this.field585[this.field168] = class38.field1054[var99] + var101;
                        ++this.field168;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 2) {
                    this.field526 = this.field153.method330();
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 189) {
                    this.field541 = 0;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 139) {
                    int var102 = this.field153.method358((byte) 5);
                    int var103 = this.field153.method358((byte) 5);
                    int var104 = this.field153.method359(2);
                    if (var102 == 65535) {
                        class52.method458(var104).field1349 = 0;
                        this.field358 = -1;
                        return true;
                    }
                    class21 var105 = class21.method236(var102);
                    class52.method458(var104).field1349 = 4;
                    class52.method458(var104).field1350 = var102;
                    class52.method458(var104).field1343 = var105.field856;
                    class52.method458(var104).field1344 = var105.field847;
                    class52.method458(var104).field1342 = var105.field839 * 100 / var103;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 188) {
                    int var106 = this.field153.method330();
                    int var107 = this.field153.method330();
                    int var108 = this.field153.method330();
                    int var109 = this.field153.method330();
                    this.field154[var106] = true;
                    this.field272[var106] = var107;
                    this.field211[var106] = var108;
                    this.field516[var106] = var109;
                    this.field214[var106] = 0;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 18) {
                    if (this.field293 == 12) {
                        this.field316 = true;
                    }
                    this.field432 = this.field153.method330();
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 93) {
                    int var110 = this.field153.method357(31063);
                    int var111 = this.field153.method359(2);
                    int var112 = this.field153.method358((byte) 5);
                    int var113 = this.field153.method358((byte) 5);
                    class52.method458(var113).field1343 = var110;
                    class52.method458(var113).field1344 = var112;
                    class52.method458(var113).field1342 = var111;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 6 || this.field358 == 150) {
                    int var114 = this.field171;
                    int var115 = this.field172;
                    if (this.field358 == 6) {
                        var115 = this.field153.method358((byte) 5);
                        var114 = this.field153.method332();
                        this.field212 = false;
                    }
                    if (this.field358 == 150) {
                        var114 = this.field153.method332();
                        var115 = this.field153.method332();
                        this.field153.method340(2);
                        int var116 = 0;
                        while (true) {
                            if (var116 >= 4) {
                                this.field153.method342(-29596);
                                this.field212 = true;
                                break;
                            }
                            for (int var117 = 0; var117 < 13; ++var117) {
                                for (int var118 = 0; var118 < 13; ++var118) {
                                    int var119 = this.field153.method341((byte) 39, 1);
                                    if (var119 == 1) {
                                        this.field187[var116][var117][var118] = this.field153.method341((byte) 39, 26);
                                    } else {
                                        this.field187[var116][var117][var118] = -1;
                                    }
                                }
                            }
                            ++var116;
                        }
                    }
                    if (this.field171 == var114 && this.field172 == var115 && this.field149 == 2) {
                        this.field358 = -1;
                        return true;
                    }
                    this.field171 = var114;
                    this.field172 = var115;
                    this.field228 = (this.field171 - 6) * 8;
                    this.field229 = (this.field172 - 6) * 8;
                    this.field295 = false;
                    if ((this.field171 / 8 == 48 || this.field171 / 8 == 49) && this.field172 / 8 == 48) {
                        this.field295 = true;
                    }
                    if (this.field171 / 8 == 48 && this.field172 / 8 == 148) {
                        this.field295 = true;
                    }
                    this.field149 = 1;
                    this.field275 = System.currentTimeMillis();
                    this.method124("Loading - please wait.", -182, (String) null);
                    if (this.field358 == 6) {
                        int var120 = 0;
                        int var121 = (this.field171 - 6) / 8;
                        label1201: while (true) {
                            if (var121 > (this.field171 + 6) / 8) {
                                this.field224 = new byte[var120][];
                                this.field577 = new byte[var120][];
                                this.field598 = new int[var120];
                                this.field599 = new int[var120];
                                this.field600 = new int[var120];
                                int var123 = 0;
                                int var124 = (this.field171 - 6) / 8;
                                while (true) {
                                    if (var124 > (this.field171 + 6) / 8) {
                                        break label1201;
                                    }
                                    for (int var125 = (this.field172 - 6) / 8; var125 <= (this.field172 + 6) / 8; ++var125) {
                                        this.field598[var123] = (var124 << 8) + var125;
                                        if (!this.field295 || var125 != 49 && var125 != 149 && var125 != 147 && var124 != 50 && (var124 != 49 || var125 != 47)) {
                                            int var126 = this.field599[var123] = this.field270.method257(867, var124, 0, var125);
                                            if (var126 != -1) {
                                                this.field270.method265(3, var126);
                                            }
                                            int var127 = this.field600[var123] = this.field270.method257(867, var124, 1, var125);
                                            if (var127 != -1) {
                                                this.field270.method265(3, var127);
                                            }
                                            ++var123;
                                        } else {
                                            this.field599[var123] = -1;
                                            this.field600[var123] = -1;
                                            ++var123;
                                        }
                                    }
                                    ++var124;
                                }
                            }
                            for (int var122 = (this.field172 - 6) / 8; var122 <= (this.field172 + 6) / 8; ++var122) {
                                ++var120;
                            }
                            ++var121;
                        }
                    }
                    if (this.field358 == 150) {
                        int var128 = 0;
                        int[] var129 = new int[676];
                        int var130 = 0;
                        label1160: while (true) {
                            if (var130 >= 4) {
                                this.field224 = new byte[var128][];
                                this.field577 = new byte[var128][];
                                this.field598 = new int[var128];
                                this.field599 = new int[var128];
                                this.field600 = new int[var128];
                                int var138 = 0;
                                while (true) {
                                    if (var138 >= var128) {
                                        break label1160;
                                    }
                                    int var139 = this.field598[var138] = var129[var138];
                                    int var140 = var139 >> 8 & 255;
                                    int var141 = var139 & 255;
                                    int var142 = this.field599[var138] = this.field270.method257(867, var140, 0, var141);
                                    if (var142 != -1) {
                                        this.field270.method265(3, var142);
                                    }
                                    int var143 = this.field600[var138] = this.field270.method257(867, var140, 1, var141);
                                    if (var143 != -1) {
                                        this.field270.method265(3, var143);
                                    }
                                    ++var138;
                                }
                            }
                            for (int var131 = 0; var131 < 13; ++var131) {
                                for (int var132 = 0; var132 < 13; ++var132) {
                                    int var133 = this.field187[var130][var131][var132];
                                    if (var133 != -1) {
                                        int var134 = var133 >> 14 & 1023;
                                        int var135 = var133 >> 3 & 2047;
                                        int var136 = (var134 / 8 << 8) + var135 / 8;
                                        for (int var137 = 0; var137 < var128; ++var137) {
                                            if (var129[var137] == var136) {
                                                var136 = -1;
                                                break;
                                            }
                                        }
                                        if (var136 != -1) {
                                            var129[var128++] = var136;
                                        }
                                    }
                                }
                            }
                            ++var130;
                        }
                    }
                    int var144 = this.field228 - this.field230;
                    int var145 = this.field229 - this.field231;
                    this.field230 = this.field228;
                    this.field231 = this.field229;
                    for (int var146 = 0; var146 < 16384; ++var146) {
                        class42 var147 = this.field363[var146];
                        if (var147 != null) {
                            for (int var148 = 0; var148 < 10; ++var148) {
                                var147.field1416[var148] -= var144;
                                var147.field1417[var148] -= var145;
                            }
                            var147.field1453 -= var144 * 128;
                            var147.field1454 -= var145 * 128;
                        }
                    }
                    for (int var149 = 0; var149 < this.field450; ++var149) {
                        class48 var150 = this.field452[var149];
                        if (var150 != null) {
                            for (int var151 = 0; var151 < 10; ++var151) {
                                var150.field1416[var151] -= var144;
                                var150.field1417[var151] -= var145;
                            }
                            var150.field1453 -= var144 * 128;
                            var150.field1454 -= var145 * 128;
                        }
                    }
                    this.field237 = true;
                    byte var152 = 0;
                    byte var153 = 104;
                    byte var154 = 1;
                    if (var144 < 0) {
                        var152 = 103;
                        var153 = -1;
                        var154 = -1;
                    }
                    byte var155 = 0;
                    byte var156 = 104;
                    byte var157 = 1;
                    if (var145 < 0) {
                        var155 = 103;
                        var156 = -1;
                        var157 = -1;
                    }
                    for (int var158 = var152; var153 != var158; var158 += var154) {
                        for (int var159 = var155; var156 != var159; var159 += var157) {
                            int var160 = var144 + var158;
                            int var161 = var145 + var159;
                            for (int var162 = 0; var162 < 4; ++var162) {
                                if (var160 >= 0 && var161 >= 0 && var160 < 104 && var161 < 104) {
                                    this.field330[var162][var158][var159] = this.field330[var162][var160][var161];
                                } else {
                                    this.field330[var162][var158][var159] = null;
                                }
                            }
                        }
                    }
                    for (class39 var163 = (class39) this.field215.method510(); var163 != null; var163 = (class39) this.field215.method512(false)) {
                        var163.field1069 -= var144;
                        var163.field1070 -= var145;
                        if (var163.field1069 < 0 || var163.field1070 < 0 || var163.field1069 >= 104 || var163.field1070 >= 104) {
                            var163.method254();
                        }
                    }
                    if (this.field541 != 0) {
                        this.field541 -= var144;
                        this.field542 -= var145;
                    }
                    this.field140 = false;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 134) {
                    this.field160 = this.field153.method330();
                    if (this.field293 == this.field160) {
                        if (this.field160 == 3) {
                            this.field293 = 1;
                        } else {
                            this.field293 = 3;
                        }
                        this.field316 = true;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 197) {
                    int var164 = this.field153.method332();
                    this.method169(this.field205, var164);
                    if (this.field515 != -1) {
                        this.method194(-12, this.field515);
                        this.field515 = -1;
                        this.field316 = true;
                        this.field423 = true;
                    }
                    if (this.field339 != -1) {
                        this.method194(-12, this.field339);
                        this.field339 = -1;
                        this.field310 = true;
                    }
                    if (this.field255 != -1) {
                        this.method194(-12, this.field255);
                        this.field255 = -1;
                        this.field569 = true;
                    }
                    if (this.field537 != -1) {
                        this.method194(-12, this.field537);
                        this.field537 = -1;
                    }
                    if (this.field375 != var164) {
                        this.method194(-12, this.field375);
                        this.field375 = var164;
                    }
                    if (this.field250 != 0) {
                        this.field250 = 0;
                        this.field310 = true;
                    }
                    this.field222 = false;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 127) {
                    this.field140 = false;
                    for (int var165 = 0; var165 < 5; ++var165) {
                        this.field154[var165] = false;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 177) {
                    this.field157 = this.field153.method330();
                    this.field316 = true;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 1) {
                    this.field378 = this.field153.method330();
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 166) {
                    int var166 = this.field153.method332();
                    class52.method458(var166).field1349 = 3;
                    if (field331.field1283 == null) {
                        class52.method458(var166).field1350 = (field331.field1292[11] << 5) + (field331.field1292[8] << 10) + (field331.field1292[0] << 15) + (field331.field1272[0] << 25) + (field331.field1272[4] << 20) + field331.field1292[1];
                    } else {
                        class52.method458(var166).field1350 = (int) (field331.field1283.field1652 + 305419896L);
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 74) {
                    int var167 = this.field153.method359(2);
                    int var168 = this.field153.method332();
                    this.method169(this.field205, var168);
                    if (var167 != -1) {
                        this.method169(this.field205, var167);
                    }
                    if (this.field375 != -1) {
                        this.method194(-12, this.field375);
                        this.field375 = -1;
                    }
                    if (this.field515 != -1) {
                        this.method194(-12, this.field515);
                        this.field515 = -1;
                    }
                    if (this.field339 != -1) {
                        this.method194(-12, this.field339);
                        this.field339 = -1;
                    }
                    if (this.field255 != var168) {
                        this.method194(-12, this.field255);
                        this.field255 = var168;
                    }
                    if (this.field537 != var168) {
                        this.method194(-12, this.field537);
                        this.field537 = var167;
                    }
                    this.field250 = 0;
                    this.field222 = false;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 155) {
                    int var169 = this.field153.method358((byte) 5);
                    int var170 = this.field153.method359(2);
                    class52.method458(var170).field1349 = 1;
                    class52.method458(var170).field1350 = var169;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 201) {
                    int var171 = this.field153.method333();
                    if (this.field518 != var171) {
                        this.method194(-12, this.field518);
                        this.field518 = var171;
                    }
                    this.field310 = true;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 12) {
                    this.method82(this.field153, this.field357, true);
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 81) {
                    int var172 = this.field153.method358((byte) 5);
                    int var173 = this.field153.method358((byte) 5);
                    if (this.field339 != -1) {
                        this.method194(-12, this.field339);
                        this.field339 = -1;
                        this.field310 = true;
                    }
                    if (this.field255 != -1) {
                        this.method194(-12, this.field255);
                        this.field255 = -1;
                        this.field569 = true;
                    }
                    if (this.field537 != -1) {
                        this.method194(-12, this.field537);
                        this.field537 = -1;
                    }
                    if (this.field375 != var173) {
                        this.method194(-12, this.field375);
                        this.field375 = var173;
                    }
                    if (this.field515 != var172) {
                        this.method194(-12, this.field515);
                        this.field515 = var172;
                    }
                    if (this.field250 != 0) {
                        this.field250 = 0;
                        this.field310 = true;
                    }
                    this.field316 = true;
                    this.field423 = true;
                    this.field222 = false;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 103) {
                    int var174 = this.field153.method357(31063);
                    int var175 = this.field153.method349((byte) 7);
                    if (var174 == 65535) {
                        var174 = -1;
                    }
                    if (this.field383[var175] != var174) {
                        this.method194(-12, this.field383[var175]);
                        this.field383[var175] = var174;
                    }
                    this.field316 = true;
                    this.field423 = true;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 174) {
                    int var176 = this.field153.method332();
                    int var177 = this.field153.method357(31063);
                    class52 var178 = class52.method458(var177);
                    if (var178 != null && var178.field1352 == 0) {
                        if (var176 < 0) {
                            var176 = 0;
                        }
                        if (var176 > var178.field1359 - var178.field1330) {
                            var176 = var178.field1359 - var178.field1330;
                        }
                        var178.field1312 = var176;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 247) {
                    int var179 = this.field153.method332();
                    int var180 = this.field153.method333();
                    class52 var181 = class52.method458(var179);
                    if (var181.field1318 != var180 || var180 == -1) {
                        var181.field1318 = var180;
                        var181.field1368 = 0;
                        var181.field1317 = 0;
                    }
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 109) {
                    boolean var182 = this.field153.method349((byte) 7) == 1;
                    int var183 = this.field153.method358((byte) 5);
                    class52.method458(var183).field1355 = var182;
                    this.field358 = -1;
                    return true;
                }
                if (this.field358 == 220) {
                    this.field167 = this.field153.method351(0);
                    this.field166 = this.field153.method351(0);
                    for (int var184 = this.field166; var184 < this.field166 + 8; ++var184) {
                        for (int var185 = this.field167; var185 < this.field167 + 8; ++var185) {
                            if (this.field330[this.field601][var184][var185] != null) {
                                this.field330[this.field601][var184][var185] = null;
                                this.method171(var184, var185);
                            }
                        }
                    }
                    for (class39 var186 = (class39) this.field215.method510(); var186 != null; var186 = (class39) this.field215.method512(false)) {
                        if (var186.field1069 >= this.field166 && var186.field1069 < this.field166 + 8 && var186.field1070 >= this.field167 && var186.field1070 < this.field167 + 8 && this.field601 == var186.field1067) {
                            var186.field1071 = 0;
                        }
                    }
                    this.field358 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field358 + "," + this.field357 + " - " + this.field202 + "," + this.field203);
                this.method123(true);
            } catch (IOException var191) {
                this.method146(70);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field358 + "," + this.field202 + "," + this.field203 + " - " + this.field357 + "," + (field331.field1416[0] + this.field228) + "," + (field331.field1417[0] + this.field229) + " - ";
                for (int var189 = 0; var189 < this.field357 && var189 < 50; ++var189) {
                    var188 = var188 + this.field153.field1104[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method123(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method107(int arg0) {
        this.field357 += arg0;
        for (int var2 = 0; var2 < this.field364; ++var2) {
            int var3 = this.field365[var2];
            class42 var4 = this.field363[var3];
            if (var4 != null) {
                this.method108(313, var4.field1082.field1690, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILSRUOAWPS;)V")
    public final void method108(int arg0, int arg1, class55 arg2) {
        if (arg2.field1453 < 128 || arg2.field1454 < 128 || arg2.field1453 >= 13184 || arg2.field1454 >= 13184) {
            arg2.field1427 = -1;
            arg2.field1464 = -1;
            arg2.field1441 = 0;
            arg2.field1442 = 0;
            arg2.field1453 = arg2.field1416[0] * 128 + arg2.field1425 * 64;
            arg2.field1454 = arg2.field1417[0] * 128 + arg2.field1425 * 64;
            arg2.method479((byte) -96);
        }
        if (field331 == arg2 && (arg2.field1453 < 1536 || arg2.field1454 < 1536 || arg2.field1453 >= 11776 || arg2.field1454 >= 11776)) {
            arg2.field1427 = -1;
            arg2.field1464 = -1;
            arg2.field1441 = 0;
            arg2.field1442 = 0;
            arg2.field1453 = arg2.field1416[0] * 128 + arg2.field1425 * 64;
            arg2.field1454 = arg2.field1417[0] * 128 + arg2.field1425 * 64;
            arg2.method479((byte) -96);
        }
        if (arg2.field1441 > field525) {
            this.method109(-395, arg2);
        } else if (arg2.field1442 >= field525) {
            this.method110(arg2, false);
        } else {
            this.method111(2, arg2);
        }
        this.method112(false, arg2);
        int var4 = 93 / arg0;
        this.method113(arg2, -354);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILSRUOAWPS;)V")
    public final void method109(int arg0, class55 arg1) {
        int var3 = arg1.field1441 - field525;
        int var4 = arg1.field1437 * 128 + arg1.field1425 * 64;
        int var5 = arg1.field1439 * 128 + arg1.field1425 * 64;
        arg1.field1453 += (var4 - arg1.field1453) / var3;
        if (arg0 < 0) {
            arg1.field1454 += (var5 - arg1.field1454) / var3;
            arg1.field1421 = 0;
            if (arg1.field1443 == 0) {
                arg1.field1463 = 1024;
            }
            if (arg1.field1443 == 1) {
                arg1.field1463 = 1536;
            }
            if (arg1.field1443 == 2) {
                arg1.field1463 = 0;
            }
            if (arg1.field1443 == 3) {
                arg1.field1463 = 512;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LSRUOAWPS;Z)V")
    public final void method110(class55 arg0, boolean arg1) {
        if (field525 == arg0.field1442 || arg0.field1427 == -1 || arg0.field1430 != 0 || arg0.field1429 + 1 > class14.field656[arg0.field1427].method215(arg0.field1428, 0)) {
            int var3 = arg0.field1442 - arg0.field1441;
            int var4 = field525 - arg0.field1441;
            int var5 = arg0.field1437 * 128 + arg0.field1425 * 64;
            int var6 = arg0.field1439 * 128 + arg0.field1425 * 64;
            int var7 = arg0.field1438 * 128 + arg0.field1425 * 64;
            int var8 = arg0.field1440 * 128 + arg0.field1425 * 64;
            arg0.field1453 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1454 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1421 = 0;
        if (arg0.field1443 == 0) {
            arg0.field1463 = 1024;
        }
        if (arg0.field1443 == 1) {
            arg0.field1463 = 1536;
        }
        if (arg0.field1443 == 2) {
            arg0.field1463 = 0;
        }
        if (arg0.field1443 == 3) {
            arg0.field1463 = 512;
        }
        arg0.field1455 = arg0.field1463;
        if (arg1) {
            field173 = !field173;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILSRUOAWPS;)V")
    public final void method111(int arg0, class55 arg1) {
        arg1.field1456 = arg1.field1419;
        if (arg0 != 2) {
            this.field330 = null;
        }
        if (arg1.field1436 == 0) {
            arg1.field1421 = 0;
        } else {
            if (arg1.field1427 != -1 && arg1.field1430 == 0) {
                class14 var3 = class14.field656[arg1.field1427];
                if (arg1.field1432 > 0 && var3.field668 == 0) {
                    ++arg1.field1421;
                    return;
                }
                if (arg1.field1432 <= 0 && var3.field669 == 0) {
                    ++arg1.field1421;
                    return;
                }
            }
            int var4 = arg1.field1453;
            int var5 = arg1.field1454;
            int var6 = arg1.field1416[arg1.field1436 - 1] * 128 + arg1.field1425 * 64;
            int var7 = arg1.field1417[arg1.field1436 - 1] * 128 + arg1.field1425 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1463 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1463 = 1792;
                    } else {
                        arg1.field1463 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1463 = 768;
                    } else if (var5 > var7) {
                        arg1.field1463 = 256;
                    } else {
                        arg1.field1463 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1463 = 1024;
                } else {
                    arg1.field1463 = 0;
                }
                int var8 = arg1.field1463 - arg1.field1455 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1471;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1470;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1473;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1472;
                }
                if (var9 == -1) {
                    var9 = arg1.field1470;
                }
                arg1.field1456 = var9;
                int var10 = 4;
                if (arg1.field1463 != arg1.field1455 && arg1.field1423 == -1 && arg1.field1452 != 0) {
                    var10 = 2;
                }
                if (arg1.field1436 > 2) {
                    var10 = 6;
                }
                if (arg1.field1436 > 3) {
                    var10 = 8;
                }
                if (arg1.field1421 > 0 && arg1.field1436 > 1) {
                    var10 = 8;
                    --arg1.field1421;
                }
                if (arg1.field1469[arg1.field1436 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field1470 == arg1.field1456 && arg1.field1426 != -1) {
                    arg1.field1456 = arg1.field1426;
                }
                if (var4 < var6) {
                    arg1.field1453 += var10;
                    if (arg1.field1453 > var6) {
                        arg1.field1453 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1453 -= var10;
                    if (arg1.field1453 < var6) {
                        arg1.field1453 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1454 += var10;
                    if (arg1.field1454 > var7) {
                        arg1.field1454 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1454 -= var10;
                    if (arg1.field1454 < var7) {
                        arg1.field1454 = var7;
                    }
                }
                if (arg1.field1453 == var6 && arg1.field1454 == var7) {
                    --arg1.field1436;
                    if (arg1.field1432 > 0) {
                        --arg1.field1432;
                        return;
                    }
                }
            } else {
                arg1.field1453 = var6;
                arg1.field1454 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLSRUOAWPS;)V")
    public final void method112(boolean arg0, class55 arg1) {
        if (arg0) {
            this.field358 = this.field153.method330();
        }
        if (arg1.field1452 != 0) {
            if (arg1.field1423 != -1 && arg1.field1423 < 32768) {
                class42 var3 = this.field363[arg1.field1423];
                if (var3 != null) {
                    int var4 = arg1.field1453 - var3.field1453;
                    int var5 = arg1.field1454 - var3.field1454;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field1463 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1423 >= 32768) {
                int var6 = arg1.field1423 - 32768;
                if (this.field431 == var6) {
                    var6 = this.field451;
                }
                class48 var7 = this.field452[var6];
                if (var7 != null) {
                    int var8 = arg1.field1453 - var7.field1453;
                    int var9 = arg1.field1454 - var7.field1454;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field1463 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1461 != 0 || arg1.field1462 != 0) && (arg1.field1436 == 0 || arg1.field1421 > 0)) {
                int var10 = arg1.field1453 - (arg1.field1461 - this.field228 - this.field228) * 64;
                int var11 = arg1.field1454 - (arg1.field1462 - this.field229 - this.field229) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field1463 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field1461 = 0;
                arg1.field1462 = 0;
            }
            int var12 = arg1.field1463 - arg1.field1455 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field1452 && var12 <= 2048 - arg1.field1452) {
                    if (var12 > 1024) {
                        arg1.field1455 -= arg1.field1452;
                    } else {
                        arg1.field1455 += arg1.field1452;
                    }
                } else {
                    arg1.field1455 = arg1.field1463;
                }
                arg1.field1455 &= 2047;
                if (arg1.field1456 == arg1.field1419 && arg1.field1463 != arg1.field1455) {
                    if (arg1.field1420 != -1) {
                        arg1.field1456 = arg1.field1420;
                        return;
                    }
                    arg1.field1456 = arg1.field1470;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LSRUOAWPS;I)V")
    public final void method113(class55 arg0, int arg1) {
        if (arg1 < 0) {
            arg0.field1460 = false;
            if (arg0.field1456 != -1) {
                class14 var3 = class14.field656[arg0.field1456];
                ++arg0.field1458;
                if (arg0.field1457 < var3.field657 && arg0.field1458 > var3.method215(arg0.field1457, 0)) {
                    arg0.field1458 = 0;
                    ++arg0.field1457;
                }
                if (arg0.field1457 >= var3.field657) {
                    arg0.field1458 = 0;
                    arg0.field1457 = 0;
                }
            }
            if (arg0.field1464 != -1 && field525 >= arg0.field1467) {
                if (arg0.field1465 < 0) {
                    arg0.field1465 = 0;
                }
                class14 var4 = class23.field866[arg0.field1464].field870;
                ++arg0.field1466;
                while (arg0.field1465 < var4.field657 && arg0.field1466 > var4.method215(arg0.field1465, 0)) {
                    arg0.field1466 -= var4.method215(arg0.field1465, 0);
                    ++arg0.field1465;
                }
                if (arg0.field1465 >= var4.field657 && (arg0.field1465 < 0 || arg0.field1465 >= var4.field657)) {
                    arg0.field1464 = -1;
                }
            }
            if (arg0.field1427 != -1 && arg0.field1430 <= 1) {
                class14 var5 = class14.field656[arg0.field1427];
                if (var5.field668 == 1 && arg0.field1432 > 0 && arg0.field1441 <= field525 && arg0.field1442 < field525) {
                    arg0.field1430 = 1;
                    return;
                }
            }
            if (arg0.field1427 != -1 && arg0.field1430 == 0) {
                class14 var6 = class14.field656[arg0.field1427];
                ++arg0.field1429;
                while (arg0.field1428 < var6.field657 && arg0.field1429 > var6.method215(arg0.field1428, 0)) {
                    arg0.field1429 -= var6.method215(arg0.field1428, 0);
                    ++arg0.field1428;
                }
                if (arg0.field1428 >= var6.field657) {
                    arg0.field1428 -= var6.field661;
                    ++arg0.field1431;
                    if (arg0.field1431 >= var6.field667) {
                        arg0.field1427 = -1;
                    }
                    if (arg0.field1428 < 0 || arg0.field1428 >= var6.field657) {
                        arg0.field1427 = -1;
                    }
                }
                arg0.field1460 = var6.field663;
            }
            if (arg0.field1430 > 0) {
                --arg0.field1430;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method114(byte arg0) {
        if (this.field255 != -1 && (this.field149 == 2 || super.field1243 != null)) {
            if (this.field149 == 2) {
                this.method131(this.field255, this.field267, -30268);
                if (this.field537 != -1) {
                    this.method131(this.field537, this.field267, -30268);
                }
                this.field267 = 0;
                this.method170(0);
                super.field1243.method24(-214);
                class71.field1706 = this.field245;
                class12.method200(3);
                this.field569 = true;
                class52 var2 = class52.method458(this.field255);
                if (var2.field1371 == 512 && var2.field1330 == 334 && var2.field1352 == 0) {
                    var2.field1371 = 765;
                    var2.field1330 = 503;
                }
                this.method172(0, 0, 0, var2, 0);
                if (this.field537 != -1) {
                    class52 var3 = class52.method458(this.field537);
                    if (var3.field1371 == 512 && var3.field1330 == 334 && var3.field1352 == 0) {
                        var3.field1371 = 765;
                        var3.field1330 = 503;
                    }
                    this.method172(0, 0, 0, var3, 0);
                }
                if (!this.field337) {
                    this.method185((byte) -10);
                    this.method177(-3568);
                } else {
                    this.method84(false);
                }
            }
            super.field1243.method25(-71, 0, super.field1242, 0);
        } else {
            if (this.field569) {
                this.method87(false);
                this.field569 = false;
                this.field469.method25(-71, 4, super.field1242, 0);
                this.field470.method25(-71, 357, super.field1242, 0);
                this.field471.method25(-71, 4, super.field1242, 722);
                this.field472.method25(-71, 205, super.field1242, 743);
                this.field473.method25(-71, 0, super.field1242, 0);
                this.field474.method25(-71, 4, super.field1242, 516);
                this.field475.method25(-71, 205, super.field1242, 516);
                this.field476.method25(-71, 357, super.field1242, 496);
                this.field477.method25(-71, 338, super.field1242, 0);
                this.field316 = true;
                this.field310 = true;
                this.field423 = true;
                this.field583 = true;
                if (this.field149 != 2) {
                    this.field418.method25(-71, 4, super.field1242, 4);
                    this.field417.method25(-71, 4, super.field1242, 550);
                }
            }
            if (this.field149 == 2) {
                this.method116(true);
            }
            if (this.field337 && this.field424 == 1) {
                this.field316 = true;
            }
            if (this.field515 != -1) {
                boolean var4 = this.method131(this.field515, this.field267, -30268);
                if (var4) {
                    this.field316 = true;
                }
            }
            if (this.field513 == 2) {
                this.field316 = true;
            }
            if (this.field461 == 2) {
                this.field316 = true;
            }
            if (this.field316) {
                this.method180(4);
                this.field316 = false;
            }
            if (this.field339 == -1) {
                this.field561.field1312 = this.field305 - this.field556 - 77;
                if (super.field1250 > 448 && super.field1250 < 560 && super.field1251 > 332) {
                    this.method117((byte) -45, 77, this.field305, super.field1250 - 17, this.field561, super.field1251 - 357, -1, 463, 0);
                }
                int var5 = this.field305 - 77 - this.field561.field1312;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field305 - 77) {
                    var5 = this.field305 - 77;
                }
                if (this.field556 != var5) {
                    this.field556 = var5;
                    this.field310 = true;
                }
                ++field388;
                if (field388 > 1972) {
                    field388 = 0;
                    this.field553.method319(127, false);
                    this.field553.method320(0);
                    int var6 = this.field553.field1105;
                    this.field553.method320(255);
                    this.field553.method320((int) (Math.random() * 256.0D));
                    this.field553.method321((int) (Math.random() * 65536.0D));
                    this.field553.method320((int) (Math.random() * 256.0D));
                    this.field553.method320(172);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field553.method320(76);
                    }
                    this.field553.method320((int) (Math.random() * 256.0D));
                    this.field553.method320(28);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field553.method321(9038);
                    }
                    this.field553.method320(64);
                    this.field553.method329((byte) 7, this.field553.field1105 - var6);
                }
            }
            if (this.field339 != -1) {
                boolean var7 = this.method131(this.field339, this.field267, -30268);
                if (var7) {
                    this.field310 = true;
                }
            }
            if (this.field513 == 3) {
                this.field310 = true;
            }
            if (this.field461 == 3) {
                this.field310 = true;
            }
            if (this.field478 != null) {
                this.field310 = true;
            }
            if (this.field337 && this.field424 == 2) {
                this.field310 = true;
            }
            if (this.field310) {
                this.method59(this.field324);
                this.field310 = false;
            }
            if (this.field149 == 2) {
                this.method174(0);
                this.field417.method25(-71, 4, super.field1242, 550);
            }
            if (this.field160 != -1) {
                this.field423 = true;
            }
            if (this.field423) {
                if (this.field160 != -1 && this.field293 == this.field160) {
                    this.field160 = -1;
                    this.field553.method319(3, false);
                    this.field553.method320(this.field293);
                }
                this.field423 = false;
                this.field179.method24(-214);
                this.field314.method473(0, 0, 30573);
                if (this.field515 == -1) {
                    if (this.field383[this.field293] != -1) {
                        if (this.field293 == 0) {
                            this.field602.method473(22, 10, 30573);
                        }
                        if (this.field293 == 1) {
                            this.field603.method473(54, 8, 30573);
                        }
                        if (this.field293 == 2) {
                            this.field603.method473(82, 8, 30573);
                        }
                        if (this.field293 == 3) {
                            this.field604.method473(110, 8, 30573);
                        }
                        if (this.field293 == 4) {
                            this.field606.method473(153, 8, 30573);
                        }
                        if (this.field293 == 5) {
                            this.field606.method473(181, 8, 30573);
                        }
                        if (this.field293 == 6) {
                            this.field605.method473(209, 9, 30573);
                        }
                    }
                    if (this.field383[0] != -1 && (this.field160 != 0 || field525 % 20 < 10)) {
                        this.field326[0].method473(29, 13, 30573);
                    }
                    if (this.field383[1] != -1 && (this.field160 != 1 || field525 % 20 < 10)) {
                        this.field326[1].method473(53, 11, 30573);
                    }
                    if (this.field383[2] != -1 && (this.field160 != 2 || field525 % 20 < 10)) {
                        this.field326[2].method473(82, 11, 30573);
                    }
                    if (this.field383[3] != -1 && (this.field160 != 3 || field525 % 20 < 10)) {
                        this.field326[3].method473(115, 12, 30573);
                    }
                    if (this.field383[4] != -1 && (this.field160 != 4 || field525 % 20 < 10)) {
                        this.field326[4].method473(153, 13, 30573);
                    }
                    if (this.field383[5] != -1 && (this.field160 != 5 || field525 % 20 < 10)) {
                        this.field326[5].method473(180, 11, 30573);
                    }
                    if (this.field383[6] != -1 && (this.field160 != 6 || field525 % 20 < 10)) {
                        this.field326[6].method473(208, 13, 30573);
                    }
                }
                this.field179.method25(-71, 160, super.field1242, 516);
                this.field178.method24(-214);
                this.field313.method473(0, 0, 30573);
                if (this.field515 == -1) {
                    if (this.field383[this.field293] != -1) {
                        if (this.field293 == 7) {
                            this.field546.method473(42, 0, 30573);
                        }
                        if (this.field293 == 8) {
                            this.field547.method473(74, 0, 30573);
                        }
                        if (this.field293 == 9) {
                            this.field547.method473(102, 0, 30573);
                        }
                        if (this.field293 == 10) {
                            this.field548.method473(130, 1, 30573);
                        }
                        if (this.field293 == 11) {
                            this.field550.method473(173, 0, 30573);
                        }
                        if (this.field293 == 12) {
                            this.field550.method473(201, 0, 30573);
                        }
                        if (this.field293 == 13) {
                            this.field549.method473(229, 0, 30573);
                        }
                    }
                    if (this.field383[8] != -1 && (this.field160 != 8 || field525 % 20 < 10)) {
                        this.field326[7].method473(74, 2, 30573);
                    }
                    if (this.field383[9] != -1 && (this.field160 != 9 || field525 % 20 < 10)) {
                        this.field326[8].method473(102, 3, 30573);
                    }
                    if (this.field383[10] != -1 && (this.field160 != 10 || field525 % 20 < 10)) {
                        this.field326[9].method473(137, 4, 30573);
                    }
                    if (this.field383[11] != -1 && (this.field160 != 11 || field525 % 20 < 10)) {
                        this.field326[10].method473(174, 2, 30573);
                    }
                    if (this.field383[12] != -1 && (this.field160 != 12 || field525 % 20 < 10)) {
                        this.field326[11].method473(201, 2, 30573);
                    }
                    if (this.field383[13] != -1 && (this.field160 != 13 || field525 % 20 < 10)) {
                        this.field326[12].method473(226, 2, 30573);
                    }
                }
                this.field178.method25(-71, 466, super.field1242, 496);
                this.field418.method24(-214);
                class71.field1706 = this.field244;
            }
            if (this.field583) {
                this.field583 = false;
                this.field177.method24(-214);
                this.field312.method473(0, 0, 30573);
                this.field521.method10(55, "Public chat", true, 28, -72, 16777215);
                if (this.field536 == 0) {
                    this.field521.method10(55, "On", true, 41, -72, 65280);
                }
                if (this.field536 == 1) {
                    this.field521.method10(55, "Friends", true, 41, -72, 16776960);
                }
                if (this.field536 == 2) {
                    this.field521.method10(55, "Off", true, 41, -72, 16711680);
                }
                if (this.field536 == 3) {
                    this.field521.method10(55, "Hide", true, 41, -72, 65535);
                }
                this.field521.method10(184, "Private chat", true, 28, -72, 16777215);
                if (this.field579 == 0) {
                    this.field521.method10(184, "On", true, 41, -72, 65280);
                }
                if (this.field579 == 1) {
                    this.field521.method10(184, "Friends", true, 41, -72, 16776960);
                }
                if (this.field579 == 2) {
                    this.field521.method10(184, "Off", true, 41, -72, 16711680);
                }
                this.field521.method10(324, "Trade/compete", true, 28, -72, 16777215);
                if (this.field412 == 0) {
                    this.field521.method10(324, "On", true, 41, -72, 65280);
                }
                if (this.field412 == 1) {
                    this.field521.method10(324, "Friends", true, 41, -72, 16776960);
                }
                if (this.field412 == 2) {
                    this.field521.method10(324, "Off", true, 41, -72, 16711680);
                }
                this.field521.method10(458, "Report abuse", true, 33, -72, 16777215);
                this.field177.method25(-71, 453, super.field1242, 0);
                this.field418.method24(-214);
                class71.field1706 = this.field244;
            }
            this.field267 = 0;
            if (this.field495 != arg0) {
                this.field356 = !this.field356;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        short var2 = 256;
        if (this.field276 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field276 > 768) {
                    this.field479[var3] = this.method118(this.field481[var3], this.field480[var3], this.field269, 1024 - this.field276);
                } else if (this.field276 > 256) {
                    this.field479[var3] = this.field481[var3];
                } else {
                    this.field479[var3] = this.method118(this.field480[var3], this.field481[var3], this.field269, 256 - this.field276);
                }
            }
        } else if (this.field277 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field277 > 768) {
                    this.field479[var4] = this.method118(this.field482[var4], this.field480[var4], this.field269, 1024 - this.field277);
                } else if (this.field277 > 256) {
                    this.field479[var4] = this.field482[var4];
                } else {
                    this.field479[var4] = this.method118(this.field480[var4], this.field482[var4], this.field269, 256 - this.field277);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field479[var5] = this.field480[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field404.field54[var6] = this.field571.field1498[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field189[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field351[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field479[var26];
                    int var30 = this.field404.field54[var8];
                    this.field404.field54[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field404.method25(-71, 0, super.field1242, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field405.field54[var10] = this.field572.field1498[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field189[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field351[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field479[var18];
                    int var22 = this.field405.field54[var16];
                    this.field405.field54[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field405.method25(-71, 0, super.field1242, 637);
        if (arg0) {
            this.field330 = null;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method116(boolean arg0) {
        ++this.field586;
        this.method104(true, 40284);
        this.method137(0, true);
        this.method104(false, 40284);
        this.method137(0, false);
        this.method139(251);
        this.method148(false);
        if (!this.field140) {
            int var2 = this.field366;
            if (this.field539 / 256 > var2) {
                var2 = this.field539 / 256;
            }
            if (this.field154[4] && this.field211[4] + 128 > var2) {
                var2 = this.field211[4] + 128;
            }
            int var3 = this.field367 + this.field239 & 2047;
            this.method175(0, this.method57(this.field601, field331.field1453, this.field208, field331.field1454) - 50, this.field499, this.field498, var2 * 3 + 600, var3, var2);
            ++field246;
            if (field246 > 148) {
                field246 = 0;
                this.field553.method319(142, false);
                this.field553.method323(8419562);
            }
        }
        int var4;
        if (!this.field140) {
            var4 = this.method156(5);
        } else {
            var4 = this.method157(699);
        }
        int var5 = this.field332;
        int var6 = this.field333;
        int var7 = this.field334;
        int var8 = this.field335;
        int var9 = this.field336;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field154[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field272[var10] * 2 + 1) - (double) this.field272[var10] + Math.sin((double) this.field516[var10] / 100.0D * (double) this.field214[var10]) * (double) this.field211[var10]);
                if (var10 == 0) {
                    this.field332 += var12;
                }
                if (var10 == 1) {
                    this.field333 += var12;
                }
                if (var10 == 2) {
                    this.field334 += var12;
                }
                if (var10 == 3) {
                    this.field336 = this.field336 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field335 += var12;
                    if (this.field335 < 128) {
                        this.field335 = 128;
                    }
                    if (this.field335 > 383) {
                        this.field335 = 383;
                    }
                }
            }
        }
        int var11 = class71.field1715;
        class45.field1208 = true;
        class45.field1211 = 0;
        class45.field1209 = super.field1250 - 4;
        class45.field1210 = super.field1251 - 4;
        class12.method200(3);
        this.field394.method562(this.field335, 1, this.field332, this.field336, this.field334, var4, this.field333);
        this.field394.method537(false);
        this.method73((byte) -39);
        this.method72(false);
        this.method127((byte) -54, var11);
        if (arg0) {
            this.method152((byte) 2);
            this.field418.method25(-71, 4, super.field1242, 4);
            this.field332 = var5;
            this.field333 = var6;
            this.field334 = var7;
            this.field335 = var8;
            this.field336 = var9;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIILRRTTGXYM;IIII)V")
    public final void method117(byte arg0, int arg1, int arg2, int arg3, class52 arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field445) {
            this.field612 = 32;
        } else {
            this.field612 = 0;
        }
        this.field445 = false;
        if (arg0 != -45) {
            this.field260 = -49;
        }
        if (arg3 >= arg7 && arg3 < arg7 + 16 && arg5 >= arg8 && arg5 < arg8 + 16) {
            arg4.field1312 -= this.field254 * 4;
            if (arg6 == 1) {
                this.field316 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                this.field310 = true;
            }
        } else if (arg3 >= arg7 && arg3 < arg7 + 16 && arg5 >= arg1 + arg8 - 16 && arg5 < arg1 + arg8) {
            arg4.field1312 += this.field254 * 4;
            if (arg6 == 1) {
                this.field316 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                this.field310 = true;
            }
        } else if (arg3 >= arg7 - this.field612 && arg3 < arg7 + 16 + this.field612 && arg5 >= arg8 + 16 && arg5 < arg1 + arg8 - 16 && this.field254 > 0) {
            int var10 = (arg1 - 32) * arg1 / arg2;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg5 - arg8 - 16 - var10 / 2;
            int var12 = arg1 - 32 - var10;
            arg4.field1312 = (arg2 - arg1) * var11 / var12;
            if (arg6 == 1) {
                this.field316 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                this.field310 = true;
            }
            this.field445 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)I")
    public final int method118(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = 256 - arg3;
        this.field185 &= arg2;
        return ((arg0 & 16711935) * arg3 + (arg1 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg3 + (arg1 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method119(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field156 >= 100 && this.field338 != 1) {
                this.method191(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", (byte) -92);
            } else if (this.field156 >= 200) {
                this.method191(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", (byte) -92);
            } else {
                String var4 = class36.method304(-616, class36.method301((byte) 7, arg1));
                for (int var5 = 0; var5 < this.field156; ++var5) {
                    if (this.field298[var5] == arg1) {
                        this.method191(0, "", var4 + " is already on your friend list", (byte) -92);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field163; ++var6) {
                    if (this.field207[var6] == arg1) {
                        this.method191(0, "", "Please remove " + var4 + " from your ignore list first", (byte) -92);
                        return;
                    }
                }
                if (!var4.equals(field331.field1269)) {
                    this.field446[this.field156] = var4;
                    this.field298[this.field156] = arg1;
                    this.field322[this.field156] = 0;
                    ++this.field156;
                    this.field316 = true;
                    this.field553.method319(105, false);
                    this.field553.method326(-228, arg1);
                    if (arg0 != -46843) {
                        this.method61();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method120(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field287 = "";
                this.field288 = "Connecting to server...";
                this.method89(true, (byte) 4);
            }
            this.field292 = new class20((byte) 1, this.method133(field615 + 43594), this);
            long var4 = class36.method300(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field553.field1105 = 0;
            this.field553.method320(14);
            this.field553.method320(var6);
            this.field292.method229(0, this.field553.field1104, 2, 866);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field292.method226();
            }
            int var8 = this.field292.method226();
            int var9 = var8;
            if (var8 == 0) {
                this.field292.method228(this.field153.field1104, 0, 8);
                this.field153.field1105 = 0;
                this.field466 = this.field153.method336(7);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field466 >> 32), (int) this.field466 };
                this.field553.field1105 = 0;
                this.field553.method320(10);
                this.field553.method324(var10[0]);
                this.field553.method324(var10[1]);
                this.field553.method324(var10[2]);
                this.field553.method324(var10[3]);
                this.field553.method324(signlink.uid);
                this.field553.method327(arg0);
                this.field553.method327(arg1);
                this.field553.method345(field300, (byte) -83, field509);
                this.field311.field1105 = 0;
                if (arg2) {
                    this.field311.method320(18);
                } else {
                    this.field311.method320(16);
                }
                this.field311.method320(this.field553.field1105 + 36 + 1 + 1 + 2);
                this.field311.method320(255);
                this.field311.method321(340);
                this.field311.method320(field617 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field311.method324(this.field264[var11]);
                }
                this.field311.method328(this.field553.field1104, this.field553.field1105, 0, (byte) 8);
                this.field553.field1109 = new class29(var10, true);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field327 = new class29(var10, true);
                this.field292.method229(0, this.field311.field1104, this.field311.field1105, 866);
                var8 = this.field292.method226();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method120(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field493 = this.field292.method226();
                field538 = this.field292.method226() == 1;
                this.field309 = 0L;
                this.field578 = 0;
                this.field321.field1485 = 0;
                super.field1247 = true;
                this.field174 = true;
                this.field185 = true;
                this.field553.field1105 = 0;
                this.field153.field1105 = 0;
                this.field358 = -1;
                this.field201 = -1;
                this.field202 = -1;
                this.field203 = -1;
                this.field357 = 0;
                this.field359 = 0;
                this.field414 = 0;
                this.field361 = 0;
                this.field182 = 0;
                this.field392 = 0;
                this.field337 = false;
                super.field1248 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field220[var13] = null;
                }
                this.field395 = 0;
                this.field592 = 0;
                this.field149 = 0;
                this.field168 = 0;
                this.field233 = (int) (Math.random() * 100.0D) - 50;
                this.field209 = (int) (Math.random() * 110.0D) - 55;
                this.field239 = (int) (Math.random() * 80.0D) - 40;
                this.field265 = (int) (Math.random() * 120.0D) - 60;
                this.field318 = (int) (Math.random() * 30.0D) - 20;
                this.field367 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field526 = 0;
                this.field502 = -1;
                this.field541 = 0;
                this.field542 = 0;
                this.field453 = 0;
                this.field364 = 0;
                for (int var14 = 0; var14 < this.field450; ++var14) {
                    this.field452[var14] = null;
                    this.field457[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field363[var15] = null;
                }
                field331 = this.field452[this.field451] = new class48();
                this.field289.method514();
                this.field226.method514();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field330[var16][var17][var18] = null;
                        }
                    }
                }
                this.field215 = new class61(0);
                this.field157 = 0;
                this.field156 = 0;
                this.method194(-12, this.field518);
                this.field518 = -1;
                this.method194(-12, this.field339);
                this.field339 = -1;
                this.method194(-12, this.field375);
                this.field375 = -1;
                this.method194(-12, this.field255);
                this.field255 = -1;
                this.method194(-12, this.field537);
                this.field537 = -1;
                this.method194(-12, this.field515);
                this.field515 = -1;
                this.method194(-12, this.field161);
                this.field161 = -1;
                this.field222 = false;
                this.field293 = 3;
                this.field250 = 0;
                this.field337 = false;
                this.field164 = false;
                this.field478 = null;
                this.field378 = 0;
                this.field160 = -1;
                this.field570 = true;
                this.method90((byte) 75);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field555[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field574[var20] = null;
                    this.field575[var20] = false;
                }
                field354 = 0;
                field618 = 0;
                field380 = 0;
                field377 = 0;
                field557 = 0;
                field467 = 0;
                field296 = 0;
                field611 = 0;
                field610 = 0;
                field247 = 0;
                this.method87(false);
            } else if (var8 == 3) {
                this.field287 = "";
                this.field288 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field287 = "Your account has been disabled.";
                this.field288 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field287 = "Your account is already logged in.";
                this.field288 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field287 = "RuneScape has been updated!";
                this.field288 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field287 = "This world is full.";
                this.field288 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field287 = "Unable to connect.";
                this.field288 = "Login server offline.";
            } else if (var8 == 9) {
                this.field287 = "Login limit exceeded.";
                this.field288 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field287 = "Unable to connect.";
                this.field288 = "Bad session id.";
            } else if (var8 == 11) {
                this.field287 = "Login server rejected session.";
                this.field288 = "Please try again.";
            } else if (var8 == 12) {
                this.field287 = "You need a members account to login to this world.";
                this.field288 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field287 = "Could not complete login.";
                this.field288 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field287 = "The server is being updated.";
                this.field288 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field185 = true;
                this.field553.field1105 = 0;
                this.field153.field1105 = 0;
                this.field358 = -1;
                this.field201 = -1;
                this.field202 = -1;
                this.field203 = -1;
                this.field357 = 0;
                this.field359 = 0;
                this.field414 = 0;
                this.field392 = 0;
                this.field337 = false;
                this.field275 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field287 = "Login attempts exceeded.";
                this.field288 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field287 = "You are standing in a members-only area.";
                this.field288 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field287 = "Invalid loginserver requested";
                this.field288 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field287 = "Malformed login packet.";
                    this.field288 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field223 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field223;
                            this.method120(arg0, arg1, arg2);
                        } else {
                            this.field287 = "No response from loginserver";
                            this.field288 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field287 = "No response from server";
                        this.field288 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field287 = "Unexpected server response";
                    this.field288 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field292.method226();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field287 = "You have only just left another world";
                    this.field288 = "Your profile will be transferred in: " + var26;
                    this.method89(true, (byte) 4);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method120(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field287 = "";
            this.field288 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        if (arg0) {
            this.field430 = this.field327.method276();
        }
        for (int var2 = 0; var2 < this.field168; ++var2) {
            if (this.field585[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field200[var2] == this.field491 && this.field532[var2] == this.field350) {
                        if (!this.method62(-1384)) {
                            var3 = true;
                        }
                    } else {
                        class43 var4 = class38.method307(this.field532[var2], this.field238, this.field200[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1105 / 22) > (long) (this.field507 / 22) + this.field458) {
                            this.field507 = var4.field1105;
                            this.field458 = System.currentTimeMillis();
                            if (this.method97((byte) 7, var4.field1104, var4.field1105)) {
                                this.field491 = this.field200[var2];
                                this.field350 = this.field532[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field585[var2] != -5) {
                    this.field585[var2] = -5;
                } else {
                    --this.field168;
                    for (int var6 = var2; var6 < this.field168; ++var6) {
                        this.field200[var6] = this.field200[var6 + 1];
                        this.field532[var6] = this.field532[var6 + 1];
                        this.field585[var6] = this.field585[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field585[var2]--;
            }
        }
        ++field315;
        if (field315 > 60) {
            field315 = 0;
            this.field553.method319(101, false);
        }
        if (this.field573 > 0) {
            this.field573 -= 20;
            if (this.field573 < 0) {
                this.field573 = 0;
            }
            if (this.field573 == 0 && this.field382 && !field617) {
                this.field290 = this.field353;
                this.field291 = true;
                this.field270.method265(2, this.field290);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method122(int arg0, byte arg1, int arg2) {
        if (arg1 == 9) {
            boolean var3 = false;
            int var4 = arg2 - arg0;
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
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        try {
            if (this.field292 != null) {
                this.field292.method225();
            }
        } catch (Exception var3) {
        }
        this.field292 = null;
        this.field185 = false;
        this.field285 = 0;
        this.field141 = "";
        this.field142 = "";
        if (!arg0) {
            this.field330 = null;
        }
        this.method150((byte) 5);
        this.field394.method523(true);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field248[var2].method480();
        }
        System.gc();
        this.method65(true);
        this.field353 = -1;
        this.field290 = -1;
        this.field573 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method124(String arg0, int arg1, String arg2) {
        if (arg1 < 0) {
            if (this.field418 != null) {
                this.field418.method24(-214);
                class71.field1706 = this.field244;
                int var4 = 151;
                if (arg2 != null) {
                    var4 -= 7;
                }
                this.field521.method9(var4, 257, arg0, 0, false);
                this.field521.method9(var4 - 1, 256, arg0, 16777215, false);
                var4 += 15;
                if (arg2 != null) {
                    this.field521.method9(var4, 257, arg2, 0, false);
                    this.field521.method9(var4 - 1, 256, arg2, 16777215, false);
                }
                this.field418.method25(-71, 4, super.field1242, 4);
            } else if (super.field1243 != null) {
                super.field1243.method24(-214);
                class71.field1706 = this.field245;
                int var5 = 251;
                short var6 = 300;
                byte var7 = 50;
                class12.method202(0, 383 - var6 / 2, var6, 8, var5 - 5 - var7 / 2, var7);
                class12.method203(var5 - 5 - var7 / 2, var7, 16777215, 383 - var6 / 2, true, var6);
                if (arg2 != null) {
                    var5 -= 7;
                }
                this.field521.method9(var5, 383, arg0, 0, false);
                this.field521.method9(var5 - 1, 382, arg0, 16777215, false);
                var5 += 15;
                if (arg2 != null) {
                    this.field521.method9(var5, 383, arg2, 0, false);
                    this.field521.method9(var5 - 1, 382, arg2, 16777215, false);
                }
                super.field1243.method25(-71, 0, super.field1242, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method125(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field250 != 0) {
                this.field250 = 0;
                this.field310 = true;
            }
            int var3 = this.field588[arg1];
            int var4 = this.field589[arg1];
            int var5 = this.field590[arg1];
            int var6 = this.field591[arg1];
            int var7 = 25 / arg0;
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 396) {
                boolean var8 = this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 0, 0, 0, 0, var3, 3, var4);
                if (!var8) {
                    this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var3, 3, var4);
                }
                this.field503 = super.field1257;
                this.field504 = super.field1258;
                this.field506 = 2;
                this.field505 = 0;
                this.field553.method319(107, false);
                this.field553.method354(-838, this.field228 + var3);
                this.field553.method354(-838, var6);
                this.field553.method354(-838, this.field229 + var4);
            }
            if (var5 == 901) {
                this.field395 = 1;
                this.field396 = var3;
                this.field397 = var4;
                this.field398 = var6;
                this.field399 = class21.method236(var6).field809;
                this.field592 = 0;
                this.field316 = true;
            } else {
                if (var5 == 954) {
                    class42 var10 = this.field363[var6];
                    if (var10 != null) {
                        this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var10.field1416[0], 3, var10.field1417[0]);
                        this.field503 = super.field1257;
                        this.field504 = super.field1258;
                        this.field506 = 2;
                        this.field505 = 0;
                        this.field553.method319(171, false);
                        this.field553.method321(var6);
                        this.field553.method321(this.field593);
                    }
                }
                if (var5 == 877) {
                    this.field553.method319(75, false);
                    this.field553.method321(var4);
                    class52 var11 = class52.method458(var4);
                    if (var11.field1341 != null && var11.field1341[0][0] == 5) {
                        int var12 = var11.field1341[0][1];
                        this.field188[var12] = 1 - this.field188[var12];
                        this.method105(var12, 49157);
                        this.field316 = true;
                    }
                }
                if (var5 == 836) {
                    class52 var13 = class52.method458(var4);
                    boolean var14 = true;
                    if (var13.field1347 > 0) {
                        var14 = this.method149(var13, 0);
                    }
                    if (var14) {
                        this.field553.method319(75, false);
                        this.field553.method321(var4);
                    }
                }
                if (var5 == 556) {
                    String var15 = this.field379[arg1];
                    int var16 = var15.indexOf("@whi@");
                    if (var16 != -1) {
                        if (this.field375 == -1) {
                            this.method103(false);
                            this.field186 = var15.substring(var16 + 5).trim();
                            this.field152 = false;
                            this.field329 = this.field375 = class52.field1362;
                        } else {
                            this.method191(0, "", "Please close the interface you have open before using 'report abuse'", (byte) -92);
                        }
                    }
                }
                if (var5 == 856 && !this.field222) {
                    this.field553.method319(202, false);
                    this.field553.method321(var4);
                    this.field222 = true;
                }
                if (var5 == 991) {
                    this.method103(false);
                }
                if (var5 == 204) {
                    field380 += var3;
                    if (field380 >= 146) {
                        this.field553.method319(28, false);
                        field380 = 0;
                    }
                    this.field553.method319(238, false);
                    this.field553.method354(-838, var4);
                    this.field553.method355((byte) 0, var6);
                    this.field553.method356(var3, 35793);
                    this.field510 = 0;
                    this.field511 = var4;
                    this.field512 = var3;
                    this.field513 = 2;
                    if (class52.method458(var4).field1321 == this.field375) {
                        this.field513 = 1;
                    }
                    if (class52.method458(var4).field1321 == this.field339) {
                        this.field513 = 3;
                    }
                }
                if (var5 == 743) {
                    this.method71(false, var4, var3, var6);
                    this.field553.method319(43, false);
                    this.field553.method321(this.field228 + var3);
                    this.field553.method356(var6 >> 14 & 32767, 35793);
                    this.field553.method354(-838, this.field229 + var4);
                }
                if (var5 == 924) {
                    class52 var17 = class52.method458(var4);
                    this.field592 = 1;
                    this.field593 = var4;
                    this.field594 = var17.field1345;
                    this.field395 = 0;
                    this.field316 = true;
                    String var18 = var17.field1374;
                    if (var18.indexOf(" ") != -1) {
                        var18 = var18.substring(0, var18.indexOf(" "));
                    }
                    String var19 = var17.field1374;
                    if (var19.indexOf(" ") != -1) {
                        var19 = var19.substring(var19.indexOf(" ") + 1);
                    }
                    this.field595 = var18 + " " + var17.field1335 + " " + var19;
                    if (this.field594 == 16) {
                        this.field316 = true;
                        this.field293 = 3;
                        this.field423 = true;
                    }
                } else {
                    if (var5 == 529) {
                        this.field553.method319(75, false);
                        this.field553.method321(var4);
                        class52 var20 = class52.method458(var4);
                        if (var20.field1341 != null && var20.field1341[0][0] == 5) {
                            int var21 = var20.field1341[0][1];
                            if (this.field188[var21] != var20.field1364[0]) {
                                this.field188[var21] = var20.field1364[0];
                                this.method105(var21, 49157);
                                this.field316 = true;
                            }
                        }
                    }
                    if (var5 == 855) {
                        boolean var22 = this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 0, 0, 0, 0, var3, 3, var4);
                        if (!var22) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var3, 3, var4);
                        }
                        this.field503 = super.field1257;
                        this.field504 = super.field1258;
                        this.field506 = 2;
                        this.field505 = 0;
                        this.field553.method319(230, false);
                        this.field553.method354(-838, this.field229 + var4);
                        this.field553.method356(this.field593, 35793);
                        this.field553.method321(var6);
                        this.field553.method321(this.field228 + var3);
                    }
                    if (var5 == 830) {
                        class48 var24 = this.field452[var6];
                        if (var24 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var24.field1416[0], 3, var24.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(204, false);
                            this.field553.method355((byte) 0, var6);
                        }
                    }
                    if (var5 == 104) {
                        this.field553.method319(44, false);
                        this.field553.method321(var4);
                        this.field553.method321(var3);
                        this.field553.method356(this.field593, 35793);
                        this.field553.method355((byte) 0, var6);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 537) {
                        class48 var25 = this.field452[var6];
                        if (var25 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var25.field1416[0], 3, var25.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(8, false);
                            this.field553.method321(this.field593);
                            this.field553.method355((byte) 0, var6);
                        }
                    }
                    if (var5 == 695 || var5 == 913 || var5 == 864 || var5 == 736) {
                        String var26 = this.field379[arg1];
                        int var27 = var26.indexOf("@whi@");
                        if (var27 != -1) {
                            long var28 = class36.method300(var26.substring(var27 + 5).trim());
                            if (var5 == 695) {
                                this.method119(-46843, var28);
                            }
                            if (var5 == 913) {
                                this.method126(var28, -29826);
                            }
                            if (var5 == 864) {
                                this.method179(8, var28);
                            }
                            if (var5 == 736) {
                                this.method159(var28, this.field176);
                            }
                        }
                    }
                    if (var5 == 481) {
                        class48 var30 = this.field452[var6];
                        if (var30 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var30.field1416[0], 3, var30.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(108, false);
                            this.field553.method355((byte) 0, var6);
                        }
                    }
                    if (var5 == 1545) {
                        ++field354;
                        if (field354 >= 139) {
                            this.field553.method319(206, false);
                            this.field553.method321(52426);
                            field354 = 0;
                        }
                        this.method71(false, var4, var3, var6);
                        this.field553.method319(172, false);
                        this.field553.method354(-838, this.field229 + var4);
                        this.field553.method355((byte) 0, var6 >> 14 & 32767);
                        this.field553.method321(this.field228 + var3);
                    }
                    if (var5 == 99) {
                        this.field553.method319(191, false);
                        this.field553.method355((byte) 0, var6);
                        this.field553.method354(-838, var3);
                        this.field553.method321(var4);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 74) {
                        this.method71(false, var4, var3, var6);
                        this.field553.method319(133, false);
                        this.field553.method355((byte) 0, this.field229 + var4);
                        this.field553.method354(-838, this.field228 + var3);
                        this.field553.method354(-838, var6 >> 14 & 32767);
                    }
                    if (var5 == 1642) {
                        class21 var31 = class21.method236(var6);
                        String var32;
                        if (var31.field857 != null) {
                            var32 = new String(var31.field857);
                        } else {
                            var32 = "It's a " + var31.field809 + ".";
                        }
                        this.method191(0, "", var32, (byte) -92);
                    }
                    if (var5 == 92) {
                        this.field553.method319(42, false);
                        this.field553.method321(var6);
                        this.field553.method355((byte) 0, var4);
                        this.field553.method356(var3, 35793);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 773) {
                        class42 var33 = this.field363[var6];
                        if (var33 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var33.field1416[0], 3, var33.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            if ((var6 & 3) == 0) {
                                ++field467;
                            }
                            if (field467 >= 113) {
                                this.field553.method319(193, false);
                                this.field553.method320(61);
                                field467 = 0;
                            }
                            this.field553.method319(254, false);
                            this.field553.method354(-838, var6);
                        }
                    }
                    if (var5 == 1630) {
                        class21 var34 = class21.method236(var6);
                        class52 var35 = class52.method458(var4);
                        String var36;
                        if (var35 != null && var35.field1383[var3] >= 100000) {
                            var36 = var35.field1383[var3] + " x " + var34.field809;
                        } else if (var34.field857 != null) {
                            var36 = new String(var34.field857);
                        } else {
                            var36 = "It's a " + var34.field809 + ".";
                        }
                        this.method191(0, "", var36, (byte) -92);
                    }
                    if (var5 == 684) {
                        this.method194(-12, this.field518);
                        this.field518 = -1;
                        this.field310 = true;
                    }
                    if (var5 == 1825) {
                        class42 var37 = this.field363[var6];
                        if (var37 != null) {
                            class70 var38 = var37.field1082;
                            if (var38.field1659 != null) {
                                var38 = var38.method576(29839);
                            }
                            if (var38 != null) {
                                String var39;
                                if (var38.field1679 != null) {
                                    var39 = new String(var38.field1679);
                                } else {
                                    var39 = "It's a " + var38.field1666 + ".";
                                }
                                this.method191(0, "", var39, (byte) -92);
                            }
                        }
                    }
                    if (var5 == 611 && this.method71(false, var4, var3, var6)) {
                        this.field553.method319(177, false);
                        this.field553.method356(this.field228 + var3, 35793);
                        this.field553.method356(this.field397, 35793);
                        this.field553.method321(var6 >> 14 & 32767);
                        this.field553.method356(this.field398, 35793);
                        this.field553.method354(-838, this.field396);
                        this.field553.method355((byte) 0, this.field229 + var4);
                    }
                    if (var5 == 982) {
                        field618 += var4;
                        if (field618 >= 137) {
                            this.field553.method319(181, false);
                            this.field553.method321(27064);
                            field618 = 0;
                        }
                        this.method71(false, var4, var3, var6);
                        this.field553.method319(126, false);
                        this.field553.method321(this.field228 + var3);
                        this.field553.method321(var6 >> 14 & 32767);
                        this.field553.method355((byte) 0, this.field229 + var4);
                    }
                    if (var5 == 840) {
                        this.field553.method319(249, false);
                        this.field553.method321(var4);
                        this.field553.method321(var6);
                        this.field553.method321(var3);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 517) {
                        class48 var40 = this.field452[var6];
                        if (var40 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var40.field1416[0], 3, var40.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(18, false);
                            this.field553.method356(this.field397, 35793);
                            this.field553.method354(-838, this.field398);
                            this.field553.method356(var6, 35793);
                            this.field553.method354(-838, this.field396);
                        }
                    }
                    if (var5 == 838) {
                        boolean var41 = this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 0, 0, 0, 0, var3, 3, var4);
                        if (!var41) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var3, 3, var4);
                        }
                        this.field503 = super.field1257;
                        this.field504 = super.field1258;
                        this.field506 = 2;
                        this.field505 = 0;
                        this.field553.method319(162, false);
                        this.field553.method321(this.field229 + var4);
                        this.field553.method355((byte) 0, var6);
                        this.field553.method355((byte) 0, this.field228 + var3);
                    }
                    if (var5 == 775) {
                        boolean var43 = this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 0, 0, 0, 0, var3, 3, var4);
                        if (!var43) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var3, 3, var4);
                        }
                        this.field503 = super.field1257;
                        this.field504 = super.field1258;
                        this.field506 = 2;
                        this.field505 = 0;
                        this.field553.method319(60, false);
                        this.field553.method355((byte) 0, this.field229 + var4);
                        this.field553.method354(-838, var6);
                        this.field553.method354(-838, this.field228 + var3);
                    }
                    if (var5 == 300) {
                        this.field553.method319(241, false);
                        this.field553.method355((byte) 0, var6);
                        this.field553.method356(var4, 35793);
                        this.field553.method356(var3, 35793);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 124) {
                        if (!this.field337) {
                            this.field394.method561(-49480, super.field1258 - 4, super.field1257 - 4);
                        } else {
                            this.field394.method561(-49480, var4 - 4, var3 - 4);
                        }
                    }
                    if (var5 == 849) {
                        this.field553.method319(229, false);
                        this.field553.method356(var4, 35793);
                        this.field553.method321(var3);
                        this.field553.method356(var6, 35793);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 738) {
                        class48 var45 = this.field452[var6];
                        if (var45 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var45.field1416[0], 3, var45.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(51, false);
                            this.field553.method355((byte) 0, var6);
                        }
                    }
                    if (var5 == 167) {
                        boolean var46 = this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 0, 0, 0, 0, var3, 3, var4);
                        if (!var46) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var3, 3, var4);
                        }
                        this.field503 = super.field1257;
                        this.field504 = super.field1258;
                        this.field506 = 2;
                        this.field505 = 0;
                        ++field610;
                        if (field610 >= 142) {
                            this.field553.method319(5, false);
                            field610 = 0;
                        }
                        this.field553.method319(146, false);
                        this.field553.method321(this.field229 + var4);
                        this.field553.method321(this.field228 + var3);
                        this.field553.method356(var6, 35793);
                    }
                    if (var5 == 117 || var5 == 264) {
                        String var48 = this.field379[arg1];
                        int var49 = var48.indexOf("@whi@");
                        if (var49 != -1) {
                            String var50 = var48.substring(var49 + 5).trim();
                            String var51 = class36.method304(-616, class36.method301((byte) 7, class36.method300(var50)));
                            boolean var52 = false;
                            for (int var53 = 0; var53 < this.field453; ++var53) {
                                class48 var54 = this.field452[this.field454[var53]];
                                if (var54 != null && var54.field1269 != null && var54.field1269.equalsIgnoreCase(var51)) {
                                    this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var54.field1416[0], 3, var54.field1417[0]);
                                    if (var5 == 117) {
                                        this.field553.method319(204, false);
                                        this.field553.method355((byte) 0, this.field454[var53]);
                                    }
                                    if (var5 == 264) {
                                        this.field553.method319(82, false);
                                        this.field553.method356(this.field454[var53], 35793);
                                    }
                                    var52 = true;
                                    break;
                                }
                            }
                            if (!var52) {
                                this.method191(0, "", "Unable to find " + var51, (byte) -92);
                            }
                        }
                    }
                    if (var5 == 713) {
                        String var55 = this.field379[arg1];
                        int var56 = var55.indexOf("@whi@");
                        if (var56 != -1) {
                            long var57 = class36.method300(var55.substring(var56 + 5).trim());
                            int var59 = -1;
                            for (int var60 = 0; var60 < this.field156; ++var60) {
                                if (this.field298[var60] == var57) {
                                    var59 = var60;
                                    break;
                                }
                            }
                            if (var59 != -1 && this.field322[var59] > 0) {
                                this.field310 = true;
                                this.field250 = 0;
                                this.field164 = true;
                                this.field429 = "";
                                this.field508 = 3;
                                this.field584 = this.field298[var59];
                                this.field390 = "Enter message to send to " + this.field446[var59];
                            }
                        }
                    }
                    if (var5 == 994) {
                        class42 var61 = this.field363[var6];
                        if (var61 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var61.field1416[0], 3, var61.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(80, false);
                            this.field553.method355((byte) 0, var6);
                        }
                    }
                    if (var5 == 341) {
                        boolean var62 = this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 0, 0, 0, 0, var3, 3, var4);
                        if (!var62) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var3, 3, var4);
                        }
                        this.field503 = super.field1257;
                        this.field504 = super.field1258;
                        this.field506 = 2;
                        this.field505 = 0;
                        this.field553.method319(20, false);
                        this.field553.method354(-838, var6);
                        this.field553.method355((byte) 0, this.field229 + var4);
                        this.field553.method355((byte) 0, this.field398);
                        this.field553.method356(this.field397, 35793);
                        this.field553.method321(this.field396);
                        this.field553.method356(this.field228 + var3, 35793);
                    }
                    if (var5 == 357) {
                        this.field553.method319(50, false);
                        this.field553.method355((byte) 0, var3);
                        this.field553.method321(var4);
                        this.field553.method356(var6, 35793);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 600) {
                        field296 += var3;
                        if (field296 >= 55) {
                            this.field553.method319(122, false);
                            this.field553.method324(0);
                            field296 = 0;
                        }
                        this.field553.method319(168, false);
                        this.field553.method321(var3);
                        this.field553.method356(var4, 35793);
                        this.field553.method354(-838, var6);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 234 && this.method71(false, var4, var3, var6)) {
                        this.field553.method319(179, false);
                        this.field553.method356(var6 >> 14 & 32767, 35793);
                        this.field553.method321(this.field228 + var3);
                        this.field553.method356(this.field229 + var4, 35793);
                        this.field553.method321(this.field593);
                    }
                    if (var5 == 194) {
                        field377 += var3;
                        if (field377 >= 51) {
                            this.field553.method319(234, false);
                            this.field553.method321(61426);
                            field377 = 0;
                        }
                        this.field553.method319(10, false);
                        this.field553.method321(var6);
                        this.field553.method355((byte) 0, var3);
                        this.field553.method321(var4);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 125) {
                        this.method71(false, var4, var3, var6);
                        this.field553.method319(22, false);
                        this.field553.method321(var6 >> 14 & 32767);
                        this.field553.method355((byte) 0, this.field228 + var3);
                        this.field553.method354(-838, this.field229 + var4);
                    }
                    if (var5 == 486) {
                        this.field553.method319(118, false);
                        this.field553.method355((byte) 0, this.field398);
                        this.field553.method354(-838, var6);
                        this.field553.method355((byte) 0, this.field396);
                        this.field553.method356(var3, 35793);
                        this.field553.method355((byte) 0, this.field397);
                        this.field553.method355((byte) 0, var4);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 771) {
                        class48 var64 = this.field452[var6];
                        if (var64 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var64.field1416[0], 3, var64.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(125, false);
                            this.field553.method356(var6, 35793);
                        }
                    }
                    if (var5 == 196) {
                        class42 var65 = this.field363[var6];
                        if (var65 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var65.field1416[0], 3, var65.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(215, false);
                            this.field553.method356(var6, 35793);
                        }
                    }
                    if (var5 == 597) {
                        class42 var66 = this.field363[var6];
                        if (var66 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var66.field1416[0], 3, var66.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            if ((var6 & 3) == 0) {
                                ++field611;
                            }
                            if (field611 >= 123) {
                                this.field553.method319(84, false);
                                this.field553.method321(10442);
                                field611 = 0;
                            }
                            this.field553.method319(24, false);
                            this.field553.method356(var6, 35793);
                        }
                    }
                    if (var5 == 992) {
                        class42 var67 = this.field363[var6];
                        if (var67 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var67.field1416[0], 3, var67.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(121, false);
                            this.field553.method356(this.field396, 35793);
                            this.field553.method354(-838, this.field398);
                            this.field553.method355((byte) 0, this.field397);
                            this.field553.method355((byte) 0, var6);
                        }
                    }
                    if (var5 == 371) {
                        this.field553.method319(68, false);
                        this.field553.method321(var4);
                        this.field553.method354(-838, var6);
                        this.field553.method354(-838, var3);
                        this.field510 = 0;
                        this.field511 = var4;
                        this.field512 = var3;
                        this.field513 = 2;
                        if (class52.method458(var4).field1321 == this.field375) {
                            this.field513 = 1;
                        }
                        if (class52.method458(var4).field1321 == this.field339) {
                            this.field513 = 3;
                        }
                    }
                    if (var5 == 1634) {
                        int var68 = var6 >> 14 & 32767;
                        class33 var69 = class33.method290(var68);
                        String var70;
                        if (var69.field1024 != null) {
                            var70 = new String(var69.field1024);
                        } else {
                            var70 = "It's a " + var69.field1016 + ".";
                        }
                        this.method191(0, "", var70, (byte) -92);
                    }
                    if (var5 == 893) {
                        boolean var71 = this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 0, 0, 0, 0, var3, 3, var4);
                        if (!var71) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var3, 3, var4);
                        }
                        this.field503 = super.field1257;
                        this.field504 = super.field1258;
                        this.field506 = 2;
                        this.field505 = 0;
                        this.field553.method319(27, false);
                        this.field553.method356(this.field229 + var4, 35793);
                        this.field553.method355((byte) 0, this.field228 + var3);
                        this.field553.method354(-838, var6);
                    }
                    if (var5 == 41) {
                        class48 var73 = this.field452[var6];
                        if (var73 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var73.field1416[0], 3, var73.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            this.field553.method319(82, false);
                            this.field553.method356(var6, 35793);
                        }
                    }
                    if (var5 == 218) {
                        class42 var74 = this.field363[var6];
                        if (var74 != null) {
                            this.method49(field331.field1417[0], field331.field1416[0], 0, 2, false, 1, 1, 0, 0, var74.field1416[0], 3, var74.field1417[0]);
                            this.field503 = super.field1257;
                            this.field504 = super.field1258;
                            this.field506 = 2;
                            this.field505 = 0;
                            if ((var6 & 3) == 0) {
                                ++field557;
                            }
                            if (field557 >= 147) {
                                this.field553.method319(89, false);
                                this.field553.method323(9802132);
                                field557 = 0;
                            }
                            this.field553.method319(173, false);
                            this.field553.method356(var6, 35793);
                        }
                    }
                    this.field395 = 0;
                    this.field592 = 0;
                    this.field316 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method126(long arg0, int arg1) {
        if (this.field420 != arg1) {
            this.method61();
        }
        if (arg0 != 0L) {
            if (this.field163 >= 100) {
                this.method191(0, "", "Your ignore list is full. Max of 100 hit", (byte) -92);
            } else {
                String var4 = class36.method304(-616, class36.method301((byte) 7, arg0));
                for (int var5 = 0; var5 < this.field163; ++var5) {
                    if (this.field207[var5] == arg0) {
                        this.method191(0, "", var4 + " is already on your ignore list", (byte) -92);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field156; ++var6) {
                    if (this.field298[var6] == arg0) {
                        this.method191(0, "", "Please remove " + var4 + " from your friend list first", (byte) -92);
                        return;
                    }
                }
                this.field207[this.field163++] = arg0;
                this.field316 = true;
                this.field553.method319(218, false);
                this.field553.method326(-228, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method127(byte arg0, int arg1) {
        if (arg0 == -54) {
            if (!field617) {
                for (int var3 = 0; var3 < this.field162.length; ++var3) {
                    int var4 = this.field162[var3];
                    if (class71.field1714[var4] >= arg1) {
                        class53 var5 = class71.field1708[var4];
                        int var6 = var5.field1396 * var5.field1395 - 1;
                        int var7 = this.field267 * var5.field1395 * 2;
                        byte[] var8 = var5.field1393;
                        byte[] var9 = this.field494;
                        for (int var10 = 0; var10 <= var6; ++var10) {
                            var9[var10] = var8[var10 - var7 & var6];
                        }
                        var5.field1393 = var9;
                        this.field494 = var8;
                        class71.method591(false, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(Z)V")
    public final void method128(boolean arg0) {
        if (!arg0) {
            this.field358 = this.field153.method330();
        }
        for (int var2 = -1; var2 < this.field453; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field451;
            } else {
                var3 = this.field454[var2];
            }
            class48 var4 = this.field452[var3];
            if (var4 != null) {
                this.method108(313, 1, var4);
            }
        }
        ++field253;
        if (field253 > 194) {
            field253 = 0;
            this.field553.method319(94, false);
            this.field553.method321(10697);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LPKHWFJLM;II)V")
    public final void method129(class43 arg0, int arg1, int arg2) {
        if (arg2 != 23254) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1 == 33) {
            int var5 = arg0.method332();
            int var6 = arg0.method350((byte) 40);
            int var7 = (var6 >> 4 & 7) + this.field166;
            int var8 = (var6 & 7) + this.field167;
            int var9 = arg0.method332();
            int var10 = arg0.method359(2);
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && this.field431 != var5) {
                class30 var11 = new class30();
                var11.field974 = var9;
                var11.field973 = var10;
                if (this.field330[this.field601][var7][var8] == null) {
                    this.field330[this.field601][var7][var8] = new class61(0);
                }
                this.field330[this.field601][var7][var8].method507(var11);
                this.method171(var7, var8);
            }
        } else if (arg1 == 205) {
            int var12 = arg0.method350((byte) 40);
            int var13 = (var12 >> 4 & 7) + this.field166;
            int var14 = (var12 & 7) + this.field167;
            int var15 = arg0.method359(2);
            int var16 = arg0.method350((byte) 40);
            int var17 = var16 >> 2;
            int var18 = var16 & 3;
            int var19 = this.field190[var17];
            if (var13 >= 0 && var14 >= 0 && var13 < 103 && var14 < 103) {
                int var20 = this.field433[this.field601][var13][var14];
                int var21 = this.field433[this.field601][var13 + 1][var14];
                int var22 = this.field433[this.field601][var13 + 1][var14 + 1];
                int var23 = this.field433[this.field601][var13][var14 + 1];
                if (var19 == 0) {
                    class1 var24 = this.field394.method545(var13, this.field601, 0, var14);
                    if (var24 != null) {
                        int var25 = var24.field8 >> 14 & 32767;
                        if (var17 == 2) {
                            var24.field6 = new class54(var25, var18 + 4, false, var22, 9, var20, var21, 2, var23, var15);
                            var24.field7 = new class54(var25, var18 + 1 & 3, false, var22, 9, var20, var21, 2, var23, var15);
                        } else {
                            var24.field6 = new class54(var25, var18, false, var22, 9, var20, var21, var17, var23, var15);
                        }
                    }
                }
                if (var19 == 1) {
                    class64 var26 = this.field394.method546(this.field601, 2, var14, var13);
                    if (var26 != null) {
                        var26.field1535 = new class54(var26.field1536 >> 14 & 32767, 0, false, var22, 9, var20, var21, 4, var23, var15);
                    }
                }
                if (var19 == 2) {
                    class65 var27 = this.field394.method547(this.field601, var13, 4, var14);
                    if (var17 == 11) {
                        var17 = 10;
                    }
                    if (var27 != null) {
                        var27.field1542 = new class54(var27.field1550 >> 14 & 32767, var18, false, var22, 9, var20, var21, var17, var23, var15);
                    }
                }
                if (var19 == 3) {
                    class18 var28 = this.field394.method548(var14, this.field601, -965, var13);
                    if (var28 != null) {
                        var28.field766 = new class54(var28.field767 >> 14 & 32767, var18, false, var22, 9, var20, var21, 22, var23, var15);
                    }
                }
            }
        } else {
            if (arg1 == 88) {
                byte var29 = arg0.method352(-418);
                byte var30 = arg0.method331();
                byte var31 = arg0.method331();
                int var32 = arg0.method332();
                int var33 = arg0.method330();
                int var34 = (var33 >> 4 & 7) + this.field166;
                int var35 = (var33 & 7) + this.field167;
                int var36 = arg0.method359(2);
                int var37 = arg0.method359(2);
                byte var38 = arg0.method353((byte) -56);
                int var39 = arg0.method349((byte) 7);
                int var40 = var39 >> 2;
                int var41 = var39 & 3;
                int var42 = this.field190[var40];
                int var43 = arg0.method332();
                class48 var44;
                if (this.field431 == var32) {
                    var44 = field331;
                } else {
                    var44 = this.field452[var32];
                }
                if (var44 != null) {
                    class33 var45 = class33.method290(var37);
                    int var46 = this.field433[this.field601][var34][var35];
                    int var47 = this.field433[this.field601][var34 + 1][var35];
                    int var48 = this.field433[this.field601][var34 + 1][var35 + 1];
                    int var49 = this.field433[this.field601][var34][var35 + 1];
                    class45 var50 = var45.method295(var40, var41, var46, var47, var48, var49, -1);
                    if (var50 != null) {
                        this.method154(var42, var35, false, var36 + 1, 0, var34, var43 + 1, this.field601, -1, 0);
                        var44.field1265 = field525 + var36;
                        var44.field1266 = field525 + var43;
                        var44.field1287 = var50;
                        int var51 = var45.field1001;
                        int var52 = var45.field993;
                        if (var41 == 1 || var41 == 3) {
                            var51 = var45.field993;
                            var52 = var45.field1001;
                        }
                        var44.field1284 = var34 * 128 + var51 * 64;
                        var44.field1286 = var35 * 128 + var52 * 64;
                        var44.field1285 = this.method57(this.field601, var44.field1284, this.field208, var44.field1286);
                        if (var38 > var30) {
                            byte var53 = var38;
                            var38 = var30;
                            var30 = var53;
                        }
                        if (var29 > var31) {
                            byte var54 = var29;
                            var29 = var31;
                            var31 = var54;
                        }
                        var44.field1277 = var34 + var38;
                        var44.field1279 = var30 + var34;
                        var44.field1278 = var29 + var35;
                        var44.field1280 = var31 + var35;
                    }
                }
            }
            if (arg1 == 140) {
                int var55 = arg0.method350((byte) 40);
                int var56 = (var55 >> 4 & 7) + this.field166;
                int var57 = (var55 & 7) + this.field167;
                int var58 = arg0.method351(0);
                int var59 = var58 >> 2;
                int var60 = var58 & 3;
                int var61 = this.field190[var59];
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                    this.method154(var61, var57, false, 0, var59, var56, -1, this.field601, -1, var60);
                }
            } else if (arg1 == 7) {
                int var62 = arg0.method350((byte) 40);
                int var63 = (var62 >> 4 & 7) + this.field166;
                int var64 = (var62 & 7) + this.field167;
                int var65 = arg0.method358((byte) 5);
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    class61 var66 = this.field330[this.field601][var63][var64];
                    if (var66 != null) {
                        for (class30 var67 = (class30) var66.method510(); var67 != null; var67 = (class30) var66.method512(false)) {
                            if ((var65 & 32767) == var67.field974) {
                                var67.method254();
                                break;
                            }
                        }
                        if (var66.method510() == null) {
                            this.field330[this.field601][var63][var64] = null;
                        }
                        this.method171(var63, var64);
                    }
                }
            } else if (arg1 == 224) {
                int var68 = arg0.method330();
                int var69 = (var68 >> 4 & 7) + this.field166;
                int var70 = (var68 & 7) + this.field167;
                int var71 = var69 + arg0.method331();
                int var72 = var70 + arg0.method331();
                int var73 = arg0.method333();
                int var74 = arg0.method332();
                int var75 = arg0.method330() * 4;
                int var76 = arg0.method330() * 4;
                int var77 = arg0.method332();
                int var78 = arg0.method332();
                int var79 = arg0.method330();
                int var80 = arg0.method330();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var74 != 65535) {
                    int var81 = var69 * 128 + 64;
                    int var82 = var70 * 128 + 64;
                    int var83 = var71 * 128 + 64;
                    int var84 = var72 * 128 + 64;
                    class26 var85 = new class26(var82, var79, var76, this.method57(this.field601, var81, this.field208, var82) - var75, var81, var80, field525 + var77, var74, true, this.field601, var73, field525 + var78);
                    var85.method253(var83, (byte) -51, var84, field525 + var77, this.method57(this.field601, var83, this.field208, var84) - var76);
                    this.field289.method507(var85);
                }
            } else if (arg1 != 154) {
                if (arg1 == 116) {
                    int var94 = arg0.method330();
                    int var95 = (var94 >> 4 & 7) + this.field166;
                    int var96 = (var94 & 7) + this.field167;
                    int var97 = arg0.method332();
                    int var98 = arg0.method330();
                    int var99 = var98 >> 4 & 15;
                    int var100 = var98 & 7;
                    if (field331.field1416[0] >= var95 - var99 && field331.field1416[0] <= var95 + var99 && field331.field1417[0] >= var96 - var99 && field331.field1417[0] <= var96 + var99 && this.field534 && !field617 && this.field168 < 50) {
                        this.field200[this.field168] = var97;
                        this.field532[this.field168] = var100;
                        this.field585[this.field168] = class38.field1054[var97];
                        ++this.field168;
                    }
                }
                if (arg1 == 145) {
                    int var101 = arg0.method332();
                    int var102 = arg0.method330();
                    int var103 = (var102 >> 4 & 7) + this.field166;
                    int var104 = (var102 & 7) + this.field167;
                    int var105 = arg0.method332();
                    if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                        class30 var106 = new class30();
                        var106.field974 = var101;
                        var106.field973 = var105;
                        if (this.field330[this.field601][var103][var104] == null) {
                            this.field330[this.field601][var103][var104] = new class61(0);
                        }
                        this.field330[this.field601][var103][var104].method507(var106);
                        this.method171(var103, var104);
                    }
                } else if (arg1 == 20) {
                    int var107 = arg0.method359(2);
                    int var108 = arg0.method351(0);
                    int var109 = (var108 >> 4 & 7) + this.field166;
                    int var110 = (var108 & 7) + this.field167;
                    int var111 = arg0.method350((byte) 40);
                    int var112 = var111 >> 2;
                    int var113 = var111 & 3;
                    int var114 = this.field190[var112];
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                        this.method154(var114, var110, false, 0, var112, var109, -1, this.field601, var107, var113);
                    }
                } else if (arg1 == 243) {
                    int var115 = arg0.method330();
                    int var116 = (var115 >> 4 & 7) + this.field166;
                    int var117 = (var115 & 7) + this.field167;
                    int var118 = arg0.method332();
                    int var119 = arg0.method330();
                    int var120 = arg0.method332();
                    if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                        int var121 = var116 * 128 + 64;
                        int var122 = var117 * 128 + 64;
                        class11 var123 = new class11(var120, var118, var122, 0, this.method57(this.field601, var121, this.field208, var122) - var119, field525, var121, this.field601);
                        this.field226.method507(var123);
                    }
                }
            } else {
                int var86 = arg0.method330();
                int var87 = (var86 >> 4 & 7) + this.field166;
                int var88 = (var86 & 7) + this.field167;
                int var89 = arg0.method332();
                int var90 = arg0.method332();
                int var91 = arg0.method332();
                if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                    class61 var92 = this.field330[this.field601][var87][var88];
                    if (var92 != null) {
                        for (class30 var93 = (class30) var92.method510(); var93 != null; var93 = (class30) var92.method512(false)) {
                            if ((var89 & 32767) == var93.field974 && var93.field973 == var90) {
                                var93.field973 = var91;
                                break;
                            }
                        }
                        this.method171(var87, var88);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILPKHWFJLM;I)V")
    private final void method130(int arg0, class43 arg1, int arg2) {
        if (arg0 != 2) {
            this.method61();
        }
        arg1.method340(2);
        int var4 = arg1.method341((byte) 39, 1);
        if (var4 != 0) {
            int var5 = arg1.method341((byte) 39, 2);
            if (var5 == 0) {
                this.field456[this.field455++] = this.field451;
            } else if (var5 == 1) {
                int var6 = arg1.method341((byte) 39, 3);
                field331.method478((byte) 109, false, var6);
                int var7 = arg1.method341((byte) 39, 1);
                if (var7 == 1) {
                    this.field456[this.field455++] = this.field451;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method341((byte) 39, 3);
                field331.method478((byte) 109, true, var8);
                int var9 = arg1.method341((byte) 39, 3);
                field331.method478((byte) 109, true, var9);
                int var10 = arg1.method341((byte) 39, 1);
                if (var10 == 1) {
                    this.field456[this.field455++] = this.field451;
                }
            } else if (var5 == 3) {
                int var11 = arg1.method341((byte) 39, 7);
                int var12 = arg1.method341((byte) 39, 1);
                int var13 = arg1.method341((byte) 39, 7);
                int var14 = arg1.method341((byte) 39, 1);
                if (var14 == 1) {
                    this.field456[this.field455++] = this.field451;
                }
                this.field601 = arg1.method341((byte) 39, 2);
                field331.method476(var13, var11, (byte) 0, var12 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method131(int arg0, int arg1, int arg2) {
        if (arg2 != -30268) {
            throw new NullPointerException();
        } else {
            boolean var4 = false;
            class52 var5 = class52.method458(arg0);
            for (int var6 = 0; var6 < var5.field1381.length && var5.field1381[var6] != -1; ++var6) {
                class52 var7 = class52.method458(var5.field1381[var6]);
                if (var7.field1352 == 1) {
                    var4 |= this.method131(var7.field1338, arg1, -30268);
                }
                if (var7.field1352 == 6 && (var7.field1318 != -1 || var7.field1319 != -1)) {
                    boolean var8 = this.method83(var7, false);
                    int var9;
                    if (var8) {
                        var9 = var7.field1319;
                    } else {
                        var9 = var7.field1318;
                    }
                    if (var9 != -1) {
                        class14 var10 = class14.field656[var9];
                        var7.field1317 += arg1;
                        while (var7.field1317 > var10.method215(var7.field1368, 0)) {
                            var7.field1317 -= var10.method215(var7.field1368, 0) + 1;
                            ++var7.field1368;
                            if (var7.field1368 >= var10.field657) {
                                var7.field1368 -= var10.field661;
                                if (var7.field1368 < 0 || var7.field1368 >= var10.field657) {
                                    var7.field1368 = 0;
                                }
                            }
                            var4 = true;
                        }
                    }
                }
                if (var7.field1352 == 6 && var7.field1378 != 0) {
                    int var11 = var7.field1378 >> 16;
                    int var12 = var7.field1378 << 16 >> 16;
                    int var13 = arg1 * var11;
                    int var14 = arg1 * var12;
                    var7.field1343 = var7.field1343 + var13 & 2047;
                    var7.field1344 = var7.field1344 + var14 & 2047;
                    var4 = true;
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method132(byte arg0) {
        try {
            this.field502 = -1;
            this.field226.method514();
            this.field289.method514();
            ++field301;
            if (field301 > 1003) {
                field301 = 0;
                this.field553.method319(90, false);
                this.field553.method320(0);
                int var2 = this.field553.field1105;
                this.field553.method321(64998);
                this.field553.method320(213);
                this.field553.method320(167);
                this.field553.method320(250);
                this.field553.method320(224);
                this.field553.method320((int) (Math.random() * 256.0D));
                this.field553.method320((int) (Math.random() * 256.0D));
                this.field553.method320(128);
                this.field553.method320(50);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field553.method320(192);
                }
                this.field553.method329((byte) 7, this.field553.field1105 - var2);
            }
            class71.method587((byte) 101);
            this.method150((byte) 5);
            this.field394.method523(true);
            System.gc();
            for (int var3 = 0; var3 < 4; ++var3) {
                this.field248[var3].method480();
            }
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; var6 < 104; ++var6) {
                        this.field216[var4][var5][var6] = 0;
                    }
                }
            }
            class9 var7 = new class9(this.field433, this.field216, 104, 1, 104);
            int var8 = this.field224.length;
            this.field553.method319(30, false);
            if (!this.field212) {
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = (this.field598[var9] >> 8) * 64 - this.field228;
                    int var11 = (this.field598[var9] & 255) * 64 - this.field229;
                    byte[] var12 = this.field224[var9];
                    if (var12 != null) {
                        var7.method39(3, (this.field172 - 6) * 8, var11, (this.field171 - 6) * 8, var12, var10, this.field248);
                    }
                }
                for (int var13 = 0; var13 < var8; ++var13) {
                    int var14 = (this.field598[var13] >> 8) * 64 - this.field228;
                    int var15 = (this.field598[var13] & 255) * 64 - this.field229;
                    byte[] var16 = this.field224[var13];
                    if (var16 == null && this.field172 < 800) {
                        var7.method34((byte) -73, var14, var15, 64, 64);
                    }
                }
                this.field553.method319(30, false);
                for (int var17 = 0; var17 < var8; ++var17) {
                    byte[] var18 = this.field577[var17];
                    if (var18 != null) {
                        int var19 = (this.field598[var17] >> 8) * 64 - this.field228;
                        int var20 = (this.field598[var17] & 255) * 64 - this.field229;
                        var7.method47(var19, this.field394, this.field248, var20, 576, var18);
                    }
                }
            }
            if (this.field212) {
                int var21 = 0;
                label260: while (true) {
                    if (var21 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field187[0][var31][var32];
                                if (var33 == -1) {
                                    var7.method34((byte) -73, var31 * 8, var32 * 8, 8, 8);
                                }
                            }
                        }
                        this.field553.method319(30, false);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label260;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field187[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field598.length; ++var43) {
                                            if (this.field598[var43] == var42 && this.field577[var43] != null) {
                                                var7.method46(this.field299, var38, this.field577[var43], (var41 & 7) * 8, var35 * 8, (var40 & 7) * 8, this.field394, var39, var34, var36 * 8, this.field248);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            ++var34;
                        }
                    }
                    for (int var22 = 0; var22 < 13; ++var22) {
                        for (int var23 = 0; var23 < 13; ++var23) {
                            int var24 = this.field187[var21][var22][var23];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field598.length; ++var30) {
                                    if (this.field598[var30] == var29 && this.field224[var30] != null) {
                                        var7.method28(var25, (var28 & 7) * 8, this.field248, this.field224[var30], var21, (var27 & 7) * 8, var22 * 8, this.field191, var23 * 8, var26);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var21;
                }
            }
            this.field553.method319(30, false);
            var7.method30(this.field394, this.field248, -396);
            if (this.field418 != null) {
                this.field418.method24(-214);
                class71.field1706 = this.field244;
            }
            this.field553.method319(30, false);
            int var44 = class9.field119;
            if (var44 > this.field601) {
                var44 = this.field601;
            }
            if (var44 < this.field601 - 1) {
                int var45 = this.field601 - 1;
            }
            if (field617) {
                this.field394.method524(class9.field119, (byte) -54);
            } else {
                this.field394.method524(0, (byte) -54);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method171(var46, var47);
                }
            }
            this.method92(true);
        } catch (Exception var60) {
        }
        class33.field1019.method521();
        if (arg0 == -122) {
            if (super.field1245 != null) {
                this.field553.method319(56, false);
                this.field553.method324(1057001181);
            }
            if (field617 && signlink.cache_dat != null) {
                int var49 = this.field270.method262(0, 163);
                for (int var50 = 0; var50 < var49; ++var50) {
                    int var51 = this.field270.method273(var50, (byte) -88);
                    if ((var51 & 121) == 0) {
                        class45.method409(true, var50);
                    }
                }
            }
            System.gc();
            class71.method588(field306, 20);
            this.field270.method260(true);
            int var52 = (this.field171 - 6) / 8 - 1;
            int var53 = (this.field171 + 6) / 8 + 1;
            int var54 = (this.field172 - 6) / 8 - 1;
            int var55 = (this.field172 + 6) / 8 + 1;
            if (this.field295) {
                var52 = 49;
                var53 = 50;
                var54 = 49;
                var55 = 50;
            }
            for (int var56 = var52; var56 <= var53; ++var56) {
                for (int var57 = var54; var57 <= var55; ++var57) {
                    if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                        int var58 = this.field270.method257(867, var56, 0, var57);
                        if (var58 != -1) {
                            this.field270.method266(486, var58, 3);
                        }
                        int var59 = this.field270.method257(867, var56, 1, var57);
                        if (var59 != -1) {
                            this.field270.method266(486, var59, 3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method133(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLPKHWFJLM;I)V")
    private final void method134(byte arg0, class43 arg1, int arg2) {
        arg1.method340(2);
        int var4 = arg1.method341((byte) 39, 8);
        if (arg0 != 100) {
            this.field358 = -1;
        }
        if (var4 < this.field364) {
            for (int var5 = var4; var5 < this.field364; ++var5) {
                this.field485[this.field484++] = this.field365[var5];
            }
        }
        if (var4 > this.field364) {
            signlink.reporterror(this.field141 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field364 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field365[var6];
                class42 var8 = this.field363[var7];
                int var9 = arg1.method341((byte) 39, 1);
                if (var9 == 0) {
                    this.field365[this.field364++] = var7;
                    var8.field1447 = field525;
                } else {
                    int var10 = arg1.method341((byte) 39, 2);
                    if (var10 == 0) {
                        this.field365[this.field364++] = var7;
                        var8.field1447 = field525;
                        this.field456[this.field455++] = var7;
                    } else if (var10 == 1) {
                        this.field365[this.field364++] = var7;
                        var8.field1447 = field525;
                        int var11 = arg1.method341((byte) 39, 3);
                        var8.method478((byte) 109, false, var11);
                        int var12 = arg1.method341((byte) 39, 1);
                        if (var12 == 1) {
                            this.field456[this.field455++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field365[this.field364++] = var7;
                        var8.field1447 = field525;
                        int var13 = arg1.method341((byte) 39, 3);
                        var8.method478((byte) 109, true, var13);
                        int var14 = arg1.method341((byte) 39, 3);
                        var8.method478((byte) 109, true, var14);
                        int var15 = arg1.method341((byte) 39, 1);
                        if (var15 == 1) {
                            this.field456[this.field455++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field485[this.field484++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method135(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method135(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method136(int arg0, int arg1) {
        int[] var3 = this.field543.field1498;
        if (arg0 != 27567) {
            this.field330 = null;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field216[arg1][var25][var6] & 24) == 0) {
                    this.field394.method558(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (this.field216[arg1 + 1][var25][var6] & 8) != 0) {
                    this.field394.method558(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field543.method492(-214);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field216[arg1][var23][var9] & 24) == 0) {
                    this.method80(var7, false, var8, var23, arg1, var9);
                }
                if (arg1 < 3 && (this.field216[arg1 + 1][var23][var9] & 8) != 0) {
                    this.method80(var7, false, var8, var23, arg1 + 1, var9);
                }
            }
        }
        if (this.field418 != null) {
            this.field418.method24(-214);
            class71.field1706 = this.field244;
        }
        ++field139;
        if (field139 > 1003) {
            field139 = 0;
            this.field553.method319(21, false);
            this.field553.method320(0);
            int var10 = this.field553.field1105;
            this.field553.method320((int) (Math.random() * 256.0D));
            this.field553.method321(1577);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field553.method321(10733);
            }
            this.field553.method321(30792);
            this.field553.method320((int) (Math.random() * 256.0D));
            this.field553.method320((int) (Math.random() * 256.0D));
            this.field553.method320(229);
            this.field553.method320((int) (Math.random() * 256.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field553.method320(88);
            }
            this.field553.method321((int) (Math.random() * 65536.0D));
            this.field553.method329((byte) 7, this.field553.field1105 - var10);
        }
        this.field256 = 0;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field394.method552(this.field601, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class33.method290(var14).field1020;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field248[this.field601].field1483;
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
                        this.field370[this.field256] = this.field400[var15];
                        this.field257[this.field256] = var16;
                        this.field258[this.field256] = var17;
                        ++this.field256;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method137(int arg0, boolean arg1) {
        this.field357 += arg0;
        for (int var3 = 0; var3 < this.field364; ++var3) {
            class42 var4 = this.field363[this.field365[var3]];
            int var5 = (this.field365[var3] << 14) + 536870912;
            if (var4 != null && var4.method316((byte) 127) && var4.field1082.field1672 == arg1 && var4.field1082.method583(false)) {
                int var6 = var4.field1453 >> 7;
                int var7 = var4.field1454 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1425 == 1 && (var4.field1453 & 127) == 64 && (var4.field1454 & 127) == 64) {
                        if (this.field496[var6][var7] == this.field586) {
                            continue;
                        }
                        this.field496[var6][var7] = this.field586;
                    }
                    if (!var4.field1082.field1655) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field394.method534(var4.field1454, this.field601, var4.field1453, var4.field1460, var4, this.method57(this.field601, var4.field1453, this.field208, var4.field1454), (var4.field1425 - 1) * 64 + 60, var4.field1455, var5, this.field260);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 340);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field614 = Integer.parseInt(arg0[0]);
                field615 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method52(8);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method101(0);
                }
                if (arg0[3].equals("free")) {
                    field616 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field616 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method442(503, 381, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public final void method138(String arg0, int arg1, int arg2) {
        this.field184 = arg2;
        this.field355 = arg0;
        this.method81(-42111);
        if (this.field262 == null) {
            super.method138(arg0, -460, arg2);
        } else {
            this.field403.method24(-214);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field522.method9(var5 / 2 - 26 - var6, var4 / 2, "RuneScape is loading - please wait...", 16777215, false);
            int var7 = var5 / 2 - 18 - var6;
            class12.method203(var7, 34, 9179409, var4 / 2 - 152, true, 304);
            class12.method203(var7 + 1, 32, 0, var4 / 2 - 151, true, 302);
            class12.method202(9179409, var4 / 2 - 150, arg2 * 3, 8, var7 + 2, 30);
            class12.method202(0, arg2 * 3 + (var4 / 2 - 150), 300 - arg2 * 3, 8, var7 + 2, 30);
            if (arg1 < 0) {
                this.field522.method9(var5 / 2 + 5 - var6, var4 / 2, arg0, 16777215, false);
                this.field403.method25(-71, 171, super.field1242, 202);
                if (this.field569) {
                    this.field569 = false;
                    if (!this.field492) {
                        this.field404.method25(-71, 0, super.field1242, 0);
                        this.field405.method25(-71, 0, super.field1242, 637);
                    }
                    this.field401.method25(-71, 0, super.field1242, 128);
                    this.field402.method25(-71, 371, super.field1242, 202);
                    this.field406.method25(-71, 265, super.field1242, 0);
                    this.field407.method25(-71, 265, super.field1242, 562);
                    this.field408.method25(-71, 171, super.field1242, 128);
                    this.field409.method25(-71, 171, super.field1242, 562);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field221) {
            this.method58((byte) 1);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method139(int arg0) {
        int var2 = 84 / arg0;
        for (class26 var3 = (class26) this.field289.method510(); var3 != null; var3 = (class26) this.field289.method512(false)) {
            if (this.field601 == var3.field917 && field525 <= var3.field913) {
                if (field525 >= var3.field912) {
                    if (var3.field916 > 0) {
                        class42 var4 = this.field363[var3.field916 - 1];
                        if (var4 != null && var4.field1453 >= 0 && var4.field1453 < 13312 && var4.field1454 >= 0 && var4.field1454 < 13312) {
                            var3.method253(var4.field1453, (byte) -51, var4.field1454, field525, this.method57(var3.field917, var4.field1453, this.field208, var4.field1454) - var3.field897);
                        }
                    }
                    if (var3.field916 < 0) {
                        int var5 = -var3.field916 - 1;
                        class48 var6;
                        if (this.field431 == var5) {
                            var6 = field331;
                        } else {
                            var6 = this.field452[var5];
                        }
                        if (var6 != null && var6.field1453 >= 0 && var6.field1453 < 13312 && var6.field1454 >= 0 && var6.field1454 < 13312) {
                            var3.method253(var6.field1453, (byte) -51, var6.field1454, field525, this.method57(var3.field917, var6.field1453, this.field208, var6.field1454) - var3.field897);
                        }
                    }
                    var3.method252(this.field267, this.field274);
                    this.field394.method534((int) var3.field905, this.field601, (int) var3.field904, false, var3, (int) var3.field906, 60, var3.field908, -1, this.field260);
                }
            } else {
                var3.method254();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LPKHWFJLM;ZI)V")
    private final void method140(class43 arg0, boolean arg1, int arg2) {
        this.field484 = 0;
        this.field455 = 0;
        this.method130(2, arg0, arg2);
        this.method193(0, arg0, arg2);
        this.method187(arg2, arg0, 489);
        this.method78(0, arg2, arg0);
        if (arg1) {
            this.method61();
        }
        for (int var4 = 0; var4 < this.field484; ++var4) {
            int var6 = this.field485[var4];
            if (field525 != this.field452[var6].field1447) {
                this.field452[var6] = null;
            }
        }
        if (arg0.field1105 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1105 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field453; ++var5) {
                if (this.field452[this.field454[var5]] == null) {
                    signlink.reporterror(this.field141 + " null entry in pl list - pos:" + var5 + " size:" + this.field453);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILRRTTGXYM;I)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class52 arg6, int arg7) {
        if (arg6.field1352 == 0 && arg6.field1381 != null && !arg6.field1355) {
            if (arg3 >= arg7 && arg1 >= arg5 && arg3 <= arg6.field1371 + arg7 && arg1 <= arg6.field1330 + arg5) {
                int var9 = arg6.field1381.length;
                while (arg0 >= 0) {
                    this.field330 = null;
                }
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg6.field1311[var10] + arg7;
                    int var12 = arg6.field1340[var10] + arg5 - arg2;
                    class52 var13 = class52.method458(arg6.field1381[var10]);
                    int var14 = var13.field1337 + var11;
                    int var15 = var13.field1357 + var12;
                    if ((var13.field1377 >= 0 || var13.field1369 != 0) && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1371 + var14 && arg1 < var13.field1330 + var15) {
                        if (var13.field1377 >= 0) {
                            this.field411 = var13.field1377;
                        } else {
                            this.field411 = var13.field1338;
                        }
                    }
                    if (var13.field1352 == 8 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1371 + var14 && arg1 < var13.field1330 + var15) {
                        this.field155 = var13.field1338;
                    }
                    if (var13.field1352 == 0) {
                        this.method141(-918, arg1, var13.field1312, arg3, arg4, var15, var13, var14);
                        if (var13.field1359 > var13.field1330) {
                            this.method117((byte) -45, var13.field1330, var13.field1359, arg3, var13, arg1, arg4, var13.field1371 + var14, var15);
                        }
                    } else {
                        if (var13.field1310 == 1 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1371 + var14 && arg1 < var13.field1330 + var15) {
                            boolean var16 = false;
                            if (var13.field1347 != 0) {
                                var16 = this.method74(var13, 844);
                            }
                            if (!var16) {
                                this.field379[this.field392] = var13.field1354;
                                this.field590[this.field392] = 836;
                                this.field589[this.field392] = var13.field1338;
                                ++this.field392;
                            }
                        }
                        if (var13.field1310 == 2 && this.field592 == 0 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1371 + var14 && arg1 < var13.field1330 + var15) {
                            String var17 = var13.field1374;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field379[this.field392] = var17 + " @gre@" + var13.field1335;
                            this.field590[this.field392] = 924;
                            this.field589[this.field392] = var13.field1338;
                            ++this.field392;
                        }
                        if (var13.field1310 == 3 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1371 + var14 && arg1 < var13.field1330 + var15) {
                            this.field379[this.field392] = "Close";
                            if (arg4 == 3) {
                                this.field590[this.field392] = 684;
                            } else {
                                this.field590[this.field392] = 991;
                            }
                            this.field589[this.field392] = var13.field1338;
                            ++this.field392;
                        }
                        if (var13.field1310 == 4 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1371 + var14 && arg1 < var13.field1330 + var15) {
                            this.field379[this.field392] = var13.field1354;
                            this.field590[this.field392] = 877;
                            this.field589[this.field392] = var13.field1338;
                            ++this.field392;
                        }
                        if (var13.field1310 == 5 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1371 + var14 && arg1 < var13.field1330 + var15) {
                            this.field379[this.field392] = var13.field1354;
                            this.field590[this.field392] = 529;
                            this.field589[this.field392] = var13.field1338;
                            ++this.field392;
                        }
                        if (var13.field1310 == 6 && !this.field222 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1371 + var14 && arg1 < var13.field1330 + var15) {
                            this.field379[this.field392] = var13.field1354;
                            this.field590[this.field392] = 856;
                            this.field589[this.field392] = var13.field1338;
                            ++this.field392;
                        }
                        if (var13.field1352 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1330; ++var19) {
                                for (int var20 = 0; var20 < var13.field1371; ++var20) {
                                    int var21 = (var13.field1336 + 32) * var20 + var14;
                                    int var22 = (var13.field1375 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1322[var18];
                                        var22 += var13.field1326[var18];
                                    }
                                    if (arg3 >= var21 && arg1 >= var22 && arg3 < var21 + 32 && arg1 < var22 + 32) {
                                        this.field448 = var18;
                                        this.field449 = var13.field1338;
                                        if (var13.field1356[var18] > 0) {
                                            class21 var23 = class21.method236(var13.field1356[var18] - 1);
                                            if (this.field395 == 1 && var13.field1328) {
                                                if (this.field397 != var13.field1338 || this.field396 != var18) {
                                                    this.field379[this.field392] = "Use " + this.field399 + " with @lre@" + var23.field809;
                                                    this.field590[this.field392] = 486;
                                                    this.field591[this.field392] = var23.field825;
                                                    this.field588[this.field392] = var18;
                                                    this.field589[this.field392] = var13.field1338;
                                                    ++this.field392;
                                                }
                                            } else if (this.field592 == 1 && var13.field1328) {
                                                if ((this.field594 & 16) == 16) {
                                                    this.field379[this.field392] = this.field595 + " @lre@" + var23.field809;
                                                    this.field590[this.field392] = 104;
                                                    this.field591[this.field392] = var23.field825;
                                                    this.field588[this.field392] = var18;
                                                    this.field589[this.field392] = var13.field1338;
                                                    ++this.field392;
                                                }
                                            } else {
                                                if (var13.field1328) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field816 != null && var23.field816[var24] != null) {
                                                            this.field379[this.field392] = var23.field816[var24] + " @lre@" + var23.field809;
                                                            if (var24 == 3) {
                                                                this.field590[this.field392] = 194;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field590[this.field392] = 840;
                                                            }
                                                            this.field591[this.field392] = var23.field825;
                                                            this.field588[this.field392] = var18;
                                                            this.field589[this.field392] = var13.field1338;
                                                            ++this.field392;
                                                        } else if (var24 == 4) {
                                                            this.field379[this.field392] = "Drop @lre@" + var23.field809;
                                                            this.field590[this.field392] = 840;
                                                            this.field591[this.field392] = var23.field825;
                                                            this.field588[this.field392] = var18;
                                                            this.field589[this.field392] = var13.field1338;
                                                            ++this.field392;
                                                        }
                                                    }
                                                }
                                                if (var13.field1363) {
                                                    this.field379[this.field392] = "Use @lre@" + var23.field809;
                                                    this.field590[this.field392] = 901;
                                                    this.field591[this.field392] = var23.field825;
                                                    this.field588[this.field392] = var18;
                                                    this.field589[this.field392] = var13.field1338;
                                                    ++this.field392;
                                                }
                                                if (var13.field1328 && var23.field816 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field816[var25] != null) {
                                                            this.field379[this.field392] = var23.field816[var25] + " @lre@" + var23.field809;
                                                            if (var25 == 0) {
                                                                this.field590[this.field392] = 99;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field590[this.field392] = 600;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field590[this.field392] = 300;
                                                            }
                                                            this.field591[this.field392] = var23.field825;
                                                            this.field588[this.field392] = var18;
                                                            this.field589[this.field392] = var13.field1338;
                                                            ++this.field392;
                                                        }
                                                    }
                                                }
                                                if (var13.field1382 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1382[var26] != null) {
                                                            this.field379[this.field392] = var13.field1382[var26] + " @lre@" + var23.field809;
                                                            if (var26 == 0) {
                                                                this.field590[this.field392] = 849;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field590[this.field392] = 92;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field590[this.field392] = 204;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field590[this.field392] = 357;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field590[this.field392] = 371;
                                                            }
                                                            this.field591[this.field392] = var23.field825;
                                                            this.field588[this.field392] = var18;
                                                            this.field589[this.field392] = var13.field1338;
                                                            ++this.field392;
                                                        }
                                                    }
                                                }
                                                this.field379[this.field392] = "Examine @lre@" + var23.field809;
                                                this.field590[this.field392] = 1630;
                                                this.field591[this.field392] = var23.field825;
                                                this.field588[this.field392] = var18;
                                                this.field589[this.field392] = var13.field1338;
                                                ++this.field392;
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

    @OriginalMember(owner = "client", name = "t", descriptor = "(Z)V")
    public final void method142(boolean arg0) {
        if (arg0) {
            this.field358 = -1;
        }
        for (int var2 = -1; var2 < this.field453; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field451;
            } else {
                var6 = this.field454[var2];
            }
            class48 var7 = this.field452[var6];
            if (var7 != null && var7.field1433 > 0) {
                --var7.field1433;
                if (var7.field1433 == 0) {
                    var7.field1459 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field364; ++var3) {
            int var4 = this.field365[var3];
            class42 var5 = this.field363[var4];
            if (var5 != null && var5.field1433 > 0) {
                --var5.field1433;
                if (var5.field1433 == 0) {
                    var5.field1459 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method143(int arg0) {
        byte[] var2 = this.field262.method506("title.dat", (byte[]) null);
        class58 var3 = new class58(var2, this);
        this.field404.method24(-214);
        var3.method495(0, -640, 0);
        this.field405.method24(-214);
        var3.method495(0, -640, -637);
        this.field401.method24(-214);
        var3.method495(0, -640, -128);
        this.field402.method24(-214);
        var3.method495(-371, -640, -202);
        this.field403.method24(-214);
        var3.method495(-171, -640, -202);
        this.field406.method24(-214);
        var3.method495(-265, -640, 0);
        this.field407.method24(-214);
        var3.method495(-265, -640, -562);
        this.field408.method24(-214);
        var3.method495(-171, -640, -128);
        this.field409.method24(-214);
        var3.method495(-171, -640, -562);
        int[] var4 = new int[var3.field1499];
        for (int var5 = 0; var5 < var3.field1500; ++var5) {
            for (int var10 = 0; var10 < var3.field1499; ++var10) {
                var4[var10] = var3.field1498[var3.field1499 * var5 + (var3.field1499 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1499; ++var11) {
                var3.field1498[var3.field1499 * var5 + var11] = var4[var11];
            }
        }
        this.field404.method24(-214);
        var3.method495(0, -640, 382);
        this.field405.method24(-214);
        var3.method495(0, -640, -255);
        this.field401.method24(-214);
        var3.method495(0, -640, 254);
        this.field402.method24(-214);
        var3.method495(-371, -640, 180);
        this.field403.method24(-214);
        var3.method495(-171, -640, 180);
        this.field406.method24(-214);
        var3.method495(-265, -640, 382);
        this.field407.method24(-214);
        var3.method495(-265, -640, -180);
        this.field408.method24(-214);
        var3.method495(-171, -640, 254);
        this.field409.method24(-214);
        var3.method495(-171, -640, -180);
        this.field357 += arg0;
        class58 var6 = new class58(this.field262, "logo", 0);
        this.field401.method24(-214);
        var6.method497(382 - var6.field1499 / 2 - 128, 18, 30573);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class27.field922) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method144(int arg0) {
        this.field357 += arg0;
        if (!this.field317 && !this.field552 && !this.field180) {
            ++field525;
            if (!this.field185) {
                this.method99(false);
            } else {
                this.method95((byte) -75);
            }
            this.method168(-36407);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLTTFRDWZK;I)V")
    public final void method145(int arg0, byte arg1, class58 arg2, int arg3) {
        int var5 = this.field367 + this.field265 & 2047;
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class45.field1213[var5];
            int var8 = class45.field1214[var5];
            int var9 = var7 * 256 / (this.field318 + 256);
            if (arg1 != 4) {
                this.field358 = -1;
            }
            int var10 = var8 * 256 / (this.field318 + 256);
            int var11 = arg0 * var9 + arg3 * var10 >> 16;
            int var12 = arg0 * var10 - arg3 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method503(this.field198, var11 + 94 - arg2.field1503 / 2 + 4, 83 - var12 - arg2.field1504 / 2 - 4, this.field385);
            } else {
                arg2.method497(var11 + 94 - arg2.field1503 / 2 + 4, 83 - var12 - arg2.field1504 / 2 - 4, 30573);
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method146(int arg0) {
        if (this.field361 > 0) {
            this.method123(true);
        } else {
            this.method124("Connection lost", -182, "Please wait - attempting to reestablish");
            if (arg0 <= 0) {
                this.method61();
            }
            this.field526 = 0;
            this.field541 = 0;
            class20 var2 = this.field292;
            this.field185 = false;
            this.field223 = 0;
            this.method120(this.field141, this.field142, true);
            if (!this.field185) {
                this.method123(true);
            }
            try {
                var2.method225();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(Z)V")
    public final void method147(boolean arg0) {
        if (this.field294 != 0) {
            int var2 = 0;
            if (this.field414 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field220[var3] != null) {
                    int var4 = this.field218[var3];
                    String var5 = this.field219[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field579 == 0 || this.field579 == 1 && this.method64(var5, (byte) -47))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1250 > 4 && super.field1251 - 4 > var9 - 10 && super.field1251 - 4 <= var9 + 3) {
                            int var10 = this.field521.method11("From:  " + var5 + this.field220[var3], false) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1250 < var10 + 4) {
                                if (this.field493 >= 1) {
                                    this.field379[this.field392] = "Report abuse @whi@" + var5;
                                    this.field590[this.field392] = 2556;
                                    ++this.field392;
                                }
                                this.field379[this.field392] = "Add ignore @whi@" + var5;
                                this.field590[this.field392] = 2913;
                                ++this.field392;
                                this.field379[this.field392] = "Add friend @whi@" + var5;
                                this.field590[this.field392] = 2695;
                                ++this.field392;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field579 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0) {
                field389 = this.field327.method276();
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(Z)V")
    public final void method148(boolean arg0) {
        class11 var2 = (class11) this.field226.method510();
        if (arg0) {
            field232 = !field232;
        }
        while (var2 != null) {
            if (this.field601 == var2.field620 && !var2.field624) {
                if (field525 >= var2.field627) {
                    var2.method195(this.field267, (byte) -47);
                    if (var2.field624) {
                        var2.method254();
                    } else {
                        this.field394.method534(var2.field622, var2.field620, var2.field621, false, var2, var2.field623, 60, 0, -1, this.field260);
                    }
                }
            } else {
                var2.method254();
            }
            var2 = (class11) this.field226.method512(false);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LRRTTGXYM;I)Z")
    public final boolean method149(class52 arg0, int arg1) {
        if (arg1 != 0) {
            this.field358 = this.field153.method330();
        }
        int var3 = arg0.field1347;
        if (this.field157 == 2) {
            if (var3 == 201) {
                this.field310 = true;
                this.field250 = 0;
                this.field164 = true;
                this.field429 = "";
                this.field508 = 1;
                this.field390 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field310 = true;
                this.field250 = 0;
                this.field164 = true;
                this.field429 = "";
                this.field508 = 2;
                this.field390 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field361 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field310 = true;
                this.field250 = 0;
                this.field164 = true;
                this.field429 = "";
                this.field508 = 4;
                this.field390 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field310 = true;
                this.field250 = 0;
                this.field164 = true;
                this.field429 = "";
                this.field508 = 5;
                this.field390 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field582[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class46.field1222 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class46.field1222) {
                                var6 = 0;
                            }
                        }
                        if (!class46.field1223[var6].field1229 && class46.field1223[var6].field1224 == var4 + (this.field570 ? 0 : 7)) {
                            this.field582[var4] = var6;
                            this.field613 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field555[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field563[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field563[var7].length) {
                        var9 = 0;
                    }
                }
                this.field555[var7] = var9;
                this.field613 = true;
            }
            if (var3 == 324 && !this.field570) {
                this.field570 = true;
                this.method90((byte) 75);
            }
            if (var3 == 325 && this.field570) {
                this.field570 = false;
                this.method90((byte) 75);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field152 = !this.field152;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method103(false);
                    if (this.field186.length() > 0) {
                        this.field553.method319(164, false);
                        this.field553.method326(-228, class36.method300(this.field186));
                        this.field553.method320(var3 - 601);
                        this.field553.method320(this.field152 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field553.method319(244, false);
                this.field553.method320(this.field570 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field553.method320(this.field582[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field553.method320(this.field555[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method150(byte arg0) {
        class33.field1019.method521();
        class33.field1029.method521();
        class70.field1657.method521();
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field430 = this.field327.method276();
        }
        class21.field853.method521();
        class21.field854.method521();
        class48.field1267.method521();
        class23.field878.method521();
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (!this.field317 && !this.field552 && !this.field180) {
            ++field303;
            if (!this.field185) {
                this.method89(false, (byte) 4);
            } else {
                this.method114((byte) -118);
            }
            this.field254 = 0;
            if (arg0 < 4 || arg0 > 4) {
                this.field358 = this.field153.method330();
            }
        } else {
            this.method60(580);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method152(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        this.method51(0);
        if (this.field506 == 1) {
            this.field517[this.field505 / 100].method497(this.field503 - 8 - 4, this.field504 - 8 - 4, 30573);
        }
        if (this.field506 == 2) {
            this.field517[this.field505 / 100 + 4].method497(this.field503 - 8 - 4, this.field504 - 8 - 4, 30573);
        }
        if (this.field161 != -1) {
            this.method131(this.field161, this.field267, -30268);
            this.method172(0, 0, 0, class52.method458(this.field161), 0);
        }
        if (this.field375 != -1) {
            this.method131(this.field375, this.field267, -30268);
            this.method172(0, 0, 0, class52.method458(this.field375), 0);
        }
        this.method162(-551);
        if (!this.field337) {
            this.method185((byte) -10);
            this.method177(-3568);
        } else if (this.field424 == 0) {
            this.method84(false);
        }
        if (this.field378 == 1) {
            this.field487.method497(472, 296, 30573);
        }
        if (field206) {
            short var4 = 507;
            byte var5 = 20;
            int var6 = 16776960;
            if (super.field1238 < 30 && field617) {
                var6 = 16711680;
            }
            if (super.field1238 < 20 && !field617) {
                var6 = 16711680;
            }
            this.field521.method8("Fps:" + super.field1238, var5, var6, var4, -699);
            int var15 = var5 + 15;
            Runtime var7 = Runtime.getRuntime();
            int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
            int var9 = 16776960;
            if (var8 > 33554432 && field617) {
                int var10 = 16711680;
            }
            if (var8 > 67108864 && !field617) {
                int var11 = 16711680;
            }
            this.field521.method8("Mem:" + var8 + "k", var15, 16776960, var4, -699);
            var15 += 15;
        }
        if (this.field414 != 0) {
            int var12 = this.field414 / 50;
            int var13 = var12 / 60;
            int var14 = var12 % 60;
            if (var14 < 10) {
                this.field521.method13(4, (byte) 1, "System update in: " + var13 + ":0" + var14, 16776960, 329);
            } else {
                this.field521.method13(4, (byte) 1, "System update in: " + var13 + ":" + var14, 16776960, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTTFRDWZK;IZI)V")
    public final void method153(class58 arg0, int arg1, boolean arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (arg2) {
            this.field358 = this.field153.method330();
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field367 + this.field265 & 2047;
            int var7 = class45.field1213[var6];
            int var8 = class45.field1214[var6];
            int var9 = var7 * 256 / (this.field318 + 256);
            int var10 = var8 * 256 / (this.field318 + 256);
            int var11 = arg1 * var9 + arg3 * var10 >> 16;
            int var12 = arg1 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field271.method502(256, 15, var13, 15, 20, 83 - var16 - 20, var15 + 94 + 4 - 10, 20, 0);
        } else {
            this.method145(arg1, (byte) 4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZIIIIIII)V")
    private final void method154(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class39 var11 = null;
        class39 var12 = (class39) this.field215.method510();
        if (arg2) {
            this.method61();
        }
        while (var12 != null) {
            if (var12.field1067 == arg7 && var12.field1069 == arg5 && var12.field1070 == arg1 && var12.field1068 == arg0) {
                var11 = var12;
                break;
            }
            var12 = (class39) this.field215.method512(false);
        }
        if (var11 == null) {
            var11 = new class39();
            var11.field1067 = arg7;
            var11.field1068 = arg0;
            var11.field1069 = arg5;
            var11.field1070 = arg1;
            this.method77(var11, 39431);
            this.field215.method507(var11);
        }
        var11.field1061 = arg8;
        var11.field1063 = arg4;
        var11.field1062 = arg9;
        var11.field1060 = arg3;
        var11.field1071 = arg6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method155(String arg0) throws IOException {
        if (!this.field150) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field284 != null) {
                try {
                    this.field284.close();
                } catch (Exception var4) {
                }
                this.field284 = null;
            }
            this.field284 = this.method133(43595);
            this.field284.setSoTimeout(10000);
            InputStream var2 = this.field284.getInputStream();
            OutputStream var3 = this.field284.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)I")
    public final int method156(int arg0) {
        int var2 = 3;
        if (arg0 != 5) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field335 < 310) {
            int var4 = this.field332 >> 7;
            int var5 = this.field334 >> 7;
            int var6 = field331.field1453 >> 7;
            int var7 = field331.field1454 >> 7;
            if ((this.field216[this.field601][var4][var5] & 4) != 0) {
                var2 = this.field601;
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
                    if ((this.field216[this.field601][var4][var5] & 4) != 0) {
                        var2 = this.field601;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field216[this.field601][var4][var5] & 4) != 0) {
                            var2 = this.field601;
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
                    if ((this.field216[this.field601][var4][var5] & 4) != 0) {
                        var2 = this.field601;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field216[this.field601][var4][var5] & 4) != 0) {
                            var2 = this.field601;
                        }
                    }
                }
            }
        }
        if ((this.field216[this.field601][field331.field1453 >> 7][field331.field1454 >> 7] & 4) != 0) {
            var2 = this.field601;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)I")
    public final int method157(int arg0) {
        int var2 = this.method57(this.field601, this.field332, this.field208, this.field334);
        if (arg0 <= 0) {
            this.field176 = -426;
        }
        return var2 - this.field333 < 800 && (this.field216[this.field601][this.field332 >> 7][this.field334 >> 7] & 4) != 0 ? this.field601 : 3;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method158(String arg0) {
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method159(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field163; ++var4) {
                if (this.field207[var4] == arg0) {
                    --this.field163;
                    this.field316 = true;
                    for (int var5 = var4; var5 < this.field163; ++var5) {
                        this.field207[var5] = this.field207[var5 + 1];
                    }
                    this.field553.method319(38, false);
                    this.field553.method326(-228, arg0);
                    break;
                }
            }
            int var6 = 54 / arg1;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public void method160(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field217);
        if (this.field270 != null) {
            System.out.println("Od-cycle:" + this.field270.field945);
        }
        System.out.println("loop-cycle:" + field525);
        System.out.println("draw-cycle:" + field303);
        if (arg0 == 7) {
            System.out.println("ptype:" + this.field358);
            System.out.println("psize:" + this.field357);
            if (this.field292 != null) {
                this.field292.method230(7);
            }
            super.field1239 = true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final Component method161(int arg0) {
        if (arg0 >= 9 && arg0 <= 9) {
            if (signlink.mainapp != null) {
                return signlink.mainapp;
            } else {
                return super.field1245 != null ? super.field1245 : this;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field519 = 0;
        if (arg0 >= 0) {
            this.field268 = -231;
        }
        int var2 = (field331.field1453 >> 7) + this.field228;
        int var3 = (field331.field1454 >> 7) + this.field229;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field519 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field519 = 1;
        }
        if (this.field519 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field519 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method163(boolean arg0) {
        this.field569 = true;
        if (!arg0) {
            this.field358 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LPKHWFJLM;II)V")
    private final void method164(class43 arg0, int arg1, int arg2) {
        if (arg2 < this.field447 || arg2 > this.field447) {
            this.field208 = this.field327.method276();
        }
        while (arg0.field1106 + 21 < arg1 * 8) {
            int var4 = arg0.method341((byte) 39, 14);
            if (var4 == 16383) {
                break;
            }
            if (this.field363[var4] == null) {
                this.field363[var4] = new class42();
            }
            class42 var5 = this.field363[var4];
            this.field365[this.field364++] = var4;
            var5.field1447 = field525;
            int var6 = arg0.method341((byte) 39, 1);
            int var7 = arg0.method341((byte) 39, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method341((byte) 39, 1);
            if (var8 == 1) {
                this.field456[this.field455++] = var4;
            }
            var5.field1082 = class70.method579(arg0.method341((byte) 39, 12));
            int var9 = arg0.method341((byte) 39, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.field1425 = var5.field1082.field1690;
            var5.field1452 = var5.field1082.field1667;
            var5.field1470 = var5.field1082.field1686;
            var5.field1471 = var5.field1082.field1670;
            var5.field1472 = var5.field1082.field1682;
            var5.field1473 = var5.field1082.field1653;
            var5.field1419 = var5.field1082.field1678;
            var5.method476(field331.field1416[0] + var7, field331.field1417[0] + var9, (byte) 0, var6 == 1);
        }
        arg0.method342(-29596);
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    private final void method165(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            this.field269 = !this.field269;
        }
        if (this.field149 == 2) {
            for (class39 var2 = (class39) this.field215.method510(); var2 != null; var2 = (class39) this.field215.method512(false)) {
                if (var2.field1071 > 0) {
                    --var2.field1071;
                }
                if (var2.field1071 == 0) {
                    if (var2.field1064 < 0 || class9.method41(49097, var2.field1064, var2.field1066)) {
                        this.method85(var2.field1066, var2.field1064, 2, var2.field1070, var2.field1067, var2.field1069, var2.field1065, var2.field1068);
                        var2.method254();
                    }
                } else {
                    if (var2.field1060 > 0) {
                        --var2.field1060;
                    }
                    if (var2.field1060 == 0 && var2.field1069 >= 1 && var2.field1070 >= 1 && var2.field1069 <= 102 && var2.field1070 <= 102 && (var2.field1061 < 0 || class9.method41(49097, var2.field1061, var2.field1063))) {
                        this.method85(var2.field1063, var2.field1061, 2, var2.field1070, var2.field1067, var2.field1069, var2.field1062, var2.field1068);
                        var2.field1060 = -1;
                        if (var2.field1064 == var2.field1061 && var2.field1064 == -1) {
                            var2.method254();
                        } else if (var2.field1064 == var2.field1061 && var2.field1065 == var2.field1062 && var2.field1066 == var2.field1063) {
                            var2.method254();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method166(int arg0) {
        int var2 = 5;
        this.field264[8] = 0;
        if (arg0 != -28667) {
            this.field358 = this.field153.method330();
        }
        int var3 = 0;
        while (this.field264[8] == 0) {
            String var4 = "Unknown problem";
            this.method138("Connecting to web server", -460, 20);
            try {
                DataInputStream var5 = this.method155("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 340);
                class43 var6 = new class43(new byte[40], 0);
                var5.readFully(var6.field1104, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field264[var7] = var6.method335();
                }
                int var8 = var6.method335();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field264[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field264[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field264[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field264[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field264[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field264[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method138("Game updated - please reload page", -460, 10);
                        var11 = 10;
                    } else {
                        this.method138(var4 + " - Will retry in " + var11 + " secs.", -460, 10);
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
                this.field150 = !this.field150;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method167(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field292 != null) {
                this.field292.method225();
            }
        } catch (Exception var2) {
        }
        this.field292 = null;
        this.method65(true);
        if (this.field321 != null) {
            this.field321.field1486 = false;
        }
        this.field321 = null;
        this.field270.method274();
        this.field270 = null;
        if (arg0 > 0) {
            this.field362 = null;
            this.field553 = null;
            this.field311 = null;
            this.field153 = null;
            this.field598 = null;
            this.field224 = null;
            this.field577 = null;
            this.field599 = null;
            this.field600 = null;
            this.field433 = null;
            this.field216 = null;
            this.field394 = null;
            this.field248 = null;
            this.field497 = null;
            this.field489 = null;
            this.field608 = null;
            this.field609 = null;
            this.field494 = null;
            this.field416 = null;
            this.field417 = null;
            this.field418 = null;
            this.field419 = null;
            this.field177 = null;
            this.field178 = null;
            this.field179 = null;
            this.field469 = null;
            this.field470 = null;
            this.field471 = null;
            this.field472 = null;
            this.field473 = null;
            this.field474 = null;
            this.field475 = null;
            this.field476 = null;
            this.field477 = null;
            this.field384 = null;
            this.field385 = null;
            this.field386 = null;
            this.field312 = null;
            this.field313 = null;
            this.field314 = null;
            this.field326 = null;
            this.field602 = null;
            this.field603 = null;
            this.field604 = null;
            this.field605 = null;
            this.field606 = null;
            this.field546 = null;
            this.field547 = null;
            this.field548 = null;
            this.field549 = null;
            this.field550 = null;
            this.field581 = null;
            this.field263 = null;
            this.field421 = null;
            this.field373 = null;
            this.field151 = null;
            this.field517 = null;
            this.field487 = null;
            this.field345 = null;
            this.field346 = null;
            this.field347 = null;
            this.field348 = null;
            this.field349 = null;
            this.field273 = null;
            this.field400 = null;
            this.field496 = null;
            this.field452 = null;
            this.field454 = null;
            this.field456 = null;
            this.field457 = null;
            this.field485 = null;
            this.field363 = null;
            this.field365 = null;
            this.field330 = null;
            this.field215 = null;
            this.field289 = null;
            this.field226 = null;
            this.field588 = null;
            this.field589 = null;
            this.field590 = null;
            this.field591 = null;
            this.field379 = null;
            this.field188 = null;
            this.field257 = null;
            this.field258 = null;
            this.field370 = null;
            this.field543 = null;
            this.field446 = null;
            this.field298 = null;
            this.field322 = null;
            this.field404 = null;
            this.field405 = null;
            this.field401 = null;
            this.field402 = null;
            this.field403 = null;
            this.field406 = null;
            this.field407 = null;
            this.field408 = null;
            this.field409 = null;
            this.method102(true);
            class33.method292((byte) 0);
            class70.method578((byte) 0);
            class21.method239((byte) 0);
            class52.method463((byte) 0);
            class49.field1296 = null;
            class46.field1223 = null;
            class24.field880 = null;
            class14.field656 = null;
            class23.field866 = null;
            class23.field878 = null;
            class69.field1636 = null;
            super.field1243 = null;
            class48.field1267 = null;
            class71.method584((byte) 0);
            class67.method522((byte) 0);
            class45.method406((byte) 0);
            class3.method3((byte) 0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method168(int arg0) {
        if (arg0 != -36407) {
            this.field358 = -1;
        }
        while (true) {
            class35 var2 = this.field270.method267();
            if (var2 == null) {
                return;
            }
            if (var2.field1038 == 0) {
                class45.method408((byte) 5, var2.field1040, var2.field1041);
                if ((this.field270.method273(var2.field1040, (byte) -88) & 98) != 0) {
                    this.field316 = true;
                    if (this.field339 != -1 || this.field518 != -1) {
                        this.field310 = true;
                    }
                }
            }
            if (var2.field1038 == 1 && var2.field1041 != null) {
                class3.method2(250, var2.field1041);
            }
            if (var2.field1038 == 2 && this.field290 == var2.field1040 && var2.field1041 != null) {
                this.method190(var2.field1041, 5, this.field291);
            }
            if (var2.field1038 == 3 && this.field149 == 1) {
                for (int var3 = 0; var3 < this.field224.length; ++var3) {
                    if (this.field599[var3] == var2.field1040) {
                        this.field224[var3] = var2.field1041;
                        if (var2.field1041 == null) {
                            this.field599[var3] = -1;
                        }
                        break;
                    }
                    if (this.field600[var3] == var2.field1040) {
                        this.field577[var3] = var2.field1041;
                        if (var2.field1041 == null) {
                            this.field600[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1038 == 93 && this.field270.method264((byte) 15, var2.field1040)) {
                class9.method27(new class43(var2.field1041, 0), this.field270, this.field169);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method169(int arg0, int arg1) {
        if (arg0 < 5 || arg0 > 5) {
            this.method61();
        }
        class52 var3 = class52.method458(arg1);
        for (int var4 = 0; var4 < var3.field1381.length && var3.field1381[var4] != -1; ++var4) {
            class52 var5 = class52.method458(var3.field1381[var4]);
            if (var5.field1352 == 1) {
                this.method169(this.field205, var5.field1338);
            }
            var5.field1368 = 0;
            var5.field1317 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (super.field1243 == null) {
            this.method102(true);
            this.field401 = null;
            this.field402 = null;
            this.field403 = null;
            this.field404 = null;
            this.field405 = null;
            this.field406 = null;
            this.field407 = null;
            this.field408 = null;
            this.field409 = null;
            this.field419 = null;
            this.field417 = null;
            this.field416 = null;
            if (arg0 != 0) {
                this.field358 = -1;
            }
            this.field418 = null;
            this.field177 = null;
            this.field178 = null;
            this.field179 = null;
            super.field1243 = new class6(503, 765, this.method161(9), false);
            this.field569 = true;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method171(int arg0, int arg1) {
        class61 var3 = this.field330[this.field601][arg0][arg1];
        if (var3 == null) {
            this.field394.method544(this.field601, arg0, arg1);
        } else {
            int var4 = -99999999;
            class30 var5 = null;
            for (class30 var6 = (class30) var3.method510(); var6 != null; var6 = (class30) var3.method512(false)) {
                class21 var11 = class21.method236(var6.field974);
                int var12 = var11.field830;
                if (var11.field829) {
                    var12 = (var6.field973 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method508(var5, -757);
            class30 var7 = null;
            class30 var8 = null;
            for (class30 var9 = (class30) var3.method510(); var9 != null; var9 = (class30) var3.method512(false)) {
                if (var5.field974 != var9.field974 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field974 != var9.field974 && var7.field974 != var9.field974 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field394.method530(var7, this.field601, var5, true, var10, arg0, arg1, var8, this.method57(this.field601, arg0 * 128 + 64, this.field208, arg1 * 128 + 64));
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILRRTTGXYM;I)V")
    public final void method172(int arg0, int arg1, int arg2, class52 arg3, int arg4) {
        if (arg3.field1352 == 0 && arg3.field1381 != null) {
            if (!arg3.field1355 || this.field143 == arg3.field1338 || this.field192 == arg3.field1338 || this.field486 == arg3.field1338) {
                int var6 = class12.field639;
                int var7 = class12.field637;
                int var8 = class12.field640;
                int var9 = class12.field638;
                class12.method199(arg3.field1330 + arg1, arg1, arg4, (byte) 6, arg3.field1371 + arg4);
                int var10 = arg3.field1381.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field1311[var11] + arg4;
                    int var13 = arg3.field1340[var11] + arg1 - arg2;
                    class52 var14 = class52.method458(arg3.field1381[var11]);
                    int var15 = var14.field1337 + var12;
                    int var16 = var14.field1357 + var13;
                    if (var14.field1347 > 0) {
                        this.method67((byte) 5, var14);
                    }
                    if (var14.field1352 == 0) {
                        if (var14.field1312 > var14.field1359 - var14.field1330) {
                            var14.field1312 = var14.field1359 - var14.field1330;
                        }
                        if (var14.field1312 < 0) {
                            var14.field1312 = 0;
                        }
                        this.method172(0, var16, var14.field1312, var14, var15);
                        if (var14.field1359 > var14.field1330) {
                            this.method188(var14.field1359, var14.field1330, var16, var14.field1371 + var15, var14.field1312, true);
                        }
                    } else if (var14.field1352 != 1) {
                        if (var14.field1352 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1330; ++var18) {
                                for (int var19 = 0; var19 < var14.field1371; ++var19) {
                                    int var20 = (var14.field1336 + 32) * var19 + var15;
                                    int var21 = (var14.field1375 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1322[var17];
                                        var21 += var14.field1326[var17];
                                    }
                                    if (var14.field1356[var17] <= 0) {
                                        if (var14.field1353 != null && var17 < 20) {
                                            class58 var30 = var14.field1353[var17];
                                            if (var30 != null) {
                                                var30.method497(var20, var21, 30573);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1356[var17] - 1;
                                        if (var20 > class12.field639 - 32 && var20 < class12.field640 && var21 > class12.field637 - 32 && var21 < class12.field638 || this.field461 != 0 && this.field460 == var17) {
                                            int var25 = 0;
                                            if (this.field395 == 1 && this.field396 == var17 && this.field397 == var14.field1338) {
                                                var25 = 16777215;
                                            }
                                            class58 var26 = class21.method240(-844, var25, var14.field1383[var17], var24);
                                            if (var26 != null) {
                                                if (this.field461 != 0 && this.field460 == var17 && this.field459 == var14.field1338) {
                                                    var22 = super.field1250 - this.field462;
                                                    var23 = super.field1251 - this.field463;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field344 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method499(var20 + var22, var21 + var23, -71, 128);
                                                    if (var21 + var23 < class12.field637 && arg3.field1312 > 0) {
                                                        int var27 = (class12.field637 - var21 - var23) * this.field267 / 3;
                                                        if (var27 > this.field267 * 10) {
                                                            var27 = this.field267 * 10;
                                                        }
                                                        if (var27 > arg3.field1312) {
                                                            var27 = arg3.field1312;
                                                        }
                                                        arg3.field1312 -= var27;
                                                        this.field463 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class12.field638 && arg3.field1312 < arg3.field1359 - arg3.field1330) {
                                                        int var28 = (var21 + var23 + 32 - class12.field638) * this.field267 / 3;
                                                        if (var28 > this.field267 * 10) {
                                                            var28 = this.field267 * 10;
                                                        }
                                                        if (var28 > arg3.field1359 - arg3.field1330 - arg3.field1312) {
                                                            var28 = arg3.field1359 - arg3.field1330 - arg3.field1312;
                                                        }
                                                        arg3.field1312 += var28;
                                                        this.field463 -= var28;
                                                    }
                                                } else if (this.field513 != 0 && this.field512 == var17 && this.field511 == var14.field1338) {
                                                    var26.method499(var20, var21, -71, 128);
                                                } else {
                                                    var26.method497(var20, var21, 30573);
                                                }
                                                if (var26.field1503 == 33 || var14.field1383[var17] != 1) {
                                                    int var29 = var14.field1383[var17];
                                                    this.field520.method13(var20 + 1 + var22, (byte) 1, method182(var29, 0), 0, var21 + 10 + var23);
                                                    this.field520.method13(var20 + var22, (byte) 1, method182(var29, 0), 16776960, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1352 == 3) {
                            boolean var31 = false;
                            if (this.field486 == var14.field1338 || this.field192 == var14.field1338 || this.field143 == var14.field1338) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method83(var14, false)) {
                                var32 = var14.field1372;
                                if (var31 && var14.field1332 != 0) {
                                    var32 = var14.field1332;
                                }
                            } else {
                                var32 = var14.field1334;
                                if (var31 && var14.field1369 != 0) {
                                    var32 = var14.field1369;
                                }
                            }
                            if (var14.field1327 == 0) {
                                if (var14.field1315) {
                                    class12.method202(var32, var15, var14.field1371, 8, var16, var14.field1330);
                                } else {
                                    class12.method203(var16, var14.field1330, var32, var15, true, var14.field1371);
                                }
                            } else if (var14.field1315) {
                                class12.method201(true, var32, var16, var14.field1330, 256 - (var14.field1327 & 255), var15, var14.field1371);
                            } else {
                                class12.method204(0, var14.field1371, 256 - (var14.field1327 & 255), var15, var14.field1330, var16, var32);
                            }
                        } else if (var14.field1352 == 4) {
                            class5 var33 = var14.field1329;
                            String var34 = var14.field1376;
                            boolean var35 = false;
                            if (this.field486 == var14.field1338 || this.field192 == var14.field1338 || this.field143 == var14.field1338) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method83(var14, false)) {
                                var36 = var14.field1372;
                                if (var35 && var14.field1332 != 0) {
                                    var36 = var14.field1332;
                                }
                                if (var14.field1316.length() > 0) {
                                    var34 = var14.field1316;
                                }
                            } else {
                                var36 = var14.field1334;
                                if (var35 && var14.field1369 != 0) {
                                    var36 = var14.field1369;
                                }
                            }
                            if (var14.field1310 == 6 && this.field222) {
                                var34 = "Please wait...";
                                var36 = var14.field1334;
                            }
                            if (class12.field635 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field49 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label389: while (true) {
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
                                                                            break label389;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method86(this.method100(var14, -951, 4), 0) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method86(this.method100(var14, -951, 3), 0) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method86(this.method100(var14, -951, 2), 0) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method86(this.method100(var14, -951, 1), 0) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method86(this.method100(var14, -951, 0), 0) + var34.substring(var38 + 2);
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
                                if (var14.field1361) {
                                    var33.method10(var14.field1371 / 2 + var15, var44, var14.field1339, var37, -72, var36);
                                } else {
                                    var33.method17(var37, true, var15, var36, var44, var14.field1339);
                                }
                                var37 += var33.field49;
                            }
                        } else if (var14.field1352 == 5) {
                            class58 var45;
                            if (this.method83(var14, false)) {
                                var45 = var14.field1373;
                            } else {
                                var45 = var14.field1331;
                            }
                            if (var45 != null) {
                                var45.method497(var15, var16, 30573);
                            }
                        } else if (var14.field1352 == 6) {
                            int var46 = class71.field1700;
                            int var47 = class71.field1701;
                            class71.field1700 = var14.field1371 / 2 + var15;
                            class71.field1701 = var14.field1330 / 2 + var16;
                            int var48 = class71.field1704[var14.field1343] * var14.field1342 >> 16;
                            int var49 = class71.field1705[var14.field1343] * var14.field1342 >> 16;
                            boolean var50 = this.method83(var14, false);
                            int var51;
                            if (var50) {
                                var51 = var14.field1319;
                            } else {
                                var51 = var14.field1318;
                            }
                            class45 var52;
                            if (var51 == -1) {
                                var52 = var14.method466(-1, -1, var50, this.field545);
                            } else {
                                class14 var53 = class14.field656[var51];
                                var52 = var14.method466(var53.field658[var14.field1368], var53.field659[var14.field1368], var50, this.field545);
                            }
                            if (var52 != null) {
                                var52.method430(0, var14.field1344, 0, var14.field1343, 0, var48, var49);
                            }
                            class71.field1700 = var46;
                            class71.field1701 = var47;
                        } else {
                            if (var14.field1352 == 7) {
                                class5 var54 = var14.field1329;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1330; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1371; ++var57) {
                                        if (var14.field1356[var55] > 0) {
                                            class21 var58 = class21.method236(var14.field1356[var55] - 1);
                                            String var59 = var58.field809;
                                            if (var58.field829 || var14.field1383[var55] != 1) {
                                                var59 = var59 + " x" + method178((byte) 2, var14.field1383[var55]);
                                            }
                                            int var60 = (var14.field1336 + 115) * var57 + var15;
                                            int var61 = (var14.field1375 + 12) * var56 + var16;
                                            if (var14.field1361) {
                                                var54.method10(var14.field1371 / 2 + var60, var59, var14.field1339, var61, -72, var14.field1334);
                                            } else {
                                                var54.method17(var61, true, var60, var14.field1334, var59, var14.field1339);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1352 == 8 && (this.field261 == var14.field1338 || this.field195 == var14.field1338 || this.field580 == var14.field1338) && this.field381 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class5 var64 = this.field521;
                                String var65 = var14.field1376;
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
                                    int var74 = var64.method11(var73, false);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field49 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1371 + var15 - 5 - var62;
                                int var67 = var14.field1330 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg3.field1371 + arg4) {
                                    var66 = arg3.field1371 + arg4 - var62;
                                }
                                class12.method202(16777120, var66, var62, 8, var67, var63);
                                class12.method203(var67, var63, 0, var66, true, var62);
                                String var68 = var14.field1376;
                                int var69 = var64.field49 + var67 + 2;
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
                                    var64.method17(var69, true, var66 + 3, 0, var71, false);
                                    var69 += var64.field49 + 1;
                                }
                            }
                        }
                    }
                }
                class12.method199(var9, var7, var6, (byte) 6, var8);
                if (arg0 != 0) {
                    this.field422 = this.field327.method276();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILYIBRLAQY;I)V")
    public final void method173(int arg0, int arg1, int arg2, class70 arg3, int arg4) {
        if (this.field392 < 400) {
            if (arg3.field1659 != null) {
                arg3 = arg3.method576(29839);
            }
            if (arg3 != null) {
                if (arg3.field1655) {
                    String var6 = arg3.field1666;
                    if (this.field225 != arg0) {
                        for (int var7 = 1; var7 > 0; ++var7) {
                        }
                    }
                    if (arg3.field1651 != 0) {
                        var6 = var6 + method122(arg3.field1651, (byte) 9, field331.field1270) + " (level-" + arg3.field1651 + ")";
                    }
                    if (this.field395 == 1) {
                        this.field379[this.field392] = "Use " + this.field399 + " with @yel@" + var6;
                        this.field590[this.field392] = 992;
                        this.field591[this.field392] = arg4;
                        this.field588[this.field392] = arg1;
                        this.field589[this.field392] = arg2;
                        ++this.field392;
                    } else {
                        if (this.field592 == 1) {
                            if ((this.field594 & 2) == 2) {
                                this.field379[this.field392] = this.field595 + " @yel@" + var6;
                                this.field590[this.field392] = 954;
                                this.field591[this.field392] = arg4;
                                this.field588[this.field392] = arg1;
                                this.field589[this.field392] = arg2;
                                ++this.field392;
                                return;
                            }
                        } else {
                            if (arg3.field1685 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg3.field1685[var8] != null && !arg3.field1685[var8].equalsIgnoreCase("attack")) {
                                        this.field379[this.field392] = arg3.field1685[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field590[this.field392] = 597;
                                        }
                                        if (var8 == 1) {
                                            this.field590[this.field392] = 196;
                                        }
                                        if (var8 == 2) {
                                            this.field590[this.field392] = 994;
                                        }
                                        if (var8 == 3) {
                                            this.field590[this.field392] = 773;
                                        }
                                        if (var8 == 4) {
                                            this.field590[this.field392] = 218;
                                        }
                                        this.field591[this.field392] = arg4;
                                        this.field588[this.field392] = arg1;
                                        this.field589[this.field392] = arg2;
                                        ++this.field392;
                                    }
                                }
                            }
                            if (arg3.field1685 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (arg3.field1685[var9] != null && arg3.field1685[var9].equalsIgnoreCase("attack")) {
                                        short var10 = 0;
                                        if (arg3.field1651 > field331.field1270) {
                                            var10 = 2000;
                                        }
                                        this.field379[this.field392] = arg3.field1685[var9] + " @yel@" + var6;
                                        if (var9 == 0) {
                                            this.field590[this.field392] = var10 + 597;
                                        }
                                        if (var9 == 1) {
                                            this.field590[this.field392] = var10 + 196;
                                        }
                                        if (var9 == 2) {
                                            this.field590[this.field392] = var10 + 994;
                                        }
                                        if (var9 == 3) {
                                            this.field590[this.field392] = var10 + 773;
                                        }
                                        if (var9 == 4) {
                                            this.field590[this.field392] = var10 + 218;
                                        }
                                        this.field591[this.field392] = arg4;
                                        this.field588[this.field392] = arg1;
                                        this.field589[this.field392] = arg2;
                                        ++this.field392;
                                    }
                                }
                            }
                            this.field379[this.field392] = "Examine @yel@" + var6;
                            this.field590[this.field392] = 1825;
                            this.field591[this.field392] = arg4;
                            this.field588[this.field392] = arg1;
                            this.field589[this.field392] = arg2;
                            ++this.field392;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method174(int arg0) {
        this.field417.method24(-214);
        if (this.field526 == 2) {
            byte[] var2 = this.field385.field1393;
            int[] var3 = class12.field634;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field581.method501(this.field367, 33, this.field302, 25, 25, 0, 0, this.field137, 33, false, 256);
            this.field418.method24(-214);
            class71.field1706 = this.field244;
        } else {
            int var6 = this.field367 + this.field265 & 2047;
            int var7 = field331.field1453 / 32 + 48;
            int var8 = 464 - field331.field1454 / 32;
            this.field543.method501(var6, 146, this.field183, var8, var7, 5, 25, this.field304, 151, false, this.field318 + 256);
            this.field581.method501(this.field367, 33, this.field302, 25, 25, 0, 0, this.field137, 33, false, 256);
            this.field357 += arg0;
            for (int var9 = 0; var9 < this.field256; ++var9) {
                int var39 = this.field257[var9] * 4 + 2 - field331.field1453 / 32;
                int var40 = this.field258[var9] * 4 + 2 - field331.field1454 / 32;
                this.method145(var40, (byte) 4, this.field370[var9], var39);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class61 var36 = this.field330[this.field601][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field331.field1453 / 32;
                        int var38 = var35 * 4 + 2 - field331.field1454 / 32;
                        this.method145(var38, (byte) 4, this.field345, var37);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field364; ++var11) {
                class42 var31 = this.field363[this.field365[var11]];
                if (var31 != null && var31.method316((byte) 127)) {
                    class70 var32 = var31.field1082;
                    if (var32.field1659 != null) {
                        var32 = var32.method576(29839);
                    }
                    if (var32 != null && var32.field1683 && var32.field1655) {
                        int var33 = var31.field1453 / 32 - field331.field1453 / 32;
                        int var34 = var31.field1454 / 32 - field331.field1454 / 32;
                        this.method145(var34, (byte) 4, this.field346, var33);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field453; ++var12) {
                class48 var23 = this.field452[this.field454[var12]];
                if (var23 != null && var23.method316((byte) 127)) {
                    int var24 = var23.field1453 / 32 - field331.field1453 / 32;
                    int var25 = var23.field1454 / 32 - field331.field1454 / 32;
                    boolean var26 = false;
                    long var27 = class36.method300(var23.field1269);
                    for (int var29 = 0; var29 < this.field156; ++var29) {
                        if (this.field298[var29] == var27 && this.field322[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field331.field1290 != 0 && var23.field1290 != 0 && field331.field1290 == var23.field1290) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method145(var25, (byte) 4, this.field348, var24);
                    } else if (var30) {
                        this.method145(var25, (byte) 4, this.field349, var24);
                    } else {
                        this.method145(var25, (byte) 4, this.field347, var24);
                    }
                }
            }
            if (this.field182 != 0 && field525 % 20 < 10) {
                if (this.field182 == 1 && this.field252 >= 0 && this.field252 < this.field363.length) {
                    class42 var13 = this.field363[this.field252];
                    if (var13 != null) {
                        int var14 = var13.field1453 / 32 - field331.field1453 / 32;
                        int var15 = var13.field1454 / 32 - field331.field1454 / 32;
                        this.method153(this.field159, var15, false, var14);
                    }
                }
                if (this.field182 == 2) {
                    int var16 = (this.field278 - this.field228) * 4 + 2 - field331.field1453 / 32;
                    int var17 = (this.field279 - this.field229) * 4 + 2 - field331.field1454 / 32;
                    this.method153(this.field159, var17, false, var16);
                }
                if (this.field182 == 10 && this.field410 >= 0 && this.field410 < this.field452.length) {
                    class48 var18 = this.field452[this.field410];
                    if (var18 != null) {
                        int var19 = var18.field1453 / 32 - field331.field1453 / 32;
                        int var20 = var18.field1454 / 32 - field331.field1454 / 32;
                        this.method153(this.field159, var20, false, var19);
                    }
                }
            }
            if (this.field541 != 0) {
                int var21 = this.field541 * 4 + 2 - field331.field1453 / 32;
                int var22 = this.field542 * 4 + 2 - field331.field1454 / 32;
                this.method145(var22, (byte) 4, this.field158, var21);
            }
            class12.method202(16777215, 97, 3, 8, 78, 3);
            this.field418.method24(-214);
            class71.field1706 = this.field244;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg5 & 2047;
        this.field357 += arg0;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class45.field1213[var8];
            int var14 = class45.field1214[var8];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class45.field1213[var9];
            int var17 = class45.field1214[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field332 = arg3 - var10;
        this.field333 = arg1 - var11;
        this.field334 = arg2 - var12;
        this.field335 = arg6;
        this.field336 = arg5;
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method176(byte arg0) {
        int var2 = this.field522.method11("Choose Option", false);
        for (int var3 = 0; var3 < this.field392; ++var3) {
            int var11 = this.field522.method11(this.field379[var3], false);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        if (arg0 != -109) {
            this.field358 = -1;
        }
        int var4 = this.field392 * 15 + 21;
        if (super.field1257 > 4 && super.field1258 > 4 && super.field1257 < 516 && super.field1258 < 338) {
            int var5 = super.field1257 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1258 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field337 = true;
            this.field424 = 0;
            this.field425 = var5;
            this.field426 = var6;
            this.field427 = var2;
            this.field428 = this.field392 * 15 + 22;
        }
        if (super.field1257 > 553 && super.field1258 > 205 && super.field1257 < 743 && super.field1258 < 466) {
            int var7 = super.field1257 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1258 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field337 = true;
            this.field424 = 1;
            this.field425 = var7;
            this.field426 = var8;
            this.field427 = var2;
            this.field428 = this.field392 * 15 + 22;
        }
        if (super.field1257 > 17 && super.field1258 > 357 && super.field1257 < 496 && super.field1258 < 453) {
            int var9 = super.field1257 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1258 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field337 = true;
            this.field424 = 2;
            this.field425 = var9;
            this.field426 = var10;
            this.field427 = var2;
            this.field428 = this.field392 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method177(int arg0) {
        if (this.field392 >= 2 || this.field395 != 0 || this.field592 != 0) {
            if (arg0 != -3568) {
                this.method61();
            }
            String var2;
            if (this.field395 == 1 && this.field392 < 2) {
                var2 = "Use " + this.field399 + " with...";
            } else if (this.field592 == 1 && this.field392 < 2) {
                var2 = this.field595 + "...";
            } else {
                var2 = this.field379[this.field392 - 1];
            }
            if (this.field392 > 2) {
                var2 = var2 + "@whi@ / " + (this.field392 - 2) + " more options";
            }
            this.field522.method18(field525 / 1000, -274, 4, true, var2, 15, 16777215);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)Ljava/lang/String;")
    private static final String method178(byte arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 != 2) {
            field483 = 7;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method179(int arg0, long arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this.field465 = !this.field465;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field156; ++var4) {
                if (this.field298[var4] == arg1) {
                    --this.field156;
                    this.field316 = true;
                    for (int var5 = var4; var5 < this.field156; ++var5) {
                        this.field446[var5] = this.field446[var5 + 1];
                        this.field322[var5] = this.field322[var5 + 1];
                        this.field298[var5] = this.field298[var5 + 1];
                    }
                    this.field553.method319(150, false);
                    this.field553.method326(-228, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method180(int arg0) {
        this.field416.method24(-214);
        class71.field1706 = this.field243;
        if (arg0 != 4) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field384.method473(0, 0, 30573);
        if (this.field515 != -1) {
            this.method172(0, 0, 0, class52.method458(this.field515), 0);
        } else if (this.field383[this.field293] != -1) {
            this.method172(0, 0, 0, class52.method458(this.field383[this.field293]), 0);
        }
        if (this.field337 && this.field424 == 1) {
            this.method84(false);
        }
        this.field416.method25(-71, 205, super.field1242, 553);
        this.field418.method24(-214);
        class71.field1706 = this.field244;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method181(byte arg0) {
        if (this.field461 == 0) {
            int var2 = super.field1256;
            if (arg0 != 3) {
                this.field540 = !this.field540;
            }
            if (this.field592 == 1 && super.field1257 >= 516 && super.field1258 >= 160 && super.field1257 <= 765 && super.field1258 <= 205) {
                var2 = 0;
            }
            if (this.field337) {
                if (var2 != 1) {
                    int var3 = super.field1250;
                    int var4 = super.field1251;
                    if (this.field424 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field424 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field424 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field425 - 10 || var3 > this.field427 + this.field425 + 10 || var4 < this.field426 - 10 || var4 > this.field428 + this.field426 + 10) {
                        this.field337 = false;
                        if (this.field424 == 1) {
                            this.field316 = true;
                        }
                        if (this.field424 == 2) {
                            this.field310 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field425;
                    int var6 = this.field426;
                    int var7 = this.field427;
                    int var8 = super.field1257;
                    int var9 = super.field1258;
                    if (this.field424 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field424 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field424 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field392; ++var11) {
                        int var12 = (this.field392 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method125(this.field268, var10);
                    }
                    this.field337 = false;
                    if (this.field424 == 1) {
                        this.field316 = true;
                    }
                    if (this.field424 == 2) {
                        this.field310 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field392 > 0) {
                    int var13 = this.field590[this.field392 - 1];
                    if (var13 == 849 || var13 == 92 || var13 == 204 || var13 == 357 || var13 == 371 || var13 == 99 || var13 == 600 || var13 == 300 || var13 == 194 || var13 == 840 || var13 == 901 || var13 == 1630) {
                        int var14 = this.field588[this.field392 - 1];
                        int var15 = this.field589[this.field392 - 1];
                        class52 var16 = class52.method458(var15);
                        if (var16.field1379 || var16.field1313) {
                            this.field213 = false;
                            this.field344 = 0;
                            this.field459 = var15;
                            this.field460 = var14;
                            this.field461 = 2;
                            this.field462 = super.field1257;
                            this.field463 = super.field1258;
                            if (class52.method458(var15).field1321 == this.field375) {
                                this.field461 = 1;
                            }
                            if (class52.method458(var15).field1321 == this.field339) {
                                this.field461 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field587 == 1 || this.method70(false, this.field392 - 1)) && this.field392 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field392 > 0) {
                    this.method125(this.field268, this.field392 - 1);
                }
                if (var2 != 2 || this.field392 <= 0) {
                    return;
                }
                this.method176((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method182(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLQGDSNXKJ;II)V")
    public final void method183(int arg0, byte arg1, class48 arg2, int arg3, int arg4) {
        if (field331 != arg2) {
            if (this.field392 < 400) {
                String var6;
                if (arg2.field1293 == 0) {
                    var6 = arg2.field1269 + method122(arg2.field1270, (byte) 9, field331.field1270) + " (level-" + arg2.field1270 + ")";
                } else {
                    var6 = arg2.field1269 + " (skill-" + arg2.field1293 + ")";
                }
                if (this.field395 == 1) {
                    this.field379[this.field392] = "Use " + this.field399 + " with @whi@" + var6;
                    this.field590[this.field392] = 517;
                    this.field591[this.field392] = arg3;
                    this.field588[this.field392] = arg0;
                    this.field589[this.field392] = arg4;
                    ++this.field392;
                } else if (this.field592 == 1) {
                    if ((this.field594 & 8) == 8) {
                        this.field379[this.field392] = this.field595 + " @whi@" + var6;
                        this.field590[this.field392] = 537;
                        this.field591[this.field392] = arg3;
                        this.field588[this.field392] = arg0;
                        this.field589[this.field392] = arg4;
                        ++this.field392;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field574[var7] != null) {
                            this.field379[this.field392] = this.field574[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field574[var7].equalsIgnoreCase("attack")) {
                                if (arg2.field1270 > field331.field1270) {
                                    var9 = 2000;
                                }
                                if (field331.field1290 != 0 && arg2.field1290 != 0) {
                                    if (field331.field1290 == arg2.field1290) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field575[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field590[this.field392] = var9 + 41;
                            }
                            if (var7 == 1) {
                                this.field590[this.field392] = var9 + 481;
                            }
                            if (var7 == 2) {
                                this.field590[this.field392] = var9 + 771;
                            }
                            if (var7 == 3) {
                                this.field590[this.field392] = var9 + 830;
                            }
                            if (var7 == 4) {
                                this.field590[this.field392] = var9 + 738;
                            }
                            this.field591[this.field392] = arg3;
                            this.field588[this.field392] = arg0;
                            this.field589[this.field392] = arg4;
                            ++this.field392;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field392; ++var8) {
                    if (this.field590[var8] == 124) {
                        this.field379[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg1 != 120) {
                    this.field553.method320(122);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;IILjava/lang/String;)LTXPLZUUI;")
    public final class60 method184(int arg0, int arg1, String arg2, int arg3, int arg4, String arg5) {
        this.field357 += arg4;
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field535[0] != null) {
                var7 = this.field535[0].method515(arg3, this.field465);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field434.reset();
            this.field434.update(var7);
            int var9 = (int) this.field434.getValue();
            if (arg1 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class60(var7, true);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method138("Requesting " + arg2, -460, arg0);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method155(arg5 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class43 var17 = new class43(var16, 0);
                    var17.field1105 = 3;
                    int var18 = var17.method334() + 6;
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
                            this.method138("Loading " + arg2 + " - " + var23 + "%", -460, arg0);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field535[0] != null) {
                            this.field535[0].method516(var7, arg3, -737, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field535[0] = null;
                    }
                    if (var7 != null) {
                        this.field434.reset();
                        this.field434.update(var7);
                        int var24 = (int) this.field434.getValue();
                        if (arg1 != var24) {
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
                            this.method138("Game updated - please reload page", -460, arg0);
                            var26 = 10;
                        } else {
                            this.method138(var12 + " - Retrying in " + var26, -460, arg0);
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
                    this.field150 = !this.field150;
                }
            }
            return new class60(var7, true);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method185(byte arg0) {
        if (this.field461 == 0) {
            this.field379[0] = "Cancel";
            this.field590[0] = 1159;
            this.field392 = 1;
            if (this.field255 != -1) {
                this.field411 = 0;
                this.field155 = 0;
                this.method141(-918, super.field1251, 0, super.field1250, 0, 0, class52.method458(this.field255), 0);
                if (this.field411 != this.field143) {
                    this.field143 = this.field411;
                }
                if (this.field580 != this.field155) {
                    this.field580 = this.field155;
                }
            } else {
                this.method147(false);
                this.field411 = 0;
                this.field155 = 0;
                if (super.field1250 > 4 && super.field1251 > 4 && super.field1250 < 516 && super.field1251 < 338) {
                    if (this.field375 != -1) {
                        this.method141(-918, super.field1251, 0, super.field1250, 0, 4, class52.method458(this.field375), 4);
                    } else {
                        this.method66(0);
                    }
                }
                if (this.field411 != this.field143) {
                    this.field143 = this.field411;
                }
                if (this.field580 != this.field155) {
                    this.field580 = this.field155;
                }
                this.field411 = 0;
                this.field155 = 0;
                if (super.field1250 > 553 && super.field1251 > 205 && super.field1250 < 743 && super.field1251 < 466) {
                    if (this.field515 != -1) {
                        this.method141(-918, super.field1251, 0, super.field1250, 1, 205, class52.method458(this.field515), 553);
                    } else if (this.field383[this.field293] != -1) {
                        this.method141(-918, super.field1251, 0, super.field1250, 1, 205, class52.method458(this.field383[this.field293]), 553);
                    }
                }
                if (this.field411 != this.field192) {
                    this.field316 = true;
                    this.field192 = this.field411;
                }
                if (this.field195 != this.field155) {
                    this.field316 = true;
                    this.field195 = this.field155;
                }
                this.field411 = 0;
                this.field155 = 0;
                if (super.field1250 > 17 && super.field1251 > 357 && super.field1250 < 496 && super.field1251 < 453) {
                    if (this.field339 != -1) {
                        this.method141(-918, super.field1251, 0, super.field1250, 2, 357, class52.method458(this.field339), 17);
                    } else if (this.field518 != -1) {
                        this.method141(-918, super.field1251, 0, super.field1250, 3, 357, class52.method458(this.field518), 17);
                    } else if (super.field1251 < 434 && super.field1250 < 426) {
                        this.method98(0, super.field1251 - 357, super.field1250 - 17);
                    }
                }
                if ((this.field339 != -1 || this.field518 != -1) && this.field486 != this.field411) {
                    this.field310 = true;
                    this.field486 = this.field411;
                }
                if ((this.field339 != -1 || this.field518 != -1) && this.field261 != this.field155) {
                    this.field310 = true;
                    this.field261 = this.field155;
                }
                boolean var2 = false;
                if (arg0 != -10) {
                    this.field553.method320(56);
                }
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field392 - 1; ++var3) {
                        if (this.field590[var3] < 1000 && this.field590[var3 + 1] > 1000) {
                            String var4 = this.field379[var3];
                            this.field379[var3] = this.field379[var3 + 1];
                            this.field379[var3 + 1] = var4;
                            int var5 = this.field590[var3];
                            this.field590[var3] = this.field590[var3 + 1];
                            this.field590[var3 + 1] = var5;
                            int var6 = this.field588[var3];
                            this.field588[var3] = this.field588[var3 + 1];
                            this.field588[var3 + 1] = var6;
                            int var7 = this.field589[var3];
                            this.field589[var3] = this.field589[var3 + 1];
                            this.field589[var3 + 1] = var7;
                            int var8 = this.field591[var3];
                            this.field591[var3] = this.field591[var3 + 1];
                            this.field591[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method186(int arg0) {
        if (arg0 <= 0) {
            this.field422 = -277;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method446(true);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field375 != -1 && this.field375 == this.field329) {
                        if (var2 == 8 && this.field186.length() > 0) {
                            this.field186 = this.field186.substring(0, this.field186.length() - 1);
                        }
                        break;
                    }
                    if (this.field164) {
                        if (var2 >= 32 && var2 <= 122 && this.field429.length() < 80) {
                            this.field429 = this.field429 + (char) var2;
                            this.field310 = true;
                        }
                        if (var2 == 8 && this.field429.length() > 0) {
                            this.field429 = this.field429.substring(0, this.field429.length() - 1);
                            this.field310 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field164 = false;
                            this.field310 = true;
                            if (this.field508 == 1) {
                                long var3 = class36.method300(this.field429);
                                this.method119(-46843, var3);
                            }
                            if (this.field508 == 2 && this.field156 > 0) {
                                long var5 = class36.method300(this.field429);
                                this.method179(8, var5);
                            }
                            if (this.field508 == 3 && this.field429.length() > 0) {
                                this.field553.method319(248, false);
                                this.field553.method320(0);
                                int var7 = this.field553.field1105;
                                this.field553.method326(-228, this.field584);
                                class41.method314(this.field429, this.field553, 0);
                                this.field553.method329((byte) 7, this.field553.field1105 - var7);
                                this.field429 = class41.method315(24865, this.field429);
                                this.field429 = class44.method378(24865, this.field429);
                                this.method191(6, class36.method304(-616, class36.method301((byte) 7, this.field584)), this.field429, (byte) -92);
                                if (this.field579 == 2) {
                                    this.field579 = 1;
                                    this.field583 = true;
                                    this.field553.method319(112, false);
                                    this.field553.method320(this.field536);
                                    this.field553.method320(this.field579);
                                    this.field553.method320(this.field412);
                                }
                            }
                            if (this.field508 == 4 && this.field163 < 100) {
                                long var8 = class36.method300(this.field429);
                                this.method126(var8, -29826);
                            }
                            if (this.field508 == 5 && this.field163 > 0) {
                                long var10 = class36.method300(this.field429);
                                this.method159(var10, this.field176);
                            }
                        }
                    } else if (this.field250 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field320.length() < 10) {
                            this.field320 = this.field320 + (char) var2;
                            this.field310 = true;
                        }
                        if (var2 == 8 && this.field320.length() > 0) {
                            this.field320 = this.field320.substring(0, this.field320.length() - 1);
                            this.field310 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field320.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field320);
                                } catch (Exception var22) {
                                }
                                this.field553.method319(1, false);
                                this.field553.method324(var12);
                            }
                            this.field250 = 0;
                            this.field310 = true;
                        }
                    } else if (this.field250 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field320.length() < 12) {
                            this.field320 = this.field320 + (char) var2;
                            this.field310 = true;
                        }
                        if (var2 == 8 && this.field320.length() > 0) {
                            this.field320 = this.field320.substring(0, this.field320.length() - 1);
                            this.field310 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field320.length() > 0) {
                                this.field553.method319(197, false);
                                this.field553.method326(-228, class36.method300(this.field320));
                            }
                            this.field250 = 0;
                            this.field310 = true;
                        }
                    } else if (this.field339 == -1 && this.field255 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field297.length() < 80) {
                            this.field297 = this.field297 + (char) var2;
                            this.field310 = true;
                        }
                        if (var2 == 8 && this.field297.length() > 0) {
                            this.field297 = this.field297.substring(0, this.field297.length() - 1);
                            this.field310 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field297.length() > 0) {
                            if (this.field493 == 2) {
                                if (this.field297.equals("::clientdrop")) {
                                    this.method146(70);
                                }
                                if (this.field297.equals("::lag")) {
                                    this.method160(7);
                                }
                                if (this.field297.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field270.method262(2, 163); ++var13) {
                                        this.field270.method275(-13858, (byte) 1, var13, 2);
                                    }
                                }
                                if (this.field297.equals("::fpson")) {
                                    field206 = true;
                                }
                                if (this.field297.equals("::fpsoff")) {
                                    field206 = false;
                                }
                                if (this.field297.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field248[var14].field1483[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field297.startsWith("::")) {
                                this.field553.method319(109, false);
                                this.field553.method320(this.field297.length() - 1);
                                this.field553.method327(this.field297.substring(2));
                            } else {
                                String var17 = this.field297.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field297 = this.field297.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field297 = this.field297.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field297 = this.field297.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field297 = this.field297.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field297 = this.field297.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field297 = this.field297.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field297 = this.field297.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field297 = this.field297.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field297 = this.field297.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field297 = this.field297.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field297 = this.field297.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field297 = this.field297.substring(6);
                                }
                                String var19 = this.field297.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field297 = this.field297.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field297 = this.field297.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field297 = this.field297.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field297 = this.field297.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field297 = this.field297.substring(6);
                                }
                                this.field553.method319(33, false);
                                this.field553.method320(0);
                                int var21 = this.field553.field1105;
                                this.field553.method348(8, var18);
                                this.field362.field1105 = 0;
                                class41.method314(this.field297, this.field362, 0);
                                this.field553.method367(-37496, this.field362.field1104, this.field362.field1105, 0);
                                this.field553.method320(var20);
                                this.field553.method329((byte) 7, this.field553.field1105 - var21);
                                this.field297 = class41.method315(24865, this.field297);
                                this.field297 = class44.method378(24865, this.field297);
                                field331.field1459 = this.field297;
                                field331.field1435 = var18;
                                field331.field1418 = var20;
                                field331.field1433 = 150;
                                if (this.field493 == 2) {
                                    this.method191(2, "@cr2@" + field331.field1269, field331.field1459, (byte) -92);
                                } else if (this.field493 == 1) {
                                    this.method191(2, "@cr1@" + field331.field1269, field331.field1459, (byte) -92);
                                } else {
                                    this.method191(2, field331.field1269, field331.field1459, (byte) -92);
                                }
                                if (this.field536 == 2) {
                                    this.field536 = 3;
                                    this.field583 = true;
                                    this.field553.method319(112, false);
                                    this.field553.method320(this.field536);
                                    this.field553.method320(this.field579);
                                    this.field553.method320(this.field412);
                                }
                            }
                            this.field297 = "";
                            this.field310 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field186.length() < 12) {
                this.field186 = this.field186 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILPKHWFJLM;I)V")
    private final void method187(int arg0, class43 arg1, int arg2) {
        int var4 = 57 / arg2;
        while (arg1.field1106 + 10 < arg0 * 8) {
            int var5 = arg1.method341((byte) 39, 11);
            if (var5 == 2047) {
                break;
            }
            if (this.field452[var5] == null) {
                this.field452[var5] = new class48();
                if (this.field457[var5] != null) {
                    this.field452[var5].method447((byte) 5, this.field457[var5]);
                }
            }
            this.field454[this.field453++] = var5;
            class48 var6 = this.field452[var5];
            var6.field1447 = field525;
            int var7 = arg1.method341((byte) 39, 1);
            if (var7 == 1) {
                this.field456[this.field455++] = var5;
            }
            int var8 = arg1.method341((byte) 39, 1);
            int var9 = arg1.method341((byte) 39, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg1.method341((byte) 39, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            var6.method476(field331.field1416[0] + var10, field331.field1417[0] + var9, (byte) 0, var8 == 1);
        }
        arg1.method342(-29596);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZ)V")
    public final void method188(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field558.method473(arg3, arg2, 30573);
        this.field559.method473(arg3, arg1 + arg2 - 16, 30573);
        class12.method202(this.field194, arg3, 16, 8, arg2 + 16, arg1 - 32);
        int var7 = (arg1 - 32) * arg1 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg4 / (arg0 - arg1);
        class12.method202(this.field468, arg3, 16, 8, arg2 + 16 + var8, var7);
        class12.method207(this.field415, var7, arg2 + 16 + var8, arg3, (byte) -85);
        class12.method207(this.field415, var7, arg2 + 16 + var8, arg3 + 1, (byte) -85);
        this.field185 &= arg5;
        class12.method205(16, this.field415, (byte) -92, arg3, arg2 + 16 + var8);
        class12.method205(16, this.field415, (byte) -92, arg3, arg2 + 17 + var8);
        class12.method207(this.field596, var7, arg2 + 16 + var8, arg3 + 15, (byte) -85);
        class12.method207(this.field596, var7 - 1, arg2 + 17 + var8, arg3 + 14, (byte) -85);
        class12.method205(16, this.field596, (byte) -92, arg3, arg2 + 15 + var8 + var7);
        class12.method205(15, this.field596, (byte) -92, arg3 + 1, arg2 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method189(int arg0) {
        if (arg0 <= 0) {
            field173 = !field173;
        }
        if (this.field526 == 0) {
            if (super.field1256 == 1) {
                int var2 = super.field1257 - 25 - 550;
                int var3 = super.field1258 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field367 + this.field265 & 2047;
                    int var5 = class71.field1704[var4];
                    int var6 = class71.field1705[var4];
                    int var7 = (this.field318 + 256) * var5 >> 8;
                    int var8 = (this.field318 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field331.field1453 + var9 >> 7;
                    int var12 = field331.field1454 - var10 >> 7;
                    boolean var13 = this.method49(field331.field1417[0], field331.field1416[0], 0, 1, true, 0, 0, 0, 0, var11, 3, var12);
                    if (var13) {
                        this.field553.method320(var2);
                        this.field553.method320(var3);
                        this.field553.method321(this.field367);
                        this.field553.method320(57);
                        this.field553.method320(this.field265);
                        this.field553.method320(this.field318);
                        this.field553.method320(89);
                        this.field553.method321(field331.field1453);
                        this.field553.method321(field331.field1454);
                        this.field553.method320(this.field251);
                        this.field553.method320(63);
                    }
                }
                ++field181;
                if (field181 > 1666) {
                    field181 = 0;
                    this.field553.method319(98, false);
                    this.field553.method320(0);
                    int var14 = this.field553.field1105;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field553.method321(34146);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field553.method321(48042);
                    }
                    this.field553.method320((int) (Math.random() * 256.0D));
                    this.field553.method321((int) (Math.random() * 65536.0D));
                    this.field553.method320(236);
                    this.field553.method321(19247);
                    this.field553.method321(62113);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field553.method320(111);
                    }
                    this.field553.method320(104);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field553.method320(225);
                    }
                    this.field553.method329((byte) 7, this.field553.field1105 - var14);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)V")
    public final void method190(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 != 5) {
            this.method61();
        }
        if (this.field382) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
    public final void method191(int arg0, String arg1, String arg2, byte arg3) {
        if (arg0 == 0 && this.field518 != -1) {
            this.field478 = arg2;
            super.field1256 = 0;
        }
        if (this.field339 == -1) {
            this.field310 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field218[var5] = this.field218[var5 - 1];
            this.field219[var5] = this.field219[var5 - 1];
            this.field220[var5] = this.field220[var5 - 1];
        }
        this.field218[0] = arg0;
        this.field219[0] = arg1;
        this.field220[0] = arg2;
        if (arg3 != -92) {
            this.field358 = this.field153.method330();
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method192(int arg0) {
        if (arg0 != -39049) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = this.field144 * 128 + 64;
        int var4 = this.field145 * 128 + 64;
        int var5 = this.method57(this.field601, var3, this.field208, var4) - this.field146;
        if (this.field332 < var3) {
            this.field332 += (var3 - this.field332) * this.field148 / 1000 + this.field147;
            if (this.field332 > var3) {
                this.field332 = var3;
            }
        }
        if (this.field332 > var3) {
            this.field332 -= (this.field332 - var3) * this.field148 / 1000 + this.field147;
            if (this.field332 < var3) {
                this.field332 = var3;
            }
        }
        if (this.field333 < var5) {
            this.field333 += (var5 - this.field333) * this.field148 / 1000 + this.field147;
            if (this.field333 > var5) {
                this.field333 = var5;
            }
        }
        if (this.field333 > var5) {
            this.field333 -= (this.field333 - var5) * this.field148 / 1000 + this.field147;
            if (this.field333 < var5) {
                this.field333 = var5;
            }
        }
        if (this.field334 < var4) {
            this.field334 += (var4 - this.field334) * this.field148 / 1000 + this.field147;
            if (this.field334 > var4) {
                this.field334 = var4;
            }
        }
        if (this.field334 > var4) {
            this.field334 -= (this.field334 - var4) * this.field148 / 1000 + this.field147;
            if (this.field334 < var4) {
                this.field334 = var4;
            }
        }
        int var6 = this.field527 * 128 + 64;
        int var7 = this.field528 * 128 + 64;
        int var8 = this.method57(this.field601, var6, this.field208, var7) - this.field529;
        int var9 = var6 - this.field332;
        int var10 = var8 - this.field333;
        int var11 = var7 - this.field334;
        int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
        int var13 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 2047;
        int var14 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 2047;
        if (var13 < 128) {
            var13 = 128;
        }
        if (var13 > 383) {
            var13 = 383;
        }
        if (this.field335 < var13) {
            this.field335 += (var13 - this.field335) * this.field531 / 1000 + this.field530;
            if (this.field335 > var13) {
                this.field335 = var13;
            }
        }
        if (this.field335 > var13) {
            this.field335 -= (this.field335 - var13) * this.field531 / 1000 + this.field530;
            if (this.field335 < var13) {
                this.field335 = var13;
            }
        }
        int var15 = var14 - this.field336;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 > 0) {
            this.field336 += this.field531 * var15 / 1000 + this.field530;
            this.field336 &= 2047;
        }
        if (var15 < 0) {
            this.field336 -= -var15 * this.field531 / 1000 + this.field530;
            this.field336 &= 2047;
        }
        int var16 = var14 - this.field336;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            this.field336 = var14;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILPKHWFJLM;I)V")
    private final void method193(int arg0, class43 arg1, int arg2) {
        int var4 = arg1.method341((byte) 39, 8);
        if (var4 < this.field453) {
            for (int var5 = var4; var5 < this.field453; ++var5) {
                this.field485[this.field484++] = this.field454[var5];
            }
        }
        if (var4 > this.field453) {
            signlink.reporterror(this.field141 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field453 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var8 = this.field454[var6];
                class48 var9 = this.field452[var8];
                int var10 = arg1.method341((byte) 39, 1);
                if (var10 == 0) {
                    this.field454[this.field453++] = var8;
                    var9.field1447 = field525;
                } else {
                    int var11 = arg1.method341((byte) 39, 2);
                    if (var11 == 0) {
                        this.field454[this.field453++] = var8;
                        var9.field1447 = field525;
                        this.field456[this.field455++] = var8;
                    } else if (var11 == 1) {
                        this.field454[this.field453++] = var8;
                        var9.field1447 = field525;
                        int var12 = arg1.method341((byte) 39, 3);
                        var9.method478((byte) 109, false, var12);
                        int var13 = arg1.method341((byte) 39, 1);
                        if (var13 == 1) {
                            this.field456[this.field455++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field454[this.field453++] = var8;
                        var9.field1447 = field525;
                        int var14 = arg1.method341((byte) 39, 3);
                        var9.method478((byte) 109, true, var14);
                        int var15 = arg1.method341((byte) 39, 3);
                        var9.method478((byte) 109, true, var15);
                        int var16 = arg1.method341((byte) 39, 1);
                        if (var16 == 1) {
                            this.field456[this.field455++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field485[this.field484++] = var8;
                    }
                }
            }
            int var10000 = arg0 + arg2;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(II)V")
    public final void method194(int arg0, int arg1) {
        if (arg0 < 0) {
            class52.method467(-12, arg1);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field204[var1] = var0 - 1;
            var0 += var0;
        }
        field232 = true;
        field249 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field249[var3] = var2 / 4;
        }
        field300 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field306 = true;
        field389 = 3;
        field483 = -166;
        field509 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field533 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field562 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field563 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field614 = 10;
        field616 = true;
    }
}
